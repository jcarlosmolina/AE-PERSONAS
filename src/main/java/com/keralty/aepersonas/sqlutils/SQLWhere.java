package com.keralty.aepersonas.sqlutils;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.exception.SystemException;

/**
 * Provides the functionality to set up a WHERE clause for an SQL select clause.
 * The WHERE clause comprises a list of AND-separated conjunctions.
 *
 */
public class SQLWhere {

    private List<SQLWhereOperand> elements;

    /**
     * Default constructor.
     */
    public SQLWhere() {
        elements = new ArrayList<>();
    }

    /**
     * Adds comparison.
     * 
     * @param comparison SQLWhereComparison element to be added
     */
    public void addComparison(SQLWhereComparison comparison) {
        elements.add(comparison);
    }

    /**
     * Adds conjunction.
     * 
     * @param conjunction SQLWhereConjunction element to be added
     */
    public void addConjunction(SQLWhereConjunction conjunction) {
        elements.add(conjunction);
    }

    /**
     * Adds disjunction.
     * 
     * @param disjunction SQLWhereDisjunction element to be added
     */
    public void addDisjunction(SQLWhereDisjunction disjunction) {
        elements.add(disjunction);
    }

    /**
     * Adds operand.
     * 
     * @param operand SQLWhereOperand element to be added
     */
    public void addOperand(SQLWhereOperand operand) {
        elements.add(operand);
    }

    /**
     * Returns true if this WHERE clause has no elements.
     * 
     * @return {@link Boolean} True if this WHERE clause has no elements
     */
    public Boolean isEmpty() {
        return elements.isEmpty();
    }

    /**
     * Returns the text of this WHERE clause.
     * 
     * @return {@link String} Text of this WHERE clause
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public String getText() {
        StringBuilder elementsText = new StringBuilder("");
        String elementText = "";

        for (SQLWhereOperand element : elements) {
            elementText = element.getText();
            if (!elementText.equalsIgnoreCase("")) {
                if (elementsText.toString().length() != 0) {
                    elementsText.append(" AND ");
                }
                elementsText.append(elementText);
            }
        }

        if (elementsText.toString().length() != 0) {
            elementsText.insert(0, " WHERE ");
        }
        return elementsText.toString();
    }

    /**
     * Add the element's parameter to the received list.
     * 
     * @param parameterList Parameter list with the elements
     */
    public void gatherParameters(List<SQLParam> parameterList) {
        for (SQLWhereOperand element : elements) {
            element.gatherParameters(parameterList);
        }
    }

}
