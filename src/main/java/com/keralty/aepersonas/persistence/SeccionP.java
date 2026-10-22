package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.CuestionarioPConstants;
import com.keralty.aepersonas.global.SeccionPConstants;
import com.keralty.aepersonas.global.STDFunctions;
import com.keralty.aepersonas.persistence.oid.CuestionarioPOid;
import com.keralty.aepersonas.persistence.oid.PreguntaPOid;
import com.keralty.aepersonas.persistence.oid.SeccionPOid;
import com.keralty.aepersonas.repository.CuestionarioPJpaRepository;
import com.keralty.aepersonas.repository.PreguntaPJpaRepository;
import io.quarkus.arc.Arc;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
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
 * Persistent representation of the <code>SeccionP</code> model class.
 * <p>
 * Model Class: <code>SeccionP</code><br>
 */
@Entity(name = SeccionPConstants.CLASS_NAME)
@Table(name = SeccionPConstants.TBL_NAME)
public class SeccionP extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient PreguntaPJpaRepository preguntaPRepository;

    @JsonIgnore
    private transient CuestionarioPJpaRepository cuestionarioPRepository;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SeccionP_Sequence")
    @SequenceGenerator(name="SeccionP_Sequence", sequenceName="SeccionP_Sequence", allocationSize=1)
    @Column(name = SeccionPConstants.FLD_SECCIONPIDENTIFICADOR )
    @JsonProperty(value="identificador")
    private Long seccionPIdentificador;

    /** Class member attribute. */
    @Column(name = SeccionPConstants.FLD_SECCIONPNOMBRE )
    @JsonProperty(value="nombre")
    private String seccionPNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSeccionPNombre;

    /** Class member attribute. */
    @Column(name = SeccionPConstants.FLD_SECCIONPNUMORDEN )
    @JsonProperty(value="numorden")
    private Long seccionPNumOrden;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSeccionPNumOrden;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvusuariof")
    protected Boolean seccionPdrvUsuarioF;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvusuariom")
    protected Boolean seccionPdrvUsuarioM;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvusuariomas40")
    protected Boolean seccionPdrvUsuarioMas40;

    /** Related Class. */
    @OneToMany(mappedBy = SeccionPConstants.ROLE_INVNAME_PREGUNTAS)
    @JsonIgnore
    private Collection <PreguntaP> preguntas;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPreguntas;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=SeccionPConstants.FLD_CUESTIONARIOPNUMERO, referencedColumnName=CuestionarioPConstants.FLD_CUESTIONARIOPNUMERO)
    })
    @JsonIgnore
    private CuestionarioP cuestionario;
    /** Related attribute. */
    @Column(name = SeccionPConstants.FLD_CUESTIONARIOPNUMERO, insertable = false, updatable = false)
    private Long cuestionarioPNumero;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedCuestionario;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public SeccionP() {
        seccionPIdentificador = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>SeccionP</code>.
     * @param oid Object Identifier of the instance of <code>SeccionP</code> to be created.
     * @throws SystemException
     */
    public SeccionP(SeccionPOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            seccionPIdentificador = oid.getSeccionPIdentificador();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>seccionPIdentificador</code> attribute<br>in class <code>SeccionP</code>.
     * This is part of the identification for this class, which depends on the identification of <code>SeccionP</code>
     * @return The value of the <code>seccionPIdentificador</code> attribute<br>in class <code>SeccionP</code>.
     */
    public Long getSeccionPIdentificador() {
        return seccionPIdentificador;
    }

    /**
     * Sets the value of the <code>seccionPIdentificador</code> attribute<br>in class <code>SeccionP</code>.
     * This is part of the identification for this class, which depends on the identification of <code>SeccionP</code>
     * @param seccionPIdentificador The new value of the <code>seccionPIdentificador</code> attribute<br>in class <code>SeccionP</code>.
     */
    public void setSeccionPIdentificador(Long seccionPIdentificador) {
        this.seccionPIdentificador = seccionPIdentificador;
    }

   /**
    * Returns the value of the <code>seccionPNombre</code> attribute.<br>
    * Model Attribute: <code>seccionPNombre</code>. Constant String Size=150<br>
    * Comments: <br>
    * @return The value of the <code>seccionPNombre</code> attribute.
    */

    public String getSeccionPNombre()  {
    	String value;
        value =  seccionPNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>seccionPNombre</code> attribute.<br>
    * Model Attribute: <code>seccionPNombre</code>. Constant String Size=150<br>
    * Comments: <br>
    * @param seccionPNombre The new value of the <code>seccionPNombre</code> attribute.
    */
    public void setSeccionPNombre (String seccionPNombre) {
        modifiedSeccionPNombre = true;
        this.seccionPNombre = seccionPNombre;
    }

   /**
    * Returns the value of the <code>modifiedSeccionPNombre</code> class property.<br>
    *
    * @return The value of the <code>modifiedSeccionPNombre</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSeccionPNombre() {
        return modifiedSeccionPNombre;
    }

   /**
    * Sets the value of the <code>modifiedSeccionPNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedSeccionPNombre</code>.
    */
    public void setModifiedSeccionPNombre(boolean modified) {
        this.modifiedSeccionPNombre = modified;
    }

   /**
    * Returns the value of the <code>seccionPNumOrden</code> attribute.<br>
    * Model Attribute: <code>seccionPNumOrden</code>. Constant Nat<br>
    * Comments: <br>
    * @return The value of the <code>seccionPNumOrden</code> attribute.
    */

    public Long getSeccionPNumOrden()  {
    	Long value;
        value =  seccionPNumOrden;
        return value;
    }

   /**
    * Sets the value of the <code>seccionPNumOrden</code> attribute.<br>
    * Model Attribute: <code>seccionPNumOrden</code>. Constant Nat<br>
    * Comments: <br>
    * @param seccionPNumOrden The new value of the <code>seccionPNumOrden</code> attribute.
    */
    public void setSeccionPNumOrden (Long seccionPNumOrden) {
        modifiedSeccionPNumOrden = true;
        this.seccionPNumOrden = seccionPNumOrden;
    }

   /**
    * Returns the value of the <code>modifiedSeccionPNumOrden</code> class property.<br>
    *
    * @return The value of the <code>modifiedSeccionPNumOrden</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSeccionPNumOrden() {
        return modifiedSeccionPNumOrden;
    }

   /**
    * Sets the value of the <code>modifiedSeccionPNumOrden</code> class property.<br>
    * @param modified The new value of the <code>modifiedSeccionPNumOrden</code>.
    */
    public void setModifiedSeccionPNumOrden(boolean modified) {
        this.modifiedSeccionPNumOrden = modified;
    }

   /**
    * Returns the value of the <code>seccionPdrvUsuarioF</code> attribute.<br>
    * Model Attribute: <code>seccionPdrvUsuarioF</code>. Variable Bool<br>
    * Comments: Indica que el usuario del cuestionario es una mujer<br>
    * @return The value of the <code>seccionPdrvUsuarioF</code> attribute.
    */

    @JsonIgnore
    public Boolean getSeccionPdrvUsuarioF()  {
    	Boolean value;
        try {
            value = seccionPdrvUsuarioFDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: SeccionP, Attribute: seccionPdrvUsuarioF");
        }
        return value;
    }

   /**
    * Returns the value of the <code>seccionPdrvUsuarioM</code> attribute.<br>
    * Model Attribute: <code>seccionPdrvUsuarioM</code>. Variable Bool<br>
    * Comments: Indica que el usuario del cuestionario es un hombre<br>
    * @return The value of the <code>seccionPdrvUsuarioM</code> attribute.
    */

    @JsonIgnore
    public Boolean getSeccionPdrvUsuarioM()  {
    	Boolean value;
        try {
            value = seccionPdrvUsuarioMDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: SeccionP, Attribute: seccionPdrvUsuarioM");
        }
        return value;
    }

   /**
    * Returns the value of the <code>seccionPdrvUsuarioMas40</code> attribute.<br>
    * Model Attribute: <code>seccionPdrvUsuarioMas40</code>. Variable Bool<br>
    * Comments: Indica que el usuario del cuestionario es mayor de 40 años<br>
    * @return The value of the <code>seccionPdrvUsuarioMas40</code> attribute.
    */

    @JsonIgnore
    public Boolean getSeccionPdrvUsuarioMas40()  {
    	Boolean value;
        try {
            value = seccionPdrvUsuarioMas40Derivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: SeccionP, Attribute: seccionPdrvUsuarioMas40");
        }
        return value;
    }

    /**
     * Returns the instance of <code>PreguntaP</code> related through the <code>Preguntas</code> role.
     * Model Relationship:
     * <code>[PreguntaP] Preguntas 0:M  ------ 1:1  Seccion [SeccionP]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>PreguntaP</code> related through the <code>Preguntas</code> role.
     */
    @JsonIgnore
    public Collection <PreguntaP> getPreguntas() {
        return getPreguntaPRepository().findBySeccion(this);
    }

    /**
     * Adds an instance of <code>PreguntaP</code> related through the <code>Preguntas</code> role.
     * @param preguntas The instance to add to the <code>Preguntas</code> role.
     */
    public void add2Preguntas(PreguntaP preguntas) {
        this.preguntas.add(preguntas);
    }
    /**
     * Removes an instance of <code>PreguntaP</code> related through the <code>Preguntas</code> role.
     * @param preguntas The instance to be removed
     */
    public void removeFromPreguntas(PreguntaP preguntas) {
    	this.preguntas.remove(preguntas);
    }
    /**
     * Sets instances of <code>PreguntaP</code> related through the <code>Preguntas</code> role.
     * @param preguntas The new value for the <code>Preguntas</code> role.
     */
    public void setPreguntas(Collection < PreguntaP > preguntas) {
        this.preguntas = preguntas;
    }

   /**
    * This method gets the attribute value <code>modifiedPreguntas</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedPreguntas</code> has been modified.
    */
    public boolean isModifiedPreguntas(){
        return modifiedPreguntas;
    }

    /**
     * Returns the instance of <code>CuestionarioP</code> related through the <code>Cuestionario</code> role.
     * Model Relationship:
     * <code>[CuestionarioP] Cuestionario 1:1  ------ 0:M  Secciones [SeccionP]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>CuestionarioP</code> related through the <code>Cuestionario</code> role.
     */
    @JsonIgnore
    public CuestionarioP getCuestionario() {
        try {
            if (cuestionario != null && cuestionario.isNull()) {
                cuestionario = null;
            }
        } catch (Exception ex) {
            cuestionario = null;
        }
        if (cuestionario == null) {
            if (cuestionarioPNumero != null) {
                cuestionario = getCuestionarioPRepository().findById(cuestionarioPNumero).orElse(null);
            } else {
                cuestionario = null;
            }
        }
        return (cuestionario == null ? new CuestionarioP(null) : cuestionario);
    }

    /**
     * Adds an instance of <code>CuestionarioP</code> related through the <code>Cuestionario</code> role.
     * @param cuestionario The instance to add to the <code>Cuestionario</code> role.
     */
    public void add2Cuestionario(CuestionarioP cuestionario) {
        if (cuestionario == null || cuestionario.isNull()) {
            this.modifiedCuestionario = true;
            this.cuestionarioPNumero = null;
        } else {
            this.cuestionarioPNumero = cuestionario.getCuestionarioPNumero();
        }
        this.cuestionario = (cuestionario == null  || cuestionario.isNull() ? null : cuestionario);
    }

   /**
    * This method gets the attribute value <code>modifiedCuestionario</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedCuestionario</code> has been modified.
    */
    public boolean isModifiedCuestionario(){
        return modifiedCuestionario;
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
     * Computes the value of the <code>seccionPdrvUsuarioF</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>seccionPdrvUsuarioF</code> derived attribute.
     */
    public Boolean seccionPdrvUsuarioFDerivations() {

        seccionPdrvUsuarioF = null;

        seccionPdrvUsuarioFDerivationsDefault();
        return seccionPdrvUsuarioF;
    }

    private void seccionPdrvUsuarioFDerivationsDefault() {
        if (seccionPdrvUsuarioF != null) return;
        // Default derivation
        // EFFECT   : Cuestionario.Usuario.UsuarioPersona.Genero = \"F\"
        seccionPdrvUsuarioF = (this.getCuestionario().getUsuario().getUsuarioPersona().getPersonaGenero()).equals("F");
    }

    /**
     * Computes the value of the <code>seccionPdrvUsuarioM</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>seccionPdrvUsuarioM</code> derived attribute.
     */
    public Boolean seccionPdrvUsuarioMDerivations() {

        seccionPdrvUsuarioM = null;

        seccionPdrvUsuarioMDerivationsDefault();
        return seccionPdrvUsuarioM;
    }

    private void seccionPdrvUsuarioMDerivationsDefault() {
        if (seccionPdrvUsuarioM != null) return;
        // Default derivation
        // EFFECT   : Cuestionario.Usuario.UsuarioPersona.Genero = \"M\"
        seccionPdrvUsuarioM = (this.getCuestionario().getUsuario().getUsuarioPersona().getPersonaGenero()).equals("M");
    }

    /**
     * Computes the value of the <code>seccionPdrvUsuarioMas40</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>seccionPdrvUsuarioMas40</code> derived attribute.
     */
    public Boolean seccionPdrvUsuarioMas40Derivations() {

        seccionPdrvUsuarioMas40 = null;

        seccionPdrvUsuarioMas40DerivationsDefault();
        return seccionPdrvUsuarioMas40;
    }

    private void seccionPdrvUsuarioMas40DerivationsDefault() {
        if (seccionPdrvUsuarioMas40 != null) return;
        // Default derivation
        // EFFECT   : daysDifferenceFromDate(Cuestionario.Usuario.UsuarioPersona.FechaNacimiento, Cuestionario.Usuario.Solicitud.FInicioContrato) > 14600
        seccionPdrvUsuarioMas40 = STDFunctions.daysDifferenceFromDateFun(this.getCuestionario().getUsuario().getUsuarioPersona().getPersonaFechaNacimiento(), this.getCuestionario().getUsuario().getSolicitud().getSolicitudFInicioContrato()) > Long.valueOf(14600);
    }
    /**
     * This method initializes the properties of the entity and its relations.
     */
    private void initAttributes() {
        seccionPNombre = "";
        seccionPNumOrden = Long.valueOf(0);
        preguntas = null;
        cuestionario = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }
    public PreguntaPJpaRepository getPreguntaPRepository() {
        return Arc.container().select(PreguntaPJpaRepository.class).get();
    }
    public CuestionarioPJpaRepository getCuestionarioPRepository() {
        return Arc.container().select(CuestionarioPJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return SeccionP.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return SeccionPConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedSeccionPNombre = false;
    	values.put("seccionPNombre", getSeccionPNombre());
    	modifiedSeccionPNumOrden = false;
    	values.put("seccionPNumOrden", getSeccionPNumOrden());
    	modifiedPreguntas = false;
    	modifiedCuestionario = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
            seccionPdrvUsuarioF = null;
            seccionPdrvUsuarioM = null;
            seccionPdrvUsuarioMas40 = null;
    }

    /**
     * Returns the <code>SeccionPOid</code> object that identifies this instance of <code>SeccionP</code>.
     * @return <code>SeccionPOid </code> object that identifies this instance of <code>SeccionP</code>
     */
	@Override
    public SeccionPOid getOid() {
        return new SeccionPOid(getSeccionPIdentificador());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(SeccionPConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(SeccionPConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.SECCIONP)) {
            // Add this class
            activeFacets.add(Constants.SECCIONP);
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

    public String buildDSSeccionPNull() {
        try {
            return (getSeccionPIdentificador() != null ? getSeccionPIdentificador().toString() : "");
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
            relatedInstance = buildSeccionPRelatedInstance(relatedInstanceJsonOid);
        }
        if (SeccionPConstants.ROLE_NAME_PREGUNTAS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSeccionPRelatedInstance4PreguntaP(relatedInstanceJsonOid, remainingPath);
        }
        if (SeccionPConstants.ROLE_NAME_CUESTIONARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSeccionPRelatedInstance4CuestionarioP(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildSeccionPRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new SeccionP(mapper.readValue(relatedInstanceJsonOid, SeccionPOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SeccionP.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSeccionPRelatedInstance4PreguntaP(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PreguntaP(mapper.readValue(relatedInstanceJsonOid, PreguntaPOid.class)): PreguntaP.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SeccionP.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSeccionPRelatedInstance4CuestionarioP(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new CuestionarioP(mapper.readValue(relatedInstanceJsonOid, CuestionarioPOid.class)): CuestionarioP.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SeccionP.class).error(e.getMessage());
            return null;
        }
    }
}
