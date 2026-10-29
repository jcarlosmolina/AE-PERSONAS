package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.GrupoAsignacionConstants;
import com.keralty.aepersonas.global.LogGrupoAsignacionConstants;
import com.keralty.aepersonas.persistence.oid.GrupoAsignacionOid;
import com.keralty.aepersonas.persistence.oid.LogGrupoAsignacionOid;
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
 * Persistent representation of the <code>LogGrupoAsignacion</code> model class.
 * <p>
 * Model Class: <code>LogGrupoAsignacion</code><br>
 */
@Entity(name = LogGrupoAsignacionConstants.CLASS_NAME)
@Table(name = LogGrupoAsignacionConstants.TBL_NAME)
public class LogGrupoAsignacion extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LogGrupoAsignacion_Sequence")
    @SequenceGenerator(name="LogGrupoAsignacion_Sequence", sequenceName="LogGrupoAsignacion_Sequence", allocationSize=1)
    @Column(name = LogGrupoAsignacionConstants.FLD_LOGGRUPOASIGNACIONID )
    @JsonProperty(value="id")
    private Long logGrupoAsignacionId;

    /** Class member attribute. */
    @Column(name = LogGrupoAsignacionConstants.FLD_LOGGRUPOASIGNACIONFECHA )
    @JsonProperty(value="fecha")
    private Timestamp logGrupoAsignacionFecha;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogGrupoAsignacionFecha;

    /** Class member attribute. */
    @Column(name = LogGrupoAsignacionConstants.FLD_LOGGRUPOASIGNACIONLOGINFUNCIONARIO )
    @JsonProperty(value="loginfuncionario")
    private String logGrupoAsignacionLoginFuncionario;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogGrupoAsignacionLoginFuncionario;

    /** Class member attribute. */
    @Column(name = LogGrupoAsignacionConstants.FLD_LOGGRUPOASIGNACIONACCION )
    @JsonProperty(value="accion")
    private String logGrupoAsignacionAccion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogGrupoAsignacionAccion;

    /** Class member attribute. */
    @Column(name = LogGrupoAsignacionConstants.FLD_LOGGRUPOASIGNACIONVALOR )
    @JsonProperty(value="valor")
    private String logGrupoAsignacionValor;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogGrupoAsignacionValor;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=LogGrupoAsignacionConstants.FLD_GRUPOASIGNACIONGRUPOASIGNACIONID, referencedColumnName=GrupoAsignacionConstants.FLD_GRUPOASIGNACIONID)
    })
    @JsonIgnore
    private GrupoAsignacion grupoAsignacion;
    /** Related attribute. */
    @Column(name = LogGrupoAsignacionConstants.FLD_GRUPOASIGNACIONGRUPOASIGNACIONID, insertable = false, updatable = false)
    private Long grupoAsignacionGrupoAsignacionId;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedGrupoAsignacion;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public LogGrupoAsignacion() {
        logGrupoAsignacionId = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>LogGrupoAsignacion</code>.
     * @param oid Object Identifier of the instance of <code>LogGrupoAsignacion</code> to be created.
     * @throws SystemException
     */
    public LogGrupoAsignacion(LogGrupoAsignacionOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            logGrupoAsignacionId = oid.getLogGrupoAsignacionId();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>logGrupoAsignacionId</code> attribute<br>in class <code>LogGrupoAsignacion</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogGrupoAsignacion</code>
     * @return The value of the <code>logGrupoAsignacionId</code> attribute<br>in class <code>LogGrupoAsignacion</code>.
     */
    public Long getLogGrupoAsignacionId() {
        return logGrupoAsignacionId;
    }

    /**
     * Sets the value of the <code>logGrupoAsignacionId</code> attribute<br>in class <code>LogGrupoAsignacion</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogGrupoAsignacion</code>
     * @param logGrupoAsignacionId The new value of the <code>logGrupoAsignacionId</code> attribute<br>in class <code>LogGrupoAsignacion</code>.
     */
    public void setLogGrupoAsignacionId(Long logGrupoAsignacionId) {
        this.logGrupoAsignacionId = logGrupoAsignacionId;
    }

   /**
    * Returns the value of the <code>logGrupoAsignacionFecha</code> attribute.<br>
    * Model Attribute: <code>logGrupoAsignacionFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @return The value of the <code>logGrupoAsignacionFecha</code> attribute.
    */

    public Timestamp getLogGrupoAsignacionFecha()  {
    	Timestamp value;
        value =  logGrupoAsignacionFecha;
        return value;
    }

   /**
    * Sets the value of the <code>logGrupoAsignacionFecha</code> attribute.<br>
    * Model Attribute: <code>logGrupoAsignacionFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @param logGrupoAsignacionFecha The new value of the <code>logGrupoAsignacionFecha</code> attribute.
    */
    public void setLogGrupoAsignacionFecha (Timestamp logGrupoAsignacionFecha) {
        modifiedLogGrupoAsignacionFecha = true;
        this.logGrupoAsignacionFecha = logGrupoAsignacionFecha;
    }

   /**
    * Returns the value of the <code>modifiedLogGrupoAsignacionFecha</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogGrupoAsignacionFecha</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogGrupoAsignacionFecha() {
        return modifiedLogGrupoAsignacionFecha;
    }

   /**
    * Sets the value of the <code>modifiedLogGrupoAsignacionFecha</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogGrupoAsignacionFecha</code>.
    */
    public void setModifiedLogGrupoAsignacionFecha(boolean modified) {
        this.modifiedLogGrupoAsignacionFecha = modified;
    }

   /**
    * Returns the value of the <code>logGrupoAsignacionLoginFuncionario</code> attribute.<br>
    * Model Attribute: <code>logGrupoAsignacionLoginFuncionario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>logGrupoAsignacionLoginFuncionario</code> attribute.
    */

    public String getLogGrupoAsignacionLoginFuncionario()  {
    	String value;
        value =  logGrupoAsignacionLoginFuncionario;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logGrupoAsignacionLoginFuncionario</code> attribute.<br>
    * Model Attribute: <code>logGrupoAsignacionLoginFuncionario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param logGrupoAsignacionLoginFuncionario The new value of the <code>logGrupoAsignacionLoginFuncionario</code> attribute.
    */
    public void setLogGrupoAsignacionLoginFuncionario (String logGrupoAsignacionLoginFuncionario) {
        modifiedLogGrupoAsignacionLoginFuncionario = true;
        this.logGrupoAsignacionLoginFuncionario = logGrupoAsignacionLoginFuncionario;
    }

   /**
    * Returns the value of the <code>modifiedLogGrupoAsignacionLoginFuncionario</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogGrupoAsignacionLoginFuncionario</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogGrupoAsignacionLoginFuncionario() {
        return modifiedLogGrupoAsignacionLoginFuncionario;
    }

   /**
    * Sets the value of the <code>modifiedLogGrupoAsignacionLoginFuncionario</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogGrupoAsignacionLoginFuncionario</code>.
    */
    public void setModifiedLogGrupoAsignacionLoginFuncionario(boolean modified) {
        this.modifiedLogGrupoAsignacionLoginFuncionario = modified;
    }

   /**
    * Returns the value of the <code>logGrupoAsignacionAccion</code> attribute.<br>
    * Model Attribute: <code>logGrupoAsignacionAccion</code>. Constant String Size=50<br>
    * Comments: Edición del grupo, inserción o eliminación de usuario<br>
    * @return The value of the <code>logGrupoAsignacionAccion</code> attribute.
    */

    public String getLogGrupoAsignacionAccion()  {
    	String value;
        value =  logGrupoAsignacionAccion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logGrupoAsignacionAccion</code> attribute.<br>
    * Model Attribute: <code>logGrupoAsignacionAccion</code>. Constant String Size=50<br>
    * Comments: Edición del grupo, inserción o eliminación de usuario<br>
    * @param logGrupoAsignacionAccion The new value of the <code>logGrupoAsignacionAccion</code> attribute.
    */
    public void setLogGrupoAsignacionAccion (String logGrupoAsignacionAccion) {
        modifiedLogGrupoAsignacionAccion = true;
        this.logGrupoAsignacionAccion = logGrupoAsignacionAccion;
    }

   /**
    * Returns the value of the <code>modifiedLogGrupoAsignacionAccion</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogGrupoAsignacionAccion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogGrupoAsignacionAccion() {
        return modifiedLogGrupoAsignacionAccion;
    }

   /**
    * Sets the value of the <code>modifiedLogGrupoAsignacionAccion</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogGrupoAsignacionAccion</code>.
    */
    public void setModifiedLogGrupoAsignacionAccion(boolean modified) {
        this.modifiedLogGrupoAsignacionAccion = modified;
    }

   /**
    * Returns the value of the <code>logGrupoAsignacionValor</code> attribute.<br>
    * Model Attribute: <code>logGrupoAsignacionValor</code>. Constant String Size=200<br>
    * Comments: <br>
    * @return The value of the <code>logGrupoAsignacionValor</code> attribute.
    */

    public String getLogGrupoAsignacionValor()  {
    	String value;
        value =  logGrupoAsignacionValor;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logGrupoAsignacionValor</code> attribute.<br>
    * Model Attribute: <code>logGrupoAsignacionValor</code>. Constant String Size=200<br>
    * Comments: <br>
    * @param logGrupoAsignacionValor The new value of the <code>logGrupoAsignacionValor</code> attribute.
    */
    public void setLogGrupoAsignacionValor (String logGrupoAsignacionValor) {
        modifiedLogGrupoAsignacionValor = true;
        this.logGrupoAsignacionValor = logGrupoAsignacionValor;
    }

   /**
    * Returns the value of the <code>modifiedLogGrupoAsignacionValor</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogGrupoAsignacionValor</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogGrupoAsignacionValor() {
        return modifiedLogGrupoAsignacionValor;
    }

   /**
    * Sets the value of the <code>modifiedLogGrupoAsignacionValor</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogGrupoAsignacionValor</code>.
    */
    public void setModifiedLogGrupoAsignacionValor(boolean modified) {
        this.modifiedLogGrupoAsignacionValor = modified;
    }

    /**
     * Returns the instance of <code>GrupoAsignacion</code> related through the <code>GrupoAsignacion</code> role.
     * Model Relationship:
     * <code>[GrupoAsignacion] GrupoAsignacion 1:1  ------ 0:M  LogGrupoAsignacion [LogGrupoAsignacion]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>GrupoAsignacion</code> related through the <code>GrupoAsignacion</code> role.
     */
    @JsonIgnore
    public GrupoAsignacion getGrupoAsignacion() {
        return grupoAsignacion;
    }

    /**
     * Adds an instance of <code>GrupoAsignacion</code> related through the <code>GrupoAsignacion</code> role.
     * @param grupoAsignacion The instance to add to the <code>GrupoAsignacion</code> role.
     */
    public void add2GrupoAsignacion(GrupoAsignacion grupoAsignacion) {
        if (grupoAsignacion == null || grupoAsignacion.isNull()) {
            this.modifiedGrupoAsignacion = true;
            this.grupoAsignacionGrupoAsignacionId = null;
        } else {
            this.grupoAsignacionGrupoAsignacionId = grupoAsignacion.getGrupoAsignacionId();
        }
        this.grupoAsignacion = (grupoAsignacion == null  || grupoAsignacion.isNull() ? null : grupoAsignacion);
    }

   /**
    * This method gets the attribute value <code>modifiedGrupoAsignacion</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedGrupoAsignacion</code> has been modified.
    */
    public boolean isModifiedGrupoAsignacion(){
        return modifiedGrupoAsignacion;
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
        logGrupoAsignacionFecha = Timestamp.valueOf(Constants.DATETIME_DEFAULTVALUE);
        logGrupoAsignacionLoginFuncionario = "";
        logGrupoAsignacionAccion = "";
        logGrupoAsignacionValor = "";
        grupoAsignacion = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return LogGrupoAsignacion.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return LogGrupoAsignacionConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedLogGrupoAsignacionFecha = false;
    	values.put("logGrupoAsignacionFecha", getLogGrupoAsignacionFecha());
    	modifiedLogGrupoAsignacionLoginFuncionario = false;
    	values.put("logGrupoAsignacionLoginFuncionario", getLogGrupoAsignacionLoginFuncionario());
    	modifiedLogGrupoAsignacionAccion = false;
    	values.put("logGrupoAsignacionAccion", getLogGrupoAsignacionAccion());
    	modifiedLogGrupoAsignacionValor = false;
    	values.put("logGrupoAsignacionValor", getLogGrupoAsignacionValor());
    	modifiedGrupoAsignacion = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>LogGrupoAsignacionOid</code> object that identifies this instance of <code>LogGrupoAsignacion</code>.
     * @return <code>LogGrupoAsignacionOid </code> object that identifies this instance of <code>LogGrupoAsignacion</code>
     */
	@Override
    public LogGrupoAsignacionOid getOid() {
        return new LogGrupoAsignacionOid(getLogGrupoAsignacionId());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(LogGrupoAsignacionConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(LogGrupoAsignacionConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.LOGGRUPOASIGNACION)) {
            // Add this class
            activeFacets.add(Constants.LOGGRUPOASIGNACION);
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


        if (getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN)) {
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
            relatedInstance = buildLogGrupoAsignacionRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogGrupoAsignacionConstants.ROLE_NAME_GRUPOASIGNACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogGrupoAsignacionRelatedInstance4GrupoAsignacion(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogGrupoAsignacionRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogGrupoAsignacion(mapper.readValue(relatedInstanceJsonOid, LogGrupoAsignacionOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogGrupoAsignacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildLogGrupoAsignacionRelatedInstance4GrupoAsignacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new GrupoAsignacion(mapper.readValue(relatedInstanceJsonOid, GrupoAsignacionOid.class)): GrupoAsignacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogGrupoAsignacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
