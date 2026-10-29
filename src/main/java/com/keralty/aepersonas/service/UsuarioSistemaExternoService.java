package com.keralty.aepersonas.service;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.UsuarioSistemaExternoConstants;
import com.keralty.aepersonas.persistence.oid.UsuarioSistemaExternoOid;
import com.keralty.aepersonas.persistence.UsuarioSistemaExterno;
import com.keralty.aepersonas.repository.UsuarioSistemaExternoJpaRepository;
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
public class UsuarioSistemaExternoService extends AbstractService {

    UsuarioSistemaExternoJpaRepository repository;

    @Inject
    public UsuarioSistemaExternoService(
            UsuarioSistemaExternoJpaRepository repository) {
        this.repository = repository;
    }


    /*
     * Returns an instance of UsuarioSistemaExterno by ID
     *
     * @param usuarioSistemaExternoLogin Identification field usuarioSistemaExternoLogin
     *
     * @return Instance of UsuarioSistemaExterno
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public UsuarioSistemaExterno getById(String usuarioSistemaExternoLogin) {
        return getByOID(new UsuarioSistemaExternoOid(usuarioSistemaExternoLogin));
    }
    
    /*
     * Returns an instance of UsuarioSistemaExterno by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of UsuarioSistemaExterno
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public UsuarioSistemaExterno getByOID(UsuarioSistemaExternoOid oid) {
        Optional<UsuarioSistemaExterno> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of UsuarioSistemaExterno by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of UsuarioSistemaExterno
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public UsuarioSistemaExterno getByOIDWithHV(UsuarioSistemaExternoOid oid) {
        Optional<UsuarioSistemaExterno> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<UsuarioSistemaExterno> getInstanceByOid(UsuarioSistemaExternoOid oid) {
        return oid != null && oid.getUsuarioSistemaExternoLogin() != null
               ? repository.findById(oid.getUsuarioSistemaExternoLogin())
               : Optional.empty();
    }

    /*
     * Returns an instance of UsuarioSistemaExterno by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of UsuarioSistemaExterno
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public UsuarioSistemaExterno getByJsonOid(String jsonOid) {
        UsuarioSistemaExternoOid oid = new UsuarioSistemaExternoOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }


    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            UsuarioSistemaExternoOid oid = new UsuarioSistemaExternoOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(UsuarioSistemaExternoConstants.ATTR_FIELD_USUARIOSISTEMAEXTERNOLOGIN, Constants.Type.STRING.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getUsuarioSistemaExternoLogin(), Constants.Type.STRING.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(UsuarioSistemaExternoService.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

}
