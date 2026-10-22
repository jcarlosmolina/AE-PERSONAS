package com.keralty.aepersonas.persistence.oid;

import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.utils.Utilities;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import com.keralty.aepersonas.global.ObsEstadoConstants;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Embeddable
public class ObsEstadoOid implements IOid {

    private static final long serialVersionUID = 1L;

    /** Identification function field Identificador **/
    @Column(name=ObsEstadoConstants.FLD_DOCUMENTOGIDENTIFICADOR)
    @JsonProperty(value = "identificador")
    private Long documentoGIdentificador;
    /** Identification function field Id **/
    @Column(name=ObsEstadoConstants.FLD_OBSESTADOID)
    @JsonProperty(value = "id")
    private Long obsEstadoId;

    /** Default constructor. **/
    public ObsEstadoOid() {
        // Default constructor
    }

    /**
     * Constructor that initializes the attributes values.
     * 
     * @param documentoGIdentificador value of the <code>documentoGIdentificador</code> attribute.
     * @param obsEstadoId value of the <code>obsEstadoId</code> attribute.
     */
    public ObsEstadoOid(Long documentoGIdentificador, Long obsEstadoId) {
        this.documentoGIdentificador = documentoGIdentificador;
        this.obsEstadoId = obsEstadoId;
    }

    /**
     * Constructor that initializes the attributes values in the List.
     * 
     * @param col is an ArrayList with the attribute values.
     */
    public ObsEstadoOid(List<Object> col) {
        this.documentoGIdentificador = (Long) col.get(0);
        this.obsEstadoId = (Long) col.get(1);
    }

    /**
     * Constructor that initializes the attributes values from the identifiers of the related instances.
     * @param documentogOID the OID of <code>DocumentoG</code>
     * @param Id value of the <code>Id</code> attribute
     */
    public ObsEstadoOid(DocumentoGOid documentogOID, java.lang.Long Id) {
        this.documentoGIdentificador = documentogOID.getDocumentoGIdentificador();
        this.obsEstadoId = Id;
    }

    /**
     * Tells whether this OID is null or not.
     * 
     * @return true if this OID is null. False otherwise.
     */
	@Override
    public boolean isNull() {
        boolean nullValue;
        if (documentoGIdentificador == null || obsEstadoId == null)
            nullValue = true;
        else
            nullValue = false;
        return nullValue;
    }

    /**
     * Gets the value of Identificador attribute.
     * 
     * @return the value.
     */
    @JsonIgnore
    public Long getDocumentoGIdentificador() {
        return documentoGIdentificador;
    }

    /**
     * Sets the value of Identificador attribute.
     * 
     * @param documentoGIdentificador the new value.
     */
    public void setDocumentoGIdentificador(Long documentoGIdentificador) {
        this.documentoGIdentificador = documentoGIdentificador;
    }
    /**
     * Gets the value of Id attribute.
     * 
     * @return the value.
     */
    @JsonIgnore
    public Long getObsEstadoId() {
        return obsEstadoId;
    }

    /**
     * Sets the value of Id attribute.
     * 
     * @param obsEstadoId the new value.
     */
    public void setObsEstadoId(Long obsEstadoId) {
        this.obsEstadoId = obsEstadoId;
    }

    /**
     * Provides a unique hashcode for the instance.
     * 
     * @return hashcode representing this instance.
     */
	@Override
    public int hashCode() {
        try {
            return documentoGIdentificador.hashCode() + obsEstadoId.hashCode();
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
        } else if (!(obj instanceof ObsEstadoOid)) {
            returnValue = false;
        } else {
            ObsEstadoOid oid = (ObsEstadoOid) obj;
            if (oid == this) {
                returnValue = true;
            } else {
                returnValue = Utilities.isEqual(oid.documentoGIdentificador, documentoGIdentificador) && Utilities.isEqual(oid.obsEstadoId, obsEstadoId);
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
        return "[documentoGIdentificador=" + documentoGIdentificador + ", obsEstadoId=" + obsEstadoId + "]";
    }



    /**
     * Returns the values of the fields composing the OID in an array.
     * 
     * @return an array with the values of the OID fields.
     */
	@Override
    public Object[] getValue() {
        Object[] values = new Object[2];
        values[0] = documentoGIdentificador;
        values[1] = obsEstadoId;
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
        values[0] = ObsEstadoConstants.ATTR_NAME_DOCUMENTOG_DOCUMENTOGIDENTIFICADOR;
        values[1] = ObsEstadoConstants.ATTR_NAME_OBSESTADOID;
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
        return ObsEstadoConstants.CLASS_NAME;
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
        ObsEstadoOid candidateOID = null;
        try {
            candidateOID = new ObsEstadoOid((Long) instance[0], (Long) instance[1]);
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            hasError = true;
        }
        if (!hasError && candidateOID != null && !(candidateOID.isNull())) {
            returnValue = this.equals(candidateOID);
        }
        return returnValue;
    }

    public ObsEstadoOid fromJsonString(String jsonString) {
        ObjectMapper mapper = new ObjectMapper();
        ObsEstadoOid temp;
        try {
            temp = jsonString != null && !jsonString.isEmpty() ? mapper.readValue(jsonString, ObsEstadoOid.class) : null;
        } catch (Exception e) {
            temp = null;
        }
        if (temp != null) {
            this.documentoGIdentificador = temp.documentoGIdentificador;
            this.obsEstadoId = temp.obsEstadoId;
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
