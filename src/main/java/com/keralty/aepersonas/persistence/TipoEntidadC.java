package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.TipoEntidadCConstants;
import com.keralty.aepersonas.persistence.oid.PersonaCOid;
import com.keralty.aepersonas.persistence.oid.TipoEntidadCOid;
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
 * Persistent representation of the <code>TipoEntidadC</code> model class.
 * <p>
 * Model Class: <code>TipoEntidadC</code><br>
 */
@Entity(name = TipoEntidadCConstants.CLASS_NAME)
@Table(name = TipoEntidadCConstants.TBL_NAME)
public class TipoEntidadC extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @Column(name = TipoEntidadCConstants.FLD_TIPOENTIDADCCODIGO )
    @JsonProperty(value="codigo")
    private Long tipoEntidadCCodigo;

    /** Class member attribute. */
    @Column(name = TipoEntidadCConstants.FLD_TIPOENTIDADCDESCRIPCION )
    @JsonProperty(value="descripcion")
    private String tipoEntidadCDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoEntidadCDescripcion;

    /** Related Class. */
    @OneToMany(mappedBy = TipoEntidadCConstants.ROLE_INVNAME_PERSONASC)
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
    public TipoEntidadC() {
        tipoEntidadCCodigo = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>TipoEntidadC</code>.
     * @param oid Object Identifier of the instance of <code>TipoEntidadC</code> to be created.
     * @throws SystemException
     */
    public TipoEntidadC(TipoEntidadCOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            tipoEntidadCCodigo = oid.getTipoEntidadCCodigo();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>tipoEntidadCCodigo</code> attribute<br>in class <code>TipoEntidadC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>TipoEntidadC</code>
     * @return The value of the <code>tipoEntidadCCodigo</code> attribute<br>in class <code>TipoEntidadC</code>.
     */
    public Long getTipoEntidadCCodigo() {
        return tipoEntidadCCodigo;
    }

    /**
     * Sets the value of the <code>tipoEntidadCCodigo</code> attribute<br>in class <code>TipoEntidadC</code>.
     * This is part of the identification for this class, which depends on the identification of <code>TipoEntidadC</code>
     * @param tipoEntidadCCodigo The new value of the <code>tipoEntidadCCodigo</code> attribute<br>in class <code>TipoEntidadC</code>.
     */
    public void setTipoEntidadCCodigo(Long tipoEntidadCCodigo) {
        this.tipoEntidadCCodigo = tipoEntidadCCodigo;
    }

   /**
    * Returns the value of the <code>tipoEntidadCDescripcion</code> attribute.<br>
    * Model Attribute: <code>tipoEntidadCDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @return The value of the <code>tipoEntidadCDescripcion</code> attribute.
    */

    public String getTipoEntidadCDescripcion()  {
    	String value;
        value =  tipoEntidadCDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>tipoEntidadCDescripcion</code> attribute.<br>
    * Model Attribute: <code>tipoEntidadCDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @param tipoEntidadCDescripcion The new value of the <code>tipoEntidadCDescripcion</code> attribute.
    */
    public void setTipoEntidadCDescripcion (String tipoEntidadCDescripcion) {
        modifiedTipoEntidadCDescripcion = true;
        this.tipoEntidadCDescripcion = tipoEntidadCDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedTipoEntidadCDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedTipoEntidadCDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedTipoEntidadCDescripcion() {
        return modifiedTipoEntidadCDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedTipoEntidadCDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedTipoEntidadCDescripcion</code>.
    */
    public void setModifiedTipoEntidadCDescripcion(boolean modified) {
        this.modifiedTipoEntidadCDescripcion = modified;
    }

    /**
     * Returns the instance of <code>PersonaC</code> related through the <code>PersonasC</code> role.
     * Model Relationship:
     * <code>[PersonaC] PersonasC 0:M  ------ 0:1  TipoEntidadC [TipoEntidadC]</code>
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
        tipoEntidadCDescripcion = "";
        personasC = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return TipoEntidadC.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return TipoEntidadCConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedTipoEntidadCDescripcion = false;
    	values.put("tipoEntidadCDescripcion", getTipoEntidadCDescripcion());
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
     * Returns the <code>TipoEntidadCOid</code> object that identifies this instance of <code>TipoEntidadC</code>.
     * @return <code>TipoEntidadCOid </code> object that identifies this instance of <code>TipoEntidadC</code>
     */
	@Override
    public TipoEntidadCOid getOid() {
        return new TipoEntidadCOid(getTipoEntidadCCodigo());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(TipoEntidadCConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.TIPOENTIDADC)) {
            // Add this class
            activeFacets.add(Constants.TIPOENTIDADC);
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
            relatedInstance = buildTipoEntidadCRelatedInstance(relatedInstanceJsonOid);
        }
        if (TipoEntidadCConstants.ROLE_NAME_PERSONASC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoEntidadCRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildTipoEntidadCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new TipoEntidadC(mapper.readValue(relatedInstanceJsonOid, TipoEntidadCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoEntidadC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildTipoEntidadCRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoEntidadC.class).error(e.getMessage());
            return null;
        }
    }
}
