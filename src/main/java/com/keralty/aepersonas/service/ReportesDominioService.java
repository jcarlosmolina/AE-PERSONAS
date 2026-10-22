package com.keralty.aepersonas.service;

import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DominioConstants;
import com.keralty.aepersonas.global.PlantillaReporteConstants;
import com.keralty.aepersonas.global.ReportesDominioConstants;
import com.keralty.aepersonas.persistence.oid.ReportesDominioOid;
import com.keralty.aepersonas.persistence.ReportesDominio;
import com.keralty.aepersonas.repository.ReportesDominioJpaRepository;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.SQLWhereComparison;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandLiteral;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandPathAttribute;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.sql.Date;
import java.util.Optional;
import org.slf4j.LoggerFactory;

@Transactional
@ApplicationScoped
public class ReportesDominioService extends AbstractService {

    ReportesDominioJpaRepository repository;

    ReportesDominioService reportesDominioSrv;

    @Inject
    public ReportesDominioService(
            ReportesDominioService reportesDominioSrv,
            ReportesDominioJpaRepository repository) {
        this.reportesDominioSrv = reportesDominioSrv;
        this.repository = repository;
    }


    /*
     * Returns an instance of ReportesDominio by ID
     *
     * @param dominioNumero Identification field dominioNumero
     *
     * @param plantillaReporteidPlantillaReporte Identification field plantillaReporteidPlantillaReporte
     *
     * @return Instance of ReportesDominio
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ReportesDominio getById(Long dominioNumero, Long plantillaReporteidPlantillaReporte) {
        return getByOID(new ReportesDominioOid(dominioNumero, plantillaReporteidPlantillaReporte));
    }
    
    /*
     * Returns an instance of ReportesDominio by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of ReportesDominio
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ReportesDominio getByOID(ReportesDominioOid oid) {
        Optional<ReportesDominio> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of ReportesDominio by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of ReportesDominio
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public ReportesDominio getByOIDWithHV(ReportesDominioOid oid) {
        Optional<ReportesDominio> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<ReportesDominio> getInstanceByOid(ReportesDominioOid oid) {
        return oid != null && oid.getDominioNumero() != null
               ? repository.findById(oid)
               : Optional.empty();
    }

    /*
     * Returns an instance of ReportesDominio by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of ReportesDominio
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public ReportesDominio getByJsonOid(String jsonOid) {
        ReportesDominioOid oid = new ReportesDominioOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }


    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            ReportesDominioOid oid = new ReportesDominioOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(ReportesDominioConstants.ROLE_NAME_DOMINIO + "." + DominioConstants.ATTR_FIELD_DOMINIONUMERO, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getDominioNumero(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator("=");
            comparison2.setFirstOperand(new SQLWhereOperandPathAttribute(ReportesDominioConstants.ROLE_NAME_PLANTILLAREPORTE + "." + PlantillaReporteConstants.ATTR_FIELD_PLANTILLAREPORTEIDPLANTILLAREPORTE, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison2.setSecondOperand(new SQLWhereOperandLiteral(oid.getPlantillaReporteidPlantillaReporte(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison2);
        } catch (Exception e) {
            LoggerFactory.getLogger(ReportesDominioService.class).error(e.getMessage());
        }
    }

}
