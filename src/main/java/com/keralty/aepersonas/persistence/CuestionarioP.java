package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.CuestionarioPConstants;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.oid.CuestionarioPOid;
import com.keralty.aepersonas.persistence.oid.SeccionPOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.repository.SeccionPJpaRepository;
import com.keralty.aepersonas.repository.UsuarioJpaRepository;
import io.quarkus.arc.Arc;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
 * Persistent representation of the <code>CuestionarioP</code> model class.
 * <p>
 * Model Class: <code>CuestionarioP</code><br>
 */
@Entity(name = CuestionarioPConstants.CLASS_NAME)
@Table(name = CuestionarioPConstants.TBL_NAME)
public class CuestionarioP extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient SeccionPJpaRepository seccionPRepository;

    @JsonIgnore
    private transient UsuarioJpaRepository usuarioRepository;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CuestionarioP_Sequence")
    @SequenceGenerator(name="CuestionarioP_Sequence", sequenceName="CuestionarioP_Sequence", allocationSize=1)
    @Column(name = CuestionarioPConstants.FLD_CUESTIONARIOPNUMERO )
    @JsonProperty(value="numero")
    private Long cuestionarioPNumero;

    /** Class member attribute. */
    @Column(name = CuestionarioPConstants.FLD_CUESTIONARIOPNOMBRE )
    @JsonProperty(value="nombre")
    private String cuestionarioPNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedCuestionarioPNombre;

    /** Class member attribute. */
    @Column(name = CuestionarioPConstants.FLD_CUESTIONARIOPYADILIGENCIADO )
    @JsonProperty(value="yadiligenciado")
    private Boolean cuestionarioPYaDiligenciado;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedCuestionarioPYaDiligenciado;

    /** Related Class. */
    @OneToMany(mappedBy = CuestionarioPConstants.ROLE_INVNAME_SECCIONES)
    @JsonIgnore
    private Collection <SeccionP> secciones;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSecciones;

    /** Related Class. */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=CuestionarioPConstants.FLD_AESOLICITUDESIDSOLICITUD, referencedColumnName=UsuarioConstants.FLD_AESOLICITUDESIDSOLICITUD), 
        @JoinColumn(name=CuestionarioPConstants.FLD_USUARIOIDENTIFICADOR, referencedColumnName=UsuarioConstants.FLD_USUARIOIDENTIFICADOR)
    })
    @JsonIgnore
    private Usuario usuario;
    /** Related attribute. */
    @Column(name = CuestionarioPConstants.FLD_AESOLICITUDESIDSOLICITUD, insertable = false, updatable = false)
    private Long aesolicitudesidsolicitud;
    /** Related attribute. */
    @Column(name = CuestionarioPConstants.FLD_USUARIOIDENTIFICADOR, insertable = false, updatable = false)
    private Long usuarioIdentificador;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuario;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public CuestionarioP() {
        cuestionarioPNumero = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>CuestionarioP</code>.
     * @param oid Object Identifier of the instance of <code>CuestionarioP</code> to be created.
     * @throws SystemException
     */
    public CuestionarioP(CuestionarioPOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            cuestionarioPNumero = oid.getCuestionarioPNumero();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>cuestionarioPNumero</code> attribute<br>in class <code>CuestionarioP</code>.
     * This is part of the identification for this class, which depends on the identification of <code>CuestionarioP</code>
     * @return The value of the <code>cuestionarioPNumero</code> attribute<br>in class <code>CuestionarioP</code>.
     */
    public Long getCuestionarioPNumero() {
        return cuestionarioPNumero;
    }

    /**
     * Sets the value of the <code>cuestionarioPNumero</code> attribute<br>in class <code>CuestionarioP</code>.
     * This is part of the identification for this class, which depends on the identification of <code>CuestionarioP</code>
     * @param cuestionarioPNumero The new value of the <code>cuestionarioPNumero</code> attribute<br>in class <code>CuestionarioP</code>.
     */
    public void setCuestionarioPNumero(Long cuestionarioPNumero) {
        this.cuestionarioPNumero = cuestionarioPNumero;
    }

   /**
    * Returns the value of the <code>cuestionarioPNombre</code> attribute.<br>
    * Model Attribute: <code>cuestionarioPNombre</code>. Constant String Size=100<br>
    * Comments: <br>
    * @return The value of the <code>cuestionarioPNombre</code> attribute.
    */

    public String getCuestionarioPNombre()  {
    	String value;
        value =  cuestionarioPNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>cuestionarioPNombre</code> attribute.<br>
    * Model Attribute: <code>cuestionarioPNombre</code>. Constant String Size=100<br>
    * Comments: <br>
    * @param cuestionarioPNombre The new value of the <code>cuestionarioPNombre</code> attribute.
    */
    public void setCuestionarioPNombre (String cuestionarioPNombre) {
        modifiedCuestionarioPNombre = true;
        this.cuestionarioPNombre = cuestionarioPNombre;
    }

   /**
    * Returns the value of the <code>modifiedCuestionarioPNombre</code> class property.<br>
    *
    * @return The value of the <code>modifiedCuestionarioPNombre</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedCuestionarioPNombre() {
        return modifiedCuestionarioPNombre;
    }

   /**
    * Sets the value of the <code>modifiedCuestionarioPNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedCuestionarioPNombre</code>.
    */
    public void setModifiedCuestionarioPNombre(boolean modified) {
        this.modifiedCuestionarioPNombre = modified;
    }

   /**
    * Returns the value of the <code>cuestionarioPYaDiligenciado</code> attribute.<br>
    * Model Attribute: <code>cuestionarioPYaDiligenciado</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>cuestionarioPYaDiligenciado</code> attribute.
    */

    public Boolean getCuestionarioPYaDiligenciado()  {
    	Boolean value;
        value =  cuestionarioPYaDiligenciado;
        return value;
    }

   /**
    * Sets the value of the <code>cuestionarioPYaDiligenciado</code> attribute.<br>
    * Model Attribute: <code>cuestionarioPYaDiligenciado</code>. Variable Bool<br>
    * Comments: <br>
    * @param cuestionarioPYaDiligenciado The new value of the <code>cuestionarioPYaDiligenciado</code> attribute.
    */
    public void setCuestionarioPYaDiligenciado (Boolean cuestionarioPYaDiligenciado) {
        modifiedCuestionarioPYaDiligenciado = true;
        this.cuestionarioPYaDiligenciado = cuestionarioPYaDiligenciado;
    }

   /**
    * Returns the value of the <code>modifiedCuestionarioPYaDiligenciado</code> class property.<br>
    *
    * @return The value of the <code>modifiedCuestionarioPYaDiligenciado</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedCuestionarioPYaDiligenciado() {
        return modifiedCuestionarioPYaDiligenciado;
    }

   /**
    * Sets the value of the <code>modifiedCuestionarioPYaDiligenciado</code> class property.<br>
    * @param modified The new value of the <code>modifiedCuestionarioPYaDiligenciado</code>.
    */
    public void setModifiedCuestionarioPYaDiligenciado(boolean modified) {
        this.modifiedCuestionarioPYaDiligenciado = modified;
    }

    /**
     * Returns the instance of <code>SeccionP</code> related through the <code>Secciones</code> role.
     * Model Relationship:
     * <code>[SeccionP] Secciones 0:M  ------ 1:1  Cuestionario [CuestionarioP]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>SeccionP</code> related through the <code>Secciones</code> role.
     */
    @JsonIgnore
    public Collection <SeccionP> getSecciones() {
        return getSeccionPRepository().findByCuestionario(this);
    }

    /**
     * Adds an instance of <code>SeccionP</code> related through the <code>Secciones</code> role.
     * @param secciones The instance to add to the <code>Secciones</code> role.
     */
    public void add2Secciones(SeccionP secciones) {
        this.secciones.add(secciones);
    }
    /**
     * Removes an instance of <code>SeccionP</code> related through the <code>Secciones</code> role.
     * @param secciones The instance to be removed
     */
    public void removeFromSecciones(SeccionP secciones) {
    	this.secciones.remove(secciones);
    }
    /**
     * Sets instances of <code>SeccionP</code> related through the <code>Secciones</code> role.
     * @param secciones The new value for the <code>Secciones</code> role.
     */
    public void setSecciones(Collection < SeccionP > secciones) {
        this.secciones = secciones;
    }

   /**
    * This method gets the attribute value <code>modifiedSecciones</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedSecciones</code> has been modified.
    */
    public boolean isModifiedSecciones(){
        return modifiedSecciones;
    }

    /**
     * Returns the instance of <code>Usuario</code> related through the <code>Usuario</code> role.
     * Model Relationship:
     * <code>[Usuario] Usuario 1:1  ------ 0:1  CuestionarioP [CuestionarioP]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Usuario</code> related through the <code>Usuario</code> role.
     */
    @JsonIgnore
    public Usuario getUsuario() {
        try {
            if (usuario != null && usuario.isNull()) {
                usuario = null;
            }
        } catch (Exception ex) {
            usuario = null;
        }
        if (usuario == null) {
            if (aesolicitudesidsolicitud != null && usuarioIdentificador != null) {
                usuario = getUsuarioRepository().findById(new UsuarioOid(aesolicitudesidsolicitud, usuarioIdentificador)).orElse(null);
            } else {
                usuario = null;
            }
        }
        return (usuario == null ? new Usuario(null) : usuario);
    }

    /**
     * Adds an instance of <code>Usuario</code> related through the <code>Usuario</code> role.
     * @param usuario The instance to add to the <code>Usuario</code> role.
     */
    public void add2Usuario(Usuario usuario) {
        if (usuario == null || usuario.isNull()) {
            this.modifiedUsuario = true;
            this.aesolicitudesidsolicitud = null;
            this.usuarioIdentificador = null;
        } else {
            this.aesolicitudesidsolicitud = usuario.getAesolicitudesidsolicitud();
            this.usuarioIdentificador = usuario.getUsuarioIdentificador();
        }
        this.usuario = (usuario == null  || usuario.isNull() ? null : usuario);
    }

   /**
    * This method gets the attribute value <code>modifiedUsuario</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedUsuario</code> has been modified.
    */
    public boolean isModifiedUsuario(){
        return modifiedUsuario;
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
        cuestionarioPNombre = "";
        cuestionarioPYaDiligenciado = false;
        secciones = null;
        usuario = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }
    public SeccionPJpaRepository getSeccionPRepository() {
        return Arc.container().select(SeccionPJpaRepository.class).get();
    }
    public UsuarioJpaRepository getUsuarioRepository() {
        return Arc.container().select(UsuarioJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return CuestionarioP.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return CuestionarioPConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedCuestionarioPNombre = false;
    	values.put("cuestionarioPNombre", getCuestionarioPNombre());
    	modifiedCuestionarioPYaDiligenciado = false;
    	values.put("cuestionarioPYaDiligenciado", getCuestionarioPYaDiligenciado());
    	modifiedSecciones = false;
    	modifiedUsuario = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>CuestionarioPOid</code> object that identifies this instance of <code>CuestionarioP</code>.
     * @return <code>CuestionarioPOid </code> object that identifies this instance of <code>CuestionarioP</code>
     */
	@Override
    public CuestionarioPOid getOid() {
        return new CuestionarioPOid(getCuestionarioPNumero());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(CuestionarioPConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(CuestionarioPConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.CUESTIONARIOP)) {
            // Add this class
            activeFacets.add(Constants.CUESTIONARIOP);
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

    public String buildDSCuestionarioPIIU() {
        try {
            return getUsuario().getUsuariodrvNombreCompleto() + " " + (getCuestionarioPYaDiligenciado() != null ? getCuestionarioPYaDiligenciado().toString() : "");
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSCuestionarioPNull() {
        try {
            return (getCuestionarioPNumero() != null ? getCuestionarioPNumero().toString() : "");
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
            relatedInstance = buildCuestionarioPRelatedInstance(relatedInstanceJsonOid);
        }
        if (CuestionarioPConstants.ROLE_NAME_SECCIONES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildCuestionarioPRelatedInstance4SeccionP(relatedInstanceJsonOid, remainingPath);
        }
        if (CuestionarioPConstants.ROLE_NAME_USUARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildCuestionarioPRelatedInstance4Usuario(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildCuestionarioPRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new CuestionarioP(mapper.readValue(relatedInstanceJsonOid, CuestionarioPOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(CuestionarioP.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildCuestionarioPRelatedInstance4SeccionP(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SeccionP(mapper.readValue(relatedInstanceJsonOid, SeccionPOid.class)): SeccionP.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(CuestionarioP.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildCuestionarioPRelatedInstance4Usuario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Usuario(mapper.readValue(relatedInstanceJsonOid, UsuarioOid.class)): Usuario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(CuestionarioP.class).error(e.getMessage());
            return null;
        }
    }
}
