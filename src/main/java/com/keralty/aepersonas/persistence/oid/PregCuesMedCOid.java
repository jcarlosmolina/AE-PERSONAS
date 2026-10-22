package com.keralty.aepersonas.persistence.oid;

import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.utils.Utilities;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import com.keralty.aepersonas.global.PregCuesMedCConstants;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Embeddable
public class PregCuesMedCOid implements IOid {

    private static final long serialVersionUID = 1L;

    /** Identification function field ID **/
    @Column(name=PregCuesMedCConstants.FLD_PERSONACID)
    @JsonProperty(value = "id")
    private Long personaCID;
    /** Identification function field CodPregunta **/
    @Column(name=PregCuesMedCConstants.FLD_PREGCUESMEDCCODPREGUNTA)
    @JsonProperty(value = "codpregunta")
    private Long pregCuesMedCCodPregunta;

    /** Default constructor. **/
    public PregCuesMedCOid() {
        // Default constructor
    }

    /**
     * Constructor that initializes the attributes values.
     * 
     * @param personaCID value of the <code>personaCID</code> attribute.
     * @param pregCuesMedCCodPregunta value of the <code>pregCuesMedCCodPregunta</code> attribute.
     */
    public PregCuesMedCOid(Long personaCID, Long pregCuesMedCCodPregunta) {
        this.personaCID = personaCID;
        this.pregCuesMedCCodPregunta = pregCuesMedCCodPregunta;
    }

    /**
     * Constructor that initializes the attributes values in the List.
     * 
     * @param col is an ArrayList with the attribute values.
     */
    public PregCuesMedCOid(List<Object> col) {
        this.personaCID = (Long) col.get(0);
        this.pregCuesMedCCodPregunta = (Long) col.get(1);
    }

    /**
     * Constructor that initializes the attributes values from the identifiers of the related instances.
     * @param personacOID the OID of <code>PersonaC</code>
     * @param CodPregunta value of the <code>CodPregunta</code> attribute
     */
    public PregCuesMedCOid(PersonaCOid personacOID, java.lang.Long CodPregunta) {
        this.personaCID = personacOID.getPersonaCID();
        this.pregCuesMedCCodPregunta = CodPregunta;
    }

    /**
     * Tells whether this OID is null or not.
     * 
     * @return true if this OID is null. False otherwise.
     */
	@Override
    public boolean isNull() {
        boolean nullValue;
        if (personaCID == null || pregCuesMedCCodPregunta == null)
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
     * Gets the value of CodPregunta attribute.
     * 
     * @return the value.
     */
    @JsonIgnore
    public Long getPregCuesMedCCodPregunta() {
        return pregCuesMedCCodPregunta;
    }

    /**
     * Sets the value of CodPregunta attribute.
     * 
     * @param pregCuesMedCCodPregunta the new value.
     */
    public void setPregCuesMedCCodPregunta(Long pregCuesMedCCodPregunta) {
        this.pregCuesMedCCodPregunta = pregCuesMedCCodPregunta;
    }

    /**
     * Provides a unique hashcode for the instance.
     * 
     * @return hashcode representing this instance.
     */
	@Override
    public int hashCode() {
        try {
            return personaCID.hashCode() + pregCuesMedCCodPregunta.hashCode();
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
        } else if (!(obj instanceof PregCuesMedCOid)) {
            returnValue = false;
        } else {
            PregCuesMedCOid oid = (PregCuesMedCOid) obj;
            if (oid == this) {
                returnValue = true;
            } else {
                returnValue = Utilities.isEqual(oid.personaCID, personaCID) && Utilities.isEqual(oid.pregCuesMedCCodPregunta, pregCuesMedCCodPregunta);
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
        return "[personaCID=" + personaCID + ", pregCuesMedCCodPregunta=" + pregCuesMedCCodPregunta + "]";
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
        values[1] = pregCuesMedCCodPregunta;
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
        values[0] = PregCuesMedCConstants.ATTR_NAME_PERSONAC_PERSONACID;
        values[1] = PregCuesMedCConstants.ATTR_NAME_PREGCUESMEDCCODPREGUNTA;
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
        dataTypes[1] = Constants.Type.INT.getTypeName();
        return dataTypes;
    }

    /**
     * Returns the definition class of this OID.
     * 
     * @return Name of the definition class of this OID.
     */
	@Override
    public String getDefinitionClass() {
        return PregCuesMedCConstants.CLASS_NAME;
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
        PregCuesMedCOid candidateOID = null;
        try {
            candidateOID = new PregCuesMedCOid((Long) instance[0], (Long) instance[1]);
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            hasError = true;
        }
        if (!hasError && candidateOID != null && !(candidateOID.isNull())) {
            returnValue = this.equals(candidateOID);
        }
        return returnValue;
    }

    public PregCuesMedCOid fromJsonString(String jsonString) {
        ObjectMapper mapper = new ObjectMapper();
        PregCuesMedCOid temp;
        try {
            temp = jsonString != null && !jsonString.isEmpty() ? mapper.readValue(jsonString, PregCuesMedCOid.class) : null;
        } catch (Exception e) {
            temp = null;
        }
        if (temp != null) {
            this.personaCID = temp.personaCID;
            this.pregCuesMedCCodPregunta = temp.pregCuesMedCCodPregunta;
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
