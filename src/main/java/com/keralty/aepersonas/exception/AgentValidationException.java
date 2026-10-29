package com.keralty.aepersonas.exception;

/**
 * <code>AgentValidationException</code> appears when there is a problem
 * in the validation of an agent.
 */
public class AgentValidationException extends ModelException {

    /**
     * Serialization UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor class.
     */
    public AgentValidationException() {
        super(ErrorInfo.BAD_LOGIN, ErrorInfo.AGENTVALIDATIONFAILURE);
    }
}
