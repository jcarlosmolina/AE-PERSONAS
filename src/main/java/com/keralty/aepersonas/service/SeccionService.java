package com.keralty.aepersonas.service;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.SeccionConstants;
import com.keralty.aepersonas.persistence.oid.SeccionOid;
import com.keralty.aepersonas.persistence.Seccion;
import com.keralty.aepersonas.repository.SeccionJpaRepository;
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
public class SeccionService extends AbstractService {

    SeccionJpaRepository repository;

    SeccionService seccionSrv;

    @Inject
    public SeccionService(
            SeccionService seccionSrv,
            SeccionJpaRepository repository) {
        this.seccionSrv = seccionSrv;
        this.repository = repository;
    }


    /*
     * Returns an instance of Seccion by ID
     *
     * @param seccionIdentificador Identification field seccionIdentificador
     *
     * @return Instance of Seccion
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Seccion getById(Long seccionIdentificador) {
        return getByOID(new SeccionOid(seccionIdentificador));
    }
    
    /*
     * Returns an instance of Seccion by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Seccion
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Seccion getByOID(SeccionOid oid) {
        Optional<Seccion> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of Seccion by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Seccion
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Seccion getByOIDWithHV(SeccionOid oid) {
        Optional<Seccion> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<Seccion> getInstanceByOid(SeccionOid oid) {
        return oid != null && oid.getSeccionIdentificador() != null
               ? repository.findById(oid.getSeccionIdentificador())
               : Optional.empty();
    }

    /*
     * Returns an instance of Seccion by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Seccion
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public Seccion getByJsonOid(String jsonOid) {
        SeccionOid oid = new SeccionOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }


    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            SeccionOid oid = new SeccionOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(SeccionConstants.ATTR_FIELD_SECCIONIDENTIFICADOR, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getSeccionIdentificador(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(SeccionService.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

}
