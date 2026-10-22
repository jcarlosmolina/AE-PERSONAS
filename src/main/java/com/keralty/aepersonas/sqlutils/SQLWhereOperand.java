package com.keralty.aepersonas.sqlutils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.persistence.oid.IOid;

/**
 *
 * Provides the functionality to set up an operand in a WHERE clause.
 *
 */
public class SQLWhereOperand {

    /** Operand data type. */
    private String type;

    /** SQL sentence. */
    private SQLSelect sql;

    /** SQL sentence text part for this operand. */
    private String operandText;

    /** This operand must be compare with Null. */
    private Boolean compareWithNull;

    /** Comparator to be used comparing with Null. */
    private String comparatorForNull;

    /** This operand is the right side of a 'Like' comparison. */
    private Boolean processForLike;

    /** This operand is the right side of a 'Contains' comparison. */
    private Boolean processForContains;

    /** Operand list. */
    private List<SQLParam> parameters;

    /**
     * SQL Sentence.
     * 
     * @return SQL Sentence.
     */
    public SQLSelect getSql() {
        return sql;
    }

    /**
     * Sets the SQL Sentence.
     * 
     * @param sql SQL Sentence.
     */
    public void setSql(SQLSelect sql) {
        this.sql = sql;
    }

    /**
     * This operand is the right side of a 'Like' comparison..
     * 
     * @return The right side of a 'Like' comparison.
     */
    public Boolean getProcessForLike() {
        return processForLike;
    }

    /**
     * Sets The right side of a 'Like' comparison.
     * 
     * @param processForLike The right side of a 'Like' comparison.
     */
    public void setProcessForLike(Boolean processForLike) {
        this.processForLike = processForLike;
    }

    /**
     * Sets The right side of a 'Contains' comparison.
     * 
     * @param processForContains The right side of a 'Contains' comparison.
     */
    public void setProcessForContains(Boolean processForContains) {
        this.processForContains = processForContains;
    }

    /**
     * This operand is the right side of a 'Contains' comparison..
     * 
     * @return The right side of a 'Contains' comparison.
     */
    public Boolean getProcessForContains() {
        return processForContains;
    }

    /**
     * This operand must be compare with Null
     * 
     * @return This operand must be compare with Null.
     */
    public Boolean getCompareWithNull() {
        return compareWithNull;
    }

    /**
     * Sets This operand must be compare with Null
     * 
     * @param compareWithNull This operand must be compare with Null
     */
    public void setCompareWithNull(Boolean compareWithNull) {
        this.compareWithNull = compareWithNull;
    }

    /**
     * Comparator to be used comparing with Null.
     * 
     * @return Comparator to be used comparing with Null.
     */
    public String getComparatorForNull() {
        return comparatorForNull;
    }

    /**
     * Sets Comparator to be used comparing with Null.
     * 
     * @param comparatorForNull Comparator to be used comparing with Null.
     */
    public void setComparatorForNull(String comparatorForNull) {
        this.comparatorForNull = comparatorForNull;
    }

    /**
     * Constructor. Receives the data type of the operand.
     * 
     * @param dataType Operand data type
     */
    public SQLWhereOperand(String dataType) {
        setType(dataType);
        compareWithNull = false;
        comparatorForNull = "";
        operandText = "";
        parameters = new ArrayList<>();
        processForLike = false;
        processForContains = false;
    }

    /**
     * Empty Constructor.
     */
    public SQLWhereOperand() {
        compareWithNull = false;
        comparatorForNull = "";
        operandText = "";
        parameters = new ArrayList<>();
        processForLike = false;
        processForContains = false;
    }

    /**
     * Data type of this operand.
     * 
     * @return {@link String} Data type of this operand.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the data type of this operand.
     * 
     * @param type Data type of this operand.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Processes operand.
     * 
     * @param sql SQLSelect sentence
     */
    public void processOperand(SQLSelect sql) {
        this.sql = sql;
    }

    /**
     * Returns the text of this operand.
     * 
     * @return {@link String} Text of this operand
     */
    public String getText() {
        return operandText;
    }

    /**
     * SQL Sentence text part for this operand.
     * 
     * @return SQL Sentence text part for this operand.
     */
    public String getOperandText() {
        return operandText;
    }

    /**
     * Sets the operand text.
     * 
     * @param operandText Operand text
     */
    public void setOperandText(String operandText) {
        this.operandText = operandText;
    }

    /**
     * Add to the SQL object the necessary where and parameters in order to fix the
     * received instance.
     * 
     * @param alias SQLAlias of the instance to be fixed
     * @param oid   Instance OID value
     */
    public void fixInstance(SQLAlias alias, IOid oid) {
        Collection<String> oidFields = Constants.getOIDFields(alias.getFacet());
        SQLWhereConjunction conjunction = new SQLWhereConjunction();

        String parameterAlias = alias.getAlias();
        for (String field : oidFields) {
            String oidExpression = parameterAlias + "." + field;
            SQLWhereComparison comparison = new SQLWhereComparison(sql);
            comparison.setExplicitComparisonText(oidExpression + " = ?");
            conjunction.addComparison(comparison);
        }

        if (oid != null) {
            Object[] oidValues = oid.getValue();
            String[] oidDataTypes = oid.getDataTypes();
            for (int i = 0; i < oidValues.length; i++) {
                conjunction.addParameter(new SQLParam("", oidValues[i], oidDataTypes[i]));
            }
        } else {
            for (int i = 0; i < oidFields.size(); i++) {
                conjunction.addParameter(new SQLParam("", null, ""));
            }
        }
        sql.addConjunction(conjunction);
    }

    /**
     * Set the comparison of this operand with Null.
     * 
     * @param operator Operator to be used
     */
    public void setComparisonWithNull(String operator) {
        compareWithNull = true;
        comparatorForNull = operator;
    }

    /**
     * Gets parameters.
     * 
     * @return {@link List}<{@link SQLParam}>
     */
    public List<SQLParam> getParameters() {
        return parameters;
    }
    
    /**
     * Adds a new parameter
     * @param parameter Parameter to add
     */
    public void addParameter(SQLParam parameter) {
    	parameters.add(parameter);
    }

    /**
     * Clears the list of parameters
     */
    public void clearParameters() {
    	parameters.clear();
    }
    
    /**
     * Gather parameters.
     * 
     * @param parameterList Parameter list
     */
    public void gatherParameters(List<SQLParam> parameterList) {
        parameterList.addAll(getParameters());
    }

    /**
     * This operand is in the right side of the 'Like' comparison. Every operand
     * specific type will perform it own process
     */
    public void processForLikeOperator() {
        this.processForLike = true;
    }

    /**
     * This operand is in the right side of the Contains' comparison. Every operand
     * specific type will perform it own process
     */
    public void processForContainsOperator() {
        this.processForContains = true;
    }

}
