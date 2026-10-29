package com.keralty.aepersonas.sqlutils;

import java.util.List;

/**
 * Provides the functionality of a negation of a WHERE clause.
 *
 */
public class SQLWhereNegation extends SQLWhereOperand {

    /** Expression to be negate. */
    private SQLWhereOperand operand;

    /** SQL sentence. */
    private SQLSelect sql;

    /**
     * Creates a negation operand.
     * 
     * @param sql Expression to negate
     */
    public SQLWhereNegation(SQLSelect sql) {
        super("Bool");
        this.sql = sql;
    }

    /**
     * Adds operand.
     * 
     * @param operand SQLWhereOperand to be added
     */
    public void addOperand(SQLWhereOperand operand) {
        operand.processOperand(sql);
        this.operand = operand;
    }

    /**
     * Returns the text of this operand.
     * 
     * @return {@link String} Text of this operand
     */
    @Override
    public String getText() {
        return " NOT ( " + operand.getText() + " ) ";
    }

    /**
     * Gather parameters.
     * 
     * @param parameterList Parameter list
     */
    @Override
    public void gatherParameters(List<SQLParam> parameterList) {
        if (this.operand != null) {
            this.operand.gatherParameters(parameterList);
        }
    }

}
