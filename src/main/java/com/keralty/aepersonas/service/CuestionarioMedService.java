package com.keralty.aepersonas.service;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.CuestionarioMedConstants;
import com.keralty.aepersonas.persistence.CuestionarioMed;
import com.keralty.aepersonas.persistence.oid.CuestionarioMedOid;
import com.keralty.aepersonas.repository.CuestionarioMedJpaRepository;
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
public class CuestionarioMedService extends AbstractService {

    CuestionarioMedJpaRepository repository;

    CuestionarioMedService cuestionarioMedSrv;

    @Inject
    public CuestionarioMedService(
            CuestionarioMedService cuestionarioMedSrv,
            CuestionarioMedJpaRepository repository) {
        this.cuestionarioMedSrv = cuestionarioMedSrv;
        this.repository = repository;
    }


    /*
     * Returns an instance of CuestionarioMed by ID
     *
     * @param cuestionarioMedNumero Identification field cuestionarioMedNumero
     *
     * @return Instance of CuestionarioMed
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public CuestionarioMed getById(Long cuestionarioMedNumero) {
        return getByOID(new CuestionarioMedOid(cuestionarioMedNumero));
    }
    
    /*
     * Returns an instance of CuestionarioMed by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of CuestionarioMed
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public CuestionarioMed getByOID(CuestionarioMedOid oid) {
        Optional<CuestionarioMed> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of CuestionarioMed by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of CuestionarioMed
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public CuestionarioMed getByOIDWithHV(CuestionarioMedOid oid) {
        Optional<CuestionarioMed> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<CuestionarioMed> getInstanceByOid(CuestionarioMedOid oid) {
        return oid != null && oid.getCuestionarioMedNumero() != null
               ? repository.findById(oid.getCuestionarioMedNumero())
               : Optional.empty();
    }

    /*
     * Returns an instance of CuestionarioMed by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of CuestionarioMed
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public CuestionarioMed getByJsonOid(String jsonOid) {
        CuestionarioMedOid oid = new CuestionarioMedOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }


    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            CuestionarioMedOid oid = new CuestionarioMedOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(CuestionarioMedConstants.ATTR_FIELD_CUESTIONARIOMEDNUMERO, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getCuestionarioMedNumero(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(CuestionarioMedService.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

}
