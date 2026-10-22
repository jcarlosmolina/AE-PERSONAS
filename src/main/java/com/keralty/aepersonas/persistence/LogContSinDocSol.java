package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.LogContSinDocSolConstants;
import com.keralty.aepersonas.persistence.oid.LogContSinDocSolOid;
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
 * Persistent representation of the <code>LogContSinDocSol</code> model class.
 * <p>
 * Model Class: <code>LogContSinDocSol</code><br>
 */
@Entity(name = LogContSinDocSolConstants.CLASS_NAME)
@Table(name = LogContSinDocSolConstants.TBL_NAME)
public class LogContSinDocSol extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LogContSinDocSol_Sequence")
    @SequenceGenerator(name="LogContSinDocSol_Sequence", sequenceName="LogContSinDocSol_Sequence", allocationSize=1)
    @Column(name = LogContSinDocSolConstants.FLD_LOGCONTSINDOCSOLIDLOGCONTSINDOCSOL )
    @JsonProperty(value="id_logcontsindocsol")
    private Long logContSinDocSolidLogContSinDocSol;

    /** Class member attribute. */
    @Column(name = LogContSinDocSolConstants.FLD_LOGCONTSINDOCSOLNUMCONTRATO )
    @JsonProperty(value="numcontrato")
    private String logContSinDocSolNumContrato;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogContSinDocSolNumContrato;

    /** Class member attribute. */
    @Column(name = LogContSinDocSolConstants.FLD_LOGCONTSINDOCSOLFECHA )
    @JsonProperty(value="fecha")
    private Timestamp logContSinDocSolFecha;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogContSinDocSolFecha;

    /** Class member attribute. */
    @Column(name = LogContSinDocSolConstants.FLD_LOGCONTSINDOCSOLUSUARIO )
    @JsonProperty(value="usuario")
    private String logContSinDocSolUsuario;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogContSinDocSolUsuario;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public LogContSinDocSol() {
        logContSinDocSolidLogContSinDocSol = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>LogContSinDocSol</code>.
     * @param oid Object Identifier of the instance of <code>LogContSinDocSol</code> to be created.
     * @throws SystemException
     */
    public LogContSinDocSol(LogContSinDocSolOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            logContSinDocSolidLogContSinDocSol = oid.getLogContSinDocSolidLogContSinDocSol();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>logContSinDocSolidLogContSinDocSol</code> attribute<br>in class <code>LogContSinDocSol</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogContSinDocSol</code>
     * @return The value of the <code>logContSinDocSolidLogContSinDocSol</code> attribute<br>in class <code>LogContSinDocSol</code>.
     */
    public Long getLogContSinDocSolidLogContSinDocSol() {
        return logContSinDocSolidLogContSinDocSol;
    }

    /**
     * Sets the value of the <code>logContSinDocSolidLogContSinDocSol</code> attribute<br>in class <code>LogContSinDocSol</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogContSinDocSol</code>
     * @param logContSinDocSolidLogContSinDocSol The new value of the <code>logContSinDocSolidLogContSinDocSol</code> attribute<br>in class <code>LogContSinDocSol</code>.
     */
    public void setLogContSinDocSolidLogContSinDocSol(Long logContSinDocSolidLogContSinDocSol) {
        this.logContSinDocSolidLogContSinDocSol = logContSinDocSolidLogContSinDocSol;
    }

   /**
    * Returns the value of the <code>logContSinDocSolNumContrato</code> attribute.<br>
    * Model Attribute: <code>logContSinDocSolNumContrato</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>logContSinDocSolNumContrato</code> attribute.
    */

    public String getLogContSinDocSolNumContrato()  {
    	String value;
        value =  logContSinDocSolNumContrato;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logContSinDocSolNumContrato</code> attribute.<br>
    * Model Attribute: <code>logContSinDocSolNumContrato</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param logContSinDocSolNumContrato The new value of the <code>logContSinDocSolNumContrato</code> attribute.
    */
    public void setLogContSinDocSolNumContrato (String logContSinDocSolNumContrato) {
        modifiedLogContSinDocSolNumContrato = true;
        this.logContSinDocSolNumContrato = logContSinDocSolNumContrato;
    }

   /**
    * Returns the value of the <code>modifiedLogContSinDocSolNumContrato</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogContSinDocSolNumContrato</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogContSinDocSolNumContrato() {
        return modifiedLogContSinDocSolNumContrato;
    }

   /**
    * Sets the value of the <code>modifiedLogContSinDocSolNumContrato</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogContSinDocSolNumContrato</code>.
    */
    public void setModifiedLogContSinDocSolNumContrato(boolean modified) {
        this.modifiedLogContSinDocSolNumContrato = modified;
    }

   /**
    * Returns the value of the <code>logContSinDocSolFecha</code> attribute.<br>
    * Model Attribute: <code>logContSinDocSolFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @return The value of the <code>logContSinDocSolFecha</code> attribute.
    */

    public Timestamp getLogContSinDocSolFecha()  {
    	Timestamp value;
        value =  logContSinDocSolFecha;
        return value;
    }

   /**
    * Sets the value of the <code>logContSinDocSolFecha</code> attribute.<br>
    * Model Attribute: <code>logContSinDocSolFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @param logContSinDocSolFecha The new value of the <code>logContSinDocSolFecha</code> attribute.
    */
    public void setLogContSinDocSolFecha (Timestamp logContSinDocSolFecha) {
        modifiedLogContSinDocSolFecha = true;
        this.logContSinDocSolFecha = logContSinDocSolFecha;
    }

   /**
    * Returns the value of the <code>modifiedLogContSinDocSolFecha</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogContSinDocSolFecha</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogContSinDocSolFecha() {
        return modifiedLogContSinDocSolFecha;
    }

   /**
    * Sets the value of the <code>modifiedLogContSinDocSolFecha</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogContSinDocSolFecha</code>.
    */
    public void setModifiedLogContSinDocSolFecha(boolean modified) {
        this.modifiedLogContSinDocSolFecha = modified;
    }

   /**
    * Returns the value of the <code>logContSinDocSolUsuario</code> attribute.<br>
    * Model Attribute: <code>logContSinDocSolUsuario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>logContSinDocSolUsuario</code> attribute.
    */

    public String getLogContSinDocSolUsuario()  {
    	String value;
        value =  logContSinDocSolUsuario;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logContSinDocSolUsuario</code> attribute.<br>
    * Model Attribute: <code>logContSinDocSolUsuario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param logContSinDocSolUsuario The new value of the <code>logContSinDocSolUsuario</code> attribute.
    */
    public void setLogContSinDocSolUsuario (String logContSinDocSolUsuario) {
        modifiedLogContSinDocSolUsuario = true;
        this.logContSinDocSolUsuario = logContSinDocSolUsuario;
    }

   /**
    * Returns the value of the <code>modifiedLogContSinDocSolUsuario</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogContSinDocSolUsuario</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogContSinDocSolUsuario() {
        return modifiedLogContSinDocSolUsuario;
    }

   /**
    * Sets the value of the <code>modifiedLogContSinDocSolUsuario</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogContSinDocSolUsuario</code>.
    */
    public void setModifiedLogContSinDocSolUsuario(boolean modified) {
        this.modifiedLogContSinDocSolUsuario = modified;
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
        logContSinDocSolNumContrato = "";
        logContSinDocSolFecha = Timestamp.valueOf(Constants.DATETIME_DEFAULTVALUE);
        logContSinDocSolUsuario = "";
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return LogContSinDocSol.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return LogContSinDocSolConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
    }


   /**
    * This method sets all flags modifiers with false value.
    */
	@Override	
    public void clearModifiedFlags() {
    	values = new HashMap<>();
    	modifiedLogContSinDocSolNumContrato = false;
    	values.put("logContSinDocSolNumContrato", getLogContSinDocSolNumContrato());
    	modifiedLogContSinDocSolFecha = false;
    	values.put("logContSinDocSolFecha", getLogContSinDocSolFecha());
    	modifiedLogContSinDocSolUsuario = false;
    	values.put("logContSinDocSolUsuario", getLogContSinDocSolUsuario());
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>LogContSinDocSolOid</code> object that identifies this instance of <code>LogContSinDocSol</code>.
     * @return <code>LogContSinDocSolOid </code> object that identifies this instance of <code>LogContSinDocSol</code>
     */
	@Override
    public LogContSinDocSolOid getOid() {
        return new LogContSinDocSolOid(getLogContSinDocSolidLogContSinDocSol());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(LogContSinDocSolConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.LOGCONTSINDOCSOL)) {
            // Add this class
            activeFacets.add(Constants.LOGCONTSINDOCSOL);
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
            relatedInstance = buildLogContSinDocSolRelatedInstance(relatedInstanceJsonOid);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogContSinDocSolRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogContSinDocSol(mapper.readValue(relatedInstanceJsonOid, LogContSinDocSolOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogContSinDocSol.class).error(e.getMessage());
            return null;
        }
    }
}
