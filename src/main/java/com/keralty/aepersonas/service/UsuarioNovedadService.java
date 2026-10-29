package com.keralty.aepersonas.service;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.UsuarioNovedadConstants;
import com.keralty.aepersonas.persistence.oid.UsuarioNovedadOid;
import com.keralty.aepersonas.persistence.UsuarioNovedad;
import com.keralty.aepersonas.repository.UsuarioNovedadJpaRepository;
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
public class UsuarioNovedadService extends AbstractService {

    UsuarioNovedadJpaRepository repository;

    UsuarioNovedadService usuarioNovedadSrv;

    @Inject
    public UsuarioNovedadService(
            UsuarioNovedadService usuarioNovedadSrv,
            UsuarioNovedadJpaRepository repository) {
        this.usuarioNovedadSrv = usuarioNovedadSrv;
        this.repository = repository;
    }


    /*
     * Returns an instance of UsuarioNovedad by ID
     *
     * @param usuarioNovedadidUsuarioNovedad Identification field usuarioNovedadidUsuarioNovedad
     *
     * @return Instance of UsuarioNovedad
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public UsuarioNovedad getById(Long usuarioNovedadidUsuarioNovedad) {
        return getByOID(new UsuarioNovedadOid(usuarioNovedadidUsuarioNovedad));
    }
    
    /*
     * Returns an instance of UsuarioNovedad by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of UsuarioNovedad
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public UsuarioNovedad getByOID(UsuarioNovedadOid oid) {
        Optional<UsuarioNovedad> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of UsuarioNovedad by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of UsuarioNovedad
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public UsuarioNovedad getByOIDWithHV(UsuarioNovedadOid oid) {
        Optional<UsuarioNovedad> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<UsuarioNovedad> getInstanceByOid(UsuarioNovedadOid oid) {
        return oid != null && oid.getUsuarioNovedadidUsuarioNovedad() != null
               ? repository.findById(oid.getUsuarioNovedadidUsuarioNovedad())
               : Optional.empty();
    }

    /*
     * Returns an instance of UsuarioNovedad by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of UsuarioNovedad
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public UsuarioNovedad getByJsonOid(String jsonOid) {
        UsuarioNovedadOid oid = new UsuarioNovedadOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }


    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            UsuarioNovedadOid oid = new UsuarioNovedadOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(UsuarioNovedadConstants.ATTR_FIELD_USUARIONOVEDADIDUSUARIONOVEDAD, Constants.Type.AUTONUMERIC.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getUsuarioNovedadidUsuarioNovedad(), Constants.Type.AUTONUMERIC.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(UsuarioNovedadService.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

}
