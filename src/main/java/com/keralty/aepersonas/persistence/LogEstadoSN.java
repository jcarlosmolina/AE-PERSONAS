package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.LogEstadoSNConstants;
import com.keralty.aepersonas.global.SolicitudNovedadConstants;
import com.keralty.aepersonas.persistence.oid.LogEstadoSNOid;
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
 * Persistent representation of the <code>LogEstadoSN</code> model class.
 * <p>
 * Model Class: <code>LogEstadoSN</code><br>
 */
@Entity(name = LogEstadoSNConstants.CLASS_NAME)
@Table(name = LogEstadoSNConstants.TBL_NAME)
public class LogEstadoSN extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LogEstadoSN_Sequence")
    @SequenceGenerator(name="LogEstadoSN_Sequence", sequenceName="LogEstadoSN_Sequence", allocationSize=1)
    @Column(name = LogEstadoSNConstants.FLD_LOGESTADOSNID )
    @JsonProperty(value="id")
    private Long logEstadoSNId;

    /** Class member attribute. */
    @Column(name = LogEstadoSNConstants.FLD_LOGESTADOSNFECHA )
    @JsonProperty(value="fecha")
    private Timestamp logEstadoSNFecha;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogEstadoSNFecha;

    /** Class member attribute. */
    @Column(name = LogEstadoSNConstants.FLD_LOGESTADOSNLOGINFUNCIONARIO )
    @JsonProperty(value="loginfuncionario")
    private String logEstadoSNLoginFuncionario;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogEstadoSNLoginFuncionario;

    /** Class member attribute. */
    @Column(name = LogEstadoSNConstants.FLD_LOGESTADOSNESTADO )
    @JsonProperty(value="estado")
    private Long logEstadoSNEstado;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogEstadoSNEstado;

    /** Class member attribute. */
    @Column(name = LogEstadoSNConstants.FLD_LOGESTADOSNESTADODOC )
    @JsonProperty(value="estadodoc")
    private Long logEstadoSNEstadoDoc;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogEstadoSNEstadoDoc;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=LogEstadoSNConstants.FLD_SOLICITUDNOVEDADSOLICITUDNOVEDADID, referencedColumnName=SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADID)
    })
    @JsonIgnore
    private SolicitudNovedad solicitudNovedad;
    /** Related attribute. */
    @Column(name = LogEstadoSNConstants.FLD_SOLICITUDNOVEDADSOLICITUDNOVEDADID, insertable = false, updatable = false)
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
    public LogEstadoSN() {
        logEstadoSNId = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>LogEstadoSN</code>.
     * @param oid Object Identifier of the instance of <code>LogEstadoSN</code> to be created.
     * @throws SystemException
     */
    public LogEstadoSN(LogEstadoSNOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            logEstadoSNId = oid.getLogEstadoSNId();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>logEstadoSNId</code> attribute<br>in class <code>LogEstadoSN</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogEstadoSN</code>
     * @return The value of the <code>logEstadoSNId</code> attribute<br>in class <code>LogEstadoSN</code>.
     */
    public Long getLogEstadoSNId() {
        return logEstadoSNId;
    }

    /**
     * Sets the value of the <code>logEstadoSNId</code> attribute<br>in class <code>LogEstadoSN</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogEstadoSN</code>
     * @param logEstadoSNId The new value of the <code>logEstadoSNId</code> attribute<br>in class <code>LogEstadoSN</code>.
     */
    public void setLogEstadoSNId(Long logEstadoSNId) {
        this.logEstadoSNId = logEstadoSNId;
    }

   /**
    * Returns the value of the <code>logEstadoSNFecha</code> attribute.<br>
    * Model Attribute: <code>logEstadoSNFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @return The value of the <code>logEstadoSNFecha</code> attribute.
    */

    public Timestamp getLogEstadoSNFecha()  {
    	Timestamp value;
        value =  logEstadoSNFecha;
        return value;
    }

   /**
    * Sets the value of the <code>logEstadoSNFecha</code> attribute.<br>
    * Model Attribute: <code>logEstadoSNFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @param logEstadoSNFecha The new value of the <code>logEstadoSNFecha</code> attribute.
    */
    public void setLogEstadoSNFecha (Timestamp logEstadoSNFecha) {
        modifiedLogEstadoSNFecha = true;
        this.logEstadoSNFecha = logEstadoSNFecha;
    }

   /**
    * Returns the value of the <code>modifiedLogEstadoSNFecha</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogEstadoSNFecha</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogEstadoSNFecha() {
        return modifiedLogEstadoSNFecha;
    }

   /**
    * Sets the value of the <code>modifiedLogEstadoSNFecha</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogEstadoSNFecha</code>.
    */
    public void setModifiedLogEstadoSNFecha(boolean modified) {
        this.modifiedLogEstadoSNFecha = modified;
    }

   /**
    * Returns the value of the <code>logEstadoSNLoginFuncionario</code> attribute.<br>
    * Model Attribute: <code>logEstadoSNLoginFuncionario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>logEstadoSNLoginFuncionario</code> attribute.
    */

    public String getLogEstadoSNLoginFuncionario()  {
    	String value;
        value =  logEstadoSNLoginFuncionario;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logEstadoSNLoginFuncionario</code> attribute.<br>
    * Model Attribute: <code>logEstadoSNLoginFuncionario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param logEstadoSNLoginFuncionario The new value of the <code>logEstadoSNLoginFuncionario</code> attribute.
    */
    public void setLogEstadoSNLoginFuncionario (String logEstadoSNLoginFuncionario) {
        modifiedLogEstadoSNLoginFuncionario = true;
        this.logEstadoSNLoginFuncionario = logEstadoSNLoginFuncionario;
    }

   /**
    * Returns the value of the <code>modifiedLogEstadoSNLoginFuncionario</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogEstadoSNLoginFuncionario</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogEstadoSNLoginFuncionario() {
        return modifiedLogEstadoSNLoginFuncionario;
    }

   /**
    * Sets the value of the <code>modifiedLogEstadoSNLoginFuncionario</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogEstadoSNLoginFuncionario</code>.
    */
    public void setModifiedLogEstadoSNLoginFuncionario(boolean modified) {
        this.modifiedLogEstadoSNLoginFuncionario = modified;
    }

   /**
    * Returns the value of the <code>logEstadoSNEstado</code> attribute.<br>
    * Model Attribute: <code>logEstadoSNEstado</code>. Constant Int<br>
    * Comments: <br>
    * @return The value of the <code>logEstadoSNEstado</code> attribute.
    */

    public Long getLogEstadoSNEstado()  {
    	Long value;
        value =  logEstadoSNEstado;
        return value;
    }

   /**
    * Sets the value of the <code>logEstadoSNEstado</code> attribute.<br>
    * Model Attribute: <code>logEstadoSNEstado</code>. Constant Int<br>
    * Comments: <br>
    * @param logEstadoSNEstado The new value of the <code>logEstadoSNEstado</code> attribute.
    */
    public void setLogEstadoSNEstado (Long logEstadoSNEstado) {
        modifiedLogEstadoSNEstado = true;
        this.logEstadoSNEstado = logEstadoSNEstado;
    }

   /**
    * Returns the value of the <code>modifiedLogEstadoSNEstado</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogEstadoSNEstado</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogEstadoSNEstado() {
        return modifiedLogEstadoSNEstado;
    }

   /**
    * Sets the value of the <code>modifiedLogEstadoSNEstado</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogEstadoSNEstado</code>.
    */
    public void setModifiedLogEstadoSNEstado(boolean modified) {
        this.modifiedLogEstadoSNEstado = modified;
    }

   /**
    * Returns the value of the <code>logEstadoSNEstadoDoc</code> attribute.<br>
    * Model Attribute: <code>logEstadoSNEstadoDoc</code>. Constant Nat<br>
    * Comments: GdC-26 Req. 18: Auditoria cambio estado de la documentación
Se requiere que cuando se realiza un cambio de estado a la documentación este quede auditado en el existente histórico de estados de la solicitud.
<br>
    * @return The value of the <code>logEstadoSNEstadoDoc</code> attribute.
    */

    public Long getLogEstadoSNEstadoDoc()  {
    	Long value;
        value =  logEstadoSNEstadoDoc;
        return value;
    }

   /**
    * Sets the value of the <code>logEstadoSNEstadoDoc</code> attribute.<br>
    * Model Attribute: <code>logEstadoSNEstadoDoc</code>. Constant Nat<br>
    * Comments: GdC-26 Req. 18: Auditoria cambio estado de la documentación
Se requiere que cuando se realiza un cambio de estado a la documentación este quede auditado en el existente histórico de estados de la solicitud.
<br>
    * @param logEstadoSNEstadoDoc The new value of the <code>logEstadoSNEstadoDoc</code> attribute.
    */
    public void setLogEstadoSNEstadoDoc (Long logEstadoSNEstadoDoc) {
        modifiedLogEstadoSNEstadoDoc = true;
        this.logEstadoSNEstadoDoc = logEstadoSNEstadoDoc;
    }

   /**
    * Returns the value of the <code>modifiedLogEstadoSNEstadoDoc</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogEstadoSNEstadoDoc</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogEstadoSNEstadoDoc() {
        return modifiedLogEstadoSNEstadoDoc;
    }

   /**
    * Sets the value of the <code>modifiedLogEstadoSNEstadoDoc</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogEstadoSNEstadoDoc</code>.
    */
    public void setModifiedLogEstadoSNEstadoDoc(boolean modified) {
        this.modifiedLogEstadoSNEstadoDoc = modified;
    }

    /**
     * Returns the instance of <code>SolicitudNovedad</code> related through the <code>SolicitudNovedad</code> role.
     * Model Relationship:
     * <code>[SolicitudNovedad] SolicitudNovedad 1:1  ------ 0:M  LogEstados [LogEstadoSN]</code>
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
        logEstadoSNFecha = Timestamp.valueOf(Constants.DATETIME_DEFAULTVALUE);
        logEstadoSNLoginFuncionario = "";
        logEstadoSNEstado = Long.valueOf(0);
        logEstadoSNEstadoDoc = Long.valueOf(0);
        solicitudNovedad = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return LogEstadoSN.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return LogEstadoSNConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedLogEstadoSNFecha = false;
    	values.put("logEstadoSNFecha", getLogEstadoSNFecha());
    	modifiedLogEstadoSNLoginFuncionario = false;
    	values.put("logEstadoSNLoginFuncionario", getLogEstadoSNLoginFuncionario());
    	modifiedLogEstadoSNEstado = false;
    	values.put("logEstadoSNEstado", getLogEstadoSNEstado());
    	modifiedLogEstadoSNEstadoDoc = false;
    	values.put("logEstadoSNEstadoDoc", getLogEstadoSNEstadoDoc());
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
     * Returns the <code>LogEstadoSNOid</code> object that identifies this instance of <code>LogEstadoSN</code>.
     * @return <code>LogEstadoSNOid </code> object that identifies this instance of <code>LogEstadoSN</code>
     */
	@Override
    public LogEstadoSNOid getOid() {
        return new LogEstadoSNOid(getLogEstadoSNId());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(LogEstadoSNConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(LogEstadoSNConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.LOGESTADOSN)) {
            // Add this class
            activeFacets.add(Constants.LOGESTADOSN);
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


        if (getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.ASESOR) || getAgent().isFacetActive(Constants.AFILIACIONES) || getAgent().isFacetActive(Constants.GESTOR) || getAgent().isFacetActive(Constants.MESADEAPOYO)) {
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
            relatedInstance = buildLogEstadoSNRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogEstadoSNConstants.ROLE_NAME_SOLICITUDNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogEstadoSNRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogEstadoSNRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogEstadoSN(mapper.readValue(relatedInstanceJsonOid, LogEstadoSNOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogEstadoSN.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildLogEstadoSNRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogEstadoSN.class).error(e.getMessage());
            return null;
        }
    }
}
