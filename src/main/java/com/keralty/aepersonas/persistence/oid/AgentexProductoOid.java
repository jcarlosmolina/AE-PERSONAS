package com.keralty.aepersonas.persistence.oid;

import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.utils.Utilities;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import com.keralty.aepersonas.global.AgentexProductoConstants;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Embeddable
public class AgentexProductoOid implements IOid {

    private static final long serialVersionUID = 1L;

    /** Identification function field Id **/
    @Column(name=AgentexProductoConstants.FLD_FUNCIONARIOASESORID)
    @JsonProperty(value = "asesor_id")
    private Long funcionarioAsesorId;
    /** Identification function field Id **/
    @Column(name=AgentexProductoConstants.FLD_AGENTEXPRODUCTOID)
    @JsonProperty(value = "id")
    private Long agentexProductoId;

    /** Default constructor. **/
    public AgentexProductoOid() {
        // Default constructor
    }

    /**
     * Constructor that initializes the attributes values.
     * 
     * @param funcionarioAsesorId value of the <code>funcionarioAsesorId</code> attribute.
     * @param agentexProductoId value of the <code>agentexProductoId</code> attribute.
     */
    public AgentexProductoOid(Long funcionarioAsesorId, Long agentexProductoId) {
        this.funcionarioAsesorId = funcionarioAsesorId;
        this.agentexProductoId = agentexProductoId;
    }

    /**
     * Constructor that initializes the attributes values in the List.
     * 
     * @param col is an ArrayList with the attribute values.
     */
    public AgentexProductoOid(List<Object> col) {
        try {
            this.funcionarioAsesorId = Long.parseLong(col.get(0).toString());
        } catch (Exception e) {
            this.funcionarioAsesorId = null;
        }
        this.agentexProductoId = (Long) col.get(1);
    }

    /**
     * Constructor that initializes the attributes values from the identifiers of the related instances.
     * @param asesorOID the OID of <code>Asesor</code>
     * @param Id value of the <code>Id</code> attribute
     */
    public AgentexProductoOid(AsesorOid asesorOID, java.lang.Long Id) {
        this.funcionarioAsesorId = asesorOID.getFuncionarioId();
        this.agentexProductoId = Id;
    }

    /**
     * Tells whether this OID is null or not.
     * 
     * @return true if this OID is null. False otherwise.
     */
	@Override
    public boolean isNull() {
        boolean nullValue;
        if (funcionarioAsesorId == null || agentexProductoId == null)
            nullValue = true;
        else
            nullValue = false;
        return nullValue;
    }

    /**
     * Gets the value of Id attribute.
     * 
     * @return the value.
     */
    @JsonIgnore
    public Long getFuncionarioAsesorId() {
        return funcionarioAsesorId;
    }

    /**
     * Sets the value of Id attribute.
     * 
     * @param funcionarioAsesorId the new value.
     */
    public void setFuncionarioAsesorId(Long funcionarioAsesorId) {
        this.funcionarioAsesorId = funcionarioAsesorId;
    }
    /**
     * Gets the value of Id attribute.
     * 
     * @return the value.
     */
    @JsonIgnore
    public Long getAgentexProductoId() {
        return agentexProductoId;
    }

    /**
     * Sets the value of Id attribute.
     * 
     * @param agentexProductoId the new value.
     */
    public void setAgentexProductoId(Long agentexProductoId) {
        this.agentexProductoId = agentexProductoId;
    }

    /**
     * Provides a unique hashcode for the instance.
     * 
     * @return hashcode representing this instance.
     */
	@Override
    public int hashCode() {
        try {
            return funcionarioAsesorId.hashCode() + agentexProductoId.hashCode();
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
        } else if (!(obj instanceof AgentexProductoOid)) {
            returnValue = false;
        } else {
            AgentexProductoOid oid = (AgentexProductoOid) obj;
            if (oid == this) {
                returnValue = true;
            } else {
                returnValue = Utilities.isEqual(oid.funcionarioAsesorId, funcionarioAsesorId) && Utilities.isEqual(oid.agentexProductoId, agentexProductoId);
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
        return "[funcionarioAsesorId=" + funcionarioAsesorId + ", agentexProductoId=" + agentexProductoId + "]";
    }



    /**
     * Returns the values of the fields composing the OID in an array.
     * 
     * @return an array with the values of the OID fields.
     */
	@Override
    public Object[] getValue() {
        Object[] values = new Object[2];
        values[0] = funcionarioAsesorId;
        values[1] = agentexProductoId;
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
        values[0] = AgentexProductoConstants.ATTR_NAME_ASESOR_FUNCIONARIOID;
        values[1] = AgentexProductoConstants.ATTR_NAME_AGENTEXPRODUCTOID;
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
        return AgentexProductoConstants.CLASS_NAME;
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
        AgentexProductoOid candidateOID = null;
        try {
            candidateOID = new AgentexProductoOid((Long) instance[0], (Long) instance[1]);
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            hasError = true;
        }
        if (!hasError && candidateOID != null && !(candidateOID.isNull())) {
            returnValue = this.equals(candidateOID);
        }
        return returnValue;
    }

    public AgentexProductoOid fromJsonString(String jsonString) {
        ObjectMapper mapper = new ObjectMapper();
        AgentexProductoOid temp;
        try {
            temp = jsonString != null && !jsonString.isEmpty() ? mapper.readValue(jsonString, AgentexProductoOid.class) : null;
        } catch (Exception e) {
            temp = null;
        }
        if (temp != null) {
            this.funcionarioAsesorId = temp.funcionarioAsesorId;
            this.agentexProductoId = temp.agentexProductoId;
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
