package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.ContratoComboConstants;
import com.keralty.aepersonas.persistence.oid.ContratoComboOid;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
 * Persistent representation of the <code>ContratoCombo</code> model class.
 * <p>
 * Model Class: <code>ContratoCombo</code><br>
 */
@Entity(name = ContratoComboConstants.CLASS_NAME)
@Table(name = ContratoComboConstants.TBL_NAME)
public class ContratoCombo extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ContratoCombo_Sequence")
    @SequenceGenerator(name="ContratoCombo_Sequence", sequenceName="ContratoCombo_Sequence", allocationSize=1)
    @Column(name = ContratoComboConstants.FLD_CONTRATOCOMBOID )
    @JsonProperty(value="id")
    private Long contratoComboId;

    /** Class member attribute. */
    @Column(name = ContratoComboConstants.FLD_CONTRATOCOMBOCONTRATOINTEGRAL )
    @JsonProperty(value="contratointegral")
    private String contratoComboContratoIntegral;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratoComboContratoIntegral;

    /** Class member attribute. */
    @Column(name = ContratoComboConstants.FLD_CONTRATOCOMBOCONTRATOODONTOLOGICO )
    @JsonProperty(value="contratoodontologico")
    private String contratoComboContratoOdontologico;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratoComboContratoOdontologico;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public ContratoCombo() {
        contratoComboId = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>ContratoCombo</code>.
     * @param oid Object Identifier of the instance of <code>ContratoCombo</code> to be created.
     * @throws SystemException
     */
    public ContratoCombo(ContratoComboOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            contratoComboId = oid.getContratoComboId();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>contratoComboId</code> attribute<br>in class <code>ContratoCombo</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ContratoCombo</code>
     * @return The value of the <code>contratoComboId</code> attribute<br>in class <code>ContratoCombo</code>.
     */
    public Long getContratoComboId() {
        return contratoComboId;
    }

    /**
     * Sets the value of the <code>contratoComboId</code> attribute<br>in class <code>ContratoCombo</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ContratoCombo</code>
     * @param contratoComboId The new value of the <code>contratoComboId</code> attribute<br>in class <code>ContratoCombo</code>.
     */
    public void setContratoComboId(Long contratoComboId) {
        this.contratoComboId = contratoComboId;
    }

   /**
    * Returns the value of the <code>contratoComboContratoIntegral</code> attribute.<br>
    * Model Attribute: <code>contratoComboContratoIntegral</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>contratoComboContratoIntegral</code> attribute.
    */

    public String getContratoComboContratoIntegral()  {
    	String value;
        value =  contratoComboContratoIntegral;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>contratoComboContratoIntegral</code> attribute.<br>
    * Model Attribute: <code>contratoComboContratoIntegral</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param contratoComboContratoIntegral The new value of the <code>contratoComboContratoIntegral</code> attribute.
    */
    public void setContratoComboContratoIntegral (String contratoComboContratoIntegral) {
        modifiedContratoComboContratoIntegral = true;
        this.contratoComboContratoIntegral = contratoComboContratoIntegral;
    }

   /**
    * Returns the value of the <code>modifiedContratoComboContratoIntegral</code> class property.<br>
    *
    * @return The value of the <code>modifiedContratoComboContratoIntegral</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedContratoComboContratoIntegral() {
        return modifiedContratoComboContratoIntegral;
    }

   /**
    * Sets the value of the <code>modifiedContratoComboContratoIntegral</code> class property.<br>
    * @param modified The new value of the <code>modifiedContratoComboContratoIntegral</code>.
    */
    public void setModifiedContratoComboContratoIntegral(boolean modified) {
        this.modifiedContratoComboContratoIntegral = modified;
    }

   /**
    * Returns the value of the <code>contratoComboContratoOdontologico</code> attribute.<br>
    * Model Attribute: <code>contratoComboContratoOdontologico</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>contratoComboContratoOdontologico</code> attribute.
    */

    public String getContratoComboContratoOdontologico()  {
    	String value;
        value =  contratoComboContratoOdontologico;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>contratoComboContratoOdontologico</code> attribute.<br>
    * Model Attribute: <code>contratoComboContratoOdontologico</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param contratoComboContratoOdontologico The new value of the <code>contratoComboContratoOdontologico</code> attribute.
    */
    public void setContratoComboContratoOdontologico (String contratoComboContratoOdontologico) {
        modifiedContratoComboContratoOdontologico = true;
        this.contratoComboContratoOdontologico = contratoComboContratoOdontologico;
    }

   /**
    * Returns the value of the <code>modifiedContratoComboContratoOdontologico</code> class property.<br>
    *
    * @return The value of the <code>modifiedContratoComboContratoOdontologico</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedContratoComboContratoOdontologico() {
        return modifiedContratoComboContratoOdontologico;
    }

   /**
    * Sets the value of the <code>modifiedContratoComboContratoOdontologico</code> class property.<br>
    * @param modified The new value of the <code>modifiedContratoComboContratoOdontologico</code>.
    */
    public void setModifiedContratoComboContratoOdontologico(boolean modified) {
        this.modifiedContratoComboContratoOdontologico = modified;
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
        contratoComboContratoIntegral = "";
        contratoComboContratoOdontologico = "";
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return ContratoCombo.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return ContratoComboConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
    }


   /**
    * This method sets all flags modifiers with false value.
    */
	@Override	
    public void clearModifiedFlags() {
    	values = new HashMap<>();
    	modifiedContratoComboContratoIntegral = false;
    	values.put("contratoComboContratoIntegral", getContratoComboContratoIntegral());
    	modifiedContratoComboContratoOdontologico = false;
    	values.put("contratoComboContratoOdontologico", getContratoComboContratoOdontologico());
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>ContratoComboOid</code> object that identifies this instance of <code>ContratoCombo</code>.
     * @return <code>ContratoComboOid </code> object that identifies this instance of <code>ContratoCombo</code>
     */
	@Override
    public ContratoComboOid getOid() {
        return new ContratoComboOid(getContratoComboId());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(ContratoComboConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.CONTRATOCOMBO)) {
            // Add this class
            activeFacets.add(Constants.CONTRATOCOMBO);
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


        if (getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.ASESOR) || getAgent().isFacetActive(Constants.GESTOR) || getAgent().isFacetActive(Constants.MESADEAPOYO)) {
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
            relatedInstance = buildContratoComboRelatedInstance(relatedInstanceJsonOid);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildContratoComboRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ContratoCombo(mapper.readValue(relatedInstanceJsonOid, ContratoComboOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ContratoCombo.class).error(e.getMessage());
            return null;
        }
    }
}
