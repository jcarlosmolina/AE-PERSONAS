package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.MunicipioConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.Usuario;
import com.keralty.aepersonas.sqlutils.SQLExists;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.TypedQueryBuilder;
import com.keralty.aepersonas.utils.Agent;
import jakarta.inject.Inject;
import java.util.Collection;
import java.util.List;

public class MunicipioJpaRepositoryImpl extends AbstractRepository implements MunicipioJpaRepositoryCustom {

    @Inject
    public MunicipioJpaRepositoryImpl(Agent agent, UserFunctions userFunctionsSrv) {
        super(agent, userFunctionsSrv);
    }

    @Override
    public List<Municipio> executeQuery(String jpqlQuery) {
        return getQueryBuilder().build(jpqlQuery).execute();
    }
    
    @Override
    public List<Municipio> executeQuery(String jpqlQuery, List<SQLParam> params) {
        return getQueryBuilder().build(jpqlQuery).setParameters(params).execute();
    }
    
    public Collection<Municipio> executeQuery(SQLSelect select) {
        return getQueryBuilder().build(select).execute();
    }

    private TypedQueryBuilder<Municipio> getQueryBuilder() {
        return new TypedQueryBuilder<>(em, Municipio.class);
    }

    @Override	
    public List<Municipio> solveQuery(SQLSelect select) {
        return solveQuery(select, 0, 0);
    }

    @Override
    public List<Municipio> solveQuery(SQLSelect select, int pageSize, int pageNumber) {
        return getQueryBuilder().build(select, pageSize, pageNumber).execute();
    }

    // AssocOperator: AssocOperator005
	@Override
    public Boolean assocOperator005(Usuario usuarioTMODUSUARIOpthisUsuario) throws SystemException {
        try {
            // EXIST (pthisUsuario.UsuarioPersona)
            return assocOperator005Range1(usuarioTMODUSUARIOpthisUsuario);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Municipio, Assoc.Operator: AssocOperator005, Method: assocOperator005";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator005
	@Override
    public Boolean assocOperator005Range1 (Usuario usuarioTMODUSUARIOpthisUsuario) throws SystemException {
        SQLExists sql = assocOperator005Range1Query(usuarioTMODUSUARIOpthisUsuario, null);
        return !new TypedQueryBuilder<Municipio>(em, Municipio.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator005
	@Override
    public SQLExists assocOperator005Range1Query (Usuario usuarioTMODUSUARIOpthisUsuario, SQLSelect superQuery) throws SystemException {
        try {
            SQLExists sql;
            // The path starts with an object
            if (superQuery != null) {
                sql = new SQLExists(superQuery, MunicipioConstants.CLASS_NAME, UsuarioConstants.ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTHISUSUARIO + "." + UsuarioConstants.ROLE_NAME_USUARIOPERSONA, UsuarioConstants.CLASS_NAME, usuarioTMODUSUARIOpthisUsuario.getOid(), UsuarioConstants.ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTHISUSUARIO);
            } else {
                sql = new SQLExists(MunicipioConstants.CLASS_NAME, UsuarioConstants.ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTHISUSUARIO + "." + UsuarioConstants.ROLE_NAME_USUARIOPERSONA, UsuarioConstants.CLASS_NAME, usuarioTMODUSUARIOpthisUsuario.getOid(), UsuarioConstants.ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTHISUSUARIO);
            }
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Municipio, Assoc.Operator: AssocOperator005, Method: assocOperator005Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    @Override
    public void refreshEntity(Object object) {
        super.refreshEntity(object);
    }
}
