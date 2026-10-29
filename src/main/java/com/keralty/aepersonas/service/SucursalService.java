package com.keralty.aepersonas.service;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.SucursalConstants;
import com.keralty.aepersonas.persistence.oid.SucursalOid;
import com.keralty.aepersonas.persistence.Sucursal;
import com.keralty.aepersonas.repository.SucursalJpaRepository;
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
public class SucursalService extends AbstractService {

    SucursalJpaRepository repository;

    SucursalService sucursalSrv;

    @Inject
    public SucursalService(
            SucursalService sucursalSrv,
            SucursalJpaRepository repository) {
        this.sucursalSrv = sucursalSrv;
        this.repository = repository;
    }


    /*
     * Returns an instance of Sucursal by ID
     *
     * @param sucursalCodigo Identification field sucursalCodigo
     *
     * @return Instance of Sucursal
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Sucursal getById(Long sucursalCodigo) {
        return getByOID(new SucursalOid(sucursalCodigo));
    }
    
    /*
     * Returns an instance of Sucursal by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Sucursal
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Sucursal getByOID(SucursalOid oid) {
        Optional<Sucursal> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of Sucursal by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Sucursal
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Sucursal getByOIDWithHV(SucursalOid oid) {
        Optional<Sucursal> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<Sucursal> getInstanceByOid(SucursalOid oid) {
        return oid != null && oid.getSucursalCodigo() != null
               ? repository.findById(oid.getSucursalCodigo())
               : Optional.empty();
    }

    /*
     * Returns an instance of Sucursal by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Sucursal
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public Sucursal getByJsonOid(String jsonOid) {
        SucursalOid oid = new SucursalOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }


    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            SucursalOid oid = new SucursalOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(SucursalConstants.ATTR_FIELD_SUCURSALCODIGO, Constants.Type.INT.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getSucursalCodigo(), Constants.Type.INT.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(SucursalService.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

}
