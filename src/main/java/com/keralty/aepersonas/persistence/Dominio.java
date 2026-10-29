package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.DominioConstants;
import com.keralty.aepersonas.global.FormaPagoConstants;
import com.keralty.aepersonas.global.GrupoAsignacionConstants;
import com.keralty.aepersonas.global.NovedadConstants;
import com.keralty.aepersonas.global.PeriodicidadConstants;
import com.keralty.aepersonas.global.PlanesConstants;
import com.keralty.aepersonas.global.PlantillaEmailConstants;
import com.keralty.aepersonas.global.ProductosConstants;
import com.keralty.aepersonas.global.RolConstants;
import com.keralty.aepersonas.persistence.oid.AgentexProductoOid;
import com.keralty.aepersonas.persistence.oid.ConfiguracionANSOid;
import com.keralty.aepersonas.persistence.oid.DominioOid;
import com.keralty.aepersonas.persistence.oid.FormaPagoOid;
import com.keralty.aepersonas.persistence.oid.GrupoAsignacionNovedadOid;
import com.keralty.aepersonas.persistence.oid.GrupoAsignacionOid;
import com.keralty.aepersonas.persistence.oid.LogDatosDominioOid;
import com.keralty.aepersonas.persistence.oid.LogGruposUsuariosOid;
import com.keralty.aepersonas.persistence.oid.LogIncompatibilidadesOid;
import com.keralty.aepersonas.persistence.oid.NovedadOid;
import com.keralty.aepersonas.persistence.oid.ParentescoDomOid;
import com.keralty.aepersonas.persistence.oid.PeriodicidadOid;
import com.keralty.aepersonas.persistence.oid.PlanesOid;
import com.keralty.aepersonas.persistence.oid.PlantillaEmailOid;
import com.keralty.aepersonas.persistence.oid.ProductosOid;
import com.keralty.aepersonas.persistence.oid.ProrrateoOid;
import com.keralty.aepersonas.persistence.oid.ReportesDominioOid;
import com.keralty.aepersonas.persistence.oid.RolOid;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
 * Persistent representation of the <code>Dominio</code> model class.
 * <p>
 * Model Class: <code>Dominio</code><br>
 */
