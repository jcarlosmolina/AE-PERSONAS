package com.keralty.aepersonas.persistence.oid;

import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.utils.Utilities;
import java.util.List;
import com.keralty.aepersonas.global.LogDatosDominioConstants;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LogDatosDominioOid implements IOid {

    private static final long serialVersionUID = 1L;

    /** Identification function field id_LogDatosDominio **/
    @JsonProperty(value = "id_logdatosdominio")
    private Long logDatosDominioidLogDatosDominio;

    /** Default constructor. **/
    public LogDatosDominioOid() {
        // Default constructor
    }

    /**
     * Constructor that initializes the attributes values.
     * 
     * @param logDatosDominioidLogDatosDominio value of the <code>logDatosDominioidLogDatosDominio</code> attribute.
     */
    public LogDatosDominioOid(Long logDatosDominioidLogDatosDominio) {
        this.logDatosDominioidLogDatosDominio = logDatosDominioidLogDatosDominio;
    }

    /**
     * Constructor that initializes the attributes values in the List.
     * 
     * @param col is an ArrayList with the attribute values.
     */
    public LogDatosDominioOid(List<Object> col) {
        this.logDatosDominioidLogDatosDominio = (Long) col.get(0);
    }

    /**
     * Tells whether this OID is null or not.
     * 
     * @return true if this OID is null. False otherwise.
     */
	@Override
    public boolean isNull() {
        boolean nullValue;
        if (logDatosDominioidLogDatosDominio == null)
            nullValue = true;
        else
            nullValue = false;
        return nullValue;
    }

    /**
     * Gets the value of id_LogDatosDominio attribute.
     * 
     * @return the value.
     */
    @JsonIgnore
    public Long getLogDatosDominioidLogDatosDominio() {
        return logDatosDominioidLogDatosDominio;
    }

    /**
     * Sets the value of id_LogDatosDominio attribute.
     * 
     * @param logDatosDominioidLogDatosDominio the new value.
     */
    public void setLogDatosDominioidLogDatosDominio(Long logDatosDominioidLogDatosDominio) {
        this.logDatosDominioidLogDatosDominio = logDatosDominioidLogDatosDominio;
    }

    /**
     * Provides a unique hashcode for the instance.
     * 
     * @return hashcode representing this instance.
     */
	@Override
    public int hashCode() {
        try {
            return logDatosDominioidLogDatosDominio.hashCode();
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
        } else if (!(obj instanceof LogDatosDominioOid)) {
            returnValue = false;
        } else {
            LogDatosDominioOid oid = (LogDatosDominioOid) obj;
            if (oid == this) {
                returnValue = true;
            } else {
                returnValue = Utilities.isEqual(oid.logDatosDominioidLogDatosDominio, logDatosDominioidLogDatosDominio);
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
        return "[logDatosDominioidLogDatosDominio=" + logDatosDominioidLogDatosDominio + "]";
    }



    /**
     * Returns the values of the fields composing the OID in an array.
     * 
     * @return an array with the values of the OID fields.
     */
	@Override
    public Object[] getValue() {
        Object[] values = new Object[1];
        values[0] = logDatosDominioidLogDatosDominio;
        return values;
    }

    /**
     * Returns the name of the fields composing the OID in an array.
     * 
     * @return an array with the names of the OID fields.
     */
	@Override
    public String[] getKeys() {
        String[] values = new String[1];
        values[0] = LogDatosDominioConstants.ATTR_NAME_LOGDATOSDOMINIOIDLOGDATOSDOMINIO;
        return values;
    }

    /**
     * Returns the types of the fields composing the OID in an array.
     * 
     * @return an array with the types of the OID fields.
     */
	@Override
    public String[] getDataTypes() {
        String[] dataTypes = new String[1];
        dataTypes[0] = Constants.Type.AUTONUMERIC.getTypeName();
        return dataTypes;
    }

    /**
     * Returns the definition class of this OID.
     * 
     * @return Name of the definition class of this OID.
     */
	@Override
    public String getDefinitionClass() {
        return LogDatosDominioConstants.CLASS_NAME;
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
        LogDatosDominioOid candidateOID = null;
        try {
            candidateOID = new LogDatosDominioOid((Long) instance[0]);
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            hasError = true;
        }
        if (!hasError && candidateOID != null && !(candidateOID.isNull())) {
            returnValue = this.equals(candidateOID);
        }
        return returnValue;
    }

    public LogDatosDominioOid fromJsonString(String jsonString) {
        ObjectMapper mapper = new ObjectMapper();
        LogDatosDominioOid temp;
        try {
            temp = jsonString != null && !jsonString.isEmpty() ? mapper.readValue(jsonString, LogDatosDominioOid.class) : null;
        } catch (Exception e) {
            temp = null;
        }
        if (temp != null) {
            this.logDatosDominioidLogDatosDominio = temp.logDatosDominioidLogDatosDominio;
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
