package com.keralty.aepersonas.sqlutils;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides the functionality of a conjunction of a WHERE clause. A conjunction
 * is a list of AND-separated disjunctions.
 *
 */
public class SQLWhereConjunction extends SQLWhereOperand {

    /** Operands list. */
    private List<SQLWhereOperand> elements;

    /**
     * Creates a new conjunction of elements in a WHERE clause.
     * 
     */
    public SQLWhereConjunction() {
        super("Bool");
        elements = new ArrayList<>();
    }

    /**
     * Adds comparison.
     * 
     * @param comparison SQLWhereComparison to be added
     */
    public void addComparison(SQLWhereComparison comparison) {
        elements.add(comparison);
    }

    /**
     * Adds conjunction.
     * 
     * @param conjunction SQLWhereDisjunction to be added
     */
    public void addDisjunction(SQLWhereDisjunction conjunction) {
        elements.add(conjunction);
    }

    /**
     * Adds operand.
     * 
     * @param operand SQLWhereOperand to be added
     */
    public void addOperand(SQLWhereOperand operand) {
        elements.add(operand);
    }

    /**
     * Text of this conjunction of elements of the WHERE clause.
     * 
     * @return {@link String} Text of this conjunction of elements of the WHERE
     *         clause
     */
    @Override
    public String getText() {
        StringBuilder conjunctionText = new StringBuilder("");
        String elementText = "";

        for (SQLWhereOperand element : elements) {
            elementText = element.getText();
            if (!elementText.isEmpty()) {
                if (!conjunctionText.toString().isEmpty()) {
                    conjunctionText.append(" AND ");
                }
                conjunctionText.append("(" + elementText + ")");
            }
        }
        return conjunctionText.toString();
    }

    /**
     * Gather parameters.
     * 
     * @param parameterList Parameter list
     */
    @Override
    public void gatherParameters(List<SQLParam> parameterList) {
        super.gatherParameters(parameterList);
        for (SQLWhereOperand element : elements) {
            element.gatherParameters(parameterList);
        }
    }
}
