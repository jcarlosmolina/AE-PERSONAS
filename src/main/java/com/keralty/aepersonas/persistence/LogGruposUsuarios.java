package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DominioConstants;
import com.keralty.aepersonas.global.LogGruposUsuariosConstants;
import com.keralty.aepersonas.persistence.oid.DominioOid;
import com.keralty.aepersonas.persistence.oid.LogGruposUsuariosOid;
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
 * Persistent representation of the <code>LogGruposUsuarios</code> model class.
 * <p>
 * Model Class: <code>LogGruposUsuarios</code><br>
 */
@Entity(name = LogGruposUsuariosConstants.CLASS_NAME)
@Table(name = LogGruposUsuariosConstants.TBL_NAME)
public class LogGruposUsuarios extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LogGruposUsuarios_Sequence")
    @SequenceGenerator(name="LogGruposUsuarios_Sequence", sequenceName="LogGruposUsuarios_Sequence", allocationSize=1)
    @Column(name = LogGruposUsuariosConstants.FLD_LOGGRUPOSUSUARIOSID )
    @JsonProperty(value="id")
    private Long logGruposUsuariosId;

    /** Class member attribute. */
    @Column(name = LogGruposUsuariosConstants.FLD_LOGGRUPOSUSUARIOSFECHA )
    @JsonProperty(value="fecha")
    private Timestamp logGruposUsuariosFecha;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogGruposUsuariosFecha;

    /** Class member attribute. */
    @Column(name = LogGruposUsuariosConstants.FLD_LOGGRUPOSUSUARIOSLOGINFUNCIONARIO )
    @JsonProperty(value="loginfuncionario")
    private String logGruposUsuariosLoginFuncionario;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogGruposUsuariosLoginFuncionario;

    /** Class member attribute. */
    @Column(name = LogGruposUsuariosConstants.FLD_LOGGRUPOSUSUARIOSTIPOGRUPO )
    @JsonProperty(value="tipogrupo")
    private Long logGruposUsuariosTipoGrupo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogGruposUsuariosTipoGrupo;

    /** Class member attribute. */
    @Column(name = LogGruposUsuariosConstants.FLD_LOGGRUPOSUSUARIOSACCION )
    @JsonProperty(value="accion")
    private String logGruposUsuariosAccion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogGruposUsuariosAccion;

    /** Class member attribute. */
    @Column(name = LogGruposUsuariosConstants.FLD_LOGGRUPOSUSUARIOSGRUPO )
    @JsonProperty(value="grupo")
    private String logGruposUsuariosGrupo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogGruposUsuariosGrupo;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=LogGruposUsuariosConstants.FLD_DOMINIONUMERO, referencedColumnName=DominioConstants.FLD_DOMINIONUMERO)
    })
    @JsonIgnore
    private Dominio dominio;
    /** Related attribute. */
    @Column(name = LogGruposUsuariosConstants.FLD_DOMINIONUMERO, insertable = false, updatable = false)
    private Long dominioNumero;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominio;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public LogGruposUsuarios() {
        logGruposUsuariosId = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>LogGruposUsuarios</code>.
     * @param oid Object Identifier of the instance of <code>LogGruposUsuarios</code> to be created.
     * @throws SystemException
     */
    public LogGruposUsuarios(LogGruposUsuariosOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            logGruposUsuariosId = oid.getLogGruposUsuariosId();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>logGruposUsuariosId</code> attribute<br>in class <code>LogGruposUsuarios</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogGruposUsuarios</code>
     * @return The value of the <code>logGruposUsuariosId</code> attribute<br>in class <code>LogGruposUsuarios</code>.
     */
    public Long getLogGruposUsuariosId() {
        return logGruposUsuariosId;
    }

    /**
     * Sets the value of the <code>logGruposUsuariosId</code> attribute<br>in class <code>LogGruposUsuarios</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogGruposUsuarios</code>
     * @param logGruposUsuariosId The new value of the <code>logGruposUsuariosId</code> attribute<br>in class <code>LogGruposUsuarios</code>.
     */
    public void setLogGruposUsuariosId(Long logGruposUsuariosId) {
        this.logGruposUsuariosId = logGruposUsuariosId;
    }

   /**
    * Returns the value of the <code>logGruposUsuariosFecha</code> attribute.<br>
    * Model Attribute: <code>logGruposUsuariosFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @return The value of the <code>logGruposUsuariosFecha</code> attribute.
    */

    public Timestamp getLogGruposUsuariosFecha()  {
    	Timestamp value;
        value =  logGruposUsuariosFecha;
        return value;
    }

   /**
    * Sets the value of the <code>logGruposUsuariosFecha</code> attribute.<br>
    * Model Attribute: <code>logGruposUsuariosFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @param logGruposUsuariosFecha The new value of the <code>logGruposUsuariosFecha</code> attribute.
    */
    public void setLogGruposUsuariosFecha (Timestamp logGruposUsuariosFecha) {
        modifiedLogGruposUsuariosFecha = true;
        this.logGruposUsuariosFecha = logGruposUsuariosFecha;
    }

   /**
    * Returns the value of the <code>modifiedLogGruposUsuariosFecha</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogGruposUsuariosFecha</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogGruposUsuariosFecha() {
        return modifiedLogGruposUsuariosFecha;
    }

   /**
    * Sets the value of the <code>modifiedLogGruposUsuariosFecha</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogGruposUsuariosFecha</code>.
    */
    public void setModifiedLogGruposUsuariosFecha(boolean modified) {
        this.modifiedLogGruposUsuariosFecha = modified;
    }

   /**
    * Returns the value of the <code>logGruposUsuariosLoginFuncionario</code> attribute.<br>
    * Model Attribute: <code>logGruposUsuariosLoginFuncionario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>logGruposUsuariosLoginFuncionario</code> attribute.
    */

    public String getLogGruposUsuariosLoginFuncionario()  {
    	String value;
        value =  logGruposUsuariosLoginFuncionario;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logGruposUsuariosLoginFuncionario</code> attribute.<br>
    * Model Attribute: <code>logGruposUsuariosLoginFuncionario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param logGruposUsuariosLoginFuncionario The new value of the <code>logGruposUsuariosLoginFuncionario</code> attribute.
    */
    public void setLogGruposUsuariosLoginFuncionario (String logGruposUsuariosLoginFuncionario) {
        modifiedLogGruposUsuariosLoginFuncionario = true;
        this.logGruposUsuariosLoginFuncionario = logGruposUsuariosLoginFuncionario;
    }

   /**
    * Returns the value of the <code>modifiedLogGruposUsuariosLoginFuncionario</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogGruposUsuariosLoginFuncionario</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogGruposUsuariosLoginFuncionario() {
        return modifiedLogGruposUsuariosLoginFuncionario;
    }

   /**
    * Sets the value of the <code>modifiedLogGruposUsuariosLoginFuncionario</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogGruposUsuariosLoginFuncionario</code>.
    */
    public void setModifiedLogGruposUsuariosLoginFuncionario(boolean modified) {
        this.modifiedLogGruposUsuariosLoginFuncionario = modified;
    }

   /**
    * Returns the value of the <code>logGruposUsuariosTipoGrupo</code> attribute.<br>
    * Model Attribute: <code>logGruposUsuariosTipoGrupo</code>. Constant Nat<br>
    * Comments: <br>
    * @return The value of the <code>logGruposUsuariosTipoGrupo</code> attribute.
    */

    public Long getLogGruposUsuariosTipoGrupo()  {
    	Long value;
        value =  logGruposUsuariosTipoGrupo;
        return value;
    }

   /**
    * Sets the value of the <code>logGruposUsuariosTipoGrupo</code> attribute.<br>
    * Model Attribute: <code>logGruposUsuariosTipoGrupo</code>. Constant Nat<br>
    * Comments: <br>
    * @param logGruposUsuariosTipoGrupo The new value of the <code>logGruposUsuariosTipoGrupo</code> attribute.
    */
    public void setLogGruposUsuariosTipoGrupo (Long logGruposUsuariosTipoGrupo) {
        modifiedLogGruposUsuariosTipoGrupo = true;
        this.logGruposUsuariosTipoGrupo = logGruposUsuariosTipoGrupo;
    }

   /**
    * Returns the value of the <code>modifiedLogGruposUsuariosTipoGrupo</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogGruposUsuariosTipoGrupo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogGruposUsuariosTipoGrupo() {
        return modifiedLogGruposUsuariosTipoGrupo;
    }

   /**
    * Sets the value of the <code>modifiedLogGruposUsuariosTipoGrupo</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogGruposUsuariosTipoGrupo</code>.
    */
    public void setModifiedLogGruposUsuariosTipoGrupo(boolean modified) {
        this.modifiedLogGruposUsuariosTipoGrupo = modified;
    }

   /**
    * Returns the value of the <code>logGruposUsuariosAccion</code> attribute.<br>
    * Model Attribute: <code>logGruposUsuariosAccion</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>logGruposUsuariosAccion</code> attribute.
    */

    public String getLogGruposUsuariosAccion()  {
    	String value;
        value =  logGruposUsuariosAccion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logGruposUsuariosAccion</code> attribute.<br>
    * Model Attribute: <code>logGruposUsuariosAccion</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param logGruposUsuariosAccion The new value of the <code>logGruposUsuariosAccion</code> attribute.
    */
    public void setLogGruposUsuariosAccion (String logGruposUsuariosAccion) {
        modifiedLogGruposUsuariosAccion = true;
        this.logGruposUsuariosAccion = logGruposUsuariosAccion;
    }

   /**
    * Returns the value of the <code>modifiedLogGruposUsuariosAccion</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogGruposUsuariosAccion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogGruposUsuariosAccion() {
        return modifiedLogGruposUsuariosAccion;
    }

   /**
    * Sets the value of the <code>modifiedLogGruposUsuariosAccion</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogGruposUsuariosAccion</code>.
    */
    public void setModifiedLogGruposUsuariosAccion(boolean modified) {
        this.modifiedLogGruposUsuariosAccion = modified;
    }

   /**
    * Returns the value of the <code>logGruposUsuariosGrupo</code> attribute.<br>
    * Model Attribute: <code>logGruposUsuariosGrupo</code>. Constant String Size=100<br>
    * Comments: Id y nombre del grupo<br>
    * @return The value of the <code>logGruposUsuariosGrupo</code> attribute.
    */

    public String getLogGruposUsuariosGrupo()  {
    	String value;
        value =  logGruposUsuariosGrupo;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logGruposUsuariosGrupo</code> attribute.<br>
    * Model Attribute: <code>logGruposUsuariosGrupo</code>. Constant String Size=100<br>
    * Comments: Id y nombre del grupo<br>
    * @param logGruposUsuariosGrupo The new value of the <code>logGruposUsuariosGrupo</code> attribute.
    */
    public void setLogGruposUsuariosGrupo (String logGruposUsuariosGrupo) {
        modifiedLogGruposUsuariosGrupo = true;
        this.logGruposUsuariosGrupo = logGruposUsuariosGrupo;
    }

   /**
    * Returns the value of the <code>modifiedLogGruposUsuariosGrupo</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogGruposUsuariosGrupo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogGruposUsuariosGrupo() {
        return modifiedLogGruposUsuariosGrupo;
    }

   /**
    * Sets the value of the <code>modifiedLogGruposUsuariosGrupo</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogGruposUsuariosGrupo</code>.
    */
    public void setModifiedLogGruposUsuariosGrupo(boolean modified) {
        this.modifiedLogGruposUsuariosGrupo = modified;
    }

    /**
     * Returns the instance of <code>Dominio</code> related through the <code>Dominio</code> role.
     * Model Relationship:
     * <code>[Dominio] Dominio 1:1  ------ 0:M  LogGruposUsuarios [LogGruposUsuarios]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Dominio</code> related through the <code>Dominio</code> role.
     */
    @JsonIgnore
    public Dominio getDominio() {
        return dominio;
    }

    /**
     * Adds an instance of <code>Dominio</code> related through the <code>Dominio</code> role.
     * @param dominio The instance to add to the <code>Dominio</code> role.
     */
    public void add2Dominio(Dominio dominio) {
        if (dominio == null || dominio.isNull()) {
            this.modifiedDominio = true;
            this.dominioNumero = null;
        } else {
            this.dominioNumero = dominio.getDominioNumero();
        }
        this.dominio = (dominio == null  || dominio.isNull() ? null : dominio);
    }

   /**
    * This method gets the attribute value <code>modifiedDominio</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDominio</code> has been modified.
    */
    public boolean isModifiedDominio(){
        return modifiedDominio;
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
        logGruposUsuariosFecha = Timestamp.valueOf(Constants.DATETIME_DEFAULTVALUE);
        logGruposUsuariosLoginFuncionario = "";
        logGruposUsuariosTipoGrupo = Long.valueOf(0);
        logGruposUsuariosAccion = "";
        logGruposUsuariosGrupo = "";
        dominio = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return LogGruposUsuarios.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return LogGruposUsuariosConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedLogGruposUsuariosFecha = false;
    	values.put("logGruposUsuariosFecha", getLogGruposUsuariosFecha());
    	modifiedLogGruposUsuariosLoginFuncionario = false;
    	values.put("logGruposUsuariosLoginFuncionario", getLogGruposUsuariosLoginFuncionario());
    	modifiedLogGruposUsuariosTipoGrupo = false;
    	values.put("logGruposUsuariosTipoGrupo", getLogGruposUsuariosTipoGrupo());
    	modifiedLogGruposUsuariosAccion = false;
    	values.put("logGruposUsuariosAccion", getLogGruposUsuariosAccion());
    	modifiedLogGruposUsuariosGrupo = false;
    	values.put("logGruposUsuariosGrupo", getLogGruposUsuariosGrupo());
    	modifiedDominio = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>LogGruposUsuariosOid</code> object that identifies this instance of <code>LogGruposUsuarios</code>.
     * @return <code>LogGruposUsuariosOid </code> object that identifies this instance of <code>LogGruposUsuarios</code>
     */
	@Override
    public LogGruposUsuariosOid getOid() {
        return new LogGruposUsuariosOid(getLogGruposUsuariosId());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(LogGruposUsuariosConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(LogGruposUsuariosConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.LOGGRUPOSUSUARIOS)) {
            // Add this class
            activeFacets.add(Constants.LOGGRUPOSUSUARIOS);
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
            relatedInstance = buildLogGruposUsuariosRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogGruposUsuariosConstants.ROLE_NAME_DOMINIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogGruposUsuariosRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogGruposUsuariosRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogGruposUsuarios(mapper.readValue(relatedInstanceJsonOid, LogGruposUsuariosOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogGruposUsuarios.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildLogGruposUsuariosRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogGruposUsuarios.class).error(e.getMessage());
            return null;
        }
    }
}
