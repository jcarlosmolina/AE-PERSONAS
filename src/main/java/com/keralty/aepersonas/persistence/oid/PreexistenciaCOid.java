package com.keralty.aepersonas.persistence.oid;

import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.utils.Utilities;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import com.keralty.aepersonas.global.PreexistenciaCConstants;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Embeddable
public class PreexistenciaCOid implements IOid {

    private static final long serialVersionUID = 1L;

    /** Identification function field ID **/
    @Column(name=PreexistenciaCConstants.FLD_PERSONACID)
    @JsonProperty(value = "id")
    private Long personaCID;
    /** Identification function field Identificador **/
    @Column(name=PreexistenciaCConstants.FLD_PREEXISTENCIACIDENTIFICADOR)
    @JsonProperty(value = "identificador")
    private Long preexistenciaCIdentificador;

    /** Default constructor. **/
    public PreexistenciaCOid() {
        // Default constructor
    }

    /**
     * Constructor that initializes the attributes values.
     * 
     * @param personaCID value of the <code>personaCID</code> attribute.
     * @param preexistenciaCIdentificador value of the <code>preexistenciaCIdentificador</code> attribute.
     */
    public PreexistenciaCOid(Long personaCID, Long preexistenciaCIdentificador) {
        this.personaCID = personaCID;
        this.preexistenciaCIdentificador = preexistenciaCIdentificador;
    }

    /**
     * Constructor that initializes the attributes values in the List.
     * 
     * @param col is an ArrayList with the attribute values.
     */
    public PreexistenciaCOid(List<Object> col) {
        this.personaCID = (Long) col.get(0);
        this.preexistenciaCIdentificador = (Long) col.get(1);
    }

    /**
     * Constructor that initializes the attributes values from the identifiers of the related instances.
     * @param personacOID the OID of <code>PersonaC</code>
     * @param Identificador value of the <code>Identificador</code> attribute
     */
    public PreexistenciaCOid(PersonaCOid personacOID, java.lang.Long Identificador) {
        this.personaCID = personacOID.getPersonaCID();
        this.preexistenciaCIdentificador = Identificador;
    }

    /**
     * Tells whether this OID is null or not.
     * 
     * @return true if this OID is null. False otherwise.
     */
	@Override
    public boolean isNull() {
        boolean nullValue;
        if (personaCID == null || preexistenciaCIdentificador == null)
            nullValue = true;
        else
            nullValue = false;
        return nullValue;
    }

    /**
     * Gets the value of ID attribute.
     * 
     * @return the value.
     */
    @JsonIgnore
    public Long getPersonaCID() {
        return personaCID;
    }

    /**
     * Sets the value of ID attribute.
     * 
     * @param personaCID the new value.
     */
    public void setPersonaCID(Long personaCID) {
        this.personaCID = personaCID;
    }
    /**
     * Gets the value of Identificador attribute.
     * 
     * @return the value.
     */
    @JsonIgnore
    public Long getPreexistenciaCIdentificador() {
        return preexistenciaCIdentificador;
    }

    /**
     * Sets the value of Identificador attribute.
     * 
     * @param preexistenciaCIdentificador the new value.
     */
    public void setPreexistenciaCIdentificador(Long preexistenciaCIdentificador) {
        this.preexistenciaCIdentificador = preexistenciaCIdentificador;
    }

    /**
     * Provides a unique hashcode for the instance.
     * 
     * @return hashcode representing this instance.
     */
	@Override
    public int hashCode() {
        try {
            return personaCID.hashCode() + preexistenciaCIdentificador.hashCode();
        } catch (NullPointerException e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return super.hashCode();
        }
    }

    /**
     * Says if the this object is the same object as <code>obj</code>.
     * 
     * @param obj object to compare this instance with.
     * @return true if the objects are the same object.
     */
	@Override
    public boolean equals(Object obj) {
        boolean returnValue;
        if (obj == null) {
            returnValue = false;
        } else if (!(obj instanceof PreexistenciaCOid)) {
            returnValue = false;
        } else {
            PreexistenciaCOid oid = (PreexistenciaCOid) obj;
            if (oid == this) {
                returnValue = true;
            } else {
                returnValue = Utilities.isEqual(oid.personaCID, personaCID) && Utilities.isEqual(oid.preexistenciaCIdentificador, preexistenciaCIdentificador);
            }
        }
        return returnValue;
    }

    /**
     * Returns a String representation of the instance's identifier.
     * 
     * @return String representing the object
     */
	@Override
    public String toString() {
        return "[personaCID=" + personaCID + ", preexistenciaCIdentificador=" + preexistenciaCIdentificador + "]";
    }



    /**
     * Returns the values of the fields composing the OID in an array.
     * 
     * @return an array with the values of the OID fields.
     */
	@Override
    public Object[] getValue() {
        Object[] values = new Object[2];
        values[0] = personaCID;
        values[1] = preexistenciaCIdentificador;
        return values;
    }

    /**
     * Returns the name of the fields composing the OID in an array.
     * 
     * @return an array with the names of the OID fields.
     */
	@Override
    public String[] getKeys() {
        String[] values = new String[2];
        values[0] = PreexistenciaCConstants.ATTR_NAME_PERSONAC_PERSONACID;
        values[1] = PreexistenciaCConstants.ATTR_NAME_PREEXISTENCIACIDENTIFICADOR;
        return values;
    }

    /**
     * Returns the types of the fields composing the OID in an array.
     * 
     * @return an array with the types of the OID fields.
     */
	@Override
    public String[] getDataTypes() {
        String[] dataTypes = new String[2];
        dataTypes[0] = Constants.Type.AUTONUMERIC.getTypeName();
        dataTypes[1] = Constants.Type.AUTONUMERIC.getTypeName();
        return dataTypes;
    }

    /**
     * Returns the definition class of this OID.
     * 
     * @return Name of the definition class of this OID.
     */
	@Override
    public String getDefinitionClass() {
        return PreexistenciaCConstants.CLASS_NAME;
    }

    /**
     * Compare the value of the OID in the array of objects with this
     * 
     * @param instance array of objects with the values of the OID to compare this
     *                 instance with.
     * @return true if the objects are the same object.
     */
    public boolean compareToRS(Object[] instance) {
        boolean returnValue = true;
        boolean hasError = false;
        PreexistenciaCOid candidateOID = null;
        try {
            candidateOID = new PreexistenciaCOid((Long) instance[0], (Long) instance[1]);
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            hasError = true;
        }
        if (!hasError && candidateOID != null && !(candidateOID.isNull())) {
            returnValue = this.equals(candidateOID);
        }
        return returnValue;
    }

    public PreexistenciaCOid fromJsonString(String jsonString) {
        ObjectMapper mapper = new ObjectMapper();
        PreexistenciaCOid temp;
        try {
            temp = jsonString != null && !jsonString.isEmpty() ? mapper.readValue(jsonString, PreexistenciaCOid.class) : null;
        } catch (Exception e) {
            temp = null;
        }
        if (temp != null) {
            this.personaCID = temp.personaCID;
            this.preexistenciaCIdentificador = temp.preexistenciaCIdentificador;
        }
        return this;
    }

    @Override
    public String toJson() {
        ObjectMapper mapper = new ObjectMapper();
        String json;
        try {
            json = mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            json = "";
        }
        return json;
    }
}
