package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.EstadoBeneficiarioAEConstants;
import com.keralty.aepersonas.global.EstadoBeneficiarioConstants;
import com.keralty.aepersonas.persistence.oid.EstadoBeneficiarioAEOid;
import com.keralty.aepersonas.persistence.oid.EstadoBeneficiarioOid;
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
 * Persistent representation of the <code>EstadoBeneficiarioAE</code> model class.
 * <p>
 * Model Class: <code>EstadoBeneficiarioAE</code><br>
 */
@Entity(name = EstadoBeneficiarioAEConstants.CLASS_NAME)
@Table(name = EstadoBeneficiarioAEConstants.TBL_NAME)
public class EstadoBeneficiarioAE extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EstadoBeneficiarioAE_Sequence")
    @SequenceGenerator(name="EstadoBeneficiarioAE_Sequence", sequenceName="EstadoBeneficiarioAE_Sequence", allocationSize=1)
    @Column(name = EstadoBeneficiarioAEConstants.FLD_ESTADOBENEFICIARIOAECODIGO )
    @JsonProperty(value="codigo")
    private Long estadoBeneficiarioAECodigo;

    /** Class member attribute. */
    @Column(name = EstadoBeneficiarioAEConstants.FLD_ESTADOBENEFICIARIOAEDESCRIPCION )
    @JsonProperty(value="descripcion")
    private String estadoBeneficiarioAEDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedEstadoBeneficiarioAEDescripcion;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=EstadoBeneficiarioAEConstants.FLD_ESTADOBENEFICIARIOESTADOBENEFICIARIOCORECODIGO, referencedColumnName=EstadoBeneficiarioConstants.FLD_ESTADOBENEFICIARIOCODIGO)
    })
    @JsonIgnore
    private EstadoBeneficiario estadoBeneficiarioCORE;
    /** Related attribute. */
    @Column(name = EstadoBeneficiarioAEConstants.FLD_ESTADOBENEFICIARIOESTADOBENEFICIARIOCORECODIGO, insertable = false, updatable = false)
    private Long estadoBeneficiarioEstadoBeneficiarioCORECodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedEstadoBeneficiarioCORE;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public EstadoBeneficiarioAE() {
        estadoBeneficiarioAECodigo = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>EstadoBeneficiarioAE</code>.
     * @param oid Object Identifier of the instance of <code>EstadoBeneficiarioAE</code> to be created.
     * @throws SystemException
     */
    public EstadoBeneficiarioAE(EstadoBeneficiarioAEOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            estadoBeneficiarioAECodigo = oid.getEstadoBeneficiarioAECodigo();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>estadoBeneficiarioAECodigo</code> attribute<br>in class <code>EstadoBeneficiarioAE</code>.
     * This is part of the identification for this class, which depends on the identification of <code>EstadoBeneficiarioAE</code>
     * @return The value of the <code>estadoBeneficiarioAECodigo</code> attribute<br>in class <code>EstadoBeneficiarioAE</code>.
     */
    public Long getEstadoBeneficiarioAECodigo() {
        return estadoBeneficiarioAECodigo;
    }

    /**
     * Sets the value of the <code>estadoBeneficiarioAECodigo</code> attribute<br>in class <code>EstadoBeneficiarioAE</code>.
     * This is part of the identification for this class, which depends on the identification of <code>EstadoBeneficiarioAE</code>
     * @param estadoBeneficiarioAECodigo The new value of the <code>estadoBeneficiarioAECodigo</code> attribute<br>in class <code>EstadoBeneficiarioAE</code>.
     */
    public void setEstadoBeneficiarioAECodigo(Long estadoBeneficiarioAECodigo) {
        this.estadoBeneficiarioAECodigo = estadoBeneficiarioAECodigo;
    }

   /**
    * Returns the value of the <code>estadoBeneficiarioAEDescripcion</code> attribute.<br>
    * Model Attribute: <code>estadoBeneficiarioAEDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @return The value of the <code>estadoBeneficiarioAEDescripcion</code> attribute.
    */

    public String getEstadoBeneficiarioAEDescripcion()  {
    	String value;
        value =  estadoBeneficiarioAEDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>estadoBeneficiarioAEDescripcion</code> attribute.<br>
    * Model Attribute: <code>estadoBeneficiarioAEDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @param estadoBeneficiarioAEDescripcion The new value of the <code>estadoBeneficiarioAEDescripcion</code> attribute.
    */
    public void setEstadoBeneficiarioAEDescripcion (String estadoBeneficiarioAEDescripcion) {
        modifiedEstadoBeneficiarioAEDescripcion = true;
        this.estadoBeneficiarioAEDescripcion = estadoBeneficiarioAEDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedEstadoBeneficiarioAEDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedEstadoBeneficiarioAEDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedEstadoBeneficiarioAEDescripcion() {
        return modifiedEstadoBeneficiarioAEDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedEstadoBeneficiarioAEDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedEstadoBeneficiarioAEDescripcion</code>.
    */
    public void setModifiedEstadoBeneficiarioAEDescripcion(boolean modified) {
        this.modifiedEstadoBeneficiarioAEDescripcion = modified;
    }

    /**
     * Returns the instance of <code>EstadoBeneficiario</code> related through the <code>EstadoBeneficiarioCORE</code> role.
     * Model Relationship:
     * <code>[EstadoBeneficiario] EstadoBeneficiarioCORE 1:1  ------ 0:M  EstadoBeneficiarioAE [EstadoBeneficiarioAE]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>EstadoBeneficiario</code> related through the <code>EstadoBeneficiarioCORE</code> role.
     */
    @JsonIgnore
    public EstadoBeneficiario getEstadoBeneficiarioCORE() {
        return estadoBeneficiarioCORE;
    }

    /**
     * Adds an instance of <code>EstadoBeneficiario</code> related through the <code>EstadoBeneficiarioCORE</code> role.
     * @param estadoBeneficiarioCORE The instance to add to the <code>EstadoBeneficiarioCORE</code> role.
     */
    public void add2EstadoBeneficiarioCORE(EstadoBeneficiario estadoBeneficiarioCORE) {
        if (estadoBeneficiarioCORE == null || estadoBeneficiarioCORE.isNull()) {
            this.modifiedEstadoBeneficiarioCORE = true;
            this.estadoBeneficiarioEstadoBeneficiarioCORECodigo = null;
        } else {
            this.estadoBeneficiarioEstadoBeneficiarioCORECodigo = estadoBeneficiarioCORE.getEstadoBeneficiarioCodigo();
        }
        this.estadoBeneficiarioCORE = (estadoBeneficiarioCORE == null  || estadoBeneficiarioCORE.isNull() ? null : estadoBeneficiarioCORE);
    }

   /**
    * This method gets the attribute value <code>modifiedEstadoBeneficiarioCORE</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedEstadoBeneficiarioCORE</code> has been modified.
    */
    public boolean isModifiedEstadoBeneficiarioCORE(){
        return modifiedEstadoBeneficiarioCORE;
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
        estadoBeneficiarioAEDescripcion = "";
        estadoBeneficiarioCORE = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return EstadoBeneficiarioAE.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return EstadoBeneficiarioAEConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedEstadoBeneficiarioAEDescripcion = false;
    	values.put("estadoBeneficiarioAEDescripcion", getEstadoBeneficiarioAEDescripcion());
    	modifiedEstadoBeneficiarioCORE = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>EstadoBeneficiarioAEOid</code> object that identifies this instance of <code>EstadoBeneficiarioAE</code>.
     * @return <code>EstadoBeneficiarioAEOid </code> object that identifies this instance of <code>EstadoBeneficiarioAE</code>
     */
	@Override
    public EstadoBeneficiarioAEOid getOid() {
        return new EstadoBeneficiarioAEOid(getEstadoBeneficiarioAECodigo());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(EstadoBeneficiarioAEConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(EstadoBeneficiarioAEConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.ESTADOBENEFICIARIOAE)) {
            // Add this class
            activeFacets.add(Constants.ESTADOBENEFICIARIOAE);
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
            relatedInstance = buildEstadoBeneficiarioAERelatedInstance(relatedInstanceJsonOid);
        }
        if (EstadoBeneficiarioAEConstants.ROLE_NAME_ESTADOBENEFICIARIOCORE.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildEstadoBeneficiarioAERelatedInstance4EstadoBeneficiario(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildEstadoBeneficiarioAERelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new EstadoBeneficiarioAE(mapper.readValue(relatedInstanceJsonOid, EstadoBeneficiarioAEOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(EstadoBeneficiarioAE.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildEstadoBeneficiarioAERelatedInstance4EstadoBeneficiario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new EstadoBeneficiario(mapper.readValue(relatedInstanceJsonOid, EstadoBeneficiarioOid.class)): EstadoBeneficiario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(EstadoBeneficiarioAE.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
