package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.EstadoPersonaConstants;
import com.keralty.aepersonas.persistence.oid.EstadoPersonaOid;
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
 * Persistent representation of the <code>EstadoPersona</code> model class.
 * <p>
 * Model Class: <code>EstadoPersona</code><br>
 */
@Entity(name = EstadoPersonaConstants.CLASS_NAME)
@Table(name = EstadoPersonaConstants.TBL_NAME)
public class EstadoPersona extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient PersonaJpaRepository personaRepository;

    /** Class identification function. */
    @Id
    @Column(name = EstadoPersonaConstants.FLD_ESTADOPERSONACODIGO )
    @JsonProperty(value="codigo")
    private Long estadoPersonaCodigo;

    /** Class member attribute. */
    @Column(name = EstadoPersonaConstants.FLD_ESTADOPERSONADESCRIPCION )
    @JsonProperty(value="descripcion")
    private String estadoPersonaDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedEstadoPersonaDescripcion;

    /** Class member attribute. */
    @Column(name = EstadoPersonaConstants.FLD_ESTADOPERSONAUNBENEFICIARIODISTINO )
    @JsonProperty(value="unbeneficiariodistino")
    private Boolean estadoPersonaUnBeneficiarioDistino;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedEstadoPersonaUnBeneficiarioDistino;

    /** Class member attribute. */
    @Column(name = EstadoPersonaConstants.FLD_ESTADOPERSONAPROHIBIDOBENEFICIARIOS )
    @JsonProperty(value="prohibidobeneficiarios")
    private Boolean estadoPersonaProhibidoBeneficiarios;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedEstadoPersonaProhibidoBeneficiarios;

    /** Class member attribute. */
    @Column(name = EstadoPersonaConstants.FLD_ESTADOPERSONAPROHIBIDOCONTRATANTE )
    @JsonProperty(value="prohibidocontratante")
    private Boolean estadoPersonaProhibidoContratante;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedEstadoPersonaProhibidoContratante;

    /** Class member attribute. */
    @Column(name = EstadoPersonaConstants.FLD_ESTADOPERSONAPROHIBIDOTITULAR )
    @JsonProperty(value="prohibidotitular")
    private Boolean estadoPersonaProhibidoTitular;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedEstadoPersonaProhibidoTitular;

    /** Related Class. */
    @OneToMany(mappedBy = EstadoPersonaConstants.ROLE_INVNAME_PERSONAS)
    @JsonIgnore
    private Collection <Persona> personas;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonas;

    /** Related Class. */
    @OneToMany(mappedBy = EstadoPersonaConstants.ROLE_INVNAME_PERSONASC)
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
    public EstadoPersona() {
        estadoPersonaCodigo = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>EstadoPersona</code>.
     * @param oid Object Identifier of the instance of <code>EstadoPersona</code> to be created.
     * @throws SystemException
     */
    public EstadoPersona(EstadoPersonaOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            estadoPersonaCodigo = oid.getEstadoPersonaCodigo();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>estadoPersonaCodigo</code> attribute<br>in class <code>EstadoPersona</code>.
     * This is part of the identification for this class, which depends on the identification of <code>EstadoPersona</code>
     * @return The value of the <code>estadoPersonaCodigo</code> attribute<br>in class <code>EstadoPersona</code>.
     */
    public Long getEstadoPersonaCodigo() {
        return estadoPersonaCodigo;
    }

    /**
     * Sets the value of the <code>estadoPersonaCodigo</code> attribute<br>in class <code>EstadoPersona</code>.
     * This is part of the identification for this class, which depends on the identification of <code>EstadoPersona</code>
     * @param estadoPersonaCodigo The new value of the <code>estadoPersonaCodigo</code> attribute<br>in class <code>EstadoPersona</code>.
     */
    public void setEstadoPersonaCodigo(Long estadoPersonaCodigo) {
        this.estadoPersonaCodigo = estadoPersonaCodigo;
    }

   /**
    * Returns the value of the <code>estadoPersonaDescripcion</code> attribute.<br>
    * Model Attribute: <code>estadoPersonaDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @return The value of the <code>estadoPersonaDescripcion</code> attribute.
    */

    public String getEstadoPersonaDescripcion()  {
    	String value;
        value =  estadoPersonaDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>estadoPersonaDescripcion</code> attribute.<br>
    * Model Attribute: <code>estadoPersonaDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @param estadoPersonaDescripcion The new value of the <code>estadoPersonaDescripcion</code> attribute.
    */
    public void setEstadoPersonaDescripcion (String estadoPersonaDescripcion) {
        modifiedEstadoPersonaDescripcion = true;
        this.estadoPersonaDescripcion = estadoPersonaDescripcion;
    }

   /**
    * Returns the value of the <code>modifiedEstadoPersonaDescripcion</code> class property.<br>
    *
    * @return The value of the <code>modifiedEstadoPersonaDescripcion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedEstadoPersonaDescripcion() {
        return modifiedEstadoPersonaDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedEstadoPersonaDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedEstadoPersonaDescripcion</code>.
    */
    public void setModifiedEstadoPersonaDescripcion(boolean modified) {
        this.modifiedEstadoPersonaDescripcion = modified;
    }

   /**
    * Returns the value of the <code>estadoPersonaUnBeneficiarioDistino</code> attribute.<br>
    * Model Attribute: <code>estadoPersonaUnBeneficiarioDistino</code>. Variable Bool<br>
    * Comments: Indicará que este estado se debe usar en la validación “Validar que la familia debe tener por lo menos un beneficiario con estado diferente a "Excluido". Esto es, el estado Excluido tendría esta marca con valor Sí. Necesitamos saber qué estado es para poder hacer la validación<br>
    * @return The value of the <code>estadoPersonaUnBeneficiarioDistino</code> attribute.
    */

    public Boolean getEstadoPersonaUnBeneficiarioDistino()  {
    	Boolean value;
        value =  estadoPersonaUnBeneficiarioDistino;
        return value;
    }

   /**
    * Sets the value of the <code>estadoPersonaUnBeneficiarioDistino</code> attribute.<br>
    * Model Attribute: <code>estadoPersonaUnBeneficiarioDistino</code>. Variable Bool<br>
    * Comments: Indicará que este estado se debe usar en la validación “Validar que la familia debe tener por lo menos un beneficiario con estado diferente a "Excluido". Esto es, el estado Excluido tendría esta marca con valor Sí. Necesitamos saber qué estado es para poder hacer la validación<br>
    * @param estadoPersonaUnBeneficiarioDistino The new value of the <code>estadoPersonaUnBeneficiarioDistino</code> attribute.
    */
    public void setEstadoPersonaUnBeneficiarioDistino (Boolean estadoPersonaUnBeneficiarioDistino) {
        modifiedEstadoPersonaUnBeneficiarioDistino = true;
        this.estadoPersonaUnBeneficiarioDistino = estadoPersonaUnBeneficiarioDistino;
    }

   /**
    * Returns the value of the <code>modifiedEstadoPersonaUnBeneficiarioDistino</code> class property.<br>
    *
    * @return The value of the <code>modifiedEstadoPersonaUnBeneficiarioDistino</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedEstadoPersonaUnBeneficiarioDistino() {
        return modifiedEstadoPersonaUnBeneficiarioDistino;
    }

   /**
    * Sets the value of the <code>modifiedEstadoPersonaUnBeneficiarioDistino</code> class property.<br>
    * @param modified The new value of the <code>modifiedEstadoPersonaUnBeneficiarioDistino</code>.
    */
    public void setModifiedEstadoPersonaUnBeneficiarioDistino(boolean modified) {
        this.modifiedEstadoPersonaUnBeneficiarioDistino = modified;
    }

   /**
    * Returns the value of the <code>estadoPersonaProhibidoBeneficiarios</code> attribute.<br>
    * Model Attribute: <code>estadoPersonaProhibidoBeneficiarios</code>. Variable Bool<br>
    * Comments: Indicará que este estado no se puede utilizar para un beneficiario. Por ejemplo el estado “Fallecido” tendría a Sí esta marca. Se debe usar en la validación Validar en la información de Personas que el Beneficiario no tenga estado "Fallecido"  <br>
    * @return The value of the <code>estadoPersonaProhibidoBeneficiarios</code> attribute.
    */

    public Boolean getEstadoPersonaProhibidoBeneficiarios()  {
    	Boolean value;
        value =  estadoPersonaProhibidoBeneficiarios;
        return value;
    }

   /**
    * Sets the value of the <code>estadoPersonaProhibidoBeneficiarios</code> attribute.<br>
    * Model Attribute: <code>estadoPersonaProhibidoBeneficiarios</code>. Variable Bool<br>
    * Comments: Indicará que este estado no se puede utilizar para un beneficiario. Por ejemplo el estado “Fallecido” tendría a Sí esta marca. Se debe usar en la validación Validar en la información de Personas que el Beneficiario no tenga estado "Fallecido"  <br>
    * @param estadoPersonaProhibidoBeneficiarios The new value of the <code>estadoPersonaProhibidoBeneficiarios</code> attribute.
    */
    public void setEstadoPersonaProhibidoBeneficiarios (Boolean estadoPersonaProhibidoBeneficiarios) {
        modifiedEstadoPersonaProhibidoBeneficiarios = true;
        this.estadoPersonaProhibidoBeneficiarios = estadoPersonaProhibidoBeneficiarios;
    }

   /**
    * Returns the value of the <code>modifiedEstadoPersonaProhibidoBeneficiarios</code> class property.<br>
    *
    * @return The value of the <code>modifiedEstadoPersonaProhibidoBeneficiarios</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedEstadoPersonaProhibidoBeneficiarios() {
        return modifiedEstadoPersonaProhibidoBeneficiarios;
    }

   /**
    * Sets the value of the <code>modifiedEstadoPersonaProhibidoBeneficiarios</code> class property.<br>
    * @param modified The new value of the <code>modifiedEstadoPersonaProhibidoBeneficiarios</code>.
    */
    public void setModifiedEstadoPersonaProhibidoBeneficiarios(boolean modified) {
        this.modifiedEstadoPersonaProhibidoBeneficiarios = modified;
    }

   /**
    * Returns the value of the <code>estadoPersonaProhibidoContratante</code> attribute.<br>
    * Model Attribute: <code>estadoPersonaProhibidoContratante</code>. Variable Bool<br>
    * Comments: Defect 192: Indicará que este estado no se puede utilizar para un contratante. Por ejemplo el estado “Fallecido” tendría a Sí esta marca. Se debe usar en la validación Validar en la información de Personas que el Beneficiario no tenga estado "Fallecido"  <br>
    * @return The value of the <code>estadoPersonaProhibidoContratante</code> attribute.
    */

    public Boolean getEstadoPersonaProhibidoContratante()  {
    	Boolean value;
        value =  estadoPersonaProhibidoContratante;
        return value;
    }

   /**
    * Sets the value of the <code>estadoPersonaProhibidoContratante</code> attribute.<br>
    * Model Attribute: <code>estadoPersonaProhibidoContratante</code>. Variable Bool<br>
    * Comments: Defect 192: Indicará que este estado no se puede utilizar para un contratante. Por ejemplo el estado “Fallecido” tendría a Sí esta marca. Se debe usar en la validación Validar en la información de Personas que el Beneficiario no tenga estado "Fallecido"  <br>
    * @param estadoPersonaProhibidoContratante The new value of the <code>estadoPersonaProhibidoContratante</code> attribute.
    */
    public void setEstadoPersonaProhibidoContratante (Boolean estadoPersonaProhibidoContratante) {
        modifiedEstadoPersonaProhibidoContratante = true;
        this.estadoPersonaProhibidoContratante = estadoPersonaProhibidoContratante;
    }

   /**
    * Returns the value of the <code>modifiedEstadoPersonaProhibidoContratante</code> class property.<br>
    *
    * @return The value of the <code>modifiedEstadoPersonaProhibidoContratante</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedEstadoPersonaProhibidoContratante() {
        return modifiedEstadoPersonaProhibidoContratante;
    }

   /**
    * Sets the value of the <code>modifiedEstadoPersonaProhibidoContratante</code> class property.<br>
    * @param modified The new value of the <code>modifiedEstadoPersonaProhibidoContratante</code>.
    */
    public void setModifiedEstadoPersonaProhibidoContratante(boolean modified) {
        this.modifiedEstadoPersonaProhibidoContratante = modified;
    }

   /**
    * Returns the value of the <code>estadoPersonaProhibidoTitular</code> attribute.<br>
    * Model Attribute: <code>estadoPersonaProhibidoTitular</code>. Variable Bool<br>
    * Comments: Defect 192: Indicará que este estado no se puede utilizar para un titular.<br>
    * @return The value of the <code>estadoPersonaProhibidoTitular</code> attribute.
    */

    public Boolean getEstadoPersonaProhibidoTitular()  {
    	Boolean value;
        value =  estadoPersonaProhibidoTitular;
        return value;
    }

   /**
    * Sets the value of the <code>estadoPersonaProhibidoTitular</code> attribute.<br>
    * Model Attribute: <code>estadoPersonaProhibidoTitular</code>. Variable Bool<br>
    * Comments: Defect 192: Indicará que este estado no se puede utilizar para un titular.<br>
    * @param estadoPersonaProhibidoTitular The new value of the <code>estadoPersonaProhibidoTitular</code> attribute.
    */
    public void setEstadoPersonaProhibidoTitular (Boolean estadoPersonaProhibidoTitular) {
        modifiedEstadoPersonaProhibidoTitular = true;
        this.estadoPersonaProhibidoTitular = estadoPersonaProhibidoTitular;
    }

   /**
    * Returns the value of the <code>modifiedEstadoPersonaProhibidoTitular</code> class property.<br>
    *
    * @return The value of the <code>modifiedEstadoPersonaProhibidoTitular</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedEstadoPersonaProhibidoTitular() {
        return modifiedEstadoPersonaProhibidoTitular;
    }

   /**
    * Sets the value of the <code>modifiedEstadoPersonaProhibidoTitular</code> class property.<br>
    * @param modified The new value of the <code>modifiedEstadoPersonaProhibidoTitular</code>.
    */
    public void setModifiedEstadoPersonaProhibidoTitular(boolean modified) {
        this.modifiedEstadoPersonaProhibidoTitular = modified;
    }

    /**
     * Returns the instance of <code>Persona</code> related through the <code>Personas</code> role.
     * Model Relationship:
     * <code>[Persona] Personas 0:M  ------ 0:1  EstadoPersona [EstadoPersona]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Persona</code> related through the <code>Personas</code> role.
     */
    @JsonIgnore
    public Collection <Persona> getPersonas() {
        return getPersonaRepository().findByEstadoPersona(this);
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
     * <code>[PersonaC] PersonasC 0:M  ------ 0:1  EstadoPersonaC [EstadoPersona]</code>
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
        estadoPersonaDescripcion = "";
        estadoPersonaUnBeneficiarioDistino = false;
        estadoPersonaProhibidoBeneficiarios = false;
        estadoPersonaProhibidoContratante = false;
        estadoPersonaProhibidoTitular = false;
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
    	return EstadoPersona.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return EstadoPersonaConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedEstadoPersonaDescripcion = false;
    	values.put("estadoPersonaDescripcion", getEstadoPersonaDescripcion());
    	modifiedEstadoPersonaUnBeneficiarioDistino = false;
    	values.put("estadoPersonaUnBeneficiarioDistino", getEstadoPersonaUnBeneficiarioDistino());
    	modifiedEstadoPersonaProhibidoBeneficiarios = false;
    	values.put("estadoPersonaProhibidoBeneficiarios", getEstadoPersonaProhibidoBeneficiarios());
    	modifiedEstadoPersonaProhibidoContratante = false;
    	values.put("estadoPersonaProhibidoContratante", getEstadoPersonaProhibidoContratante());
    	modifiedEstadoPersonaProhibidoTitular = false;
    	values.put("estadoPersonaProhibidoTitular", getEstadoPersonaProhibidoTitular());
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
     * Returns the <code>EstadoPersonaOid</code> object that identifies this instance of <code>EstadoPersona</code>.
     * @return <code>EstadoPersonaOid </code> object that identifies this instance of <code>EstadoPersona</code>
     */
	@Override
    public EstadoPersonaOid getOid() {
        return new EstadoPersonaOid(getEstadoPersonaCodigo());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(EstadoPersonaConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.ESTADOPERSONA)) {
            // Add this class
            activeFacets.add(Constants.ESTADOPERSONA);
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

    public String buildICEstadoPersona() {
        try {
            return getEstadoPersonaDescripcion();
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
            relatedInstance = buildEstadoPersonaRelatedInstance(relatedInstanceJsonOid);
        }
        if (EstadoPersonaConstants.ROLE_NAME_PERSONAS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildEstadoPersonaRelatedInstance4Persona(relatedInstanceJsonOid, remainingPath);
        }
        if (EstadoPersonaConstants.ROLE_NAME_PERSONASC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildEstadoPersonaRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildEstadoPersonaRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new EstadoPersona(mapper.readValue(relatedInstanceJsonOid, EstadoPersonaOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(EstadoPersona.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildEstadoPersonaRelatedInstance4Persona(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Persona(mapper.readValue(relatedInstanceJsonOid, PersonaOid.class)): Persona.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(EstadoPersona.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildEstadoPersonaRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(EstadoPersona.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
