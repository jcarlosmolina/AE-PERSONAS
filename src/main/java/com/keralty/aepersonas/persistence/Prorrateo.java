package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DominioConstants;
import com.keralty.aepersonas.global.ProrrateoConstants;
import com.keralty.aepersonas.persistence.oid.DominioOid;
import com.keralty.aepersonas.persistence.oid.ProrrateoOid;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Persistent representation of the <code>Prorrateo</code> model class.
 * <p>
 * Model Class: <code>Prorrateo</code><br>
 */
@Entity(name = ProrrateoConstants.CLASS_NAME)
@Table(name = ProrrateoConstants.TBL_NAME)
public class Prorrateo extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Embedded Class Identification Function */
    @EmbeddedId
    private ProrrateoOid oid;

    /** Class identification function. */
    @Column(name = ProrrateoConstants.FLD_DOMINIONUMERO, insertable = false, updatable = false )
    @JsonProperty(value="numero")
    private Long dominioNumero;

    /** Class identification function. */
    @Column(name = ProrrateoConstants.FLD_PRORRATEOIDPRORRATEO, insertable = false, updatable = false )
    @JsonProperty(value="id_prorrateo")
    private Long prorrateoidProrrateo;

    /** Class member attribute. */
    @Column(name = ProrrateoConstants.FLD_PRORRATEODIA )
    @JsonProperty(value="dia")
    private Long prorrateoDia;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProrrateoDia;

    /** Class member attribute. */
    @Column(name = ProrrateoConstants.FLD_PRORRATEOPORCENTAJE )
    @JsonProperty(value="porcentaje")
    private Double prorrateoPorcentaje;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProrrateoPorcentaje;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=ProrrateoConstants.FLD_DOMINIONUMERO, referencedColumnName=DominioConstants.FLD_DOMINIONUMERO, insertable = false, updatable = false)
    })
    @JsonIgnore
    private Dominio dominio;
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
    public Prorrateo() {
        dominioNumero = null;
        prorrateoidProrrateo = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>Prorrateo</code>.
     * @param oid Object Identifier of the instance of <code>Prorrateo</code> to be created.
     * @throws SystemException
     */
    public Prorrateo(ProrrateoOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            dominioNumero = oid.getDominioNumero();
            prorrateoidProrrateo = oid.getProrrateoidProrrateo();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>dominioNumero</code> attribute<br>in class <code>Dominio</code> through <code>Dominio</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Dominio</code>
     * @return The value of the <code>dominioNumero</code> attribute<br>in class <code>Dominio</code> through <code>Dominio</code>.
     */
    public Long getDominioNumero() {
        return (dominio != null ? dominio.getDominioNumero() : dominioNumero);
    }

    /**
     * Sets the value of the <code>dominioNumero</code> attribute<br>in class <code>Dominio</code> through <code>Dominio</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Dominio</code>
     * @param dominioNumero The new value of the <code>dominioNumero</code> attribute<br>in class <code>Dominio</code> through <code>Dominio</code>.
     */
    public void setDominioNumero(Long dominioNumero) {
        this.dominioNumero = dominioNumero;
    }

    /**
     * Returns the value of the <code>prorrateoidProrrateo</code> attribute<br>in class <code>Prorrateo</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Prorrateo</code>
     * @return The value of the <code>prorrateoidProrrateo</code> attribute<br>in class <code>Prorrateo</code>.
     */
    public Long getProrrateoidProrrateo() {
        return prorrateoidProrrateo;
    }

    /**
     * Sets the value of the <code>prorrateoidProrrateo</code> attribute<br>in class <code>Prorrateo</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Prorrateo</code>
     * @param prorrateoidProrrateo The new value of the <code>prorrateoidProrrateo</code> attribute<br>in class <code>Prorrateo</code>.
     */
    public void setProrrateoidProrrateo(Long prorrateoidProrrateo) {
        this.prorrateoidProrrateo = prorrateoidProrrateo;
    }

   /**
    * Returns the value of the <code>prorrateoDia</code> attribute.<br>
    * Model Attribute: <code>prorrateoDia</code>. Variable Nat<br>
    * Comments: <br>
    * @return The value of the <code>prorrateoDia</code> attribute.
    */

    public Long getProrrateoDia()  {
    	Long value;
        value =  prorrateoDia;
        return value;
    }

   /**
    * Sets the value of the <code>prorrateoDia</code> attribute.<br>
    * Model Attribute: <code>prorrateoDia</code>. Variable Nat<br>
    * Comments: <br>
    * @param prorrateoDia The new value of the <code>prorrateoDia</code> attribute.
    */
    public void setProrrateoDia (Long prorrateoDia) {
        modifiedProrrateoDia = true;
        this.prorrateoDia = prorrateoDia;
    }

   /**
    * Returns the value of the <code>modifiedProrrateoDia</code> class property.<br>
    *
    * @return The value of the <code>modifiedProrrateoDia</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedProrrateoDia() {
        return modifiedProrrateoDia;
    }

   /**
    * Sets the value of the <code>modifiedProrrateoDia</code> class property.<br>
    * @param modified The new value of the <code>modifiedProrrateoDia</code>.
    */
    public void setModifiedProrrateoDia(boolean modified) {
        this.modifiedProrrateoDia = modified;
    }

   /**
    * Returns the value of the <code>prorrateoPorcentaje</code> attribute.<br>
    * Model Attribute: <code>prorrateoPorcentaje</code>. Variable Real<br>
    * Comments: <br>
    * @return The value of the <code>prorrateoPorcentaje</code> attribute.
    */

    public Double getProrrateoPorcentaje()  {
    	Double value;
        value =  prorrateoPorcentaje;
        return value;
    }

   /**
    * Sets the value of the <code>prorrateoPorcentaje</code> attribute.<br>
    * Model Attribute: <code>prorrateoPorcentaje</code>. Variable Real<br>
    * Comments: <br>
    * @param prorrateoPorcentaje The new value of the <code>prorrateoPorcentaje</code> attribute.
    */
    public void setProrrateoPorcentaje (Double prorrateoPorcentaje) {
        modifiedProrrateoPorcentaje = true;
        this.prorrateoPorcentaje = prorrateoPorcentaje;
    }

   /**
    * Returns the value of the <code>modifiedProrrateoPorcentaje</code> class property.<br>
    *
    * @return The value of the <code>modifiedProrrateoPorcentaje</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedProrrateoPorcentaje() {
        return modifiedProrrateoPorcentaje;
    }

   /**
    * Sets the value of the <code>modifiedProrrateoPorcentaje</code> class property.<br>
    * @param modified The new value of the <code>modifiedProrrateoPorcentaje</code>.
    */
    public void setModifiedProrrateoPorcentaje(boolean modified) {
        this.modifiedProrrateoPorcentaje = modified;
    }

    /**
     * Returns the instance of <code>Dominio</code> related through the <code>Dominio</code> role.
     * Model Relationship:
     * <code>[Dominio] Dominio 1:1  ------ 0:M  Prorrateos [Prorrateo]</code>
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
        prorrateoDia = Long.valueOf(0);
        prorrateoPorcentaje = Double.valueOf(0);
        dominio = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return Prorrateo.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return ProrrateoConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedProrrateoDia = false;
    	values.put("prorrateoDia", getProrrateoDia());
    	modifiedProrrateoPorcentaje = false;
    	values.put("prorrateoPorcentaje", getProrrateoPorcentaje());
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
     * Returns the <code>ProrrateoOid</code> object that identifies this instance of <code>Prorrateo</code>.
     * @return <code>ProrrateoOid </code> object that identifies this instance of <code>Prorrateo</code>
     */
	@Override
    public ProrrateoOid getOid() {
        return new ProrrateoOid(getDominioNumero(), getProrrateoidProrrateo());
    }

    /**
     * Sets the <code>ProrrateoOid</code> object that identifies this instance of <code>Prorrateo</code>.
     */    
    public void setOid(ProrrateoOid oid) {
        this.oid = oid;
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(ProrrateoConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(ProrrateoConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.PRORRATEO)) {
            // Add this class
            activeFacets.add(Constants.PRORRATEO);
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
            relatedInstance = buildProrrateoRelatedInstance(relatedInstanceJsonOid);
        }
        if (ProrrateoConstants.ROLE_NAME_DOMINIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildProrrateoRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildProrrateoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Prorrateo(mapper.readValue(relatedInstanceJsonOid, ProrrateoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Prorrateo.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildProrrateoRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Prorrateo.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
