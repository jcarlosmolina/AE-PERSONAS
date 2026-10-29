package com.keralty.aepersonas.service;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.GrupoAsignacionConstants;
import com.keralty.aepersonas.persistence.GrupoAsignacion;
import com.keralty.aepersonas.persistence.oid.GrupoAsignacionOid;
import com.keralty.aepersonas.repository.GrupoAsignacionJpaRepository;
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
public class GrupoAsignacionService extends AbstractService {

    GrupoAsignacionJpaRepository repository;

    GrupoAsignacionService grupoAsignacionSrv;

    @Inject
    public GrupoAsignacionService(
            GrupoAsignacionService grupoAsignacionSrv,
            GrupoAsignacionJpaRepository repository) {
        this.grupoAsignacionSrv = grupoAsignacionSrv;
        this.repository = repository;
    }


    /*
     * Returns an instance of GrupoAsignacion by ID
     *
     * @param grupoAsignacionId Identification field grupoAsignacionId
     *
     * @return Instance of GrupoAsignacion
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public GrupoAsignacion getById(Long grupoAsignacionId) {
        return getByOID(new GrupoAsignacionOid(grupoAsignacionId));
    }
    
    /*
     * Returns an instance of GrupoAsignacion by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of GrupoAsignacion
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public GrupoAsignacion getByOID(GrupoAsignacionOid oid) {
        Optional<GrupoAsignacion> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of GrupoAsignacion by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of GrupoAsignacion
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public GrupoAsignacion getByOIDWithHV(GrupoAsignacionOid oid) {
        Optional<GrupoAsignacion> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<GrupoAsignacion> getInstanceByOid(GrupoAsignacionOid oid) {
        return oid != null && oid.getGrupoAsignacionId() != null
               ? repository.findById(oid.getGrupoAsignacionId())
               : Optional.empty();
    }

    /*
     * Returns an instance of GrupoAsignacion by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of GrupoAsignacion
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public GrupoAsignacion getByJsonOid(String jsonOid) {
        GrupoAsignacionOid oid = new GrupoAsignacionOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }


    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            GrupoAsignacionOid oid = new GrupoAsignacionOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(GrupoAsignacionConstants.ATTR_FIELD_GRUPOASIGNACIONID, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getGrupoAsignacionId(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(GrupoAsignacionService.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

}
