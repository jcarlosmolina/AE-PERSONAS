package com.keralty.aepersonas.service;

import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.PlantillaReporteConstants;
import com.keralty.aepersonas.persistence.oid.PlantillaReporteOid;
import com.keralty.aepersonas.persistence.PlantillaReporte;
import com.keralty.aepersonas.repository.PlantillaReporteJpaRepository;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.SQLWhereComparison;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandLiteral;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandPathAttribute;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.slf4j.LoggerFactory;

@Transactional
@ApplicationScoped
public class PlantillaReporteService extends AbstractService {

    PlantillaReporteJpaRepository repository;

    PlantillaReporteService plantillaReporteSrv;

    @Inject
    public PlantillaReporteService(
            PlantillaReporteService plantillaReporteSrv,
            PlantillaReporteJpaRepository repository) {
        this.plantillaReporteSrv = plantillaReporteSrv;
        this.repository = repository;
    }


    /*
     * Returns an instance of PlantillaReporte by ID
     *
     * @param plantillaReporteidPlantillaReporte Identification field plantillaReporteidPlantillaReporte
     *
     * @return Instance of PlantillaReporte
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public PlantillaReporte getById(Long plantillaReporteidPlantillaReporte) {
        return getByOID(new PlantillaReporteOid(plantillaReporteidPlantillaReporte));
    }
    
    /*
     * Returns an instance of PlantillaReporte by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of PlantillaReporte
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public PlantillaReporte getByOID(PlantillaReporteOid oid) {
        Optional<PlantillaReporte> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of PlantillaReporte by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of PlantillaReporte
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public PlantillaReporte getByOIDWithHV(PlantillaReporteOid oid) {
        Optional<PlantillaReporte> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<PlantillaReporte> getInstanceByOid(PlantillaReporteOid oid) {
        return oid != null && oid.getPlantillaReporteidPlantillaReporte() != null
               ? repository.findById(oid.getPlantillaReporteidPlantillaReporte())
               : Optional.empty();
    }

    /*
     * Returns an instance of PlantillaReporte by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of PlantillaReporte
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public PlantillaReporte getByJsonOid(String jsonOid) {
        PlantillaReporteOid oid = new PlantillaReporteOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }


    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            PlantillaReporteOid oid = new PlantillaReporteOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(PlantillaReporteConstants.ATTR_FIELD_PLANTILLAREPORTEIDPLANTILLAREPORTE, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getPlantillaReporteidPlantillaReporte(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(PlantillaReporteService.class).error(e.getMessage());
        }
    }

}
