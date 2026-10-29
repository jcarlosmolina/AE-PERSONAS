package com.keralty.aepersonas.exception;

import java.util.List;

/**
 * <code>IntegrityConstraintException</code> appears when there is a problem with
 *  an integrity constraint.
 */
public class IntegrityConstraintException extends ModelException {

    /**
     * Serialization UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Class constructor.
     *
     * @param idConstraint           Identification constraint.
     * @param constraintMessage      Constraint error message
     * @param exceptionMessageParts  List with the error message parameters.
     */
    public IntegrityConstraintException(String idConstraint, String constraintMessage,
            List<String> exceptionMessageParts) {
        super(ErrorInfo.CONSTRAINT, constraintMessage, idConstraint, exceptionMessageParts);
    }
}
