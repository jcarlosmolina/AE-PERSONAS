package com.keralty.aepersonas.persistence.oid;

import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.utils.Utilities;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import com.keralty.aepersonas.global.BeneficiarioCConstants;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Embeddable
public class BeneficiarioCOid implements IOid {

    private static final long serialVersionUID = 1L;

    /** Identification function field ID **/
    @Column(name=BeneficiarioCConstants.FLD_CONTRATOCCONTRATOCID)
    @JsonProperty(value = "contratoc_id")
    private Long contratoCContratoCID;
    /** Identification function field ID **/
    @Column(name=BeneficiarioCConstants.FLD_BENEFICIARIOCID)
    @JsonProperty(value = "id")
    private Long beneficiarioCID;

    /** Default constructor. **/
    public BeneficiarioCOid() {
        // Default constructor
    }

    /**
     * Constructor that initializes the attributes values.
     * 
     * @param contratoCContratoCID value of the <code>contratoCContratoCID</code> attribute.
     * @param beneficiarioCID value of the <code>beneficiarioCID</code> attribute.
     */
    public BeneficiarioCOid(Long contratoCContratoCID, Long beneficiarioCID) {
        this.contratoCContratoCID = contratoCContratoCID;
        this.beneficiarioCID = beneficiarioCID;
    }

    /**
     * Constructor that initializes the attributes values in the List.
     * 
     * @param col is an ArrayList with the attribute values.
     */
    public BeneficiarioCOid(List<Object> col) {
        this.contratoCContratoCID = (Long) col.get(0);
        this.beneficiarioCID = (Long) col.get(1);
    }

    /**
     * Constructor that initializes the attributes values from the identifiers of the related instances.
     * @param contratocOID the OID of <code>ContratoC</code>
     * @param ID value of the <code>ID</code> attribute
     */
    public BeneficiarioCOid(ContratoCOid contratocOID, java.lang.Long ID) {
        this.contratoCContratoCID = contratocOID.getContratoCID();
        this.beneficiarioCID = ID;
    }

    /**
     * Tells whether this OID is null or not.
     * 
     * @return true if this OID is null. False otherwise.
     */
	@Override
    public boolean isNull() {
        boolean nullValue;
        if (contratoCContratoCID == null || beneficiarioCID == null)
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
    public Long getContratoCContratoCID() {
        return contratoCContratoCID;
    }

    /**
     * Sets the value of ID attribute.
     * 
     * @param contratoCContratoCID the new value.
     */
    public void setContratoCContratoCID(Long contratoCContratoCID) {
        this.contratoCContratoCID = contratoCContratoCID;
    }
    /**
     * Gets the value of ID attribute.
     * 
     * @return the value.
     */
    @JsonIgnore
    public Long getBeneficiarioCID() {
        return beneficiarioCID;
    }

    /**
     * Sets the value of ID attribute.
     * 
     * @param beneficiarioCID the new value.
     */
    public void setBeneficiarioCID(Long beneficiarioCID) {
        this.beneficiarioCID = beneficiarioCID;
    }

    /**
     * Provides a unique hashcode for the instance.
     * 
     * @return hashcode representing this instance.
     */
	@Override
    public int hashCode() {
        try {
            return contratoCContratoCID.hashCode() + beneficiarioCID.hashCode();
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
        } else if (!(obj instanceof BeneficiarioCOid)) {
            returnValue = false;
        } else {
            BeneficiarioCOid oid = (BeneficiarioCOid) obj;
            if (oid == this) {
                returnValue = true;
            } else {
                returnValue = Utilities.isEqual(oid.contratoCContratoCID, contratoCContratoCID) && Utilities.isEqual(oid.beneficiarioCID, beneficiarioCID);
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
        return "[contratoCContratoCID=" + contratoCContratoCID + ", beneficiarioCID=" + beneficiarioCID + "]";
    }



    /**
     * Returns the values of the fields composing the OID in an array.
     * 
     * @return an array with the values of the OID fields.
     */
	@Override
    public Object[] getValue() {
        Object[] values = new Object[2];
        values[0] = contratoCContratoCID;
        values[1] = beneficiarioCID;
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
        values[0] = BeneficiarioCConstants.ATTR_NAME_CONTRATOC_CONTRATOCID;
        values[1] = BeneficiarioCConstants.ATTR_NAME_BENEFICIARIOCID;
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
        return BeneficiarioCConstants.CLASS_NAME;
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
        BeneficiarioCOid candidateOID = null;
        try {
            candidateOID = new BeneficiarioCOid((Long) instance[0], (Long) instance[1]);
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            hasError = true;
        }
        if (!hasError && candidateOID != null && !(candidateOID.isNull())) {
            returnValue = this.equals(candidateOID);
        }
        return returnValue;
    }

    public BeneficiarioCOid fromJsonString(String jsonString) {
        ObjectMapper mapper = new ObjectMapper();
        BeneficiarioCOid temp;
        try {
            temp = jsonString != null && !jsonString.isEmpty() ? mapper.readValue(jsonString, BeneficiarioCOid.class) : null;
        } catch (Exception e) {
            temp = null;
        }
        if (temp != null) {
            this.contratoCContratoCID = temp.contratoCContratoCID;
            this.beneficiarioCID = temp.beneficiarioCID;
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
