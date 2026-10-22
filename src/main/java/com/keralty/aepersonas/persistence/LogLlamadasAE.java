package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.LogLlamadasAEConstants;
import com.keralty.aepersonas.persistence.oid.LogLlamadasAEOid;
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
 * Persistent representation of the <code>LogLlamadasAE</code> model class.
 * <p>
 * Model Class: <code>LogLlamadasAE</code><br>
 */
@Entity(name = LogLlamadasAEConstants.CLASS_NAME)
@Table(name = LogLlamadasAEConstants.TBL_NAME)
public class LogLlamadasAE extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LogLlamadasAE_Sequence")
    @SequenceGenerator(name="LogLlamadasAE_Sequence", sequenceName="LogLlamadasAE_Sequence", allocationSize=1)
    @Column(name = LogLlamadasAEConstants.FLD_LOGLLAMADASAEID )
    @JsonProperty(value="id")
    private Long logLlamadasAEID;

    /** Class member attribute. */
    @Column(name = LogLlamadasAEConstants.FLD_LOGLLAMADASAETIPOSERVICIO )
    @JsonProperty(value="tiposervicio")
    private String logLlamadasAETipoServicio;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogLlamadasAETipoServicio;

    /** Class member attribute. */
    @Column(name = LogLlamadasAEConstants.FLD_LOGLLAMADASAESOLICITUD )
    @JsonProperty(value="solicitud")
    private String logLlamadasAESolicitud;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogLlamadasAESolicitud;

    /** Class member attribute. */
    @Column(name = LogLlamadasAEConstants.FLD_LOGLLAMADASAESERVICIO )
    @JsonProperty(value="servicio")
    private String logLlamadasAEServicio;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogLlamadasAEServicio;

    /** Class member attribute. */
    @Column(name = LogLlamadasAEConstants.FLD_LOGLLAMADASAECAPACIDAD )
    @JsonProperty(value="capacidad")
    private String logLlamadasAECapacidad;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogLlamadasAECapacidad;

    /** Class member attribute. */
    @Column(name = LogLlamadasAEConstants.FLD_LOGLLAMADASAEFECHAHORA )
    @JsonProperty(value="fechahora")
    private Timestamp logLlamadasAEFechaHora;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogLlamadasAEFechaHora;

    /** Class member attribute. */
    @Column(name = LogLlamadasAEConstants.FLD_LOGLLAMADASAETEXTOERROR )
    @JsonProperty(value="textoerror")
    private String logLlamadasAETextoError;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogLlamadasAETextoError;

    @Transient
    @JsonIgnore
    public boolean logLlamadasAETextoErrorInit = false;

    /** Class member attribute. */
    @Column(name = LogLlamadasAEConstants.FLD_LOGLLAMADASAETIEMPOEJECUCION )
    @JsonProperty(value="tiempoejecucion")
    private Double logLlamadasAETiempoEjecucion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogLlamadasAETiempoEjecucion;

    /** Class member attribute. */
    @Column(name = LogLlamadasAEConstants.FLD_LOGLLAMADASAEDATOSRECIBIDOS )
    @JsonProperty(value="datosrecibidos")
    private String logLlamadasAEDatosRecibidos;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogLlamadasAEDatosRecibidos;

    @Transient
    @JsonIgnore
    public boolean logLlamadasAEDatosRecibidosInit = false;

    /** Class member attribute. */
    @Column(name = LogLlamadasAEConstants.FLD_LOGLLAMADASAEDATOSENVIADOS )
    @JsonProperty(value="datosenviados")
    private String logLlamadasAEDatosEnviados;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogLlamadasAEDatosEnviados;

    @Transient
    @JsonIgnore
    public boolean logLlamadasAEDatosEnviadosInit = false;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public LogLlamadasAE() {
        logLlamadasAEID = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>LogLlamadasAE</code>.
     * @param oid Object Identifier of the instance of <code>LogLlamadasAE</code> to be created.
     * @throws SystemException
     */
    public LogLlamadasAE(LogLlamadasAEOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            logLlamadasAEID = oid.getLogLlamadasAEID();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>logLlamadasAEID</code> attribute<br>in class <code>LogLlamadasAE</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogLlamadasAE</code>
     * @return The value of the <code>logLlamadasAEID</code> attribute<br>in class <code>LogLlamadasAE</code>.
     */
    public Long getLogLlamadasAEID() {
        return logLlamadasAEID;
    }

    /**
     * Sets the value of the <code>logLlamadasAEID</code> attribute<br>in class <code>LogLlamadasAE</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogLlamadasAE</code>
     * @param logLlamadasAEID The new value of the <code>logLlamadasAEID</code> attribute<br>in class <code>LogLlamadasAE</code>.
     */
    public void setLogLlamadasAEID(Long logLlamadasAEID) {
        this.logLlamadasAEID = logLlamadasAEID;
    }

   /**
    * Returns the value of the <code>logLlamadasAETipoServicio</code> attribute.<br>
    * Model Attribute: <code>logLlamadasAETipoServicio</code>. Constant String Size=20<br>
    * Comments: Web Service<br>
    * @return The value of the <code>logLlamadasAETipoServicio</code> attribute.
    */

    public String getLogLlamadasAETipoServicio()  {
    	String value;
        value =  logLlamadasAETipoServicio;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logLlamadasAETipoServicio</code> attribute.<br>
    * Model Attribute: <code>logLlamadasAETipoServicio</code>. Constant String Size=20<br>
    * Comments: Web Service<br>
    * @param logLlamadasAETipoServicio The new value of the <code>logLlamadasAETipoServicio</code> attribute.
    */
    public void setLogLlamadasAETipoServicio (String logLlamadasAETipoServicio) {
        modifiedLogLlamadasAETipoServicio = true;
        this.logLlamadasAETipoServicio = logLlamadasAETipoServicio;
    }

   /**
    * Returns the value of the <code>modifiedLogLlamadasAETipoServicio</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogLlamadasAETipoServicio</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogLlamadasAETipoServicio() {
        return modifiedLogLlamadasAETipoServicio;
    }

   /**
    * Sets the value of the <code>modifiedLogLlamadasAETipoServicio</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogLlamadasAETipoServicio</code>.
    */
    public void setModifiedLogLlamadasAETipoServicio(boolean modified) {
        this.modifiedLogLlamadasAETipoServicio = modified;
    }

   /**
    * Returns the value of the <code>logLlamadasAESolicitud</code> attribute.<br>
    * Model Attribute: <code>logLlamadasAESolicitud</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>logLlamadasAESolicitud</code> attribute.
    */

    public String getLogLlamadasAESolicitud()  {
    	String value;
        value =  logLlamadasAESolicitud;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logLlamadasAESolicitud</code> attribute.<br>
    * Model Attribute: <code>logLlamadasAESolicitud</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param logLlamadasAESolicitud The new value of the <code>logLlamadasAESolicitud</code> attribute.
    */
    public void setLogLlamadasAESolicitud (String logLlamadasAESolicitud) {
        modifiedLogLlamadasAESolicitud = true;
        this.logLlamadasAESolicitud = logLlamadasAESolicitud;
    }

   /**
    * Returns the value of the <code>modifiedLogLlamadasAESolicitud</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogLlamadasAESolicitud</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogLlamadasAESolicitud() {
        return modifiedLogLlamadasAESolicitud;
    }

   /**
    * Sets the value of the <code>modifiedLogLlamadasAESolicitud</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogLlamadasAESolicitud</code>.
    */
    public void setModifiedLogLlamadasAESolicitud(boolean modified) {
        this.modifiedLogLlamadasAESolicitud = modified;
    }

   /**
    * Returns the value of the <code>logLlamadasAEServicio</code> attribute.<br>
    * Model Attribute: <code>logLlamadasAEServicio</code>. Constant String Size=100<br>
    * Comments: <Options>
NUMCOLS=2;
</Options><br>
    * @return The value of the <code>logLlamadasAEServicio</code> attribute.
    */

    public String getLogLlamadasAEServicio()  {
    	String value;
        value =  logLlamadasAEServicio;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logLlamadasAEServicio</code> attribute.<br>
    * Model Attribute: <code>logLlamadasAEServicio</code>. Constant String Size=100<br>
    * Comments: <Options>
NUMCOLS=2;
</Options><br>
    * @param logLlamadasAEServicio The new value of the <code>logLlamadasAEServicio</code> attribute.
    */
    public void setLogLlamadasAEServicio (String logLlamadasAEServicio) {
        modifiedLogLlamadasAEServicio = true;
        this.logLlamadasAEServicio = logLlamadasAEServicio;
    }

   /**
    * Returns the value of the <code>modifiedLogLlamadasAEServicio</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogLlamadasAEServicio</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogLlamadasAEServicio() {
        return modifiedLogLlamadasAEServicio;
    }

   /**
    * Sets the value of the <code>modifiedLogLlamadasAEServicio</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogLlamadasAEServicio</code>.
    */
    public void setModifiedLogLlamadasAEServicio(boolean modified) {
        this.modifiedLogLlamadasAEServicio = modified;
    }

   /**
    * Returns the value of the <code>logLlamadasAECapacidad</code> attribute.<br>
    * Model Attribute: <code>logLlamadasAECapacidad</code>. Constant String Size=100<br>
    * Comments: <Options>
NUMCOLS=2;
</Options><br>
    * @return The value of the <code>logLlamadasAECapacidad</code> attribute.
    */

    public String getLogLlamadasAECapacidad()  {
    	String value;
        value =  logLlamadasAECapacidad;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logLlamadasAECapacidad</code> attribute.<br>
    * Model Attribute: <code>logLlamadasAECapacidad</code>. Constant String Size=100<br>
    * Comments: <Options>
NUMCOLS=2;
</Options><br>
    * @param logLlamadasAECapacidad The new value of the <code>logLlamadasAECapacidad</code> attribute.
    */
    public void setLogLlamadasAECapacidad (String logLlamadasAECapacidad) {
        modifiedLogLlamadasAECapacidad = true;
        this.logLlamadasAECapacidad = logLlamadasAECapacidad;
    }

   /**
    * Returns the value of the <code>modifiedLogLlamadasAECapacidad</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogLlamadasAECapacidad</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogLlamadasAECapacidad() {
        return modifiedLogLlamadasAECapacidad;
    }

   /**
    * Sets the value of the <code>modifiedLogLlamadasAECapacidad</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogLlamadasAECapacidad</code>.
    */
    public void setModifiedLogLlamadasAECapacidad(boolean modified) {
        this.modifiedLogLlamadasAECapacidad = modified;
    }

   /**
    * Returns the value of the <code>logLlamadasAEFechaHora</code> attribute.<br>
    * Model Attribute: <code>logLlamadasAEFechaHora</code>. Constant DateTime<br>
    * Comments: <br>
    * @return The value of the <code>logLlamadasAEFechaHora</code> attribute.
    */

    public Timestamp getLogLlamadasAEFechaHora()  {
    	Timestamp value;
        value =  logLlamadasAEFechaHora;
        return value;
    }

   /**
    * Sets the value of the <code>logLlamadasAEFechaHora</code> attribute.<br>
    * Model Attribute: <code>logLlamadasAEFechaHora</code>. Constant DateTime<br>
    * Comments: <br>
    * @param logLlamadasAEFechaHora The new value of the <code>logLlamadasAEFechaHora</code> attribute.
    */
    public void setLogLlamadasAEFechaHora (Timestamp logLlamadasAEFechaHora) {
        modifiedLogLlamadasAEFechaHora = true;
        this.logLlamadasAEFechaHora = logLlamadasAEFechaHora;
    }

   /**
    * Returns the value of the <code>modifiedLogLlamadasAEFechaHora</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogLlamadasAEFechaHora</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogLlamadasAEFechaHora() {
        return modifiedLogLlamadasAEFechaHora;
    }

   /**
    * Sets the value of the <code>modifiedLogLlamadasAEFechaHora</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogLlamadasAEFechaHora</code>.
    */
    public void setModifiedLogLlamadasAEFechaHora(boolean modified) {
        this.modifiedLogLlamadasAEFechaHora = modified;
    }

   /**
    * Returns the value of the <code>logLlamadasAETextoError</code> attribute.<br>
    * Model Attribute: <code>logLlamadasAETextoError</code>. Constant Text<br>
    * Comments: <br>
    * @return The value of the <code>logLlamadasAETextoError</code> attribute.
    */

    public String getLogLlamadasAETextoError()  {
    	String value;
        value =  logLlamadasAETextoError;
        return value;
    }

   /**
    * Sets the value of the <code>logLlamadasAETextoError</code> attribute.<br>
    * Model Attribute: <code>logLlamadasAETextoError</code>. Constant Text<br>
    * Comments: <br>
    * @param logLlamadasAETextoError The new value of the <code>logLlamadasAETextoError</code> attribute.
    */
    public void setLogLlamadasAETextoError (String logLlamadasAETextoError) {
        this.logLlamadasAETextoErrorInit = true;
        modifiedLogLlamadasAETextoError = true;
        this.logLlamadasAETextoError = logLlamadasAETextoError;
    }

   /**
    * Returns the value of the <code>modifiedLogLlamadasAETextoError</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogLlamadasAETextoError</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogLlamadasAETextoError() {
        return modifiedLogLlamadasAETextoError;
    }

   /**
    * Sets the value of the <code>modifiedLogLlamadasAETextoError</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogLlamadasAETextoError</code>.
    */
    public void setModifiedLogLlamadasAETextoError(boolean modified) {
        this.modifiedLogLlamadasAETextoError = modified;
    }

   /**
    * Returns the value of the <code>logLlamadasAETiempoEjecucion</code> attribute.<br>
    * Model Attribute: <code>logLlamadasAETiempoEjecucion</code>. Constant Real<br>
    * Comments: <br>
    * @return The value of the <code>logLlamadasAETiempoEjecucion</code> attribute.
    */

    public Double getLogLlamadasAETiempoEjecucion()  {
    	Double value;
        value =  logLlamadasAETiempoEjecucion;
        return value;
    }

   /**
    * Sets the value of the <code>logLlamadasAETiempoEjecucion</code> attribute.<br>
    * Model Attribute: <code>logLlamadasAETiempoEjecucion</code>. Constant Real<br>
    * Comments: <br>
    * @param logLlamadasAETiempoEjecucion The new value of the <code>logLlamadasAETiempoEjecucion</code> attribute.
    */
    public void setLogLlamadasAETiempoEjecucion (Double logLlamadasAETiempoEjecucion) {
        modifiedLogLlamadasAETiempoEjecucion = true;
        this.logLlamadasAETiempoEjecucion = logLlamadasAETiempoEjecucion;
    }

   /**
    * Returns the value of the <code>modifiedLogLlamadasAETiempoEjecucion</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogLlamadasAETiempoEjecucion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogLlamadasAETiempoEjecucion() {
        return modifiedLogLlamadasAETiempoEjecucion;
    }

   /**
    * Sets the value of the <code>modifiedLogLlamadasAETiempoEjecucion</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogLlamadasAETiempoEjecucion</code>.
    */
    public void setModifiedLogLlamadasAETiempoEjecucion(boolean modified) {
        this.modifiedLogLlamadasAETiempoEjecucion = modified;
    }

   /**
    * Returns the value of the <code>logLlamadasAEDatosRecibidos</code> attribute.<br>
    * Model Attribute: <code>logLlamadasAEDatosRecibidos</code>. Constant Text<br>
    * Comments: <br>
    * @return The value of the <code>logLlamadasAEDatosRecibidos</code> attribute.
    */

    public String getLogLlamadasAEDatosRecibidos()  {
    	String value;
        value =  logLlamadasAEDatosRecibidos;
        return value;
    }

   /**
    * Sets the value of the <code>logLlamadasAEDatosRecibidos</code> attribute.<br>
    * Model Attribute: <code>logLlamadasAEDatosRecibidos</code>. Constant Text<br>
    * Comments: <br>
    * @param logLlamadasAEDatosRecibidos The new value of the <code>logLlamadasAEDatosRecibidos</code> attribute.
    */
    public void setLogLlamadasAEDatosRecibidos (String logLlamadasAEDatosRecibidos) {
        this.logLlamadasAEDatosRecibidosInit = true;
        modifiedLogLlamadasAEDatosRecibidos = true;
        this.logLlamadasAEDatosRecibidos = logLlamadasAEDatosRecibidos;
    }

   /**
    * Returns the value of the <code>modifiedLogLlamadasAEDatosRecibidos</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogLlamadasAEDatosRecibidos</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogLlamadasAEDatosRecibidos() {
        return modifiedLogLlamadasAEDatosRecibidos;
    }

   /**
    * Sets the value of the <code>modifiedLogLlamadasAEDatosRecibidos</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogLlamadasAEDatosRecibidos</code>.
    */
    public void setModifiedLogLlamadasAEDatosRecibidos(boolean modified) {
        this.modifiedLogLlamadasAEDatosRecibidos = modified;
    }

   /**
    * Returns the value of the <code>logLlamadasAEDatosEnviados</code> attribute.<br>
    * Model Attribute: <code>logLlamadasAEDatosEnviados</code>. Constant Text<br>
    * Comments: <br>
    * @return The value of the <code>logLlamadasAEDatosEnviados</code> attribute.
    */

    public String getLogLlamadasAEDatosEnviados()  {
    	String value;
        value =  logLlamadasAEDatosEnviados;
        return value;
    }

   /**
    * Sets the value of the <code>logLlamadasAEDatosEnviados</code> attribute.<br>
    * Model Attribute: <code>logLlamadasAEDatosEnviados</code>. Constant Text<br>
    * Comments: <br>
    * @param logLlamadasAEDatosEnviados The new value of the <code>logLlamadasAEDatosEnviados</code> attribute.
    */
    public void setLogLlamadasAEDatosEnviados (String logLlamadasAEDatosEnviados) {
        this.logLlamadasAEDatosEnviadosInit = true;
        modifiedLogLlamadasAEDatosEnviados = true;
        this.logLlamadasAEDatosEnviados = logLlamadasAEDatosEnviados;
    }

   /**
    * Returns the value of the <code>modifiedLogLlamadasAEDatosEnviados</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogLlamadasAEDatosEnviados</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogLlamadasAEDatosEnviados() {
        return modifiedLogLlamadasAEDatosEnviados;
    }

   /**
    * Sets the value of the <code>modifiedLogLlamadasAEDatosEnviados</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogLlamadasAEDatosEnviados</code>.
    */
    public void setModifiedLogLlamadasAEDatosEnviados(boolean modified) {
        this.modifiedLogLlamadasAEDatosEnviados = modified;
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
        logLlamadasAETipoServicio = "";
        logLlamadasAESolicitud = null;
        logLlamadasAEServicio = "";
        logLlamadasAECapacidad = null;
        logLlamadasAEFechaHora = Timestamp.valueOf(Constants.DATETIME_DEFAULTVALUE);
        logLlamadasAETextoError = null;
        logLlamadasAETiempoEjecucion = null;
        logLlamadasAEDatosRecibidos = null;
        logLlamadasAEDatosEnviados = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return LogLlamadasAE.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return LogLlamadasAEConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
    }


   /**
    * This method sets all flags modifiers with false value.
    */
	@Override	
    public void clearModifiedFlags() {
    	values = new HashMap<>();
    	modifiedLogLlamadasAETipoServicio = false;
    	values.put("logLlamadasAETipoServicio", getLogLlamadasAETipoServicio());
    	modifiedLogLlamadasAESolicitud = false;
    	values.put("logLlamadasAESolicitud", getLogLlamadasAESolicitud());
    	modifiedLogLlamadasAEServicio = false;
    	values.put("logLlamadasAEServicio", getLogLlamadasAEServicio());
    	modifiedLogLlamadasAECapacidad = false;
    	values.put("logLlamadasAECapacidad", getLogLlamadasAECapacidad());
    	modifiedLogLlamadasAEFechaHora = false;
    	values.put("logLlamadasAEFechaHora", getLogLlamadasAEFechaHora());
    	if (modifiedLogLlamadasAETextoError) {
    		values.put("logLlamadasAETextoError", logLlamadasAETextoError);
    		modifiedLogLlamadasAETextoError = false;
    	}
    	modifiedLogLlamadasAETiempoEjecucion = false;
    	values.put("logLlamadasAETiempoEjecucion", getLogLlamadasAETiempoEjecucion());
    	if (modifiedLogLlamadasAEDatosRecibidos) {
    		values.put("logLlamadasAEDatosRecibidos", logLlamadasAEDatosRecibidos);
    		modifiedLogLlamadasAEDatosRecibidos = false;
    	}
    	if (modifiedLogLlamadasAEDatosEnviados) {
    		values.put("logLlamadasAEDatosEnviados", logLlamadasAEDatosEnviados);
    		modifiedLogLlamadasAEDatosEnviados = false;
    	}
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>LogLlamadasAEOid</code> object that identifies this instance of <code>LogLlamadasAE</code>.
     * @return <code>LogLlamadasAEOid </code> object that identifies this instance of <code>LogLlamadasAE</code>
     */
	@Override
    public LogLlamadasAEOid getOid() {
        return new LogLlamadasAEOid(getLogLlamadasAEID());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(LogLlamadasAEConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.LOGLLAMADASAE)) {
            // Add this class
            activeFacets.add(Constants.LOGLLAMADASAE);
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
            relatedInstance = buildLogLlamadasAERelatedInstance(relatedInstanceJsonOid);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogLlamadasAERelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogLlamadasAE(mapper.readValue(relatedInstanceJsonOid, LogLlamadasAEOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogLlamadasAE.class).error(e.getMessage());
            return null;
        }
    }
}
