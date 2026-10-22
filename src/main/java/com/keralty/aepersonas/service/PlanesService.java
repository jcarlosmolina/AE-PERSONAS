package com.keralty.aepersonas.service;

import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.PlanesConstants;
import com.keralty.aepersonas.persistence.oid.PlanesOid;
import com.keralty.aepersonas.persistence.Planes;
import com.keralty.aepersonas.repository.PlanesJpaRepository;
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
public class PlanesService extends AbstractService {

    PlanesJpaRepository repository;

    PlanesService planesSrv;

    @Inject
    public PlanesService(
            PlanesService planesSrv,
            PlanesJpaRepository repository) {
        this.planesSrv = planesSrv;
        this.repository = repository;
    }


    /*
     * Returns an instance of Planes by ID
     *
     * @param planesPlan Identification field planesPlan
     *
     * @return Instance of Planes
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Planes getById(Long planesPlan) {
        return getByOID(new PlanesOid(planesPlan));
    }
    
    /*
     * Returns an instance of Planes by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Planes
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Planes getByOID(PlanesOid oid) {
        Optional<Planes> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of Planes by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Planes
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Planes getByOIDWithHV(PlanesOid oid) {
        Optional<Planes> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<Planes> getInstanceByOid(PlanesOid oid) {
        return oid != null && oid.getPlanesPlan() != null
               ? repository.findById(oid.getPlanesPlan())
               : Optional.empty();
    }

    /*
     * Returns an instance of Planes by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Planes
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public Planes getByJsonOid(String jsonOid) {
        PlanesOid oid = new PlanesOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }


    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            PlanesOid oid = new PlanesOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(PlanesConstants.ATTR_FIELD_PLANESPLAN, Constants.Type.INT.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getPlanesPlan(), Constants.Type.INT.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(PlanesService.class).error(e.getMessage());
        }
    }

}
