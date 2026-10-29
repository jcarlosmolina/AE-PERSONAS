package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.CausalConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.EstadoContratoConstants;
import com.keralty.aepersonas.global.FirmaConstants;
import com.keralty.aepersonas.global.FuncionarioConstants;
import com.keralty.aepersonas.global.GrupoAsociadoConstants;
import com.keralty.aepersonas.global.MotivoExcepcionSolNovConstants;
import com.keralty.aepersonas.global.NovedadConstants;
import com.keralty.aepersonas.global.PeriodicidadConstants;
import com.keralty.aepersonas.global.PlanesConstants;
import com.keralty.aepersonas.global.ProteccionDatosConstants;
import com.keralty.aepersonas.global.SolicitudNovedadConstants;
import com.keralty.aepersonas.global.STDFunctions;
import com.keralty.aepersonas.global.TipoIdentificacionConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.persistence.oid.CausalOid;
import com.keralty.aepersonas.persistence.oid.DocumentoNovedadOid;
import com.keralty.aepersonas.persistence.oid.EstadoContratoOid;
import com.keralty.aepersonas.persistence.oid.FamiliaNovedadOid;
import com.keralty.aepersonas.persistence.oid.FirmaOid;
import com.keralty.aepersonas.persistence.oid.FuncionarioOid;
import com.keralty.aepersonas.persistence.oid.GrupoAsociadoOid;
import com.keralty.aepersonas.persistence.oid.LogEstadoSNOid;
import com.keralty.aepersonas.persistence.oid.LogUsrSolNovOid;
import com.keralty.aepersonas.persistence.oid.MotivoExcepcionSolNovOid;
import com.keralty.aepersonas.persistence.oid.NovedadOid;
import com.keralty.aepersonas.persistence.oid.PeriodicidadOid;
import com.keralty.aepersonas.persistence.oid.PlanesOid;
import com.keralty.aepersonas.persistence.oid.ProteccionDatosOid;
import com.keralty.aepersonas.persistence.oid.SolicitudNovedadOid;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.repository.SolicitudNovedadJpaRepository;
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
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Persistent representation of the <code>SolicitudNovedad</code> model class.
 * <p>
 * Model Class: <code>SolicitudNovedad</code><br>
 */
