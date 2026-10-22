package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.AsesorConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.FuncionarioConstants;
import com.keralty.aepersonas.global.RolConstants;
import com.keralty.aepersonas.global.SucursalConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.persistence.oid.FuncionarioOid;
import com.keralty.aepersonas.persistence.oid.GrupoAsignacionOid;
import com.keralty.aepersonas.persistence.oid.LogFuncionarioOid;
import com.keralty.aepersonas.persistence.oid.ObsEstadoOid;
import com.keralty.aepersonas.persistence.oid.ReportesProcAlmOid;
import com.keralty.aepersonas.persistence.oid.RolOid;
import com.keralty.aepersonas.persistence.oid.SolicitudNovedadOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.oid.SucursalOid;
import com.keralty.aepersonas.repository.FuncionarioJpaRepository;
import com.keralty.aepersonas.repository.ObsEstadoJpaRepository;
import com.keralty.aepersonas.repository.SolicitudJpaRepository;
import com.keralty.aepersonas.service.RolService;
import com.keralty.aepersonas.service.SucursalService;
import io.quarkus.arc.Arc;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
import org.eclipse.microprofile.rest.client.inject.RestClient;
/**
 * Persistent representation of the <code>Funcionario</code> model class.
 * <p>
 * Model Class: <code>Funcionario</code><br>
 */
