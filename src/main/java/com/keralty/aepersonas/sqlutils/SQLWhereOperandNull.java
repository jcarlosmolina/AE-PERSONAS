package com.keralty.aepersonas.sqlutils;

/**
 * Null Literal that is used as operand in the WHERE clause of an SQL sentence.
 */
public class SQLWhereOperandNull extends SQLWhereOperand {

    /**
     * Class constructor.
     */
    public SQLWhereOperandNull() {
        super("");
        this.setOperandText("null");
    }


    /**
     * Set the comparison of this operand with Null.
     * @param operator Operator to be used
     */
    @Override
    public void setComparisonWithNull(String operator) {
        if (this.getCompareWithNull()) {
            return;
        }

        if (operator.equalsIgnoreCase("<>")) {
            this.setOperandText(getOperandText() + " is not null");
        } else if (operator.equalsIgnoreCase("=")) {
            this.setOperandText(getOperandText() + " is null");
        } else {
            this.setOperandText(getOperandText() + " " + operator + " ?");
            addParameter(new SQLParam("", null, ""));
        }

        super.setComparisonWithNull(operator);
    }
}
