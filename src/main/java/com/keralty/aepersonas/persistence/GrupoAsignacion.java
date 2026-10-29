package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.FuncionarioConstants;
import com.keralty.aepersonas.global.GrupoAsignacionConstants;
import com.keralty.aepersonas.persistence.oid.DominioOid;
import com.keralty.aepersonas.persistence.oid.FuncionarioOid;
import com.keralty.aepersonas.persistence.oid.GrupoAsignacionNovedadOid;
import com.keralty.aepersonas.persistence.oid.GrupoAsignacionOid;
import com.keralty.aepersonas.persistence.oid.LogGrupoAsignacionOid;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
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
 * Persistent representation of the <code>GrupoAsignacion</code> model class.
 * <p>
 * Model Class: <code>GrupoAsignacion</code><br>
 */
@Entity(name = GrupoAsignacionConstants.CLASS_NAME)
@Table(name = GrupoAsignacionConstants.TBL_NAME)
public class GrupoAsignacion extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="GrupoAsignacion_Sequence")
    @SequenceGenerator(name="GrupoAsignacion_Sequence", sequenceName="GrupoAsignacion_Sequence", allocationSize=1)
    @Column(name = GrupoAsignacionConstants.FLD_GRUPOASIGNACIONID )
    @JsonProperty(value="id")
    private Long grupoAsignacionId;

    /** Class member attribute. */
    @Column(name = GrupoAsignacionConstants.FLD_GRUPOASIGNACIONTIPO )
    @JsonProperty(value="tipo")
    private Long grupoAsignacionTipo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedGrupoAsignacionTipo;

    /** Class member attribute. */
    @Column(name = GrupoAsignacionConstants.FLD_GRUPOASIGNACIONNOMBRE )
    @JsonProperty(value="nombre")
    private String grupoAsignacionNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedGrupoAsignacionNombre;

    /** Class member attribute. */
    @Column(name = GrupoAsignacionConstants.FLD_GRUPOASIGNACIONDESCRIPCION )
    @JsonProperty(value="descripcion")
    private String grupoAsignacionDescripcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedGrupoAsignacionDescripcion;

    /** Related Class. */
    @OneToMany(mappedBy = GrupoAsignacionConstants.ROLE_INVNAME_DOMINIOASESORES)
    @JsonIgnore
    private Collection <Dominio> dominioAsesores;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioAsesores;

    /** Related Class. */
    @OneToMany(mappedBy = GrupoAsignacionConstants.ROLE_INVNAME_DOMINIOAREAMEDICA)
    @JsonIgnore
    private Collection <Dominio> dominioAreaMedica;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioAreaMedica;

    /** Related Class. */
    @OneToMany(mappedBy = GrupoAsignacionConstants.ROLE_INVNAME_LOGGRUPOASIGNACION)
    @JsonIgnore
    private Collection <LogGrupoAsignacion> logGrupoAsignacion;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogGrupoAsignacion;

    /** Related Class. */
    @OneToMany(mappedBy = GrupoAsignacionConstants.ROLE_INVNAME_DOMINIOCAUSALUSUARIO)
    @JsonIgnore
    private Collection <GrupoAsignacionNovedad> dominioCausalUsuario;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioCausalUsuario;

    /** Related Class. */
    @ManyToMany
    @JoinTable(
        name=Constants.TBL_NAME_GRUPOASIGNACIONFUNCIONARIO,
        joinColumns = {
            @JoinColumn(name=Constants.FLD_TMGRUPOASIGNACIONFUNCIONARIO_GRUPOASIGNACIONID, referencedColumnName=GrupoAsignacionConstants.FLD_GRUPOASIGNACIONID)
        },
        inverseJoinColumns = {
            @JoinColumn(name=Constants.FLD_TMGRUPOASIGNACIONFUNCIONARIO_FUNCIONARIOFUNCIONARIOID, referencedColumnName=FuncionarioConstants.FLD_FUNCIONARIOID)
    })
    @JsonIgnore
    private Collection <Funcionario> funcionario;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFuncionario;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public GrupoAsignacion() {
        grupoAsignacionId = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>GrupoAsignacion</code>.
     * @param oid Object Identifier of the instance of <code>GrupoAsignacion</code> to be created.
     * @throws SystemException
     */
    public GrupoAsignacion(GrupoAsignacionOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            grupoAsignacionId = oid.getGrupoAsignacionId();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>grupoAsignacionId</code> attribute<br>in class <code>GrupoAsignacion</code>.
     * This is part of the identification for this class, which depends on the identification of <code>GrupoAsignacion</code>
     * @return The value of the <code>grupoAsignacionId</code> attribute<br>in class <code>GrupoAsignacion</code>.
     */
    public Long getGrupoAsignacionId() {
        return grupoAsignacionId;
    }

    /**
     * Sets the value of the <code>grupoAsignacionId</code> attribute<br>in class <code>GrupoAsignacion</code>.
     * This is part of the identification for this class, which depends on the identification of <code>GrupoAsignacion</code>
     * @param grupoAsignacionId The new value of the <code>grupoAsignacionId</code> attribute<br>in class <code>GrupoAsignacion</code>.
     */
    public void setGrupoAsignacionId(Long grupoAsignacionId) {
        this.grupoAsignacionId = grupoAsignacionId;
    }

   /**
    * Returns the value of the <code>grupoAsignacionTipo</code> attribute.<br>
    * Model Attribute: <code>grupoAsignacionTipo</code>. Constant Nat<br>
    * Comments: <br>
    * @return The value of the <code>grupoAsignacionTipo</code> attribute.
    */

    public Long getGrupoAsignacionTipo()  {
    	Long value;
        value =  grupoAsignacionTipo;
        return value;
    }

   /**
    * Sets the value of the <code>grupoAsignacionTipo</code> attribute.<br>
    * Model Attribute: <code>grupoAsignacionTipo</code>. Constant Nat<br>
    * Comments: <br>
    * @param grupoAsignacionTipo The new value of the <code>grupoAsignacionTipo</code> attribute.
    */
    public void setGrupoAsignacionTipo (Long grupoAsignacionTipo) {
        modifiedGrupoAsignacionTipo = true;
        this.grupoAsignacionTipo = grupoAsignacionTipo;
    }

   /**
    * Sets the value of the <code>modifiedGrupoAsignacionTipo</code> class property.<br>
    * @param modified The new value of the <code>modifiedGrupoAsignacionTipo</code>.
    */
    public void setModifiedGrupoAsignacionTipo(boolean modified) {
        this.modifiedGrupoAsignacionTipo = modified;
    }

   /**
    * Returns the value of the <code>grupoAsignacionNombre</code> attribute.<br>
    * Model Attribute: <code>grupoAsignacionNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>grupoAsignacionNombre</code> attribute.
    */

    public String getGrupoAsignacionNombre()  {
    	String value;
        value =  grupoAsignacionNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>grupoAsignacionNombre</code> attribute.<br>
    * Model Attribute: <code>grupoAsignacionNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param grupoAsignacionNombre The new value of the <code>grupoAsignacionNombre</code> attribute.
    */
    public void setGrupoAsignacionNombre (String grupoAsignacionNombre) {
        modifiedGrupoAsignacionNombre = true;
        this.grupoAsignacionNombre = grupoAsignacionNombre;
    }

   /**
    * Sets the value of the <code>modifiedGrupoAsignacionNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedGrupoAsignacionNombre</code>.
    */
    public void setModifiedGrupoAsignacionNombre(boolean modified) {
        this.modifiedGrupoAsignacionNombre = modified;
    }

   /**
    * Returns the value of the <code>grupoAsignacionDescripcion</code> attribute.<br>
    * Model Attribute: <code>grupoAsignacionDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @return The value of the <code>grupoAsignacionDescripcion</code> attribute.
    */

    public String getGrupoAsignacionDescripcion()  {
    	String value;
        value =  grupoAsignacionDescripcion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>grupoAsignacionDescripcion</code> attribute.<br>
    * Model Attribute: <code>grupoAsignacionDescripcion</code>. Variable String Size=150<br>
    * Comments: <br>
    * @param grupoAsignacionDescripcion The new value of the <code>grupoAsignacionDescripcion</code> attribute.
    */
    public void setGrupoAsignacionDescripcion (String grupoAsignacionDescripcion) {
        modifiedGrupoAsignacionDescripcion = true;
        this.grupoAsignacionDescripcion = grupoAsignacionDescripcion;
    }

   /**
    * Sets the value of the <code>modifiedGrupoAsignacionDescripcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedGrupoAsignacionDescripcion</code>.
    */
    public void setModifiedGrupoAsignacionDescripcion(boolean modified) {
        this.modifiedGrupoAsignacionDescripcion = modified;
    }

    /**
     * Returns the instance of <code>Dominio</code> related through the <code>DominioAsesores</code> role.
     * Model Relationship:
     * <code>[Dominio] DominioAsesores 0:M  ------ 0:1  GrupoAsesores [GrupoAsignacion]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Dominio</code> related through the <code>DominioAsesores</code> role.
     */
    @JsonIgnore
    public Collection <Dominio> getDominioAsesores() {
        return dominioAsesores;
    }

    /**
     * Adds an instance of <code>Dominio</code> related through the <code>DominioAsesores</code> role.
     * @param dominioAsesores The instance to add to the <code>DominioAsesores</code> role.
     */
    public void add2DominioAsesores(Dominio dominioAsesores) {
        this.dominioAsesores.add(dominioAsesores);
    }
    /**
     * Removes an instance of <code>Dominio</code> related through the <code>DominioAsesores</code> role.
     * @param dominioAsesores The instance to be removed
     */
    public void removeFromDominioAsesores(Dominio dominioAsesores) {
    	this.dominioAsesores.remove(dominioAsesores);
    }
    /**
     * Sets instances of <code>Dominio</code> related through the <code>DominioAsesores</code> role.
     * @param dominioAsesores The new value for the <code>DominioAsesores</code> role.
     */
    public void setDominioAsesores(Collection < Dominio > dominioAsesores) {
        this.dominioAsesores = dominioAsesores;
    }

   /**
    * This method gets the attribute value <code>modifiedDominioAsesores</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDominioAsesores</code> has been modified.
    */
    public boolean isModifiedDominioAsesores(){
        return modifiedDominioAsesores;
    }

    /**
     * Returns the instance of <code>Dominio</code> related through the <code>DominioAreaMedica</code> role.
     * Model Relationship:
     * <code>[Dominio] DominioAreaMedica 0:M  ------ 0:1  GrupoAreaMedica [GrupoAsignacion]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Dominio</code> related through the <code>DominioAreaMedica</code> role.
     */
    @JsonIgnore
    public Collection <Dominio> getDominioAreaMedica() {
        return dominioAreaMedica;
    }

    /**
     * Adds an instance of <code>Dominio</code> related through the <code>DominioAreaMedica</code> role.
     * @param dominioAreaMedica The instance to add to the <code>DominioAreaMedica</code> role.
     */
    public void add2DominioAreaMedica(Dominio dominioAreaMedica) {
        this.dominioAreaMedica.add(dominioAreaMedica);
    }
    /**
     * Removes an instance of <code>Dominio</code> related through the <code>DominioAreaMedica</code> role.
     * @param dominioAreaMedica The instance to be removed
     */
    public void removeFromDominioAreaMedica(Dominio dominioAreaMedica) {
    	this.dominioAreaMedica.remove(dominioAreaMedica);
    }
    /**
     * Sets instances of <code>Dominio</code> related through the <code>DominioAreaMedica</code> role.
     * @param dominioAreaMedica The new value for the <code>DominioAreaMedica</code> role.
     */
    public void setDominioAreaMedica(Collection < Dominio > dominioAreaMedica) {
        this.dominioAreaMedica = dominioAreaMedica;
    }

   /**
    * This method gets the attribute value <code>modifiedDominioAreaMedica</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDominioAreaMedica</code> has been modified.
    */
    public boolean isModifiedDominioAreaMedica(){
        return modifiedDominioAreaMedica;
    }

    /**
     * Returns the instance of <code>LogGrupoAsignacion</code> related through the <code>LogGrupoAsignacion</code> role.
     * Model Relationship:
     * <code>[LogGrupoAsignacion] LogGrupoAsignacion 0:M  ------ 1:1  GrupoAsignacion [GrupoAsignacion]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>LogGrupoAsignacion</code> related through the <code>LogGrupoAsignacion</code> role.
     */
    @JsonIgnore
    public Collection <LogGrupoAsignacion> getLogGrupoAsignacion() {
        return logGrupoAsignacion;
    }

    /**
     * Adds an instance of <code>LogGrupoAsignacion</code> related through the <code>LogGrupoAsignacion</code> role.
     * @param logGrupoAsignacion The instance to add to the <code>LogGrupoAsignacion</code> role.
     */
    public void add2LogGrupoAsignacion(LogGrupoAsignacion logGrupoAsignacion) {
        this.logGrupoAsignacion.add(logGrupoAsignacion);
    }
    /**
     * Removes an instance of <code>LogGrupoAsignacion</code> related through the <code>LogGrupoAsignacion</code> role.
     * @param logGrupoAsignacion The instance to be removed
     */
    public void removeFromLogGrupoAsignacion(LogGrupoAsignacion logGrupoAsignacion) {
    	this.logGrupoAsignacion.remove(logGrupoAsignacion);
    }
    /**
     * Sets instances of <code>LogGrupoAsignacion</code> related through the <code>LogGrupoAsignacion</code> role.
     * @param logGrupoAsignacion The new value for the <code>LogGrupoAsignacion</code> role.
     */
    public void setLogGrupoAsignacion(Collection < LogGrupoAsignacion > logGrupoAsignacion) {
        this.logGrupoAsignacion = logGrupoAsignacion;
    }

   /**
    * This method gets the attribute value <code>modifiedLogGrupoAsignacion</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedLogGrupoAsignacion</code> has been modified.
    */
    public boolean isModifiedLogGrupoAsignacion(){
        return modifiedLogGrupoAsignacion;
    }

    /**
     * Returns the instance of <code>GrupoAsignacionNovedad</code> related through the <code>DominioCausalUsuario</code> role.
     * Model Relationship:
     * <code>[GrupoAsignacionNovedad] DominioCausalUsuario 0:M  ------ 0:1  GrupoUsuarios [GrupoAsignacion]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>GrupoAsignacionNovedad</code> related through the <code>DominioCausalUsuario</code> role.
     */
    @JsonIgnore
    public Collection <GrupoAsignacionNovedad> getDominioCausalUsuario() {
        return dominioCausalUsuario;
    }

    /**
     * Adds an instance of <code>GrupoAsignacionNovedad</code> related through the <code>DominioCausalUsuario</code> role.
     * @param dominioCausalUsuario The instance to add to the <code>DominioCausalUsuario</code> role.
     */
    public void add2DominioCausalUsuario(GrupoAsignacionNovedad dominioCausalUsuario) {
        this.dominioCausalUsuario.add(dominioCausalUsuario);
    }
    /**
     * Removes an instance of <code>GrupoAsignacionNovedad</code> related through the <code>DominioCausalUsuario</code> role.
     * @param dominioCausalUsuario The instance to be removed
     */
    public void removeFromDominioCausalUsuario(GrupoAsignacionNovedad dominioCausalUsuario) {
    	this.dominioCausalUsuario.remove(dominioCausalUsuario);
    }
    /**
     * Sets instances of <code>GrupoAsignacionNovedad</code> related through the <code>DominioCausalUsuario</code> role.
     * @param dominioCausalUsuario The new value for the <code>DominioCausalUsuario</code> role.
     */
    public void setDominioCausalUsuario(Collection < GrupoAsignacionNovedad > dominioCausalUsuario) {
        this.dominioCausalUsuario = dominioCausalUsuario;
    }

   /**
    * This method gets the attribute value <code>modifiedDominioCausalUsuario</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDominioCausalUsuario</code> has been modified.
    */
    public boolean isModifiedDominioCausalUsuario(){
        return modifiedDominioCausalUsuario;
    }

    /**
     * Returns the instance of <code>Funcionario</code> related through the <code>Funcionario</code> role.
     * Model Relationship:
     * <code>[Funcionario] Funcionario 0:M  ------ 0:M  GrupoAsignacion [GrupoAsignacion]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Funcionario</code> related through the <code>Funcionario</code> role.
     */
    @JsonIgnore
    public Collection <Funcionario> getFuncionario() {
        return funcionario;
    }

    /**
     * Adds an instance of <code>Funcionario</code> related through the <code>Funcionario</code> role.
     * @param funcionario The instance to add to the <code>Funcionario</code> role.
     */
    public void add2Funcionario(Funcionario funcionario) {
        this.funcionario.add(funcionario);
    }
    /**
     * Removes an instance of <code>Funcionario</code> related through the <code>Funcionario</code> role.
     * @param funcionario The instance to be removed
     */
    public void removeFromFuncionario(Funcionario funcionario) {
    	this.funcionario.remove(funcionario);
    }
    /**
     * Sets instances of <code>Funcionario</code> related through the <code>Funcionario</code> role.
     * @param funcionario The new value for the <code>Funcionario</code> role.
     */
    public void setFuncionario(Collection < Funcionario > funcionario) {
        this.funcionario = funcionario;
    }

   /**
    * This method gets the attribute value <code>modifiedFuncionario</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedFuncionario</code> has been modified.
    */
    public boolean isModifiedFuncionario(){
        return modifiedFuncionario;
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
        grupoAsignacionTipo = Long.valueOf(0);
        grupoAsignacionNombre = "";
        grupoAsignacionDescripcion = "";
        dominioAsesores = null;
        dominioAreaMedica = null;
        logGrupoAsignacion = null;
        dominioCausalUsuario = null;
        funcionario = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return GrupoAsignacion.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return GrupoAsignacionConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedGrupoAsignacionTipo = false;
    	values.put("grupoAsignacionTipo", getGrupoAsignacionTipo());
    	modifiedGrupoAsignacionNombre = false;
    	values.put("grupoAsignacionNombre", getGrupoAsignacionNombre());
    	modifiedGrupoAsignacionDescripcion = false;
    	values.put("grupoAsignacionDescripcion", getGrupoAsignacionDescripcion());
    	modifiedDominioAsesores = false;
    	modifiedDominioAreaMedica = false;
    	modifiedLogGrupoAsignacion = false;
    	modifiedDominioCausalUsuario = false;
    	modifiedFuncionario = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>GrupoAsignacionOid</code> object that identifies this instance of <code>GrupoAsignacion</code>.
     * @return <code>GrupoAsignacionOid </code> object that identifies this instance of <code>GrupoAsignacion</code>
     */
	@Override
    public GrupoAsignacionOid getOid() {
        return new GrupoAsignacionOid(getGrupoAsignacionId());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(GrupoAsignacionConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.GRUPOASIGNACION)) {
            // Add this class
            activeFacets.add(Constants.GRUPOASIGNACION);
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


        if (getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.ASESOR) || getAgent().isFacetActive(Constants.AREAMEDICA) || getAgent().isFacetActive(Constants.AFILIACIONES) || getAgent().isFacetActive(Constants.GESTOR)) {
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
            relatedInstance = buildGrupoAsignacionRelatedInstance(relatedInstanceJsonOid);
        }
        if (GrupoAsignacionConstants.ROLE_NAME_DOMINIOASESORES.equalsIgnoreCase(relatedInstancePathFirstItem) || GrupoAsignacionConstants.ROLE_NAME_DOMINIOAREAMEDICA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildGrupoAsignacionRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        if (GrupoAsignacionConstants.ROLE_NAME_LOGGRUPOASIGNACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildGrupoAsignacionRelatedInstance4LogGrupoAsignacion(relatedInstanceJsonOid, remainingPath);
        }
        if (GrupoAsignacionConstants.ROLE_NAME_DOMINIOCAUSALUSUARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildGrupoAsignacionRelatedInstance4GrupoAsignacionNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (GrupoAsignacionConstants.ROLE_NAME_FUNCIONARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildGrupoAsignacionRelatedInstance4Funcionario(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildGrupoAsignacionRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new GrupoAsignacion(mapper.readValue(relatedInstanceJsonOid, GrupoAsignacionOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsignacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildGrupoAsignacionRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsignacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildGrupoAsignacionRelatedInstance4LogGrupoAsignacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new LogGrupoAsignacion(mapper.readValue(relatedInstanceJsonOid, LogGrupoAsignacionOid.class)): LogGrupoAsignacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsignacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildGrupoAsignacionRelatedInstance4GrupoAsignacionNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new GrupoAsignacionNovedad(mapper.readValue(relatedInstanceJsonOid, GrupoAsignacionNovedadOid.class)): GrupoAsignacionNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsignacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildGrupoAsignacionRelatedInstance4Funcionario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Funcionario(mapper.readValue(relatedInstanceJsonOid, FuncionarioOid.class)): Funcionario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsignacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
