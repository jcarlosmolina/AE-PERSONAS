package com.keralty.aepersonas.persistence.oid;

import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.utils.Utilities;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import com.keralty.aepersonas.global.ProteccionDatosCConstants;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Embeddable
public class ProteccionDatosCOid implements IOid {

    private static final long serialVersionUID = 1L;

    /** Identification function field ID **/
    @Column(name=ProteccionDatosCConstants.FLD_PERSONACID)
    @JsonProperty(value = "id")
    private Long personaCID;
    /** Identification function field Producto **/
    @Column(name=ProteccionDatosCConstants.FLD_PRODUCTOSPRODUCTO)
    @JsonProperty(value = "producto")
    private Long productosProducto;
    /** Identification function field Codigo **/
    @Column(name=ProteccionDatosCConstants.FLD_PROTECCIONDATOSCCODIGO)
    @JsonProperty(value = "codigo")
    private Long proteccionDatosCCodigo;

    /** Default constructor. **/
    public ProteccionDatosCOid() {
        // Default constructor
    }

    /**
     * Constructor that initializes the attributes values.
     * 
     * @param personaCID value of the <code>personaCID</code> attribute.
     * @param productosProducto value of the <code>productosProducto</code> attribute.
     * @param proteccionDatosCCodigo value of the <code>proteccionDatosCCodigo</code> attribute.
     */
    public ProteccionDatosCOid(Long personaCID, Long productosProducto, Long proteccionDatosCCodigo) {
        this.personaCID = personaCID;
        this.productosProducto = productosProducto;
        this.proteccionDatosCCodigo = proteccionDatosCCodigo;
    }

    /**
     * Constructor that initializes the attributes values in the List.
     * 
     * @param col is an ArrayList with the attribute values.
     */
    public ProteccionDatosCOid(List<Object> col) {
        this.personaCID = (Long) col.get(0);
        this.productosProducto = (Long) col.get(1);
        this.proteccionDatosCCodigo = (Long) col.get(2);
    }

    /**
     * Constructor that initializes the attributes values from the identifiers of the related instances.
     * @param personacOID the OID of <code>PersonaC</code>
     * @param productocOID the OID of <code>Productos</code>
     * @param Codigo value of the <code>Codigo</code> attribute
     */
    public ProteccionDatosCOid(PersonaCOid personacOID, ProductosOid productocOID, java.lang.Long Codigo) {
        this.personaCID = personacOID.getPersonaCID();
        this.productosProducto = productocOID.getProductosProducto();
        this.proteccionDatosCCodigo = Codigo;
    }

    /**
     * Tells whether this OID is null or not.
     * 
     * @return true if this OID is null. False otherwise.
     */
	@Override
    public boolean isNull() {
        boolean nullValue;
        if (personaCID == null || productosProducto == null || proteccionDatosCCodigo == null)
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
     * Gets the value of Producto attribute.
     * 
     * @return the value.
     */
    @JsonIgnore
    public Long getProductosProducto() {
        return productosProducto;
    }

    /**
     * Sets the value of Producto attribute.
     * 
     * @param productosProducto the new value.
     */
    public void setProductosProducto(Long productosProducto) {
        this.productosProducto = productosProducto;
    }
    /**
     * Gets the value of Codigo attribute.
     * 
     * @return the value.
     */
    @JsonIgnore
    public Long getProteccionDatosCCodigo() {
        return proteccionDatosCCodigo;
    }

    /**
     * Sets the value of Codigo attribute.
     * 
     * @param proteccionDatosCCodigo the new value.
     */
    public void setProteccionDatosCCodigo(Long proteccionDatosCCodigo) {
        this.proteccionDatosCCodigo = proteccionDatosCCodigo;
    }

    /**
     * Provides a unique hashcode for the instance.
     * 
     * @return hashcode representing this instance.
     */
	@Override
    public int hashCode() {
        try {
            return personaCID.hashCode() + productosProducto.hashCode() + proteccionDatosCCodigo.hashCode();
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
        } else if (!(obj instanceof ProteccionDatosCOid)) {
            returnValue = false;
        } else {
            ProteccionDatosCOid oid = (ProteccionDatosCOid) obj;
            if (oid == this) {
                returnValue = true;
            } else {
                returnValue = Utilities.isEqual(oid.personaCID, personaCID) && Utilities.isEqual(oid.productosProducto, productosProducto) && Utilities.isEqual(oid.proteccionDatosCCodigo, proteccionDatosCCodigo);
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
        return "[personaCID=" + personaCID + ", productosProducto=" + productosProducto + ", proteccionDatosCCodigo=" + proteccionDatosCCodigo + "]";
    }



    /**
     * Returns the values of the fields composing the OID in an array.
     * 
     * @return an array with the values of the OID fields.
     */
	@Override
    public Object[] getValue() {
        Object[] values = new Object[3];
        values[0] = personaCID;
        values[1] = productosProducto;
        values[2] = proteccionDatosCCodigo;
        return values;
    }

    /**
     * Returns the name of the fields composing the OID in an array.
     * 
     * @return an array with the names of the OID fields.
     */
	@Override
    public String[] getKeys() {
        String[] values = new String[3];
        values[0] = ProteccionDatosCConstants.ATTR_NAME_PERSONAC_PERSONACID;
        values[1] = ProteccionDatosCConstants.ATTR_NAME_PRODUCTOC_PRODUCTOSPRODUCTO;
        values[2] = ProteccionDatosCConstants.ATTR_NAME_PROTECCIONDATOSCCODIGO;
        return values;
    }

    /**
     * Returns the types of the fields composing the OID in an array.
     * 
     * @return an array with the types of the OID fields.
     */
	@Override
    public String[] getDataTypes() {
        String[] dataTypes = new String[3];
        dataTypes[0] = Constants.Type.AUTONUMERIC.getTypeName();
        dataTypes[1] = Constants.Type.INT.getTypeName();
        dataTypes[2] = Constants.Type.INT.getTypeName();
        return dataTypes;
    }

    /**
     * Returns the definition class of this OID.
     * 
     * @return Name of the definition class of this OID.
     */
	@Override
    public String getDefinitionClass() {
        return ProteccionDatosCConstants.CLASS_NAME;
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
        ProteccionDatosCOid candidateOID = null;
        try {
            candidateOID = new ProteccionDatosCOid((Long) instance[0], (Long) instance[1], (Long) instance[2]);
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            hasError = true;
        }
        if (!hasError && candidateOID != null && !(candidateOID.isNull())) {
            returnValue = this.equals(candidateOID);
        }
        return returnValue;
    }

    public ProteccionDatosCOid fromJsonString(String jsonString) {
        ObjectMapper mapper = new ObjectMapper();
        ProteccionDatosCOid temp;
        try {
            temp = jsonString != null && !jsonString.isEmpty() ? mapper.readValue(jsonString, ProteccionDatosCOid.class) : null;
        } catch (Exception e) {
            temp = null;
        }
        if (temp != null) {
            this.personaCID = temp.personaCID;
            this.productosProducto = temp.productosProducto;
            this.proteccionDatosCCodigo = temp.proteccionDatosCCodigo;
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
