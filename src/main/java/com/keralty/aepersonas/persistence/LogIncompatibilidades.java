package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DominioConstants;
import com.keralty.aepersonas.global.LogIncompatibilidadesConstants;
import com.keralty.aepersonas.persistence.oid.DominioOid;
import com.keralty.aepersonas.persistence.oid.LogIncompatibilidadesOid;
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
 * Persistent representation of the <code>LogIncompatibilidades</code> model class.
 * <p>
 * Model Class: <code>LogIncompatibilidades</code><br>
 */
@Entity(name = LogIncompatibilidadesConstants.CLASS_NAME)
@Table(name = LogIncompatibilidadesConstants.TBL_NAME)
public class LogIncompatibilidades extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LogIncompatibilidades_Sequence")
    @SequenceGenerator(name="LogIncompatibilidades_Sequence", sequenceName="LogIncompatibilidades_Sequence", allocationSize=1)
    @Column(name = LogIncompatibilidadesConstants.FLD_LOGINCOMPATIBILIDADESIDLOGINCOMPATIBILIDADES )
    @JsonProperty(value="id_logincompatibilidades")
    private Long logIncompatibilidadesidLogIncompatibilidades;

    /** Class member attribute. */
    @Column(name = LogIncompatibilidadesConstants.FLD_LOGINCOMPATIBILIDADESLOGINFUNCIONARIO )
    @JsonProperty(value="loginfuncionario")
    private String logIncompatibilidadesLoginFuncionario;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogIncompatibilidadesLoginFuncionario;

    /** Class member attribute. */
    @Column(name = LogIncompatibilidadesConstants.FLD_LOGINCOMPATIBILIDADESFECHA )
    @JsonProperty(value="fecha")
    private Timestamp logIncompatibilidadesFecha;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogIncompatibilidadesFecha;

    /** Class member attribute. */
    @Column(name = LogIncompatibilidadesConstants.FLD_LOGINCOMPATIBILIDADESACCION )
    @JsonProperty(value="accion")
    private String logIncompatibilidadesAccion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogIncompatibilidadesAccion;

    /** Class member attribute. */
    @Column(name = LogIncompatibilidadesConstants.FLD_LOGINCOMPATIBILIDADESNOMDOMINIO )
    @JsonProperty(value="nomdominio")
    private String logIncompatibilidadesNomDominio;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogIncompatibilidadesNomDominio;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=LogIncompatibilidadesConstants.FLD_DOMINIONUMERO, referencedColumnName=DominioConstants.FLD_DOMINIONUMERO)
    })
    @JsonIgnore
    private Dominio dominio;
    /** Related attribute. */
    @Column(name = LogIncompatibilidadesConstants.FLD_DOMINIONUMERO, insertable = false, updatable = false)
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
    public LogIncompatibilidades() {
        logIncompatibilidadesidLogIncompatibilidades = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>LogIncompatibilidades</code>.
     * @param oid Object Identifier of the instance of <code>LogIncompatibilidades</code> to be created.
     * @throws SystemException
     */
    public LogIncompatibilidades(LogIncompatibilidadesOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            logIncompatibilidadesidLogIncompatibilidades = oid.getLogIncompatibilidadesidLogIncompatibilidades();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>logIncompatibilidadesidLogIncompatibilidades</code> attribute<br>in class <code>LogIncompatibilidades</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogIncompatibilidades</code>
     * @return The value of the <code>logIncompatibilidadesidLogIncompatibilidades</code> attribute<br>in class <code>LogIncompatibilidades</code>.
     */
    public Long getLogIncompatibilidadesidLogIncompatibilidades() {
        return logIncompatibilidadesidLogIncompatibilidades;
    }

    /**
     * Sets the value of the <code>logIncompatibilidadesidLogIncompatibilidades</code> attribute<br>in class <code>LogIncompatibilidades</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogIncompatibilidades</code>
     * @param logIncompatibilidadesidLogIncompatibilidades The new value of the <code>logIncompatibilidadesidLogIncompatibilidades</code> attribute<br>in class <code>LogIncompatibilidades</code>.
     */
    public void setLogIncompatibilidadesidLogIncompatibilidades(Long logIncompatibilidadesidLogIncompatibilidades) {
        this.logIncompatibilidadesidLogIncompatibilidades = logIncompatibilidadesidLogIncompatibilidades;
    }

   /**
    * Returns the value of the <code>logIncompatibilidadesLoginFuncionario</code> attribute.<br>
    * Model Attribute: <code>logIncompatibilidadesLoginFuncionario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>logIncompatibilidadesLoginFuncionario</code> attribute.
    */

    public String getLogIncompatibilidadesLoginFuncionario()  {
    	String value;
        value =  logIncompatibilidadesLoginFuncionario;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logIncompatibilidadesLoginFuncionario</code> attribute.<br>
    * Model Attribute: <code>logIncompatibilidadesLoginFuncionario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param logIncompatibilidadesLoginFuncionario The new value of the <code>logIncompatibilidadesLoginFuncionario</code> attribute.
    */
    public void setLogIncompatibilidadesLoginFuncionario (String logIncompatibilidadesLoginFuncionario) {
        modifiedLogIncompatibilidadesLoginFuncionario = true;
        this.logIncompatibilidadesLoginFuncionario = logIncompatibilidadesLoginFuncionario;
    }

   /**
    * Returns the value of the <code>modifiedLogIncompatibilidadesLoginFuncionario</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogIncompatibilidadesLoginFuncionario</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogIncompatibilidadesLoginFuncionario() {
        return modifiedLogIncompatibilidadesLoginFuncionario;
    }

   /**
    * Sets the value of the <code>modifiedLogIncompatibilidadesLoginFuncionario</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogIncompatibilidadesLoginFuncionario</code>.
    */
    public void setModifiedLogIncompatibilidadesLoginFuncionario(boolean modified) {
        this.modifiedLogIncompatibilidadesLoginFuncionario = modified;
    }

   /**
    * Returns the value of the <code>logIncompatibilidadesFecha</code> attribute.<br>
    * Model Attribute: <code>logIncompatibilidadesFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @return The value of the <code>logIncompatibilidadesFecha</code> attribute.
    */

    public Timestamp getLogIncompatibilidadesFecha()  {
    	Timestamp value;
        value =  logIncompatibilidadesFecha;
        return value;
    }

   /**
    * Sets the value of the <code>logIncompatibilidadesFecha</code> attribute.<br>
    * Model Attribute: <code>logIncompatibilidadesFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @param logIncompatibilidadesFecha The new value of the <code>logIncompatibilidadesFecha</code> attribute.
    */
    public void setLogIncompatibilidadesFecha (Timestamp logIncompatibilidadesFecha) {
        modifiedLogIncompatibilidadesFecha = true;
        this.logIncompatibilidadesFecha = logIncompatibilidadesFecha;
    }

   /**
    * Returns the value of the <code>modifiedLogIncompatibilidadesFecha</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogIncompatibilidadesFecha</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogIncompatibilidadesFecha() {
        return modifiedLogIncompatibilidadesFecha;
    }

   /**
    * Sets the value of the <code>modifiedLogIncompatibilidadesFecha</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogIncompatibilidadesFecha</code>.
    */
    public void setModifiedLogIncompatibilidadesFecha(boolean modified) {
        this.modifiedLogIncompatibilidadesFecha = modified;
    }

   /**
    * Returns the value of the <code>logIncompatibilidadesAccion</code> attribute.<br>
    * Model Attribute: <code>logIncompatibilidadesAccion</code>. Constant String Size=12<br>
    * Comments: <br>
    * @return The value of the <code>logIncompatibilidadesAccion</code> attribute.
    */

    public String getLogIncompatibilidadesAccion()  {
    	String value;
        value =  logIncompatibilidadesAccion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logIncompatibilidadesAccion</code> attribute.<br>
    * Model Attribute: <code>logIncompatibilidadesAccion</code>. Constant String Size=12<br>
    * Comments: <br>
    * @param logIncompatibilidadesAccion The new value of the <code>logIncompatibilidadesAccion</code> attribute.
    */
    public void setLogIncompatibilidadesAccion (String logIncompatibilidadesAccion) {
        modifiedLogIncompatibilidadesAccion = true;
        this.logIncompatibilidadesAccion = logIncompatibilidadesAccion;
    }

   /**
    * Returns the value of the <code>modifiedLogIncompatibilidadesAccion</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogIncompatibilidadesAccion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogIncompatibilidadesAccion() {
        return modifiedLogIncompatibilidadesAccion;
    }

   /**
    * Sets the value of the <code>modifiedLogIncompatibilidadesAccion</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogIncompatibilidadesAccion</code>.
    */
    public void setModifiedLogIncompatibilidadesAccion(boolean modified) {
        this.modifiedLogIncompatibilidadesAccion = modified;
    }

   /**
    * Returns the value of the <code>logIncompatibilidadesNomDominio</code> attribute.<br>
    * Model Attribute: <code>logIncompatibilidadesNomDominio</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>logIncompatibilidadesNomDominio</code> attribute.
    */

    public String getLogIncompatibilidadesNomDominio()  {
    	String value;
        value =  logIncompatibilidadesNomDominio;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logIncompatibilidadesNomDominio</code> attribute.<br>
    * Model Attribute: <code>logIncompatibilidadesNomDominio</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param logIncompatibilidadesNomDominio The new value of the <code>logIncompatibilidadesNomDominio</code> attribute.
    */
    public void setLogIncompatibilidadesNomDominio (String logIncompatibilidadesNomDominio) {
        modifiedLogIncompatibilidadesNomDominio = true;
        this.logIncompatibilidadesNomDominio = logIncompatibilidadesNomDominio;
    }

   /**
    * Returns the value of the <code>modifiedLogIncompatibilidadesNomDominio</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogIncompatibilidadesNomDominio</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogIncompatibilidadesNomDominio() {
        return modifiedLogIncompatibilidadesNomDominio;
    }

   /**
    * Sets the value of the <code>modifiedLogIncompatibilidadesNomDominio</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogIncompatibilidadesNomDominio</code>.
    */
    public void setModifiedLogIncompatibilidadesNomDominio(boolean modified) {
        this.modifiedLogIncompatibilidadesNomDominio = modified;
    }

    /**
     * Returns the instance of <code>Dominio</code> related through the <code>Dominio</code> role.
     * Model Relationship:
     * <code>[Dominio] Dominio 1:1  ------ 0:M  LogIncompatibilidades [LogIncompatibilidades]</code>
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
        logIncompatibilidadesLoginFuncionario = "";
        logIncompatibilidadesFecha = Timestamp.valueOf(Constants.DATETIME_DEFAULTVALUE);
        logIncompatibilidadesAccion = "";
        logIncompatibilidadesNomDominio = "";
        dominio = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return LogIncompatibilidades.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return LogIncompatibilidadesConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedLogIncompatibilidadesLoginFuncionario = false;
    	values.put("logIncompatibilidadesLoginFuncionario", getLogIncompatibilidadesLoginFuncionario());
    	modifiedLogIncompatibilidadesFecha = false;
    	values.put("logIncompatibilidadesFecha", getLogIncompatibilidadesFecha());
    	modifiedLogIncompatibilidadesAccion = false;
    	values.put("logIncompatibilidadesAccion", getLogIncompatibilidadesAccion());
    	modifiedLogIncompatibilidadesNomDominio = false;
    	values.put("logIncompatibilidadesNomDominio", getLogIncompatibilidadesNomDominio());
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
     * Returns the <code>LogIncompatibilidadesOid</code> object that identifies this instance of <code>LogIncompatibilidades</code>.
     * @return <code>LogIncompatibilidadesOid </code> object that identifies this instance of <code>LogIncompatibilidades</code>
     */
	@Override
    public LogIncompatibilidadesOid getOid() {
        return new LogIncompatibilidadesOid(getLogIncompatibilidadesidLogIncompatibilidades());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(LogIncompatibilidadesConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(LogIncompatibilidadesConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.LOGINCOMPATIBILIDADES)) {
            // Add this class
            activeFacets.add(Constants.LOGINCOMPATIBILIDADES);
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
            relatedInstance = buildLogIncompatibilidadesRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogIncompatibilidadesConstants.ROLE_NAME_DOMINIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogIncompatibilidadesRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogIncompatibilidadesRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogIncompatibilidades(mapper.readValue(relatedInstanceJsonOid, LogIncompatibilidadesOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogIncompatibilidades.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildLogIncompatibilidadesRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogIncompatibilidades.class).error(e.getMessage());
            return null;
        }
    }
}
