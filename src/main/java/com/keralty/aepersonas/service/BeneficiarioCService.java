package com.keralty.aepersonas.service;

import com.keralty.aepersonas.global.BeneficiarioCConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.ContratoCConstants;
import com.keralty.aepersonas.persistence.BeneficiarioC;
import com.keralty.aepersonas.persistence.oid.BeneficiarioCOid;
import com.keralty.aepersonas.repository.BeneficiarioCJpaRepository;
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
public class BeneficiarioCService extends AbstractService {

    BeneficiarioCJpaRepository repository;

    BeneficiarioCService beneficiarioCSrv;

    @Inject
    public BeneficiarioCService(
            BeneficiarioCService beneficiarioCSrv,
            BeneficiarioCJpaRepository repository) {
        this.beneficiarioCSrv = beneficiarioCSrv;
        this.repository = repository;
    }


    /*
     * Returns an instance of BeneficiarioC by ID
     *
     * @param contratoCContratoCID Identification field contratoCContratoCID
     *
     * @param beneficiarioCID Identification field beneficiarioCID
     *
     * @return Instance of BeneficiarioC
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public BeneficiarioC getById(Long contratoCContratoCID, Long beneficiarioCID) {
        return getByOID(new BeneficiarioCOid(contratoCContratoCID, beneficiarioCID));
    }
    
    /*
     * Returns an instance of BeneficiarioC by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of BeneficiarioC
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public BeneficiarioC getByOID(BeneficiarioCOid oid) {
        Optional<BeneficiarioC> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of BeneficiarioC by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of BeneficiarioC
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public BeneficiarioC getByOIDWithHV(BeneficiarioCOid oid) {
        Optional<BeneficiarioC> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<BeneficiarioC> getInstanceByOid(BeneficiarioCOid oid) {
        return oid != null && oid.getContratoCContratoCID() != null
               ? repository.findById(oid)
               : Optional.empty();
    }

    /*
     * Returns an instance of BeneficiarioC by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of BeneficiarioC
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public BeneficiarioC getByJsonOid(String jsonOid) {
        BeneficiarioCOid oid = new BeneficiarioCOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }


    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            BeneficiarioCOid oid = new BeneficiarioCOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(BeneficiarioCConstants.ROLE_NAME_CONTRATOC + "." + ContratoCConstants.ATTR_FIELD_CONTRATOCID, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getContratoCContratoCID(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
            SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
            comparison2.setOperator("=");
            comparison2.setFirstOperand(new SQLWhereOperandPathAttribute(BeneficiarioCConstants.ATTR_FIELD_BENEFICIARIOCID, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison2.setSecondOperand(new SQLWhereOperandLiteral(oid.getBeneficiarioCID(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison2);
        } catch (Exception e) {
            LoggerFactory.getLogger(BeneficiarioCService.class).error(e.getMessage());
        }
    }

}
