package com.keralty.aepersonas.service;

import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.GrupoAsociadoConstants;
import com.keralty.aepersonas.persistence.GrupoAsociado;
import com.keralty.aepersonas.persistence.oid.GrupoAsociadoOid;
import com.keralty.aepersonas.repository.GrupoAsociadoJpaRepository;
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
public class GrupoAsociadoService extends AbstractService {

    GrupoAsociadoJpaRepository repository;

    GrupoAsociadoService grupoAsociadoSrv;

    @Inject
    public GrupoAsociadoService(
            GrupoAsociadoService grupoAsociadoSrv,
            GrupoAsociadoJpaRepository repository) {
        this.grupoAsociadoSrv = grupoAsociadoSrv;
        this.repository = repository;
    }


    /*
     * Returns an instance of GrupoAsociado by ID
     *
     * @param grupoAsociadoCodigo Identification field grupoAsociadoCodigo
     *
     * @return Instance of GrupoAsociado
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public GrupoAsociado getById(Long grupoAsociadoCodigo) {
        return getByOID(new GrupoAsociadoOid(grupoAsociadoCodigo));
    }
    
    /*
     * Returns an instance of GrupoAsociado by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of GrupoAsociado
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public GrupoAsociado getByOID(GrupoAsociadoOid oid) {
        Optional<GrupoAsociado> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of GrupoAsociado by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of GrupoAsociado
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public GrupoAsociado getByOIDWithHV(GrupoAsociadoOid oid) {
        Optional<GrupoAsociado> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<GrupoAsociado> getInstanceByOid(GrupoAsociadoOid oid) {
        return oid != null && oid.getGrupoAsociadoCodigo() != null
               ? repository.findById(oid.getGrupoAsociadoCodigo())
               : Optional.empty();
    }

    /*
     * Returns an instance of GrupoAsociado by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of GrupoAsociado
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public GrupoAsociado getByJsonOid(String jsonOid) {
        GrupoAsociadoOid oid = new GrupoAsociadoOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }


    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            GrupoAsociadoOid oid = new GrupoAsociadoOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(GrupoAsociadoConstants.ATTR_FIELD_GRUPOASOCIADOCODIGO, Constants.Type.INT.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getGrupoAsociadoCodigo(), Constants.Type.INT.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(GrupoAsociadoService.class).error(e.getMessage());
        }
    }

}
