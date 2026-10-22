package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.ContratosExentosFIngresoConstants;
import com.keralty.aepersonas.persistence.oid.ContratosExentosFIngresoOid;
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
 * Persistent representation of the <code>ContratosExentosFIngreso</code> model class.
 * <p>
 * Model Class: <code>ContratosExentosFIngreso</code><br>
 */
@Entity(name = ContratosExentosFIngresoConstants.CLASS_NAME)
@Table(name = ContratosExentosFIngresoConstants.TBL_NAME)
public class ContratosExentosFIngreso extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ContratosExentosFIngr_Sequence")
    @SequenceGenerator(name="ContratosExentosFIngr_Sequence", sequenceName="ContratosExentosFIngr_Sequence", allocationSize=1)
    @Column(name = ContratosExentosFIngresoConstants.FLD_CONTRATOSEXENTOSFINGRESOIDCONTRATOSEXENTOSFINGRESO )
    @JsonProperty(value="id_contratosexentosfingreso")
    private Long contratosExentosFIngresoidContratosExentosFIngreso;

    /** Class member attribute. */
    @Column(name = ContratosExentosFIngresoConstants.FLD_CONTRATOSEXENTOSFINGRESONUMCONTRATO )
    @JsonProperty(value="numcontrato")
    private String contratosExentosFIngresoNumContrato;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratosExentosFIngresoNumContrato;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public ContratosExentosFIngreso() {
        contratosExentosFIngresoidContratosExentosFIngreso = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>ContratosExentosFIngreso</code>.
     * @param oid Object Identifier of the instance of <code>ContratosExentosFIngreso</code> to be created.
     * @throws SystemException
     */
    public ContratosExentosFIngreso(ContratosExentosFIngresoOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            contratosExentosFIngresoidContratosExentosFIngreso = oid.getContratosExentosFIngresoidContratosExentosFIngreso();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>contratosExentosFIngresoidContratosExentosFIngreso</code> attribute<br>in class <code>ContratosExentosFIngreso</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ContratosExentosFIngreso</code>
     * @return The value of the <code>contratosExentosFIngresoidContratosExentosFIngreso</code> attribute<br>in class <code>ContratosExentosFIngreso</code>.
     */
    public Long getContratosExentosFIngresoidContratosExentosFIngreso() {
        return contratosExentosFIngresoidContratosExentosFIngreso;
    }

    /**
     * Sets the value of the <code>contratosExentosFIngresoidContratosExentosFIngreso</code> attribute<br>in class <code>ContratosExentosFIngreso</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ContratosExentosFIngreso</code>
     * @param contratosExentosFIngresoidContratosExentosFIngreso The new value of the <code>contratosExentosFIngresoidContratosExentosFIngreso</code> attribute<br>in class <code>ContratosExentosFIngreso</code>.
     */
    public void setContratosExentosFIngresoidContratosExentosFIngreso(Long contratosExentosFIngresoidContratosExentosFIngreso) {
        this.contratosExentosFIngresoidContratosExentosFIngreso = contratosExentosFIngresoidContratosExentosFIngreso;
    }

   /**
    * Returns the value of the <code>contratosExentosFIngresoNumContrato</code> attribute.<br>
    * Model Attribute: <code>contratosExentosFIngresoNumContrato</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>contratosExentosFIngresoNumContrato</code> attribute.
    */

    public String getContratosExentosFIngresoNumContrato()  {
    	String value;
        value =  contratosExentosFIngresoNumContrato;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>contratosExentosFIngresoNumContrato</code> attribute.<br>
    * Model Attribute: <code>contratosExentosFIngresoNumContrato</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param contratosExentosFIngresoNumContrato The new value of the <code>contratosExentosFIngresoNumContrato</code> attribute.
    */
    public void setContratosExentosFIngresoNumContrato (String contratosExentosFIngresoNumContrato) {
        modifiedContratosExentosFIngresoNumContrato = true;
        this.contratosExentosFIngresoNumContrato = contratosExentosFIngresoNumContrato;
    }

   /**
    * Returns the value of the <code>modifiedContratosExentosFIngresoNumContrato</code> class property.<br>
    *
    * @return The value of the <code>modifiedContratosExentosFIngresoNumContrato</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedContratosExentosFIngresoNumContrato() {
        return modifiedContratosExentosFIngresoNumContrato;
    }

   /**
    * Sets the value of the <code>modifiedContratosExentosFIngresoNumContrato</code> class property.<br>
    * @param modified The new value of the <code>modifiedContratosExentosFIngresoNumContrato</code>.
    */
    public void setModifiedContratosExentosFIngresoNumContrato(boolean modified) {
        this.modifiedContratosExentosFIngresoNumContrato = modified;
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
        contratosExentosFIngresoNumContrato = "";
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return ContratosExentosFIngreso.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return ContratosExentosFIngresoConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
    }


   /**
    * This method sets all flags modifiers with false value.
    */
	@Override	
    public void clearModifiedFlags() {
    	values = new HashMap<>();
    	modifiedContratosExentosFIngresoNumContrato = false;
    	values.put("contratosExentosFIngresoNumContrato", getContratosExentosFIngresoNumContrato());
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>ContratosExentosFIngresoOid</code> object that identifies this instance of <code>ContratosExentosFIngreso</code>.
     * @return <code>ContratosExentosFIngresoOid </code> object that identifies this instance of <code>ContratosExentosFIngreso</code>
     */
	@Override
    public ContratosExentosFIngresoOid getOid() {
        return new ContratosExentosFIngresoOid(getContratosExentosFIngresoidContratosExentosFIngreso());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(ContratosExentosFIngresoConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.CONTRATOSEXENTOSFINGRESO)) {
            // Add this class
            activeFacets.add(Constants.CONTRATOSEXENTOSFINGRESO);
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


        if (getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.MESADEAPOYO)) {
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
            relatedInstance = buildContratosExentosFIngresoRelatedInstance(relatedInstanceJsonOid);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildContratosExentosFIngresoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ContratosExentosFIngreso(mapper.readValue(relatedInstanceJsonOid, ContratosExentosFIngresoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ContratosExentosFIngreso.class).error(e.getMessage());
            return null;
        }
    }
}