@Entity(name = DominioConstants.CLASS_NAME)
@Table(name = DominioConstants.TBL_NAME)
public class Dominio extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="Dominio_Sequence")
    @SequenceGenerator(name="Dominio_Sequence", sequenceName="Dominio_Sequence", allocationSize=1)
    @Column(name = DominioConstants.FLD_DOMINIONUMERO )
    @JsonProperty(value="numero")
    private Long dominioNumero;

    /** Class member attribute. */
    @Column(name = DominioConstants.FLD_DOMINIOREQCUESMED )
    @JsonProperty(value="reqcuesmed")
    private Boolean dominioReqCuesMed;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioReqCuesMed;

    /** Class member attribute. */
    @Column(name = DominioConstants.FLD_DOMINIONOCUESMEDTRAS )
    @JsonProperty(value="nocuesmedtras")
    private Boolean dominioNoCuesMedTras;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioNoCuesMedTras;

    /** Class member attribute. */
    @Column(name = DominioConstants.FLD_DOMINIONUEVAAFILIACION )
    @JsonProperty(value="nuevaafiliacion")
    private Boolean dominioNuevaAfiliacion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioNuevaAfiliacion;

    /** Class member attribute. */
    @Column(name = DominioConstants.FLD_DOMINIOINCLUSION )
    @JsonProperty(value="inclusion")
    private Boolean dominioInclusion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioInclusion;

    /** Class member attribute. */
    @Column(name = DominioConstants.FLD_DOMINIOACEPCUESMAT )
    @JsonProperty(value="acepcuesmat")
    private Boolean dominioAcepCuesMat;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioAcepCuesMat;

    /** Class member attribute. */
    @Column(name = DominioConstants.FLD_DOMINIOACEPCUESNEO )
    @JsonProperty(value="acepcuesneo")
    private Boolean dominioAcepCuesNeo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioAcepCuesNeo;

    /** Class member attribute. */
    @Column(name = DominioConstants.FLD_DOMINIOACEPBBGESTANTE )
    @JsonProperty(value="acepbbgestante")
    private Boolean dominioAcepBBGestante;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioAcepBBGestante;

    /** Class member attribute. */
    @Column(name = DominioConstants.FLD_DOMINIOMOSTRARPREEXANEXOS )
    @JsonProperty(value="mostrarpreexanexos")
    private Boolean dominioMostrarPreexAnexos;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioMostrarPreexAnexos;

    /** Class member attribute. */
    @Column(name = DominioConstants.FLD_DOMINIOMOSTRARPREEXCONTRATO )
    @JsonProperty(value="mostrarpreexcontrato")
    private Boolean dominioMostrarPreexContrato;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioMostrarPreexContrato;

    /** Class member attribute. */
    @Column(name = DominioConstants.FLD_DOMINIOIGNORARPREEXISTENCIAS )
    @JsonProperty(value="ignorarpreexistencias")
    private Boolean dominioIgnorarPreexistencias;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioIgnorarPreexistencias;

    /** Class member attribute. */
    @Column(name = DominioConstants.FLD_DOMINIORESPCLAUNOMBRE )
    @JsonProperty(value="respclaunombre")
    private String dominioRespClauNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioRespClauNombre;

    /** Class member attribute. */
    @Column(name = DominioConstants.FLD_DOMINIORESPCLAUCELULA )
    @JsonProperty(value="respclaucelula")
    private String dominioRespClauCelula;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioRespClauCelula;

    /** Class member attribute. */
    @Column(name = DominioConstants.FLD_DOMINIORESPCLAUEXPCELULA )
    @JsonProperty(value="respclauexpcelula")
    private String dominioRespClauExpCelula;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioRespClauExpCelula;

    /** Class member attribute. */
    @Column(name = DominioConstants.FLD_DOMINIORESPCLAUCARGO )
    @JsonProperty(value="respclaucargo")
    private String dominioRespClauCargo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioRespClauCargo;

    /** Class member attribute. */
    @Column(name = DominioConstants.FLD_DOMINIORESPCLAUFIRMA )
    @JsonProperty(value="respclaufirma")
    private byte[] dominioRespClauFirma;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioRespClauFirma;

    @Transient
    @JsonIgnore
    public boolean dominioRespClauFirmaInit = false;

    /** Class member attribute. */
    @Column(name = DominioConstants.FLD_DOMINIODIAINIVIGENCIA )
    @JsonProperty(value="diainivigencia")
    private Long dominioDiaIniVigencia;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioDiaIniVigencia;

    /** Class member attribute. */
    @Column(name = DominioConstants.FLD_DOMINIODIAFINVIGENCIA )
    @JsonProperty(value="diafinvigencia")
    private Long dominioDiaFinVigencia;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioDiaFinVigencia;

    /** Class member attribute. */
    @Column(name = DominioConstants.FLD_DOMINIODIASCADUCIDAD )
    @JsonProperty(value="diascaducidad")
    private Long dominioDiasCaducidad;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioDiasCaducidad;

    /** Class member attribute. */
    @Column(name = DominioConstants.FLD_DOMINIOPRORRATEOUSUEXISTENTE )
    @JsonProperty(value="prorrateousuexistente")
    private Boolean dominioProrrateoUsuExistente;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioProrrateoUsuExistente;

    /** Class member attribute. */
    @Column(name = DominioConstants.FLD_DOMINIOINCLUSIONMODGRUPOASOC )
    @JsonProperty(value="inclusionmodgrupoasoc")
    private Boolean dominioInclusionModGrupoAsoc;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioInclusionModGrupoAsoc;

    /** Class member attribute. */
    @Column(name = DominioConstants.FLD_DOMINIOPERMITERECHAZADOSAFI )
    @JsonProperty(value="permiterechazadosafi")
    private Boolean dominioPermiteRechazadosAfi;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioPermiteRechazadosAfi;

    /** Class member attribute. */
    @Column(name = DominioConstants.FLD_DOMINIOACEPPOLIZAINTER )
    @JsonProperty(value="aceppolizainter")
    private Boolean dominioAcepPolizaInter;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioAcepPolizaInter;

    /** Class member attribute. */
    @Column(name = DominioConstants.FLD_DOMINIONOVEXCEPCIONREQDOC )
    @JsonProperty(value="novexcepcionreqdoc")
    private Boolean dominioNovExcepcionReqDoc;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioNovExcepcionReqDoc;

    /** Class member attribute. */
    @Column(name = DominioConstants.FLD_DOMINIOSOLNOVCOLOROSCURO )
    @JsonProperty(value="solnovcoloroscuro")
    private String dominioSolNovColorOscuro;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioSolNovColorOscuro;

    /** Class member attribute. */
    @Column(name = DominioConstants.FLD_DOMINIOSOLNOVCOLORCLARO )
    @JsonProperty(value="solnovcolorclaro")
    private String dominioSolNovColorClaro;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioSolNovColorClaro;

    /** Class member attribute. */
    @Column(name = DominioConstants.FLD_DOMINIOSOLNOVLOGO )
    @JsonProperty(value="solnovlogo")
    private String dominioSolNovLogo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioSolNovLogo;

    /** Class member attribute. */
    @Column(name = DominioConstants.FLD_DOMINIOTRAMITEENLINEA )
    @JsonProperty(value="tramiteenlinea")
    private Boolean dominioTramiteEnLinea;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioTramiteEnLinea;

    /** Class member attribute. */
    @Column(name = DominioConstants.FLD_DOMINIOVIGENCIARADICACION )
    @JsonProperty(value="vigenciaradicacion")
    private Boolean dominioVigenciaRadicacion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominioVigenciaRadicacion;

    /** Related Class. */
    @ManyToMany(mappedBy=DominioConstants.ROLE_INVNAME_DOMINIOSCONINCOMPATIBILIDAD)
    @JsonIgnore
    private Collection <Dominio> dominiosConIncompatibilidad;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominiosConIncompatibilidad;

    /** Related Class. */
    @OneToMany(mappedBy = DominioConstants.ROLE_INVNAME_PARENTESCOSDOM)
    @JsonIgnore
    private Collection <ParentescoDom> parentescosDom;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedParentescosDom;

    /** Related Class. */
    @ManyToMany(mappedBy=DominioConstants.ROLE_INVNAME_AGENTEXPRODUCTO)
    @JsonIgnore
    private Collection <AgentexProducto> agentexProducto;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAgentexProducto;

    /** Related Class. */
    @OneToMany(mappedBy = DominioConstants.ROLE_INVNAME_PRORRATEOS)
    @JsonIgnore
    private Collection <Prorrateo> prorrateos;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProrrateos;

    /** Related Class. */
    @OneToMany(mappedBy = DominioConstants.ROLE_INVNAME_LOGGRUPOSUSUARIOS)
    @JsonIgnore
    private Collection <LogGruposUsuarios> logGruposUsuarios;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogGruposUsuarios;

    /** Related Class. */
    @OneToMany(mappedBy = DominioConstants.ROLE_INVNAME_GRUPOASIGNACIONNOVEDAD)
    @JsonIgnore
    private Collection <GrupoAsignacionNovedad> grupoAsignacionNovedad;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedGrupoAsignacionNovedad;

    /** Related Class. */
    @OneToMany(mappedBy = DominioConstants.ROLE_INVNAME_CONFIGURACIONESANS)
    @JsonIgnore
    private Collection <ConfiguracionANS> configuracionesANS;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedConfiguracionesANS;

    /** Related Class. */
    @OneToMany(mappedBy = DominioConstants.ROLE_INVNAME_REPORTESDOMINIO)
    @JsonIgnore
    private Collection <ReportesDominio> reportesDominio;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedReportesDominio;

    /** Related Class. */
    @OneToMany(mappedBy = DominioConstants.ROLE_INVNAME_LOGINCOMPATIBILIDADES)
    @JsonIgnore
    private Collection <LogIncompatibilidades> logIncompatibilidades;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogIncompatibilidades;

    /** Related Class. */
    @OneToMany(mappedBy = DominioConstants.ROLE_INVNAME_LOGDATOSDOMINIO)
    @JsonIgnore
    private Collection <LogDatosDominio> logDatosDominio;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogDatosDominio;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=DominioConstants.FLD_PLANESPLAN, referencedColumnName=PlanesConstants.FLD_PLANESPLAN)
    })
    @JsonIgnore
    private Planes planT;
    /** Related attribute. */
    @Column(name = DominioConstants.FLD_PLANESPLAN, insertable = false, updatable = false)
    private Long planesPlan;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPlanT;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=DominioConstants.FLD_PRODUCTOSPRODUCTO, referencedColumnName=ProductosConstants.FLD_PRODUCTOSPRODUCTO)
    })
    @JsonIgnore
    private Productos productoT;
    /** Related attribute. */
    @Column(name = DominioConstants.FLD_PRODUCTOSPRODUCTO, insertable = false, updatable = false)
    private Long productosProducto;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProductoT;

    /** Related Class. */
    @ManyToMany
    @JoinTable(
        name=Constants.TBL_NAME_DOMINIOPERIODICIDAD,
        joinColumns = {
            @JoinColumn(name=Constants.FLD_TMDOMINIOPERIODICIDAD_DOMINIONUMERO, referencedColumnName=DominioConstants.FLD_DOMINIONUMERO)
        },
        inverseJoinColumns = {
            @JoinColumn(name=Constants.FLD_TMDOMINIOPERIODICIDAD_PERIODICIDADCODIGO, referencedColumnName=PeriodicidadConstants.FLD_PERIODICIDADCODIGO)
    })
    @JsonIgnore
    private Collection <Periodicidad> periodicidades;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPeriodicidades;

    /** Related Class. */
    @ManyToMany
    @JoinTable(
        name=Constants.TBL_NAME_DOMINIOROL,
        joinColumns = {
            @JoinColumn(name=Constants.FLD_TMDOMINIOROL_DOMINIONUMERO, referencedColumnName=DominioConstants.FLD_DOMINIONUMERO)
        },
        inverseJoinColumns = {
            @JoinColumn(name=Constants.FLD_TMDOMINIOROL_ROLIDENTIFICADOR, referencedColumnName=RolConstants.FLD_ROLIDENTIFICADOR)
    })
    @JsonIgnore
    private Collection <Rol> roles;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedRoles;

    /** Related Class. */
    @ManyToMany
    @JoinTable(
        name=Constants.TBL_NAME_DOMINIOFORMAPAGO,
        joinColumns = {
            @JoinColumn(name=Constants.FLD_TMDOMINIOFORMAPAGO_DOMINIONUMERO, referencedColumnName=DominioConstants.FLD_DOMINIONUMERO)
        },
        inverseJoinColumns = {
            @JoinColumn(name=Constants.FLD_TMDOMINIOFORMAPAGO_FORMAPAGOCODIGO, referencedColumnName=FormaPagoConstants.FLD_FORMAPAGOCODIGO)
    })
    @JsonIgnore
    private Collection <FormaPago> formasPago;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFormasPago;

    /** Related Class. */
    @ManyToMany
    @JoinTable(
        name=Constants.TBL_NAME_DOMINIOSPLANTILLAS,
        joinColumns = {
            @JoinColumn(name=Constants.FLD_TMDOMINIOSPLANTILLAS_DOMINIONUMERO, referencedColumnName=DominioConstants.FLD_DOMINIONUMERO)
        },
        inverseJoinColumns = {
            @JoinColumn(name=Constants.FLD_TMDOMINIOSPLANTILLAS_PLANTILLAEMAILIDPLANTILLA, referencedColumnName=PlantillaEmailConstants.FLD_PLANTILLAEMAILIDPLANTILLA)
    })
    @JsonIgnore
    private Collection <PlantillaEmail> plantillas;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPlantillas;

    /** Related Class. */
    @ManyToMany
    @JoinTable(
        name=Constants.TBL_NAME_DOMINIONOVEDAD,
        joinColumns = {
            @JoinColumn(name=Constants.FLD_TMDOMINIONOVEDAD_DOMINIONUMERO, referencedColumnName=DominioConstants.FLD_DOMINIONUMERO)
        },
        inverseJoinColumns = {
            @JoinColumn(name=Constants.FLD_TMDOMINIONOVEDAD_NOVEDADIDNOVEDAD, referencedColumnName=NovedadConstants.FLD_NOVEDADIDNOVEDAD)
    })
    @JsonIgnore
    private Collection <Novedad> novedades;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedades;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=DominioConstants.FLD_GRUPOASIGNACIONID, referencedColumnName=GrupoAsignacionConstants.FLD_GRUPOASIGNACIONID)
    })
    @JsonIgnore
    private GrupoAsignacion grupoAsesores;
    /** Related attribute. */
    @Column(name = DominioConstants.FLD_GRUPOASIGNACIONID, insertable = false, updatable = false)
    private Long grupoAsignacionId;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedGrupoAsesores;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=DominioConstants.FLD_GRUPOASIGNACIONGRUPOAREAMEDICAID, referencedColumnName=GrupoAsignacionConstants.FLD_GRUPOASIGNACIONID)
    })
    @JsonIgnore
    private GrupoAsignacion grupoAreaMedica;
    /** Related attribute. */
    @Column(name = DominioConstants.FLD_GRUPOASIGNACIONGRUPOAREAMEDICAID, insertable = false, updatable = false)
    private Long grupoAsignacionGrupoAreaMedicaId;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedGrupoAreaMedica;

    /** Related Class. */
    @ManyToMany
    @JoinTable(
        name=Constants.TBL_NAME_INCOMPATIBILIDADESDOMINIO,
        joinColumns = {
            @JoinColumn(name=Constants.FLD_TMINCOMPATIBILIDADESDOMINIO_DOMINIONUMERO, referencedColumnName=DominioConstants.FLD_DOMINIONUMERO)
        },
        inverseJoinColumns = {
            @JoinColumn(name=Constants.FLD_TMINCOMPATIBILIDADESDOMINIO_DOMINIODOMINIOSINCOMPATIBLESNUMERO, referencedColumnName=DominioConstants.FLD_DOMINIONUMERO)
    })
    @JsonIgnore
    private Collection <Dominio> dominiosIncompatibles;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDominiosIncompatibles;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public Dominio() {
        dominioNumero = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>Dominio</code>.
     * @param oid Object Identifier of the instance of <code>Dominio</code> to be created.
     * @throws SystemException
     */
    public Dominio(DominioOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            dominioNumero = oid.getDominioNumero();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>dominioNumero</code> attribute<br>in class <code>Dominio</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Dominio</code>
     * @return The value of the <code>dominioNumero</code> attribute<br>in class <code>Dominio</code>.
     */
    public Long getDominioNumero() {
        return dominioNumero;
    }

    /**
     * Sets the value of the <code>dominioNumero</code> attribute<br>in class <code>Dominio</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Dominio</code>
     * @param dominioNumero The new value of the <code>dominioNumero</code> attribute<br>in class <code>Dominio</code>.
     */
    public void setDominioNumero(Long dominioNumero) {
        this.dominioNumero = dominioNumero;
    }

   /**
    * Returns the value of the <code>dominioReqCuesMed</code> attribute.<br>
    * Model Attribute: <code>dominioReqCuesMed</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>dominioReqCuesMed</code> attribute.
    */

    public Boolean getDominioReqCuesMed()  {
    	Boolean value;
        value =  dominioReqCuesMed;
        return value;
    }

   /**
    * Sets the value of the <code>dominioReqCuesMed</code> attribute.<br>
    * Model Attribute: <code>dominioReqCuesMed</code>. Variable Bool<br>
    * Comments: <br>
    * @param dominioReqCuesMed The new value of the <code>dominioReqCuesMed</code> attribute.
    */
    public void setDominioReqCuesMed (Boolean dominioReqCuesMed) {
        modifiedDominioReqCuesMed = true;
        this.dominioReqCuesMed = dominioReqCuesMed;
    }

   /**
    * Sets the value of the <code>modifiedDominioReqCuesMed</code> class property.<br>
    * @param modified The new value of the <code>modifiedDominioReqCuesMed</code>.
    */
    public void setModifiedDominioReqCuesMed(boolean modified) {
        this.modifiedDominioReqCuesMed = modified;
    }

   /**
    * Returns the value of the <code>dominioNoCuesMedTras</code> attribute.<br>
    * Model Attribute: <code>dominioNoCuesMedTras</code>. Variable Bool<br>
    * Comments: Aunque se haya marcado que se debe diligenciar el cuestionario médico, si es traslado no se permitiría
<Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>dominioNoCuesMedTras</code> attribute.
    */

    public Boolean getDominioNoCuesMedTras()  {
    	Boolean value;
        value =  dominioNoCuesMedTras;
        return value;
    }

   /**
    * Sets the value of the <code>dominioNoCuesMedTras</code> attribute.<br>
    * Model Attribute: <code>dominioNoCuesMedTras</code>. Variable Bool<br>
    * Comments: Aunque se haya marcado que se debe diligenciar el cuestionario médico, si es traslado no se permitiría
<Options>
RADIO=1;
</Options><br>
    * @param dominioNoCuesMedTras The new value of the <code>dominioNoCuesMedTras</code> attribute.
    */
    public void setDominioNoCuesMedTras (Boolean dominioNoCuesMedTras) {
        modifiedDominioNoCuesMedTras = true;
        this.dominioNoCuesMedTras = dominioNoCuesMedTras;
    }

   /**
    * Sets the value of the <code>modifiedDominioNoCuesMedTras</code> class property.<br>
    * @param modified The new value of the <code>modifiedDominioNoCuesMedTras</code>.
    */
    public void setModifiedDominioNoCuesMedTras(boolean modified) {
        this.modifiedDominioNoCuesMedTras = modified;
    }

   /**
    * Returns the value of the <code>dominioNuevaAfiliacion</code> attribute.<br>
    * Model Attribute: <code>dominioNuevaAfiliacion</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>dominioNuevaAfiliacion</code> attribute.
    */

    public Boolean getDominioNuevaAfiliacion()  {
    	Boolean value;
        value =  dominioNuevaAfiliacion;
        return value;
    }

   /**
    * Sets the value of the <code>dominioNuevaAfiliacion</code> attribute.<br>
    * Model Attribute: <code>dominioNuevaAfiliacion</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @param dominioNuevaAfiliacion The new value of the <code>dominioNuevaAfiliacion</code> attribute.
    */
    public void setDominioNuevaAfiliacion (Boolean dominioNuevaAfiliacion) {
        modifiedDominioNuevaAfiliacion = true;
        this.dominioNuevaAfiliacion = dominioNuevaAfiliacion;
    }

   /**
    * Sets the value of the <code>modifiedDominioNuevaAfiliacion</code> class property.<br>
    * @param modified The new value of the <code>modifiedDominioNuevaAfiliacion</code>.
    */
    public void setModifiedDominioNuevaAfiliacion(boolean modified) {
        this.modifiedDominioNuevaAfiliacion = modified;
    }

   /**
    * Returns the value of the <code>dominioInclusion</code> attribute.<br>
    * Model Attribute: <code>dominioInclusion</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>dominioInclusion</code> attribute.
    */

    public Boolean getDominioInclusion()  {
    	Boolean value;
        value =  dominioInclusion;
        return value;
    }

   /**
    * Sets the value of the <code>dominioInclusion</code> attribute.<br>
    * Model Attribute: <code>dominioInclusion</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @param dominioInclusion The new value of the <code>dominioInclusion</code> attribute.
    */
    public void setDominioInclusion (Boolean dominioInclusion) {
        modifiedDominioInclusion = true;
        this.dominioInclusion = dominioInclusion;
    }

   /**
    * Sets the value of the <code>modifiedDominioInclusion</code> class property.<br>
    * @param modified The new value of the <code>modifiedDominioInclusion</code>.
    */
    public void setModifiedDominioInclusion(boolean modified) {
        this.modifiedDominioInclusion = modified;
    }

   /**
    * Returns the value of the <code>dominioAcepCuesMat</code> attribute.<br>
    * Model Attribute: <code>dominioAcepCuesMat</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>dominioAcepCuesMat</code> attribute.
    */

    public Boolean getDominioAcepCuesMat()  {
    	Boolean value;
        value =  dominioAcepCuesMat;
        return value;
    }

   /**
    * Sets the value of the <code>dominioAcepCuesMat</code> attribute.<br>
    * Model Attribute: <code>dominioAcepCuesMat</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @param dominioAcepCuesMat The new value of the <code>dominioAcepCuesMat</code> attribute.
    */
    public void setDominioAcepCuesMat (Boolean dominioAcepCuesMat) {
        modifiedDominioAcepCuesMat = true;
        this.dominioAcepCuesMat = dominioAcepCuesMat;
    }

   /**
    * Sets the value of the <code>modifiedDominioAcepCuesMat</code> class property.<br>
    * @param modified The new value of the <code>modifiedDominioAcepCuesMat</code>.
    */
    public void setModifiedDominioAcepCuesMat(boolean modified) {
        this.modifiedDominioAcepCuesMat = modified;
    }

   /**
    * Returns the value of the <code>dominioAcepCuesNeo</code> attribute.<br>
    * Model Attribute: <code>dominioAcepCuesNeo</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>dominioAcepCuesNeo</code> attribute.
    */

    public Boolean getDominioAcepCuesNeo()  {
    	Boolean value;
        value =  dominioAcepCuesNeo;
        return value;
    }

   /**
    * Sets the value of the <code>dominioAcepCuesNeo</code> attribute.<br>
    * Model Attribute: <code>dominioAcepCuesNeo</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @param dominioAcepCuesNeo The new value of the <code>dominioAcepCuesNeo</code> attribute.
    */
    public void setDominioAcepCuesNeo (Boolean dominioAcepCuesNeo) {
        modifiedDominioAcepCuesNeo = true;
        this.dominioAcepCuesNeo = dominioAcepCuesNeo;
    }

   /**
    * Sets the value of the <code>modifiedDominioAcepCuesNeo</code> class property.<br>
    * @param modified The new value of the <code>modifiedDominioAcepCuesNeo</code>.
    */
    public void setModifiedDominioAcepCuesNeo(boolean modified) {
        this.modifiedDominioAcepCuesNeo = modified;
    }

   /**
    * Returns the value of the <code>dominioAcepBBGestante</code> attribute.<br>
    * Model Attribute: <code>dominioAcepBBGestante</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>dominioAcepBBGestante</code> attribute.
    */

    public Boolean getDominioAcepBBGestante()  {
    	Boolean value;
        value =  dominioAcepBBGestante;
        return value;
    }

   /**
    * Sets the value of the <code>dominioAcepBBGestante</code> attribute.<br>
    * Model Attribute: <code>dominioAcepBBGestante</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @param dominioAcepBBGestante The new value of the <code>dominioAcepBBGestante</code> attribute.
    */
    public void setDominioAcepBBGestante (Boolean dominioAcepBBGestante) {
        modifiedDominioAcepBBGestante = true;
        this.dominioAcepBBGestante = dominioAcepBBGestante;
    }

   /**
    * Sets the value of the <code>modifiedDominioAcepBBGestante</code> class property.<br>
    * @param modified The new value of the <code>modifiedDominioAcepBBGestante</code>.
    */
    public void setModifiedDominioAcepBBGestante(boolean modified) {
        this.modifiedDominioAcepBBGestante = modified;
    }

   /**
    * Returns the value of the <code>dominioMostrarPreexAnexos</code> attribute.<br>
    * Model Attribute: <code>dominioMostrarPreexAnexos</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>dominioMostrarPreexAnexos</code> attribute.
    */

    public Boolean getDominioMostrarPreexAnexos()  {
    	Boolean value;
        value =  dominioMostrarPreexAnexos;
        return value;
    }

   /**
    * Sets the value of the <code>dominioMostrarPreexAnexos</code> attribute.<br>
    * Model Attribute: <code>dominioMostrarPreexAnexos</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @param dominioMostrarPreexAnexos The new value of the <code>dominioMostrarPreexAnexos</code> attribute.
    */
    public void setDominioMostrarPreexAnexos (Boolean dominioMostrarPreexAnexos) {
        modifiedDominioMostrarPreexAnexos = true;
        this.dominioMostrarPreexAnexos = dominioMostrarPreexAnexos;
    }

   /**
    * Sets the value of the <code>modifiedDominioMostrarPreexAnexos</code> class property.<br>
    * @param modified The new value of the <code>modifiedDominioMostrarPreexAnexos</code>.
    */
    public void setModifiedDominioMostrarPreexAnexos(boolean modified) {
        this.modifiedDominioMostrarPreexAnexos = modified;
    }

   /**
    * Returns the value of the <code>dominioMostrarPreexContrato</code> attribute.<br>
    * Model Attribute: <code>dominioMostrarPreexContrato</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>dominioMostrarPreexContrato</code> attribute.
    */

    public Boolean getDominioMostrarPreexContrato()  {
    	Boolean value;
        value =  dominioMostrarPreexContrato;
        return value;
    }

   /**
    * Sets the value of the <code>dominioMostrarPreexContrato</code> attribute.<br>
    * Model Attribute: <code>dominioMostrarPreexContrato</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @param dominioMostrarPreexContrato The new value of the <code>dominioMostrarPreexContrato</code> attribute.
    */
    public void setDominioMostrarPreexContrato (Boolean dominioMostrarPreexContrato) {
        modifiedDominioMostrarPreexContrato = true;
        this.dominioMostrarPreexContrato = dominioMostrarPreexContrato;
    }

   /**
    * Sets the value of the <code>modifiedDominioMostrarPreexContrato</code> class property.<br>
    * @param modified The new value of the <code>modifiedDominioMostrarPreexContrato</code>.
    */
    public void setModifiedDominioMostrarPreexContrato(boolean modified) {
        this.modifiedDominioMostrarPreexContrato = modified;
    }

   /**
    * Returns the value of the <code>dominioIgnorarPreexistencias</code> attribute.<br>
    * Model Attribute: <code>dominioIgnorarPreexistencias</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>dominioIgnorarPreexistencias</code> attribute.
    */

    public Boolean getDominioIgnorarPreexistencias()  {
    	Boolean value;
        value =  dominioIgnorarPreexistencias;
        return value;
    }

   /**
    * Sets the value of the <code>dominioIgnorarPreexistencias</code> attribute.<br>
    * Model Attribute: <code>dominioIgnorarPreexistencias</code>. Variable Bool<br>
    * Comments: <Options>
RADIO=1;
</Options><br>
    * @param dominioIgnorarPreexistencias The new value of the <code>dominioIgnorarPreexistencias</code> attribute.
    */
    public void setDominioIgnorarPreexistencias (Boolean dominioIgnorarPreexistencias) {
        modifiedDominioIgnorarPreexistencias = true;
        this.dominioIgnorarPreexistencias = dominioIgnorarPreexistencias;
    }

   /**
    * Sets the value of the <code>modifiedDominioIgnorarPreexistencias</code> class property.<br>
    * @param modified The new value of the <code>modifiedDominioIgnorarPreexistencias</code>.
    */
    public void setModifiedDominioIgnorarPreexistencias(boolean modified) {
        this.modifiedDominioIgnorarPreexistencias = modified;
    }

   /**
    * Returns the value of the <code>dominioRespClauNombre</code> attribute.<br>
    * Model Attribute: <code>dominioRespClauNombre</code>. Variable String Size=100<br>
    * Comments: Req. 4: Firmas a los clausulados. Nombre completo
Referencia: HU-AEEPS-03<br>
    * @return The value of the <code>dominioRespClauNombre</code> attribute.
    */

    public String getDominioRespClauNombre()  {
    	String value;
        value =  dominioRespClauNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>dominioRespClauNombre</code> attribute.<br>
    * Model Attribute: <code>dominioRespClauNombre</code>. Variable String Size=100<br>
    * Comments: Req. 4: Firmas a los clausulados. Nombre completo
Referencia: HU-AEEPS-03<br>
    * @param dominioRespClauNombre The new value of the <code>dominioRespClauNombre</code> attribute.
    */
    public void setDominioRespClauNombre (String dominioRespClauNombre) {
        modifiedDominioRespClauNombre = true;
        this.dominioRespClauNombre = dominioRespClauNombre;
    }

   /**
    * Sets the value of the <code>modifiedDominioRespClauNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedDominioRespClauNombre</code>.
    */
    public void setModifiedDominioRespClauNombre(boolean modified) {
        this.modifiedDominioRespClauNombre = modified;
    }

   /**
    * Returns the value of the <code>dominioRespClauCelula</code> attribute.<br>
    * Model Attribute: <code>dominioRespClauCelula</code>. Variable String Size=15<br>
    * Comments: Req. 4: Firmas a los clausulados. Nº de célula de ciudadanía
Referencia: HU-AEEPS-03<br>
    * @return The value of the <code>dominioRespClauCelula</code> attribute.
    */

    public String getDominioRespClauCelula()  {
    	String value;
        value =  dominioRespClauCelula;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>dominioRespClauCelula</code> attribute.<br>
    * Model Attribute: <code>dominioRespClauCelula</code>. Variable String Size=15<br>
    * Comments: Req. 4: Firmas a los clausulados. Nº de célula de ciudadanía
Referencia: HU-AEEPS-03<br>
    * @param dominioRespClauCelula The new value of the <code>dominioRespClauCelula</code> attribute.
    */
    public void setDominioRespClauCelula (String dominioRespClauCelula) {
        modifiedDominioRespClauCelula = true;
        this.dominioRespClauCelula = dominioRespClauCelula;
    }

   /**
    * Sets the value of the <code>modifiedDominioRespClauCelula</code> class property.<br>
    * @param modified The new value of the <code>modifiedDominioRespClauCelula</code>.
    */
    public void setModifiedDominioRespClauCelula(boolean modified) {
        this.modifiedDominioRespClauCelula = modified;
    }

   /**
    * Returns the value of the <code>dominioRespClauExpCelula</code> attribute.<br>
    * Model Attribute: <code>dominioRespClauExpCelula</code>. Variable String Size=50<br>
    * Comments: Req. 4: Firmas a los clausulados. Lugar de expedición de la célula de ciudadanía
Referencia: HU-AEEPS-03<br>
    * @return The value of the <code>dominioRespClauExpCelula</code> attribute.
    */

    public String getDominioRespClauExpCelula()  {
    	String value;
        value =  dominioRespClauExpCelula;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>dominioRespClauExpCelula</code> attribute.<br>
    * Model Attribute: <code>dominioRespClauExpCelula</code>. Variable String Size=50<br>
    * Comments: Req. 4: Firmas a los clausulados. Lugar de expedición de la célula de ciudadanía
Referencia: HU-AEEPS-03<br>
    * @param dominioRespClauExpCelula The new value of the <code>dominioRespClauExpCelula</code> attribute.
    */
    public void setDominioRespClauExpCelula (String dominioRespClauExpCelula) {
        modifiedDominioRespClauExpCelula = true;
        this.dominioRespClauExpCelula = dominioRespClauExpCelula;
    }

   /**
    * Sets the value of the <code>modifiedDominioRespClauExpCelula</code> class property.<br>
    * @param modified The new value of the <code>modifiedDominioRespClauExpCelula</code>.
    */
    public void setModifiedDominioRespClauExpCelula(boolean modified) {
        this.modifiedDominioRespClauExpCelula = modified;
    }

   /**
    * Returns the value of the <code>dominioRespClauCargo</code> attribute.<br>
    * Model Attribute: <code>dominioRespClauCargo</code>. Variable String Size=50<br>
    * Comments: Req. 4: Firmas a los clausulados. cargo que ostenta en la empresa
Referencia: HU-AEEPS-03<br>
    * @return The value of the <code>dominioRespClauCargo</code> attribute.
    */

    public String getDominioRespClauCargo()  {
    	String value;
        value =  dominioRespClauCargo;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>dominioRespClauCargo</code> attribute.<br>
    * Model Attribute: <code>dominioRespClauCargo</code>. Variable String Size=50<br>
    * Comments: Req. 4: Firmas a los clausulados. cargo que ostenta en la empresa
Referencia: HU-AEEPS-03<br>
    * @param dominioRespClauCargo The new value of the <code>dominioRespClauCargo</code> attribute.
    */
    public void setDominioRespClauCargo (String dominioRespClauCargo) {
        modifiedDominioRespClauCargo = true;
        this.dominioRespClauCargo = dominioRespClauCargo;
    }

   /**
    * Sets the value of the <code>modifiedDominioRespClauCargo</code> class property.<br>
    * @param modified The new value of the <code>modifiedDominioRespClauCargo</code>.
    */
    public void setModifiedDominioRespClauCargo(boolean modified) {
        this.modifiedDominioRespClauCargo = modified;
    }

   /**
    * Returns the value of the <code>dominioRespClauFirma</code> attribute.<br>
    * Model Attribute: <code>dominioRespClauFirma</code>. Variable Blob<br>
    * Comments: Req. 4: Firmas a los clausulados. Imagen de la firma
Referencia: HU-AEEPS-03<br>
    * @return The value of the <code>dominioRespClauFirma</code> attribute.
    */

    public byte[] getDominioRespClauFirma()  {
    	byte[] value;
        value =  dominioRespClauFirma;
        return value;
    }

   /**
    * Sets the value of the <code>dominioRespClauFirma</code> attribute.<br>
    * Model Attribute: <code>dominioRespClauFirma</code>. Variable Blob<br>
    * Comments: Req. 4: Firmas a los clausulados. Imagen de la firma
Referencia: HU-AEEPS-03<br>
    * @param dominioRespClauFirma The new value of the <code>dominioRespClauFirma</code> attribute.
    */
    public void setDominioRespClauFirma (byte[] dominioRespClauFirma) {
        this.dominioRespClauFirmaInit = true;
        modifiedDominioRespClauFirma = true;
        this.dominioRespClauFirma = dominioRespClauFirma;
    }

   /**
    * Sets the value of the <code>modifiedDominioRespClauFirma</code> class property.<br>
    * @param modified The new value of the <code>modifiedDominioRespClauFirma</code>.
    */
    public void setModifiedDominioRespClauFirma(boolean modified) {
        this.modifiedDominioRespClauFirma = modified;
    }

   /**
    * Returns the value of the <code>dominioDiaIniVigencia</code> attribute.<br>
    * Model Attribute: <code>dominioDiaIniVigencia</code>. Variable Nat<br>
    * Comments: Parametrización de la fecha inicio de contratación para los planes voluntarios.
La parametrización indicará el día inicial y final que serán los valores que se utilizarán para calcular la fecha de inicio de contratación, que no será solicitada al usuario.<br>
    * @return The value of the <code>dominioDiaIniVigencia</code> attribute.
    */

    public Long getDominioDiaIniVigencia()  {
    	Long value;
        value =  dominioDiaIniVigencia;
        return value;
    }

   /**
    * Sets the value of the <code>dominioDiaIniVigencia</code> attribute.<br>
    * Model Attribute: <code>dominioDiaIniVigencia</code>. Variable Nat<br>
    * Comments: Parametrización de la fecha inicio de contratación para los planes voluntarios.
La parametrización indicará el día inicial y final que serán los valores que se utilizarán para calcular la fecha de inicio de contratación, que no será solicitada al usuario.<br>
    * @param dominioDiaIniVigencia The new value of the <code>dominioDiaIniVigencia</code> attribute.
    */
    public void setDominioDiaIniVigencia (Long dominioDiaIniVigencia) {
        modifiedDominioDiaIniVigencia = true;
        this.dominioDiaIniVigencia = dominioDiaIniVigencia;
    }

   /**
    * Sets the value of the <code>modifiedDominioDiaIniVigencia</code> class property.<br>
    * @param modified The new value of the <code>modifiedDominioDiaIniVigencia</code>.
    */
    public void setModifiedDominioDiaIniVigencia(boolean modified) {
        this.modifiedDominioDiaIniVigencia = modified;
    }

   /**
    * Returns the value of the <code>dominioDiaFinVigencia</code> attribute.<br>
    * Model Attribute: <code>dominioDiaFinVigencia</code>. Variable Nat<br>
    * Comments: Parametrización de la fecha inicio de contratación para los planes voluntarios.
La parametrización indicará el día inicial y final que serán los valores que se utilizarán para calcular la fecha de inicio de contratación, que no será solicitada al usuario.<br>
    * @return The value of the <code>dominioDiaFinVigencia</code> attribute.
    */

    public Long getDominioDiaFinVigencia()  {
    	Long value;
        value =  dominioDiaFinVigencia;
        return value;
    }

   /**
    * Sets the value of the <code>dominioDiaFinVigencia</code> attribute.<br>
    * Model Attribute: <code>dominioDiaFinVigencia</code>. Variable Nat<br>
    * Comments: Parametrización de la fecha inicio de contratación para los planes voluntarios.
La parametrización indicará el día inicial y final que serán los valores que se utilizarán para calcular la fecha de inicio de contratación, que no será solicitada al usuario.<br>
    * @param dominioDiaFinVigencia The new value of the <code>dominioDiaFinVigencia</code> attribute.
    */
    public void setDominioDiaFinVigencia (Long dominioDiaFinVigencia) {
        modifiedDominioDiaFinVigencia = true;
        this.dominioDiaFinVigencia = dominioDiaFinVigencia;
    }

   /**
    * Sets the value of the <code>modifiedDominioDiaFinVigencia</code> class property.<br>
    * @param modified The new value of the <code>modifiedDominioDiaFinVigencia</code>.
    */
    public void setModifiedDominioDiaFinVigencia(boolean modified) {
        this.modifiedDominioDiaFinVigencia = modified;
    }

   /**
    * Returns the value of the <code>dominioDiasCaducidad</code> attribute.<br>
    * Model Attribute: <code>dominioDiasCaducidad</code>. Variable Nat<br>
    * Comments: Req. 14: Anulación automática de solicitudes sin tramitar
Referencia: HU-AEEPS-14
Anulación de solicitudes de afiliación electrónica que cumplido un tiempo no hayan sido gestionadas.
Se requiere implementar un parámetro de tiempo máximo en días calendario por producto plan para mantener una solicitud sin tramitar, una vez se supere el tiempo parametrizado la solicitud debe anularse.<br>
    * @return The value of the <code>dominioDiasCaducidad</code> attribute.
    */

    public Long getDominioDiasCaducidad()  {
    	Long value;
        value =  dominioDiasCaducidad;
        return value;
    }

   /**
    * Sets the value of the <code>dominioDiasCaducidad</code> attribute.<br>
    * Model Attribute: <code>dominioDiasCaducidad</code>. Variable Nat<br>
    * Comments: Req. 14: Anulación automática de solicitudes sin tramitar
Referencia: HU-AEEPS-14
Anulación de solicitudes de afiliación electrónica que cumplido un tiempo no hayan sido gestionadas.
Se requiere implementar un parámetro de tiempo máximo en días calendario por producto plan para mantener una solicitud sin tramitar, una vez se supere el tiempo parametrizado la solicitud debe anularse.<br>
    * @param dominioDiasCaducidad The new value of the <code>dominioDiasCaducidad</code> attribute.
    */
    public void setDominioDiasCaducidad (Long dominioDiasCaducidad) {
        modifiedDominioDiasCaducidad = true;
        this.dominioDiasCaducidad = dominioDiasCaducidad;
    }

   /**
    * Sets the value of the <code>modifiedDominioDiasCaducidad</code> class property.<br>
    * @param modified The new value of the <code>modifiedDominioDiasCaducidad</code>.
    */
    public void setModifiedDominioDiasCaducidad(boolean modified) {
        this.modifiedDominioDiasCaducidad = modified;
    }

   /**
    * Returns the value of the <code>dominioProrrateoUsuExistente</code> attribute.<br>
    * Model Attribute: <code>dominioProrrateoUsuExistente</code>. Variable Bool<br>
    * Comments: GdC-14: Req. 13: Prorrateo. Debe ser configurable por Producto-Plan que esta opción de prorrateo solo aplica para usuarios nuevos
<Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>dominioProrrateoUsuExistente</code> attribute.
    */

    public Boolean getDominioProrrateoUsuExistente()  {
    	Boolean value;
        value =  dominioProrrateoUsuExistente;
        return value;
    }

   /**
    * Sets the value of the <code>dominioProrrateoUsuExistente</code> attribute.<br>
    * Model Attribute: <code>dominioProrrateoUsuExistente</code>. Variable Bool<br>
    * Comments: GdC-14: Req. 13: Prorrateo. Debe ser configurable por Producto-Plan que esta opción de prorrateo solo aplica para usuarios nuevos
<Options>
RADIO=1;
</Options><br>
    * @param dominioProrrateoUsuExistente The new value of the <code>dominioProrrateoUsuExistente</code> attribute.
    */
    public void setDominioProrrateoUsuExistente (Boolean dominioProrrateoUsuExistente) {
        modifiedDominioProrrateoUsuExistente = true;
        this.dominioProrrateoUsuExistente = dominioProrrateoUsuExistente;
    }

   /**
    * Sets the value of the <code>modifiedDominioProrrateoUsuExistente</code> class property.<br>
    * @param modified The new value of the <code>modifiedDominioProrrateoUsuExistente</code>.
    */
    public void setModifiedDominioProrrateoUsuExistente(boolean modified) {
        this.modifiedDominioProrrateoUsuExistente = modified;
    }

   /**
    * Returns the value of the <code>dominioInclusionModGrupoAsoc</code> attribute.<br>
    * Model Attribute: <code>dominioInclusionModGrupoAsoc</code>. Variable Bool<br>
    * Comments: GcD-14:Req. 16: Modificación del grupo asociado en inclusiones
En inclusiones poder modificar el grupo asociado. 
Esta opción debe ser parametrizable por Producto-Plan.

<Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>dominioInclusionModGrupoAsoc</code> attribute.
    */

    public Boolean getDominioInclusionModGrupoAsoc()  {
    	Boolean value;
        value =  dominioInclusionModGrupoAsoc;
        return value;
    }

   /**
    * Sets the value of the <code>dominioInclusionModGrupoAsoc</code> attribute.<br>
    * Model Attribute: <code>dominioInclusionModGrupoAsoc</code>. Variable Bool<br>
    * Comments: GcD-14:Req. 16: Modificación del grupo asociado en inclusiones
En inclusiones poder modificar el grupo asociado. 
Esta opción debe ser parametrizable por Producto-Plan.

<Options>
RADIO=1;
</Options><br>
    * @param dominioInclusionModGrupoAsoc The new value of the <code>dominioInclusionModGrupoAsoc</code> attribute.
    */
    public void setDominioInclusionModGrupoAsoc (Boolean dominioInclusionModGrupoAsoc) {
        modifiedDominioInclusionModGrupoAsoc = true;
        this.dominioInclusionModGrupoAsoc = dominioInclusionModGrupoAsoc;
    }

   /**
    * Sets the value of the <code>modifiedDominioInclusionModGrupoAsoc</code> class property.<br>
    * @param modified The new value of the <code>modifiedDominioInclusionModGrupoAsoc</code>.
    */
    public void setModifiedDominioInclusionModGrupoAsoc(boolean modified) {
        this.modifiedDominioInclusionModGrupoAsoc = modified;
    }

   /**
    * Returns the value of the <code>dominioPermiteRechazadosAfi</code> attribute.<br>
    * Model Attribute: <code>dominioPermiteRechazadosAfi</code>. Variable Bool<br>
    * Comments: Req. 26: Configurar registro rechazado afiliación
Configurar por Producto-Plan si se pueden registrar beneficiarios así el usuario tenga la marcación rechazado afiliación. 
Hay planes que no importa esta marcación para registrar usuarios

<Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>dominioPermiteRechazadosAfi</code> attribute.
    */

    public Boolean getDominioPermiteRechazadosAfi()  {
    	Boolean value;
        value =  dominioPermiteRechazadosAfi;
        return value;
    }

   /**
    * Sets the value of the <code>dominioPermiteRechazadosAfi</code> attribute.<br>
    * Model Attribute: <code>dominioPermiteRechazadosAfi</code>. Variable Bool<br>
    * Comments: Req. 26: Configurar registro rechazado afiliación
Configurar por Producto-Plan si se pueden registrar beneficiarios así el usuario tenga la marcación rechazado afiliación. 
Hay planes que no importa esta marcación para registrar usuarios

<Options>
RADIO=1;
</Options><br>
    * @param dominioPermiteRechazadosAfi The new value of the <code>dominioPermiteRechazadosAfi</code> attribute.
    */
    public void setDominioPermiteRechazadosAfi (Boolean dominioPermiteRechazadosAfi) {
        modifiedDominioPermiteRechazadosAfi = true;
        this.dominioPermiteRechazadosAfi = dominioPermiteRechazadosAfi;
    }

   /**
    * Sets the value of the <code>modifiedDominioPermiteRechazadosAfi</code> class property.<br>
    * @param modified The new value of the <code>modifiedDominioPermiteRechazadosAfi</code>.
    */
    public void setModifiedDominioPermiteRechazadosAfi(boolean modified) {
        this.modifiedDominioPermiteRechazadosAfi = modified;
    }

   /**
    * Returns the value of the <code>dominioAcepPolizaInter</code> attribute.<br>
    * Model Attribute: <code>dominioAcepPolizaInter</code>. Variable Bool<br>
    * Comments: GdC-14:Req. 75: Póliza internacional
Se requiere agregar una opción en el cuadro de atributos la cual nos informe si el usuario tiene o no Póliza internacional. 
La parametrización que indica si se le debe solicitar si tiene póliza internacional como dato a un beneficiario se realizará en el Dominio, junto con el resto de parametrizaciones similares.

<Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>dominioAcepPolizaInter</code> attribute.
    */

    public Boolean getDominioAcepPolizaInter()  {
    	Boolean value;
        value =  dominioAcepPolizaInter;
        return value;
    }

   /**
    * Sets the value of the <code>dominioAcepPolizaInter</code> attribute.<br>
    * Model Attribute: <code>dominioAcepPolizaInter</code>. Variable Bool<br>
    * Comments: GdC-14:Req. 75: Póliza internacional
Se requiere agregar una opción en el cuadro de atributos la cual nos informe si el usuario tiene o no Póliza internacional. 
La parametrización que indica si se le debe solicitar si tiene póliza internacional como dato a un beneficiario se realizará en el Dominio, junto con el resto de parametrizaciones similares.

<Options>
RADIO=1;
</Options><br>
    * @param dominioAcepPolizaInter The new value of the <code>dominioAcepPolizaInter</code> attribute.
    */
    public void setDominioAcepPolizaInter (Boolean dominioAcepPolizaInter) {
        modifiedDominioAcepPolizaInter = true;
        this.dominioAcepPolizaInter = dominioAcepPolizaInter;
    }

   /**
    * Sets the value of the <code>modifiedDominioAcepPolizaInter</code> class property.<br>
    * @param modified The new value of the <code>modifiedDominioAcepPolizaInter</code>.
    */
    public void setModifiedDominioAcepPolizaInter(boolean modified) {
        this.modifiedDominioAcepPolizaInter = modified;
    }

   /**
    * Returns the value of the <code>dominioNovExcepcionReqDoc</code> attribute.<br>
    * Model Attribute: <code>dominioNovExcepcionReqDoc</code>. Variable Bool<br>
    * Comments: GdC 25 -  Req 11: -	La opción para indicar si es obligatorio o no subir documentos para estas solicitudes debe ser configurable por dominio

<Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>dominioNovExcepcionReqDoc</code> attribute.
    */

    public Boolean getDominioNovExcepcionReqDoc()  {
    	Boolean value;
        value =  dominioNovExcepcionReqDoc;
        return value;
    }

   /**
    * Sets the value of the <code>dominioNovExcepcionReqDoc</code> attribute.<br>
    * Model Attribute: <code>dominioNovExcepcionReqDoc</code>. Variable Bool<br>
    * Comments: GdC 25 -  Req 11: -	La opción para indicar si es obligatorio o no subir documentos para estas solicitudes debe ser configurable por dominio

<Options>
RADIO=1;
</Options><br>
    * @param dominioNovExcepcionReqDoc The new value of the <code>dominioNovExcepcionReqDoc</code> attribute.
    */
    public void setDominioNovExcepcionReqDoc (Boolean dominioNovExcepcionReqDoc) {
        modifiedDominioNovExcepcionReqDoc = true;
        this.dominioNovExcepcionReqDoc = dominioNovExcepcionReqDoc;
    }

   /**
    * Sets the value of the <code>modifiedDominioNovExcepcionReqDoc</code> class property.<br>
    * @param modified The new value of the <code>modifiedDominioNovExcepcionReqDoc</code>.
    */
    public void setModifiedDominioNovExcepcionReqDoc(boolean modified) {
        this.modifiedDominioNovExcepcionReqDoc = modified;
    }

   /**
    * Returns the value of the <code>dominioSolNovColorOscuro</code> attribute.<br>
    * Model Attribute: <code>dominioSolNovColorOscuro</code>. Variable String Size=10<br>
    * Comments: GdC 25: Req 10: Reporte de solicitud de novedad. Desde la configuración de dominios se debe configurar que producto-plan tiene habilitada esta funcionalidad y que formato debe visualizar (para cambiar el logo y el color)<br>
    * @return The value of the <code>dominioSolNovColorOscuro</code> attribute.
    */

    public String getDominioSolNovColorOscuro()  {
    	String value;
        value =  dominioSolNovColorOscuro;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>dominioSolNovColorOscuro</code> attribute.<br>
    * Model Attribute: <code>dominioSolNovColorOscuro</code>. Variable String Size=10<br>
    * Comments: GdC 25: Req 10: Reporte de solicitud de novedad. Desde la configuración de dominios se debe configurar que producto-plan tiene habilitada esta funcionalidad y que formato debe visualizar (para cambiar el logo y el color)<br>
    * @param dominioSolNovColorOscuro The new value of the <code>dominioSolNovColorOscuro</code> attribute.
    */
    public void setDominioSolNovColorOscuro (String dominioSolNovColorOscuro) {
        modifiedDominioSolNovColorOscuro = true;
        this.dominioSolNovColorOscuro = dominioSolNovColorOscuro;
    }

   /**
    * Sets the value of the <code>modifiedDominioSolNovColorOscuro</code> class property.<br>
    * @param modified The new value of the <code>modifiedDominioSolNovColorOscuro</code>.
    */
    public void setModifiedDominioSolNovColorOscuro(boolean modified) {
        this.modifiedDominioSolNovColorOscuro = modified;
    }

   /**
    * Returns the value of the <code>dominioSolNovColorClaro</code> attribute.<br>
    * Model Attribute: <code>dominioSolNovColorClaro</code>. Variable String Size=10<br>
    * Comments: GdC 25: Req 10: Reporte de solicitud de novedad. Desde la configuración de dominios se debe configurar que producto-plan tiene habilitada esta funcionalidad y que formato debe visualizar (para cambiar el logo y el color)<br>
    * @return The value of the <code>dominioSolNovColorClaro</code> attribute.
    */

    public String getDominioSolNovColorClaro()  {
    	String value;
        value =  dominioSolNovColorClaro;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>dominioSolNovColorClaro</code> attribute.<br>
    * Model Attribute: <code>dominioSolNovColorClaro</code>. Variable String Size=10<br>
    * Comments: GdC 25: Req 10: Reporte de solicitud de novedad. Desde la configuración de dominios se debe configurar que producto-plan tiene habilitada esta funcionalidad y que formato debe visualizar (para cambiar el logo y el color)<br>
    * @param dominioSolNovColorClaro The new value of the <code>dominioSolNovColorClaro</code> attribute.
    */
    public void setDominioSolNovColorClaro (String dominioSolNovColorClaro) {
        modifiedDominioSolNovColorClaro = true;
        this.dominioSolNovColorClaro = dominioSolNovColorClaro;
    }

   /**
    * Sets the value of the <code>modifiedDominioSolNovColorClaro</code> class property.<br>
    * @param modified The new value of the <code>modifiedDominioSolNovColorClaro</code>.
    */
    public void setModifiedDominioSolNovColorClaro(boolean modified) {
        this.modifiedDominioSolNovColorClaro = modified;
    }

   /**
    * Returns the value of the <code>dominioSolNovLogo</code> attribute.<br>
    * Model Attribute: <code>dominioSolNovLogo</code>. Variable String Size=50<br>
    * Comments: GdC 25: Req 10: Reporte de solicitud de novedad. Desde la configuración de dominios se debe configurar que producto-plan tiene habilitada esta funcionalidad y que formato debe visualizar (para cambiar el logo y el color)<br>
    * @return The value of the <code>dominioSolNovLogo</code> attribute.
    */

    public String getDominioSolNovLogo()  {
    	String value;
        value =  dominioSolNovLogo;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>dominioSolNovLogo</code> attribute.<br>
    * Model Attribute: <code>dominioSolNovLogo</code>. Variable String Size=50<br>
    * Comments: GdC 25: Req 10: Reporte de solicitud de novedad. Desde la configuración de dominios se debe configurar que producto-plan tiene habilitada esta funcionalidad y que formato debe visualizar (para cambiar el logo y el color)<br>
    * @param dominioSolNovLogo The new value of the <code>dominioSolNovLogo</code> attribute.
    */
    public void setDominioSolNovLogo (String dominioSolNovLogo) {
        modifiedDominioSolNovLogo = true;
        this.dominioSolNovLogo = dominioSolNovLogo;
    }

   /**
    * Sets the value of the <code>modifiedDominioSolNovLogo</code> class property.<br>
    * @param modified The new value of the <code>modifiedDominioSolNovLogo</code>.
    */
    public void setModifiedDominioSolNovLogo(boolean modified) {
        this.modifiedDominioSolNovLogo = modified;
    }

   /**
    * Returns the value of the <code>dominioTramiteEnLinea</code> attribute.<br>
    * Model Attribute: <code>dominioTramiteEnLinea</code>. Variable Bool<br>
    * Comments: GdC-40:Req. 5: Configuración trámite en línea de solicitudesSe requiere un nuevo valor de configuración por Dominio (Producto-Plan) que indique si las solicitudes (tanto de nueva contratación como de inclusión) de este se tramitan en línea o no. 
<Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>dominioTramiteEnLinea</code> attribute.
    */

    public Boolean getDominioTramiteEnLinea()  {
    	Boolean value;
        value =  dominioTramiteEnLinea;
        return value;
    }

   /**
    * Sets the value of the <code>dominioTramiteEnLinea</code> attribute.<br>
    * Model Attribute: <code>dominioTramiteEnLinea</code>. Variable Bool<br>
    * Comments: GdC-40:Req. 5: Configuración trámite en línea de solicitudesSe requiere un nuevo valor de configuración por Dominio (Producto-Plan) que indique si las solicitudes (tanto de nueva contratación como de inclusión) de este se tramitan en línea o no. 
<Options>
RADIO=1;
</Options><br>
    * @param dominioTramiteEnLinea The new value of the <code>dominioTramiteEnLinea</code> attribute.
    */
    public void setDominioTramiteEnLinea (Boolean dominioTramiteEnLinea) {
        modifiedDominioTramiteEnLinea = true;
        this.dominioTramiteEnLinea = dominioTramiteEnLinea;
    }

   /**
    * Sets the value of the <code>modifiedDominioTramiteEnLinea</code> class property.<br>
    * @param modified The new value of the <code>modifiedDominioTramiteEnLinea</code>.
    */
    public void setModifiedDominioTramiteEnLinea(boolean modified) {
        this.modifiedDominioTramiteEnLinea = modified;
    }

   /**
    * Returns the value of the <code>dominioVigenciaRadicacion</code> attribute.<br>
    * Model Attribute: <code>dominioVigenciaRadicacion</code>. Variable Bool<br>
    * Comments: GdC-40:Req. 7: Fecha de radicación por Producto-Plan

Se requiere añadir una nueva configuración a Dominio (Producto-Plan) que indique si sus solicitudes pueden radicarse cualquier día del mes o tan solo el día uno.
<Options>
RADIO=1;
</Options><br>
    * @return The value of the <code>dominioVigenciaRadicacion</code> attribute.
    */

    public Boolean getDominioVigenciaRadicacion()  {
    	Boolean value;
        value =  dominioVigenciaRadicacion;
        return value;
    }

   /**
    * Sets the value of the <code>dominioVigenciaRadicacion</code> attribute.<br>
    * Model Attribute: <code>dominioVigenciaRadicacion</code>. Variable Bool<br>
    * Comments: GdC-40:Req. 7: Fecha de radicación por Producto-Plan

Se requiere añadir una nueva configuración a Dominio (Producto-Plan) que indique si sus solicitudes pueden radicarse cualquier día del mes o tan solo el día uno.
<Options>
RADIO=1;
</Options><br>
    * @param dominioVigenciaRadicacion The new value of the <code>dominioVigenciaRadicacion</code> attribute.
    */
    public void setDominioVigenciaRadicacion (Boolean dominioVigenciaRadicacion) {
        modifiedDominioVigenciaRadicacion = true;
        this.dominioVigenciaRadicacion = dominioVigenciaRadicacion;
    }

   /**
    * Sets the value of the <code>modifiedDominioVigenciaRadicacion</code> class property.<br>
    * @param modified The new value of the <code>modifiedDominioVigenciaRadicacion</code>.
    */
    public void setModifiedDominioVigenciaRadicacion(boolean modified) {
        this.modifiedDominioVigenciaRadicacion = modified;
    }

    /**
     * Returns the instance of <code>Dominio</code> related through the <code>DominiosConIncompatibilidad</code> role.
     * Model Relationship:
     * <code>[Dominio] DominiosConIncompatibilidad 0:M  ------ 0:M  DominiosIncompatibles [Dominio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Dominio</code> related through the <code>DominiosConIncompatibilidad</code> role.
     */
    @JsonIgnore
    public Collection <Dominio> getDominiosConIncompatibilidad() {
        return dominiosConIncompatibilidad;
    }

    /**
     * Adds an instance of <code>Dominio</code> related through the <code>DominiosConIncompatibilidad</code> role.
     * @param dominiosConIncompatibilidad The instance to add to the <code>DominiosConIncompatibilidad</code> role.
     */
    public void add2DominiosConIncompatibilidad(Dominio dominiosConIncompatibilidad) {
        this.dominiosConIncompatibilidad.add(dominiosConIncompatibilidad);
    }
    /**
     * Removes an instance of <code>Dominio</code> related through the <code>DominiosConIncompatibilidad</code> role.
     * @param dominiosConIncompatibilidad The instance to be removed
     */
    public void removeFromDominiosConIncompatibilidad(Dominio dominiosConIncompatibilidad) {
    	this.dominiosConIncompatibilidad.remove(dominiosConIncompatibilidad);
    }
    /**
     * Sets instances of <code>Dominio</code> related through the <code>DominiosConIncompatibilidad</code> role.
     * @param dominiosConIncompatibilidad The new value for the <code>DominiosConIncompatibilidad</code> role.
     */
    public void setDominiosConIncompatibilidad(Collection < Dominio > dominiosConIncompatibilidad) {
        this.dominiosConIncompatibilidad = dominiosConIncompatibilidad;
    }

   /**
    * This method gets the attribute value <code>modifiedDominiosConIncompatibilidad</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDominiosConIncompatibilidad</code> has been modified.
    */
    public boolean isModifiedDominiosConIncompatibilidad(){
        return modifiedDominiosConIncompatibilidad;
    }

    /**
     * Returns the instance of <code>ParentescoDom</code> related through the <code>ParentescosDom</code> role.
     * Model Relationship:
     * <code>[ParentescoDom] ParentescosDom 0:M  ------ 1:1  Dominio [Dominio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>ParentescoDom</code> related through the <code>ParentescosDom</code> role.
     */
    @JsonIgnore
    public Collection <ParentescoDom> getParentescosDom() {
        return parentescosDom;
    }

    /**
     * Adds an instance of <code>ParentescoDom</code> related through the <code>ParentescosDom</code> role.
     * @param parentescosDom The instance to add to the <code>ParentescosDom</code> role.
     */
    public void add2ParentescosDom(ParentescoDom parentescosDom) {
        this.parentescosDom.add(parentescosDom);
    }
    /**
     * Removes an instance of <code>ParentescoDom</code> related through the <code>ParentescosDom</code> role.
     * @param parentescosDom The instance to be removed
     */
    public void removeFromParentescosDom(ParentescoDom parentescosDom) {
    	this.parentescosDom.remove(parentescosDom);
    }
    /**
     * Sets instances of <code>ParentescoDom</code> related through the <code>ParentescosDom</code> role.
     * @param parentescosDom The new value for the <code>ParentescosDom</code> role.
     */
    public void setParentescosDom(Collection < ParentescoDom > parentescosDom) {
        this.parentescosDom = parentescosDom;
    }

   /**
    * This method gets the attribute value <code>modifiedParentescosDom</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedParentescosDom</code> has been modified.
    */
    public boolean isModifiedParentescosDom(){
        return modifiedParentescosDom;
    }

    /**
     * Returns the instance of <code>AgentexProducto</code> related through the <code>AgentexProducto</code> role.
     * Model Relationship:
     * <code>[AgentexProducto] AgentexProducto 0:M  ------ 0:M  Dominios [Dominio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>AgentexProducto</code> related through the <code>AgentexProducto</code> role.
     */
    @JsonIgnore
    public Collection <AgentexProducto> getAgentexProducto() {
        return agentexProducto;
    }

    /**
     * Adds an instance of <code>AgentexProducto</code> related through the <code>AgentexProducto</code> role.
     * @param agentexProducto The instance to add to the <code>AgentexProducto</code> role.
     */
    public void add2AgentexProducto(AgentexProducto agentexProducto) {
        this.agentexProducto.add(agentexProducto);
    }
    /**
     * Removes an instance of <code>AgentexProducto</code> related through the <code>AgentexProducto</code> role.
     * @param agentexProducto The instance to be removed
     */
    public void removeFromAgentexProducto(AgentexProducto agentexProducto) {
    	this.agentexProducto.remove(agentexProducto);
    }
    /**
     * Sets instances of <code>AgentexProducto</code> related through the <code>AgentexProducto</code> role.
     * @param agentexProducto The new value for the <code>AgentexProducto</code> role.
     */
    public void setAgentexProducto(Collection < AgentexProducto > agentexProducto) {
        this.agentexProducto = agentexProducto;
    }

   /**
    * This method gets the attribute value <code>modifiedAgentexProducto</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedAgentexProducto</code> has been modified.
    */
    public boolean isModifiedAgentexProducto(){
        return modifiedAgentexProducto;
    }

    /**
     * Returns the instance of <code>Prorrateo</code> related through the <code>Prorrateos</code> role.
     * Model Relationship:
     * <code>[Prorrateo] Prorrateos 0:M  ------ 1:1  Dominio [Dominio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Prorrateo</code> related through the <code>Prorrateos</code> role.
     */
    @JsonIgnore
    public Collection <Prorrateo> getProrrateos() {
        return prorrateos;
    }

    /**
     * Adds an instance of <code>Prorrateo</code> related through the <code>Prorrateos</code> role.
     * @param prorrateos The instance to add to the <code>Prorrateos</code> role.
     */
    public void add2Prorrateos(Prorrateo prorrateos) {
        this.prorrateos.add(prorrateos);
    }
    /**
     * Removes an instance of <code>Prorrateo</code> related through the <code>Prorrateos</code> role.
     * @param prorrateos The instance to be removed
     */
    public void removeFromProrrateos(Prorrateo prorrateos) {
    	this.prorrateos.remove(prorrateos);
    }
    /**
     * Sets instances of <code>Prorrateo</code> related through the <code>Prorrateos</code> role.
     * @param prorrateos The new value for the <code>Prorrateos</code> role.
     */
    public void setProrrateos(Collection < Prorrateo > prorrateos) {
        this.prorrateos = prorrateos;
    }

   /**
    * This method gets the attribute value <code>modifiedProrrateos</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedProrrateos</code> has been modified.
    */
    public boolean isModifiedProrrateos(){
        return modifiedProrrateos;
    }

    /**
     * Returns the instance of <code>LogGruposUsuarios</code> related through the <code>LogGruposUsuarios</code> role.
     * Model Relationship:
     * <code>[LogGruposUsuarios] LogGruposUsuarios 0:M  ------ 1:1  Dominio [Dominio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>LogGruposUsuarios</code> related through the <code>LogGruposUsuarios</code> role.
     */
    @JsonIgnore
    public Collection <LogGruposUsuarios> getLogGruposUsuarios() {
        return logGruposUsuarios;
    }

    /**
     * Adds an instance of <code>LogGruposUsuarios</code> related through the <code>LogGruposUsuarios</code> role.
     * @param logGruposUsuarios The instance to add to the <code>LogGruposUsuarios</code> role.
     */
    public void add2LogGruposUsuarios(LogGruposUsuarios logGruposUsuarios) {
        this.logGruposUsuarios.add(logGruposUsuarios);
    }
    /**
     * Removes an instance of <code>LogGruposUsuarios</code> related through the <code>LogGruposUsuarios</code> role.
     * @param logGruposUsuarios The instance to be removed
     */
    public void removeFromLogGruposUsuarios(LogGruposUsuarios logGruposUsuarios) {
    	this.logGruposUsuarios.remove(logGruposUsuarios);
    }
    /**
     * Sets instances of <code>LogGruposUsuarios</code> related through the <code>LogGruposUsuarios</code> role.
     * @param logGruposUsuarios The new value for the <code>LogGruposUsuarios</code> role.
     */
    public void setLogGruposUsuarios(Collection < LogGruposUsuarios > logGruposUsuarios) {
        this.logGruposUsuarios = logGruposUsuarios;
    }

   /**
    * This method gets the attribute value <code>modifiedLogGruposUsuarios</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedLogGruposUsuarios</code> has been modified.
    */
    public boolean isModifiedLogGruposUsuarios(){
        return modifiedLogGruposUsuarios;
    }

    /**
     * Returns the instance of <code>GrupoAsignacionNovedad</code> related through the <code>GrupoAsignacionNovedad</code> role.
     * Model Relationship:
     * <code>[GrupoAsignacionNovedad] GrupoAsignacionNovedad 0:M  ------ 1:1  Dominio [Dominio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>GrupoAsignacionNovedad</code> related through the <code>GrupoAsignacionNovedad</code> role.
     */
    @JsonIgnore
    public Collection <GrupoAsignacionNovedad> getGrupoAsignacionNovedad() {
        return grupoAsignacionNovedad;
    }

    /**
     * Adds an instance of <code>GrupoAsignacionNovedad</code> related through the <code>GrupoAsignacionNovedad</code> role.
     * @param grupoAsignacionNovedad The instance to add to the <code>GrupoAsignacionNovedad</code> role.
     */
    public void add2GrupoAsignacionNovedad(GrupoAsignacionNovedad grupoAsignacionNovedad) {
        this.grupoAsignacionNovedad.add(grupoAsignacionNovedad);
    }
    /**
     * Removes an instance of <code>GrupoAsignacionNovedad</code> related through the <code>GrupoAsignacionNovedad</code> role.
     * @param grupoAsignacionNovedad The instance to be removed
     */
    public void removeFromGrupoAsignacionNovedad(GrupoAsignacionNovedad grupoAsignacionNovedad) {
    	this.grupoAsignacionNovedad.remove(grupoAsignacionNovedad);
    }
    /**
     * Sets instances of <code>GrupoAsignacionNovedad</code> related through the <code>GrupoAsignacionNovedad</code> role.
     * @param grupoAsignacionNovedad The new value for the <code>GrupoAsignacionNovedad</code> role.
     */
    public void setGrupoAsignacionNovedad(Collection < GrupoAsignacionNovedad > grupoAsignacionNovedad) {
        this.grupoAsignacionNovedad = grupoAsignacionNovedad;
    }

   /**
    * This method gets the attribute value <code>modifiedGrupoAsignacionNovedad</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedGrupoAsignacionNovedad</code> has been modified.
    */
    public boolean isModifiedGrupoAsignacionNovedad(){
        return modifiedGrupoAsignacionNovedad;
    }

    /**
     * Returns the instance of <code>ConfiguracionANS</code> related through the <code>ConfiguracionesANS</code> role.
     * Model Relationship:
     * <code>[ConfiguracionANS] ConfiguracionesANS 0:M  ------ 1:1  Dominio [Dominio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>ConfiguracionANS</code> related through the <code>ConfiguracionesANS</code> role.
     */
    @JsonIgnore
    public Collection <ConfiguracionANS> getConfiguracionesANS() {
        return configuracionesANS;
    }

    /**
     * Adds an instance of <code>ConfiguracionANS</code> related through the <code>ConfiguracionesANS</code> role.
     * @param configuracionesANS The instance to add to the <code>ConfiguracionesANS</code> role.
     */
    public void add2ConfiguracionesANS(ConfiguracionANS configuracionesANS) {
        this.configuracionesANS.add(configuracionesANS);
    }
    /**
     * Removes an instance of <code>ConfiguracionANS</code> related through the <code>ConfiguracionesANS</code> role.
     * @param configuracionesANS The instance to be removed
     */
    public void removeFromConfiguracionesANS(ConfiguracionANS configuracionesANS) {
    	this.configuracionesANS.remove(configuracionesANS);
    }
    /**
     * Sets instances of <code>ConfiguracionANS</code> related through the <code>ConfiguracionesANS</code> role.
     * @param configuracionesANS The new value for the <code>ConfiguracionesANS</code> role.
     */
    public void setConfiguracionesANS(Collection < ConfiguracionANS > configuracionesANS) {
        this.configuracionesANS = configuracionesANS;
    }

   /**
    * This method gets the attribute value <code>modifiedConfiguracionesANS</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedConfiguracionesANS</code> has been modified.
    */
    public boolean isModifiedConfiguracionesANS(){
        return modifiedConfiguracionesANS;
    }

    /**
     * Returns the instance of <code>ReportesDominio</code> related through the <code>ReportesDominio</code> role.
     * Model Relationship:
     * <code>[ReportesDominio] ReportesDominio 0:M  ------ 1:1  Dominio [Dominio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>ReportesDominio</code> related through the <code>ReportesDominio</code> role.
     */
    @JsonIgnore
    public Collection <ReportesDominio> getReportesDominio() {
        return reportesDominio;
    }

    /**
     * Adds an instance of <code>ReportesDominio</code> related through the <code>ReportesDominio</code> role.
     * @param reportesDominio The instance to add to the <code>ReportesDominio</code> role.
     */
    public void add2ReportesDominio(ReportesDominio reportesDominio) {
        this.reportesDominio.add(reportesDominio);
    }
    /**
     * Removes an instance of <code>ReportesDominio</code> related through the <code>ReportesDominio</code> role.
     * @param reportesDominio The instance to be removed
     */
    public void removeFromReportesDominio(ReportesDominio reportesDominio) {
    	this.reportesDominio.remove(reportesDominio);
    }
    /**
     * Sets instances of <code>ReportesDominio</code> related through the <code>ReportesDominio</code> role.
     * @param reportesDominio The new value for the <code>ReportesDominio</code> role.
     */
    public void setReportesDominio(Collection < ReportesDominio > reportesDominio) {
        this.reportesDominio = reportesDominio;
    }

   /**
    * This method gets the attribute value <code>modifiedReportesDominio</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedReportesDominio</code> has been modified.
    */
    public boolean isModifiedReportesDominio(){
        return modifiedReportesDominio;
    }

    /**
     * Returns the instance of <code>LogIncompatibilidades</code> related through the <code>LogIncompatibilidades</code> role.
     * Model Relationship:
     * <code>[LogIncompatibilidades] LogIncompatibilidades 0:M  ------ 1:1  Dominio [Dominio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>LogIncompatibilidades</code> related through the <code>LogIncompatibilidades</code> role.
     */
    @JsonIgnore
    public Collection <LogIncompatibilidades> getLogIncompatibilidades() {
        return logIncompatibilidades;
    }

    /**
     * Adds an instance of <code>LogIncompatibilidades</code> related through the <code>LogIncompatibilidades</code> role.
     * @param logIncompatibilidades The instance to add to the <code>LogIncompatibilidades</code> role.
     */
    public void add2LogIncompatibilidades(LogIncompatibilidades logIncompatibilidades) {
        this.logIncompatibilidades.add(logIncompatibilidades);
    }
    /**
     * Removes an instance of <code>LogIncompatibilidades</code> related through the <code>LogIncompatibilidades</code> role.
     * @param logIncompatibilidades The instance to be removed
     */
    public void removeFromLogIncompatibilidades(LogIncompatibilidades logIncompatibilidades) {
    	this.logIncompatibilidades.remove(logIncompatibilidades);
    }
    /**
     * Sets instances of <code>LogIncompatibilidades</code> related through the <code>LogIncompatibilidades</code> role.
     * @param logIncompatibilidades The new value for the <code>LogIncompatibilidades</code> role.
     */
    public void setLogIncompatibilidades(Collection < LogIncompatibilidades > logIncompatibilidades) {
        this.logIncompatibilidades = logIncompatibilidades;
    }

   /**
    * This method gets the attribute value <code>modifiedLogIncompatibilidades</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedLogIncompatibilidades</code> has been modified.
    */
    public boolean isModifiedLogIncompatibilidades(){
        return modifiedLogIncompatibilidades;
    }

    /**
     * Returns the instance of <code>LogDatosDominio</code> related through the <code>LogDatosDominio</code> role.
     * Model Relationship:
     * <code>[LogDatosDominio] LogDatosDominio 0:M  ------ 1:1  Dominio [Dominio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>LogDatosDominio</code> related through the <code>LogDatosDominio</code> role.
     */
    @JsonIgnore
    public Collection <LogDatosDominio> getLogDatosDominio() {
        return logDatosDominio;
    }

    /**
     * Adds an instance of <code>LogDatosDominio</code> related through the <code>LogDatosDominio</code> role.
     * @param logDatosDominio The instance to add to the <code>LogDatosDominio</code> role.
     */
    public void add2LogDatosDominio(LogDatosDominio logDatosDominio) {
        this.logDatosDominio.add(logDatosDominio);
    }
    /**
     * Removes an instance of <code>LogDatosDominio</code> related through the <code>LogDatosDominio</code> role.
     * @param logDatosDominio The instance to be removed
     */
    public void removeFromLogDatosDominio(LogDatosDominio logDatosDominio) {
    	this.logDatosDominio.remove(logDatosDominio);
    }
    /**
     * Sets instances of <code>LogDatosDominio</code> related through the <code>LogDatosDominio</code> role.
     * @param logDatosDominio The new value for the <code>LogDatosDominio</code> role.
     */
    public void setLogDatosDominio(Collection < LogDatosDominio > logDatosDominio) {
        this.logDatosDominio = logDatosDominio;
    }

   /**
    * This method gets the attribute value <code>modifiedLogDatosDominio</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedLogDatosDominio</code> has been modified.
    */
    public boolean isModifiedLogDatosDominio(){
        return modifiedLogDatosDominio;
    }

    /**
     * Returns the instance of <code>Planes</code> related through the <code>PlanT</code> role.
     * Model Relationship:
     * <code>[Planes] PlanT 1:1  ------ 0:M  Dominios [Dominio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Planes</code> related through the <code>PlanT</code> role.
     */
    @JsonIgnore
    public Planes getPlanT() {
        return planT;
    }

    /**
     * Adds an instance of <code>Planes</code> related through the <code>PlanT</code> role.
     * @param planT The instance to add to the <code>PlanT</code> role.
     */
    public void add2PlanT(Planes planT) {
        if (planT == null || planT.isNull()) {
            this.modifiedPlanT = true;
            this.planesPlan = null;
        } else {
            this.planesPlan = planT.getPlanesPlan();
        }
        this.planT = (planT == null  || planT.isNull() ? null : planT);
    }

   /**
    * This method gets the attribute value <code>modifiedPlanT</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedPlanT</code> has been modified.
    */
    public boolean isModifiedPlanT(){
        return modifiedPlanT;
    }

    /**
     * Returns the instance of <code>Productos</code> related through the <code>ProductoT</code> role.
     * Model Relationship:
     * <code>[Productos] ProductoT 1:1  ------ 0:M  Dominios [Dominio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Productos</code> related through the <code>ProductoT</code> role.
     */
    @JsonIgnore
    public Productos getProductoT() {
        return productoT;
    }

    /**
     * Adds an instance of <code>Productos</code> related through the <code>ProductoT</code> role.
     * @param productoT The instance to add to the <code>ProductoT</code> role.
     */
    public void add2ProductoT(Productos productoT) {
        if (productoT == null || productoT.isNull()) {
            this.modifiedProductoT = true;
            this.productosProducto = null;
        } else {
            this.productosProducto = productoT.getProductosProducto();
        }
        this.productoT = (productoT == null  || productoT.isNull() ? null : productoT);
    }

   /**
    * This method gets the attribute value <code>modifiedProductoT</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedProductoT</code> has been modified.
    */
    public boolean isModifiedProductoT(){
        return modifiedProductoT;
    }

    /**
     * Returns the instance of <code>Periodicidad</code> related through the <code>Periodicidades</code> role.
     * Model Relationship:
     * <code>[Periodicidad] Periodicidades 0:M  ------ 0:M  Dominios [Dominio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Periodicidad</code> related through the <code>Periodicidades</code> role.
     */
    @JsonIgnore
    public Collection <Periodicidad> getPeriodicidades() {
        return periodicidades;
    }

    /**
     * Adds an instance of <code>Periodicidad</code> related through the <code>Periodicidades</code> role.
     * @param periodicidades The instance to add to the <code>Periodicidades</code> role.
     */
    public void add2Periodicidades(Periodicidad periodicidades) {
        this.periodicidades.add(periodicidades);
    }
    /**
     * Removes an instance of <code>Periodicidad</code> related through the <code>Periodicidades</code> role.
     * @param periodicidades The instance to be removed
     */
    public void removeFromPeriodicidades(Periodicidad periodicidades) {
    	this.periodicidades.remove(periodicidades);
    }
    /**
     * Sets instances of <code>Periodicidad</code> related through the <code>Periodicidades</code> role.
     * @param periodicidades The new value for the <code>Periodicidades</code> role.
     */
    public void setPeriodicidades(Collection < Periodicidad > periodicidades) {
        this.periodicidades = periodicidades;
    }

   /**
    * This method gets the attribute value <code>modifiedPeriodicidades</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedPeriodicidades</code> has been modified.
    */
    public boolean isModifiedPeriodicidades(){
        return modifiedPeriodicidades;
    }

    /**
     * Returns the instance of <code>Rol</code> related through the <code>Roles</code> role.
     * Model Relationship:
     * <code>[Rol] Roles 0:M  ------ 0:M  Dominios [Dominio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Rol</code> related through the <code>Roles</code> role.
     */
    @JsonIgnore
    public Collection <Rol> getRoles() {
        return roles;
    }

    /**
     * Adds an instance of <code>Rol</code> related through the <code>Roles</code> role.
     * @param roles The instance to add to the <code>Roles</code> role.
     */
    public void add2Roles(Rol roles) {
        this.roles.add(roles);
    }
    /**
     * Removes an instance of <code>Rol</code> related through the <code>Roles</code> role.
     * @param roles The instance to be removed
     */
    public void removeFromRoles(Rol roles) {
    	this.roles.remove(roles);
    }
    /**
     * Sets instances of <code>Rol</code> related through the <code>Roles</code> role.
     * @param roles The new value for the <code>Roles</code> role.
     */
    public void setRoles(Collection < Rol > roles) {
        this.roles = roles;
    }

   /**
    * This method gets the attribute value <code>modifiedRoles</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedRoles</code> has been modified.
    */
    public boolean isModifiedRoles(){
        return modifiedRoles;
    }

    /**
     * Returns the instance of <code>FormaPago</code> related through the <code>FormasPago</code> role.
     * Model Relationship:
     * <code>[FormaPago] FormasPago 0:M  ------ 0:M  Dominios [Dominio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>FormaPago</code> related through the <code>FormasPago</code> role.
     */
    @JsonIgnore
    public Collection <FormaPago> getFormasPago() {
        return formasPago;
    }

    /**
     * Adds an instance of <code>FormaPago</code> related through the <code>FormasPago</code> role.
     * @param formasPago The instance to add to the <code>FormasPago</code> role.
     */
    public void add2FormasPago(FormaPago formasPago) {
        this.formasPago.add(formasPago);
    }
    /**
     * Removes an instance of <code>FormaPago</code> related through the <code>FormasPago</code> role.
     * @param formasPago The instance to be removed
     */
    public void removeFromFormasPago(FormaPago formasPago) {
    	this.formasPago.remove(formasPago);
    }
    /**
     * Sets instances of <code>FormaPago</code> related through the <code>FormasPago</code> role.
     * @param formasPago The new value for the <code>FormasPago</code> role.
     */
    public void setFormasPago(Collection < FormaPago > formasPago) {
        this.formasPago = formasPago;
    }

   /**
    * This method gets the attribute value <code>modifiedFormasPago</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedFormasPago</code> has been modified.
    */
    public boolean isModifiedFormasPago(){
        return modifiedFormasPago;
    }

    /**
     * Returns the instance of <code>PlantillaEmail</code> related through the <code>Plantillas</code> role.
     * Model Relationship:
     * <code>[PlantillaEmail] Plantillas 0:M  ------ 0:M  Dominios [Dominio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>PlantillaEmail</code> related through the <code>Plantillas</code> role.
     */
    @JsonIgnore
    public Collection <PlantillaEmail> getPlantillas() {
        return plantillas;
    }

    /**
     * Adds an instance of <code>PlantillaEmail</code> related through the <code>Plantillas</code> role.
     * @param plantillas The instance to add to the <code>Plantillas</code> role.
     */
    public void add2Plantillas(PlantillaEmail plantillas) {
        this.plantillas.add(plantillas);
    }
    /**
     * Removes an instance of <code>PlantillaEmail</code> related through the <code>Plantillas</code> role.
     * @param plantillas The instance to be removed
     */
    public void removeFromPlantillas(PlantillaEmail plantillas) {
    	this.plantillas.remove(plantillas);
    }
    /**
     * Sets instances of <code>PlantillaEmail</code> related through the <code>Plantillas</code> role.
     * @param plantillas The new value for the <code>Plantillas</code> role.
     */
    public void setPlantillas(Collection < PlantillaEmail > plantillas) {
        this.plantillas = plantillas;
    }

   /**
    * This method gets the attribute value <code>modifiedPlantillas</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedPlantillas</code> has been modified.
    */
    public boolean isModifiedPlantillas(){
        return modifiedPlantillas;
    }

    /**
     * Returns the instance of <code>Novedad</code> related through the <code>Novedades</code> role.
     * Model Relationship:
     * <code>[Novedad] Novedades 0:M  ------ 0:M  Dominios [Dominio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Novedad</code> related through the <code>Novedades</code> role.
     */
    @JsonIgnore
    public Collection <Novedad> getNovedades() {
        return novedades;
    }

    /**
     * Adds an instance of <code>Novedad</code> related through the <code>Novedades</code> role.
     * @param novedades The instance to add to the <code>Novedades</code> role.
     */
    public void add2Novedades(Novedad novedades) {
        this.novedades.add(novedades);
    }
    /**
     * Removes an instance of <code>Novedad</code> related through the <code>Novedades</code> role.
     * @param novedades The instance to be removed
     */
    public void removeFromNovedades(Novedad novedades) {
    	this.novedades.remove(novedades);
    }
    /**
     * Sets instances of <code>Novedad</code> related through the <code>Novedades</code> role.
     * @param novedades The new value for the <code>Novedades</code> role.
     */
    public void setNovedades(Collection < Novedad > novedades) {
        this.novedades = novedades;
    }

   /**
    * This method gets the attribute value <code>modifiedNovedades</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedNovedades</code> has been modified.
    */
    public boolean isModifiedNovedades(){
        return modifiedNovedades;
    }

    /**
     * Returns the instance of <code>GrupoAsignacion</code> related through the <code>GrupoAsesores</code> role.
     * Model Relationship:
     * <code>[GrupoAsignacion] GrupoAsesores 0:1  ------ 0:M  DominioAsesores [Dominio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>GrupoAsignacion</code> related through the <code>GrupoAsesores</code> role.
     */
    @JsonIgnore
    public GrupoAsignacion getGrupoAsesores() {
        return grupoAsesores;
    }

    /**
     * Adds an instance of <code>GrupoAsignacion</code> related through the <code>GrupoAsesores</code> role.
     * @param grupoAsesores The instance to add to the <code>GrupoAsesores</code> role.
     */
    public void add2GrupoAsesores(GrupoAsignacion grupoAsesores) {
        if (grupoAsesores == null || grupoAsesores.isNull()) {
            this.modifiedGrupoAsesores = true;
            this.grupoAsignacionId = null;
        } else {
            this.grupoAsignacionId = grupoAsesores.getGrupoAsignacionId();
        }
        this.grupoAsesores = (grupoAsesores == null  || grupoAsesores.isNull() ? null : grupoAsesores);
    }

   /**
    * This method gets the attribute value <code>modifiedGrupoAsesores</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedGrupoAsesores</code> has been modified.
    */
    public boolean isModifiedGrupoAsesores(){
        return modifiedGrupoAsesores;
    }

    /**
     * Returns the instance of <code>GrupoAsignacion</code> related through the <code>GrupoAreaMedica</code> role.
     * Model Relationship:
     * <code>[GrupoAsignacion] GrupoAreaMedica 0:1  ------ 0:M  DominioAreaMedica [Dominio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>GrupoAsignacion</code> related through the <code>GrupoAreaMedica</code> role.
     */
    @JsonIgnore
    public GrupoAsignacion getGrupoAreaMedica() {
        return grupoAreaMedica;
    }

    /**
     * Adds an instance of <code>GrupoAsignacion</code> related through the <code>GrupoAreaMedica</code> role.
     * @param grupoAreaMedica The instance to add to the <code>GrupoAreaMedica</code> role.
     */
    public void add2GrupoAreaMedica(GrupoAsignacion grupoAreaMedica) {
        if (grupoAreaMedica == null || grupoAreaMedica.isNull()) {
            this.modifiedGrupoAreaMedica = true;
            this.grupoAsignacionGrupoAreaMedicaId = null;
        } else {
            this.grupoAsignacionGrupoAreaMedicaId = grupoAreaMedica.getGrupoAsignacionId();
        }
        this.grupoAreaMedica = (grupoAreaMedica == null  || grupoAreaMedica.isNull() ? null : grupoAreaMedica);
    }

   /**
    * This method gets the attribute value <code>modifiedGrupoAreaMedica</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedGrupoAreaMedica</code> has been modified.
    */
    public boolean isModifiedGrupoAreaMedica(){
        return modifiedGrupoAreaMedica;
    }

    /**
     * Returns the instance of <code>Dominio</code> related through the <code>DominiosIncompatibles</code> role.
     * Model Relationship:
     * <code>[Dominio] DominiosIncompatibles 0:M  ------ 0:M  DominiosConIncompatibilidad [Dominio]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Dominio</code> related through the <code>DominiosIncompatibles</code> role.
     */
    @JsonIgnore
    public Collection <Dominio> getDominiosIncompatibles() {
        return dominiosIncompatibles;
    }

    /**
     * Adds an instance of <code>Dominio</code> related through the <code>DominiosIncompatibles</code> role.
     * @param dominiosIncompatibles The instance to add to the <code>DominiosIncompatibles</code> role.
     */
    public void add2DominiosIncompatibles(Dominio dominiosIncompatibles) {
        this.dominiosIncompatibles.add(dominiosIncompatibles);
    }
    /**
     * Removes an instance of <code>Dominio</code> related through the <code>DominiosIncompatibles</code> role.
     * @param dominiosIncompatibles The instance to be removed
     */
    public void removeFromDominiosIncompatibles(Dominio dominiosIncompatibles) {
    	this.dominiosIncompatibles.remove(dominiosIncompatibles);
    }
    /**
     * Sets instances of <code>Dominio</code> related through the <code>DominiosIncompatibles</code> role.
     * @param dominiosIncompatibles The new value for the <code>DominiosIncompatibles</code> role.
     */
    public void setDominiosIncompatibles(Collection < Dominio > dominiosIncompatibles) {
        this.dominiosIncompatibles = dominiosIncompatibles;
    }

   /**
    * This method gets the attribute value <code>modifiedDominiosIncompatibles</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDominiosIncompatibles</code> has been modified.
    */
    public boolean isModifiedDominiosIncompatibles(){
        return modifiedDominiosIncompatibles;
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
        dominioReqCuesMed = false;
        dominioNoCuesMedTras = false;
        dominioNuevaAfiliacion = false;
        dominioInclusion = false;
        dominioAcepCuesMat = false;
        dominioAcepCuesNeo = false;
        dominioAcepBBGestante = false;
        dominioMostrarPreexAnexos = false;
        dominioMostrarPreexContrato = false;
        dominioIgnorarPreexistencias = false;
        dominioRespClauNombre = null;
        dominioRespClauCelula = null;
        dominioRespClauExpCelula = null;
        dominioRespClauCargo = null;
        dominioRespClauFirma = null;
        dominioDiaIniVigencia = null;
        dominioDiaFinVigencia = null;
        dominioDiasCaducidad = Long.valueOf(0);
        dominioProrrateoUsuExistente = false;
        dominioInclusionModGrupoAsoc = false;
        dominioPermiteRechazadosAfi = false;
        dominioAcepPolizaInter = false;
        dominioNovExcepcionReqDoc = false;
        dominioSolNovColorOscuro = null;
        dominioSolNovColorClaro = null;
        dominioSolNovLogo = null;
        dominioTramiteEnLinea = false;
        dominioVigenciaRadicacion = false;
        dominiosConIncompatibilidad = null;
        parentescosDom = null;
        agentexProducto = null;
        prorrateos = null;
        logGruposUsuarios = null;
        grupoAsignacionNovedad = null;
        configuracionesANS = null;
        reportesDominio = null;
        logIncompatibilidades = null;
        logDatosDominio = null;
        planT = null;
        productoT = null;
        periodicidades = null;
        roles = null;
        formasPago = null;
        plantillas = null;
        novedades = null;
        grupoAsesores = null;
        grupoAreaMedica = null;
        dominiosIncompatibles = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return Dominio.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return DominioConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedDominioReqCuesMed = false;
    	values.put("dominioReqCuesMed", getDominioReqCuesMed());
    	modifiedDominioNoCuesMedTras = false;
    	values.put("dominioNoCuesMedTras", getDominioNoCuesMedTras());
    	modifiedDominioNuevaAfiliacion = false;
    	values.put("dominioNuevaAfiliacion", getDominioNuevaAfiliacion());
    	modifiedDominioInclusion = false;
    	values.put("dominioInclusion", getDominioInclusion());
    	modifiedDominioAcepCuesMat = false;
    	values.put("dominioAcepCuesMat", getDominioAcepCuesMat());
    	modifiedDominioAcepCuesNeo = false;
    	values.put("dominioAcepCuesNeo", getDominioAcepCuesNeo());
    	modifiedDominioAcepBBGestante = false;
    	values.put("dominioAcepBBGestante", getDominioAcepBBGestante());
    	modifiedDominioMostrarPreexAnexos = false;
    	values.put("dominioMostrarPreexAnexos", getDominioMostrarPreexAnexos());
    	modifiedDominioMostrarPreexContrato = false;
    	values.put("dominioMostrarPreexContrato", getDominioMostrarPreexContrato());
    	modifiedDominioIgnorarPreexistencias = false;
    	values.put("dominioIgnorarPreexistencias", getDominioIgnorarPreexistencias());
    	modifiedDominioRespClauNombre = false;
    	values.put("dominioRespClauNombre", getDominioRespClauNombre());
    	modifiedDominioRespClauCelula = false;
    	values.put("dominioRespClauCelula", getDominioRespClauCelula());
    	modifiedDominioRespClauExpCelula = false;
    	values.put("dominioRespClauExpCelula", getDominioRespClauExpCelula());
    	modifiedDominioRespClauCargo = false;
    	values.put("dominioRespClauCargo", getDominioRespClauCargo());
    	if (modifiedDominioRespClauFirma) {
    		values.put("dominioRespClauFirma", dominioRespClauFirma);
    		modifiedDominioRespClauFirma = false;
    	}
    	modifiedDominioDiaIniVigencia = false;
    	values.put("dominioDiaIniVigencia", getDominioDiaIniVigencia());
    	modifiedDominioDiaFinVigencia = false;
    	values.put("dominioDiaFinVigencia", getDominioDiaFinVigencia());
    	modifiedDominioDiasCaducidad = false;
    	values.put("dominioDiasCaducidad", getDominioDiasCaducidad());
    	modifiedDominioProrrateoUsuExistente = false;
    	values.put("dominioProrrateoUsuExistente", getDominioProrrateoUsuExistente());
    	modifiedDominioInclusionModGrupoAsoc = false;
    	values.put("dominioInclusionModGrupoAsoc", getDominioInclusionModGrupoAsoc());
    	modifiedDominioPermiteRechazadosAfi = false;
    	values.put("dominioPermiteRechazadosAfi", getDominioPermiteRechazadosAfi());
    	modifiedDominioAcepPolizaInter = false;
    	values.put("dominioAcepPolizaInter", getDominioAcepPolizaInter());
    	modifiedDominioNovExcepcionReqDoc = false;
    	values.put("dominioNovExcepcionReqDoc", getDominioNovExcepcionReqDoc());
    	modifiedDominioSolNovColorOscuro = false;
    	values.put("dominioSolNovColorOscuro", getDominioSolNovColorOscuro());
    	modifiedDominioSolNovColorClaro = false;
    	values.put("dominioSolNovColorClaro", getDominioSolNovColorClaro());
    	modifiedDominioSolNovLogo = false;
    	values.put("dominioSolNovLogo", getDominioSolNovLogo());
    	modifiedDominioTramiteEnLinea = false;
    	values.put("dominioTramiteEnLinea", getDominioTramiteEnLinea());
    	modifiedDominioVigenciaRadicacion = false;
    	values.put("dominioVigenciaRadicacion", getDominioVigenciaRadicacion());
    	modifiedDominiosConIncompatibilidad = false;
    	modifiedParentescosDom = false;
    	modifiedAgentexProducto = false;
    	modifiedProrrateos = false;
    	modifiedLogGruposUsuarios = false;
    	modifiedGrupoAsignacionNovedad = false;
    	modifiedConfiguracionesANS = false;
    	modifiedReportesDominio = false;
    	modifiedLogIncompatibilidades = false;
    	modifiedLogDatosDominio = false;
    	modifiedPlanT = false;
    	modifiedProductoT = false;
    	modifiedPeriodicidades = false;
    	modifiedRoles = false;
    	modifiedFormasPago = false;
    	modifiedPlantillas = false;
    	modifiedNovedades = false;
    	modifiedGrupoAsesores = false;
    	modifiedGrupoAreaMedica = false;
    	modifiedDominiosIncompatibles = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>DominioOid</code> object that identifies this instance of <code>Dominio</code>.
     * @return <code>DominioOid </code> object that identifies this instance of <code>Dominio</code>
     */
	@Override
    public DominioOid getOid() {
        return new DominioOid(getDominioNumero());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(DominioConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(DominioConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.DOMINIO)) {
            // Add this class
            activeFacets.add(Constants.DOMINIO);
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
            relatedInstance = buildDominioRelatedInstance(relatedInstanceJsonOid);
        }
        if (DominioConstants.ROLE_NAME_DOMINIOSCONINCOMPATIBILIDAD.equalsIgnoreCase(relatedInstancePathFirstItem) || DominioConstants.ROLE_NAME_DOMINIOSINCOMPATIBLES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_PARENTESCOSDOM.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4ParentescoDom(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_AGENTEXPRODUCTO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4AgentexProducto(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_PRORRATEOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4Prorrateo(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_LOGGRUPOSUSUARIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4LogGruposUsuarios(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_GRUPOASIGNACIONNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4GrupoAsignacionNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_CONFIGURACIONESANS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4ConfiguracionANS(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_REPORTESDOMINIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4ReportesDominio(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_LOGINCOMPATIBILIDADES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4LogIncompatibilidades(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_LOGDATOSDOMINIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4LogDatosDominio(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_PLANT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4Planes(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_PRODUCTOT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4Productos(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_PERIODICIDADES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4Periodicidad(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_ROLES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4Rol(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_FORMASPAGO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4FormaPago(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_PLANTILLAS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4PlantillaEmail(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_NOVEDADES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4Novedad(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_GRUPOASESORES.equalsIgnoreCase(relatedInstancePathFirstItem) || DominioConstants.ROLE_NAME_GRUPOAREAMEDICA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4GrupoAsignacion(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildDominioRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4ParentescoDom(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ParentescoDom(mapper.readValue(relatedInstanceJsonOid, ParentescoDomOid.class)): ParentescoDom.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4AgentexProducto(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new AgentexProducto(mapper.readValue(relatedInstanceJsonOid, AgentexProductoOid.class)): AgentexProducto.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4Prorrateo(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Prorrateo(mapper.readValue(relatedInstanceJsonOid, ProrrateoOid.class)): Prorrateo.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4LogGruposUsuarios(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new LogGruposUsuarios(mapper.readValue(relatedInstanceJsonOid, LogGruposUsuariosOid.class)): LogGruposUsuarios.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4GrupoAsignacionNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new GrupoAsignacionNovedad(mapper.readValue(relatedInstanceJsonOid, GrupoAsignacionNovedadOid.class)): GrupoAsignacionNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4ConfiguracionANS(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ConfiguracionANS(mapper.readValue(relatedInstanceJsonOid, ConfiguracionANSOid.class)): ConfiguracionANS.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4ReportesDominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ReportesDominio(mapper.readValue(relatedInstanceJsonOid, ReportesDominioOid.class)): ReportesDominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4LogIncompatibilidades(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new LogIncompatibilidades(mapper.readValue(relatedInstanceJsonOid, LogIncompatibilidadesOid.class)): LogIncompatibilidades.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4LogDatosDominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new LogDatosDominio(mapper.readValue(relatedInstanceJsonOid, LogDatosDominioOid.class)): LogDatosDominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4Planes(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Planes(mapper.readValue(relatedInstanceJsonOid, PlanesOid.class)): Planes.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4Productos(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Productos(mapper.readValue(relatedInstanceJsonOid, ProductosOid.class)): Productos.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4Periodicidad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Periodicidad(mapper.readValue(relatedInstanceJsonOid, PeriodicidadOid.class)): Periodicidad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4Rol(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Rol(mapper.readValue(relatedInstanceJsonOid, RolOid.class)): Rol.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4FormaPago(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new FormaPago(mapper.readValue(relatedInstanceJsonOid, FormaPagoOid.class)): FormaPago.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4PlantillaEmail(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PlantillaEmail(mapper.readValue(relatedInstanceJsonOid, PlantillaEmailOid.class)): PlantillaEmail.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4Novedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Novedad(mapper.readValue(relatedInstanceJsonOid, NovedadOid.class)): Novedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4GrupoAsignacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new GrupoAsignacion(mapper.readValue(relatedInstanceJsonOid, GrupoAsignacionOid.class)): GrupoAsignacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
