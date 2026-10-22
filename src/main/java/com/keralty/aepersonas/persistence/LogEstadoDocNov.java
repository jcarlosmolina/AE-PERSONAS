package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DocumentoNovedadConstants;
import com.keralty.aepersonas.global.LogEstadoDocNovConstants;
import com.keralty.aepersonas.persistence.oid.DocumentoNovedadOid;
import com.keralty.aepersonas.persistence.oid.LogEstadoDocNovOid;
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
 * Persistent representation of the <code>LogEstadoDocNov</code> model class.
 * <p>
 * Model Class: <code>LogEstadoDocNov</code><br>
 */
@Entity(name = LogEstadoDocNovConstants.CLASS_NAME)
@Table(name = LogEstadoDocNovConstants.TBL_NAME)
public class LogEstadoDocNov extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LogEstadoDocNov_Sequence")
    @SequenceGenerator(name="LogEstadoDocNov_Sequence", sequenceName="LogEstadoDocNov_Sequence", allocationSize=1)
    @Column(name = LogEstadoDocNovConstants.FLD_LOGESTADODOCNOVID )
    @JsonProperty(value="id")
    private Long logEstadoDocNovId;

    /** Class member attribute. */
    @Column(name = LogEstadoDocNovConstants.FLD_LOGESTADODOCNOVFECHA )
    @JsonProperty(value="fecha")
    private Timestamp logEstadoDocNovFecha;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogEstadoDocNovFecha;

    /** Class member attribute. */
    @Column(name = LogEstadoDocNovConstants.FLD_LOGESTADODOCNOVNOMBREFUNCIONARIO )
    @JsonProperty(value="nombrefuncionario")
    private String logEstadoDocNovNombreFuncionario;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogEstadoDocNovNombreFuncionario;

    /** Class member attribute. */
    @Column(name = LogEstadoDocNovConstants.FLD_LOGESTADODOCNOVESTADOANTERIOR )
    @JsonProperty(value="estadoanterior")
    private Long logEstadoDocNovEstadoAnterior;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogEstadoDocNovEstadoAnterior;

    /** Class member attribute. */
    @Column(name = LogEstadoDocNovConstants.FLD_LOGESTADODOCNOVESTADONUEVO )
    @JsonProperty(value="estadonuevo")
    private Long logEstadoDocNovEstadoNuevo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogEstadoDocNovEstadoNuevo;

    /** Class member attribute. */
    @Column(name = LogEstadoDocNovConstants.FLD_LOGESTADODOCNOVOBSERVACIONS )
    @JsonProperty(value="observacions")
    private String logEstadoDocNovObservacions;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogEstadoDocNovObservacions;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=LogEstadoDocNovConstants.FLD_DOCUMENTONOVEDADIDDOCUMENTO, referencedColumnName=DocumentoNovedadConstants.FLD_DOCUMENTONOVEDADIDDOCUMENTO)
    })
    @JsonIgnore
    private DocumentoNovedad documentoNovedad;
    /** Related attribute. */
    @Column(name = LogEstadoDocNovConstants.FLD_DOCUMENTONOVEDADIDDOCUMENTO, insertable = false, updatable = false)
    private Long documentoNovedadIdDocumento;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDocumentoNovedad;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public LogEstadoDocNov() {
        logEstadoDocNovId = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>LogEstadoDocNov</code>.
     * @param oid Object Identifier of the instance of <code>LogEstadoDocNov</code> to be created.
     * @throws SystemException
     */
    public LogEstadoDocNov(LogEstadoDocNovOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            logEstadoDocNovId = oid.getLogEstadoDocNovId();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>logEstadoDocNovId</code> attribute<br>in class <code>LogEstadoDocNov</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogEstadoDocNov</code>
     * @return The value of the <code>logEstadoDocNovId</code> attribute<br>in class <code>LogEstadoDocNov</code>.
     */
    public Long getLogEstadoDocNovId() {
        return logEstadoDocNovId;
    }

    /**
     * Sets the value of the <code>logEstadoDocNovId</code> attribute<br>in class <code>LogEstadoDocNov</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogEstadoDocNov</code>
     * @param logEstadoDocNovId The new value of the <code>logEstadoDocNovId</code> attribute<br>in class <code>LogEstadoDocNov</code>.
     */
    public void setLogEstadoDocNovId(Long logEstadoDocNovId) {
        this.logEstadoDocNovId = logEstadoDocNovId;
    }

   /**
    * Returns the value of the <code>logEstadoDocNovFecha</code> attribute.<br>
    * Model Attribute: <code>logEstadoDocNovFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @return The value of the <code>logEstadoDocNovFecha</code> attribute.
    */

    public Timestamp getLogEstadoDocNovFecha()  {
    	Timestamp value;
        value =  logEstadoDocNovFecha;
        return value;
    }

   /**
    * Sets the value of the <code>logEstadoDocNovFecha</code> attribute.<br>
    * Model Attribute: <code>logEstadoDocNovFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @param logEstadoDocNovFecha The new value of the <code>logEstadoDocNovFecha</code> attribute.
    */
    public void setLogEstadoDocNovFecha (Timestamp logEstadoDocNovFecha) {
        modifiedLogEstadoDocNovFecha = true;
        this.logEstadoDocNovFecha = logEstadoDocNovFecha;
    }

   /**
    * Returns the value of the <code>modifiedLogEstadoDocNovFecha</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogEstadoDocNovFecha</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogEstadoDocNovFecha() {
        return modifiedLogEstadoDocNovFecha;
    }

   /**
    * Sets the value of the <code>modifiedLogEstadoDocNovFecha</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogEstadoDocNovFecha</code>.
    */
    public void setModifiedLogEstadoDocNovFecha(boolean modified) {
        this.modifiedLogEstadoDocNovFecha = modified;
    }

   /**
    * Returns the value of the <code>logEstadoDocNovNombreFuncionario</code> attribute.<br>
    * Model Attribute: <code>logEstadoDocNovNombreFuncionario</code>. Constant String Size=200<br>
    * Comments: <br>
    * @return The value of the <code>logEstadoDocNovNombreFuncionario</code> attribute.
    */

    public String getLogEstadoDocNovNombreFuncionario()  {
    	String value;
        value =  logEstadoDocNovNombreFuncionario;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logEstadoDocNovNombreFuncionario</code> attribute.<br>
    * Model Attribute: <code>logEstadoDocNovNombreFuncionario</code>. Constant String Size=200<br>
    * Comments: <br>
    * @param logEstadoDocNovNombreFuncionario The new value of the <code>logEstadoDocNovNombreFuncionario</code> attribute.
    */
    public void setLogEstadoDocNovNombreFuncionario (String logEstadoDocNovNombreFuncionario) {
        modifiedLogEstadoDocNovNombreFuncionario = true;
        this.logEstadoDocNovNombreFuncionario = logEstadoDocNovNombreFuncionario;
    }

   /**
    * Returns the value of the <code>modifiedLogEstadoDocNovNombreFuncionario</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogEstadoDocNovNombreFuncionario</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogEstadoDocNovNombreFuncionario() {
        return modifiedLogEstadoDocNovNombreFuncionario;
    }

   /**
    * Sets the value of the <code>modifiedLogEstadoDocNovNombreFuncionario</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogEstadoDocNovNombreFuncionario</code>.
    */
    public void setModifiedLogEstadoDocNovNombreFuncionario(boolean modified) {
        this.modifiedLogEstadoDocNovNombreFuncionario = modified;
    }

   /**
    * Returns the value of the <code>logEstadoDocNovEstadoAnterior</code> attribute.<br>
    * Model Attribute: <code>logEstadoDocNovEstadoAnterior</code>. Constant Nat<br>
    * Comments: <br>
    * @return The value of the <code>logEstadoDocNovEstadoAnterior</code> attribute.
    */

    public Long getLogEstadoDocNovEstadoAnterior()  {
    	Long value;
        value =  logEstadoDocNovEstadoAnterior;
        return value;
    }

   /**
    * Sets the value of the <code>logEstadoDocNovEstadoAnterior</code> attribute.<br>
    * Model Attribute: <code>logEstadoDocNovEstadoAnterior</code>. Constant Nat<br>
    * Comments: <br>
    * @param logEstadoDocNovEstadoAnterior The new value of the <code>logEstadoDocNovEstadoAnterior</code> attribute.
    */
    public void setLogEstadoDocNovEstadoAnterior (Long logEstadoDocNovEstadoAnterior) {
        modifiedLogEstadoDocNovEstadoAnterior = true;
        this.logEstadoDocNovEstadoAnterior = logEstadoDocNovEstadoAnterior;
    }

   /**
    * Returns the value of the <code>modifiedLogEstadoDocNovEstadoAnterior</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogEstadoDocNovEstadoAnterior</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogEstadoDocNovEstadoAnterior() {
        return modifiedLogEstadoDocNovEstadoAnterior;
    }

   /**
    * Sets the value of the <code>modifiedLogEstadoDocNovEstadoAnterior</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogEstadoDocNovEstadoAnterior</code>.
    */
    public void setModifiedLogEstadoDocNovEstadoAnterior(boolean modified) {
        this.modifiedLogEstadoDocNovEstadoAnterior = modified;
    }

   /**
    * Returns the value of the <code>logEstadoDocNovEstadoNuevo</code> attribute.<br>
    * Model Attribute: <code>logEstadoDocNovEstadoNuevo</code>. Constant Nat<br>
    * Comments: <br>
    * @return The value of the <code>logEstadoDocNovEstadoNuevo</code> attribute.
    */

    public Long getLogEstadoDocNovEstadoNuevo()  {
    	Long value;
        value =  logEstadoDocNovEstadoNuevo;
        return value;
    }

   /**
    * Sets the value of the <code>logEstadoDocNovEstadoNuevo</code> attribute.<br>
    * Model Attribute: <code>logEstadoDocNovEstadoNuevo</code>. Constant Nat<br>
    * Comments: <br>
    * @param logEstadoDocNovEstadoNuevo The new value of the <code>logEstadoDocNovEstadoNuevo</code> attribute.
    */
    public void setLogEstadoDocNovEstadoNuevo (Long logEstadoDocNovEstadoNuevo) {
        modifiedLogEstadoDocNovEstadoNuevo = true;
        this.logEstadoDocNovEstadoNuevo = logEstadoDocNovEstadoNuevo;
    }

   /**
    * Returns the value of the <code>modifiedLogEstadoDocNovEstadoNuevo</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogEstadoDocNovEstadoNuevo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogEstadoDocNovEstadoNuevo() {
        return modifiedLogEstadoDocNovEstadoNuevo;
    }

   /**
    * Sets the value of the <code>modifiedLogEstadoDocNovEstadoNuevo</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogEstadoDocNovEstadoNuevo</code>.
    */
    public void setModifiedLogEstadoDocNovEstadoNuevo(boolean modified) {
        this.modifiedLogEstadoDocNovEstadoNuevo = modified;
    }

   /**
    * Returns the value of the <code>logEstadoDocNovObservacions</code> attribute.<br>
    * Model Attribute: <code>logEstadoDocNovObservacions</code>. Constant String Size=999<br>
    * Comments: <br>
    * @return The value of the <code>logEstadoDocNovObservacions</code> attribute.
    */

    public String getLogEstadoDocNovObservacions()  {
    	String value;
        value =  logEstadoDocNovObservacions;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logEstadoDocNovObservacions</code> attribute.<br>
    * Model Attribute: <code>logEstadoDocNovObservacions</code>. Constant String Size=999<br>
    * Comments: <br>
    * @param logEstadoDocNovObservacions The new value of the <code>logEstadoDocNovObservacions</code> attribute.
    */
    public void setLogEstadoDocNovObservacions (String logEstadoDocNovObservacions) {
        modifiedLogEstadoDocNovObservacions = true;
        this.logEstadoDocNovObservacions = logEstadoDocNovObservacions;
    }

   /**
    * Returns the value of the <code>modifiedLogEstadoDocNovObservacions</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogEstadoDocNovObservacions</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogEstadoDocNovObservacions() {
        return modifiedLogEstadoDocNovObservacions;
    }

   /**
    * Sets the value of the <code>modifiedLogEstadoDocNovObservacions</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogEstadoDocNovObservacions</code>.
    */
    public void setModifiedLogEstadoDocNovObservacions(boolean modified) {
        this.modifiedLogEstadoDocNovObservacions = modified;
    }

    /**
     * Returns the instance of <code>DocumentoNovedad</code> related through the <code>DocumentoNovedad</code> role.
     * Model Relationship:
     * <code>[DocumentoNovedad] DocumentoNovedad 1:1  ------ 0:M  LogEstadoDocNov [LogEstadoDocNov]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>DocumentoNovedad</code> related through the <code>DocumentoNovedad</code> role.
     */
    @JsonIgnore
    public DocumentoNovedad getDocumentoNovedad() {
        return documentoNovedad;
    }

    /**
     * Adds an instance of <code>DocumentoNovedad</code> related through the <code>DocumentoNovedad</code> role.
     * @param documentoNovedad The instance to add to the <code>DocumentoNovedad</code> role.
     */
    public void add2DocumentoNovedad(DocumentoNovedad documentoNovedad) {
        if (documentoNovedad == null || documentoNovedad.isNull()) {
            this.modifiedDocumentoNovedad = true;
            this.documentoNovedadIdDocumento = null;
        } else {
            this.documentoNovedadIdDocumento = documentoNovedad.getDocumentoNovedadIdDocumento();
        }
        this.documentoNovedad = (documentoNovedad == null  || documentoNovedad.isNull() ? null : documentoNovedad);
    }

   /**
    * This method gets the attribute value <code>modifiedDocumentoNovedad</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDocumentoNovedad</code> has been modified.
    */
    public boolean isModifiedDocumentoNovedad(){
        return modifiedDocumentoNovedad;
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
        logEstadoDocNovFecha = Timestamp.valueOf(Constants.DATETIME_DEFAULTVALUE);
        logEstadoDocNovNombreFuncionario = "";
        logEstadoDocNovEstadoAnterior = Long.valueOf(0);
        logEstadoDocNovEstadoNuevo = Long.valueOf(0);
        logEstadoDocNovObservacions = null;
        documentoNovedad = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return LogEstadoDocNov.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return LogEstadoDocNovConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedLogEstadoDocNovFecha = false;
    	values.put("logEstadoDocNovFecha", getLogEstadoDocNovFecha());
    	modifiedLogEstadoDocNovNombreFuncionario = false;
    	values.put("logEstadoDocNovNombreFuncionario", getLogEstadoDocNovNombreFuncionario());
    	modifiedLogEstadoDocNovEstadoAnterior = false;
    	values.put("logEstadoDocNovEstadoAnterior", getLogEstadoDocNovEstadoAnterior());
    	modifiedLogEstadoDocNovEstadoNuevo = false;
    	values.put("logEstadoDocNovEstadoNuevo", getLogEstadoDocNovEstadoNuevo());
    	modifiedLogEstadoDocNovObservacions = false;
    	values.put("logEstadoDocNovObservacions", getLogEstadoDocNovObservacions());
    	modifiedDocumentoNovedad = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>LogEstadoDocNovOid</code> object that identifies this instance of <code>LogEstadoDocNov</code>.
     * @return <code>LogEstadoDocNovOid </code> object that identifies this instance of <code>LogEstadoDocNov</code>
     */
	@Override
    public LogEstadoDocNovOid getOid() {
        return new LogEstadoDocNovOid(getLogEstadoDocNovId());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(LogEstadoDocNovConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(LogEstadoDocNovConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.LOGESTADODOCNOV)) {
            // Add this class
            activeFacets.add(Constants.LOGESTADODOCNOV);
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
            relatedInstance = buildLogEstadoDocNovRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogEstadoDocNovConstants.ROLE_NAME_DOCUMENTONOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogEstadoDocNovRelatedInstance4DocumentoNovedad(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogEstadoDocNovRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogEstadoDocNov(mapper.readValue(relatedInstanceJsonOid, LogEstadoDocNovOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogEstadoDocNov.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildLogEstadoDocNovRelatedInstance4DocumentoNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DocumentoNovedad(mapper.readValue(relatedInstanceJsonOid, DocumentoNovedadOid.class)): DocumentoNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogEstadoDocNov.class).error(e.getMessage());
            return null;
        }
    }
}
