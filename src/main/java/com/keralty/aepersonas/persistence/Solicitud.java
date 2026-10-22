package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.AesolicitudesConstants;
import com.keralty.aepersonas.global.AreaMedicaConstants;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.ContratoCConstants;
import com.keralty.aepersonas.global.FormaPagoConstants;
import com.keralty.aepersonas.global.FuncionarioConstants;
import com.keralty.aepersonas.global.GrupoAsociadoConstants;
import com.keralty.aepersonas.global.PeriodicidadConstants;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.global.STDFunctions;
import com.keralty.aepersonas.global.TipoFacturaConstants;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.persistence.oid.AesolicitudesOid;
import com.keralty.aepersonas.persistence.oid.AreaMedicaOid;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;
import com.keralty.aepersonas.persistence.oid.ContratoCOid;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.DocumentoGOid;
import com.keralty.aepersonas.persistence.oid.ErrorWSOid;
import com.keralty.aepersonas.persistence.oid.FirmaOid;
import com.keralty.aepersonas.persistence.oid.FormaPagoOid;
import com.keralty.aepersonas.persistence.oid.FuncionarioOid;
import com.keralty.aepersonas.persistence.oid.GrupoAsociadoOid;
import com.keralty.aepersonas.persistence.oid.LogAsignacionesOid;
import com.keralty.aepersonas.persistence.oid.LogEstadoOid;
import com.keralty.aepersonas.persistence.oid.PeriodicidadOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.ProteccionDatosOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.oid.TipoFacturaOid;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.oid.UsuarioRegOid;
import com.keralty.aepersonas.repository.AreaMedicaJpaRepository;
import com.keralty.aepersonas.repository.ContratanteJpaRepository;
import com.keralty.aepersonas.repository.DireccionJpaRepository;
import com.keralty.aepersonas.repository.DocumentoGJpaRepository;
import com.keralty.aepersonas.repository.FuncionarioJpaRepository;
import com.keralty.aepersonas.repository.LogAsignacionesJpaRepository;
import com.keralty.aepersonas.repository.LogEstadoJpaRepository;
import com.keralty.aepersonas.repository.PeriodicidadJpaRepository;
import com.keralty.aepersonas.repository.PersonaJpaRepository;
import com.keralty.aepersonas.repository.SolicitudJpaRepository;
import com.keralty.aepersonas.repository.TitularJpaRepository;
import com.keralty.aepersonas.repository.UsuarioJpaRepository;
import com.keralty.aepersonas.repository.UsuarioRegJpaRepository;
import com.keralty.aepersonas.service.AesolicitudesService;
import com.keralty.aepersonas.service.ContratoCService;
import com.keralty.aepersonas.service.GrupoAsociadoService;
import com.keralty.aepersonas.utils.Utilities;
import io.quarkus.arc.Arc;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
import org.eclipse.microprofile.rest.client.inject.RestClient;
/**
 * Persistent representation of the <code>Solicitud</code> model class.
 * <p>
 * Model Class: <code>Solicitud</code><br>
 */
