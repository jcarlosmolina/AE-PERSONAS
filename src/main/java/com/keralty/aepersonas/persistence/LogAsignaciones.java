package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.LogAsignacionesConstants;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.persistence.oid.LogAsignacionesOid;
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
 * Persistent representation of the <code>LogAsignaciones</code> model class.
 * <p>
 * Model Class: <code>LogAsignaciones</code><br>
 */
@Entity(name = LogAsignacionesConstants.CLASS_NAME)
@Table(name = LogAsignacionesConstants.TBL_NAME)
public class LogAsignaciones extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient SolicitudJpaRepository solicitudRepository;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LogAsignaciones_Sequence")
    @SequenceGenerator(name="LogAsignaciones_Sequence", sequenceName="LogAsignaciones_Sequence", allocationSize=1)
    @Column(name = LogAsignacionesConstants.FLD_LOGASIGNACIONESIDLOGASIGNACIONES )
    @JsonProperty(value="id_logasignaciones")
    private Long logAsignacionesidLogAsignaciones;

    /** Class member attribute. */
    @Column(name = LogAsignacionesConstants.FLD_LOGASIGNACIONESTIPO )
    @JsonProperty(value="tipo")
    private String logAsignacionesTipo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogAsignacionesTipo;

    /** Class member attribute. */
    @Column(name = LogAsignacionesConstants.FLD_LOGASIGNACIONESFECHAHORA )
    @JsonProperty(value="fechahora")
    private Timestamp logAsignacionesFechaHora;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogAsignacionesFechaHora;

    /** Class member attribute. */
    @Column(name = LogAsignacionesConstants.FLD_LOGASIGNACIONESQUIEN )
    @JsonProperty(value="quien")
    private String logAsignacionesQuien;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogAsignacionesQuien;

    /** Class member attribute. */
    @Column(name = LogAsignacionesConstants.FLD_LOGASIGNACIONESUSUARIO )
    @JsonProperty(value="usuario")
    private String logAsignacionesUsuario;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogAsignacionesUsuario;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=LogAsignacionesConstants.FLD_AESOLICITUDESIDSOLICITUD, referencedColumnName=SolicitudConstants.FLD_AESOLICITUDESIDSOLICITUD)
    })
    @JsonIgnore
    private Solicitud solicitud;
    /** Related attribute. */
    @Column(name = LogAsignacionesConstants.FLD_AESOLICITUDESIDSOLICITUD, insertable = false, updatable = false)
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
    public LogAsignaciones() {
        logAsignacionesidLogAsignaciones = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>LogAsignaciones</code>.
     * @param oid Object Identifier of the instance of <code>LogAsignaciones</code> to be created.
     * @throws SystemException
     */
    public LogAsignaciones(LogAsignacionesOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            logAsignacionesidLogAsignaciones = oid.getLogAsignacionesidLogAsignaciones();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>logAsignacionesidLogAsignaciones</code> attribute<br>in class <code>LogAsignaciones</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogAsignaciones</code>
     * @return The value of the <code>logAsignacionesidLogAsignaciones</code> attribute<br>in class <code>LogAsignaciones</code>.
     */
    public Long getLogAsignacionesidLogAsignaciones() {
        return logAsignacionesidLogAsignaciones;
    }

    /**
     * Sets the value of the <code>logAsignacionesidLogAsignaciones</code> attribute<br>in class <code>LogAsignaciones</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogAsignaciones</code>
     * @param logAsignacionesidLogAsignaciones The new value of the <code>logAsignacionesidLogAsignaciones</code> attribute<br>in class <code>LogAsignaciones</code>.
     */
    public void setLogAsignacionesidLogAsignaciones(Long logAsignacionesidLogAsignaciones) {
        this.logAsignacionesidLogAsignaciones = logAsignacionesidLogAsignaciones;
    }

   /**
    * Returns the value of the <code>logAsignacionesTipo</code> attribute.<br>
    * Model Attribute: <code>logAsignacionesTipo</code>. Constant String Size=30<br>
    * Comments: <br>
    * @return The value of the <code>logAsignacionesTipo</code> attribute.
    */

    public String getLogAsignacionesTipo()  {
    	String value;
        value =  logAsignacionesTipo;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logAsignacionesTipo</code> attribute.<br>
    * Model Attribute: <code>logAsignacionesTipo</code>. Constant String Size=30<br>
    * Comments: <br>
    * @param logAsignacionesTipo The new value of the <code>logAsignacionesTipo</code> attribute.
    */
    public void setLogAsignacionesTipo (String logAsignacionesTipo) {
        modifiedLogAsignacionesTipo = true;
        this.logAsignacionesTipo = logAsignacionesTipo;
    }

   /**
    * Returns the value of the <code>modifiedLogAsignacionesTipo</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogAsignacionesTipo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogAsignacionesTipo() {
        return modifiedLogAsignacionesTipo;
    }

   /**
    * Sets the value of the <code>modifiedLogAsignacionesTipo</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogAsignacionesTipo</code>.
    */
    public void setModifiedLogAsignacionesTipo(boolean modified) {
        this.modifiedLogAsignacionesTipo = modified;
    }

   /**
    * Returns the value of the <code>logAsignacionesFechaHora</code> attribute.<br>
    * Model Attribute: <code>logAsignacionesFechaHora</code>. Constant DateTime<br>
    * Comments: <br>
    * @return The value of the <code>logAsignacionesFechaHora</code> attribute.
    */

    public Timestamp getLogAsignacionesFechaHora()  {
    	Timestamp value;
        value =  logAsignacionesFechaHora;
        return value;
    }

   /**
    * Sets the value of the <code>logAsignacionesFechaHora</code> attribute.<br>
    * Model Attribute: <code>logAsignacionesFechaHora</code>. Constant DateTime<br>
    * Comments: <br>
    * @param logAsignacionesFechaHora The new value of the <code>logAsignacionesFechaHora</code> attribute.
    */
    public void setLogAsignacionesFechaHora (Timestamp logAsignacionesFechaHora) {
        modifiedLogAsignacionesFechaHora = true;
        this.logAsignacionesFechaHora = logAsignacionesFechaHora;
    }

   /**
    * Returns the value of the <code>modifiedLogAsignacionesFechaHora</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogAsignacionesFechaHora</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogAsignacionesFechaHora() {
        return modifiedLogAsignacionesFechaHora;
    }

   /**
    * Sets the value of the <code>modifiedLogAsignacionesFechaHora</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogAsignacionesFechaHora</code>.
    */
    public void setModifiedLogAsignacionesFechaHora(boolean modified) {
        this.modifiedLogAsignacionesFechaHora = modified;
    }

   /**
    * Returns the value of the <code>logAsignacionesQuien</code> attribute.<br>
    * Model Attribute: <code>logAsignacionesQuien</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>logAsignacionesQuien</code> attribute.
    */

    public String getLogAsignacionesQuien()  {
    	String value;
        value =  logAsignacionesQuien;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logAsignacionesQuien</code> attribute.<br>
    * Model Attribute: <code>logAsignacionesQuien</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param logAsignacionesQuien The new value of the <code>logAsignacionesQuien</code> attribute.
    */
    public void setLogAsignacionesQuien (String logAsignacionesQuien) {
        modifiedLogAsignacionesQuien = true;
        this.logAsignacionesQuien = logAsignacionesQuien;
    }

   /**
    * Returns the value of the <code>modifiedLogAsignacionesQuien</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogAsignacionesQuien</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogAsignacionesQuien() {
        return modifiedLogAsignacionesQuien;
    }

   /**
    * Sets the value of the <code>modifiedLogAsignacionesQuien</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogAsignacionesQuien</code>.
    */
    public void setModifiedLogAsignacionesQuien(boolean modified) {
        this.modifiedLogAsignacionesQuien = modified;
    }

   /**
    * Returns the value of the <code>logAsignacionesUsuario</code> attribute.<br>
    * Model Attribute: <code>logAsignacionesUsuario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>logAsignacionesUsuario</code> attribute.
    */

    public String getLogAsignacionesUsuario()  {
    	String value;
        value =  logAsignacionesUsuario;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logAsignacionesUsuario</code> attribute.<br>
    * Model Attribute: <code>logAsignacionesUsuario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param logAsignacionesUsuario The new value of the <code>logAsignacionesUsuario</code> attribute.
    */
    public void setLogAsignacionesUsuario (String logAsignacionesUsuario) {
        modifiedLogAsignacionesUsuario = true;
        this.logAsignacionesUsuario = logAsignacionesUsuario;
    }

   /**
    * Returns the value of the <code>modifiedLogAsignacionesUsuario</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogAsignacionesUsuario</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogAsignacionesUsuario() {
        return modifiedLogAsignacionesUsuario;
    }

   /**
    * Sets the value of the <code>modifiedLogAsignacionesUsuario</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogAsignacionesUsuario</code>.
    */
    public void setModifiedLogAsignacionesUsuario(boolean modified) {
        this.modifiedLogAsignacionesUsuario = modified;
    }

    /**
     * Returns the instance of <code>Solicitud</code> related through the <code>Solicitud</code> role.
     * Model Relationship:
     * <code>[Solicitud] Solicitud 1:1  ------ 0:M  LogAsignaciones [LogAsignaciones]</code>
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
        logAsignacionesTipo = "";
        logAsignacionesFechaHora = Timestamp.valueOf(Constants.DATETIME_DEFAULTVALUE);
        logAsignacionesQuien = "";
        logAsignacionesUsuario = "";
        solicitud = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }
    public SolicitudJpaRepository getSolicitudRepository() {
        return Arc.container().select(SolicitudJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return LogAsignaciones.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return LogAsignacionesConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedLogAsignacionesTipo = false;
    	values.put("logAsignacionesTipo", getLogAsignacionesTipo());
    	modifiedLogAsignacionesFechaHora = false;
    	values.put("logAsignacionesFechaHora", getLogAsignacionesFechaHora());
    	modifiedLogAsignacionesQuien = false;
    	values.put("logAsignacionesQuien", getLogAsignacionesQuien());
    	modifiedLogAsignacionesUsuario = false;
    	values.put("logAsignacionesUsuario", getLogAsignacionesUsuario());
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
     * Returns the <code>LogAsignacionesOid</code> object that identifies this instance of <code>LogAsignaciones</code>.
     * @return <code>LogAsignacionesOid </code> object that identifies this instance of <code>LogAsignaciones</code>
     */
	@Override
    public LogAsignacionesOid getOid() {
        return new LogAsignacionesOid(getLogAsignacionesidLogAsignaciones());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(LogAsignacionesConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(LogAsignacionesConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.LOGASIGNACIONES)) {
            // Add this class
            activeFacets.add(Constants.LOGASIGNACIONES);
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


        if (getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.MESADEAPOYO)) {
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

    public String buildDSLogAsignaciones() {
        try {
            return (getLogAsignacionesFechaHora() != null ? getLogAsignacionesFechaHora().toString() : "") + " " + getLogAsignacionesQuien() + " " + getLogAsignacionesTipo() + " " + getLogAsignacionesUsuario();
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
            relatedInstance = buildLogAsignacionesRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogAsignacionesConstants.ROLE_NAME_SOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogAsignacionesRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogAsignacionesRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogAsignaciones(mapper.readValue(relatedInstanceJsonOid, LogAsignacionesOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogAsignaciones.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildLogAsignacionesRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogAsignaciones.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
