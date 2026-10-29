package com.keralty.aepersonas.service;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DetalleTarifaConstants;
import com.keralty.aepersonas.persistence.DetalleTarifa;
import com.keralty.aepersonas.persistence.oid.DetalleTarifaOid;
import com.keralty.aepersonas.repository.DetalleTarifaJpaRepository;
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
public class DetalleTarifaService extends AbstractService {

    DetalleTarifaJpaRepository repository;

    DetalleTarifaService detalleTarifaSrv;

    @Inject
    public DetalleTarifaService(
            DetalleTarifaService detalleTarifaSrv,
            DetalleTarifaJpaRepository repository) {
        this.detalleTarifaSrv = detalleTarifaSrv;
        this.repository = repository;
    }


    /*
     * Returns an instance of DetalleTarifa by ID
     *
     * @param detalleTarifaidDetalleTarifa Identification field detalleTarifaidDetalleTarifa
     *
     * @return Instance of DetalleTarifa
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public DetalleTarifa getById(Long detalleTarifaidDetalleTarifa) {
        return getByOID(new DetalleTarifaOid(detalleTarifaidDetalleTarifa));
    }
    
    /*
     * Returns an instance of DetalleTarifa by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of DetalleTarifa
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public DetalleTarifa getByOID(DetalleTarifaOid oid) {
        Optional<DetalleTarifa> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of DetalleTarifa by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of DetalleTarifa
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public DetalleTarifa getByOIDWithHV(DetalleTarifaOid oid) {
        Optional<DetalleTarifa> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<DetalleTarifa> getInstanceByOid(DetalleTarifaOid oid) {
        return oid != null && oid.getDetalleTarifaidDetalleTarifa() != null
               ? repository.findById(oid.getDetalleTarifaidDetalleTarifa())
               : Optional.empty();
    }

    /*
     * Returns an instance of DetalleTarifa by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of DetalleTarifa
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public DetalleTarifa getByJsonOid(String jsonOid) {
        DetalleTarifaOid oid = new DetalleTarifaOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }


    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            DetalleTarifaOid oid = new DetalleTarifaOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(DetalleTarifaConstants.ATTR_FIELD_DETALLETARIFAIDDETALLETARIFA, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getDetalleTarifaidDetalleTarifa(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(DetalleTarifaService.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

}
