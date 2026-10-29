package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.DireccionConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.sqlutils.SQLExists;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.TypedQueryBuilder;
import com.keralty.aepersonas.utils.Agent;
import jakarta.inject.Inject;
import java.util.Collection;
import java.util.List;

public class DireccionJpaRepositoryImpl extends AbstractRepository implements DireccionJpaRepositoryCustom {

    @Inject
    public DireccionJpaRepositoryImpl(Agent agent, UserFunctions userFunctionsSrv) {
        super(agent, userFunctionsSrv);
    }

    @Override
    public List<Direccion> executeQuery(String jpqlQuery) {
        return getQueryBuilder().build(jpqlQuery).execute();
    }
    
    @Override
    public List<Direccion> executeQuery(String jpqlQuery, List<SQLParam> params) {
        return getQueryBuilder().build(jpqlQuery).setParameters(params).execute();
    }
    
    public Collection<Direccion> executeQuery(SQLSelect select) {
        return getQueryBuilder().build(select).execute();
    }

    private TypedQueryBuilder<Direccion> getQueryBuilder() {
        return new TypedQueryBuilder<>(em, Direccion.class);
    }

    @Override	
    public List<Direccion> solveQuery(SQLSelect select) {
        return solveQuery(select, 0, 0);
    }

    @Override
    public List<Direccion> solveQuery(SQLSelect select, int pageSize, int pageNumber) {
        return getQueryBuilder().build(select, pageSize, pageNumber).execute();
    }

