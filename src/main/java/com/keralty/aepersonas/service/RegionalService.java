package com.keralty.aepersonas.service;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.RegionalConstants;
import com.keralty.aepersonas.persistence.oid.RegionalOid;
import com.keralty.aepersonas.persistence.Regional;
import com.keralty.aepersonas.repository.RegionalJpaRepository;
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
public class RegionalService extends AbstractService {

    RegionalJpaRepository repository;

    RegionalService regionalSrv;

    @Inject
    public RegionalService(
            RegionalService regionalSrv,
            RegionalJpaRepository repository) {
        this.regionalSrv = regionalSrv;
        this.repository = repository;
    }


    /*
     * Returns an instance of Regional by ID
     *
     * @param regionalCodigo Identification field regionalCodigo
     *
     * @return Instance of Regional
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Regional getById(Long regionalCodigo) {
        return getByOID(new RegionalOid(regionalCodigo));
    }
    
    /*
     * Returns an instance of Regional by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Regional
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Regional getByOID(RegionalOid oid) {
        Optional<Regional> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of Regional by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Regional
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Regional getByOIDWithHV(RegionalOid oid) {
        Optional<Regional> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<Regional> getInstanceByOid(RegionalOid oid) {
        return oid != null && oid.getRegionalCodigo() != null
               ? repository.findById(oid.getRegionalCodigo())
               : Optional.empty();
    }

    /*
     * Returns an instance of Regional by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Regional
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public Regional getByJsonOid(String jsonOid) {
        RegionalOid oid = new RegionalOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }


    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            RegionalOid oid = new RegionalOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(RegionalConstants.ATTR_FIELD_REGIONALCODIGO, Constants.Type.INT.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getRegionalCodigo(), Constants.Type.INT.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(RegionalService.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

}
