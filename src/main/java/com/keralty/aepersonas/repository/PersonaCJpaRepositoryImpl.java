package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DireccionCConstants;
import com.keralty.aepersonas.global.DirSucursalCConstants;
import com.keralty.aepersonas.global.PersonaCConstants;
import com.keralty.aepersonas.global.TipoDireccionConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.persistence.DireccionC;
import com.keralty.aepersonas.persistence.DirSucursalC;
import com.keralty.aepersonas.persistence.PersonaC;
import com.keralty.aepersonas.sqlutils.SQLExists;
import com.keralty.aepersonas.sqlutils.SQLGetOne;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLPopulation;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.SQLWhereComparison;
import com.keralty.aepersonas.sqlutils.SQLWhereConjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandLiteral;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandPathAttribute;
import com.keralty.aepersonas.sqlutils.TypedQueryBuilder;
import com.keralty.aepersonas.utils.Agent;
import jakarta.inject.Inject;
import java.util.Collection;
import java.util.List;

public class PersonaCJpaRepositoryImpl extends AbstractRepository implements PersonaCJpaRepositoryCustom {

    @Inject
    public PersonaCJpaRepositoryImpl(Agent agent, UserFunctions userFunctionsSrv) {
        super(agent, userFunctionsSrv);
    }

    @Override
    public List<PersonaC> executeQuery(String jpqlQuery) {
        return getQueryBuilder().build(jpqlQuery).execute();
    }
    
    @Override
    public List<PersonaC> executeQuery(String jpqlQuery, List<SQLParam> params) {
        return getQueryBuilder().build(jpqlQuery).setParameters(params).execute();
    }
    
    public Collection<PersonaC> executeQuery(SQLSelect select) {
        return getQueryBuilder().build(select).execute();
    }

    private TypedQueryBuilder<PersonaC> getQueryBuilder() {
        return new TypedQueryBuilder<>(em, PersonaC.class);
    }

    @Override	
    public List<PersonaC> solveQuery(SQLSelect select) {
        return solveQuery(select, 0, 0);
    }

    @Override
    public List<PersonaC> solveQuery(SQLSelect select, int pageSize, int pageNumber) {
        return getQueryBuilder().build(select, pageSize, pageNumber).execute();
    }

