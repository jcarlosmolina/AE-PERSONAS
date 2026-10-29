package com.keralty.aepersonas.sqlutils;

import java.util.Iterator;
import java.util.List;

import com.keralty.aepersonas.utils.Utilities;

/**
 *
 * Comparison in the WHERE clause of a SQL sentence. Comprises two operands an a
 * comparison operator.
 *
 */
public class SQLWhereComparison extends SQLWhereOperand {

    private static final String OPERATOR_LIKE = "like";

    private static final String OPERATOR_CONTAINS = "contains";

    private static final String OPERATOR_CONTAINS_BASIC = "containsBasic";

    /** SQL sentence. */
    private SQLSelect sql;

    /** Operator. */
    private String operator;

    /** Explicit comparison text. */
    private String explicitComparisonText = "";

    /** First operand. */
    private SQLWhereOperand firstOperand;

    /** Second operand. */
    private SQLWhereOperand secondOperand;

    /**
     * Sets where comparison select.
     * 
     * @param select (SQLSelect to be set
     */
    public SQLWhereComparison(SQLSelect select) {
        super("Bool");
        this.sql = select;
    }

    /**
     * Gets where comparision select.
     * 
     * @return {@link SQLSelect}
     */
    public SQLSelect getSelect() {
        return sql;
    }

    /**
     * Returns the text of this comparison of the WHERE clause.
     * 
     * @return {@link String} Text of this disjunction of the WHERE clause
     */
    @Override
    public String getText() {
        String sqlComparisonText = "";
        if (!explicitComparisonText.isEmpty()) {
            sqlComparisonText = explicitComparisonText;
        } else {
            sqlComparisonText = getTextForNonExplicitComparison();
        }
        return sqlComparisonText;
    }

    private String getTextForNonExplicitComparison() {
        String sqlComparisonText = "";
        boolean hasValue = false;
        // If operator is 'Like', process the second operand
        if (this.operator.equalsIgnoreCase(OPERATOR_LIKE) && secondOperand != null) {
            secondOperand.processForLikeOperator();
        }

        // contains pending to be preprocessed
        if (this.operator.equalsIgnoreCase(OPERATOR_CONTAINS) && secondOperand != null) {
            processContainsOperator();
            secondOperand.processForContainsOperator();
            sqlComparisonText = secondOperand.getText();
            hasValue = true;
        }

        // basic contains conditions (preprocessed)
        if (!hasValue && this.operator.equalsIgnoreCase(OPERATOR_CONTAINS_BASIC) && secondOperand != null) {
            this.operator = OPERATOR_LIKE;
            secondOperand.processForContainsOperator();
        }

        // Check if any operand is the Null operand and get the comparison text
        if (!hasValue)
            sqlComparisonText = getTextForNullableOperands();
        return sqlComparisonText;
    }

    private String getTextForNullableOperands() {
        String sqlComparisonText = "";
        boolean hasValue = false;
        Integer operandNull = checkNullOperand();

        if (operandNull == 2) {
            sqlComparisonText = firstOperand.getText();
            hasValue = true;
        }

        if (!hasValue && operandNull == 1) {
            sqlComparisonText = secondOperand.getText();
            hasValue = true;
        }

        // Compare instances
        if (!hasValue && ((firstOperand != null && SQLWhereOperandPathInstance.class.isInstance(firstOperand))
                || (secondOperand != null && SQLWhereOperandPathInstance.class.isInstance(secondOperand)))) {
            sqlComparisonText = getTextForOVComparison();
            hasValue = true;
        }

        if (!hasValue && firstOperand != null) {
            sqlComparisonText += firstOperand.getText();
        }

        // Only if the second operand is not null, add the operator to the comparison
        if (!hasValue && secondOperand != null) {
            sqlComparisonText += " " + operator + " ";
            sqlComparisonText += secondOperand.getText();
        }
        return sqlComparisonText;
    }

    /**
     * Pre-process contains clause generating the conjunction of contains
     * conditions.
     */
    private void processContainsOperator() {
        if (!(secondOperand instanceof SQLWhereOperandLiteral)) {
            setOperator(OPERATOR_LIKE);
        } else {
            String secondOp = ((SQLWhereOperandLiteral) secondOperand).getLiteral().toString();
            processContainsOperatorConditions(Utilities.getContainsConditions(secondOp));
        }
    }

