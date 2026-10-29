package com.keralty.aepersonas.service;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.ProductosConstants;
import com.keralty.aepersonas.persistence.oid.ProductosOid;
import com.keralty.aepersonas.persistence.Productos;
import com.keralty.aepersonas.repository.ProductosJpaRepository;
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
public class ProductosService extends AbstractService {

    ProductosJpaRepository repository;

    ProductosService productosSrv;

    @Inject
    public ProductosService(
            ProductosService productosSrv,
            ProductosJpaRepository repository) {
        this.productosSrv = productosSrv;
        this.repository = repository;
    }


    /*
     * Returns an instance of Productos by ID
     *
     * @param productosProducto Identification field productosProducto
     *
     * @return Instance of Productos
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Productos getById(Long productosProducto) {
        return getByOID(new ProductosOid(productosProducto));
    }
    
    /*
     * Returns an instance of Productos by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Productos
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public Productos getByOID(ProductosOid oid) {
        Optional<Productos> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of Productos by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Productos
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Productos getByOIDWithHV(ProductosOid oid) {
        Optional<Productos> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<Productos> getInstanceByOid(ProductosOid oid) {
        return oid != null && oid.getProductosProducto() != null
               ? repository.findById(oid.getProductosProducto())
               : Optional.empty();
    }

    /*
     * Returns an instance of Productos by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Productos
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public Productos getByJsonOid(String jsonOid) {
        ProductosOid oid = new ProductosOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }


    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            ProductosOid oid = new ProductosOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(ProductosConstants.ATTR_FIELD_PRODUCTOSPRODUCTO, Constants.Type.INT.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getProductosProducto(), Constants.Type.INT.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(ProductosService.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

}
