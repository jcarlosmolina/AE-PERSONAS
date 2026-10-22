package com.keralty.aepersonas.persistence.oid;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Interface of the identifier classes.
 */
public interface IOid extends Serializable {

    /**
     * Returns the values of the fields composing the OID in an array.
     * 
     * @return an array with the values of the OID's fields.
     */
    @JsonIgnore
    Object[] getValue();

    /**
     * Returns the names of the fields composing the OID in an array.
     * 
     * @return an array with the names of the OID's fields.
     */
    @JsonIgnore
    String[] getKeys();

    /**
     * Returns true when this OID is null.
     * 
     * @return a boolean.
     */
    @JsonIgnore
    boolean isNull();

    /**
     * Returns the types of the fields composing the OID in an array.
     * 
     * @return an array with the types of the OID's fields.
     */
    @JsonIgnore
    String[] getDataTypes();

    /**
     * The definition class of this OID.
     * 
     * @return A String with the definition class of this OID.
     */
    @JsonIgnore
    String getDefinitionClass();

    /**
     * Returns the Json representation of the OID
     * 
     * @return Json representation of the OID
     */
    String toJson();
}