@Entity(name = SolicitudNovedadConstants.CLASS_NAME)
@Table(name = SolicitudNovedadConstants.TBL_NAME)
public class SolicitudNovedad extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient SolicitudNovedadJpaRepository solicitudNovedadRepository;

    private transient UserFunctions userFunctionsSrv;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SolicitudNovedad_Sequence")
    @SequenceGenerator(name="SolicitudNovedad_Sequence", sequenceName="SolicitudNovedad_Sequence", allocationSize=1)
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADID )
    @JsonProperty(value="id")
    private Long solicitudNovedadId;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADNUMRADICADO )
    @JsonProperty(value="numradicado")
    private Long solicitudNovedadNumRadicado;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadNumRadicado;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADFECHACREACION )
    @JsonProperty(value="fechacreacion")
    private Date solicitudNovedadFechaCreacion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadFechaCreacion;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADFECHAVIGENCIA )
    @JsonProperty(value="fechavigencia")
    private Date solicitudNovedadFechaVigencia;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadFechaVigencia;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADNUMCONTRATO )
    @JsonProperty(value="numcontrato")
    private String solicitudNovedadNumContrato;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadNumContrato;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADEXCEPCION )
    @JsonProperty(value="excepcion")
    private Boolean solicitudNovedadExcepcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadExcepcion;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADFECHAINIEXCEPCION )
    @JsonProperty(value="fechainiexcepcion")
    private Date solicitudNovedadFechaIniExcepcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadFechaIniExcepcion;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADFECHAFINEXCEPCION )
    @JsonProperty(value="fechafinexcepcion")
    private Date solicitudNovedadFechaFinExcepcion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadFechaFinExcepcion;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADCTRCODIGOTARIFA )
    @JsonProperty(value="ctrcodigotarifa")
    private String solicitudNovedadCtrCodigoTarifa;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadCtrCodigoTarifa;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADCTRDESCTARIFA )
    @JsonProperty(value="ctrdesctarifa")
    private String solicitudNovedadCtrDescTarifa;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadCtrDescTarifa;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADCTRCODIGOCONVENIO )
    @JsonProperty(value="ctrcodigoconvenio")
    private String solicitudNovedadCtrCodigoConvenio;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadCtrCodigoConvenio;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADCTRDESCCONVENIO )
    @JsonProperty(value="ctrdescconvenio")
    private String solicitudNovedadCtrDescConvenio;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadCtrDescConvenio;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADCTRESCOLECTIVO )
    @JsonProperty(value="ctrescolectivo")
    private Boolean solicitudNovedadCtrEsColectivo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadCtrEsColectivo;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADCTRTAGCAUSAEXCLUSION )
    @JsonProperty(value="ctrtagcausaexclusion")
    private String solicitudNovedadCtrTagCausaExclusion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadCtrTagCausaExclusion;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADCONTRANUMIDEN )
    @JsonProperty(value="contranumiden")
    private String solicitudNovedadContraNumIden;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadContraNumIden;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADCONTRAPRIMERNOMBRE )
    @JsonProperty(value="contraprimernombre")
    private String solicitudNovedadContraPrimerNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadContraPrimerNombre;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADCONTRASEGUNDONOMBRE )
    @JsonProperty(value="contrasegundonombre")
    private String solicitudNovedadContraSegundoNombre;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadContraSegundoNombre;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADCONTRAPRIMERAPELLIDO )
    @JsonProperty(value="contraprimerapellido")
    private String solicitudNovedadContraPrimerApellido;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadContraPrimerApellido;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADCONTRASEGUNDOAPELLIDO )
    @JsonProperty(value="contrasegundoapellido")
    private String solicitudNovedadContraSegundoApellido;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadContraSegundoApellido;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADCONTRARAZONSOCIAL )
    @JsonProperty(value="contrarazonsocial")
    private String solicitudNovedadContraRazonSocial;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadContraRazonSocial;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADFECHAULTIMODOC )
    @JsonProperty(value="fechaultimodoc")
    private Timestamp solicitudNovedadFechaUltimoDoc;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadFechaUltimoDoc;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADOBSERVACIONS )
    @JsonProperty(value="observacions")
    private String solicitudNovedadObservacions;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadObservacions;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADESTADO )
    @JsonProperty(value="estado")
    private Long solicitudNovedadEstado;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadEstado;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADESTADODOCUMENTACION )
    @JsonProperty(value="estadodocumentacion")
    private Long solicitudNovedadEstadoDocumentacion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadEstadoDocumentacion;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADCOMPLETADA )
    @JsonProperty(value="completada")
    private Boolean solicitudNovedadCompletada;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadCompletada;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADFECHACOMPLETADA )
    @JsonProperty(value="fechacompletada")
    private Timestamp solicitudNovedadFechaCompletada;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadFechaCompletada;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADCTRACTIVO )
    @JsonProperty(value="ctractivo")
    private Boolean solicitudNovedadCtrActivo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadCtrActivo;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADCTRTIPOCONTRATO )
    @JsonProperty(value="ctrtipocontrato")
    private Long solicitudNovedadCtrTipoContrato;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadCtrTipoContrato;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADSCNUMMESES )
    @JsonProperty(value="scnummeses")
    private Long solicitudNovedadSCNumMeses;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadSCNumMeses;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADCONTRANUEVARAZONSOCIAL )
    @JsonProperty(value="contranuevarazonsocial")
    private String solicitudNovedadContraNuevaRazonSocial;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadContraNuevaRazonSocial;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADCONTRATIPOPERSONA )
    @JsonProperty(value="contratipopersona")
    private String solicitudNovedadContraTipoPersona;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadContraTipoPersona;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADCTRFINICIOCONTRATO )
    @JsonProperty(value="ctrfiniciocontrato")
    private Date solicitudNovedadCtrFInicioContrato;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadCtrFInicioContrato;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvexigecontratoactivo")
    protected Boolean solicitudNovedadDrvExigeContratoActivo;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvexigefamiliaactiva")
    protected Boolean solicitudNovedadDrvExigeFamiliaActiva;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="contradrvnombrecompleto")
    protected String solicitudNovedadContraDrvNombreCompleto;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvtarifa")
    protected String solicitudNovedadDrvTarifa;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvconvenio")
    protected String solicitudNovedadDrvConvenio;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="contradrvidentificacion")
    protected String solicitudNovedadContraDrvIdentificacion;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvgrupoasociado")
    protected String solicitudNovedadDrvGrupoAsociado;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvperiodicidad")
    protected String solicitudNovedadDrvPeriodicidad;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvpermiteaddfam")
    protected Boolean solicitudNovedadDrvPermiteAddFam;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvpermitedelfam")
    protected Boolean solicitudNovedadDrvPermiteDelFam;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvexigedocsolicitud")
    protected Boolean solicitudNovedadDrvExigeDocSolicitud;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvexigedocpersona")
    protected Boolean solicitudNovedadDrvExigeDocPersona;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvreportcoloscuro")
    protected String solicitudNovedadDrvReportColOscuro;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvreportcolclaro")
    protected String solicitudNovedadDrvReportColClaro;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvreportlogo")
    protected String solicitudNovedadDrvReportLogo;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvnuevaperiodicidad")
    protected String solicitudNovedadDrvNuevaPeriodicidad;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADPRIORIDAD )
    @JsonProperty(value="prioridad")
    private Long solicitudNovedadPrioridad;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadPrioridad;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADFECHATERMINADA )
    @JsonProperty(value="fechaterminada")
    private Date solicitudNovedadFechaTerminada;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadFechaTerminada;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADFECHAFUG )
    @JsonProperty(value="fechafug")
    private Timestamp solicitudNovedadFechaFUG;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadFechaFUG;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADFECHAFA )
    @JsonProperty(value="fechafa")
    private Timestamp solicitudNovedadFechaFA;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadFechaFA;

    /** Class member attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_SOLICITUDNOVEDADSEMAFOROGRABASE )
    @JsonProperty(value="semaforograbase")
    private Double solicitudNovedadSemaforoGrabAse;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNovedadSemaforoGrabAse;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvsemaforograbase")
    protected Double solicitudNovedaddrvSemaforoGrabAse;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvnumradicadostr")
    protected String solicitudNovedadDrvNumRadicadoStr;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvvalidarps1")
    protected Boolean solicitudNovedadDrvValidarPS1;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvvalidarps2")
    protected Boolean solicitudNovedadDrvValidarPS2;

    /** Related Class. */
    @OneToMany(mappedBy = SolicitudNovedadConstants.ROLE_INVNAME_FAMILIAS)
    @JsonIgnore
    private Collection <FamiliaNovedad> familias;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFamilias;

    /** Related Class. */
    @OneToMany(mappedBy = SolicitudNovedadConstants.ROLE_INVNAME_DOCUMENTOS)
    @JsonIgnore
    private Collection <DocumentoNovedad> documentos;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDocumentos;

    /** Related Class. */
    @OneToMany(mappedBy = SolicitudNovedadConstants.ROLE_INVNAME_LOGESTADOS)
    @JsonIgnore
    private Collection <LogEstadoSN> logEstados;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogEstados;

    /** Related Class. */
    @OneToMany(mappedBy = SolicitudNovedadConstants.ROLE_INVNAME_LOGUSRSOLNOV)
    @JsonIgnore
    private Collection <LogUsrSolNov> logUsrSolNov;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogUsrSolNov;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=SolicitudNovedadConstants.FLD_PLANESPLAN, referencedColumnName=PlanesConstants.FLD_PLANESPLAN)
    })
    @JsonIgnore
    private Planes planT;
    /** Related attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_PLANESPLAN, insertable = false, updatable = false)
    private Long planesPlan;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPlanT;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=SolicitudNovedadConstants.FLD_NOVEDADIDNOVEDAD, referencedColumnName=NovedadConstants.FLD_NOVEDADIDNOVEDAD)
    })
    @JsonIgnore
    private Novedad novedad;
    /** Related attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_NOVEDADIDNOVEDAD, insertable = false, updatable = false)
    private Long novedadidNovedad;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedNovedad;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=SolicitudNovedadConstants.FLD_CAUSALIDCAUSAL, referencedColumnName=CausalConstants.FLD_CAUSALIDCAUSAL)
    })
    @JsonIgnore
    private Causal causal;
    /** Related attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_CAUSALIDCAUSAL, insertable = false, updatable = false)
    private Long causalidCausal;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedCausal;

    /** Related Class. */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=SolicitudNovedadConstants.FLD_PROTECCIONDATOSIDENTIFICADOR, referencedColumnName=ProteccionDatosConstants.FLD_PROTECCIONDATOSIDENTIFICADOR)
    })
    @JsonIgnore
    private ProteccionDatos proteccionDatos;
    /** Related attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_PROTECCIONDATOSIDENTIFICADOR, insertable = false, updatable = false)
    private Long proteccionDatosIdentificador;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProteccionDatos;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=SolicitudNovedadConstants.FLD_TIPOIDENTIFICACIONCODIGO, referencedColumnName=TipoIdentificacionConstants.FLD_TIPOIDENTIFICACIONCODIGO)
    })
    @JsonIgnore
    private TipoIdentificacion tipoIdentContratante;
    /** Related attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_TIPOIDENTIFICACIONCODIGO, insertable = false, updatable = false)
    private Long tipoIdentificacionCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoIdentContratante;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=SolicitudNovedadConstants.FLD_ESTADOCONTRATOESTADOCONTRATOCODIGO, referencedColumnName=EstadoContratoConstants.FLD_ESTADOCONTRATOCODIGO)
    })
    @JsonIgnore
    private EstadoContrato estadoContrato;
    /** Related attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_ESTADOCONTRATOESTADOCONTRATOCODIGO, insertable = false, updatable = false)
    private Long estadoContratoEstadoContratoCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedEstadoContrato;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=SolicitudNovedadConstants.FLD_GRUPOASOCIADOGRUPOASOCIADOCODIGO, referencedColumnName=GrupoAsociadoConstants.FLD_GRUPOASOCIADOCODIGO)
    })
    @JsonIgnore
    private GrupoAsociado grupoAsociado;
    /** Related attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_GRUPOASOCIADOGRUPOASOCIADOCODIGO, insertable = false, updatable = false)
    private Long grupoAsociadoGrupoAsociadoCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedGrupoAsociado;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=SolicitudNovedadConstants.FLD_PERIODICIDADPERIODICIDADCODIGO, referencedColumnName=PeriodicidadConstants.FLD_PERIODICIDADCODIGO)
    })
    @JsonIgnore
    private Periodicidad periodicidad;
    /** Related attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_PERIODICIDADPERIODICIDADCODIGO, insertable = false, updatable = false)
    private Long periodicidadPeriodicidadCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPeriodicidad;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=SolicitudNovedadConstants.FLD_FUNCIONARIOAGENTEID, referencedColumnName=FuncionarioConstants.FLD_FUNCIONARIOID)
    })
    @JsonIgnore
    private Funcionario agente;
    /** Related attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_FUNCIONARIOAGENTEID, insertable = false, updatable = false)
    private Long funcionarioAgenteId;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAgente;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=SolicitudNovedadConstants.FLD_PERIODICIDADPERIODICIDADNUEVACODIGO, referencedColumnName=PeriodicidadConstants.FLD_PERIODICIDADCODIGO)
    })
    @JsonIgnore
    private Periodicidad periodicidadNueva;
    /** Related attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_PERIODICIDADPERIODICIDADNUEVACODIGO, insertable = false, updatable = false)
    private Long periodicidadPeriodicidadNuevaCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPeriodicidadNueva;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=SolicitudNovedadConstants.FLD_MOTIVOEXCEPCIONSOLNOVMOTIVOEXCEPCIONID, referencedColumnName=MotivoExcepcionSolNovConstants.FLD_MOTIVOEXCEPCIONSOLNOVID)
    })
    @JsonIgnore
    private MotivoExcepcionSolNov motivoExcepcion;
    /** Related attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_MOTIVOEXCEPCIONSOLNOVMOTIVOEXCEPCIONID, insertable = false, updatable = false)
    private Long motivoExcepcionSolNovMotivoExcepcionId;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedMotivoExcepcion;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=SolicitudNovedadConstants.FLD_FUNCIONARIOUSRAFILIACIONID, referencedColumnName=FuncionarioConstants.FLD_FUNCIONARIOID)
    })
    @JsonIgnore
    private Funcionario usrAfiliacion;
    /** Related attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_FUNCIONARIOUSRAFILIACIONID, insertable = false, updatable = false)
    private Long funcionarioUsrAfiliacionId;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsrAfiliacion;

    /** Related Class. */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=SolicitudNovedadConstants.FLD_FIRMAFIRMAIDENTIFICADOR, referencedColumnName=FirmaConstants.FLD_FIRMAIDENTIFICADOR)
    })
    @JsonIgnore
    private Firma firma;
    /** Related attribute. */
    @Column(name = SolicitudNovedadConstants.FLD_FIRMAFIRMAIDENTIFICADOR, insertable = false, updatable = false)
    private Long firmaFirmaIdentificador;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFirma;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public SolicitudNovedad() {
        solicitudNovedadId = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>SolicitudNovedad</code>.
     * @param oid Object Identifier of the instance of <code>SolicitudNovedad</code> to be created.
     * @throws SystemException
     */
    public SolicitudNovedad(SolicitudNovedadOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            solicitudNovedadId = oid.getSolicitudNovedadId();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>solicitudNovedadId</code> attribute<br>in class <code>SolicitudNovedad</code>.
     * This is part of the identification for this class, which depends on the identification of <code>SolicitudNovedad</code>
     * @return The value of the <code>solicitudNovedadId</code> attribute<br>in class <code>SolicitudNovedad</code>.
     */
    public Long getSolicitudNovedadId() {
        return solicitudNovedadId;
    }

    /**
     * Sets the value of the <code>solicitudNovedadId</code> attribute<br>in class <code>SolicitudNovedad</code>.
     * This is part of the identification for this class, which depends on the identification of <code>SolicitudNovedad</code>
     * @param solicitudNovedadId The new value of the <code>solicitudNovedadId</code> attribute<br>in class <code>SolicitudNovedad</code>.
     */
    public void setSolicitudNovedadId(Long solicitudNovedadId) {
        this.solicitudNovedadId = solicitudNovedadId;
    }

   /**
    * Returns the value of the <code>solicitudNovedadNumRadicado</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadNumRadicado</code>. Constant Autonumerico<br>
    * Comments: Al grabar la solicitud de novedad se generará un número para la misma. El número de solicitud de novedades debe ser diferente para EPS y para medicina prepagada. El valor inicial de este numérico consecutivo se debe definir en el momento en que se implemente la funcionalidad<br>
    * @return The value of the <code>solicitudNovedadNumRadicado</code> attribute.
    */

    public Long getSolicitudNovedadNumRadicado()  {
    	Long value;
        value =  solicitudNovedadNumRadicado;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudNovedadNumRadicado</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadNumRadicado</code>. Constant Autonumerico<br>
    * Comments: Al grabar la solicitud de novedad se generará un número para la misma. El número de solicitud de novedades debe ser diferente para EPS y para medicina prepagada. El valor inicial de este numérico consecutivo se debe definir en el momento en que se implemente la funcionalidad<br>
    * @param solicitudNovedadNumRadicado The new value of the <code>solicitudNovedadNumRadicado</code> attribute.
    */
    public void setSolicitudNovedadNumRadicado (Long solicitudNovedadNumRadicado) {
        modifiedSolicitudNovedadNumRadicado = true;
        this.solicitudNovedadNumRadicado = solicitudNovedadNumRadicado;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadNumRadicado</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadNumRadicado</code>.
    */
    public void setModifiedSolicitudNovedadNumRadicado(boolean modified) {
        this.modifiedSolicitudNovedadNumRadicado = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadFechaCreacion</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadFechaCreacion</code>. Constant Date<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadFechaCreacion</code> attribute.
    */

    public Date getSolicitudNovedadFechaCreacion()  {
    	Date value;
        value =  solicitudNovedadFechaCreacion;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudNovedadFechaCreacion</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadFechaCreacion</code>. Constant Date<br>
    * Comments: <br>
    * @param solicitudNovedadFechaCreacion The new value of the <code>solicitudNovedadFechaCreacion</code> attribute.
    */
    public void setSolicitudNovedadFechaCreacion (Date solicitudNovedadFechaCreacion) {
        modifiedSolicitudNovedadFechaCreacion = true;
        this.solicitudNovedadFechaCreacion = solicitudNovedadFechaCreacion;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadFechaCreacion</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadFechaCreacion</code>.
    */
    public void setModifiedSolicitudNovedadFechaCreacion(boolean modified) {
        this.modifiedSolicitudNovedadFechaCreacion = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadFechaVigencia</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadFechaVigencia</code>. Constant Date<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadFechaVigencia</code> attribute.
    */

    public Date getSolicitudNovedadFechaVigencia()  {
    	Date value;
        value =  solicitudNovedadFechaVigencia;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudNovedadFechaVigencia</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadFechaVigencia</code>. Constant Date<br>
    * Comments: <br>
    * @param solicitudNovedadFechaVigencia The new value of the <code>solicitudNovedadFechaVigencia</code> attribute.
    */
    public void setSolicitudNovedadFechaVigencia (Date solicitudNovedadFechaVigencia) {
        modifiedSolicitudNovedadFechaVigencia = true;
        this.solicitudNovedadFechaVigencia = solicitudNovedadFechaVigencia;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadFechaVigencia</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadFechaVigencia</code>.
    */
    public void setModifiedSolicitudNovedadFechaVigencia(boolean modified) {
        this.modifiedSolicitudNovedadFechaVigencia = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadNumContrato</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadNumContrato</code>. Constant String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadNumContrato</code> attribute.
    */

    public String getSolicitudNovedadNumContrato()  {
    	String value;
        value =  solicitudNovedadNumContrato;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>solicitudNovedadNumContrato</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadNumContrato</code>. Constant String Size=50<br>
    * Comments: <br>
    * @param solicitudNovedadNumContrato The new value of the <code>solicitudNovedadNumContrato</code> attribute.
    */
    public void setSolicitudNovedadNumContrato (String solicitudNovedadNumContrato) {
        modifiedSolicitudNovedadNumContrato = true;
        this.solicitudNovedadNumContrato = solicitudNovedadNumContrato;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadNumContrato</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadNumContrato</code>.
    */
    public void setModifiedSolicitudNovedadNumContrato(boolean modified) {
        this.modifiedSolicitudNovedadNumContrato = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadExcepcion</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadExcepcion</code>. Constant Bool<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadExcepcion</code> attribute.
    */

    public Boolean getSolicitudNovedadExcepcion()  {
    	Boolean value;
        value =  solicitudNovedadExcepcion;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudNovedadExcepcion</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadExcepcion</code>. Constant Bool<br>
    * Comments: <br>
    * @param solicitudNovedadExcepcion The new value of the <code>solicitudNovedadExcepcion</code> attribute.
    */
    public void setSolicitudNovedadExcepcion (Boolean solicitudNovedadExcepcion) {
        modifiedSolicitudNovedadExcepcion = true;
        this.solicitudNovedadExcepcion = solicitudNovedadExcepcion;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadExcepcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadExcepcion</code>.
    */
    public void setModifiedSolicitudNovedadExcepcion(boolean modified) {
        this.modifiedSolicitudNovedadExcepcion = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadFechaIniExcepcion</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadFechaIniExcepcion</code>. Constant Date<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadFechaIniExcepcion</code> attribute.
    */

    public Date getSolicitudNovedadFechaIniExcepcion()  {
    	Date value;
        value =  solicitudNovedadFechaIniExcepcion;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudNovedadFechaIniExcepcion</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadFechaIniExcepcion</code>. Constant Date<br>
    * Comments: <br>
    * @param solicitudNovedadFechaIniExcepcion The new value of the <code>solicitudNovedadFechaIniExcepcion</code> attribute.
    */
    public void setSolicitudNovedadFechaIniExcepcion (Date solicitudNovedadFechaIniExcepcion) {
        modifiedSolicitudNovedadFechaIniExcepcion = true;
        this.solicitudNovedadFechaIniExcepcion = solicitudNovedadFechaIniExcepcion;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadFechaIniExcepcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadFechaIniExcepcion</code>.
    */
    public void setModifiedSolicitudNovedadFechaIniExcepcion(boolean modified) {
        this.modifiedSolicitudNovedadFechaIniExcepcion = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadFechaFinExcepcion</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadFechaFinExcepcion</code>. Constant Date<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadFechaFinExcepcion</code> attribute.
    */

    public Date getSolicitudNovedadFechaFinExcepcion()  {
    	Date value;
        value =  solicitudNovedadFechaFinExcepcion;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudNovedadFechaFinExcepcion</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadFechaFinExcepcion</code>. Constant Date<br>
    * Comments: <br>
    * @param solicitudNovedadFechaFinExcepcion The new value of the <code>solicitudNovedadFechaFinExcepcion</code> attribute.
    */
    public void setSolicitudNovedadFechaFinExcepcion (Date solicitudNovedadFechaFinExcepcion) {
        modifiedSolicitudNovedadFechaFinExcepcion = true;
        this.solicitudNovedadFechaFinExcepcion = solicitudNovedadFechaFinExcepcion;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadFechaFinExcepcion</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadFechaFinExcepcion</code>.
    */
    public void setModifiedSolicitudNovedadFechaFinExcepcion(boolean modified) {
        this.modifiedSolicitudNovedadFechaFinExcepcion = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadCtrCodigoTarifa</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadCtrCodigoTarifa</code>. Variable String Size=12<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadCtrCodigoTarifa</code> attribute.
    */

    public String getSolicitudNovedadCtrCodigoTarifa()  {
    	String value;
        value =  solicitudNovedadCtrCodigoTarifa;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>solicitudNovedadCtrCodigoTarifa</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadCtrCodigoTarifa</code>. Variable String Size=12<br>
    * Comments: <br>
    * @param solicitudNovedadCtrCodigoTarifa The new value of the <code>solicitudNovedadCtrCodigoTarifa</code> attribute.
    */
    public void setSolicitudNovedadCtrCodigoTarifa (String solicitudNovedadCtrCodigoTarifa) {
        modifiedSolicitudNovedadCtrCodigoTarifa = true;
        this.solicitudNovedadCtrCodigoTarifa = solicitudNovedadCtrCodigoTarifa;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadCtrCodigoTarifa</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadCtrCodigoTarifa</code>.
    */
    public void setModifiedSolicitudNovedadCtrCodigoTarifa(boolean modified) {
        this.modifiedSolicitudNovedadCtrCodigoTarifa = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadCtrDescTarifa</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadCtrDescTarifa</code>. Variable String Size=100<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadCtrDescTarifa</code> attribute.
    */

    public String getSolicitudNovedadCtrDescTarifa()  {
    	String value;
        value =  solicitudNovedadCtrDescTarifa;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>solicitudNovedadCtrDescTarifa</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadCtrDescTarifa</code>. Variable String Size=100<br>
    * Comments: <br>
    * @param solicitudNovedadCtrDescTarifa The new value of the <code>solicitudNovedadCtrDescTarifa</code> attribute.
    */
    public void setSolicitudNovedadCtrDescTarifa (String solicitudNovedadCtrDescTarifa) {
        modifiedSolicitudNovedadCtrDescTarifa = true;
        this.solicitudNovedadCtrDescTarifa = solicitudNovedadCtrDescTarifa;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadCtrDescTarifa</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadCtrDescTarifa</code>.
    */
    public void setModifiedSolicitudNovedadCtrDescTarifa(boolean modified) {
        this.modifiedSolicitudNovedadCtrDescTarifa = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadCtrCodigoConvenio</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadCtrCodigoConvenio</code>. Variable String Size=12<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadCtrCodigoConvenio</code> attribute.
    */

    public String getSolicitudNovedadCtrCodigoConvenio()  {
    	String value;
        value =  solicitudNovedadCtrCodigoConvenio;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>solicitudNovedadCtrCodigoConvenio</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadCtrCodigoConvenio</code>. Variable String Size=12<br>
    * Comments: <br>
    * @param solicitudNovedadCtrCodigoConvenio The new value of the <code>solicitudNovedadCtrCodigoConvenio</code> attribute.
    */
    public void setSolicitudNovedadCtrCodigoConvenio (String solicitudNovedadCtrCodigoConvenio) {
        modifiedSolicitudNovedadCtrCodigoConvenio = true;
        this.solicitudNovedadCtrCodigoConvenio = solicitudNovedadCtrCodigoConvenio;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadCtrCodigoConvenio</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadCtrCodigoConvenio</code>.
    */
    public void setModifiedSolicitudNovedadCtrCodigoConvenio(boolean modified) {
        this.modifiedSolicitudNovedadCtrCodigoConvenio = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadCtrDescConvenio</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadCtrDescConvenio</code>. Variable String Size=100<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadCtrDescConvenio</code> attribute.
    */

    public String getSolicitudNovedadCtrDescConvenio()  {
    	String value;
        value =  solicitudNovedadCtrDescConvenio;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>solicitudNovedadCtrDescConvenio</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadCtrDescConvenio</code>. Variable String Size=100<br>
    * Comments: <br>
    * @param solicitudNovedadCtrDescConvenio The new value of the <code>solicitudNovedadCtrDescConvenio</code> attribute.
    */
    public void setSolicitudNovedadCtrDescConvenio (String solicitudNovedadCtrDescConvenio) {
        modifiedSolicitudNovedadCtrDescConvenio = true;
        this.solicitudNovedadCtrDescConvenio = solicitudNovedadCtrDescConvenio;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadCtrDescConvenio</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadCtrDescConvenio</code>.
    */
    public void setModifiedSolicitudNovedadCtrDescConvenio(boolean modified) {
        this.modifiedSolicitudNovedadCtrDescConvenio = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadCtrEsColectivo</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadCtrEsColectivo</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadCtrEsColectivo</code> attribute.
    */

    public Boolean getSolicitudNovedadCtrEsColectivo()  {
    	Boolean value;
        value =  solicitudNovedadCtrEsColectivo;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudNovedadCtrEsColectivo</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadCtrEsColectivo</code>. Variable Bool<br>
    * Comments: <br>
    * @param solicitudNovedadCtrEsColectivo The new value of the <code>solicitudNovedadCtrEsColectivo</code> attribute.
    */
    public void setSolicitudNovedadCtrEsColectivo (Boolean solicitudNovedadCtrEsColectivo) {
        modifiedSolicitudNovedadCtrEsColectivo = true;
        this.solicitudNovedadCtrEsColectivo = solicitudNovedadCtrEsColectivo;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadCtrEsColectivo</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadCtrEsColectivo</code>.
    */
    public void setModifiedSolicitudNovedadCtrEsColectivo(boolean modified) {
        this.modifiedSolicitudNovedadCtrEsColectivo = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadCtrTagCausaExclusion</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadCtrTagCausaExclusion</code>. Variable String Size=100<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadCtrTagCausaExclusion</code> attribute.
    */

    public String getSolicitudNovedadCtrTagCausaExclusion()  {
    	String value;
        value =  solicitudNovedadCtrTagCausaExclusion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>solicitudNovedadCtrTagCausaExclusion</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadCtrTagCausaExclusion</code>. Variable String Size=100<br>
    * Comments: <br>
    * @param solicitudNovedadCtrTagCausaExclusion The new value of the <code>solicitudNovedadCtrTagCausaExclusion</code> attribute.
    */
    public void setSolicitudNovedadCtrTagCausaExclusion (String solicitudNovedadCtrTagCausaExclusion) {
        modifiedSolicitudNovedadCtrTagCausaExclusion = true;
        this.solicitudNovedadCtrTagCausaExclusion = solicitudNovedadCtrTagCausaExclusion;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadCtrTagCausaExclusion</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadCtrTagCausaExclusion</code>.
    */
    public void setModifiedSolicitudNovedadCtrTagCausaExclusion(boolean modified) {
        this.modifiedSolicitudNovedadCtrTagCausaExclusion = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadContraNumIden</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadContraNumIden</code>. Variable String Size=60<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadContraNumIden</code> attribute.
    */

    public String getSolicitudNovedadContraNumIden()  {
    	String value;
        value =  solicitudNovedadContraNumIden;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>solicitudNovedadContraNumIden</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadContraNumIden</code>. Variable String Size=60<br>
    * Comments: <br>
    * @param solicitudNovedadContraNumIden The new value of the <code>solicitudNovedadContraNumIden</code> attribute.
    */
    public void setSolicitudNovedadContraNumIden (String solicitudNovedadContraNumIden) {
        modifiedSolicitudNovedadContraNumIden = true;
        this.solicitudNovedadContraNumIden = solicitudNovedadContraNumIden;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadContraNumIden</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadContraNumIden</code>.
    */
    public void setModifiedSolicitudNovedadContraNumIden(boolean modified) {
        this.modifiedSolicitudNovedadContraNumIden = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadContraPrimerNombre</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadContraPrimerNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadContraPrimerNombre</code> attribute.
    */

    public String getSolicitudNovedadContraPrimerNombre()  {
    	String value;
        value =  solicitudNovedadContraPrimerNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>solicitudNovedadContraPrimerNombre</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadContraPrimerNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param solicitudNovedadContraPrimerNombre The new value of the <code>solicitudNovedadContraPrimerNombre</code> attribute.
    */
    public void setSolicitudNovedadContraPrimerNombre (String solicitudNovedadContraPrimerNombre) {
        modifiedSolicitudNovedadContraPrimerNombre = true;
        this.solicitudNovedadContraPrimerNombre = solicitudNovedadContraPrimerNombre;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadContraPrimerNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadContraPrimerNombre</code>.
    */
    public void setModifiedSolicitudNovedadContraPrimerNombre(boolean modified) {
        this.modifiedSolicitudNovedadContraPrimerNombre = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadContraSegundoNombre</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadContraSegundoNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadContraSegundoNombre</code> attribute.
    */

    public String getSolicitudNovedadContraSegundoNombre()  {
    	String value;
        value =  solicitudNovedadContraSegundoNombre;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>solicitudNovedadContraSegundoNombre</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadContraSegundoNombre</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param solicitudNovedadContraSegundoNombre The new value of the <code>solicitudNovedadContraSegundoNombre</code> attribute.
    */
    public void setSolicitudNovedadContraSegundoNombre (String solicitudNovedadContraSegundoNombre) {
        modifiedSolicitudNovedadContraSegundoNombre = true;
        this.solicitudNovedadContraSegundoNombre = solicitudNovedadContraSegundoNombre;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadContraSegundoNombre</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadContraSegundoNombre</code>.
    */
    public void setModifiedSolicitudNovedadContraSegundoNombre(boolean modified) {
        this.modifiedSolicitudNovedadContraSegundoNombre = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadContraPrimerApellido</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadContraPrimerApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadContraPrimerApellido</code> attribute.
    */

    public String getSolicitudNovedadContraPrimerApellido()  {
    	String value;
        value =  solicitudNovedadContraPrimerApellido;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>solicitudNovedadContraPrimerApellido</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadContraPrimerApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param solicitudNovedadContraPrimerApellido The new value of the <code>solicitudNovedadContraPrimerApellido</code> attribute.
    */
    public void setSolicitudNovedadContraPrimerApellido (String solicitudNovedadContraPrimerApellido) {
        modifiedSolicitudNovedadContraPrimerApellido = true;
        this.solicitudNovedadContraPrimerApellido = solicitudNovedadContraPrimerApellido;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadContraPrimerApellido</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadContraPrimerApellido</code>.
    */
    public void setModifiedSolicitudNovedadContraPrimerApellido(boolean modified) {
        this.modifiedSolicitudNovedadContraPrimerApellido = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadContraSegundoApellido</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadContraSegundoApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadContraSegundoApellido</code> attribute.
    */

    public String getSolicitudNovedadContraSegundoApellido()  {
    	String value;
        value =  solicitudNovedadContraSegundoApellido;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>solicitudNovedadContraSegundoApellido</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadContraSegundoApellido</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param solicitudNovedadContraSegundoApellido The new value of the <code>solicitudNovedadContraSegundoApellido</code> attribute.
    */
    public void setSolicitudNovedadContraSegundoApellido (String solicitudNovedadContraSegundoApellido) {
        modifiedSolicitudNovedadContraSegundoApellido = true;
        this.solicitudNovedadContraSegundoApellido = solicitudNovedadContraSegundoApellido;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadContraSegundoApellido</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadContraSegundoApellido</code>.
    */
    public void setModifiedSolicitudNovedadContraSegundoApellido(boolean modified) {
        this.modifiedSolicitudNovedadContraSegundoApellido = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadContraRazonSocial</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadContraRazonSocial</code>. Variable String Size=200<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadContraRazonSocial</code> attribute.
    */

    public String getSolicitudNovedadContraRazonSocial()  {
    	String value;
        value =  solicitudNovedadContraRazonSocial;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>solicitudNovedadContraRazonSocial</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadContraRazonSocial</code>. Variable String Size=200<br>
    * Comments: <br>
    * @param solicitudNovedadContraRazonSocial The new value of the <code>solicitudNovedadContraRazonSocial</code> attribute.
    */
    public void setSolicitudNovedadContraRazonSocial (String solicitudNovedadContraRazonSocial) {
        modifiedSolicitudNovedadContraRazonSocial = true;
        this.solicitudNovedadContraRazonSocial = solicitudNovedadContraRazonSocial;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadContraRazonSocial</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadContraRazonSocial</code>.
    */
    public void setModifiedSolicitudNovedadContraRazonSocial(boolean modified) {
        this.modifiedSolicitudNovedadContraRazonSocial = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadFechaUltimoDoc</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadFechaUltimoDoc</code>. Variable DateTime<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadFechaUltimoDoc</code> attribute.
    */

    public Timestamp getSolicitudNovedadFechaUltimoDoc()  {
    	Timestamp value;
        value =  solicitudNovedadFechaUltimoDoc;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudNovedadFechaUltimoDoc</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadFechaUltimoDoc</code>. Variable DateTime<br>
    * Comments: <br>
    * @param solicitudNovedadFechaUltimoDoc The new value of the <code>solicitudNovedadFechaUltimoDoc</code> attribute.
    */
    public void setSolicitudNovedadFechaUltimoDoc (Timestamp solicitudNovedadFechaUltimoDoc) {
        modifiedSolicitudNovedadFechaUltimoDoc = true;
        this.solicitudNovedadFechaUltimoDoc = solicitudNovedadFechaUltimoDoc;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadFechaUltimoDoc</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadFechaUltimoDoc</code>.
    */
    public void setModifiedSolicitudNovedadFechaUltimoDoc(boolean modified) {
        this.modifiedSolicitudNovedadFechaUltimoDoc = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadObservacions</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadObservacions</code>. Variable String Size=900<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadObservacions</code> attribute.
    */

    public String getSolicitudNovedadObservacions()  {
    	String value;
        value =  solicitudNovedadObservacions;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>solicitudNovedadObservacions</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadObservacions</code>. Variable String Size=900<br>
    * Comments: <br>
    * @param solicitudNovedadObservacions The new value of the <code>solicitudNovedadObservacions</code> attribute.
    */
    public void setSolicitudNovedadObservacions (String solicitudNovedadObservacions) {
        modifiedSolicitudNovedadObservacions = true;
        this.solicitudNovedadObservacions = solicitudNovedadObservacions;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadObservacions</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadObservacions</code>.
    */
    public void setModifiedSolicitudNovedadObservacions(boolean modified) {
        this.modifiedSolicitudNovedadObservacions = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadEstado</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadEstado</code>. Variable Int<br>
    * Comments: Las solicitudes tienen un estado que tomará los siguientes valores:
 + Radicado. Valor inicial
 + Tramitado 
 + Anulado<br>
    * @return The value of the <code>solicitudNovedadEstado</code> attribute.
    */

    public Long getSolicitudNovedadEstado()  {
    	Long value;
        value =  solicitudNovedadEstado;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudNovedadEstado</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadEstado</code>. Variable Int<br>
    * Comments: Las solicitudes tienen un estado que tomará los siguientes valores:
 + Radicado. Valor inicial
 + Tramitado 
 + Anulado<br>
    * @param solicitudNovedadEstado The new value of the <code>solicitudNovedadEstado</code> attribute.
    */
    public void setSolicitudNovedadEstado (Long solicitudNovedadEstado) {
        modifiedSolicitudNovedadEstado = true;
        this.solicitudNovedadEstado = solicitudNovedadEstado;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadEstado</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadEstado</code>.
    */
    public void setModifiedSolicitudNovedadEstado(boolean modified) {
        this.modifiedSolicitudNovedadEstado = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadEstadoDocumentacion</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadEstadoDocumentacion</code>. Variable Nat<br>
    * Comments: Los documentos tienen un estado que tomará los siguientes valores:
 + Pendiente revisión: Valor inicial hasta que es aprobado o rechazado
 + Aprobado
 + Devuelto. Cuando un documento es devuelto se debe enviar un correo electrónico al asesor que creó la solicitud informándole del hecho.<br>
    * @return The value of the <code>solicitudNovedadEstadoDocumentacion</code> attribute.
    */

    public Long getSolicitudNovedadEstadoDocumentacion()  {
    	Long value;
        value =  solicitudNovedadEstadoDocumentacion;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudNovedadEstadoDocumentacion</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadEstadoDocumentacion</code>. Variable Nat<br>
    * Comments: Los documentos tienen un estado que tomará los siguientes valores:
 + Pendiente revisión: Valor inicial hasta que es aprobado o rechazado
 + Aprobado
 + Devuelto. Cuando un documento es devuelto se debe enviar un correo electrónico al asesor que creó la solicitud informándole del hecho.<br>
    * @param solicitudNovedadEstadoDocumentacion The new value of the <code>solicitudNovedadEstadoDocumentacion</code> attribute.
    */
    public void setSolicitudNovedadEstadoDocumentacion (Long solicitudNovedadEstadoDocumentacion) {
        modifiedSolicitudNovedadEstadoDocumentacion = true;
        this.solicitudNovedadEstadoDocumentacion = solicitudNovedadEstadoDocumentacion;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadEstadoDocumentacion</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadEstadoDocumentacion</code>.
    */
    public void setModifiedSolicitudNovedadEstadoDocumentacion(boolean modified) {
        this.modifiedSolicitudNovedadEstadoDocumentacion = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadCompletada</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadCompletada</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadCompletada</code> attribute.
    */

    public Boolean getSolicitudNovedadCompletada()  {
    	Boolean value;
        value =  solicitudNovedadCompletada;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudNovedadCompletada</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadCompletada</code>. Variable Bool<br>
    * Comments: <br>
    * @param solicitudNovedadCompletada The new value of the <code>solicitudNovedadCompletada</code> attribute.
    */
    public void setSolicitudNovedadCompletada (Boolean solicitudNovedadCompletada) {
        modifiedSolicitudNovedadCompletada = true;
        this.solicitudNovedadCompletada = solicitudNovedadCompletada;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadCompletada</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadCompletada</code>.
    */
    public void setModifiedSolicitudNovedadCompletada(boolean modified) {
        this.modifiedSolicitudNovedadCompletada = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadFechaCompletada</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadFechaCompletada</code>. Variable DateTime<br>
    * Comments: GdC-25 Req 6: Debe aplicar la misma lógica del control de cambios No 23 Numeral 2,3 y 4. (Este es el 2)<br>
    * @return The value of the <code>solicitudNovedadFechaCompletada</code> attribute.
    */

    public Timestamp getSolicitudNovedadFechaCompletada()  {
    	Timestamp value;
        value =  solicitudNovedadFechaCompletada;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudNovedadFechaCompletada</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadFechaCompletada</code>. Variable DateTime<br>
    * Comments: GdC-25 Req 6: Debe aplicar la misma lógica del control de cambios No 23 Numeral 2,3 y 4. (Este es el 2)<br>
    * @param solicitudNovedadFechaCompletada The new value of the <code>solicitudNovedadFechaCompletada</code> attribute.
    */
    public void setSolicitudNovedadFechaCompletada (Timestamp solicitudNovedadFechaCompletada) {
        modifiedSolicitudNovedadFechaCompletada = true;
        this.solicitudNovedadFechaCompletada = solicitudNovedadFechaCompletada;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadFechaCompletada</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadFechaCompletada</code>.
    */
    public void setModifiedSolicitudNovedadFechaCompletada(boolean modified) {
        this.modifiedSolicitudNovedadFechaCompletada = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadCtrActivo</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadCtrActivo</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadCtrActivo</code> attribute.
    */

    public Boolean getSolicitudNovedadCtrActivo()  {
    	Boolean value;
        value =  solicitudNovedadCtrActivo;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudNovedadCtrActivo</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadCtrActivo</code>. Variable Bool<br>
    * Comments: <br>
    * @param solicitudNovedadCtrActivo The new value of the <code>solicitudNovedadCtrActivo</code> attribute.
    */
    public void setSolicitudNovedadCtrActivo (Boolean solicitudNovedadCtrActivo) {
        modifiedSolicitudNovedadCtrActivo = true;
        this.solicitudNovedadCtrActivo = solicitudNovedadCtrActivo;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadCtrActivo</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadCtrActivo</code>.
    */
    public void setModifiedSolicitudNovedadCtrActivo(boolean modified) {
        this.modifiedSolicitudNovedadCtrActivo = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadCtrTipoContrato</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadCtrTipoContrato</code>. Variable Nat<br>
    * Comments: 1.- Familiar, 3.- Colectivo<br>
    * @return The value of the <code>solicitudNovedadCtrTipoContrato</code> attribute.
    */

    public Long getSolicitudNovedadCtrTipoContrato()  {
    	Long value;
        value =  solicitudNovedadCtrTipoContrato;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudNovedadCtrTipoContrato</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadCtrTipoContrato</code>. Variable Nat<br>
    * Comments: 1.- Familiar, 3.- Colectivo<br>
    * @param solicitudNovedadCtrTipoContrato The new value of the <code>solicitudNovedadCtrTipoContrato</code> attribute.
    */
    public void setSolicitudNovedadCtrTipoContrato (Long solicitudNovedadCtrTipoContrato) {
        modifiedSolicitudNovedadCtrTipoContrato = true;
        this.solicitudNovedadCtrTipoContrato = solicitudNovedadCtrTipoContrato;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadCtrTipoContrato</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadCtrTipoContrato</code>.
    */
    public void setModifiedSolicitudNovedadCtrTipoContrato(boolean modified) {
        this.modifiedSolicitudNovedadCtrTipoContrato = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadSCNumMeses</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadSCNumMeses</code>. Variable Nat<br>
    * Comments: GdC 25 - Req 7: SC:  Suspensión de contrato
Datos adicionales: Se debe ingresar el número de meses. El valor mínimo es 6, valor máximo es 24.<br>
    * @return The value of the <code>solicitudNovedadSCNumMeses</code> attribute.
    */

    public Long getSolicitudNovedadSCNumMeses()  {
    	Long value;
        value =  solicitudNovedadSCNumMeses;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudNovedadSCNumMeses</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadSCNumMeses</code>. Variable Nat<br>
    * Comments: GdC 25 - Req 7: SC:  Suspensión de contrato
Datos adicionales: Se debe ingresar el número de meses. El valor mínimo es 6, valor máximo es 24.<br>
    * @param solicitudNovedadSCNumMeses The new value of the <code>solicitudNovedadSCNumMeses</code> attribute.
    */
    public void setSolicitudNovedadSCNumMeses (Long solicitudNovedadSCNumMeses) {
        modifiedSolicitudNovedadSCNumMeses = true;
        this.solicitudNovedadSCNumMeses = solicitudNovedadSCNumMeses;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadSCNumMeses</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadSCNumMeses</code>.
    */
    public void setModifiedSolicitudNovedadSCNumMeses(boolean modified) {
        this.modifiedSolicitudNovedadSCNumMeses = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadContraNuevaRazonSocial</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadContraNuevaRazonSocial</code>. Variable String Size=200<br>
    * Comments: GdC 25 - Req 7: En la solicitud de novedad en la sección información del contratante se debe ver el nuevo nombre. En la solicitud de novedad, en la observación de la solicitud se debe visualizar el nombre anterior.<br>
    * @return The value of the <code>solicitudNovedadContraNuevaRazonSocial</code> attribute.
    */

    public String getSolicitudNovedadContraNuevaRazonSocial()  {
    	String value;
        value =  solicitudNovedadContraNuevaRazonSocial;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>solicitudNovedadContraNuevaRazonSocial</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadContraNuevaRazonSocial</code>. Variable String Size=200<br>
    * Comments: GdC 25 - Req 7: En la solicitud de novedad en la sección información del contratante se debe ver el nuevo nombre. En la solicitud de novedad, en la observación de la solicitud se debe visualizar el nombre anterior.<br>
    * @param solicitudNovedadContraNuevaRazonSocial The new value of the <code>solicitudNovedadContraNuevaRazonSocial</code> attribute.
    */
    public void setSolicitudNovedadContraNuevaRazonSocial (String solicitudNovedadContraNuevaRazonSocial) {
        modifiedSolicitudNovedadContraNuevaRazonSocial = true;
        this.solicitudNovedadContraNuevaRazonSocial = solicitudNovedadContraNuevaRazonSocial;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadContraNuevaRazonSocial</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadContraNuevaRazonSocial</code>.
    */
    public void setModifiedSolicitudNovedadContraNuevaRazonSocial(boolean modified) {
        this.modifiedSolicitudNovedadContraNuevaRazonSocial = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadContraTipoPersona</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadContraTipoPersona</code>. Variable String Size=1<br>
    * Comments: N - Natural, J - Jurídica<br>
    * @return The value of the <code>solicitudNovedadContraTipoPersona</code> attribute.
    */

    public String getSolicitudNovedadContraTipoPersona()  {
    	String value;
        value =  solicitudNovedadContraTipoPersona;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>solicitudNovedadContraTipoPersona</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadContraTipoPersona</code>. Variable String Size=1<br>
    * Comments: N - Natural, J - Jurídica<br>
    * @param solicitudNovedadContraTipoPersona The new value of the <code>solicitudNovedadContraTipoPersona</code> attribute.
    */
    public void setSolicitudNovedadContraTipoPersona (String solicitudNovedadContraTipoPersona) {
        modifiedSolicitudNovedadContraTipoPersona = true;
        this.solicitudNovedadContraTipoPersona = solicitudNovedadContraTipoPersona;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadContraTipoPersona</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadContraTipoPersona</code>.
    */
    public void setModifiedSolicitudNovedadContraTipoPersona(boolean modified) {
        this.modifiedSolicitudNovedadContraTipoPersona = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadCtrFInicioContrato</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadCtrFInicioContrato</code>. Variable Date<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadCtrFInicioContrato</code> attribute.
    */

    public Date getSolicitudNovedadCtrFInicioContrato()  {
    	Date value;
        value =  solicitudNovedadCtrFInicioContrato;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudNovedadCtrFInicioContrato</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadCtrFInicioContrato</code>. Variable Date<br>
    * Comments: <br>
    * @param solicitudNovedadCtrFInicioContrato The new value of the <code>solicitudNovedadCtrFInicioContrato</code> attribute.
    */
    public void setSolicitudNovedadCtrFInicioContrato (Date solicitudNovedadCtrFInicioContrato) {
        modifiedSolicitudNovedadCtrFInicioContrato = true;
        this.solicitudNovedadCtrFInicioContrato = solicitudNovedadCtrFInicioContrato;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadCtrFInicioContrato</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadCtrFInicioContrato</code>.
    */
    public void setModifiedSolicitudNovedadCtrFInicioContrato(boolean modified) {
        this.modifiedSolicitudNovedadCtrFInicioContrato = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadDrvExigeContratoActivo</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadDrvExigeContratoActivo</code>. Variable Bool<br>
    * Comments: Devuelve si la novedad exige que el contrato esté activo<br>
    * @return The value of the <code>solicitudNovedadDrvExigeContratoActivo</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicitudNovedadDrvExigeContratoActivo()  {
    	Boolean value;
        try {
            value = solicitudNovedadDrvExigeContratoActivoDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: SolicitudNovedad, Attribute: solicitudNovedadDrvExigeContratoActivo");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicitudNovedadDrvExigeFamiliaActiva</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadDrvExigeFamiliaActiva</code>. Variable Bool<br>
    * Comments: Devuelve si la novedad exige que el contrato esté activo<br>
    * @return The value of the <code>solicitudNovedadDrvExigeFamiliaActiva</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicitudNovedadDrvExigeFamiliaActiva()  {
    	Boolean value;
        try {
            value = solicitudNovedadDrvExigeFamiliaActivaDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: SolicitudNovedad, Attribute: solicitudNovedadDrvExigeFamiliaActiva");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicitudNovedadContraDrvNombreCompleto</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadContraDrvNombreCompleto</code>. Variable String Size=250<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadContraDrvNombreCompleto</code> attribute.
    */

    @JsonIgnore
    public String getSolicitudNovedadContraDrvNombreCompleto()  {
    	String value;
        try {
            value = solicitudNovedadContraDrvNombreCompletoDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: SolicitudNovedad, Attribute: solicitudNovedadContraDrvNombreCompleto");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>solicitudNovedadDrvTarifa</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadDrvTarifa</code>. Variable String Size=120<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadDrvTarifa</code> attribute.
    */

    @JsonIgnore
    public String getSolicitudNovedadDrvTarifa()  {
    	String value;
        try {
            value = solicitudNovedadDrvTarifaDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: SolicitudNovedad, Attribute: solicitudNovedadDrvTarifa");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>solicitudNovedadDrvConvenio</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadDrvConvenio</code>. Variable String Size=120<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadDrvConvenio</code> attribute.
    */

    @JsonIgnore
    public String getSolicitudNovedadDrvConvenio()  {
    	String value;
        try {
            value = solicitudNovedadDrvConvenioDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: SolicitudNovedad, Attribute: solicitudNovedadDrvConvenio");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>solicitudNovedadContraDrvIdentificacion</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadContraDrvIdentificacion</code>. Variable String Size=70<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadContraDrvIdentificacion</code> attribute.
    */

    @JsonIgnore
    public String getSolicitudNovedadContraDrvIdentificacion()  {
    	String value;
        try {
            value = solicitudNovedadContraDrvIdentificacionDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: SolicitudNovedad, Attribute: solicitudNovedadContraDrvIdentificacion");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>solicitudNovedadDrvGrupoAsociado</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadDrvGrupoAsociado</code>. Variable String Size=220<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadDrvGrupoAsociado</code> attribute.
    */

    @JsonIgnore
    public String getSolicitudNovedadDrvGrupoAsociado()  {
    	String value;
        try {
            value = solicitudNovedadDrvGrupoAsociadoDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: SolicitudNovedad, Attribute: solicitudNovedadDrvGrupoAsociado");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>solicitudNovedadDrvPeriodicidad</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadDrvPeriodicidad</code>. Variable String Size=200<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadDrvPeriodicidad</code> attribute.
    */

    @JsonIgnore
    public String getSolicitudNovedadDrvPeriodicidad()  {
    	String value;
        try {
            value = solicitudNovedadDrvPeriodicidadDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: SolicitudNovedad, Attribute: solicitudNovedadDrvPeriodicidad");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>solicitudNovedadDrvPermiteAddFam</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadDrvPermiteAddFam</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadDrvPermiteAddFam</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicitudNovedadDrvPermiteAddFam()  {
    	Boolean value;
        try {
            value = solicitudNovedadDrvPermiteAddFamDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: SolicitudNovedad, Attribute: solicitudNovedadDrvPermiteAddFam");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicitudNovedadDrvPermiteDelFam</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadDrvPermiteDelFam</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadDrvPermiteDelFam</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicitudNovedadDrvPermiteDelFam()  {
    	Boolean value;
        try {
            value = solicitudNovedadDrvPermiteDelFamDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: SolicitudNovedad, Attribute: solicitudNovedadDrvPermiteDelFam");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicitudNovedadDrvExigeDocSolicitud</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadDrvExigeDocSolicitud</code>. Variable Bool<br>
    * Comments: Una marca que indicará si esta novedad requiere de documentación adjunta asociada a la clase documental solicitud<br>
    * @return The value of the <code>solicitudNovedadDrvExigeDocSolicitud</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicitudNovedadDrvExigeDocSolicitud()  {
    	Boolean value;
        try {
            value = solicitudNovedadDrvExigeDocSolicitudDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: SolicitudNovedad, Attribute: solicitudNovedadDrvExigeDocSolicitud");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicitudNovedadDrvExigeDocPersona</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadDrvExigeDocPersona</code>. Variable Bool<br>
    * Comments: Una marca que indicará si esta novedad requiere de documentación adjunta asociada a la clase documental persona (identificación de la persona)<br>
    * @return The value of the <code>solicitudNovedadDrvExigeDocPersona</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicitudNovedadDrvExigeDocPersona()  {
    	Boolean value;
        try {
            value = solicitudNovedadDrvExigeDocPersonaDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: SolicitudNovedad, Attribute: solicitudNovedadDrvExigeDocPersona");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicitudNovedadDrvReportColOscuro</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadDrvReportColOscuro</code>. Variable String Size=20<br>
    * Comments: GdC-25. Reqw 10: Color oscuro para el report. Se obtiene del dominio <br>
    * @return The value of the <code>solicitudNovedadDrvReportColOscuro</code> attribute.
    */

    @JsonIgnore
    public String getSolicitudNovedadDrvReportColOscuro()  {
    	String value;
        try {
            value = solicitudNovedadDrvReportColOscuroDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: SolicitudNovedad, Attribute: solicitudNovedadDrvReportColOscuro");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>solicitudNovedadDrvReportColClaro</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadDrvReportColClaro</code>. Variable String Size=20<br>
    * Comments: GdC-25. Reqw 10: Color claro para el report. Se obtiene del dominio <br>
    * @return The value of the <code>solicitudNovedadDrvReportColClaro</code> attribute.
    */

    @JsonIgnore
    public String getSolicitudNovedadDrvReportColClaro()  {
    	String value;
        try {
            value = solicitudNovedadDrvReportColClaroDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: SolicitudNovedad, Attribute: solicitudNovedadDrvReportColClaro");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>solicitudNovedadDrvReportLogo</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadDrvReportLogo</code>. Variable String Size=50<br>
    * Comments: GdC-25. Reqw 10: Logo para el report. Se obtiene del dominio <br>
    * @return The value of the <code>solicitudNovedadDrvReportLogo</code> attribute.
    */

    @JsonIgnore
    public String getSolicitudNovedadDrvReportLogo()  {
    	String value;
        try {
            value = solicitudNovedadDrvReportLogoDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: SolicitudNovedad, Attribute: solicitudNovedadDrvReportLogo");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>solicitudNovedadDrvNuevaPeriodicidad</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadDrvNuevaPeriodicidad</code>. Variable String Size=200<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNovedadDrvNuevaPeriodicidad</code> attribute.
    */

    @JsonIgnore
    public String getSolicitudNovedadDrvNuevaPeriodicidad()  {
    	String value;
        try {
            value = solicitudNovedadDrvNuevaPeriodicidadDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: SolicitudNovedad, Attribute: solicitudNovedadDrvNuevaPeriodicidad");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>solicitudNovedadPrioridad</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadPrioridad</code>. Variable Nat<br>
    * Comments: GdC-26. Req 7 Modificar pantalla de consulta de Estatus de Solicitudes
Se añadirá a la grilla el dato “Prioridad” para que se sepa la prioridad que tiene dicha solicitud (según lo explicado en el requisito 1).<br>
    * @return The value of the <code>solicitudNovedadPrioridad</code> attribute.
    */

    public Long getSolicitudNovedadPrioridad()  {
    	Long value;
        value =  solicitudNovedadPrioridad;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudNovedadPrioridad</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadPrioridad</code>. Variable Nat<br>
    * Comments: GdC-26. Req 7 Modificar pantalla de consulta de Estatus de Solicitudes
Se añadirá a la grilla el dato “Prioridad” para que se sepa la prioridad que tiene dicha solicitud (según lo explicado en el requisito 1).<br>
    * @param solicitudNovedadPrioridad The new value of the <code>solicitudNovedadPrioridad</code> attribute.
    */
    public void setSolicitudNovedadPrioridad (Long solicitudNovedadPrioridad) {
        modifiedSolicitudNovedadPrioridad = true;
        this.solicitudNovedadPrioridad = solicitudNovedadPrioridad;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadPrioridad</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadPrioridad</code>.
    */
    public void setModifiedSolicitudNovedadPrioridad(boolean modified) {
        this.modifiedSolicitudNovedadPrioridad = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadFechaTerminada</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadFechaTerminada</code>. Variable Date<br>
    * Comments: GdC-26 Req. 6: Asignación automática de solicitudes

Una solicitud se dará por terminada si se cumple alguna de las siguientes condiciones:
·	El estado de la solicitud es TRAMITADA y el estado de la documentación APROBADO
·	El estado de la solicitud es TRAMITADA CON PREEXISTENCIAS y el estado de la documentación APROBADO
·	El estado de la solicitud es ANULADA


La fecha en que se da por terminada debe ser un dato almacenado a nivel de base de datos para identificar estas solicitudes y así solo calcularse una vez.<br>
    * @return The value of the <code>solicitudNovedadFechaTerminada</code> attribute.
    */

    public Date getSolicitudNovedadFechaTerminada()  {
    	Date value;
        value =  solicitudNovedadFechaTerminada;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudNovedadFechaTerminada</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadFechaTerminada</code>. Variable Date<br>
    * Comments: GdC-26 Req. 6: Asignación automática de solicitudes

Una solicitud se dará por terminada si se cumple alguna de las siguientes condiciones:
·	El estado de la solicitud es TRAMITADA y el estado de la documentación APROBADO
·	El estado de la solicitud es TRAMITADA CON PREEXISTENCIAS y el estado de la documentación APROBADO
·	El estado de la solicitud es ANULADA


La fecha en que se da por terminada debe ser un dato almacenado a nivel de base de datos para identificar estas solicitudes y así solo calcularse una vez.<br>
    * @param solicitudNovedadFechaTerminada The new value of the <code>solicitudNovedadFechaTerminada</code> attribute.
    */
    public void setSolicitudNovedadFechaTerminada (Date solicitudNovedadFechaTerminada) {
        modifiedSolicitudNovedadFechaTerminada = true;
        this.solicitudNovedadFechaTerminada = solicitudNovedadFechaTerminada;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadFechaTerminada</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadFechaTerminada</code>.
    */
    public void setModifiedSolicitudNovedadFechaTerminada(boolean modified) {
        this.modifiedSolicitudNovedadFechaTerminada = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadFechaFUG</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadFechaFUG</code>. Variable DateTime<br>
    * Comments: GdC26- Req 7.
Fecha y hora última gestión (FUG): Registrará la fecha-hora del último cambio de estado de la solicitud o último cambio de estado de la documentación. Esta fecha se debe almacenar como campo en base de datos. Esto es, cada vez que la solicitud cambie de estado o cada vez que cambie de estado la documentación de una solicitud, se actualizará esta fecha, quedando solamente registrada la última.<br>
    * @return The value of the <code>solicitudNovedadFechaFUG</code> attribute.
    */

    public Timestamp getSolicitudNovedadFechaFUG()  {
    	Timestamp value;
        value =  solicitudNovedadFechaFUG;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudNovedadFechaFUG</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadFechaFUG</code>. Variable DateTime<br>
    * Comments: GdC26- Req 7.
Fecha y hora última gestión (FUG): Registrará la fecha-hora del último cambio de estado de la solicitud o último cambio de estado de la documentación. Esta fecha se debe almacenar como campo en base de datos. Esto es, cada vez que la solicitud cambie de estado o cada vez que cambie de estado la documentación de una solicitud, se actualizará esta fecha, quedando solamente registrada la última.<br>
    * @param solicitudNovedadFechaFUG The new value of the <code>solicitudNovedadFechaFUG</code> attribute.
    */
    public void setSolicitudNovedadFechaFUG (Timestamp solicitudNovedadFechaFUG) {
        modifiedSolicitudNovedadFechaFUG = true;
        this.solicitudNovedadFechaFUG = solicitudNovedadFechaFUG;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadFechaFUG</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadFechaFUG</code>.
    */
    public void setModifiedSolicitudNovedadFechaFUG(boolean modified) {
        this.modifiedSolicitudNovedadFechaFUG = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadFechaFA</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadFechaFA</code>. Variable DateTime<br>
    * Comments: GdC26- Req 7
Fecha y hora afiliación (FA): Ultima fecha-hora en que el estado de la documentación quedó en pendiente revisión. Esta fecha se debe almacenar como campo en base de datos.<br>
    * @return The value of the <code>solicitudNovedadFechaFA</code> attribute.
    */

    public Timestamp getSolicitudNovedadFechaFA()  {
    	Timestamp value;
        value =  solicitudNovedadFechaFA;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudNovedadFechaFA</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadFechaFA</code>. Variable DateTime<br>
    * Comments: GdC26- Req 7
Fecha y hora afiliación (FA): Ultima fecha-hora en que el estado de la documentación quedó en pendiente revisión. Esta fecha se debe almacenar como campo en base de datos.<br>
    * @param solicitudNovedadFechaFA The new value of the <code>solicitudNovedadFechaFA</code> attribute.
    */
    public void setSolicitudNovedadFechaFA (Timestamp solicitudNovedadFechaFA) {
        modifiedSolicitudNovedadFechaFA = true;
        this.solicitudNovedadFechaFA = solicitudNovedadFechaFA;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadFechaFA</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadFechaFA</code>.
    */
    public void setModifiedSolicitudNovedadFechaFA(boolean modified) {
        this.modifiedSolicitudNovedadFechaFA = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedadSemaforoGrabAse</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadSemaforoGrabAse</code>. Variable Real<br>
    * Comments: GdC 26. Req 16. Semaforización. Se requiere disponer de un código de color para cada solicitud de novedad de manera que visualmente se pueda saber si dicha solicitud se encuentra dentro de su acuerdo de nivel de servicio. Se tendrá un semáforo para el perfil Grabador de Afiliaciones / Asesor integral.<br>
    * @return The value of the <code>solicitudNovedadSemaforoGrabAse</code> attribute.
    */

    public Double getSolicitudNovedadSemaforoGrabAse()  {
    	Double value;
        value =  solicitudNovedadSemaforoGrabAse;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudNovedadSemaforoGrabAse</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadSemaforoGrabAse</code>. Variable Real<br>
    * Comments: GdC 26. Req 16. Semaforización. Se requiere disponer de un código de color para cada solicitud de novedad de manera que visualmente se pueda saber si dicha solicitud se encuentra dentro de su acuerdo de nivel de servicio. Se tendrá un semáforo para el perfil Grabador de Afiliaciones / Asesor integral.<br>
    * @param solicitudNovedadSemaforoGrabAse The new value of the <code>solicitudNovedadSemaforoGrabAse</code> attribute.
    */
    public void setSolicitudNovedadSemaforoGrabAse (Double solicitudNovedadSemaforoGrabAse) {
        modifiedSolicitudNovedadSemaforoGrabAse = true;
        this.solicitudNovedadSemaforoGrabAse = solicitudNovedadSemaforoGrabAse;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNovedadSemaforoGrabAse</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNovedadSemaforoGrabAse</code>.
    */
    public void setModifiedSolicitudNovedadSemaforoGrabAse(boolean modified) {
        this.modifiedSolicitudNovedadSemaforoGrabAse = modified;
    }

   /**
    * Returns the value of the <code>solicitudNovedaddrvSemaforoGrabAse</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedaddrvSemaforoGrabAse</code>. Variable Real<br>
    * Comments: GdC 26. Req 16. Semaforización. Se requiere disponer de un código de color para cada solicitud de novedad de manera que visualmente se pueda saber si dicha solicitud se encuentra dentro de su acuerdo de nivel de servicio. Se tendrá un semáforo para el perfil Grabador de Afiliaciones / Asesor integral. Es Nat porque es un dato expresado en días.

Este derivado sirve para:
* Mostrar el valor del constante que se registró (caso de que la solicitud esté terminada)
* Invocar a la función de BD y calcular el valor (caso de que la solicitud no esté terminada)<br>
    * @return The value of the <code>solicitudNovedaddrvSemaforoGrabAse</code> attribute.
    */

    @JsonIgnore
    public Double getSolicitudNovedaddrvSemaforoGrabAse()  {
    	Double value;
        try {
            value = solicitudNovedaddrvSemaforoGrabAseDerivations();
        } catch (Exception e) {
            value = Double.valueOf(0);
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: SolicitudNovedad, Attribute: solicitudNovedaddrvSemaforoGrabAse");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicitudNovedadDrvNumRadicadoStr</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadDrvNumRadicadoStr</code>. Variable String Size=20<br>
    * Comments: Num Radicado en string<br>
    * @return The value of the <code>solicitudNovedadDrvNumRadicadoStr</code> attribute.
    */

    @JsonIgnore
    public String getSolicitudNovedadDrvNumRadicadoStr()  {
    	String value;
        try {
            value = solicitudNovedadDrvNumRadicadoStrDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: SolicitudNovedad, Attribute: solicitudNovedadDrvNumRadicadoStr");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>solicitudNovedadDrvValidarPS1</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadDrvValidarPS1</code>. Variable Bool<br>
    * Comments: Validacion de Prorroga de suspension: "Para novedades de tipo PS es necesario que el contrato se encuentre cancelado."<br>
    * @return The value of the <code>solicitudNovedadDrvValidarPS1</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicitudNovedadDrvValidarPS1()  {
    	Boolean value;
        try {
            value = solicitudNovedadDrvValidarPS1Derivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: SolicitudNovedad, Attribute: solicitudNovedadDrvValidarPS1");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicitudNovedadDrvValidarPS2</code> attribute.<br>
    * Model Attribute: <code>solicitudNovedadDrvValidarPS2</code>. Variable Bool<br>
    * Comments: Validacion de Prorroga de suspension: "El contrato debe estar cancelado. Verifique el tag 'CausaExclusion' de la carátula del contrato"<br>
    * @return The value of the <code>solicitudNovedadDrvValidarPS2</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicitudNovedadDrvValidarPS2()  {
    	Boolean value;
        try {
            value = solicitudNovedadDrvValidarPS2Derivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: SolicitudNovedad, Attribute: solicitudNovedadDrvValidarPS2");
        }
        return value;
    }

    /**
     * Returns the instance of <code>FamiliaNovedad</code> related through the <code>Familias</code> role.
     * Model Relationship:
     * <code>[FamiliaNovedad] Familias 0:M  ------ 1:1  Solicitud [SolicitudNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>FamiliaNovedad</code> related through the <code>Familias</code> role.
     */
    @JsonIgnore
    public Collection <FamiliaNovedad> getFamilias() {
        return familias;
    }

    /**
     * Adds an instance of <code>FamiliaNovedad</code> related through the <code>Familias</code> role.
     * @param familias The instance to add to the <code>Familias</code> role.
     */
    public void add2Familias(FamiliaNovedad familias) {
        this.familias.add(familias);
    }
    /**
     * Removes an instance of <code>FamiliaNovedad</code> related through the <code>Familias</code> role.
     * @param familias The instance to be removed
     */
    public void removeFromFamilias(FamiliaNovedad familias) {
    	this.familias.remove(familias);
    }
    /**
     * Sets instances of <code>FamiliaNovedad</code> related through the <code>Familias</code> role.
     * @param familias The new value for the <code>Familias</code> role.
     */
    public void setFamilias(Collection < FamiliaNovedad > familias) {
        this.familias = familias;
    }

   /**
    * This method gets the attribute value <code>modifiedFamilias</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedFamilias</code> has been modified.
    */
    public boolean isModifiedFamilias(){
        return modifiedFamilias;
    }

    /**
     * Returns the instance of <code>DocumentoNovedad</code> related through the <code>Documentos</code> role.
     * Model Relationship:
     * <code>[DocumentoNovedad] Documentos 0:M  ------ 1:1  Solicitud [SolicitudNovedad]</code>
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
     * Returns the instance of <code>LogEstadoSN</code> related through the <code>LogEstados</code> role.
     * Model Relationship:
     * <code>[LogEstadoSN] LogEstados 0:M  ------ 1:1  SolicitudNovedad [SolicitudNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>LogEstadoSN</code> related through the <code>LogEstados</code> role.
     */
    @JsonIgnore
    public Collection <LogEstadoSN> getLogEstados() {
        return logEstados;
    }

    /**
     * Adds an instance of <code>LogEstadoSN</code> related through the <code>LogEstados</code> role.
     * @param logEstados The instance to add to the <code>LogEstados</code> role.
     */
    public void add2LogEstados(LogEstadoSN logEstados) {
        this.logEstados.add(logEstados);
    }
    /**
     * Removes an instance of <code>LogEstadoSN</code> related through the <code>LogEstados</code> role.
     * @param logEstados The instance to be removed
     */
    public void removeFromLogEstados(LogEstadoSN logEstados) {
    	this.logEstados.remove(logEstados);
    }
    /**
     * Sets instances of <code>LogEstadoSN</code> related through the <code>LogEstados</code> role.
     * @param logEstados The new value for the <code>LogEstados</code> role.
     */
    public void setLogEstados(Collection < LogEstadoSN > logEstados) {
        this.logEstados = logEstados;
    }

   /**
    * This method gets the attribute value <code>modifiedLogEstados</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedLogEstados</code> has been modified.
    */
    public boolean isModifiedLogEstados(){
        return modifiedLogEstados;
    }

    /**
     * Returns the instance of <code>LogUsrSolNov</code> related through the <code>LogUsrSolNov</code> role.
     * Model Relationship:
     * <code>[LogUsrSolNov] LogUsrSolNov 0:M  ------ 1:1  SolicitudNovedad [SolicitudNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>LogUsrSolNov</code> related through the <code>LogUsrSolNov</code> role.
     */
    @JsonIgnore
    public Collection <LogUsrSolNov> getLogUsrSolNov() {
        return logUsrSolNov;
    }

    /**
     * Adds an instance of <code>LogUsrSolNov</code> related through the <code>LogUsrSolNov</code> role.
     * @param logUsrSolNov The instance to add to the <code>LogUsrSolNov</code> role.
     */
    public void add2LogUsrSolNov(LogUsrSolNov logUsrSolNov) {
        this.logUsrSolNov.add(logUsrSolNov);
    }
    /**
     * Removes an instance of <code>LogUsrSolNov</code> related through the <code>LogUsrSolNov</code> role.
     * @param logUsrSolNov The instance to be removed
     */
    public void removeFromLogUsrSolNov(LogUsrSolNov logUsrSolNov) {
    	this.logUsrSolNov.remove(logUsrSolNov);
    }
    /**
     * Sets instances of <code>LogUsrSolNov</code> related through the <code>LogUsrSolNov</code> role.
     * @param logUsrSolNov The new value for the <code>LogUsrSolNov</code> role.
     */
    public void setLogUsrSolNov(Collection < LogUsrSolNov > logUsrSolNov) {
        this.logUsrSolNov = logUsrSolNov;
    }

   /**
    * This method gets the attribute value <code>modifiedLogUsrSolNov</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedLogUsrSolNov</code> has been modified.
    */
    public boolean isModifiedLogUsrSolNov(){
        return modifiedLogUsrSolNov;
    }

    /**
     * Returns the instance of <code>Planes</code> related through the <code>PlanT</code> role.
     * Model Relationship:
     * <code>[Planes] PlanT 1:1  ------ 0:M  SolicitudesNovedad [SolicitudNovedad]</code>
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
     * Returns the instance of <code>Novedad</code> related through the <code>Novedad</code> role.
     * Model Relationship:
     * <code>[Novedad] Novedad 1:1  ------ 0:M  Solicitudes [SolicitudNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Novedad</code> related through the <code>Novedad</code> role.
     */
    @JsonIgnore
    public Novedad getNovedad() {
        return novedad;
    }

    /**
     * Adds an instance of <code>Novedad</code> related through the <code>Novedad</code> role.
     * @param novedad The instance to add to the <code>Novedad</code> role.
     */
    public void add2Novedad(Novedad novedad) {
        if (novedad == null || novedad.isNull()) {
            this.modifiedNovedad = true;
            this.novedadidNovedad = null;
        } else {
            this.novedadidNovedad = novedad.getNovedadidNovedad();
        }
        this.novedad = (novedad == null  || novedad.isNull() ? null : novedad);
    }

   /**
    * This method gets the attribute value <code>modifiedNovedad</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedNovedad</code> has been modified.
    */
    public boolean isModifiedNovedad(){
        return modifiedNovedad;
    }

    /**
     * Returns the instance of <code>Causal</code> related through the <code>Causal</code> role.
     * Model Relationship:
     * <code>[Causal] Causal 0:1  ------ 0:M  Solicitudes [SolicitudNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Causal</code> related through the <code>Causal</code> role.
     */
    @JsonIgnore
    public Causal getCausal() {
        return causal;
    }

    /**
     * Adds an instance of <code>Causal</code> related through the <code>Causal</code> role.
     * @param causal The instance to add to the <code>Causal</code> role.
     */
    public void add2Causal(Causal causal) {
        if (causal == null || causal.isNull()) {
            this.modifiedCausal = true;
            this.causalidCausal = null;
        } else {
            this.causalidCausal = causal.getCausalidCausal();
        }
        this.causal = (causal == null  || causal.isNull() ? null : causal);
    }

   /**
    * This method gets the attribute value <code>modifiedCausal</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedCausal</code> has been modified.
    */
    public boolean isModifiedCausal(){
        return modifiedCausal;
    }

    /**
     * Returns the instance of <code>ProteccionDatos</code> related through the <code>ProteccionDatos</code> role.
     * Model Relationship:
     * <code>[ProteccionDatos] ProteccionDatos 0:1  ------ 0:1  SolicitudNovedad [SolicitudNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>ProteccionDatos</code> related through the <code>ProteccionDatos</code> role.
     */
    @JsonIgnore
    public ProteccionDatos getProteccionDatos() {
        return proteccionDatos;
    }

    /**
     * Adds an instance of <code>ProteccionDatos</code> related through the <code>ProteccionDatos</code> role.
     * @param proteccionDatos The instance to add to the <code>ProteccionDatos</code> role.
     */
    public void add2ProteccionDatos(ProteccionDatos proteccionDatos) {
        if (proteccionDatos == null || proteccionDatos.isNull()) {
            this.modifiedProteccionDatos = true;
            this.proteccionDatosIdentificador = null;
        } else {
            this.proteccionDatosIdentificador = proteccionDatos.getProteccionDatosIdentificador();
        }
        this.proteccionDatos = (proteccionDatos == null  || proteccionDatos.isNull() ? null : proteccionDatos);
    }

   /**
    * This method gets the attribute value <code>modifiedProteccionDatos</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedProteccionDatos</code> has been modified.
    */
    public boolean isModifiedProteccionDatos(){
        return modifiedProteccionDatos;
    }

    /**
     * Returns the instance of <code>TipoIdentificacion</code> related through the <code>TipoIdentContratante</code> role.
     * Model Relationship:
     * <code>[TipoIdentificacion] TipoIdentContratante 0:1  ------ 0:M  SolicitudesNovedad [SolicitudNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>TipoIdentificacion</code> related through the <code>TipoIdentContratante</code> role.
     */
    @JsonIgnore
    public TipoIdentificacion getTipoIdentContratante() {
        return tipoIdentContratante;
    }

    /**
     * Adds an instance of <code>TipoIdentificacion</code> related through the <code>TipoIdentContratante</code> role.
     * @param tipoIdentContratante The instance to add to the <code>TipoIdentContratante</code> role.
     */
    public void add2TipoIdentContratante(TipoIdentificacion tipoIdentContratante) {
        if (tipoIdentContratante == null || tipoIdentContratante.isNull()) {
            this.modifiedTipoIdentContratante = true;
            this.tipoIdentificacionCodigo = null;
        } else {
            this.tipoIdentificacionCodigo = tipoIdentContratante.getTipoIdentificacionCodigo();
        }
        this.tipoIdentContratante = (tipoIdentContratante == null  || tipoIdentContratante.isNull() ? null : tipoIdentContratante);
    }

   /**
    * This method gets the attribute value <code>modifiedTipoIdentContratante</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedTipoIdentContratante</code> has been modified.
    */
    public boolean isModifiedTipoIdentContratante(){
        return modifiedTipoIdentContratante;
    }

    /**
     * Returns the instance of <code>EstadoContrato</code> related through the <code>EstadoContrato</code> role.
     * Model Relationship:
     * <code>[EstadoContrato] EstadoContrato 0:1  ------ 0:M  SolicitudesNovedad [SolicitudNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>EstadoContrato</code> related through the <code>EstadoContrato</code> role.
     */
    @JsonIgnore
    public EstadoContrato getEstadoContrato() {
        return estadoContrato;
    }

    /**
     * Adds an instance of <code>EstadoContrato</code> related through the <code>EstadoContrato</code> role.
     * @param estadoContrato The instance to add to the <code>EstadoContrato</code> role.
     */
    public void add2EstadoContrato(EstadoContrato estadoContrato) {
        if (estadoContrato == null || estadoContrato.isNull()) {
            this.modifiedEstadoContrato = true;
            this.estadoContratoEstadoContratoCodigo = null;
        } else {
            this.estadoContratoEstadoContratoCodigo = estadoContrato.getEstadoContratoCodigo();
        }
        this.estadoContrato = (estadoContrato == null  || estadoContrato.isNull() ? null : estadoContrato);
    }

   /**
    * This method gets the attribute value <code>modifiedEstadoContrato</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedEstadoContrato</code> has been modified.
    */
    public boolean isModifiedEstadoContrato(){
        return modifiedEstadoContrato;
    }

    /**
     * Returns the instance of <code>GrupoAsociado</code> related through the <code>GrupoAsociado</code> role.
     * Model Relationship:
     * <code>[GrupoAsociado] GrupoAsociado 0:1  ------ 0:M  SolicitudesNovedad [SolicitudNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>GrupoAsociado</code> related through the <code>GrupoAsociado</code> role.
     */
    @JsonIgnore
    public GrupoAsociado getGrupoAsociado() {
        return grupoAsociado;
    }

    /**
     * Adds an instance of <code>GrupoAsociado</code> related through the <code>GrupoAsociado</code> role.
     * @param grupoAsociado The instance to add to the <code>GrupoAsociado</code> role.
     */
    public void add2GrupoAsociado(GrupoAsociado grupoAsociado) {
        if (grupoAsociado == null || grupoAsociado.isNull()) {
            this.modifiedGrupoAsociado = true;
            this.grupoAsociadoGrupoAsociadoCodigo = null;
        } else {
            this.grupoAsociadoGrupoAsociadoCodigo = grupoAsociado.getGrupoAsociadoCodigo();
        }
        this.grupoAsociado = (grupoAsociado == null  || grupoAsociado.isNull() ? null : grupoAsociado);
    }

   /**
    * This method gets the attribute value <code>modifiedGrupoAsociado</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedGrupoAsociado</code> has been modified.
    */
    public boolean isModifiedGrupoAsociado(){
        return modifiedGrupoAsociado;
    }

    /**
     * Returns the instance of <code>Periodicidad</code> related through the <code>Periodicidad</code> role.
     * Model Relationship:
     * <code>[Periodicidad] Periodicidad 0:1  ------ 0:M  SolicitudesNovedad [SolicitudNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Periodicidad</code> related through the <code>Periodicidad</code> role.
     */
    @JsonIgnore
    public Periodicidad getPeriodicidad() {
        return periodicidad;
    }

    /**
     * Adds an instance of <code>Periodicidad</code> related through the <code>Periodicidad</code> role.
     * @param periodicidad The instance to add to the <code>Periodicidad</code> role.
     */
    public void add2Periodicidad(Periodicidad periodicidad) {
        if (periodicidad == null || periodicidad.isNull()) {
            this.modifiedPeriodicidad = true;
            this.periodicidadPeriodicidadCodigo = null;
        } else {
            this.periodicidadPeriodicidadCodigo = periodicidad.getPeriodicidadCodigo();
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
     * Returns the instance of <code>Funcionario</code> related through the <code>Agente</code> role.
     * Model Relationship:
     * <code>[Funcionario] Agente 1:1  ------ 0:M  SolicitudesNovedad [SolicitudNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Funcionario</code> related through the <code>Agente</code> role.
     */
    @JsonIgnore
    public Funcionario getAgente() {
        return agente;
    }

    /**
     * Adds an instance of <code>Funcionario</code> related through the <code>Agente</code> role.
     * @param agente The instance to add to the <code>Agente</code> role.
     */
    public void add2Agente(Funcionario agente) {
        if (agente == null || agente.isNull()) {
            this.modifiedAgente = true;
            this.funcionarioAgenteId = null;
        } else {
            this.funcionarioAgenteId = agente.getFuncionarioId();
        }
        this.agente = (agente == null  || agente.isNull() ? null : agente);
    }

   /**
    * This method gets the attribute value <code>modifiedAgente</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedAgente</code> has been modified.
    */
    public boolean isModifiedAgente(){
        return modifiedAgente;
    }

    /**
     * Returns the instance of <code>Periodicidad</code> related through the <code>PeriodicidadNueva</code> role.
     * Model Relationship:
     * <code>[Periodicidad] PeriodicidadNueva 0:1  ------ 0:M  SolicitudesNovedadNueva [SolicitudNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Periodicidad</code> related through the <code>PeriodicidadNueva</code> role.
     */
    @JsonIgnore
    public Periodicidad getPeriodicidadNueva() {
        return periodicidadNueva;
    }

    /**
     * Adds an instance of <code>Periodicidad</code> related through the <code>PeriodicidadNueva</code> role.
     * @param periodicidadNueva The instance to add to the <code>PeriodicidadNueva</code> role.
     */
    public void add2PeriodicidadNueva(Periodicidad periodicidadNueva) {
        if (periodicidadNueva == null || periodicidadNueva.isNull()) {
            this.modifiedPeriodicidadNueva = true;
            this.periodicidadPeriodicidadNuevaCodigo = null;
        } else {
            this.periodicidadPeriodicidadNuevaCodigo = periodicidadNueva.getPeriodicidadCodigo();
        }
        this.periodicidadNueva = (periodicidadNueva == null  || periodicidadNueva.isNull() ? null : periodicidadNueva);
    }

   /**
    * This method gets the attribute value <code>modifiedPeriodicidadNueva</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedPeriodicidadNueva</code> has been modified.
    */
    public boolean isModifiedPeriodicidadNueva(){
        return modifiedPeriodicidadNueva;
    }

    /**
     * Returns the instance of <code>MotivoExcepcionSolNov</code> related through the <code>MotivoExcepcion</code> role.
     * Model Relationship:
     * <code>[MotivoExcepcionSolNov] MotivoExcepcion 0:1  ------ 0:M  Solicitudes [SolicitudNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>MotivoExcepcionSolNov</code> related through the <code>MotivoExcepcion</code> role.
     */
    @JsonIgnore
    public MotivoExcepcionSolNov getMotivoExcepcion() {
        return motivoExcepcion;
    }

    /**
     * Adds an instance of <code>MotivoExcepcionSolNov</code> related through the <code>MotivoExcepcion</code> role.
     * @param motivoExcepcion The instance to add to the <code>MotivoExcepcion</code> role.
     */
    public void add2MotivoExcepcion(MotivoExcepcionSolNov motivoExcepcion) {
        if (motivoExcepcion == null || motivoExcepcion.isNull()) {
            this.modifiedMotivoExcepcion = true;
            this.motivoExcepcionSolNovMotivoExcepcionId = null;
        } else {
            this.motivoExcepcionSolNovMotivoExcepcionId = motivoExcepcion.getMotivoExcepcionSolNovId();
        }
        this.motivoExcepcion = (motivoExcepcion == null  || motivoExcepcion.isNull() ? null : motivoExcepcion);
    }

   /**
    * This method gets the attribute value <code>modifiedMotivoExcepcion</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedMotivoExcepcion</code> has been modified.
    */
    public boolean isModifiedMotivoExcepcion(){
        return modifiedMotivoExcepcion;
    }

    /**
     * Returns the instance of <code>Funcionario</code> related through the <code>UsrAfiliacion</code> role.
     * Model Relationship:
     * <code>[Funcionario] UsrAfiliacion 0:1  ------ 0:M  SolNovAifliaciones [SolicitudNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Funcionario</code> related through the <code>UsrAfiliacion</code> role.
     */
    @JsonIgnore
    public Funcionario getUsrAfiliacion() {
        return usrAfiliacion;
    }

    /**
     * Adds an instance of <code>Funcionario</code> related through the <code>UsrAfiliacion</code> role.
     * @param usrAfiliacion The instance to add to the <code>UsrAfiliacion</code> role.
     */
    public void add2UsrAfiliacion(Funcionario usrAfiliacion) {
        if (usrAfiliacion == null || usrAfiliacion.isNull()) {
            this.modifiedUsrAfiliacion = true;
            this.funcionarioUsrAfiliacionId = null;
        } else {
            this.funcionarioUsrAfiliacionId = usrAfiliacion.getFuncionarioId();
        }
        this.usrAfiliacion = (usrAfiliacion == null  || usrAfiliacion.isNull() ? null : usrAfiliacion);
    }

   /**
    * This method gets the attribute value <code>modifiedUsrAfiliacion</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedUsrAfiliacion</code> has been modified.
    */
    public boolean isModifiedUsrAfiliacion(){
        return modifiedUsrAfiliacion;
    }

    /**
     * Returns the instance of <code>Firma</code> related through the <code>Firma</code> role.
     * Model Relationship:
     * <code>[Firma] Firma 0:1  ------ 0:1  SolicitudNovedad [SolicitudNovedad]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Firma</code> related through the <code>Firma</code> role.
     */
    @JsonIgnore
    public Firma getFirma() {
        return firma;
    }

    /**
     * Adds an instance of <code>Firma</code> related through the <code>Firma</code> role.
     * @param firma The instance to add to the <code>Firma</code> role.
     */
    public void add2Firma(Firma firma) {
        if (firma == null || firma.isNull()) {
            this.modifiedFirma = true;
            this.firmaFirmaIdentificador = null;
        } else {
            this.firmaFirmaIdentificador = firma.getFirmaIdentificador();
        }
        this.firma = (firma == null  || firma.isNull() ? null : firma);
    }

   /**
    * This method gets the attribute value <code>modifiedFirma</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedFirma</code> has been modified.
    */
    public boolean isModifiedFirma(){
        return modifiedFirma;
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
     * Computes the value of the <code>solicitudNovedadDrvExigeContratoActivo</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicitudNovedadDrvExigeContratoActivo</code> derived attribute.
     */
    public Boolean solicitudNovedadDrvExigeContratoActivoDerivations() {

        solicitudNovedadDrvExigeContratoActivo = null;

        solicitudNovedadDrvExigeContratoActivoDerivationsConditional1();
        solicitudNovedadDrvExigeContratoActivoDerivationsConditional2();
        solicitudNovedadDrvExigeContratoActivoDerivationsConditional3();
        solicitudNovedadDrvExigeContratoActivoDerivationsDefault();
        return solicitudNovedadDrvExigeContratoActivo;
    }

    private void solicitudNovedadDrvExigeContratoActivoDerivationsConditional1() {
        if (solicitudNovedadDrvExigeContratoActivo != null) return;
        // CONDITION: Novedad.AliasNovedad = \"SC\" OR Novedad.AliasNovedad = \"CC\" OR Novedad.AliasNovedad = \"RO\" OR Novedad.AliasNovedad = \"PP\" OR Novedad.AliasNovedad = \"EU\" OR Novedad.AliasNovedad = \"CP\" OR Novedad.AliasNovedad = \"SU\"  OR Novedad.AliasNovedad = \"CD\"  OR Novedad.AliasNovedad = \"CT\" OR Novedad.AliasNovedad = \"MD\"
        // EFFECT   : TRUE
        boolean solicitudNovedadDrvExigeContratoActivoCond = (this.getNovedad().getNovedadAliasNovedad()).equals("SC") || (this.getNovedad().getNovedadAliasNovedad()).equals("CC") || (this.getNovedad().getNovedadAliasNovedad()).equals("RO") || (this.getNovedad().getNovedadAliasNovedad()).equals("PP") || (this.getNovedad().getNovedadAliasNovedad()).equals("EU") || (this.getNovedad().getNovedadAliasNovedad()).equals("CP") || (this.getNovedad().getNovedadAliasNovedad()).equals("SU") || (this.getNovedad().getNovedadAliasNovedad()).equals("CD") || (this.getNovedad().getNovedadAliasNovedad()).equals("CT") || (this.getNovedad().getNovedadAliasNovedad()).equals("MD");
        if (solicitudNovedadDrvExigeContratoActivoCond) {
            solicitudNovedadDrvExigeContratoActivo = Boolean.TRUE;
        }
    }

    private void solicitudNovedadDrvExigeContratoActivoDerivationsConditional2() {
        if (solicitudNovedadDrvExigeContratoActivo != null) return;
        // CONDITION: Novedad.TipoNovedad.Tipo = 2 AND (Novedad.AliasNovedad = \"AS\" OR Novedad.AliasNovedad = \"PS\")
        // EFFECT   : TRUE
        boolean solicitudNovedadDrvExigeContratoActivoCond = (this.getNovedad().getTipoNovedad().getTipoNovedadTipo()).equals(Long.valueOf(2)) && ((this.getNovedad().getNovedadAliasNovedad()).equals("AS") || (this.getNovedad().getNovedadAliasNovedad()).equals("PS"));
        if (solicitudNovedadDrvExigeContratoActivoCond) {
            solicitudNovedadDrvExigeContratoActivo = Boolean.TRUE;
        }
    }

    private void solicitudNovedadDrvExigeContratoActivoDerivationsConditional3() {
        if (solicitudNovedadDrvExigeContratoActivo != null) return;
        // CONDITION: Novedad.AliasNovedad = \"00\"
        // EFFECT   : TRUE
        boolean solicitudNovedadDrvExigeContratoActivoCond = (this.getNovedad().getNovedadAliasNovedad()).equals("00");
        if (solicitudNovedadDrvExigeContratoActivoCond) {
            solicitudNovedadDrvExigeContratoActivo = Boolean.TRUE;
        }
    }

    private void solicitudNovedadDrvExigeContratoActivoDerivationsDefault() {
        if (solicitudNovedadDrvExigeContratoActivo != null) return;
        // Default derivation
        // EFFECT   : FALSE
        solicitudNovedadDrvExigeContratoActivo = Boolean.FALSE;
    }

    /**
     * Computes the value of the <code>solicitudNovedadDrvExigeFamiliaActiva</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicitudNovedadDrvExigeFamiliaActiva</code> derived attribute.
     */
    public Boolean solicitudNovedadDrvExigeFamiliaActivaDerivations() {

        solicitudNovedadDrvExigeFamiliaActiva = null;

        solicitudNovedadDrvExigeFamiliaActivaDerivationsConditional1();
        solicitudNovedadDrvExigeFamiliaActivaDerivationsConditional2();
        solicitudNovedadDrvExigeFamiliaActivaDerivationsDefault();
        return solicitudNovedadDrvExigeFamiliaActiva;
    }

    private void solicitudNovedadDrvExigeFamiliaActivaDerivationsConditional1() {
        if (solicitudNovedadDrvExigeFamiliaActiva != null) return;
        // CONDITION: Novedad.AliasNovedad = \"EU\" OR  Novedad.AliasNovedad = \"CP\" OR  Novedad.AliasNovedad = \"SU\" OR  Novedad.AliasNovedad = \"CD\" OR  Novedad.AliasNovedad = \"CT\" OR  Novedad.AliasNovedad = \"MD\"
        // EFFECT   : TRUE
        boolean solicitudNovedadDrvExigeFamiliaActivaCond = (this.getNovedad().getNovedadAliasNovedad()).equals("EU") || (this.getNovedad().getNovedadAliasNovedad()).equals("CP") || (this.getNovedad().getNovedadAliasNovedad()).equals("SU") || (this.getNovedad().getNovedadAliasNovedad()).equals("CD") || (this.getNovedad().getNovedadAliasNovedad()).equals("CT") || (this.getNovedad().getNovedadAliasNovedad()).equals("MD");
        if (solicitudNovedadDrvExigeFamiliaActivaCond) {
            solicitudNovedadDrvExigeFamiliaActiva = Boolean.TRUE;
        }
    }

    private void solicitudNovedadDrvExigeFamiliaActivaDerivationsConditional2() {
        if (solicitudNovedadDrvExigeFamiliaActiva != null) return;
        // CONDITION: Novedad.TipoNovedad.Tipo = 2 AND ( Novedad.AliasNovedad = \"RO\" OR Novedad.AliasNovedad = \"PS\"  OR Novedad.AliasNovedad = \"AS\" )
        // EFFECT   : TRUE
        boolean solicitudNovedadDrvExigeFamiliaActivaCond = (this.getNovedad().getTipoNovedad().getTipoNovedadTipo()).equals(Long.valueOf(2)) && ((this.getNovedad().getNovedadAliasNovedad()).equals("RO") || (this.getNovedad().getNovedadAliasNovedad()).equals("PS") || (this.getNovedad().getNovedadAliasNovedad()).equals("AS"));
        if (solicitudNovedadDrvExigeFamiliaActivaCond) {
            solicitudNovedadDrvExigeFamiliaActiva = Boolean.TRUE;
        }
    }

    private void solicitudNovedadDrvExigeFamiliaActivaDerivationsDefault() {
        if (solicitudNovedadDrvExigeFamiliaActiva != null) return;
        // Default derivation
        // EFFECT   : FALSE
        solicitudNovedadDrvExigeFamiliaActiva = Boolean.FALSE;
    }

    /**
     * Computes the value of the <code>solicitudNovedadContraDrvNombreCompleto</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicitudNovedadContraDrvNombreCompleto</code> derived attribute.
     */
    public String solicitudNovedadContraDrvNombreCompletoDerivations() {

        solicitudNovedadContraDrvNombreCompleto = null;

        solicitudNovedadContraDrvNombreCompletoDerivationsConditional1();
        solicitudNovedadContraDrvNombreCompletoDerivationsDefault();
        return solicitudNovedadContraDrvNombreCompleto;
    }

    private void solicitudNovedadContraDrvNombreCompletoDerivationsConditional1() {
        if (solicitudNovedadContraDrvNombreCompleto != null) return;
        // CONDITION: TipoIdentContratante.NIT = true
        // EFFECT   : ContraRazonSocial
        boolean solicitudNovedadContraDrvNombreCompletoCond = this.getTipoIdentContratante().getTipoIdentificacionNIT().equals(true);
        if (solicitudNovedadContraDrvNombreCompletoCond) {
            solicitudNovedadContraDrvNombreCompleto = this.getSolicitudNovedadContraRazonSocial();
        }
    }

    private void solicitudNovedadContraDrvNombreCompletoDerivationsDefault() {
        if (solicitudNovedadContraDrvNombreCompleto != null) return;
        // Default derivation
        // EFFECT   : fuconcatenarConNulos(\"\", ContraPrimerNombre) + fuconcatenarConNulos(\" \", ContraSegundoNombre) + fuconcatenarConNulos(\" \", ContraPrimerApellido) + fuconcatenarConNulos(\" \", ContraSegundoApellido)
        solicitudNovedadContraDrvNombreCompleto = userFunctionsSrv.fuconcatenarConNulosFun("", this.getSolicitudNovedadContraPrimerNombre()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getSolicitudNovedadContraSegundoNombre()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getSolicitudNovedadContraPrimerApellido()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getSolicitudNovedadContraSegundoApellido());
    }

    /**
     * Computes the value of the <code>solicitudNovedadDrvTarifa</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicitudNovedadDrvTarifa</code> derived attribute.
     */
    public String solicitudNovedadDrvTarifaDerivations() {

        solicitudNovedadDrvTarifa = null;

        solicitudNovedadDrvTarifaDerivationsConditional1();
        solicitudNovedadDrvTarifaDerivationsConditional2();
        solicitudNovedadDrvTarifaDerivationsConditional3();
        solicitudNovedadDrvTarifaDerivationsDefault();
        return solicitudNovedadDrvTarifa;
    }

    private void solicitudNovedadDrvTarifaDerivationsConditional1() {
        if (solicitudNovedadDrvTarifa != null) return;
        // CONDITION: CtrCodigoTarifa <> NULL AND CtrDescTarifa <> NULL
        // EFFECT   : CtrCodigoTarifa  + \" \" + CtrDescTarifa 
        boolean solicitudNovedadDrvTarifaCond = this.getSolicitudNovedadCtrCodigoTarifa() != null && this.getSolicitudNovedadCtrDescTarifa() != null;
        if (solicitudNovedadDrvTarifaCond) {
            solicitudNovedadDrvTarifa = this.getSolicitudNovedadCtrCodigoTarifa() + " " + this.getSolicitudNovedadCtrDescTarifa();
        }
    }

    private void solicitudNovedadDrvTarifaDerivationsConditional2() {
        if (solicitudNovedadDrvTarifa != null) return;
        // CONDITION: CtrCodigoTarifa <> NULL 
        // EFFECT   : CtrCodigoTarifa  
        boolean solicitudNovedadDrvTarifaCond = this.getSolicitudNovedadCtrCodigoTarifa() != null;
        if (solicitudNovedadDrvTarifaCond) {
            solicitudNovedadDrvTarifa = this.getSolicitudNovedadCtrCodigoTarifa();
        }
    }

    private void solicitudNovedadDrvTarifaDerivationsConditional3() {
        if (solicitudNovedadDrvTarifa != null) return;
        // CONDITION: CtrDescTarifa <> NULL
        // EFFECT   : CtrDescTarifa 
        boolean solicitudNovedadDrvTarifaCond = this.getSolicitudNovedadCtrDescTarifa() != null;
        if (solicitudNovedadDrvTarifaCond) {
            solicitudNovedadDrvTarifa = this.getSolicitudNovedadCtrDescTarifa();
        }
    }

    private void solicitudNovedadDrvTarifaDerivationsDefault() {
        if (solicitudNovedadDrvTarifa != null) return;
        // Default derivation
        // EFFECT   : \"\"
        solicitudNovedadDrvTarifa = "";
    }

    /**
     * Computes the value of the <code>solicitudNovedadDrvConvenio</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicitudNovedadDrvConvenio</code> derived attribute.
     */
    public String solicitudNovedadDrvConvenioDerivations() {

        solicitudNovedadDrvConvenio = null;

        solicitudNovedadDrvConvenioDerivationsConditional1();
        solicitudNovedadDrvConvenioDerivationsConditional2();
        solicitudNovedadDrvConvenioDerivationsConditional3();
        solicitudNovedadDrvConvenioDerivationsDefault();
        return solicitudNovedadDrvConvenio;
    }

    private void solicitudNovedadDrvConvenioDerivationsConditional1() {
        if (solicitudNovedadDrvConvenio != null) return;
        // CONDITION: CtrCodigoConvenio <> NULL AND CtrDescConvenio <> NULL
        // EFFECT   : CtrCodigoConvenio + \" \" + CtrDescConvenio
        boolean solicitudNovedadDrvConvenioCond = this.getSolicitudNovedadCtrCodigoConvenio() != null && this.getSolicitudNovedadCtrDescConvenio() != null;
        if (solicitudNovedadDrvConvenioCond) {
            solicitudNovedadDrvConvenio = this.getSolicitudNovedadCtrCodigoConvenio() + " " + this.getSolicitudNovedadCtrDescConvenio();
        }
    }

    private void solicitudNovedadDrvConvenioDerivationsConditional2() {
        if (solicitudNovedadDrvConvenio != null) return;
        // CONDITION: CtrCodigoConvenio <> NULL 
        // EFFECT   : CtrCodigoConvenio 
        boolean solicitudNovedadDrvConvenioCond = this.getSolicitudNovedadCtrCodigoConvenio() != null;
        if (solicitudNovedadDrvConvenioCond) {
            solicitudNovedadDrvConvenio = this.getSolicitudNovedadCtrCodigoConvenio();
        }
    }

    private void solicitudNovedadDrvConvenioDerivationsConditional3() {
        if (solicitudNovedadDrvConvenio != null) return;
        // CONDITION:  CtrDescConvenio <> NULL
        // EFFECT   :  CtrDescConvenio
        boolean solicitudNovedadDrvConvenioCond = this.getSolicitudNovedadCtrDescConvenio() != null;
        if (solicitudNovedadDrvConvenioCond) {
            solicitudNovedadDrvConvenio = this.getSolicitudNovedadCtrDescConvenio();
        }
    }

    private void solicitudNovedadDrvConvenioDerivationsDefault() {
        if (solicitudNovedadDrvConvenio != null) return;
        // Default derivation
        // EFFECT   : \"\"
        solicitudNovedadDrvConvenio = "";
    }

    /**
     * Computes the value of the <code>solicitudNovedadContraDrvIdentificacion</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicitudNovedadContraDrvIdentificacion</code> derived attribute.
     */
    public String solicitudNovedadContraDrvIdentificacionDerivations() {

        solicitudNovedadContraDrvIdentificacion = null;

        solicitudNovedadContraDrvIdentificacionDerivationsDefault();
        return solicitudNovedadContraDrvIdentificacion;
    }

    private void solicitudNovedadContraDrvIdentificacionDerivationsDefault() {
        if (solicitudNovedadContraDrvIdentificacion != null) return;
        // Default derivation
        // EFFECT   : fuconcatenarConNulos(\"\", TipoIdentContratante.NombreCorto) + fuconcatenarConNulos(\" \", ContraNumIden)
        solicitudNovedadContraDrvIdentificacion = userFunctionsSrv.fuconcatenarConNulosFun("", this.getTipoIdentContratante().getTipoIdentificacionNombreCorto()) + userFunctionsSrv.fuconcatenarConNulosFun(" ", this.getSolicitudNovedadContraNumIden());
    }

    /**
     * Computes the value of the <code>solicitudNovedadDrvGrupoAsociado</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicitudNovedadDrvGrupoAsociado</code> derived attribute.
     */
    public String solicitudNovedadDrvGrupoAsociadoDerivations() throws SystemException {

        solicitudNovedadDrvGrupoAsociado = null;

        solicitudNovedadDrvGrupoAsociadoDerivationsConditional1();
        solicitudNovedadDrvGrupoAsociadoDerivationsDefault();
        return solicitudNovedadDrvGrupoAsociado;
    }

    private void solicitudNovedadDrvGrupoAsociadoDerivationsConditional1() throws SystemException {
        if (solicitudNovedadDrvGrupoAsociado != null) return;
        // CONDITION: EXIST(GrupoAsociado) = TRUE
        // EFFECT   : GrupoAsociado.CodigoLegal + \" \" + GrupoAsociado.Descripcion
        boolean solicitudNovedadDrvGrupoAsociadoCond = getSolicitudNovedadRepository().assocOperator002(this).equals(true);
        if (solicitudNovedadDrvGrupoAsociadoCond) {
            solicitudNovedadDrvGrupoAsociado = this.getGrupoAsociado().getGrupoAsociadoCodigoLegal() + " " + this.getGrupoAsociado().getGrupoAsociadoDescripcion();
        }
    }

    private void solicitudNovedadDrvGrupoAsociadoDerivationsDefault() {
        if (solicitudNovedadDrvGrupoAsociado != null) return;
        // Default derivation
        // EFFECT   : \"\"
        solicitudNovedadDrvGrupoAsociado = "";
    }

    /**
     * Computes the value of the <code>solicitudNovedadDrvPeriodicidad</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicitudNovedadDrvPeriodicidad</code> derived attribute.
     */
    public String solicitudNovedadDrvPeriodicidadDerivations() throws SystemException {

        solicitudNovedadDrvPeriodicidad = null;

        solicitudNovedadDrvPeriodicidadDerivationsConditional1();
        solicitudNovedadDrvPeriodicidadDerivationsDefault();
        return solicitudNovedadDrvPeriodicidad;
    }

    private void solicitudNovedadDrvPeriodicidadDerivationsConditional1() throws SystemException {
        if (solicitudNovedadDrvPeriodicidad != null) return;
        // CONDITION: EXIST( Periodicidad ) = true
        // EFFECT   : IntToStr(Periodicidad.Codigo) + \" \" + Periodicidad.Descripcion
        boolean solicitudNovedadDrvPeriodicidadCond = getSolicitudNovedadRepository().assocOperator003(this).equals(true);
        if (solicitudNovedadDrvPeriodicidadCond) {
            solicitudNovedadDrvPeriodicidad = STDFunctions.intToStrFun(this.getPeriodicidad().getPeriodicidadCodigo()) + " " + this.getPeriodicidad().getPeriodicidadDescripcion();
        }
    }

    private void solicitudNovedadDrvPeriodicidadDerivationsDefault() {
        if (solicitudNovedadDrvPeriodicidad != null) return;
        // Default derivation
        // EFFECT   : \"\"
        solicitudNovedadDrvPeriodicidad = "";
    }

    /**
     * Computes the value of the <code>solicitudNovedadDrvPermiteAddFam</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicitudNovedadDrvPermiteAddFam</code> derived attribute.
     */
    public Boolean solicitudNovedadDrvPermiteAddFamDerivations() throws SystemException {

        solicitudNovedadDrvPermiteAddFam = null;

        solicitudNovedadDrvPermiteAddFamDerivationsConditional1();
        solicitudNovedadDrvPermiteAddFamDerivationsConditional2();
        solicitudNovedadDrvPermiteAddFamDerivationsDefault();
        return solicitudNovedadDrvPermiteAddFam;
    }

    private void solicitudNovedadDrvPermiteAddFamDerivationsConditional1() {
        if (solicitudNovedadDrvPermiteAddFam != null) return;
        // CONDITION: Novedad.VariasFamilias = TRUE AND CtrTipoContrato <> 1
        // EFFECT   : TRUE
        boolean solicitudNovedadDrvPermiteAddFamCond = this.getNovedad().getNovedadVariasFamilias().equals(true) && !(this.getSolicitudNovedadCtrTipoContrato()).equals(Long.valueOf(1));
        if (solicitudNovedadDrvPermiteAddFamCond) {
            solicitudNovedadDrvPermiteAddFam = Boolean.TRUE;
        }
    }

    private void solicitudNovedadDrvPermiteAddFamDerivationsConditional2() throws SystemException {
        if (solicitudNovedadDrvPermiteAddFam != null) return;
        // CONDITION: COUNT(Familias) = 0
        // EFFECT   : TRUE
        boolean solicitudNovedadDrvPermiteAddFamCond = (getSolicitudNovedadRepository().assocOperator004(this)).equals(Long.valueOf(0));
        if (solicitudNovedadDrvPermiteAddFamCond) {
            solicitudNovedadDrvPermiteAddFam = Boolean.TRUE;
        }
    }

    private void solicitudNovedadDrvPermiteAddFamDerivationsDefault() {
        if (solicitudNovedadDrvPermiteAddFam != null) return;
        // Default derivation
        // EFFECT   : FALSE
        solicitudNovedadDrvPermiteAddFam = Boolean.FALSE;
    }

    /**
     * Computes the value of the <code>solicitudNovedadDrvPermiteDelFam</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicitudNovedadDrvPermiteDelFam</code> derived attribute.
     */
    public Boolean solicitudNovedadDrvPermiteDelFamDerivations() throws SystemException {

        solicitudNovedadDrvPermiteDelFam = null;

        solicitudNovedadDrvPermiteDelFamDerivationsConditional1();
        solicitudNovedadDrvPermiteDelFamDerivationsDefault();
        return solicitudNovedadDrvPermiteDelFam;
    }

    private void solicitudNovedadDrvPermiteDelFamDerivationsConditional1() throws SystemException {
        if (solicitudNovedadDrvPermiteDelFam != null) return;
        // CONDITION: COUNT(Familias) = 0
        // EFFECT   : FALSE
        boolean solicitudNovedadDrvPermiteDelFamCond = (getSolicitudNovedadRepository().assocOperator005(this)).equals(Long.valueOf(0));
        if (solicitudNovedadDrvPermiteDelFamCond) {
            solicitudNovedadDrvPermiteDelFam = Boolean.FALSE;
        }
    }

    private void solicitudNovedadDrvPermiteDelFamDerivationsDefault() {
        if (solicitudNovedadDrvPermiteDelFam != null) return;
        // Default derivation
        // EFFECT   : DrvPermiteAddFam
        solicitudNovedadDrvPermiteDelFam = this.getSolicitudNovedadDrvPermiteAddFam();
    }

    /**
     * Computes the value of the <code>solicitudNovedadDrvExigeDocSolicitud</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicitudNovedadDrvExigeDocSolicitud</code> derived attribute.
     */
    public Boolean solicitudNovedadDrvExigeDocSolicitudDerivations() throws SystemException {

        solicitudNovedadDrvExigeDocSolicitud = null;

        solicitudNovedadDrvExigeDocSolicitudDerivationsConditional1();
        solicitudNovedadDrvExigeDocSolicitudDerivationsDefault();
        return solicitudNovedadDrvExigeDocSolicitud;
    }

    private void solicitudNovedadDrvExigeDocSolicitudDerivationsConditional1() throws SystemException {
        if (solicitudNovedadDrvExigeDocSolicitud != null) return;
        // CONDITION: EXIST(Causal) = TRUE
        // EFFECT   : Causal.ReqDocSolicitud
        boolean solicitudNovedadDrvExigeDocSolicitudCond = getSolicitudNovedadRepository().assocOperator006(this).equals(true);
        if (solicitudNovedadDrvExigeDocSolicitudCond) {
            solicitudNovedadDrvExigeDocSolicitud = this.getCausal().getCausalReqDocSolicitud();
        }
    }

    private void solicitudNovedadDrvExigeDocSolicitudDerivationsDefault() {
        if (solicitudNovedadDrvExigeDocSolicitud != null) return;
        // Default derivation
        // EFFECT   : Novedad.ReqDocSolicitud
        solicitudNovedadDrvExigeDocSolicitud = this.getNovedad().getNovedadReqDocSolicitud();
    }

    /**
     * Computes the value of the <code>solicitudNovedadDrvExigeDocPersona</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicitudNovedadDrvExigeDocPersona</code> derived attribute.
     */
    public Boolean solicitudNovedadDrvExigeDocPersonaDerivations() throws SystemException {

        solicitudNovedadDrvExigeDocPersona = null;

        solicitudNovedadDrvExigeDocPersonaDerivationsConditional1();
        solicitudNovedadDrvExigeDocPersonaDerivationsDefault();
        return solicitudNovedadDrvExigeDocPersona;
    }

    private void solicitudNovedadDrvExigeDocPersonaDerivationsConditional1() throws SystemException {
        if (solicitudNovedadDrvExigeDocPersona != null) return;
        // CONDITION: EXIST(Causal) = TRUE
        // EFFECT   : Causal.ReqDocPersona
        boolean solicitudNovedadDrvExigeDocPersonaCond = getSolicitudNovedadRepository().assocOperator007(this).equals(true);
        if (solicitudNovedadDrvExigeDocPersonaCond) {
            solicitudNovedadDrvExigeDocPersona = this.getCausal().getCausalReqDocPersona();
        }
    }

    private void solicitudNovedadDrvExigeDocPersonaDerivationsDefault() {
        if (solicitudNovedadDrvExigeDocPersona != null) return;
        // Default derivation
        // EFFECT   : Novedad.ReqDocPersona
        solicitudNovedadDrvExigeDocPersona = this.getNovedad().getNovedadReqDocPersona();
    }

    /**
     * Computes the value of the <code>solicitudNovedadDrvReportColOscuro</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicitudNovedadDrvReportColOscuro</code> derived attribute.
     */
    public String solicitudNovedadDrvReportColOscuroDerivations() throws SystemException {

        solicitudNovedadDrvReportColOscuro = null;

        solicitudNovedadDrvReportColOscuroDerivationsConditional1();
        solicitudNovedadDrvReportColOscuroDerivationsDefault();
        return solicitudNovedadDrvReportColOscuro;
    }

    private void solicitudNovedadDrvReportColOscuroDerivationsConditional1() throws SystemException {
        if (solicitudNovedadDrvReportColOscuro != null) return;
        // CONDITION: EXIST( PlanT.Dominios ) WHERE (PlanT.Dominios.ProductoT = PlanT.ProductoT AND PlanT.Dominios.SolNovColorOscuro <> NULL) = true
        // EFFECT   : GETONE( PlanT.Dominios.SolNovColorOscuro ) WHERE (PlanT.Dominios.ProductoT = PlanT.ProductoT AND PlanT.Dominios.SolNovColorOscuro <> NULL)
        boolean solicitudNovedadDrvReportColOscuroCond = getSolicitudNovedadRepository().assocOperator008(this).equals(true);
        if (solicitudNovedadDrvReportColOscuroCond) {
            solicitudNovedadDrvReportColOscuro = getSolicitudNovedadRepository().assocOperator009(this);
        }
    }

    private void solicitudNovedadDrvReportColOscuroDerivationsDefault() {
        if (solicitudNovedadDrvReportColOscuro != null) return;
        // Default derivation
        // EFFECT   : \"\"
        solicitudNovedadDrvReportColOscuro = "";
    }

    /**
     * Computes the value of the <code>solicitudNovedadDrvReportColClaro</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicitudNovedadDrvReportColClaro</code> derived attribute.
     */
    public String solicitudNovedadDrvReportColClaroDerivations() throws SystemException {

        solicitudNovedadDrvReportColClaro = null;

        solicitudNovedadDrvReportColClaroDerivationsConditional1();
        solicitudNovedadDrvReportColClaroDerivationsDefault();
        return solicitudNovedadDrvReportColClaro;
    }

    private void solicitudNovedadDrvReportColClaroDerivationsConditional1() throws SystemException {
        if (solicitudNovedadDrvReportColClaro != null) return;
        // CONDITION: EXIST( PlanT.Dominios ) WHERE (PlanT.Dominios.ProductoT = PlanT.ProductoT AND PlanT.Dominios.SolNovColorClaro <> NULL) = true
        // EFFECT   : GETONE( PlanT.Dominios.SolNovColorClaro ) WHERE (PlanT.Dominios.ProductoT = PlanT.ProductoT AND PlanT.Dominios.SolNovColorClaro <> NULL)
        boolean solicitudNovedadDrvReportColClaroCond = getSolicitudNovedadRepository().assocOperator010(this).equals(true);
        if (solicitudNovedadDrvReportColClaroCond) {
            solicitudNovedadDrvReportColClaro = getSolicitudNovedadRepository().assocOperator011(this);
        }
    }

    private void solicitudNovedadDrvReportColClaroDerivationsDefault() {
        if (solicitudNovedadDrvReportColClaro != null) return;
        // Default derivation
        // EFFECT   : \"\"
        solicitudNovedadDrvReportColClaro = "";
    }

    /**
     * Computes the value of the <code>solicitudNovedadDrvReportLogo</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicitudNovedadDrvReportLogo</code> derived attribute.
     */
    public String solicitudNovedadDrvReportLogoDerivations() throws SystemException {

        solicitudNovedadDrvReportLogo = null;

        solicitudNovedadDrvReportLogoDerivationsConditional1();
        solicitudNovedadDrvReportLogoDerivationsDefault();
        return solicitudNovedadDrvReportLogo;
    }

    private void solicitudNovedadDrvReportLogoDerivationsConditional1() throws SystemException {
        if (solicitudNovedadDrvReportLogo != null) return;
        // CONDITION: EXIST( PlanT.Dominios ) WHERE (PlanT.Dominios.ProductoT = PlanT.ProductoT AND PlanT.Dominios.SolNovLogo <> NULL) = true
        // EFFECT   : GETONE( PlanT.Dominios.SolNovLogo ) WHERE (PlanT.Dominios.ProductoT = PlanT.ProductoT AND PlanT.Dominios.SolNovLogo <> NULL)
        boolean solicitudNovedadDrvReportLogoCond = getSolicitudNovedadRepository().assocOperator012(this).equals(true);
        if (solicitudNovedadDrvReportLogoCond) {
            solicitudNovedadDrvReportLogo = getSolicitudNovedadRepository().assocOperator013(this);
        }
    }

    private void solicitudNovedadDrvReportLogoDerivationsDefault() {
        if (solicitudNovedadDrvReportLogo != null) return;
        // Default derivation
        // EFFECT   : \"\"
        solicitudNovedadDrvReportLogo = "";
    }

    /**
     * Computes the value of the <code>solicitudNovedadDrvNuevaPeriodicidad</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicitudNovedadDrvNuevaPeriodicidad</code> derived attribute.
     */
    public String solicitudNovedadDrvNuevaPeriodicidadDerivations() throws SystemException {

        solicitudNovedadDrvNuevaPeriodicidad = null;

        solicitudNovedadDrvNuevaPeriodicidadDerivationsConditional1();
        solicitudNovedadDrvNuevaPeriodicidadDerivationsDefault();
        return solicitudNovedadDrvNuevaPeriodicidad;
    }

    private void solicitudNovedadDrvNuevaPeriodicidadDerivationsConditional1() throws SystemException {
        if (solicitudNovedadDrvNuevaPeriodicidad != null) return;
        // CONDITION: EXIST( PeriodicidadNueva ) = true
        // EFFECT   : IntToStr(PeriodicidadNueva.Codigo) + \" \" + PeriodicidadNueva.Descripcion
        boolean solicitudNovedadDrvNuevaPeriodicidadCond = getSolicitudNovedadRepository().assocOperator014(this).equals(true);
        if (solicitudNovedadDrvNuevaPeriodicidadCond) {
            solicitudNovedadDrvNuevaPeriodicidad = STDFunctions.intToStrFun(this.getPeriodicidadNueva().getPeriodicidadCodigo()) + " " + this.getPeriodicidadNueva().getPeriodicidadDescripcion();
        }
    }

    private void solicitudNovedadDrvNuevaPeriodicidadDerivationsDefault() {
        if (solicitudNovedadDrvNuevaPeriodicidad != null) return;
        // Default derivation
        // EFFECT   : \"\"
        solicitudNovedadDrvNuevaPeriodicidad = "";
    }

    /**
     * Computes the value of the <code>solicitudNovedaddrvSemaforoGrabAse</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicitudNovedaddrvSemaforoGrabAse</code> derived attribute.
     */
    public Double solicitudNovedaddrvSemaforoGrabAseDerivations() {

        solicitudNovedaddrvSemaforoGrabAse = null;

        solicitudNovedaddrvSemaforoGrabAseDerivationsConditional1();
        solicitudNovedaddrvSemaforoGrabAseDerivationsDefault();
        return solicitudNovedaddrvSemaforoGrabAse;
    }

    private void solicitudNovedaddrvSemaforoGrabAseDerivationsConditional1() {
        if (solicitudNovedaddrvSemaforoGrabAse != null) return;
        // CONDITION: FechaTerminada <> NULL
        // EFFECT   : SemaforoGrabAse
        boolean solicitudNovedaddrvSemaforoGrabAseCond = this.getSolicitudNovedadFechaTerminada() != null;
        if (solicitudNovedaddrvSemaforoGrabAseCond) {
            solicitudNovedaddrvSemaforoGrabAse = this.getSolicitudNovedadSemaforoGrabAse();
        }
    }

    private void solicitudNovedaddrvSemaforoGrabAseDerivationsDefault() {
        if (solicitudNovedaddrvSemaforoGrabAse != null) return;
        // Default derivation
        // EFFECT   : fuCallSPgetsemaforograbadornov(Id)
        solicitudNovedaddrvSemaforoGrabAse = userFunctionsSrv.fuCallSPgetsemaforograbadornovFun(this.getSolicitudNovedadId());
    }

    /**
     * Computes the value of the <code>solicitudNovedadDrvNumRadicadoStr</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicitudNovedadDrvNumRadicadoStr</code> derived attribute.
     */
    public String solicitudNovedadDrvNumRadicadoStrDerivations() {

        solicitudNovedadDrvNumRadicadoStr = null;

        solicitudNovedadDrvNumRadicadoStrDerivationsDefault();
        return solicitudNovedadDrvNumRadicadoStr;
    }

    private void solicitudNovedadDrvNumRadicadoStrDerivationsDefault() {
        if (solicitudNovedadDrvNumRadicadoStr != null) return;
        // Default derivation
        // EFFECT   : IntToStr( NumRadicado)
        solicitudNovedadDrvNumRadicadoStr = STDFunctions.intToStrFun(this.getSolicitudNovedadNumRadicado());
    }

    /**
     * Computes the value of the <code>solicitudNovedadDrvValidarPS1</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicitudNovedadDrvValidarPS1</code> derived attribute.
     */
    public Boolean solicitudNovedadDrvValidarPS1Derivations() {

        solicitudNovedadDrvValidarPS1 = null;

        solicitudNovedadDrvValidarPS1DerivationsConditional1();
        solicitudNovedadDrvValidarPS1DerivationsConditional2();
        solicitudNovedadDrvValidarPS1DerivationsDefault();
        return solicitudNovedadDrvValidarPS1;
    }

    private void solicitudNovedadDrvValidarPS1DerivationsConditional1() {
        if (solicitudNovedadDrvValidarPS1 != null) return;
        // CONDITION: Novedad.AliasNovedad <> \"PS\" 
        // EFFECT   : TRUE
        boolean solicitudNovedadDrvValidarPS1Cond = !(this.getNovedad().getNovedadAliasNovedad()).equals("PS");
        if (solicitudNovedadDrvValidarPS1Cond) {
            solicitudNovedadDrvValidarPS1 = Boolean.TRUE;
        }
    }

    private void solicitudNovedadDrvValidarPS1DerivationsConditional2() {
        if (solicitudNovedadDrvValidarPS1 != null) return;
        // CONDITION: CtrTagCausaExclusion <> NULL
        // EFFECT   : TRUE
        boolean solicitudNovedadDrvValidarPS1Cond = this.getSolicitudNovedadCtrTagCausaExclusion() != null;
        if (solicitudNovedadDrvValidarPS1Cond) {
            solicitudNovedadDrvValidarPS1 = Boolean.TRUE;
        }
    }

    private void solicitudNovedadDrvValidarPS1DerivationsDefault() {
        if (solicitudNovedadDrvValidarPS1 != null) return;
        // Default derivation
        // EFFECT   : FALSE
        solicitudNovedadDrvValidarPS1 = Boolean.FALSE;
    }

    /**
     * Computes the value of the <code>solicitudNovedadDrvValidarPS2</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicitudNovedadDrvValidarPS2</code> derived attribute.
     */
    public Boolean solicitudNovedadDrvValidarPS2Derivations() throws SystemException {

        solicitudNovedadDrvValidarPS2 = null;

        solicitudNovedadDrvValidarPS2DerivationsConditional1();
        solicitudNovedadDrvValidarPS2DerivationsDefault();
        return solicitudNovedadDrvValidarPS2;
    }

    private void solicitudNovedadDrvValidarPS2DerivationsConditional1() throws SystemException {
        if (solicitudNovedadDrvValidarPS2 != null) return;
        // CONDITION: EXIST(Novedad.TipoNovedad.Novedades.CausasExclusion)  WHERE  (  Novedad.TipoNovedad.Novedades.CausasExclusion.Novedad.AliasNovedad  = fugetValorParametroConf( \"SOLNOVSUSVIAJE\" )   AND   Novedad.TipoNovedad.Novedades.CausasExclusion.Descripcion = CtrTagCausaExclusion)  = TRUE 
        // EFFECT   : TRUE
        boolean solicitudNovedadDrvValidarPS2Cond = getSolicitudNovedadRepository().assocOperator015(this).equals(true);
        if (solicitudNovedadDrvValidarPS2Cond) {
            solicitudNovedadDrvValidarPS2 = Boolean.TRUE;
        }
    }

    private void solicitudNovedadDrvValidarPS2DerivationsDefault() {
        if (solicitudNovedadDrvValidarPS2 != null) return;
        // Default derivation
        // EFFECT   : FALSE
        solicitudNovedadDrvValidarPS2 = Boolean.FALSE;
    }
    /**
     * This method initializes the properties of the entity and its relations.
     */
    private void initAttributes() {
        solicitudNovedadNumRadicado = Long.valueOf(0);
        solicitudNovedadFechaCreacion = Date.valueOf(Constants.DATE_DEFAULTVALUE);
        solicitudNovedadFechaVigencia = Date.valueOf(Constants.DATE_DEFAULTVALUE);
        solicitudNovedadNumContrato = "";
        solicitudNovedadExcepcion = false;
        solicitudNovedadFechaIniExcepcion = null;
        solicitudNovedadFechaFinExcepcion = null;
        solicitudNovedadCtrCodigoTarifa = null;
        solicitudNovedadCtrDescTarifa = null;
        solicitudNovedadCtrCodigoConvenio = null;
        solicitudNovedadCtrDescConvenio = null;
        solicitudNovedadCtrEsColectivo = false;
        solicitudNovedadCtrTagCausaExclusion = null;
        solicitudNovedadContraNumIden = null;
        solicitudNovedadContraPrimerNombre = null;
        solicitudNovedadContraSegundoNombre = null;
        solicitudNovedadContraPrimerApellido = null;
        solicitudNovedadContraSegundoApellido = null;
        solicitudNovedadContraRazonSocial = null;
        solicitudNovedadFechaUltimoDoc = null;
        solicitudNovedadObservacions = null;
        solicitudNovedadEstado = null;
        solicitudNovedadEstadoDocumentacion = null;
        solicitudNovedadCompletada = false;
        solicitudNovedadFechaCompletada = null;
        solicitudNovedadCtrActivo = false;
        solicitudNovedadCtrTipoContrato = null;
        solicitudNovedadSCNumMeses = null;
        solicitudNovedadContraNuevaRazonSocial = null;
        solicitudNovedadContraTipoPersona = null;
        solicitudNovedadCtrFInicioContrato = null;
        solicitudNovedadPrioridad = Long.valueOf(0);
        solicitudNovedadFechaTerminada = null;
        solicitudNovedadFechaFUG = null;
        solicitudNovedadFechaFA = null;
        solicitudNovedadSemaforoGrabAse = null;
        familias = null;
        documentos = null;
        logEstados = null;
        logUsrSolNov = null;
        planT = null;
        novedad = null;
        causal = null;
        proteccionDatos = null;
        tipoIdentContratante = null;
        estadoContrato = null;
        grupoAsociado = null;
        periodicidad = null;
        agente = null;
        periodicidadNueva = null;
        motivoExcepcion = null;
        usrAfiliacion = null;
        firma = null;
        values = new HashMap<>();
        userFunctionsSrv = Arc.container().select(UserFunctions.class).get();

        clearModifiedFlags();
    }

    public SolicitudNovedadJpaRepository getSolicitudNovedadRepository() {
        return Arc.container().select(SolicitudNovedadJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return SolicitudNovedad.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return SolicitudNovedadConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedSolicitudNovedadNumRadicado = false;
    	values.put("solicitudNovedadNumRadicado", getSolicitudNovedadNumRadicado());
    	modifiedSolicitudNovedadFechaCreacion = false;
    	values.put("solicitudNovedadFechaCreacion", getSolicitudNovedadFechaCreacion());
    	modifiedSolicitudNovedadFechaVigencia = false;
    	values.put("solicitudNovedadFechaVigencia", getSolicitudNovedadFechaVigencia());
    	modifiedSolicitudNovedadNumContrato = false;
    	values.put("solicitudNovedadNumContrato", getSolicitudNovedadNumContrato());
    	modifiedSolicitudNovedadExcepcion = false;
    	values.put("solicitudNovedadExcepcion", getSolicitudNovedadExcepcion());
    	modifiedSolicitudNovedadFechaIniExcepcion = false;
    	values.put("solicitudNovedadFechaIniExcepcion", getSolicitudNovedadFechaIniExcepcion());
    	modifiedSolicitudNovedadFechaFinExcepcion = false;
    	values.put("solicitudNovedadFechaFinExcepcion", getSolicitudNovedadFechaFinExcepcion());
    	modifiedSolicitudNovedadCtrCodigoTarifa = false;
    	values.put("solicitudNovedadCtrCodigoTarifa", getSolicitudNovedadCtrCodigoTarifa());
    	modifiedSolicitudNovedadCtrDescTarifa = false;
    	values.put("solicitudNovedadCtrDescTarifa", getSolicitudNovedadCtrDescTarifa());
    	modifiedSolicitudNovedadCtrCodigoConvenio = false;
    	values.put("solicitudNovedadCtrCodigoConvenio", getSolicitudNovedadCtrCodigoConvenio());
    	modifiedSolicitudNovedadCtrDescConvenio = false;
    	values.put("solicitudNovedadCtrDescConvenio", getSolicitudNovedadCtrDescConvenio());
    	modifiedSolicitudNovedadCtrEsColectivo = false;
    	values.put("solicitudNovedadCtrEsColectivo", getSolicitudNovedadCtrEsColectivo());
    	modifiedSolicitudNovedadCtrTagCausaExclusion = false;
    	values.put("solicitudNovedadCtrTagCausaExclusion", getSolicitudNovedadCtrTagCausaExclusion());
    	modifiedSolicitudNovedadContraNumIden = false;
    	values.put("solicitudNovedadContraNumIden", getSolicitudNovedadContraNumIden());
    	modifiedSolicitudNovedadContraPrimerNombre = false;
    	values.put("solicitudNovedadContraPrimerNombre", getSolicitudNovedadContraPrimerNombre());
    	modifiedSolicitudNovedadContraSegundoNombre = false;
    	values.put("solicitudNovedadContraSegundoNombre", getSolicitudNovedadContraSegundoNombre());
    	modifiedSolicitudNovedadContraPrimerApellido = false;
    	values.put("solicitudNovedadContraPrimerApellido", getSolicitudNovedadContraPrimerApellido());
    	modifiedSolicitudNovedadContraSegundoApellido = false;
    	values.put("solicitudNovedadContraSegundoApellido", getSolicitudNovedadContraSegundoApellido());
    	modifiedSolicitudNovedadContraRazonSocial = false;
    	values.put("solicitudNovedadContraRazonSocial", getSolicitudNovedadContraRazonSocial());
    	modifiedSolicitudNovedadFechaUltimoDoc = false;
    	values.put("solicitudNovedadFechaUltimoDoc", getSolicitudNovedadFechaUltimoDoc());
    	modifiedSolicitudNovedadObservacions = false;
    	values.put("solicitudNovedadObservacions", getSolicitudNovedadObservacions());
    	modifiedSolicitudNovedadEstado = false;
    	values.put("solicitudNovedadEstado", getSolicitudNovedadEstado());
    	modifiedSolicitudNovedadEstadoDocumentacion = false;
    	values.put("solicitudNovedadEstadoDocumentacion", getSolicitudNovedadEstadoDocumentacion());
    	modifiedSolicitudNovedadCompletada = false;
    	values.put("solicitudNovedadCompletada", getSolicitudNovedadCompletada());
    	modifiedSolicitudNovedadFechaCompletada = false;
    	values.put("solicitudNovedadFechaCompletada", getSolicitudNovedadFechaCompletada());
    	modifiedSolicitudNovedadCtrActivo = false;
    	values.put("solicitudNovedadCtrActivo", getSolicitudNovedadCtrActivo());
    	modifiedSolicitudNovedadCtrTipoContrato = false;
    	values.put("solicitudNovedadCtrTipoContrato", getSolicitudNovedadCtrTipoContrato());
    	modifiedSolicitudNovedadSCNumMeses = false;
    	values.put("solicitudNovedadSCNumMeses", getSolicitudNovedadSCNumMeses());
    	modifiedSolicitudNovedadContraNuevaRazonSocial = false;
    	values.put("solicitudNovedadContraNuevaRazonSocial", getSolicitudNovedadContraNuevaRazonSocial());
    	modifiedSolicitudNovedadContraTipoPersona = false;
    	values.put("solicitudNovedadContraTipoPersona", getSolicitudNovedadContraTipoPersona());
    	modifiedSolicitudNovedadCtrFInicioContrato = false;
    	values.put("solicitudNovedadCtrFInicioContrato", getSolicitudNovedadCtrFInicioContrato());
    	modifiedSolicitudNovedadPrioridad = false;
    	values.put("solicitudNovedadPrioridad", getSolicitudNovedadPrioridad());
    	modifiedSolicitudNovedadFechaTerminada = false;
    	values.put("solicitudNovedadFechaTerminada", getSolicitudNovedadFechaTerminada());
    	modifiedSolicitudNovedadFechaFUG = false;
    	values.put("solicitudNovedadFechaFUG", getSolicitudNovedadFechaFUG());
    	modifiedSolicitudNovedadFechaFA = false;
    	values.put("solicitudNovedadFechaFA", getSolicitudNovedadFechaFA());
    	modifiedSolicitudNovedadSemaforoGrabAse = false;
    	values.put("solicitudNovedadSemaforoGrabAse", getSolicitudNovedadSemaforoGrabAse());
    	modifiedFamilias = false;
    	modifiedDocumentos = false;
    	modifiedLogEstados = false;
    	modifiedLogUsrSolNov = false;
    	modifiedPlanT = false;
    	modifiedNovedad = false;
    	modifiedCausal = false;
    	modifiedProteccionDatos = false;
    	modifiedTipoIdentContratante = false;
    	modifiedEstadoContrato = false;
    	modifiedGrupoAsociado = false;
    	modifiedPeriodicidad = false;
    	modifiedAgente = false;
    	modifiedPeriodicidadNueva = false;
    	modifiedMotivoExcepcion = false;
    	modifiedUsrAfiliacion = false;
    	modifiedFirma = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
            solicitudNovedadDrvExigeContratoActivo = null;
            solicitudNovedadDrvExigeFamiliaActiva = null;
            solicitudNovedadContraDrvNombreCompleto = null;
            solicitudNovedadDrvTarifa = null;
            solicitudNovedadDrvConvenio = null;
            solicitudNovedadContraDrvIdentificacion = null;
            solicitudNovedadDrvGrupoAsociado = null;
            solicitudNovedadDrvPeriodicidad = null;
            solicitudNovedadDrvPermiteAddFam = null;
            solicitudNovedadDrvPermiteDelFam = null;
            solicitudNovedadDrvExigeDocSolicitud = null;
            solicitudNovedadDrvExigeDocPersona = null;
            solicitudNovedadDrvReportColOscuro = null;
            solicitudNovedadDrvReportColClaro = null;
            solicitudNovedadDrvReportLogo = null;
            solicitudNovedadDrvNuevaPeriodicidad = null;
            solicitudNovedaddrvSemaforoGrabAse = null;
            solicitudNovedadDrvNumRadicadoStr = null;
            solicitudNovedadDrvValidarPS1 = null;
            solicitudNovedadDrvValidarPS2 = null;
    }

    /**
     * Returns the <code>SolicitudNovedadOid</code> object that identifies this instance of <code>SolicitudNovedad</code>.
     * @return <code>SolicitudNovedadOid </code> object that identifies this instance of <code>SolicitudNovedad</code>
     */
	@Override
    public SolicitudNovedadOid getOid() {
        return new SolicitudNovedadOid(getSolicitudNovedadId());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(SolicitudNovedadConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(SolicitudNovedadConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.SOLICITUDNOVEDAD)) {
            // Add this class
            activeFacets.add(Constants.SOLICITUDNOVEDAD);
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
            returnValue = true;
        }
        if (getAgent().isFacetActive(Constants.AGENT_AFILIACIONES)) {
            returnValue = true;
        }
        if (getAgent().isFacetActive(Constants.FUNCIONARIO) || getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.AREAMEDICA) || getAgent().isFacetActive(Constants.RESPREGIONAL) || getAgent().isFacetActive(Constants.GESTOR) || getAgent().isFacetActive(Constants.MESADEAPOYO)) {
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
            relatedInstance = buildSolicitudNovedadRelatedInstance(relatedInstanceJsonOid);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_FAMILIAS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4FamiliaNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_DOCUMENTOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4DocumentoNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_LOGESTADOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4LogEstadoSN(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_LOGUSRSOLNOV.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4LogUsrSolNov(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_PLANT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4Planes(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_NOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4Novedad(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_CAUSAL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4Causal(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_PROTECCIONDATOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4ProteccionDatos(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_TIPOIDENTCONTRATANTE.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4TipoIdentificacion(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_ESTADOCONTRATO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4EstadoContrato(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_GRUPOASOCIADO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4GrupoAsociado(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_PERIODICIDAD.equalsIgnoreCase(relatedInstancePathFirstItem) || SolicitudNovedadConstants.ROLE_NAME_PERIODICIDADNUEVA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4Periodicidad(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_AGENTE.equalsIgnoreCase(relatedInstancePathFirstItem) || SolicitudNovedadConstants.ROLE_NAME_USRAFILIACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4Funcionario(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_MOTIVOEXCEPCION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4MotivoExcepcionSolNov(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_FIRMA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4Firma(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4FamiliaNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new FamiliaNovedad(mapper.readValue(relatedInstanceJsonOid, FamiliaNovedadOid.class)): FamiliaNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4DocumentoNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DocumentoNovedad(mapper.readValue(relatedInstanceJsonOid, DocumentoNovedadOid.class)): DocumentoNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4LogEstadoSN(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new LogEstadoSN(mapper.readValue(relatedInstanceJsonOid, LogEstadoSNOid.class)): LogEstadoSN.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4LogUsrSolNov(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new LogUsrSolNov(mapper.readValue(relatedInstanceJsonOid, LogUsrSolNovOid.class)): LogUsrSolNov.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4Planes(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Planes(mapper.readValue(relatedInstanceJsonOid, PlanesOid.class)): Planes.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4Novedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Novedad(mapper.readValue(relatedInstanceJsonOid, NovedadOid.class)): Novedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4Causal(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Causal(mapper.readValue(relatedInstanceJsonOid, CausalOid.class)): Causal.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4ProteccionDatos(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ProteccionDatos(mapper.readValue(relatedInstanceJsonOid, ProteccionDatosOid.class)): ProteccionDatos.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4TipoIdentificacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class)): TipoIdentificacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4EstadoContrato(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new EstadoContrato(mapper.readValue(relatedInstanceJsonOid, EstadoContratoOid.class)): EstadoContrato.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4GrupoAsociado(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new GrupoAsociado(mapper.readValue(relatedInstanceJsonOid, GrupoAsociadoOid.class)): GrupoAsociado.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4Periodicidad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Periodicidad(mapper.readValue(relatedInstanceJsonOid, PeriodicidadOid.class)): Periodicidad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4Funcionario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Funcionario(mapper.readValue(relatedInstanceJsonOid, FuncionarioOid.class)): Funcionario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4MotivoExcepcionSolNov(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new MotivoExcepcionSolNov(mapper.readValue(relatedInstanceJsonOid, MotivoExcepcionSolNovOid.class)): MotivoExcepcionSolNov.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4Firma(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Firma(mapper.readValue(relatedInstanceJsonOid, FirmaOid.class)): Firma.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
