package com.keralty.aepersonas.persistence.oid;

import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.utils.Utilities;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import com.keralty.aepersonas.global.PriorizacionSolicitudesConstants;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Embeddable
public class PriorizacionSolicitudesOid implements IOid {

    private static final long serialVersionUID = 1L;

    /** Identification function field EstadoSolicitud **/
    @Column(name=PriorizacionSolicitudesConstants.FLD_PRIORIZACIONSOLICITUDESESTADOSOLICITUD)
    @JsonProperty(value = "estadosolicitud")
    private Long priorizacionSolicitudesEstadoSolicitud;
    /** Identification function field EstadoDoc **/
    @Column(name=PriorizacionSolicitudesConstants.FLD_PRIORIZACIONSOLICITUDESESTADODOC)
    @JsonProperty(value = "estadodoc")
    private Long priorizacionSolicitudesEstadoDoc;

    /** Default constructor. **/
    public PriorizacionSolicitudesOid() {
        // Default constructor
    }

    /**
     * Constructor that initializes the attributes values.
     * 
     * @param priorizacionSolicitudesEstadoSolicitud value of the <code>priorizacionSolicitudesEstadoSolicitud</code> attribute.
     * @param priorizacionSolicitudesEstadoDoc value of the <code>priorizacionSolicitudesEstadoDoc</code> attribute.
     */
    public PriorizacionSolicitudesOid(Long priorizacionSolicitudesEstadoSolicitud, Long priorizacionSolicitudesEstadoDoc) {
        this.priorizacionSolicitudesEstadoSolicitud = priorizacionSolicitudesEstadoSolicitud;
        this.priorizacionSolicitudesEstadoDoc = priorizacionSolicitudesEstadoDoc;
    }

    /**
     * Constructor that initializes the attributes values in the List.
     * 
     * @param col is an ArrayList with the attribute values.
     */
    public PriorizacionSolicitudesOid(List<Object> col) {
        this.priorizacionSolicitudesEstadoSolicitud = (Long) col.get(0);
        this.priorizacionSolicitudesEstadoDoc = (Long) col.get(1);
    }

    /**
     * Tells whether this OID is null or not.
     * 
     * @return true if this OID is null. False otherwise.
     */
	@Override
    public boolean isNull() {
        boolean nullValue;
        if (priorizacionSolicitudesEstadoSolicitud == null || priorizacionSolicitudesEstadoDoc == null)
            nullValue = true;
        else
            nullValue = false;
        return nullValue;
    }

    /**
     * Gets the value of EstadoSolicitud attribute.
     * 
     * @return the value.
     */
    @JsonIgnore
    public Long getPriorizacionSolicitudesEstadoSolicitud() {
        return priorizacionSolicitudesEstadoSolicitud;
    }

    /**
     * Sets the value of EstadoSolicitud attribute.
     * 
     * @param priorizacionSolicitudesEstadoSolicitud the new value.
     */
    public void setPriorizacionSolicitudesEstadoSolicitud(Long priorizacionSolicitudesEstadoSolicitud) {
        this.priorizacionSolicitudesEstadoSolicitud = priorizacionSolicitudesEstadoSolicitud;
    }
    /**
     * Gets the value of EstadoDoc attribute.
     * 
     * @return the value.
     */
    @JsonIgnore
    public Long getPriorizacionSolicitudesEstadoDoc() {
        return priorizacionSolicitudesEstadoDoc;
    }

    /**
     * Sets the value of EstadoDoc attribute.
     * 
     * @param priorizacionSolicitudesEstadoDoc the new value.
     */
    public void setPriorizacionSolicitudesEstadoDoc(Long priorizacionSolicitudesEstadoDoc) {
        this.priorizacionSolicitudesEstadoDoc = priorizacionSolicitudesEstadoDoc;
    }

    /**
     * Provides a unique hashcode for the instance.
     * 
     * @return hashcode representing this instance.
     */
	@Override
    public int hashCode() {
        try {
            return priorizacionSolicitudesEstadoSolicitud.hashCode() + priorizacionSolicitudesEstadoDoc.hashCode();
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
        } else if (!(obj instanceof PriorizacionSolicitudesOid)) {
            returnValue = false;
        } else {
            PriorizacionSolicitudesOid oid = (PriorizacionSolicitudesOid) obj;
            if (oid == this) {
                returnValue = true;
            } else {
                returnValue = Utilities.isEqual(oid.priorizacionSolicitudesEstadoSolicitud, priorizacionSolicitudesEstadoSolicitud) && Utilities.isEqual(oid.priorizacionSolicitudesEstadoDoc, priorizacionSolicitudesEstadoDoc);
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
        return "[priorizacionSolicitudesEstadoSolicitud=" + priorizacionSolicitudesEstadoSolicitud + ", priorizacionSolicitudesEstadoDoc=" + priorizacionSolicitudesEstadoDoc + "]";
    }



    /**
     * Returns the values of the fields composing the OID in an array.
     * 
     * @return an array with the values of the OID fields.
     */
	@Override
    public Object[] getValue() {
        Object[] values = new Object[2];
        values[0] = priorizacionSolicitudesEstadoSolicitud;
        values[1] = priorizacionSolicitudesEstadoDoc;
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
        values[0] = PriorizacionSolicitudesConstants.ATTR_NAME_PRIORIZACIONSOLICITUDESESTADOSOLICITUD;
        values[1] = PriorizacionSolicitudesConstants.ATTR_NAME_PRIORIZACIONSOLICITUDESESTADODOC;
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
        dataTypes[0] = Constants.Type.INT.getTypeName();
        dataTypes[1] = Constants.Type.NAT.getTypeName();
        return dataTypes;
    }

    /**
     * Returns the definition class of this OID.
     * 
     * @return Name of the definition class of this OID.
     */
	@Override
    public String getDefinitionClass() {
        return PriorizacionSolicitudesConstants.CLASS_NAME;
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
        PriorizacionSolicitudesOid candidateOID = null;
        try {
            candidateOID = new PriorizacionSolicitudesOid((Long) instance[0], (Long) instance[1]);
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            hasError = true;
        }
        if (!hasError && candidateOID != null && !(candidateOID.isNull())) {
            returnValue = this.equals(candidateOID);
        }
        return returnValue;
    }

    public PriorizacionSolicitudesOid fromJsonString(String jsonString) {
        ObjectMapper mapper = new ObjectMapper();
        PriorizacionSolicitudesOid temp;
        try {
            temp = jsonString != null && !jsonString.isEmpty() ? mapper.readValue(jsonString, PriorizacionSolicitudesOid.class) : null;
        } catch (Exception e) {
            temp = null;
        }
        if (temp != null) {
            this.priorizacionSolicitudesEstadoSolicitud = temp.priorizacionSolicitudesEstadoSolicitud;
            this.priorizacionSolicitudesEstadoDoc = temp.priorizacionSolicitudesEstadoDoc;
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
