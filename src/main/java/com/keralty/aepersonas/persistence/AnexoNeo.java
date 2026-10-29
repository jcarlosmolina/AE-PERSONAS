package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.AnexoNeoConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.InstitucionMatNeoConstants;
import com.keralty.aepersonas.global.PeriodicidadConstants;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.oid.AnexoNeoOid;
import com.keralty.aepersonas.persistence.oid.InstitucionMatNeoOid;
import com.keralty.aepersonas.persistence.oid.PeriodicidadOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.repository.AnexoNeoJpaRepository;
import com.keralty.aepersonas.repository.InstitucionMatNeoJpaRepository;
import com.keralty.aepersonas.repository.PeriodicidadJpaRepository;
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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Persistent representation of the <code>AnexoNeo</code> model class.
 * <p>
 * Model Class: <code>AnexoNeo</code><br>
 */
@Entity(name = AnexoNeoConstants.CLASS_NAME)
@Table(name = AnexoNeoConstants.TBL_NAME)
public class AnexoNeo extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient AnexoNeoJpaRepository anexoNeoRepository;

    @JsonIgnore
    private transient UsuarioJpaRepository usuarioRepository;

    @JsonIgnore
    private transient PeriodicidadJpaRepository periodicidadRepository;

    @JsonIgnore
    private transient InstitucionMatNeoJpaRepository institucionMatNeoRepository;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AnexoNeo_Sequence")
    @SequenceGenerator(name="AnexoNeo_Sequence", sequenceName="AnexoNeo_Sequence", allocationSize=1)
    @Column(name = AnexoNeoConstants.FLD_ANEXONEOIDENTIFICADOR )
    @JsonProperty(value="identificador")
    private Long anexoNeoIdentificador;

    /** Class member attribute. */
    @Column(name = AnexoNeoConstants.FLD_ANEXONEOFECHAULTREGLA )
    @JsonProperty(value="fechaultregla")
    private Date anexoNeoFechaUltRegla;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAnexoNeoFechaUltRegla;

    /** Class member attribute. */
    @Column(name = AnexoNeoConstants.FLD_ANEXONEONUMHIJOS )
    @JsonProperty(value="numhijos")
    private Long anexoNeoNumHijos;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAnexoNeoNumHijos;

    /** Class member attribute. */
    @Column(name = AnexoNeoConstants.FLD_ANEXONEONUMCUOTAS )
    @JsonProperty(value="numcuotas")
    private Long anexoNeoNumCuotas;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAnexoNeoNumCuotas;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvvalor")
    protected Double anexoNeodrvValor;

    /** Related Class. */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=AnexoNeoConstants.FLD_AESOLICITUDESIDSOLICITUD, referencedColumnName=UsuarioConstants.FLD_AESOLICITUDESIDSOLICITUD), 
        @JoinColumn(name=AnexoNeoConstants.FLD_USUARIOUSUARIOIDENTIFICADOR, referencedColumnName=UsuarioConstants.FLD_USUARIOIDENTIFICADOR)
    })
    @JsonIgnore
    private Usuario usuario;
    /** Related attribute. */
    @Column(name = AnexoNeoConstants.FLD_AESOLICITUDESIDSOLICITUD, insertable = false, updatable = false)
    private Long aesolicitudesidsolicitud;
    /** Related attribute. */
    @Column(name = AnexoNeoConstants.FLD_USUARIOUSUARIOIDENTIFICADOR, insertable = false, updatable = false)
    private Long usuarioUsuarioIdentificador;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuario;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=AnexoNeoConstants.FLD_PERIODICIDADCODIGO, referencedColumnName=PeriodicidadConstants.FLD_PERIODICIDADCODIGO)
    })
    @JsonIgnore
    private Periodicidad periodicidad;
    /** Related attribute. */
    @Column(name = AnexoNeoConstants.FLD_PERIODICIDADCODIGO, insertable = false, updatable = false)
    private Long periodicidadCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPeriodicidad;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=AnexoNeoConstants.FLD_INSTITUCIONMATNEOINSTITUCIONNEONATALCODIGO, referencedColumnName=InstitucionMatNeoConstants.FLD_INSTITUCIONMATNEOCODIGO)
    })
    @JsonIgnore
    private InstitucionMatNeo institucionNeonatal;
    /** Related attribute. */
    @Column(name = AnexoNeoConstants.FLD_INSTITUCIONMATNEOINSTITUCIONNEONATALCODIGO, insertable = false, updatable = false)
    private String institucionMatNeoInstitucionNeonatalCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedInstitucionNeonatal;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public AnexoNeo() {
        anexoNeoIdentificador = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>AnexoNeo</code>.
     * @param oid Object Identifier of the instance of <code>AnexoNeo</code> to be created.
     * @throws SystemException
     */
    public AnexoNeo(AnexoNeoOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            anexoNeoIdentificador = oid.getAnexoNeoIdentificador();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>anexoNeoIdentificador</code> attribute<br>in class <code>AnexoNeo</code>.
     * This is part of the identification for this class, which depends on the identification of <code>AnexoNeo</code>
     * @return The value of the <code>anexoNeoIdentificador</code> attribute<br>in class <code>AnexoNeo</code>.
     */
    public Long getAnexoNeoIdentificador() {
        return anexoNeoIdentificador;
    }

    /**
     * Sets the value of the <code>anexoNeoIdentificador</code> attribute<br>in class <code>AnexoNeo</code>.
     * This is part of the identification for this class, which depends on the identification of <code>AnexoNeo</code>
     * @param anexoNeoIdentificador The new value of the <code>anexoNeoIdentificador</code> attribute<br>in class <code>AnexoNeo</code>.
     */
    public void setAnexoNeoIdentificador(Long anexoNeoIdentificador) {
        this.anexoNeoIdentificador = anexoNeoIdentificador;
    }

   /**
    * Returns the value of the <code>anexoNeoFechaUltRegla</code> attribute.<br>
    * Model Attribute: <code>anexoNeoFechaUltRegla</code>. Variable Date<br>
    * Comments: <br>
    * @return The value of the <code>anexoNeoFechaUltRegla</code> attribute.
    */

    public Date getAnexoNeoFechaUltRegla()  {
    	Date value;
        value =  anexoNeoFechaUltRegla;
        return value;
    }

   /**
    * Sets the value of the <code>anexoNeoFechaUltRegla</code> attribute.<br>
    * Model Attribute: <code>anexoNeoFechaUltRegla</code>. Variable Date<br>
    * Comments: <br>
    * @param anexoNeoFechaUltRegla The new value of the <code>anexoNeoFechaUltRegla</code> attribute.
    */
    public void setAnexoNeoFechaUltRegla (Date anexoNeoFechaUltRegla) {
        modifiedAnexoNeoFechaUltRegla = true;
        this.anexoNeoFechaUltRegla = anexoNeoFechaUltRegla;
    }

   /**
    * Returns the value of the <code>modifiedAnexoNeoFechaUltRegla</code> class property.<br>
    *
    * @return The value of the <code>modifiedAnexoNeoFechaUltRegla</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedAnexoNeoFechaUltRegla() {
        return modifiedAnexoNeoFechaUltRegla;
    }

   /**
    * Sets the value of the <code>modifiedAnexoNeoFechaUltRegla</code> class property.<br>
    * @param modified The new value of the <code>modifiedAnexoNeoFechaUltRegla</code>.
    */
    public void setModifiedAnexoNeoFechaUltRegla(boolean modified) {
        this.modifiedAnexoNeoFechaUltRegla = modified;
    }

   /**
    * Returns the value of the <code>anexoNeoNumHijos</code> attribute.<br>
    * Model Attribute: <code>anexoNeoNumHijos</code>. Variable Nat<br>
    * Comments: <br>
    * @return The value of the <code>anexoNeoNumHijos</code> attribute.
    */

    public Long getAnexoNeoNumHijos()  {
    	Long value;
        value =  anexoNeoNumHijos;
        return value;
    }

   /**
    * Sets the value of the <code>anexoNeoNumHijos</code> attribute.<br>
    * Model Attribute: <code>anexoNeoNumHijos</code>. Variable Nat<br>
    * Comments: <br>
    * @param anexoNeoNumHijos The new value of the <code>anexoNeoNumHijos</code> attribute.
    */
    public void setAnexoNeoNumHijos (Long anexoNeoNumHijos) {
        modifiedAnexoNeoNumHijos = true;
        this.anexoNeoNumHijos = anexoNeoNumHijos;
    }

   /**
    * Returns the value of the <code>modifiedAnexoNeoNumHijos</code> class property.<br>
    *
    * @return The value of the <code>modifiedAnexoNeoNumHijos</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedAnexoNeoNumHijos() {
        return modifiedAnexoNeoNumHijos;
    }

   /**
    * Sets the value of the <code>modifiedAnexoNeoNumHijos</code> class property.<br>
    * @param modified The new value of the <code>modifiedAnexoNeoNumHijos</code>.
    */
    public void setModifiedAnexoNeoNumHijos(boolean modified) {
        this.modifiedAnexoNeoNumHijos = modified;
    }

   /**
    * Returns the value of the <code>anexoNeoNumCuotas</code> attribute.<br>
    * Model Attribute: <code>anexoNeoNumCuotas</code>. Variable Nat<br>
    * Comments: Sólo podrá tener hasta 4<br>
    * @return The value of the <code>anexoNeoNumCuotas</code> attribute.
    */

    public Long getAnexoNeoNumCuotas()  {
    	Long value;
        value =  anexoNeoNumCuotas;
        return value;
    }

   /**
    * Sets the value of the <code>anexoNeoNumCuotas</code> attribute.<br>
    * Model Attribute: <code>anexoNeoNumCuotas</code>. Variable Nat<br>
    * Comments: Sólo podrá tener hasta 4<br>
    * @param anexoNeoNumCuotas The new value of the <code>anexoNeoNumCuotas</code> attribute.
    */
    public void setAnexoNeoNumCuotas (Long anexoNeoNumCuotas) {
        modifiedAnexoNeoNumCuotas = true;
        this.anexoNeoNumCuotas = anexoNeoNumCuotas;
    }

   /**
    * Returns the value of the <code>modifiedAnexoNeoNumCuotas</code> class property.<br>
    *
    * @return The value of the <code>modifiedAnexoNeoNumCuotas</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedAnexoNeoNumCuotas() {
        return modifiedAnexoNeoNumCuotas;
    }

   /**
    * Sets the value of the <code>modifiedAnexoNeoNumCuotas</code> class property.<br>
    * @param modified The new value of the <code>modifiedAnexoNeoNumCuotas</code>.
    */
    public void setModifiedAnexoNeoNumCuotas(boolean modified) {
        this.modifiedAnexoNeoNumCuotas = modified;
    }

   /**
    * Returns the value of the <code>anexoNeodrvValor</code> attribute.<br>
    * Model Attribute: <code>anexoNeodrvValor</code>. Variable Real<br>
    * Comments: <br>
    * @return The value of the <code>anexoNeodrvValor</code> attribute.
    */

    @JsonIgnore
    public Double getAnexoNeodrvValor()  {
    	Double value;
        try {
            value = anexoNeodrvValorDerivations();
        } catch (Exception e) {
            value = Double.valueOf(0);
            org.slf4j.LoggerFactory.getLogger(this.getClass()).debug("Definition Class: AnexoNeo, Attribute: anexoNeodrvValor");
        }
        return value;
    }

    /**
     * Returns the instance of <code>Usuario</code> related through the <code>Usuario</code> role.
     * Model Relationship:
     * <code>[Usuario] Usuario 1:1  ------ 0:1  AnexoNeo [AnexoNeo]</code>
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
            if (aesolicitudesidsolicitud != null && usuarioUsuarioIdentificador != null) {
                usuario = getUsuarioRepository().findById(new UsuarioOid(aesolicitudesidsolicitud, usuarioUsuarioIdentificador)).orElse(null);
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
            this.usuarioUsuarioIdentificador = null;
        } else {
            this.aesolicitudesidsolicitud = usuario.getAesolicitudesidsolicitud();
            this.usuarioUsuarioIdentificador = usuario.getUsuarioIdentificador();
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
     * Returns the instance of <code>Periodicidad</code> related through the <code>Periodicidad</code> role.
     * Model Relationship:
     * <code>[Periodicidad] Periodicidad 1:1  ------ 0:M  AnexosNeo [AnexoNeo]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Periodicidad</code> related through the <code>Periodicidad</code> role.
     */
    @JsonIgnore
    public Periodicidad getPeriodicidad() {
        try {
            if (periodicidad != null && periodicidad.isNull()) {
                periodicidad = null;
            }
        } catch (Exception ex) {
            periodicidad = null;
        }
        if (periodicidad == null) {
            if (periodicidadCodigo != null) {
                periodicidad = getPeriodicidadRepository().findById(periodicidadCodigo).orElse(null);
            } else {
                periodicidad = null;
            }
        }
        return (periodicidad == null ? new Periodicidad(null) : periodicidad);
    }

    /**
     * Adds an instance of <code>Periodicidad</code> related through the <code>Periodicidad</code> role.
     * @param periodicidad The instance to add to the <code>Periodicidad</code> role.
     */
    public void add2Periodicidad(Periodicidad periodicidad) {
        if (periodicidad == null || periodicidad.isNull()) {
            this.modifiedPeriodicidad = true;
            this.periodicidadCodigo = null;
        } else {
            this.periodicidadCodigo = periodicidad.getPeriodicidadCodigo();
        }
        this.periodicidad = (periodicidad == null  || periodicidad.isNull() ? null : periodicidad);
    }

   /**
    * This method gets the attribute value <code>modifiedPeriodicidad</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedPeriodicidad</code> has been modified.
    */
    public boolean isModifiedPeriodicidad(){
        return modifiedPeriodicidad;
    }

    /**
     * Returns the instance of <code>InstitucionMatNeo</code> related through the <code>InstitucionNeonatal</code> role.
     * Model Relationship:
     * <code>[InstitucionMatNeo] InstitucionNeonatal 1:1  ------ 0:M  AnexoNeo [AnexoNeo]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>InstitucionMatNeo</code> related through the <code>InstitucionNeonatal</code> role.
     */
    @JsonIgnore
    public InstitucionMatNeo getInstitucionNeonatal() {
        try {
            if (institucionNeonatal != null && institucionNeonatal.isNull()) {
                institucionNeonatal = null;
            }
        } catch (Exception ex) {
            institucionNeonatal = null;
        }
        if (institucionNeonatal == null) {
            if (institucionMatNeoInstitucionNeonatalCodigo != null) {
                institucionNeonatal = getInstitucionMatNeoRepository().findById(institucionMatNeoInstitucionNeonatalCodigo).orElse(null);
            } else {
                institucionNeonatal = null;
            }
        }
        return (institucionNeonatal == null ? new InstitucionMatNeo(null) : institucionNeonatal);
    }

    /**
     * Adds an instance of <code>InstitucionMatNeo</code> related through the <code>InstitucionNeonatal</code> role.
     * @param institucionNeonatal The instance to add to the <code>InstitucionNeonatal</code> role.
     */
    public void add2InstitucionNeonatal(InstitucionMatNeo institucionNeonatal) {
        if (institucionNeonatal == null || institucionNeonatal.isNull()) {
            this.modifiedInstitucionNeonatal = true;
            this.institucionMatNeoInstitucionNeonatalCodigo = null;
        } else {
            this.institucionMatNeoInstitucionNeonatalCodigo = institucionNeonatal.getInstitucionMatNeoCodigo();
        }
        this.institucionNeonatal = (institucionNeonatal == null  || institucionNeonatal.isNull() ? null : institucionNeonatal);
    }

   /**
    * This method gets the attribute value <code>modifiedInstitucionNeonatal</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedInstitucionNeonatal</code> has been modified.
    */
    public boolean isModifiedInstitucionNeonatal(){
        return modifiedInstitucionNeonatal;
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
     * Computes the value of the <code>anexoNeodrvValor</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>anexoNeodrvValor</code> derived attribute.
     */
    public Double anexoNeodrvValorDerivations() throws SystemException {

        anexoNeodrvValor = null;

        anexoNeodrvValorDerivationsDefault();
        return anexoNeodrvValor;
    }

    private void anexoNeodrvValorDerivationsDefault() throws SystemException {
        if (anexoNeodrvValor != null) return;
        // Default derivation
        // EFFECT   : GETONE( InstitucionNeonatal.Tarifa.DetallesTarifa.Valor ) WHERE (InstitucionNeonatal.Tarifa.DetallesTarifa.Anyo = getYear(Usuario.Solicitud.FInicioContrato) AND InstitucionNeonatal.Tarifa.DetallesTarifa.LimInferiorEdad <= Usuario.drvEdad AND Usuario.drvEdad <= InstitucionNeonatal.Tarifa.DetallesTarifa.LimSuperiorEdad)
        anexoNeodrvValor = getAnexoNeoRepository().assocOperator000(this);
    }
    /**
     * This method initializes the properties of the entity and its relations.
     */
    private void initAttributes() {
        anexoNeoFechaUltRegla = Date.valueOf(Constants.DATE_DEFAULTVALUE);
        anexoNeoNumHijos = Long.valueOf(0);
        anexoNeoNumCuotas = Long.valueOf(0);
        usuario = null;
        periodicidad = null;
        institucionNeonatal = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    public AnexoNeoJpaRepository getAnexoNeoRepository() {
        return Arc.container().select(AnexoNeoJpaRepository.class).get();
    }
    public UsuarioJpaRepository getUsuarioRepository() {
        return Arc.container().select(UsuarioJpaRepository.class).get();
    }
    public PeriodicidadJpaRepository getPeriodicidadRepository() {
        return Arc.container().select(PeriodicidadJpaRepository.class).get();
    }
    public InstitucionMatNeoJpaRepository getInstitucionMatNeoRepository() {
        return Arc.container().select(InstitucionMatNeoJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return AnexoNeo.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return AnexoNeoConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedAnexoNeoFechaUltRegla = false;
    	values.put("anexoNeoFechaUltRegla", getAnexoNeoFechaUltRegla());
    	modifiedAnexoNeoNumHijos = false;
    	values.put("anexoNeoNumHijos", getAnexoNeoNumHijos());
    	modifiedAnexoNeoNumCuotas = false;
    	values.put("anexoNeoNumCuotas", getAnexoNeoNumCuotas());
    	modifiedUsuario = false;
    	modifiedPeriodicidad = false;
    	modifiedInstitucionNeonatal = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
            anexoNeodrvValor = null;
    }

    /**
     * Returns the <code>AnexoNeoOid</code> object that identifies this instance of <code>AnexoNeo</code>.
     * @return <code>AnexoNeoOid </code> object that identifies this instance of <code>AnexoNeo</code>
     */
	@Override
    public AnexoNeoOid getOid() {
        return new AnexoNeoOid(getAnexoNeoIdentificador());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(AnexoNeoConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(AnexoNeoConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.ANEXONEO)) {
            // Add this class
            activeFacets.add(Constants.ANEXONEO);
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

    public String buildDSAnexoNeoNull() {
        try {
            return (getAnexoNeoIdentificador() != null ? getAnexoNeoIdentificador().toString() : "");
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
            relatedInstance = buildAnexoNeoRelatedInstance(relatedInstanceJsonOid);
        }
        if (AnexoNeoConstants.ROLE_NAME_USUARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAnexoNeoRelatedInstance4Usuario(relatedInstanceJsonOid, remainingPath);
        }
        if (AnexoNeoConstants.ROLE_NAME_PERIODICIDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAnexoNeoRelatedInstance4Periodicidad(relatedInstanceJsonOid, remainingPath);
        }
        if (AnexoNeoConstants.ROLE_NAME_INSTITUCIONNEONATAL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAnexoNeoRelatedInstance4InstitucionMatNeo(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildAnexoNeoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new AnexoNeo(mapper.readValue(relatedInstanceJsonOid, AnexoNeoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(AnexoNeo.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildAnexoNeoRelatedInstance4Usuario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Usuario(mapper.readValue(relatedInstanceJsonOid, UsuarioOid.class)): Usuario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(AnexoNeo.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildAnexoNeoRelatedInstance4Periodicidad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Periodicidad(mapper.readValue(relatedInstanceJsonOid, PeriodicidadOid.class)): Periodicidad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(AnexoNeo.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildAnexoNeoRelatedInstance4InstitucionMatNeo(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new InstitucionMatNeo(mapper.readValue(relatedInstanceJsonOid, InstitucionMatNeoOid.class)): InstitucionMatNeo.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(AnexoNeo.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