    private void processContainsOperatorConditions(List<String> conditions) {
        SQLWhereConjunction containsCond = null;
        if (conditions != null) {
            if (conditions.size() <= 1) {
                setSecondOperand(new SQLWhereOperandLiteral(conditions.size() == 1 ? conditions.get(0) : "",
                        secondOperand.getType()));
                setOperator(OPERATOR_CONTAINS_BASIC);
            } else {
                containsCond = new SQLWhereConjunction();
                Iterator<String> i = conditions.iterator();
                while (i.hasNext()) {
                    // add all the list of contains comparison to a condition
                    // 'contains' Comparison
                    SQLWhereComparison comparison = new SQLWhereComparison(sql);
                    comparison.setOperator(OPERATOR_CONTAINS_BASIC);

                    // Operand 1
                    SQLWhereOperandPathAttribute operand1 = (SQLWhereOperandPathAttribute) firstOperand;
                    comparison.setFirstOperand(operand1);

                    // Operand 2
                    SQLWhereOperandLiteral operand2 = new SQLWhereOperandLiteral(i.next(), secondOperand.getType());
                    comparison.setSecondOperand(operand2);
                    containsCond.addOperand(comparison);
                }
                secondOperand = containsCond;
            }
        }
    }

    /**
     * Set explicitly the comparison text.
     * 
     * @param textComparison Text of this disjunction of the WHERE clause
     */
    public void setExplicitComparisonText(String textComparison) {
        explicitComparisonText = textComparison;
    }

    /**
     * Returns the comparison string for instance operands.
     * 
     * @return {@link String}
     */
    private String getTextForOVComparison() {
        StringBuilder result = new StringBuilder("");

        List<String> firstOperandExpressions = ((SQLWhereOperandPathInstance) firstOperand).getOidExpressions();
        List<String> secondOperandExpressions = ((SQLWhereOperandPathInstance) secondOperand).getOidExpressions();

        String logicalOperator = "";
        if (this.operator.equalsIgnoreCase("=")) {
            // Terms used in an 'equals' comparison must be ANDed
            logicalOperator = " AND ";
        } else {
            // Terms used in a 'distinct' comparison must be ORed
            logicalOperator = " OR ";
        }

        for (int i = 0; i < firstOperandExpressions.size(); i++) {
            if (!result.toString().isEmpty()) {
                result.append(logicalOperator);
            }
            result.append(firstOperandExpressions.get(i) + " " + this.operator + " " + secondOperandExpressions.get(i));
        }

        return "(" + result.toString() + ")";
    }

    /**
     * Check if any operand is the null operand In that case, obtain the comparison
     * text.
     * 
     * @return {@link Integer} Comparison text if any operand is the Null operand
     */
    private Integer checkNullOperand() {
        Integer returnValue = 0;
        if ((firstOperand != null && !SQLWhereOperandNull.class.isInstance(firstOperand))
                && (secondOperand != null && !SQLWhereOperandNull.class.isInstance(secondOperand))) {
            returnValue = 0;
        } else if (secondOperand != null && SQLWhereOperandNull.class.isInstance(firstOperand)) {
            setNullComparisonTo(secondOperand);
            returnValue = 1;
        } else if (firstOperand != null && SQLWhereOperandNull.class.isInstance(secondOperand)) {
            setNullComparisonTo(firstOperand);
            returnValue = 2;
        }
        return returnValue;
    }

    /**
     * Set comparison with null to the operand.
     * 
     * @param operand SQLWhereOperand
     */
    private void setNullComparisonTo(SQLWhereOperand operand) {
        operand.setComparisonWithNull(operator);
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
        this.operator = operator;
    }

    /**
     * Gets the first operand for this comparison.
     * 
     * @return SQLWhereOperand First operand
     */
    public SQLWhereOperand getFirstOperand() {
        return firstOperand;
    }

    /**
     * Sets the first operand for this comparison.
     * 
     * @param operand First operand
     */
    public void setFirstOperand(SQLWhereOperand operand) {
        this.firstOperand = operand;
        if (firstOperand != null) {
            firstOperand.processOperand(sql);
        }
    }

    /**
     * Gets the second operand for this comparison.
     * 
     * @return {@link SQLWhereOperand} Second operand
     */
    public SQLWhereOperand getSecondOperand() {
        return secondOperand;
    }

    /**
     * Sets the second operand for this comparison.
     * 
     * @param operand Second operand
     */
    public void setSecondOperand(SQLWhereOperand operand) {
        this.secondOperand = operand;
        if (secondOperand != null) {
            secondOperand.processOperand(sql);
        }
    }

    /**
     * Gather parameters.
     * 
     * @param parameterList Second operand
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
