package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.MotDevAreaMedicaConstants;
import com.keralty.aepersonas.persistence.oid.MotDevAreaMedicaOid;
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
 * Persistent representation of the <code>MotDevAreaMedica</code> model class.
 * <p>
 * Model Class: <code>MotDevAreaMedica</code><br>
 */
@Entity(name = MotDevAreaMedicaConstants.CLASS_NAME)
@Table(name = MotDevAreaMedicaConstants.TBL_NAME)
public class MotDevAreaMedica extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MotDevAreaMedica_Sequence")
    @SequenceGenerator(name="MotDevAreaMedica_Sequence", sequenceName="MotDevAreaMedica_Sequence", allocationSize=1)
    @Column(name = MotDevAreaMedicaConstants.FLD_MOTDEVAREAMEDICAID )
    @JsonProperty(value="id")
    private Long motDevAreaMedicaId;

    /** Class member attribute. */
    @Column(name = MotDevAreaMedicaConstants.FLD_MOTDEVAREAMEDICADESCRIPCION )
    @JsonProperty(value="descripcion")
    private String motDevAreaMedicaDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedMotDevAreaMedicaDescripcion;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public MotDevAreaMedica() {
        motDevAreaMedicaId = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>MotDevAreaMedica</code>.
     * @param oid Object Identifier of the instance of <code>MotDevAreaMedica</code> to be created.
     * @throws SystemException
     */
    public MotDevAreaMedica(MotDevAreaMedicaOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            motDevAreaMedicaId = oid.getMotDevAreaMedicaId();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>motDevAreaMedicaId</code> attribute<br>in class <code>MotDevAreaMedica</code>.
     * This is part of the identification for this class, which depends on the identification of <code>MotDevAreaMedica</code>
     * @return The value of the <code>motDevAreaMedicaId</code> attribute<br>in class <code>MotDevAreaMedica</code>.
     */
    public Long getMotDevAreaMedicaId() {
        return motDevAreaMedicaId;
    }

    /**
     * Sets the value of the <code>motDevAreaMedicaId</code> attribute<br>in class <code>MotDevAreaMedica</code>.
     * This is part of the identification for this class, which depends on the identification of <code>MotDevAreaMedica</code>
     * @param motDevAreaMedicaId The new value of the <code>motDevAreaMedicaId</code> attribute<br>in class <code>MotDevAreaMedica</code>.
     */
    public void setMotDevAreaMedicaId(Long motDevAreaMedicaId) {
        this.motDevAreaMedicaId = motDevAreaMedicaId;
    }

   /**
    * Returns the value of the <code>motDevAreaMedicaDescripcion</code> attribute.<br>
    * Model Attribute: <code>motDevAreaMedicaDescripcion</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>motDevAreaMedicaDescripcion</code> attribute.
    */

    public String getMotDevAreaMedicaDescripcion()  {
    	String value;
        value =  motDevAreaMedicaDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>motDevAreaMedicaDescripcion</code> attribute.<br>
    * Model Attribute: <code>motDevAreaMedicaDescripcion</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param motDevAreaMedicaDescripcion The new value of the <code>motDevAreaMedicaDescripcion</code> attribute.
    */
    public void setMotDevAreaMedicaDescripcion (String motDevAreaMedicaDescripcion) {
        modifiedMotDevAreaMedicaDescripcion = true;
        this.motDevAreaMedicaDescripcion = motDevAreaMedicaDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedMotDevAreaMedicaDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedMotDevAreaMedicaDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedMotDevAreaMedicaDescripcion() {
        return modifiedMotDevAreaMedicaDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedMotDevAreaMedicaDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedMotDevAreaMedicaDescripcion</code>.
    */
    public void setModifiedMotDevAreaMedicaDescripcion(boolean modified) {
        this.modifiedMotDevAreaMedicaDescripcion = modified;
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
        motDevAreaMedicaDescripcion = "";
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return MotDevAreaMedica.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return MotDevAreaMedicaConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
    }


   /**
    * This method sets all flags modifiers with false value.
    */
	@Override	
    public void clearModifiedFlags() {
    	values = new HashMap<>();
    	modifiedMotDevAreaMedicaDescripcion = false;
    	values.put("motDevAreaMedicaDescripcion", getMotDevAreaMedicaDescripcion());
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>MotDevAreaMedicaOid</code> object that identifies this instance of <code>MotDevAreaMedica</code>.
     * @return <code>MotDevAreaMedicaOid </code> object that identifies this instance of <code>MotDevAreaMedica</code>
     */
	@Override
    public MotDevAreaMedicaOid getOid() {
        return new MotDevAreaMedicaOid(getMotDevAreaMedicaId());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(MotDevAreaMedicaConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.MOTDEVAREAMEDICA)) {
            // Add this class
            activeFacets.add(Constants.MOTDEVAREAMEDICA);
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
            relatedInstance = buildMotDevAreaMedicaRelatedInstance(relatedInstanceJsonOid);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildMotDevAreaMedicaRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new MotDevAreaMedica(mapper.readValue(relatedInstanceJsonOid, MotDevAreaMedicaOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(MotDevAreaMedica.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