@Entity(name = FuncionarioConstants.CLASS_NAME)
@Table(name = FuncionarioConstants.TBL_NAME)
public class Funcionario extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient FuncionarioJpaRepository funcionarioRepository;

    @JsonIgnore
    private transient SolicitudJpaRepository solicitudRepository;

    @JsonIgnore
    private transient ObsEstadoJpaRepository obsEstadoRepository;

    @RestClient
    private transient RolService rolService;

    @RestClient
    private transient SucursalService sucursalService;

    private transient UserFunctions userFunctionsSrv;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="Funcionario_Sequence")
    @SequenceGenerator(name="Funcionario_Sequence", sequenceName="Funcionario_Sequence", allocationSize=1)
    @Column(name = FuncionarioConstants.FLD_FUNCIONARIOID )
    @JsonProperty(value="id")
    private Long funcionarioId;

    /** Class member attribute. */
    @Column(name = FuncionarioConstants.FLD_FUNCIONARIOMANUAL )
    @JsonProperty(value="manual")
    private Boolean funcionarioManual;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFuncionarioManual;

    /** Class member attribute. */
    @Column(name = FuncionarioConstants.FLD_FUNCIONARIOUSUARIO )
    @JsonProperty(value="usuario")
    private String funcionarioUsuario;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFuncionarioUsuario;

    /** Class member attribute. */
    @Column(name = FuncionarioConstants.FLD_FUNCIONARIOPRIMERNOMBRE )
    @JsonProperty(value="primernombre")
    private String funcionarioPrimerNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFuncionarioPrimerNombre;

    /** Class member attribute. */
    @Column(name = FuncionarioConstants.FLD_FUNCIONARIOSEGUNDONOMBRE )
    @JsonProperty(value="segundonombre")
    private String funcionarioSegundoNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFuncionarioSegundoNombre;

    /** Class member attribute. */
    @Column(name = FuncionarioConstants.FLD_FUNCIONARIOPRIMERAPELLIDO )
    @JsonProperty(value="primerapellido")
    private String funcionarioPrimerApellido;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFuncionarioPrimerApellido;

    /** Class member attribute. */
    @Column(name = FuncionarioConstants.FLD_FUNCIONARIOSEGUNDOAPELLIDO )
    @JsonProperty(value="segundoapellido")
    private String funcionarioSegundoApellido;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFuncionarioSegundoApellido;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvnombrecompleto")
    protected String funcionariodrvNombreCompleto;

    /** Class member attribute. */
    @Column(name = FuncionarioConstants.FLD_FUNCIONARIOUSUARIOLDAP )
    @JsonProperty(value="usuarioldap")
    private String funcionarioUsuarioLDAP;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFuncionarioUsuarioLDAP;

    /** Class member attribute. */
    @Column(name = FuncionarioConstants.FLD_FUNCIONARIOEMAIL )
    @JsonProperty(value="email")
    private String funcionarioEmail;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFuncionarioEmail;

    /** Class member attribute. */
    @Column(name = FuncionarioConstants.FLD_FUNCIONARIOCODJEFE )
    @JsonProperty(value="codjefe")
    private String funcionarioCodJefe;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFuncionarioCodJefe;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvnomjefe")
    protected String funcionariodrvNomJefe;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvnomagencia")
    protected String funcionariodrvNomAgencia;

    /** Class member attribute. */
    @Column(name = FuncionarioConstants.FLD_FUNCIONARIODISPONIBLE )
    @JsonProperty(value="disponible")
    private Boolean funcionarioDisponible;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFuncionarioDisponible;

    /** Class member attribute. */
    @Column(name = FuncionarioConstants.FLD_FUNCIONARIONUMSOLNOTERMINADAS )
    @JsonProperty(value="numsolnoterminadas")
    private Long funcionarioNumSolNoTerminadas;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFuncionarioNumSolNoTerminadas;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvesasesorintegral")
    protected Boolean funcionariodrvEsAsesorIntegral;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvesafiliacion")
    protected Boolean funcionariodrvEsAfiliacion;

    /** Class member attribute. */
    @Column(name = FuncionarioConstants.FLD_FUNCIONARIOIDSESION )
    @JsonProperty(value="idsesion")
    private String funcionarioIdSesion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFuncionarioIdSesion;

    @Column(name = FuncionarioConstants.FLD_P4SSW0RD )
    @JsonProperty(value="password")
    private String passWord;

    @Transient
    @JsonIgnore
    private boolean modifiedPassWord;

    /** Related Class. */
    @OneToMany(mappedBy = FuncionarioConstants.ROLE_INVNAME_SOLICITUDES)
    @JsonIgnore
    private Collection <Solicitud> solicitudes;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudes;

    /** Related Class. */
    @OneToMany(mappedBy = FuncionarioConstants.ROLE_INVNAME_SOLICITUDESAFILIACION)
    @JsonIgnore
    private Collection <Solicitud> solicitudesAfiliacion;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudesAfiliacion;

    /** Related Class. */
    @OneToMany(mappedBy = FuncionarioConstants.ROLE_INVNAME_OBSESTADO)
    @JsonIgnore
    private Collection <ObsEstado> obsEstado;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedObsEstado;

    /** Related Class. */
    @ManyToMany(mappedBy=FuncionarioConstants.ROLE_INVNAME_REPORTES)
    @JsonIgnore
    private Collection <ReportesProcAlm> reportes;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedReportes;

    /** Related Class. */
    @OneToMany(mappedBy = FuncionarioConstants.ROLE_INVNAME_SOLICITUDESNOVEDAD)
    @JsonIgnore
    private Collection <SolicitudNovedad> solicitudesNovedad;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudesNovedad;

    /** Related Class. */
    @OneToMany(mappedBy = FuncionarioConstants.ROLE_INVNAME_SOLNOVAIFLIACIONES)
    @JsonIgnore
    private Collection <SolicitudNovedad> solNovAifliaciones;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolNovAifliaciones;

    /** Related Class. */
    @ManyToMany(mappedBy=FuncionarioConstants.ROLE_INVNAME_GRUPOASIGNACION)
    @JsonIgnore
    private Collection <GrupoAsignacion> grupoAsignacion;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedGrupoAsignacion;

    /** Related Class. */
    @OneToMany(mappedBy = FuncionarioConstants.ROLE_INVNAME_LOGFUNCIONARIO)
    @JsonIgnore
    private Collection <LogFuncionario> logFuncionario;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogFuncionario;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=FuncionarioConstants.FLD_ROLIDENTIFICADOR, referencedColumnName=RolConstants.FLD_ROLIDENTIFICADOR)
    })
    @JsonIgnore
    private Rol rol;
    /** Related attribute. */
    @Column(name = FuncionarioConstants.FLD_ROLIDENTIFICADOR, insertable = false, updatable = false)
    private Long rolIdentificador;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedRol;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=FuncionarioConstants.FLD_SUCURSALCODIGO, referencedColumnName=SucursalConstants.FLD_SUCURSALCODIGO)
    })
    @JsonIgnore
    private Sucursal sucursal;
    /** Related attribute. */
    @Column(name = FuncionarioConstants.FLD_SUCURSALCODIGO, insertable = false, updatable = false)
    private Long sucursalCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSucursal;

    /** Class child member. */
    @OneToOne(mappedBy = "parentFuncionario", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JsonIgnore
    private Admin childAdmin;

    /** Class child member. */
    @OneToOne(mappedBy = "parentFuncionario", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JsonIgnore
    private SuperAdmin childSuperAdmin;

    /** Class child member. */
    @OneToOne(mappedBy = "parentFuncionario", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JsonIgnore
    private Asesor childAsesor;

    /** Class child member. */
    @OneToOne(mappedBy = "parentFuncionario", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JsonIgnore
    private AreaMedica childAreaMedica;

    /** Class child member. */
    @OneToOne(mappedBy = "parentFuncionario", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JsonIgnore
    private Afiliaciones childAfiliaciones;

    /** Class child member. */
    @OneToOne(mappedBy = "parentFuncionario", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JsonIgnore
    private RespRegional childRespRegional;

    /** Class child member. */
    @OneToOne(mappedBy = "parentFuncionario", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JsonIgnore
    private Gestor childGestor;

    /** Class child member. */
    @OneToOne(mappedBy = "parentFuncionario", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JsonIgnore
    private MesaDeApoyo childMesaDeApoyo;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public Funcionario() {
        funcionarioId = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>Funcionario</code>.
     * @param oid Object Identifier of the instance of <code>Funcionario</code> to be created.
     * @throws SystemException
     */
    public Funcionario(FuncionarioOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            funcionarioId = oid.getFuncionarioId();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>funcionarioId</code> attribute<br>in class <code>Funcionario</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Funcionario</code>
     * @return The value of the <code>funcionarioId</code> attribute<br>in class <code>Funcionario</code>.
     */
    public Long getFuncionarioId() {
        return funcionarioId;
    }

    /**
     * Sets the value of the <code>funcionarioId</code> attribute<br>in class <code>Funcionario</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Funcionario</code>
     * @param funcionarioId The new value of the <code>funcionarioId</code> attribute<br>in class <code>Funcionario</code>.
     */
    public void setFuncionarioId(Long funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

   /**
    * Returns the value of the <code>funcionarioManual</code> attribute.<br>
    * Model Attribute: <code>funcionarioManual</code>. Constant Bool<br>
    * Comments: GC3: Indica si es manual o viene de la sincronización<br>
    * @return The value of the <code>funcionarioManual</code> attribute.
    */

    public Boolean getFuncionarioManual()  {
    	Boolean value;
        value =  funcionarioManual;
        return value;
    }

   /**
    * Sets the value of the <code>funcionarioManual</code> attribute.<br>
    * Model Attribute: <code>funcionarioManual</code>. Constant Bool<br>
    * Comments: GC3: Indica si es manual o viene de la sincronización<br>
    * @param funcionarioManual The new value of the <code>funcionarioManual</code> attribute.
    */
    public void setFuncionarioManual (Boolean funcionarioManual) {
        modifiedFuncionarioManual = true;
        this.funcionarioManual = funcionarioManual;
    }

   /**
    * Returns the value of the <code>modifiedFuncionarioManual</code> class property.<br>
    *
    * @return The value of the <code>modifiedFuncionarioManual</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFuncionarioManual() {
        return modifiedFuncionarioManual;
    }

   /**
    * Sets the value of the <code>modifiedFuncionarioManual</code> class property.<br>
    * @param modified The new value of the <code>modifiedFuncionarioManual</code>.
    */
    public void setModifiedFuncionarioManual(boolean modified) {
        this.modifiedFuncionarioManual = modified;
    }

   /**
    * Returns the value of the <code>funcionarioUsuario</code> attribute.<br>
    * Model Attribute: <code>funcionarioUsuario</code>. Variable String Size=50<br>
    * Comments: Admin's identification function<br>
    * @return The value of the <code>funcionarioUsuario</code> attribute.
    */

    public String getFuncionarioUsuario()  {
    	String value;
        value =  funcionarioUsuario;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>funcionarioUsuario</code> attribute.<br>
    * Model Attribute: <code>funcionarioUsuario</code>. Variable String Size=50<br>
    * Comments: Admin's identification function<br>
    * @param funcionarioUsuario The new value of the <code>funcionarioUsuario</code> attribute.
    */
    public void setFuncionarioUsuario (String funcionarioUsuario) {
        modifiedFuncionarioUsuario = true;
        this.funcionarioUsuario = funcionarioUsuario;
    }

   /**
    * Returns the value of the <code>modifiedFuncionarioUsuario</code> class property.<br>
    *
    * @return The value of the <code>modifiedFuncionarioUsuario</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFuncionarioUsuario() {
        return modifiedFuncionarioUsuario;
    }

   /**
    * Sets the value of the <code>modifiedFuncionarioUsuario</code> class property.<br>
    * @param modified The new value of the <code>modifiedFuncionarioUsuario</code>.
    */
    public void setModifiedFuncionarioUsuario(boolean modified) {
        this.modifiedFuncionarioUsuario = modified;
    }

   /**
    * Returns the value of the <code>funcionarioPrimerNombre</code> attribute.<br>
    * Model Attribute: <code>funcionarioPrimerNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>funcionarioPrimerNombre</code> attribute.
    */

    public String getFuncionarioPrimerNombre()  {
    	String value;
        value =  funcionarioPrimerNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>funcionarioPrimerNombre</code> attribute.<br>
    * Model Attribute: <code>funcionarioPrimerNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param funcionarioPrimerNombre The new value of the <code>funcionarioPrimerNombre</code> attribute.
    */
    public void setFuncionarioPrimerNombre (String funcionarioPrimerNombre) {
        modifiedFuncionarioPrimerNombre = true;
        this.funcionarioPrimerNombre = funcionarioPrimerNombre;
    }

   /**
    * Returns the value of the <code>modifiedFuncionarioPrimerNombre</code> class property.<br>
    *
    * @return The value of the <code>modifiedFuncionarioPrimerNombre</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFuncionarioPrimerNombre() {
        return modifiedFuncionarioPrimerNombre;
    }

   /**
    * Sets the value of the <code>modifiedFuncionarioPrimerNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedFuncionarioPrimerNombre</code>.
    */
    public void setModifiedFuncionarioPrimerNombre(boolean modified) {
        this.modifiedFuncionarioPrimerNombre = modified;
    }

   /**
    * Returns the value of the <code>funcionarioSegundoNombre</code> attribute.<br>
    * Model Attribute: <code>funcionarioSegundoNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>funcionarioSegundoNombre</code> attribute.
    */

    public String getFuncionarioSegundoNombre()  {
    	String value;
        value =  funcionarioSegundoNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>funcionarioSegundoNombre</code> attribute.<br>
    * Model Attribute: <code>funcionarioSegundoNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param funcionarioSegundoNombre The new value of the <code>funcionarioSegundoNombre</code> attribute.
    */
    public void setFuncionarioSegundoNombre (String funcionarioSegundoNombre) {
        modifiedFuncionarioSegundoNombre = true;
        this.funcionarioSegundoNombre = funcionarioSegundoNombre;
    }

   /**
    * Returns the value of the <code>modifiedFuncionarioSegundoNombre</code> class property.<br>
    *
    * @return The value of the <code>modifiedFuncionarioSegundoNombre</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFuncionarioSegundoNombre() {
        return modifiedFuncionarioSegundoNombre;
    }

   /**
    * Sets the value of the <code>modifiedFuncionarioSegundoNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedFuncionarioSegundoNombre</code>.
    */
    public void setModifiedFuncionarioSegundoNombre(boolean modified) {
        this.modifiedFuncionarioSegundoNombre = modified;
    }

   /**
    * Returns the value of the <code>funcionarioPrimerApellido</code> attribute.<br>
    * Model Attribute: <code>funcionarioPrimerApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>funcionarioPrimerApellido</code> attribute.
    */

    public String getFuncionarioPrimerApellido()  {
    	String value;
        value =  funcionarioPrimerApellido;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>funcionarioPrimerApellido</code> attribute.<br>
    * Model Attribute: <code>funcionarioPrimerApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param funcionarioPrimerApellido The new value of the <code>funcionarioPrimerApellido</code> attribute.
    */
    public void setFuncionarioPrimerApellido (String funcionarioPrimerApellido) {
        modifiedFuncionarioPrimerApellido = true;
        this.funcionarioPrimerApellido = funcionarioPrimerApellido;
    }

   /**
    * Returns the value of the <code>modifiedFuncionarioPrimerApellido</code> class property.<br>
    *
    * @return The value of the <code>modifiedFuncionarioPrimerApellido</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFuncionarioPrimerApellido() {
        return modifiedFuncionarioPrimerApellido;
    }

   /**
    * Sets the value of the <code>modifiedFuncionarioPrimerApellido</code> class property.<br>
    * @param modified The new value of the <code>modifiedFuncionarioPrimerApellido</code>.
    */
    public void setModifiedFuncionarioPrimerApellido(boolean modified) {
        this.modifiedFuncionarioPrimerApellido = modified;
    }

   /**
    * Returns the value of the <code>funcionarioSegundoApellido</code> attribute.<br>
    * Model Attribute: <code>funcionarioSegundoApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>funcionarioSegundoApellido</code> attribute.
    */

    public String getFuncionarioSegundoApellido()  {
    	String value;
        value =  funcionarioSegundoApellido;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>funcionarioSegundoApellido</code> attribute.<br>
    * Model Attribute: <code>funcionarioSegundoApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param funcionarioSegundoApellido The new value of the <code>funcionarioSegundoApellido</code> attribute.
    */
    public void setFuncionarioSegundoApellido (String funcionarioSegundoApellido) {
        modifiedFuncionarioSegundoApellido = true;
        this.funcionarioSegundoApellido = funcionarioSegundoApellido;
    }

   /**
    * Returns the value of the <code>modifiedFuncionarioSegundoApellido</code> class property.<br>
    *
    * @return The value of the <code>modifiedFuncionarioSegundoApellido</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFuncionarioSegundoApellido() {
        return modifiedFuncionarioSegundoApellido;
    }

   /**
    * Sets the value of the <code>modifiedFuncionarioSegundoApellido</code> class property.<br>
    * @param modified The new value of the <code>modifiedFuncionarioSegundoApellido</code>.
    */
    public void setModifiedFuncionarioSegundoApellido(boolean modified) {
        this.modifiedFuncionarioSegundoApellido = modified;
    }

   /**
    * Returns the value of the <code>funcionariodrvNombreCompleto</code> attribute.<br>
    * Model Attribute: <code>funcionariodrvNombreCompleto</code>. Variable String Size=255<br>
    * Comments: <br>
    * @return The value of the <code>funcionariodrvNombreCompleto</code> attribute.
    */

    @JsonIgnore
    public String getFuncionariodrvNombreCompleto()  {
    	String value;
        try {
            value = funcionariodrvNombreCompletoDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Funcionario, Attribute: funcionariodrvNombreCompleto");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>funcionarioUsuarioLDAP</code> attribute.<br>
    * Model Attribute: <code>funcionarioUsuarioLDAP</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>funcionarioUsuarioLDAP</code> attribute.
    */

    public String getFuncionarioUsuarioLDAP()  {
    	String value;
        value =  funcionarioUsuarioLDAP;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>funcionarioUsuarioLDAP</code> attribute.<br>
    * Model Attribute: <code>funcionarioUsuarioLDAP</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param funcionarioUsuarioLDAP The new value of the <code>funcionarioUsuarioLDAP</code> attribute.
    */
    public void setFuncionarioUsuarioLDAP (String funcionarioUsuarioLDAP) {
        modifiedFuncionarioUsuarioLDAP = true;
        this.funcionarioUsuarioLDAP = funcionarioUsuarioLDAP;
    }

   /**
    * Returns the value of the <code>modifiedFuncionarioUsuarioLDAP</code> class property.<br>
    *
    * @return The value of the <code>modifiedFuncionarioUsuarioLDAP</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFuncionarioUsuarioLDAP() {
        return modifiedFuncionarioUsuarioLDAP;
    }

   /**
    * Sets the value of the <code>modifiedFuncionarioUsuarioLDAP</code> class property.<br>
    * @param modified The new value of the <code>modifiedFuncionarioUsuarioLDAP</code>.
    */
    public void setModifiedFuncionarioUsuarioLDAP(boolean modified) {
        this.modifiedFuncionarioUsuarioLDAP = modified;
    }

   /**
    * Returns the value of the <code>funcionarioEmail</code> attribute.<br>
    * Model Attribute: <code>funcionarioEmail</code>. Variable String Size=100<br>
    * Comments: <br>
    * @return The value of the <code>funcionarioEmail</code> attribute.
    */

    public String getFuncionarioEmail()  {
    	String value;
        value =  funcionarioEmail;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>funcionarioEmail</code> attribute.<br>
    * Model Attribute: <code>funcionarioEmail</code>. Variable String Size=100<br>
    * Comments: <br>
    * @param funcionarioEmail The new value of the <code>funcionarioEmail</code> attribute.
    */
    public void setFuncionarioEmail (String funcionarioEmail) {
        modifiedFuncionarioEmail = true;
        this.funcionarioEmail = funcionarioEmail;
    }

   /**
    * Returns the value of the <code>modifiedFuncionarioEmail</code> class property.<br>
    *
    * @return The value of the <code>modifiedFuncionarioEmail</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFuncionarioEmail() {
        return modifiedFuncionarioEmail;
    }

   /**
    * Sets the value of the <code>modifiedFuncionarioEmail</code> class property.<br>
    * @param modified The new value of the <code>modifiedFuncionarioEmail</code>.
    */
    public void setModifiedFuncionarioEmail(boolean modified) {
        this.modifiedFuncionarioEmail = modified;
    }

   /**
    * Returns the value of the <code>funcionarioCodJefe</code> attribute.<br>
    * Model Attribute: <code>funcionarioCodJefe</code>. Variable String Size=50<br>
    * Comments: Este atributo tomará valor si el agente es un Asesor que tiene responsable (JefeAsesores). En este caso, se le dará como valor el código de usuario del JefeAsesores. Se utilizará en fórmulas de VH de JefeAsesores.<br>
    * @return The value of the <code>funcionarioCodJefe</code> attribute.
    */

    public String getFuncionarioCodJefe()  {
    	String value;
        value =  funcionarioCodJefe;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>funcionarioCodJefe</code> attribute.<br>
    * Model Attribute: <code>funcionarioCodJefe</code>. Variable String Size=50<br>
    * Comments: Este atributo tomará valor si el agente es un Asesor que tiene responsable (JefeAsesores). En este caso, se le dará como valor el código de usuario del JefeAsesores. Se utilizará en fórmulas de VH de JefeAsesores.<br>
    * @param funcionarioCodJefe The new value of the <code>funcionarioCodJefe</code> attribute.
    */
    public void setFuncionarioCodJefe (String funcionarioCodJefe) {
        modifiedFuncionarioCodJefe = true;
        this.funcionarioCodJefe = funcionarioCodJefe;
    }

   /**
    * Returns the value of the <code>modifiedFuncionarioCodJefe</code> class property.<br>
    *
    * @return The value of the <code>modifiedFuncionarioCodJefe</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFuncionarioCodJefe() {
        return modifiedFuncionarioCodJefe;
    }

   /**
    * Sets the value of the <code>modifiedFuncionarioCodJefe</code> class property.<br>
    * @param modified The new value of the <code>modifiedFuncionarioCodJefe</code>.
    */
    public void setModifiedFuncionarioCodJefe(boolean modified) {
        this.modifiedFuncionarioCodJefe = modified;
    }

   /**
    * Returns the value of the <code>funcionariodrvNomJefe</code> attribute.<br>
    * Model Attribute: <code>funcionariodrvNomJefe</code>. Variable String Size=255<br>
    * Comments: Este atributo tomará valor si el agente es un Asesor que tiene responsable (JefeAsesores). En CodJefe se tendrá el código y aquí el nombre. Se necesita para el report de Solicitud. <br>
    * @return The value of the <code>funcionariodrvNomJefe</code> attribute.
    */

    @JsonIgnore
    public String getFuncionariodrvNomJefe()  {
    	String value;
        try {
            value = funcionariodrvNomJefeDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Funcionario, Attribute: funcionariodrvNomJefe");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>funcionariodrvNomAgencia</code> attribute.<br>
    * Model Attribute: <code>funcionariodrvNomAgencia</code>. Variable String Size=255<br>
    * Comments: Unicamente para Asesores de Agencia (manuales) e indica el nombre de la AGencia (Jefe del asesor)<br>
    * @return The value of the <code>funcionariodrvNomAgencia</code> attribute.
    */

    @JsonIgnore
    public String getFuncionariodrvNomAgencia()  {
    	String value;
        try {
            value = funcionariodrvNomAgenciaDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Funcionario, Attribute: funcionariodrvNomAgencia");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>funcionarioDisponible</code> attribute.<br>
    * Model Attribute: <code>funcionarioDisponible</code>. Variable Bool<br>
    * Comments: GdC-26 Req. 5: Marcación de usuarios no disponibles
Se requiere que sea posible marcar a los usuarios que no se encuentran disponibles. Por ejemplo, para usuarios que están de vacaciones, o que no han ido a trabajar por causa médica o porqué se encuentra en otro proceso, etc.
<Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>funcionarioDisponible</code> attribute.
    */

    public Boolean getFuncionarioDisponible()  {
    	Boolean value;
        value =  funcionarioDisponible;
        return value;
    }

   /**
    * Sets the value of the <code>funcionarioDisponible</code> attribute.<br>
    * Model Attribute: <code>funcionarioDisponible</code>. Variable Bool<br>
    * Comments: GdC-26 Req. 5: Marcación de usuarios no disponibles
Se requiere que sea posible marcar a los usuarios que no se encuentran disponibles. Por ejemplo, para usuarios que están de vacaciones, o que no han ido a trabajar por causa médica o porqué se encuentra en otro proceso, etc.
<Options>
RADIO=1;
</Options><br>
    * @param funcionarioDisponible The new value of the <code>funcionarioDisponible</code> attribute.
    */
    public void setFuncionarioDisponible (Boolean funcionarioDisponible) {
        modifiedFuncionarioDisponible = true;
        this.funcionarioDisponible = funcionarioDisponible;
    }

   /**
    * Returns the value of the <code>modifiedFuncionarioDisponible</code> class property.<br>
    *
    * @return The value of the <code>modifiedFuncionarioDisponible</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFuncionarioDisponible() {
        return modifiedFuncionarioDisponible;
    }

   /**
    * Sets the value of the <code>modifiedFuncionarioDisponible</code> class property.<br>
    * @param modified The new value of the <code>modifiedFuncionarioDisponible</code>.
    */
    public void setModifiedFuncionarioDisponible(boolean modified) {
        this.modifiedFuncionarioDisponible = modified;
    }

   /**
    * Returns the value of the <code>funcionarioNumSolNoTerminadas</code> attribute.<br>
    * Model Attribute: <code>funcionarioNumSolNoTerminadas</code>. Variable Nat<br>
    * Comments: GdC-26 Req. 6: Asignación automática de solicitudes
Indica el número de solicitudes no terminadas que tiene asignadas el usuario. Se utilizará en los procesos de asignación automática de usuarios a solicitudes<br>
    * @return The value of the <code>funcionarioNumSolNoTerminadas</code> attribute.
    */

    public Long getFuncionarioNumSolNoTerminadas()  {
    	Long value;
        value =  funcionarioNumSolNoTerminadas;
        return value;
    }

   /**
    * Sets the value of the <code>funcionarioNumSolNoTerminadas</code> attribute.<br>
    * Model Attribute: <code>funcionarioNumSolNoTerminadas</code>. Variable Nat<br>
    * Comments: GdC-26 Req. 6: Asignación automática de solicitudes
Indica el número de solicitudes no terminadas que tiene asignadas el usuario. Se utilizará en los procesos de asignación automática de usuarios a solicitudes<br>
    * @param funcionarioNumSolNoTerminadas The new value of the <code>funcionarioNumSolNoTerminadas</code> attribute.
    */
    public void setFuncionarioNumSolNoTerminadas (Long funcionarioNumSolNoTerminadas) {
        modifiedFuncionarioNumSolNoTerminadas = true;
        this.funcionarioNumSolNoTerminadas = funcionarioNumSolNoTerminadas;
    }

   /**
    * Returns the value of the <code>modifiedFuncionarioNumSolNoTerminadas</code> class property.<br>
    *
    * @return The value of the <code>modifiedFuncionarioNumSolNoTerminadas</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFuncionarioNumSolNoTerminadas() {
        return modifiedFuncionarioNumSolNoTerminadas;
    }

   /**
    * Sets the value of the <code>modifiedFuncionarioNumSolNoTerminadas</code> class property.<br>
    * @param modified The new value of the <code>modifiedFuncionarioNumSolNoTerminadas</code>.
    */
    public void setModifiedFuncionarioNumSolNoTerminadas(boolean modified) {
        this.modifiedFuncionarioNumSolNoTerminadas = modified;
    }

   /**
    * Returns the value of the <code>funcionariodrvEsAsesorIntegral</code> attribute.<br>
    * Model Attribute: <code>funcionariodrvEsAsesorIntegral</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>funcionariodrvEsAsesorIntegral</code> attribute.
    */

    @JsonIgnore
    public Boolean getFuncionariodrvEsAsesorIntegral()  {
    	Boolean value;
        try {
            value = funcionariodrvEsAsesorIntegralDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Funcionario, Attribute: funcionariodrvEsAsesorIntegral");
        }
        return value;
    }

   /**
    * Returns the value of the <code>funcionariodrvEsAfiliacion</code> attribute.<br>
    * Model Attribute: <code>funcionariodrvEsAfiliacion</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>funcionariodrvEsAfiliacion</code> attribute.
    */

    @JsonIgnore
    public Boolean getFuncionariodrvEsAfiliacion()  {
    	Boolean value;
        try {
            value = funcionariodrvEsAfiliacionDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Funcionario, Attribute: funcionariodrvEsAfiliacion");
        }
        return value;
    }

   /**
    * Returns the value of the <code>funcionarioIdSesion</code> attribute.<br>
    * Model Attribute: <code>funcionarioIdSesion</code>. Variable String Size=50<br>
    * Comments: Id de sesion para controlar la duplicidad de sesiones de usuario<br>
    * @return The value of the <code>funcionarioIdSesion</code> attribute.
    */

    public String getFuncionarioIdSesion()  {
    	String value;
        value =  funcionarioIdSesion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>funcionarioIdSesion</code> attribute.<br>
    * Model Attribute: <code>funcionarioIdSesion</code>. Variable String Size=50<br>
    * Comments: Id de sesion para controlar la duplicidad de sesiones de usuario<br>
    * @param funcionarioIdSesion The new value of the <code>funcionarioIdSesion</code> attribute.
    */
    public void setFuncionarioIdSesion (String funcionarioIdSesion) {
        modifiedFuncionarioIdSesion = true;
        this.funcionarioIdSesion = funcionarioIdSesion;
    }

   /**
    * Returns the value of the <code>modifiedFuncionarioIdSesion</code> class property.<br>
    *
    * @return The value of the <code>modifiedFuncionarioIdSesion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedFuncionarioIdSesion() {
        return modifiedFuncionarioIdSesion;
    }

   /**
    * Sets the value of the <code>modifiedFuncionarioIdSesion</code> class property.<br>
    * @param modified The new value of the <code>modifiedFuncionarioIdSesion</code>.
    */
    public void setModifiedFuncionarioIdSesion(boolean modified) {
        this.modifiedFuncionarioIdSesion = modified;
    }

   /**
    * Returns the value of the <code>asesorModDBasicosPersona</code> attribute.<br>
    * Model Attribute: <code>asesorModDBasicosPersona</code>. Variable Bool<br>
    * Comments: Parametrización propia de AE. Para registrar si un asesor puede modificar los datos básicos de persona o no. <br>
    * @return The value of the <code>asesorModDBasicosPersona</code> attribute.
    * @throws SystemException in case of any error.
    */
    @JsonProperty(value="moddbasicospersona")
    public Boolean getFuncionarioModDBasicosPersona() throws SystemException  {
        return getAsesorModDBasicosPersona();
    }

    @JsonIgnore
    public Boolean getAsesorModDBasicosPersona() throws SystemException  {
    	Boolean value;
        value = getAsesorFacet().getAsesorModDBasicosPersona();
        return value;
    }

   /**
    * Sets the value of the <code>asesorModDBasicosPersona</code> attribute.<br>
    * Model Attribute: <code>asesorModDBasicosPersona</code>. Variable Bool<br>
    * Comments: Parametrización propia de AE. Para registrar si un asesor puede modificar los datos básicos de persona o no. <br>
    * @param asesorModDBasicosPersona The new value of the <code>asesorModDBasicosPersona</code> attribute.
    * @throws SystemException in case of any error.
    */
    public void setAsesorModDBasicosPersona (Boolean asesorModDBasicosPersona) throws SystemException {
        getAsesorFacet().setAsesorModDBasicosPersona(asesorModDBasicosPersona);
    }

   /**
    * Returns the value of the <code>modifiedAsesorModDBasicosPersona</code> class property.<br>
    *
    * @return The value of the <code>modifiedAsesorModDBasicosPersona</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedAsesorModDBasicosPersona() throws SystemException {
        return getAsesorFacet().isModifiedAsesorModDBasicosPersona();
    }

   /**
    * Returns the value of the <code>asesormodificaDirector</code> attribute.<br>
    * Model Attribute: <code>asesormodificaDirector</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>asesormodificaDirector</code> attribute.
    * @throws SystemException in case of any error.
    */
    @JsonProperty(value="modificadirector")
    public Boolean getFuncionarioModificaDirector() throws SystemException  {
        return getAsesormodificaDirector();
    }

    @JsonIgnore
    public Boolean getAsesormodificaDirector() throws SystemException  {
    	Boolean value;
        value = getAsesorFacet().getAsesormodificaDirector();
        return value;
    }

   /**
    * Sets the value of the <code>asesormodificaDirector</code> attribute.<br>
    * Model Attribute: <code>asesormodificaDirector</code>. Variable Bool<br>
    * Comments: <br>
    * @param asesormodificaDirector The new value of the <code>asesormodificaDirector</code> attribute.
    * @throws SystemException in case of any error.
    */
    public void setAsesormodificaDirector (Boolean asesormodificaDirector) throws SystemException {
        getAsesorFacet().setAsesormodificaDirector(asesormodificaDirector);
    }

   /**
    * Returns the value of the <code>modifiedAsesormodificaDirector</code> class property.<br>
    *
    * @return The value of the <code>modifiedAsesormodificaDirector</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedAsesormodificaDirector() throws SystemException {
        return getAsesorFacet().isModifiedAsesormodificaDirector();
    }

   /**
    * Returns the value of the <code>asesoresDirector</code> attribute.<br>
    * Model Attribute: <code>asesoresDirector</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>asesoresDirector</code> attribute.
    * @throws SystemException in case of any error.
    */
    @JsonProperty(value="esdirector")
    public Boolean getFuncionarioEsDirector() throws SystemException  {
        return getAsesoresDirector();
    }

    @JsonIgnore
    public Boolean getAsesoresDirector() throws SystemException  {
    	Boolean value;
        value = getAsesorFacet().getAsesoresDirector();
        return value;
    }

   /**
    * Sets the value of the <code>asesoresDirector</code> attribute.<br>
    * Model Attribute: <code>asesoresDirector</code>. Variable Bool<br>
    * Comments: <br>
    * @param asesoresDirector The new value of the <code>asesoresDirector</code> attribute.
    * @throws SystemException in case of any error.
    */
    public void setAsesoresDirector (Boolean asesoresDirector) throws SystemException {
        getAsesorFacet().setAsesoresDirector(asesoresDirector);
    }

   /**
    * Returns the value of the <code>modifiedAsesoresDirector</code> class property.<br>
    *
    * @return The value of the <code>modifiedAsesoresDirector</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedAsesoresDirector() throws SystemException {
        return getAsesorFacet().isModifiedAsesoresDirector();
    }

   /**
    * Returns the value of the <code>asesorNumIdentificacion</code> attribute.<br>
    * Model Attribute: <code>asesorNumIdentificacion</code>. Variable String Size=60<br>
    * Comments: <br>
    * @return The value of the <code>asesorNumIdentificacion</code> attribute.
    * @throws SystemException in case of any error.
    */
    @JsonProperty(value="numidentificacion")
    public String getFuncionarioNumIdentificacion() throws SystemException  {
        return getAsesorNumIdentificacion();
    }

    @JsonIgnore
    public String getAsesorNumIdentificacion() throws SystemException  {
    	String value;
        value = getAsesorFacet().getAsesorNumIdentificacion();
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>asesorNumIdentificacion</code> attribute.<br>
    * Model Attribute: <code>asesorNumIdentificacion</code>. Variable String Size=60<br>
    * Comments: <br>
    * @param asesorNumIdentificacion The new value of the <code>asesorNumIdentificacion</code> attribute.
    * @throws SystemException in case of any error.
    */
    public void setAsesorNumIdentificacion (String asesorNumIdentificacion) throws SystemException {
        getAsesorFacet().setAsesorNumIdentificacion(asesorNumIdentificacion);
    }

   /**
    * Returns the value of the <code>modifiedAsesorNumIdentificacion</code> class property.<br>
    *
    * @return The value of the <code>modifiedAsesorNumIdentificacion</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedAsesorNumIdentificacion() throws SystemException {
        return getAsesorFacet().isModifiedAsesorNumIdentificacion();
    }

   /**
    * Returns the value of the <code>asesorEsIntegral</code> attribute.<br>
    * Model Attribute: <code>asesorEsIntegral</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>asesorEsIntegral</code> attribute.
    * @throws SystemException in case of any error.
    */
    @JsonProperty(value="esintegral")
    public Boolean getFuncionarioEsIntegral() throws SystemException  {
        return getAsesorEsIntegral();
    }

    @JsonIgnore
    public Boolean getAsesorEsIntegral() throws SystemException  {
    	Boolean value;
        value = getAsesorFacet().getAsesorEsIntegral();
        return value;
    }

   /**
    * Sets the value of the <code>asesorEsIntegral</code> attribute.<br>
    * Model Attribute: <code>asesorEsIntegral</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @param asesorEsIntegral The new value of the <code>asesorEsIntegral</code> attribute.
    * @throws SystemException in case of any error.
    */
    public void setAsesorEsIntegral (Boolean asesorEsIntegral) throws SystemException {
        getAsesorFacet().setAsesorEsIntegral(asesorEsIntegral);
    }

   /**
    * Returns the value of the <code>modifiedAsesorEsIntegral</code> class property.<br>
    *
    * @return The value of the <code>modifiedAsesorEsIntegral</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedAsesorEsIntegral() throws SystemException {
        return getAsesorFacet().isModifiedAsesorEsIntegral();
    }

   /**
    * Returns the value of the <code>asesorVerDBasicosPersona</code> attribute.<br>
    * Model Attribute: <code>asesorVerDBasicosPersona</code>. Variable Bool<br>
    * Comments: GdC-36: Req 5: Se requiere incluir en la paramétrica de usuarios de asesores de agencias, asesores y directores y asesores una columna que indique SI/NO se puede visualizar los datos básicos de usuarios (Información del contratante o información de personas a afiliar) para inclusiones y nueva afiliación.<br>
    * @return The value of the <code>asesorVerDBasicosPersona</code> attribute.
    * @throws SystemException in case of any error.
    */
    @JsonProperty(value="verdbasicospersona")
    public Boolean getFuncionarioVerDBasicosPersona() throws SystemException  {
        return getAsesorVerDBasicosPersona();
    }

    @JsonIgnore
    public Boolean getAsesorVerDBasicosPersona() throws SystemException  {
    	Boolean value;
        value = getAsesorFacet().getAsesorVerDBasicosPersona();
        return value;
    }

   /**
    * Sets the value of the <code>asesorVerDBasicosPersona</code> attribute.<br>
    * Model Attribute: <code>asesorVerDBasicosPersona</code>. Variable Bool<br>
    * Comments: GdC-36: Req 5: Se requiere incluir en la paramétrica de usuarios de asesores de agencias, asesores y directores y asesores una columna que indique SI/NO se puede visualizar los datos básicos de usuarios (Información del contratante o información de personas a afiliar) para inclusiones y nueva afiliación.<br>
    * @param asesorVerDBasicosPersona The new value of the <code>asesorVerDBasicosPersona</code> attribute.
    * @throws SystemException in case of any error.
    */
    public void setAsesorVerDBasicosPersona (Boolean asesorVerDBasicosPersona) throws SystemException {
        getAsesorFacet().setAsesorVerDBasicosPersona(asesorVerDBasicosPersona);
    }

   /**
    * Returns the value of the <code>modifiedAsesorVerDBasicosPersona</code> class property.<br>
    *
    * @return The value of the <code>modifiedAsesorVerDBasicosPersona</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedAsesorVerDBasicosPersona() throws SystemException {
        return getAsesorFacet().isModifiedAsesorVerDBasicosPersona();
    }

   /**
    * Returns the value of the <code>asesorVerDocIdentificacionPersona</code> attribute.<br>
    * Model Attribute: <code>asesorVerDocIdentificacionPersona</code>. Variable Bool<br>
    * Comments: GdC-36: Req 8: Se requiere incluir en la paramétrica de usuarios de asesores de agencias, asesores y directores y asesores una columna que indique SI/NO se pueden visualizar (abrir en otra pestaña del navegador o descargar) los documentos que se encuentran ya almacenados en el gestor documental (Información del contratante o información de personas a afiliar).<br>
    * @return The value of the <code>asesorVerDocIdentificacionPersona</code> attribute.
    * @throws SystemException in case of any error.
    */
    @JsonProperty(value="verdocidentificacionpersona")
    public Boolean getFuncionarioVerDocIdentificacionPersona() throws SystemException  {
        return getAsesorVerDocIdentificacionPersona();
    }

    @JsonIgnore
    public Boolean getAsesorVerDocIdentificacionPersona() throws SystemException  {
    	Boolean value;
        value = getAsesorFacet().getAsesorVerDocIdentificacionPersona();
        return value;
    }

   /**
    * Sets the value of the <code>asesorVerDocIdentificacionPersona</code> attribute.<br>
    * Model Attribute: <code>asesorVerDocIdentificacionPersona</code>. Variable Bool<br>
    * Comments: GdC-36: Req 8: Se requiere incluir en la paramétrica de usuarios de asesores de agencias, asesores y directores y asesores una columna que indique SI/NO se pueden visualizar (abrir en otra pestaña del navegador o descargar) los documentos que se encuentran ya almacenados en el gestor documental (Información del contratante o información de personas a afiliar).<br>
    * @param asesorVerDocIdentificacionPersona The new value of the <code>asesorVerDocIdentificacionPersona</code> attribute.
    * @throws SystemException in case of any error.
    */
    public void setAsesorVerDocIdentificacionPersona (Boolean asesorVerDocIdentificacionPersona) throws SystemException {
        getAsesorFacet().setAsesorVerDocIdentificacionPersona(asesorVerDocIdentificacionPersona);
    }

   /**
    * Returns the value of the <code>modifiedAsesorVerDocIdentificacionPersona</code> class property.<br>
    *
    * @return The value of the <code>modifiedAsesorVerDocIdentificacionPersona</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedAsesorVerDocIdentificacionPersona() throws SystemException {
        return getAsesorFacet().isModifiedAsesorVerDocIdentificacionPersona();
    }

   /**
    * Returns the value of the <code>asesorVerContratoNovedad</code> attribute.<br>
    * Model Attribute: <code>asesorVerContratoNovedad</code>. Variable Bool<br>
    * Comments: GdC-36: Req 9: Se requiere incluir en la paramétrica de usuarios de asesores de agencias, asesores y directores y asesores una columna que indique SI/NO se puede visualizar la información correspondiente al contrato ingresado en la opción NOVEDADES (Ya sea Colectivo o Familiar)<br>
    * @return The value of the <code>asesorVerContratoNovedad</code> attribute.
    * @throws SystemException in case of any error.
    */
    @JsonProperty(value="vercontratonovedad")
    public Boolean getFuncionarioVerContratoNovedad() throws SystemException  {
        return getAsesorVerContratoNovedad();
    }

    @JsonIgnore
    public Boolean getAsesorVerContratoNovedad() throws SystemException  {
    	Boolean value;
        value = getAsesorFacet().getAsesorVerContratoNovedad();
        return value;
    }

   /**
    * Sets the value of the <code>asesorVerContratoNovedad</code> attribute.<br>
    * Model Attribute: <code>asesorVerContratoNovedad</code>. Variable Bool<br>
    * Comments: GdC-36: Req 9: Se requiere incluir en la paramétrica de usuarios de asesores de agencias, asesores y directores y asesores una columna que indique SI/NO se puede visualizar la información correspondiente al contrato ingresado en la opción NOVEDADES (Ya sea Colectivo o Familiar)<br>
    * @param asesorVerContratoNovedad The new value of the <code>asesorVerContratoNovedad</code> attribute.
    * @throws SystemException in case of any error.
    */
    public void setAsesorVerContratoNovedad (Boolean asesorVerContratoNovedad) throws SystemException {
        getAsesorFacet().setAsesorVerContratoNovedad(asesorVerContratoNovedad);
    }

   /**
    * Returns the value of the <code>modifiedAsesorVerContratoNovedad</code> class property.<br>
    *
    * @return The value of the <code>modifiedAsesorVerContratoNovedad</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedAsesorVerContratoNovedad() throws SystemException {
        return getAsesorFacet().isModifiedAsesorVerContratoNovedad();
    }

   /**
    * Returns the value of the <code>asesorCanalComercial</code> attribute.<br>
    * Model Attribute: <code>asesorCanalComercial</code>. Variable String Size=50<br>
    * Comments: GdC-36. Req 7<br>
    * @return The value of the <code>asesorCanalComercial</code> attribute.
    * @throws SystemException in case of any error.
    */
    @JsonProperty(value="canalcomercial")
    public String getFuncionarioCanalComercial() throws SystemException  {
        return getAsesorCanalComercial();
    }

    @JsonIgnore
    public String getAsesorCanalComercial() throws SystemException  {
    	String value;
        value = getAsesorFacet().getAsesorCanalComercial();
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>asesorCanalComercial</code> attribute.<br>
    * Model Attribute: <code>asesorCanalComercial</code>. Variable String Size=50<br>
    * Comments: GdC-36. Req 7<br>
    * @param asesorCanalComercial The new value of the <code>asesorCanalComercial</code> attribute.
    * @throws SystemException in case of any error.
    */
    public void setAsesorCanalComercial (String asesorCanalComercial) throws SystemException {
        getAsesorFacet().setAsesorCanalComercial(asesorCanalComercial);
    }

   /**
    * Returns the value of the <code>modifiedAsesorCanalComercial</code> class property.<br>
    *
    * @return The value of the <code>modifiedAsesorCanalComercial</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedAsesorCanalComercial() throws SystemException {
        return getAsesorFacet().isModifiedAsesorCanalComercial();
    }

   /**
    * Returns the value of the <code>asesorCargo</code> attribute.<br>
    * Model Attribute: <code>asesorCargo</code>. Variable String Size=50<br>
    * Comments: GdC-36. Req 7<br>
    * @return The value of the <code>asesorCargo</code> attribute.
    * @throws SystemException in case of any error.
    */
    @JsonProperty(value="cargo")
    public String getFuncionarioCargo() throws SystemException  {
        return getAsesorCargo();
    }

    @JsonIgnore
    public String getAsesorCargo() throws SystemException  {
    	String value;
        value = getAsesorFacet().getAsesorCargo();
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>asesorCargo</code> attribute.<br>
    * Model Attribute: <code>asesorCargo</code>. Variable String Size=50<br>
    * Comments: GdC-36. Req 7<br>
    * @param asesorCargo The new value of the <code>asesorCargo</code> attribute.
    * @throws SystemException in case of any error.
    */
    public void setAsesorCargo (String asesorCargo) throws SystemException {
        getAsesorFacet().setAsesorCargo(asesorCargo);
    }

   /**
    * Returns the value of the <code>modifiedAsesorCargo</code> class property.<br>
    *
    * @return The value of the <code>modifiedAsesorCargo</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedAsesorCargo() throws SystemException {
        return getAsesorFacet().isModifiedAsesorCargo();
    }

   /**
    * Returns the value of the <code>asesorEstado</code> attribute.<br>
    * Model Attribute: <code>asesorEstado</code>. Variable String Size=50<br>
    * Comments: GdC-36. Req 7<br>
    * @return The value of the <code>asesorEstado</code> attribute.
    * @throws SystemException in case of any error.
    */
    @JsonProperty(value="estado")
    public String getFuncionarioEstado() throws SystemException  {
        return getAsesorEstado();
    }

    @JsonIgnore
    public String getAsesorEstado() throws SystemException  {
    	String value;
        value = getAsesorFacet().getAsesorEstado();
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>asesorEstado</code> attribute.<br>
    * Model Attribute: <code>asesorEstado</code>. Variable String Size=50<br>
    * Comments: GdC-36. Req 7<br>
    * @param asesorEstado The new value of the <code>asesorEstado</code> attribute.
    * @throws SystemException in case of any error.
    */
    public void setAsesorEstado (String asesorEstado) throws SystemException {
        getAsesorFacet().setAsesorEstado(asesorEstado);
    }

   /**
    * Returns the value of the <code>modifiedAsesorEstado</code> class property.<br>
    *
    * @return The value of the <code>modifiedAsesorEstado</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedAsesorEstado() throws SystemException {
        return getAsesorFacet().isModifiedAsesorEstado();
    }

   /**
    * Returns the value of the <code>asesorAccesoValidadorUsuarios</code> attribute.<br>
    * Model Attribute: <code>asesorAccesoValidadorUsuarios</code>. Variable Bool<br>
    * Comments: GdC-40 req 4: Configuración del 'Validador de Usuarios' para rol Asesor<br>
    * @return The value of the <code>asesorAccesoValidadorUsuarios</code> attribute.
    * @throws SystemException in case of any error.
    */
    @JsonProperty(value="accesovalidadorusuarios")
    public Boolean getFuncionarioAccesoValidadorUsuarios() throws SystemException  {
        return getAsesorAccesoValidadorUsuarios();
    }

    @JsonIgnore
    public Boolean getAsesorAccesoValidadorUsuarios() throws SystemException  {
    	Boolean value;
        value = getAsesorFacet().getAsesorAccesoValidadorUsuarios();
        return value;
    }

   /**
    * Sets the value of the <code>asesorAccesoValidadorUsuarios</code> attribute.<br>
    * Model Attribute: <code>asesorAccesoValidadorUsuarios</code>. Variable Bool<br>
    * Comments: GdC-40 req 4: Configuración del 'Validador de Usuarios' para rol Asesor<br>
    * @param asesorAccesoValidadorUsuarios The new value of the <code>asesorAccesoValidadorUsuarios</code> attribute.
    * @throws SystemException in case of any error.
    */
    public void setAsesorAccesoValidadorUsuarios (Boolean asesorAccesoValidadorUsuarios) throws SystemException {
        getAsesorFacet().setAsesorAccesoValidadorUsuarios(asesorAccesoValidadorUsuarios);
    }

   /**
    * Returns the value of the <code>modifiedAsesorAccesoValidadorUsuarios</code> class property.<br>
    *
    * @return The value of the <code>modifiedAsesorAccesoValidadorUsuarios</code> class property.
    * @throws SystemException in case of any error.
    */
    @JsonIgnore
    public boolean isModifiedAsesorAccesoValidadorUsuarios() throws SystemException {
        return getAsesorFacet().isModifiedAsesorAccesoValidadorUsuarios();
    }

   /**
    * Returns the password of this agent entity.
    * @return password of this agent entity
    */
    public String getPassWord() {
        return passWord;
    }

   /**
    * Sets the password of this agent entity.
    * @param passWord Password of this agent entity
    */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
        this.modifiedPassWord = true;
    }

    /**
     * Returns the value of the <code>modifiedPassWord</code> class property.<br>
     * @return The value of the <code>modifiedPassWord</code> class property.
     */
    @JsonIgnore
    public boolean isModifiedPassWord() {
        return modifiedPassWord;
    }

    /**
     * Returns the instance of <code>Solicitud</code> related through the <code>Solicitudes</code> role.
     * Model Relationship:
     * <code>[Solicitud] Solicitudes 0:M  ------ 1:1  Agente [Funcionario]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Solicitud</code> related through the <code>Solicitudes</code> role.
     */
    @JsonIgnore
    public Collection <Solicitud> getSolicitudes() {
        return getSolicitudRepository().findByAgente(this);
    }

    /**
     * Adds an instance of <code>Solicitud</code> related through the <code>Solicitudes</code> role.
     * @param solicitudes The instance to add to the <code>Solicitudes</code> role.
     */
    public void add2Solicitudes(Solicitud solicitudes) {
        this.solicitudes.add(solicitudes);
    }
    /**
     * Removes an instance of <code>Solicitud</code> related through the <code>Solicitudes</code> role.
     * @param solicitudes The instance to be removed
     */
    public void removeFromSolicitudes(Solicitud solicitudes) {
    	this.solicitudes.remove(solicitudes);
    }
    /**
     * Sets instances of <code>Solicitud</code> related through the <code>Solicitudes</code> role.
     * @param solicitudes The new value for the <code>Solicitudes</code> role.
     */
    public void setSolicitudes(Collection < Solicitud > solicitudes) {
        this.solicitudes = solicitudes;
    }

   /**
    * This method gets the attribute value <code>modifiedSolicitudes</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedSolicitudes</code> has been modified.
    */
    public boolean isModifiedSolicitudes(){
        return modifiedSolicitudes;
    }

    /**
     * Returns the instance of <code>Solicitud</code> related through the <code>SolicitudesAfiliacion</code> role.
     * Model Relationship:
     * <code>[Solicitud] SolicitudesAfiliacion 0:M  ------ 0:1  UsrAfiliacion [Funcionario]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Solicitud</code> related through the <code>SolicitudesAfiliacion</code> role.
     */
    @JsonIgnore
    public Collection <Solicitud> getSolicitudesAfiliacion() {
        return getSolicitudRepository().findByUsrAfiliacion(this);
    }

    /**
     * Adds an instance of <code>Solicitud</code> related through the <code>SolicitudesAfiliacion</code> role.
     * @param solicitudesAfiliacion The instance to add to the <code>SolicitudesAfiliacion</code> role.
     */
    public void add2SolicitudesAfiliacion(Solicitud solicitudesAfiliacion) {
        this.solicitudesAfiliacion.add(solicitudesAfiliacion);
    }
    /**
     * Removes an instance of <code>Solicitud</code> related through the <code>SolicitudesAfiliacion</code> role.
     * @param solicitudesAfiliacion The instance to be removed
     */
    public void removeFromSolicitudesAfiliacion(Solicitud solicitudesAfiliacion) {
    	this.solicitudesAfiliacion.remove(solicitudesAfiliacion);
    }
    /**
     * Sets instances of <code>Solicitud</code> related through the <code>SolicitudesAfiliacion</code> role.
     * @param solicitudesAfiliacion The new value for the <code>SolicitudesAfiliacion</code> role.
     */
    public void setSolicitudesAfiliacion(Collection < Solicitud > solicitudesAfiliacion) {
        this.solicitudesAfiliacion = solicitudesAfiliacion;
    }

   /**
    * This method gets the attribute value <code>modifiedSolicitudesAfiliacion</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedSolicitudesAfiliacion</code> has been modified.
    */
    public boolean isModifiedSolicitudesAfiliacion(){
        return modifiedSolicitudesAfiliacion;
    }

    /**
     * Returns the instance of <code>ObsEstado</code> related through the <code>ObsEstado</code> role.
     * Model Relationship:
     * <code>[ObsEstado] ObsEstado 0:M  ------ 1:1  Agente [Funcionario]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>ObsEstado</code> related through the <code>ObsEstado</code> role.
     */
    @JsonIgnore
    public Collection <ObsEstado> getObsEstado() {
        return getObsEstadoRepository().findByAgente(this);
    }

    /**
     * Adds an instance of <code>ObsEstado</code> related through the <code>ObsEstado</code> role.
     * @param obsEstado The instance to add to the <code>ObsEstado</code> role.
     */
    public void add2ObsEstado(ObsEstado obsEstado) {
        this.obsEstado.add(obsEstado);
    }
    /**
     * Removes an instance of <code>ObsEstado</code> related through the <code>ObsEstado</code> role.
     * @param obsEstado The instance to be removed
     */
    public void removeFromObsEstado(ObsEstado obsEstado) {
    	this.obsEstado.remove(obsEstado);
    }
    /**
     * Sets instances of <code>ObsEstado</code> related through the <code>ObsEstado</code> role.
     * @param obsEstado The new value for the <code>ObsEstado</code> role.
     */
    public void setObsEstado(Collection < ObsEstado > obsEstado) {
        this.obsEstado = obsEstado;
    }

   /**
    * This method gets the attribute value <code>modifiedObsEstado</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedObsEstado</code> has been modified.
    */
    public boolean isModifiedObsEstado(){
        return modifiedObsEstado;
    }

    /**
     * Returns the instance of <code>ReportesProcAlm</code> related through the <code>Reportes</code> role.
     * Model Relationship:
     * <code>[ReportesProcAlm] Reportes 0:M  ------ 0:M  Funcionarios [Funcionario]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>ReportesProcAlm</code> related through the <code>Reportes</code> role.
     */
    @JsonIgnore
    public Collection <ReportesProcAlm> getReportes() {
        return reportes;
    }

    /**
     * Adds an instance of <code>ReportesProcAlm</code> related through the <code>Reportes</code> role.
     * @param reportes The instance to add to the <code>Reportes</code> role.
     */
    public void add2Reportes(ReportesProcAlm reportes) {
        this.reportes.add(reportes);
    }
    /**
     * Removes an instance of <code>ReportesProcAlm</code> related through the <code>Reportes</code> role.
     * @param reportes The instance to be removed
     */
    public void removeFromReportes(ReportesProcAlm reportes) {
    	this.reportes.remove(reportes);
    }
    /**
     * Sets instances of <code>ReportesProcAlm</code> related through the <code>Reportes</code> role.
     * @param reportes The new value for the <code>Reportes</code> role.
     */
    public void setReportes(Collection < ReportesProcAlm > reportes) {
        this.reportes = reportes;
    }

   /**
    * This method gets the attribute value <code>modifiedReportes</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedReportes</code> has been modified.
    */
    public boolean isModifiedReportes(){
        return modifiedReportes;
    }

    /**
     * Returns the instance of <code>SolicitudNovedad</code> related through the <code>SolicitudesNovedad</code> role.
     * Model Relationship:
     * <code>[SolicitudNovedad] SolicitudesNovedad 0:M  ------ 1:1  Agente [Funcionario]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>SolicitudNovedad</code> related through the <code>SolicitudesNovedad</code> role.
     */
    @JsonIgnore
    public Collection <SolicitudNovedad> getSolicitudesNovedad() {
        return solicitudesNovedad;
    }

    /**
     * Adds an instance of <code>SolicitudNovedad</code> related through the <code>SolicitudesNovedad</code> role.
     * @param solicitudesNovedad The instance to add to the <code>SolicitudesNovedad</code> role.
     */
    public void add2SolicitudesNovedad(SolicitudNovedad solicitudesNovedad) {
        this.solicitudesNovedad.add(solicitudesNovedad);
    }
    /**
     * Removes an instance of <code>SolicitudNovedad</code> related through the <code>SolicitudesNovedad</code> role.
     * @param solicitudesNovedad The instance to be removed
     */
    public void removeFromSolicitudesNovedad(SolicitudNovedad solicitudesNovedad) {
    	this.solicitudesNovedad.remove(solicitudesNovedad);
    }
    /**
     * Sets instances of <code>SolicitudNovedad</code> related through the <code>SolicitudesNovedad</code> role.
     * @param solicitudesNovedad The new value for the <code>SolicitudesNovedad</code> role.
     */
    public void setSolicitudesNovedad(Collection < SolicitudNovedad > solicitudesNovedad) {
        this.solicitudesNovedad = solicitudesNovedad;
    }

   /**
    * This method gets the attribute value <code>modifiedSolicitudesNovedad</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedSolicitudesNovedad</code> has been modified.
    */
    public boolean isModifiedSolicitudesNovedad(){
        return modifiedSolicitudesNovedad;
    }

    /**
     * Returns the instance of <code>SolicitudNovedad</code> related through the <code>SolNovAifliaciones</code> role.
     * Model Relationship:
     * <code>[SolicitudNovedad] SolNovAifliaciones 0:M  ------ 0:1  UsrAfiliacion [Funcionario]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>SolicitudNovedad</code> related through the <code>SolNovAifliaciones</code> role.
     */
    @JsonIgnore
    public Collection <SolicitudNovedad> getSolNovAifliaciones() {
        return solNovAifliaciones;
    }

    /**
     * Adds an instance of <code>SolicitudNovedad</code> related through the <code>SolNovAifliaciones</code> role.
     * @param solNovAifliaciones The instance to add to the <code>SolNovAifliaciones</code> role.
     */
    public void add2SolNovAifliaciones(SolicitudNovedad solNovAifliaciones) {
        this.solNovAifliaciones.add(solNovAifliaciones);
    }
    /**
     * Removes an instance of <code>SolicitudNovedad</code> related through the <code>SolNovAifliaciones</code> role.
     * @param solNovAifliaciones The instance to be removed
     */
    public void removeFromSolNovAifliaciones(SolicitudNovedad solNovAifliaciones) {
    	this.solNovAifliaciones.remove(solNovAifliaciones);
    }
    /**
     * Sets instances of <code>SolicitudNovedad</code> related through the <code>SolNovAifliaciones</code> role.
     * @param solNovAifliaciones The new value for the <code>SolNovAifliaciones</code> role.
     */
    public void setSolNovAifliaciones(Collection < SolicitudNovedad > solNovAifliaciones) {
        this.solNovAifliaciones = solNovAifliaciones;
    }

   /**
    * This method gets the attribute value <code>modifiedSolNovAifliaciones</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedSolNovAifliaciones</code> has been modified.
    */
    public boolean isModifiedSolNovAifliaciones(){
        return modifiedSolNovAifliaciones;
    }

    /**
     * Returns the instance of <code>GrupoAsignacion</code> related through the <code>GrupoAsignacion</code> role.
     * Model Relationship:
     * <code>[GrupoAsignacion] GrupoAsignacion 0:M  ------ 0:M  Funcionario [Funcionario]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>GrupoAsignacion</code> related through the <code>GrupoAsignacion</code> role.
     */
    @JsonIgnore
    public Collection <GrupoAsignacion> getGrupoAsignacion() {
        return grupoAsignacion;
    }

    /**
     * Adds an instance of <code>GrupoAsignacion</code> related through the <code>GrupoAsignacion</code> role.
     * @param grupoAsignacion The instance to add to the <code>GrupoAsignacion</code> role.
     */
    public void add2GrupoAsignacion(GrupoAsignacion grupoAsignacion) {
        this.grupoAsignacion.add(grupoAsignacion);
    }
    /**
     * Removes an instance of <code>GrupoAsignacion</code> related through the <code>GrupoAsignacion</code> role.
     * @param grupoAsignacion The instance to be removed
     */
    public void removeFromGrupoAsignacion(GrupoAsignacion grupoAsignacion) {
    	this.grupoAsignacion.remove(grupoAsignacion);
    }
    /**
     * Sets instances of <code>GrupoAsignacion</code> related through the <code>GrupoAsignacion</code> role.
     * @param grupoAsignacion The new value for the <code>GrupoAsignacion</code> role.
     */
    public void setGrupoAsignacion(Collection < GrupoAsignacion > grupoAsignacion) {
        this.grupoAsignacion = grupoAsignacion;
    }

   /**
    * This method gets the attribute value <code>modifiedGrupoAsignacion</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedGrupoAsignacion</code> has been modified.
    */
    public boolean isModifiedGrupoAsignacion(){
        return modifiedGrupoAsignacion;
    }

    /**
     * Returns the instance of <code>LogFuncionario</code> related through the <code>LogFuncionario</code> role.
     * Model Relationship:
     * <code>[LogFuncionario] LogFuncionario 0:M  ------ 1:1  Funcionario [Funcionario]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>LogFuncionario</code> related through the <code>LogFuncionario</code> role.
     */
    @JsonIgnore
    public Collection <LogFuncionario> getLogFuncionario() {
        return logFuncionario;
    }

    /**
     * Adds an instance of <code>LogFuncionario</code> related through the <code>LogFuncionario</code> role.
     * @param logFuncionario The instance to add to the <code>LogFuncionario</code> role.
     */
    public void add2LogFuncionario(LogFuncionario logFuncionario) {
        this.logFuncionario.add(logFuncionario);
    }
    /**
     * Removes an instance of <code>LogFuncionario</code> related through the <code>LogFuncionario</code> role.
     * @param logFuncionario The instance to be removed
     */
    public void removeFromLogFuncionario(LogFuncionario logFuncionario) {
    	this.logFuncionario.remove(logFuncionario);
    }
    /**
     * Sets instances of <code>LogFuncionario</code> related through the <code>LogFuncionario</code> role.
     * @param logFuncionario The new value for the <code>LogFuncionario</code> role.
     */
    public void setLogFuncionario(Collection < LogFuncionario > logFuncionario) {
        this.logFuncionario = logFuncionario;
    }

   /**
    * This method gets the attribute value <code>modifiedLogFuncionario</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedLogFuncionario</code> has been modified.
    */
    public boolean isModifiedLogFuncionario(){
        return modifiedLogFuncionario;
    }

    /**
     * Returns the instance of <code>ContratoC</code> related through the <code>ContratosC</code> role.
     * Model Relationship:
     * <code>[ContratoC] ContratosC 0:M  ------ 0:1  AsesorC [Funcionario]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>ContratoC</code> related through the <code>ContratosC</code> role.
     */
    @JsonIgnore
    public Collection <ContratoC> getContratosC() {
        return (getChildAsesor() != null ? getChildAsesor().getContratosC() : null);
    }

    /**
     * Returns the instance of <code>AgentexProducto</code> related through the <code>AgentexProducto</code> role.
     * Model Relationship:
     * <code>[AgentexProducto] AgentexProducto 0:M  ------ 1:1  Asesor [Funcionario]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>AgentexProducto</code> related through the <code>AgentexProducto</code> role.
     */
    @JsonIgnore
    public Collection <AgentexProducto> getAgentexProducto() {
        return (getChildAsesor() != null ? getChildAsesor().getAgentexProducto() : null);
    }

    /**
     * Returns the instance of <code>LogInformacionAsesor</code> related through the <code>LogInformacionAsesor</code> role.
     * Model Relationship:
     * <code>[LogInformacionAsesor] LogInformacionAsesor 0:M  ------ 1:1  Asesor [Funcionario]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>LogInformacionAsesor</code> related through the <code>LogInformacionAsesor</code> role.
     */
    @JsonIgnore
    public Collection <LogInformacionAsesor> getLogInformacionAsesor() {
        return (getChildAsesor() != null ? getChildAsesor().getLogInformacionAsesor() : null);
    }

    /**
     * Returns the instance of <code>LogHistoricoPlanes</code> related through the <code>LogHistoricoPlanes</code> role.
     * Model Relationship:
     * <code>[LogHistoricoPlanes] LogHistoricoPlanes 0:M  ------ 1:1  Asesor [Funcionario]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>LogHistoricoPlanes</code> related through the <code>LogHistoricoPlanes</code> role.
     */
    @JsonIgnore
    public Collection <LogHistoricoPlanes> getLogHistoricoPlanes() {
        return (getChildAsesor() != null ? getChildAsesor().getLogHistoricoPlanes() : null);
    }

    /**
     * Returns the instance of <code>Solicitud</code> related through the <code>SolicitudesArMe</code> role.
     * Model Relationship:
     * <code>[Solicitud] SolicitudesArMe 0:M  ------ 0:1  UsrAreaMedica [Funcionario]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Solicitud</code> related through the <code>SolicitudesArMe</code> role.
     */
    @JsonIgnore
    public Collection <Solicitud> getSolicitudesArMe() {
        return (getChildAreaMedica() != null ? getChildAreaMedica().getSolicitudesArMe() : null);
    }

    /**
     * Returns the instance of <code>Firma</code> related through the <code>Firma</code> role.
     * Model Relationship:
     * <code>[Firma] Firma 0:1  ------ 0:1  RespRegional [Funcionario]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Firma</code> related through the <code>Firma</code> role.
     */
    @JsonIgnore
    public Firma getFirma() {
        return (getChildRespRegional() != null ? getChildRespRegional().getFirma() : null);
    }

    /**
     * Returns the instance of <code>Rol</code> related through the <code>Rol</code> role.
     * Model Relationship:
     * <code>[Rol] Rol 1:1  ------ 0:M  Agentes [Funcionario]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Rol</code> related through the <code>Rol</code> role.
     */
    @JsonIgnore
    public Rol getRol() {
        return rol;
    }

    /**
     * Adds an instance of <code>Rol</code> related through the <code>Rol</code> role.
     * @param rol The instance to add to the <code>Rol</code> role.
     */
    public void add2Rol(Rol rol) {
        if (rol == null || rol.isNull()) {
            this.modifiedRol = true;
            this.rolIdentificador = null;
        } else {
            this.rolIdentificador = rol.getRolIdentificador();
        }
        this.rol = (rol == null  || rol.isNull() ? null : rol);
    }

   /**
    * This method gets the attribute value <code>modifiedRol</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedRol</code> has been modified.
    */
    public boolean isModifiedRol(){
        return modifiedRol;
    }

    /**
     * Returns the instance of <code>Sucursal</code> related through the <code>Sucursal</code> role.
     * Model Relationship:
     * <code>[Sucursal] Sucursal 1:1  ------ 0:M  Agentes [Funcionario]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Sucursal</code> related through the <code>Sucursal</code> role.
     */
    @JsonIgnore
    public Sucursal getSucursal() {
        return sucursal;
    }

    /**
     * Adds an instance of <code>Sucursal</code> related through the <code>Sucursal</code> role.
     * @param sucursal The instance to add to the <code>Sucursal</code> role.
     */
    public void add2Sucursal(Sucursal sucursal) {
        if (sucursal == null || sucursal.isNull()) {
            this.modifiedSucursal = true;
            this.sucursalCodigo = null;
        } else {
            this.sucursalCodigo = sucursal.getSucursalCodigo();
        }
        this.sucursal = (sucursal == null  || sucursal.isNull() ? null : sucursal);
    }

   /**
    * This method gets the attribute value <code>modifiedSucursal</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedSucursal</code> has been modified.
    */
    public boolean isModifiedSucursal(){
        return modifiedSucursal;
    }

    /**
     * Returns the instance of <code>TipoIdentificacion</code> related through the <code>TipoIdentificacion</code> role.
     * Model Relationship:
     * <code>[TipoIdentificacion] TipoIdentificacion 0:1  ------ 0:M  Asesores [Funcionario]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>TipoIdentificacion</code> related through the <code>TipoIdentificacion</code> role.
     */
    @JsonIgnore
    public TipoIdentificacion getTipoIdentificacion() {
        return (getChildAsesor() != null ? getChildAsesor().getTipoIdentificacion() : null);
    }

    /**
     * Returns the instance of <code>Planes</code> related through the <code>Planes</code> role.
     * Model Relationship:
     * <code>[Planes] Planes 0:M  ------ 0:M  Afiliaciones [Funcionario]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Planes</code> related through the <code>Planes</code> role.
     */
    @JsonIgnore
    public Collection <Planes> getPlanes() {
        return (getChildAfiliaciones() != null ? getChildAfiliaciones().getPlanes() : null);
    }

    /**
     * Returns the instance of <code>Regional</code> related through the <code>Regional</code> role.
     * Model Relationship:
     * <code>[Regional] Regional 0:1  ------ 0:1  RespRegional [Funcionario]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Regional</code> related through the <code>Regional</code> role.
     */
    @JsonIgnore
    public Regional getRegional() {
        return (getChildRespRegional() != null ? getChildRespRegional().getRegional() : null);
    }

    /**
     * Returns the facet <code>Admin</code> instance.
     *
     * @return The facet <code>Admin</code> instance. Null if this instance is 
               not specialized.
     */
    @JsonIgnore
    public Admin getChildAdmin() {
        if (childAdmin == null || childAdmin.isNull()) {
                this.setChildAdmin(getFuncionarioRepository().findChildAdmin(getOid().getFuncionarioId()));
        }
        return (childAdmin == null ? new Admin(null) : childAdmin);
    }

    /**
     * Sets the facet <code>Admin</code> instance.
     * @param childAdmin the facet of this object.
     */
    public void setChildAdmin (Admin childAdmin) {
        this.childAdmin = childAdmin;
    }

    /**
     * Returns the facet <code>SuperAdmin</code> instance.
     *
     * @return The facet <code>SuperAdmin</code> instance. Null if this instance is 
               not specialized.
     */
    @JsonIgnore
    public SuperAdmin getChildSuperAdmin() {
        if (childSuperAdmin == null || childSuperAdmin.isNull()) {
                this.setChildSuperAdmin(getFuncionarioRepository().findChildSuperAdmin(getOid().getFuncionarioId()));
        }
        return (childSuperAdmin == null ? new SuperAdmin(null) : childSuperAdmin);
    }

    /**
     * Sets the facet <code>SuperAdmin</code> instance.
     * @param childSuperAdmin the facet of this object.
     */
    public void setChildSuperAdmin (SuperAdmin childSuperAdmin) {
        this.childSuperAdmin = childSuperAdmin;
    }

    /**
     * Returns the facet <code>Asesor</code> instance.
     *
     * @return The facet <code>Asesor</code> instance. Null if this instance is 
               not specialized.
     */
    @JsonIgnore
    public Asesor getChildAsesor() {
        if (childAsesor == null || childAsesor.isNull()) {
                this.setChildAsesor(getFuncionarioRepository().findChildAsesor(getOid().getFuncionarioId()));
        }
        return (childAsesor == null ? new Asesor(null) : childAsesor);
    }

    /**
     * Sets the facet <code>Asesor</code> instance.
     * @param childAsesor the facet of this object.
     */
    public void setChildAsesor (Asesor childAsesor) {
        this.childAsesor = childAsesor;
    }

    /**
     * Returns the facet <code>AreaMedica</code> instance.
     *
     * @return The facet <code>AreaMedica</code> instance. Null if this instance is 
               not specialized.
     */
    @JsonIgnore
    public AreaMedica getChildAreaMedica() {
        if (childAreaMedica == null || childAreaMedica.isNull()) {
                this.setChildAreaMedica(getFuncionarioRepository().findChildAreaMedica(getOid().getFuncionarioId()));
        }
        return (childAreaMedica == null ? new AreaMedica(null) : childAreaMedica);
    }

    /**
     * Sets the facet <code>AreaMedica</code> instance.
     * @param childAreaMedica the facet of this object.
     */
    public void setChildAreaMedica (AreaMedica childAreaMedica) {
        this.childAreaMedica = childAreaMedica;
    }

    /**
     * Returns the facet <code>Afiliaciones</code> instance.
     *
     * @return The facet <code>Afiliaciones</code> instance. Null if this instance is 
               not specialized.
     */
    @JsonIgnore
    public Afiliaciones getChildAfiliaciones() {
        if (childAfiliaciones == null || childAfiliaciones.isNull()) {
                this.setChildAfiliaciones(getFuncionarioRepository().findChildAfiliaciones(getOid().getFuncionarioId()));
        }
        return (childAfiliaciones == null ? new Afiliaciones(null) : childAfiliaciones);
    }

    /**
     * Sets the facet <code>Afiliaciones</code> instance.
     * @param childAfiliaciones the facet of this object.
     */
    public void setChildAfiliaciones (Afiliaciones childAfiliaciones) {
        this.childAfiliaciones = childAfiliaciones;
    }

    /**
     * Returns the facet <code>RespRegional</code> instance.
     *
     * @return The facet <code>RespRegional</code> instance. Null if this instance is 
               not specialized.
     */
    @JsonIgnore
    public RespRegional getChildRespRegional() {
        if (childRespRegional == null || childRespRegional.isNull()) {
                this.setChildRespRegional(getFuncionarioRepository().findChildRespRegional(getOid().getFuncionarioId()));
        }
        return (childRespRegional == null ? new RespRegional(null) : childRespRegional);
    }

    /**
     * Sets the facet <code>RespRegional</code> instance.
     * @param childRespRegional the facet of this object.
     */
    public void setChildRespRegional (RespRegional childRespRegional) {
        this.childRespRegional = childRespRegional;
    }

    /**
     * Returns the facet <code>Gestor</code> instance.
     *
     * @return The facet <code>Gestor</code> instance. Null if this instance is 
               not specialized.
     */
    @JsonIgnore
    public Gestor getChildGestor() {
        if (childGestor == null || childGestor.isNull()) {
                this.setChildGestor(getFuncionarioRepository().findChildGestor(getOid().getFuncionarioId()));
        }
        return (childGestor == null ? new Gestor(null) : childGestor);
    }

    /**
     * Sets the facet <code>Gestor</code> instance.
     * @param childGestor the facet of this object.
     */
    public void setChildGestor (Gestor childGestor) {
        this.childGestor = childGestor;
    }

    /**
     * Returns the facet <code>MesaDeApoyo</code> instance.
     *
     * @return The facet <code>MesaDeApoyo</code> instance. Null if this instance is 
               not specialized.
     */
    @JsonIgnore
    public MesaDeApoyo getChildMesaDeApoyo() {
        if (childMesaDeApoyo == null || childMesaDeApoyo.isNull()) {
                this.setChildMesaDeApoyo(getFuncionarioRepository().findChildMesaDeApoyo(getOid().getFuncionarioId()));
        }
        return (childMesaDeApoyo == null ? new MesaDeApoyo(null) : childMesaDeApoyo);
    }

    /**
     * Sets the facet <code>MesaDeApoyo</code> instance.
     * @param childMesaDeApoyo the facet of this object.
     */
    public void setChildMesaDeApoyo (MesaDeApoyo childMesaDeApoyo) {
        this.childMesaDeApoyo = childMesaDeApoyo;
    }

    /**
     * Returns The Facet <code>Admin</code> of this instance in an inheritance net.
     * @return the Facet of <code>Admin</code> of this instance in an inheritance net.
     */
    @JsonIgnore
    public Admin getAdminFacet() {
            return getChildAdmin();
    }

    /**
     * Returns The Facet <code>SuperAdmin</code> of this instance in an inheritance net.
     * @return the Facet of <code>SuperAdmin</code> of this instance in an inheritance net.
     */
    @JsonIgnore
    public SuperAdmin getSuperAdminFacet() {
            return getChildSuperAdmin();
    }

    /**
     * Returns The Facet <code>Asesor</code> of this instance in an inheritance net.
     * @return the Facet of <code>Asesor</code> of this instance in an inheritance net.
     */
    @JsonIgnore
    public Asesor getAsesorFacet() {
            return getChildAsesor();
    }

    /**
     * Returns The Facet <code>AreaMedica</code> of this instance in an inheritance net.
     * @return the Facet of <code>AreaMedica</code> of this instance in an inheritance net.
     */
    @JsonIgnore
    public AreaMedica getAreaMedicaFacet() {
            return getChildAreaMedica();
    }

    /**
     * Returns The Facet <code>Afiliaciones</code> of this instance in an inheritance net.
     * @return the Facet of <code>Afiliaciones</code> of this instance in an inheritance net.
     */
    @JsonIgnore
    public Afiliaciones getAfiliacionesFacet() {
            return getChildAfiliaciones();
    }

    /**
     * Returns The Facet <code>RespRegional</code> of this instance in an inheritance net.
     * @return the Facet of <code>RespRegional</code> of this instance in an inheritance net.
     */
    @JsonIgnore
    public RespRegional getRespRegionalFacet() {
            return getChildRespRegional();
    }

    /**
     * Returns The Facet <code>Gestor</code> of this instance in an inheritance net.
     * @return the Facet of <code>Gestor</code> of this instance in an inheritance net.
     */
    @JsonIgnore
    public Gestor getGestorFacet() {
            return getChildGestor();
    }

    /**
     * Returns The Facet <code>MesaDeApoyo</code> of this instance in an inheritance net.
     * @return the Facet of <code>MesaDeApoyo</code> of this instance in an inheritance net.
     */
    @JsonIgnore
    public MesaDeApoyo getMesaDeApoyoFacet() {
            return getChildMesaDeApoyo();
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
     * Computes the value of the <code>funcionariodrvNombreCompleto</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>funcionariodrvNombreCompleto</code> derived attribute.
     */
    public String funcionariodrvNombreCompletoDerivations() {

        funcionariodrvNombreCompleto = null;

        // Potential derivation redefinitions in Admin
        if (!getAdminFacet().isNull()) {
            funcionariodrvNombreCompleto = (getAdminFacet().funcionariodrvNombreCompletoDerivations());
        }
        // Potential derivation redefinitions in SuperAdmin
        if (!getSuperAdminFacet().isNull()) {
            funcionariodrvNombreCompleto = (getSuperAdminFacet().funcionariodrvNombreCompletoDerivations());
        }
        // Potential derivation redefinitions in Asesor
        if (!getAsesorFacet().isNull()) {
            funcionariodrvNombreCompleto = (getAsesorFacet().funcionariodrvNombreCompletoDerivations());
        }
        // Potential derivation redefinitions in AreaMedica
        if (!getAreaMedicaFacet().isNull()) {
            funcionariodrvNombreCompleto = (getAreaMedicaFacet().funcionariodrvNombreCompletoDerivations());
        }
        // Potential derivation redefinitions in Afiliaciones
        if (!getAfiliacionesFacet().isNull()) {
            funcionariodrvNombreCompleto = (getAfiliacionesFacet().funcionariodrvNombreCompletoDerivations());
        }
        // Potential derivation redefinitions in RespRegional
        if (!getRespRegionalFacet().isNull()) {
            funcionariodrvNombreCompleto = (getRespRegionalFacet().funcionariodrvNombreCompletoDerivations());
        }
        // Potential derivation redefinitions in Gestor
        if (!getGestorFacet().isNull()) {
            funcionariodrvNombreCompleto = (getGestorFacet().funcionariodrvNombreCompletoDerivations());
        }
        // Potential derivation redefinitions in MesaDeApoyo
        if (!getMesaDeApoyoFacet().isNull()) {
            funcionariodrvNombreCompleto = (getMesaDeApoyoFacet().funcionariodrvNombreCompletoDerivations());
        }
        funcionariodrvNombreCompletoDerivationsDefault();
        return funcionariodrvNombreCompleto;
    }

    private void funcionariodrvNombreCompletoDerivationsDefault() {
        if (funcionariodrvNombreCompleto != null) return;
        // Default derivation
        // EFFECT   : fuconcatenarConNulos(\"\", PrimerNombre) + fuconcatenarConNulos(\" \", SegundoNombre) + fuconcatenarConNulos(\" \", PrimerApellido) + fuconcatenarConNulos(\" \", SegundoApellido)
        funcionariodrvNombreCompleto = userFunctionsSrv.fuconcatenarConNulosFun("", this.getFuncionarioPrimerNombre()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getFuncionarioSegundoNombre()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getFuncionarioPrimerApellido()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getFuncionarioSegundoApellido());
    }

    /**
     * Computes the value of the <code>funcionariodrvNomJefe</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>funcionariodrvNomJefe</code> derived attribute.
     */
    public String funcionariodrvNomJefeDerivations() {

        funcionariodrvNomJefe = null;

        // Potential derivation redefinitions in Admin
        if (!getAdminFacet().isNull()) {
            funcionariodrvNomJefe = (getAdminFacet().funcionariodrvNomJefeDerivations());
        }
        // Potential derivation redefinitions in SuperAdmin
        if (!getSuperAdminFacet().isNull()) {
            funcionariodrvNomJefe = (getSuperAdminFacet().funcionariodrvNomJefeDerivations());
        }
        // Potential derivation redefinitions in Asesor
        if (!getAsesorFacet().isNull()) {
            funcionariodrvNomJefe = (getAsesorFacet().funcionariodrvNomJefeDerivations());
        }
        // Potential derivation redefinitions in AreaMedica
        if (!getAreaMedicaFacet().isNull()) {
            funcionariodrvNomJefe = (getAreaMedicaFacet().funcionariodrvNomJefeDerivations());
        }
        // Potential derivation redefinitions in Afiliaciones
        if (!getAfiliacionesFacet().isNull()) {
            funcionariodrvNomJefe = (getAfiliacionesFacet().funcionariodrvNomJefeDerivations());
        }
        // Potential derivation redefinitions in RespRegional
        if (!getRespRegionalFacet().isNull()) {
            funcionariodrvNomJefe = (getRespRegionalFacet().funcionariodrvNomJefeDerivations());
        }
        // Potential derivation redefinitions in Gestor
        if (!getGestorFacet().isNull()) {
            funcionariodrvNomJefe = (getGestorFacet().funcionariodrvNomJefeDerivations());
        }
        // Potential derivation redefinitions in MesaDeApoyo
        if (!getMesaDeApoyoFacet().isNull()) {
            funcionariodrvNomJefe = (getMesaDeApoyoFacet().funcionariodrvNomJefeDerivations());
        }
        funcionariodrvNomJefeDerivationsConditional1();
        funcionariodrvNomJefeDerivationsDefault();
        return funcionariodrvNomJefe;
    }

    private void funcionariodrvNomJefeDerivationsConditional1() {
        if (funcionariodrvNomJefe != null) return;
        // CONDITION: CodJefe = NULL 
        // EFFECT   : \"\"
        boolean funcionariodrvNomJefeCond = this.getFuncionarioCodJefe() == null;
        if (funcionariodrvNomJefeCond) {
            funcionariodrvNomJefe = "";
        }
    }

    private void funcionariodrvNomJefeDerivationsDefault() {
        if (funcionariodrvNomJefe != null) return;
        // Default derivation
        // EFFECT   : fuGetNombreFuncionario(CodJefe)
        funcionariodrvNomJefe = userFunctionsSrv.fuGetNombreFuncionarioFun(this.getFuncionarioCodJefe());
    }

    /**
     * Computes the value of the <code>funcionariodrvNomAgencia</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>funcionariodrvNomAgencia</code> derived attribute.
     */
    public String funcionariodrvNomAgenciaDerivations() {

        funcionariodrvNomAgencia = null;

        // Potential derivation redefinitions in Admin
        if (!getAdminFacet().isNull()) {
            funcionariodrvNomAgencia = (getAdminFacet().funcionariodrvNomAgenciaDerivations());
        }
        // Potential derivation redefinitions in SuperAdmin
        if (!getSuperAdminFacet().isNull()) {
            funcionariodrvNomAgencia = (getSuperAdminFacet().funcionariodrvNomAgenciaDerivations());
        }
        // Potential derivation redefinitions in Asesor
        if (!getAsesorFacet().isNull()) {
            funcionariodrvNomAgencia = (getAsesorFacet().funcionariodrvNomAgenciaDerivations());
        }
        // Potential derivation redefinitions in AreaMedica
        if (!getAreaMedicaFacet().isNull()) {
            funcionariodrvNomAgencia = (getAreaMedicaFacet().funcionariodrvNomAgenciaDerivations());
        }
        // Potential derivation redefinitions in Afiliaciones
        if (!getAfiliacionesFacet().isNull()) {
            funcionariodrvNomAgencia = (getAfiliacionesFacet().funcionariodrvNomAgenciaDerivations());
        }
        // Potential derivation redefinitions in RespRegional
        if (!getRespRegionalFacet().isNull()) {
            funcionariodrvNomAgencia = (getRespRegionalFacet().funcionariodrvNomAgenciaDerivations());
        }
        // Potential derivation redefinitions in Gestor
        if (!getGestorFacet().isNull()) {
            funcionariodrvNomAgencia = (getGestorFacet().funcionariodrvNomAgenciaDerivations());
        }
        // Potential derivation redefinitions in MesaDeApoyo
        if (!getMesaDeApoyoFacet().isNull()) {
            funcionariodrvNomAgencia = (getMesaDeApoyoFacet().funcionariodrvNomAgenciaDerivations());
        }
        funcionariodrvNomAgenciaDerivationsConditional1();
        funcionariodrvNomAgenciaDerivationsDefault();
        return funcionariodrvNomAgencia;
    }

    private void funcionariodrvNomAgenciaDerivationsConditional1() {
        if (funcionariodrvNomAgencia != null) return;
        // CONDITION: Manual = FALSE
        // EFFECT   : \"\"
        boolean funcionariodrvNomAgenciaCond = this.getFuncionarioManual().equals(false);
        if (funcionariodrvNomAgenciaCond) {
            funcionariodrvNomAgencia = "";
        }
    }

    private void funcionariodrvNomAgenciaDerivationsDefault() {
        if (funcionariodrvNomAgencia != null) return;
        // Default derivation
        // EFFECT   : fuGetNombreAsesor(Usuario)
        funcionariodrvNomAgencia = userFunctionsSrv.fuGetNombreAsesorFun(this.getFuncionarioUsuario());
    }

    /**
     * Computes the value of the <code>funcionariodrvEsAsesorIntegral</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>funcionariodrvEsAsesorIntegral</code> derived attribute.
     */
    public Boolean funcionariodrvEsAsesorIntegralDerivations() {

        funcionariodrvEsAsesorIntegral = null;

        // Potential derivation redefinitions in Admin
        if (!getAdminFacet().isNull()) {
            funcionariodrvEsAsesorIntegral = (getAdminFacet().funcionariodrvEsAsesorIntegralDerivations());
        }
        // Potential derivation redefinitions in SuperAdmin
        if (!getSuperAdminFacet().isNull()) {
            funcionariodrvEsAsesorIntegral = (getSuperAdminFacet().funcionariodrvEsAsesorIntegralDerivations());
        }
        // Potential derivation redefinitions in Asesor
        if (!getAsesorFacet().isNull()) {
            funcionariodrvEsAsesorIntegral = (getAsesorFacet().funcionariodrvEsAsesorIntegralDerivations());
        }
        // Potential derivation redefinitions in AreaMedica
        if (!getAreaMedicaFacet().isNull()) {
            funcionariodrvEsAsesorIntegral = (getAreaMedicaFacet().funcionariodrvEsAsesorIntegralDerivations());
        }
        // Potential derivation redefinitions in Afiliaciones
        if (!getAfiliacionesFacet().isNull()) {
            funcionariodrvEsAsesorIntegral = (getAfiliacionesFacet().funcionariodrvEsAsesorIntegralDerivations());
        }
        // Potential derivation redefinitions in RespRegional
        if (!getRespRegionalFacet().isNull()) {
            funcionariodrvEsAsesorIntegral = (getRespRegionalFacet().funcionariodrvEsAsesorIntegralDerivations());
        }
        // Potential derivation redefinitions in Gestor
        if (!getGestorFacet().isNull()) {
            funcionariodrvEsAsesorIntegral = (getGestorFacet().funcionariodrvEsAsesorIntegralDerivations());
        }
        // Potential derivation redefinitions in MesaDeApoyo
        if (!getMesaDeApoyoFacet().isNull()) {
            funcionariodrvEsAsesorIntegral = (getMesaDeApoyoFacet().funcionariodrvEsAsesorIntegralDerivations());
        }
        funcionariodrvEsAsesorIntegralDerivationsDefault();
        return funcionariodrvEsAsesorIntegral;
    }

    private void funcionariodrvEsAsesorIntegralDerivationsDefault() {
        if (funcionariodrvEsAsesorIntegral != null) return;
        // Default derivation
        // EFFECT   : FALSE
        funcionariodrvEsAsesorIntegral = Boolean.FALSE;
    }

    /**
     * Computes the value of the <code>funcionariodrvEsAfiliacion</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>funcionariodrvEsAfiliacion</code> derived attribute.
     */
    public Boolean funcionariodrvEsAfiliacionDerivations() throws SystemException {

        funcionariodrvEsAfiliacion = null;

        // Potential derivation redefinitions in Admin
        if (!getAdminFacet().isNull()) {
            funcionariodrvEsAfiliacion = (getAdminFacet().funcionariodrvEsAfiliacionDerivations());
        }
        // Potential derivation redefinitions in SuperAdmin
        if (!getSuperAdminFacet().isNull()) {
            funcionariodrvEsAfiliacion = (getSuperAdminFacet().funcionariodrvEsAfiliacionDerivations());
        }
        // Potential derivation redefinitions in Asesor
        if (!getAsesorFacet().isNull()) {
            funcionariodrvEsAfiliacion = (getAsesorFacet().funcionariodrvEsAfiliacionDerivations());
        }
        // Potential derivation redefinitions in AreaMedica
        if (!getAreaMedicaFacet().isNull()) {
            funcionariodrvEsAfiliacion = (getAreaMedicaFacet().funcionariodrvEsAfiliacionDerivations());
        }
        // Potential derivation redefinitions in Afiliaciones
        if (!getAfiliacionesFacet().isNull()) {
            funcionariodrvEsAfiliacion = (getAfiliacionesFacet().funcionariodrvEsAfiliacionDerivations());
        }
        // Potential derivation redefinitions in RespRegional
        if (!getRespRegionalFacet().isNull()) {
            funcionariodrvEsAfiliacion = (getRespRegionalFacet().funcionariodrvEsAfiliacionDerivations());
        }
        // Potential derivation redefinitions in Gestor
        if (!getGestorFacet().isNull()) {
            funcionariodrvEsAfiliacion = (getGestorFacet().funcionariodrvEsAfiliacionDerivations());
        }
        // Potential derivation redefinitions in MesaDeApoyo
        if (!getMesaDeApoyoFacet().isNull()) {
            funcionariodrvEsAfiliacion = (getMesaDeApoyoFacet().funcionariodrvEsAfiliacionDerivations());
        }
        funcionariodrvEsAfiliacionDerivationsConditional1();
        funcionariodrvEsAfiliacionDerivationsDefault();
        return funcionariodrvEsAfiliacion;
    }

    private void funcionariodrvEsAfiliacionDerivationsConditional1() throws SystemException {
        if (funcionariodrvEsAfiliacion != null) return;
        // CONDITION: COUNT(Rol) WHERE (Rol.Nombre = \"AFILIACIONES\") > 0
        // EFFECT   : TRUE
        boolean funcionariodrvEsAfiliacionCond = getFuncionarioRepository().assocOperator000(this) > Long.valueOf(0);
        if (funcionariodrvEsAfiliacionCond) {
            funcionariodrvEsAfiliacion = Boolean.TRUE;
        }
    }

    private void funcionariodrvEsAfiliacionDerivationsDefault() {
        if (funcionariodrvEsAfiliacion != null) return;
        // Default derivation
        // EFFECT   : FALSE
        funcionariodrvEsAfiliacion = Boolean.FALSE;
    }
    /**
     * This method initializes the properties of the entity and its relations.
     */
    private void initAttributes() {
        funcionarioManual = false;
        funcionarioUsuario = "";
        funcionarioPrimerNombre = "";
        funcionarioSegundoNombre = null;
        funcionarioPrimerApellido = null;
        funcionarioSegundoApellido = null;
        funcionarioUsuarioLDAP = null;
        funcionarioEmail = null;
        funcionarioCodJefe = null;
        funcionarioDisponible = false;
        funcionarioNumSolNoTerminadas = Long.valueOf(0);
        funcionarioIdSesion = null;
        solicitudes = null;
        solicitudesAfiliacion = null;
        obsEstado = null;
        reportes = null;
        solicitudesNovedad = null;
        solNovAifliaciones = null;
        grupoAsignacion = null;
        logFuncionario = null;
        rol = null;
        sucursal = null;
        childAdmin = null;
        childSuperAdmin = null;
        childAsesor = null;
        childAreaMedica = null;
        childAfiliaciones = null;
        childRespRegional = null;
        childGestor = null;
        childMesaDeApoyo = null;
        values = new HashMap<>();
        userFunctionsSrv = Arc.container().select(UserFunctions.class).get();

        clearModifiedFlags();
    }

    public FuncionarioJpaRepository getFuncionarioRepository() {
        return Arc.container().select(FuncionarioJpaRepository.class).get();
    }
    public SolicitudJpaRepository getSolicitudRepository() {
        return Arc.container().select(SolicitudJpaRepository.class).get();
    }
    public ObsEstadoJpaRepository getObsEstadoRepository() {
        return Arc.container().select(ObsEstadoJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return Funcionario.class.getMethods();
    }


    /**
     * Provides the getter method name of the <code>inheritance</code> inheritance relationship.
     * @param inheritance the relationship name which getter method must be returned
     * @return the getter Method name for the given relationship or "" if the relationship does not exist
     */
    protected String getMethodNameInheritance(String inheritance) {
    	String getMethodName = "";
            if (inheritance.equalsIgnoreCase("childAdmin")) {
                getMethodName = "getChildAdmin";
            }
            if (inheritance.equalsIgnoreCase("childSuperAdmin")) {
                getMethodName = "getChildSuperAdmin";
            }
            if (inheritance.equalsIgnoreCase("childAsesor")) {
                getMethodName = "getChildAsesor";
            }
            if (inheritance.equalsIgnoreCase("childAreaMedica")) {
                getMethodName = "getChildAreaMedica";
            }
            if (inheritance.equalsIgnoreCase("childAfiliaciones")) {
                getMethodName = "getChildAfiliaciones";
            }
            if (inheritance.equalsIgnoreCase("childRespRegional")) {
                getMethodName = "getChildRespRegional";
            }
            if (inheritance.equalsIgnoreCase("childGestor")) {
                getMethodName = "getChildGestor";
            }
            if (inheritance.equalsIgnoreCase("childMesaDeApoyo")) {
                getMethodName = "getChildMesaDeApoyo";
            }
            if (inheritance.equalsIgnoreCase("adminfacet")) {
                getMethodName = "getAdminFacet";
            }
            if (inheritance.equalsIgnoreCase("superadminfacet")) {
                getMethodName = "getSuperAdminFacet";
            }
            if (inheritance.equalsIgnoreCase("asesorfacet")) {
                getMethodName = "getAsesorFacet";
            }
            if (inheritance.equalsIgnoreCase("areamedicafacet")) {
                getMethodName = "getAreaMedicaFacet";
            }
            if (inheritance.equalsIgnoreCase("afiliacionesfacet")) {
                getMethodName = "getAfiliacionesFacet";
            }
            if (inheritance.equalsIgnoreCase("respregionalfacet")) {
                getMethodName = "getRespRegionalFacet";
            }
            if (inheritance.equalsIgnoreCase("gestorfacet")) {
                getMethodName = "getGestorFacet";
            }
            if (inheritance.equalsIgnoreCase("mesadeapoyofacet")) {
                getMethodName = "getMesaDeApoyoFacet";
            }
        return getMethodName; 
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return FuncionarioConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedFuncionarioManual = false;
    	values.put("funcionarioManual", getFuncionarioManual());
    	modifiedFuncionarioUsuario = false;
    	values.put("funcionarioUsuario", getFuncionarioUsuario());
    	modifiedFuncionarioPrimerNombre = false;
    	values.put("funcionarioPrimerNombre", getFuncionarioPrimerNombre());
    	modifiedFuncionarioSegundoNombre = false;
    	values.put("funcionarioSegundoNombre", getFuncionarioSegundoNombre());
    	modifiedFuncionarioPrimerApellido = false;
    	values.put("funcionarioPrimerApellido", getFuncionarioPrimerApellido());
    	modifiedFuncionarioSegundoApellido = false;
    	values.put("funcionarioSegundoApellido", getFuncionarioSegundoApellido());
    	modifiedFuncionarioUsuarioLDAP = false;
    	values.put("funcionarioUsuarioLDAP", getFuncionarioUsuarioLDAP());
    	modifiedFuncionarioEmail = false;
    	values.put("funcionarioEmail", getFuncionarioEmail());
    	modifiedFuncionarioCodJefe = false;
    	values.put("funcionarioCodJefe", getFuncionarioCodJefe());
    	modifiedFuncionarioDisponible = false;
    	values.put("funcionarioDisponible", getFuncionarioDisponible());
    	modifiedFuncionarioNumSolNoTerminadas = false;
    	values.put("funcionarioNumSolNoTerminadas", getFuncionarioNumSolNoTerminadas());
    	modifiedFuncionarioIdSesion = false;
    	values.put("funcionarioIdSesion", getFuncionarioIdSesion());
    	modifiedSolicitudes = false;
    	modifiedSolicitudesAfiliacion = false;
    	modifiedObsEstado = false;
    	modifiedReportes = false;
    	modifiedSolicitudesNovedad = false;
    	modifiedSolNovAifliaciones = false;
    	modifiedGrupoAsignacion = false;
    	modifiedLogFuncionario = false;
    	modifiedRol = false;
    	modifiedSucursal = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
            funcionariodrvNombreCompleto = null;
            funcionariodrvNomJefe = null;
            funcionariodrvNomAgencia = null;
            funcionariodrvEsAsesorIntegral = null;
            funcionariodrvEsAfiliacion = null;
    }

    /**
     * Returns the <code>FuncionarioOid</code> object that identifies this instance of <code>Funcionario</code>.
     * @return <code>FuncionarioOid </code> object that identifies this instance of <code>Funcionario</code>
     */
	@Override
    public FuncionarioOid getOid() {
        return new FuncionarioOid(getFuncionarioId());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(FuncionarioConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(FuncionarioConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        // Add this class
        if (!activeFacets.contains(Constants.FUNCIONARIO)) {
            activeFacets.add(Constants.FUNCIONARIO);
        }
        // Add descendants of this class
        if (!getAdminFacet().isNull())	{
            activeFacets.addAll(getAdminFacet().getFacets());
        }
        if (!getSuperAdminFacet().isNull())	{
            activeFacets.addAll(getSuperAdminFacet().getFacets());
        }
        if (!getAsesorFacet().isNull())	{
            activeFacets.addAll(getAsesorFacet().getFacets());
        }
        if (!getAreaMedicaFacet().isNull())	{
            activeFacets.addAll(getAreaMedicaFacet().getFacets());
        }
        if (!getAfiliacionesFacet().isNull())	{
            activeFacets.addAll(getAfiliacionesFacet().getFacets());
        }
        if (!getRespRegionalFacet().isNull())	{
            activeFacets.addAll(getRespRegionalFacet().getFacets());
        }
        if (!getGestorFacet().isNull())	{
            activeFacets.addAll(getGestorFacet().getFacets());
        }
        if (!getMesaDeApoyoFacet().isNull())	{
            activeFacets.addAll(getMesaDeApoyoFacet().getFacets());
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


        if (getAgent().isFacetActive(Constants.AGENT_ASESOR)) {
            Asesor agentInstance = (Asesor) getAgent().getAgentInstance(Constants.ASESOR);

            // Check the HV formula.
            /* 
            agent = this OR Agent.Usuario = CodJefe
            */
            try {
                if (agentInstance.equalsObject(this) || (agentInstance.getFuncionarioUsuario()).equals(this.getFuncionarioCodJefe())) {
                    returnValue = true;
                }
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            	returnValue = false;
            }
        }
        if (getAgent().isFacetActive(Constants.FUNCIONARIO) || getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.AREAMEDICA) || getAgent().isFacetActive(Constants.AFILIACIONES) || getAgent().isFacetActive(Constants.RESPREGIONAL) || getAgent().isFacetActive(Constants.GESTOR) || getAgent().isFacetActive(Constants.MESADEAPOYO)) {
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

    public String buildICAgente() {
        try {
            return getFuncionarioPrimerNombre() + " " + getFuncionarioSegundoNombre() + " " + getFuncionarioPrimerApellido() + " " + getFuncionarioSegundoApellido();
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSAgentePIU() {
        try {
            return getFuncionarioUsuario() + " " + getRol().getRolNombre() + " " + getFuncionarioPrimerNombre() + " " + getFuncionarioSegundoNombre() + " " + getFuncionarioPrimerApellido() + " " + getFuncionarioSegundoApellido() + " " + (getFuncionarioDisponible() != null ? getFuncionarioDisponible().toString() : "") + " " + getFuncionarioUsuarioLDAP() + " " + getFuncionarioEmail() + " " + getSucursal().getSucursalDescripcion();
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSFuncionarioDReportes() {
        try {
            return getFuncionarioUsuarioLDAP() + " " + getFuncionarioPrimerNombre() + " " + getFuncionarioSegundoNombre() + " " + getFuncionarioPrimerApellido() + " " + getFuncionarioSegundoApellido();
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSFuncionarioDGrupo() {
        try {
            return getRol().getRolNombre() + " " + getFuncionariodrvNombreCompleto() + " " + getFuncionarioUsuarioLDAP();
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildICUsuarioLDAP() {
        try {
            return getFuncionarioUsuarioLDAP();
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
            relatedInstance = buildFuncionarioRelatedInstance(relatedInstanceJsonOid);
        }
        if (FuncionarioConstants.ROLE_NAME_SOLICITUDES.equalsIgnoreCase(relatedInstancePathFirstItem) || FuncionarioConstants.ROLE_NAME_SOLICITUDESAFILIACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFuncionarioRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_OBSESTADO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFuncionarioRelatedInstance4ObsEstado(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_REPORTES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFuncionarioRelatedInstance4ReportesProcAlm(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_SOLICITUDESNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem) || FuncionarioConstants.ROLE_NAME_SOLNOVAIFLIACIONES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFuncionarioRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_GRUPOASIGNACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFuncionarioRelatedInstance4GrupoAsignacion(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_LOGFUNCIONARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFuncionarioRelatedInstance4LogFuncionario(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_ROL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFuncionarioRelatedInstance4Rol(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_SUCURSAL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFuncionarioRelatedInstance4Sucursal(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildFuncionarioRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Funcionario(mapper.readValue(relatedInstanceJsonOid, FuncionarioOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Funcionario.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFuncionarioRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Funcionario.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFuncionarioRelatedInstance4ObsEstado(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ObsEstado(mapper.readValue(relatedInstanceJsonOid, ObsEstadoOid.class)): ObsEstado.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Funcionario.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFuncionarioRelatedInstance4ReportesProcAlm(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ReportesProcAlm(mapper.readValue(relatedInstanceJsonOid, ReportesProcAlmOid.class)): ReportesProcAlm.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Funcionario.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFuncionarioRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Funcionario.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFuncionarioRelatedInstance4GrupoAsignacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new GrupoAsignacion(mapper.readValue(relatedInstanceJsonOid, GrupoAsignacionOid.class)): GrupoAsignacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Funcionario.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFuncionarioRelatedInstance4LogFuncionario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new LogFuncionario(mapper.readValue(relatedInstanceJsonOid, LogFuncionarioOid.class)): LogFuncionario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Funcionario.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFuncionarioRelatedInstance4Rol(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Rol(mapper.readValue(relatedInstanceJsonOid, RolOid.class)): Rol.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Funcionario.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFuncionarioRelatedInstance4Sucursal(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Sucursal(mapper.readValue(relatedInstanceJsonOid, SucursalOid.class)): Sucursal.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Funcionario.class).error(e.getMessage());
            return null;
        }
    }
}
