package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.LogLlamadasBHConstants;
import com.keralty.aepersonas.persistence.oid.LogLlamadasBHOid;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Persistent representation of the <code>LogLlamadasBH</code> model class.
 * <p>
 * Model Class: <code>LogLlamadasBH</code><br>
 */
@Entity(name = LogLlamadasBHConstants.CLASS_NAME)
@Table(name = LogLlamadasBHConstants.TBL_NAME)
public class LogLlamadasBH extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LogLlamadasBH_Sequence")
    @SequenceGenerator(name="LogLlamadasBH_Sequence", sequenceName="LogLlamadasBH_Sequence", allocationSize=1)
    @Column(name = LogLlamadasBHConstants.FLD_LOGLLAMADASBHID )
    @JsonProperty(value="id")
    private Long logLlamadasBHID;

    /** Class member attribute. */
    @Column(name = LogLlamadasBHConstants.FLD_LOGLLAMADASBHTIPOSERVICIO )
    @JsonProperty(value="tiposervicio")
    private String logLlamadasBHTipoServicio;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogLlamadasBHTipoServicio;

    /** Class member attribute. */
    @Column(name = LogLlamadasBHConstants.FLD_LOGLLAMADASBHSOLICITUD )
    @JsonProperty(value="solicitud")
    private String logLlamadasBHSolicitud;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogLlamadasBHSolicitud;

    /** Class member attribute. */
    @Column(name = LogLlamadasBHConstants.FLD_LOGLLAMADASBHSERVICIO )
    @JsonProperty(value="servicio")
    private String logLlamadasBHServicio;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogLlamadasBHServicio;

    /** Class member attribute. */
    @Column(name = LogLlamadasBHConstants.FLD_LOGLLAMADASBHCAPACIDAD )
    @JsonProperty(value="capacidad")
    private String logLlamadasBHCapacidad;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogLlamadasBHCapacidad;

    /** Class member attribute. */
    @Column(name = LogLlamadasBHConstants.FLD_LOGLLAMADASBHFECHAHORA )
    @JsonProperty(value="fechahora")
    private Timestamp logLlamadasBHFechaHora;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogLlamadasBHFechaHora;

    /** Class member attribute. */
    @Column(name = LogLlamadasBHConstants.FLD_LOGLLAMADASBHTEXTOERROR )
    @JsonProperty(value="textoerror")
    private String logLlamadasBHTextoError;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogLlamadasBHTextoError;

    @Transient
    @JsonIgnore
    public boolean logLlamadasBHTextoErrorInit = false;

    /** Class member attribute. */
    @Column(name = LogLlamadasBHConstants.FLD_LOGLLAMADASBHTIEMPOEJECUCION )
    @JsonProperty(value="tiempoejecucion")
    private Double logLlamadasBHTiempoEjecucion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogLlamadasBHTiempoEjecucion;

    /** Class member attribute. */
    @Column(name = LogLlamadasBHConstants.FLD_LOGLLAMADASBHPETICION )
    @JsonProperty(value="peticion")
    private String logLlamadasBHPeticion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogLlamadasBHPeticion;

    @Transient
    @JsonIgnore
    public boolean logLlamadasBHPeticionInit = false;

    /** Class member attribute. */
    @Column(name = LogLlamadasBHConstants.FLD_LOGLLAMADASBHRESPUESTA )
    @JsonProperty(value="respuesta")
    private String logLlamadasBHRespuesta;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogLlamadasBHRespuesta;

    @Transient
    @JsonIgnore
    public boolean logLlamadasBHRespuestaInit = false;

    /** Class member attribute. */
    @Column(name = LogLlamadasBHConstants.FLD_LOGLLAMADASBHUSUARIO )
    @JsonProperty(value="usuario")
    private String logLlamadasBHUsuario;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogLlamadasBHUsuario;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public LogLlamadasBH() {
        logLlamadasBHID = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>LogLlamadasBH</code>.
     * @param oid Object Identifier of the instance of <code>LogLlamadasBH</code> to be created.
     * @throws SystemException
     */
    public LogLlamadasBH(LogLlamadasBHOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            logLlamadasBHID = oid.getLogLlamadasBHID();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>logLlamadasBHID</code> attribute<br>in class <code>LogLlamadasBH</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogLlamadasBH</code>
     * @return The value of the <code>logLlamadasBHID</code> attribute<br>in class <code>LogLlamadasBH</code>.
     */
    public Long getLogLlamadasBHID() {
        return logLlamadasBHID;
    }

    /**
     * Sets the value of the <code>logLlamadasBHID</code> attribute<br>in class <code>LogLlamadasBH</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogLlamadasBH</code>
     * @param logLlamadasBHID The new value of the <code>logLlamadasBHID</code> attribute<br>in class <code>LogLlamadasBH</code>.
     */
    public void setLogLlamadasBHID(Long logLlamadasBHID) {
        this.logLlamadasBHID = logLlamadasBHID;
    }

   /**
    * Returns the value of the <code>logLlamadasBHTipoServicio</code> attribute.<br>
    * Model Attribute: <code>logLlamadasBHTipoServicio</code>. Constant String Size=20<br>
    * Comments: Web Service o REST Service<br>
    * @return The value of the <code>logLlamadasBHTipoServicio</code> attribute.
    */

    public String getLogLlamadasBHTipoServicio()  {
    	String value;
        value =  logLlamadasBHTipoServicio;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logLlamadasBHTipoServicio</code> attribute.<br>
    * Model Attribute: <code>logLlamadasBHTipoServicio</code>. Constant String Size=20<br>
    * Comments: Web Service o REST Service<br>
    * @param logLlamadasBHTipoServicio The new value of the <code>logLlamadasBHTipoServicio</code> attribute.
    */
    public void setLogLlamadasBHTipoServicio (String logLlamadasBHTipoServicio) {
        modifiedLogLlamadasBHTipoServicio = true;
        this.logLlamadasBHTipoServicio = logLlamadasBHTipoServicio;
    }

   /**
    * Returns the value of the <code>modifiedLogLlamadasBHTipoServicio</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogLlamadasBHTipoServicio</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogLlamadasBHTipoServicio() {
        return modifiedLogLlamadasBHTipoServicio;
    }

   /**
    * Sets the value of the <code>modifiedLogLlamadasBHTipoServicio</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogLlamadasBHTipoServicio</code>.
    */
    public void setModifiedLogLlamadasBHTipoServicio(boolean modified) {
        this.modifiedLogLlamadasBHTipoServicio = modified;
    }

   /**
    * Returns the value of the <code>logLlamadasBHSolicitud</code> attribute.<br>
    * Model Attribute: <code>logLlamadasBHSolicitud</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>logLlamadasBHSolicitud</code> attribute.
    */

    public String getLogLlamadasBHSolicitud()  {
    	String value;
        value =  logLlamadasBHSolicitud;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logLlamadasBHSolicitud</code> attribute.<br>
    * Model Attribute: <code>logLlamadasBHSolicitud</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param logLlamadasBHSolicitud The new value of the <code>logLlamadasBHSolicitud</code> attribute.
    */
    public void setLogLlamadasBHSolicitud (String logLlamadasBHSolicitud) {
        modifiedLogLlamadasBHSolicitud = true;
        this.logLlamadasBHSolicitud = logLlamadasBHSolicitud;
    }

   /**
    * Returns the value of the <code>modifiedLogLlamadasBHSolicitud</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogLlamadasBHSolicitud</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogLlamadasBHSolicitud() {
        return modifiedLogLlamadasBHSolicitud;
    }

   /**
    * Sets the value of the <code>modifiedLogLlamadasBHSolicitud</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogLlamadasBHSolicitud</code>.
    */
    public void setModifiedLogLlamadasBHSolicitud(boolean modified) {
        this.modifiedLogLlamadasBHSolicitud = modified;
    }

   /**
    * Returns the value of the <code>logLlamadasBHServicio</code> attribute.<br>
    * Model Attribute: <code>logLlamadasBHServicio</code>. Constant String Size=100<br>
    * Comments: <Options>
NUMCOLS=2;
</Options><br>
    * @return The value of the <code>logLlamadasBHServicio</code> attribute.
    */

    public String getLogLlamadasBHServicio()  {
    	String value;
        value =  logLlamadasBHServicio;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logLlamadasBHServicio</code> attribute.<br>
    * Model Attribute: <code>logLlamadasBHServicio</code>. Constant String Size=100<br>
    * Comments: <Options>
NUMCOLS=2;
</Options><br>
    * @param logLlamadasBHServicio The new value of the <code>logLlamadasBHServicio</code> attribute.
    */
    public void setLogLlamadasBHServicio (String logLlamadasBHServicio) {
        modifiedLogLlamadasBHServicio = true;
        this.logLlamadasBHServicio = logLlamadasBHServicio;
    }

   /**
    * Returns the value of the <code>modifiedLogLlamadasBHServicio</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogLlamadasBHServicio</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogLlamadasBHServicio() {
        return modifiedLogLlamadasBHServicio;
    }

   /**
    * Sets the value of the <code>modifiedLogLlamadasBHServicio</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogLlamadasBHServicio</code>.
    */
    public void setModifiedLogLlamadasBHServicio(boolean modified) {
        this.modifiedLogLlamadasBHServicio = modified;
    }

   /**
    * Returns the value of the <code>logLlamadasBHCapacidad</code> attribute.<br>
    * Model Attribute: <code>logLlamadasBHCapacidad</code>. Constant String Size=100<br>
    * Comments: <Options>
NUMCOLS=2;
</Options><br>
    * @return The value of the <code>logLlamadasBHCapacidad</code> attribute.
    */

    public String getLogLlamadasBHCapacidad()  {
    	String value;
        value =  logLlamadasBHCapacidad;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logLlamadasBHCapacidad</code> attribute.<br>
    * Model Attribute: <code>logLlamadasBHCapacidad</code>. Constant String Size=100<br>
    * Comments: <Options>
NUMCOLS=2;
</Options><br>
    * @param logLlamadasBHCapacidad The new value of the <code>logLlamadasBHCapacidad</code> attribute.
    */
    public void setLogLlamadasBHCapacidad (String logLlamadasBHCapacidad) {
        modifiedLogLlamadasBHCapacidad = true;
        this.logLlamadasBHCapacidad = logLlamadasBHCapacidad;
    }

   /**
    * Returns the value of the <code>modifiedLogLlamadasBHCapacidad</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogLlamadasBHCapacidad</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogLlamadasBHCapacidad() {
        return modifiedLogLlamadasBHCapacidad;
    }

   /**
    * Sets the value of the <code>modifiedLogLlamadasBHCapacidad</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogLlamadasBHCapacidad</code>.
    */
    public void setModifiedLogLlamadasBHCapacidad(boolean modified) {
        this.modifiedLogLlamadasBHCapacidad = modified;
    }

   /**
    * Returns the value of the <code>logLlamadasBHFechaHora</code> attribute.<br>
    * Model Attribute: <code>logLlamadasBHFechaHora</code>. Constant DateTime<br>
    * Comments: <br>
    * @return The value of the <code>logLlamadasBHFechaHora</code> attribute.
    */

    public Timestamp getLogLlamadasBHFechaHora()  {
    	Timestamp value;
        value =  logLlamadasBHFechaHora;
        return value;
    }

   /**
    * Sets the value of the <code>logLlamadasBHFechaHora</code> attribute.<br>
    * Model Attribute: <code>logLlamadasBHFechaHora</code>. Constant DateTime<br>
    * Comments: <br>
    * @param logLlamadasBHFechaHora The new value of the <code>logLlamadasBHFechaHora</code> attribute.
    */
    public void setLogLlamadasBHFechaHora (Timestamp logLlamadasBHFechaHora) {
        modifiedLogLlamadasBHFechaHora = true;
        this.logLlamadasBHFechaHora = logLlamadasBHFechaHora;
    }

   /**
    * Returns the value of the <code>modifiedLogLlamadasBHFechaHora</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogLlamadasBHFechaHora</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogLlamadasBHFechaHora() {
        return modifiedLogLlamadasBHFechaHora;
    }

   /**
    * Sets the value of the <code>modifiedLogLlamadasBHFechaHora</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogLlamadasBHFechaHora</code>.
    */
    public void setModifiedLogLlamadasBHFechaHora(boolean modified) {
        this.modifiedLogLlamadasBHFechaHora = modified;
    }

   /**
    * Returns the value of the <code>logLlamadasBHTextoError</code> attribute.<br>
    * Model Attribute: <code>logLlamadasBHTextoError</code>. Constant Text<br>
    * Comments: <br>
    * @return The value of the <code>logLlamadasBHTextoError</code> attribute.
    */

    public String getLogLlamadasBHTextoError()  {
    	String value;
        value =  logLlamadasBHTextoError;
        return value;
    }

   /**
    * Sets the value of the <code>logLlamadasBHTextoError</code> attribute.<br>
    * Model Attribute: <code>logLlamadasBHTextoError</code>. Constant Text<br>
    * Comments: <br>
    * @param logLlamadasBHTextoError The new value of the <code>logLlamadasBHTextoError</code> attribute.
    */
    public void setLogLlamadasBHTextoError (String logLlamadasBHTextoError) {
        this.logLlamadasBHTextoErrorInit = true;
        modifiedLogLlamadasBHTextoError = true;
        this.logLlamadasBHTextoError = logLlamadasBHTextoError;
    }

   /**
    * Returns the value of the <code>modifiedLogLlamadasBHTextoError</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogLlamadasBHTextoError</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogLlamadasBHTextoError() {
        return modifiedLogLlamadasBHTextoError;
    }

   /**
    * Sets the value of the <code>modifiedLogLlamadasBHTextoError</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogLlamadasBHTextoError</code>.
    */
    public void setModifiedLogLlamadasBHTextoError(boolean modified) {
        this.modifiedLogLlamadasBHTextoError = modified;
    }

   /**
    * Returns the value of the <code>logLlamadasBHTiempoEjecucion</code> attribute.<br>
    * Model Attribute: <code>logLlamadasBHTiempoEjecucion</code>. Constant Real<br>
    * Comments: <br>
    * @return The value of the <code>logLlamadasBHTiempoEjecucion</code> attribute.
    */

    public Double getLogLlamadasBHTiempoEjecucion()  {
    	Double value;
        value =  logLlamadasBHTiempoEjecucion;
        return value;
    }

   /**
    * Sets the value of the <code>logLlamadasBHTiempoEjecucion</code> attribute.<br>
    * Model Attribute: <code>logLlamadasBHTiempoEjecucion</code>. Constant Real<br>
    * Comments: <br>
    * @param logLlamadasBHTiempoEjecucion The new value of the <code>logLlamadasBHTiempoEjecucion</code> attribute.
    */
    public void setLogLlamadasBHTiempoEjecucion (Double logLlamadasBHTiempoEjecucion) {
        modifiedLogLlamadasBHTiempoEjecucion = true;
        this.logLlamadasBHTiempoEjecucion = logLlamadasBHTiempoEjecucion;
    }

   /**
    * Returns the value of the <code>modifiedLogLlamadasBHTiempoEjecucion</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogLlamadasBHTiempoEjecucion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogLlamadasBHTiempoEjecucion() {
        return modifiedLogLlamadasBHTiempoEjecucion;
    }

   /**
    * Sets the value of the <code>modifiedLogLlamadasBHTiempoEjecucion</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogLlamadasBHTiempoEjecucion</code>.
    */
    public void setModifiedLogLlamadasBHTiempoEjecucion(boolean modified) {
        this.modifiedLogLlamadasBHTiempoEjecucion = modified;
    }

   /**
    * Returns the value of the <code>logLlamadasBHPeticion</code> attribute.<br>
    * Model Attribute: <code>logLlamadasBHPeticion</code>. Constant Text<br>
    * Comments: <br>
    * @return The value of the <code>logLlamadasBHPeticion</code> attribute.
    */

    public String getLogLlamadasBHPeticion()  {
    	String value;
        value =  logLlamadasBHPeticion;
        return value;
    }

   /**
    * Sets the value of the <code>logLlamadasBHPeticion</code> attribute.<br>
    * Model Attribute: <code>logLlamadasBHPeticion</code>. Constant Text<br>
    * Comments: <br>
    * @param logLlamadasBHPeticion The new value of the <code>logLlamadasBHPeticion</code> attribute.
    */
    public void setLogLlamadasBHPeticion (String logLlamadasBHPeticion) {
        this.logLlamadasBHPeticionInit = true;
        modifiedLogLlamadasBHPeticion = true;
        this.logLlamadasBHPeticion = logLlamadasBHPeticion;
    }

   /**
    * Returns the value of the <code>modifiedLogLlamadasBHPeticion</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogLlamadasBHPeticion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogLlamadasBHPeticion() {
        return modifiedLogLlamadasBHPeticion;
    }

   /**
    * Sets the value of the <code>modifiedLogLlamadasBHPeticion</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogLlamadasBHPeticion</code>.
    */
    public void setModifiedLogLlamadasBHPeticion(boolean modified) {
        this.modifiedLogLlamadasBHPeticion = modified;
    }

   /**
    * Returns the value of the <code>logLlamadasBHRespuesta</code> attribute.<br>
    * Model Attribute: <code>logLlamadasBHRespuesta</code>. Constant Text<br>
    * Comments: <br>
    * @return The value of the <code>logLlamadasBHRespuesta</code> attribute.
    */

    public String getLogLlamadasBHRespuesta()  {
    	String value;
        value =  logLlamadasBHRespuesta;
        return value;
    }

   /**
    * Sets the value of the <code>logLlamadasBHRespuesta</code> attribute.<br>
    * Model Attribute: <code>logLlamadasBHRespuesta</code>. Constant Text<br>
    * Comments: <br>
    * @param logLlamadasBHRespuesta The new value of the <code>logLlamadasBHRespuesta</code> attribute.
    */
    public void setLogLlamadasBHRespuesta (String logLlamadasBHRespuesta) {
        this.logLlamadasBHRespuestaInit = true;
        modifiedLogLlamadasBHRespuesta = true;
        this.logLlamadasBHRespuesta = logLlamadasBHRespuesta;
    }

   /**
    * Returns the value of the <code>modifiedLogLlamadasBHRespuesta</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogLlamadasBHRespuesta</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogLlamadasBHRespuesta() {
        return modifiedLogLlamadasBHRespuesta;
    }

   /**
    * Sets the value of the <code>modifiedLogLlamadasBHRespuesta</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogLlamadasBHRespuesta</code>.
    */
    public void setModifiedLogLlamadasBHRespuesta(boolean modified) {
        this.modifiedLogLlamadasBHRespuesta = modified;
    }

   /**
    * Returns the value of the <code>logLlamadasBHUsuario</code> attribute.<br>
    * Model Attribute: <code>logLlamadasBHUsuario</code>. Constant String Size=50<br>
    * Comments: Esto no está en la GdC pero es útil... lo dejo y lo registramos si luego no quieren verlo no lo mostramos y si lo ven útil pues lo tenemos.<br>
    * @return The value of the <code>logLlamadasBHUsuario</code> attribute.
    */

    public String getLogLlamadasBHUsuario()  {
    	String value;
        value =  logLlamadasBHUsuario;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logLlamadasBHUsuario</code> attribute.<br>
    * Model Attribute: <code>logLlamadasBHUsuario</code>. Constant String Size=50<br>
    * Comments: Esto no está en la GdC pero es útil... lo dejo y lo registramos si luego no quieren verlo no lo mostramos y si lo ven útil pues lo tenemos.<br>
    * @param logLlamadasBHUsuario The new value of the <code>logLlamadasBHUsuario</code> attribute.
    */
    public void setLogLlamadasBHUsuario (String logLlamadasBHUsuario) {
        modifiedLogLlamadasBHUsuario = true;
        this.logLlamadasBHUsuario = logLlamadasBHUsuario;
    }

   /**
    * Returns the value of the <code>modifiedLogLlamadasBHUsuario</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogLlamadasBHUsuario</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogLlamadasBHUsuario() {
        return modifiedLogLlamadasBHUsuario;
    }

   /**
    * Sets the value of the <code>modifiedLogLlamadasBHUsuario</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogLlamadasBHUsuario</code>.
    */
    public void setModifiedLogLlamadasBHUsuario(boolean modified) {
        this.modifiedLogLlamadasBHUsuario = modified;
    }

    /**
     * Returns a Map with the values of the attributes.
     * @return Map with the values of the attributes.
     */
    @JsonIgnore
	@Override
    public Map<String, Object> getValues() {
        return values;
    }
    /**
     * This method initializes the properties of the entity and its relations.
     */
    private void initAttributes() {
        logLlamadasBHTipoServicio = "";
        logLlamadasBHSolicitud = null;
        logLlamadasBHServicio = "";
        logLlamadasBHCapacidad = null;
        logLlamadasBHFechaHora = Timestamp.valueOf(Constants.DATETIME_DEFAULTVALUE);
        logLlamadasBHTextoError = null;
        logLlamadasBHTiempoEjecucion = null;
        logLlamadasBHPeticion = null;
        logLlamadasBHRespuesta = null;
        logLlamadasBHUsuario = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return LogLlamadasBH.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return LogLlamadasBHConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
    }


   /**
    * This method sets all flags modifiers with false value.
    */
	@Override	
    public void clearModifiedFlags() {
    	values = new HashMap<>();
    	modifiedLogLlamadasBHTipoServicio = false;
    	values.put("logLlamadasBHTipoServicio", getLogLlamadasBHTipoServicio());
    	modifiedLogLlamadasBHSolicitud = false;
    	values.put("logLlamadasBHSolicitud", getLogLlamadasBHSolicitud());
    	modifiedLogLlamadasBHServicio = false;
    	values.put("logLlamadasBHServicio", getLogLlamadasBHServicio());
    	modifiedLogLlamadasBHCapacidad = false;
    	values.put("logLlamadasBHCapacidad", getLogLlamadasBHCapacidad());
    	modifiedLogLlamadasBHFechaHora = false;
    	values.put("logLlamadasBHFechaHora", getLogLlamadasBHFechaHora());
    	if (modifiedLogLlamadasBHTextoError) {
    		values.put("logLlamadasBHTextoError", logLlamadasBHTextoError);
    		modifiedLogLlamadasBHTextoError = false;
    	}
    	modifiedLogLlamadasBHTiempoEjecucion = false;
    	values.put("logLlamadasBHTiempoEjecucion", getLogLlamadasBHTiempoEjecucion());
    	if (modifiedLogLlamadasBHPeticion) {
    		values.put("logLlamadasBHPeticion", logLlamadasBHPeticion);
    		modifiedLogLlamadasBHPeticion = false;
    	}
    	if (modifiedLogLlamadasBHRespuesta) {
    		values.put("logLlamadasBHRespuesta", logLlamadasBHRespuesta);
    		modifiedLogLlamadasBHRespuesta = false;
    	}
    	modifiedLogLlamadasBHUsuario = false;
    	values.put("logLlamadasBHUsuario", getLogLlamadasBHUsuario());
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>LogLlamadasBHOid</code> object that identifies this instance of <code>LogLlamadasBH</code>.
     * @return <code>LogLlamadasBHOid </code> object that identifies this instance of <code>LogLlamadasBH</code>
     */
	@Override
    public LogLlamadasBHOid getOid() {
        return new LogLlamadasBHOid(getLogLlamadasBHID());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(LogLlamadasBHConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }

    /**
     * Gets the list of active facets.
     * @return the list of active facets.
     */
    @JsonIgnore
	@Override
    public List<String> getActiveFacets() {
        return this.getFacets();
    }

     /**
     * Gets the list of active facets recursively from the root of the inheritance net.
     * @return the list of active facets.
     */
    @JsonIgnore
    public List<String> getFacets() {
        List<String> activeFacets = new ArrayList<>();

        if (!activeFacets.contains(Constants.LOGLLAMADASBH)) {
            // Add this class
            activeFacets.add(Constants.LOGLLAMADASBH);
        }
        return activeFacets;
    }

    /**
     * Returns true if this instance can be observed by the connected agent.
     * @param agent Connected agent instance
     * @return TRUE if the connected agent can observe this instance. FALSE otherwise.
     */
    @Override
    public boolean checkHorizontalVisibility(IEntity agent) {
        boolean returnValue = (!this.isNull());

        if (agent == null) return returnValue;


        if (getAgent().isFacetActive(Constants.FUNCIONARIO) || getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.ASESOR) || getAgent().isFacetActive(Constants.AREAMEDICA) || getAgent().isFacetActive(Constants.AFILIACIONES) || getAgent().isFacetActive(Constants.RESPREGIONAL) || getAgent().isFacetActive(Constants.GESTOR) || getAgent().isFacetActive(Constants.MESADEAPOYO) || getAgent().isFacetActive(Constants.USUARIOSISTEMAEXTERNO)) {
            returnValue = true;
        }
        return returnValue;
    }

    /**
     * Checks Integrity Constraints defined in the class this entity is an instance of.
     * <p>
     * Raises an exception whenever an Integrity Constraint does not hold.
     * @throws IntegrityConstraintException if an integrity constraint isn't fulfilled.
     * @throws SystemException if there is any error on having checked integrity constraints.
     */
	@Override
    public void checkIntegrityConstraints() throws IntegrityConstraintException, SystemException {
        /* There are no Integrity Constraints defined in this class */
    }

    public static AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstanceJsonOid != null && relatedInstancePath != null) {
            List<String> relatedInstancePathItems = new ArrayList<>(Arrays.asList(relatedInstancePath.split("\\.")));
            String pathItem = relatedInstancePathItems.remove(0);
            String remainingPath = String.join(".", relatedInstancePathItems);
            relatedInstance = buildRelatedInstance(relatedInstanceJsonOid, pathItem, remainingPath);
        }
        return relatedInstance;
    }

    private static AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty() && remainingPath.isEmpty()) {
            relatedInstance = buildLogLlamadasBHRelatedInstance(relatedInstanceJsonOid);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogLlamadasBHRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogLlamadasBH(mapper.readValue(relatedInstanceJsonOid, LogLlamadasBHOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogLlamadasBH.class).error(e.getMessage());
            return null;
        }
    }
}
