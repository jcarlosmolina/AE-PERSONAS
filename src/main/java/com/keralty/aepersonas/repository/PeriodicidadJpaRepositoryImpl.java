package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.AesolicitudesConstants;
import com.keralty.aepersonas.global.DominioConstants;
import com.keralty.aepersonas.global.PeriodicidadConstants;
import com.keralty.aepersonas.global.PlanesConstants;
import com.keralty.aepersonas.global.ProductosConstants;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.global.SolicitudNovedadConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.persistence.Dominio;
import com.keralty.aepersonas.persistence.Periodicidad;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.SolicitudNovedad;
import com.keralty.aepersonas.sqlutils.SQLExists;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.SQLWhereComparison;
import com.keralty.aepersonas.sqlutils.SQLWhereConjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandNull;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandOVParameter;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandPathInstance;
import com.keralty.aepersonas.sqlutils.TypedQueryBuilder;
import com.keralty.aepersonas.utils.Agent;
import jakarta.inject.Inject;
import java.util.Collection;
import java.util.List;

public class PeriodicidadJpaRepositoryImpl extends AbstractRepository implements PeriodicidadJpaRepositoryCustom {

    @Inject
    public PeriodicidadJpaRepositoryImpl(Agent agent, UserFunctions userFunctionsSrv) {
        super(agent, userFunctionsSrv);
    }

    @Override
    public List<Periodicidad> executeQuery(String jpqlQuery) {
        return getQueryBuilder().build(jpqlQuery).execute();
    }
    
    @Override
    public List<Periodicidad> executeQuery(String jpqlQuery, List<SQLParam> params) {
        return getQueryBuilder().build(jpqlQuery).setParameters(params).execute();
    }
    
    public Collection<Periodicidad> executeQuery(SQLSelect select) {
        return getQueryBuilder().build(select).execute();
    }

    private TypedQueryBuilder<Periodicidad> getQueryBuilder() {
        return new TypedQueryBuilder<>(em, Periodicidad.class);
    }

    @Override	
    public List<Periodicidad> solveQuery(SQLSelect select) {
        return solveQuery(select, 0, 0);
    }

    @Override
    public List<Periodicidad> solveQuery(SQLSelect select, int pageSize, int pageNumber) {
        return getQueryBuilder().build(select, pageSize, pageNumber).execute();
    }

