package com.keralty.aepersonas.sqlutils;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides the functionality to set up a disjunction of a WHERE clause.
 *
 */
public class SQLWhereDisjunction extends SQLWhereOperand {

    /** Operands list. */
    private List<SQLWhereOperand> elements;

    /**
     * Creates a new disjunction of elements in a WHERE clause.
     * 
     */
    public SQLWhereDisjunction() {
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
     * Adds operand.
     * 
     * @param operand SQLWhereOperand to be added
     */
    public void addOperand(SQLWhereOperand operand) {
        elements.add(operand);
    }

    /**
     * Returns the SQL text corresponding to this disjunction of elements.
     * 
     * @return {@link String} SQL text corresponding to this disjunction of elements
     */
    @Override
    public String getText() {
        StringBuilder disjunctionText = new StringBuilder("");
        String elementText = "";
        for (SQLWhereOperand element : elements) {
            elementText = element.getText();
            if (!elementText.isEmpty()) {
                if (!disjunctionText.toString().isEmpty()) {
                    disjunctionText.append(" OR ");
                }
                disjunctionText.append("(" + elementText + ")");
            }
        }
        return disjunctionText.toString();
    }

    /**
     * Gather parameter.
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
