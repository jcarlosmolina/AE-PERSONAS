package com.keralty.aepersonas.exception;

/**
 * This class contains all the constant error messages.
 */
public final class ErrorInfo {

    private ErrorInfo() {

    }

    // Arguments
    public static final String NOTNULLARGUMENT = "Argument ${argument} can't be null in ${service} of ${class}.";
    public static final String MAXLENGTHARGUMENT = "Argument ${argument} exceeds the maximum length ${length}";
    public static final String MISSING_ARGUMENT_ERROR = "Argument ${missingArg} doesn't exist.";

    // STD
    public static final String STDERROR = "Unable to execute ${service} in the current state of ${class}";

    // Cardinality
    public static final String INSTANCEEXISTS = "Instance of ${class} already exists";
    public static final String INSTANCENOTEXISTS = "Instance of ${class} does not exist";
    public static final String RELATEDEXISTS = "Related instance ${role} already exists";
    public static final String RELATEDNOTEXISTS = "Related instance ${role} does not exist";
    public static final String MINCARDINALITY = "At least ${cardinality} instance(s) of ${role} need to be related with ${class}";
    public static final String MAXCARDINALITY = "Maximum cardinality for ${role} is not satisfied. At most ${cardinality} instances of ${role} are allowed";
    public static final String STATIC = "${class} can't be deleted because it's related with ${role}";
    public static final String STATICCREATION = "${class} can't be created because it cannot be related with ${role}";

    // Precondition
    public static final String PRECONDITIONFAILURE = "${precondition}";

    // Constraint
    public static final String CONSTRAINTSFAILURE  = "${constraint}";

    // Alternate Key
    public static final String DUPLICATEALTERNATEKEYFAILURE = "${duplicatealternatekey}";
    public static final String ALTERNATEKEYNOTEXISTS = "Alternate key ${AlternateKey} does not exist for the ${class} class";

    // Agent Validation
    public static final String AGENTVALIDATIONFAILURE = "Invalid authentication";
    public static final String ACCESSAGENTVALIDATIONFAILURE = "You don't have sufficient rights to access this information";

    // Change detection error.
    public static final String STATECHANGEFAILURE = "State change detection error";

    // System error
    public static final String SYSTEMERRORMESSAGE = "System error.";

    /** There isn't an error. */
    public static final int NO_ERROR             = 0;

    /** The object doesn't exist. */
    public static final int NO_EXIST_INSTANCE    = 1;

    /** The creation of an object fails due to the existence of one with the same identification. */
    public static final int EXISTS_INSTANCE      = 2;

    /** There isn't a valid STD transition for the object. */
    public static final int STD                  = 3;

    /** A precondition of a service fail. */
    public static final int PRECONDITION         = 4;

    /** The integrity constraint of an object fail. */
    public static final int CONSTRAINT           = 5;

    /** The lowest cardinality of an object was incorrect. */
    public static final int LOW_CARD             = 6;

    /** The highest cardinality of an object was incorrect. */
    public static final int HIGH_CARD             = 7;

    /** A dynamic relationship exists an we can't create it again. */
    public static final int DIN_REL_EXIST        = 8;

    /** We are trying to break a dynamic relationship that don't exists. */
    public static final int DIN_REL_NO_EXIST     = 9;

    /** An object is trying to specialized an extra information is needed. */
    public static final int EXPECT_SPE_ARG       = 10;

    public static final int INSTANCE_RELATED     = 11;

    /** The user is not validated. */
    public static final int NO_IDENTIFICATION    = 15;

    /** The agent can't see these instances. */
    public static final int NO_FILTER_RIGHTS      = 19;

    /** An argument has null value when it can't. */
    public static final int NULL_ARGUMENT       = 26;

    /** An argument has an incorrect format. */
    public static final int XML_FORMAT          = 29;

    /** Argument's domain class does not match the expected one. */
    public static final int ARG_NO_MATCH          = 32;

    /** Missing argument. */
    public static final int MISSING_ARGUMENT     = 33;

    /** Argument's maximum length exceeded. */
    public static final int MAX_LENGTH           = 35;

    /** The value of an argument is wrong. */
    public static final int BAD_ARGUMENT         = 36;

    /** An invalid RolePath. */
    public static final int INV_ROLE             = 39;

    /** An agent can't be validated. */
    public static final int BAD_LOGIN            = 41;

    /** The agent has no rights to execute the service. */
    public static final int NO_AGENT             = 43;

    /** An argument of an object must be natural. */
    public static final int ARG_NO_NATURAL       = 44;

    /** An attribute of an object can't be null. */
    public static final int NULL_ATTRIBUTE       = 45;

    /** The class can't be created because it cannot be related. */
    public static final int STATIC_CREATION      = 47;

    /** The state of an item has changed. */
    public static final int STATECHANGE		 = 48;

    /** There is already an instance with that value in the alternate key */
    public static final int DUPLICATE_ALTERNATE_KEY = 49;

    /** The alternate key does not exist */
    public static final int NO_ALTERNATE_KEY = 50;

    /** Bad Identity error. */
    public static final int BAD_IDENTITY        = 88;

    /** System error. */
    public static final int SYSTEM_ERROR      = 999;
}
