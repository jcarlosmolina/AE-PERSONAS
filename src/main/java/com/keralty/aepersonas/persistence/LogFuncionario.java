package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.FuncionarioConstants;
import com.keralty.aepersonas.global.LogFuncionarioConstants;
import com.keralty.aepersonas.persistence.oid.FuncionarioOid;
import com.keralty.aepersonas.persistence.oid.LogFuncionarioOid;
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
 * Persistent representation of the <code>LogFuncionario</code> model class.
 * <p>
 * Model Class: <code>LogFuncionario</code><br>
 */
@Entity(name = LogFuncionarioConstants.CLASS_NAME)
@Table(name = LogFuncionarioConstants.TBL_NAME)
public class LogFuncionario extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LogFuncionario_Sequence")
    @SequenceGenerator(name="LogFuncionario_Sequence", sequenceName="LogFuncionario_Sequence", allocationSize=1)
    @Column(name = LogFuncionarioConstants.FLD_LOGFUNCIONARIOID )
    @JsonProperty(value="id")
    private Long logFuncionarioId;

    /** Class member attribute. */
    @Column(name = LogFuncionarioConstants.FLD_LOGFUNCIONARIOFECHA )
    @JsonProperty(value="fecha")
    private Timestamp logFuncionarioFecha;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogFuncionarioFecha;

    /** Class member attribute. */
    @Column(name = LogFuncionarioConstants.FLD_LOGFUNCIONARIOLOGINFUNCIONARIO )
    @JsonProperty(value="loginfuncionario")
    private String logFuncionarioLoginFuncionario;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogFuncionarioLoginFuncionario;

    /** Class member attribute. */
    @Column(name = LogFuncionarioConstants.FLD_LOGFUNCIONARIODISPONIBLE )
    @JsonProperty(value="disponible")
    private Boolean logFuncionarioDisponible;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogFuncionarioDisponible;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=LogFuncionarioConstants.FLD_FUNCIONARIOFUNCIONARIOID, referencedColumnName=FuncionarioConstants.FLD_FUNCIONARIOID)
    })
    @JsonIgnore
    private Funcionario funcionario;
    /** Related attribute. */
    @Column(name = LogFuncionarioConstants.FLD_FUNCIONARIOFUNCIONARIOID, insertable = false, updatable = false)
    private Long funcionarioFuncionarioId;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFuncionario;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public LogFuncionario() {
        logFuncionarioId = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>LogFuncionario</code>.
     * @param oid Object Identifier of the instance of <code>LogFuncionario</code> to be created.
     * @throws SystemException
     */
    public LogFuncionario(LogFuncionarioOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            logFuncionarioId = oid.getLogFuncionarioId();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>logFuncionarioId</code> attribute<br>in class <code>LogFuncionario</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogFuncionario</code>
     * @return The value of the <code>logFuncionarioId</code> attribute<br>in class <code>LogFuncionario</code>.
     */
    public Long getLogFuncionarioId() {
        return logFuncionarioId;
    }

    /**
     * Sets the value of the <code>logFuncionarioId</code> attribute<br>in class <code>LogFuncionario</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogFuncionario</code>
     * @param logFuncionarioId The new value of the <code>logFuncionarioId</code> attribute<br>in class <code>LogFuncionario</code>.
     */
    public void setLogFuncionarioId(Long logFuncionarioId) {
        this.logFuncionarioId = logFuncionarioId;
    }

   /**
    * Returns the value of the <code>logFuncionarioFecha</code> attribute.<br>
    * Model Attribute: <code>logFuncionarioFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @return The value of the <code>logFuncionarioFecha</code> attribute.
    */

    public Timestamp getLogFuncionarioFecha()  {
    	Timestamp value;
        value =  logFuncionarioFecha;
        return value;
    }

   /**
    * Sets the value of the <code>logFuncionarioFecha</code> attribute.<br>
    * Model Attribute: <code>logFuncionarioFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @param logFuncionarioFecha The new value of the <code>logFuncionarioFecha</code> attribute.
    */
    public void setLogFuncionarioFecha (Timestamp logFuncionarioFecha) {
        modifiedLogFuncionarioFecha = true;
        this.logFuncionarioFecha = logFuncionarioFecha;
    }

   /**
    * Returns the value of the <code>modifiedLogFuncionarioFecha</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogFuncionarioFecha</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogFuncionarioFecha() {
        return modifiedLogFuncionarioFecha;
    }

   /**
    * Sets the value of the <code>modifiedLogFuncionarioFecha</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogFuncionarioFecha</code>.
    */
    public void setModifiedLogFuncionarioFecha(boolean modified) {
        this.modifiedLogFuncionarioFecha = modified;
    }

   /**
    * Returns the value of the <code>logFuncionarioLoginFuncionario</code> attribute.<br>
    * Model Attribute: <code>logFuncionarioLoginFuncionario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>logFuncionarioLoginFuncionario</code> attribute.
    */

    public String getLogFuncionarioLoginFuncionario()  {
    	String value;
        value =  logFuncionarioLoginFuncionario;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logFuncionarioLoginFuncionario</code> attribute.<br>
    * Model Attribute: <code>logFuncionarioLoginFuncionario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param logFuncionarioLoginFuncionario The new value of the <code>logFuncionarioLoginFuncionario</code> attribute.
    */
    public void setLogFuncionarioLoginFuncionario (String logFuncionarioLoginFuncionario) {
        modifiedLogFuncionarioLoginFuncionario = true;
        this.logFuncionarioLoginFuncionario = logFuncionarioLoginFuncionario;
    }

   /**
    * Returns the value of the <code>modifiedLogFuncionarioLoginFuncionario</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogFuncionarioLoginFuncionario</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogFuncionarioLoginFuncionario() {
        return modifiedLogFuncionarioLoginFuncionario;
    }

   /**
    * Sets the value of the <code>modifiedLogFuncionarioLoginFuncionario</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogFuncionarioLoginFuncionario</code>.
    */
    public void setModifiedLogFuncionarioLoginFuncionario(boolean modified) {
        this.modifiedLogFuncionarioLoginFuncionario = modified;
    }

   /**
    * Returns the value of the <code>logFuncionarioDisponible</code> attribute.<br>
    * Model Attribute: <code>logFuncionarioDisponible</code>. Constant Bool<br>
    * Comments: <br>
    * @return The value of the <code>logFuncionarioDisponible</code> attribute.
    */

    public Boolean getLogFuncionarioDisponible()  {
    	Boolean value;
        value =  logFuncionarioDisponible;
        return value;
    }

   /**
    * Sets the value of the <code>logFuncionarioDisponible</code> attribute.<br>
    * Model Attribute: <code>logFuncionarioDisponible</code>. Constant Bool<br>
    * Comments: <br>
    * @param logFuncionarioDisponible The new value of the <code>logFuncionarioDisponible</code> attribute.
    */
    public void setLogFuncionarioDisponible (Boolean logFuncionarioDisponible) {
        modifiedLogFuncionarioDisponible = true;
        this.logFuncionarioDisponible = logFuncionarioDisponible;
    }

   /**
    * Returns the value of the <code>modifiedLogFuncionarioDisponible</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogFuncionarioDisponible</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogFuncionarioDisponible() {
        return modifiedLogFuncionarioDisponible;
    }

   /**
    * Sets the value of the <code>modifiedLogFuncionarioDisponible</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogFuncionarioDisponible</code>.
    */
    public void setModifiedLogFuncionarioDisponible(boolean modified) {
        this.modifiedLogFuncionarioDisponible = modified;
    }

    /**
     * Returns the instance of <code>Funcionario</code> related through the <code>Funcionario</code> role.
     * Model Relationship:
     * <code>[Funcionario] Funcionario 1:1  ------ 0:M  LogFuncionario [LogFuncionario]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Funcionario</code> related through the <code>Funcionario</code> role.
     */
    @JsonIgnore
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * Adds an instance of <code>Funcionario</code> related through the <code>Funcionario</code> role.
     * @param funcionario The instance to add to the <code>Funcionario</code> role.
     */
    public void add2Funcionario(Funcionario funcionario) {
        if (funcionario == null || funcionario.isNull()) {
            this.modifiedFuncionario = true;
            this.funcionarioFuncionarioId = null;
        } else {
            this.funcionarioFuncionarioId = funcionario.getFuncionarioId();
        }
        this.funcionario = (funcionario == null  || funcionario.isNull() ? null : funcionario);
    }

   /**
    * This method gets the attribute value <code>modifiedFuncionario</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedFuncionario</code> has been modified.
    */
    public boolean isModifiedFuncionario(){
        return modifiedFuncionario;
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
        logFuncionarioFecha = Timestamp.valueOf(Constants.DATETIME_DEFAULTVALUE);
        logFuncionarioLoginFuncionario = "";
        logFuncionarioDisponible = false;
        funcionario = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return LogFuncionario.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return LogFuncionarioConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedLogFuncionarioFecha = false;
    	values.put("logFuncionarioFecha", getLogFuncionarioFecha());
    	modifiedLogFuncionarioLoginFuncionario = false;
    	values.put("logFuncionarioLoginFuncionario", getLogFuncionarioLoginFuncionario());
    	modifiedLogFuncionarioDisponible = false;
    	values.put("logFuncionarioDisponible", getLogFuncionarioDisponible());
    	modifiedFuncionario = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>LogFuncionarioOid</code> object that identifies this instance of <code>LogFuncionario</code>.
     * @return <code>LogFuncionarioOid </code> object that identifies this instance of <code>LogFuncionario</code>
     */
	@Override
    public LogFuncionarioOid getOid() {
        return new LogFuncionarioOid(getLogFuncionarioId());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(LogFuncionarioConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(LogFuncionarioConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.LOGFUNCIONARIO)) {
            // Add this class
            activeFacets.add(Constants.LOGFUNCIONARIO);
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
            relatedInstance = buildLogFuncionarioRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogFuncionarioConstants.ROLE_NAME_FUNCIONARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogFuncionarioRelatedInstance4Funcionario(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogFuncionarioRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogFuncionario(mapper.readValue(relatedInstanceJsonOid, LogFuncionarioOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogFuncionario.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildLogFuncionarioRelatedInstance4Funcionario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Funcionario(mapper.readValue(relatedInstanceJsonOid, FuncionarioOid.class)): Funcionario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogFuncionario.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
