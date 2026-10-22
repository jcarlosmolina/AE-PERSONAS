package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.TipoInstitucionCConstants;
import com.keralty.aepersonas.persistence.oid.PersonaCOid;
import com.keralty.aepersonas.persistence.oid.TipoInstitucionCOid;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Persistent representation of the <code>TipoInstitucionC</code> model class.
 * <p>
 * Model Class: <code>TipoInstitucionC</code><br>
 */
@Entity(name = TipoInstitucionCConstants.CLASS_NAME)
@Table(name = TipoInstitucionCConstants.TBL_NAME)
public class TipoInstitucionC extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @Column(name = TipoInstitucionCConstants.FLD_TIPOINSTITUCIONCCODIGO )
    @JsonProperty(value="codigo")
    private Long tipoInstitucionCCodigo;

    /** Class member attribute. */
    @Column(name = TipoInstitucionCConstants.FLD_TIPOINSTITUCIONCNOMBRE )
    @JsonProperty(value="nombre")
    private String tipoInstitucionCNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoInstitucionCNombre;

    /** Related Class. */
    @OneToMany(mappedBy = TipoInstitucionCConstants.ROLE_INVNAME_PERSONASC)
    @JsonIgnore
    private Collection <PersonaC> personasC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonasC;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public TipoInstitucionC() {
        tipoInstitucionCCodigo = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>TipoInstitucionC</code>.
     * @param oid Object Identifier of the instance of <code>TipoInstitucionC</code> to be created.
     * @throws SystemException
     */
    public TipoInstitucionC(TipoInstitucionCOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            tipoInstitucionCCodigo = oid.getTipoInstitucionCCodigo();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>tipoInstitucionCCodigo</code> attribute<br>in class <code>TipoInstitucionC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>TipoInstitucionC</code>
     * @return The value of the <code>tipoInstitucionCCodigo</code> attribute<br>in class <code>TipoInstitucionC</code>.
     */
    public Long getTipoInstitucionCCodigo() {
        return tipoInstitucionCCodigo;
    }

    /**
     * Sets the value of the <code>tipoInstitucionCCodigo</code> attribute<br>in class <code>TipoInstitucionC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>TipoInstitucionC</code>
     * @param tipoInstitucionCCodigo The new value of the <code>tipoInstitucionCCodigo</code> attribute<br>in class <code>TipoInstitucionC</code>.
     */
    public void setTipoInstitucionCCodigo(Long tipoInstitucionCCodigo) {
        this.tipoInstitucionCCodigo = tipoInstitucionCCodigo;
    }

   /**
    * Returns the value of the <code>tipoInstitucionCNombre</code> attribute.<br>
    * Model Attribute: <code>tipoInstitucionCNombre</code>. Variable String Size=150<br>
    * Comments: <br>
    * @return The value of the <code>tipoInstitucionCNombre</code> attribute.
    */

    public String getTipoInstitucionCNombre()  {
    	String value;
        value =  tipoInstitucionCNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>tipoInstitucionCNombre</code> attribute.<br>
    * Model Attribute: <code>tipoInstitucionCNombre</code>. Variable String Size=150<br>
    * Comments: <br>
    * @param tipoInstitucionCNombre The new value of the <code>tipoInstitucionCNombre</code> attribute.
    */
    public void setTipoInstitucionCNombre (String tipoInstitucionCNombre) {
        modifiedTipoInstitucionCNombre = true;
        this.tipoInstitucionCNombre = tipoInstitucionCNombre;
    }

   /**
    * Returns the value of the <code>modifiedTipoInstitucionCNombre</code> class property.<br>
    *
    * @return The value of the <code>modifiedTipoInstitucionCNombre</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTipoInstitucionCNombre() {
        return modifiedTipoInstitucionCNombre;
    }

   /**
    * Sets the value of the <code>modifiedTipoInstitucionCNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedTipoInstitucionCNombre</code>.
    */
    public void setModifiedTipoInstitucionCNombre(boolean modified) {
        this.modifiedTipoInstitucionCNombre = modified;
    }

    /**
     * Returns the instance of <code>PersonaC</code> related through the <code>PersonasC</code> role.
     * Model Relationship:
     * <code>[PersonaC] PersonasC 0:M  ------ 0:1  TipoInstitucionC [TipoInstitucionC]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>PersonaC</code> related through the <code>PersonasC</code> role.
     */
    @JsonIgnore
    public Collection <PersonaC> getPersonasC() {
        return personasC;
    }

    /**
     * Adds an instance of <code>PersonaC</code> related through the <code>PersonasC</code> role.
     * @param personasC The instance to add to the <code>PersonasC</code> role.
     */
    public void add2PersonasC(PersonaC personasC) {
        this.personasC.add(personasC);
    }
    /**
     * Removes an instance of <code>PersonaC</code> related through the <code>PersonasC</code> role.
     * @param personasC The instance to be removed
     */
    public void removeFromPersonasC(PersonaC personasC) {
    	this.personasC.remove(personasC);
    }
    /**
     * Sets instances of <code>PersonaC</code> related through the <code>PersonasC</code> role.
     * @param personasC The new value for the <code>PersonasC</code> role.
     */
    public void setPersonasC(Collection < PersonaC > personasC) {
        this.personasC = personasC;
    }

   /**
    * This method gets the attribute value <code>modifiedPersonasC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedPersonasC</code> has been modified.
    */
    public boolean isModifiedPersonasC(){
        return modifiedPersonasC;
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
        tipoInstitucionCNombre = "";
        personasC = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return TipoInstitucionC.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return TipoInstitucionCConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedTipoInstitucionCNombre = false;
    	values.put("tipoInstitucionCNombre", getTipoInstitucionCNombre());
    	modifiedPersonasC = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>TipoInstitucionCOid</code> object that identifies this instance of <code>TipoInstitucionC</code>.
     * @return <code>TipoInstitucionCOid </code> object that identifies this instance of <code>TipoInstitucionC</code>
     */
	@Override
    public TipoInstitucionCOid getOid() {
        return new TipoInstitucionCOid(getTipoInstitucionCCodigo());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(TipoInstitucionCConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.TIPOINSTITUCIONC)) {
            // Add this class
            activeFacets.add(Constants.TIPOINSTITUCIONC);
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
            relatedInstance = buildTipoInstitucionCRelatedInstance(relatedInstanceJsonOid);
        }
        if (TipoInstitucionCConstants.ROLE_NAME_PERSONASC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoInstitucionCRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildTipoInstitucionCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new TipoInstitucionC(mapper.readValue(relatedInstanceJsonOid, TipoInstitucionCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoInstitucionC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildTipoInstitucionCRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoInstitucionC.class).error(e.getMessage());
            return null;
        }
    }
}
