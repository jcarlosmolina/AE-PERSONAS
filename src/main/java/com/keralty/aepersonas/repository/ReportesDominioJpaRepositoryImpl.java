package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DominioConstants;
import com.keralty.aepersonas.global.PlantillaReporteConstants;
import com.keralty.aepersonas.global.ReportesDominioConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.persistence.ReportesDominio;
import com.keralty.aepersonas.sqlutils.SQLCount;
import com.keralty.aepersonas.sqlutils.SQLMin;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.SQLWhereComparison;
import com.keralty.aepersonas.sqlutils.SQLWhereConjunction;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandLiteral;
import com.keralty.aepersonas.sqlutils.SQLWhereOperandPathAttribute;
import com.keralty.aepersonas.sqlutils.TypedQueryBuilder;
import com.keralty.aepersonas.utils.Agent;
import jakarta.inject.Inject;
import java.sql.Date;
import java.util.Collection;
import java.util.List;

public class ReportesDominioJpaRepositoryImpl extends AbstractRepository implements ReportesDominioJpaRepositoryCustom {

    @Inject
    public ReportesDominioJpaRepositoryImpl(Agent agent, UserFunctions userFunctionsSrv) {
        super(agent, userFunctionsSrv);
    }

    @Override
    public List<ReportesDominio> executeQuery(String jpqlQuery) {
        return getQueryBuilder().build(jpqlQuery).execute();
    }
    
    @Override
    public List<ReportesDominio> executeQuery(String jpqlQuery, List<SQLParam> params) {
        return getQueryBuilder().build(jpqlQuery).setParameters(params).execute();
    }
    
    public Collection<ReportesDominio> executeQuery(SQLSelect select) {
        return getQueryBuilder().build(select).execute();
    }

    private TypedQueryBuilder<ReportesDominio> getQueryBuilder() {
        return new TypedQueryBuilder<>(em, ReportesDominio.class);
    }

    @Override	
    public List<ReportesDominio> solveQuery(SQLSelect select) {
        return solveQuery(select, 0, 0);
    }

    @Override
    public List<ReportesDominio> solveQuery(SQLSelect select, int pageSize, int pageNumber) {
        return getQueryBuilder().build(select, pageSize, pageNumber).execute();
    }

    // AssocOperator: AssocOperator000
	@Override
    public Long assocOperator000(ReportesDominio instance) throws SystemException {
        try {
            // COUNT (Dominio.ReportesDominio) WHERE (Dominio.ReportesDominio.PlantillaReporte.Tipo = PlantillaReporte.Tipo AND Dominio.ReportesDominio.PlantillaReporte.FechaVigencia > PlantillaReporte.FechaVigencia)
            return assocOperator000Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: ReportesDominio, Assoc.Operator: AssocOperator000, Method: assocOperator000";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator000
	@Override
    public Long assocOperator000Range1 (ReportesDominio instance) throws SystemException {
        SQLCount sql = assocOperator000Range1Query(instance);
        return Long.valueOf(solveCountQuery(sql));
    }

    // Range Query 1 for AssocOperator AssocOperator000
	@Override
    public SQLCount assocOperator000Range1Query (ReportesDominio instance) throws SystemException {
        try {
            // The path starts with a role
            SQLCount sql = new SQLCount(ReportesDominioConstants.CLASS_NAME, ReportesDominioConstants.ROLE_NAME_DOMINIO + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Dominio.ReportesDominio.PlantillaReporte.Tipo = PlantillaReporte.Tipo
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(ReportesDominioConstants.ROLE_NAME_DOMINIO + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_PLANTILLAREPORTE + "." + PlantillaReporteConstants.ATTR_NAME_PLANTILLAREPORTETIPO, Constants.Type.NAT.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(instance.getPlantillaReporte().getPlantillaReporteTipo(), Constants.Type.NAT.getTypeName()));
                    conjunction.addOperand(comparison1);


            // Dominio.ReportesDominio.PlantillaReporte.FechaVigencia > PlantillaReporte.FechaVigencia
                    // '>' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator(">");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(ReportesDominioConstants.ROLE_NAME_DOMINIO + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_PLANTILLAREPORTE + "." + PlantillaReporteConstants.ATTR_NAME_PLANTILLAREPORTEFECHAVIGENCIA, Constants.Type.DATE.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(instance.getPlantillaReporte().getPlantillaReporteFechaVigencia(), Constants.Type.DATE.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: ReportesDominio, Assoc.Operator: AssocOperator000, Method: assocOperator000Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator001
	@Override
    public Date assocOperator001(ReportesDominio instance) throws SystemException {
        try {
            // MIN (Dominio.ReportesDominio.PlantillaReporte.FechaVigencia) WHERE (Dominio.ReportesDominio.PlantillaReporte.Tipo = PlantillaReporte.Tipo AND Dominio.ReportesDominio.PlantillaReporte.FechaVigencia > PlantillaReporte.FechaVigencia)
            return assocOperator001Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: ReportesDominio, Assoc.Operator: AssocOperator001, Method: assocOperator001";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator001
	@Override
    public Date assocOperator001Range1 (ReportesDominio instance) throws SystemException {
        SQLMin sql = assocOperator001Range1Query(instance);
        java.util.Date tempResult = new TypedQueryBuilder<java.util.Date>(em, java.util.Date.class).build(sql).getSingleResult();
        return tempResult != null ? new Date(tempResult.getTime()) : null;
    }

    // Range Query 1 for AssocOperator AssocOperator001
	@Override
    public SQLMin assocOperator001Range1Query (ReportesDominio instance) throws SystemException {
        try {
            // The path starts with a role
            SQLMin sql = new SQLMin(ReportesDominioConstants.CLASS_NAME, ReportesDominioConstants.ROLE_NAME_DOMINIO + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_PLANTILLAREPORTE + "." + PlantillaReporteConstants.ATTR_NAME_PLANTILLAREPORTEFECHAVIGENCIA, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // Dominio.ReportesDominio.PlantillaReporte.Tipo = PlantillaReporte.Tipo
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(ReportesDominioConstants.ROLE_NAME_DOMINIO + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_PLANTILLAREPORTE + "." + PlantillaReporteConstants.ATTR_NAME_PLANTILLAREPORTETIPO, Constants.Type.NAT.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral(instance.getPlantillaReporte().getPlantillaReporteTipo(), Constants.Type.NAT.getTypeName()));
                    conjunction.addOperand(comparison1);


            // Dominio.ReportesDominio.PlantillaReporte.FechaVigencia > PlantillaReporte.FechaVigencia
                    // '>' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator(">");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(ReportesDominioConstants.ROLE_NAME_DOMINIO + "." + DominioConstants.ROLE_NAME_REPORTESDOMINIO + "." + ReportesDominioConstants.ROLE_NAME_PLANTILLAREPORTE + "." + PlantillaReporteConstants.ATTR_NAME_PLANTILLAREPORTEFECHAVIGENCIA, Constants.Type.DATE.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(instance.getPlantillaReporte().getPlantillaReporteFechaVigencia(), Constants.Type.DATE.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: ReportesDominio, Assoc.Operator: AssocOperator001, Method: assocOperator001Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    @Override
    public void refreshEntity(Object object) {
        super.refreshEntity(object);
    }
}
