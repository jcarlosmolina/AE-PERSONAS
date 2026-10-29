package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.BeneficiarioCConstants;
import com.keralty.aepersonas.global.ConceptoCConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.persistence.oid.BeneficiarioCOid;
import com.keralty.aepersonas.persistence.oid.ConceptoCOid;
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
 * Persistent representation of the <code>ConceptoC</code> model class.
 * <p>
 * Model Class: <code>ConceptoC</code><br>
 */
@Entity(name = ConceptoCConstants.CLASS_NAME)
@Table(name = ConceptoCConstants.TBL_NAME)
public class ConceptoC extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ConceptoC_Sequence")
    @SequenceGenerator(name="ConceptoC_Sequence", sequenceName="ConceptoC_Sequence", allocationSize=1)
    @Column(name = ConceptoCConstants.FLD_CONCEPTOCIDCONCEPTO )
    @JsonProperty(value="idconcepto")
    private Long conceptoCIdConcepto;

    /** Class member attribute. */
    @Column(name = ConceptoCConstants.FLD_CONCEPTOCCODCONCEPTOCONTRATO )
    @JsonProperty(value="codconceptocontrato")
    private String conceptoCcodConceptoContrato;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedConceptoCcodConceptoContrato;

    /** Class member attribute. */
    @Column(name = ConceptoCConstants.FLD_CONCEPTOCNOMBRECONCEPTO )
    @JsonProperty(value="nombreconcepto")
    private String conceptoCnombreConcepto;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedConceptoCnombreConcepto;

    /** Class member attribute. */
    @Column(name = ConceptoCConstants.FLD_CONCEPTOCPORCENTAJECONCEPTO )
    @JsonProperty(value="porcentajeconcepto")
    private Double conceptoCporcentajeConcepto;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedConceptoCporcentajeConcepto;

    /** Class member attribute. */
    @Column(name = ConceptoCConstants.FLD_CONCEPTOCVALORCONCEPTO )
    @JsonProperty(value="valorconcepto")
    private Double conceptoCvalorConcepto;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedConceptoCvalorConcepto;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=ConceptoCConstants.FLD_CONTRATOCID, referencedColumnName=BeneficiarioCConstants.FLD_CONTRATOCCONTRATOCID), 
        @JoinColumn(name=ConceptoCConstants.FLD_BENEFICIARIOCBENEFICIARIOCID, referencedColumnName=BeneficiarioCConstants.FLD_BENEFICIARIOCID)
    })
    @JsonIgnore
    private BeneficiarioC beneficiarioC;
    /** Related attribute. */
    @Column(name = ConceptoCConstants.FLD_CONTRATOCID, insertable = false, updatable = false)
    private Long contratoCID;
    /** Related attribute. */
    @Column(name = ConceptoCConstants.FLD_BENEFICIARIOCBENEFICIARIOCID, insertable = false, updatable = false)
    private Long beneficiarioCBeneficiarioCID;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedBeneficiarioC;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public ConceptoC() {
        conceptoCIdConcepto = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>ConceptoC</code>.
     * @param oid Object Identifier of the instance of <code>ConceptoC</code> to be created.
     * @throws SystemException
     */
    public ConceptoC(ConceptoCOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            conceptoCIdConcepto = oid.getConceptoCIdConcepto();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>conceptoCIdConcepto</code> attribute<br>in class <code>ConceptoC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ConceptoC</code>
     * @return The value of the <code>conceptoCIdConcepto</code> attribute<br>in class <code>ConceptoC</code>.
     */
    public Long getConceptoCIdConcepto() {
        return conceptoCIdConcepto;
    }

    /**
     * Sets the value of the <code>conceptoCIdConcepto</code> attribute<br>in class <code>ConceptoC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ConceptoC</code>
     * @param conceptoCIdConcepto The new value of the <code>conceptoCIdConcepto</code> attribute<br>in class <code>ConceptoC</code>.
     */
    public void setConceptoCIdConcepto(Long conceptoCIdConcepto) {
        this.conceptoCIdConcepto = conceptoCIdConcepto;
    }

   /**
    * Returns the value of the <code>conceptoCcodConceptoContrato</code> attribute.<br>
    * Model Attribute: <code>conceptoCcodConceptoContrato</code>. Constant String Size=4<br>
    * Comments: <br>
    * @return The value of the <code>conceptoCcodConceptoContrato</code> attribute.
    */

    public String getConceptoCcodConceptoContrato()  {
    	String value;
        value =  conceptoCcodConceptoContrato;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>conceptoCcodConceptoContrato</code> attribute.<br>
    * Model Attribute: <code>conceptoCcodConceptoContrato</code>. Constant String Size=4<br>
    * Comments: <br>
    * @param conceptoCcodConceptoContrato The new value of the <code>conceptoCcodConceptoContrato</code> attribute.
    */
    public void setConceptoCcodConceptoContrato (String conceptoCcodConceptoContrato) {
        modifiedConceptoCcodConceptoContrato = true;
        this.conceptoCcodConceptoContrato = conceptoCcodConceptoContrato;
    }

   /**
    * Returns the value of the <code>modifiedConceptoCcodConceptoContrato</code> class property.<br>
    *
    * @return The value of the <code>modifiedConceptoCcodConceptoContrato</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedConceptoCcodConceptoContrato() {
        return modifiedConceptoCcodConceptoContrato;
    }

   /**
    * Sets the value of the <code>modifiedConceptoCcodConceptoContrato</code> class property.<br>
    * @param modified The new value of the <code>modifiedConceptoCcodConceptoContrato</code>.
    */
    public void setModifiedConceptoCcodConceptoContrato(boolean modified) {
        this.modifiedConceptoCcodConceptoContrato = modified;
    }

   /**
    * Returns the value of the <code>conceptoCnombreConcepto</code> attribute.<br>
    * Model Attribute: <code>conceptoCnombreConcepto</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>conceptoCnombreConcepto</code> attribute.
    */

    public String getConceptoCnombreConcepto()  {
    	String value;
        value =  conceptoCnombreConcepto;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>conceptoCnombreConcepto</code> attribute.<br>
    * Model Attribute: <code>conceptoCnombreConcepto</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param conceptoCnombreConcepto The new value of the <code>conceptoCnombreConcepto</code> attribute.
    */
    public void setConceptoCnombreConcepto (String conceptoCnombreConcepto) {
        modifiedConceptoCnombreConcepto = true;
        this.conceptoCnombreConcepto = conceptoCnombreConcepto;
    }

   /**
    * Returns the value of the <code>modifiedConceptoCnombreConcepto</code> class property.<br>
    *
    * @return The value of the <code>modifiedConceptoCnombreConcepto</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedConceptoCnombreConcepto() {
        return modifiedConceptoCnombreConcepto;
    }

   /**
    * Sets the value of the <code>modifiedConceptoCnombreConcepto</code> class property.<br>
    * @param modified The new value of the <code>modifiedConceptoCnombreConcepto</code>.
    */
    public void setModifiedConceptoCnombreConcepto(boolean modified) {
        this.modifiedConceptoCnombreConcepto = modified;
    }

   /**
    * Returns the value of the <code>conceptoCporcentajeConcepto</code> attribute.<br>
    * Model Attribute: <code>conceptoCporcentajeConcepto</code>. Constant Real<br>
    * Comments: <br>
    * @return The value of the <code>conceptoCporcentajeConcepto</code> attribute.
    */

    public Double getConceptoCporcentajeConcepto()  {
    	Double value;
        value =  conceptoCporcentajeConcepto;
        return value;
    }

   /**
    * Sets the value of the <code>conceptoCporcentajeConcepto</code> attribute.<br>
    * Model Attribute: <code>conceptoCporcentajeConcepto</code>. Constant Real<br>
    * Comments: <br>
    * @param conceptoCporcentajeConcepto The new value of the <code>conceptoCporcentajeConcepto</code> attribute.
    */
    public void setConceptoCporcentajeConcepto (Double conceptoCporcentajeConcepto) {
        modifiedConceptoCporcentajeConcepto = true;
        this.conceptoCporcentajeConcepto = conceptoCporcentajeConcepto;
    }

   /**
    * Returns the value of the <code>modifiedConceptoCporcentajeConcepto</code> class property.<br>
    *
    * @return The value of the <code>modifiedConceptoCporcentajeConcepto</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedConceptoCporcentajeConcepto() {
        return modifiedConceptoCporcentajeConcepto;
    }

   /**
    * Sets the value of the <code>modifiedConceptoCporcentajeConcepto</code> class property.<br>
    * @param modified The new value of the <code>modifiedConceptoCporcentajeConcepto</code>.
    */
    public void setModifiedConceptoCporcentajeConcepto(boolean modified) {
        this.modifiedConceptoCporcentajeConcepto = modified;
    }

   /**
    * Returns the value of the <code>conceptoCvalorConcepto</code> attribute.<br>
    * Model Attribute: <code>conceptoCvalorConcepto</code>. Constant Real<br>
    * Comments: <br>
    * @return The value of the <code>conceptoCvalorConcepto</code> attribute.
    */

    public Double getConceptoCvalorConcepto()  {
    	Double value;
        value =  conceptoCvalorConcepto;
        return value;
    }

   /**
    * Sets the value of the <code>conceptoCvalorConcepto</code> attribute.<br>
    * Model Attribute: <code>conceptoCvalorConcepto</code>. Constant Real<br>
    * Comments: <br>
    * @param conceptoCvalorConcepto The new value of the <code>conceptoCvalorConcepto</code> attribute.
    */
    public void setConceptoCvalorConcepto (Double conceptoCvalorConcepto) {
        modifiedConceptoCvalorConcepto = true;
        this.conceptoCvalorConcepto = conceptoCvalorConcepto;
    }

   /**
    * Returns the value of the <code>modifiedConceptoCvalorConcepto</code> class property.<br>
    *
    * @return The value of the <code>modifiedConceptoCvalorConcepto</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedConceptoCvalorConcepto() {
        return modifiedConceptoCvalorConcepto;
    }

   /**
    * Sets the value of the <code>modifiedConceptoCvalorConcepto</code> class property.<br>
    * @param modified The new value of the <code>modifiedConceptoCvalorConcepto</code>.
    */
    public void setModifiedConceptoCvalorConcepto(boolean modified) {
        this.modifiedConceptoCvalorConcepto = modified;
    }

    /**
     * Returns the instance of <code>BeneficiarioC</code> related through the <code>BeneficiarioC</code> role.
     * Model Relationship:
     * <code>[BeneficiarioC] BeneficiarioC 1:1  ------ 0:M  ConceptosC [ConceptoC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>BeneficiarioC</code> related through the <code>BeneficiarioC</code> role.
     */
    @JsonIgnore
    public BeneficiarioC getBeneficiarioC() {
        return beneficiarioC;
    }

    /**
     * Adds an instance of <code>BeneficiarioC</code> related through the <code>BeneficiarioC</code> role.
     * @param beneficiarioC The instance to add to the <code>BeneficiarioC</code> role.
     */
    public void add2BeneficiarioC(BeneficiarioC beneficiarioC) {
        if (beneficiarioC == null || beneficiarioC.isNull()) {
            this.modifiedBeneficiarioC = true;
            this.contratoCID = null;
            this.beneficiarioCBeneficiarioCID = null;
        } else {
            this.contratoCID = beneficiarioC.getContratoCContratoCID();
            this.beneficiarioCBeneficiarioCID = beneficiarioC.getBeneficiarioCID();
        }
        this.beneficiarioC = (beneficiarioC == null  || beneficiarioC.isNull() ? null : beneficiarioC);
    }

   /**
    * This method gets the attribute value <code>modifiedBeneficiarioC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedBeneficiarioC</code> has been modified.
    */
    public boolean isModifiedBeneficiarioC(){
        return modifiedBeneficiarioC;
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
        conceptoCcodConceptoContrato = null;
        conceptoCnombreConcepto = null;
        conceptoCporcentajeConcepto = null;
        conceptoCvalorConcepto = null;
        beneficiarioC = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return ConceptoC.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return ConceptoCConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedConceptoCcodConceptoContrato = false;
    	values.put("conceptoCcodConceptoContrato", getConceptoCcodConceptoContrato());
    	modifiedConceptoCnombreConcepto = false;
    	values.put("conceptoCnombreConcepto", getConceptoCnombreConcepto());
    	modifiedConceptoCporcentajeConcepto = false;
    	values.put("conceptoCporcentajeConcepto", getConceptoCporcentajeConcepto());
    	modifiedConceptoCvalorConcepto = false;
    	values.put("conceptoCvalorConcepto", getConceptoCvalorConcepto());
    	modifiedBeneficiarioC = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>ConceptoCOid</code> object that identifies this instance of <code>ConceptoC</code>.
     * @return <code>ConceptoCOid </code> object that identifies this instance of <code>ConceptoC</code>
     */
	@Override
    public ConceptoCOid getOid() {
        return new ConceptoCOid(getConceptoCIdConcepto());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(ConceptoCConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(ConceptoCConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.CONCEPTOC)) {
            // Add this class
            activeFacets.add(Constants.CONCEPTOC);
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
            relatedInstance = buildConceptoCRelatedInstance(relatedInstanceJsonOid);
        }
        if (ConceptoCConstants.ROLE_NAME_BENEFICIARIOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildConceptoCRelatedInstance4BeneficiarioC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildConceptoCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ConceptoC(mapper.readValue(relatedInstanceJsonOid, ConceptoCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ConceptoC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildConceptoCRelatedInstance4BeneficiarioC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new BeneficiarioC(mapper.readValue(relatedInstanceJsonOid, BeneficiarioCOid.class)): BeneficiarioC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ConceptoC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
