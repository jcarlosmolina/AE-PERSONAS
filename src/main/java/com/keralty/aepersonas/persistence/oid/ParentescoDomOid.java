package com.keralty.aepersonas.persistence.oid;

import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.utils.Utilities;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import com.keralty.aepersonas.global.ParentescoDomConstants;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Embeddable
public class ParentescoDomOid implements IOid {

    private static final long serialVersionUID = 1L;

    /** Identification function field Numero **/
    @Column(name=ParentescoDomConstants.FLD_DOMINIONUMERO)
    @JsonProperty(value = "numero")
    private Long dominioNumero;
    /** Identification function field Identificador **/
    @Column(name=ParentescoDomConstants.FLD_PARENTESCODOMIDENTIFICADOR)
    @JsonProperty(value = "identificador")
    private Long parentescoDomIdentificador;

    /** Default constructor. **/
    public ParentescoDomOid() {
        // Default constructor
    }

    /**
     * Constructor that initializes the attributes values.
     * 
     * @param dominioNumero value of the <code>dominioNumero</code> attribute.
     * @param parentescoDomIdentificador value of the <code>parentescoDomIdentificador</code> attribute.
     */
    public ParentescoDomOid(Long dominioNumero, Long parentescoDomIdentificador) {
        this.dominioNumero = dominioNumero;
        this.parentescoDomIdentificador = parentescoDomIdentificador;
    }

    /**
     * Constructor that initializes the attributes values in the List.
     * 
     * @param col is an ArrayList with the attribute values.
     */
    public ParentescoDomOid(List<Object> col) {
        this.dominioNumero = (Long) col.get(0);
        this.parentescoDomIdentificador = (Long) col.get(1);
    }

    /**
     * Constructor that initializes the attributes values from the identifiers of the related instances.
     * @param dominioOID the OID of <code>Dominio</code>
     * @param Identificador value of the <code>Identificador</code> attribute
     */
    public ParentescoDomOid(DominioOid dominioOID, java.lang.Long Identificador) {
        this.dominioNumero = dominioOID.getDominioNumero();
        this.parentescoDomIdentificador = Identificador;
    }

    /**
     * Tells whether this OID is null or not.
     * 
     * @return true if this OID is null. False otherwise.
     */
	@Override
    public boolean isNull() {
        boolean nullValue;
        if (dominioNumero == null || parentescoDomIdentificador == null)
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
     * Gets the value of Identificador attribute.
     * 
     * @return the value.
     */
    @JsonIgnore
    public Long getParentescoDomIdentificador() {
        return parentescoDomIdentificador;
    }

    /**
     * Sets the value of Identificador attribute.
     * 
     * @param parentescoDomIdentificador the new value.
     */
    public void setParentescoDomIdentificador(Long parentescoDomIdentificador) {
        this.parentescoDomIdentificador = parentescoDomIdentificador;
    }

    /**
     * Provides a unique hashcode for the instance.
     * 
     * @return hashcode representing this instance.
     */
	@Override
    public int hashCode() {
        try {
            return dominioNumero.hashCode() + parentescoDomIdentificador.hashCode();
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
        } else if (!(obj instanceof ParentescoDomOid)) {
            returnValue = false;
        } else {
            ParentescoDomOid oid = (ParentescoDomOid) obj;
            if (oid == this) {
                returnValue = true;
            } else {
                returnValue = Utilities.isEqual(oid.dominioNumero, dominioNumero) && Utilities.isEqual(oid.parentescoDomIdentificador, parentescoDomIdentificador);
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
        return "[dominioNumero=" + dominioNumero + ", parentescoDomIdentificador=" + parentescoDomIdentificador + "]";
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
        values[1] = parentescoDomIdentificador;
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
        values[0] = ParentescoDomConstants.ATTR_NAME_DOMINIO_DOMINIONUMERO;
        values[1] = ParentescoDomConstants.ATTR_NAME_PARENTESCODOMIDENTIFICADOR;
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
        return ParentescoDomConstants.CLASS_NAME;
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
        ParentescoDomOid candidateOID = null;
        try {
            candidateOID = new ParentescoDomOid((Long) instance[0], (Long) instance[1]);
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            hasError = true;
        }
        if (!hasError && candidateOID != null && !(candidateOID.isNull())) {
            returnValue = this.equals(candidateOID);
        }
        return returnValue;
    }

    public ParentescoDomOid fromJsonString(String jsonString) {
        ObjectMapper mapper = new ObjectMapper();
        ParentescoDomOid temp;
        try {
            temp = jsonString != null && !jsonString.isEmpty() ? mapper.readValue(jsonString, ParentescoDomOid.class) : null;
        } catch (Exception e) {
            temp = null;
        }
        if (temp != null) {
            this.dominioNumero = temp.dominioNumero;
            this.parentescoDomIdentificador = temp.parentescoDomIdentificador;
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
