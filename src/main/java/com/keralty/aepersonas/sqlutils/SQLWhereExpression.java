package com.keralty.aepersonas.sqlutils;

import java.util.List;

import com.keralty.aepersonas.exception.SystemException;

/** Expression in the WHERE clause of a SQL Sentence. */
public class SQLWhereExpression extends SQLWhereOperand {

    /** SQL sentence. */
    private SQLSelect sql;

    /** Operator. */
    private String operator;

    /** First operand. */
    private SQLWhereOperand firstOperand;

    /** Second operand. */
    private SQLWhereOperand secondOperand;

    /**
     * Default Constructor.
     * 
     * @param sql SQLSelect sentence
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public SQLWhereExpression(SQLSelect sql) throws SystemException {
        super("");
        this.sql = sql;
    }

    /**
     * Returns the text of this expression of the WHERE clause.
     * 
     * @return {@link String} Text of this expression of the WHERE clause
     */
    @Override
    public String getText() {
        String expressionText = "";
        if (operator.equalsIgnoreCase("div")) {
            expressionText += "CAST((" + firstOperand.getText();
            expressionText += " / ";
            expressionText += secondOperand.getText() + ") AS NUMBER(10))";
        } else if (operator.equalsIgnoreCase("+")
            && ((this.firstOperand.getType().equalsIgnoreCase("String")) || (this.firstOperand.getType().equalsIgnoreCase("Text")))
            && ((this.secondOperand.getType().equalsIgnoreCase("String")) || (this.secondOperand.getType().equalsIgnoreCase("Text")))) {
            expressionText += "(" + firstOperand.getText();
            expressionText += " || ";
            expressionText += secondOperand.getText() + ")";
        } else {
            expressionText += "(" + firstOperand.getText();
            expressionText += " " + operator + " ";
            expressionText += secondOperand.getText() + ")";
        }
        if (this.getProcessForLike()) {
            expressionText += " || '%'";
        }
        if (this.getProcessForContains()) {
            expressionText = "'%' || " + expressionText + " || '%'";
        }
        return expressionText;
    }

    /**
     * Gets the operator for this comparison.
     * 
     * @return {@link String} Comparison operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the operator for this comparison.
     * 
     * @param operator Comparison operator
     */
    public void setOperator(String operator) {
        if (operator.equalsIgnoreCase("mod")) {
            this.operator = "%";
        } else {
            this.operator = operator;
        }
    }

    /**
     * Gets the first operand for this comparison.
     * 
     * @return {@link SQLWhereOperand}
     */
    public SQLWhereOperand getFirstOperand() {
        return firstOperand;
    }

    /**
     * Sets the first operand for this comparison.
     * 
     * @param operand First operand
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public void setFirstOperand(SQLWhereOperand operand) throws SystemException {
        this.firstOperand = operand;
        if (firstOperand != null) {
            firstOperand.processOperand(sql);
        }
    }

    /**
     * Gets the second operand for this comparison.
     * 
     * @return {@link SQLWhereOperand}
     */
    public SQLWhereOperand getSecondOperand() {
        return secondOperand;
    }

    /**
     * Sets the second operand for this comparison.
     * 
     * @param operand Second operand
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public void setSecondOperand(SQLWhereOperand operand) throws SystemException {
        this.secondOperand = operand;
        if (secondOperand != null) {
            secondOperand.processOperand(sql);
        }
    }

    /**
     * Sets the second operand for this comparison.
     * 
     * @param parameterList Parameter list
     */
    @Override
    public void gatherParameters(List<SQLParam> parameterList) {
        if (firstOperand != null) {
            firstOperand.gatherParameters(parameterList);
        }
        if (secondOperand != null) {
            secondOperand.gatherParameters(parameterList);
        }
    }
}
