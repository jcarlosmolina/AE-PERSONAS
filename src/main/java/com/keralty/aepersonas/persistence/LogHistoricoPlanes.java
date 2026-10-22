package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.AsesorConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.LogHistoricoPlanesConstants;
import com.keralty.aepersonas.persistence.oid.AsesorOid;
import com.keralty.aepersonas.persistence.oid.LogHistoricoPlanesOid;
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
 * Persistent representation of the <code>LogHistoricoPlanes</code> model class.
 * <p>
 * Model Class: <code>LogHistoricoPlanes</code><br>
 */
@Entity(name = LogHistoricoPlanesConstants.CLASS_NAME)
@Table(name = LogHistoricoPlanesConstants.TBL_NAME)
public class LogHistoricoPlanes extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LogHistoricoPlanes_Sequence")
    @SequenceGenerator(name="LogHistoricoPlanes_Sequence", sequenceName="LogHistoricoPlanes_Sequence", allocationSize=1)
    @Column(name = LogHistoricoPlanesConstants.FLD_LOGHISTORICOPLANESIDLOGHISTORICOPLANES )
    @JsonProperty(value="id_loghistoricoplanes")
    private Long logHistoricoPlanesidLogHistoricoPlanes;

    /** Class member attribute. */
    @Column(name = LogHistoricoPlanesConstants.FLD_LOGHISTORICOPLANESFECHAHORA )
    @JsonProperty(value="fechahora")
    private Timestamp logHistoricoPlanesFechaHora;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogHistoricoPlanesFechaHora;

    /** Class member attribute. */
    @Column(name = LogHistoricoPlanesConstants.FLD_LOGHISTORICOPLANESLOGINFUNCIONARIO )
    @JsonProperty(value="loginfuncionario")
    private String logHistoricoPlanesLoginFuncionario;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogHistoricoPlanesLoginFuncionario;

    /** Class member attribute. */
    @Column(name = LogHistoricoPlanesConstants.FLD_LOGHISTORICOPLANESPRODUCTO )
    @JsonProperty(value="producto")
    private String logHistoricoPlanesProducto;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogHistoricoPlanesProducto;

    /** Class member attribute. */
    @Column(name = LogHistoricoPlanesConstants.FLD_LOGHISTORICOPLANESPLAN )
    @JsonProperty(value="plan")
    private String logHistoricoPlanesPlan;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogHistoricoPlanesPlan;

    /** Class member attribute. */
    @Column(name = LogHistoricoPlanesConstants.FLD_LOGHISTORICOPLANESACCION )
    @JsonProperty(value="accion")
    private String logHistoricoPlanesAccion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogHistoricoPlanesAccion;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=LogHistoricoPlanesConstants.FLD_FUNCIONARIOID, referencedColumnName=AsesorConstants.FLD_FUNCIONARIOID)
    })
    @JsonIgnore
    private Asesor asesor;
    /** Related attribute. */
    @Column(name = LogHistoricoPlanesConstants.FLD_FUNCIONARIOID, insertable = false, updatable = false)
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
    public LogHistoricoPlanes() {
        logHistoricoPlanesidLogHistoricoPlanes = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>LogHistoricoPlanes</code>.
     * @param oid Object Identifier of the instance of <code>LogHistoricoPlanes</code> to be created.
     * @throws SystemException
     */
    public LogHistoricoPlanes(LogHistoricoPlanesOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            logHistoricoPlanesidLogHistoricoPlanes = oid.getLogHistoricoPlanesidLogHistoricoPlanes();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>logHistoricoPlanesidLogHistoricoPlanes</code> attribute<br>in class <code>LogHistoricoPlanes</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogHistoricoPlanes</code>
     * @return The value of the <code>logHistoricoPlanesidLogHistoricoPlanes</code> attribute<br>in class <code>LogHistoricoPlanes</code>.
     */
    public Long getLogHistoricoPlanesidLogHistoricoPlanes() {
        return logHistoricoPlanesidLogHistoricoPlanes;
    }

    /**
     * Sets the value of the <code>logHistoricoPlanesidLogHistoricoPlanes</code> attribute<br>in class <code>LogHistoricoPlanes</code>.
     * This is part of the identification for this class, which depends on the identification of <code>LogHistoricoPlanes</code>
     * @param logHistoricoPlanesidLogHistoricoPlanes The new value of the <code>logHistoricoPlanesidLogHistoricoPlanes</code> attribute<br>in class <code>LogHistoricoPlanes</code>.
     */
    public void setLogHistoricoPlanesidLogHistoricoPlanes(Long logHistoricoPlanesidLogHistoricoPlanes) {
        this.logHistoricoPlanesidLogHistoricoPlanes = logHistoricoPlanesidLogHistoricoPlanes;
    }

   /**
    * Returns the value of the <code>logHistoricoPlanesFechaHora</code> attribute.<br>
    * Model Attribute: <code>logHistoricoPlanesFechaHora</code>. Constant DateTime<br>
    * Comments: <br>
    * @return The value of the <code>logHistoricoPlanesFechaHora</code> attribute.
    */

    public Timestamp getLogHistoricoPlanesFechaHora()  {
    	Timestamp value;
        value =  logHistoricoPlanesFechaHora;
        return value;
    }

   /**
    * Sets the value of the <code>logHistoricoPlanesFechaHora</code> attribute.<br>
    * Model Attribute: <code>logHistoricoPlanesFechaHora</code>. Constant DateTime<br>
    * Comments: <br>
    * @param logHistoricoPlanesFechaHora The new value of the <code>logHistoricoPlanesFechaHora</code> attribute.
    */
    public void setLogHistoricoPlanesFechaHora (Timestamp logHistoricoPlanesFechaHora) {
        modifiedLogHistoricoPlanesFechaHora = true;
        this.logHistoricoPlanesFechaHora = logHistoricoPlanesFechaHora;
    }

   /**
    * Returns the value of the <code>modifiedLogHistoricoPlanesFechaHora</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogHistoricoPlanesFechaHora</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogHistoricoPlanesFechaHora() {
        return modifiedLogHistoricoPlanesFechaHora;
    }

   /**
    * Sets the value of the <code>modifiedLogHistoricoPlanesFechaHora</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogHistoricoPlanesFechaHora</code>.
    */
    public void setModifiedLogHistoricoPlanesFechaHora(boolean modified) {
        this.modifiedLogHistoricoPlanesFechaHora = modified;
    }

   /**
    * Returns the value of the <code>logHistoricoPlanesLoginFuncionario</code> attribute.<br>
    * Model Attribute: <code>logHistoricoPlanesLoginFuncionario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>logHistoricoPlanesLoginFuncionario</code> attribute.
    */

    public String getLogHistoricoPlanesLoginFuncionario()  {
    	String value;
        value =  logHistoricoPlanesLoginFuncionario;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logHistoricoPlanesLoginFuncionario</code> attribute.<br>
    * Model Attribute: <code>logHistoricoPlanesLoginFuncionario</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param logHistoricoPlanesLoginFuncionario The new value of the <code>logHistoricoPlanesLoginFuncionario</code> attribute.
    */
    public void setLogHistoricoPlanesLoginFuncionario (String logHistoricoPlanesLoginFuncionario) {
        modifiedLogHistoricoPlanesLoginFuncionario = true;
        this.logHistoricoPlanesLoginFuncionario = logHistoricoPlanesLoginFuncionario;
    }

   /**
    * Returns the value of the <code>modifiedLogHistoricoPlanesLoginFuncionario</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogHistoricoPlanesLoginFuncionario</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogHistoricoPlanesLoginFuncionario() {
        return modifiedLogHistoricoPlanesLoginFuncionario;
    }

   /**
    * Sets the value of the <code>modifiedLogHistoricoPlanesLoginFuncionario</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogHistoricoPlanesLoginFuncionario</code>.
    */
    public void setModifiedLogHistoricoPlanesLoginFuncionario(boolean modified) {
        this.modifiedLogHistoricoPlanesLoginFuncionario = modified;
    }

   /**
    * Returns the value of the <code>logHistoricoPlanesProducto</code> attribute.<br>
    * Model Attribute: <code>logHistoricoPlanesProducto</code>. Constant String Size=10<br>
    * Comments: Código legal del producto<br>
    * @return The value of the <code>logHistoricoPlanesProducto</code> attribute.
    */

    public String getLogHistoricoPlanesProducto()  {
    	String value;
        value =  logHistoricoPlanesProducto;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logHistoricoPlanesProducto</code> attribute.<br>
    * Model Attribute: <code>logHistoricoPlanesProducto</code>. Constant String Size=10<br>
    * Comments: Código legal del producto<br>
    * @param logHistoricoPlanesProducto The new value of the <code>logHistoricoPlanesProducto</code> attribute.
    */
    public void setLogHistoricoPlanesProducto (String logHistoricoPlanesProducto) {
        modifiedLogHistoricoPlanesProducto = true;
        this.logHistoricoPlanesProducto = logHistoricoPlanesProducto;
    }

   /**
    * Returns the value of the <code>modifiedLogHistoricoPlanesProducto</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogHistoricoPlanesProducto</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogHistoricoPlanesProducto() {
        return modifiedLogHistoricoPlanesProducto;
    }

   /**
    * Sets the value of the <code>modifiedLogHistoricoPlanesProducto</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogHistoricoPlanesProducto</code>.
    */
    public void setModifiedLogHistoricoPlanesProducto(boolean modified) {
        this.modifiedLogHistoricoPlanesProducto = modified;
    }

   /**
    * Returns the value of the <code>logHistoricoPlanesPlan</code> attribute.<br>
    * Model Attribute: <code>logHistoricoPlanesPlan</code>. Constant String Size=10<br>
    * Comments: Código legal del plan<br>
    * @return The value of the <code>logHistoricoPlanesPlan</code> attribute.
    */

    public String getLogHistoricoPlanesPlan()  {
    	String value;
        value =  logHistoricoPlanesPlan;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logHistoricoPlanesPlan</code> attribute.<br>
    * Model Attribute: <code>logHistoricoPlanesPlan</code>. Constant String Size=10<br>
    * Comments: Código legal del plan<br>
    * @param logHistoricoPlanesPlan The new value of the <code>logHistoricoPlanesPlan</code> attribute.
    */
    public void setLogHistoricoPlanesPlan (String logHistoricoPlanesPlan) {
        modifiedLogHistoricoPlanesPlan = true;
        this.logHistoricoPlanesPlan = logHistoricoPlanesPlan;
    }

   /**
    * Returns the value of the <code>modifiedLogHistoricoPlanesPlan</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogHistoricoPlanesPlan</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogHistoricoPlanesPlan() {
        return modifiedLogHistoricoPlanesPlan;
    }

   /**
    * Sets the value of the <code>modifiedLogHistoricoPlanesPlan</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogHistoricoPlanesPlan</code>.
    */
    public void setModifiedLogHistoricoPlanesPlan(boolean modified) {
        this.modifiedLogHistoricoPlanesPlan = modified;
    }

   /**
    * Returns the value of the <code>logHistoricoPlanesAccion</code> attribute.<br>
    * Model Attribute: <code>logHistoricoPlanesAccion</code>. Constant String Size=10<br>
    * Comments: Acción: Añadido o Eliminado<br>
    * @return The value of the <code>logHistoricoPlanesAccion</code> attribute.
    */

    public String getLogHistoricoPlanesAccion()  {
    	String value;
        value =  logHistoricoPlanesAccion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>logHistoricoPlanesAccion</code> attribute.<br>
    * Model Attribute: <code>logHistoricoPlanesAccion</code>. Constant String Size=10<br>
    * Comments: Acción: Añadido o Eliminado<br>
    * @param logHistoricoPlanesAccion The new value of the <code>logHistoricoPlanesAccion</code> attribute.
    */
    public void setLogHistoricoPlanesAccion (String logHistoricoPlanesAccion) {
        modifiedLogHistoricoPlanesAccion = true;
        this.logHistoricoPlanesAccion = logHistoricoPlanesAccion;
    }

   /**
    * Returns the value of the <code>modifiedLogHistoricoPlanesAccion</code> class property.<br>
    *
    * @return The value of the <code>modifiedLogHistoricoPlanesAccion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedLogHistoricoPlanesAccion() {
        return modifiedLogHistoricoPlanesAccion;
    }

   /**
    * Sets the value of the <code>modifiedLogHistoricoPlanesAccion</code> class property.<br>
    * @param modified The new value of the <code>modifiedLogHistoricoPlanesAccion</code>.
    */
    public void setModifiedLogHistoricoPlanesAccion(boolean modified) {
        this.modifiedLogHistoricoPlanesAccion = modified;
    }

    /**
     * Returns the instance of <code>Asesor</code> related through the <code>Asesor</code> role.
     * Model Relationship:
     * <code>[Asesor] Asesor 1:1  ------ 0:M  LogHistoricoPlanes [LogHistoricoPlanes]</code>
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
        logHistoricoPlanesFechaHora = Timestamp.valueOf(Constants.DATETIME_DEFAULTVALUE);
        logHistoricoPlanesLoginFuncionario = "";
        logHistoricoPlanesProducto = "";
        logHistoricoPlanesPlan = "";
        logHistoricoPlanesAccion = "";
        asesor = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return LogHistoricoPlanes.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return LogHistoricoPlanesConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedLogHistoricoPlanesFechaHora = false;
    	values.put("logHistoricoPlanesFechaHora", getLogHistoricoPlanesFechaHora());
    	modifiedLogHistoricoPlanesLoginFuncionario = false;
    	values.put("logHistoricoPlanesLoginFuncionario", getLogHistoricoPlanesLoginFuncionario());
    	modifiedLogHistoricoPlanesProducto = false;
    	values.put("logHistoricoPlanesProducto", getLogHistoricoPlanesProducto());
    	modifiedLogHistoricoPlanesPlan = false;
    	values.put("logHistoricoPlanesPlan", getLogHistoricoPlanesPlan());
    	modifiedLogHistoricoPlanesAccion = false;
    	values.put("logHistoricoPlanesAccion", getLogHistoricoPlanesAccion());
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
     * Returns the <code>LogHistoricoPlanesOid</code> object that identifies this instance of <code>LogHistoricoPlanes</code>.
     * @return <code>LogHistoricoPlanesOid </code> object that identifies this instance of <code>LogHistoricoPlanes</code>
     */
	@Override
    public LogHistoricoPlanesOid getOid() {
        return new LogHistoricoPlanesOid(getLogHistoricoPlanesidLogHistoricoPlanes());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(LogHistoricoPlanesConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(LogHistoricoPlanesConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.LOGHISTORICOPLANES)) {
            // Add this class
            activeFacets.add(Constants.LOGHISTORICOPLANES);
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
            relatedInstance = buildLogHistoricoPlanesRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogHistoricoPlanesConstants.ROLE_NAME_ASESOR.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogHistoricoPlanesRelatedInstance4Asesor(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogHistoricoPlanesRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogHistoricoPlanes(mapper.readValue(relatedInstanceJsonOid, LogHistoricoPlanesOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogHistoricoPlanes.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildLogHistoricoPlanesRelatedInstance4Asesor(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Asesor(mapper.readValue(relatedInstanceJsonOid, AsesorOid.class)): Asesor.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogHistoricoPlanes.class).error(e.getMessage());
            return null;
        }
    }
}
