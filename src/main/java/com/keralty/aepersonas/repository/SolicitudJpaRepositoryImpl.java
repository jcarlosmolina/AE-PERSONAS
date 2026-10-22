package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.AesolicitudesConstants;
import com.keralty.aepersonas.global.AfiliacionesConstants;
import com.keralty.aepersonas.global.AnexoMatConstants;
import com.keralty.aepersonas.global.AnexoNeoConstants;
import com.keralty.aepersonas.global.AsesorConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.ContratanteConstants;
import com.keralty.aepersonas.global.CuestionarioPConstants;
import com.keralty.aepersonas.global.DetalleTarifaConstants;
import com.keralty.aepersonas.global.DireccionConstants;
import com.keralty.aepersonas.global.DocumentoGConstants;
import com.keralty.aepersonas.global.DominioConstants;
import com.keralty.aepersonas.global.EstadoBeneficiarioConstants;
import com.keralty.aepersonas.global.FuncionarioConstants;
import com.keralty.aepersonas.global.ParentescoConstants;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.global.PlanesConstants;
import com.keralty.aepersonas.global.PlantillaReporteConstants;
import com.keralty.aepersonas.global.PreexistenciaConstants;
import com.keralty.aepersonas.global.ProductosConstants;
import com.keralty.aepersonas.global.ReportesDominioConstants;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.global.STDFunctions;
import com.keralty.aepersonas.global.TarifaConstants;
import com.keralty.aepersonas.global.TipoDireccionConstants;
import com.keralty.aepersonas.global.TipoIdentificacionConstants;
import com.keralty.aepersonas.global.TipoIVAConstants;
import com.keralty.aepersonas.global.TitularConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.global.UsuarioRegConstants;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.ReportesDominio;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import com.keralty.aepersonas.persistence.Usuario;
import com.keralty.aepersonas.persistence.UsuarioReg;
import com.keralty.aepersonas.sqlutils.SQLCount;
import com.keralty.aepersonas.sqlutils.SQLExists;
import com.keralty.aepersonas.sqlutils.SQLGetOne;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLPopulation;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.SQLSum;
import com.keralty.aepersonas.sqlutils.SQLWhereComparison;
import com.keralty.aepersonas.sqlutils.SQLWhereConjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandLiteral;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandNull;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandOVParameter;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandPathAttribute;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandPathInstance;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandSubQuery;
import com.keralty.aepersonas.sqlutils.TypedQueryBuilder;
import com.keralty.aepersonas.utils.Agent;
import com.keralty.aepersonas.utils.Utilities;
import jakarta.inject.Inject;
import java.util.Collection;
import java.util.List;

public class SolicitudJpaRepositoryImpl extends AbstractRepository implements SolicitudJpaRepositoryCustom {

    @Inject
    public SolicitudJpaRepositoryImpl(Agent agent, UserFunctions userFunctionsSrv) {
        super(agent, userFunctionsSrv);
    }

    @Override
    public List<Solicitud> executeQuery(String jpqlQuery) {
        return getQueryBuilder().build(jpqlQuery).execute();
    }
    
    @Override
    public List<Solicitud> executeQuery(String jpqlQuery, List<SQLParam> params) {
        return getQueryBuilder().build(jpqlQuery).setParameters(params).execute();
    }
    
    public Collection<Solicitud> executeQuery(SQLSelect select) {
        return getQueryBuilder().build(select).execute();
    }

    private TypedQueryBuilder<Solicitud> getQueryBuilder() {
        return new TypedQueryBuilder<>(em, Solicitud.class);
    }

    @Override	
    public List<Solicitud> solveQuery(SQLSelect select) {
        return solveQuery(select, 0, 0);
    }

    @Override
    public List<Solicitud> solveQuery(SQLSelect select, int pageSize, int pageNumber) {
        return getQueryBuilder().build(select, pageSize, pageNumber).execute();
    }

