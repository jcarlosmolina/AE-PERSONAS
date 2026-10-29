package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.CompanyiaConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.persistence.oid.BeneficiarioCOid;
import com.keralty.aepersonas.persistence.oid.CompanyiaOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.repository.UsuarioJpaRepository;
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
 * Persistent representation of the <code>Companyia</code> model class.
 * <p>
 * Model Class: <code>Companyia</code><br>
 */
@Entity(name = CompanyiaConstants.CLASS_NAME)
@Table(name = CompanyiaConstants.TBL_NAME)
public class Companyia extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient UsuarioJpaRepository usuarioRepository;

    /** Class identification function. */
    @Id
    @Column(name = CompanyiaConstants.FLD_COMPANYIACODIGO )
    @JsonProperty(value="codigo")
    private Long companyiaCodigo;

    /** Class member attribute. */
    @Column(name = CompanyiaConstants.FLD_COMPANYIANOMBRE )
    @JsonProperty(value="nombre")
    private String companyiaNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedCompanyiaNombre;

    /** Class member attribute. */
    @Column(name = CompanyiaConstants.FLD_COMPANYIAESDEMP )
    @JsonProperty(value="esdemp")
    private Boolean companyiaEsDeMP;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedCompanyiaEsDeMP;

    /** Related Class. */
    @OneToMany(mappedBy = CompanyiaConstants.ROLE_INVNAME_ATRIBUTOSUSUARIO)
    @JsonIgnore
    private Collection <Usuario> atributosUsuario;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAtributosUsuario;

    /** Related Class. */
    @OneToMany(mappedBy = CompanyiaConstants.ROLE_INVNAME_BENEFICIARIOSC)
    @JsonIgnore
    private Collection <BeneficiarioC> beneficiariosC;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedBeneficiariosC;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public Companyia() {
        companyiaCodigo = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>Companyia</code>.
     * @param oid Object Identifier of the instance of <code>Companyia</code> to be created.
     * @throws SystemException
     */
    public Companyia(CompanyiaOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            companyiaCodigo = oid.getCompanyiaCodigo();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>companyiaCodigo</code> attribute<br>in class <code>Companyia</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Companyia</code>
     * @return The value of the <code>companyiaCodigo</code> attribute<br>in class <code>Companyia</code>.
     */
    public Long getCompanyiaCodigo() {
        return companyiaCodigo;
    }

    /**
     * Sets the value of the <code>companyiaCodigo</code> attribute<br>in class <code>Companyia</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Companyia</code>
     * @param companyiaCodigo The new value of the <code>companyiaCodigo</code> attribute<br>in class <code>Companyia</code>.
     */
    public void setCompanyiaCodigo(Long companyiaCodigo) {
        this.companyiaCodigo = companyiaCodigo;
    }

   /**
    * Returns the value of the <code>companyiaNombre</code> attribute.<br>
    * Model Attribute: <code>companyiaNombre</code>. Variable String Size=150<br>
    * Comments: <br>
    * @return The value of the <code>companyiaNombre</code> attribute.
    */

    public String getCompanyiaNombre()  {
    	String value;
        value =  companyiaNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>companyiaNombre</code> attribute.<br>
    * Model Attribute: <code>companyiaNombre</code>. Variable String Size=150<br>
    * Comments: <br>
    * @param companyiaNombre The new value of the <code>companyiaNombre</code> attribute.
    */
    public void setCompanyiaNombre (String companyiaNombre) {
        modifiedCompanyiaNombre = true;
        this.companyiaNombre = companyiaNombre;
    }

   /**
    * Returns the value of the <code>modifiedCompanyiaNombre</code> class property.<br>
    *
    * @return The value of the <code>modifiedCompanyiaNombre</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedCompanyiaNombre() {
        return modifiedCompanyiaNombre;
    }

   /**
    * Sets the value of the <code>modifiedCompanyiaNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedCompanyiaNombre</code>.
    */
    public void setModifiedCompanyiaNombre(boolean modified) {
        this.modifiedCompanyiaNombre = modified;
    }

   /**
    * Returns the value of the <code>companyiaEsDeMP</code> attribute.<br>
    * Model Attribute: <code>companyiaEsDeMP</code>. Variable Bool<br>
    * Comments: Indica si la compañía es de medicina prepagada<br>
    * @return The value of the <code>companyiaEsDeMP</code> attribute.
    */

    public Boolean getCompanyiaEsDeMP()  {
    	Boolean value;
        value =  companyiaEsDeMP;
        return value;
    }

   /**
    * Sets the value of the <code>companyiaEsDeMP</code> attribute.<br>
    * Model Attribute: <code>companyiaEsDeMP</code>. Variable Bool<br>
    * Comments: Indica si la compañía es de medicina prepagada<br>
    * @param companyiaEsDeMP The new value of the <code>companyiaEsDeMP</code> attribute.
    */
    public void setCompanyiaEsDeMP (Boolean companyiaEsDeMP) {
        modifiedCompanyiaEsDeMP = true;
        this.companyiaEsDeMP = companyiaEsDeMP;
    }

   /**
    * Returns the value of the <code>modifiedCompanyiaEsDeMP</code> class property.<br>
    *
    * @return The value of the <code>modifiedCompanyiaEsDeMP</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedCompanyiaEsDeMP() {
        return modifiedCompanyiaEsDeMP;
    }

   /**
    * Sets the value of the <code>modifiedCompanyiaEsDeMP</code> class property.<br>
    * @param modified The new value of the <code>modifiedCompanyiaEsDeMP</code>.
    */
    public void setModifiedCompanyiaEsDeMP(boolean modified) {
        this.modifiedCompanyiaEsDeMP = modified;
    }

    /**
     * Returns the instance of <code>Usuario</code> related through the <code>AtributosUsuario</code> role.
     * Model Relationship:
     * <code>[Usuario] AtributosUsuario 0:M  ------ 0:1  Companyia [Companyia]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Usuario</code> related through the <code>AtributosUsuario</code> role.
     */
    @JsonIgnore
    public Collection <Usuario> getAtributosUsuario() {
        return getUsuarioRepository().findByCompanyia(this);
    }

    /**
     * Adds an instance of <code>Usuario</code> related through the <code>AtributosUsuario</code> role.
     * @param atributosUsuario The instance to add to the <code>AtributosUsuario</code> role.
     */
    public void add2AtributosUsuario(Usuario atributosUsuario) {
        this.atributosUsuario.add(atributosUsuario);
    }
    /**
     * Removes an instance of <code>Usuario</code> related through the <code>AtributosUsuario</code> role.
     * @param atributosUsuario The instance to be removed
     */
    public void removeFromAtributosUsuario(Usuario atributosUsuario) {
    	this.atributosUsuario.remove(atributosUsuario);
    }
    /**
     * Sets instances of <code>Usuario</code> related through the <code>AtributosUsuario</code> role.
     * @param atributosUsuario The new value for the <code>AtributosUsuario</code> role.
     */
    public void setAtributosUsuario(Collection < Usuario > atributosUsuario) {
        this.atributosUsuario = atributosUsuario;
    }

   /**
    * This method gets the attribute value <code>modifiedAtributosUsuario</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedAtributosUsuario</code> has been modified.
    */
    public boolean isModifiedAtributosUsuario(){
        return modifiedAtributosUsuario;
    }

    /**
     * Returns the instance of <code>BeneficiarioC</code> related through the <code>BeneficiariosC</code> role.
     * Model Relationship:
     * <code>[BeneficiarioC] BeneficiariosC 0:M  ------ 0:1  CompanyiaMPC [Companyia]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>BeneficiarioC</code> related through the <code>BeneficiariosC</code> role.
     */
    @JsonIgnore
    public Collection <BeneficiarioC> getBeneficiariosC() {
        return beneficiariosC;
    }

    /**
     * Adds an instance of <code>BeneficiarioC</code> related through the <code>BeneficiariosC</code> role.
     * @param beneficiariosC The instance to add to the <code>BeneficiariosC</code> role.
     */
    public void add2BeneficiariosC(BeneficiarioC beneficiariosC) {
        this.beneficiariosC.add(beneficiariosC);
    }
    /**
     * Removes an instance of <code>BeneficiarioC</code> related through the <code>BeneficiariosC</code> role.
     * @param beneficiariosC The instance to be removed
     */
    public void removeFromBeneficiariosC(BeneficiarioC beneficiariosC) {
    	this.beneficiariosC.remove(beneficiariosC);
    }
    /**
     * Sets instances of <code>BeneficiarioC</code> related through the <code>BeneficiariosC</code> role.
     * @param beneficiariosC The new value for the <code>BeneficiariosC</code> role.
     */
    public void setBeneficiariosC(Collection < BeneficiarioC > beneficiariosC) {
        this.beneficiariosC = beneficiariosC;
    }

   /**
    * This method gets the attribute value <code>modifiedBeneficiariosC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedBeneficiariosC</code> has been modified.
    */
    public boolean isModifiedBeneficiariosC(){
        return modifiedBeneficiariosC;
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
        companyiaNombre = "";
        companyiaEsDeMP = false;
        atributosUsuario = null;
        beneficiariosC = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }
    public UsuarioJpaRepository getUsuarioRepository() {
        return Arc.container().select(UsuarioJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return Companyia.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return CompanyiaConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedCompanyiaNombre = false;
    	values.put("companyiaNombre", getCompanyiaNombre());
    	modifiedCompanyiaEsDeMP = false;
    	values.put("companyiaEsDeMP", getCompanyiaEsDeMP());
    	modifiedAtributosUsuario = false;
    	modifiedBeneficiariosC = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>CompanyiaOid</code> object that identifies this instance of <code>Companyia</code>.
     * @return <code>CompanyiaOid </code> object that identifies this instance of <code>Companyia</code>
     */
	@Override
    public CompanyiaOid getOid() {
        return new CompanyiaOid(getCompanyiaCodigo());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(CompanyiaConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.COMPANYIA)) {
            // Add this class
            activeFacets.add(Constants.COMPANYIA);
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

    public String buildICCompanyia() {
        try {
            return getCompanyiaNombre();
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
            relatedInstance = buildCompanyiaRelatedInstance(relatedInstanceJsonOid);
        }
        if (CompanyiaConstants.ROLE_NAME_ATRIBUTOSUSUARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildCompanyiaRelatedInstance4Usuario(relatedInstanceJsonOid, remainingPath);
        }
        if (CompanyiaConstants.ROLE_NAME_BENEFICIARIOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildCompanyiaRelatedInstance4BeneficiarioC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildCompanyiaRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Companyia(mapper.readValue(relatedInstanceJsonOid, CompanyiaOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Companyia.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildCompanyiaRelatedInstance4Usuario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Usuario(mapper.readValue(relatedInstanceJsonOid, UsuarioOid.class)): Usuario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Companyia.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildCompanyiaRelatedInstance4BeneficiarioC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new BeneficiarioC(mapper.readValue(relatedInstanceJsonOid, BeneficiarioCOid.class)): BeneficiarioC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Companyia.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
