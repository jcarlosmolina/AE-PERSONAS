package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.ContratanteConstants;
import com.keralty.aepersonas.global.DepartamentoConstants;
import com.keralty.aepersonas.global.MunicipioConstants;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.global.TipoIdentificacionConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.repository.DepartamentoJpaRepository;
import com.keralty.aepersonas.repository.MunicipioJpaRepository;
import com.keralty.aepersonas.repository.SolicitudJpaRepository;
import com.keralty.aepersonas.repository.TipoIdentificacionJpaRepository;
import io.quarkus.arc.Arc;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
 * Persistent representation of the <code>Contratante</code> model class.
 * <p>
 * Model Class: <code>Contratante</code><br>
 */
@Entity(name = ContratanteConstants.CLASS_NAME)
@Table(name = ContratanteConstants.TBL_NAME)
public class Contratante extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient SolicitudJpaRepository solicitudRepository;

    @JsonIgnore
    private transient TipoIdentificacionJpaRepository tipoIdentificacionRepository;

    @JsonIgnore
    private transient DepartamentoJpaRepository departamentoRepository;

    @JsonIgnore
    private transient MunicipioJpaRepository municipioRepository;

    private transient UserFunctions userFunctionsSrv;

    /** Class identification function. */
    @Id
    @Column(name = ContratanteConstants.FLD_AESOLICITUDESIDSOLICITUD, insertable = false, updatable = false )
    @JsonProperty(value="id_solicitud")
    private Long aesolicitudesidsolicitud;

    /** Class member attribute. */
    @Column(name = ContratanteConstants.FLD_CONTRATANTECODIGO )
    @JsonProperty(value="codigo")
    private Long contratanteCodigo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratanteCodigo;

    /** Class member attribute. */
    @Column(name = ContratanteConstants.FLD_CONTRATANTENUMIDENTIFICACION )
    @JsonProperty(value="numidentificacion")
    private String contratanteNumIdentificacion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratanteNumIdentificacion;

    /** Class member attribute. */
    @Column(name = ContratanteConstants.FLD_CONTRATANTETIPOPERSONA )
    @JsonProperty(value="tipopersona")
    private String contratanteTipoPersona;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratanteTipoPersona;

    /** Class member attribute. */
    @Column(name = ContratanteConstants.FLD_CONTRATANTEPRIMERNOMBRE )
    @JsonProperty(value="primernombre")
    private String contratantePrimerNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratantePrimerNombre;

    /** Class member attribute. */
    @Column(name = ContratanteConstants.FLD_CONTRATANTESEGUNDONOMBRE )
    @JsonProperty(value="segundonombre")
    private String contratanteSegundoNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratanteSegundoNombre;

    /** Class member attribute. */
    @Column(name = ContratanteConstants.FLD_CONTRATANTEPRIMERAPELLIDO )
    @JsonProperty(value="primerapellido")
    private String contratantePrimerApellido;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratantePrimerApellido;

    /** Class member attribute. */
    @Column(name = ContratanteConstants.FLD_CONTRATANTESEGUNDOAPELLIDO )
    @JsonProperty(value="segundoapellido")
    private String contratanteSegundoApellido;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratanteSegundoApellido;

    /** Class member attribute. */
    @Column(name = ContratanteConstants.FLD_CONTRATANTERAZONSOCIAL )
    @JsonProperty(value="razonsocial")
    private String contratanteRazonSocial;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratanteRazonSocial;

    /** Class member attribute. */
    @Column(name = ContratanteConstants.FLD_CONTRATANTEFECHANACIMIENTO )
    @JsonProperty(value="fechanacimiento")
    private Date contratanteFechaNacimiento;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratanteFechaNacimiento;

    /** Class member attribute. */
    @Column(name = ContratanteConstants.FLD_CONTRATANTEGENERO )
    @JsonProperty(value="genero")
    private String contratanteGenero;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratanteGenero;

    /** Class member attribute. */
    @Column(name = ContratanteConstants.FLD_CONTRATANTEINDICADOREXTRANJERO )
    @JsonProperty(value="indicadorextranjero")
    private Boolean contratanteIndicadorExtranjero;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratanteIndicadorExtranjero;

    /** Class member attribute. */
    @Column(name = ContratanteConstants.FLD_CONTRATANTETELEFONOFIJO )
    @JsonProperty(value="telefonofijo")
    private String contratanteTelefonoFijo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratanteTelefonoFijo;

    /** Class member attribute. */
    @Column(name = ContratanteConstants.FLD_CONTRATANTETELEFONOCELULAR )
    @JsonProperty(value="telefonocelular")
    private String contratanteTelefonoCelular;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratanteTelefonoCelular;

    /** Class member attribute. */
    @Column(name = ContratanteConstants.FLD_CONTRATANTECORREOELECTRONICO )
    @JsonProperty(value="correoelectronico")
    private String contratanteCorreoElectronico;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratanteCorreoElectronico;

    /** Class member attribute. */
    @Column(name = ContratanteConstants.FLD_CONTRATANTETITULARCONBENEFICIOS )
    @JsonProperty(value="titularconbeneficios")
    private Boolean contratanteTitularConBeneficios;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratanteTitularConBeneficios;

    /** Class member attribute. */
    @Column(name = ContratanteConstants.FLD_CONTRATANTEDIPLOMATICO )
    @JsonProperty(value="diplomatico")
    private Boolean contratanteDiplomatico;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratanteDiplomatico;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvidentificacion")
    protected String contratantedrvIdentificacion;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvnombrecompleto")
    protected String contratantedrvNombreCompleto;

    /** Class member attribute. */
    @Column(name = ContratanteConstants.FLD_CONTRATANTEDIRECCIONRES )
    @JsonProperty(value="direccionres")
    private String contratanteDireccionRes;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratanteDireccionRes;

    /** Class member attribute. */
    @Column(name = ContratanteConstants.FLD_CONTRATANTETELEFONOFIJORES )
    @JsonProperty(value="telefonofijores")
    private String contratanteTelefonoFijoRes;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratanteTelefonoFijoRes;

    /** Class member attribute. */
    @Column(name = ContratanteConstants.FLD_CONTRATANTETELEFONOCELULARRES )
    @JsonProperty(value="telefonocelularres")
    private String contratanteTelefonoCelularRes;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratanteTelefonoCelularRes;

    /** Class member attribute. */
    @Column(name = ContratanteConstants.FLD_CONTRATANTERURALDIRRES )
    @JsonProperty(value="ruraldirres")
    private Boolean contratanteRuralDirRes;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratanteRuralDirRes;

    /** Class member attribute. */
    @Column(name = ContratanteConstants.FLD_CONTRATANTETITULARCONBENEFICIOSCORE )
    @JsonProperty(value="titularconbeneficioscore")
    private Boolean contratanteTitularConBeneficiosCORE;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratanteTitularConBeneficiosCORE;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvbeneficiosactivo")
    protected Boolean contratantedrvBeneficiosActivo;

    /** Class member attribute. */
    @Column(name = ContratanteConstants.FLD_CONTRATANTEDIRECCIONESMODIFICADAS )
    @JsonProperty(value="direccionesmodificadas")
    private Boolean contratanteDireccionesModificadas;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratanteDireccionesModificadas;

    /** Related Class. */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=ContratanteConstants.FLD_AESOLICITUDESIDSOLICITUD, referencedColumnName=SolicitudConstants.FLD_AESOLICITUDESIDSOLICITUD, insertable = false, updatable = false)
    })
    @JsonIgnore
    private Solicitud solicitud;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitud;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=ContratanteConstants.FLD_TIPOIDENTIFICACIONTIPOIDENTIFICACIONCODIGO, referencedColumnName=TipoIdentificacionConstants.FLD_TIPOIDENTIFICACIONCODIGO)
    })
    @JsonIgnore
    private TipoIdentificacion tipoIdentificacion;
    /** Related attribute. */
    @Column(name = ContratanteConstants.FLD_TIPOIDENTIFICACIONTIPOIDENTIFICACIONCODIGO, insertable = false, updatable = false)
    private Long tipoIdentificacionTipoIdentificacionCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoIdentificacion;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=ContratanteConstants.FLD_DEPARTAMENTODEPARTAMENTONACCODIGO, referencedColumnName=DepartamentoConstants.FLD_DEPARTAMENTOCODIGO)
    })
    @JsonIgnore
    private Departamento departamentoNac;
    /** Related attribute. */
    @Column(name = ContratanteConstants.FLD_DEPARTAMENTODEPARTAMENTONACCODIGO, insertable = false, updatable = false)
    private Long departamentoDepartamentoNacCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDepartamentoNac;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=ContratanteConstants.FLD_MUNICIPIOMUNICIPIONACCODIGO, referencedColumnName=MunicipioConstants.FLD_MUNICIPIOCODIGO)
    })
    @JsonIgnore
    private Municipio municipioNac;
    /** Related attribute. */
    @Column(name = ContratanteConstants.FLD_MUNICIPIOMUNICIPIONACCODIGO, insertable = false, updatable = false)
    private Long municipioMunicipioNacCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedMunicipioNac;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=ContratanteConstants.FLD_DEPARTAMENTODEPARTAMENTORESCODIGO, referencedColumnName=DepartamentoConstants.FLD_DEPARTAMENTOCODIGO)
    })
    @JsonIgnore
    private Departamento departamentoRes;
    /** Related attribute. */
    @Column(name = ContratanteConstants.FLD_DEPARTAMENTODEPARTAMENTORESCODIGO, insertable = false, updatable = false)
    private Long departamentoDepartamentoResCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDepartamentoRes;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=ContratanteConstants.FLD_MUNICIPIOMUNICIPIORESCODIGO, referencedColumnName=MunicipioConstants.FLD_MUNICIPIOCODIGO)
    })
    @JsonIgnore
    private Municipio municipioRes;
    /** Related attribute. */
    @Column(name = ContratanteConstants.FLD_MUNICIPIOMUNICIPIORESCODIGO, insertable = false, updatable = false)
    private Long municipioMunicipioResCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedMunicipioRes;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public Contratante() {
        aesolicitudesidsolicitud = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>Contratante</code>.
     * @param oid Object Identifier of the instance of <code>Contratante</code> to be created.
     * @throws SystemException
     */
    public Contratante(ContratanteOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            aesolicitudesidsolicitud = oid.getAesolicitudesidsolicitud();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>aesolicitudesidsolicitud</code> attribute<br>in class <code>Aesolicitudes</code> through <code>Solicitud.Ae_solicitudes</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Aesolicitudes</code>
     * @return The value of the <code>aesolicitudesidsolicitud</code> attribute<br>in class <code>Aesolicitudes</code> through <code>Solicitud.Ae_solicitudes</code>.
     */
    public Long getAesolicitudesidsolicitud() {
        return aesolicitudesidsolicitud;
    }

    /**
     * Sets the value of the <code>aesolicitudesidsolicitud</code> attribute<br>in class <code>Aesolicitudes</code> through <code>Solicitud.Ae_solicitudes</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Aesolicitudes</code>
     * @param aesolicitudesidsolicitud The new value of the <code>aesolicitudesidsolicitud</code> attribute<br>in class <code>Aesolicitudes</code> through <code>Solicitud.Ae_solicitudes</code>.
     */
    public void setAesolicitudesidsolicitud(Long aesolicitudesidsolicitud) {
        this.aesolicitudesidsolicitud = aesolicitudesidsolicitud;
    }

   /**
    * Returns the value of the <code>contratanteCodigo</code> attribute.<br>
    * Model Attribute: <code>contratanteCodigo</code>. Variable Int<br>
    * Comments: Este es el código de persona que en el CORE<br>
    * @return The value of the <code>contratanteCodigo</code> attribute.
    */

    public Long getContratanteCodigo()  {
    	Long value;
        value =  contratanteCodigo;
        return value;
    }

   /**
    * Sets the value of the <code>contratanteCodigo</code> attribute.<br>
    * Model Attribute: <code>contratanteCodigo</code>. Variable Int<br>
    * Comments: Este es el código de persona que en el CORE<br>
    * @param contratanteCodigo The new value of the <code>contratanteCodigo</code> attribute.
    */
    public void setContratanteCodigo (Long contratanteCodigo) {
        modifiedContratanteCodigo = true;
        this.contratanteCodigo = contratanteCodigo;
    }

   /**
    * Returns the value of the <code>modifiedContratanteCodigo</code> class property.<br>
    *
    * @return The value of the <code>modifiedContratanteCodigo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedContratanteCodigo() {
        return modifiedContratanteCodigo;
    }

   /**
    * Sets the value of the <code>modifiedContratanteCodigo</code> class property.<br>
    * @param modified The new value of the <code>modifiedContratanteCodigo</code>.
    */
    public void setModifiedContratanteCodigo(boolean modified) {
        this.modifiedContratanteCodigo = modified;
    }

   /**
    * Returns the value of the <code>contratanteNumIdentificacion</code> attribute.<br>
    * Model Attribute: <code>contratanteNumIdentificacion</code>. Variable String Size=60<br>
    * Comments: <br>
    * @return The value of the <code>contratanteNumIdentificacion</code> attribute.
    */

    public String getContratanteNumIdentificacion()  {
    	String value;
        value =  contratanteNumIdentificacion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>contratanteNumIdentificacion</code> attribute.<br>
    * Model Attribute: <code>contratanteNumIdentificacion</code>. Variable String Size=60<br>
    * Comments: <br>
    * @param contratanteNumIdentificacion The new value of the <code>contratanteNumIdentificacion</code> attribute.
    */
    public void setContratanteNumIdentificacion (String contratanteNumIdentificacion) {
        modifiedContratanteNumIdentificacion = true;
        this.contratanteNumIdentificacion = contratanteNumIdentificacion;
    }

   /**
    * Returns the value of the <code>modifiedContratanteNumIdentificacion</code> class property.<br>
    *
    * @return The value of the <code>modifiedContratanteNumIdentificacion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedContratanteNumIdentificacion() {
        return modifiedContratanteNumIdentificacion;
    }

   /**
    * Sets the value of the <code>modifiedContratanteNumIdentificacion</code> class property.<br>
    * @param modified The new value of the <code>modifiedContratanteNumIdentificacion</code>.
    */
    public void setModifiedContratanteNumIdentificacion(boolean modified) {
        this.modifiedContratanteNumIdentificacion = modified;
    }

   /**
    * Returns the value of the <code>contratanteTipoPersona</code> attribute.<br>
    * Model Attribute: <code>contratanteTipoPersona</code>. Variable String Size=1<br>
    * Comments: N - Natural, J - Jurídica<br>
    * @return The value of the <code>contratanteTipoPersona</code> attribute.
    */

    public String getContratanteTipoPersona()  {
    	String value;
        value =  contratanteTipoPersona;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>contratanteTipoPersona</code> attribute.<br>
    * Model Attribute: <code>contratanteTipoPersona</code>. Variable String Size=1<br>
    * Comments: N - Natural, J - Jurídica<br>
    * @param contratanteTipoPersona The new value of the <code>contratanteTipoPersona</code> attribute.
    */
    public void setContratanteTipoPersona (String contratanteTipoPersona) {
        modifiedContratanteTipoPersona = true;
        this.contratanteTipoPersona = contratanteTipoPersona;
    }

   /**
    * Returns the value of the <code>modifiedContratanteTipoPersona</code> class property.<br>
    *
    * @return The value of the <code>modifiedContratanteTipoPersona</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedContratanteTipoPersona() {
        return modifiedContratanteTipoPersona;
    }

   /**
    * Sets the value of the <code>modifiedContratanteTipoPersona</code> class property.<br>
    * @param modified The new value of the <code>modifiedContratanteTipoPersona</code>.
    */
    public void setModifiedContratanteTipoPersona(boolean modified) {
        this.modifiedContratanteTipoPersona = modified;
    }

   /**
    * Returns the value of the <code>contratantePrimerNombre</code> attribute.<br>
    * Model Attribute: <code>contratantePrimerNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>contratantePrimerNombre</code> attribute.
    */

    public String getContratantePrimerNombre()  {
    	String value;
        value =  contratantePrimerNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>contratantePrimerNombre</code> attribute.<br>
    * Model Attribute: <code>contratantePrimerNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param contratantePrimerNombre The new value of the <code>contratantePrimerNombre</code> attribute.
    */
    public void setContratantePrimerNombre (String contratantePrimerNombre) {
        modifiedContratantePrimerNombre = true;
        this.contratantePrimerNombre = contratantePrimerNombre;
    }

   /**
    * Returns the value of the <code>modifiedContratantePrimerNombre</code> class property.<br>
    *
    * @return The value of the <code>modifiedContratantePrimerNombre</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedContratantePrimerNombre() {
        return modifiedContratantePrimerNombre;
    }

   /**
    * Sets the value of the <code>modifiedContratantePrimerNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedContratantePrimerNombre</code>.
    */
    public void setModifiedContratantePrimerNombre(boolean modified) {
        this.modifiedContratantePrimerNombre = modified;
    }

   /**
    * Returns the value of the <code>contratanteSegundoNombre</code> attribute.<br>
    * Model Attribute: <code>contratanteSegundoNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>contratanteSegundoNombre</code> attribute.
    */

    public String getContratanteSegundoNombre()  {
    	String value;
        value =  contratanteSegundoNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>contratanteSegundoNombre</code> attribute.<br>
    * Model Attribute: <code>contratanteSegundoNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param contratanteSegundoNombre The new value of the <code>contratanteSegundoNombre</code> attribute.
    */
    public void setContratanteSegundoNombre (String contratanteSegundoNombre) {
        modifiedContratanteSegundoNombre = true;
        this.contratanteSegundoNombre = contratanteSegundoNombre;
    }

   /**
    * Returns the value of the <code>modifiedContratanteSegundoNombre</code> class property.<br>
    *
    * @return The value of the <code>modifiedContratanteSegundoNombre</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedContratanteSegundoNombre() {
        return modifiedContratanteSegundoNombre;
    }

   /**
    * Sets the value of the <code>modifiedContratanteSegundoNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedContratanteSegundoNombre</code>.
    */
    public void setModifiedContratanteSegundoNombre(boolean modified) {
        this.modifiedContratanteSegundoNombre = modified;
    }

   /**
    * Returns the value of the <code>contratantePrimerApellido</code> attribute.<br>
    * Model Attribute: <code>contratantePrimerApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>contratantePrimerApellido</code> attribute.
    */

    public String getContratantePrimerApellido()  {
    	String value;
        value =  contratantePrimerApellido;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>contratantePrimerApellido</code> attribute.<br>
    * Model Attribute: <code>contratantePrimerApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param contratantePrimerApellido The new value of the <code>contratantePrimerApellido</code> attribute.
    */
    public void setContratantePrimerApellido (String contratantePrimerApellido) {
        modifiedContratantePrimerApellido = true;
        this.contratantePrimerApellido = contratantePrimerApellido;
    }

   /**
    * Returns the value of the <code>modifiedContratantePrimerApellido</code> class property.<br>
    *
    * @return The value of the <code>modifiedContratantePrimerApellido</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedContratantePrimerApellido() {
        return modifiedContratantePrimerApellido;
    }

   /**
    * Sets the value of the <code>modifiedContratantePrimerApellido</code> class property.<br>
    * @param modified The new value of the <code>modifiedContratantePrimerApellido</code>.
    */
    public void setModifiedContratantePrimerApellido(boolean modified) {
        this.modifiedContratantePrimerApellido = modified;
    }

   /**
    * Returns the value of the <code>contratanteSegundoApellido</code> attribute.<br>
    * Model Attribute: <code>contratanteSegundoApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>contratanteSegundoApellido</code> attribute.
    */

    public String getContratanteSegundoApellido()  {
    	String value;
        value =  contratanteSegundoApellido;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>contratanteSegundoApellido</code> attribute.<br>
    * Model Attribute: <code>contratanteSegundoApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param contratanteSegundoApellido The new value of the <code>contratanteSegundoApellido</code> attribute.
    */
    public void setContratanteSegundoApellido (String contratanteSegundoApellido) {
        modifiedContratanteSegundoApellido = true;
        this.contratanteSegundoApellido = contratanteSegundoApellido;
    }

   /**
    * Returns the value of the <code>modifiedContratanteSegundoApellido</code> class property.<br>
    *
    * @return The value of the <code>modifiedContratanteSegundoApellido</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedContratanteSegundoApellido() {
        return modifiedContratanteSegundoApellido;
    }

   /**
    * Sets the value of the <code>modifiedContratanteSegundoApellido</code> class property.<br>
    * @param modified The new value of the <code>modifiedContratanteSegundoApellido</code>.
    */
    public void setModifiedContratanteSegundoApellido(boolean modified) {
        this.modifiedContratanteSegundoApellido = modified;
    }

   /**
    * Returns the value of the <code>contratanteRazonSocial</code> attribute.<br>
    * Model Attribute: <code>contratanteRazonSocial</code>. Variable String Size=254<br>
    * Comments: <br>
    * @return The value of the <code>contratanteRazonSocial</code> attribute.
    */

    public String getContratanteRazonSocial()  {
    	String value;
        value =  contratanteRazonSocial;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>contratanteRazonSocial</code> attribute.<br>
    * Model Attribute: <code>contratanteRazonSocial</code>. Variable String Size=254<br>
    * Comments: <br>
    * @param contratanteRazonSocial The new value of the <code>contratanteRazonSocial</code> attribute.
    */
    public void setContratanteRazonSocial (String contratanteRazonSocial) {
        modifiedContratanteRazonSocial = true;
        this.contratanteRazonSocial = contratanteRazonSocial;
    }

   /**
    * Returns the value of the <code>modifiedContratanteRazonSocial</code> class property.<br>
    *
    * @return The value of the <code>modifiedContratanteRazonSocial</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedContratanteRazonSocial() {
        return modifiedContratanteRazonSocial;
    }

   /**
    * Sets the value of the <code>modifiedContratanteRazonSocial</code> class property.<br>
    * @param modified The new value of the <code>modifiedContratanteRazonSocial</code>.
    */
    public void setModifiedContratanteRazonSocial(boolean modified) {
        this.modifiedContratanteRazonSocial = modified;
    }

   /**
    * Returns the value of the <code>contratanteFechaNacimiento</code> attribute.<br>
    * Model Attribute: <code>contratanteFechaNacimiento</code>. Variable Date<br>
    * Comments: <br>
    * @return The value of the <code>contratanteFechaNacimiento</code> attribute.
    */

    public Date getContratanteFechaNacimiento()  {
    	Date value;
        value =  contratanteFechaNacimiento;
        return value;
    }

   /**
    * Sets the value of the <code>contratanteFechaNacimiento</code> attribute.<br>
    * Model Attribute: <code>contratanteFechaNacimiento</code>. Variable Date<br>
    * Comments: <br>
    * @param contratanteFechaNacimiento The new value of the <code>contratanteFechaNacimiento</code> attribute.
    */
    public void setContratanteFechaNacimiento (Date contratanteFechaNacimiento) {
        modifiedContratanteFechaNacimiento = true;
        this.contratanteFechaNacimiento = contratanteFechaNacimiento;
    }

   /**
    * Returns the value of the <code>modifiedContratanteFechaNacimiento</code> class property.<br>
    *
    * @return The value of the <code>modifiedContratanteFechaNacimiento</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedContratanteFechaNacimiento() {
        return modifiedContratanteFechaNacimiento;
    }

   /**
    * Sets the value of the <code>modifiedContratanteFechaNacimiento</code> class property.<br>
    * @param modified The new value of the <code>modifiedContratanteFechaNacimiento</code>.
    */
    public void setModifiedContratanteFechaNacimiento(boolean modified) {
        this.modifiedContratanteFechaNacimiento = modified;
    }

   /**
    * Returns the value of the <code>contratanteGenero</code> attribute.<br>
    * Model Attribute: <code>contratanteGenero</code>. Variable String Size=1<br>
    * Comments: F - Femenino, M - Masculino<br>
    * @return The value of the <code>contratanteGenero</code> attribute.
    */

    public String getContratanteGenero()  {
    	String value;
        value =  contratanteGenero;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>contratanteGenero</code> attribute.<br>
    * Model Attribute: <code>contratanteGenero</code>. Variable String Size=1<br>
    * Comments: F - Femenino, M - Masculino<br>
    * @param contratanteGenero The new value of the <code>contratanteGenero</code> attribute.
    */
    public void setContratanteGenero (String contratanteGenero) {
        modifiedContratanteGenero = true;
        this.contratanteGenero = contratanteGenero;
    }

   /**
    * Returns the value of the <code>modifiedContratanteGenero</code> class property.<br>
    *
    * @return The value of the <code>modifiedContratanteGenero</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedContratanteGenero() {
        return modifiedContratanteGenero;
    }

   /**
    * Sets the value of the <code>modifiedContratanteGenero</code> class property.<br>
    * @param modified The new value of the <code>modifiedContratanteGenero</code>.
    */
    public void setModifiedContratanteGenero(boolean modified) {
        this.modifiedContratanteGenero = modified;
    }

   /**
    * Returns the value of the <code>contratanteIndicadorExtranjero</code> attribute.<br>
    * Model Attribute: <code>contratanteIndicadorExtranjero</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>contratanteIndicadorExtranjero</code> attribute.
    */

    public Boolean getContratanteIndicadorExtranjero()  {
    	Boolean value;
        value =  contratanteIndicadorExtranjero;
        return value;
    }

   /**
    * Sets the value of the <code>contratanteIndicadorExtranjero</code> attribute.<br>
    * Model Attribute: <code>contratanteIndicadorExtranjero</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @param contratanteIndicadorExtranjero The new value of the <code>contratanteIndicadorExtranjero</code> attribute.
    */
    public void setContratanteIndicadorExtranjero (Boolean contratanteIndicadorExtranjero) {
        modifiedContratanteIndicadorExtranjero = true;
        this.contratanteIndicadorExtranjero = contratanteIndicadorExtranjero;
    }

   /**
    * Returns the value of the <code>modifiedContratanteIndicadorExtranjero</code> class property.<br>
    *
    * @return The value of the <code>modifiedContratanteIndicadorExtranjero</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedContratanteIndicadorExtranjero() {
        return modifiedContratanteIndicadorExtranjero;
    }

   /**
    * Sets the value of the <code>modifiedContratanteIndicadorExtranjero</code> class property.<br>
    * @param modified The new value of the <code>modifiedContratanteIndicadorExtranjero</code>.
    */
    public void setModifiedContratanteIndicadorExtranjero(boolean modified) {
        this.modifiedContratanteIndicadorExtranjero = modified;
    }

   /**
    * Returns the value of the <code>contratanteTelefonoFijo</code> attribute.<br>
    * Model Attribute: <code>contratanteTelefonoFijo</code>. Variable String Size=15<br>
    * Comments: <br>
    * @return The value of the <code>contratanteTelefonoFijo</code> attribute.
    */

    public String getContratanteTelefonoFijo()  {
    	String value;
        value =  contratanteTelefonoFijo;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>contratanteTelefonoFijo</code> attribute.<br>
    * Model Attribute: <code>contratanteTelefonoFijo</code>. Variable String Size=15<br>
    * Comments: <br>
    * @param contratanteTelefonoFijo The new value of the <code>contratanteTelefonoFijo</code> attribute.
    */
    public void setContratanteTelefonoFijo (String contratanteTelefonoFijo) {
        modifiedContratanteTelefonoFijo = true;
        this.contratanteTelefonoFijo = contratanteTelefonoFijo;
    }

   /**
    * Returns the value of the <code>modifiedContratanteTelefonoFijo</code> class property.<br>
    *
    * @return The value of the <code>modifiedContratanteTelefonoFijo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedContratanteTelefonoFijo() {
        return modifiedContratanteTelefonoFijo;
    }

   /**
    * Sets the value of the <code>modifiedContratanteTelefonoFijo</code> class property.<br>
    * @param modified The new value of the <code>modifiedContratanteTelefonoFijo</code>.
    */
    public void setModifiedContratanteTelefonoFijo(boolean modified) {
        this.modifiedContratanteTelefonoFijo = modified;
    }

   /**
    * Returns the value of the <code>contratanteTelefonoCelular</code> attribute.<br>
    * Model Attribute: <code>contratanteTelefonoCelular</code>. Variable String Size=15<br>
    * Comments: <br>
    * @return The value of the <code>contratanteTelefonoCelular</code> attribute.
    */

    public String getContratanteTelefonoCelular()  {
    	String value;
        value =  contratanteTelefonoCelular;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>contratanteTelefonoCelular</code> attribute.<br>
    * Model Attribute: <code>contratanteTelefonoCelular</code>. Variable String Size=15<br>
    * Comments: <br>
    * @param contratanteTelefonoCelular The new value of the <code>contratanteTelefonoCelular</code> attribute.
    */
    public void setContratanteTelefonoCelular (String contratanteTelefonoCelular) {
        modifiedContratanteTelefonoCelular = true;
        this.contratanteTelefonoCelular = contratanteTelefonoCelular;
    }

   /**
    * Returns the value of the <code>modifiedContratanteTelefonoCelular</code> class property.<br>
    *
    * @return The value of the <code>modifiedContratanteTelefonoCelular</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedContratanteTelefonoCelular() {
        return modifiedContratanteTelefonoCelular;
    }

   /**
    * Sets the value of the <code>modifiedContratanteTelefonoCelular</code> class property.<br>
    * @param modified The new value of the <code>modifiedContratanteTelefonoCelular</code>.
    */
    public void setModifiedContratanteTelefonoCelular(boolean modified) {
        this.modifiedContratanteTelefonoCelular = modified;
    }

   /**
    * Returns the value of the <code>contratanteCorreoElectronico</code> attribute.<br>
    * Model Attribute: <code>contratanteCorreoElectronico</code>. Variable String Size=100<br>
    * Comments: <br>
    * @return The value of the <code>contratanteCorreoElectronico</code> attribute.
    */

    public String getContratanteCorreoElectronico()  {
    	String value;
        value =  contratanteCorreoElectronico;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>contratanteCorreoElectronico</code> attribute.<br>
    * Model Attribute: <code>contratanteCorreoElectronico</code>. Variable String Size=100<br>
    * Comments: <br>
    * @param contratanteCorreoElectronico The new value of the <code>contratanteCorreoElectronico</code> attribute.
    */
    public void setContratanteCorreoElectronico (String contratanteCorreoElectronico) {
        modifiedContratanteCorreoElectronico = true;
        this.contratanteCorreoElectronico = contratanteCorreoElectronico;
    }

   /**
    * Returns the value of the <code>modifiedContratanteCorreoElectronico</code> class property.<br>
    *
    * @return The value of the <code>modifiedContratanteCorreoElectronico</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedContratanteCorreoElectronico() {
        return modifiedContratanteCorreoElectronico;
    }

   /**
    * Sets the value of the <code>modifiedContratanteCorreoElectronico</code> class property.<br>
    * @param modified The new value of the <code>modifiedContratanteCorreoElectronico</code>.
    */
    public void setModifiedContratanteCorreoElectronico(boolean modified) {
        this.modifiedContratanteCorreoElectronico = modified;
    }

   /**
    * Returns the value of the <code>contratanteTitularConBeneficios</code> attribute.<br>
    * Model Attribute: <code>contratanteTitularConBeneficios</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>contratanteTitularConBeneficios</code> attribute.
    */

    public Boolean getContratanteTitularConBeneficios()  {
    	Boolean value;
        value =  contratanteTitularConBeneficios;
        return value;
    }

   /**
    * Sets the value of the <code>contratanteTitularConBeneficios</code> attribute.<br>
    * Model Attribute: <code>contratanteTitularConBeneficios</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @param contratanteTitularConBeneficios The new value of the <code>contratanteTitularConBeneficios</code> attribute.
    */
    public void setContratanteTitularConBeneficios (Boolean contratanteTitularConBeneficios) {
        modifiedContratanteTitularConBeneficios = true;
        this.contratanteTitularConBeneficios = contratanteTitularConBeneficios;
    }

   /**
    * Returns the value of the <code>modifiedContratanteTitularConBeneficios</code> class property.<br>
    *
    * @return The value of the <code>modifiedContratanteTitularConBeneficios</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedContratanteTitularConBeneficios() {
        return modifiedContratanteTitularConBeneficios;
    }

   /**
    * Sets the value of the <code>modifiedContratanteTitularConBeneficios</code> class property.<br>
    * @param modified The new value of the <code>modifiedContratanteTitularConBeneficios</code>.
    */
    public void setModifiedContratanteTitularConBeneficios(boolean modified) {
        this.modifiedContratanteTitularConBeneficios = modified;
    }

   /**
    * Returns the value of the <code>contratanteDiplomatico</code> attribute.<br>
    * Model Attribute: <code>contratanteDiplomatico</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>contratanteDiplomatico</code> attribute.
    */

    public Boolean getContratanteDiplomatico()  {
    	Boolean value;
        value =  contratanteDiplomatico;
        return value;
    }

   /**
    * Sets the value of the <code>contratanteDiplomatico</code> attribute.<br>
    * Model Attribute: <code>contratanteDiplomatico</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @param contratanteDiplomatico The new value of the <code>contratanteDiplomatico</code> attribute.
    */
    public void setContratanteDiplomatico (Boolean contratanteDiplomatico) {
        modifiedContratanteDiplomatico = true;
        this.contratanteDiplomatico = contratanteDiplomatico;
    }

   /**
    * Returns the value of the <code>modifiedContratanteDiplomatico</code> class property.<br>
    *
    * @return The value of the <code>modifiedContratanteDiplomatico</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedContratanteDiplomatico() {
        return modifiedContratanteDiplomatico;
    }

   /**
    * Sets the value of the <code>modifiedContratanteDiplomatico</code> class property.<br>
    * @param modified The new value of the <code>modifiedContratanteDiplomatico</code>.
    */
    public void setModifiedContratanteDiplomatico(boolean modified) {
        this.modifiedContratanteDiplomatico = modified;
    }

   /**
    * Returns the value of the <code>contratantedrvIdentificacion</code> attribute.<br>
    * Model Attribute: <code>contratantedrvIdentificacion</code>. Variable String Size=100<br>
    * Comments: Para ser mostrado en display set de solicitud<br>
    * @return The value of the <code>contratantedrvIdentificacion</code> attribute.
    */

    @JsonIgnore
    public String getContratantedrvIdentificacion()  {
    	String value;
        try {
            value = contratantedrvIdentificacionDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).debug("Definition Class: Contratante, Attribute: contratantedrvIdentificacion");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>contratantedrvNombreCompleto</code> attribute.<br>
    * Model Attribute: <code>contratantedrvNombreCompleto</code>. Variable String Size=255<br>
    * Comments: <br>
    * @return The value of the <code>contratantedrvNombreCompleto</code> attribute.
    */

    @JsonIgnore
    public String getContratantedrvNombreCompleto()  {
    	String value;
        try {
            value = contratantedrvNombreCompletoDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).debug("Definition Class: Contratante, Attribute: contratantedrvNombreCompleto");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>contratanteDireccionRes</code> attribute.<br>
    * Model Attribute: <code>contratanteDireccionRes</code>. Variable String Size=250<br>
    * Comments: <br>
    * @return The value of the <code>contratanteDireccionRes</code> attribute.
    */

    public String getContratanteDireccionRes()  {
    	String value;
        value =  contratanteDireccionRes;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>contratanteDireccionRes</code> attribute.<br>
    * Model Attribute: <code>contratanteDireccionRes</code>. Variable String Size=250<br>
    * Comments: <br>
    * @param contratanteDireccionRes The new value of the <code>contratanteDireccionRes</code> attribute.
    */
    public void setContratanteDireccionRes (String contratanteDireccionRes) {
        modifiedContratanteDireccionRes = true;
        this.contratanteDireccionRes = contratanteDireccionRes;
    }

   /**
    * Returns the value of the <code>modifiedContratanteDireccionRes</code> class property.<br>
    *
    * @return The value of the <code>modifiedContratanteDireccionRes</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedContratanteDireccionRes() {
        return modifiedContratanteDireccionRes;
    }

   /**
    * Sets the value of the <code>modifiedContratanteDireccionRes</code> class property.<br>
    * @param modified The new value of the <code>modifiedContratanteDireccionRes</code>.
    */
    public void setModifiedContratanteDireccionRes(boolean modified) {
        this.modifiedContratanteDireccionRes = modified;
    }

   /**
    * Returns the value of the <code>contratanteTelefonoFijoRes</code> attribute.<br>
    * Model Attribute: <code>contratanteTelefonoFijoRes</code>. Variable String Size=15<br>
    * Comments: <br>
    * @return The value of the <code>contratanteTelefonoFijoRes</code> attribute.
    */

    public String getContratanteTelefonoFijoRes()  {
    	String value;
        value =  contratanteTelefonoFijoRes;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>contratanteTelefonoFijoRes</code> attribute.<br>
    * Model Attribute: <code>contratanteTelefonoFijoRes</code>. Variable String Size=15<br>
    * Comments: <br>
    * @param contratanteTelefonoFijoRes The new value of the <code>contratanteTelefonoFijoRes</code> attribute.
    */
    public void setContratanteTelefonoFijoRes (String contratanteTelefonoFijoRes) {
        modifiedContratanteTelefonoFijoRes = true;
        this.contratanteTelefonoFijoRes = contratanteTelefonoFijoRes;
    }

   /**
    * Returns the value of the <code>modifiedContratanteTelefonoFijoRes</code> class property.<br>
    *
    * @return The value of the <code>modifiedContratanteTelefonoFijoRes</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedContratanteTelefonoFijoRes() {
        return modifiedContratanteTelefonoFijoRes;
    }

   /**
    * Sets the value of the <code>modifiedContratanteTelefonoFijoRes</code> class property.<br>
    * @param modified The new value of the <code>modifiedContratanteTelefonoFijoRes</code>.
    */
    public void setModifiedContratanteTelefonoFijoRes(boolean modified) {
        this.modifiedContratanteTelefonoFijoRes = modified;
    }

   /**
    * Returns the value of the <code>contratanteTelefonoCelularRes</code> attribute.<br>
    * Model Attribute: <code>contratanteTelefonoCelularRes</code>. Variable String Size=15<br>
    * Comments: <br>
    * @return The value of the <code>contratanteTelefonoCelularRes</code> attribute.
    */

    public String getContratanteTelefonoCelularRes()  {
    	String value;
        value =  contratanteTelefonoCelularRes;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>contratanteTelefonoCelularRes</code> attribute.<br>
    * Model Attribute: <code>contratanteTelefonoCelularRes</code>. Variable String Size=15<br>
    * Comments: <br>
    * @param contratanteTelefonoCelularRes The new value of the <code>contratanteTelefonoCelularRes</code> attribute.
    */
    public void setContratanteTelefonoCelularRes (String contratanteTelefonoCelularRes) {
        modifiedContratanteTelefonoCelularRes = true;
        this.contratanteTelefonoCelularRes = contratanteTelefonoCelularRes;
    }

   /**
    * Returns the value of the <code>modifiedContratanteTelefonoCelularRes</code> class property.<br>
    *
    * @return The value of the <code>modifiedContratanteTelefonoCelularRes</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedContratanteTelefonoCelularRes() {
        return modifiedContratanteTelefonoCelularRes;
    }

   /**
    * Sets the value of the <code>modifiedContratanteTelefonoCelularRes</code> class property.<br>
    * @param modified The new value of the <code>modifiedContratanteTelefonoCelularRes</code>.
    */
    public void setModifiedContratanteTelefonoCelularRes(boolean modified) {
        this.modifiedContratanteTelefonoCelularRes = modified;
    }

   /**
    * Returns the value of the <code>contratanteRuralDirRes</code> attribute.<br>
    * Model Attribute: <code>contratanteRuralDirRes</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>contratanteRuralDirRes</code> attribute.
    */

    public Boolean getContratanteRuralDirRes()  {
    	Boolean value;
        value =  contratanteRuralDirRes;
        return value;
    }

   /**
    * Sets the value of the <code>contratanteRuralDirRes</code> attribute.<br>
    * Model Attribute: <code>contratanteRuralDirRes</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @param contratanteRuralDirRes The new value of the <code>contratanteRuralDirRes</code> attribute.
    */
    public void setContratanteRuralDirRes (Boolean contratanteRuralDirRes) {
        modifiedContratanteRuralDirRes = true;
        this.contratanteRuralDirRes = contratanteRuralDirRes;
    }

   /**
    * Returns the value of the <code>modifiedContratanteRuralDirRes</code> class property.<br>
    *
    * @return The value of the <code>modifiedContratanteRuralDirRes</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedContratanteRuralDirRes() {
        return modifiedContratanteRuralDirRes;
    }

   /**
    * Sets the value of the <code>modifiedContratanteRuralDirRes</code> class property.<br>
    * @param modified The new value of the <code>modifiedContratanteRuralDirRes</code>.
    */
    public void setModifiedContratanteRuralDirRes(boolean modified) {
        this.modifiedContratanteRuralDirRes = modified;
    }

   /**
    * Returns the value of the <code>contratanteTitularConBeneficiosCORE</code> attribute.<br>
    * Model Attribute: <code>contratanteTitularConBeneficiosCORE</code>. Constant Bool<br>
    * Comments: Indica si el contratante es titular con beneficios en el CORE. Tan solo válido para inclusiones
<Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>contratanteTitularConBeneficiosCORE</code> attribute.
    */

    public Boolean getContratanteTitularConBeneficiosCORE()  {
    	Boolean value;
        value =  contratanteTitularConBeneficiosCORE;
        return value;
    }

   /**
    * Sets the value of the <code>contratanteTitularConBeneficiosCORE</code> attribute.<br>
    * Model Attribute: <code>contratanteTitularConBeneficiosCORE</code>. Constant Bool<br>
    * Comments: Indica si el contratante es titular con beneficios en el CORE. Tan solo válido para inclusiones
<Options>
RADIO=1;
</Options><br>
    * @param contratanteTitularConBeneficiosCORE The new value of the <code>contratanteTitularConBeneficiosCORE</code> attribute.
    */
    public void setContratanteTitularConBeneficiosCORE (Boolean contratanteTitularConBeneficiosCORE) {
        modifiedContratanteTitularConBeneficiosCORE = true;
        this.contratanteTitularConBeneficiosCORE = contratanteTitularConBeneficiosCORE;
    }

   /**
    * Returns the value of the <code>modifiedContratanteTitularConBeneficiosCORE</code> class property.<br>
    *
    * @return The value of the <code>modifiedContratanteTitularConBeneficiosCORE</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedContratanteTitularConBeneficiosCORE() {
        return modifiedContratanteTitularConBeneficiosCORE;
    }

   /**
    * Sets the value of the <code>modifiedContratanteTitularConBeneficiosCORE</code> class property.<br>
    * @param modified The new value of the <code>modifiedContratanteTitularConBeneficiosCORE</code>.
    */
    public void setModifiedContratanteTitularConBeneficiosCORE(boolean modified) {
        this.modifiedContratanteTitularConBeneficiosCORE = modified;
    }

   /**
    * Returns the value of the <code>contratantedrvBeneficiosActivo</code> attribute.<br>
    * Model Attribute: <code>contratantedrvBeneficiosActivo</code>. Variable Bool<br>
    * Comments: Devuelve si se debe activar a no el argumento de "Tiene beneficios" para el contratante
ALM MP-14. GdC-14:Req. 26: Configurar registro rechazado afiliación. Configurar por Producto-Plan si se pueden registrar beneficiarios así el usuario tenga la marcación rechazado afiliación. <br>
    * @return The value of the <code>contratantedrvBeneficiosActivo</code> attribute.
    */

    @JsonIgnore
    public Boolean getContratantedrvBeneficiosActivo()  {
    	Boolean value;
        try {
            value = contratantedrvBeneficiosActivoDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).debug("Definition Class: Contratante, Attribute: contratantedrvBeneficiosActivo");
        }
        return value;
    }

   /**
    * Returns the value of the <code>contratanteDireccionesModificadas</code> attribute.<br>
    * Model Attribute: <code>contratanteDireccionesModificadas</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>contratanteDireccionesModificadas</code> attribute.
    */

    public Boolean getContratanteDireccionesModificadas()  {
    	Boolean value;
        value =  contratanteDireccionesModificadas;
        return value;
    }

   /**
    * Sets the value of the <code>contratanteDireccionesModificadas</code> attribute.<br>
    * Model Attribute: <code>contratanteDireccionesModificadas</code>. Variable Bool<br>
    * Comments: <br>
    * @param contratanteDireccionesModificadas The new value of the <code>contratanteDireccionesModificadas</code> attribute.
    */
    public void setContratanteDireccionesModificadas (Boolean contratanteDireccionesModificadas) {
        modifiedContratanteDireccionesModificadas = true;
        this.contratanteDireccionesModificadas = contratanteDireccionesModificadas;
    }

   /**
    * Returns the value of the <code>modifiedContratanteDireccionesModificadas</code> class property.<br>
    *
    * @return The value of the <code>modifiedContratanteDireccionesModificadas</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedContratanteDireccionesModificadas() {
        return modifiedContratanteDireccionesModificadas;
    }

   /**
    * Sets the value of the <code>modifiedContratanteDireccionesModificadas</code> class property.<br>
    * @param modified The new value of the <code>modifiedContratanteDireccionesModificadas</code>.
    */
    public void setModifiedContratanteDireccionesModificadas(boolean modified) {
        this.modifiedContratanteDireccionesModificadas = modified;
    }

    /**
     * Returns the instance of <code>Solicitud</code> related through the <code>Solicitud</code> role.
     * Model Relationship:
     * <code>[Solicitud] Solicitud 1:1  ------ 0:1  Contratante [Contratante]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Solicitud</code> related through the <code>Solicitud</code> role.
     */
    @JsonIgnore
    public Solicitud getSolicitud() {
        try {
            if (solicitud != null && solicitud.isNull()) {
                solicitud = null;
            }
        } catch (Exception ex) {
            solicitud = null;
        }
        if (solicitud == null) {
            if (aesolicitudesidsolicitud != null) {
                solicitud = getSolicitudRepository().findById(aesolicitudesidsolicitud).orElse(null);
            } else {
                solicitud = null;
            }
        }
        return (solicitud == null ? new Solicitud(null) : solicitud);
    }

    /**
     * Adds an instance of <code>Solicitud</code> related through the <code>Solicitud</code> role.
     * @param solicitud The instance to add to the <code>Solicitud</code> role.
     */
    public void add2Solicitud(Solicitud solicitud) {
        if (solicitud == null || solicitud.isNull()) {
            this.modifiedSolicitud = true;
            this.aesolicitudesidsolicitud = null;
        } else {
            this.aesolicitudesidsolicitud = solicitud.getAesolicitudesidsolicitud();
        }
    }

   /**
    * This method gets the attribute value <code>modifiedSolicitud</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedSolicitud</code> has been modified.
    */
    public boolean isModifiedSolicitud(){
        return modifiedSolicitud;
    }

    /**
     * Returns the instance of <code>TipoIdentificacion</code> related through the <code>TipoIdentificacion</code> role.
     * Model Relationship:
     * <code>[TipoIdentificacion] TipoIdentificacion 1:1  ------ 0:M  Contratantes [Contratante]</code>
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
     * Returns the instance of <code>Departamento</code> related through the <code>DepartamentoNac</code> role.
     * Model Relationship:
     * <code>[Departamento] DepartamentoNac 0:1  ------ 0:M  Contratantes [Contratante]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Departamento</code> related through the <code>DepartamentoNac</code> role.
     */
    @JsonIgnore
    public Departamento getDepartamentoNac() {
        try {
            if (departamentoNac != null && departamentoNac.isNull()) {
                departamentoNac = null;
            }
        } catch (Exception ex) {
            departamentoNac = null;
        }
        if (departamentoNac == null) {
            if (departamentoDepartamentoNacCodigo != null) {
                departamentoNac = getDepartamentoRepository().findById(departamentoDepartamentoNacCodigo).orElse(null);
            } else {
                departamentoNac = null;
            }
        }
        return (departamentoNac == null ? new Departamento(null) : departamentoNac);
    }

    /**
     * Adds an instance of <code>Departamento</code> related through the <code>DepartamentoNac</code> role.
     * @param departamentoNac The instance to add to the <code>DepartamentoNac</code> role.
     */
    public void add2DepartamentoNac(Departamento departamentoNac) {
        if (departamentoNac == null || departamentoNac.isNull()) {
            this.modifiedDepartamentoNac = true;
            this.departamentoDepartamentoNacCodigo = null;
        } else {
            this.departamentoDepartamentoNacCodigo = departamentoNac.getDepartamentoCodigo();
        }
        this.departamentoNac = (departamentoNac == null  || departamentoNac.isNull() ? null : departamentoNac);
    }

   /**
    * This method gets the attribute value <code>modifiedDepartamentoNac</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDepartamentoNac</code> has been modified.
    */
    public boolean isModifiedDepartamentoNac(){
        return modifiedDepartamentoNac;
    }

    /**
     * Returns the instance of <code>Municipio</code> related through the <code>MunicipioNac</code> role.
     * Model Relationship:
     * <code>[Municipio] MunicipioNac 0:1  ------ 0:M  Contratantes [Contratante]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Municipio</code> related through the <code>MunicipioNac</code> role.
     */
    @JsonIgnore
    public Municipio getMunicipioNac() {
        try {
            if (municipioNac != null && municipioNac.isNull()) {
                municipioNac = null;
            }
        } catch (Exception ex) {
            municipioNac = null;
        }
        if (municipioNac == null) {
            if (municipioMunicipioNacCodigo != null) {
                municipioNac = getMunicipioRepository().findById(municipioMunicipioNacCodigo).orElse(null);
            } else {
                municipioNac = null;
            }
        }
        return (municipioNac == null ? new Municipio(null) : municipioNac);
    }

    /**
     * Adds an instance of <code>Municipio</code> related through the <code>MunicipioNac</code> role.
     * @param municipioNac The instance to add to the <code>MunicipioNac</code> role.
     */
    public void add2MunicipioNac(Municipio municipioNac) {
        if (municipioNac == null || municipioNac.isNull()) {
            this.modifiedMunicipioNac = true;
            this.municipioMunicipioNacCodigo = null;
        } else {
            this.municipioMunicipioNacCodigo = municipioNac.getMunicipioCodigo();
        }
        this.municipioNac = (municipioNac == null  || municipioNac.isNull() ? null : municipioNac);
    }

   /**
    * This method gets the attribute value <code>modifiedMunicipioNac</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedMunicipioNac</code> has been modified.
    */
    public boolean isModifiedMunicipioNac(){
        return modifiedMunicipioNac;
    }

    /**
     * Returns the instance of <code>Departamento</code> related through the <code>DepartamentoRes</code> role.
     * Model Relationship:
     * <code>[Departamento] DepartamentoRes 0:1  ------ 0:M  ContratantesRes [Contratante]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Departamento</code> related through the <code>DepartamentoRes</code> role.
     */
    @JsonIgnore
    public Departamento getDepartamentoRes() {
        try {
            if (departamentoRes != null && departamentoRes.isNull()) {
                departamentoRes = null;
            }
        } catch (Exception ex) {
            departamentoRes = null;
        }
        if (departamentoRes == null) {
            if (departamentoDepartamentoResCodigo != null) {
                departamentoRes = getDepartamentoRepository().findById(departamentoDepartamentoResCodigo).orElse(null);
            } else {
                departamentoRes = null;
            }
        }
        return (departamentoRes == null ? new Departamento(null) : departamentoRes);
    }

    /**
     * Adds an instance of <code>Departamento</code> related through the <code>DepartamentoRes</code> role.
     * @param departamentoRes The instance to add to the <code>DepartamentoRes</code> role.
     */
    public void add2DepartamentoRes(Departamento departamentoRes) {
        if (departamentoRes == null || departamentoRes.isNull()) {
            this.modifiedDepartamentoRes = true;
            this.departamentoDepartamentoResCodigo = null;
        } else {
            this.departamentoDepartamentoResCodigo = departamentoRes.getDepartamentoCodigo();
        }
        this.departamentoRes = (departamentoRes == null  || departamentoRes.isNull() ? null : departamentoRes);
    }

   /**
    * This method gets the attribute value <code>modifiedDepartamentoRes</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDepartamentoRes</code> has been modified.
    */
    public boolean isModifiedDepartamentoRes(){
        return modifiedDepartamentoRes;
    }

    /**
     * Returns the instance of <code>Municipio</code> related through the <code>MunicipioRes</code> role.
     * Model Relationship:
     * <code>[Municipio] MunicipioRes 0:1  ------ 0:M  ContratanteRes [Contratante]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Municipio</code> related through the <code>MunicipioRes</code> role.
     */
    @JsonIgnore
    public Municipio getMunicipioRes() {
        try {
            if (municipioRes != null && municipioRes.isNull()) {
                municipioRes = null;
            }
        } catch (Exception ex) {
            municipioRes = null;
        }
        if (municipioRes == null) {
            if (municipioMunicipioResCodigo != null) {
                municipioRes = getMunicipioRepository().findById(municipioMunicipioResCodigo).orElse(null);
            } else {
                municipioRes = null;
            }
        }
        return (municipioRes == null ? new Municipio(null) : municipioRes);
    }

    /**
     * Adds an instance of <code>Municipio</code> related through the <code>MunicipioRes</code> role.
     * @param municipioRes The instance to add to the <code>MunicipioRes</code> role.
     */
    public void add2MunicipioRes(Municipio municipioRes) {
        if (municipioRes == null || municipioRes.isNull()) {
            this.modifiedMunicipioRes = true;
            this.municipioMunicipioResCodigo = null;
        } else {
            this.municipioMunicipioResCodigo = municipioRes.getMunicipioCodigo();
        }
        this.municipioRes = (municipioRes == null  || municipioRes.isNull() ? null : municipioRes);
    }

   /**
    * This method gets the attribute value <code>modifiedMunicipioRes</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedMunicipioRes</code> has been modified.
    */
    public boolean isModifiedMunicipioRes(){
        return modifiedMunicipioRes;
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
     * Computes the value of the <code>contratantedrvIdentificacion</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>contratantedrvIdentificacion</code> derived attribute.
     */
    public String contratantedrvIdentificacionDerivations() {

        contratantedrvIdentificacion = null;

        contratantedrvIdentificacionDerivationsDefault();
        return contratantedrvIdentificacion;
    }

    private void contratantedrvIdentificacionDerivationsDefault() {
        if (contratantedrvIdentificacion != null) return;
        // Default derivation
        // EFFECT   : TipoIdentificacion.NombreCorto + \" - \" + NumIdentificacion
        contratantedrvIdentificacion = this.getTipoIdentificacion().getTipoIdentificacionNombreCorto() + " - " + this.getContratanteNumIdentificacion();
    }

    /**
     * Computes the value of the <code>contratantedrvNombreCompleto</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>contratantedrvNombreCompleto</code> derived attribute.
     */
    public String contratantedrvNombreCompletoDerivations() {

        contratantedrvNombreCompleto = null;

        contratantedrvNombreCompletoDerivationsConditional1();
        contratantedrvNombreCompletoDerivationsDefault();
        return contratantedrvNombreCompleto;
    }

    private void contratantedrvNombreCompletoDerivationsConditional1() {
        if (contratantedrvNombreCompleto != null) return;
        // CONDITION: TipoPersona = \"N\"
        // EFFECT   : fuconcatenarConNulos(\"\", PrimerNombre) + fuconcatenarConNulos(\" \", SegundoNombre) + fuconcatenarConNulos(\" \", PrimerApellido) + fuconcatenarConNulos(\" \", SegundoApellido)
        boolean contratantedrvNombreCompletoCond = (this.getContratanteTipoPersona()).equals("N");
        if (contratantedrvNombreCompletoCond) {
            contratantedrvNombreCompleto = userFunctionsSrv.fuconcatenarConNulosFun("", this.getContratantePrimerNombre()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getContratanteSegundoNombre()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getContratantePrimerApellido()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getContratanteSegundoApellido());
        }
    }

    private void contratantedrvNombreCompletoDerivationsDefault() {
        if (contratantedrvNombreCompleto != null) return;
        // Default derivation
        // EFFECT   : RazonSocial
        contratantedrvNombreCompleto = this.getContratanteRazonSocial();
    }

    /**
     * Computes the value of the <code>contratantedrvBeneficiosActivo</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>contratantedrvBeneficiosActivo</code> derived attribute.
     */
    public Boolean contratantedrvBeneficiosActivoDerivations() {

        contratantedrvBeneficiosActivo = null;

        contratantedrvBeneficiosActivoDerivationsConditional1();
        contratantedrvBeneficiosActivoDerivationsConditional2();
        contratantedrvBeneficiosActivoDerivationsConditional3();
        contratantedrvBeneficiosActivoDerivationsDefault();
        return contratantedrvBeneficiosActivo;
    }

    private void contratantedrvBeneficiosActivoDerivationsConditional1() {
        if (contratantedrvBeneficiosActivo != null) return;
        // CONDITION: TipoIdentificacion.NIT = true
        // EFFECT   : FALSE
        boolean contratantedrvBeneficiosActivoCond = this.getTipoIdentificacion().getTipoIdentificacionNIT().equals(true);
        if (contratantedrvBeneficiosActivoCond) {
            contratantedrvBeneficiosActivo = Boolean.FALSE;
        }
    }

    private void contratantedrvBeneficiosActivoDerivationsConditional2() {
        if (contratantedrvBeneficiosActivo != null) return;
        // CONDITION: TitularConBeneficiosCORE = TRUE
        // EFFECT   : FALSE
        boolean contratantedrvBeneficiosActivoCond = this.getContratanteTitularConBeneficiosCORE().equals(true);
        if (contratantedrvBeneficiosActivoCond) {
            contratantedrvBeneficiosActivo = Boolean.FALSE;
        }
    }

    private void contratantedrvBeneficiosActivoDerivationsConditional3() {
        if (contratantedrvBeneficiosActivo != null) return;
        // CONDITION: Solicitud.drvPermiteRechazados = false AND Solicitud.ContratantePersona.drvRechazada = true
        // EFFECT   : FALSE
        boolean contratantedrvBeneficiosActivoCond = this.getSolicitud().getSolicituddrvPermiteRechazados().equals(false) && this.getSolicitud().getContratantePersona().getPersonadrvRechazada().equals(true);
        if (contratantedrvBeneficiosActivoCond) {
            contratantedrvBeneficiosActivo = Boolean.FALSE;
        }
    }

    private void contratantedrvBeneficiosActivoDerivationsDefault() {
        if (contratantedrvBeneficiosActivo != null) return;
        // Default derivation
        // EFFECT   : TRUE
        contratantedrvBeneficiosActivo = Boolean.TRUE;
    }
    /**
     * This method initializes the properties of the entity and its relations.
     */
    private void initAttributes() {
        contratanteCodigo = null;
        contratanteNumIdentificacion = "";
        contratanteTipoPersona = "";
        contratantePrimerNombre = null;
        contratanteSegundoNombre = null;
        contratantePrimerApellido = null;
        contratanteSegundoApellido = null;
        contratanteRazonSocial = null;
        contratanteFechaNacimiento = null;
        contratanteGenero = null;
        contratanteIndicadorExtranjero = null;
        contratanteTelefonoFijo = null;
        contratanteTelefonoCelular = null;
        contratanteCorreoElectronico = null;
        contratanteTitularConBeneficios = false;
        contratanteDiplomatico = false;
        contratanteDireccionRes = null;
        contratanteTelefonoFijoRes = null;
        contratanteTelefonoCelularRes = null;
        contratanteRuralDirRes = null;
        contratanteTitularConBeneficiosCORE = false;
        contratanteDireccionesModificadas = false;
        solicitud = null;
        tipoIdentificacion = null;
        departamentoNac = null;
        municipioNac = null;
        departamentoRes = null;
        municipioRes = null;
        values = new HashMap<>();
        userFunctionsSrv = Arc.container().select(UserFunctions.class).get();

        clearModifiedFlags();
    }
    public SolicitudJpaRepository getSolicitudRepository() {
        return Arc.container().select(SolicitudJpaRepository.class).get();
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

    @Override
    protected Method[] getMethods() {
    	return Contratante.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return ContratanteConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedContratanteCodigo = false;
    	values.put("contratanteCodigo", getContratanteCodigo());
    	modifiedContratanteNumIdentificacion = false;
    	values.put("contratanteNumIdentificacion", getContratanteNumIdentificacion());
    	modifiedContratanteTipoPersona = false;
    	values.put("contratanteTipoPersona", getContratanteTipoPersona());
    	modifiedContratantePrimerNombre = false;
    	values.put("contratantePrimerNombre", getContratantePrimerNombre());
    	modifiedContratanteSegundoNombre = false;
    	values.put("contratanteSegundoNombre", getContratanteSegundoNombre());
    	modifiedContratantePrimerApellido = false;
    	values.put("contratantePrimerApellido", getContratantePrimerApellido());
    	modifiedContratanteSegundoApellido = false;
    	values.put("contratanteSegundoApellido", getContratanteSegundoApellido());
    	modifiedContratanteRazonSocial = false;
    	values.put("contratanteRazonSocial", getContratanteRazonSocial());
    	modifiedContratanteFechaNacimiento = false;
    	values.put("contratanteFechaNacimiento", getContratanteFechaNacimiento());
    	modifiedContratanteGenero = false;
    	values.put("contratanteGenero", getContratanteGenero());
    	modifiedContratanteIndicadorExtranjero = false;
    	values.put("contratanteIndicadorExtranjero", getContratanteIndicadorExtranjero());
    	modifiedContratanteTelefonoFijo = false;
    	values.put("contratanteTelefonoFijo", getContratanteTelefonoFijo());
    	modifiedContratanteTelefonoCelular = false;
    	values.put("contratanteTelefonoCelular", getContratanteTelefonoCelular());
    	modifiedContratanteCorreoElectronico = false;
    	values.put("contratanteCorreoElectronico", getContratanteCorreoElectronico());
    	modifiedContratanteTitularConBeneficios = false;
    	values.put("contratanteTitularConBeneficios", getContratanteTitularConBeneficios());
    	modifiedContratanteDiplomatico = false;
    	values.put("contratanteDiplomatico", getContratanteDiplomatico());
    	modifiedContratanteDireccionRes = false;
    	values.put("contratanteDireccionRes", getContratanteDireccionRes());
    	modifiedContratanteTelefonoFijoRes = false;
    	values.put("contratanteTelefonoFijoRes", getContratanteTelefonoFijoRes());
    	modifiedContratanteTelefonoCelularRes = false;
    	values.put("contratanteTelefonoCelularRes", getContratanteTelefonoCelularRes());
    	modifiedContratanteRuralDirRes = false;
    	values.put("contratanteRuralDirRes", getContratanteRuralDirRes());
    	modifiedContratanteTitularConBeneficiosCORE = false;
    	values.put("contratanteTitularConBeneficiosCORE", getContratanteTitularConBeneficiosCORE());
    	modifiedContratanteDireccionesModificadas = false;
    	values.put("contratanteDireccionesModificadas", getContratanteDireccionesModificadas());
    	modifiedSolicitud = false;
    	modifiedTipoIdentificacion = false;
    	modifiedDepartamentoNac = false;
    	modifiedMunicipioNac = false;
    	modifiedDepartamentoRes = false;
    	modifiedMunicipioRes = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
            contratantedrvIdentificacion = null;
            contratantedrvNombreCompleto = null;
            contratantedrvBeneficiosActivo = null;
    }

    /**
     * Returns the <code>ContratanteOid</code> object that identifies this instance of <code>Contratante</code>.
     * @return <code>ContratanteOid </code> object that identifies this instance of <code>Contratante</code>
     */
	@Override
    public ContratanteOid getOid() {
        return new ContratanteOid(getAesolicitudesidsolicitud());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(ContratanteConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(ContratanteConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.CONTRATANTE)) {
            // Add this class
            activeFacets.add(Constants.CONTRATANTE);
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

    public String buildDSContratanteNull() {
        try {
            return (getContratanteCodigo() != null ? getContratanteCodigo().toString() : "");
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
            relatedInstance = buildContratanteRelatedInstance(relatedInstanceJsonOid);
        }
        if (ContratanteConstants.ROLE_NAME_SOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildContratanteRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (ContratanteConstants.ROLE_NAME_TIPOIDENTIFICACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildContratanteRelatedInstance4TipoIdentificacion(relatedInstanceJsonOid, remainingPath);
        }
        if (ContratanteConstants.ROLE_NAME_DEPARTAMENTONAC.equalsIgnoreCase(relatedInstancePathFirstItem) || ContratanteConstants.ROLE_NAME_DEPARTAMENTORES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildContratanteRelatedInstance4Departamento(relatedInstanceJsonOid, remainingPath);
        }
        if (ContratanteConstants.ROLE_NAME_MUNICIPIONAC.equalsIgnoreCase(relatedInstancePathFirstItem) || ContratanteConstants.ROLE_NAME_MUNICIPIORES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildContratanteRelatedInstance4Municipio(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildContratanteRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Contratante(mapper.readValue(relatedInstanceJsonOid, ContratanteOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Contratante.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildContratanteRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Contratante.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildContratanteRelatedInstance4TipoIdentificacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class)): TipoIdentificacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Contratante.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildContratanteRelatedInstance4Departamento(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Departamento(mapper.readValue(relatedInstanceJsonOid, DepartamentoOid.class)): Departamento.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Contratante.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildContratanteRelatedInstance4Municipio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class)): Municipio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Contratante.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
