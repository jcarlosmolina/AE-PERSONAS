package com.keralty.aepersonas.service;

import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.ValorConstants;
import com.keralty.aepersonas.persistence.oid.ValorOid;
import com.keralty.aepersonas.persistence.Valor;
import com.keralty.aepersonas.repository.ValorJpaRepository;
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
public class ValorService extends AbstractService {

    ValorJpaRepository repository;

    ValorService valorSrv;

    @Inject
    public ValorService(
            ValorService valorSrv,
            ValorJpaRepository repository) {
        this.valorSrv = valorSrv;
        this.repository = repository;
    }


    /*
     * Returns an instance of Valor by ID
     *
     * @param valorIdentificador Identification field valorIdentificador
     *
     * @return Instance of Valor
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Valor getById(Long valorIdentificador) {
        return getByOID(new ValorOid(valorIdentificador));
    }
    
    /*
     * Returns an instance of Valor by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Valor
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Valor getByOID(ValorOid oid) {
        Optional<Valor> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of Valor by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Valor
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Valor getByOIDWithHV(ValorOid oid) {
        Optional<Valor> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<Valor> getInstanceByOid(ValorOid oid) {
        return oid != null && oid.getValorIdentificador() != null
               ? repository.findById(oid.getValorIdentificador())
               : Optional.empty();
    }

    /*
     * Returns an instance of Valor by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Valor
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public Valor getByJsonOid(String jsonOid) {
        ValorOid oid = new ValorOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }


    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            ValorOid oid = new ValorOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(ValorConstants.ATTR_FIELD_VALORIDENTIFICADOR, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getValorIdentificador(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(ValorService.class).error(e.getMessage());
        }
    }

}
