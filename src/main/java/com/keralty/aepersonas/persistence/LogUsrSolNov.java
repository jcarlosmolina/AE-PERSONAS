package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.LogUsrSolNovConstants;
import com.keralty.aepersonas.global.SolicitudNovedadConstants;
import com.keralty.aepersonas.persistence.oid.LogUsrSolNovOid;
import com.keralty.aepersonas.persistence.oid.SolicitudNovedadOid;
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
 * Persistent representation of the <code>LogUsrSolNov</code> model class.
 * <p>
 * Model Class: <code>LogUsrSolNov</code><br>
 */
@Entity(name = LogUsrSolNovConstants.CLASS_NAME)
@Table(name = LogUsrSolNovConstants.TBL_NAME)
public class LogUsrSolNov extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LogUsrSolNov_Sequence")
    @SequenceGenerator(name="LogUsrSolNov_Sequence", sequenceName="LogUsrSolNov_Sequence", allocationSize=1)
    @Column(name = LogUsrSolNovConstants.FLD_LOGUSRSOLNOVID )
    @JsonProperty(value="id")
    private Long logUsrSolNovId;

    /** Class member attribute. */
    @Column(name = LogUsrSolNovConstants.FLD_LOGUSRSOLNOVFECHA )
    @JsonProperty(value="fecha")
    private Timestamp logUsrSolNovFecha;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogUsrSolNovFecha;

    /** Class member attribute. */
    @Column(name = LogUsrSolNovConstants.FLD_LOGUSRSOLNOVLOGINFUNCIONARIO )
    @JsonProperty(value="loginfuncionario")
    private String logUsrSolNovLoginFuncionario;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogUsrSolNovLoginFuncionario;

    /** Class member attribute. */
    @Column(name = LogUsrSolNovConstants.FLD_LOGUSRSOLNOVUSUARIO )
    @JsonProperty(value="usuario")
    private String logUsrSolNovUsuario;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogUsrSolNovUsuario;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=LogUsrSolNovConstants.FLD_SOLICITUDNOVEDADSOLICITUDNOVEDADID, referencedColumnName=SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADID)
    })
    @JsonIgnore
    private SolicitudNovedad solicitudNovedad;
    /** Related attribute. */
    @Column(name = LogUsrSolNovConstants.FLD_SOLICITUDNOVEDADSOLICITUDNOVEDADID, insertable = false, updatable = false)
    private Long solicitudNovedadSolicitudNovedadId;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedad;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public LogUsrSolNov() {
        logUsrSolNovId = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>LogUsrSolNov</code>.
     * @param oid Object Identifier of the instance of <code>LogUsrSolNov</code> to be created.
     * @throws SystemException
     */
    public LogUsrSolNov(LogUsrSolNovOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            logUsrSolNovId = oid.getLogUsrSolNovId();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>logUsrSolNovId</code> attribute<br>in class <code>LogUsrSolNov</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogUsrSolNov</code>
     * @return The value of the <code>logUsrSolNovId</code> attribute<br>in class <code>LogUsrSolNov</code>.
     */
    public Long getLogUsrSolNovId() {
        return logUsrSolNovId;
    }

    /**
     * Sets the value of the <code>logUsrSolNovId</code> attribute<br>in class <code>LogUsrSolNov</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogUsrSolNov</code>
     * @param logUsrSolNovId The new value of the <code>logUsrSolNovId</code> attribute<br>in class <code>LogUsrSolNov</code>.
     */
    public void setLogUsrSolNovId(Long logUsrSolNovId) {
        this.logUsrSolNovId = logUsrSolNovId;
    }

   /**
    * Returns the value of the <code>logUsrSolNovFecha</code> attribute.<br>
    * Model Attribute: <code>logUsrSolNovFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @return The value of the <code>logUsrSolNovFecha</code> attribute.
    */

    public Timestamp getLogUsrSolNovFecha()  {
    	Timestamp value;
        value =  logUsrSolNovFecha;
        return value;
    }

   /**
    * Sets the value of the <code>logUsrSolNovFecha</code> attribute.<br>
    * Model Attribute: <code>logUsrSolNovFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @param logUsrSolNovFecha The new value of the <code>logUsrSolNovFecha</code> attribute.
    */
    public void setLogUsrSolNovFecha (Timestamp logUsrSolNovFecha) {
        modifiedLogUsrSolNovFecha = true;
        this.logUsrSolNovFecha = logUsrSolNovFecha;
    }

   /**
    * Returns the value of the <code>modifiedLogUsrSolNovFecha</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogUsrSolNovFecha</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogUsrSolNovFecha() {
        return modifiedLogUsrSolNovFecha;
    }

   /**
    * Sets the value of the <code>modifiedLogUsrSolNovFecha</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogUsrSolNovFecha</code>.
    */
    public void setModifiedLogUsrSolNovFecha(boolean modified) {
        this.modifiedLogUsrSolNovFecha = modified;
    }

   /**
    * Returns the value of the <code>logUsrSolNovLoginFuncionario</code> attribute.<br>
    * Model Attribute: <code>logUsrSolNovLoginFuncionario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>logUsrSolNovLoginFuncionario</code> attribute.
    */

    public String getLogUsrSolNovLoginFuncionario()  {
    	String value;
        value =  logUsrSolNovLoginFuncionario;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logUsrSolNovLoginFuncionario</code> attribute.<br>
    * Model Attribute: <code>logUsrSolNovLoginFuncionario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param logUsrSolNovLoginFuncionario The new value of the <code>logUsrSolNovLoginFuncionario</code> attribute.
    */
    public void setLogUsrSolNovLoginFuncionario (String logUsrSolNovLoginFuncionario) {
        modifiedLogUsrSolNovLoginFuncionario = true;
        this.logUsrSolNovLoginFuncionario = logUsrSolNovLoginFuncionario;
    }

   /**
    * Returns the value of the <code>modifiedLogUsrSolNovLoginFuncionario</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogUsrSolNovLoginFuncionario</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogUsrSolNovLoginFuncionario() {
        return modifiedLogUsrSolNovLoginFuncionario;
    }

   /**
    * Sets the value of the <code>modifiedLogUsrSolNovLoginFuncionario</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogUsrSolNovLoginFuncionario</code>.
    */
    public void setModifiedLogUsrSolNovLoginFuncionario(boolean modified) {
        this.modifiedLogUsrSolNovLoginFuncionario = modified;
    }

   /**
    * Returns the value of the <code>logUsrSolNovUsuario</code> attribute.<br>
    * Model Attribute: <code>logUsrSolNovUsuario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>logUsrSolNovUsuario</code> attribute.
    */

    public String getLogUsrSolNovUsuario()  {
    	String value;
        value =  logUsrSolNovUsuario;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logUsrSolNovUsuario</code> attribute.<br>
    * Model Attribute: <code>logUsrSolNovUsuario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param logUsrSolNovUsuario The new value of the <code>logUsrSolNovUsuario</code> attribute.
    */
    public void setLogUsrSolNovUsuario (String logUsrSolNovUsuario) {
        modifiedLogUsrSolNovUsuario = true;
        this.logUsrSolNovUsuario = logUsrSolNovUsuario;
    }

   /**
    * Returns the value of the <code>modifiedLogUsrSolNovUsuario</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogUsrSolNovUsuario</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogUsrSolNovUsuario() {
        return modifiedLogUsrSolNovUsuario;
    }

   /**
    * Sets the value of the <code>modifiedLogUsrSolNovUsuario</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogUsrSolNovUsuario</code>.
    */
    public void setModifiedLogUsrSolNovUsuario(boolean modified) {
        this.modifiedLogUsrSolNovUsuario = modified;
    }

    /**
     * Returns the instance of <code>SolicitudNovedad</code> related through the <code>SolicitudNovedad</code> role.
     * Model Relationship:
     * <code>[SolicitudNovedad] SolicitudNovedad 1:1  ------ 0:M  LogUsrSolNov [LogUsrSolNov]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>SolicitudNovedad</code> related through the <code>SolicitudNovedad</code> role.
     */
    @JsonIgnore
    public SolicitudNovedad getSolicitudNovedad() {
        return solicitudNovedad;
    }

    /**
     * Adds an instance of <code>SolicitudNovedad</code> related through the <code>SolicitudNovedad</code> role.
     * @param solicitudNovedad The instance to add to the <code>SolicitudNovedad</code> role.
     */
    public void add2SolicitudNovedad(SolicitudNovedad solicitudNovedad) {
        if (solicitudNovedad == null || solicitudNovedad.isNull()) {
            this.modifiedSolicitudNovedad = true;
            this.solicitudNovedadSolicitudNovedadId = null;
        } else {
            this.solicitudNovedadSolicitudNovedadId = solicitudNovedad.getSolicitudNovedadId();
        }
        this.solicitudNovedad = (solicitudNovedad == null  || solicitudNovedad.isNull() ? null : solicitudNovedad);
    }

   /**
    * This method gets the attribute value <code>modifiedSolicitudNovedad</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedSolicitudNovedad</code> has been modified.
    */
    public boolean isModifiedSolicitudNovedad(){
        return modifiedSolicitudNovedad;
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
        logUsrSolNovFecha = Timestamp.valueOf(Constants.DATETIME_DEFAULTVALUE);
        logUsrSolNovLoginFuncionario = "";
        logUsrSolNovUsuario = "";
        solicitudNovedad = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return LogUsrSolNov.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return LogUsrSolNovConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedLogUsrSolNovFecha = false;
    	values.put("logUsrSolNovFecha", getLogUsrSolNovFecha());
    	modifiedLogUsrSolNovLoginFuncionario = false;
    	values.put("logUsrSolNovLoginFuncionario", getLogUsrSolNovLoginFuncionario());
    	modifiedLogUsrSolNovUsuario = false;
    	values.put("logUsrSolNovUsuario", getLogUsrSolNovUsuario());
    	modifiedSolicitudNovedad = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>LogUsrSolNovOid</code> object that identifies this instance of <code>LogUsrSolNov</code>.
     * @return <code>LogUsrSolNovOid </code> object that identifies this instance of <code>LogUsrSolNov</code>
     */
	@Override
    public LogUsrSolNovOid getOid() {
        return new LogUsrSolNovOid(getLogUsrSolNovId());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(LogUsrSolNovConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(LogUsrSolNovConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.LOGUSRSOLNOV)) {
            // Add this class
            activeFacets.add(Constants.LOGUSRSOLNOV);
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
            relatedInstance = buildLogUsrSolNovRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogUsrSolNovConstants.ROLE_NAME_SOLICITUDNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogUsrSolNovRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogUsrSolNovRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogUsrSolNov(mapper.readValue(relatedInstanceJsonOid, LogUsrSolNovOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogUsrSolNov.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildLogUsrSolNovRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogUsrSolNov.class).error(e.getMessage());
            return null;
        }
    }
}