    // AssocOperator: AssocOperator000
	@Override
    public Boolean assocOperator000() throws SystemException {
        try {
            // EXIST (UsrAfiliacion) WHERE (UsrAfiliacion = agent)
            return assocOperator000Range1();
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator000, Method: assocOperator000";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 0 for AssocOperator AssocOperator000
	@Override
    public Boolean assocOperator000Range1 () throws SystemException {
        SQLExists sql = assocOperator000Range1Query(null);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 0 for AssocOperator AssocOperator000
	@Override
    public SQLExists assocOperator000Range1Query (SQLSelect superQuery) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(superQuery, SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USRAFILIACION);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // UsrAfiliacion = agent
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_USRAFILIACION, FuncionarioConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(Constants.AGENTKEYWORD, AsesorConstants.CLASS_NAME, AsesorConstants.CLASS_NAME, agent.getAgentInstance().getOid(), Constants.AGENTKEYWORD);
                    comparison1.setSecondOperand(operand223);
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator000, Method: assocOperator000Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator001
	@Override
    public Long assocOperator001() throws SystemException {
        try {
            // COUNT (Aesolicitudes.PlanT.Afiliaciones) WHERE (Aesolicitudes.PlanT.Afiliaciones = agent)
            return assocOperator001Range1();
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator001, Method: assocOperator001";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 0 for AssocOperator AssocOperator001
	@Override
    public Long assocOperator001Range1 () throws SystemException {
        SQLCount sql = assocOperator001Range1Query(null);
        return Long.valueOf(solveCountQuery(sql));
    }

    // Range Query 0 for AssocOperator AssocOperator001
	@Override
    public SQLCount assocOperator001Range1Query (SQLSelect superQuery) throws SystemException {
        try {
            // The path starts with a role
            SQLCount sql = new SQLCount(superQuery, SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_AFILIACIONES);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Aesolicitudes.PlanT.Afiliaciones = agent
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_AFILIACIONES, AfiliacionesConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(Constants.AGENTKEYWORD, AfiliacionesConstants.CLASS_NAME, AfiliacionesConstants.CLASS_NAME, agent.getAgentInstance().getOid(), Constants.AGENTKEYWORD);
                    comparison1.setSecondOperand(operand223);
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator001, Method: assocOperator001Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator002
	@Override
    public Boolean assocOperator002(Solicitud instance) throws SystemException {
        try {
            // EXIST (Aesolicitudes.ProductoT.Dominios) WHERE (Aesolicitudes.ProductoT.Dominios.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.ReqCuesMed = true)
            return assocOperator002Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator002, Method: assocOperator002";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator002
	@Override
    public Boolean assocOperator002Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator002Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator002
	@Override
    public SQLExists assocOperator002Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Aesolicitudes.ProductoT.Dominios.PlanT = Aesolicitudes.PlanT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    if (instance.getAesolicitudes().isNull() || instance.getAesolicitudes().getPlanT().isNull())
                    {
                    comparison1.setSecondOperand(new SQLWhereOperandNull());
                    }
                    else
                    {
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, instance.getAesolicitudes().getPlanT().getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT);
                    comparison1.setSecondOperand(operand223);
                    }
                    conjunction.addOperand(comparison1);


            // Aesolicitudes.ProductoT.Dominios.ReqCuesMed = true
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ATTR_NAME_DOMINIOREQCUESMED, Constants.Type.BOOL.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator002, Method: assocOperator002Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator003
	@Override
    public Boolean assocOperator003(Solicitud instance) throws SystemException {
        try {
            // EXIST (Aesolicitudes.ProductoT.Dominios) WHERE (Aesolicitudes.ProductoT.Dominios.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.ReqCuesMed = true AND (Aesolicitudes.ProductoT.Dominios.NoCuesMedTras = false))
            return assocOperator003Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator003, Method: assocOperator003";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator003
	@Override
    public Boolean assocOperator003Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator003Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator003
	@Override
    public SQLExists assocOperator003Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Aesolicitudes.ProductoT.Dominios.PlanT = Aesolicitudes.PlanT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    if (instance.getAesolicitudes().isNull() || instance.getAesolicitudes().getPlanT().isNull())
                    {
                    comparison1.setSecondOperand(new SQLWhereOperandNull());
                    }
                    else
                    {
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, instance.getAesolicitudes().getPlanT().getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT);
                    comparison1.setSecondOperand(operand223);
                    }
                    conjunction.addOperand(comparison1);


            // Aesolicitudes.ProductoT.Dominios.ReqCuesMed = true
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ATTR_NAME_DOMINIOREQCUESMED, Constants.Type.BOOL.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison2);


            // (Aesolicitudes.ProductoT.Dominios.NoCuesMedTras = false)
                    // '=' Comparison
                    SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
                    comparison3.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ATTR_NAME_DOMINIONOCUESMEDTRAS, Constants.Type.BOOL.getTypeName());
                    comparison3.setFirstOperand(operand114);
                    
                    // Operand 2
                    comparison3.setSecondOperand(new SQLWhereOperandLiteral(Boolean.FALSE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison3);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator003, Method: assocOperator003Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator004
	@Override
    public Boolean assocOperator004(Solicitud instance) throws SystemException {
        try {
            // EXIST (ContratantePersona)
            return assocOperator004Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator004, Method: assocOperator004";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator004
	@Override
    public Boolean assocOperator004Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator004Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator004
	@Override
    public SQLExists assocOperator004Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_CONTRATANTEPERSONA, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator004, Method: assocOperator004Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator005
	@Override
    public Boolean assocOperator005(Solicitud instance) throws SystemException {
        try {
            // EXIST (Contratante)
            return assocOperator005Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator005, Method: assocOperator005";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator005
	@Override
    public Boolean assocOperator005Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator005Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator005
	@Override
    public SQLExists assocOperator005Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_CONTRATANTE, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator005, Method: assocOperator005Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator006
	@Override
    public Boolean assocOperator006(Solicitud instance) throws SystemException {
        try {
            // EXIST (Periodicidad)
            return assocOperator006Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator006, Method: assocOperator006";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator006
	@Override
    public Boolean assocOperator006Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator006Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator006
	@Override
    public SQLExists assocOperator006Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_PERIODICIDAD, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator006, Method: assocOperator006Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator007
	@Override
    public Boolean assocOperator007(Solicitud instance) throws SystemException {
        try {
            // EXIST (Direccion.Municipio)
            return assocOperator007Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator007, Method: assocOperator007";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator007
	@Override
    public Boolean assocOperator007Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator007Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator007
	@Override
    public SQLExists assocOperator007Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_DIRECCION + "." + DireccionConstants.ROLE_NAME_MUNICIPIO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator007, Method: assocOperator007Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator008
	@Override
    public Double assocOperator008(Solicitud instance) throws SystemException {
        try {
            // SUM (Aesolicitudes.PlanT.TiposIVA.Porcentaje) WHERE (Aesolicitudes.PlanT.TiposIVA.FechaInicio <= drvFechaPorcenIVA AND Aesolicitudes.PlanT.TiposIVA.FechaFin >= drvFechaPorcenIVA)
            return assocOperator008Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator008, Method: assocOperator008";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator008
	@Override
    public Double assocOperator008Range1 (Solicitud instance) throws SystemException {
        SQLSum sql = assocOperator008Range1Query(instance);
        return new TypedQueryBuilder<Double>(em, Double.class).build(sql).getSingleResult();
    }

    // Range Query 1 for AssocOperator AssocOperator008
	@Override
    public SQLSum assocOperator008Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLSum sql = new SQLSum(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_TIPOSIVA + "." + TipoIVAConstants.ATTR_NAME_TIPOIVAPORCENTAJE, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Aesolicitudes.PlanT.TiposIVA.FechaInicio <= drvFechaPorcenIVA
                    // '<=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("<=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_TIPOSIVA + "." + TipoIVAConstants.ATTR_NAME_TIPOIVAFECHAINICIO, Constants.Type.DATE.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(instance.getSolicituddrvFechaPorcenIVA(), Constants.Type.DATE.getTypeName()));
                    conjunction.addOperand(comparison1);


            // Aesolicitudes.PlanT.TiposIVA.FechaFin >= drvFechaPorcenIVA
                    // '>=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator(">=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_TIPOSIVA + "." + TipoIVAConstants.ATTR_NAME_TIPOIVAFECHAFIN, Constants.Type.DATE.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(instance.getSolicituddrvFechaPorcenIVA(), Constants.Type.DATE.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator008, Method: assocOperator008Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator009
	@Override
    public Boolean assocOperator009(Solicitud instance) throws SystemException {
        try {
            // FOR ALL Usuarios(Usuarios.drvCuesMedOK = true)
            for(Usuario item : assocOperator009Range1(instance)){
                // Usuarios.drvCuesMedOK = true
                boolean conditionsMet = item.getUsuariodrvCuesMedOK().equals(true);
                if (!conditionsMet) return false;
            }
            return true;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator009, Method: assocOperator009";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator009
	@Override
    public Collection<Usuario> assocOperator009Range1 (Solicitud instance) throws SystemException {

        SQLSelect sql = assocOperator009Range1Query(instance);
        return new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator009
	@Override
    public SQLPopulation assocOperator009Range1Query (Solicitud instance) throws SystemException {
        try {
            return new SQLPopulation(SolicitudConstants.CLASS_NAME, UsuarioConstants.CLASS_NAME, instance.getOid(), SolicitudConstants.ROLE_NAME_USUARIOS);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator009, Method: assocOperator009Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator010
	@Override
    public Boolean assocOperator010(Solicitud instance) throws SystemException {
        try {
            // EXIST (TitularPersona)
            return assocOperator010Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator010, Method: assocOperator010";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator010
	@Override
    public Boolean assocOperator010Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator010Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator010
	@Override
    public SQLExists assocOperator010Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_TITULARPERSONA, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator010, Method: assocOperator010Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator011
	@Override
    public Boolean assocOperator011(Solicitud instance) throws SystemException {
        try {
            // EXIST (Usuarios.Preexistencias)
            return assocOperator011Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator011, Method: assocOperator011";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator011
	@Override
    public Boolean assocOperator011Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator011Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator011
	@Override
    public SQLExists assocOperator011Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_PREEXISTENCIAS, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator011, Method: assocOperator011Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator012
	@Override
    public Boolean assocOperator012(Solicitud instance) throws SystemException {
        try {
            // EXIST (SegundaFirma)
            return assocOperator012Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator012, Method: assocOperator012";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator012
	@Override
    public Boolean assocOperator012Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator012Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator012
	@Override
    public SQLExists assocOperator012Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_SEGUNDAFIRMA, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator012, Method: assocOperator012Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator013
	@Override
    public Boolean assocOperator013(Solicitud instance) throws SystemException {
        try {
            // EXIST (GrupoAsociado)
            return assocOperator013Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator013, Method: assocOperator013";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator013
	@Override
    public Boolean assocOperator013Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator013Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator013
	@Override
    public SQLExists assocOperator013Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_GRUPOASOCIADO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator013, Method: assocOperator013Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator014
	@Override
    public Boolean assocOperator014(Solicitud instance) throws SystemException {
        try {
            // EXIST (Aesolicitudes.ProductoT.Dominios.ReportesDominio) WHERE (Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 1 AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici)
            for(ReportesDominio item : assocOperator014Range1(instance)){
                // Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici
                if(STDFunctions.dateAfterFun(item.getReportesDominiodrvFechaHasta(),instance.getAesolicitudes().getAesolicitudesFesolici()))
                    return true;
            }
            return false;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator014, Method: assocOperator014";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator014
	@Override
    public Collection<ReportesDominio> assocOperator014Range1 (Solicitud instance) throws SystemException {

        SQLSelect sql = assocOperator014Range1Query(instance);
        return new TypedQueryBuilder<ReportesDominio>(em, ReportesDominio.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator014
	@Override
    public SQLPopulation assocOperator014Range1Query (Solicitud instance) throws SystemException {
        try {
            SQLPopulation sql = new SQLPopulation(SolicitudConstants.CLASS_NAME, ReportesDominioConstants.CLASS_NAME, instance.getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_DOMINIO + "." + DominioConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    if (instance.getAesolicitudes().isNull() || instance.getAesolicitudes().getPlanT().isNull())
                    {
                    comparison1.setSecondOperand(new SQLWhereOperandNull());
                    }
                    else
                    {
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, instance.getAesolicitudes().getPlanT().getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT);
                    comparison1.setSecondOperand(operand223);
                    }
                    conjunction.addOperand(comparison1);


            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 1
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_PLANTILLAREPORTE + "." + PlantillaReporteConstants.ATTR_NAME_PLANTILLAREPORTETIPO, Constants.Type.NAT.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(1), Constants.Type.NAT.getTypeName()));
                    conjunction.addOperand(comparison2);


            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici
                    // '<=' Comparison
                    SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
                    comparison3.setOperator("<=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_PLANTILLAREPORTE + "." + PlantillaReporteConstants.ATTR_NAME_PLANTILLAREPORTEFECHAVIGENCIA, Constants.Type.DATE.getTypeName());
                    comparison3.setFirstOperand(operand114);
                    
                    // Operand 2
                    if (instance.getAesolicitudes().getAesolicitudesFesolici()!= null){
                    comparison3.setSecondOperand(new SQLWhereOperandLiteral(instance.getAesolicitudes().getAesolicitudesFesolici(), Constants.Type.DATE.getTypeName()));
                    } else {
                    comparison3.setSecondOperand(new SQLWhereOperandNull());
                    }
                    conjunction.addOperand(comparison3);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator014, Method: assocOperator014Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator015
	@Override
    public Boolean assocOperator015(Solicitud instance) throws SystemException {
        try {
            // EXIST (Usuarios) WHERE (Usuarios.EstadoBeneficiario.EsActivo = true)
            return assocOperator015Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator015, Method: assocOperator015";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator015
	@Override
    public Boolean assocOperator015Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator015Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator015
	@Override
    public SQLExists assocOperator015Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Usuarios.EstadoBeneficiario.EsActivo = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_ESTADOBENEFICIARIO + "." + EstadoBeneficiarioConstants.ATTR_NAME_ESTADOBENEFICIARIOESACTIVO, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator015, Method: assocOperator015Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator016
	@Override
    public Boolean assocOperator016(Solicitud instance) throws SystemException {
        try {
            // EXIST (Aesolicitudes.ProductoT.Dominios.ReportesDominio) WHERE (Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 3 AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici)
            for(ReportesDominio item : assocOperator016Range1(instance)){
                // Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici
                if(STDFunctions.dateAfterFun(item.getReportesDominiodrvFechaHasta(),instance.getAesolicitudes().getAesolicitudesFesolici()))
                    return true;
            }
            return false;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator016, Method: assocOperator016";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator016
	@Override
    public Collection<ReportesDominio> assocOperator016Range1 (Solicitud instance) throws SystemException {

        SQLSelect sql = assocOperator016Range1Query(instance);
        return new TypedQueryBuilder<ReportesDominio>(em, ReportesDominio.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator016
	@Override
    public SQLPopulation assocOperator016Range1Query (Solicitud instance) throws SystemException {
        try {
            SQLPopulation sql = new SQLPopulation(SolicitudConstants.CLASS_NAME, ReportesDominioConstants.CLASS_NAME, instance.getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_DOMINIO + "." + DominioConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    if (instance.getAesolicitudes().isNull() || instance.getAesolicitudes().getPlanT().isNull())
                    {
                    comparison1.setSecondOperand(new SQLWhereOperandNull());
                    }
                    else
                    {
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, instance.getAesolicitudes().getPlanT().getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT);
                    comparison1.setSecondOperand(operand223);
                    }
                    conjunction.addOperand(comparison1);


            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 3
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_PLANTILLAREPORTE + "." + PlantillaReporteConstants.ATTR_NAME_PLANTILLAREPORTETIPO, Constants.Type.NAT.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(3), Constants.Type.NAT.getTypeName()));
                    conjunction.addOperand(comparison2);


            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici
                    // '<=' Comparison
                    SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
                    comparison3.setOperator("<=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_PLANTILLAREPORTE + "." + PlantillaReporteConstants.ATTR_NAME_PLANTILLAREPORTEFECHAVIGENCIA, Constants.Type.DATE.getTypeName());
                    comparison3.setFirstOperand(operand114);
                    
                    // Operand 2
                    if (instance.getAesolicitudes().getAesolicitudesFesolici()!= null){
                    comparison3.setSecondOperand(new SQLWhereOperandLiteral(instance.getAesolicitudes().getAesolicitudesFesolici(), Constants.Type.DATE.getTypeName()));
                    } else {
                    comparison3.setSecondOperand(new SQLWhereOperandNull());
                    }
                    conjunction.addOperand(comparison3);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator016, Method: assocOperator016Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator017
	@Override
    public Boolean assocOperator017(Solicitud instance) throws SystemException {
        try {
            // EXIST (Usuarios.Preexistencias) WHERE (Usuarios.Preexistencias.Usuario.EstadoBeneficiario.EsActivo = true)
            return assocOperator017Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator017, Method: assocOperator017";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator017
	@Override
    public Boolean assocOperator017Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator017Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator017
	@Override
    public SQLExists assocOperator017Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_PREEXISTENCIAS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Usuarios.Preexistencias.Usuario.EstadoBeneficiario.EsActivo = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_PREEXISTENCIAS + "." + PreexistenciaConstants.ROLE_NAME_USUARIO + "." + UsuarioConstants.ROLE_NAME_ESTADOBENEFICIARIO + "." + EstadoBeneficiarioConstants.ATTR_NAME_ESTADOBENEFICIARIOESACTIVO, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator017, Method: assocOperator017Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator018
	@Override
    public Boolean assocOperator018(Solicitud instance) throws SystemException {
        try {
            // EXIST (Aesolicitudes.ProductoT.Dominios.ReportesDominio) WHERE (Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 6 AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici)
            for(ReportesDominio item : assocOperator018Range1(instance)){
                // Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici
                if(STDFunctions.dateAfterFun(item.getReportesDominiodrvFechaHasta(),instance.getAesolicitudes().getAesolicitudesFesolici()))
                    return true;
            }
            return false;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator018, Method: assocOperator018";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator018
	@Override
    public Collection<ReportesDominio> assocOperator018Range1 (Solicitud instance) throws SystemException {

        SQLSelect sql = assocOperator018Range1Query(instance);
        return new TypedQueryBuilder<ReportesDominio>(em, ReportesDominio.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator018
	@Override
    public SQLPopulation assocOperator018Range1Query (Solicitud instance) throws SystemException {
        try {
            SQLPopulation sql = new SQLPopulation(SolicitudConstants.CLASS_NAME, ReportesDominioConstants.CLASS_NAME, instance.getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_DOMINIO + "." + DominioConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    if (instance.getAesolicitudes().isNull() || instance.getAesolicitudes().getPlanT().isNull())
                    {
                    comparison1.setSecondOperand(new SQLWhereOperandNull());
                    }
                    else
                    {
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, instance.getAesolicitudes().getPlanT().getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT);
                    comparison1.setSecondOperand(operand223);
                    }
                    conjunction.addOperand(comparison1);


            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 6
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_PLANTILLAREPORTE + "." + PlantillaReporteConstants.ATTR_NAME_PLANTILLAREPORTETIPO, Constants.Type.NAT.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(6), Constants.Type.NAT.getTypeName()));
                    conjunction.addOperand(comparison2);


            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici
                    // '<=' Comparison
                    SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
                    comparison3.setOperator("<=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_PLANTILLAREPORTE + "." + PlantillaReporteConstants.ATTR_NAME_PLANTILLAREPORTEFECHAVIGENCIA, Constants.Type.DATE.getTypeName());
                    comparison3.setFirstOperand(operand114);
                    
                    // Operand 2
                    if (instance.getAesolicitudes().getAesolicitudesFesolici()!= null){
                    comparison3.setSecondOperand(new SQLWhereOperandLiteral(instance.getAesolicitudes().getAesolicitudesFesolici(), Constants.Type.DATE.getTypeName()));
                    } else {
                    comparison3.setSecondOperand(new SQLWhereOperandNull());
                    }
                    conjunction.addOperand(comparison3);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator018, Method: assocOperator018Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator019
	@Override
    public Boolean assocOperator019(Solicitud instance) throws SystemException {
        try {
            // EXIST (Usuarios) WHERE (Usuarios.BebeGestante = true AND Usuarios.EstadoBeneficiario.EsActivo = true)
            return assocOperator019Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator019, Method: assocOperator019";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator019
	@Override
    public Boolean assocOperator019Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator019Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator019
	@Override
    public SQLExists assocOperator019Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Usuarios.BebeGestante = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ATTR_NAME_USUARIOBEBEGESTANTE, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);


            // Usuarios.EstadoBeneficiario.EsActivo = true
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_ESTADOBENEFICIARIO + "." + EstadoBeneficiarioConstants.ATTR_NAME_ESTADOBENEFICIARIOESACTIVO, Constants.Type.BOOL.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator019, Method: assocOperator019Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator020
	@Override
    public Boolean assocOperator020(Solicitud instance) throws SystemException {
        try {
            // EXIST (Aesolicitudes.ProductoT.Dominios.ReportesDominio) WHERE (Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 8 AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici)
            for(ReportesDominio item : assocOperator020Range1(instance)){
                // Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici
                if(STDFunctions.dateAfterFun(item.getReportesDominiodrvFechaHasta(),instance.getAesolicitudes().getAesolicitudesFesolici()))
                    return true;
            }
            return false;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator020, Method: assocOperator020";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator020
	@Override
    public Collection<ReportesDominio> assocOperator020Range1 (Solicitud instance) throws SystemException {

        SQLSelect sql = assocOperator020Range1Query(instance);
        return new TypedQueryBuilder<ReportesDominio>(em, ReportesDominio.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator020
	@Override
    public SQLPopulation assocOperator020Range1Query (Solicitud instance) throws SystemException {
        try {
            SQLPopulation sql = new SQLPopulation(SolicitudConstants.CLASS_NAME, ReportesDominioConstants.CLASS_NAME, instance.getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_DOMINIO + "." + DominioConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    if (instance.getAesolicitudes().isNull() || instance.getAesolicitudes().getPlanT().isNull())
                    {
                    comparison1.setSecondOperand(new SQLWhereOperandNull());
                    }
                    else
                    {
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, instance.getAesolicitudes().getPlanT().getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT);
                    comparison1.setSecondOperand(operand223);
                    }
                    conjunction.addOperand(comparison1);


            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 8
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_PLANTILLAREPORTE + "." + PlantillaReporteConstants.ATTR_NAME_PLANTILLAREPORTETIPO, Constants.Type.NAT.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(8), Constants.Type.NAT.getTypeName()));
                    conjunction.addOperand(comparison2);


            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici
                    // '<=' Comparison
                    SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
                    comparison3.setOperator("<=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_PLANTILLAREPORTE + "." + PlantillaReporteConstants.ATTR_NAME_PLANTILLAREPORTEFECHAVIGENCIA, Constants.Type.DATE.getTypeName());
                    comparison3.setFirstOperand(operand114);
                    
                    // Operand 2
                    if (instance.getAesolicitudes().getAesolicitudesFesolici()!= null){
                    comparison3.setSecondOperand(new SQLWhereOperandLiteral(instance.getAesolicitudes().getAesolicitudesFesolici(), Constants.Type.DATE.getTypeName()));
                    } else {
                    comparison3.setSecondOperand(new SQLWhereOperandNull());
                    }
                    conjunction.addOperand(comparison3);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator020, Method: assocOperator020Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator021
	@Override
    public Boolean assocOperator021(Solicitud instance) throws SystemException {
        try {
            // EXIST (Usuarios.AnexoMat) WHERE (Usuarios.AnexoMat.Usuario.EstadoBeneficiario.EsActivo = true)
            return assocOperator021Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator021, Method: assocOperator021";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator021
	@Override
    public Boolean assocOperator021Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator021Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator021
	@Override
    public SQLExists assocOperator021Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_ANEXOMAT, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Usuarios.AnexoMat.Usuario.EstadoBeneficiario.EsActivo = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_ANEXOMAT + "." + AnexoMatConstants.ROLE_NAME_USUARIO + "." + UsuarioConstants.ROLE_NAME_ESTADOBENEFICIARIO + "." + EstadoBeneficiarioConstants.ATTR_NAME_ESTADOBENEFICIARIOESACTIVO, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator021, Method: assocOperator021Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator022
	@Override
    public Boolean assocOperator022(Solicitud instance) throws SystemException {
        try {
            // EXIST (Aesolicitudes.ProductoT.Dominios.ReportesDominio) WHERE (Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 10 AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici)
            for(ReportesDominio item : assocOperator022Range1(instance)){
                // Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici
                if(STDFunctions.dateAfterFun(item.getReportesDominiodrvFechaHasta(),instance.getAesolicitudes().getAesolicitudesFesolici()))
                    return true;
            }
            return false;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator022, Method: assocOperator022";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator022
	@Override
    public Collection<ReportesDominio> assocOperator022Range1 (Solicitud instance) throws SystemException {

        SQLSelect sql = assocOperator022Range1Query(instance);
        return new TypedQueryBuilder<ReportesDominio>(em, ReportesDominio.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator022
	@Override
    public SQLPopulation assocOperator022Range1Query (Solicitud instance) throws SystemException {
        try {
            SQLPopulation sql = new SQLPopulation(SolicitudConstants.CLASS_NAME, ReportesDominioConstants.CLASS_NAME, instance.getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_DOMINIO + "." + DominioConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    if (instance.getAesolicitudes().isNull() || instance.getAesolicitudes().getPlanT().isNull())
                    {
                    comparison1.setSecondOperand(new SQLWhereOperandNull());
                    }
                    else
                    {
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, instance.getAesolicitudes().getPlanT().getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT);
                    comparison1.setSecondOperand(operand223);
                    }
                    conjunction.addOperand(comparison1);


            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 10
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_PLANTILLAREPORTE + "." + PlantillaReporteConstants.ATTR_NAME_PLANTILLAREPORTETIPO, Constants.Type.NAT.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(10), Constants.Type.NAT.getTypeName()));
                    conjunction.addOperand(comparison2);


            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici
                    // '<=' Comparison
                    SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
                    comparison3.setOperator("<=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_PLANTILLAREPORTE + "." + PlantillaReporteConstants.ATTR_NAME_PLANTILLAREPORTEFECHAVIGENCIA, Constants.Type.DATE.getTypeName());
                    comparison3.setFirstOperand(operand114);
                    
                    // Operand 2
                    if (instance.getAesolicitudes().getAesolicitudesFesolici()!= null){
                    comparison3.setSecondOperand(new SQLWhereOperandLiteral(instance.getAesolicitudes().getAesolicitudesFesolici(), Constants.Type.DATE.getTypeName()));
                    } else {
                    comparison3.setSecondOperand(new SQLWhereOperandNull());
                    }
                    conjunction.addOperand(comparison3);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator022, Method: assocOperator022Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator023
	@Override
    public Boolean assocOperator023(Solicitud instance) throws SystemException {
        try {
            // EXIST (Usuarios.CuestionarioP) WHERE (Usuarios.CuestionarioP.YaDiligenciado = true)
            return assocOperator023Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator023, Method: assocOperator023";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator023
	@Override
    public Boolean assocOperator023Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator023Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator023
	@Override
    public SQLExists assocOperator023Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_CUESTIONARIOP, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Usuarios.CuestionarioP.YaDiligenciado = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_CUESTIONARIOP + "." + CuestionarioPConstants.ATTR_NAME_CUESTIONARIOPYADILIGENCIADO, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator023, Method: assocOperator023Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator024
	@Override
    public Boolean assocOperator024(Solicitud instance) throws SystemException {
        try {
            // EXIST (Aesolicitudes.ProductoT.Dominios.ReportesDominio) WHERE (Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 4 AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici)
            for(ReportesDominio item : assocOperator024Range1(instance)){
                // Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici
                if(STDFunctions.dateAfterFun(item.getReportesDominiodrvFechaHasta(),instance.getAesolicitudes().getAesolicitudesFesolici()))
                    return true;
            }
            return false;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator024, Method: assocOperator024";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator024
	@Override
    public Collection<ReportesDominio> assocOperator024Range1 (Solicitud instance) throws SystemException {

        SQLSelect sql = assocOperator024Range1Query(instance);
        return new TypedQueryBuilder<ReportesDominio>(em, ReportesDominio.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator024
	@Override
    public SQLPopulation assocOperator024Range1Query (Solicitud instance) throws SystemException {
        try {
            SQLPopulation sql = new SQLPopulation(SolicitudConstants.CLASS_NAME, ReportesDominioConstants.CLASS_NAME, instance.getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_DOMINIO + "." + DominioConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    if (instance.getAesolicitudes().isNull() || instance.getAesolicitudes().getPlanT().isNull())
                    {
                    comparison1.setSecondOperand(new SQLWhereOperandNull());
                    }
                    else
                    {
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, instance.getAesolicitudes().getPlanT().getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT);
                    comparison1.setSecondOperand(operand223);
                    }
                    conjunction.addOperand(comparison1);


            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 4
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_PLANTILLAREPORTE + "." + PlantillaReporteConstants.ATTR_NAME_PLANTILLAREPORTETIPO, Constants.Type.NAT.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(4), Constants.Type.NAT.getTypeName()));
                    conjunction.addOperand(comparison2);


            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici
                    // '<=' Comparison
                    SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
                    comparison3.setOperator("<=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_PLANTILLAREPORTE + "." + PlantillaReporteConstants.ATTR_NAME_PLANTILLAREPORTEFECHAVIGENCIA, Constants.Type.DATE.getTypeName());
                    comparison3.setFirstOperand(operand114);
                    
                    // Operand 2
                    if (instance.getAesolicitudes().getAesolicitudesFesolici()!= null){
                    comparison3.setSecondOperand(new SQLWhereOperandLiteral(instance.getAesolicitudes().getAesolicitudesFesolici(), Constants.Type.DATE.getTypeName()));
                    } else {
                    comparison3.setSecondOperand(new SQLWhereOperandNull());
                    }
                    conjunction.addOperand(comparison3);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator024, Method: assocOperator024Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator025
	@Override
    public Boolean assocOperator025(Solicitud instance) throws SystemException {
        try {
            // EXIST (Usuarios) WHERE (Usuarios.EstadoMedico = 4 AND Usuarios.EstadoBeneficiario.EsActivo = true)
            return assocOperator025Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator025, Method: assocOperator025";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator025
	@Override
    public Boolean assocOperator025Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator025Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator025
	@Override
    public SQLExists assocOperator025Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Usuarios.EstadoMedico = 4
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ATTR_NAME_USUARIOESTADOMEDICO, Constants.Type.NAT.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(4), Constants.Type.NAT.getTypeName()));
                    conjunction.addOperand(comparison1);


            // Usuarios.EstadoBeneficiario.EsActivo = true
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_ESTADOBENEFICIARIO + "." + EstadoBeneficiarioConstants.ATTR_NAME_ESTADOBENEFICIARIOESACTIVO, Constants.Type.BOOL.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator025, Method: assocOperator025Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator026
	@Override
    public Double assocOperator026(Solicitud instance) throws SystemException {
        try {
            // SUM (Usuarios.drvTotalAnexos)
            double result = 0.0;
            for(Usuario item : assocOperator026Range1(instance)){
                result += item.getUsuariodrvTotalAnexos();
            }
            return result;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator026, Method: assocOperator026";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator026
	@Override
    public Collection<Usuario> assocOperator026Range1 (Solicitud instance) throws SystemException {

        SQLSelect sql = assocOperator026Range1Query(instance);
        return new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator026
	@Override
    public SQLPopulation assocOperator026Range1Query (Solicitud instance) throws SystemException {
        try {
            return new SQLPopulation(SolicitudConstants.CLASS_NAME, UsuarioConstants.CLASS_NAME, instance.getOid(), SolicitudConstants.ROLE_NAME_USUARIOS);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator026, Method: assocOperator026Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator027
	@Override
    public Boolean assocOperator027(Solicitud instance) throws SystemException {
        try {
            // EXIST (Usuarios) WHERE (Usuarios.drvTieneEPSSanitas = true)
            for(Usuario item : assocOperator027Range1(instance)){
                // Usuarios.drvTieneEPSSanitas = true
                if(item.getUsuariodrvTieneEPSSanitas().equals(true))
                    return true;
            }
            return false;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator027, Method: assocOperator027";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator027
	@Override
    public Collection<Usuario> assocOperator027Range1 (Solicitud instance) throws SystemException {

        SQLSelect sql = assocOperator027Range1Query(instance);
        return new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator027
	@Override
    public SQLPopulation assocOperator027Range1Query (Solicitud instance) throws SystemException {
        try {
            return new SQLPopulation(SolicitudConstants.CLASS_NAME, UsuarioConstants.CLASS_NAME, instance.getOid(), SolicitudConstants.ROLE_NAME_USUARIOS);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator027, Method: assocOperator027Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator028
	@Override
    public Long assocOperator028(Solicitud instance) throws SystemException {
        try {
            // COUNT (Usuarios) WHERE (Usuarios.Parentesco.EsTitular = true AND Usuarios.drvEstaActivo = true)
            long count = 0L;
            for(Usuario item : assocOperator028Range1(instance)){
                // Usuarios.drvEstaActivo = true
                if(item.getUsuariodrvEstaActivo().equals(true))
                    count += 1;
            }
            return count;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator028, Method: assocOperator028";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator028
	@Override
    public Collection<Usuario> assocOperator028Range1 (Solicitud instance) throws SystemException {

        SQLSelect sql = assocOperator028Range1Query(instance);
        return new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator028
	@Override
    public SQLPopulation assocOperator028Range1Query (Solicitud instance) throws SystemException {
        try {
            SQLPopulation sql = new SQLPopulation(SolicitudConstants.CLASS_NAME, UsuarioConstants.CLASS_NAME, instance.getOid(), SolicitudConstants.ROLE_NAME_USUARIOS);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Usuarios.Parentesco.EsTitular = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_PARENTESCO + "." + ParentescoConstants.ATTR_NAME_PARENTESCOESTITULAR, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator028, Method: assocOperator028Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator029
	@Override
    public Long assocOperator029(Solicitud instance) throws SystemException {
        try {
            // COUNT (UsuariosRegistrados) WHERE (UsuariosRegistrados.Parentesco.EsTitular = true AND UsuariosRegistrados.EstadoBeneficiario.EsActivo = true)
            return assocOperator029Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator029, Method: assocOperator029";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator029
	@Override
    public Long assocOperator029Range1 (Solicitud instance) throws SystemException {
        SQLCount sql = assocOperator029Range1Query(instance);
        return Long.valueOf(solveCountQuery(sql));
    }

    // Range Query 1 for AssocOperator AssocOperator029
	@Override
    public SQLCount assocOperator029Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLCount sql = new SQLCount(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // UsuariosRegistrados.Parentesco.EsTitular = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS + "." + UsuarioRegConstants.ROLE_NAME_PARENTESCO + "." + ParentescoConstants.ATTR_NAME_PARENTESCOESTITULAR, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);


            // UsuariosRegistrados.EstadoBeneficiario.EsActivo = true
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS + "." + UsuarioRegConstants.ROLE_NAME_ESTADOBENEFICIARIO + "." + EstadoBeneficiarioConstants.ATTR_NAME_ESTADOBENEFICIARIOESACTIVO, Constants.Type.BOOL.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator029, Method: assocOperator029Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator030
	@Override
    public Long assocOperator030(Solicitud instance) throws SystemException {
        try {
            // COUNT (Aesolicitudes.ProductoT.Dominios.ReportesDominio) WHERE (Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici)
            long count = 0L;
            for(ReportesDominio item : assocOperator030Range1(instance)){
                // Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici
                if(STDFunctions.dateAfterFun(item.getReportesDominiodrvFechaHasta(),instance.getAesolicitudes().getAesolicitudesFesolici()))
                    count += 1;
            }
            return count;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator030, Method: assocOperator030";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator030
	@Override
    public Collection<ReportesDominio> assocOperator030Range1 (Solicitud instance) throws SystemException {

        SQLSelect sql = assocOperator030Range1Query(instance);
        return new TypedQueryBuilder<ReportesDominio>(em, ReportesDominio.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator030
	@Override
    public SQLPopulation assocOperator030Range1Query (Solicitud instance) throws SystemException {
        try {
            SQLPopulation sql = new SQLPopulation(SolicitudConstants.CLASS_NAME, ReportesDominioConstants.CLASS_NAME, instance.getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_DOMINIO + "." + DominioConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    if (instance.getAesolicitudes().isNull() || instance.getAesolicitudes().getPlanT().isNull())
                    {
                    comparison1.setSecondOperand(new SQLWhereOperandNull());
                    }
                    else
                    {
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, instance.getAesolicitudes().getPlanT().getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT);
                    comparison1.setSecondOperand(operand223);
                    }
                    conjunction.addOperand(comparison1);


            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici
                    // '<=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("<=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_PLANTILLAREPORTE + "." + PlantillaReporteConstants.ATTR_NAME_PLANTILLAREPORTEFECHAVIGENCIA, Constants.Type.DATE.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    if (instance.getAesolicitudes().getAesolicitudesFesolici()!= null){
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(instance.getAesolicitudes().getAesolicitudesFesolici(), Constants.Type.DATE.getTypeName()));
                    } else {
                    comparison2.setSecondOperand(new SQLWhereOperandNull());
                    }
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator030, Method: assocOperator030Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator031
	@Override
    public Boolean assocOperator031(Solicitud instance) throws SystemException {
        try {
            // EXIST (TitularPersona)
            return assocOperator031Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator031, Method: assocOperator031";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator031
	@Override
    public Boolean assocOperator031Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator031Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator031
	@Override
    public SQLExists assocOperator031Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_TITULARPERSONA, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator031, Method: assocOperator031Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator032
	@Override
    public Boolean assocOperator032(Solicitud instance) throws SystemException {
        try {
            // EXIST (TitularPersona) WHERE (TitularPersona.TipoIdentificacion.NIT = false)
            return assocOperator032Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator032, Method: assocOperator032";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator032
	@Override
    public Boolean assocOperator032Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator032Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator032
	@Override
    public SQLExists assocOperator032Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_TITULARPERSONA, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // TitularPersona.TipoIdentificacion.NIT = false
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    if (instance.getTitularPersona().getTipoIdentificacion().getTipoIdentificacionNIT()!= null){
                    comparison1.setFirstOperand(new SQLWhereOperandLiteral(instance.getTitularPersona().getTipoIdentificacion().getTipoIdentificacionNIT(), Constants.Type.BOOL.getTypeName()));
                    } else {
                    comparison1.setFirstOperand(new SQLWhereOperandNull());
                    }
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.FALSE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator032, Method: assocOperator032Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator033
	@Override
    public Boolean assocOperator033(Solicitud instance) throws SystemException {
        try {
            // EXIST (Firma)
            return assocOperator033Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator033, Method: assocOperator033";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator033
	@Override
    public Boolean assocOperator033Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator033Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator033
	@Override
    public SQLExists assocOperator033Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_FIRMA, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator033, Method: assocOperator033Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator034
	@Override
    public Long assocOperator034(Solicitud instance) throws SystemException {
        try {
            // COUNT (Usuarios) WHERE (Usuarios.drvTieneDocumentos = false)
            long count = 0L;
            for(Usuario item : assocOperator034Range1(instance)){
                // Usuarios.drvTieneDocumentos = false
                if(item.getUsuariodrvTieneDocumentos().equals(false))
                    count += 1;
            }
            return count;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator034, Method: assocOperator034";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator034
	@Override
    public Collection<Usuario> assocOperator034Range1 (Solicitud instance) throws SystemException {

        SQLSelect sql = assocOperator034Range1Query(instance);
        return new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator034
	@Override
    public SQLPopulation assocOperator034Range1Query (Solicitud instance) throws SystemException {
        try {
            return new SQLPopulation(SolicitudConstants.CLASS_NAME, UsuarioConstants.CLASS_NAME, instance.getOid(), SolicitudConstants.ROLE_NAME_USUARIOS);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator034, Method: assocOperator034Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator035
	@Override
    public Long assocOperator035(Solicitud instance) throws SystemException {
        try {
            // COUNT (Usuarios) WHERE (Usuarios.drvTieneParentesco = false)
            long count = 0L;
            for(Usuario item : assocOperator035Range1(instance)){
                // Usuarios.drvTieneParentesco = false
                if(item.getUsuariodrvTieneParentesco().equals(false))
                    count += 1;
            }
            return count;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator035, Method: assocOperator035";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator035
	@Override
    public Collection<Usuario> assocOperator035Range1 (Solicitud instance) throws SystemException {

        SQLSelect sql = assocOperator035Range1Query(instance);
        return new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator035
	@Override
    public SQLPopulation assocOperator035Range1Query (Solicitud instance) throws SystemException {
        try {
            return new SQLPopulation(SolicitudConstants.CLASS_NAME, UsuarioConstants.CLASS_NAME, instance.getOid(), SolicitudConstants.ROLE_NAME_USUARIOS);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator035, Method: assocOperator035Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator036
	@Override
    public Long assocOperator036(Solicitud instance) throws SystemException {
        try {
            // COUNT (Usuarios) WHERE (Usuarios.Parentesco.EsTitular = true)
            return assocOperator036Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator036, Method: assocOperator036";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator036
	@Override
    public Long assocOperator036Range1 (Solicitud instance) throws SystemException {
        SQLCount sql = assocOperator036Range1Query(instance);
        return Long.valueOf(solveCountQuery(sql));
    }

    // Range Query 1 for AssocOperator AssocOperator036
	@Override
    public SQLCount assocOperator036Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLCount sql = new SQLCount(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Usuarios.Parentesco.EsTitular = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_PARENTESCO + "." + ParentescoConstants.ATTR_NAME_PARENTESCOESTITULAR, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator036, Method: assocOperator036Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator037
	@Override
    public Long assocOperator037(Solicitud instance) throws SystemException {
        try {
            // COUNT (UsuariosRegistrados) WHERE (UsuariosRegistrados.Parentesco.EsTitular = true)
            return assocOperator037Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator037, Method: assocOperator037";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator037
	@Override
    public Long assocOperator037Range1 (Solicitud instance) throws SystemException {
        SQLCount sql = assocOperator037Range1Query(instance);
        return Long.valueOf(solveCountQuery(sql));
    }

    // Range Query 1 for AssocOperator AssocOperator037
	@Override
    public SQLCount assocOperator037Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLCount sql = new SQLCount(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // UsuariosRegistrados.Parentesco.EsTitular = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS + "." + UsuarioRegConstants.ROLE_NAME_PARENTESCO + "." + ParentescoConstants.ATTR_NAME_PARENTESCOESTITULAR, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator037, Method: assocOperator037Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator038
	@Override
    public Boolean assocOperator038(Solicitud instance) throws SystemException {
        try {
            // EXIST (Aesolicitudes.ProductoT.Dominios.ReportesDominio) WHERE (Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 9 AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici)
            for(ReportesDominio item : assocOperator038Range1(instance)){
                // Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici
                if(STDFunctions.dateAfterFun(item.getReportesDominiodrvFechaHasta(),instance.getAesolicitudes().getAesolicitudesFesolici()))
                    return true;
            }
            return false;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator038, Method: assocOperator038";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator038
	@Override
    public Collection<ReportesDominio> assocOperator038Range1 (Solicitud instance) throws SystemException {

        SQLSelect sql = assocOperator038Range1Query(instance);
        return new TypedQueryBuilder<ReportesDominio>(em, ReportesDominio.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator038
	@Override
    public SQLPopulation assocOperator038Range1Query (Solicitud instance) throws SystemException {
        try {
            SQLPopulation sql = new SQLPopulation(SolicitudConstants.CLASS_NAME, ReportesDominioConstants.CLASS_NAME, instance.getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_DOMINIO + "." + DominioConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    if (instance.getAesolicitudes().isNull() || instance.getAesolicitudes().getPlanT().isNull())
                    {
                    comparison1.setSecondOperand(new SQLWhereOperandNull());
                    }
                    else
                    {
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, instance.getAesolicitudes().getPlanT().getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT);
                    comparison1.setSecondOperand(operand223);
                    }
                    conjunction.addOperand(comparison1);


            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 9
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_PLANTILLAREPORTE + "." + PlantillaReporteConstants.ATTR_NAME_PLANTILLAREPORTETIPO, Constants.Type.NAT.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(9), Constants.Type.NAT.getTypeName()));
                    conjunction.addOperand(comparison2);


            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici
                    // '<=' Comparison
                    SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
                    comparison3.setOperator("<=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_PLANTILLAREPORTE + "." + PlantillaReporteConstants.ATTR_NAME_PLANTILLAREPORTEFECHAVIGENCIA, Constants.Type.DATE.getTypeName());
                    comparison3.setFirstOperand(operand114);
                    
                    // Operand 2
                    if (instance.getAesolicitudes().getAesolicitudesFesolici()!= null){
                    comparison3.setSecondOperand(new SQLWhereOperandLiteral(instance.getAesolicitudes().getAesolicitudesFesolici(), Constants.Type.DATE.getTypeName()));
                    } else {
                    comparison3.setSecondOperand(new SQLWhereOperandNull());
                    }
                    conjunction.addOperand(comparison3);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator038, Method: assocOperator038Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator039
	@Override
    public Boolean assocOperator039(Solicitud instance) throws SystemException {
        try {
            // EXIST (Usuarios.AnexoNeo) WHERE (Usuarios.AnexoNeo.Usuario.EstadoBeneficiario.EsActivo = true)
            return assocOperator039Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator039, Method: assocOperator039";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator039
	@Override
    public Boolean assocOperator039Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator039Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator039
	@Override
    public SQLExists assocOperator039Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_ANEXONEO, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Usuarios.AnexoNeo.Usuario.EstadoBeneficiario.EsActivo = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_ANEXONEO + "." + AnexoNeoConstants.ROLE_NAME_USUARIO + "." + UsuarioConstants.ROLE_NAME_ESTADOBENEFICIARIO + "." + EstadoBeneficiarioConstants.ATTR_NAME_ESTADOBENEFICIARIOESACTIVO, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator039, Method: assocOperator039Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator040
	@Override
    public Boolean assocOperator040(Solicitud instance) throws SystemException {
        try {
            // EXIST (Aesolicitudes.ProductoT.Dominios.ReportesDominio) WHERE (Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 2 AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici)
            for(ReportesDominio item : assocOperator040Range1(instance)){
                // Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici
                if(STDFunctions.dateAfterFun(item.getReportesDominiodrvFechaHasta(),instance.getAesolicitudes().getAesolicitudesFesolici()))
                    return true;
            }
            return false;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator040, Method: assocOperator040";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator040
	@Override
    public Collection<ReportesDominio> assocOperator040Range1 (Solicitud instance) throws SystemException {

        SQLSelect sql = assocOperator040Range1Query(instance);
        return new TypedQueryBuilder<ReportesDominio>(em, ReportesDominio.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator040
	@Override
    public SQLPopulation assocOperator040Range1Query (Solicitud instance) throws SystemException {
        try {
            SQLPopulation sql = new SQLPopulation(SolicitudConstants.CLASS_NAME, ReportesDominioConstants.CLASS_NAME, instance.getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_DOMINIO + "." + DominioConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    if (instance.getAesolicitudes().isNull() || instance.getAesolicitudes().getPlanT().isNull())
                    {
                    comparison1.setSecondOperand(new SQLWhereOperandNull());
                    }
                    else
                    {
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, instance.getAesolicitudes().getPlanT().getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT);
                    comparison1.setSecondOperand(operand223);
                    }
                    conjunction.addOperand(comparison1);


            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 2
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_PLANTILLAREPORTE + "." + PlantillaReporteConstants.ATTR_NAME_PLANTILLAREPORTETIPO, Constants.Type.NAT.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(2), Constants.Type.NAT.getTypeName()));
                    conjunction.addOperand(comparison2);


            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici
                    // '<=' Comparison
                    SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
                    comparison3.setOperator("<=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_PLANTILLAREPORTE + "." + PlantillaReporteConstants.ATTR_NAME_PLANTILLAREPORTEFECHAVIGENCIA, Constants.Type.DATE.getTypeName());
                    comparison3.setFirstOperand(operand114);
                    
                    // Operand 2
                    if (instance.getAesolicitudes().getAesolicitudesFesolici()!= null){
                    comparison3.setSecondOperand(new SQLWhereOperandLiteral(instance.getAesolicitudes().getAesolicitudesFesolici(), Constants.Type.DATE.getTypeName()));
                    } else {
                    comparison3.setSecondOperand(new SQLWhereOperandNull());
                    }
                    conjunction.addOperand(comparison3);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator040, Method: assocOperator040Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator041
	@Override
    public Boolean assocOperator041(Solicitud instance) throws SystemException {
        try {
            // EXIST (Usuarios) WHERE (Usuarios.EstadoBeneficiario.EsActivo = true)
            return assocOperator041Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator041, Method: assocOperator041";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator041
	@Override
    public Boolean assocOperator041Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator041Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator041
	@Override
    public SQLExists assocOperator041Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Usuarios.EstadoBeneficiario.EsActivo = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_ESTADOBENEFICIARIO + "." + EstadoBeneficiarioConstants.ATTR_NAME_ESTADOBENEFICIARIOESACTIVO, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator041, Method: assocOperator041Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator042
	@Override
    public Boolean assocOperator042(Solicitud instance) throws SystemException {
        try {
            // EXIST (Contratante)
            return assocOperator042Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator042, Method: assocOperator042";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator042
	@Override
    public Boolean assocOperator042Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator042Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator042
	@Override
    public SQLExists assocOperator042Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_CONTRATANTE, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator042, Method: assocOperator042Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator043
	@Override
    public Long assocOperator043(Solicitud instance) throws SystemException {
        try {
            // COUNT (UsuariosRegistrados) WHERE (UsuariosRegistrados.Parentesco.EsTitular = true)
            return assocOperator043Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator043, Method: assocOperator043";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator043
	@Override
    public Long assocOperator043Range1 (Solicitud instance) throws SystemException {
        SQLCount sql = assocOperator043Range1Query(instance);
        return Long.valueOf(solveCountQuery(sql));
    }

    // Range Query 1 for AssocOperator AssocOperator043
	@Override
    public SQLCount assocOperator043Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLCount sql = new SQLCount(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // UsuariosRegistrados.Parentesco.EsTitular = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS + "." + UsuarioRegConstants.ROLE_NAME_PARENTESCO + "." + ParentescoConstants.ATTR_NAME_PARENTESCOESTITULAR, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator043, Method: assocOperator043Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator044
	@Override
    public Long assocOperator044(Solicitud instance) throws SystemException {
        try {
            // COUNT (UsuariosRegistrados) WHERE (UsuariosRegistrados.Parentesco.EsTitular = true)
            return assocOperator044Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator044, Method: assocOperator044";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator044
	@Override
    public Long assocOperator044Range1 (Solicitud instance) throws SystemException {
        SQLCount sql = assocOperator044Range1Query(instance);
        return Long.valueOf(solveCountQuery(sql));
    }

    // Range Query 1 for AssocOperator AssocOperator044
	@Override
    public SQLCount assocOperator044Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLCount sql = new SQLCount(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // UsuariosRegistrados.Parentesco.EsTitular = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS + "." + UsuarioRegConstants.ROLE_NAME_PARENTESCO + "." + ParentescoConstants.ATTR_NAME_PARENTESCOESTITULAR, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator044, Method: assocOperator044Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator045
	@Override
    public Long assocOperator045(Solicitud instance) throws SystemException {
        try {
            // MAX (UsuariosRegistrados.drvEdad) WHERE (UsuariosRegistrados.Parentesco.EsTitular = true)
            long result = Long.MIN_VALUE;
            for(UsuarioReg item : assocOperator045Range1(instance)){
                if(result < item.getUsuarioRegdrvEdad())
                    result = item.getUsuarioRegdrvEdad();
            }
            return result;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator045, Method: assocOperator045";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator045
	@Override
    public Collection<UsuarioReg> assocOperator045Range1 (Solicitud instance) throws SystemException {

        SQLSelect sql = assocOperator045Range1Query(instance);
        return new TypedQueryBuilder<UsuarioReg>(em, UsuarioReg.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator045
	@Override
    public SQLPopulation assocOperator045Range1Query (Solicitud instance) throws SystemException {
        try {
            SQLPopulation sql = new SQLPopulation(SolicitudConstants.CLASS_NAME, UsuarioRegConstants.CLASS_NAME, instance.getOid(), SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // UsuariosRegistrados.Parentesco.EsTitular = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS + "." + UsuarioRegConstants.ROLE_NAME_PARENTESCO + "." + ParentescoConstants.ATTR_NAME_PARENTESCOESTITULAR, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator045, Method: assocOperator045Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator046
	@Override
    public Long assocOperator046(Solicitud instance) throws SystemException {
        try {
            // MAX (Usuarios.drvEdad) WHERE (Usuarios.drvEsElTitular = true)
            long result = Long.MIN_VALUE;
            for(Usuario item : assocOperator046Range1(instance)){
                // Usuarios.drvEsElTitular = true
                boolean conditionsMet = item.getUsuariodrvEsElTitular().equals(true);
                if (!conditionsMet) continue;

                if(result < item.getUsuariodrvEdad())
                    result = item.getUsuariodrvEdad();
            }
            return result;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator046, Method: assocOperator046";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator046
	@Override
    public Collection<Usuario> assocOperator046Range1 (Solicitud instance) throws SystemException {

        SQLSelect sql = assocOperator046Range1Query(instance);
        return new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator046
	@Override
    public SQLPopulation assocOperator046Range1Query (Solicitud instance) throws SystemException {
        try {
            return new SQLPopulation(SolicitudConstants.CLASS_NAME, UsuarioConstants.CLASS_NAME, instance.getOid(), SolicitudConstants.ROLE_NAME_USUARIOS);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator046, Method: assocOperator046Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator047
	@Override
    public Long assocOperator047(Solicitud instance) throws SystemException {
        try {
            // COUNT (UsuariosRegistrados) WHERE (UsuariosRegistrados.Parentesco.EsTitular = true)
            return assocOperator047Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator047, Method: assocOperator047";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator047
	@Override
    public Long assocOperator047Range1 (Solicitud instance) throws SystemException {
        SQLCount sql = assocOperator047Range1Query(instance);
        return Long.valueOf(solveCountQuery(sql));
    }

    // Range Query 1 for AssocOperator AssocOperator047
	@Override
    public SQLCount assocOperator047Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLCount sql = new SQLCount(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // UsuariosRegistrados.Parentesco.EsTitular = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS + "." + UsuarioRegConstants.ROLE_NAME_PARENTESCO + "." + ParentescoConstants.ATTR_NAME_PARENTESCOESTITULAR, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator047, Method: assocOperator047Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator048
	@Override
    public String assocOperator048(Solicitud instance) throws SystemException {
        try {
            // GETONE (UsuariosRegistrados.Genero) WHERE (UsuariosRegistrados.Parentesco.EsTitular = true)
            return assocOperator048Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator048, Method: assocOperator048";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator048
	@Override
    public String assocOperator048Range1 (Solicitud instance) throws SystemException {
        SQLGetOne sql = assocOperator048Range1Query(instance);
        List<String> results = new TypedQueryBuilder<String>(em, String.class).build(sql).execute();
        return !results.isEmpty() ? results.get(0) : null;
    }

    // Range Query 1 for AssocOperator AssocOperator048
	@Override
    public SQLGetOne assocOperator048Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLGetOne sql = new SQLGetOne(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS + "." + UsuarioRegConstants.ATTR_NAME_USUARIOREGGENERO, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // UsuariosRegistrados.Parentesco.EsTitular = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS + "." + UsuarioRegConstants.ROLE_NAME_PARENTESCO + "." + ParentescoConstants.ATTR_NAME_PARENTESCOESTITULAR, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator048, Method: assocOperator048Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator049
	@Override
    public Boolean assocOperator049(Solicitud instance) throws SystemException {
        try {
            // EXIST (Usuarios) WHERE (Usuarios.drvEsElTitular = true AND Usuarios.UsuarioPersona.Genero = "F")
            for(Usuario item : assocOperator049Range1(instance)){
                // Usuarios.drvEsElTitular = true
                if(item.getUsuariodrvEsElTitular().equals(true))
                    return true;
            }
            return false;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator049, Method: assocOperator049";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator049
	@Override
    public Collection<Usuario> assocOperator049Range1 (Solicitud instance) throws SystemException {

        SQLSelect sql = assocOperator049Range1Query(instance);
        return new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator049
	@Override
    public SQLPopulation assocOperator049Range1Query (Solicitud instance) throws SystemException {
        try {
            SQLPopulation sql = new SQLPopulation(SolicitudConstants.CLASS_NAME, UsuarioConstants.CLASS_NAME, instance.getOid(), SolicitudConstants.ROLE_NAME_USUARIOS);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Usuarios.UsuarioPersona.Genero = "F"
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_USUARIOPERSONA + "." + PersonaConstants.ATTR_NAME_PERSONAGENERO, Constants.Type.STRING.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral("F", Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator049, Method: assocOperator049Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator050
	@Override
    public Boolean assocOperator050(Solicitud instance) throws SystemException {
        try {
            // EXIST (Usuarios) WHERE (Usuarios.drvEsElTitular = true AND Usuarios.UsuarioPersona.Genero = "M")
            for(Usuario item : assocOperator050Range1(instance)){
                // Usuarios.drvEsElTitular = true
                if(item.getUsuariodrvEsElTitular().equals(true))
                    return true;
            }
            return false;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator050, Method: assocOperator050";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator050
	@Override
    public Collection<Usuario> assocOperator050Range1 (Solicitud instance) throws SystemException {

        SQLSelect sql = assocOperator050Range1Query(instance);
        return new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator050
	@Override
    public SQLPopulation assocOperator050Range1Query (Solicitud instance) throws SystemException {
        try {
            SQLPopulation sql = new SQLPopulation(SolicitudConstants.CLASS_NAME, UsuarioConstants.CLASS_NAME, instance.getOid(), SolicitudConstants.ROLE_NAME_USUARIOS);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Usuarios.UsuarioPersona.Genero = "M"
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_USUARIOPERSONA + "." + PersonaConstants.ATTR_NAME_PERSONAGENERO, Constants.Type.STRING.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral("M", Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator050, Method: assocOperator050Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator051
	@Override
    public Long assocOperator051(Solicitud instance) throws SystemException {
        try {
            // COUNT (Usuarios) WHERE (Usuarios.Parentesco.EsTitular = true)
            return assocOperator051Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator051, Method: assocOperator051";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator051
	@Override
    public Long assocOperator051Range1 (Solicitud instance) throws SystemException {
        SQLCount sql = assocOperator051Range1Query(instance);
        return Long.valueOf(solveCountQuery(sql));
    }

    // Range Query 1 for AssocOperator AssocOperator051
	@Override
    public SQLCount assocOperator051Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLCount sql = new SQLCount(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Usuarios.Parentesco.EsTitular = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_PARENTESCO + "." + ParentescoConstants.ATTR_NAME_PARENTESCOESTITULAR, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator051, Method: assocOperator051Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator052
	@Override
    public Long assocOperator052(Solicitud instance) throws SystemException {
        try {
            // COUNT (UsuariosRegistrados) WHERE (UsuariosRegistrados.Parentesco.EsTitular = true)
            return assocOperator052Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator052, Method: assocOperator052";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator052
	@Override
    public Long assocOperator052Range1 (Solicitud instance) throws SystemException {
        SQLCount sql = assocOperator052Range1Query(instance);
        return Long.valueOf(solveCountQuery(sql));
    }

    // Range Query 1 for AssocOperator AssocOperator052
	@Override
    public SQLCount assocOperator052Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLCount sql = new SQLCount(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // UsuariosRegistrados.Parentesco.EsTitular = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS + "." + UsuarioRegConstants.ROLE_NAME_PARENTESCO + "." + ParentescoConstants.ATTR_NAME_PARENTESCOESTITULAR, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator052, Method: assocOperator052Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator053
	@Override
    public Boolean assocOperator053(Solicitud instance) throws SystemException {
        try {
            // EXIST (Aesolicitudes.ProductoT.Dominios.ReportesDominio) WHERE (Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 0 AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici)
            for(ReportesDominio item : assocOperator053Range1(instance)){
                // Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici
                if(STDFunctions.dateAfterFun(item.getReportesDominiodrvFechaHasta(),instance.getAesolicitudes().getAesolicitudesFesolici()))
                    return true;
            }
            return false;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator053, Method: assocOperator053";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator053
	@Override
    public Collection<ReportesDominio> assocOperator053Range1 (Solicitud instance) throws SystemException {

        SQLSelect sql = assocOperator053Range1Query(instance);
        return new TypedQueryBuilder<ReportesDominio>(em, ReportesDominio.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator053
	@Override
    public SQLPopulation assocOperator053Range1Query (Solicitud instance) throws SystemException {
        try {
            SQLPopulation sql = new SQLPopulation(SolicitudConstants.CLASS_NAME, ReportesDominioConstants.CLASS_NAME, instance.getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_DOMINIO + "." + DominioConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    if (instance.getAesolicitudes().isNull() || instance.getAesolicitudes().getPlanT().isNull())
                    {
                    comparison1.setSecondOperand(new SQLWhereOperandNull());
                    }
                    else
                    {
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, instance.getAesolicitudes().getPlanT().getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT);
                    comparison1.setSecondOperand(operand223);
                    }
                    conjunction.addOperand(comparison1);


            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 0
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_PLANTILLAREPORTE + "." + PlantillaReporteConstants.ATTR_NAME_PLANTILLAREPORTETIPO, Constants.Type.NAT.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(0), Constants.Type.NAT.getTypeName()));
                    conjunction.addOperand(comparison2);


            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici
                    // '<=' Comparison
                    SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
                    comparison3.setOperator("<=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_PLANTILLAREPORTE + "." + PlantillaReporteConstants.ATTR_NAME_PLANTILLAREPORTEFECHAVIGENCIA, Constants.Type.DATE.getTypeName());
                    comparison3.setFirstOperand(operand114);
                    
                    // Operand 2
                    if (instance.getAesolicitudes().getAesolicitudesFesolici()!= null){
                    comparison3.setSecondOperand(new SQLWhereOperandLiteral(instance.getAesolicitudes().getAesolicitudesFesolici(), Constants.Type.DATE.getTypeName()));
                    } else {
                    comparison3.setSecondOperand(new SQLWhereOperandNull());
                    }
                    conjunction.addOperand(comparison3);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator053, Method: assocOperator053Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator054
	@Override
    public Boolean assocOperator054(Solicitud instance) throws SystemException {
        try {
            // EXIST (Aesolicitudes.ProductoT.Dominios) WHERE (Aesolicitudes.ProductoT.Dominios.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.IgnorarPreexistencias = true)
            return assocOperator054Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator054, Method: assocOperator054";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator054
	@Override
    public Boolean assocOperator054Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator054Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator054
	@Override
    public SQLExists assocOperator054Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Aesolicitudes.ProductoT.Dominios.PlanT = Aesolicitudes.PlanT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    if (instance.getAesolicitudes().isNull() || instance.getAesolicitudes().getPlanT().isNull())
                    {
                    comparison1.setSecondOperand(new SQLWhereOperandNull());
                    }
                    else
                    {
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, instance.getAesolicitudes().getPlanT().getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT);
                    comparison1.setSecondOperand(operand223);
                    }
                    conjunction.addOperand(comparison1);


            // Aesolicitudes.ProductoT.Dominios.IgnorarPreexistencias = true
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ATTR_NAME_DOMINIOIGNORARPREEXISTENCIAS, Constants.Type.BOOL.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator054, Method: assocOperator054Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator055
	@Override
    public Boolean assocOperator055(Solicitud instance) throws SystemException {
        try {
            // EXIST (Firma)
            return assocOperator055Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator055, Method: assocOperator055";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator055
	@Override
    public Boolean assocOperator055Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator055Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator055
	@Override
    public SQLExists assocOperator055Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_FIRMA, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator055, Method: assocOperator055Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator056
	@Override
    public Boolean assocOperator056(Solicitud instance) throws SystemException {
        try {
            // EXIST (Usuarios) WHERE (Usuarios.drvImpTarifaPlanVol = 0)
            for(Usuario item : assocOperator056Range1(instance)){
                // Usuarios.drvImpTarifaPlanVol = 0
                if((item.getUsuariodrvImpTarifaPlanVol()).equals(Utilities.convertToDouble(Utilities.convertToDouble(Utilities.convertToDouble(Long.valueOf(0))))))
                    return true;
            }
            return false;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator056, Method: assocOperator056";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator056
	@Override
    public Collection<Usuario> assocOperator056Range1 (Solicitud instance) throws SystemException {

        SQLSelect sql = assocOperator056Range1Query(instance);
        return new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator056
	@Override
    public SQLPopulation assocOperator056Range1Query (Solicitud instance) throws SystemException {
        try {
            return new SQLPopulation(SolicitudConstants.CLASS_NAME, UsuarioConstants.CLASS_NAME, instance.getOid(), SolicitudConstants.ROLE_NAME_USUARIOS);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator056, Method: assocOperator056Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator057
	@Override
    public Double assocOperator057(Solicitud instance) throws SystemException {
        try {
            // SUM (Usuarios.drvImpTarifaPlanVol)
            double result = 0.0;
            for(Usuario item : assocOperator057Range1(instance)){
                result += item.getUsuariodrvImpTarifaPlanVol();
            }
            return result;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator057, Method: assocOperator057";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator057
	@Override
    public Collection<Usuario> assocOperator057Range1 (Solicitud instance) throws SystemException {

        SQLSelect sql = assocOperator057Range1Query(instance);
        return new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator057
	@Override
    public SQLPopulation assocOperator057Range1Query (Solicitud instance) throws SystemException {
        try {
            return new SQLPopulation(SolicitudConstants.CLASS_NAME, UsuarioConstants.CLASS_NAME, instance.getOid(), SolicitudConstants.ROLE_NAME_USUARIOS);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator057, Method: assocOperator057Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator058
	@Override
    public Boolean assocOperator058(Solicitud instance) throws SystemException {
        try {
            // EXIST (Aesolicitudes.ProductoT.Dominios.ReportesDominio) WHERE (Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 5 AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici)
            for(ReportesDominio item : assocOperator058Range1(instance)){
                // Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici
                if(STDFunctions.dateAfterFun(item.getReportesDominiodrvFechaHasta(),instance.getAesolicitudes().getAesolicitudesFesolici()))
                    return true;
            }
            return false;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator058, Method: assocOperator058";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator058
	@Override
    public Collection<ReportesDominio> assocOperator058Range1 (Solicitud instance) throws SystemException {

        SQLSelect sql = assocOperator058Range1Query(instance);
        return new TypedQueryBuilder<ReportesDominio>(em, ReportesDominio.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator058
	@Override
    public SQLPopulation assocOperator058Range1Query (Solicitud instance) throws SystemException {
        try {
            SQLPopulation sql = new SQLPopulation(SolicitudConstants.CLASS_NAME, ReportesDominioConstants.CLASS_NAME, instance.getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_DOMINIO + "." + DominioConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    if (instance.getAesolicitudes().isNull() || instance.getAesolicitudes().getPlanT().isNull())
                    {
                    comparison1.setSecondOperand(new SQLWhereOperandNull());
                    }
                    else
                    {
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, instance.getAesolicitudes().getPlanT().getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT);
                    comparison1.setSecondOperand(operand223);
                    }
                    conjunction.addOperand(comparison1);


            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 5
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_PLANTILLAREPORTE + "." + PlantillaReporteConstants.ATTR_NAME_PLANTILLAREPORTETIPO, Constants.Type.NAT.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(5), Constants.Type.NAT.getTypeName()));
                    conjunction.addOperand(comparison2);


            // Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici
                    // '<=' Comparison
                    SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
                    comparison3.setOperator("<=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_PLANTILLAREPORTE + "." + PlantillaReporteConstants.ATTR_NAME_PLANTILLAREPORTEFECHAVIGENCIA, Constants.Type.DATE.getTypeName());
                    comparison3.setFirstOperand(operand114);
                    
                    // Operand 2
                    if (instance.getAesolicitudes().getAesolicitudesFesolici()!= null){
                    comparison3.setSecondOperand(new SQLWhereOperandLiteral(instance.getAesolicitudes().getAesolicitudesFesolici(), Constants.Type.DATE.getTypeName()));
                    } else {
                    comparison3.setSecondOperand(new SQLWhereOperandNull());
                    }
                    conjunction.addOperand(comparison3);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator058, Method: assocOperator058Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator059
	@Override
    public Boolean assocOperator059(Solicitud instance) throws SystemException {
        try {
            // EXIST (Usuarios) WHERE (Usuarios.EstadoBeneficiario.EsActivo = true)
            return assocOperator059Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator059, Method: assocOperator059";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator059
	@Override
    public Boolean assocOperator059Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator059Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator059
	@Override
    public SQLExists assocOperator059Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Usuarios.EstadoBeneficiario.EsActivo = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_ESTADOBENEFICIARIO + "." + EstadoBeneficiarioConstants.ATTR_NAME_ESTADOBENEFICIARIOESACTIVO, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator059, Method: assocOperator059Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator060
	@Override
    public Boolean assocOperator060(Solicitud instance) throws SystemException {
        try {
            // EXIST (Aesolicitudes.ProductoT.Dominios) WHERE (Aesolicitudes.ProductoT.Dominios.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.InclusionModGrupoAsoc = true)
            return assocOperator060Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator060, Method: assocOperator060";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator060
	@Override
    public Boolean assocOperator060Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator060Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator060
	@Override
    public SQLExists assocOperator060Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Aesolicitudes.ProductoT.Dominios.PlanT = Aesolicitudes.PlanT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    if (instance.getAesolicitudes().isNull() || instance.getAesolicitudes().getPlanT().isNull())
                    {
                    comparison1.setSecondOperand(new SQLWhereOperandNull());
                    }
                    else
                    {
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, instance.getAesolicitudes().getPlanT().getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT);
                    comparison1.setSecondOperand(operand223);
                    }
                    conjunction.addOperand(comparison1);


            // Aesolicitudes.ProductoT.Dominios.InclusionModGrupoAsoc = true
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ATTR_NAME_DOMINIOINCLUSIONMODGRUPOASOC, Constants.Type.BOOL.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator060, Method: assocOperator060Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator061
	@Override
    public Boolean assocOperator061(Solicitud instance) throws SystemException {
        try {
            // EXIST (Aesolicitudes.ProductoT.Dominios) WHERE (Aesolicitudes.ProductoT.Dominios.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.AcepPolizaInter = true)
            return assocOperator061Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator061, Method: assocOperator061";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator061
	@Override
    public Boolean assocOperator061Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator061Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator061
	@Override
    public SQLExists assocOperator061Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Aesolicitudes.ProductoT.Dominios.PlanT = Aesolicitudes.PlanT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    if (instance.getAesolicitudes().isNull() || instance.getAesolicitudes().getPlanT().isNull())
                    {
                    comparison1.setSecondOperand(new SQLWhereOperandNull());
                    }
                    else
                    {
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, instance.getAesolicitudes().getPlanT().getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT);
                    comparison1.setSecondOperand(operand223);
                    }
                    conjunction.addOperand(comparison1);


            // Aesolicitudes.ProductoT.Dominios.AcepPolizaInter = true
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ATTR_NAME_DOMINIOACEPPOLIZAINTER, Constants.Type.BOOL.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator061, Method: assocOperator061Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator062
	@Override
    public Long assocOperator062(Solicitud instance) throws SystemException {
        try {
            // COUNT (Usuarios) WHERE (Usuarios.PolizaInternacional = true)
            return assocOperator062Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator062, Method: assocOperator062";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator062
	@Override
    public Long assocOperator062Range1 (Solicitud instance) throws SystemException {
        SQLCount sql = assocOperator062Range1Query(instance);
        return Long.valueOf(solveCountQuery(sql));
    }

    // Range Query 1 for AssocOperator AssocOperator062
	@Override
    public SQLCount assocOperator062Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLCount sql = new SQLCount(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Usuarios.PolizaInternacional = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ATTR_NAME_USUARIOPOLIZAINTERNACIONAL, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator062, Method: assocOperator062Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator063
	@Override
    public Boolean assocOperator063(Solicitud instance) throws SystemException {
        try {
            // EXIST (Aesolicitudes.ProductoT.Dominios) WHERE (Aesolicitudes.ProductoT.Dominios.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.PermiteRechazadosAfi = true)
            return assocOperator063Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator063, Method: assocOperator063";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator063
	@Override
    public Boolean assocOperator063Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator063Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator063
	@Override
    public SQLExists assocOperator063Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Aesolicitudes.ProductoT.Dominios.PlanT = Aesolicitudes.PlanT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    if (instance.getAesolicitudes().isNull() || instance.getAesolicitudes().getPlanT().isNull())
                    {
                    comparison1.setSecondOperand(new SQLWhereOperandNull());
                    }
                    else
                    {
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, instance.getAesolicitudes().getPlanT().getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT);
                    comparison1.setSecondOperand(operand223);
                    }
                    conjunction.addOperand(comparison1);


            // Aesolicitudes.ProductoT.Dominios.PermiteRechazadosAfi = true
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ATTR_NAME_DOMINIOPERMITERECHAZADOSAFI, Constants.Type.BOOL.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator063, Method: assocOperator063Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator064
	@Override
    public Long assocOperator064(Solicitud instance) throws SystemException {
        try {
            // COUNT (Usuarios) WHERE (Usuarios.IMC <> NULL AND Usuarios.drvEdad >= StrToReal(fugetValorParametroConf("EDADIMC")) AND Usuarios.IMC > StrToReal(fugetValorParametroConf("MAXIMC")))
            long count = 0L;
            for(Usuario item : assocOperator064Range1(instance)){
                // Usuarios.drvEdad >= StrToReal(fugetValorParametroConf("EDADIMC"))
                if(Utilities.convertToDouble(Utilities.convertToDouble(item.getUsuariodrvEdad())) >= STDFunctions.strToRealFun(userFunctionsSrv.fugetValorParametroConfFun("EDADIMC")))
                    count += 1;
            }
            return count;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator064, Method: assocOperator064";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator064
	@Override
    public Collection<Usuario> assocOperator064Range1 (Solicitud instance) throws SystemException {

        SQLSelect sql = assocOperator064Range1Query(instance);
        return new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator064
	@Override
    public SQLPopulation assocOperator064Range1Query (Solicitud instance) throws SystemException {
        try {
            SQLPopulation sql = new SQLPopulation(SolicitudConstants.CLASS_NAME, UsuarioConstants.CLASS_NAME, instance.getOid(), SolicitudConstants.ROLE_NAME_USUARIOS);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Usuarios.IMC <> NULL
                    // '<>' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("<>");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ATTR_NAME_USUARIOIMC, Constants.Type.REAL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandNull());
                    conjunction.addOperand(comparison1);


            // Usuarios.IMC > StrToReal(fugetValorParametroConf("MAXIMC"))
                    // '>' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator(">");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ATTR_NAME_USUARIOIMC, Constants.Type.REAL.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                            if (STDFunctions.strToRealFun(userFunctionsSrv.fugetValorParametroConfFun("MAXIMC")) != null) {
                                comparison2.setSecondOperand(new SQLWhereOperandLiteral(STDFunctions.strToRealFun(userFunctionsSrv.fugetValorParametroConfFun("MAXIMC")), Constants.Type.REAL.getTypeName()));
                            } else {
                                comparison2.setSecondOperand(new SQLWhereOperandNull());
                                }
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator064, Method: assocOperator064Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator065
	@Override
    public Boolean assocOperator065(Solicitud instance) throws SystemException {
        try {
            // EXIST (UsrAreaMedica)
            return assocOperator065Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator065, Method: assocOperator065";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator065
	@Override
    public Boolean assocOperator065Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator065Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator065
	@Override
    public SQLExists assocOperator065Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USRAREAMEDICA, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator065, Method: assocOperator065Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator066
	@Override
    public Boolean assocOperator066(Solicitud instance) throws SystemException {
        try {
            // EXIST (ContratantePersona)
            return assocOperator066Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator066, Method: assocOperator066";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator066
	@Override
    public Boolean assocOperator066Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator066Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator066
	@Override
    public SQLExists assocOperator066Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_CONTRATANTEPERSONA, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator066, Method: assocOperator066Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator067
	@Override
    public Long assocOperator067(Solicitud instance) throws SystemException {
        try {
            // COUNT (Aesolicitudes.ProductoT.Dominios) WHERE (Aesolicitudes.ProductoT.Dominios.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.TramiteEnLinea = true)
            return assocOperator067Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator067, Method: assocOperator067";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator067
	@Override
    public Long assocOperator067Range1 (Solicitud instance) throws SystemException {
        SQLCount sql = assocOperator067Range1Query(instance);
        return Long.valueOf(solveCountQuery(sql));
    }

    // Range Query 1 for AssocOperator AssocOperator067
	@Override
    public SQLCount assocOperator067Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLCount sql = new SQLCount(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Aesolicitudes.ProductoT.Dominios.PlanT = Aesolicitudes.PlanT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    if (instance.getAesolicitudes().isNull() || instance.getAesolicitudes().getPlanT().isNull())
                    {
                    comparison1.setSecondOperand(new SQLWhereOperandNull());
                    }
                    else
                    {
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, instance.getAesolicitudes().getPlanT().getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT);
                    comparison1.setSecondOperand(operand223);
                    }
                    conjunction.addOperand(comparison1);


            // Aesolicitudes.ProductoT.Dominios.TramiteEnLinea = true
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ATTR_NAME_DOMINIOTRAMITEENLINEA, Constants.Type.BOOL.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator067, Method: assocOperator067Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator068
	@Override
    public String assocOperator068(Solicitud instance) throws SystemException {
        try {
            // GETONE (Aesolicitudes.PlanT.Tarifas.Codigo) WHERE (Aesolicitudes.PlanT.Tarifas.ProductoT = Aesolicitudes.ProductoT AND Aesolicitudes.PlanT.Tarifas.TipoContrato = tipoContrato AND EXIST (Aesolicitudes.PlanT.Tarifas.DetallesTarifa) WHERE (Aesolicitudes.PlanT.Tarifas.DetallesTarifa.Anyo = getYear(FInicioContrato)) = true)
            return assocOperator068Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator068, Method: assocOperator068";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator068
	@Override
    public String assocOperator068Range1 (Solicitud instance) throws SystemException {
        SQLGetOne sql = assocOperator068Range1Query(instance);
        List<String> results = new TypedQueryBuilder<String>(em, String.class).build(sql).execute();
        return !results.isEmpty() ? results.get(0) : null;
    }

    // Range Query 1 for AssocOperator AssocOperator068
	@Override
    public SQLGetOne assocOperator068Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLGetOne sql = new SQLGetOne(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_TARIFAS + "." + TarifaConstants.ATTR_NAME_TARIFACODIGO, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Aesolicitudes.PlanT.Tarifas.ProductoT = Aesolicitudes.ProductoT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_TARIFAS + "." + TarifaConstants.ROLE_NAME_PRODUCTOT, ProductosConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT, ProductosConstants.CLASS_NAME, ProductosConstants.CLASS_NAME, instance.getAesolicitudes().getProductoT().getOid(), SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT);
                    comparison1.setSecondOperand(operand223);
                    conjunction.addOperand(comparison1);


            // Aesolicitudes.PlanT.Tarifas.TipoContrato = tipoContrato
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_TARIFAS + "." + TarifaConstants.ATTR_NAME_TARIFATIPOCONTRATO, Constants.Type.NAT.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(instance.getSolicitudtipoContrato(), Constants.Type.NAT.getTypeName()));
                    conjunction.addOperand(comparison2);


            // EXIST (Aesolicitudes.PlanT.Tarifas.DetallesTarifa) WHERE (Aesolicitudes.PlanT.Tarifas.DetallesTarifa.Anyo = getYear(FInicioContrato)) = true
                // 'exist' Association operator
                SQLWhereOperandSubQuery operandSubQueryAssocOperator069 = new SQLWhereOperandSubQuery(assocOperator069Range1Query(instance, sql));
                conjunction.addOperand(operandSubQueryAssocOperator069);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator068, Method: assocOperator068Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator069
	@Override
    public Boolean assocOperator069(Solicitud instance) throws SystemException {
        try {
            // EXIST (Aesolicitudes.PlanT.Tarifas.DetallesTarifa) WHERE (Aesolicitudes.PlanT.Tarifas.DetallesTarifa.Anyo = getYear(FInicioContrato))
            return assocOperator069Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator069, Method: assocOperator069";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator069
	@Override
    public Boolean assocOperator069Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator069Range1Query(instance, null);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator069
	@Override
    public SQLExists assocOperator069Range1Query (Solicitud instance, SQLSelect superQuery) throws SystemException {
        try {
            // Path starts with a class in the subquery
            SQLExists sql = new SQLExists(superQuery, SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_TARIFAS + "." + TarifaConstants.ROLE_NAME_DETALLESTARIFA);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Aesolicitudes.PlanT.Tarifas.DetallesTarifa.Anyo = getYear(FInicioContrato)
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_TARIFAS + "." + TarifaConstants.ROLE_NAME_DETALLESTARIFA + "." + DetalleTarifaConstants.ATTR_NAME_DETALLETARIFAANYO, Constants.Type.INT.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                            if (STDFunctions.getYearFun(instance.getSolicitudFInicioContrato()) != null) {
                                comparison1.setSecondOperand(new SQLWhereOperandLiteral(STDFunctions.getYearFun(instance.getSolicitudFInicioContrato()), Constants.Type.INT.getTypeName()));
                            } else {
                                comparison1.setSecondOperand(new SQLWhereOperandNull());
                                }
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator069, Method: assocOperator069Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator070
	@Override
    public Boolean assocOperator070(Solicitud instance) throws SystemException {
        try {
            // EXIST (TitularPersona)
            return assocOperator070Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator070, Method: assocOperator070";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator070
	@Override
    public Boolean assocOperator070Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator070Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator070
	@Override
    public SQLExists assocOperator070Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_TITULARPERSONA, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator070, Method: assocOperator070Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator071
	@Override
    public Boolean assocOperator071() throws SystemException {
        try {
            // EXIST (ContratoC)
            return assocOperator071Range1();
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator071, Method: assocOperator071";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 0 for AssocOperator AssocOperator071
	@Override
    public Boolean assocOperator071Range1 () throws SystemException {
        SQLExists sql = assocOperator071Range1Query(null);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 0 for AssocOperator AssocOperator071
	@Override
    public SQLExists assocOperator071Range1Query (SQLSelect superQuery) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(superQuery, SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_CONTRATOC);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator071, Method: assocOperator071Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator072
	@Override
    public Long assocOperator072() throws SystemException {
        try {
            // COUNT (Usuarios)
            return assocOperator072Range1();
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator072, Method: assocOperator072";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 0 for AssocOperator AssocOperator072
	@Override
    public Long assocOperator072Range1 () throws SystemException {
        SQLCount sql = assocOperator072Range1Query(null);
        return Long.valueOf(solveCountQuery(sql));
    }

    // Range Query 0 for AssocOperator AssocOperator072
	@Override
    public SQLCount assocOperator072Range1Query (SQLSelect superQuery) throws SystemException {
        try {
            // The path starts with a role
            return new SQLCount(superQuery, SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOS);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator072, Method: assocOperator072Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator073
	@Override
    public Long assocOperator073() throws SystemException {
        try {
            // COUNT (Usuarios) WHERE (Usuarios.EstadoBeneficiario.Confirmado = true)
            return assocOperator073Range1();
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator073, Method: assocOperator073";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 0 for AssocOperator AssocOperator073
	@Override
    public Long assocOperator073Range1 () throws SystemException {
        SQLCount sql = assocOperator073Range1Query(null);
        return Long.valueOf(solveCountQuery(sql));
    }

    // Range Query 0 for AssocOperator AssocOperator073
	@Override
    public SQLCount assocOperator073Range1Query (SQLSelect superQuery) throws SystemException {
        try {
            // The path starts with a role
            SQLCount sql = new SQLCount(superQuery, SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOS);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Usuarios.EstadoBeneficiario.Confirmado = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_ESTADOBENEFICIARIO + "." + EstadoBeneficiarioConstants.ATTR_NAME_ESTADOBENEFICIARIOCONFIRMADO, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator073, Method: assocOperator073Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator074
	@Override
    public Boolean assocOperator074(TipoIdentificacion vTipoDoc, String vNumDoc) throws SystemException {
        try {
            // EXIST (Usuarios) WHERE (Usuarios.TipoIdentificacion = vTipoDoc AND Usuarios.NumIdentificacion = vNumDoc)
            return assocOperator074Range1(vTipoDoc, vNumDoc);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator074, Method: assocOperator074";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 0 for AssocOperator AssocOperator074
	@Override
    public Boolean assocOperator074Range1 (TipoIdentificacion vTipoDoc, String vNumDoc) throws SystemException {
        SQLExists sql = assocOperator074Range1Query(vTipoDoc, vNumDoc, null);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 0 for AssocOperator AssocOperator074
	@Override
    public SQLExists assocOperator074Range1Query (TipoIdentificacion vTipoDoc, String vNumDoc, SQLSelect superQuery) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(superQuery, SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOS);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Usuarios.TipoIdentificacion = vTipoDoc
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VTIPODOC, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, vTipoDoc.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSADMIN_VTIPODOC);
                    comparison1.setSecondOperand(operand223);
                    conjunction.addOperand(comparison1);


            // Usuarios.NumIdentificacion = vNumDoc
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ATTR_NAME_USUARIONUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(vNumDoc, Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator074, Method: assocOperator074Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator075
	@Override
    public Boolean assocOperator075(Persona voPersona) throws SystemException {
        try {
            // EXIST (Usuarios) WHERE (Usuarios.UsuarioPersona.TipoIdentificacion = voPersona.TipoIdentificacion AND Usuarios.UsuarioPersona.NumIdentificacion = voPersona.NumIdentificacion)
            return assocOperator075Range1(voPersona);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator075, Method: assocOperator075";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 0 for AssocOperator AssocOperator075
	@Override
    public Boolean assocOperator075Range1 (Persona voPersona) throws SystemException {
        SQLExists sql = assocOperator075Range1Query(voPersona, null);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 0 for AssocOperator AssocOperator075
	@Override
    public SQLExists assocOperator075Range1Query (Persona voPersona, SQLSelect superQuery) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(superQuery, SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOS);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Usuarios.UsuarioPersona.TipoIdentificacion = voPersona.TipoIdentificacion
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_USUARIOPERSONA + "." + PersonaConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    if (voPersona.isNull() || voPersona.getTipoIdentificacion().isNull())
                    {
                    comparison1.setSecondOperand(new SQLWhereOperandNull());
                    }
                    else
                    {
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDCONTRATANTETITULAR_VOPERSONA + "." + PersonaConstants.ROLE_NAME_TIPOIDENTIFICACION, PersonaConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, voPersona.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDCONTRATANTETITULAR_VOPERSONA);
                    comparison1.setSecondOperand(operand223);
                    }
                    conjunction.addOperand(comparison1);


            // Usuarios.UsuarioPersona.NumIdentificacion = voPersona.NumIdentificacion
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_USUARIOPERSONA + "." + PersonaConstants.ATTR_NAME_PERSONANUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    if (voPersona.getPersonaNumIdentificacion()!= null){
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(voPersona.getPersonaNumIdentificacion(), Constants.Type.STRING.getTypeName()));
                    } else {
                    comparison2.setSecondOperand(new SQLWhereOperandNull());
                    }
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator075, Method: assocOperator075Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator076
	@Override
    public Boolean assocOperator076() throws SystemException {
        try {
            // EXIST (ContratoC)
            return assocOperator076Range1();
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator076, Method: assocOperator076";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 0 for AssocOperator AssocOperator076
	@Override
    public Boolean assocOperator076Range1 () throws SystemException {
        SQLExists sql = assocOperator076Range1Query(null);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 0 for AssocOperator AssocOperator076
	@Override
    public SQLExists assocOperator076Range1Query (SQLSelect superQuery) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(superQuery, SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_CONTRATOC);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator076, Method: assocOperator076Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator077
	@Override
    public Long assocOperator077() throws SystemException {
        try {
            // COUNT (Usuarios)
            return assocOperator077Range1();
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator077, Method: assocOperator077";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 0 for AssocOperator AssocOperator077
	@Override
    public Long assocOperator077Range1 () throws SystemException {
        SQLCount sql = assocOperator077Range1Query(null);
        return Long.valueOf(solveCountQuery(sql));
    }

    // Range Query 0 for AssocOperator AssocOperator077
	@Override
    public SQLCount assocOperator077Range1Query (SQLSelect superQuery) throws SystemException {
        try {
            // The path starts with a role
            return new SQLCount(superQuery, SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOS);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator077, Method: assocOperator077Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator078
	@Override
    public Long assocOperator078() throws SystemException {
        try {
            // COUNT (Usuarios) WHERE (Usuarios.EstadoBeneficiario.Confirmado = true)
            return assocOperator078Range1();
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator078, Method: assocOperator078";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 0 for AssocOperator AssocOperator078
	@Override
    public Long assocOperator078Range1 () throws SystemException {
        SQLCount sql = assocOperator078Range1Query(null);
        return Long.valueOf(solveCountQuery(sql));
    }

    // Range Query 0 for AssocOperator AssocOperator078
	@Override
    public SQLCount assocOperator078Range1Query (SQLSelect superQuery) throws SystemException {
        try {
            // The path starts with a role
            SQLCount sql = new SQLCount(superQuery, SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOS);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Usuarios.EstadoBeneficiario.Confirmado = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_ESTADOBENEFICIARIO + "." + EstadoBeneficiarioConstants.ATTR_NAME_ESTADOBENEFICIARIOCONFIRMADO, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator078, Method: assocOperator078Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator079
	@Override
    public Boolean assocOperator079(TipoIdentificacion voTipoDoc, String vNumDoc) throws SystemException {
        try {
            // EXIST (Contratante) WHERE (Contratante.TipoIdentificacion = voTipoDoc AND Contratante.NumIdentificacion = vNumDoc)
            return assocOperator079Range1(voTipoDoc, vNumDoc);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator079, Method: assocOperator079";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 0 for AssocOperator AssocOperator079
	@Override
    public Boolean assocOperator079Range1 (TipoIdentificacion voTipoDoc, String vNumDoc) throws SystemException {
        SQLExists sql = assocOperator079Range1Query(voTipoDoc, vNumDoc, null);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 0 for AssocOperator AssocOperator079
	@Override
    public SQLExists assocOperator079Range1Query (TipoIdentificacion voTipoDoc, String vNumDoc, SQLSelect superQuery) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(superQuery, SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_CONTRATANTE);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Contratante.TipoIdentificacion = voTipoDoc
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_CONTRATANTE + "." + ContratanteConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDCONSULTARADICADO_VOTIPODOC, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, voTipoDoc.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDCONSULTARADICADO_VOTIPODOC);
                    comparison1.setSecondOperand(operand223);
                    conjunction.addOperand(comparison1);


            // Contratante.NumIdentificacion = vNumDoc
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_CONTRATANTE + "." + ContratanteConstants.ATTR_NAME_CONTRATANTENUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(vNumDoc, Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator079, Method: assocOperator079Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator080
	@Override
    public Boolean assocOperator080(TipoIdentificacion voTipoDoc, String vNumDoc) throws SystemException {
        try {
            // EXIST (Titular) WHERE (Titular.TipoIdentificacion = voTipoDoc AND Titular.NumIdentificacion = vNumDoc)
            return assocOperator080Range1(voTipoDoc, vNumDoc);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator080, Method: assocOperator080";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 0 for AssocOperator AssocOperator080
	@Override
    public Boolean assocOperator080Range1 (TipoIdentificacion voTipoDoc, String vNumDoc) throws SystemException {
        SQLExists sql = assocOperator080Range1Query(voTipoDoc, vNumDoc, null);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 0 for AssocOperator AssocOperator080
	@Override
    public SQLExists assocOperator080Range1Query (TipoIdentificacion voTipoDoc, String vNumDoc, SQLSelect superQuery) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(superQuery, SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_TITULAR);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Titular.TipoIdentificacion = voTipoDoc
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_TITULAR + "." + TitularConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDCONSULTARADICADO_VOTIPODOC, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, voTipoDoc.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDCONSULTARADICADO_VOTIPODOC);
                    comparison1.setSecondOperand(operand223);
                    conjunction.addOperand(comparison1);


            // Titular.NumIdentificacion = vNumDoc
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_TITULAR + "." + TitularConstants.ATTR_NAME_TITULARNUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(vNumDoc, Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator080, Method: assocOperator080Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator081
	@Override
    public Boolean assocOperator081(TipoIdentificacion voTipoDoc, String vNumDoc) throws SystemException {
        try {
            // EXIST (Usuarios) WHERE (Usuarios.TipoIdentificacion = voTipoDoc AND Usuarios.NumIdentificacion = vNumDoc)
            return assocOperator081Range1(voTipoDoc, vNumDoc);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator081, Method: assocOperator081";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 0 for AssocOperator AssocOperator081
	@Override
    public Boolean assocOperator081Range1 (TipoIdentificacion voTipoDoc, String vNumDoc) throws SystemException {
        SQLExists sql = assocOperator081Range1Query(voTipoDoc, vNumDoc, null);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 0 for AssocOperator AssocOperator081
	@Override
    public SQLExists assocOperator081Range1Query (TipoIdentificacion voTipoDoc, String vNumDoc, SQLSelect superQuery) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(superQuery, SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOS);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Usuarios.TipoIdentificacion = voTipoDoc
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDCONSULTARADICADO_VOTIPODOC, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, voTipoDoc.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDCONSULTARADICADO_VOTIPODOC);
                    comparison1.setSecondOperand(operand223);
                    conjunction.addOperand(comparison1);


            // Usuarios.NumIdentificacion = vNumDoc
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ATTR_NAME_USUARIONUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(vNumDoc, Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator081, Method: assocOperator081Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator082
	@Override
    public Boolean assocOperator082(TipoIdentificacion vTipoDoc, String vNumDoc) throws SystemException {
        try {
            // EXIST (Usuarios) WHERE (Usuarios.TipoIdentificacion = vTipoDoc AND Usuarios.NumIdentificacion = vNumDoc)
            return assocOperator082Range1(vTipoDoc, vNumDoc);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator082, Method: assocOperator082";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 0 for AssocOperator AssocOperator082
	@Override
    public Boolean assocOperator082Range1 (TipoIdentificacion vTipoDoc, String vNumDoc) throws SystemException {
        SQLExists sql = assocOperator082Range1Query(vTipoDoc, vNumDoc, null);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 0 for AssocOperator AssocOperator082
	@Override
    public SQLExists assocOperator082Range1Query (TipoIdentificacion vTipoDoc, String vNumDoc, SQLSelect superQuery) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(superQuery, SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOS);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Usuarios.TipoIdentificacion = vTipoDoc
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VTIPODOC, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, vTipoDoc.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL1_VTIPODOC);
                    comparison1.setSecondOperand(operand223);
                    conjunction.addOperand(comparison1);


            // Usuarios.NumIdentificacion = vNumDoc
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ATTR_NAME_USUARIONUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(vNumDoc, Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator082, Method: assocOperator082Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator083
	@Override
    public Boolean assocOperator083(TipoIdentificacion vTipoDoc, String vNumDoc) throws SystemException {
        try {
            // EXIST (Usuarios) WHERE (Usuarios.TipoIdentificacion = vTipoDoc AND Usuarios.NumIdentificacion = vNumDoc)
            return assocOperator083Range1(vTipoDoc, vNumDoc);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator083, Method: assocOperator083";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 0 for AssocOperator AssocOperator083
	@Override
    public Boolean assocOperator083Range1 (TipoIdentificacion vTipoDoc, String vNumDoc) throws SystemException {
        SQLExists sql = assocOperator083Range1Query(vTipoDoc, vNumDoc, null);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 0 for AssocOperator AssocOperator083
	@Override
    public SQLExists assocOperator083Range1Query (TipoIdentificacion vTipoDoc, String vNumDoc, SQLSelect superQuery) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(superQuery, SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOS);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Usuarios.TipoIdentificacion = vTipoDoc
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VTIPODOC, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, vTipoDoc.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL2_VTIPODOC);
                    comparison1.setSecondOperand(operand223);
                    conjunction.addOperand(comparison1);


            // Usuarios.NumIdentificacion = vNumDoc
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ATTR_NAME_USUARIONUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(vNumDoc, Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator083, Method: assocOperator083Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator084
	@Override
    public Boolean assocOperator084(TipoIdentificacion vTipoDoc, String vNumDoc) throws SystemException {
        try {
            // EXIST (Usuarios) WHERE (Usuarios.TipoIdentificacion = vTipoDoc AND Usuarios.NumIdentificacion = vNumDoc)
            return assocOperator084Range1(vTipoDoc, vNumDoc);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator084, Method: assocOperator084";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 0 for AssocOperator AssocOperator084
	@Override
    public Boolean assocOperator084Range1 (TipoIdentificacion vTipoDoc, String vNumDoc) throws SystemException {
        SQLExists sql = assocOperator084Range1Query(vTipoDoc, vNumDoc, null);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 0 for AssocOperator AssocOperator084
	@Override
    public SQLExists assocOperator084Range1Query (TipoIdentificacion vTipoDoc, String vNumDoc, SQLSelect superQuery) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(superQuery, SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOS);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Usuarios.TipoIdentificacion = vTipoDoc
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VTIPODOC, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, vTipoDoc.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSAFIL3_VTIPODOC);
                    comparison1.setSecondOperand(operand223);
                    conjunction.addOperand(comparison1);


            // Usuarios.NumIdentificacion = vNumDoc
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ATTR_NAME_USUARIONUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(vNumDoc, Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator084, Method: assocOperator084Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator085
	@Override
    public Boolean assocOperator085(TipoIdentificacion vTipoDoc, String vNumDoc) throws SystemException {
        try {
            // EXIST (Usuarios) WHERE (Usuarios.TipoIdentificacion = vTipoDoc AND Usuarios.NumIdentificacion = vNumDoc)
            return assocOperator085Range1(vTipoDoc, vNumDoc);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator085, Method: assocOperator085";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 0 for AssocOperator AssocOperator085
	@Override
    public Boolean assocOperator085Range1 (TipoIdentificacion vTipoDoc, String vNumDoc) throws SystemException {
        SQLExists sql = assocOperator085Range1Query(vTipoDoc, vNumDoc, null);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 0 for AssocOperator AssocOperator085
	@Override
    public SQLExists assocOperator085Range1Query (TipoIdentificacion vTipoDoc, String vNumDoc, SQLSelect superQuery) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(superQuery, SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOS);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Usuarios.TipoIdentificacion = vTipoDoc
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VTIPODOC, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, vTipoDoc.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED1_VTIPODOC);
                    comparison1.setSecondOperand(operand223);
                    conjunction.addOperand(comparison1);


            // Usuarios.NumIdentificacion = vNumDoc
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ATTR_NAME_USUARIONUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(vNumDoc, Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator085, Method: assocOperator085Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator086
	@Override
    public Boolean assocOperator086(TipoIdentificacion vTipoDoc, String vNumDoc) throws SystemException {
        try {
            // EXIST (Usuarios) WHERE (Usuarios.TipoIdentificacion = vTipoDoc AND Usuarios.NumIdentificacion = vNumDoc)
            return assocOperator086Range1(vTipoDoc, vNumDoc);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator086, Method: assocOperator086";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 0 for AssocOperator AssocOperator086
	@Override
    public Boolean assocOperator086Range1 (TipoIdentificacion vTipoDoc, String vNumDoc) throws SystemException {
        SQLExists sql = assocOperator086Range1Query(vTipoDoc, vNumDoc, null);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 0 for AssocOperator AssocOperator086
	@Override
    public SQLExists assocOperator086Range1Query (TipoIdentificacion vTipoDoc, String vNumDoc, SQLSelect superQuery) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(superQuery, SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOS);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Usuarios.TipoIdentificacion = vTipoDoc
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VTIPODOC, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, vTipoDoc.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED2_VTIPODOC);
                    comparison1.setSecondOperand(operand223);
                    conjunction.addOperand(comparison1);


            // Usuarios.NumIdentificacion = vNumDoc
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ATTR_NAME_USUARIONUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(vNumDoc, Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator086, Method: assocOperator086Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator087
	@Override
    public Boolean assocOperator087(TipoIdentificacion vTipoDoc, String vNumDoc) throws SystemException {
        try {
            // EXIST (Usuarios) WHERE (Usuarios.TipoIdentificacion = vTipoDoc AND Usuarios.NumIdentificacion = vNumDoc)
            return assocOperator087Range1(vTipoDoc, vNumDoc);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator087, Method: assocOperator087";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 0 for AssocOperator AssocOperator087
	@Override
    public Boolean assocOperator087Range1 (TipoIdentificacion vTipoDoc, String vNumDoc) throws SystemException {
        SQLExists sql = assocOperator087Range1Query(vTipoDoc, vNumDoc, null);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 0 for AssocOperator AssocOperator087
	@Override
    public SQLExists assocOperator087Range1Query (TipoIdentificacion vTipoDoc, String vNumDoc, SQLSelect superQuery) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(superQuery, SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOS);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Usuarios.TipoIdentificacion = vTipoDoc
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VTIPODOC, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, vTipoDoc.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDESTATUSAREAMED3_VTIPODOC);
                    comparison1.setSecondOperand(operand223);
                    conjunction.addOperand(comparison1);


            // Usuarios.NumIdentificacion = vNumDoc
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ATTR_NAME_USUARIONUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(vNumDoc, Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator087, Method: assocOperator087Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator088
	@Override
    public Boolean assocOperator088(TipoIdentificacion vTipoDoc, String vNumDoc) throws SystemException {
        try {
            // EXIST (Usuarios) WHERE (Usuarios.TipoIdentificacion = vTipoDoc AND Usuarios.NumIdentificacion = vNumDoc)
            return assocOperator088Range1(vTipoDoc, vNumDoc);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator088, Method: assocOperator088";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 0 for AssocOperator AssocOperator088
	@Override
    public Boolean assocOperator088Range1 (TipoIdentificacion vTipoDoc, String vNumDoc) throws SystemException {
        SQLExists sql = assocOperator088Range1Query(vTipoDoc, vNumDoc, null);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 0 for AssocOperator AssocOperator088
	@Override
    public SQLExists assocOperator088Range1Query (TipoIdentificacion vTipoDoc, String vNumDoc, SQLSelect superQuery) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(superQuery, SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USUARIOS);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Usuarios.TipoIdentificacion = vTipoDoc
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_TIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VTIPODOC, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, vTipoDoc.getOid(), SolicitudConstants.VAR_NAME_FSOLICITUDSTATUSESTHOMO_VTIPODOC);
                    comparison1.setSecondOperand(operand223);
                    conjunction.addOperand(comparison1);


            // Usuarios.NumIdentificacion = vNumDoc
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ATTR_NAME_USUARIONUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(vNumDoc, Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator088, Method: assocOperator088Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator158
	@Override
    public Collection<Direccion> assocOperator158(Persona solicitudTCREAROMODCONTRATANTEptPersonaContratante) throws SystemException {
        try {
            // FOR ALL ptPersonaContratante.Direcciones WHERE (ptPersonaContratante.Direcciones.TipoDireccion = fugetTipoDirResidencial()) DO Contratante.TSETDIRECCIONRES(Contratante, ptPersonaContratante.Direcciones.DireccionCompleta, ptPersonaContratante.Direcciones.Departamento, ptPersonaContratante.Direcciones.Municipio, ptPersonaContratante.Direcciones.Rural)
        return assocOperator158Range1(solicitudTCREAROMODCONTRATANTEptPersonaContratante);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator158, Method: assocOperator158";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator158
	@Override
    public Collection<Direccion> assocOperator158Range1 (Persona solicitudTCREAROMODCONTRATANTEptPersonaContratante) throws SystemException {

        SQLSelect sql = assocOperator158Range1Query(solicitudTCREAROMODCONTRATANTEptPersonaContratante);
        return new TypedQueryBuilder<Direccion>(em, Direccion.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator158
	@Override
    public SQLPopulation assocOperator158Range1Query (Persona solicitudTCREAROMODCONTRATANTEptPersonaContratante) throws SystemException {
        try {
            SQLPopulation sql = new SQLPopulation(SolicitudConstants.CLASS_NAME, DireccionConstants.CLASS_NAME, SolicitudConstants.ARG_NAME_TCREAROMODCONTRATANTE_SOLICITUDTCREAROMODCONTRATANTEPTPERSONACONTRATANTE + "." + PersonaConstants.ROLE_NAME_DIRECCIONES, solicitudTCREAROMODCONTRATANTEptPersonaContratante.getOid(), SolicitudConstants.ARG_NAME_TCREAROMODCONTRATANTE_SOLICITUDTCREAROMODCONTRATANTEPTPERSONACONTRATANTE);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // ptPersonaContratante.Direcciones.TipoDireccion = fugetTipoDirResidencial()
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandOVParameter operand112 = new SQLWhereOperandOVParameter(SolicitudConstants.ARG_NAME_TCREAROMODCONTRATANTE_SOLICITUDTCREAROMODCONTRATANTEPTPERSONACONTRATANTE + "." + PersonaConstants.ROLE_NAME_DIRECCIONES + "." + DireccionConstants.ROLE_NAME_TIPODIRECCION, PersonaConstants.CLASS_NAME, TipoDireccionConstants.CLASS_NAME, solicitudTCREAROMODCONTRATANTEptPersonaContratante.getOid(), SolicitudConstants.ARG_NAME_TCREAROMODCONTRATANTE_SOLICITUDTCREAROMODCONTRATANTEPTPERSONACONTRATANTE);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    if (userFunctionsSrv.fugetTipoDirResidencialFun() == null ||
                        userFunctionsSrv.fugetTipoDirResidencialFun().isNull())
                    {
                        SQLWhereOperandNull operand = new SQLWhereOperandNull();
                    comparison1.setSecondOperand(operand);
                    } else {
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(Constants.UF_NAME_FUGETTIPODIRRESIDENCIAL, TipoDireccionConstants.CLASS_NAME, TipoDireccionConstants.CLASS_NAME, userFunctionsSrv.fugetTipoDirResidencialFun().getOid(), Constants.UF_NAME_FUGETTIPODIRRESIDENCIAL);
                    comparison1.setSecondOperand(operand223);
                    }
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator158, Method: assocOperator158Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator159
	@Override
    public Collection<Direccion> assocOperator159(Persona solicitudTCREAROMODCONTRATANTEptPersonaContratante) throws SystemException {
        try {
            // FOR ALL ptPersonaContratante.Direcciones WHERE (ptPersonaContratante.Direcciones.TipoDireccion = fugetTipoDirCorrespondencia()) DO Contratante.TSETDIRECCIONRES(Contratante, ptPersonaContratante.Direcciones.DireccionCompleta, ptPersonaContratante.Direcciones.Departamento, ptPersonaContratante.Direcciones.Municipio, ptPersonaContratante.Direcciones.Rural)
        return assocOperator159Range1(solicitudTCREAROMODCONTRATANTEptPersonaContratante);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator159, Method: assocOperator159";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator159
	@Override
    public Collection<Direccion> assocOperator159Range1 (Persona solicitudTCREAROMODCONTRATANTEptPersonaContratante) throws SystemException {

        SQLSelect sql = assocOperator159Range1Query(solicitudTCREAROMODCONTRATANTEptPersonaContratante);
        return new TypedQueryBuilder<Direccion>(em, Direccion.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator159
	@Override
    public SQLPopulation assocOperator159Range1Query (Persona solicitudTCREAROMODCONTRATANTEptPersonaContratante) throws SystemException {
        try {
            SQLPopulation sql = new SQLPopulation(SolicitudConstants.CLASS_NAME, DireccionConstants.CLASS_NAME, SolicitudConstants.ARG_NAME_TCREAROMODCONTRATANTE_SOLICITUDTCREAROMODCONTRATANTEPTPERSONACONTRATANTE + "." + PersonaConstants.ROLE_NAME_DIRECCIONES, solicitudTCREAROMODCONTRATANTEptPersonaContratante.getOid(), SolicitudConstants.ARG_NAME_TCREAROMODCONTRATANTE_SOLICITUDTCREAROMODCONTRATANTEPTPERSONACONTRATANTE);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // ptPersonaContratante.Direcciones.TipoDireccion = fugetTipoDirCorrespondencia()
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandOVParameter operand112 = new SQLWhereOperandOVParameter(SolicitudConstants.ARG_NAME_TCREAROMODCONTRATANTE_SOLICITUDTCREAROMODCONTRATANTEPTPERSONACONTRATANTE + "." + PersonaConstants.ROLE_NAME_DIRECCIONES + "." + DireccionConstants.ROLE_NAME_TIPODIRECCION, PersonaConstants.CLASS_NAME, TipoDireccionConstants.CLASS_NAME, solicitudTCREAROMODCONTRATANTEptPersonaContratante.getOid(), SolicitudConstants.ARG_NAME_TCREAROMODCONTRATANTE_SOLICITUDTCREAROMODCONTRATANTEPTPERSONACONTRATANTE);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    if (userFunctionsSrv.fugetTipoDirCorrespondenciaFun() == null ||
                        userFunctionsSrv.fugetTipoDirCorrespondenciaFun().isNull())
                    {
                        SQLWhereOperandNull operand = new SQLWhereOperandNull();
                    comparison1.setSecondOperand(operand);
                    } else {
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(Constants.UF_NAME_FUGETTIPODIRCORRESPONDENCIA, TipoDireccionConstants.CLASS_NAME, TipoDireccionConstants.CLASS_NAME, userFunctionsSrv.fugetTipoDirCorrespondenciaFun().getOid(), Constants.UF_NAME_FUGETTIPODIRCORRESPONDENCIA);
                    comparison1.setSecondOperand(operand223);
                    }
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator159, Method: assocOperator159Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator160
	@Override
    public Boolean assocOperator160(Solicitud instance) throws SystemException {
        try {
            // EXIST (Contratante)
            return assocOperator160Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator160, Method: assocOperator160";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator160
	@Override
    public Boolean assocOperator160Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator160Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator160
	@Override
    public SQLExists assocOperator160Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_CONTRATANTE, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator160, Method: assocOperator160Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator170
	@Override
    public Collection<Direccion> assocOperator170(Solicitud instance) throws SystemException {
        try {
            // FOR ALL TitularPersona.Direcciones WHERE (TitularPersona.Direcciones.TipoDireccion.EsResidencia = true) DO Titular.TCREAROMODDIRECCION(Titular, TitularPersona.Direcciones.TipoDireccion, TitularPersona.Direcciones.Pais, TitularPersona.Direcciones.Departamento, TitularPersona.Direcciones.Municipio, TitularPersona.Direcciones.DireccionCompleta, TitularPersona.Direcciones.Rural)
        return assocOperator170Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator170, Method: assocOperator170";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator170
	@Override
    public Collection<Direccion> assocOperator170Range1 (Solicitud instance) throws SystemException {

        SQLSelect sql = assocOperator170Range1Query(instance);
        return new TypedQueryBuilder<Direccion>(em, Direccion.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator170
	@Override
    public SQLPopulation assocOperator170Range1Query (Solicitud instance) throws SystemException {
        try {
            SQLPopulation sql = new SQLPopulation(SolicitudConstants.CLASS_NAME, DireccionConstants.CLASS_NAME, instance.getOid(), SolicitudConstants.ROLE_NAME_TITULARPERSONA + "." + PersonaConstants.ROLE_NAME_DIRECCIONES);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // TitularPersona.Direcciones.TipoDireccion.EsResidencia = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_TITULARPERSONA + "." + PersonaConstants.ROLE_NAME_DIRECCIONES + "." + DireccionConstants.ROLE_NAME_TIPODIRECCION + "." + TipoDireccionConstants.ATTR_NAME_TIPODIRECCIONESRESIDENCIA, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator170, Method: assocOperator170Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator171
	@Override
    public Boolean assocOperator171(Solicitud instance) throws SystemException {
        try {
            // EXIST (Titular)
            return assocOperator171Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator171, Method: assocOperator171";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator171
	@Override
    public Boolean assocOperator171Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator171Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator171
	@Override
    public SQLExists assocOperator171Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_TITULAR, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator171, Method: assocOperator171Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator260
	@Override
    public Boolean assocOperator260(Solicitud instance) throws SystemException {
        try {
            // EXIST (UsrAfiliacion)
            return assocOperator260Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator260, Method: assocOperator260";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator260
	@Override
    public Boolean assocOperator260Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator260Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator260
	@Override
    public SQLExists assocOperator260Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USRAFILIACION, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator260, Method: assocOperator260Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator261
	@Override
    public Boolean assocOperator261(Solicitud instance) throws SystemException {
        try {
            // EXIST (UsrAreaMedica)
            return assocOperator261Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator261, Method: assocOperator261";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator261
	@Override
    public Boolean assocOperator261Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator261Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator261
	@Override
    public SQLExists assocOperator261Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USRAREAMEDICA, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator261, Method: assocOperator261Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator264
	@Override
    public Boolean assocOperator264(Solicitud instance) throws SystemException {
        try {
            // EXIST (UsrAfiliacion)
            return assocOperator264Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator264, Method: assocOperator264";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator264
	@Override
    public Boolean assocOperator264Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator264Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator264
	@Override
    public SQLExists assocOperator264Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USRAFILIACION, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator264, Method: assocOperator264Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator265
	@Override
    public Boolean assocOperator265(Solicitud instance) throws SystemException {
        try {
            // EXIST (UsrAreaMedica)
            return assocOperator265Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator265, Method: assocOperator265";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator265
	@Override
    public Boolean assocOperator265Range1 (Solicitud instance) throws SystemException {
        SQLExists sql = assocOperator265Range1Query(instance);
        return !new TypedQueryBuilder<Solicitud>(em, Solicitud.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator265
	@Override
    public SQLExists assocOperator265Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_USRAREAMEDICA, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator265, Method: assocOperator265Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator273
	@Override
    public Long assocOperator273(Solicitud instance) throws SystemException {
        try {
            // COUNT (DocumentosGestor)
            return assocOperator273Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator273, Method: assocOperator273";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator273
	@Override
    public Long assocOperator273Range1 (Solicitud instance) throws SystemException {
        SQLCount sql = assocOperator273Range1Query(instance);
        return Long.valueOf(solveCountQuery(sql));
    }

    // Range Query 1 for AssocOperator AssocOperator273
	@Override
    public SQLCount assocOperator273Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLCount(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_DOCUMENTOSGESTOR, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator273, Method: assocOperator273Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator274
	@Override
    public Long assocOperator274(Solicitud instance) throws SystemException {
        try {
            // COUNT (DocumentosGestor) WHERE (DocumentosGestor.Estado = 1)
            return assocOperator274Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator274, Method: assocOperator274";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator274
	@Override
    public Long assocOperator274Range1 (Solicitud instance) throws SystemException {
        SQLCount sql = assocOperator274Range1Query(instance);
        return Long.valueOf(solveCountQuery(sql));
    }

    // Range Query 1 for AssocOperator AssocOperator274
	@Override
    public SQLCount assocOperator274Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLCount sql = new SQLCount(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_DOCUMENTOSGESTOR, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // DocumentosGestor.Estado = 1
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_DOCUMENTOSGESTOR + "." + DocumentoGConstants.ATTR_NAME_DOCUMENTOGESTADO, Constants.Type.NAT.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(1), Constants.Type.NAT.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator274, Method: assocOperator274Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator275
	@Override
    public Long assocOperator275(Solicitud instance) throws SystemException {
        try {
            // COUNT (DocumentosGestor) WHERE (DocumentosGestor.Estado = 3)
            return assocOperator275Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator275, Method: assocOperator275";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator275
	@Override
    public Long assocOperator275Range1 (Solicitud instance) throws SystemException {
        SQLCount sql = assocOperator275Range1Query(instance);
        return Long.valueOf(solveCountQuery(sql));
    }

    // Range Query 1 for AssocOperator AssocOperator275
	@Override
    public SQLCount assocOperator275Range1Query (Solicitud instance) throws SystemException {
        try {
            // The path starts with a role
            SQLCount sql = new SQLCount(SolicitudConstants.CLASS_NAME, SolicitudConstants.ROLE_NAME_DOCUMENTOSGESTOR, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // DocumentosGestor.Estado = 3
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(SolicitudConstants.ROLE_NAME_DOCUMENTOSGESTOR + "." + DocumentoGConstants.ATTR_NAME_DOCUMENTOGESTADO, Constants.Type.NAT.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(3), Constants.Type.NAT.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Solicitud, Assoc.Operator: AssocOperator275, Method: assocOperator275Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    @Override
    public void refreshEntity(Object object) {
        super.refreshEntity(object);
    }
}