@Entity(name = SolicitudConstants.CLASS_NAME)
@Table(name = SolicitudConstants.TBL_NAME)
public class Solicitud extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private transient SolicitudJpaRepository solicitudRepository;

    @JsonIgnore
    private transient DireccionJpaRepository direccionRepository;

    @JsonIgnore
    private transient UsuarioJpaRepository usuarioRepository;

    @JsonIgnore
    private transient ContratanteJpaRepository contratanteRepository;

    @JsonIgnore
    private transient UsuarioRegJpaRepository usuarioRegRepository;

    @JsonIgnore
    private transient TitularJpaRepository titularRepository;

    @JsonIgnore
    private transient DocumentoGJpaRepository documentoGRepository;

    @JsonIgnore
    private transient LogEstadoJpaRepository logEstadoRepository;

    @JsonIgnore
    private transient LogAsignacionesJpaRepository logAsignacionesRepository;

    @RestClient
    private transient AesolicitudesService aesolicitudesService;

    @JsonIgnore
    private transient PersonaJpaRepository personaRepository;

    @RestClient
    private transient GrupoAsociadoService grupoAsociadoService;

    @JsonIgnore
    private transient FuncionarioJpaRepository funcionarioRepository;


    @JsonIgnore
    private transient PeriodicidadJpaRepository periodicidadRepository;

    @RestClient
    private transient ContratoCService contratoCService;

    @JsonIgnore
    private transient AreaMedicaJpaRepository areaMedicaRepository;


    private transient UserFunctions userFunctionsSrv;

    /** Class identification function. */
    @Id
    @Column(name = SolicitudConstants.FLD_AESOLICITUDESIDSOLICITUD, insertable = false, updatable = false )
    @JsonProperty(value="id_solicitud")
    private Long aesolicitudesidsolicitud;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDNUMRADICADO )
    @JsonProperty(value="numradicado")
    private Long solicitudNumRadicado;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNumRadicado;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDTRAMITE )
    @JsonProperty(value="tramite")
    private Long solicitudTramite;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudTramite;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDNUMCONTRATO )
    @JsonProperty(value="numcontrato")
    private String solicitudNumContrato;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNumContrato;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDFINICIOCONTRATO )
    @JsonProperty(value="finiciocontrato")
    private Date solicitudFInicioContrato;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudFInicioContrato;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDESTRASLADO )
    @JsonProperty(value="estraslado")
    private Boolean solicitudEsTraslado;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudEsTraslado;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvreqcuesmed")
    protected Boolean solicituddrvReqCuesMed;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDTIPOCONTRATO )
    @JsonProperty(value="tipocontrato")
    private Long solicitudtipoContrato;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudtipoContrato;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDCODIGOSUCURSALRAD )
    @JsonProperty(value="codigosucursalrad")
    private String solicitudcodigoSucursalRad;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudcodigoSucursalRad;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDCONTRATOCONFIRMA )
    @JsonProperty(value="contratoconfirma")
    private Boolean solicitudcontratoConFirma;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudcontratoConFirma;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDOBSERVACIONS )
    @JsonProperty(value="observacions")
    private String solicitudobservacions;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudobservacions;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDEXENTOIVA )
    @JsonProperty(value="exentoiva")
    private String solicitudexentoIVA;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudexentoIVA;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvyatienecontratante")
    protected Boolean solicituddrvYaTieneContratante;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvtitularconbeneficios")
    protected Boolean solicituddrvTitularConBeneficios;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDVALORCUOTA )
    @JsonProperty(value="valorcuota")
    private Double solicitudvalorCuota;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudvalorCuota;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDVALORDTOCOMERCIALSIM )
    @JsonProperty(value="valordtocomercialsim")
    private Double solicitudvalorDtoComercialSim;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudvalorDtoComercialSim;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDVALORCUOTAINSCRIP )
    @JsonProperty(value="valorcuotainscrip")
    private Double solicitudValorCuotaInscrip;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudValorCuotaInscrip;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvsubtotal")
    protected Double solicituddrvSubtotal;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDVALORDTOFINANCIERO )
    @JsonProperty(value="valordtofinanciero")
    private Double solicitudValorDtoFinanciero;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudValorDtoFinanciero;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDVALORDTOCOMERCIAL )
    @JsonProperty(value="valordtocomercial")
    private Double solicitudValorDtoComercial;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudValorDtoComercial;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvbasegrabable")
    protected Double solicituddrvBaseGrabable;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvporceniva")
    protected Double solicituddrvPorcenIVA;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drviva")
    protected Double solicituddrvIVA;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvtotal")
    protected Double solicituddrvTotal;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDDATOSPAGOOK )
    @JsonProperty(value="datospagook")
    private Boolean solicituddatosPagoOK;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicituddatosPagoOK;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDVALORCUOTAPERIODOC )
    @JsonProperty(value="valorcuotaperiodoc")
    private Double solicitudvalorCuotaPeriodoC;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudvalorCuotaPeriodoC;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDDESCUENTOCOMERCIALC )
    @JsonProperty(value="descuentocomercialc")
    private Double solicituddescuentoComercialC;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicituddescuentoComercialC;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDIVAC )
    @JsonProperty(value="ivac")
    private Double solicitudIVAC;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudIVAC;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDDESCUENTOFINANCIEROC )
    @JsonProperty(value="descuentofinancieroc")
    private Double solicituddescuentoFinancieroC;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicituddescuentoFinancieroC;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDTIENEDIFLIQUIDACION )
    @JsonProperty(value="tienedifliquidacion")
    private Boolean solicitudTieneDifLiquidacion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudTieneDifLiquidacion;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDUSUARIOSVALIDADOS )
    @JsonProperty(value="usuariosvalidados")
    private Boolean solicitudUsuariosValidados;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudUsuariosValidados;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvcuesmedok")
    protected Boolean solicituddrvCuesMedOK;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDNUMCONTRATOINCLUSION )
    @JsonProperty(value="numcontratoinclusion")
    private String solicitudNumContratoInclusion;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNumContratoInclusion;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDNUMFAMILIA )
    @JsonProperty(value="numfamilia")
    private String solicitudNumFamilia;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudNumFamilia;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvyatienetitular")
    protected Boolean solicituddrvYaTieneTitular;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvdifvalorcuota")
    protected Double solicituddrvDifValorCuota;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvdifvalordtofinanciero")
    protected Double solicituddrvDifValorDtoFinanciero;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvdifvaloriva")
    protected Double solicituddrvDifValorIVA;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvhaypreexistencias")
    protected Boolean solicituddrvHayPreexistencias;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvcontratolegalizado")
    protected Boolean solicituddrvContratoLegalizado;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvtienesegundafirma")
    protected Boolean solicituddrvTieneSegundaFirma;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvgrupoasociado")
    protected String solicituddrvGrupoAsociado;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvaplicadoccontrato")
    protected Boolean solicituddrvAplicaDocContrato;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvaplicadoccartapree")
    protected Boolean solicituddrvAplicaDocCartaPree;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvaplicadocbbgestante")
    protected Boolean solicituddrvAplicaDocBBGestante;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvaplicadocmaternidad")
    protected Boolean solicituddrvAplicaDocMaternidad;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvaplicacuestionario")
    protected Boolean solicituddrvAplicaCuestionario;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvaplicacartaent")
    protected Boolean solicituddrvAplicaCartaEnt;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDEMAILURLPAGOENVIADO )
    @JsonProperty(value="emailurlpagoenviado")
    private String solicitudEmailURLPagoEnviado;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudEmailURLPagoEnviado;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDEMAILDOCUENVIADO )
    @JsonProperty(value="emaildocuenviado")
    private String solicitudEmailDocuEnviado;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudEmailDocuEnviado;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDDOCSENVIADOS )
    @JsonProperty(value="docsenviados")
    private Boolean solicitudDocsEnviados;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudDocsEnviados;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvtotalconanexos")
    protected Double solicituddrvTotalConAnexos;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvcontratanteestitular")
    protected Boolean solicituddrvContratanteEsTitular;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvalgunbeneficiarioepssanitas")
    protected Boolean solicituddrvAlgunBeneficiarioEPSSanitas;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDCODDIRECTOR )
    @JsonProperty(value="coddirector")
    private String solicitudcodDirector;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudcodDirector;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvlistaerrores")
    protected String solicituddrvListaErrores;

    @Transient
    @JsonIgnore
    public boolean solicituddrvListaErroresInit = false;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDVALORCUOTABRUTAC )
    @JsonProperty(value="valorcuotabrutac")
    private Double solicitudvalorCuotaBrutaC;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudvalorCuotaBrutaC;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvdifvalorcuotabruta")
    protected Double solicituddrvDifValorCuotaBruta;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvnumtitulares")
    protected Long solicituddrvNumTitulares;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvenviaremaildoc")
    protected Boolean solicituddrvEnviarEmailDoc;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvaplicadocneonatal")
    protected Boolean solicituddrvAplicaDocNeonatal;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDCODTARIFA )
    @JsonProperty(value="codtarifa")
    private String solicitudCodTarifa;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudCodTarifa;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvaplicacarnets")
    protected Boolean solicituddrvAplicaCarnets;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvaplicadocsolicitud")
    protected Boolean solicituddrvAplicaDocSolicitud;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvpuedereplicar")
    protected Boolean solicituddrvPuedeReplicar;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDCOMPLETADA )
    @JsonProperty(value="completada")
    private Boolean solicitudCompletada;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudCompletada;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvcambiarbenefcont")
    protected Boolean solicituddrvCambiarBenefCont;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDESTADO )
    @JsonProperty(value="estado")
    private Long solicitudEstado;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudEstado;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvedadtitular")
    protected Long solicituddrvEdadTitular;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvgenerotitular")
    protected String solicituddrvGeneroTitular;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvtienetitular")
    protected Boolean solicituddrvTieneTitular;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvobservacionesreport")
    protected String solicituddrvObservacionesReport;

    @Transient
    @JsonIgnore
    public boolean solicituddrvObservacionesReportInit = false;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvignorarpreexistencias")
    protected Boolean solicituddrvIgnorarPreexistencias;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvtieneprimerafirma")
    protected Boolean solicituddrvTienePrimeraFirma;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvnumcontrato")
    protected String solicituddrvNumContrato;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDFINIVIGCONTINC )
    @JsonProperty(value="finivigcontinc")
    private Date solicitudFIniVigContInc;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudFIniVigContInc;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvimptarifaplanvol")
    protected Double solicituddrvImpTarifaPlanVol;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvaplicadocprotdatos")
    protected Boolean solicituddrvAplicaDocProtDatos;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDPORCENTAJEPRORRATEO )
    @JsonProperty(value="porcentajeprorrateo")
    private Double solicitudPorcentajeProrrateo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudPorcentajeProrrateo;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvpuedemodificargrupo")
    protected Boolean solicituddrvPuedeModificarGrupo;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDGRUPODELCORE )
    @JsonProperty(value="grupodelcore")
    private Long solicitudGrupoDelCORE;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudGrupoDelCORE;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDTIPOFACTURACORE )
    @JsonProperty(value="tipofacturacore")
    private String solicitudTipoFacturaCORE;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudTipoFacturaCORE;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvaplicapolizainternacional")
    protected Boolean solicituddrvAplicaPolizaInternacional;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvpolizainternacional")
    protected Boolean solicituddrvPolizaInternacional;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvpermiterechazados")
    protected Boolean solicituddrvPermiteRechazados;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvalgunusuarioimc")
    protected Boolean solicituddrvAlgunUsuarioIMC;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvfechaporceniva")
    protected Date solicituddrvFechaPorcenIVA;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDRESULTSMSINFOPAGO )
    @JsonProperty(value="resultsmsinfopago")
    private String solicitudResultSMSInfoPago;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudResultSMSInfoPago;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDFECHACOMPLETADA )
    @JsonProperty(value="fechacompletada")
    private Timestamp solicitudFechaCompletada;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudFechaCompletada;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDFECHAULTIMODOC )
    @JsonProperty(value="fechaultimodoc")
    private Timestamp solicitudFechaUltimoDoc;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudFechaUltimoDoc;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDPRIORIDAD )
    @JsonProperty(value="prioridad")
    private Long solicitudPrioridad;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudPrioridad;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDFECHATERMINADA )
    @JsonProperty(value="fechaterminada")
    private Date solicitudFechaTerminada;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudFechaTerminada;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDFECHAFUG )
    @JsonProperty(value="fechafug")
    private Timestamp solicitudFechaFUG;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudFechaFUG;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDFECHAFA )
    @JsonProperty(value="fechafa")
    private Timestamp solicitudFechaFA;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudFechaFA;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDFECHAFAAM )
    @JsonProperty(value="fechafaam")
    private Timestamp solicitudFechaFAAM;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudFechaFAAM;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDSEMAFOROGRABASE )
    @JsonProperty(value="semaforograbase")
    private Double solicitudSemaforoGrabAse;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudSemaforoGrabAse;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDSEMAFOROAREAMED )
    @JsonProperty(value="semaforoareamed")
    private Double solicitudSemaforoAreaMed;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudSemaforoAreaMed;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDESTADODOC )
    @JsonProperty(value="estadodoc")
    private Long solicitudEstadoDoc;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudEstadoDoc;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvsemaforograbase")
    protected Double solicituddrvSemaforoGrabAse;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvsemaforoareamed")
    protected Double solicituddrvSemaforoAreaMed;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvestadohomologado")
    protected Long solicitudDrvEstadoHomologado;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvvalidardatoscontratante")
    protected Boolean solicituddrvValidarDatosContratante;

    /** Class member attribute. */
    @Column(name = SolicitudConstants.FLD_SOLICITUDENVIOCARNETFISICO )
    @JsonProperty(value="enviocarnetfisico")
    private Boolean solicitudEnvioCarnetFisico;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSolicitudEnvioCarnetFisico;

    /** Class member attribute. */
    @Transient
    @JsonProperty(value="drvtramitarenlinea")
    protected Boolean solicituddrvTramitarEnLinea;

    /** Related Class. */
    @OneToOne(fetch = FetchType.LAZY, mappedBy = SolicitudConstants.ROLE_INVNAME_DIRECCION)
    @JsonIgnore
    private Direccion direccion;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDireccion;

    /** Related Class. */
    @OneToOne(fetch = FetchType.LAZY, mappedBy = SolicitudConstants.ROLE_INVNAME_PROTECCIONDATOS)
    @JsonIgnore
    private ProteccionDatos proteccionDatos;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedProteccionDatos;

    /** Related Class. */
    @OneToMany(mappedBy = SolicitudConstants.ROLE_INVNAME_USUARIOS)
    @JsonIgnore
    private Collection <Usuario> usuarios;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuarios;

    /** Related Class. */
    @OneToOne(fetch = FetchType.LAZY, mappedBy = SolicitudConstants.ROLE_INVNAME_CONTRATANTE)
    @JsonIgnore
    private Contratante contratante;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratante;

    /** Related Class. */
    @OneToOne(fetch = FetchType.LAZY, mappedBy = SolicitudConstants.ROLE_INVNAME_FIRMA)
    @JsonIgnore
    private Firma firma;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFirma;

    /** Related Class. */
    @OneToOne(fetch = FetchType.LAZY, mappedBy = SolicitudConstants.ROLE_INVNAME_SEGUNDAFIRMA)
    @JsonIgnore
    private Firma segundaFirma;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedSegundaFirma;

    /** Related Class. */
    @OneToOne(fetch = FetchType.LAZY, mappedBy = SolicitudConstants.ROLE_INVNAME_FIRMACONTRATANTEINCL)
    @JsonIgnore
    private Firma firmaContratanteIncl;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFirmaContratanteIncl;

    /** Related Class. */
    @OneToMany(mappedBy = SolicitudConstants.ROLE_INVNAME_USUARIOSREGISTRADOS)
    @JsonIgnore
    private Collection <UsuarioReg> usuariosRegistrados;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsuariosRegistrados;

    /** Related Class. */
    @OneToOne(fetch = FetchType.LAZY, mappedBy = SolicitudConstants.ROLE_INVNAME_TITULAR)
    @JsonIgnore
    private Titular titular;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTitular;

    /** Related Class. */
    @OneToMany(mappedBy = SolicitudConstants.ROLE_INVNAME_DOCUMENTOSGESTOR)
    @JsonIgnore
    private Collection <DocumentoG> documentosGestor;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedDocumentosGestor;

    /** Related Class. */
    @OneToMany(mappedBy = SolicitudConstants.ROLE_INVNAME_ERRORESWS)
    @JsonIgnore
    private Collection <ErrorWS> erroresWS;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedErroresWS;

    /** Related Class. */
    @OneToMany(mappedBy = SolicitudConstants.ROLE_INVNAME_LOGESTADO)
    @JsonIgnore
    private Collection <LogEstado> logEstado;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogEstado;

    /** Related Class. */
    @OneToMany(mappedBy = SolicitudConstants.ROLE_INVNAME_LOGASIGNACIONES)
    @JsonIgnore
    private Collection <LogAsignaciones> logAsignaciones;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedLogAsignaciones;

    /** Related Class. */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=SolicitudConstants.FLD_AESOLICITUDESIDSOLICITUD, referencedColumnName=AesolicitudesConstants.FLD_AESOLICITUDESIDSOLICITUD, insertable = false, updatable = false)
    })
    @JsonIgnore
    private Aesolicitudes aesolicitudes;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAesolicitudes;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=SolicitudConstants.FLD_PERSONAIDENTIFICADOR, referencedColumnName=PersonaConstants.FLD_PERSONAIDENTIFICADOR)
    })
    @JsonIgnore
    private Persona contratantePersona;
    /** Related attribute. */
    @Column(name = SolicitudConstants.FLD_PERSONAIDENTIFICADOR, insertable = false, updatable = false)
    private Long personaIdentificador;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratantePersona;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=SolicitudConstants.FLD_PERSONATITULARPERSONAIDENTIFICADOR, referencedColumnName=PersonaConstants.FLD_PERSONAIDENTIFICADOR)
    })
    @JsonIgnore
    private Persona titularPersona;
    /** Related attribute. */
    @Column(name = SolicitudConstants.FLD_PERSONATITULARPERSONAIDENTIFICADOR, insertable = false, updatable = false)
    private Long personaTitularPersonaIdentificador;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTitularPersona;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=SolicitudConstants.FLD_GRUPOASOCIADOCODIGO, referencedColumnName=GrupoAsociadoConstants.FLD_GRUPOASOCIADOCODIGO)
    })
    @JsonIgnore
    private GrupoAsociado grupoAsociado;
    /** Related attribute. */
    @Column(name = SolicitudConstants.FLD_GRUPOASOCIADOCODIGO, insertable = false, updatable = false)
    private Long grupoAsociadoCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedGrupoAsociado;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=SolicitudConstants.FLD_FUNCIONARIOID, referencedColumnName=FuncionarioConstants.FLD_FUNCIONARIOID)
    })
    @JsonIgnore
    private Funcionario agente;
    /** Related attribute. */
    @Column(name = SolicitudConstants.FLD_FUNCIONARIOID, insertable = false, updatable = false)
    private Long funcionarioId;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedAgente;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=SolicitudConstants.FLD_FORMAPAGOFORMAPAGOCODIGO, referencedColumnName=FormaPagoConstants.FLD_FORMAPAGOCODIGO)
    })
    @JsonIgnore
    private FormaPago formaPago;
    /** Related attribute. */
    @Column(name = SolicitudConstants.FLD_FORMAPAGOFORMAPAGOCODIGO, insertable = false, updatable = false)
    private Long formaPagoFormaPagoCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedFormaPago;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=SolicitudConstants.FLD_PERIODICIDADPERIODICIDADCODIGO, referencedColumnName=PeriodicidadConstants.FLD_PERIODICIDADCODIGO)
    })
    @JsonIgnore
    private Periodicidad periodicidad;
    /** Related attribute. */
    @Column(name = SolicitudConstants.FLD_PERIODICIDADPERIODICIDADCODIGO, insertable = false, updatable = false)
    private Long periodicidadPeriodicidadCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPeriodicidad;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=SolicitudConstants.FLD_CONTRATOCCONTRATOCID, referencedColumnName=ContratoCConstants.FLD_CONTRATOCID)
    })
    @JsonIgnore
    private ContratoC contratoC;
    /** Related attribute. */
    @Column(name = SolicitudConstants.FLD_CONTRATOCCONTRATOCID, insertable = false, updatable = false)
    private Long contratoCContratoCID;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedContratoC;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=SolicitudConstants.FLD_FUNCIONARIOUSRAREAMEDICAID, referencedColumnName=AreaMedicaConstants.FLD_FUNCIONARIOID)
    })
    @JsonIgnore
    private AreaMedica usrAreaMedica;
    /** Related attribute. */
    @Column(name = SolicitudConstants.FLD_FUNCIONARIOUSRAREAMEDICAID, insertable = false, updatable = false)
    private Long funcionarioUsrAreaMedicaId;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsrAreaMedica;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=SolicitudConstants.FLD_TIPOFACTURATIPOFACTURACODIGO, referencedColumnName=TipoFacturaConstants.FLD_TIPOFACTURACODIGO)
    })
    @JsonIgnore
    private TipoFactura tipoFactura;
    /** Related attribute. */
    @Column(name = SolicitudConstants.FLD_TIPOFACTURATIPOFACTURACODIGO, insertable = false, updatable = false)
    private String tipoFacturaTipoFacturaCodigo;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedTipoFactura;

    /** Related Class. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name=SolicitudConstants.FLD_FUNCIONARIOUSRAFILIACIONID, referencedColumnName=FuncionarioConstants.FLD_FUNCIONARIOID)
    })
    @JsonIgnore
    private Funcionario usrAfiliacion;
    /** Related attribute. */
    @Column(name = SolicitudConstants.FLD_FUNCIONARIOUSRAFILIACIONID, insertable = false, updatable = false)
    private Long funcionarioUsrAfiliacionId;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedUsrAfiliacion;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public Solicitud() {
        aesolicitudesidsolicitud = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>Solicitud</code>.
     * @param oid Object Identifier of the instance of <code>Solicitud</code> to be created.
     * @throws SystemException
     */
    public Solicitud(SolicitudOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            aesolicitudesidsolicitud = oid.getAesolicitudesidsolicitud();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>aesolicitudesidsolicitud</code> attribute<br>in class <code>Aesolicitudes</code> through <code>Ae_solicitudes</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Aesolicitudes</code>
     * @return The value of the <code>aesolicitudesidsolicitud</code> attribute<br>in class <code>Aesolicitudes</code> through <code>Ae_solicitudes</code>.
     */
    public Long getAesolicitudesidsolicitud() {
        return aesolicitudesidsolicitud;
    }

    /**
     * Sets the value of the <code>aesolicitudesidsolicitud</code> attribute<br>in class <code>Aesolicitudes</code> through <code>Ae_solicitudes</code>.
     * This is part of the identification for this class, which depends on the identification of <code>Aesolicitudes</code>
     * @param aesolicitudesidsolicitud The new value of the <code>aesolicitudesidsolicitud</code> attribute<br>in class <code>Aesolicitudes</code> through <code>Ae_solicitudes</code>.
     */
    public void setAesolicitudesidsolicitud(Long aesolicitudesidsolicitud) {
        this.aesolicitudesidsolicitud = aesolicitudesidsolicitud;
    }

   /**
    * Returns the value of the <code>solicitudNumRadicado</code> attribute.<br>
    * Model Attribute: <code>solicitudNumRadicado</code>. Constant Int<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNumRadicado</code> attribute.
    */

    public Long getSolicitudNumRadicado()  {
    	Long value;
        value =  solicitudNumRadicado;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudNumRadicado</code> attribute.<br>
    * Model Attribute: <code>solicitudNumRadicado</code>. Constant Int<br>
    * Comments: <br>
    * @param solicitudNumRadicado The new value of the <code>solicitudNumRadicado</code> attribute.
    */
    public void setSolicitudNumRadicado (Long solicitudNumRadicado) {
        modifiedSolicitudNumRadicado = true;
        this.solicitudNumRadicado = solicitudNumRadicado;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudNumRadicado</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudNumRadicado</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudNumRadicado() {
        return modifiedSolicitudNumRadicado;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNumRadicado</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNumRadicado</code>.
    */
    public void setModifiedSolicitudNumRadicado(boolean modified) {
        this.modifiedSolicitudNumRadicado = modified;
    }

   /**
    * Returns the value of the <code>solicitudTramite</code> attribute.<br>
    * Model Attribute: <code>solicitudTramite</code>. Constant Nat<br>
    * Comments: 1.- Nueva afiliación 2.- Inclusión<br>
    * @return The value of the <code>solicitudTramite</code> attribute.
    */

    public Long getSolicitudTramite()  {
    	Long value;
        value =  solicitudTramite;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudTramite</code> attribute.<br>
    * Model Attribute: <code>solicitudTramite</code>. Constant Nat<br>
    * Comments: 1.- Nueva afiliación 2.- Inclusión<br>
    * @param solicitudTramite The new value of the <code>solicitudTramite</code> attribute.
    */
    public void setSolicitudTramite (Long solicitudTramite) {
        modifiedSolicitudTramite = true;
        this.solicitudTramite = solicitudTramite;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudTramite</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudTramite</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudTramite() {
        return modifiedSolicitudTramite;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudTramite</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudTramite</code>.
    */
    public void setModifiedSolicitudTramite(boolean modified) {
        this.modifiedSolicitudTramite = modified;
    }

   /**
    * Returns the value of the <code>solicitudNumContrato</code> attribute.<br>
    * Model Attribute: <code>solicitudNumContrato</code>. Variable String Size=50<br>
    * Comments: Dato que nos devuelve el CORE cuando se crea un nuevo contrato<br>
    * @return The value of the <code>solicitudNumContrato</code> attribute.
    */

    public String getSolicitudNumContrato()  {
    	String value;
        value =  solicitudNumContrato;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>solicitudNumContrato</code> attribute.<br>
    * Model Attribute: <code>solicitudNumContrato</code>. Variable String Size=50<br>
    * Comments: Dato que nos devuelve el CORE cuando se crea un nuevo contrato<br>
    * @param solicitudNumContrato The new value of the <code>solicitudNumContrato</code> attribute.
    */
    public void setSolicitudNumContrato (String solicitudNumContrato) {
        modifiedSolicitudNumContrato = true;
        this.solicitudNumContrato = solicitudNumContrato;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudNumContrato</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudNumContrato</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudNumContrato() {
        return modifiedSolicitudNumContrato;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNumContrato</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNumContrato</code>.
    */
    public void setModifiedSolicitudNumContrato(boolean modified) {
        this.modifiedSolicitudNumContrato = modified;
    }

   /**
    * Returns the value of the <code>solicitudFInicioContrato</code> attribute.<br>
    * Model Attribute: <code>solicitudFInicioContrato</code>. Variable Date<br>
    * Comments: Req. 10: Fechas de vigencia
Referencia: HU-AEEPS-10
La fecha de inicio de contratación, que hasta en momento no admitía valores nulos, a partir de ahora sí que lo permitirá. Tomará el valor nulo, para planes voluntarios, hasta el momento en el que se confirme la solicitud.<br>
    * @return The value of the <code>solicitudFInicioContrato</code> attribute.
    */

    public Date getSolicitudFInicioContrato()  {
    	Date value;
        value =  solicitudFInicioContrato;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudFInicioContrato</code> attribute.<br>
    * Model Attribute: <code>solicitudFInicioContrato</code>. Variable Date<br>
    * Comments: Req. 10: Fechas de vigencia
Referencia: HU-AEEPS-10
La fecha de inicio de contratación, que hasta en momento no admitía valores nulos, a partir de ahora sí que lo permitirá. Tomará el valor nulo, para planes voluntarios, hasta el momento en el que se confirme la solicitud.<br>
    * @param solicitudFInicioContrato The new value of the <code>solicitudFInicioContrato</code> attribute.
    */
    public void setSolicitudFInicioContrato (Date solicitudFInicioContrato) {
        modifiedSolicitudFInicioContrato = true;
        this.solicitudFInicioContrato = solicitudFInicioContrato;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudFInicioContrato</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudFInicioContrato</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudFInicioContrato() {
        return modifiedSolicitudFInicioContrato;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudFInicioContrato</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudFInicioContrato</code>.
    */
    public void setModifiedSolicitudFInicioContrato(boolean modified) {
        this.modifiedSolicitudFInicioContrato = modified;
    }

   /**
    * Returns the value of the <code>solicitudEsTraslado</code> attribute.<br>
    * Model Attribute: <code>solicitudEsTraslado</code>. Constant Bool<br>
    * Comments: <br>
    * @return The value of the <code>solicitudEsTraslado</code> attribute.
    */

    public Boolean getSolicitudEsTraslado()  {
    	Boolean value;
        value =  solicitudEsTraslado;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudEsTraslado</code> attribute.<br>
    * Model Attribute: <code>solicitudEsTraslado</code>. Constant Bool<br>
    * Comments: <br>
    * @param solicitudEsTraslado The new value of the <code>solicitudEsTraslado</code> attribute.
    */
    public void setSolicitudEsTraslado (Boolean solicitudEsTraslado) {
        modifiedSolicitudEsTraslado = true;
        this.solicitudEsTraslado = solicitudEsTraslado;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudEsTraslado</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudEsTraslado</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudEsTraslado() {
        return modifiedSolicitudEsTraslado;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudEsTraslado</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudEsTraslado</code>.
    */
    public void setModifiedSolicitudEsTraslado(boolean modified) {
        this.modifiedSolicitudEsTraslado = modified;
    }

   /**
    * Returns the value of the <code>solicituddrvReqCuesMed</code> attribute.<br>
    * Model Attribute: <code>solicituddrvReqCuesMed</code>. Variable Bool<br>
    * Comments: Requiere cuestionario médico<br>
    * @return The value of the <code>solicituddrvReqCuesMed</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvReqCuesMed()  {
    	Boolean value;
        try {
            value = solicituddrvReqCuesMedDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvReqCuesMed");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicitudtipoContrato</code> attribute.<br>
    * Model Attribute: <code>solicitudtipoContrato</code>. Variable Nat<br>
    * Comments: 1.- Familiar, 3.- Colectivo<br>
    * @return The value of the <code>solicitudtipoContrato</code> attribute.
    */

    public Long getSolicitudtipoContrato()  {
    	Long value;
        value =  solicitudtipoContrato;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudtipoContrato</code> attribute.<br>
    * Model Attribute: <code>solicitudtipoContrato</code>. Variable Nat<br>
    * Comments: 1.- Familiar, 3.- Colectivo<br>
    * @param solicitudtipoContrato The new value of the <code>solicitudtipoContrato</code> attribute.
    */
    public void setSolicitudtipoContrato (Long solicitudtipoContrato) {
        modifiedSolicitudtipoContrato = true;
        this.solicitudtipoContrato = solicitudtipoContrato;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudtipoContrato</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudtipoContrato</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudtipoContrato() {
        return modifiedSolicitudtipoContrato;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudtipoContrato</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudtipoContrato</code>.
    */
    public void setModifiedSolicitudtipoContrato(boolean modified) {
        this.modifiedSolicitudtipoContrato = modified;
    }

   /**
    * Returns the value of the <code>solicitudcodigoSucursalRad</code> attribute.<br>
    * Model Attribute: <code>solicitudcodigoSucursalRad</code>. Variable String Size=200<br>
    * Comments: <br>
    * @return The value of the <code>solicitudcodigoSucursalRad</code> attribute.
    */

    public String getSolicitudcodigoSucursalRad()  {
    	String value;
        value =  solicitudcodigoSucursalRad;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>solicitudcodigoSucursalRad</code> attribute.<br>
    * Model Attribute: <code>solicitudcodigoSucursalRad</code>. Variable String Size=200<br>
    * Comments: <br>
    * @param solicitudcodigoSucursalRad The new value of the <code>solicitudcodigoSucursalRad</code> attribute.
    */
    public void setSolicitudcodigoSucursalRad (String solicitudcodigoSucursalRad) {
        modifiedSolicitudcodigoSucursalRad = true;
        this.solicitudcodigoSucursalRad = solicitudcodigoSucursalRad;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudcodigoSucursalRad</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudcodigoSucursalRad</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudcodigoSucursalRad() {
        return modifiedSolicitudcodigoSucursalRad;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudcodigoSucursalRad</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudcodigoSucursalRad</code>.
    */
    public void setModifiedSolicitudcodigoSucursalRad(boolean modified) {
        this.modifiedSolicitudcodigoSucursalRad = modified;
    }

   /**
    * Returns the value of the <code>solicitudcontratoConFirma</code> attribute.<br>
    * Model Attribute: <code>solicitudcontratoConFirma</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>solicitudcontratoConFirma</code> attribute.
    */

    public Boolean getSolicitudcontratoConFirma()  {
    	Boolean value;
        value =  solicitudcontratoConFirma;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudcontratoConFirma</code> attribute.<br>
    * Model Attribute: <code>solicitudcontratoConFirma</code>. Variable Bool<br>
    * Comments: <br>
    * @param solicitudcontratoConFirma The new value of the <code>solicitudcontratoConFirma</code> attribute.
    */
    public void setSolicitudcontratoConFirma (Boolean solicitudcontratoConFirma) {
        modifiedSolicitudcontratoConFirma = true;
        this.solicitudcontratoConFirma = solicitudcontratoConFirma;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudcontratoConFirma</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudcontratoConFirma</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudcontratoConFirma() {
        return modifiedSolicitudcontratoConFirma;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudcontratoConFirma</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudcontratoConFirma</code>.
    */
    public void setModifiedSolicitudcontratoConFirma(boolean modified) {
        this.modifiedSolicitudcontratoConFirma = modified;
    }

   /**
    * Returns the value of the <code>solicitudobservacions</code> attribute.<br>
    * Model Attribute: <code>solicitudobservacions</code>. Variable String Size=700<br>
    * Comments: Modificado el tipo según ALM-100<br>
    * @return The value of the <code>solicitudobservacions</code> attribute.
    */

    public String getSolicitudobservacions()  {
    	String value;
        value =  solicitudobservacions;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>solicitudobservacions</code> attribute.<br>
    * Model Attribute: <code>solicitudobservacions</code>. Variable String Size=700<br>
    * Comments: Modificado el tipo según ALM-100<br>
    * @param solicitudobservacions The new value of the <code>solicitudobservacions</code> attribute.
    */
    public void setSolicitudobservacions (String solicitudobservacions) {
        modifiedSolicitudobservacions = true;
        this.solicitudobservacions = solicitudobservacions;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudobservacions</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudobservacions</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudobservacions() {
        return modifiedSolicitudobservacions;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudobservacions</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudobservacions</code>.
    */
    public void setModifiedSolicitudobservacions(boolean modified) {
        this.modifiedSolicitudobservacions = modified;
    }

   /**
    * Returns the value of the <code>solicitudexentoIVA</code> attribute.<br>
    * Model Attribute: <code>solicitudexentoIVA</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>solicitudexentoIVA</code> attribute.
    */

    public String getSolicitudexentoIVA()  {
    	String value;
        value =  solicitudexentoIVA;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>solicitudexentoIVA</code> attribute.<br>
    * Model Attribute: <code>solicitudexentoIVA</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param solicitudexentoIVA The new value of the <code>solicitudexentoIVA</code> attribute.
    */
    public void setSolicitudexentoIVA (String solicitudexentoIVA) {
        modifiedSolicitudexentoIVA = true;
        this.solicitudexentoIVA = solicitudexentoIVA;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudexentoIVA</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudexentoIVA</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudexentoIVA() {
        return modifiedSolicitudexentoIVA;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudexentoIVA</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudexentoIVA</code>.
    */
    public void setModifiedSolicitudexentoIVA(boolean modified) {
        this.modifiedSolicitudexentoIVA = modified;
    }

   /**
    * Returns the value of the <code>solicituddrvYaTieneContratante</code> attribute.<br>
    * Model Attribute: <code>solicituddrvYaTieneContratante</code>. Variable Bool<br>
    * Comments: Este derivado sólo se utilizará en una precondición de un servicio. Pero se pone para que funcione la anticipación de precondiciones. <br>
    * @return The value of the <code>solicituddrvYaTieneContratante</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvYaTieneContratante()  {
    	Boolean value;
        try {
            value = solicituddrvYaTieneContratanteDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvYaTieneContratante");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvTitularConBeneficios</code> attribute.<br>
    * Model Attribute: <code>solicituddrvTitularConBeneficios</code>. Variable Bool<br>
    * Comments: Para ser usado en precondiciones y que se anticipen. <br>
    * @return The value of the <code>solicituddrvTitularConBeneficios</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvTitularConBeneficios()  {
    	Boolean value;
        try {
            value = solicituddrvTitularConBeneficiosDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvTitularConBeneficios");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicitudvalorCuota</code> attribute.<br>
    * Model Attribute: <code>solicitudvalorCuota</code>. Variable Real<br>
    * Comments: <br>
    * @return The value of the <code>solicitudvalorCuota</code> attribute.
    */

    public Double getSolicitudvalorCuota()  {
    	Double value;
        value =  solicitudvalorCuota;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudvalorCuota</code> attribute.<br>
    * Model Attribute: <code>solicitudvalorCuota</code>. Variable Real<br>
    * Comments: <br>
    * @param solicitudvalorCuota The new value of the <code>solicitudvalorCuota</code> attribute.
    */
    public void setSolicitudvalorCuota (Double solicitudvalorCuota) {
        modifiedSolicitudvalorCuota = true;
        this.solicitudvalorCuota = solicitudvalorCuota;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudvalorCuota</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudvalorCuota</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudvalorCuota() {
        return modifiedSolicitudvalorCuota;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudvalorCuota</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudvalorCuota</code>.
    */
    public void setModifiedSolicitudvalorCuota(boolean modified) {
        this.modifiedSolicitudvalorCuota = modified;
    }

   /**
    * Returns the value of the <code>solicitudvalorDtoComercialSim</code> attribute.<br>
    * Model Attribute: <code>solicitudvalorDtoComercialSim</code>. Variable Real<br>
    * Comments: <br>
    * @return The value of the <code>solicitudvalorDtoComercialSim</code> attribute.
    */

    public Double getSolicitudvalorDtoComercialSim()  {
    	Double value;
        value =  solicitudvalorDtoComercialSim;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudvalorDtoComercialSim</code> attribute.<br>
    * Model Attribute: <code>solicitudvalorDtoComercialSim</code>. Variable Real<br>
    * Comments: <br>
    * @param solicitudvalorDtoComercialSim The new value of the <code>solicitudvalorDtoComercialSim</code> attribute.
    */
    public void setSolicitudvalorDtoComercialSim (Double solicitudvalorDtoComercialSim) {
        modifiedSolicitudvalorDtoComercialSim = true;
        this.solicitudvalorDtoComercialSim = solicitudvalorDtoComercialSim;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudvalorDtoComercialSim</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudvalorDtoComercialSim</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudvalorDtoComercialSim() {
        return modifiedSolicitudvalorDtoComercialSim;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudvalorDtoComercialSim</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudvalorDtoComercialSim</code>.
    */
    public void setModifiedSolicitudvalorDtoComercialSim(boolean modified) {
        this.modifiedSolicitudvalorDtoComercialSim = modified;
    }

   /**
    * Returns the value of the <code>solicitudValorCuotaInscrip</code> attribute.<br>
    * Model Attribute: <code>solicitudValorCuotaInscrip</code>. Variable Real<br>
    * Comments: GC3: No calcular el valor de la cuota de inscripción. Pasa a ser un valor opcional introducido por el usuario<br>
    * @return The value of the <code>solicitudValorCuotaInscrip</code> attribute.
    */

    public Double getSolicitudValorCuotaInscrip()  {
    	Double value;
        value =  solicitudValorCuotaInscrip;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudValorCuotaInscrip</code> attribute.<br>
    * Model Attribute: <code>solicitudValorCuotaInscrip</code>. Variable Real<br>
    * Comments: GC3: No calcular el valor de la cuota de inscripción. Pasa a ser un valor opcional introducido por el usuario<br>
    * @param solicitudValorCuotaInscrip The new value of the <code>solicitudValorCuotaInscrip</code> attribute.
    */
    public void setSolicitudValorCuotaInscrip (Double solicitudValorCuotaInscrip) {
        modifiedSolicitudValorCuotaInscrip = true;
        this.solicitudValorCuotaInscrip = solicitudValorCuotaInscrip;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudValorCuotaInscrip</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudValorCuotaInscrip</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudValorCuotaInscrip() {
        return modifiedSolicitudValorCuotaInscrip;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudValorCuotaInscrip</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudValorCuotaInscrip</code>.
    */
    public void setModifiedSolicitudValorCuotaInscrip(boolean modified) {
        this.modifiedSolicitudValorCuotaInscrip = modified;
    }

   /**
    * Returns the value of the <code>solicituddrvSubtotal</code> attribute.<br>
    * Model Attribute: <code>solicituddrvSubtotal</code>. Variable Real<br>
    * Comments: <br>
    * @return The value of the <code>solicituddrvSubtotal</code> attribute.
    */

    @JsonIgnore
    public Double getSolicituddrvSubtotal()  {
    	Double value;
        try {
            value = solicituddrvSubtotalDerivations();
        } catch (Exception e) {
            value = Double.valueOf(0);
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvSubtotal");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicitudValorDtoFinanciero</code> attribute.<br>
    * Model Attribute: <code>solicitudValorDtoFinanciero</code>. Variable Real<br>
    * Comments: <br>
    * @return The value of the <code>solicitudValorDtoFinanciero</code> attribute.
    */

    public Double getSolicitudValorDtoFinanciero()  {
    	Double value;
        value =  solicitudValorDtoFinanciero;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudValorDtoFinanciero</code> attribute.<br>
    * Model Attribute: <code>solicitudValorDtoFinanciero</code>. Variable Real<br>
    * Comments: <br>
    * @param solicitudValorDtoFinanciero The new value of the <code>solicitudValorDtoFinanciero</code> attribute.
    */
    public void setSolicitudValorDtoFinanciero (Double solicitudValorDtoFinanciero) {
        modifiedSolicitudValorDtoFinanciero = true;
        this.solicitudValorDtoFinanciero = solicitudValorDtoFinanciero;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudValorDtoFinanciero</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudValorDtoFinanciero</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudValorDtoFinanciero() {
        return modifiedSolicitudValorDtoFinanciero;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudValorDtoFinanciero</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudValorDtoFinanciero</code>.
    */
    public void setModifiedSolicitudValorDtoFinanciero(boolean modified) {
        this.modifiedSolicitudValorDtoFinanciero = modified;
    }

   /**
    * Returns the value of the <code>solicitudValorDtoComercial</code> attribute.<br>
    * Model Attribute: <code>solicitudValorDtoComercial</code>. Variable Real<br>
    * Comments: <br>
    * @return The value of the <code>solicitudValorDtoComercial</code> attribute.
    */

    public Double getSolicitudValorDtoComercial()  {
    	Double value;
        value =  solicitudValorDtoComercial;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudValorDtoComercial</code> attribute.<br>
    * Model Attribute: <code>solicitudValorDtoComercial</code>. Variable Real<br>
    * Comments: <br>
    * @param solicitudValorDtoComercial The new value of the <code>solicitudValorDtoComercial</code> attribute.
    */
    public void setSolicitudValorDtoComercial (Double solicitudValorDtoComercial) {
        modifiedSolicitudValorDtoComercial = true;
        this.solicitudValorDtoComercial = solicitudValorDtoComercial;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudValorDtoComercial</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudValorDtoComercial</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudValorDtoComercial() {
        return modifiedSolicitudValorDtoComercial;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudValorDtoComercial</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudValorDtoComercial</code>.
    */
    public void setModifiedSolicitudValorDtoComercial(boolean modified) {
        this.modifiedSolicitudValorDtoComercial = modified;
    }

   /**
    * Returns the value of the <code>solicituddrvBaseGrabable</code> attribute.<br>
    * Model Attribute: <code>solicituddrvBaseGrabable</code>. Variable Real<br>
    * Comments: <br>
    * @return The value of the <code>solicituddrvBaseGrabable</code> attribute.
    */

    @JsonIgnore
    public Double getSolicituddrvBaseGrabable()  {
    	Double value;
        try {
            value = solicituddrvBaseGrabableDerivations();
        } catch (Exception e) {
            value = Double.valueOf(0);
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvBaseGrabable");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvPorcenIVA</code> attribute.<br>
    * Model Attribute: <code>solicituddrvPorcenIVA</code>. Variable Real<br>
    * Comments: <br>
    * @return The value of the <code>solicituddrvPorcenIVA</code> attribute.
    */

    @JsonIgnore
    public Double getSolicituddrvPorcenIVA()  {
    	Double value;
        try {
            value = solicituddrvPorcenIVADerivations();
        } catch (Exception e) {
            value = Double.valueOf(0);
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvPorcenIVA");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvIVA</code> attribute.<br>
    * Model Attribute: <code>solicituddrvIVA</code>. Variable Real<br>
    * Comments: <br>
    * @return The value of the <code>solicituddrvIVA</code> attribute.
    */

    @JsonIgnore
    public Double getSolicituddrvIVA()  {
    	Double value;
        try {
            value = solicituddrvIVADerivations();
        } catch (Exception e) {
            value = Double.valueOf(0);
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvIVA");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvTotal</code> attribute.<br>
    * Model Attribute: <code>solicituddrvTotal</code>. Variable Real<br>
    * Comments: <br>
    * @return The value of the <code>solicituddrvTotal</code> attribute.
    */

    @JsonIgnore
    public Double getSolicituddrvTotal()  {
    	Double value;
        try {
            value = solicituddrvTotalDerivations();
        } catch (Exception e) {
            value = Double.valueOf(0);
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvTotal");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddatosPagoOK</code> attribute.<br>
    * Model Attribute: <code>solicituddatosPagoOK</code>. Variable Bool<br>
    * Comments: Este dato se pondrá a TRUE cuando se haya proporcionado la información de pago. Sirve para controlar cuando se tienen ya todos los datos y por tanto se puede generar la solicitud<br>
    * @return The value of the <code>solicituddatosPagoOK</code> attribute.
    */

    public Boolean getSolicituddatosPagoOK()  {
    	Boolean value;
        value =  solicituddatosPagoOK;
        return value;
    }

   /**
    * Sets the value of the <code>solicituddatosPagoOK</code> attribute.<br>
    * Model Attribute: <code>solicituddatosPagoOK</code>. Variable Bool<br>
    * Comments: Este dato se pondrá a TRUE cuando se haya proporcionado la información de pago. Sirve para controlar cuando se tienen ya todos los datos y por tanto se puede generar la solicitud<br>
    * @param solicituddatosPagoOK The new value of the <code>solicituddatosPagoOK</code> attribute.
    */
    public void setSolicituddatosPagoOK (Boolean solicituddatosPagoOK) {
        modifiedSolicituddatosPagoOK = true;
        this.solicituddatosPagoOK = solicituddatosPagoOK;
    }

   /**
    * Returns the value of the <code>modifiedSolicituddatosPagoOK</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicituddatosPagoOK</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicituddatosPagoOK() {
        return modifiedSolicituddatosPagoOK;
    }

   /**
    * Sets the value of the <code>modifiedSolicituddatosPagoOK</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicituddatosPagoOK</code>.
    */
    public void setModifiedSolicituddatosPagoOK(boolean modified) {
        this.modifiedSolicituddatosPagoOK = modified;
    }

   /**
    * Returns the value of the <code>solicitudvalorCuotaPeriodoC</code> attribute.<br>
    * Model Attribute: <code>solicitudvalorCuotaPeriodoC</code>. Variable Real<br>
    * Comments: El dato que devuelve el CORE<br>
    * @return The value of the <code>solicitudvalorCuotaPeriodoC</code> attribute.
    */

    public Double getSolicitudvalorCuotaPeriodoC()  {
    	Double value;
        value =  solicitudvalorCuotaPeriodoC;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudvalorCuotaPeriodoC</code> attribute.<br>
    * Model Attribute: <code>solicitudvalorCuotaPeriodoC</code>. Variable Real<br>
    * Comments: El dato que devuelve el CORE<br>
    * @param solicitudvalorCuotaPeriodoC The new value of the <code>solicitudvalorCuotaPeriodoC</code> attribute.
    */
    public void setSolicitudvalorCuotaPeriodoC (Double solicitudvalorCuotaPeriodoC) {
        modifiedSolicitudvalorCuotaPeriodoC = true;
        this.solicitudvalorCuotaPeriodoC = solicitudvalorCuotaPeriodoC;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudvalorCuotaPeriodoC</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudvalorCuotaPeriodoC</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudvalorCuotaPeriodoC() {
        return modifiedSolicitudvalorCuotaPeriodoC;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudvalorCuotaPeriodoC</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudvalorCuotaPeriodoC</code>.
    */
    public void setModifiedSolicitudvalorCuotaPeriodoC(boolean modified) {
        this.modifiedSolicitudvalorCuotaPeriodoC = modified;
    }

   /**
    * Returns the value of the <code>solicituddescuentoComercialC</code> attribute.<br>
    * Model Attribute: <code>solicituddescuentoComercialC</code>. Variable Real<br>
    * Comments: El dato que devuelve el CORE<br>
    * @return The value of the <code>solicituddescuentoComercialC</code> attribute.
    */

    public Double getSolicituddescuentoComercialC()  {
    	Double value;
        value =  solicituddescuentoComercialC;
        return value;
    }

   /**
    * Sets the value of the <code>solicituddescuentoComercialC</code> attribute.<br>
    * Model Attribute: <code>solicituddescuentoComercialC</code>. Variable Real<br>
    * Comments: El dato que devuelve el CORE<br>
    * @param solicituddescuentoComercialC The new value of the <code>solicituddescuentoComercialC</code> attribute.
    */
    public void setSolicituddescuentoComercialC (Double solicituddescuentoComercialC) {
        modifiedSolicituddescuentoComercialC = true;
        this.solicituddescuentoComercialC = solicituddescuentoComercialC;
    }

   /**
    * Returns the value of the <code>modifiedSolicituddescuentoComercialC</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicituddescuentoComercialC</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicituddescuentoComercialC() {
        return modifiedSolicituddescuentoComercialC;
    }

   /**
    * Sets the value of the <code>modifiedSolicituddescuentoComercialC</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicituddescuentoComercialC</code>.
    */
    public void setModifiedSolicituddescuentoComercialC(boolean modified) {
        this.modifiedSolicituddescuentoComercialC = modified;
    }

   /**
    * Returns the value of the <code>solicitudIVAC</code> attribute.<br>
    * Model Attribute: <code>solicitudIVAC</code>. Variable Real<br>
    * Comments: El dato que devuelve el CORE<br>
    * @return The value of the <code>solicitudIVAC</code> attribute.
    */

    public Double getSolicitudIVAC()  {
    	Double value;
        value =  solicitudIVAC;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudIVAC</code> attribute.<br>
    * Model Attribute: <code>solicitudIVAC</code>. Variable Real<br>
    * Comments: El dato que devuelve el CORE<br>
    * @param solicitudIVAC The new value of the <code>solicitudIVAC</code> attribute.
    */
    public void setSolicitudIVAC (Double solicitudIVAC) {
        modifiedSolicitudIVAC = true;
        this.solicitudIVAC = solicitudIVAC;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudIVAC</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudIVAC</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudIVAC() {
        return modifiedSolicitudIVAC;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudIVAC</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudIVAC</code>.
    */
    public void setModifiedSolicitudIVAC(boolean modified) {
        this.modifiedSolicitudIVAC = modified;
    }

   /**
    * Returns the value of the <code>solicituddescuentoFinancieroC</code> attribute.<br>
    * Model Attribute: <code>solicituddescuentoFinancieroC</code>. Variable Real<br>
    * Comments: <br>
    * @return The value of the <code>solicituddescuentoFinancieroC</code> attribute.
    */

    public Double getSolicituddescuentoFinancieroC()  {
    	Double value;
        value =  solicituddescuentoFinancieroC;
        return value;
    }

   /**
    * Sets the value of the <code>solicituddescuentoFinancieroC</code> attribute.<br>
    * Model Attribute: <code>solicituddescuentoFinancieroC</code>. Variable Real<br>
    * Comments: <br>
    * @param solicituddescuentoFinancieroC The new value of the <code>solicituddescuentoFinancieroC</code> attribute.
    */
    public void setSolicituddescuentoFinancieroC (Double solicituddescuentoFinancieroC) {
        modifiedSolicituddescuentoFinancieroC = true;
        this.solicituddescuentoFinancieroC = solicituddescuentoFinancieroC;
    }

   /**
    * Returns the value of the <code>modifiedSolicituddescuentoFinancieroC</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicituddescuentoFinancieroC</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicituddescuentoFinancieroC() {
        return modifiedSolicituddescuentoFinancieroC;
    }

   /**
    * Sets the value of the <code>modifiedSolicituddescuentoFinancieroC</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicituddescuentoFinancieroC</code>.
    */
    public void setModifiedSolicituddescuentoFinancieroC(boolean modified) {
        this.modifiedSolicituddescuentoFinancieroC = modified;
    }

   /**
    * Returns the value of the <code>solicitudTieneDifLiquidacion</code> attribute.<br>
    * Model Attribute: <code>solicitudTieneDifLiquidacion</code>. Variable Bool<br>
    * Comments: Indica si la solicitud tiene diferencias de liquidación entre los datos de pago que proporcionó el asesor y los datos de pago calculados por el CORE<br>
    * @return The value of the <code>solicitudTieneDifLiquidacion</code> attribute.
    */

    public Boolean getSolicitudTieneDifLiquidacion()  {
    	Boolean value;
        value =  solicitudTieneDifLiquidacion;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudTieneDifLiquidacion</code> attribute.<br>
    * Model Attribute: <code>solicitudTieneDifLiquidacion</code>. Variable Bool<br>
    * Comments: Indica si la solicitud tiene diferencias de liquidación entre los datos de pago que proporcionó el asesor y los datos de pago calculados por el CORE<br>
    * @param solicitudTieneDifLiquidacion The new value of the <code>solicitudTieneDifLiquidacion</code> attribute.
    */
    public void setSolicitudTieneDifLiquidacion (Boolean solicitudTieneDifLiquidacion) {
        modifiedSolicitudTieneDifLiquidacion = true;
        this.solicitudTieneDifLiquidacion = solicitudTieneDifLiquidacion;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudTieneDifLiquidacion</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudTieneDifLiquidacion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudTieneDifLiquidacion() {
        return modifiedSolicitudTieneDifLiquidacion;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudTieneDifLiquidacion</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudTieneDifLiquidacion</code>.
    */
    public void setModifiedSolicitudTieneDifLiquidacion(boolean modified) {
        this.modifiedSolicitudTieneDifLiquidacion = modified;
    }

   /**
    * Returns the value of the <code>solicitudUsuariosValidados</code> attribute.<br>
    * Model Attribute: <code>solicitudUsuariosValidados</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>solicitudUsuariosValidados</code> attribute.
    */

    public Boolean getSolicitudUsuariosValidados()  {
    	Boolean value;
        value =  solicitudUsuariosValidados;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudUsuariosValidados</code> attribute.<br>
    * Model Attribute: <code>solicitudUsuariosValidados</code>. Variable Bool<br>
    * Comments: <br>
    * @param solicitudUsuariosValidados The new value of the <code>solicitudUsuariosValidados</code> attribute.
    */
    public void setSolicitudUsuariosValidados (Boolean solicitudUsuariosValidados) {
        modifiedSolicitudUsuariosValidados = true;
        this.solicitudUsuariosValidados = solicitudUsuariosValidados;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudUsuariosValidados</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudUsuariosValidados</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudUsuariosValidados() {
        return modifiedSolicitudUsuariosValidados;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudUsuariosValidados</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudUsuariosValidados</code>.
    */
    public void setModifiedSolicitudUsuariosValidados(boolean modified) {
        this.modifiedSolicitudUsuariosValidados = modified;
    }

   /**
    * Returns the value of the <code>solicituddrvCuesMedOK</code> attribute.<br>
    * Model Attribute: <code>solicituddrvCuesMedOK</code>. Variable Bool<br>
    * Comments: Si se requiere cuestionario médico, para todos los usuarios se tiene que haber diligenciado<br>
    * @return The value of the <code>solicituddrvCuesMedOK</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvCuesMedOK()  {
    	Boolean value;
        try {
            value = solicituddrvCuesMedOKDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvCuesMedOK");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicitudNumContratoInclusion</code> attribute.<br>
    * Model Attribute: <code>solicitudNumContratoInclusion</code>. Constant String Size=50<br>
    * Comments: Indica el contrato al que se va a realizar la inclusión, cuando la solicitud es de inclusión<br>
    * @return The value of the <code>solicitudNumContratoInclusion</code> attribute.
    */

    public String getSolicitudNumContratoInclusion()  {
    	String value;
        value =  solicitudNumContratoInclusion;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>solicitudNumContratoInclusion</code> attribute.<br>
    * Model Attribute: <code>solicitudNumContratoInclusion</code>. Constant String Size=50<br>
    * Comments: Indica el contrato al que se va a realizar la inclusión, cuando la solicitud es de inclusión<br>
    * @param solicitudNumContratoInclusion The new value of the <code>solicitudNumContratoInclusion</code> attribute.
    */
    public void setSolicitudNumContratoInclusion (String solicitudNumContratoInclusion) {
        modifiedSolicitudNumContratoInclusion = true;
        this.solicitudNumContratoInclusion = solicitudNumContratoInclusion;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudNumContratoInclusion</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudNumContratoInclusion</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudNumContratoInclusion() {
        return modifiedSolicitudNumContratoInclusion;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNumContratoInclusion</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNumContratoInclusion</code>.
    */
    public void setModifiedSolicitudNumContratoInclusion(boolean modified) {
        this.modifiedSolicitudNumContratoInclusion = modified;
    }

   /**
    * Returns the value of the <code>solicitudNumFamilia</code> attribute.<br>
    * Model Attribute: <code>solicitudNumFamilia</code>. Constant String Size=5<br>
    * Comments: <br>
    * @return The value of the <code>solicitudNumFamilia</code> attribute.
    */

    public String getSolicitudNumFamilia()  {
    	String value;
        value =  solicitudNumFamilia;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>solicitudNumFamilia</code> attribute.<br>
    * Model Attribute: <code>solicitudNumFamilia</code>. Constant String Size=5<br>
    * Comments: <br>
    * @param solicitudNumFamilia The new value of the <code>solicitudNumFamilia</code> attribute.
    */
    public void setSolicitudNumFamilia (String solicitudNumFamilia) {
        modifiedSolicitudNumFamilia = true;
        this.solicitudNumFamilia = solicitudNumFamilia;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudNumFamilia</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudNumFamilia</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudNumFamilia() {
        return modifiedSolicitudNumFamilia;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudNumFamilia</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudNumFamilia</code>.
    */
    public void setModifiedSolicitudNumFamilia(boolean modified) {
        this.modifiedSolicitudNumFamilia = modified;
    }

   /**
    * Returns the value of the <code>solicituddrvYaTieneTitular</code> attribute.<br>
    * Model Attribute: <code>solicituddrvYaTieneTitular</code>. Variable Bool<br>
    * Comments: Este derivado sólo se utilizará en una precondición de un servicio. Pero se pone para que funcione la anticipación de precondiciones. <br>
    * @return The value of the <code>solicituddrvYaTieneTitular</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvYaTieneTitular()  {
    	Boolean value;
        try {
            value = solicituddrvYaTieneTitularDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvYaTieneTitular");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvDifValorCuota</code> attribute.<br>
    * Model Attribute: <code>solicituddrvDifValorCuota</code>. Variable Real<br>
    * Comments: La diferencia entre el valor de cuota que ha calculado el CORE y la que ha calculado AE<br>
    * @return The value of the <code>solicituddrvDifValorCuota</code> attribute.
    */

    @JsonIgnore
    public Double getSolicituddrvDifValorCuota()  {
    	Double value;
        try {
            value = solicituddrvDifValorCuotaDerivations();
        } catch (Exception e) {
            value = Double.valueOf(0);
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvDifValorCuota");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvDifValorDtoFinanciero</code> attribute.<br>
    * Model Attribute: <code>solicituddrvDifValorDtoFinanciero</code>. Variable Real<br>
    * Comments: La diferencia entre el valor de descuento financiero que ha calculado el CORE y la que ha calculado AE<br>
    * @return The value of the <code>solicituddrvDifValorDtoFinanciero</code> attribute.
    */

    @JsonIgnore
    public Double getSolicituddrvDifValorDtoFinanciero()  {
    	Double value;
        try {
            value = solicituddrvDifValorDtoFinancieroDerivations();
        } catch (Exception e) {
            value = Double.valueOf(0);
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvDifValorDtoFinanciero");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvDifValorIVA</code> attribute.<br>
    * Model Attribute: <code>solicituddrvDifValorIVA</code>. Variable Real<br>
    * Comments: La diferencia entre el valor iVA que ha calculado el CORE y la que ha calculado AE<br>
    * @return The value of the <code>solicituddrvDifValorIVA</code> attribute.
    */

    @JsonIgnore
    public Double getSolicituddrvDifValorIVA()  {
    	Double value;
        try {
            value = solicituddrvDifValorIVADerivations();
        } catch (Exception e) {
            value = Double.valueOf(0);
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvDifValorIVA");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvHayPreexistencias</code> attribute.<br>
    * Model Attribute: <code>solicituddrvHayPreexistencias</code>. Variable Bool<br>
    * Comments: Indica que algún usuario del contrato tiene preexistencias<br>
    * @return The value of the <code>solicituddrvHayPreexistencias</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvHayPreexistencias()  {
    	Boolean value;
        try {
            value = solicituddrvHayPreexistenciasDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvHayPreexistencias");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvContratoLegalizado</code> attribute.<br>
    * Model Attribute: <code>solicituddrvContratoLegalizado</code>. Variable Bool<br>
    * Comments: Indica que ya se ha realizado la segunda firma. Esto es, si la solicitud se generó con preexistencias, mientras no se haya realizado la firma aparecería como contrato legalizado No. En el caso de que no tenga preexistencias o de que si las tenga pero ya se haya realizado la segunda firma, aparecerá como Si<br>
    * @return The value of the <code>solicituddrvContratoLegalizado</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvContratoLegalizado()  {
    	Boolean value;
        try {
            value = solicituddrvContratoLegalizadoDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvContratoLegalizado");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvTieneSegundaFirma</code> attribute.<br>
    * Model Attribute: <code>solicituddrvTieneSegundaFirma</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>solicituddrvTieneSegundaFirma</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvTieneSegundaFirma()  {
    	Boolean value;
        try {
            value = solicituddrvTieneSegundaFirmaDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvTieneSegundaFirma");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvGrupoAsociado</code> attribute.<br>
    * Model Attribute: <code>solicituddrvGrupoAsociado</code>. Variable String Size=150<br>
    * Comments: Derivado para ser utilizado en el DS maestro de nueva afiliación e inclusión. Contiene código y descripción del grupo asociado<br>
    * @return The value of the <code>solicituddrvGrupoAsociado</code> attribute.
    */

    @JsonIgnore
    public String getSolicituddrvGrupoAsociado()  {
    	String value;
        try {
            value = solicituddrvGrupoAsociadoDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvGrupoAsociado");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>solicituddrvAplicaDocContrato</code> attribute.<br>
    * Model Attribute: <code>solicituddrvAplicaDocContrato</code>. Variable Bool<br>
    * Comments: Aplica para todas las solicitudes cuando el trámite es nueva afiliación<br>
    * @return The value of the <code>solicituddrvAplicaDocContrato</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvAplicaDocContrato()  {
    	Boolean value;
        try {
            value = solicituddrvAplicaDocContratoDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvAplicaDocContrato");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvAplicaDocCartaPree</code> attribute.<br>
    * Model Attribute: <code>solicituddrvAplicaDocCartaPree</code>. Variable Bool<br>
    * Comments: Aplica para integral y se genera cuando al menos un usuario tiene preexistencias<br>
    * @return The value of the <code>solicituddrvAplicaDocCartaPree</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvAplicaDocCartaPree()  {
    	Boolean value;
        try {
            value = solicituddrvAplicaDocCartaPreeDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvAplicaDocCartaPree");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvAplicaDocBBGestante</code> attribute.<br>
    * Model Attribute: <code>solicituddrvAplicaDocBBGestante</code>. Variable Bool<br>
    * Comments: Aplica para integral. Para todos los trámites siempre y cuando en la solicitud haya al menos un usuario con la condición de  bebe gestante<br>
    * @return The value of the <code>solicituddrvAplicaDocBBGestante</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvAplicaDocBBGestante()  {
    	Boolean value;
        try {
            value = solicituddrvAplicaDocBBGestanteDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvAplicaDocBBGestante");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvAplicaDocMaternidad</code> attribute.<br>
    * Model Attribute: <code>solicituddrvAplicaDocMaternidad</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>solicituddrvAplicaDocMaternidad</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvAplicaDocMaternidad()  {
    	Boolean value;
        try {
            value = solicituddrvAplicaDocMaternidadDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvAplicaDocMaternidad");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvAplicaCuestionario</code> attribute.<br>
    * Model Attribute: <code>solicituddrvAplicaCuestionario</code>. Variable Bool<br>
    * Comments: Aplica cuando dicho cuestionario se haya diligenciado al menos para un usuario<br>
    * @return The value of the <code>solicituddrvAplicaCuestionario</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvAplicaCuestionario()  {
    	Boolean value;
        try {
            value = solicituddrvAplicaCuestionarioDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvAplicaCuestionario");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvAplicaCartaEnt</code> attribute.<br>
    * Model Attribute: <code>solicituddrvAplicaCartaEnt</code>. Variable Bool<br>
    * Comments: Aplica para las solicitudes que tenga algún usuario para el cual el CORE devuelva que está pendiente de examen médico<br>
    * @return The value of the <code>solicituddrvAplicaCartaEnt</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvAplicaCartaEnt()  {
    	Boolean value;
        try {
            value = solicituddrvAplicaCartaEntDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvAplicaCartaEnt");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicitudEmailURLPagoEnviado</code> attribute.<br>
    * Model Attribute: <code>solicitudEmailURLPagoEnviado</code>. Variable String Size=999<br>
    * Comments: Guarda el resultado del envío del email de notificación de la URL de pago<br>
    * @return The value of the <code>solicitudEmailURLPagoEnviado</code> attribute.
    */

    public String getSolicitudEmailURLPagoEnviado()  {
    	String value;
        value =  solicitudEmailURLPagoEnviado;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>solicitudEmailURLPagoEnviado</code> attribute.<br>
    * Model Attribute: <code>solicitudEmailURLPagoEnviado</code>. Variable String Size=999<br>
    * Comments: Guarda el resultado del envío del email de notificación de la URL de pago<br>
    * @param solicitudEmailURLPagoEnviado The new value of the <code>solicitudEmailURLPagoEnviado</code> attribute.
    */
    public void setSolicitudEmailURLPagoEnviado (String solicitudEmailURLPagoEnviado) {
        modifiedSolicitudEmailURLPagoEnviado = true;
        this.solicitudEmailURLPagoEnviado = solicitudEmailURLPagoEnviado;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudEmailURLPagoEnviado</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudEmailURLPagoEnviado</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudEmailURLPagoEnviado() {
        return modifiedSolicitudEmailURLPagoEnviado;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudEmailURLPagoEnviado</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudEmailURLPagoEnviado</code>.
    */
    public void setModifiedSolicitudEmailURLPagoEnviado(boolean modified) {
        this.modifiedSolicitudEmailURLPagoEnviado = modified;
    }

   /**
    * Returns the value of the <code>solicitudEmailDocuEnviado</code> attribute.<br>
    * Model Attribute: <code>solicitudEmailDocuEnviado</code>. Variable String Size=999<br>
    * Comments: Guarda el resultado del envío del email de documentación<br>
    * @return The value of the <code>solicitudEmailDocuEnviado</code> attribute.
    */

    public String getSolicitudEmailDocuEnviado()  {
    	String value;
        value =  solicitudEmailDocuEnviado;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>solicitudEmailDocuEnviado</code> attribute.<br>
    * Model Attribute: <code>solicitudEmailDocuEnviado</code>. Variable String Size=999<br>
    * Comments: Guarda el resultado del envío del email de documentación<br>
    * @param solicitudEmailDocuEnviado The new value of the <code>solicitudEmailDocuEnviado</code> attribute.
    */
    public void setSolicitudEmailDocuEnviado (String solicitudEmailDocuEnviado) {
        modifiedSolicitudEmailDocuEnviado = true;
        this.solicitudEmailDocuEnviado = solicitudEmailDocuEnviado;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudEmailDocuEnviado</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudEmailDocuEnviado</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudEmailDocuEnviado() {
        return modifiedSolicitudEmailDocuEnviado;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudEmailDocuEnviado</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudEmailDocuEnviado</code>.
    */
    public void setModifiedSolicitudEmailDocuEnviado(boolean modified) {
        this.modifiedSolicitudEmailDocuEnviado = modified;
    }

   /**
    * Returns the value of the <code>solicitudDocsEnviados</code> attribute.<br>
    * Model Attribute: <code>solicitudDocsEnviados</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>solicitudDocsEnviados</code> attribute.
    */

    public Boolean getSolicitudDocsEnviados()  {
    	Boolean value;
        value =  solicitudDocsEnviados;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudDocsEnviados</code> attribute.<br>
    * Model Attribute: <code>solicitudDocsEnviados</code>. Variable Bool<br>
    * Comments: <br>
    * @param solicitudDocsEnviados The new value of the <code>solicitudDocsEnviados</code> attribute.
    */
    public void setSolicitudDocsEnviados (Boolean solicitudDocsEnviados) {
        modifiedSolicitudDocsEnviados = true;
        this.solicitudDocsEnviados = solicitudDocsEnviados;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudDocsEnviados</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudDocsEnviados</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudDocsEnviados() {
        return modifiedSolicitudDocsEnviados;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudDocsEnviados</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudDocsEnviados</code>.
    */
    public void setModifiedSolicitudDocsEnviados(boolean modified) {
        this.modifiedSolicitudDocsEnviados = modified;
    }

   /**
    * Returns the value of the <code>solicituddrvTotalConAnexos</code> attribute.<br>
    * Model Attribute: <code>solicituddrvTotalConAnexos</code>. Variable Real<br>
    * Comments: Si dentro de la solicitud se adiciona un anexo maternidad o un anexo maternidad y anexo neonatal al valor a enviar a la URL de pago se debe sumar el valor que tenga parametrizada la tarifa para estos anexos. Esto aplica tanto para Nueva Afiliación e Inclusion. <br>
    * @return The value of the <code>solicituddrvTotalConAnexos</code> attribute.
    */

    @JsonIgnore
    public Double getSolicituddrvTotalConAnexos()  {
    	Double value;
        try {
            value = solicituddrvTotalConAnexosDerivations();
        } catch (Exception e) {
            value = Double.valueOf(0);
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvTotalConAnexos");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvContratanteEsTitular</code> attribute.<br>
    * Model Attribute: <code>solicituddrvContratanteEsTitular</code>. Variable Bool<br>
    * Comments: Se utiliza en precondiciones de OGENERARSOLICITUD<br>
    * @return The value of the <code>solicituddrvContratanteEsTitular</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvContratanteEsTitular()  {
    	Boolean value;
        try {
            value = solicituddrvContratanteEsTitularDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvContratanteEsTitular");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvAlgunBeneficiarioEPSSanitas</code> attribute.<br>
    * Model Attribute: <code>solicituddrvAlgunBeneficiarioEPSSanitas</code>. Variable Bool<br>
    * Comments: Se usa para mostrar en PIU_EstatusSolicitudes si algún beneficiario de la solicitud tiene EPS Sanitas<br>
    * @return The value of the <code>solicituddrvAlgunBeneficiarioEPSSanitas</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvAlgunBeneficiarioEPSSanitas()  {
    	Boolean value;
        try {
            value = solicituddrvAlgunBeneficiarioEPSSanitasDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvAlgunBeneficiarioEPSSanitas");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicitudcodDirector</code> attribute.<br>
    * Model Attribute: <code>solicitudcodDirector</code>. Constant String Size=50<br>
    * Comments: Código del Director del Asesor que crea la solicitud (dato a enviar al CORE para que éste comisione)<br>
    * @return The value of the <code>solicitudcodDirector</code> attribute.
    */

    public String getSolicitudcodDirector()  {
    	String value;
        value =  solicitudcodDirector;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>solicitudcodDirector</code> attribute.<br>
    * Model Attribute: <code>solicitudcodDirector</code>. Constant String Size=50<br>
    * Comments: Código del Director del Asesor que crea la solicitud (dato a enviar al CORE para que éste comisione)<br>
    * @param solicitudcodDirector The new value of the <code>solicitudcodDirector</code> attribute.
    */
    public void setSolicitudcodDirector (String solicitudcodDirector) {
        modifiedSolicitudcodDirector = true;
        this.solicitudcodDirector = solicitudcodDirector;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudcodDirector</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudcodDirector</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudcodDirector() {
        return modifiedSolicitudcodDirector;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudcodDirector</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudcodDirector</code>.
    */
    public void setModifiedSolicitudcodDirector(boolean modified) {
        this.modifiedSolicitudcodDirector = modified;
    }

   /**
    * Returns the value of the <code>solicituddrvListaErrores</code> attribute.<br>
    * Model Attribute: <code>solicituddrvListaErrores</code>. Variable Text<br>
    * Comments: Formamos en un string los errores WS de la solicitud. Cadena vacía si no tiene<br>
    * @return The value of the <code>solicituddrvListaErrores</code> attribute.
    */

    @JsonIgnore
    public String getSolicituddrvListaErrores()  {
    	String value;
        try {
            value = solicituddrvListaErroresDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvListaErrores");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicitudvalorCuotaBrutaC</code> attribute.<br>
    * Model Attribute: <code>solicitudvalorCuotaBrutaC</code>. Variable Real<br>
    * Comments: El dato que devuelve el CORE para la cuota bruta<br>
    * @return The value of the <code>solicitudvalorCuotaBrutaC</code> attribute.
    */

    public Double getSolicitudvalorCuotaBrutaC()  {
    	Double value;
        value =  solicitudvalorCuotaBrutaC;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudvalorCuotaBrutaC</code> attribute.<br>
    * Model Attribute: <code>solicitudvalorCuotaBrutaC</code>. Variable Real<br>
    * Comments: El dato que devuelve el CORE para la cuota bruta<br>
    * @param solicitudvalorCuotaBrutaC The new value of the <code>solicitudvalorCuotaBrutaC</code> attribute.
    */
    public void setSolicitudvalorCuotaBrutaC (Double solicitudvalorCuotaBrutaC) {
        modifiedSolicitudvalorCuotaBrutaC = true;
        this.solicitudvalorCuotaBrutaC = solicitudvalorCuotaBrutaC;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudvalorCuotaBrutaC</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudvalorCuotaBrutaC</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudvalorCuotaBrutaC() {
        return modifiedSolicitudvalorCuotaBrutaC;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudvalorCuotaBrutaC</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudvalorCuotaBrutaC</code>.
    */
    public void setModifiedSolicitudvalorCuotaBrutaC(boolean modified) {
        this.modifiedSolicitudvalorCuotaBrutaC = modified;
    }

   /**
    * Returns the value of the <code>solicituddrvDifValorCuotaBruta</code> attribute.<br>
    * Model Attribute: <code>solicituddrvDifValorCuotaBruta</code>. Variable Real<br>
    * Comments: La diferencia entre el valor de cuota bruta que ha calculado el CORE y la que ha calculado AE<br>
    * @return The value of the <code>solicituddrvDifValorCuotaBruta</code> attribute.
    */

    @JsonIgnore
    public Double getSolicituddrvDifValorCuotaBruta()  {
    	Double value;
        try {
            value = solicituddrvDifValorCuotaBrutaDerivations();
        } catch (Exception e) {
            value = Double.valueOf(0);
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvDifValorCuotaBruta");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvNumTitulares</code> attribute.<br>
    * Model Attribute: <code>solicituddrvNumTitulares</code>. Variable Nat<br>
    * Comments: Cuenta cuantos usuarios o usuarios registrados activos tienen la marca de titular<br>
    * @return The value of the <code>solicituddrvNumTitulares</code> attribute.
    */

    @JsonIgnore
    public Long getSolicituddrvNumTitulares()  {
    	Long value;
        try {
            value = solicituddrvNumTitularesDerivations();
        } catch (Exception e) {
            value = Long.valueOf(0);
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvNumTitulares");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvEnviarEmailDoc</code> attribute.<br>
    * Model Attribute: <code>solicituddrvEnviarEmailDoc</code>. Variable Bool<br>
    * Comments: La opción de enviar por correo electrónico todos los documentos se debe lanzar de forma automática dependiendo de una serie de condiciones y reglas de negocio. Hasta el momento se han identificado estas:
1. Que el titular  de la familia no sea persona jurídica, que tenga correo electrónico asociado, que  tengan  la  marcación  de  documento  como "DOCUMENTACION  APROBADA" , que tenga la primera firma y que tenga la marcación de solicitud completa.
2. Si el contrato requiere segunda firma que la solicitud sea: nueva  afiliación generada desde afiliación  electrónica, que  se  hayan  aceptado  las preexistencias, que tenga segunda firma, que  tengan  la  marcación  de  documento  como "DOCUMENTACION  APROBADA" y que tenga la marcación solicitud completa.

- Que el titular  de la familia no sea persona jurídica (Titular.TipoIdentificacion.NIT = FALSE) , 
- Que tenga correo electrónico asociado (Titular.CorreoElectronico <> NULL), 
- Que  tengan  la  marcación  de  documento  como "DOCUMENTACION  APROBADA" (drvEstadoDoc = 2) 
- Que tenga la primera firma (EXIST(Firma) = TRUE) 
- Que tenga la marcación de solicitud completa:
                drvYaTieneContratante = TRUE
                datosPagoOK = TRUE
                FOR ALL Usuarios (Usuarios.drvTieneDocumentos = TRUE)
                FOR ALL Usuarios (Usuarios.drvTieneParentesco = TRUE)
                (tipoContrato = 1 AND ContratantePersona.TipoPersona = "J" AND (COUNT(Usuarios ) WHERE (Usuarios.Parentesco.EsTitular = TRUE) + COUNT(UsuariosRegistrados ) WHERE (UsuariosRegistrados.Parentesco.EsTitular = TRUE)) = 1) OR (tipoContrato <> 1 OR ContratantePersona.TipoPersona <> "J")

GdC-14:Req. 57: Envío de documentación de la solicitud de forma automática. 
Para el envío automático de la documentación de una solicitud, esta debe encontrarse en el estado Tramitada o Tramitada con preexistencias, únicamente es esos dos estados.


2. Si el contrato requiere segunda firma (drvHayPreexistencias = TRUE) 
 - Que la solicitud sea: nueva  afiliación generada desde afiliación  electrónica, que  se  hayan  aceptado  las preexistencias , que tenga segunda firma (drvTieneSegundaFirma = TRUE),<br>
    * @return The value of the <code>solicituddrvEnviarEmailDoc</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvEnviarEmailDoc()  {
    	Boolean value;
        try {
            value = solicituddrvEnviarEmailDocDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvEnviarEmailDoc");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvAplicaDocNeonatal</code> attribute.<br>
    * Model Attribute: <code>solicituddrvAplicaDocNeonatal</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>solicituddrvAplicaDocNeonatal</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvAplicaDocNeonatal()  {
    	Boolean value;
        try {
            value = solicituddrvAplicaDocNeonatalDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvAplicaDocNeonatal");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicitudCodTarifa</code> attribute.<br>
    * Model Attribute: <code>solicitudCodTarifa</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>solicitudCodTarifa</code> attribute.
    */

    public String getSolicitudCodTarifa()  {
    	String value;
        value =  solicitudCodTarifa;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>solicitudCodTarifa</code> attribute.<br>
    * Model Attribute: <code>solicitudCodTarifa</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param solicitudCodTarifa The new value of the <code>solicitudCodTarifa</code> attribute.
    */
    public void setSolicitudCodTarifa (String solicitudCodTarifa) {
        modifiedSolicitudCodTarifa = true;
        this.solicitudCodTarifa = solicitudCodTarifa;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudCodTarifa</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudCodTarifa</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudCodTarifa() {
        return modifiedSolicitudCodTarifa;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudCodTarifa</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudCodTarifa</code>.
    */
    public void setModifiedSolicitudCodTarifa(boolean modified) {
        this.modifiedSolicitudCodTarifa = modified;
    }

   /**
    * Returns the value of the <code>solicituddrvAplicaCarnets</code> attribute.<br>
    * Model Attribute: <code>solicituddrvAplicaCarnets</code>. Variable Bool<br>
    * Comments: Aplica cuando el report de carnets <br>
    * @return The value of the <code>solicituddrvAplicaCarnets</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvAplicaCarnets()  {
    	Boolean value;
        try {
            value = solicituddrvAplicaCarnetsDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvAplicaCarnets");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvAplicaDocSolicitud</code> attribute.<br>
    * Model Attribute: <code>solicituddrvAplicaDocSolicitud</code>. Variable Bool<br>
    * Comments: Si así no indica el Dominio<br>
    * @return The value of the <code>solicituddrvAplicaDocSolicitud</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvAplicaDocSolicitud()  {
    	Boolean value;
        try {
            value = solicituddrvAplicaDocSolicitudDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvAplicaDocSolicitud");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvPuedeReplicar</code> attribute.<br>
    * Model Attribute: <code>solicituddrvPuedeReplicar</code>. Variable Bool<br>
    * Comments: Devuelve si se puede replicar o no la solicitud, para añadirlo como precondición al servicio de replicar<br>
    * @return The value of the <code>solicituddrvPuedeReplicar</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvPuedeReplicar()  {
    	Boolean value;
        try {
            value = solicituddrvPuedeReplicarDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvPuedeReplicar");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicitudCompletada</code> attribute.<br>
    * Model Attribute: <code>solicitudCompletada</code>. Variable Bool<br>
    * Comments: GC3: Crear una marcación que indique que la solicitud ya fue completada por el asesor. 
Las solicitudes de inclusión requieren que la documentación sea aprobada previamente a su generación. Dado que el Agente no puede aprobarla y debe hacerlo otro rol, sería preferible no lanzar el proceso de generación desde la pantalla y en su lugar lanzar el proceso que cambia el valor de la nueva marca a "Sí". 
Una vez la solicitud tiene como valor en la nueva marca "Sí", no aparecerá en la opción "Consultar radicado" y aparecería en la opción "Estatus de solicitudes" y el valor en el campo estado será "Radicado".
A partir de ese momento, se aprueba la documentación, se replicar y el proceso sigue como está definido.<br>
    * @return The value of the <code>solicitudCompletada</code> attribute.
    */

    public Boolean getSolicitudCompletada()  {
    	Boolean value;
        value =  solicitudCompletada;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudCompletada</code> attribute.<br>
    * Model Attribute: <code>solicitudCompletada</code>. Variable Bool<br>
    * Comments: GC3: Crear una marcación que indique que la solicitud ya fue completada por el asesor. 
Las solicitudes de inclusión requieren que la documentación sea aprobada previamente a su generación. Dado que el Agente no puede aprobarla y debe hacerlo otro rol, sería preferible no lanzar el proceso de generación desde la pantalla y en su lugar lanzar el proceso que cambia el valor de la nueva marca a "Sí". 
Una vez la solicitud tiene como valor en la nueva marca "Sí", no aparecerá en la opción "Consultar radicado" y aparecería en la opción "Estatus de solicitudes" y el valor en el campo estado será "Radicado".
A partir de ese momento, se aprueba la documentación, se replicar y el proceso sigue como está definido.<br>
    * @param solicitudCompletada The new value of the <code>solicitudCompletada</code> attribute.
    */
    public void setSolicitudCompletada (Boolean solicitudCompletada) {
        modifiedSolicitudCompletada = true;
        this.solicitudCompletada = solicitudCompletada;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudCompletada</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudCompletada</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudCompletada() {
        return modifiedSolicitudCompletada;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudCompletada</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudCompletada</code>.
    */
    public void setModifiedSolicitudCompletada(boolean modified) {
        this.modifiedSolicitudCompletada = modified;
    }

   /**
    * Returns the value of the <code>solicituddrvCambiarBenefCont</code> attribute.<br>
    * Model Attribute: <code>solicituddrvCambiarBenefCont</code>. Variable Bool<br>
    * Comments: Indica si se puede modificar la marca de "Titular con beneficios" del contratante para una inclusión en contrato familiar.
Si se cumplen las siguientes condiciones:
- El contratante es persona natural
- El contratante no viene marcado como titular con beneficios, por lo tanto, no figura como usuario registrado en el contrato
- No existe otro usuario activo en el contrato con el parentesco "Titular"<br>
    * @return The value of the <code>solicituddrvCambiarBenefCont</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvCambiarBenefCont()  {
    	Boolean value;
        try {
            value = solicituddrvCambiarBenefContDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvCambiarBenefCont");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicitudEstado</code> attribute.<br>
    * Model Attribute: <code>solicitudEstado</code>. Variable Int<br>
    * Comments: Indica el estado de la solicitud. Antes era una relación con la clase EstadoContratoAE, pero a fecha 6/10/16 Juan Carlos Quinche estuvo de acuerdo en eliminar esa paramétrica puesto que no resulta de utilidad. El estado de la solicitud depende de la respuesta del CORE al generarla, según unas reglas que no son parametrizables.<br>
    * @return The value of the <code>solicitudEstado</code> attribute.
    */

    public Long getSolicitudEstado()  {
    	Long value;
        value =  solicitudEstado;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudEstado</code> attribute.<br>
    * Model Attribute: <code>solicitudEstado</code>. Variable Int<br>
    * Comments: Indica el estado de la solicitud. Antes era una relación con la clase EstadoContratoAE, pero a fecha 6/10/16 Juan Carlos Quinche estuvo de acuerdo en eliminar esa paramétrica puesto que no resulta de utilidad. El estado de la solicitud depende de la respuesta del CORE al generarla, según unas reglas que no son parametrizables.<br>
    * @param solicitudEstado The new value of the <code>solicitudEstado</code> attribute.
    */
    public void setSolicitudEstado (Long solicitudEstado) {
        modifiedSolicitudEstado = true;
        this.solicitudEstado = solicitudEstado;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudEstado</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudEstado</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudEstado() {
        return modifiedSolicitudEstado;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudEstado</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudEstado</code>.
    */
    public void setModifiedSolicitudEstado(boolean modified) {
        this.modifiedSolicitudEstado = modified;
    }

   /**
    * Returns the value of the <code>solicituddrvEdadTitular</code> attribute.<br>
    * Model Attribute: <code>solicituddrvEdadTitular</code>. Variable Int<br>
    * Comments: Devuelve la edad del usuario con parentesco Titular. Si no lo hay devuelve cero<br>
    * @return The value of the <code>solicituddrvEdadTitular</code> attribute.
    */

    @JsonIgnore
    public Long getSolicituddrvEdadTitular()  {
    	Long value;
        try {
            value = solicituddrvEdadTitularDerivations();
        } catch (Exception e) {
            value = Long.valueOf(0);
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvEdadTitular");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvGeneroTitular</code> attribute.<br>
    * Model Attribute: <code>solicituddrvGeneroTitular</code>. Variable String Size=1<br>
    * Comments: Devuelve el género del usuario con parentesco Titular. Si no lo hay devuelve cadena vacía<br>
    * @return The value of the <code>solicituddrvGeneroTitular</code> attribute.
    */

    @JsonIgnore
    public String getSolicituddrvGeneroTitular()  {
    	String value;
        try {
            value = solicituddrvGeneroTitularDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvGeneroTitular");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>solicituddrvTieneTitular</code> attribute.<br>
    * Model Attribute: <code>solicituddrvTieneTitular</code>. Variable Bool<br>
    * Comments: Devuelve true si existe un Usuario con parentesco Titular<br>
    * @return The value of the <code>solicituddrvTieneTitular</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvTieneTitular()  {
    	Boolean value;
        try {
            value = solicituddrvTieneTitularDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvTieneTitular");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvObservacionesReport</code> attribute.<br>
    * Model Attribute: <code>solicituddrvObservacionesReport</code>. Variable Text<br>
    * Comments: GC3-15: Forma el texto de las observaciones según se indica en requisitos<br>
    * @return The value of the <code>solicituddrvObservacionesReport</code> attribute.
    */

    @JsonIgnore
    public String getSolicituddrvObservacionesReport()  {
    	String value;
        try {
            value = solicituddrvObservacionesReportDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvObservacionesReport");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvIgnorarPreexistencias</code> attribute.<br>
    * Model Attribute: <code>solicituddrvIgnorarPreexistencias</code>. Variable Bool<br>
    * Comments: Significa que al cambiar el estado de la solicitud, aunque tenga preexistencias se debe marcar como TRAMITADA en vez de como TRAMITADA CON PREEXISTENCIAS. Esto depende de una marcación del dominio. GdC4
Tanto el Plan como el Dominio pueden indicar que se ignoran las preexistencias<br>
    * @return The value of the <code>solicituddrvIgnorarPreexistencias</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvIgnorarPreexistencias()  {
    	Boolean value;
        try {
            value = solicituddrvIgnorarPreexistenciasDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvIgnorarPreexistencias");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvTienePrimeraFirma</code> attribute.<br>
    * Model Attribute: <code>solicituddrvTienePrimeraFirma</code>. Variable Bool<br>
    * Comments: GC4-10<br>
    * @return The value of the <code>solicituddrvTienePrimeraFirma</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvTienePrimeraFirma()  {
    	Boolean value;
        try {
            value = solicituddrvTienePrimeraFirmaDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvTienePrimeraFirma");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvNumContrato</code> attribute.<br>
    * Model Attribute: <code>solicituddrvNumContrato</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>solicituddrvNumContrato</code> attribute.
    */

    @JsonIgnore
    public String getSolicituddrvNumContrato()  {
    	String value;
        try {
            value = solicituddrvNumContratoDerivations();
        } catch (Exception e) {
            value = "";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvNumContrato");
        }
        return (value == null ? null : value.trim());
    }

   /**
    * Returns the value of the <code>solicitudFIniVigContInc</code> attribute.<br>
    * Model Attribute: <code>solicitudFIniVigContInc</code>. Variable Date<br>
    * Comments: fecha de inicio de vigencia del contrato de inclusión. utilizada para control documentos de solicitud. Inicializado por proceso de recuperacion de datos desde el core<br>
    * @return The value of the <code>solicitudFIniVigContInc</code> attribute.
    */

    public Date getSolicitudFIniVigContInc()  {
    	Date value;
        value =  solicitudFIniVigContInc;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudFIniVigContInc</code> attribute.<br>
    * Model Attribute: <code>solicitudFIniVigContInc</code>. Variable Date<br>
    * Comments: fecha de inicio de vigencia del contrato de inclusión. utilizada para control documentos de solicitud. Inicializado por proceso de recuperacion de datos desde el core<br>
    * @param solicitudFIniVigContInc The new value of the <code>solicitudFIniVigContInc</code> attribute.
    */
    public void setSolicitudFIniVigContInc (Date solicitudFIniVigContInc) {
        modifiedSolicitudFIniVigContInc = true;
        this.solicitudFIniVigContInc = solicitudFIniVigContInc;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudFIniVigContInc</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudFIniVigContInc</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudFIniVigContInc() {
        return modifiedSolicitudFIniVigContInc;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudFIniVigContInc</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudFIniVigContInc</code>.
    */
    public void setModifiedSolicitudFIniVigContInc(boolean modified) {
        this.modifiedSolicitudFIniVigContInc = modified;
    }

   /**
    * Returns the value of the <code>solicituddrvImpTarifaPlanVol</code> attribute.<br>
    * Model Attribute: <code>solicituddrvImpTarifaPlanVol</code>. Variable Real<br>
    * Comments: Req. 8: Postular valor de tarifas Referencia: HU-AEEPS-08
Parametrización de tarifas por producto, plan y tipo de contrato (familiar, individual y colectivo).
Para la solicitud es la suma del importe de la tarifa para cada usuario. Si alguno tiene importe cero es porque no se ha encontrado la tarifa, por lo tanto asignamos valor cero
<br>
    * @return The value of the <code>solicituddrvImpTarifaPlanVol</code> attribute.
    */

    @JsonIgnore
    public Double getSolicituddrvImpTarifaPlanVol()  {
    	Double value;
        try {
            value = solicituddrvImpTarifaPlanVolDerivations();
        } catch (Exception e) {
            value = Double.valueOf(0);
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvImpTarifaPlanVol");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvAplicaDocProtDatos</code> attribute.<br>
    * Model Attribute: <code>solicituddrvAplicaDocProtDatos</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>solicituddrvAplicaDocProtDatos</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvAplicaDocProtDatos()  {
    	Boolean value;
        try {
            value = solicituddrvAplicaDocProtDatosDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvAplicaDocProtDatos");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicitudPorcentajeProrrateo</code> attribute.<br>
    * Model Attribute: <code>solicitudPorcentajeProrrateo</code>. Variable Real<br>
    * Comments: <br>
    * @return The value of the <code>solicitudPorcentajeProrrateo</code> attribute.
    */

    public Double getSolicitudPorcentajeProrrateo()  {
    	Double value;
        value =  solicitudPorcentajeProrrateo;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudPorcentajeProrrateo</code> attribute.<br>
    * Model Attribute: <code>solicitudPorcentajeProrrateo</code>. Variable Real<br>
    * Comments: <br>
    * @param solicitudPorcentajeProrrateo The new value of the <code>solicitudPorcentajeProrrateo</code> attribute.
    */
    public void setSolicitudPorcentajeProrrateo (Double solicitudPorcentajeProrrateo) {
        modifiedSolicitudPorcentajeProrrateo = true;
        this.solicitudPorcentajeProrrateo = solicitudPorcentajeProrrateo;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudPorcentajeProrrateo</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudPorcentajeProrrateo</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudPorcentajeProrrateo() {
        return modifiedSolicitudPorcentajeProrrateo;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudPorcentajeProrrateo</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudPorcentajeProrrateo</code>.
    */
    public void setModifiedSolicitudPorcentajeProrrateo(boolean modified) {
        this.modifiedSolicitudPorcentajeProrrateo = modified;
    }

   /**
    * Returns the value of the <code>solicituddrvPuedeModificarGrupo</code> attribute.<br>
    * Model Attribute: <code>solicituddrvPuedeModificarGrupo</code>. Variable Bool<br>
    * Comments: <br>
    * @return The value of the <code>solicituddrvPuedeModificarGrupo</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvPuedeModificarGrupo()  {
    	Boolean value;
        try {
            value = solicituddrvPuedeModificarGrupoDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvPuedeModificarGrupo");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicitudGrupoDelCORE</code> attribute.<br>
    * Model Attribute: <code>solicitudGrupoDelCORE</code>. Variable Int<br>
    * Comments: GdC-14:Req. 16: Modificación del grupo asociado en inclusiones
Esta modificación se debe ver reflejada en observaciones de la solicitud (se debe ver el nuevo código de grupo asociado).
En este nos guardaremos el código del grupo original, el recuperado del CORE
Si toma valor NULL, significa que NO ha sido modificado el Grupo
Si toma valor -1, significa que NO tenía grupo asociado
Si toma cualquier otro valor, es el código del grupo original<br>
    * @return The value of the <code>solicitudGrupoDelCORE</code> attribute.
    */

    public Long getSolicitudGrupoDelCORE()  {
    	Long value;
        value =  solicitudGrupoDelCORE;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudGrupoDelCORE</code> attribute.<br>
    * Model Attribute: <code>solicitudGrupoDelCORE</code>. Variable Int<br>
    * Comments: GdC-14:Req. 16: Modificación del grupo asociado en inclusiones
Esta modificación se debe ver reflejada en observaciones de la solicitud (se debe ver el nuevo código de grupo asociado).
En este nos guardaremos el código del grupo original, el recuperado del CORE
Si toma valor NULL, significa que NO ha sido modificado el Grupo
Si toma valor -1, significa que NO tenía grupo asociado
Si toma cualquier otro valor, es el código del grupo original<br>
    * @param solicitudGrupoDelCORE The new value of the <code>solicitudGrupoDelCORE</code> attribute.
    */
    public void setSolicitudGrupoDelCORE (Long solicitudGrupoDelCORE) {
        modifiedSolicitudGrupoDelCORE = true;
        this.solicitudGrupoDelCORE = solicitudGrupoDelCORE;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudGrupoDelCORE</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudGrupoDelCORE</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudGrupoDelCORE() {
        return modifiedSolicitudGrupoDelCORE;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudGrupoDelCORE</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudGrupoDelCORE</code>.
    */
    public void setModifiedSolicitudGrupoDelCORE(boolean modified) {
        this.modifiedSolicitudGrupoDelCORE = modified;
    }

   /**
    * Returns the value of the <code>solicitudTipoFacturaCORE</code> attribute.<br>
    * Model Attribute: <code>solicitudTipoFacturaCORE</code>. Variable String Size=20<br>
    * Comments: GdC-14:Req. 24: Dato factura electrónica en inclusión
Este atributo almacena el valor del código de factura recibido del CORE. utilizao para comparar con el actual y saber si debe actualizarse el contrato en el CORE o no.<br>
    * @return The value of the <code>solicitudTipoFacturaCORE</code> attribute.
    */

    public String getSolicitudTipoFacturaCORE()  {
    	String value;
        value =  solicitudTipoFacturaCORE;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>solicitudTipoFacturaCORE</code> attribute.<br>
    * Model Attribute: <code>solicitudTipoFacturaCORE</code>. Variable String Size=20<br>
    * Comments: GdC-14:Req. 24: Dato factura electrónica en inclusión
Este atributo almacena el valor del código de factura recibido del CORE. utilizao para comparar con el actual y saber si debe actualizarse el contrato en el CORE o no.<br>
    * @param solicitudTipoFacturaCORE The new value of the <code>solicitudTipoFacturaCORE</code> attribute.
    */
    public void setSolicitudTipoFacturaCORE (String solicitudTipoFacturaCORE) {
        modifiedSolicitudTipoFacturaCORE = true;
        this.solicitudTipoFacturaCORE = solicitudTipoFacturaCORE;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudTipoFacturaCORE</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudTipoFacturaCORE</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudTipoFacturaCORE() {
        return modifiedSolicitudTipoFacturaCORE;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudTipoFacturaCORE</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudTipoFacturaCORE</code>.
    */
    public void setModifiedSolicitudTipoFacturaCORE(boolean modified) {
        this.modifiedSolicitudTipoFacturaCORE = modified;
    }

   /**
    * Returns the value of the <code>solicituddrvAplicaPolizaInternacional</code> attribute.<br>
    * Model Attribute: <code>solicituddrvAplicaPolizaInternacional</code>. Variable Bool<br>
    * Comments: Devuelte true si para el dominio aplica solicitar póliza internacional <br>
    * @return The value of the <code>solicituddrvAplicaPolizaInternacional</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvAplicaPolizaInternacional()  {
    	Boolean value;
        try {
            value = solicituddrvAplicaPolizaInternacionalDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvAplicaPolizaInternacional");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvPolizaInternacional</code> attribute.<br>
    * Model Attribute: <code>solicituddrvPolizaInternacional</code>. Variable Bool<br>
    * Comments: GdC-14: Req.75 En la opción de “Estatus de solicitudes”, deberá aparecer una nueva columna llamada “Póliza Internacional” que tomará el valor “Sí”, cuando cualquiera de sus beneficiarios tenga la marca de póliza internacional.

GdC-23 Req 10: Cambio de nombre Póliza Internacional
Se solicita cambiar el nombre de “Póliza internacional” por “Respaldo global”.<br>
    * @return The value of the <code>solicituddrvPolizaInternacional</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvPolizaInternacional()  {
    	Boolean value;
        try {
            value = solicituddrvPolizaInternacionalDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvPolizaInternacional");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvPermiteRechazados</code> attribute.<br>
    * Model Attribute: <code>solicituddrvPermiteRechazados</code>. Variable Bool<br>
    * Comments: Indica si el plan asociado permite o no añadir rechazados en afiliación<br>
    * @return The value of the <code>solicituddrvPermiteRechazados</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvPermiteRechazados()  {
    	Boolean value;
        try {
            value = solicituddrvPermiteRechazadosDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvPermiteRechazados");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvAlgunUsuarioIMC</code> attribute.<br>
    * Model Attribute: <code>solicituddrvAlgunUsuarioIMC</code>. Variable Bool<br>
    * Comments: Indica si algún usuario supera el IMC configurado en el sistema<br>
    * @return The value of the <code>solicituddrvAlgunUsuarioIMC</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvAlgunUsuarioIMC()  {
    	Boolean value;
        try {
            value = solicituddrvAlgunUsuarioIMCDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvAlgunUsuarioIMC");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvFechaPorcenIVA</code> attribute.<br>
    * Model Attribute: <code>solicituddrvFechaPorcenIVA</code>. Variable Date<br>
    * Comments: Fecha a emplear para localizar el porcentaje de IVA que le corresponde. 
GdC-19 Req 1: Preliquidación del IVA.
Se modifica el método para localizar el porcentaje de IVA a aplicar en la solicitud cuando se trata de un Plan Voluntario.
El valor del porcentaje de IVA será el que se encuentra parametrizado por producto-plan y utilizando la fecha del primer día del siguiente mes a la fecha de ejecución.
Una vez que la solicitud se marque como completada, el cálculo del porcentaje de IVA se realizará como hasta ahora se venía realizando, utilizando la fecha de inicio de contratación.<br>
    * @return The value of the <code>solicituddrvFechaPorcenIVA</code> attribute.
    */

    @JsonIgnore
    public Date getSolicituddrvFechaPorcenIVA()  {
    	Date value;
        try {
            value = solicituddrvFechaPorcenIVADerivations();
        } catch (Exception e) {
            value = Date.valueOf(Constants.DATE_DEFAULTVALUE);
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvFechaPorcenIVA");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicitudResultSMSInfoPago</code> attribute.<br>
    * Model Attribute: <code>solicitudResultSMSInfoPago</code>. Variable String Size=999<br>
    * Comments: Guarda el resultado del envío del SMS con la información de pago.
GdC-19 Req 2: El momento en el que se debe enviar el SMS es cuando el usuario pinche por primera vez sobre la opción 'Ver PDF' de la pantalla de solicitud.<br>
    * @return The value of the <code>solicitudResultSMSInfoPago</code> attribute.
    */

    public String getSolicitudResultSMSInfoPago()  {
    	String value;
        value =  solicitudResultSMSInfoPago;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>solicitudResultSMSInfoPago</code> attribute.<br>
    * Model Attribute: <code>solicitudResultSMSInfoPago</code>. Variable String Size=999<br>
    * Comments: Guarda el resultado del envío del SMS con la información de pago.
GdC-19 Req 2: El momento en el que se debe enviar el SMS es cuando el usuario pinche por primera vez sobre la opción 'Ver PDF' de la pantalla de solicitud.<br>
    * @param solicitudResultSMSInfoPago The new value of the <code>solicitudResultSMSInfoPago</code> attribute.
    */
    public void setSolicitudResultSMSInfoPago (String solicitudResultSMSInfoPago) {
        modifiedSolicitudResultSMSInfoPago = true;
        this.solicitudResultSMSInfoPago = solicitudResultSMSInfoPago;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudResultSMSInfoPago</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudResultSMSInfoPago</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudResultSMSInfoPago() {
        return modifiedSolicitudResultSMSInfoPago;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudResultSMSInfoPago</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudResultSMSInfoPago</code>.
    */
    public void setModifiedSolicitudResultSMSInfoPago(boolean modified) {
        this.modifiedSolicitudResultSMSInfoPago = modified;
    }

   /**
    * Returns the value of the <code>solicitudFechaCompletada</code> attribute.<br>
    * Model Attribute: <code>solicitudFechaCompletada</code>. Variable DateTime<br>
    * Comments: GdC-23 Req 2: Se solicita adicionar una columna en la opción de Estatus Solicitudes que tenga el título 'Fecha Marca Completada'. 
Este nuevo campo tomará el valor de la fecha y hora en la que el asesor da por completada/generada la solicitud.
Este nuevo campo deberá aparecer en la tabla de 'Estatus de Solicitudes', en medio de 'Fecha Elaboración' y 'Fecha Inicio Contratación', con la cabecera 'Fecha Marca Completada'. El formato de la fecha debe ser dd/mm/aaaa hh:mm:ss, hora 24.<br>
    * @return The value of the <code>solicitudFechaCompletada</code> attribute.
    */

    public Timestamp getSolicitudFechaCompletada()  {
    	Timestamp value;
        value =  solicitudFechaCompletada;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudFechaCompletada</code> attribute.<br>
    * Model Attribute: <code>solicitudFechaCompletada</code>. Variable DateTime<br>
    * Comments: GdC-23 Req 2: Se solicita adicionar una columna en la opción de Estatus Solicitudes que tenga el título 'Fecha Marca Completada'. 
Este nuevo campo tomará el valor de la fecha y hora en la que el asesor da por completada/generada la solicitud.
Este nuevo campo deberá aparecer en la tabla de 'Estatus de Solicitudes', en medio de 'Fecha Elaboración' y 'Fecha Inicio Contratación', con la cabecera 'Fecha Marca Completada'. El formato de la fecha debe ser dd/mm/aaaa hh:mm:ss, hora 24.<br>
    * @param solicitudFechaCompletada The new value of the <code>solicitudFechaCompletada</code> attribute.
    */
    public void setSolicitudFechaCompletada (Timestamp solicitudFechaCompletada) {
        modifiedSolicitudFechaCompletada = true;
        this.solicitudFechaCompletada = solicitudFechaCompletada;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudFechaCompletada</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudFechaCompletada</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudFechaCompletada() {
        return modifiedSolicitudFechaCompletada;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudFechaCompletada</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudFechaCompletada</code>.
    */
    public void setModifiedSolicitudFechaCompletada(boolean modified) {
        this.modifiedSolicitudFechaCompletada = modified;
    }

   /**
    * Returns the value of the <code>solicitudFechaUltimoDoc</code> attribute.<br>
    * Model Attribute: <code>solicitudFechaUltimoDoc</code>. Variable DateTime<br>
    * Comments: GdC-23 Req 3: Fecha último documento
Añadir un nuevo campo a solicitud que indique la fecha y hora en la que se adjuntó el último documento.

Este nuevo dato deberá actualizarse cada vez que se suba un nuevo documento.
Deberá aparecer, con la cabecera 'Fecha último documento', a continuación del dato indicado en el requisito 2, en la opción 'Estatus se Solicitudes'. El formato de la fecha debe ser dd/mm/aaaa hh:mm:ss, hora 24<br>
    * @return The value of the <code>solicitudFechaUltimoDoc</code> attribute.
    */

    public Timestamp getSolicitudFechaUltimoDoc()  {
    	Timestamp value;
        value =  solicitudFechaUltimoDoc;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudFechaUltimoDoc</code> attribute.<br>
    * Model Attribute: <code>solicitudFechaUltimoDoc</code>. Variable DateTime<br>
    * Comments: GdC-23 Req 3: Fecha último documento
Añadir un nuevo campo a solicitud que indique la fecha y hora en la que se adjuntó el último documento.

Este nuevo dato deberá actualizarse cada vez que se suba un nuevo documento.
Deberá aparecer, con la cabecera 'Fecha último documento', a continuación del dato indicado en el requisito 2, en la opción 'Estatus se Solicitudes'. El formato de la fecha debe ser dd/mm/aaaa hh:mm:ss, hora 24<br>
    * @param solicitudFechaUltimoDoc The new value of the <code>solicitudFechaUltimoDoc</code> attribute.
    */
    public void setSolicitudFechaUltimoDoc (Timestamp solicitudFechaUltimoDoc) {
        modifiedSolicitudFechaUltimoDoc = true;
        this.solicitudFechaUltimoDoc = solicitudFechaUltimoDoc;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudFechaUltimoDoc</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudFechaUltimoDoc</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudFechaUltimoDoc() {
        return modifiedSolicitudFechaUltimoDoc;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudFechaUltimoDoc</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudFechaUltimoDoc</code>.
    */
    public void setModifiedSolicitudFechaUltimoDoc(boolean modified) {
        this.modifiedSolicitudFechaUltimoDoc = modified;
    }

   /**
    * Returns the value of the <code>solicitudPrioridad</code> attribute.<br>
    * Model Attribute: <code>solicitudPrioridad</code>. Variable Nat<br>
    * Comments: GdC-26. Req 7 Modificar pantalla de consulta de Estatus de Solicitudes
Se añadirá a la grilla el dato “Prioridad” para que se sepa la prioridad que tiene dicha solicitud (según lo explicado en el requisito 1).<br>
    * @return The value of the <code>solicitudPrioridad</code> attribute.
    */

    public Long getSolicitudPrioridad()  {
    	Long value;
        value =  solicitudPrioridad;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudPrioridad</code> attribute.<br>
    * Model Attribute: <code>solicitudPrioridad</code>. Variable Nat<br>
    * Comments: GdC-26. Req 7 Modificar pantalla de consulta de Estatus de Solicitudes
Se añadirá a la grilla el dato “Prioridad” para que se sepa la prioridad que tiene dicha solicitud (según lo explicado en el requisito 1).<br>
    * @param solicitudPrioridad The new value of the <code>solicitudPrioridad</code> attribute.
    */
    public void setSolicitudPrioridad (Long solicitudPrioridad) {
        modifiedSolicitudPrioridad = true;
        this.solicitudPrioridad = solicitudPrioridad;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudPrioridad</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudPrioridad</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudPrioridad() {
        return modifiedSolicitudPrioridad;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudPrioridad</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudPrioridad</code>.
    */
    public void setModifiedSolicitudPrioridad(boolean modified) {
        this.modifiedSolicitudPrioridad = modified;
    }

   /**
    * Returns the value of the <code>solicitudFechaTerminada</code> attribute.<br>
    * Model Attribute: <code>solicitudFechaTerminada</code>. Variable Date<br>
    * Comments: GdC-26 Req. 6: Asignación automática de solicitudes

Una solicitud se dará por terminada si se cumple alguna de las siguientes condiciones:
·	El estado de la solicitud es TRAMITADA y el estado de la documentación APROBADO
·	El estado de la solicitud es TRAMITADA CON PREEXISTENCIAS y el estado de la documentación APROBADO
·	El estado de la solicitud es ANULADA


La fecha en que se da por terminada debe ser un dato almacenado a nivel de base de datos para identificar estas solicitudes y así solo calcularse una vez.<br>
    * @return The value of the <code>solicitudFechaTerminada</code> attribute.
    */

    public Date getSolicitudFechaTerminada()  {
    	Date value;
        value =  solicitudFechaTerminada;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudFechaTerminada</code> attribute.<br>
    * Model Attribute: <code>solicitudFechaTerminada</code>. Variable Date<br>
    * Comments: GdC-26 Req. 6: Asignación automática de solicitudes

Una solicitud se dará por terminada si se cumple alguna de las siguientes condiciones:
·	El estado de la solicitud es TRAMITADA y el estado de la documentación APROBADO
·	El estado de la solicitud es TRAMITADA CON PREEXISTENCIAS y el estado de la documentación APROBADO
·	El estado de la solicitud es ANULADA


La fecha en que se da por terminada debe ser un dato almacenado a nivel de base de datos para identificar estas solicitudes y así solo calcularse una vez.<br>
    * @param solicitudFechaTerminada The new value of the <code>solicitudFechaTerminada</code> attribute.
    */
    public void setSolicitudFechaTerminada (Date solicitudFechaTerminada) {
        modifiedSolicitudFechaTerminada = true;
        this.solicitudFechaTerminada = solicitudFechaTerminada;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudFechaTerminada</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudFechaTerminada</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudFechaTerminada() {
        return modifiedSolicitudFechaTerminada;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudFechaTerminada</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudFechaTerminada</code>.
    */
    public void setModifiedSolicitudFechaTerminada(boolean modified) {
        this.modifiedSolicitudFechaTerminada = modified;
    }

   /**
    * Returns the value of the <code>solicitudFechaFUG</code> attribute.<br>
    * Model Attribute: <code>solicitudFechaFUG</code>. Variable DateTime<br>
    * Comments: GdC26- Req 7.
Fecha y hora última gestión (FUG): Registrará la fecha-hora del último cambio de estado de la solicitud o último cambio de estado de la documentación. Esta fecha se debe almacenar como campo en base de datos. Esto es, cada vez que la solicitud cambie de estado o cada vez que cambie de estado la documentación de una solicitud, se actualizará esta fecha, quedando solamente registrada la última.<br>
    * @return The value of the <code>solicitudFechaFUG</code> attribute.
    */

    public Timestamp getSolicitudFechaFUG()  {
    	Timestamp value;
        value =  solicitudFechaFUG;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudFechaFUG</code> attribute.<br>
    * Model Attribute: <code>solicitudFechaFUG</code>. Variable DateTime<br>
    * Comments: GdC26- Req 7.
Fecha y hora última gestión (FUG): Registrará la fecha-hora del último cambio de estado de la solicitud o último cambio de estado de la documentación. Esta fecha se debe almacenar como campo en base de datos. Esto es, cada vez que la solicitud cambie de estado o cada vez que cambie de estado la documentación de una solicitud, se actualizará esta fecha, quedando solamente registrada la última.<br>
    * @param solicitudFechaFUG The new value of the <code>solicitudFechaFUG</code> attribute.
    */
    public void setSolicitudFechaFUG (Timestamp solicitudFechaFUG) {
        modifiedSolicitudFechaFUG = true;
        this.solicitudFechaFUG = solicitudFechaFUG;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudFechaFUG</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudFechaFUG</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudFechaFUG() {
        return modifiedSolicitudFechaFUG;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudFechaFUG</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudFechaFUG</code>.
    */
    public void setModifiedSolicitudFechaFUG(boolean modified) {
        this.modifiedSolicitudFechaFUG = modified;
    }

   /**
    * Returns the value of the <code>solicitudFechaFA</code> attribute.<br>
    * Model Attribute: <code>solicitudFechaFA</code>. Variable DateTime<br>
    * Comments: GdC26- Req 7
Fecha y hora afiliación (FA): Ultima fecha-hora en que el estado de la documentación quedó en pendiente revisión. Esta fecha se debe almacenar como campo en base de datos.<br>
    * @return The value of the <code>solicitudFechaFA</code> attribute.
    */

    public Timestamp getSolicitudFechaFA()  {
    	Timestamp value;
        value =  solicitudFechaFA;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudFechaFA</code> attribute.<br>
    * Model Attribute: <code>solicitudFechaFA</code>. Variable DateTime<br>
    * Comments: GdC26- Req 7
Fecha y hora afiliación (FA): Ultima fecha-hora en que el estado de la documentación quedó en pendiente revisión. Esta fecha se debe almacenar como campo en base de datos.<br>
    * @param solicitudFechaFA The new value of the <code>solicitudFechaFA</code> attribute.
    */
    public void setSolicitudFechaFA (Timestamp solicitudFechaFA) {
        modifiedSolicitudFechaFA = true;
        this.solicitudFechaFA = solicitudFechaFA;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudFechaFA</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudFechaFA</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudFechaFA() {
        return modifiedSolicitudFechaFA;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudFechaFA</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudFechaFA</code>.
    */
    public void setModifiedSolicitudFechaFA(boolean modified) {
        this.modifiedSolicitudFechaFA = modified;
    }

   /**
    * Returns the value of the <code>solicitudFechaFAAM</code> attribute.<br>
    * Model Attribute: <code>solicitudFechaFAAM</code>. Variable DateTime<br>
    * Comments: GdC26- Req 7
Fecha y hora área médica (FAAM): Ultima fecha-hora en que el estado de la solicitud quedó en pendiente médico. Esta fecha se debe almacenar como campo en base de datos<br>
    * @return The value of the <code>solicitudFechaFAAM</code> attribute.
    */

    public Timestamp getSolicitudFechaFAAM()  {
    	Timestamp value;
        value =  solicitudFechaFAAM;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudFechaFAAM</code> attribute.<br>
    * Model Attribute: <code>solicitudFechaFAAM</code>. Variable DateTime<br>
    * Comments: GdC26- Req 7
Fecha y hora área médica (FAAM): Ultima fecha-hora en que el estado de la solicitud quedó en pendiente médico. Esta fecha se debe almacenar como campo en base de datos<br>
    * @param solicitudFechaFAAM The new value of the <code>solicitudFechaFAAM</code> attribute.
    */
    public void setSolicitudFechaFAAM (Timestamp solicitudFechaFAAM) {
        modifiedSolicitudFechaFAAM = true;
        this.solicitudFechaFAAM = solicitudFechaFAAM;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudFechaFAAM</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudFechaFAAM</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudFechaFAAM() {
        return modifiedSolicitudFechaFAAM;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudFechaFAAM</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudFechaFAAM</code>.
    */
    public void setModifiedSolicitudFechaFAAM(boolean modified) {
        this.modifiedSolicitudFechaFAAM = modified;
    }

   /**
    * Returns the value of the <code>solicitudSemaforoGrabAse</code> attribute.<br>
    * Model Attribute: <code>solicitudSemaforoGrabAse</code>. Variable Real<br>
    * Comments: GdC 26. Req 16. Semaforización. Se requiere disponer de un código de color para cada solicitud de manera que visualmente se pueda saber si dicha solicitud se encuentra dentro de su acuerdo de nivel de servicio. Se tendrá un semáforo para el perfil Grabador de Afiliaciones / Asesor integral. <br>
    * @return The value of the <code>solicitudSemaforoGrabAse</code> attribute.
    */

    public Double getSolicitudSemaforoGrabAse()  {
    	Double value;
        value =  solicitudSemaforoGrabAse;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudSemaforoGrabAse</code> attribute.<br>
    * Model Attribute: <code>solicitudSemaforoGrabAse</code>. Variable Real<br>
    * Comments: GdC 26. Req 16. Semaforización. Se requiere disponer de un código de color para cada solicitud de manera que visualmente se pueda saber si dicha solicitud se encuentra dentro de su acuerdo de nivel de servicio. Se tendrá un semáforo para el perfil Grabador de Afiliaciones / Asesor integral. <br>
    * @param solicitudSemaforoGrabAse The new value of the <code>solicitudSemaforoGrabAse</code> attribute.
    */
    public void setSolicitudSemaforoGrabAse (Double solicitudSemaforoGrabAse) {
        modifiedSolicitudSemaforoGrabAse = true;
        this.solicitudSemaforoGrabAse = solicitudSemaforoGrabAse;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudSemaforoGrabAse</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudSemaforoGrabAse</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudSemaforoGrabAse() {
        return modifiedSolicitudSemaforoGrabAse;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudSemaforoGrabAse</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudSemaforoGrabAse</code>.
    */
    public void setModifiedSolicitudSemaforoGrabAse(boolean modified) {
        this.modifiedSolicitudSemaforoGrabAse = modified;
    }

   /**
    * Returns the value of the <code>solicitudSemaforoAreaMed</code> attribute.<br>
    * Model Attribute: <code>solicitudSemaforoAreaMed</code>. Variable Real<br>
    * Comments: GdC 26. Req 16. Semaforización. Se requiere disponer de un código de color para cada solicitud de manera que visualmente se pueda saber si dicha solicitud se encuentra dentro de su acuerdo de nivel de servicio. Se tendrá un semáforo para el perfil Área Médica. <br>
    * @return The value of the <code>solicitudSemaforoAreaMed</code> attribute.
    */

    public Double getSolicitudSemaforoAreaMed()  {
    	Double value;
        value =  solicitudSemaforoAreaMed;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudSemaforoAreaMed</code> attribute.<br>
    * Model Attribute: <code>solicitudSemaforoAreaMed</code>. Variable Real<br>
    * Comments: GdC 26. Req 16. Semaforización. Se requiere disponer de un código de color para cada solicitud de manera que visualmente se pueda saber si dicha solicitud se encuentra dentro de su acuerdo de nivel de servicio. Se tendrá un semáforo para el perfil Área Médica. <br>
    * @param solicitudSemaforoAreaMed The new value of the <code>solicitudSemaforoAreaMed</code> attribute.
    */
    public void setSolicitudSemaforoAreaMed (Double solicitudSemaforoAreaMed) {
        modifiedSolicitudSemaforoAreaMed = true;
        this.solicitudSemaforoAreaMed = solicitudSemaforoAreaMed;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudSemaforoAreaMed</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudSemaforoAreaMed</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudSemaforoAreaMed() {
        return modifiedSolicitudSemaforoAreaMed;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudSemaforoAreaMed</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudSemaforoAreaMed</code>.
    */
    public void setModifiedSolicitudSemaforoAreaMed(boolean modified) {
        this.modifiedSolicitudSemaforoAreaMed = modified;
    }

   /**
    * Returns the value of the <code>solicitudEstadoDoc</code> attribute.<br>
    * Model Attribute: <code>solicitudEstadoDoc</code>. Variable Nat<br>
    * Comments: 1.- PENDIENTE REVISIÓN, 2 - APROBADO, 3 - DEVUELTO, 4- REENVIO
GdC. 26. Req. 1: Priorización de Solicitudes.
Adicionalmente, y para esta gestión, se requiere que el estado de la documentación sea un dato que se registre a nivel de base de datos y no un dato calculado.<br>
    * @return The value of the <code>solicitudEstadoDoc</code> attribute.
    */

    public Long getSolicitudEstadoDoc()  {
    	Long value;
        value =  solicitudEstadoDoc;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudEstadoDoc</code> attribute.<br>
    * Model Attribute: <code>solicitudEstadoDoc</code>. Variable Nat<br>
    * Comments: 1.- PENDIENTE REVISIÓN, 2 - APROBADO, 3 - DEVUELTO, 4- REENVIO
GdC. 26. Req. 1: Priorización de Solicitudes.
Adicionalmente, y para esta gestión, se requiere que el estado de la documentación sea un dato que se registre a nivel de base de datos y no un dato calculado.<br>
    * @param solicitudEstadoDoc The new value of the <code>solicitudEstadoDoc</code> attribute.
    */
    public void setSolicitudEstadoDoc (Long solicitudEstadoDoc) {
        modifiedSolicitudEstadoDoc = true;
        this.solicitudEstadoDoc = solicitudEstadoDoc;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudEstadoDoc</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudEstadoDoc</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudEstadoDoc() {
        return modifiedSolicitudEstadoDoc;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudEstadoDoc</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudEstadoDoc</code>.
    */
    public void setModifiedSolicitudEstadoDoc(boolean modified) {
        this.modifiedSolicitudEstadoDoc = modified;
    }

   /**
    * Returns the value of the <code>solicituddrvSemaforoGrabAse</code> attribute.<br>
    * Model Attribute: <code>solicituddrvSemaforoGrabAse</code>. Variable Real<br>
    * Comments: GdC 26. Req 16. Semaforización. Se requiere disponer de un código de color para cada solicitud de manera que visualmente se pueda saber si dicha solicitud se encuentra dentro de su acuerdo de nivel de servicio. Se tendrá un semáforo para el perfil Grabador de Afiliaciones / Asesor integral. Es Nat porque es un dato expresado en días.

Este derivado sirve para:
* Mostrar el valor del constante que se registró (caso de que la solicitud esté terminada)
* Invocar a la función de BD y calcular el valor (caso de que la solicitud no esté terminada)<br>
    * @return The value of the <code>solicituddrvSemaforoGrabAse</code> attribute.
    */

    @JsonIgnore
    public Double getSolicituddrvSemaforoGrabAse()  {
    	Double value;
        try {
            value = solicituddrvSemaforoGrabAseDerivations();
        } catch (Exception e) {
            value = Double.valueOf(0);
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvSemaforoGrabAse");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvSemaforoAreaMed</code> attribute.<br>
    * Model Attribute: <code>solicituddrvSemaforoAreaMed</code>. Variable Real<br>
    * Comments: GdC 26. Req 16. Semaforización. Se requiere disponer de un código de color para cada solicitud de manera que visualmente se pueda saber si dicha solicitud se encuentra dentro de su acuerdo de nivel de servicio. Se tendrá un semáforo para el perfil Área Médica. Es Nat porque es un dato expresado en días.

Este derivado sirve para:
* Mostrar el valor del constante que se registró (caso de que la solicitud esté terminada)
* Invocar a la función de BD y calcular el valor (caso de que la solicitud no esté terminada)<br>
    * @return The value of the <code>solicituddrvSemaforoAreaMed</code> attribute.
    */

    @JsonIgnore
    public Double getSolicituddrvSemaforoAreaMed()  {
    	Double value;
        try {
            value = solicituddrvSemaforoAreaMedDerivations();
        } catch (Exception e) {
            value = Double.valueOf(0);
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvSemaforoAreaMed");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicitudDrvEstadoHomologado</code> attribute.<br>
    * Model Attribute: <code>solicitudDrvEstadoHomologado</code>. Variable Int<br>
    * Comments: GdC-37 Req. 5: Homologación nuevo estado “Recibido” en la pantalla “Estatus de solicitudes”

Se requiere que el nuevo estado “Recibido” sea homologado en la pantalla de consulta de estatus de solicitudes que se alcanza desde “Consultas – Estatus de solicitudes” para todos los roles a excepción de los roles “Administrador” y “SuperAdministrador”<br>
    * @return The value of the <code>solicitudDrvEstadoHomologado</code> attribute.
    */

    @JsonIgnore
    public Long getSolicitudDrvEstadoHomologado()  {
    	Long value;
        try {
            value = solicitudDrvEstadoHomologadoDerivations();
        } catch (Exception e) {
            value = Long.valueOf(0);
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicitudDrvEstadoHomologado");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicituddrvValidarDatosContratante</code> attribute.<br>
    * Model Attribute: <code>solicituddrvValidarDatosContratante</code>. Variable Bool<br>
    * Comments: Devuelve true si se deben validar los datos del contratante indicados en la GdC-37 Req 3.<br>
    * @return The value of the <code>solicituddrvValidarDatosContratante</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvValidarDatosContratante()  {
    	Boolean value;
        try {
            value = solicituddrvValidarDatosContratanteDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvValidarDatosContratante");
        }
        return value;
    }

   /**
    * Returns the value of the <code>solicitudEnvioCarnetFisico</code> attribute.<br>
    * Model Attribute: <code>solicitudEnvioCarnetFisico</code>. Variable Bool<br>
    * Comments: GdC-40 Req 6: Marca de entrega de carnet. Se requiere una nueva marca al crear una solicitud (nueva contratación o inclusión) que indique si se desea que se envíe el carnet físico, que llevará por título “Envío carnet físico”.<br>
    * @return The value of the <code>solicitudEnvioCarnetFisico</code> attribute.
    */

    public Boolean getSolicitudEnvioCarnetFisico()  {
    	Boolean value;
        value =  solicitudEnvioCarnetFisico;
        return value;
    }

   /**
    * Sets the value of the <code>solicitudEnvioCarnetFisico</code> attribute.<br>
    * Model Attribute: <code>solicitudEnvioCarnetFisico</code>. Variable Bool<br>
    * Comments: GdC-40 Req 6: Marca de entrega de carnet. Se requiere una nueva marca al crear una solicitud (nueva contratación o inclusión) que indique si se desea que se envíe el carnet físico, que llevará por título “Envío carnet físico”.<br>
    * @param solicitudEnvioCarnetFisico The new value of the <code>solicitudEnvioCarnetFisico</code> attribute.
    */
    public void setSolicitudEnvioCarnetFisico (Boolean solicitudEnvioCarnetFisico) {
        modifiedSolicitudEnvioCarnetFisico = true;
        this.solicitudEnvioCarnetFisico = solicitudEnvioCarnetFisico;
    }

   /**
    * Returns the value of the <code>modifiedSolicitudEnvioCarnetFisico</code> class property.<br>
    *
    * @return The value of the <code>modifiedSolicitudEnvioCarnetFisico</code> class property.
    */
    @JsonIgnore
    public boolean isModifiedSolicitudEnvioCarnetFisico() {
        return modifiedSolicitudEnvioCarnetFisico;
    }

   /**
    * Sets the value of the <code>modifiedSolicitudEnvioCarnetFisico</code> class property.<br>
    * @param modified The new value of the <code>modifiedSolicitudEnvioCarnetFisico</code>.
    */
    public void setModifiedSolicitudEnvioCarnetFisico(boolean modified) {
        this.modifiedSolicitudEnvioCarnetFisico = modified;
    }

   /**
    * Returns the value of the <code>solicituddrvTramitarEnLinea</code> attribute.<br>
    * Model Attribute: <code>solicituddrvTramitarEnLinea</code>. Variable Bool<br>
    * Comments: Devuelve si el Dominio asociado tiene la marca de tramite en linea o no<br>
    * @return The value of the <code>solicituddrvTramitarEnLinea</code> attribute.
    */

    @JsonIgnore
    public Boolean getSolicituddrvTramitarEnLinea()  {
    	Boolean value;
        try {
            value = solicituddrvTramitarEnLineaDerivations();
        } catch (Exception e) {
            value = false;
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Definition Class: Solicitud, Attribute: solicituddrvTramitarEnLinea");
        }
        return value;
    }

    /**
     * Returns the instance of <code>Direccion</code> related through the <code>Direccion</code> role.
     * Model Relationship:
     * <code>[Direccion] Direccion 0:1  ------ 0:1  Contrato [Solicitud]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Direccion</code> related through the <code>Direccion</code> role.
     */
    @JsonIgnore
    public Direccion getDireccion() {
        if (direccion == null) {
            List<Direccion> collection = getDireccionRepository().findByContrato(this);
            if (collection.isEmpty()) {
                direccion = null;
            } else {
                direccion = (Direccion)collection.toArray()[0];
            }
        }
        return (direccion == null ? new Direccion(null) : direccion);
    }

    /**
     * Adds an instance of <code>Direccion</code> related through the <code>Direccion</code> role.
     * @param direccion The instance to add to the <code>Direccion</code> role.
     */
    public void add2Direccion(Direccion direccion) {
        this.direccion = (direccion == null  || direccion.isNull() ? null : direccion);
    }

   /**
    * This method gets the attribute value <code>modifiedDireccion</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDireccion</code> has been modified.
    */
    public boolean isModifiedDireccion(){
        return modifiedDireccion;
    }

    /**
     * Returns the instance of <code>ProteccionDatos</code> related through the <code>ProteccionDatos</code> role.
     * Model Relationship:
     * <code>[ProteccionDatos] ProteccionDatos 0:1  ------ 0:1  Solicitud [Solicitud]</code>
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
     * Returns the instance of <code>Usuario</code> related through the <code>Usuarios</code> role.
     * Model Relationship:
     * <code>[Usuario] Usuarios 0:M  ------ 1:1  Solicitud [Solicitud]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Usuario</code> related through the <code>Usuarios</code> role.
     */
    @JsonIgnore
    public Collection <Usuario> getUsuarios() {
        return getUsuarioRepository().findBySolicitud(this);
    }

    /**
     * Adds an instance of <code>Usuario</code> related through the <code>Usuarios</code> role.
     * @param usuarios The instance to add to the <code>Usuarios</code> role.
     */
    public void add2Usuarios(Usuario usuarios) {
        this.usuarios.add(usuarios);
    }
    /**
     * Removes an instance of <code>Usuario</code> related through the <code>Usuarios</code> role.
     * @param usuarios The instance to be removed
     */
    public void removeFromUsuarios(Usuario usuarios) {
    	this.usuarios.remove(usuarios);
    }
    /**
     * Sets instances of <code>Usuario</code> related through the <code>Usuarios</code> role.
     * @param usuarios The new value for the <code>Usuarios</code> role.
     */
    public void setUsuarios(Collection < Usuario > usuarios) {
        this.usuarios = usuarios;
    }

   /**
    * This method gets the attribute value <code>modifiedUsuarios</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedUsuarios</code> has been modified.
    */
    public boolean isModifiedUsuarios(){
        return modifiedUsuarios;
    }

    /**
     * Returns the instance of <code>Contratante</code> related through the <code>Contratante</code> role.
     * Model Relationship:
     * <code>[Contratante] Contratante 0:1  ------ 1:1  Solicitud [Solicitud]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Contratante</code> related through the <code>Contratante</code> role.
     */
    @JsonIgnore
    public Contratante getContratante() {
        if (contratante == null) {
            List<Contratante> collection = getContratanteRepository().findBySolicitud(this);
            if (collection.isEmpty()) {
                contratante = null;
            } else {
                contratante = (Contratante)collection.toArray()[0];
            }
        }
        return (contratante == null ? new Contratante(null) : contratante);
    }

    /**
     * Adds an instance of <code>Contratante</code> related through the <code>Contratante</code> role.
     * @param contratante The instance to add to the <code>Contratante</code> role.
     */
    public void add2Contratante(Contratante contratante) {
        this.contratante = (contratante == null  || contratante.isNull() ? null : contratante);
    }

   /**
    * This method gets the attribute value <code>modifiedContratante</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedContratante</code> has been modified.
    */
    public boolean isModifiedContratante(){
        return modifiedContratante;
    }

    /**
     * Returns the instance of <code>Firma</code> related through the <code>Firma</code> role.
     * Model Relationship:
     * <code>[Firma] Firma 0:1  ------ 0:1  Solicitud [Solicitud]</code>
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
     * Returns the instance of <code>Firma</code> related through the <code>SegundaFirma</code> role.
     * Model Relationship:
     * <code>[Firma] SegundaFirma 0:1  ------ 0:1  SolicitudSegunda [Solicitud]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Firma</code> related through the <code>SegundaFirma</code> role.
     */
    @JsonIgnore
    public Firma getSegundaFirma() {
        return segundaFirma;
    }

    /**
     * Adds an instance of <code>Firma</code> related through the <code>SegundaFirma</code> role.
     * @param segundaFirma The instance to add to the <code>SegundaFirma</code> role.
     */
    public void add2SegundaFirma(Firma segundaFirma) {
        this.segundaFirma = (segundaFirma == null  || segundaFirma.isNull() ? null : segundaFirma);
    }

   /**
    * This method gets the attribute value <code>modifiedSegundaFirma</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedSegundaFirma</code> has been modified.
    */
    public boolean isModifiedSegundaFirma(){
        return modifiedSegundaFirma;
    }

    /**
     * Returns the instance of <code>Firma</code> related through the <code>FirmaContratanteIncl</code> role.
     * Model Relationship:
     * <code>[Firma] FirmaContratanteIncl 0:1  ------ 0:1  SolicitudContratante [Solicitud]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Firma</code> related through the <code>FirmaContratanteIncl</code> role.
     */
    @JsonIgnore
    public Firma getFirmaContratanteIncl() {
        return firmaContratanteIncl;
    }

    /**
     * Adds an instance of <code>Firma</code> related through the <code>FirmaContratanteIncl</code> role.
     * @param firmaContratanteIncl The instance to add to the <code>FirmaContratanteIncl</code> role.
     */
    public void add2FirmaContratanteIncl(Firma firmaContratanteIncl) {
        this.firmaContratanteIncl = (firmaContratanteIncl == null  || firmaContratanteIncl.isNull() ? null : firmaContratanteIncl);
    }

   /**
    * This method gets the attribute value <code>modifiedFirmaContratanteIncl</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedFirmaContratanteIncl</code> has been modified.
    */
    public boolean isModifiedFirmaContratanteIncl(){
        return modifiedFirmaContratanteIncl;
    }

    /**
     * Returns the instance of <code>UsuarioReg</code> related through the <code>UsuariosRegistrados</code> role.
     * Model Relationship:
     * <code>[UsuarioReg] UsuariosRegistrados 0:M  ------ 1:1  Solicitud [Solicitud]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>UsuarioReg</code> related through the <code>UsuariosRegistrados</code> role.
     */
    @JsonIgnore
    public Collection <UsuarioReg> getUsuariosRegistrados() {
        return getUsuarioRegRepository().findBySolicitud(this);
    }

    /**
     * Adds an instance of <code>UsuarioReg</code> related through the <code>UsuariosRegistrados</code> role.
     * @param usuariosRegistrados The instance to add to the <code>UsuariosRegistrados</code> role.
     */
    public void add2UsuariosRegistrados(UsuarioReg usuariosRegistrados) {
        this.usuariosRegistrados.add(usuariosRegistrados);
    }
    /**
     * Removes an instance of <code>UsuarioReg</code> related through the <code>UsuariosRegistrados</code> role.
     * @param usuariosRegistrados The instance to be removed
     */
    public void removeFromUsuariosRegistrados(UsuarioReg usuariosRegistrados) {
    	this.usuariosRegistrados.remove(usuariosRegistrados);
    }
    /**
     * Sets instances of <code>UsuarioReg</code> related through the <code>UsuariosRegistrados</code> role.
     * @param usuariosRegistrados The new value for the <code>UsuariosRegistrados</code> role.
     */
    public void setUsuariosRegistrados(Collection < UsuarioReg > usuariosRegistrados) {
        this.usuariosRegistrados = usuariosRegistrados;
    }

   /**
    * This method gets the attribute value <code>modifiedUsuariosRegistrados</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedUsuariosRegistrados</code> has been modified.
    */
    public boolean isModifiedUsuariosRegistrados(){
        return modifiedUsuariosRegistrados;
    }

    /**
     * Returns the instance of <code>Titular</code> related through the <code>Titular</code> role.
     * Model Relationship:
     * <code>[Titular] Titular 0:1  ------ 1:1  Solicitud [Solicitud]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Titular</code> related through the <code>Titular</code> role.
     */
    @JsonIgnore
    public Titular getTitular() {
        if (titular == null) {
            List<Titular> collection = getTitularRepository().findBySolicitud(this);
            if (collection.isEmpty()) {
                titular = null;
            } else {
                titular = (Titular)collection.toArray()[0];
            }
        }
        return (titular == null ? new Titular(null) : titular);
    }

    /**
     * Adds an instance of <code>Titular</code> related through the <code>Titular</code> role.
     * @param titular The instance to add to the <code>Titular</code> role.
     */
    public void add2Titular(Titular titular) {
        this.titular = (titular == null  || titular.isNull() ? null : titular);
    }

   /**
    * This method gets the attribute value <code>modifiedTitular</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedTitular</code> has been modified.
    */
    public boolean isModifiedTitular(){
        return modifiedTitular;
    }

    /**
     * Returns the instance of <code>DocumentoG</code> related through the <code>DocumentosGestor</code> role.
     * Model Relationship:
     * <code>[DocumentoG] DocumentosGestor 0:M  ------ 1:1  Solicitud [Solicitud]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>DocumentoG</code> related through the <code>DocumentosGestor</code> role.
     */
    @JsonIgnore
    public Collection <DocumentoG> getDocumentosGestor() {
        return getDocumentoGRepository().findBySolicitud(this);
    }

    /**
     * Adds an instance of <code>DocumentoG</code> related through the <code>DocumentosGestor</code> role.
     * @param documentosGestor The instance to add to the <code>DocumentosGestor</code> role.
     */
    public void add2DocumentosGestor(DocumentoG documentosGestor) {
        this.documentosGestor.add(documentosGestor);
    }
    /**
     * Removes an instance of <code>DocumentoG</code> related through the <code>DocumentosGestor</code> role.
     * @param documentosGestor The instance to be removed
     */
    public void removeFromDocumentosGestor(DocumentoG documentosGestor) {
    	this.documentosGestor.remove(documentosGestor);
    }
    /**
     * Sets instances of <code>DocumentoG</code> related through the <code>DocumentosGestor</code> role.
     * @param documentosGestor The new value for the <code>DocumentosGestor</code> role.
     */
    public void setDocumentosGestor(Collection < DocumentoG > documentosGestor) {
        this.documentosGestor = documentosGestor;
    }

   /**
    * This method gets the attribute value <code>modifiedDocumentosGestor</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedDocumentosGestor</code> has been modified.
    */
    public boolean isModifiedDocumentosGestor(){
        return modifiedDocumentosGestor;
    }

    /**
     * Returns the instance of <code>ErrorWS</code> related through the <code>ErroresWS</code> role.
     * Model Relationship:
     * <code>[ErrorWS] ErroresWS 0:M  ------ 1:1  Solicitud [Solicitud]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>ErrorWS</code> related through the <code>ErroresWS</code> role.
     */
    @JsonIgnore
    public Collection <ErrorWS> getErroresWS() {
        return erroresWS;
    }

    /**
     * Adds an instance of <code>ErrorWS</code> related through the <code>ErroresWS</code> role.
     * @param erroresWS The instance to add to the <code>ErroresWS</code> role.
     */
    public void add2ErroresWS(ErrorWS erroresWS) {
        this.erroresWS.add(erroresWS);
    }
    /**
     * Removes an instance of <code>ErrorWS</code> related through the <code>ErroresWS</code> role.
     * @param erroresWS The instance to be removed
     */
    public void removeFromErroresWS(ErrorWS erroresWS) {
    	this.erroresWS.remove(erroresWS);
    }
    /**
     * Sets instances of <code>ErrorWS</code> related through the <code>ErroresWS</code> role.
     * @param erroresWS The new value for the <code>ErroresWS</code> role.
     */
    public void setErroresWS(Collection < ErrorWS > erroresWS) {
        this.erroresWS = erroresWS;
    }

   /**
    * This method gets the attribute value <code>modifiedErroresWS</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedErroresWS</code> has been modified.
    */
    public boolean isModifiedErroresWS(){
        return modifiedErroresWS;
    }

    /**
     * Returns the instance of <code>LogEstado</code> related through the <code>LogEstado</code> role.
     * Model Relationship:
     * <code>[LogEstado] LogEstado 0:M  ------ 1:1  Solicitud [Solicitud]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>LogEstado</code> related through the <code>LogEstado</code> role.
     */
    @JsonIgnore
    public Collection <LogEstado> getLogEstado() {
        return getLogEstadoRepository().findBySolicitud(this);
    }

    /**
     * Adds an instance of <code>LogEstado</code> related through the <code>LogEstado</code> role.
     * @param logEstado The instance to add to the <code>LogEstado</code> role.
     */
    public void add2LogEstado(LogEstado logEstado) {
        this.logEstado.add(logEstado);
    }
    /**
     * Removes an instance of <code>LogEstado</code> related through the <code>LogEstado</code> role.
     * @param logEstado The instance to be removed
     */
    public void removeFromLogEstado(LogEstado logEstado) {
    	this.logEstado.remove(logEstado);
    }
    /**
     * Sets instances of <code>LogEstado</code> related through the <code>LogEstado</code> role.
     * @param logEstado The new value for the <code>LogEstado</code> role.
     */
    public void setLogEstado(Collection < LogEstado > logEstado) {
        this.logEstado = logEstado;
    }

   /**
    * This method gets the attribute value <code>modifiedLogEstado</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedLogEstado</code> has been modified.
    */
    public boolean isModifiedLogEstado(){
        return modifiedLogEstado;
    }

    /**
     * Returns the instance of <code>LogAsignaciones</code> related through the <code>LogAsignaciones</code> role.
     * Model Relationship:
     * <code>[LogAsignaciones] LogAsignaciones 0:M  ------ 1:1  Solicitud [Solicitud]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>LogAsignaciones</code> related through the <code>LogAsignaciones</code> role.
     */
    @JsonIgnore
    public Collection <LogAsignaciones> getLogAsignaciones() {
        return getLogAsignacionesRepository().findBySolicitud(this);
    }

    /**
     * Adds an instance of <code>LogAsignaciones</code> related through the <code>LogAsignaciones</code> role.
     * @param logAsignaciones The instance to add to the <code>LogAsignaciones</code> role.
     */
    public void add2LogAsignaciones(LogAsignaciones logAsignaciones) {
        this.logAsignaciones.add(logAsignaciones);
    }
    /**
     * Removes an instance of <code>LogAsignaciones</code> related through the <code>LogAsignaciones</code> role.
     * @param logAsignaciones The instance to be removed
     */
    public void removeFromLogAsignaciones(LogAsignaciones logAsignaciones) {
    	this.logAsignaciones.remove(logAsignaciones);
    }
    /**
     * Sets instances of <code>LogAsignaciones</code> related through the <code>LogAsignaciones</code> role.
     * @param logAsignaciones The new value for the <code>LogAsignaciones</code> role.
     */
    public void setLogAsignaciones(Collection < LogAsignaciones > logAsignaciones) {
        this.logAsignaciones = logAsignaciones;
    }

   /**
    * This method gets the attribute value <code>modifiedLogAsignaciones</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedLogAsignaciones</code> has been modified.
    */
    public boolean isModifiedLogAsignaciones(){
        return modifiedLogAsignaciones;
    }

    /**
     * Returns the instance of <code>Aesolicitudes</code> related through the <code>Aesolicitudes</code> role.
     * Model Relationship:
     * <code>[Aesolicitudes] Aesolicitudes 1:1  ------ 0:1  Solicitud [Solicitud]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Aesolicitudes</code> related through the <code>Aesolicitudes</code> role.
     */
    @JsonIgnore
    public Aesolicitudes getAesolicitudes() {
        return aesolicitudes;
    }

    /**
     * Adds an instance of <code>Aesolicitudes</code> related through the <code>Aesolicitudes</code> role.
     * @param aesolicitudes The instance to add to the <code>Aesolicitudes</code> role.
     */
    public void add2Aesolicitudes(Aesolicitudes aesolicitudes) {
        if (aesolicitudes == null || aesolicitudes.isNull()) {
            this.modifiedAesolicitudes = true;
            this.aesolicitudesidsolicitud = null;
        } else {
            this.aesolicitudesidsolicitud = aesolicitudes.getAesolicitudesidsolicitud();
        }
    }

   /**
    * This method gets the attribute value <code>modifiedAesolicitudes</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedAesolicitudes</code> has been modified.
    */
    public boolean isModifiedAesolicitudes(){
        return modifiedAesolicitudes;
    }

    /**
     * Returns the instance of <code>Persona</code> related through the <code>ContratantePersona</code> role.
     * Model Relationship:
     * <code>[Persona] ContratantePersona 0:1  ------ 0:M  SolicitudesContratante [Solicitud]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Persona</code> related through the <code>ContratantePersona</code> role.
     */
    @JsonIgnore
    public Persona getContratantePersona() {
        try {
            if (contratantePersona != null && contratantePersona.isNull()) {
                contratantePersona = null;
            }
        } catch (Exception ex) {
            contratantePersona = null;
        }
        if (contratantePersona == null) {
            if (personaIdentificador != null) {
                contratantePersona = getPersonaRepository().findById(personaIdentificador).orElse(null);
            } else {
                contratantePersona = null;
            }
        }
        return (contratantePersona == null ? new Persona(null) : contratantePersona);
    }

    /**
     * Adds an instance of <code>Persona</code> related through the <code>ContratantePersona</code> role.
     * @param contratantePersona The instance to add to the <code>ContratantePersona</code> role.
     */
    public void add2ContratantePersona(Persona contratantePersona) {
        if (contratantePersona == null || contratantePersona.isNull()) {
            this.modifiedContratantePersona = true;
            this.personaIdentificador = null;
        } else {
            this.personaIdentificador = contratantePersona.getPersonaIdentificador();
        }
        this.contratantePersona = (contratantePersona == null  || contratantePersona.isNull() ? null : contratantePersona);
    }

   /**
    * This method gets the attribute value <code>modifiedContratantePersona</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedContratantePersona</code> has been modified.
    */
    public boolean isModifiedContratantePersona(){
        return modifiedContratantePersona;
    }

    /**
     * Returns the instance of <code>Persona</code> related through the <code>TitularPersona</code> role.
     * Model Relationship:
     * <code>[Persona] TitularPersona 0:1  ------ 0:M  SolicitudesTitular [Solicitud]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Persona</code> related through the <code>TitularPersona</code> role.
     */
    @JsonIgnore
    public Persona getTitularPersona() {
        try {
            if (titularPersona != null && titularPersona.isNull()) {
                titularPersona = null;
            }
        } catch (Exception ex) {
            titularPersona = null;
        }
        if (titularPersona == null) {
            if (personaTitularPersonaIdentificador != null) {
                titularPersona = getPersonaRepository().findById(personaTitularPersonaIdentificador).orElse(null);
            } else {
                titularPersona = null;
            }
        }
        return (titularPersona == null ? new Persona(null) : titularPersona);
    }

    /**
     * Adds an instance of <code>Persona</code> related through the <code>TitularPersona</code> role.
     * @param titularPersona The instance to add to the <code>TitularPersona</code> role.
     */
    public void add2TitularPersona(Persona titularPersona) {
        if (titularPersona == null || titularPersona.isNull()) {
            this.modifiedTitularPersona = true;
            this.personaTitularPersonaIdentificador = null;
        } else {
            this.personaTitularPersonaIdentificador = titularPersona.getPersonaIdentificador();
        }
        this.titularPersona = (titularPersona == null  || titularPersona.isNull() ? null : titularPersona);
    }

   /**
    * This method gets the attribute value <code>modifiedTitularPersona</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedTitularPersona</code> has been modified.
    */
    public boolean isModifiedTitularPersona(){
        return modifiedTitularPersona;
    }

    /**
     * Returns the instance of <code>GrupoAsociado</code> related through the <code>GrupoAsociado</code> role.
     * Model Relationship:
     * <code>[GrupoAsociado] GrupoAsociado 0:1  ------ 0:M  Solicitudes [Solicitud]</code>
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
            this.grupoAsociadoCodigo = null;
        } else {
            this.grupoAsociadoCodigo = grupoAsociado.getGrupoAsociadoCodigo();
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
     * Returns the instance of <code>Funcionario</code> related through the <code>Agente</code> role.
     * Model Relationship:
     * <code>[Funcionario] Agente 1:1  ------ 0:M  Solicitudes [Solicitud]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Funcionario</code> related through the <code>Agente</code> role.
     */
    @JsonIgnore
    public Funcionario getAgente() {
        try {
            if (agente != null && agente.isNull()) {
                agente = null;
            }
        } catch (Exception ex) {
            agente = null;
        }
        if (agente == null) {
            if (funcionarioId != null) {
                agente = getFuncionarioRepository().findById(funcionarioId).orElse(null);
            } else {
                agente = null;
            }
        }
        return (agente == null ? new Funcionario(null) : agente);
    }

    /**
     * Adds an instance of <code>Funcionario</code> related through the <code>Agente</code> role.
     * @param agente The instance to add to the <code>Agente</code> role.
     */
    public void add2Agente(Funcionario agente) {
        if (agente == null || agente.isNull()) {
            this.modifiedAgente = true;
            this.funcionarioId = null;
        } else {
            this.funcionarioId = agente.getFuncionarioId();
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
     * Returns the instance of <code>FormaPago</code> related through the <code>FormaPago</code> role.
     * Model Relationship:
     * <code>[FormaPago] FormaPago 0:1  ------ 0:M  Solicitudes [Solicitud]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>FormaPago</code> related through the <code>FormaPago</code> role.
     */
    @JsonIgnore
    public FormaPago getFormaPago() {
        return formaPago;
    }

    /**
     * Adds an instance of <code>FormaPago</code> related through the <code>FormaPago</code> role.
     * @param formaPago The instance to add to the <code>FormaPago</code> role.
     */
    public void add2FormaPago(FormaPago formaPago) {
        if (formaPago == null || formaPago.isNull()) {
            this.modifiedFormaPago = true;
            this.formaPagoFormaPagoCodigo = null;
        } else {
            this.formaPagoFormaPagoCodigo = formaPago.getFormaPagoCodigo();
        }
        this.formaPago = (formaPago == null  || formaPago.isNull() ? null : formaPago);
    }

   /**
    * This method gets the attribute value <code>modifiedFormaPago</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedFormaPago</code> has been modified.
    */
    public boolean isModifiedFormaPago(){
        return modifiedFormaPago;
    }

    /**
     * Returns the instance of <code>Periodicidad</code> related through the <code>Periodicidad</code> role.
     * Model Relationship:
     * <code>[Periodicidad] Periodicidad 0:1  ------ 0:M  Solicitudes [Solicitud]</code>
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
            if (periodicidadPeriodicidadCodigo != null) {
                periodicidad = getPeriodicidadRepository().findById(periodicidadPeriodicidadCodigo).orElse(null);
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
     * Returns the instance of <code>ContratoC</code> related through the <code>ContratoC</code> role.
     * Model Relationship:
     * <code>[ContratoC] ContratoC 0:1  ------ 0:M  Solicitud [Solicitud]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>ContratoC</code> related through the <code>ContratoC</code> role.
     */
    @JsonIgnore
    public ContratoC getContratoC() {
        return contratoC;
    }

    /**
     * Adds an instance of <code>ContratoC</code> related through the <code>ContratoC</code> role.
     * @param contratoC The instance to add to the <code>ContratoC</code> role.
     */
    public void add2ContratoC(ContratoC contratoC) {
        if (contratoC == null || contratoC.isNull()) {
            this.modifiedContratoC = true;
            this.contratoCContratoCID = null;
        } else {
            this.contratoCContratoCID = contratoC.getContratoCID();
        }
        this.contratoC = (contratoC == null  || contratoC.isNull() ? null : contratoC);
    }

   /**
    * This method gets the attribute value <code>modifiedContratoC</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedContratoC</code> has been modified.
    */
    public boolean isModifiedContratoC(){
        return modifiedContratoC;
    }

    /**
     * Returns the instance of <code>AreaMedica</code> related through the <code>UsrAreaMedica</code> role.
     * Model Relationship:
     * <code>[AreaMedica] UsrAreaMedica 0:1  ------ 0:M  SolicitudesArMe [Solicitud]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>AreaMedica</code> related through the <code>UsrAreaMedica</code> role.
     */
    @JsonIgnore
    public AreaMedica getUsrAreaMedica() {
        try {
            if (usrAreaMedica != null && usrAreaMedica.isNull()) {
                usrAreaMedica = null;
            }
        } catch (Exception ex) {
            usrAreaMedica = null;
        }
        if (usrAreaMedica == null) {
            if (funcionarioUsrAreaMedicaId != null) {
                usrAreaMedica = getAreaMedicaRepository().findById(funcionarioUsrAreaMedicaId).orElse(null);
            } else {
                usrAreaMedica = null;
            }
        }
        return (usrAreaMedica == null ? new AreaMedica(null) : usrAreaMedica);
    }

    /**
     * Adds an instance of <code>AreaMedica</code> related through the <code>UsrAreaMedica</code> role.
     * @param usrAreaMedica The instance to add to the <code>UsrAreaMedica</code> role.
     */
    public void add2UsrAreaMedica(AreaMedica usrAreaMedica) {
        if (usrAreaMedica == null || usrAreaMedica.isNull()) {
            this.modifiedUsrAreaMedica = true;
            this.funcionarioUsrAreaMedicaId = null;
        } else {
            this.funcionarioUsrAreaMedicaId = usrAreaMedica.getFuncionarioId();
        }
        this.usrAreaMedica = (usrAreaMedica == null  || usrAreaMedica.isNull() ? null : usrAreaMedica);
    }

   /**
    * This method gets the attribute value <code>modifiedUsrAreaMedica</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedUsrAreaMedica</code> has been modified.
    */
    public boolean isModifiedUsrAreaMedica(){
        return modifiedUsrAreaMedica;
    }

    /**
     * Returns the instance of <code>TipoFactura</code> related through the <code>TipoFactura</code> role.
     * Model Relationship:
     * <code>[TipoFactura] TipoFactura 0:1  ------ 0:M  Solicitudes [Solicitud]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>TipoFactura</code> related through the <code>TipoFactura</code> role.
     */
    @JsonIgnore
    public TipoFactura getTipoFactura() {
        return tipoFactura;
    }

    /**
     * Adds an instance of <code>TipoFactura</code> related through the <code>TipoFactura</code> role.
     * @param tipoFactura The instance to add to the <code>TipoFactura</code> role.
     */
    public void add2TipoFactura(TipoFactura tipoFactura) {
        if (tipoFactura == null || tipoFactura.isNull()) {
            this.modifiedTipoFactura = true;
            this.tipoFacturaTipoFacturaCodigo = null;
        } else {
            this.tipoFacturaTipoFacturaCodigo = tipoFactura.getTipoFacturaCodigo();
        }
        this.tipoFactura = (tipoFactura == null  || tipoFactura.isNull() ? null : tipoFactura);
    }

   /**
    * This method gets the attribute value <code>modifiedTipoFactura</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedTipoFactura</code> has been modified.
    */
    public boolean isModifiedTipoFactura(){
        return modifiedTipoFactura;
    }

    /**
     * Returns the instance of <code>Funcionario</code> related through the <code>UsrAfiliacion</code> role.
     * Model Relationship:
     * <code>[Funcionario] UsrAfiliacion 0:1  ------ 0:M  SolicitudesAfiliacion [Solicitud]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>Funcionario</code> related through the <code>UsrAfiliacion</code> role.
     */
    @JsonIgnore
    public Funcionario getUsrAfiliacion() {
        try {
            if (usrAfiliacion != null && usrAfiliacion.isNull()) {
                usrAfiliacion = null;
            }
        } catch (Exception ex) {
            usrAfiliacion = null;
        }
        if (usrAfiliacion == null) {
            if (funcionarioUsrAfiliacionId != null) {
                usrAfiliacion = getFuncionarioRepository().findById(funcionarioUsrAfiliacionId).orElse(null);
            } else {
                usrAfiliacion = null;
            }
        }
        return (usrAfiliacion == null ? new Funcionario(null) : usrAfiliacion);
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
     * Returns a Map with the values of the attributes.
     * @return Map with the values of the attributes.
     */
    @JsonIgnore
	@Override
    public Map<String, Object> getValues() {
        return values;
    }

    /**
     * Computes the value of the <code>solicituddrvReqCuesMed</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvReqCuesMed</code> derived attribute.
     */
    public Boolean solicituddrvReqCuesMedDerivations() throws SystemException {

        solicituddrvReqCuesMed = null;

        solicituddrvReqCuesMedDerivationsConditional1();
        solicituddrvReqCuesMedDerivationsDefault();
        return solicituddrvReqCuesMed;
    }

    private void solicituddrvReqCuesMedDerivationsConditional1() throws SystemException {
        if (solicituddrvReqCuesMed != null) return;
        // CONDITION: EsTraslado = FALSE
        // EFFECT   : EXIST( Aesolicitudes.ProductoT.Dominios ) WHERE (Aesolicitudes.ProductoT.Dominios.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.ReqCuesMed = true)
        boolean solicituddrvReqCuesMedCond = this.getSolicitudEsTraslado().equals(false);
        if (solicituddrvReqCuesMedCond) {
            solicituddrvReqCuesMed = getSolicitudRepository().assocOperator002(this);
        }
    }

    private void solicituddrvReqCuesMedDerivationsDefault() throws SystemException {
        if (solicituddrvReqCuesMed != null) return;
        // Default derivation
        // EFFECT   : EXIST( Aesolicitudes.ProductoT.Dominios ) WHERE (Aesolicitudes.ProductoT.Dominios.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.ReqCuesMed = true AND (Aesolicitudes.ProductoT.Dominios.NoCuesMedTras = false))
        solicituddrvReqCuesMed = getSolicitudRepository().assocOperator003(this);
    }

    /**
     * Computes the value of the <code>solicituddrvYaTieneContratante</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvYaTieneContratante</code> derived attribute.
     */
    public Boolean solicituddrvYaTieneContratanteDerivations() throws SystemException {

        solicituddrvYaTieneContratante = null;

        solicituddrvYaTieneContratanteDerivationsDefault();
        return solicituddrvYaTieneContratante;
    }

    private void solicituddrvYaTieneContratanteDerivationsDefault() throws SystemException {
        if (solicituddrvYaTieneContratante != null) return;
        // Default derivation
        // EFFECT   : EXIST( ContratantePersona )
        solicituddrvYaTieneContratante = getSolicitudRepository().assocOperator004(this);
    }

    /**
     * Computes the value of the <code>solicituddrvTitularConBeneficios</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvTitularConBeneficios</code> derived attribute.
     */
    public Boolean solicituddrvTitularConBeneficiosDerivations() throws SystemException {

        solicituddrvTitularConBeneficios = null;

        solicituddrvTitularConBeneficiosDerivationsConditional1();
        solicituddrvTitularConBeneficiosDerivationsDefault();
        return solicituddrvTitularConBeneficios;
    }

    private void solicituddrvTitularConBeneficiosDerivationsConditional1() throws SystemException {
        if (solicituddrvTitularConBeneficios != null) return;
        // CONDITION: EXIST( Contratante ) = false
        // EFFECT   : FALSE
        boolean solicituddrvTitularConBeneficiosCond = getSolicitudRepository().assocOperator005(this).equals(false);
        if (solicituddrvTitularConBeneficiosCond) {
            solicituddrvTitularConBeneficios = Boolean.FALSE;
        }
    }

    private void solicituddrvTitularConBeneficiosDerivationsDefault() {
        if (solicituddrvTitularConBeneficios != null) return;
        // Default derivation
        // EFFECT   : Contratante.TitularConBeneficios = true
        solicituddrvTitularConBeneficios = this.getContratante().getContratanteTitularConBeneficios().equals(true);
    }

    /**
     * Computes the value of the <code>solicituddrvSubtotal</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvSubtotal</code> derived attribute.
     */
    public Double solicituddrvSubtotalDerivations() {

        solicituddrvSubtotal = null;

        solicituddrvSubtotalDerivationsDefault();
        return solicituddrvSubtotal;
    }

    private void solicituddrvSubtotalDerivationsDefault() {
        if (solicituddrvSubtotal != null) return;
        // Default derivation
        // EFFECT   : valorCuota + ValorCuotaInscrip - valorDtoComercialSim
        solicituddrvSubtotal = this.getSolicitudvalorCuota() + this.getSolicitudValorCuotaInscrip() - this.getSolicitudvalorDtoComercialSim();
    }

    /**
     * Computes the value of the <code>solicituddrvBaseGrabable</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvBaseGrabable</code> derived attribute.
     */
    public Double solicituddrvBaseGrabableDerivations() throws SystemException {

        solicituddrvBaseGrabable = null;

        solicituddrvBaseGrabableDerivationsConditional1();
        solicituddrvBaseGrabableDerivationsConditional2();
        solicituddrvBaseGrabableDerivationsDefault();
        return solicituddrvBaseGrabable;
    }

    private void solicituddrvBaseGrabableDerivationsConditional1() throws SystemException {
        if (solicituddrvBaseGrabable != null) return;
        // CONDITION: EXIST( Periodicidad ) = false
        // EFFECT   : 0
        boolean solicituddrvBaseGrabableCond = getSolicitudRepository().assocOperator006(this).equals(false);
        if (solicituddrvBaseGrabableCond) {
            solicituddrvBaseGrabable = Utilities.convertToDouble(Long.valueOf(0));
        }
    }

    private void solicituddrvBaseGrabableDerivationsConditional2() {
        if (solicituddrvBaseGrabable != null) return;
        // CONDITION: Periodicidad.EsMensual = false
        // EFFECT   : RoundEx(drvSubtotal - ValorDtoFinanciero, 0)
        boolean solicituddrvBaseGrabableCond = this.getPeriodicidad().getPeriodicidadEsMensual().equals(false);
        if (solicituddrvBaseGrabableCond) {
            solicituddrvBaseGrabable = STDFunctions.roundExFun(this.getSolicituddrvSubtotal() - this.getSolicitudValorDtoFinanciero(), Long.valueOf(0));
        }
    }

    private void solicituddrvBaseGrabableDerivationsDefault() {
        if (solicituddrvBaseGrabable != null) return;
        // Default derivation
        // EFFECT   : drvSubtotal
        solicituddrvBaseGrabable = this.getSolicituddrvSubtotal();
    }

    /**
     * Computes the value of the <code>solicituddrvPorcenIVA</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvPorcenIVA</code> derived attribute.
     */
    public Double solicituddrvPorcenIVADerivations() throws SystemException {

        solicituddrvPorcenIVA = null;

        solicituddrvPorcenIVADerivationsConditional1();
        solicituddrvPorcenIVADerivationsConditional2();
        solicituddrvPorcenIVADerivationsDefault();
        return solicituddrvPorcenIVA;
    }

    private void solicituddrvPorcenIVADerivationsConditional1() {
        if (solicituddrvPorcenIVA != null) return;
        // CONDITION: Contratante.Diplomatico = TRUE
        // EFFECT   : 0
        boolean solicituddrvPorcenIVACond = this.getContratante().getContratanteDiplomatico().equals(true);
        if (solicituddrvPorcenIVACond) {
            solicituddrvPorcenIVA = Utilities.convertToDouble(Long.valueOf(0));
        }
    }

    private void solicituddrvPorcenIVADerivationsConditional2() throws SystemException {
        if (solicituddrvPorcenIVA != null) return;
        // CONDITION: EXIST( Direccion.Municipio ) = true AND Direccion.Municipio.AplicaIVA = false
        // EFFECT   : 0
        boolean solicituddrvPorcenIVACond = getSolicitudRepository().assocOperator007(this).equals(true) && this.getDireccion().getMunicipio().getMunicipioAplicaIVA().equals(false);
        if (solicituddrvPorcenIVACond) {
            solicituddrvPorcenIVA = Utilities.convertToDouble(Long.valueOf(0));
        }
    }

    private void solicituddrvPorcenIVADerivationsDefault() throws SystemException {
        if (solicituddrvPorcenIVA != null) return;
        // Default derivation
        // EFFECT   : SUM( Aesolicitudes.PlanT.TiposIVA.Porcentaje ) WHERE (Aesolicitudes.PlanT.TiposIVA.FechaInicio <= drvFechaPorcenIVA AND Aesolicitudes.PlanT.TiposIVA.FechaFin >= drvFechaPorcenIVA)
        solicituddrvPorcenIVA = getSolicitudRepository().assocOperator008(this);
    }

    /**
     * Computes the value of the <code>solicituddrvIVA</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvIVA</code> derived attribute.
     */
    public Double solicituddrvIVADerivations() {

        solicituddrvIVA = null;

        solicituddrvIVADerivationsDefault();
        return solicituddrvIVA;
    }

    private void solicituddrvIVADerivationsDefault() {
        if (solicituddrvIVA != null) return;
        // Default derivation
        // EFFECT   : RoundEx(drvBaseGrabable* (drvPorcenIVA/100),0)
        solicituddrvIVA = STDFunctions.roundExFun(this.getSolicituddrvBaseGrabable() * (this.getSolicituddrvPorcenIVA() / Long.valueOf(100)), Long.valueOf(0));
    }

    /**
     * Computes the value of the <code>solicituddrvTotal</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvTotal</code> derived attribute.
     */
    public Double solicituddrvTotalDerivations() {

        solicituddrvTotal = null;

        solicituddrvTotalDerivationsDefault();
        return solicituddrvTotal;
    }

    private void solicituddrvTotalDerivationsDefault() {
        if (solicituddrvTotal != null) return;
        // Default derivation
        // EFFECT   : RoundEx(drvBaseGrabable + drvIVA,0)
        solicituddrvTotal = STDFunctions.roundExFun(this.getSolicituddrvBaseGrabable() + this.getSolicituddrvIVA(), Long.valueOf(0));
    }

    /**
     * Computes the value of the <code>solicituddrvCuesMedOK</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvCuesMedOK</code> derived attribute.
     */
    public Boolean solicituddrvCuesMedOKDerivations() throws SystemException {

        solicituddrvCuesMedOK = null;

        solicituddrvCuesMedOKDerivationsConditional1();
        solicituddrvCuesMedOKDerivationsDefault();
        return solicituddrvCuesMedOK;
    }

    private void solicituddrvCuesMedOKDerivationsConditional1() {
        if (solicituddrvCuesMedOK != null) return;
        // CONDITION: drvReqCuesMed = FALSE
        // EFFECT   : TRUE
        boolean solicituddrvCuesMedOKCond = this.getSolicituddrvReqCuesMed().equals(false);
        if (solicituddrvCuesMedOKCond) {
            solicituddrvCuesMedOK = Boolean.TRUE;
        }
    }

    private void solicituddrvCuesMedOKDerivationsDefault() throws SystemException {
        if (solicituddrvCuesMedOK != null) return;
        // Default derivation
        // EFFECT   : FOR ALL Usuarios ( Usuarios.drvCuesMedOK = true ) = true
        solicituddrvCuesMedOK = getSolicitudRepository().assocOperator009(this).equals(true);
    }

    /**
     * Computes the value of the <code>solicituddrvYaTieneTitular</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvYaTieneTitular</code> derived attribute.
     */
    public Boolean solicituddrvYaTieneTitularDerivations() throws SystemException {

        solicituddrvYaTieneTitular = null;

        solicituddrvYaTieneTitularDerivationsDefault();
        return solicituddrvYaTieneTitular;
    }

    private void solicituddrvYaTieneTitularDerivationsDefault() throws SystemException {
        if (solicituddrvYaTieneTitular != null) return;
        // Default derivation
        // EFFECT   : EXIST(TitularPersona)
        solicituddrvYaTieneTitular = getSolicitudRepository().assocOperator010(this);
    }

    /**
     * Computes the value of the <code>solicituddrvDifValorCuota</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvDifValorCuota</code> derived attribute.
     */
    public Double solicituddrvDifValorCuotaDerivations() {

        solicituddrvDifValorCuota = null;

        solicituddrvDifValorCuotaDerivationsConditional1();
        solicituddrvDifValorCuotaDerivationsDefault();
        return solicituddrvDifValorCuota;
    }

    private void solicituddrvDifValorCuotaDerivationsConditional1() {
        if (solicituddrvDifValorCuota != null) return;
        // CONDITION: valorCuotaPeriodoC = NULL
        // EFFECT   : 0
        boolean solicituddrvDifValorCuotaCond = this.getSolicitudvalorCuotaPeriodoC() == null;
        if (solicituddrvDifValorCuotaCond) {
            solicituddrvDifValorCuota = Utilities.convertToDouble(Long.valueOf(0));
        }
    }

    private void solicituddrvDifValorCuotaDerivationsDefault() {
        if (solicituddrvDifValorCuota != null) return;
        // Default derivation
        // EFFECT   : RoundEx(valorCuotaPeriodoC - valorCuota, 0)
        solicituddrvDifValorCuota = STDFunctions.roundExFun(this.getSolicitudvalorCuotaPeriodoC() - this.getSolicitudvalorCuota(), Long.valueOf(0));
    }

    /**
     * Computes the value of the <code>solicituddrvDifValorDtoFinanciero</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvDifValorDtoFinanciero</code> derived attribute.
     */
    public Double solicituddrvDifValorDtoFinancieroDerivations() {

        solicituddrvDifValorDtoFinanciero = null;

        solicituddrvDifValorDtoFinancieroDerivationsConditional1();
        solicituddrvDifValorDtoFinancieroDerivationsDefault();
        return solicituddrvDifValorDtoFinanciero;
    }

    private void solicituddrvDifValorDtoFinancieroDerivationsConditional1() {
        if (solicituddrvDifValorDtoFinanciero != null) return;
        // CONDITION: descuentoFinancieroC = NULL OR ValorDtoFinanciero = NULL
        // EFFECT   : 0
        boolean solicituddrvDifValorDtoFinancieroCond = this.getSolicituddescuentoFinancieroC() == null || this.getSolicitudValorDtoFinanciero() == null;
        if (solicituddrvDifValorDtoFinancieroCond) {
            solicituddrvDifValorDtoFinanciero = Utilities.convertToDouble(Long.valueOf(0));
        }
    }

    private void solicituddrvDifValorDtoFinancieroDerivationsDefault() {
        if (solicituddrvDifValorDtoFinanciero != null) return;
        // Default derivation
        // EFFECT   : RoundEx(descuentoFinancieroC - ValorDtoFinanciero, 0)
        solicituddrvDifValorDtoFinanciero = STDFunctions.roundExFun(this.getSolicituddescuentoFinancieroC() - this.getSolicitudValorDtoFinanciero(), Long.valueOf(0));
    }

    /**
     * Computes the value of the <code>solicituddrvDifValorIVA</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvDifValorIVA</code> derived attribute.
     */
    public Double solicituddrvDifValorIVADerivations() {

        solicituddrvDifValorIVA = null;

        solicituddrvDifValorIVADerivationsConditional1();
        solicituddrvDifValorIVADerivationsDefault();
        return solicituddrvDifValorIVA;
    }

    private void solicituddrvDifValorIVADerivationsConditional1() {
        if (solicituddrvDifValorIVA != null) return;
        // CONDITION: IVAC = NULL 
        // EFFECT   : 0
        boolean solicituddrvDifValorIVACond = this.getSolicitudIVAC() == null;
        if (solicituddrvDifValorIVACond) {
            solicituddrvDifValorIVA = Utilities.convertToDouble(Long.valueOf(0));
        }
    }

    private void solicituddrvDifValorIVADerivationsDefault() {
        if (solicituddrvDifValorIVA != null) return;
        // Default derivation
        // EFFECT   : RoundEx(IVAC - drvIVA, 0)
        solicituddrvDifValorIVA = STDFunctions.roundExFun(this.getSolicitudIVAC() - this.getSolicituddrvIVA(), Long.valueOf(0));
    }

    /**
     * Computes the value of the <code>solicituddrvHayPreexistencias</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvHayPreexistencias</code> derived attribute.
     */
    public Boolean solicituddrvHayPreexistenciasDerivations() throws SystemException {

        solicituddrvHayPreexistencias = null;

        solicituddrvHayPreexistenciasDerivationsDefault();
        return solicituddrvHayPreexistencias;
    }

    private void solicituddrvHayPreexistenciasDerivationsDefault() throws SystemException {
        if (solicituddrvHayPreexistencias != null) return;
        // Default derivation
        // EFFECT   : EXIST( Usuarios.Preexistencias ) = true
        solicituddrvHayPreexistencias = getSolicitudRepository().assocOperator011(this).equals(true);
    }

    /**
     * Computes the value of the <code>solicituddrvContratoLegalizado</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvContratoLegalizado</code> derived attribute.
     */
    public Boolean solicituddrvContratoLegalizadoDerivations() {

        solicituddrvContratoLegalizado = null;

        solicituddrvContratoLegalizadoDerivationsConditional1();
        solicituddrvContratoLegalizadoDerivationsConditional2();
        solicituddrvContratoLegalizadoDerivationsDefault();
        return solicituddrvContratoLegalizado;
    }

    private void solicituddrvContratoLegalizadoDerivationsConditional1() {
        if (solicituddrvContratoLegalizado != null) return;
        // CONDITION: drvHayPreexistencias = FALSE
        // EFFECT   : TRUE
        boolean solicituddrvContratoLegalizadoCond = this.getSolicituddrvHayPreexistencias().equals(false);
        if (solicituddrvContratoLegalizadoCond) {
            solicituddrvContratoLegalizado = Boolean.TRUE;
        }
    }

    private void solicituddrvContratoLegalizadoDerivationsConditional2() {
        if (solicituddrvContratoLegalizado != null) return;
        // CONDITION: drvHayPreexistencias = TRUE AND drvTieneSegundaFirma = TRUE
        // EFFECT   : TRUE
        boolean solicituddrvContratoLegalizadoCond = this.getSolicituddrvHayPreexistencias().equals(true) && this.getSolicituddrvTieneSegundaFirma().equals(true);
        if (solicituddrvContratoLegalizadoCond) {
            solicituddrvContratoLegalizado = Boolean.TRUE;
        }
    }

    private void solicituddrvContratoLegalizadoDerivationsDefault() {
        if (solicituddrvContratoLegalizado != null) return;
        // Default derivation
        // EFFECT   : FALSE
        solicituddrvContratoLegalizado = Boolean.FALSE;
    }

    /**
     * Computes the value of the <code>solicituddrvTieneSegundaFirma</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvTieneSegundaFirma</code> derived attribute.
     */
    public Boolean solicituddrvTieneSegundaFirmaDerivations() throws SystemException {

        solicituddrvTieneSegundaFirma = null;

        solicituddrvTieneSegundaFirmaDerivationsDefault();
        return solicituddrvTieneSegundaFirma;
    }

    private void solicituddrvTieneSegundaFirmaDerivationsDefault() throws SystemException {
        if (solicituddrvTieneSegundaFirma != null) return;
        // Default derivation
        // EFFECT   : EXIST(SegundaFirma)=true
        solicituddrvTieneSegundaFirma = getSolicitudRepository().assocOperator012(this).equals(true);
    }

    /**
     * Computes the value of the <code>solicituddrvGrupoAsociado</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvGrupoAsociado</code> derived attribute.
     */
    public String solicituddrvGrupoAsociadoDerivations() throws SystemException {

        solicituddrvGrupoAsociado = null;

        solicituddrvGrupoAsociadoDerivationsConditional1();
        solicituddrvGrupoAsociadoDerivationsDefault();
        return solicituddrvGrupoAsociado;
    }

    private void solicituddrvGrupoAsociadoDerivationsConditional1() throws SystemException {
        if (solicituddrvGrupoAsociado != null) return;
        // CONDITION: EXIST( GrupoAsociado ) = true
        // EFFECT   : GrupoAsociado.CodigoLegal + \" - \" + GrupoAsociado.Descripcion
        boolean solicituddrvGrupoAsociadoCond = getSolicitudRepository().assocOperator013(this).equals(true);
        if (solicituddrvGrupoAsociadoCond) {
            solicituddrvGrupoAsociado = this.getGrupoAsociado().getGrupoAsociadoCodigoLegal() + " - " + this.getGrupoAsociado().getGrupoAsociadoDescripcion();
        }
    }

    private void solicituddrvGrupoAsociadoDerivationsDefault() {
        if (solicituddrvGrupoAsociado != null) return;
        // Default derivation
        // EFFECT   : \"\"
        solicituddrvGrupoAsociado = "";
    }

    /**
     * Computes the value of the <code>solicituddrvAplicaDocContrato</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvAplicaDocContrato</code> derived attribute.
     */
    public Boolean solicituddrvAplicaDocContratoDerivations() throws SystemException {

        solicituddrvAplicaDocContrato = null;

        solicituddrvAplicaDocContratoDerivationsConditional1();
        solicituddrvAplicaDocContratoDerivationsConditional2();
        solicituddrvAplicaDocContratoDerivationsConditional3();
        solicituddrvAplicaDocContratoDerivationsDefault();
        return solicituddrvAplicaDocContrato;
    }

    private void solicituddrvAplicaDocContratoDerivationsConditional1() {
        if (solicituddrvAplicaDocContrato != null) return;
        // CONDITION: Tramite <> 1
        // EFFECT   : FALSE
        boolean solicituddrvAplicaDocContratoCond = !(this.getSolicitudTramite()).equals(Long.valueOf(1));
        if (solicituddrvAplicaDocContratoCond) {
            solicituddrvAplicaDocContrato = Boolean.FALSE;
        }
    }

    private void solicituddrvAplicaDocContratoDerivationsConditional2() throws SystemException {
        if (solicituddrvAplicaDocContrato != null) return;
        // CONDITION: EXIST( Aesolicitudes.ProductoT.Dominios.ReportesDominio ) WHERE (Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 1 AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici) = false
        // EFFECT   : FALSE
        boolean solicituddrvAplicaDocContratoCond = getSolicitudRepository().assocOperator014(this).equals(false);
        if (solicituddrvAplicaDocContratoCond) {
            solicituddrvAplicaDocContrato = Boolean.FALSE;
        }
    }

    private void solicituddrvAplicaDocContratoDerivationsConditional3() throws SystemException {
        if (solicituddrvAplicaDocContrato != null) return;
        // CONDITION: EXIST( Usuarios ) WHERE (Usuarios.EstadoBeneficiario.EsActivo = true) = false
        // EFFECT   : FALSE
        boolean solicituddrvAplicaDocContratoCond = getSolicitudRepository().assocOperator015(this).equals(false);
        if (solicituddrvAplicaDocContratoCond) {
            solicituddrvAplicaDocContrato = Boolean.FALSE;
        }
    }

    private void solicituddrvAplicaDocContratoDerivationsDefault() {
        if (solicituddrvAplicaDocContrato != null) return;
        // Default derivation
        // EFFECT   : TRUE
        solicituddrvAplicaDocContrato = Boolean.TRUE;
    }

    /**
     * Computes the value of the <code>solicituddrvAplicaDocCartaPree</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvAplicaDocCartaPree</code> derived attribute.
     */
    public Boolean solicituddrvAplicaDocCartaPreeDerivations() throws SystemException {

        solicituddrvAplicaDocCartaPree = null;

        solicituddrvAplicaDocCartaPreeDerivationsConditional1();
        solicituddrvAplicaDocCartaPreeDerivationsDefault();
        return solicituddrvAplicaDocCartaPree;
    }

    private void solicituddrvAplicaDocCartaPreeDerivationsConditional1() throws SystemException {
        if (solicituddrvAplicaDocCartaPree != null) return;
        // CONDITION: EXIST( Aesolicitudes.ProductoT.Dominios.ReportesDominio ) WHERE (Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 3 AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici) = false
        // EFFECT   : FALSE
        boolean solicituddrvAplicaDocCartaPreeCond = getSolicitudRepository().assocOperator016(this).equals(false);
        if (solicituddrvAplicaDocCartaPreeCond) {
            solicituddrvAplicaDocCartaPree = Boolean.FALSE;
        }
    }

    private void solicituddrvAplicaDocCartaPreeDerivationsDefault() throws SystemException {
        if (solicituddrvAplicaDocCartaPree != null) return;
        // Default derivation
        // EFFECT   : EXIST( Usuarios.Preexistencias ) WHERE (Usuarios.Preexistencias.Usuario.EstadoBeneficiario.EsActivo = true)
        solicituddrvAplicaDocCartaPree = getSolicitudRepository().assocOperator017(this);
    }

    /**
     * Computes the value of the <code>solicituddrvAplicaDocBBGestante</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvAplicaDocBBGestante</code> derived attribute.
     */
    public Boolean solicituddrvAplicaDocBBGestanteDerivations() throws SystemException {

        solicituddrvAplicaDocBBGestante = null;

        solicituddrvAplicaDocBBGestanteDerivationsConditional1();
        solicituddrvAplicaDocBBGestanteDerivationsDefault();
        return solicituddrvAplicaDocBBGestante;
    }

    private void solicituddrvAplicaDocBBGestanteDerivationsConditional1() throws SystemException {
        if (solicituddrvAplicaDocBBGestante != null) return;
        // CONDITION: EXIST( Aesolicitudes.ProductoT.Dominios.ReportesDominio ) WHERE (Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 6 AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici) = false
        // EFFECT   : FALSE
        boolean solicituddrvAplicaDocBBGestanteCond = getSolicitudRepository().assocOperator018(this).equals(false);
        if (solicituddrvAplicaDocBBGestanteCond) {
            solicituddrvAplicaDocBBGestante = Boolean.FALSE;
        }
    }

    private void solicituddrvAplicaDocBBGestanteDerivationsDefault() throws SystemException {
        if (solicituddrvAplicaDocBBGestante != null) return;
        // Default derivation
        // EFFECT   : EXIST( Usuarios ) WHERE (Usuarios.BebeGestante = true AND Usuarios.EstadoBeneficiario.EsActivo = true)
        solicituddrvAplicaDocBBGestante = getSolicitudRepository().assocOperator019(this);
    }

    /**
     * Computes the value of the <code>solicituddrvAplicaDocMaternidad</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvAplicaDocMaternidad</code> derived attribute.
     */
    public Boolean solicituddrvAplicaDocMaternidadDerivations() throws SystemException {

        solicituddrvAplicaDocMaternidad = null;

        solicituddrvAplicaDocMaternidadDerivationsConditional1();
        solicituddrvAplicaDocMaternidadDerivationsDefault();
        return solicituddrvAplicaDocMaternidad;
    }

    private void solicituddrvAplicaDocMaternidadDerivationsConditional1() throws SystemException {
        if (solicituddrvAplicaDocMaternidad != null) return;
        // CONDITION: EXIST( Aesolicitudes.ProductoT.Dominios.ReportesDominio ) WHERE (Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 8 AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici) = false
        // EFFECT   : FALSE
        boolean solicituddrvAplicaDocMaternidadCond = getSolicitudRepository().assocOperator020(this).equals(false);
        if (solicituddrvAplicaDocMaternidadCond) {
            solicituddrvAplicaDocMaternidad = Boolean.FALSE;
        }
    }

    private void solicituddrvAplicaDocMaternidadDerivationsDefault() throws SystemException {
        if (solicituddrvAplicaDocMaternidad != null) return;
        // Default derivation
        // EFFECT   : EXIST( Usuarios.AnexoMat ) WHERE (Usuarios.AnexoMat.Usuario.EstadoBeneficiario.EsActivo = true)
        solicituddrvAplicaDocMaternidad = getSolicitudRepository().assocOperator021(this);
    }

    /**
     * Computes the value of the <code>solicituddrvAplicaCuestionario</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvAplicaCuestionario</code> derived attribute.
     */
    public Boolean solicituddrvAplicaCuestionarioDerivations() throws SystemException {

        solicituddrvAplicaCuestionario = null;

        solicituddrvAplicaCuestionarioDerivationsConditional1();
        solicituddrvAplicaCuestionarioDerivationsDefault();
        return solicituddrvAplicaCuestionario;
    }

    private void solicituddrvAplicaCuestionarioDerivationsConditional1() throws SystemException {
        if (solicituddrvAplicaCuestionario != null) return;
        // CONDITION: EXIST( Aesolicitudes.ProductoT.Dominios.ReportesDominio ) WHERE (Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 10 AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici) = false
        // EFFECT   : FALSE
        boolean solicituddrvAplicaCuestionarioCond = getSolicitudRepository().assocOperator022(this).equals(false);
        if (solicituddrvAplicaCuestionarioCond) {
            solicituddrvAplicaCuestionario = Boolean.FALSE;
        }
    }

    private void solicituddrvAplicaCuestionarioDerivationsDefault() throws SystemException {
        if (solicituddrvAplicaCuestionario != null) return;
        // Default derivation
        // EFFECT   : EXIST( Usuarios.CuestionarioP ) WHERE (Usuarios.CuestionarioP.YaDiligenciado = true) = true
        solicituddrvAplicaCuestionario = getSolicitudRepository().assocOperator023(this).equals(true);
    }

    /**
     * Computes the value of the <code>solicituddrvAplicaCartaEnt</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvAplicaCartaEnt</code> derived attribute.
     */
    public Boolean solicituddrvAplicaCartaEntDerivations() throws SystemException {

        solicituddrvAplicaCartaEnt = null;

        solicituddrvAplicaCartaEntDerivationsConditional1();
        solicituddrvAplicaCartaEntDerivationsDefault();
        return solicituddrvAplicaCartaEnt;
    }

    private void solicituddrvAplicaCartaEntDerivationsConditional1() throws SystemException {
        if (solicituddrvAplicaCartaEnt != null) return;
        // CONDITION: EXIST( Aesolicitudes.ProductoT.Dominios.ReportesDominio ) WHERE (Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 4 AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici) = false
        // EFFECT   : FALSE
        boolean solicituddrvAplicaCartaEntCond = getSolicitudRepository().assocOperator024(this).equals(false);
        if (solicituddrvAplicaCartaEntCond) {
            solicituddrvAplicaCartaEnt = Boolean.FALSE;
        }
    }

    private void solicituddrvAplicaCartaEntDerivationsDefault() throws SystemException {
        if (solicituddrvAplicaCartaEnt != null) return;
        // Default derivation
        // EFFECT   : EXIST( Usuarios ) WHERE (Usuarios.EstadoMedico = 4 AND Usuarios.EstadoBeneficiario.EsActivo = true) = true
        solicituddrvAplicaCartaEnt = getSolicitudRepository().assocOperator025(this).equals(true);
    }

    /**
     * Computes the value of the <code>solicituddrvTotalConAnexos</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvTotalConAnexos</code> derived attribute.
     */
    public Double solicituddrvTotalConAnexosDerivations() throws SystemException {

        solicituddrvTotalConAnexos = null;

        solicituddrvTotalConAnexosDerivationsDefault();
        return solicituddrvTotalConAnexos;
    }

    private void solicituddrvTotalConAnexosDerivationsDefault() throws SystemException {
        if (solicituddrvTotalConAnexos != null) return;
        // Default derivation
        // EFFECT   : drvTotal + roundEx(SUM( Usuarios.drvTotalAnexos ), 0)
        solicituddrvTotalConAnexos = this.getSolicituddrvTotal() + STDFunctions.roundExFun(getSolicitudRepository().assocOperator026(this), Long.valueOf(0));
    }

    /**
     * Computes the value of the <code>solicituddrvContratanteEsTitular</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvContratanteEsTitular</code> derived attribute.
     */
    public Boolean solicituddrvContratanteEsTitularDerivations() {

        solicituddrvContratanteEsTitular = null;

        solicituddrvContratanteEsTitularDerivationsDefault();
        return solicituddrvContratanteEsTitular;
    }

    private void solicituddrvContratanteEsTitularDerivationsDefault() {
        if (solicituddrvContratanteEsTitular != null) return;
        // Default derivation
        // EFFECT   : drvYaTieneContratante = true AND drvYaTieneTitular = true AND ContratantePersona.TipoIdentificacion = TitularPersona.TipoIdentificacion AND ContratantePersona.NumIdentificacion = TitularPersona.NumIdentificacion
        solicituddrvContratanteEsTitular = this.getSolicituddrvYaTieneContratante().equals(true) && this.getSolicituddrvYaTieneTitular().equals(true) && Utilities.isEqual(this.getContratantePersona().getTipoIdentificacion(), this.getTitularPersona().getTipoIdentificacion()) && STDFunctions.areEqual(this.getContratantePersona().getPersonaNumIdentificacion(),this.getTitularPersona().getPersonaNumIdentificacion());
    }

    /**
     * Computes the value of the <code>solicituddrvAlgunBeneficiarioEPSSanitas</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvAlgunBeneficiarioEPSSanitas</code> derived attribute.
     */
    public Boolean solicituddrvAlgunBeneficiarioEPSSanitasDerivations() throws SystemException {

        solicituddrvAlgunBeneficiarioEPSSanitas = null;

        solicituddrvAlgunBeneficiarioEPSSanitasDerivationsDefault();
        return solicituddrvAlgunBeneficiarioEPSSanitas;
    }

    private void solicituddrvAlgunBeneficiarioEPSSanitasDerivationsDefault() throws SystemException {
        if (solicituddrvAlgunBeneficiarioEPSSanitas != null) return;
        // Default derivation
        // EFFECT   : EXIST( Usuarios ) WHERE (Usuarios.drvTieneEPSSanitas = true) = true
        solicituddrvAlgunBeneficiarioEPSSanitas = getSolicitudRepository().assocOperator027(this).equals(true);
    }

    /**
     * Computes the value of the <code>solicituddrvListaErrores</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvListaErrores</code> derived attribute.
     */
    public String solicituddrvListaErroresDerivations() {

        solicituddrvListaErrores = null;

        solicituddrvListaErroresDerivationsDefault();
        return solicituddrvListaErrores;
    }

    private void solicituddrvListaErroresDerivationsDefault() {
        if (solicituddrvListaErrores != null) return;
        // Default derivation
        // EFFECT   : fugetListaErrores( THIS )
        solicituddrvListaErrores = userFunctionsSrv.fugetListaErroresFun(this);
    }

    /**
     * Computes the value of the <code>solicituddrvDifValorCuotaBruta</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvDifValorCuotaBruta</code> derived attribute.
     */
    public Double solicituddrvDifValorCuotaBrutaDerivations() {

        solicituddrvDifValorCuotaBruta = null;

        solicituddrvDifValorCuotaBrutaDerivationsConditional1();
        solicituddrvDifValorCuotaBrutaDerivationsDefault();
        return solicituddrvDifValorCuotaBruta;
    }

    private void solicituddrvDifValorCuotaBrutaDerivationsConditional1() {
        if (solicituddrvDifValorCuotaBruta != null) return;
        // CONDITION: valorCuotaBrutaC = NULL
        // EFFECT   : 0
        boolean solicituddrvDifValorCuotaBrutaCond = this.getSolicitudvalorCuotaBrutaC() == null;
        if (solicituddrvDifValorCuotaBrutaCond) {
            solicituddrvDifValorCuotaBruta = Utilities.convertToDouble(Long.valueOf(0));
        }
    }

    private void solicituddrvDifValorCuotaBrutaDerivationsDefault() {
        if (solicituddrvDifValorCuotaBruta != null) return;
        // Default derivation
        // EFFECT   : RoundEx(valorCuotaBrutaC - valorCuota, 0)
        solicituddrvDifValorCuotaBruta = STDFunctions.roundExFun(this.getSolicitudvalorCuotaBrutaC() - this.getSolicitudvalorCuota(), Long.valueOf(0));
    }

    /**
     * Computes the value of the <code>solicituddrvNumTitulares</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvNumTitulares</code> derived attribute.
     */
    public Long solicituddrvNumTitularesDerivations() throws SystemException {

        solicituddrvNumTitulares = null;

        solicituddrvNumTitularesDerivationsDefault();
        return solicituddrvNumTitulares;
    }

    private void solicituddrvNumTitularesDerivationsDefault() throws SystemException {
        if (solicituddrvNumTitulares != null) return;
        // Default derivation
        // EFFECT   : COUNT( Usuarios ) WHERE (Usuarios.Parentesco.EsTitular = true AND Usuarios.drvEstaActivo = true) + COUNT( UsuariosRegistrados ) WHERE (UsuariosRegistrados.Parentesco.EsTitular = true AND UsuariosRegistrados.EstadoBeneficiario.EsActivo = true)
        solicituddrvNumTitulares = getSolicitudRepository().assocOperator028(this) + getSolicitudRepository().assocOperator029(this);
    }

    /**
     * Computes the value of the <code>solicituddrvEnviarEmailDoc</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvEnviarEmailDoc</code> derived attribute.
     */
    public Boolean solicituddrvEnviarEmailDocDerivations() throws SystemException {

        solicituddrvEnviarEmailDoc = null;

        solicituddrvEnviarEmailDocDerivationsConditional1();
        solicituddrvEnviarEmailDocDerivationsConditional2();
        solicituddrvEnviarEmailDocDerivationsConditional3();
        solicituddrvEnviarEmailDocDerivationsConditional4();
        solicituddrvEnviarEmailDocDerivationsConditional5();
        solicituddrvEnviarEmailDocDerivationsConditional6();
        solicituddrvEnviarEmailDocDerivationsConditional7();
        solicituddrvEnviarEmailDocDerivationsConditional8();
        solicituddrvEnviarEmailDocDerivationsConditional9();
        solicituddrvEnviarEmailDocDerivationsConditional10();
        solicituddrvEnviarEmailDocDerivationsConditional11();
        solicituddrvEnviarEmailDocDerivationsConditional12();
        solicituddrvEnviarEmailDocDerivationsConditional13();
        solicituddrvEnviarEmailDocDerivationsConditional14();
        solicituddrvEnviarEmailDocDerivationsConditional15();
        solicituddrvEnviarEmailDocDerivationsDefault();
        return solicituddrvEnviarEmailDoc;
    }

    private void solicituddrvEnviarEmailDocDerivationsConditional1() {
        if (solicituddrvEnviarEmailDoc != null) return;
        // CONDITION: Estado <> 2 AND Estado <> 3 
        // EFFECT   : FALSE
        boolean solicituddrvEnviarEmailDocCond = !(this.getSolicitudEstado()).equals(Long.valueOf(2)) && !(this.getSolicitudEstado()).equals(Long.valueOf(3));
        if (solicituddrvEnviarEmailDocCond) {
            solicituddrvEnviarEmailDoc = Boolean.FALSE;
        }
    }

    private void solicituddrvEnviarEmailDocDerivationsConditional2() {
        if (solicituddrvEnviarEmailDoc != null) return;
        // CONDITION: DocsEnviados = TRUE
        // EFFECT   : FALSE
        boolean solicituddrvEnviarEmailDocCond = this.getSolicitudDocsEnviados().equals(true);
        if (solicituddrvEnviarEmailDocCond) {
            solicituddrvEnviarEmailDoc = Boolean.FALSE;
        }
    }

    private void solicituddrvEnviarEmailDocDerivationsConditional3() throws SystemException {
        if (solicituddrvEnviarEmailDoc != null) return;
        // CONDITION: COUNT( Aesolicitudes.ProductoT.Dominios.ReportesDominio ) WHERE (Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici) = 0
        // EFFECT   : FALSE
        boolean solicituddrvEnviarEmailDocCond = (getSolicitudRepository().assocOperator030(this)).equals(Long.valueOf(0));
        if (solicituddrvEnviarEmailDocCond) {
            solicituddrvEnviarEmailDoc = Boolean.FALSE;
        }
    }

    private void solicituddrvEnviarEmailDocDerivationsConditional4() throws SystemException {
        if (solicituddrvEnviarEmailDoc != null) return;
        // CONDITION: EXIST(TitularPersona ) = FALSE 
        // EFFECT   : FALSE
        boolean solicituddrvEnviarEmailDocCond = getSolicitudRepository().assocOperator031(this).equals(false);
        if (solicituddrvEnviarEmailDocCond) {
            solicituddrvEnviarEmailDoc = Boolean.FALSE;
        }
    }

    private void solicituddrvEnviarEmailDocDerivationsConditional5() throws SystemException {
        if (solicituddrvEnviarEmailDoc != null) return;
        // CONDITION: EXIST( TitularPersona ) WHERE (TitularPersona.TipoIdentificacion.NIT = false) = false
        // EFFECT   : FALSE
        boolean solicituddrvEnviarEmailDocCond = getSolicitudRepository().assocOperator032(this).equals(false);
        if (solicituddrvEnviarEmailDocCond) {
            solicituddrvEnviarEmailDoc = Boolean.FALSE;
        }
    }

    private void solicituddrvEnviarEmailDocDerivationsConditional6() {
        if (solicituddrvEnviarEmailDoc != null) return;
        // CONDITION: TitularPersona.CorreoElectronico = NULL  
        // EFFECT   : FALSE
        boolean solicituddrvEnviarEmailDocCond = this.getTitularPersona().getPersonaCorreoElectronico() == null;
        if (solicituddrvEnviarEmailDocCond) {
            solicituddrvEnviarEmailDoc = Boolean.FALSE;
        }
    }

    private void solicituddrvEnviarEmailDocDerivationsConditional7() throws SystemException {
        if (solicituddrvEnviarEmailDoc != null) return;
        // CONDITION: EXIST(Firma) = FALSE 
        // EFFECT   : FALSE
        boolean solicituddrvEnviarEmailDocCond = getSolicitudRepository().assocOperator033(this).equals(false);
        if (solicituddrvEnviarEmailDocCond) {
            solicituddrvEnviarEmailDoc = Boolean.FALSE;
        }
    }

    private void solicituddrvEnviarEmailDocDerivationsConditional8() {
        if (solicituddrvEnviarEmailDoc != null) return;
        // CONDITION: EstadoDoc <> 2 
        // EFFECT   : FALSE
        boolean solicituddrvEnviarEmailDocCond = !(this.getSolicitudEstadoDoc()).equals(Long.valueOf(2));
        if (solicituddrvEnviarEmailDocCond) {
            solicituddrvEnviarEmailDoc = Boolean.FALSE;
        }
    }

    private void solicituddrvEnviarEmailDocDerivationsConditional9() {
        if (solicituddrvEnviarEmailDoc != null) return;
        // CONDITION: drvYaTieneContratante = FALSE  
        // EFFECT   : FALSE
        boolean solicituddrvEnviarEmailDocCond = this.getSolicituddrvYaTieneContratante().equals(false);
        if (solicituddrvEnviarEmailDocCond) {
            solicituddrvEnviarEmailDoc = Boolean.FALSE;
        }
    }

    private void solicituddrvEnviarEmailDocDerivationsConditional10() {
        if (solicituddrvEnviarEmailDoc != null) return;
        // CONDITION: datosPagoOK=false 
        // EFFECT   : FALSE
        boolean solicituddrvEnviarEmailDocCond = this.getSolicituddatosPagoOK().equals(false);
        if (solicituddrvEnviarEmailDocCond) {
            solicituddrvEnviarEmailDoc = Boolean.FALSE;
        }
    }

    private void solicituddrvEnviarEmailDocDerivationsConditional11() throws SystemException {
        if (solicituddrvEnviarEmailDoc != null) return;
        // CONDITION: COUNT( Usuarios ) WHERE (Usuarios.drvTieneDocumentos = false) > 0
        // EFFECT   : FALSE
        boolean solicituddrvEnviarEmailDocCond = getSolicitudRepository().assocOperator034(this) > Long.valueOf(0);
        if (solicituddrvEnviarEmailDocCond) {
            solicituddrvEnviarEmailDoc = Boolean.FALSE;
        }
    }

    private void solicituddrvEnviarEmailDocDerivationsConditional12() throws SystemException {
        if (solicituddrvEnviarEmailDoc != null) return;
        // CONDITION: COUNT( Usuarios ) WHERE (Usuarios.drvTieneParentesco = false) > 0
        // EFFECT   : FALSE
        boolean solicituddrvEnviarEmailDocCond = getSolicitudRepository().assocOperator035(this) > Long.valueOf(0);
        if (solicituddrvEnviarEmailDocCond) {
            solicituddrvEnviarEmailDoc = Boolean.FALSE;
        }
    }

    private void solicituddrvEnviarEmailDocDerivationsConditional13() throws SystemException {
        if (solicituddrvEnviarEmailDoc != null) return;
        // CONDITION: tipoContrato = 1 AND ContratantePersona.TipoPersona = \"J\" AND (COUNT( Usuarios ) WHERE (Usuarios.Parentesco.EsTitular = true) + COUNT( UsuariosRegistrados ) WHERE (UsuariosRegistrados.Parentesco.EsTitular = true)) <> 1
        // EFFECT   : FALSE
        boolean solicituddrvEnviarEmailDocCond = (this.getSolicitudtipoContrato()).equals(Long.valueOf(1)) && (this.getContratantePersona().getPersonaTipoPersona()).equals("J") && !Long.valueOf((getSolicitudRepository().assocOperator036(this) + getSolicitudRepository().assocOperator037(this))).equals(Long.valueOf(1));
        if (solicituddrvEnviarEmailDocCond) {
            solicituddrvEnviarEmailDoc = Boolean.FALSE;
        }
    }

    private void solicituddrvEnviarEmailDocDerivationsConditional14() {
        if (solicituddrvEnviarEmailDoc != null) return;
        // CONDITION: tipoContrato = 1 AND ContratantePersona.TipoPersona = \"N\" AND drvContratanteEsTitular = FALSE
        // EFFECT   : FALSE
        boolean solicituddrvEnviarEmailDocCond = (this.getSolicitudtipoContrato()).equals(Long.valueOf(1)) && (this.getContratantePersona().getPersonaTipoPersona()).equals("N") && this.getSolicituddrvContratanteEsTitular().equals(false);
        if (solicituddrvEnviarEmailDocCond) {
            solicituddrvEnviarEmailDoc = Boolean.FALSE;
        }
    }

    private void solicituddrvEnviarEmailDocDerivationsConditional15() {
        if (solicituddrvEnviarEmailDoc != null) return;
        // CONDITION: drvHayPreexistencias = TRUE AND drvTieneSegundaFirma = FALSE
        // EFFECT   : FALSE
        boolean solicituddrvEnviarEmailDocCond = this.getSolicituddrvHayPreexistencias().equals(true) && this.getSolicituddrvTieneSegundaFirma().equals(false);
        if (solicituddrvEnviarEmailDocCond) {
            solicituddrvEnviarEmailDoc = Boolean.FALSE;
        }
    }

    private void solicituddrvEnviarEmailDocDerivationsDefault() {
        if (solicituddrvEnviarEmailDoc != null) return;
        // Default derivation
        // EFFECT   : TRUE
        solicituddrvEnviarEmailDoc = Boolean.TRUE;
    }

    /**
     * Computes the value of the <code>solicituddrvAplicaDocNeonatal</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvAplicaDocNeonatal</code> derived attribute.
     */
    public Boolean solicituddrvAplicaDocNeonatalDerivations() throws SystemException {

        solicituddrvAplicaDocNeonatal = null;

        solicituddrvAplicaDocNeonatalDerivationsConditional1();
        solicituddrvAplicaDocNeonatalDerivationsDefault();
        return solicituddrvAplicaDocNeonatal;
    }

    private void solicituddrvAplicaDocNeonatalDerivationsConditional1() throws SystemException {
        if (solicituddrvAplicaDocNeonatal != null) return;
        // CONDITION: EXIST( Aesolicitudes.ProductoT.Dominios.ReportesDominio ) WHERE (Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 9 AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici) = false
        // EFFECT   : FALSE
        boolean solicituddrvAplicaDocNeonatalCond = getSolicitudRepository().assocOperator038(this).equals(false);
        if (solicituddrvAplicaDocNeonatalCond) {
            solicituddrvAplicaDocNeonatal = Boolean.FALSE;
        }
    }

    private void solicituddrvAplicaDocNeonatalDerivationsDefault() throws SystemException {
        if (solicituddrvAplicaDocNeonatal != null) return;
        // Default derivation
        // EFFECT   : EXIST( Usuarios.AnexoNeo ) WHERE (Usuarios.AnexoNeo.Usuario.EstadoBeneficiario.EsActivo = true)
        solicituddrvAplicaDocNeonatal = getSolicitudRepository().assocOperator039(this);
    }

    /**
     * Computes the value of the <code>solicituddrvAplicaCarnets</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvAplicaCarnets</code> derived attribute.
     */
    public Boolean solicituddrvAplicaCarnetsDerivations() throws SystemException {

        solicituddrvAplicaCarnets = null;

        solicituddrvAplicaCarnetsDerivationsConditional1();
        solicituddrvAplicaCarnetsDerivationsConditional2();
        solicituddrvAplicaCarnetsDerivationsDefault();
        return solicituddrvAplicaCarnets;
    }

    private void solicituddrvAplicaCarnetsDerivationsConditional1() throws SystemException {
        if (solicituddrvAplicaCarnets != null) return;
        // CONDITION: EXIST( Aesolicitudes.ProductoT.Dominios.ReportesDominio ) WHERE (Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 2 AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici) = false
        // EFFECT   : FALSE
        boolean solicituddrvAplicaCarnetsCond = getSolicitudRepository().assocOperator040(this).equals(false);
        if (solicituddrvAplicaCarnetsCond) {
            solicituddrvAplicaCarnets = Boolean.FALSE;
        }
    }

    private void solicituddrvAplicaCarnetsDerivationsConditional2() throws SystemException {
        if (solicituddrvAplicaCarnets != null) return;
        // CONDITION: EXIST( Usuarios ) WHERE (Usuarios.EstadoBeneficiario.EsActivo = true) = false
        // EFFECT   : FALSE
        boolean solicituddrvAplicaCarnetsCond = getSolicitudRepository().assocOperator041(this).equals(false);
        if (solicituddrvAplicaCarnetsCond) {
            solicituddrvAplicaCarnets = Boolean.FALSE;
        }
    }

    private void solicituddrvAplicaCarnetsDerivationsDefault() {
        if (solicituddrvAplicaCarnets != null) return;
        // Default derivation
        // EFFECT   : TRUE
        solicituddrvAplicaCarnets = Boolean.TRUE;
    }

    /**
     * Computes the value of the <code>solicituddrvAplicaDocSolicitud</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvAplicaDocSolicitud</code> derived attribute.
     */
    public Boolean solicituddrvAplicaDocSolicitudDerivations() throws SystemException {

        solicituddrvAplicaDocSolicitud = null;

        solicituddrvAplicaDocSolicitudDerivationsConditional1();
        solicituddrvAplicaDocSolicitudDerivationsDefault();
        return solicituddrvAplicaDocSolicitud;
    }

    private void solicituddrvAplicaDocSolicitudDerivationsConditional1() throws SystemException {
        if (solicituddrvAplicaDocSolicitud != null) return;
        // CONDITION: EXIST( Aesolicitudes.ProductoT.Dominios.ReportesDominio ) WHERE (Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 0 AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici) = false
        // EFFECT   : FALSE
        boolean solicituddrvAplicaDocSolicitudCond = getSolicitudRepository().assocOperator053(this).equals(false);
        if (solicituddrvAplicaDocSolicitudCond) {
            solicituddrvAplicaDocSolicitud = Boolean.FALSE;
        }
    }

    private void solicituddrvAplicaDocSolicitudDerivationsDefault() {
        if (solicituddrvAplicaDocSolicitud != null) return;
        // Default derivation
        // EFFECT   : TRUE
        solicituddrvAplicaDocSolicitud = Boolean.TRUE;
    }

    /**
     * Computes the value of the <code>solicituddrvPuedeReplicar</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvPuedeReplicar</code> derived attribute.
     */
    public Boolean solicituddrvPuedeReplicarDerivations() {

        solicituddrvPuedeReplicar = null;

        solicituddrvPuedeReplicarDerivationsConditional1();
        solicituddrvPuedeReplicarDerivationsDefault();
        return solicituddrvPuedeReplicar;
    }

    private void solicituddrvPuedeReplicarDerivationsConditional1() {
        if (solicituddrvPuedeReplicar != null) return;
        // CONDITION: Tramite = 2 
        // EFFECT   : EstadoDoc = 2 
        boolean solicituddrvPuedeReplicarCond = (this.getSolicitudTramite()).equals(Long.valueOf(2));
        if (solicituddrvPuedeReplicarCond) {
            solicituddrvPuedeReplicar = (this.getSolicitudEstadoDoc()).equals(Long.valueOf(2));
        }
    }

    private void solicituddrvPuedeReplicarDerivationsDefault() {
        if (solicituddrvPuedeReplicar != null) return;
        // Default derivation
        // EFFECT   : TRUE
        solicituddrvPuedeReplicar = Boolean.TRUE;
    }

    /**
     * Computes the value of the <code>solicituddrvCambiarBenefCont</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvCambiarBenefCont</code> derived attribute.
     */
    public Boolean solicituddrvCambiarBenefContDerivations() throws SystemException {

        solicituddrvCambiarBenefCont = null;

        solicituddrvCambiarBenefContDerivationsConditional1();
        solicituddrvCambiarBenefContDerivationsConditional2();
        solicituddrvCambiarBenefContDerivationsConditional3();
        solicituddrvCambiarBenefContDerivationsConditional4();
        solicituddrvCambiarBenefContDerivationsConditional5();
        solicituddrvCambiarBenefContDerivationsDefault();
        return solicituddrvCambiarBenefCont;
    }

    private void solicituddrvCambiarBenefContDerivationsConditional1() {
        if (solicituddrvCambiarBenefCont != null) return;
        // CONDITION: Tramite <> 2 OR tipoContrato <> 1
        // EFFECT   : FALSE
        boolean solicituddrvCambiarBenefContCond = !(this.getSolicitudTramite()).equals(Long.valueOf(2)) || !(this.getSolicitudtipoContrato()).equals(Long.valueOf(1));
        if (solicituddrvCambiarBenefContCond) {
            solicituddrvCambiarBenefCont = Boolean.FALSE;
        }
    }

    private void solicituddrvCambiarBenefContDerivationsConditional2() throws SystemException {
        if (solicituddrvCambiarBenefCont != null) return;
        // CONDITION: EXIST(Contratante) = FALSE
        // EFFECT   : FALSE
        boolean solicituddrvCambiarBenefContCond = getSolicitudRepository().assocOperator042(this).equals(false);
        if (solicituddrvCambiarBenefContCond) {
            solicituddrvCambiarBenefCont = Boolean.FALSE;
        }
    }

    private void solicituddrvCambiarBenefContDerivationsConditional3() {
        if (solicituddrvCambiarBenefCont != null) return;
        // CONDITION: Contratante.TipoIdentificacion.NIT = true
        // EFFECT   : FALSE
        boolean solicituddrvCambiarBenefContCond = this.getContratante().getTipoIdentificacion().getTipoIdentificacionNIT().equals(true);
        if (solicituddrvCambiarBenefContCond) {
            solicituddrvCambiarBenefCont = Boolean.FALSE;
        }
    }

    private void solicituddrvCambiarBenefContDerivationsConditional4() {
        if (solicituddrvCambiarBenefCont != null) return;
        // CONDITION: Contratante.TitularConBeneficiosCORE = TRUE
        // EFFECT   : FALSE
        boolean solicituddrvCambiarBenefContCond = this.getContratante().getContratanteTitularConBeneficiosCORE().equals(true);
        if (solicituddrvCambiarBenefContCond) {
            solicituddrvCambiarBenefCont = Boolean.FALSE;
        }
    }

    private void solicituddrvCambiarBenefContDerivationsConditional5() throws SystemException {
        if (solicituddrvCambiarBenefCont != null) return;
        // CONDITION: COUNT( UsuariosRegistrados ) WHERE (UsuariosRegistrados.Parentesco.EsTitular = true) > 0
        // EFFECT   : FALSE
        boolean solicituddrvCambiarBenefContCond = getSolicitudRepository().assocOperator043(this) > Long.valueOf(0);
        if (solicituddrvCambiarBenefContCond) {
            solicituddrvCambiarBenefCont = Boolean.FALSE;
        }
    }

    private void solicituddrvCambiarBenefContDerivationsDefault() {
        if (solicituddrvCambiarBenefCont != null) return;
        // Default derivation
        // EFFECT   : TRUE
        solicituddrvCambiarBenefCont = Boolean.TRUE;
    }

    /**
     * Computes the value of the <code>solicituddrvEdadTitular</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvEdadTitular</code> derived attribute.
     */
    public Long solicituddrvEdadTitularDerivations() throws SystemException {

        solicituddrvEdadTitular = null;

        solicituddrvEdadTitularDerivationsConditional1();
        solicituddrvEdadTitularDerivationsConditional2();
        solicituddrvEdadTitularDerivationsDefault();
        return solicituddrvEdadTitular;
    }

    private void solicituddrvEdadTitularDerivationsConditional1() {
        if (solicituddrvEdadTitular != null) return;
        // CONDITION: drvTieneTitular = FALSE
        // EFFECT   : 0
        boolean solicituddrvEdadTitularCond = this.getSolicituddrvTieneTitular().equals(false);
        if (solicituddrvEdadTitularCond) {
            solicituddrvEdadTitular = Long.valueOf(0);
        }
    }

    private void solicituddrvEdadTitularDerivationsConditional2() throws SystemException {
        if (solicituddrvEdadTitular != null) return;
        // CONDITION: COUNT( UsuariosRegistrados ) WHERE (UsuariosRegistrados.Parentesco.EsTitular = true) > 0
        // EFFECT   : MAX( UsuariosRegistrados.drvEdad ) WHERE (UsuariosRegistrados.Parentesco.EsTitular = true)
        boolean solicituddrvEdadTitularCond = getSolicitudRepository().assocOperator044(this) > Long.valueOf(0);
        if (solicituddrvEdadTitularCond) {
            solicituddrvEdadTitular = getSolicitudRepository().assocOperator045(this);
        }
    }

    private void solicituddrvEdadTitularDerivationsDefault() throws SystemException {
        if (solicituddrvEdadTitular != null) return;
        // Default derivation
        // EFFECT   : MAX( Usuarios.drvEdad ) WHERE (Usuarios.drvEsElTitular = true)
        solicituddrvEdadTitular = getSolicitudRepository().assocOperator046(this);
    }

    /**
     * Computes the value of the <code>solicituddrvGeneroTitular</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvGeneroTitular</code> derived attribute.
     */
    public String solicituddrvGeneroTitularDerivations() throws SystemException {

        solicituddrvGeneroTitular = null;

        solicituddrvGeneroTitularDerivationsConditional1();
        solicituddrvGeneroTitularDerivationsConditional2();
        solicituddrvGeneroTitularDerivationsConditional3();
        solicituddrvGeneroTitularDerivationsConditional4();
        solicituddrvGeneroTitularDerivationsDefault();
        return solicituddrvGeneroTitular;
    }

    private void solicituddrvGeneroTitularDerivationsConditional1() {
        if (solicituddrvGeneroTitular != null) return;
        // CONDITION: drvTieneTitular = FALSE
        // EFFECT   : \"\"
        boolean solicituddrvGeneroTitularCond = this.getSolicituddrvTieneTitular().equals(false);
        if (solicituddrvGeneroTitularCond) {
            solicituddrvGeneroTitular = "";
        }
    }

    private void solicituddrvGeneroTitularDerivationsConditional2() throws SystemException {
        if (solicituddrvGeneroTitular != null) return;
        // CONDITION: COUNT( UsuariosRegistrados ) WHERE (UsuariosRegistrados.Parentesco.EsTitular = true) > 0
        // EFFECT   : GETONE( UsuariosRegistrados.Genero ) WHERE (UsuariosRegistrados.Parentesco.EsTitular = true)
        boolean solicituddrvGeneroTitularCond = getSolicitudRepository().assocOperator047(this) > Long.valueOf(0);
        if (solicituddrvGeneroTitularCond) {
            solicituddrvGeneroTitular = getSolicitudRepository().assocOperator048(this);
        }
    }

    private void solicituddrvGeneroTitularDerivationsConditional3() throws SystemException {
        if (solicituddrvGeneroTitular != null) return;
        // CONDITION: EXIST( Usuarios ) WHERE (Usuarios.drvEsElTitular = true AND Usuarios.UsuarioPersona.Genero = \"F\") = true
        // EFFECT   : \"F\"
        boolean solicituddrvGeneroTitularCond = getSolicitudRepository().assocOperator049(this).equals(true);
        if (solicituddrvGeneroTitularCond) {
            solicituddrvGeneroTitular = "F";
        }
    }

    private void solicituddrvGeneroTitularDerivationsConditional4() throws SystemException {
        if (solicituddrvGeneroTitular != null) return;
        // CONDITION: EXIST( Usuarios ) WHERE (Usuarios.drvEsElTitular = true AND Usuarios.UsuarioPersona.Genero = \"M\") = true
        // EFFECT   : \"M\"
        boolean solicituddrvGeneroTitularCond = getSolicitudRepository().assocOperator050(this).equals(true);
        if (solicituddrvGeneroTitularCond) {
            solicituddrvGeneroTitular = "M";
        }
    }

    private void solicituddrvGeneroTitularDerivationsDefault() {
        if (solicituddrvGeneroTitular != null) return;
        // Default derivation
        // EFFECT   : \"\"
        solicituddrvGeneroTitular = "";
    }

    /**
     * Computes the value of the <code>solicituddrvTieneTitular</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvTieneTitular</code> derived attribute.
     */
    public Boolean solicituddrvTieneTitularDerivations() throws SystemException {

        solicituddrvTieneTitular = null;

        solicituddrvTieneTitularDerivationsConditional1();
        solicituddrvTieneTitularDerivationsDefault();
        return solicituddrvTieneTitular;
    }

    private void solicituddrvTieneTitularDerivationsConditional1() throws SystemException {
        if (solicituddrvTieneTitular != null) return;
        // CONDITION: COUNT( Usuarios ) WHERE (Usuarios.Parentesco.EsTitular = true) + COUNT( UsuariosRegistrados ) WHERE (UsuariosRegistrados.Parentesco.EsTitular = true) > 0
        // EFFECT   : TRUE
        boolean solicituddrvTieneTitularCond = getSolicitudRepository().assocOperator051(this) + getSolicitudRepository().assocOperator052(this) > Long.valueOf(0);
        if (solicituddrvTieneTitularCond) {
            solicituddrvTieneTitular = Boolean.TRUE;
        }
    }

    private void solicituddrvTieneTitularDerivationsDefault() {
        if (solicituddrvTieneTitular != null) return;
        // Default derivation
        // EFFECT   : FALSE
        solicituddrvTieneTitular = Boolean.FALSE;
    }

    /**
     * Computes the value of the <code>solicituddrvObservacionesReport</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvObservacionesReport</code> derived attribute.
     */
    public String solicituddrvObservacionesReportDerivations() {

        solicituddrvObservacionesReport = null;

        solicituddrvObservacionesReportDerivationsDefault();
        return solicituddrvObservacionesReport;
    }

    private void solicituddrvObservacionesReportDerivationsDefault() {
        if (solicituddrvObservacionesReport != null) return;
        // Default derivation
        // EFFECT   : fuFormarTextoObservaciones(this)
        solicituddrvObservacionesReport = userFunctionsSrv.fuFormarTextoObservacionesFun(this);
    }

    /**
     * Computes the value of the <code>solicituddrvIgnorarPreexistencias</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvIgnorarPreexistencias</code> derived attribute.
     */
    public Boolean solicituddrvIgnorarPreexistenciasDerivations() throws SystemException {

        solicituddrvIgnorarPreexistencias = null;

        solicituddrvIgnorarPreexistenciasDerivationsConditional1();
        solicituddrvIgnorarPreexistenciasDerivationsConditional2();
        solicituddrvIgnorarPreexistenciasDerivationsDefault();
        return solicituddrvIgnorarPreexistencias;
    }

    private void solicituddrvIgnorarPreexistenciasDerivationsConditional1() throws SystemException {
        if (solicituddrvIgnorarPreexistencias != null) return;
        // CONDITION: EXIST( Aesolicitudes.ProductoT.Dominios ) WHERE (Aesolicitudes.ProductoT.Dominios.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.IgnorarPreexistencias = true) = true
        // EFFECT   : TRUE
        boolean solicituddrvIgnorarPreexistenciasCond = getSolicitudRepository().assocOperator054(this).equals(true);
        if (solicituddrvIgnorarPreexistenciasCond) {
            solicituddrvIgnorarPreexistencias = Boolean.TRUE;
        }
    }

    private void solicituddrvIgnorarPreexistenciasDerivationsConditional2() {
        if (solicituddrvIgnorarPreexistencias != null) return;
        // CONDITION: Aesolicitudes.PlanT.AceptaPreexistencias = false
        // EFFECT   : TRUE
        boolean solicituddrvIgnorarPreexistenciasCond = this.getAesolicitudes().getPlanT().getPlanesAceptaPreexistencias().equals(false);
        if (solicituddrvIgnorarPreexistenciasCond) {
            solicituddrvIgnorarPreexistencias = Boolean.TRUE;
        }
    }

    private void solicituddrvIgnorarPreexistenciasDerivationsDefault() {
        if (solicituddrvIgnorarPreexistencias != null) return;
        // Default derivation
        // EFFECT   : FALSE
        solicituddrvIgnorarPreexistencias = Boolean.FALSE;
    }

    /**
     * Computes the value of the <code>solicituddrvTienePrimeraFirma</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvTienePrimeraFirma</code> derived attribute.
     */
    public Boolean solicituddrvTienePrimeraFirmaDerivations() throws SystemException {

        solicituddrvTienePrimeraFirma = null;

        solicituddrvTienePrimeraFirmaDerivationsDefault();
        return solicituddrvTienePrimeraFirma;
    }

    private void solicituddrvTienePrimeraFirmaDerivationsDefault() throws SystemException {
        if (solicituddrvTienePrimeraFirma != null) return;
        // Default derivation
        // EFFECT   : EXIST(Firma)
        solicituddrvTienePrimeraFirma = getSolicitudRepository().assocOperator055(this);
    }

    /**
     * Computes the value of the <code>solicituddrvNumContrato</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvNumContrato</code> derived attribute.
     */
    public String solicituddrvNumContratoDerivations() {

        solicituddrvNumContrato = null;

        solicituddrvNumContratoDerivationsConditional1();
        solicituddrvNumContratoDerivationsDefault();
        return solicituddrvNumContrato;
    }

    private void solicituddrvNumContratoDerivationsConditional1() {
        if (solicituddrvNumContrato != null) return;
        // CONDITION: Tramite = 1
        // EFFECT   : NumContrato
        boolean solicituddrvNumContratoCond = (this.getSolicitudTramite()).equals(Long.valueOf(1));
        if (solicituddrvNumContratoCond) {
            solicituddrvNumContrato = this.getSolicitudNumContrato();
        }
    }

    private void solicituddrvNumContratoDerivationsDefault() {
        if (solicituddrvNumContrato != null) return;
        // Default derivation
        // EFFECT   : NumContratoInclusion
        solicituddrvNumContrato = this.getSolicitudNumContratoInclusion();
    }

    /**
     * Computes the value of the <code>solicituddrvImpTarifaPlanVol</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvImpTarifaPlanVol</code> derived attribute.
     */
    public Double solicituddrvImpTarifaPlanVolDerivations() throws SystemException {

        solicituddrvImpTarifaPlanVol = null;

        solicituddrvImpTarifaPlanVolDerivationsConditional1();
        solicituddrvImpTarifaPlanVolDerivationsConditional2();
        solicituddrvImpTarifaPlanVolDerivationsDefault();
        return solicituddrvImpTarifaPlanVol;
    }

    private void solicituddrvImpTarifaPlanVolDerivationsConditional1() {
        if (solicituddrvImpTarifaPlanVol != null) return;
        // CONDITION: Aesolicitudes.PlanT.EsVoluntario = false
        // EFFECT   : 0
        boolean solicituddrvImpTarifaPlanVolCond = this.getAesolicitudes().getPlanT().getPlanesEsVoluntario().equals(false);
        if (solicituddrvImpTarifaPlanVolCond) {
            solicituddrvImpTarifaPlanVol = Utilities.convertToDouble(Long.valueOf(0));
        }
    }

    private void solicituddrvImpTarifaPlanVolDerivationsConditional2() throws SystemException {
        if (solicituddrvImpTarifaPlanVol != null) return;
        // CONDITION: EXIST( Usuarios ) WHERE (Usuarios.drvImpTarifaPlanVol = 0) = true
        // EFFECT   : 0
        boolean solicituddrvImpTarifaPlanVolCond = getSolicitudRepository().assocOperator056(this).equals(true);
        if (solicituddrvImpTarifaPlanVolCond) {
            solicituddrvImpTarifaPlanVol = Utilities.convertToDouble(Long.valueOf(0));
        }
    }

    private void solicituddrvImpTarifaPlanVolDerivationsDefault() throws SystemException {
        if (solicituddrvImpTarifaPlanVol != null) return;
        // Default derivation
        // EFFECT   : SUM( Usuarios.drvImpTarifaPlanVol )
        solicituddrvImpTarifaPlanVol = getSolicitudRepository().assocOperator057(this);
    }

    /**
     * Computes the value of the <code>solicituddrvAplicaDocProtDatos</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvAplicaDocProtDatos</code> derived attribute.
     */
    public Boolean solicituddrvAplicaDocProtDatosDerivations() throws SystemException {

        solicituddrvAplicaDocProtDatos = null;

        solicituddrvAplicaDocProtDatosDerivationsConditional1();
        solicituddrvAplicaDocProtDatosDerivationsConditional2();
        solicituddrvAplicaDocProtDatosDerivationsDefault();
        return solicituddrvAplicaDocProtDatos;
    }

    private void solicituddrvAplicaDocProtDatosDerivationsConditional1() throws SystemException {
        if (solicituddrvAplicaDocProtDatos != null) return;
        // CONDITION: EXIST( Aesolicitudes.ProductoT.Dominios.ReportesDominio ) WHERE (Aesolicitudes.ProductoT.Dominios.ReportesDominio.Dominio.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.Tipo = 5 AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.PlantillaReporte.FechaVigencia <= Aesolicitudes.Fesolici AND Aesolicitudes.ProductoT.Dominios.ReportesDominio.drvFechaHasta > Aesolicitudes.Fesolici) = false
        // EFFECT   : FALSE
        boolean solicituddrvAplicaDocProtDatosCond = getSolicitudRepository().assocOperator058(this).equals(false);
        if (solicituddrvAplicaDocProtDatosCond) {
            solicituddrvAplicaDocProtDatos = Boolean.FALSE;
        }
    }

    private void solicituddrvAplicaDocProtDatosDerivationsConditional2() throws SystemException {
        if (solicituddrvAplicaDocProtDatos != null) return;
        // CONDITION: EXIST( Usuarios ) WHERE (Usuarios.EstadoBeneficiario.EsActivo = true) = false
        // EFFECT   : FALSE
        boolean solicituddrvAplicaDocProtDatosCond = getSolicitudRepository().assocOperator059(this).equals(false);
        if (solicituddrvAplicaDocProtDatosCond) {
            solicituddrvAplicaDocProtDatos = Boolean.FALSE;
        }
    }

    private void solicituddrvAplicaDocProtDatosDerivationsDefault() {
        if (solicituddrvAplicaDocProtDatos != null) return;
        // Default derivation
        // EFFECT   : TRUE
        solicituddrvAplicaDocProtDatos = Boolean.TRUE;
    }

    /**
     * Computes the value of the <code>solicituddrvPuedeModificarGrupo</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvPuedeModificarGrupo</code> derived attribute.
     */
    public Boolean solicituddrvPuedeModificarGrupoDerivations() throws SystemException {

        solicituddrvPuedeModificarGrupo = null;

        solicituddrvPuedeModificarGrupoDerivationsConditional1();
        solicituddrvPuedeModificarGrupoDerivationsDefault();
        return solicituddrvPuedeModificarGrupo;
    }

    private void solicituddrvPuedeModificarGrupoDerivationsConditional1() throws SystemException {
        if (solicituddrvPuedeModificarGrupo != null) return;
        // CONDITION: EXIST( Aesolicitudes.ProductoT.Dominios ) WHERE (Aesolicitudes.ProductoT.Dominios.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.InclusionModGrupoAsoc = true) = true
        // EFFECT   : TRUE
        boolean solicituddrvPuedeModificarGrupoCond = getSolicitudRepository().assocOperator060(this).equals(true);
        if (solicituddrvPuedeModificarGrupoCond) {
            solicituddrvPuedeModificarGrupo = Boolean.TRUE;
        }
    }

    private void solicituddrvPuedeModificarGrupoDerivationsDefault() {
        if (solicituddrvPuedeModificarGrupo != null) return;
        // Default derivation
        // EFFECT   : FALSE
        solicituddrvPuedeModificarGrupo = Boolean.FALSE;
    }

    /**
     * Computes the value of the <code>solicituddrvAplicaPolizaInternacional</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvAplicaPolizaInternacional</code> derived attribute.
     */
    public Boolean solicituddrvAplicaPolizaInternacionalDerivations() throws SystemException {

        solicituddrvAplicaPolizaInternacional = null;

        solicituddrvAplicaPolizaInternacionalDerivationsConditional1();
        solicituddrvAplicaPolizaInternacionalDerivationsDefault();
        return solicituddrvAplicaPolizaInternacional;
    }

    private void solicituddrvAplicaPolizaInternacionalDerivationsConditional1() throws SystemException {
        if (solicituddrvAplicaPolizaInternacional != null) return;
        // CONDITION: EXIST( Aesolicitudes.ProductoT.Dominios ) WHERE (Aesolicitudes.ProductoT.Dominios.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.AcepPolizaInter = true) = true
        // EFFECT   : TRUE
        boolean solicituddrvAplicaPolizaInternacionalCond = getSolicitudRepository().assocOperator061(this).equals(true);
        if (solicituddrvAplicaPolizaInternacionalCond) {
            solicituddrvAplicaPolizaInternacional = Boolean.TRUE;
        }
    }

    private void solicituddrvAplicaPolizaInternacionalDerivationsDefault() {
        if (solicituddrvAplicaPolizaInternacional != null) return;
        // Default derivation
        // EFFECT   : FALSE
        solicituddrvAplicaPolizaInternacional = Boolean.FALSE;
    }

    /**
     * Computes the value of the <code>solicituddrvPolizaInternacional</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvPolizaInternacional</code> derived attribute.
     */
    public Boolean solicituddrvPolizaInternacionalDerivations() throws SystemException {

        solicituddrvPolizaInternacional = null;

        solicituddrvPolizaInternacionalDerivationsConditional1();
        solicituddrvPolizaInternacionalDerivationsDefault();
        return solicituddrvPolizaInternacional;
    }

    private void solicituddrvPolizaInternacionalDerivationsConditional1() throws SystemException {
        if (solicituddrvPolizaInternacional != null) return;
        // CONDITION: COUNT( Usuarios ) WHERE (Usuarios.PolizaInternacional = true) > 0
        // EFFECT   : TRUE
        boolean solicituddrvPolizaInternacionalCond = getSolicitudRepository().assocOperator062(this) > Long.valueOf(0);
        if (solicituddrvPolizaInternacionalCond) {
            solicituddrvPolizaInternacional = Boolean.TRUE;
        }
    }

    private void solicituddrvPolizaInternacionalDerivationsDefault() {
        if (solicituddrvPolizaInternacional != null) return;
        // Default derivation
        // EFFECT   : FALSE
        solicituddrvPolizaInternacional = Boolean.FALSE;
    }

    /**
     * Computes the value of the <code>solicituddrvPermiteRechazados</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvPermiteRechazados</code> derived attribute.
     */
    public Boolean solicituddrvPermiteRechazadosDerivations() throws SystemException {

        solicituddrvPermiteRechazados = null;

        solicituddrvPermiteRechazadosDerivationsConditional1();
        solicituddrvPermiteRechazadosDerivationsDefault();
        return solicituddrvPermiteRechazados;
    }

    private void solicituddrvPermiteRechazadosDerivationsConditional1() throws SystemException {
        if (solicituddrvPermiteRechazados != null) return;
        // CONDITION: EXIST( Aesolicitudes.ProductoT.Dominios ) WHERE (Aesolicitudes.ProductoT.Dominios.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.PermiteRechazadosAfi = true) = true
        // EFFECT   : TRUE
        boolean solicituddrvPermiteRechazadosCond = getSolicitudRepository().assocOperator063(this).equals(true);
        if (solicituddrvPermiteRechazadosCond) {
            solicituddrvPermiteRechazados = Boolean.TRUE;
        }
    }

    private void solicituddrvPermiteRechazadosDerivationsDefault() {
        if (solicituddrvPermiteRechazados != null) return;
        // Default derivation
        // EFFECT   : FALSE
        solicituddrvPermiteRechazados = Boolean.FALSE;
    }

    /**
     * Computes the value of the <code>solicituddrvAlgunUsuarioIMC</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvAlgunUsuarioIMC</code> derived attribute.
     */
    public Boolean solicituddrvAlgunUsuarioIMCDerivations() throws SystemException {

        solicituddrvAlgunUsuarioIMC = null;

        solicituddrvAlgunUsuarioIMCDerivationsConditional1();
        solicituddrvAlgunUsuarioIMCDerivationsConditional2();
        solicituddrvAlgunUsuarioIMCDerivationsDefault();
        return solicituddrvAlgunUsuarioIMC;
    }

    private void solicituddrvAlgunUsuarioIMCDerivationsConditional1() {
        if (solicituddrvAlgunUsuarioIMC != null) return;
        // CONDITION: fugetValorParametroConf( \"EDADIMC\" ) = NULL OR fugetValorParametroConf( \"MAXIMC\" ) = NULL
        // EFFECT   : FALSE
        boolean solicituddrvAlgunUsuarioIMCCond = userFunctionsSrv.fugetValorParametroConfFun("EDADIMC") == null || userFunctionsSrv.fugetValorParametroConfFun("MAXIMC") == null;
        if (solicituddrvAlgunUsuarioIMCCond) {
            solicituddrvAlgunUsuarioIMC = Boolean.FALSE;
        }
    }

    private void solicituddrvAlgunUsuarioIMCDerivationsConditional2() throws SystemException {
        if (solicituddrvAlgunUsuarioIMC != null) return;
        // CONDITION: COUNT( Usuarios ) WHERE (Usuarios.IMC <> NULL AND Usuarios.drvEdad >= StrToReal(fugetValorParametroConf(\"EDADIMC\")) AND Usuarios.IMC > StrToReal(fugetValorParametroConf(\"MAXIMC\"))) > 0
        // EFFECT   : TRUE
        boolean solicituddrvAlgunUsuarioIMCCond = getSolicitudRepository().assocOperator064(this) > Long.valueOf(0);
        if (solicituddrvAlgunUsuarioIMCCond) {
            solicituddrvAlgunUsuarioIMC = Boolean.TRUE;
        }
    }

    private void solicituddrvAlgunUsuarioIMCDerivationsDefault() {
        if (solicituddrvAlgunUsuarioIMC != null) return;
        // Default derivation
        // EFFECT   : FALSE
        solicituddrvAlgunUsuarioIMC = Boolean.FALSE;
    }

    /**
     * Computes the value of the <code>solicituddrvFechaPorcenIVA</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvFechaPorcenIVA</code> derived attribute.
     */
    public Date solicituddrvFechaPorcenIVADerivations() {

        solicituddrvFechaPorcenIVA = null;

        solicituddrvFechaPorcenIVADerivationsConditional1();
        solicituddrvFechaPorcenIVADerivationsConditional2();
        solicituddrvFechaPorcenIVADerivationsDefault();
        return solicituddrvFechaPorcenIVA;
    }

    private void solicituddrvFechaPorcenIVADerivationsConditional1() {
        if (solicituddrvFechaPorcenIVA != null) return;
        // CONDITION: Aesolicitudes.PlanT.EsVoluntario = false
        // EFFECT   : FInicioContrato
        boolean solicituddrvFechaPorcenIVACond = this.getAesolicitudes().getPlanT().getPlanesEsVoluntario().equals(false);
        if (solicituddrvFechaPorcenIVACond) {
            solicituddrvFechaPorcenIVA = this.getSolicitudFInicioContrato();
        }
    }

    private void solicituddrvFechaPorcenIVADerivationsConditional2() {
        if (solicituddrvFechaPorcenIVA != null) return;
        // CONDITION: FInicioContrato <> NULL
        // EFFECT   : FInicioContrato
        boolean solicituddrvFechaPorcenIVACond = this.getSolicitudFInicioContrato() != null;
        if (solicituddrvFechaPorcenIVACond) {
            solicituddrvFechaPorcenIVA = this.getSolicitudFInicioContrato();
        }
    }

    private void solicituddrvFechaPorcenIVADerivationsDefault() {
        if (solicituddrvFechaPorcenIVA != null) return;
        // Default derivation
        // EFFECT   : dateAdd( \"m\", 1, formatToDate( getYear( systemDate() ),getMonth(systemDate()), 1 ) ) 
        solicituddrvFechaPorcenIVA = STDFunctions.dateAddFun("m", Long.valueOf(1), STDFunctions.formatToDateFun(STDFunctions.getYearFun(STDFunctions.systemDateFun()), STDFunctions.getMonthFun(STDFunctions.systemDateFun()), Long.valueOf(1)));
    }

    /**
     * Computes the value of the <code>solicituddrvSemaforoGrabAse</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvSemaforoGrabAse</code> derived attribute.
     */
    public Double solicituddrvSemaforoGrabAseDerivations() {

        solicituddrvSemaforoGrabAse = null;

        solicituddrvSemaforoGrabAseDerivationsConditional1();
        solicituddrvSemaforoGrabAseDerivationsDefault();
        return solicituddrvSemaforoGrabAse;
    }

    private void solicituddrvSemaforoGrabAseDerivationsConditional1() {
        if (solicituddrvSemaforoGrabAse != null) return;
        // CONDITION: FechaTerminada <> NULL
        // EFFECT   : SemaforoGrabAse
        boolean solicituddrvSemaforoGrabAseCond = this.getSolicitudFechaTerminada() != null;
        if (solicituddrvSemaforoGrabAseCond) {
            solicituddrvSemaforoGrabAse = this.getSolicitudSemaforoGrabAse();
        }
    }

    private void solicituddrvSemaforoGrabAseDerivationsDefault() {
        if (solicituddrvSemaforoGrabAse != null) return;
        // Default derivation
        // EFFECT   : fuCallSPgetsemaforograbador(Aesolicitudes.idsolicitud)
        solicituddrvSemaforoGrabAse = userFunctionsSrv.fuCallSPgetsemaforograbadorFun(this.getAesolicitudes().getAesolicitudesidsolicitud());
    }

    /**
     * Computes the value of the <code>solicituddrvSemaforoAreaMed</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvSemaforoAreaMed</code> derived attribute.
     */
    public Double solicituddrvSemaforoAreaMedDerivations() throws SystemException {

        solicituddrvSemaforoAreaMed = null;

        solicituddrvSemaforoAreaMedDerivationsConditional1();
        solicituddrvSemaforoAreaMedDerivationsConditional2();
        solicituddrvSemaforoAreaMedDerivationsDefault();
        return solicituddrvSemaforoAreaMed;
    }

    private void solicituddrvSemaforoAreaMedDerivationsConditional1() {
        if (solicituddrvSemaforoAreaMed != null) return;
        // CONDITION: FechaTerminada <> NULL
        // EFFECT   : SemaforoAreaMed
        boolean solicituddrvSemaforoAreaMedCond = this.getSolicitudFechaTerminada() != null;
        if (solicituddrvSemaforoAreaMedCond) {
            solicituddrvSemaforoAreaMed = this.getSolicitudSemaforoAreaMed();
        }
    }

    private void solicituddrvSemaforoAreaMedDerivationsConditional2() throws SystemException {
        if (solicituddrvSemaforoAreaMed != null) return;
        // CONDITION: EXIST(UsrAreaMedica) = FALSE
        // EFFECT   : 0
        boolean solicituddrvSemaforoAreaMedCond = getSolicitudRepository().assocOperator065(this).equals(false);
        if (solicituddrvSemaforoAreaMedCond) {
            solicituddrvSemaforoAreaMed = Utilities.convertToDouble(Long.valueOf(0));
        }
    }

    private void solicituddrvSemaforoAreaMedDerivationsDefault() {
        if (solicituddrvSemaforoAreaMed != null) return;
        // Default derivation
        // EFFECT   : fuCallSPgetsemaforoareamed(Aesolicitudes.idsolicitud)
        solicituddrvSemaforoAreaMed = userFunctionsSrv.fuCallSPgetsemaforoareamedFun(this.getAesolicitudes().getAesolicitudesidsolicitud());
    }

    /**
     * Computes the value of the <code>solicitudDrvEstadoHomologado</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicitudDrvEstadoHomologado</code> derived attribute.
     */
    public Long solicitudDrvEstadoHomologadoDerivations() {

        solicitudDrvEstadoHomologado = null;

        solicitudDrvEstadoHomologadoDerivationsConditional1();
        solicitudDrvEstadoHomologadoDerivationsDefault();
        return solicitudDrvEstadoHomologado;
    }

    private void solicitudDrvEstadoHomologadoDerivationsConditional1() {
        if (solicitudDrvEstadoHomologado != null) return;
        // CONDITION: Estado = 8
        // EFFECT   : 1
        boolean solicitudDrvEstadoHomologadoCond = (this.getSolicitudEstado()).equals(Long.valueOf(8));
        if (solicitudDrvEstadoHomologadoCond) {
            solicitudDrvEstadoHomologado = Long.valueOf(1);
        }
    }

    private void solicitudDrvEstadoHomologadoDerivationsDefault() {
        if (solicitudDrvEstadoHomologado != null) return;
        // Default derivation
        // EFFECT   : Estado 
        solicitudDrvEstadoHomologado = this.getSolicitudEstado();
    }

    /**
     * Computes the value of the <code>solicituddrvValidarDatosContratante</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvValidarDatosContratante</code> derived attribute.
     */
    public Boolean solicituddrvValidarDatosContratanteDerivations() throws SystemException {

        solicituddrvValidarDatosContratante = null;

        solicituddrvValidarDatosContratanteDerivationsConditional1();
        solicituddrvValidarDatosContratanteDerivationsDefault();
        return solicituddrvValidarDatosContratante;
    }

    private void solicituddrvValidarDatosContratanteDerivationsConditional1() throws SystemException {
        if (solicituddrvValidarDatosContratante != null) return;
        // CONDITION: EXIST( ContratantePersona ) = true AND ContratantePersona.TipoIdentificacion.NIT = false
        // EFFECT   : TRUE
        boolean solicituddrvValidarDatosContratanteCond = getSolicitudRepository().assocOperator066(this).equals(true) && this.getContratantePersona().getTipoIdentificacion().getTipoIdentificacionNIT().equals(false);
        if (solicituddrvValidarDatosContratanteCond) {
            solicituddrvValidarDatosContratante = Boolean.TRUE;
        }
    }

    private void solicituddrvValidarDatosContratanteDerivationsDefault() {
        if (solicituddrvValidarDatosContratante != null) return;
        // Default derivation
        // EFFECT   : FALSE
        solicituddrvValidarDatosContratante = Boolean.FALSE;
    }

    /**
     * Computes the value of the <code>solicituddrvTramitarEnLinea</code> attribute according to its
     * derivations.
     *
     * @return Computed value of the <code>solicituddrvTramitarEnLinea</code> derived attribute.
     */
    public Boolean solicituddrvTramitarEnLineaDerivations() throws SystemException {

        solicituddrvTramitarEnLinea = null;

        solicituddrvTramitarEnLineaDerivationsConditional1();
        solicituddrvTramitarEnLineaDerivationsDefault();
        return solicituddrvTramitarEnLinea;
    }

    private void solicituddrvTramitarEnLineaDerivationsConditional1() throws SystemException {
        if (solicituddrvTramitarEnLinea != null) return;
        // CONDITION: COUNT( Aesolicitudes.ProductoT.Dominios ) WHERE (Aesolicitudes.ProductoT.Dominios.PlanT = Aesolicitudes.PlanT AND Aesolicitudes.ProductoT.Dominios.TramiteEnLinea = true) > 0
        // EFFECT   : TRUE
        boolean solicituddrvTramitarEnLineaCond = getSolicitudRepository().assocOperator067(this) > Long.valueOf(0);
        if (solicituddrvTramitarEnLineaCond) {
            solicituddrvTramitarEnLinea = Boolean.TRUE;
        }
    }

    private void solicituddrvTramitarEnLineaDerivationsDefault() {
        if (solicituddrvTramitarEnLinea != null) return;
        // Default derivation
        // EFFECT   : FALSE
        solicituddrvTramitarEnLinea = Boolean.FALSE;
    }
    /**
     * This method initializes the properties of the entity and its relations.
     */
    private void initAttributes() {
        solicitudNumRadicado = Long.valueOf(0);
        solicitudTramite = Long.valueOf(0);
        solicitudNumContrato = null;
        solicitudFInicioContrato = null;
        solicitudEsTraslado = false;
        solicitudtipoContrato = Long.valueOf(0);
        solicitudcodigoSucursalRad = null;
        solicitudcontratoConFirma = false;
        solicitudobservacions = null;
        solicitudexentoIVA = null;
        solicitudvalorCuota = null;
        solicitudvalorDtoComercialSim = null;
        solicitudValorCuotaInscrip = null;
        solicitudValorDtoFinanciero = null;
        solicitudValorDtoComercial = null;
        solicituddatosPagoOK = false;
        solicitudvalorCuotaPeriodoC = null;
        solicituddescuentoComercialC = null;
        solicitudIVAC = null;
        solicituddescuentoFinancieroC = null;
        solicitudTieneDifLiquidacion = false;
        solicitudUsuariosValidados = false;
        solicitudNumContratoInclusion = null;
        solicitudNumFamilia = null;
        solicitudEmailURLPagoEnviado = null;
        solicitudEmailDocuEnviado = null;
        solicitudDocsEnviados = null;
        solicitudcodDirector = "";
        solicitudvalorCuotaBrutaC = null;
        solicitudCodTarifa = null;
        solicitudCompletada = false;
        solicitudEstado = Long.valueOf(0);
        solicitudFIniVigContInc = null;
        solicitudPorcentajeProrrateo = null;
        solicitudGrupoDelCORE = null;
        solicitudTipoFacturaCORE = null;
        solicitudResultSMSInfoPago = null;
        solicitudFechaCompletada = null;
        solicitudFechaUltimoDoc = null;
        solicitudPrioridad = Long.valueOf(0);
        solicitudFechaTerminada = null;
        solicitudFechaFUG = null;
        solicitudFechaFA = null;
        solicitudFechaFAAM = null;
        solicitudSemaforoGrabAse = null;
        solicitudSemaforoAreaMed = null;
        solicitudEstadoDoc = Long.valueOf(0);
        solicitudEnvioCarnetFisico = false;
        direccion = null;
        proteccionDatos = null;
        usuarios = null;
        contratante = null;
        firma = null;
        segundaFirma = null;
        firmaContratanteIncl = null;
        usuariosRegistrados = null;
        titular = null;
        documentosGestor = null;
        erroresWS = null;
        logEstado = null;
        logAsignaciones = null;
        aesolicitudes = null;
        contratantePersona = null;
        titularPersona = null;
        grupoAsociado = null;
        agente = null;
        formaPago = null;
        periodicidad = null;
        contratoC = null;
        usrAreaMedica = null;
        tipoFactura = null;
        usrAfiliacion = null;
        values = new HashMap<>();
        userFunctionsSrv = Arc.container().select(UserFunctions.class).get();

        clearModifiedFlags();
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
    public ContratanteJpaRepository getContratanteRepository() {
        return Arc.container().select(ContratanteJpaRepository.class).get();
    }
    public UsuarioRegJpaRepository getUsuarioRegRepository() {
        return Arc.container().select(UsuarioRegJpaRepository.class).get();
    }
    public TitularJpaRepository getTitularRepository() {
        return Arc.container().select(TitularJpaRepository.class).get();
    }
    public DocumentoGJpaRepository getDocumentoGRepository() {
        return Arc.container().select(DocumentoGJpaRepository.class).get();
    }
    public LogEstadoJpaRepository getLogEstadoRepository() {
        return Arc.container().select(LogEstadoJpaRepository.class).get();
    }
    public LogAsignacionesJpaRepository getLogAsignacionesRepository() {
        return Arc.container().select(LogAsignacionesJpaRepository.class).get();
    }
    public PersonaJpaRepository getPersonaRepository() {
        return Arc.container().select(PersonaJpaRepository.class).get();
    }
    public FuncionarioJpaRepository getFuncionarioRepository() {
        return Arc.container().select(FuncionarioJpaRepository.class).get();
    }
    public PeriodicidadJpaRepository getPeriodicidadRepository() {
        return Arc.container().select(PeriodicidadJpaRepository.class).get();
    }
    public AreaMedicaJpaRepository getAreaMedicaRepository() {
        return Arc.container().select(AreaMedicaJpaRepository.class).get();
    }

    @Override
    protected Method[] getMethods() {
    	return Solicitud.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return SolicitudConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
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
    	modifiedSolicitudNumRadicado = false;
    	values.put("solicitudNumRadicado", getSolicitudNumRadicado());
    	modifiedSolicitudTramite = false;
    	values.put("solicitudTramite", getSolicitudTramite());
    	modifiedSolicitudNumContrato = false;
    	values.put("solicitudNumContrato", getSolicitudNumContrato());
    	modifiedSolicitudFInicioContrato = false;
    	values.put("solicitudFInicioContrato", getSolicitudFInicioContrato());
    	modifiedSolicitudEsTraslado = false;
    	values.put("solicitudEsTraslado", getSolicitudEsTraslado());
    	modifiedSolicitudtipoContrato = false;
    	values.put("solicitudtipoContrato", getSolicitudtipoContrato());
    	modifiedSolicitudcodigoSucursalRad = false;
    	values.put("solicitudcodigoSucursalRad", getSolicitudcodigoSucursalRad());
    	modifiedSolicitudcontratoConFirma = false;
    	values.put("solicitudcontratoConFirma", getSolicitudcontratoConFirma());
    	modifiedSolicitudobservacions = false;
    	values.put("solicitudobservacions", getSolicitudobservacions());
    	modifiedSolicitudexentoIVA = false;
    	values.put("solicitudexentoIVA", getSolicitudexentoIVA());
    	modifiedSolicitudvalorCuota = false;
    	values.put("solicitudvalorCuota", getSolicitudvalorCuota());
    	modifiedSolicitudvalorDtoComercialSim = false;
    	values.put("solicitudvalorDtoComercialSim", getSolicitudvalorDtoComercialSim());
    	modifiedSolicitudValorCuotaInscrip = false;
    	values.put("solicitudValorCuotaInscrip", getSolicitudValorCuotaInscrip());
    	modifiedSolicitudValorDtoFinanciero = false;
    	values.put("solicitudValorDtoFinanciero", getSolicitudValorDtoFinanciero());
    	modifiedSolicitudValorDtoComercial = false;
    	values.put("solicitudValorDtoComercial", getSolicitudValorDtoComercial());
    	modifiedSolicituddatosPagoOK = false;
    	values.put("solicituddatosPagoOK", getSolicituddatosPagoOK());
    	modifiedSolicitudvalorCuotaPeriodoC = false;
    	values.put("solicitudvalorCuotaPeriodoC", getSolicitudvalorCuotaPeriodoC());
    	modifiedSolicituddescuentoComercialC = false;
    	values.put("solicituddescuentoComercialC", getSolicituddescuentoComercialC());
    	modifiedSolicitudIVAC = false;
    	values.put("solicitudIVAC", getSolicitudIVAC());
    	modifiedSolicituddescuentoFinancieroC = false;
    	values.put("solicituddescuentoFinancieroC", getSolicituddescuentoFinancieroC());
    	modifiedSolicitudTieneDifLiquidacion = false;
    	values.put("solicitudTieneDifLiquidacion", getSolicitudTieneDifLiquidacion());
    	modifiedSolicitudUsuariosValidados = false;
    	values.put("solicitudUsuariosValidados", getSolicitudUsuariosValidados());
    	modifiedSolicitudNumContratoInclusion = false;
    	values.put("solicitudNumContratoInclusion", getSolicitudNumContratoInclusion());
    	modifiedSolicitudNumFamilia = false;
    	values.put("solicitudNumFamilia", getSolicitudNumFamilia());
    	modifiedSolicitudEmailURLPagoEnviado = false;
    	values.put("solicitudEmailURLPagoEnviado", getSolicitudEmailURLPagoEnviado());
    	modifiedSolicitudEmailDocuEnviado = false;
    	values.put("solicitudEmailDocuEnviado", getSolicitudEmailDocuEnviado());
    	modifiedSolicitudDocsEnviados = false;
    	values.put("solicitudDocsEnviados", getSolicitudDocsEnviados());
    	modifiedSolicitudcodDirector = false;
    	values.put("solicitudcodDirector", getSolicitudcodDirector());
    	modifiedSolicitudvalorCuotaBrutaC = false;
    	values.put("solicitudvalorCuotaBrutaC", getSolicitudvalorCuotaBrutaC());
    	modifiedSolicitudCodTarifa = false;
    	values.put("solicitudCodTarifa", getSolicitudCodTarifa());
    	modifiedSolicitudCompletada = false;
    	values.put("solicitudCompletada", getSolicitudCompletada());
    	modifiedSolicitudEstado = false;
    	values.put("solicitudEstado", getSolicitudEstado());
    	modifiedSolicitudFIniVigContInc = false;
    	values.put("solicitudFIniVigContInc", getSolicitudFIniVigContInc());
    	modifiedSolicitudPorcentajeProrrateo = false;
    	values.put("solicitudPorcentajeProrrateo", getSolicitudPorcentajeProrrateo());
    	modifiedSolicitudGrupoDelCORE = false;
    	values.put("solicitudGrupoDelCORE", getSolicitudGrupoDelCORE());
    	modifiedSolicitudTipoFacturaCORE = false;
    	values.put("solicitudTipoFacturaCORE", getSolicitudTipoFacturaCORE());
    	modifiedSolicitudResultSMSInfoPago = false;
    	values.put("solicitudResultSMSInfoPago", getSolicitudResultSMSInfoPago());
    	modifiedSolicitudFechaCompletada = false;
    	values.put("solicitudFechaCompletada", getSolicitudFechaCompletada());
    	modifiedSolicitudFechaUltimoDoc = false;
    	values.put("solicitudFechaUltimoDoc", getSolicitudFechaUltimoDoc());
    	modifiedSolicitudPrioridad = false;
    	values.put("solicitudPrioridad", getSolicitudPrioridad());
    	modifiedSolicitudFechaTerminada = false;
    	values.put("solicitudFechaTerminada", getSolicitudFechaTerminada());
    	modifiedSolicitudFechaFUG = false;
    	values.put("solicitudFechaFUG", getSolicitudFechaFUG());
    	modifiedSolicitudFechaFA = false;
    	values.put("solicitudFechaFA", getSolicitudFechaFA());
    	modifiedSolicitudFechaFAAM = false;
    	values.put("solicitudFechaFAAM", getSolicitudFechaFAAM());
    	modifiedSolicitudSemaforoGrabAse = false;
    	values.put("solicitudSemaforoGrabAse", getSolicitudSemaforoGrabAse());
    	modifiedSolicitudSemaforoAreaMed = false;
    	values.put("solicitudSemaforoAreaMed", getSolicitudSemaforoAreaMed());
    	modifiedSolicitudEstadoDoc = false;
    	values.put("solicitudEstadoDoc", getSolicitudEstadoDoc());
    	modifiedSolicitudEnvioCarnetFisico = false;
    	values.put("solicitudEnvioCarnetFisico", getSolicitudEnvioCarnetFisico());
    	modifiedDireccion = false;
    	modifiedProteccionDatos = false;
    	modifiedUsuarios = false;
    	modifiedContratante = false;
    	modifiedFirma = false;
    	modifiedSegundaFirma = false;
    	modifiedFirmaContratanteIncl = false;
    	modifiedUsuariosRegistrados = false;
    	modifiedTitular = false;
    	modifiedDocumentosGestor = false;
    	modifiedErroresWS = false;
    	modifiedLogEstado = false;
    	modifiedLogAsignaciones = false;
    	modifiedAesolicitudes = false;
    	modifiedContratantePersona = false;
    	modifiedTitularPersona = false;
    	modifiedGrupoAsociado = false;
    	modifiedAgente = false;
    	modifiedFormaPago = false;
    	modifiedPeriodicidad = false;
    	modifiedContratoC = false;
    	modifiedUsrAreaMedica = false;
    	modifiedTipoFactura = false;
    	modifiedUsrAfiliacion = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
            solicituddrvReqCuesMed = null;
            solicituddrvYaTieneContratante = null;
            solicituddrvTitularConBeneficios = null;
            solicituddrvSubtotal = null;
            solicituddrvBaseGrabable = null;
            solicituddrvPorcenIVA = null;
            solicituddrvIVA = null;
            solicituddrvTotal = null;
            solicituddrvCuesMedOK = null;
            solicituddrvYaTieneTitular = null;
            solicituddrvDifValorCuota = null;
            solicituddrvDifValorDtoFinanciero = null;
            solicituddrvDifValorIVA = null;
            solicituddrvHayPreexistencias = null;
            solicituddrvContratoLegalizado = null;
            solicituddrvTieneSegundaFirma = null;
            solicituddrvGrupoAsociado = null;
            solicituddrvAplicaDocContrato = null;
            solicituddrvAplicaDocCartaPree = null;
            solicituddrvAplicaDocBBGestante = null;
            solicituddrvAplicaDocMaternidad = null;
            solicituddrvAplicaCuestionario = null;
            solicituddrvAplicaCartaEnt = null;
            solicituddrvTotalConAnexos = null;
            solicituddrvContratanteEsTitular = null;
            solicituddrvAlgunBeneficiarioEPSSanitas = null;
            solicituddrvListaErrores = null;
            solicituddrvDifValorCuotaBruta = null;
            solicituddrvNumTitulares = null;
            solicituddrvEnviarEmailDoc = null;
            solicituddrvAplicaDocNeonatal = null;
            solicituddrvAplicaCarnets = null;
            solicituddrvAplicaDocSolicitud = null;
            solicituddrvPuedeReplicar = null;
            solicituddrvCambiarBenefCont = null;
            solicituddrvEdadTitular = null;
            solicituddrvGeneroTitular = null;
            solicituddrvTieneTitular = null;
            solicituddrvObservacionesReport = null;
            solicituddrvIgnorarPreexistencias = null;
            solicituddrvTienePrimeraFirma = null;
            solicituddrvNumContrato = null;
            solicituddrvImpTarifaPlanVol = null;
            solicituddrvAplicaDocProtDatos = null;
            solicituddrvPuedeModificarGrupo = null;
            solicituddrvAplicaPolizaInternacional = null;
            solicituddrvPolizaInternacional = null;
            solicituddrvPermiteRechazados = null;
            solicituddrvAlgunUsuarioIMC = null;
            solicituddrvFechaPorcenIVA = null;
            solicituddrvSemaforoGrabAse = null;
            solicituddrvSemaforoAreaMed = null;
            solicitudDrvEstadoHomologado = null;
            solicituddrvValidarDatosContratante = null;
            solicituddrvTramitarEnLinea = null;
    }

    /**
     * Returns the <code>SolicitudOid</code> object that identifies this instance of <code>Solicitud</code>.
     * @return <code>SolicitudOid </code> object that identifies this instance of <code>Solicitud</code>
     */
	@Override
    public SolicitudOid getOid() {
        return new SolicitudOid(getAesolicitudesidsolicitud());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(SolicitudConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }


    @Override
    protected boolean isRelatedItemVerticallyVisible(String item) {
        return getSerCtx().getAgent().isAnyFacetActive(SolicitudConstants.ROLE_AGENTS.get(item.toUpperCase()));
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

        if (!activeFacets.contains(Constants.SOLICITUD)) {
            // Add this class
            activeFacets.add(Constants.SOLICITUD);
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
        if (getAgent().isFacetActive(Constants.AGENT_AREAMEDICA)) {
            AreaMedica agentInstance = (AreaMedica) getAgent().getAgentInstance(Constants.AREAMEDICA);

            // Check the HV formula.
            /* 
            UsrAreaMedica = AGENT
            */
            try {
                if (Utilities.isEqual(this.getUsrAreaMedica(), agentInstance)) {
                    returnValue = true;
                }
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            	returnValue = false;
            }
        }
        if (getAgent().isFacetActive(Constants.AGENT_AFILIACIONES)) {
            returnValue = true;
        }
        if (getAgent().isFacetActive(Constants.FUNCIONARIO) || getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.RESPREGIONAL) || getAgent().isFacetActive(Constants.GESTOR) || getAgent().isFacetActive(Constants.MESADEAPOYO) || getAgent().isFacetActive(Constants.USUARIOSISTEMAEXTERNO)) {
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

    public String buildDSSolicitudPIURadicado() {
        try {
            return getAesolicitudes().getAesolicitudesNumerosolicitud() + " " + getAesolicitudes().getProductoT().getProductosDescripcion() + " " + getAesolicitudes().getPlanT().getPlanesNombre() + " " + (getSolicitudTramite() != null ? getSolicitudTramite().toString() : "") + " " + (getAesolicitudes().getAesolicitudesFechaasignacion() != null ? getAesolicitudes().getAesolicitudesFechaasignacion().toString() : "") + " " + (getSolicitudNumRadicado() != null ? getSolicitudNumRadicado().toString() : "") + " " + getContratantePersona().getPersonadrvNombreCompleto() + " " + getTitularPersona().getPersonadrvNombreCompleto();
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSSolicitudPIUConsultaRad() {
        try {
            return getAesolicitudes().getAesolicitudesNumerosolicitud() + " " + getAesolicitudes().getProductoT().getProductosDescripcion() + " " + getAesolicitudes().getPlanT().getPlanesNombre() + " " + (getSolicitudTramite() != null ? getSolicitudTramite().toString() : "");
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSSolicitudPIUEnvioDoc() {
        try {
            return (getSolicitudTramite() != null ? getSolicitudTramite().toString() : "") + " " + getAesolicitudes().getProductoT().getProductosDescripcion() + " " + getAesolicitudes().getPlanT().getPlanesNombre() + " " + getAesolicitudes().getAesolicitudesNumerosolicitud() + " " + (getSolicitudEstado() != null ? getSolicitudEstado().toString() : "") + " " + getSolicitudNumContrato() + " " + (getSolicitudDocsEnviados() != null ? getSolicitudDocsEnviados().toString() : "") + " " + getAgente().getFuncionarioUsuario() + " " + (getSolicitudTieneDifLiquidacion() != null ? getSolicitudTieneDifLiquidacion().toString() : "") + " " + (getSolicituddrvTieneSegundaFirma() != null ? getSolicituddrvTieneSegundaFirma().toString() : "") + " " + (getSolicitudEstadoDoc() != null ? getSolicitudEstadoDoc().toString() : "");
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSSolicitudIIUNuevaAfil() {
        try {
            return getAesolicitudes().getAesolicitudesNumerosolicitud() + " " + (getAesolicitudes().getAesolicitudesFechaasignacion() != null ? getAesolicitudes().getAesolicitudesFechaasignacion().toString() : "") + " " + (getSolicitudFInicioContrato() != null ? getSolicitudFInicioContrato().toString() : "") + " " + getSolicituddrvGrupoAsociado() + " " + (getSolicitudEsTraslado() != null ? getSolicitudEsTraslado().toString() : "") + " " + (getSolicitudEnvioCarnetFisico() != null ? getSolicitudEnvioCarnetFisico().toString() : "") + " " + (getFirma().getFirmaImagenFirma() != null ? Arrays.toString(getFirma().getFirmaImagenFirma()) : "");
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSSolicitudIIUInfoContratNAT() {
        try {
            return (getContratante().getContratanteDiplomatico() != null ? getContratante().getContratanteDiplomatico().toString() : "") + " " + getContratante().getContratantePrimerNombre() + " " + getContratante().getContratanteSegundoNombre() + " " + getContratante().getContratantePrimerApellido() + " " + getContratante().getContratanteSegundoApellido() + " " + (getContratante().getContratanteFechaNacimiento() != null ? getContratante().getContratanteFechaNacimiento().toString() : "") + " " + getContratante().getContratanteGenero() + " " + (getContratante().getContratanteIndicadorExtranjero() != null ? getContratante().getContratanteIndicadorExtranjero().toString() : "") + " " + getContratante().getDepartamentoNac().getDepartamentoDescripcion() + " " + getContratante().getMunicipioNac().getMunicipioDescripcion() + " " + (getSolicituddrvCambiarBenefCont() != null ? getSolicituddrvCambiarBenefCont().toString() : "");
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSSolicitudIIUInfoContratJUR() {
        try {
            return getContratante().getContratanteRazonSocial();
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSSolicitudIIUInfoObservacion() {
        try {
            return (getSolicitudNumRadicado() != null ? getSolicitudNumRadicado().toString() : "");
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSSolicitudIIUInfoPago() {
        try {
            return (getSolicitudNumRadicado() != null ? getSolicitudNumRadicado().toString() : "");
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildICSolicitud() {
        try {
            return getAesolicitudes().getAesolicitudesNumerosolicitud();
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSSolicitudIIUInclusion() {
        try {
            return getAesolicitudes().getAesolicitudesNumerosolicitud() + " " + (getAesolicitudes().getAesolicitudesFechaasignacion() != null ? getAesolicitudes().getAesolicitudesFechaasignacion().toString() : "") + " " + (getSolicitudFInicioContrato() != null ? getSolicitudFInicioContrato().toString() : "") + " " + (getSolicitudtipoContrato() != null ? getSolicitudtipoContrato().toString() : "") + " " + getSolicituddrvGrupoAsociado() + " " + getSolicitudNumContratoInclusion() + " " + getSolicitudNumFamilia() + " " + (getSolicitudEnvioCarnetFisico() != null ? getSolicitudEnvioCarnetFisico().toString() : "") + " " + (getFirma().getFirmaImagenFirma() != null ? Arrays.toString(getFirma().getFirmaImagenFirma()) : "");
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSSolicitudVacia() {
        try {
            return getSolicitudNumFamilia();
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSSolicitudIIUDifLiq() {
        try {
            return (getSolicitudNumRadicado() != null ? getSolicitudNumRadicado().toString() : "") + " " + (getSolicitudvalorCuota() != null ? getSolicitudvalorCuota().toString() : "") + " " + (getSolicitudvalorCuotaBrutaC() != null ? getSolicitudvalorCuotaBrutaC().toString() : "") + " " + (getSolicituddrvDifValorCuotaBruta() != null ? getSolicituddrvDifValorCuotaBruta().toString() : "");
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSSolicitudIIUPreexistencias() {
        try {
            return getAesolicitudes().getAesolicitudesNumerosolicitud() + " " + getSolicitudNumContrato();
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSSolicitudPIUStatusFull() {
        try {
            return getAesolicitudes().getProductoT().getProductosDescripcion() + " " + getAesolicitudes().getPlanT().getPlanesNombre() + " " + (getSolicitudEstadoDoc() != null ? getSolicitudEstadoDoc().toString() : "") + " " + (getSolicitudEstado() != null ? getSolicitudEstado().toString() : "") + " " + (getSolicitudFechaCompletada() != null ? getSolicitudFechaCompletada().toString() : "") + " " + (getSolicitudFechaUltimoDoc() != null ? getSolicitudFechaUltimoDoc().toString() : "") + " " + (getSolicitudFInicioContrato() != null ? getSolicitudFInicioContrato().toString() : "") + " " + getAesolicitudes().getAesolicitudesNumerosolicitud() + " " + (getSolicitudTramite() != null ? getSolicitudTramite().toString() : "") + " " + getSolicituddrvNumContrato() + " " + getAgente().getFuncionariodrvNombreCompleto() + " " + (getSolicitudPrioridad() != null ? getSolicitudPrioridad().toString() : "") + " " + getUsrAfiliacion().getFuncionariodrvNombreCompleto() + " " + getUsrAreaMedica().getFuncionariodrvNombreCompleto() + " " + (getSolicitudFechaFA() != null ? getSolicitudFechaFA().toString() : "") + " " + (getSolicitudFechaFAAM() != null ? getSolicitudFechaFAAM().toString() : "") + " " + (getSolicitudFechaTerminada() != null ? getSolicitudFechaTerminada().toString() : "") + " " + (getSolicitudFechaFUG() != null ? getSolicitudFechaFUG().toString() : "") + " " + (getAesolicitudes().getAesolicitudesFechaasignacion() != null ? getAesolicitudes().getAesolicitudesFechaasignacion().toString() : "") + " " + (getSolicituddrvTienePrimeraFirma() != null ? getSolicituddrvTienePrimeraFirma().toString() : "") + " " + getAgente().getSucursal().getSucursalDescripcion() + " " + getAgente().getSucursal().getRegional().getRegionalDescripcion() + " " + getAgente().getFuncionariodrvNomJefe() + " " + getAgente().getFuncionariodrvNomAgencia() + " " + (getSolicituddrvAlgunBeneficiarioEPSSanitas() != null ? getSolicituddrvAlgunBeneficiarioEPSSanitas().toString() : "") + " " + (getSolicituddrvPolizaInternacional() != null ? getSolicituddrvPolizaInternacional().toString() : "") + " " + getSolicituddrvListaErrores() + " " + getSolicitudobservacions() + " " + (getSolicituddrvSemaforoGrabAse() != null ? getSolicituddrvSemaforoGrabAse().toString() : "") + " " + (getSolicituddrvSemaforoAreaMed() != null ? getSolicituddrvSemaforoAreaMed().toString() : "") + " " + (getSolicitudEnvioCarnetFisico() != null ? getSolicitudEnvioCarnetFisico().toString() : "");
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSIIUInfoTitularIncFam() {
        try {
            return (getTitular().getTitularTitularConBeneficios() != null ? getTitular().getTitularTitularConBeneficios().toString() : "") + " " + getTitular().getTitularPrimerNombre() + " " + getTitular().getTitularSegundoNombre() + " " + getTitular().getTitularPrimerApellido() + " " + getTitular().getTitularSegundoApellido() + " " + (getTitular().getTitularFechaNacimiento() != null ? getTitular().getTitularFechaNacimiento().toString() : "") + " " + getTitular().getTitularGenero() + " " + (getTitular().getTitularIndicadorExtranjero() != null ? getTitular().getTitularIndicadorExtranjero().toString() : "") + " " + getTitular().getDireccion().getDireccionDireccionCompleta() + " " + getTitular().getDireccion().getDepartamento().getDepartamentoDescripcion() + " " + getTitular().getDireccion().getMunicipio().getMunicipioDescripcion() + " " + getTitular().getTitularTelefonoFijo() + " " + getTitular().getTitularTelefonoCelular() + " " + getTitular().getTitularCorreoElectronico();
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSSolicitudPIUStatusFullAse() {
        try {
            return getAesolicitudes().getProductoT().getProductosDescripcion() + " " + getAesolicitudes().getPlanT().getPlanesNombre() + " " + (getSolicitudEstadoDoc() != null ? getSolicitudEstadoDoc().toString() : "") + " " + (getSolicitudEstado() != null ? getSolicitudEstado().toString() : "") + " " + (getSolicitudFechaCompletada() != null ? getSolicitudFechaCompletada().toString() : "") + " " + (getSolicitudFechaUltimoDoc() != null ? getSolicitudFechaUltimoDoc().toString() : "") + " " + (getSolicitudFInicioContrato() != null ? getSolicitudFInicioContrato().toString() : "") + " " + getAesolicitudes().getAesolicitudesNumerosolicitud() + " " + (getSolicitudTramite() != null ? getSolicitudTramite().toString() : "") + " " + getSolicituddrvNumContrato() + " " + getAgente().getFuncionariodrvNombreCompleto() + " " + (getSolicitudPrioridad() != null ? getSolicitudPrioridad().toString() : "") + " " + (getAesolicitudes().getAesolicitudesFechaasignacion() != null ? getAesolicitudes().getAesolicitudesFechaasignacion().toString() : "") + " " + (getSolicituddrvTienePrimeraFirma() != null ? getSolicituddrvTienePrimeraFirma().toString() : "") + " " + getAgente().getSucursal().getSucursalDescripcion() + " " + getAgente().getSucursal().getRegional().getRegionalDescripcion() + " " + getAgente().getFuncionariodrvNomJefe() + " " + getAgente().getFuncionariodrvNomAgencia() + " " + (getSolicituddrvAlgunBeneficiarioEPSSanitas() != null ? getSolicituddrvAlgunBeneficiarioEPSSanitas().toString() : "") + " " + (getSolicituddrvPolizaInternacional() != null ? getSolicituddrvPolizaInternacional().toString() : "") + " " + getSolicituddrvListaErrores() + " " + getSolicitudobservacions() + " " + (getSolicitudEnvioCarnetFisico() != null ? getSolicitudEnvioCarnetFisico().toString() : "");
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSSolicitudPIUStatusAdmin() {
        try {
            return getAesolicitudes().getProductoT().getProductosDescripcion() + " " + getAesolicitudes().getPlanT().getPlanesNombre() + " " + (getSolicitudEstadoDoc() != null ? getSolicitudEstadoDoc().toString() : "") + " " + (getSolicitudEstado() != null ? getSolicitudEstado().toString() : "") + " " + (getSolicitudFechaCompletada() != null ? getSolicitudFechaCompletada().toString() : "") + " " + (getSolicitudFechaUltimoDoc() != null ? getSolicitudFechaUltimoDoc().toString() : "") + " " + (getSolicitudFInicioContrato() != null ? getSolicitudFInicioContrato().toString() : "") + " " + getAesolicitudes().getAesolicitudesNumerosolicitud() + " " + (getSolicitudTramite() != null ? getSolicitudTramite().toString() : "") + " " + getSolicituddrvNumContrato() + " " + getAgente().getFuncionariodrvNombreCompleto() + " " + (getSolicitudPrioridad() != null ? getSolicitudPrioridad().toString() : "") + " " + (getSolicituddrvSemaforoGrabAse() != null ? getSolicituddrvSemaforoGrabAse().toString() : "") + " " + getUsrAfiliacion().getFuncionariodrvNombreCompleto() + " " + (getSolicituddrvSemaforoAreaMed() != null ? getSolicituddrvSemaforoAreaMed().toString() : "") + " " + getUsrAreaMedica().getFuncionariodrvNombreCompleto();
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSSolicitudPIUStatusAfil() {
        try {
            return getAesolicitudes().getProductoT().getProductosDescripcion() + " " + getAesolicitudes().getPlanT().getPlanesNombre() + " " + (getSolicitudEstadoDoc() != null ? getSolicitudEstadoDoc().toString() : "") + " " + (getSolicitudDrvEstadoHomologado() != null ? getSolicitudDrvEstadoHomologado().toString() : "") + " " + (getSolicitudFechaCompletada() != null ? getSolicitudFechaCompletada().toString() : "") + " " + (getSolicitudFechaUltimoDoc() != null ? getSolicitudFechaUltimoDoc().toString() : "") + " " + (getSolicitudFInicioContrato() != null ? getSolicitudFInicioContrato().toString() : "") + " " + getAesolicitudes().getAesolicitudesNumerosolicitud() + " " + (getSolicitudTramite() != null ? getSolicitudTramite().toString() : "") + " " + getSolicituddrvNumContrato() + " " + (getSolicitudPrioridad() != null ? getSolicitudPrioridad().toString() : "") + " " + (getSolicituddrvSemaforoGrabAse() != null ? getSolicituddrvSemaforoGrabAse().toString() : "") + " " + getAgente().getFuncionariodrvNombreCompleto();
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSSolicitudPIUStatusAreaMe() {
        try {
            return getAesolicitudes().getProductoT().getProductosDescripcion() + " " + getAesolicitudes().getPlanT().getPlanesNombre() + " " + (getSolicitudEstadoDoc() != null ? getSolicitudEstadoDoc().toString() : "") + " " + (getSolicitudDrvEstadoHomologado() != null ? getSolicitudDrvEstadoHomologado().toString() : "") + " " + (getSolicitudFechaCompletada() != null ? getSolicitudFechaCompletada().toString() : "") + " " + (getSolicitudFechaUltimoDoc() != null ? getSolicitudFechaUltimoDoc().toString() : "") + " " + (getSolicitudFInicioContrato() != null ? getSolicitudFInicioContrato().toString() : "") + " " + getAesolicitudes().getAesolicitudesNumerosolicitud() + " " + (getSolicitudTramite() != null ? getSolicitudTramite().toString() : "") + " " + getSolicituddrvNumContrato() + " " + (getSolicitudPrioridad() != null ? getSolicitudPrioridad().toString() : "") + " " + (getSolicituddrvSemaforoAreaMed() != null ? getSolicituddrvSemaforoAreaMed().toString() : "") + " " + getAgente().getFuncionariodrvNombreCompleto();
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSSolicitudPIUStatusAsesor() {
        try {
            return getAesolicitudes().getProductoT().getProductosDescripcion() + " " + getAesolicitudes().getPlanT().getPlanesNombre() + " " + (getSolicitudEstadoDoc() != null ? getSolicitudEstadoDoc().toString() : "") + " " + (getSolicitudDrvEstadoHomologado() != null ? getSolicitudDrvEstadoHomologado().toString() : "") + " " + (getSolicitudFechaCompletada() != null ? getSolicitudFechaCompletada().toString() : "") + " " + (getSolicitudFechaUltimoDoc() != null ? getSolicitudFechaUltimoDoc().toString() : "") + " " + (getSolicitudFInicioContrato() != null ? getSolicitudFInicioContrato().toString() : "") + " " + getAesolicitudes().getAesolicitudesNumerosolicitud() + " " + (getSolicitudTramite() != null ? getSolicitudTramite().toString() : "") + " " + getSolicituddrvNumContrato() + " " + (getSolicitudPrioridad() != null ? getSolicitudPrioridad().toString() : "") + " " + getAgente().getFuncionariodrvNombreCompleto();
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSSolPIUStatusGestorMesa() {
        try {
            return getAesolicitudes().getProductoT().getProductosDescripcion() + " " + getAesolicitudes().getPlanT().getPlanesNombre() + " " + (getSolicitudEstadoDoc() != null ? getSolicitudEstadoDoc().toString() : "") + " " + (getSolicitudDrvEstadoHomologado() != null ? getSolicitudDrvEstadoHomologado().toString() : "") + " " + (getSolicitudFechaCompletada() != null ? getSolicitudFechaCompletada().toString() : "") + " " + (getSolicitudFechaUltimoDoc() != null ? getSolicitudFechaUltimoDoc().toString() : "") + " " + (getSolicitudFInicioContrato() != null ? getSolicitudFInicioContrato().toString() : "") + " " + getAesolicitudes().getAesolicitudesNumerosolicitud() + " " + (getSolicitudTramite() != null ? getSolicitudTramite().toString() : "") + " " + getSolicituddrvNumContrato() + " " + getAgente().getFuncionariodrvNombreCompleto() + " " + (getSolicitudPrioridad() != null ? getSolicitudPrioridad().toString() : "") + " " + (getSolicituddrvSemaforoGrabAse() != null ? getSolicituddrvSemaforoGrabAse().toString() : "") + " " + getUsrAfiliacion().getFuncionariodrvNombreCompleto() + " " + (getSolicituddrvSemaforoAreaMed() != null ? getSolicituddrvSemaforoAreaMed().toString() : "") + " " + getUsrAreaMedica().getFuncionariodrvNombreCompleto();
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSSolicitudPIUStatusGestMesa() {
        try {
            return getAesolicitudes().getProductoT().getProductosDescripcion() + " " + getAesolicitudes().getPlanT().getPlanesNombre() + " " + (getSolicitudEstadoDoc() != null ? getSolicitudEstadoDoc().toString() : "") + " " + (getSolicitudDrvEstadoHomologado() != null ? getSolicitudDrvEstadoHomologado().toString() : "") + " " + (getSolicitudFechaCompletada() != null ? getSolicitudFechaCompletada().toString() : "") + " " + (getSolicitudFechaUltimoDoc() != null ? getSolicitudFechaUltimoDoc().toString() : "") + " " + (getSolicitudFInicioContrato() != null ? getSolicitudFInicioContrato().toString() : "") + " " + getAesolicitudes().getAesolicitudesNumerosolicitud() + " " + (getSolicitudTramite() != null ? getSolicitudTramite().toString() : "") + " " + getSolicituddrvNumContrato() + " " + getAgente().getFuncionariodrvNombreCompleto() + " " + (getSolicitudPrioridad() != null ? getSolicitudPrioridad().toString() : "") + " " + (getSolicituddrvSemaforoGrabAse() != null ? getSolicituddrvSemaforoGrabAse().toString() : "") + " " + getUsrAfiliacion().getFuncionariodrvNombreCompleto() + " " + (getSolicituddrvSemaforoAreaMed() != null ? getSolicituddrvSemaforoAreaMed().toString() : "") + " " + getUsrAreaMedica().getFuncionariodrvNombreCompleto();
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSSolicitudInfoContratanteID() {
        try {
            return getContratante().getContratantedrvIdentificacion() + " " + (getContratante().getTipoIdentificacion().getTipoIdentificacionNIT() != null ? getContratante().getTipoIdentificacion().getTipoIdentificacionNIT().toString() : "");
        } catch(Exception e) {
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            return "";
        }
    }

    public String buildDSSolicitudIIUInfoContraConta() {
        try {
            return getDireccion().getDireccionDireccionCompleta() + " " + getDireccion().getDepartamento().getDepartamentoDescripcion() + " " + getDireccion().getMunicipio().getMunicipioDescripcion() + " " + getContratante().getContratanteTelefonoFijo() + " " + getContratante().getContratanteTelefonoCelular() + " " + getContratante().getContratanteCorreoElectronico();
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
            relatedInstance = buildSolicitudRelatedInstance(relatedInstanceJsonOid);
        }
        if (SolicitudConstants.ROLE_NAME_DIRECCION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4Direccion(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_PROTECCIONDATOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4ProteccionDatos(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_USUARIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4Usuario(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_CONTRATANTE.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4Contratante(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_FIRMA.equalsIgnoreCase(relatedInstancePathFirstItem) || SolicitudConstants.ROLE_NAME_SEGUNDAFIRMA.equalsIgnoreCase(relatedInstancePathFirstItem) || SolicitudConstants.ROLE_NAME_FIRMACONTRATANTEINCL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4Firma(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4UsuarioReg(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_TITULAR.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4Titular(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_DOCUMENTOSGESTOR.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4DocumentoG(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_ERRORESWS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4ErrorWS(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_LOGESTADO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4LogEstado(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_LOGASIGNACIONES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4LogAsignaciones(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_AESOLICITUDES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4Aesolicitudes(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_CONTRATANTEPERSONA.equalsIgnoreCase(relatedInstancePathFirstItem) || SolicitudConstants.ROLE_NAME_TITULARPERSONA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4Persona(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_GRUPOASOCIADO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4GrupoAsociado(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_AGENTE.equalsIgnoreCase(relatedInstancePathFirstItem) || SolicitudConstants.ROLE_NAME_USRAFILIACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4Funcionario(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_FORMAPAGO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4FormaPago(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_PERIODICIDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4Periodicidad(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_CONTRATOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_USRAREAMEDICA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4AreaMedica(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_TIPOFACTURA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4TipoFactura(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildSolicitudRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4Direccion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Direccion(mapper.readValue(relatedInstanceJsonOid, DireccionOid.class)): Direccion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4ProteccionDatos(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ProteccionDatos(mapper.readValue(relatedInstanceJsonOid, ProteccionDatosOid.class)): ProteccionDatos.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4Usuario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Usuario(mapper.readValue(relatedInstanceJsonOid, UsuarioOid.class)): Usuario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4Contratante(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Contratante(mapper.readValue(relatedInstanceJsonOid, ContratanteOid.class)): Contratante.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4Firma(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Firma(mapper.readValue(relatedInstanceJsonOid, FirmaOid.class)): Firma.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4UsuarioReg(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new UsuarioReg(mapper.readValue(relatedInstanceJsonOid, UsuarioRegOid.class)): UsuarioReg.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4Titular(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Titular(mapper.readValue(relatedInstanceJsonOid, TitularOid.class)): Titular.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4DocumentoG(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DocumentoG(mapper.readValue(relatedInstanceJsonOid, DocumentoGOid.class)): DocumentoG.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4ErrorWS(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ErrorWS(mapper.readValue(relatedInstanceJsonOid, ErrorWSOid.class)): ErrorWS.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4LogEstado(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new LogEstado(mapper.readValue(relatedInstanceJsonOid, LogEstadoOid.class)): LogEstado.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4LogAsignaciones(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new LogAsignaciones(mapper.readValue(relatedInstanceJsonOid, LogAsignacionesOid.class)): LogAsignaciones.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4Aesolicitudes(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Aesolicitudes(mapper.readValue(relatedInstanceJsonOid, AesolicitudesOid.class)): Aesolicitudes.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4Persona(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Persona(mapper.readValue(relatedInstanceJsonOid, PersonaOid.class)): Persona.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4GrupoAsociado(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new GrupoAsociado(mapper.readValue(relatedInstanceJsonOid, GrupoAsociadoOid.class)): GrupoAsociado.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4Funcionario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Funcionario(mapper.readValue(relatedInstanceJsonOid, FuncionarioOid.class)): Funcionario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4FormaPago(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new FormaPago(mapper.readValue(relatedInstanceJsonOid, FormaPagoOid.class)): FormaPago.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4Periodicidad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Periodicidad(mapper.readValue(relatedInstanceJsonOid, PeriodicidadOid.class)): Periodicidad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4AreaMedica(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new AreaMedica(mapper.readValue(relatedInstanceJsonOid, AreaMedicaOid.class)): AreaMedica.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4TipoFactura(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoFactura(mapper.readValue(relatedInstanceJsonOid, TipoFacturaOid.class)): TipoFactura.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }
}
