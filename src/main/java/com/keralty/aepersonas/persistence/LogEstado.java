package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.LogEstadoConstants;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.persistence.oid.LogEstadoOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.repository.SolicitudJpaRepository;
import io.quarkus.arc.Arc;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
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
 * Persistent representation of the <code>LogEstado</code> model class.
 * <p>
 * Model Class: <code>LogEstado</code><br>
 */
@Entity(name = LogEstadoConstants.CLASS_NAME)
@Table(name = LogEstadoConstants.TBL_NAME)
public class LogEstado extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient SolicitudJpaRepository solicitudRepository;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LogEstado_Sequence")
    @SequenceGenerator(name="LogEstado_Sequence", sequenceName="LogEstado_Sequence", allocationSize=1)
    @Column(name = LogEstadoConstants.FLD_LOGESTADOID )
    @JsonProperty(value="id")
    private Long logEstadoId;

    /** Class member attribute. */
    @Column(name = LogEstadoConstants.FLD_LOGESTADOFECHA )
    @JsonProperty(value="fecha")
    private Timestamp logEstadoFecha;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogEstadoFecha;

    /** Class member attribute. */
    @Column(name = LogEstadoConstants.FLD_LOGESTADOLOGINFUNCIONARIO )
    @JsonProperty(value="loginfuncionario")
    private String logEstadoLoginFuncionario;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogEstadoLoginFuncionario;

    /** Class member attribute. */
    @Column(name = LogEstadoConstants.FLD_LOGESTADOOBSERVACION )
    @JsonProperty(value="observacion")
    private String logEstadoObservacion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogEstadoObservacion;

    /** Class member attribute. */
    @Column(name = LogEstadoConstants.FLD_LOGESTADOMOTDEVOLUCION )
    @JsonProperty(value="motdevolucion")
    private String logEstadoMotDevolucion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogEstadoMotDevolucion;

    /** Class member attribute. */
    @Column(name = LogEstadoConstants.FLD_LOGESTADOESTADO )
    @JsonProperty(value="estado")
    private Long logEstadoEstado;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogEstadoEstado;

    /** Class member attribute. */
    @Column(name = LogEstadoConstants.FLD_LOGESTADOESTADODOC )
    @JsonProperty(value="estadodoc")
    private Long logEstadoEstadoDoc;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogEstadoEstadoDoc;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=LogEstadoConstants.FLD_AESOLICITUDESIDSOLICITUD, referencedColumnName=SolicitudConstants.FLD_AESOLICITUDESIDSOLICITUD)
    })
    @JsonIgnore
    private Solicitud solicitud;
    /** Related attribute. */
    @Column(name = LogEstadoConstants.FLD_AESOLICITUDESIDSOLICITUD, insertable = false, updatable = false)
    private Long aesolicitudesidsolicitud;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitud;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public LogEstado() {
        logEstadoId = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>LogEstado</code>.
     * @param oid Object Identifier of the instance of <code>LogEstado</code> to be created.
     * @throws SystemException
     */
    public LogEstado(LogEstadoOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            logEstadoId = oid.getLogEstadoId();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>logEstadoId</code> attribute<br>in class <code>LogEstado</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogEstado</code>
     * @return The value of the <code>logEstadoId</code> attribute<br>in class <code>LogEstado</code>.
     */
    public Long getLogEstadoId() {
        return logEstadoId;
    }

    /**
     * Sets the value of the <code>logEstadoId</code> attribute<br>in class <code>LogEstado</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogEstado</code>
     * @param logEstadoId The new value of the <code>logEstadoId</code> attribute<br>in class <code>LogEstado</code>.
     */
    public void setLogEstadoId(Long logEstadoId) {
        this.logEstadoId = logEstadoId;
    }

   /**
    * Returns the value of the <code>logEstadoFecha</code> attribute.<br>
    * Model Attribute: <code>logEstadoFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @return The value of the <code>logEstadoFecha</code> attribute.
    */

    public Timestamp getLogEstadoFecha()  {
    	Timestamp value;
        value =  logEstadoFecha;
        return value;
    }

   /**
    * Sets the value of the <code>logEstadoFecha</code> attribute.<br>
    * Model Attribute: <code>logEstadoFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @param logEstadoFecha The new value of the <code>logEstadoFecha</code> attribute.
    */
    public void setLogEstadoFecha (Timestamp logEstadoFecha) {
        modifiedLogEstadoFecha = true;
        this.logEstadoFecha = logEstadoFecha;
    }

   /**
    * Returns the value of the <code>modifiedLogEstadoFecha</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogEstadoFecha</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogEstadoFecha() {
        return modifiedLogEstadoFecha;
    }

   /**
    * Sets the value of the <code>modifiedLogEstadoFecha</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogEstadoFecha</code>.
    */
    public void setModifiedLogEstadoFecha(boolean modified) {
        this.modifiedLogEstadoFecha = modified;
    }

   /**
    * Returns the value of the <code>logEstadoLoginFuncionario</code> attribute.<br>
    * Model Attribute: <code>logEstadoLoginFuncionario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>logEstadoLoginFuncionario</code> attribute.
    */

    public String getLogEstadoLoginFuncionario()  {
    	String value;
        value =  logEstadoLoginFuncionario;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logEstadoLoginFuncionario</code> attribute.<br>
    * Model Attribute: <code>logEstadoLoginFuncionario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param logEstadoLoginFuncionario The new value of the <code>logEstadoLoginFuncionario</code> attribute.
    */
    public void setLogEstadoLoginFuncionario (String logEstadoLoginFuncionario) {
        modifiedLogEstadoLoginFuncionario = true;
        this.logEstadoLoginFuncionario = logEstadoLoginFuncionario;
    }

   /**
    * Returns the value of the <code>modifiedLogEstadoLoginFuncionario</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogEstadoLoginFuncionario</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogEstadoLoginFuncionario() {
        return modifiedLogEstadoLoginFuncionario;
    }

   /**
    * Sets the value of the <code>modifiedLogEstadoLoginFuncionario</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogEstadoLoginFuncionario</code>.
    */
    public void setModifiedLogEstadoLoginFuncionario(boolean modified) {
        this.modifiedLogEstadoLoginFuncionario = modified;
    }

   /**
    * Returns the value of the <code>logEstadoObservacion</code> attribute.<br>
    * Model Attribute: <code>logEstadoObservacion</code>. Constant String Size=255<br>
    * Comments: <br>
    * @return The value of the <code>logEstadoObservacion</code> attribute.
    */

    public String getLogEstadoObservacion()  {
    	String value;
        value =  logEstadoObservacion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logEstadoObservacion</code> attribute.<br>
    * Model Attribute: <code>logEstadoObservacion</code>. Constant String Size=255<br>
    * Comments: <br>
    * @param logEstadoObservacion The new value of the <code>logEstadoObservacion</code> attribute.
    */
    public void setLogEstadoObservacion (String logEstadoObservacion) {
        modifiedLogEstadoObservacion = true;
        this.logEstadoObservacion = logEstadoObservacion;
    }

   /**
    * Returns the value of the <code>modifiedLogEstadoObservacion</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogEstadoObservacion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogEstadoObservacion() {
        return modifiedLogEstadoObservacion;
    }

   /**
    * Sets the value of the <code>modifiedLogEstadoObservacion</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogEstadoObservacion</code>.
    */
    public void setModifiedLogEstadoObservacion(boolean modified) {
        this.modifiedLogEstadoObservacion = modified;
    }

   /**
    * Returns the value of the <code>logEstadoMotDevolucion</code> attribute.<br>
    * Model Attribute: <code>logEstadoMotDevolucion</code>. Constant String Size=50<br>
    * Comments: Descripción del motivo de devolución al ser devuelta por área médica<br>
    * @return The value of the <code>logEstadoMotDevolucion</code> attribute.
    */

    public String getLogEstadoMotDevolucion()  {
    	String value;
        value =  logEstadoMotDevolucion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logEstadoMotDevolucion</code> attribute.<br>
    * Model Attribute: <code>logEstadoMotDevolucion</code>. Constant String Size=50<br>
    * Comments: Descripción del motivo de devolución al ser devuelta por área médica<br>
    * @param logEstadoMotDevolucion The new value of the <code>logEstadoMotDevolucion</code> attribute.
    */
    public void setLogEstadoMotDevolucion (String logEstadoMotDevolucion) {
        modifiedLogEstadoMotDevolucion = true;
        this.logEstadoMotDevolucion = logEstadoMotDevolucion;
    }

   /**
    * Returns the value of the <code>modifiedLogEstadoMotDevolucion</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogEstadoMotDevolucion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogEstadoMotDevolucion() {
        return modifiedLogEstadoMotDevolucion;
    }

   /**
    * Sets the value of the <code>modifiedLogEstadoMotDevolucion</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogEstadoMotDevolucion</code>.
    */
    public void setModifiedLogEstadoMotDevolucion(boolean modified) {
        this.modifiedLogEstadoMotDevolucion = modified;
    }

   /**
    * Returns the value of the <code>logEstadoEstado</code> attribute.<br>
    * Model Attribute: <code>logEstadoEstado</code>. Constant Int<br>
    * Comments: <br>
    * @return The value of the <code>logEstadoEstado</code> attribute.
    */

    public Long getLogEstadoEstado()  {
    	Long value;
        value =  logEstadoEstado;
        return value;
    }

   /**
    * Sets the value of the <code>logEstadoEstado</code> attribute.<br>
    * Model Attribute: <code>logEstadoEstado</code>. Constant Int<br>
    * Comments: <br>
    * @param logEstadoEstado The new value of the <code>logEstadoEstado</code> attribute.
    */
    public void setLogEstadoEstado (Long logEstadoEstado) {
        modifiedLogEstadoEstado = true;
        this.logEstadoEstado = logEstadoEstado;
    }

   /**
    * Returns the value of the <code>modifiedLogEstadoEstado</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogEstadoEstado</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogEstadoEstado() {
        return modifiedLogEstadoEstado;
    }

   /**
    * Sets the value of the <code>modifiedLogEstadoEstado</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogEstadoEstado</code>.
    */
    public void setModifiedLogEstadoEstado(boolean modified) {
        this.modifiedLogEstadoEstado = modified;
    }

   /**
    * Returns the value of the <code>logEstadoEstadoDoc</code> attribute.<br>
    * Model Attribute: <code>logEstadoEstadoDoc</code>. Constant Nat<br>
    * Comments: GdC 26. Req 18. Auditoria cambio estado de la documentación. 
Se requiere que cuando se realiza un cambio de estado a la documentación este quede auditado en el existente histórico de estados de la solicitud.
Como dice explícitamente que se guarde en esta clase, añadimos el atributo aquí. 
<br>
    * @return The value of the <code>logEstadoEstadoDoc</code> attribute.
    */

    public Long getLogEstadoEstadoDoc()  {
    	Long value;
        value =  logEstadoEstadoDoc;
        return value;
    }

   /**
    * Sets the value of the <code>logEstadoEstadoDoc</code> attribute.<br>
    * Model Attribute: <code>logEstadoEstadoDoc</code>. Constant Nat<br>
    * Comments: GdC 26. Req 18. Auditoria cambio estado de la documentación. 
Se requiere que cuando se realiza un cambio de estado a la documentación este quede auditado en el existente histórico de estados de la solicitud.
Como dice explícitamente que se guarde en esta clase, añadimos el atributo aquí. 
<br>
    * @param logEstadoEstadoDoc The new value of the <code>logEstadoEstadoDoc</code> attribute.
    */
    public void setLogEstadoEstadoDoc (Long logEstadoEstadoDoc) {
        modifiedLogEstadoEstadoDoc = true;
        this.logEstadoEstadoDoc = logEstadoEstadoDoc;
    }

   /**
    * Returns the value of the <code>modifiedLogEstadoEstadoDoc</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogEstadoEstadoDoc</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogEstadoEstadoDoc() {
        return modifiedLogEstadoEstadoDoc;
    }

   /**
    * Sets the value of the <code>modifiedLogEstadoEstadoDoc</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogEstadoEstadoDoc</code>.
    */
    public void setModifiedLogEstadoEstadoDoc(boolean modified) {
        this.modifiedLogEstadoEstadoDoc = modified;
    }

    /**
     * Returns the instance of <code>Solicitud</code> related through the <code>Solicitud</code> role.
     * Model Relationship:
     * <code>[Solicitud] Solicitud 1:1  ------ 0:M  LogEstado [LogEstado]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Solicitud</code> related through the <code>Solicitud</code> role.
     */
    @JsonIgnore
    public Solicitud getSolicitud() {
        try {
            if (solicitud != null && solicitud.isNull()) {
                solicitud = null;
            }
        } catch (Exception ex) {
            solicitud = null;
        }
        if (solicitud == null) {
            if (aesolicitudesidsolicitud != null) {
                solicitud = getSolicitudRepository().findById(aesolicitudesidsolicitud).orElse(null);
            } else {
                solicitud = null;
            }
        }
        return (solicitud == null ? new Solicitud(null) : solicitud);
    }

    /**
     * Adds an instance of <code>Solicitud</code> related through the <code>Solicitud</code> role.
     * @param solicitud The instance to add to the <code>Solicitud</code> role.
     */
    public void add2Solicitud(Solicitud solicitud) {
        if (solicitud == null || solicitud.isNull()) {
            this.modifiedSolicitud = true;
            this.aesolicitudesidsolicitud = null;
        } else {
            this.aesolicitudesidsolicitud = solicitud.getAesolicitudesidsolicitud();
        }
        this.solicitud = (solicitud == null  || solicitud.isNull() ? null : solicitud);
    }

   /**
    * This method gets the attribute value <code>modifiedSolicitud</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedSolicitud</code> has been modified.
    */
    public boolean isModifiedSolicitud(){
        return modifiedSolicitud;
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
        logEstadoFecha = Timestamp.valueOf(Constants.DATETIME_DEFAULTVALUE);
        logEstadoLoginFuncionario = "";
        logEstadoObservacion = null;
        logEstadoMotDevolucion = null;
        logEstadoEstado = Long.valueOf(0);
        logEstadoEstadoDoc = Long.valueOf(0);
        solicitud = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }
    public SolicitudJpaRepository getSolicitudRepository() {
        return Arc.container().select(SolicitudJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return LogEstado.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return LogEstadoConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
    }

    /**
     * Returns the data type of the <code>attribute</code> defined in <code>role</code>.
     * @param role the owner class of the attribute.
     * @param attribute the attribute name whose data type name is to be returned.
     * @return the data type name of the given attribute or null if the attribute does not exist.
     */
    @Override
    public String getAttributeTypeRelated(String role, String attribute) {
        String returnedType = "";
        return returnedType;
    }


   /**
    * This method sets all flags modifiers with false value.
    */
	@Override	
    public void clearModifiedFlags() {
    	values = new HashMap<>();
    	modifiedLogEstadoFecha = false;
    	values.put("logEstadoFecha", getLogEstadoFecha());
    	modifiedLogEstadoLoginFuncionario = false;
    	values.put("logEstadoLoginFuncionario", getLogEstadoLoginFuncionario());
    	modifiedLogEstadoObservacion = false;
    	values.put("logEstadoObservacion", getLogEstadoObservacion());
    	modifiedLogEstadoMotDevolucion = false;
    	values.put("logEstadoMotDevolucion", getLogEstadoMotDevolucion());
    	modifiedLogEstadoEstado = false;
    	values.put("logEstadoEstado", getLogEstadoEstado());
    	modifiedLogEstadoEstadoDoc = false;
    	values.put("logEstadoEstadoDoc", getLogEstadoEstadoDoc());
    	modifiedSolicitud = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>LogEstadoOid</code> object that identifies this instance of <code>LogEstado</code>.
     * @return <code>LogEstadoOid </code> object that identifies this instance of <code>LogEstado</code>
     */
	@Override
    public LogEstadoOid getOid() {
        return new LogEstadoOid(getLogEstadoId());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(LogEstadoConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(LogEstadoConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.LOGESTADO)) {
            // Add this class
            activeFacets.add(Constants.LOGESTADO);
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


        if (getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.ASESOR) || getAgent().isFacetActive(Constants.AREAMEDICA) || getAgent().isFacetActive(Constants.AFILIACIONES) || getAgent().isFacetActive(Constants.GESTOR) || getAgent().isFacetActive(Constants.MESADEAPOYO)) {
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

    public String buildDSLogEstado() {
        try {
            return getLogEstadoLoginFuncionario() + " " + (getLogEstadoFecha() != null ? getLogEstadoFecha().toString() : "") + " " + (getLogEstadoEstado() != null ? getLogEstadoEstado().toString() : "") + " " + (getLogEstadoEstadoDoc() != null ? getLogEstadoEstadoDoc().toString() : "") + " " + getLogEstadoObservacion() + " " + getLogEstadoMotDevolucion();
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
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
            relatedInstance = buildLogEstadoRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogEstadoConstants.ROLE_NAME_SOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogEstadoRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogEstadoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogEstado(mapper.readValue(relatedInstanceJsonOid, LogEstadoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogEstado.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildLogEstadoRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogEstado.class).error(e.getMessage());
            return null;
        }
    }
}
