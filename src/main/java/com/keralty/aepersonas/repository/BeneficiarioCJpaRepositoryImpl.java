package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.BeneficiarioCConstants;
import com.keralty.aepersonas.global.ConceptoCConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.ContratoCConstants;
import com.keralty.aepersonas.global.DominioConstants;
import com.keralty.aepersonas.global.PersonaCConstants;
import com.keralty.aepersonas.global.PlanesConstants;
import com.keralty.aepersonas.global.ProductosConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.persistence.BeneficiarioC;
import com.keralty.aepersonas.sqlutils.SQLExists;
import com.keralty.aepersonas.sqlutils.SQLMax;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.SQLSum;
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
import java.util.List;
import org.slf4j.LoggerFactory;

public class BeneficiarioCJpaRepositoryImpl extends AbstractRepository implements BeneficiarioCJpaRepositoryCustom {

    @Inject
    public BeneficiarioCJpaRepositoryImpl(Agent agent, UserFunctions userFunctionsSrv) {
        super(agent, userFunctionsSrv);
    }

    @Override
    public List<BeneficiarioC> executeQuery(String jpqlQuery) {
        return getQueryBuilder().build(jpqlQuery).execute();
    }
    
    @Override
    public List<BeneficiarioC> executeQuery(String jpqlQuery, List<SQLParam> params) {
        return getQueryBuilder().build(jpqlQuery).setParameters(params).execute();
    }
    
    public Collection<BeneficiarioC> executeQuery(SQLSelect select) {
        return getQueryBuilder().build(select).execute();
    }

    private TypedQueryBuilder<BeneficiarioC> getQueryBuilder() {
        return new TypedQueryBuilder<>(em, BeneficiarioC.class);
    }

    @Override	
    public List<BeneficiarioC> solveQuery(SQLSelect select) {
        return solveQuery(select, 0, 0);
    }

    @Override
    public List<BeneficiarioC> solveQuery(SQLSelect select, int pageSize, int pageNumber) {
        return getQueryBuilder().build(select, pageSize, pageNumber).execute();
    }

    @Override
    public Long nextBeneficiarioCID(Long contratoCContratoCID) {
        try {
            SQLMax sql = new SQLMax(null, BeneficiarioCConstants.CLASS_NAME, BeneficiarioCConstants.CLASS_NAME + "." + BeneficiarioCConstants.ATTR_FIELD_BENEFICIARIOCID);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(BeneficiarioCConstants.ROLE_NAME_CONTRATOC + "." + ContratoCConstants.ATTR_FIELD_CONTRATOCID, "Autonumerico"));
            comparison1.setOperator("=");
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(contratoCContratoCID, "Autonumerico"));
            conjunction.addComparison(comparison1);

            sql.getWherePart().addConjunction(conjunction);

