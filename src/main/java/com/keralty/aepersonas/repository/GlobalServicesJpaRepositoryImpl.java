package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.GlobalServiceConstants;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.global.TipoIdentificacionConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import com.keralty.aepersonas.persistence.Usuario;
import com.keralty.aepersonas.sqlutils.SQLExists;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.SQLWhereComparison;
import com.keralty.aepersonas.sqlutils.SQLWhereConjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandLiteral;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandOVParameter;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandPathAttribute;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandPathInstance;
import com.keralty.aepersonas.sqlutils.TypedQueryBuilder;
import com.keralty.aepersonas.utils.Agent;
import jakarta.inject.Inject;
import java.util.Collection;
import org.springframework.stereotype.Service;

@Service
public class GlobalServicesJpaRepositoryImpl extends AbstractRepository implements GlobalServicesJpaRepository {

    @Inject
    public GlobalServicesJpaRepositoryImpl(Agent agent, UserFunctions userFunctionsSrv) {
        super(agent, userFunctionsSrv);
    }

    // AssocOperator: AssocOperator095
	@Override
    public Boolean assocOperator095(Solicitud tGADDUSUARIODECONTptpagrSolicitud, TipoIdentificacion tGADDUSUARIODECONTptpagrTipoIdentificacion, String tGADDUSUARIODECONTptpatrNumIdentificacion) throws SystemException {
        try {
            // EXIST (Usuario) WHERE (Usuario.Solicitud = ptpagrSolicitud AND Usuario.TipoIdentificacion = ptpagrTipoIdentificacion AND Usuario.NumIdentificacion = ptpatrNumIdentificacion)
            return assocOperator095Range1(tGADDUSUARIODECONTptpagrSolicitud, tGADDUSUARIODECONTptpagrTipoIdentificacion, tGADDUSUARIODECONTptpatrNumIdentificacion);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: GLOBAL, Assoc.Operator: AssocOperator095, Method: assocOperator095";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }



    public Boolean assocOperator095Range1 (Solicitud tGADDUSUARIODECONTptpagrSolicitud, TipoIdentificacion tGADDUSUARIODECONTptpagrTipoIdentificacion, String tGADDUSUARIODECONTptpatrNumIdentificacion) throws SystemException {
        SQLExists sql = assocOperator095Range1Query(tGADDUSUARIODECONTptpagrSolicitud, tGADDUSUARIODECONTptpagrTipoIdentificacion, tGADDUSUARIODECONTptpatrNumIdentificacion, null);
        return !new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute().isEmpty();
    }


    public SQLExists assocOperator095Range1Query (Solicitud tGADDUSUARIODECONTptpagrSolicitud, TipoIdentificacion tGADDUSUARIODECONTptpagrTipoIdentificacion, String tGADDUSUARIODECONTptpatrNumIdentificacion, SQLSelect superQuery) throws SystemException {
        try {
            SQLExists sql;
            // The path starts with an object
            if (superQuery != null) {
                sql = new SQLExists(superQuery, "", UsuarioConstants.CLASS_NAME, UsuarioConstants.CLASS_NAME, null, UsuarioConstants.CLASS_NAME);
            } else {
                sql = new SQLExists("", UsuarioConstants.CLASS_NAME, UsuarioConstants.CLASS_NAME, null, UsuarioConstants.CLASS_NAME);
            }
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Usuario.Solicitud = ptpagrSolicitud
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(UsuarioConstants.CLASS_NAME + "." + SolicitudConstants.CLASS_NAME, SolicitudConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(GlobalServiceConstants.GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPAGRSOLICITUD, SolicitudConstants.CLASS_NAME, SolicitudConstants.CLASS_NAME, tGADDUSUARIODECONTptpagrSolicitud.getOid(), GlobalServiceConstants.GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPAGRSOLICITUD);
                    comparison1.setSecondOperand(operand223);
                    conjunction.addOperand(comparison1);


            // Usuario.TipoIdentificacion = ptpagrTipoIdentificacion
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand113 = new SQLWhereOperandPathInstance(UsuarioConstants.CLASS_NAME + "." + TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME);
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand224 = new SQLWhereOperandOVParameter(GlobalServiceConstants.GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPAGRTIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_NAME, TipoIdentificacionConstants.CLASS_NAME, tGADDUSUARIODECONTptpagrTipoIdentificacion.getOid(), GlobalServiceConstants.GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPAGRTIPOIDENTIFICACION);
                    comparison2.setSecondOperand(operand224);
                    conjunction.addOperand(comparison2);


            // Usuario.NumIdentificacion = ptpatrNumIdentificacion
                    // '=' Comparison
                    SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
                    comparison3.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand114 = new SQLWhereOperandPathAttribute(UsuarioConstants.CLASS_NAME + "." + UsuarioConstants.ATTR_NAME_USUARIONUMIDENTIFICACION, Constants.Type.STRING.getTypeName());
                    comparison3.setFirstOperand(operand114);
                    
                    // Operand 2
                    comparison3.setSecondOperand(new SQLWhereOperandLiteral(tGADDUSUARIODECONTptpatrNumIdentificacion, Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison3);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Assoc.Operator: AssocOperator095, Method: assocOperator095Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    @Override
    public void refreshEntity(Object object) {
        super.refreshEntity(object);
    }
}
