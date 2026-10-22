package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.ContratanteConstants;
import com.keralty.aepersonas.global.DireccionConstants;
import com.keralty.aepersonas.global.DocumentoGConstants;
import com.keralty.aepersonas.global.EstadoBeneficiarioConstants;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.global.TipoDireccionConstants;
import com.keralty.aepersonas.global.TipoIdentificacionConstants;
import com.keralty.aepersonas.global.TitularConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.global.UsuarioRegConstants;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.DocumentoG;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.TipoDireccion;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import com.keralty.aepersonas.persistence.Titular;
import com.keralty.aepersonas.persistence.Usuario;
import com.keralty.aepersonas.sqlutils.SQLExists;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLPopulation;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.SQLWhereComparison;
import com.keralty.aepersonas.sqlutils.SQLWhereConjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereDisjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandLiteral;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandNull;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandOVParameter;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandOVParameterAttribute;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandPathAttribute;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandPathInstance;
import com.keralty.aepersonas.sqlutils.TypedQueryBuilder;
import com.keralty.aepersonas.utils.Agent;
import jakarta.inject.Inject;
import java.util.Collection;
import java.util.List;

public class PersonaJpaRepositoryImpl extends AbstractRepository implements PersonaJpaRepositoryCustom {

    @Inject
    public PersonaJpaRepositoryImpl(Agent agent, UserFunctions userFunctionsSrv) {
        super(agent, userFunctionsSrv);
    }

    @Override
    public List<Persona> executeQuery(String jpqlQuery) {
        return getQueryBuilder().build(jpqlQuery).execute();
    }
    
    @Override
    public List<Persona> executeQuery(String jpqlQuery, List<SQLParam> params) {
        return getQueryBuilder().build(jpqlQuery).setParameters(params).execute();
    }
    
    public Collection<Persona> executeQuery(SQLSelect select) {
        return getQueryBuilder().build(select).execute();
    }

    private TypedQueryBuilder<Persona> getQueryBuilder() {
        return new TypedQueryBuilder<>(em, Persona.class);
    }

    @Override	
    public List<Persona> solveQuery(SQLSelect select) {
        return solveQuery(select, 0, 0);
    }

    @Override
    public List<Persona> solveQuery(SQLSelect select, int pageSize, int pageNumber) {
        return getQueryBuilder().build(select, pageSize, pageNumber).execute();
    }