    // AssocOperator: AssocOperator001
	@Override
    public Boolean assocOperator001(Dominio dominioInsPeriodicidadDominiopthisDominio) throws SystemException {
        try {
            // EXIST (Dominios) WHERE (Dominios = pthisDominio)
            return assocOperator001Range1(dominioInsPeriodicidadDominiopthisDominio);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Periodicidad, Assoc.Operator: AssocOperator001, Method: assocOperator001";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 0 for AssocOperator AssocOperator001
	@Override
    public Boolean assocOperator001Range1 (Dominio dominioInsPeriodicidadDominiopthisDominio) throws SystemException {
        SQLExists sql = assocOperator001Range1Query(dominioInsPeriodicidadDominiopthisDominio, null);
        return !new TypedQueryBuilder<Periodicidad>(em, Periodicidad.class).build(sql).execute().isEmpty();
    }

    // Range Query 0 for AssocOperator AssocOperator001
	@Override
    public SQLExists assocOperator001Range1Query (Dominio dominioInsPeriodicidadDominiopthisDominio, SQLSelect superQuery) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(superQuery, PeriodicidadConstants.CLASS_NAME, PeriodicidadConstants.ROLE_NAME_DOMINIOS);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Dominios = pthisDominio
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(PeriodicidadConstants.ROLE_NAME_DOMINIOS, DominioConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(DominioConstants.ARG_NAME_INSPERIODICIDADDOMINIO_DOMINIOINSPERIODICIDADDOMINIOPTHISDOMINIO, DominioConstants.CLASS_NAME, DominioConstants.CLASS_NAME, dominioInsPeriodicidadDominiopthisDominio.getOid(), DominioConstants.ARG_NAME_INSPERIODICIDADDOMINIO_DOMINIOINSPERIODICIDADDOMINIOPTHISDOMINIO);
                    comparison1.setSecondOperand(operand223);
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Periodicidad, Assoc.Operator: AssocOperator001, Method: assocOperator001Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator002
	@Override
    public Boolean assocOperator002(Dominio dominioDelPeriodicidadDominiopthisDominio) throws SystemException {
        try {
            // EXIST (Dominios) WHERE (Dominios = pthisDominio)
            return assocOperator002Range1(dominioDelPeriodicidadDominiopthisDominio);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Periodicidad, Assoc.Operator: AssocOperator002, Method: assocOperator002";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 0 for AssocOperator AssocOperator002
	@Override
    public Boolean assocOperator002Range1 (Dominio dominioDelPeriodicidadDominiopthisDominio) throws SystemException {
        SQLExists sql = assocOperator002Range1Query(dominioDelPeriodicidadDominiopthisDominio, null);
        return !new TypedQueryBuilder<Periodicidad>(em, Periodicidad.class).build(sql).execute().isEmpty();
    }

    // Range Query 0 for AssocOperator AssocOperator002
	@Override
    public SQLExists assocOperator002Range1Query (Dominio dominioDelPeriodicidadDominiopthisDominio, SQLSelect superQuery) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(superQuery, PeriodicidadConstants.CLASS_NAME, PeriodicidadConstants.ROLE_NAME_DOMINIOS);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Dominios = pthisDominio
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(PeriodicidadConstants.ROLE_NAME_DOMINIOS, DominioConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(DominioConstants.ARG_NAME_DELPERIODICIDADDOMINIO_DOMINIODELPERIODICIDADDOMINIOPTHISDOMINIO, DominioConstants.CLASS_NAME, DominioConstants.CLASS_NAME, dominioDelPeriodicidadDominiopthisDominio.getOid(), DominioConstants.ARG_NAME_DELPERIODICIDADDOMINIO_DOMINIODELPERIODICIDADDOMINIOPTHISDOMINIO);
                    comparison1.setSecondOperand(operand223);
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Periodicidad, Assoc.Operator: AssocOperator002, Method: assocOperator002Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator003
	@Override
    public Boolean assocOperator003(Solicitud solicitudTMODIFICARINFOPAGOpthisSolicitud) throws SystemException {
        try {
            // EXIST (Dominios) WHERE (Dominios.ProductoT = pthisSolicitud.Aesolicitudes.ProductoT AND Dominios.PlanT = pthisSolicitud.Aesolicitudes.PlanT)
            return assocOperator003Range1(solicitudTMODIFICARINFOPAGOpthisSolicitud);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Periodicidad, Assoc.Operator: AssocOperator003, Method: assocOperator003";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 0 for AssocOperator AssocOperator003
	@Override
    public Boolean assocOperator003Range1 (Solicitud solicitudTMODIFICARINFOPAGOpthisSolicitud) throws SystemException {
        SQLExists sql = assocOperator003Range1Query(solicitudTMODIFICARINFOPAGOpthisSolicitud, null);
        return !new TypedQueryBuilder<Periodicidad>(em, Periodicidad.class).build(sql).execute().isEmpty();
    }

    // Range Query 0 for AssocOperator AssocOperator003
	@Override
    public SQLExists assocOperator003Range1Query (Solicitud solicitudTMODIFICARINFOPAGOpthisSolicitud, SQLSelect superQuery) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(superQuery, PeriodicidadConstants.CLASS_NAME, PeriodicidadConstants.ROLE_NAME_DOMINIOS);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Dominios.ProductoT = pthisSolicitud.Aesolicitudes.ProductoT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(PeriodicidadConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PRODUCTOT, ProductosConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudConstants.ARG_NAME_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPTHISSOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PRODUCTOT, SolicitudConstants.CLASS_NAME, ProductosConstants.CLASS_NAME, solicitudTMODIFICARINFOPAGOpthisSolicitud.getOid(), SolicitudConstants.ARG_NAME_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPTHISSOLICITUD);
                    comparison1.setSecondOperand(operand223);
                    conjunction.addOperand(comparison1);


            // Dominios.PlanT = pthisSolicitud.Aesolicitudes.PlanT
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand113 = new SQLWhereOperandPathInstance(PeriodicidadConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    if (solicitudTMODIFICARINFOPAGOpthisSolicitud.isNull() || solicitudTMODIFICARINFOPAGOpthisSolicitud.getAesolicitudes().getPlanT().isNull())
                    {
                    comparison2.setSecondOperand(new SQLWhereOperandNull());
                    }
                    else
                    {
                    SQLWhereOperandOVParameter operand224 = new SQLWhereOperandOVParameter(SolicitudConstants.ARG_NAME_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPTHISSOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ROLE_NAME_PLANT, SolicitudConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, solicitudTMODIFICARINFOPAGOpthisSolicitud.getOid(), SolicitudConstants.ARG_NAME_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPTHISSOLICITUD);
                    comparison2.setSecondOperand(operand224);
                    }
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Periodicidad, Assoc.Operator: AssocOperator003, Method: assocOperator003Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator004
	@Override
    public Boolean assocOperator004(SolicitudNovedad solicitudNovedadTCHGNUEVAPERIODICIDADpthisSolicitudNovedad) throws SystemException {
        try {
            // EXIST (Dominios) WHERE (Dominios.ProductoT = pthisSolicitudNovedad.PlanT.ProductoT AND Dominios.PlanT = pthisSolicitudNovedad.PlanT)
            return assocOperator004Range1(solicitudNovedadTCHGNUEVAPERIODICIDADpthisSolicitudNovedad);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Periodicidad, Assoc.Operator: AssocOperator004, Method: assocOperator004";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 0 for AssocOperator AssocOperator004
	@Override
    public Boolean assocOperator004Range1 (SolicitudNovedad solicitudNovedadTCHGNUEVAPERIODICIDADpthisSolicitudNovedad) throws SystemException {
        SQLExists sql = assocOperator004Range1Query(solicitudNovedadTCHGNUEVAPERIODICIDADpthisSolicitudNovedad, null);
        return !new TypedQueryBuilder<Periodicidad>(em, Periodicidad.class).build(sql).execute().isEmpty();
    }

    // Range Query 0 for AssocOperator AssocOperator004
	@Override
    public SQLExists assocOperator004Range1Query (SolicitudNovedad solicitudNovedadTCHGNUEVAPERIODICIDADpthisSolicitudNovedad, SQLSelect superQuery) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(superQuery, PeriodicidadConstants.CLASS_NAME, PeriodicidadConstants.ROLE_NAME_DOMINIOS);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Dominios.ProductoT = pthisSolicitudNovedad.PlanT.ProductoT
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(PeriodicidadConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PRODUCTOT, ProductosConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(SolicitudNovedadConstants.ARG_NAME_TCHGNUEVAPERIODICIDAD_SOLICITUDNOVEDADTCHGNUEVAPERIODICIDADPTHISSOLICITUDNOVEDAD + "." + SolicitudNovedadConstants.ROLE_NAME_PLANT + "." + PlanesConstants.ROLE_NAME_PRODUCTOT, SolicitudNovedadConstants.CLASS_NAME, ProductosConstants.CLASS_NAME, solicitudNovedadTCHGNUEVAPERIODICIDADpthisSolicitudNovedad.getOid(), SolicitudNovedadConstants.ARG_NAME_TCHGNUEVAPERIODICIDAD_SOLICITUDNOVEDADTCHGNUEVAPERIODICIDADPTHISSOLICITUDNOVEDAD);
                    comparison1.setSecondOperand(operand223);
                    conjunction.addOperand(comparison1);


            // Dominios.PlanT = pthisSolicitudNovedad.PlanT
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand113 = new SQLWhereOperandPathInstance(PeriodicidadConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand224 = new SQLWhereOperandOVParameter(SolicitudNovedadConstants.ARG_NAME_TCHGNUEVAPERIODICIDAD_SOLICITUDNOVEDADTCHGNUEVAPERIODICIDADPTHISSOLICITUDNOVEDAD + "." + SolicitudNovedadConstants.ROLE_NAME_PLANT, SolicitudNovedadConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, solicitudNovedadTCHGNUEVAPERIODICIDADpthisSolicitudNovedad.getOid(), SolicitudNovedadConstants.ARG_NAME_TCHGNUEVAPERIODICIDAD_SOLICITUDNOVEDADTCHGNUEVAPERIODICIDADPTHISSOLICITUDNOVEDAD);
                    comparison2.setSecondOperand(operand224);
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: Periodicidad, Assoc.Operator: AssocOperator004, Method: assocOperator004Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    @Override
    public void refreshEntity(Object object) {
        super.refreshEntity(object);
    }
}
