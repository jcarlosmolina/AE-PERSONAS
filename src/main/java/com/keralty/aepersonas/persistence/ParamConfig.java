package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.ParamConfigConstants;
import com.keralty.aepersonas.persistence.oid.LogParamOid;
import com.keralty.aepersonas.persistence.oid.ParamConfigOid;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Persistent representation of the <code>ParamConfig</code> model class.
 * <p>
 * Model Class: <code>ParamConfig</code><br>
 */
@Entity(name = ParamConfigConstants.CLASS_NAME)
@Table(name = ParamConfigConstants.TBL_NAME)
public class ParamConfig extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @Column(name = ParamConfigConstants.FLD_PARAMCONFIGCODIGO )
    @JsonProperty(value="codigo")
    private String paramConfigCodigo;

    /** Class member attribute. */
    @Column(name = ParamConfigConstants.FLD_PARAMCONFIGDESCRIPCION )
    @JsonProperty(value="descripcion")
    private String paramConfigDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedParamConfigDescripcion;

    /** Class member attribute. */
    @Column(name = ParamConfigConstants.FLD_PARAMCONFIGVALOR )
    @JsonProperty(value="valor")
    private String paramConfigValor;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedParamConfigValor;

    /** Class member attribute. */
    @Column(name = ParamConfigConstants.FLD_PARAMCONFIGESNUMERICO )
    @JsonProperty(value="esnumerico")
    private Boolean paramConfigEsNumerico;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedParamConfigEsNumerico;

    /** Related Class. */
    @OneToMany(mappedBy = ParamConfigConstants.ROLE_INVNAME_LOGS)
    @JsonIgnore
    private Collection <LogParam> logs;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogs;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public ParamConfig() {
        paramConfigCodigo = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>ParamConfig</code>.
     * @param oid Object Identifier of the instance of <code>ParamConfig</code> to be created.
     * @throws SystemException
     */
    public ParamConfig(ParamConfigOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            paramConfigCodigo = oid.getParamConfigCodigo();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>paramConfigCodigo</code> attribute<br>in class <code>ParamConfig</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ParamConfig</code>
     * @return The value of the <code>paramConfigCodigo</code> attribute<br>in class <code>ParamConfig</code>.
     */
    public String getParamConfigCodigo() {
        return (paramConfigCodigo == null ? paramConfigCodigo : paramConfigCodigo.trim());
    }

    /**
     * Sets the value of the <code>paramConfigCodigo</code> attribute<br>in class <code>ParamConfig</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ParamConfig</code>
     * @param paramConfigCodigo The new value of the <code>paramConfigCodigo</code> attribute<br>in class <code>ParamConfig</code>.
     */
    public void setParamConfigCodigo(String paramConfigCodigo) {
        this.paramConfigCodigo = paramConfigCodigo;
    }

   /**
    * Returns the value of the <code>paramConfigDescripcion</code> attribute.<br>
    * Model Attribute: <code>paramConfigDescripcion</code>. Constant String Size=255<br>
    * Comments: <br>
    * @return The value of the <code>paramConfigDescripcion</code> attribute.
    */

    public String getParamConfigDescripcion()  {
    	String value;
        value =  paramConfigDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>paramConfigDescripcion</code> attribute.<br>
    * Model Attribute: <code>paramConfigDescripcion</code>. Constant String Size=255<br>
    * Comments: <br>
    * @param paramConfigDescripcion The new value of the <code>paramConfigDescripcion</code> attribute.
    */
    public void setParamConfigDescripcion (String paramConfigDescripcion) {
        modifiedParamConfigDescripcion = true;
        this.paramConfigDescripcion = paramConfigDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedParamConfigDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedParamConfigDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedParamConfigDescripcion() {
        return modifiedParamConfigDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedParamConfigDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedParamConfigDescripcion</code>.
    */
    public void setModifiedParamConfigDescripcion(boolean modified) {
        this.modifiedParamConfigDescripcion = modified;
    }

   /**
    * Returns the value of the <code>paramConfigValor</code> attribute.<br>
    * Model Attribute: <code>paramConfigValor</code>. Variable String Size=999<br>
    * Comments: <br>
    * @return The value of the <code>paramConfigValor</code> attribute.
    */

    public String getParamConfigValor()  {
    	String value;
        value =  paramConfigValor;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>paramConfigValor</code> attribute.<br>
    * Model Attribute: <code>paramConfigValor</code>. Variable String Size=999<br>
    * Comments: <br>
    * @param paramConfigValor The new value of the <code>paramConfigValor</code> attribute.
    */
    public void setParamConfigValor (String paramConfigValor) {
        modifiedParamConfigValor = true;
        this.paramConfigValor = paramConfigValor;
    }

   /**
    * Returns the value of the <code>modifiedParamConfigValor</code> class property.<br>
    *
    * @return The value of the <code>modifiedParamConfigValor</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedParamConfigValor() {
        return modifiedParamConfigValor;
    }

   /**
    * Sets the value of the <code>modifiedParamConfigValor</code> class property.<br>
    * @param modified The new value of the <code>modifiedParamConfigValor</code>.
    */
    public void setModifiedParamConfigValor(boolean modified) {
        this.modifiedParamConfigValor = modified;
    }

   /**
    * Returns the value of the <code>paramConfigEsNumerico</code> attribute.<br>
    * Model Attribute: <code>paramConfigEsNumerico</code>. Constant Bool<br>
    * Comments: Indica si el valor a dar a este parámetro es numérico. Se utilizará para comprobar en la modificación que los valores que le den sean válidos. Ya que la creación no está disponible para los administradores, les proporcionaremos los scripts. <br>
    * @return The value of the <code>paramConfigEsNumerico</code> attribute.
    */

    public Boolean getParamConfigEsNumerico()  {
    	Boolean value;
        value =  paramConfigEsNumerico;
        return value;
    }

   /**
    * Sets the value of the <code>paramConfigEsNumerico</code> attribute.<br>
    * Model Attribute: <code>paramConfigEsNumerico</code>. Constant Bool<br>
    * Comments: Indica si el valor a dar a este parámetro es numérico. Se utilizará para comprobar en la modificación que los valores que le den sean válidos. Ya que la creación no está disponible para los administradores, les proporcionaremos los scripts. <br>
    * @param paramConfigEsNumerico The new value of the <code>paramConfigEsNumerico</code> attribute.
    */
    public void setParamConfigEsNumerico (Boolean paramConfigEsNumerico) {
        modifiedParamConfigEsNumerico = true;
        this.paramConfigEsNumerico = paramConfigEsNumerico;
    }

   /**
    * Returns the value of the <code>modifiedParamConfigEsNumerico</code> class property.<br>
    *
    * @return The value of the <code>modifiedParamConfigEsNumerico</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedParamConfigEsNumerico() {
        return modifiedParamConfigEsNumerico;
    }

   /**
    * Sets the value of the <code>modifiedParamConfigEsNumerico</code> class property.<br>
    * @param modified The new value of the <code>modifiedParamConfigEsNumerico</code>.
    */
    public void setModifiedParamConfigEsNumerico(boolean modified) {
        this.modifiedParamConfigEsNumerico = modified;
    }

    /**
     * Returns the instance of <code>LogParam</code> related through the <code>Logs</code> role.
     * Model Relationship:
     * <code>[LogParam] Logs 0:M  ------ 1:1  ParamConfig [ParamConfig]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>LogParam</code> related through the <code>Logs</code> role.
     */
    @JsonIgnore
    public Collection <LogParam> getLogs() {
        return logs;
    }

    /**
     * Adds an instance of <code>LogParam</code> related through the <code>Logs</code> role.
     * @param logs The instance to add to the <code>Logs</code> role.
     */
    public void add2Logs(LogParam logs) {
        this.logs.add(logs);
    }
    /**
     * Removes an instance of <code>LogParam</code> related through the <code>Logs</code> role.
     * @param logs The instance to be removed
     */
    public void removeFromLogs(LogParam logs) {
    	this.logs.remove(logs);
    }
    /**
     * Sets instances of <code>LogParam</code> related through the <code>Logs</code> role.
     * @param logs The new value for the <code>Logs</code> role.
     */
    public void setLogs(Collection < LogParam > logs) {
        this.logs = logs;
    }

   /**
    * This method gets the attribute value <code>modifiedLogs</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedLogs</code> has been modified.
    */
    public boolean isModifiedLogs(){
        return modifiedLogs;
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
        paramConfigDescripcion = "";
        paramConfigValor = "";
        paramConfigEsNumerico = false;
        logs = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return ParamConfig.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return ParamConfigConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedParamConfigDescripcion = false;
    	values.put("paramConfigDescripcion", getParamConfigDescripcion());
    	modifiedParamConfigValor = false;
    	values.put("paramConfigValor", getParamConfigValor());
    	modifiedParamConfigEsNumerico = false;
    	values.put("paramConfigEsNumerico", getParamConfigEsNumerico());
    	modifiedLogs = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>ParamConfigOid</code> object that identifies this instance of <code>ParamConfig</code>.
     * @return <code>ParamConfigOid </code> object that identifies this instance of <code>ParamConfig</code>
     */
	@Override
    public ParamConfigOid getOid() {
        return new ParamConfigOid(getParamConfigCodigo());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(ParamConfigConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.PARAMCONFIG)) {
            // Add this class
            activeFacets.add(Constants.PARAMCONFIG);
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


        if (getAgent().isFacetActive(Constants.FUNCIONARIO) || getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.ASESOR) || getAgent().isFacetActive(Constants.AREAMEDICA) || getAgent().isFacetActive(Constants.AFILIACIONES) || getAgent().isFacetActive(Constants.RESPREGIONAL) || getAgent().isFacetActive(Constants.GESTOR) || getAgent().isFacetActive(Constants.MESADEAPOYO)) {
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
            relatedInstance = buildParamConfigRelatedInstance(relatedInstanceJsonOid);
        }
        if (ParamConfigConstants.ROLE_NAME_LOGS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildParamConfigRelatedInstance4LogParam(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildParamConfigRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ParamConfig(mapper.readValue(relatedInstanceJsonOid, ParamConfigOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ParamConfig.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildParamConfigRelatedInstance4LogParam(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new LogParam(mapper.readValue(relatedInstanceJsonOid, LogParamOid.class)): LogParam.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ParamConfig.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
