package com.keralty.aepersonas.service;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DominioConstants;
import com.keralty.aepersonas.persistence.Dominio;
import com.keralty.aepersonas.persistence.oid.DominioOid;
import com.keralty.aepersonas.repository.DominioJpaRepository;
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
public class DominioService extends AbstractService {

    DominioJpaRepository repository;

    DominioService dominioSrv;

    @Inject
    public DominioService(
            DominioService dominioSrv,
            DominioJpaRepository repository) {
        this.dominioSrv = dominioSrv;
        this.repository = repository;
    }


    /*
     * Returns an instance of Dominio by ID
     *
     * @param dominioNumero Identification field dominioNumero
     *
     * @return Instance of Dominio
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Dominio getById(Long dominioNumero) {
        return getByOID(new DominioOid(dominioNumero));
    }
    
    /*
     * Returns an instance of Dominio by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Dominio
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Dominio getByOID(DominioOid oid) {
        Optional<Dominio> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of Dominio by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Dominio
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Dominio getByOIDWithHV(DominioOid oid) {
        Optional<Dominio> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<Dominio> getInstanceByOid(DominioOid oid) {
        return oid != null && oid.getDominioNumero() != null
               ? repository.findById(oid.getDominioNumero())
               : Optional.empty();
    }

    /*
     * Returns an instance of Dominio by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Dominio
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public Dominio getByJsonOid(String jsonOid) {
        DominioOid oid = new DominioOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }


    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            DominioOid oid = new DominioOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(DominioConstants.ATTR_FIELD_DOMINIONUMERO, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getDominioNumero(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(DominioService.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

}
