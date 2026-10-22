package com.keralty.aepersonas.service;

import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.PlantillaEmailConstants;
import com.keralty.aepersonas.persistence.oid.PlantillaEmailOid;
import com.keralty.aepersonas.persistence.PlantillaEmail;
import com.keralty.aepersonas.repository.PlantillaEmailJpaRepository;
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
public class PlantillaEmailService extends AbstractService {

    PlantillaEmailJpaRepository repository;

    PlantillaEmailService plantillaEmailSrv;

    @Inject
    public PlantillaEmailService(
            PlantillaEmailService plantillaEmailSrv,
            PlantillaEmailJpaRepository repository) {
        this.plantillaEmailSrv = plantillaEmailSrv;
        this.repository = repository;
    }


    /*
     * Returns an instance of PlantillaEmail by ID
     *
     * @param plantillaEmailIdPlantilla Identification field plantillaEmailIdPlantilla
     *
     * @return Instance of PlantillaEmail
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public PlantillaEmail getById(Long plantillaEmailIdPlantilla) {
        return getByOID(new PlantillaEmailOid(plantillaEmailIdPlantilla));
    }
    
    /*
     * Returns an instance of PlantillaEmail by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of PlantillaEmail
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public PlantillaEmail getByOID(PlantillaEmailOid oid) {
        Optional<PlantillaEmail> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of PlantillaEmail by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of PlantillaEmail
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public PlantillaEmail getByOIDWithHV(PlantillaEmailOid oid) {
        Optional<PlantillaEmail> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<PlantillaEmail> getInstanceByOid(PlantillaEmailOid oid) {
        return oid != null && oid.getPlantillaEmailIdPlantilla() != null
               ? repository.findById(oid.getPlantillaEmailIdPlantilla())
               : Optional.empty();
    }

    /*
     * Returns an instance of PlantillaEmail by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of PlantillaEmail
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public PlantillaEmail getByJsonOid(String jsonOid) {
        PlantillaEmailOid oid = new PlantillaEmailOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }


    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            PlantillaEmailOid oid = new PlantillaEmailOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(PlantillaEmailConstants.ATTR_FIELD_PLANTILLAEMAILIDPLANTILLA, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getPlantillaEmailIdPlantilla(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(PlantillaEmailService.class).error(e.getMessage());
        }
    }

}
