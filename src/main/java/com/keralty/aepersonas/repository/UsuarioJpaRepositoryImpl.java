package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.AesolicitudesConstants;
import com.keralty.aepersonas.global.BeneficiarioCConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.CuestionarioPConstants;
import com.keralty.aepersonas.global.DetalleTarifaConstants;
import com.keralty.aepersonas.global.DireccionConstants;
import com.keralty.aepersonas.global.DocumentoGConstants;
import com.keralty.aepersonas.global.DominioConstants;
import com.keralty.aepersonas.global.EstadoBeneficiarioConstants;
import com.keralty.aepersonas.global.MunicipioConstants;
import com.keralty.aepersonas.global.ParentescoConstants;
import com.keralty.aepersonas.global.ParentescoDomConstants;
import com.keralty.aepersonas.global.PersonaCConstants;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.global.PlanesConstants;
import com.keralty.aepersonas.global.PreexistenciaCConstants;
import com.keralty.aepersonas.global.PreexistenciaConstants;
import com.keralty.aepersonas.global.PreguntaConstants;
import com.keralty.aepersonas.global.PreguntaPConstants;
import com.keralty.aepersonas.global.ProductosConstants;
import com.keralty.aepersonas.global.SeccionPConstants;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.global.STDFunctions;
import com.keralty.aepersonas.global.TarifaConstants;
import com.keralty.aepersonas.global.TipoDireccionConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.global.UsuarioRegConstants;
import com.keralty.aepersonas.persistence.BeneficiarioC;
import com.keralty.aepersonas.persistence.Preexistencia;
import com.keralty.aepersonas.persistence.PreexistenciaC;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.Usuario;
import com.keralty.aepersonas.sqlutils.SQLCount;
import com.keralty.aepersonas.sqlutils.SQLExists;
import com.keralty.aepersonas.sqlutils.SQLGetOne;
import com.keralty.aepersonas.sqlutils.SQLMax;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLPopulation;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.SQLSum;
import com.keralty.aepersonas.sqlutils.SQLWhereComparison;
import com.keralty.aepersonas.sqlutils.SQLWhereConjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandLiteral;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandNull;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandOVParameter;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandOVParameterAttribute;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandPathAttribute;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandPathInstance;
import com.keralty.aepersonas.sqlutils.TypedQueryBuilder;
import com.keralty.aepersonas.utils.Agent;
import jakarta.inject.Inject;
import java.sql.Date;
import java.util.Collection;
import java.util.List;
import org.slf4j.LoggerFactory;

public class UsuarioJpaRepositoryImpl extends AbstractRepository implements UsuarioJpaRepositoryCustom {

    @Inject
    public UsuarioJpaRepositoryImpl(Agent agent, UserFunctions userFunctionsSrv) {
        super(agent, userFunctionsSrv);
    }

    @Override
    public List<Usuario> executeQuery(String jpqlQuery) {
        return getQueryBuilder().build(jpqlQuery).execute();
    }
    
    @Override
    public List<Usuario> executeQuery(String jpqlQuery, List<SQLParam> params) {
        return getQueryBuilder().build(jpqlQuery).setParameters(params).execute();
    }
    
    public Collection<Usuario> executeQuery(SQLSelect select) {
        return getQueryBuilder().build(select).execute();
    }

    private TypedQueryBuilder<Usuario> getQueryBuilder() {
        return new TypedQueryBuilder<>(em, Usuario.class);
    }

    @Override	
    public List<Usuario> solveQuery(SQLSelect select) {
        return solveQuery(select, 0, 0);
    }

    @Override
    public List<Usuario> solveQuery(SQLSelect select, int pageSize, int pageNumber) {
        return getQueryBuilder().build(select, pageSize, pageNumber).execute();
    }

