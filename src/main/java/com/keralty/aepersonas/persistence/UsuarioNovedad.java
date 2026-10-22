package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.EstadoBeneficiarioConstants;
import com.keralty.aepersonas.global.FamiliaNovedadConstants;
import com.keralty.aepersonas.global.ParentescoConstants;
import com.keralty.aepersonas.global.STDFunctions;
import com.keralty.aepersonas.global.TipoIdentificacionConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.global.UsuarioNovedadConstants;
import com.keralty.aepersonas.persistence.oid.DocumentoNovedadOid;
import com.keralty.aepersonas.persistence.oid.EstadoBeneficiarioOid;
import com.keralty.aepersonas.persistence.oid.FamiliaNovedadOid;
import com.keralty.aepersonas.persistence.oid.ParentescoOid;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.oid.UsuarioNovedadOid;
import com.keralty.aepersonas.repository.UsuarioNovedadJpaRepository;
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
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Persistent representation of the <code>UsuarioNovedad</code> model class.
 * <p>
 * Model Class: <code>UsuarioNovedad</code><br>
 */
@Entity(name = UsuarioNovedadConstants.CLASS_NAME)
@Table(name = UsuarioNovedadConstants.TBL_NAME)
public class UsuarioNovedad extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient UsuarioNovedadJpaRepository usuarioNovedadRepository;

    private transient UserFunctions userFunctionsSrv;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="UsuarioNovedad_Sequence")
    @SequenceGenerator(name="UsuarioNovedad_Sequence", sequenceName="UsuarioNovedad_Sequence", allocationSize=1)
    @Column(name = UsuarioNovedadConstants.FLD_USUARIONOVEDADIDUSUARIONOVEDAD )
    @JsonProperty(value="id_usuarionovedad")
    private Long usuarioNovedadidUsuarioNovedad;

    /** Class member attribute. */
    @Column(name = UsuarioNovedadConstants.FLD_USUARIONOVEDADNUMIDENTIFICACION )
    @JsonProperty(value="numidentificacion")
    private String usuarioNovedadNumIdentificacion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuarioNovedadNumIdentificacion;

    /** Class member attribute. */
    @Column(name = UsuarioNovedadConstants.FLD_USUARIONOVEDADPRIMERNOMBRE )
    @JsonProperty(value="primernombre")
    private String usuarioNovedadPrimerNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuarioNovedadPrimerNombre;

    /** Class member attribute. */
    @Column(name = UsuarioNovedadConstants.FLD_USUARIONOVEDADSEGUNDONOMBRE )
    @JsonProperty(value="segundonombre")
    private String usuarioNovedadSegundoNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuarioNovedadSegundoNombre;

    /** Class member attribute. */
    @Column(name = UsuarioNovedadConstants.FLD_USUARIONOVEDADPRIMERAPELLIDO )
    @JsonProperty(value="primerapellido")
    private String usuarioNovedadPrimerApellido;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuarioNovedadPrimerApellido;

    /** Class member attribute. */
    @Column(name = UsuarioNovedadConstants.FLD_USUARIONOVEDADSEGUNDOAPELLIDO )
    @JsonProperty(value="segundoapellido")
    private String usuarioNovedadSegundoApellido;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuarioNovedadSegundoApellido;

    /** Class member attribute. */
    @Column(name = UsuarioNovedadConstants.FLD_USUARIONOVEDADMOTIVOESTADO )
    @JsonProperty(value="motivoestado")
    private String usuarioNovedadMotivoEstado;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuarioNovedadMotivoEstado;

    /** Class member attribute. */
    @Column(name = UsuarioNovedadConstants.FLD_USUARIONOVEDADFECHAINIVIGENCIA )
    @JsonProperty(value="fechainivigencia")
    private Date usuarioNovedadFechaIniVigencia;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuarioNovedadFechaIniVigencia;

    /** Class member attribute. */
    @Column(name = UsuarioNovedadConstants.FLD_USUARIONOVEDADFECHAANTIGUEDAD )
    @JsonProperty(value="fechaantiguedad")
    private Date usuarioNovedadFechaAntiguedad;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuarioNovedadFechaAntiguedad;

    /** Class member attribute. */
    @Column(name = UsuarioNovedadConstants.FLD_USUARIONOVEDADNUMUSUARIO )
    @JsonProperty(value="numusuario")
    private Long usuarioNovedadNumUsuario;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuarioNovedadNumUsuario;

    /** Class member attribute. */
    @Column(name = UsuarioNovedadConstants.FLD_USUARIONOVEDADGENERO )
    @JsonProperty(value="genero")
    private String usuarioNovedadGenero;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuarioNovedadGenero;

    /** Class member attribute. */
    @Column(name = UsuarioNovedadConstants.FLD_USUARIONOVEDADFECHANACIMIENTO )
    @JsonProperty(value="fechanacimiento")
    private Date usuarioNovedadFechaNacimiento;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuarioNovedadFechaNacimiento;

    /** Class member attribute. */
    @Column(name = UsuarioNovedadConstants.FLD_USUARIONOVEDADSUNUMMESES )
    @JsonProperty(value="sunummeses")
    private Long usuarioNovedadSUNumMeses;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuarioNovedadSUNumMeses;

    /** Class member attribute. */
    @Column(name = UsuarioNovedadConstants.FLD_USUARIONOVEDADNUMIDENTIFICACIONCD )
    @JsonProperty(value="numidentificacioncd")
    private String usuarioNovedadNumIdentificacionCD;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuarioNovedadNumIdentificacionCD;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvestaactivo")
    protected Boolean usuarioNovedaddrvEstaActivo;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvparentescook")
    protected Boolean usuarioNovedaddrvParentescoOK;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvestitular")
    protected Boolean usuarioNovedaddrvEsTitular;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvespadre")
    protected Boolean usuarioNovedaddrvEsPadre;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvedad")
    protected Long usuarioNovedaddrvEdad;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drveshijo")
    protected Boolean usuarioNovedaddrvEsHijo;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvesconyuge")
    protected Boolean usuarioNovedaddrvEsConyuge;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drveseltitular")
    protected Boolean usuarioNovedaddrvEsElTitular;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvpuedesertitular")
    protected Boolean usuarioNovedaddrvPuedeSerTitular;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvestasuspendido")
    protected Boolean usuarioNovedaddrvEstaSuspendido;

    /** Class member attribute. */
    @Column(name = UsuarioNovedadConstants.FLD_USUARIONOVEDADEXCLUIDO )
    @JsonProperty(value="excluido")
    private Boolean usuarioNovedadExcluido;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuarioNovedadExcluido;

    /** Class member attribute. */
    @Column(name = UsuarioNovedadConstants.FLD_USUARIONOVEDADCONTRATACIONRO )
    @JsonProperty(value="contratacionro")
    private Boolean usuarioNovedadContratacionRO;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuarioNovedadContratacionRO;

    /** Class member attribute. */
    @Column(name = UsuarioNovedadConstants.FLD_USUARIONOVEDADPRORROGASUSPENSION )
    @JsonProperty(value="prorrogasuspension")
    private Boolean usuarioNovedadProrrogaSuspension;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuarioNovedadProrrogaSuspension;

    /** Class member attribute. */
    @Column(name = UsuarioNovedadConstants.FLD_USUARIONOVEDADACTIVACIONSUSPENSION )
    @JsonProperty(value="activacionsuspension")
    private Boolean usuarioNovedadActivacionSuspension;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuarioNovedadActivacionSuspension;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvnombrecompleto")
    protected String usuarioNovedadDrvNombreCompleto;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvidentificacion")
    protected String usuarioNovedadDrvIdentificacion;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvaplicanovedad")
    protected Boolean usuarioNovedadDrvAplicaNovedad;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvnuevaidentificacion")
    protected String usuarioNovedadDrvNuevaIdentificacion;

    /** Related Class. */
    @OneToMany(mappedBy = UsuarioNovedadConstants.ROLE_INVNAME_DOCUMENTOS)
    @JsonIgnore
    private Collection <DocumentoNovedad> documentos;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDocumentos;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=UsuarioNovedadConstants.FLD_FAMILIANOVEDADIDFAMILIANOVEDAD, referencedColumnName=FamiliaNovedadConstants.FLD_FAMILIANOVEDADIDFAMILIANOVEDAD)
    })
    @JsonIgnore
    private FamiliaNovedad familiaNovedad;
    /** Related attribute. */
    @Column(name = UsuarioNovedadConstants.FLD_FAMILIANOVEDADIDFAMILIANOVEDAD, insertable = false, updatable = false)
    private Long familiaNovedadidFamiliaNovedad;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFamiliaNovedad;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=UsuarioNovedadConstants.FLD_TIPOIDENTIFICACIONCODIGO, referencedColumnName=TipoIdentificacionConstants.FLD_TIPOIDENTIFICACIONCODIGO)
    })
    @JsonIgnore
    private TipoIdentificacion tipoIdentificacion;
    /** Related attribute. */
    @Column(name = UsuarioNovedadConstants.FLD_TIPOIDENTIFICACIONCODIGO, insertable = false, updatable = false)
    private Long tipoIdentificacionCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoIdentificacion;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=UsuarioNovedadConstants.FLD_PARENTESCOPARENTESCOCODIGO, referencedColumnName=ParentescoConstants.FLD_PARENTESCOCODIGO)
    })
    @JsonIgnore
    private Parentesco parentesco;
    /** Related attribute. */
    @Column(name = UsuarioNovedadConstants.FLD_PARENTESCOPARENTESCOCODIGO, insertable = false, updatable = false)
    private Long parentescoParentescoCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedParentesco;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=UsuarioNovedadConstants.FLD_ESTADOBENEFICIARIOESTADOBENEFICIARIOCODIGO, referencedColumnName=EstadoBeneficiarioConstants.FLD_ESTADOBENEFICIARIOCODIGO)
    })
    @JsonIgnore
    private EstadoBeneficiario estadoBeneficiario;
    /** Related attribute. */
    @Column(name = UsuarioNovedadConstants.FLD_ESTADOBENEFICIARIOESTADOBENEFICIARIOCODIGO, insertable = false, updatable = false)
    private Long estadoBeneficiarioEstadoBeneficiarioCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedEstadoBeneficiario;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=UsuarioNovedadConstants.FLD_PARENTESCOPARENTESCONUEVOCODIGO, referencedColumnName=ParentescoConstants.FLD_PARENTESCOCODIGO)
    })
    @JsonIgnore
    private Parentesco parentescoNuevo;
    /** Related attribute. */
    @Column(name = UsuarioNovedadConstants.FLD_PARENTESCOPARENTESCONUEVOCODIGO, insertable = false, updatable = false)
    private Long parentescoParentescoNuevoCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedParentescoNuevo;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=UsuarioNovedadConstants.FLD_TIPOIDENTIFICACIONTIPOIDENTIFICACIONCDCODIGO, referencedColumnName=TipoIdentificacionConstants.FLD_TIPOIDENTIFICACIONCODIGO)
    })
    @JsonIgnore
    private TipoIdentificacion tipoIdentificacionCD;
    /** Related attribute. */
    @Column(name = UsuarioNovedadConstants.FLD_TIPOIDENTIFICACIONTIPOIDENTIFICACIONCDCODIGO, insertable = false, updatable = false)
    private Long tipoIdentificacionTipoIdentificacionCDCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoIdentificacionCD;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public UsuarioNovedad() {
        usuarioNovedadidUsuarioNovedad = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>UsuarioNovedad</code>.
     * @param oid Object Identifier of the instance of <code>UsuarioNovedad</code> to be created.
     * @throws SystemException
     */
    public UsuarioNovedad(UsuarioNovedadOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            usuarioNovedadidUsuarioNovedad = oid.getUsuarioNovedadidUsuarioNovedad();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>usuarioNovedadidUsuarioNovedad</code> attribute<br>in class <code>UsuarioNovedad</code>.
     * This is part of the identification for this class, which depends on the identification of <code>UsuarioNovedad</code>
     * @return The value of the <code>usuarioNovedadidUsuarioNovedad</code> attribute<br>in class <code>UsuarioNovedad</code>.
     */
    public Long getUsuarioNovedadidUsuarioNovedad() {
        return usuarioNovedadidUsuarioNovedad;
    }

    /**
     * Sets the value of the <code>usuarioNovedadidUsuarioNovedad</code> attribute<br>in class <code>UsuarioNovedad</code>.
     * This is part of the identification for this class, which depends on the identification of <code>UsuarioNovedad</code>
     * @param usuarioNovedadidUsuarioNovedad The new value of the <code>usuarioNovedadidUsuarioNovedad</code> attribute<br>in class <code>UsuarioNovedad</code>.
     */
    public void setUsuarioNovedadidUsuarioNovedad(Long usuarioNovedadidUsuarioNovedad) {
        this.usuarioNovedadidUsuarioNovedad = usuarioNovedadidUsuarioNovedad;
    }

   /**
    * Returns the value of the <code>usuarioNovedadNumIdentificacion</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadNumIdentificacion</code>. Variable String Size=60<br>
    * Comments: <br>
    * @return The value of the <code>usuarioNovedadNumIdentificacion</code> attribute.
    */

    public String getUsuarioNovedadNumIdentificacion()  {
    	String value;
        value =  usuarioNovedadNumIdentificacion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>usuarioNovedadNumIdentificacion</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadNumIdentificacion</code>. Variable String Size=60<br>
    * Comments: <br>
    * @param usuarioNovedadNumIdentificacion The new value of the <code>usuarioNovedadNumIdentificacion</code> attribute.
    */
    public void setUsuarioNovedadNumIdentificacion (String usuarioNovedadNumIdentificacion) {
        modifiedUsuarioNovedadNumIdentificacion = true;
        this.usuarioNovedadNumIdentificacion = usuarioNovedadNumIdentificacion;
    }

   /**
    * Sets the value of the <code>modifiedUsuarioNovedadNumIdentificacion</code> class property.<br>
    * @param modified The new value of the <code>modifiedUsuarioNovedadNumIdentificacion</code>.
    */
    public void setModifiedUsuarioNovedadNumIdentificacion(boolean modified) {
        this.modifiedUsuarioNovedadNumIdentificacion = modified;
    }

   /**
    * Returns the value of the <code>usuarioNovedadPrimerNombre</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadPrimerNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>usuarioNovedadPrimerNombre</code> attribute.
    */

    public String getUsuarioNovedadPrimerNombre()  {
    	String value;
        value =  usuarioNovedadPrimerNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>usuarioNovedadPrimerNombre</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadPrimerNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param usuarioNovedadPrimerNombre The new value of the <code>usuarioNovedadPrimerNombre</code> attribute.
    */
    public void setUsuarioNovedadPrimerNombre (String usuarioNovedadPrimerNombre) {
        modifiedUsuarioNovedadPrimerNombre = true;
        this.usuarioNovedadPrimerNombre = usuarioNovedadPrimerNombre;
    }

   /**
    * Sets the value of the <code>modifiedUsuarioNovedadPrimerNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedUsuarioNovedadPrimerNombre</code>.
    */
    public void setModifiedUsuarioNovedadPrimerNombre(boolean modified) {
        this.modifiedUsuarioNovedadPrimerNombre = modified;
    }

   /**
    * Returns the value of the <code>usuarioNovedadSegundoNombre</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadSegundoNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>usuarioNovedadSegundoNombre</code> attribute.
    */

    public String getUsuarioNovedadSegundoNombre()  {
    	String value;
        value =  usuarioNovedadSegundoNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>usuarioNovedadSegundoNombre</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadSegundoNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param usuarioNovedadSegundoNombre The new value of the <code>usuarioNovedadSegundoNombre</code> attribute.
    */
    public void setUsuarioNovedadSegundoNombre (String usuarioNovedadSegundoNombre) {
        modifiedUsuarioNovedadSegundoNombre = true;
        this.usuarioNovedadSegundoNombre = usuarioNovedadSegundoNombre;
    }

   /**
    * Sets the value of the <code>modifiedUsuarioNovedadSegundoNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedUsuarioNovedadSegundoNombre</code>.
    */
    public void setModifiedUsuarioNovedadSegundoNombre(boolean modified) {
        this.modifiedUsuarioNovedadSegundoNombre = modified;
    }

   /**
    * Returns the value of the <code>usuarioNovedadPrimerApellido</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadPrimerApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>usuarioNovedadPrimerApellido</code> attribute.
    */

    public String getUsuarioNovedadPrimerApellido()  {
    	String value;
        value =  usuarioNovedadPrimerApellido;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>usuarioNovedadPrimerApellido</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadPrimerApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param usuarioNovedadPrimerApellido The new value of the <code>usuarioNovedadPrimerApellido</code> attribute.
    */
    public void setUsuarioNovedadPrimerApellido (String usuarioNovedadPrimerApellido) {
        modifiedUsuarioNovedadPrimerApellido = true;
        this.usuarioNovedadPrimerApellido = usuarioNovedadPrimerApellido;
    }

   /**
    * Sets the value of the <code>modifiedUsuarioNovedadPrimerApellido</code> class property.<br>
    * @param modified The new value of the <code>modifiedUsuarioNovedadPrimerApellido</code>.
    */
    public void setModifiedUsuarioNovedadPrimerApellido(boolean modified) {
        this.modifiedUsuarioNovedadPrimerApellido = modified;
    }

   /**
    * Returns the value of the <code>usuarioNovedadSegundoApellido</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadSegundoApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>usuarioNovedadSegundoApellido</code> attribute.
    */

    public String getUsuarioNovedadSegundoApellido()  {
    	String value;
        value =  usuarioNovedadSegundoApellido;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>usuarioNovedadSegundoApellido</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadSegundoApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param usuarioNovedadSegundoApellido The new value of the <code>usuarioNovedadSegundoApellido</code> attribute.
    */
    public void setUsuarioNovedadSegundoApellido (String usuarioNovedadSegundoApellido) {
        modifiedUsuarioNovedadSegundoApellido = true;
        this.usuarioNovedadSegundoApellido = usuarioNovedadSegundoApellido;
    }

   /**
    * Sets the value of the <code>modifiedUsuarioNovedadSegundoApellido</code> class property.<br>
    * @param modified The new value of the <code>modifiedUsuarioNovedadSegundoApellido</code>.
    */
    public void setModifiedUsuarioNovedadSegundoApellido(boolean modified) {
        this.modifiedUsuarioNovedadSegundoApellido = modified;
    }

   /**
    * Returns the value of the <code>usuarioNovedadMotivoEstado</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadMotivoEstado</code>. Constant String Size=200<br>
    * Comments: <br>
    * @return The value of the <code>usuarioNovedadMotivoEstado</code> attribute.
    */

    public String getUsuarioNovedadMotivoEstado()  {
    	String value;
        value =  usuarioNovedadMotivoEstado;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>usuarioNovedadMotivoEstado</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadMotivoEstado</code>. Constant String Size=200<br>
    * Comments: <br>
    * @param usuarioNovedadMotivoEstado The new value of the <code>usuarioNovedadMotivoEstado</code> attribute.
    */
    public void setUsuarioNovedadMotivoEstado (String usuarioNovedadMotivoEstado) {
        modifiedUsuarioNovedadMotivoEstado = true;
        this.usuarioNovedadMotivoEstado = usuarioNovedadMotivoEstado;
    }

   /**
    * Sets the value of the <code>modifiedUsuarioNovedadMotivoEstado</code> class property.<br>
    * @param modified The new value of the <code>modifiedUsuarioNovedadMotivoEstado</code>.
    */
    public void setModifiedUsuarioNovedadMotivoEstado(boolean modified) {
        this.modifiedUsuarioNovedadMotivoEstado = modified;
    }

   /**
    * Returns the value of the <code>usuarioNovedadFechaIniVigencia</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadFechaIniVigencia</code>. Constant Date<br>
    * Comments: <br>
    * @return The value of the <code>usuarioNovedadFechaIniVigencia</code> attribute.
    */

    public Date getUsuarioNovedadFechaIniVigencia()  {
    	Date value;
        value =  usuarioNovedadFechaIniVigencia;
        return value;
    }

   /**
    * Sets the value of the <code>usuarioNovedadFechaIniVigencia</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadFechaIniVigencia</code>. Constant Date<br>
    * Comments: <br>
    * @param usuarioNovedadFechaIniVigencia The new value of the <code>usuarioNovedadFechaIniVigencia</code> attribute.
    */
    public void setUsuarioNovedadFechaIniVigencia (Date usuarioNovedadFechaIniVigencia) {
        modifiedUsuarioNovedadFechaIniVigencia = true;
        this.usuarioNovedadFechaIniVigencia = usuarioNovedadFechaIniVigencia;
    }

   /**
    * Sets the value of the <code>modifiedUsuarioNovedadFechaIniVigencia</code> class property.<br>
    * @param modified The new value of the <code>modifiedUsuarioNovedadFechaIniVigencia</code>.
    */
    public void setModifiedUsuarioNovedadFechaIniVigencia(boolean modified) {
        this.modifiedUsuarioNovedadFechaIniVigencia = modified;
    }

   /**
    * Returns the value of the <code>usuarioNovedadFechaAntiguedad</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadFechaAntiguedad</code>. Constant Date<br>
    * Comments: <br>
    * @return The value of the <code>usuarioNovedadFechaAntiguedad</code> attribute.
    */

    public Date getUsuarioNovedadFechaAntiguedad()  {
    	Date value;
        value =  usuarioNovedadFechaAntiguedad;
        return value;
    }

   /**
    * Sets the value of the <code>usuarioNovedadFechaAntiguedad</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadFechaAntiguedad</code>. Constant Date<br>
    * Comments: <br>
    * @param usuarioNovedadFechaAntiguedad The new value of the <code>usuarioNovedadFechaAntiguedad</code> attribute.
    */
    public void setUsuarioNovedadFechaAntiguedad (Date usuarioNovedadFechaAntiguedad) {
        modifiedUsuarioNovedadFechaAntiguedad = true;
        this.usuarioNovedadFechaAntiguedad = usuarioNovedadFechaAntiguedad;
    }

   /**
    * Sets the value of the <code>modifiedUsuarioNovedadFechaAntiguedad</code> class property.<br>
    * @param modified The new value of the <code>modifiedUsuarioNovedadFechaAntiguedad</code>.
    */
    public void setModifiedUsuarioNovedadFechaAntiguedad(boolean modified) {
        this.modifiedUsuarioNovedadFechaAntiguedad = modified;
    }

   /**
    * Returns the value of the <code>usuarioNovedadNumUsuario</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadNumUsuario</code>. Constant Int<br>
    * Comments: <br>
    * @return The value of the <code>usuarioNovedadNumUsuario</code> attribute.
    */

    public Long getUsuarioNovedadNumUsuario()  {
    	Long value;
        value =  usuarioNovedadNumUsuario;
        return value;
    }

   /**
    * Sets the value of the <code>usuarioNovedadNumUsuario</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadNumUsuario</code>. Constant Int<br>
    * Comments: <br>
    * @param usuarioNovedadNumUsuario The new value of the <code>usuarioNovedadNumUsuario</code> attribute.
    */
    public void setUsuarioNovedadNumUsuario (Long usuarioNovedadNumUsuario) {
        modifiedUsuarioNovedadNumUsuario = true;
        this.usuarioNovedadNumUsuario = usuarioNovedadNumUsuario;
    }

   /**
    * Sets the value of the <code>modifiedUsuarioNovedadNumUsuario</code> class property.<br>
    * @param modified The new value of the <code>modifiedUsuarioNovedadNumUsuario</code>.
    */
    public void setModifiedUsuarioNovedadNumUsuario(boolean modified) {
        this.modifiedUsuarioNovedadNumUsuario = modified;
    }

   /**
    * Returns the value of the <code>usuarioNovedadGenero</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadGenero</code>. Variable String Size=1<br>
    * Comments: F - Femenino, M - Masculino<br>
    * @return The value of the <code>usuarioNovedadGenero</code> attribute.
    */

    public String getUsuarioNovedadGenero()  {
    	String value;
        value =  usuarioNovedadGenero;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>usuarioNovedadGenero</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadGenero</code>. Variable String Size=1<br>
    * Comments: F - Femenino, M - Masculino<br>
    * @param usuarioNovedadGenero The new value of the <code>usuarioNovedadGenero</code> attribute.
    */
    public void setUsuarioNovedadGenero (String usuarioNovedadGenero) {
        modifiedUsuarioNovedadGenero = true;
        this.usuarioNovedadGenero = usuarioNovedadGenero;
    }

   /**
    * Sets the value of the <code>modifiedUsuarioNovedadGenero</code> class property.<br>
    * @param modified The new value of the <code>modifiedUsuarioNovedadGenero</code>.
    */
    public void setModifiedUsuarioNovedadGenero(boolean modified) {
        this.modifiedUsuarioNovedadGenero = modified;
    }

   /**
    * Returns the value of the <code>usuarioNovedadFechaNacimiento</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadFechaNacimiento</code>. Variable Date<br>
    * Comments: <br>
    * @return The value of the <code>usuarioNovedadFechaNacimiento</code> attribute.
    */

    public Date getUsuarioNovedadFechaNacimiento()  {
    	Date value;
        value =  usuarioNovedadFechaNacimiento;
        return value;
    }

   /**
    * Sets the value of the <code>usuarioNovedadFechaNacimiento</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadFechaNacimiento</code>. Variable Date<br>
    * Comments: <br>
    * @param usuarioNovedadFechaNacimiento The new value of the <code>usuarioNovedadFechaNacimiento</code> attribute.
    */
    public void setUsuarioNovedadFechaNacimiento (Date usuarioNovedadFechaNacimiento) {
        modifiedUsuarioNovedadFechaNacimiento = true;
        this.usuarioNovedadFechaNacimiento = usuarioNovedadFechaNacimiento;
    }

   /**
    * Sets the value of the <code>modifiedUsuarioNovedadFechaNacimiento</code> class property.<br>
    * @param modified The new value of the <code>modifiedUsuarioNovedadFechaNacimiento</code>.
    */
    public void setModifiedUsuarioNovedadFechaNacimiento(boolean modified) {
        this.modifiedUsuarioNovedadFechaNacimiento = modified;
    }

   /**
    * Returns the value of the <code>usuarioNovedadSUNumMeses</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadSUNumMeses</code>. Variable Nat<br>
    * Comments: GdC 25 - Req 8: SU Suspensión de usuarios
Datos adicionales: Se debe ingresar el número de meses. El valor mínimo es 6, valor máximo es 24 meses.<br>
    * @return The value of the <code>usuarioNovedadSUNumMeses</code> attribute.
    */

    public Long getUsuarioNovedadSUNumMeses()  {
    	Long value;
        value =  usuarioNovedadSUNumMeses;
        return value;
    }

   /**
    * Sets the value of the <code>usuarioNovedadSUNumMeses</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadSUNumMeses</code>. Variable Nat<br>
    * Comments: GdC 25 - Req 8: SU Suspensión de usuarios
Datos adicionales: Se debe ingresar el número de meses. El valor mínimo es 6, valor máximo es 24 meses.<br>
    * @param usuarioNovedadSUNumMeses The new value of the <code>usuarioNovedadSUNumMeses</code> attribute.
    */
    public void setUsuarioNovedadSUNumMeses (Long usuarioNovedadSUNumMeses) {
        modifiedUsuarioNovedadSUNumMeses = true;
        this.usuarioNovedadSUNumMeses = usuarioNovedadSUNumMeses;
    }

   /**
    * Sets the value of the <code>modifiedUsuarioNovedadSUNumMeses</code> class property.<br>
    * @param modified The new value of the <code>modifiedUsuarioNovedadSUNumMeses</code>.
    */
    public void setModifiedUsuarioNovedadSUNumMeses(boolean modified) {
        this.modifiedUsuarioNovedadSUNumMeses = modified;
    }

   /**
    * Returns the value of the <code>usuarioNovedadNumIdentificacionCD</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadNumIdentificacionCD</code>. Variable String Size=60<br>
    * Comments: En el caso de que se produzca una novedad de cambio de tipo de identificación, aquí guardaremos el nuevo número. <br>
    * @return The value of the <code>usuarioNovedadNumIdentificacionCD</code> attribute.
    */

    public String getUsuarioNovedadNumIdentificacionCD()  {
    	String value;
        value =  usuarioNovedadNumIdentificacionCD;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>usuarioNovedadNumIdentificacionCD</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadNumIdentificacionCD</code>. Variable String Size=60<br>
    * Comments: En el caso de que se produzca una novedad de cambio de tipo de identificación, aquí guardaremos el nuevo número. <br>
    * @param usuarioNovedadNumIdentificacionCD The new value of the <code>usuarioNovedadNumIdentificacionCD</code> attribute.
    */
    public void setUsuarioNovedadNumIdentificacionCD (String usuarioNovedadNumIdentificacionCD) {
        modifiedUsuarioNovedadNumIdentificacionCD = true;
        this.usuarioNovedadNumIdentificacionCD = usuarioNovedadNumIdentificacionCD;
    }

   /**
    * Sets the value of the <code>modifiedUsuarioNovedadNumIdentificacionCD</code> class property.<br>
    * @param modified The new value of the <code>modifiedUsuarioNovedadNumIdentificacionCD</code>.
    */
    public void setModifiedUsuarioNovedadNumIdentificacionCD(boolean modified) {
        this.modifiedUsuarioNovedadNumIdentificacionCD = modified;
    }

   /**
    * Returns the value of the <code>usuarioNovedaddrvEstaActivo</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedaddrvEstaActivo</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>usuarioNovedaddrvEstaActivo</code> attribute.
    */

    @JsonIgnore
    public Boolean getUsuarioNovedaddrvEstaActivo()  {
    	Boolean value;
        try {
            value = usuarioNovedaddrvEstaActivoDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: UsuarioNovedad, Attribute: usuarioNovedaddrvEstaActivo");
        }
        return value;
    }

   /**
    * Returns the value of the <code>usuarioNovedaddrvParentescoOK</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedaddrvParentescoOK</code>. Variable Bool<br>
    * Comments: Indica si el parentesco es válido respecto al resto de usuarios de la familia y respecto al titular:
El titular debe tener por lo menos un diferencia de 10 años con la edad del beneficiario de parentesco PADRE.
El titular debe tener por lo menos un diferencia de 10 años con la edad del beneficiario de parentesco HIJO
Los beneficiarios con parentesco CONYUGE deben tener sexo distinto al del TITULAR
La edad de los beneficiarios con parentesco CONYUGE debe ser mayor o igual a 13 años
Si existe un conyuge no activo su vigencia no puede estar traslapada con el nuevo conyuge <br>
    * @return The value of the <code>usuarioNovedaddrvParentescoOK</code> attribute.
    */

    @JsonIgnore
    public Boolean getUsuarioNovedaddrvParentescoOK()  {
    	Boolean value;
        try {
            value = usuarioNovedaddrvParentescoOKDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: UsuarioNovedad, Attribute: usuarioNovedaddrvParentescoOK");
        }
        return value;
    }

   /**
    * Returns the value of the <code>usuarioNovedaddrvEsTitular</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedaddrvEsTitular</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>usuarioNovedaddrvEsTitular</code> attribute.
    */

    @JsonIgnore
    public Boolean getUsuarioNovedaddrvEsTitular()  {
    	Boolean value;
        try {
            value = usuarioNovedaddrvEsTitularDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: UsuarioNovedad, Attribute: usuarioNovedaddrvEsTitular");
        }
        return value;
    }

   /**
    * Returns the value of the <code>usuarioNovedaddrvEsPadre</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedaddrvEsPadre</code>. Variable Bool<br>
    * Comments: Tiene el parentesco padre, se utiliza para validaciones<br>
    * @return The value of the <code>usuarioNovedaddrvEsPadre</code> attribute.
    */

    @JsonIgnore
    public Boolean getUsuarioNovedaddrvEsPadre()  {
    	Boolean value;
        try {
            value = usuarioNovedaddrvEsPadreDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: UsuarioNovedad, Attribute: usuarioNovedaddrvEsPadre");
        }
        return value;
    }

   /**
    * Returns the value of the <code>usuarioNovedaddrvEdad</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedaddrvEdad</code>. Variable Int<br>
    * Comments: Se utilizará para validaciones. <br>
    * @return The value of the <code>usuarioNovedaddrvEdad</code> attribute.
    */

    @JsonIgnore
    public Long getUsuarioNovedaddrvEdad()  {
    	Long value;
        try {
            value = usuarioNovedaddrvEdadDerivations();
        } catch (Exception e) {
            value = Long.valueOf(0);
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: UsuarioNovedad, Attribute: usuarioNovedaddrvEdad");
        }
        return value;
    }

   /**
    * Returns the value of the <code>usuarioNovedaddrvEsHijo</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedaddrvEsHijo</code>. Variable Bool<br>
    * Comments: Tiene el parentesco hijo, se utiliza para validaciones<br>
    * @return The value of the <code>usuarioNovedaddrvEsHijo</code> attribute.
    */

    @JsonIgnore
    public Boolean getUsuarioNovedaddrvEsHijo()  {
    	Boolean value;
        try {
            value = usuarioNovedaddrvEsHijoDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: UsuarioNovedad, Attribute: usuarioNovedaddrvEsHijo");
        }
        return value;
    }

   /**
    * Returns the value of the <code>usuarioNovedaddrvEsConyuge</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedaddrvEsConyuge</code>. Variable Bool<br>
    * Comments: Tiene el parentesco conyuge, se utiliza para validaciones<br>
    * @return The value of the <code>usuarioNovedaddrvEsConyuge</code> attribute.
    */

    @JsonIgnore
    public Boolean getUsuarioNovedaddrvEsConyuge()  {
    	Boolean value;
        try {
            value = usuarioNovedaddrvEsConyugeDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: UsuarioNovedad, Attribute: usuarioNovedaddrvEsConyuge");
        }
        return value;
    }

   /**
    * Returns the value of the <code>usuarioNovedaddrvEsElTitular</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedaddrvEsElTitular</code>. Variable Bool<br>
    * Comments: Si tiene parentesco titular, o si se ha hecho un cambio de titular y se ha añadido este usuario como titular<br>
    * @return The value of the <code>usuarioNovedaddrvEsElTitular</code> attribute.
    */

    @JsonIgnore
    public Boolean getUsuarioNovedaddrvEsElTitular()  {
    	Boolean value;
        try {
            value = usuarioNovedaddrvEsElTitularDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: UsuarioNovedad, Attribute: usuarioNovedaddrvEsElTitular");
        }
        return value;
    }

   /**
    * Returns the value of the <code>usuarioNovedaddrvPuedeSerTitular</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedaddrvPuedeSerTitular</code>. Variable Bool<br>
    * Comments: Devuelve true si puede ser titular de la solicitud. Este dato se utiliza en el filtrado navegacional de parentesco cuando se va a hacer una solicitud de novedad de CP (cambio de parentesco)<br>
    * @return The value of the <code>usuarioNovedaddrvPuedeSerTitular</code> attribute.
    */

    @JsonIgnore
    public Boolean getUsuarioNovedaddrvPuedeSerTitular()  {
    	Boolean value;
        try {
            value = usuarioNovedaddrvPuedeSerTitularDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: UsuarioNovedad, Attribute: usuarioNovedaddrvPuedeSerTitular");
        }
        return value;
    }

   /**
    * Returns the value of the <code>usuarioNovedaddrvEstaSuspendido</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedaddrvEstaSuspendido</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>usuarioNovedaddrvEstaSuspendido</code> attribute.
    */

    @JsonIgnore
    public Boolean getUsuarioNovedaddrvEstaSuspendido()  {
    	Boolean value;
        try {
            value = usuarioNovedaddrvEstaSuspendidoDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: UsuarioNovedad, Attribute: usuarioNovedaddrvEstaSuspendido");
        }
        return value;
    }

   /**
    * Returns the value of the <code>usuarioNovedadExcluido</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadExcluido</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>usuarioNovedadExcluido</code> attribute.
    */

    public Boolean getUsuarioNovedadExcluido()  {
    	Boolean value;
        value =  usuarioNovedadExcluido;
        return value;
    }

   /**
    * Sets the value of the <code>usuarioNovedadExcluido</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadExcluido</code>. Variable Bool<br>
    * Comments: <br>
    * @param usuarioNovedadExcluido The new value of the <code>usuarioNovedadExcluido</code> attribute.
    */
    public void setUsuarioNovedadExcluido (Boolean usuarioNovedadExcluido) {
        modifiedUsuarioNovedadExcluido = true;
        this.usuarioNovedadExcluido = usuarioNovedadExcluido;
    }

   /**
    * Sets the value of the <code>modifiedUsuarioNovedadExcluido</code> class property.<br>
    * @param modified The new value of the <code>modifiedUsuarioNovedadExcluido</code>.
    */
    public void setModifiedUsuarioNovedadExcluido(boolean modified) {
        this.modifiedUsuarioNovedadExcluido = modified;
    }

   /**
    * Returns the value of the <code>usuarioNovedadContratacionRO</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadContratacionRO</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>usuarioNovedadContratacionRO</code> attribute.
    */

    public Boolean getUsuarioNovedadContratacionRO()  {
    	Boolean value;
        value =  usuarioNovedadContratacionRO;
        return value;
    }

   /**
    * Sets the value of the <code>usuarioNovedadContratacionRO</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadContratacionRO</code>. Variable Bool<br>
    * Comments: <br>
    * @param usuarioNovedadContratacionRO The new value of the <code>usuarioNovedadContratacionRO</code> attribute.
    */
    public void setUsuarioNovedadContratacionRO (Boolean usuarioNovedadContratacionRO) {
        modifiedUsuarioNovedadContratacionRO = true;
        this.usuarioNovedadContratacionRO = usuarioNovedadContratacionRO;
    }

   /**
    * Sets the value of the <code>modifiedUsuarioNovedadContratacionRO</code> class property.<br>
    * @param modified The new value of the <code>modifiedUsuarioNovedadContratacionRO</code>.
    */
    public void setModifiedUsuarioNovedadContratacionRO(boolean modified) {
        this.modifiedUsuarioNovedadContratacionRO = modified;
    }

   /**
    * Returns the value of the <code>usuarioNovedadProrrogaSuspension</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadProrrogaSuspension</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>usuarioNovedadProrrogaSuspension</code> attribute.
    */

    public Boolean getUsuarioNovedadProrrogaSuspension()  {
    	Boolean value;
        value =  usuarioNovedadProrrogaSuspension;
        return value;
    }

   /**
    * Sets the value of the <code>usuarioNovedadProrrogaSuspension</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadProrrogaSuspension</code>. Variable Bool<br>
    * Comments: <br>
    * @param usuarioNovedadProrrogaSuspension The new value of the <code>usuarioNovedadProrrogaSuspension</code> attribute.
    */
    public void setUsuarioNovedadProrrogaSuspension (Boolean usuarioNovedadProrrogaSuspension) {
        modifiedUsuarioNovedadProrrogaSuspension = true;
        this.usuarioNovedadProrrogaSuspension = usuarioNovedadProrrogaSuspension;
    }

   /**
    * Sets the value of the <code>modifiedUsuarioNovedadProrrogaSuspension</code> class property.<br>
    * @param modified The new value of the <code>modifiedUsuarioNovedadProrrogaSuspension</code>.
    */
    public void setModifiedUsuarioNovedadProrrogaSuspension(boolean modified) {
        this.modifiedUsuarioNovedadProrrogaSuspension = modified;
    }

   /**
    * Returns the value of the <code>usuarioNovedadActivacionSuspension</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadActivacionSuspension</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>usuarioNovedadActivacionSuspension</code> attribute.
    */

    public Boolean getUsuarioNovedadActivacionSuspension()  {
    	Boolean value;
        value =  usuarioNovedadActivacionSuspension;
        return value;
    }

   /**
    * Sets the value of the <code>usuarioNovedadActivacionSuspension</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadActivacionSuspension</code>. Variable Bool<br>
    * Comments: <br>
    * @param usuarioNovedadActivacionSuspension The new value of the <code>usuarioNovedadActivacionSuspension</code> attribute.
    */
    public void setUsuarioNovedadActivacionSuspension (Boolean usuarioNovedadActivacionSuspension) {
        modifiedUsuarioNovedadActivacionSuspension = true;
        this.usuarioNovedadActivacionSuspension = usuarioNovedadActivacionSuspension;
    }

   /**
    * Sets the value of the <code>modifiedUsuarioNovedadActivacionSuspension</code> class property.<br>
    * @param modified The new value of the <code>modifiedUsuarioNovedadActivacionSuspension</code>.
    */
    public void setModifiedUsuarioNovedadActivacionSuspension(boolean modified) {
        this.modifiedUsuarioNovedadActivacionSuspension = modified;
    }

   /**
    * Returns the value of the <code>usuarioNovedadDrvNombreCompleto</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadDrvNombreCompleto</code>. Variable String Size=210<br>
    * Comments: <br>
    * @return The value of the <code>usuarioNovedadDrvNombreCompleto</code> attribute.
    */

    @JsonIgnore
    public String getUsuarioNovedadDrvNombreCompleto()  {
    	String value;
        try {
            value = usuarioNovedadDrvNombreCompletoDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: UsuarioNovedad, Attribute: usuarioNovedadDrvNombreCompleto");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>usuarioNovedadDrvIdentificacion</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadDrvIdentificacion</code>. Variable String Size=70<br>
    * Comments: Si no se ha producido cambio de tipo de identificación tomo unos atributos, si se ha producido tomo otros<br>
    * @return The value of the <code>usuarioNovedadDrvIdentificacion</code> attribute.
    */

    @JsonIgnore
    public String getUsuarioNovedadDrvIdentificacion()  {
    	String value;
        try {
            value = usuarioNovedadDrvIdentificacionDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: UsuarioNovedad, Attribute: usuarioNovedadDrvIdentificacion");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>usuarioNovedadDrvAplicaNovedad</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadDrvAplicaNovedad</code>. Variable Bool<br>
    * Comments: Indica si al usuario le afecta la novedad o no<br>
    * @return The value of the <code>usuarioNovedadDrvAplicaNovedad</code> attribute.
    */

    @JsonIgnore
    public Boolean getUsuarioNovedadDrvAplicaNovedad()  {
    	Boolean value;
        try {
            value = usuarioNovedadDrvAplicaNovedadDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: UsuarioNovedad, Attribute: usuarioNovedadDrvAplicaNovedad");
        }
        return value;
    }

   /**
    * Returns the value of the <code>usuarioNovedadDrvNuevaIdentificacion</code> attribute.<br>
    * Model Attribute: <code>usuarioNovedadDrvNuevaIdentificacion</code>. Variable String Size=70<br>
    * Comments: Si no se ha producido cambio de tipo de identificación tomo unos atributos, si se ha producido tomo otros<br>
    * @return The value of the <code>usuarioNovedadDrvNuevaIdentificacion</code> attribute.
    */

    @JsonIgnore
    public String getUsuarioNovedadDrvNuevaIdentificacion()  {
    	String value;
        try {
            value = usuarioNovedadDrvNuevaIdentificacionDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: UsuarioNovedad, Attribute: usuarioNovedadDrvNuevaIdentificacion");
        }
        return (value == null ? null : value.trim());
    }

    /**
     * Returns the instance of <code>DocumentoNovedad</code> related through the <code>Documentos</code> role.
     * Model Relationship:
     * <code>[DocumentoNovedad] Documentos 0:M  ------ 0:1  Usuario [UsuarioNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>DocumentoNovedad</code> related through the <code>Documentos</code> role.
     */
    @JsonIgnore
    public Collection <DocumentoNovedad> getDocumentos() {
        return documentos;
    }

    /**
     * Adds an instance of <code>DocumentoNovedad</code> related through the <code>Documentos</code> role.
     * @param documentos The instance to add to the <code>Documentos</code> role.
     */
    public void add2Documentos(DocumentoNovedad documentos) {
        this.documentos.add(documentos);
    }
    /**
     * Removes an instance of <code>DocumentoNovedad</code> related through the <code>Documentos</code> role.
     * @param documentos The instance to be removed
     */
    public void removeFromDocumentos(DocumentoNovedad documentos) {
    	this.documentos.remove(documentos);
    }
    /**
     * Sets instances of <code>DocumentoNovedad</code> related through the <code>Documentos</code> role.
     * @param documentos The new value for the <code>Documentos</code> role.
     */
    public void setDocumentos(Collection < DocumentoNovedad > documentos) {
        this.documentos = documentos;
    }

   /**
    * This method gets the attribute value <code>modifiedDocumentos</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDocumentos</code> has been modified.
    */
    public boolean isModifiedDocumentos(){
        return modifiedDocumentos;
    }

    /**
     * Returns the instance of <code>FamiliaNovedad</code> related through the <code>FamiliaNovedad</code> role.
     * Model Relationship:
     * <code>[FamiliaNovedad] FamiliaNovedad 1:1  ------ 0:M  UsuarioNovedad [UsuarioNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>FamiliaNovedad</code> related through the <code>FamiliaNovedad</code> role.
     */
    @JsonIgnore
    public FamiliaNovedad getFamiliaNovedad() {
        return familiaNovedad;
    }

    /**
     * Adds an instance of <code>FamiliaNovedad</code> related through the <code>FamiliaNovedad</code> role.
     * @param familiaNovedad The instance to add to the <code>FamiliaNovedad</code> role.
     */
    public void add2FamiliaNovedad(FamiliaNovedad familiaNovedad) {
        if (familiaNovedad == null || familiaNovedad.isNull()) {
            this.modifiedFamiliaNovedad = true;
            this.familiaNovedadidFamiliaNovedad = null;
        } else {
            this.familiaNovedadidFamiliaNovedad = familiaNovedad.getFamiliaNovedadidFamiliaNovedad();
        }
        this.familiaNovedad = (familiaNovedad == null  || familiaNovedad.isNull() ? null : familiaNovedad);
    }

   /**
    * This method gets the attribute value <code>modifiedFamiliaNovedad</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedFamiliaNovedad</code> has been modified.
    */
    public boolean isModifiedFamiliaNovedad(){
        return modifiedFamiliaNovedad;
    }

    /**
     * Returns the instance of <code>TipoIdentificacion</code> related through the <code>TipoIdentificacion</code> role.
     * Model Relationship:
     * <code>[TipoIdentificacion] TipoIdentificacion 0:1  ------ 0:M  UsuariosNovedad [UsuarioNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>TipoIdentificacion</code> related through the <code>TipoIdentificacion</code> role.
     */
    @JsonIgnore
    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    /**
     * Adds an instance of <code>TipoIdentificacion</code> related through the <code>TipoIdentificacion</code> role.
     * @param tipoIdentificacion The instance to add to the <code>TipoIdentificacion</code> role.
     */
    public void add2TipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
        if (tipoIdentificacion == null || tipoIdentificacion.isNull()) {
            this.modifiedTipoIdentificacion = true;
            this.tipoIdentificacionCodigo = null;
        } else {
            this.tipoIdentificacionCodigo = tipoIdentificacion.getTipoIdentificacionCodigo();
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
     * Returns the instance of <code>Parentesco</code> related through the <code>Parentesco</code> role.
     * Model Relationship:
     * <code>[Parentesco] Parentesco 0:1  ------ 0:M  UsuariosNovedad [UsuarioNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Parentesco</code> related through the <code>Parentesco</code> role.
     */
    @JsonIgnore
    public Parentesco getParentesco() {
        return parentesco;
    }

    /**
     * Adds an instance of <code>Parentesco</code> related through the <code>Parentesco</code> role.
     * @param parentesco The instance to add to the <code>Parentesco</code> role.
     */
    public void add2Parentesco(Parentesco parentesco) {
        if (parentesco == null || parentesco.isNull()) {
            this.modifiedParentesco = true;
            this.parentescoParentescoCodigo = null;
        } else {
            this.parentescoParentescoCodigo = parentesco.getParentescoCodigo();
        }
        this.parentesco = (parentesco == null  || parentesco.isNull() ? null : parentesco);
    }

   /**
    * This method gets the attribute value <code>modifiedParentesco</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedParentesco</code> has been modified.
    */
    public boolean isModifiedParentesco(){
        return modifiedParentesco;
    }

    /**
     * Returns the instance of <code>EstadoBeneficiario</code> related through the <code>EstadoBeneficiario</code> role.
     * Model Relationship:
     * <code>[EstadoBeneficiario] EstadoBeneficiario 0:1  ------ 0:M  UsuariosNovedad [UsuarioNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>EstadoBeneficiario</code> related through the <code>EstadoBeneficiario</code> role.
     */
    @JsonIgnore
    public EstadoBeneficiario getEstadoBeneficiario() {
        return estadoBeneficiario;
    }

    /**
     * Adds an instance of <code>EstadoBeneficiario</code> related through the <code>EstadoBeneficiario</code> role.
     * @param estadoBeneficiario The instance to add to the <code>EstadoBeneficiario</code> role.
     */
    public void add2EstadoBeneficiario(EstadoBeneficiario estadoBeneficiario) {
        if (estadoBeneficiario == null || estadoBeneficiario.isNull()) {
            this.modifiedEstadoBeneficiario = true;
            this.estadoBeneficiarioEstadoBeneficiarioCodigo = null;
        } else {
            this.estadoBeneficiarioEstadoBeneficiarioCodigo = estadoBeneficiario.getEstadoBeneficiarioCodigo();
        }
        this.estadoBeneficiario = (estadoBeneficiario == null  || estadoBeneficiario.isNull() ? null : estadoBeneficiario);
    }

   /**
    * This method gets the attribute value <code>modifiedEstadoBeneficiario</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedEstadoBeneficiario</code> has been modified.
    */
    public boolean isModifiedEstadoBeneficiario(){
        return modifiedEstadoBeneficiario;
    }

    /**
     * Returns the instance of <code>Parentesco</code> related through the <code>ParentescoNuevo</code> role.
     * Model Relationship:
     * <code>[Parentesco] ParentescoNuevo 0:1  ------ 0:M  UsuarioNovedad [UsuarioNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Parentesco</code> related through the <code>ParentescoNuevo</code> role.
     */
    @JsonIgnore
    public Parentesco getParentescoNuevo() {
        return parentescoNuevo;
    }

    /**
     * Adds an instance of <code>Parentesco</code> related through the <code>ParentescoNuevo</code> role.
     * @param parentescoNuevo The instance to add to the <code>ParentescoNuevo</code> role.
     */
    public void add2ParentescoNuevo(Parentesco parentescoNuevo) {
        if (parentescoNuevo == null || parentescoNuevo.isNull()) {
            this.modifiedParentescoNuevo = true;
            this.parentescoParentescoNuevoCodigo = null;
        } else {
            this.parentescoParentescoNuevoCodigo = parentescoNuevo.getParentescoCodigo();
        }
        this.parentescoNuevo = (parentescoNuevo == null  || parentescoNuevo.isNull() ? null : parentescoNuevo);
    }

   /**
    * This method gets the attribute value <code>modifiedParentescoNuevo</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedParentescoNuevo</code> has been modified.
    */
    public boolean isModifiedParentescoNuevo(){
        return modifiedParentescoNuevo;
    }

    /**
     * Returns the instance of <code>TipoIdentificacion</code> related through the <code>TipoIdentificacionCD</code> role.
     * Model Relationship:
     * <code>[TipoIdentificacion] TipoIdentificacionCD 0:1  ------ 0:M  UsuarioNovedad [UsuarioNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>TipoIdentificacion</code> related through the <code>TipoIdentificacionCD</code> role.
     */
    @JsonIgnore
    public TipoIdentificacion getTipoIdentificacionCD() {
        return tipoIdentificacionCD;
    }

    /**
     * Adds an instance of <code>TipoIdentificacion</code> related through the <code>TipoIdentificacionCD</code> role.
     * @param tipoIdentificacionCD The instance to add to the <code>TipoIdentificacionCD</code> role.
     */
    public void add2TipoIdentificacionCD(TipoIdentificacion tipoIdentificacionCD) {
        if (tipoIdentificacionCD == null || tipoIdentificacionCD.isNull()) {
            this.modifiedTipoIdentificacionCD = true;
            this.tipoIdentificacionTipoIdentificacionCDCodigo = null;
        } else {
            this.tipoIdentificacionTipoIdentificacionCDCodigo = tipoIdentificacionCD.getTipoIdentificacionCodigo();
        }
        this.tipoIdentificacionCD = (tipoIdentificacionCD == null  || tipoIdentificacionCD.isNull() ? null : tipoIdentificacionCD);
    }

   /**
    * This method gets the attribute value <code>modifiedTipoIdentificacionCD</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedTipoIdentificacionCD</code> has been modified.
    */
    public boolean isModifiedTipoIdentificacionCD(){
        return modifiedTipoIdentificacionCD;
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
     * Computes the value of the <code>usuarioNovedaddrvEstaActivo</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>usuarioNovedaddrvEstaActivo</code> derived attribute.
     */
    public Boolean usuarioNovedaddrvEstaActivoDerivations() throws SystemException {

        usuarioNovedaddrvEstaActivo = null;

        usuarioNovedaddrvEstaActivoDerivationsConditional1();
        usuarioNovedaddrvEstaActivoDerivationsDefault();
        return usuarioNovedaddrvEstaActivo;
    }

    private void usuarioNovedaddrvEstaActivoDerivationsConditional1() throws SystemException {
        if (usuarioNovedaddrvEstaActivo != null) return;
        // CONDITION: EXIST( EstadoBeneficiario ) = TRUE
        // EFFECT   : EstadoBeneficiario.EsActivo = TRUE
        boolean usuarioNovedaddrvEstaActivoCond = getUsuarioNovedadRepository().assocOperator004(this).equals(true);
        if (usuarioNovedaddrvEstaActivoCond) {
            usuarioNovedaddrvEstaActivo = this.getEstadoBeneficiario().getEstadoBeneficiarioEsActivo().equals(true);
        }
    }

    private void usuarioNovedaddrvEstaActivoDerivationsDefault() {
        if (usuarioNovedaddrvEstaActivo != null) return;
        // Default derivation
        // EFFECT   : TRUE
        usuarioNovedaddrvEstaActivo = Boolean.TRUE;
    }

    /**
     * Computes the value of the <code>usuarioNovedaddrvParentescoOK</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>usuarioNovedaddrvParentescoOK</code> derived attribute.
     */
    public Boolean usuarioNovedaddrvParentescoOKDerivations() throws SystemException {

        usuarioNovedaddrvParentescoOK = null;

        usuarioNovedaddrvParentescoOKDerivationsConditional1();
        usuarioNovedaddrvParentescoOKDerivationsConditional2();
        usuarioNovedaddrvParentescoOKDerivationsConditional3();
        usuarioNovedaddrvParentescoOKDerivationsConditional4();
        usuarioNovedaddrvParentescoOKDerivationsConditional5();
        usuarioNovedaddrvParentescoOKDerivationsDefault();
        return usuarioNovedaddrvParentescoOK;
    }

    private void usuarioNovedaddrvParentescoOKDerivationsConditional1() throws SystemException {
        if (usuarioNovedaddrvParentescoOK != null) return;
        // CONDITION: drvEsElTitular = true AND EXIST( FamiliaNovedad.UsuarioNovedad ) WHERE (FamiliaNovedad.UsuarioNovedad.drvEsPadre = true AND FamiliaNovedad.UsuarioNovedad.drvEdad - drvEdad < 10) = true
        // EFFECT   : FALSE
        boolean usuarioNovedaddrvParentescoOKCond = this.getUsuarioNovedaddrvEsElTitular().equals(true) && getUsuarioNovedadRepository().assocOperator005(this).equals(true);
        if (usuarioNovedaddrvParentescoOKCond) {
            usuarioNovedaddrvParentescoOK = Boolean.FALSE;
        }
    }

    private void usuarioNovedaddrvParentescoOKDerivationsConditional2() throws SystemException {
        if (usuarioNovedaddrvParentescoOK != null) return;
        // CONDITION: drvEsElTitular = true AND EXIST( FamiliaNovedad.UsuarioNovedad ) WHERE (FamiliaNovedad.UsuarioNovedad.drvEsHijo = true AND drvEdad - FamiliaNovedad.UsuarioNovedad.drvEdad < 10) = true
        // EFFECT   : FALSE
        boolean usuarioNovedaddrvParentescoOKCond = this.getUsuarioNovedaddrvEsElTitular().equals(true) && getUsuarioNovedadRepository().assocOperator006(this).equals(true);
        if (usuarioNovedaddrvParentescoOKCond) {
            usuarioNovedaddrvParentescoOK = Boolean.FALSE;
        }
    }

    private void usuarioNovedaddrvParentescoOKDerivationsConditional3() throws SystemException {
        if (usuarioNovedaddrvParentescoOK != null) return;
        // CONDITION: drvEsElTitular = true AND EXIST( FamiliaNovedad.UsuarioNovedad ) WHERE (FamiliaNovedad.UsuarioNovedad.drvEsConyuge = true AND Genero = FamiliaNovedad.UsuarioNovedad.Genero) = true
        // EFFECT   : FALSE
        boolean usuarioNovedaddrvParentescoOKCond = this.getUsuarioNovedaddrvEsElTitular().equals(true) && getUsuarioNovedadRepository().assocOperator007(this).equals(true);
        if (usuarioNovedaddrvParentescoOKCond) {
            usuarioNovedaddrvParentescoOK = Boolean.FALSE;
        }
    }

    private void usuarioNovedaddrvParentescoOKDerivationsConditional4() {
        if (usuarioNovedaddrvParentescoOK != null) return;
        // CONDITION: drvEsConyuge = TRUE  AND drvEdad < 13
        // EFFECT   : FALSE
        boolean usuarioNovedaddrvParentescoOKCond = this.getUsuarioNovedaddrvEsConyuge().equals(true) && this.getUsuarioNovedaddrvEdad() < Long.valueOf(13);
        if (usuarioNovedaddrvParentescoOKCond) {
            usuarioNovedaddrvParentescoOK = Boolean.FALSE;
        }
    }

    private void usuarioNovedaddrvParentescoOKDerivationsConditional5() throws SystemException {
        if (usuarioNovedaddrvParentescoOK != null) return;
        // CONDITION: drvEsConyuge = true AND drvEstaActivo = true AND COUNT( FamiliaNovedad.UsuarioNovedad ) WHERE (FamiliaNovedad.UsuarioNovedad.idUsuarioNovedad <> idUsuarioNovedad AND FamiliaNovedad.UsuarioNovedad.drvEsConyuge = true AND FamiliaNovedad.UsuarioNovedad.drvEstaActivo = true AND FamiliaNovedad.UsuarioNovedad.FechaIniVigencia >= FamiliaNovedad.Solicitud.CtrFInicioContrato) > 0
        // EFFECT   : FALSE
        boolean usuarioNovedaddrvParentescoOKCond = this.getUsuarioNovedaddrvEsConyuge().equals(true) && this.getUsuarioNovedaddrvEstaActivo().equals(true) && getUsuarioNovedadRepository().assocOperator008(this) > Long.valueOf(0);
        if (usuarioNovedaddrvParentescoOKCond) {
            usuarioNovedaddrvParentescoOK = Boolean.FALSE;
        }
    }

    private void usuarioNovedaddrvParentescoOKDerivationsDefault() {
        if (usuarioNovedaddrvParentescoOK != null) return;
        // Default derivation
        // EFFECT   : TRUE
        usuarioNovedaddrvParentescoOK = Boolean.TRUE;
    }

    /**
     * Computes the value of the <code>usuarioNovedaddrvEsTitular</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>usuarioNovedaddrvEsTitular</code> derived attribute.
     */
    public Boolean usuarioNovedaddrvEsTitularDerivations() throws SystemException {

        usuarioNovedaddrvEsTitular = null;

        usuarioNovedaddrvEsTitularDerivationsConditional1();
        usuarioNovedaddrvEsTitularDerivationsConditional2();
        usuarioNovedaddrvEsTitularDerivationsDefault();
        return usuarioNovedaddrvEsTitular;
    }

    private void usuarioNovedaddrvEsTitularDerivationsConditional1() throws SystemException {
        if (usuarioNovedaddrvEsTitular != null) return;
        // CONDITION: EXIST(ParentescoNuevo) WHERE (ParentescoNuevo.EsTitular = TRUE) = TRUE
        // EFFECT   : TRUE
        boolean usuarioNovedaddrvEsTitularCond = getUsuarioNovedadRepository().assocOperator009(this).equals(true);
        if (usuarioNovedaddrvEsTitularCond) {
            usuarioNovedaddrvEsTitular = Boolean.TRUE;
        }
    }

    private void usuarioNovedaddrvEsTitularDerivationsConditional2() throws SystemException {
        if (usuarioNovedaddrvEsTitular != null) return;
        // CONDITION: EXIST(ParentescoNuevo) = FALSE AND EXIST (Parentesco) WHERE (Parentesco.EsTitular = TRUE) = TRUE
        // EFFECT   : TRUE
        boolean usuarioNovedaddrvEsTitularCond = getUsuarioNovedadRepository().assocOperator010(this).equals(false) && getUsuarioNovedadRepository().assocOperator011(this).equals(true);
        if (usuarioNovedaddrvEsTitularCond) {
            usuarioNovedaddrvEsTitular = Boolean.TRUE;
        }
    }

    private void usuarioNovedaddrvEsTitularDerivationsDefault() {
        if (usuarioNovedaddrvEsTitular != null) return;
        // Default derivation
        // EFFECT   : FALSE
        usuarioNovedaddrvEsTitular = Boolean.FALSE;
    }

    /**
     * Computes the value of the <code>usuarioNovedaddrvEsPadre</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>usuarioNovedaddrvEsPadre</code> derived attribute.
     */
    public Boolean usuarioNovedaddrvEsPadreDerivations() throws SystemException {

        usuarioNovedaddrvEsPadre = null;

        usuarioNovedaddrvEsPadreDerivationsConditional1();
        usuarioNovedaddrvEsPadreDerivationsConditional2();
        usuarioNovedaddrvEsPadreDerivationsDefault();
        return usuarioNovedaddrvEsPadre;
    }

    private void usuarioNovedaddrvEsPadreDerivationsConditional1() throws SystemException {
        if (usuarioNovedaddrvEsPadre != null) return;
        // CONDITION: EXIST(ParentescoNuevo) WHERE (ParentescoNuevo.EsPadre = TRUE) = TRUE
        // EFFECT   : TRUE
        boolean usuarioNovedaddrvEsPadreCond = getUsuarioNovedadRepository().assocOperator012(this).equals(true);
        if (usuarioNovedaddrvEsPadreCond) {
            usuarioNovedaddrvEsPadre = Boolean.TRUE;
        }
    }

    private void usuarioNovedaddrvEsPadreDerivationsConditional2() throws SystemException {
        if (usuarioNovedaddrvEsPadre != null) return;
        // CONDITION: EXIST(ParentescoNuevo) = FALSE AND EXIST (Parentesco) WHERE (Parentesco.EsPadre = TRUE) = TRUE
        // EFFECT   : TRUE
        boolean usuarioNovedaddrvEsPadreCond = getUsuarioNovedadRepository().assocOperator013(this).equals(false) && getUsuarioNovedadRepository().assocOperator014(this).equals(true);
        if (usuarioNovedaddrvEsPadreCond) {
            usuarioNovedaddrvEsPadre = Boolean.TRUE;
        }
    }

    private void usuarioNovedaddrvEsPadreDerivationsDefault() {
        if (usuarioNovedaddrvEsPadre != null) return;
        // Default derivation
        // EFFECT   : FALSE
        usuarioNovedaddrvEsPadre = Boolean.FALSE;
    }

    /**
     * Computes the value of the <code>usuarioNovedaddrvEdad</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>usuarioNovedaddrvEdad</code> derived attribute.
     */
    public Long usuarioNovedaddrvEdadDerivations() {

        usuarioNovedaddrvEdad = null;

        usuarioNovedaddrvEdadDerivationsConditional1();
        usuarioNovedaddrvEdadDerivationsConditional2();
        usuarioNovedaddrvEdadDerivationsConditional3();
        usuarioNovedaddrvEdadDerivationsDefault();
        return usuarioNovedaddrvEdad;
    }

    private void usuarioNovedaddrvEdadDerivationsConditional1() {
        if (usuarioNovedaddrvEdad != null) return;
        // CONDITION: FechaNacimiento = NULL
        // EFFECT   : 0
        boolean usuarioNovedaddrvEdadCond = this.getUsuarioNovedadFechaNacimiento() == null;
        if (usuarioNovedaddrvEdadCond) {
            usuarioNovedaddrvEdad = Long.valueOf(0);
        }
    }

    private void usuarioNovedaddrvEdadDerivationsConditional2() {
        if (usuarioNovedaddrvEdad != null) return;
        // CONDITION: FechaNacimiento >=  systemDate()
        // EFFECT   : 0
        boolean usuarioNovedaddrvEdadCond = (STDFunctions.dateAfterFun(this.getUsuarioNovedadFechaNacimiento(),STDFunctions.systemDateFun()) || STDFunctions.dateEqualsFun(this.getUsuarioNovedadFechaNacimiento(),STDFunctions.systemDateFun()));
        if (usuarioNovedaddrvEdadCond) {
            usuarioNovedaddrvEdad = Long.valueOf(0);
        }
    }

    private void usuarioNovedaddrvEdadDerivationsConditional3() {
        if (usuarioNovedaddrvEdad != null) return;
        // CONDITION: getMonth( systemDate() ) * 50 + getDay( systemDate() ) >= getMonth( FechaNacimiento ) * 50 + getDay( FechaNacimiento )
        // EFFECT   : getYear(systemDate()) - getYear( FechaNacimiento ) 
        boolean usuarioNovedaddrvEdadCond = STDFunctions.getMonthFun(STDFunctions.systemDateFun()) * Long.valueOf(50) + STDFunctions.getDayFun(STDFunctions.systemDateFun()) >= STDFunctions.getMonthFun(this.getUsuarioNovedadFechaNacimiento()) * Long.valueOf(50) + STDFunctions.getDayFun(this.getUsuarioNovedadFechaNacimiento());
        if (usuarioNovedaddrvEdadCond) {
            usuarioNovedaddrvEdad = STDFunctions.getYearFun(STDFunctions.systemDateFun()) - STDFunctions.getYearFun(this.getUsuarioNovedadFechaNacimiento());
        }
    }

    private void usuarioNovedaddrvEdadDerivationsDefault() {
        if (usuarioNovedaddrvEdad != null) return;
        // Default derivation
        // EFFECT   : getYear(systemDate()) - getYear( FechaNacimiento )  - 1
        usuarioNovedaddrvEdad = STDFunctions.getYearFun(STDFunctions.systemDateFun()) - STDFunctions.getYearFun(this.getUsuarioNovedadFechaNacimiento()) - Long.valueOf(1);
    }

    /**
     * Computes the value of the <code>usuarioNovedaddrvEsHijo</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>usuarioNovedaddrvEsHijo</code> derived attribute.
     */
    public Boolean usuarioNovedaddrvEsHijoDerivations() throws SystemException {

        usuarioNovedaddrvEsHijo = null;

        usuarioNovedaddrvEsHijoDerivationsConditional1();
        usuarioNovedaddrvEsHijoDerivationsConditional2();
        usuarioNovedaddrvEsHijoDerivationsDefault();
        return usuarioNovedaddrvEsHijo;
    }

    private void usuarioNovedaddrvEsHijoDerivationsConditional1() throws SystemException {
        if (usuarioNovedaddrvEsHijo != null) return;
        // CONDITION: EXIST(ParentescoNuevo) WHERE (ParentescoNuevo.EsHijo = TRUE) = TRUE
        // EFFECT   : TRUE
        boolean usuarioNovedaddrvEsHijoCond = getUsuarioNovedadRepository().assocOperator015(this).equals(true);
        if (usuarioNovedaddrvEsHijoCond) {
            usuarioNovedaddrvEsHijo = Boolean.TRUE;
        }
    }

    private void usuarioNovedaddrvEsHijoDerivationsConditional2() throws SystemException {
        if (usuarioNovedaddrvEsHijo != null) return;
        // CONDITION: EXIST(ParentescoNuevo) = FALSE AND EXIST (Parentesco) WHERE (Parentesco.EsHijo= TRUE) = TRUE
        // EFFECT   : TRUE
        boolean usuarioNovedaddrvEsHijoCond = getUsuarioNovedadRepository().assocOperator016(this).equals(false) && getUsuarioNovedadRepository().assocOperator017(this).equals(true);
        if (usuarioNovedaddrvEsHijoCond) {
            usuarioNovedaddrvEsHijo = Boolean.TRUE;
        }
    }

    private void usuarioNovedaddrvEsHijoDerivationsDefault() {
        if (usuarioNovedaddrvEsHijo != null) return;
        // Default derivation
        // EFFECT   : FALSE
        usuarioNovedaddrvEsHijo = Boolean.FALSE;
    }

    /**
     * Computes the value of the <code>usuarioNovedaddrvEsConyuge</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>usuarioNovedaddrvEsConyuge</code> derived attribute.
     */
    public Boolean usuarioNovedaddrvEsConyugeDerivations() throws SystemException {

        usuarioNovedaddrvEsConyuge = null;

        usuarioNovedaddrvEsConyugeDerivationsConditional1();
        usuarioNovedaddrvEsConyugeDerivationsConditional2();
        usuarioNovedaddrvEsConyugeDerivationsDefault();
        return usuarioNovedaddrvEsConyuge;
    }

    private void usuarioNovedaddrvEsConyugeDerivationsConditional1() throws SystemException {
        if (usuarioNovedaddrvEsConyuge != null) return;
        // CONDITION: EXIST(ParentescoNuevo) WHERE (ParentescoNuevo.EsConyuge = TRUE) = TRUE
        // EFFECT   : TRUE
        boolean usuarioNovedaddrvEsConyugeCond = getUsuarioNovedadRepository().assocOperator018(this).equals(true);
        if (usuarioNovedaddrvEsConyugeCond) {
            usuarioNovedaddrvEsConyuge = Boolean.TRUE;
        }
    }

    private void usuarioNovedaddrvEsConyugeDerivationsConditional2() throws SystemException {
        if (usuarioNovedaddrvEsConyuge != null) return;
        // CONDITION: EXIST(ParentescoNuevo) = FALSE AND EXIST (Parentesco) WHERE (Parentesco.EsConyuge= TRUE) = TRUE
        // EFFECT   : TRUE
        boolean usuarioNovedaddrvEsConyugeCond = getUsuarioNovedadRepository().assocOperator019(this).equals(false) && getUsuarioNovedadRepository().assocOperator020(this).equals(true);
        if (usuarioNovedaddrvEsConyugeCond) {
            usuarioNovedaddrvEsConyuge = Boolean.TRUE;
        }
    }

    private void usuarioNovedaddrvEsConyugeDerivationsDefault() {
        if (usuarioNovedaddrvEsConyuge != null) return;
        // Default derivation
        // EFFECT   : FALSE
        usuarioNovedaddrvEsConyuge = Boolean.FALSE;
    }

    /**
     * Computes the value of the <code>usuarioNovedaddrvEsElTitular</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>usuarioNovedaddrvEsElTitular</code> derived attribute.
     */
    public Boolean usuarioNovedaddrvEsElTitularDerivations() throws SystemException {

        usuarioNovedaddrvEsElTitular = null;

        usuarioNovedaddrvEsElTitularDerivationsConditional1();
        usuarioNovedaddrvEsElTitularDerivationsConditional2();
        usuarioNovedaddrvEsElTitularDerivationsDefault();
        return usuarioNovedaddrvEsElTitular;
    }

    private void usuarioNovedaddrvEsElTitularDerivationsConditional1() throws SystemException {
        if (usuarioNovedaddrvEsElTitular != null) return;
        // CONDITION: EXIST(Parentesco) = FALSE
        // EFFECT   : FALSE
        boolean usuarioNovedaddrvEsElTitularCond = getUsuarioNovedadRepository().assocOperator000(this).equals(false);
        if (usuarioNovedaddrvEsElTitularCond) {
            usuarioNovedaddrvEsElTitular = Boolean.FALSE;
        }
    }

    private void usuarioNovedaddrvEsElTitularDerivationsConditional2() throws SystemException {
        if (usuarioNovedaddrvEsElTitular != null) return;
        // CONDITION: EXIST( FamiliaNovedad.NovedadCT ) WHERE (FamiliaNovedad.NovedadCT.TipoIdentificacion.Codigo = TipoIdentificacion.Codigo AND FamiliaNovedad.NovedadCT.TitNumidentificacion = NumIdentificacion) = true
        // EFFECT   : TRUE
        boolean usuarioNovedaddrvEsElTitularCond = getUsuarioNovedadRepository().assocOperator001(this).equals(true);
        if (usuarioNovedaddrvEsElTitularCond) {
            usuarioNovedaddrvEsElTitular = Boolean.TRUE;
        }
    }

    private void usuarioNovedaddrvEsElTitularDerivationsDefault() {
        if (usuarioNovedaddrvEsElTitular != null) return;
        // Default derivation
        // EFFECT   : Parentesco.EsTitular = TRUE
        usuarioNovedaddrvEsElTitular = this.getParentesco().getParentescoEsTitular().equals(true);
    }

    /**
     * Computes the value of the <code>usuarioNovedaddrvPuedeSerTitular</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>usuarioNovedaddrvPuedeSerTitular</code> derived attribute.
     */
    public Boolean usuarioNovedaddrvPuedeSerTitularDerivations() throws SystemException {

        usuarioNovedaddrvPuedeSerTitular = null;

        usuarioNovedaddrvPuedeSerTitularDerivationsConditional1();
        usuarioNovedaddrvPuedeSerTitularDerivationsConditional2();
        usuarioNovedaddrvPuedeSerTitularDerivationsConditional3();
        usuarioNovedaddrvPuedeSerTitularDerivationsDefault();
        return usuarioNovedaddrvPuedeSerTitular;
    }

    private void usuarioNovedaddrvPuedeSerTitularDerivationsConditional1() {
        if (usuarioNovedaddrvPuedeSerTitular != null) return;
        // CONDITION: drvEsElTitular = TRUE
        // EFFECT   : TRUE
        boolean usuarioNovedaddrvPuedeSerTitularCond = this.getUsuarioNovedaddrvEsElTitular().equals(true);
        if (usuarioNovedaddrvPuedeSerTitularCond) {
            usuarioNovedaddrvPuedeSerTitular = Boolean.TRUE;
        }
    }

    private void usuarioNovedaddrvPuedeSerTitularDerivationsConditional2() throws SystemException {
        if (usuarioNovedaddrvPuedeSerTitular != null) return;
        // CONDITION: COUNT( FamiliaNovedad.UsuarioNovedad ) WHERE (FamiliaNovedad.UsuarioNovedad.idUsuarioNovedad <> idUsuarioNovedad AND FamiliaNovedad.UsuarioNovedad.Parentesco.EsTitular = true) > 0
        // EFFECT   : FALSE
        boolean usuarioNovedaddrvPuedeSerTitularCond = getUsuarioNovedadRepository().assocOperator002(this) > Long.valueOf(0);
        if (usuarioNovedaddrvPuedeSerTitularCond) {
            usuarioNovedaddrvPuedeSerTitular = Boolean.FALSE;
        }
    }

    private void usuarioNovedaddrvPuedeSerTitularDerivationsConditional3() {
        if (usuarioNovedaddrvPuedeSerTitular != null) return;
        // CONDITION: FamiliaNovedad.Solicitud.CtrEsColectivo = true
        // EFFECT   : FALSE
        boolean usuarioNovedaddrvPuedeSerTitularCond = this.getFamiliaNovedad().getSolicitud().getSolicitudNovedadCtrEsColectivo().equals(true);
        if (usuarioNovedaddrvPuedeSerTitularCond) {
            usuarioNovedaddrvPuedeSerTitular = Boolean.FALSE;
        }
    }

    private void usuarioNovedaddrvPuedeSerTitularDerivationsDefault() {
        if (usuarioNovedaddrvPuedeSerTitular != null) return;
        // Default derivation
        // EFFECT   : TRUE
        usuarioNovedaddrvPuedeSerTitular = Boolean.TRUE;
    }

    /**
     * Computes the value of the <code>usuarioNovedaddrvEstaSuspendido</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>usuarioNovedaddrvEstaSuspendido</code> derived attribute.
     */
    public Boolean usuarioNovedaddrvEstaSuspendidoDerivations() throws SystemException {

        usuarioNovedaddrvEstaSuspendido = null;

        usuarioNovedaddrvEstaSuspendidoDerivationsConditional1();
        usuarioNovedaddrvEstaSuspendidoDerivationsDefault();
        return usuarioNovedaddrvEstaSuspendido;
    }

    private void usuarioNovedaddrvEstaSuspendidoDerivationsConditional1() throws SystemException {
        if (usuarioNovedaddrvEstaSuspendido != null) return;
        // CONDITION: EXIST( FamiliaNovedad.Solicitud.Novedad.CausasExclusion ) WHERE (FamiliaNovedad.Solicitud.Novedad.CausasExclusion.Descripcion = MotivoEstado) = true
        // EFFECT   : TRUE
        boolean usuarioNovedaddrvEstaSuspendidoCond = getUsuarioNovedadRepository().assocOperator003(this).equals(true);
        if (usuarioNovedaddrvEstaSuspendidoCond) {
            usuarioNovedaddrvEstaSuspendido = Boolean.TRUE;
        }
    }

    private void usuarioNovedaddrvEstaSuspendidoDerivationsDefault() {
        if (usuarioNovedaddrvEstaSuspendido != null) return;
        // Default derivation
        // EFFECT   : FALSE
        usuarioNovedaddrvEstaSuspendido = Boolean.FALSE;
    }

    /**
     * Computes the value of the <code>usuarioNovedadDrvNombreCompleto</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>usuarioNovedadDrvNombreCompleto</code> derived attribute.
     */
    public String usuarioNovedadDrvNombreCompletoDerivations() {

        usuarioNovedadDrvNombreCompleto = null;

        usuarioNovedadDrvNombreCompletoDerivationsDefault();
        return usuarioNovedadDrvNombreCompleto;
    }

    private void usuarioNovedadDrvNombreCompletoDerivationsDefault() {
        if (usuarioNovedadDrvNombreCompleto != null) return;
        // Default derivation
        // EFFECT   : fuconcatenarConNulos(\"\", PrimerNombre) + fuconcatenarConNulos(\" \", SegundoNombre) + fuconcatenarConNulos(\" \", PrimerApellido) + fuconcatenarConNulos(\" \", SegundoApellido)
        usuarioNovedadDrvNombreCompleto = userFunctionsSrv.fuconcatenarConNulosFun("", this.getUsuarioNovedadPrimerNombre()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getUsuarioNovedadSegundoNombre()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getUsuarioNovedadPrimerApellido()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getUsuarioNovedadSegundoApellido());
    }

    /**
     * Computes the value of the <code>usuarioNovedadDrvIdentificacion</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>usuarioNovedadDrvIdentificacion</code> derived attribute.
     */
    public String usuarioNovedadDrvIdentificacionDerivations() {

        usuarioNovedadDrvIdentificacion = null;

        usuarioNovedadDrvIdentificacionDerivationsDefault();
        return usuarioNovedadDrvIdentificacion;
    }

    private void usuarioNovedadDrvIdentificacionDerivationsDefault() {
        if (usuarioNovedadDrvIdentificacion != null) return;
        // Default derivation
        // EFFECT   : fuconcatenarConNulos(\"\", TipoIdentificacion.NombreCorto) + fuconcatenarConNulos(\" \", NumIdentificacion)
        usuarioNovedadDrvIdentificacion = userFunctionsSrv.fuconcatenarConNulosFun("", this.getTipoIdentificacion().getTipoIdentificacionNombreCorto()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getUsuarioNovedadNumIdentificacion());
    }

    /**
     * Computes the value of the <code>usuarioNovedadDrvAplicaNovedad</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>usuarioNovedadDrvAplicaNovedad</code> derived attribute.
     */
    public Boolean usuarioNovedadDrvAplicaNovedadDerivations() throws SystemException {

        usuarioNovedadDrvAplicaNovedad = null;

        usuarioNovedadDrvAplicaNovedadDerivationsConditional1();
        usuarioNovedadDrvAplicaNovedadDerivationsConditional2();
        usuarioNovedadDrvAplicaNovedadDerivationsConditional3();
        usuarioNovedadDrvAplicaNovedadDerivationsConditional4();
        usuarioNovedadDrvAplicaNovedadDerivationsDefault();
        return usuarioNovedadDrvAplicaNovedad;
    }

    private void usuarioNovedadDrvAplicaNovedadDerivationsConditional1() {
        if (usuarioNovedadDrvAplicaNovedad != null) return;
        // CONDITION: ActivacionSuspension = true OR ContratacionRO = true OR Excluido = true OR ProrrogaSuspension = true
        // EFFECT   : TRUE
        boolean usuarioNovedadDrvAplicaNovedadCond = this.getUsuarioNovedadActivacionSuspension().equals(true) || this.getUsuarioNovedadContratacionRO().equals(true) || this.getUsuarioNovedadExcluido().equals(true) || this.getUsuarioNovedadProrrogaSuspension().equals(true);
        if (usuarioNovedadDrvAplicaNovedadCond) {
            usuarioNovedadDrvAplicaNovedad = Boolean.TRUE;
        }
    }

    private void usuarioNovedadDrvAplicaNovedadDerivationsConditional2() {
        if (usuarioNovedadDrvAplicaNovedad != null) return;
        // CONDITION: SUNumMeses <> NULL
        // EFFECT   : TRUE
        boolean usuarioNovedadDrvAplicaNovedadCond = this.getUsuarioNovedadSUNumMeses() != null;
        if (usuarioNovedadDrvAplicaNovedadCond) {
            usuarioNovedadDrvAplicaNovedad = Boolean.TRUE;
        }
    }

    private void usuarioNovedadDrvAplicaNovedadDerivationsConditional3() throws SystemException {
        if (usuarioNovedadDrvAplicaNovedad != null) return;
        // CONDITION: EXIST(ParentescoNuevo) = TRUE
        // EFFECT   : TRUE
        boolean usuarioNovedadDrvAplicaNovedadCond = getUsuarioNovedadRepository().assocOperator021(this).equals(true);
        if (usuarioNovedadDrvAplicaNovedadCond) {
            usuarioNovedadDrvAplicaNovedad = Boolean.TRUE;
        }
    }

    private void usuarioNovedadDrvAplicaNovedadDerivationsConditional4() throws SystemException {
        if (usuarioNovedadDrvAplicaNovedad != null) return;
        // CONDITION: EXIST( TipoIdentificacionCD ) = true
        // EFFECT   : TRUE
        boolean usuarioNovedadDrvAplicaNovedadCond = getUsuarioNovedadRepository().assocOperator022(this).equals(true);
        if (usuarioNovedadDrvAplicaNovedadCond) {
            usuarioNovedadDrvAplicaNovedad = Boolean.TRUE;
        }
    }

    private void usuarioNovedadDrvAplicaNovedadDerivationsDefault() {
        if (usuarioNovedadDrvAplicaNovedad != null) return;
        // Default derivation
        // EFFECT   : FALSE
        usuarioNovedadDrvAplicaNovedad = Boolean.FALSE;
    }

    /**
     * Computes the value of the <code>usuarioNovedadDrvNuevaIdentificacion</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>usuarioNovedadDrvNuevaIdentificacion</code> derived attribute.
     */
    public String usuarioNovedadDrvNuevaIdentificacionDerivations() throws SystemException {

        usuarioNovedadDrvNuevaIdentificacion = null;

        usuarioNovedadDrvNuevaIdentificacionDerivationsConditional1();
        usuarioNovedadDrvNuevaIdentificacionDerivationsDefault();
        return usuarioNovedadDrvNuevaIdentificacion;
    }

    private void usuarioNovedadDrvNuevaIdentificacionDerivationsConditional1() throws SystemException {
        if (usuarioNovedadDrvNuevaIdentificacion != null) return;
        // CONDITION: EXIST( TipoIdentificacionCD ) = true
        // EFFECT   : fuconcatenarConNulos(\"\", TipoIdentificacionCD.NombreCorto) + fuconcatenarConNulos(\" \", NumIdentificacionCD)
        boolean usuarioNovedadDrvNuevaIdentificacionCond = getUsuarioNovedadRepository().assocOperator023(this).equals(true);
        if (usuarioNovedadDrvNuevaIdentificacionCond) {
            usuarioNovedadDrvNuevaIdentificacion = userFunctionsSrv.fuconcatenarConNulosFun("", this.getTipoIdentificacionCD().getTipoIdentificacionNombreCorto()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getUsuarioNovedadNumIdentificacionCD());
        }
    }

    private void usuarioNovedadDrvNuevaIdentificacionDerivationsDefault() {
        if (usuarioNovedadDrvNuevaIdentificacion != null) return;
        // Default derivation
        // EFFECT   : \"\"
        usuarioNovedadDrvNuevaIdentificacion = "";
    }
    /**
     * This method initializes the properties of the entity and its relations.
     */
    private void initAttributes() {
        usuarioNovedadNumIdentificacion = "";
        usuarioNovedadPrimerNombre = null;
        usuarioNovedadSegundoNombre = null;
        usuarioNovedadPrimerApellido = null;
        usuarioNovedadSegundoApellido = null;
        usuarioNovedadMotivoEstado = null;
        usuarioNovedadFechaIniVigencia = null;
        usuarioNovedadFechaAntiguedad = null;
        usuarioNovedadNumUsuario = Long.valueOf(0);
        usuarioNovedadGenero = null;
        usuarioNovedadFechaNacimiento = null;
        usuarioNovedadSUNumMeses = null;
        usuarioNovedadNumIdentificacionCD = null;
        usuarioNovedadExcluido = false;
        usuarioNovedadContratacionRO = false;
        usuarioNovedadProrrogaSuspension = false;
        usuarioNovedadActivacionSuspension = false;
        documentos = null;
        familiaNovedad = null;
        tipoIdentificacion = null;
        parentesco = null;
        estadoBeneficiario = null;
        parentescoNuevo = null;
        tipoIdentificacionCD = null;
        values = new HashMap<>();
        userFunctionsSrv = Arc.container().select(UserFunctions.class).get();

        clearModifiedFlags();
    }

    public UsuarioNovedadJpaRepository getUsuarioNovedadRepository() {
        return Arc.container().select(UsuarioNovedadJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return UsuarioNovedad.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return UsuarioNovedadConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedUsuarioNovedadNumIdentificacion = false;
    	values.put("usuarioNovedadNumIdentificacion", getUsuarioNovedadNumIdentificacion());
    	modifiedUsuarioNovedadPrimerNombre = false;
    	values.put("usuarioNovedadPrimerNombre", getUsuarioNovedadPrimerNombre());
    	modifiedUsuarioNovedadSegundoNombre = false;
    	values.put("usuarioNovedadSegundoNombre", getUsuarioNovedadSegundoNombre());
    	modifiedUsuarioNovedadPrimerApellido = false;
    	values.put("usuarioNovedadPrimerApellido", getUsuarioNovedadPrimerApellido());
    	modifiedUsuarioNovedadSegundoApellido = false;
    	values.put("usuarioNovedadSegundoApellido", getUsuarioNovedadSegundoApellido());
    	modifiedUsuarioNovedadMotivoEstado = false;
    	values.put("usuarioNovedadMotivoEstado", getUsuarioNovedadMotivoEstado());
    	modifiedUsuarioNovedadFechaIniVigencia = false;
    	values.put("usuarioNovedadFechaIniVigencia", getUsuarioNovedadFechaIniVigencia());
    	modifiedUsuarioNovedadFechaAntiguedad = false;
    	values.put("usuarioNovedadFechaAntiguedad", getUsuarioNovedadFechaAntiguedad());
    	modifiedUsuarioNovedadNumUsuario = false;
    	values.put("usuarioNovedadNumUsuario", getUsuarioNovedadNumUsuario());
    	modifiedUsuarioNovedadGenero = false;
    	values.put("usuarioNovedadGenero", getUsuarioNovedadGenero());
    	modifiedUsuarioNovedadFechaNacimiento = false;
    	values.put("usuarioNovedadFechaNacimiento", getUsuarioNovedadFechaNacimiento());
    	modifiedUsuarioNovedadSUNumMeses = false;
    	values.put("usuarioNovedadSUNumMeses", getUsuarioNovedadSUNumMeses());
    	modifiedUsuarioNovedadNumIdentificacionCD = false;
    	values.put("usuarioNovedadNumIdentificacionCD", getUsuarioNovedadNumIdentificacionCD());
    	modifiedUsuarioNovedadExcluido = false;
    	values.put("usuarioNovedadExcluido", getUsuarioNovedadExcluido());
    	modifiedUsuarioNovedadContratacionRO = false;
    	values.put("usuarioNovedadContratacionRO", getUsuarioNovedadContratacionRO());
    	modifiedUsuarioNovedadProrrogaSuspension = false;
    	values.put("usuarioNovedadProrrogaSuspension", getUsuarioNovedadProrrogaSuspension());
    	modifiedUsuarioNovedadActivacionSuspension = false;
    	values.put("usuarioNovedadActivacionSuspension", getUsuarioNovedadActivacionSuspension());
    	modifiedDocumentos = false;
    	modifiedFamiliaNovedad = false;
    	modifiedTipoIdentificacion = false;
    	modifiedParentesco = false;
    	modifiedEstadoBeneficiario = false;
    	modifiedParentescoNuevo = false;
    	modifiedTipoIdentificacionCD = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
            usuarioNovedaddrvEstaActivo = null;
            usuarioNovedaddrvParentescoOK = null;
            usuarioNovedaddrvEsTitular = null;
            usuarioNovedaddrvEsPadre = null;
            usuarioNovedaddrvEdad = null;
            usuarioNovedaddrvEsHijo = null;
            usuarioNovedaddrvEsConyuge = null;
            usuarioNovedaddrvEsElTitular = null;
            usuarioNovedaddrvPuedeSerTitular = null;
            usuarioNovedaddrvEstaSuspendido = null;
            usuarioNovedadDrvNombreCompleto = null;
            usuarioNovedadDrvIdentificacion = null;
            usuarioNovedadDrvAplicaNovedad = null;
            usuarioNovedadDrvNuevaIdentificacion = null;
    }

    /**
     * Returns the <code>UsuarioNovedadOid</code> object that identifies this instance of <code>UsuarioNovedad</code>.
     * @return <code>UsuarioNovedadOid </code> object that identifies this instance of <code>UsuarioNovedad</code>
     */
	@Override
    public UsuarioNovedadOid getOid() {
        return new UsuarioNovedadOid(getUsuarioNovedadidUsuarioNovedad());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(UsuarioNovedadConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(UsuarioNovedadConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.USUARIONOVEDAD)) {
            // Add this class
            activeFacets.add(Constants.USUARIONOVEDAD);
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


        if (getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.ASESOR) || getAgent().isFacetActive(Constants.AFILIACIONES) || getAgent().isFacetActive(Constants.GESTOR) || getAgent().isFacetActive(Constants.MESADEAPOYO)) {
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
            relatedInstance = buildUsuarioNovedadRelatedInstance(relatedInstanceJsonOid);
        }
        if (UsuarioNovedadConstants.ROLE_NAME_DOCUMENTOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioNovedadRelatedInstance4DocumentoNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioNovedadConstants.ROLE_NAME_FAMILIANOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioNovedadRelatedInstance4FamiliaNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioNovedadConstants.ROLE_NAME_TIPOIDENTIFICACION.equalsIgnoreCase(relatedInstancePathFirstItem) || UsuarioNovedadConstants.ROLE_NAME_TIPOIDENTIFICACIONCD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioNovedadRelatedInstance4TipoIdentificacion(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioNovedadConstants.ROLE_NAME_PARENTESCO.equalsIgnoreCase(relatedInstancePathFirstItem) || UsuarioNovedadConstants.ROLE_NAME_PARENTESCONUEVO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioNovedadRelatedInstance4Parentesco(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioNovedadConstants.ROLE_NAME_ESTADOBENEFICIARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioNovedadRelatedInstance4EstadoBeneficiario(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildUsuarioNovedadRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new UsuarioNovedad(mapper.readValue(relatedInstanceJsonOid, UsuarioNovedadOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(UsuarioNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildUsuarioNovedadRelatedInstance4DocumentoNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DocumentoNovedad(mapper.readValue(relatedInstanceJsonOid, DocumentoNovedadOid.class)): DocumentoNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(UsuarioNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildUsuarioNovedadRelatedInstance4FamiliaNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new FamiliaNovedad(mapper.readValue(relatedInstanceJsonOid, FamiliaNovedadOid.class)): FamiliaNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(UsuarioNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildUsuarioNovedadRelatedInstance4TipoIdentificacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class)): TipoIdentificacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(UsuarioNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildUsuarioNovedadRelatedInstance4Parentesco(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Parentesco(mapper.readValue(relatedInstanceJsonOid, ParentescoOid.class)): Parentesco.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(UsuarioNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildUsuarioNovedadRelatedInstance4EstadoBeneficiario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new EstadoBeneficiario(mapper.readValue(relatedInstanceJsonOid, EstadoBeneficiarioOid.class)): EstadoBeneficiario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(UsuarioNovedad.class).error(e.getMessage());
            return null;
        }
    }
}