    // AssocOperator: AssocOperator000
	@Override
    public Boolean assocOperator000(PersonaC instance) throws SystemException {
        try {
            // EXIST (DireccionesC) WHERE (DireccionesC.TipoDireccionC.Descripcion LIKE "CORR%")
            return assocOperator000Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: PersonaC, Assoc.Operator: AssocOperator000, Method: assocOperator000";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator000
	@Override
    public Boolean assocOperator000Range1 (PersonaC instance) throws SystemException {
        SQLExists sql = assocOperator000Range1Query(instance);
        return !new TypedQueryBuilder<PersonaC>(em, PersonaC.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator000
	@Override
    public SQLExists assocOperator000Range1Query (PersonaC instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(PersonaCConstants.CLASS_NAME, PersonaCConstants.ROLE_NAME_DIRECCIONESC, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // DireccionesC.TipoDireccionC.Descripcion LIKE "CORR%"
                    // 'like' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("like");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(PersonaCConstants.ROLE_NAME_DIRECCIONESC + "." + DireccionCConstants.ROLE_NAME_TIPODIRECCIONC + "." + TipoDireccionConstants.ATTR_NAME_TIPODIRECCIONDESCRIPCION, Constants.Type.STRING.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral("CORR%", Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: PersonaC, Assoc.Operator: AssocOperator000, Method: assocOperator000Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator001
	@Override
    public String assocOperator001(PersonaC instance) throws SystemException {
        try {
            // GETONE (DireccionesC.DireccionCompleta) WHERE (DireccionesC.TipoDireccionC.Descripcion LIKE "CORR%")
            return assocOperator001Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: PersonaC, Assoc.Operator: AssocOperator001, Method: assocOperator001";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator001
	@Override
    public String assocOperator001Range1 (PersonaC instance) throws SystemException {
        SQLGetOne sql = assocOperator001Range1Query(instance);
        List<String> results = new TypedQueryBuilder<String>(em, String.class).build(sql).execute();
        return !results.isEmpty() ? results.get(0) : null;
    }

    // Range Query 1 for AssocOperator AssocOperator001
	@Override
    public SQLGetOne assocOperator001Range1Query (PersonaC instance) throws SystemException {
        try {
            // The path starts with a role
            SQLGetOne sql = new SQLGetOne(PersonaCConstants.CLASS_NAME, PersonaCConstants.ROLE_NAME_DIRECCIONESC + "." + DireccionCConstants.ATTR_NAME_DIRECCIONCDIRECCIONCOMPLETA, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // DireccionesC.TipoDireccionC.Descripcion LIKE "CORR%"
                    // 'like' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("like");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(PersonaCConstants.ROLE_NAME_DIRECCIONESC + "." + DireccionCConstants.ROLE_NAME_TIPODIRECCIONC + "." + TipoDireccionConstants.ATTR_NAME_TIPODIRECCIONDESCRIPCION, Constants.Type.STRING.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral("CORR%", Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: PersonaC, Assoc.Operator: AssocOperator001, Method: assocOperator001Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator002
	@Override
    public Boolean assocOperator002(PersonaC instance) throws SystemException {
        try {
            // EXIST (DirSucursalesC) WHERE (DirSucursalesC.EsPrincipal = true)
            return assocOperator002Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: PersonaC, Assoc.Operator: AssocOperator002, Method: assocOperator002";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator002
	@Override
    public Boolean assocOperator002Range1 (PersonaC instance) throws SystemException {
        SQLExists sql = assocOperator002Range1Query(instance);
        return !new TypedQueryBuilder<PersonaC>(em, PersonaC.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator002
	@Override
    public SQLExists assocOperator002Range1Query (PersonaC instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(PersonaCConstants.CLASS_NAME, PersonaCConstants.ROLE_NAME_DIRSUCURSALESC, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // DirSucursalesC.EsPrincipal = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(PersonaCConstants.ROLE_NAME_DIRSUCURSALESC + "." + DirSucursalCConstants.ATTR_NAME_DIRSUCURSALCESPRINCIPAL, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: PersonaC, Assoc.Operator: AssocOperator002, Method: assocOperator002Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator003
	@Override
    public String assocOperator003(PersonaC instance) throws SystemException {
        try {
            // GETONE (DirSucursalesC.Direccion) WHERE (DirSucursalesC.EsPrincipal = true)
            return assocOperator003Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: PersonaC, Assoc.Operator: AssocOperator003, Method: assocOperator003";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator003
	@Override
    public String assocOperator003Range1 (PersonaC instance) throws SystemException {
        SQLGetOne sql = assocOperator003Range1Query(instance);
        List<String> results = new TypedQueryBuilder<String>(em, String.class).build(sql).execute();
        return !results.isEmpty() ? results.get(0) : null;
    }

    // Range Query 1 for AssocOperator AssocOperator003
	@Override
    public SQLGetOne assocOperator003Range1Query (PersonaC instance) throws SystemException {
        try {
            // The path starts with a role
            SQLGetOne sql = new SQLGetOne(PersonaCConstants.CLASS_NAME, PersonaCConstants.ROLE_NAME_DIRSUCURSALESC + "." + DirSucursalCConstants.ATTR_NAME_DIRSUCURSALCDIRECCION, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // DirSucursalesC.EsPrincipal = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(PersonaCConstants.ROLE_NAME_DIRSUCURSALESC + "." + DirSucursalCConstants.ATTR_NAME_DIRSUCURSALCESPRINCIPAL, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: PersonaC, Assoc.Operator: AssocOperator003, Method: assocOperator003Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator004
	@Override
    public Boolean assocOperator004(PersonaC instance) throws SystemException {
        try {
            // EXIST (DireccionesC) WHERE (DireccionesC.TipoDireccionC.Descripcion LIKE "CORR%")
            return assocOperator004Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: PersonaC, Assoc.Operator: AssocOperator004, Method: assocOperator004";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator004
	@Override
    public Boolean assocOperator004Range1 (PersonaC instance) throws SystemException {
        SQLExists sql = assocOperator004Range1Query(instance);
        return !new TypedQueryBuilder<PersonaC>(em, PersonaC.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator004
	@Override
    public SQLExists assocOperator004Range1Query (PersonaC instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(PersonaCConstants.CLASS_NAME, PersonaCConstants.ROLE_NAME_DIRECCIONESC, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // DireccionesC.TipoDireccionC.Descripcion LIKE "CORR%"
                    // 'like' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("like");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(PersonaCConstants.ROLE_NAME_DIRECCIONESC + "." + DireccionCConstants.ROLE_NAME_TIPODIRECCIONC + "." + TipoDireccionConstants.ATTR_NAME_TIPODIRECCIONDESCRIPCION, Constants.Type.STRING.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral("CORR%", Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: PersonaC, Assoc.Operator: AssocOperator004, Method: assocOperator004Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator005
	@Override
    public String assocOperator005(PersonaC instance) throws SystemException {
        try {
            // GETONE (DireccionesC.drvCiudad) WHERE (DireccionesC.TipoDireccionC.Descripcion LIKE "CORR%")
            String result = null;
            for(DireccionC item : assocOperator005Range1(instance)){

                if (result == null) result = item.getDireccionCdrvCiudad();
            }
            return result != null ? result : "";
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: PersonaC, Assoc.Operator: AssocOperator005, Method: assocOperator005";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator005
	@Override
    public Collection<DireccionC> assocOperator005Range1 (PersonaC instance) throws SystemException {

        SQLSelect sql = assocOperator005Range1Query(instance);
        return new TypedQueryBuilder<DireccionC>(em, DireccionC.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator005
	@Override
    public SQLPopulation assocOperator005Range1Query (PersonaC instance) throws SystemException {
        try {
            SQLPopulation sql = new SQLPopulation(PersonaCConstants.CLASS_NAME, DireccionCConstants.CLASS_NAME, instance.getOid(), PersonaCConstants.ROLE_NAME_DIRECCIONESC);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // DireccionesC.TipoDireccionC.Descripcion LIKE "CORR%"
                    // 'like' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("like");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(PersonaCConstants.ROLE_NAME_DIRECCIONESC + "." + DireccionCConstants.ROLE_NAME_TIPODIRECCIONC + "." + TipoDireccionConstants.ATTR_NAME_TIPODIRECCIONDESCRIPCION, Constants.Type.STRING.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral("CORR%", Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: PersonaC, Assoc.Operator: AssocOperator005, Method: assocOperator005Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator006
	@Override
    public Boolean assocOperator006(PersonaC instance) throws SystemException {
        try {
            // EXIST (DirSucursalesC) WHERE (DirSucursalesC.EsPrincipal = true)
            return assocOperator006Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: PersonaC, Assoc.Operator: AssocOperator006, Method: assocOperator006";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator006
	@Override
    public Boolean assocOperator006Range1 (PersonaC instance) throws SystemException {
        SQLExists sql = assocOperator006Range1Query(instance);
        return !new TypedQueryBuilder<PersonaC>(em, PersonaC.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator006
	@Override
    public SQLExists assocOperator006Range1Query (PersonaC instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(PersonaCConstants.CLASS_NAME, PersonaCConstants.ROLE_NAME_DIRSUCURSALESC, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // DirSucursalesC.EsPrincipal = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(PersonaCConstants.ROLE_NAME_DIRSUCURSALESC + "." + DirSucursalCConstants.ATTR_NAME_DIRSUCURSALCESPRINCIPAL, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: PersonaC, Assoc.Operator: AssocOperator006, Method: assocOperator006Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator007
	@Override
    public String assocOperator007(PersonaC instance) throws SystemException {
        try {
            // GETONE (DirSucursalesC.drvCiudad) WHERE (DirSucursalesC.EsPrincipal = true)
            String result = null;
            for(DirSucursalC item : assocOperator007Range1(instance)){

                if (result == null) result = item.getDirSucursalCdrvCiudad();
            }
            return result != null ? result : "";
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: PersonaC, Assoc.Operator: AssocOperator007, Method: assocOperator007";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator007
	@Override
    public Collection<DirSucursalC> assocOperator007Range1 (PersonaC instance) throws SystemException {

        SQLSelect sql = assocOperator007Range1Query(instance);
        return new TypedQueryBuilder<DirSucursalC>(em, DirSucursalC.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator007
	@Override
    public SQLPopulation assocOperator007Range1Query (PersonaC instance) throws SystemException {
        try {
            SQLPopulation sql = new SQLPopulation(PersonaCConstants.CLASS_NAME, DirSucursalCConstants.CLASS_NAME, instance.getOid(), PersonaCConstants.ROLE_NAME_DIRSUCURSALESC);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // DirSucursalesC.EsPrincipal = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(PersonaCConstants.ROLE_NAME_DIRSUCURSALESC + "." + DirSucursalCConstants.ATTR_NAME_DIRSUCURSALCESPRINCIPAL, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: PersonaC, Assoc.Operator: AssocOperator007, Method: assocOperator007Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator008
	@Override
    public Boolean assocOperator008(PersonaC instance) throws SystemException {
        try {
            // EXIST (PreexistenciasC)
            return assocOperator008Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: PersonaC, Assoc.Operator: AssocOperator008, Method: assocOperator008";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator008
	@Override
    public Boolean assocOperator008Range1 (PersonaC instance) throws SystemException {
        SQLExists sql = assocOperator008Range1Query(instance);
        return !new TypedQueryBuilder<PersonaC>(em, PersonaC.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator008
	@Override
    public SQLExists assocOperator008Range1Query (PersonaC instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaCConstants.CLASS_NAME, PersonaCConstants.ROLE_NAME_PREEXISTENCIASC, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: PersonaC, Assoc.Operator: AssocOperator008, Method: assocOperator008Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator009
	@Override
    public Boolean assocOperator009(PersonaC instance) throws SystemException {
        try {
            // EXIST (ContratosC)
            return assocOperator009Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: PersonaC, Assoc.Operator: AssocOperator009, Method: assocOperator009";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator009
	@Override
    public Boolean assocOperator009Range1 (PersonaC instance) throws SystemException {
        SQLExists sql = assocOperator009Range1Query(instance);
        return !new TypedQueryBuilder<PersonaC>(em, PersonaC.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator009
	@Override
    public SQLExists assocOperator009Range1Query (PersonaC instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaCConstants.CLASS_NAME, PersonaCConstants.ROLE_NAME_CONTRATOSC, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: PersonaC, Assoc.Operator: AssocOperator009, Method: assocOperator009Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator010
	@Override
    public Boolean assocOperator010(PersonaC instance) throws SystemException {
        try {
            // EXIST (FamiliasC)
            return assocOperator010Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: PersonaC, Assoc.Operator: AssocOperator010, Method: assocOperator010";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator010
	@Override
    public Boolean assocOperator010Range1 (PersonaC instance) throws SystemException {
        SQLExists sql = assocOperator010Range1Query(instance);
        return !new TypedQueryBuilder<PersonaC>(em, PersonaC.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator010
	@Override
    public SQLExists assocOperator010Range1Query (PersonaC instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaCConstants.CLASS_NAME, PersonaCConstants.ROLE_NAME_FAMILIASC, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: PersonaC, Assoc.Operator: AssocOperator010, Method: assocOperator010Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator011
	@Override
    public Boolean assocOperator011(PersonaC instance) throws SystemException {
        try {
            // EXIST (BeneficiariosC)
            return assocOperator011Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: PersonaC, Assoc.Operator: AssocOperator011, Method: assocOperator011";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator011
	@Override
    public Boolean assocOperator011Range1 (PersonaC instance) throws SystemException {
        SQLExists sql = assocOperator011Range1Query(instance);
        return !new TypedQueryBuilder<PersonaC>(em, PersonaC.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator011
	@Override
    public SQLExists assocOperator011Range1Query (PersonaC instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaCConstants.CLASS_NAME, PersonaCConstants.ROLE_NAME_BENEFICIARIOSC, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: PersonaC, Assoc.Operator: AssocOperator011, Method: assocOperator011Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    @Override
    public void refreshEntity(Object object) {
        super.refreshEntity(object);
    }
}