            Long tempResult = new TypedQueryBuilder<>(em, Long.class).build(sql).getSingleResult();
            return (tempResult != null ? tempResult + 1L : 1L);
        } catch (Exception e) {
            LoggerFactory.getLogger(BeneficiarioC.class).error(e.getMessage());
            return 1L;
        }
    }

    // AssocOperator: AssocOperator000
	@Override
    public Double assocOperator000(BeneficiarioC instance) throws SystemException {
        try {
            // SUM (ConceptosC.valorConcepto) WHERE (ConceptosC.nombreConcepto LIKE "%VALOR%BRUTO%")
            return assocOperator000Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: BeneficiarioC, Assoc.Operator: AssocOperator000, Method: assocOperator000";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator000
	@Override
    public Double assocOperator000Range1 (BeneficiarioC instance) throws SystemException {
        SQLSum sql = assocOperator000Range1Query(instance);
        return new TypedQueryBuilder<Double>(em, Double.class).build(sql).getSingleResult();
    }

    // Range Query 1 for AssocOperator AssocOperator000
	@Override
    public SQLSum assocOperator000Range1Query (BeneficiarioC instance) throws SystemException {
        try {
            // The path starts with a role
            SQLSum sql = new SQLSum(BeneficiarioCConstants.CLASS_NAME, BeneficiarioCConstants.ROLE_NAME_CONCEPTOSC + "." + ConceptoCConstants.ATTR_NAME_CONCEPTOCVALORCONCEPTO, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // ConceptosC.nombreConcepto LIKE "%VALOR%BRUTO%"
                    // 'like' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("like");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(BeneficiarioCConstants.ROLE_NAME_CONCEPTOSC + "." + ConceptoCConstants.ATTR_NAME_CONCEPTOCNOMBRECONCEPTO, Constants.Type.STRING.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral("%VALOR%BRUTO%", Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: BeneficiarioC, Assoc.Operator: AssocOperator000, Method: assocOperator000Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator001
	@Override
    public Double assocOperator001(BeneficiarioC instance) throws SystemException {
        try {
            // SUM (ConceptosC.valorConcepto) WHERE (ConceptosC.nombreConcepto LIKE "%VALOR%BRUTO%")
            return assocOperator001Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: BeneficiarioC, Assoc.Operator: AssocOperator001, Method: assocOperator001";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator001
	@Override
    public Double assocOperator001Range1 (BeneficiarioC instance) throws SystemException {
        SQLSum sql = assocOperator001Range1Query(instance);
        return new TypedQueryBuilder<Double>(em, Double.class).build(sql).getSingleResult();
    }

    // Range Query 1 for AssocOperator AssocOperator001
	@Override
    public SQLSum assocOperator001Range1Query (BeneficiarioC instance) throws SystemException {
        try {
            // The path starts with a role
            SQLSum sql = new SQLSum(BeneficiarioCConstants.CLASS_NAME, BeneficiarioCConstants.ROLE_NAME_CONCEPTOSC + "." + ConceptoCConstants.ATTR_NAME_CONCEPTOCVALORCONCEPTO, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // ConceptosC.nombreConcepto LIKE "%VALOR%BRUTO%"
                    // 'like' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("like");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(BeneficiarioCConstants.ROLE_NAME_CONCEPTOSC + "." + ConceptoCConstants.ATTR_NAME_CONCEPTOCNOMBRECONCEPTO, Constants.Type.STRING.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral("%VALOR%BRUTO%", Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: BeneficiarioC, Assoc.Operator: AssocOperator001, Method: assocOperator001Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator002
	@Override
    public Double assocOperator002(BeneficiarioC instance) throws SystemException {
        try {
            // SUM (ConceptosC.valorConcepto) WHERE (ConceptosC.nombreConcepto LIKE "%VALOR%BRUTO%")
            return assocOperator002Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: BeneficiarioC, Assoc.Operator: AssocOperator002, Method: assocOperator002";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator002
	@Override
    public Double assocOperator002Range1 (BeneficiarioC instance) throws SystemException {
        SQLSum sql = assocOperator002Range1Query(instance);
        return new TypedQueryBuilder<Double>(em, Double.class).build(sql).getSingleResult();
    }

    // Range Query 1 for AssocOperator AssocOperator002
	@Override
    public SQLSum assocOperator002Range1Query (BeneficiarioC instance) throws SystemException {
        try {
            // The path starts with a role
            SQLSum sql = new SQLSum(BeneficiarioCConstants.CLASS_NAME, BeneficiarioCConstants.ROLE_NAME_CONCEPTOSC + "." + ConceptoCConstants.ATTR_NAME_CONCEPTOCVALORCONCEPTO, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // ConceptosC.nombreConcepto LIKE "%VALOR%BRUTO%"
                    // 'like' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("like");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(BeneficiarioCConstants.ROLE_NAME_CONCEPTOSC + "." + ConceptoCConstants.ATTR_NAME_CONCEPTOCNOMBRECONCEPTO, Constants.Type.STRING.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral("%VALOR%BRUTO%", Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: BeneficiarioC, Assoc.Operator: AssocOperator002, Method: assocOperator002Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator003
	@Override
    public Double assocOperator003(BeneficiarioC instance) throws SystemException {
        try {
            // SUM (ConceptosC.valorConcepto) WHERE (ConceptosC.nombreConcepto LIKE "%DESC%BEN%")
            return assocOperator003Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: BeneficiarioC, Assoc.Operator: AssocOperator003, Method: assocOperator003";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator003
	@Override
    public Double assocOperator003Range1 (BeneficiarioC instance) throws SystemException {
        SQLSum sql = assocOperator003Range1Query(instance);
        return new TypedQueryBuilder<Double>(em, Double.class).build(sql).getSingleResult();
    }

    // Range Query 1 for AssocOperator AssocOperator003
	@Override
    public SQLSum assocOperator003Range1Query (BeneficiarioC instance) throws SystemException {
        try {
            // The path starts with a role
            SQLSum sql = new SQLSum(BeneficiarioCConstants.CLASS_NAME, BeneficiarioCConstants.ROLE_NAME_CONCEPTOSC + "." + ConceptoCConstants.ATTR_NAME_CONCEPTOCVALORCONCEPTO, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // ConceptosC.nombreConcepto LIKE "%DESC%BEN%"
                    // 'like' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("like");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(BeneficiarioCConstants.ROLE_NAME_CONCEPTOSC + "." + ConceptoCConstants.ATTR_NAME_CONCEPTOCNOMBRECONCEPTO, Constants.Type.STRING.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral("%DESC%BEN%", Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: BeneficiarioC, Assoc.Operator: AssocOperator003, Method: assocOperator003Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator004
	@Override
    public Double assocOperator004(BeneficiarioC instance) throws SystemException {
        try {
            // SUM (ConceptosC.valorConcepto) WHERE (ConceptosC.nombreConcepto LIKE "%DESC%FAM%")
            return assocOperator004Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: BeneficiarioC, Assoc.Operator: AssocOperator004, Method: assocOperator004";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator004
	@Override
    public Double assocOperator004Range1 (BeneficiarioC instance) throws SystemException {
        SQLSum sql = assocOperator004Range1Query(instance);
        return new TypedQueryBuilder<Double>(em, Double.class).build(sql).getSingleResult();
    }

    // Range Query 1 for AssocOperator AssocOperator004
	@Override
    public SQLSum assocOperator004Range1Query (BeneficiarioC instance) throws SystemException {
        try {
            // The path starts with a role
            SQLSum sql = new SQLSum(BeneficiarioCConstants.CLASS_NAME, BeneficiarioCConstants.ROLE_NAME_CONCEPTOSC + "." + ConceptoCConstants.ATTR_NAME_CONCEPTOCVALORCONCEPTO, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // ConceptosC.nombreConcepto LIKE "%DESC%FAM%"
                    // 'like' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("like");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(BeneficiarioCConstants.ROLE_NAME_CONCEPTOSC + "." + ConceptoCConstants.ATTR_NAME_CONCEPTOCNOMBRECONCEPTO, Constants.Type.STRING.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral("%DESC%FAM%", Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: BeneficiarioC, Assoc.Operator: AssocOperator004, Method: assocOperator004Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator005
	@Override
    public Double assocOperator005(BeneficiarioC instance) throws SystemException {
        try {
            // SUM (ConceptosC.valorConcepto) WHERE (ConceptosC.nombreConcepto LIKE "%DESC%CON%")
            return assocOperator005Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: BeneficiarioC, Assoc.Operator: AssocOperator005, Method: assocOperator005";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator005
	@Override
    public Double assocOperator005Range1 (BeneficiarioC instance) throws SystemException {
        SQLSum sql = assocOperator005Range1Query(instance);
        return new TypedQueryBuilder<Double>(em, Double.class).build(sql).getSingleResult();
    }

    // Range Query 1 for AssocOperator AssocOperator005
	@Override
    public SQLSum assocOperator005Range1Query (BeneficiarioC instance) throws SystemException {
        try {
            // The path starts with a role
            SQLSum sql = new SQLSum(BeneficiarioCConstants.CLASS_NAME, BeneficiarioCConstants.ROLE_NAME_CONCEPTOSC + "." + ConceptoCConstants.ATTR_NAME_CONCEPTOCVALORCONCEPTO, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // ConceptosC.nombreConcepto LIKE "%DESC%CON%"
                    // 'like' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("like");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(BeneficiarioCConstants.ROLE_NAME_CONCEPTOSC + "." + ConceptoCConstants.ATTR_NAME_CONCEPTOCNOMBRECONCEPTO, Constants.Type.STRING.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral("%DESC%CON%", Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: BeneficiarioC, Assoc.Operator: AssocOperator005, Method: assocOperator005Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator006
	@Override
    public Double assocOperator006(BeneficiarioC instance) throws SystemException {
        try {
            // SUM (ConceptosC.valorConcepto) WHERE (ConceptosC.nombreConcepto LIKE "%DESC%FINANCIERO%")
            return assocOperator006Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: BeneficiarioC, Assoc.Operator: AssocOperator006, Method: assocOperator006";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator006
	@Override
    public Double assocOperator006Range1 (BeneficiarioC instance) throws SystemException {
        SQLSum sql = assocOperator006Range1Query(instance);
        return new TypedQueryBuilder<Double>(em, Double.class).build(sql).getSingleResult();
    }

    // Range Query 1 for AssocOperator AssocOperator006
	@Override
    public SQLSum assocOperator006Range1Query (BeneficiarioC instance) throws SystemException {
        try {
            // The path starts with a role
            SQLSum sql = new SQLSum(BeneficiarioCConstants.CLASS_NAME, BeneficiarioCConstants.ROLE_NAME_CONCEPTOSC + "." + ConceptoCConstants.ATTR_NAME_CONCEPTOCVALORCONCEPTO, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // ConceptosC.nombreConcepto LIKE "%DESC%FINANCIERO%"
                    // 'like' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("like");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(BeneficiarioCConstants.ROLE_NAME_CONCEPTOSC + "." + ConceptoCConstants.ATTR_NAME_CONCEPTOCNOMBRECONCEPTO, Constants.Type.STRING.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral("%DESC%FINANCIERO%", Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: BeneficiarioC, Assoc.Operator: AssocOperator006, Method: assocOperator006Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator007
	@Override
    public Double assocOperator007(BeneficiarioC instance) throws SystemException {
        try {
            // SUM (ConceptosC.valorConcepto) WHERE (ConceptosC.nombreConcepto LIKE "%VALOR%BRUTO%")
            return assocOperator007Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: BeneficiarioC, Assoc.Operator: AssocOperator007, Method: assocOperator007";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator007
	@Override
    public Double assocOperator007Range1 (BeneficiarioC instance) throws SystemException {
        SQLSum sql = assocOperator007Range1Query(instance);
        return new TypedQueryBuilder<Double>(em, Double.class).build(sql).getSingleResult();
    }

    // Range Query 1 for AssocOperator AssocOperator007
	@Override
    public SQLSum assocOperator007Range1Query (BeneficiarioC instance) throws SystemException {
        try {
            // The path starts with a role
            SQLSum sql = new SQLSum(BeneficiarioCConstants.CLASS_NAME, BeneficiarioCConstants.ROLE_NAME_CONCEPTOSC + "." + ConceptoCConstants.ATTR_NAME_CONCEPTOCVALORCONCEPTO, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // ConceptosC.nombreConcepto LIKE "%VALOR%BRUTO%"
                    // 'like' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("like");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand112 = new SQLWhereOperandPathAttribute(BeneficiarioCConstants.ROLE_NAME_CONCEPTOSC + "." + ConceptoCConstants.ATTR_NAME_CONCEPTOCNOMBRECONCEPTO, Constants.Type.STRING.getTypeName());
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    comparison1.setSecondOperand(new SQLWhereOperandLiteral("%VALOR%BRUTO%", Constants.Type.STRING.getTypeName()));
                    conjunction.addOperand(comparison1);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: BeneficiarioC, Assoc.Operator: AssocOperator007, Method: assocOperator007Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator008
	@Override
    public Boolean assocOperator008(BeneficiarioC instance) throws SystemException {
        try {
            // EXIST (ContratoC.ProductoC.Dominios) WHERE (ContratoC.ProductoC.Dominios.PlanT = ContratoC.PlanC AND ContratoC.ProductoC.Dominios.IgnorarPreexistencias = true)
            return assocOperator008Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: BeneficiarioC, Assoc.Operator: AssocOperator008, Method: assocOperator008";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator008
	@Override
    public Boolean assocOperator008Range1 (BeneficiarioC instance) throws SystemException {
        SQLExists sql = assocOperator008Range1Query(instance);
        return !new TypedQueryBuilder<BeneficiarioC>(em, BeneficiarioC.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator008
	@Override
    public SQLExists assocOperator008Range1Query (BeneficiarioC instance) throws SystemException {
        try {
            // The path starts with a role
            SQLExists sql = new SQLExists(BeneficiarioCConstants.CLASS_NAME, BeneficiarioCConstants.ROLE_NAME_CONTRATOC + "." + ContratoCConstants.ROLE_NAME_PRODUCTOC + "." + ProductosConstants.ROLE_NAME_DOMINIOS, instance.getOid());
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            // ContratoC.ProductoC.Dominios.PlanT = ContratoC.PlanC
                    // '=' Comparison
                    SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
                    comparison1.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathInstance operand112 = new SQLWhereOperandPathInstance(BeneficiarioCConstants.ROLE_NAME_CONTRATOC + "." + ContratoCConstants.ROLE_NAME_PRODUCTOC + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ROLE_NAME_PLANT, PlanesConstants.CLASS_NAME);
                    comparison1.setFirstOperand(operand112);
                    
                    // Operand 2
                    SQLWhereOperandOVParameter operand223 = new SQLWhereOperandOVParameter(BeneficiarioCConstants.ROLE_NAME_CONTRATOC + "." + ContratoCConstants.ROLE_NAME_PLANC, PlanesConstants.CLASS_NAME, PlanesConstants.CLASS_NAME, instance.getContratoC().getPlanC().getOid(), BeneficiarioCConstants.ROLE_NAME_CONTRATOC + "." + ContratoCConstants.ROLE_NAME_PLANC);
                    comparison1.setSecondOperand(operand223);
                    conjunction.addOperand(comparison1);


            // ContratoC.ProductoC.Dominios.IgnorarPreexistencias = true
                    // '=' Comparison
                    SQLWhereComparison comparison2 = new SQLWhereComparison(sql);
                    comparison2.setOperator("=");
                    
                    // Operand 1
                    SQLWhereOperandPathAttribute operand113 = new SQLWhereOperandPathAttribute(BeneficiarioCConstants.ROLE_NAME_CONTRATOC + "." + ContratoCConstants.ROLE_NAME_PRODUCTOC + "." + ProductosConstants.ROLE_NAME_DOMINIOS + "." + DominioConstants.ATTR_NAME_DOMINIOIGNORARPREEXISTENCIAS, Constants.Type.BOOL.getTypeName());
                    comparison2.setFirstOperand(operand113);
                    
                    // Operand 2
                    comparison2.setSecondOperand(new SQLWhereOperandLiteral(Boolean.TRUE, Constants.Type.BOOL.getTypeName()));
                    conjunction.addOperand(comparison2);

            sql.addOperand(conjunction);
            return sql;
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: BeneficiarioC, Assoc.Operator: AssocOperator008, Method: assocOperator008Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // AssocOperator: AssocOperator009
	@Override
    public Boolean assocOperator009(BeneficiarioC instance) throws SystemException {
        try {
            // EXIST (PersonaC.PreexistenciasC)
            return assocOperator009Range1(instance);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: BeneficiarioC, Assoc.Operator: AssocOperator009, Method: assocOperator009";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator009
	@Override
    public Boolean assocOperator009Range1 (BeneficiarioC instance) throws SystemException {
        SQLExists sql = assocOperator009Range1Query(instance);
        return !new TypedQueryBuilder<BeneficiarioC>(em, BeneficiarioC.class).build(sql).execute().isEmpty();
    }

    // Range Query 1 for AssocOperator AssocOperator009
	@Override
    public SQLExists assocOperator009Range1Query (BeneficiarioC instance) throws SystemException {
        try {
            // The path starts with a role
            return new SQLExists(BeneficiarioCConstants.CLASS_NAME, BeneficiarioCConstants.ROLE_NAME_PERSONAC + "." + PersonaCConstants.ROLE_NAME_PREEXISTENCIASC, instance.getOid());
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: BeneficiarioC, Assoc.Operator: AssocOperator009, Method: assocOperator009Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    @Override
    public void refreshEntity(Object object) {
        super.refreshEntity(object);
    }
}
