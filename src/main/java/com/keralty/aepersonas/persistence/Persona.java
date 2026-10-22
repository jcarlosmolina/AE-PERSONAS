package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DepartamentoConstants;
import com.keralty.aepersonas.global.EstadoCivilConstants;
import com.keralty.aepersonas.global.EstadoPersonaConstants;
import com.keralty.aepersonas.global.MunicipioConstants;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.global.TipoIdentificacionConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.DocumentoGOid;
import com.keralty.aepersonas.persistence.oid.EstadoCivilOid;
import com.keralty.aepersonas.persistence.oid.EstadoPersonaOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.repository.DepartamentoJpaRepository;
import com.keralty.aepersonas.repository.DireccionJpaRepository;
import com.keralty.aepersonas.repository.DocumentoGJpaRepository;
import com.keralty.aepersonas.repository.EstadoCivilJpaRepository;
import com.keralty.aepersonas.repository.EstadoPersonaJpaRepository;
import com.keralty.aepersonas.repository.MunicipioJpaRepository;
import com.keralty.aepersonas.repository.PersonaJpaRepository;
import com.keralty.aepersonas.repository.SolicitudJpaRepository;
import com.keralty.aepersonas.repository.TipoIdentificacionJpaRepository;
import com.keralty.aepersonas.repository.UsuarioJpaRepository;
import com.keralty.aepersonas.utils.Utilities;
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
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Persistent representation of the <code>Persona</code> model class.
 * <p>
 * Model Class: <code>Persona</code><br>
 */
