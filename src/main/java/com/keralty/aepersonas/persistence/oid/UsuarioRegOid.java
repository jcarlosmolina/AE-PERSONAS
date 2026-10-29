package com.keralty.aepersonas.persistence.oid;

import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.utils.Utilities;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import com.keralty.aepersonas.global.UsuarioRegConstants;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Embeddable
public class UsuarioRegOid implements IOid {

    private static final long serialVersionUID = 1L;

    /** Identification function field id_solicitud **/
    @Column(name=UsuarioRegConstants.FLD_AESOLICITUDESIDSOLICITUD)
    @JsonProperty(value = "id_solicitud")
    private Long aesolicitudesidsolicitud;
    /** Identification function field Identificador **/
    @Column(name=UsuarioRegConstants.FLD_USUARIOREGIDENTIFICADOR)
    @JsonProperty(value = "identificador")
    private Long usuarioRegIdentificador;

    /** Default constructor. **/
    public UsuarioRegOid() {
        // Default constructor
    }

    /**
     * Constructor that initializes the attributes values.
     * 
     * @param aesolicitudesidsolicitud value of the <code>aesolicitudesidsolicitud</code> attribute.
     * @param usuarioRegIdentificador value of the <code>usuarioRegIdentificador</code> attribute.
     */
    public UsuarioRegOid(Long aesolicitudesidsolicitud, Long usuarioRegIdentificador) {
        this.aesolicitudesidsolicitud = aesolicitudesidsolicitud;
        this.usuarioRegIdentificador = usuarioRegIdentificador;
    }

    /**
     * Constructor that initializes the attributes values in the List.
     * 
     * @param col is an ArrayList with the attribute values.
     */
    public UsuarioRegOid(List<Object> col) {
        this.aesolicitudesidsolicitud = (Long) col.get(0);
        this.usuarioRegIdentificador = (Long) col.get(1);
    }

    /**
     * Constructor that initializes the attributes values from the identifiers of the related instances.
     * @param solicitudOID the OID of <code>Solicitud</code>
     * @param Identificador value of the <code>Identificador</code> attribute
     */
    public UsuarioRegOid(SolicitudOid solicitudOID, java.lang.Long Identificador) {
        this.aesolicitudesidsolicitud = solicitudOID.getAesolicitudesidsolicitud();
        this.usuarioRegIdentificador = Identificador;
    }

    /**
     * Tells whether this OID is null or not.
     * 
     * @return true if this OID is null. False otherwise.
     */
	@Override
    public boolean isNull() {
        boolean nullValue;
        if (aesolicitudesidsolicitud == null || usuarioRegIdentificador == null)
            nullValue = true;
        else
            nullValue = false;
        return nullValue;
    }

    /**
     * Gets the value of id_solicitud attribute.
     * 
     * @return the value.
     */
    @JsonIgnore
    public Long getAesolicitudesidsolicitud() {
        return aesolicitudesidsolicitud;
    }

    /**
     * Sets the value of id_solicitud attribute.
     * 
     * @param aesolicitudesidsolicitud the new value.
     */
    public void setAesolicitudesidsolicitud(Long aesolicitudesidsolicitud) {
        this.aesolicitudesidsolicitud = aesolicitudesidsolicitud;
    }
    /**
     * Gets the value of Identificador attribute.
     * 
     * @return the value.
     */
    @JsonIgnore
    public Long getUsuarioRegIdentificador() {
        return usuarioRegIdentificador;
    }

    /**
     * Sets the value of Identificador attribute.
     * 
     * @param usuarioRegIdentificador the new value.
     */
    public void setUsuarioRegIdentificador(Long usuarioRegIdentificador) {
        this.usuarioRegIdentificador = usuarioRegIdentificador;
    }

    /**
     * Provides a unique hashcode for the instance.
     * 
     * @return hashcode representing this instance.
     */
	@Override
    public int hashCode() {
        try {
            return aesolicitudesidsolicitud.hashCode() + usuarioRegIdentificador.hashCode();
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
        } else if (!(obj instanceof UsuarioRegOid)) {
            returnValue = false;
        } else {
            UsuarioRegOid oid = (UsuarioRegOid) obj;
            if (oid == this) {
                returnValue = true;
            } else {
                returnValue = Utilities.isEqual(oid.aesolicitudesidsolicitud, aesolicitudesidsolicitud) && Utilities.isEqual(oid.usuarioRegIdentificador, usuarioRegIdentificador);
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
        return "[aesolicitudesidsolicitud=" + aesolicitudesidsolicitud + ", usuarioRegIdentificador=" + usuarioRegIdentificador + "]";
    }



    /**
     * Returns the values of the fields composing the OID in an array.
     * 
     * @return an array with the values of the OID fields.
     */
	@Override
    public Object[] getValue() {
        Object[] values = new Object[2];
        values[0] = aesolicitudesidsolicitud;
        values[1] = usuarioRegIdentificador;
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
        values[0] = UsuarioRegConstants.ATTR_NAME_SOLICITUD_AE_SOLICITUDES_AESOLICITUDESIDSOLICITUD;
        values[1] = UsuarioRegConstants.ATTR_NAME_USUARIOREGIDENTIFICADOR;
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
        return UsuarioRegConstants.CLASS_NAME;
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
        UsuarioRegOid candidateOID = null;
        try {
            candidateOID = new UsuarioRegOid((Long) instance[0], (Long) instance[1]);
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            hasError = true;
        }
        if (!hasError && candidateOID != null && !(candidateOID.isNull())) {
            returnValue = this.equals(candidateOID);
        }
        return returnValue;
    }

    public UsuarioRegOid fromJsonString(String jsonString) {
        ObjectMapper mapper = new ObjectMapper();
        UsuarioRegOid temp;
        try {
            temp = jsonString != null && !jsonString.isEmpty() ? mapper.readValue(jsonString, UsuarioRegOid.class) : null;
        } catch (Exception e) {
            temp = null;
        }
        if (temp != null) {
            this.aesolicitudesidsolicitud = temp.aesolicitudesidsolicitud;
            this.usuarioRegIdentificador = temp.usuarioRegIdentificador;
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
