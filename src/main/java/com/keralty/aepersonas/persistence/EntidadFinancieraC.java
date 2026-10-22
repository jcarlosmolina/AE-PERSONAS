package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.EntidadFinancieraCConstants;
import com.keralty.aepersonas.persistence.oid.EntidadFinancieraCOid;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Persistent representation of the <code>EntidadFinancieraC</code> model class.
 * <p>
 * Model Class: <code>EntidadFinancieraC</code><br>
 */
@Entity(name = EntidadFinancieraCConstants.CLASS_NAME)
@Table(name = EntidadFinancieraCConstants.TBL_NAME)
public class EntidadFinancieraC extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @Column(name = EntidadFinancieraCConstants.FLD_ENTIDADFINANCIERACCODIGO )
    @JsonProperty(value="codigo")
    private Long entidadFinancieraCCodigo;

    /** Class member attribute. */
    @Column(name = EntidadFinancieraCConstants.FLD_ENTIDADFINANCIERACDESCRIPCION )
    @JsonProperty(value="descripcion")
    private String entidadFinancieraCDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedEntidadFinancieraCDescripcion;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public EntidadFinancieraC() {
        entidadFinancieraCCodigo = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>EntidadFinancieraC</code>.
     * @param oid Object Identifier of the instance of <code>EntidadFinancieraC</code> to be created.
     * @throws SystemException
     */
    public EntidadFinancieraC(EntidadFinancieraCOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            entidadFinancieraCCodigo = oid.getEntidadFinancieraCCodigo();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>entidadFinancieraCCodigo</code> attribute<br>in class <code>EntidadFinancieraC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>EntidadFinancieraC</code>
     * @return The value of the <code>entidadFinancieraCCodigo</code> attribute<br>in class <code>EntidadFinancieraC</code>.
     */
    public Long getEntidadFinancieraCCodigo() {
        return entidadFinancieraCCodigo;
    }

    /**
     * Sets the value of the <code>entidadFinancieraCCodigo</code> attribute<br>in class <code>EntidadFinancieraC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>EntidadFinancieraC</code>
     * @param entidadFinancieraCCodigo The new value of the <code>entidadFinancieraCCodigo</code> attribute<br>in class <code>EntidadFinancieraC</code>.
     */
    public void setEntidadFinancieraCCodigo(Long entidadFinancieraCCodigo) {
        this.entidadFinancieraCCodigo = entidadFinancieraCCodigo;
    }

   /**
    * Returns the value of the <code>entidadFinancieraCDescripcion</code> attribute.<br>
    * Model Attribute: <code>entidadFinancieraCDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @return The value of the <code>entidadFinancieraCDescripcion</code> attribute.
    */

    public String getEntidadFinancieraCDescripcion()  {
    	String value;
        value =  entidadFinancieraCDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>entidadFinancieraCDescripcion</code> attribute.<br>
    * Model Attribute: <code>entidadFinancieraCDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @param entidadFinancieraCDescripcion The new value of the <code>entidadFinancieraCDescripcion</code> attribute.
    */
    public void setEntidadFinancieraCDescripcion (String entidadFinancieraCDescripcion) {
        modifiedEntidadFinancieraCDescripcion = true;
        this.entidadFinancieraCDescripcion = entidadFinancieraCDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedEntidadFinancieraCDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedEntidadFinancieraCDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedEntidadFinancieraCDescripcion() {
        return modifiedEntidadFinancieraCDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedEntidadFinancieraCDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedEntidadFinancieraCDescripcion</code>.
    */
    public void setModifiedEntidadFinancieraCDescripcion(boolean modified) {
        this.modifiedEntidadFinancieraCDescripcion = modified;
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
        entidadFinancieraCDescripcion = "";
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return EntidadFinancieraC.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return EntidadFinancieraCConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
    }


   /**
    * This method sets all flags modifiers with false value.
    */
	@Override	
    public void clearModifiedFlags() {
    	values = new HashMap<>();
    	modifiedEntidadFinancieraCDescripcion = false;
    	values.put("entidadFinancieraCDescripcion", getEntidadFinancieraCDescripcion());
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>EntidadFinancieraCOid</code> object that identifies this instance of <code>EntidadFinancieraC</code>.
     * @return <code>EntidadFinancieraCOid </code> object that identifies this instance of <code>EntidadFinancieraC</code>
     */
	@Override
    public EntidadFinancieraCOid getOid() {
        return new EntidadFinancieraCOid(getEntidadFinancieraCCodigo());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(EntidadFinancieraCConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.ENTIDADFINANCIERAC)) {
            // Add this class
            activeFacets.add(Constants.ENTIDADFINANCIERAC);
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
            relatedInstance = buildEntidadFinancieraCRelatedInstance(relatedInstanceJsonOid);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildEntidadFinancieraCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new EntidadFinancieraC(mapper.readValue(relatedInstanceJsonOid, EntidadFinancieraCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(EntidadFinancieraC.class).error(e.getMessage());
            return null;
        }
    }
}
