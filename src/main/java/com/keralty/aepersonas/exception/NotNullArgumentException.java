package com.keralty.aepersonas.exception;

public class NotNullArgumentException extends ModelException {

    private static final long serialVersionUID = 1L;

    public NotNullArgumentException(String serviceId, String classId, String argumentId, String serviceAlias,
            String classAlias, String argumentAlias) {
        super(ErrorInfo.NULL_ARGUMENT, "Argumento '" + argumentAlias + "' del servicio '" + serviceAlias + "' en la clase '"
                + classAlias + "' no puede ser nulo");
        addExceptionMessagePart(serviceId);
        addExceptionMessagePart(classId);
        addExceptionMessagePart(argumentId);
    }

    public NotNullArgumentException(String serviceId, String argumentId, String serviceAlias, String argumentAlias) {
        super(ErrorInfo.NULL_ARGUMENT,
                "Argumento '" + argumentAlias + "' del servicio '" + serviceAlias + "' no puede ser nulo");
        addExceptionMessagePart(serviceId);
        addExceptionMessagePart(argumentId);
    }
}