    // AssocOperator: AssocOperator000
	@Override
    public Boolean assocOperator000(Direccion instance) throws SystemException {
        try {
            // EXIST (Departamento)
            return assocOperator000Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Direccion, Assoc.Operator: AssocOperator000, Method: assocOperator000";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator000
	@Override
    public Boolean assocOperator000Range1 (Direccion instance) throws SystemException {
        SQLExists sql = assocOperator000Range1Query(instance);
        return !new TypedQueryBuilder<Direccion>(em, Direccion.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator000
	@Override
    public SQLExists assocOperator000Range1Query (Direccion instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(DireccionConstants.CLASS_NAME, DireccionConstants.ROLE_NAME_DEPARTAMENTO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Direccion, Assoc.Operator: AssocOperator000, Method: assocOperator000Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator001
	@Override
    public Boolean assocOperator001(Direccion instance) throws SystemException {
        try {
            // EXIST (Departamento)
            return assocOperator001Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Direccion, Assoc.Operator: AssocOperator001, Method: assocOperator001";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator001
	@Override
    public Boolean assocOperator001Range1 (Direccion instance) throws SystemException {
        SQLExists sql = assocOperator001Range1Query(instance);
        return !new TypedQueryBuilder<Direccion>(em, Direccion.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator001
	@Override
    public SQLExists assocOperator001Range1Query (Direccion instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(DireccionConstants.CLASS_NAME, DireccionConstants.ROLE_NAME_DEPARTAMENTO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Direccion, Assoc.Operator: AssocOperator001, Method: assocOperator001Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator003
	@Override
    public Boolean assocOperator003(Direccion instance) throws SystemException {
        try {
            // EXIST (Municipio)
            return assocOperator003Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Direccion, Assoc.Operator: AssocOperator003, Method: assocOperator003";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator003
	@Override
    public Boolean assocOperator003Range1 (Direccion instance) throws SystemException {
        SQLExists sql = assocOperator003Range1Query(instance);
        return !new TypedQueryBuilder<Direccion>(em, Direccion.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator003
	@Override
    public SQLExists assocOperator003Range1Query (Direccion instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(DireccionConstants.CLASS_NAME, DireccionConstants.ROLE_NAME_MUNICIPIO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Direccion, Assoc.Operator: AssocOperator003, Method: assocOperator003Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator004
	@Override
    public Boolean assocOperator004(Direccion instance) throws SystemException {
        try {
            // EXIST (Municipio)
            return assocOperator004Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Direccion, Assoc.Operator: AssocOperator004, Method: assocOperator004";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator004
	@Override
    public Boolean assocOperator004Range1 (Direccion instance) throws SystemException {
        SQLExists sql = assocOperator004Range1Query(instance);
        return !new TypedQueryBuilder<Direccion>(em, Direccion.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator004
	@Override
    public SQLExists assocOperator004Range1Query (Direccion instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(DireccionConstants.CLASS_NAME, DireccionConstants.ROLE_NAME_MUNICIPIO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Direccion, Assoc.Operator: AssocOperator004, Method: assocOperator004Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator006
	@Override
    public Boolean assocOperator006(Direccion instance) throws SystemException {
        try {
            // EXIST (Pais)
            return assocOperator006Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Direccion, Assoc.Operator: AssocOperator006, Method: assocOperator006";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator006
	@Override
    public Boolean assocOperator006Range1 (Direccion instance) throws SystemException {
        SQLExists sql = assocOperator006Range1Query(instance);
        return !new TypedQueryBuilder<Direccion>(em, Direccion.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator006
	@Override
    public SQLExists assocOperator006Range1Query (Direccion instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(DireccionConstants.CLASS_NAME, DireccionConstants.ROLE_NAME_PAIS, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Direccion, Assoc.Operator: AssocOperator006, Method: assocOperator006Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator007
	@Override
    public Boolean assocOperator007(Direccion instance) throws SystemException {
        try {
            // EXIST (Pais)
            return assocOperator007Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Direccion, Assoc.Operator: AssocOperator007, Method: assocOperator007";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator007
	@Override
    public Boolean assocOperator007Range1 (Direccion instance) throws SystemException {
        SQLExists sql = assocOperator007Range1Query(instance);
        return !new TypedQueryBuilder<Direccion>(em, Direccion.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator007
	@Override
    public SQLExists assocOperator007Range1Query (Direccion instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(DireccionConstants.CLASS_NAME, DireccionConstants.ROLE_NAME_PAIS, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Direccion, Assoc.Operator: AssocOperator007, Method: assocOperator007Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator009
	@Override
    public Boolean assocOperator009(Direccion instance) throws SystemException {
        try {
            // EXIST (TipoDireccion)
            return assocOperator009Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Direccion, Assoc.Operator: AssocOperator009, Method: assocOperator009";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator009
	@Override
    public Boolean assocOperator009Range1 (Direccion instance) throws SystemException {
        SQLExists sql = assocOperator009Range1Query(instance);
        return !new TypedQueryBuilder<Direccion>(em, Direccion.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator009
	@Override
    public SQLExists assocOperator009Range1Query (Direccion instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(DireccionConstants.CLASS_NAME, DireccionConstants.ROLE_NAME_TIPODIRECCION, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Direccion, Assoc.Operator: AssocOperator009, Method: assocOperator009Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator010
	@Override
    public Boolean assocOperator010(Direccion instance) throws SystemException {
        try {
            // EXIST (TipoDireccion)
            return assocOperator010Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Direccion, Assoc.Operator: AssocOperator010, Method: assocOperator010";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator010
	@Override
    public Boolean assocOperator010Range1 (Direccion instance) throws SystemException {
        SQLExists sql = assocOperator010Range1Query(instance);
        return !new TypedQueryBuilder<Direccion>(em, Direccion.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator010
	@Override
    public SQLExists assocOperator010Range1Query (Direccion instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(DireccionConstants.CLASS_NAME, DireccionConstants.ROLE_NAME_TIPODIRECCION, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Direccion, Assoc.Operator: AssocOperator010, Method: assocOperator010Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator012
	@Override
    public Boolean assocOperator012(Direccion instance) throws SystemException {
        try {
            // EXIST (Departamento)
            return assocOperator012Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Direccion, Assoc.Operator: AssocOperator012, Method: assocOperator012";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator012
	@Override
    public Boolean assocOperator012Range1 (Direccion instance) throws SystemException {
        SQLExists sql = assocOperator012Range1Query(instance);
        return !new TypedQueryBuilder<Direccion>(em, Direccion.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator012
	@Override
    public SQLExists assocOperator012Range1Query (Direccion instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(DireccionConstants.CLASS_NAME, DireccionConstants.ROLE_NAME_DEPARTAMENTO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Direccion, Assoc.Operator: AssocOperator012, Method: assocOperator012Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator013
	@Override
    public Boolean assocOperator013(Direccion instance) throws SystemException {
        try {
            // EXIST (Municipio)
            return assocOperator013Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Direccion, Assoc.Operator: AssocOperator013, Method: assocOperator013";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator013
	@Override
    public Boolean assocOperator013Range1 (Direccion instance) throws SystemException {
        SQLExists sql = assocOperator013Range1Query(instance);
        return !new TypedQueryBuilder<Direccion>(em, Direccion.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator013
	@Override
    public SQLExists assocOperator013Range1Query (Direccion instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(DireccionConstants.CLASS_NAME, DireccionConstants.ROLE_NAME_MUNICIPIO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Direccion, Assoc.Operator: AssocOperator013, Method: assocOperator013Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator014
	@Override
    public Boolean assocOperator014(Direccion instance) throws SystemException {
        try {
            // EXIST (Pais)
            return assocOperator014Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Direccion, Assoc.Operator: AssocOperator014, Method: assocOperator014";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator014
	@Override
    public Boolean assocOperator014Range1 (Direccion instance) throws SystemException {
        SQLExists sql = assocOperator014Range1Query(instance);
        return !new TypedQueryBuilder<Direccion>(em, Direccion.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator014
	@Override
    public SQLExists assocOperator014Range1Query (Direccion instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(DireccionConstants.CLASS_NAME, DireccionConstants.ROLE_NAME_PAIS, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Direccion, Assoc.Operator: AssocOperator014, Method: assocOperator014Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator015
	@Override
    public Boolean assocOperator015(Direccion instance) throws SystemException {
        try {
            // EXIST (TipoDireccion)
            return assocOperator015Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Direccion, Assoc.Operator: AssocOperator015, Method: assocOperator015";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator015
	@Override
    public Boolean assocOperator015Range1 (Direccion instance) throws SystemException {
        SQLExists sql = assocOperator015Range1Query(instance);
        return !new TypedQueryBuilder<Direccion>(em, Direccion.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator015
	@Override
    public SQLExists assocOperator015Range1Query (Direccion instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(DireccionConstants.CLASS_NAME, DireccionConstants.ROLE_NAME_TIPODIRECCION, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Direccion, Assoc.Operator: AssocOperator015, Method: assocOperator015Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    @Override
    public void refreshEntity(Object object) {
        super.refreshEntity(object);
    }
}
