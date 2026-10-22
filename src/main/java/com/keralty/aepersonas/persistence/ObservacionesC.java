package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.ContratoCConstants;
import com.keralty.aepersonas.global.ObservacionesCConstants;
import com.keralty.aepersonas.persistence.oid.ContratoCOid;
import com.keralty.aepersonas.persistence.oid.ObservacionesCOid;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Persistent representation of the <code>ObservacionesC</code> model class.
 * <p>
 * Model Class: <code>ObservacionesC</code><br>
 */
@Entity(name = ObservacionesCConstants.CLASS_NAME)
@Table(name = ObservacionesCConstants.TBL_NAME)
public class ObservacionesC extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ObservacionesC_Sequence")
    @SequenceGenerator(name="ObservacionesC_Sequence", sequenceName="ObservacionesC_Sequence", allocationSize=1)
    @Column(name = ObservacionesCConstants.FLD_OBSERVACIONESCIDENTIFICADOR )
    @JsonProperty(value="identificador")
    private Long observacionesCIdentificador;

    /** Class member attribute. */
    @Column(name = ObservacionesCConstants.FLD_OBSERVACIONESCCODTIPOOBSERVACION )
    @JsonProperty(value="codtipoobservacion")
    private String observacionesCCodTipoObservacion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedObservacionesCCodTipoObservacion;

    /** Class member attribute. */
    @Column(name = ObservacionesCConstants.FLD_OBSERVACIONESCTIPOOBSERVACION )
    @JsonProperty(value="tipoobservacion")
    private String observacionesCTipoObservacion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedObservacionesCTipoObservacion;

    /** Class member attribute. */
    @Column(name = ObservacionesCConstants.FLD_OBSERVACIONESCOBSERVACIONS )
    @JsonProperty(value="observacions")
    private String observacionesCObservacions;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedObservacionesCObservacions;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=ObservacionesCConstants.FLD_CONTRATOCID, referencedColumnName=ContratoCConstants.FLD_CONTRATOCID)
    })
    @JsonIgnore
    private ContratoC contratoC;
    /** Related attribute. */
    @Column(name = ObservacionesCConstants.FLD_CONTRATOCID, insertable = false, updatable = false)
    private Long contratoCID;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratoC;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public ObservacionesC() {
        observacionesCIdentificador = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>ObservacionesC</code>.
     * @param oid Object Identifier of the instance of <code>ObservacionesC</code> to be created.
     * @throws SystemException
     */
    public ObservacionesC(ObservacionesCOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            observacionesCIdentificador = oid.getObservacionesCIdentificador();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>observacionesCIdentificador</code> attribute<br>in class <code>ObservacionesC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ObservacionesC</code>
     * @return The value of the <code>observacionesCIdentificador</code> attribute<br>in class <code>ObservacionesC</code>.
     */
    public Long getObservacionesCIdentificador() {
        return observacionesCIdentificador;
    }

    /**
     * Sets the value of the <code>observacionesCIdentificador</code> attribute<br>in class <code>ObservacionesC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ObservacionesC</code>
     * @param observacionesCIdentificador The new value of the <code>observacionesCIdentificador</code> attribute<br>in class <code>ObservacionesC</code>.
     */
    public void setObservacionesCIdentificador(Long observacionesCIdentificador) {
        this.observacionesCIdentificador = observacionesCIdentificador;
    }

   /**
    * Returns the value of the <code>observacionesCCodTipoObservacion</code> attribute.<br>
    * Model Attribute: <code>observacionesCCodTipoObservacion</code>. Constant String Size=9<br>
    * Comments: <br>
    * @return The value of the <code>observacionesCCodTipoObservacion</code> attribute.
    */

    public String getObservacionesCCodTipoObservacion()  {
    	String value;
        value =  observacionesCCodTipoObservacion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>observacionesCCodTipoObservacion</code> attribute.<br>
    * Model Attribute: <code>observacionesCCodTipoObservacion</code>. Constant String Size=9<br>
    * Comments: <br>
    * @param observacionesCCodTipoObservacion The new value of the <code>observacionesCCodTipoObservacion</code> attribute.
    */
    public void setObservacionesCCodTipoObservacion (String observacionesCCodTipoObservacion) {
        modifiedObservacionesCCodTipoObservacion = true;
        this.observacionesCCodTipoObservacion = observacionesCCodTipoObservacion;
    }

   /**
    * Returns the value of the <code>modifiedObservacionesCCodTipoObservacion</code> class property.<br>
    *
    * @return The value of the <code>modifiedObservacionesCCodTipoObservacion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedObservacionesCCodTipoObservacion() {
        return modifiedObservacionesCCodTipoObservacion;
    }

   /**
    * Sets the value of the <code>modifiedObservacionesCCodTipoObservacion</code> class property.<br>
    * @param modified The new value of the <code>modifiedObservacionesCCodTipoObservacion</code>.
    */
    public void setModifiedObservacionesCCodTipoObservacion(boolean modified) {
        this.modifiedObservacionesCCodTipoObservacion = modified;
    }

   /**
    * Returns the value of the <code>observacionesCTipoObservacion</code> attribute.<br>
    * Model Attribute: <code>observacionesCTipoObservacion</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>observacionesCTipoObservacion</code> attribute.
    */

    public String getObservacionesCTipoObservacion()  {
    	String value;
        value =  observacionesCTipoObservacion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>observacionesCTipoObservacion</code> attribute.<br>
    * Model Attribute: <code>observacionesCTipoObservacion</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param observacionesCTipoObservacion The new value of the <code>observacionesCTipoObservacion</code> attribute.
    */
    public void setObservacionesCTipoObservacion (String observacionesCTipoObservacion) {
        modifiedObservacionesCTipoObservacion = true;
        this.observacionesCTipoObservacion = observacionesCTipoObservacion;
    }

   /**
    * Returns the value of the <code>modifiedObservacionesCTipoObservacion</code> class property.<br>
    *
    * @return The value of the <code>modifiedObservacionesCTipoObservacion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedObservacionesCTipoObservacion() {
        return modifiedObservacionesCTipoObservacion;
    }

   /**
    * Sets the value of the <code>modifiedObservacionesCTipoObservacion</code> class property.<br>
    * @param modified The new value of the <code>modifiedObservacionesCTipoObservacion</code>.
    */
    public void setModifiedObservacionesCTipoObservacion(boolean modified) {
        this.modifiedObservacionesCTipoObservacion = modified;
    }

   /**
    * Returns the value of the <code>observacionesCObservacions</code> attribute.<br>
    * Model Attribute: <code>observacionesCObservacions</code>. Constant String Size=100<br>
    * Comments: <br>
    * @return The value of the <code>observacionesCObservacions</code> attribute.
    */

    public String getObservacionesCObservacions()  {
    	String value;
        value =  observacionesCObservacions;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>observacionesCObservacions</code> attribute.<br>
    * Model Attribute: <code>observacionesCObservacions</code>. Constant String Size=100<br>
    * Comments: <br>
    * @param observacionesCObservacions The new value of the <code>observacionesCObservacions</code> attribute.
    */
    public void setObservacionesCObservacions (String observacionesCObservacions) {
        modifiedObservacionesCObservacions = true;
        this.observacionesCObservacions = observacionesCObservacions;
    }

   /**
    * Returns the value of the <code>modifiedObservacionesCObservacions</code> class property.<br>
    *
    * @return The value of the <code>modifiedObservacionesCObservacions</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedObservacionesCObservacions() {
        return modifiedObservacionesCObservacions;
    }

   /**
    * Sets the value of the <code>modifiedObservacionesCObservacions</code> class property.<br>
    * @param modified The new value of the <code>modifiedObservacionesCObservacions</code>.
    */
    public void setModifiedObservacionesCObservacions(boolean modified) {
        this.modifiedObservacionesCObservacions = modified;
    }

    /**
     * Returns the instance of <code>ContratoC</code> related through the <code>ContratoC</code> role.
     * Model Relationship:
     * <code>[ContratoC] ContratoC 1:1  ------ 0:M  ObservacionesC [ObservacionesC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>ContratoC</code> related through the <code>ContratoC</code> role.
     */
    @JsonIgnore
    public ContratoC getContratoC() {
        return contratoC;
    }

    /**
     * Adds an instance of <code>ContratoC</code> related through the <code>ContratoC</code> role.
     * @param contratoC The instance to add to the <code>ContratoC</code> role.
     */
    public void add2ContratoC(ContratoC contratoC) {
        if (contratoC == null || contratoC.isNull()) {
            this.modifiedContratoC = true;
            this.contratoCID = null;
        } else {
            this.contratoCID = contratoC.getContratoCID();
        }
        this.contratoC = (contratoC == null  || contratoC.isNull() ? null : contratoC);
    }

   /**
    * This method gets the attribute value <code>modifiedContratoC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedContratoC</code> has been modified.
    */
    public boolean isModifiedContratoC(){
        return modifiedContratoC;
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
        observacionesCCodTipoObservacion = "";
        observacionesCTipoObservacion = "";
        observacionesCObservacions = "";
        contratoC = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return ObservacionesC.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return ObservacionesCConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedObservacionesCCodTipoObservacion = false;
    	values.put("observacionesCCodTipoObservacion", getObservacionesCCodTipoObservacion());
    	modifiedObservacionesCTipoObservacion = false;
    	values.put("observacionesCTipoObservacion", getObservacionesCTipoObservacion());
    	modifiedObservacionesCObservacions = false;
    	values.put("observacionesCObservacions", getObservacionesCObservacions());
    	modifiedContratoC = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>ObservacionesCOid</code> object that identifies this instance of <code>ObservacionesC</code>.
     * @return <code>ObservacionesCOid </code> object that identifies this instance of <code>ObservacionesC</code>
     */
	@Override
    public ObservacionesCOid getOid() {
        return new ObservacionesCOid(getObservacionesCIdentificador());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(ObservacionesCConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(ObservacionesCConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.OBSERVACIONESC)) {
            // Add this class
            activeFacets.add(Constants.OBSERVACIONESC);
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


        if (getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.ASESOR) || getAgent().isFacetActive(Constants.AREAMEDICA) || getAgent().isFacetActive(Constants.AFILIACIONES) || getAgent().isFacetActive(Constants.GESTOR) || getAgent().isFacetActive(Constants.MESADEAPOYO)) {
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
            relatedInstance = buildObservacionesCRelatedInstance(relatedInstanceJsonOid);
        }
        if (ObservacionesCConstants.ROLE_NAME_CONTRATOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildObservacionesCRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildObservacionesCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ObservacionesC(mapper.readValue(relatedInstanceJsonOid, ObservacionesCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ObservacionesC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildObservacionesCRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ObservacionesC.class).error(e.getMessage());
            return null;
        }
    }
}
