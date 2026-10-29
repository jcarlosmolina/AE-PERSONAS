package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DominioConstants;
import com.keralty.aepersonas.global.LogDatosDominioConstants;
import com.keralty.aepersonas.persistence.oid.DominioOid;
import com.keralty.aepersonas.persistence.oid.LogDatosDominioOid;
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
 * Persistent representation of the <code>LogDatosDominio</code> model class.
 * <p>
 * Model Class: <code>LogDatosDominio</code><br>
 */
@Entity(name = LogDatosDominioConstants.CLASS_NAME)
@Table(name = LogDatosDominioConstants.TBL_NAME)
public class LogDatosDominio extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LogDatosDominio_Sequence")
    @SequenceGenerator(name="LogDatosDominio_Sequence", sequenceName="LogDatosDominio_Sequence", allocationSize=1)
    @Column(name = LogDatosDominioConstants.FLD_LOGDATOSDOMINIOIDLOGDATOSDOMINIO )
    @JsonProperty(value="id_logdatosdominio")
    private Long logDatosDominioidLogDatosDominio;

    /** Class member attribute. */
    @Column(name = LogDatosDominioConstants.FLD_LOGDATOSDOMINIOLOGINFUNCIONARIO )
    @JsonProperty(value="loginfuncionario")
    private String logDatosDominioLoginFuncionario;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogDatosDominioLoginFuncionario;

    /** Class member attribute. */
    @Column(name = LogDatosDominioConstants.FLD_LOGDATOSDOMINIOFECHA )
    @JsonProperty(value="fecha")
    private Timestamp logDatosDominioFecha;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogDatosDominioFecha;

    /** Class member attribute. */
    @Column(name = LogDatosDominioConstants.FLD_LOGDATOSDOMINIOTRAMITEENLINEA )
    @JsonProperty(value="tramiteenlinea")
    private Boolean logDatosDominioTramiteEnLinea;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogDatosDominioTramiteEnLinea;

    /** Class member attribute. */
    @Column(name = LogDatosDominioConstants.FLD_LOGDATOSDOMINIOVIGENCIARADICACION )
    @JsonProperty(value="vigenciaradicacion")
    private Boolean logDatosDominioVigenciaRadicacion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogDatosDominioVigenciaRadicacion;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=LogDatosDominioConstants.FLD_DOMINIONUMERO, referencedColumnName=DominioConstants.FLD_DOMINIONUMERO)
    })
    @JsonIgnore
    private Dominio dominio;
    /** Related attribute. */
    @Column(name = LogDatosDominioConstants.FLD_DOMINIONUMERO, insertable = false, updatable = false)
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
    public LogDatosDominio() {
        logDatosDominioidLogDatosDominio = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>LogDatosDominio</code>.
     * @param oid Object Identifier of the instance of <code>LogDatosDominio</code> to be created.
     * @throws SystemException
     */
    public LogDatosDominio(LogDatosDominioOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            logDatosDominioidLogDatosDominio = oid.getLogDatosDominioidLogDatosDominio();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>logDatosDominioidLogDatosDominio</code> attribute<br>in class <code>LogDatosDominio</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogDatosDominio</code>
     * @return The value of the <code>logDatosDominioidLogDatosDominio</code> attribute<br>in class <code>LogDatosDominio</code>.
     */
    public Long getLogDatosDominioidLogDatosDominio() {
        return logDatosDominioidLogDatosDominio;
    }

    /**
     * Sets the value of the <code>logDatosDominioidLogDatosDominio</code> attribute<br>in class <code>LogDatosDominio</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogDatosDominio</code>
     * @param logDatosDominioidLogDatosDominio The new value of the <code>logDatosDominioidLogDatosDominio</code> attribute<br>in class <code>LogDatosDominio</code>.
     */
    public void setLogDatosDominioidLogDatosDominio(Long logDatosDominioidLogDatosDominio) {
        this.logDatosDominioidLogDatosDominio = logDatosDominioidLogDatosDominio;
    }

   /**
    * Returns the value of the <code>logDatosDominioLoginFuncionario</code> attribute.<br>
    * Model Attribute: <code>logDatosDominioLoginFuncionario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>logDatosDominioLoginFuncionario</code> attribute.
    */

    public String getLogDatosDominioLoginFuncionario()  {
    	String value;
        value =  logDatosDominioLoginFuncionario;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logDatosDominioLoginFuncionario</code> attribute.<br>
    * Model Attribute: <code>logDatosDominioLoginFuncionario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param logDatosDominioLoginFuncionario The new value of the <code>logDatosDominioLoginFuncionario</code> attribute.
    */
    public void setLogDatosDominioLoginFuncionario (String logDatosDominioLoginFuncionario) {
        modifiedLogDatosDominioLoginFuncionario = true;
        this.logDatosDominioLoginFuncionario = logDatosDominioLoginFuncionario;
    }

   /**
    * Returns the value of the <code>modifiedLogDatosDominioLoginFuncionario</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogDatosDominioLoginFuncionario</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogDatosDominioLoginFuncionario() {
        return modifiedLogDatosDominioLoginFuncionario;
    }

   /**
    * Sets the value of the <code>modifiedLogDatosDominioLoginFuncionario</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogDatosDominioLoginFuncionario</code>.
    */
    public void setModifiedLogDatosDominioLoginFuncionario(boolean modified) {
        this.modifiedLogDatosDominioLoginFuncionario = modified;
    }

   /**
    * Returns the value of the <code>logDatosDominioFecha</code> attribute.<br>
    * Model Attribute: <code>logDatosDominioFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @return The value of the <code>logDatosDominioFecha</code> attribute.
    */

    public Timestamp getLogDatosDominioFecha()  {
    	Timestamp value;
        value =  logDatosDominioFecha;
        return value;
    }

   /**
    * Sets the value of the <code>logDatosDominioFecha</code> attribute.<br>
    * Model Attribute: <code>logDatosDominioFecha</code>. Constant DateTime<br>
    * Comments: <br>
    * @param logDatosDominioFecha The new value of the <code>logDatosDominioFecha</code> attribute.
    */
    public void setLogDatosDominioFecha (Timestamp logDatosDominioFecha) {
        modifiedLogDatosDominioFecha = true;
        this.logDatosDominioFecha = logDatosDominioFecha;
    }

   /**
    * Returns the value of the <code>modifiedLogDatosDominioFecha</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogDatosDominioFecha</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogDatosDominioFecha() {
        return modifiedLogDatosDominioFecha;
    }

   /**
    * Sets the value of the <code>modifiedLogDatosDominioFecha</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogDatosDominioFecha</code>.
    */
    public void setModifiedLogDatosDominioFecha(boolean modified) {
        this.modifiedLogDatosDominioFecha = modified;
    }

   /**
    * Returns the value of the <code>logDatosDominioTramiteEnLinea</code> attribute.<br>
    * Model Attribute: <code>logDatosDominioTramiteEnLinea</code>. Constant Bool<br>
    * Comments: <br>
    * @return The value of the <code>logDatosDominioTramiteEnLinea</code> attribute.
    */

    public Boolean getLogDatosDominioTramiteEnLinea()  {
    	Boolean value;
        value =  logDatosDominioTramiteEnLinea;
        return value;
    }

   /**
    * Sets the value of the <code>logDatosDominioTramiteEnLinea</code> attribute.<br>
    * Model Attribute: <code>logDatosDominioTramiteEnLinea</code>. Constant Bool<br>
    * Comments: <br>
    * @param logDatosDominioTramiteEnLinea The new value of the <code>logDatosDominioTramiteEnLinea</code> attribute.
    */
    public void setLogDatosDominioTramiteEnLinea (Boolean logDatosDominioTramiteEnLinea) {
        modifiedLogDatosDominioTramiteEnLinea = true;
        this.logDatosDominioTramiteEnLinea = logDatosDominioTramiteEnLinea;
    }

   /**
    * Returns the value of the <code>modifiedLogDatosDominioTramiteEnLinea</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogDatosDominioTramiteEnLinea</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogDatosDominioTramiteEnLinea() {
        return modifiedLogDatosDominioTramiteEnLinea;
    }

   /**
    * Sets the value of the <code>modifiedLogDatosDominioTramiteEnLinea</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogDatosDominioTramiteEnLinea</code>.
    */
    public void setModifiedLogDatosDominioTramiteEnLinea(boolean modified) {
        this.modifiedLogDatosDominioTramiteEnLinea = modified;
    }

   /**
    * Returns the value of the <code>logDatosDominioVigenciaRadicacion</code> attribute.<br>
    * Model Attribute: <code>logDatosDominioVigenciaRadicacion</code>. Constant Bool<br>
    * Comments: GdC-40 Req 7: Deberá hacerse Log de las modificaciones a esta configuración, guardando la fecha y hora, usuario (campo UsuarioLDAP) y el valor modificado<br>
    * @return The value of the <code>logDatosDominioVigenciaRadicacion</code> attribute.
    */

    public Boolean getLogDatosDominioVigenciaRadicacion()  {
    	Boolean value;
        value =  logDatosDominioVigenciaRadicacion;
        return value;
    }

   /**
    * Sets the value of the <code>logDatosDominioVigenciaRadicacion</code> attribute.<br>
    * Model Attribute: <code>logDatosDominioVigenciaRadicacion</code>. Constant Bool<br>
    * Comments: GdC-40 Req 7: Deberá hacerse Log de las modificaciones a esta configuración, guardando la fecha y hora, usuario (campo UsuarioLDAP) y el valor modificado<br>
    * @param logDatosDominioVigenciaRadicacion The new value of the <code>logDatosDominioVigenciaRadicacion</code> attribute.
    */
    public void setLogDatosDominioVigenciaRadicacion (Boolean logDatosDominioVigenciaRadicacion) {
        modifiedLogDatosDominioVigenciaRadicacion = true;
        this.logDatosDominioVigenciaRadicacion = logDatosDominioVigenciaRadicacion;
    }

   /**
    * Returns the value of the <code>modifiedLogDatosDominioVigenciaRadicacion</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogDatosDominioVigenciaRadicacion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogDatosDominioVigenciaRadicacion() {
        return modifiedLogDatosDominioVigenciaRadicacion;
    }

   /**
    * Sets the value of the <code>modifiedLogDatosDominioVigenciaRadicacion</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogDatosDominioVigenciaRadicacion</code>.
    */
    public void setModifiedLogDatosDominioVigenciaRadicacion(boolean modified) {
        this.modifiedLogDatosDominioVigenciaRadicacion = modified;
    }

    /**
     * Returns the instance of <code>Dominio</code> related through the <code>Dominio</code> role.
     * Model Relationship:
     * <code>[Dominio] Dominio 1:1  ------ 0:M  LogDatosDominio [LogDatosDominio]</code>
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
        logDatosDominioLoginFuncionario = "";
        logDatosDominioFecha = Timestamp.valueOf(Constants.DATETIME_DEFAULTVALUE);
        logDatosDominioTramiteEnLinea = false;
        logDatosDominioVigenciaRadicacion = false;
        dominio = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return LogDatosDominio.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return LogDatosDominioConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedLogDatosDominioLoginFuncionario = false;
    	values.put("logDatosDominioLoginFuncionario", getLogDatosDominioLoginFuncionario());
    	modifiedLogDatosDominioFecha = false;
    	values.put("logDatosDominioFecha", getLogDatosDominioFecha());
    	modifiedLogDatosDominioTramiteEnLinea = false;
    	values.put("logDatosDominioTramiteEnLinea", getLogDatosDominioTramiteEnLinea());
    	modifiedLogDatosDominioVigenciaRadicacion = false;
    	values.put("logDatosDominioVigenciaRadicacion", getLogDatosDominioVigenciaRadicacion());
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
     * Returns the <code>LogDatosDominioOid</code> object that identifies this instance of <code>LogDatosDominio</code>.
     * @return <code>LogDatosDominioOid </code> object that identifies this instance of <code>LogDatosDominio</code>
     */
	@Override
    public LogDatosDominioOid getOid() {
        return new LogDatosDominioOid(getLogDatosDominioidLogDatosDominio());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(LogDatosDominioConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(LogDatosDominioConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.LOGDATOSDOMINIO)) {
            // Add this class
            activeFacets.add(Constants.LOGDATOSDOMINIO);
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
            relatedInstance = buildLogDatosDominioRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogDatosDominioConstants.ROLE_NAME_DOMINIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogDatosDominioRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogDatosDominioRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogDatosDominio(mapper.readValue(relatedInstanceJsonOid, LogDatosDominioOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogDatosDominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildLogDatosDominioRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogDatosDominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
