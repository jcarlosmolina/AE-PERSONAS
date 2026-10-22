package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.LogContratoComboConstants;
import com.keralty.aepersonas.persistence.oid.LogContratoComboOid;
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
 * Persistent representation of the <code>LogContratoCombo</code> model class.
 * <p>
 * Model Class: <code>LogContratoCombo</code><br>
 */
@Entity(name = LogContratoComboConstants.CLASS_NAME)
@Table(name = LogContratoComboConstants.TBL_NAME)
public class LogContratoCombo extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LogContratoCombo_Sequence")
    @SequenceGenerator(name="LogContratoCombo_Sequence", sequenceName="LogContratoCombo_Sequence", allocationSize=1)
    @Column(name = LogContratoComboConstants.FLD_LOGCONTRATOCOMBOID )
    @JsonProperty(value="id")
    private Long logContratoComboId;

    /** Class member attribute. */
    @Column(name = LogContratoComboConstants.FLD_LOGCONTRATOCOMBOFECHA )
    @JsonProperty(value="fecha")
    private Timestamp logContratoComboFecha;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogContratoComboFecha;

    /** Class member attribute. */
    @Column(name = LogContratoComboConstants.FLD_LOGCONTRATOCOMBOLOGINFUNCIONARIO )
    @JsonProperty(value="loginfuncionario")
    private String logContratoComboLoginFuncionario;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogContratoComboLoginFuncionario;

    /** Class member attribute. */
    @Column(name = LogContratoComboConstants.FLD_LOGCONTRATOCOMBOCONTRATOINTEGRAL )
    @JsonProperty(value="contratointegral")
    private String logContratoComboContratoIntegral;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogContratoComboContratoIntegral;

    /** Class member attribute. */
    @Column(name = LogContratoComboConstants.FLD_LOGCONTRATOCOMBOCONTRATOODONTOLOGICO )
    @JsonProperty(value="contratoodontologico")
    private String logContratoComboContratoOdontologico;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogContratoComboContratoOdontologico;

    /** Class member attribute. */
    @Column(name = LogContratoComboConstants.FLD_LOGCONTRATOCOMBOACCION )
    @JsonProperty(value="accion")
    private String logContratoComboAccion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogContratoComboAccion;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public LogContratoCombo() {
        logContratoComboId = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>LogContratoCombo</code>.
     * @param oid Object Identifier of the instance of <code>LogContratoCombo</code> to be created.
     * @throws SystemException
     */
    public LogContratoCombo(LogContratoComboOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            logContratoComboId = oid.getLogContratoComboId();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>logContratoComboId</code> attribute<br>in class <code>LogContratoCombo</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogContratoCombo</code>
     * @return The value of the <code>logContratoComboId</code> attribute<br>in class <code>LogContratoCombo</code>.
     */
    public Long getLogContratoComboId() {
        return logContratoComboId;
    }

    /**
     * Sets the value of the <code>logContratoComboId</code> attribute<br>in class <code>LogContratoCombo</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogContratoCombo</code>
     * @param logContratoComboId The new value of the <code>logContratoComboId</code> attribute<br>in class <code>LogContratoCombo</code>.
     */
    public void setLogContratoComboId(Long logContratoComboId) {
        this.logContratoComboId = logContratoComboId;
    }

   /**
    * Returns the value of the <code>logContratoComboFecha</code> attribute.<br>
    * Model Attribute: <code>logContratoComboFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @return The value of the <code>logContratoComboFecha</code> attribute.
    */

    public Timestamp getLogContratoComboFecha()  {
    	Timestamp value;
        value =  logContratoComboFecha;
        return value;
    }

   /**
    * Sets the value of the <code>logContratoComboFecha</code> attribute.<br>
    * Model Attribute: <code>logContratoComboFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @param logContratoComboFecha The new value of the <code>logContratoComboFecha</code> attribute.
    */
    public void setLogContratoComboFecha (Timestamp logContratoComboFecha) {
        modifiedLogContratoComboFecha = true;
        this.logContratoComboFecha = logContratoComboFecha;
    }

   /**
    * Returns the value of the <code>modifiedLogContratoComboFecha</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogContratoComboFecha</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogContratoComboFecha() {
        return modifiedLogContratoComboFecha;
    }

   /**
    * Sets the value of the <code>modifiedLogContratoComboFecha</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogContratoComboFecha</code>.
    */
    public void setModifiedLogContratoComboFecha(boolean modified) {
        this.modifiedLogContratoComboFecha = modified;
    }

   /**
    * Returns the value of the <code>logContratoComboLoginFuncionario</code> attribute.<br>
    * Model Attribute: <code>logContratoComboLoginFuncionario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>logContratoComboLoginFuncionario</code> attribute.
    */

    public String getLogContratoComboLoginFuncionario()  {
    	String value;
        value =  logContratoComboLoginFuncionario;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logContratoComboLoginFuncionario</code> attribute.<br>
    * Model Attribute: <code>logContratoComboLoginFuncionario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param logContratoComboLoginFuncionario The new value of the <code>logContratoComboLoginFuncionario</code> attribute.
    */
    public void setLogContratoComboLoginFuncionario (String logContratoComboLoginFuncionario) {
        modifiedLogContratoComboLoginFuncionario = true;
        this.logContratoComboLoginFuncionario = logContratoComboLoginFuncionario;
    }

   /**
    * Returns the value of the <code>modifiedLogContratoComboLoginFuncionario</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogContratoComboLoginFuncionario</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogContratoComboLoginFuncionario() {
        return modifiedLogContratoComboLoginFuncionario;
    }

   /**
    * Sets the value of the <code>modifiedLogContratoComboLoginFuncionario</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogContratoComboLoginFuncionario</code>.
    */
    public void setModifiedLogContratoComboLoginFuncionario(boolean modified) {
        this.modifiedLogContratoComboLoginFuncionario = modified;
    }

   /**
    * Returns the value of the <code>logContratoComboContratoIntegral</code> attribute.<br>
    * Model Attribute: <code>logContratoComboContratoIntegral</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>logContratoComboContratoIntegral</code> attribute.
    */

    public String getLogContratoComboContratoIntegral()  {
    	String value;
        value =  logContratoComboContratoIntegral;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logContratoComboContratoIntegral</code> attribute.<br>
    * Model Attribute: <code>logContratoComboContratoIntegral</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param logContratoComboContratoIntegral The new value of the <code>logContratoComboContratoIntegral</code> attribute.
    */
    public void setLogContratoComboContratoIntegral (String logContratoComboContratoIntegral) {
        modifiedLogContratoComboContratoIntegral = true;
        this.logContratoComboContratoIntegral = logContratoComboContratoIntegral;
    }

   /**
    * Returns the value of the <code>modifiedLogContratoComboContratoIntegral</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogContratoComboContratoIntegral</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogContratoComboContratoIntegral() {
        return modifiedLogContratoComboContratoIntegral;
    }

   /**
    * Sets the value of the <code>modifiedLogContratoComboContratoIntegral</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogContratoComboContratoIntegral</code>.
    */
    public void setModifiedLogContratoComboContratoIntegral(boolean modified) {
        this.modifiedLogContratoComboContratoIntegral = modified;
    }

   /**
    * Returns the value of the <code>logContratoComboContratoOdontologico</code> attribute.<br>
    * Model Attribute: <code>logContratoComboContratoOdontologico</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>logContratoComboContratoOdontologico</code> attribute.
    */

    public String getLogContratoComboContratoOdontologico()  {
    	String value;
        value =  logContratoComboContratoOdontologico;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logContratoComboContratoOdontologico</code> attribute.<br>
    * Model Attribute: <code>logContratoComboContratoOdontologico</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param logContratoComboContratoOdontologico The new value of the <code>logContratoComboContratoOdontologico</code> attribute.
    */
    public void setLogContratoComboContratoOdontologico (String logContratoComboContratoOdontologico) {
        modifiedLogContratoComboContratoOdontologico = true;
        this.logContratoComboContratoOdontologico = logContratoComboContratoOdontologico;
    }

   /**
    * Returns the value of the <code>modifiedLogContratoComboContratoOdontologico</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogContratoComboContratoOdontologico</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogContratoComboContratoOdontologico() {
        return modifiedLogContratoComboContratoOdontologico;
    }

   /**
    * Sets the value of the <code>modifiedLogContratoComboContratoOdontologico</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogContratoComboContratoOdontologico</code>.
    */
    public void setModifiedLogContratoComboContratoOdontologico(boolean modified) {
        this.modifiedLogContratoComboContratoOdontologico = modified;
    }

   /**
    * Returns the value of the <code>logContratoComboAccion</code> attribute.<br>
    * Model Attribute: <code>logContratoComboAccion</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>logContratoComboAccion</code> attribute.
    */

    public String getLogContratoComboAccion()  {
    	String value;
        value =  logContratoComboAccion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logContratoComboAccion</code> attribute.<br>
    * Model Attribute: <code>logContratoComboAccion</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param logContratoComboAccion The new value of the <code>logContratoComboAccion</code> attribute.
    */
    public void setLogContratoComboAccion (String logContratoComboAccion) {
        modifiedLogContratoComboAccion = true;
        this.logContratoComboAccion = logContratoComboAccion;
    }

   /**
    * Returns the value of the <code>modifiedLogContratoComboAccion</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogContratoComboAccion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogContratoComboAccion() {
        return modifiedLogContratoComboAccion;
    }

   /**
    * Sets the value of the <code>modifiedLogContratoComboAccion</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogContratoComboAccion</code>.
    */
    public void setModifiedLogContratoComboAccion(boolean modified) {
        this.modifiedLogContratoComboAccion = modified;
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
        logContratoComboFecha = Timestamp.valueOf(Constants.DATETIME_DEFAULTVALUE);
        logContratoComboLoginFuncionario = "";
        logContratoComboContratoIntegral = null;
        logContratoComboContratoOdontologico = null;
        logContratoComboAccion = "";
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return LogContratoCombo.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return LogContratoComboConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
    }


   /**
    * This method sets all flags modifiers with false value.
    */
	@Override	
    public void clearModifiedFlags() {
    	values = new HashMap<>();
    	modifiedLogContratoComboFecha = false;
    	values.put("logContratoComboFecha", getLogContratoComboFecha());
    	modifiedLogContratoComboLoginFuncionario = false;
    	values.put("logContratoComboLoginFuncionario", getLogContratoComboLoginFuncionario());
    	modifiedLogContratoComboContratoIntegral = false;
    	values.put("logContratoComboContratoIntegral", getLogContratoComboContratoIntegral());
    	modifiedLogContratoComboContratoOdontologico = false;
    	values.put("logContratoComboContratoOdontologico", getLogContratoComboContratoOdontologico());
    	modifiedLogContratoComboAccion = false;
    	values.put("logContratoComboAccion", getLogContratoComboAccion());
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>LogContratoComboOid</code> object that identifies this instance of <code>LogContratoCombo</code>.
     * @return <code>LogContratoComboOid </code> object that identifies this instance of <code>LogContratoCombo</code>
     */
	@Override
    public LogContratoComboOid getOid() {
        return new LogContratoComboOid(getLogContratoComboId());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(LogContratoComboConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.LOGCONTRATOCOMBO)) {
            // Add this class
            activeFacets.add(Constants.LOGCONTRATOCOMBO);
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
            relatedInstance = buildLogContratoComboRelatedInstance(relatedInstanceJsonOid);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogContratoComboRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogContratoCombo(mapper.readValue(relatedInstanceJsonOid, LogContratoComboOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogContratoCombo.class).error(e.getMessage());
            return null;
        }
    }
}
