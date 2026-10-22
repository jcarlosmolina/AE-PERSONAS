package com.keralty.aepersonas.viewmodel.solicitud.ds;

import java.sql.Date;
import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Solicitud;
public class DSSolicitudPIUStatusFull {

    @JsonProperty("aesolicitudes_productot_descripcion")
    private String dSSolicitudPIUStatusFullAesolicitudesDotProductoTDotDescripcion;

    @JsonProperty("aesolicitudes_plant_nombre")
    private String dSSolicitudPIUStatusFullAesolicitudesDotPlanTDotNombre;

    @JsonProperty("estadodoc")
    private Long dSSolicitudPIUStatusFullEstadoDoc;

    @JsonProperty("estado")
    private Long dSSolicitudPIUStatusFullEstado;

    @JsonProperty("fechacompletada")
    private Timestamp dSSolicitudPIUStatusFullFechaCompletada;

    @JsonProperty("fechaultimodoc")
    private Timestamp dSSolicitudPIUStatusFullFechaUltimoDoc;

    @JsonProperty("finiciocontrato")
    private Date dSSolicitudPIUStatusFullFInicioContrato;

    @JsonProperty("aesolicitudes_numerosolicitud")
    private String dSSolicitudPIUStatusFullAesolicitudesDotNumerosolicitud;

    @JsonProperty("tramite")
    private Long dSSolicitudPIUStatusFullTramite;

    @JsonProperty("drvnumcontrato")
    private String dSSolicitudPIUStatusFullDrvNumContrato;

    @JsonProperty("agente_drvnombrecompleto")
    private String dSSolicitudPIUStatusFullAgenteDotDrvNombreCompleto;

    @JsonProperty("prioridad")
    private Long dSSolicitudPIUStatusFullPrioridad;

    @JsonProperty("usrafiliacion_drvnombrecompleto")
    private String dSSolicitudPIUStatusFullUsrAfiliacionDotDrvNombreCompleto;

    @JsonProperty("usrareamedica_drvnombrecompleto")
    private String dSSolicitudPIUStatusFullUsrAreaMedicaDotDrvNombreCompleto;

    @JsonProperty("fechafa")
    private Timestamp dSSolicitudPIUStatusFullFechaFA;

    @JsonProperty("fechafaam")
    private Timestamp dSSolicitudPIUStatusFullFechaFAAM;

    @JsonProperty("fechaterminada")
    private Date dSSolicitudPIUStatusFullFechaTerminada;

    @JsonProperty("fechafug")
    private Timestamp dSSolicitudPIUStatusFullFechaFUG;

    @JsonProperty("aesolicitudes_fechaasignacion")
    private Date dSSolicitudPIUStatusFullAesolicitudesDotFechaasignacion;

    @JsonProperty("drvtieneprimerafirma")
    private Boolean dSSolicitudPIUStatusFullDrvTienePrimeraFirma;

    @JsonProperty("agente_sucursal_descripcion")
    private String dSSolicitudPIUStatusFullAgenteDotSucursalDotDescripcion;

    @JsonProperty("agente_sucursal_regional_descripcion")
    private String dSSolicitudPIUStatusFullAgenteDotSucursalDotRegionalDotDescripcion;

    @JsonProperty("agente_drvnomjefe")
    private String dSSolicitudPIUStatusFullAgenteDotDrvNomJefe;

    @JsonProperty("agente_drvnomagencia")
    private String dSSolicitudPIUStatusFullAgenteDotDrvNomAgencia;

    @JsonProperty("drvalgunbeneficiarioepssanitas")
    private Boolean dSSolicitudPIUStatusFullDrvAlgunBeneficiarioEPSSanitas;

    @JsonProperty("drvpolizainternacional")
    private Boolean dSSolicitudPIUStatusFullDrvPolizaInternacional;

    @JsonProperty("drvlistaerrores")
    private String dSSolicitudPIUStatusFullDrvListaErrores;

    @JsonProperty("observacions")
    private String dSSolicitudPIUStatusFullObservacions;

