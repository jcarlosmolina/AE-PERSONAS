package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.AnexoNeoConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DetalleTarifaConstants;
import com.keralty.aepersonas.global.InstitucionMatNeoConstants;
import com.keralty.aepersonas.global.STDFunctions;
import com.keralty.aepersonas.global.TarifaConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.persistence.AnexoNeo;
import com.keralty.aepersonas.sqlutils.SQLGetOne;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.SQLWhereComparison;
import com.keralty.aepersonas.sqlutils.SQLWhereConjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandLiteral;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandNull;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandPathAttribute;
import com.keralty.aepersonas.sqlutils.TypedQueryBuilder;
import com.keralty.aepersonas.utils.Agent;
import jakarta.inject.Inject;
import java.util.Collection;
import java.util.List;

public class AnexoNeoJpaRepositoryImpl extends AbstractRepository implements AnexoNeoJpaRepositoryCustom {

    @Inject
    public AnexoNeoJpaRepositoryImpl(Agent agent, UserFunctions userFunctionsSrv) {
        super(agent, userFunctionsSrv);
    }

    @Override
    public List<AnexoNeo> executeQuery(String jpqlQuery) {
        return getQueryBuilder().build(jpqlQuery).execute();
    }
    
    @Override
    public List<AnexoNeo> executeQuery(String jpqlQuery, List<SQLParam> params) {
        return getQueryBuilder().build(jpqlQuery).setParameters(params).execute();
    }
    
    public Collection<AnexoNeo> executeQuery(SQLSelect select) {
        return getQueryBuilder().build(select).execute();
    }

    private TypedQueryBuilder<AnexoNeo> getQueryBuilder() {
        return new TypedQueryBuilder<>(em, AnexoNeo.class);
    }

    @Override	
    public List<AnexoNeo> solveQuery(SQLSelect select) {
        return solveQuery(select, 0, 0);
    }

    @Override
    public List<AnexoNeo> solveQuery(SQLSelect select, int pageSize, int pageNumber) {
        return getQueryBuilder().build(select, pageSize, pageNumber).execute();
    }

    // AssocOperator: AssocOperator000
	@Override
    public Double assocOperator000(AnexoNeo instance) throws SystemException {
        try {
            // GETONE (InstitucionNeonatal.Tarifa.DetallesTarifa.Valor) WHERE (InstitucionNeonatal.Tarifa.DetallesTarifa.Anyo = getYear(Usuario.Solicitud.FInicioContrato) AND InstitucionNeonatal.Tarifa.DetallesTarifa.LimInferiorEdad <= Usuario.drvEdad AND Usuario.drvEdad <= InstitucionNeonatal.Tarifa.DetallesTarifa.LimSuperiorEdad)
            return assocOperator000Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: AnexoNeo, Assoc.Operator: AssocOperator000, Method: assocOperator000";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator000
	@Override
    public Double assocOperator000Range1 (AnexoNeo instance) throws SystemException {
        SQLGetOne sql = assocOperator000Range1Query(instance);
        List<Double> results = new TypedQueryBuilder<Double>(em, Double.class).build(sql).execute();
        return !results.isEmpty() ? results.get(0) : null;
    }

    // Range Query 1 for AssocOperator AssocOperator000
	@Override
    public SQLGetOne assocOperator000Range1Query (AnexoNeo instance) throws SystemException {
        try {
            // The path starts with a role
            SQLGetOne sql = new SQLGetOne(AnexoNeoConstants.CLASS_NAME, AnexoNeoConstants.ROLE_NAME_INSTITUCIONNEONATAL + "." + InstitucionMatNeoConstants.ROLE_NAME_TARIFA + "." + TarifaConstants.ROLE_NAME_DETALLESTARIFA + "." + DetalleTarifaConstants.ATTR_NAME_DETALLETARIFAVALOR, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // InstitucionNeonatal.Tarifa.DetallesTarifa.Anyo = getYear(Usuario.Solicitud.FInicioContrato)
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(AnexoNeoConstants.ROLE_NAME_INSTITUCIONNEONATAL + "." + InstitucionMatNeoConstants.ROLE_NAME_TARIFA + "." + TarifaConstants.ROLE_NAME_DETALLESTARIFA + "." + DetalleTarifaConstants.ATTR_NAME_DETALLETARIFAANYO, Constants.Type.INT.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                            if (STDFunctions.getYearFun(instance.getUsuario().getSolicitud().getSolicitudFInicioContrato()) != null) {
                                comparison1.setSecondOperand(new SQLWhereOperandLiteral(STDFunctions.getYearFun(instance.getUsuario().getSolicitud().getSolicitudFInicioContrato()), Constants.Type.INT.getTypeName()));
                            } else {
                                comparison1.setSecondOperand(new SQLWhereOperandNull());
                                }
                    conjunction.addOperand(comparison1);


            // InstitucionNeonatal.Tarifa.DetallesTarifa.LimInferiorEdad <= Usuario.drvEdad
                    // '<=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("<=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(AnexoNeoConstants.ROLE_NAME_INSTITUCIONNEONATAL + "." + InstitucionMatNeoConstants.ROLE_NAME_TARIFA + "." + TarifaConstants.ROLE_NAME_DETALLESTARIFA + "." + DetalleTarifaConstants.ATTR_NAME_DETALLETARIFALIMINFERIOREDAD, Constants.Type.INT.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(instance.getUsuario().getUsuariodrvEdad(), Constants.Type.INT.getTypeName()));
                    conjunction.addOperand(comparison2);


            // Usuario.drvEdad <= InstitucionNeonatal.Tarifa.DetallesTarifa.LimSuperiorEdad
                    // '<=' Comparison
                    SQLWhereComparison comparison3 = new SQLWhereComparison(sql);
                    comparison3.setOperator("<=");
                    
                    // Operand 1
                    comparison3.setFirstOperand(new SQLWhereOperandLiteral(instance.getUsuario().getUsuariodrvEdad(), Constants.Type.INT.getTypeName()));
                    
                    // Operand 2
                    SQLWhereOperandPathAttribute operand225 = new SQLWhereOperandPathAttribute(AnexoNeoConstants.ROLE_NAME_INSTITUCIONNEONATAL + "." + InstitucionMatNeoConstants.ROLE_NAME_TARIFA + "." + TarifaConstants.ROLE_NAME_DETALLESTARIFA + "." + DetalleTarifaConstants.ATTR_NAME_DETALLETARIFALIMSUPERIOREDAD, Constants.Type.INT.getTypeName());
                    comparison3.setSecondOperand(operand225);
                    conjunction.addOperand(comparison3);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: AnexoNeo, Assoc.Operator: AssocOperator000, Method: assocOperator000Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    @Override
    public void refreshEntity(Object object) {
        super.refreshEntity(object);
    }
}