    @Override
    public Long nextUsuarioIdentificador(Long aesolicitudesidsolicitud) {
        try {
            SQLMax sql = new SQLMax(null, UsuarioConstants.CLASS_NAME, UsuarioConstants.CLASS_NAME + "." + UsuarioConstants.ATTR_FIELD_USUARIOIDENTIFICADOR);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_FIELD_AESOLICITUDESIDSOLICITUD, "Autonumerico"));
            comparison1.setOperator("=");
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(aesolicitudesidsolicitud, "Autonumerico"));
            conjunction.addComparison(comparison1);

            sql.getWherePart().addConjunction(conjunction);

            Long tempResult = new TypedQueryBuilder<>(em, Long.class).build(sql).getSingleResult();
            return (tempResult != null ? tempResult + 1L : 1L);
        } catch (Exception e) {
            LoggerFactory.getLogger(Usuario.class).error(e.getMessage());
            return 1L;
        }
    }

    // AssocOperator: AssocOperator000
	@Override
    public Boolean assocOperator000(Usuario instance) throws SystemException {
        try {
            // EXIST (Parentesco)
            return assocOperator000Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator000, Method: assocOperator000";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator000
	@Override
    public Boolean assocOperator000Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator000Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator000
	@Override
    public SQLExists assocOperator000Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_PARENTESCO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator000, Method: assocOperator000Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator001
	@Override
    public Boolean assocOperator001(Usuario instance) throws SystemException {
        try {
            // EXIST (CuestionarioP)
            return assocOperator001Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator001, Method: assocOperator001";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator001
	@Override
    public Boolean assocOperator001Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator001Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator001
	@Override
    public SQLExists assocOperator001Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_CUESTIONARIOP, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator001, Method: assocOperator001Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator002
	@Override
    public Boolean assocOperator002(Usuario instance) throws SystemException {
        try {
            // EXIST (Solicitud.Aesolicitudes.ProductoT.Dominios) WHERE (Solicitud.Aesolicitudes.ProductoT.Dominios.PlanT = Solicitud.Aesolicitudes.PlanT AND Solicitud.Aesolicitudes.ProductoT.Dominios.AcepCuesMat = true)
            return assocOperator002Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator002, Method: assocOperator002";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator002
	@Override
    public Boolean assocOperator002Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator002Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator002
	@Override
    public SQLExists assocOperator002Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Solicitud.Aesolicitudes.ProductoT.Dominios.PlanT = Solicitud.Aesolicitudes.PlanT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    if (instance.getSolicitud().isNull() || instance.getSolicitud().getAesolicitudes().getPlanT().isNull())
                    {
                    comparison1.setSecondOperand(new SQLWhereOperandNull());
                    }
                    else
                    {
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, instance.getSolicitud().getAesolicitudes().getPlanT().getOid(), UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT);
                    comparison1.setSecondOperand(operand223);
                    }
                    conjunction.addOperand(comparison1);


            // Solicitud.Aesolicitudes.ProductoT.Dominios.AcepCuesMat = true
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ATTR_NAME_DOMINIOACEPCUESMAT, Constants.Type.BOOL.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator002, Method: assocOperator002Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator003
	@Override
    public Boolean assocOperator003(Usuario instance) throws SystemException {
        try {
            // EXIST (Solicitud.Aesolicitudes.ProductoT.Dominios) WHERE (Solicitud.Aesolicitudes.ProductoT.Dominios.PlanT = Solicitud.Aesolicitudes.PlanT AND Solicitud.Aesolicitudes.ProductoT.Dominios.AcepCuesNeo = true)
            return assocOperator003Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator003, Method: assocOperator003";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator003
	@Override
    public Boolean assocOperator003Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator003Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator003
	@Override
    public SQLExists assocOperator003Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Solicitud.Aesolicitudes.ProductoT.Dominios.PlanT = Solicitud.Aesolicitudes.PlanT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    if (instance.getSolicitud().isNull() || instance.getSolicitud().getAesolicitudes().getPlanT().isNull())
                    {
                    comparison1.setSecondOperand(new SQLWhereOperandNull());
                    }
                    else
                    {
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, instance.getSolicitud().getAesolicitudes().getPlanT().getOid(), UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT);
                    comparison1.setSecondOperand(operand223);
                    }
                    conjunction.addOperand(comparison1);


            // Solicitud.Aesolicitudes.ProductoT.Dominios.AcepCuesNeo = true
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ATTR_NAME_DOMINIOACEPCUESNEO, Constants.Type.BOOL.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator003, Method: assocOperator003Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator004
	@Override
    public Boolean assocOperator004(Usuario instance) throws SystemException {
        try {
            // EXIST (AnexoMat)
            return assocOperator004Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator004, Method: assocOperator004";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator004
	@Override
    public Boolean assocOperator004Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator004Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator004
	@Override
    public SQLExists assocOperator004Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_ANEXOMAT, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator004, Method: assocOperator004Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator005
	@Override
    public Boolean assocOperator005(Usuario instance) throws SystemException {
        try {
            // EXIST (CuestionarioP)
            return assocOperator005Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator005, Method: assocOperator005";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator005
	@Override
    public Boolean assocOperator005Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator005Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator005
	@Override
    public SQLExists assocOperator005Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_CUESTIONARIOP, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator005, Method: assocOperator005Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator006
	@Override
    public Boolean assocOperator006(Usuario instance) throws SystemException {
        try {
            // EXIST (CuestionarioP) WHERE (CuestionarioP.YaDiligenciado = true)
            return assocOperator006Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator006, Method: assocOperator006";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator006
	@Override
    public Boolean assocOperator006Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator006Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator006
	@Override
    public SQLExists assocOperator006Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_CUESTIONARIOP, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // CuestionarioP.YaDiligenciado = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    if (instance.getCuestionarioP().getCuestionarioPYaDiligenciado()!= null){
                    comparison1.setFirstOperand(new SQLWhereOperandLiteral(instance.getCuestionarioP().getCuestionarioPYaDiligenciado(), Constants.Type.BOOL.getTypeName()));
                    } else {
                    comparison1.setFirstOperand(new SQLWhereOperandNull());
                    }
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator006, Method: assocOperator006Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator007
	@Override
    public Boolean assocOperator007(Usuario instance) throws SystemException {
        try {
            // EXIST (EstadoBeneficiario)
            return assocOperator007Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator007, Method: assocOperator007";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator007
	@Override
    public Boolean assocOperator007Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator007Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator007
	@Override
    public SQLExists assocOperator007Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_ESTADOBENEFICIARIO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator007, Method: assocOperator007Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator008
	@Override
    public Boolean assocOperator008(Usuario instance) throws SystemException {
        try {
            // EXIST (CuestionarioP.Secciones.Preguntas) WHERE (CuestionarioP.Secciones.Preguntas.Pregunta.Numero = StrToInt(fugetValorParametroConf("PREGUNTAEMBARAZO")) AND CuestionarioP.Secciones.Preguntas.RespuestaSiNo = true AND CuestionarioP.Secciones.Preguntas.ValoresRespuestas <> NULL)
            return assocOperator008Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator008, Method: assocOperator008";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator008
	@Override
    public Boolean assocOperator008Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator008Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator008
	@Override
    public SQLExists assocOperator008Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_CUESTIONARIOP + "." + CuestionarioPConstants.ROLE_NAME_SECCIONES + "." + SeccionPConstants.ROLE_NAME_PREGUNTAS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // CuestionarioP.Secciones.Preguntas.Pregunta.Numero = StrToInt(fugetValorParametroConf("PREGUNTAEMBARAZO"))
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_CUESTIONARIOP + "." + CuestionarioPConstants.ROLE_NAME_SECCIONES + "." + SeccionPConstants.ROLE_NAME_PREGUNTAS + "." + PreguntaPConstants.ROLE_NAME_PREGUNTA + "." + PreguntaConstants.ATTR_NAME_PREGUNTANUMERO, Constants.Type.INT.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                            if (STDFunctions.strToIntFun(userFunctionsSrv.fugetValorParametroConfFun("PREGUNTAEMBARAZO")) != null) {
                                comparison1.setSecondOperand(new SQLWhereOperandLiteral(STDFunctions.strToIntFun(userFunctionsSrv.fugetValorParametroConfFun("PREGUNTAEMBARAZO")), Constants.Type.INT.getTypeName()));
                            } else {
                                comparison1.setSecondOperand(new SQLWhereOperandNull());
                                }
                    conjunction.addOperand(comparison1);


            // CuestionarioP.Secciones.Preguntas.RespuestaSiNo = true
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_CUESTIONARIOP + "." + CuestionarioPConstants.ROLE_NAME_SECCIONES + "." + SeccionPConstants.ROLE_NAME_PREGUNTAS + "." + PreguntaPConstants.ATTR_NAME_PREGUNTAPRESPUESTASINO, Constants.Type.BOOL.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison2);


            // CuestionarioP.Secciones.Preguntas.ValoresRespuestas <> NULL
                    // '<>' Comparison
                    SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
                    comparison3.setOperator("<>");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_CUESTIONARIOP + "." + CuestionarioPConstants.ROLE_NAME_SECCIONES + "." + SeccionPConstants.ROLE_NAME_PREGUNTAS + "." + PreguntaPConstants.ATTR_NAME_PREGUNTAPVALORESRESPUESTAS, Constants.Type.STRING.getTypeName());
                    comparison3.setFirstOperand(operand114);
                    
                    // Operand 2
                    comparison3.setSecondOperand(new SQLWhereOperandNull());
                    conjunction.addOperand(comparison3);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator008, Method: assocOperator008Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator009
	@Override
    public String assocOperator009(Usuario instance) throws SystemException {
        try {
            // GETONE (CuestionarioP.Secciones.Preguntas.ValoresRespuestas) WHERE (CuestionarioP.Secciones.Preguntas.Pregunta.Numero = StrToInt(fugetValorParametroConf("PREGUNTAEMBARAZO")) AND CuestionarioP.Secciones.Preguntas.RespuestaSiNo = true)
            return assocOperator009Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator009, Method: assocOperator009";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator009
	@Override
    public String assocOperator009Range1 (Usuario instance) throws SystemException {
        SQLGetOne sql = assocOperator009Range1Query(instance);
        List<String> results = new TypedQueryBuilder<String>(em, String.class).build(sql).execute();
        return !results.isEmpty() ? results.get(0) : null;
    }

    // Range Query 1 for AssocOperator AssocOperator009
	@Override
    public SQLGetOne assocOperator009Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            SQLGetOne sql = new SQLGetOne(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_CUESTIONARIOP + "." + CuestionarioPConstants.ROLE_NAME_SECCIONES + "." + SeccionPConstants.ROLE_NAME_PREGUNTAS + "." + PreguntaPConstants.ATTR_NAME_PREGUNTAPVALORESRESPUESTAS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // CuestionarioP.Secciones.Preguntas.Pregunta.Numero = StrToInt(fugetValorParametroConf("PREGUNTAEMBARAZO"))
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_CUESTIONARIOP + "." + CuestionarioPConstants.ROLE_NAME_SECCIONES + "." + SeccionPConstants.ROLE_NAME_PREGUNTAS + "." + PreguntaPConstants.ROLE_NAME_PREGUNTA + "." + PreguntaConstants.ATTR_NAME_PREGUNTANUMERO, Constants.Type.INT.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                            if (STDFunctions.strToIntFun(userFunctionsSrv.fugetValorParametroConfFun("PREGUNTAEMBARAZO")) != null) {
                                comparison1.setSecondOperand(new SQLWhereOperandLiteral(STDFunctions.strToIntFun(userFunctionsSrv.fugetValorParametroConfFun("PREGUNTAEMBARAZO")), Constants.Type.INT.getTypeName()));
                            } else {
                                comparison1.setSecondOperand(new SQLWhereOperandNull());
                                }
                    conjunction.addOperand(comparison1);


            // CuestionarioP.Secciones.Preguntas.RespuestaSiNo = true
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_CUESTIONARIOP + "." + CuestionarioPConstants.ROLE_NAME_SECCIONES + "." + SeccionPConstants.ROLE_NAME_PREGUNTAS + "." + PreguntaPConstants.ATTR_NAME_PREGUNTAPRESPUESTASINO, Constants.Type.BOOL.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator009, Method: assocOperator009Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator010
	@Override
    public Boolean assocOperator010(Usuario instance) throws SystemException {
        try {
            // EXIST (EstadoBeneficiario)
            return assocOperator010Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator010, Method: assocOperator010";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator010
	@Override
    public Boolean assocOperator010Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator010Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator010
	@Override
    public SQLExists assocOperator010Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_ESTADOBENEFICIARIO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator010, Method: assocOperator010Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator011
	@Override
    public Boolean assocOperator011(Usuario instance) throws SystemException {
        try {
            // EXIST (Parentesco)
            return assocOperator011Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator011, Method: assocOperator011";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator011
	@Override
    public Boolean assocOperator011Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator011Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator011
	@Override
    public SQLExists assocOperator011Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_PARENTESCO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator011, Method: assocOperator011Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator012
	@Override
    public Boolean assocOperator012(Usuario instance) throws SystemException {
        try {
            // EXIST (Solicitud.Aesolicitudes.PlanT.Dominios.ParentescosDom) WHERE (Solicitud.Aesolicitudes.PlanT.Dominios.ParentescosDom.Dominio.ProductoT = Solicitud.Aesolicitudes.ProductoT AND Solicitud.Aesolicitudes.PlanT.Dominios.ParentescosDom.Parentesco = Parentesco AND Solicitud.Aesolicitudes.PlanT.Dominios.ParentescosDom.EdadMaximaA <> NULL)
            return assocOperator012Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator012, Method: assocOperator012";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator012
	@Override
    public Boolean assocOperator012Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator012Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator012
	@Override
    public SQLExists assocOperator012Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PARENTESCOSDOM, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Solicitud.Aesolicitudes.PlanT.Dominios.ParentescosDom.Dominio.ProductoT = Solicitud.Aesolicitudes.ProductoT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PARENTESCOSDOM + "." + ParentescoDomConstants.ROLE_NAME_DOMINIO + "." + DominioConstants.ROLE_NAME_PRODUCTOT, ProductosConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT, ProductosConstants.CLASS_NAME, ProductosConstants.CLASS_NAME, instance.getSolicitud().getAesolicitudes().getProductoT().getOid(), UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT);
                    comparison1.setSecondOperand(operand223);
                    conjunction.addOperand(comparison1);


            // Solicitud.Aesolicitudes.PlanT.Dominios.ParentescosDom.Parentesco = Parentesco
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand113 = new SQLWhereOperandPathInstance(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PARENTESCOSDOM + "." + ParentescoDomConstants.ROLE_NAME_PARENTESCO, ParentescoConstants.CLASS_NAME);
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand224 = new SQLWhereOperandOVParameter(UsuarioConstants.ROLE_NAME_PARENTESCO, ParentescoConstants.CLASS_NAME, ParentescoConstants.CLASS_NAME, instance.getParentesco().getOid(), UsuarioConstants.ROLE_NAME_PARENTESCO);
                    comparison2.setSecondOperand(operand224);
                    conjunction.addOperand(comparison2);


            // Solicitud.Aesolicitudes.PlanT.Dominios.ParentescosDom.EdadMaximaA <> NULL
                    // '<>' Comparison
                    SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
                    comparison3.setOperator("<>");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PARENTESCOSDOM + "." + ParentescoDomConstants.ATTR_NAME_PARENTESCODOMEDADMAXIMAA, Constants.Type.INT.getTypeName());
                    comparison3.setFirstOperand(operand114);
                    
                    // Operand 2
                    comparison3.setSecondOperand(new SQLWhereOperandNull());
                    conjunction.addOperand(comparison3);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator012, Method: assocOperator012Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator013
	@Override
    public Long assocOperator013(Usuario instance) throws SystemException {
        try {
            // SUM (Solicitud.Aesolicitudes.PlanT.Dominios.ParentescosDom.EdadMaximaA) WHERE (Solicitud.Aesolicitudes.PlanT.Dominios.ParentescosDom.Dominio.ProductoT = Solicitud.Aesolicitudes.ProductoT AND Solicitud.Aesolicitudes.PlanT.Dominios.ParentescosDom.Parentesco = Parentesco)
            return assocOperator013Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator013, Method: assocOperator013";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator013
	@Override
    public Long assocOperator013Range1 (Usuario instance) throws SystemException {
        SQLSum sql = assocOperator013Range1Query(instance);
        return new TypedQueryBuilder<Long>(em, Long.class).build(sql).getSingleResult();
    }

    // Range Query 1 for AssocOperator AssocOperator013
	@Override
    public SQLSum assocOperator013Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            SQLSum sql = new SQLSum(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PARENTESCOSDOM + "." + ParentescoDomConstants.ATTR_NAME_PARENTESCODOMEDADMAXIMAA, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Solicitud.Aesolicitudes.PlanT.Dominios.ParentescosDom.Dominio.ProductoT = Solicitud.Aesolicitudes.ProductoT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PARENTESCOSDOM + "." + ParentescoDomConstants.ROLE_NAME_DOMINIO + "." + DominioConstants.ROLE_NAME_PRODUCTOT, ProductosConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT, ProductosConstants.CLASS_NAME, ProductosConstants.CLASS_NAME, instance.getSolicitud().getAesolicitudes().getProductoT().getOid(), UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT);
                    comparison1.setSecondOperand(operand223);
                    conjunction.addOperand(comparison1);


            // Solicitud.Aesolicitudes.PlanT.Dominios.ParentescosDom.Parentesco = Parentesco
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand113 = new SQLWhereOperandPathInstance(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PARENTESCOSDOM + "." + ParentescoDomConstants.ROLE_NAME_PARENTESCO, ParentescoConstants.CLASS_NAME);
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand224 = new SQLWhereOperandOVParameter(UsuarioConstants.ROLE_NAME_PARENTESCO, ParentescoConstants.CLASS_NAME, ParentescoConstants.CLASS_NAME, instance.getParentesco().getOid(), UsuarioConstants.ROLE_NAME_PARENTESCO);
                    comparison2.setSecondOperand(operand224);
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator013, Method: assocOperator013Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator014
	@Override
    public Boolean assocOperator014(Usuario instance) throws SystemException {
        try {
            // EXIST (Parentesco)
            return assocOperator014Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator014, Method: assocOperator014";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator014
	@Override
    public Boolean assocOperator014Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator014Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator014
	@Override
    public SQLExists assocOperator014Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_PARENTESCO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator014, Method: assocOperator014Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator015
	@Override
    public Boolean assocOperator015(Usuario instance) throws SystemException {
        try {
            // EXIST (Solicitud.Aesolicitudes.PlanT.Dominios.ParentescosDom) WHERE (Solicitud.Aesolicitudes.PlanT.Dominios.ParentescosDom.Dominio.ProductoT = Solicitud.Aesolicitudes.ProductoT AND Solicitud.Aesolicitudes.PlanT.Dominios.ParentescosDom.Parentesco = Parentesco AND Solicitud.Aesolicitudes.PlanT.Dominios.ParentescosDom.EdadMaximaP <> NULL)
            return assocOperator015Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator015, Method: assocOperator015";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator015
	@Override
    public Boolean assocOperator015Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator015Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator015
	@Override
    public SQLExists assocOperator015Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PARENTESCOSDOM, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Solicitud.Aesolicitudes.PlanT.Dominios.ParentescosDom.Dominio.ProductoT = Solicitud.Aesolicitudes.ProductoT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PARENTESCOSDOM + "." + ParentescoDomConstants.ROLE_NAME_DOMINIO + "." + DominioConstants.ROLE_NAME_PRODUCTOT, ProductosConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT, ProductosConstants.CLASS_NAME, ProductosConstants.CLASS_NAME, instance.getSolicitud().getAesolicitudes().getProductoT().getOid(), UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT);
                    comparison1.setSecondOperand(operand223);
                    conjunction.addOperand(comparison1);


            // Solicitud.Aesolicitudes.PlanT.Dominios.ParentescosDom.Parentesco = Parentesco
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand113 = new SQLWhereOperandPathInstance(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PARENTESCOSDOM + "." + ParentescoDomConstants.ROLE_NAME_PARENTESCO, ParentescoConstants.CLASS_NAME);
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand224 = new SQLWhereOperandOVParameter(UsuarioConstants.ROLE_NAME_PARENTESCO, ParentescoConstants.CLASS_NAME, ParentescoConstants.CLASS_NAME, instance.getParentesco().getOid(), UsuarioConstants.ROLE_NAME_PARENTESCO);
                    comparison2.setSecondOperand(operand224);
                    conjunction.addOperand(comparison2);


            // Solicitud.Aesolicitudes.PlanT.Dominios.ParentescosDom.EdadMaximaP <> NULL
                    // '<>' Comparison
                    SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
                    comparison3.setOperator("<>");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PARENTESCOSDOM + "." + ParentescoDomConstants.ATTR_NAME_PARENTESCODOMEDADMAXIMAP, Constants.Type.INT.getTypeName());
                    comparison3.setFirstOperand(operand114);
                    
                    // Operand 2
                    comparison3.setSecondOperand(new SQLWhereOperandNull());
                    conjunction.addOperand(comparison3);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator015, Method: assocOperator015Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator016
	@Override
    public Long assocOperator016(Usuario instance) throws SystemException {
        try {
            // SUM (Solicitud.Aesolicitudes.PlanT.Dominios.ParentescosDom.EdadMaximaP) WHERE (Solicitud.Aesolicitudes.PlanT.Dominios.ParentescosDom.Dominio.ProductoT = Solicitud.Aesolicitudes.ProductoT AND Solicitud.Aesolicitudes.PlanT.Dominios.ParentescosDom.Parentesco = Parentesco)
            return assocOperator016Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator016, Method: assocOperator016";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator016
	@Override
    public Long assocOperator016Range1 (Usuario instance) throws SystemException {
        SQLSum sql = assocOperator016Range1Query(instance);
        return new TypedQueryBuilder<Long>(em, Long.class).build(sql).getSingleResult();
    }

    // Range Query 1 for AssocOperator AssocOperator016
	@Override
    public SQLSum assocOperator016Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            SQLSum sql = new SQLSum(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PARENTESCOSDOM + "." + ParentescoDomConstants.ATTR_NAME_PARENTESCODOMEDADMAXIMAP, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Solicitud.Aesolicitudes.PlanT.Dominios.ParentescosDom.Dominio.ProductoT = Solicitud.Aesolicitudes.ProductoT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PARENTESCOSDOM + "." + ParentescoDomConstants.ROLE_NAME_DOMINIO + "." + DominioConstants.ROLE_NAME_PRODUCTOT, ProductosConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT, ProductosConstants.CLASS_NAME, ProductosConstants.CLASS_NAME, instance.getSolicitud().getAesolicitudes().getProductoT().getOid(), UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT);
                    comparison1.setSecondOperand(operand223);
                    conjunction.addOperand(comparison1);


            // Solicitud.Aesolicitudes.PlanT.Dominios.ParentescosDom.Parentesco = Parentesco
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand113 = new SQLWhereOperandPathInstance(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PARENTESCOSDOM + "." + ParentescoDomConstants.ROLE_NAME_PARENTESCO, ParentescoConstants.CLASS_NAME);
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand224 = new SQLWhereOperandOVParameter(UsuarioConstants.ROLE_NAME_PARENTESCO, ParentescoConstants.CLASS_NAME, ParentescoConstants.CLASS_NAME, instance.getParentesco().getOid(), UsuarioConstants.ROLE_NAME_PARENTESCO);
                    comparison2.setSecondOperand(operand224);
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator016, Method: assocOperator016Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator017
	@Override
    public Boolean assocOperator017(Usuario instance) throws SystemException {
        try {
            // EXIST (AnexoMat)
            return assocOperator017Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator017, Method: assocOperator017";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator017
	@Override
    public Boolean assocOperator017Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator017Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator017
	@Override
    public SQLExists assocOperator017Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_ANEXOMAT, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator017, Method: assocOperator017Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator018
	@Override
    public Boolean assocOperator018(Usuario instance) throws SystemException {
        try {
            // EXIST (AnexoNeo)
            return assocOperator018Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator018, Method: assocOperator018";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator018
	@Override
    public Boolean assocOperator018Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator018Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator018
	@Override
    public SQLExists assocOperator018Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_ANEXONEO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator018, Method: assocOperator018Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator019
	@Override
    public Boolean assocOperator019(Usuario instance) throws SystemException {
        try {
            // EXIST (AnexoMat)
            return assocOperator019Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator019, Method: assocOperator019";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator019
	@Override
    public Boolean assocOperator019Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator019Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator019
	@Override
    public SQLExists assocOperator019Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_ANEXOMAT, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator019, Method: assocOperator019Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator020
	@Override
    public Boolean assocOperator020(Usuario instance) throws SystemException {
        try {
            // EXIST (AnexoNeo)
            return assocOperator020Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator020, Method: assocOperator020";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator020
	@Override
    public Boolean assocOperator020Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator020Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator020
	@Override
    public SQLExists assocOperator020Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_ANEXONEO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator020, Method: assocOperator020Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator021
	@Override
    public Boolean assocOperator021(Usuario instance) throws SystemException {
        try {
            // EXIST (AnexoMat)
            return assocOperator021Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator021, Method: assocOperator021";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator021
	@Override
    public Boolean assocOperator021Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator021Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator021
	@Override
    public SQLExists assocOperator021Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_ANEXOMAT, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator021, Method: assocOperator021Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator022
	@Override
    public Boolean assocOperator022(Usuario instance) throws SystemException {
        try {
            // EXIST (AnexoNeo)
            return assocOperator022Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator022, Method: assocOperator022";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator022
	@Override
    public Boolean assocOperator022Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator022Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator022
	@Override
    public SQLExists assocOperator022Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_ANEXONEO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator022, Method: assocOperator022Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator023
	@Override
    public Boolean assocOperator023(Usuario instance) throws SystemException {
        try {
            // EXIST (Eps) WHERE (Eps.EpsSanitas = true)
            return assocOperator023Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator023, Method: assocOperator023";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator023
	@Override
    public Boolean assocOperator023Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator023Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator023
	@Override
    public SQLExists assocOperator023Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_EPS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Eps.EpsSanitas = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    if (instance.getEps().getEpsEpsSanitas()!= null){
                    comparison1.setFirstOperand(new SQLWhereOperandLiteral(instance.getEps().getEpsEpsSanitas(), Constants.Type.BOOL.getTypeName()));
                    } else {
                    comparison1.setFirstOperand(new SQLWhereOperandNull());
                    }
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator023, Method: assocOperator023Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator024
	@Override
    public Boolean assocOperator024(Usuario instance) throws SystemException {
        try {
            // EXIST (Parentesco)
            return assocOperator024Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator024, Method: assocOperator024";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator024
	@Override
    public Boolean assocOperator024Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator024Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator024
	@Override
    public SQLExists assocOperator024Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_PARENTESCO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator024, Method: assocOperator024Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator025
	@Override
    public Long assocOperator025(Usuario instance) throws SystemException {
        try {
            // COUNT (Solicitud.Usuarios) WHERE (Solicitud.Usuarios.Identificador <> Identificador AND Solicitud.Usuarios.Parentesco.EsTitular = true)
            return assocOperator025Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator025, Method: assocOperator025";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator025
	@Override
    public Long assocOperator025Range1 (Usuario instance) throws SystemException {
        SQLCount sql = assocOperator025Range1Query(instance);
        return Long.valueOf(solveCountQuery(sql));
    }

    // Range Query 1 for AssocOperator AssocOperator025
	@Override
    public SQLCount assocOperator025Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            SQLCount sql = new SQLCount(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_USUARIOS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Solicitud.Usuarios.Identificador <> Identificador
                    // '<>' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("<>");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ATTR_NAME_USUARIOIDENTIFICADOR, Constants.Type.INT.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(instance.getUsuarioIdentificador(), Constants.Type.INT.getTypeName()));
                    conjunction.addOperand(comparison1);


            // Solicitud.Usuarios.Parentesco.EsTitular = true
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_PARENTESCO + "." + ParentescoConstants.ATTR_NAME_PARENTESCOESTITULAR, Constants.Type.BOOL.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator025, Method: assocOperator025Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator026
	@Override
    public Long assocOperator026(Usuario instance) throws SystemException {
        try {
            // COUNT (Solicitud.UsuariosRegistrados) WHERE (Solicitud.UsuariosRegistrados.EstadoBeneficiario.EsActivo = true AND Solicitud.UsuariosRegistrados.Parentesco.EsTitular = true)
            return assocOperator026Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator026, Method: assocOperator026";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator026
	@Override
    public Long assocOperator026Range1 (Usuario instance) throws SystemException {
        SQLCount sql = assocOperator026Range1Query(instance);
        return Long.valueOf(solveCountQuery(sql));
    }

    // Range Query 1 for AssocOperator AssocOperator026
	@Override
    public SQLCount assocOperator026Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            SQLCount sql = new SQLCount(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Solicitud.UsuariosRegistrados.EstadoBeneficiario.EsActivo = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS + "." + UsuarioRegConstants.ROLE_NAME_ESTADOBENEFICIARIO + "." + EstadoBeneficiarioConstants.ATTR_NAME_ESTADOBENEFICIARIOESACTIVO, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);


            // Solicitud.UsuariosRegistrados.Parentesco.EsTitular = true
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS + "." + UsuarioRegConstants.ROLE_NAME_PARENTESCO + "." + ParentescoConstants.ATTR_NAME_PARENTESCOESTITULAR, Constants.Type.BOOL.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator026, Method: assocOperator026Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator027
	@Override
    public Boolean assocOperator027(Usuario instance) throws SystemException {
        try {
            // EXIST (CuestionarioP)
            return assocOperator027Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator027, Method: assocOperator027";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator027
	@Override
    public Boolean assocOperator027Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator027Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator027
	@Override
    public SQLExists assocOperator027Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_CUESTIONARIOP, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator027, Method: assocOperator027Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator028
	@Override
    public Double assocOperator028(Usuario instance) throws SystemException {
        try {
            // SUM (Solicitud.Aesolicitudes.PlanT.Tarifas.DetallesTarifa.Valor) WHERE (Solicitud.Aesolicitudes.PlanT.Tarifas.DetallesTarifa.Tarifa.TipoContrato = Solicitud.tipoContrato AND Solicitud.Aesolicitudes.PlanT.Tarifas.DetallesTarifa.Anyo = getYear(Solicitud.Aesolicitudes.Fechaasignacion) AND drvEdad >= Solicitud.Aesolicitudes.PlanT.Tarifas.DetallesTarifa.LimInferiorEdad AND drvEdad <= Solicitud.Aesolicitudes.PlanT.Tarifas.DetallesTarifa.LimSuperiorEdad)
            return assocOperator028Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator028, Method: assocOperator028";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator028
	@Override
    public Double assocOperator028Range1 (Usuario instance) throws SystemException {
        SQLSum sql = assocOperator028Range1Query(instance);
        return new TypedQueryBuilder<Double>(em, Double.class).build(sql).getSingleResult();
    }

    // Range Query 1 for AssocOperator AssocOperator028
	@Override
    public SQLSum assocOperator028Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            SQLSum sql = new SQLSum(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_TARIFAS + "." + TarifaConstants.ROLE_NAME_DETALLESTARIFA + "." + DetalleTarifaConstants.ATTR_NAME_DETALLETARIFAVALOR, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Solicitud.Aesolicitudes.PlanT.Tarifas.DetallesTarifa.Tarifa.TipoContrato = Solicitud.tipoContrato
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_TARIFAS + "." + TarifaConstants.ROLE_NAME_DETALLESTARIFA + "." + DetalleTarifaConstants.ROLE_NAME_TARIFA + "." + TarifaConstants.ATTR_NAME_TARIFATIPOCONTRATO, Constants.Type.NAT.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(instance.getSolicitud().getSolicitudtipoContrato(), Constants.Type.NAT.getTypeName()));
                    conjunction.addOperand(comparison1);


            // Solicitud.Aesolicitudes.PlanT.Tarifas.DetallesTarifa.Anyo = getYear(Solicitud.Aesolicitudes.Fechaasignacion)
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_TARIFAS + "." + TarifaConstants.ROLE_NAME_DETALLESTARIFA + "." + DetalleTarifaConstants.ATTR_NAME_DETALLETARIFAANYO, Constants.Type.INT.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                            if (STDFunctions.getYearFun(instance.getSolicitud().getAesolicitudes().getAesolicitudesFechaasignacion()) != null) {
                                comparison2.setSecondOperand(new SQLWhereOperandLiteral(STDFunctions.getYearFun(instance.getSolicitud().getAesolicitudes().getAesolicitudesFechaasignacion()), Constants.Type.INT.getTypeName()));
                            } else {
                                comparison2.setSecondOperand(new SQLWhereOperandNull());
                                }
                    conjunction.addOperand(comparison2);


            // drvEdad >= Solicitud.Aesolicitudes.PlanT.Tarifas.DetallesTarifa.LimInferiorEdad
                    // '>=' Comparison
                    SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
                    comparison3.setOperator(">=");
                    
                    // Operand 1
                    comparison3.setFirstOperand(new SQLWhereOperandLiteral(instance.getUsuariodrvEdad(), Constants.Type.INT.getTypeName()));
                    
                    // Operand 2
                    SQLWhereOperandPathAttribute operand225 = new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_TARIFAS + "." + TarifaConstants.ROLE_NAME_DETALLESTARIFA + "." + DetalleTarifaConstants.ATTR_NAME_DETALLETARIFALIMINFERIOREDAD, Constants.Type.INT.getTypeName());
                    comparison3.setSecondOperand(operand225);
                    conjunction.addOperand(comparison3);


            // drvEdad <= Solicitud.Aesolicitudes.PlanT.Tarifas.DetallesTarifa.LimSuperiorEdad
                    // '<=' Comparison
                    SQLWhereComparison comparison4 = new SQLWhereComparison(sql);
                    comparison4.setOperator("<=");
                    
                    // Operand 1
                    comparison4.setFirstOperand(new SQLWhereOperandLiteral(instance.getUsuariodrvEdad(), Constants.Type.INT.getTypeName()));
                    
                    // Operand 2
                    SQLWhereOperandPathAttribute operand226 = new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_TARIFAS + "." + TarifaConstants.ROLE_NAME_DETALLESTARIFA + "." + DetalleTarifaConstants.ATTR_NAME_DETALLETARIFALIMSUPERIOREDAD, Constants.Type.INT.getTypeName());
                    comparison4.setSecondOperand(operand226);
                    conjunction.addOperand(comparison4);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator028, Method: assocOperator028Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator029
	@Override
    public Boolean assocOperator029(Usuario instance) throws SystemException {
        try {
            // EXIST (UsuarioPersona.Direcciones) WHERE (UsuarioPersona.Direcciones.TipoDireccion = fugetTipoDirResidencial() AND UsuarioPersona.Direcciones.Municipio.EsValidoEPS = false)
            return assocOperator029Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator029, Method: assocOperator029";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator029
	@Override
    public Boolean assocOperator029Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator029Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator029
	@Override
    public SQLExists assocOperator029Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_USUARIOPERSONA + "." + PersonaConstants.ROLE_NAME_DIRECCIONES, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // UsuarioPersona.Direcciones.TipoDireccion = fugetTipoDirResidencial()
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(UsuarioConstants.ROLE_NAME_USUARIOPERSONA + "." + PersonaConstants.ROLE_NAME_DIRECCIONES + "." + DireccionConstants.ROLE_NAME_TIPODIRECCION, TipoDireccionConstants.CLASS_NAME);
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


            // UsuarioPersona.Direcciones.Municipio.EsValidoEPS = false
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_USUARIOPERSONA + "." + PersonaConstants.ROLE_NAME_DIRECCIONES + "." + DireccionConstants.ROLE_NAME_MUNICIPIO + "." + MunicipioConstants.ATTR_NAME_MUNICIPIOESVALIDOEPS, Constants.Type.BOOL.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Boolean.FALSE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator029, Method: assocOperator029Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator030
	@Override
    public Boolean assocOperator030(Usuario instance) throws SystemException {
        try {
            // EXIST (CuestionarioP)
            return assocOperator030Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator030, Method: assocOperator030";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator030
	@Override
    public Boolean assocOperator030Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator030Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator030
	@Override
    public SQLExists assocOperator030Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_CUESTIONARIOP, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator030, Method: assocOperator030Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator031
	@Override
    public Boolean assocOperator031(Solicitud usuarioTCREARptpagrSolicitud) throws SystemException {
        try {
            // EXIST (ptpagrSolicitud.Aesolicitudes.ProductoT.Dominios) WHERE (ptpagrSolicitud.Aesolicitudes.ProductoT.Dominios.PlanT = ptpagrSolicitud.Aesolicitudes.PlanT AND ptpagrSolicitud.Aesolicitudes.ProductoT.Dominios.AcepBBGestante = true)
            return assocOperator031Range1(usuarioTCREARptpagrSolicitud);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator031, Method: assocOperator031";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator031
	@Override
    public Boolean assocOperator031Range1 (Solicitud usuarioTCREARptpagrSolicitud) throws SystemException {
        SQLExists sql = assocOperator031Range1Query(usuarioTCREARptpagrSolicitud, null);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator031
	@Override
    public SQLExists assocOperator031Range1Query (Solicitud usuarioTCREARptpagrSolicitud, SQLSelect superQuery) throws SystemException {
        try {
            SQLExists sql;
            // The path starts with an object
            if (superQuery != null) {
                sql = new SQLExists(superQuery, UsuarioConstants.CLASS_NAME, UsuarioConstants.ARG_NAME_TCREAR_USUARIOTCREARPTPAGRSOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS, SolicitudConstants.CLASS_NAME, usuarioTCREARptpagrSolicitud.getOid(), UsuarioConstants.ARG_NAME_TCREAR_USUARIOTCREARPTPAGRSOLICITUD);
            } else {
                sql = new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ARG_NAME_TCREAR_USUARIOTCREARPTPAGRSOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS, SolicitudConstants.CLASS_NAME, usuarioTCREARptpagrSolicitud.getOid(), UsuarioConstants.ARG_NAME_TCREAR_USUARIOTCREARPTPAGRSOLICITUD);
            }
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // ptpagrSolicitud.Aesolicitudes.ProductoT.Dominios.PlanT = ptpagrSolicitud.Aesolicitudes.PlanT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandOVParameter operand112 = new SQLWhereOperandOVParameter(UsuarioConstants.ARG_NAME_TCREAR_USUARIOTCREARPTPAGRSOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PLANT, SolicitudConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, usuarioTCREARptpagrSolicitud.getOid(), UsuarioConstants.ARG_NAME_TCREAR_USUARIOTCREARPTPAGRSOLICITUD);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    if (usuarioTCREARptpagrSolicitud.isNull() || usuarioTCREARptpagrSolicitud.getAesolicitudes().getPlanT().isNull())
                    {
                    comparison1.setSecondOperand(new SQLWhereOperandNull());
                    }
                    else
                    {
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(UsuarioConstants.ARG_NAME_TCREAR_USUARIOTCREARPTPAGRSOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, SolicitudConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, usuarioTCREARptpagrSolicitud.getOid(), UsuarioConstants.ARG_NAME_TCREAR_USUARIOTCREARPTPAGRSOLICITUD);
                    comparison1.setSecondOperand(operand223);
                    }
                    conjunction.addOperand(comparison1);


            // ptpagrSolicitud.Aesolicitudes.ProductoT.Dominios.AcepBBGestante = true
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandOVParameterAttribute operand113 = new SQLWhereOperandOVParameterAttribute(UsuarioConstants.ARG_NAME_TCREAR_USUARIOTCREARPTPAGRSOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ATTR_NAME_DOMINIOACEPBBGESTANTE, SolicitudConstants.CLASS_NAME, usuarioTCREARptpagrSolicitud.getOid(), UsuarioConstants.ARG_NAME_TCREAR_USUARIOTCREARPTPAGRSOLICITUD, Constants.Type.BOOL.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator031, Method: assocOperator031Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator032
	@Override
    public Boolean assocOperator032(Solicitud usuarioTCREARptpagrSolicitud) throws SystemException {
        try {
            // EXIST (ptpagrSolicitud.Aesolicitudes.ProductoT.Dominios) WHERE (ptpagrSolicitud.Aesolicitudes.ProductoT.Dominios.PlanT = ptpagrSolicitud.Aesolicitudes.PlanT AND ptpagrSolicitud.Aesolicitudes.ProductoT.Dominios.ProrrateoUsuExistente = true)
            return assocOperator032Range1(usuarioTCREARptpagrSolicitud);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator032, Method: assocOperator032";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator032
	@Override
    public Boolean assocOperator032Range1 (Solicitud usuarioTCREARptpagrSolicitud) throws SystemException {
        SQLExists sql = assocOperator032Range1Query(usuarioTCREARptpagrSolicitud, null);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator032
	@Override
    public SQLExists assocOperator032Range1Query (Solicitud usuarioTCREARptpagrSolicitud, SQLSelect superQuery) throws SystemException {
        try {
            SQLExists sql;
            // The path starts with an object
            if (superQuery != null) {
                sql = new SQLExists(superQuery, UsuarioConstants.CLASS_NAME, UsuarioConstants.ARG_NAME_TCREAR_USUARIOTCREARPTPAGRSOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS, SolicitudConstants.CLASS_NAME, usuarioTCREARptpagrSolicitud.getOid(), UsuarioConstants.ARG_NAME_TCREAR_USUARIOTCREARPTPAGRSOLICITUD);
            } else {
                sql = new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ARG_NAME_TCREAR_USUARIOTCREARPTPAGRSOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS, SolicitudConstants.CLASS_NAME, usuarioTCREARptpagrSolicitud.getOid(), UsuarioConstants.ARG_NAME_TCREAR_USUARIOTCREARPTPAGRSOLICITUD);
            }
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // ptpagrSolicitud.Aesolicitudes.ProductoT.Dominios.PlanT = ptpagrSolicitud.Aesolicitudes.PlanT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandOVParameter operand112 = new SQLWhereOperandOVParameter(UsuarioConstants.ARG_NAME_TCREAR_USUARIOTCREARPTPAGRSOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PLANT, SolicitudConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, usuarioTCREARptpagrSolicitud.getOid(), UsuarioConstants.ARG_NAME_TCREAR_USUARIOTCREARPTPAGRSOLICITUD);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    if (usuarioTCREARptpagrSolicitud.isNull() || usuarioTCREARptpagrSolicitud.getAesolicitudes().getPlanT().isNull())
                    {
                    comparison1.setSecondOperand(new SQLWhereOperandNull());
                    }
                    else
                    {
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(UsuarioConstants.ARG_NAME_TCREAR_USUARIOTCREARPTPAGRSOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, SolicitudConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, usuarioTCREARptpagrSolicitud.getOid(), UsuarioConstants.ARG_NAME_TCREAR_USUARIOTCREARPTPAGRSOLICITUD);
                    comparison1.setSecondOperand(operand223);
                    }
                    conjunction.addOperand(comparison1);


            // ptpagrSolicitud.Aesolicitudes.ProductoT.Dominios.ProrrateoUsuExistente = true
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandOVParameterAttribute operand113 = new SQLWhereOperandOVParameterAttribute(UsuarioConstants.ARG_NAME_TCREAR_USUARIOTCREARPTPAGRSOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ATTR_NAME_DOMINIOPRORRATEOUSUEXISTENTE, SolicitudConstants.CLASS_NAME, usuarioTCREARptpagrSolicitud.getOid(), UsuarioConstants.ARG_NAME_TCREAR_USUARIOTCREARPTPAGRSOLICITUD, Constants.Type.BOOL.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator032, Method: assocOperator032Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator033
	@Override
    public Boolean assocOperator033(Usuario instance) throws SystemException {
        try {
            // EXIST (Solicitud.Aesolicitudes.ProductoT.Dominios) WHERE (Solicitud.Aesolicitudes.ProductoT.Dominios.PlanT = Solicitud.Aesolicitudes.PlanT AND Solicitud.Aesolicitudes.ProductoT.Dominios.AcepBBGestante = true)
            return assocOperator033Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator033, Method: assocOperator033";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator033
	@Override
    public Boolean assocOperator033Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator033Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator033
	@Override
    public SQLExists assocOperator033Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Solicitud.Aesolicitudes.ProductoT.Dominios.PlanT = Solicitud.Aesolicitudes.PlanT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    if (instance.getSolicitud().isNull() || instance.getSolicitud().getAesolicitudes().getPlanT().isNull())
                    {
                    comparison1.setSecondOperand(new SQLWhereOperandNull());
                    }
                    else
                    {
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, instance.getSolicitud().getAesolicitudes().getPlanT().getOid(), UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT);
                    comparison1.setSecondOperand(operand223);
                    }
                    conjunction.addOperand(comparison1);


            // Solicitud.Aesolicitudes.ProductoT.Dominios.AcepBBGestante = true
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ATTR_NAME_DOMINIOACEPBBGESTANTE, Constants.Type.BOOL.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator033, Method: assocOperator033Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator034
	@Override
    public Boolean assocOperator034(Usuario instance) throws SystemException {
        try {
            // EXIST (Solicitud.Titular)
            return assocOperator034Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator034, Method: assocOperator034";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator034
	@Override
    public Boolean assocOperator034Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator034Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator034
	@Override
    public SQLExists assocOperator034Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_TITULAR, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator034, Method: assocOperator034Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator035
	@Override
    public Boolean assocOperator035(Usuario instance) throws SystemException {
        try {
            // EXIST (Eps)
            return assocOperator035Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator035, Method: assocOperator035";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator035
	@Override
    public Boolean assocOperator035Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator035Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator035
	@Override
    public SQLExists assocOperator035Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_EPS, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator035, Method: assocOperator035Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator038
	@Override
    public Boolean assocOperator038(Usuario instance) throws SystemException {
        try {
            // EXIST (Solicitud.Aesolicitudes.ProductoT.Dominios) WHERE (Solicitud.Aesolicitudes.ProductoT.Dominios.PlanT = Solicitud.Aesolicitudes.PlanT AND Solicitud.Aesolicitudes.ProductoT.Dominios.IgnorarPreexistencias = false)
            return assocOperator038Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator038, Method: assocOperator038";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator038
	@Override
    public Boolean assocOperator038Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator038Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator038
	@Override
    public SQLExists assocOperator038Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Solicitud.Aesolicitudes.ProductoT.Dominios.PlanT = Solicitud.Aesolicitudes.PlanT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    if (instance.getSolicitud().isNull() || instance.getSolicitud().getAesolicitudes().getPlanT().isNull())
                    {
                    comparison1.setSecondOperand(new SQLWhereOperandNull());
                    }
                    else
                    {
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, instance.getSolicitud().getAesolicitudes().getPlanT().getOid(), UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT);
                    comparison1.setSecondOperand(operand223);
                    }
                    conjunction.addOperand(comparison1);


            // Solicitud.Aesolicitudes.ProductoT.Dominios.IgnorarPreexistencias = false
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ATTR_NAME_DOMINIOIGNORARPREEXISTENCIAS, Constants.Type.BOOL.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Boolean.FALSE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator038, Method: assocOperator038Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator039
	@Override
    public Boolean assocOperator039(Usuario instance) throws SystemException {
        try {
            // EXIST (UsuarioPersona.DocumentosG) WHERE (UsuarioPersona.DocumentosG.Tipo = 1)
            return assocOperator039Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator039, Method: assocOperator039";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator039
	@Override
    public Boolean assocOperator039Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator039Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator039
	@Override
    public SQLExists assocOperator039Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_USUARIOPERSONA + "." + PersonaConstants.ROLE_NAME_DOCUMENTOSG, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // UsuarioPersona.DocumentosG.Tipo = 1
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_USUARIOPERSONA + "." + PersonaConstants.ROLE_NAME_DOCUMENTOSG + "." + DocumentoGConstants.ATTR_NAME_DOCUMENTOGTIPO, Constants.Type.NAT.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(1), Constants.Type.NAT.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator039, Method: assocOperator039Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator042
	@Override
    public Boolean assocOperator042(Usuario instance) throws SystemException {
        try {
            // EXIST (Solicitud.Aesolicitudes.ProductoT.Dominios) WHERE (Solicitud.Aesolicitudes.ProductoT.Dominios.PlanT = Solicitud.Aesolicitudes.PlanT AND Solicitud.Aesolicitudes.ProductoT.Dominios.IgnorarPreexistencias = false)
            return assocOperator042Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator042, Method: assocOperator042";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator042
	@Override
    public Boolean assocOperator042Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator042Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator042
	@Override
    public SQLExists assocOperator042Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Solicitud.Aesolicitudes.ProductoT.Dominios.PlanT = Solicitud.Aesolicitudes.PlanT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    if (instance.getSolicitud().isNull() || instance.getSolicitud().getAesolicitudes().getPlanT().isNull())
                    {
                    comparison1.setSecondOperand(new SQLWhereOperandNull());
                    }
                    else
                    {
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, instance.getSolicitud().getAesolicitudes().getPlanT().getOid(), UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT);
                    comparison1.setSecondOperand(operand223);
                    }
                    conjunction.addOperand(comparison1);


            // Solicitud.Aesolicitudes.ProductoT.Dominios.IgnorarPreexistencias = false
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ATTR_NAME_DOMINIOIGNORARPREEXISTENCIAS, Constants.Type.BOOL.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Boolean.FALSE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator042, Method: assocOperator042Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator043
	@Override
    public Boolean assocOperator043(Usuario instance) throws SystemException {
        try {
            // EXIST (Parentesco)
            return assocOperator043Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator043, Method: assocOperator043";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator043
	@Override
    public Boolean assocOperator043Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator043Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator043
	@Override
    public SQLExists assocOperator043Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_PARENTESCO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator043, Method: assocOperator043Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator044
	@Override
    public Boolean assocOperator044(Usuario instance) throws SystemException {
        try {
            // EXIST (Companyia)
            return assocOperator044Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator044, Method: assocOperator044";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator044
	@Override
    public Boolean assocOperator044Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator044Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator044
	@Override
    public SQLExists assocOperator044Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_COMPANYIA, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator044, Method: assocOperator044Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator045
	@Override
    public Boolean assocOperator045(Usuario instance) throws SystemException {
        try {
            // EXIST (Companyia)
            return assocOperator045Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator045, Method: assocOperator045";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator045
	@Override
    public Boolean assocOperator045Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator045Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator045
	@Override
    public SQLExists assocOperator045Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_COMPANYIA, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator045, Method: assocOperator045Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator049
	@Override
    public Boolean assocOperator049(Usuario instance) throws SystemException {
        try {
            // EXIST (Companyia)
            return assocOperator049Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator049, Method: assocOperator049";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator049
	@Override
    public Boolean assocOperator049Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator049Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator049
	@Override
    public SQLExists assocOperator049Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_COMPANYIA, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator049, Method: assocOperator049Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator050
	@Override
    public Boolean assocOperator050(Usuario instance) throws SystemException {
        try {
            // EXIST (Eps)
            return assocOperator050Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator050, Method: assocOperator050";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator050
	@Override
    public Boolean assocOperator050Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator050Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator050
	@Override
    public SQLExists assocOperator050Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_EPS, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator050, Method: assocOperator050Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator051
	@Override
    public Boolean assocOperator051(Usuario instance) throws SystemException {
        try {
            // EXIST (Parentesco)
            return assocOperator051Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator051, Method: assocOperator051";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator051
	@Override
    public Boolean assocOperator051Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator051Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator051
	@Override
    public SQLExists assocOperator051Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_PARENTESCO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator051, Method: assocOperator051Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator053
	@Override
    public Boolean assocOperator053(Usuario instance) throws SystemException {
        try {
            // EXIST (Parentesco)
            return assocOperator053Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator053, Method: assocOperator053";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator053
	@Override
    public Boolean assocOperator053Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator053Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator053
	@Override
    public SQLExists assocOperator053Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_PARENTESCO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator053, Method: assocOperator053Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator057
	@Override
    public Collection<Preexistencia> assocOperator057(Usuario instance) throws SystemException {
        try {
            // FOR ALL Preexistencias DO Preexistencias.eliminar(Preexistencias)
        return assocOperator057Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator057, Method: assocOperator057";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator057
	@Override
    public Collection<Preexistencia> assocOperator057Range1 (Usuario instance) throws SystemException {

        SQLSelect sql = assocOperator057Range1Query(instance);
        return new TypedQueryBuilder<Preexistencia>(em, Preexistencia.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator057
	@Override
    public SQLPopulation assocOperator057Range1Query (Usuario instance) throws SystemException {
        try {
            return new SQLPopulation(UsuarioConstants.CLASS_NAME, PreexistenciaConstants.CLASS_NAME, instance.getOid(), UsuarioConstants.ROLE_NAME_PREEXISTENCIAS);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator057, Method: assocOperator057Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator058
	@Override
    public Boolean assocOperator058(Usuario instance) throws SystemException {
        try {
            // EXIST (CuestionarioP)
            return assocOperator058Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator058, Method: assocOperator058";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator058
	@Override
    public Boolean assocOperator058Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator058Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator058
	@Override
    public SQLExists assocOperator058Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_CUESTIONARIOP, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator058, Method: assocOperator058Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator059
	@Override
    public Boolean assocOperator059(Usuario instance) throws SystemException {
        try {
            // EXIST (AnexoMat)
            return assocOperator059Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator059, Method: assocOperator059";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator059
	@Override
    public Boolean assocOperator059Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator059Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator059
	@Override
    public SQLExists assocOperator059Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_ANEXOMAT, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator059, Method: assocOperator059Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator060
	@Override
    public Boolean assocOperator060(Usuario instance) throws SystemException {
        try {
            // EXIST (AnexoNeo)
            return assocOperator060Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator060, Method: assocOperator060";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator060
	@Override
    public Boolean assocOperator060Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator060Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator060
	@Override
    public SQLExists assocOperator060Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_ANEXONEO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator060, Method: assocOperator060Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator062
	@Override
    public Boolean assocOperator062(Usuario instance) throws SystemException {
        try {
            // EXIST (AnexoMat)
            return assocOperator062Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator062, Method: assocOperator062";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator062
	@Override
    public Boolean assocOperator062Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator062Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator062
	@Override
    public SQLExists assocOperator062Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_ANEXOMAT, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator062, Method: assocOperator062Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator064
	@Override
    public Boolean assocOperator064(Usuario instance) throws SystemException {
        try {
            // EXIST (AnexoNeo)
            return assocOperator064Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator064, Method: assocOperator064";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator064
	@Override
    public Boolean assocOperator064Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator064Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator064
	@Override
    public SQLExists assocOperator064Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_ANEXONEO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator064, Method: assocOperator064Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator065
	@Override
    public Boolean assocOperator065(Usuario instance) throws SystemException {
        try {
            // EXIST (EstadoBeneficiario)
            return assocOperator065Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator065, Method: assocOperator065";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator065
	@Override
    public Boolean assocOperator065Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator065Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator065
	@Override
    public SQLExists assocOperator065Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_ESTADOBENEFICIARIO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator065, Method: assocOperator065Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator066
	@Override
    public Boolean assocOperator066(Usuario instance) throws SystemException {
        try {
            // EXIST (EstadoBeneficiario)
            return assocOperator066Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator066, Method: assocOperator066";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator066
	@Override
    public Boolean assocOperator066Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator066Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator066
	@Override
    public SQLExists assocOperator066Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_ESTADOBENEFICIARIO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator066, Method: assocOperator066Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator068
	@Override
    public Boolean assocOperator068(Usuario instance) throws SystemException {
        try {
            // EXIST (EstadoBeneficiario)
            return assocOperator068Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator068, Method: assocOperator068";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator068
	@Override
    public Boolean assocOperator068Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator068Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator068
	@Override
    public SQLExists assocOperator068Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_ESTADOBENEFICIARIO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator068, Method: assocOperator068Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator069
	@Override
    public Collection<Preexistencia> assocOperator069(Usuario instance) throws SystemException {
        try {
            // FOR ALL Preexistencias DO Preexistencias.eliminar(Preexistencias)
        return assocOperator069Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator069, Method: assocOperator069";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator069
	@Override
    public Collection<Preexistencia> assocOperator069Range1 (Usuario instance) throws SystemException {

        SQLSelect sql = assocOperator069Range1Query(instance);
        return new TypedQueryBuilder<Preexistencia>(em, Preexistencia.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator069
	@Override
    public SQLPopulation assocOperator069Range1Query (Usuario instance) throws SystemException {
        try {
            return new SQLPopulation(UsuarioConstants.CLASS_NAME, PreexistenciaConstants.CLASS_NAME, instance.getOid(), UsuarioConstants.ROLE_NAME_PREEXISTENCIAS);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator069, Method: assocOperator069Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator070
	@Override
    public Collection<PreexistenciaC> assocOperator070(Usuario usuarioTACTDESDECOREpthisUsuario, BeneficiarioC usuarioTACTDESDECOREpBeneficiarioC) throws SystemException {
        try {
            // FOR ALL pBeneficiarioC.PersonaC.PreexistenciasC DO Preexistencias.crear(this, pBeneficiarioC.PersonaC.PreexistenciasC.Descripcion, pBeneficiarioC.PersonaC.PreexistenciasC.FecInicio, pBeneficiarioC.PersonaC.PreexistenciasC.FecFin, pBeneficiarioC.PersonaC.PreexistenciasC.Observacion)
        	if (usuarioTACTDESDECOREpthisUsuario == null) {
        		throw new IllegalArgumentException("usuarioTACTDESDECOREpthisUsuario cannot be null");
        	}
        return assocOperator070Range1(usuarioTACTDESDECOREpBeneficiarioC);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator070, Method: assocOperator070";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator070
	@Override
    public Collection<PreexistenciaC> assocOperator070Range1 (BeneficiarioC usuarioTACTDESDECOREpBeneficiarioC) throws SystemException {

        SQLSelect sql = assocOperator070Range1Query(usuarioTACTDESDECOREpBeneficiarioC);
        return new TypedQueryBuilder<PreexistenciaC>(em, PreexistenciaC.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator070
	@Override
    public SQLPopulation assocOperator070Range1Query (BeneficiarioC usuarioTACTDESDECOREpBeneficiarioC) throws SystemException {
        try {
            return new SQLPopulation(UsuarioConstants.CLASS_NAME, PreexistenciaCConstants.CLASS_NAME, UsuarioConstants.ARG_NAME_TACTDESDECORE_USUARIOTACTDESDECOREPBENEFICIARIOC + "." + BeneficiarioCConstants.ROLE_NAME_PERSONAC + "." + PersonaCConstants.ROLE_NAME_PREEXISTENCIASC, usuarioTACTDESDECOREpBeneficiarioC.getOid(), UsuarioConstants.ARG_NAME_TACTDESDECORE_USUARIOTACTDESDECOREPBENEFICIARIOC);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator070, Method: assocOperator070Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator073
	@Override
    public Boolean assocOperator073(BeneficiarioC usuarioTACTDESDECOREpBeneficiarioC) throws SystemException {
        try {
            // EXIST (pBeneficiarioC.EstadoBeneficiarioC)
            return assocOperator073Range1(usuarioTACTDESDECOREpBeneficiarioC);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator073, Method: assocOperator073";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator073
	@Override
    public Boolean assocOperator073Range1 (BeneficiarioC usuarioTACTDESDECOREpBeneficiarioC) throws SystemException {
        SQLExists sql = assocOperator073Range1Query(usuarioTACTDESDECOREpBeneficiarioC, null);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator073
	@Override
    public SQLExists assocOperator073Range1Query (BeneficiarioC usuarioTACTDESDECOREpBeneficiarioC, SQLSelect superQuery) throws SystemException {
        try {
            SQLExists sql;
            // The path starts with an object
            if (superQuery != null) {
                sql = new SQLExists(superQuery, UsuarioConstants.CLASS_NAME, UsuarioConstants.ARG_NAME_TACTDESDECORE_USUARIOTACTDESDECOREPBENEFICIARIOC + "." + BeneficiarioCConstants.ROLE_NAME_ESTADOBENEFICIARIOC, BeneficiarioCConstants.CLASS_NAME, usuarioTACTDESDECOREpBeneficiarioC.getOid(), UsuarioConstants.ARG_NAME_TACTDESDECORE_USUARIOTACTDESDECOREPBENEFICIARIOC);
            } else {
                sql = new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ARG_NAME_TACTDESDECORE_USUARIOTACTDESDECOREPBENEFICIARIOC + "." + BeneficiarioCConstants.ROLE_NAME_ESTADOBENEFICIARIOC, BeneficiarioCConstants.CLASS_NAME, usuarioTACTDESDECOREpBeneficiarioC.getOid(), UsuarioConstants.ARG_NAME_TACTDESDECORE_USUARIOTACTDESDECOREPBENEFICIARIOC);
            }
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator073, Method: assocOperator073Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator074
	@Override
    public Boolean assocOperator074(Usuario instance) throws SystemException {
        try {
            // EXIST (EstadoBeneficiario)
            return assocOperator074Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator074, Method: assocOperator074";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator074
	@Override
    public Boolean assocOperator074Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator074Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator074
	@Override
    public SQLExists assocOperator074Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_ESTADOBENEFICIARIO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator074, Method: assocOperator074Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator078
	@Override
    public Collection<Preexistencia> assocOperator078(Usuario instance) throws SystemException {
        try {
            // FOR ALL Preexistencias DO Preexistencias.eliminar(Preexistencias)
        return assocOperator078Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator078, Method: assocOperator078";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator078
	@Override
    public Collection<Preexistencia> assocOperator078Range1 (Usuario instance) throws SystemException {

        SQLSelect sql = assocOperator078Range1Query(instance);
        return new TypedQueryBuilder<Preexistencia>(em, Preexistencia.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator078
	@Override
    public SQLPopulation assocOperator078Range1Query (Usuario instance) throws SystemException {
        try {
            return new SQLPopulation(UsuarioConstants.CLASS_NAME, PreexistenciaConstants.CLASS_NAME, instance.getOid(), UsuarioConstants.ROLE_NAME_PREEXISTENCIAS);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator078, Method: assocOperator078Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator079
	@Override
    public Boolean assocOperator079(Usuario instance) throws SystemException {
        try {
            // EXIST (CuestionarioP)
            return assocOperator079Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator079, Method: assocOperator079";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator079
	@Override
    public Boolean assocOperator079Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator079Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator079
	@Override
    public SQLExists assocOperator079Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_CUESTIONARIOP, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator079, Method: assocOperator079Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator080
	@Override
    public Boolean assocOperator080(Usuario instance) throws SystemException {
        try {
            // EXIST (AnexoMat)
            return assocOperator080Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator080, Method: assocOperator080";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator080
	@Override
    public Boolean assocOperator080Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator080Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator080
	@Override
    public SQLExists assocOperator080Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_ANEXOMAT, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator080, Method: assocOperator080Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator081
	@Override
    public Boolean assocOperator081(Usuario instance) throws SystemException {
        try {
            // EXIST (AnexoNeo)
            return assocOperator081Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator081, Method: assocOperator081";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator081
	@Override
    public Boolean assocOperator081Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator081Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator081
	@Override
    public SQLExists assocOperator081Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_ANEXONEO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator081, Method: assocOperator081Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator083
	@Override
    public Boolean assocOperator083(Usuario instance) throws SystemException {
        try {
            // EXIST (CuestionarioP)
            return assocOperator083Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator083, Method: assocOperator083";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator083
	@Override
    public Boolean assocOperator083Range1 (Usuario instance) throws SystemException {
        SQLExists sql = assocOperator083Range1Query(instance);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator083
	@Override
    public SQLExists assocOperator083Range1Query (Usuario instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_CUESTIONARIOP, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator083, Method: assocOperator083Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator084
	@Override
    public Collection<Preexistencia> assocOperator084(Usuario instance) throws SystemException {
        try {
            // FOR ALL Preexistencias DO Preexistencias.eliminar(Preexistencias)
        return assocOperator084Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator084, Method: assocOperator084";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator084
	@Override
    public Collection<Preexistencia> assocOperator084Range1 (Usuario instance) throws SystemException {

        SQLSelect sql = assocOperator084Range1Query(instance);
        return new TypedQueryBuilder<Preexistencia>(em, Preexistencia.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator084
	@Override
    public SQLPopulation assocOperator084Range1Query (Usuario instance) throws SystemException {
        try {
            return new SQLPopulation(UsuarioConstants.CLASS_NAME, PreexistenciaConstants.CLASS_NAME, instance.getOid(), UsuarioConstants.ROLE_NAME_PREEXISTENCIAS);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator084, Method: assocOperator084Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator086
	@Override
    public Boolean assocOperator086(Usuario instance, String usuarioTADDPREEXISTptpatrDescripcion, Date usuarioTADDPREEXISTptpatrFecInicio, Date usuarioTADDPREEXISTptpatrFecFin) throws SystemException {
        try {
            // EXIST (Preexistencias) WHERE (Preexistencias.Descripcion = ptpatrDescripcion AND Preexistencias.FecInicio = ptpatrFecInicio AND Preexistencias.FecFin = ptpatrFecFin)
            return assocOperator086Range1(instance, usuarioTADDPREEXISTptpatrDescripcion, usuarioTADDPREEXISTptpatrFecInicio, usuarioTADDPREEXISTptpatrFecFin);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator086, Method: assocOperator086";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator086
	@Override
    public Boolean assocOperator086Range1 (Usuario instance, String usuarioTADDPREEXISTptpatrDescripcion, Date usuarioTADDPREEXISTptpatrFecInicio, Date usuarioTADDPREEXISTptpatrFecFin) throws SystemException {
        SQLExists sql = assocOperator086Range1Query(instance, usuarioTADDPREEXISTptpatrDescripcion, usuarioTADDPREEXISTptpatrFecInicio, usuarioTADDPREEXISTptpatrFecFin);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator086
	@Override
    public SQLExists assocOperator086Range1Query (Usuario instance, String usuarioTADDPREEXISTptpatrDescripcion, Date usuarioTADDPREEXISTptpatrFecInicio, Date usuarioTADDPREEXISTptpatrFecFin) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(UsuarioConstants.CLASS_NAME, UsuarioConstants.ROLE_NAME_PREEXISTENCIAS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Preexistencias.Descripcion = ptpatrDescripcion
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_PREEXISTENCIAS + "." + PreexistenciaConstants.ATTR_NAME_PREEXISTENCIADESCRIPCION, Constants.Type.STRING.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(usuarioTADDPREEXISTptpatrDescripcion, Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison1);


            // Preexistencias.FecInicio = ptpatrFecInicio
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_PREEXISTENCIAS + "." + PreexistenciaConstants.ATTR_NAME_PREEXISTENCIAFECINICIO, Constants.Type.DATE.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(usuarioTADDPREEXISTptpatrFecInicio, Constants.Type.DATE.getTypeName()));
                    conjunction.addOperand(comparison2);


            // Preexistencias.FecFin = ptpatrFecFin
                    // '=' Comparison
                    SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
                    comparison3.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(UsuarioConstants.ROLE_NAME_PREEXISTENCIAS + "." + PreexistenciaConstants.ATTR_NAME_PREEXISTENCIAFECFIN, Constants.Type.DATE.getTypeName());
                    comparison3.setFirstOperand(operand114);
                    
                    // Operand 2
                    if (usuarioTADDPREEXISTptpatrFecFin!= null){
                    comparison3.setSecondOperand(new SQLWhereOperandLiteral(usuarioTADDPREEXISTptpatrFecFin, Constants.Type.DATE.getTypeName()));
                    } else {
                    comparison3.setSecondOperand(new SQLWhereOperandNull());
                    }
                    conjunction.addOperand(comparison3);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Usuario, Assoc.Operator: AssocOperator086, Method: assocOperator086Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    @Override
    public void refreshEntity(Object object) {
        super.refreshEntity(object);
    }
}
