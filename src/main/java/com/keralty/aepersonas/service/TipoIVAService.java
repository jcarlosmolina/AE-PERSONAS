package com.keralty.aepersonas.service;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.TipoIVAConstants;
import com.keralty.aepersonas.persistence.oid.TipoIVAOid;
import com.keralty.aepersonas.persistence.TipoIVA;
import com.keralty.aepersonas.repository.TipoIVAJpaRepository;
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
public class TipoIVAService extends AbstractService {

    TipoIVAJpaRepository repository;

    TipoIVAService tipoIVASrv;

    @Inject
    public TipoIVAService(
            TipoIVAService tipoIVASrv,
            TipoIVAJpaRepository repository) {
        this.tipoIVASrv = tipoIVASrv;
        this.repository = repository;
    }


    /*
     * Returns an instance of TipoIVA by ID
     *
     * @param tipoIVACodigo Identification field tipoIVACodigo
     *
     * @return Instance of TipoIVA
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public TipoIVA getById(Long tipoIVACodigo) {
        return getByOID(new TipoIVAOid(tipoIVACodigo));
    }
    
    /*
     * Returns an instance of TipoIVA by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of TipoIVA
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public TipoIVA getByOID(TipoIVAOid oid) {
        Optional<TipoIVA> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of TipoIVA by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of TipoIVA
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public TipoIVA getByOIDWithHV(TipoIVAOid oid) {
        Optional<TipoIVA> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<TipoIVA> getInstanceByOid(TipoIVAOid oid) {
        return oid != null && oid.getTipoIVACodigo() != null
               ? repository.findById(oid.getTipoIVACodigo())
               : Optional.empty();
    }

    /*
     * Returns an instance of TipoIVA by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of TipoIVA
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public TipoIVA getByJsonOid(String jsonOid) {
        TipoIVAOid oid = new TipoIVAOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }


    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            TipoIVAOid oid = new TipoIVAOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(TipoIVAConstants.ATTR_FIELD_TIPOIVACODIGO, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getTipoIVACodigo(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(TipoIVAService.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

}
