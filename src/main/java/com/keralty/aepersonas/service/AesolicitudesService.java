package com.keralty.aepersonas.service;

import com.keralty.aepersonas.global.AesolicitudesConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.persistence.Aesolicitudes;
import com.keralty.aepersonas.persistence.oid.AesolicitudesOid;
import com.keralty.aepersonas.repository.AesolicitudesJpaRepository;
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
public class AesolicitudesService extends AbstractService {

    AesolicitudesJpaRepository repository;

    AesolicitudesService aesolicitudesSrv;

    @Inject
    public AesolicitudesService(
            AesolicitudesService aesolicitudesSrv,
            AesolicitudesJpaRepository repository) {
        this.aesolicitudesSrv = aesolicitudesSrv;
        this.repository = repository;
    }


    /*
     * Returns an instance of Aesolicitudes by ID
     *
     * @param aesolicitudesidsolicitud Identification field aesolicitudesidsolicitud
     *
     * @return Instance of Aesolicitudes
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Aesolicitudes getById(Long aesolicitudesidsolicitud) {
        return getByOID(new AesolicitudesOid(aesolicitudesidsolicitud));
    }
    
    /*
     * Returns an instance of Aesolicitudes by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Aesolicitudes
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Aesolicitudes getByOID(AesolicitudesOid oid) {
        Optional<Aesolicitudes> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of Aesolicitudes by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Aesolicitudes
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Aesolicitudes getByOIDWithHV(AesolicitudesOid oid) {
        Optional<Aesolicitudes> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<Aesolicitudes> getInstanceByOid(AesolicitudesOid oid) {
        return oid != null && oid.getAesolicitudesidsolicitud() != null
               ? repository.findById(oid.getAesolicitudesidsolicitud())
               : Optional.empty();
    }

    /*
     * Returns an instance of Aesolicitudes by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Aesolicitudes
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public Aesolicitudes getByJsonOid(String jsonOid) {
        AesolicitudesOid oid = new AesolicitudesOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }


    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            AesolicitudesOid oid = new AesolicitudesOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(AesolicitudesConstants.ATTR_FIELD_AESOLICITUDESIDSOLICITUD, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getAesolicitudesidsolicitud(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(AesolicitudesService.class).error(e.getMessage());
        }
    }

}
