package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.LogContratosExentosFIngresoConstants;
import com.keralty.aepersonas.persistence.oid.LogContratosExentosFIngresoOid;
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
 * Persistent representation of the <code>LogContratosExentosFIngreso</code> model class.
 * <p>
 * Model Class: <code>LogContratosExentosFIngreso</code><br>
 */
@Entity(name = LogContratosExentosFIngresoConstants.CLASS_NAME)
@Table(name = LogContratosExentosFIngresoConstants.TBL_NAME)
public class LogContratosExentosFIngreso extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LogContratosExentosFI_Sequence")
    @SequenceGenerator(name="LogContratosExentosFI_Sequence", sequenceName="LogContratosExentosFI_Sequence", allocationSize=1)
    @Column(name = LogContratosExentosFIngresoConstants.FLD_LOGCONTRATOSEXENTOSFINGRESOIDLOGCONTRATOSEXENTOSFINGRESO )
    @JsonProperty(value="id_logcontratosexentosfingreso")
    private Long logContratosExentosFIngresoidLogContratosExentosFIngreso;

    /** Class member attribute. */
    @Column(name = LogContratosExentosFIngresoConstants.FLD_LOGCONTRATOSEXENTOSFINGRESOFECHA )
    @JsonProperty(value="fecha")
    private Timestamp logContratosExentosFIngresoFecha;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogContratosExentosFIngresoFecha;

    /** Class member attribute. */
    @Column(name = LogContratosExentosFIngresoConstants.FLD_LOGCONTRATOSEXENTOSFINGRESOLOGINFUNCIONARIO )
    @JsonProperty(value="loginfuncionario")
    private String logContratosExentosFIngresoLoginFuncionario;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogContratosExentosFIngresoLoginFuncionario;

    /** Class member attribute. */
    @Column(name = LogContratosExentosFIngresoConstants.FLD_LOGCONTRATOSEXENTOSFINGRESOACCION )
    @JsonProperty(value="accion")
    private String logContratosExentosFIngresoAccion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogContratosExentosFIngresoAccion;

    /** Class member attribute. */
    @Column(name = LogContratosExentosFIngresoConstants.FLD_LOGCONTRATOSEXENTOSFINGRESONUMCONTRATO )
    @JsonProperty(value="numcontrato")
    private String logContratosExentosFIngresoNumContrato;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogContratosExentosFIngresoNumContrato;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public LogContratosExentosFIngreso() {
        logContratosExentosFIngresoidLogContratosExentosFIngreso = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>LogContratosExentosFIngreso</code>.
     * @param oid Object Identifier of the instance of <code>LogContratosExentosFIngreso</code> to be created.
     * @throws SystemException
     */
    public LogContratosExentosFIngreso(LogContratosExentosFIngresoOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            logContratosExentosFIngresoidLogContratosExentosFIngreso = oid.getLogContratosExentosFIngresoidLogContratosExentosFIngreso();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>logContratosExentosFIngresoidLogContratosExentosFIngreso</code> attribute<br>in class <code>LogContratosExentosFIngreso</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogContratosExentosFIngreso</code>
     * @return The value of the <code>logContratosExentosFIngresoidLogContratosExentosFIngreso</code> attribute<br>in class <code>LogContratosExentosFIngreso</code>.
     */
    public Long getLogContratosExentosFIngresoidLogContratosExentosFIngreso() {
        return logContratosExentosFIngresoidLogContratosExentosFIngreso;
    }

    /**
     * Sets the value of the <code>logContratosExentosFIngresoidLogContratosExentosFIngreso</code> attribute<br>in class <code>LogContratosExentosFIngreso</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogContratosExentosFIngreso</code>
     * @param logContratosExentosFIngresoidLogContratosExentosFIngreso The new value of the <code>logContratosExentosFIngresoidLogContratosExentosFIngreso</code> attribute<br>in class <code>LogContratosExentosFIngreso</code>.
     */
    public void setLogContratosExentosFIngresoidLogContratosExentosFIngreso(Long logContratosExentosFIngresoidLogContratosExentosFIngreso) {
        this.logContratosExentosFIngresoidLogContratosExentosFIngreso = logContratosExentosFIngresoidLogContratosExentosFIngreso;
    }

   /**
    * Returns the value of the <code>logContratosExentosFIngresoFecha</code> attribute.<br>
    * Model Attribute: <code>logContratosExentosFIngresoFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @return The value of the <code>logContratosExentosFIngresoFecha</code> attribute.
    */

    public Timestamp getLogContratosExentosFIngresoFecha()  {
    	Timestamp value;
        value =  logContratosExentosFIngresoFecha;
        return value;
    }

   /**
    * Sets the value of the <code>logContratosExentosFIngresoFecha</code> attribute.<br>
    * Model Attribute: <code>logContratosExentosFIngresoFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @param logContratosExentosFIngresoFecha The new value of the <code>logContratosExentosFIngresoFecha</code> attribute.
    */
    public void setLogContratosExentosFIngresoFecha (Timestamp logContratosExentosFIngresoFecha) {
        modifiedLogContratosExentosFIngresoFecha = true;
        this.logContratosExentosFIngresoFecha = logContratosExentosFIngresoFecha;
    }

   /**
    * Returns the value of the <code>modifiedLogContratosExentosFIngresoFecha</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogContratosExentosFIngresoFecha</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogContratosExentosFIngresoFecha() {
        return modifiedLogContratosExentosFIngresoFecha;
    }

   /**
    * Sets the value of the <code>modifiedLogContratosExentosFIngresoFecha</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogContratosExentosFIngresoFecha</code>.
    */
    public void setModifiedLogContratosExentosFIngresoFecha(boolean modified) {
        this.modifiedLogContratosExentosFIngresoFecha = modified;
    }

   /**
    * Returns the value of the <code>logContratosExentosFIngresoLoginFuncionario</code> attribute.<br>
    * Model Attribute: <code>logContratosExentosFIngresoLoginFuncionario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>logContratosExentosFIngresoLoginFuncionario</code> attribute.
    */

    public String getLogContratosExentosFIngresoLoginFuncionario()  {
    	String value;
        value =  logContratosExentosFIngresoLoginFuncionario;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logContratosExentosFIngresoLoginFuncionario</code> attribute.<br>
    * Model Attribute: <code>logContratosExentosFIngresoLoginFuncionario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param logContratosExentosFIngresoLoginFuncionario The new value of the <code>logContratosExentosFIngresoLoginFuncionario</code> attribute.
    */
    public void setLogContratosExentosFIngresoLoginFuncionario (String logContratosExentosFIngresoLoginFuncionario) {
        modifiedLogContratosExentosFIngresoLoginFuncionario = true;
        this.logContratosExentosFIngresoLoginFuncionario = logContratosExentosFIngresoLoginFuncionario;
    }

   /**
    * Returns the value of the <code>modifiedLogContratosExentosFIngresoLoginFuncionario</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogContratosExentosFIngresoLoginFuncionario</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogContratosExentosFIngresoLoginFuncionario() {
        return modifiedLogContratosExentosFIngresoLoginFuncionario;
    }

   /**
    * Sets the value of the <code>modifiedLogContratosExentosFIngresoLoginFuncionario</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogContratosExentosFIngresoLoginFuncionario</code>.
    */
    public void setModifiedLogContratosExentosFIngresoLoginFuncionario(boolean modified) {
        this.modifiedLogContratosExentosFIngresoLoginFuncionario = modified;
    }

   /**
    * Returns the value of the <code>logContratosExentosFIngresoAccion</code> attribute.<br>
    * Model Attribute: <code>logContratosExentosFIngresoAccion</code>. Constant String Size=15<br>
    * Comments: <br>
    * @return The value of the <code>logContratosExentosFIngresoAccion</code> attribute.
    */

    public String getLogContratosExentosFIngresoAccion()  {
    	String value;
        value =  logContratosExentosFIngresoAccion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logContratosExentosFIngresoAccion</code> attribute.<br>
    * Model Attribute: <code>logContratosExentosFIngresoAccion</code>. Constant String Size=15<br>
    * Comments: <br>
    * @param logContratosExentosFIngresoAccion The new value of the <code>logContratosExentosFIngresoAccion</code> attribute.
    */
    public void setLogContratosExentosFIngresoAccion (String logContratosExentosFIngresoAccion) {
        modifiedLogContratosExentosFIngresoAccion = true;
        this.logContratosExentosFIngresoAccion = logContratosExentosFIngresoAccion;
    }

   /**
    * Returns the value of the <code>modifiedLogContratosExentosFIngresoAccion</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogContratosExentosFIngresoAccion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogContratosExentosFIngresoAccion() {
        return modifiedLogContratosExentosFIngresoAccion;
    }

   /**
    * Sets the value of the <code>modifiedLogContratosExentosFIngresoAccion</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogContratosExentosFIngresoAccion</code>.
    */
    public void setModifiedLogContratosExentosFIngresoAccion(boolean modified) {
        this.modifiedLogContratosExentosFIngresoAccion = modified;
    }

   /**
    * Returns the value of the <code>logContratosExentosFIngresoNumContrato</code> attribute.<br>
    * Model Attribute: <code>logContratosExentosFIngresoNumContrato</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>logContratosExentosFIngresoNumContrato</code> attribute.
    */

    public String getLogContratosExentosFIngresoNumContrato()  {
    	String value;
        value =  logContratosExentosFIngresoNumContrato;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logContratosExentosFIngresoNumContrato</code> attribute.<br>
    * Model Attribute: <code>logContratosExentosFIngresoNumContrato</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param logContratosExentosFIngresoNumContrato The new value of the <code>logContratosExentosFIngresoNumContrato</code> attribute.
    */
    public void setLogContratosExentosFIngresoNumContrato (String logContratosExentosFIngresoNumContrato) {
        modifiedLogContratosExentosFIngresoNumContrato = true;
        this.logContratosExentosFIngresoNumContrato = logContratosExentosFIngresoNumContrato;
    }

   /**
    * Returns the value of the <code>modifiedLogContratosExentosFIngresoNumContrato</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogContratosExentosFIngresoNumContrato</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogContratosExentosFIngresoNumContrato() {
        return modifiedLogContratosExentosFIngresoNumContrato;
    }

   /**
    * Sets the value of the <code>modifiedLogContratosExentosFIngresoNumContrato</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogContratosExentosFIngresoNumContrato</code>.
    */
    public void setModifiedLogContratosExentosFIngresoNumContrato(boolean modified) {
        this.modifiedLogContratosExentosFIngresoNumContrato = modified;
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
        logContratosExentosFIngresoFecha = Timestamp.valueOf(Constants.DATETIME_DEFAULTVALUE);
        logContratosExentosFIngresoLoginFuncionario = "";
        logContratosExentosFIngresoAccion = "";
        logContratosExentosFIngresoNumContrato = "";
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return LogContratosExentosFIngreso.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return LogContratosExentosFIngresoConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
    }


   /**
    * This method sets all flags modifiers with false value.
    */
	@Override	
    public void clearModifiedFlags() {
    	values = new HashMap<>();
    	modifiedLogContratosExentosFIngresoFecha = false;
    	values.put("logContratosExentosFIngresoFecha", getLogContratosExentosFIngresoFecha());
    	modifiedLogContratosExentosFIngresoLoginFuncionario = false;
    	values.put("logContratosExentosFIngresoLoginFuncionario", getLogContratosExentosFIngresoLoginFuncionario());
    	modifiedLogContratosExentosFIngresoAccion = false;
    	values.put("logContratosExentosFIngresoAccion", getLogContratosExentosFIngresoAccion());
    	modifiedLogContratosExentosFIngresoNumContrato = false;
    	values.put("logContratosExentosFIngresoNumContrato", getLogContratosExentosFIngresoNumContrato());
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>LogContratosExentosFIngresoOid</code> object that identifies this instance of <code>LogContratosExentosFIngreso</code>.
     * @return <code>LogContratosExentosFIngresoOid </code> object that identifies this instance of <code>LogContratosExentosFIngreso</code>
     */
	@Override
    public LogContratosExentosFIngresoOid getOid() {
        return new LogContratosExentosFIngresoOid(getLogContratosExentosFIngresoidLogContratosExentosFIngreso());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(LogContratosExentosFIngresoConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.LOGCONTRATOSEXENTOSFINGRESO)) {
            // Add this class
            activeFacets.add(Constants.LOGCONTRATOSEXENTOSFINGRESO);
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
            relatedInstance = buildLogContratosExentosFIngresoRelatedInstance(relatedInstanceJsonOid);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogContratosExentosFIngresoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogContratosExentosFIngreso(mapper.readValue(relatedInstanceJsonOid, LogContratosExentosFIngresoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogContratosExentosFIngreso.class).error(e.getMessage());
            return null;
        }
    }
}
