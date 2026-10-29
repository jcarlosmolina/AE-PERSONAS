package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.EstadoCivilConstants;
import com.keralty.aepersonas.persistence.oid.EstadoCivilOid;
import com.keralty.aepersonas.persistence.oid.PersonaCOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.repository.PersonaJpaRepository;
import io.quarkus.arc.Arc;
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
 * Persistent representation of the <code>EstadoCivil</code> model class.
 * <p>
 * Model Class: <code>EstadoCivil</code><br>
 */
@Entity(name = EstadoCivilConstants.CLASS_NAME)
@Table(name = EstadoCivilConstants.TBL_NAME)
public class EstadoCivil extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient PersonaJpaRepository personaRepository;

    /** Class identification function. */
    @Id
    @Column(name = EstadoCivilConstants.FLD_ESTADOCIVILCODIGO )
    @JsonProperty(value="codigo")
    private Long estadoCivilCodigo;

    /** Class member attribute. */
    @Column(name = EstadoCivilConstants.FLD_ESTADOCIVILDESCRIPCION )
    @JsonProperty(value="descripcion")
    private String estadoCivilDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedEstadoCivilDescripcion;

    /** Class member attribute. */
    @Column(name = EstadoCivilConstants.FLD_ESTADOCIVILNOMBRECORTO )
    @JsonProperty(value="nombrecorto")
    private String estadoCivilNombreCorto;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedEstadoCivilNombreCorto;

    /** Related Class. */
    @OneToMany(mappedBy = EstadoCivilConstants.ROLE_INVNAME_PERSONAS)
    @JsonIgnore
    private Collection <Persona> personas;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonas;

    /** Related Class. */
    @OneToMany(mappedBy = EstadoCivilConstants.ROLE_INVNAME_PERSONASC)
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
    public EstadoCivil() {
        estadoCivilCodigo = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>EstadoCivil</code>.
     * @param oid Object Identifier of the instance of <code>EstadoCivil</code> to be created.
     * @throws SystemException
     */
    public EstadoCivil(EstadoCivilOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            estadoCivilCodigo = oid.getEstadoCivilCodigo();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>estadoCivilCodigo</code> attribute<br>in class <code>EstadoCivil</code>.
     * This is part of the identification for this class, which depends on the identification of <code>EstadoCivil</code>
     * @return The value of the <code>estadoCivilCodigo</code> attribute<br>in class <code>EstadoCivil</code>.
     */
    public Long getEstadoCivilCodigo() {
        return estadoCivilCodigo;
    }

    /**
     * Sets the value of the <code>estadoCivilCodigo</code> attribute<br>in class <code>EstadoCivil</code>.
     * This is part of the identification for this class, which depends on the identification of <code>EstadoCivil</code>
     * @param estadoCivilCodigo The new value of the <code>estadoCivilCodigo</code> attribute<br>in class <code>EstadoCivil</code>.
     */
    public void setEstadoCivilCodigo(Long estadoCivilCodigo) {
        this.estadoCivilCodigo = estadoCivilCodigo;
    }

   /**
    * Returns the value of the <code>estadoCivilDescripcion</code> attribute.<br>
    * Model Attribute: <code>estadoCivilDescripcion</code>. Variable String Size=100<br>
    * Comments: <br>
    * @return The value of the <code>estadoCivilDescripcion</code> attribute.
    */

    public String getEstadoCivilDescripcion()  {
    	String value;
        value =  estadoCivilDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>estadoCivilDescripcion</code> attribute.<br>
    * Model Attribute: <code>estadoCivilDescripcion</code>. Variable String Size=100<br>
    * Comments: <br>
    * @param estadoCivilDescripcion The new value of the <code>estadoCivilDescripcion</code> attribute.
    */
    public void setEstadoCivilDescripcion (String estadoCivilDescripcion) {
        modifiedEstadoCivilDescripcion = true;
        this.estadoCivilDescripcion = estadoCivilDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedEstadoCivilDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedEstadoCivilDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedEstadoCivilDescripcion() {
        return modifiedEstadoCivilDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedEstadoCivilDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedEstadoCivilDescripcion</code>.
    */
    public void setModifiedEstadoCivilDescripcion(boolean modified) {
        this.modifiedEstadoCivilDescripcion = modified;
    }

   /**
    * Returns the value of the <code>estadoCivilNombreCorto</code> attribute.<br>
    * Model Attribute: <code>estadoCivilNombreCorto</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>estadoCivilNombreCorto</code> attribute.
    */

    public String getEstadoCivilNombreCorto()  {
    	String value;
        value =  estadoCivilNombreCorto;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>estadoCivilNombreCorto</code> attribute.<br>
    * Model Attribute: <code>estadoCivilNombreCorto</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param estadoCivilNombreCorto The new value of the <code>estadoCivilNombreCorto</code> attribute.
    */
    public void setEstadoCivilNombreCorto (String estadoCivilNombreCorto) {
        modifiedEstadoCivilNombreCorto = true;
        this.estadoCivilNombreCorto = estadoCivilNombreCorto;
    }

   /**
    * Returns the value of the <code>modifiedEstadoCivilNombreCorto</code> class property.<br>
    *
    * @return The value of the <code>modifiedEstadoCivilNombreCorto</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedEstadoCivilNombreCorto() {
        return modifiedEstadoCivilNombreCorto;
    }

   /**
    * Sets the value of the <code>modifiedEstadoCivilNombreCorto</code> class property.<br>
    * @param modified The new value of the <code>modifiedEstadoCivilNombreCorto</code>.
    */
    public void setModifiedEstadoCivilNombreCorto(boolean modified) {
        this.modifiedEstadoCivilNombreCorto = modified;
    }

    /**
     * Returns the instance of <code>Persona</code> related through the <code>Personas</code> role.
     * Model Relationship:
     * <code>[Persona] Personas 0:M  ------ 0:1  EstadoCivil [EstadoCivil]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Persona</code> related through the <code>Personas</code> role.
     */
    @JsonIgnore
    public Collection <Persona> getPersonas() {
        return getPersonaRepository().findByEstadoCivil(this);
    }

    /**
     * Adds an instance of <code>Persona</code> related through the <code>Personas</code> role.
     * @param personas The instance to add to the <code>Personas</code> role.
     */
    public void add2Personas(Persona personas) {
        this.personas.add(personas);
    }
    /**
     * Removes an instance of <code>Persona</code> related through the <code>Personas</code> role.
     * @param personas The instance to be removed
     */
    public void removeFromPersonas(Persona personas) {
    	this.personas.remove(personas);
    }
    /**
     * Sets instances of <code>Persona</code> related through the <code>Personas</code> role.
     * @param personas The new value for the <code>Personas</code> role.
     */
    public void setPersonas(Collection < Persona > personas) {
        this.personas = personas;
    }

   /**
    * This method gets the attribute value <code>modifiedPersonas</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedPersonas</code> has been modified.
    */
    public boolean isModifiedPersonas(){
        return modifiedPersonas;
    }

    /**
     * Returns the instance of <code>PersonaC</code> related through the <code>PersonasC</code> role.
     * Model Relationship:
     * <code>[PersonaC] PersonasC 0:M  ------ 0:1  EstadoCivilC [EstadoCivil]</code>
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
        estadoCivilDescripcion = "";
        estadoCivilNombreCorto = "";
        personas = null;
        personasC = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }
    public PersonaJpaRepository getPersonaRepository() {
        return Arc.container().select(PersonaJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return EstadoCivil.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return EstadoCivilConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedEstadoCivilDescripcion = false;
    	values.put("estadoCivilDescripcion", getEstadoCivilDescripcion());
    	modifiedEstadoCivilNombreCorto = false;
    	values.put("estadoCivilNombreCorto", getEstadoCivilNombreCorto());
    	modifiedPersonas = false;
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
     * Returns the <code>EstadoCivilOid</code> object that identifies this instance of <code>EstadoCivil</code>.
     * @return <code>EstadoCivilOid </code> object that identifies this instance of <code>EstadoCivil</code>
     */
	@Override
    public EstadoCivilOid getOid() {
        return new EstadoCivilOid(getEstadoCivilCodigo());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(EstadoCivilConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.ESTADOCIVIL)) {
            // Add this class
            activeFacets.add(Constants.ESTADOCIVIL);
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

    public String buildICEstadoCivil() {
        try {
            return getEstadoCivilDescripcion();
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
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
            relatedInstance = buildEstadoCivilRelatedInstance(relatedInstanceJsonOid);
        }
        if (EstadoCivilConstants.ROLE_NAME_PERSONAS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildEstadoCivilRelatedInstance4Persona(relatedInstanceJsonOid, remainingPath);
        }
        if (EstadoCivilConstants.ROLE_NAME_PERSONASC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildEstadoCivilRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildEstadoCivilRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new EstadoCivil(mapper.readValue(relatedInstanceJsonOid, EstadoCivilOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(EstadoCivil.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildEstadoCivilRelatedInstance4Persona(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Persona(mapper.readValue(relatedInstanceJsonOid, PersonaOid.class)): Persona.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(EstadoCivil.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildEstadoCivilRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(EstadoCivil.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
