package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>Solicitud</code> model class.
 */
public final class SolicitudConstants {

    private SolicitudConstants() {

    }

    // Class
    /** <code>Solicitud</code> class id. */
    public static final String CLASS_ID = "Clas_1431957012480960_Alias";
    /** <code>Solicitud</code> class name. */
    public static final String CLASS_NAME = "Solicitud";
    /** <code>Solicitud</code> class alias. */
    public static final String CLASS_ALIAS = "Solicitud";
    /** <code>Solicitud</code> class table name. */
    public static final String TBL_NAME = "Solicitud";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "aesolicitudesidsolicitud,personaIdentificador,personaTitularPersonaIdentificador,grupoAsociadoCodigo,funcionarioId,formaPagoFormaPagoCodigo,periodicidadPeriodicidadCodigo,contratoCContratoCID,funcionarioUsrAreaMedicaId,tipoFacturaTipoFacturaCodigo,funcionarioUsrAfiliacionId,solicitudNumRadicado,solicitudTramite,solicitudNumContrato,solicitudFInicioContrato,solicitudEsTraslado,solicitudtipoContrato,solicitudcodigoSucursalRad,solicitudcontratoConFirma,solicitudobservacions,solicitudexentoIVA,solicitudvalorCuota,solicitudvalorDtoComercialSim,solicitudValorCuotaInscrip,solicitudValorDtoFinanciero,solicitudValorDtoComercial,solicituddatosPagoOK,solicitudvalorCuotaPeriodoC,solicituddescuentoComercialC,solicitudIVAC,solicituddescuentoFinancieroC,solicitudTieneDifLiquidacion,solicitudUsuariosValidados,solicitudNumContratoInclusion,solicitudNumFamilia,solicitudEmailURLPagoEnviado,solicitudEmailDocuEnviado,solicitudDocsEnviados,solicitudcodDirector,solicitudvalorCuotaBrutaC,solicitudCodTarifa,solicitudCompletada,solicitudEstado,solicitudFIniVigContInc,solicitudPorcentajeProrrateo,solicitudGrupoDelCORE,solicitudTipoFacturaCORE,solicitudResultSMSInfoPago,solicitudFechaCompletada,solicitudFechaUltimoDoc,solicitudPrioridad,solicitudFechaTerminada,solicitudFechaFUG,solicitudFechaFA,solicitudFechaFAAM,solicitudSemaforoGrabAse,solicitudSemaforoAreaMed,solicitudEstadoDoc,solicitudEnvioCarnetFisico";

    public static final String DSDSSOLICITUDPIURADICADO = "DS_Solicitud_PIURadicado";
    public static final String DSDSSOLICITUDPIUCONSULTARAD = "DS_Solicitud_PIUConsultaRad";
    public static final String DSDSSOLICITUDPIUENVIODOC = "DS_Solicitud_PIUEnvioDoc";
    public static final String DSDSSOLICITUDIIUNUEVAAFIL = "DS_Solicitud_IIUNuevaAfil";
    public static final String DSDSSOLICITUDIIUINFOCONTRATNAT = "DS_SolicitudIIUInfoContratNAT";
    public static final String DSDSSOLICITUDIIUINFOCONTRATJUR = "DS_SolicitudIIUInfoContratJUR";
    public static final String DSDSSOLICITUDIIUINFOOBSERVACION = "DS_SolicitudIIUInfoObservacion";
    public static final String DSDSSOLICITUDIIUINFOPAGO = "DS_SolicitudIIUInfoPago";
    public static final String DSICSOLICITUD = "IC_Solicitud";
    public static final String DSDSSOLICITUDIIUINCLUSION = "DS_Solicitud_IIUInclusion";
    public static final String DSDSSOLICITUDVACIA = "DS_Solicitud_Vacia";
    public static final String DSDSSOLICITUDIIUDIFLIQ = "DS_Solicitud_IIUDifLiq";
    public static final String DSDSSOLICITUDIIUPREEXISTENCIAS = "DS_SolicitudIIUPreexistencias";
    public static final String DSDSSOLICITUDPIUSTATUSFULL = "DS_SolicitudPIU_StatusFull";
    public static final String DSDSIIUINFOTITULARINCFAM = "DS_IIUInfoTitularIncFam";
    public static final String DSDSSOLICITUDPIUSTATUSFULLASE = "DS_SolicitudPIU_StatusFullAse";
    public static final String DSDSSOLICITUDPIUSTATUSADMIN = "DS_SolicitudPIU_StatusAdmin";
    public static final String DSDSSOLICITUDPIUSTATUSAFIL = "DS_SolicitudPIU_StatusAfil";
    public static final String DSDSSOLICITUDPIUSTATUSAREAME = "DS_SolicitudPIU_StatusAreaMe";
    public static final String DSDSSOLICITUDPIUSTATUSASESOR = "DS_SolicitudPIU_StatusAsesor";
    public static final String DSDSSOLPIUSTATUSGESTORMESA = "DS_SolPIU_StatusGestorMesa";
    public static final String DSDSSOLICITUDPIUSTATUSGESTMESA = "DS_SolicitudPIU_StatusGestMesa";
    public static final String DSDSSOLICITUDINFOCONTRATANTEID = "DS_SolicitudInfoContratanteID";
    public static final String DSDSSOLICITUDIIUINFOCONTRACONTA = "DS_SolicitudIIUInfoContraConta";
    

    // Attribute (solicitudNumRadicado)
    /** <code>solicitudNumRadicado</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNUMRADICADO = "Clas_1431957012480960Atr_2_Alias";
    /** <code>solicitudNumRadicado</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNUMRADICADO = "solicitudNumRadicado";
    /** <code>solicitudNumRadicado</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNUMRADICADO = "Nº Solicitud";

    /** <code>solicitudNumRadicado</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNUMRADICADO = "";
    /** Agents allowed to view the attribute solicitudNumRadicado **/
    public static final String SOLICITUDNUMRADICADO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (solicitudTramite)
    /** <code>solicitudTramite</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDTRAMITE = "Clas_1431957012480960Atr_3_Alias";
    /** <code>solicitudTramite</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDTRAMITE = "solicitudTramite";
    /** <code>solicitudTramite</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDTRAMITE = "Trámite";

    /** <code>solicitudTramite</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDTRAMITE = "";
    /** Agents allowed to view the attribute solicitudTramite **/
    public static final String SOLICITUDTRAMITE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNumContrato)
    /** <code>solicitudNumContrato</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNUMCONTRATO = "Clas_1431957012480960Atr_4_Alias";
    /** <code>solicitudNumContrato</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNUMCONTRATO = "solicitudNumContrato";
    /** <code>solicitudNumContrato</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNUMCONTRATO = "Nº Contrato";

    /** <code>solicitudNumContrato</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNUMCONTRATO = "";
    /** Agents allowed to view the attribute solicitudNumContrato **/
    public static final String SOLICITUDNUMCONTRATO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudFInicioContrato)
    /** <code>solicitudFInicioContrato</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDFINICIOCONTRATO = "Clas_1431957012480960Atr_8_Alias";
    /** <code>solicitudFInicioContrato</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDFINICIOCONTRATO = "solicitudFInicioContrato";
    /** <code>solicitudFInicioContrato</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDFINICIOCONTRATO = "Fecha inicio contratación";

    /** <code>solicitudFInicioContrato</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDFINICIOCONTRATO = "";
    /** Agents allowed to view the attribute solicitudFInicioContrato **/
    public static final String SOLICITUDFINICIOCONTRATO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudEsTraslado)
    /** <code>solicitudEsTraslado</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDESTRASLADO = "Clas_1431957012480960Atr_9_Alias";
    /** <code>solicitudEsTraslado</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDESTRASLADO = "solicitudEsTraslado";
    /** <code>solicitudEsTraslado</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDESTRASLADO = "Es traslado";

    /** <code>solicitudEsTraslado</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDESTRASLADO = "";
    /** Agents allowed to view the attribute solicitudEsTraslado **/
    public static final String SOLICITUDESTRASLADO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvReqCuesMed)
    /** <code>solicituddrvReqCuesMed</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVREQCUESMED = "Clas_1431957012480960Atr_10_Alias";
    /** <code>solicituddrvReqCuesMed</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVREQCUESMED = "solicituddrvReqCuesMed";
    /** <code>solicituddrvReqCuesMed</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVREQCUESMED = "Requiere cuestionario";

    /** <code>solicituddrvReqCuesMed</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVREQCUESMED = "";
    /** Agents allowed to view the attribute solicituddrvReqCuesMed **/
    public static final String SOLICITUDDRVREQCUESMED_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudtipoContrato)
    /** <code>solicitudtipoContrato</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDTIPOCONTRATO = "Clas_1431957012480960Atr_14_Alias";
    /** <code>solicitudtipoContrato</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDTIPOCONTRATO = "solicitudtipoContrato";
    /** <code>solicitudtipoContrato</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDTIPOCONTRATO = "Tipo Contrato";

    /** <code>solicitudtipoContrato</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDTIPOCONTRATO = "";
    /** Agents allowed to view the attribute solicitudtipoContrato **/
    public static final String SOLICITUDTIPOCONTRATO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudcodigoSucursalRad)
    /** <code>solicitudcodigoSucursalRad</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDCODIGOSUCURSALRAD = "Clas_1431957012480960Atr_19_Alias";
    /** <code>solicitudcodigoSucursalRad</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDCODIGOSUCURSALRAD = "solicitudcodigoSucursalRad";
    /** <code>solicitudcodigoSucursalRad</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDCODIGOSUCURSALRAD = "Cód. Sucursal Rad.";

    /** <code>solicitudcodigoSucursalRad</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDCODIGOSUCURSALRAD = "";
    /** Agents allowed to view the attribute solicitudcodigoSucursalRad **/
    public static final String SOLICITUDCODIGOSUCURSALRAD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudcontratoConFirma)
    /** <code>solicitudcontratoConFirma</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDCONTRATOCONFIRMA = "Clas_1431957012480960Atr_22_Alias";
    /** <code>solicitudcontratoConFirma</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDCONTRATOCONFIRMA = "solicitudcontratoConFirma";
    /** <code>solicitudcontratoConFirma</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDCONTRATOCONFIRMA = "Contrato con firma";

    /** <code>solicitudcontratoConFirma</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDCONTRATOCONFIRMA = "";
    /** Agents allowed to view the attribute solicitudcontratoConFirma **/
    public static final String SOLICITUDCONTRATOCONFIRMA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudobservacions)
    /** <code>solicitudobservacions</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDOBSERVACIONS = "Clas_1431957012480960Atr_23_Alias";
    /** <code>solicitudobservacions</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDOBSERVACIONS = "solicitudobservacions";
    /** <code>solicitudobservacions</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDOBSERVACIONS = "Observaciones";

    /** <code>solicitudobservacions</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDOBSERVACIONS = "";
    /** Agents allowed to view the attribute solicitudobservacions **/
    public static final String SOLICITUDOBSERVACIONS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudexentoIVA)
    /** <code>solicitudexentoIVA</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDEXENTOIVA = "Clas_1431957012480960Atr_24_Alias";
    /** <code>solicitudexentoIVA</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDEXENTOIVA = "solicitudexentoIVA";
    /** <code>solicitudexentoIVA</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDEXENTOIVA = "Exento IVA";

    /** <code>solicitudexentoIVA</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDEXENTOIVA = "";
    /** Agents allowed to view the attribute solicitudexentoIVA **/
    public static final String SOLICITUDEXENTOIVA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvYaTieneContratante)
    /** <code>solicituddrvYaTieneContratante</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVYATIENECONTRATANTE = "Clas_1431957012480960Atr_25_Alias";
    /** <code>solicituddrvYaTieneContratante</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVYATIENECONTRATANTE = "solicituddrvYaTieneContratante";
    /** <code>solicituddrvYaTieneContratante</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVYATIENECONTRATANTE = "Ya tiene contratante";

    /** <code>solicituddrvYaTieneContratante</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVYATIENECONTRATANTE = "";
    /** Agents allowed to view the attribute solicituddrvYaTieneContratante **/
    public static final String SOLICITUDDRVYATIENECONTRATANTE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvTitularConBeneficios)
    /** <code>solicituddrvTitularConBeneficios</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVTITULARCONBENEFICIOS = "Clas_1431957012480960Atr_26_Alias";
    /** <code>solicituddrvTitularConBeneficios</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVTITULARCONBENEFICIOS = "solicituddrvTitularConBeneficios";
    /** <code>solicituddrvTitularConBeneficios</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVTITULARCONBENEFICIOS = "Titular con beneficios";

    /** <code>solicituddrvTitularConBeneficios</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVTITULARCONBENEFICIOS = "";
    /** Agents allowed to view the attribute solicituddrvTitularConBeneficios **/
    public static final String SOLICITUDDRVTITULARCONBENEFICIOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudvalorCuota)
    /** <code>solicitudvalorCuota</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDVALORCUOTA = "Clas_1431957012480960Atr_27_Alias";
    /** <code>solicitudvalorCuota</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDVALORCUOTA = "solicitudvalorCuota";
    /** <code>solicitudvalorCuota</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDVALORCUOTA = "Valor cuota";

    /** <code>solicitudvalorCuota</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDVALORCUOTA = "";
    /** Agents allowed to view the attribute solicitudvalorCuota **/
    public static final String SOLICITUDVALORCUOTA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudvalorDtoComercialSim)
    /** <code>solicitudvalorDtoComercialSim</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDVALORDTOCOMERCIALSIM = "Clas_1431957012480960Atr_28_Alias";
    /** <code>solicitudvalorDtoComercialSim</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDVALORDTOCOMERCIALSIM = "solicitudvalorDtoComercialSim";
    /** <code>solicitudvalorDtoComercialSim</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDVALORDTOCOMERCIALSIM = "Dto. Comercial Simultaneidad";

    /** <code>solicitudvalorDtoComercialSim</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDVALORDTOCOMERCIALSIM = "";
    /** Agents allowed to view the attribute solicitudvalorDtoComercialSim **/
    public static final String SOLICITUDVALORDTOCOMERCIALSIM_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudValorCuotaInscrip)
    /** <code>solicitudValorCuotaInscrip</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDVALORCUOTAINSCRIP = "Clas_1431957012480960Atr_31_Alias";
    /** <code>solicitudValorCuotaInscrip</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDVALORCUOTAINSCRIP = "solicitudValorCuotaInscrip";
    /** <code>solicitudValorCuotaInscrip</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDVALORCUOTAINSCRIP = "Valor cuota inscripción";

    /** <code>solicitudValorCuotaInscrip</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDVALORCUOTAINSCRIP = "";
    /** Agents allowed to view the attribute solicitudValorCuotaInscrip **/
    public static final String SOLICITUDVALORCUOTAINSCRIP_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvSubtotal)
    /** <code>solicituddrvSubtotal</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVSUBTOTAL = "Clas_1431957012480960Atr_30_Alias";
    /** <code>solicituddrvSubtotal</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVSUBTOTAL = "solicituddrvSubtotal";
    /** <code>solicituddrvSubtotal</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVSUBTOTAL = "Subtotal";

    /** <code>solicituddrvSubtotal</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVSUBTOTAL = "";
    /** Agents allowed to view the attribute solicituddrvSubtotal **/
    public static final String SOLICITUDDRVSUBTOTAL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudValorDtoFinanciero)
    /** <code>solicitudValorDtoFinanciero</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDVALORDTOFINANCIERO = "Clas_1431957012480960Atr_29_Alias";
    /** <code>solicitudValorDtoFinanciero</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDVALORDTOFINANCIERO = "solicitudValorDtoFinanciero";
    /** <code>solicitudValorDtoFinanciero</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDVALORDTOFINANCIERO = "Valor Dto. Financiero";

    /** <code>solicitudValorDtoFinanciero</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDVALORDTOFINANCIERO = "";
    /** Agents allowed to view the attribute solicitudValorDtoFinanciero **/
    public static final String SOLICITUDVALORDTOFINANCIERO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudValorDtoComercial)
    /** <code>solicitudValorDtoComercial</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDVALORDTOCOMERCIAL = "Clas_1431957012480960Atr_46_Alias";
    /** <code>solicitudValorDtoComercial</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDVALORDTOCOMERCIAL = "solicitudValorDtoComercial";
    /** <code>solicitudValorDtoComercial</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDVALORDTOCOMERCIAL = "Valor Dto. Comercial";

    /** <code>solicitudValorDtoComercial</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDVALORDTOCOMERCIAL = "";
    /** Agents allowed to view the attribute solicitudValorDtoComercial **/
    public static final String SOLICITUDVALORDTOCOMERCIAL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvBaseGrabable)
    /** <code>solicituddrvBaseGrabable</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVBASEGRABABLE = "Clas_1431957012480960Atr_33_Alias";
    /** <code>solicituddrvBaseGrabable</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVBASEGRABABLE = "solicituddrvBaseGrabable";
    /** <code>solicituddrvBaseGrabable</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVBASEGRABABLE = "Base grabable";

    /** <code>solicituddrvBaseGrabable</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVBASEGRABABLE = "";
    /** Agents allowed to view the attribute solicituddrvBaseGrabable **/
    public static final String SOLICITUDDRVBASEGRABABLE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvPorcenIVA)
    /** <code>solicituddrvPorcenIVA</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVPORCENIVA = "Clas_1431957012480960Atr_47_Alias";
    /** <code>solicituddrvPorcenIVA</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVPORCENIVA = "solicituddrvPorcenIVA";
    /** <code>solicituddrvPorcenIVA</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVPORCENIVA = "% IVA";

    /** <code>solicituddrvPorcenIVA</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVPORCENIVA = "";
    /** Agents allowed to view the attribute solicituddrvPorcenIVA **/
    public static final String SOLICITUDDRVPORCENIVA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvIVA)
    /** <code>solicituddrvIVA</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVIVA = "Clas_1431957012480960Atr_32_Alias";
    /** <code>solicituddrvIVA</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVIVA = "solicituddrvIVA";
    /** <code>solicituddrvIVA</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVIVA = "IVA";

    /** <code>solicituddrvIVA</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVIVA = "";
    /** Agents allowed to view the attribute solicituddrvIVA **/
    public static final String SOLICITUDDRVIVA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvTotal)
    /** <code>solicituddrvTotal</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVTOTAL = "Clas_1431957012480960Atr_34_Alias";
    /** <code>solicituddrvTotal</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVTOTAL = "solicituddrvTotal";
    /** <code>solicituddrvTotal</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVTOTAL = "Total";

    /** <code>solicituddrvTotal</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVTOTAL = "";
    /** Agents allowed to view the attribute solicituddrvTotal **/
    public static final String SOLICITUDDRVTOTAL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddatosPagoOK)
    /** <code>solicituddatosPagoOK</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDATOSPAGOOK = "Clas_1431957012480960Atr_36_Alias";
    /** <code>solicituddatosPagoOK</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDATOSPAGOOK = "solicituddatosPagoOK";
    /** <code>solicituddatosPagoOK</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDATOSPAGOOK = "Datos pago OK";

    /** <code>solicituddatosPagoOK</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDATOSPAGOOK = "";
    /** Agents allowed to view the attribute solicituddatosPagoOK **/
    public static final String SOLICITUDDATOSPAGOOK_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudvalorCuotaPeriodoC)
    /** <code>solicitudvalorCuotaPeriodoC</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDVALORCUOTAPERIODOC = "Clas_1431957012480960Atr_37_Alias";
    /** <code>solicitudvalorCuotaPeriodoC</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDVALORCUOTAPERIODOC = "solicitudvalorCuotaPeriodoC";
    /** <code>solicitudvalorCuotaPeriodoC</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDVALORCUOTAPERIODOC = "Valor Cuota Periodo ";

    /** <code>solicitudvalorCuotaPeriodoC</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDVALORCUOTAPERIODOC = "";
    /** Agents allowed to view the attribute solicitudvalorCuotaPeriodoC **/
    public static final String SOLICITUDVALORCUOTAPERIODOC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddescuentoComercialC)
    /** <code>solicituddescuentoComercialC</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDESCUENTOCOMERCIALC = "Clas_1431957012480960Atr_38_Alias";
    /** <code>solicituddescuentoComercialC</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDESCUENTOCOMERCIALC = "solicituddescuentoComercialC";
    /** <code>solicituddescuentoComercialC</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDESCUENTOCOMERCIALC = "Descuento comercial";

    /** <code>solicituddescuentoComercialC</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDESCUENTOCOMERCIALC = "";
    /** Agents allowed to view the attribute solicituddescuentoComercialC **/
    public static final String SOLICITUDDESCUENTOCOMERCIALC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudIVAC)
    /** <code>solicitudIVAC</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDIVAC = "Clas_1431957012480960Atr_39_Alias";
    /** <code>solicitudIVAC</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDIVAC = "solicitudIVAC";
    /** <code>solicitudIVAC</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDIVAC = "IVA";

    /** <code>solicitudIVAC</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDIVAC = "";
    /** Agents allowed to view the attribute solicitudIVAC **/
    public static final String SOLICITUDIVAC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddescuentoFinancieroC)
    /** <code>solicituddescuentoFinancieroC</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDESCUENTOFINANCIEROC = "Clas_1431957012480960Atr_40_Alias";
    /** <code>solicituddescuentoFinancieroC</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDESCUENTOFINANCIEROC = "solicituddescuentoFinancieroC";
    /** <code>solicituddescuentoFinancieroC</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDESCUENTOFINANCIEROC = "Descuento financiero";

    /** <code>solicituddescuentoFinancieroC</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDESCUENTOFINANCIEROC = "";
    /** Agents allowed to view the attribute solicituddescuentoFinancieroC **/
    public static final String SOLICITUDDESCUENTOFINANCIEROC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudTieneDifLiquidacion)
    /** <code>solicitudTieneDifLiquidacion</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDTIENEDIFLIQUIDACION = "Clas_1431957012480960Atr_41_Alias";
    /** <code>solicitudTieneDifLiquidacion</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDTIENEDIFLIQUIDACION = "solicitudTieneDifLiquidacion";
    /** <code>solicitudTieneDifLiquidacion</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDTIENEDIFLIQUIDACION = "Diferencias liquidación";

    /** <code>solicitudTieneDifLiquidacion</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDTIENEDIFLIQUIDACION = "";
    /** Agents allowed to view the attribute solicitudTieneDifLiquidacion **/
    public static final String SOLICITUDTIENEDIFLIQUIDACION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudUsuariosValidados)
    /** <code>solicitudUsuariosValidados</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDUSUARIOSVALIDADOS = "Clas_1431957012480960Atr_43_Alias";
    /** <code>solicitudUsuariosValidados</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDUSUARIOSVALIDADOS = "solicitudUsuariosValidados";
    /** <code>solicitudUsuariosValidados</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDUSUARIOSVALIDADOS = "Usuarios validados";

    /** <code>solicitudUsuariosValidados</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDUSUARIOSVALIDADOS = "";
    /** Agents allowed to view the attribute solicitudUsuariosValidados **/
    public static final String SOLICITUDUSUARIOSVALIDADOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvCuesMedOK)
    /** <code>solicituddrvCuesMedOK</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVCUESMEDOK = "Clas_1431957012480960Atr_48_Alias";
    /** <code>solicituddrvCuesMedOK</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVCUESMEDOK = "solicituddrvCuesMedOK";
    /** <code>solicituddrvCuesMedOK</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVCUESMEDOK = "Cuestionarios médicos OK";

    /** <code>solicituddrvCuesMedOK</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVCUESMEDOK = "";
    /** Agents allowed to view the attribute solicituddrvCuesMedOK **/
    public static final String SOLICITUDDRVCUESMEDOK_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNumContratoInclusion)
    /** <code>solicitudNumContratoInclusion</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNUMCONTRATOINCLUSION = "Clas_1431957012480960Atr_49_Alias";
    /** <code>solicitudNumContratoInclusion</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNUMCONTRATOINCLUSION = "solicitudNumContratoInclusion";
    /** <code>solicitudNumContratoInclusion</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNUMCONTRATOINCLUSION = "Nº Contrato Inclusión";

    /** <code>solicitudNumContratoInclusion</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNUMCONTRATOINCLUSION = "";
    /** Agents allowed to view the attribute solicitudNumContratoInclusion **/
    public static final String SOLICITUDNUMCONTRATOINCLUSION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNumFamilia)
    /** <code>solicitudNumFamilia</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNUMFAMILIA = "Clas_1431957012480960Atr_50_Alias";
    /** <code>solicitudNumFamilia</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNUMFAMILIA = "solicitudNumFamilia";
    /** <code>solicitudNumFamilia</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNUMFAMILIA = "Nº Familia";

    /** <code>solicitudNumFamilia</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNUMFAMILIA = "";
    /** Agents allowed to view the attribute solicitudNumFamilia **/
    public static final String SOLICITUDNUMFAMILIA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvYaTieneTitular)
    /** <code>solicituddrvYaTieneTitular</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVYATIENETITULAR = "Clas_1431957012480960Atr_51_Alias";
    /** <code>solicituddrvYaTieneTitular</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVYATIENETITULAR = "solicituddrvYaTieneTitular";
    /** <code>solicituddrvYaTieneTitular</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVYATIENETITULAR = "Ya tiene titular";

    /** <code>solicituddrvYaTieneTitular</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVYATIENETITULAR = "";
    /** Agents allowed to view the attribute solicituddrvYaTieneTitular **/
    public static final String SOLICITUDDRVYATIENETITULAR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvDifValorCuota)
    /** <code>solicituddrvDifValorCuota</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVDIFVALORCUOTA = "Clas_1431957012480960Atr_52_Alias";
    /** <code>solicituddrvDifValorCuota</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVDIFVALORCUOTA = "solicituddrvDifValorCuota";
    /** <code>solicituddrvDifValorCuota</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVDIFVALORCUOTA = "Diferencia Cuota";

    /** <code>solicituddrvDifValorCuota</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVDIFVALORCUOTA = "";
    /** Agents allowed to view the attribute solicituddrvDifValorCuota **/
    public static final String SOLICITUDDRVDIFVALORCUOTA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvDifValorDtoFinanciero)
    /** <code>solicituddrvDifValorDtoFinanciero</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVDIFVALORDTOFINANCIERO = "Clas_1431957012480960Atr_54_Alias";
    /** <code>solicituddrvDifValorDtoFinanciero</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVDIFVALORDTOFINANCIERO = "solicituddrvDifValorDtoFinanciero";
    /** <code>solicituddrvDifValorDtoFinanciero</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVDIFVALORDTOFINANCIERO = "Diferencia Dto. Financiero";

    /** <code>solicituddrvDifValorDtoFinanciero</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVDIFVALORDTOFINANCIERO = "";
    /** Agents allowed to view the attribute solicituddrvDifValorDtoFinanciero **/
    public static final String SOLICITUDDRVDIFVALORDTOFINANCIERO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvDifValorIVA)
    /** <code>solicituddrvDifValorIVA</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVDIFVALORIVA = "Clas_1431957012480960Atr_55_Alias";
    /** <code>solicituddrvDifValorIVA</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVDIFVALORIVA = "solicituddrvDifValorIVA";
    /** <code>solicituddrvDifValorIVA</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVDIFVALORIVA = "Diferencia IVA";

    /** <code>solicituddrvDifValorIVA</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVDIFVALORIVA = "";
    /** Agents allowed to view the attribute solicituddrvDifValorIVA **/
    public static final String SOLICITUDDRVDIFVALORIVA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvHayPreexistencias)
    /** <code>solicituddrvHayPreexistencias</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVHAYPREEXISTENCIAS = "Clas_1431957012480960Atr_56_Alias";
    /** <code>solicituddrvHayPreexistencias</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVHAYPREEXISTENCIAS = "solicituddrvHayPreexistencias";
    /** <code>solicituddrvHayPreexistencias</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVHAYPREEXISTENCIAS = "Hay preexistencias";

    /** <code>solicituddrvHayPreexistencias</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVHAYPREEXISTENCIAS = "";
    /** Agents allowed to view the attribute solicituddrvHayPreexistencias **/
    public static final String SOLICITUDDRVHAYPREEXISTENCIAS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvContratoLegalizado)
    /** <code>solicituddrvContratoLegalizado</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVCONTRATOLEGALIZADO = "Clas_1431957012480960Atr_42_Alias";
    /** <code>solicituddrvContratoLegalizado</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVCONTRATOLEGALIZADO = "solicituddrvContratoLegalizado";
    /** <code>solicituddrvContratoLegalizado</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVCONTRATOLEGALIZADO = "Contrato legalizado";

    /** <code>solicituddrvContratoLegalizado</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVCONTRATOLEGALIZADO = "";
    /** Agents allowed to view the attribute solicituddrvContratoLegalizado **/
    public static final String SOLICITUDDRVCONTRATOLEGALIZADO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvTieneSegundaFirma)
    /** <code>solicituddrvTieneSegundaFirma</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVTIENESEGUNDAFIRMA = "Clas_1431957012480960Atr_57_Alias";
    /** <code>solicituddrvTieneSegundaFirma</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVTIENESEGUNDAFIRMA = "solicituddrvTieneSegundaFirma";
    /** <code>solicituddrvTieneSegundaFirma</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVTIENESEGUNDAFIRMA = "Tiene segunda firma";

    /** <code>solicituddrvTieneSegundaFirma</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVTIENESEGUNDAFIRMA = "";
    /** Agents allowed to view the attribute solicituddrvTieneSegundaFirma **/
    public static final String SOLICITUDDRVTIENESEGUNDAFIRMA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvGrupoAsociado)
    /** <code>solicituddrvGrupoAsociado</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVGRUPOASOCIADO = "Clas_1431957012480960Atr_58_Alias";
    /** <code>solicituddrvGrupoAsociado</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVGRUPOASOCIADO = "solicituddrvGrupoAsociado";
    /** <code>solicituddrvGrupoAsociado</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVGRUPOASOCIADO = "Grupo asociado";

    /** <code>solicituddrvGrupoAsociado</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVGRUPOASOCIADO = "";
    /** Agents allowed to view the attribute solicituddrvGrupoAsociado **/
    public static final String SOLICITUDDRVGRUPOASOCIADO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvAplicaDocContrato)
    /** <code>solicituddrvAplicaDocContrato</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVAPLICADOCCONTRATO = "Clas_1431957012480960Atr_60_Alias";
    /** <code>solicituddrvAplicaDocContrato</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVAPLICADOCCONTRATO = "solicituddrvAplicaDocContrato";
    /** <code>solicituddrvAplicaDocContrato</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVAPLICADOCCONTRATO = "Contrato";

    /** <code>solicituddrvAplicaDocContrato</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVAPLICADOCCONTRATO = "";
    /** Agents allowed to view the attribute solicituddrvAplicaDocContrato **/
    public static final String SOLICITUDDRVAPLICADOCCONTRATO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvAplicaDocCartaPree)
    /** <code>solicituddrvAplicaDocCartaPree</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVAPLICADOCCARTAPREE = "Clas_1431957012480960Atr_62_Alias";
    /** <code>solicituddrvAplicaDocCartaPree</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVAPLICADOCCARTAPREE = "solicituddrvAplicaDocCartaPree";
    /** <code>solicituddrvAplicaDocCartaPree</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVAPLICADOCCARTAPREE = "Carta preexistencia";

    /** <code>solicituddrvAplicaDocCartaPree</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVAPLICADOCCARTAPREE = "";
    /** Agents allowed to view the attribute solicituddrvAplicaDocCartaPree **/
    public static final String SOLICITUDDRVAPLICADOCCARTAPREE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvAplicaDocBBGestante)
    /** <code>solicituddrvAplicaDocBBGestante</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVAPLICADOCBBGESTANTE = "Clas_1431957012480960Atr_63_Alias";
    /** <code>solicituddrvAplicaDocBBGestante</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVAPLICADOCBBGESTANTE = "solicituddrvAplicaDocBBGestante";
    /** <code>solicituddrvAplicaDocBBGestante</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVAPLICADOCBBGESTANTE = "Bebe gestante";

    /** <code>solicituddrvAplicaDocBBGestante</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVAPLICADOCBBGESTANTE = "";
    /** Agents allowed to view the attribute solicituddrvAplicaDocBBGestante **/
    public static final String SOLICITUDDRVAPLICADOCBBGESTANTE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvAplicaDocMaternidad)
    /** <code>solicituddrvAplicaDocMaternidad</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVAPLICADOCMATERNIDAD = "Clas_1431957012480960Atr_64_Alias";
    /** <code>solicituddrvAplicaDocMaternidad</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVAPLICADOCMATERNIDAD = "solicituddrvAplicaDocMaternidad";
    /** <code>solicituddrvAplicaDocMaternidad</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVAPLICADOCMATERNIDAD = "Doc. maternidad";

    /** <code>solicituddrvAplicaDocMaternidad</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVAPLICADOCMATERNIDAD = "";
    /** Agents allowed to view the attribute solicituddrvAplicaDocMaternidad **/
    public static final String SOLICITUDDRVAPLICADOCMATERNIDAD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvAplicaCuestionario)
    /** <code>solicituddrvAplicaCuestionario</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVAPLICACUESTIONARIO = "Clas_1431957012480960Atr_65_Alias";
    /** <code>solicituddrvAplicaCuestionario</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVAPLICACUESTIONARIO = "solicituddrvAplicaCuestionario";
    /** <code>solicituddrvAplicaCuestionario</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVAPLICACUESTIONARIO = "Cuestionario médico";

    /** <code>solicituddrvAplicaCuestionario</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVAPLICACUESTIONARIO = "";
    /** Agents allowed to view the attribute solicituddrvAplicaCuestionario **/
    public static final String SOLICITUDDRVAPLICACUESTIONARIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvAplicaCartaEnt)
    /** <code>solicituddrvAplicaCartaEnt</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVAPLICACARTAENT = "Clas_1431957012480960Atr_66_Alias";
    /** <code>solicituddrvAplicaCartaEnt</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVAPLICACARTAENT = "solicituddrvAplicaCartaEnt";
    /** <code>solicituddrvAplicaCartaEnt</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVAPLICACARTAENT = "Carta entrevista médica";

    /** <code>solicituddrvAplicaCartaEnt</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVAPLICACARTAENT = "";
    /** Agents allowed to view the attribute solicituddrvAplicaCartaEnt **/
    public static final String SOLICITUDDRVAPLICACARTAENT_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudEmailURLPagoEnviado)
    /** <code>solicitudEmailURLPagoEnviado</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDEMAILURLPAGOENVIADO = "Clas_1431957012480960Atr_68_Alias";
    /** <code>solicitudEmailURLPagoEnviado</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDEMAILURLPAGOENVIADO = "solicitudEmailURLPagoEnviado";
    /** <code>solicitudEmailURLPagoEnviado</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDEMAILURLPAGOENVIADO = "Email URL Pago enviado";

    /** <code>solicitudEmailURLPagoEnviado</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDEMAILURLPAGOENVIADO = "";
    /** Agents allowed to view the attribute solicitudEmailURLPagoEnviado **/
    public static final String SOLICITUDEMAILURLPAGOENVIADO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudEmailDocuEnviado)
    /** <code>solicitudEmailDocuEnviado</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDEMAILDOCUENVIADO = "Clas_1431957012480960Atr_69_Alias";
    /** <code>solicitudEmailDocuEnviado</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDEMAILDOCUENVIADO = "solicitudEmailDocuEnviado";
    /** <code>solicitudEmailDocuEnviado</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDEMAILDOCUENVIADO = "Email Doc. enviado";

    /** <code>solicitudEmailDocuEnviado</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDEMAILDOCUENVIADO = "";
    /** Agents allowed to view the attribute solicitudEmailDocuEnviado **/
    public static final String SOLICITUDEMAILDOCUENVIADO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudDocsEnviados)
    /** <code>solicitudDocsEnviados</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDOCSENVIADOS = "Clas_1431957012480960Atr_70_Alias";
    /** <code>solicitudDocsEnviados</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDOCSENVIADOS = "solicitudDocsEnviados";
    /** <code>solicitudDocsEnviados</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDOCSENVIADOS = "Doc. Enviada";

    /** <code>solicitudDocsEnviados</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDOCSENVIADOS = "";
    /** Agents allowed to view the attribute solicitudDocsEnviados **/
    public static final String SOLICITUDDOCSENVIADOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvTotalConAnexos)
    /** <code>solicituddrvTotalConAnexos</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVTOTALCONANEXOS = "Clas_1431957012480960Atr_71_Alias";
    /** <code>solicituddrvTotalConAnexos</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVTOTALCONANEXOS = "solicituddrvTotalConAnexos";
    /** <code>solicituddrvTotalConAnexos</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVTOTALCONANEXOS = "Total con anexos";

    /** <code>solicituddrvTotalConAnexos</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVTOTALCONANEXOS = "";
    /** Agents allowed to view the attribute solicituddrvTotalConAnexos **/
    public static final String SOLICITUDDRVTOTALCONANEXOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvContratanteEsTitular)
    /** <code>solicituddrvContratanteEsTitular</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVCONTRATANTEESTITULAR = "Clas_1431957012480960Atr_74_Alias";
    /** <code>solicituddrvContratanteEsTitular</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVCONTRATANTEESTITULAR = "solicituddrvContratanteEsTitular";
    /** <code>solicituddrvContratanteEsTitular</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVCONTRATANTEESTITULAR = "Contratante es Titular";

    /** <code>solicituddrvContratanteEsTitular</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVCONTRATANTEESTITULAR = "";
    /** Agents allowed to view the attribute solicituddrvContratanteEsTitular **/
    public static final String SOLICITUDDRVCONTRATANTEESTITULAR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvAlgunBeneficiarioEPSSanitas)
    /** <code>solicituddrvAlgunBeneficiarioEPSSanitas</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVALGUNBENEFICIARIOEPSSANITAS = "Clas_1431957012480960Atr_75_Alias";
    /** <code>solicituddrvAlgunBeneficiarioEPSSanitas</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVALGUNBENEFICIARIOEPSSANITAS = "solicituddrvAlgunBeneficiarioEPSSanitas";
    /** <code>solicituddrvAlgunBeneficiarioEPSSanitas</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVALGUNBENEFICIARIOEPSSANITAS = "Algún beneficiario EPS Sanitas";

    /** <code>solicituddrvAlgunBeneficiarioEPSSanitas</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVALGUNBENEFICIARIOEPSSANITAS = "";
    /** Agents allowed to view the attribute solicituddrvAlgunBeneficiarioEPSSanitas **/
    public static final String SOLICITUDDRVALGUNBENEFICIARIOEPSSANITAS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudcodDirector)
    /** <code>solicitudcodDirector</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDCODDIRECTOR = "Clas_1431957012480960Atr_77_Alias";
    /** <code>solicitudcodDirector</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDCODDIRECTOR = "solicitudcodDirector";
    /** <code>solicitudcodDirector</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDCODDIRECTOR = "Código Director";

    /** <code>solicitudcodDirector</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDCODDIRECTOR = "";
    /** Agents allowed to view the attribute solicitudcodDirector **/
    public static final String SOLICITUDCODDIRECTOR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvListaErrores)
    /** <code>solicituddrvListaErrores</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVLISTAERRORES = "Clas_1431957012480960Atr_78_Alias";
    /** <code>solicituddrvListaErrores</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVLISTAERRORES = "solicituddrvListaErrores";
    /** <code>solicituddrvListaErrores</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVLISTAERRORES = "Errores WS";

    /** <code>solicituddrvListaErrores</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVLISTAERRORES = "";
    /** Agents allowed to view the attribute solicituddrvListaErrores **/
    public static final String SOLICITUDDRVLISTAERRORES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudvalorCuotaBrutaC)
    /** <code>solicitudvalorCuotaBrutaC</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDVALORCUOTABRUTAC = "Clas_1431957012480960Atr_79_Alias";
    /** <code>solicitudvalorCuotaBrutaC</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDVALORCUOTABRUTAC = "solicitudvalorCuotaBrutaC";
    /** <code>solicitudvalorCuotaBrutaC</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDVALORCUOTABRUTAC = "Valor Cuota Bruta";

    /** <code>solicitudvalorCuotaBrutaC</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDVALORCUOTABRUTAC = "";
    /** Agents allowed to view the attribute solicitudvalorCuotaBrutaC **/
    public static final String SOLICITUDVALORCUOTABRUTAC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvDifValorCuotaBruta)
    /** <code>solicituddrvDifValorCuotaBruta</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVDIFVALORCUOTABRUTA = "Clas_1431957012480960Atr_80_Alias";
    /** <code>solicituddrvDifValorCuotaBruta</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVDIFVALORCUOTABRUTA = "solicituddrvDifValorCuotaBruta";
    /** <code>solicituddrvDifValorCuotaBruta</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVDIFVALORCUOTABRUTA = "Diferencia Cuota Bruta";

    /** <code>solicituddrvDifValorCuotaBruta</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVDIFVALORCUOTABRUTA = "";
    /** Agents allowed to view the attribute solicituddrvDifValorCuotaBruta **/
    public static final String SOLICITUDDRVDIFVALORCUOTABRUTA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvNumTitulares)
    /** <code>solicituddrvNumTitulares</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVNUMTITULARES = "Clas_1431957012480960Atr_81_Alias";
    /** <code>solicituddrvNumTitulares</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVNUMTITULARES = "solicituddrvNumTitulares";
    /** <code>solicituddrvNumTitulares</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVNUMTITULARES = "Nº Titulares";

    /** <code>solicituddrvNumTitulares</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVNUMTITULARES = "";
    /** Agents allowed to view the attribute solicituddrvNumTitulares **/
    public static final String SOLICITUDDRVNUMTITULARES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvEnviarEmailDoc)
    /** <code>solicituddrvEnviarEmailDoc</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVENVIAREMAILDOC = "Clas_1431957012480960Atr_82_Alias";
    /** <code>solicituddrvEnviarEmailDoc</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVENVIAREMAILDOC = "solicituddrvEnviarEmailDoc";
    /** <code>solicituddrvEnviarEmailDoc</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVENVIAREMAILDOC = "Se tiene que enviar mail";

    /** <code>solicituddrvEnviarEmailDoc</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVENVIAREMAILDOC = "";
    /** Agents allowed to view the attribute solicituddrvEnviarEmailDoc **/
    public static final String SOLICITUDDRVENVIAREMAILDOC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvAplicaDocNeonatal)
    /** <code>solicituddrvAplicaDocNeonatal</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVAPLICADOCNEONATAL = "Clas_1431957012480960Atr_83_Alias";
    /** <code>solicituddrvAplicaDocNeonatal</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVAPLICADOCNEONATAL = "solicituddrvAplicaDocNeonatal";
    /** <code>solicituddrvAplicaDocNeonatal</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVAPLICADOCNEONATAL = "Doc. neonatal";

    /** <code>solicituddrvAplicaDocNeonatal</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVAPLICADOCNEONATAL = "";
    /** Agents allowed to view the attribute solicituddrvAplicaDocNeonatal **/
    public static final String SOLICITUDDRVAPLICADOCNEONATAL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudCodTarifa)
    /** <code>solicitudCodTarifa</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDCODTARIFA = "Clas_1431957012480960Atr_84_Alias";
    /** <code>solicitudCodTarifa</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDCODTARIFA = "solicitudCodTarifa";
    /** <code>solicitudCodTarifa</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDCODTARIFA = "Cod. Tarifa";

    /** <code>solicitudCodTarifa</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDCODTARIFA = "";
    /** Agents allowed to view the attribute solicitudCodTarifa **/
    public static final String SOLICITUDCODTARIFA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvAplicaCarnets)
    /** <code>solicituddrvAplicaCarnets</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVAPLICACARNETS = "Clas_1431957012480960Atr_85_Alias";
    /** <code>solicituddrvAplicaCarnets</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVAPLICACARNETS = "solicituddrvAplicaCarnets";
    /** <code>solicituddrvAplicaCarnets</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVAPLICACARNETS = "Carnets";

    /** <code>solicituddrvAplicaCarnets</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVAPLICACARNETS = "";
    /** Agents allowed to view the attribute solicituddrvAplicaCarnets **/
    public static final String SOLICITUDDRVAPLICACARNETS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvAplicaDocSolicitud)
    /** <code>solicituddrvAplicaDocSolicitud</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVAPLICADOCSOLICITUD = "Clas_1431957012480960Atr_94_Alias";
    /** <code>solicituddrvAplicaDocSolicitud</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVAPLICADOCSOLICITUD = "solicituddrvAplicaDocSolicitud";
    /** <code>solicituddrvAplicaDocSolicitud</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVAPLICADOCSOLICITUD = "Solicitud";

    /** <code>solicituddrvAplicaDocSolicitud</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVAPLICADOCSOLICITUD = "";
    /** Agents allowed to view the attribute solicituddrvAplicaDocSolicitud **/
    public static final String SOLICITUDDRVAPLICADOCSOLICITUD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvPuedeReplicar)
    /** <code>solicituddrvPuedeReplicar</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVPUEDEREPLICAR = "Clas_1431957012480960Atr_86_Alias";
    /** <code>solicituddrvPuedeReplicar</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVPUEDEREPLICAR = "solicituddrvPuedeReplicar";
    /** <code>solicituddrvPuedeReplicar</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVPUEDEREPLICAR = "Puede replicar";

    /** <code>solicituddrvPuedeReplicar</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVPUEDEREPLICAR = "";
    /** Agents allowed to view the attribute solicituddrvPuedeReplicar **/
    public static final String SOLICITUDDRVPUEDEREPLICAR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudCompletada)
    /** <code>solicitudCompletada</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDCOMPLETADA = "Clas_1431957012480960Atr_87_Alias";
    /** <code>solicitudCompletada</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDCOMPLETADA = "solicitudCompletada";
    /** <code>solicitudCompletada</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDCOMPLETADA = "Completada";

    /** <code>solicitudCompletada</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDCOMPLETADA = "";
    /** Agents allowed to view the attribute solicitudCompletada **/
    public static final String SOLICITUDCOMPLETADA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo,UsuarioSistemaExterno";
    // Attribute (solicituddrvCambiarBenefCont)
    /** <code>solicituddrvCambiarBenefCont</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVCAMBIARBENEFCONT = "Clas_1431957012480960Atr_89_Alias";
    /** <code>solicituddrvCambiarBenefCont</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVCAMBIARBENEFCONT = "solicituddrvCambiarBenefCont";
    /** <code>solicituddrvCambiarBenefCont</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVCAMBIARBENEFCONT = "Puede cambiar beneficios del contratante";

    /** <code>solicituddrvCambiarBenefCont</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVCAMBIARBENEFCONT = "";
    /** Agents allowed to view the attribute solicituddrvCambiarBenefCont **/
    public static final String SOLICITUDDRVCAMBIARBENEFCONT_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudEstado)
    /** <code>solicitudEstado</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDESTADO = "Clas_1431957012480960Atr_88_Alias";
    /** <code>solicitudEstado</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDESTADO = "solicitudEstado";
    /** <code>solicitudEstado</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDESTADO = "Estado";

    /** <code>solicitudEstado</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDESTADO = "";
    /** Agents allowed to view the attribute solicitudEstado **/
    public static final String SOLICITUDESTADO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvEdadTitular)
    /** <code>solicituddrvEdadTitular</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVEDADTITULAR = "Clas_1431957012480960Atr_90_Alias";
    /** <code>solicituddrvEdadTitular</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVEDADTITULAR = "solicituddrvEdadTitular";
    /** <code>solicituddrvEdadTitular</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVEDADTITULAR = "Fecha nacimiento del titular";

    /** <code>solicituddrvEdadTitular</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVEDADTITULAR = "";
    /** Agents allowed to view the attribute solicituddrvEdadTitular **/
    public static final String SOLICITUDDRVEDADTITULAR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvGeneroTitular)
    /** <code>solicituddrvGeneroTitular</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVGENEROTITULAR = "Clas_1431957012480960Atr_91_Alias";
    /** <code>solicituddrvGeneroTitular</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVGENEROTITULAR = "solicituddrvGeneroTitular";
    /** <code>solicituddrvGeneroTitular</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVGENEROTITULAR = "Genero del titular";

    /** <code>solicituddrvGeneroTitular</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVGENEROTITULAR = "";
    /** Agents allowed to view the attribute solicituddrvGeneroTitular **/
    public static final String SOLICITUDDRVGENEROTITULAR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvTieneTitular)
    /** <code>solicituddrvTieneTitular</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVTIENETITULAR = "Clas_1431957012480960Atr_92_Alias";
    /** <code>solicituddrvTieneTitular</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVTIENETITULAR = "solicituddrvTieneTitular";
    /** <code>solicituddrvTieneTitular</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVTIENETITULAR = "Hay titular?";

    /** <code>solicituddrvTieneTitular</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVTIENETITULAR = "";
    /** Agents allowed to view the attribute solicituddrvTieneTitular **/
    public static final String SOLICITUDDRVTIENETITULAR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvObservacionesReport)
    /** <code>solicituddrvObservacionesReport</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVOBSERVACIONESREPORT = "Clas_1431957012480960Atr_93_Alias";
    /** <code>solicituddrvObservacionesReport</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVOBSERVACIONESREPORT = "solicituddrvObservacionesReport";
    /** <code>solicituddrvObservacionesReport</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVOBSERVACIONESREPORT = "Observaciones para report";

    /** <code>solicituddrvObservacionesReport</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVOBSERVACIONESREPORT = "";
    /** Agents allowed to view the attribute solicituddrvObservacionesReport **/
    public static final String SOLICITUDDRVOBSERVACIONESREPORT_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvIgnorarPreexistencias)
    /** <code>solicituddrvIgnorarPreexistencias</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVIGNORARPREEXISTENCIAS = "Clas_1431957012480960Atr_96_Alias";
    /** <code>solicituddrvIgnorarPreexistencias</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVIGNORARPREEXISTENCIAS = "solicituddrvIgnorarPreexistencias";
    /** <code>solicituddrvIgnorarPreexistencias</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVIGNORARPREEXISTENCIAS = "Ignorar preexistencias";

    /** <code>solicituddrvIgnorarPreexistencias</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVIGNORARPREEXISTENCIAS = "";
    /** Agents allowed to view the attribute solicituddrvIgnorarPreexistencias **/
    public static final String SOLICITUDDRVIGNORARPREEXISTENCIAS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvTienePrimeraFirma)
    /** <code>solicituddrvTienePrimeraFirma</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVTIENEPRIMERAFIRMA = "Clas_1431957012480960Atr_97_Alias";
    /** <code>solicituddrvTienePrimeraFirma</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVTIENEPRIMERAFIRMA = "solicituddrvTienePrimeraFirma";
    /** <code>solicituddrvTienePrimeraFirma</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVTIENEPRIMERAFIRMA = "Tiene primera firma";

    /** <code>solicituddrvTienePrimeraFirma</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVTIENEPRIMERAFIRMA = "";
    /** Agents allowed to view the attribute solicituddrvTienePrimeraFirma **/
    public static final String SOLICITUDDRVTIENEPRIMERAFIRMA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvNumContrato)
    /** <code>solicituddrvNumContrato</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVNUMCONTRATO = "Clas_1431957012480960Atr_98_Alias";
    /** <code>solicituddrvNumContrato</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVNUMCONTRATO = "solicituddrvNumContrato";
    /** <code>solicituddrvNumContrato</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVNUMCONTRATO = "Nº Contrato";

    /** <code>solicituddrvNumContrato</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVNUMCONTRATO = "";
    /** Agents allowed to view the attribute solicituddrvNumContrato **/
    public static final String SOLICITUDDRVNUMCONTRATO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudFIniVigContInc)
    /** <code>solicitudFIniVigContInc</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDFINIVIGCONTINC = "Clas_1431957012480960Atr_99_Alias";
    /** <code>solicitudFIniVigContInc</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDFINIVIGCONTINC = "solicitudFIniVigContInc";
    /** <code>solicitudFIniVigContInc</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDFINIVIGCONTINC = "Fecha inicio vigencia contrato inclusión";

    /** <code>solicitudFIniVigContInc</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDFINIVIGCONTINC = "";
    /** Agents allowed to view the attribute solicitudFIniVigContInc **/
    public static final String SOLICITUDFINIVIGCONTINC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvImpTarifaPlanVol)
    /** <code>solicituddrvImpTarifaPlanVol</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVIMPTARIFAPLANVOL = "Clas_1431957012480960Atr_101_Alias";
    /** <code>solicituddrvImpTarifaPlanVol</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVIMPTARIFAPLANVOL = "solicituddrvImpTarifaPlanVol";
    /** <code>solicituddrvImpTarifaPlanVol</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVIMPTARIFAPLANVOL = "Imp. Tarifa Plan Voluntario";

    /** <code>solicituddrvImpTarifaPlanVol</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVIMPTARIFAPLANVOL = "";
    /** Agents allowed to view the attribute solicituddrvImpTarifaPlanVol **/
    public static final String SOLICITUDDRVIMPTARIFAPLANVOL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvAplicaDocProtDatos)
    /** <code>solicituddrvAplicaDocProtDatos</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVAPLICADOCPROTDATOS = "Clas_1431957012480960Atr_102_Alias";
    /** <code>solicituddrvAplicaDocProtDatos</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVAPLICADOCPROTDATOS = "solicituddrvAplicaDocProtDatos";
    /** <code>solicituddrvAplicaDocProtDatos</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVAPLICADOCPROTDATOS = "Proteccion Datos";

    /** <code>solicituddrvAplicaDocProtDatos</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVAPLICADOCPROTDATOS = "";
    /** Agents allowed to view the attribute solicituddrvAplicaDocProtDatos **/
    public static final String SOLICITUDDRVAPLICADOCPROTDATOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudPorcentajeProrrateo)
    /** <code>solicitudPorcentajeProrrateo</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDPORCENTAJEPRORRATEO = "Clas_1431957012480960Atr_103_Alias";
    /** <code>solicitudPorcentajeProrrateo</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDPORCENTAJEPRORRATEO = "solicitudPorcentajeProrrateo";
    /** <code>solicitudPorcentajeProrrateo</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDPORCENTAJEPRORRATEO = "Porcentaje prorrateo";

    /** <code>solicitudPorcentajeProrrateo</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDPORCENTAJEPRORRATEO = "";
    /** Agents allowed to view the attribute solicitudPorcentajeProrrateo **/
    public static final String SOLICITUDPORCENTAJEPRORRATEO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvPuedeModificarGrupo)
    /** <code>solicituddrvPuedeModificarGrupo</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVPUEDEMODIFICARGRUPO = "Clas_1431957012480960Atr_104_Alias";
    /** <code>solicituddrvPuedeModificarGrupo</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVPUEDEMODIFICARGRUPO = "solicituddrvPuedeModificarGrupo";
    /** <code>solicituddrvPuedeModificarGrupo</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVPUEDEMODIFICARGRUPO = "Puede modificar grupo";

    /** <code>solicituddrvPuedeModificarGrupo</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVPUEDEMODIFICARGRUPO = "";
    /** Agents allowed to view the attribute solicituddrvPuedeModificarGrupo **/
    public static final String SOLICITUDDRVPUEDEMODIFICARGRUPO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudGrupoDelCORE)
    /** <code>solicitudGrupoDelCORE</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDGRUPODELCORE = "Clas_1431957012480960Atr_105_Alias";
    /** <code>solicitudGrupoDelCORE</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDGRUPODELCORE = "solicitudGrupoDelCORE";
    /** <code>solicitudGrupoDelCORE</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDGRUPODELCORE = "Grupo del Core";

    /** <code>solicitudGrupoDelCORE</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDGRUPODELCORE = "";
    /** Agents allowed to view the attribute solicitudGrupoDelCORE **/
    public static final String SOLICITUDGRUPODELCORE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudTipoFacturaCORE)
    /** <code>solicitudTipoFacturaCORE</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDTIPOFACTURACORE = "Clas_1431957012480960Atr_106_Alias";
    /** <code>solicitudTipoFacturaCORE</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDTIPOFACTURACORE = "solicitudTipoFacturaCORE";
    /** <code>solicitudTipoFacturaCORE</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDTIPOFACTURACORE = "Tipo Factura CORE";

    /** <code>solicitudTipoFacturaCORE</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDTIPOFACTURACORE = "";
    /** Agents allowed to view the attribute solicitudTipoFacturaCORE **/
    public static final String SOLICITUDTIPOFACTURACORE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvAplicaPolizaInternacional)
    /** <code>solicituddrvAplicaPolizaInternacional</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVAPLICAPOLIZAINTERNACIONAL = "Clas_1431957012480960Atr_107_Alias";
    /** <code>solicituddrvAplicaPolizaInternacional</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVAPLICAPOLIZAINTERNACIONAL = "solicituddrvAplicaPolizaInternacional";
    /** <code>solicituddrvAplicaPolizaInternacional</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVAPLICAPOLIZAINTERNACIONAL = "Aplica poliza internacional";

    /** <code>solicituddrvAplicaPolizaInternacional</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVAPLICAPOLIZAINTERNACIONAL = "";
    /** Agents allowed to view the attribute solicituddrvAplicaPolizaInternacional **/
    public static final String SOLICITUDDRVAPLICAPOLIZAINTERNACIONAL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvPolizaInternacional)
    /** <code>solicituddrvPolizaInternacional</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVPOLIZAINTERNACIONAL = "Clas_1431957012480960Atr_108_Alias";
    /** <code>solicituddrvPolizaInternacional</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVPOLIZAINTERNACIONAL = "solicituddrvPolizaInternacional";
    /** <code>solicituddrvPolizaInternacional</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVPOLIZAINTERNACIONAL = "Respaldo global";

    /** <code>solicituddrvPolizaInternacional</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVPOLIZAINTERNACIONAL = "";
    /** Agents allowed to view the attribute solicituddrvPolizaInternacional **/
    public static final String SOLICITUDDRVPOLIZAINTERNACIONAL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvPermiteRechazados)
    /** <code>solicituddrvPermiteRechazados</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVPERMITERECHAZADOS = "Clas_1431957012480960Atr_109_Alias";
    /** <code>solicituddrvPermiteRechazados</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVPERMITERECHAZADOS = "solicituddrvPermiteRechazados";
    /** <code>solicituddrvPermiteRechazados</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVPERMITERECHAZADOS = "Permite rechazados afiliacion";

    /** <code>solicituddrvPermiteRechazados</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVPERMITERECHAZADOS = "";
    /** Agents allowed to view the attribute solicituddrvPermiteRechazados **/
    public static final String SOLICITUDDRVPERMITERECHAZADOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvAlgunUsuarioIMC)
    /** <code>solicituddrvAlgunUsuarioIMC</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVALGUNUSUARIOIMC = "Clas_1431957012480960Atr_110_Alias";
    /** <code>solicituddrvAlgunUsuarioIMC</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVALGUNUSUARIOIMC = "solicituddrvAlgunUsuarioIMC";
    /** <code>solicituddrvAlgunUsuarioIMC</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVALGUNUSUARIOIMC = "drvAlgunUsuarioIMC";

    /** <code>solicituddrvAlgunUsuarioIMC</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVALGUNUSUARIOIMC = "";
    /** Agents allowed to view the attribute solicituddrvAlgunUsuarioIMC **/
    public static final String SOLICITUDDRVALGUNUSUARIOIMC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvFechaPorcenIVA)
    /** <code>solicituddrvFechaPorcenIVA</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVFECHAPORCENIVA = "Clas_1431957012480960Atr_111_Alias";
    /** <code>solicituddrvFechaPorcenIVA</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVFECHAPORCENIVA = "solicituddrvFechaPorcenIVA";
    /** <code>solicituddrvFechaPorcenIVA</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVFECHAPORCENIVA = "Fecha % IVA";

    /** <code>solicituddrvFechaPorcenIVA</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVFECHAPORCENIVA = "";
    /** Agents allowed to view the attribute solicituddrvFechaPorcenIVA **/
    public static final String SOLICITUDDRVFECHAPORCENIVA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudResultSMSInfoPago)
    /** <code>solicitudResultSMSInfoPago</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDRESULTSMSINFOPAGO = "Clas_1431957012480960Atr_112_Alias";
    /** <code>solicitudResultSMSInfoPago</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDRESULTSMSINFOPAGO = "solicitudResultSMSInfoPago";
    /** <code>solicitudResultSMSInfoPago</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDRESULTSMSINFOPAGO = "Resultadoenvio SMS info pago";

    /** <code>solicitudResultSMSInfoPago</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDRESULTSMSINFOPAGO = "";
    /** Agents allowed to view the attribute solicitudResultSMSInfoPago **/
    public static final String SOLICITUDRESULTSMSINFOPAGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudFechaCompletada)
    /** <code>solicitudFechaCompletada</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDFECHACOMPLETADA = "Clas_1431957012480960Atr_113_Alias";
    /** <code>solicitudFechaCompletada</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDFECHACOMPLETADA = "solicitudFechaCompletada";
    /** <code>solicitudFechaCompletada</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDFECHACOMPLETADA = "Fecha Marca Completada";

    /** <code>solicitudFechaCompletada</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDFECHACOMPLETADA = "";
    /** Agents allowed to view the attribute solicitudFechaCompletada **/
    public static final String SOLICITUDFECHACOMPLETADA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudFechaUltimoDoc)
    /** <code>solicitudFechaUltimoDoc</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDFECHAULTIMODOC = "Clas_1431957012480960Atr_114_Alias";
    /** <code>solicitudFechaUltimoDoc</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDFECHAULTIMODOC = "solicitudFechaUltimoDoc";
    /** <code>solicitudFechaUltimoDoc</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDFECHAULTIMODOC = "Fecha último documento";

    /** <code>solicitudFechaUltimoDoc</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDFECHAULTIMODOC = "";
    /** Agents allowed to view the attribute solicitudFechaUltimoDoc **/
    public static final String SOLICITUDFECHAULTIMODOC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudPrioridad)
    /** <code>solicitudPrioridad</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDPRIORIDAD = "Clas_1431957012480960Atr_115_Alias";
    /** <code>solicitudPrioridad</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDPRIORIDAD = "solicitudPrioridad";
    /** <code>solicitudPrioridad</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDPRIORIDAD = "Prioridad";

    /** <code>solicitudPrioridad</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDPRIORIDAD = "";
    /** Agents allowed to view the attribute solicitudPrioridad **/
    public static final String SOLICITUDPRIORIDAD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudFechaTerminada)
    /** <code>solicitudFechaTerminada</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDFECHATERMINADA = "Clas_1431957012480960Atr_116_Alias";
    /** <code>solicitudFechaTerminada</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDFECHATERMINADA = "solicitudFechaTerminada";
    /** <code>solicitudFechaTerminada</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDFECHATERMINADA = "Fecha Terminada";

    /** <code>solicitudFechaTerminada</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDFECHATERMINADA = "";
    /** Agents allowed to view the attribute solicitudFechaTerminada **/
    public static final String SOLICITUDFECHATERMINADA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudFechaFUG)
    /** <code>solicitudFechaFUG</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDFECHAFUG = "Clas_1431957012480960Atr_117_Alias";
    /** <code>solicitudFechaFUG</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDFECHAFUG = "solicitudFechaFUG";
    /** <code>solicitudFechaFUG</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDFECHAFUG = "Fecha Última Gestión";

    /** <code>solicitudFechaFUG</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDFECHAFUG = "";
    /** Agents allowed to view the attribute solicitudFechaFUG **/
    public static final String SOLICITUDFECHAFUG_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudFechaFA)
    /** <code>solicitudFechaFA</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDFECHAFA = "Clas_1431957012480960Atr_118_Alias";
    /** <code>solicitudFechaFA</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDFECHAFA = "solicitudFechaFA";
    /** <code>solicitudFechaFA</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDFECHAFA = "Fecha FA";

    /** <code>solicitudFechaFA</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDFECHAFA = "";
    /** Agents allowed to view the attribute solicitudFechaFA **/
    public static final String SOLICITUDFECHAFA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudFechaFAAM)
    /** <code>solicitudFechaFAAM</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDFECHAFAAM = "Clas_1431957012480960Atr_119_Alias";
    /** <code>solicitudFechaFAAM</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDFECHAFAAM = "solicitudFechaFAAM";
    /** <code>solicitudFechaFAAM</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDFECHAFAAM = "Fecha FAAM";

    /** <code>solicitudFechaFAAM</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDFECHAFAAM = "";
    /** Agents allowed to view the attribute solicitudFechaFAAM **/
    public static final String SOLICITUDFECHAFAAM_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudSemaforoGrabAse)
    /** <code>solicitudSemaforoGrabAse</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDSEMAFOROGRABASE = "Clas_1431957012480960Atr_120_Alias";
    /** <code>solicitudSemaforoGrabAse</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDSEMAFOROGRABASE = "solicitudSemaforoGrabAse";
    /** <code>solicitudSemaforoGrabAse</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDSEMAFOROGRABASE = "Semáforo Grab. Afiliaciones/Asesor";

    /** <code>solicitudSemaforoGrabAse</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDSEMAFOROGRABASE = "";
    /** Agents allowed to view the attribute solicitudSemaforoGrabAse **/
    public static final String SOLICITUDSEMAFOROGRABASE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudSemaforoAreaMed)
    /** <code>solicitudSemaforoAreaMed</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDSEMAFOROAREAMED = "Clas_1431957012480960Atr_121_Alias";
    /** <code>solicitudSemaforoAreaMed</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDSEMAFOROAREAMED = "solicitudSemaforoAreaMed";
    /** <code>solicitudSemaforoAreaMed</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDSEMAFOROAREAMED = "Semáforo Área Médica";

    /** <code>solicitudSemaforoAreaMed</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDSEMAFOROAREAMED = "";
    /** Agents allowed to view the attribute solicitudSemaforoAreaMed **/
    public static final String SOLICITUDSEMAFOROAREAMED_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudEstadoDoc)
    /** <code>solicitudEstadoDoc</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDESTADODOC = "Clas_1431957012480960Atr_122_Alias";
    /** <code>solicitudEstadoDoc</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDESTADODOC = "solicitudEstadoDoc";
    /** <code>solicitudEstadoDoc</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDESTADODOC = "Estado documentación";

    /** <code>solicitudEstadoDoc</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDESTADODOC = "";
    /** Agents allowed to view the attribute solicitudEstadoDoc **/
    public static final String SOLICITUDESTADODOC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvSemaforoGrabAse)
    /** <code>solicituddrvSemaforoGrabAse</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVSEMAFOROGRABASE = "Clas_1431957012480960Atr_123_Alias";
    /** <code>solicituddrvSemaforoGrabAse</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVSEMAFOROGRABASE = "solicituddrvSemaforoGrabAse";
    /** <code>solicituddrvSemaforoGrabAse</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVSEMAFOROGRABASE = "Semáforo Grab. Afiliaciones/Asesor";

    /** <code>solicituddrvSemaforoGrabAse</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVSEMAFOROGRABASE = "";
    /** Agents allowed to view the attribute solicituddrvSemaforoGrabAse **/
    public static final String SOLICITUDDRVSEMAFOROGRABASE_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvSemaforoAreaMed)
    /** <code>solicituddrvSemaforoAreaMed</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVSEMAFOROAREAMED = "Clas_1431957012480960Atr_124_Alias";
    /** <code>solicituddrvSemaforoAreaMed</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVSEMAFOROAREAMED = "solicituddrvSemaforoAreaMed";
    /** <code>solicituddrvSemaforoAreaMed</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVSEMAFOROAREAMED = "Semáforo Área Médica";

    /** <code>solicituddrvSemaforoAreaMed</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVSEMAFOROAREAMED = "";
    /** Agents allowed to view the attribute solicituddrvSemaforoAreaMed **/
    public static final String SOLICITUDDRVSEMAFOROAREAMED_AGENTS = "Admin,SuperAdmin,AreaMedica,Gestor,MesaDeApoyo";
    // Attribute (solicitudDrvEstadoHomologado)
    /** <code>solicitudDrvEstadoHomologado</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVESTADOHOMOLOGADO = "Clas_1431957012480960Atr_125_Alias";
    /** <code>solicitudDrvEstadoHomologado</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVESTADOHOMOLOGADO = "solicitudDrvEstadoHomologado";
    /** <code>solicitudDrvEstadoHomologado</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVESTADOHOMOLOGADO = "Estado";

    /** <code>solicitudDrvEstadoHomologado</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVESTADOHOMOLOGADO = "";
    /** Agents allowed to view the attribute solicitudDrvEstadoHomologado **/
    public static final String SOLICITUDDRVESTADOHOMOLOGADO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvValidarDatosContratante)
    /** <code>solicituddrvValidarDatosContratante</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVVALIDARDATOSCONTRATANTE = "Clas_1431957012480960Atr_126_Alias";
    /** <code>solicituddrvValidarDatosContratante</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVVALIDARDATOSCONTRATANTE = "solicituddrvValidarDatosContratante";
    /** <code>solicituddrvValidarDatosContratante</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVVALIDARDATOSCONTRATANTE = "drvValidarDatosContratante";

    /** <code>solicituddrvValidarDatosContratante</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVVALIDARDATOSCONTRATANTE = "";
    /** Agents allowed to view the attribute solicituddrvValidarDatosContratante **/
    public static final String SOLICITUDDRVVALIDARDATOSCONTRATANTE_AGENTS = "Admin,SuperAdmin";
    // Attribute (solicitudEnvioCarnetFisico)
    /** <code>solicitudEnvioCarnetFisico</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDENVIOCARNETFISICO = "Clas_1431957012480960Atr_127_Alias";
    /** <code>solicitudEnvioCarnetFisico</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDENVIOCARNETFISICO = "solicitudEnvioCarnetFisico";
    /** <code>solicitudEnvioCarnetFisico</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDENVIOCARNETFISICO = "Envío carnet físico";

    /** <code>solicitudEnvioCarnetFisico</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDENVIOCARNETFISICO = "";
    /** Agents allowed to view the attribute solicitudEnvioCarnetFisico **/
    public static final String SOLICITUDENVIOCARNETFISICO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicituddrvTramitarEnLinea)
    /** <code>solicituddrvTramitarEnLinea</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDDRVTRAMITARENLINEA = "Clas_1431957012480960Atr_128_Alias";
    /** <code>solicituddrvTramitarEnLinea</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDDRVTRAMITARENLINEA = "solicituddrvTramitarEnLinea";
    /** <code>solicituddrvTramitarEnLinea</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDDRVTRAMITARENLINEA = "Tramitar en linea";

    /** <code>solicituddrvTramitarEnLinea</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDDRVTRAMITARENLINEA = "";
    /** Agents allowed to view the attribute solicituddrvTramitarEnLinea **/
    public static final String SOLICITUDDRVTRAMITARENLINEA_AGENTS = "SuperAdmin";

    // Attribute (Ae_solicitudes.aesolicitudesidsolicitud)
    /** <code>Ae_solicitudes.aesolicitudesidsolicitud</code> identification attribute name. */
    public static final String ATTR_NAME_AE_SOLICITUDES_AESOLICITUDESIDSOLICITUD = "aesolicitudes.aesolicitudesidsolicitud";

    // Field (id_solicitud)
    /** <code>id_solicitud</code> field name. */
    public static final String FLD_AESOLICITUDESIDSOLICITUD = "id_solicitud";    
    /** <code>Ae_solicitudes.aesolicitudesidsolicitud</code> attribute field name. */
    public static final String ATTR_FIELD_AE_SOLICITUDES_AESOLICITUDESIDSOLICITUD = "aesolicitudesidsolicitud";
    // Field (Identificador)
    /** <code>Identificador</code> field name. */
    public static final String FLD_PERSONAIDENTIFICADOR = "Identificador";    
    /** <code>ContratantePersona.personaIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_CONTRATANTEPERSONA_PERSONAIDENTIFICADOR = "personaIdentificador";
    // Field (TitularPersona_Identificador)
    /** <code>TitularPersona_Identificador</code> field name. */
    public static final String FLD_PERSONATITULARPERSONAIDENTIFICADOR = "TitularPersona_Identificador";    
    /** <code>TitularPersona.personaIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_TITULARPERSONA_PERSONAIDENTIFICADOR = "personaTitularPersonaIdentificador";
    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_GRUPOASOCIADOCODIGO = "Codigo";    
    /** <code>GrupoAsociado.grupoAsociadoCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_GRUPOASOCIADO_GRUPOASOCIADOCODIGO = "grupoAsociadoCodigo";
    // Field (Id)
    /** <code>Id</code> field name. */
    public static final String FLD_FUNCIONARIOID = "Id";    
    /** <code>Agente.funcionarioId</code> attribute field name. */
    public static final String ATTR_FIELD_AGENTE_FUNCIONARIOID = "funcionarioId";
    // Field (FormaPago_Codigo)
    /** <code>FormaPago_Codigo</code> field name. */
    public static final String FLD_FORMAPAGOFORMAPAGOCODIGO = "FormaPago_Codigo";    
    /** <code>FormaPago.formaPagoCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_FORMAPAGO_FORMAPAGOCODIGO = "formaPagoFormaPagoCodigo";
    // Field (Periodicidad_Codigo)
    /** <code>Periodicidad_Codigo</code> field name. */
    public static final String FLD_PERIODICIDADPERIODICIDADCODIGO = "Periodicidad_Codigo";    
    /** <code>Periodicidad.periodicidadCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_PERIODICIDAD_PERIODICIDADCODIGO = "periodicidadPeriodicidadCodigo";
    // Field (ContratoC_ID)
    /** <code>ContratoC_ID</code> field name. */
    public static final String FLD_CONTRATOCCONTRATOCID = "ContratoC_ID";    
    /** <code>ContratoC.contratoCID</code> attribute field name. */
    public static final String ATTR_FIELD_CONTRATOC_CONTRATOCID = "contratoCContratoCID";
    // Field (UsrAreaMedica_Id)
    /** <code>UsrAreaMedica_Id</code> field name. */
    public static final String FLD_FUNCIONARIOUSRAREAMEDICAID = "UsrAreaMedica_Id";    
    /** <code>UsrAreaMedica.funcionarioId</code> attribute field name. */
    public static final String ATTR_FIELD_USRAREAMEDICA_FUNCIONARIOID = "funcionarioUsrAreaMedicaId";
    // Field (TipoFactura_Codigo)
    /** <code>TipoFactura_Codigo</code> field name. */
    public static final String FLD_TIPOFACTURATIPOFACTURACODIGO = "TipoFactura_Codigo";    
    /** <code>TipoFactura_Codigo</code> field length. */
    public static final int FLD_TIPOFACTURATIPOFACTURACODIGOLENGTH = 20;
    /** <code>TipoFactura.tipoFacturaCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_TIPOFACTURA_TIPOFACTURACODIGO = "tipoFacturaTipoFacturaCodigo";
    // Field (UsrAfiliacion_Id)
    /** <code>UsrAfiliacion_Id</code> field name. */
    public static final String FLD_FUNCIONARIOUSRAFILIACIONID = "UsrAfiliacion_Id";    
    /** <code>UsrAfiliacion.funcionarioId</code> attribute field name. */
    public static final String ATTR_FIELD_USRAFILIACION_FUNCIONARIOID = "funcionarioUsrAfiliacionId";
    // Field (NumRadicado)
    /** <code>NumRadicado</code> field name. */
    public static final String FLD_SOLICITUDNUMRADICADO = "NumRadicado";    
    /** <code>solicitudNumRadicado</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNUMRADICADO = "solicitudNumRadicado";
    // Field (Tramite)
    /** <code>Tramite</code> field name. */
    public static final String FLD_SOLICITUDTRAMITE = "Tramite";    
    /** <code>solicitudTramite</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDTRAMITE = "solicitudTramite";
    // Field (NumContrato)
    /** <code>NumContrato</code> field name. */
    public static final String FLD_SOLICITUDNUMCONTRATO = "NumContrato";    
    /** <code>NumContrato</code> field length. */
    public static final int FLD_SOLICITUDNUMCONTRATOLENGTH = 50;
    /** <code>solicitudNumContrato</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNUMCONTRATO = "solicitudNumContrato";
    // Field (FInicioContrato)
    /** <code>FInicioContrato</code> field name. */
    public static final String FLD_SOLICITUDFINICIOCONTRATO = "FInicioContrato";    
    /** <code>solicitudFInicioContrato</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDFINICIOCONTRATO = "solicitudFInicioContrato";
    // Field (EsTraslado)
    /** <code>EsTraslado</code> field name. */
    public static final String FLD_SOLICITUDESTRASLADO = "EsTraslado";    
    /** <code>solicitudEsTraslado</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDESTRASLADO = "solicitudEsTraslado";
    // Field (tipoContrato)
    /** <code>tipoContrato</code> field name. */
    public static final String FLD_SOLICITUDTIPOCONTRATO = "tipoContrato";    
    /** <code>solicitudtipoContrato</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDTIPOCONTRATO = "solicitudtipoContrato";
    // Field (codigoSucursalRad)
    /** <code>codigoSucursalRad</code> field name. */
    public static final String FLD_SOLICITUDCODIGOSUCURSALRAD = "codigoSucursalRad";    
    /** <code>codigoSucursalRad</code> field length. */
    public static final int FLD_SOLICITUDCODIGOSUCURSALRADLENGTH = 200;
    /** <code>solicitudcodigoSucursalRad</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDCODIGOSUCURSALRAD = "solicitudcodigoSucursalRad";
    // Field (contratoConFirma)
    /** <code>contratoConFirma</code> field name. */
    public static final String FLD_SOLICITUDCONTRATOCONFIRMA = "contratoConFirma";    
    /** <code>solicitudcontratoConFirma</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDCONTRATOCONFIRMA = "solicitudcontratoConFirma";
    // Field (observacions)
    /** <code>observacions</code> field name. */
    public static final String FLD_SOLICITUDOBSERVACIONS = "observacions";    
    /** <code>observacions</code> field length. */
    public static final int FLD_SOLICITUDOBSERVACIONSLENGTH = 700;
    /** <code>solicitudobservacions</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDOBSERVACIONS = "solicitudobservacions";
    // Field (exentoIVA)
    /** <code>exentoIVA</code> field name. */
    public static final String FLD_SOLICITUDEXENTOIVA = "exentoIVA";    
    /** <code>exentoIVA</code> field length. */
    public static final int FLD_SOLICITUDEXENTOIVALENGTH = 50;
    /** <code>solicitudexentoIVA</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDEXENTOIVA = "solicitudexentoIVA";
    // Field (valorCuota)
    /** <code>valorCuota</code> field name. */
    public static final String FLD_SOLICITUDVALORCUOTA = "valorCuota";    
    /** <code>solicitudvalorCuota</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDVALORCUOTA = "solicitudvalorCuota";
    // Field (valorDtoComercialSim)
    /** <code>valorDtoComercialSim</code> field name. */
    public static final String FLD_SOLICITUDVALORDTOCOMERCIALSIM = "valorDtoComercialSim";    
    /** <code>solicitudvalorDtoComercialSim</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDVALORDTOCOMERCIALSIM = "solicitudvalorDtoComercialSim";
    // Field (ValorCuotaInscrip)
    /** <code>ValorCuotaInscrip</code> field name. */
    public static final String FLD_SOLICITUDVALORCUOTAINSCRIP = "ValorCuotaInscrip";    
    /** <code>solicitudValorCuotaInscrip</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDVALORCUOTAINSCRIP = "solicitudValorCuotaInscrip";
    // Field (ValorDtoFinanciero)
    /** <code>ValorDtoFinanciero</code> field name. */
    public static final String FLD_SOLICITUDVALORDTOFINANCIERO = "ValorDtoFinanciero";    
    /** <code>solicitudValorDtoFinanciero</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDVALORDTOFINANCIERO = "solicitudValorDtoFinanciero";
    // Field (ValorDtoComercial)
    /** <code>ValorDtoComercial</code> field name. */
    public static final String FLD_SOLICITUDVALORDTOCOMERCIAL = "ValorDtoComercial";    
    /** <code>solicitudValorDtoComercial</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDVALORDTOCOMERCIAL = "solicitudValorDtoComercial";
    // Field (datosPagoOK)
    /** <code>datosPagoOK</code> field name. */
    public static final String FLD_SOLICITUDDATOSPAGOOK = "datosPagoOK";    
    /** <code>solicituddatosPagoOK</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDDATOSPAGOOK = "solicituddatosPagoOK";
    // Field (valorCuotaPeriodoC)
    /** <code>valorCuotaPeriodoC</code> field name. */
    public static final String FLD_SOLICITUDVALORCUOTAPERIODOC = "valorCuotaPeriodoC";    
    /** <code>solicitudvalorCuotaPeriodoC</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDVALORCUOTAPERIODOC = "solicitudvalorCuotaPeriodoC";
    // Field (descuentoComercialC)
    /** <code>descuentoComercialC</code> field name. */
    public static final String FLD_SOLICITUDDESCUENTOCOMERCIALC = "descuentoComercialC";    
    /** <code>solicituddescuentoComercialC</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDDESCUENTOCOMERCIALC = "solicituddescuentoComercialC";
    // Field (IVAC)
    /** <code>IVAC</code> field name. */
    public static final String FLD_SOLICITUDIVAC = "IVAC";    
    /** <code>solicitudIVAC</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDIVAC = "solicitudIVAC";
    // Field (descuentoFinancieroC)
    /** <code>descuentoFinancieroC</code> field name. */
    public static final String FLD_SOLICITUDDESCUENTOFINANCIEROC = "descuentoFinancieroC";    
    /** <code>solicituddescuentoFinancieroC</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDDESCUENTOFINANCIEROC = "solicituddescuentoFinancieroC";
    // Field (TieneDifLiquidacion)
    /** <code>TieneDifLiquidacion</code> field name. */
    public static final String FLD_SOLICITUDTIENEDIFLIQUIDACION = "TieneDifLiquidacion";    
    /** <code>solicitudTieneDifLiquidacion</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDTIENEDIFLIQUIDACION = "solicitudTieneDifLiquidacion";
    // Field (UsuariosValidados)
    /** <code>UsuariosValidados</code> field name. */
    public static final String FLD_SOLICITUDUSUARIOSVALIDADOS = "UsuariosValidados";    
    /** <code>solicitudUsuariosValidados</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDUSUARIOSVALIDADOS = "solicitudUsuariosValidados";
    // Field (NumContratoInclusion)
    /** <code>NumContratoInclusion</code> field name. */
    public static final String FLD_SOLICITUDNUMCONTRATOINCLUSION = "NumContratoInclusion";    
    /** <code>NumContratoInclusion</code> field length. */
    public static final int FLD_SOLICITUDNUMCONTRATOINCLUSIONLENGTH = 50;
    /** <code>solicitudNumContratoInclusion</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNUMCONTRATOINCLUSION = "solicitudNumContratoInclusion";
    // Field (NumFamilia)
    /** <code>NumFamilia</code> field name. */
    public static final String FLD_SOLICITUDNUMFAMILIA = "NumFamilia";    
    /** <code>NumFamilia</code> field length. */
    public static final int FLD_SOLICITUDNUMFAMILIALENGTH = 5;
    /** <code>solicitudNumFamilia</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNUMFAMILIA = "solicitudNumFamilia";
    // Field (EmailURLPagoEnviado)
    /** <code>EmailURLPagoEnviado</code> field name. */
    public static final String FLD_SOLICITUDEMAILURLPAGOENVIADO = "EmailURLPagoEnviado";    
    /** <code>EmailURLPagoEnviado</code> field length. */
    public static final int FLD_SOLICITUDEMAILURLPAGOENVIADOLENGTH = 999;
    /** <code>solicitudEmailURLPagoEnviado</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDEMAILURLPAGOENVIADO = "solicitudEmailURLPagoEnviado";
    // Field (EmailDocuEnviado)
    /** <code>EmailDocuEnviado</code> field name. */
    public static final String FLD_SOLICITUDEMAILDOCUENVIADO = "EmailDocuEnviado";    
    /** <code>EmailDocuEnviado</code> field length. */
    public static final int FLD_SOLICITUDEMAILDOCUENVIADOLENGTH = 999;
    /** <code>solicitudEmailDocuEnviado</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDEMAILDOCUENVIADO = "solicitudEmailDocuEnviado";
    // Field (DocsEnviados)
    /** <code>DocsEnviados</code> field name. */
    public static final String FLD_SOLICITUDDOCSENVIADOS = "DocsEnviados";    
    /** <code>solicitudDocsEnviados</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDDOCSENVIADOS = "solicitudDocsEnviados";
    // Field (codDirector)
    /** <code>codDirector</code> field name. */
    public static final String FLD_SOLICITUDCODDIRECTOR = "codDirector";    
    /** <code>codDirector</code> field length. */
    public static final int FLD_SOLICITUDCODDIRECTORLENGTH = 50;
    /** <code>solicitudcodDirector</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDCODDIRECTOR = "solicitudcodDirector";
    // Field (valorCuotaBrutaC)
    /** <code>valorCuotaBrutaC</code> field name. */
    public static final String FLD_SOLICITUDVALORCUOTABRUTAC = "valorCuotaBrutaC";    
    /** <code>solicitudvalorCuotaBrutaC</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDVALORCUOTABRUTAC = "solicitudvalorCuotaBrutaC";
    // Field (CodTarifa)
    /** <code>CodTarifa</code> field name. */
    public static final String FLD_SOLICITUDCODTARIFA = "CodTarifa";    
    /** <code>CodTarifa</code> field length. */
    public static final int FLD_SOLICITUDCODTARIFALENGTH = 50;
    /** <code>solicitudCodTarifa</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDCODTARIFA = "solicitudCodTarifa";
    // Field (Completada)
    /** <code>Completada</code> field name. */
    public static final String FLD_SOLICITUDCOMPLETADA = "Completada";    
    /** <code>solicitudCompletada</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDCOMPLETADA = "solicitudCompletada";
    // Field (Estado)
    /** <code>Estado</code> field name. */
    public static final String FLD_SOLICITUDESTADO = "Estado";    
    /** <code>solicitudEstado</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDESTADO = "solicitudEstado";
    // Field (FIniVigContInc)
    /** <code>FIniVigContInc</code> field name. */
    public static final String FLD_SOLICITUDFINIVIGCONTINC = "FIniVigContInc";    
    /** <code>solicitudFIniVigContInc</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDFINIVIGCONTINC = "solicitudFIniVigContInc";
    // Field (PorcentajeProrrateo)
    /** <code>PorcentajeProrrateo</code> field name. */
    public static final String FLD_SOLICITUDPORCENTAJEPRORRATEO = "PorcentajeProrrateo";    
    /** <code>solicitudPorcentajeProrrateo</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDPORCENTAJEPRORRATEO = "solicitudPorcentajeProrrateo";
    // Field (GrupoDelCORE)
    /** <code>GrupoDelCORE</code> field name. */
    public static final String FLD_SOLICITUDGRUPODELCORE = "GrupoDelCORE";    
    /** <code>solicitudGrupoDelCORE</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDGRUPODELCORE = "solicitudGrupoDelCORE";
    // Field (TipoFacturaCORE)
    /** <code>TipoFacturaCORE</code> field name. */
    public static final String FLD_SOLICITUDTIPOFACTURACORE = "TipoFacturaCORE";    
    /** <code>TipoFacturaCORE</code> field length. */
    public static final int FLD_SOLICITUDTIPOFACTURACORELENGTH = 20;
    /** <code>solicitudTipoFacturaCORE</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDTIPOFACTURACORE = "solicitudTipoFacturaCORE";
    // Field (ResultSMSInfoPago)
    /** <code>ResultSMSInfoPago</code> field name. */
    public static final String FLD_SOLICITUDRESULTSMSINFOPAGO = "ResultSMSInfoPago";    
    /** <code>ResultSMSInfoPago</code> field length. */
    public static final int FLD_SOLICITUDRESULTSMSINFOPAGOLENGTH = 999;
    /** <code>solicitudResultSMSInfoPago</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDRESULTSMSINFOPAGO = "solicitudResultSMSInfoPago";
    // Field (FechaCompletada)
    /** <code>FechaCompletada</code> field name. */
    public static final String FLD_SOLICITUDFECHACOMPLETADA = "FechaCompletada";    
    /** <code>solicitudFechaCompletada</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDFECHACOMPLETADA = "solicitudFechaCompletada";
    // Field (FechaUltimoDoc)
    /** <code>FechaUltimoDoc</code> field name. */
    public static final String FLD_SOLICITUDFECHAULTIMODOC = "FechaUltimoDoc";    
    /** <code>solicitudFechaUltimoDoc</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDFECHAULTIMODOC = "solicitudFechaUltimoDoc";
    // Field (Prioridad)
    /** <code>Prioridad</code> field name. */
    public static final String FLD_SOLICITUDPRIORIDAD = "Prioridad";    
    /** <code>solicitudPrioridad</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDPRIORIDAD = "solicitudPrioridad";
    // Field (FechaTerminada)
    /** <code>FechaTerminada</code> field name. */
    public static final String FLD_SOLICITUDFECHATERMINADA = "FechaTerminada";    
    /** <code>solicitudFechaTerminada</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDFECHATERMINADA = "solicitudFechaTerminada";
    // Field (FechaFUG)
    /** <code>FechaFUG</code> field name. */
    public static final String FLD_SOLICITUDFECHAFUG = "FechaFUG";    
    /** <code>solicitudFechaFUG</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDFECHAFUG = "solicitudFechaFUG";
    // Field (FechaFA)
    /** <code>FechaFA</code> field name. */
    public static final String FLD_SOLICITUDFECHAFA = "FechaFA";    
    /** <code>solicitudFechaFA</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDFECHAFA = "solicitudFechaFA";
    // Field (FechaFAAM)
    /** <code>FechaFAAM</code> field name. */
    public static final String FLD_SOLICITUDFECHAFAAM = "FechaFAAM";    
    /** <code>solicitudFechaFAAM</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDFECHAFAAM = "solicitudFechaFAAM";
    // Field (SemaforoGrabAse)
    /** <code>SemaforoGrabAse</code> field name. */
    public static final String FLD_SOLICITUDSEMAFOROGRABASE = "SemaforoGrabAse";    
    /** <code>solicitudSemaforoGrabAse</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDSEMAFOROGRABASE = "solicitudSemaforoGrabAse";
    // Field (SemaforoAreaMed)
    /** <code>SemaforoAreaMed</code> field name. */
    public static final String FLD_SOLICITUDSEMAFOROAREAMED = "SemaforoAreaMed";    
    /** <code>solicitudSemaforoAreaMed</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDSEMAFOROAREAMED = "solicitudSemaforoAreaMed";
    // Field (EstadoDoc)
    /** <code>EstadoDoc</code> field name. */
    public static final String FLD_SOLICITUDESTADODOC = "EstadoDoc";    
    /** <code>solicitudEstadoDoc</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDESTADODOC = "solicitudEstadoDoc";
    // Field (EnvioCarnetFisico)
    /** <code>EnvioCarnetFisico</code> field name. */
    public static final String FLD_SOLICITUDENVIOCARNETFISICO = "EnvioCarnetFisico";    
    /** <code>solicitudEnvioCarnetFisico</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDENVIOCARNETFISICO = "solicitudEnvioCarnetFisico";

    // Component role (Aesolicitudes)
    /** <code>Aesolicitudes</code> role id. */
    public static final String ROLE_ID_AESOLICITUDES = "Agr_1431957143552663_Alias";
    /** <code>Aesolicitudes</code> role name. */
    public static final String ROLE_NAME_AESOLICITUDES = "aesolicitudes";
    /** <code>Aesolicitudes</code> role alias. */
    public static final String ROLE_ALIAS_AESOLICITUDES = "Solicitud base";

    /** <code>Aesolicitudes</code> inverse role name. */
    public static final String ROLE_INVNAME_AESOLICITUDES = AesolicitudesConstants.ROLE_NAME_SOLICITUD;
    /** <code>Aesolicitudes</code> role facet sequence. */
    public static final String PATH_FACETS_AESOLICITUDES = "";
    /** <code>Aesolicitudes</code> role target class. */
    public static final String ROLE_TARGET_AESOLICITUDES = AesolicitudesConstants.CLASS_NAME;

    /** Agents allowed to navigate through Aesolicitudes **/
    public static final String AESOLICITUDES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (ContratantePersona)
    /** <code>ContratantePersona</code> role id. */
    public static final String ROLE_ID_CONTRATANTEPERSONA = "Agr_1431959109632733_Alias";
    /** <code>ContratantePersona</code> role name. */
    public static final String ROLE_NAME_CONTRATANTEPERSONA = "contratantePersona";
    /** <code>ContratantePersona</code> role alias. */
    public static final String ROLE_ALIAS_CONTRATANTEPERSONA = "Contratante";

    /** <code>ContratantePersona</code> inverse role name. */
    public static final String ROLE_INVNAME_CONTRATANTEPERSONA = PersonaConstants.ROLE_NAME_SOLICITUDESCONTRATANTE;
    /** <code>ContratantePersona</code> role facet sequence. */
    public static final String PATH_FACETS_CONTRATANTEPERSONA = "";
    /** <code>ContratantePersona</code> role target class. */
    public static final String ROLE_TARGET_CONTRATANTEPERSONA = PersonaConstants.CLASS_NAME;

    /** Agents allowed to navigate through ContratantePersona **/
    public static final String CONTRATANTEPERSONA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (TitularPersona)
    /** <code>TitularPersona</code> role id. */
    public static final String ROLE_ID_TITULARPERSONA = "Agr_1431965007872646_Alias";
    /** <code>TitularPersona</code> role name. */
    public static final String ROLE_NAME_TITULARPERSONA = "titularPersona";
    /** <code>TitularPersona</code> role alias. */
    public static final String ROLE_ALIAS_TITULARPERSONA = "Titular";

    /** <code>TitularPersona</code> inverse role name. */
    public static final String ROLE_INVNAME_TITULARPERSONA = PersonaConstants.ROLE_NAME_SOLICITUDESTITULAR;
    /** <code>TitularPersona</code> role facet sequence. */
    public static final String PATH_FACETS_TITULARPERSONA = "";
    /** <code>TitularPersona</code> role target class. */
    public static final String ROLE_TARGET_TITULARPERSONA = PersonaConstants.CLASS_NAME;

    /** Agents allowed to navigate through TitularPersona **/
    public static final String TITULARPERSONA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (GrupoAsociado)
    /** <code>GrupoAsociado</code> role id. */
    public static final String ROLE_ID_GRUPOASOCIADO = "Agr_1432638324736934_Alias";
    /** <code>GrupoAsociado</code> role name. */
    public static final String ROLE_NAME_GRUPOASOCIADO = "grupoAsociado";
    /** <code>GrupoAsociado</code> role alias. */
    public static final String ROLE_ALIAS_GRUPOASOCIADO = "Grupo asociado";

    /** <code>GrupoAsociado</code> inverse role name. */
    public static final String ROLE_INVNAME_GRUPOASOCIADO = GrupoAsociadoConstants.ROLE_NAME_SOLICITUDES;
    /** <code>GrupoAsociado</code> role facet sequence. */
    public static final String PATH_FACETS_GRUPOASOCIADO = "";
    /** <code>GrupoAsociado</code> role target class. */
    public static final String ROLE_TARGET_GRUPOASOCIADO = GrupoAsociadoConstants.CLASS_NAME;

    /** Agents allowed to navigate through GrupoAsociado **/
    public static final String GRUPOASOCIADO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Agente)
    /** <code>Agente</code> role id. */
    public static final String ROLE_ID_AGENTE = "Agr_1432638455808747_Alias";
    /** <code>Agente</code> role name. */
    public static final String ROLE_NAME_AGENTE = "agente";
    /** <code>Agente</code> role alias. */
    public static final String ROLE_ALIAS_AGENTE = "Agente";

    /** <code>Agente</code> inverse role name. */
    public static final String ROLE_INVNAME_AGENTE = FuncionarioConstants.ROLE_NAME_SOLICITUDES;
    /** <code>Agente</code> role facet sequence. */
    public static final String PATH_FACETS_AGENTE = "";
    /** <code>Agente</code> role target class. */
    public static final String ROLE_TARGET_AGENTE = FuncionarioConstants.CLASS_NAME;

    /** Agents allowed to navigate through Agente **/
    public static final String AGENTE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (FormaPago)
    /** <code>FormaPago</code> role id. */
    public static final String ROLE_ID_FORMAPAGO = "Agr_1432810422272649_Alias";
    /** <code>FormaPago</code> role name. */
    public static final String ROLE_NAME_FORMAPAGO = "formaPago";
    /** <code>FormaPago</code> role alias. */
    public static final String ROLE_ALIAS_FORMAPAGO = "Forma Pago";

    /** <code>FormaPago</code> inverse role name. */
    public static final String ROLE_INVNAME_FORMAPAGO = FormaPagoConstants.ROLE_NAME_SOLICITUDES;
    /** <code>FormaPago</code> role facet sequence. */
    public static final String PATH_FACETS_FORMAPAGO = "";
    /** <code>FormaPago</code> role target class. */
    public static final String ROLE_TARGET_FORMAPAGO = FormaPagoConstants.CLASS_NAME;

    /** Agents allowed to navigate through FormaPago **/
    public static final String FORMAPAGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Periodicidad)
    /** <code>Periodicidad</code> role id. */
    public static final String ROLE_ID_PERIODICIDAD = "Agr_1432812257280358_Alias";
    /** <code>Periodicidad</code> role name. */
    public static final String ROLE_NAME_PERIODICIDAD = "periodicidad";
    /** <code>Periodicidad</code> role alias. */
    public static final String ROLE_ALIAS_PERIODICIDAD = "Periodicidad pago";

    /** <code>Periodicidad</code> inverse role name. */
    public static final String ROLE_INVNAME_PERIODICIDAD = PeriodicidadConstants.ROLE_NAME_SOLICITUDES;
    /** <code>Periodicidad</code> role facet sequence. */
    public static final String PATH_FACETS_PERIODICIDAD = "";
    /** <code>Periodicidad</code> role target class. */
    public static final String ROLE_TARGET_PERIODICIDAD = PeriodicidadConstants.CLASS_NAME;

    /** Agents allowed to navigate through Periodicidad **/
    public static final String PERIODICIDAD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (ContratoC)
    /** <code>ContratoC</code> role id. */
    public static final String ROLE_ID_CONTRATOC = "Agr_1438351622144462_Alias";
    /** <code>ContratoC</code> role name. */
    public static final String ROLE_NAME_CONTRATOC = "contratoC";
    /** <code>ContratoC</code> role alias. */
    public static final String ROLE_ALIAS_CONTRATOC = "Contrato CORE";

    /** <code>ContratoC</code> inverse role name. */
    public static final String ROLE_INVNAME_CONTRATOC = ContratoCConstants.ROLE_NAME_SOLICITUD;
    /** <code>ContratoC</code> role facet sequence. */
    public static final String PATH_FACETS_CONTRATOC = "";
    /** <code>ContratoC</code> role target class. */
    public static final String ROLE_TARGET_CONTRATOC = ContratoCConstants.CLASS_NAME;

    /** Agents allowed to navigate through ContratoC **/
    public static final String CONTRATOC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (UsrAreaMedica)
    /** <code>UsrAreaMedica</code> role id. */
    public static final String ROLE_ID_USRAREAMEDICA = "Agr_1517848625152064_Alias";
    /** <code>UsrAreaMedica</code> role name. */
    public static final String ROLE_NAME_USRAREAMEDICA = "usrAreaMedica";
    /** <code>UsrAreaMedica</code> role alias. */
    public static final String ROLE_ALIAS_USRAREAMEDICA = "Usr. Area Médica";

    /** <code>UsrAreaMedica</code> inverse role name. */
    public static final String ROLE_INVNAME_USRAREAMEDICA = AreaMedicaConstants.ROLE_NAME_SOLICITUDESARME;
    /** <code>UsrAreaMedica</code> role facet sequence. */
    public static final String PATH_FACETS_USRAREAMEDICA = "";
    /** <code>UsrAreaMedica</code> role target class. */
    public static final String ROLE_TARGET_USRAREAMEDICA = AreaMedicaConstants.CLASS_NAME;

    /** Agents allowed to navigate through UsrAreaMedica **/
    public static final String USRAREAMEDICA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (TipoFactura)
    /** <code>TipoFactura</code> role id. */
    public static final String ROLE_ID_TIPOFACTURA = "Agr_1547133517824671_Alias";
    /** <code>TipoFactura</code> role name. */
    public static final String ROLE_NAME_TIPOFACTURA = "tipoFactura";
    /** <code>TipoFactura</code> role alias. */
    public static final String ROLE_ALIAS_TIPOFACTURA = "Tipo Factura";

    /** <code>TipoFactura</code> inverse role name. */
    public static final String ROLE_INVNAME_TIPOFACTURA = TipoFacturaConstants.ROLE_NAME_SOLICITUDES;
    /** <code>TipoFactura</code> role facet sequence. */
    public static final String PATH_FACETS_TIPOFACTURA = "";
    /** <code>TipoFactura</code> role target class. */
    public static final String ROLE_TARGET_TIPOFACTURA = TipoFacturaConstants.CLASS_NAME;

    /** Agents allowed to navigate through TipoFactura **/
    public static final String TIPOFACTURA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (UsrAfiliacion)
    /** <code>UsrAfiliacion</code> role id. */
    public static final String ROLE_ID_USRAFILIACION = "Agr_1586857246720601_Alias";
    /** <code>UsrAfiliacion</code> role name. */
    public static final String ROLE_NAME_USRAFILIACION = "usrAfiliacion";
    /** <code>UsrAfiliacion</code> role alias. */
    public static final String ROLE_ALIAS_USRAFILIACION = "Usr. Afiliación";

    /** <code>UsrAfiliacion</code> inverse role name. */
    public static final String ROLE_INVNAME_USRAFILIACION = FuncionarioConstants.ROLE_NAME_SOLICITUDESAFILIACION;
    /** <code>UsrAfiliacion</code> role facet sequence. */
    public static final String PATH_FACETS_USRAFILIACION = "";
    /** <code>UsrAfiliacion</code> role target class. */
    public static final String ROLE_TARGET_USRAFILIACION = FuncionarioConstants.CLASS_NAME;

    /** Agents allowed to navigate through UsrAfiliacion **/
    public static final String USRAFILIACION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Compound role (Direccion)
    /** <code>Direccion</code> role id. */
    public static final String ROLE_ID_DIRECCION = "Agr_1432653660160268_Alias";
    /** <code>Direccion</code> role name. */
    public static final String ROLE_NAME_DIRECCION = "direccion";
    /** <code>Contrato</code> role alias. */
    public static final String ROLE_ALIAS_DIRECCION = "Dirección";


    /** <code>Direccion</code> inverse role name. */
    public static final String ROLE_INVNAME_DIRECCION = DireccionConstants.ROLE_NAME_CONTRATO;
    /** <code>Direccion</code> role facet sequence. */
    public static final String PATH_FACETS_DIRECCION = "";
    /** <code>Direccion</code> role target class. */
    public static final String ROLE_TARGET_DIRECCION = DireccionConstants.CLASS_NAME;
    /** Agents allowed to navigate through Direccion **/
    public static final String DIRECCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (ProteccionDatos)
    /** <code>ProteccionDatos</code> role id. */
    public static final String ROLE_ID_PROTECCIONDATOS = "Agr_1432228855808502_Alias";
    /** <code>ProteccionDatos</code> role name. */
    public static final String ROLE_NAME_PROTECCIONDATOS = "proteccionDatos";
    /** <code>Solicitud</code> role alias. */
    public static final String ROLE_ALIAS_PROTECCIONDATOS = "Protección Datos";


    /** <code>ProteccionDatos</code> inverse role name. */
    public static final String ROLE_INVNAME_PROTECCIONDATOS = ProteccionDatosConstants.ROLE_NAME_SOLICITUD;
    /** <code>ProteccionDatos</code> role facet sequence. */
    public static final String PATH_FACETS_PROTECCIONDATOS = "";
    /** <code>ProteccionDatos</code> role target class. */
    public static final String ROLE_TARGET_PROTECCIONDATOS = ProteccionDatosConstants.CLASS_NAME;
    /** Agents allowed to navigate through ProteccionDatos **/
    public static final String PROTECCIONDATOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (Usuarios)
    /** <code>Usuarios</code> role id. */
    public static final String ROLE_ID_USUARIOS = "Agr_1432633868288544_Alias";
    /** <code>Usuarios</code> role name. */
    public static final String ROLE_NAME_USUARIOS = "usuarios";
    /** <code>Solicitud</code> role alias. */
    public static final String ROLE_ALIAS_USUARIOS = "Usuarios";


    /** <code>Usuarios</code> inverse role name. */
    public static final String ROLE_INVNAME_USUARIOS = UsuarioConstants.ROLE_NAME_SOLICITUD;
    /** <code>Usuarios</code> role facet sequence. */
    public static final String PATH_FACETS_USUARIOS = "";
    /** <code>Usuarios</code> role target class. */
    public static final String ROLE_TARGET_USUARIOS = UsuarioConstants.CLASS_NAME;
    /** Agents allowed to navigate through Usuarios **/
    public static final String USUARIOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (Contratante)
    /** <code>Contratante</code> role id. */
    public static final String ROLE_ID_CONTRATANTE = "Agr_1432812519424993_Alias";
    /** <code>Contratante</code> role name. */
    public static final String ROLE_NAME_CONTRATANTE = "contratante";
    /** <code>Solicitud</code> role alias. */
    public static final String ROLE_ALIAS_CONTRATANTE = "Contratante";


    /** <code>Contratante</code> inverse role name. */
    public static final String ROLE_INVNAME_CONTRATANTE = ContratanteConstants.ROLE_NAME_SOLICITUD;
    /** <code>Contratante</code> role facet sequence. */
    public static final String PATH_FACETS_CONTRATANTE = "";
    /** <code>Contratante</code> role target class. */
    public static final String ROLE_TARGET_CONTRATANTE = ContratanteConstants.CLASS_NAME;
    /** Agents allowed to navigate through Contratante **/
    public static final String CONTRATANTE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (Firma)
    /** <code>Firma</code> role id. */
    public static final String ROLE_ID_FIRMA = "Agr_1432994709504853_Alias";
    /** <code>Firma</code> role name. */
    public static final String ROLE_NAME_FIRMA = "firma";
    /** <code>Solicitud</code> role alias. */
    public static final String ROLE_ALIAS_FIRMA = "Firma";


    /** <code>Firma</code> inverse role name. */
    public static final String ROLE_INVNAME_FIRMA = FirmaConstants.ROLE_NAME_SOLICITUD;
    /** <code>Firma</code> role facet sequence. */
    public static final String PATH_FACETS_FIRMA = "";
    /** <code>Firma</code> role target class. */
    public static final String ROLE_TARGET_FIRMA = FirmaConstants.CLASS_NAME;
    /** Agents allowed to navigate through Firma **/
    public static final String FIRMA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (SegundaFirma)
    /** <code>SegundaFirma</code> role id. */
    public static final String ROLE_ID_SEGUNDAFIRMA = "Agr_1434052591616188_Alias";
    /** <code>SegundaFirma</code> role name. */
    public static final String ROLE_NAME_SEGUNDAFIRMA = "segundaFirma";
    /** <code>SolicitudSegunda</code> role alias. */
    public static final String ROLE_ALIAS_SEGUNDAFIRMA = "Segunda firma";


    /** <code>SegundaFirma</code> inverse role name. */
    public static final String ROLE_INVNAME_SEGUNDAFIRMA = FirmaConstants.ROLE_NAME_SOLICITUDSEGUNDA;
    /** <code>SegundaFirma</code> role facet sequence. */
    public static final String PATH_FACETS_SEGUNDAFIRMA = "";
    /** <code>SegundaFirma</code> role target class. */
    public static final String ROLE_TARGET_SEGUNDAFIRMA = FirmaConstants.CLASS_NAME;
    /** Agents allowed to navigate through SegundaFirma **/
    public static final String SEGUNDAFIRMA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (FirmaContratanteIncl)
    /** <code>FirmaContratanteIncl</code> role id. */
    public static final String ROLE_ID_FIRMACONTRATANTEINCL = "Agr_1547201806336247_Alias";
    /** <code>FirmaContratanteIncl</code> role name. */
    public static final String ROLE_NAME_FIRMACONTRATANTEINCL = "firmaContratanteIncl";
    /** <code>SolicitudContratante</code> role alias. */
    public static final String ROLE_ALIAS_FIRMACONTRATANTEINCL = "Firma Contratante Inclusion";


    /** <code>FirmaContratanteIncl</code> inverse role name. */
    public static final String ROLE_INVNAME_FIRMACONTRATANTEINCL = FirmaConstants.ROLE_NAME_SOLICITUDCONTRATANTE;
    /** <code>FirmaContratanteIncl</code> role facet sequence. */
    public static final String PATH_FACETS_FIRMACONTRATANTEINCL = "";
    /** <code>FirmaContratanteIncl</code> role target class. */
    public static final String ROLE_TARGET_FIRMACONTRATANTEINCL = FirmaConstants.CLASS_NAME;
    /** Agents allowed to navigate through FirmaContratanteIncl **/
    public static final String FIRMACONTRATANTEINCL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (UsuariosRegistrados)
    /** <code>UsuariosRegistrados</code> role id. */
    public static final String ROLE_ID_USUARIOSREGISTRADOS = "Agr_1433848250368960_Alias";
    /** <code>UsuariosRegistrados</code> role name. */
    public static final String ROLE_NAME_USUARIOSREGISTRADOS = "usuariosRegistrados";
    /** <code>Solicitud</code> role alias. */
    public static final String ROLE_ALIAS_USUARIOSREGISTRADOS = "Usuarios registrados";


    /** <code>UsuariosRegistrados</code> inverse role name. */
    public static final String ROLE_INVNAME_USUARIOSREGISTRADOS = UsuarioRegConstants.ROLE_NAME_SOLICITUD;
    /** <code>UsuariosRegistrados</code> role facet sequence. */
    public static final String PATH_FACETS_USUARIOSREGISTRADOS = "";
    /** <code>UsuariosRegistrados</code> role target class. */
    public static final String ROLE_TARGET_USUARIOSREGISTRADOS = UsuarioRegConstants.CLASS_NAME;
    /** Agents allowed to navigate through UsuariosRegistrados **/
    public static final String USUARIOSREGISTRADOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (Titular)
    /** <code>Titular</code> role id. */
    public static final String ROLE_ID_TITULAR = "Agr_1433869484032199_Alias";
    /** <code>Titular</code> role name. */
    public static final String ROLE_NAME_TITULAR = "titular";
    /** <code>Solicitud</code> role alias. */
    public static final String ROLE_ALIAS_TITULAR = "Titular";


    /** <code>Titular</code> inverse role name. */
    public static final String ROLE_INVNAME_TITULAR = TitularConstants.ROLE_NAME_SOLICITUD;
    /** <code>Titular</code> role facet sequence. */
    public static final String PATH_FACETS_TITULAR = "";
    /** <code>Titular</code> role target class. */
    public static final String ROLE_TARGET_TITULAR = TitularConstants.CLASS_NAME;
    /** Agents allowed to navigate through Titular **/
    public static final String TITULAR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (DocumentosGestor)
    /** <code>DocumentosGestor</code> role id. */
    public static final String ROLE_ID_DOCUMENTOSGESTOR = "Agr_1434446200832964_Alias";
    /** <code>DocumentosGestor</code> role name. */
    public static final String ROLE_NAME_DOCUMENTOSGESTOR = "documentosGestor";
    /** <code>Solicitud</code> role alias. */
    public static final String ROLE_ALIAS_DOCUMENTOSGESTOR = "Documentos gestor";


    /** <code>DocumentosGestor</code> inverse role name. */
    public static final String ROLE_INVNAME_DOCUMENTOSGESTOR = DocumentoGConstants.ROLE_NAME_SOLICITUD;
    /** <code>DocumentosGestor</code> role facet sequence. */
    public static final String PATH_FACETS_DOCUMENTOSGESTOR = "";
    /** <code>DocumentosGestor</code> role target class. */
    public static final String ROLE_TARGET_DOCUMENTOSGESTOR = DocumentoGConstants.CLASS_NAME;
    /** Agents allowed to navigate through DocumentosGestor **/
    public static final String DOCUMENTOSGESTOR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (ErroresWS)
    /** <code>ErroresWS</code> role id. */
    public static final String ROLE_ID_ERRORESWS = "Agr_1434561806336828_Alias";
    /** <code>ErroresWS</code> role name. */
    public static final String ROLE_NAME_ERRORESWS = "erroresWS";
    /** <code>Solicitud</code> role alias. */
    public static final String ROLE_ALIAS_ERRORESWS = "Errores";


    /** <code>ErroresWS</code> inverse role name. */
    public static final String ROLE_INVNAME_ERRORESWS = ErrorWSConstants.ROLE_NAME_SOLICITUD;
    /** <code>ErroresWS</code> role facet sequence. */
    public static final String PATH_FACETS_ERRORESWS = "";
    /** <code>ErroresWS</code> role target class. */
    public static final String ROLE_TARGET_ERRORESWS = ErrorWSConstants.CLASS_NAME;
    /** Agents allowed to navigate through ErroresWS **/
    public static final String ERRORESWS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (LogEstado)
    /** <code>LogEstado</code> role id. */
    public static final String ROLE_ID_LOGESTADO = "Agr_1497625264128168_Alias";
    /** <code>LogEstado</code> role name. */
    public static final String ROLE_NAME_LOGESTADO = "logEstado";
    /** <code>Solicitud</code> role alias. */
    public static final String ROLE_ALIAS_LOGESTADO = "Historico Estados";


    /** <code>LogEstado</code> inverse role name. */
    public static final String ROLE_INVNAME_LOGESTADO = LogEstadoConstants.ROLE_NAME_SOLICITUD;
    /** <code>LogEstado</code> role facet sequence. */
    public static final String PATH_FACETS_LOGESTADO = "";
    /** <code>LogEstado</code> role target class. */
    public static final String ROLE_TARGET_LOGESTADO = LogEstadoConstants.CLASS_NAME;
    /** Agents allowed to navigate through LogEstado **/
    public static final String LOGESTADO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (LogAsignaciones)
    /** <code>LogAsignaciones</code> role id. */
    public static final String ROLE_ID_LOGASIGNACIONES = "Agr_1517848231936844_Alias";
    /** <code>LogAsignaciones</code> role name. */
    public static final String ROLE_NAME_LOGASIGNACIONES = "logAsignaciones";
    /** <code>Solicitud</code> role alias. */
    public static final String ROLE_ALIAS_LOGASIGNACIONES = "LogAsignaciones";


    /** <code>LogAsignaciones</code> inverse role name. */
    public static final String ROLE_INVNAME_LOGASIGNACIONES = LogAsignacionesConstants.ROLE_NAME_SOLICITUD;
    /** <code>LogAsignaciones</code> role facet sequence. */
    public static final String PATH_FACETS_LOGASIGNACIONES = "";
    /** <code>LogAsignaciones</code> role target class. */
    public static final String ROLE_TARGET_LOGASIGNACIONES = LogAsignacionesConstants.CLASS_NAME;
    /** Agents allowed to navigate through LogAsignaciones **/
    public static final String LOGASIGNACIONES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431957012480960Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudcrearpagrAesolicitudes</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDCREARPAGRAESOLICITUDES = "p_agrAe_solicitudes";
    /** <code>solicitudcrearpagrAesolicitudes</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDCREARPAGRAESOLICITUDES = "Clas_1431957012480960Ser_1Arg_2_Alias";
    /** <code>solicitudcrearpagrAesolicitudes</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDCREARPAGRAESOLICITUDES = "Solicitud base";
    /** <code>solicitudcrearpagrContratantePersona</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDCREARPAGRCONTRATANTEPERSONA = "p_agrContratantePersona";
    /** <code>solicitudcrearpagrContratantePersona</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDCREARPAGRCONTRATANTEPERSONA = "Clas_1431957012480960Ser_1Arg_4_Alias";
    /** <code>solicitudcrearpagrContratantePersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDCREARPAGRCONTRATANTEPERSONA = "Contratante";
    /** <code>solicitudcrearpagrTitularPersona</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDCREARPAGRTITULARPERSONA = "p_agrTitularPersona";
    /** <code>solicitudcrearpagrTitularPersona</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDCREARPAGRTITULARPERSONA = "Clas_1431957012480960Ser_1Arg_7_Alias";
    /** <code>solicitudcrearpagrTitularPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDCREARPAGRTITULARPERSONA = "Titular";
    /** <code>solicitudcrearpagrProteccionDatos</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDCREARPAGRPROTECCIONDATOS = "p_agrProteccionDatos";
    /** <code>solicitudcrearpagrProteccionDatos</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDCREARPAGRPROTECCIONDATOS = "Clas_1431957012480960Ser_1Arg_8_Alias";
    /** <code>solicitudcrearpagrProteccionDatos</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDCREARPAGRPROTECCIONDATOS = "Protección Datos";
    /** <code>solicitudcrearpagrAgente</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDCREARPAGRAGENTE = "p_agrAgente";
    /** <code>solicitudcrearpagrAgente</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDCREARPAGRAGENTE = "Clas_1431957012480960Ser_1Arg_15_Alias";
    /** <code>solicitudcrearpagrAgente</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDCREARPAGRAGENTE = "Agente";
    /** <code>solicitudcrearpagrPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDCREARPAGRPERIODICIDAD = "p_agrPeriodicidad";
    /** <code>solicitudcrearpagrPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDCREARPAGRPERIODICIDAD = "Clas_1431957012480960Ser_1Arg_23_Alias";
    /** <code>solicitudcrearpagrPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDCREARPAGRPERIODICIDAD = "Periodicidad pago";
    /** <code>solicitudcrearpagrGrupoAsociado</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDCREARPAGRGRUPOASOCIADO = "p_agrGrupoAsociado";
    /** <code>solicitudcrearpagrGrupoAsociado</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDCREARPAGRGRUPOASOCIADO = "Clas_1431957012480960Ser_1Arg_30_Alias";
    /** <code>solicitudcrearpagrGrupoAsociado</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDCREARPAGRGRUPOASOCIADO = "Grupo asociado";
    /** <code>solicitudcrearpagrContratoC</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDCREARPAGRCONTRATOC = "p_agrContratoC";
    /** <code>solicitudcrearpagrContratoC</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDCREARPAGRCONTRATOC = "Clas_1431957012480960Ser_1Arg_34_Alias";
    /** <code>solicitudcrearpagrContratoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDCREARPAGRCONTRATOC = "Contrato CORE";
    /** <code>solicitudcrearpagrUsrAreaMedica</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDCREARPAGRUSRAREAMEDICA = "p_agrUsrAreaMedica";
    /** <code>solicitudcrearpagrUsrAreaMedica</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDCREARPAGRUSRAREAMEDICA = "Clas_1431957012480960Ser_1Arg_37_Alias";
    /** <code>solicitudcrearpagrUsrAreaMedica</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDCREARPAGRUSRAREAMEDICA = "Usr. Area Médica";
    /** <code>solicitudcrearpagrFormaPago</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDCREARPAGRFORMAPAGO = "p_agrFormaPago";
    /** <code>solicitudcrearpagrFormaPago</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDCREARPAGRFORMAPAGO = "Clas_1431957012480960Ser_1Arg_38_Alias";
    /** <code>solicitudcrearpagrFormaPago</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDCREARPAGRFORMAPAGO = "Forma Pago";
    /** <code>solicitudcrearpagrTipoFactura</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDCREARPAGRTIPOFACTURA = "p_agrTipoFactura";
    /** <code>solicitudcrearpagrTipoFactura</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDCREARPAGRTIPOFACTURA = "Clas_1431957012480960Ser_1Arg_40_Alias";
    /** <code>solicitudcrearpagrTipoFactura</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDCREARPAGRTIPOFACTURA = "Tipo Factura";
    /** <code>solicitudcrearpagrUsrAfiliacion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDCREARPAGRUSRAFILIACION = "p_agrUsrAfiliacion";
    /** <code>solicitudcrearpagrUsrAfiliacion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDCREARPAGRUSRAFILIACION = "Clas_1431957012480960Ser_1Arg_43_Alias";
    /** <code>solicitudcrearpagrUsrAfiliacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDCREARPAGRUSRAFILIACION = "Usr. Afiliación";
    /** <code>solicitudcrearpatrTramite</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDCREARPATRTRAMITE = "p_atrTramite";
    /** <code>solicitudcrearpatrTramite</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDCREARPATRTRAMITE = "Clas_1431957012480960Ser_1Arg_3_Alias";
    /** <code>solicitudcrearpatrTramite</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDCREARPATRTRAMITE = "Trámite";
    /** <code>solicitudcrearpatrFInicioContrato</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDCREARPATRFINICIOCONTRATO = "p_atrFInicioContrato";
    /** <code>solicitudcrearpatrFInicioContrato</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDCREARPATRFINICIOCONTRATO = "Clas_1431957012480960Ser_1Arg_9_Alias";
    /** <code>solicitudcrearpatrFInicioContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDCREARPATRFINICIOCONTRATO = "Fecha inicio contratación";
    /** <code>solicitudcrearpatrEsTraslado</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDCREARPATRESTRASLADO = "p_atrEsTraslado";
    /** <code>solicitudcrearpatrEsTraslado</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDCREARPATRESTRASLADO = "Clas_1431957012480960Ser_1Arg_12_Alias";
    /** <code>solicitudcrearpatrEsTraslado</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDCREARPATRESTRASLADO = "Es traslado";
    /** <code>solicitudcrearpatrNumContratoInclusion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDCREARPATRNUMCONTRATOINCLUSION = "p_atrNumContratoInclusion";
    /** <code>solicitudcrearpatrNumContratoInclusion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDCREARPATRNUMCONTRATOINCLUSION = "Clas_1431957012480960Ser_1Arg_16_Alias";
    /** <code>solicitudcrearpatrNumContratoInclusion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDCREARPATRNUMCONTRATOINCLUSION = "Nº Contrato Inclusión";
    /** <code>solicitudcrearpatrNumFamilia</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDCREARPATRNUMFAMILIA = "p_atrNumFamilia";
    /** <code>solicitudcrearpatrNumFamilia</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDCREARPATRNUMFAMILIA = "Clas_1431957012480960Ser_1Arg_17_Alias";
    /** <code>solicitudcrearpatrNumFamilia</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDCREARPATRNUMFAMILIA = "Nº Familia";
    /** <code>solicitudcrearpatrcodDirector</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDCREARPATRCODDIRECTOR = "p_atrcodDirector";
    /** <code>solicitudcrearpatrcodDirector</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDCREARPATRCODDIRECTOR = "Clas_1431957012480960Ser_1Arg_19_Alias";
    /** <code>solicitudcrearpatrcodDirector</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDCREARPATRCODDIRECTOR = "Código Director";
    /** <code>solicitudcrearpatrCodTarifa</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDCREARPATRCODTARIFA = "p_atrCodTarifa";
    /** <code>solicitudcrearpatrCodTarifa</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDCREARPATRCODTARIFA = "Clas_1431957012480960Ser_1Arg_20_Alias";
    /** <code>solicitudcrearpatrCodTarifa</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDCREARPATRCODTARIFA = "Cod. Tarifa";
    /** <code>solicitudcrearpatrPorcentajeProrrateo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDCREARPATRPORCENTAJEPRORRATEO = "p_atrPorcentajeProrrateo";
    /** <code>solicitudcrearpatrPorcentajeProrrateo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDCREARPATRPORCENTAJEPRORRATEO = "Clas_1431957012480960Ser_1Arg_39_Alias";
    /** <code>solicitudcrearpatrPorcentajeProrrateo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDCREARPATRPORCENTAJEPRORRATEO = "Porcentaje prorrateo";
    /** <code>solicitudcrearpatrEnvioCarnetFisico</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDCREARPATRENVIOCARNETFISICO = "p_atrEnvioCarnetFisico";
    /** <code>solicitudcrearpatrEnvioCarnetFisico</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDCREARPATRENVIOCARNETFISICO = "Clas_1431957012480960Ser_1Arg_44_Alias";
    /** <code>solicitudcrearpatrEnvioCarnetFisico</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDCREARPATRENVIOCARNETFISICO = "Envío carnet físico";
    /** <code>solicitudcrearpatrNumRadicado</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDCREARPATRNUMRADICADO = "p_atrNumRadicado";
    /** <code>solicitudcrearpatrNumRadicado</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDCREARPATRNUMRADICADO = "Clas_1431957012480960Ser_1Arg_45_Alias";
    /** <code>solicitudcrearpatrNumRadicado</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDCREARPATRNUMRADICADO = "Nº Solicitud";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431957012480960Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudeliminarpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_SOLICITUDELIMINARPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudeliminarpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_SOLICITUDELIMINARPTHISSOLICITUD = "Clas_1431957012480960Ser_2Arg_1_Alias";
    /** <code>solicitudeliminarpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_SOLICITUDELIMINARPTHISSOLICITUD = "Solicitud";
    // Service (InsContratanteSolicitud)
    /** <code>InsContratanteSolicitud</code> service id. */
    public static final String SERV_ID_INSCONTRATANTESOLICITUD = "Clas_1431957012480960Ser_4_Alias";
    /** <code>InsContratanteSolicitud</code> service name. */
    public static final String SERV_NAME_INSCONTRATANTESOLICITUD = "InsContratanteSolicitud";
    /** <code>InsContratanteSolicitud</code> service alias. */
    public static final String SERV_ALIAS_INSCONTRATANTESOLICITUD = "InsContratanteSolicitud";
    /** Agents allowed to execute the service InsContratanteSolicitud **/
    public static final String INSCONTRATANTESOLICITUD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudInsContratanteSolicitudpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_INSCONTRATANTESOLICITUD_SOLICITUDINSCONTRATANTESOLICITUDPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudInsContratanteSolicitudpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_INSCONTRATANTESOLICITUD_SOLICITUDINSCONTRATANTESOLICITUDPTHISSOLICITUD = "Clas_1431957012480960Ser_4Arg_1_Alias";
    /** <code>solicitudInsContratanteSolicitudpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSCONTRATANTESOLICITUD_SOLICITUDINSCONTRATANTESOLICITUDPTHISSOLICITUD = "Solicitudes";
    /** <code>solicitudInsContratanteSolicitudpevcPersona</code> inbound argument name. */
    public static final String ARG_NAME_INSCONTRATANTESOLICITUD_SOLICITUDINSCONTRATANTESOLICITUDPEVCPERSONA = "p_evcPersona";
    /** <code>solicitudInsContratanteSolicitudpevcPersona</code> inbound argument id. */
    public static final String ARG_ID_INSCONTRATANTESOLICITUD_SOLICITUDINSCONTRATANTESOLICITUDPEVCPERSONA = "Clas_1431957012480960Ser_4Arg_2_Alias";
    /** <code>solicitudInsContratanteSolicitudpevcPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSCONTRATANTESOLICITUD_SOLICITUDINSCONTRATANTESOLICITUDPEVCPERSONA = "Contratante";
    // Service (InsTitularSolicitud)
    /** <code>InsTitularSolicitud</code> service id. */
    public static final String SERV_ID_INSTITULARSOLICITUD = "Clas_1431957012480960Ser_13_Alias";
    /** <code>InsTitularSolicitud</code> service name. */
    public static final String SERV_NAME_INSTITULARSOLICITUD = "InsTitularSolicitud";
    /** <code>InsTitularSolicitud</code> service alias. */
    public static final String SERV_ALIAS_INSTITULARSOLICITUD = "InsTitularSolicitud";
    /** Agents allowed to execute the service InsTitularSolicitud **/
    public static final String INSTITULARSOLICITUD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudInsTitularSolicitudpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_INSTITULARSOLICITUD_SOLICITUDINSTITULARSOLICITUDPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudInsTitularSolicitudpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_INSTITULARSOLICITUD_SOLICITUDINSTITULARSOLICITUDPTHISSOLICITUD = "Clas_1431957012480960Ser_13Arg_1_Alias";
    /** <code>solicitudInsTitularSolicitudpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTITULARSOLICITUD_SOLICITUDINSTITULARSOLICITUDPTHISSOLICITUD = "Solicitudes";
    /** <code>solicitudInsTitularSolicitudpevcPersona</code> inbound argument name. */
    public static final String ARG_NAME_INSTITULARSOLICITUD_SOLICITUDINSTITULARSOLICITUDPEVCPERSONA = "p_evcPersona";
    /** <code>solicitudInsTitularSolicitudpevcPersona</code> inbound argument id. */
    public static final String ARG_ID_INSTITULARSOLICITUD_SOLICITUDINSTITULARSOLICITUDPEVCPERSONA = "Clas_1431957012480960Ser_13Arg_2_Alias";
    /** <code>solicitudInsTitularSolicitudpevcPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTITULARSOLICITUD_SOLICITUDINSTITULARSOLICITUDPEVCPERSONA = "Titular";
    // Service (InsSolicitudProteccionDatos)
    /** <code>InsSolicitudProteccionDatos</code> service id. */
    public static final String SERV_ID_INSSOLICITUDPROTECCIONDATOS = "Clas_1431957012480960Ser_14_Alias";
    /** <code>InsSolicitudProteccionDatos</code> service name. */
    public static final String SERV_NAME_INSSOLICITUDPROTECCIONDATOS = "InsSolicitudProteccionDatos";
    /** <code>InsSolicitudProteccionDatos</code> service alias. */
    public static final String SERV_ALIAS_INSSOLICITUDPROTECCIONDATOS = "InsSolicitudProteccionDatos";
    /** Agents allowed to execute the service InsSolicitudProteccionDatos **/
    public static final String INSSOLICITUDPROTECCIONDATOS_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudInsSolicitudProteccionDatospthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_INSSOLICITUDPROTECCIONDATOS_SOLICITUDINSSOLICITUDPROTECCIONDATOSPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudInsSolicitudProteccionDatospthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_INSSOLICITUDPROTECCIONDATOS_SOLICITUDINSSOLICITUDPROTECCIONDATOSPTHISSOLICITUD = "Clas_1431957012480960Ser_14Arg_1_Alias";
    /** <code>solicitudInsSolicitudProteccionDatospthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSSOLICITUDPROTECCIONDATOS_SOLICITUDINSSOLICITUDPROTECCIONDATOSPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudInsSolicitudProteccionDatospevcProteccionDatos</code> inbound argument name. */
    public static final String ARG_NAME_INSSOLICITUDPROTECCIONDATOS_SOLICITUDINSSOLICITUDPROTECCIONDATOSPEVCPROTECCIONDATOS = "p_evcProteccionDatos";
    /** <code>solicitudInsSolicitudProteccionDatospevcProteccionDatos</code> inbound argument id. */
    public static final String ARG_ID_INSSOLICITUDPROTECCIONDATOS_SOLICITUDINSSOLICITUDPROTECCIONDATOSPEVCPROTECCIONDATOS = "Clas_1431957012480960Ser_14Arg_2_Alias";
    /** <code>solicitudInsSolicitudProteccionDatospevcProteccionDatos</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSSOLICITUDPROTECCIONDATOS_SOLICITUDINSSOLICITUDPROTECCIONDATOSPEVCPROTECCIONDATOS = "Protección Datos";
    // Service (DelSolicitudProteccionDatos)
    /** <code>DelSolicitudProteccionDatos</code> service id. */
    public static final String SERV_ID_DELSOLICITUDPROTECCIONDATOS = "Clas_1431957012480960Ser_15_Alias";
    /** <code>DelSolicitudProteccionDatos</code> service name. */
    public static final String SERV_NAME_DELSOLICITUDPROTECCIONDATOS = "DelSolicitudProteccionDatos";
    /** <code>DelSolicitudProteccionDatos</code> service alias. */
    public static final String SERV_ALIAS_DELSOLICITUDPROTECCIONDATOS = "DelSolicitudProteccionDatos";
    /** Agents allowed to execute the service DelSolicitudProteccionDatos **/
    public static final String DELSOLICITUDPROTECCIONDATOS_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudDelSolicitudProteccionDatospthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_DELSOLICITUDPROTECCIONDATOS_SOLICITUDDELSOLICITUDPROTECCIONDATOSPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudDelSolicitudProteccionDatospthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_DELSOLICITUDPROTECCIONDATOS_SOLICITUDDELSOLICITUDPROTECCIONDATOSPTHISSOLICITUD = "Clas_1431957012480960Ser_15Arg_1_Alias";
    /** <code>solicitudDelSolicitudProteccionDatospthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELSOLICITUDPROTECCIONDATOS_SOLICITUDDELSOLICITUDPROTECCIONDATOSPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudDelSolicitudProteccionDatospevcProteccionDatos</code> inbound argument name. */
    public static final String ARG_NAME_DELSOLICITUDPROTECCIONDATOS_SOLICITUDDELSOLICITUDPROTECCIONDATOSPEVCPROTECCIONDATOS = "p_evcProteccionDatos";
    /** <code>solicitudDelSolicitudProteccionDatospevcProteccionDatos</code> inbound argument id. */
    public static final String ARG_ID_DELSOLICITUDPROTECCIONDATOS_SOLICITUDDELSOLICITUDPROTECCIONDATOSPEVCPROTECCIONDATOS = "Clas_1431957012480960Ser_15Arg_2_Alias";
    /** <code>solicitudDelSolicitudProteccionDatospevcProteccionDatos</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELSOLICITUDPROTECCIONDATOS_SOLICITUDDELSOLICITUDPROTECCIONDATOSPEVCPROTECCIONDATOS = "Protección Datos";
    // Service (DelContratanteSolicitud)
    /** <code>DelContratanteSolicitud</code> service id. */
    public static final String SERV_ID_DELCONTRATANTESOLICITUD = "Clas_1431957012480960Ser_16_Alias";
    /** <code>DelContratanteSolicitud</code> service name. */
    public static final String SERV_NAME_DELCONTRATANTESOLICITUD = "DelContratanteSolicitud";
    /** <code>DelContratanteSolicitud</code> service alias. */
    public static final String SERV_ALIAS_DELCONTRATANTESOLICITUD = "DelContratanteSolicitud";
    /** Agents allowed to execute the service DelContratanteSolicitud **/
    public static final String DELCONTRATANTESOLICITUD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudDelContratanteSolicitudpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_DELCONTRATANTESOLICITUD_SOLICITUDDELCONTRATANTESOLICITUDPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudDelContratanteSolicitudpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_DELCONTRATANTESOLICITUD_SOLICITUDDELCONTRATANTESOLICITUDPTHISSOLICITUD = "Clas_1431957012480960Ser_16Arg_1_Alias";
    /** <code>solicitudDelContratanteSolicitudpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELCONTRATANTESOLICITUD_SOLICITUDDELCONTRATANTESOLICITUDPTHISSOLICITUD = "Solicitudes";
    /** <code>solicitudDelContratanteSolicitudpevcPersona</code> inbound argument name. */
    public static final String ARG_NAME_DELCONTRATANTESOLICITUD_SOLICITUDDELCONTRATANTESOLICITUDPEVCPERSONA = "p_evcPersona";
    /** <code>solicitudDelContratanteSolicitudpevcPersona</code> inbound argument id. */
    public static final String ARG_ID_DELCONTRATANTESOLICITUD_SOLICITUDDELCONTRATANTESOLICITUDPEVCPERSONA = "Clas_1431957012480960Ser_16Arg_2_Alias";
    /** <code>solicitudDelContratanteSolicitudpevcPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELCONTRATANTESOLICITUD_SOLICITUDDELCONTRATANTESOLICITUDPEVCPERSONA = "Contratante";
    // Service (DelTitularSolicitud)
    /** <code>DelTitularSolicitud</code> service id. */
    public static final String SERV_ID_DELTITULARSOLICITUD = "Clas_1431957012480960Ser_17_Alias";
    /** <code>DelTitularSolicitud</code> service name. */
    public static final String SERV_NAME_DELTITULARSOLICITUD = "DelTitularSolicitud";
    /** <code>DelTitularSolicitud</code> service alias. */
    public static final String SERV_ALIAS_DELTITULARSOLICITUD = "DelTitularSolicitud";
    /** Agents allowed to execute the service DelTitularSolicitud **/
    public static final String DELTITULARSOLICITUD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudDelTitularSolicitudpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_DELTITULARSOLICITUD_SOLICITUDDELTITULARSOLICITUDPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudDelTitularSolicitudpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_DELTITULARSOLICITUD_SOLICITUDDELTITULARSOLICITUDPTHISSOLICITUD = "Clas_1431957012480960Ser_17Arg_1_Alias";
    /** <code>solicitudDelTitularSolicitudpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTITULARSOLICITUD_SOLICITUDDELTITULARSOLICITUDPTHISSOLICITUD = "Solicitudes";
    /** <code>solicitudDelTitularSolicitudpevcPersona</code> inbound argument name. */
    public static final String ARG_NAME_DELTITULARSOLICITUD_SOLICITUDDELTITULARSOLICITUDPEVCPERSONA = "p_evcPersona";
    /** <code>solicitudDelTitularSolicitudpevcPersona</code> inbound argument id. */
    public static final String ARG_ID_DELTITULARSOLICITUD_SOLICITUDDELTITULARSOLICITUDPEVCPERSONA = "Clas_1431957012480960Ser_17Arg_2_Alias";
    /** <code>solicitudDelTitularSolicitudpevcPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTITULARSOLICITUD_SOLICITUDDELTITULARSOLICITUDPEVCPERSONA = "Titular";
    // Service (InsGrupoAsociadoSolicitud)
    /** <code>InsGrupoAsociadoSolicitud</code> service id. */
    public static final String SERV_ID_INSGRUPOASOCIADOSOLICITUD = "Clas_1431957012480960Ser_20_Alias";
    /** <code>InsGrupoAsociadoSolicitud</code> service name. */
    public static final String SERV_NAME_INSGRUPOASOCIADOSOLICITUD = "InsGrupoAsociadoSolicitud";
    /** <code>InsGrupoAsociadoSolicitud</code> service alias. */
    public static final String SERV_ALIAS_INSGRUPOASOCIADOSOLICITUD = "InsGrupoAsociadoSolicitud";
    /** Agents allowed to execute the service InsGrupoAsociadoSolicitud **/
    public static final String INSGRUPOASOCIADOSOLICITUD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudInsGrupoAsociadoSolicitudpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_INSGRUPOASOCIADOSOLICITUD_SOLICITUDINSGRUPOASOCIADOSOLICITUDPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudInsGrupoAsociadoSolicitudpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_INSGRUPOASOCIADOSOLICITUD_SOLICITUDINSGRUPOASOCIADOSOLICITUDPTHISSOLICITUD = "Clas_1431957012480960Ser_20Arg_1_Alias";
    /** <code>solicitudInsGrupoAsociadoSolicitudpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSGRUPOASOCIADOSOLICITUD_SOLICITUDINSGRUPOASOCIADOSOLICITUDPTHISSOLICITUD = "Solicitudes";
    /** <code>solicitudInsGrupoAsociadoSolicitudpevcGrupoAsociado</code> inbound argument name. */
    public static final String ARG_NAME_INSGRUPOASOCIADOSOLICITUD_SOLICITUDINSGRUPOASOCIADOSOLICITUDPEVCGRUPOASOCIADO = "p_evcGrupoAsociado";
    /** <code>solicitudInsGrupoAsociadoSolicitudpevcGrupoAsociado</code> inbound argument id. */
    public static final String ARG_ID_INSGRUPOASOCIADOSOLICITUD_SOLICITUDINSGRUPOASOCIADOSOLICITUDPEVCGRUPOASOCIADO = "Clas_1431957012480960Ser_20Arg_2_Alias";
    /** <code>solicitudInsGrupoAsociadoSolicitudpevcGrupoAsociado</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSGRUPOASOCIADOSOLICITUD_SOLICITUDINSGRUPOASOCIADOSOLICITUDPEVCGRUPOASOCIADO = "Grupo asociado";
    // Service (DelGrupoAsociadoSolicitud)
    /** <code>DelGrupoAsociadoSolicitud</code> service id. */
    public static final String SERV_ID_DELGRUPOASOCIADOSOLICITUD = "Clas_1431957012480960Ser_21_Alias";
    /** <code>DelGrupoAsociadoSolicitud</code> service name. */
    public static final String SERV_NAME_DELGRUPOASOCIADOSOLICITUD = "DelGrupoAsociadoSolicitud";
    /** <code>DelGrupoAsociadoSolicitud</code> service alias. */
    public static final String SERV_ALIAS_DELGRUPOASOCIADOSOLICITUD = "DelGrupoAsociadoSolicitud";
    /** Agents allowed to execute the service DelGrupoAsociadoSolicitud **/
    public static final String DELGRUPOASOCIADOSOLICITUD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudDelGrupoAsociadoSolicitudpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_DELGRUPOASOCIADOSOLICITUD_SOLICITUDDELGRUPOASOCIADOSOLICITUDPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudDelGrupoAsociadoSolicitudpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_DELGRUPOASOCIADOSOLICITUD_SOLICITUDDELGRUPOASOCIADOSOLICITUDPTHISSOLICITUD = "Clas_1431957012480960Ser_21Arg_1_Alias";
    /** <code>solicitudDelGrupoAsociadoSolicitudpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELGRUPOASOCIADOSOLICITUD_SOLICITUDDELGRUPOASOCIADOSOLICITUDPTHISSOLICITUD = "Solicitudes";
    /** <code>solicitudDelGrupoAsociadoSolicitudpevcGrupoAsociado</code> inbound argument name. */
    public static final String ARG_NAME_DELGRUPOASOCIADOSOLICITUD_SOLICITUDDELGRUPOASOCIADOSOLICITUDPEVCGRUPOASOCIADO = "p_evcGrupoAsociado";
    /** <code>solicitudDelGrupoAsociadoSolicitudpevcGrupoAsociado</code> inbound argument id. */
    public static final String ARG_ID_DELGRUPOASOCIADOSOLICITUD_SOLICITUDDELGRUPOASOCIADOSOLICITUDPEVCGRUPOASOCIADO = "Clas_1431957012480960Ser_21Arg_2_Alias";
    /** <code>solicitudDelGrupoAsociadoSolicitudpevcGrupoAsociado</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELGRUPOASOCIADOSOLICITUD_SOLICITUDDELGRUPOASOCIADOSOLICITUDPEVCGRUPOASOCIADO = "Grupo asociado";
    // Service (InsFormaPagoSolicitud)
    /** <code>InsFormaPagoSolicitud</code> service id. */
    public static final String SERV_ID_INSFORMAPAGOSOLICITUD = "Clas_1431957012480960Ser_25_Alias";
    /** <code>InsFormaPagoSolicitud</code> service name. */
    public static final String SERV_NAME_INSFORMAPAGOSOLICITUD = "InsFormaPagoSolicitud";
    /** <code>InsFormaPagoSolicitud</code> service alias. */
    public static final String SERV_ALIAS_INSFORMAPAGOSOLICITUD = "InsFormaPagoSolicitud";
    /** Agents allowed to execute the service InsFormaPagoSolicitud **/
    public static final String INSFORMAPAGOSOLICITUD_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    // Inbound arguments
    /** <code>solicitudInsFormaPagoSolicitudpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_INSFORMAPAGOSOLICITUD_SOLICITUDINSFORMAPAGOSOLICITUDPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudInsFormaPagoSolicitudpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_INSFORMAPAGOSOLICITUD_SOLICITUDINSFORMAPAGOSOLICITUDPTHISSOLICITUD = "Clas_1431957012480960Ser_25Arg_1_Alias";
    /** <code>solicitudInsFormaPagoSolicitudpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSFORMAPAGOSOLICITUD_SOLICITUDINSFORMAPAGOSOLICITUDPTHISSOLICITUD = "Solicitudes";
    /** <code>solicitudInsFormaPagoSolicitudpevcFormaPago</code> inbound argument name. */
    public static final String ARG_NAME_INSFORMAPAGOSOLICITUD_SOLICITUDINSFORMAPAGOSOLICITUDPEVCFORMAPAGO = "p_evcFormaPago";
    /** <code>solicitudInsFormaPagoSolicitudpevcFormaPago</code> inbound argument id. */
    public static final String ARG_ID_INSFORMAPAGOSOLICITUD_SOLICITUDINSFORMAPAGOSOLICITUDPEVCFORMAPAGO = "Clas_1431957012480960Ser_25Arg_2_Alias";
    /** <code>solicitudInsFormaPagoSolicitudpevcFormaPago</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSFORMAPAGOSOLICITUD_SOLICITUDINSFORMAPAGOSOLICITUDPEVCFORMAPAGO = "Forma Pago";
    // Service (DelFormaPagoSolicitud)
    /** <code>DelFormaPagoSolicitud</code> service id. */
    public static final String SERV_ID_DELFORMAPAGOSOLICITUD = "Clas_1431957012480960Ser_26_Alias";
    /** <code>DelFormaPagoSolicitud</code> service name. */
    public static final String SERV_NAME_DELFORMAPAGOSOLICITUD = "DelFormaPagoSolicitud";
    /** <code>DelFormaPagoSolicitud</code> service alias. */
    public static final String SERV_ALIAS_DELFORMAPAGOSOLICITUD = "DelFormaPagoSolicitud";
    /** Agents allowed to execute the service DelFormaPagoSolicitud **/
    public static final String DELFORMAPAGOSOLICITUD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudDelFormaPagoSolicitudpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_DELFORMAPAGOSOLICITUD_SOLICITUDDELFORMAPAGOSOLICITUDPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudDelFormaPagoSolicitudpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_DELFORMAPAGOSOLICITUD_SOLICITUDDELFORMAPAGOSOLICITUDPTHISSOLICITUD = "Clas_1431957012480960Ser_26Arg_1_Alias";
    /** <code>solicitudDelFormaPagoSolicitudpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELFORMAPAGOSOLICITUD_SOLICITUDDELFORMAPAGOSOLICITUDPTHISSOLICITUD = "Solicitudes";
    /** <code>solicitudDelFormaPagoSolicitudpevcFormaPago</code> inbound argument name. */
    public static final String ARG_NAME_DELFORMAPAGOSOLICITUD_SOLICITUDDELFORMAPAGOSOLICITUDPEVCFORMAPAGO = "p_evcFormaPago";
    /** <code>solicitudDelFormaPagoSolicitudpevcFormaPago</code> inbound argument id. */
    public static final String ARG_ID_DELFORMAPAGOSOLICITUD_SOLICITUDDELFORMAPAGOSOLICITUDPEVCFORMAPAGO = "Clas_1431957012480960Ser_26Arg_2_Alias";
    /** <code>solicitudDelFormaPagoSolicitudpevcFormaPago</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELFORMAPAGOSOLICITUD_SOLICITUDDELFORMAPAGOSOLICITUDPEVCFORMAPAGO = "Forma Pago";
    // Service (InsPeriodicidadSolicitud)
    /** <code>InsPeriodicidadSolicitud</code> service id. */
    public static final String SERV_ID_INSPERIODICIDADSOLICITUD = "Clas_1431957012480960Ser_27_Alias";
    /** <code>InsPeriodicidadSolicitud</code> service name. */
    public static final String SERV_NAME_INSPERIODICIDADSOLICITUD = "InsPeriodicidadSolicitud";
    /** <code>InsPeriodicidadSolicitud</code> service alias. */
    public static final String SERV_ALIAS_INSPERIODICIDADSOLICITUD = "InsPeriodicidadSolicitud";
    /** Agents allowed to execute the service InsPeriodicidadSolicitud **/
    public static final String INSPERIODICIDADSOLICITUD_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    // Inbound arguments
    /** <code>solicitudInsPeriodicidadSolicitudpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_INSPERIODICIDADSOLICITUD_SOLICITUDINSPERIODICIDADSOLICITUDPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudInsPeriodicidadSolicitudpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_INSPERIODICIDADSOLICITUD_SOLICITUDINSPERIODICIDADSOLICITUDPTHISSOLICITUD = "Clas_1431957012480960Ser_27Arg_1_Alias";
    /** <code>solicitudInsPeriodicidadSolicitudpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPERIODICIDADSOLICITUD_SOLICITUDINSPERIODICIDADSOLICITUDPTHISSOLICITUD = "Solicitudes";
    /** <code>solicitudInsPeriodicidadSolicitudpevcPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_INSPERIODICIDADSOLICITUD_SOLICITUDINSPERIODICIDADSOLICITUDPEVCPERIODICIDAD = "p_evcPeriodicidad";
    /** <code>solicitudInsPeriodicidadSolicitudpevcPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_INSPERIODICIDADSOLICITUD_SOLICITUDINSPERIODICIDADSOLICITUDPEVCPERIODICIDAD = "Clas_1431957012480960Ser_27Arg_2_Alias";
    /** <code>solicitudInsPeriodicidadSolicitudpevcPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPERIODICIDADSOLICITUD_SOLICITUDINSPERIODICIDADSOLICITUDPEVCPERIODICIDAD = "Periodicidad pago";
    // Service (DelPeriodicidadSolicitud)
    /** <code>DelPeriodicidadSolicitud</code> service id. */
    public static final String SERV_ID_DELPERIODICIDADSOLICITUD = "Clas_1431957012480960Ser_28_Alias";
    /** <code>DelPeriodicidadSolicitud</code> service name. */
    public static final String SERV_NAME_DELPERIODICIDADSOLICITUD = "DelPeriodicidadSolicitud";
    /** <code>DelPeriodicidadSolicitud</code> service alias. */
    public static final String SERV_ALIAS_DELPERIODICIDADSOLICITUD = "DelPeriodicidadSolicitud";
    /** Agents allowed to execute the service DelPeriodicidadSolicitud **/
    public static final String DELPERIODICIDADSOLICITUD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudDelPeriodicidadSolicitudpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_DELPERIODICIDADSOLICITUD_SOLICITUDDELPERIODICIDADSOLICITUDPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudDelPeriodicidadSolicitudpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_DELPERIODICIDADSOLICITUD_SOLICITUDDELPERIODICIDADSOLICITUDPTHISSOLICITUD = "Clas_1431957012480960Ser_28Arg_1_Alias";
    /** <code>solicitudDelPeriodicidadSolicitudpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPERIODICIDADSOLICITUD_SOLICITUDDELPERIODICIDADSOLICITUDPTHISSOLICITUD = "Solicitudes";
    /** <code>solicitudDelPeriodicidadSolicitudpevcPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_DELPERIODICIDADSOLICITUD_SOLICITUDDELPERIODICIDADSOLICITUDPEVCPERIODICIDAD = "p_evcPeriodicidad";
    /** <code>solicitudDelPeriodicidadSolicitudpevcPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_DELPERIODICIDADSOLICITUD_SOLICITUDDELPERIODICIDADSOLICITUDPEVCPERIODICIDAD = "Clas_1431957012480960Ser_28Arg_2_Alias";
    /** <code>solicitudDelPeriodicidadSolicitudpevcPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPERIODICIDADSOLICITUD_SOLICITUDDELPERIODICIDADSOLICITUDPEVCPERIODICIDAD = "Periodicidad pago";
    // Service (registrarDatosCabecera)
    /** <code>registrarDatosCabecera</code> service id. */
    public static final String SERV_ID_REGISTRARDATOSCABECERA = "Clas_1431957012480960Ser_24_Alias";
    /** <code>registrarDatosCabecera</code> service name. */
    public static final String SERV_NAME_REGISTRARDATOSCABECERA = "registrarDatosCabecera";
    /** <code>registrarDatosCabecera</code> service alias. */
    public static final String SERV_ALIAS_REGISTRARDATOSCABECERA = "registrarDatosCabecera";
    /** Agents allowed to execute the service registrarDatosCabecera **/
    public static final String REGISTRARDATOSCABECERA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudregistrarDatosCabecerapthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_REGISTRARDATOSCABECERA_SOLICITUDREGISTRARDATOSCABECERAPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudregistrarDatosCabecerapthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_REGISTRARDATOSCABECERA_SOLICITUDREGISTRARDATOSCABECERAPTHISSOLICITUD = "Clas_1431957012480960Ser_24Arg_1_Alias";
    /** <code>solicitudregistrarDatosCabecerapthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_REGISTRARDATOSCABECERA_SOLICITUDREGISTRARDATOSCABECERAPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudregistrarDatosCabeceraptipoContrato</code> inbound argument name. */
    public static final String ARG_NAME_REGISTRARDATOSCABECERA_SOLICITUDREGISTRARDATOSCABECERAPTIPOCONTRATO = "p_tipoContrato";
    /** <code>solicitudregistrarDatosCabeceraptipoContrato</code> inbound argument id. */
    public static final String ARG_ID_REGISTRARDATOSCABECERA_SOLICITUDREGISTRARDATOSCABECERAPTIPOCONTRATO = "Clas_1431957012480960Ser_24Arg_9_Alias";
    /** <code>solicitudregistrarDatosCabeceraptipoContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_REGISTRARDATOSCABECERA_SOLICITUDREGISTRARDATOSCABECERAPTIPOCONTRATO = "Tipo Contrato";
    /** <code>solicitudregistrarDatosCabecerapcodigoSucursalRad</code> inbound argument name. */
    public static final String ARG_NAME_REGISTRARDATOSCABECERA_SOLICITUDREGISTRARDATOSCABECERAPCODIGOSUCURSALRAD = "p_codigoSucursalRad";
    /** <code>solicitudregistrarDatosCabecerapcodigoSucursalRad</code> inbound argument id. */
    public static final String ARG_ID_REGISTRARDATOSCABECERA_SOLICITUDREGISTRARDATOSCABECERAPCODIGOSUCURSALRAD = "Clas_1431957012480960Ser_24Arg_13_Alias";
    /** <code>solicitudregistrarDatosCabecerapcodigoSucursalRad</code> inbound argument alias. */
    public static final String ARG_ALIAS_REGISTRARDATOSCABECERA_SOLICITUDREGISTRARDATOSCABECERAPCODIGOSUCURSALRAD = "Cód. Sucursal Rad.";
    // Service (marcarExentoIVA)
    /** <code>marcarExentoIVA</code> service id. */
    public static final String SERV_ID_MARCAREXENTOIVA = "Clas_1431957012480960Ser_29_Alias";
    /** <code>marcarExentoIVA</code> service name. */
    public static final String SERV_NAME_MARCAREXENTOIVA = "marcarExentoIVA";
    /** <code>marcarExentoIVA</code> service alias. */
    public static final String SERV_ALIAS_MARCAREXENTOIVA = "marcarExentoIVA";
    /** Agents allowed to execute the service marcarExentoIVA **/
    public static final String MARCAREXENTOIVA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudmarcarExentoIVApthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_MARCAREXENTOIVA_SOLICITUDMARCAREXENTOIVAPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudmarcarExentoIVApthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_MARCAREXENTOIVA_SOLICITUDMARCAREXENTOIVAPTHISSOLICITUD = "Clas_1431957012480960Ser_29Arg_1_Alias";
    /** <code>solicitudmarcarExentoIVApthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_MARCAREXENTOIVA_SOLICITUDMARCAREXENTOIVAPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudmarcarExentoIVApExentoIVA</code> inbound argument name. */
    public static final String ARG_NAME_MARCAREXENTOIVA_SOLICITUDMARCAREXENTOIVAPEXENTOIVA = "p_ExentoIVA";
    /** <code>solicitudmarcarExentoIVApExentoIVA</code> inbound argument id. */
    public static final String ARG_ID_MARCAREXENTOIVA_SOLICITUDMARCAREXENTOIVAPEXENTOIVA = "Clas_1431957012480960Ser_29Arg_2_Alias";
    /** <code>solicitudmarcarExentoIVApExentoIVA</code> inbound argument alias. */
    public static final String ARG_ALIAS_MARCAREXENTOIVA_SOLICITUDMARCAREXENTOIVAPEXENTOIVA = "Exento IVA";
    // Service (marcarDatosPagoOK)
    /** <code>marcarDatosPagoOK</code> service id. */
    public static final String SERV_ID_MARCARDATOSPAGOOK = "Clas_1431957012480960Ser_40_Alias";
    /** <code>marcarDatosPagoOK</code> service name. */
    public static final String SERV_NAME_MARCARDATOSPAGOOK = "marcarDatosPagoOK";
    /** <code>marcarDatosPagoOK</code> service alias. */
    public static final String SERV_ALIAS_MARCARDATOSPAGOOK = "marcarDatosPagoOK";
    /** Agents allowed to execute the service marcarDatosPagoOK **/
    public static final String MARCARDATOSPAGOOK_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    // Inbound arguments
    /** <code>solicitudmarcarDatosPagoOKpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_MARCARDATOSPAGOOK_SOLICITUDMARCARDATOSPAGOOKPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudmarcarDatosPagoOKpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_MARCARDATOSPAGOOK_SOLICITUDMARCARDATOSPAGOOKPTHISSOLICITUD = "Clas_1431957012480960Ser_40Arg_1_Alias";
    /** <code>solicitudmarcarDatosPagoOKpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_MARCARDATOSPAGOOK_SOLICITUDMARCARDATOSPAGOOKPTHISSOLICITUD = "Solicitud";
    // Service (marcarFirmaOK)
    /** <code>marcarFirmaOK</code> service id. */
    public static final String SERV_ID_MARCARFIRMAOK = "Clas_1431957012480960Ser_42_Alias";
    /** <code>marcarFirmaOK</code> service name. */
    public static final String SERV_NAME_MARCARFIRMAOK = "marcarFirmaOK";
    /** <code>marcarFirmaOK</code> service alias. */
    public static final String SERV_ALIAS_MARCARFIRMAOK = "marcarFirmaOK";
    /** Agents allowed to execute the service marcarFirmaOK **/
    public static final String MARCARFIRMAOK_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudmarcarFirmaOKpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_MARCARFIRMAOK_SOLICITUDMARCARFIRMAOKPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudmarcarFirmaOKpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_MARCARFIRMAOK_SOLICITUDMARCARFIRMAOKPTHISSOLICITUD = "Clas_1431957012480960Ser_42Arg_1_Alias";
    /** <code>solicitudmarcarFirmaOKpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_MARCARFIRMAOK_SOLICITUDMARCARFIRMAOKPTHISSOLICITUD = "Solicitud";
    // Service (modificarDatosCORE)
    /** <code>modificarDatosCORE</code> service id. */
    public static final String SERV_ID_MODIFICARDATOSCORE = "Clas_1431957012480960Ser_44_Alias";
    /** <code>modificarDatosCORE</code> service name. */
    public static final String SERV_NAME_MODIFICARDATOSCORE = "modificarDatosCORE";
    /** <code>modificarDatosCORE</code> service alias. */
    public static final String SERV_ALIAS_MODIFICARDATOSCORE = "modificarDatosCORE";
    /** Agents allowed to execute the service modificarDatosCORE **/
    public static final String MODIFICARDATOSCORE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudmodificarDatosCOREpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARDATOSCORE_SOLICITUDMODIFICARDATOSCOREPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudmodificarDatosCOREpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARDATOSCORE_SOLICITUDMODIFICARDATOSCOREPTHISSOLICITUD = "Clas_1431957012480960Ser_44Arg_1_Alias";
    /** <code>solicitudmodificarDatosCOREpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARDATOSCORE_SOLICITUDMODIFICARDATOSCOREPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudmodificarDatosCOREpNumContrato</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARDATOSCORE_SOLICITUDMODIFICARDATOSCOREPNUMCONTRATO = "p_NumContrato";
    /** <code>solicitudmodificarDatosCOREpNumContrato</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARDATOSCORE_SOLICITUDMODIFICARDATOSCOREPNUMCONTRATO = "Clas_1431957012480960Ser_44Arg_2_Alias";
    /** <code>solicitudmodificarDatosCOREpNumContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARDATOSCORE_SOLICITUDMODIFICARDATOSCOREPNUMCONTRATO = "Nº Contrato";
    /** <code>solicitudmodificarDatosCOREpvalorCuotaPeriodoC</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARDATOSCORE_SOLICITUDMODIFICARDATOSCOREPVALORCUOTAPERIODOC = "p_valorCuotaPeriodoC";
    /** <code>solicitudmodificarDatosCOREpvalorCuotaPeriodoC</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARDATOSCORE_SOLICITUDMODIFICARDATOSCOREPVALORCUOTAPERIODOC = "Clas_1431957012480960Ser_44Arg_3_Alias";
    /** <code>solicitudmodificarDatosCOREpvalorCuotaPeriodoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARDATOSCORE_SOLICITUDMODIFICARDATOSCOREPVALORCUOTAPERIODOC = "Valor Cuota Periodo ";
    /** <code>solicitudmodificarDatosCOREpdescuentoComercialC</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARDATOSCORE_SOLICITUDMODIFICARDATOSCOREPDESCUENTOCOMERCIALC = "p_descuentoComercialC";
    /** <code>solicitudmodificarDatosCOREpdescuentoComercialC</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARDATOSCORE_SOLICITUDMODIFICARDATOSCOREPDESCUENTOCOMERCIALC = "Clas_1431957012480960Ser_44Arg_4_Alias";
    /** <code>solicitudmodificarDatosCOREpdescuentoComercialC</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARDATOSCORE_SOLICITUDMODIFICARDATOSCOREPDESCUENTOCOMERCIALC = "Descuento comercial";
    /** <code>solicitudmodificarDatosCOREpIVAC</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARDATOSCORE_SOLICITUDMODIFICARDATOSCOREPIVAC = "p_IVAC";
    /** <code>solicitudmodificarDatosCOREpIVAC</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARDATOSCORE_SOLICITUDMODIFICARDATOSCOREPIVAC = "Clas_1431957012480960Ser_44Arg_5_Alias";
    /** <code>solicitudmodificarDatosCOREpIVAC</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARDATOSCORE_SOLICITUDMODIFICARDATOSCOREPIVAC = "IVA";
    /** <code>solicitudmodificarDatosCOREpdescuentoFinancieroC</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARDATOSCORE_SOLICITUDMODIFICARDATOSCOREPDESCUENTOFINANCIEROC = "p_descuentoFinancieroC";
    /** <code>solicitudmodificarDatosCOREpdescuentoFinancieroC</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARDATOSCORE_SOLICITUDMODIFICARDATOSCOREPDESCUENTOFINANCIEROC = "Clas_1431957012480960Ser_44Arg_6_Alias";
    /** <code>solicitudmodificarDatosCOREpdescuentoFinancieroC</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARDATOSCORE_SOLICITUDMODIFICARDATOSCOREPDESCUENTOFINANCIEROC = "Descuento financiero";
    /** <code>solicitudmodificarDatosCOREpvalorCuotaBrutaC</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARDATOSCORE_SOLICITUDMODIFICARDATOSCOREPVALORCUOTABRUTAC = "p_valorCuotaBrutaC";
    /** <code>solicitudmodificarDatosCOREpvalorCuotaBrutaC</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARDATOSCORE_SOLICITUDMODIFICARDATOSCOREPVALORCUOTABRUTAC = "Clas_1431957012480960Ser_44Arg_7_Alias";
    /** <code>solicitudmodificarDatosCOREpvalorCuotaBrutaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARDATOSCORE_SOLICITUDMODIFICARDATOSCOREPVALORCUOTABRUTAC = "Valor Cuota Bruta";
    // Service (anotarObservaciones)
    /** <code>anotarObservaciones</code> service id. */
    public static final String SERV_ID_ANOTAROBSERVACIONES = "Clas_1431957012480960Ser_38_Alias";
    /** <code>anotarObservaciones</code> service name. */
    public static final String SERV_NAME_ANOTAROBSERVACIONES = "anotarObservaciones";
    /** <code>anotarObservaciones</code> service alias. */
    public static final String SERV_ALIAS_ANOTAROBSERVACIONES = "Anotar observaciones";
    /** Agents allowed to execute the service anotarObservaciones **/
    public static final String ANOTAROBSERVACIONES_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Preconditions
    /** <code>anotarObservaciones</code> precondition 0 id. */
    public static final String PRE_ID_ANOTAROBSERVACIONES_0 = "Clas_1431957012480960Pre_59_MsgError";
    // Inbound arguments
    /** <code>solicitudanotarObservacionespthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_ANOTAROBSERVACIONES_SOLICITUDANOTAROBSERVACIONESPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudanotarObservacionespthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_ANOTAROBSERVACIONES_SOLICITUDANOTAROBSERVACIONESPTHISSOLICITUD = "Clas_1431957012480960Ser_38Arg_1_Alias";
    /** <code>solicitudanotarObservacionespthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_ANOTAROBSERVACIONES_SOLICITUDANOTAROBSERVACIONESPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudanotarObservacionespObservaciones</code> inbound argument name. */
    public static final String ARG_NAME_ANOTAROBSERVACIONES_SOLICITUDANOTAROBSERVACIONESPOBSERVACIONES = "p_Observaciones";
    /** <code>solicitudanotarObservacionespObservaciones</code> inbound argument id. */
    public static final String ARG_ID_ANOTAROBSERVACIONES_SOLICITUDANOTAROBSERVACIONESPOBSERVACIONES = "Clas_1431957012480960Ser_38Arg_2_Alias";
    /** <code>solicitudanotarObservacionespObservaciones</code> inbound argument alias. */
    public static final String ARG_ALIAS_ANOTAROBSERVACIONES_SOLICITUDANOTAROBSERVACIONESPOBSERVACIONES = "Observaciones";
    // Service (dummyPreexistencias)
    /** <code>dummyPreexistencias</code> service id. */
    public static final String SERV_ID_DUMMYPREEXISTENCIAS = "Clas_1431957012480960Ser_47_Alias";
    /** <code>dummyPreexistencias</code> service name. */
    public static final String SERV_NAME_DUMMYPREEXISTENCIAS = "dummyPreexistencias";
    /** <code>dummyPreexistencias</code> service alias. */
    public static final String SERV_ALIAS_DUMMYPREEXISTENCIAS = "Preexistencias";
    /** Agents allowed to execute the service dummyPreexistencias **/
    public static final String DUMMYPREEXISTENCIAS_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Preconditions
    /** <code>dummyPreexistencias</code> precondition 0 id. */
    public static final String PRE_ID_DUMMYPREEXISTENCIAS_0 = "Clas_1431957012480960Pre_22_MsgError";
    // Inbound arguments
    /** <code>solicituddummyPreexistenciaspthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_DUMMYPREEXISTENCIAS_SOLICITUDDUMMYPREEXISTENCIASPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicituddummyPreexistenciaspthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_DUMMYPREEXISTENCIAS_SOLICITUDDUMMYPREEXISTENCIASPTHISSOLICITUD = "Clas_1431957012480960Ser_47Arg_1_Alias";
    /** <code>solicituddummyPreexistenciaspthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_DUMMYPREEXISTENCIAS_SOLICITUDDUMMYPREEXISTENCIASPTHISSOLICITUD = "Solicitud";
    // Service (dummyDiferenciasLiq)
    /** <code>dummyDiferenciasLiq</code> service id. */
    public static final String SERV_ID_DUMMYDIFERENCIASLIQ = "Clas_1431957012480960Ser_48_Alias";
    /** <code>dummyDiferenciasLiq</code> service name. */
    public static final String SERV_NAME_DUMMYDIFERENCIASLIQ = "dummyDiferenciasLiq";
    /** <code>dummyDiferenciasLiq</code> service alias. */
    public static final String SERV_ALIAS_DUMMYDIFERENCIASLIQ = "Ver detalle diferencias liquidación";
    /** Agents allowed to execute the service dummyDiferenciasLiq **/
    public static final String DUMMYDIFERENCIASLIQ_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Preconditions
    /** <code>dummyDiferenciasLiq</code> precondition 0 id. */
    public static final String PRE_ID_DUMMYDIFERENCIASLIQ_0 = "Clas_1431957012480960Pre_13_MsgError";
    // Inbound arguments
    /** <code>solicituddummyDiferenciasLiqpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_DUMMYDIFERENCIASLIQ_SOLICITUDDUMMYDIFERENCIASLIQPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicituddummyDiferenciasLiqpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_DUMMYDIFERENCIASLIQ_SOLICITUDDUMMYDIFERENCIASLIQPTHISSOLICITUD = "Clas_1431957012480960Ser_48Arg_1_Alias";
    /** <code>solicituddummyDiferenciasLiqpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_DUMMYDIFERENCIASLIQ_SOLICITUDDUMMYDIFERENCIASLIQPTHISSOLICITUD = "Solicitud";
    // Service (modificarDatosPago)
    /** <code>modificarDatosPago</code> service id. */
    public static final String SERV_ID_MODIFICARDATOSPAGO = "Clas_1431957012480960Ser_51_Alias";
    /** <code>modificarDatosPago</code> service name. */
    public static final String SERV_NAME_MODIFICARDATOSPAGO = "modificarDatosPago";
    /** <code>modificarDatosPago</code> service alias. */
    public static final String SERV_ALIAS_MODIFICARDATOSPAGO = "modificarDatosPago";
    /** Agents allowed to execute the service modificarDatosPago **/
    public static final String MODIFICARDATOSPAGO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudmodificarDatosPagopthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARDATOSPAGO_SOLICITUDMODIFICARDATOSPAGOPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudmodificarDatosPagopthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARDATOSPAGO_SOLICITUDMODIFICARDATOSPAGOPTHISSOLICITUD = "Clas_1431957012480960Ser_51Arg_1_Alias";
    /** <code>solicitudmodificarDatosPagopthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARDATOSPAGO_SOLICITUDMODIFICARDATOSPAGOPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudmodificarDatosPagopvalorCuota</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARDATOSPAGO_SOLICITUDMODIFICARDATOSPAGOPVALORCUOTA = "p_valorCuota";
    /** <code>solicitudmodificarDatosPagopvalorCuota</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARDATOSPAGO_SOLICITUDMODIFICARDATOSPAGOPVALORCUOTA = "Clas_1431957012480960Ser_51Arg_2_Alias";
    /** <code>solicitudmodificarDatosPagopvalorCuota</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARDATOSPAGO_SOLICITUDMODIFICARDATOSPAGOPVALORCUOTA = "Valor cuota";
    /** <code>solicitudmodificarDatosPagopvalorDtoComercialSim</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARDATOSPAGO_SOLICITUDMODIFICARDATOSPAGOPVALORDTOCOMERCIALSIM = "p_valorDtoComercialSim";
    /** <code>solicitudmodificarDatosPagopvalorDtoComercialSim</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARDATOSPAGO_SOLICITUDMODIFICARDATOSPAGOPVALORDTOCOMERCIALSIM = "Clas_1431957012480960Ser_51Arg_3_Alias";
    /** <code>solicitudmodificarDatosPagopvalorDtoComercialSim</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARDATOSPAGO_SOLICITUDMODIFICARDATOSPAGOPVALORDTOCOMERCIALSIM = "Dto. Comercial Simultaneidad";
    /** <code>solicitudmodificarDatosPagopValorDtoFinanciero</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARDATOSPAGO_SOLICITUDMODIFICARDATOSPAGOPVALORDTOFINANCIERO = "p_ValorDtoFinanciero";
    /** <code>solicitudmodificarDatosPagopValorDtoFinanciero</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARDATOSPAGO_SOLICITUDMODIFICARDATOSPAGOPVALORDTOFINANCIERO = "Clas_1431957012480960Ser_51Arg_7_Alias";
    /** <code>solicitudmodificarDatosPagopValorDtoFinanciero</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARDATOSPAGO_SOLICITUDMODIFICARDATOSPAGOPVALORDTOFINANCIERO = "Valor Dto. Financiero";
    /** <code>solicitudmodificarDatosPagopeValorCuotaInscripcion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARDATOSPAGO_SOLICITUDMODIFICARDATOSPAGOPEVALORCUOTAINSCRIPCION = "peValorCuotaInscripcion";
    /** <code>solicitudmodificarDatosPagopeValorCuotaInscripcion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARDATOSPAGO_SOLICITUDMODIFICARDATOSPAGOPEVALORCUOTAINSCRIPCION = "Clas_1431957012480960Ser_51Arg_9_Alias";
    /** <code>solicitudmodificarDatosPagopeValorCuotaInscripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARDATOSPAGO_SOLICITUDMODIFICARDATOSPAGOPEVALORCUOTAINSCRIPCION = "Valor cuota inscripción";
    // Service (fijarTipoContrato)
    /** <code>fijarTipoContrato</code> service id. */
    public static final String SERV_ID_FIJARTIPOCONTRATO = "Clas_1431957012480960Ser_58_Alias";
    /** <code>fijarTipoContrato</code> service name. */
    public static final String SERV_NAME_FIJARTIPOCONTRATO = "fijarTipoContrato";
    /** <code>fijarTipoContrato</code> service alias. */
    public static final String SERV_ALIAS_FIJARTIPOCONTRATO = "fijarTipoContrato";
    /** Agents allowed to execute the service fijarTipoContrato **/
    public static final String FIJARTIPOCONTRATO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudfijarTipoContratopthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_FIJARTIPOCONTRATO_SOLICITUDFIJARTIPOCONTRATOPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudfijarTipoContratopthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_FIJARTIPOCONTRATO_SOLICITUDFIJARTIPOCONTRATOPTHISSOLICITUD = "Clas_1431957012480960Ser_58Arg_1_Alias";
    /** <code>solicitudfijarTipoContratopthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_FIJARTIPOCONTRATO_SOLICITUDFIJARTIPOCONTRATOPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudfijarTipoContratopTipoContrato</code> inbound argument name. */
    public static final String ARG_NAME_FIJARTIPOCONTRATO_SOLICITUDFIJARTIPOCONTRATOPTIPOCONTRATO = "p_TipoContrato";
    /** <code>solicitudfijarTipoContratopTipoContrato</code> inbound argument id. */
    public static final String ARG_ID_FIJARTIPOCONTRATO_SOLICITUDFIJARTIPOCONTRATOPTIPOCONTRATO = "Clas_1431957012480960Ser_58Arg_2_Alias";
    /** <code>solicitudfijarTipoContratopTipoContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_FIJARTIPOCONTRATO_SOLICITUDFIJARTIPOCONTRATOPTIPOCONTRATO = "Tipo contrato";
    // Service (dummyRedirigir)
    /** <code>dummyRedirigir</code> service id. */
    public static final String SERV_ID_DUMMYREDIRIGIR = "Clas_1431957012480960Ser_59_Alias";
    /** <code>dummyRedirigir</code> service name. */
    public static final String SERV_NAME_DUMMYREDIRIGIR = "dummyRedirigir";
    /** <code>dummyRedirigir</code> service alias. */
    public static final String SERV_ALIAS_DUMMYREDIRIGIR = "Modificar trámite";
    /** Agents allowed to execute the service dummyRedirigir **/
    public static final String DUMMYREDIRIGIR_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,MesaDeApoyo";
    // Inbound arguments
    /** <code>solicituddummyRedirigirpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_DUMMYREDIRIGIR_SOLICITUDDUMMYREDIRIGIRPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicituddummyRedirigirpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_DUMMYREDIRIGIR_SOLICITUDDUMMYREDIRIGIRPTHISSOLICITUD = "Clas_1431957012480960Ser_59Arg_1_Alias";
    /** <code>solicituddummyRedirigirpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_DUMMYREDIRIGIR_SOLICITUDDUMMYREDIRIGIRPTHISSOLICITUD = "Solicitud";
    // Service (calcularDifLiquidacion)
    /** <code>calcularDifLiquidacion</code> service id. */
    public static final String SERV_ID_CALCULARDIFLIQUIDACION = "Clas_1431957012480960Ser_60_Alias";
    /** <code>calcularDifLiquidacion</code> service name. */
    public static final String SERV_NAME_CALCULARDIFLIQUIDACION = "calcularDifLiquidacion";
    /** <code>calcularDifLiquidacion</code> service alias. */
    public static final String SERV_ALIAS_CALCULARDIFLIQUIDACION = "calcularDifLiquidacion";
    /** Agents allowed to execute the service calcularDifLiquidacion **/
    public static final String CALCULARDIFLIQUIDACION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudcalcularDifLiquidacionpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_CALCULARDIFLIQUIDACION_SOLICITUDCALCULARDIFLIQUIDACIONPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudcalcularDifLiquidacionpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_CALCULARDIFLIQUIDACION_SOLICITUDCALCULARDIFLIQUIDACIONPTHISSOLICITUD = "Clas_1431957012480960Ser_60Arg_1_Alias";
    /** <code>solicitudcalcularDifLiquidacionpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_CALCULARDIFLIQUIDACION_SOLICITUDCALCULARDIFLIQUIDACIONPTHISSOLICITUD = "Solicitud";
    // Service (validarAtributosUsuario)
    /** <code>validarAtributosUsuario</code> service id. */
    public static final String SERV_ID_VALIDARATRIBUTOSUSUARIO = "Clas_1431957012480960Ser_65_Alias";
    /** <code>validarAtributosUsuario</code> service name. */
    public static final String SERV_NAME_VALIDARATRIBUTOSUSUARIO = "validarAtributosUsuario";
    /** <code>validarAtributosUsuario</code> service alias. */
    public static final String SERV_ALIAS_VALIDARATRIBUTOSUSUARIO = "validarAtributosUsuario";
    /** Agents allowed to execute the service validarAtributosUsuario **/
    public static final String VALIDARATRIBUTOSUSUARIO_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Preconditions
    /** <code>validarAtributosUsuario</code> precondition 0 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_0 = "Clas_1431957012480960Pre_25_MsgError";
    /** <code>validarAtributosUsuario</code> precondition 1 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_1 = "Clas_1431957012480960Pre_26_MsgError";
    /** <code>validarAtributosUsuario</code> precondition 2 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_2 = "Clas_1431957012480960Pre_28_MsgError";
    /** <code>validarAtributosUsuario</code> precondition 3 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_3 = "Clas_1431957012480960Pre_29_MsgError";
    /** <code>validarAtributosUsuario</code> precondition 4 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_4 = "Clas_1431957012480960Pre_30_MsgError";
    /** <code>validarAtributosUsuario</code> precondition 5 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_5 = "Clas_1431957012480960Pre_31_MsgError";
    /** <code>validarAtributosUsuario</code> precondition 6 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_6 = "Clas_1431957012480960Pre_33_MsgError";
    /** <code>validarAtributosUsuario</code> precondition 7 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_7 = "Clas_1431957012480960Pre_34_MsgError";
    /** <code>validarAtributosUsuario</code> precondition 8 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_8 = "Clas_1431957012480960Pre_35_MsgError";
    /** <code>validarAtributosUsuario</code> precondition 9 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_9 = "Clas_1431957012480960Pre_36_MsgError";
    /** <code>validarAtributosUsuario</code> precondition 10 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_10 = "Clas_1431957012480960Pre_37_MsgError";
    /** <code>validarAtributosUsuario</code> precondition 11 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_11 = "Clas_1431957012480960Pre_38_MsgError";
    /** <code>validarAtributosUsuario</code> precondition 12 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_12 = "Clas_1431957012480960Pre_39_MsgError";
    /** <code>validarAtributosUsuario</code> precondition 13 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_13 = "Clas_1431957012480960Pre_40_MsgError";
    /** <code>validarAtributosUsuario</code> precondition 14 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_14 = "Clas_1431957012480960Pre_42_MsgError";
    /** <code>validarAtributosUsuario</code> precondition 15 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_15 = "Clas_1431957012480960Pre_47_MsgError";
    /** <code>validarAtributosUsuario</code> precondition 16 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_16 = "Clas_1431957012480960Pre_48_MsgError";
    /** <code>validarAtributosUsuario</code> precondition 17 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_17 = "Clas_1431957012480960Pre_58_MsgError";
    /** <code>validarAtributosUsuario</code> precondition 18 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_18 = "Clas_1431957012480960Pre_79_MsgError";
    /** <code>validarAtributosUsuario</code> precondition 19 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_19 = "Clas_1431957012480960Pre_143_MsgError";
    /** <code>validarAtributosUsuario</code> precondition 20 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_20 = "Clas_1431957012480960Pre_144_MsgError";
    /** <code>validarAtributosUsuario</code> precondition 21 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_21 = "Clas_1431957012480960Pre_145_MsgError";
    /** <code>validarAtributosUsuario</code> precondition 22 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_22 = "Clas_1431957012480960Pre_146_MsgError";
    /** <code>validarAtributosUsuario</code> precondition 23 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_23 = "Clas_1431957012480960Pre_147_MsgError";
    /** <code>validarAtributosUsuario</code> precondition 24 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_24 = "Clas_1431957012480960Pre_148_MsgError";
    /** <code>validarAtributosUsuario</code> precondition 25 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_25 = "Clas_1431957012480960Pre_149_MsgError";
    /** <code>validarAtributosUsuario</code> precondition 26 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_26 = "Clas_1431957012480960Pre_150_MsgError";
    /** <code>validarAtributosUsuario</code> precondition 27 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_27 = "Clas_1431957012480960Pre_151_MsgError";
    /** <code>validarAtributosUsuario</code> precondition 28 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_28 = "Clas_1431957012480960Pre_152_MsgError";
    /** <code>validarAtributosUsuario</code> precondition 29 id. */
    public static final String PRE_ID_VALIDARATRIBUTOSUSUARIO_29 = "Clas_1431957012480960Pre_154_MsgError";
    // Inbound arguments
    /** <code>solicitudvalidarAtributosUsuariopthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_VALIDARATRIBUTOSUSUARIO_SOLICITUDVALIDARATRIBUTOSUSUARIOPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudvalidarAtributosUsuariopthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_VALIDARATRIBUTOSUSUARIO_SOLICITUDVALIDARATRIBUTOSUSUARIOPTHISSOLICITUD = "Clas_1431957012480960Ser_65Arg_1_Alias";
    /** <code>solicitudvalidarAtributosUsuariopthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_VALIDARATRIBUTOSUSUARIO_SOLICITUDVALIDARATRIBUTOSUSUARIOPTHISSOLICITUD = "Solicitud";
    // Outbound arguments
    /** <code>solicitudvalidarAtributosUsuarioptpsNumSolicitud</code> outbound argument name. */
    public static final String ARG_NAME_VALIDARATRIBUTOSUSUARIO_SOLICITUDVALIDARATRIBUTOSUSUARIOPTPSNUMSOLICITUD = "solicitudvalidarAtributosUsuarioptpsNumSolicitud";
    /** <code>solicitudvalidarAtributosUsuarioptpsNumSolicitud</code> outbound argument id. */
    public static final String ARG_ID_VALIDARATRIBUTOSUSUARIO_SOLICITUDVALIDARATRIBUTOSUSUARIOPTPSNUMSOLICITUD = "Clas_1431957012480960Ser_65Arg_2_Alias";
    /** <code>solicitudvalidarAtributosUsuarioptpsNumSolicitud</code> outbound argument alias. */
    public static final String ARG_ALIAS_VALIDARATRIBUTOSUSUARIO_SOLICITUDVALIDARATRIBUTOSUSUARIOPTPSNUMSOLICITUD = "pt_ps_NumSolicitud";
    // Service (calcularURLPasarelaPagos)
    /** <code>calcularURLPasarelaPagos</code> service id. */
    public static final String SERV_ID_CALCULARURLPASARELAPAGOS = "Clas_1431957012480960Ser_67_Alias";
    /** <code>calcularURLPasarelaPagos</code> service name. */
    public static final String SERV_NAME_CALCULARURLPASARELAPAGOS = "calcularURLPasarelaPagos";
    /** <code>calcularURLPasarelaPagos</code> service alias. */
    public static final String SERV_ALIAS_CALCULARURLPASARELAPAGOS = "calcularURLPasarelaPagos";
    /** Agents allowed to execute the service calcularURLPasarelaPagos **/
    public static final String CALCULARURLPASARELAPAGOS_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    // Inbound arguments
    /** <code>solicitudcalcularURLPasarelaPagospthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_CALCULARURLPASARELAPAGOS_SOLICITUDCALCULARURLPASARELAPAGOSPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudcalcularURLPasarelaPagospthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_CALCULARURLPASARELAPAGOS_SOLICITUDCALCULARURLPASARELAPAGOSPTHISSOLICITUD = "Clas_1431957012480960Ser_67Arg_1_Alias";
    /** <code>solicitudcalcularURLPasarelaPagospthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_CALCULARURLPASARELAPAGOS_SOLICITUDCALCULARURLPASARELAPAGOSPTHISSOLICITUD = "Solicitud";
    // Outbound arguments
    /** <code>solicitudcalcularURLPasarelaPagospsURLPagos</code> outbound argument name. */
    public static final String ARG_NAME_CALCULARURLPASARELAPAGOS_SOLICITUDCALCULARURLPASARELAPAGOSPSURLPAGOS = "solicitudcalcularURLPasarelaPagospsURLPagos";
    /** <code>solicitudcalcularURLPasarelaPagospsURLPagos</code> outbound argument id. */
    public static final String ARG_ID_CALCULARURLPASARELAPAGOS_SOLICITUDCALCULARURLPASARELAPAGOSPSURLPAGOS = "Clas_1431957012480960Ser_67Arg_2_Alias";
    /** <code>solicitudcalcularURLPasarelaPagospsURLPagos</code> outbound argument alias. */
    public static final String ARG_ALIAS_CALCULARURLPASARELAPAGOS_SOLICITUDCALCULARURLPASARELAPAGOSPSURLPAGOS = "URL Pagos";
    // Service (enviarEmailURLPago)
    /** <code>enviarEmailURLPago</code> service id. */
    public static final String SERV_ID_ENVIAREMAILURLPAGO = "Clas_1431957012480960Ser_68_Alias";
    /** <code>enviarEmailURLPago</code> service name. */
    public static final String SERV_NAME_ENVIAREMAILURLPAGO = "enviarEmailURLPago";
    /** <code>enviarEmailURLPago</code> service alias. */
    public static final String SERV_ALIAS_ENVIAREMAILURLPAGO = "enviarEmailURLPago";
    /** Agents allowed to execute the service enviarEmailURLPago **/
    public static final String ENVIAREMAILURLPAGO_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    // Inbound arguments
    /** <code>solicitudenviarEmailURLPagopthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_ENVIAREMAILURLPAGO_SOLICITUDENVIAREMAILURLPAGOPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudenviarEmailURLPagopthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_ENVIAREMAILURLPAGO_SOLICITUDENVIAREMAILURLPAGOPTHISSOLICITUD = "Clas_1431957012480960Ser_68Arg_1_Alias";
    /** <code>solicitudenviarEmailURLPagopthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_ENVIAREMAILURLPAGO_SOLICITUDENVIAREMAILURLPAGOPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudenviarEmailURLPagopURLPago</code> inbound argument name. */
    public static final String ARG_NAME_ENVIAREMAILURLPAGO_SOLICITUDENVIAREMAILURLPAGOPURLPAGO = "p_URLPago";
    /** <code>solicitudenviarEmailURLPagopURLPago</code> inbound argument id. */
    public static final String ARG_ID_ENVIAREMAILURLPAGO_SOLICITUDENVIAREMAILURLPAGOPURLPAGO = "Clas_1431957012480960Ser_68Arg_2_Alias";
    /** <code>solicitudenviarEmailURLPagopURLPago</code> inbound argument alias. */
    public static final String ARG_ALIAS_ENVIAREMAILURLPAGO_SOLICITUDENVIAREMAILURLPAGOPURLPAGO = "URL de pago";
    /** <code>solicitudenviarEmailURLPagopePlantilla</code> inbound argument name. */
    public static final String ARG_NAME_ENVIAREMAILURLPAGO_SOLICITUDENVIAREMAILURLPAGOPEPLANTILLA = "pePlantilla";
    /** <code>solicitudenviarEmailURLPagopePlantilla</code> inbound argument id. */
    public static final String ARG_ID_ENVIAREMAILURLPAGO_SOLICITUDENVIAREMAILURLPAGOPEPLANTILLA = "Clas_1431957012480960Ser_68Arg_3_Alias";
    /** <code>solicitudenviarEmailURLPagopePlantilla</code> inbound argument alias. */
    public static final String ARG_ALIAS_ENVIAREMAILURLPAGO_SOLICITUDENVIAREMAILURLPAGOPEPLANTILLA = "Plantilla email";
    // Service (enviarEmailDocumentacion)
    /** <code>enviarEmailDocumentacion</code> service id. */
    public static final String SERV_ID_ENVIAREMAILDOCUMENTACION = "Clas_1431957012480960Ser_69_Alias";
    /** <code>enviarEmailDocumentacion</code> service name. */
    public static final String SERV_NAME_ENVIAREMAILDOCUMENTACION = "enviarEmailDocumentacion";
    /** <code>enviarEmailDocumentacion</code> service alias. */
    public static final String SERV_ALIAS_ENVIAREMAILDOCUMENTACION = "enviarEmailDocumentacion";
    /** Agents allowed to execute the service enviarEmailDocumentacion **/
    public static final String ENVIAREMAILDOCUMENTACION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudenviarEmailDocumentacionpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_ENVIAREMAILDOCUMENTACION_SOLICITUDENVIAREMAILDOCUMENTACIONPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudenviarEmailDocumentacionpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_ENVIAREMAILDOCUMENTACION_SOLICITUDENVIAREMAILDOCUMENTACIONPTHISSOLICITUD = "Clas_1431957012480960Ser_69Arg_1_Alias";
    /** <code>solicitudenviarEmailDocumentacionpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_ENVIAREMAILDOCUMENTACION_SOLICITUDENVIAREMAILDOCUMENTACIONPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudenviarEmailDocumentacionpfuRutaAdjunto</code> inbound argument name. */
    public static final String ARG_NAME_ENVIAREMAILDOCUMENTACION_SOLICITUDENVIAREMAILDOCUMENTACIONPFURUTAADJUNTO = "pfu_RutaAdjunto";
    /** <code>solicitudenviarEmailDocumentacionpfuRutaAdjunto</code> inbound argument id. */
    public static final String ARG_ID_ENVIAREMAILDOCUMENTACION_SOLICITUDENVIAREMAILDOCUMENTACIONPFURUTAADJUNTO = "Clas_1431957012480960Ser_69Arg_2_Alias";
    /** <code>solicitudenviarEmailDocumentacionpfuRutaAdjunto</code> inbound argument alias. */
    public static final String ARG_ALIAS_ENVIAREMAILDOCUMENTACION_SOLICITUDENVIAREMAILDOCUMENTACIONPFURUTAADJUNTO = "Adjunto";
    /** <code>solicitudenviarEmailDocumentacionpePlantilla</code> inbound argument name. */
    public static final String ARG_NAME_ENVIAREMAILDOCUMENTACION_SOLICITUDENVIAREMAILDOCUMENTACIONPEPLANTILLA = "pePlantilla";
    /** <code>solicitudenviarEmailDocumentacionpePlantilla</code> inbound argument id. */
    public static final String ARG_ID_ENVIAREMAILDOCUMENTACION_SOLICITUDENVIAREMAILDOCUMENTACIONPEPLANTILLA = "Clas_1431957012480960Ser_69Arg_3_Alias";
    /** <code>solicitudenviarEmailDocumentacionpePlantilla</code> inbound argument alias. */
    public static final String ARG_ALIAS_ENVIAREMAILDOCUMENTACION_SOLICITUDENVIAREMAILDOCUMENTACIONPEPLANTILLA = "Plantilla email";
    // Service (InsContratoCASolicitud)
    /** <code>InsContratoCASolicitud</code> service id. */
    public static final String SERV_ID_INSCONTRATOCASOLICITUD = "Clas_1431957012480960Ser_71_Alias";
    /** <code>InsContratoCASolicitud</code> service name. */
    public static final String SERV_NAME_INSCONTRATOCASOLICITUD = "InsContratoCASolicitud";
    /** <code>InsContratoCASolicitud</code> service alias. */
    public static final String SERV_ALIAS_INSCONTRATOCASOLICITUD = "InsContratoCASolicitud";
    /** Agents allowed to execute the service InsContratoCASolicitud **/
    public static final String INSCONTRATOCASOLICITUD_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Inbound arguments
    /** <code>solicitudInsContratoCASolicitudpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_INSCONTRATOCASOLICITUD_SOLICITUDINSCONTRATOCASOLICITUDPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudInsContratoCASolicitudpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_INSCONTRATOCASOLICITUD_SOLICITUDINSCONTRATOCASOLICITUDPTHISSOLICITUD = "Clas_1431957012480960Ser_71Arg_1_Alias";
    /** <code>solicitudInsContratoCASolicitudpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSCONTRATOCASOLICITUD_SOLICITUDINSCONTRATOCASOLICITUDPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudInsContratoCASolicitudpevcContratoC</code> inbound argument name. */
    public static final String ARG_NAME_INSCONTRATOCASOLICITUD_SOLICITUDINSCONTRATOCASOLICITUDPEVCCONTRATOC = "p_evcContratoC";
    /** <code>solicitudInsContratoCASolicitudpevcContratoC</code> inbound argument id. */
    public static final String ARG_ID_INSCONTRATOCASOLICITUD_SOLICITUDINSCONTRATOCASOLICITUDPEVCCONTRATOC = "Clas_1431957012480960Ser_71Arg_2_Alias";
    /** <code>solicitudInsContratoCASolicitudpevcContratoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSCONTRATOCASOLICITUD_SOLICITUDINSCONTRATOCASOLICITUDPEVCCONTRATOC = "Contrato CORE";
    // Service (DelContratoCASolicitud)
    /** <code>DelContratoCASolicitud</code> service id. */
    public static final String SERV_ID_DELCONTRATOCASOLICITUD = "Clas_1431957012480960Ser_72_Alias";
    /** <code>DelContratoCASolicitud</code> service name. */
    public static final String SERV_NAME_DELCONTRATOCASOLICITUD = "DelContratoCASolicitud";
    /** <code>DelContratoCASolicitud</code> service alias. */
    public static final String SERV_ALIAS_DELCONTRATOCASOLICITUD = "DelContratoCASolicitud";
    /** Agents allowed to execute the service DelContratoCASolicitud **/
    public static final String DELCONTRATOCASOLICITUD_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Inbound arguments
    /** <code>solicitudDelContratoCASolicitudpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_DELCONTRATOCASOLICITUD_SOLICITUDDELCONTRATOCASOLICITUDPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudDelContratoCASolicitudpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_DELCONTRATOCASOLICITUD_SOLICITUDDELCONTRATOCASOLICITUDPTHISSOLICITUD = "Clas_1431957012480960Ser_72Arg_1_Alias";
    /** <code>solicitudDelContratoCASolicitudpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELCONTRATOCASOLICITUD_SOLICITUDDELCONTRATOCASOLICITUDPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudDelContratoCASolicitudpevcContratoC</code> inbound argument name. */
    public static final String ARG_NAME_DELCONTRATOCASOLICITUD_SOLICITUDDELCONTRATOCASOLICITUDPEVCCONTRATOC = "p_evcContratoC";
    /** <code>solicitudDelContratoCASolicitudpevcContratoC</code> inbound argument id. */
    public static final String ARG_ID_DELCONTRATOCASOLICITUD_SOLICITUDDELCONTRATOCASOLICITUDPEVCCONTRATOC = "Clas_1431957012480960Ser_72Arg_2_Alias";
    /** <code>solicitudDelContratoCASolicitudpevcContratoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELCONTRATOCASOLICITUD_SOLICITUDDELCONTRATOCASOLICITUDPEVCCONTRATOC = "Contrato CORE";
    // Service (searchDocumentoNumId)
    /** <code>searchDocumentoNumId</code> service id. */
    public static final String SERV_ID_SEARCHDOCUMENTONUMID = "Clas_1431957012480960Ser_79_Alias";
    /** <code>searchDocumentoNumId</code> service name. */
    public static final String SERV_NAME_SEARCHDOCUMENTONUMID = "searchDocumentoNumId";
    /** <code>searchDocumentoNumId</code> service alias. */
    public static final String SERV_ALIAS_SEARCHDOCUMENTONUMID = "Buscar documento por Nº Id";
    /** Agents allowed to execute the service searchDocumentoNumId **/
    public static final String SEARCHDOCUMENTONUMID_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudsearchDocumentoNumIdpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_SEARCHDOCUMENTONUMID_SOLICITUDSEARCHDOCUMENTONUMIDPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudsearchDocumentoNumIdpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_SEARCHDOCUMENTONUMID_SOLICITUDSEARCHDOCUMENTONUMIDPTHISSOLICITUD = "Clas_1431957012480960Ser_79Arg_1_Alias";
    /** <code>solicitudsearchDocumentoNumIdpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_SEARCHDOCUMENTONUMID_SOLICITUDSEARCHDOCUMENTONUMIDPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudsearchDocumentoNumIdpNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_SEARCHDOCUMENTONUMID_SOLICITUDSEARCHDOCUMENTONUMIDPNUMIDENTIFICACION = "p_NumIdentificacion";
    /** <code>solicitudsearchDocumentoNumIdpNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_SEARCHDOCUMENTONUMID_SOLICITUDSEARCHDOCUMENTONUMIDPNUMIDENTIFICACION = "Clas_1431957012480960Ser_79Arg_2_Alias";
    /** <code>solicitudsearchDocumentoNumIdpNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_SEARCHDOCUMENTONUMID_SOLICITUDSEARCHDOCUMENTONUMIDPNUMIDENTIFICACION = "p_NumIdentificacion";
    // Outbound arguments
    /** <code>solicitudsearchDocumentoNumIdpfuIdDocEnGestor</code> outbound argument name. */
    public static final String ARG_NAME_SEARCHDOCUMENTONUMID_SOLICITUDSEARCHDOCUMENTONUMIDPFUIDDOCENGESTOR = "solicitudsearchDocumentoNumIdpfuIdDocEnGestor";
    /** <code>solicitudsearchDocumentoNumIdpfuIdDocEnGestor</code> outbound argument id. */
    public static final String ARG_ID_SEARCHDOCUMENTONUMID_SOLICITUDSEARCHDOCUMENTONUMIDPFUIDDOCENGESTOR = "Clas_1431957012480960Ser_79Arg_3_Alias";
    /** <code>solicitudsearchDocumentoNumIdpfuIdDocEnGestor</code> outbound argument alias. */
    public static final String ARG_ALIAS_SEARCHDOCUMENTONUMID_SOLICITUDSEARCHDOCUMENTONUMIDPFUIDDOCENGESTOR = "pfu_IdDocEnGestor";
    // Service (searchDocumentoSolicitud)
    /** <code>searchDocumentoSolicitud</code> service id. */
    public static final String SERV_ID_SEARCHDOCUMENTOSOLICITUD = "Clas_1431957012480960Ser_80_Alias";
    /** <code>searchDocumentoSolicitud</code> service name. */
    public static final String SERV_NAME_SEARCHDOCUMENTOSOLICITUD = "searchDocumentoSolicitud";
    /** <code>searchDocumentoSolicitud</code> service alias. */
    public static final String SERV_ALIAS_SEARCHDOCUMENTOSOLICITUD = "Buscar documento de solicitud";
    /** Agents allowed to execute the service searchDocumentoSolicitud **/
    public static final String SEARCHDOCUMENTOSOLICITUD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudsearchDocumentoSolicitudpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_SEARCHDOCUMENTOSOLICITUD_SOLICITUDSEARCHDOCUMENTOSOLICITUDPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudsearchDocumentoSolicitudpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_SEARCHDOCUMENTOSOLICITUD_SOLICITUDSEARCHDOCUMENTOSOLICITUDPTHISSOLICITUD = "Clas_1431957012480960Ser_80Arg_1_Alias";
    /** <code>solicitudsearchDocumentoSolicitudpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_SEARCHDOCUMENTOSOLICITUD_SOLICITUDSEARCHDOCUMENTOSOLICITUDPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudsearchDocumentoSolicitudpNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_SEARCHDOCUMENTOSOLICITUD_SOLICITUDSEARCHDOCUMENTOSOLICITUDPNUMIDENTIFICACION = "p_NumIdentificacion";
    /** <code>solicitudsearchDocumentoSolicitudpNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_SEARCHDOCUMENTOSOLICITUD_SOLICITUDSEARCHDOCUMENTOSOLICITUDPNUMIDENTIFICACION = "Clas_1431957012480960Ser_80Arg_2_Alias";
    /** <code>solicitudsearchDocumentoSolicitudpNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_SEARCHDOCUMENTOSOLICITUD_SOLICITUDSEARCHDOCUMENTOSOLICITUDPNUMIDENTIFICACION = "p_NumIdentificacion";
    // Outbound arguments
    /** <code>solicitudsearchDocumentoSolicitudpfuIdDocEnGestor</code> outbound argument name. */
    public static final String ARG_NAME_SEARCHDOCUMENTOSOLICITUD_SOLICITUDSEARCHDOCUMENTOSOLICITUDPFUIDDOCENGESTOR = "solicitudsearchDocumentoSolicitudpfuIdDocEnGestor";
    /** <code>solicitudsearchDocumentoSolicitudpfuIdDocEnGestor</code> outbound argument id. */
    public static final String ARG_ID_SEARCHDOCUMENTOSOLICITUD_SOLICITUDSEARCHDOCUMENTOSOLICITUDPFUIDDOCENGESTOR = "Clas_1431957012480960Ser_80Arg_3_Alias";
    /** <code>solicitudsearchDocumentoSolicitudpfuIdDocEnGestor</code> outbound argument alias. */
    public static final String ARG_ALIAS_SEARCHDOCUMENTOSOLICITUD_SOLICITUDSEARCHDOCUMENTOSOLICITUDPFUIDDOCENGESTOR = "pfu_IdDocEnGestor";
    // Service (setCodTarifa)
    /** <code>setCodTarifa</code> service id. */
    public static final String SERV_ID_SETCODTARIFA = "Clas_1431957012480960Ser_98_Alias";
    /** <code>setCodTarifa</code> service name. */
    public static final String SERV_NAME_SETCODTARIFA = "setCodTarifa";
    /** <code>setCodTarifa</code> service alias. */
    public static final String SERV_ALIAS_SETCODTARIFA = "setCodTarifa";
    /** Agents allowed to execute the service setCodTarifa **/
    public static final String SETCODTARIFA_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    // Inbound arguments
    /** <code>solicitudsetCodTarifapthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_SETCODTARIFA_SOLICITUDSETCODTARIFAPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudsetCodTarifapthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_SETCODTARIFA_SOLICITUDSETCODTARIFAPTHISSOLICITUD = "Clas_1431957012480960Ser_98Arg_1_Alias";
    /** <code>solicitudsetCodTarifapthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETCODTARIFA_SOLICITUDSETCODTARIFAPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudsetCodTarifapeCodTarifa</code> inbound argument name. */
    public static final String ARG_NAME_SETCODTARIFA_SOLICITUDSETCODTARIFAPECODTARIFA = "peCodTarifa";
    /** <code>solicitudsetCodTarifapeCodTarifa</code> inbound argument id. */
    public static final String ARG_ID_SETCODTARIFA_SOLICITUDSETCODTARIFAPECODTARIFA = "Clas_1431957012480960Ser_98Arg_2_Alias";
    /** <code>solicitudsetCodTarifapeCodTarifa</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETCODTARIFA_SOLICITUDSETCODTARIFAPECODTARIFA = "Cod. Tarifa";
    // Service (dummyDevolverIntString)
    /** <code>dummyDevolverIntString</code> service id. */
    public static final String SERV_ID_DUMMYDEVOLVERINTSTRING = "Clas_1431957012480960Ser_99_Alias";
    /** <code>dummyDevolverIntString</code> service name. */
    public static final String SERV_NAME_DUMMYDEVOLVERINTSTRING = "dummyDevolverIntString";
    /** <code>dummyDevolverIntString</code> service alias. */
    public static final String SERV_ALIAS_DUMMYDEVOLVERINTSTRING = "dummyDevolverIntString";
    /** Agents allowed to execute the service dummyDevolverIntString **/
    public static final String DUMMYDEVOLVERINTSTRING_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicituddummyDevolverIntStringpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_DUMMYDEVOLVERINTSTRING_SOLICITUDDUMMYDEVOLVERINTSTRINGPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicituddummyDevolverIntStringpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_DUMMYDEVOLVERINTSTRING_SOLICITUDDUMMYDEVOLVERINTSTRINGPTHISSOLICITUD = "Clas_1431957012480960Ser_99Arg_1_Alias";
    /** <code>solicituddummyDevolverIntStringpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_DUMMYDEVOLVERINTSTRING_SOLICITUDDUMMYDEVOLVERINTSTRINGPTHISSOLICITUD = "Solicitud";
    // Outbound arguments
    /** <code>solicituddummyDevolverIntStringpsBool</code> outbound argument name. */
    public static final String ARG_NAME_DUMMYDEVOLVERINTSTRING_SOLICITUDDUMMYDEVOLVERINTSTRINGPSBOOL = "solicituddummyDevolverIntStringpsBool";
    /** <code>solicituddummyDevolverIntStringpsBool</code> outbound argument id. */
    public static final String ARG_ID_DUMMYDEVOLVERINTSTRING_SOLICITUDDUMMYDEVOLVERINTSTRINGPSBOOL = "Clas_1431957012480960Ser_99Arg_4_Alias";
    /** <code>solicituddummyDevolverIntStringpsBool</code> outbound argument alias. */
    public static final String ARG_ALIAS_DUMMYDEVOLVERINTSTRING_SOLICITUDDUMMYDEVOLVERINTSTRINGPSBOOL = "psBool";
    /** <code>solicituddummyDevolverIntStringpsEstadoSolicitud</code> outbound argument name. */
    public static final String ARG_NAME_DUMMYDEVOLVERINTSTRING_SOLICITUDDUMMYDEVOLVERINTSTRINGPSESTADOSOLICITUD = "solicituddummyDevolverIntStringpsEstadoSolicitud";
    /** <code>solicituddummyDevolverIntStringpsEstadoSolicitud</code> outbound argument id. */
    public static final String ARG_ID_DUMMYDEVOLVERINTSTRING_SOLICITUDDUMMYDEVOLVERINTSTRINGPSESTADOSOLICITUD = "Clas_1431957012480960Ser_99Arg_5_Alias";
    /** <code>solicituddummyDevolverIntStringpsEstadoSolicitud</code> outbound argument alias. */
    public static final String ARG_ALIAS_DUMMYDEVOLVERINTSTRING_SOLICITUDDUMMYDEVOLVERINTSTRINGPSESTADOSOLICITUD = "psEstadoSolicitud";
    // Service (dummyDevolverErroresWS)
    /** <code>dummyDevolverErroresWS</code> service id. */
    public static final String SERV_ID_DUMMYDEVOLVERERRORESWS = "Clas_1431957012480960Ser_100_Alias";
    /** <code>dummyDevolverErroresWS</code> service name. */
    public static final String SERV_NAME_DUMMYDEVOLVERERRORESWS = "dummyDevolverErroresWS";
    /** <code>dummyDevolverErroresWS</code> service alias. */
    public static final String SERV_ALIAS_DUMMYDEVOLVERERRORESWS = "dummyDevolverErroresWS";
    /** Agents allowed to execute the service dummyDevolverErroresWS **/
    public static final String DUMMYDEVOLVERERRORESWS_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    // Inbound arguments
    /** <code>solicituddummyDevolverErroresWSpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_DUMMYDEVOLVERERRORESWS_SOLICITUDDUMMYDEVOLVERERRORESWSPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicituddummyDevolverErroresWSpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_DUMMYDEVOLVERERRORESWS_SOLICITUDDUMMYDEVOLVERERRORESWSPTHISSOLICITUD = "Clas_1431957012480960Ser_100Arg_1_Alias";
    /** <code>solicituddummyDevolverErroresWSpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_DUMMYDEVOLVERERRORESWS_SOLICITUDDUMMYDEVOLVERERRORESWSPTHISSOLICITUD = "Solicitud";
    // Outbound arguments
    /** <code>solicituddummyDevolverErroresWSpsErroresWS</code> outbound argument name. */
    public static final String ARG_NAME_DUMMYDEVOLVERERRORESWS_SOLICITUDDUMMYDEVOLVERERRORESWSPSERRORESWS = "solicituddummyDevolverErroresWSpsErroresWS";
    /** <code>solicituddummyDevolverErroresWSpsErroresWS</code> outbound argument id. */
    public static final String ARG_ID_DUMMYDEVOLVERERRORESWS_SOLICITUDDUMMYDEVOLVERERRORESWSPSERRORESWS = "Clas_1431957012480960Ser_100Arg_2_Alias";
    /** <code>solicituddummyDevolverErroresWSpsErroresWS</code> outbound argument alias. */
    public static final String ARG_ALIAS_DUMMYDEVOLVERERRORESWS_SOLICITUDDUMMYDEVOLVERERRORESWSPSERRORESWS = "psErroresWS";
    // Service (marcarCompletada)
    /** <code>marcarCompletada</code> service id. */
    public static final String SERV_ID_MARCARCOMPLETADA = "Clas_1431957012480960Ser_103_Alias";
    /** <code>marcarCompletada</code> service name. */
    public static final String SERV_NAME_MARCARCOMPLETADA = "marcarCompletada";
    /** <code>marcarCompletada</code> service alias. */
    public static final String SERV_ALIAS_MARCARCOMPLETADA = "Marcar completada";
    /** Agents allowed to execute the service marcarCompletada **/
    public static final String MARCARCOMPLETADA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudmarcarCompletadapthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_MARCARCOMPLETADA_SOLICITUDMARCARCOMPLETADAPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudmarcarCompletadapthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_MARCARCOMPLETADA_SOLICITUDMARCARCOMPLETADAPTHISSOLICITUD = "Clas_1431957012480960Ser_103Arg_1_Alias";
    /** <code>solicitudmarcarCompletadapthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_MARCARCOMPLETADA_SOLICITUDMARCARCOMPLETADAPTHISSOLICITUD = "Solicitud";
    // Service (cambiarEstado)
    /** <code>cambiarEstado</code> service id. */
    public static final String SERV_ID_CAMBIARESTADO = "Clas_1431957012480960Ser_104_Alias";
    /** <code>cambiarEstado</code> service name. */
    public static final String SERV_NAME_CAMBIARESTADO = "cambiarEstado";
    /** <code>cambiarEstado</code> service alias. */
    public static final String SERV_ALIAS_CAMBIARESTADO = "cambiarEstado";
    /** Agents allowed to execute the service cambiarEstado **/
    public static final String CAMBIARESTADO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudcambiarEstadopthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARESTADO_SOLICITUDCAMBIARESTADOPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudcambiarEstadopthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARESTADO_SOLICITUDCAMBIARESTADOPTHISSOLICITUD = "Clas_1431957012480960Ser_104Arg_1_Alias";
    /** <code>solicitudcambiarEstadopthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARESTADO_SOLICITUDCAMBIARESTADOPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudcambiarEstadopeEstado</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARESTADO_SOLICITUDCAMBIARESTADOPEESTADO = "peEstado";
    /** <code>solicitudcambiarEstadopeEstado</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARESTADO_SOLICITUDCAMBIARESTADOPEESTADO = "Clas_1431957012480960Ser_104Arg_2_Alias";
    /** <code>solicitudcambiarEstadopeEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARESTADO_SOLICITUDCAMBIARESTADOPEESTADO = "Estado";
    // Service (marcarNoCompletada)
    /** <code>marcarNoCompletada</code> service id. */
    public static final String SERV_ID_MARCARNOCOMPLETADA = "Clas_1431957012480960Ser_107_Alias";
    /** <code>marcarNoCompletada</code> service name. */
    public static final String SERV_NAME_MARCARNOCOMPLETADA = "marcarNoCompletada";
    /** <code>marcarNoCompletada</code> service alias. */
    public static final String SERV_ALIAS_MARCARNOCOMPLETADA = "Marcar completada";
    /** Agents allowed to execute the service marcarNoCompletada **/
    public static final String MARCARNOCOMPLETADA_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    // Inbound arguments
    /** <code>solicitudmarcarNoCompletadapthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_MARCARNOCOMPLETADA_SOLICITUDMARCARNOCOMPLETADAPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudmarcarNoCompletadapthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_MARCARNOCOMPLETADA_SOLICITUDMARCARNOCOMPLETADAPTHISSOLICITUD = "Clas_1431957012480960Ser_107Arg_1_Alias";
    /** <code>solicitudmarcarNoCompletadapthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_MARCARNOCOMPLETADA_SOLICITUDMARCARNOCOMPLETADAPTHISSOLICITUD = "Solicitud";
    // Service (setFechaIniContIncl)
    /** <code>setFechaIniContIncl</code> service id. */
    public static final String SERV_ID_SETFECHAINICONTINCL = "Clas_1431957012480960Ser_108_Alias";
    /** <code>setFechaIniContIncl</code> service name. */
    public static final String SERV_NAME_SETFECHAINICONTINCL = "setFechaIniContIncl";
    /** <code>setFechaIniContIncl</code> service alias. */
    public static final String SERV_ALIAS_SETFECHAINICONTINCL = "setFechaIniContIncl";
    /** Agents allowed to execute the service setFechaIniContIncl **/
    public static final String SETFECHAINICONTINCL_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudsetFechaIniContInclpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_SETFECHAINICONTINCL_SOLICITUDSETFECHAINICONTINCLPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudsetFechaIniContInclpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_SETFECHAINICONTINCL_SOLICITUDSETFECHAINICONTINCLPTHISSOLICITUD = "Clas_1431957012480960Ser_108Arg_1_Alias";
    /** <code>solicitudsetFechaIniContInclpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETFECHAINICONTINCL_SOLICITUDSETFECHAINICONTINCLPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudsetFechaIniContInclpeFecha</code> inbound argument name. */
    public static final String ARG_NAME_SETFECHAINICONTINCL_SOLICITUDSETFECHAINICONTINCLPEFECHA = "peFecha";
    /** <code>solicitudsetFechaIniContInclpeFecha</code> inbound argument id. */
    public static final String ARG_ID_SETFECHAINICONTINCL_SOLICITUDSETFECHAINICONTINCLPEFECHA = "Clas_1431957012480960Ser_108Arg_2_Alias";
    /** <code>solicitudsetFechaIniContInclpeFecha</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETFECHAINICONTINCL_SOLICITUDSETFECHAINICONTINCLPEFECHA = "Fecha inicio vigencia contrato inclusión";
    // Service (modFechaInicioContratacion)
    /** <code>modFechaInicioContratacion</code> service id. */
    public static final String SERV_ID_MODFECHAINICIOCONTRATACION = "Clas_1431957012480960Ser_116_Alias";
    /** <code>modFechaInicioContratacion</code> service name. */
    public static final String SERV_NAME_MODFECHAINICIOCONTRATACION = "modFechaInicioContratacion";
    /** <code>modFechaInicioContratacion</code> service alias. */
    public static final String SERV_ALIAS_MODFECHAINICIOCONTRATACION = "Modificar encabezado";
    /** Agents allowed to execute the service modFechaInicioContratacion **/
    public static final String MODFECHAINICIOCONTRATACION_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Inbound arguments
    /** <code>solicitudmodFechaInicioContratacionpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_MODFECHAINICIOCONTRATACION_SOLICITUDMODFECHAINICIOCONTRATACIONPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudmodFechaInicioContratacionpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_MODFECHAINICIOCONTRATACION_SOLICITUDMODFECHAINICIOCONTRATACIONPTHISSOLICITUD = "Clas_1431957012480960Ser_116Arg_1_Alias";
    /** <code>solicitudmodFechaInicioContratacionpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODFECHAINICIOCONTRATACION_SOLICITUDMODFECHAINICIOCONTRATACIONPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudmodFechaInicioContratacionptFecha</code> inbound argument name. */
    public static final String ARG_NAME_MODFECHAINICIOCONTRATACION_SOLICITUDMODFECHAINICIOCONTRATACIONPTFECHA = "ptFecha";
    /** <code>solicitudmodFechaInicioContratacionptFecha</code> inbound argument id. */
    public static final String ARG_ID_MODFECHAINICIOCONTRATACION_SOLICITUDMODFECHAINICIOCONTRATACIONPTFECHA = "Clas_1431957012480960Ser_116Arg_2_Alias";
    /** <code>solicitudmodFechaInicioContratacionptFecha</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODFECHAINICIOCONTRATACION_SOLICITUDMODFECHAINICIOCONTRATACIONPTFECHA = "Fecha inicio contratación";
    // Service (InsUsrAreaMedica)
    /** <code>InsUsrAreaMedica</code> service id. */
    public static final String SERV_ID_INSUSRAREAMEDICA = "Clas_1431957012480960Ser_121_Alias";
    /** <code>InsUsrAreaMedica</code> service name. */
    public static final String SERV_NAME_INSUSRAREAMEDICA = "InsUsrAreaMedica";
    /** <code>InsUsrAreaMedica</code> service alias. */
    public static final String SERV_ALIAS_INSUSRAREAMEDICA = "InsUsrAreaMedica";
    /** Agents allowed to execute the service InsUsrAreaMedica **/
    public static final String INSUSRAREAMEDICA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudInsUsrAreaMedicapthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_INSUSRAREAMEDICA_SOLICITUDINSUSRAREAMEDICAPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudInsUsrAreaMedicapthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_INSUSRAREAMEDICA_SOLICITUDINSUSRAREAMEDICAPTHISSOLICITUD = "Clas_1431957012480960Ser_121Arg_1_Alias";
    /** <code>solicitudInsUsrAreaMedicapthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSUSRAREAMEDICA_SOLICITUDINSUSRAREAMEDICAPTHISSOLICITUD = "Solicitudes";
    /** <code>solicitudInsUsrAreaMedicapevcAreaMedica</code> inbound argument name. */
    public static final String ARG_NAME_INSUSRAREAMEDICA_SOLICITUDINSUSRAREAMEDICAPEVCAREAMEDICA = "p_evcAreaMedica";
    /** <code>solicitudInsUsrAreaMedicapevcAreaMedica</code> inbound argument id. */
    public static final String ARG_ID_INSUSRAREAMEDICA_SOLICITUDINSUSRAREAMEDICAPEVCAREAMEDICA = "Clas_1431957012480960Ser_121Arg_2_Alias";
    /** <code>solicitudInsUsrAreaMedicapevcAreaMedica</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSUSRAREAMEDICA_SOLICITUDINSUSRAREAMEDICAPEVCAREAMEDICA = "Usr. Area Médica";
    // Service (DelUsrAreaMedica)
    /** <code>DelUsrAreaMedica</code> service id. */
    public static final String SERV_ID_DELUSRAREAMEDICA = "Clas_1431957012480960Ser_122_Alias";
    /** <code>DelUsrAreaMedica</code> service name. */
    public static final String SERV_NAME_DELUSRAREAMEDICA = "DelUsrAreaMedica";
    /** <code>DelUsrAreaMedica</code> service alias. */
    public static final String SERV_ALIAS_DELUSRAREAMEDICA = "DelUsrAreaMedica";
    /** Agents allowed to execute the service DelUsrAreaMedica **/
    public static final String DELUSRAREAMEDICA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudDelUsrAreaMedicapthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_DELUSRAREAMEDICA_SOLICITUDDELUSRAREAMEDICAPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudDelUsrAreaMedicapthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_DELUSRAREAMEDICA_SOLICITUDDELUSRAREAMEDICAPTHISSOLICITUD = "Clas_1431957012480960Ser_122Arg_1_Alias";
    /** <code>solicitudDelUsrAreaMedicapthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELUSRAREAMEDICA_SOLICITUDDELUSRAREAMEDICAPTHISSOLICITUD = "Solicitudes";
    /** <code>solicitudDelUsrAreaMedicapevcAreaMedica</code> inbound argument name. */
    public static final String ARG_NAME_DELUSRAREAMEDICA_SOLICITUDDELUSRAREAMEDICAPEVCAREAMEDICA = "p_evcAreaMedica";
    /** <code>solicitudDelUsrAreaMedicapevcAreaMedica</code> inbound argument id. */
    public static final String ARG_ID_DELUSRAREAMEDICA_SOLICITUDDELUSRAREAMEDICAPEVCAREAMEDICA = "Clas_1431957012480960Ser_122Arg_2_Alias";
    /** <code>solicitudDelUsrAreaMedicapevcAreaMedica</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELUSRAREAMEDICA_SOLICITUDDELUSRAREAMEDICAPEVCAREAMEDICA = "Usr. Area Médica";
    // Service (asignarNumContrato)
    /** <code>asignarNumContrato</code> service id. */
    public static final String SERV_ID_ASIGNARNUMCONTRATO = "Clas_1431957012480960Ser_127_Alias";
    /** <code>asignarNumContrato</code> service name. */
    public static final String SERV_NAME_ASIGNARNUMCONTRATO = "asignarNumContrato";
    /** <code>asignarNumContrato</code> service alias. */
    public static final String SERV_ALIAS_ASIGNARNUMCONTRATO = "asignarNumContrato";
    /** Agents allowed to execute the service asignarNumContrato **/
    public static final String ASIGNARNUMCONTRATO_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    // Inbound arguments
    /** <code>solicitudasignarNumContratopthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_ASIGNARNUMCONTRATO_SOLICITUDASIGNARNUMCONTRATOPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudasignarNumContratopthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_ASIGNARNUMCONTRATO_SOLICITUDASIGNARNUMCONTRATOPTHISSOLICITUD = "Clas_1431957012480960Ser_127Arg_1_Alias";
    /** <code>solicitudasignarNumContratopthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_ASIGNARNUMCONTRATO_SOLICITUDASIGNARNUMCONTRATOPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudasignarNumContratopNumContrato</code> inbound argument name. */
    public static final String ARG_NAME_ASIGNARNUMCONTRATO_SOLICITUDASIGNARNUMCONTRATOPNUMCONTRATO = "p_NumContrato";
    /** <code>solicitudasignarNumContratopNumContrato</code> inbound argument id. */
    public static final String ARG_ID_ASIGNARNUMCONTRATO_SOLICITUDASIGNARNUMCONTRATOPNUMCONTRATO = "Clas_1431957012480960Ser_127Arg_2_Alias";
    /** <code>solicitudasignarNumContratopNumContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_ASIGNARNUMCONTRATO_SOLICITUDASIGNARNUMCONTRATOPNUMCONTRATO = "Nº Contrato";
    // Service (calcFechaIniContPlanVol)
    /** <code>calcFechaIniContPlanVol</code> service id. */
    public static final String SERV_ID_CALCFECHAINICONTPLANVOL = "Clas_1431957012480960Ser_128_Alias";
    /** <code>calcFechaIniContPlanVol</code> service name. */
    public static final String SERV_NAME_CALCFECHAINICONTPLANVOL = "calcFechaIniContPlanVol";
    /** <code>calcFechaIniContPlanVol</code> service alias. */
    public static final String SERV_ALIAS_CALCFECHAINICONTPLANVOL = "calcFechaIniContPlanVol";
    /** Agents allowed to execute the service calcFechaIniContPlanVol **/
    public static final String CALCFECHAINICONTPLANVOL_SRVAGENTS = "";
    // Preconditions
    /** <code>calcFechaIniContPlanVol</code> precondition 0 id. */
    public static final String PRE_ID_CALCFECHAINICONTPLANVOL_0 = "Clas_1431957012480960Pre_116_MsgError";
    // Inbound arguments
    /** <code>solicitudcalcFechaIniContPlanVolpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_CALCFECHAINICONTPLANVOL_SOLICITUDCALCFECHAINICONTPLANVOLPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudcalcFechaIniContPlanVolpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_CALCFECHAINICONTPLANVOL_SOLICITUDCALCFECHAINICONTPLANVOLPTHISSOLICITUD = "Clas_1431957012480960Ser_128Arg_1_Alias";
    /** <code>solicitudcalcFechaIniContPlanVolpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_CALCFECHAINICONTPLANVOL_SOLICITUDCALCFECHAINICONTPLANVOLPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudcalcFechaIniContPlanVolpDiaInicio</code> inbound argument name. */
    public static final String ARG_NAME_CALCFECHAINICONTPLANVOL_SOLICITUDCALCFECHAINICONTPLANVOLPDIAINICIO = "pDiaInicio";
    /** <code>solicitudcalcFechaIniContPlanVolpDiaInicio</code> inbound argument id. */
    public static final String ARG_ID_CALCFECHAINICONTPLANVOL_SOLICITUDCALCFECHAINICONTPLANVOLPDIAINICIO = "Clas_1431957012480960Ser_128Arg_2_Alias";
    /** <code>solicitudcalcFechaIniContPlanVolpDiaInicio</code> inbound argument alias. */
    public static final String ARG_ALIAS_CALCFECHAINICONTPLANVOL_SOLICITUDCALCFECHAINICONTPLANVOLPDIAINICIO = "pDiaInicio";
    /** <code>solicitudcalcFechaIniContPlanVolpDiaFin</code> inbound argument name. */
    public static final String ARG_NAME_CALCFECHAINICONTPLANVOL_SOLICITUDCALCFECHAINICONTPLANVOLPDIAFIN = "pDiaFin";
    /** <code>solicitudcalcFechaIniContPlanVolpDiaFin</code> inbound argument id. */
    public static final String ARG_ID_CALCFECHAINICONTPLANVOL_SOLICITUDCALCFECHAINICONTPLANVOLPDIAFIN = "Clas_1431957012480960Ser_128Arg_3_Alias";
    /** <code>solicitudcalcFechaIniContPlanVolpDiaFin</code> inbound argument alias. */
    public static final String ARG_ALIAS_CALCFECHAINICONTPLANVOL_SOLICITUDCALCFECHAINICONTPLANVOLPDIAFIN = "pDiaFin";
    /** <code>solicitudcalcFechaIniContPlanVolpFechaConfirmacion</code> inbound argument name. */
    public static final String ARG_NAME_CALCFECHAINICONTPLANVOL_SOLICITUDCALCFECHAINICONTPLANVOLPFECHACONFIRMACION = "pFechaConfirmacion";
    /** <code>solicitudcalcFechaIniContPlanVolpFechaConfirmacion</code> inbound argument id. */
    public static final String ARG_ID_CALCFECHAINICONTPLANVOL_SOLICITUDCALCFECHAINICONTPLANVOLPFECHACONFIRMACION = "Clas_1431957012480960Ser_128Arg_4_Alias";
    /** <code>solicitudcalcFechaIniContPlanVolpFechaConfirmacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CALCFECHAINICONTPLANVOL_SOLICITUDCALCFECHAINICONTPLANVOLPFECHACONFIRMACION = "pFechaConfirmacion";
    /** <code>solicitudcalcFechaIniContPlanVolpFechaDeParametrizacion</code> inbound argument name. */
    public static final String ARG_NAME_CALCFECHAINICONTPLANVOL_SOLICITUDCALCFECHAINICONTPLANVOLPFECHADEPARAMETRIZACION = "pFechaDeParametrizacion";
    /** <code>solicitudcalcFechaIniContPlanVolpFechaDeParametrizacion</code> inbound argument id. */
    public static final String ARG_ID_CALCFECHAINICONTPLANVOL_SOLICITUDCALCFECHAINICONTPLANVOLPFECHADEPARAMETRIZACION = "Clas_1431957012480960Ser_128Arg_5_Alias";
    /** <code>solicitudcalcFechaIniContPlanVolpFechaDeParametrizacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CALCFECHAINICONTPLANVOL_SOLICITUDCALCFECHAINICONTPLANVOLPFECHADEPARAMETRIZACION = "Fecha inicio contratación";
    // Service (dummyGenerarSolicitud)
    /** <code>dummyGenerarSolicitud</code> service id. */
    public static final String SERV_ID_DUMMYGENERARSOLICITUD = "Clas_1431957012480960Ser_130_Alias";
    /** <code>dummyGenerarSolicitud</code> service name. */
    public static final String SERV_NAME_DUMMYGENERARSOLICITUD = "dummyGenerarSolicitud";
    /** <code>dummyGenerarSolicitud</code> service alias. */
    public static final String SERV_ALIAS_DUMMYGENERARSOLICITUD = "Generar solicitud";
    /** Agents allowed to execute the service dummyGenerarSolicitud **/
    public static final String DUMMYGENERARSOLICITUD_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,MesaDeApoyo";
    // Inbound arguments
    /** <code>solicituddummyGenerarSolicitudpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_DUMMYGENERARSOLICITUD_SOLICITUDDUMMYGENERARSOLICITUDPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicituddummyGenerarSolicitudpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_DUMMYGENERARSOLICITUD_SOLICITUDDUMMYGENERARSOLICITUDPTHISSOLICITUD = "Clas_1431957012480960Ser_130Arg_1_Alias";
    /** <code>solicituddummyGenerarSolicitudpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_DUMMYGENERARSOLICITUD_SOLICITUDDUMMYGENERARSOLICITUDPTHISSOLICITUD = "Solicitud";
    // Service (checkDatosPagoNoOk)
    /** <code>checkDatosPagoNoOk</code> service id. */
    public static final String SERV_ID_CHECKDATOSPAGONOOK = "Clas_1431957012480960Ser_132_Alias";
    /** <code>checkDatosPagoNoOk</code> service name. */
    public static final String SERV_NAME_CHECKDATOSPAGONOOK = "checkDatosPagoNoOk";
    /** <code>checkDatosPagoNoOk</code> service alias. */
    public static final String SERV_ALIAS_CHECKDATOSPAGONOOK = "checkDatosPagoNoOk";
    /** Agents allowed to execute the service checkDatosPagoNoOk **/
    public static final String CHECKDATOSPAGONOOK_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudcheckDatosPagoNoOkpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_CHECKDATOSPAGONOOK_SOLICITUDCHECKDATOSPAGONOOKPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudcheckDatosPagoNoOkpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_CHECKDATOSPAGONOOK_SOLICITUDCHECKDATOSPAGONOOKPTHISSOLICITUD = "Clas_1431957012480960Ser_132Arg_1_Alias";
    /** <code>solicitudcheckDatosPagoNoOkpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_CHECKDATOSPAGONOOK_SOLICITUDCHECKDATOSPAGONOOKPTHISSOLICITUD = "Solicitud";
    // Service (dummyValidacionesFInicioCont)
    /** <code>dummyValidacionesFInicioCont</code> service id. */
    public static final String SERV_ID_DUMMYVALIDACIONESFINICIOCONT = "Clas_1431957012480960Ser_135_Alias";
    /** <code>dummyValidacionesFInicioCont</code> service name. */
    public static final String SERV_NAME_DUMMYVALIDACIONESFINICIOCONT = "dummyValidacionesFInicioCont";
    /** <code>dummyValidacionesFInicioCont</code> service alias. */
    public static final String SERV_ALIAS_DUMMYVALIDACIONESFINICIOCONT = "dummyValidacionesFInicioCont";
    /** Agents allowed to execute the service dummyValidacionesFInicioCont **/
    public static final String DUMMYVALIDACIONESFINICIOCONT_SRVAGENTS = "";
    // Preconditions
    /** <code>dummyValidacionesFInicioCont</code> precondition 0 id. */
    public static final String PRE_ID_DUMMYVALIDACIONESFINICIOCONT_0 = "Clas_1431957012480960Pre_122_MsgError";
    // Inbound arguments
    /** <code>solicituddummyValidacionesFInicioContpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_DUMMYVALIDACIONESFINICIOCONT_SOLICITUDDUMMYVALIDACIONESFINICIOCONTPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicituddummyValidacionesFInicioContpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_DUMMYVALIDACIONESFINICIOCONT_SOLICITUDDUMMYVALIDACIONESFINICIOCONTPTHISSOLICITUD = "Clas_1431957012480960Ser_135Arg_1_Alias";
    /** <code>solicituddummyValidacionesFInicioContpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_DUMMYVALIDACIONESFINICIOCONT_SOLICITUDDUMMYVALIDACIONESFINICIOCONTPTHISSOLICITUD = "Solicitud";
    // Service (setGrupoDelCore)
    /** <code>setGrupoDelCore</code> service id. */
    public static final String SERV_ID_SETGRUPODELCORE = "Clas_1431957012480960Ser_137_Alias";
    /** <code>setGrupoDelCore</code> service name. */
    public static final String SERV_NAME_SETGRUPODELCORE = "setGrupoDelCore";
    /** <code>setGrupoDelCore</code> service alias. */
    public static final String SERV_ALIAS_SETGRUPODELCORE = "setGrupoDelCore";
    /** Agents allowed to execute the service setGrupoDelCore **/
    public static final String SETGRUPODELCORE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudsetGrupoDelCorepthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_SETGRUPODELCORE_SOLICITUDSETGRUPODELCOREPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudsetGrupoDelCorepthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_SETGRUPODELCORE_SOLICITUDSETGRUPODELCOREPTHISSOLICITUD = "Clas_1431957012480960Ser_137Arg_1_Alias";
    /** <code>solicitudsetGrupoDelCorepthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETGRUPODELCORE_SOLICITUDSETGRUPODELCOREPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudsetGrupoDelCorepeCodGrupo</code> inbound argument name. */
    public static final String ARG_NAME_SETGRUPODELCORE_SOLICITUDSETGRUPODELCOREPECODGRUPO = "peCodGrupo";
    /** <code>solicitudsetGrupoDelCorepeCodGrupo</code> inbound argument id. */
    public static final String ARG_ID_SETGRUPODELCORE_SOLICITUDSETGRUPODELCOREPECODGRUPO = "Clas_1431957012480960Ser_137Arg_2_Alias";
    /** <code>solicitudsetGrupoDelCorepeCodGrupo</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETGRUPODELCORE_SOLICITUDSETGRUPODELCOREPECODGRUPO = "Grupo del Core";
    // Service (InsTipoFactura)
    /** <code>InsTipoFactura</code> service id. */
    public static final String SERV_ID_INSTIPOFACTURA = "Clas_1431957012480960Ser_138_Alias";
    /** <code>InsTipoFactura</code> service name. */
    public static final String SERV_NAME_INSTIPOFACTURA = "InsTipoFactura";
    /** <code>InsTipoFactura</code> service alias. */
    public static final String SERV_ALIAS_INSTIPOFACTURA = "InsTipoFactura";
    /** Agents allowed to execute the service InsTipoFactura **/
    public static final String INSTIPOFACTURA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudInsTipoFacturapthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPOFACTURA_SOLICITUDINSTIPOFACTURAPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudInsTipoFacturapthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_INSTIPOFACTURA_SOLICITUDINSTIPOFACTURAPTHISSOLICITUD = "Clas_1431957012480960Ser_138Arg_1_Alias";
    /** <code>solicitudInsTipoFacturapthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPOFACTURA_SOLICITUDINSTIPOFACTURAPTHISSOLICITUD = "Solicitudes";
    /** <code>solicitudInsTipoFacturapevcTipoFactura</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPOFACTURA_SOLICITUDINSTIPOFACTURAPEVCTIPOFACTURA = "p_evcTipoFactura";
    /** <code>solicitudInsTipoFacturapevcTipoFactura</code> inbound argument id. */
    public static final String ARG_ID_INSTIPOFACTURA_SOLICITUDINSTIPOFACTURAPEVCTIPOFACTURA = "Clas_1431957012480960Ser_138Arg_2_Alias";
    /** <code>solicitudInsTipoFacturapevcTipoFactura</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPOFACTURA_SOLICITUDINSTIPOFACTURAPEVCTIPOFACTURA = "Tipo Factura";
    // Service (DelTipoFactura)
    /** <code>DelTipoFactura</code> service id. */
    public static final String SERV_ID_DELTIPOFACTURA = "Clas_1431957012480960Ser_139_Alias";
    /** <code>DelTipoFactura</code> service name. */
    public static final String SERV_NAME_DELTIPOFACTURA = "DelTipoFactura";
    /** <code>DelTipoFactura</code> service alias. */
    public static final String SERV_ALIAS_DELTIPOFACTURA = "DelTipoFactura";
    /** Agents allowed to execute the service DelTipoFactura **/
    public static final String DELTIPOFACTURA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudDelTipoFacturapthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPOFACTURA_SOLICITUDDELTIPOFACTURAPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudDelTipoFacturapthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_DELTIPOFACTURA_SOLICITUDDELTIPOFACTURAPTHISSOLICITUD = "Clas_1431957012480960Ser_139Arg_1_Alias";
    /** <code>solicitudDelTipoFacturapthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPOFACTURA_SOLICITUDDELTIPOFACTURAPTHISSOLICITUD = "Solicitudes";
    /** <code>solicitudDelTipoFacturapevcTipoFactura</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPOFACTURA_SOLICITUDDELTIPOFACTURAPEVCTIPOFACTURA = "p_evcTipoFactura";
    /** <code>solicitudDelTipoFacturapevcTipoFactura</code> inbound argument id. */
    public static final String ARG_ID_DELTIPOFACTURA_SOLICITUDDELTIPOFACTURAPEVCTIPOFACTURA = "Clas_1431957012480960Ser_139Arg_2_Alias";
    /** <code>solicitudDelTipoFacturapevcTipoFactura</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPOFACTURA_SOLICITUDDELTIPOFACTURAPEVCTIPOFACTURA = "Tipo Factura";
    // Service (setTipoFacturaCORE)
    /** <code>setTipoFacturaCORE</code> service id. */
    public static final String SERV_ID_SETTIPOFACTURACORE = "Clas_1431957012480960Ser_140_Alias";
    /** <code>setTipoFacturaCORE</code> service name. */
    public static final String SERV_NAME_SETTIPOFACTURACORE = "setTipoFacturaCORE";
    /** <code>setTipoFacturaCORE</code> service alias. */
    public static final String SERV_ALIAS_SETTIPOFACTURACORE = "setTipoFacturaCORE";
    /** Agents allowed to execute the service setTipoFacturaCORE **/
    public static final String SETTIPOFACTURACORE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudsetTipoFacturaCOREpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_SETTIPOFACTURACORE_SOLICITUDSETTIPOFACTURACOREPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudsetTipoFacturaCOREpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_SETTIPOFACTURACORE_SOLICITUDSETTIPOFACTURACOREPTHISSOLICITUD = "Clas_1431957012480960Ser_140Arg_1_Alias";
    /** <code>solicitudsetTipoFacturaCOREpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETTIPOFACTURACORE_SOLICITUDSETTIPOFACTURACOREPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudsetTipoFacturaCOREptTipoFact</code> inbound argument name. */
    public static final String ARG_NAME_SETTIPOFACTURACORE_SOLICITUDSETTIPOFACTURACOREPTTIPOFACT = "ptTipoFact";
    /** <code>solicitudsetTipoFacturaCOREptTipoFact</code> inbound argument id. */
    public static final String ARG_ID_SETTIPOFACTURACORE_SOLICITUDSETTIPOFACTURACOREPTTIPOFACT = "Clas_1431957012480960Ser_140Arg_2_Alias";
    /** <code>solicitudsetTipoFacturaCOREptTipoFact</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETTIPOFACTURACORE_SOLICITUDSETTIPOFACTURACOREPTTIPOFACT = "Tipo Factura CORE";
    // Service (setProrrateo)
    /** <code>setProrrateo</code> service id. */
    public static final String SERV_ID_SETPRORRATEO = "Clas_1431957012480960Ser_144_Alias";
    /** <code>setProrrateo</code> service name. */
    public static final String SERV_NAME_SETPRORRATEO = "setProrrateo";
    /** <code>setProrrateo</code> service alias. */
    public static final String SERV_ALIAS_SETPRORRATEO = "setProrrateo";
    /** Agents allowed to execute the service setProrrateo **/
    public static final String SETPRORRATEO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudsetProrrateopthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_SETPRORRATEO_SOLICITUDSETPRORRATEOPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudsetProrrateopthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_SETPRORRATEO_SOLICITUDSETPRORRATEOPTHISSOLICITUD = "Clas_1431957012480960Ser_144Arg_1_Alias";
    /** <code>solicitudsetProrrateopthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETPRORRATEO_SOLICITUDSETPRORRATEOPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudsetProrrateopeProrrateo</code> inbound argument name. */
    public static final String ARG_NAME_SETPRORRATEO_SOLICITUDSETPRORRATEOPEPRORRATEO = "peProrrateo";
    /** <code>solicitudsetProrrateopeProrrateo</code> inbound argument id. */
    public static final String ARG_ID_SETPRORRATEO_SOLICITUDSETPRORRATEOPEPRORRATEO = "Clas_1431957012480960Ser_144Arg_2_Alias";
    /** <code>solicitudsetProrrateopeProrrateo</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETPRORRATEO_SOLICITUDSETPRORRATEOPEPRORRATEO = "Porcentaje prorrateo";
    // Service (enviarSMSInfoPago)
    /** <code>enviarSMSInfoPago</code> service id. */
    public static final String SERV_ID_ENVIARSMSINFOPAGO = "Clas_1431957012480960Ser_146_Alias";
    /** <code>enviarSMSInfoPago</code> service name. */
    public static final String SERV_NAME_ENVIARSMSINFOPAGO = "enviarSMSInfoPago";
    /** <code>enviarSMSInfoPago</code> service alias. */
    public static final String SERV_ALIAS_ENVIARSMSINFOPAGO = "enviarSMSInfoPago";
    /** Agents allowed to execute the service enviarSMSInfoPago **/
    public static final String ENVIARSMSINFOPAGO_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Inbound arguments
    /** <code>solicitudenviarSMSInfoPagopthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_ENVIARSMSINFOPAGO_SOLICITUDENVIARSMSINFOPAGOPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudenviarSMSInfoPagopthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_ENVIARSMSINFOPAGO_SOLICITUDENVIARSMSINFOPAGOPTHISSOLICITUD = "Clas_1431957012480960Ser_146Arg_1_Alias";
    /** <code>solicitudenviarSMSInfoPagopthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_ENVIARSMSINFOPAGO_SOLICITUDENVIARSMSINFOPAGOPTHISSOLICITUD = "Solicitud";
    // Service (setFechaUltimoDoc)
    /** <code>setFechaUltimoDoc</code> service id. */
    public static final String SERV_ID_SETFECHAULTIMODOC = "Clas_1431957012480960Ser_149_Alias";
    /** <code>setFechaUltimoDoc</code> service name. */
    public static final String SERV_NAME_SETFECHAULTIMODOC = "setFechaUltimoDoc";
    /** <code>setFechaUltimoDoc</code> service alias. */
    public static final String SERV_ALIAS_SETFECHAULTIMODOC = "setFechaUltimoDoc";
    /** Agents allowed to execute the service setFechaUltimoDoc **/
    public static final String SETFECHAULTIMODOC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudsetFechaUltimoDocpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_SETFECHAULTIMODOC_SOLICITUDSETFECHAULTIMODOCPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudsetFechaUltimoDocpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_SETFECHAULTIMODOC_SOLICITUDSETFECHAULTIMODOCPTHISSOLICITUD = "Clas_1431957012480960Ser_149Arg_1_Alias";
    /** <code>solicitudsetFechaUltimoDocpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETFECHAULTIMODOC_SOLICITUDSETFECHAULTIMODOCPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudsetFechaUltimoDocpeFechaHora</code> inbound argument name. */
    public static final String ARG_NAME_SETFECHAULTIMODOC_SOLICITUDSETFECHAULTIMODOCPEFECHAHORA = "peFechaHora";
    /** <code>solicitudsetFechaUltimoDocpeFechaHora</code> inbound argument id. */
    public static final String ARG_ID_SETFECHAULTIMODOC_SOLICITUDSETFECHAULTIMODOCPEFECHAHORA = "Clas_1431957012480960Ser_149Arg_2_Alias";
    /** <code>solicitudsetFechaUltimoDocpeFechaHora</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETFECHAULTIMODOC_SOLICITUDSETFECHAULTIMODOCPEFECHAHORA = "Fecha último documento";
    // Service (InsUsrAfiliacion)
    /** <code>InsUsrAfiliacion</code> service id. */
    public static final String SERV_ID_INSUSRAFILIACION = "Clas_1431957012480960Ser_154_Alias";
    /** <code>InsUsrAfiliacion</code> service name. */
    public static final String SERV_NAME_INSUSRAFILIACION = "InsUsrAfiliacion";
    /** <code>InsUsrAfiliacion</code> service alias. */
    public static final String SERV_ALIAS_INSUSRAFILIACION = "InsUsrAfiliacion";
    /** Agents allowed to execute the service InsUsrAfiliacion **/
    public static final String INSUSRAFILIACION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudInsUsrAfiliacionpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_INSUSRAFILIACION_SOLICITUDINSUSRAFILIACIONPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudInsUsrAfiliacionpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_INSUSRAFILIACION_SOLICITUDINSUSRAFILIACIONPTHISSOLICITUD = "Clas_1431957012480960Ser_154Arg_1_Alias";
    /** <code>solicitudInsUsrAfiliacionpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSUSRAFILIACION_SOLICITUDINSUSRAFILIACIONPTHISSOLICITUD = "Solicitudes Afiliación";
    /** <code>solicitudInsUsrAfiliacionpevcFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_INSUSRAFILIACION_SOLICITUDINSUSRAFILIACIONPEVCFUNCIONARIO = "p_evcFuncionario";
    /** <code>solicitudInsUsrAfiliacionpevcFuncionario</code> inbound argument id. */
    public static final String ARG_ID_INSUSRAFILIACION_SOLICITUDINSUSRAFILIACIONPEVCFUNCIONARIO = "Clas_1431957012480960Ser_154Arg_2_Alias";
    /** <code>solicitudInsUsrAfiliacionpevcFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSUSRAFILIACION_SOLICITUDINSUSRAFILIACIONPEVCFUNCIONARIO = "Usr. Afiliación";
    // Service (DelUsrAfiliacion)
    /** <code>DelUsrAfiliacion</code> service id. */
    public static final String SERV_ID_DELUSRAFILIACION = "Clas_1431957012480960Ser_155_Alias";
    /** <code>DelUsrAfiliacion</code> service name. */
    public static final String SERV_NAME_DELUSRAFILIACION = "DelUsrAfiliacion";
    /** <code>DelUsrAfiliacion</code> service alias. */
    public static final String SERV_ALIAS_DELUSRAFILIACION = "DelUsrAfiliacion";
    /** Agents allowed to execute the service DelUsrAfiliacion **/
    public static final String DELUSRAFILIACION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudDelUsrAfiliacionpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_DELUSRAFILIACION_SOLICITUDDELUSRAFILIACIONPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudDelUsrAfiliacionpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_DELUSRAFILIACION_SOLICITUDDELUSRAFILIACIONPTHISSOLICITUD = "Clas_1431957012480960Ser_155Arg_1_Alias";
    /** <code>solicitudDelUsrAfiliacionpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELUSRAFILIACION_SOLICITUDDELUSRAFILIACIONPTHISSOLICITUD = "Solicitudes Afiliación";
    /** <code>solicitudDelUsrAfiliacionpevcFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_DELUSRAFILIACION_SOLICITUDDELUSRAFILIACIONPEVCFUNCIONARIO = "p_evcFuncionario";
    /** <code>solicitudDelUsrAfiliacionpevcFuncionario</code> inbound argument id. */
    public static final String ARG_ID_DELUSRAFILIACION_SOLICITUDDELUSRAFILIACIONPEVCFUNCIONARIO = "Clas_1431957012480960Ser_155Arg_2_Alias";
    /** <code>solicitudDelUsrAfiliacionpevcFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELUSRAFILIACION_SOLICITUDDELUSRAFILIACIONPEVCFUNCIONARIO = "Usr. Afiliación";
    // Service (asignarFechaTerminada)
    /** <code>asignarFechaTerminada</code> service id. */
    public static final String SERV_ID_ASIGNARFECHATERMINADA = "Clas_1431957012480960Ser_158_Alias";
    /** <code>asignarFechaTerminada</code> service name. */
    public static final String SERV_NAME_ASIGNARFECHATERMINADA = "asignarFechaTerminada";
    /** <code>asignarFechaTerminada</code> service alias. */
    public static final String SERV_ALIAS_ASIGNARFECHATERMINADA = "asignarFechaTerminada";
    /** Agents allowed to execute the service asignarFechaTerminada **/
    public static final String ASIGNARFECHATERMINADA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudasignarFechaTerminadapthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_ASIGNARFECHATERMINADA_SOLICITUDASIGNARFECHATERMINADAPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudasignarFechaTerminadapthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_ASIGNARFECHATERMINADA_SOLICITUDASIGNARFECHATERMINADAPTHISSOLICITUD = "Clas_1431957012480960Ser_158Arg_1_Alias";
    /** <code>solicitudasignarFechaTerminadapthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_ASIGNARFECHATERMINADA_SOLICITUDASIGNARFECHATERMINADAPTHISSOLICITUD = "Solicitud";
    // Service (cambiarEstadoDoc)
    /** <code>cambiarEstadoDoc</code> service id. */
    public static final String SERV_ID_CAMBIARESTADODOC = "Clas_1431957012480960Ser_160_Alias";
    /** <code>cambiarEstadoDoc</code> service name. */
    public static final String SERV_NAME_CAMBIARESTADODOC = "cambiarEstadoDoc";
    /** <code>cambiarEstadoDoc</code> service alias. */
    public static final String SERV_ALIAS_CAMBIARESTADODOC = "cambiarEstadoDoc";
    /** Agents allowed to execute the service cambiarEstadoDoc **/
    public static final String CAMBIARESTADODOC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudcambiarEstadoDocpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARESTADODOC_SOLICITUDCAMBIARESTADODOCPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudcambiarEstadoDocpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARESTADODOC_SOLICITUDCAMBIARESTADODOCPTHISSOLICITUD = "Clas_1431957012480960Ser_160Arg_1_Alias";
    /** <code>solicitudcambiarEstadoDocpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARESTADODOC_SOLICITUDCAMBIARESTADODOCPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudcambiarEstadoDocpeEstado</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARESTADODOC_SOLICITUDCAMBIARESTADODOCPEESTADO = "peEstado";
    /** <code>solicitudcambiarEstadoDocpeEstado</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARESTADODOC_SOLICITUDCAMBIARESTADODOCPEESTADO = "Clas_1431957012480960Ser_160Arg_2_Alias";
    /** <code>solicitudcambiarEstadoDocpeEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARESTADODOC_SOLICITUDCAMBIARESTADODOCPEESTADO = "Estado documentación";
    // Service (asignarPrioridad)
    /** <code>asignarPrioridad</code> service id. */
    public static final String SERV_ID_ASIGNARPRIORIDAD = "Clas_1431957012480960Ser_161_Alias";
    /** <code>asignarPrioridad</code> service name. */
    public static final String SERV_NAME_ASIGNARPRIORIDAD = "asignarPrioridad";
    /** <code>asignarPrioridad</code> service alias. */
    public static final String SERV_ALIAS_ASIGNARPRIORIDAD = "asignarPrioridad";
    /** Agents allowed to execute the service asignarPrioridad **/
    public static final String ASIGNARPRIORIDAD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudasignarPrioridadpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_ASIGNARPRIORIDAD_SOLICITUDASIGNARPRIORIDADPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudasignarPrioridadpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_ASIGNARPRIORIDAD_SOLICITUDASIGNARPRIORIDADPTHISSOLICITUD = "Clas_1431957012480960Ser_161Arg_1_Alias";
    /** <code>solicitudasignarPrioridadpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_ASIGNARPRIORIDAD_SOLICITUDASIGNARPRIORIDADPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudasignarPrioridadpePrioridad</code> inbound argument name. */
    public static final String ARG_NAME_ASIGNARPRIORIDAD_SOLICITUDASIGNARPRIORIDADPEPRIORIDAD = "pePrioridad";
    /** <code>solicitudasignarPrioridadpePrioridad</code> inbound argument id. */
    public static final String ARG_ID_ASIGNARPRIORIDAD_SOLICITUDASIGNARPRIORIDADPEPRIORIDAD = "Clas_1431957012480960Ser_161Arg_2_Alias";
    /** <code>solicitudasignarPrioridadpePrioridad</code> inbound argument alias. */
    public static final String ARG_ALIAS_ASIGNARPRIORIDAD_SOLICITUDASIGNARPRIORIDADPEPRIORIDAD = "Prioridad";
    // Service (asignarFA)
    /** <code>asignarFA</code> service id. */
    public static final String SERV_ID_ASIGNARFA = "Clas_1431957012480960Ser_162_Alias";
    /** <code>asignarFA</code> service name. */
    public static final String SERV_NAME_ASIGNARFA = "asignarFA";
    /** <code>asignarFA</code> service alias. */
    public static final String SERV_ALIAS_ASIGNARFA = "asignarFA";
    /** Agents allowed to execute the service asignarFA **/
    public static final String ASIGNARFA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudasignarFApthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_ASIGNARFA_SOLICITUDASIGNARFAPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudasignarFApthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_ASIGNARFA_SOLICITUDASIGNARFAPTHISSOLICITUD = "Clas_1431957012480960Ser_162Arg_1_Alias";
    /** <code>solicitudasignarFApthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_ASIGNARFA_SOLICITUDASIGNARFAPTHISSOLICITUD = "Solicitud";
    // Service (asignarFAAM)
    /** <code>asignarFAAM</code> service id. */
    public static final String SERV_ID_ASIGNARFAAM = "Clas_1431957012480960Ser_163_Alias";
    /** <code>asignarFAAM</code> service name. */
    public static final String SERV_NAME_ASIGNARFAAM = "asignarFAAM";
    /** <code>asignarFAAM</code> service alias. */
    public static final String SERV_ALIAS_ASIGNARFAAM = "asignarFAAM";
    /** Agents allowed to execute the service asignarFAAM **/
    public static final String ASIGNARFAAM_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudasignarFAAMpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_ASIGNARFAAM_SOLICITUDASIGNARFAAMPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudasignarFAAMpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_ASIGNARFAAM_SOLICITUDASIGNARFAAMPTHISSOLICITUD = "Clas_1431957012480960Ser_163Arg_1_Alias";
    /** <code>solicitudasignarFAAMpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_ASIGNARFAAM_SOLICITUDASIGNARFAAMPTHISSOLICITUD = "Solicitud";
    // Service (asignarFUG)
    /** <code>asignarFUG</code> service id. */
    public static final String SERV_ID_ASIGNARFUG = "Clas_1431957012480960Ser_164_Alias";
    /** <code>asignarFUG</code> service name. */
    public static final String SERV_NAME_ASIGNARFUG = "asignarFUG";
    /** <code>asignarFUG</code> service alias. */
    public static final String SERV_ALIAS_ASIGNARFUG = "asignarFUG";
    /** Agents allowed to execute the service asignarFUG **/
    public static final String ASIGNARFUG_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudasignarFUGpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_ASIGNARFUG_SOLICITUDASIGNARFUGPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudasignarFUGpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_ASIGNARFUG_SOLICITUDASIGNARFUGPTHISSOLICITUD = "Clas_1431957012480960Ser_164Arg_1_Alias";
    /** <code>solicitudasignarFUGpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_ASIGNARFUG_SOLICITUDASIGNARFUGPTHISSOLICITUD = "Solicitud";
    // Service (dummyEstatusSolicitudes)
    /** <code>dummyEstatusSolicitudes</code> service id. */
    public static final String SERV_ID_DUMMYESTATUSSOLICITUDES = "Clas_1431957012480960Ser_166_Alias";
    /** <code>dummyEstatusSolicitudes</code> service name. */
    public static final String SERV_NAME_DUMMYESTATUSSOLICITUDES = "dummyEstatusSolicitudes";
    /** <code>dummyEstatusSolicitudes</code> service alias. */
    public static final String SERV_ALIAS_DUMMYESTATUSSOLICITUDES = "Estatus Solicitudes";
    /** Agents allowed to execute the service dummyEstatusSolicitudes **/
    public static final String DUMMYESTATUSSOLICITUDES_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,MesaDeApoyo";
    // Inbound arguments
    /** <code>solicituddummyEstatusSolicitudespthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_DUMMYESTATUSSOLICITUDES_SOLICITUDDUMMYESTATUSSOLICITUDESPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicituddummyEstatusSolicitudespthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_DUMMYESTATUSSOLICITUDES_SOLICITUDDUMMYESTATUSSOLICITUDESPTHISSOLICITUD = "Clas_1431957012480960Ser_166Arg_1_Alias";
    /** <code>solicituddummyEstatusSolicitudespthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_DUMMYESTATUSSOLICITUDES_SOLICITUDDUMMYESTATUSSOLICITUDESPTHISSOLICITUD = "Solicitud";
    // Service (modMarcaCarnet)
    /** <code>modMarcaCarnet</code> service id. */
    public static final String SERV_ID_MODMARCACARNET = "Clas_1431957012480960Ser_170_Alias";
    /** <code>modMarcaCarnet</code> service name. */
    public static final String SERV_NAME_MODMARCACARNET = "modMarcaCarnet";
    /** <code>modMarcaCarnet</code> service alias. */
    public static final String SERV_ALIAS_MODMARCACARNET = "Modificar marca carnet";
    /** Agents allowed to execute the service modMarcaCarnet **/
    public static final String MODMARCACARNET_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Preconditions
    /** <code>modMarcaCarnet</code> precondition 0 id. */
    public static final String PRE_ID_MODMARCACARNET_0 = "Clas_1431957012480960Pre_165_MsgError";
    // Inbound arguments
    /** <code>solicitudmodMarcaCarnetpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_MODMARCACARNET_SOLICITUDMODMARCACARNETPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudmodMarcaCarnetpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_MODMARCACARNET_SOLICITUDMODMARCACARNETPTHISSOLICITUD = "Clas_1431957012480960Ser_170Arg_1_Alias";
    /** <code>solicitudmodMarcaCarnetpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODMARCACARNET_SOLICITUDMODMARCACARNETPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudmodMarcaCarnetpeMarcaCarnet</code> inbound argument name. */
    public static final String ARG_NAME_MODMARCACARNET_SOLICITUDMODMARCACARNETPEMARCACARNET = "peMarcaCarnet";
    /** <code>solicitudmodMarcaCarnetpeMarcaCarnet</code> inbound argument id. */
    public static final String ARG_ID_MODMARCACARNET_SOLICITUDMODMARCACARNETPEMARCACARNET = "Clas_1431957012480960Ser_170Arg_2_Alias";
    /** <code>solicitudmodMarcaCarnetpeMarcaCarnet</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODMARCACARNET_SOLICITUDMODMARCACARNETPEMARCACARNET = "Envío carnet físico";
    // Service (checkPrecondFechaInicioCont)
    /** <code>checkPrecondFechaInicioCont</code> service id. */
    public static final String SERV_ID_CHECKPRECONDFECHAINICIOCONT = "Clas_1431957012480960Ser_172_Alias";
    /** <code>checkPrecondFechaInicioCont</code> service name. */
    public static final String SERV_NAME_CHECKPRECONDFECHAINICIOCONT = "checkPrecondFechaInicioCont";
    /** <code>checkPrecondFechaInicioCont</code> service alias. */
    public static final String SERV_ALIAS_CHECKPRECONDFECHAINICIOCONT = "Modificar encabezado";
    /** Agents allowed to execute the service checkPrecondFechaInicioCont **/
    public static final String CHECKPRECONDFECHAINICIOCONT_SRVAGENTS = "";
    // Preconditions
    /** <code>checkPrecondFechaInicioCont</code> precondition 0 id. */
    public static final String PRE_ID_CHECKPRECONDFECHAINICIOCONT_0 = "Clas_1431957012480960Pre_174_MsgError";
    /** <code>checkPrecondFechaInicioCont</code> precondition 1 id. */
    public static final String PRE_ID_CHECKPRECONDFECHAINICIOCONT_1 = "Clas_1431957012480960Pre_175_MsgError";
    /** <code>checkPrecondFechaInicioCont</code> precondition 2 id. */
    public static final String PRE_ID_CHECKPRECONDFECHAINICIOCONT_2 = "Clas_1431957012480960Pre_176_MsgError";
    /** <code>checkPrecondFechaInicioCont</code> precondition 3 id. */
    public static final String PRE_ID_CHECKPRECONDFECHAINICIOCONT_3 = "Clas_1431957012480960Pre_177_MsgError";
    /** <code>checkPrecondFechaInicioCont</code> precondition 4 id. */
    public static final String PRE_ID_CHECKPRECONDFECHAINICIOCONT_4 = "Clas_1431957012480960Pre_178_MsgError";
    /** <code>checkPrecondFechaInicioCont</code> precondition 5 id. */
    public static final String PRE_ID_CHECKPRECONDFECHAINICIOCONT_5 = "Clas_1431957012480960Pre_179_MsgError";
    // Inbound arguments
    /** <code>solicitudcheckPrecondFechaInicioContpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_CHECKPRECONDFECHAINICIOCONT_SOLICITUDCHECKPRECONDFECHAINICIOCONTPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudcheckPrecondFechaInicioContpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_CHECKPRECONDFECHAINICIOCONT_SOLICITUDCHECKPRECONDFECHAINICIOCONTPTHISSOLICITUD = "Clas_1431957012480960Ser_172Arg_1_Alias";
    /** <code>solicitudcheckPrecondFechaInicioContpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_CHECKPRECONDFECHAINICIOCONT_SOLICITUDCHECKPRECONDFECHAINICIOCONTPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudcheckPrecondFechaInicioContptFecha</code> inbound argument name. */
    public static final String ARG_NAME_CHECKPRECONDFECHAINICIOCONT_SOLICITUDCHECKPRECONDFECHAINICIOCONTPTFECHA = "ptFecha";
    /** <code>solicitudcheckPrecondFechaInicioContptFecha</code> inbound argument id. */
    public static final String ARG_ID_CHECKPRECONDFECHAINICIOCONT_SOLICITUDCHECKPRECONDFECHAINICIOCONTPTFECHA = "Clas_1431957012480960Ser_172Arg_2_Alias";
    /** <code>solicitudcheckPrecondFechaInicioContptFecha</code> inbound argument alias. */
    public static final String ARG_ALIAS_CHECKPRECONDFECHAINICIOCONT_SOLICITUDCHECKPRECONDFECHAINICIOCONTPTFECHA = "Fecha inicio contratación";
    // Service (enviarEmail)
    /** <code>enviarEmail</code> service id. */
    public static final String SERV_ID_ENVIAREMAIL = "Clas_1431957012480960Ser_176_Alias";
    /** <code>enviarEmail</code> service name. */
    public static final String SERV_NAME_ENVIAREMAIL = "enviarEmail";
    /** <code>enviarEmail</code> service alias. */
    public static final String SERV_ALIAS_ENVIAREMAIL = "enviarEmail";
    /** Agents allowed to execute the service enviarEmail **/
    public static final String ENVIAREMAIL_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudenviarEmailpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_ENVIAREMAIL_SOLICITUDENVIAREMAILPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudenviarEmailpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_ENVIAREMAIL_SOLICITUDENVIAREMAILPTHISSOLICITUD = "Clas_1431957012480960Ser_176Arg_1_Alias";
    /** <code>solicitudenviarEmailpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_ENVIAREMAIL_SOLICITUDENVIAREMAILPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudenviarEmailpeDestinatario</code> inbound argument name. */
    public static final String ARG_NAME_ENVIAREMAIL_SOLICITUDENVIAREMAILPEDESTINATARIO = "peDestinatario";
    /** <code>solicitudenviarEmailpeDestinatario</code> inbound argument id. */
    public static final String ARG_ID_ENVIAREMAIL_SOLICITUDENVIAREMAILPEDESTINATARIO = "Clas_1431957012480960Ser_176Arg_3_Alias";
    /** <code>solicitudenviarEmailpeDestinatario</code> inbound argument alias. */
    public static final String ARG_ALIAS_ENVIAREMAIL_SOLICITUDENVIAREMAILPEDESTINATARIO = "peDestinatario";
    /** <code>solicitudenviarEmailpeEmailConfirmacion</code> inbound argument name. */
    public static final String ARG_NAME_ENVIAREMAIL_SOLICITUDENVIAREMAILPEEMAILCONFIRMACION = "peEmailConfirmacion";
    /** <code>solicitudenviarEmailpeEmailConfirmacion</code> inbound argument id. */
    public static final String ARG_ID_ENVIAREMAIL_SOLICITUDENVIAREMAILPEEMAILCONFIRMACION = "Clas_1431957012480960Ser_176Arg_4_Alias";
    /** <code>solicitudenviarEmailpeEmailConfirmacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_ENVIAREMAIL_SOLICITUDENVIAREMAILPEEMAILCONFIRMACION = "peEmailConfirmacion";
    /** <code>solicitudenviarEmailpeAsunto</code> inbound argument name. */
    public static final String ARG_NAME_ENVIAREMAIL_SOLICITUDENVIAREMAILPEASUNTO = "peAsunto";
    /** <code>solicitudenviarEmailpeAsunto</code> inbound argument id. */
    public static final String ARG_ID_ENVIAREMAIL_SOLICITUDENVIAREMAILPEASUNTO = "Clas_1431957012480960Ser_176Arg_5_Alias";
    /** <code>solicitudenviarEmailpeAsunto</code> inbound argument alias. */
    public static final String ARG_ALIAS_ENVIAREMAIL_SOLICITUDENVIAREMAILPEASUNTO = "peAsunto";
    /** <code>solicitudenviarEmailpeCuerpo</code> inbound argument name. */
    public static final String ARG_NAME_ENVIAREMAIL_SOLICITUDENVIAREMAILPECUERPO = "peCuerpo";
    /** <code>solicitudenviarEmailpeCuerpo</code> inbound argument id. */
    public static final String ARG_ID_ENVIAREMAIL_SOLICITUDENVIAREMAILPECUERPO = "Clas_1431957012480960Ser_176Arg_6_Alias";
    /** <code>solicitudenviarEmailpeCuerpo</code> inbound argument alias. */
    public static final String ARG_ALIAS_ENVIAREMAIL_SOLICITUDENVIAREMAILPECUERPO = "peCuerpo";
    /** <code>solicitudenviarEmailpeNombreAdjunto</code> inbound argument name. */
    public static final String ARG_NAME_ENVIAREMAIL_SOLICITUDENVIAREMAILPENOMBREADJUNTO = "peNombreAdjunto";
    /** <code>solicitudenviarEmailpeNombreAdjunto</code> inbound argument id. */
    public static final String ARG_ID_ENVIAREMAIL_SOLICITUDENVIAREMAILPENOMBREADJUNTO = "Clas_1431957012480960Ser_176Arg_7_Alias";
    /** <code>solicitudenviarEmailpeNombreAdjunto</code> inbound argument alias. */
    public static final String ARG_ALIAS_ENVIAREMAIL_SOLICITUDENVIAREMAILPENOMBREADJUNTO = "peNombreAdjunto";
    /** <code>solicitudenviarEmailpeAdjunto</code> inbound argument name. */
    public static final String ARG_NAME_ENVIAREMAIL_SOLICITUDENVIAREMAILPEADJUNTO = "peAdjunto";
    /** <code>solicitudenviarEmailpeAdjunto</code> inbound argument id. */
    public static final String ARG_ID_ENVIAREMAIL_SOLICITUDENVIAREMAILPEADJUNTO = "Clas_1431957012480960Ser_176Arg_8_Alias";
    /** <code>solicitudenviarEmailpeAdjunto</code> inbound argument alias. */
    public static final String ARG_ALIAS_ENVIAREMAIL_SOLICITUDENVIAREMAILPEADJUNTO = "peAdjunto";
    // Outbound arguments
    /** <code>solicitudenviarEmailoaResultado</code> outbound argument name. */
    public static final String ARG_NAME_ENVIAREMAIL_SOLICITUDENVIAREMAILOARESULTADO = "solicitudenviarEmailoaResultado";
    /** <code>solicitudenviarEmailoaResultado</code> outbound argument id. */
    public static final String ARG_ID_ENVIAREMAIL_SOLICITUDENVIAREMAILOARESULTADO = "Clas_1431957012480960Ser_176Arg_2_Alias";
    /** <code>solicitudenviarEmailoaResultado</code> outbound argument alias. */
    public static final String ARG_ALIAS_ENVIAREMAIL_SOLICITUDENVIAREMAILOARESULTADO = "oaResultado";
    // Service (TNUEVAAFILIACION)
    /** <code>TNUEVAAFILIACION</code> service id. */
    public static final String SERV_ID_TNUEVAAFILIACION = "Clas_1431957012480960Ser_22_Alias";
    /** <code>TNUEVAAFILIACION</code> service name. */
    public static final String SERV_NAME_TNUEVAAFILIACION = "TNUEVAAFILIACION";
    /** <code>TNUEVAAFILIACION</code> service alias. */
    public static final String SERV_ALIAS_TNUEVAAFILIACION = "Información de Solicitud";
    /** Agents allowed to execute the service TNUEVAAFILIACION **/
    public static final String TNUEVAAFILIACION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudTNUEVAAFILIACIONptpagrAESOLICITUDES</code> inbound argument name. */
    public static final String ARG_NAME_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPTPAGRAESOLICITUDES = "pt_p_agrAE_SOLICITUDES";
    /** <code>solicitudTNUEVAAFILIACIONptpagrAESOLICITUDES</code> inbound argument id. */
    public static final String ARG_ID_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPTPAGRAESOLICITUDES = "Clas_1431957012480960Ser_22Arg_3_Alias";
    /** <code>solicitudTNUEVAAFILIACIONptpagrAESOLICITUDES</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPTPAGRAESOLICITUDES = "Solicitud base";
    /** <code>solicitudTNUEVAAFILIACIONptpagrProteccionDatos</code> inbound argument name. */
    public static final String ARG_NAME_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPTPAGRPROTECCIONDATOS = "pt_p_agrProteccionDatos";
    /** <code>solicitudTNUEVAAFILIACIONptpagrProteccionDatos</code> inbound argument id. */
    public static final String ARG_ID_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPTPAGRPROTECCIONDATOS = "Clas_1431957012480960Ser_22Arg_7_Alias";
    /** <code>solicitudTNUEVAAFILIACIONptpagrProteccionDatos</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPTPAGRPROTECCIONDATOS = "Protección Datos";
    /** <code>solicitudTNUEVAAFILIACIONptpagrGrupoAsociado</code> inbound argument name. */
    public static final String ARG_NAME_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPTPAGRGRUPOASOCIADO = "pt_p_agrGrupoAsociado";
    /** <code>solicitudTNUEVAAFILIACIONptpagrGrupoAsociado</code> inbound argument id. */
    public static final String ARG_ID_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPTPAGRGRUPOASOCIADO = "Clas_1431957012480960Ser_22Arg_8_Alias";
    /** <code>solicitudTNUEVAAFILIACIONptpagrGrupoAsociado</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPTPAGRGRUPOASOCIADO = "Grupo asociado";
    /** <code>solicitudTNUEVAAFILIACIONptpatrFInicioContrato</code> inbound argument name. */
    public static final String ARG_NAME_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPTPATRFINICIOCONTRATO = "pt_p_atrFInicioContrato";
    /** <code>solicitudTNUEVAAFILIACIONptpatrFInicioContrato</code> inbound argument id. */
    public static final String ARG_ID_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPTPATRFINICIOCONTRATO = "Clas_1431957012480960Ser_22Arg_11_Alias";
    /** <code>solicitudTNUEVAAFILIACIONptpatrFInicioContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPTPATRFINICIOCONTRATO = "Fecha inicio contratación";
    /** <code>solicitudTNUEVAAFILIACIONptpatrEsTraslado</code> inbound argument name. */
    public static final String ARG_NAME_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPTPATRESTRASLADO = "pt_p_atrEsTraslado";
    /** <code>solicitudTNUEVAAFILIACIONptpatrEsTraslado</code> inbound argument id. */
    public static final String ARG_ID_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPTPATRESTRASLADO = "Clas_1431957012480960Ser_22Arg_12_Alias";
    /** <code>solicitudTNUEVAAFILIACIONptpatrEsTraslado</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPTPATRESTRASLADO = "Es traslado";
    /** <code>solicitudTNUEVAAFILIACIONpCodDirector</code> inbound argument name. */
    public static final String ARG_NAME_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPCODDIRECTOR = "pCodDirector";
    /** <code>solicitudTNUEVAAFILIACIONpCodDirector</code> inbound argument id. */
    public static final String ARG_ID_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPCODDIRECTOR = "Clas_1431957012480960Ser_22Arg_2652_Alias";
    /** <code>solicitudTNUEVAAFILIACIONpCodDirector</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPCODDIRECTOR = "Código Director";
    /** <code>solicitudTNUEVAAFILIACIONptPorcenProrrateo</code> inbound argument name. */
    public static final String ARG_NAME_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPTPORCENPRORRATEO = "ptPorcenProrrateo";
    /** <code>solicitudTNUEVAAFILIACIONptPorcenProrrateo</code> inbound argument id. */
    public static final String ARG_ID_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPTPORCENPRORRATEO = "Clas_1431957012480960Ser_22Arg_4413_Alias";
    /** <code>solicitudTNUEVAAFILIACIONptPorcenProrrateo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPTPORCENPRORRATEO = "ptPorcenProrrateo";
    /** <code>solicitudTNUEVAAFILIACIONptTipoFactura</code> inbound argument name. */
    public static final String ARG_NAME_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPTTIPOFACTURA = "ptTipoFactura";
    /** <code>solicitudTNUEVAAFILIACIONptTipoFactura</code> inbound argument id. */
    public static final String ARG_ID_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPTTIPOFACTURA = "Clas_1431957012480960Ser_22Arg_4448_Alias";
    /** <code>solicitudTNUEVAAFILIACIONptTipoFactura</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPTTIPOFACTURA = "Tipo Factura";
    /** <code>solicitudTNUEVAAFILIACIONptMarcaCarnet</code> inbound argument name. */
    public static final String ARG_NAME_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPTMARCACARNET = "ptMarcaCarnet";
    /** <code>solicitudTNUEVAAFILIACIONptMarcaCarnet</code> inbound argument id. */
    public static final String ARG_ID_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPTMARCACARNET = "Clas_1431957012480960Ser_22Arg_6650_Alias";
    /** <code>solicitudTNUEVAAFILIACIONptMarcaCarnet</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPTMARCACARNET = "ptMarcaCarnet";
    /** <code>solicitudTNUEVAAFILIACIONptNumRadicado</code> inbound argument name. */
    public static final String ARG_NAME_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPTNUMRADICADO = "ptNumRadicado";
    /** <code>solicitudTNUEVAAFILIACIONptNumRadicado</code> inbound argument id. */
    public static final String ARG_ID_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPTNUMRADICADO = "Clas_1431957012480960Ser_22Arg_6701_Alias";
    /** <code>solicitudTNUEVAAFILIACIONptNumRadicado</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPTNUMRADICADO = "ptNumRadicado";
    // Outbound arguments
    /** <code>solicitudTNUEVAAFILIACIONpsSolicitud</code> outbound argument name. */
    public static final String ARG_NAME_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPSSOLICITUD = "solicitudTNUEVAAFILIACIONpsSolicitud";
    /** <code>solicitudTNUEVAAFILIACIONpsSolicitud</code> outbound argument id. */
    public static final String ARG_ID_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPSSOLICITUD = "Clas_1431957012480960Ser_22Arg_16_Alias";
    /** <code>solicitudTNUEVAAFILIACIONpsSolicitud</code> outbound argument alias. */
    public static final String ARG_ALIAS_TNUEVAAFILIACION_SOLICITUDTNUEVAAFILIACIONPSSOLICITUD = "Solicitud";
    // Service (TMODDIRECCION)
    /** <code>TMODDIRECCION</code> service id. */
    public static final String SERV_ID_TMODDIRECCION = "Clas_1431957012480960Ser_32_Alias";
    /** <code>TMODDIRECCION</code> service name. */
    public static final String SERV_NAME_TMODDIRECCION = "TMODDIRECCION";
    /** <code>TMODDIRECCION</code> service alias. */
    public static final String SERV_ALIAS_TMODDIRECCION = "Cambiar dirección";
    /** Agents allowed to execute the service TMODDIRECCION **/
    public static final String TMODDIRECCION_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Preconditions
    /** <code>TMODDIRECCION</code> precondition 0 id. */
    public static final String PRE_ID_TMODDIRECCION_0 = "Clas_1431957012480960Pre_9_MsgError";
    // Inbound arguments
    /** <code>solicitudTMODDIRECCIONpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRECCION_SOLICITUDTMODDIRECCIONPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTMODDIRECCIONpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRECCION_SOLICITUDTMODDIRECCIONPTHISSOLICITUD = "Clas_1431957012480960Ser_32Arg_1_Alias";
    /** <code>solicitudTMODDIRECCIONpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRECCION_SOLICITUDTMODDIRECCIONPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTMODDIRECCIONptDirecciones</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRECCION_SOLICITUDTMODDIRECCIONPTDIRECCIONES = "pt_Direcciones";
    /** <code>solicitudTMODDIRECCIONptDirecciones</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRECCION_SOLICITUDTMODDIRECCIONPTDIRECCIONES = "Clas_1431957012480960Ser_32Arg_2_Alias";
    /** <code>solicitudTMODDIRECCIONptDirecciones</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRECCION_SOLICITUDTMODDIRECCIONPTDIRECCIONES = "Direcciones del contratante";
    // Service (TCREAROMODDIRECCION)
    /** <code>TCREAROMODDIRECCION</code> service id. */
    public static final String SERV_ID_TCREAROMODDIRECCION = "Clas_1431957012480960Ser_33_Alias";
    /** <code>TCREAROMODDIRECCION</code> service name. */
    public static final String SERV_NAME_TCREAROMODDIRECCION = "TCREAROMODDIRECCION";
    /** <code>TCREAROMODDIRECCION</code> service alias. */
    public static final String SERV_ALIAS_TCREAROMODDIRECCION = "TCREAROMODDIRECCION";
    /** Agents allowed to execute the service TCREAROMODDIRECCION **/
    public static final String TCREAROMODDIRECCION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudTCREAROMODDIRECCIONpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODDIRECCION_SOLICITUDTCREAROMODDIRECCIONPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTCREAROMODDIRECCIONpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODDIRECCION_SOLICITUDTCREAROMODDIRECCIONPTHISSOLICITUD = "Clas_1431957012480960Ser_33Arg_1_Alias";
    /** <code>solicitudTCREAROMODDIRECCIONpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODDIRECCION_SOLICITUDTCREAROMODDIRECCIONPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTCREAROMODDIRECCIONptpagrTipoDireccion</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODDIRECCION_SOLICITUDTCREAROMODDIRECCIONPTPAGRTIPODIRECCION = "pt_p_agrTipoDireccion";
    /** <code>solicitudTCREAROMODDIRECCIONptpagrTipoDireccion</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODDIRECCION_SOLICITUDTCREAROMODDIRECCIONPTPAGRTIPODIRECCION = "Clas_1431957012480960Ser_33Arg_2_Alias";
    /** <code>solicitudTCREAROMODDIRECCIONptpagrTipoDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODDIRECCION_SOLICITUDTCREAROMODDIRECCIONPTPAGRTIPODIRECCION = "Tipo dirección";
    /** <code>solicitudTCREAROMODDIRECCIONptpagrPais</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODDIRECCION_SOLICITUDTCREAROMODDIRECCIONPTPAGRPAIS = "pt_p_agrPais";
    /** <code>solicitudTCREAROMODDIRECCIONptpagrPais</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODDIRECCION_SOLICITUDTCREAROMODDIRECCIONPTPAGRPAIS = "Clas_1431957012480960Ser_33Arg_3_Alias";
    /** <code>solicitudTCREAROMODDIRECCIONptpagrPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODDIRECCION_SOLICITUDTCREAROMODDIRECCIONPTPAGRPAIS = "País";
    /** <code>solicitudTCREAROMODDIRECCIONptpagrDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODDIRECCION_SOLICITUDTCREAROMODDIRECCIONPTPAGRDEPARTAMENTO = "pt_p_agrDepartamento";
    /** <code>solicitudTCREAROMODDIRECCIONptpagrDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODDIRECCION_SOLICITUDTCREAROMODDIRECCIONPTPAGRDEPARTAMENTO = "Clas_1431957012480960Ser_33Arg_6_Alias";
    /** <code>solicitudTCREAROMODDIRECCIONptpagrDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODDIRECCION_SOLICITUDTCREAROMODDIRECCIONPTPAGRDEPARTAMENTO = "Departamento";
    /** <code>solicitudTCREAROMODDIRECCIONptpagrMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODDIRECCION_SOLICITUDTCREAROMODDIRECCIONPTPAGRMUNICIPIO = "pt_p_agrMunicipio";
    /** <code>solicitudTCREAROMODDIRECCIONptpagrMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODDIRECCION_SOLICITUDTCREAROMODDIRECCIONPTPAGRMUNICIPIO = "Clas_1431957012480960Ser_33Arg_7_Alias";
    /** <code>solicitudTCREAROMODDIRECCIONptpagrMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODDIRECCION_SOLICITUDTCREAROMODDIRECCIONPTPAGRMUNICIPIO = "Municipio";
    /** <code>solicitudTCREAROMODDIRECCIONptpatrDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODDIRECCION_SOLICITUDTCREAROMODDIRECCIONPTPATRDIRECCIONCOMPLETA = "pt_p_atrDireccionCompleta";
    /** <code>solicitudTCREAROMODDIRECCIONptpatrDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODDIRECCION_SOLICITUDTCREAROMODDIRECCIONPTPATRDIRECCIONCOMPLETA = "Clas_1431957012480960Ser_33Arg_8_Alias";
    /** <code>solicitudTCREAROMODDIRECCIONptpatrDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODDIRECCION_SOLICITUDTCREAROMODDIRECCIONPTPATRDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>solicitudTCREAROMODDIRECCIONptpatrRural</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODDIRECCION_SOLICITUDTCREAROMODDIRECCIONPTPATRRURAL = "pt_p_atrRural";
    /** <code>solicitudTCREAROMODDIRECCIONptpatrRural</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODDIRECCION_SOLICITUDTCREAROMODDIRECCIONPTPATRRURAL = "Clas_1431957012480960Ser_33Arg_9_Alias";
    /** <code>solicitudTCREAROMODDIRECCIONptpatrRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODDIRECCION_SOLICITUDTCREAROMODDIRECCIONPTPATRRURAL = "Rural";
    // Service (TCREAROMODCONTRATANTE)
    /** <code>TCREAROMODCONTRATANTE</code> service id. */
    public static final String SERV_ID_TCREAROMODCONTRATANTE = "Clas_1431957012480960Ser_34_Alias";
    /** <code>TCREAROMODCONTRATANTE</code> service name. */
    public static final String SERV_NAME_TCREAROMODCONTRATANTE = "TCREAROMODCONTRATANTE";
    /** <code>TCREAROMODCONTRATANTE</code> service alias. */
    public static final String SERV_ALIAS_TCREAROMODCONTRATANTE = "TCREAROMODCONTRATANTE";
    /** Agents allowed to execute the service TCREAROMODCONTRATANTE **/
    public static final String TCREAROMODCONTRATANTE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudTCREAROMODCONTRATANTEpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODCONTRATANTE_SOLICITUDTCREAROMODCONTRATANTEPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTCREAROMODCONTRATANTEpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODCONTRATANTE_SOLICITUDTCREAROMODCONTRATANTEPTHISSOLICITUD = "Clas_1431957012480960Ser_34Arg_1_Alias";
    /** <code>solicitudTCREAROMODCONTRATANTEpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODCONTRATANTE_SOLICITUDTCREAROMODCONTRATANTEPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTCREAROMODCONTRATANTEptPersonaContratante</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODCONTRATANTE_SOLICITUDTCREAROMODCONTRATANTEPTPERSONACONTRATANTE = "ptPersonaContratante";
    /** <code>solicitudTCREAROMODCONTRATANTEptPersonaContratante</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODCONTRATANTE_SOLICITUDTCREAROMODCONTRATANTEPTPERSONACONTRATANTE = "Clas_1431957012480960Ser_34Arg_50_Alias";
    /** <code>solicitudTCREAROMODCONTRATANTEptPersonaContratante</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODCONTRATANTE_SOLICITUDTCREAROMODCONTRATANTEPTPERSONACONTRATANTE = "Persona";
    /** <code>solicitudTCREAROMODCONTRATANTEptDCTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODCONTRATANTE_SOLICITUDTCREAROMODCONTRATANTEPTDCTELEFONOFIJO = "pt_DCTelefonoFijo";
    /** <code>solicitudTCREAROMODCONTRATANTEptDCTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODCONTRATANTE_SOLICITUDTCREAROMODCONTRATANTEPTDCTELEFONOFIJO = "Clas_1431957012480960Ser_34Arg_51_Alias";
    /** <code>solicitudTCREAROMODCONTRATANTEptDCTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODCONTRATANTE_SOLICITUDTCREAROMODCONTRATANTEPTDCTELEFONOFIJO = "pt_DCTelefonoFijo";
    /** <code>solicitudTCREAROMODCONTRATANTEptDCTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODCONTRATANTE_SOLICITUDTCREAROMODCONTRATANTEPTDCTELEFONOCELULAR = "pt_DCTelefonoCelular";
    /** <code>solicitudTCREAROMODCONTRATANTEptDCTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODCONTRATANTE_SOLICITUDTCREAROMODCONTRATANTEPTDCTELEFONOCELULAR = "Clas_1431957012480960Ser_34Arg_52_Alias";
    /** <code>solicitudTCREAROMODCONTRATANTEptDCTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODCONTRATANTE_SOLICITUDTCREAROMODCONTRATANTEPTDCTELEFONOCELULAR = "pt_DCTelefonoCelular";
    /** <code>solicitudTCREAROMODCONTRATANTEptTitularConBeneficiosCORE</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODCONTRATANTE_SOLICITUDTCREAROMODCONTRATANTEPTTITULARCONBENEFICIOSCORE = "ptTitularConBeneficiosCORE";
    /** <code>solicitudTCREAROMODCONTRATANTEptTitularConBeneficiosCORE</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODCONTRATANTE_SOLICITUDTCREAROMODCONTRATANTEPTTITULARCONBENEFICIOSCORE = "Clas_1431957012480960Ser_34Arg_53_Alias";
    /** <code>solicitudTCREAROMODCONTRATANTEptTitularConBeneficiosCORE</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODCONTRATANTE_SOLICITUDTCREAROMODCONTRATANTEPTTITULARCONBENEFICIOSCORE = "ptTitularConBeneficiosCORE";
    // Service (TMODIFICARINFOPAGO)
    /** <code>TMODIFICARINFOPAGO</code> service id. */
    public static final String SERV_ID_TMODIFICARINFOPAGO = "Clas_1431957012480960Ser_39_Alias";
    /** <code>TMODIFICARINFOPAGO</code> service name. */
    public static final String SERV_NAME_TMODIFICARINFOPAGO = "TMODIFICARINFOPAGO";
    /** <code>TMODIFICARINFOPAGO</code> service alias. */
    public static final String SERV_ALIAS_TMODIFICARINFOPAGO = "Información del pago";
    /** Agents allowed to execute the service TMODIFICARINFOPAGO **/
    public static final String TMODIFICARINFOPAGO_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Preconditions
    /** <code>TMODIFICARINFOPAGO</code> precondition 0 id. */
    public static final String PRE_ID_TMODIFICARINFOPAGO_0 = "Clas_1431957012480960Pre_12_MsgError";
    /** <code>TMODIFICARINFOPAGO</code> precondition 1 id. */
    public static final String PRE_ID_TMODIFICARINFOPAGO_1 = "Clas_1431957012480960Pre_78_MsgError";
    // Inbound arguments
    /** <code>solicitudTMODIFICARINFOPAGOpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTMODIFICARINFOPAGOpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPTHISSOLICITUD = "Clas_1431957012480960Ser_39Arg_1_Alias";
    /** <code>solicitudTMODIFICARINFOPAGOpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTMODIFICARINFOPAGOptpevcPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPTPEVCPERIODICIDAD = "pt_p_evcPeriodicidad";
    /** <code>solicitudTMODIFICARINFOPAGOptpevcPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPTPEVCPERIODICIDAD = "Clas_1431957012480960Ser_39Arg_2_Alias";
    /** <code>solicitudTMODIFICARINFOPAGOptpevcPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPTPEVCPERIODICIDAD = "Periodicidad pago";
    /** <code>solicitudTMODIFICARINFOPAGOptpevcFormaPago</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPTPEVCFORMAPAGO = "pt_p_evcFormaPago";
    /** <code>solicitudTMODIFICARINFOPAGOptpevcFormaPago</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPTPEVCFORMAPAGO = "Clas_1431957012480960Ser_39Arg_3_Alias";
    /** <code>solicitudTMODIFICARINFOPAGOptpevcFormaPago</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPTPEVCFORMAPAGO = "Forma Pago";
    /** <code>solicitudTMODIFICARINFOPAGOptpvalorCuota</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPTPVALORCUOTA = "pt_p_valorCuota";
    /** <code>solicitudTMODIFICARINFOPAGOptpvalorCuota</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPTPVALORCUOTA = "Clas_1431957012480960Ser_39Arg_4_Alias";
    /** <code>solicitudTMODIFICARINFOPAGOptpvalorCuota</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPTPVALORCUOTA = "Valor cuota";
    /** <code>solicitudTMODIFICARINFOPAGOptpvalorDtoComercialSim</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPTPVALORDTOCOMERCIALSIM = "pt_p_valorDtoComercialSim";
    /** <code>solicitudTMODIFICARINFOPAGOptpvalorDtoComercialSim</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPTPVALORDTOCOMERCIALSIM = "Clas_1431957012480960Ser_39Arg_5_Alias";
    /** <code>solicitudTMODIFICARINFOPAGOptpvalorDtoComercialSim</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPTPVALORDTOCOMERCIALSIM = "Dto. Comercial Simultaneidad";
    /** <code>solicitudTMODIFICARINFOPAGOptpValorDtoFinanciero</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPTPVALORDTOFINANCIERO = "pt_p_ValorDtoFinanciero";
    /** <code>solicitudTMODIFICARINFOPAGOptpValorDtoFinanciero</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPTPVALORDTOFINANCIERO = "Clas_1431957012480960Ser_39Arg_9_Alias";
    /** <code>solicitudTMODIFICARINFOPAGOptpValorDtoFinanciero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPTPVALORDTOFINANCIERO = "Valor Dto. Financiero";
    /** <code>solicitudTMODIFICARINFOPAGOpValorCuotaInscripcion</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPVALORCUOTAINSCRIPCION = "p_ValorCuotaInscripcion";
    /** <code>solicitudTMODIFICARINFOPAGOpValorCuotaInscripcion</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPVALORCUOTAINSCRIPCION = "Clas_1431957012480960Ser_39Arg_11_Alias";
    /** <code>solicitudTMODIFICARINFOPAGOpValorCuotaInscripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPVALORCUOTAINSCRIPCION = "Valor cuota inscripción";
    /** <code>solicitudTMODIFICARINFOPAGOpSubtotal</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPSUBTOTAL = "p_Subtotal";
    /** <code>solicitudTMODIFICARINFOPAGOpSubtotal</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPSUBTOTAL = "Clas_1431957012480960Ser_39Arg_12_Alias";
    /** <code>solicitudTMODIFICARINFOPAGOpSubtotal</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPSUBTOTAL = "Subtotal";
    /** <code>solicitudTMODIFICARINFOPAGOpBaseGrabable</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPBASEGRABABLE = "p_BaseGrabable";
    /** <code>solicitudTMODIFICARINFOPAGOpBaseGrabable</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPBASEGRABABLE = "Clas_1431957012480960Ser_39Arg_13_Alias";
    /** <code>solicitudTMODIFICARINFOPAGOpBaseGrabable</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPBASEGRABABLE = "Base grabable";
    /** <code>solicitudTMODIFICARINFOPAGOpPorcenIVA</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPPORCENIVA = "p_PorcenIVA";
    /** <code>solicitudTMODIFICARINFOPAGOpPorcenIVA</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPPORCENIVA = "Clas_1431957012480960Ser_39Arg_14_Alias";
    /** <code>solicitudTMODIFICARINFOPAGOpPorcenIVA</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPPORCENIVA = "% IVA";
    /** <code>solicitudTMODIFICARINFOPAGOpIVA</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPIVA = "p_IVA";
    /** <code>solicitudTMODIFICARINFOPAGOpIVA</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPIVA = "Clas_1431957012480960Ser_39Arg_15_Alias";
    /** <code>solicitudTMODIFICARINFOPAGOpIVA</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPIVA = "IVA";
    /** <code>solicitudTMODIFICARINFOPAGOpTotal</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPTOTAL = "p_Total";
    /** <code>solicitudTMODIFICARINFOPAGOpTotal</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPTOTAL = "Clas_1431957012480960Ser_39Arg_16_Alias";
    /** <code>solicitudTMODIFICARINFOPAGOpTotal</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARINFOPAGO_SOLICITUDTMODIFICARINFOPAGOPTOTAL = "Total";
    // Service (TCREAROMODFIRMA)
    /** <code>TCREAROMODFIRMA</code> service id. */
    public static final String SERV_ID_TCREAROMODFIRMA = "Clas_1431957012480960Ser_41_Alias";
    /** <code>TCREAROMODFIRMA</code> service name. */
    public static final String SERV_NAME_TCREAROMODFIRMA = "TCREAROMODFIRMA";
    /** <code>TCREAROMODFIRMA</code> service alias. */
    public static final String SERV_ALIAS_TCREAROMODFIRMA = "Firma solicitud";
    /** Agents allowed to execute the service TCREAROMODFIRMA **/
    public static final String TCREAROMODFIRMA_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Inbound arguments
    /** <code>solicitudTCREAROMODFIRMApthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODFIRMA_SOLICITUDTCREAROMODFIRMAPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTCREAROMODFIRMApthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODFIRMA_SOLICITUDTCREAROMODFIRMAPTHISSOLICITUD = "Clas_1431957012480960Ser_41Arg_1_Alias";
    /** <code>solicitudTCREAROMODFIRMApthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODFIRMA_SOLICITUDTCREAROMODFIRMAPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTCREAROMODFIRMAptpatrImagenFirma</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODFIRMA_SOLICITUDTCREAROMODFIRMAPTPATRIMAGENFIRMA = "pt_p_atrImagenFirma";
    /** <code>solicitudTCREAROMODFIRMAptpatrImagenFirma</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODFIRMA_SOLICITUDTCREAROMODFIRMAPTPATRIMAGENFIRMA = "Clas_1431957012480960Ser_41Arg_3_Alias";
    /** <code>solicitudTCREAROMODFIRMAptpatrImagenFirma</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODFIRMA_SOLICITUDTCREAROMODFIRMAPTPATRIMAGENFIRMA = "Firma";
    /** <code>solicitudTCREAROMODFIRMAptpatrLatitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODFIRMA_SOLICITUDTCREAROMODFIRMAPTPATRLATITUD = "pt_p_atrLatitud";
    /** <code>solicitudTCREAROMODFIRMAptpatrLatitud</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODFIRMA_SOLICITUDTCREAROMODFIRMAPTPATRLATITUD = "Clas_1431957012480960Ser_41Arg_4_Alias";
    /** <code>solicitudTCREAROMODFIRMAptpatrLatitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODFIRMA_SOLICITUDTCREAROMODFIRMAPTPATRLATITUD = "Latitud";
    /** <code>solicitudTCREAROMODFIRMAptpatrLongitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODFIRMA_SOLICITUDTCREAROMODFIRMAPTPATRLONGITUD = "pt_p_atrLongitud";
    /** <code>solicitudTCREAROMODFIRMAptpatrLongitud</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODFIRMA_SOLICITUDTCREAROMODFIRMAPTPATRLONGITUD = "Clas_1431957012480960Ser_41Arg_5_Alias";
    /** <code>solicitudTCREAROMODFIRMAptpatrLongitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODFIRMA_SOLICITUDTCREAROMODFIRMAPTPATRLONGITUD = "Longitud";
    /** <code>solicitudTCREAROMODFIRMAptTexto</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODFIRMA_SOLICITUDTCREAROMODFIRMAPTTEXTO = "pt_Texto";
    /** <code>solicitudTCREAROMODFIRMAptTexto</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODFIRMA_SOLICITUDTCREAROMODFIRMAPTTEXTO = "Clas_1431957012480960Ser_41Arg_6_Alias";
    /** <code>solicitudTCREAROMODFIRMAptTexto</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODFIRMA_SOLICITUDTCREAROMODFIRMAPTTEXTO = "Aviso";
    // Service (TCREAROMODTITULAR)
    /** <code>TCREAROMODTITULAR</code> service id. */
    public static final String SERV_ID_TCREAROMODTITULAR = "Clas_1431957012480960Ser_55_Alias";
    /** <code>TCREAROMODTITULAR</code> service name. */
    public static final String SERV_NAME_TCREAROMODTITULAR = "TCREAROMODTITULAR";
    /** <code>TCREAROMODTITULAR</code> service alias. */
    public static final String SERV_ALIAS_TCREAROMODTITULAR = "TCREAROMODTITULAR";
    /** Agents allowed to execute the service TCREAROMODTITULAR **/
    public static final String TCREAROMODTITULAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudTCREAROMODTITULARpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTCREAROMODTITULARpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTHISSOLICITUD = "Clas_1431957012480960Ser_55Arg_1_Alias";
    /** <code>solicitudTCREAROMODTITULARpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTCREAROMODTITULARptpagrTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPAGRTIPOIDENTIFICACION = "pt_p_agrTipoIdentificacion";
    /** <code>solicitudTCREAROMODTITULARptpagrTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPAGRTIPOIDENTIFICACION = "Clas_1431957012480960Ser_55Arg_2_Alias";
    /** <code>solicitudTCREAROMODTITULARptpagrTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPAGRTIPOIDENTIFICACION = "Tipo identificación";
    /** <code>solicitudTCREAROMODTITULARptpagrDepartamentoNac</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPAGRDEPARTAMENTONAC = "pt_p_agrDepartamentoNac";
    /** <code>solicitudTCREAROMODTITULARptpagrDepartamentoNac</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPAGRDEPARTAMENTONAC = "Clas_1431957012480960Ser_55Arg_3_Alias";
    /** <code>solicitudTCREAROMODTITULARptpagrDepartamentoNac</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPAGRDEPARTAMENTONAC = "Departamento nacimiento";
    /** <code>solicitudTCREAROMODTITULARptpagrMunicipioNac</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPAGRMUNICIPIONAC = "pt_p_agrMunicipioNac";
    /** <code>solicitudTCREAROMODTITULARptpagrMunicipioNac</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPAGRMUNICIPIONAC = "Clas_1431957012480960Ser_55Arg_4_Alias";
    /** <code>solicitudTCREAROMODTITULARptpagrMunicipioNac</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPAGRMUNICIPIONAC = "Municipio nacimiento";
    /** <code>solicitudTCREAROMODTITULARptpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRCODIGO = "pt_p_atrCodigo";
    /** <code>solicitudTCREAROMODTITULARptpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRCODIGO = "Clas_1431957012480960Ser_55Arg_5_Alias";
    /** <code>solicitudTCREAROMODTITULARptpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRCODIGO = "Código";
    /** <code>solicitudTCREAROMODTITULARptpatrNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRNUMIDENTIFICACION = "pt_p_atrNumIdentificacion";
    /** <code>solicitudTCREAROMODTITULARptpatrNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRNUMIDENTIFICACION = "Clas_1431957012480960Ser_55Arg_6_Alias";
    /** <code>solicitudTCREAROMODTITULARptpatrNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRNUMIDENTIFICACION = "Nº Identificación";
    /** <code>solicitudTCREAROMODTITULARptpatrTipoPersona</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRTIPOPERSONA = "pt_p_atrTipoPersona";
    /** <code>solicitudTCREAROMODTITULARptpatrTipoPersona</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRTIPOPERSONA = "Clas_1431957012480960Ser_55Arg_7_Alias";
    /** <code>solicitudTCREAROMODTITULARptpatrTipoPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRTIPOPERSONA = "Tipo persona";
    /** <code>solicitudTCREAROMODTITULARptpatrPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRPRIMERNOMBRE = "pt_p_atrPrimerNombre";
    /** <code>solicitudTCREAROMODTITULARptpatrPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRPRIMERNOMBRE = "Clas_1431957012480960Ser_55Arg_8_Alias";
    /** <code>solicitudTCREAROMODTITULARptpatrPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRPRIMERNOMBRE = "Primer nombre";
    /** <code>solicitudTCREAROMODTITULARptpatrSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRSEGUNDONOMBRE = "pt_p_atrSegundoNombre";
    /** <code>solicitudTCREAROMODTITULARptpatrSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRSEGUNDONOMBRE = "Clas_1431957012480960Ser_55Arg_9_Alias";
    /** <code>solicitudTCREAROMODTITULARptpatrSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRSEGUNDONOMBRE = "Segundo nombre";
    /** <code>solicitudTCREAROMODTITULARptpatrPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRPRIMERAPELLIDO = "pt_p_atrPrimerApellido";
    /** <code>solicitudTCREAROMODTITULARptpatrPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRPRIMERAPELLIDO = "Clas_1431957012480960Ser_55Arg_10_Alias";
    /** <code>solicitudTCREAROMODTITULARptpatrPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRPRIMERAPELLIDO = "Primer Apellido";
    /** <code>solicitudTCREAROMODTITULARptpatrSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRSEGUNDOAPELLIDO = "pt_p_atrSegundoApellido";
    /** <code>solicitudTCREAROMODTITULARptpatrSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRSEGUNDOAPELLIDO = "Clas_1431957012480960Ser_55Arg_11_Alias";
    /** <code>solicitudTCREAROMODTITULARptpatrSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRSEGUNDOAPELLIDO = "Segundo Apellido";
    /** <code>solicitudTCREAROMODTITULARptpatrFechaNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRFECHANACIMIENTO = "pt_p_atrFechaNacimiento";
    /** <code>solicitudTCREAROMODTITULARptpatrFechaNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRFECHANACIMIENTO = "Clas_1431957012480960Ser_55Arg_13_Alias";
    /** <code>solicitudTCREAROMODTITULARptpatrFechaNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRFECHANACIMIENTO = "Fecha nacimiento";
    /** <code>solicitudTCREAROMODTITULARptpatrGenero</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRGENERO = "pt_p_atrGenero";
    /** <code>solicitudTCREAROMODTITULARptpatrGenero</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRGENERO = "Clas_1431957012480960Ser_55Arg_14_Alias";
    /** <code>solicitudTCREAROMODTITULARptpatrGenero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRGENERO = "Género";
    /** <code>solicitudTCREAROMODTITULARptpatrIndicadorExtranjero</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRINDICADOREXTRANJERO = "pt_p_atrIndicadorExtranjero";
    /** <code>solicitudTCREAROMODTITULARptpatrIndicadorExtranjero</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRINDICADOREXTRANJERO = "Clas_1431957012480960Ser_55Arg_15_Alias";
    /** <code>solicitudTCREAROMODTITULARptpatrIndicadorExtranjero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRINDICADOREXTRANJERO = "Indicador extranjero";
    /** <code>solicitudTCREAROMODTITULARptpatrTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRTELEFONOFIJO = "pt_p_atrTelefonoFijo";
    /** <code>solicitudTCREAROMODTITULARptpatrTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRTELEFONOFIJO = "Clas_1431957012480960Ser_55Arg_16_Alias";
    /** <code>solicitudTCREAROMODTITULARptpatrTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRTELEFONOFIJO = "Teléfono fijo";
    /** <code>solicitudTCREAROMODTITULARptpatrTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRTELEFONOCELULAR = "pt_p_atrTelefonoCelular";
    /** <code>solicitudTCREAROMODTITULARptpatrTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRTELEFONOCELULAR = "Clas_1431957012480960Ser_55Arg_17_Alias";
    /** <code>solicitudTCREAROMODTITULARptpatrTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRTELEFONOCELULAR = "Teléfono celular";
    /** <code>solicitudTCREAROMODTITULARptpatrCorreoElectronico</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRCORREOELECTRONICO = "pt_p_atrCorreoElectronico";
    /** <code>solicitudTCREAROMODTITULARptpatrCorreoElectronico</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRCORREOELECTRONICO = "Clas_1431957012480960Ser_55Arg_18_Alias";
    /** <code>solicitudTCREAROMODTITULARptpatrCorreoElectronico</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRCORREOELECTRONICO = "Correo electrónico";
    /** <code>solicitudTCREAROMODTITULARptpatrTitularConBeneficios</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRTITULARCONBENEFICIOS = "pt_p_atrTitularConBeneficios";
    /** <code>solicitudTCREAROMODTITULARptpatrTitularConBeneficios</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRTITULARCONBENEFICIOS = "Clas_1431957012480960Ser_55Arg_20_Alias";
    /** <code>solicitudTCREAROMODTITULARptpatrTitularConBeneficios</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRTITULARCONBENEFICIOS = "Titular con beneficios";
    /** <code>solicitudTCREAROMODTITULARptpatrTitularRecuperadoInc</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRTITULARRECUPERADOINC = "pt_p_atrTitularRecuperadoInc";
    /** <code>solicitudTCREAROMODTITULARptpatrTitularRecuperadoInc</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRTITULARRECUPERADOINC = "Clas_1431957012480960Ser_55Arg_21_Alias";
    /** <code>solicitudTCREAROMODTITULARptpatrTitularRecuperadoInc</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRTITULARRECUPERADOINC = "Titular recuperado inclusión";
    /** <code>solicitudTCREAROMODTITULARptDCTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTDCTELEFONOFIJO = "ptDCTelefonoFijo";
    /** <code>solicitudTCREAROMODTITULARptDCTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTDCTELEFONOFIJO = "Clas_1431957012480960Ser_55Arg_22_Alias";
    /** <code>solicitudTCREAROMODTITULARptDCTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTDCTELEFONOFIJO = "Teléfono fijo";
    /** <code>solicitudTCREAROMODTITULARptDCTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTDCTELEFONOCELULAR = "ptDCTelefonoCelular";
    /** <code>solicitudTCREAROMODTITULARptDCTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTDCTELEFONOCELULAR = "Clas_1431957012480960Ser_55Arg_23_Alias";
    /** <code>solicitudTCREAROMODTITULARptDCTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTDCTELEFONOCELULAR = "Teléfono celular";
    /** <code>solicitudTCREAROMODTITULARptTitConBeneficiosCORE</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTTITCONBENEFICIOSCORE = "ptTitConBeneficiosCORE";
    /** <code>solicitudTCREAROMODTITULARptTitConBeneficiosCORE</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTTITCONBENEFICIOSCORE = "Clas_1431957012480960Ser_55Arg_24_Alias";
    /** <code>solicitudTCREAROMODTITULARptTitConBeneficiosCORE</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTTITCONBENEFICIOSCORE = "ptTitConBeneficiosCORE";
    /** <code>solicitudTCREAROMODTITULARptRazonSocial</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTRAZONSOCIAL = "ptRazonSocial";
    /** <code>solicitudTCREAROMODTITULARptRazonSocial</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTRAZONSOCIAL = "Clas_1431957012480960Ser_55Arg_25_Alias";
    /** <code>solicitudTCREAROMODTITULARptRazonSocial</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTRAZONSOCIAL = "Razón social";
    // Service (TCREARSEGUNDAFIRMA)
    /** <code>TCREARSEGUNDAFIRMA</code> service id. */
    public static final String SERV_ID_TCREARSEGUNDAFIRMA = "Clas_1431957012480960Ser_61_Alias";
    /** <code>TCREARSEGUNDAFIRMA</code> service name. */
    public static final String SERV_NAME_TCREARSEGUNDAFIRMA = "TCREARSEGUNDAFIRMA";
    /** <code>TCREARSEGUNDAFIRMA</code> service alias. */
    public static final String SERV_ALIAS_TCREARSEGUNDAFIRMA = "Firmar preexistencias";
    /** Agents allowed to execute the service TCREARSEGUNDAFIRMA **/
    public static final String TCREARSEGUNDAFIRMA_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Preconditions
    /** <code>TCREARSEGUNDAFIRMA</code> precondition 0 id. */
    public static final String PRE_ID_TCREARSEGUNDAFIRMA_0 = "Clas_1431957012480960Pre_20_MsgError";
    /** <code>TCREARSEGUNDAFIRMA</code> precondition 1 id. */
    public static final String PRE_ID_TCREARSEGUNDAFIRMA_1 = "Clas_1431957012480960Pre_21_MsgError";
    // Inbound arguments
    /** <code>solicitudTCREARSEGUNDAFIRMApthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREARSEGUNDAFIRMA_SOLICITUDTCREARSEGUNDAFIRMAPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTCREARSEGUNDAFIRMApthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCREARSEGUNDAFIRMA_SOLICITUDTCREARSEGUNDAFIRMAPTHISSOLICITUD = "Clas_1431957012480960Ser_61Arg_1_Alias";
    /** <code>solicitudTCREARSEGUNDAFIRMApthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARSEGUNDAFIRMA_SOLICITUDTCREARSEGUNDAFIRMAPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTCREARSEGUNDAFIRMAptpatrImagenFirma</code> inbound argument name. */
    public static final String ARG_NAME_TCREARSEGUNDAFIRMA_SOLICITUDTCREARSEGUNDAFIRMAPTPATRIMAGENFIRMA = "pt_p_atrImagenFirma";
    /** <code>solicitudTCREARSEGUNDAFIRMAptpatrImagenFirma</code> inbound argument id. */
    public static final String ARG_ID_TCREARSEGUNDAFIRMA_SOLICITUDTCREARSEGUNDAFIRMAPTPATRIMAGENFIRMA = "Clas_1431957012480960Ser_61Arg_2_Alias";
    /** <code>solicitudTCREARSEGUNDAFIRMAptpatrImagenFirma</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARSEGUNDAFIRMA_SOLICITUDTCREARSEGUNDAFIRMAPTPATRIMAGENFIRMA = "Firma";
    /** <code>solicitudTCREARSEGUNDAFIRMAptpatrLatitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREARSEGUNDAFIRMA_SOLICITUDTCREARSEGUNDAFIRMAPTPATRLATITUD = "pt_p_atrLatitud";
    /** <code>solicitudTCREARSEGUNDAFIRMAptpatrLatitud</code> inbound argument id. */
    public static final String ARG_ID_TCREARSEGUNDAFIRMA_SOLICITUDTCREARSEGUNDAFIRMAPTPATRLATITUD = "Clas_1431957012480960Ser_61Arg_3_Alias";
    /** <code>solicitudTCREARSEGUNDAFIRMAptpatrLatitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARSEGUNDAFIRMA_SOLICITUDTCREARSEGUNDAFIRMAPTPATRLATITUD = "Latitud";
    /** <code>solicitudTCREARSEGUNDAFIRMAptpatrLongitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREARSEGUNDAFIRMA_SOLICITUDTCREARSEGUNDAFIRMAPTPATRLONGITUD = "pt_p_atrLongitud";
    /** <code>solicitudTCREARSEGUNDAFIRMAptpatrLongitud</code> inbound argument id. */
    public static final String ARG_ID_TCREARSEGUNDAFIRMA_SOLICITUDTCREARSEGUNDAFIRMAPTPATRLONGITUD = "Clas_1431957012480960Ser_61Arg_4_Alias";
    /** <code>solicitudTCREARSEGUNDAFIRMAptpatrLongitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARSEGUNDAFIRMA_SOLICITUDTCREARSEGUNDAFIRMAPTPATRLONGITUD = "Longitud";
    /** <code>solicitudTCREARSEGUNDAFIRMAptTexto</code> inbound argument name. */
    public static final String ARG_NAME_TCREARSEGUNDAFIRMA_SOLICITUDTCREARSEGUNDAFIRMAPTTEXTO = "pt_Texto";
    /** <code>solicitudTCREARSEGUNDAFIRMAptTexto</code> inbound argument id. */
    public static final String ARG_ID_TCREARSEGUNDAFIRMA_SOLICITUDTCREARSEGUNDAFIRMAPTTEXTO = "Clas_1431957012480960Ser_61Arg_5_Alias";
    /** <code>solicitudTCREARSEGUNDAFIRMAptTexto</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARSEGUNDAFIRMA_SOLICITUDTCREARSEGUNDAFIRMAPTTEXTO = "Aviso";
    // Service (TENVIARDOC)
    /** <code>TENVIARDOC</code> service id. */
    public static final String SERV_ID_TENVIARDOC = "Clas_1431957012480960Ser_64_Alias";
    /** <code>TENVIARDOC</code> service name. */
    public static final String SERV_NAME_TENVIARDOC = "TENVIARDOC";
    /** <code>TENVIARDOC</code> service alias. */
    public static final String SERV_ALIAS_TENVIARDOC = "Selección/Envío de documentación";
    /** Agents allowed to execute the service TENVIARDOC **/
    public static final String TENVIARDOC_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Inbound arguments
    /** <code>solicitudTENVIARDOCpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TENVIARDOC_SOLICITUDTENVIARDOCPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTENVIARDOCpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TENVIARDOC_SOLICITUDTENVIARDOCPTHISSOLICITUD = "Clas_1431957012480960Ser_64Arg_1_Alias";
    /** <code>solicitudTENVIARDOCpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TENVIARDOC_SOLICITUDTENVIARDOCPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTENVIARDOCpPrevisualizar</code> inbound argument name. */
    public static final String ARG_NAME_TENVIARDOC_SOLICITUDTENVIARDOCPPREVISUALIZAR = "p_Previsualizar";
    /** <code>solicitudTENVIARDOCpPrevisualizar</code> inbound argument id. */
    public static final String ARG_ID_TENVIARDOC_SOLICITUDTENVIARDOCPPREVISUALIZAR = "Clas_1431957012480960Ser_64Arg_2_Alias";
    /** <code>solicitudTENVIARDOCpPrevisualizar</code> inbound argument alias. */
    public static final String ARG_ALIAS_TENVIARDOC_SOLICITUDTENVIARDOCPPREVISUALIZAR = "Previsualizar";
    /** <code>solicitudTENVIARDOCpEnviar</code> inbound argument name. */
    public static final String ARG_NAME_TENVIARDOC_SOLICITUDTENVIARDOCPENVIAR = "p_Enviar";
    /** <code>solicitudTENVIARDOCpEnviar</code> inbound argument id. */
    public static final String ARG_ID_TENVIARDOC_SOLICITUDTENVIARDOCPENVIAR = "Clas_1431957012480960Ser_64Arg_3_Alias";
    /** <code>solicitudTENVIARDOCpEnviar</code> inbound argument alias. */
    public static final String ARG_ALIAS_TENVIARDOC_SOLICITUDTENVIARDOCPENVIAR = "Enviar";
    /** <code>solicitudTENVIARDOCpContrato</code> inbound argument name. */
    public static final String ARG_NAME_TENVIARDOC_SOLICITUDTENVIARDOCPCONTRATO = "p_Contrato";
    /** <code>solicitudTENVIARDOCpContrato</code> inbound argument id. */
    public static final String ARG_ID_TENVIARDOC_SOLICITUDTENVIARDOCPCONTRATO = "Clas_1431957012480960Ser_64Arg_4_Alias";
    /** <code>solicitudTENVIARDOCpContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_TENVIARDOC_SOLICITUDTENVIARDOCPCONTRATO = "Contrato";
    /** <code>solicitudTENVIARDOCpCarnets</code> inbound argument name. */
    public static final String ARG_NAME_TENVIARDOC_SOLICITUDTENVIARDOCPCARNETS = "p_Carnets";
    /** <code>solicitudTENVIARDOCpCarnets</code> inbound argument id. */
    public static final String ARG_ID_TENVIARDOC_SOLICITUDTENVIARDOCPCARNETS = "Clas_1431957012480960Ser_64Arg_5_Alias";
    /** <code>solicitudTENVIARDOCpCarnets</code> inbound argument alias. */
    public static final String ARG_ALIAS_TENVIARDOC_SOLICITUDTENVIARDOCPCARNETS = "Carnets";
    /** <code>solicitudTENVIARDOCpCartaPre</code> inbound argument name. */
    public static final String ARG_NAME_TENVIARDOC_SOLICITUDTENVIARDOCPCARTAPRE = "p_CartaPre";
    /** <code>solicitudTENVIARDOCpCartaPre</code> inbound argument id. */
    public static final String ARG_ID_TENVIARDOC_SOLICITUDTENVIARDOCPCARTAPRE = "Clas_1431957012480960Ser_64Arg_6_Alias";
    /** <code>solicitudTENVIARDOCpCartaPre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TENVIARDOC_SOLICITUDTENVIARDOCPCARTAPRE = "Carta preexistencia";
    /** <code>solicitudTENVIARDOCpSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TENVIARDOC_SOLICITUDTENVIARDOCPSOLICITUD = "p_Solicitud";
    /** <code>solicitudTENVIARDOCpSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TENVIARDOC_SOLICITUDTENVIARDOCPSOLICITUD = "Clas_1431957012480960Ser_64Arg_7_Alias";
    /** <code>solicitudTENVIARDOCpSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TENVIARDOC_SOLICITUDTENVIARDOCPSOLICITUD = "Solicitud contratación";
    /** <code>solicitudTENVIARDOCpCondicionesBB</code> inbound argument name. */
    public static final String ARG_NAME_TENVIARDOC_SOLICITUDTENVIARDOCPCONDICIONESBB = "p_CondicionesBB";
    /** <code>solicitudTENVIARDOCpCondicionesBB</code> inbound argument id. */
    public static final String ARG_ID_TENVIARDOC_SOLICITUDTENVIARDOCPCONDICIONESBB = "Clas_1431957012480960Ser_64Arg_8_Alias";
    /** <code>solicitudTENVIARDOCpCondicionesBB</code> inbound argument alias. */
    public static final String ARG_ALIAS_TENVIARDOC_SOLICITUDTENVIARDOCPCONDICIONESBB = "Condiciones BB gestante";
    /** <code>solicitudTENVIARDOCpAnexosIncl</code> inbound argument name. */
    public static final String ARG_NAME_TENVIARDOC_SOLICITUDTENVIARDOCPANEXOSINCL = "p_AnexosIncl";
    /** <code>solicitudTENVIARDOCpAnexosIncl</code> inbound argument id. */
    public static final String ARG_ID_TENVIARDOC_SOLICITUDTENVIARDOCPANEXOSINCL = "Clas_1431957012480960Ser_64Arg_9_Alias";
    /** <code>solicitudTENVIARDOCpAnexosIncl</code> inbound argument alias. */
    public static final String ARG_ALIAS_TENVIARDOC_SOLICITUDTENVIARDOCPANEXOSINCL = "Anexos inclusión";
    /** <code>solicitudTENVIARDOCpDocMaternidad</code> inbound argument name. */
    public static final String ARG_NAME_TENVIARDOC_SOLICITUDTENVIARDOCPDOCMATERNIDAD = "p_DocMaternidad";
    /** <code>solicitudTENVIARDOCpDocMaternidad</code> inbound argument id. */
    public static final String ARG_ID_TENVIARDOC_SOLICITUDTENVIARDOCPDOCMATERNIDAD = "Clas_1431957012480960Ser_64Arg_10_Alias";
    /** <code>solicitudTENVIARDOCpDocMaternidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TENVIARDOC_SOLICITUDTENVIARDOCPDOCMATERNIDAD = "Doc. maternidad";
    /** <code>solicitudTENVIARDOCpCuesMedico</code> inbound argument name. */
    public static final String ARG_NAME_TENVIARDOC_SOLICITUDTENVIARDOCPCUESMEDICO = "p_CuesMedico";
    /** <code>solicitudTENVIARDOCpCuesMedico</code> inbound argument id. */
    public static final String ARG_ID_TENVIARDOC_SOLICITUDTENVIARDOCPCUESMEDICO = "Clas_1431957012480960Ser_64Arg_11_Alias";
    /** <code>solicitudTENVIARDOCpCuesMedico</code> inbound argument alias. */
    public static final String ARG_ALIAS_TENVIARDOC_SOLICITUDTENVIARDOCPCUESMEDICO = "Cuestionario médico";
    /** <code>solicitudTENVIARDOCpCartaEntrevista</code> inbound argument name. */
    public static final String ARG_NAME_TENVIARDOC_SOLICITUDTENVIARDOCPCARTAENTREVISTA = "p_CartaEntrevista";
    /** <code>solicitudTENVIARDOCpCartaEntrevista</code> inbound argument id. */
    public static final String ARG_ID_TENVIARDOC_SOLICITUDTENVIARDOCPCARTAENTREVISTA = "Clas_1431957012480960Ser_64Arg_12_Alias";
    /** <code>solicitudTENVIARDOCpCartaEntrevista</code> inbound argument alias. */
    public static final String ARG_ALIAS_TENVIARDOC_SOLICITUDTENVIARDOCPCARTAENTREVISTA = "Carta entrevista médica";
    /** <code>solicitudTENVIARDOCpProteccionDatos</code> inbound argument name. */
    public static final String ARG_NAME_TENVIARDOC_SOLICITUDTENVIARDOCPPROTECCIONDATOS = "p_ProteccionDatos";
    /** <code>solicitudTENVIARDOCpProteccionDatos</code> inbound argument id. */
    public static final String ARG_ID_TENVIARDOC_SOLICITUDTENVIARDOCPPROTECCIONDATOS = "Clas_1431957012480960Ser_64Arg_13_Alias";
    /** <code>solicitudTENVIARDOCpProteccionDatos</code> inbound argument alias. */
    public static final String ARG_ALIAS_TENVIARDOC_SOLICITUDTENVIARDOCPPROTECCIONDATOS = "Protección de datos";
    /** <code>solicitudTENVIARDOCpDiferenciasLiq</code> inbound argument name. */
    public static final String ARG_NAME_TENVIARDOC_SOLICITUDTENVIARDOCPDIFERENCIASLIQ = "p_DiferenciasLiq";
    /** <code>solicitudTENVIARDOCpDiferenciasLiq</code> inbound argument id. */
    public static final String ARG_ID_TENVIARDOC_SOLICITUDTENVIARDOCPDIFERENCIASLIQ = "Clas_1431957012480960Ser_64Arg_14_Alias";
    /** <code>solicitudTENVIARDOCpDiferenciasLiq</code> inbound argument alias. */
    public static final String ARG_ALIAS_TENVIARDOC_SOLICITUDTENVIARDOCPDIFERENCIASLIQ = "Carta diferencias liquidación";
    /** <code>solicitudTENVIARDOCpMarcarTodos</code> inbound argument name. */
    public static final String ARG_NAME_TENVIARDOC_SOLICITUDTENVIARDOCPMARCARTODOS = "p_MarcarTodos";
    /** <code>solicitudTENVIARDOCpMarcarTodos</code> inbound argument id. */
    public static final String ARG_ID_TENVIARDOC_SOLICITUDTENVIARDOCPMARCARTODOS = "Clas_1431957012480960Ser_64Arg_16_Alias";
    /** <code>solicitudTENVIARDOCpMarcarTodos</code> inbound argument alias. */
    public static final String ARG_ALIAS_TENVIARDOC_SOLICITUDTENVIARDOCPMARCARTODOS = "Marcar Todos";
    /** <code>solicitudTENVIARDOCpDocNeonatal</code> inbound argument name. */
    public static final String ARG_NAME_TENVIARDOC_SOLICITUDTENVIARDOCPDOCNEONATAL = "p_DocNeonatal";
    /** <code>solicitudTENVIARDOCpDocNeonatal</code> inbound argument id. */
    public static final String ARG_ID_TENVIARDOC_SOLICITUDTENVIARDOCPDOCNEONATAL = "Clas_1431957012480960Ser_64Arg_17_Alias";
    /** <code>solicitudTENVIARDOCpDocNeonatal</code> inbound argument alias. */
    public static final String ARG_ALIAS_TENVIARDOC_SOLICITUDTENVIARDOCPDOCNEONATAL = "Doc. neonatal";
    // Outbound arguments
    /** <code>solicitudTENVIARDOCoaPlantilla</code> outbound argument name. */
    public static final String ARG_NAME_TENVIARDOC_SOLICITUDTENVIARDOCOAPLANTILLA = "solicitudTENVIARDOCoaPlantilla";
    /** <code>solicitudTENVIARDOCoaPlantilla</code> outbound argument id. */
    public static final String ARG_ID_TENVIARDOC_SOLICITUDTENVIARDOCOAPLANTILLA = "Clas_1431957012480960Ser_64Arg_19_Alias";
    /** <code>solicitudTENVIARDOCoaPlantilla</code> outbound argument alias. */
    public static final String ARG_ALIAS_TENVIARDOC_SOLICITUDTENVIARDOCOAPLANTILLA = "Plantilla email";
    // Service (TNOTIFICARANULACION)
    /** <code>TNOTIFICARANULACION</code> service id. */
    public static final String SERV_ID_TNOTIFICARANULACION = "Clas_1431957012480960Ser_73_Alias";
    /** <code>TNOTIFICARANULACION</code> service name. */
    public static final String SERV_NAME_TNOTIFICARANULACION = "TNOTIFICARANULACION";
    /** <code>TNOTIFICARANULACION</code> service alias. */
    public static final String SERV_ALIAS_TNOTIFICARANULACION = "Notificar anulación";
    /** Agents allowed to execute the service TNOTIFICARANULACION **/
    public static final String TNOTIFICARANULACION_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    // Inbound arguments
    /** <code>solicitudTNOTIFICARANULACIONpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TNOTIFICARANULACION_SOLICITUDTNOTIFICARANULACIONPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTNOTIFICARANULACIONpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TNOTIFICARANULACION_SOLICITUDTNOTIFICARANULACIONPTHISSOLICITUD = "Clas_1431957012480960Ser_73Arg_1_Alias";
    /** <code>solicitudTNOTIFICARANULACIONpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNOTIFICARANULACION_SOLICITUDTNOTIFICARANULACIONPTHISSOLICITUD = "Solicitud";
    // Service (TNOTIFICARCREAR)
    /** <code>TNOTIFICARCREAR</code> service id. */
    public static final String SERV_ID_TNOTIFICARCREAR = "Clas_1431957012480960Ser_74_Alias";
    /** <code>TNOTIFICARCREAR</code> service name. */
    public static final String SERV_NAME_TNOTIFICARCREAR = "TNOTIFICARCREAR";
    /** <code>TNOTIFICARCREAR</code> service alias. */
    public static final String SERV_ALIAS_TNOTIFICARCREAR = "Notificar crear";
    /** Agents allowed to execute the service TNOTIFICARCREAR **/
    public static final String TNOTIFICARCREAR_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    // Inbound arguments
    /** <code>solicitudTNOTIFICARCREARpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TNOTIFICARCREAR_SOLICITUDTNOTIFICARCREARPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTNOTIFICARCREARpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TNOTIFICARCREAR_SOLICITUDTNOTIFICARCREARPTHISSOLICITUD = "Clas_1431957012480960Ser_74Arg_1_Alias";
    /** <code>solicitudTNOTIFICARCREARpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNOTIFICARCREAR_SOLICITUDTNOTIFICARCREARPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTNOTIFICARCREARptConfiCierreSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TNOTIFICARCREAR_SOLICITUDTNOTIFICARCREARPTCONFICIERRESOLICITUD = "ptConfiCierreSolicitud";
    /** <code>solicitudTNOTIFICARCREARptConfiCierreSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TNOTIFICARCREAR_SOLICITUDTNOTIFICARCREARPTCONFICIERRESOLICITUD = "Clas_1431957012480960Ser_74Arg_4_Alias";
    /** <code>solicitudTNOTIFICARCREARptConfiCierreSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNOTIFICARCREAR_SOLICITUDTNOTIFICARCREARPTCONFICIERRESOLICITUD = "ptConfiCierreSolicitud";
    /** <code>solicitudTNOTIFICARCREARptNumFamiliaCORE</code> inbound argument name. */
    public static final String ARG_NAME_TNOTIFICARCREAR_SOLICITUDTNOTIFICARCREARPTNUMFAMILIACORE = "ptNumFamiliaCORE";
    /** <code>solicitudTNOTIFICARCREARptNumFamiliaCORE</code> inbound argument id. */
    public static final String ARG_ID_TNOTIFICARCREAR_SOLICITUDTNOTIFICARCREARPTNUMFAMILIACORE = "Clas_1431957012480960Ser_74Arg_5_Alias";
    /** <code>solicitudTNOTIFICARCREARptNumFamiliaCORE</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNOTIFICARCREAR_SOLICITUDTNOTIFICARCREARPTNUMFAMILIACORE = "ptNumFamiliaCORE";
    // Service (TUPDATEBENEFICIARIO)
    /** <code>TUPDATEBENEFICIARIO</code> service id. */
    public static final String SERV_ID_TUPDATEBENEFICIARIO = "Clas_1431957012480960Ser_75_Alias";
    /** <code>TUPDATEBENEFICIARIO</code> service name. */
    public static final String SERV_NAME_TUPDATEBENEFICIARIO = "TUPDATEBENEFICIARIO";
    /** <code>TUPDATEBENEFICIARIO</code> service alias. */
    public static final String SERV_ALIAS_TUPDATEBENEFICIARIO = "Actualizar un beneficiario";
    /** Agents allowed to execute the service TUPDATEBENEFICIARIO **/
    public static final String TUPDATEBENEFICIARIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudTUPDATEBENEFICIARIOpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TUPDATEBENEFICIARIO_SOLICITUDTUPDATEBENEFICIARIOPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTUPDATEBENEFICIARIOpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TUPDATEBENEFICIARIO_SOLICITUDTUPDATEBENEFICIARIOPTHISSOLICITUD = "Clas_1431957012480960Ser_75Arg_1_Alias";
    /** <code>solicitudTUPDATEBENEFICIARIOpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TUPDATEBENEFICIARIO_SOLICITUDTUPDATEBENEFICIARIOPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTUPDATEBENEFICIARIOpBeneficiarioC</code> inbound argument name. */
    public static final String ARG_NAME_TUPDATEBENEFICIARIO_SOLICITUDTUPDATEBENEFICIARIOPBENEFICIARIOC = "p_BeneficiarioC";
    /** <code>solicitudTUPDATEBENEFICIARIOpBeneficiarioC</code> inbound argument id. */
    public static final String ARG_ID_TUPDATEBENEFICIARIO_SOLICITUDTUPDATEBENEFICIARIOPBENEFICIARIOC = "Clas_1431957012480960Ser_75Arg_2_Alias";
    /** <code>solicitudTUPDATEBENEFICIARIOpBeneficiarioC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TUPDATEBENEFICIARIO_SOLICITUDTUPDATEBENEFICIARIOPBENEFICIARIOC = "Beneficiario CORE";
    // Service (TNOTIFICARINCLUSION)
    /** <code>TNOTIFICARINCLUSION</code> service id. */
    public static final String SERV_ID_TNOTIFICARINCLUSION = "Clas_1431957012480960Ser_78_Alias";
    /** <code>TNOTIFICARINCLUSION</code> service name. */
    public static final String SERV_NAME_TNOTIFICARINCLUSION = "TNOTIFICARINCLUSION";
    /** <code>TNOTIFICARINCLUSION</code> service alias. */
    public static final String SERV_ALIAS_TNOTIFICARINCLUSION = "Notificar inclusión";
    /** Agents allowed to execute the service TNOTIFICARINCLUSION **/
    public static final String TNOTIFICARINCLUSION_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    // Inbound arguments
    /** <code>solicitudTNOTIFICARINCLUSIONpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TNOTIFICARINCLUSION_SOLICITUDTNOTIFICARINCLUSIONPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTNOTIFICARINCLUSIONpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TNOTIFICARINCLUSION_SOLICITUDTNOTIFICARINCLUSIONPTHISSOLICITUD = "Clas_1431957012480960Ser_78Arg_1_Alias";
    /** <code>solicitudTNOTIFICARINCLUSIONpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNOTIFICARINCLUSION_SOLICITUDTNOTIFICARINCLUSIONPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTNOTIFICARINCLUSIONptConfiCierreSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TNOTIFICARINCLUSION_SOLICITUDTNOTIFICARINCLUSIONPTCONFICIERRESOLICITUD = "ptConfiCierreSolicitud";
    /** <code>solicitudTNOTIFICARINCLUSIONptConfiCierreSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TNOTIFICARINCLUSION_SOLICITUDTNOTIFICARINCLUSIONPTCONFICIERRESOLICITUD = "Clas_1431957012480960Ser_78Arg_3_Alias";
    /** <code>solicitudTNOTIFICARINCLUSIONptConfiCierreSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNOTIFICARINCLUSION_SOLICITUDTNOTIFICARINCLUSIONPTCONFICIERRESOLICITUD = "ptConfiCierreSolicitud";
    /** <code>solicitudTNOTIFICARINCLUSIONptNumFamiliaCORE</code> inbound argument name. */
    public static final String ARG_NAME_TNOTIFICARINCLUSION_SOLICITUDTNOTIFICARINCLUSIONPTNUMFAMILIACORE = "ptNumFamiliaCORE";
    /** <code>solicitudTNOTIFICARINCLUSIONptNumFamiliaCORE</code> inbound argument id. */
    public static final String ARG_ID_TNOTIFICARINCLUSION_SOLICITUDTNOTIFICARINCLUSIONPTNUMFAMILIACORE = "Clas_1431957012480960Ser_78Arg_4_Alias";
    /** <code>solicitudTNOTIFICARINCLUSIONptNumFamiliaCORE</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNOTIFICARINCLUSION_SOLICITUDTNOTIFICARINCLUSIONPTNUMFAMILIACORE = "ptNumFamiliaCORE";
    // Service (TCREARDOCNUMIDSIEXISTE)
    /** <code>TCREARDOCNUMIDSIEXISTE</code> service id. */
    public static final String SERV_ID_TCREARDOCNUMIDSIEXISTE = "Clas_1431957012480960Ser_82_Alias";
    /** <code>TCREARDOCNUMIDSIEXISTE</code> service name. */
    public static final String SERV_NAME_TCREARDOCNUMIDSIEXISTE = "TCREARDOCNUMIDSIEXISTE";
    /** <code>TCREARDOCNUMIDSIEXISTE</code> service alias. */
    public static final String SERV_ALIAS_TCREARDOCNUMIDSIEXISTE = "Crear documento de Nº Identificación desde el gestor";
    /** Agents allowed to execute the service TCREARDOCNUMIDSIEXISTE **/
    public static final String TCREARDOCNUMIDSIEXISTE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudTCREARDOCNUMIDSIEXISTEpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREARDOCNUMIDSIEXISTE_SOLICITUDTCREARDOCNUMIDSIEXISTEPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTCREARDOCNUMIDSIEXISTEpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCREARDOCNUMIDSIEXISTE_SOLICITUDTCREARDOCNUMIDSIEXISTEPTHISSOLICITUD = "Clas_1431957012480960Ser_82Arg_1_Alias";
    /** <code>solicitudTCREARDOCNUMIDSIEXISTEpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARDOCNUMIDSIEXISTE_SOLICITUDTCREARDOCNUMIDSIEXISTEPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTCREARDOCNUMIDSIEXISTEpNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARDOCNUMIDSIEXISTE_SOLICITUDTCREARDOCNUMIDSIEXISTEPNUMIDENTIFICACION = "p_NumIdentificacion";
    /** <code>solicitudTCREARDOCNUMIDSIEXISTEpNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TCREARDOCNUMIDSIEXISTE_SOLICITUDTCREARDOCNUMIDSIEXISTEPNUMIDENTIFICACION = "Clas_1431957012480960Ser_82Arg_2_Alias";
    /** <code>solicitudTCREARDOCNUMIDSIEXISTEpNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARDOCNUMIDSIEXISTE_SOLICITUDTCREARDOCNUMIDSIEXISTEPNUMIDENTIFICACION = "p_NumIdentificacion";
    /** <code>solicitudTCREARDOCNUMIDSIEXISTEpPersona</code> inbound argument name. */
    public static final String ARG_NAME_TCREARDOCNUMIDSIEXISTE_SOLICITUDTCREARDOCNUMIDSIEXISTEPPERSONA = "p_Persona";
    /** <code>solicitudTCREARDOCNUMIDSIEXISTEpPersona</code> inbound argument id. */
    public static final String ARG_ID_TCREARDOCNUMIDSIEXISTE_SOLICITUDTCREARDOCNUMIDSIEXISTEPPERSONA = "Clas_1431957012480960Ser_82Arg_3_Alias";
    /** <code>solicitudTCREARDOCNUMIDSIEXISTEpPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARDOCNUMIDSIEXISTE_SOLICITUDTCREARDOCNUMIDSIEXISTEPPERSONA = "Persona";
    // Service (TINDICARCONTRATANTE2)
    /** <code>TINDICARCONTRATANTE2</code> service id. */
    public static final String SERV_ID_TINDICARCONTRATANTE2 = "Clas_1431957012480960Ser_86_Alias";
    /** <code>TINDICARCONTRATANTE2</code> service name. */
    public static final String SERV_NAME_TINDICARCONTRATANTE2 = "TINDICARCONTRATANTE2";
    /** <code>TINDICARCONTRATANTE2</code> service alias. */
    public static final String SERV_ALIAS_TINDICARCONTRATANTE2 = "Indicar Contratante";
    /** Agents allowed to execute the service TINDICARCONTRATANTE2 **/
    public static final String TINDICARCONTRATANTE2_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Preconditions
    /** <code>TINDICARCONTRATANTE2</code> precondition 0 id. */
    public static final String PRE_ID_TINDICARCONTRATANTE2_0 = "Clas_1431957012480960Pre_68_MsgError";
    /** <code>TINDICARCONTRATANTE2</code> precondition 1 id. */
    public static final String PRE_ID_TINDICARCONTRATANTE2_1 = "Clas_1431957012480960Pre_69_MsgError";
    /** <code>TINDICARCONTRATANTE2</code> precondition 2 id. */
    public static final String PRE_ID_TINDICARCONTRATANTE2_2 = "Clas_1431957012480960Pre_72_MsgError";
    /** <code>TINDICARCONTRATANTE2</code> precondition 3 id. */
    public static final String PRE_ID_TINDICARCONTRATANTE2_3 = "Clas_1431957012480960Pre_74_MsgError";
    /** <code>TINDICARCONTRATANTE2</code> precondition 4 id. */
    public static final String PRE_ID_TINDICARCONTRATANTE2_4 = "Clas_1431957012480960Pre_76_MsgError";
    /** <code>TINDICARCONTRATANTE2</code> precondition 5 id. */
    public static final String PRE_ID_TINDICARCONTRATANTE2_5 = "Clas_1431957012480960Pre_156_MsgError";
    /** <code>TINDICARCONTRATANTE2</code> precondition 6 id. */
    public static final String PRE_ID_TINDICARCONTRATANTE2_6 = "Clas_1431957012480960Pre_157_MsgError";
    /** <code>TINDICARCONTRATANTE2</code> precondition 7 id. */
    public static final String PRE_ID_TINDICARCONTRATANTE2_7 = "Clas_1431957012480960Pre_158_MsgError";
    /** <code>TINDICARCONTRATANTE2</code> precondition 8 id. */
    public static final String PRE_ID_TINDICARCONTRATANTE2_8 = "Clas_1431957012480960Pre_159_MsgError";
    /** <code>TINDICARCONTRATANTE2</code> precondition 9 id. */
    public static final String PRE_ID_TINDICARCONTRATANTE2_9 = "Clas_1431957012480960Pre_160_MsgError";
    /** <code>TINDICARCONTRATANTE2</code> precondition 10 id. */
    public static final String PRE_ID_TINDICARCONTRATANTE2_10 = "Clas_1431957012480960Pre_163_MsgError";
    // Inbound arguments
    /** <code>solicitudTINDICARCONTRATANTE2pthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTINDICARCONTRATANTE2pthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTHISSOLICITUD = "Clas_1431957012480960Ser_86Arg_1_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2pthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTINDICARCONTRATANTE2ptpPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPPRIMERNOMBRE = "pt_p_PrimerNombre";
    /** <code>solicitudTINDICARCONTRATANTE2ptpPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPPRIMERNOMBRE = "Clas_1431957012480960Ser_86Arg_2_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptpPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPPRIMERNOMBRE = "Primer nombre";
    /** <code>solicitudTINDICARCONTRATANTE2ptpSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPSEGUNDONOMBRE = "pt_p_SegundoNombre";
    /** <code>solicitudTINDICARCONTRATANTE2ptpSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPSEGUNDONOMBRE = "Clas_1431957012480960Ser_86Arg_3_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptpSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPSEGUNDONOMBRE = "Segundo nombre";
    /** <code>solicitudTINDICARCONTRATANTE2ptpPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPPRIMERAPELLIDO = "pt_p_PrimerApellido";
    /** <code>solicitudTINDICARCONTRATANTE2ptpPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPPRIMERAPELLIDO = "Clas_1431957012480960Ser_86Arg_4_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptpPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPPRIMERAPELLIDO = "Primer Apellido";
    /** <code>solicitudTINDICARCONTRATANTE2ptpSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPSEGUNDOAPELLIDO = "pt_p_SegundoApellido";
    /** <code>solicitudTINDICARCONTRATANTE2ptpSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPSEGUNDOAPELLIDO = "Clas_1431957012480960Ser_86Arg_5_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptpSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPSEGUNDOAPELLIDO = "Segundo Apellido";
    /** <code>solicitudTINDICARCONTRATANTE2ptpFechaNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPFECHANACIMIENTO = "pt_p_FechaNacimiento";
    /** <code>solicitudTINDICARCONTRATANTE2ptpFechaNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPFECHANACIMIENTO = "Clas_1431957012480960Ser_86Arg_6_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptpFechaNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPFECHANACIMIENTO = "Fecha nacimiento";
    /** <code>solicitudTINDICARCONTRATANTE2ptpGenero</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPGENERO = "pt_p_Genero";
    /** <code>solicitudTINDICARCONTRATANTE2ptpGenero</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPGENERO = "Clas_1431957012480960Ser_86Arg_7_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptpGenero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPGENERO = "Género";
    /** <code>solicitudTINDICARCONTRATANTE2ptpIndicadorExtranjero</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPINDICADOREXTRANJERO = "pt_p_IndicadorExtranjero";
    /** <code>solicitudTINDICARCONTRATANTE2ptpIndicadorExtranjero</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPINDICADOREXTRANJERO = "Clas_1431957012480960Ser_86Arg_8_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptpIndicadorExtranjero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPINDICADOREXTRANJERO = "Indicador extranjero";
    /** <code>solicitudTINDICARCONTRATANTE2ptpTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPTELEFONOFIJO = "pt_p_TelefonoFijo";
    /** <code>solicitudTINDICARCONTRATANTE2ptpTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPTELEFONOFIJO = "Clas_1431957012480960Ser_86Arg_9_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptpTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPTELEFONOFIJO = "Teléfono fijo";
    /** <code>solicitudTINDICARCONTRATANTE2ptpTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPTELEFONOCELULAR = "pt_p_TelefonoCelular";
    /** <code>solicitudTINDICARCONTRATANTE2ptpTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPTELEFONOCELULAR = "Clas_1431957012480960Ser_86Arg_10_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptpTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPTELEFONOCELULAR = "Teléfono celular";
    /** <code>solicitudTINDICARCONTRATANTE2ptpCorreoElectronico</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPCORREOELECTRONICO = "pt_p_CorreoElectronico";
    /** <code>solicitudTINDICARCONTRATANTE2ptpCorreoElectronico</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPCORREOELECTRONICO = "Clas_1431957012480960Ser_86Arg_11_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptpCorreoElectronico</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPCORREOELECTRONICO = "Correo electrónico";
    /** <code>solicitudTINDICARCONTRATANTE2ptpevcDepartamentoNac</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPEVCDEPARTAMENTONAC = "pt_p_evcDepartamentoNac";
    /** <code>solicitudTINDICARCONTRATANTE2ptpevcDepartamentoNac</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPEVCDEPARTAMENTONAC = "Clas_1431957012480960Ser_86Arg_12_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptpevcDepartamentoNac</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPEVCDEPARTAMENTONAC = "Departamento nacimiento";
    /** <code>solicitudTINDICARCONTRATANTE2ptpevcMunicipioNac</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPEVCMUNICIPIONAC = "pt_p_evcMunicipioNac";
    /** <code>solicitudTINDICARCONTRATANTE2ptpevcMunicipioNac</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPEVCMUNICIPIONAC = "Clas_1431957012480960Ser_86Arg_13_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptpevcMunicipioNac</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPEVCMUNICIPIONAC = "Municipio nacimiento";
    /** <code>solicitudTINDICARCONTRATANTE2ptpevcEstadoCivil</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPEVCESTADOCIVIL = "pt_p_evcEstadoCivil";
    /** <code>solicitudTINDICARCONTRATANTE2ptpevcEstadoCivil</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPEVCESTADOCIVIL = "Clas_1431957012480960Ser_86Arg_14_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptpevcEstadoCivil</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPEVCESTADOCIVIL = "Estado civil";
    /** <code>solicitudTINDICARCONTRATANTE2ptpDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPDIRECCIONCOMPLETA = "pt_p_DireccionCompleta";
    /** <code>solicitudTINDICARCONTRATANTE2ptpDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPDIRECCIONCOMPLETA = "Clas_1431957012480960Ser_86Arg_15_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptpDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>solicitudTINDICARCONTRATANTE2ptpRural</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPRURAL = "pt_p_Rural";
    /** <code>solicitudTINDICARCONTRATANTE2ptpRural</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPRURAL = "Clas_1431957012480960Ser_86Arg_16_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptpRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPRURAL = "Rural";
    /** <code>solicitudTINDICARCONTRATANTE2ptpevcDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPEVCDEPARTAMENTO = "pt_p_evcDepartamento";
    /** <code>solicitudTINDICARCONTRATANTE2ptpevcDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPEVCDEPARTAMENTO = "Clas_1431957012480960Ser_86Arg_18_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptpevcDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPEVCDEPARTAMENTO = "Departamento";
    /** <code>solicitudTINDICARCONTRATANTE2ptpevcMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPEVCMUNICIPIO = "pt_p_evcMunicipio";
    /** <code>solicitudTINDICARCONTRATANTE2ptpevcMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPEVCMUNICIPIO = "Clas_1431957012480960Ser_86Arg_19_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptpevcMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPEVCMUNICIPIO = "Municipio";
    /** <code>solicitudTINDICARCONTRATANTE2ptpNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPNUMIDENTIFICACION = "pt_p_NumIdentificacion";
    /** <code>solicitudTINDICARCONTRATANTE2ptpNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPNUMIDENTIFICACION = "Clas_1431957012480960Ser_86Arg_20_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptpNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPNUMIDENTIFICACION = "Nº Identificación";
    /** <code>solicitudTINDICARCONTRATANTE2ptpevcTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPEVCTIPOIDENTIFICACION = "pt_p_evcTipoIdentificacion";
    /** <code>solicitudTINDICARCONTRATANTE2ptpevcTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPEVCTIPOIDENTIFICACION = "Clas_1431957012480960Ser_86Arg_21_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptpevcTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPEVCTIPOIDENTIFICACION = "Tipo identificación";
    /** <code>solicitudTINDICARCONTRATANTE2ptpatrRazonSocial</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPATRRAZONSOCIAL = "pt_p_atrRazonSocial";
    /** <code>solicitudTINDICARCONTRATANTE2ptpatrRazonSocial</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPATRRAZONSOCIAL = "Clas_1431957012480960Ser_86Arg_22_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptpatrRazonSocial</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPATRRAZONSOCIAL = "Razón Social";
    /** <code>solicitudTINDICARCONTRATANTE2ptpDCDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPDCDIRECCIONCOMPLETA = "pt_pDCDireccionCompleta";
    /** <code>solicitudTINDICARCONTRATANTE2ptpDCDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPDCDIRECCIONCOMPLETA = "Clas_1431957012480960Ser_86Arg_23_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptpDCDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPDCDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>solicitudTINDICARCONTRATANTE2ptpDCDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPDCDEPARTAMENTO = "pt_pDCDepartamento";
    /** <code>solicitudTINDICARCONTRATANTE2ptpDCDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPDCDEPARTAMENTO = "Clas_1431957012480960Ser_86Arg_24_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptpDCDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPDCDEPARTAMENTO = "Departamento";
    /** <code>solicitudTINDICARCONTRATANTE2ptpDCMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPDCMUNICIPIO = "pt_pDCMunicipio";
    /** <code>solicitudTINDICARCONTRATANTE2ptpDCMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPDCMUNICIPIO = "Clas_1431957012480960Ser_86Arg_25_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptpDCMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPDCMUNICIPIO = "Municipio";
    /** <code>solicitudTINDICARCONTRATANTE2ptpDCRural</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPDCRURAL = "pt_pDCRural";
    /** <code>solicitudTINDICARCONTRATANTE2ptpDCRural</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPDCRURAL = "Clas_1431957012480960Ser_86Arg_26_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptpDCRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPDCRURAL = "Rural";
    /** <code>solicitudTINDICARCONTRATANTE2ptpDCTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPDCTELEFONOFIJO = "pt_pDCTelefonoFijo";
    /** <code>solicitudTINDICARCONTRATANTE2ptpDCTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPDCTELEFONOFIJO = "Clas_1431957012480960Ser_86Arg_27_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptpDCTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPDCTELEFONOFIJO = "Teléfono fijo";
    /** <code>solicitudTINDICARCONTRATANTE2ptpDCTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPDCTELEFONOCELULAR = "pt_pDCTelefonoCelular";
    /** <code>solicitudTINDICARCONTRATANTE2ptpDCTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPDCTELEFONOCELULAR = "Clas_1431957012480960Ser_86Arg_28_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptpDCTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPDCTELEFONOCELULAR = "Teléfono celular";
    /** <code>solicitudTINDICARCONTRATANTE2ptpPais</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPPAIS = "pt_p_Pais";
    /** <code>solicitudTINDICARCONTRATANTE2ptpPais</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPPAIS = "Clas_1431957012480960Ser_86Arg_30_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptpPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPPAIS = "País";
    /** <code>solicitudTINDICARCONTRATANTE2ptpCodigoCORE</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPCODIGOCORE = "pt_p_CodigoCORE";
    /** <code>solicitudTINDICARCONTRATANTE2ptpCodigoCORE</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPCODIGOCORE = "Clas_1431957012480960Ser_86Arg_31_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptpCodigoCORE</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTPCODIGOCORE = "pt_p_CodigoCORE";
    /** <code>solicitudTINDICARCONTRATANTE2ptTieneEPSSanitas</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTTIENEEPSSANITAS = "pt_TieneEPSSanitas";
    /** <code>solicitudTINDICARCONTRATANTE2ptTieneEPSSanitas</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTTIENEEPSSANITAS = "Clas_1431957012480960Ser_86Arg_32_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptTieneEPSSanitas</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTTIENEEPSSANITAS = "FALSE";
    /** <code>solicitudTINDICARCONTRATANTE2ptRechazadoAfiliacion</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTRECHAZADOAFILIACION = "pt_RechazadoAfiliacion";
    /** <code>solicitudTINDICARCONTRATANTE2ptRechazadoAfiliacion</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTRECHAZADOAFILIACION = "Clas_1431957012480960Ser_86Arg_33_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptRechazadoAfiliacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTRECHAZADOAFILIACION = "pt_RechazadoAfiliacion";
    /** <code>solicitudTINDICARCONTRATANTE2pDCPais</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PDCPAIS = "pDCPais";
    /** <code>solicitudTINDICARCONTRATANTE2pDCPais</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PDCPAIS = "Clas_1431957012480960Ser_86Arg_34_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2pDCPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PDCPAIS = "País";
    /** <code>solicitudTINDICARCONTRATANTE2pTitularBeneficios</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTITULARBENEFICIOS = "p_TitularBeneficios";
    /** <code>solicitudTINDICARCONTRATANTE2pTitularBeneficios</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTITULARBENEFICIOS = "Clas_1431957012480960Ser_86Arg_35_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2pTitularBeneficios</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTITULARBENEFICIOS = "Titular con beneficios";
    /** <code>solicitudTINDICARCONTRATANTE2ptDiplomatico</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTDIPLOMATICO = "pt_Diplomatico";
    /** <code>solicitudTINDICARCONTRATANTE2ptDiplomatico</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTDIPLOMATICO = "Clas_1431957012480960Ser_86Arg_36_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptDiplomatico</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTDIPLOMATICO = "Diplomático";
    /** <code>solicitudTINDICARCONTRATANTE2ptDireccionesXClass</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTDIRECCIONESXCLASS = "pt_DireccionesXClass";
    /** <code>solicitudTINDICARCONTRATANTE2ptDireccionesXClass</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTDIRECCIONESXCLASS = "Clas_1431957012480960Ser_86Arg_37_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptDireccionesXClass</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTDIRECCIONESXCLASS = "Direcciones";
    /** <code>solicitudTINDICARCONTRATANTE2ptReplicarDireccion</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTREPLICARDIRECCION = "ptReplicarDireccion";
    /** <code>solicitudTINDICARCONTRATANTE2ptReplicarDireccion</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTREPLICARDIRECCION = "Clas_1431957012480960Ser_86Arg_38_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptReplicarDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTREPLICARDIRECCION = "Replicar";
    /** <code>solicitudTINDICARCONTRATANTE2ptEstadoPersona</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTESTADOPERSONA = "ptEstadoPersona";
    /** <code>solicitudTINDICARCONTRATANTE2ptEstadoPersona</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTESTADOPERSONA = "Clas_1431957012480960Ser_86Arg_40_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2ptEstadoPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2_SOLICITUDTINDICARCONTRATANTE2PTESTADOPERSONA = "Estado Persona";
    // Service (TINCLUSIONSC)
    /** <code>TINCLUSIONSC</code> service id. */
    public static final String SERV_ID_TINCLUSIONSC = "Clas_1431957012480960Ser_88_Alias";
    /** <code>TINCLUSIONSC</code> service name. */
    public static final String SERV_NAME_TINCLUSIONSC = "TINCLUSIONSC";
    /** <code>TINCLUSIONSC</code> service alias. */
    public static final String SERV_ALIAS_TINCLUSIONSC = "Información de Solicitud";
    /** Agents allowed to execute the service TINCLUSIONSC **/
    public static final String TINCLUSIONSC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudTINCLUSIONSCptpagrAESOLICITUDES</code> inbound argument name. */
    public static final String ARG_NAME_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPTPAGRAESOLICITUDES = "pt_p_agrAE_SOLICITUDES";
    /** <code>solicitudTINCLUSIONSCptpagrAESOLICITUDES</code> inbound argument id. */
    public static final String ARG_ID_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPTPAGRAESOLICITUDES = "Clas_1431957012480960Ser_88Arg_2_Alias";
    /** <code>solicitudTINCLUSIONSCptpagrAESOLICITUDES</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPTPAGRAESOLICITUDES = "Solicitud base";
    /** <code>solicitudTINCLUSIONSCptpagrProteccionDatos</code> inbound argument name. */
    public static final String ARG_NAME_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPTPAGRPROTECCIONDATOS = "pt_p_agrProteccionDatos";
    /** <code>solicitudTINCLUSIONSCptpagrProteccionDatos</code> inbound argument id. */
    public static final String ARG_ID_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPTPAGRPROTECCIONDATOS = "Clas_1431957012480960Ser_88Arg_3_Alias";
    /** <code>solicitudTINCLUSIONSCptpagrProteccionDatos</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPTPAGRPROTECCIONDATOS = "Protección Datos";
    /** <code>solicitudTINCLUSIONSCptpatrFInicioContrato</code> inbound argument name. */
    public static final String ARG_NAME_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPTPATRFINICIOCONTRATO = "pt_p_atrFInicioContrato";
    /** <code>solicitudTINCLUSIONSCptpatrFInicioContrato</code> inbound argument id. */
    public static final String ARG_ID_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPTPATRFINICIOCONTRATO = "Clas_1431957012480960Ser_88Arg_4_Alias";
    /** <code>solicitudTINCLUSIONSCptpatrFInicioContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPTPATRFINICIOCONTRATO = "Fecha inicio contratación";
    /** <code>solicitudTINCLUSIONSCptpatrNumContratoInclusion</code> inbound argument name. */
    public static final String ARG_NAME_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPTPATRNUMCONTRATOINCLUSION = "pt_p_atrNumContratoInclusion";
    /** <code>solicitudTINCLUSIONSCptpatrNumContratoInclusion</code> inbound argument id. */
    public static final String ARG_ID_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPTPATRNUMCONTRATOINCLUSION = "Clas_1431957012480960Ser_88Arg_5_Alias";
    /** <code>solicitudTINCLUSIONSCptpatrNumContratoInclusion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPTPATRNUMCONTRATOINCLUSION = "Nº Contrato Inclusión";
    /** <code>solicitudTINCLUSIONSCptpatrNumFamilia</code> inbound argument name. */
    public static final String ARG_NAME_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPTPATRNUMFAMILIA = "pt_p_atrNumFamilia";
    /** <code>solicitudTINCLUSIONSCptpatrNumFamilia</code> inbound argument id. */
    public static final String ARG_ID_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPTPATRNUMFAMILIA = "Clas_1431957012480960Ser_88Arg_6_Alias";
    /** <code>solicitudTINCLUSIONSCptpatrNumFamilia</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPTPATRNUMFAMILIA = "Nº Familia";
    /** <code>solicitudTINCLUSIONSCpCodDirector</code> inbound argument name. */
    public static final String ARG_NAME_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPCODDIRECTOR = "pCodDirector";
    /** <code>solicitudTINCLUSIONSCpCodDirector</code> inbound argument id. */
    public static final String ARG_ID_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPCODDIRECTOR = "Clas_1431957012480960Ser_88Arg_7_Alias";
    /** <code>solicitudTINCLUSIONSCpCodDirector</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPCODDIRECTOR = "Código Director";
    /** <code>solicitudTINCLUSIONSCptPorcenProrrateo</code> inbound argument name. */
    public static final String ARG_NAME_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPTPORCENPRORRATEO = "ptPorcenProrrateo";
    /** <code>solicitudTINCLUSIONSCptPorcenProrrateo</code> inbound argument id. */
    public static final String ARG_ID_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPTPORCENPRORRATEO = "Clas_1431957012480960Ser_88Arg_1702_Alias";
    /** <code>solicitudTINCLUSIONSCptPorcenProrrateo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPTPORCENPRORRATEO = "ptPorcenProrrateo";
    /** <code>solicitudTINCLUSIONSCptMarcaCarnet</code> inbound argument name. */
    public static final String ARG_NAME_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPTMARCACARNET = "ptMarcaCarnet";
    /** <code>solicitudTINCLUSIONSCptMarcaCarnet</code> inbound argument id. */
    public static final String ARG_ID_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPTMARCACARNET = "Clas_1431957012480960Ser_88Arg_3937_Alias";
    /** <code>solicitudTINCLUSIONSCptMarcaCarnet</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPTMARCACARNET = "ptMarcaCarnet";
    /** <code>solicitudTINCLUSIONSCptNumRadicado</code> inbound argument name. */
    public static final String ARG_NAME_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPTNUMRADICADO = "ptNumRadicado";
    /** <code>solicitudTINCLUSIONSCptNumRadicado</code> inbound argument id. */
    public static final String ARG_ID_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPTNUMRADICADO = "Clas_1431957012480960Ser_88Arg_3987_Alias";
    /** <code>solicitudTINCLUSIONSCptNumRadicado</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPTNUMRADICADO = "ptNumRadicado";
    // Outbound arguments
    /** <code>solicitudTINCLUSIONSCpsSolicitud</code> outbound argument name. */
    public static final String ARG_NAME_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPSSOLICITUD = "solicitudTINCLUSIONSCpsSolicitud";
    /** <code>solicitudTINCLUSIONSCpsSolicitud</code> outbound argument id. */
    public static final String ARG_ID_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPSSOLICITUD = "Clas_1431957012480960Ser_88Arg_8_Alias";
    /** <code>solicitudTINCLUSIONSCpsSolicitud</code> outbound argument alias. */
    public static final String ARG_ALIAS_TINCLUSIONSC_SOLICITUDTINCLUSIONSCPSSOLICITUD = "Solicitud";
    // Service (TINDICARCONTRATANTE2AUX)
    /** <code>TINDICARCONTRATANTE2AUX</code> service id. */
    public static final String SERV_ID_TINDICARCONTRATANTE2AUX = "Clas_1431957012480960Ser_89_Alias";
    /** <code>TINDICARCONTRATANTE2AUX</code> service name. */
    public static final String SERV_NAME_TINDICARCONTRATANTE2AUX = "TINDICARCONTRATANTE2AUX";
    /** <code>TINDICARCONTRATANTE2AUX</code> service alias. */
    public static final String SERV_ALIAS_TINDICARCONTRATANTE2AUX = "TINDICARCONTRATANTE2AUX";
    /** Agents allowed to execute the service TINDICARCONTRATANTE2AUX **/
    public static final String TINDICARCONTRATANTE2AUX_SRVAGENTS = "";
    // Preconditions
    /** <code>TINDICARCONTRATANTE2AUX</code> precondition 0 id. */
    public static final String PRE_ID_TINDICARCONTRATANTE2AUX_0 = "Clas_1431957012480960Pre_66_MsgError";
    /** <code>TINDICARCONTRATANTE2AUX</code> precondition 1 id. */
    public static final String PRE_ID_TINDICARCONTRATANTE2AUX_1 = "Clas_1431957012480960Pre_161_MsgError";
    // Inbound arguments
    /** <code>solicitudTINDICARCONTRATANTE2AUXpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTINDICARCONTRATANTE2AUXpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTHISSOLICITUD = "Clas_1431957012480960Ser_89Arg_1_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPPRIMERNOMBRE = "pt_p_PrimerNombre";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPPRIMERNOMBRE = "Clas_1431957012480960Ser_89Arg_2_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPPRIMERNOMBRE = "Primer nombre";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPSEGUNDONOMBRE = "pt_p_SegundoNombre";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPSEGUNDONOMBRE = "Clas_1431957012480960Ser_89Arg_3_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPSEGUNDONOMBRE = "Segundo nombre";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPPRIMERAPELLIDO = "pt_p_PrimerApellido";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPPRIMERAPELLIDO = "Clas_1431957012480960Ser_89Arg_4_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPPRIMERAPELLIDO = "Primer Apellido";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPSEGUNDOAPELLIDO = "pt_p_SegundoApellido";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPSEGUNDOAPELLIDO = "Clas_1431957012480960Ser_89Arg_5_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPSEGUNDOAPELLIDO = "Segundo Apellido";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpFechaNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPFECHANACIMIENTO = "pt_p_FechaNacimiento";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpFechaNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPFECHANACIMIENTO = "Clas_1431957012480960Ser_89Arg_6_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpFechaNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPFECHANACIMIENTO = "Fecha nacimiento";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpGenero</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPGENERO = "pt_p_Genero";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpGenero</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPGENERO = "Clas_1431957012480960Ser_89Arg_7_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpGenero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPGENERO = "Género";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpIndicadorExtranjero</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPINDICADOREXTRANJERO = "pt_p_IndicadorExtranjero";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpIndicadorExtranjero</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPINDICADOREXTRANJERO = "Clas_1431957012480960Ser_89Arg_8_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpIndicadorExtranjero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPINDICADOREXTRANJERO = "Indicador extranjero";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPTELEFONOFIJO = "pt_p_TelefonoFijo";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPTELEFONOFIJO = "Clas_1431957012480960Ser_89Arg_9_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPTELEFONOFIJO = "Teléfono fijo";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPTELEFONOCELULAR = "pt_p_TelefonoCelular";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPTELEFONOCELULAR = "Clas_1431957012480960Ser_89Arg_10_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPTELEFONOCELULAR = "Teléfono celular";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpCorreoElectronico</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPCORREOELECTRONICO = "pt_p_CorreoElectronico";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpCorreoElectronico</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPCORREOELECTRONICO = "Clas_1431957012480960Ser_89Arg_11_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpCorreoElectronico</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPCORREOELECTRONICO = "Correo electrónico";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpevcDepartamentoNac</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPEVCDEPARTAMENTONAC = "pt_p_evcDepartamentoNac";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpevcDepartamentoNac</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPEVCDEPARTAMENTONAC = "Clas_1431957012480960Ser_89Arg_12_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpevcDepartamentoNac</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPEVCDEPARTAMENTONAC = "Departamento nacimiento";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpevcMunicipioNac</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPEVCMUNICIPIONAC = "pt_p_evcMunicipioNac";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpevcMunicipioNac</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPEVCMUNICIPIONAC = "Clas_1431957012480960Ser_89Arg_13_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpevcMunicipioNac</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPEVCMUNICIPIONAC = "Municipio nacimiento";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpevcEstadoCivil</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPEVCESTADOCIVIL = "pt_p_evcEstadoCivil";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpevcEstadoCivil</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPEVCESTADOCIVIL = "Clas_1431957012480960Ser_89Arg_14_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpevcEstadoCivil</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPEVCESTADOCIVIL = "Estado civil";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPDIRECCIONCOMPLETA = "pt_p_DireccionCompleta";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPDIRECCIONCOMPLETA = "Clas_1431957012480960Ser_89Arg_15_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpRural</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPRURAL = "pt_p_Rural";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpRural</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPRURAL = "Clas_1431957012480960Ser_89Arg_16_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPRURAL = "Rural";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpevcDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPEVCDEPARTAMENTO = "pt_p_evcDepartamento";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpevcDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPEVCDEPARTAMENTO = "Clas_1431957012480960Ser_89Arg_17_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpevcDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPEVCDEPARTAMENTO = "Departamento";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpevcMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPEVCMUNICIPIO = "pt_p_evcMunicipio";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpevcMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPEVCMUNICIPIO = "Clas_1431957012480960Ser_89Arg_18_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpevcMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPEVCMUNICIPIO = "Municipio";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPNUMIDENTIFICACION = "pt_p_NumIdentificacion";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPNUMIDENTIFICACION = "Clas_1431957012480960Ser_89Arg_19_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPNUMIDENTIFICACION = "Nº Identificación";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpevcTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPEVCTIPOIDENTIFICACION = "pt_p_evcTipoIdentificacion";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpevcTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPEVCTIPOIDENTIFICACION = "Clas_1431957012480960Ser_89Arg_20_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpevcTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPEVCTIPOIDENTIFICACION = "Tipo identificación";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpatrRazonSocial</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPATRRAZONSOCIAL = "pt_p_atrRazonSocial";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpatrRazonSocial</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPATRRAZONSOCIAL = "Clas_1431957012480960Ser_89Arg_21_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpatrRazonSocial</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPATRRAZONSOCIAL = "Razón Social";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpDCDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPDCDIRECCIONCOMPLETA = "pt_pDCDireccionCompleta";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpDCDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPDCDIRECCIONCOMPLETA = "Clas_1431957012480960Ser_89Arg_22_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpDCDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPDCDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpDCDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPDCDEPARTAMENTO = "pt_pDCDepartamento";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpDCDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPDCDEPARTAMENTO = "Clas_1431957012480960Ser_89Arg_23_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpDCDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPDCDEPARTAMENTO = "Departamento";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpDCMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPDCMUNICIPIO = "pt_pDCMunicipio";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpDCMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPDCMUNICIPIO = "Clas_1431957012480960Ser_89Arg_24_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpDCMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPDCMUNICIPIO = "Municipio";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpDCRural</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPDCRURAL = "pt_pDCRural";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpDCRural</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPDCRURAL = "Clas_1431957012480960Ser_89Arg_25_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpDCRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPDCRURAL = "Rural";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpDCTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPDCTELEFONOFIJO = "pt_pDCTelefonoFijo";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpDCTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPDCTELEFONOFIJO = "Clas_1431957012480960Ser_89Arg_26_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpDCTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPDCTELEFONOFIJO = "Teléfono fijo";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpDCTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPDCTELEFONOCELULAR = "pt_pDCTelefonoCelular";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpDCTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPDCTELEFONOCELULAR = "Clas_1431957012480960Ser_89Arg_27_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpDCTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPDCTELEFONOCELULAR = "Teléfono celular";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpPais</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPPAIS = "pt_p_Pais";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpPais</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPPAIS = "Clas_1431957012480960Ser_89Arg_28_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPPAIS = "País";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpCodigoCORE</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPCODIGOCORE = "pt_p_CodigoCORE";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpCodigoCORE</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPCODIGOCORE = "Clas_1431957012480960Ser_89Arg_29_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptpCodigoCORE</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTPCODIGOCORE = "pt_p_CodigoCORE";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptTieneEPSSanitas</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTTIENEEPSSANITAS = "pt_TieneEPSSanitas";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptTieneEPSSanitas</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTTIENEEPSSANITAS = "Clas_1431957012480960Ser_89Arg_30_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptTieneEPSSanitas</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTTIENEEPSSANITAS = "pt_TieneEPSSanitas";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptRechazadoAfiliacion</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTRECHAZADOAFILIACION = "pt_RechazadoAfiliacion";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptRechazadoAfiliacion</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTRECHAZADOAFILIACION = "Clas_1431957012480960Ser_89Arg_31_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptRechazadoAfiliacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTRECHAZADOAFILIACION = "pt_RechazadoAfiliacion";
    /** <code>solicitudTINDICARCONTRATANTE2AUXpDCPais</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPDCPAIS = "pDCPais";
    /** <code>solicitudTINDICARCONTRATANTE2AUXpDCPais</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPDCPAIS = "Clas_1431957012480960Ser_89Arg_32_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXpDCPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPDCPAIS = "País";
    /** <code>solicitudTINDICARCONTRATANTE2AUXpTitularBeneficios</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTITULARBENEFICIOS = "p_TitularBeneficios";
    /** <code>solicitudTINDICARCONTRATANTE2AUXpTitularBeneficios</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTITULARBENEFICIOS = "Clas_1431957012480960Ser_89Arg_33_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXpTitularBeneficios</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTITULARBENEFICIOS = "Titular con beneficios";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptDiplomatico</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTDIPLOMATICO = "pt_Diplomatico";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptDiplomatico</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTDIPLOMATICO = "Clas_1431957012480960Ser_89Arg_34_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptDiplomatico</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTDIPLOMATICO = "Diplomático";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptDireccionesXClass</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTDIRECCIONESXCLASS = "pt_DireccionesXClass";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptDireccionesXClass</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTDIRECCIONESXCLASS = "Clas_1431957012480960Ser_89Arg_35_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptDireccionesXClass</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTDIRECCIONESXCLASS = "Direcciones";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptReplicarDireccion</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTREPLICARDIRECCION = "ptReplicarDireccion";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptReplicarDireccion</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTREPLICARDIRECCION = "Clas_1431957012480960Ser_89Arg_36_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptReplicarDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTREPLICARDIRECCION = "Replicar";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptCheckTipoRegimen</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTCHECKTIPOREGIMEN = "ptCheckTipoRegimen";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptCheckTipoRegimen</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTCHECKTIPOREGIMEN = "Clas_1431957012480960Ser_89Arg_38_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptCheckTipoRegimen</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTCHECKTIPOREGIMEN = "ptCheckTipoRegimen";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptEstadoPersona</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTESTADOPERSONA = "ptEstadoPersona";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptEstadoPersona</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTESTADOPERSONA = "Clas_1431957012480960Ser_89Arg_39_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptEstadoPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTESTADOPERSONA = "Estado Persona";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptValidarDatos</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTVALIDARDATOS = "ptValidarDatos";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptValidarDatos</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTVALIDARDATOS = "Clas_1431957012480960Ser_89Arg_40_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXptValidarDatos</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPTVALIDARDATOS = "ptValidarDatos";
    // Outbound arguments
    /** <code>solicitudTINDICARCONTRATANTE2AUXpsPersona</code> outbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPSPERSONA = "solicitudTINDICARCONTRATANTE2AUXpsPersona";
    /** <code>solicitudTINDICARCONTRATANTE2AUXpsPersona</code> outbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPSPERSONA = "Clas_1431957012480960Ser_89Arg_37_Alias";
    /** <code>solicitudTINDICARCONTRATANTE2AUXpsPersona</code> outbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTE2AUX_SOLICITUDTINDICARCONTRATANTE2AUXPSPERSONA = "Persona";
    // Service (TINDICARTITULAR2AUX)
    /** <code>TINDICARTITULAR2AUX</code> service id. */
    public static final String SERV_ID_TINDICARTITULAR2AUX = "Clas_1431957012480960Ser_92_Alias";
    /** <code>TINDICARTITULAR2AUX</code> service name. */
    public static final String SERV_NAME_TINDICARTITULAR2AUX = "TINDICARTITULAR2AUX";
    /** <code>TINDICARTITULAR2AUX</code> service alias. */
    public static final String SERV_ALIAS_TINDICARTITULAR2AUX = "Indicar titular";
    /** Agents allowed to execute the service TINDICARTITULAR2AUX **/
    public static final String TINDICARTITULAR2AUX_SRVAGENTS = "";
    // Preconditions
    /** <code>TINDICARTITULAR2AUX</code> precondition 0 id. */
    public static final String PRE_ID_TINDICARTITULAR2AUX_0 = "Clas_1431957012480960Pre_67_MsgError";
    /** <code>TINDICARTITULAR2AUX</code> precondition 1 id. */
    public static final String PRE_ID_TINDICARTITULAR2AUX_1 = "Clas_1431957012480960Pre_162_MsgError";
    // Inbound arguments
    /** <code>solicitudTINDICARTITULAR2AUXpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTINDICARTITULAR2AUXpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTHISSOLICITUD = "Clas_1431957012480960Ser_92Arg_1_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTINDICARTITULAR2AUXptpagrTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPAGRTIPOIDENTIFICACION = "pt_p_agrTipoIdentificacion";
    /** <code>solicitudTINDICARTITULAR2AUXptpagrTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPAGRTIPOIDENTIFICACION = "Clas_1431957012480960Ser_92Arg_2_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptpagrTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPAGRTIPOIDENTIFICACION = "Tipo identificación";
    /** <code>solicitudTINDICARTITULAR2AUXptpagrDepartamentoNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPAGRDEPARTAMENTONACIMIENTO = "pt_p_agrDepartamentoNacimiento";
    /** <code>solicitudTINDICARTITULAR2AUXptpagrDepartamentoNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPAGRDEPARTAMENTONACIMIENTO = "Clas_1431957012480960Ser_92Arg_3_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptpagrDepartamentoNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPAGRDEPARTAMENTONACIMIENTO = "Departamento nacimiento";
    /** <code>solicitudTINDICARTITULAR2AUXptpagrMunicipioNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPAGRMUNICIPIONACIMIENTO = "pt_p_agrMunicipioNacimiento";
    /** <code>solicitudTINDICARTITULAR2AUXptpagrMunicipioNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPAGRMUNICIPIONACIMIENTO = "Clas_1431957012480960Ser_92Arg_4_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptpagrMunicipioNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPAGRMUNICIPIONACIMIENTO = "Municipio nacimiento";
    /** <code>solicitudTINDICARTITULAR2AUXptpagrEstadoCivil</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPAGRESTADOCIVIL = "pt_p_agrEstadoCivil";
    /** <code>solicitudTINDICARTITULAR2AUXptpagrEstadoCivil</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPAGRESTADOCIVIL = "Clas_1431957012480960Ser_92Arg_5_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptpagrEstadoCivil</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPAGRESTADOCIVIL = "EstadoCivil";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRNUMIDENTIFICACION = "pt_p_atrNumIdentificacion";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRNUMIDENTIFICACION = "Clas_1431957012480960Ser_92Arg_6_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRNUMIDENTIFICACION = "Nº Identificación";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRPRIMERNOMBRE = "pt_p_atrPrimerNombre";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRPRIMERNOMBRE = "Clas_1431957012480960Ser_92Arg_7_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRPRIMERNOMBRE = "Primer nombre";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRSEGUNDONOMBRE = "pt_p_atrSegundoNombre";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRSEGUNDONOMBRE = "Clas_1431957012480960Ser_92Arg_8_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRSEGUNDONOMBRE = "Segundo nombre";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRPRIMERAPELLIDO = "pt_p_atrPrimerApellido";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRPRIMERAPELLIDO = "Clas_1431957012480960Ser_92Arg_9_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRPRIMERAPELLIDO = "Primer Apellido";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRSEGUNDOAPELLIDO = "pt_p_atrSegundoApellido";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRSEGUNDOAPELLIDO = "Clas_1431957012480960Ser_92Arg_10_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRSEGUNDOAPELLIDO = "Segundo Apellido";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrFechaNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRFECHANACIMIENTO = "pt_p_atrFechaNacimiento";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrFechaNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRFECHANACIMIENTO = "Clas_1431957012480960Ser_92Arg_11_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrFechaNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRFECHANACIMIENTO = "Fecha nacimiento";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrGenero</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRGENERO = "pt_p_atrGenero";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrGenero</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRGENERO = "Clas_1431957012480960Ser_92Arg_12_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrGenero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRGENERO = "Género";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrIndicadorExtranjero</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRINDICADOREXTRANJERO = "pt_p_atrIndicadorExtranjero";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrIndicadorExtranjero</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRINDICADOREXTRANJERO = "Clas_1431957012480960Ser_92Arg_13_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrIndicadorExtranjero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRINDICADOREXTRANJERO = "Indicador extranjero";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRTELEFONOFIJO = "pt_p_atrTelefonoFijo";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRTELEFONOFIJO = "Clas_1431957012480960Ser_92Arg_14_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRTELEFONOFIJO = "Teléfono fijo";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRTELEFONOCELULAR = "pt_p_atrTelefonoCelular";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRTELEFONOCELULAR = "Clas_1431957012480960Ser_92Arg_15_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRTELEFONOCELULAR = "Teléfono celular";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrCorreoElectronico</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRCORREOELECTRONICO = "pt_p_atrCorreoElectronico";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrCorreoElectronico</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRCORREOELECTRONICO = "Clas_1431957012480960Ser_92Arg_16_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrCorreoElectronico</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRCORREOELECTRONICO = "Correo electrónico";
    /** <code>solicitudTINDICARTITULAR2AUXptpagrDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPAGRDEPARTAMENTO = "pt_p_agrDepartamento";
    /** <code>solicitudTINDICARTITULAR2AUXptpagrDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPAGRDEPARTAMENTO = "Clas_1431957012480960Ser_92Arg_17_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptpagrDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPAGRDEPARTAMENTO = "Departamento";
    /** <code>solicitudTINDICARTITULAR2AUXptpagrMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPAGRMUNICIPIO = "pt_p_agrMunicipio";
    /** <code>solicitudTINDICARTITULAR2AUXptpagrMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPAGRMUNICIPIO = "Clas_1431957012480960Ser_92Arg_18_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptpagrMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPAGRMUNICIPIO = "Municipio";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRDIRECCIONCOMPLETA = "pt_p_atrDireccionCompleta";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRDIRECCIONCOMPLETA = "Clas_1431957012480960Ser_92Arg_19_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrRural</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRRURAL = "pt_p_atrRural";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrRural</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRRURAL = "Clas_1431957012480960Ser_92Arg_20_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptpatrRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPATRRURAL = "Rural";
    /** <code>solicitudTINDICARTITULAR2AUXptpagrPais</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPAGRPAIS = "pt_p_agrPais";
    /** <code>solicitudTINDICARTITULAR2AUXptpagrPais</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPAGRPAIS = "Clas_1431957012480960Ser_92Arg_22_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptpagrPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPAGRPAIS = "País";
    /** <code>solicitudTINDICARTITULAR2AUXptpCodigo</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPCODIGO = "pt_p_Codigo";
    /** <code>solicitudTINDICARTITULAR2AUXptpCodigo</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPCODIGO = "Clas_1431957012480960Ser_92Arg_23_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptpCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPCODIGO = "Código";
    /** <code>solicitudTINDICARTITULAR2AUXptpTieneEPSSanitas</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPTIENEEPSSANITAS = "pt_p_TieneEPSSanitas";
    /** <code>solicitudTINDICARTITULAR2AUXptpTieneEPSSanitas</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPTIENEEPSSANITAS = "Clas_1431957012480960Ser_92Arg_24_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptpTieneEPSSanitas</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPTIENEEPSSANITAS = "Tiene EPS Sanitas";
    /** <code>solicitudTINDICARTITULAR2AUXptpRechazadoAfiliacion</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPRECHAZADOAFILIACION = "pt_p_RechazadoAfiliacion";
    /** <code>solicitudTINDICARTITULAR2AUXptpRechazadoAfiliacion</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPRECHAZADOAFILIACION = "Clas_1431957012480960Ser_92Arg_25_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptpRechazadoAfiliacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPRECHAZADOAFILIACION = "Rechazado Afiliación";
    /** <code>solicitudTINDICARTITULAR2AUXpTitularBeneficios</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTITULARBENEFICIOS = "p_TitularBeneficios";
    /** <code>solicitudTINDICARTITULAR2AUXpTitularBeneficios</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTITULARBENEFICIOS = "Clas_1431957012480960Ser_92Arg_27_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXpTitularBeneficios</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTITULARBENEFICIOS = "p_TitularBeneficios";
    /** <code>solicitudTINDICARTITULAR2AUXptpTitularRecuperadoInc</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPTITULARRECUPERADOINC = "pt_p_TitularRecuperadoInc";
    /** <code>solicitudTINDICARTITULAR2AUXptpTitularRecuperadoInc</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPTITULARRECUPERADOINC = "Clas_1431957012480960Ser_92Arg_28_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptpTitularRecuperadoInc</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPTITULARRECUPERADOINC = "pt_p_TitularRecuperadoInc";
    /** <code>solicitudTINDICARTITULAR2AUXptCheckTipoRegimen</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTCHECKTIPOREGIMEN = "ptCheckTipoRegimen";
    /** <code>solicitudTINDICARTITULAR2AUXptCheckTipoRegimen</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTCHECKTIPOREGIMEN = "Clas_1431957012480960Ser_92Arg_29_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptCheckTipoRegimen</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTCHECKTIPOREGIMEN = "ptCheckTipoRegimen";
    /** <code>solicitudTINDICARTITULAR2AUXptDCDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTDCDIRECCIONCOMPLETA = "pt_DCDireccionCompleta";
    /** <code>solicitudTINDICARTITULAR2AUXptDCDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTDCDIRECCIONCOMPLETA = "Clas_1431957012480960Ser_92Arg_30_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptDCDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTDCDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>solicitudTINDICARTITULAR2AUXptDCMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTDCMUNICIPIO = "pt_DCMunicipio";
    /** <code>solicitudTINDICARTITULAR2AUXptDCMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTDCMUNICIPIO = "Clas_1431957012480960Ser_92Arg_31_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptDCMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTDCMUNICIPIO = "Municipio nacimiento";
    /** <code>solicitudTINDICARTITULAR2AUXptDCDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTDCDEPARTAMENTO = "pt_DCDepartamento";
    /** <code>solicitudTINDICARTITULAR2AUXptDCDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTDCDEPARTAMENTO = "Clas_1431957012480960Ser_92Arg_32_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptDCDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTDCDEPARTAMENTO = "Departamento nacimiento";
    /** <code>solicitudTINDICARTITULAR2AUXptDCPais</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTDCPAIS = "pt_DCPais";
    /** <code>solicitudTINDICARTITULAR2AUXptDCPais</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTDCPAIS = "Clas_1431957012480960Ser_92Arg_33_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptDCPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTDCPAIS = "País";
    /** <code>solicitudTINDICARTITULAR2AUXptEstadoPersona</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTESTADOPERSONA = "ptEstadoPersona";
    /** <code>solicitudTINDICARTITULAR2AUXptEstadoPersona</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTESTADOPERSONA = "Clas_1431957012480960Ser_92Arg_34_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptEstadoPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTESTADOPERSONA = "Estado Persona";
    /** <code>solicitudTINDICARTITULAR2AUXptValidarDatos</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTVALIDARDATOS = "ptValidarDatos";
    /** <code>solicitudTINDICARTITULAR2AUXptValidarDatos</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTVALIDARDATOS = "Clas_1431957012480960Ser_92Arg_35_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptValidarDatos</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTVALIDARDATOS = "ptValidarDatos";
    /** <code>solicitudTINDICARTITULAR2AUXptpDCRural</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPDCRURAL = "pt_pDCRural";
    /** <code>solicitudTINDICARTITULAR2AUXptpDCRural</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPDCRURAL = "Clas_1431957012480960Ser_92Arg_37_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptpDCRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPDCRURAL = "Rural";
    /** <code>solicitudTINDICARTITULAR2AUXptDCTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTDCTELEFONOFIJO = "ptDCTelefonoFijo";
    /** <code>solicitudTINDICARTITULAR2AUXptDCTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTDCTELEFONOFIJO = "Clas_1431957012480960Ser_92Arg_38_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptDCTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTDCTELEFONOFIJO = "Teléfono fijo";
    /** <code>solicitudTINDICARTITULAR2AUXptDCTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTDCTELEFONOCELULAR = "ptDCTelefonoCelular";
    /** <code>solicitudTINDICARTITULAR2AUXptDCTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTDCTELEFONOCELULAR = "Clas_1431957012480960Ser_92Arg_39_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptDCTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTDCTELEFONOCELULAR = "Teléfono celular";
    /** <code>solicitudTINDICARTITULAR2AUXptRazonSocial</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTRAZONSOCIAL = "ptRazonSocial";
    /** <code>solicitudTINDICARTITULAR2AUXptRazonSocial</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTRAZONSOCIAL = "Clas_1431957012480960Ser_92Arg_40_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptRazonSocial</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTRAZONSOCIAL = "Razón social";
    // Outbound arguments
    /** <code>solicitudTINDICARTITULAR2AUXptpsPersona</code> outbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPSPERSONA = "solicitudTINDICARTITULAR2AUXptpsPersona";
    /** <code>solicitudTINDICARTITULAR2AUXptpsPersona</code> outbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPSPERSONA = "Clas_1431957012480960Ser_92Arg_26_Alias";
    /** <code>solicitudTINDICARTITULAR2AUXptpsPersona</code> outbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2AUX_SOLICITUDTINDICARTITULAR2AUXPTPSPERSONA = "Persona";
    // Service (TINDICARTITULAR2)
    /** <code>TINDICARTITULAR2</code> service id. */
    public static final String SERV_ID_TINDICARTITULAR2 = "Clas_1431957012480960Ser_93_Alias";
    /** <code>TINDICARTITULAR2</code> service name. */
    public static final String SERV_NAME_TINDICARTITULAR2 = "TINDICARTITULAR2";
    /** <code>TINDICARTITULAR2</code> service alias. */
    public static final String SERV_ALIAS_TINDICARTITULAR2 = "Indicar titular";
    /** Agents allowed to execute the service TINDICARTITULAR2 **/
    public static final String TINDICARTITULAR2_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Preconditions
    /** <code>TINDICARTITULAR2</code> precondition 0 id. */
    public static final String PRE_ID_TINDICARTITULAR2_0 = "Clas_1431957012480960Pre_73_MsgError";
    /** <code>TINDICARTITULAR2</code> precondition 1 id. */
    public static final String PRE_ID_TINDICARTITULAR2_1 = "Clas_1431957012480960Pre_75_MsgError";
    /** <code>TINDICARTITULAR2</code> precondition 2 id. */
    public static final String PRE_ID_TINDICARTITULAR2_2 = "Clas_1431957012480960Pre_77_MsgError";
    /** <code>TINDICARTITULAR2</code> precondition 3 id. */
    public static final String PRE_ID_TINDICARTITULAR2_3 = "Clas_1431957012480960Pre_164_MsgError";
    // Inbound arguments
    /** <code>solicitudTINDICARTITULAR2pthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTINDICARTITULAR2pthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTHISSOLICITUD = "Clas_1431957012480960Ser_93Arg_1_Alias";
    /** <code>solicitudTINDICARTITULAR2pthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTINDICARTITULAR2ptpagrTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPAGRTIPOIDENTIFICACION = "pt_p_agrTipoIdentificacion";
    /** <code>solicitudTINDICARTITULAR2ptpagrTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPAGRTIPOIDENTIFICACION = "Clas_1431957012480960Ser_93Arg_2_Alias";
    /** <code>solicitudTINDICARTITULAR2ptpagrTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPAGRTIPOIDENTIFICACION = "Tipo identificación";
    /** <code>solicitudTINDICARTITULAR2ptpagrDepartamentoNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPAGRDEPARTAMENTONACIMIENTO = "pt_p_agrDepartamentoNacimiento";
    /** <code>solicitudTINDICARTITULAR2ptpagrDepartamentoNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPAGRDEPARTAMENTONACIMIENTO = "Clas_1431957012480960Ser_93Arg_3_Alias";
    /** <code>solicitudTINDICARTITULAR2ptpagrDepartamentoNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPAGRDEPARTAMENTONACIMIENTO = "Departamento nacimiento";
    /** <code>solicitudTINDICARTITULAR2ptpagrMunicipioNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPAGRMUNICIPIONACIMIENTO = "pt_p_agrMunicipioNacimiento";
    /** <code>solicitudTINDICARTITULAR2ptpagrMunicipioNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPAGRMUNICIPIONACIMIENTO = "Clas_1431957012480960Ser_93Arg_4_Alias";
    /** <code>solicitudTINDICARTITULAR2ptpagrMunicipioNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPAGRMUNICIPIONACIMIENTO = "Municipio nacimiento";
    /** <code>solicitudTINDICARTITULAR2ptpagrEstadoCivil</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPAGRESTADOCIVIL = "pt_p_agrEstadoCivil";
    /** <code>solicitudTINDICARTITULAR2ptpagrEstadoCivil</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPAGRESTADOCIVIL = "Clas_1431957012480960Ser_93Arg_5_Alias";
    /** <code>solicitudTINDICARTITULAR2ptpagrEstadoCivil</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPAGRESTADOCIVIL = "Estado Civil";
    /** <code>solicitudTINDICARTITULAR2ptpatrNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRNUMIDENTIFICACION = "pt_p_atrNumIdentificacion";
    /** <code>solicitudTINDICARTITULAR2ptpatrNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRNUMIDENTIFICACION = "Clas_1431957012480960Ser_93Arg_6_Alias";
    /** <code>solicitudTINDICARTITULAR2ptpatrNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRNUMIDENTIFICACION = "Nº Identificación";
    /** <code>solicitudTINDICARTITULAR2ptpatrPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRPRIMERNOMBRE = "pt_p_atrPrimerNombre";
    /** <code>solicitudTINDICARTITULAR2ptpatrPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRPRIMERNOMBRE = "Clas_1431957012480960Ser_93Arg_7_Alias";
    /** <code>solicitudTINDICARTITULAR2ptpatrPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRPRIMERNOMBRE = "Primer nombre";
    /** <code>solicitudTINDICARTITULAR2ptpatrSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRSEGUNDONOMBRE = "pt_p_atrSegundoNombre";
    /** <code>solicitudTINDICARTITULAR2ptpatrSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRSEGUNDONOMBRE = "Clas_1431957012480960Ser_93Arg_8_Alias";
    /** <code>solicitudTINDICARTITULAR2ptpatrSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRSEGUNDONOMBRE = "Segundo nombre";
    /** <code>solicitudTINDICARTITULAR2ptpatrPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRPRIMERAPELLIDO = "pt_p_atrPrimerApellido";
    /** <code>solicitudTINDICARTITULAR2ptpatrPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRPRIMERAPELLIDO = "Clas_1431957012480960Ser_93Arg_9_Alias";
    /** <code>solicitudTINDICARTITULAR2ptpatrPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRPRIMERAPELLIDO = "Primer Apellido";
    /** <code>solicitudTINDICARTITULAR2ptpatrSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRSEGUNDOAPELLIDO = "pt_p_atrSegundoApellido";
    /** <code>solicitudTINDICARTITULAR2ptpatrSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRSEGUNDOAPELLIDO = "Clas_1431957012480960Ser_93Arg_10_Alias";
    /** <code>solicitudTINDICARTITULAR2ptpatrSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRSEGUNDOAPELLIDO = "Segundo Apellido";
    /** <code>solicitudTINDICARTITULAR2ptpatrFechaNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRFECHANACIMIENTO = "pt_p_atrFechaNacimiento";
    /** <code>solicitudTINDICARTITULAR2ptpatrFechaNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRFECHANACIMIENTO = "Clas_1431957012480960Ser_93Arg_11_Alias";
    /** <code>solicitudTINDICARTITULAR2ptpatrFechaNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRFECHANACIMIENTO = "Fecha nacimiento";
    /** <code>solicitudTINDICARTITULAR2ptpatrGenero</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRGENERO = "pt_p_atrGenero";
    /** <code>solicitudTINDICARTITULAR2ptpatrGenero</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRGENERO = "Clas_1431957012480960Ser_93Arg_12_Alias";
    /** <code>solicitudTINDICARTITULAR2ptpatrGenero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRGENERO = "Género";
    /** <code>solicitudTINDICARTITULAR2ptpatrIndicadorExtranjero</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRINDICADOREXTRANJERO = "pt_p_atrIndicadorExtranjero";
    /** <code>solicitudTINDICARTITULAR2ptpatrIndicadorExtranjero</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRINDICADOREXTRANJERO = "Clas_1431957012480960Ser_93Arg_13_Alias";
    /** <code>solicitudTINDICARTITULAR2ptpatrIndicadorExtranjero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRINDICADOREXTRANJERO = "Indicador extranjero";
    /** <code>solicitudTINDICARTITULAR2ptpatrTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRTELEFONOFIJO = "pt_p_atrTelefonoFijo";
    /** <code>solicitudTINDICARTITULAR2ptpatrTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRTELEFONOFIJO = "Clas_1431957012480960Ser_93Arg_14_Alias";
    /** <code>solicitudTINDICARTITULAR2ptpatrTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRTELEFONOFIJO = "Teléfono fijo";
    /** <code>solicitudTINDICARTITULAR2ptpatrTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRTELEFONOCELULAR = "pt_p_atrTelefonoCelular";
    /** <code>solicitudTINDICARTITULAR2ptpatrTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRTELEFONOCELULAR = "Clas_1431957012480960Ser_93Arg_15_Alias";
    /** <code>solicitudTINDICARTITULAR2ptpatrTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRTELEFONOCELULAR = "Teléfono celular";
    /** <code>solicitudTINDICARTITULAR2ptpatrCorreoElectronico</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRCORREOELECTRONICO = "pt_p_atrCorreoElectronico";
    /** <code>solicitudTINDICARTITULAR2ptpatrCorreoElectronico</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRCORREOELECTRONICO = "Clas_1431957012480960Ser_93Arg_16_Alias";
    /** <code>solicitudTINDICARTITULAR2ptpatrCorreoElectronico</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRCORREOELECTRONICO = "Correo electrónico";
    /** <code>solicitudTINDICARTITULAR2ptpagrDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPAGRDEPARTAMENTO = "pt_p_agrDepartamento";
    /** <code>solicitudTINDICARTITULAR2ptpagrDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPAGRDEPARTAMENTO = "Clas_1431957012480960Ser_93Arg_17_Alias";
    /** <code>solicitudTINDICARTITULAR2ptpagrDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPAGRDEPARTAMENTO = "Departamento";
    /** <code>solicitudTINDICARTITULAR2ptpagrMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPAGRMUNICIPIO = "pt_p_agrMunicipio";
    /** <code>solicitudTINDICARTITULAR2ptpagrMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPAGRMUNICIPIO = "Clas_1431957012480960Ser_93Arg_18_Alias";
    /** <code>solicitudTINDICARTITULAR2ptpagrMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPAGRMUNICIPIO = "Municipio";
    /** <code>solicitudTINDICARTITULAR2ptpatrDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRDIRECCIONCOMPLETA = "pt_p_atrDireccionCompleta";
    /** <code>solicitudTINDICARTITULAR2ptpatrDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRDIRECCIONCOMPLETA = "Clas_1431957012480960Ser_93Arg_19_Alias";
    /** <code>solicitudTINDICARTITULAR2ptpatrDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>solicitudTINDICARTITULAR2ptpatrRural</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRRURAL = "pt_p_atrRural";
    /** <code>solicitudTINDICARTITULAR2ptpatrRural</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRRURAL = "Clas_1431957012480960Ser_93Arg_20_Alias";
    /** <code>solicitudTINDICARTITULAR2ptpatrRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPATRRURAL = "Rural";
    /** <code>solicitudTINDICARTITULAR2ptpagrPais</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPAGRPAIS = "pt_p_agrPais";
    /** <code>solicitudTINDICARTITULAR2ptpagrPais</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPAGRPAIS = "Clas_1431957012480960Ser_93Arg_22_Alias";
    /** <code>solicitudTINDICARTITULAR2ptpagrPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPAGRPAIS = "País";
    /** <code>solicitudTINDICARTITULAR2ptpCodigo</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPCODIGO = "pt_p_Codigo";
    /** <code>solicitudTINDICARTITULAR2ptpCodigo</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPCODIGO = "Clas_1431957012480960Ser_93Arg_23_Alias";
    /** <code>solicitudTINDICARTITULAR2ptpCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPCODIGO = "Código";
    /** <code>solicitudTINDICARTITULAR2ptpTieneEPSSanitas</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPTIENEEPSSANITAS = "pt_p_TieneEPSSanitas";
    /** <code>solicitudTINDICARTITULAR2ptpTieneEPSSanitas</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPTIENEEPSSANITAS = "Clas_1431957012480960Ser_93Arg_24_Alias";
    /** <code>solicitudTINDICARTITULAR2ptpTieneEPSSanitas</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPTIENEEPSSANITAS = "Tiene EPS Sanitas";
    /** <code>solicitudTINDICARTITULAR2ptpRechazadoAfiliacion</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPRECHAZADOAFILIACION = "pt_p_RechazadoAfiliacion";
    /** <code>solicitudTINDICARTITULAR2ptpRechazadoAfiliacion</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPRECHAZADOAFILIACION = "Clas_1431957012480960Ser_93Arg_25_Alias";
    /** <code>solicitudTINDICARTITULAR2ptpRechazadoAfiliacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPRECHAZADOAFILIACION = "Rechazado Afiliación";
    /** <code>solicitudTINDICARTITULAR2ptpTitularBeneficios</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPTITULARBENEFICIOS = "pt_p_TitularBeneficios";
    /** <code>solicitudTINDICARTITULAR2ptpTitularBeneficios</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPTITULARBENEFICIOS = "Clas_1431957012480960Ser_93Arg_26_Alias";
    /** <code>solicitudTINDICARTITULAR2ptpTitularBeneficios</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTPTITULARBENEFICIOS = "Titular con beneficios";
    /** <code>solicitudTINDICARTITULAR2ptEstadoPersona</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTESTADOPERSONA = "ptEstadoPersona";
    /** <code>solicitudTINDICARTITULAR2ptEstadoPersona</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTESTADOPERSONA = "Clas_1431957012480960Ser_93Arg_30_Alias";
    /** <code>solicitudTINDICARTITULAR2ptEstadoPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTESTADOPERSONA = "Estado persona";
    /** <code>solicitudTINDICARTITULAR2ptDCDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTDCDEPARTAMENTO = "ptDCDepartamento";
    /** <code>solicitudTINDICARTITULAR2ptDCDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTDCDEPARTAMENTO = "Clas_1431957012480960Ser_93Arg_31_Alias";
    /** <code>solicitudTINDICARTITULAR2ptDCDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTDCDEPARTAMENTO = "Departamento";
    /** <code>solicitudTINDICARTITULAR2ptDCMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTDCMUNICIPIO = "ptDCMunicipio";
    /** <code>solicitudTINDICARTITULAR2ptDCMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTDCMUNICIPIO = "Clas_1431957012480960Ser_93Arg_32_Alias";
    /** <code>solicitudTINDICARTITULAR2ptDCMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTDCMUNICIPIO = "Municipio";
    /** <code>solicitudTINDICARTITULAR2ptDCDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTDCDIRECCIONCOMPLETA = "ptDCDireccionCompleta";
    /** <code>solicitudTINDICARTITULAR2ptDCDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTDCDIRECCIONCOMPLETA = "Clas_1431957012480960Ser_93Arg_33_Alias";
    /** <code>solicitudTINDICARTITULAR2ptDCDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTDCDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>solicitudTINDICARTITULAR2ptDCRural</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTDCRURAL = "ptDCRural";
    /** <code>solicitudTINDICARTITULAR2ptDCRural</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTDCRURAL = "Clas_1431957012480960Ser_93Arg_34_Alias";
    /** <code>solicitudTINDICARTITULAR2ptDCRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTDCRURAL = "Rural";
    /** <code>solicitudTINDICARTITULAR2ptDCTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTDCTELEFONOFIJO = "ptDCTelefonoFijo";
    /** <code>solicitudTINDICARTITULAR2ptDCTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTDCTELEFONOFIJO = "Clas_1431957012480960Ser_93Arg_35_Alias";
    /** <code>solicitudTINDICARTITULAR2ptDCTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTDCTELEFONOFIJO = "Teléfono fijo";
    /** <code>solicitudTINDICARTITULAR2ptDCTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTDCTELEFONOCELULAR = "ptDCTelefonoCelular";
    /** <code>solicitudTINDICARTITULAR2ptDCTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTDCTELEFONOCELULAR = "Clas_1431957012480960Ser_93Arg_36_Alias";
    /** <code>solicitudTINDICARTITULAR2ptDCTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTDCTELEFONOCELULAR = "Teléfono celular";
    /** <code>solicitudTINDICARTITULAR2ptReplicarDir</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTREPLICARDIR = "ptReplicarDir";
    /** <code>solicitudTINDICARTITULAR2ptReplicarDir</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTREPLICARDIR = "Clas_1431957012480960Ser_93Arg_37_Alias";
    /** <code>solicitudTINDICARTITULAR2ptReplicarDir</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTREPLICARDIR = "Replicar";
    /** <code>solicitudTINDICARTITULAR2ptRazonSocial</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTRAZONSOCIAL = "ptRazonSocial";
    /** <code>solicitudTINDICARTITULAR2ptRazonSocial</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTRAZONSOCIAL = "Clas_1431957012480960Ser_93Arg_38_Alias";
    /** <code>solicitudTINDICARTITULAR2ptRazonSocial</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULAR2_SOLICITUDTINDICARTITULAR2PTRAZONSOCIAL = "Razón social";
    // Service (TENVIARDOCAUTO)
    /** <code>TENVIARDOCAUTO</code> service id. */
    public static final String SERV_ID_TENVIARDOCAUTO = "Clas_1431957012480960Ser_95_Alias";
    /** <code>TENVIARDOCAUTO</code> service name. */
    public static final String SERV_NAME_TENVIARDOCAUTO = "TENVIARDOCAUTO";
    /** <code>TENVIARDOCAUTO</code> service alias. */
    public static final String SERV_ALIAS_TENVIARDOCAUTO = "TENVIARDOCAUTO";
    /** Agents allowed to execute the service TENVIARDOCAUTO **/
    public static final String TENVIARDOCAUTO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudTENVIARDOCAUTOpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TENVIARDOCAUTO_SOLICITUDTENVIARDOCAUTOPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTENVIARDOCAUTOpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TENVIARDOCAUTO_SOLICITUDTENVIARDOCAUTOPTHISSOLICITUD = "Clas_1431957012480960Ser_95Arg_1_Alias";
    /** <code>solicitudTENVIARDOCAUTOpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TENVIARDOCAUTO_SOLICITUDTENVIARDOCAUTOPTHISSOLICITUD = "Solicitud";
    // Service (TINDICARCONTRATANTEINCLUSION)
    /** <code>TINDICARCONTRATANTEINCLUSION</code> service id. */
    public static final String SERV_ID_TINDICARCONTRATANTEINCLUSION = "Clas_1431957012480960Ser_101_Alias";
    /** <code>TINDICARCONTRATANTEINCLUSION</code> service name. */
    public static final String SERV_NAME_TINDICARCONTRATANTEINCLUSION = "TINDICARCONTRATANTEINCLUSION";
    /** <code>TINDICARCONTRATANTEINCLUSION</code> service alias. */
    public static final String SERV_ALIAS_TINDICARCONTRATANTEINCLUSION = "TINDICARCONTRATANTEINCLUSION";
    /** Agents allowed to execute the service TINDICARCONTRATANTEINCLUSION **/
    public static final String TINDICARCONTRATANTEINCLUSION_SRVAGENTS = "";
    // Preconditions
    /** <code>TINDICARCONTRATANTEINCLUSION</code> precondition 0 id. */
    public static final String PRE_ID_TINDICARCONTRATANTEINCLUSION_0 = "Clas_1431957012480960Pre_81_MsgError";
    // Inbound arguments
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTHISSOLICITUD = "Clas_1431957012480960Ser_101Arg_1_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPPRIMERNOMBRE = "pt_p_PrimerNombre";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPPRIMERNOMBRE = "Clas_1431957012480960Ser_101Arg_2_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPPRIMERNOMBRE = "Primer nombre";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPSEGUNDONOMBRE = "pt_p_SegundoNombre";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPSEGUNDONOMBRE = "Clas_1431957012480960Ser_101Arg_3_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPSEGUNDONOMBRE = "Segundo nombre";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPPRIMERAPELLIDO = "pt_p_PrimerApellido";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPPRIMERAPELLIDO = "Clas_1431957012480960Ser_101Arg_4_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPPRIMERAPELLIDO = "Primer Apellido";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPSEGUNDOAPELLIDO = "pt_p_SegundoApellido";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPSEGUNDOAPELLIDO = "Clas_1431957012480960Ser_101Arg_5_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPSEGUNDOAPELLIDO = "Segundo Apellido";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpFechaNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPFECHANACIMIENTO = "pt_p_FechaNacimiento";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpFechaNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPFECHANACIMIENTO = "Clas_1431957012480960Ser_101Arg_6_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpFechaNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPFECHANACIMIENTO = "Fecha nacimiento";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpGenero</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPGENERO = "pt_p_Genero";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpGenero</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPGENERO = "Clas_1431957012480960Ser_101Arg_7_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpGenero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPGENERO = "Género";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpIndicadorExtranjero</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPINDICADOREXTRANJERO = "pt_p_IndicadorExtranjero";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpIndicadorExtranjero</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPINDICADOREXTRANJERO = "Clas_1431957012480960Ser_101Arg_8_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpIndicadorExtranjero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPINDICADOREXTRANJERO = "Indicador extranjero";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPTELEFONOFIJO = "pt_p_TelefonoFijo";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPTELEFONOFIJO = "Clas_1431957012480960Ser_101Arg_9_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPTELEFONOFIJO = "Teléfono fijo";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPTELEFONOCELULAR = "pt_p_TelefonoCelular";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPTELEFONOCELULAR = "Clas_1431957012480960Ser_101Arg_10_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPTELEFONOCELULAR = "Teléfono celular";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpCorreoElectronico</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPCORREOELECTRONICO = "pt_p_CorreoElectronico";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpCorreoElectronico</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPCORREOELECTRONICO = "Clas_1431957012480960Ser_101Arg_11_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpCorreoElectronico</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPCORREOELECTRONICO = "Correo electrónico";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpevcDepartamentoNac</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPEVCDEPARTAMENTONAC = "pt_p_evcDepartamentoNac";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpevcDepartamentoNac</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPEVCDEPARTAMENTONAC = "Clas_1431957012480960Ser_101Arg_12_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpevcDepartamentoNac</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPEVCDEPARTAMENTONAC = "Departamento nacimiento";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpevcMunicipioNac</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPEVCMUNICIPIONAC = "pt_p_evcMunicipioNac";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpevcMunicipioNac</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPEVCMUNICIPIONAC = "Clas_1431957012480960Ser_101Arg_13_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpevcMunicipioNac</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPEVCMUNICIPIONAC = "Municipio nacimiento";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpevcEstadoCivil</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPEVCESTADOCIVIL = "pt_p_evcEstadoCivil";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpevcEstadoCivil</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPEVCESTADOCIVIL = "Clas_1431957012480960Ser_101Arg_14_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpevcEstadoCivil</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPEVCESTADOCIVIL = "Estado civil";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPDIRECCIONCOMPLETA = "pt_p_DireccionCompleta";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPDIRECCIONCOMPLETA = "Clas_1431957012480960Ser_101Arg_15_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpRural</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPRURAL = "pt_p_Rural";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpRural</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPRURAL = "Clas_1431957012480960Ser_101Arg_16_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPRURAL = "Rural";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpevcDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPEVCDEPARTAMENTO = "pt_p_evcDepartamento";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpevcDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPEVCDEPARTAMENTO = "Clas_1431957012480960Ser_101Arg_17_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpevcDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPEVCDEPARTAMENTO = "Departamento";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpevcMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPEVCMUNICIPIO = "pt_p_evcMunicipio";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpevcMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPEVCMUNICIPIO = "Clas_1431957012480960Ser_101Arg_18_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpevcMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPEVCMUNICIPIO = "Municipio";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPNUMIDENTIFICACION = "pt_p_NumIdentificacion";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPNUMIDENTIFICACION = "Clas_1431957012480960Ser_101Arg_19_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPNUMIDENTIFICACION = "Nº Identificación";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpevcTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPEVCTIPOIDENTIFICACION = "pt_p_evcTipoIdentificacion";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpevcTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPEVCTIPOIDENTIFICACION = "Clas_1431957012480960Ser_101Arg_20_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpevcTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPEVCTIPOIDENTIFICACION = "Tipo identificación";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpatrRazonSocial</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPATRRAZONSOCIAL = "pt_p_atrRazonSocial";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpatrRazonSocial</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPATRRAZONSOCIAL = "Clas_1431957012480960Ser_101Arg_21_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpatrRazonSocial</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPATRRAZONSOCIAL = "Razón Social";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpDCDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPDCDIRECCIONCOMPLETA = "pt_pDCDireccionCompleta";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpDCDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPDCDIRECCIONCOMPLETA = "Clas_1431957012480960Ser_101Arg_22_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpDCDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPDCDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpDCDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPDCDEPARTAMENTO = "pt_pDCDepartamento";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpDCDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPDCDEPARTAMENTO = "Clas_1431957012480960Ser_101Arg_23_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpDCDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPDCDEPARTAMENTO = "Departamento";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpDCMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPDCMUNICIPIO = "pt_pDCMunicipio";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpDCMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPDCMUNICIPIO = "Clas_1431957012480960Ser_101Arg_24_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpDCMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPDCMUNICIPIO = "Municipio";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpDCRural</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPDCRURAL = "pt_pDCRural";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpDCRural</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPDCRURAL = "Clas_1431957012480960Ser_101Arg_25_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpDCRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPDCRURAL = "Rural";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpDCTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPDCTELEFONOFIJO = "pt_pDCTelefonoFijo";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpDCTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPDCTELEFONOFIJO = "Clas_1431957012480960Ser_101Arg_26_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpDCTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPDCTELEFONOFIJO = "Teléfono fijo";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpDCTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPDCTELEFONOCELULAR = "pt_pDCTelefonoCelular";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpDCTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPDCTELEFONOCELULAR = "Clas_1431957012480960Ser_101Arg_27_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpDCTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPDCTELEFONOCELULAR = "Teléfono celular";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpPais</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPPAIS = "pt_p_Pais";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpPais</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPPAIS = "Clas_1431957012480960Ser_101Arg_28_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPPAIS = "País";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpCodigoCORE</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPCODIGOCORE = "pt_p_CodigoCORE";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpCodigoCORE</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPCODIGOCORE = "Clas_1431957012480960Ser_101Arg_29_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptpCodigoCORE</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTPCODIGOCORE = "pt_p_CodigoCORE";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptTieneEPSSanitas</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTTIENEEPSSANITAS = "pt_TieneEPSSanitas";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptTieneEPSSanitas</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTTIENEEPSSANITAS = "Clas_1431957012480960Ser_101Arg_30_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptTieneEPSSanitas</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTTIENEEPSSANITAS = "pt_TieneEPSSanitas";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptRechazadoAfiliacion</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTRECHAZADOAFILIACION = "pt_RechazadoAfiliacion";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptRechazadoAfiliacion</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTRECHAZADOAFILIACION = "Clas_1431957012480960Ser_101Arg_31_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptRechazadoAfiliacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTRECHAZADOAFILIACION = "pt_RechazadoAfiliacion";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONpDCPais</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPDCPAIS = "pDCPais";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONpDCPais</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPDCPAIS = "Clas_1431957012480960Ser_101Arg_32_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONpDCPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPDCPAIS = "País";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONpTitularBeneficios</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTITULARBENEFICIOS = "p_TitularBeneficios";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONpTitularBeneficios</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTITULARBENEFICIOS = "Clas_1431957012480960Ser_101Arg_33_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONpTitularBeneficios</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTITULARBENEFICIOS = "Titular con beneficios";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptTipoRegimen</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTTIPOREGIMEN = "ptTipoRegimen";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptTipoRegimen</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTTIPOREGIMEN = "Clas_1431957012480960Ser_101Arg_37_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptTipoRegimen</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTTIPOREGIMEN = "ptTipoRegimen";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptEstadoPersona</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTESTADOPERSONA = "ptEstadoPersona";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptEstadoPersona</code> inbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTESTADOPERSONA = "Clas_1431957012480960Ser_101Arg_38_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONptEstadoPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPTESTADOPERSONA = "Estado Persona";
    // Outbound arguments
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONpsPersona</code> outbound argument name. */
    public static final String ARG_NAME_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPSPERSONA = "solicitudTINDICARCONTRATANTEINCLUSIONpsPersona";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONpsPersona</code> outbound argument id. */
    public static final String ARG_ID_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPSPERSONA = "Clas_1431957012480960Ser_101Arg_40_Alias";
    /** <code>solicitudTINDICARCONTRATANTEINCLUSIONpsPersona</code> outbound argument alias. */
    public static final String ARG_ALIAS_TINDICARCONTRATANTEINCLUSION_SOLICITUDTINDICARCONTRATANTEINCLUSIONPSPERSONA = "Persona";
    // Service (TINDICARTITULARINCLUSION)
    /** <code>TINDICARTITULARINCLUSION</code> service id. */
    public static final String SERV_ID_TINDICARTITULARINCLUSION = "Clas_1431957012480960Ser_102_Alias";
    /** <code>TINDICARTITULARINCLUSION</code> service name. */
    public static final String SERV_NAME_TINDICARTITULARINCLUSION = "TINDICARTITULARINCLUSION";
    /** <code>TINDICARTITULARINCLUSION</code> service alias. */
    public static final String SERV_ALIAS_TINDICARTITULARINCLUSION = "Indicar titular";
    /** Agents allowed to execute the service TINDICARTITULARINCLUSION **/
    public static final String TINDICARTITULARINCLUSION_SRVAGENTS = "";
    // Preconditions
    /** <code>TINDICARTITULARINCLUSION</code> precondition 0 id. */
    public static final String PRE_ID_TINDICARTITULARINCLUSION_0 = "Clas_1431957012480960Pre_82_MsgError";
    // Inbound arguments
    /** <code>solicitudTINDICARTITULARINCLUSIONpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTINDICARTITULARINCLUSIONpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTHISSOLICITUD = "Clas_1431957012480960Ser_102Arg_1_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpagrTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPAGRTIPOIDENTIFICACION = "pt_p_agrTipoIdentificacion";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpagrTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPAGRTIPOIDENTIFICACION = "Clas_1431957012480960Ser_102Arg_2_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpagrTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPAGRTIPOIDENTIFICACION = "Tipo identificación";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpagrDepartamentoNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPAGRDEPARTAMENTONACIMIENTO = "pt_p_agrDepartamentoNacimiento";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpagrDepartamentoNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPAGRDEPARTAMENTONACIMIENTO = "Clas_1431957012480960Ser_102Arg_3_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpagrDepartamentoNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPAGRDEPARTAMENTONACIMIENTO = "Departamento nacimiento";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpagrMunicipioNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPAGRMUNICIPIONACIMIENTO = "pt_p_agrMunicipioNacimiento";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpagrMunicipioNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPAGRMUNICIPIONACIMIENTO = "Clas_1431957012480960Ser_102Arg_4_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpagrMunicipioNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPAGRMUNICIPIONACIMIENTO = "Municipio nacimiento";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpagrEstadoCivil</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPAGRESTADOCIVIL = "pt_p_agrEstadoCivil";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpagrEstadoCivil</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPAGRESTADOCIVIL = "Clas_1431957012480960Ser_102Arg_5_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpagrEstadoCivil</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPAGRESTADOCIVIL = "EstadoCivil";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRNUMIDENTIFICACION = "pt_p_atrNumIdentificacion";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRNUMIDENTIFICACION = "Clas_1431957012480960Ser_102Arg_6_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRNUMIDENTIFICACION = "Nº Identificación";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRPRIMERNOMBRE = "pt_p_atrPrimerNombre";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRPRIMERNOMBRE = "Clas_1431957012480960Ser_102Arg_7_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRPRIMERNOMBRE = "Primer nombre";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRSEGUNDONOMBRE = "pt_p_atrSegundoNombre";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRSEGUNDONOMBRE = "Clas_1431957012480960Ser_102Arg_8_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRSEGUNDONOMBRE = "Segundo nombre";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRPRIMERAPELLIDO = "pt_p_atrPrimerApellido";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRPRIMERAPELLIDO = "Clas_1431957012480960Ser_102Arg_9_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRPRIMERAPELLIDO = "Primer Apellido";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRSEGUNDOAPELLIDO = "pt_p_atrSegundoApellido";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRSEGUNDOAPELLIDO = "Clas_1431957012480960Ser_102Arg_10_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRSEGUNDOAPELLIDO = "Segundo Apellido";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrFechaNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRFECHANACIMIENTO = "pt_p_atrFechaNacimiento";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrFechaNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRFECHANACIMIENTO = "Clas_1431957012480960Ser_102Arg_11_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrFechaNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRFECHANACIMIENTO = "Fecha nacimiento";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrGenero</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRGENERO = "pt_p_atrGenero";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrGenero</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRGENERO = "Clas_1431957012480960Ser_102Arg_12_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrGenero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRGENERO = "Género";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrIndicadorExtranjero</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRINDICADOREXTRANJERO = "pt_p_atrIndicadorExtranjero";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrIndicadorExtranjero</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRINDICADOREXTRANJERO = "Clas_1431957012480960Ser_102Arg_13_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrIndicadorExtranjero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRINDICADOREXTRANJERO = "Indicador extranjero";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRTELEFONOFIJO = "pt_p_atrTelefonoFijo";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRTELEFONOFIJO = "Clas_1431957012480960Ser_102Arg_14_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRTELEFONOFIJO = "Teléfono fijo";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRTELEFONOCELULAR = "pt_p_atrTelefonoCelular";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRTELEFONOCELULAR = "Clas_1431957012480960Ser_102Arg_15_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRTELEFONOCELULAR = "Teléfono celular";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrCorreoElectronico</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRCORREOELECTRONICO = "pt_p_atrCorreoElectronico";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrCorreoElectronico</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRCORREOELECTRONICO = "Clas_1431957012480960Ser_102Arg_16_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrCorreoElectronico</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRCORREOELECTRONICO = "Correo electrónico";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpagrDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPAGRDEPARTAMENTO = "pt_p_agrDepartamento";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpagrDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPAGRDEPARTAMENTO = "Clas_1431957012480960Ser_102Arg_17_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpagrDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPAGRDEPARTAMENTO = "Departamento";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpagrMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPAGRMUNICIPIO = "pt_p_agrMunicipio";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpagrMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPAGRMUNICIPIO = "Clas_1431957012480960Ser_102Arg_18_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpagrMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPAGRMUNICIPIO = "Municipio";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRDIRECCIONCOMPLETA = "pt_p_atrDireccionCompleta";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRDIRECCIONCOMPLETA = "Clas_1431957012480960Ser_102Arg_19_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrRural</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRRURAL = "pt_p_atrRural";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrRural</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRRURAL = "Clas_1431957012480960Ser_102Arg_20_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpatrRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPATRRURAL = "Rural";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpagrPais</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPAGRPAIS = "pt_p_agrPais";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpagrPais</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPAGRPAIS = "Clas_1431957012480960Ser_102Arg_21_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpagrPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPAGRPAIS = "País";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpCodigo</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPCODIGO = "pt_p_Codigo";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpCodigo</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPCODIGO = "Clas_1431957012480960Ser_102Arg_22_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPCODIGO = "Código";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpTieneEPSSanitas</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPTIENEEPSSANITAS = "pt_p_TieneEPSSanitas";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpTieneEPSSanitas</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPTIENEEPSSANITAS = "Clas_1431957012480960Ser_102Arg_23_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpTieneEPSSanitas</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPTIENEEPSSANITAS = "Tiene EPS Sanitas";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpRechazadoAfiliacion</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPRECHAZADOAFILIACION = "pt_p_RechazadoAfiliacion";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpRechazadoAfiliacion</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPRECHAZADOAFILIACION = "Clas_1431957012480960Ser_102Arg_24_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpRechazadoAfiliacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPRECHAZADOAFILIACION = "Rechazado Afiliación";
    /** <code>solicitudTINDICARTITULARINCLUSIONpTitularBeneficios</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTITULARBENEFICIOS = "p_TitularBeneficios";
    /** <code>solicitudTINDICARTITULARINCLUSIONpTitularBeneficios</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTITULARBENEFICIOS = "Clas_1431957012480960Ser_102Arg_25_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONpTitularBeneficios</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTITULARBENEFICIOS = "p_TitularBeneficios";
    /** <code>solicitudTINDICARTITULARINCLUSIONptTipoRegimen</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTTIPOREGIMEN = "ptTipoRegimen";
    /** <code>solicitudTINDICARTITULARINCLUSIONptTipoRegimen</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTTIPOREGIMEN = "Clas_1431957012480960Ser_102Arg_27_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptTipoRegimen</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTTIPOREGIMEN = "ptTipoRegimen";
    /** <code>solicitudTINDICARTITULARINCLUSIONptDCDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTDCDIRECCIONCOMPLETA = "pt_DCDireccionCompleta";
    /** <code>solicitudTINDICARTITULARINCLUSIONptDCDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTDCDIRECCIONCOMPLETA = "Clas_1431957012480960Ser_102Arg_28_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptDCDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTDCDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>solicitudTINDICARTITULARINCLUSIONptDCMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTDCMUNICIPIO = "pt_DCMunicipio";
    /** <code>solicitudTINDICARTITULARINCLUSIONptDCMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTDCMUNICIPIO = "Clas_1431957012480960Ser_102Arg_29_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptDCMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTDCMUNICIPIO = "Municipio nacimiento";
    /** <code>solicitudTINDICARTITULARINCLUSIONptDCDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTDCDEPARTAMENTO = "pt_DCDepartamento";
    /** <code>solicitudTINDICARTITULARINCLUSIONptDCDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTDCDEPARTAMENTO = "Clas_1431957012480960Ser_102Arg_30_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptDCDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTDCDEPARTAMENTO = "Departamento nacimiento";
    /** <code>solicitudTINDICARTITULARINCLUSIONptDCPais</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTDCPAIS = "pt_DCPais";
    /** <code>solicitudTINDICARTITULARINCLUSIONptDCPais</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTDCPAIS = "Clas_1431957012480960Ser_102Arg_31_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptDCPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTDCPAIS = "País";
    /** <code>solicitudTINDICARTITULARINCLUSIONptEstadoPersona</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTESTADOPERSONA = "ptEstadoPersona";
    /** <code>solicitudTINDICARTITULARINCLUSIONptEstadoPersona</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTESTADOPERSONA = "Clas_1431957012480960Ser_102Arg_32_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptEstadoPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTESTADOPERSONA = "Estado Persona";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpDCRural</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPDCRURAL = "pt_pDCRural";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpDCRural</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPDCRURAL = "Clas_1431957012480960Ser_102Arg_34_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpDCRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPDCRURAL = "Rural";
    /** <code>solicitudTINDICARTITULARINCLUSIONptDCTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTDCTELEFONOFIJO = "ptDCTelefonoFijo";
    /** <code>solicitudTINDICARTITULARINCLUSIONptDCTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTDCTELEFONOFIJO = "Clas_1431957012480960Ser_102Arg_36_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptDCTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTDCTELEFONOFIJO = "Teléfono fijo";
    /** <code>solicitudTINDICARTITULARINCLUSIONptDCTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTDCTELEFONOCELULAR = "ptDCTelefonoCelular";
    /** <code>solicitudTINDICARTITULARINCLUSIONptDCTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTDCTELEFONOCELULAR = "Clas_1431957012480960Ser_102Arg_37_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptDCTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTDCTELEFONOCELULAR = "Teléfono celular";
    /** <code>solicitudTINDICARTITULARINCLUSIONptRazonSocial</code> inbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTRAZONSOCIAL = "ptRazonSocial";
    /** <code>solicitudTINDICARTITULARINCLUSIONptRazonSocial</code> inbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTRAZONSOCIAL = "Clas_1431957012480960Ser_102Arg_38_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptRazonSocial</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTRAZONSOCIAL = "Razón social";
    // Outbound arguments
    /** <code>solicitudTINDICARTITULARINCLUSIONptpsPersona</code> outbound argument name. */
    public static final String ARG_NAME_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPSPERSONA = "solicitudTINDICARTITULARINCLUSIONptpsPersona";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpsPersona</code> outbound argument id. */
    public static final String ARG_ID_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPSPERSONA = "Clas_1431957012480960Ser_102Arg_35_Alias";
    /** <code>solicitudTINDICARTITULARINCLUSIONptpsPersona</code> outbound argument alias. */
    public static final String ARG_ALIAS_TINDICARTITULARINCLUSION_SOLICITUDTINDICARTITULARINCLUSIONPTPSPERSONA = "Persona";
    // Service (TCHGTITBENEFCONT)
    /** <code>TCHGTITBENEFCONT</code> service id. */
    public static final String SERV_ID_TCHGTITBENEFCONT = "Clas_1431957012480960Ser_105_Alias";
    /** <code>TCHGTITBENEFCONT</code> service name. */
    public static final String SERV_NAME_TCHGTITBENEFCONT = "TCHGTITBENEFCONT";
    /** <code>TCHGTITBENEFCONT</code> service alias. */
    public static final String SERV_ALIAS_TCHGTITBENEFCONT = "Cambiar titular con beneficios";
    /** Agents allowed to execute the service TCHGTITBENEFCONT **/
    public static final String TCHGTITBENEFCONT_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Preconditions
    /** <code>TCHGTITBENEFCONT</code> precondition 0 id. */
    public static final String PRE_ID_TCHGTITBENEFCONT_0 = "Clas_1431957012480960Pre_85_MsgError";
    /** <code>TCHGTITBENEFCONT</code> precondition 1 id. */
    public static final String PRE_ID_TCHGTITBENEFCONT_1 = "Clas_1431957012480960Pre_86_MsgError";
    // Inbound arguments
    /** <code>solicitudTCHGTITBENEFCONTpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCHGTITBENEFCONT_SOLICITUDTCHGTITBENEFCONTPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTCHGTITBENEFCONTpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCHGTITBENEFCONT_SOLICITUDTCHGTITBENEFCONTPTHISSOLICITUD = "Clas_1431957012480960Ser_105Arg_1_Alias";
    /** <code>solicitudTCHGTITBENEFCONTpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCHGTITBENEFCONT_SOLICITUDTCHGTITBENEFCONTPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTCHGTITBENEFCONTptTitularConBeneficios</code> inbound argument name. */
    public static final String ARG_NAME_TCHGTITBENEFCONT_SOLICITUDTCHGTITBENEFCONTPTTITULARCONBENEFICIOS = "ptTitularConBeneficios";
    /** <code>solicitudTCHGTITBENEFCONTptTitularConBeneficios</code> inbound argument id. */
    public static final String ARG_ID_TCHGTITBENEFCONT_SOLICITUDTCHGTITBENEFCONTPTTITULARCONBENEFICIOS = "Clas_1431957012480960Ser_105Arg_2_Alias";
    /** <code>solicitudTCHGTITBENEFCONTptTitularConBeneficios</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCHGTITBENEFCONT_SOLICITUDTCHGTITBENEFCONTPTTITULARCONBENEFICIOS = "Titular con beneficios";
    // Service (TMARCARCOMPLETADA)
    /** <code>TMARCARCOMPLETADA</code> service id. */
    public static final String SERV_ID_TMARCARCOMPLETADA = "Clas_1431957012480960Ser_106_Alias";
    /** <code>TMARCARCOMPLETADA</code> service name. */
    public static final String SERV_NAME_TMARCARCOMPLETADA = "TMARCARCOMPLETADA";
    /** <code>TMARCARCOMPLETADA</code> service alias. */
    public static final String SERV_ALIAS_TMARCARCOMPLETADA = "Marcar completada";
    /** Agents allowed to execute the service TMARCARCOMPLETADA **/
    public static final String TMARCARCOMPLETADA_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    // Preconditions
    /** <code>TMARCARCOMPLETADA</code> precondition 0 id. */
    public static final String PRE_ID_TMARCARCOMPLETADA_0 = "Clas_1431957012480960Pre_87_MsgError";
    /** <code>TMARCARCOMPLETADA</code> precondition 1 id. */
    public static final String PRE_ID_TMARCARCOMPLETADA_1 = "Clas_1431957012480960Pre_88_MsgError";
    /** <code>TMARCARCOMPLETADA</code> precondition 2 id. */
    public static final String PRE_ID_TMARCARCOMPLETADA_2 = "Clas_1431957012480960Pre_89_MsgError";
    /** <code>TMARCARCOMPLETADA</code> precondition 3 id. */
    public static final String PRE_ID_TMARCARCOMPLETADA_3 = "Clas_1431957012480960Pre_91_MsgError";
    /** <code>TMARCARCOMPLETADA</code> precondition 4 id. */
    public static final String PRE_ID_TMARCARCOMPLETADA_4 = "Clas_1431957012480960Pre_92_MsgError";
    /** <code>TMARCARCOMPLETADA</code> precondition 5 id. */
    public static final String PRE_ID_TMARCARCOMPLETADA_5 = "Clas_1431957012480960Pre_93_MsgError";
    /** <code>TMARCARCOMPLETADA</code> precondition 6 id. */
    public static final String PRE_ID_TMARCARCOMPLETADA_6 = "Clas_1431957012480960Pre_94_MsgError";
    /** <code>TMARCARCOMPLETADA</code> precondition 7 id. */
    public static final String PRE_ID_TMARCARCOMPLETADA_7 = "Clas_1431957012480960Pre_95_MsgError";
    /** <code>TMARCARCOMPLETADA</code> precondition 8 id. */
    public static final String PRE_ID_TMARCARCOMPLETADA_8 = "Clas_1431957012480960Pre_96_MsgError";
    /** <code>TMARCARCOMPLETADA</code> precondition 9 id. */
    public static final String PRE_ID_TMARCARCOMPLETADA_9 = "Clas_1431957012480960Pre_97_MsgError";
    /** <code>TMARCARCOMPLETADA</code> precondition 10 id. */
    public static final String PRE_ID_TMARCARCOMPLETADA_10 = "Clas_1431957012480960Pre_114_MsgError";
    /** <code>TMARCARCOMPLETADA</code> precondition 11 id. */
    public static final String PRE_ID_TMARCARCOMPLETADA_11 = "Clas_1431957012480960Pre_124_MsgError";
    /** <code>TMARCARCOMPLETADA</code> precondition 12 id. */
    public static final String PRE_ID_TMARCARCOMPLETADA_12 = "Clas_1431957012480960Pre_125_MsgError";
    /** <code>TMARCARCOMPLETADA</code> precondition 13 id. */
    public static final String PRE_ID_TMARCARCOMPLETADA_13 = "Clas_1431957012480960Pre_127_MsgError";
    /** <code>TMARCARCOMPLETADA</code> precondition 14 id. */
    public static final String PRE_ID_TMARCARCOMPLETADA_14 = "Clas_1431957012480960Pre_128_MsgError";
    /** <code>TMARCARCOMPLETADA</code> precondition 15 id. */
    public static final String PRE_ID_TMARCARCOMPLETADA_15 = "Clas_1431957012480960Pre_131_MsgError";
    /** <code>TMARCARCOMPLETADA</code> precondition 16 id. */
    public static final String PRE_ID_TMARCARCOMPLETADA_16 = "Clas_1431957012480960Pre_132_MsgError";
    // Inbound arguments
    /** <code>solicitudTMARCARCOMPLETADApthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TMARCARCOMPLETADA_SOLICITUDTMARCARCOMPLETADAPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTMARCARCOMPLETADApthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TMARCARCOMPLETADA_SOLICITUDTMARCARCOMPLETADAPTHISSOLICITUD = "Clas_1431957012480960Ser_106Arg_1_Alias";
    /** <code>solicitudTMARCARCOMPLETADApthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMARCARCOMPLETADA_SOLICITUDTMARCARCOMPLETADAPTHISSOLICITUD = "Solicitud";
    // Outbound arguments
    /** <code>solicitudTMARCARCOMPLETADAptpsNumSolicitud</code> outbound argument name. */
    public static final String ARG_NAME_TMARCARCOMPLETADA_SOLICITUDTMARCARCOMPLETADAPTPSNUMSOLICITUD = "solicitudTMARCARCOMPLETADAptpsNumSolicitud";
    /** <code>solicitudTMARCARCOMPLETADAptpsNumSolicitud</code> outbound argument id. */
    public static final String ARG_ID_TMARCARCOMPLETADA_SOLICITUDTMARCARCOMPLETADAPTPSNUMSOLICITUD = "Clas_1431957012480960Ser_106Arg_2_Alias";
    /** <code>solicitudTMARCARCOMPLETADAptpsNumSolicitud</code> outbound argument alias. */
    public static final String ARG_ALIAS_TMARCARCOMPLETADA_SOLICITUDTMARCARCOMPLETADAPTPSNUMSOLICITUD = "pt_ps_NumSolicitud";
    // Service (TCAMBIARESTADO)
    /** <code>TCAMBIARESTADO</code> service id. */
    public static final String SERV_ID_TCAMBIARESTADO = "Clas_1431957012480960Ser_110_Alias";
    /** <code>TCAMBIARESTADO</code> service name. */
    public static final String SERV_NAME_TCAMBIARESTADO = "TCAMBIARESTADO";
    /** <code>TCAMBIARESTADO</code> service alias. */
    public static final String SERV_ALIAS_TCAMBIARESTADO = "Cambiar estado";
    /** Agents allowed to execute the service TCAMBIARESTADO **/
    public static final String TCAMBIARESTADO_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    // Inbound arguments
    /** <code>solicitudTCAMBIARESTADOpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARESTADO_SOLICITUDTCAMBIARESTADOPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTCAMBIARESTADOpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARESTADO_SOLICITUDTCAMBIARESTADOPTHISSOLICITUD = "Clas_1431957012480960Ser_110Arg_1_Alias";
    /** <code>solicitudTCAMBIARESTADOpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARESTADO_SOLICITUDTCAMBIARESTADOPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTCAMBIARESTADOptpeEstado</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARESTADO_SOLICITUDTCAMBIARESTADOPTPEESTADO = "pt_peEstado";
    /** <code>solicitudTCAMBIARESTADOptpeEstado</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARESTADO_SOLICITUDTCAMBIARESTADOPTPEESTADO = "Clas_1431957012480960Ser_110Arg_2_Alias";
    /** <code>solicitudTCAMBIARESTADOptpeEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARESTADO_SOLICITUDTCAMBIARESTADOPTPEESTADO = "Estado";
    /** <code>solicitudTCAMBIARESTADOptObservaciones</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARESTADO_SOLICITUDTCAMBIARESTADOPTOBSERVACIONES = "ptObservaciones";
    /** <code>solicitudTCAMBIARESTADOptObservaciones</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARESTADO_SOLICITUDTCAMBIARESTADOPTOBSERVACIONES = "Clas_1431957012480960Ser_110Arg_3_Alias";
    /** <code>solicitudTCAMBIARESTADOptObservaciones</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARESTADO_SOLICITUDTCAMBIARESTADOPTOBSERVACIONES = "Observaciones";
    /** <code>solicitudTCAMBIARESTADOptMotDevolucion</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARESTADO_SOLICITUDTCAMBIARESTADOPTMOTDEVOLUCION = "ptMotDevolucion";
    /** <code>solicitudTCAMBIARESTADOptMotDevolucion</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARESTADO_SOLICITUDTCAMBIARESTADOPTMOTDEVOLUCION = "Clas_1431957012480960Ser_110Arg_4_Alias";
    /** <code>solicitudTCAMBIARESTADOptMotDevolucion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARESTADO_SOLICITUDTCAMBIARESTADOPTMOTDEVOLUCION = "Motivo devolución";
    // Service (TCAMBIARESTADOERROR)
    /** <code>TCAMBIARESTADOERROR</code> service id. */
    public static final String SERV_ID_TCAMBIARESTADOERROR = "Clas_1431957012480960Ser_111_Alias";
    /** <code>TCAMBIARESTADOERROR</code> service name. */
    public static final String SERV_NAME_TCAMBIARESTADOERROR = "TCAMBIARESTADOERROR";
    /** <code>TCAMBIARESTADOERROR</code> service alias. */
    public static final String SERV_ALIAS_TCAMBIARESTADOERROR = "Cambiar estado a error";
    /** Agents allowed to execute the service TCAMBIARESTADOERROR **/
    public static final String TCAMBIARESTADOERROR_SRVAGENTS = "Admin,SuperAdmin,AreaMedica,MesaDeApoyo";
    // Preconditions
    /** <code>TCAMBIARESTADOERROR</code> precondition 0 id. */
    public static final String PRE_ID_TCAMBIARESTADOERROR_0 = "Clas_1431957012480960Pre_140_MsgError";
    /** <code>TCAMBIARESTADOERROR</code> precondition 1 id. */
    public static final String PRE_ID_TCAMBIARESTADOERROR_1 = "Clas_1431957012480960Pre_100_MsgError";
    // Inbound arguments
    /** <code>solicitudTCAMBIARESTADOERRORpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARESTADOERROR_SOLICITUDTCAMBIARESTADOERRORPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTCAMBIARESTADOERRORpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARESTADOERROR_SOLICITUDTCAMBIARESTADOERRORPTHISSOLICITUD = "Clas_1431957012480960Ser_111Arg_1_Alias";
    /** <code>solicitudTCAMBIARESTADOERRORpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARESTADOERROR_SOLICITUDTCAMBIARESTADOERRORPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTCAMBIARESTADOERRORptObservaciones</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARESTADOERROR_SOLICITUDTCAMBIARESTADOERRORPTOBSERVACIONES = "ptObservaciones";
    /** <code>solicitudTCAMBIARESTADOERRORptObservaciones</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARESTADOERROR_SOLICITUDTCAMBIARESTADOERRORPTOBSERVACIONES = "Clas_1431957012480960Ser_111Arg_2_Alias";
    /** <code>solicitudTCAMBIARESTADOERRORptObservaciones</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARESTADOERROR_SOLICITUDTCAMBIARESTADOERRORPTOBSERVACIONES = "Observaciones";
    // Service (TCAMBIARESTDEVAREAMED)
    /** <code>TCAMBIARESTDEVAREAMED</code> service id. */
    public static final String SERV_ID_TCAMBIARESTDEVAREAMED = "Clas_1431957012480960Ser_112_Alias";
    /** <code>TCAMBIARESTDEVAREAMED</code> service name. */
    public static final String SERV_NAME_TCAMBIARESTDEVAREAMED = "TCAMBIARESTDEVAREAMED";
    /** <code>TCAMBIARESTDEVAREAMED</code> service alias. */
    public static final String SERV_ALIAS_TCAMBIARESTDEVAREAMED = "Cambiar estado a devuelta área médica";
    /** Agents allowed to execute the service TCAMBIARESTDEVAREAMED **/
    public static final String TCAMBIARESTDEVAREAMED_SRVAGENTS = "Admin,SuperAdmin,AreaMedica,Afiliaciones,MesaDeApoyo";
    // Preconditions
    /** <code>TCAMBIARESTDEVAREAMED</code> precondition 0 id. */
    public static final String PRE_ID_TCAMBIARESTDEVAREAMED_0 = "Clas_1431957012480960Pre_101_MsgError";
    // Inbound arguments
    /** <code>solicitudTCAMBIARESTDEVAREAMEDpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARESTDEVAREAMED_SOLICITUDTCAMBIARESTDEVAREAMEDPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTCAMBIARESTDEVAREAMEDpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARESTDEVAREAMED_SOLICITUDTCAMBIARESTDEVAREAMEDPTHISSOLICITUD = "Clas_1431957012480960Ser_112Arg_1_Alias";
    /** <code>solicitudTCAMBIARESTDEVAREAMEDpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARESTDEVAREAMED_SOLICITUDTCAMBIARESTDEVAREAMEDPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTCAMBIARESTDEVAREAMEDptptObservaciones</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARESTDEVAREAMED_SOLICITUDTCAMBIARESTDEVAREAMEDPTPTOBSERVACIONES = "pt_ptObservaciones";
    /** <code>solicitudTCAMBIARESTDEVAREAMEDptptObservaciones</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARESTDEVAREAMED_SOLICITUDTCAMBIARESTDEVAREAMEDPTPTOBSERVACIONES = "Clas_1431957012480960Ser_112Arg_3_Alias";
    /** <code>solicitudTCAMBIARESTDEVAREAMEDptptObservaciones</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARESTDEVAREAMED_SOLICITUDTCAMBIARESTDEVAREAMEDPTPTOBSERVACIONES = "Observaciones";
    /** <code>solicitudTCAMBIARESTDEVAREAMEDptMotivo</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARESTDEVAREAMED_SOLICITUDTCAMBIARESTDEVAREAMEDPTMOTIVO = "ptMotivo";
    /** <code>solicitudTCAMBIARESTDEVAREAMEDptMotivo</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARESTDEVAREAMED_SOLICITUDTCAMBIARESTDEVAREAMEDPTMOTIVO = "Clas_1431957012480960Ser_112Arg_4_Alias";
    /** <code>solicitudTCAMBIARESTDEVAREAMEDptMotivo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARESTDEVAREAMED_SOLICITUDTCAMBIARESTDEVAREAMEDPTMOTIVO = "Motivo devolución";
    // Outbound arguments
    /** <code>solicitudTCAMBIARESTDEVAREAMEDoaPlantilla</code> outbound argument name. */
    public static final String ARG_NAME_TCAMBIARESTDEVAREAMED_SOLICITUDTCAMBIARESTDEVAREAMEDOAPLANTILLA = "solicitudTCAMBIARESTDEVAREAMEDoaPlantilla";
    /** <code>solicitudTCAMBIARESTDEVAREAMEDoaPlantilla</code> outbound argument id. */
    public static final String ARG_ID_TCAMBIARESTDEVAREAMED_SOLICITUDTCAMBIARESTDEVAREAMEDOAPLANTILLA = "Clas_1431957012480960Ser_112Arg_5_Alias";
    /** <code>solicitudTCAMBIARESTDEVAREAMEDoaPlantilla</code> outbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARESTDEVAREAMED_SOLICITUDTCAMBIARESTDEVAREAMEDOAPLANTILLA = "Plantilla email";
    // Service (TCAMBIARESTPENDMEDICO)
    /** <code>TCAMBIARESTPENDMEDICO</code> service id. */
    public static final String SERV_ID_TCAMBIARESTPENDMEDICO = "Clas_1431957012480960Ser_115_Alias";
    /** <code>TCAMBIARESTPENDMEDICO</code> service name. */
    public static final String SERV_NAME_TCAMBIARESTPENDMEDICO = "TCAMBIARESTPENDMEDICO";
    /** <code>TCAMBIARESTPENDMEDICO</code> service alias. */
    public static final String SERV_ALIAS_TCAMBIARESTPENDMEDICO = "Cambiar estado a pendiente médico";
    /** Agents allowed to execute the service TCAMBIARESTPENDMEDICO **/
    public static final String TCAMBIARESTPENDMEDICO_SRVAGENTS = "Admin,SuperAdmin,AreaMedica,Afiliaciones,MesaDeApoyo";
    // Preconditions
    /** <code>TCAMBIARESTPENDMEDICO</code> precondition 0 id. */
    public static final String PRE_ID_TCAMBIARESTPENDMEDICO_0 = "Clas_1431957012480960Pre_102_MsgError";
    // Inbound arguments
    /** <code>solicitudTCAMBIARESTPENDMEDICOpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARESTPENDMEDICO_SOLICITUDTCAMBIARESTPENDMEDICOPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTCAMBIARESTPENDMEDICOpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARESTPENDMEDICO_SOLICITUDTCAMBIARESTPENDMEDICOPTHISSOLICITUD = "Clas_1431957012480960Ser_115Arg_1_Alias";
    /** <code>solicitudTCAMBIARESTPENDMEDICOpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARESTPENDMEDICO_SOLICITUDTCAMBIARESTPENDMEDICOPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTCAMBIARESTPENDMEDICOptptObservaciones</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARESTPENDMEDICO_SOLICITUDTCAMBIARESTPENDMEDICOPTPTOBSERVACIONES = "pt_ptObservaciones";
    /** <code>solicitudTCAMBIARESTPENDMEDICOptptObservaciones</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARESTPENDMEDICO_SOLICITUDTCAMBIARESTPENDMEDICOPTPTOBSERVACIONES = "Clas_1431957012480960Ser_115Arg_2_Alias";
    /** <code>solicitudTCAMBIARESTPENDMEDICOptptObservaciones</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARESTPENDMEDICO_SOLICITUDTCAMBIARESTPENDMEDICOPTPTOBSERVACIONES = "Observaciones";
    // Service (TMODENCABEZADO)
    /** <code>TMODENCABEZADO</code> service id. */
    public static final String SERV_ID_TMODENCABEZADO = "Clas_1431957012480960Ser_117_Alias";
    /** <code>TMODENCABEZADO</code> service name. */
    public static final String SERV_NAME_TMODENCABEZADO = "TMODENCABEZADO";
    /** <code>TMODENCABEZADO</code> service alias. */
    public static final String SERV_ALIAS_TMODENCABEZADO = "Modificar encabezado";
    /** Agents allowed to execute the service TMODENCABEZADO **/
    public static final String TMODENCABEZADO_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Preconditions
    /** <code>TMODENCABEZADO</code> precondition 0 id. */
    public static final String PRE_ID_TMODENCABEZADO_0 = "Clas_1431957012480960Pre_115_MsgError";
    // Inbound arguments
    /** <code>solicitudTMODENCABEZADOpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TMODENCABEZADO_SOLICITUDTMODENCABEZADOPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTMODENCABEZADOpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TMODENCABEZADO_SOLICITUDTMODENCABEZADOPTHISSOLICITUD = "Clas_1431957012480960Ser_117Arg_1_Alias";
    /** <code>solicitudTMODENCABEZADOpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODENCABEZADO_SOLICITUDTMODENCABEZADOPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTMODENCABEZADOptptFecha</code> inbound argument name. */
    public static final String ARG_NAME_TMODENCABEZADO_SOLICITUDTMODENCABEZADOPTPTFECHA = "pt_ptFecha";
    /** <code>solicitudTMODENCABEZADOptptFecha</code> inbound argument id. */
    public static final String ARG_ID_TMODENCABEZADO_SOLICITUDTMODENCABEZADOPTPTFECHA = "Clas_1431957012480960Ser_117Arg_2_Alias";
    /** <code>solicitudTMODENCABEZADOptptFecha</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODENCABEZADO_SOLICITUDTMODENCABEZADOPTPTFECHA = "Fecha inicio contratación";
    /** <code>solicitudTMODENCABEZADOptGrupoAsociado</code> inbound argument name. */
    public static final String ARG_NAME_TMODENCABEZADO_SOLICITUDTMODENCABEZADOPTGRUPOASOCIADO = "ptGrupoAsociado";
    /** <code>solicitudTMODENCABEZADOptGrupoAsociado</code> inbound argument id. */
    public static final String ARG_ID_TMODENCABEZADO_SOLICITUDTMODENCABEZADOPTGRUPOASOCIADO = "Clas_1431957012480960Ser_117Arg_3_Alias";
    /** <code>solicitudTMODENCABEZADOptGrupoAsociado</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODENCABEZADO_SOLICITUDTMODENCABEZADOPTGRUPOASOCIADO = "Grupo asociado";
    /** <code>solicitudTMODENCABEZADOptProrrateo</code> inbound argument name. */
    public static final String ARG_NAME_TMODENCABEZADO_SOLICITUDTMODENCABEZADOPTPRORRATEO = "ptProrrateo";
    /** <code>solicitudTMODENCABEZADOptProrrateo</code> inbound argument id. */
    public static final String ARG_ID_TMODENCABEZADO_SOLICITUDTMODENCABEZADOPTPRORRATEO = "Clas_1431957012480960Ser_117Arg_4_Alias";
    /** <code>solicitudTMODENCABEZADOptProrrateo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODENCABEZADO_SOLICITUDTMODENCABEZADOPTPRORRATEO = "Porcentaje prorrateo";
    /** <code>solicitudTMODENCABEZADOptTipoFactura</code> inbound argument name. */
    public static final String ARG_NAME_TMODENCABEZADO_SOLICITUDTMODENCABEZADOPTTIPOFACTURA = "ptTipoFactura";
    /** <code>solicitudTMODENCABEZADOptTipoFactura</code> inbound argument id. */
    public static final String ARG_ID_TMODENCABEZADO_SOLICITUDTMODENCABEZADOPTTIPOFACTURA = "Clas_1431957012480960Ser_117Arg_5_Alias";
    /** <code>solicitudTMODENCABEZADOptTipoFactura</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODENCABEZADO_SOLICITUDTMODENCABEZADOPTTIPOFACTURA = "Tipo Factura";
    /** <code>solicitudTMODENCABEZADOptSoloDiaUno</code> inbound argument name. */
    public static final String ARG_NAME_TMODENCABEZADO_SOLICITUDTMODENCABEZADOPTSOLODIAUNO = "ptSoloDiaUno";
    /** <code>solicitudTMODENCABEZADOptSoloDiaUno</code> inbound argument id. */
    public static final String ARG_ID_TMODENCABEZADO_SOLICITUDTMODENCABEZADOPTSOLODIAUNO = "Clas_1431957012480960Ser_117Arg_6_Alias";
    /** <code>solicitudTMODENCABEZADOptSoloDiaUno</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODENCABEZADO_SOLICITUDTMODENCABEZADOPTSOLODIAUNO = "Solo dia uno";
    // Service (TCAMBIARESTANULADO)
    /** <code>TCAMBIARESTANULADO</code> service id. */
    public static final String SERV_ID_TCAMBIARESTANULADO = "Clas_1431957012480960Ser_118_Alias";
    /** <code>TCAMBIARESTANULADO</code> service name. */
    public static final String SERV_NAME_TCAMBIARESTANULADO = "TCAMBIARESTANULADO";
    /** <code>TCAMBIARESTANULADO</code> service alias. */
    public static final String SERV_ALIAS_TCAMBIARESTANULADO = "Cambiar estado a anulada";
    /** Agents allowed to execute the service TCAMBIARESTANULADO **/
    public static final String TCAMBIARESTANULADO_SRVAGENTS = "Admin,SuperAdmin,Afiliaciones,MesaDeApoyo";
    // Preconditions
    /** <code>TCAMBIARESTANULADO</code> precondition 0 id. */
    public static final String PRE_ID_TCAMBIARESTANULADO_0 = "Clas_1431957012480960Pre_141_MsgError";
    // Inbound arguments
    /** <code>solicitudTCAMBIARESTANULADOpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARESTANULADO_SOLICITUDTCAMBIARESTANULADOPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTCAMBIARESTANULADOpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARESTANULADO_SOLICITUDTCAMBIARESTANULADOPTHISSOLICITUD = "Clas_1431957012480960Ser_118Arg_1_Alias";
    /** <code>solicitudTCAMBIARESTANULADOpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARESTANULADO_SOLICITUDTCAMBIARESTANULADOPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTCAMBIARESTANULADOptObservaciones</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARESTANULADO_SOLICITUDTCAMBIARESTANULADOPTOBSERVACIONES = "ptObservaciones";
    /** <code>solicitudTCAMBIARESTANULADOptObservaciones</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARESTANULADO_SOLICITUDTCAMBIARESTANULADOPTOBSERVACIONES = "Clas_1431957012480960Ser_118Arg_2_Alias";
    /** <code>solicitudTCAMBIARESTANULADOptObservaciones</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARESTANULADO_SOLICITUDTCAMBIARESTANULADOPTOBSERVACIONES = "Observaciones";
    // Service (TASGUSRAFILI)
    /** <code>TASGUSRAFILI</code> service id. */
    public static final String SERV_ID_TASGUSRAFILI = "Clas_1431957012480960Ser_123_Alias";
    /** <code>TASGUSRAFILI</code> service name. */
    public static final String SERV_NAME_TASGUSRAFILI = "TASGUSRAFILI";
    /** <code>TASGUSRAFILI</code> service alias. */
    public static final String SERV_ALIAS_TASGUSRAFILI = "Asignar Afiliación";
    /** Agents allowed to execute the service TASGUSRAFILI **/
    public static final String TASGUSRAFILI_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudTASGUSRAFILIpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TASGUSRAFILI_SOLICITUDTASGUSRAFILIPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTASGUSRAFILIpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TASGUSRAFILI_SOLICITUDTASGUSRAFILIPTHISSOLICITUD = "Clas_1431957012480960Ser_123Arg_1_Alias";
    /** <code>solicitudTASGUSRAFILIpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TASGUSRAFILI_SOLICITUDTASGUSRAFILIPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTASGUSRAFILIptAfiliacion</code> inbound argument name. */
    public static final String ARG_NAME_TASGUSRAFILI_SOLICITUDTASGUSRAFILIPTAFILIACION = "ptAfiliacion";
    /** <code>solicitudTASGUSRAFILIptAfiliacion</code> inbound argument id. */
    public static final String ARG_ID_TASGUSRAFILI_SOLICITUDTASGUSRAFILIPTAFILIACION = "Clas_1431957012480960Ser_123Arg_2_Alias";
    /** <code>solicitudTASGUSRAFILIptAfiliacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TASGUSRAFILI_SOLICITUDTASGUSRAFILIPTAFILIACION = "Funcionario";
    // Service (TASGUSRARME)
    /** <code>TASGUSRARME</code> service id. */
    public static final String SERV_ID_TASGUSRARME = "Clas_1431957012480960Ser_124_Alias";
    /** <code>TASGUSRARME</code> service name. */
    public static final String SERV_NAME_TASGUSRARME = "TASGUSRARME";
    /** <code>TASGUSRARME</code> service alias. */
    public static final String SERV_ALIAS_TASGUSRARME = "Asignar Area Médica";
    /** Agents allowed to execute the service TASGUSRARME **/
    public static final String TASGUSRARME_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudTASGUSRARMEpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TASGUSRARME_SOLICITUDTASGUSRARMEPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTASGUSRARMEpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TASGUSRARME_SOLICITUDTASGUSRARMEPTHISSOLICITUD = "Clas_1431957012480960Ser_124Arg_1_Alias";
    /** <code>solicitudTASGUSRARMEpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TASGUSRARME_SOLICITUDTASGUSRARMEPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTASGUSRARMEptAreaMedica</code> inbound argument name. */
    public static final String ARG_NAME_TASGUSRARME_SOLICITUDTASGUSRARMEPTAREAMEDICA = "ptAreaMedica";
    /** <code>solicitudTASGUSRARMEptAreaMedica</code> inbound argument id. */
    public static final String ARG_ID_TASGUSRARME_SOLICITUDTASGUSRARMEPTAREAMEDICA = "Clas_1431957012480960Ser_124Arg_2_Alias";
    /** <code>solicitudTASGUSRARMEptAreaMedica</code> inbound argument alias. */
    public static final String ARG_ALIAS_TASGUSRARME_SOLICITUDTASGUSRARMEPTAREAMEDICA = "Funcionario";
    // Service (TDASGUSRAFILI)
    /** <code>TDASGUSRAFILI</code> service id. */
    public static final String SERV_ID_TDASGUSRAFILI = "Clas_1431957012480960Ser_125_Alias";
    /** <code>TDASGUSRAFILI</code> service name. */
    public static final String SERV_NAME_TDASGUSRAFILI = "TDASGUSRAFILI";
    /** <code>TDASGUSRAFILI</code> service alias. */
    public static final String SERV_ALIAS_TDASGUSRAFILI = "Desasociar Afiliación";
    /** Agents allowed to execute the service TDASGUSRAFILI **/
    public static final String TDASGUSRAFILI_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudTDASGUSRAFILIpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TDASGUSRAFILI_SOLICITUDTDASGUSRAFILIPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTDASGUSRAFILIpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TDASGUSRAFILI_SOLICITUDTDASGUSRAFILIPTHISSOLICITUD = "Clas_1431957012480960Ser_125Arg_1_Alias";
    /** <code>solicitudTDASGUSRAFILIpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TDASGUSRAFILI_SOLICITUDTDASGUSRAFILIPTHISSOLICITUD = "Solicitud";
    // Service (TDASGUSRARME)
    /** <code>TDASGUSRARME</code> service id. */
    public static final String SERV_ID_TDASGUSRARME = "Clas_1431957012480960Ser_126_Alias";
    /** <code>TDASGUSRARME</code> service name. */
    public static final String SERV_NAME_TDASGUSRARME = "TDASGUSRARME";
    /** <code>TDASGUSRARME</code> service alias. */
    public static final String SERV_ALIAS_TDASGUSRARME = "Desasociar Area Médica";
    /** Agents allowed to execute the service TDASGUSRARME **/
    public static final String TDASGUSRARME_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudTDASGUSRARMEpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TDASGUSRARME_SOLICITUDTDASGUSRARMEPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTDASGUSRARMEpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TDASGUSRARME_SOLICITUDTDASGUSRARMEPTHISSOLICITUD = "Clas_1431957012480960Ser_126Arg_1_Alias";
    /** <code>solicitudTDASGUSRARMEpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TDASGUSRARME_SOLICITUDTDASGUSRARMEPTHISSOLICITUD = "Solicitud";
    // Service (TANULARAUTO)
    /** <code>TANULARAUTO</code> service id. */
    public static final String SERV_ID_TANULARAUTO = "Clas_1431957012480960Ser_131_Alias";
    /** <code>TANULARAUTO</code> service name. */
    public static final String SERV_NAME_TANULARAUTO = "TANULARAUTO";
    /** <code>TANULARAUTO</code> service alias. */
    public static final String SERV_ALIAS_TANULARAUTO = "Anulacion automática";
    /** Agents allowed to execute the service TANULARAUTO **/
    public static final String TANULARAUTO_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>solicitudTANULARAUTOpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TANULARAUTO_SOLICITUDTANULARAUTOPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTANULARAUTOpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TANULARAUTO_SOLICITUDTANULARAUTOPTHISSOLICITUD = "Clas_1431957012480960Ser_131Arg_1_Alias";
    /** <code>solicitudTANULARAUTOpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TANULARAUTO_SOLICITUDTANULARAUTOPTHISSOLICITUD = "Solicitud";
    // Service (TMODDIRSCONTRATANTE)
    /** <code>TMODDIRSCONTRATANTE</code> service id. */
    public static final String SERV_ID_TMODDIRSCONTRATANTE = "Clas_1431957012480960Ser_133_Alias";
    /** <code>TMODDIRSCONTRATANTE</code> service name. */
    public static final String SERV_NAME_TMODDIRSCONTRATANTE = "TMODDIRSCONTRATANTE";
    /** <code>TMODDIRSCONTRATANTE</code> service alias. */
    public static final String SERV_ALIAS_TMODDIRSCONTRATANTE = "Modificar direcciones";
    /** Agents allowed to execute the service TMODDIRSCONTRATANTE **/
    public static final String TMODDIRSCONTRATANTE_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Preconditions
    /** <code>TMODDIRSCONTRATANTE</code> precondition 0 id. */
    public static final String PRE_ID_TMODDIRSCONTRATANTE_0 = "Clas_1431957012480960Pre_118_MsgError";
    // Inbound arguments
    /** <code>solicitudTMODDIRSCONTRATANTEpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTMODDIRSCONTRATANTEpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTHISSOLICITUD = "Clas_1431957012480960Ser_133Arg_1_Alias";
    /** <code>solicitudTMODDIRSCONTRATANTEpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTMODDIRSCONTRATANTEptpTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPTELEFONOFIJO = "pt_p_TelefonoFijo";
    /** <code>solicitudTMODDIRSCONTRATANTEptpTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPTELEFONOFIJO = "Clas_1431957012480960Ser_133Arg_9_Alias";
    /** <code>solicitudTMODDIRSCONTRATANTEptpTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPTELEFONOFIJO = "Teléfono fijo";
    /** <code>solicitudTMODDIRSCONTRATANTEptpTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPTELEFONOCELULAR = "pt_p_TelefonoCelular";
    /** <code>solicitudTMODDIRSCONTRATANTEptpTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPTELEFONOCELULAR = "Clas_1431957012480960Ser_133Arg_10_Alias";
    /** <code>solicitudTMODDIRSCONTRATANTEptpTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPTELEFONOCELULAR = "Teléfono celular";
    /** <code>solicitudTMODDIRSCONTRATANTEptpDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPDIRECCIONCOMPLETA = "pt_p_DireccionCompleta";
    /** <code>solicitudTMODDIRSCONTRATANTEptpDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPDIRECCIONCOMPLETA = "Clas_1431957012480960Ser_133Arg_15_Alias";
    /** <code>solicitudTMODDIRSCONTRATANTEptpDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>solicitudTMODDIRSCONTRATANTEptpRural</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPRURAL = "pt_p_Rural";
    /** <code>solicitudTMODDIRSCONTRATANTEptpRural</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPRURAL = "Clas_1431957012480960Ser_133Arg_16_Alias";
    /** <code>solicitudTMODDIRSCONTRATANTEptpRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPRURAL = "Rural";
    /** <code>solicitudTMODDIRSCONTRATANTEptpevcDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPEVCDEPARTAMENTO = "pt_p_evcDepartamento";
    /** <code>solicitudTMODDIRSCONTRATANTEptpevcDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPEVCDEPARTAMENTO = "Clas_1431957012480960Ser_133Arg_17_Alias";
    /** <code>solicitudTMODDIRSCONTRATANTEptpevcDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPEVCDEPARTAMENTO = "Departamento";
    /** <code>solicitudTMODDIRSCONTRATANTEptpevcMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPEVCMUNICIPIO = "pt_p_evcMunicipio";
    /** <code>solicitudTMODDIRSCONTRATANTEptpevcMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPEVCMUNICIPIO = "Clas_1431957012480960Ser_133Arg_18_Alias";
    /** <code>solicitudTMODDIRSCONTRATANTEptpevcMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPEVCMUNICIPIO = "Municipio";
    /** <code>solicitudTMODDIRSCONTRATANTEptpDCDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPDCDIRECCIONCOMPLETA = "pt_pDCDireccionCompleta";
    /** <code>solicitudTMODDIRSCONTRATANTEptpDCDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPDCDIRECCIONCOMPLETA = "Clas_1431957012480960Ser_133Arg_22_Alias";
    /** <code>solicitudTMODDIRSCONTRATANTEptpDCDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPDCDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>solicitudTMODDIRSCONTRATANTEptpDCDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPDCDEPARTAMENTO = "pt_pDCDepartamento";
    /** <code>solicitudTMODDIRSCONTRATANTEptpDCDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPDCDEPARTAMENTO = "Clas_1431957012480960Ser_133Arg_23_Alias";
    /** <code>solicitudTMODDIRSCONTRATANTEptpDCDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPDCDEPARTAMENTO = "Departamento";
    /** <code>solicitudTMODDIRSCONTRATANTEptpDCMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPDCMUNICIPIO = "pt_pDCMunicipio";
    /** <code>solicitudTMODDIRSCONTRATANTEptpDCMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPDCMUNICIPIO = "Clas_1431957012480960Ser_133Arg_24_Alias";
    /** <code>solicitudTMODDIRSCONTRATANTEptpDCMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPDCMUNICIPIO = "Municipio";
    /** <code>solicitudTMODDIRSCONTRATANTEptpDCRural</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPDCRURAL = "pt_pDCRural";
    /** <code>solicitudTMODDIRSCONTRATANTEptpDCRural</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPDCRURAL = "Clas_1431957012480960Ser_133Arg_25_Alias";
    /** <code>solicitudTMODDIRSCONTRATANTEptpDCRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPDCRURAL = "Rural";
    /** <code>solicitudTMODDIRSCONTRATANTEptpDCTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPDCTELEFONOFIJO = "pt_pDCTelefonoFijo";
    /** <code>solicitudTMODDIRSCONTRATANTEptpDCTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPDCTELEFONOFIJO = "Clas_1431957012480960Ser_133Arg_26_Alias";
    /** <code>solicitudTMODDIRSCONTRATANTEptpDCTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPDCTELEFONOFIJO = "Teléfono fijo";
    /** <code>solicitudTMODDIRSCONTRATANTEptpDCTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPDCTELEFONOCELULAR = "pt_pDCTelefonoCelular";
    /** <code>solicitudTMODDIRSCONTRATANTEptpDCTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPDCTELEFONOCELULAR = "Clas_1431957012480960Ser_133Arg_27_Alias";
    /** <code>solicitudTMODDIRSCONTRATANTEptpDCTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPDCTELEFONOCELULAR = "Teléfono celular";
    /** <code>solicitudTMODDIRSCONTRATANTEptpPais</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPPAIS = "pt_p_Pais";
    /** <code>solicitudTMODDIRSCONTRATANTEptpPais</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPPAIS = "Clas_1431957012480960Ser_133Arg_28_Alias";
    /** <code>solicitudTMODDIRSCONTRATANTEptpPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTPPAIS = "País";
    /** <code>solicitudTMODDIRSCONTRATANTEpDCPais</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPDCPAIS = "pDCPais";
    /** <code>solicitudTMODDIRSCONTRATANTEpDCPais</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPDCPAIS = "Clas_1431957012480960Ser_133Arg_32_Alias";
    /** <code>solicitudTMODDIRSCONTRATANTEpDCPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPDCPAIS = "País";
    /** <code>solicitudTMODDIRSCONTRATANTEptReplicarDireccion</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTREPLICARDIRECCION = "ptReplicarDireccion";
    /** <code>solicitudTMODDIRSCONTRATANTEptReplicarDireccion</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTREPLICARDIRECCION = "Clas_1431957012480960Ser_133Arg_36_Alias";
    /** <code>solicitudTMODDIRSCONTRATANTEptReplicarDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSCONTRATANTE_SOLICITUDTMODDIRSCONTRATANTEPTREPLICARDIRECCION = "Replicar";
    // Service (TMODDIRSTITULAR)
    /** <code>TMODDIRSTITULAR</code> service id. */
    public static final String SERV_ID_TMODDIRSTITULAR = "Clas_1431957012480960Ser_134_Alias";
    /** <code>TMODDIRSTITULAR</code> service name. */
    public static final String SERV_NAME_TMODDIRSTITULAR = "TMODDIRSTITULAR";
    /** <code>TMODDIRSTITULAR</code> service alias. */
    public static final String SERV_ALIAS_TMODDIRSTITULAR = "Modificar direcciones";
    /** Agents allowed to execute the service TMODDIRSTITULAR **/
    public static final String TMODDIRSTITULAR_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Preconditions
    /** <code>TMODDIRSTITULAR</code> precondition 0 id. */
    public static final String PRE_ID_TMODDIRSTITULAR_0 = "Clas_1431957012480960Pre_121_MsgError";
    // Inbound arguments
    /** <code>solicitudTMODDIRSTITULARpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTMODDIRSTITULARpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTHISSOLICITUD = "Clas_1431957012480960Ser_134Arg_1_Alias";
    /** <code>solicitudTMODDIRSTITULARpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTMODDIRSTITULARptpatrTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTPATRTELEFONOFIJO = "pt_p_atrTelefonoFijo";
    /** <code>solicitudTMODDIRSTITULARptpatrTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTPATRTELEFONOFIJO = "Clas_1431957012480960Ser_134Arg_14_Alias";
    /** <code>solicitudTMODDIRSTITULARptpatrTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTPATRTELEFONOFIJO = "Teléfono fijo";
    /** <code>solicitudTMODDIRSTITULARptpatrTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTPATRTELEFONOCELULAR = "pt_p_atrTelefonoCelular";
    /** <code>solicitudTMODDIRSTITULARptpatrTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTPATRTELEFONOCELULAR = "Clas_1431957012480960Ser_134Arg_15_Alias";
    /** <code>solicitudTMODDIRSTITULARptpatrTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTPATRTELEFONOCELULAR = "Teléfono celular";
    /** <code>solicitudTMODDIRSTITULARptpagrDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTPAGRDEPARTAMENTO = "pt_p_agrDepartamento";
    /** <code>solicitudTMODDIRSTITULARptpagrDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTPAGRDEPARTAMENTO = "Clas_1431957012480960Ser_134Arg_17_Alias";
    /** <code>solicitudTMODDIRSTITULARptpagrDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTPAGRDEPARTAMENTO = "Departamento";
    /** <code>solicitudTMODDIRSTITULARptpagrMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTPAGRMUNICIPIO = "pt_p_agrMunicipio";
    /** <code>solicitudTMODDIRSTITULARptpagrMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTPAGRMUNICIPIO = "Clas_1431957012480960Ser_134Arg_18_Alias";
    /** <code>solicitudTMODDIRSTITULARptpagrMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTPAGRMUNICIPIO = "Municipio";
    /** <code>solicitudTMODDIRSTITULARptpatrDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTPATRDIRECCIONCOMPLETA = "pt_p_atrDireccionCompleta";
    /** <code>solicitudTMODDIRSTITULARptpatrDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTPATRDIRECCIONCOMPLETA = "Clas_1431957012480960Ser_134Arg_19_Alias";
    /** <code>solicitudTMODDIRSTITULARptpatrDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTPATRDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>solicitudTMODDIRSTITULARptpatrRural</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTPATRRURAL = "pt_p_atrRural";
    /** <code>solicitudTMODDIRSTITULARptpatrRural</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTPATRRURAL = "Clas_1431957012480960Ser_134Arg_20_Alias";
    /** <code>solicitudTMODDIRSTITULARptpatrRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTPATRRURAL = "Rural";
    /** <code>solicitudTMODDIRSTITULARptpagrPais</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTPAGRPAIS = "pt_p_agrPais";
    /** <code>solicitudTMODDIRSTITULARptpagrPais</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTPAGRPAIS = "Clas_1431957012480960Ser_134Arg_21_Alias";
    /** <code>solicitudTMODDIRSTITULARptpagrPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTPAGRPAIS = "País";
    /** <code>solicitudTMODDIRSTITULARptDCDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTDCDEPARTAMENTO = "ptDCDepartamento";
    /** <code>solicitudTMODDIRSTITULARptDCDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTDCDEPARTAMENTO = "Clas_1431957012480960Ser_134Arg_27_Alias";
    /** <code>solicitudTMODDIRSTITULARptDCDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTDCDEPARTAMENTO = "Departamento";
    /** <code>solicitudTMODDIRSTITULARptDCMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTDCMUNICIPIO = "ptDCMunicipio";
    /** <code>solicitudTMODDIRSTITULARptDCMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTDCMUNICIPIO = "Clas_1431957012480960Ser_134Arg_28_Alias";
    /** <code>solicitudTMODDIRSTITULARptDCMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTDCMUNICIPIO = "Municipio";
    /** <code>solicitudTMODDIRSTITULARptDCDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTDCDIRECCIONCOMPLETA = "ptDCDireccionCompleta";
    /** <code>solicitudTMODDIRSTITULARptDCDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTDCDIRECCIONCOMPLETA = "Clas_1431957012480960Ser_134Arg_29_Alias";
    /** <code>solicitudTMODDIRSTITULARptDCDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTDCDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>solicitudTMODDIRSTITULARptDCRural</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTDCRURAL = "ptDCRural";
    /** <code>solicitudTMODDIRSTITULARptDCRural</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTDCRURAL = "Clas_1431957012480960Ser_134Arg_30_Alias";
    /** <code>solicitudTMODDIRSTITULARptDCRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTDCRURAL = "Rural";
    /** <code>solicitudTMODDIRSTITULARptDCTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTDCTELEFONOFIJO = "ptDCTelefonoFijo";
    /** <code>solicitudTMODDIRSTITULARptDCTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTDCTELEFONOFIJO = "Clas_1431957012480960Ser_134Arg_31_Alias";
    /** <code>solicitudTMODDIRSTITULARptDCTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTDCTELEFONOFIJO = "Teléfono fijo";
    /** <code>solicitudTMODDIRSTITULARptDCTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTDCTELEFONOCELULAR = "ptDCTelefonoCelular";
    /** <code>solicitudTMODDIRSTITULARptDCTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTDCTELEFONOCELULAR = "Clas_1431957012480960Ser_134Arg_32_Alias";
    /** <code>solicitudTMODDIRSTITULARptDCTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTDCTELEFONOCELULAR = "Teléfono celular";
    /** <code>solicitudTMODDIRSTITULARptReplicarDir</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTREPLICARDIR = "ptReplicarDir";
    /** <code>solicitudTMODDIRSTITULARptReplicarDir</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTREPLICARDIR = "Clas_1431957012480960Ser_134Arg_33_Alias";
    /** <code>solicitudTMODDIRSTITULARptReplicarDir</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRSTITULAR_SOLICITUDTMODDIRSTITULARPTREPLICARDIR = "Replicar";
    // Service (TMODENCABEZADOINCL)
    /** <code>TMODENCABEZADOINCL</code> service id. */
    public static final String SERV_ID_TMODENCABEZADOINCL = "Clas_1431957012480960Ser_136_Alias";
    /** <code>TMODENCABEZADOINCL</code> service name. */
    public static final String SERV_NAME_TMODENCABEZADOINCL = "TMODENCABEZADOINCL";
    /** <code>TMODENCABEZADOINCL</code> service alias. */
    public static final String SERV_ALIAS_TMODENCABEZADOINCL = "Modificar encabezado";
    /** Agents allowed to execute the service TMODENCABEZADOINCL **/
    public static final String TMODENCABEZADOINCL_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Preconditions
    /** <code>TMODENCABEZADOINCL</code> precondition 0 id. */
    public static final String PRE_ID_TMODENCABEZADOINCL_0 = "Clas_1431957012480960Pre_180_MsgError";
    // Inbound arguments
    /** <code>solicitudTMODENCABEZADOINCLpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TMODENCABEZADOINCL_SOLICITUDTMODENCABEZADOINCLPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTMODENCABEZADOINCLpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TMODENCABEZADOINCL_SOLICITUDTMODENCABEZADOINCLPTHISSOLICITUD = "Clas_1431957012480960Ser_136Arg_1_Alias";
    /** <code>solicitudTMODENCABEZADOINCLpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODENCABEZADOINCL_SOLICITUDTMODENCABEZADOINCLPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTMODENCABEZADOINCLptptFecha</code> inbound argument name. */
    public static final String ARG_NAME_TMODENCABEZADOINCL_SOLICITUDTMODENCABEZADOINCLPTPTFECHA = "pt_ptFecha";
    /** <code>solicitudTMODENCABEZADOINCLptptFecha</code> inbound argument id. */
    public static final String ARG_ID_TMODENCABEZADOINCL_SOLICITUDTMODENCABEZADOINCLPTPTFECHA = "Clas_1431957012480960Ser_136Arg_2_Alias";
    /** <code>solicitudTMODENCABEZADOINCLptptFecha</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODENCABEZADOINCL_SOLICITUDTMODENCABEZADOINCLPTPTFECHA = "Fecha inicio contratación";
    /** <code>solicitudTMODENCABEZADOINCLptGrupoAsociado</code> inbound argument name. */
    public static final String ARG_NAME_TMODENCABEZADOINCL_SOLICITUDTMODENCABEZADOINCLPTGRUPOASOCIADO = "ptGrupoAsociado";
    /** <code>solicitudTMODENCABEZADOINCLptGrupoAsociado</code> inbound argument id. */
    public static final String ARG_ID_TMODENCABEZADOINCL_SOLICITUDTMODENCABEZADOINCLPTGRUPOASOCIADO = "Clas_1431957012480960Ser_136Arg_4_Alias";
    /** <code>solicitudTMODENCABEZADOINCLptGrupoAsociado</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODENCABEZADOINCL_SOLICITUDTMODENCABEZADOINCLPTGRUPOASOCIADO = "Grupo asociado";
    /** <code>solicitudTMODENCABEZADOINCLptSoloDiaUno</code> inbound argument name. */
    public static final String ARG_NAME_TMODENCABEZADOINCL_SOLICITUDTMODENCABEZADOINCLPTSOLODIAUNO = "ptSoloDiaUno";
    /** <code>solicitudTMODENCABEZADOINCLptSoloDiaUno</code> inbound argument id. */
    public static final String ARG_ID_TMODENCABEZADOINCL_SOLICITUDTMODENCABEZADOINCLPTSOLODIAUNO = "Clas_1431957012480960Ser_136Arg_6_Alias";
    /** <code>solicitudTMODENCABEZADOINCLptSoloDiaUno</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODENCABEZADOINCL_SOLICITUDTMODENCABEZADOINCLPTSOLODIAUNO = "Solo dia uno";
    // Service (TCAMBIARESTAPROBMEDICO)
    /** <code>TCAMBIARESTAPROBMEDICO</code> service id. */
    public static final String SERV_ID_TCAMBIARESTAPROBMEDICO = "Clas_1431957012480960Ser_141_Alias";
    /** <code>TCAMBIARESTAPROBMEDICO</code> service name. */
    public static final String SERV_NAME_TCAMBIARESTAPROBMEDICO = "TCAMBIARESTAPROBMEDICO";
    /** <code>TCAMBIARESTAPROBMEDICO</code> service alias. */
    public static final String SERV_ALIAS_TCAMBIARESTAPROBMEDICO = "Cambiar estado aprobado médico";
    /** Agents allowed to execute the service TCAMBIARESTAPROBMEDICO **/
    public static final String TCAMBIARESTAPROBMEDICO_SRVAGENTS = "Admin,SuperAdmin,AreaMedica";
    // Preconditions
    /** <code>TCAMBIARESTAPROBMEDICO</code> precondition 0 id. */
    public static final String PRE_ID_TCAMBIARESTAPROBMEDICO_0 = "Clas_1431957012480960Pre_142_MsgError";
    /** <code>TCAMBIARESTAPROBMEDICO</code> precondition 1 id. */
    public static final String PRE_ID_TCAMBIARESTAPROBMEDICO_1 = "Clas_1431957012480960Pre_129_MsgError";
    // Inbound arguments
    /** <code>solicitudTCAMBIARESTAPROBMEDICOpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARESTAPROBMEDICO_SOLICITUDTCAMBIARESTAPROBMEDICOPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTCAMBIARESTAPROBMEDICOpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARESTAPROBMEDICO_SOLICITUDTCAMBIARESTAPROBMEDICOPTHISSOLICITUD = "Clas_1431957012480960Ser_141Arg_1_Alias";
    /** <code>solicitudTCAMBIARESTAPROBMEDICOpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARESTAPROBMEDICO_SOLICITUDTCAMBIARESTAPROBMEDICOPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTCAMBIARESTAPROBMEDICOptptObservaciones</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARESTAPROBMEDICO_SOLICITUDTCAMBIARESTAPROBMEDICOPTPTOBSERVACIONES = "pt_ptObservaciones";
    /** <code>solicitudTCAMBIARESTAPROBMEDICOptptObservaciones</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARESTAPROBMEDICO_SOLICITUDTCAMBIARESTAPROBMEDICOPTPTOBSERVACIONES = "Clas_1431957012480960Ser_141Arg_2_Alias";
    /** <code>solicitudTCAMBIARESTAPROBMEDICOptptObservaciones</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARESTAPROBMEDICO_SOLICITUDTCAMBIARESTAPROBMEDICOPTPTOBSERVACIONES = "Observaciones";
    // Service (TCAMBIARESTADOADMIN)
    /** <code>TCAMBIARESTADOADMIN</code> service id. */
    public static final String SERV_ID_TCAMBIARESTADOADMIN = "Clas_1431957012480960Ser_142_Alias";
    /** <code>TCAMBIARESTADOADMIN</code> service name. */
    public static final String SERV_NAME_TCAMBIARESTADOADMIN = "TCAMBIARESTADOADMIN";
    /** <code>TCAMBIARESTADOADMIN</code> service alias. */
    public static final String SERV_ALIAS_TCAMBIARESTADOADMIN = "Cambiar estado";
    /** Agents allowed to execute the service TCAMBIARESTADOADMIN **/
    public static final String TCAMBIARESTADOADMIN_SRVAGENTS = "Admin,SuperAdmin,MesaDeApoyo";
    // Inbound arguments
    /** <code>solicitudTCAMBIARESTADOADMINpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARESTADOADMIN_SOLICITUDTCAMBIARESTADOADMINPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTCAMBIARESTADOADMINpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARESTADOADMIN_SOLICITUDTCAMBIARESTADOADMINPTHISSOLICITUD = "Clas_1431957012480960Ser_142Arg_1_Alias";
    /** <code>solicitudTCAMBIARESTADOADMINpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARESTADOADMIN_SOLICITUDTCAMBIARESTADOADMINPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTCAMBIARESTADOADMINptpeEstado</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARESTADOADMIN_SOLICITUDTCAMBIARESTADOADMINPTPEESTADO = "pt_peEstado";
    /** <code>solicitudTCAMBIARESTADOADMINptpeEstado</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARESTADOADMIN_SOLICITUDTCAMBIARESTADOADMINPTPEESTADO = "Clas_1431957012480960Ser_142Arg_2_Alias";
    /** <code>solicitudTCAMBIARESTADOADMINptpeEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARESTADOADMIN_SOLICITUDTCAMBIARESTADOADMINPTPEESTADO = "Estado";
    /** <code>solicitudTCAMBIARESTADOADMINptObservaciones</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARESTADOADMIN_SOLICITUDTCAMBIARESTADOADMINPTOBSERVACIONES = "ptObservaciones";
    /** <code>solicitudTCAMBIARESTADOADMINptObservaciones</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARESTADOADMIN_SOLICITUDTCAMBIARESTADOADMINPTOBSERVACIONES = "Clas_1431957012480960Ser_142Arg_3_Alias";
    /** <code>solicitudTCAMBIARESTADOADMINptObservaciones</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARESTADOADMIN_SOLICITUDTCAMBIARESTADOADMINPTOBSERVACIONES = "Observaciones";
    // Service (TCREAROMODFIRMACONTINC)
    /** <code>TCREAROMODFIRMACONTINC</code> service id. */
    public static final String SERV_ID_TCREAROMODFIRMACONTINC = "Clas_1431957012480960Ser_143_Alias";
    /** <code>TCREAROMODFIRMACONTINC</code> service name. */
    public static final String SERV_NAME_TCREAROMODFIRMACONTINC = "TCREAROMODFIRMACONTINC";
    /** <code>TCREAROMODFIRMACONTINC</code> service alias. */
    public static final String SERV_ALIAS_TCREAROMODFIRMACONTINC = "Firma Contratante";
    /** Agents allowed to execute the service TCREAROMODFIRMACONTINC **/
    public static final String TCREAROMODFIRMACONTINC_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Preconditions
    /** <code>TCREAROMODFIRMACONTINC</code> precondition 0 id. */
    public static final String PRE_ID_TCREAROMODFIRMACONTINC_0 = "Clas_1431957012480960Pre_130_MsgError";
    // Inbound arguments
    /** <code>solicitudTCREAROMODFIRMACONTINCpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODFIRMACONTINC_SOLICITUDTCREAROMODFIRMACONTINCPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTCREAROMODFIRMACONTINCpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODFIRMACONTINC_SOLICITUDTCREAROMODFIRMACONTINCPTHISSOLICITUD = "Clas_1431957012480960Ser_143Arg_1_Alias";
    /** <code>solicitudTCREAROMODFIRMACONTINCpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODFIRMACONTINC_SOLICITUDTCREAROMODFIRMACONTINCPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTCREAROMODFIRMACONTINCptpatrImagenFirma</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODFIRMACONTINC_SOLICITUDTCREAROMODFIRMACONTINCPTPATRIMAGENFIRMA = "pt_p_atrImagenFirma";
    /** <code>solicitudTCREAROMODFIRMACONTINCptpatrImagenFirma</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODFIRMACONTINC_SOLICITUDTCREAROMODFIRMACONTINCPTPATRIMAGENFIRMA = "Clas_1431957012480960Ser_143Arg_2_Alias";
    /** <code>solicitudTCREAROMODFIRMACONTINCptpatrImagenFirma</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODFIRMACONTINC_SOLICITUDTCREAROMODFIRMACONTINCPTPATRIMAGENFIRMA = "Firma";
    /** <code>solicitudTCREAROMODFIRMACONTINCptpatrLatitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODFIRMACONTINC_SOLICITUDTCREAROMODFIRMACONTINCPTPATRLATITUD = "pt_p_atrLatitud";
    /** <code>solicitudTCREAROMODFIRMACONTINCptpatrLatitud</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODFIRMACONTINC_SOLICITUDTCREAROMODFIRMACONTINCPTPATRLATITUD = "Clas_1431957012480960Ser_143Arg_3_Alias";
    /** <code>solicitudTCREAROMODFIRMACONTINCptpatrLatitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODFIRMACONTINC_SOLICITUDTCREAROMODFIRMACONTINCPTPATRLATITUD = "Latitud";
    /** <code>solicitudTCREAROMODFIRMACONTINCptpatrLongitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODFIRMACONTINC_SOLICITUDTCREAROMODFIRMACONTINCPTPATRLONGITUD = "pt_p_atrLongitud";
    /** <code>solicitudTCREAROMODFIRMACONTINCptpatrLongitud</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODFIRMACONTINC_SOLICITUDTCREAROMODFIRMACONTINCPTPATRLONGITUD = "Clas_1431957012480960Ser_143Arg_4_Alias";
    /** <code>solicitudTCREAROMODFIRMACONTINCptpatrLongitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODFIRMACONTINC_SOLICITUDTCREAROMODFIRMACONTINCPTPATRLONGITUD = "Longitud";
    /** <code>solicitudTCREAROMODFIRMACONTINCptTexto</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODFIRMACONTINC_SOLICITUDTCREAROMODFIRMACONTINCPTTEXTO = "pt_Texto";
    /** <code>solicitudTCREAROMODFIRMACONTINCptTexto</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODFIRMACONTINC_SOLICITUDTCREAROMODFIRMACONTINCPTTEXTO = "Clas_1431957012480960Ser_143Arg_5_Alias";
    /** <code>solicitudTCREAROMODFIRMACONTINCptTexto</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODFIRMACONTINC_SOLICITUDTCREAROMODFIRMACONTINCPTTEXTO = "Aviso";
    // Service (TPOSTGENERAREXITO)
    /** <code>TPOSTGENERAREXITO</code> service id. */
    public static final String SERV_ID_TPOSTGENERAREXITO = "Clas_1431957012480960Ser_145_Alias";
    /** <code>TPOSTGENERAREXITO</code> service name. */
    public static final String SERV_NAME_TPOSTGENERAREXITO = "TPOSTGENERAREXITO";
    /** <code>TPOSTGENERAREXITO</code> service alias. */
    public static final String SERV_ALIAS_TPOSTGENERAREXITO = "TPOSTGENERAREXITO";
    /** Agents allowed to execute the service TPOSTGENERAREXITO **/
    public static final String TPOSTGENERAREXITO_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    // Inbound arguments
    /** <code>solicitudTPOSTGENERAREXITOpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TPOSTGENERAREXITO_SOLICITUDTPOSTGENERAREXITOPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTPOSTGENERAREXITOpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TPOSTGENERAREXITO_SOLICITUDTPOSTGENERAREXITOPTHISSOLICITUD = "Clas_1431957012480960Ser_145Arg_1_Alias";
    /** <code>solicitudTPOSTGENERAREXITOpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TPOSTGENERAREXITO_SOLICITUDTPOSTGENERAREXITOPTHISSOLICITUD = "Solicitud";
    // Service (TQUITARTITULAR)
    /** <code>TQUITARTITULAR</code> service id. */
    public static final String SERV_ID_TQUITARTITULAR = "Clas_1431957012480960Ser_147_Alias";
    /** <code>TQUITARTITULAR</code> service name. */
    public static final String SERV_NAME_TQUITARTITULAR = "TQUITARTITULAR";
    /** <code>TQUITARTITULAR</code> service alias. */
    public static final String SERV_ALIAS_TQUITARTITULAR = "TQUITARTITULAR";
    /** Agents allowed to execute the service TQUITARTITULAR **/
    public static final String TQUITARTITULAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudTQUITARTITULARpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TQUITARTITULAR_SOLICITUDTQUITARTITULARPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTQUITARTITULARpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TQUITARTITULAR_SOLICITUDTQUITARTITULARPTHISSOLICITUD = "Clas_1431957012480960Ser_147Arg_1_Alias";
    /** <code>solicitudTQUITARTITULARpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TQUITARTITULAR_SOLICITUDTQUITARTITULARPTHISSOLICITUD = "Solicitud";
    // Service (TADDTITULARUSUARIO)
    /** <code>TADDTITULARUSUARIO</code> service id. */
    public static final String SERV_ID_TADDTITULARUSUARIO = "Clas_1431957012480960Ser_148_Alias";
    /** <code>TADDTITULARUSUARIO</code> service name. */
    public static final String SERV_NAME_TADDTITULARUSUARIO = "TADDTITULARUSUARIO";
    /** <code>TADDTITULARUSUARIO</code> service alias. */
    public static final String SERV_ALIAS_TADDTITULARUSUARIO = "TADDTITULARUSUARIO";
    /** Agents allowed to execute the service TADDTITULARUSUARIO **/
    public static final String TADDTITULARUSUARIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudTADDTITULARUSUARIOpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TADDTITULARUSUARIO_SOLICITUDTADDTITULARUSUARIOPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTADDTITULARUSUARIOpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TADDTITULARUSUARIO_SOLICITUDTADDTITULARUSUARIOPTHISSOLICITUD = "Clas_1431957012480960Ser_148Arg_1_Alias";
    /** <code>solicitudTADDTITULARUSUARIOpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDTITULARUSUARIO_SOLICITUDTADDTITULARUSUARIOPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTADDTITULARUSUARIOptPersona</code> inbound argument name. */
    public static final String ARG_NAME_TADDTITULARUSUARIO_SOLICITUDTADDTITULARUSUARIOPTPERSONA = "ptPersona";
    /** <code>solicitudTADDTITULARUSUARIOptPersona</code> inbound argument id. */
    public static final String ARG_ID_TADDTITULARUSUARIO_SOLICITUDTADDTITULARUSUARIOPTPERSONA = "Clas_1431957012480960Ser_148Arg_2_Alias";
    /** <code>solicitudTADDTITULARUSUARIOptPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDTITULARUSUARIO_SOLICITUDTADDTITULARUSUARIOPTPERSONA = "Persona";
    // Service (TASGAUTOUSRAFILI)
    /** <code>TASGAUTOUSRAFILI</code> service id. */
    public static final String SERV_ID_TASGAUTOUSRAFILI = "Clas_1431957012480960Ser_156_Alias";
    /** <code>TASGAUTOUSRAFILI</code> service name. */
    public static final String SERV_NAME_TASGAUTOUSRAFILI = "TASGAUTOUSRAFILI";
    /** <code>TASGAUTOUSRAFILI</code> service alias. */
    public static final String SERV_ALIAS_TASGAUTOUSRAFILI = "TASGAUTOUSRAFILI";
    /** Agents allowed to execute the service TASGAUTOUSRAFILI **/
    public static final String TASGAUTOUSRAFILI_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudTASGAUTOUSRAFILIpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TASGAUTOUSRAFILI_SOLICITUDTASGAUTOUSRAFILIPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTASGAUTOUSRAFILIpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TASGAUTOUSRAFILI_SOLICITUDTASGAUTOUSRAFILIPTHISSOLICITUD = "Clas_1431957012480960Ser_156Arg_1_Alias";
    /** <code>solicitudTASGAUTOUSRAFILIpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TASGAUTOUSRAFILI_SOLICITUDTASGAUTOUSRAFILIPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTASGAUTOUSRAFILIptFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_TASGAUTOUSRAFILI_SOLICITUDTASGAUTOUSRAFILIPTFUNCIONARIO = "ptFuncionario";
    /** <code>solicitudTASGAUTOUSRAFILIptFuncionario</code> inbound argument id. */
    public static final String ARG_ID_TASGAUTOUSRAFILI_SOLICITUDTASGAUTOUSRAFILIPTFUNCIONARIO = "Clas_1431957012480960Ser_156Arg_2_Alias";
    /** <code>solicitudTASGAUTOUSRAFILIptFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TASGAUTOUSRAFILI_SOLICITUDTASGAUTOUSRAFILIPTFUNCIONARIO = "Usuario";
    // Service (TASGAUTOUSRMEDICO)
    /** <code>TASGAUTOUSRMEDICO</code> service id. */
    public static final String SERV_ID_TASGAUTOUSRMEDICO = "Clas_1431957012480960Ser_157_Alias";
    /** <code>TASGAUTOUSRMEDICO</code> service name. */
    public static final String SERV_NAME_TASGAUTOUSRMEDICO = "TASGAUTOUSRMEDICO";
    /** <code>TASGAUTOUSRMEDICO</code> service alias. */
    public static final String SERV_ALIAS_TASGAUTOUSRMEDICO = "TASGAUTOUSRMEDICO";
    /** Agents allowed to execute the service TASGAUTOUSRMEDICO **/
    public static final String TASGAUTOUSRMEDICO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudTASGAUTOUSRMEDICOpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TASGAUTOUSRMEDICO_SOLICITUDTASGAUTOUSRMEDICOPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTASGAUTOUSRMEDICOpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TASGAUTOUSRMEDICO_SOLICITUDTASGAUTOUSRMEDICOPTHISSOLICITUD = "Clas_1431957012480960Ser_157Arg_1_Alias";
    /** <code>solicitudTASGAUTOUSRMEDICOpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TASGAUTOUSRMEDICO_SOLICITUDTASGAUTOUSRMEDICOPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTASGAUTOUSRMEDICOptAreaMedica</code> inbound argument name. */
    public static final String ARG_NAME_TASGAUTOUSRMEDICO_SOLICITUDTASGAUTOUSRMEDICOPTAREAMEDICA = "ptAreaMedica";
    /** <code>solicitudTASGAUTOUSRMEDICOptAreaMedica</code> inbound argument id. */
    public static final String ARG_ID_TASGAUTOUSRMEDICO_SOLICITUDTASGAUTOUSRMEDICOPTAREAMEDICA = "Clas_1431957012480960Ser_157Arg_2_Alias";
    /** <code>solicitudTASGAUTOUSRMEDICOptAreaMedica</code> inbound argument alias. */
    public static final String ARG_ALIAS_TASGAUTOUSRMEDICO_SOLICITUDTASGAUTOUSRMEDICOPTAREAMEDICA = "Área médica";
    // Service (TCAMBIARESTADODOC)
    /** <code>TCAMBIARESTADODOC</code> service id. */
    public static final String SERV_ID_TCAMBIARESTADODOC = "Clas_1431957012480960Ser_159_Alias";
    /** <code>TCAMBIARESTADODOC</code> service name. */
    public static final String SERV_NAME_TCAMBIARESTADODOC = "TCAMBIARESTADODOC";
    /** <code>TCAMBIARESTADODOC</code> service alias. */
    public static final String SERV_ALIAS_TCAMBIARESTADODOC = "Cambiar estado documentacion";
    /** Agents allowed to execute the service TCAMBIARESTADODOC **/
    public static final String TCAMBIARESTADODOC_SRVAGENTS = "SuperAdmin";
    // Preconditions
    /** <code>TCAMBIARESTADODOC</code> precondition 0 id. */
    public static final String PRE_ID_TCAMBIARESTADODOC_0 = "Clas_1431957012480960Pre_139_MsgError";
    // Inbound arguments
    /** <code>solicitudTCAMBIARESTADODOCpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARESTADODOC_SOLICITUDTCAMBIARESTADODOCPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTCAMBIARESTADODOCpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARESTADODOC_SOLICITUDTCAMBIARESTADODOCPTHISSOLICITUD = "Clas_1431957012480960Ser_159Arg_1_Alias";
    /** <code>solicitudTCAMBIARESTADODOCpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARESTADODOC_SOLICITUDTCAMBIARESTADODOCPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTCAMBIARESTADODOCptEstadoDoc</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARESTADODOC_SOLICITUDTCAMBIARESTADODOCPTESTADODOC = "ptEstadoDoc";
    /** <code>solicitudTCAMBIARESTADODOCptEstadoDoc</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARESTADODOC_SOLICITUDTCAMBIARESTADODOCPTESTADODOC = "Clas_1431957012480960Ser_159Arg_2_Alias";
    /** <code>solicitudTCAMBIARESTADODOCptEstadoDoc</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARESTADODOC_SOLICITUDTCAMBIARESTADODOCPTESTADODOC = "Estado documentación";
    // Service (TMARCARTERMINADA)
    /** <code>TMARCARTERMINADA</code> service id. */
    public static final String SERV_ID_TMARCARTERMINADA = "Clas_1431957012480960Ser_167_Alias";
    /** <code>TMARCARTERMINADA</code> service name. */
    public static final String SERV_NAME_TMARCARTERMINADA = "TMARCARTERMINADA";
    /** <code>TMARCARTERMINADA</code> service alias. */
    public static final String SERV_ALIAS_TMARCARTERMINADA = "TMARCARTERMINADA";
    /** Agents allowed to execute the service TMARCARTERMINADA **/
    public static final String TMARCARTERMINADA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudTMARCARTERMINADApthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TMARCARTERMINADA_SOLICITUDTMARCARTERMINADAPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTMARCARTERMINADApthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TMARCARTERMINADA_SOLICITUDTMARCARTERMINADAPTHISSOLICITUD = "Clas_1431957012480960Ser_167Arg_1_Alias";
    /** <code>solicitudTMARCARTERMINADApthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMARCARTERMINADA_SOLICITUDTMARCARTERMINADAPTHISSOLICITUD = "Solicitud";
    // Service (TREASIGNARUSUARIOS)
    /** <code>TREASIGNARUSUARIOS</code> service id. */
    public static final String SERV_ID_TREASIGNARUSUARIOS = "Clas_1431957012480960Ser_168_Alias";
    /** <code>TREASIGNARUSUARIOS</code> service name. */
    public static final String SERV_NAME_TREASIGNARUSUARIOS = "TREASIGNARUSUARIOS";
    /** <code>TREASIGNARUSUARIOS</code> service alias. */
    public static final String SERV_ALIAS_TREASIGNARUSUARIOS = "Reasignación de solicitud";
    /** Agents allowed to execute the service TREASIGNARUSUARIOS **/
    public static final String TREASIGNARUSUARIOS_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>TREASIGNARUSUARIOS</code> precondition 0 id. */
    public static final String PRE_ID_TREASIGNARUSUARIOS_0 = "Clas_1431957012480960Pre_138_MsgError";
    /** <code>TREASIGNARUSUARIOS</code> precondition 1 id. */
    public static final String PRE_ID_TREASIGNARUSUARIOS_1 = "Clas_1431957012480960Pre_135_MsgError";
    /** <code>TREASIGNARUSUARIOS</code> precondition 2 id. */
    public static final String PRE_ID_TREASIGNARUSUARIOS_2 = "Clas_1431957012480960Pre_136_MsgError";
    // Inbound arguments
    /** <code>solicitudTREASIGNARUSUARIOSpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TREASIGNARUSUARIOS_SOLICITUDTREASIGNARUSUARIOSPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTREASIGNARUSUARIOSpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TREASIGNARUSUARIOS_SOLICITUDTREASIGNARUSUARIOSPTHISSOLICITUD = "Clas_1431957012480960Ser_168Arg_1_Alias";
    /** <code>solicitudTREASIGNARUSUARIOSpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TREASIGNARUSUARIOS_SOLICITUDTREASIGNARUSUARIOSPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTREASIGNARUSUARIOSptUsrAfiliacion</code> inbound argument name. */
    public static final String ARG_NAME_TREASIGNARUSUARIOS_SOLICITUDTREASIGNARUSUARIOSPTUSRAFILIACION = "ptUsrAfiliacion";
    /** <code>solicitudTREASIGNARUSUARIOSptUsrAfiliacion</code> inbound argument id. */
    public static final String ARG_ID_TREASIGNARUSUARIOS_SOLICITUDTREASIGNARUSUARIOSPTUSRAFILIACION = "Clas_1431957012480960Ser_168Arg_2_Alias";
    /** <code>solicitudTREASIGNARUSUARIOSptUsrAfiliacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TREASIGNARUSUARIOS_SOLICITUDTREASIGNARUSUARIOSPTUSRAFILIACION = "Asesor Integral / Grabador Afiliaciones ";
    /** <code>solicitudTREASIGNARUSUARIOSptUsrAreaMedica</code> inbound argument name. */
    public static final String ARG_NAME_TREASIGNARUSUARIOS_SOLICITUDTREASIGNARUSUARIOSPTUSRAREAMEDICA = "ptUsrAreaMedica";
    /** <code>solicitudTREASIGNARUSUARIOSptUsrAreaMedica</code> inbound argument id. */
    public static final String ARG_ID_TREASIGNARUSUARIOS_SOLICITUDTREASIGNARUSUARIOSPTUSRAREAMEDICA = "Clas_1431957012480960Ser_168Arg_3_Alias";
    /** <code>solicitudTREASIGNARUSUARIOSptUsrAreaMedica</code> inbound argument alias. */
    public static final String ARG_ALIAS_TREASIGNARUSUARIOS_SOLICITUDTREASIGNARUSUARIOSPTUSRAREAMEDICA = "Área Médica";
    // Outbound arguments
    /** <code>solicitudTREASIGNARUSUARIOSoaNumProcesados</code> outbound argument name. */
    public static final String ARG_NAME_TREASIGNARUSUARIOS_SOLICITUDTREASIGNARUSUARIOSOANUMPROCESADOS = "solicitudTREASIGNARUSUARIOSoaNumProcesados";
    /** <code>solicitudTREASIGNARUSUARIOSoaNumProcesados</code> outbound argument id. */
    public static final String ARG_ID_TREASIGNARUSUARIOS_SOLICITUDTREASIGNARUSUARIOSOANUMPROCESADOS = "Clas_1431957012480960Ser_168Arg_4_Alias";
    /** <code>solicitudTREASIGNARUSUARIOSoaNumProcesados</code> outbound argument alias. */
    public static final String ARG_ALIAS_TREASIGNARUSUARIOS_SOLICITUDTREASIGNARUSUARIOSOANUMPROCESADOS = "Num. Procesados";
    /** <code>solicitudTREASIGNARUSUARIOSoaNumErrores</code> outbound argument name. */
    public static final String ARG_NAME_TREASIGNARUSUARIOS_SOLICITUDTREASIGNARUSUARIOSOANUMERRORES = "solicitudTREASIGNARUSUARIOSoaNumErrores";
    /** <code>solicitudTREASIGNARUSUARIOSoaNumErrores</code> outbound argument id. */
    public static final String ARG_ID_TREASIGNARUSUARIOS_SOLICITUDTREASIGNARUSUARIOSOANUMERRORES = "Clas_1431957012480960Ser_168Arg_5_Alias";
    /** <code>solicitudTREASIGNARUSUARIOSoaNumErrores</code> outbound argument alias. */
    public static final String ARG_ALIAS_TREASIGNARUSUARIOS_SOLICITUDTREASIGNARUSUARIOSOANUMERRORES = "Num. Errores";
    /** <code>solicitudTREASIGNARUSUARIOSoaTextoErrores</code> outbound argument name. */
    public static final String ARG_NAME_TREASIGNARUSUARIOS_SOLICITUDTREASIGNARUSUARIOSOATEXTOERRORES = "solicitudTREASIGNARUSUARIOSoaTextoErrores";
    /** <code>solicitudTREASIGNARUSUARIOSoaTextoErrores</code> outbound argument id. */
    public static final String ARG_ID_TREASIGNARUSUARIOS_SOLICITUDTREASIGNARUSUARIOSOATEXTOERRORES = "Clas_1431957012480960Ser_168Arg_6_Alias";
    /** <code>solicitudTREASIGNARUSUARIOSoaTextoErrores</code> outbound argument alias. */
    public static final String ARG_ALIAS_TREASIGNARUSUARIOS_SOLICITUDTREASIGNARUSUARIOSOATEXTOERRORES = "Errores";
    // Service (TCALCESTADODOCU)
    /** <code>TCALCESTADODOCU</code> service id. */
    public static final String SERV_ID_TCALCESTADODOCU = "Clas_1431957012480960Ser_169_Alias";
    /** <code>TCALCESTADODOCU</code> service name. */
    public static final String SERV_NAME_TCALCESTADODOCU = "TCALCESTADODOCU";
    /** <code>TCALCESTADODOCU</code> service alias. */
    public static final String SERV_ALIAS_TCALCESTADODOCU = "TCALCESTADODOCU";
    /** Agents allowed to execute the service TCALCESTADODOCU **/
    public static final String TCALCESTADODOCU_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudTCALCESTADODOCUpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCALCESTADODOCU_SOLICITUDTCALCESTADODOCUPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTCALCESTADODOCUpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCALCESTADODOCU_SOLICITUDTCALCESTADODOCUPTHISSOLICITUD = "Clas_1431957012480960Ser_169Arg_1_Alias";
    /** <code>solicitudTCALCESTADODOCUpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCALCESTADODOCU_SOLICITUDTCALCESTADODOCUPTHISSOLICITUD = "Solicitud";
    // Service (TSUBIRDOCUMENTOATO)
    /** <code>TSUBIRDOCUMENTOATO</code> service id. */
    public static final String SERV_ID_TSUBIRDOCUMENTOATO = "Clas_1431957012480960Ser_171_Alias";
    /** <code>TSUBIRDOCUMENTOATO</code> service name. */
    public static final String SERV_NAME_TSUBIRDOCUMENTOATO = "TSUBIRDOCUMENTOATO";
    /** <code>TSUBIRDOCUMENTOATO</code> service alias. */
    public static final String SERV_ALIAS_TSUBIRDOCUMENTOATO = "Subir documento";
    /** Agents allowed to execute the service TSUBIRDOCUMENTOATO **/
    public static final String TSUBIRDOCUMENTOATO_SRVAGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,MesaDeApoyo";
    // Preconditions
    /** <code>TSUBIRDOCUMENTOATO</code> precondition 0 id. */
    public static final String PRE_ID_TSUBIRDOCUMENTOATO_0 = "Clas_1431957012480960Pre_169_MsgError";
    // Inbound arguments
    /** <code>solicitudTSUBIRDOCUMENTOATOpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTSUBIRDOCUMENTOATOpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPTHISSOLICITUD = "Clas_1431957012480960Ser_171Arg_1_Alias";
    /** <code>solicitudTSUBIRDOCUMENTOATOpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTSUBIRDOCUMENTOATOptpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    /** <code>solicitudTSUBIRDOCUMENTOATOptpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPTPATRDESCRIPCION = "Clas_1431957012480960Ser_171Arg_2_Alias";
    /** <code>solicitudTSUBIRDOCUMENTOATOptpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPTPATRDESCRIPCION = "Descripción";
    /** <code>solicitudTSUBIRDOCUMENTOATOptpatrTipo</code> inbound argument name. */
    public static final String ARG_NAME_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPTPATRTIPO = "pt_p_atrTipo";
    /** <code>solicitudTSUBIRDOCUMENTOATOptpatrTipo</code> inbound argument id. */
    public static final String ARG_ID_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPTPATRTIPO = "Clas_1431957012480960Ser_171Arg_3_Alias";
    /** <code>solicitudTSUBIRDOCUMENTOATOptpatrTipo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPTPATRTIPO = "Tipo";
    /** <code>solicitudTSUBIRDOCUMENTOATOptpExtension</code> inbound argument name. */
    public static final String ARG_NAME_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPTPEXTENSION = "pt_p_Extension";
    /** <code>solicitudTSUBIRDOCUMENTOATOptpExtension</code> inbound argument id. */
    public static final String ARG_ID_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPTPEXTENSION = "Clas_1431957012480960Ser_171Arg_5_Alias";
    /** <code>solicitudTSUBIRDOCUMENTOATOptpExtension</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPTPEXTENSION = "Extensión";
    /** <code>solicitudTSUBIRDOCUMENTOATOptPersona</code> inbound argument name. */
    public static final String ARG_NAME_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPTPERSONA = "ptPersona";
    /** <code>solicitudTSUBIRDOCUMENTOATOptPersona</code> inbound argument id. */
    public static final String ARG_ID_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPTPERSONA = "Clas_1431957012480960Ser_171Arg_6_Alias";
    /** <code>solicitudTSUBIRDOCUMENTOATOptPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPTPERSONA = "Persona";
    /** <code>solicitudTSUBIRDOCUMENTOATOptIdDocGestor</code> inbound argument name. */
    public static final String ARG_NAME_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPTIDDOCGESTOR = "ptIdDocGestor";
    /** <code>solicitudTSUBIRDOCUMENTOATOptIdDocGestor</code> inbound argument id. */
    public static final String ARG_ID_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPTIDDOCGESTOR = "Clas_1431957012480960Ser_171Arg_7_Alias";
    /** <code>solicitudTSUBIRDOCUMENTOATOptIdDocGestor</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPTIDDOCGESTOR = "ptIdDocGestor";
    /** <code>solicitudTSUBIRDOCUMENTOATOptNombre</code> inbound argument name. */
    public static final String ARG_NAME_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPTNOMBRE = "ptNombre";
    /** <code>solicitudTSUBIRDOCUMENTOATOptNombre</code> inbound argument id. */
    public static final String ARG_ID_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPTNOMBRE = "Clas_1431957012480960Ser_171Arg_8_Alias";
    /** <code>solicitudTSUBIRDOCUMENTOATOptNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPTNOMBRE = "ptNombre";
    /** <code>solicitudTSUBIRDOCUMENTOATOpfFichero</code> inbound argument name. */
    public static final String ARG_NAME_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPFFICHERO = "pfFichero";
    /** <code>solicitudTSUBIRDOCUMENTOATOpfFichero</code> inbound argument id. */
    public static final String ARG_ID_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPFFICHERO = "Clas_1431957012480960Ser_171Arg_9_Alias";
    /** <code>solicitudTSUBIRDOCUMENTOATOpfFichero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPFFICHERO = "Fichero";
    /** <code>solicitudTSUBIRDOCUMENTOATOptNumSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPTNUMSOLICITUD = "ptNumSolicitud";
    /** <code>solicitudTSUBIRDOCUMENTOATOptNumSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPTNUMSOLICITUD = "Clas_1431957012480960Ser_171Arg_10_Alias";
    /** <code>solicitudTSUBIRDOCUMENTOATOptNumSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPTNUMSOLICITUD = "ptNumSolicitud";
    /** <code>solicitudTSUBIRDOCUMENTOATOptNumIdentUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPTNUMIDENTUSUARIO = "ptNumIdentUsuario";
    /** <code>solicitudTSUBIRDOCUMENTOATOptNumIdentUsuario</code> inbound argument id. */
    public static final String ARG_ID_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPTNUMIDENTUSUARIO = "Clas_1431957012480960Ser_171Arg_11_Alias";
    /** <code>solicitudTSUBIRDOCUMENTOATOptNumIdentUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSUBIRDOCUMENTOATO_SOLICITUDTSUBIRDOCUMENTOATOPTNUMIDENTUSUARIO = "ptNumIdentUsuario";
    // Service (TGETPLANTILLACORREO)
    /** <code>TGETPLANTILLACORREO</code> service id. */
    public static final String SERV_ID_TGETPLANTILLACORREO = "Clas_1431957012480960Ser_178_Alias";
    /** <code>TGETPLANTILLACORREO</code> service name. */
    public static final String SERV_NAME_TGETPLANTILLACORREO = "TGETPLANTILLACORREO";
    /** <code>TGETPLANTILLACORREO</code> service alias. */
    public static final String SERV_ALIAS_TGETPLANTILLACORREO = "TGETPLANTILLACORREO";
    /** Agents allowed to execute the service TGETPLANTILLACORREO **/
    public static final String TGETPLANTILLACORREO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudTGETPLANTILLACORREOpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TGETPLANTILLACORREO_SOLICITUDTGETPLANTILLACORREOPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTGETPLANTILLACORREOpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TGETPLANTILLACORREO_SOLICITUDTGETPLANTILLACORREOPTHISSOLICITUD = "Clas_1431957012480960Ser_178Arg_1_Alias";
    /** <code>solicitudTGETPLANTILLACORREOpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TGETPLANTILLACORREO_SOLICITUDTGETPLANTILLACORREOPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTGETPLANTILLACORREOptTipo</code> inbound argument name. */
    public static final String ARG_NAME_TGETPLANTILLACORREO_SOLICITUDTGETPLANTILLACORREOPTTIPO = "ptTipo";
    /** <code>solicitudTGETPLANTILLACORREOptTipo</code> inbound argument id. */
    public static final String ARG_ID_TGETPLANTILLACORREO_SOLICITUDTGETPLANTILLACORREOPTTIPO = "Clas_1431957012480960Ser_178Arg_8_Alias";
    /** <code>solicitudTGETPLANTILLACORREOptTipo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TGETPLANTILLACORREO_SOLICITUDTGETPLANTILLACORREOPTTIPO = "ptTipo";
    // Outbound arguments
    /** <code>solicitudTGETPLANTILLACORREOoaPlantilla</code> outbound argument name. */
    public static final String ARG_NAME_TGETPLANTILLACORREO_SOLICITUDTGETPLANTILLACORREOOAPLANTILLA = "solicitudTGETPLANTILLACORREOoaPlantilla";
    /** <code>solicitudTGETPLANTILLACORREOoaPlantilla</code> outbound argument id. */
    public static final String ARG_ID_TGETPLANTILLACORREO_SOLICITUDTGETPLANTILLACORREOOAPLANTILLA = "Clas_1431957012480960Ser_178Arg_11_Alias";
    /** <code>solicitudTGETPLANTILLACORREOoaPlantilla</code> outbound argument alias. */
    public static final String ARG_ALIAS_TGETPLANTILLACORREO_SOLICITUDTGETPLANTILLACORREOOAPLANTILLA = "Plantilla email";
    // Service (TGETPLANTILLAREPORTE)
    /** <code>TGETPLANTILLAREPORTE</code> service id. */
    public static final String SERV_ID_TGETPLANTILLAREPORTE = "Clas_1431957012480960Ser_180_Alias";
    /** <code>TGETPLANTILLAREPORTE</code> service name. */
    public static final String SERV_NAME_TGETPLANTILLAREPORTE = "TGETPLANTILLAREPORTE";
    /** <code>TGETPLANTILLAREPORTE</code> service alias. */
    public static final String SERV_ALIAS_TGETPLANTILLAREPORTE = "TGETPLANTILLAREPORTE";
    /** Agents allowed to execute the service TGETPLANTILLAREPORTE **/
    public static final String TGETPLANTILLAREPORTE_SRVAGENTS = "";
    // Preconditions
    /** <code>TGETPLANTILLAREPORTE</code> precondition 0 id. */
    public static final String PRE_ID_TGETPLANTILLAREPORTE_0 = "Clas_1431957012480960Pre_182_MsgError";
    // Inbound arguments
    /** <code>solicitudTGETPLANTILLAREPORTEpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TGETPLANTILLAREPORTE_SOLICITUDTGETPLANTILLAREPORTEPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTGETPLANTILLAREPORTEpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TGETPLANTILLAREPORTE_SOLICITUDTGETPLANTILLAREPORTEPTHISSOLICITUD = "Clas_1431957012480960Ser_180Arg_1_Alias";
    /** <code>solicitudTGETPLANTILLAREPORTEpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TGETPLANTILLAREPORTE_SOLICITUDTGETPLANTILLAREPORTEPTHISSOLICITUD = "Solicitud";
    /** <code>solicitudTGETPLANTILLAREPORTEptTipo</code> inbound argument name. */
    public static final String ARG_NAME_TGETPLANTILLAREPORTE_SOLICITUDTGETPLANTILLAREPORTEPTTIPO = "ptTipo";
    /** <code>solicitudTGETPLANTILLAREPORTEptTipo</code> inbound argument id. */
    public static final String ARG_ID_TGETPLANTILLAREPORTE_SOLICITUDTGETPLANTILLAREPORTEPTTIPO = "Clas_1431957012480960Ser_180Arg_2_Alias";
    /** <code>solicitudTGETPLANTILLAREPORTEptTipo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TGETPLANTILLAREPORTE_SOLICITUDTGETPLANTILLAREPORTEPTTIPO = "ptTipo";
    // Outbound arguments
    /** <code>solicitudTGETPLANTILLAREPORTEoaPlantilla</code> outbound argument name. */
    public static final String ARG_NAME_TGETPLANTILLAREPORTE_SOLICITUDTGETPLANTILLAREPORTEOAPLANTILLA = "solicitudTGETPLANTILLAREPORTEoaPlantilla";
    /** <code>solicitudTGETPLANTILLAREPORTEoaPlantilla</code> outbound argument id. */
    public static final String ARG_ID_TGETPLANTILLAREPORTE_SOLICITUDTGETPLANTILLAREPORTEOAPLANTILLA = "Clas_1431957012480960Ser_180Arg_3_Alias";
    /** <code>solicitudTGETPLANTILLAREPORTEoaPlantilla</code> outbound argument alias. */
    public static final String ARG_ALIAS_TGETPLANTILLAREPORTE_SOLICITUDTGETPLANTILLAREPORTEOAPLANTILLA = "Reportes de Dominio";
    /** <code>solicitudTGETPLANTILLAREPORTEoaReporte</code> outbound argument name. */
    public static final String ARG_NAME_TGETPLANTILLAREPORTE_SOLICITUDTGETPLANTILLAREPORTEOAREPORTE = "solicitudTGETPLANTILLAREPORTEoaReporte";
    /** <code>solicitudTGETPLANTILLAREPORTEoaReporte</code> outbound argument id. */
    public static final String ARG_ID_TGETPLANTILLAREPORTE_SOLICITUDTGETPLANTILLAREPORTEOAREPORTE = "Clas_1431957012480960Ser_180Arg_4_Alias";
    /** <code>solicitudTGETPLANTILLAREPORTEoaReporte</code> outbound argument alias. */
    public static final String ARG_ALIAS_TGETPLANTILLAREPORTE_SOLICITUDTGETPLANTILLAREPORTEOAREPORTE = "oaReporte";
    /** <code>solicitudTGETPLANTILLAREPORTEoaNombreArchivo</code> outbound argument name. */
    public static final String ARG_NAME_TGETPLANTILLAREPORTE_SOLICITUDTGETPLANTILLAREPORTEOANOMBREARCHIVO = "solicitudTGETPLANTILLAREPORTEoaNombreArchivo";
    /** <code>solicitudTGETPLANTILLAREPORTEoaNombreArchivo</code> outbound argument id. */
    public static final String ARG_ID_TGETPLANTILLAREPORTE_SOLICITUDTGETPLANTILLAREPORTEOANOMBREARCHIVO = "Clas_1431957012480960Ser_180Arg_5_Alias";
    /** <code>solicitudTGETPLANTILLAREPORTEoaNombreArchivo</code> outbound argument alias. */
    public static final String ARG_ALIAS_TGETPLANTILLAREPORTE_SOLICITUDTGETPLANTILLAREPORTEOANOMBREARCHIVO = "oaNombreArchivo";
    // Service (TENVIARDOCAUTOAUX)
    /** <code>TENVIARDOCAUTOAUX</code> service id. */
    public static final String SERV_ID_TENVIARDOCAUTOAUX = "Clas_1431957012480960Ser_181_Alias";
    /** <code>TENVIARDOCAUTOAUX</code> service name. */
    public static final String SERV_NAME_TENVIARDOCAUTOAUX = "TENVIARDOCAUTOAUX";
    /** <code>TENVIARDOCAUTOAUX</code> service alias. */
    public static final String SERV_ALIAS_TENVIARDOCAUTOAUX = "TENVIARDOCAUTOAUX";
    /** Agents allowed to execute the service TENVIARDOCAUTOAUX **/
    public static final String TENVIARDOCAUTOAUX_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    // Inbound arguments
    /** <code>solicitudTENVIARDOCAUTOAUXpthisSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TENVIARDOCAUTOAUX_SOLICITUDTENVIARDOCAUTOAUXPTHISSOLICITUD = "p_thisSolicitud";
    /** <code>solicitudTENVIARDOCAUTOAUXpthisSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TENVIARDOCAUTOAUX_SOLICITUDTENVIARDOCAUTOAUXPTHISSOLICITUD = "Clas_1431957012480960Ser_181Arg_1_Alias";
    /** <code>solicitudTENVIARDOCAUTOAUXpthisSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TENVIARDOCAUTOAUX_SOLICITUDTENVIARDOCAUTOAUXPTHISSOLICITUD = "Solicitud";

    public static final String FILTER_NAME_FSOLICITUDSOLICITUD = "F_SolicitudSolicitud";
    public static final String VAR_NAME_FSOLICITUDSOLICITUD_VNUMSOLICITUD = "v_NumSolicitud";
    public static final String VAR_NAME_FSOLICITUDSOLICITUD_VFINI = "v_FIni";
    public static final String VAR_NAME_FSOLICITUDSOLICITUD_VFFIN = "v_FFin";
    public static final String FILTER_NAME_IFSOLICITUDNUMCONTRATO = "iF_SolicitudNumContrato";
    public static final String VAR_NAME_IFSOLICITUDNUMCONTRATO_VNUMCONTRATO = "v_NumContrato";
    public static final String FILTER_NAME_FSOLICITUDSTATUSADMIN = "F_SolicitudStatusAdmin";
    public static final String VAR_NAME_FSOLICITUDSTATUSADMIN_VNUMSOLICITUD = "v_NumSolicitud";
    public static final String VAR_NAME_FSOLICITUDSTATUSADMIN_VTRAMITE = "v_Tramite";
    public static final String VAR_NAME_FSOLICITUDSTATUSADMIN_VOPRODUCTO = "vo_Producto";
    public static final String VAR_NAME_FSOLICITUDSTATUSADMIN_VOPLAN = "vo_Plan";
    public static final String VAR_NAME_FSOLICITUDSTATUSADMIN_VOESTADO = "vo_Estado";
    public static final String VAR_NAME_FSOLICITUDSTATUSADMIN_VFELABINI = "v_FElabIni";
    public static final String VAR_NAME_FSOLICITUDSTATUSADMIN_VFELABFIN = "v_FElabFin";
    public static final String VAR_NAME_FSOLICITUDSTATUSADMIN_VFCONTRATOINI = "v_FContratoIni";
    public static final String VAR_NAME_FSOLICITUDSTATUSADMIN_VFCONTRATOFIN = "v_FContratoFin";
    public static final String VAR_NAME_FSOLICITUDSTATUSADMIN_VCODASESOR = "v_CodAsesor";
    public static final String VAR_NAME_FSOLICITUDSTATUSADMIN_VTIPODOC = "v_TipoDoc";
    public static final String VAR_NAME_FSOLICITUDSTATUSADMIN_VNUMDOC = "v_NumDoc";
    public static final String VAR_NAME_FSOLICITUDSTATUSADMIN_VOREGIONAL = "vo_Regional";
    public static final String VAR_NAME_FSOLICITUDSTATUSADMIN_VESTADODOC = "v_EstadoDoc";
    public static final String FILTER_NAME_FSOLICITUDCONTRATANTETITULAR = "F_SolicitudContratanteTitular";
    public static final String VAR_NAME_FSOLICITUDCONTRATANTETITULAR_VOPERSONA = "vo_Persona";
    public static final String VAR_NAME_FSOLICITUDCONTRATANTETITULAR_VFINI = "v_FIni";
    public static final String VAR_NAME_FSOLICITUDCONTRATANTETITULAR_VFFIN = "v_FFin";
    public static final String FILTER_NAME_FSOLICITUDLEGALIZACOMISIONES = "F_SolicitudLegalizaComisiones";
    public static final String VAR_NAME_FSOLICITUDLEGALIZACOMISIONES_VFINICIO = "v_FInicio";
    public static final String VAR_NAME_FSOLICITUDLEGALIZACOMISIONES_VFFIN = "v_FFin";
    public static final String FILTER_NAME_IFSOLICITUDNUMSOLICITUD = "iF_SolicitudNumSolicitud";
    public static final String VAR_NAME_IFSOLICITUDNUMSOLICITUD_VNUMSOLICITUD = "v_NumSolicitud";
    public static final String FILTER_NAME_FSOLICITUDCONSULTARADICADO = "F_SolicitudConsultaRadicado";
    public static final String VAR_NAME_FSOLICITUDCONSULTARADICADO_VFDESDE = "vfDesde";
    public static final String VAR_NAME_FSOLICITUDCONSULTARADICADO_VFHASTA = "vfHasta";
    public static final String VAR_NAME_FSOLICITUDCONSULTARADICADO_VOTIPODOC = "vo_TipoDoc";
    public static final String VAR_NAME_FSOLICITUDCONSULTARADICADO_VNUMDOC = "v_NumDoc";
    public static final String VAR_NAME_FSOLICITUDCONSULTARADICADO_VOPERSONA = "voPersona";
    public static final String FILTER_NAME_FSOLICITUDSTATUSAFIL1 = "F_SolicitudStatus_Afil1";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL1_VNUMSOLICITUD = "v_NumSolicitud";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL1_VTRAMITE = "v_Tramite";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL1_VOPRODUCTO = "vo_Producto";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL1_VOPLAN = "vo_Plan";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL1_VOESTADO = "vo_Estado";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL1_VFELABINI = "v_FElabIni";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL1_VFELABFIN = "v_FElabFin";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL1_VFCONTRATOINI = "v_FContratoIni";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL1_VFCONTRATOFIN = "v_FContratoFin";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL1_VCODASESOR = "v_CodAsesor";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL1_VTIPODOC = "v_TipoDoc";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL1_VNUMDOC = "v_NumDoc";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL1_VOREGIONAL = "vo_Regional";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL1_VESTADODOC = "v_EstadoDoc";
    public static final String FILTER_NAME_FSOLICITUDSTATUSAFIL2 = "F_SolicitudStatus_Afil2";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL2_VNUMSOLICITUD = "v_NumSolicitud";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL2_VTRAMITE = "v_Tramite";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL2_VOPRODUCTO = "vo_Producto";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL2_VOPLAN = "vo_Plan";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL2_VOESTADO = "vo_Estado";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL2_VFELABINI = "v_FElabIni";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL2_VFELABFIN = "v_FElabFin";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL2_VFCONTRATOINI = "v_FContratoIni";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL2_VFCONTRATOFIN = "v_FContratoFin";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL2_VCODASESOR = "v_CodAsesor";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL2_VTIPODOC = "v_TipoDoc";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL2_VNUMDOC = "v_NumDoc";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL2_VOREGIONAL = "vo_Regional";
    public static final String FILTER_NAME_FSOLICITUDSTATUSAFIL3 = "F_SolicitudStatus_Afil3";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL3_VNUMSOLICITUD = "v_NumSolicitud";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL3_VTRAMITE = "v_Tramite";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL3_VOPRODUCTO = "vo_Producto";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL3_VOPLAN = "vo_Plan";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL3_VOESTADO = "vo_Estado";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL3_VFELABINI = "v_FElabIni";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL3_VFELABFIN = "v_FElabFin";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL3_VFCONTRATOINI = "v_FContratoIni";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL3_VFCONTRATOFIN = "v_FContratoFin";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL3_VCODASESOR = "v_CodAsesor";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL3_VTIPODOC = "v_TipoDoc";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL3_VNUMDOC = "v_NumDoc";
    public static final String VAR_NAME_FSOLICITUDSTATUSAFIL3_VOREGIONAL = "vo_Regional";
    public static final String FILTER_NAME_FSOLICITUDESTATUSAREAMED1 = "F_SolicitudEstatus_AreaMed1";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED1_VNUMSOLICITUD = "v_NumSolicitud";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED1_VTRAMITE = "v_Tramite";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED1_VOPRODUCTO = "vo_Producto";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED1_VOPLAN = "vo_Plan";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED1_VFELABINI = "v_FElabIni";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED1_VFELABFIN = "v_FElabFin";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED1_VFCONTRATOINI = "v_FContratoIni";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED1_VFCONTRATOFIN = "v_FContratoFin";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED1_VCODASESOR = "v_CodAsesor";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED1_VTIPODOC = "v_TipoDoc";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED1_VNUMDOC = "v_NumDoc";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED1_VOREGIONAL = "vo_Regional";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED1_VOESTADODOC = "vo_EstadoDoc";
    public static final String FILTER_NAME_FSOLICITUDESTATUSAREAMED2 = "F_SolicitudEstatus_AreaMed2";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED2_VNUMSOLICITUD = "v_NumSolicitud";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED2_VTRAMITE = "v_Tramite";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED2_VOPRODUCTO = "vo_Producto";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED2_VOPLAN = "vo_Plan";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED2_VFELABINI = "v_FElabIni";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED2_VFELABFIN = "v_FElabFin";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED2_VFCONTRATOINI = "v_FContratoIni";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED2_VFCONTRATOFIN = "v_FContratoFin";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED2_VCODASESOR = "v_CodAsesor";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED2_VTIPODOC = "v_TipoDoc";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED2_VNUMDOC = "v_NumDoc";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED2_VOREGIONAL = "vo_Regional";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED2_VOESTADODOC = "vo_EstadoDoc";
    public static final String FILTER_NAME_FSOLICITUDESTATUSAREAMED3 = "F_SolicitudEstatus_AreaMed3";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED3_VNUMSOLICITUD = "v_NumSolicitud";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED3_VTRAMITE = "v_Tramite";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED3_VOPRODUCTO = "vo_Producto";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED3_VOPLAN = "vo_Plan";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED3_VFELABINI = "v_FElabIni";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED3_VFELABFIN = "v_FElabFin";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED3_VFCONTRATOINI = "v_FContratoIni";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED3_VFCONTRATOFIN = "v_FContratoFin";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED3_VCODASESOR = "v_CodAsesor";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED3_VTIPODOC = "v_TipoDoc";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED3_VNUMDOC = "v_NumDoc";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED3_VOREGIONAL = "vo_Regional";
    public static final String VAR_NAME_FSOLICITUDESTATUSAREAMED3_VOESTADODOC = "vo_EstadoDoc";
    public static final String FILTER_NAME_FSOLICITUDSTATUSESTHOMO = "F_SolicitudStatusEstHomo";
    public static final String VAR_NAME_FSOLICITUDSTATUSESTHOMO_VNUMSOLICITUD = "v_NumSolicitud";
    public static final String VAR_NAME_FSOLICITUDSTATUSESTHOMO_VTRAMITE = "v_Tramite";
    public static final String VAR_NAME_FSOLICITUDSTATUSESTHOMO_VOPRODUCTO = "vo_Producto";
    public static final String VAR_NAME_FSOLICITUDSTATUSESTHOMO_VOPLAN = "vo_Plan";
    public static final String VAR_NAME_FSOLICITUDSTATUSESTHOMO_VOESTADO = "vo_Estado";
    public static final String VAR_NAME_FSOLICITUDSTATUSESTHOMO_VFELABINI = "v_FElabIni";
    public static final String VAR_NAME_FSOLICITUDSTATUSESTHOMO_VFELABFIN = "v_FElabFin";
    public static final String VAR_NAME_FSOLICITUDSTATUSESTHOMO_VFCONTRATOINI = "v_FContratoIni";
    public static final String VAR_NAME_FSOLICITUDSTATUSESTHOMO_VFCONTRATOFIN = "v_FContratoFin";
    public static final String VAR_NAME_FSOLICITUDSTATUSESTHOMO_VCODASESOR = "v_CodAsesor";
    public static final String VAR_NAME_FSOLICITUDSTATUSESTHOMO_VTIPODOC = "v_TipoDoc";
    public static final String VAR_NAME_FSOLICITUDSTATUSESTHOMO_VNUMDOC = "v_NumDoc";
    public static final String VAR_NAME_FSOLICITUDSTATUSESTHOMO_VOREGIONAL = "vo_Regional";
    public static final String VAR_NAME_FSOLICITUDSTATUSESTHOMO_VESTADODOC = "v_EstadoDoc";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_SOLICITUDNUMRADICADO.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDTRAMITE.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNUMCONTRATO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDFINICIOCONTRATO.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDESTRASLADO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVREQCUESMED.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDTIPOCONTRATO.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDCODIGOSUCURSALRAD.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDCONTRATOCONFIRMA.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDOBSERVACIONS.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDEXENTOIVA.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVYATIENECONTRATANTE.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVTITULARCONBENEFICIOS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDVALORCUOTA.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDVALORDTOCOMERCIALSIM.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDVALORCUOTAINSCRIP.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVSUBTOTAL.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDVALORDTOFINANCIERO.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDVALORDTOCOMERCIAL.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVBASEGRABABLE.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVPORCENIVA.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVIVA.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVTOTAL.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDATOSPAGOOK.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDVALORCUOTAPERIODOC.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDESCUENTOCOMERCIALC.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDIVAC.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDESCUENTOFINANCIEROC.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDTIENEDIFLIQUIDACION.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDUSUARIOSVALIDADOS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVCUESMEDOK.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNUMCONTRATOINCLUSION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNUMFAMILIA.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVYATIENETITULAR.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVDIFVALORCUOTA.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVDIFVALORDTOFINANCIERO.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVDIFVALORIVA.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVHAYPREEXISTENCIAS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVCONTRATOLEGALIZADO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVTIENESEGUNDAFIRMA.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVGRUPOASOCIADO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVAPLICADOCCONTRATO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVAPLICADOCCARTAPREE.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVAPLICADOCBBGESTANTE.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVAPLICADOCMATERNIDAD.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVAPLICACUESTIONARIO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVAPLICACARTAENT.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDEMAILURLPAGOENVIADO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDEMAILDOCUENVIADO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDOCSENVIADOS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVTOTALCONANEXOS.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVCONTRATANTEESTITULAR.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVALGUNBENEFICIARIOEPSSANITAS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDCODDIRECTOR.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVLISTAERRORES.toUpperCase(), Constants.Type.TEXT.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDVALORCUOTABRUTAC.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVDIFVALORCUOTABRUTA.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVNUMTITULARES.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVENVIAREMAILDOC.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVAPLICADOCNEONATAL.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDCODTARIFA.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVAPLICACARNETS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVAPLICADOCSOLICITUD.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVPUEDEREPLICAR.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDCOMPLETADA.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVCAMBIARBENEFCONT.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDESTADO.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVEDADTITULAR.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVGENEROTITULAR.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVTIENETITULAR.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVOBSERVACIONESREPORT.toUpperCase(), Constants.Type.TEXT.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVIGNORARPREEXISTENCIAS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVTIENEPRIMERAFIRMA.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVNUMCONTRATO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDFINIVIGCONTINC.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVIMPTARIFAPLANVOL.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVAPLICADOCPROTDATOS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDPORCENTAJEPRORRATEO.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVPUEDEMODIFICARGRUPO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDGRUPODELCORE.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDTIPOFACTURACORE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVAPLICAPOLIZAINTERNACIONAL.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVPOLIZAINTERNACIONAL.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVPERMITERECHAZADOS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVALGUNUSUARIOIMC.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVFECHAPORCENIVA.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDRESULTSMSINFOPAGO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDFECHACOMPLETADA.toUpperCase(), Constants.Type.DATETIME.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDFECHAULTIMODOC.toUpperCase(), Constants.Type.DATETIME.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDPRIORIDAD.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDFECHATERMINADA.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDFECHAFUG.toUpperCase(), Constants.Type.DATETIME.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDFECHAFA.toUpperCase(), Constants.Type.DATETIME.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDFECHAFAAM.toUpperCase(), Constants.Type.DATETIME.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDSEMAFOROGRABASE.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDSEMAFOROAREAMED.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDESTADODOC.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVSEMAFOROGRABASE.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVSEMAFOROAREAMED.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVESTADOHOMOLOGADO.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVVALIDARDATOSCONTRATANTE.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDENVIOCARNETFISICO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDDRVTRAMITARENLINEA.toUpperCase(), Constants.Type.BOOL.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_SOLICITUDNUMRADICADO.toUpperCase(), SOLICITUDNUMRADICADO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDTRAMITE.toUpperCase(), SOLICITUDTRAMITE_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNUMCONTRATO.toUpperCase(), SOLICITUDNUMCONTRATO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDFINICIOCONTRATO.toUpperCase(), SOLICITUDFINICIOCONTRATO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDESTRASLADO.toUpperCase(), SOLICITUDESTRASLADO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVREQCUESMED.toUpperCase(), SOLICITUDDRVREQCUESMED_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDTIPOCONTRATO.toUpperCase(), SOLICITUDTIPOCONTRATO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDCODIGOSUCURSALRAD.toUpperCase(), SOLICITUDCODIGOSUCURSALRAD_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDCONTRATOCONFIRMA.toUpperCase(), SOLICITUDCONTRATOCONFIRMA_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDOBSERVACIONS.toUpperCase(), SOLICITUDOBSERVACIONS_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDEXENTOIVA.toUpperCase(), SOLICITUDEXENTOIVA_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVYATIENECONTRATANTE.toUpperCase(), SOLICITUDDRVYATIENECONTRATANTE_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVTITULARCONBENEFICIOS.toUpperCase(), SOLICITUDDRVTITULARCONBENEFICIOS_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDVALORCUOTA.toUpperCase(), SOLICITUDVALORCUOTA_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDVALORDTOCOMERCIALSIM.toUpperCase(), SOLICITUDVALORDTOCOMERCIALSIM_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDVALORCUOTAINSCRIP.toUpperCase(), SOLICITUDVALORCUOTAINSCRIP_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVSUBTOTAL.toUpperCase(), SOLICITUDDRVSUBTOTAL_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDVALORDTOFINANCIERO.toUpperCase(), SOLICITUDVALORDTOFINANCIERO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDVALORDTOCOMERCIAL.toUpperCase(), SOLICITUDVALORDTOCOMERCIAL_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVBASEGRABABLE.toUpperCase(), SOLICITUDDRVBASEGRABABLE_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVPORCENIVA.toUpperCase(), SOLICITUDDRVPORCENIVA_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVIVA.toUpperCase(), SOLICITUDDRVIVA_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVTOTAL.toUpperCase(), SOLICITUDDRVTOTAL_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDATOSPAGOOK.toUpperCase(), SOLICITUDDATOSPAGOOK_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDVALORCUOTAPERIODOC.toUpperCase(), SOLICITUDVALORCUOTAPERIODOC_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDESCUENTOCOMERCIALC.toUpperCase(), SOLICITUDDESCUENTOCOMERCIALC_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDIVAC.toUpperCase(), SOLICITUDIVAC_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDESCUENTOFINANCIEROC.toUpperCase(), SOLICITUDDESCUENTOFINANCIEROC_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDTIENEDIFLIQUIDACION.toUpperCase(), SOLICITUDTIENEDIFLIQUIDACION_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDUSUARIOSVALIDADOS.toUpperCase(), SOLICITUDUSUARIOSVALIDADOS_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVCUESMEDOK.toUpperCase(), SOLICITUDDRVCUESMEDOK_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNUMCONTRATOINCLUSION.toUpperCase(), SOLICITUDNUMCONTRATOINCLUSION_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNUMFAMILIA.toUpperCase(), SOLICITUDNUMFAMILIA_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVYATIENETITULAR.toUpperCase(), SOLICITUDDRVYATIENETITULAR_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVDIFVALORCUOTA.toUpperCase(), SOLICITUDDRVDIFVALORCUOTA_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVDIFVALORDTOFINANCIERO.toUpperCase(), SOLICITUDDRVDIFVALORDTOFINANCIERO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVDIFVALORIVA.toUpperCase(), SOLICITUDDRVDIFVALORIVA_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVHAYPREEXISTENCIAS.toUpperCase(), SOLICITUDDRVHAYPREEXISTENCIAS_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVCONTRATOLEGALIZADO.toUpperCase(), SOLICITUDDRVCONTRATOLEGALIZADO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVTIENESEGUNDAFIRMA.toUpperCase(), SOLICITUDDRVTIENESEGUNDAFIRMA_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVGRUPOASOCIADO.toUpperCase(), SOLICITUDDRVGRUPOASOCIADO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVAPLICADOCCONTRATO.toUpperCase(), SOLICITUDDRVAPLICADOCCONTRATO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVAPLICADOCCARTAPREE.toUpperCase(), SOLICITUDDRVAPLICADOCCARTAPREE_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVAPLICADOCBBGESTANTE.toUpperCase(), SOLICITUDDRVAPLICADOCBBGESTANTE_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVAPLICADOCMATERNIDAD.toUpperCase(), SOLICITUDDRVAPLICADOCMATERNIDAD_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVAPLICACUESTIONARIO.toUpperCase(), SOLICITUDDRVAPLICACUESTIONARIO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVAPLICACARTAENT.toUpperCase(), SOLICITUDDRVAPLICACARTAENT_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDEMAILURLPAGOENVIADO.toUpperCase(), SOLICITUDEMAILURLPAGOENVIADO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDEMAILDOCUENVIADO.toUpperCase(), SOLICITUDEMAILDOCUENVIADO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDOCSENVIADOS.toUpperCase(), SOLICITUDDOCSENVIADOS_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVTOTALCONANEXOS.toUpperCase(), SOLICITUDDRVTOTALCONANEXOS_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVCONTRATANTEESTITULAR.toUpperCase(), SOLICITUDDRVCONTRATANTEESTITULAR_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVALGUNBENEFICIARIOEPSSANITAS.toUpperCase(), SOLICITUDDRVALGUNBENEFICIARIOEPSSANITAS_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDCODDIRECTOR.toUpperCase(), SOLICITUDCODDIRECTOR_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVLISTAERRORES.toUpperCase(), SOLICITUDDRVLISTAERRORES_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDVALORCUOTABRUTAC.toUpperCase(), SOLICITUDVALORCUOTABRUTAC_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVDIFVALORCUOTABRUTA.toUpperCase(), SOLICITUDDRVDIFVALORCUOTABRUTA_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVNUMTITULARES.toUpperCase(), SOLICITUDDRVNUMTITULARES_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVENVIAREMAILDOC.toUpperCase(), SOLICITUDDRVENVIAREMAILDOC_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVAPLICADOCNEONATAL.toUpperCase(), SOLICITUDDRVAPLICADOCNEONATAL_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDCODTARIFA.toUpperCase(), SOLICITUDCODTARIFA_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVAPLICACARNETS.toUpperCase(), SOLICITUDDRVAPLICACARNETS_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVAPLICADOCSOLICITUD.toUpperCase(), SOLICITUDDRVAPLICADOCSOLICITUD_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVPUEDEREPLICAR.toUpperCase(), SOLICITUDDRVPUEDEREPLICAR_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDCOMPLETADA.toUpperCase(), SOLICITUDCOMPLETADA_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVCAMBIARBENEFCONT.toUpperCase(), SOLICITUDDRVCAMBIARBENEFCONT_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDESTADO.toUpperCase(), SOLICITUDESTADO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVEDADTITULAR.toUpperCase(), SOLICITUDDRVEDADTITULAR_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVGENEROTITULAR.toUpperCase(), SOLICITUDDRVGENEROTITULAR_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVTIENETITULAR.toUpperCase(), SOLICITUDDRVTIENETITULAR_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVOBSERVACIONESREPORT.toUpperCase(), SOLICITUDDRVOBSERVACIONESREPORT_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVIGNORARPREEXISTENCIAS.toUpperCase(), SOLICITUDDRVIGNORARPREEXISTENCIAS_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVTIENEPRIMERAFIRMA.toUpperCase(), SOLICITUDDRVTIENEPRIMERAFIRMA_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVNUMCONTRATO.toUpperCase(), SOLICITUDDRVNUMCONTRATO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDFINIVIGCONTINC.toUpperCase(), SOLICITUDFINIVIGCONTINC_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVIMPTARIFAPLANVOL.toUpperCase(), SOLICITUDDRVIMPTARIFAPLANVOL_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVAPLICADOCPROTDATOS.toUpperCase(), SOLICITUDDRVAPLICADOCPROTDATOS_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDPORCENTAJEPRORRATEO.toUpperCase(), SOLICITUDPORCENTAJEPRORRATEO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVPUEDEMODIFICARGRUPO.toUpperCase(), SOLICITUDDRVPUEDEMODIFICARGRUPO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDGRUPODELCORE.toUpperCase(), SOLICITUDGRUPODELCORE_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDTIPOFACTURACORE.toUpperCase(), SOLICITUDTIPOFACTURACORE_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVAPLICAPOLIZAINTERNACIONAL.toUpperCase(), SOLICITUDDRVAPLICAPOLIZAINTERNACIONAL_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVPOLIZAINTERNACIONAL.toUpperCase(), SOLICITUDDRVPOLIZAINTERNACIONAL_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVPERMITERECHAZADOS.toUpperCase(), SOLICITUDDRVPERMITERECHAZADOS_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVALGUNUSUARIOIMC.toUpperCase(), SOLICITUDDRVALGUNUSUARIOIMC_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVFECHAPORCENIVA.toUpperCase(), SOLICITUDDRVFECHAPORCENIVA_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDRESULTSMSINFOPAGO.toUpperCase(), SOLICITUDRESULTSMSINFOPAGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDFECHACOMPLETADA.toUpperCase(), SOLICITUDFECHACOMPLETADA_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDFECHAULTIMODOC.toUpperCase(), SOLICITUDFECHAULTIMODOC_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDPRIORIDAD.toUpperCase(), SOLICITUDPRIORIDAD_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDFECHATERMINADA.toUpperCase(), SOLICITUDFECHATERMINADA_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDFECHAFUG.toUpperCase(), SOLICITUDFECHAFUG_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDFECHAFA.toUpperCase(), SOLICITUDFECHAFA_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDFECHAFAAM.toUpperCase(), SOLICITUDFECHAFAAM_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDSEMAFOROGRABASE.toUpperCase(), SOLICITUDSEMAFOROGRABASE_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDSEMAFOROAREAMED.toUpperCase(), SOLICITUDSEMAFOROAREAMED_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDESTADODOC.toUpperCase(), SOLICITUDESTADODOC_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVSEMAFOROGRABASE.toUpperCase(), SOLICITUDDRVSEMAFOROGRABASE_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVSEMAFOROAREAMED.toUpperCase(), SOLICITUDDRVSEMAFOROAREAMED_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVESTADOHOMOLOGADO.toUpperCase(), SOLICITUDDRVESTADOHOMOLOGADO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVVALIDARDATOSCONTRATANTE.toUpperCase(), SOLICITUDDRVVALIDARDATOSCONTRATANTE_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDENVIOCARNETFISICO.toUpperCase(), SOLICITUDENVIOCARNETFISICO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDDRVTRAMITARENLINEA.toUpperCase(), SOLICITUDDRVTRAMITARENLINEA_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_DIRECCION.toUpperCase(), DIRECCION_AGENTS);
        roleAgents.put(ROLE_NAME_PROTECCIONDATOS.toUpperCase(), PROTECCIONDATOS_AGENTS);
        roleAgents.put(ROLE_NAME_CONTRATANTE.toUpperCase(), CONTRATANTE_AGENTS);
        roleAgents.put(ROLE_NAME_FIRMA.toUpperCase(), FIRMA_AGENTS);
        roleAgents.put(ROLE_NAME_SEGUNDAFIRMA.toUpperCase(), SEGUNDAFIRMA_AGENTS);
        roleAgents.put(ROLE_NAME_FIRMACONTRATANTEINCL.toUpperCase(), FIRMACONTRATANTEINCL_AGENTS);
        roleAgents.put(ROLE_NAME_TITULAR.toUpperCase(), TITULAR_AGENTS);
        roleAgents.put(ROLE_NAME_AESOLICITUDES.toUpperCase(), AESOLICITUDES_AGENTS);
        roleAgents.put(ROLE_NAME_CONTRATANTEPERSONA.toUpperCase(), CONTRATANTEPERSONA_AGENTS);
        roleAgents.put(ROLE_NAME_TITULARPERSONA.toUpperCase(), TITULARPERSONA_AGENTS);
        roleAgents.put(ROLE_NAME_GRUPOASOCIADO.toUpperCase(), GRUPOASOCIADO_AGENTS);
        roleAgents.put(ROLE_NAME_AGENTE.toUpperCase(), AGENTE_AGENTS);
        roleAgents.put(ROLE_NAME_FORMAPAGO.toUpperCase(), FORMAPAGO_AGENTS);
        roleAgents.put(ROLE_NAME_PERIODICIDAD.toUpperCase(), PERIODICIDAD_AGENTS);
        roleAgents.put(ROLE_NAME_CONTRATOC.toUpperCase(), CONTRATOC_AGENTS);
        roleAgents.put(ROLE_NAME_USRAREAMEDICA.toUpperCase(), USRAREAMEDICA_AGENTS);
        roleAgents.put(ROLE_NAME_TIPOFACTURA.toUpperCase(), TIPOFACTURA_AGENTS);
        roleAgents.put(ROLE_NAME_USRAFILIACION.toUpperCase(), USRAFILIACION_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'Solicitud', it returns the identification keys
     * - If className is a facet of the inheritance net of 'Solicitud', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_FIELD_AESOLICITUDESIDSOLICITUD);
        }
        // Facet 'Solicitud' (This facet)
        if (SolicitudConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_FIELD_AESOLICITUDESIDSOLICITUD);
        }
        return returnList;
    }
}
