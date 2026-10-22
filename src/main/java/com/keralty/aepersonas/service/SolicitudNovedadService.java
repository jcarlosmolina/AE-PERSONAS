package com.keralty.aepersonas.service;

import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.SolicitudNovedadConstants;
import com.keralty.aepersonas.persistence.oid.SolicitudNovedadOid;
import com.keralty.aepersonas.persistence.SolicitudNovedad;
import com.keralty.aepersonas.repository.SolicitudNovedadJpaRepository;
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
public class SolicitudNovedadService extends AbstractService {

    SolicitudNovedadJpaRepository repository;

    SolicitudNovedadService solicitudNovedadSrv;

    @Inject
    public SolicitudNovedadService(
            SolicitudNovedadService solicitudNovedadSrv,
            SolicitudNovedadJpaRepository repository) {
        this.solicitudNovedadSrv = solicitudNovedadSrv;
        this.repository = repository;
    }


    /*
     * Returns an instance of SolicitudNovedad by ID
     *
     * @param solicitudNovedadId Identification field solicitudNovedadId
     *
     * @return Instance of SolicitudNovedad
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public SolicitudNovedad getById(Long solicitudNovedadId) {
        return getByOID(new SolicitudNovedadOid(solicitudNovedadId));
    }
    
    /*
     * Returns an instance of SolicitudNovedad by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of SolicitudNovedad
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public SolicitudNovedad getByOID(SolicitudNovedadOid oid) {
        Optional<SolicitudNovedad> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of SolicitudNovedad by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of SolicitudNovedad
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public SolicitudNovedad getByOIDWithHV(SolicitudNovedadOid oid) {
        Optional<SolicitudNovedad> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<SolicitudNovedad> getInstanceByOid(SolicitudNovedadOid oid) {
        return oid != null && oid.getSolicitudNovedadId() != null
               ? repository.findById(oid.getSolicitudNovedadId())
               : Optional.empty();
    }

    /*
     * Returns an instance of SolicitudNovedad by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of SolicitudNovedad
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public SolicitudNovedad getByJsonOid(String jsonOid) {
        SolicitudNovedadOid oid = new SolicitudNovedadOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }


    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            SolicitudNovedadOid oid = new SolicitudNovedadOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(SolicitudNovedadConstants.ATTR_FIELD_SOLICITUDNOVEDADID, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getSolicitudNovedadId(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(SolicitudNovedadService.class).error(e.getMessage());
        }
    }

}
