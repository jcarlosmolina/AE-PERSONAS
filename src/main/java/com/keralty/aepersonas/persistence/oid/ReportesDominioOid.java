package com.keralty.aepersonas.persistence.oid;

import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.utils.Utilities;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import com.keralty.aepersonas.global.ReportesDominioConstants;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Embeddable
public class ReportesDominioOid implements IOid {

    private static final long serialVersionUID = 1L;

    /** Identification function field Numero **/
    @Column(name=ReportesDominioConstants.FLD_DOMINIONUMERO)
    @JsonProperty(value = "numero")
    private Long dominioNumero;
    /** Identification function field id_PlantillaReporte **/
    @Column(name=ReportesDominioConstants.FLD_PLANTILLAREPORTEIDPLANTILLAREPORTE)
    @JsonProperty(value = "id_plantillareporte")
    private Long plantillaReporteidPlantillaReporte;

    /** Default constructor. **/
    public ReportesDominioOid() {
        // Default constructor
    }

    /**
     * Constructor that initializes the attributes values.
     * 
     * @param dominioNumero value of the <code>dominioNumero</code> attribute.
     * @param plantillaReporteidPlantillaReporte value of the <code>plantillaReporteidPlantillaReporte</code> attribute.
     */
    public ReportesDominioOid(Long dominioNumero, Long plantillaReporteidPlantillaReporte) {
        this.dominioNumero = dominioNumero;
        this.plantillaReporteidPlantillaReporte = plantillaReporteidPlantillaReporte;
    }

    /**
     * Constructor that initializes the attributes values in the List.
     * 
     * @param col is an ArrayList with the attribute values.
     */
    public ReportesDominioOid(List<Object> col) {
        this.dominioNumero = (Long) col.get(0);
        this.plantillaReporteidPlantillaReporte = (Long) col.get(1);
    }

    /**
     * Constructor that initializes the attributes values from the identifiers of the related instances.
     * @param dominioOID the OID of <code>Dominio</code>
     * @param plantillareporteOID the OID of <code>PlantillaReporte</code>
     */
    public ReportesDominioOid(DominioOid dominioOID, PlantillaReporteOid plantillareporteOID) {
        this.dominioNumero = dominioOID.getDominioNumero();
        this.plantillaReporteidPlantillaReporte = plantillareporteOID.getPlantillaReporteidPlantillaReporte();
    }

    /**
     * Tells whether this OID is null or not.
     * 
     * @return true if this OID is null. False otherwise.
     */
	@Override
    public boolean isNull() {
        boolean nullValue;
        if (dominioNumero == null || plantillaReporteidPlantillaReporte == null)
            nullValue = true;
        else
            nullValue = false;
        return nullValue;
    }

    /**
     * Gets the value of Numero attribute.
     * 
     * @return the value.
     */
    @JsonIgnore
    public Long getDominioNumero() {
        return dominioNumero;
    }

    /**
     * Sets the value of Numero attribute.
     * 
     * @param dominioNumero the new value.
     */
    public void setDominioNumero(Long dominioNumero) {
        this.dominioNumero = dominioNumero;
    }
    /**
     * Gets the value of id_PlantillaReporte attribute.
     * 
     * @return the value.
     */
    @JsonIgnore
    public Long getPlantillaReporteidPlantillaReporte() {
        return plantillaReporteidPlantillaReporte;
    }

    /**
     * Sets the value of id_PlantillaReporte attribute.
     * 
     * @param plantillaReporteidPlantillaReporte the new value.
     */
    public void setPlantillaReporteidPlantillaReporte(Long plantillaReporteidPlantillaReporte) {
        this.plantillaReporteidPlantillaReporte = plantillaReporteidPlantillaReporte;
    }

    /**
     * Provides a unique hashcode for the instance.
     * 
     * @return hashcode representing this instance.
     */
	@Override
    public int hashCode() {
        try {
            return dominioNumero.hashCode() + plantillaReporteidPlantillaReporte.hashCode();
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
        } else if (!(obj instanceof ReportesDominioOid)) {
            returnValue = false;
        } else {
            ReportesDominioOid oid = (ReportesDominioOid) obj;
            if (oid == this) {
                returnValue = true;
            } else {
                returnValue = Utilities.isEqual(oid.dominioNumero, dominioNumero) && Utilities.isEqual(oid.plantillaReporteidPlantillaReporte, plantillaReporteidPlantillaReporte);
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
        return "[dominioNumero=" + dominioNumero + ", plantillaReporteidPlantillaReporte=" + plantillaReporteidPlantillaReporte + "]";
    }



    /**
     * Returns the values of the fields composing the OID in an array.
     * 
     * @return an array with the values of the OID fields.
     */
	@Override
    public Object[] getValue() {
        Object[] values = new Object[2];
        values[0] = dominioNumero;
        values[1] = plantillaReporteidPlantillaReporte;
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
        values[0] = ReportesDominioConstants.ATTR_NAME_DOMINIO_DOMINIONUMERO;
        values[1] = ReportesDominioConstants.ATTR_NAME_PLANTILLAREPORTE_PLANTILLAREPORTEIDPLANTILLAREPORTE;
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
        return ReportesDominioConstants.CLASS_NAME;
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
        ReportesDominioOid candidateOID = null;
        try {
            candidateOID = new ReportesDominioOid((Long) instance[0], (Long) instance[1]);
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            hasError = true;
        }
        if (!hasError && candidateOID != null && !(candidateOID.isNull())) {
            returnValue = this.equals(candidateOID);
        }
        return returnValue;
    }

    public ReportesDominioOid fromJsonString(String jsonString) {
        ObjectMapper mapper = new ObjectMapper();
        ReportesDominioOid temp;
        try {
            temp = jsonString != null && !jsonString.isEmpty() ? mapper.readValue(jsonString, ReportesDominioOid.class) : null;
        } catch (Exception e) {
            temp = null;
        }
        if (temp != null) {
            this.dominioNumero = temp.dominioNumero;
            this.plantillaReporteidPlantillaReporte = temp.plantillaReporteidPlantillaReporte;
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
