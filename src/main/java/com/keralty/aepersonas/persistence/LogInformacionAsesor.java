package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.AsesorConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.LogInformacionAsesorConstants;
import com.keralty.aepersonas.persistence.oid.AsesorOid;
import com.keralty.aepersonas.persistence.oid.LogInformacionAsesorOid;
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
 * Persistent representation of the <code>LogInformacionAsesor</code> model class.
 * <p>
 * Model Class: <code>LogInformacionAsesor</code><br>
 */
@Entity(name = LogInformacionAsesorConstants.CLASS_NAME)
@Table(name = LogInformacionAsesorConstants.TBL_NAME)
public class LogInformacionAsesor extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LogInformacionAsesor_Sequence")
    @SequenceGenerator(name="LogInformacionAsesor_Sequence", sequenceName="LogInformacionAsesor_Sequence", allocationSize=1)
    @Column(name = LogInformacionAsesorConstants.FLD_LOGINFORMACIONASESORIDLOGINFORMACIONASESOR )
    @JsonProperty(value="id_loginformacionasesor")
    private Long logInformacionAsesoridLogInformacionAsesor;

    /** Class member attribute. */
    @Column(name = LogInformacionAsesorConstants.FLD_LOGINFORMACIONASESORFECHAHORA )
    @JsonProperty(value="fechahora")
    private Timestamp logInformacionAsesorFechaHora;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogInformacionAsesorFechaHora;

    /** Class member attribute. */
    @Column(name = LogInformacionAsesorConstants.FLD_LOGINFORMACIONASESORLOGINFUNCIONARIO )
    @JsonProperty(value="loginfuncionario")
    private String logInformacionAsesorLoginFuncionario;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogInformacionAsesorLoginFuncionario;

    /** Class member attribute. */
    @Column(name = LogInformacionAsesorConstants.FLD_LOGINFORMACIONASESORVERDATOSPERSONA )
    @JsonProperty(value="verdatospersona")
    private Boolean logInformacionAsesorVerDatosPersona;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogInformacionAsesorVerDatosPersona;

    /** Class member attribute. */
    @Column(name = LogInformacionAsesorConstants.FLD_LOGINFORMACIONASESORVERDOCSPERSONA )
    @JsonProperty(value="verdocspersona")
    private Boolean logInformacionAsesorVerDocsPersona;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogInformacionAsesorVerDocsPersona;

    /** Class member attribute. */
    @Column(name = LogInformacionAsesorConstants.FLD_LOGINFORMACIONASESORVERCONTRATONOVEDAD )
    @JsonProperty(value="vercontratonovedad")
    private Boolean logInformacionAsesorVerContratoNovedad;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogInformacionAsesorVerContratoNovedad;

    /** Class member attribute. */
    @Column(name = LogInformacionAsesorConstants.FLD_LOGINFORMACIONASESORACCESOVALIDADORUSUARIOS )
    @JsonProperty(value="accesovalidadorusuarios")
    private Boolean logInformacionAsesorAccesoValidadorUsuarios;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogInformacionAsesorAccesoValidadorUsuarios;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=LogInformacionAsesorConstants.FLD_FUNCIONARIOID, referencedColumnName=AsesorConstants.FLD_FUNCIONARIOID)
    })
    @JsonIgnore
    private Asesor asesor;
    /** Related attribute. */
    @Column(name = LogInformacionAsesorConstants.FLD_FUNCIONARIOID, insertable = false, updatable = false)
    private Long funcionarioId;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAsesor;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public LogInformacionAsesor() {
        logInformacionAsesoridLogInformacionAsesor = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>LogInformacionAsesor</code>.
     * @param oid Object Identifier of the instance of <code>LogInformacionAsesor</code> to be created.
     * @throws SystemException
     */
    public LogInformacionAsesor(LogInformacionAsesorOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            logInformacionAsesoridLogInformacionAsesor = oid.getLogInformacionAsesoridLogInformacionAsesor();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>logInformacionAsesoridLogInformacionAsesor</code> attribute<br>in class <code>LogInformacionAsesor</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogInformacionAsesor</code>
     * @return The value of the <code>logInformacionAsesoridLogInformacionAsesor</code> attribute<br>in class <code>LogInformacionAsesor</code>.
     */
    public Long getLogInformacionAsesoridLogInformacionAsesor() {
        return logInformacionAsesoridLogInformacionAsesor;
    }

    /**
     * Sets the value of the <code>logInformacionAsesoridLogInformacionAsesor</code> attribute<br>in class <code>LogInformacionAsesor</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogInformacionAsesor</code>
     * @param logInformacionAsesoridLogInformacionAsesor The new value of the <code>logInformacionAsesoridLogInformacionAsesor</code> attribute<br>in class <code>LogInformacionAsesor</code>.
     */
    public void setLogInformacionAsesoridLogInformacionAsesor(Long logInformacionAsesoridLogInformacionAsesor) {
        this.logInformacionAsesoridLogInformacionAsesor = logInformacionAsesoridLogInformacionAsesor;
    }

   /**
    * Returns the value of the <code>logInformacionAsesorFechaHora</code> attribute.<br>
    * Model Attribute: <code>logInformacionAsesorFechaHora</code>. Constant DateTime<br>
    * Comments: <br>
    * @return The value of the <code>logInformacionAsesorFechaHora</code> attribute.
    */

    public Timestamp getLogInformacionAsesorFechaHora()  {
    	Timestamp value;
        value =  logInformacionAsesorFechaHora;
        return value;
    }

   /**
    * Sets the value of the <code>logInformacionAsesorFechaHora</code> attribute.<br>
    * Model Attribute: <code>logInformacionAsesorFechaHora</code>. Constant DateTime<br>
    * Comments: <br>
    * @param logInformacionAsesorFechaHora The new value of the <code>logInformacionAsesorFechaHora</code> attribute.
    */
    public void setLogInformacionAsesorFechaHora (Timestamp logInformacionAsesorFechaHora) {
        modifiedLogInformacionAsesorFechaHora = true;
        this.logInformacionAsesorFechaHora = logInformacionAsesorFechaHora;
    }

   /**
    * Returns the value of the <code>modifiedLogInformacionAsesorFechaHora</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogInformacionAsesorFechaHora</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogInformacionAsesorFechaHora() {
        return modifiedLogInformacionAsesorFechaHora;
    }

   /**
    * Sets the value of the <code>modifiedLogInformacionAsesorFechaHora</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogInformacionAsesorFechaHora</code>.
    */
    public void setModifiedLogInformacionAsesorFechaHora(boolean modified) {
        this.modifiedLogInformacionAsesorFechaHora = modified;
    }

   /**
    * Returns the value of the <code>logInformacionAsesorLoginFuncionario</code> attribute.<br>
    * Model Attribute: <code>logInformacionAsesorLoginFuncionario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>logInformacionAsesorLoginFuncionario</code> attribute.
    */

    public String getLogInformacionAsesorLoginFuncionario()  {
    	String value;
        value =  logInformacionAsesorLoginFuncionario;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logInformacionAsesorLoginFuncionario</code> attribute.<br>
    * Model Attribute: <code>logInformacionAsesorLoginFuncionario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param logInformacionAsesorLoginFuncionario The new value of the <code>logInformacionAsesorLoginFuncionario</code> attribute.
    */
    public void setLogInformacionAsesorLoginFuncionario (String logInformacionAsesorLoginFuncionario) {
        modifiedLogInformacionAsesorLoginFuncionario = true;
        this.logInformacionAsesorLoginFuncionario = logInformacionAsesorLoginFuncionario;
    }

   /**
    * Returns the value of the <code>modifiedLogInformacionAsesorLoginFuncionario</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogInformacionAsesorLoginFuncionario</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogInformacionAsesorLoginFuncionario() {
        return modifiedLogInformacionAsesorLoginFuncionario;
    }

   /**
    * Sets the value of the <code>modifiedLogInformacionAsesorLoginFuncionario</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogInformacionAsesorLoginFuncionario</code>.
    */
    public void setModifiedLogInformacionAsesorLoginFuncionario(boolean modified) {
        this.modifiedLogInformacionAsesorLoginFuncionario = modified;
    }

   /**
    * Returns the value of the <code>logInformacionAsesorVerDatosPersona</code> attribute.<br>
    * Model Attribute: <code>logInformacionAsesorVerDatosPersona</code>. Constant Bool<br>
    * Comments: <br>
    * @return The value of the <code>logInformacionAsesorVerDatosPersona</code> attribute.
    */

    public Boolean getLogInformacionAsesorVerDatosPersona()  {
    	Boolean value;
        value =  logInformacionAsesorVerDatosPersona;
        return value;
    }

   /**
    * Sets the value of the <code>logInformacionAsesorVerDatosPersona</code> attribute.<br>
    * Model Attribute: <code>logInformacionAsesorVerDatosPersona</code>. Constant Bool<br>
    * Comments: <br>
    * @param logInformacionAsesorVerDatosPersona The new value of the <code>logInformacionAsesorVerDatosPersona</code> attribute.
    */
    public void setLogInformacionAsesorVerDatosPersona (Boolean logInformacionAsesorVerDatosPersona) {
        modifiedLogInformacionAsesorVerDatosPersona = true;
        this.logInformacionAsesorVerDatosPersona = logInformacionAsesorVerDatosPersona;
    }

   /**
    * Returns the value of the <code>modifiedLogInformacionAsesorVerDatosPersona</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogInformacionAsesorVerDatosPersona</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogInformacionAsesorVerDatosPersona() {
        return modifiedLogInformacionAsesorVerDatosPersona;
    }

   /**
    * Sets the value of the <code>modifiedLogInformacionAsesorVerDatosPersona</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogInformacionAsesorVerDatosPersona</code>.
    */
    public void setModifiedLogInformacionAsesorVerDatosPersona(boolean modified) {
        this.modifiedLogInformacionAsesorVerDatosPersona = modified;
    }

   /**
    * Returns the value of the <code>logInformacionAsesorVerDocsPersona</code> attribute.<br>
    * Model Attribute: <code>logInformacionAsesorVerDocsPersona</code>. Constant Bool<br>
    * Comments: <br>
    * @return The value of the <code>logInformacionAsesorVerDocsPersona</code> attribute.
    */

    public Boolean getLogInformacionAsesorVerDocsPersona()  {
    	Boolean value;
        value =  logInformacionAsesorVerDocsPersona;
        return value;
    }

   /**
    * Sets the value of the <code>logInformacionAsesorVerDocsPersona</code> attribute.<br>
    * Model Attribute: <code>logInformacionAsesorVerDocsPersona</code>. Constant Bool<br>
    * Comments: <br>
    * @param logInformacionAsesorVerDocsPersona The new value of the <code>logInformacionAsesorVerDocsPersona</code> attribute.
    */
    public void setLogInformacionAsesorVerDocsPersona (Boolean logInformacionAsesorVerDocsPersona) {
        modifiedLogInformacionAsesorVerDocsPersona = true;
        this.logInformacionAsesorVerDocsPersona = logInformacionAsesorVerDocsPersona;
    }

   /**
    * Returns the value of the <code>modifiedLogInformacionAsesorVerDocsPersona</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogInformacionAsesorVerDocsPersona</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogInformacionAsesorVerDocsPersona() {
        return modifiedLogInformacionAsesorVerDocsPersona;
    }

   /**
    * Sets the value of the <code>modifiedLogInformacionAsesorVerDocsPersona</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogInformacionAsesorVerDocsPersona</code>.
    */
    public void setModifiedLogInformacionAsesorVerDocsPersona(boolean modified) {
        this.modifiedLogInformacionAsesorVerDocsPersona = modified;
    }

   /**
    * Returns the value of the <code>logInformacionAsesorVerContratoNovedad</code> attribute.<br>
    * Model Attribute: <code>logInformacionAsesorVerContratoNovedad</code>. Constant Bool<br>
    * Comments: <br>
    * @return The value of the <code>logInformacionAsesorVerContratoNovedad</code> attribute.
    */

    public Boolean getLogInformacionAsesorVerContratoNovedad()  {
    	Boolean value;
        value =  logInformacionAsesorVerContratoNovedad;
        return value;
    }

   /**
    * Sets the value of the <code>logInformacionAsesorVerContratoNovedad</code> attribute.<br>
    * Model Attribute: <code>logInformacionAsesorVerContratoNovedad</code>. Constant Bool<br>
    * Comments: <br>
    * @param logInformacionAsesorVerContratoNovedad The new value of the <code>logInformacionAsesorVerContratoNovedad</code> attribute.
    */
    public void setLogInformacionAsesorVerContratoNovedad (Boolean logInformacionAsesorVerContratoNovedad) {
        modifiedLogInformacionAsesorVerContratoNovedad = true;
        this.logInformacionAsesorVerContratoNovedad = logInformacionAsesorVerContratoNovedad;
    }

   /**
    * Returns the value of the <code>modifiedLogInformacionAsesorVerContratoNovedad</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogInformacionAsesorVerContratoNovedad</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogInformacionAsesorVerContratoNovedad() {
        return modifiedLogInformacionAsesorVerContratoNovedad;
    }

   /**
    * Sets the value of the <code>modifiedLogInformacionAsesorVerContratoNovedad</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogInformacionAsesorVerContratoNovedad</code>.
    */
    public void setModifiedLogInformacionAsesorVerContratoNovedad(boolean modified) {
        this.modifiedLogInformacionAsesorVerContratoNovedad = modified;
    }

   /**
    * Returns the value of the <code>logInformacionAsesorAccesoValidadorUsuarios</code> attribute.<br>
    * Model Attribute: <code>logInformacionAsesorAccesoValidadorUsuarios</code>. Constant Bool<br>
    * Comments: <br>
    * @return The value of the <code>logInformacionAsesorAccesoValidadorUsuarios</code> attribute.
    */

    public Boolean getLogInformacionAsesorAccesoValidadorUsuarios()  {
    	Boolean value;
        value =  logInformacionAsesorAccesoValidadorUsuarios;
        return value;
    }

   /**
    * Sets the value of the <code>logInformacionAsesorAccesoValidadorUsuarios</code> attribute.<br>
    * Model Attribute: <code>logInformacionAsesorAccesoValidadorUsuarios</code>. Constant Bool<br>
    * Comments: <br>
    * @param logInformacionAsesorAccesoValidadorUsuarios The new value of the <code>logInformacionAsesorAccesoValidadorUsuarios</code> attribute.
    */
    public void setLogInformacionAsesorAccesoValidadorUsuarios (Boolean logInformacionAsesorAccesoValidadorUsuarios) {
        modifiedLogInformacionAsesorAccesoValidadorUsuarios = true;
        this.logInformacionAsesorAccesoValidadorUsuarios = logInformacionAsesorAccesoValidadorUsuarios;
    }

   /**
    * Returns the value of the <code>modifiedLogInformacionAsesorAccesoValidadorUsuarios</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogInformacionAsesorAccesoValidadorUsuarios</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogInformacionAsesorAccesoValidadorUsuarios() {
        return modifiedLogInformacionAsesorAccesoValidadorUsuarios;
    }

   /**
    * Sets the value of the <code>modifiedLogInformacionAsesorAccesoValidadorUsuarios</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogInformacionAsesorAccesoValidadorUsuarios</code>.
    */
    public void setModifiedLogInformacionAsesorAccesoValidadorUsuarios(boolean modified) {
        this.modifiedLogInformacionAsesorAccesoValidadorUsuarios = modified;
    }

    /**
     * Returns the instance of <code>Asesor</code> related through the <code>Asesor</code> role.
     * Model Relationship:
     * <code>[Asesor] Asesor 1:1  ------ 0:M  LogInformacionAsesor [LogInformacionAsesor]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Asesor</code> related through the <code>Asesor</code> role.
     */
    @JsonIgnore
    public Asesor getAsesor() {
        return asesor;
    }

    /**
     * Adds an instance of <code>Asesor</code> related through the <code>Asesor</code> role.
     * @param asesor The instance to add to the <code>Asesor</code> role.
     */
    public void add2Asesor(Asesor asesor) {
        if (asesor == null || asesor.isNull()) {
            this.modifiedAsesor = true;
            this.funcionarioId = null;
        } else {
            this.funcionarioId = asesor.getFuncionarioId();
        }
        this.asesor = (asesor == null  || asesor.isNull() ? null : asesor);
    }

   /**
    * This method gets the attribute value <code>modifiedAsesor</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedAsesor</code> has been modified.
    */
    public boolean isModifiedAsesor(){
        return modifiedAsesor;
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
        logInformacionAsesorFechaHora = Timestamp.valueOf(Constants.DATETIME_DEFAULTVALUE);
        logInformacionAsesorLoginFuncionario = "";
        logInformacionAsesorVerDatosPersona = false;
        logInformacionAsesorVerDocsPersona = false;
        logInformacionAsesorVerContratoNovedad = false;
        logInformacionAsesorAccesoValidadorUsuarios = false;
        asesor = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return LogInformacionAsesor.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return LogInformacionAsesorConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedLogInformacionAsesorFechaHora = false;
    	values.put("logInformacionAsesorFechaHora", getLogInformacionAsesorFechaHora());
    	modifiedLogInformacionAsesorLoginFuncionario = false;
    	values.put("logInformacionAsesorLoginFuncionario", getLogInformacionAsesorLoginFuncionario());
    	modifiedLogInformacionAsesorVerDatosPersona = false;
    	values.put("logInformacionAsesorVerDatosPersona", getLogInformacionAsesorVerDatosPersona());
    	modifiedLogInformacionAsesorVerDocsPersona = false;
    	values.put("logInformacionAsesorVerDocsPersona", getLogInformacionAsesorVerDocsPersona());
    	modifiedLogInformacionAsesorVerContratoNovedad = false;
    	values.put("logInformacionAsesorVerContratoNovedad", getLogInformacionAsesorVerContratoNovedad());
    	modifiedLogInformacionAsesorAccesoValidadorUsuarios = false;
    	values.put("logInformacionAsesorAccesoValidadorUsuarios", getLogInformacionAsesorAccesoValidadorUsuarios());
    	modifiedAsesor = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>LogInformacionAsesorOid</code> object that identifies this instance of <code>LogInformacionAsesor</code>.
     * @return <code>LogInformacionAsesorOid </code> object that identifies this instance of <code>LogInformacionAsesor</code>
     */
	@Override
    public LogInformacionAsesorOid getOid() {
        return new LogInformacionAsesorOid(getLogInformacionAsesoridLogInformacionAsesor());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(LogInformacionAsesorConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(LogInformacionAsesorConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.LOGINFORMACIONASESOR)) {
            // Add this class
            activeFacets.add(Constants.LOGINFORMACIONASESOR);
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
            relatedInstance = buildLogInformacionAsesorRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogInformacionAsesorConstants.ROLE_NAME_ASESOR.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogInformacionAsesorRelatedInstance4Asesor(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogInformacionAsesorRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogInformacionAsesor(mapper.readValue(relatedInstanceJsonOid, LogInformacionAsesorOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogInformacionAsesor.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildLogInformacionAsesorRelatedInstance4Asesor(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Asesor(mapper.readValue(relatedInstanceJsonOid, AsesorOid.class)): Asesor.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogInformacionAsesor.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
