package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.LogParamConstants;
import com.keralty.aepersonas.global.ParamConfigConstants;
import com.keralty.aepersonas.persistence.oid.LogParamOid;
import com.keralty.aepersonas.persistence.oid.ParamConfigOid;
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
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Persistent representation of the <code>LogParam</code> model class.
 * <p>
 * Model Class: <code>LogParam</code><br>
 */
@Entity(name = LogParamConstants.CLASS_NAME)
@Table(name = LogParamConstants.TBL_NAME)
public class LogParam extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LogParam_Sequence")
    @SequenceGenerator(name="LogParam_Sequence", sequenceName="LogParam_Sequence", allocationSize=1)
    @Column(name = LogParamConstants.FLD_LOGPARAMCODIGO )
    @JsonProperty(value="codigo")
    private Long logParamCodigo;

    /** Class member attribute. */
    @Column(name = LogParamConstants.FLD_LOGPARAMFECHA )
    @JsonProperty(value="fecha")
    private Date logParamFecha;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogParamFecha;

    /** Class member attribute. */
    @Column(name = LogParamConstants.FLD_LOGPARAMUSUARIO )
    @JsonProperty(value="usuario")
    private String logParamUsuario;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogParamUsuario;

    /** Class member attribute. */
    @Column(name = LogParamConstants.FLD_LOGPARAMNOMBREUSUARIO )
    @JsonProperty(value="nombreusuario")
    private String logParamNombreUsuario;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogParamNombreUsuario;

    /** Class member attribute. */
    @Column(name = LogParamConstants.FLD_LOGPARAMVALORANTERIOR )
    @JsonProperty(value="valoranterior")
    private String logParamValorAnterior;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogParamValorAnterior;

    /** Class member attribute. */
    @Column(name = LogParamConstants.FLD_LOGPARAMNUEVOVALOR )
    @JsonProperty(value="nuevovalor")
    private String logParamNuevoValor;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogParamNuevoValor;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=LogParamConstants.FLD_PARAMCONFIGPARAMCONFIGCODIGO, referencedColumnName=ParamConfigConstants.FLD_PARAMCONFIGCODIGO)
    })
    @JsonIgnore
    private ParamConfig paramConfig;
    /** Related attribute. */
    @Column(name = LogParamConstants.FLD_PARAMCONFIGPARAMCONFIGCODIGO, insertable = false, updatable = false)
    private String paramConfigParamConfigCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedParamConfig;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public LogParam() {
        logParamCodigo = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>LogParam</code>.
     * @param oid Object Identifier of the instance of <code>LogParam</code> to be created.
     * @throws SystemException
     */
    public LogParam(LogParamOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            logParamCodigo = oid.getLogParamCodigo();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>logParamCodigo</code> attribute<br>in class <code>LogParam</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogParam</code>
     * @return The value of the <code>logParamCodigo</code> attribute<br>in class <code>LogParam</code>.
     */
    public Long getLogParamCodigo() {
        return logParamCodigo;
    }

    /**
     * Sets the value of the <code>logParamCodigo</code> attribute<br>in class <code>LogParam</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogParam</code>
     * @param logParamCodigo The new value of the <code>logParamCodigo</code> attribute<br>in class <code>LogParam</code>.
     */
    public void setLogParamCodigo(Long logParamCodigo) {
        this.logParamCodigo = logParamCodigo;
    }

   /**
    * Returns the value of the <code>logParamFecha</code> attribute.<br>
    * Model Attribute: <code>logParamFecha</code>. Constant Date<br>
    * Comments: En qué se hizo el cambio al valor del parámetro<br>
    * @return The value of the <code>logParamFecha</code> attribute.
    */

    public Date getLogParamFecha()  {
    	Date value;
        value =  logParamFecha;
        return value;
    }

   /**
    * Sets the value of the <code>logParamFecha</code> attribute.<br>
    * Model Attribute: <code>logParamFecha</code>. Constant Date<br>
    * Comments: En qué se hizo el cambio al valor del parámetro<br>
    * @param logParamFecha The new value of the <code>logParamFecha</code> attribute.
    */
    public void setLogParamFecha (Date logParamFecha) {
        modifiedLogParamFecha = true;
        this.logParamFecha = logParamFecha;
    }

   /**
    * Returns the value of the <code>modifiedLogParamFecha</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogParamFecha</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogParamFecha() {
        return modifiedLogParamFecha;
    }

   /**
    * Sets the value of the <code>modifiedLogParamFecha</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogParamFecha</code>.
    */
    public void setModifiedLogParamFecha(boolean modified) {
        this.modifiedLogParamFecha = modified;
    }

   /**
    * Returns the value of the <code>logParamUsuario</code> attribute.<br>
    * Model Attribute: <code>logParamUsuario</code>. Constant String Size=50<br>
    * Comments: Quien  hizo el cambio al valor del parámetro<br>
    * @return The value of the <code>logParamUsuario</code> attribute.
    */

    public String getLogParamUsuario()  {
    	String value;
        value =  logParamUsuario;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logParamUsuario</code> attribute.<br>
    * Model Attribute: <code>logParamUsuario</code>. Constant String Size=50<br>
    * Comments: Quien  hizo el cambio al valor del parámetro<br>
    * @param logParamUsuario The new value of the <code>logParamUsuario</code> attribute.
    */
    public void setLogParamUsuario (String logParamUsuario) {
        modifiedLogParamUsuario = true;
        this.logParamUsuario = logParamUsuario;
    }

   /**
    * Returns the value of the <code>modifiedLogParamUsuario</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogParamUsuario</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogParamUsuario() {
        return modifiedLogParamUsuario;
    }

   /**
    * Sets the value of the <code>modifiedLogParamUsuario</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogParamUsuario</code>.
    */
    public void setModifiedLogParamUsuario(boolean modified) {
        this.modifiedLogParamUsuario = modified;
    }

   /**
    * Returns the value of the <code>logParamNombreUsuario</code> attribute.<br>
    * Model Attribute: <code>logParamNombreUsuario</code>. Constant String Size=255<br>
    * Comments: <br>
    * @return The value of the <code>logParamNombreUsuario</code> attribute.
    */

    public String getLogParamNombreUsuario()  {
    	String value;
        value =  logParamNombreUsuario;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logParamNombreUsuario</code> attribute.<br>
    * Model Attribute: <code>logParamNombreUsuario</code>. Constant String Size=255<br>
    * Comments: <br>
    * @param logParamNombreUsuario The new value of the <code>logParamNombreUsuario</code> attribute.
    */
    public void setLogParamNombreUsuario (String logParamNombreUsuario) {
        modifiedLogParamNombreUsuario = true;
        this.logParamNombreUsuario = logParamNombreUsuario;
    }

   /**
    * Returns the value of the <code>modifiedLogParamNombreUsuario</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogParamNombreUsuario</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogParamNombreUsuario() {
        return modifiedLogParamNombreUsuario;
    }

   /**
    * Sets the value of the <code>modifiedLogParamNombreUsuario</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogParamNombreUsuario</code>.
    */
    public void setModifiedLogParamNombreUsuario(boolean modified) {
        this.modifiedLogParamNombreUsuario = modified;
    }

   /**
    * Returns the value of the <code>logParamValorAnterior</code> attribute.<br>
    * Model Attribute: <code>logParamValorAnterior</code>. Constant String Size=999<br>
    * Comments: El valor del parámetro antes de la modificación<br>
    * @return The value of the <code>logParamValorAnterior</code> attribute.
    */

    public String getLogParamValorAnterior()  {
    	String value;
        value =  logParamValorAnterior;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logParamValorAnterior</code> attribute.<br>
    * Model Attribute: <code>logParamValorAnterior</code>. Constant String Size=999<br>
    * Comments: El valor del parámetro antes de la modificación<br>
    * @param logParamValorAnterior The new value of the <code>logParamValorAnterior</code> attribute.
    */
    public void setLogParamValorAnterior (String logParamValorAnterior) {
        modifiedLogParamValorAnterior = true;
        this.logParamValorAnterior = logParamValorAnterior;
    }

   /**
    * Returns the value of the <code>modifiedLogParamValorAnterior</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogParamValorAnterior</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogParamValorAnterior() {
        return modifiedLogParamValorAnterior;
    }

   /**
    * Sets the value of the <code>modifiedLogParamValorAnterior</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogParamValorAnterior</code>.
    */
    public void setModifiedLogParamValorAnterior(boolean modified) {
        this.modifiedLogParamValorAnterior = modified;
    }

   /**
    * Returns the value of the <code>logParamNuevoValor</code> attribute.<br>
    * Model Attribute: <code>logParamNuevoValor</code>. Constant String Size=999<br>
    * Comments: El valor del parámetro tras la modificación<br>
    * @return The value of the <code>logParamNuevoValor</code> attribute.
    */

    public String getLogParamNuevoValor()  {
    	String value;
        value =  logParamNuevoValor;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logParamNuevoValor</code> attribute.<br>
    * Model Attribute: <code>logParamNuevoValor</code>. Constant String Size=999<br>
    * Comments: El valor del parámetro tras la modificación<br>
    * @param logParamNuevoValor The new value of the <code>logParamNuevoValor</code> attribute.
    */
    public void setLogParamNuevoValor (String logParamNuevoValor) {
        modifiedLogParamNuevoValor = true;
        this.logParamNuevoValor = logParamNuevoValor;
    }

   /**
    * Returns the value of the <code>modifiedLogParamNuevoValor</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogParamNuevoValor</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogParamNuevoValor() {
        return modifiedLogParamNuevoValor;
    }

   /**
    * Sets the value of the <code>modifiedLogParamNuevoValor</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogParamNuevoValor</code>.
    */
    public void setModifiedLogParamNuevoValor(boolean modified) {
        this.modifiedLogParamNuevoValor = modified;
    }

    /**
     * Returns the instance of <code>ParamConfig</code> related through the <code>ParamConfig</code> role.
     * Model Relationship:
     * <code>[ParamConfig] ParamConfig 1:1  ------ 0:M  Logs [LogParam]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>ParamConfig</code> related through the <code>ParamConfig</code> role.
     */
    @JsonIgnore
    public ParamConfig getParamConfig() {
        return paramConfig;
    }

    /**
     * Adds an instance of <code>ParamConfig</code> related through the <code>ParamConfig</code> role.
     * @param paramConfig The instance to add to the <code>ParamConfig</code> role.
     */
    public void add2ParamConfig(ParamConfig paramConfig) {
        if (paramConfig == null || paramConfig.isNull()) {
            this.modifiedParamConfig = true;
            this.paramConfigParamConfigCodigo = null;
        } else {
            this.paramConfigParamConfigCodigo = paramConfig.getParamConfigCodigo();
        }
        this.paramConfig = (paramConfig == null  || paramConfig.isNull() ? null : paramConfig);
    }

   /**
    * This method gets the attribute value <code>modifiedParamConfig</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedParamConfig</code> has been modified.
    */
    public boolean isModifiedParamConfig(){
        return modifiedParamConfig;
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
        logParamFecha = Date.valueOf(Constants.DATE_DEFAULTVALUE);
        logParamUsuario = "";
        logParamNombreUsuario = "";
        logParamValorAnterior = "";
        logParamNuevoValor = "";
        paramConfig = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return LogParam.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return LogParamConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedLogParamFecha = false;
    	values.put("logParamFecha", getLogParamFecha());
    	modifiedLogParamUsuario = false;
    	values.put("logParamUsuario", getLogParamUsuario());
    	modifiedLogParamNombreUsuario = false;
    	values.put("logParamNombreUsuario", getLogParamNombreUsuario());
    	modifiedLogParamValorAnterior = false;
    	values.put("logParamValorAnterior", getLogParamValorAnterior());
    	modifiedLogParamNuevoValor = false;
    	values.put("logParamNuevoValor", getLogParamNuevoValor());
    	modifiedParamConfig = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>LogParamOid</code> object that identifies this instance of <code>LogParam</code>.
     * @return <code>LogParamOid </code> object that identifies this instance of <code>LogParam</code>
     */
	@Override
    public LogParamOid getOid() {
        return new LogParamOid(getLogParamCodigo());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(LogParamConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(LogParamConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.LOGPARAM)) {
            // Add this class
            activeFacets.add(Constants.LOGPARAM);
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
            relatedInstance = buildLogParamRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogParamConstants.ROLE_NAME_PARAMCONFIG.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogParamRelatedInstance4ParamConfig(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogParamRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogParam(mapper.readValue(relatedInstanceJsonOid, LogParamOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogParam.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildLogParamRelatedInstance4ParamConfig(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ParamConfig(mapper.readValue(relatedInstanceJsonOid, ParamConfigOid.class)): ParamConfig.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogParam.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
