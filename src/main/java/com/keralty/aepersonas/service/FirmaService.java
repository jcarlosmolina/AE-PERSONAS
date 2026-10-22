package com.keralty.aepersonas.service;

import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.FirmaConstants;
import com.keralty.aepersonas.persistence.Firma;
import com.keralty.aepersonas.persistence.oid.FirmaOid;
import com.keralty.aepersonas.repository.FirmaJpaRepository;
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
public class FirmaService extends AbstractService {

    FirmaJpaRepository repository;

    FirmaService firmaSrv;

    @Inject
    public FirmaService(
            FirmaService firmaSrv,
            FirmaJpaRepository repository) {
        this.firmaSrv = firmaSrv;
        this.repository = repository;
    }


    /*
     * Returns an instance of Firma by ID
     *
     * @param firmaIdentificador Identification field firmaIdentificador
     *
     * @return Instance of Firma
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Firma getById(Long firmaIdentificador) {
        return getByOID(new FirmaOid(firmaIdentificador));
    }
    
    /*
     * Returns an instance of Firma by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Firma
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Firma getByOID(FirmaOid oid) {
        Optional<Firma> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of Firma by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Firma
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Firma getByOIDWithHV(FirmaOid oid) {
        Optional<Firma> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<Firma> getInstanceByOid(FirmaOid oid) {
        return oid != null && oid.getFirmaIdentificador() != null
               ? repository.findById(oid.getFirmaIdentificador())
               : Optional.empty();
    }

    /*
     * Returns an instance of Firma by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Firma
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public Firma getByJsonOid(String jsonOid) {
        FirmaOid oid = new FirmaOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }


    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            FirmaOid oid = new FirmaOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(FirmaConstants.ATTR_FIELD_FIRMAIDENTIFICADOR, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getFirmaIdentificador(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(FirmaService.class).error(e.getMessage());
        }
    }

}