    // AssocOperator: AssocOperator000
	@Override
    public Boolean assocOperator000(Persona instance) throws SystemException {
        try {
            // EXIST (Direcciones)
            return assocOperator000Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator000, Method: assocOperator000";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator000
	@Override
    public Boolean assocOperator000Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator000Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator000
	@Override
    public SQLExists assocOperator000Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_DIRECCIONES, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator000, Method: assocOperator000Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator001
	@Override
    public Boolean assocOperator001(Persona instance) throws SystemException {
        try {
            // EXIST (SolicitudesContratante.GrupoAsociado)
            return assocOperator001Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator001, Method: assocOperator001";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator001
	@Override
    public Boolean assocOperator001Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator001Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator001
	@Override
    public SQLExists assocOperator001Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_SOLICITUDESCONTRATANTE + "." + SolicitudConstants.ROLE_NAME_GRUPOASOCIADO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator001, Method: assocOperator001Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator002
	@Override
    public Boolean assocOperator002(Persona instance) throws SystemException {
        try {
            // EXIST (SolicitudesContratante) WHERE (SolicitudesContratante.Tramite = 2)
            return assocOperator002Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator002, Method: assocOperator002";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator002
	@Override
    public Boolean assocOperator002Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator002Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator002
	@Override
    public SQLExists assocOperator002Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_SOLICITUDESCONTRATANTE, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // SolicitudesContratante.Tramite = 2
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(PersonaConstants.ROLE_NAME_SOLICITUDESCONTRATANTE + "." + SolicitudConstants.ATTR_NAME_SOLICITUDTRAMITE, Constants.Type.NAT.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(2), Constants.Type.NAT.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator002, Method: assocOperator002Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator003
	@Override
    public Boolean assocOperator003(Persona instance) throws SystemException {
        try {
            // EXIST (SolicitudesTitular) WHERE (SolicitudesTitular.Tramite = 1)
            return assocOperator003Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator003, Method: assocOperator003";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator003
	@Override
    public Boolean assocOperator003Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator003Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator003
	@Override
    public SQLExists assocOperator003Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_SOLICITUDESTITULAR, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // SolicitudesTitular.Tramite = 1
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(PersonaConstants.ROLE_NAME_SOLICITUDESTITULAR + "." + SolicitudConstants.ATTR_NAME_SOLICITUDTRAMITE, Constants.Type.NAT.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(1), Constants.Type.NAT.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator003, Method: assocOperator003Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator004
	@Override
    public Boolean assocOperator004(Persona instance) throws SystemException {
        try {
            // EXIST (SolicitudesTitular) WHERE (SolicitudesTitular.Tramite <> 1 AND SolicitudesTitular.NumFamilia = NULL)
            return assocOperator004Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator004, Method: assocOperator004";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator004
	@Override
    public Boolean assocOperator004Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator004Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator004
	@Override
    public SQLExists assocOperator004Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_SOLICITUDESTITULAR, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // SolicitudesTitular.Tramite <> 1
                    // '<>' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("<>");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(PersonaConstants.ROLE_NAME_SOLICITUDESTITULAR + "." + SolicitudConstants.ATTR_NAME_SOLICITUDTRAMITE, Constants.Type.NAT.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Long.valueOf(1), Constants.Type.NAT.getTypeName()));
                    conjunction.addOperand(comparison1);


            // SolicitudesTitular.NumFamilia = NULL
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(PersonaConstants.ROLE_NAME_SOLICITUDESTITULAR + "." + SolicitudConstants.ATTR_NAME_SOLICITUDNUMFAMILIA, Constants.Type.STRING.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandNull());
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator004, Method: assocOperator004Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator005
	@Override
    public Boolean assocOperator005(Persona instance) throws SystemException {
        try {
            // EXIST (Usuarios.Eps)
            return assocOperator005Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator005, Method: assocOperator005";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator005
	@Override
    public Boolean assocOperator005Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator005Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator005
	@Override
    public SQLExists assocOperator005Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_EPS, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator005, Method: assocOperator005Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator006
	@Override
    public Boolean assocOperator006(Solicitud personaTADDUSUARIOASOLptSolicitud, TipoIdentificacion personaTADDUSUARIOASOLptpagrTipoIdentificacion, String personaTADDUSUARIOASOLptpatrNumIdentificacion) throws SystemException {
        try {
            // EXIST (ptSolicitud.Usuarios) WHERE (ptSolicitud.Usuarios.TipoIdentificacion = ptpagrTipoIdentificacion AND ptSolicitud.Usuarios.NumIdentificacion = ptpatrNumIdentificacion)
            return assocOperator006Range1(personaTADDUSUARIOASOLptSolicitud, personaTADDUSUARIOASOLptpagrTipoIdentificacion, personaTADDUSUARIOASOLptpatrNumIdentificacion);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator006, Method: assocOperator006";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator006
	@Override
    public Boolean assocOperator006Range1 (Solicitud personaTADDUSUARIOASOLptSolicitud, TipoIdentificacion personaTADDUSUARIOASOLptpagrTipoIdentificacion, String personaTADDUSUARIOASOLptpatrNumIdentificacion) throws SystemException {
        SQLExists sql = assocOperator006Range1Query(personaTADDUSUARIOASOLptSolicitud, personaTADDUSUARIOASOLptpagrTipoIdentificacion, personaTADDUSUARIOASOLptpatrNumIdentificacion, null);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator006
	@Override
    public SQLExists assocOperator006Range1Query (Solicitud personaTADDUSUARIOASOLptSolicitud, TipoIdentificacion personaTADDUSUARIOASOLptpagrTipoIdentificacion, String personaTADDUSUARIOASOLptpatrNumIdentificacion, SQLSelect superQuery) throws SystemException {
        try {
            SQLExists sql;
            // The path starts with an object
            if (superQuery != null) {
                sql = new SQLExists(superQuery, PersonaConstants.CLASS_NAME, PersonaConstants.ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTSOLICITUD + "." + SolicitudConstants.ROLE_NAME_USUARIOS, SolicitudConstants.CLASS_NAME, personaTADDUSUARIOASOLptSolicitud.getOid(), PersonaConstants.ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTSOLICITUD);
            } else {
                sql = new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTSOLICITUD + "." + SolicitudConstants.ROLE_NAME_USUARIOS, SolicitudConstants.CLASS_NAME, personaTADDUSUARIOASOLptSolicitud.getOid(), PersonaConstants.ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTSOLICITUD);
            }
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // ptSolicitud.Usuarios.TipoIdentificacion = ptpagrTipoIdentificacion
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandOVParameter operand112 = new SQLWhereOperandOVParameter(PersonaConstants.ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTSOLICITUD + "." + SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ROLE_NAME_TIPOIDENTIFICACION, SolicitudConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, personaTADDUSUARIOASOLptSolicitud.getOid(), PersonaConstants.ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTSOLICITUD);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(PersonaConstants.ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRTIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, personaTADDUSUARIOASOLptpagrTipoIdentificacion.getOid(), PersonaConstants.ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRTIPOIDENTIFICACION);
                    comparison1.setSecondOperand(operand223);
                    conjunction.addOperand(comparison1);


            // ptSolicitud.Usuarios.NumIdentificacion = ptpatrNumIdentificacion
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandOVParameterAttribute operand113 = new SQLWhereOperandOVParameterAttribute(PersonaConstants.ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTSOLICITUD + "." + SolicitudConstants.ROLE_NAME_USUARIOS + "." + UsuarioConstants.ATTR_NAME_USUARIONUMIDENTIFICACION, SolicitudConstants.CLASS_NAME, personaTADDUSUARIOASOLptSolicitud.getOid(), PersonaConstants.ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTSOLICITUD, Constants.Type.STRING.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(personaTADDUSUARIOASOLptpatrNumIdentificacion, Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator006, Method: assocOperator006Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator007
	@Override
    public Boolean assocOperator007(Solicitud personaTADDUSUARIOASOLptSolicitud, TipoIdentificacion personaTADDUSUARIOASOLptpagrTipoIdentificacion, String personaTADDUSUARIOASOLptpatrNumIdentificacion) throws SystemException {
        try {
            // EXIST (ptSolicitud.UsuariosRegistrados) WHERE (ptSolicitud.UsuariosRegistrados.TipoIdentificacion = ptpagrTipoIdentificacion.NombreCorto AND ptSolicitud.UsuariosRegistrados.NumIdentificacion = ptpatrNumIdentificacion AND (ptSolicitud.UsuariosRegistrados.EstadoBeneficiario.EsActivo = true OR ptSolicitud.UsuariosRegistrados.EstadoBeneficiario.EsError = true))
            return assocOperator007Range1(personaTADDUSUARIOASOLptSolicitud, personaTADDUSUARIOASOLptpagrTipoIdentificacion, personaTADDUSUARIOASOLptpatrNumIdentificacion);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator007, Method: assocOperator007";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator007
	@Override
    public Boolean assocOperator007Range1 (Solicitud personaTADDUSUARIOASOLptSolicitud, TipoIdentificacion personaTADDUSUARIOASOLptpagrTipoIdentificacion, String personaTADDUSUARIOASOLptpatrNumIdentificacion) throws SystemException {
        SQLExists sql = assocOperator007Range1Query(personaTADDUSUARIOASOLptSolicitud, personaTADDUSUARIOASOLptpagrTipoIdentificacion, personaTADDUSUARIOASOLptpatrNumIdentificacion, null);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator007
	@Override
    public SQLExists assocOperator007Range1Query (Solicitud personaTADDUSUARIOASOLptSolicitud, TipoIdentificacion personaTADDUSUARIOASOLptpagrTipoIdentificacion, String personaTADDUSUARIOASOLptpatrNumIdentificacion, SQLSelect superQuery) throws SystemException {
        try {
            SQLExists sql;
            // The path starts with an object
            if (superQuery != null) {
                sql = new SQLExists(superQuery, PersonaConstants.CLASS_NAME, PersonaConstants.ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTSOLICITUD + "." + SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS, SolicitudConstants.CLASS_NAME, personaTADDUSUARIOASOLptSolicitud.getOid(), PersonaConstants.ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTSOLICITUD);
            } else {
                sql = new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTSOLICITUD + "." + SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS, SolicitudConstants.CLASS_NAME, personaTADDUSUARIOASOLptSolicitud.getOid(), PersonaConstants.ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTSOLICITUD);
            }
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // ptSolicitud.UsuariosRegistrados.TipoIdentificacion = ptpagrTipoIdentificacion.NombreCorto
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandOVParameterAttribute operand112 = new SQLWhereOperandOVParameterAttribute(PersonaConstants.ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTSOLICITUD + "." + SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS + "." + UsuarioRegConstants.ATTR_NAME_USUARIOREGTIPOIDENTIFICACION, SolicitudConstants.CLASS_NAME, personaTADDUSUARIOASOLptSolicitud.getOid(), PersonaConstants.ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTSOLICITUD, Constants.Type.STRING.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(personaTADDUSUARIOASOLptpagrTipoIdentificacion.getTipoIdentificacionNombreCorto(), Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison1);


            // ptSolicitud.UsuariosRegistrados.NumIdentificacion = ptpatrNumIdentificacion
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandOVParameterAttribute operand113 = new SQLWhereOperandOVParameterAttribute(PersonaConstants.ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTSOLICITUD + "." + SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS + "." + UsuarioRegConstants.ATTR_NAME_USUARIOREGNUMIDENTIFICACION, SolicitudConstants.CLASS_NAME, personaTADDUSUARIOASOLptSolicitud.getOid(), PersonaConstants.ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTSOLICITUD, Constants.Type.STRING.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(personaTADDUSUARIOASOLptpatrNumIdentificacion, Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison2);


            // (ptSolicitud.UsuariosRegistrados.EstadoBeneficiario.EsActivo = true OR ptSolicitud.UsuariosRegistrados.EstadoBeneficiario.EsError = true)
                {
                    // 'or' Logical operator
                    SQLWhereDisjunction comparison3 = new SQLWhereDisjunction();
                
                    // Operand 1
                        // '=' Comparison
                        SQLWhereComparison comparison4 = new SQLWhereComparison(sql);
                        comparison4.setOperator("=");
                        
                        // Operand 1
                        SQLWhereOperandOVParameterAttribute operand115 = new SQLWhereOperandOVParameterAttribute(PersonaConstants.ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTSOLICITUD + "." + SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS + "." + UsuarioRegConstants.ROLE_NAME_ESTADOBENEFICIARIO + "." + EstadoBeneficiarioConstants.ATTR_NAME_ESTADOBENEFICIARIOESACTIVO, SolicitudConstants.CLASS_NAME, personaTADDUSUARIOASOLptSolicitud.getOid(), PersonaConstants.ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTSOLICITUD, Constants.Type.BOOL.getTypeName());
                        comparison4.setFirstOperand(operand115);
                        
                        // Operand 2
                        comparison4.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                        comparison3.addOperand(comparison4);
                
                    // Operand 2
                        // '=' Comparison
                        SQLWhereComparison comparison7 = new SQLWhereComparison(sql);
                        comparison7.setOperator("=");
                        
                        // Operand 1
                        SQLWhereOperandOVParameterAttribute operand118 = new SQLWhereOperandOVParameterAttribute(PersonaConstants.ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTSOLICITUD + "." + SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS + "." + UsuarioRegConstants.ROLE_NAME_ESTADOBENEFICIARIO + "." + EstadoBeneficiarioConstants.ATTR_NAME_ESTADOBENEFICIARIOESERROR, SolicitudConstants.CLASS_NAME, personaTADDUSUARIOASOLptSolicitud.getOid(), PersonaConstants.ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTSOLICITUD, Constants.Type.BOOL.getTypeName());
                        comparison7.setFirstOperand(operand118);
                        
                        // Operand 2
                        comparison7.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                        comparison3.addOperand(comparison7);
                    
                    conjunction.addOperand(comparison3);
                }

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator007, Method: assocOperator007Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator015
	@Override
    public Boolean assocOperator015(Persona instance) throws SystemException {
        try {
            // EXIST (DepartamentoNacimiento)
            return assocOperator015Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator015, Method: assocOperator015";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator015
	@Override
    public Boolean assocOperator015Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator015Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator015
	@Override
    public SQLExists assocOperator015Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_DEPARTAMENTONACIMIENTO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator015, Method: assocOperator015Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator016
	@Override
    public Boolean assocOperator016(Persona instance) throws SystemException {
        try {
            // EXIST (DepartamentoNacimiento)
            return assocOperator016Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator016, Method: assocOperator016";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator016
	@Override
    public Boolean assocOperator016Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator016Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator016
	@Override
    public SQLExists assocOperator016Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_DEPARTAMENTONACIMIENTO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator016, Method: assocOperator016Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator018
	@Override
    public Boolean assocOperator018(Persona instance) throws SystemException {
        try {
            // EXIST (MunicipioNacimiento)
            return assocOperator018Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator018, Method: assocOperator018";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator018
	@Override
    public Boolean assocOperator018Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator018Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator018
	@Override
    public SQLExists assocOperator018Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_MUNICIPIONACIMIENTO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator018, Method: assocOperator018Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator019
	@Override
    public Boolean assocOperator019(Persona instance) throws SystemException {
        try {
            // EXIST (MunicipioNacimiento)
            return assocOperator019Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator019, Method: assocOperator019";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator019
	@Override
    public Boolean assocOperator019Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator019Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator019
	@Override
    public SQLExists assocOperator019Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_MUNICIPIONACIMIENTO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator019, Method: assocOperator019Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator021
	@Override
    public Boolean assocOperator021(Persona instance) throws SystemException {
        try {
            // EXIST (EstadoCivil)
            return assocOperator021Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator021, Method: assocOperator021";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator021
	@Override
    public Boolean assocOperator021Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator021Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator021
	@Override
    public SQLExists assocOperator021Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_ESTADOCIVIL, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator021, Method: assocOperator021Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator022
	@Override
    public Boolean assocOperator022(Persona instance) throws SystemException {
        try {
            // EXIST (EstadoCivil)
            return assocOperator022Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator022, Method: assocOperator022";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator022
	@Override
    public Boolean assocOperator022Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator022Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator022
	@Override
    public SQLExists assocOperator022Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_ESTADOCIVIL, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator022, Method: assocOperator022Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator024
	@Override
    public Boolean assocOperator024(Persona instance) throws SystemException {
        try {
            // EXIST (DepartamentoNacimiento)
            return assocOperator024Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator024, Method: assocOperator024";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator024
	@Override
    public Boolean assocOperator024Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator024Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator024
	@Override
    public SQLExists assocOperator024Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_DEPARTAMENTONACIMIENTO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator024, Method: assocOperator024Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator025
	@Override
    public Boolean assocOperator025(Persona instance) throws SystemException {
        try {
            // EXIST (DepartamentoNacimiento)
            return assocOperator025Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator025, Method: assocOperator025";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator025
	@Override
    public Boolean assocOperator025Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator025Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator025
	@Override
    public SQLExists assocOperator025Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_DEPARTAMENTONACIMIENTO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator025, Method: assocOperator025Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator026
	@Override
    public Boolean assocOperator026(Persona instance) throws SystemException {
        try {
            // EXIST (DepartamentoNacimiento)
            return assocOperator026Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator026, Method: assocOperator026";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator026
	@Override
    public Boolean assocOperator026Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator026Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator026
	@Override
    public SQLExists assocOperator026Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_DEPARTAMENTONACIMIENTO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator026, Method: assocOperator026Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator027
	@Override
    public Boolean assocOperator027(Persona instance) throws SystemException {
        try {
            // EXIST (MunicipioNacimiento)
            return assocOperator027Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator027, Method: assocOperator027";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator027
	@Override
    public Boolean assocOperator027Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator027Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator027
	@Override
    public SQLExists assocOperator027Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_MUNICIPIONACIMIENTO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator027, Method: assocOperator027Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator028
	@Override
    public Boolean assocOperator028(Persona instance) throws SystemException {
        try {
            // EXIST (MunicipioNacimiento)
            return assocOperator028Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator028, Method: assocOperator028";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator028
	@Override
    public Boolean assocOperator028Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator028Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator028
	@Override
    public SQLExists assocOperator028Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_MUNICIPIONACIMIENTO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator028, Method: assocOperator028Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator029
	@Override
    public Boolean assocOperator029(Persona instance) throws SystemException {
        try {
            // EXIST (MunicipioNacimiento)
            return assocOperator029Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator029, Method: assocOperator029";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator029
	@Override
    public Boolean assocOperator029Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator029Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator029
	@Override
    public SQLExists assocOperator029Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_MUNICIPIONACIMIENTO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator029, Method: assocOperator029Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator030
	@Override
    public Boolean assocOperator030(Persona instance) throws SystemException {
        try {
            // EXIST (EstadoPersona)
            return assocOperator030Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator030, Method: assocOperator030";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator030
	@Override
    public Boolean assocOperator030Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator030Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator030
	@Override
    public SQLExists assocOperator030Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_ESTADOPERSONA, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator030, Method: assocOperator030Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator031
	@Override
    public Boolean assocOperator031(Persona instance) throws SystemException {
        try {
            // EXIST (DepartamentoNacimiento)
            return assocOperator031Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator031, Method: assocOperator031";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator031
	@Override
    public Boolean assocOperator031Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator031Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator031
	@Override
    public SQLExists assocOperator031Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_DEPARTAMENTONACIMIENTO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator031, Method: assocOperator031Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator032
	@Override
    public Boolean assocOperator032(Persona instance) throws SystemException {
        try {
            // EXIST (MunicipioNacimiento)
            return assocOperator032Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator032, Method: assocOperator032";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator032
	@Override
    public Boolean assocOperator032Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator032Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator032
	@Override
    public SQLExists assocOperator032Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_MUNICIPIONACIMIENTO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator032, Method: assocOperator032Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator033
	@Override
    public Boolean assocOperator033(Persona instance) throws SystemException {
        try {
            // EXIST (EstadoCivil)
            return assocOperator033Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator033, Method: assocOperator033";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator033
	@Override
    public Boolean assocOperator033Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator033Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator033
	@Override
    public SQLExists assocOperator033Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_ESTADOCIVIL, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator033, Method: assocOperator033Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator034
	@Override
    public Boolean assocOperator034(Persona instance) throws SystemException {
        try {
            // EXIST (DepartamentoNacimiento)
            return assocOperator034Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator034, Method: assocOperator034";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator034
	@Override
    public Boolean assocOperator034Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator034Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator034
	@Override
    public SQLExists assocOperator034Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_DEPARTAMENTONACIMIENTO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator034, Method: assocOperator034Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator035
	@Override
    public Boolean assocOperator035(Persona instance) throws SystemException {
        try {
            // EXIST (DepartamentoNacimiento)
            return assocOperator035Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator035, Method: assocOperator035";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator035
	@Override
    public Boolean assocOperator035Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator035Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator035
	@Override
    public SQLExists assocOperator035Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_DEPARTAMENTONACIMIENTO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator035, Method: assocOperator035Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator037
	@Override
    public Boolean assocOperator037(Persona instance) throws SystemException {
        try {
            // EXIST (MunicipioNacimiento)
            return assocOperator037Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator037, Method: assocOperator037";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator037
	@Override
    public Boolean assocOperator037Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator037Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator037
	@Override
    public SQLExists assocOperator037Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_MUNICIPIONACIMIENTO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator037, Method: assocOperator037Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator038
	@Override
    public Boolean assocOperator038(Persona instance) throws SystemException {
        try {
            // EXIST (MunicipioNacimiento)
            return assocOperator038Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator038, Method: assocOperator038";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator038
	@Override
    public Boolean assocOperator038Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator038Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator038
	@Override
    public SQLExists assocOperator038Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_MUNICIPIONACIMIENTO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator038, Method: assocOperator038Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator040
	@Override
    public Boolean assocOperator040(Persona instance) throws SystemException {
        try {
            // EXIST (EstadoCivil)
            return assocOperator040Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator040, Method: assocOperator040";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator040
	@Override
    public Boolean assocOperator040Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator040Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator040
	@Override
    public SQLExists assocOperator040Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_ESTADOCIVIL, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator040, Method: assocOperator040Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator041
	@Override
    public Boolean assocOperator041(Persona instance) throws SystemException {
        try {
            // EXIST (EstadoCivil)
            return assocOperator041Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator041, Method: assocOperator041";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator041
	@Override
    public Boolean assocOperator041Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator041Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator041
	@Override
    public SQLExists assocOperator041Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_ESTADOCIVIL, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator041, Method: assocOperator041Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator044
	@Override
    public Collection<Direccion> assocOperator044(Persona instance, TipoDireccion personaTMODUSUARIOptpevcTipoDireccion) throws SystemException {
        try {
            // FOR ALL Direcciones WHERE (Direcciones.TipoDireccion = ptpevcTipoDireccion) DO Direcciones.TMODIFICAR(Direcciones, ptpDireccionCompleta, ptpRural, ptpevcDepartamento, ptpevcMunicipio, ptpagrPais, ptpevcTipoDireccion)
        return assocOperator044Range1(instance, personaTMODUSUARIOptpevcTipoDireccion);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator044, Method: assocOperator044";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator044
	@Override
    public Collection<Direccion> assocOperator044Range1 (Persona instance, TipoDireccion personaTMODUSUARIOptpevcTipoDireccion) throws SystemException {

        SQLSelect sql = assocOperator044Range1Query(instance, personaTMODUSUARIOptpevcTipoDireccion);
        return new TypedQueryBuilder<Direccion>(em, Direccion.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator044
	@Override
    public SQLPopulation assocOperator044Range1Query (Persona instance, TipoDireccion personaTMODUSUARIOptpevcTipoDireccion) throws SystemException {
        try {
            SQLPopulation sql = new SQLPopulation(PersonaConstants.CLASS_NAME, DireccionConstants.CLASS_NAME, instance.getOid(), PersonaConstants.ROLE_NAME_DIRECCIONES);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Direcciones.TipoDireccion = ptpevcTipoDireccion
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(PersonaConstants.ROLE_NAME_DIRECCIONES + "." + DireccionConstants.ROLE_NAME_TIPODIRECCION, TipoDireccionConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(PersonaConstants.ARG_NAME_TMODUSUARIO_PERSONATMODUSUARIOPTPEVCTIPODIRECCION, TipoDireccionConstants.CLASS_NAME, TipoDireccionConstants.CLASS_NAME, personaTMODUSUARIOptpevcTipoDireccion.getOid(), PersonaConstants.ARG_NAME_TMODUSUARIO_PERSONATMODUSUARIOPTPEVCTIPODIRECCION);
                    comparison1.setSecondOperand(operand223);
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator044, Method: assocOperator044Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator046
	@Override
    public Boolean assocOperator046(Persona instance) throws SystemException {
        try {
            // EXIST (DepartamentoNacimiento)
            return assocOperator046Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator046, Method: assocOperator046";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator046
	@Override
    public Boolean assocOperator046Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator046Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator046
	@Override
    public SQLExists assocOperator046Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_DEPARTAMENTONACIMIENTO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator046, Method: assocOperator046Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator047
	@Override
    public Boolean assocOperator047(Persona instance) throws SystemException {
        try {
            // EXIST (MunicipioNacimiento)
            return assocOperator047Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator047, Method: assocOperator047";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator047
	@Override
    public Boolean assocOperator047Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator047Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator047
	@Override
    public SQLExists assocOperator047Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_MUNICIPIONACIMIENTO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator047, Method: assocOperator047Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator048
	@Override
    public Boolean assocOperator048(Persona instance) throws SystemException {
        try {
            // EXIST (EstadoCivil)
            return assocOperator048Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator048, Method: assocOperator048";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator048
	@Override
    public Boolean assocOperator048Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator048Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator048
	@Override
    public SQLExists assocOperator048Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_ESTADOCIVIL, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator048, Method: assocOperator048Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator049
	@Override
    public Boolean assocOperator049(Persona instance, TipoDireccion personaTMODUSUARIOptpevcTipoDireccion) throws SystemException {
        try {
            // EXIST (Direcciones) WHERE (Direcciones.TipoDireccion = ptpevcTipoDireccion)
            return assocOperator049Range1(instance, personaTMODUSUARIOptpevcTipoDireccion);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator049, Method: assocOperator049";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator049
	@Override
    public Boolean assocOperator049Range1 (Persona instance, TipoDireccion personaTMODUSUARIOptpevcTipoDireccion) throws SystemException {
        SQLExists sql = assocOperator049Range1Query(instance, personaTMODUSUARIOptpevcTipoDireccion);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator049
	@Override
    public SQLExists assocOperator049Range1Query (Persona instance, TipoDireccion personaTMODUSUARIOptpevcTipoDireccion) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_DIRECCIONES, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Direcciones.TipoDireccion = ptpevcTipoDireccion
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(PersonaConstants.ROLE_NAME_DIRECCIONES + "." + DireccionConstants.ROLE_NAME_TIPODIRECCION, TipoDireccionConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(PersonaConstants.ARG_NAME_TMODUSUARIO_PERSONATMODUSUARIOPTPEVCTIPODIRECCION, TipoDireccionConstants.CLASS_NAME, TipoDireccionConstants.CLASS_NAME, personaTMODUSUARIOptpevcTipoDireccion.getOid(), PersonaConstants.ARG_NAME_TMODUSUARIO_PERSONATMODUSUARIOPTPEVCTIPODIRECCION);
                    comparison1.setSecondOperand(operand223);
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator049, Method: assocOperator049Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator050
	@Override
    public Boolean assocOperator050(Persona instance, TipoDireccion personaTMODUSUARIOptpevcTipoDireccion) throws SystemException {
        try {
            // EXIST (Direcciones) WHERE (Direcciones.TipoDireccion = ptpevcTipoDireccion)
            return assocOperator050Range1(instance, personaTMODUSUARIOptpevcTipoDireccion);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator050, Method: assocOperator050";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator050
	@Override
    public Boolean assocOperator050Range1 (Persona instance, TipoDireccion personaTMODUSUARIOptpevcTipoDireccion) throws SystemException {
        SQLExists sql = assocOperator050Range1Query(instance, personaTMODUSUARIOptpevcTipoDireccion);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator050
	@Override
    public SQLExists assocOperator050Range1Query (Persona instance, TipoDireccion personaTMODUSUARIOptpevcTipoDireccion) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_DIRECCIONES, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Direcciones.TipoDireccion = ptpevcTipoDireccion
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(PersonaConstants.ROLE_NAME_DIRECCIONES + "." + DireccionConstants.ROLE_NAME_TIPODIRECCION, TipoDireccionConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(PersonaConstants.ARG_NAME_TMODUSUARIO_PERSONATMODUSUARIOPTPEVCTIPODIRECCION, TipoDireccionConstants.CLASS_NAME, TipoDireccionConstants.CLASS_NAME, personaTMODUSUARIOptpevcTipoDireccion.getOid(), PersonaConstants.ARG_NAME_TMODUSUARIO_PERSONATMODUSUARIOPTPEVCTIPODIRECCION);
                    comparison1.setSecondOperand(operand223);
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator050, Method: assocOperator050Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator052
	@Override
    public Boolean assocOperator052(Persona instance) throws SystemException {
        try {
            // EXIST (DepartamentoNacimiento)
            return assocOperator052Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator052, Method: assocOperator052";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator052
	@Override
    public Boolean assocOperator052Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator052Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator052
	@Override
    public SQLExists assocOperator052Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_DEPARTAMENTONACIMIENTO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator052, Method: assocOperator052Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator053
	@Override
    public Boolean assocOperator053(Persona instance) throws SystemException {
        try {
            // EXIST (DepartamentoNacimiento)
            return assocOperator053Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator053, Method: assocOperator053";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator053
	@Override
    public Boolean assocOperator053Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator053Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator053
	@Override
    public SQLExists assocOperator053Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_DEPARTAMENTONACIMIENTO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator053, Method: assocOperator053Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator055
	@Override
    public Boolean assocOperator055(Persona instance) throws SystemException {
        try {
            // EXIST (MunicipioNacimiento)
            return assocOperator055Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator055, Method: assocOperator055";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator055
	@Override
    public Boolean assocOperator055Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator055Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator055
	@Override
    public SQLExists assocOperator055Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_MUNICIPIONACIMIENTO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator055, Method: assocOperator055Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator056
	@Override
    public Boolean assocOperator056(Persona instance) throws SystemException {
        try {
            // EXIST (MunicipioNacimiento)
            return assocOperator056Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator056, Method: assocOperator056";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator056
	@Override
    public Boolean assocOperator056Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator056Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator056
	@Override
    public SQLExists assocOperator056Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_MUNICIPIONACIMIENTO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator056, Method: assocOperator056Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator058
	@Override
    public Boolean assocOperator058(Persona instance) throws SystemException {
        try {
            // EXIST (EstadoCivil)
            return assocOperator058Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator058, Method: assocOperator058";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator058
	@Override
    public Boolean assocOperator058Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator058Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator058
	@Override
    public SQLExists assocOperator058Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_ESTADOCIVIL, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator058, Method: assocOperator058Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator059
	@Override
    public Boolean assocOperator059(Persona instance) throws SystemException {
        try {
            // EXIST (EstadoCivil)
            return assocOperator059Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator059, Method: assocOperator059";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator059
	@Override
    public Boolean assocOperator059Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator059Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator059
	@Override
    public SQLExists assocOperator059Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_ESTADOCIVIL, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator059, Method: assocOperator059Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator061
	@Override
    public Boolean assocOperator061(Persona instance) throws SystemException {
        try {
            // EXIST (EstadoPersona)
            return assocOperator061Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator061, Method: assocOperator061";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator061
	@Override
    public Boolean assocOperator061Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator061Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator061
	@Override
    public SQLExists assocOperator061Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_ESTADOPERSONA, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator061, Method: assocOperator061Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator062
	@Override
    public Boolean assocOperator062(Persona instance) throws SystemException {
        try {
            // EXIST (DepartamentoNacimiento)
            return assocOperator062Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator062, Method: assocOperator062";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator062
	@Override
    public Boolean assocOperator062Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator062Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator062
	@Override
    public SQLExists assocOperator062Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_DEPARTAMENTONACIMIENTO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator062, Method: assocOperator062Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator063
	@Override
    public Boolean assocOperator063(Persona instance) throws SystemException {
        try {
            // EXIST (MunicipioNacimiento)
            return assocOperator063Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator063, Method: assocOperator063";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator063
	@Override
    public Boolean assocOperator063Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator063Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator063
	@Override
    public SQLExists assocOperator063Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_MUNICIPIONACIMIENTO, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator063, Method: assocOperator063Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator064
	@Override
    public Boolean assocOperator064(Persona instance) throws SystemException {
        try {
            // EXIST (EstadoCivil)
            return assocOperator064Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator064, Method: assocOperator064";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator064
	@Override
    public Boolean assocOperator064Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator064Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator064
	@Override
    public SQLExists assocOperator064Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_ESTADOCIVIL, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator064, Method: assocOperator064Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator065
	@Override
    public Collection<DocumentoG> assocOperator065(Persona instance) throws SystemException {
        try {
            // FOR ALL DocumentosG DO DocumentosG.TELIMINAR(DocumentosG)
        return assocOperator065Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator065, Method: assocOperator065";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator065
	@Override
    public Collection<DocumentoG> assocOperator065Range1 (Persona instance) throws SystemException {

        SQLSelect sql = assocOperator065Range1Query(instance);
        return new TypedQueryBuilder<DocumentoG>(em, DocumentoG.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator065
	@Override
    public SQLPopulation assocOperator065Range1Query (Persona instance) throws SystemException {
        try {
            return new SQLPopulation(PersonaConstants.CLASS_NAME, DocumentoGConstants.CLASS_NAME, instance.getOid(), PersonaConstants.ROLE_NAME_DOCUMENTOSG);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator065, Method: assocOperator065Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator066
	@Override
    public Collection<Usuario> assocOperator066(Persona instance) throws SystemException {
        try {
            // FOR ALL Usuarios DO Usuarios.TELIMINAR(Usuarios)
        return assocOperator066Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator066, Method: assocOperator066";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator066
	@Override
    public Collection<Usuario> assocOperator066Range1 (Persona instance) throws SystemException {

        SQLSelect sql = assocOperator066Range1Query(instance);
        return new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator066
	@Override
    public SQLPopulation assocOperator066Range1Query (Persona instance) throws SystemException {
        try {
            return new SQLPopulation(PersonaConstants.CLASS_NAME, UsuarioConstants.CLASS_NAME, instance.getOid(), PersonaConstants.ROLE_NAME_USUARIOS);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator066, Method: assocOperator066Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator067
	@Override
    public Collection<Direccion> assocOperator067(Persona instance) throws SystemException {
        try {
            // FOR ALL Direcciones DO Direcciones.eliminar(Direcciones)
        return assocOperator067Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator067, Method: assocOperator067";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator067
	@Override
    public Collection<Direccion> assocOperator067Range1 (Persona instance) throws SystemException {

        SQLSelect sql = assocOperator067Range1Query(instance);
        return new TypedQueryBuilder<Direccion>(em, Direccion.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator067
	@Override
    public SQLPopulation assocOperator067Range1Query (Persona instance) throws SystemException {
        try {
            return new SQLPopulation(PersonaConstants.CLASS_NAME, DireccionConstants.CLASS_NAME, instance.getOid(), PersonaConstants.ROLE_NAME_DIRECCIONES);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator067, Method: assocOperator067Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator068
	@Override
    public Collection<Contratante> assocOperator068(Persona instance) throws SystemException {
        try {
            // FOR ALL SolicitudesContratante.Contratante DO SolicitudesContratante.Contratante.actualizarCodigo(SolicitudesContratante.Contratante, Codigo)
        return assocOperator068Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator068, Method: assocOperator068";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator068
	@Override
    public Collection<Contratante> assocOperator068Range1 (Persona instance) throws SystemException {

        SQLSelect sql = assocOperator068Range1Query(instance);
        return new TypedQueryBuilder<Contratante>(em, Contratante.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator068
	@Override
    public SQLPopulation assocOperator068Range1Query (Persona instance) throws SystemException {
        try {
            return new SQLPopulation(PersonaConstants.CLASS_NAME, ContratanteConstants.CLASS_NAME, instance.getOid(), PersonaConstants.ROLE_NAME_SOLICITUDESCONTRATANTE + "." + SolicitudConstants.ROLE_NAME_CONTRATANTE);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator068, Method: assocOperator068Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator069
	@Override
    public Collection<Titular> assocOperator069(Persona instance) throws SystemException {
        try {
            // FOR ALL SolicitudesTitular.Titular DO SolicitudesTitular.Titular.actualizarCodigo(SolicitudesTitular.Titular, Codigo)
        return assocOperator069Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator069, Method: assocOperator069";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator069
	@Override
    public Collection<Titular> assocOperator069Range1 (Persona instance) throws SystemException {

        SQLSelect sql = assocOperator069Range1Query(instance);
        return new TypedQueryBuilder<Titular>(em, Titular.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator069
	@Override
    public SQLPopulation assocOperator069Range1Query (Persona instance) throws SystemException {
        try {
            return new SQLPopulation(PersonaConstants.CLASS_NAME, TitularConstants.CLASS_NAME, instance.getOid(), PersonaConstants.ROLE_NAME_SOLICITUDESTITULAR + "." + SolicitudConstants.ROLE_NAME_TITULAR);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator069, Method: assocOperator069Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator071
	@Override
    public Collection<Direccion> assocOperator071(Persona instance) throws SystemException {
        try {
            // FOR ALL Direcciones WHERE (Direcciones.TipoDireccion.EsResidencia = true) DO Direcciones.TMODIFICAR(Direcciones, ptpDireccionCompleta, ptpRural, ptpevcDepartamento, ptpevcMunicipio, ptpagrPais, Direcciones.TipoDireccion)
        return assocOperator071Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator071, Method: assocOperator071";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator071
	@Override
    public Collection<Direccion> assocOperator071Range1 (Persona instance) throws SystemException {

        SQLSelect sql = assocOperator071Range1Query(instance);
        return new TypedQueryBuilder<Direccion>(em, Direccion.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator071
	@Override
    public SQLPopulation assocOperator071Range1Query (Persona instance) throws SystemException {
        try {
            SQLPopulation sql = new SQLPopulation(PersonaConstants.CLASS_NAME, DireccionConstants.CLASS_NAME, instance.getOid(), PersonaConstants.ROLE_NAME_DIRECCIONES);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Direcciones.TipoDireccion.EsResidencia = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(PersonaConstants.ROLE_NAME_DIRECCIONES + "." + DireccionConstants.ROLE_NAME_TIPODIRECCION + "." + TipoDireccionConstants.ATTR_NAME_TIPODIRECCIONESRESIDENCIA, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator071, Method: assocOperator071Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator073
	@Override
    public Collection<Direccion> assocOperator073(Persona instance) throws SystemException {
        try {
            // FOR ALL Direcciones WHERE (Direcciones.TipoDireccion.EsCorrespondencia = true) DO Direcciones.TMODIFICAR(Direcciones, pDCDireccionCompleta, pDCRural, pDCDepartamento, pDCMunicipio, ptpagrPais, Direcciones.TipoDireccion)
        return assocOperator073Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator073, Method: assocOperator073";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator073
	@Override
    public Collection<Direccion> assocOperator073Range1 (Persona instance) throws SystemException {

        SQLSelect sql = assocOperator073Range1Query(instance);
        return new TypedQueryBuilder<Direccion>(em, Direccion.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator073
	@Override
    public SQLPopulation assocOperator073Range1Query (Persona instance) throws SystemException {
        try {
            SQLPopulation sql = new SQLPopulation(PersonaConstants.CLASS_NAME, DireccionConstants.CLASS_NAME, instance.getOid(), PersonaConstants.ROLE_NAME_DIRECCIONES);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Direcciones.TipoDireccion.EsCorrespondencia = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(PersonaConstants.ROLE_NAME_DIRECCIONES + "." + DireccionConstants.ROLE_NAME_TIPODIRECCION + "." + TipoDireccionConstants.ATTR_NAME_TIPODIRECCIONESCORRESPONDENCIA, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator073, Method: assocOperator073Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator074
	@Override
    public Boolean assocOperator074(Persona instance) throws SystemException {
        try {
            // EXIST (Direcciones) WHERE (Direcciones.TipoDireccion.EsResidencia = true)
            return assocOperator074Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator074, Method: assocOperator074";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator074
	@Override
    public Boolean assocOperator074Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator074Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator074
	@Override
    public SQLExists assocOperator074Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_DIRECCIONES, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Direcciones.TipoDireccion.EsResidencia = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(PersonaConstants.ROLE_NAME_DIRECCIONES + "." + DireccionConstants.ROLE_NAME_TIPODIRECCION + "." + TipoDireccionConstants.ATTR_NAME_TIPODIRECCIONESRESIDENCIA, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator074, Method: assocOperator074Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator075
	@Override
    public Boolean assocOperator075(Persona instance) throws SystemException {
        try {
            // EXIST (Direcciones) WHERE (Direcciones.TipoDireccion.EsCorrespondencia = true)
            return assocOperator075Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator075, Method: assocOperator075";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator075
	@Override
    public Boolean assocOperator075Range1 (Persona instance) throws SystemException {
        SQLExists sql = assocOperator075Range1Query(instance);
        return !new TypedQueryBuilder<Persona>(em, Persona.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator075
	@Override
    public SQLExists assocOperator075Range1Query (Persona instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(PersonaConstants.CLASS_NAME, PersonaConstants.ROLE_NAME_DIRECCIONES, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Direcciones.TipoDireccion.EsCorrespondencia = true
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(PersonaConstants.ROLE_NAME_DIRECCIONES + "." + DireccionConstants.ROLE_NAME_TIPODIRECCION + "." + TipoDireccionConstants.ATTR_NAME_TIPODIRECCIONESCORRESPONDENCIA, Constants.Type.BOOL.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Persona, Assoc.Operator: AssocOperator075, Method: assocOperator075Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    @Override
    public void refreshEntity(Object object) {
        super.refreshEntity(object);
    }
}
