package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.ContSinDocSolConstants;
import com.keralty.aepersonas.persistence.oid.ContSinDocSolOid;
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
 * Persistent representation of the <code>ContSinDocSol</code> model class.
 * <p>
 * Model Class: <code>ContSinDocSol</code><br>
 */
@Entity(name = ContSinDocSolConstants.CLASS_NAME)
@Table(name = ContSinDocSolConstants.TBL_NAME)
public class ContSinDocSol extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ContSinDocSol_Sequence")
    @SequenceGenerator(name="ContSinDocSol_Sequence", sequenceName="ContSinDocSol_Sequence", allocationSize=1)
    @Column(name = ContSinDocSolConstants.FLD_CONTSINDOCSOLIDCONTSINDOCSOL )
    @JsonProperty(value="id_contsindocsol")
    private Long contSinDocSolidContSinDocSol;

    /** Class member attribute. */
    @Column(name = ContSinDocSolConstants.FLD_CONTSINDOCSOLNUMCONTRATO )
    @JsonProperty(value="numcontrato")
    private String contSinDocSolNumContrato;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContSinDocSolNumContrato;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public ContSinDocSol() {
        contSinDocSolidContSinDocSol = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>ContSinDocSol</code>.
     * @param oid Object Identifier of the instance of <code>ContSinDocSol</code> to be created.
     * @throws SystemException
     */
    public ContSinDocSol(ContSinDocSolOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            contSinDocSolidContSinDocSol = oid.getContSinDocSolidContSinDocSol();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>contSinDocSolidContSinDocSol</code> attribute<br>in class <code>ContSinDocSol</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ContSinDocSol</code>
     * @return The value of the <code>contSinDocSolidContSinDocSol</code> attribute<br>in class <code>ContSinDocSol</code>.
     */
    public Long getContSinDocSolidContSinDocSol() {
        return contSinDocSolidContSinDocSol;
    }

    /**
     * Sets the value of the <code>contSinDocSolidContSinDocSol</code> attribute<br>in class <code>ContSinDocSol</code>.
     * This is part of the identification for this class, which depends on the identification of <code>ContSinDocSol</code>
     * @param contSinDocSolidContSinDocSol The new value of the <code>contSinDocSolidContSinDocSol</code> attribute<br>in class <code>ContSinDocSol</code>.
     */
    public void setContSinDocSolidContSinDocSol(Long contSinDocSolidContSinDocSol) {
        this.contSinDocSolidContSinDocSol = contSinDocSolidContSinDocSol;
    }

   /**
    * Returns the value of the <code>contSinDocSolNumContrato</code> attribute.<br>
    * Model Attribute: <code>contSinDocSolNumContrato</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>contSinDocSolNumContrato</code> attribute.
    */

    public String getContSinDocSolNumContrato()  {
    	String value;
        value =  contSinDocSolNumContrato;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>contSinDocSolNumContrato</code> attribute.<br>
    * Model Attribute: <code>contSinDocSolNumContrato</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param contSinDocSolNumContrato The new value of the <code>contSinDocSolNumContrato</code> attribute.
    */
    public void setContSinDocSolNumContrato (String contSinDocSolNumContrato) {
        modifiedContSinDocSolNumContrato = true;
        this.contSinDocSolNumContrato = contSinDocSolNumContrato;
    }

   /**
    * Returns the value of the <code>modifiedContSinDocSolNumContrato</code> class property.<br>
    *
    * @return The value of the <code>modifiedContSinDocSolNumContrato</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedContSinDocSolNumContrato() {
        return modifiedContSinDocSolNumContrato;
    }

   /**
    * Sets the value of the <code>modifiedContSinDocSolNumContrato</code> class property.<br>
    * @param modified The new value of the <code>modifiedContSinDocSolNumContrato</code>.
    */
    public void setModifiedContSinDocSolNumContrato(boolean modified) {
        this.modifiedContSinDocSolNumContrato = modified;
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
        contSinDocSolNumContrato = "";
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return ContSinDocSol.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return ContSinDocSolConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
    }


   /**
    * This method sets all flags modifiers with false value.
    */
	@Override	
    public void clearModifiedFlags() {
    	values = new HashMap<>();
    	modifiedContSinDocSolNumContrato = false;
    	values.put("contSinDocSolNumContrato", getContSinDocSolNumContrato());
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>ContSinDocSolOid</code> object that identifies this instance of <code>ContSinDocSol</code>.
     * @return <code>ContSinDocSolOid </code> object that identifies this instance of <code>ContSinDocSol</code>
     */
	@Override
    public ContSinDocSolOid getOid() {
        return new ContSinDocSolOid(getContSinDocSolidContSinDocSol());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(ContSinDocSolConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.CONTSINDOCSOL)) {
            // Add this class
            activeFacets.add(Constants.CONTSINDOCSOL);
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
            relatedInstance = buildContSinDocSolRelatedInstance(relatedInstanceJsonOid);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildContSinDocSolRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ContSinDocSol(mapper.readValue(relatedInstanceJsonOid, ContSinDocSolOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ContSinDocSol.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
