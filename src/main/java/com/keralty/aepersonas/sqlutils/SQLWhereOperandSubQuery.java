package com.keralty.aepersonas.sqlutils;

import java.util.List;

/**
 * Provides the functionality to set up an operand that is a sub-query.
 */
public class SQLWhereOperandSubQuery extends SQLWhereOperand {

    /** Sub-query SQL sentence. */
    private SQLScalar subQuery;

    /**
     * Creates a new Sub-query of the WHERE clause.
     * 
     * @param subQuery Sub-query SQL sentences
     */
    public SQLWhereOperandSubQuery(SQLScalar subQuery) {
        super("");
        this.subQuery = subQuery;
    }

    /**
     * Set the operand text with the SQL sentence obtained from the sub query.
     * 
     * @param sql Sql object
     */
    @Override
    public void processOperand(SQLSelect sql) {
        super.processOperand(sql);
        subQuery.setSuperSelect(sql);
        setOperandText(" ( " + subQuery.getSQLSentence() + " ) ");
    }

    /**
     * Returns the text of this operand.
     * 
     * @return {@link String} Text of this operand
     */
    @Override
    public String getText() {
        return " ( " + subQuery.getSQLSentence() + " ) ";
    }

    /**
     * Gets parameters.
     * 
     * @return {@link List}<{@link SQLParam}>
     */
    @Override
    public List<SQLParam> getParameters() {
        return subQuery.getParameters();
    }
}