    @JsonProperty("drvsemaforograbase")
    private Double dSSolicitudPIUStatusFullDrvSemaforoGrabAse;

    @JsonProperty("drvsemaforoareamed")
    private Double dSSolicitudPIUStatusFullDrvSemaforoAreaMed;

    @JsonProperty("enviocarnetfisico")
    private Boolean dSSolicitudPIUStatusFullEnvioCarnetFisico;

    public DSSolicitudPIUStatusFull() {
    
    }

    public DSSolicitudPIUStatusFull(Solicitud instance) {
        if (instance != null) {
            try {
                this.dSSolicitudPIUStatusFullAesolicitudesDotProductoTDotDescripcion = instance.getAesolicitudes().getProductoT().getProductosDescripcion();
                this.dSSolicitudPIUStatusFullAesolicitudesDotPlanTDotNombre = instance.getAesolicitudes().getPlanT().getPlanesNombre();
                this.dSSolicitudPIUStatusFullEstadoDoc = instance.getSolicitudEstadoDoc();
                this.dSSolicitudPIUStatusFullEstado = instance.getSolicitudEstado();
                this.dSSolicitudPIUStatusFullFechaCompletada = instance.getSolicitudFechaCompletada();
                this.dSSolicitudPIUStatusFullFechaUltimoDoc = instance.getSolicitudFechaUltimoDoc();
                this.dSSolicitudPIUStatusFullFInicioContrato = instance.getSolicitudFInicioContrato();
                this.dSSolicitudPIUStatusFullAesolicitudesDotNumerosolicitud = instance.getAesolicitudes().getAesolicitudesNumerosolicitud();
                this.dSSolicitudPIUStatusFullTramite = instance.getSolicitudTramite();
                this.dSSolicitudPIUStatusFullDrvNumContrato = instance.getSolicituddrvNumContrato();
                this.dSSolicitudPIUStatusFullAgenteDotDrvNombreCompleto = instance.getAgente().getFuncionariodrvNombreCompleto();
                this.dSSolicitudPIUStatusFullPrioridad = instance.getSolicitudPrioridad();
                this.dSSolicitudPIUStatusFullUsrAfiliacionDotDrvNombreCompleto = instance.getUsrAfiliacion().getFuncionariodrvNombreCompleto();
                this.dSSolicitudPIUStatusFullUsrAreaMedicaDotDrvNombreCompleto = instance.getUsrAreaMedica().getFuncionariodrvNombreCompleto();
                this.dSSolicitudPIUStatusFullFechaFA = instance.getSolicitudFechaFA();
                this.dSSolicitudPIUStatusFullFechaFAAM = instance.getSolicitudFechaFAAM();
                this.dSSolicitudPIUStatusFullFechaTerminada = instance.getSolicitudFechaTerminada();
                this.dSSolicitudPIUStatusFullFechaFUG = instance.getSolicitudFechaFUG();
                this.dSSolicitudPIUStatusFullAesolicitudesDotFechaasignacion = instance.getAesolicitudes().getAesolicitudesFechaasignacion();
                this.dSSolicitudPIUStatusFullDrvTienePrimeraFirma = instance.getSolicituddrvTienePrimeraFirma();
                this.dSSolicitudPIUStatusFullAgenteDotSucursalDotDescripcion = instance.getAgente().getSucursal().getSucursalDescripcion();
                this.dSSolicitudPIUStatusFullAgenteDotSucursalDotRegionalDotDescripcion = instance.getAgente().getSucursal().getRegional().getRegionalDescripcion();
                this.dSSolicitudPIUStatusFullAgenteDotDrvNomJefe = instance.getAgente().getFuncionariodrvNomJefe();
                this.dSSolicitudPIUStatusFullAgenteDotDrvNomAgencia = instance.getAgente().getFuncionariodrvNomAgencia();
                this.dSSolicitudPIUStatusFullDrvAlgunBeneficiarioEPSSanitas = instance.getSolicituddrvAlgunBeneficiarioEPSSanitas();
                this.dSSolicitudPIUStatusFullDrvPolizaInternacional = instance.getSolicituddrvPolizaInternacional();
                this.dSSolicitudPIUStatusFullDrvListaErrores = instance.getSolicituddrvListaErrores();
                this.dSSolicitudPIUStatusFullObservacions = instance.getSolicitudobservacions();
                this.dSSolicitudPIUStatusFullDrvSemaforoGrabAse = instance.getSolicituddrvSemaforoGrabAse();
                this.dSSolicitudPIUStatusFullDrvSemaforoAreaMed = instance.getSolicituddrvSemaforoAreaMed();
                this.dSSolicitudPIUStatusFullEnvioCarnetFisico = instance.getSolicitudEnvioCarnetFisico();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusFullAesolicitudesDotProductoTDotDescripcion() {
        return this.dSSolicitudPIUStatusFullAesolicitudesDotProductoTDotDescripcion;
    }
    
    public void setDSSolicitudPIUStatusFullAesolicitudesDotProductoTDotDescripcion(String dSSolicitudPIUStatusFullAesolicitudesDotProductoTDotDescripcion) {
        this.dSSolicitudPIUStatusFullAesolicitudesDotProductoTDotDescripcion = dSSolicitudPIUStatusFullAesolicitudesDotProductoTDotDescripcion;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusFullAesolicitudesDotPlanTDotNombre() {
        return this.dSSolicitudPIUStatusFullAesolicitudesDotPlanTDotNombre;
    }
    
    public void setDSSolicitudPIUStatusFullAesolicitudesDotPlanTDotNombre(String dSSolicitudPIUStatusFullAesolicitudesDotPlanTDotNombre) {
        this.dSSolicitudPIUStatusFullAesolicitudesDotPlanTDotNombre = dSSolicitudPIUStatusFullAesolicitudesDotPlanTDotNombre;
    }

    @JsonIgnore
    public Long getDSSolicitudPIUStatusFullEstadoDoc() {
        return this.dSSolicitudPIUStatusFullEstadoDoc;
    }
    
    public void setDSSolicitudPIUStatusFullEstadoDoc(Long dSSolicitudPIUStatusFullEstadoDoc) {
        this.dSSolicitudPIUStatusFullEstadoDoc = dSSolicitudPIUStatusFullEstadoDoc;
    }

    @JsonIgnore
    public Long getDSSolicitudPIUStatusFullEstado() {
        return this.dSSolicitudPIUStatusFullEstado;
    }
    
    public void setDSSolicitudPIUStatusFullEstado(Long dSSolicitudPIUStatusFullEstado) {
        this.dSSolicitudPIUStatusFullEstado = dSSolicitudPIUStatusFullEstado;
    }

    @JsonIgnore
    public Timestamp getDSSolicitudPIUStatusFullFechaCompletada() {
        return this.dSSolicitudPIUStatusFullFechaCompletada;
    }
    
    public void setDSSolicitudPIUStatusFullFechaCompletada(Timestamp dSSolicitudPIUStatusFullFechaCompletada) {
        this.dSSolicitudPIUStatusFullFechaCompletada = dSSolicitudPIUStatusFullFechaCompletada;
    }

    @JsonIgnore
    public Timestamp getDSSolicitudPIUStatusFullFechaUltimoDoc() {
        return this.dSSolicitudPIUStatusFullFechaUltimoDoc;
    }
    
    public void setDSSolicitudPIUStatusFullFechaUltimoDoc(Timestamp dSSolicitudPIUStatusFullFechaUltimoDoc) {
        this.dSSolicitudPIUStatusFullFechaUltimoDoc = dSSolicitudPIUStatusFullFechaUltimoDoc;
    }

    @JsonIgnore
    public Date getDSSolicitudPIUStatusFullFInicioContrato() {
        return this.dSSolicitudPIUStatusFullFInicioContrato;
    }
    
    public void setDSSolicitudPIUStatusFullFInicioContrato(Date dSSolicitudPIUStatusFullFInicioContrato) {
        this.dSSolicitudPIUStatusFullFInicioContrato = dSSolicitudPIUStatusFullFInicioContrato;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusFullAesolicitudesDotNumerosolicitud() {
        return this.dSSolicitudPIUStatusFullAesolicitudesDotNumerosolicitud;
    }
    
    public void setDSSolicitudPIUStatusFullAesolicitudesDotNumerosolicitud(String dSSolicitudPIUStatusFullAesolicitudesDotNumerosolicitud) {
        this.dSSolicitudPIUStatusFullAesolicitudesDotNumerosolicitud = dSSolicitudPIUStatusFullAesolicitudesDotNumerosolicitud;
    }

    @JsonIgnore
    public Long getDSSolicitudPIUStatusFullTramite() {
        return this.dSSolicitudPIUStatusFullTramite;
    }
    
    public void setDSSolicitudPIUStatusFullTramite(Long dSSolicitudPIUStatusFullTramite) {
        this.dSSolicitudPIUStatusFullTramite = dSSolicitudPIUStatusFullTramite;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusFullDrvNumContrato() {
        return this.dSSolicitudPIUStatusFullDrvNumContrato;
    }
    
    public void setDSSolicitudPIUStatusFullDrvNumContrato(String dSSolicitudPIUStatusFullDrvNumContrato) {
        this.dSSolicitudPIUStatusFullDrvNumContrato = dSSolicitudPIUStatusFullDrvNumContrato;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusFullAgenteDotDrvNombreCompleto() {
        return this.dSSolicitudPIUStatusFullAgenteDotDrvNombreCompleto;
    }
    
    public void setDSSolicitudPIUStatusFullAgenteDotDrvNombreCompleto(String dSSolicitudPIUStatusFullAgenteDotDrvNombreCompleto) {
        this.dSSolicitudPIUStatusFullAgenteDotDrvNombreCompleto = dSSolicitudPIUStatusFullAgenteDotDrvNombreCompleto;
    }

    @JsonIgnore
    public Long getDSSolicitudPIUStatusFullPrioridad() {
        return this.dSSolicitudPIUStatusFullPrioridad;
    }
    
    public void setDSSolicitudPIUStatusFullPrioridad(Long dSSolicitudPIUStatusFullPrioridad) {
        this.dSSolicitudPIUStatusFullPrioridad = dSSolicitudPIUStatusFullPrioridad;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusFullUsrAfiliacionDotDrvNombreCompleto() {
        return this.dSSolicitudPIUStatusFullUsrAfiliacionDotDrvNombreCompleto;
    }
    
    public void setDSSolicitudPIUStatusFullUsrAfiliacionDotDrvNombreCompleto(String dSSolicitudPIUStatusFullUsrAfiliacionDotDrvNombreCompleto) {
        this.dSSolicitudPIUStatusFullUsrAfiliacionDotDrvNombreCompleto = dSSolicitudPIUStatusFullUsrAfiliacionDotDrvNombreCompleto;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusFullUsrAreaMedicaDotDrvNombreCompleto() {
        return this.dSSolicitudPIUStatusFullUsrAreaMedicaDotDrvNombreCompleto;
    }
    
    public void setDSSolicitudPIUStatusFullUsrAreaMedicaDotDrvNombreCompleto(String dSSolicitudPIUStatusFullUsrAreaMedicaDotDrvNombreCompleto) {
        this.dSSolicitudPIUStatusFullUsrAreaMedicaDotDrvNombreCompleto = dSSolicitudPIUStatusFullUsrAreaMedicaDotDrvNombreCompleto;
    }

    @JsonIgnore
    public Timestamp getDSSolicitudPIUStatusFullFechaFA() {
        return this.dSSolicitudPIUStatusFullFechaFA;
    }
    
    public void setDSSolicitudPIUStatusFullFechaFA(Timestamp dSSolicitudPIUStatusFullFechaFA) {
        this.dSSolicitudPIUStatusFullFechaFA = dSSolicitudPIUStatusFullFechaFA;
    }

    @JsonIgnore
    public Timestamp getDSSolicitudPIUStatusFullFechaFAAM() {
        return this.dSSolicitudPIUStatusFullFechaFAAM;
    }
    
    public void setDSSolicitudPIUStatusFullFechaFAAM(Timestamp dSSolicitudPIUStatusFullFechaFAAM) {
        this.dSSolicitudPIUStatusFullFechaFAAM = dSSolicitudPIUStatusFullFechaFAAM;
    }

    @JsonIgnore
    public Date getDSSolicitudPIUStatusFullFechaTerminada() {
        return this.dSSolicitudPIUStatusFullFechaTerminada;
    }
    
    public void setDSSolicitudPIUStatusFullFechaTerminada(Date dSSolicitudPIUStatusFullFechaTerminada) {
        this.dSSolicitudPIUStatusFullFechaTerminada = dSSolicitudPIUStatusFullFechaTerminada;
    }

    @JsonIgnore
    public Timestamp getDSSolicitudPIUStatusFullFechaFUG() {
        return this.dSSolicitudPIUStatusFullFechaFUG;
    }
    
    public void setDSSolicitudPIUStatusFullFechaFUG(Timestamp dSSolicitudPIUStatusFullFechaFUG) {
        this.dSSolicitudPIUStatusFullFechaFUG = dSSolicitudPIUStatusFullFechaFUG;
    }

    @JsonIgnore
    public Date getDSSolicitudPIUStatusFullAesolicitudesDotFechaasignacion() {
        return this.dSSolicitudPIUStatusFullAesolicitudesDotFechaasignacion;
    }
    
    public void setDSSolicitudPIUStatusFullAesolicitudesDotFechaasignacion(Date dSSolicitudPIUStatusFullAesolicitudesDotFechaasignacion) {
        this.dSSolicitudPIUStatusFullAesolicitudesDotFechaasignacion = dSSolicitudPIUStatusFullAesolicitudesDotFechaasignacion;
    }

    @JsonIgnore
    public Boolean getDSSolicitudPIUStatusFullDrvTienePrimeraFirma() {
        return this.dSSolicitudPIUStatusFullDrvTienePrimeraFirma;
    }
    
    public void setDSSolicitudPIUStatusFullDrvTienePrimeraFirma(Boolean dSSolicitudPIUStatusFullDrvTienePrimeraFirma) {
        this.dSSolicitudPIUStatusFullDrvTienePrimeraFirma = dSSolicitudPIUStatusFullDrvTienePrimeraFirma;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusFullAgenteDotSucursalDotDescripcion() {
        return this.dSSolicitudPIUStatusFullAgenteDotSucursalDotDescripcion;
    }
    
    public void setDSSolicitudPIUStatusFullAgenteDotSucursalDotDescripcion(String dSSolicitudPIUStatusFullAgenteDotSucursalDotDescripcion) {
        this.dSSolicitudPIUStatusFullAgenteDotSucursalDotDescripcion = dSSolicitudPIUStatusFullAgenteDotSucursalDotDescripcion;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusFullAgenteDotSucursalDotRegionalDotDescripcion() {
        return this.dSSolicitudPIUStatusFullAgenteDotSucursalDotRegionalDotDescripcion;
    }
    
    public void setDSSolicitudPIUStatusFullAgenteDotSucursalDotRegionalDotDescripcion(String dSSolicitudPIUStatusFullAgenteDotSucursalDotRegionalDotDescripcion) {
        this.dSSolicitudPIUStatusFullAgenteDotSucursalDotRegionalDotDescripcion = dSSolicitudPIUStatusFullAgenteDotSucursalDotRegionalDotDescripcion;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusFullAgenteDotDrvNomJefe() {
        return this.dSSolicitudPIUStatusFullAgenteDotDrvNomJefe;
    }
    
    public void setDSSolicitudPIUStatusFullAgenteDotDrvNomJefe(String dSSolicitudPIUStatusFullAgenteDotDrvNomJefe) {
        this.dSSolicitudPIUStatusFullAgenteDotDrvNomJefe = dSSolicitudPIUStatusFullAgenteDotDrvNomJefe;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusFullAgenteDotDrvNomAgencia() {
        return this.dSSolicitudPIUStatusFullAgenteDotDrvNomAgencia;
    }
    
    public void setDSSolicitudPIUStatusFullAgenteDotDrvNomAgencia(String dSSolicitudPIUStatusFullAgenteDotDrvNomAgencia) {
        this.dSSolicitudPIUStatusFullAgenteDotDrvNomAgencia = dSSolicitudPIUStatusFullAgenteDotDrvNomAgencia;
    }

    @JsonIgnore
    public Boolean getDSSolicitudPIUStatusFullDrvAlgunBeneficiarioEPSSanitas() {
        return this.dSSolicitudPIUStatusFullDrvAlgunBeneficiarioEPSSanitas;
    }
    
    public void setDSSolicitudPIUStatusFullDrvAlgunBeneficiarioEPSSanitas(Boolean dSSolicitudPIUStatusFullDrvAlgunBeneficiarioEPSSanitas) {
        this.dSSolicitudPIUStatusFullDrvAlgunBeneficiarioEPSSanitas = dSSolicitudPIUStatusFullDrvAlgunBeneficiarioEPSSanitas;
    }

    @JsonIgnore
    public Boolean getDSSolicitudPIUStatusFullDrvPolizaInternacional() {
        return this.dSSolicitudPIUStatusFullDrvPolizaInternacional;
    }
    
    public void setDSSolicitudPIUStatusFullDrvPolizaInternacional(Boolean dSSolicitudPIUStatusFullDrvPolizaInternacional) {
        this.dSSolicitudPIUStatusFullDrvPolizaInternacional = dSSolicitudPIUStatusFullDrvPolizaInternacional;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusFullDrvListaErrores() {
        return this.dSSolicitudPIUStatusFullDrvListaErrores;
    }
    
    public void setDSSolicitudPIUStatusFullDrvListaErrores(String dSSolicitudPIUStatusFullDrvListaErrores) {
        this.dSSolicitudPIUStatusFullDrvListaErrores = dSSolicitudPIUStatusFullDrvListaErrores;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusFullObservacions() {
        return this.dSSolicitudPIUStatusFullObservacions;
    }
    
    public void setDSSolicitudPIUStatusFullObservacions(String dSSolicitudPIUStatusFullObservacions) {
        this.dSSolicitudPIUStatusFullObservacions = dSSolicitudPIUStatusFullObservacions;
    }

    @JsonIgnore
    public Double getDSSolicitudPIUStatusFullDrvSemaforoGrabAse() {
        return this.dSSolicitudPIUStatusFullDrvSemaforoGrabAse;
    }
    
    public void setDSSolicitudPIUStatusFullDrvSemaforoGrabAse(Double dSSolicitudPIUStatusFullDrvSemaforoGrabAse) {
        this.dSSolicitudPIUStatusFullDrvSemaforoGrabAse = dSSolicitudPIUStatusFullDrvSemaforoGrabAse;
    }

    @JsonIgnore
    public Double getDSSolicitudPIUStatusFullDrvSemaforoAreaMed() {
        return this.dSSolicitudPIUStatusFullDrvSemaforoAreaMed;
    }
    
    public void setDSSolicitudPIUStatusFullDrvSemaforoAreaMed(Double dSSolicitudPIUStatusFullDrvSemaforoAreaMed) {
        this.dSSolicitudPIUStatusFullDrvSemaforoAreaMed = dSSolicitudPIUStatusFullDrvSemaforoAreaMed;
    }

    @JsonIgnore
    public Boolean getDSSolicitudPIUStatusFullEnvioCarnetFisico() {
        return this.dSSolicitudPIUStatusFullEnvioCarnetFisico;
    }
    
    public void setDSSolicitudPIUStatusFullEnvioCarnetFisico(Boolean dSSolicitudPIUStatusFullEnvioCarnetFisico) {
        this.dSSolicitudPIUStatusFullEnvioCarnetFisico = dSSolicitudPIUStatusFullEnvioCarnetFisico;
    }
}