@Entity(name = PersonaConstants.CLASS_NAME)
@Table(name = PersonaConstants.TBL_NAME)
public class Persona extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient PersonaJpaRepository personaRepository;

    @JsonIgnore
    private transient SolicitudJpaRepository solicitudRepository;

    @JsonIgnore
    private transient DireccionJpaRepository direccionRepository;

    @JsonIgnore
    private transient UsuarioJpaRepository usuarioRepository;

    @JsonIgnore
    private transient DocumentoGJpaRepository documentoGRepository;

    @JsonIgnore
    private transient TipoIdentificacionJpaRepository tipoIdentificacionRepository;

    @JsonIgnore
    private transient DepartamentoJpaRepository departamentoRepository;

    @JsonIgnore
    private transient MunicipioJpaRepository municipioRepository;

    @JsonIgnore
    private transient EstadoCivilJpaRepository estadoCivilRepository;

    @JsonIgnore
    private transient EstadoPersonaJpaRepository estadoPersonaRepository;

    private transient UserFunctions userFunctionsSrv;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="Persona_Sequence")
    @SequenceGenerator(name="Persona_Sequence", sequenceName="Persona_Sequence", allocationSize=1)
    @Column(name = PersonaConstants.FLD_PERSONAIDENTIFICADOR )
    @JsonProperty(value="identificador")
    private Long personaIdentificador;

    /** Class member attribute. */
    @Column(name = PersonaConstants.FLD_PERSONACODIGO )
    @JsonProperty(value="codigo")
    private Long personaCodigo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaCodigo;

    /** Class member attribute. */
    @Column(name = PersonaConstants.FLD_PERSONANUMIDENTIFICACION )
    @JsonProperty(value="numidentificacion")
    private String personaNumIdentificacion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaNumIdentificacion;

    /** Class member attribute. */
    @Column(name = PersonaConstants.FLD_PERSONATIPOPERSONA )
    @JsonProperty(value="tipopersona")
    private String personaTipoPersona;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaTipoPersona;

    /** Class member attribute. */
    @Column(name = PersonaConstants.FLD_PERSONAPRIMERNOMBRE )
    @JsonProperty(value="primernombre")
    private String personaPrimerNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaPrimerNombre;

    /** Class member attribute. */
    @Column(name = PersonaConstants.FLD_PERSONASEGUNDONOMBRE )
    @JsonProperty(value="segundonombre")
    private String personaSegundoNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaSegundoNombre;

    /** Class member attribute. */
    @Column(name = PersonaConstants.FLD_PERSONAPRIMERAPELLIDO )
    @JsonProperty(value="primerapellido")
    private String personaPrimerApellido;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaPrimerApellido;

    /** Class member attribute. */
    @Column(name = PersonaConstants.FLD_PERSONASEGUNDOAPELLIDO )
    @JsonProperty(value="segundoapellido")
    private String personaSegundoApellido;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaSegundoApellido;

    /** Class member attribute. */
    @Column(name = PersonaConstants.FLD_PERSONARAZONSOCIAL )
    @JsonProperty(value="razonsocial")
    private String personaRazonSocial;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaRazonSocial;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvnombrecompleto")
    protected String personadrvNombreCompleto;

    /** Class member attribute. */
    @Column(name = PersonaConstants.FLD_PERSONAFECHANACIMIENTO )
    @JsonProperty(value="fechanacimiento")
    private Date personaFechaNacimiento;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaFechaNacimiento;

    /** Class member attribute. */
    @Column(name = PersonaConstants.FLD_PERSONAGENERO )
    @JsonProperty(value="genero")
    private String personaGenero;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaGenero;

    /** Class member attribute. */
    @Column(name = PersonaConstants.FLD_PERSONAINDICADOREXTRANJERO )
    @JsonProperty(value="indicadorextranjero")
    private Boolean personaIndicadorExtranjero;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaIndicadorExtranjero;

    /** Class member attribute. */
    @Column(name = PersonaConstants.FLD_PERSONATELEFONOFIJO )
    @JsonProperty(value="telefonofijo")
    private String personaTelefonoFijo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaTelefonoFijo;

    /** Class member attribute. */
    @Column(name = PersonaConstants.FLD_PERSONATELEFONOCELULAR )
    @JsonProperty(value="telefonocelular")
    private String personaTelefonoCelular;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaTelefonoCelular;

    /** Class member attribute. */
    @Column(name = PersonaConstants.FLD_PERSONACORREOELECTRONICO )
    @JsonProperty(value="correoelectronico")
    private String personaCorreoElectronico;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaCorreoElectronico;

    /** Class member attribute. */
    @Column(name = PersonaConstants.FLD_PERSONATIENEEPSSANITAS )
    @JsonProperty(value="tieneepssanitas")
    private Boolean personaTieneEPSSanitas;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaTieneEPSSanitas;

    /** Class member attribute. */
    @Column(name = PersonaConstants.FLD_PERSONARECHAZADOAFILIACION )
    @JsonProperty(value="rechazadoafiliacion")
    private String personaRechazadoAfiliacion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaRechazadoAfiliacion;

    /** Class member attribute. */
    @Column(name = PersonaConstants.FLD_PERSONADATOSBASICOSMOD )
    @JsonProperty(value="datosbasicosmod")
    private Boolean personaDatosBasicosMod;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPersonaDatosBasicosMod;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvrechazada")
    protected Boolean personadrvRechazada;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvtienedirecciones")
    protected Boolean personadrvTieneDirecciones;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvtiponumdoc")
    protected String personadrvTipoNumDoc;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvvienedecore")
    protected Boolean personadrvVieneDeCORE;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvadddoccomocont")
    protected Boolean personadrvAddDocComoCont;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvadddoccomotitu")
    protected Boolean personadrvAddDocComoTitu;

    /** Related Class. */
    @OneToMany(mappedBy = PersonaConstants.ROLE_INVNAME_SOLICITUDESCONTRATANTE)
    @JsonIgnore
    private Collection <Solicitud> solicitudesContratante;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudesContratante;

    /** Related Class. */
    @OneToMany(mappedBy = PersonaConstants.ROLE_INVNAME_SOLICITUDESTITULAR)
    @JsonIgnore
    private Collection <Solicitud> solicitudesTitular;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudesTitular;

    /** Related Class. */
    @OneToMany(mappedBy = PersonaConstants.ROLE_INVNAME_DIRECCIONES)
    @JsonIgnore
    private Collection <Direccion> direcciones;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDirecciones;

    /** Related Class. */
    @OneToOne(fetch = FetchType.LAZY, mappedBy = PersonaConstants.ROLE_INVNAME_USUARIOS)
    @JsonIgnore
    private Usuario usuarios;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuarios;

    /** Related Class. */
    @OneToMany(mappedBy = PersonaConstants.ROLE_INVNAME_DOCUMENTOSG)
    @JsonIgnore
    private Collection <DocumentoG> documentosG;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDocumentosG;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=PersonaConstants.FLD_TIPOIDENTIFICACIONTIPOIDENTIFICACIONCODIGO, referencedColumnName=TipoIdentificacionConstants.FLD_TIPOIDENTIFICACIONCODIGO)
    })
    @JsonIgnore
    private TipoIdentificacion tipoIdentificacion;
    /** Related attribute. */
    @Column(name = PersonaConstants.FLD_TIPOIDENTIFICACIONTIPOIDENTIFICACIONCODIGO, insertable = false, updatable = false)
    private Long tipoIdentificacionTipoIdentificacionCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoIdentificacion;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=PersonaConstants.FLD_DEPARTAMENTODEPARTAMENTONACIMIENTOCODIGO, referencedColumnName=DepartamentoConstants.FLD_DEPARTAMENTOCODIGO)
    })
    @JsonIgnore
    private Departamento departamentoNacimiento;
    /** Related attribute. */
    @Column(name = PersonaConstants.FLD_DEPARTAMENTODEPARTAMENTONACIMIENTOCODIGO, insertable = false, updatable = false)
    private Long departamentoDepartamentoNacimientoCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDepartamentoNacimiento;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=PersonaConstants.FLD_MUNICIPIOMUNICIPIONACIMIENTOCODIGO, referencedColumnName=MunicipioConstants.FLD_MUNICIPIOCODIGO)
    })
    @JsonIgnore
    private Municipio municipioNacimiento;
    /** Related attribute. */
    @Column(name = PersonaConstants.FLD_MUNICIPIOMUNICIPIONACIMIENTOCODIGO, insertable = false, updatable = false)
    private Long municipioMunicipioNacimientoCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedMunicipioNacimiento;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=PersonaConstants.FLD_ESTADOCIVILESTADOCIVILCODIGO, referencedColumnName=EstadoCivilConstants.FLD_ESTADOCIVILCODIGO)
    })
    @JsonIgnore
    private EstadoCivil estadoCivil;
    /** Related attribute. */
    @Column(name = PersonaConstants.FLD_ESTADOCIVILESTADOCIVILCODIGO, insertable = false, updatable = false)
    private Long estadoCivilEstadoCivilCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedEstadoCivil;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=PersonaConstants.FLD_ESTADOPERSONAESTADOPERSONACODIGO, referencedColumnName=EstadoPersonaConstants.FLD_ESTADOPERSONACODIGO)
    })
    @JsonIgnore
    private EstadoPersona estadoPersona;
    /** Related attribute. */
    @Column(name = PersonaConstants.FLD_ESTADOPERSONAESTADOPERSONACODIGO, insertable = false, updatable = false)
    private Long estadoPersonaEstadoPersonaCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedEstadoPersona;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public Persona() {
        personaIdentificador = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>Persona</code>.
     * @param oid Object Identifier of the instance of <code>Persona</code> to be created.
     * @throws SystemException
     */
    public Persona(PersonaOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            personaIdentificador = oid.getPersonaIdentificador();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>personaIdentificador</code> attribute<br>in class <code>Persona</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Persona</code>
     * @return The value of the <code>personaIdentificador</code> attribute<br>in class <code>Persona</code>.
     */
    public Long getPersonaIdentificador() {
        return personaIdentificador;
    }

    /**
     * Sets the value of the <code>personaIdentificador</code> attribute<br>in class <code>Persona</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Persona</code>
     * @param personaIdentificador The new value of the <code>personaIdentificador</code> attribute<br>in class <code>Persona</code>.
     */
    public void setPersonaIdentificador(Long personaIdentificador) {
        this.personaIdentificador = personaIdentificador;
    }

   /**
    * Returns the value of the <code>personaCodigo</code> attribute.<br>
    * Model Attribute: <code>personaCodigo</code>. Variable Int<br>
    * Comments: Este es el código de persona que se le asignará en el CORE. Cuando la creamos en local para enviarle los datos al CORE no lo tenemos. <br>
    * @return The value of the <code>personaCodigo</code> attribute.
    */

    public Long getPersonaCodigo()  {
    	Long value;
        value =  personaCodigo;
        return value;
    }

   /**
    * Sets the value of the <code>personaCodigo</code> attribute.<br>
    * Model Attribute: <code>personaCodigo</code>. Variable Int<br>
    * Comments: Este es el código de persona que se le asignará en el CORE. Cuando la creamos en local para enviarle los datos al CORE no lo tenemos. <br>
    * @param personaCodigo The new value of the <code>personaCodigo</code> attribute.
    */
    public void setPersonaCodigo (Long personaCodigo) {
        modifiedPersonaCodigo = true;
        this.personaCodigo = personaCodigo;
    }

   /**
    * Returns the value of the <code>modifiedPersonaCodigo</code> class property.<br>
    *
    * @return The value of the <code>modifiedPersonaCodigo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPersonaCodigo() {
        return modifiedPersonaCodigo;
    }

   /**
    * Sets the value of the <code>modifiedPersonaCodigo</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaCodigo</code>.
    */
    public void setModifiedPersonaCodigo(boolean modified) {
        this.modifiedPersonaCodigo = modified;
    }

   /**
    * Returns the value of the <code>personaNumIdentificacion</code> attribute.<br>
    * Model Attribute: <code>personaNumIdentificacion</code>. Variable String Size=60<br>
    * Comments: <br>
    * @return The value of the <code>personaNumIdentificacion</code> attribute.
    */

    public String getPersonaNumIdentificacion()  {
    	String value;
        value =  personaNumIdentificacion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>personaNumIdentificacion</code> attribute.<br>
    * Model Attribute: <code>personaNumIdentificacion</code>. Variable String Size=60<br>
    * Comments: <br>
    * @param personaNumIdentificacion The new value of the <code>personaNumIdentificacion</code> attribute.
    */
    public void setPersonaNumIdentificacion (String personaNumIdentificacion) {
        modifiedPersonaNumIdentificacion = true;
        this.personaNumIdentificacion = personaNumIdentificacion;
    }

   /**
    * Returns the value of the <code>modifiedPersonaNumIdentificacion</code> class property.<br>
    *
    * @return The value of the <code>modifiedPersonaNumIdentificacion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPersonaNumIdentificacion() {
        return modifiedPersonaNumIdentificacion;
    }

   /**
    * Sets the value of the <code>modifiedPersonaNumIdentificacion</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaNumIdentificacion</code>.
    */
    public void setModifiedPersonaNumIdentificacion(boolean modified) {
        this.modifiedPersonaNumIdentificacion = modified;
    }

   /**
    * Returns the value of the <code>personaTipoPersona</code> attribute.<br>
    * Model Attribute: <code>personaTipoPersona</code>. Variable String Size=1<br>
    * Comments: N - Natural, J - Jurídica<br>
    * @return The value of the <code>personaTipoPersona</code> attribute.
    */

    public String getPersonaTipoPersona()  {
    	String value;
        value =  personaTipoPersona;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>personaTipoPersona</code> attribute.<br>
    * Model Attribute: <code>personaTipoPersona</code>. Variable String Size=1<br>
    * Comments: N - Natural, J - Jurídica<br>
    * @param personaTipoPersona The new value of the <code>personaTipoPersona</code> attribute.
    */
    public void setPersonaTipoPersona (String personaTipoPersona) {
        modifiedPersonaTipoPersona = true;
        this.personaTipoPersona = personaTipoPersona;
    }

   /**
    * Returns the value of the <code>modifiedPersonaTipoPersona</code> class property.<br>
    *
    * @return The value of the <code>modifiedPersonaTipoPersona</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPersonaTipoPersona() {
        return modifiedPersonaTipoPersona;
    }

   /**
    * Sets the value of the <code>modifiedPersonaTipoPersona</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaTipoPersona</code>.
    */
    public void setModifiedPersonaTipoPersona(boolean modified) {
        this.modifiedPersonaTipoPersona = modified;
    }

   /**
    * Returns the value of the <code>personaPrimerNombre</code> attribute.<br>
    * Model Attribute: <code>personaPrimerNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>personaPrimerNombre</code> attribute.
    */

    public String getPersonaPrimerNombre()  {
    	String value;
        value =  personaPrimerNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>personaPrimerNombre</code> attribute.<br>
    * Model Attribute: <code>personaPrimerNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param personaPrimerNombre The new value of the <code>personaPrimerNombre</code> attribute.
    */
    public void setPersonaPrimerNombre (String personaPrimerNombre) {
        modifiedPersonaPrimerNombre = true;
        this.personaPrimerNombre = personaPrimerNombre;
    }

   /**
    * Returns the value of the <code>modifiedPersonaPrimerNombre</code> class property.<br>
    *
    * @return The value of the <code>modifiedPersonaPrimerNombre</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPersonaPrimerNombre() {
        return modifiedPersonaPrimerNombre;
    }

   /**
    * Sets the value of the <code>modifiedPersonaPrimerNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaPrimerNombre</code>.
    */
    public void setModifiedPersonaPrimerNombre(boolean modified) {
        this.modifiedPersonaPrimerNombre = modified;
    }

   /**
    * Returns the value of the <code>personaSegundoNombre</code> attribute.<br>
    * Model Attribute: <code>personaSegundoNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>personaSegundoNombre</code> attribute.
    */

    public String getPersonaSegundoNombre()  {
    	String value;
        value =  personaSegundoNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>personaSegundoNombre</code> attribute.<br>
    * Model Attribute: <code>personaSegundoNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param personaSegundoNombre The new value of the <code>personaSegundoNombre</code> attribute.
    */
    public void setPersonaSegundoNombre (String personaSegundoNombre) {
        modifiedPersonaSegundoNombre = true;
        this.personaSegundoNombre = personaSegundoNombre;
    }

   /**
    * Returns the value of the <code>modifiedPersonaSegundoNombre</code> class property.<br>
    *
    * @return The value of the <code>modifiedPersonaSegundoNombre</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPersonaSegundoNombre() {
        return modifiedPersonaSegundoNombre;
    }

   /**
    * Sets the value of the <code>modifiedPersonaSegundoNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaSegundoNombre</code>.
    */
    public void setModifiedPersonaSegundoNombre(boolean modified) {
        this.modifiedPersonaSegundoNombre = modified;
    }

   /**
    * Returns the value of the <code>personaPrimerApellido</code> attribute.<br>
    * Model Attribute: <code>personaPrimerApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>personaPrimerApellido</code> attribute.
    */

    public String getPersonaPrimerApellido()  {
    	String value;
        value =  personaPrimerApellido;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>personaPrimerApellido</code> attribute.<br>
    * Model Attribute: <code>personaPrimerApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param personaPrimerApellido The new value of the <code>personaPrimerApellido</code> attribute.
    */
    public void setPersonaPrimerApellido (String personaPrimerApellido) {
        modifiedPersonaPrimerApellido = true;
        this.personaPrimerApellido = personaPrimerApellido;
    }

   /**
    * Returns the value of the <code>modifiedPersonaPrimerApellido</code> class property.<br>
    *
    * @return The value of the <code>modifiedPersonaPrimerApellido</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPersonaPrimerApellido() {
        return modifiedPersonaPrimerApellido;
    }

   /**
    * Sets the value of the <code>modifiedPersonaPrimerApellido</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaPrimerApellido</code>.
    */
    public void setModifiedPersonaPrimerApellido(boolean modified) {
        this.modifiedPersonaPrimerApellido = modified;
    }

   /**
    * Returns the value of the <code>personaSegundoApellido</code> attribute.<br>
    * Model Attribute: <code>personaSegundoApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>personaSegundoApellido</code> attribute.
    */

    public String getPersonaSegundoApellido()  {
    	String value;
        value =  personaSegundoApellido;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>personaSegundoApellido</code> attribute.<br>
    * Model Attribute: <code>personaSegundoApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param personaSegundoApellido The new value of the <code>personaSegundoApellido</code> attribute.
    */
    public void setPersonaSegundoApellido (String personaSegundoApellido) {
        modifiedPersonaSegundoApellido = true;
        this.personaSegundoApellido = personaSegundoApellido;
    }

   /**
    * Returns the value of the <code>modifiedPersonaSegundoApellido</code> class property.<br>
    *
    * @return The value of the <code>modifiedPersonaSegundoApellido</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPersonaSegundoApellido() {
        return modifiedPersonaSegundoApellido;
    }

   /**
    * Sets the value of the <code>modifiedPersonaSegundoApellido</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaSegundoApellido</code>.
    */
    public void setModifiedPersonaSegundoApellido(boolean modified) {
        this.modifiedPersonaSegundoApellido = modified;
    }

   /**
    * Returns the value of the <code>personaRazonSocial</code> attribute.<br>
    * Model Attribute: <code>personaRazonSocial</code>. Variable String Size=254<br>
    * Comments: <br>
    * @return The value of the <code>personaRazonSocial</code> attribute.
    */

    public String getPersonaRazonSocial()  {
    	String value;
        value =  personaRazonSocial;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>personaRazonSocial</code> attribute.<br>
    * Model Attribute: <code>personaRazonSocial</code>. Variable String Size=254<br>
    * Comments: <br>
    * @param personaRazonSocial The new value of the <code>personaRazonSocial</code> attribute.
    */
    public void setPersonaRazonSocial (String personaRazonSocial) {
        modifiedPersonaRazonSocial = true;
        this.personaRazonSocial = personaRazonSocial;
    }

   /**
    * Returns the value of the <code>modifiedPersonaRazonSocial</code> class property.<br>
    *
    * @return The value of the <code>modifiedPersonaRazonSocial</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPersonaRazonSocial() {
        return modifiedPersonaRazonSocial;
    }

   /**
    * Sets the value of the <code>modifiedPersonaRazonSocial</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaRazonSocial</code>.
    */
    public void setModifiedPersonaRazonSocial(boolean modified) {
        this.modifiedPersonaRazonSocial = modified;
    }

   /**
    * Returns the value of the <code>personadrvNombreCompleto</code> attribute.<br>
    * Model Attribute: <code>personadrvNombreCompleto</code>. Variable String Size=255<br>
    * Comments: <br>
    * @return The value of the <code>personadrvNombreCompleto</code> attribute.
    */

    @JsonIgnore
    public String getPersonadrvNombreCompleto()  {
    	String value;
        try {
            value = personadrvNombreCompletoDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Persona, Attribute: personadrvNombreCompleto");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>personaFechaNacimiento</code> attribute.<br>
    * Model Attribute: <code>personaFechaNacimiento</code>. Variable Date<br>
    * Comments: <br>
    * @return The value of the <code>personaFechaNacimiento</code> attribute.
    */

    public Date getPersonaFechaNacimiento()  {
    	Date value;
        value =  personaFechaNacimiento;
        return value;
    }

   /**
    * Sets the value of the <code>personaFechaNacimiento</code> attribute.<br>
    * Model Attribute: <code>personaFechaNacimiento</code>. Variable Date<br>
    * Comments: <br>
    * @param personaFechaNacimiento The new value of the <code>personaFechaNacimiento</code> attribute.
    */
    public void setPersonaFechaNacimiento (Date personaFechaNacimiento) {
        modifiedPersonaFechaNacimiento = true;
        this.personaFechaNacimiento = personaFechaNacimiento;
    }

   /**
    * Returns the value of the <code>modifiedPersonaFechaNacimiento</code> class property.<br>
    *
    * @return The value of the <code>modifiedPersonaFechaNacimiento</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPersonaFechaNacimiento() {
        return modifiedPersonaFechaNacimiento;
    }

   /**
    * Sets the value of the <code>modifiedPersonaFechaNacimiento</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaFechaNacimiento</code>.
    */
    public void setModifiedPersonaFechaNacimiento(boolean modified) {
        this.modifiedPersonaFechaNacimiento = modified;
    }

   /**
    * Returns the value of the <code>personaGenero</code> attribute.<br>
    * Model Attribute: <code>personaGenero</code>. Variable String Size=1<br>
    * Comments: F - Femenino, M - Masculino<br>
    * @return The value of the <code>personaGenero</code> attribute.
    */

    public String getPersonaGenero()  {
    	String value;
        value =  personaGenero;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>personaGenero</code> attribute.<br>
    * Model Attribute: <code>personaGenero</code>. Variable String Size=1<br>
    * Comments: F - Femenino, M - Masculino<br>
    * @param personaGenero The new value of the <code>personaGenero</code> attribute.
    */
    public void setPersonaGenero (String personaGenero) {
        modifiedPersonaGenero = true;
        this.personaGenero = personaGenero;
    }

   /**
    * Returns the value of the <code>modifiedPersonaGenero</code> class property.<br>
    *
    * @return The value of the <code>modifiedPersonaGenero</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPersonaGenero() {
        return modifiedPersonaGenero;
    }

   /**
    * Sets the value of the <code>modifiedPersonaGenero</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaGenero</code>.
    */
    public void setModifiedPersonaGenero(boolean modified) {
        this.modifiedPersonaGenero = modified;
    }

   /**
    * Returns the value of the <code>personaIndicadorExtranjero</code> attribute.<br>
    * Model Attribute: <code>personaIndicadorExtranjero</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>personaIndicadorExtranjero</code> attribute.
    */

    public Boolean getPersonaIndicadorExtranjero()  {
    	Boolean value;
        value =  personaIndicadorExtranjero;
        return value;
    }

   /**
    * Sets the value of the <code>personaIndicadorExtranjero</code> attribute.<br>
    * Model Attribute: <code>personaIndicadorExtranjero</code>. Variable Bool<br>
    * Comments: <br>
    * @param personaIndicadorExtranjero The new value of the <code>personaIndicadorExtranjero</code> attribute.
    */
    public void setPersonaIndicadorExtranjero (Boolean personaIndicadorExtranjero) {
        modifiedPersonaIndicadorExtranjero = true;
        this.personaIndicadorExtranjero = personaIndicadorExtranjero;
    }

   /**
    * Returns the value of the <code>modifiedPersonaIndicadorExtranjero</code> class property.<br>
    *
    * @return The value of the <code>modifiedPersonaIndicadorExtranjero</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPersonaIndicadorExtranjero() {
        return modifiedPersonaIndicadorExtranjero;
    }

   /**
    * Sets the value of the <code>modifiedPersonaIndicadorExtranjero</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaIndicadorExtranjero</code>.
    */
    public void setModifiedPersonaIndicadorExtranjero(boolean modified) {
        this.modifiedPersonaIndicadorExtranjero = modified;
    }

   /**
    * Returns the value of the <code>personaTelefonoFijo</code> attribute.<br>
    * Model Attribute: <code>personaTelefonoFijo</code>. Variable String Size=15<br>
    * Comments: <br>
    * @return The value of the <code>personaTelefonoFijo</code> attribute.
    */

    public String getPersonaTelefonoFijo()  {
    	String value;
        value =  personaTelefonoFijo;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>personaTelefonoFijo</code> attribute.<br>
    * Model Attribute: <code>personaTelefonoFijo</code>. Variable String Size=15<br>
    * Comments: <br>
    * @param personaTelefonoFijo The new value of the <code>personaTelefonoFijo</code> attribute.
    */
    public void setPersonaTelefonoFijo (String personaTelefonoFijo) {
        modifiedPersonaTelefonoFijo = true;
        this.personaTelefonoFijo = personaTelefonoFijo;
    }

   /**
    * Returns the value of the <code>modifiedPersonaTelefonoFijo</code> class property.<br>
    *
    * @return The value of the <code>modifiedPersonaTelefonoFijo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPersonaTelefonoFijo() {
        return modifiedPersonaTelefonoFijo;
    }

   /**
    * Sets the value of the <code>modifiedPersonaTelefonoFijo</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaTelefonoFijo</code>.
    */
    public void setModifiedPersonaTelefonoFijo(boolean modified) {
        this.modifiedPersonaTelefonoFijo = modified;
    }

   /**
    * Returns the value of the <code>personaTelefonoCelular</code> attribute.<br>
    * Model Attribute: <code>personaTelefonoCelular</code>. Variable String Size=15<br>
    * Comments: <br>
    * @return The value of the <code>personaTelefonoCelular</code> attribute.
    */

    public String getPersonaTelefonoCelular()  {
    	String value;
        value =  personaTelefonoCelular;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>personaTelefonoCelular</code> attribute.<br>
    * Model Attribute: <code>personaTelefonoCelular</code>. Variable String Size=15<br>
    * Comments: <br>
    * @param personaTelefonoCelular The new value of the <code>personaTelefonoCelular</code> attribute.
    */
    public void setPersonaTelefonoCelular (String personaTelefonoCelular) {
        modifiedPersonaTelefonoCelular = true;
        this.personaTelefonoCelular = personaTelefonoCelular;
    }

   /**
    * Returns the value of the <code>modifiedPersonaTelefonoCelular</code> class property.<br>
    *
    * @return The value of the <code>modifiedPersonaTelefonoCelular</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPersonaTelefonoCelular() {
        return modifiedPersonaTelefonoCelular;
    }

   /**
    * Sets the value of the <code>modifiedPersonaTelefonoCelular</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaTelefonoCelular</code>.
    */
    public void setModifiedPersonaTelefonoCelular(boolean modified) {
        this.modifiedPersonaTelefonoCelular = modified;
    }

   /**
    * Returns the value of the <code>personaCorreoElectronico</code> attribute.<br>
    * Model Attribute: <code>personaCorreoElectronico</code>. Variable String Size=100<br>
    * Comments: <br>
    * @return The value of the <code>personaCorreoElectronico</code> attribute.
    */

    public String getPersonaCorreoElectronico()  {
    	String value;
        value =  personaCorreoElectronico;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>personaCorreoElectronico</code> attribute.<br>
    * Model Attribute: <code>personaCorreoElectronico</code>. Variable String Size=100<br>
    * Comments: <br>
    * @param personaCorreoElectronico The new value of the <code>personaCorreoElectronico</code> attribute.
    */
    public void setPersonaCorreoElectronico (String personaCorreoElectronico) {
        modifiedPersonaCorreoElectronico = true;
        this.personaCorreoElectronico = personaCorreoElectronico;
    }

   /**
    * Returns the value of the <code>modifiedPersonaCorreoElectronico</code> class property.<br>
    *
    * @return The value of the <code>modifiedPersonaCorreoElectronico</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPersonaCorreoElectronico() {
        return modifiedPersonaCorreoElectronico;
    }

   /**
    * Sets the value of the <code>modifiedPersonaCorreoElectronico</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaCorreoElectronico</code>.
    */
    public void setModifiedPersonaCorreoElectronico(boolean modified) {
        this.modifiedPersonaCorreoElectronico = modified;
    }

   /**
    * Returns the value of the <code>personaTieneEPSSanitas</code> attribute.<br>
    * Model Attribute: <code>personaTieneEPSSanitas</code>. Variable Bool<br>
    * Comments: Valor que se recupera del CORE<br>
    * @return The value of the <code>personaTieneEPSSanitas</code> attribute.
    */

    public Boolean getPersonaTieneEPSSanitas()  {
    	Boolean value;
        value =  personaTieneEPSSanitas;
        return value;
    }

   /**
    * Sets the value of the <code>personaTieneEPSSanitas</code> attribute.<br>
    * Model Attribute: <code>personaTieneEPSSanitas</code>. Variable Bool<br>
    * Comments: Valor que se recupera del CORE<br>
    * @param personaTieneEPSSanitas The new value of the <code>personaTieneEPSSanitas</code> attribute.
    */
    public void setPersonaTieneEPSSanitas (Boolean personaTieneEPSSanitas) {
        modifiedPersonaTieneEPSSanitas = true;
        this.personaTieneEPSSanitas = personaTieneEPSSanitas;
    }

   /**
    * Returns the value of the <code>modifiedPersonaTieneEPSSanitas</code> class property.<br>
    *
    * @return The value of the <code>modifiedPersonaTieneEPSSanitas</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPersonaTieneEPSSanitas() {
        return modifiedPersonaTieneEPSSanitas;
    }

   /**
    * Sets the value of the <code>modifiedPersonaTieneEPSSanitas</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaTieneEPSSanitas</code>.
    */
    public void setModifiedPersonaTieneEPSSanitas(boolean modified) {
        this.modifiedPersonaTieneEPSSanitas = modified;
    }

   /**
    * Returns the value of the <code>personaRechazadoAfiliacion</code> attribute.<br>
    * Model Attribute: <code>personaRechazadoAfiliacion</code>. Variable String Size=50<br>
    * Comments: Valor que se recupera del CORE<br>
    * @return The value of the <code>personaRechazadoAfiliacion</code> attribute.
    */

    public String getPersonaRechazadoAfiliacion()  {
    	String value;
        value =  personaRechazadoAfiliacion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>personaRechazadoAfiliacion</code> attribute.<br>
    * Model Attribute: <code>personaRechazadoAfiliacion</code>. Variable String Size=50<br>
    * Comments: Valor que se recupera del CORE<br>
    * @param personaRechazadoAfiliacion The new value of the <code>personaRechazadoAfiliacion</code> attribute.
    */
    public void setPersonaRechazadoAfiliacion (String personaRechazadoAfiliacion) {
        modifiedPersonaRechazadoAfiliacion = true;
        this.personaRechazadoAfiliacion = personaRechazadoAfiliacion;
    }

   /**
    * Returns the value of the <code>modifiedPersonaRechazadoAfiliacion</code> class property.<br>
    *
    * @return The value of the <code>modifiedPersonaRechazadoAfiliacion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPersonaRechazadoAfiliacion() {
        return modifiedPersonaRechazadoAfiliacion;
    }

   /**
    * Sets the value of the <code>modifiedPersonaRechazadoAfiliacion</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaRechazadoAfiliacion</code>.
    */
    public void setModifiedPersonaRechazadoAfiliacion(boolean modified) {
        this.modifiedPersonaRechazadoAfiliacion = modified;
    }

   /**
    * Returns the value of the <code>personaDatosBasicosMod</code> attribute.<br>
    * Model Attribute: <code>personaDatosBasicosMod</code>. Variable Bool<br>
    * Comments: Se requiere colocar un indicador para que visualmente se  identifique a la persona a la cual se le modificaron sus datos básicos. Este indicador se debe visualizar en la opción de consulta de los documentos, para saber si deben validar el documento de identidad de esa persona a la cual se le modificaron datos básicos.<br>
    * @return The value of the <code>personaDatosBasicosMod</code> attribute.
    */

    public Boolean getPersonaDatosBasicosMod()  {
    	Boolean value;
        value =  personaDatosBasicosMod;
        return value;
    }

   /**
    * Sets the value of the <code>personaDatosBasicosMod</code> attribute.<br>
    * Model Attribute: <code>personaDatosBasicosMod</code>. Variable Bool<br>
    * Comments: Se requiere colocar un indicador para que visualmente se  identifique a la persona a la cual se le modificaron sus datos básicos. Este indicador se debe visualizar en la opción de consulta de los documentos, para saber si deben validar el documento de identidad de esa persona a la cual se le modificaron datos básicos.<br>
    * @param personaDatosBasicosMod The new value of the <code>personaDatosBasicosMod</code> attribute.
    */
    public void setPersonaDatosBasicosMod (Boolean personaDatosBasicosMod) {
        modifiedPersonaDatosBasicosMod = true;
        this.personaDatosBasicosMod = personaDatosBasicosMod;
    }

   /**
    * Returns the value of the <code>modifiedPersonaDatosBasicosMod</code> class property.<br>
    *
    * @return The value of the <code>modifiedPersonaDatosBasicosMod</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedPersonaDatosBasicosMod() {
        return modifiedPersonaDatosBasicosMod;
    }

   /**
    * Sets the value of the <code>modifiedPersonaDatosBasicosMod</code> class property.<br>
    * @param modified The new value of the <code>modifiedPersonaDatosBasicosMod</code>.
    */
    public void setModifiedPersonaDatosBasicosMod(boolean modified) {
        this.modifiedPersonaDatosBasicosMod = modified;
    }

   /**
    * Returns the value of the <code>personadrvRechazada</code> attribute.<br>
    * Model Attribute: <code>personadrvRechazada</code>. Variable Bool<br>
    * Comments: Indica que la persona está rechazada. El valor de RechazadoAfiliación es un texto y necesitamos saber si está rechazada o no. De momento lo hacemos con evaluaciones a piñón. CONFIRMAR<br>
    * @return The value of the <code>personadrvRechazada</code> attribute.
    */

    @JsonIgnore
    public Boolean getPersonadrvRechazada()  {
    	Boolean value;
        try {
            value = personadrvRechazadaDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Persona, Attribute: personadrvRechazada");
        }
        return value;
    }

   /**
    * Returns the value of the <code>personadrvTieneDirecciones</code> attribute.<br>
    * Model Attribute: <code>personadrvTieneDirecciones</code>. Variable Bool<br>
    * Comments: Sólo se usa en precondiciones para que funcione la anticipación<br>
    * @return The value of the <code>personadrvTieneDirecciones</code> attribute.
    */

    @JsonIgnore
    public Boolean getPersonadrvTieneDirecciones()  {
    	Boolean value;
        try {
            value = personadrvTieneDireccionesDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Persona, Attribute: personadrvTieneDirecciones");
        }
        return value;
    }

   /**
    * Returns the value of the <code>personadrvTipoNumDoc</code> attribute.<br>
    * Model Attribute: <code>personadrvTipoNumDoc</code>. Variable String Size=100<br>
    * Comments: <br>
    * @return The value of the <code>personadrvTipoNumDoc</code> attribute.
    */

    @JsonIgnore
    public String getPersonadrvTipoNumDoc()  {
    	String value;
        try {
            value = personadrvTipoNumDocDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Persona, Attribute: personadrvTipoNumDoc");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>personadrvVieneDeCORE</code> attribute.<br>
    * Model Attribute: <code>personadrvVieneDeCORE</code>. Variable Bool<br>
    * Comments: La persona ya existe en el CORE, lo sabremos porque tendrá código. <br>
    * @return The value of the <code>personadrvVieneDeCORE</code> attribute.
    */

    @JsonIgnore
    public Boolean getPersonadrvVieneDeCORE()  {
    	Boolean value;
        try {
            value = personadrvVieneDeCOREDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Persona, Attribute: personadrvVieneDeCORE");
        }
        return value;
    }

   /**
    * Returns the value of the <code>personadrvAddDocComoCont</code> attribute.<br>
    * Model Attribute: <code>personadrvAddDocComoCont</code>. Variable Bool<br>
    * Comments: Indica si la persona debe aparecer en la precarga de subir documentos como contratante de la solicitud.
Condiciones: 
 - Si es nuevo usuario
 - Si se indica Grupo asociado en la solicitud
 - GdC14: Req 22: Si es contrato nuevo familiar y el contratante es una razón social, debe habilitar el cargue de documento de identificación <br>
    * @return The value of the <code>personadrvAddDocComoCont</code> attribute.
    */

    @JsonIgnore
    public Boolean getPersonadrvAddDocComoCont()  {
    	Boolean value;
        try {
            value = personadrvAddDocComoContDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Persona, Attribute: personadrvAddDocComoCont");
        }
        return value;
    }

   /**
    * Returns the value of the <code>personadrvAddDocComoTitu</code> attribute.<br>
    * Model Attribute: <code>personadrvAddDocComoTitu</code>. Variable Bool<br>
    * Comments: Indica si la persona debe aparecer en la precarga de subir documentos como titular de la solicitud
Condiciones: 
 - Si es nuevo usuario
 - Al momento de crear una familia nueva dentro de un contrato colectivo o un contrato nuevo familiar y seleccionen que el titular es sin beneficios se debe habilitar el cargue del documento de identificación del titular<br>
    * @return The value of the <code>personadrvAddDocComoTitu</code> attribute.
    */

    @JsonIgnore
    public Boolean getPersonadrvAddDocComoTitu()  {
    	Boolean value;
        try {
            value = personadrvAddDocComoTituDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Persona, Attribute: personadrvAddDocComoTitu");
        }
        return value;
    }

    /**
     * Returns the instance of <code>Solicitud</code> related through the <code>SolicitudesContratante</code> role.
     * Model Relationship:
     * <code>[Solicitud] SolicitudesContratante 0:M  ------ 0:1  ContratantePersona [Persona]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Solicitud</code> related through the <code>SolicitudesContratante</code> role.
     */
    @JsonIgnore
    public Collection <Solicitud> getSolicitudesContratante() {
        return getSolicitudRepository().findByContratantePersona(this);
    }

    /**
     * Adds an instance of <code>Solicitud</code> related through the <code>SolicitudesContratante</code> role.
     * @param solicitudesContratante The instance to add to the <code>SolicitudesContratante</code> role.
     */
    public void add2SolicitudesContratante(Solicitud solicitudesContratante) {
        this.solicitudesContratante.add(solicitudesContratante);
    }
    /**
     * Removes an instance of <code>Solicitud</code> related through the <code>SolicitudesContratante</code> role.
     * @param solicitudesContratante The instance to be removed
     */
    public void removeFromSolicitudesContratante(Solicitud solicitudesContratante) {
    	this.solicitudesContratante.remove(solicitudesContratante);
    }
    /**
     * Sets instances of <code>Solicitud</code> related through the <code>SolicitudesContratante</code> role.
     * @param solicitudesContratante The new value for the <code>SolicitudesContratante</code> role.
     */
    public void setSolicitudesContratante(Collection < Solicitud > solicitudesContratante) {
        this.solicitudesContratante = solicitudesContratante;
    }

   /**
    * This method gets the attribute value <code>modifiedSolicitudesContratante</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedSolicitudesContratante</code> has been modified.
    */
    public boolean isModifiedSolicitudesContratante(){
        return modifiedSolicitudesContratante;
    }

    /**
     * Returns the instance of <code>Solicitud</code> related through the <code>SolicitudesTitular</code> role.
     * Model Relationship:
     * <code>[Solicitud] SolicitudesTitular 0:M  ------ 0:1  TitularPersona [Persona]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Solicitud</code> related through the <code>SolicitudesTitular</code> role.
     */
    @JsonIgnore
    public Collection <Solicitud> getSolicitudesTitular() {
        return getSolicitudRepository().findByTitularPersona(this);
    }

    /**
     * Adds an instance of <code>Solicitud</code> related through the <code>SolicitudesTitular</code> role.
     * @param solicitudesTitular The instance to add to the <code>SolicitudesTitular</code> role.
     */
    public void add2SolicitudesTitular(Solicitud solicitudesTitular) {
        this.solicitudesTitular.add(solicitudesTitular);
    }
    /**
     * Removes an instance of <code>Solicitud</code> related through the <code>SolicitudesTitular</code> role.
     * @param solicitudesTitular The instance to be removed
     */
    public void removeFromSolicitudesTitular(Solicitud solicitudesTitular) {
    	this.solicitudesTitular.remove(solicitudesTitular);
    }
    /**
     * Sets instances of <code>Solicitud</code> related through the <code>SolicitudesTitular</code> role.
     * @param solicitudesTitular The new value for the <code>SolicitudesTitular</code> role.
     */
    public void setSolicitudesTitular(Collection < Solicitud > solicitudesTitular) {
        this.solicitudesTitular = solicitudesTitular;
    }

   /**
    * This method gets the attribute value <code>modifiedSolicitudesTitular</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedSolicitudesTitular</code> has been modified.
    */
    public boolean isModifiedSolicitudesTitular(){
        return modifiedSolicitudesTitular;
    }

    /**
     * Returns the instance of <code>Direccion</code> related through the <code>Direcciones</code> role.
     * Model Relationship:
     * <code>[Direccion] Direcciones 0:M  ------ 0:1  Persona [Persona]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Direccion</code> related through the <code>Direcciones</code> role.
     */
    @JsonIgnore
    public Collection <Direccion> getDirecciones() {
        return getDireccionRepository().findByPersona(this);
    }

    /**
     * Adds an instance of <code>Direccion</code> related through the <code>Direcciones</code> role.
     * @param direcciones The instance to add to the <code>Direcciones</code> role.
     */
    public void add2Direcciones(Direccion direcciones) {
        this.direcciones.add(direcciones);
    }
    /**
     * Removes an instance of <code>Direccion</code> related through the <code>Direcciones</code> role.
     * @param direcciones The instance to be removed
     */
    public void removeFromDirecciones(Direccion direcciones) {
    	this.direcciones.remove(direcciones);
    }
    /**
     * Sets instances of <code>Direccion</code> related through the <code>Direcciones</code> role.
     * @param direcciones The new value for the <code>Direcciones</code> role.
     */
    public void setDirecciones(Collection < Direccion > direcciones) {
        this.direcciones = direcciones;
    }

   /**
    * This method gets the attribute value <code>modifiedDirecciones</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDirecciones</code> has been modified.
    */
    public boolean isModifiedDirecciones(){
        return modifiedDirecciones;
    }

    /**
     * Returns the instance of <code>Usuario</code> related through the <code>Usuarios</code> role.
     * Model Relationship:
     * <code>[Usuario] Usuarios 0:1  ------ 1:1  UsuarioPersona [Persona]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Usuario</code> related through the <code>Usuarios</code> role.
     */
    @JsonIgnore
    public Usuario getUsuarios() {
        if (usuarios == null) {
            List<Usuario> collection = getUsuarioRepository().findByUsuarioPersona(this);
            if (collection.isEmpty()) {
                usuarios = null;
            } else {
                usuarios = (Usuario)collection.toArray()[0];
            }
        }
        return (usuarios == null ? new Usuario(null) : usuarios);
    }

    /**
     * Adds an instance of <code>Usuario</code> related through the <code>Usuarios</code> role.
     * @param usuarios The instance to add to the <code>Usuarios</code> role.
     */
    public void add2Usuarios(Usuario usuarios) {
        this.usuarios = (usuarios == null  || usuarios.isNull() ? null : usuarios);
    }

   /**
    * This method gets the attribute value <code>modifiedUsuarios</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedUsuarios</code> has been modified.
    */
    public boolean isModifiedUsuarios(){
        return modifiedUsuarios;
    }

    /**
     * Returns the instance of <code>DocumentoG</code> related through the <code>DocumentosG</code> role.
     * Model Relationship:
     * <code>[DocumentoG] DocumentosG 0:M  ------ 1:1  Persona [Persona]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>DocumentoG</code> related through the <code>DocumentosG</code> role.
     */
    @JsonIgnore
    public Collection <DocumentoG> getDocumentosG() {
        return getDocumentoGRepository().findByPersona(this);
    }

    /**
     * Adds an instance of <code>DocumentoG</code> related through the <code>DocumentosG</code> role.
     * @param documentosG The instance to add to the <code>DocumentosG</code> role.
     */
    public void add2DocumentosG(DocumentoG documentosG) {
        this.documentosG.add(documentosG);
    }
    /**
     * Removes an instance of <code>DocumentoG</code> related through the <code>DocumentosG</code> role.
     * @param documentosG The instance to be removed
     */
    public void removeFromDocumentosG(DocumentoG documentosG) {
    	this.documentosG.remove(documentosG);
    }
    /**
     * Sets instances of <code>DocumentoG</code> related through the <code>DocumentosG</code> role.
     * @param documentosG The new value for the <code>DocumentosG</code> role.
     */
    public void setDocumentosG(Collection < DocumentoG > documentosG) {
        this.documentosG = documentosG;
    }

   /**
    * This method gets the attribute value <code>modifiedDocumentosG</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDocumentosG</code> has been modified.
    */
    public boolean isModifiedDocumentosG(){
        return modifiedDocumentosG;
    }

    /**
     * Returns the instance of <code>TipoIdentificacion</code> related through the <code>TipoIdentificacion</code> role.
     * Model Relationship:
     * <code>[TipoIdentificacion] TipoIdentificacion 1:1  ------ 0:M  Personas [Persona]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>TipoIdentificacion</code> related through the <code>TipoIdentificacion</code> role.
     */
    @JsonIgnore
    public TipoIdentificacion getTipoIdentificacion() {
        try {
            if (tipoIdentificacion != null && tipoIdentificacion.isNull()) {
                tipoIdentificacion = null;
            }
        } catch (Exception ex) {
            tipoIdentificacion = null;
        }
        if (tipoIdentificacion == null) {
            if (tipoIdentificacionTipoIdentificacionCodigo != null) {
                tipoIdentificacion = getTipoIdentificacionRepository().findById(tipoIdentificacionTipoIdentificacionCodigo).orElse(null);
            } else {
                tipoIdentificacion = null;
            }
        }
        return (tipoIdentificacion == null ? new TipoIdentificacion(null) : tipoIdentificacion);
    }

    /**
     * Adds an instance of <code>TipoIdentificacion</code> related through the <code>TipoIdentificacion</code> role.
     * @param tipoIdentificacion The instance to add to the <code>TipoIdentificacion</code> role.
     */
    public void add2TipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
        if (tipoIdentificacion == null || tipoIdentificacion.isNull()) {
            this.modifiedTipoIdentificacion = true;
            this.tipoIdentificacionTipoIdentificacionCodigo = null;
        } else {
            this.tipoIdentificacionTipoIdentificacionCodigo = tipoIdentificacion.getTipoIdentificacionCodigo();
        }
        this.tipoIdentificacion = (tipoIdentificacion == null  || tipoIdentificacion.isNull() ? null : tipoIdentificacion);
    }

   /**
    * This method gets the attribute value <code>modifiedTipoIdentificacion</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedTipoIdentificacion</code> has been modified.
    */
    public boolean isModifiedTipoIdentificacion(){
        return modifiedTipoIdentificacion;
    }

    /**
     * Returns the instance of <code>Departamento</code> related through the <code>DepartamentoNacimiento</code> role.
     * Model Relationship:
     * <code>[Departamento] DepartamentoNacimiento 0:1  ------ 0:M  Personas [Persona]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Departamento</code> related through the <code>DepartamentoNacimiento</code> role.
     */
    @JsonIgnore
    public Departamento getDepartamentoNacimiento() {
        try {
            if (departamentoNacimiento != null && departamentoNacimiento.isNull()) {
                departamentoNacimiento = null;
            }
        } catch (Exception ex) {
            departamentoNacimiento = null;
        }
        if (departamentoNacimiento == null) {
            if (departamentoDepartamentoNacimientoCodigo != null) {
                departamentoNacimiento = getDepartamentoRepository().findById(departamentoDepartamentoNacimientoCodigo).orElse(null);
            } else {
                departamentoNacimiento = null;
            }
        }
        return (departamentoNacimiento == null ? new Departamento(null) : departamentoNacimiento);
    }

    /**
     * Adds an instance of <code>Departamento</code> related through the <code>DepartamentoNacimiento</code> role.
     * @param departamentoNacimiento The instance to add to the <code>DepartamentoNacimiento</code> role.
     */
    public void add2DepartamentoNacimiento(Departamento departamentoNacimiento) {
        if (departamentoNacimiento == null || departamentoNacimiento.isNull()) {
            this.modifiedDepartamentoNacimiento = true;
            this.departamentoDepartamentoNacimientoCodigo = null;
        } else {
            this.departamentoDepartamentoNacimientoCodigo = departamentoNacimiento.getDepartamentoCodigo();
        }
        this.departamentoNacimiento = (departamentoNacimiento == null  || departamentoNacimiento.isNull() ? null : departamentoNacimiento);
    }

   /**
    * This method gets the attribute value <code>modifiedDepartamentoNacimiento</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDepartamentoNacimiento</code> has been modified.
    */
    public boolean isModifiedDepartamentoNacimiento(){
        return modifiedDepartamentoNacimiento;
    }

    /**
     * Returns the instance of <code>Municipio</code> related through the <code>MunicipioNacimiento</code> role.
     * Model Relationship:
     * <code>[Municipio] MunicipioNacimiento 0:1  ------ 0:M  Personas [Persona]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Municipio</code> related through the <code>MunicipioNacimiento</code> role.
     */
    @JsonIgnore
    public Municipio getMunicipioNacimiento() {
        try {
            if (municipioNacimiento != null && municipioNacimiento.isNull()) {
                municipioNacimiento = null;
            }
        } catch (Exception ex) {
            municipioNacimiento = null;
        }
        if (municipioNacimiento == null) {
            if (municipioMunicipioNacimientoCodigo != null) {
                municipioNacimiento = getMunicipioRepository().findById(municipioMunicipioNacimientoCodigo).orElse(null);
            } else {
                municipioNacimiento = null;
            }
        }
        return (municipioNacimiento == null ? new Municipio(null) : municipioNacimiento);
    }

    /**
     * Adds an instance of <code>Municipio</code> related through the <code>MunicipioNacimiento</code> role.
     * @param municipioNacimiento The instance to add to the <code>MunicipioNacimiento</code> role.
     */
    public void add2MunicipioNacimiento(Municipio municipioNacimiento) {
        if (municipioNacimiento == null || municipioNacimiento.isNull()) {
            this.modifiedMunicipioNacimiento = true;
            this.municipioMunicipioNacimientoCodigo = null;
        } else {
            this.municipioMunicipioNacimientoCodigo = municipioNacimiento.getMunicipioCodigo();
        }
        this.municipioNacimiento = (municipioNacimiento == null  || municipioNacimiento.isNull() ? null : municipioNacimiento);
    }

   /**
    * This method gets the attribute value <code>modifiedMunicipioNacimiento</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedMunicipioNacimiento</code> has been modified.
    */
    public boolean isModifiedMunicipioNacimiento(){
        return modifiedMunicipioNacimiento;
    }

    /**
     * Returns the instance of <code>EstadoCivil</code> related through the <code>EstadoCivil</code> role.
     * Model Relationship:
     * <code>[EstadoCivil] EstadoCivil 0:1  ------ 0:M  Personas [Persona]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>EstadoCivil</code> related through the <code>EstadoCivil</code> role.
     */
    @JsonIgnore
    public EstadoCivil getEstadoCivil() {
        try {
            if (estadoCivil != null && estadoCivil.isNull()) {
                estadoCivil = null;
            }
        } catch (Exception ex) {
            estadoCivil = null;
        }
        if (estadoCivil == null) {
            if (estadoCivilEstadoCivilCodigo != null) {
                estadoCivil = getEstadoCivilRepository().findById(estadoCivilEstadoCivilCodigo).orElse(null);
            } else {
                estadoCivil = null;
            }
        }
        return (estadoCivil == null ? new EstadoCivil(null) : estadoCivil);
    }

    /**
     * Adds an instance of <code>EstadoCivil</code> related through the <code>EstadoCivil</code> role.
     * @param estadoCivil The instance to add to the <code>EstadoCivil</code> role.
     */
    public void add2EstadoCivil(EstadoCivil estadoCivil) {
        if (estadoCivil == null || estadoCivil.isNull()) {
            this.modifiedEstadoCivil = true;
            this.estadoCivilEstadoCivilCodigo = null;
        } else {
            this.estadoCivilEstadoCivilCodigo = estadoCivil.getEstadoCivilCodigo();
        }
        this.estadoCivil = (estadoCivil == null  || estadoCivil.isNull() ? null : estadoCivil);
    }

   /**
    * This method gets the attribute value <code>modifiedEstadoCivil</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedEstadoCivil</code> has been modified.
    */
    public boolean isModifiedEstadoCivil(){
        return modifiedEstadoCivil;
    }

    /**
     * Returns the instance of <code>EstadoPersona</code> related through the <code>EstadoPersona</code> role.
     * Model Relationship:
     * <code>[EstadoPersona] EstadoPersona 0:1  ------ 0:M  Personas [Persona]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>EstadoPersona</code> related through the <code>EstadoPersona</code> role.
     */
    @JsonIgnore
    public EstadoPersona getEstadoPersona() {
        try {
            if (estadoPersona != null && estadoPersona.isNull()) {
                estadoPersona = null;
            }
        } catch (Exception ex) {
            estadoPersona = null;
        }
        if (estadoPersona == null) {
            if (estadoPersonaEstadoPersonaCodigo != null) {
                estadoPersona = getEstadoPersonaRepository().findById(estadoPersonaEstadoPersonaCodigo).orElse(null);
            } else {
                estadoPersona = null;
            }
        }
        return (estadoPersona == null ? new EstadoPersona(null) : estadoPersona);
    }

    /**
     * Adds an instance of <code>EstadoPersona</code> related through the <code>EstadoPersona</code> role.
     * @param estadoPersona The instance to add to the <code>EstadoPersona</code> role.
     */
    public void add2EstadoPersona(EstadoPersona estadoPersona) {
        if (estadoPersona == null || estadoPersona.isNull()) {
            this.modifiedEstadoPersona = true;
            this.estadoPersonaEstadoPersonaCodigo = null;
        } else {
            this.estadoPersonaEstadoPersonaCodigo = estadoPersona.getEstadoPersonaCodigo();
        }
        this.estadoPersona = (estadoPersona == null  || estadoPersona.isNull() ? null : estadoPersona);
    }

   /**
    * This method gets the attribute value <code>modifiedEstadoPersona</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedEstadoPersona</code> has been modified.
    */
    public boolean isModifiedEstadoPersona(){
        return modifiedEstadoPersona;
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
     * Computes the value of the <code>personadrvNombreCompleto</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>personadrvNombreCompleto</code> derived attribute.
     */
    public String personadrvNombreCompletoDerivations() {

        personadrvNombreCompleto = null;

        personadrvNombreCompletoDerivationsConditional1();
        personadrvNombreCompletoDerivationsDefault();
        return personadrvNombreCompleto;
    }

    private void personadrvNombreCompletoDerivationsConditional1() {
        if (personadrvNombreCompleto != null) return;
        // CONDITION: TipoPersona = \"N\"
        // EFFECT   : fuconcatenarConNulos(\"\", PrimerNombre) + fuconcatenarConNulos(\" \", SegundoNombre) + fuconcatenarConNulos(\" \", PrimerApellido) + fuconcatenarConNulos(\" \", SegundoApellido)
        boolean personadrvNombreCompletoCond = (this.getPersonaTipoPersona()).equals("N");
        if (personadrvNombreCompletoCond) {
            personadrvNombreCompleto = userFunctionsSrv.fuconcatenarConNulosFun("", this.getPersonaPrimerNombre()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getPersonaSegundoNombre()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getPersonaPrimerApellido()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getPersonaSegundoApellido());
        }
    }

    private void personadrvNombreCompletoDerivationsDefault() {
        if (personadrvNombreCompleto != null) return;
        // Default derivation
        // EFFECT   : RazonSocial
        personadrvNombreCompleto = this.getPersonaRazonSocial();
    }

    /**
     * Computes the value of the <code>personadrvRechazada</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>personadrvRechazada</code> derived attribute.
     */
    public Boolean personadrvRechazadaDerivations() {

        personadrvRechazada = null;

        personadrvRechazadaDerivationsConditional1();
        personadrvRechazadaDerivationsConditional2();
        personadrvRechazadaDerivationsDefault();
        return personadrvRechazada;
    }

    private void personadrvRechazadaDerivationsConditional1() {
        if (personadrvRechazada != null) return;
        // CONDITION: RechazadoAfiliacion = NULL
        // EFFECT   : FALSE
        boolean personadrvRechazadaCond = this.getPersonaRechazadoAfiliacion() == null;
        if (personadrvRechazadaCond) {
            personadrvRechazada = Boolean.FALSE;
        }
    }

    private void personadrvRechazadaDerivationsConditional2() {
        if (personadrvRechazada != null) return;
        // CONDITION: RechazadoAfiliacion LIKE \"%\" + \"NO\" + \"%\" + \"RECHAZADO\" + \"%\"
        // EFFECT   : FALSE
        boolean personadrvRechazadaCond = Utilities.like(this.getPersonaRechazadoAfiliacion(), "%" + "NO" + "%" + "RECHAZADO" + "%");
        if (personadrvRechazadaCond) {
            personadrvRechazada = Boolean.FALSE;
        }
    }

    private void personadrvRechazadaDerivationsDefault() {
        if (personadrvRechazada != null) return;
        // Default derivation
        // EFFECT   : TRUE
        personadrvRechazada = Boolean.TRUE;
    }

    /**
     * Computes the value of the <code>personadrvTieneDirecciones</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>personadrvTieneDirecciones</code> derived attribute.
     */
    public Boolean personadrvTieneDireccionesDerivations() throws SystemException {

        personadrvTieneDirecciones = null;

        personadrvTieneDireccionesDerivationsDefault();
        return personadrvTieneDirecciones;
    }

    private void personadrvTieneDireccionesDerivationsDefault() throws SystemException {
        if (personadrvTieneDirecciones != null) return;
        // Default derivation
        // EFFECT   : EXIST(Direcciones)
        personadrvTieneDirecciones = getPersonaRepository().assocOperator000(this);
    }

    /**
     * Computes the value of the <code>personadrvTipoNumDoc</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>personadrvTipoNumDoc</code> derived attribute.
     */
    public String personadrvTipoNumDocDerivations() {

        personadrvTipoNumDoc = null;

        personadrvTipoNumDocDerivationsDefault();
        return personadrvTipoNumDoc;
    }

    private void personadrvTipoNumDocDerivationsDefault() {
        if (personadrvTipoNumDoc != null) return;
        // Default derivation
        // EFFECT   : TipoIdentificacion.NombreCorto + \" - \" + NumIdentificacion
        personadrvTipoNumDoc = this.getTipoIdentificacion().getTipoIdentificacionNombreCorto() + " - " + this.getPersonaNumIdentificacion();
    }

    /**
     * Computes the value of the <code>personadrvVieneDeCORE</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>personadrvVieneDeCORE</code> derived attribute.
     */
    public Boolean personadrvVieneDeCOREDerivations() {

        personadrvVieneDeCORE = null;

        personadrvVieneDeCOREDerivationsDefault();
        return personadrvVieneDeCORE;
    }

    private void personadrvVieneDeCOREDerivationsDefault() {
        if (personadrvVieneDeCORE != null) return;
        // Default derivation
        // EFFECT   : Codigo <> NULL AND Codigo <> 0
        personadrvVieneDeCORE = this.getPersonaCodigo() != null && !(this.getPersonaCodigo()).equals(Long.valueOf(0));
    }

    /**
     * Computes the value of the <code>personadrvAddDocComoCont</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>personadrvAddDocComoCont</code> derived attribute.
     */
    public Boolean personadrvAddDocComoContDerivations() throws SystemException {

        personadrvAddDocComoCont = null;

        personadrvAddDocComoContDerivationsConditional1();
        personadrvAddDocComoContDerivationsConditional2();
        personadrvAddDocComoContDerivationsConditional3();
        personadrvAddDocComoContDerivationsDefault();
        return personadrvAddDocComoCont;
    }

    private void personadrvAddDocComoContDerivationsConditional1() {
        if (personadrvAddDocComoCont != null) return;
        // CONDITION: Codigo = NULL OR Codigo = 0
        // EFFECT   : TRUE
        boolean personadrvAddDocComoContCond = this.getPersonaCodigo() == null || (this.getPersonaCodigo()).equals(Long.valueOf(0));
        if (personadrvAddDocComoContCond) {
            personadrvAddDocComoCont = Boolean.TRUE;
        }
    }

    private void personadrvAddDocComoContDerivationsConditional2() throws SystemException {
        if (personadrvAddDocComoCont != null) return;
        // CONDITION: EXIST( SolicitudesContratante.GrupoAsociado ) = true
        // EFFECT   : TRUE
        boolean personadrvAddDocComoContCond = getPersonaRepository().assocOperator001(this).equals(true);
        if (personadrvAddDocComoContCond) {
            personadrvAddDocComoCont = Boolean.TRUE;
        }
    }

    private void personadrvAddDocComoContDerivationsConditional3() throws SystemException {
        if (personadrvAddDocComoCont != null) return;
        // CONDITION: EXIST( SolicitudesContratante ) WHERE (SolicitudesContratante.Tramite = 2) = true AND TipoIdentificacion.NIT = true
        // EFFECT   : TRUE
        boolean personadrvAddDocComoContCond = getPersonaRepository().assocOperator002(this).equals(true) && this.getTipoIdentificacion().getTipoIdentificacionNIT().equals(true);
        if (personadrvAddDocComoContCond) {
            personadrvAddDocComoCont = Boolean.TRUE;
        }
    }

    private void personadrvAddDocComoContDerivationsDefault() {
        if (personadrvAddDocComoCont != null) return;
        // Default derivation
        // EFFECT   : FALSE
        personadrvAddDocComoCont = Boolean.FALSE;
    }

    /**
     * Computes the value of the <code>personadrvAddDocComoTitu</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>personadrvAddDocComoTitu</code> derived attribute.
     */
    public Boolean personadrvAddDocComoTituDerivations() throws SystemException {

        personadrvAddDocComoTitu = null;

        personadrvAddDocComoTituDerivationsConditional1();
        personadrvAddDocComoTituDerivationsConditional2();
        personadrvAddDocComoTituDerivationsConditional3();
        personadrvAddDocComoTituDerivationsDefault();
        return personadrvAddDocComoTitu;
    }

    private void personadrvAddDocComoTituDerivationsConditional1() {
        if (personadrvAddDocComoTitu != null) return;
        // CONDITION: Codigo = NULL OR Codigo = 0
        // EFFECT   : TRUE
        boolean personadrvAddDocComoTituCond = this.getPersonaCodigo() == null || (this.getPersonaCodigo()).equals(Long.valueOf(0));
        if (personadrvAddDocComoTituCond) {
            personadrvAddDocComoTitu = Boolean.TRUE;
        }
    }

    private void personadrvAddDocComoTituDerivationsConditional2() throws SystemException {
        if (personadrvAddDocComoTitu != null) return;
        // CONDITION: EXIST( SolicitudesTitular ) WHERE (SolicitudesTitular.Tramite = 1) = true
        // EFFECT   : TRUE
        boolean personadrvAddDocComoTituCond = getPersonaRepository().assocOperator003(this).equals(true);
        if (personadrvAddDocComoTituCond) {
            personadrvAddDocComoTitu = Boolean.TRUE;
        }
    }

    private void personadrvAddDocComoTituDerivationsConditional3() throws SystemException {
        if (personadrvAddDocComoTitu != null) return;
        // CONDITION: EXIST( SolicitudesTitular ) WHERE (SolicitudesTitular.Tramite <> 1 AND SolicitudesTitular.NumFamilia = NULL) = true
        // EFFECT   : TRUE
        boolean personadrvAddDocComoTituCond = getPersonaRepository().assocOperator004(this).equals(true);
        if (personadrvAddDocComoTituCond) {
            personadrvAddDocComoTitu = Boolean.TRUE;
        }
    }

    private void personadrvAddDocComoTituDerivationsDefault() {
        if (personadrvAddDocComoTitu != null) return;
        // Default derivation
        // EFFECT   : FALSE
        personadrvAddDocComoTitu = Boolean.FALSE;
    }
    /**
     * This method initializes the properties of the entity and its relations.
     */
    private void initAttributes() {
        personaCodigo = null;
        personaNumIdentificacion = "";
        personaTipoPersona = "";
        personaPrimerNombre = null;
        personaSegundoNombre = null;
        personaPrimerApellido = null;
        personaSegundoApellido = null;
        personaRazonSocial = null;
        personaFechaNacimiento = null;
        personaGenero = null;
        personaIndicadorExtranjero = null;
        personaTelefonoFijo = null;
        personaTelefonoCelular = null;
        personaCorreoElectronico = null;
        personaTieneEPSSanitas = null;
        personaRechazadoAfiliacion = null;
        personaDatosBasicosMod = false;
        solicitudesContratante = null;
        solicitudesTitular = null;
        direcciones = null;
        usuarios = null;
        documentosG = null;
        tipoIdentificacion = null;
        departamentoNacimiento = null;
        municipioNacimiento = null;
        estadoCivil = null;
        estadoPersona = null;
        values = new HashMap<>();
        userFunctionsSrv = Arc.container().select(UserFunctions.class).get();

        clearModifiedFlags();
    }

    public PersonaJpaRepository getPersonaRepository() {
        return Arc.container().select(PersonaJpaRepository.class).get();
    }
    public SolicitudJpaRepository getSolicitudRepository() {
        return Arc.container().select(SolicitudJpaRepository.class).get();
    }
    public DireccionJpaRepository getDireccionRepository() {
        return Arc.container().select(DireccionJpaRepository.class).get();
    }
    public UsuarioJpaRepository getUsuarioRepository() {
        return Arc.container().select(UsuarioJpaRepository.class).get();
    }
    public DocumentoGJpaRepository getDocumentoGRepository() {
        return Arc.container().select(DocumentoGJpaRepository.class).get();
    }
    public TipoIdentificacionJpaRepository getTipoIdentificacionRepository() {
        return Arc.container().select(TipoIdentificacionJpaRepository.class).get();
    }
    public DepartamentoJpaRepository getDepartamentoRepository() {
        return Arc.container().select(DepartamentoJpaRepository.class).get();
    }
    public MunicipioJpaRepository getMunicipioRepository() {
        return Arc.container().select(MunicipioJpaRepository.class).get();
    }
    public EstadoCivilJpaRepository getEstadoCivilRepository() {
        return Arc.container().select(EstadoCivilJpaRepository.class).get();
    }
    public EstadoPersonaJpaRepository getEstadoPersonaRepository() {
        return Arc.container().select(EstadoPersonaJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return Persona.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return PersonaConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedPersonaCodigo = false;
    	values.put("personaCodigo", getPersonaCodigo());
    	modifiedPersonaNumIdentificacion = false;
    	values.put("personaNumIdentificacion", getPersonaNumIdentificacion());
    	modifiedPersonaTipoPersona = false;
    	values.put("personaTipoPersona", getPersonaTipoPersona());
    	modifiedPersonaPrimerNombre = false;
    	values.put("personaPrimerNombre", getPersonaPrimerNombre());
    	modifiedPersonaSegundoNombre = false;
    	values.put("personaSegundoNombre", getPersonaSegundoNombre());
    	modifiedPersonaPrimerApellido = false;
    	values.put("personaPrimerApellido", getPersonaPrimerApellido());
    	modifiedPersonaSegundoApellido = false;
    	values.put("personaSegundoApellido", getPersonaSegundoApellido());
    	modifiedPersonaRazonSocial = false;
    	values.put("personaRazonSocial", getPersonaRazonSocial());
    	modifiedPersonaFechaNacimiento = false;
    	values.put("personaFechaNacimiento", getPersonaFechaNacimiento());
    	modifiedPersonaGenero = false;
    	values.put("personaGenero", getPersonaGenero());
    	modifiedPersonaIndicadorExtranjero = false;
    	values.put("personaIndicadorExtranjero", getPersonaIndicadorExtranjero());
    	modifiedPersonaTelefonoFijo = false;
    	values.put("personaTelefonoFijo", getPersonaTelefonoFijo());
    	modifiedPersonaTelefonoCelular = false;
    	values.put("personaTelefonoCelular", getPersonaTelefonoCelular());
    	modifiedPersonaCorreoElectronico = false;
    	values.put("personaCorreoElectronico", getPersonaCorreoElectronico());
    	modifiedPersonaTieneEPSSanitas = false;
    	values.put("personaTieneEPSSanitas", getPersonaTieneEPSSanitas());
    	modifiedPersonaRechazadoAfiliacion = false;
    	values.put("personaRechazadoAfiliacion", getPersonaRechazadoAfiliacion());
    	modifiedPersonaDatosBasicosMod = false;
    	values.put("personaDatosBasicosMod", getPersonaDatosBasicosMod());
    	modifiedSolicitudesContratante = false;
    	modifiedSolicitudesTitular = false;
    	modifiedDirecciones = false;
    	modifiedUsuarios = false;
    	modifiedDocumentosG = false;
    	modifiedTipoIdentificacion = false;
    	modifiedDepartamentoNacimiento = false;
    	modifiedMunicipioNacimiento = false;
    	modifiedEstadoCivil = false;
    	modifiedEstadoPersona = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
            personadrvNombreCompleto = null;
            personadrvRechazada = null;
            personadrvTieneDirecciones = null;
            personadrvTipoNumDoc = null;
            personadrvVieneDeCORE = null;
            personadrvAddDocComoCont = null;
            personadrvAddDocComoTitu = null;
    }

    /**
     * Returns the <code>PersonaOid</code> object that identifies this instance of <code>Persona</code>.
     * @return <code>PersonaOid </code> object that identifies this instance of <code>Persona</code>
     */
	@Override
    public PersonaOid getOid() {
        return new PersonaOid(getPersonaIdentificador());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(PersonaConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(PersonaConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.PERSONA)) {
            // Add this class
            activeFacets.add(Constants.PERSONA);
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


        if (getAgent().isFacetActive(Constants.FUNCIONARIO) || getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.ASESOR) || getAgent().isFacetActive(Constants.AREAMEDICA) || getAgent().isFacetActive(Constants.AFILIACIONES) || getAgent().isFacetActive(Constants.RESPREGIONAL) || getAgent().isFacetActive(Constants.GESTOR) || getAgent().isFacetActive(Constants.MESADEAPOYO)) {
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

    public String buildICPersona() {
        try {
            return getTipoIdentificacion().getTipoIdentificacionNombreCorto() + " " + getPersonaNumIdentificacion();
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSPersonaPIU() {
        try {
            return getTipoIdentificacion().getTipoIdentificacionNombreCorto() + " " + getPersonaNumIdentificacion() + " " + getPersonaPrimerNombre() + " " + getPersonaSegundoNombre() + " " + getPersonaPrimerApellido() + " " + getPersonaSegundoApellido() + " " + (getPersonaFechaNacimiento() != null ? getPersonaFechaNacimiento().toString() : "") + " " + getPersonaGenero() + " " + getPersonaRazonSocial();
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildIC2Persona() {
        try {
            return getPersonadrvNombreCompleto();
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildICPersonaNombresApellidos() {
        try {
            return getPersonaRazonSocial() + " " + getPersonaPrimerNombre() + " " + getPersonaSegundoNombre() + " " + getPersonaPrimerApellido() + " " + getPersonaSegundoApellido();
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
            relatedInstance = buildPersonaRelatedInstance(relatedInstanceJsonOid);
        }
        if (PersonaConstants.ROLE_NAME_SOLICITUDESCONTRATANTE.equalsIgnoreCase(relatedInstancePathFirstItem) || PersonaConstants.ROLE_NAME_SOLICITUDESTITULAR.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaConstants.ROLE_NAME_DIRECCIONES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaRelatedInstance4Direccion(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaConstants.ROLE_NAME_USUARIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaRelatedInstance4Usuario(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaConstants.ROLE_NAME_DOCUMENTOSG.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaRelatedInstance4DocumentoG(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaConstants.ROLE_NAME_TIPOIDENTIFICACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaRelatedInstance4TipoIdentificacion(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaConstants.ROLE_NAME_DEPARTAMENTONACIMIENTO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaRelatedInstance4Departamento(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaConstants.ROLE_NAME_MUNICIPIONACIMIENTO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaRelatedInstance4Municipio(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaConstants.ROLE_NAME_ESTADOCIVIL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaRelatedInstance4EstadoCivil(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaConstants.ROLE_NAME_ESTADOPERSONA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaRelatedInstance4EstadoPersona(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildPersonaRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Persona(mapper.readValue(relatedInstanceJsonOid, PersonaOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Persona.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPersonaRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Persona.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPersonaRelatedInstance4Direccion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Direccion(mapper.readValue(relatedInstanceJsonOid, DireccionOid.class)): Direccion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Persona.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPersonaRelatedInstance4Usuario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Usuario(mapper.readValue(relatedInstanceJsonOid, UsuarioOid.class)): Usuario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Persona.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPersonaRelatedInstance4DocumentoG(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DocumentoG(mapper.readValue(relatedInstanceJsonOid, DocumentoGOid.class)): DocumentoG.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Persona.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPersonaRelatedInstance4TipoIdentificacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class)): TipoIdentificacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Persona.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPersonaRelatedInstance4Departamento(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Departamento(mapper.readValue(relatedInstanceJsonOid, DepartamentoOid.class)): Departamento.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Persona.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPersonaRelatedInstance4Municipio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class)): Municipio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Persona.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPersonaRelatedInstance4EstadoCivil(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new EstadoCivil(mapper.readValue(relatedInstanceJsonOid, EstadoCivilOid.class)): EstadoCivil.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Persona.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPersonaRelatedInstance4EstadoPersona(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new EstadoPersona(mapper.readValue(relatedInstanceJsonOid, EstadoPersonaOid.class)): EstadoPersona.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Persona.class).error(e.getMessage());
            return null;
        }
    }
}
