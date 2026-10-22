package com.keralty.aepersonas.sqlutils;

import com.keralty.aepersonas.global.Constants;

/**
 * Literal that is used as operand in the WHERE clause of an SQL sentence.
 */
public class SQLWhereOperandLiteral extends SQLWhereOperand {

    /** Operand to be added to the sql sentence. */
    private Object literal;

    /**
     * Default constructor.
     * 
     * @param literal  Literal operand
     * @param dataType Data Type
     */
    public SQLWhereOperandLiteral(Object literal, String dataType) {
        super(dataType);
        if (dataType.equalsIgnoreCase(Constants.Type.REAL.getTypeName()))
			try {
                this.literal = Double.valueOf(literal.toString());
			} catch (Exception e) {
				this.literal = null;
			}
        else
            this.literal = literal;
    }

    /**
     * Sets the literal operand.
     * 
     * @param literal Literal operand
     */
    public void setLiteral(Object literal) {
        this.literal = literal;
    }

    /**
     * Gets the literal operand
     * 
     * @return the literal operand
     */
    public Object getLiteral() {
        return this.literal;
    }

    /**
     * Process an operand adding its value to the sql parameters collection.
     * 
     * @param sql Sql object
     */
    @Override
    public void processOperand(SQLSelect sql) {
        super.processOperand(sql);

        // Obtain the parameter related to the literal
        SQLParam param = new SQLParam("", literal, this.getType());
        // Add the parameter to the parameter list
        addParameter(param);

        this.setOperandText("?");
    }

    /**
     * Set the comparison of this operand with Null.
     * 
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

    /**
     * This operand is in the right side of the 'Like' comparison. Adds the special
     * character at the end of the parameter value
     */
    @Override
    public void processForLikeOperator() {
        // If it has been process, do nothing
        if (this.getProcessForLike()) {
            return;
        }

        clearParameters();
        // Add the special character to the parameter value
        SQLParam param = new SQLParam("", literal + "%", this.getType());
        // Add the parameter to the parameter list
        addParameter(param);

        super.processForLikeOperator();
    }

    /**
     * This operand is in the right side of the 'Contains' comparison. Adds the
     * special character at the end of the parameter value
     */
    @Override
    public void processForContainsOperator() {
        // If it has been process, do nothing
        if (this.getProcessForContains()) {
            return;
        }

        clearParameters();
        // Add the special character to the parameter value
        SQLParam param = new SQLParam("", "%" + literal + "%", this.getType());
        // Add the parameter to the parameter list
        addParameter(param);

        super.processForContainsOperator();
    }
}
