package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.LogPriorizacionSolConstants;
import com.keralty.aepersonas.global.PriorizacionSolicitudesConstants;
import com.keralty.aepersonas.persistence.oid.LogPriorizacionSolOid;
import com.keralty.aepersonas.persistence.oid.PriorizacionSolicitudesOid;
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
 * Persistent representation of the <code>LogPriorizacionSol</code> model class.
 * <p>
 * Model Class: <code>LogPriorizacionSol</code><br>
 */
@Entity(name = LogPriorizacionSolConstants.CLASS_NAME)
@Table(name = LogPriorizacionSolConstants.TBL_NAME)
public class LogPriorizacionSol extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LogPriorizacionSol_Sequence")
    @SequenceGenerator(name="LogPriorizacionSol_Sequence", sequenceName="LogPriorizacionSol_Sequence", allocationSize=1)
    @Column(name = LogPriorizacionSolConstants.FLD_LOGPRIORIZACIONSOLID )
    @JsonProperty(value="id")
    private Long logPriorizacionSolId;

    /** Class member attribute. */
    @Column(name = LogPriorizacionSolConstants.FLD_LOGPRIORIZACIONSOLFECHA )
    @JsonProperty(value="fecha")
    private Timestamp logPriorizacionSolFecha;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogPriorizacionSolFecha;

    /** Class member attribute. */
    @Column(name = LogPriorizacionSolConstants.FLD_LOGPRIORIZACIONSOLLOGINFUNCIONARIO )
    @JsonProperty(value="loginfuncionario")
    private String logPriorizacionSolLoginFuncionario;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogPriorizacionSolLoginFuncionario;

    /** Class member attribute. */
    @Column(name = LogPriorizacionSolConstants.FLD_LOGPRIORIZACIONSOLESTADOSOLICITUD )
    @JsonProperty(value="estadosolicitud")
    private Long logPriorizacionSolEstadoSolicitud;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogPriorizacionSolEstadoSolicitud;

    /** Class member attribute. */
    @Column(name = LogPriorizacionSolConstants.FLD_LOGPRIORIZACIONSOLESTADODOC )
    @JsonProperty(value="estadodoc")
    private Long logPriorizacionSolEstadoDoc;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogPriorizacionSolEstadoDoc;

    /** Class member attribute. */
    @Column(name = LogPriorizacionSolConstants.FLD_LOGPRIORIZACIONSOLPRIORIDAD )
    @JsonProperty(value="prioridad")
    private Long logPriorizacionSolPrioridad;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogPriorizacionSolPrioridad;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=LogPriorizacionSolConstants.FLD_PRIORIZACIONSOLICITUDESPRISOLICITUDESTADOSOLICITUD, referencedColumnName=PriorizacionSolicitudesConstants.FLD_PRIORIZACIONSOLICITUDESESTADOSOLICITUD), 
        @JoinColumn(name=LogPriorizacionSolConstants.FLD_PRIORIZACIONSOLICITUDESPRISOLICITUDESTADODOC, referencedColumnName=PriorizacionSolicitudesConstants.FLD_PRIORIZACIONSOLICITUDESESTADODOC)
    })
    @JsonIgnore
    private PriorizacionSolicitudes priSolicitud;
    /** Related attribute. */
    @Column(name = LogPriorizacionSolConstants.FLD_PRIORIZACIONSOLICITUDESPRISOLICITUDESTADOSOLICITUD, insertable = false, updatable = false)
    private Long priorizacionSolicitudesPriSolicitudEstadoSolicitud;
    /** Related attribute. */
    @Column(name = LogPriorizacionSolConstants.FLD_PRIORIZACIONSOLICITUDESPRISOLICITUDESTADODOC, insertable = false, updatable = false)
    private Long priorizacionSolicitudesPriSolicitudEstadoDoc;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPriSolicitud;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public LogPriorizacionSol() {
        logPriorizacionSolId = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>LogPriorizacionSol</code>.
     * @param oid Object Identifier of the instance of <code>LogPriorizacionSol</code> to be created.
     * @throws SystemException
     */
    public LogPriorizacionSol(LogPriorizacionSolOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            logPriorizacionSolId = oid.getLogPriorizacionSolId();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>logPriorizacionSolId</code> attribute<br>in class <code>LogPriorizacionSol</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogPriorizacionSol</code>
     * @return The value of the <code>logPriorizacionSolId</code> attribute<br>in class <code>LogPriorizacionSol</code>.
     */
    public Long getLogPriorizacionSolId() {
        return logPriorizacionSolId;
    }

    /**
     * Sets the value of the <code>logPriorizacionSolId</code> attribute<br>in class <code>LogPriorizacionSol</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogPriorizacionSol</code>
     * @param logPriorizacionSolId The new value of the <code>logPriorizacionSolId</code> attribute<br>in class <code>LogPriorizacionSol</code>.
     */
    public void setLogPriorizacionSolId(Long logPriorizacionSolId) {
        this.logPriorizacionSolId = logPriorizacionSolId;
    }

   /**
    * Returns the value of the <code>logPriorizacionSolFecha</code> attribute.<br>
    * Model Attribute: <code>logPriorizacionSolFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @return The value of the <code>logPriorizacionSolFecha</code> attribute.
    */

    public Timestamp getLogPriorizacionSolFecha()  {
    	Timestamp value;
        value =  logPriorizacionSolFecha;
        return value;
    }

   /**
    * Sets the value of the <code>logPriorizacionSolFecha</code> attribute.<br>
    * Model Attribute: <code>logPriorizacionSolFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @param logPriorizacionSolFecha The new value of the <code>logPriorizacionSolFecha</code> attribute.
    */
    public void setLogPriorizacionSolFecha (Timestamp logPriorizacionSolFecha) {
        modifiedLogPriorizacionSolFecha = true;
        this.logPriorizacionSolFecha = logPriorizacionSolFecha;
    }

   /**
    * Returns the value of the <code>modifiedLogPriorizacionSolFecha</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogPriorizacionSolFecha</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogPriorizacionSolFecha() {
        return modifiedLogPriorizacionSolFecha;
    }

   /**
    * Sets the value of the <code>modifiedLogPriorizacionSolFecha</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogPriorizacionSolFecha</code>.
    */
    public void setModifiedLogPriorizacionSolFecha(boolean modified) {
        this.modifiedLogPriorizacionSolFecha = modified;
    }

   /**
    * Returns the value of the <code>logPriorizacionSolLoginFuncionario</code> attribute.<br>
    * Model Attribute: <code>logPriorizacionSolLoginFuncionario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>logPriorizacionSolLoginFuncionario</code> attribute.
    */

    public String getLogPriorizacionSolLoginFuncionario()  {
    	String value;
        value =  logPriorizacionSolLoginFuncionario;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logPriorizacionSolLoginFuncionario</code> attribute.<br>
    * Model Attribute: <code>logPriorizacionSolLoginFuncionario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param logPriorizacionSolLoginFuncionario The new value of the <code>logPriorizacionSolLoginFuncionario</code> attribute.
    */
    public void setLogPriorizacionSolLoginFuncionario (String logPriorizacionSolLoginFuncionario) {
        modifiedLogPriorizacionSolLoginFuncionario = true;
        this.logPriorizacionSolLoginFuncionario = logPriorizacionSolLoginFuncionario;
    }

   /**
    * Returns the value of the <code>modifiedLogPriorizacionSolLoginFuncionario</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogPriorizacionSolLoginFuncionario</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogPriorizacionSolLoginFuncionario() {
        return modifiedLogPriorizacionSolLoginFuncionario;
    }

   /**
    * Sets the value of the <code>modifiedLogPriorizacionSolLoginFuncionario</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogPriorizacionSolLoginFuncionario</code>.
    */
    public void setModifiedLogPriorizacionSolLoginFuncionario(boolean modified) {
        this.modifiedLogPriorizacionSolLoginFuncionario = modified;
    }

   /**
    * Returns the value of the <code>logPriorizacionSolEstadoSolicitud</code> attribute.<br>
    * Model Attribute: <code>logPriorizacionSolEstadoSolicitud</code>. Constant Int<br>
    * Comments: <br>
    * @return The value of the <code>logPriorizacionSolEstadoSolicitud</code> attribute.
    */

    public Long getLogPriorizacionSolEstadoSolicitud()  {
    	Long value;
        value =  logPriorizacionSolEstadoSolicitud;
        return value;
    }

   /**
    * Sets the value of the <code>logPriorizacionSolEstadoSolicitud</code> attribute.<br>
    * Model Attribute: <code>logPriorizacionSolEstadoSolicitud</code>. Constant Int<br>
    * Comments: <br>
    * @param logPriorizacionSolEstadoSolicitud The new value of the <code>logPriorizacionSolEstadoSolicitud</code> attribute.
    */
    public void setLogPriorizacionSolEstadoSolicitud (Long logPriorizacionSolEstadoSolicitud) {
        modifiedLogPriorizacionSolEstadoSolicitud = true;
        this.logPriorizacionSolEstadoSolicitud = logPriorizacionSolEstadoSolicitud;
    }

   /**
    * Returns the value of the <code>modifiedLogPriorizacionSolEstadoSolicitud</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogPriorizacionSolEstadoSolicitud</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogPriorizacionSolEstadoSolicitud() {
        return modifiedLogPriorizacionSolEstadoSolicitud;
    }

   /**
    * Sets the value of the <code>modifiedLogPriorizacionSolEstadoSolicitud</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogPriorizacionSolEstadoSolicitud</code>.
    */
    public void setModifiedLogPriorizacionSolEstadoSolicitud(boolean modified) {
        this.modifiedLogPriorizacionSolEstadoSolicitud = modified;
    }

   /**
    * Returns the value of the <code>logPriorizacionSolEstadoDoc</code> attribute.<br>
    * Model Attribute: <code>logPriorizacionSolEstadoDoc</code>. Constant Nat<br>
    * Comments: <br>
    * @return The value of the <code>logPriorizacionSolEstadoDoc</code> attribute.
    */

    public Long getLogPriorizacionSolEstadoDoc()  {
    	Long value;
        value =  logPriorizacionSolEstadoDoc;
        return value;
    }

   /**
    * Sets the value of the <code>logPriorizacionSolEstadoDoc</code> attribute.<br>
    * Model Attribute: <code>logPriorizacionSolEstadoDoc</code>. Constant Nat<br>
    * Comments: <br>
    * @param logPriorizacionSolEstadoDoc The new value of the <code>logPriorizacionSolEstadoDoc</code> attribute.
    */
    public void setLogPriorizacionSolEstadoDoc (Long logPriorizacionSolEstadoDoc) {
        modifiedLogPriorizacionSolEstadoDoc = true;
        this.logPriorizacionSolEstadoDoc = logPriorizacionSolEstadoDoc;
    }

   /**
    * Returns the value of the <code>modifiedLogPriorizacionSolEstadoDoc</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogPriorizacionSolEstadoDoc</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogPriorizacionSolEstadoDoc() {
        return modifiedLogPriorizacionSolEstadoDoc;
    }

   /**
    * Sets the value of the <code>modifiedLogPriorizacionSolEstadoDoc</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogPriorizacionSolEstadoDoc</code>.
    */
    public void setModifiedLogPriorizacionSolEstadoDoc(boolean modified) {
        this.modifiedLogPriorizacionSolEstadoDoc = modified;
    }

   /**
    * Returns the value of the <code>logPriorizacionSolPrioridad</code> attribute.<br>
    * Model Attribute: <code>logPriorizacionSolPrioridad</code>. Constant Nat<br>
    * Comments: <br>
    * @return The value of the <code>logPriorizacionSolPrioridad</code> attribute.
    */

    public Long getLogPriorizacionSolPrioridad()  {
    	Long value;
        value =  logPriorizacionSolPrioridad;
        return value;
    }

   /**
    * Sets the value of the <code>logPriorizacionSolPrioridad</code> attribute.<br>
    * Model Attribute: <code>logPriorizacionSolPrioridad</code>. Constant Nat<br>
    * Comments: <br>
    * @param logPriorizacionSolPrioridad The new value of the <code>logPriorizacionSolPrioridad</code> attribute.
    */
    public void setLogPriorizacionSolPrioridad (Long logPriorizacionSolPrioridad) {
        modifiedLogPriorizacionSolPrioridad = true;
        this.logPriorizacionSolPrioridad = logPriorizacionSolPrioridad;
    }

   /**
    * Returns the value of the <code>modifiedLogPriorizacionSolPrioridad</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogPriorizacionSolPrioridad</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogPriorizacionSolPrioridad() {
        return modifiedLogPriorizacionSolPrioridad;
    }

   /**
    * Sets the value of the <code>modifiedLogPriorizacionSolPrioridad</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogPriorizacionSolPrioridad</code>.
    */
    public void setModifiedLogPriorizacionSolPrioridad(boolean modified) {
        this.modifiedLogPriorizacionSolPrioridad = modified;
    }

    /**
     * Returns the instance of <code>PriorizacionSolicitudes</code> related through the <code>PriSolicitud</code> role.
     * Model Relationship:
     * <code>[PriorizacionSolicitudes] PriSolicitud 0:1  ------ 0:M  LogPriorizacionSol [LogPriorizacionSol]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>PriorizacionSolicitudes</code> related through the <code>PriSolicitud</code> role.
     */
    @JsonIgnore
    public PriorizacionSolicitudes getPriSolicitud() {
        return priSolicitud;
    }

    /**
     * Adds an instance of <code>PriorizacionSolicitudes</code> related through the <code>PriSolicitud</code> role.
     * @param priSolicitud The instance to add to the <code>PriSolicitud</code> role.
     */
    public void add2PriSolicitud(PriorizacionSolicitudes priSolicitud) {
        if (priSolicitud == null || priSolicitud.isNull()) {
            this.modifiedPriSolicitud = true;
            this.priorizacionSolicitudesPriSolicitudEstadoSolicitud = null;
            this.priorizacionSolicitudesPriSolicitudEstadoDoc = null;
        } else {
            this.priorizacionSolicitudesPriSolicitudEstadoSolicitud = priSolicitud.getPriorizacionSolicitudesEstadoSolicitud();
            this.priorizacionSolicitudesPriSolicitudEstadoDoc = priSolicitud.getPriorizacionSolicitudesEstadoDoc();
        }
        this.priSolicitud = (priSolicitud == null  || priSolicitud.isNull() ? null : priSolicitud);
    }

   /**
    * This method gets the attribute value <code>modifiedPriSolicitud</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedPriSolicitud</code> has been modified.
    */
    public boolean isModifiedPriSolicitud(){
        return modifiedPriSolicitud;
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
        logPriorizacionSolFecha = Timestamp.valueOf(Constants.DATETIME_DEFAULTVALUE);
        logPriorizacionSolLoginFuncionario = "";
        logPriorizacionSolEstadoSolicitud = Long.valueOf(0);
        logPriorizacionSolEstadoDoc = Long.valueOf(0);
        logPriorizacionSolPrioridad = Long.valueOf(0);
        priSolicitud = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return LogPriorizacionSol.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return LogPriorizacionSolConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedLogPriorizacionSolFecha = false;
    	values.put("logPriorizacionSolFecha", getLogPriorizacionSolFecha());
    	modifiedLogPriorizacionSolLoginFuncionario = false;
    	values.put("logPriorizacionSolLoginFuncionario", getLogPriorizacionSolLoginFuncionario());
    	modifiedLogPriorizacionSolEstadoSolicitud = false;
    	values.put("logPriorizacionSolEstadoSolicitud", getLogPriorizacionSolEstadoSolicitud());
    	modifiedLogPriorizacionSolEstadoDoc = false;
    	values.put("logPriorizacionSolEstadoDoc", getLogPriorizacionSolEstadoDoc());
    	modifiedLogPriorizacionSolPrioridad = false;
    	values.put("logPriorizacionSolPrioridad", getLogPriorizacionSolPrioridad());
    	modifiedPriSolicitud = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>LogPriorizacionSolOid</code> object that identifies this instance of <code>LogPriorizacionSol</code>.
     * @return <code>LogPriorizacionSolOid </code> object that identifies this instance of <code>LogPriorizacionSol</code>
     */
	@Override
    public LogPriorizacionSolOid getOid() {
        return new LogPriorizacionSolOid(getLogPriorizacionSolId());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(LogPriorizacionSolConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(LogPriorizacionSolConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.LOGPRIORIZACIONSOL)) {
            // Add this class
            activeFacets.add(Constants.LOGPRIORIZACIONSOL);
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
            relatedInstance = buildLogPriorizacionSolRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogPriorizacionSolConstants.ROLE_NAME_PRISOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogPriorizacionSolRelatedInstance4PriorizacionSolicitudes(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogPriorizacionSolRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogPriorizacionSol(mapper.readValue(relatedInstanceJsonOid, LogPriorizacionSolOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogPriorizacionSol.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildLogPriorizacionSolRelatedInstance4PriorizacionSolicitudes(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PriorizacionSolicitudes(mapper.readValue(relatedInstanceJsonOid, PriorizacionSolicitudesOid.class)): PriorizacionSolicitudes.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogPriorizacionSol.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
