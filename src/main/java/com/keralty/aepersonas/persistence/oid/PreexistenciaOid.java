package com.keralty.aepersonas.persistence.oid;

import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.utils.Utilities;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import com.keralty.aepersonas.global.PreexistenciaConstants;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Embeddable
public class PreexistenciaOid implements IOid {

    private static final long serialVersionUID = 1L;

    /** Identification function field id_solicitud **/
    @Column(name=PreexistenciaConstants.FLD_AESOLICITUDESIDSOLICITUD)
    @JsonProperty(value = "id_solicitud")
    private Long aesolicitudesidsolicitud;
    /** Identification function field Identificador **/
    @Column(name=PreexistenciaConstants.FLD_USUARIOUSUARIOIDENTIFICADOR)
    @JsonProperty(value = "usuario_identificador")
    private Long usuarioUsuarioIdentificador;
    /** Identification function field Identificador **/
    @Column(name=PreexistenciaConstants.FLD_PREEXISTENCIAIDENTIFICADOR)
    @JsonProperty(value = "identificador")
    private Long preexistenciaIdentificador;

    /** Default constructor. **/
    public PreexistenciaOid() {
        // Default constructor
    }

    /**
     * Constructor that initializes the attributes values.
     * 
     * @param aesolicitudesidsolicitud value of the <code>aesolicitudesidsolicitud</code> attribute.
     * @param usuarioUsuarioIdentificador value of the <code>usuarioUsuarioIdentificador</code> attribute.
     * @param preexistenciaIdentificador value of the <code>preexistenciaIdentificador</code> attribute.
     */
    public PreexistenciaOid(Long aesolicitudesidsolicitud, Long usuarioUsuarioIdentificador, Long preexistenciaIdentificador) {
        this.aesolicitudesidsolicitud = aesolicitudesidsolicitud;
        this.usuarioUsuarioIdentificador = usuarioUsuarioIdentificador;
        this.preexistenciaIdentificador = preexistenciaIdentificador;
    }

    /**
     * Constructor that initializes the attributes values in the List.
     * 
     * @param col is an ArrayList with the attribute values.
     */
    public PreexistenciaOid(List<Object> col) {
        this.aesolicitudesidsolicitud = (Long) col.get(0);
        this.usuarioUsuarioIdentificador = (Long) col.get(1);
        this.preexistenciaIdentificador = (Long) col.get(2);
    }

    /**
     * Constructor that initializes the attributes values from the identifiers of the related instances.
     * @param usuarioOID the OID of <code>Usuario</code>
     * @param Identificador value of the <code>Identificador</code> attribute
     */
    public PreexistenciaOid(UsuarioOid usuarioOID, java.lang.Long Identificador) {
        this.aesolicitudesidsolicitud = usuarioOID.getAesolicitudesidsolicitud();
        this.usuarioUsuarioIdentificador = usuarioOID.getUsuarioIdentificador();
        this.preexistenciaIdentificador = Identificador;
    }

    /**
     * Tells whether this OID is null or not.
     * 
     * @return true if this OID is null. False otherwise.
     */
	@Override
    public boolean isNull() {
        boolean nullValue;
        if (aesolicitudesidsolicitud == null || usuarioUsuarioIdentificador == null || preexistenciaIdentificador == null)
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
    public Long getUsuarioUsuarioIdentificador() {
        return usuarioUsuarioIdentificador;
    }

    /**
     * Sets the value of Identificador attribute.
     * 
     * @param usuarioUsuarioIdentificador the new value.
     */
    public void setUsuarioUsuarioIdentificador(Long usuarioUsuarioIdentificador) {
        this.usuarioUsuarioIdentificador = usuarioUsuarioIdentificador;
    }
    /**
     * Gets the value of Identificador attribute.
     * 
     * @return the value.
     */
    @JsonIgnore
    public Long getPreexistenciaIdentificador() {
        return preexistenciaIdentificador;
    }

    /**
     * Sets the value of Identificador attribute.
     * 
     * @param preexistenciaIdentificador the new value.
     */
    public void setPreexistenciaIdentificador(Long preexistenciaIdentificador) {
        this.preexistenciaIdentificador = preexistenciaIdentificador;
    }

    /**
     * Provides a unique hashcode for the instance.
     * 
     * @return hashcode representing this instance.
     */
	@Override
    public int hashCode() {
        try {
            return aesolicitudesidsolicitud.hashCode() + usuarioUsuarioIdentificador.hashCode() + preexistenciaIdentificador.hashCode();
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
        } else if (!(obj instanceof PreexistenciaOid)) {
            returnValue = false;
        } else {
            PreexistenciaOid oid = (PreexistenciaOid) obj;
            if (oid == this) {
                returnValue = true;
            } else {
                returnValue = Utilities.isEqual(oid.aesolicitudesidsolicitud, aesolicitudesidsolicitud) && Utilities.isEqual(oid.usuarioUsuarioIdentificador, usuarioUsuarioIdentificador) && Utilities.isEqual(oid.preexistenciaIdentificador, preexistenciaIdentificador);
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
        return "[aesolicitudesidsolicitud=" + aesolicitudesidsolicitud + ", usuarioUsuarioIdentificador=" + usuarioUsuarioIdentificador + ", preexistenciaIdentificador=" + preexistenciaIdentificador + "]";
    }



    /**
     * Returns the values of the fields composing the OID in an array.
     * 
     * @return an array with the values of the OID fields.
     */
	@Override
    public Object[] getValue() {
        Object[] values = new Object[3];
        values[0] = aesolicitudesidsolicitud;
        values[1] = usuarioUsuarioIdentificador;
        values[2] = preexistenciaIdentificador;
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
        values[0] = PreexistenciaConstants.ATTR_NAME_USUARIO_SOLICITUD_AE_SOLICITUDES_AESOLICITUDESIDSOLICITUD;
        values[1] = PreexistenciaConstants.ATTR_NAME_USUARIO_USUARIOIDENTIFICADOR;
        values[2] = PreexistenciaConstants.ATTR_NAME_PREEXISTENCIAIDENTIFICADOR;
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
        dataTypes[1] = Constants.Type.AUTONUMERIC.getTypeName();
        dataTypes[2] = Constants.Type.AUTONUMERIC.getTypeName();
        return dataTypes;
    }

    /**
     * Returns the definition class of this OID.
     * 
     * @return Name of the definition class of this OID.
     */
	@Override
    public String getDefinitionClass() {
        return PreexistenciaConstants.CLASS_NAME;
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
        PreexistenciaOid candidateOID = null;
        try {
            candidateOID = new PreexistenciaOid((Long) instance[0], (Long) instance[1], (Long) instance[2]);
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            hasError = true;
        }
        if (!hasError && candidateOID != null && !(candidateOID.isNull())) {
            returnValue = this.equals(candidateOID);
        }
        return returnValue;
    }

    public PreexistenciaOid fromJsonString(String jsonString) {
        ObjectMapper mapper = new ObjectMapper();
        PreexistenciaOid temp;
        try {
            temp = jsonString != null && !jsonString.isEmpty() ? mapper.readValue(jsonString, PreexistenciaOid.class) : null;
        } catch (Exception e) {
            temp = null;
        }
        if (temp != null) {
            this.aesolicitudesidsolicitud = temp.aesolicitudesidsolicitud;
            this.usuarioUsuarioIdentificador = temp.usuarioUsuarioIdentificador;
            this.preexistenciaIdentificador = temp.preexistenciaIdentificador;
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
