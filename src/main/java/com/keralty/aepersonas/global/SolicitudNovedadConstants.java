package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>SolicitudNovedad</code> model class.
 */
public final class SolicitudNovedadConstants {

    private SolicitudNovedadConstants() {

    }

    // Class
    /** <code>SolicitudNovedad</code> class id. */
    public static final String CLASS_ID = "Clas_1581421428736234_Alias";
    /** <code>SolicitudNovedad</code> class name. */
    public static final String CLASS_NAME = "SolicitudNovedad";
    /** <code>SolicitudNovedad</code> class alias. */
    public static final String CLASS_ALIAS = "Solicitud de Novedad";
    /** <code>SolicitudNovedad</code> class table name. */
    public static final String TBL_NAME = "SolicitudNovedad";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "solicitudNovedadId,planesPlan,novedadidNovedad,causalidCausal,proteccionDatosIdentificador,tipoIdentificacionCodigo,estadoContratoEstadoContratoCodigo,grupoAsociadoGrupoAsociadoCodigo,periodicidadPeriodicidadCodigo,funcionarioAgenteId,periodicidadPeriodicidadNuevaCodigo,motivoExcepcionSolNovMotivoExcepcionId,funcionarioUsrAfiliacionId,firmaFirmaIdentificador,solicitudNovedadNumRadicado,solicitudNovedadFechaCreacion,solicitudNovedadFechaVigencia,solicitudNovedadNumContrato,solicitudNovedadExcepcion,solicitudNovedadFechaIniExcepcion,solicitudNovedadFechaFinExcepcion,solicitudNovedadCtrCodigoTarifa,solicitudNovedadCtrDescTarifa,solicitudNovedadCtrCodigoConvenio,solicitudNovedadCtrDescConvenio,solicitudNovedadCtrEsColectivo,solicitudNovedadCtrTagCausaExclusion,solicitudNovedadContraNumIden,solicitudNovedadContraPrimerNombre,solicitudNovedadContraSegundoNombre,solicitudNovedadContraPrimerApellido,solicitudNovedadContraSegundoApellido,solicitudNovedadContraRazonSocial,solicitudNovedadFechaUltimoDoc,solicitudNovedadObservacions,solicitudNovedadEstado,solicitudNovedadEstadoDocumentacion,solicitudNovedadCompletada,solicitudNovedadFechaCompletada,solicitudNovedadCtrActivo,solicitudNovedadCtrTipoContrato,solicitudNovedadSCNumMeses,solicitudNovedadContraNuevaRazonSocial,solicitudNovedadContraTipoPersona,solicitudNovedadCtrFInicioContrato,solicitudNovedadPrioridad,solicitudNovedadFechaTerminada,solicitudNovedadFechaFUG,solicitudNovedadFechaFA,solicitudNovedadSemaforoGrabAse";

    public static final String DSDSSOLICITUDNOVEDADCON = "DS_SolicitudNovedad_Con";
    public static final String DSDSSOLNOVTIPOCONTRATO = "DS_SolNov_TipoContrato";
    public static final String DSDSSOLNOVCONTRATANTE = "DS_SolNovContratante";
    public static final String DSDSSOLNOVOBSERVACIONES = "DS_SolNovObservaciones";
    public static final String DSDSSOLNOVTIPOTITULAR = "DS_SolNov_TipoTitular";
    public static final String DSDSSOLNOVESTATUS = "DS_SolNov_Estatus";
    public static final String DSDSSOLNOVTIPOUSUARIO = "DS_SolNov_TipoUsuario";
    public static final String DSDSSOLNOVCONTRATIPOTITULAR = "DS_SolNovContra_TipoTitular";
    public static final String DSICSOLICITUDNOVEDAD = "IC_SolicitudNovedad";
    public static final String DSDSSOLNOVESTATUSAFILIACION = "DS_SolNov_EstatusAfiliacion";
    public static final String DSDSSOLNOVESTATUSASESOR = "DS_SolNov_Estatus_Asesor";
    public static final String DSDSSOLICITUDNOVEDADNULL = "DS_SolicitudNovedad_Null";
    

    // Attribute (solicitudNovedadId)
    /** <code>solicitudNovedadId</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADID = "Clas_1581421428736234Atr_2_Alias";
    /** <code>solicitudNovedadId</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADID = "solicitudNovedadId";
    /** <code>solicitudNovedadId</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADID = "Id.";

    /** <code>solicitudNovedadId</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADID = "";
    /** Agents allowed to view the attribute solicitudNovedadId **/
    public static final String SOLICITUDNOVEDADID_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadNumRadicado)
    /** <code>solicitudNovedadNumRadicado</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADNUMRADICADO = "Clas_1581421428736234Atr_1_Alias";
    /** <code>solicitudNovedadNumRadicado</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADNUMRADICADO = "solicitudNovedadNumRadicado";
    /** <code>solicitudNovedadNumRadicado</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADNUMRADICADO = "Nº Solicitud";

    /** <code>solicitudNovedadNumRadicado</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADNUMRADICADO = "";
    /** Agents allowed to view the attribute solicitudNovedadNumRadicado **/
    public static final String SOLICITUDNOVEDADNUMRADICADO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadFechaCreacion)
    /** <code>solicitudNovedadFechaCreacion</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADFECHACREACION = "Clas_1581421428736234Atr_34_Alias";
    /** <code>solicitudNovedadFechaCreacion</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADFECHACREACION = "solicitudNovedadFechaCreacion";
    /** <code>solicitudNovedadFechaCreacion</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADFECHACREACION = "Fecha Creación";

    /** <code>solicitudNovedadFechaCreacion</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADFECHACREACION = "";
    /** Agents allowed to view the attribute solicitudNovedadFechaCreacion **/
    public static final String SOLICITUDNOVEDADFECHACREACION_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadFechaVigencia)
    /** <code>solicitudNovedadFechaVigencia</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADFECHAVIGENCIA = "Clas_1581421428736234Atr_3_Alias";
    /** <code>solicitudNovedadFechaVigencia</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADFECHAVIGENCIA = "solicitudNovedadFechaVigencia";
    /** <code>solicitudNovedadFechaVigencia</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADFECHAVIGENCIA = "Fecha de vigencia";

    /** <code>solicitudNovedadFechaVigencia</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADFECHAVIGENCIA = "";
    /** Agents allowed to view the attribute solicitudNovedadFechaVigencia **/
    public static final String SOLICITUDNOVEDADFECHAVIGENCIA_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadNumContrato)
    /** <code>solicitudNovedadNumContrato</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADNUMCONTRATO = "Clas_1581421428736234Atr_4_Alias";
    /** <code>solicitudNovedadNumContrato</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADNUMCONTRATO = "solicitudNovedadNumContrato";
    /** <code>solicitudNovedadNumContrato</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADNUMCONTRATO = "Nº Contrato";

    /** <code>solicitudNovedadNumContrato</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADNUMCONTRATO = "";
    /** Agents allowed to view the attribute solicitudNovedadNumContrato **/
    public static final String SOLICITUDNOVEDADNUMCONTRATO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadExcepcion)
    /** <code>solicitudNovedadExcepcion</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADEXCEPCION = "Clas_1581421428736234Atr_48_Alias";
    /** <code>solicitudNovedadExcepcion</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADEXCEPCION = "solicitudNovedadExcepcion";
    /** <code>solicitudNovedadExcepcion</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADEXCEPCION = "Excepción";

    /** <code>solicitudNovedadExcepcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADEXCEPCION = "";
    /** Agents allowed to view the attribute solicitudNovedadExcepcion **/
    public static final String SOLICITUDNOVEDADEXCEPCION_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadFechaIniExcepcion)
    /** <code>solicitudNovedadFechaIniExcepcion</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADFECHAINIEXCEPCION = "Clas_1581421428736234Atr_49_Alias";
    /** <code>solicitudNovedadFechaIniExcepcion</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADFECHAINIEXCEPCION = "solicitudNovedadFechaIniExcepcion";
    /** <code>solicitudNovedadFechaIniExcepcion</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADFECHAINIEXCEPCION = "Fecha Inicio";

    /** <code>solicitudNovedadFechaIniExcepcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADFECHAINIEXCEPCION = "";
    /** Agents allowed to view the attribute solicitudNovedadFechaIniExcepcion **/
    public static final String SOLICITUDNOVEDADFECHAINIEXCEPCION_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadFechaFinExcepcion)
    /** <code>solicitudNovedadFechaFinExcepcion</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADFECHAFINEXCEPCION = "Clas_1581421428736234Atr_50_Alias";
    /** <code>solicitudNovedadFechaFinExcepcion</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADFECHAFINEXCEPCION = "solicitudNovedadFechaFinExcepcion";
    /** <code>solicitudNovedadFechaFinExcepcion</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADFECHAFINEXCEPCION = "Fecha Fin";

    /** <code>solicitudNovedadFechaFinExcepcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADFECHAFINEXCEPCION = "";
    /** Agents allowed to view the attribute solicitudNovedadFechaFinExcepcion **/
    public static final String SOLICITUDNOVEDADFECHAFINEXCEPCION_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadCtrCodigoTarifa)
    /** <code>solicitudNovedadCtrCodigoTarifa</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADCTRCODIGOTARIFA = "Clas_1581421428736234Atr_7_Alias";
    /** <code>solicitudNovedadCtrCodigoTarifa</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADCTRCODIGOTARIFA = "solicitudNovedadCtrCodigoTarifa";
    /** <code>solicitudNovedadCtrCodigoTarifa</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADCTRCODIGOTARIFA = "Código Tarifa";

    /** <code>solicitudNovedadCtrCodigoTarifa</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADCTRCODIGOTARIFA = "";
    /** Agents allowed to view the attribute solicitudNovedadCtrCodigoTarifa **/
    public static final String SOLICITUDNOVEDADCTRCODIGOTARIFA_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadCtrDescTarifa)
    /** <code>solicitudNovedadCtrDescTarifa</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADCTRDESCTARIFA = "Clas_1581421428736234Atr_8_Alias";
    /** <code>solicitudNovedadCtrDescTarifa</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADCTRDESCTARIFA = "solicitudNovedadCtrDescTarifa";
    /** <code>solicitudNovedadCtrDescTarifa</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADCTRDESCTARIFA = "Descripción Tarifa";

    /** <code>solicitudNovedadCtrDescTarifa</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADCTRDESCTARIFA = "";
    /** Agents allowed to view the attribute solicitudNovedadCtrDescTarifa **/
    public static final String SOLICITUDNOVEDADCTRDESCTARIFA_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadCtrCodigoConvenio)
    /** <code>solicitudNovedadCtrCodigoConvenio</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADCTRCODIGOCONVENIO = "Clas_1581421428736234Atr_9_Alias";
    /** <code>solicitudNovedadCtrCodigoConvenio</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADCTRCODIGOCONVENIO = "solicitudNovedadCtrCodigoConvenio";
    /** <code>solicitudNovedadCtrCodigoConvenio</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADCTRCODIGOCONVENIO = "Código Convenio";

    /** <code>solicitudNovedadCtrCodigoConvenio</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADCTRCODIGOCONVENIO = "";
    /** Agents allowed to view the attribute solicitudNovedadCtrCodigoConvenio **/
    public static final String SOLICITUDNOVEDADCTRCODIGOCONVENIO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadCtrDescConvenio)
    /** <code>solicitudNovedadCtrDescConvenio</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADCTRDESCCONVENIO = "Clas_1581421428736234Atr_10_Alias";
    /** <code>solicitudNovedadCtrDescConvenio</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADCTRDESCCONVENIO = "solicitudNovedadCtrDescConvenio";
    /** <code>solicitudNovedadCtrDescConvenio</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADCTRDESCCONVENIO = "Descripción Convenio";

    /** <code>solicitudNovedadCtrDescConvenio</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADCTRDESCCONVENIO = "";
    /** Agents allowed to view the attribute solicitudNovedadCtrDescConvenio **/
    public static final String SOLICITUDNOVEDADCTRDESCCONVENIO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadCtrEsColectivo)
    /** <code>solicitudNovedadCtrEsColectivo</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADCTRESCOLECTIVO = "Clas_1581421428736234Atr_26_Alias";
    /** <code>solicitudNovedadCtrEsColectivo</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADCTRESCOLECTIVO = "solicitudNovedadCtrEsColectivo";
    /** <code>solicitudNovedadCtrEsColectivo</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADCTRESCOLECTIVO = "Contrato colectivo";

    /** <code>solicitudNovedadCtrEsColectivo</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADCTRESCOLECTIVO = "";
    /** Agents allowed to view the attribute solicitudNovedadCtrEsColectivo **/
    public static final String SOLICITUDNOVEDADCTRESCOLECTIVO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadCtrTagCausaExclusion)
    /** <code>solicitudNovedadCtrTagCausaExclusion</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADCTRTAGCAUSAEXCLUSION = "Clas_1581421428736234Atr_32_Alias";
    /** <code>solicitudNovedadCtrTagCausaExclusion</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADCTRTAGCAUSAEXCLUSION = "solicitudNovedadCtrTagCausaExclusion";
    /** <code>solicitudNovedadCtrTagCausaExclusion</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADCTRTAGCAUSAEXCLUSION = "Motivo Estado";

    /** <code>solicitudNovedadCtrTagCausaExclusion</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADCTRTAGCAUSAEXCLUSION = "";
    /** Agents allowed to view the attribute solicitudNovedadCtrTagCausaExclusion **/
    public static final String SOLICITUDNOVEDADCTRTAGCAUSAEXCLUSION_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadContraNumIden)
    /** <code>solicitudNovedadContraNumIden</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADCONTRANUMIDEN = "Clas_1581421428736234Atr_16_Alias";
    /** <code>solicitudNovedadContraNumIden</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADCONTRANUMIDEN = "solicitudNovedadContraNumIden";
    /** <code>solicitudNovedadContraNumIden</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADCONTRANUMIDEN = "Nº Identifiación";

    /** <code>solicitudNovedadContraNumIden</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADCONTRANUMIDEN = "";
    /** Agents allowed to view the attribute solicitudNovedadContraNumIden **/
    public static final String SOLICITUDNOVEDADCONTRANUMIDEN_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadContraPrimerNombre)
    /** <code>solicitudNovedadContraPrimerNombre</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADCONTRAPRIMERNOMBRE = "Clas_1581421428736234Atr_21_Alias";
    /** <code>solicitudNovedadContraPrimerNombre</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADCONTRAPRIMERNOMBRE = "solicitudNovedadContraPrimerNombre";
    /** <code>solicitudNovedadContraPrimerNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADCONTRAPRIMERNOMBRE = "Primer Nombre";

    /** <code>solicitudNovedadContraPrimerNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADCONTRAPRIMERNOMBRE = "";
    /** Agents allowed to view the attribute solicitudNovedadContraPrimerNombre **/
    public static final String SOLICITUDNOVEDADCONTRAPRIMERNOMBRE_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadContraSegundoNombre)
    /** <code>solicitudNovedadContraSegundoNombre</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADCONTRASEGUNDONOMBRE = "Clas_1581421428736234Atr_29_Alias";
    /** <code>solicitudNovedadContraSegundoNombre</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADCONTRASEGUNDONOMBRE = "solicitudNovedadContraSegundoNombre";
    /** <code>solicitudNovedadContraSegundoNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADCONTRASEGUNDONOMBRE = "Segundo Nombre";

    /** <code>solicitudNovedadContraSegundoNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADCONTRASEGUNDONOMBRE = "";
    /** Agents allowed to view the attribute solicitudNovedadContraSegundoNombre **/
    public static final String SOLICITUDNOVEDADCONTRASEGUNDONOMBRE_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadContraPrimerApellido)
    /** <code>solicitudNovedadContraPrimerApellido</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADCONTRAPRIMERAPELLIDO = "Clas_1581421428736234Atr_30_Alias";
    /** <code>solicitudNovedadContraPrimerApellido</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADCONTRAPRIMERAPELLIDO = "solicitudNovedadContraPrimerApellido";
    /** <code>solicitudNovedadContraPrimerApellido</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADCONTRAPRIMERAPELLIDO = "Primer Apellido";

    /** <code>solicitudNovedadContraPrimerApellido</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADCONTRAPRIMERAPELLIDO = "";
    /** Agents allowed to view the attribute solicitudNovedadContraPrimerApellido **/
    public static final String SOLICITUDNOVEDADCONTRAPRIMERAPELLIDO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadContraSegundoApellido)
    /** <code>solicitudNovedadContraSegundoApellido</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADCONTRASEGUNDOAPELLIDO = "Clas_1581421428736234Atr_31_Alias";
    /** <code>solicitudNovedadContraSegundoApellido</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADCONTRASEGUNDOAPELLIDO = "solicitudNovedadContraSegundoApellido";
    /** <code>solicitudNovedadContraSegundoApellido</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADCONTRASEGUNDOAPELLIDO = "Segundo Apellido";

    /** <code>solicitudNovedadContraSegundoApellido</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADCONTRASEGUNDOAPELLIDO = "";
    /** Agents allowed to view the attribute solicitudNovedadContraSegundoApellido **/
    public static final String SOLICITUDNOVEDADCONTRASEGUNDOAPELLIDO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadContraRazonSocial)
    /** <code>solicitudNovedadContraRazonSocial</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADCONTRARAZONSOCIAL = "Clas_1581421428736234Atr_35_Alias";
    /** <code>solicitudNovedadContraRazonSocial</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADCONTRARAZONSOCIAL = "solicitudNovedadContraRazonSocial";
    /** <code>solicitudNovedadContraRazonSocial</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADCONTRARAZONSOCIAL = "Razón Social";

    /** <code>solicitudNovedadContraRazonSocial</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADCONTRARAZONSOCIAL = "";
    /** Agents allowed to view the attribute solicitudNovedadContraRazonSocial **/
    public static final String SOLICITUDNOVEDADCONTRARAZONSOCIAL_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadFechaUltimoDoc)
    /** <code>solicitudNovedadFechaUltimoDoc</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADFECHAULTIMODOC = "Clas_1581421428736234Atr_23_Alias";
    /** <code>solicitudNovedadFechaUltimoDoc</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADFECHAULTIMODOC = "solicitudNovedadFechaUltimoDoc";
    /** <code>solicitudNovedadFechaUltimoDoc</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADFECHAULTIMODOC = "Fecha último documento";

    /** <code>solicitudNovedadFechaUltimoDoc</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADFECHAULTIMODOC = "";
    /** Agents allowed to view the attribute solicitudNovedadFechaUltimoDoc **/
    public static final String SOLICITUDNOVEDADFECHAULTIMODOC_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadObservacions)
    /** <code>solicitudNovedadObservacions</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADOBSERVACIONS = "Clas_1581421428736234Atr_24_Alias";
    /** <code>solicitudNovedadObservacions</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADOBSERVACIONS = "solicitudNovedadObservacions";
    /** <code>solicitudNovedadObservacions</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADOBSERVACIONS = "Observaciones";

    /** <code>solicitudNovedadObservacions</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADOBSERVACIONS = "";
    /** Agents allowed to view the attribute solicitudNovedadObservacions **/
    public static final String SOLICITUDNOVEDADOBSERVACIONS_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadEstado)
    /** <code>solicitudNovedadEstado</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADESTADO = "Clas_1581421428736234Atr_25_Alias";
    /** <code>solicitudNovedadEstado</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADESTADO = "solicitudNovedadEstado";
    /** <code>solicitudNovedadEstado</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADESTADO = "Estado";

    /** <code>solicitudNovedadEstado</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADESTADO = "";
    /** Agents allowed to view the attribute solicitudNovedadEstado **/
    public static final String SOLICITUDNOVEDADESTADO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadEstadoDocumentacion)
    /** <code>solicitudNovedadEstadoDocumentacion</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADESTADODOCUMENTACION = "Clas_1581421428736234Atr_28_Alias";
    /** <code>solicitudNovedadEstadoDocumentacion</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADESTADODOCUMENTACION = "solicitudNovedadEstadoDocumentacion";
    /** <code>solicitudNovedadEstadoDocumentacion</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADESTADODOCUMENTACION = "Estado documentación";

    /** <code>solicitudNovedadEstadoDocumentacion</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADESTADODOCUMENTACION = "";
    /** Agents allowed to view the attribute solicitudNovedadEstadoDocumentacion **/
    public static final String SOLICITUDNOVEDADESTADODOCUMENTACION_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadCompletada)
    /** <code>solicitudNovedadCompletada</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADCOMPLETADA = "Clas_1581421428736234Atr_27_Alias";
    /** <code>solicitudNovedadCompletada</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADCOMPLETADA = "solicitudNovedadCompletada";
    /** <code>solicitudNovedadCompletada</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADCOMPLETADA = "Completada";

    /** <code>solicitudNovedadCompletada</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADCOMPLETADA = "";
    /** Agents allowed to view the attribute solicitudNovedadCompletada **/
    public static final String SOLICITUDNOVEDADCOMPLETADA_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadFechaCompletada)
    /** <code>solicitudNovedadFechaCompletada</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADFECHACOMPLETADA = "Clas_1581421428736234Atr_22_Alias";
    /** <code>solicitudNovedadFechaCompletada</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADFECHACOMPLETADA = "solicitudNovedadFechaCompletada";
    /** <code>solicitudNovedadFechaCompletada</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADFECHACOMPLETADA = "Fecha Completada";

    /** <code>solicitudNovedadFechaCompletada</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADFECHACOMPLETADA = "";
    /** Agents allowed to view the attribute solicitudNovedadFechaCompletada **/
    public static final String SOLICITUDNOVEDADFECHACOMPLETADA_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadCtrActivo)
    /** <code>solicitudNovedadCtrActivo</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADCTRACTIVO = "Clas_1581421428736234Atr_33_Alias";
    /** <code>solicitudNovedadCtrActivo</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADCTRACTIVO = "solicitudNovedadCtrActivo";
    /** <code>solicitudNovedadCtrActivo</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADCTRACTIVO = "Contrato activo";

    /** <code>solicitudNovedadCtrActivo</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADCTRACTIVO = "";
    /** Agents allowed to view the attribute solicitudNovedadCtrActivo **/
    public static final String SOLICITUDNOVEDADCTRACTIVO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadCtrTipoContrato)
    /** <code>solicitudNovedadCtrTipoContrato</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADCTRTIPOCONTRATO = "Clas_1581421428736234Atr_40_Alias";
    /** <code>solicitudNovedadCtrTipoContrato</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADCTRTIPOCONTRATO = "solicitudNovedadCtrTipoContrato";
    /** <code>solicitudNovedadCtrTipoContrato</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADCTRTIPOCONTRATO = "Tipo Contrato";

    /** <code>solicitudNovedadCtrTipoContrato</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADCTRTIPOCONTRATO = "";
    /** Agents allowed to view the attribute solicitudNovedadCtrTipoContrato **/
    public static final String SOLICITUDNOVEDADCTRTIPOCONTRATO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadSCNumMeses)
    /** <code>solicitudNovedadSCNumMeses</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADSCNUMMESES = "Clas_1581421428736234Atr_36_Alias";
    /** <code>solicitudNovedadSCNumMeses</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADSCNUMMESES = "solicitudNovedadSCNumMeses";
    /** <code>solicitudNovedadSCNumMeses</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADSCNUMMESES = "Nº Meses";

    /** <code>solicitudNovedadSCNumMeses</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADSCNUMMESES = "";
    /** Agents allowed to view the attribute solicitudNovedadSCNumMeses **/
    public static final String SOLICITUDNOVEDADSCNUMMESES_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadContraNuevaRazonSocial)
    /** <code>solicitudNovedadContraNuevaRazonSocial</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADCONTRANUEVARAZONSOCIAL = "Clas_1581421428736234Atr_37_Alias";
    /** <code>solicitudNovedadContraNuevaRazonSocial</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADCONTRANUEVARAZONSOCIAL = "solicitudNovedadContraNuevaRazonSocial";
    /** <code>solicitudNovedadContraNuevaRazonSocial</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADCONTRANUEVARAZONSOCIAL = "Nueva Razón Social";

    /** <code>solicitudNovedadContraNuevaRazonSocial</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADCONTRANUEVARAZONSOCIAL = "";
    /** Agents allowed to view the attribute solicitudNovedadContraNuevaRazonSocial **/
    public static final String SOLICITUDNOVEDADCONTRANUEVARAZONSOCIAL_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadContraTipoPersona)
    /** <code>solicitudNovedadContraTipoPersona</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADCONTRATIPOPERSONA = "Clas_1581421428736234Atr_38_Alias";
    /** <code>solicitudNovedadContraTipoPersona</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADCONTRATIPOPERSONA = "solicitudNovedadContraTipoPersona";
    /** <code>solicitudNovedadContraTipoPersona</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADCONTRATIPOPERSONA = "Tipo Persona";

    /** <code>solicitudNovedadContraTipoPersona</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADCONTRATIPOPERSONA = "";
    /** Agents allowed to view the attribute solicitudNovedadContraTipoPersona **/
    public static final String SOLICITUDNOVEDADCONTRATIPOPERSONA_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadCtrFInicioContrato)
    /** <code>solicitudNovedadCtrFInicioContrato</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADCTRFINICIOCONTRATO = "Clas_1581421428736234Atr_39_Alias";
    /** <code>solicitudNovedadCtrFInicioContrato</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADCTRFINICIOCONTRATO = "solicitudNovedadCtrFInicioContrato";
    /** <code>solicitudNovedadCtrFInicioContrato</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADCTRFINICIOCONTRATO = "F. Inicio Contrato";

    /** <code>solicitudNovedadCtrFInicioContrato</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADCTRFINICIOCONTRATO = "";
    /** Agents allowed to view the attribute solicitudNovedadCtrFInicioContrato **/
    public static final String SOLICITUDNOVEDADCTRFINICIOCONTRATO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadDrvExigeContratoActivo)
    /** <code>solicitudNovedadDrvExigeContratoActivo</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADDRVEXIGECONTRATOACTIVO = "Clas_1581421428736234Atr_41_Alias";
    /** <code>solicitudNovedadDrvExigeContratoActivo</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADDRVEXIGECONTRATOACTIVO = "solicitudNovedadDrvExigeContratoActivo";
    /** <code>solicitudNovedadDrvExigeContratoActivo</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADDRVEXIGECONTRATOACTIVO = "DrvExigeContratoActivo";

    /** <code>solicitudNovedadDrvExigeContratoActivo</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADDRVEXIGECONTRATOACTIVO = "";
    /** Agents allowed to view the attribute solicitudNovedadDrvExigeContratoActivo **/
    public static final String SOLICITUDNOVEDADDRVEXIGECONTRATOACTIVO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadDrvExigeFamiliaActiva)
    /** <code>solicitudNovedadDrvExigeFamiliaActiva</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADDRVEXIGEFAMILIAACTIVA = "Clas_1581421428736234Atr_43_Alias";
    /** <code>solicitudNovedadDrvExigeFamiliaActiva</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADDRVEXIGEFAMILIAACTIVA = "solicitudNovedadDrvExigeFamiliaActiva";
    /** <code>solicitudNovedadDrvExigeFamiliaActiva</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADDRVEXIGEFAMILIAACTIVA = "DrvExigeFamiliaActiva";

    /** <code>solicitudNovedadDrvExigeFamiliaActiva</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADDRVEXIGEFAMILIAACTIVA = "";
    /** Agents allowed to view the attribute solicitudNovedadDrvExigeFamiliaActiva **/
    public static final String SOLICITUDNOVEDADDRVEXIGEFAMILIAACTIVA_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadContraDrvNombreCompleto)
    /** <code>solicitudNovedadContraDrvNombreCompleto</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADCONTRADRVNOMBRECOMPLETO = "Clas_1581421428736234Atr_44_Alias";
    /** <code>solicitudNovedadContraDrvNombreCompleto</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADCONTRADRVNOMBRECOMPLETO = "solicitudNovedadContraDrvNombreCompleto";
    /** <code>solicitudNovedadContraDrvNombreCompleto</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADCONTRADRVNOMBRECOMPLETO = "Nombre completo";

    /** <code>solicitudNovedadContraDrvNombreCompleto</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADCONTRADRVNOMBRECOMPLETO = "";
    /** Agents allowed to view the attribute solicitudNovedadContraDrvNombreCompleto **/
    public static final String SOLICITUDNOVEDADCONTRADRVNOMBRECOMPLETO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadDrvTarifa)
    /** <code>solicitudNovedadDrvTarifa</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADDRVTARIFA = "Clas_1581421428736234Atr_45_Alias";
    /** <code>solicitudNovedadDrvTarifa</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADDRVTARIFA = "solicitudNovedadDrvTarifa";
    /** <code>solicitudNovedadDrvTarifa</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADDRVTARIFA = "Tarifa";

    /** <code>solicitudNovedadDrvTarifa</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADDRVTARIFA = "";
    /** Agents allowed to view the attribute solicitudNovedadDrvTarifa **/
    public static final String SOLICITUDNOVEDADDRVTARIFA_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadDrvConvenio)
    /** <code>solicitudNovedadDrvConvenio</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADDRVCONVENIO = "Clas_1581421428736234Atr_46_Alias";
    /** <code>solicitudNovedadDrvConvenio</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADDRVCONVENIO = "solicitudNovedadDrvConvenio";
    /** <code>solicitudNovedadDrvConvenio</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADDRVCONVENIO = "Convenio";

    /** <code>solicitudNovedadDrvConvenio</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADDRVCONVENIO = "";
    /** Agents allowed to view the attribute solicitudNovedadDrvConvenio **/
    public static final String SOLICITUDNOVEDADDRVCONVENIO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadContraDrvIdentificacion)
    /** <code>solicitudNovedadContraDrvIdentificacion</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADCONTRADRVIDENTIFICACION = "Clas_1581421428736234Atr_47_Alias";
    /** <code>solicitudNovedadContraDrvIdentificacion</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADCONTRADRVIDENTIFICACION = "solicitudNovedadContraDrvIdentificacion";
    /** <code>solicitudNovedadContraDrvIdentificacion</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADCONTRADRVIDENTIFICACION = "Identificación";

    /** <code>solicitudNovedadContraDrvIdentificacion</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADCONTRADRVIDENTIFICACION = "";
    /** Agents allowed to view the attribute solicitudNovedadContraDrvIdentificacion **/
    public static final String SOLICITUDNOVEDADCONTRADRVIDENTIFICACION_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadDrvGrupoAsociado)
    /** <code>solicitudNovedadDrvGrupoAsociado</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADDRVGRUPOASOCIADO = "Clas_1581421428736234Atr_51_Alias";
    /** <code>solicitudNovedadDrvGrupoAsociado</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADDRVGRUPOASOCIADO = "solicitudNovedadDrvGrupoAsociado";
    /** <code>solicitudNovedadDrvGrupoAsociado</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADDRVGRUPOASOCIADO = "Grupo Asociado";

    /** <code>solicitudNovedadDrvGrupoAsociado</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADDRVGRUPOASOCIADO = "";
    /** Agents allowed to view the attribute solicitudNovedadDrvGrupoAsociado **/
    public static final String SOLICITUDNOVEDADDRVGRUPOASOCIADO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadDrvPeriodicidad)
    /** <code>solicitudNovedadDrvPeriodicidad</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADDRVPERIODICIDAD = "Clas_1581421428736234Atr_52_Alias";
    /** <code>solicitudNovedadDrvPeriodicidad</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADDRVPERIODICIDAD = "solicitudNovedadDrvPeriodicidad";
    /** <code>solicitudNovedadDrvPeriodicidad</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADDRVPERIODICIDAD = "Periodicidad";

    /** <code>solicitudNovedadDrvPeriodicidad</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADDRVPERIODICIDAD = "";
    /** Agents allowed to view the attribute solicitudNovedadDrvPeriodicidad **/
    public static final String SOLICITUDNOVEDADDRVPERIODICIDAD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadDrvPermiteAddFam)
    /** <code>solicitudNovedadDrvPermiteAddFam</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADDRVPERMITEADDFAM = "Clas_1581421428736234Atr_53_Alias";
    /** <code>solicitudNovedadDrvPermiteAddFam</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADDRVPERMITEADDFAM = "solicitudNovedadDrvPermiteAddFam";
    /** <code>solicitudNovedadDrvPermiteAddFam</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADDRVPERMITEADDFAM = "Permite añadir familia";

    /** <code>solicitudNovedadDrvPermiteAddFam</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADDRVPERMITEADDFAM = "";
    /** Agents allowed to view the attribute solicitudNovedadDrvPermiteAddFam **/
    public static final String SOLICITUDNOVEDADDRVPERMITEADDFAM_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadDrvPermiteDelFam)
    /** <code>solicitudNovedadDrvPermiteDelFam</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADDRVPERMITEDELFAM = "Clas_1581421428736234Atr_54_Alias";
    /** <code>solicitudNovedadDrvPermiteDelFam</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADDRVPERMITEDELFAM = "solicitudNovedadDrvPermiteDelFam";
    /** <code>solicitudNovedadDrvPermiteDelFam</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADDRVPERMITEDELFAM = "Permite quitar familia";

    /** <code>solicitudNovedadDrvPermiteDelFam</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADDRVPERMITEDELFAM = "";
    /** Agents allowed to view the attribute solicitudNovedadDrvPermiteDelFam **/
    public static final String SOLICITUDNOVEDADDRVPERMITEDELFAM_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadDrvExigeDocSolicitud)
    /** <code>solicitudNovedadDrvExigeDocSolicitud</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADDRVEXIGEDOCSOLICITUD = "Clas_1581421428736234Atr_55_Alias";
    /** <code>solicitudNovedadDrvExigeDocSolicitud</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADDRVEXIGEDOCSOLICITUD = "solicitudNovedadDrvExigeDocSolicitud";
    /** <code>solicitudNovedadDrvExigeDocSolicitud</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADDRVEXIGEDOCSOLICITUD = "Exige Doc. Solicitud";

    /** <code>solicitudNovedadDrvExigeDocSolicitud</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADDRVEXIGEDOCSOLICITUD = "";
    /** Agents allowed to view the attribute solicitudNovedadDrvExigeDocSolicitud **/
    public static final String SOLICITUDNOVEDADDRVEXIGEDOCSOLICITUD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadDrvExigeDocPersona)
    /** <code>solicitudNovedadDrvExigeDocPersona</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADDRVEXIGEDOCPERSONA = "Clas_1581421428736234Atr_56_Alias";
    /** <code>solicitudNovedadDrvExigeDocPersona</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADDRVEXIGEDOCPERSONA = "solicitudNovedadDrvExigeDocPersona";
    /** <code>solicitudNovedadDrvExigeDocPersona</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADDRVEXIGEDOCPERSONA = "Exige Doc. Persona";

    /** <code>solicitudNovedadDrvExigeDocPersona</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADDRVEXIGEDOCPERSONA = "";
    /** Agents allowed to view the attribute solicitudNovedadDrvExigeDocPersona **/
    public static final String SOLICITUDNOVEDADDRVEXIGEDOCPERSONA_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadDrvReportColOscuro)
    /** <code>solicitudNovedadDrvReportColOscuro</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADDRVREPORTCOLOSCURO = "Clas_1581421428736234Atr_57_Alias";
    /** <code>solicitudNovedadDrvReportColOscuro</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADDRVREPORTCOLOSCURO = "solicitudNovedadDrvReportColOscuro";
    /** <code>solicitudNovedadDrvReportColOscuro</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADDRVREPORTCOLOSCURO = "Report Color Oscuro";

    /** <code>solicitudNovedadDrvReportColOscuro</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADDRVREPORTCOLOSCURO = "";
    /** Agents allowed to view the attribute solicitudNovedadDrvReportColOscuro **/
    public static final String SOLICITUDNOVEDADDRVREPORTCOLOSCURO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadDrvReportColClaro)
    /** <code>solicitudNovedadDrvReportColClaro</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADDRVREPORTCOLCLARO = "Clas_1581421428736234Atr_58_Alias";
    /** <code>solicitudNovedadDrvReportColClaro</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADDRVREPORTCOLCLARO = "solicitudNovedadDrvReportColClaro";
    /** <code>solicitudNovedadDrvReportColClaro</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADDRVREPORTCOLCLARO = "Report Color Claro";

    /** <code>solicitudNovedadDrvReportColClaro</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADDRVREPORTCOLCLARO = "";
    /** Agents allowed to view the attribute solicitudNovedadDrvReportColClaro **/
    public static final String SOLICITUDNOVEDADDRVREPORTCOLCLARO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadDrvReportLogo)
    /** <code>solicitudNovedadDrvReportLogo</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADDRVREPORTLOGO = "Clas_1581421428736234Atr_59_Alias";
    /** <code>solicitudNovedadDrvReportLogo</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADDRVREPORTLOGO = "solicitudNovedadDrvReportLogo";
    /** <code>solicitudNovedadDrvReportLogo</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADDRVREPORTLOGO = "Report Logo";

    /** <code>solicitudNovedadDrvReportLogo</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADDRVREPORTLOGO = "";
    /** Agents allowed to view the attribute solicitudNovedadDrvReportLogo **/
    public static final String SOLICITUDNOVEDADDRVREPORTLOGO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadDrvNuevaPeriodicidad)
    /** <code>solicitudNovedadDrvNuevaPeriodicidad</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADDRVNUEVAPERIODICIDAD = "Clas_1581421428736234Atr_60_Alias";
    /** <code>solicitudNovedadDrvNuevaPeriodicidad</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADDRVNUEVAPERIODICIDAD = "solicitudNovedadDrvNuevaPeriodicidad";
    /** <code>solicitudNovedadDrvNuevaPeriodicidad</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADDRVNUEVAPERIODICIDAD = "Nueva Periodicidad";

    /** <code>solicitudNovedadDrvNuevaPeriodicidad</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADDRVNUEVAPERIODICIDAD = "";
    /** Agents allowed to view the attribute solicitudNovedadDrvNuevaPeriodicidad **/
    public static final String SOLICITUDNOVEDADDRVNUEVAPERIODICIDAD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadPrioridad)
    /** <code>solicitudNovedadPrioridad</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADPRIORIDAD = "Clas_1581421428736234Atr_61_Alias";
    /** <code>solicitudNovedadPrioridad</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADPRIORIDAD = "solicitudNovedadPrioridad";
    /** <code>solicitudNovedadPrioridad</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADPRIORIDAD = "Prioridad";

    /** <code>solicitudNovedadPrioridad</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADPRIORIDAD = "";
    /** Agents allowed to view the attribute solicitudNovedadPrioridad **/
    public static final String SOLICITUDNOVEDADPRIORIDAD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadFechaTerminada)
    /** <code>solicitudNovedadFechaTerminada</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADFECHATERMINADA = "Clas_1581421428736234Atr_62_Alias";
    /** <code>solicitudNovedadFechaTerminada</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADFECHATERMINADA = "solicitudNovedadFechaTerminada";
    /** <code>solicitudNovedadFechaTerminada</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADFECHATERMINADA = "Fecha Terminada";

    /** <code>solicitudNovedadFechaTerminada</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADFECHATERMINADA = "";
    /** Agents allowed to view the attribute solicitudNovedadFechaTerminada **/
    public static final String SOLICITUDNOVEDADFECHATERMINADA_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadFechaFUG)
    /** <code>solicitudNovedadFechaFUG</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADFECHAFUG = "Clas_1581421428736234Atr_63_Alias";
    /** <code>solicitudNovedadFechaFUG</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADFECHAFUG = "solicitudNovedadFechaFUG";
    /** <code>solicitudNovedadFechaFUG</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADFECHAFUG = "Fecha Última Gestión";

    /** <code>solicitudNovedadFechaFUG</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADFECHAFUG = "";
    /** Agents allowed to view the attribute solicitudNovedadFechaFUG **/
    public static final String SOLICITUDNOVEDADFECHAFUG_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadFechaFA)
    /** <code>solicitudNovedadFechaFA</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADFECHAFA = "Clas_1581421428736234Atr_64_Alias";
    /** <code>solicitudNovedadFechaFA</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADFECHAFA = "solicitudNovedadFechaFA";
    /** <code>solicitudNovedadFechaFA</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADFECHAFA = "Fecha FA";

    /** <code>solicitudNovedadFechaFA</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADFECHAFA = "";
    /** Agents allowed to view the attribute solicitudNovedadFechaFA **/
    public static final String SOLICITUDNOVEDADFECHAFA_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadSemaforoGrabAse)
    /** <code>solicitudNovedadSemaforoGrabAse</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADSEMAFOROGRABASE = "Clas_1581421428736234Atr_65_Alias";
    /** <code>solicitudNovedadSemaforoGrabAse</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADSEMAFOROGRABASE = "solicitudNovedadSemaforoGrabAse";
    /** <code>solicitudNovedadSemaforoGrabAse</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADSEMAFOROGRABASE = "Semáforo Gra. Afiliaciones/Asesor";

    /** <code>solicitudNovedadSemaforoGrabAse</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADSEMAFOROGRABASE = "";
    /** Agents allowed to view the attribute solicitudNovedadSemaforoGrabAse **/
    public static final String SOLICITUDNOVEDADSEMAFOROGRABASE_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedaddrvSemaforoGrabAse)
    /** <code>solicitudNovedaddrvSemaforoGrabAse</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADDRVSEMAFOROGRABASE = "Clas_1581421428736234Atr_66_Alias";
    /** <code>solicitudNovedaddrvSemaforoGrabAse</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADDRVSEMAFOROGRABASE = "solicitudNovedaddrvSemaforoGrabAse";
    /** <code>solicitudNovedaddrvSemaforoGrabAse</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADDRVSEMAFOROGRABASE = "Semáforo Gra. Afiliaciones/Asesor";

    /** <code>solicitudNovedaddrvSemaforoGrabAse</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADDRVSEMAFOROGRABASE = "";
    /** Agents allowed to view the attribute solicitudNovedaddrvSemaforoGrabAse **/
    public static final String SOLICITUDNOVEDADDRVSEMAFOROGRABASE_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadDrvNumRadicadoStr)
    /** <code>solicitudNovedadDrvNumRadicadoStr</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADDRVNUMRADICADOSTR = "Clas_1581421428736234Atr_67_Alias";
    /** <code>solicitudNovedadDrvNumRadicadoStr</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADDRVNUMRADICADOSTR = "solicitudNovedadDrvNumRadicadoStr";
    /** <code>solicitudNovedadDrvNumRadicadoStr</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADDRVNUMRADICADOSTR = "Nº Solicitud";

    /** <code>solicitudNovedadDrvNumRadicadoStr</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADDRVNUMRADICADOSTR = "";
    /** Agents allowed to view the attribute solicitudNovedadDrvNumRadicadoStr **/
    public static final String SOLICITUDNOVEDADDRVNUMRADICADOSTR_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (solicitudNovedadDrvValidarPS1)
    /** <code>solicitudNovedadDrvValidarPS1</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADDRVVALIDARPS1 = "Clas_1581421428736234Atr_68_Alias";
    /** <code>solicitudNovedadDrvValidarPS1</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADDRVVALIDARPS1 = "solicitudNovedadDrvValidarPS1";
    /** <code>solicitudNovedadDrvValidarPS1</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADDRVVALIDARPS1 = "DrvValidarPS1";

    /** <code>solicitudNovedadDrvValidarPS1</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADDRVVALIDARPS1 = "";
    /** Agents allowed to view the attribute solicitudNovedadDrvValidarPS1 **/
    public static final String SOLICITUDNOVEDADDRVVALIDARPS1_AGENTS = "SuperAdmin,Asesor";
    // Attribute (solicitudNovedadDrvValidarPS2)
    /** <code>solicitudNovedadDrvValidarPS2</code> attribute id. */
    public static final String ATTR_ID_SOLICITUDNOVEDADDRVVALIDARPS2 = "Clas_1581421428736234Atr_69_Alias";
    /** <code>solicitudNovedadDrvValidarPS2</code> attribute name. */
    public static final String ATTR_NAME_SOLICITUDNOVEDADDRVVALIDARPS2 = "solicitudNovedadDrvValidarPS2";
    /** <code>solicitudNovedadDrvValidarPS2</code> attribute alias. */
    public static final String ATTR_ALIAS_SOLICITUDNOVEDADDRVVALIDARPS2 = "DrvValidarPS2";

    /** <code>solicitudNovedadDrvValidarPS2</code> attribute facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDADDRVVALIDARPS2 = "";
    /** Agents allowed to view the attribute solicitudNovedadDrvValidarPS2 **/
    public static final String SOLICITUDNOVEDADDRVVALIDARPS2_AGENTS = "SuperAdmin,Asesor";


    // Field (Id)
    /** <code>Id</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADID = "Id";    
    /** <code>solicitudNovedadId</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADID = "solicitudNovedadId";
    // Field (Plan)
    /** <code>Plan</code> field name. */
    public static final String FLD_PLANESPLAN = "Plan";    
    /** <code>PlanT.planesPlan</code> attribute field name. */
    public static final String ATTR_FIELD_PLANT_PLANESPLAN = "planesPlan";
    // Field (id_Novedad)
    /** <code>id_Novedad</code> field name. */
    public static final String FLD_NOVEDADIDNOVEDAD = "id_Novedad";    
    /** <code>Novedad.novedadidNovedad</code> attribute field name. */
    public static final String ATTR_FIELD_NOVEDAD_NOVEDADIDNOVEDAD = "novedadidNovedad";
    // Field (id_Causal)
    /** <code>id_Causal</code> field name. */
    public static final String FLD_CAUSALIDCAUSAL = "id_Causal";    
    /** <code>Causal.causalidCausal</code> attribute field name. */
    public static final String ATTR_FIELD_CAUSAL_CAUSALIDCAUSAL = "causalidCausal";
    // Field (Identificador)
    /** <code>Identificador</code> field name. */
    public static final String FLD_PROTECCIONDATOSIDENTIFICADOR = "Identificador";    
    /** <code>ProteccionDatos.proteccionDatosIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_PROTECCIONDATOS_PROTECCIONDATOSIDENTIFICADOR = "proteccionDatosIdentificador";
    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_TIPOIDENTIFICACIONCODIGO = "Codigo";    
    /** <code>TipoIdentContratante.tipoIdentificacionCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_TIPOIDENTCONTRATANTE_TIPOIDENTIFICACIONCODIGO = "tipoIdentificacionCodigo";
    // Field (EstadoContrato_Codigo)
    /** <code>EstadoContrato_Codigo</code> field name. */
    public static final String FLD_ESTADOCONTRATOESTADOCONTRATOCODIGO = "EstadoContrato_Codigo";    
    /** <code>EstadoContrato.estadoContratoCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_ESTADOCONTRATO_ESTADOCONTRATOCODIGO = "estadoContratoEstadoContratoCodigo";
    // Field (GrupoAsociado_Codigo)
    /** <code>GrupoAsociado_Codigo</code> field name. */
    public static final String FLD_GRUPOASOCIADOGRUPOASOCIADOCODIGO = "GrupoAsociado_Codigo";    
    /** <code>GrupoAsociado.grupoAsociadoCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_GRUPOASOCIADO_GRUPOASOCIADOCODIGO = "grupoAsociadoGrupoAsociadoCodigo";
    // Field (Periodicidad_Codigo)
    /** <code>Periodicidad_Codigo</code> field name. */
    public static final String FLD_PERIODICIDADPERIODICIDADCODIGO = "Periodicidad_Codigo";    
    /** <code>Periodicidad.periodicidadCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_PERIODICIDAD_PERIODICIDADCODIGO = "periodicidadPeriodicidadCodigo";
    // Field (Agente_Id)
    /** <code>Agente_Id</code> field name. */
    public static final String FLD_FUNCIONARIOAGENTEID = "Agente_Id";    
    /** <code>Agente.funcionarioId</code> attribute field name. */
    public static final String ATTR_FIELD_AGENTE_FUNCIONARIOID = "funcionarioAgenteId";
    // Field (PeriodicidadNueva_Codigo)
    /** <code>PeriodicidadNueva_Codigo</code> field name. */
    public static final String FLD_PERIODICIDADPERIODICIDADNUEVACODIGO = "PeriodicidadNueva_Codigo";    
    /** <code>PeriodicidadNueva.periodicidadCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_PERIODICIDADNUEVA_PERIODICIDADCODIGO = "periodicidadPeriodicidadNuevaCodigo";
    // Field (MotivoExcepcion_Id)
    /** <code>MotivoExcepcion_Id</code> field name. */
    public static final String FLD_MOTIVOEXCEPCIONSOLNOVMOTIVOEXCEPCIONID = "MotivoExcepcion_Id";    
    /** <code>MotivoExcepcion.motivoExcepcionSolNovId</code> attribute field name. */
    public static final String ATTR_FIELD_MOTIVOEXCEPCION_MOTIVOEXCEPCIONSOLNOVID = "motivoExcepcionSolNovMotivoExcepcionId";
    // Field (UsrAfiliacion_Id)
    /** <code>UsrAfiliacion_Id</code> field name. */
    public static final String FLD_FUNCIONARIOUSRAFILIACIONID = "UsrAfiliacion_Id";    
    /** <code>UsrAfiliacion.funcionarioId</code> attribute field name. */
    public static final String ATTR_FIELD_USRAFILIACION_FUNCIONARIOID = "funcionarioUsrAfiliacionId";
    // Field (Firma_Identificador)
    /** <code>Firma_Identificador</code> field name. */
    public static final String FLD_FIRMAFIRMAIDENTIFICADOR = "Firma_Identificador";    
    /** <code>Firma.firmaIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_FIRMA_FIRMAIDENTIFICADOR = "firmaFirmaIdentificador";
    // Field (NumRadicado)
    /** <code>NumRadicado</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADNUMRADICADO = "NumRadicado";    
    /** <code>solicitudNovedadNumRadicado</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADNUMRADICADO = "solicitudNovedadNumRadicado";
    // Field (FechaCreacion)
    /** <code>FechaCreacion</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADFECHACREACION = "FechaCreacion";    
    /** <code>solicitudNovedadFechaCreacion</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADFECHACREACION = "solicitudNovedadFechaCreacion";
    // Field (FechaVigencia)
    /** <code>FechaVigencia</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADFECHAVIGENCIA = "FechaVigencia";    
    /** <code>solicitudNovedadFechaVigencia</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADFECHAVIGENCIA = "solicitudNovedadFechaVigencia";
    // Field (NumContrato)
    /** <code>NumContrato</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADNUMCONTRATO = "NumContrato";    
    /** <code>NumContrato</code> field length. */
    public static final int FLD_SOLICITUDNOVEDADNUMCONTRATOLENGTH = 50;
    /** <code>solicitudNovedadNumContrato</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADNUMCONTRATO = "solicitudNovedadNumContrato";
    // Field (Excepcion)
    /** <code>Excepcion</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADEXCEPCION = "Excepcion";    
    /** <code>solicitudNovedadExcepcion</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADEXCEPCION = "solicitudNovedadExcepcion";
    // Field (FechaIniExcepcion)
    /** <code>FechaIniExcepcion</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADFECHAINIEXCEPCION = "FechaIniExcepcion";    
    /** <code>solicitudNovedadFechaIniExcepcion</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADFECHAINIEXCEPCION = "solicitudNovedadFechaIniExcepcion";
    // Field (FechaFinExcepcion)
    /** <code>FechaFinExcepcion</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADFECHAFINEXCEPCION = "FechaFinExcepcion";    
    /** <code>solicitudNovedadFechaFinExcepcion</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADFECHAFINEXCEPCION = "solicitudNovedadFechaFinExcepcion";
    // Field (CtrCodigoTarifa)
    /** <code>CtrCodigoTarifa</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADCTRCODIGOTARIFA = "CtrCodigoTarifa";    
    /** <code>CtrCodigoTarifa</code> field length. */
    public static final int FLD_SOLICITUDNOVEDADCTRCODIGOTARIFALENGTH = 12;
    /** <code>solicitudNovedadCtrCodigoTarifa</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADCTRCODIGOTARIFA = "solicitudNovedadCtrCodigoTarifa";
    // Field (CtrDescTarifa)
    /** <code>CtrDescTarifa</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADCTRDESCTARIFA = "CtrDescTarifa";    
    /** <code>CtrDescTarifa</code> field length. */
    public static final int FLD_SOLICITUDNOVEDADCTRDESCTARIFALENGTH = 100;
    /** <code>solicitudNovedadCtrDescTarifa</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADCTRDESCTARIFA = "solicitudNovedadCtrDescTarifa";
    // Field (CtrCodigoConvenio)
    /** <code>CtrCodigoConvenio</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADCTRCODIGOCONVENIO = "CtrCodigoConvenio";    
    /** <code>CtrCodigoConvenio</code> field length. */
    public static final int FLD_SOLICITUDNOVEDADCTRCODIGOCONVENIOLENGTH = 12;
    /** <code>solicitudNovedadCtrCodigoConvenio</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADCTRCODIGOCONVENIO = "solicitudNovedadCtrCodigoConvenio";
    // Field (CtrDescConvenio)
    /** <code>CtrDescConvenio</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADCTRDESCCONVENIO = "CtrDescConvenio";    
    /** <code>CtrDescConvenio</code> field length. */
    public static final int FLD_SOLICITUDNOVEDADCTRDESCCONVENIOLENGTH = 100;
    /** <code>solicitudNovedadCtrDescConvenio</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADCTRDESCCONVENIO = "solicitudNovedadCtrDescConvenio";
    // Field (CtrEsColectivo)
    /** <code>CtrEsColectivo</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADCTRESCOLECTIVO = "CtrEsColectivo";    
    /** <code>solicitudNovedadCtrEsColectivo</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADCTRESCOLECTIVO = "solicitudNovedadCtrEsColectivo";
    // Field (CtrTagCausaExclusion)
    /** <code>CtrTagCausaExclusion</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADCTRTAGCAUSAEXCLUSION = "CtrTagCausaExclusion";    
    /** <code>CtrTagCausaExclusion</code> field length. */
    public static final int FLD_SOLICITUDNOVEDADCTRTAGCAUSAEXCLUSIONLENGTH = 100;
    /** <code>solicitudNovedadCtrTagCausaExclusion</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADCTRTAGCAUSAEXCLUSION = "solicitudNovedadCtrTagCausaExclusion";
    // Field (ContraNumIden)
    /** <code>ContraNumIden</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADCONTRANUMIDEN = "ContraNumIden";    
    /** <code>ContraNumIden</code> field length. */
    public static final int FLD_SOLICITUDNOVEDADCONTRANUMIDENLENGTH = 60;
    /** <code>solicitudNovedadContraNumIden</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADCONTRANUMIDEN = "solicitudNovedadContraNumIden";
    // Field (ContraPrimerNombre)
    /** <code>ContraPrimerNombre</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADCONTRAPRIMERNOMBRE = "ContraPrimerNombre";    
    /** <code>ContraPrimerNombre</code> field length. */
    public static final int FLD_SOLICITUDNOVEDADCONTRAPRIMERNOMBRELENGTH = 50;
    /** <code>solicitudNovedadContraPrimerNombre</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADCONTRAPRIMERNOMBRE = "solicitudNovedadContraPrimerNombre";
    // Field (ContraSegundoNombre)
    /** <code>ContraSegundoNombre</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADCONTRASEGUNDONOMBRE = "ContraSegundoNombre";    
    /** <code>ContraSegundoNombre</code> field length. */
    public static final int FLD_SOLICITUDNOVEDADCONTRASEGUNDONOMBRELENGTH = 50;
    /** <code>solicitudNovedadContraSegundoNombre</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADCONTRASEGUNDONOMBRE = "solicitudNovedadContraSegundoNombre";
    // Field (ContraPrimerApellido)
    /** <code>ContraPrimerApellido</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADCONTRAPRIMERAPELLIDO = "ContraPrimerApellido";    
    /** <code>ContraPrimerApellido</code> field length. */
    public static final int FLD_SOLICITUDNOVEDADCONTRAPRIMERAPELLIDOLENGTH = 50;
    /** <code>solicitudNovedadContraPrimerApellido</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADCONTRAPRIMERAPELLIDO = "solicitudNovedadContraPrimerApellido";
    // Field (ContraSegundoApellido)
    /** <code>ContraSegundoApellido</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADCONTRASEGUNDOAPELLIDO = "ContraSegundoApellido";    
    /** <code>ContraSegundoApellido</code> field length. */
    public static final int FLD_SOLICITUDNOVEDADCONTRASEGUNDOAPELLIDOLENGTH = 50;
    /** <code>solicitudNovedadContraSegundoApellido</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADCONTRASEGUNDOAPELLIDO = "solicitudNovedadContraSegundoApellido";
    // Field (ContraRazonSocial)
    /** <code>ContraRazonSocial</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADCONTRARAZONSOCIAL = "ContraRazonSocial";    
    /** <code>ContraRazonSocial</code> field length. */
    public static final int FLD_SOLICITUDNOVEDADCONTRARAZONSOCIALLENGTH = 200;
    /** <code>solicitudNovedadContraRazonSocial</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADCONTRARAZONSOCIAL = "solicitudNovedadContraRazonSocial";
    // Field (FechaUltimoDoc)
    /** <code>FechaUltimoDoc</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADFECHAULTIMODOC = "FechaUltimoDoc";    
    /** <code>solicitudNovedadFechaUltimoDoc</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADFECHAULTIMODOC = "solicitudNovedadFechaUltimoDoc";
    // Field (Observacions)
    /** <code>Observacions</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADOBSERVACIONS = "Observacions";    
    /** <code>Observacions</code> field length. */
    public static final int FLD_SOLICITUDNOVEDADOBSERVACIONSLENGTH = 900;
    /** <code>solicitudNovedadObservacions</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADOBSERVACIONS = "solicitudNovedadObservacions";
    // Field (Estado)
    /** <code>Estado</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADESTADO = "Estado";    
    /** <code>solicitudNovedadEstado</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADESTADO = "solicitudNovedadEstado";
    // Field (EstadoDocumentacion)
    /** <code>EstadoDocumentacion</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADESTADODOCUMENTACION = "EstadoDocumentacion";    
    /** <code>solicitudNovedadEstadoDocumentacion</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADESTADODOCUMENTACION = "solicitudNovedadEstadoDocumentacion";
    // Field (Completada)
    /** <code>Completada</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADCOMPLETADA = "Completada";    
    /** <code>solicitudNovedadCompletada</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADCOMPLETADA = "solicitudNovedadCompletada";
    // Field (FechaCompletada)
    /** <code>FechaCompletada</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADFECHACOMPLETADA = "FechaCompletada";    
    /** <code>solicitudNovedadFechaCompletada</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADFECHACOMPLETADA = "solicitudNovedadFechaCompletada";
    // Field (CtrActivo)
    /** <code>CtrActivo</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADCTRACTIVO = "CtrActivo";    
    /** <code>solicitudNovedadCtrActivo</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADCTRACTIVO = "solicitudNovedadCtrActivo";
    // Field (CtrTipoContrato)
    /** <code>CtrTipoContrato</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADCTRTIPOCONTRATO = "CtrTipoContrato";    
    /** <code>solicitudNovedadCtrTipoContrato</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADCTRTIPOCONTRATO = "solicitudNovedadCtrTipoContrato";
    // Field (SCNumMeses)
    /** <code>SCNumMeses</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADSCNUMMESES = "SCNumMeses";    
    /** <code>solicitudNovedadSCNumMeses</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADSCNUMMESES = "solicitudNovedadSCNumMeses";
    // Field (ContraNuevaRazonSocial)
    /** <code>ContraNuevaRazonSocial</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADCONTRANUEVARAZONSOCIAL = "ContraNuevaRazonSocial";    
    /** <code>ContraNuevaRazonSocial</code> field length. */
    public static final int FLD_SOLICITUDNOVEDADCONTRANUEVARAZONSOCIALLENGTH = 200;
    /** <code>solicitudNovedadContraNuevaRazonSocial</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADCONTRANUEVARAZONSOCIAL = "solicitudNovedadContraNuevaRazonSocial";
    // Field (ContraTipoPersona)
    /** <code>ContraTipoPersona</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADCONTRATIPOPERSONA = "ContraTipoPersona";    
    /** <code>ContraTipoPersona</code> field length. */
    public static final int FLD_SOLICITUDNOVEDADCONTRATIPOPERSONALENGTH = 1;
    /** <code>solicitudNovedadContraTipoPersona</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADCONTRATIPOPERSONA = "solicitudNovedadContraTipoPersona";
    // Field (CtrFInicioContrato)
    /** <code>CtrFInicioContrato</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADCTRFINICIOCONTRATO = "CtrFInicioContrato";    
    /** <code>solicitudNovedadCtrFInicioContrato</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADCTRFINICIOCONTRATO = "solicitudNovedadCtrFInicioContrato";
    // Field (Prioridad)
    /** <code>Prioridad</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADPRIORIDAD = "Prioridad";    
    /** <code>solicitudNovedadPrioridad</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADPRIORIDAD = "solicitudNovedadPrioridad";
    // Field (FechaTerminada)
    /** <code>FechaTerminada</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADFECHATERMINADA = "FechaTerminada";    
    /** <code>solicitudNovedadFechaTerminada</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADFECHATERMINADA = "solicitudNovedadFechaTerminada";
    // Field (FechaFUG)
    /** <code>FechaFUG</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADFECHAFUG = "FechaFUG";    
    /** <code>solicitudNovedadFechaFUG</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADFECHAFUG = "solicitudNovedadFechaFUG";
    // Field (FechaFA)
    /** <code>FechaFA</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADFECHAFA = "FechaFA";    
    /** <code>solicitudNovedadFechaFA</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADFECHAFA = "solicitudNovedadFechaFA";
    // Field (SemaforoGrabAse)
    /** <code>SemaforoGrabAse</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADSEMAFOROGRABASE = "SemaforoGrabAse";    
    /** <code>solicitudNovedadSemaforoGrabAse</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDADSEMAFOROGRABASE = "solicitudNovedadSemaforoGrabAse";

    // Component role (PlanT)
    /** <code>PlanT</code> role id. */
    public static final String ROLE_ID_PLANT = "Agr_1581421953024930_Alias";
    /** <code>PlanT</code> role name. */
    public static final String ROLE_NAME_PLANT = "planT";
    /** <code>PlanT</code> role alias. */
    public static final String ROLE_ALIAS_PLANT = "Plan";

    /** <code>PlanT</code> inverse role name. */
    public static final String ROLE_INVNAME_PLANT = PlanesConstants.ROLE_NAME_SOLICITUDESNOVEDAD;
    /** <code>PlanT</code> role facet sequence. */
    public static final String PATH_FACETS_PLANT = "";
    /** <code>PlanT</code> role target class. */
    public static final String ROLE_TARGET_PLANT = PlanesConstants.CLASS_NAME;

    /** Agents allowed to navigate through PlanT **/
    public static final String PLANT_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Novedad)
    /** <code>Novedad</code> role id. */
    public static final String ROLE_ID_NOVEDAD = "Agr_1581421953024331_Alias";
    /** <code>Novedad</code> role name. */
    public static final String ROLE_NAME_NOVEDAD = "novedad";
    /** <code>Novedad</code> role alias. */
    public static final String ROLE_ALIAS_NOVEDAD = "Novedad";

    /** <code>Novedad</code> inverse role name. */
    public static final String ROLE_INVNAME_NOVEDAD = NovedadConstants.ROLE_NAME_SOLICITUDES;
    /** <code>Novedad</code> role facet sequence. */
    public static final String PATH_FACETS_NOVEDAD = "";
    /** <code>Novedad</code> role target class. */
    public static final String ROLE_TARGET_NOVEDAD = NovedadConstants.CLASS_NAME;

    /** Agents allowed to navigate through Novedad **/
    public static final String NOVEDAD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Causal)
    /** <code>Causal</code> role id. */
    public static final String ROLE_ID_CAUSAL = "Agr_1581422084096230_Alias";
    /** <code>Causal</code> role name. */
    public static final String ROLE_NAME_CAUSAL = "causal";
    /** <code>Causal</code> role alias. */
    public static final String ROLE_ALIAS_CAUSAL = "Causal";

    /** <code>Causal</code> inverse role name. */
    public static final String ROLE_INVNAME_CAUSAL = CausalConstants.ROLE_NAME_SOLICITUDES;
    /** <code>Causal</code> role facet sequence. */
    public static final String PATH_FACETS_CAUSAL = "";
    /** <code>Causal</code> role target class. */
    public static final String ROLE_TARGET_CAUSAL = CausalConstants.CLASS_NAME;

    /** Agents allowed to navigate through Causal **/
    public static final String CAUSAL_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (ProteccionDatos)
    /** <code>ProteccionDatos</code> role id. */
    public static final String ROLE_ID_PROTECCIONDATOS = "Agr_1581443186688699_Alias";
    /** <code>ProteccionDatos</code> role name. */
    public static final String ROLE_NAME_PROTECCIONDATOS = "proteccionDatos";
    /** <code>ProteccionDatos</code> role alias. */
    public static final String ROLE_ALIAS_PROTECCIONDATOS = "ProteccionDatos";

    /** <code>ProteccionDatos</code> inverse role name. */
    public static final String ROLE_INVNAME_PROTECCIONDATOS = ProteccionDatosConstants.ROLE_NAME_SOLICITUDNOVEDAD;
    /** <code>ProteccionDatos</code> role facet sequence. */
    public static final String PATH_FACETS_PROTECCIONDATOS = "";
    /** <code>ProteccionDatos</code> role target class. */
    public static final String ROLE_TARGET_PROTECCIONDATOS = ProteccionDatosConstants.CLASS_NAME;

    /** Agents allowed to navigate through ProteccionDatos **/
    public static final String PROTECCIONDATOS_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (TipoIdentContratante)
    /** <code>TipoIdentContratante</code> role id. */
    public static final String ROLE_ID_TIPOIDENTCONTRATANTE = "Agr_1581501251584749_Alias";
    /** <code>TipoIdentContratante</code> role name. */
    public static final String ROLE_NAME_TIPOIDENTCONTRATANTE = "tipoIdentContratante";
    /** <code>TipoIdentContratante</code> role alias. */
    public static final String ROLE_ALIAS_TIPOIDENTCONTRATANTE = "TipoIdentContratante";

    /** <code>TipoIdentContratante</code> inverse role name. */
    public static final String ROLE_INVNAME_TIPOIDENTCONTRATANTE = TipoIdentificacionConstants.ROLE_NAME_SOLICITUDESNOVEDAD;
    /** <code>TipoIdentContratante</code> role facet sequence. */
    public static final String PATH_FACETS_TIPOIDENTCONTRATANTE = "";
    /** <code>TipoIdentContratante</code> role target class. */
    public static final String ROLE_TARGET_TIPOIDENTCONTRATANTE = TipoIdentificacionConstants.CLASS_NAME;

    /** Agents allowed to navigate through TipoIdentContratante **/
    public static final String TIPOIDENTCONTRATANTE_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (EstadoContrato)
    /** <code>EstadoContrato</code> role id. */
    public static final String ROLE_ID_ESTADOCONTRATO = "Agr_1581501382656340_Alias";
    /** <code>EstadoContrato</code> role name. */
    public static final String ROLE_NAME_ESTADOCONTRATO = "estadoContrato";
    /** <code>EstadoContrato</code> role alias. */
    public static final String ROLE_ALIAS_ESTADOCONTRATO = "EstadoContrato";

    /** <code>EstadoContrato</code> inverse role name. */
    public static final String ROLE_INVNAME_ESTADOCONTRATO = EstadoContratoConstants.ROLE_NAME_SOLICITUDESNOVEDAD;
    /** <code>EstadoContrato</code> role facet sequence. */
    public static final String PATH_FACETS_ESTADOCONTRATO = "";
    /** <code>EstadoContrato</code> role target class. */
    public static final String ROLE_TARGET_ESTADOCONTRATO = EstadoContratoConstants.CLASS_NAME;

    /** Agents allowed to navigate through EstadoContrato **/
    public static final String ESTADOCONTRATO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (GrupoAsociado)
    /** <code>GrupoAsociado</code> role id. */
    public static final String ROLE_ID_GRUPOASOCIADO = "Agr_1581501513728324_Alias";
    /** <code>GrupoAsociado</code> role name. */
    public static final String ROLE_NAME_GRUPOASOCIADO = "grupoAsociado";
    /** <code>GrupoAsociado</code> role alias. */
    public static final String ROLE_ALIAS_GRUPOASOCIADO = "GrupoAsociado";

    /** <code>GrupoAsociado</code> inverse role name. */
    public static final String ROLE_INVNAME_GRUPOASOCIADO = GrupoAsociadoConstants.ROLE_NAME_SOLICITUDESNOVEDAD;
    /** <code>GrupoAsociado</code> role facet sequence. */
    public static final String PATH_FACETS_GRUPOASOCIADO = "";
    /** <code>GrupoAsociado</code> role target class. */
    public static final String ROLE_TARGET_GRUPOASOCIADO = GrupoAsociadoConstants.CLASS_NAME;

    /** Agents allowed to navigate through GrupoAsociado **/
    public static final String GRUPOASOCIADO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Periodicidad)
    /** <code>Periodicidad</code> role id. */
    public static final String ROLE_ID_PERIODICIDAD = "Agr_1581507280896906_Alias";
    /** <code>Periodicidad</code> role name. */
    public static final String ROLE_NAME_PERIODICIDAD = "periodicidad";
    /** <code>Periodicidad</code> role alias. */
    public static final String ROLE_ALIAS_PERIODICIDAD = "Periodicidad";

    /** <code>Periodicidad</code> inverse role name. */
    public static final String ROLE_INVNAME_PERIODICIDAD = PeriodicidadConstants.ROLE_NAME_SOLICITUDESNOVEDAD;
    /** <code>Periodicidad</code> role facet sequence. */
    public static final String PATH_FACETS_PERIODICIDAD = "";
    /** <code>Periodicidad</code> role target class. */
    public static final String ROLE_TARGET_PERIODICIDAD = PeriodicidadConstants.CLASS_NAME;

    /** Agents allowed to navigate through Periodicidad **/
    public static final String PERIODICIDAD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Agente)
    /** <code>Agente</code> role id. */
    public static final String ROLE_ID_AGENTE = "Agr_1583235989504901_Alias";
    /** <code>Agente</code> role name. */
    public static final String ROLE_NAME_AGENTE = "agente";
    /** <code>Agente</code> role alias. */
    public static final String ROLE_ALIAS_AGENTE = "Agente";

    /** <code>Agente</code> inverse role name. */
    public static final String ROLE_INVNAME_AGENTE = FuncionarioConstants.ROLE_NAME_SOLICITUDESNOVEDAD;
    /** <code>Agente</code> role facet sequence. */
    public static final String PATH_FACETS_AGENTE = "";
    /** <code>Agente</code> role target class. */
    public static final String ROLE_TARGET_AGENTE = FuncionarioConstants.CLASS_NAME;

    /** Agents allowed to navigate through Agente **/
    public static final String AGENTE_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (PeriodicidadNueva)
    /** <code>PeriodicidadNueva</code> role id. */
    public static final String ROLE_ID_PERIODICIDADNUEVA = "Agr_1583317254144094_Alias";
    /** <code>PeriodicidadNueva</code> role name. */
    public static final String ROLE_NAME_PERIODICIDADNUEVA = "periodicidadNueva";
    /** <code>PeriodicidadNueva</code> role alias. */
    public static final String ROLE_ALIAS_PERIODICIDADNUEVA = "Nueva Periodicidad";

    /** <code>PeriodicidadNueva</code> inverse role name. */
    public static final String ROLE_INVNAME_PERIODICIDADNUEVA = PeriodicidadConstants.ROLE_NAME_SOLICITUDESNOVEDADNUEVA;
    /** <code>PeriodicidadNueva</code> role facet sequence. */
    public static final String PATH_FACETS_PERIODICIDADNUEVA = "";
    /** <code>PeriodicidadNueva</code> role target class. */
    public static final String ROLE_TARGET_PERIODICIDADNUEVA = PeriodicidadConstants.CLASS_NAME;

    /** Agents allowed to navigate through PeriodicidadNueva **/
    public static final String PERIODICIDADNUEVA_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (MotivoExcepcion)
    /** <code>MotivoExcepcion</code> role id. */
    public static final String ROLE_ID_MOTIVOEXCEPCION = "Agr_1583337046016101_Alias";
    /** <code>MotivoExcepcion</code> role name. */
    public static final String ROLE_NAME_MOTIVOEXCEPCION = "motivoExcepcion";
    /** <code>MotivoExcepcion</code> role alias. */
    public static final String ROLE_ALIAS_MOTIVOEXCEPCION = "Motivo Excepción";

    /** <code>MotivoExcepcion</code> inverse role name. */
    public static final String ROLE_INVNAME_MOTIVOEXCEPCION = MotivoExcepcionSolNovConstants.ROLE_NAME_SOLICITUDES;
    /** <code>MotivoExcepcion</code> role facet sequence. */
    public static final String PATH_FACETS_MOTIVOEXCEPCION = "";
    /** <code>MotivoExcepcion</code> role target class. */
    public static final String ROLE_TARGET_MOTIVOEXCEPCION = MotivoExcepcionSolNovConstants.CLASS_NAME;

    /** Agents allowed to navigate through MotivoExcepcion **/
    public static final String MOTIVOEXCEPCION_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (UsrAfiliacion)
    /** <code>UsrAfiliacion</code> role id. */
    public static final String ROLE_ID_USRAFILIACION = "Agr_1586855411712406_Alias";
    /** <code>UsrAfiliacion</code> role name. */
    public static final String ROLE_NAME_USRAFILIACION = "usrAfiliacion";
    /** <code>UsrAfiliacion</code> role alias. */
    public static final String ROLE_ALIAS_USRAFILIACION = "Afiliación";

    /** <code>UsrAfiliacion</code> inverse role name. */
    public static final String ROLE_INVNAME_USRAFILIACION = FuncionarioConstants.ROLE_NAME_SOLNOVAIFLIACIONES;
    /** <code>UsrAfiliacion</code> role facet sequence. */
    public static final String PATH_FACETS_USRAFILIACION = "";
    /** <code>UsrAfiliacion</code> role target class. */
    public static final String ROLE_TARGET_USRAFILIACION = FuncionarioConstants.CLASS_NAME;

    /** Agents allowed to navigate through UsrAfiliacion **/
    public static final String USRAFILIACION_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Firma)
    /** <code>Firma</code> role id. */
    public static final String ROLE_ID_FIRMA = "Agr_1594054934528630_Alias";
    /** <code>Firma</code> role name. */
    public static final String ROLE_NAME_FIRMA = "firma";
    /** <code>Firma</code> role alias. */
    public static final String ROLE_ALIAS_FIRMA = "Firma";

    /** <code>Firma</code> inverse role name. */
    public static final String ROLE_INVNAME_FIRMA = FirmaConstants.ROLE_NAME_SOLICITUDNOVEDAD;
    /** <code>Firma</code> role facet sequence. */
    public static final String PATH_FACETS_FIRMA = "";
    /** <code>Firma</code> role target class. */
    public static final String ROLE_TARGET_FIRMA = FirmaConstants.CLASS_NAME;

    /** Agents allowed to navigate through Firma **/
    public static final String FIRMA_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";

    // Compound role (Familias)
    /** <code>Familias</code> role id. */
    public static final String ROLE_ID_FAMILIAS = "Agr_1581424574464531_Alias";
    /** <code>Familias</code> role name. */
    public static final String ROLE_NAME_FAMILIAS = "familias";
    /** <code>Solicitud</code> role alias. */
    public static final String ROLE_ALIAS_FAMILIAS = "Familias";


    /** <code>Familias</code> inverse role name. */
    public static final String ROLE_INVNAME_FAMILIAS = FamiliaNovedadConstants.ROLE_NAME_SOLICITUD;
    /** <code>Familias</code> role facet sequence. */
    public static final String PATH_FACETS_FAMILIAS = "";
    /** <code>Familias</code> role target class. */
    public static final String ROLE_TARGET_FAMILIAS = FamiliaNovedadConstants.CLASS_NAME;
    /** Agents allowed to navigate through Familias **/
    public static final String FAMILIAS_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (Documentos)
    /** <code>Documentos</code> role id. */
    public static final String ROLE_ID_DOCUMENTOS = "Agr_1583333376000677_Alias";
    /** <code>Documentos</code> role name. */
    public static final String ROLE_NAME_DOCUMENTOS = "documentos";
    /** <code>Solicitud</code> role alias. */
    public static final String ROLE_ALIAS_DOCUMENTOS = "Documentos";


    /** <code>Documentos</code> inverse role name. */
    public static final String ROLE_INVNAME_DOCUMENTOS = DocumentoNovedadConstants.ROLE_NAME_SOLICITUD;
    /** <code>Documentos</code> role facet sequence. */
    public static final String PATH_FACETS_DOCUMENTOS = "";
    /** <code>Documentos</code> role target class. */
    public static final String ROLE_TARGET_DOCUMENTOS = DocumentoNovedadConstants.CLASS_NAME;
    /** Agents allowed to navigate through Documentos **/
    public static final String DOCUMENTOS_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (LogEstados)
    /** <code>LogEstados</code> role id. */
    public static final String ROLE_ID_LOGESTADOS = "Agr_1583331278848989_Alias";
    /** <code>LogEstados</code> role name. */
    public static final String ROLE_NAME_LOGESTADOS = "logEstados";
    /** <code>SolicitudNovedad</code> role alias. */
    public static final String ROLE_ALIAS_LOGESTADOS = "Log Estados";


    /** <code>LogEstados</code> inverse role name. */
    public static final String ROLE_INVNAME_LOGESTADOS = LogEstadoSNConstants.ROLE_NAME_SOLICITUDNOVEDAD;
    /** <code>LogEstados</code> role facet sequence. */
    public static final String PATH_FACETS_LOGESTADOS = "";
    /** <code>LogEstados</code> role target class. */
    public static final String ROLE_TARGET_LOGESTADOS = LogEstadoSNConstants.CLASS_NAME;
    /** Agents allowed to navigate through LogEstados **/
    public static final String LOGESTADOS_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (LogUsrSolNov)
    /** <code>LogUsrSolNov</code> role id. */
    public static final String ROLE_ID_LOGUSRSOLNOV = "Agr_1586856329216478_Alias";
    /** <code>LogUsrSolNov</code> role name. */
    public static final String ROLE_NAME_LOGUSRSOLNOV = "logUsrSolNov";
    /** <code>SolicitudNovedad</code> role alias. */
    public static final String ROLE_ALIAS_LOGUSRSOLNOV = "LogUsrSolNov";


    /** <code>LogUsrSolNov</code> inverse role name. */
    public static final String ROLE_INVNAME_LOGUSRSOLNOV = LogUsrSolNovConstants.ROLE_NAME_SOLICITUDNOVEDAD;
    /** <code>LogUsrSolNov</code> role facet sequence. */
    public static final String PATH_FACETS_LOGUSRSOLNOV = "";
    /** <code>LogUsrSolNov</code> role target class. */
    public static final String ROLE_TARGET_LOGUSRSOLNOV = LogUsrSolNovConstants.CLASS_NAME;
    /** Agents allowed to navigate through LogUsrSolNov **/
    public static final String LOGUSRSOLNOV_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1581421428736234Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadcrearpagrPlanT</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDNOVEDADCREARPAGRPLANT = "p_agrPlanT";
    /** <code>solicitudNovedadcrearpagrPlanT</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDNOVEDADCREARPAGRPLANT = "Clas_1581421428736234Ser_1Arg_2_Alias";
    /** <code>solicitudNovedadcrearpagrPlanT</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDNOVEDADCREARPAGRPLANT = "Plan";
    /** <code>solicitudNovedadcrearpagrNovedad</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDNOVEDADCREARPAGRNOVEDAD = "p_agrNovedad";
    /** <code>solicitudNovedadcrearpagrNovedad</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDNOVEDADCREARPAGRNOVEDAD = "Clas_1581421428736234Ser_1Arg_3_Alias";
    /** <code>solicitudNovedadcrearpagrNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDNOVEDADCREARPAGRNOVEDAD = "Novedad";
    /** <code>solicitudNovedadcrearpagrCausal</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDNOVEDADCREARPAGRCAUSAL = "p_agrCausal";
    /** <code>solicitudNovedadcrearpagrCausal</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDNOVEDADCREARPAGRCAUSAL = "Clas_1581421428736234Ser_1Arg_4_Alias";
    /** <code>solicitudNovedadcrearpagrCausal</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDNOVEDADCREARPAGRCAUSAL = "Causal";
    /** <code>solicitudNovedadcrearpagrProteccionDatos</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDNOVEDADCREARPAGRPROTECCIONDATOS = "p_agrProteccionDatos";
    /** <code>solicitudNovedadcrearpagrProteccionDatos</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDNOVEDADCREARPAGRPROTECCIONDATOS = "Clas_1581421428736234Ser_1Arg_10_Alias";
    /** <code>solicitudNovedadcrearpagrProteccionDatos</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDNOVEDADCREARPAGRPROTECCIONDATOS = "ProteccionDatos";
    /** <code>solicitudNovedadcrearpagrTipoIdentContratante</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDNOVEDADCREARPAGRTIPOIDENTCONTRATANTE = "p_agrTipoIdentContratante";
    /** <code>solicitudNovedadcrearpagrTipoIdentContratante</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDNOVEDADCREARPAGRTIPOIDENTCONTRATANTE = "Clas_1581421428736234Ser_1Arg_11_Alias";
    /** <code>solicitudNovedadcrearpagrTipoIdentContratante</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDNOVEDADCREARPAGRTIPOIDENTCONTRATANTE = "TipoIdentContratante";
    /** <code>solicitudNovedadcrearpagrEstadoContrato</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDNOVEDADCREARPAGRESTADOCONTRATO = "p_agrEstadoContrato";
    /** <code>solicitudNovedadcrearpagrEstadoContrato</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDNOVEDADCREARPAGRESTADOCONTRATO = "Clas_1581421428736234Ser_1Arg_12_Alias";
    /** <code>solicitudNovedadcrearpagrEstadoContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDNOVEDADCREARPAGRESTADOCONTRATO = "EstadoContrato";
    /** <code>solicitudNovedadcrearpagrGrupoAsociado</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDNOVEDADCREARPAGRGRUPOASOCIADO = "p_agrGrupoAsociado";
    /** <code>solicitudNovedadcrearpagrGrupoAsociado</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDNOVEDADCREARPAGRGRUPOASOCIADO = "Clas_1581421428736234Ser_1Arg_13_Alias";
    /** <code>solicitudNovedadcrearpagrGrupoAsociado</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDNOVEDADCREARPAGRGRUPOASOCIADO = "GrupoAsociado";
    /** <code>solicitudNovedadcrearpagrPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDNOVEDADCREARPAGRPERIODICIDAD = "p_agrPeriodicidad";
    /** <code>solicitudNovedadcrearpagrPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDNOVEDADCREARPAGRPERIODICIDAD = "Clas_1581421428736234Ser_1Arg_14_Alias";
    /** <code>solicitudNovedadcrearpagrPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDNOVEDADCREARPAGRPERIODICIDAD = "Periodicidad";
    /** <code>solicitudNovedadcrearpagrAgente</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDNOVEDADCREARPAGRAGENTE = "p_agrAgente";
    /** <code>solicitudNovedadcrearpagrAgente</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDNOVEDADCREARPAGRAGENTE = "Clas_1581421428736234Ser_1Arg_17_Alias";
    /** <code>solicitudNovedadcrearpagrAgente</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDNOVEDADCREARPAGRAGENTE = "Agente";
    /** <code>solicitudNovedadcrearpagrPeriodicidadNueva</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDNOVEDADCREARPAGRPERIODICIDADNUEVA = "p_agrPeriodicidadNueva";
    /** <code>solicitudNovedadcrearpagrPeriodicidadNueva</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDNOVEDADCREARPAGRPERIODICIDADNUEVA = "Clas_1581421428736234Ser_1Arg_18_Alias";
    /** <code>solicitudNovedadcrearpagrPeriodicidadNueva</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDNOVEDADCREARPAGRPERIODICIDADNUEVA = "Nueva Periodicidad";
    /** <code>solicitudNovedadcrearpagrMotivoExcepcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDNOVEDADCREARPAGRMOTIVOEXCEPCION = "p_agrMotivoExcepcion";
    /** <code>solicitudNovedadcrearpagrMotivoExcepcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDNOVEDADCREARPAGRMOTIVOEXCEPCION = "Clas_1581421428736234Ser_1Arg_20_Alias";
    /** <code>solicitudNovedadcrearpagrMotivoExcepcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDNOVEDADCREARPAGRMOTIVOEXCEPCION = "Motivo Excepción";
    /** <code>solicitudNovedadcrearpagrUsrAfiliacion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDNOVEDADCREARPAGRUSRAFILIACION = "p_agrUsrAfiliacion";
    /** <code>solicitudNovedadcrearpagrUsrAfiliacion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDNOVEDADCREARPAGRUSRAFILIACION = "Clas_1581421428736234Ser_1Arg_23_Alias";
    /** <code>solicitudNovedadcrearpagrUsrAfiliacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDNOVEDADCREARPAGRUSRAFILIACION = "Afiliación";
    /** <code>solicitudNovedadcrearpagrFirma</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDNOVEDADCREARPAGRFIRMA = "p_agrFirma";
    /** <code>solicitudNovedadcrearpagrFirma</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDNOVEDADCREARPAGRFIRMA = "Clas_1581421428736234Ser_1Arg_25_Alias";
    /** <code>solicitudNovedadcrearpagrFirma</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDNOVEDADCREARPAGRFIRMA = "Firma";
    /** <code>solicitudNovedadcrearpatrFechaVigencia</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDNOVEDADCREARPATRFECHAVIGENCIA = "p_atrFechaVigencia";
    /** <code>solicitudNovedadcrearpatrFechaVigencia</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDNOVEDADCREARPATRFECHAVIGENCIA = "Clas_1581421428736234Ser_1Arg_5_Alias";
    /** <code>solicitudNovedadcrearpatrFechaVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDNOVEDADCREARPATRFECHAVIGENCIA = "Fecha de vigencia";
    /** <code>solicitudNovedadcrearpatrNumContrato</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDNOVEDADCREARPATRNUMCONTRATO = "p_atrNumContrato";
    /** <code>solicitudNovedadcrearpatrNumContrato</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDNOVEDADCREARPATRNUMCONTRATO = "Clas_1581421428736234Ser_1Arg_6_Alias";
    /** <code>solicitudNovedadcrearpatrNumContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDNOVEDADCREARPATRNUMCONTRATO = "Nº Contrato";
    /** <code>solicitudNovedadcrearpatrExcepcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDNOVEDADCREARPATREXCEPCION = "p_atrExcepcion";
    /** <code>solicitudNovedadcrearpatrExcepcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDNOVEDADCREARPATREXCEPCION = "Clas_1581421428736234Ser_1Arg_19_Alias";
    /** <code>solicitudNovedadcrearpatrExcepcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDNOVEDADCREARPATREXCEPCION = "Excepción";
    /** <code>solicitudNovedadcrearpatrFechaIniExcepcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDNOVEDADCREARPATRFECHAINIEXCEPCION = "p_atrFechaIniExcepcion";
    /** <code>solicitudNovedadcrearpatrFechaIniExcepcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDNOVEDADCREARPATRFECHAINIEXCEPCION = "Clas_1581421428736234Ser_1Arg_21_Alias";
    /** <code>solicitudNovedadcrearpatrFechaIniExcepcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDNOVEDADCREARPATRFECHAINIEXCEPCION = "Fecha Inicio";
    /** <code>solicitudNovedadcrearpatrFechaFinExcepcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SOLICITUDNOVEDADCREARPATRFECHAFINEXCEPCION = "p_atrFechaFinExcepcion";
    /** <code>solicitudNovedadcrearpatrFechaFinExcepcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SOLICITUDNOVEDADCREARPATRFECHAFINEXCEPCION = "Clas_1581421428736234Ser_1Arg_22_Alias";
    /** <code>solicitudNovedadcrearpatrFechaFinExcepcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SOLICITUDNOVEDADCREARPATRFECHAFINEXCEPCION = "Fecha Fin";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1581421428736234Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadeliminarpthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_SOLICITUDNOVEDADELIMINARPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadeliminarpthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_SOLICITUDNOVEDADELIMINARPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_2Arg_1_Alias";
    /** <code>solicitudNovedadeliminarpthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_SOLICITUDNOVEDADELIMINARPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    // Service (setValoresDesdeContrato)
    /** <code>setValoresDesdeContrato</code> service id. */
    public static final String SERV_ID_SETVALORESDESDECONTRATO = "Clas_1581421428736234Ser_4_Alias";
    /** <code>setValoresDesdeContrato</code> service name. */
    public static final String SERV_NAME_SETVALORESDESDECONTRATO = "setValoresDesdeContrato";
    /** <code>setValoresDesdeContrato</code> service alias. */
    public static final String SERV_ALIAS_SETVALORESDESDECONTRATO = "setValoresDesdeContrato";
    /** Agents allowed to execute the service setValoresDesdeContrato **/
    public static final String SETVALORESDESDECONTRATO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadsetValoresDesdeContratopthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadsetValoresDesdeContratopthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_4Arg_1_Alias";
    /** <code>solicitudNovedadsetValoresDesdeContratopthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    /** <code>solicitudNovedadsetValoresDesdeContratopCtrCodigoTarifa</code> inbound argument name. */
    public static final String ARG_NAME_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCTRCODIGOTARIFA = "p_CtrCodigoTarifa";
    /** <code>solicitudNovedadsetValoresDesdeContratopCtrCodigoTarifa</code> inbound argument id. */
    public static final String ARG_ID_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCTRCODIGOTARIFA = "Clas_1581421428736234Ser_4Arg_4_Alias";
    /** <code>solicitudNovedadsetValoresDesdeContratopCtrCodigoTarifa</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCTRCODIGOTARIFA = "Código Tarifa";
    /** <code>solicitudNovedadsetValoresDesdeContratopCtrDescTarifa</code> inbound argument name. */
    public static final String ARG_NAME_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCTRDESCTARIFA = "p_CtrDescTarifa";
    /** <code>solicitudNovedadsetValoresDesdeContratopCtrDescTarifa</code> inbound argument id. */
    public static final String ARG_ID_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCTRDESCTARIFA = "Clas_1581421428736234Ser_4Arg_5_Alias";
    /** <code>solicitudNovedadsetValoresDesdeContratopCtrDescTarifa</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCTRDESCTARIFA = "Descripción Tarifa";
    /** <code>solicitudNovedadsetValoresDesdeContratopCtrCodigoConvenio</code> inbound argument name. */
    public static final String ARG_NAME_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCTRCODIGOCONVENIO = "p_CtrCodigoConvenio";
    /** <code>solicitudNovedadsetValoresDesdeContratopCtrCodigoConvenio</code> inbound argument id. */
    public static final String ARG_ID_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCTRCODIGOCONVENIO = "Clas_1581421428736234Ser_4Arg_6_Alias";
    /** <code>solicitudNovedadsetValoresDesdeContratopCtrCodigoConvenio</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCTRCODIGOCONVENIO = "Código Convenio";
    /** <code>solicitudNovedadsetValoresDesdeContratopCtrDescConvenio</code> inbound argument name. */
    public static final String ARG_NAME_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCTRDESCCONVENIO = "p_CtrDescConvenio";
    /** <code>solicitudNovedadsetValoresDesdeContratopCtrDescConvenio</code> inbound argument id. */
    public static final String ARG_ID_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCTRDESCCONVENIO = "Clas_1581421428736234Ser_4Arg_7_Alias";
    /** <code>solicitudNovedadsetValoresDesdeContratopCtrDescConvenio</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCTRDESCCONVENIO = "Descripción Convenio";
    /** <code>solicitudNovedadsetValoresDesdeContratopCtrEsColectivo</code> inbound argument name. */
    public static final String ARG_NAME_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCTRESCOLECTIVO = "p_CtrEsColectivo";
    /** <code>solicitudNovedadsetValoresDesdeContratopCtrEsColectivo</code> inbound argument id. */
    public static final String ARG_ID_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCTRESCOLECTIVO = "Clas_1581421428736234Ser_4Arg_8_Alias";
    /** <code>solicitudNovedadsetValoresDesdeContratopCtrEsColectivo</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCTRESCOLECTIVO = "Contrato colectivo";
    /** <code>solicitudNovedadsetValoresDesdeContratopContraNumIden</code> inbound argument name. */
    public static final String ARG_NAME_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCONTRANUMIDEN = "p_ContraNumIden";
    /** <code>solicitudNovedadsetValoresDesdeContratopContraNumIden</code> inbound argument id. */
    public static final String ARG_ID_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCONTRANUMIDEN = "Clas_1581421428736234Ser_4Arg_9_Alias";
    /** <code>solicitudNovedadsetValoresDesdeContratopContraNumIden</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCONTRANUMIDEN = "Nº Identifiación";
    /** <code>solicitudNovedadsetValoresDesdeContratopContraPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCONTRAPRIMERNOMBRE = "p_ContraPrimerNombre";
    /** <code>solicitudNovedadsetValoresDesdeContratopContraPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCONTRAPRIMERNOMBRE = "Clas_1581421428736234Ser_4Arg_10_Alias";
    /** <code>solicitudNovedadsetValoresDesdeContratopContraPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCONTRAPRIMERNOMBRE = "Primer Nombre";
    /** <code>solicitudNovedadsetValoresDesdeContratopContraSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCONTRASEGUNDONOMBRE = "p_ContraSegundoNombre";
    /** <code>solicitudNovedadsetValoresDesdeContratopContraSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCONTRASEGUNDONOMBRE = "Clas_1581421428736234Ser_4Arg_11_Alias";
    /** <code>solicitudNovedadsetValoresDesdeContratopContraSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCONTRASEGUNDONOMBRE = "Segundo Nombre";
    /** <code>solicitudNovedadsetValoresDesdeContratopContraPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCONTRAPRIMERAPELLIDO = "p_ContraPrimerApellido";
    /** <code>solicitudNovedadsetValoresDesdeContratopContraPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCONTRAPRIMERAPELLIDO = "Clas_1581421428736234Ser_4Arg_12_Alias";
    /** <code>solicitudNovedadsetValoresDesdeContratopContraPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCONTRAPRIMERAPELLIDO = "Primer Apellido";
    /** <code>solicitudNovedadsetValoresDesdeContratopContraSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCONTRASEGUNDOAPELLIDO = "p_ContraSegundoApellido";
    /** <code>solicitudNovedadsetValoresDesdeContratopContraSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCONTRASEGUNDOAPELLIDO = "Clas_1581421428736234Ser_4Arg_13_Alias";
    /** <code>solicitudNovedadsetValoresDesdeContratopContraSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCONTRASEGUNDOAPELLIDO = "Segundo Apellido";
    /** <code>solicitudNovedadsetValoresDesdeContratopCtrTagCausaExclusion</code> inbound argument name. */
    public static final String ARG_NAME_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCTRTAGCAUSAEXCLUSION = "p_CtrTagCausaExclusion";
    /** <code>solicitudNovedadsetValoresDesdeContratopCtrTagCausaExclusion</code> inbound argument id. */
    public static final String ARG_ID_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCTRTAGCAUSAEXCLUSION = "Clas_1581421428736234Ser_4Arg_14_Alias";
    /** <code>solicitudNovedadsetValoresDesdeContratopCtrTagCausaExclusion</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCTRTAGCAUSAEXCLUSION = "Segundo Apellido";
    /** <code>solicitudNovedadsetValoresDesdeContratopContraRazonSocial</code> inbound argument name. */
    public static final String ARG_NAME_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCONTRARAZONSOCIAL = "p_ContraRazonSocial";
    /** <code>solicitudNovedadsetValoresDesdeContratopContraRazonSocial</code> inbound argument id. */
    public static final String ARG_ID_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCONTRARAZONSOCIAL = "Clas_1581421428736234Ser_4Arg_15_Alias";
    /** <code>solicitudNovedadsetValoresDesdeContratopContraRazonSocial</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCONTRARAZONSOCIAL = "Razón Social";
    /** <code>solicitudNovedadsetValoresDesdeContratopCtrActivo</code> inbound argument name. */
    public static final String ARG_NAME_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCTRACTIVO = "pCtrActivo";
    /** <code>solicitudNovedadsetValoresDesdeContratopCtrActivo</code> inbound argument id. */
    public static final String ARG_ID_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCTRACTIVO = "Clas_1581421428736234Ser_4Arg_16_Alias";
    /** <code>solicitudNovedadsetValoresDesdeContratopCtrActivo</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCTRACTIVO = "Contrato activo";
    /** <code>solicitudNovedadsetValoresDesdeContratopContraTipoPersona</code> inbound argument name. */
    public static final String ARG_NAME_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCONTRATIPOPERSONA = "p_ContraTipoPersona";
    /** <code>solicitudNovedadsetValoresDesdeContratopContraTipoPersona</code> inbound argument id. */
    public static final String ARG_ID_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCONTRATIPOPERSONA = "Clas_1581421428736234Ser_4Arg_17_Alias";
    /** <code>solicitudNovedadsetValoresDesdeContratopContraTipoPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCONTRATIPOPERSONA = "Tipo Persona";
    /** <code>solicitudNovedadsetValoresDesdeContratopatrCtrFInicioContrato</code> inbound argument name. */
    public static final String ARG_NAME_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPATRCTRFINICIOCONTRATO = "p_atrCtrFInicioContrato";
    /** <code>solicitudNovedadsetValoresDesdeContratopatrCtrFInicioContrato</code> inbound argument id. */
    public static final String ARG_ID_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPATRCTRFINICIOCONTRATO = "Clas_1581421428736234Ser_4Arg_18_Alias";
    /** <code>solicitudNovedadsetValoresDesdeContratopatrCtrFInicioContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPATRCTRFINICIOCONTRATO = "F. Inicio Contrato";
    /** <code>solicitudNovedadsetValoresDesdeContratopCtrTipoContrato</code> inbound argument name. */
    public static final String ARG_NAME_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCTRTIPOCONTRATO = "p_CtrTipoContrato";
    /** <code>solicitudNovedadsetValoresDesdeContratopCtrTipoContrato</code> inbound argument id. */
    public static final String ARG_ID_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCTRTIPOCONTRATO = "Clas_1581421428736234Ser_4Arg_19_Alias";
    /** <code>solicitudNovedadsetValoresDesdeContratopCtrTipoContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETVALORESDESDECONTRATO_SOLICITUDNOVEDADSETVALORESDESDECONTRATOPCTRTIPOCONTRATO = "Tipo contrato";
    // Service (InsTipoIdentContratante)
    /** <code>InsTipoIdentContratante</code> service id. */
    public static final String SERV_ID_INSTIPOIDENTCONTRATANTE = "Clas_1581421428736234Ser_6_Alias";
    /** <code>InsTipoIdentContratante</code> service name. */
    public static final String SERV_NAME_INSTIPOIDENTCONTRATANTE = "InsTipoIdentContratante";
    /** <code>InsTipoIdentContratante</code> service alias. */
    public static final String SERV_ALIAS_INSTIPOIDENTCONTRATANTE = "InsTipoIdentContratante";
    /** Agents allowed to execute the service InsTipoIdentContratante **/
    public static final String INSTIPOIDENTCONTRATANTE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadInsTipoIdentContratantepthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPOIDENTCONTRATANTE_SOLICITUDNOVEDADINSTIPOIDENTCONTRATANTEPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadInsTipoIdentContratantepthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_INSTIPOIDENTCONTRATANTE_SOLICITUDNOVEDADINSTIPOIDENTCONTRATANTEPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_6Arg_1_Alias";
    /** <code>solicitudNovedadInsTipoIdentContratantepthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPOIDENTCONTRATANTE_SOLICITUDNOVEDADINSTIPOIDENTCONTRATANTEPTHISSOLICITUDNOVEDAD = "Solicitudes Novedad";
    /** <code>solicitudNovedadInsTipoIdentContratantepevcTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPOIDENTCONTRATANTE_SOLICITUDNOVEDADINSTIPOIDENTCONTRATANTEPEVCTIPOIDENTIFICACION = "p_evcTipoIdentificacion";
    /** <code>solicitudNovedadInsTipoIdentContratantepevcTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_INSTIPOIDENTCONTRATANTE_SOLICITUDNOVEDADINSTIPOIDENTCONTRATANTEPEVCTIPOIDENTIFICACION = "Clas_1581421428736234Ser_6Arg_2_Alias";
    /** <code>solicitudNovedadInsTipoIdentContratantepevcTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPOIDENTCONTRATANTE_SOLICITUDNOVEDADINSTIPOIDENTCONTRATANTEPEVCTIPOIDENTIFICACION = "TipoIdentContratante";
    // Service (DelTipoIdentContratante)
    /** <code>DelTipoIdentContratante</code> service id. */
    public static final String SERV_ID_DELTIPOIDENTCONTRATANTE = "Clas_1581421428736234Ser_7_Alias";
    /** <code>DelTipoIdentContratante</code> service name. */
    public static final String SERV_NAME_DELTIPOIDENTCONTRATANTE = "DelTipoIdentContratante";
    /** <code>DelTipoIdentContratante</code> service alias. */
    public static final String SERV_ALIAS_DELTIPOIDENTCONTRATANTE = "DelTipoIdentContratante";
    /** Agents allowed to execute the service DelTipoIdentContratante **/
    public static final String DELTIPOIDENTCONTRATANTE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadDelTipoIdentContratantepthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPOIDENTCONTRATANTE_SOLICITUDNOVEDADDELTIPOIDENTCONTRATANTEPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadDelTipoIdentContratantepthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_DELTIPOIDENTCONTRATANTE_SOLICITUDNOVEDADDELTIPOIDENTCONTRATANTEPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_7Arg_1_Alias";
    /** <code>solicitudNovedadDelTipoIdentContratantepthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPOIDENTCONTRATANTE_SOLICITUDNOVEDADDELTIPOIDENTCONTRATANTEPTHISSOLICITUDNOVEDAD = "Solicitudes Novedad";
    /** <code>solicitudNovedadDelTipoIdentContratantepevcTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPOIDENTCONTRATANTE_SOLICITUDNOVEDADDELTIPOIDENTCONTRATANTEPEVCTIPOIDENTIFICACION = "p_evcTipoIdentificacion";
    /** <code>solicitudNovedadDelTipoIdentContratantepevcTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_DELTIPOIDENTCONTRATANTE_SOLICITUDNOVEDADDELTIPOIDENTCONTRATANTEPEVCTIPOIDENTIFICACION = "Clas_1581421428736234Ser_7Arg_2_Alias";
    /** <code>solicitudNovedadDelTipoIdentContratantepevcTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPOIDENTCONTRATANTE_SOLICITUDNOVEDADDELTIPOIDENTCONTRATANTEPEVCTIPOIDENTIFICACION = "TipoIdentContratante";
    // Service (InsEstadoContrato)
    /** <code>InsEstadoContrato</code> service id. */
    public static final String SERV_ID_INSESTADOCONTRATO = "Clas_1581421428736234Ser_8_Alias";
    /** <code>InsEstadoContrato</code> service name. */
    public static final String SERV_NAME_INSESTADOCONTRATO = "InsEstadoContrato";
    /** <code>InsEstadoContrato</code> service alias. */
    public static final String SERV_ALIAS_INSESTADOCONTRATO = "InsEstadoContrato";
    /** Agents allowed to execute the service InsEstadoContrato **/
    public static final String INSESTADOCONTRATO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadInsEstadoContratopthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOCONTRATO_SOLICITUDNOVEDADINSESTADOCONTRATOPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadInsEstadoContratopthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOCONTRATO_SOLICITUDNOVEDADINSESTADOCONTRATOPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_8Arg_1_Alias";
    /** <code>solicitudNovedadInsEstadoContratopthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOCONTRATO_SOLICITUDNOVEDADINSESTADOCONTRATOPTHISSOLICITUDNOVEDAD = "SolicitudesNovedad";
    /** <code>solicitudNovedadInsEstadoContratopevcEstadoContrato</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOCONTRATO_SOLICITUDNOVEDADINSESTADOCONTRATOPEVCESTADOCONTRATO = "p_evcEstadoContrato";
    /** <code>solicitudNovedadInsEstadoContratopevcEstadoContrato</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOCONTRATO_SOLICITUDNOVEDADINSESTADOCONTRATOPEVCESTADOCONTRATO = "Clas_1581421428736234Ser_8Arg_2_Alias";
    /** <code>solicitudNovedadInsEstadoContratopevcEstadoContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOCONTRATO_SOLICITUDNOVEDADINSESTADOCONTRATOPEVCESTADOCONTRATO = "EstadoContrato";
    // Service (DelEstadoContrato)
    /** <code>DelEstadoContrato</code> service id. */
    public static final String SERV_ID_DELESTADOCONTRATO = "Clas_1581421428736234Ser_9_Alias";
    /** <code>DelEstadoContrato</code> service name. */
    public static final String SERV_NAME_DELESTADOCONTRATO = "DelEstadoContrato";
    /** <code>DelEstadoContrato</code> service alias. */
    public static final String SERV_ALIAS_DELESTADOCONTRATO = "DelEstadoContrato";
    /** Agents allowed to execute the service DelEstadoContrato **/
    public static final String DELESTADOCONTRATO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadDelEstadoContratopthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOCONTRATO_SOLICITUDNOVEDADDELESTADOCONTRATOPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadDelEstadoContratopthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOCONTRATO_SOLICITUDNOVEDADDELESTADOCONTRATOPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_9Arg_1_Alias";
    /** <code>solicitudNovedadDelEstadoContratopthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOCONTRATO_SOLICITUDNOVEDADDELESTADOCONTRATOPTHISSOLICITUDNOVEDAD = "SolicitudesNovedad";
    /** <code>solicitudNovedadDelEstadoContratopevcEstadoContrato</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOCONTRATO_SOLICITUDNOVEDADDELESTADOCONTRATOPEVCESTADOCONTRATO = "p_evcEstadoContrato";
    /** <code>solicitudNovedadDelEstadoContratopevcEstadoContrato</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOCONTRATO_SOLICITUDNOVEDADDELESTADOCONTRATOPEVCESTADOCONTRATO = "Clas_1581421428736234Ser_9Arg_2_Alias";
    /** <code>solicitudNovedadDelEstadoContratopevcEstadoContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOCONTRATO_SOLICITUDNOVEDADDELESTADOCONTRATOPEVCESTADOCONTRATO = "EstadoContrato";
    // Service (InsGrupoAsociado)
    /** <code>InsGrupoAsociado</code> service id. */
    public static final String SERV_ID_INSGRUPOASOCIADO = "Clas_1581421428736234Ser_10_Alias";
    /** <code>InsGrupoAsociado</code> service name. */
    public static final String SERV_NAME_INSGRUPOASOCIADO = "InsGrupoAsociado";
    /** <code>InsGrupoAsociado</code> service alias. */
    public static final String SERV_ALIAS_INSGRUPOASOCIADO = "InsGrupoAsociado";
    /** Agents allowed to execute the service InsGrupoAsociado **/
    public static final String INSGRUPOASOCIADO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadInsGrupoAsociadopthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_INSGRUPOASOCIADO_SOLICITUDNOVEDADINSGRUPOASOCIADOPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadInsGrupoAsociadopthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_INSGRUPOASOCIADO_SOLICITUDNOVEDADINSGRUPOASOCIADOPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_10Arg_1_Alias";
    /** <code>solicitudNovedadInsGrupoAsociadopthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSGRUPOASOCIADO_SOLICITUDNOVEDADINSGRUPOASOCIADOPTHISSOLICITUDNOVEDAD = "SolicitudesNovedad";
    /** <code>solicitudNovedadInsGrupoAsociadopevcGrupoAsociado</code> inbound argument name. */
    public static final String ARG_NAME_INSGRUPOASOCIADO_SOLICITUDNOVEDADINSGRUPOASOCIADOPEVCGRUPOASOCIADO = "p_evcGrupoAsociado";
    /** <code>solicitudNovedadInsGrupoAsociadopevcGrupoAsociado</code> inbound argument id. */
    public static final String ARG_ID_INSGRUPOASOCIADO_SOLICITUDNOVEDADINSGRUPOASOCIADOPEVCGRUPOASOCIADO = "Clas_1581421428736234Ser_10Arg_2_Alias";
    /** <code>solicitudNovedadInsGrupoAsociadopevcGrupoAsociado</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSGRUPOASOCIADO_SOLICITUDNOVEDADINSGRUPOASOCIADOPEVCGRUPOASOCIADO = "GrupoAsociado";
    // Service (DelGrupoAsociado)
    /** <code>DelGrupoAsociado</code> service id. */
    public static final String SERV_ID_DELGRUPOASOCIADO = "Clas_1581421428736234Ser_11_Alias";
    /** <code>DelGrupoAsociado</code> service name. */
    public static final String SERV_NAME_DELGRUPOASOCIADO = "DelGrupoAsociado";
    /** <code>DelGrupoAsociado</code> service alias. */
    public static final String SERV_ALIAS_DELGRUPOASOCIADO = "DelGrupoAsociado";
    /** Agents allowed to execute the service DelGrupoAsociado **/
    public static final String DELGRUPOASOCIADO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadDelGrupoAsociadopthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DELGRUPOASOCIADO_SOLICITUDNOVEDADDELGRUPOASOCIADOPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadDelGrupoAsociadopthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_DELGRUPOASOCIADO_SOLICITUDNOVEDADDELGRUPOASOCIADOPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_11Arg_1_Alias";
    /** <code>solicitudNovedadDelGrupoAsociadopthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELGRUPOASOCIADO_SOLICITUDNOVEDADDELGRUPOASOCIADOPTHISSOLICITUDNOVEDAD = "SolicitudesNovedad";
    /** <code>solicitudNovedadDelGrupoAsociadopevcGrupoAsociado</code> inbound argument name. */
    public static final String ARG_NAME_DELGRUPOASOCIADO_SOLICITUDNOVEDADDELGRUPOASOCIADOPEVCGRUPOASOCIADO = "p_evcGrupoAsociado";
    /** <code>solicitudNovedadDelGrupoAsociadopevcGrupoAsociado</code> inbound argument id. */
    public static final String ARG_ID_DELGRUPOASOCIADO_SOLICITUDNOVEDADDELGRUPOASOCIADOPEVCGRUPOASOCIADO = "Clas_1581421428736234Ser_11Arg_2_Alias";
    /** <code>solicitudNovedadDelGrupoAsociadopevcGrupoAsociado</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELGRUPOASOCIADO_SOLICITUDNOVEDADDELGRUPOASOCIADOPEVCGRUPOASOCIADO = "GrupoAsociado";
    // Service (validarContratoActivo)
    /** <code>validarContratoActivo</code> service id. */
    public static final String SERV_ID_VALIDARCONTRATOACTIVO = "Clas_1581421428736234Ser_16_Alias";
    /** <code>validarContratoActivo</code> service name. */
    public static final String SERV_NAME_VALIDARCONTRATOACTIVO = "validarContratoActivo";
    /** <code>validarContratoActivo</code> service alias. */
    public static final String SERV_ALIAS_VALIDARCONTRATOACTIVO = "validarContratoActivo";
    /** Agents allowed to execute the service validarContratoActivo **/
    public static final String VALIDARCONTRATOACTIVO_SRVAGENTS = "";
    // Preconditions
    /** <code>validarContratoActivo</code> precondition 0 id. */
    public static final String PRE_ID_VALIDARCONTRATOACTIVO_0 = "Clas_1581421428736234Pre_1_MsgError";
    // Inbound arguments
    /** <code>solicitudNovedadvalidarContratoActivopthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_VALIDARCONTRATOACTIVO_SOLICITUDNOVEDADVALIDARCONTRATOACTIVOPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadvalidarContratoActivopthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_VALIDARCONTRATOACTIVO_SOLICITUDNOVEDADVALIDARCONTRATOACTIVOPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_16Arg_1_Alias";
    /** <code>solicitudNovedadvalidarContratoActivopthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_VALIDARCONTRATOACTIVO_SOLICITUDNOVEDADVALIDARCONTRATOACTIVOPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    // Service (marcarCompletada)
    /** <code>marcarCompletada</code> service id. */
    public static final String SERV_ID_MARCARCOMPLETADA = "Clas_1581421428736234Ser_19_Alias";
    /** <code>marcarCompletada</code> service name. */
    public static final String SERV_NAME_MARCARCOMPLETADA = "marcarCompletada";
    /** <code>marcarCompletada</code> service alias. */
    public static final String SERV_ALIAS_MARCARCOMPLETADA = "marcarCompletada";
    /** Agents allowed to execute the service marcarCompletada **/
    public static final String MARCARCOMPLETADA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadmarcarCompletadapthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_MARCARCOMPLETADA_SOLICITUDNOVEDADMARCARCOMPLETADAPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadmarcarCompletadapthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_MARCARCOMPLETADA_SOLICITUDNOVEDADMARCARCOMPLETADAPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_19Arg_1_Alias";
    /** <code>solicitudNovedadmarcarCompletadapthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_MARCARCOMPLETADA_SOLICITUDNOVEDADMARCARCOMPLETADAPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    // Service (validarSC)
    /** <code>validarSC</code> service id. */
    public static final String SERV_ID_VALIDARSC = "Clas_1581421428736234Ser_21_Alias";
    /** <code>validarSC</code> service name. */
    public static final String SERV_NAME_VALIDARSC = "validarSC";
    /** <code>validarSC</code> service alias. */
    public static final String SERV_ALIAS_VALIDARSC = "validarSC";
    /** Agents allowed to execute the service validarSC **/
    public static final String VALIDARSC_SRVAGENTS = "";
    // Preconditions
    /** <code>validarSC</code> precondition 0 id. */
    public static final String PRE_ID_VALIDARSC_0 = "Clas_1581421428736234Pre_37_MsgError";
    /** <code>validarSC</code> precondition 1 id. */
    public static final String PRE_ID_VALIDARSC_1 = "Clas_1581421428736234Pre_4_MsgError";
    // Inbound arguments
    /** <code>solicitudNovedadvalidarSCpthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_VALIDARSC_SOLICITUDNOVEDADVALIDARSCPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadvalidarSCpthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_VALIDARSC_SOLICITUDNOVEDADVALIDARSCPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_21Arg_1_Alias";
    /** <code>solicitudNovedadvalidarSCpthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_VALIDARSC_SOLICITUDNOVEDADVALIDARSCPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    // Service (modificarNumMeses)
    /** <code>modificarNumMeses</code> service id. */
    public static final String SERV_ID_MODIFICARNUMMESES = "Clas_1581421428736234Ser_22_Alias";
    /** <code>modificarNumMeses</code> service name. */
    public static final String SERV_NAME_MODIFICARNUMMESES = "modificarNumMeses";
    /** <code>modificarNumMeses</code> service alias. */
    public static final String SERV_ALIAS_MODIFICARNUMMESES = "Indicar número de meses de suspensión";
    /** Agents allowed to execute the service modificarNumMeses **/
    public static final String MODIFICARNUMMESES_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Preconditions
    /** <code>modificarNumMeses</code> precondition 0 id. */
    public static final String PRE_ID_MODIFICARNUMMESES_0 = "Clas_1581421428736234Pre_43_MsgError";
    /** <code>modificarNumMeses</code> precondition 1 id. */
    public static final String PRE_ID_MODIFICARNUMMESES_1 = "Clas_1581421428736234Pre_49_MsgError";
    // Inbound arguments
    /** <code>solicitudNovedadmodificarNumMesespthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARNUMMESES_SOLICITUDNOVEDADMODIFICARNUMMESESPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadmodificarNumMesespthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARNUMMESES_SOLICITUDNOVEDADMODIFICARNUMMESESPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_22Arg_1_Alias";
    /** <code>solicitudNovedadmodificarNumMesespthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARNUMMESES_SOLICITUDNOVEDADMODIFICARNUMMESESPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    /** <code>solicitudNovedadmodificarNumMesespSCNumMeses</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARNUMMESES_SOLICITUDNOVEDADMODIFICARNUMMESESPSCNUMMESES = "p_SCNumMeses";
    /** <code>solicitudNovedadmodificarNumMesespSCNumMeses</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARNUMMESES_SOLICITUDNOVEDADMODIFICARNUMMESESPSCNUMMESES = "Clas_1581421428736234Ser_22Arg_2_Alias";
    /** <code>solicitudNovedadmodificarNumMesespSCNumMeses</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARNUMMESES_SOLICITUDNOVEDADMODIFICARNUMMESESPSCNUMMESES = "Nº Meses";
    // Service (validarPSContrato)
    /** <code>validarPSContrato</code> service id. */
    public static final String SERV_ID_VALIDARPSCONTRATO = "Clas_1581421428736234Ser_23_Alias";
    /** <code>validarPSContrato</code> service name. */
    public static final String SERV_NAME_VALIDARPSCONTRATO = "validarPSContrato";
    /** <code>validarPSContrato</code> service alias. */
    public static final String SERV_ALIAS_VALIDARPSCONTRATO = "validarPSContrato";
    /** Agents allowed to execute the service validarPSContrato **/
    public static final String VALIDARPSCONTRATO_SRVAGENTS = "";
    // Preconditions
    /** <code>validarPSContrato</code> precondition 0 id. */
    public static final String PRE_ID_VALIDARPSCONTRATO_0 = "Clas_1581421428736234Pre_38_MsgError";
    /** <code>validarPSContrato</code> precondition 1 id. */
    public static final String PRE_ID_VALIDARPSCONTRATO_1 = "Clas_1581421428736234Pre_55_MsgError";
    /** <code>validarPSContrato</code> precondition 2 id. */
    public static final String PRE_ID_VALIDARPSCONTRATO_2 = "Clas_1581421428736234Pre_6_MsgError";
    // Inbound arguments
    /** <code>solicitudNovedadvalidarPSContratopthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_VALIDARPSCONTRATO_SOLICITUDNOVEDADVALIDARPSCONTRATOPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadvalidarPSContratopthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_VALIDARPSCONTRATO_SOLICITUDNOVEDADVALIDARPSCONTRATOPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_23Arg_1_Alias";
    /** <code>solicitudNovedadvalidarPSContratopthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_VALIDARPSCONTRATO_SOLICITUDNOVEDADVALIDARPSCONTRATOPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    // Service (validarPP)
    /** <code>validarPP</code> service id. */
    public static final String SERV_ID_VALIDARPP = "Clas_1581421428736234Ser_25_Alias";
    /** <code>validarPP</code> service name. */
    public static final String SERV_NAME_VALIDARPP = "validarPP";
    /** <code>validarPP</code> service alias. */
    public static final String SERV_ALIAS_VALIDARPP = "validarPP";
    /** Agents allowed to execute the service validarPP **/
    public static final String VALIDARPP_SRVAGENTS = "";
    // Preconditions
    /** <code>validarPP</code> precondition 0 id. */
    public static final String PRE_ID_VALIDARPP_0 = "Clas_1581421428736234Pre_8_MsgError";
    // Inbound arguments
    /** <code>solicitudNovedadvalidarPPpthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_VALIDARPP_SOLICITUDNOVEDADVALIDARPPPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadvalidarPPpthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_VALIDARPP_SOLICITUDNOVEDADVALIDARPPPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_25Arg_1_Alias";
    /** <code>solicitudNovedadvalidarPPpthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_VALIDARPP_SOLICITUDNOVEDADVALIDARPPPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    // Service (validarAS)
    /** <code>validarAS</code> service id. */
    public static final String SERV_ID_VALIDARAS = "Clas_1581421428736234Ser_26_Alias";
    /** <code>validarAS</code> service name. */
    public static final String SERV_NAME_VALIDARAS = "validarAS";
    /** <code>validarAS</code> service alias. */
    public static final String SERV_ALIAS_VALIDARAS = "validarAS";
    /** Agents allowed to execute the service validarAS **/
    public static final String VALIDARAS_SRVAGENTS = "";
    // Preconditions
    /** <code>validarAS</code> precondition 0 id. */
    public static final String PRE_ID_VALIDARAS_0 = "Clas_1581421428736234Pre_9_MsgError";
    // Inbound arguments
    /** <code>solicitudNovedadvalidarASpthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_VALIDARAS_SOLICITUDNOVEDADVALIDARASPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadvalidarASpthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_VALIDARAS_SOLICITUDNOVEDADVALIDARASPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_26Arg_1_Alias";
    /** <code>solicitudNovedadvalidarASpthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_VALIDARAS_SOLICITUDNOVEDADVALIDARASPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    // Service (modificarNuevoNombre)
    /** <code>modificarNuevoNombre</code> service id. */
    public static final String SERV_ID_MODIFICARNUEVONOMBRE = "Clas_1581421428736234Ser_27_Alias";
    /** <code>modificarNuevoNombre</code> service name. */
    public static final String SERV_NAME_MODIFICARNUEVONOMBRE = "modificarNuevoNombre";
    /** <code>modificarNuevoNombre</code> service alias. */
    public static final String SERV_ALIAS_MODIFICARNUEVONOMBRE = "Nueva razón social";
    /** Agents allowed to execute the service modificarNuevoNombre **/
    public static final String MODIFICARNUEVONOMBRE_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Preconditions
    /** <code>modificarNuevoNombre</code> precondition 0 id. */
    public static final String PRE_ID_MODIFICARNUEVONOMBRE_0 = "Clas_1581421428736234Pre_45_MsgError";
    /** <code>modificarNuevoNombre</code> precondition 1 id. */
    public static final String PRE_ID_MODIFICARNUEVONOMBRE_1 = "Clas_1581421428736234Pre_48_MsgError";
    // Inbound arguments
    /** <code>solicitudNovedadmodificarNuevoNombrepthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARNUEVONOMBRE_SOLICITUDNOVEDADMODIFICARNUEVONOMBREPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadmodificarNuevoNombrepthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARNUEVONOMBRE_SOLICITUDNOVEDADMODIFICARNUEVONOMBREPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_27Arg_1_Alias";
    /** <code>solicitudNovedadmodificarNuevoNombrepthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARNUEVONOMBRE_SOLICITUDNOVEDADMODIFICARNUEVONOMBREPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    /** <code>solicitudNovedadmodificarNuevoNombrepContraNuevaRazonSocial</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARNUEVONOMBRE_SOLICITUDNOVEDADMODIFICARNUEVONOMBREPCONTRANUEVARAZONSOCIAL = "p_ContraNuevaRazonSocial";
    /** <code>solicitudNovedadmodificarNuevoNombrepContraNuevaRazonSocial</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARNUEVONOMBRE_SOLICITUDNOVEDADMODIFICARNUEVONOMBREPCONTRANUEVARAZONSOCIAL = "Clas_1581421428736234Ser_27Arg_2_Alias";
    /** <code>solicitudNovedadmodificarNuevoNombrepContraNuevaRazonSocial</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARNUEVONOMBRE_SOLICITUDNOVEDADMODIFICARNUEVONOMBREPCONTRANUEVARAZONSOCIAL = "Nueva Razón Social";
    // Service (validarCR)
    /** <code>validarCR</code> service id. */
    public static final String SERV_ID_VALIDARCR = "Clas_1581421428736234Ser_28_Alias";
    /** <code>validarCR</code> service name. */
    public static final String SERV_NAME_VALIDARCR = "validarCR";
    /** <code>validarCR</code> service alias. */
    public static final String SERV_ALIAS_VALIDARCR = "validarCR";
    /** Agents allowed to execute the service validarCR **/
    public static final String VALIDARCR_SRVAGENTS = "";
    // Preconditions
    /** <code>validarCR</code> precondition 0 id. */
    public static final String PRE_ID_VALIDARCR_0 = "Clas_1581421428736234Pre_39_MsgError";
    // Inbound arguments
    /** <code>solicitudNovedadvalidarCRpthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_VALIDARCR_SOLICITUDNOVEDADVALIDARCRPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadvalidarCRpthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_VALIDARCR_SOLICITUDNOVEDADVALIDARCRPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_28Arg_1_Alias";
    /** <code>solicitudNovedadvalidarCRpthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_VALIDARCR_SOLICITUDNOVEDADVALIDARCRPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    // Service (registrarObservaciones)
    /** <code>registrarObservaciones</code> service id. */
    public static final String SERV_ID_REGISTRAROBSERVACIONES = "Clas_1581421428736234Ser_38_Alias";
    /** <code>registrarObservaciones</code> service name. */
    public static final String SERV_NAME_REGISTRAROBSERVACIONES = "registrarObservaciones";
    /** <code>registrarObservaciones</code> service alias. */
    public static final String SERV_ALIAS_REGISTRAROBSERVACIONES = "Registrar observaciones";
    /** Agents allowed to execute the service registrarObservaciones **/
    public static final String REGISTRAROBSERVACIONES_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Preconditions
    /** <code>registrarObservaciones</code> precondition 0 id. */
    public static final String PRE_ID_REGISTRAROBSERVACIONES_0 = "Clas_1581421428736234Pre_52_MsgError";
    // Inbound arguments
    /** <code>solicitudNovedadregistrarObservacionespthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_REGISTRAROBSERVACIONES_SOLICITUDNOVEDADREGISTRAROBSERVACIONESPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadregistrarObservacionespthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_REGISTRAROBSERVACIONES_SOLICITUDNOVEDADREGISTRAROBSERVACIONESPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_38Arg_1_Alias";
    /** <code>solicitudNovedadregistrarObservacionespthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_REGISTRAROBSERVACIONES_SOLICITUDNOVEDADREGISTRAROBSERVACIONESPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    /** <code>solicitudNovedadregistrarObservacionespObservaciones</code> inbound argument name. */
    public static final String ARG_NAME_REGISTRAROBSERVACIONES_SOLICITUDNOVEDADREGISTRAROBSERVACIONESPOBSERVACIONES = "p_Observaciones";
    /** <code>solicitudNovedadregistrarObservacionespObservaciones</code> inbound argument id. */
    public static final String ARG_ID_REGISTRAROBSERVACIONES_SOLICITUDNOVEDADREGISTRAROBSERVACIONESPOBSERVACIONES = "Clas_1581421428736234Ser_38Arg_2_Alias";
    /** <code>solicitudNovedadregistrarObservacionespObservaciones</code> inbound argument alias. */
    public static final String ARG_ALIAS_REGISTRAROBSERVACIONES_SOLICITUDNOVEDADREGISTRAROBSERVACIONESPOBSERVACIONES = "Observaciones";
    // Service (InsPeriodicidadNueva)
    /** <code>InsPeriodicidadNueva</code> service id. */
    public static final String SERV_ID_INSPERIODICIDADNUEVA = "Clas_1581421428736234Ser_39_Alias";
    /** <code>InsPeriodicidadNueva</code> service name. */
    public static final String SERV_NAME_INSPERIODICIDADNUEVA = "InsPeriodicidadNueva";
    /** <code>InsPeriodicidadNueva</code> service alias. */
    public static final String SERV_ALIAS_INSPERIODICIDADNUEVA = "InsPeriodicidadNueva";
    /** Agents allowed to execute the service InsPeriodicidadNueva **/
    public static final String INSPERIODICIDADNUEVA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadInsPeriodicidadNuevapthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_INSPERIODICIDADNUEVA_SOLICITUDNOVEDADINSPERIODICIDADNUEVAPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadInsPeriodicidadNuevapthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_INSPERIODICIDADNUEVA_SOLICITUDNOVEDADINSPERIODICIDADNUEVAPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_39Arg_1_Alias";
    /** <code>solicitudNovedadInsPeriodicidadNuevapthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPERIODICIDADNUEVA_SOLICITUDNOVEDADINSPERIODICIDADNUEVAPTHISSOLICITUDNOVEDAD = "SolicitudesNovedadNueva";
    /** <code>solicitudNovedadInsPeriodicidadNuevapevcPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_INSPERIODICIDADNUEVA_SOLICITUDNOVEDADINSPERIODICIDADNUEVAPEVCPERIODICIDAD = "p_evcPeriodicidad";
    /** <code>solicitudNovedadInsPeriodicidadNuevapevcPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_INSPERIODICIDADNUEVA_SOLICITUDNOVEDADINSPERIODICIDADNUEVAPEVCPERIODICIDAD = "Clas_1581421428736234Ser_39Arg_2_Alias";
    /** <code>solicitudNovedadInsPeriodicidadNuevapevcPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPERIODICIDADNUEVA_SOLICITUDNOVEDADINSPERIODICIDADNUEVAPEVCPERIODICIDAD = "Nueva Periodicidad";
    // Service (DelPeriodicidadNueva)
    /** <code>DelPeriodicidadNueva</code> service id. */
    public static final String SERV_ID_DELPERIODICIDADNUEVA = "Clas_1581421428736234Ser_40_Alias";
    /** <code>DelPeriodicidadNueva</code> service name. */
    public static final String SERV_NAME_DELPERIODICIDADNUEVA = "DelPeriodicidadNueva";
    /** <code>DelPeriodicidadNueva</code> service alias. */
    public static final String SERV_ALIAS_DELPERIODICIDADNUEVA = "DelPeriodicidadNueva";
    /** Agents allowed to execute the service DelPeriodicidadNueva **/
    public static final String DELPERIODICIDADNUEVA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadDelPeriodicidadNuevapthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DELPERIODICIDADNUEVA_SOLICITUDNOVEDADDELPERIODICIDADNUEVAPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadDelPeriodicidadNuevapthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_DELPERIODICIDADNUEVA_SOLICITUDNOVEDADDELPERIODICIDADNUEVAPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_40Arg_1_Alias";
    /** <code>solicitudNovedadDelPeriodicidadNuevapthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPERIODICIDADNUEVA_SOLICITUDNOVEDADDELPERIODICIDADNUEVAPTHISSOLICITUDNOVEDAD = "SolicitudesNovedadNueva";
    /** <code>solicitudNovedadDelPeriodicidadNuevapevcPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_DELPERIODICIDADNUEVA_SOLICITUDNOVEDADDELPERIODICIDADNUEVAPEVCPERIODICIDAD = "p_evcPeriodicidad";
    /** <code>solicitudNovedadDelPeriodicidadNuevapevcPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_DELPERIODICIDADNUEVA_SOLICITUDNOVEDADDELPERIODICIDADNUEVAPEVCPERIODICIDAD = "Clas_1581421428736234Ser_40Arg_2_Alias";
    /** <code>solicitudNovedadDelPeriodicidadNuevapevcPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPERIODICIDADNUEVA_SOLICITUDNOVEDADDELPERIODICIDADNUEVAPEVCPERIODICIDAD = "Nueva Periodicidad";
    // Service (cambiarEstado)
    /** <code>cambiarEstado</code> service id. */
    public static final String SERV_ID_CAMBIARESTADO = "Clas_1581421428736234Ser_42_Alias";
    /** <code>cambiarEstado</code> service name. */
    public static final String SERV_NAME_CAMBIARESTADO = "cambiarEstado";
    /** <code>cambiarEstado</code> service alias. */
    public static final String SERV_ALIAS_CAMBIARESTADO = "cambiarEstado";
    /** Agents allowed to execute the service cambiarEstado **/
    public static final String CAMBIARESTADO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadcambiarEstadopthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARESTADO_SOLICITUDNOVEDADCAMBIARESTADOPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadcambiarEstadopthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARESTADO_SOLICITUDNOVEDADCAMBIARESTADOPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_42Arg_1_Alias";
    /** <code>solicitudNovedadcambiarEstadopthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARESTADO_SOLICITUDNOVEDADCAMBIARESTADOPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    /** <code>solicitudNovedadcambiarEstadopeEstado</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARESTADO_SOLICITUDNOVEDADCAMBIARESTADOPEESTADO = "peEstado";
    /** <code>solicitudNovedadcambiarEstadopeEstado</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARESTADO_SOLICITUDNOVEDADCAMBIARESTADOPEESTADO = "Clas_1581421428736234Ser_42Arg_2_Alias";
    /** <code>solicitudNovedadcambiarEstadopeEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARESTADO_SOLICITUDNOVEDADCAMBIARESTADOPEESTADO = "Estado";
    // Service (cambiarEstadoDoc)
    /** <code>cambiarEstadoDoc</code> service id. */
    public static final String SERV_ID_CAMBIARESTADODOC = "Clas_1581421428736234Ser_46_Alias";
    /** <code>cambiarEstadoDoc</code> service name. */
    public static final String SERV_NAME_CAMBIARESTADODOC = "cambiarEstadoDoc";
    /** <code>cambiarEstadoDoc</code> service alias. */
    public static final String SERV_ALIAS_CAMBIARESTADODOC = "Cambiar estado documentación";
    /** Agents allowed to execute the service cambiarEstadoDoc **/
    public static final String CAMBIARESTADODOC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadcambiarEstadoDocpthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARESTADODOC_SOLICITUDNOVEDADCAMBIARESTADODOCPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadcambiarEstadoDocpthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARESTADODOC_SOLICITUDNOVEDADCAMBIARESTADODOCPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_46Arg_1_Alias";
    /** <code>solicitudNovedadcambiarEstadoDocpthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARESTADODOC_SOLICITUDNOVEDADCAMBIARESTADODOCPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    /** <code>solicitudNovedadcambiarEstadoDocpeEstadoDoc</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARESTADODOC_SOLICITUDNOVEDADCAMBIARESTADODOCPEESTADODOC = "peEstadoDoc";
    /** <code>solicitudNovedadcambiarEstadoDocpeEstadoDoc</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARESTADODOC_SOLICITUDNOVEDADCAMBIARESTADODOCPEESTADODOC = "Clas_1581421428736234Ser_46Arg_2_Alias";
    /** <code>solicitudNovedadcambiarEstadoDocpeEstadoDoc</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARESTADODOC_SOLICITUDNOVEDADCAMBIARESTADODOCPEESTADODOC = "Estado documentación";
    // Service (cambiarFechaUltDoc)
    /** <code>cambiarFechaUltDoc</code> service id. */
    public static final String SERV_ID_CAMBIARFECHAULTDOC = "Clas_1581421428736234Ser_47_Alias";
    /** <code>cambiarFechaUltDoc</code> service name. */
    public static final String SERV_NAME_CAMBIARFECHAULTDOC = "cambiarFechaUltDoc";
    /** <code>cambiarFechaUltDoc</code> service alias. */
    public static final String SERV_ALIAS_CAMBIARFECHAULTDOC = "cambiarFechaUltDoc";
    /** Agents allowed to execute the service cambiarFechaUltDoc **/
    public static final String CAMBIARFECHAULTDOC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadcambiarFechaUltDocpthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARFECHAULTDOC_SOLICITUDNOVEDADCAMBIARFECHAULTDOCPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadcambiarFechaUltDocpthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARFECHAULTDOC_SOLICITUDNOVEDADCAMBIARFECHAULTDOCPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_47Arg_1_Alias";
    /** <code>solicitudNovedadcambiarFechaUltDocpthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARFECHAULTDOC_SOLICITUDNOVEDADCAMBIARFECHAULTDOCPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    /** <code>solicitudNovedadcambiarFechaUltDocpeFechaHora</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARFECHAULTDOC_SOLICITUDNOVEDADCAMBIARFECHAULTDOCPEFECHAHORA = "peFechaHora";
    /** <code>solicitudNovedadcambiarFechaUltDocpeFechaHora</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARFECHAULTDOC_SOLICITUDNOVEDADCAMBIARFECHAULTDOCPEFECHAHORA = "Clas_1581421428736234Ser_47Arg_2_Alias";
    /** <code>solicitudNovedadcambiarFechaUltDocpeFechaHora</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARFECHAULTDOC_SOLICITUDNOVEDADCAMBIARFECHAULTDOCPEFECHAHORA = "Fecha último documento";
    // Service (InsPeriodicidadSolNov)
    /** <code>InsPeriodicidadSolNov</code> service id. */
    public static final String SERV_ID_INSPERIODICIDADSOLNOV = "Clas_1581421428736234Ser_50_Alias";
    /** <code>InsPeriodicidadSolNov</code> service name. */
    public static final String SERV_NAME_INSPERIODICIDADSOLNOV = "InsPeriodicidadSolNov";
    /** <code>InsPeriodicidadSolNov</code> service alias. */
    public static final String SERV_ALIAS_INSPERIODICIDADSOLNOV = "InsPeriodicidadSolNov";
    /** Agents allowed to execute the service InsPeriodicidadSolNov **/
    public static final String INSPERIODICIDADSOLNOV_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadInsPeriodicidadSolNovpthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_INSPERIODICIDADSOLNOV_SOLICITUDNOVEDADINSPERIODICIDADSOLNOVPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadInsPeriodicidadSolNovpthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_INSPERIODICIDADSOLNOV_SOLICITUDNOVEDADINSPERIODICIDADSOLNOVPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_50Arg_1_Alias";
    /** <code>solicitudNovedadInsPeriodicidadSolNovpthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPERIODICIDADSOLNOV_SOLICITUDNOVEDADINSPERIODICIDADSOLNOVPTHISSOLICITUDNOVEDAD = "SolicitudesNovedad";
    /** <code>solicitudNovedadInsPeriodicidadSolNovpevcPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_INSPERIODICIDADSOLNOV_SOLICITUDNOVEDADINSPERIODICIDADSOLNOVPEVCPERIODICIDAD = "p_evcPeriodicidad";
    /** <code>solicitudNovedadInsPeriodicidadSolNovpevcPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_INSPERIODICIDADSOLNOV_SOLICITUDNOVEDADINSPERIODICIDADSOLNOVPEVCPERIODICIDAD = "Clas_1581421428736234Ser_50Arg_2_Alias";
    /** <code>solicitudNovedadInsPeriodicidadSolNovpevcPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPERIODICIDADSOLNOV_SOLICITUDNOVEDADINSPERIODICIDADSOLNOVPEVCPERIODICIDAD = "Periodicidad";
    // Service (DelPeriodicidadSolNov)
    /** <code>DelPeriodicidadSolNov</code> service id. */
    public static final String SERV_ID_DELPERIODICIDADSOLNOV = "Clas_1581421428736234Ser_51_Alias";
    /** <code>DelPeriodicidadSolNov</code> service name. */
    public static final String SERV_NAME_DELPERIODICIDADSOLNOV = "DelPeriodicidadSolNov";
    /** <code>DelPeriodicidadSolNov</code> service alias. */
    public static final String SERV_ALIAS_DELPERIODICIDADSOLNOV = "DelPeriodicidadSolNov";
    /** Agents allowed to execute the service DelPeriodicidadSolNov **/
    public static final String DELPERIODICIDADSOLNOV_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadDelPeriodicidadSolNovpthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DELPERIODICIDADSOLNOV_SOLICITUDNOVEDADDELPERIODICIDADSOLNOVPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadDelPeriodicidadSolNovpthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_DELPERIODICIDADSOLNOV_SOLICITUDNOVEDADDELPERIODICIDADSOLNOVPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_51Arg_1_Alias";
    /** <code>solicitudNovedadDelPeriodicidadSolNovpthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPERIODICIDADSOLNOV_SOLICITUDNOVEDADDELPERIODICIDADSOLNOVPTHISSOLICITUDNOVEDAD = "SolicitudesNovedad";
    /** <code>solicitudNovedadDelPeriodicidadSolNovpevcPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_DELPERIODICIDADSOLNOV_SOLICITUDNOVEDADDELPERIODICIDADSOLNOVPEVCPERIODICIDAD = "p_evcPeriodicidad";
    /** <code>solicitudNovedadDelPeriodicidadSolNovpevcPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_DELPERIODICIDADSOLNOV_SOLICITUDNOVEDADDELPERIODICIDADSOLNOVPEVCPERIODICIDAD = "Clas_1581421428736234Ser_51Arg_2_Alias";
    /** <code>solicitudNovedadDelPeriodicidadSolNovpevcPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPERIODICIDADSOLNOV_SOLICITUDNOVEDADDELPERIODICIDADSOLNOVPEVCPERIODICIDAD = "Periodicidad";
    // Service (dummyNavegarAModificar)
    /** <code>dummyNavegarAModificar</code> service id. */
    public static final String SERV_ID_DUMMYNAVEGARAMODIFICAR = "Clas_1581421428736234Ser_52_Alias";
    /** <code>dummyNavegarAModificar</code> service name. */
    public static final String SERV_NAME_DUMMYNAVEGARAMODIFICAR = "dummyNavegarAModificar";
    /** <code>dummyNavegarAModificar</code> service alias. */
    public static final String SERV_ALIAS_DUMMYNAVEGARAMODIFICAR = "Modificar";
    /** Agents allowed to execute the service dummyNavegarAModificar **/
    public static final String DUMMYNAVEGARAMODIFICAR_SRVAGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,MesaDeApoyo";
    // Inbound arguments
    /** <code>solicitudNovedaddummyNavegarAModificarpthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DUMMYNAVEGARAMODIFICAR_SOLICITUDNOVEDADDUMMYNAVEGARAMODIFICARPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedaddummyNavegarAModificarpthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_DUMMYNAVEGARAMODIFICAR_SOLICITUDNOVEDADDUMMYNAVEGARAMODIFICARPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_52Arg_1_Alias";
    /** <code>solicitudNovedaddummyNavegarAModificarpthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DUMMYNAVEGARAMODIFICAR_SOLICITUDNOVEDADDUMMYNAVEGARAMODIFICARPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    // Service (dummyVerPDF)
    /** <code>dummyVerPDF</code> service id. */
    public static final String SERV_ID_DUMMYVERPDF = "Clas_1581421428736234Ser_53_Alias";
    /** <code>dummyVerPDF</code> service name. */
    public static final String SERV_NAME_DUMMYVERPDF = "dummyVerPDF";
    /** <code>dummyVerPDF</code> service alias. */
    public static final String SERV_ALIAS_DUMMYVERPDF = "Ver PDF";
    /** Agents allowed to execute the service dummyVerPDF **/
    public static final String DUMMYVERPDF_SRVAGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Inbound arguments
    /** <code>solicitudNovedaddummyVerPDFpthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DUMMYVERPDF_SOLICITUDNOVEDADDUMMYVERPDFPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedaddummyVerPDFpthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_DUMMYVERPDF_SOLICITUDNOVEDADDUMMYVERPDFPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_53Arg_1_Alias";
    /** <code>solicitudNovedaddummyVerPDFpthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DUMMYVERPDF_SOLICITUDNOVEDADDUMMYVERPDFPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    // Service (addTextoObservaciones)
    /** <code>addTextoObservaciones</code> service id. */
    public static final String SERV_ID_ADDTEXTOOBSERVACIONES = "Clas_1581421428736234Ser_54_Alias";
    /** <code>addTextoObservaciones</code> service name. */
    public static final String SERV_NAME_ADDTEXTOOBSERVACIONES = "addTextoObservaciones";
    /** <code>addTextoObservaciones</code> service alias. */
    public static final String SERV_ALIAS_ADDTEXTOOBSERVACIONES = "addTextoObservaciones";
    /** Agents allowed to execute the service addTextoObservaciones **/
    public static final String ADDTEXTOOBSERVACIONES_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadaddTextoObservacionespthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_ADDTEXTOOBSERVACIONES_SOLICITUDNOVEDADADDTEXTOOBSERVACIONESPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadaddTextoObservacionespthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_ADDTEXTOOBSERVACIONES_SOLICITUDNOVEDADADDTEXTOOBSERVACIONESPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_54Arg_1_Alias";
    /** <code>solicitudNovedadaddTextoObservacionespthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_ADDTEXTOOBSERVACIONES_SOLICITUDNOVEDADADDTEXTOOBSERVACIONESPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    /** <code>solicitudNovedadaddTextoObservacionesptTexto</code> inbound argument name. */
    public static final String ARG_NAME_ADDTEXTOOBSERVACIONES_SOLICITUDNOVEDADADDTEXTOOBSERVACIONESPTTEXTO = "ptTexto";
    /** <code>solicitudNovedadaddTextoObservacionesptTexto</code> inbound argument id. */
    public static final String ARG_ID_ADDTEXTOOBSERVACIONES_SOLICITUDNOVEDADADDTEXTOOBSERVACIONESPTTEXTO = "Clas_1581421428736234Ser_54Arg_2_Alias";
    /** <code>solicitudNovedadaddTextoObservacionesptTexto</code> inbound argument alias. */
    public static final String ARG_ALIAS_ADDTEXTOOBSERVACIONES_SOLICITUDNOVEDADADDTEXTOOBSERVACIONESPTTEXTO = "ptTexto";
    // Service (InsSolNovUsrAfiliacion)
    /** <code>InsSolNovUsrAfiliacion</code> service id. */
    public static final String SERV_ID_INSSOLNOVUSRAFILIACION = "Clas_1581421428736234Ser_56_Alias";
    /** <code>InsSolNovUsrAfiliacion</code> service name. */
    public static final String SERV_NAME_INSSOLNOVUSRAFILIACION = "InsSolNovUsrAfiliacion";
    /** <code>InsSolNovUsrAfiliacion</code> service alias. */
    public static final String SERV_ALIAS_INSSOLNOVUSRAFILIACION = "InsSolNovUsrAfiliacion";
    /** Agents allowed to execute the service InsSolNovUsrAfiliacion **/
    public static final String INSSOLNOVUSRAFILIACION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadInsSolNovUsrAfiliacionpthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_INSSOLNOVUSRAFILIACION_SOLICITUDNOVEDADINSSOLNOVUSRAFILIACIONPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadInsSolNovUsrAfiliacionpthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_INSSOLNOVUSRAFILIACION_SOLICITUDNOVEDADINSSOLNOVUSRAFILIACIONPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_56Arg_1_Alias";
    /** <code>solicitudNovedadInsSolNovUsrAfiliacionpthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSSOLNOVUSRAFILIACION_SOLICITUDNOVEDADINSSOLNOVUSRAFILIACIONPTHISSOLICITUDNOVEDAD = "Sol. Nov. Afiliaciones";
    /** <code>solicitudNovedadInsSolNovUsrAfiliacionpevcFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_INSSOLNOVUSRAFILIACION_SOLICITUDNOVEDADINSSOLNOVUSRAFILIACIONPEVCFUNCIONARIO = "p_evcFuncionario";
    /** <code>solicitudNovedadInsSolNovUsrAfiliacionpevcFuncionario</code> inbound argument id. */
    public static final String ARG_ID_INSSOLNOVUSRAFILIACION_SOLICITUDNOVEDADINSSOLNOVUSRAFILIACIONPEVCFUNCIONARIO = "Clas_1581421428736234Ser_56Arg_2_Alias";
    /** <code>solicitudNovedadInsSolNovUsrAfiliacionpevcFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSSOLNOVUSRAFILIACION_SOLICITUDNOVEDADINSSOLNOVUSRAFILIACIONPEVCFUNCIONARIO = "Afiliación";
    // Service (DelSolNovUsrAfiliacion)
    /** <code>DelSolNovUsrAfiliacion</code> service id. */
    public static final String SERV_ID_DELSOLNOVUSRAFILIACION = "Clas_1581421428736234Ser_57_Alias";
    /** <code>DelSolNovUsrAfiliacion</code> service name. */
    public static final String SERV_NAME_DELSOLNOVUSRAFILIACION = "DelSolNovUsrAfiliacion";
    /** <code>DelSolNovUsrAfiliacion</code> service alias. */
    public static final String SERV_ALIAS_DELSOLNOVUSRAFILIACION = "DelSolNovUsrAfiliacion";
    /** Agents allowed to execute the service DelSolNovUsrAfiliacion **/
    public static final String DELSOLNOVUSRAFILIACION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadDelSolNovUsrAfiliacionpthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DELSOLNOVUSRAFILIACION_SOLICITUDNOVEDADDELSOLNOVUSRAFILIACIONPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadDelSolNovUsrAfiliacionpthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_DELSOLNOVUSRAFILIACION_SOLICITUDNOVEDADDELSOLNOVUSRAFILIACIONPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_57Arg_1_Alias";
    /** <code>solicitudNovedadDelSolNovUsrAfiliacionpthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELSOLNOVUSRAFILIACION_SOLICITUDNOVEDADDELSOLNOVUSRAFILIACIONPTHISSOLICITUDNOVEDAD = "Sol. Nov. Afiliaciones";
    /** <code>solicitudNovedadDelSolNovUsrAfiliacionpevcFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_DELSOLNOVUSRAFILIACION_SOLICITUDNOVEDADDELSOLNOVUSRAFILIACIONPEVCFUNCIONARIO = "p_evcFuncionario";
    /** <code>solicitudNovedadDelSolNovUsrAfiliacionpevcFuncionario</code> inbound argument id. */
    public static final String ARG_ID_DELSOLNOVUSRAFILIACION_SOLICITUDNOVEDADDELSOLNOVUSRAFILIACIONPEVCFUNCIONARIO = "Clas_1581421428736234Ser_57Arg_2_Alias";
    /** <code>solicitudNovedadDelSolNovUsrAfiliacionpevcFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELSOLNOVUSRAFILIACION_SOLICITUDNOVEDADDELSOLNOVUSRAFILIACIONPEVCFUNCIONARIO = "Afiliación";
    // Service (asignarFechaTerminada)
    /** <code>asignarFechaTerminada</code> service id. */
    public static final String SERV_ID_ASIGNARFECHATERMINADA = "Clas_1581421428736234Ser_63_Alias";
    /** <code>asignarFechaTerminada</code> service name. */
    public static final String SERV_NAME_ASIGNARFECHATERMINADA = "asignarFechaTerminada";
    /** <code>asignarFechaTerminada</code> service alias. */
    public static final String SERV_ALIAS_ASIGNARFECHATERMINADA = "asignarFechaTerminada";
    /** Agents allowed to execute the service asignarFechaTerminada **/
    public static final String ASIGNARFECHATERMINADA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadasignarFechaTerminadapthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_ASIGNARFECHATERMINADA_SOLICITUDNOVEDADASIGNARFECHATERMINADAPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadasignarFechaTerminadapthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_ASIGNARFECHATERMINADA_SOLICITUDNOVEDADASIGNARFECHATERMINADAPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_63Arg_1_Alias";
    /** <code>solicitudNovedadasignarFechaTerminadapthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_ASIGNARFECHATERMINADA_SOLICITUDNOVEDADASIGNARFECHATERMINADAPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    // Service (asignarPrioridad)
    /** <code>asignarPrioridad</code> service id. */
    public static final String SERV_ID_ASIGNARPRIORIDAD = "Clas_1581421428736234Ser_64_Alias";
    /** <code>asignarPrioridad</code> service name. */
    public static final String SERV_NAME_ASIGNARPRIORIDAD = "asignarPrioridad";
    /** <code>asignarPrioridad</code> service alias. */
    public static final String SERV_ALIAS_ASIGNARPRIORIDAD = "asignarPrioridad";
    /** Agents allowed to execute the service asignarPrioridad **/
    public static final String ASIGNARPRIORIDAD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadasignarPrioridadpthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_ASIGNARPRIORIDAD_SOLICITUDNOVEDADASIGNARPRIORIDADPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadasignarPrioridadpthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_ASIGNARPRIORIDAD_SOLICITUDNOVEDADASIGNARPRIORIDADPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_64Arg_1_Alias";
    /** <code>solicitudNovedadasignarPrioridadpthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_ASIGNARPRIORIDAD_SOLICITUDNOVEDADASIGNARPRIORIDADPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    /** <code>solicitudNovedadasignarPrioridadpePrioridad</code> inbound argument name. */
    public static final String ARG_NAME_ASIGNARPRIORIDAD_SOLICITUDNOVEDADASIGNARPRIORIDADPEPRIORIDAD = "pePrioridad";
    /** <code>solicitudNovedadasignarPrioridadpePrioridad</code> inbound argument id. */
    public static final String ARG_ID_ASIGNARPRIORIDAD_SOLICITUDNOVEDADASIGNARPRIORIDADPEPRIORIDAD = "Clas_1581421428736234Ser_64Arg_2_Alias";
    /** <code>solicitudNovedadasignarPrioridadpePrioridad</code> inbound argument alias. */
    public static final String ARG_ALIAS_ASIGNARPRIORIDAD_SOLICITUDNOVEDADASIGNARPRIORIDADPEPRIORIDAD = "Prioridad";
    // Service (anotarObservaciones)
    /** <code>anotarObservaciones</code> service id. */
    public static final String SERV_ID_ANOTAROBSERVACIONES = "Clas_1581421428736234Ser_65_Alias";
    /** <code>anotarObservaciones</code> service name. */
    public static final String SERV_NAME_ANOTAROBSERVACIONES = "anotarObservaciones";
    /** <code>anotarObservaciones</code> service alias. */
    public static final String SERV_ALIAS_ANOTAROBSERVACIONES = "Anotar observaciones";
    /** Agents allowed to execute the service anotarObservaciones **/
    public static final String ANOTAROBSERVACIONES_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Preconditions
    /** <code>anotarObservaciones</code> precondition 0 id. */
    public static final String PRE_ID_ANOTAROBSERVACIONES_0 = "Clas_1581421428736234Pre_57_MsgError";
    // Inbound arguments
    /** <code>solicitudNovedadanotarObservacionespthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_ANOTAROBSERVACIONES_SOLICITUDNOVEDADANOTAROBSERVACIONESPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadanotarObservacionespthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_ANOTAROBSERVACIONES_SOLICITUDNOVEDADANOTAROBSERVACIONESPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_65Arg_1_Alias";
    /** <code>solicitudNovedadanotarObservacionespthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_ANOTAROBSERVACIONES_SOLICITUDNOVEDADANOTAROBSERVACIONESPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    /** <code>solicitudNovedadanotarObservacionespObservaciones</code> inbound argument name. */
    public static final String ARG_NAME_ANOTAROBSERVACIONES_SOLICITUDNOVEDADANOTAROBSERVACIONESPOBSERVACIONES = "p_Observaciones";
    /** <code>solicitudNovedadanotarObservacionespObservaciones</code> inbound argument id. */
    public static final String ARG_ID_ANOTAROBSERVACIONES_SOLICITUDNOVEDADANOTAROBSERVACIONESPOBSERVACIONES = "Clas_1581421428736234Ser_65Arg_2_Alias";
    /** <code>solicitudNovedadanotarObservacionespObservaciones</code> inbound argument alias. */
    public static final String ARG_ALIAS_ANOTAROBSERVACIONES_SOLICITUDNOVEDADANOTAROBSERVACIONESPOBSERVACIONES = "p_Observaciones";
    // Service (asignarFUG)
    /** <code>asignarFUG</code> service id. */
    public static final String SERV_ID_ASIGNARFUG = "Clas_1581421428736234Ser_66_Alias";
    /** <code>asignarFUG</code> service name. */
    public static final String SERV_NAME_ASIGNARFUG = "asignarFUG";
    /** <code>asignarFUG</code> service alias. */
    public static final String SERV_ALIAS_ASIGNARFUG = "asignarFUG";
    /** Agents allowed to execute the service asignarFUG **/
    public static final String ASIGNARFUG_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadasignarFUGpthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_ASIGNARFUG_SOLICITUDNOVEDADASIGNARFUGPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadasignarFUGpthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_ASIGNARFUG_SOLICITUDNOVEDADASIGNARFUGPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_66Arg_1_Alias";
    /** <code>solicitudNovedadasignarFUGpthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_ASIGNARFUG_SOLICITUDNOVEDADASIGNARFUGPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    // Service (asignarFA)
    /** <code>asignarFA</code> service id. */
    public static final String SERV_ID_ASIGNARFA = "Clas_1581421428736234Ser_67_Alias";
    /** <code>asignarFA</code> service name. */
    public static final String SERV_NAME_ASIGNARFA = "asignarFA";
    /** <code>asignarFA</code> service alias. */
    public static final String SERV_ALIAS_ASIGNARFA = "asignarFA";
    /** Agents allowed to execute the service asignarFA **/
    public static final String ASIGNARFA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadasignarFApthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_ASIGNARFA_SOLICITUDNOVEDADASIGNARFAPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadasignarFApthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_ASIGNARFA_SOLICITUDNOVEDADASIGNARFAPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_67Arg_1_Alias";
    /** <code>solicitudNovedadasignarFApthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_ASIGNARFA_SOLICITUDNOVEDADASIGNARFAPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    // Service (dummyEstatusSolicitudes)
    /** <code>dummyEstatusSolicitudes</code> service id. */
    public static final String SERV_ID_DUMMYESTATUSSOLICITUDES = "Clas_1581421428736234Ser_68_Alias";
    /** <code>dummyEstatusSolicitudes</code> service name. */
    public static final String SERV_NAME_DUMMYESTATUSSOLICITUDES = "dummyEstatusSolicitudes";
    /** <code>dummyEstatusSolicitudes</code> service alias. */
    public static final String SERV_ALIAS_DUMMYESTATUSSOLICITUDES = "Estatus Solicitudes";
    /** Agents allowed to execute the service dummyEstatusSolicitudes **/
    public static final String DUMMYESTATUSSOLICITUDES_SRVAGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,MesaDeApoyo";
    // Inbound arguments
    /** <code>solicitudNovedaddummyEstatusSolicitudespthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DUMMYESTATUSSOLICITUDES_SOLICITUDNOVEDADDUMMYESTATUSSOLICITUDESPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedaddummyEstatusSolicitudespthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_DUMMYESTATUSSOLICITUDES_SOLICITUDNOVEDADDUMMYESTATUSSOLICITUDESPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_68Arg_1_Alias";
    /** <code>solicitudNovedaddummyEstatusSolicitudespthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DUMMYESTATUSSOLICITUDES_SOLICITUDNOVEDADDUMMYESTATUSSOLICITUDESPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    // Service (InsFirmaSolNov)
    /** <code>InsFirmaSolNov</code> service id. */
    public static final String SERV_ID_INSFIRMASOLNOV = "Clas_1581421428736234Ser_72_Alias";
    /** <code>InsFirmaSolNov</code> service name. */
    public static final String SERV_NAME_INSFIRMASOLNOV = "InsFirmaSolNov";
    /** <code>InsFirmaSolNov</code> service alias. */
    public static final String SERV_ALIAS_INSFIRMASOLNOV = "InsFirmaSolNov";
    /** Agents allowed to execute the service InsFirmaSolNov **/
    public static final String INSFIRMASOLNOV_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadInsFirmaSolNovpthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_INSFIRMASOLNOV_SOLICITUDNOVEDADINSFIRMASOLNOVPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadInsFirmaSolNovpthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_INSFIRMASOLNOV_SOLICITUDNOVEDADINSFIRMASOLNOVPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_72Arg_1_Alias";
    /** <code>solicitudNovedadInsFirmaSolNovpthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSFIRMASOLNOV_SOLICITUDNOVEDADINSFIRMASOLNOVPTHISSOLICITUDNOVEDAD = "SolicitudNovedad";
    /** <code>solicitudNovedadInsFirmaSolNovpevcFirma</code> inbound argument name. */
    public static final String ARG_NAME_INSFIRMASOLNOV_SOLICITUDNOVEDADINSFIRMASOLNOVPEVCFIRMA = "p_evcFirma";
    /** <code>solicitudNovedadInsFirmaSolNovpevcFirma</code> inbound argument id. */
    public static final String ARG_ID_INSFIRMASOLNOV_SOLICITUDNOVEDADINSFIRMASOLNOVPEVCFIRMA = "Clas_1581421428736234Ser_72Arg_2_Alias";
    /** <code>solicitudNovedadInsFirmaSolNovpevcFirma</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSFIRMASOLNOV_SOLICITUDNOVEDADINSFIRMASOLNOVPEVCFIRMA = "Firma";
    // Service (DelFirmaSolNov)
    /** <code>DelFirmaSolNov</code> service id. */
    public static final String SERV_ID_DELFIRMASOLNOV = "Clas_1581421428736234Ser_73_Alias";
    /** <code>DelFirmaSolNov</code> service name. */
    public static final String SERV_NAME_DELFIRMASOLNOV = "DelFirmaSolNov";
    /** <code>DelFirmaSolNov</code> service alias. */
    public static final String SERV_ALIAS_DELFIRMASOLNOV = "DelFirmaSolNov";
    /** Agents allowed to execute the service DelFirmaSolNov **/
    public static final String DELFIRMASOLNOV_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadDelFirmaSolNovpthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DELFIRMASOLNOV_SOLICITUDNOVEDADDELFIRMASOLNOVPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadDelFirmaSolNovpthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_DELFIRMASOLNOV_SOLICITUDNOVEDADDELFIRMASOLNOVPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_73Arg_1_Alias";
    /** <code>solicitudNovedadDelFirmaSolNovpthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELFIRMASOLNOV_SOLICITUDNOVEDADDELFIRMASOLNOVPTHISSOLICITUDNOVEDAD = "SolicitudNovedad";
    /** <code>solicitudNovedadDelFirmaSolNovpevcFirma</code> inbound argument name. */
    public static final String ARG_NAME_DELFIRMASOLNOV_SOLICITUDNOVEDADDELFIRMASOLNOVPEVCFIRMA = "p_evcFirma";
    /** <code>solicitudNovedadDelFirmaSolNovpevcFirma</code> inbound argument id. */
    public static final String ARG_ID_DELFIRMASOLNOV_SOLICITUDNOVEDADDELFIRMASOLNOVPEVCFIRMA = "Clas_1581421428736234Ser_73Arg_2_Alias";
    /** <code>solicitudNovedadDelFirmaSolNovpevcFirma</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELFIRMASOLNOV_SOLICITUDNOVEDADDELFIRMASOLNOVPEVCFIRMA = "Firma";
    // Service (dummyNavegarAConsultar)
    /** <code>dummyNavegarAConsultar</code> service id. */
    public static final String SERV_ID_DUMMYNAVEGARACONSULTAR = "Clas_1581421428736234Ser_76_Alias";
    /** <code>dummyNavegarAConsultar</code> service name. */
    public static final String SERV_NAME_DUMMYNAVEGARACONSULTAR = "dummyNavegarAConsultar";
    /** <code>dummyNavegarAConsultar</code> service alias. */
    public static final String SERV_ALIAS_DUMMYNAVEGARACONSULTAR = "Consultar";
    /** Agents allowed to execute the service dummyNavegarAConsultar **/
    public static final String DUMMYNAVEGARACONSULTAR_SRVAGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Inbound arguments
    /** <code>solicitudNovedaddummyNavegarAConsultarpthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DUMMYNAVEGARACONSULTAR_SOLICITUDNOVEDADDUMMYNAVEGARACONSULTARPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedaddummyNavegarAConsultarpthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_DUMMYNAVEGARACONSULTAR_SOLICITUDNOVEDADDUMMYNAVEGARACONSULTARPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_76Arg_1_Alias";
    /** <code>solicitudNovedaddummyNavegarAConsultarpthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DUMMYNAVEGARACONSULTAR_SOLICITUDNOVEDADDUMMYNAVEGARACONSULTARPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    // Service (getRutaPlantilla)
    /** <code>getRutaPlantilla</code> service id. */
    public static final String SERV_ID_GETRUTAPLANTILLA = "Clas_1581421428736234Ser_77_Alias";
    /** <code>getRutaPlantilla</code> service name. */
    public static final String SERV_NAME_GETRUTAPLANTILLA = "getRutaPlantilla";
    /** <code>getRutaPlantilla</code> service alias. */
    public static final String SERV_ALIAS_GETRUTAPLANTILLA = "Get ruta plantila";
    /** Agents allowed to execute the service getRutaPlantilla **/
    public static final String GETRUTAPLANTILLA_SRVAGENTS = "";
    // Preconditions
    /** <code>getRutaPlantilla</code> precondition 0 id. */
    public static final String PRE_ID_GETRUTAPLANTILLA_0 = "Clas_1581421428736234Pre_60_MsgError";
    // Inbound arguments
    /** <code>solicitudNovedadgetRutaPlantillapthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_GETRUTAPLANTILLA_SOLICITUDNOVEDADGETRUTAPLANTILLAPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadgetRutaPlantillapthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_GETRUTAPLANTILLA_SOLICITUDNOVEDADGETRUTAPLANTILLAPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_77Arg_1_Alias";
    /** <code>solicitudNovedadgetRutaPlantillapthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_GETRUTAPLANTILLA_SOLICITUDNOVEDADGETRUTAPLANTILLAPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    // Outbound arguments
    /** <code>solicitudNovedadgetRutaPlantillaoaRuta</code> outbound argument name. */
    public static final String ARG_NAME_GETRUTAPLANTILLA_SOLICITUDNOVEDADGETRUTAPLANTILLAOARUTA = "solicitudNovedadgetRutaPlantillaoaRuta";
    /** <code>solicitudNovedadgetRutaPlantillaoaRuta</code> outbound argument id. */
    public static final String ARG_ID_GETRUTAPLANTILLA_SOLICITUDNOVEDADGETRUTAPLANTILLAOARUTA = "Clas_1581421428736234Ser_77Arg_3_Alias";
    /** <code>solicitudNovedadgetRutaPlantillaoaRuta</code> outbound argument alias. */
    public static final String ARG_ALIAS_GETRUTAPLANTILLA_SOLICITUDNOVEDADGETRUTAPLANTILLAOARUTA = "Ruta";
    /** <code>solicitudNovedadgetRutaPlantillaoaNombreArchivo</code> outbound argument name. */
    public static final String ARG_NAME_GETRUTAPLANTILLA_SOLICITUDNOVEDADGETRUTAPLANTILLAOANOMBREARCHIVO = "solicitudNovedadgetRutaPlantillaoaNombreArchivo";
    /** <code>solicitudNovedadgetRutaPlantillaoaNombreArchivo</code> outbound argument id. */
    public static final String ARG_ID_GETRUTAPLANTILLA_SOLICITUDNOVEDADGETRUTAPLANTILLAOANOMBREARCHIVO = "Clas_1581421428736234Ser_77Arg_4_Alias";
    /** <code>solicitudNovedadgetRutaPlantillaoaNombreArchivo</code> outbound argument alias. */
    public static final String ARG_ALIAS_GETRUTAPLANTILLA_SOLICITUDNOVEDADGETRUTAPLANTILLAOANOMBREARCHIVO = "Nombre";
    /** <code>solicitudNovedadgetRutaPlantillaoaReporte</code> outbound argument name. */
    public static final String ARG_NAME_GETRUTAPLANTILLA_SOLICITUDNOVEDADGETRUTAPLANTILLAOAREPORTE = "solicitudNovedadgetRutaPlantillaoaReporte";
    /** <code>solicitudNovedadgetRutaPlantillaoaReporte</code> outbound argument id. */
    public static final String ARG_ID_GETRUTAPLANTILLA_SOLICITUDNOVEDADGETRUTAPLANTILLAOAREPORTE = "Clas_1581421428736234Ser_77Arg_5_Alias";
    /** <code>solicitudNovedadgetRutaPlantillaoaReporte</code> outbound argument alias. */
    public static final String ARG_ALIAS_GETRUTAPLANTILLA_SOLICITUDNOVEDADGETRUTAPLANTILLAOAREPORTE = "oaReporte";
    // Service (TCREAR)
    /** <code>TCREAR</code> service id. */
    public static final String SERV_ID_TCREAR = "Clas_1581421428736234Ser_5_Alias";
    /** <code>TCREAR</code> service name. */
    public static final String SERV_NAME_TCREAR = "TCREAR";
    /** <code>TCREAR</code> service alias. */
    public static final String SERV_ALIAS_TCREAR = "Crear";
    /** Agents allowed to execute the service TCREAR **/
    public static final String TCREAR_SRVAGENTS = "Admin,SuperAdmin,Asesor";
    // Inbound arguments
    /** <code>solicitudNovedadTCREARptpagrPlan</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_SOLICITUDNOVEDADTCREARPTPAGRPLAN = "pt_p_agrPlan";
    /** <code>solicitudNovedadTCREARptpagrPlan</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_SOLICITUDNOVEDADTCREARPTPAGRPLAN = "Clas_1581421428736234Ser_5Arg_3_Alias";
    /** <code>solicitudNovedadTCREARptpagrPlan</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_SOLICITUDNOVEDADTCREARPTPAGRPLAN = "Plan";
    /** <code>solicitudNovedadTCREARptpagrNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_SOLICITUDNOVEDADTCREARPTPAGRNOVEDAD = "pt_p_agrNovedad";
    /** <code>solicitudNovedadTCREARptpagrNovedad</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_SOLICITUDNOVEDADTCREARPTPAGRNOVEDAD = "Clas_1581421428736234Ser_5Arg_4_Alias";
    /** <code>solicitudNovedadTCREARptpagrNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_SOLICITUDNOVEDADTCREARPTPAGRNOVEDAD = "Novedad";
    /** <code>solicitudNovedadTCREARptpagrCausal</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_SOLICITUDNOVEDADTCREARPTPAGRCAUSAL = "pt_p_agrCausal";
    /** <code>solicitudNovedadTCREARptpagrCausal</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_SOLICITUDNOVEDADTCREARPTPAGRCAUSAL = "Clas_1581421428736234Ser_5Arg_5_Alias";
    /** <code>solicitudNovedadTCREARptpagrCausal</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_SOLICITUDNOVEDADTCREARPTPAGRCAUSAL = "Causal";
    /** <code>solicitudNovedadTCREARptpatrFechaVigencia</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_SOLICITUDNOVEDADTCREARPTPATRFECHAVIGENCIA = "pt_p_atrFechaVigencia";
    /** <code>solicitudNovedadTCREARptpatrFechaVigencia</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_SOLICITUDNOVEDADTCREARPTPATRFECHAVIGENCIA = "Clas_1581421428736234Ser_5Arg_6_Alias";
    /** <code>solicitudNovedadTCREARptpatrFechaVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_SOLICITUDNOVEDADTCREARPTPATRFECHAVIGENCIA = "Fecha de vigencia";
    /** <code>solicitudNovedadTCREARptpatrNumContrato</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_SOLICITUDNOVEDADTCREARPTPATRNUMCONTRATO = "pt_p_atrNumContrato";
    /** <code>solicitudNovedadTCREARptpatrNumContrato</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_SOLICITUDNOVEDADTCREARPTPATRNUMCONTRATO = "Clas_1581421428736234Ser_5Arg_7_Alias";
    /** <code>solicitudNovedadTCREARptpatrNumContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_SOLICITUDNOVEDADTCREARPTPATRNUMCONTRATO = "Nº Contrato";
    /** <code>solicitudNovedadTCREARptProducto</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_SOLICITUDNOVEDADTCREARPTPRODUCTO = "ptProducto";
    /** <code>solicitudNovedadTCREARptProducto</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_SOLICITUDNOVEDADTCREARPTPRODUCTO = "Clas_1581421428736234Ser_5Arg_128_Alias";
    /** <code>solicitudNovedadTCREARptProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_SOLICITUDNOVEDADTCREARPTPRODUCTO = "Producto";
    /** <code>solicitudNovedadTCREARptTipoNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_SOLICITUDNOVEDADTCREARPTTIPONOVEDAD = "ptTipoNovedad";
    /** <code>solicitudNovedadTCREARptTipoNovedad</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_SOLICITUDNOVEDADTCREARPTTIPONOVEDAD = "Clas_1581421428736234Ser_5Arg_129_Alias";
    /** <code>solicitudNovedadTCREARptTipoNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_SOLICITUDNOVEDADTCREARPTTIPONOVEDAD = "Tipo Novedad";
    /** <code>solicitudNovedadTCREARptpagrProteccionDatos</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_SOLICITUDNOVEDADTCREARPTPAGRPROTECCIONDATOS = "pt_p_agrProteccionDatos";
    /** <code>solicitudNovedadTCREARptpagrProteccionDatos</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_SOLICITUDNOVEDADTCREARPTPAGRPROTECCIONDATOS = "Clas_1581421428736234Ser_5Arg_131_Alias";
    /** <code>solicitudNovedadTCREARptpagrProteccionDatos</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_SOLICITUDNOVEDADTCREARPTPAGRPROTECCIONDATOS = "Protección de datos";
    // Outbound arguments
    /** <code>solicitudNovedadTCREARoaSolicitud</code> outbound argument name. */
    public static final String ARG_NAME_TCREAR_SOLICITUDNOVEDADTCREAROASOLICITUD = "solicitudNovedadTCREARoaSolicitud";
    /** <code>solicitudNovedadTCREARoaSolicitud</code> outbound argument id. */
    public static final String ARG_ID_TCREAR_SOLICITUDNOVEDADTCREAROASOLICITUD = "Clas_1581421428736234Ser_5Arg_114_Alias";
    /** <code>solicitudNovedadTCREARoaSolicitud</code> outbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_SOLICITUDNOVEDADTCREAROASOLICITUD = "Solicitud de Novedad";
    // Service (TSETVALORESDESDECONTRATO)
    /** <code>TSETVALORESDESDECONTRATO</code> service id. */
    public static final String SERV_ID_TSETVALORESDESDECONTRATO = "Clas_1581421428736234Ser_14_Alias";
    /** <code>TSETVALORESDESDECONTRATO</code> service name. */
    public static final String SERV_NAME_TSETVALORESDESDECONTRATO = "TSETVALORESDESDECONTRATO";
    /** <code>TSETVALORESDESDECONTRATO</code> service alias. */
    public static final String SERV_ALIAS_TSETVALORESDESDECONTRATO = "TSETVALORESDESDECONTRATO";
    /** Agents allowed to execute the service TSETVALORESDESDECONTRATO **/
    public static final String TSETVALORESDESDECONTRATO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOpthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOpthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_14Arg_1_Alias";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOpthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpCtrCodigoTarifa</code> inbound argument name. */
    public static final String ARG_NAME_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCTRCODIGOTARIFA = "pt_p_CtrCodigoTarifa";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpCtrCodigoTarifa</code> inbound argument id. */
    public static final String ARG_ID_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCTRCODIGOTARIFA = "Clas_1581421428736234Ser_14Arg_3_Alias";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpCtrCodigoTarifa</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCTRCODIGOTARIFA = "Código Tarifa";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpCtrDescTarifa</code> inbound argument name. */
    public static final String ARG_NAME_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCTRDESCTARIFA = "pt_p_CtrDescTarifa";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpCtrDescTarifa</code> inbound argument id. */
    public static final String ARG_ID_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCTRDESCTARIFA = "Clas_1581421428736234Ser_14Arg_4_Alias";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpCtrDescTarifa</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCTRDESCTARIFA = "Descripción Tarifa";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpCtrCodigoConvenio</code> inbound argument name. */
    public static final String ARG_NAME_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCTRCODIGOCONVENIO = "pt_p_CtrCodigoConvenio";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpCtrCodigoConvenio</code> inbound argument id. */
    public static final String ARG_ID_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCTRCODIGOCONVENIO = "Clas_1581421428736234Ser_14Arg_5_Alias";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpCtrCodigoConvenio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCTRCODIGOCONVENIO = "Código Convenio";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpCtrDescConvenio</code> inbound argument name. */
    public static final String ARG_NAME_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCTRDESCCONVENIO = "pt_p_CtrDescConvenio";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpCtrDescConvenio</code> inbound argument id. */
    public static final String ARG_ID_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCTRDESCCONVENIO = "Clas_1581421428736234Ser_14Arg_6_Alias";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpCtrDescConvenio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCTRDESCCONVENIO = "Descripción Convenio";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpCtrEsColectivo</code> inbound argument name. */
    public static final String ARG_NAME_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCTRESCOLECTIVO = "pt_p_CtrEsColectivo";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpCtrEsColectivo</code> inbound argument id. */
    public static final String ARG_ID_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCTRESCOLECTIVO = "Clas_1581421428736234Ser_14Arg_7_Alias";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpCtrEsColectivo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCTRESCOLECTIVO = "Contrato colectivo";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpContraNumIden</code> inbound argument name. */
    public static final String ARG_NAME_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCONTRANUMIDEN = "pt_p_ContraNumIden";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpContraNumIden</code> inbound argument id. */
    public static final String ARG_ID_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCONTRANUMIDEN = "Clas_1581421428736234Ser_14Arg_8_Alias";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpContraNumIden</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCONTRANUMIDEN = "Nº Identifiación";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpContraPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCONTRAPRIMERNOMBRE = "pt_p_ContraPrimerNombre";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpContraPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCONTRAPRIMERNOMBRE = "Clas_1581421428736234Ser_14Arg_9_Alias";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpContraPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCONTRAPRIMERNOMBRE = "Primer Nombre";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpContraSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCONTRASEGUNDONOMBRE = "pt_p_ContraSegundoNombre";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpContraSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCONTRASEGUNDONOMBRE = "Clas_1581421428736234Ser_14Arg_10_Alias";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpContraSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCONTRASEGUNDONOMBRE = "Segundo Nombre";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpContraPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCONTRAPRIMERAPELLIDO = "pt_p_ContraPrimerApellido";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpContraPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCONTRAPRIMERAPELLIDO = "Clas_1581421428736234Ser_14Arg_11_Alias";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpContraPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCONTRAPRIMERAPELLIDO = "Primer Apellido";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpContraSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCONTRASEGUNDOAPELLIDO = "pt_p_ContraSegundoApellido";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpContraSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCONTRASEGUNDOAPELLIDO = "Clas_1581421428736234Ser_14Arg_12_Alias";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpContraSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCONTRASEGUNDOAPELLIDO = "Segundo Apellido";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpevcEstadoContrato</code> inbound argument name. */
    public static final String ARG_NAME_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPEVCESTADOCONTRATO = "pt_p_evcEstadoContrato";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpevcEstadoContrato</code> inbound argument id. */
    public static final String ARG_ID_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPEVCESTADOCONTRATO = "Clas_1581421428736234Ser_14Arg_13_Alias";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpevcEstadoContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPEVCESTADOCONTRATO = "EstadoContrato";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpevcGrupoAsociado</code> inbound argument name. */
    public static final String ARG_NAME_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPEVCGRUPOASOCIADO = "pt_p_evcGrupoAsociado";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpevcGrupoAsociado</code> inbound argument id. */
    public static final String ARG_ID_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPEVCGRUPOASOCIADO = "Clas_1581421428736234Ser_14Arg_14_Alias";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpevcGrupoAsociado</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPEVCGRUPOASOCIADO = "GrupoAsociado";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpevcPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPEVCPERIODICIDAD = "pt_p_evcPeriodicidad";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpevcPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPEVCPERIODICIDAD = "Clas_1581421428736234Ser_14Arg_15_Alias";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpevcPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPEVCPERIODICIDAD = "Periodicidad";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpevcTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPEVCTIPOIDENTIFICACION = "pt_p_evcTipoIdentificacion";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpevcTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPEVCTIPOIDENTIFICACION = "Clas_1581421428736234Ser_14Arg_16_Alias";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpevcTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPEVCTIPOIDENTIFICACION = "TipoIdentContratante";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpCtrTagCausaExclusion</code> inbound argument name. */
    public static final String ARG_NAME_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCTRTAGCAUSAEXCLUSION = "pt_p_CtrTagCausaExclusion";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpCtrTagCausaExclusion</code> inbound argument id. */
    public static final String ARG_ID_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCTRTAGCAUSAEXCLUSION = "Clas_1581421428736234Ser_14Arg_17_Alias";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpCtrTagCausaExclusion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCTRTAGCAUSAEXCLUSION = "Segundo Apellido";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOpContraRazonSocial</code> inbound argument name. */
    public static final String ARG_NAME_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPCONTRARAZONSOCIAL = "p_ContraRazonSocial";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOpContraRazonSocial</code> inbound argument id. */
    public static final String ARG_ID_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPCONTRARAZONSOCIAL = "Clas_1581421428736234Ser_14Arg_18_Alias";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOpContraRazonSocial</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPCONTRARAZONSOCIAL = "Razón Social";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOpCtrActivo</code> inbound argument name. */
    public static final String ARG_NAME_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPCTRACTIVO = "pCtrActivo";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOpCtrActivo</code> inbound argument id. */
    public static final String ARG_ID_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPCTRACTIVO = "Clas_1581421428736234Ser_14Arg_19_Alias";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOpCtrActivo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPCTRACTIVO = "Contrato activo";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOpContraTipoPersona</code> inbound argument name. */
    public static final String ARG_NAME_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPCONTRATIPOPERSONA = "p_ContraTipoPersona";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOpContraTipoPersona</code> inbound argument id. */
    public static final String ARG_ID_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPCONTRATIPOPERSONA = "Clas_1581421428736234Ser_14Arg_20_Alias";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOpContraTipoPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPCONTRATIPOPERSONA = "Tipo Persona";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpatrCtrFInicioContrato</code> inbound argument name. */
    public static final String ARG_NAME_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPATRCTRFINICIOCONTRATO = "pt_p_atrCtrFInicioContrato";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpatrCtrFInicioContrato</code> inbound argument id. */
    public static final String ARG_ID_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPATRCTRFINICIOCONTRATO = "Clas_1581421428736234Ser_14Arg_21_Alias";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpatrCtrFInicioContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPATRCTRFINICIOCONTRATO = "F. Inicio Contrato";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpCtrTipoContrato</code> inbound argument name. */
    public static final String ARG_NAME_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCTRTIPOCONTRATO = "pt_p_CtrTipoContrato";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpCtrTipoContrato</code> inbound argument id. */
    public static final String ARG_ID_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCTRTIPOCONTRATO = "Clas_1581421428736234Ser_14Arg_22_Alias";
    /** <code>solicitudNovedadTSETVALORESDESDECONTRATOptpCtrTipoContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSETVALORESDESDECONTRATO_SOLICITUDNOVEDADTSETVALORESDESDECONTRATOPTPCTRTIPOCONTRATO = "Tipo contrato";
    // Service (TADDFAMILIA)
    /** <code>TADDFAMILIA</code> service id. */
    public static final String SERV_ID_TADDFAMILIA = "Clas_1581421428736234Ser_15_Alias";
    /** <code>TADDFAMILIA</code> service name. */
    public static final String SERV_NAME_TADDFAMILIA = "TADDFAMILIA";
    /** <code>TADDFAMILIA</code> service alias. */
    public static final String SERV_ALIAS_TADDFAMILIA = "Añadir Familia";
    /** Agents allowed to execute the service TADDFAMILIA **/
    public static final String TADDFAMILIA_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Preconditions
    /** <code>TADDFAMILIA</code> precondition 0 id. */
    public static final String PRE_ID_TADDFAMILIA_0 = "Clas_1581421428736234Pre_50_MsgError";
    /** <code>TADDFAMILIA</code> precondition 1 id. */
    public static final String PRE_ID_TADDFAMILIA_1 = "Clas_1581421428736234Pre_51_MsgError";
    // Inbound arguments
    /** <code>solicitudNovedadTADDFAMILIApthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TADDFAMILIA_SOLICITUDNOVEDADTADDFAMILIAPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadTADDFAMILIApthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_TADDFAMILIA_SOLICITUDNOVEDADTADDFAMILIAPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_15Arg_1_Alias";
    /** <code>solicitudNovedadTADDFAMILIApthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDFAMILIA_SOLICITUDNOVEDADTADDFAMILIAPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    /** <code>solicitudNovedadTADDFAMILIAptNumFamilia</code> inbound argument name. */
    public static final String ARG_NAME_TADDFAMILIA_SOLICITUDNOVEDADTADDFAMILIAPTNUMFAMILIA = "ptNumFamilia";
    /** <code>solicitudNovedadTADDFAMILIAptNumFamilia</code> inbound argument id. */
    public static final String ARG_ID_TADDFAMILIA_SOLICITUDNOVEDADTADDFAMILIAPTNUMFAMILIA = "Clas_1581421428736234Ser_15Arg_2_Alias";
    /** <code>solicitudNovedadTADDFAMILIAptNumFamilia</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDFAMILIA_SOLICITUDNOVEDADTADDFAMILIAPTNUMFAMILIA = "Nº Familia";
    // Service (TMARCARCOMPLETADA)
    /** <code>TMARCARCOMPLETADA</code> service id. */
    public static final String SERV_ID_TMARCARCOMPLETADA = "Clas_1581421428736234Ser_20_Alias";
    /** <code>TMARCARCOMPLETADA</code> service name. */
    public static final String SERV_NAME_TMARCARCOMPLETADA = "TMARCARCOMPLETADA";
    /** <code>TMARCARCOMPLETADA</code> service alias. */
    public static final String SERV_ALIAS_TMARCARCOMPLETADA = "Marcar Completada";
    /** Agents allowed to execute the service TMARCARCOMPLETADA **/
    public static final String TMARCARCOMPLETADA_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Preconditions
    /** <code>TMARCARCOMPLETADA</code> precondition 0 id. */
    public static final String PRE_ID_TMARCARCOMPLETADA_0 = "Clas_1581421428736234Pre_40_MsgError";
    /** <code>TMARCARCOMPLETADA</code> precondition 1 id. */
    public static final String PRE_ID_TMARCARCOMPLETADA_1 = "Clas_1581421428736234Pre_53_MsgError";
    /** <code>TMARCARCOMPLETADA</code> precondition 2 id. */
    public static final String PRE_ID_TMARCARCOMPLETADA_2 = "Clas_1581421428736234Pre_54_MsgError";
    /** <code>TMARCARCOMPLETADA</code> precondition 3 id. */
    public static final String PRE_ID_TMARCARCOMPLETADA_3 = "Clas_1581421428736234Pre_56_MsgError";
    // Inbound arguments
    /** <code>solicitudNovedadTMARCARCOMPLETADApthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TMARCARCOMPLETADA_SOLICITUDNOVEDADTMARCARCOMPLETADAPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadTMARCARCOMPLETADApthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_TMARCARCOMPLETADA_SOLICITUDNOVEDADTMARCARCOMPLETADAPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_20Arg_1_Alias";
    /** <code>solicitudNovedadTMARCARCOMPLETADApthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMARCARCOMPLETADA_SOLICITUDNOVEDADTMARCARCOMPLETADAPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    // Outbound arguments
    /** <code>solicitudNovedadTMARCARCOMPLETADAoaNumErr</code> outbound argument name. */
    public static final String ARG_NAME_TMARCARCOMPLETADA_SOLICITUDNOVEDADTMARCARCOMPLETADAOANUMERR = "solicitudNovedadTMARCARCOMPLETADAoaNumErr";
    /** <code>solicitudNovedadTMARCARCOMPLETADAoaNumErr</code> outbound argument id. */
    public static final String ARG_ID_TMARCARCOMPLETADA_SOLICITUDNOVEDADTMARCARCOMPLETADAOANUMERR = "Clas_1581421428736234Ser_20Arg_3_Alias";
    /** <code>solicitudNovedadTMARCARCOMPLETADAoaNumErr</code> outbound argument alias. */
    public static final String ARG_ALIAS_TMARCARCOMPLETADA_SOLICITUDNOVEDADTMARCARCOMPLETADAOANUMERR = "Nº Errores";
    // Service (TCHGNUEVAPERIODICIDAD)
    /** <code>TCHGNUEVAPERIODICIDAD</code> service id. */
    public static final String SERV_ID_TCHGNUEVAPERIODICIDAD = "Clas_1581421428736234Ser_41_Alias";
    /** <code>TCHGNUEVAPERIODICIDAD</code> service name. */
    public static final String SERV_NAME_TCHGNUEVAPERIODICIDAD = "TCHGNUEVAPERIODICIDAD";
    /** <code>TCHGNUEVAPERIODICIDAD</code> service alias. */
    public static final String SERV_ALIAS_TCHGNUEVAPERIODICIDAD = "Cambiar periodicidad";
    /** Agents allowed to execute the service TCHGNUEVAPERIODICIDAD **/
    public static final String TCHGNUEVAPERIODICIDAD_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Preconditions
    /** <code>TCHGNUEVAPERIODICIDAD</code> precondition 0 id. */
    public static final String PRE_ID_TCHGNUEVAPERIODICIDAD_0 = "Clas_1581421428736234Pre_41_MsgError";
    /** <code>TCHGNUEVAPERIODICIDAD</code> precondition 1 id. */
    public static final String PRE_ID_TCHGNUEVAPERIODICIDAD_1 = "Clas_1581421428736234Pre_42_MsgError";
    // Inbound arguments
    /** <code>solicitudNovedadTCHGNUEVAPERIODICIDADpthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TCHGNUEVAPERIODICIDAD_SOLICITUDNOVEDADTCHGNUEVAPERIODICIDADPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadTCHGNUEVAPERIODICIDADpthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_TCHGNUEVAPERIODICIDAD_SOLICITUDNOVEDADTCHGNUEVAPERIODICIDADPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_41Arg_1_Alias";
    /** <code>solicitudNovedadTCHGNUEVAPERIODICIDADpthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCHGNUEVAPERIODICIDAD_SOLICITUDNOVEDADTCHGNUEVAPERIODICIDADPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    /** <code>solicitudNovedadTCHGNUEVAPERIODICIDADptPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_TCHGNUEVAPERIODICIDAD_SOLICITUDNOVEDADTCHGNUEVAPERIODICIDADPTPERIODICIDAD = "ptPeriodicidad";
    /** <code>solicitudNovedadTCHGNUEVAPERIODICIDADptPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_TCHGNUEVAPERIODICIDAD_SOLICITUDNOVEDADTCHGNUEVAPERIODICIDADPTPERIODICIDAD = "Clas_1581421428736234Ser_41Arg_2_Alias";
    /** <code>solicitudNovedadTCHGNUEVAPERIODICIDADptPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCHGNUEVAPERIODICIDAD_SOLICITUDNOVEDADTCHGNUEVAPERIODICIDADPTPERIODICIDAD = "Nueva Periodicidad";
    // Service (TCAMBIARESTADO)
    /** <code>TCAMBIARESTADO</code> service id. */
    public static final String SERV_ID_TCAMBIARESTADO = "Clas_1581421428736234Ser_43_Alias";
    /** <code>TCAMBIARESTADO</code> service name. */
    public static final String SERV_NAME_TCAMBIARESTADO = "TCAMBIARESTADO";
    /** <code>TCAMBIARESTADO</code> service alias. */
    public static final String SERV_ALIAS_TCAMBIARESTADO = "TCAMBIARESTADO";
    /** Agents allowed to execute the service TCAMBIARESTADO **/
    public static final String TCAMBIARESTADO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadTCAMBIARESTADOpthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARESTADO_SOLICITUDNOVEDADTCAMBIARESTADOPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadTCAMBIARESTADOpthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARESTADO_SOLICITUDNOVEDADTCAMBIARESTADOPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_43Arg_1_Alias";
    /** <code>solicitudNovedadTCAMBIARESTADOpthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARESTADO_SOLICITUDNOVEDADTCAMBIARESTADOPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    /** <code>solicitudNovedadTCAMBIARESTADOptEstado</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARESTADO_SOLICITUDNOVEDADTCAMBIARESTADOPTESTADO = "ptEstado";
    /** <code>solicitudNovedadTCAMBIARESTADOptEstado</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARESTADO_SOLICITUDNOVEDADTCAMBIARESTADOPTESTADO = "Clas_1581421428736234Ser_43Arg_2_Alias";
    /** <code>solicitudNovedadTCAMBIARESTADOptEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARESTADO_SOLICITUDNOVEDADTCAMBIARESTADOPTESTADO = "Estado";
    // Service (TMARCARTRAMITADA)
    /** <code>TMARCARTRAMITADA</code> service id. */
    public static final String SERV_ID_TMARCARTRAMITADA = "Clas_1581421428736234Ser_44_Alias";
    /** <code>TMARCARTRAMITADA</code> service name. */
    public static final String SERV_NAME_TMARCARTRAMITADA = "TMARCARTRAMITADA";
    /** <code>TMARCARTRAMITADA</code> service alias. */
    public static final String SERV_ALIAS_TMARCARTRAMITADA = "Marcar Tramitada";
    /** Agents allowed to execute the service TMARCARTRAMITADA **/
    public static final String TMARCARTRAMITADA_SRVAGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,MesaDeApoyo";
    // Preconditions
    /** <code>TMARCARTRAMITADA</code> precondition 0 id. */
    public static final String PRE_ID_TMARCARTRAMITADA_0 = "Clas_1581421428736234Pre_46_MsgError";
    /** <code>TMARCARTRAMITADA</code> precondition 1 id. */
    public static final String PRE_ID_TMARCARTRAMITADA_1 = "Clas_1581421428736234Pre_58_MsgError";
    // Inbound arguments
    /** <code>solicitudNovedadTMARCARTRAMITADApthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TMARCARTRAMITADA_SOLICITUDNOVEDADTMARCARTRAMITADAPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadTMARCARTRAMITADApthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_TMARCARTRAMITADA_SOLICITUDNOVEDADTMARCARTRAMITADAPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_44Arg_1_Alias";
    /** <code>solicitudNovedadTMARCARTRAMITADApthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMARCARTRAMITADA_SOLICITUDNOVEDADTMARCARTRAMITADAPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    // Outbound arguments
    /** <code>solicitudNovedadTMARCARTRAMITADAoaNumProcesados</code> outbound argument name. */
    public static final String ARG_NAME_TMARCARTRAMITADA_SOLICITUDNOVEDADTMARCARTRAMITADAOANUMPROCESADOS = "solicitudNovedadTMARCARTRAMITADAoaNumProcesados";
    /** <code>solicitudNovedadTMARCARTRAMITADAoaNumProcesados</code> outbound argument id. */
    public static final String ARG_ID_TMARCARTRAMITADA_SOLICITUDNOVEDADTMARCARTRAMITADAOANUMPROCESADOS = "Clas_1581421428736234Ser_44Arg_2_Alias";
    /** <code>solicitudNovedadTMARCARTRAMITADAoaNumProcesados</code> outbound argument alias. */
    public static final String ARG_ALIAS_TMARCARTRAMITADA_SOLICITUDNOVEDADTMARCARTRAMITADAOANUMPROCESADOS = "oaNumProcesados";
    /** <code>solicitudNovedadTMARCARTRAMITADAoaNumErrores</code> outbound argument name. */
    public static final String ARG_NAME_TMARCARTRAMITADA_SOLICITUDNOVEDADTMARCARTRAMITADAOANUMERRORES = "solicitudNovedadTMARCARTRAMITADAoaNumErrores";
    /** <code>solicitudNovedadTMARCARTRAMITADAoaNumErrores</code> outbound argument id. */
    public static final String ARG_ID_TMARCARTRAMITADA_SOLICITUDNOVEDADTMARCARTRAMITADAOANUMERRORES = "Clas_1581421428736234Ser_44Arg_3_Alias";
    /** <code>solicitudNovedadTMARCARTRAMITADAoaNumErrores</code> outbound argument alias. */
    public static final String ARG_ALIAS_TMARCARTRAMITADA_SOLICITUDNOVEDADTMARCARTRAMITADAOANUMERRORES = "oaNumErrores";
    /** <code>solicitudNovedadTMARCARTRAMITADAoaErrores</code> outbound argument name. */
    public static final String ARG_NAME_TMARCARTRAMITADA_SOLICITUDNOVEDADTMARCARTRAMITADAOAERRORES = "solicitudNovedadTMARCARTRAMITADAoaErrores";
    /** <code>solicitudNovedadTMARCARTRAMITADAoaErrores</code> outbound argument id. */
    public static final String ARG_ID_TMARCARTRAMITADA_SOLICITUDNOVEDADTMARCARTRAMITADAOAERRORES = "Clas_1581421428736234Ser_44Arg_4_Alias";
    /** <code>solicitudNovedadTMARCARTRAMITADAoaErrores</code> outbound argument alias. */
    public static final String ARG_ALIAS_TMARCARTRAMITADA_SOLICITUDNOVEDADTMARCARTRAMITADAOAERRORES = "oaErrores";
    // Service (TMARCARANULADA)
    /** <code>TMARCARANULADA</code> service id. */
    public static final String SERV_ID_TMARCARANULADA = "Clas_1581421428736234Ser_45_Alias";
    /** <code>TMARCARANULADA</code> service name. */
    public static final String SERV_NAME_TMARCARANULADA = "TMARCARANULADA";
    /** <code>TMARCARANULADA</code> service alias. */
    public static final String SERV_ALIAS_TMARCARANULADA = "Marcar Anulada";
    /** Agents allowed to execute the service TMARCARANULADA **/
    public static final String TMARCARANULADA_SRVAGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,MesaDeApoyo";
    // Preconditions
    /** <code>TMARCARANULADA</code> precondition 0 id. */
    public static final String PRE_ID_TMARCARANULADA_0 = "Clas_1581421428736234Pre_47_MsgError";
    /** <code>TMARCARANULADA</code> precondition 1 id. */
    public static final String PRE_ID_TMARCARANULADA_1 = "Clas_1581421428736234Pre_59_MsgError";
    // Inbound arguments
    /** <code>solicitudNovedadTMARCARANULADApthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TMARCARANULADA_SOLICITUDNOVEDADTMARCARANULADAPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadTMARCARANULADApthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_TMARCARANULADA_SOLICITUDNOVEDADTMARCARANULADAPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_45Arg_1_Alias";
    /** <code>solicitudNovedadTMARCARANULADApthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMARCARANULADA_SOLICITUDNOVEDADTMARCARANULADAPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    // Service (TCREARINT)
    /** <code>TCREARINT</code> service id. */
    public static final String SERV_ID_TCREARINT = "Clas_1581421428736234Ser_48_Alias";
    /** <code>TCREARINT</code> service name. */
    public static final String SERV_NAME_TCREARINT = "TCREARINT";
    /** <code>TCREARINT</code> service alias. */
    public static final String SERV_ALIAS_TCREARINT = "Crear";
    /** Agents allowed to execute the service TCREARINT **/
    public static final String TCREARINT_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadTCREARINTptpagrPlan</code> inbound argument name. */
    public static final String ARG_NAME_TCREARINT_SOLICITUDNOVEDADTCREARINTPTPAGRPLAN = "pt_p_agrPlan";
    /** <code>solicitudNovedadTCREARINTptpagrPlan</code> inbound argument id. */
    public static final String ARG_ID_TCREARINT_SOLICITUDNOVEDADTCREARINTPTPAGRPLAN = "Clas_1581421428736234Ser_48Arg_2_Alias";
    /** <code>solicitudNovedadTCREARINTptpagrPlan</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARINT_SOLICITUDNOVEDADTCREARINTPTPAGRPLAN = "Plan";
    /** <code>solicitudNovedadTCREARINTptpagrNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TCREARINT_SOLICITUDNOVEDADTCREARINTPTPAGRNOVEDAD = "pt_p_agrNovedad";
    /** <code>solicitudNovedadTCREARINTptpagrNovedad</code> inbound argument id. */
    public static final String ARG_ID_TCREARINT_SOLICITUDNOVEDADTCREARINTPTPAGRNOVEDAD = "Clas_1581421428736234Ser_48Arg_3_Alias";
    /** <code>solicitudNovedadTCREARINTptpagrNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARINT_SOLICITUDNOVEDADTCREARINTPTPAGRNOVEDAD = "Novedad";
    /** <code>solicitudNovedadTCREARINTptpagrCausal</code> inbound argument name. */
    public static final String ARG_NAME_TCREARINT_SOLICITUDNOVEDADTCREARINTPTPAGRCAUSAL = "pt_p_agrCausal";
    /** <code>solicitudNovedadTCREARINTptpagrCausal</code> inbound argument id. */
    public static final String ARG_ID_TCREARINT_SOLICITUDNOVEDADTCREARINTPTPAGRCAUSAL = "Clas_1581421428736234Ser_48Arg_4_Alias";
    /** <code>solicitudNovedadTCREARINTptpagrCausal</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARINT_SOLICITUDNOVEDADTCREARINTPTPAGRCAUSAL = "Causal";
    /** <code>solicitudNovedadTCREARINTptpatrFechaVigencia</code> inbound argument name. */
    public static final String ARG_NAME_TCREARINT_SOLICITUDNOVEDADTCREARINTPTPATRFECHAVIGENCIA = "pt_p_atrFechaVigencia";
    /** <code>solicitudNovedadTCREARINTptpatrFechaVigencia</code> inbound argument id. */
    public static final String ARG_ID_TCREARINT_SOLICITUDNOVEDADTCREARINTPTPATRFECHAVIGENCIA = "Clas_1581421428736234Ser_48Arg_5_Alias";
    /** <code>solicitudNovedadTCREARINTptpatrFechaVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARINT_SOLICITUDNOVEDADTCREARINTPTPATRFECHAVIGENCIA = "Fecha de vigencia";
    /** <code>solicitudNovedadTCREARINTptpatrNumContrato</code> inbound argument name. */
    public static final String ARG_NAME_TCREARINT_SOLICITUDNOVEDADTCREARINTPTPATRNUMCONTRATO = "pt_p_atrNumContrato";
    /** <code>solicitudNovedadTCREARINTptpatrNumContrato</code> inbound argument id. */
    public static final String ARG_ID_TCREARINT_SOLICITUDNOVEDADTCREARINTPTPATRNUMCONTRATO = "Clas_1581421428736234Ser_48Arg_6_Alias";
    /** <code>solicitudNovedadTCREARINTptpatrNumContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARINT_SOLICITUDNOVEDADTCREARINTPTPATRNUMCONTRATO = "Nº Contrato";
    /** <code>solicitudNovedadTCREARINTptProducto</code> inbound argument name. */
    public static final String ARG_NAME_TCREARINT_SOLICITUDNOVEDADTCREARINTPTPRODUCTO = "ptProducto";
    /** <code>solicitudNovedadTCREARINTptProducto</code> inbound argument id. */
    public static final String ARG_ID_TCREARINT_SOLICITUDNOVEDADTCREARINTPTPRODUCTO = "Clas_1581421428736234Ser_48Arg_7_Alias";
    /** <code>solicitudNovedadTCREARINTptProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARINT_SOLICITUDNOVEDADTCREARINTPTPRODUCTO = "Producto";
    /** <code>solicitudNovedadTCREARINTptTipoNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TCREARINT_SOLICITUDNOVEDADTCREARINTPTTIPONOVEDAD = "ptTipoNovedad";
    /** <code>solicitudNovedadTCREARINTptTipoNovedad</code> inbound argument id. */
    public static final String ARG_ID_TCREARINT_SOLICITUDNOVEDADTCREARINTPTTIPONOVEDAD = "Clas_1581421428736234Ser_48Arg_8_Alias";
    /** <code>solicitudNovedadTCREARINTptTipoNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARINT_SOLICITUDNOVEDADTCREARINTPTTIPONOVEDAD = "Tipo Novedad";
    /** <code>solicitudNovedadTCREARINTptpagrProteccionDatos</code> inbound argument name. */
    public static final String ARG_NAME_TCREARINT_SOLICITUDNOVEDADTCREARINTPTPAGRPROTECCIONDATOS = "pt_p_agrProteccionDatos";
    /** <code>solicitudNovedadTCREARINTptpagrProteccionDatos</code> inbound argument id. */
    public static final String ARG_ID_TCREARINT_SOLICITUDNOVEDADTCREARINTPTPAGRPROTECCIONDATOS = "Clas_1581421428736234Ser_48Arg_9_Alias";
    /** <code>solicitudNovedadTCREARINTptpagrProteccionDatos</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARINT_SOLICITUDNOVEDADTCREARINTPTPAGRPROTECCIONDATOS = "Protección de datos";
    /** <code>solicitudNovedadTCREARINTptpatrExcepcion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARINT_SOLICITUDNOVEDADTCREARINTPTPATREXCEPCION = "pt_p_atrExcepcion";
    /** <code>solicitudNovedadTCREARINTptpatrExcepcion</code> inbound argument id. */
    public static final String ARG_ID_TCREARINT_SOLICITUDNOVEDADTCREARINTPTPATREXCEPCION = "Clas_1581421428736234Ser_48Arg_11_Alias";
    /** <code>solicitudNovedadTCREARINTptpatrExcepcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARINT_SOLICITUDNOVEDADTCREARINTPTPATREXCEPCION = "Excepción";
    /** <code>solicitudNovedadTCREARINTpagrMotivoExcepcion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARINT_SOLICITUDNOVEDADTCREARINTPAGRMOTIVOEXCEPCION = "p_agrMotivoExcepcion";
    /** <code>solicitudNovedadTCREARINTpagrMotivoExcepcion</code> inbound argument id. */
    public static final String ARG_ID_TCREARINT_SOLICITUDNOVEDADTCREARINTPAGRMOTIVOEXCEPCION = "Clas_1581421428736234Ser_48Arg_18_Alias";
    /** <code>solicitudNovedadTCREARINTpagrMotivoExcepcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARINT_SOLICITUDNOVEDADTCREARINTPAGRMOTIVOEXCEPCION = "Motivo Excepción";
    /** <code>solicitudNovedadTCREARINTpatrFechaIniExcepcion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARINT_SOLICITUDNOVEDADTCREARINTPATRFECHAINIEXCEPCION = "p_atrFechaIniExcepcion";
    /** <code>solicitudNovedadTCREARINTpatrFechaIniExcepcion</code> inbound argument id. */
    public static final String ARG_ID_TCREARINT_SOLICITUDNOVEDADTCREARINTPATRFECHAINIEXCEPCION = "Clas_1581421428736234Ser_48Arg_20_Alias";
    /** <code>solicitudNovedadTCREARINTpatrFechaIniExcepcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARINT_SOLICITUDNOVEDADTCREARINTPATRFECHAINIEXCEPCION = "p_atrFechaIniExcepcion";
    /** <code>solicitudNovedadTCREARINTpatrFechaFinExcepcion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARINT_SOLICITUDNOVEDADTCREARINTPATRFECHAFINEXCEPCION = "p_atrFechaFinExcepcion";
    /** <code>solicitudNovedadTCREARINTpatrFechaFinExcepcion</code> inbound argument id. */
    public static final String ARG_ID_TCREARINT_SOLICITUDNOVEDADTCREARINTPATRFECHAFINEXCEPCION = "Clas_1581421428736234Ser_48Arg_21_Alias";
    /** <code>solicitudNovedadTCREARINTpatrFechaFinExcepcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARINT_SOLICITUDNOVEDADTCREARINTPATRFECHAFINEXCEPCION = "p_atrFechaFinExcepcion";
    // Outbound arguments
    /** <code>solicitudNovedadTCREARINToaSolicitud</code> outbound argument name. */
    public static final String ARG_NAME_TCREARINT_SOLICITUDNOVEDADTCREARINTOASOLICITUD = "solicitudNovedadTCREARINToaSolicitud";
    /** <code>solicitudNovedadTCREARINToaSolicitud</code> outbound argument id. */
    public static final String ARG_ID_TCREARINT_SOLICITUDNOVEDADTCREARINTOASOLICITUD = "Clas_1581421428736234Ser_48Arg_12_Alias";
    /** <code>solicitudNovedadTCREARINToaSolicitud</code> outbound argument alias. */
    public static final String ARG_ALIAS_TCREARINT_SOLICITUDNOVEDADTCREARINTOASOLICITUD = "Solicitud de Novedad";
    // Service (TCREAREXCEPCION)
    /** <code>TCREAREXCEPCION</code> service id. */
    public static final String SERV_ID_TCREAREXCEPCION = "Clas_1581421428736234Ser_49_Alias";
    /** <code>TCREAREXCEPCION</code> service name. */
    public static final String SERV_NAME_TCREAREXCEPCION = "TCREAREXCEPCION";
    /** <code>TCREAREXCEPCION</code> service alias. */
    public static final String SERV_ALIAS_TCREAREXCEPCION = "Nueva solicitud novedad excepción";
    /** Agents allowed to execute the service TCREAREXCEPCION **/
    public static final String TCREAREXCEPCION_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>solicitudNovedadTCREAREXCEPCIONptpagrPlan</code> inbound argument name. */
    public static final String ARG_NAME_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPTPAGRPLAN = "pt_p_agrPlan";
    /** <code>solicitudNovedadTCREAREXCEPCIONptpagrPlan</code> inbound argument id. */
    public static final String ARG_ID_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPTPAGRPLAN = "Clas_1581421428736234Ser_49Arg_2_Alias";
    /** <code>solicitudNovedadTCREAREXCEPCIONptpagrPlan</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPTPAGRPLAN = "Plan";
    /** <code>solicitudNovedadTCREAREXCEPCIONptpagrNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPTPAGRNOVEDAD = "pt_p_agrNovedad";
    /** <code>solicitudNovedadTCREAREXCEPCIONptpagrNovedad</code> inbound argument id. */
    public static final String ARG_ID_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPTPAGRNOVEDAD = "Clas_1581421428736234Ser_49Arg_3_Alias";
    /** <code>solicitudNovedadTCREAREXCEPCIONptpagrNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPTPAGRNOVEDAD = "Novedad";
    /** <code>solicitudNovedadTCREAREXCEPCIONptpagrCausal</code> inbound argument name. */
    public static final String ARG_NAME_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPTPAGRCAUSAL = "pt_p_agrCausal";
    /** <code>solicitudNovedadTCREAREXCEPCIONptpagrCausal</code> inbound argument id. */
    public static final String ARG_ID_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPTPAGRCAUSAL = "Clas_1581421428736234Ser_49Arg_4_Alias";
    /** <code>solicitudNovedadTCREAREXCEPCIONptpagrCausal</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPTPAGRCAUSAL = "Causal";
    /** <code>solicitudNovedadTCREAREXCEPCIONptpatrFechaVigencia</code> inbound argument name. */
    public static final String ARG_NAME_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPTPATRFECHAVIGENCIA = "pt_p_atrFechaVigencia";
    /** <code>solicitudNovedadTCREAREXCEPCIONptpatrFechaVigencia</code> inbound argument id. */
    public static final String ARG_ID_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPTPATRFECHAVIGENCIA = "Clas_1581421428736234Ser_49Arg_5_Alias";
    /** <code>solicitudNovedadTCREAREXCEPCIONptpatrFechaVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPTPATRFECHAVIGENCIA = "Fecha de vigencia";
    /** <code>solicitudNovedadTCREAREXCEPCIONptpatrNumContrato</code> inbound argument name. */
    public static final String ARG_NAME_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPTPATRNUMCONTRATO = "pt_p_atrNumContrato";
    /** <code>solicitudNovedadTCREAREXCEPCIONptpatrNumContrato</code> inbound argument id. */
    public static final String ARG_ID_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPTPATRNUMCONTRATO = "Clas_1581421428736234Ser_49Arg_6_Alias";
    /** <code>solicitudNovedadTCREAREXCEPCIONptpatrNumContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPTPATRNUMCONTRATO = "Nº Contrato";
    /** <code>solicitudNovedadTCREAREXCEPCIONptProducto</code> inbound argument name. */
    public static final String ARG_NAME_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPTPRODUCTO = "ptProducto";
    /** <code>solicitudNovedadTCREAREXCEPCIONptProducto</code> inbound argument id. */
    public static final String ARG_ID_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPTPRODUCTO = "Clas_1581421428736234Ser_49Arg_7_Alias";
    /** <code>solicitudNovedadTCREAREXCEPCIONptProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPTPRODUCTO = "Producto";
    /** <code>solicitudNovedadTCREAREXCEPCIONptTipoNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPTTIPONOVEDAD = "ptTipoNovedad";
    /** <code>solicitudNovedadTCREAREXCEPCIONptTipoNovedad</code> inbound argument id. */
    public static final String ARG_ID_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPTTIPONOVEDAD = "Clas_1581421428736234Ser_49Arg_8_Alias";
    /** <code>solicitudNovedadTCREAREXCEPCIONptTipoNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPTTIPONOVEDAD = "Tipo Novedad";
    /** <code>solicitudNovedadTCREAREXCEPCIONptpagrProteccionDatos</code> inbound argument name. */
    public static final String ARG_NAME_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPTPAGRPROTECCIONDATOS = "pt_p_agrProteccionDatos";
    /** <code>solicitudNovedadTCREAREXCEPCIONptpagrProteccionDatos</code> inbound argument id. */
    public static final String ARG_ID_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPTPAGRPROTECCIONDATOS = "Clas_1581421428736234Ser_49Arg_9_Alias";
    /** <code>solicitudNovedadTCREAREXCEPCIONptpagrProteccionDatos</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPTPAGRPROTECCIONDATOS = "Protección de datos";
    /** <code>solicitudNovedadTCREAREXCEPCIONpagrMotivoExcepcion</code> inbound argument name. */
    public static final String ARG_NAME_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPAGRMOTIVOEXCEPCION = "p_agrMotivoExcepcion";
    /** <code>solicitudNovedadTCREAREXCEPCIONpagrMotivoExcepcion</code> inbound argument id. */
    public static final String ARG_ID_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPAGRMOTIVOEXCEPCION = "Clas_1581421428736234Ser_49Arg_13_Alias";
    /** <code>solicitudNovedadTCREAREXCEPCIONpagrMotivoExcepcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPAGRMOTIVOEXCEPCION = "Motivo Excepción";
    /** <code>solicitudNovedadTCREAREXCEPCIONpatrFechaIniExcepcion</code> inbound argument name. */
    public static final String ARG_NAME_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPATRFECHAINIEXCEPCION = "p_atrFechaIniExcepcion";
    /** <code>solicitudNovedadTCREAREXCEPCIONpatrFechaIniExcepcion</code> inbound argument id. */
    public static final String ARG_ID_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPATRFECHAINIEXCEPCION = "Clas_1581421428736234Ser_49Arg_14_Alias";
    /** <code>solicitudNovedadTCREAREXCEPCIONpatrFechaIniExcepcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPATRFECHAINIEXCEPCION = "Fecha Inicio";
    /** <code>solicitudNovedadTCREAREXCEPCIONpatrFechaFinExcepcion</code> inbound argument name. */
    public static final String ARG_NAME_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPATRFECHAFINEXCEPCION = "p_atrFechaFinExcepcion";
    /** <code>solicitudNovedadTCREAREXCEPCIONpatrFechaFinExcepcion</code> inbound argument id. */
    public static final String ARG_ID_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPATRFECHAFINEXCEPCION = "Clas_1581421428736234Ser_49Arg_15_Alias";
    /** <code>solicitudNovedadTCREAREXCEPCIONpatrFechaFinExcepcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONPATRFECHAFINEXCEPCION = "Fecha Fin";
    // Outbound arguments
    /** <code>solicitudNovedadTCREAREXCEPCIONoaSolicitud</code> outbound argument name. */
    public static final String ARG_NAME_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONOASOLICITUD = "solicitudNovedadTCREAREXCEPCIONoaSolicitud";
    /** <code>solicitudNovedadTCREAREXCEPCIONoaSolicitud</code> outbound argument id. */
    public static final String ARG_ID_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONOASOLICITUD = "Clas_1581421428736234Ser_49Arg_12_Alias";
    /** <code>solicitudNovedadTCREAREXCEPCIONoaSolicitud</code> outbound argument alias. */
    public static final String ARG_ALIAS_TCREAREXCEPCION_SOLICITUDNOVEDADTCREAREXCEPCIONOASOLICITUD = "Solicitud de Novedad";
    // Service (TCREARPERSONACORE)
    /** <code>TCREARPERSONACORE</code> service id. */
    public static final String SERV_ID_TCREARPERSONACORE = "Clas_1581421428736234Ser_55_Alias";
    /** <code>TCREARPERSONACORE</code> service name. */
    public static final String SERV_NAME_TCREARPERSONACORE = "TCREARPERSONACORE";
    /** <code>TCREARPERSONACORE</code> service alias. */
    public static final String SERV_ALIAS_TCREARPERSONACORE = "TCREARPERSONACORE";
    /** Agents allowed to execute the service TCREARPERSONACORE **/
    public static final String TCREARPERSONACORE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadTCREARPERSONACOREpthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TCREARPERSONACORE_SOLICITUDNOVEDADTCREARPERSONACOREPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadTCREARPERSONACOREpthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_TCREARPERSONACORE_SOLICITUDNOVEDADTCREARPERSONACOREPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_55Arg_1_Alias";
    /** <code>solicitudNovedadTCREARPERSONACOREpthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARPERSONACORE_SOLICITUDNOVEDADTCREARPERSONACOREPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    /** <code>solicitudNovedadTCREARPERSONACOREptNovedadCT</code> inbound argument name. */
    public static final String ARG_NAME_TCREARPERSONACORE_SOLICITUDNOVEDADTCREARPERSONACOREPTNOVEDADCT = "ptNovedadCT";
    /** <code>solicitudNovedadTCREARPERSONACOREptNovedadCT</code> inbound argument id. */
    public static final String ARG_ID_TCREARPERSONACORE_SOLICITUDNOVEDADTCREARPERSONACOREPTNOVEDADCT = "Clas_1581421428736234Ser_55Arg_2_Alias";
    /** <code>solicitudNovedadTCREARPERSONACOREptNovedadCT</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARPERSONACORE_SOLICITUDNOVEDADTCREARPERSONACOREPTNOVEDADCT = "Familia";
    /** <code>solicitudNovedadTCREARPERSONACOREptNumErrores</code> inbound argument name. */
    public static final String ARG_NAME_TCREARPERSONACORE_SOLICITUDNOVEDADTCREARPERSONACOREPTNUMERRORES = "ptNumErrores";
    /** <code>solicitudNovedadTCREARPERSONACOREptNumErrores</code> inbound argument id. */
    public static final String ARG_ID_TCREARPERSONACORE_SOLICITUDNOVEDADTCREARPERSONACOREPTNUMERRORES = "Clas_1581421428736234Ser_55Arg_4_Alias";
    /** <code>solicitudNovedadTCREARPERSONACOREptNumErrores</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARPERSONACORE_SOLICITUDNOVEDADTCREARPERSONACOREPTNUMERRORES = "ptNumErrores";
    // Outbound arguments
    /** <code>solicitudNovedadTCREARPERSONACOREoaNumErrores</code> outbound argument name. */
    public static final String ARG_NAME_TCREARPERSONACORE_SOLICITUDNOVEDADTCREARPERSONACOREOANUMERRORES = "solicitudNovedadTCREARPERSONACOREoaNumErrores";
    /** <code>solicitudNovedadTCREARPERSONACOREoaNumErrores</code> outbound argument id. */
    public static final String ARG_ID_TCREARPERSONACORE_SOLICITUDNOVEDADTCREARPERSONACOREOANUMERRORES = "Clas_1581421428736234Ser_55Arg_5_Alias";
    /** <code>solicitudNovedadTCREARPERSONACOREoaNumErrores</code> outbound argument alias. */
    public static final String ARG_ALIAS_TCREARPERSONACORE_SOLICITUDNOVEDADTCREARPERSONACOREOANUMERRORES = "Nº Errores";
    // Service (TCAMBIARESTADODOC)
    /** <code>TCAMBIARESTADODOC</code> service id. */
    public static final String SERV_ID_TCAMBIARESTADODOC = "Clas_1581421428736234Ser_60_Alias";
    /** <code>TCAMBIARESTADODOC</code> service name. */
    public static final String SERV_NAME_TCAMBIARESTADODOC = "TCAMBIARESTADODOC";
    /** <code>TCAMBIARESTADODOC</code> service alias. */
    public static final String SERV_ALIAS_TCAMBIARESTADODOC = "Cambiar estado documentación";
    /** Agents allowed to execute the service TCAMBIARESTADODOC **/
    public static final String TCAMBIARESTADODOC_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Inbound arguments
    /** <code>solicitudNovedadTCAMBIARESTADODOCpthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARESTADODOC_SOLICITUDNOVEDADTCAMBIARESTADODOCPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadTCAMBIARESTADODOCpthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARESTADODOC_SOLICITUDNOVEDADTCAMBIARESTADODOCPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_60Arg_1_Alias";
    /** <code>solicitudNovedadTCAMBIARESTADODOCpthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARESTADODOC_SOLICITUDNOVEDADTCAMBIARESTADODOCPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    /** <code>solicitudNovedadTCAMBIARESTADODOCptEstadoDoc</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARESTADODOC_SOLICITUDNOVEDADTCAMBIARESTADODOCPTESTADODOC = "ptEstadoDoc";
    /** <code>solicitudNovedadTCAMBIARESTADODOCptEstadoDoc</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARESTADODOC_SOLICITUDNOVEDADTCAMBIARESTADODOCPTESTADODOC = "Clas_1581421428736234Ser_60Arg_2_Alias";
    /** <code>solicitudNovedadTCAMBIARESTADODOCptEstadoDoc</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARESTADODOC_SOLICITUDNOVEDADTCAMBIARESTADODOCPTESTADODOC = "ptEstadoDoc";
    // Service (TASGAUTOUSRAFILI)
    /** <code>TASGAUTOUSRAFILI</code> service id. */
    public static final String SERV_ID_TASGAUTOUSRAFILI = "Clas_1581421428736234Ser_61_Alias";
    /** <code>TASGAUTOUSRAFILI</code> service name. */
    public static final String SERV_NAME_TASGAUTOUSRAFILI = "TASGAUTOUSRAFILI";
    /** <code>TASGAUTOUSRAFILI</code> service alias. */
    public static final String SERV_ALIAS_TASGAUTOUSRAFILI = "TASGAUTOUSRAFILI";
    /** Agents allowed to execute the service TASGAUTOUSRAFILI **/
    public static final String TASGAUTOUSRAFILI_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadTASGAUTOUSRAFILIpthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TASGAUTOUSRAFILI_SOLICITUDNOVEDADTASGAUTOUSRAFILIPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadTASGAUTOUSRAFILIpthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_TASGAUTOUSRAFILI_SOLICITUDNOVEDADTASGAUTOUSRAFILIPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_61Arg_1_Alias";
    /** <code>solicitudNovedadTASGAUTOUSRAFILIpthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TASGAUTOUSRAFILI_SOLICITUDNOVEDADTASGAUTOUSRAFILIPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    /** <code>solicitudNovedadTASGAUTOUSRAFILIptFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_TASGAUTOUSRAFILI_SOLICITUDNOVEDADTASGAUTOUSRAFILIPTFUNCIONARIO = "ptFuncionario";
    /** <code>solicitudNovedadTASGAUTOUSRAFILIptFuncionario</code> inbound argument id. */
    public static final String ARG_ID_TASGAUTOUSRAFILI_SOLICITUDNOVEDADTASGAUTOUSRAFILIPTFUNCIONARIO = "Clas_1581421428736234Ser_61Arg_2_Alias";
    /** <code>solicitudNovedadTASGAUTOUSRAFILIptFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TASGAUTOUSRAFILI_SOLICITUDNOVEDADTASGAUTOUSRAFILIPTFUNCIONARIO = "Usuario";
    // Service (TASGUSRAFILI)
    /** <code>TASGUSRAFILI</code> service id. */
    public static final String SERV_ID_TASGUSRAFILI = "Clas_1581421428736234Ser_62_Alias";
    /** <code>TASGUSRAFILI</code> service name. */
    public static final String SERV_NAME_TASGUSRAFILI = "TASGUSRAFILI";
    /** <code>TASGUSRAFILI</code> service alias. */
    public static final String SERV_ALIAS_TASGUSRAFILI = "Asignar Usuario";
    /** Agents allowed to execute the service TASGUSRAFILI **/
    public static final String TASGUSRAFILI_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadTASGUSRAFILIpthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TASGUSRAFILI_SOLICITUDNOVEDADTASGUSRAFILIPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadTASGUSRAFILIpthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_TASGUSRAFILI_SOLICITUDNOVEDADTASGUSRAFILIPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_62Arg_1_Alias";
    /** <code>solicitudNovedadTASGUSRAFILIpthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TASGUSRAFILI_SOLICITUDNOVEDADTASGUSRAFILIPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    /** <code>solicitudNovedadTASGUSRAFILIptFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_TASGUSRAFILI_SOLICITUDNOVEDADTASGUSRAFILIPTFUNCIONARIO = "ptFuncionario";
    /** <code>solicitudNovedadTASGUSRAFILIptFuncionario</code> inbound argument id. */
    public static final String ARG_ID_TASGUSRAFILI_SOLICITUDNOVEDADTASGUSRAFILIPTFUNCIONARIO = "Clas_1581421428736234Ser_62Arg_2_Alias";
    /** <code>solicitudNovedadTASGUSRAFILIptFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TASGUSRAFILI_SOLICITUDNOVEDADTASGUSRAFILIPTFUNCIONARIO = "Usuario";
    // Service (TMARCARTERMINADA)
    /** <code>TMARCARTERMINADA</code> service id. */
    public static final String SERV_ID_TMARCARTERMINADA = "Clas_1581421428736234Ser_69_Alias";
    /** <code>TMARCARTERMINADA</code> service name. */
    public static final String SERV_NAME_TMARCARTERMINADA = "TMARCARTERMINADA";
    /** <code>TMARCARTERMINADA</code> service alias. */
    public static final String SERV_ALIAS_TMARCARTERMINADA = "TMARCARTERMINADA";
    /** Agents allowed to execute the service TMARCARTERMINADA **/
    public static final String TMARCARTERMINADA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadTMARCARTERMINADApthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TMARCARTERMINADA_SOLICITUDNOVEDADTMARCARTERMINADAPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadTMARCARTERMINADApthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_TMARCARTERMINADA_SOLICITUDNOVEDADTMARCARTERMINADAPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_69Arg_1_Alias";
    /** <code>solicitudNovedadTMARCARTERMINADApthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMARCARTERMINADA_SOLICITUDNOVEDADTMARCARTERMINADAPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    // Service (TREASIGNARUSUARIOS)
    /** <code>TREASIGNARUSUARIOS</code> service id. */
    public static final String SERV_ID_TREASIGNARUSUARIOS = "Clas_1581421428736234Ser_70_Alias";
    /** <code>TREASIGNARUSUARIOS</code> service name. */
    public static final String SERV_NAME_TREASIGNARUSUARIOS = "TREASIGNARUSUARIOS";
    /** <code>TREASIGNARUSUARIOS</code> service alias. */
    public static final String SERV_ALIAS_TREASIGNARUSUARIOS = "Reasignación de solicitud";
    /** Agents allowed to execute the service TREASIGNARUSUARIOS **/
    public static final String TREASIGNARUSUARIOS_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>solicitudNovedadTREASIGNARUSUARIOSpthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TREASIGNARUSUARIOS_SOLICITUDNOVEDADTREASIGNARUSUARIOSPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadTREASIGNARUSUARIOSpthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_TREASIGNARUSUARIOS_SOLICITUDNOVEDADTREASIGNARUSUARIOSPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_70Arg_1_Alias";
    /** <code>solicitudNovedadTREASIGNARUSUARIOSpthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TREASIGNARUSUARIOS_SOLICITUDNOVEDADTREASIGNARUSUARIOSPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    /** <code>solicitudNovedadTREASIGNARUSUARIOSptUsrAfiliacion</code> inbound argument name. */
    public static final String ARG_NAME_TREASIGNARUSUARIOS_SOLICITUDNOVEDADTREASIGNARUSUARIOSPTUSRAFILIACION = "ptUsrAfiliacion";
    /** <code>solicitudNovedadTREASIGNARUSUARIOSptUsrAfiliacion</code> inbound argument id. */
    public static final String ARG_ID_TREASIGNARUSUARIOS_SOLICITUDNOVEDADTREASIGNARUSUARIOSPTUSRAFILIACION = "Clas_1581421428736234Ser_70Arg_2_Alias";
    /** <code>solicitudNovedadTREASIGNARUSUARIOSptUsrAfiliacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TREASIGNARUSUARIOS_SOLICITUDNOVEDADTREASIGNARUSUARIOSPTUSRAFILIACION = "Asesor Integral / Grabador Afiliaciones ";
    // Service (TCALCESTADODOCU)
    /** <code>TCALCESTADODOCU</code> service id. */
    public static final String SERV_ID_TCALCESTADODOCU = "Clas_1581421428736234Ser_71_Alias";
    /** <code>TCALCESTADODOCU</code> service name. */
    public static final String SERV_NAME_TCALCESTADODOCU = "TCALCESTADODOCU";
    /** <code>TCALCESTADODOCU</code> service alias. */
    public static final String SERV_ALIAS_TCALCESTADODOCU = "TCALCESTADODOCU";
    /** Agents allowed to execute the service TCALCESTADODOCU **/
    public static final String TCALCESTADODOCU_SRVAGENTS = "";
    // Inbound arguments
    /** <code>solicitudNovedadTCALCESTADODOCUpthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TCALCESTADODOCU_SOLICITUDNOVEDADTCALCESTADODOCUPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadTCALCESTADODOCUpthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_TCALCESTADODOCU_SOLICITUDNOVEDADTCALCESTADODOCUPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_71Arg_1_Alias";
    /** <code>solicitudNovedadTCALCESTADODOCUpthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCALCESTADODOCU_SOLICITUDNOVEDADTCALCESTADODOCUPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    // Service (TFIRMAR)
    /** <code>TFIRMAR</code> service id. */
    public static final String SERV_ID_TFIRMAR = "Clas_1581421428736234Ser_75_Alias";
    /** <code>TFIRMAR</code> service name. */
    public static final String SERV_NAME_TFIRMAR = "TFIRMAR";
    /** <code>TFIRMAR</code> service alias. */
    public static final String SERV_ALIAS_TFIRMAR = "Firma";
    /** Agents allowed to execute the service TFIRMAR **/
    public static final String TFIRMAR_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Inbound arguments
    /** <code>solicitudNovedadTFIRMARpthisSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TFIRMAR_SOLICITUDNOVEDADTFIRMARPTHISSOLICITUDNOVEDAD = "p_thisSolicitudNovedad";
    /** <code>solicitudNovedadTFIRMARpthisSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_TFIRMAR_SOLICITUDNOVEDADTFIRMARPTHISSOLICITUDNOVEDAD = "Clas_1581421428736234Ser_75Arg_1_Alias";
    /** <code>solicitudNovedadTFIRMARpthisSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TFIRMAR_SOLICITUDNOVEDADTFIRMARPTHISSOLICITUDNOVEDAD = "Solicitud de Novedad";
    /** <code>solicitudNovedadTFIRMARptpatrImagenFirma</code> inbound argument name. */
    public static final String ARG_NAME_TFIRMAR_SOLICITUDNOVEDADTFIRMARPTPATRIMAGENFIRMA = "pt_p_atrImagenFirma";
    /** <code>solicitudNovedadTFIRMARptpatrImagenFirma</code> inbound argument id. */
    public static final String ARG_ID_TFIRMAR_SOLICITUDNOVEDADTFIRMARPTPATRIMAGENFIRMA = "Clas_1581421428736234Ser_75Arg_2_Alias";
    /** <code>solicitudNovedadTFIRMARptpatrImagenFirma</code> inbound argument alias. */
    public static final String ARG_ALIAS_TFIRMAR_SOLICITUDNOVEDADTFIRMARPTPATRIMAGENFIRMA = "Firma";
    /** <code>solicitudNovedadTFIRMARptpatrLatitud</code> inbound argument name. */
    public static final String ARG_NAME_TFIRMAR_SOLICITUDNOVEDADTFIRMARPTPATRLATITUD = "pt_p_atrLatitud";
    /** <code>solicitudNovedadTFIRMARptpatrLatitud</code> inbound argument id. */
    public static final String ARG_ID_TFIRMAR_SOLICITUDNOVEDADTFIRMARPTPATRLATITUD = "Clas_1581421428736234Ser_75Arg_3_Alias";
    /** <code>solicitudNovedadTFIRMARptpatrLatitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TFIRMAR_SOLICITUDNOVEDADTFIRMARPTPATRLATITUD = "Latitud";
    /** <code>solicitudNovedadTFIRMARptpatrLongitud</code> inbound argument name. */
    public static final String ARG_NAME_TFIRMAR_SOLICITUDNOVEDADTFIRMARPTPATRLONGITUD = "pt_p_atrLongitud";
    /** <code>solicitudNovedadTFIRMARptpatrLongitud</code> inbound argument id. */
    public static final String ARG_ID_TFIRMAR_SOLICITUDNOVEDADTFIRMARPTPATRLONGITUD = "Clas_1581421428736234Ser_75Arg_4_Alias";
    /** <code>solicitudNovedadTFIRMARptpatrLongitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TFIRMAR_SOLICITUDNOVEDADTFIRMARPTPATRLONGITUD = "Longitud";
    /** <code>solicitudNovedadTFIRMARptTexto</code> inbound argument name. */
    public static final String ARG_NAME_TFIRMAR_SOLICITUDNOVEDADTFIRMARPTTEXTO = "pt_Texto";
    /** <code>solicitudNovedadTFIRMARptTexto</code> inbound argument id. */
    public static final String ARG_ID_TFIRMAR_SOLICITUDNOVEDADTFIRMARPTTEXTO = "Clas_1581421428736234Ser_75Arg_5_Alias";
    /** <code>solicitudNovedadTFIRMARptTexto</code> inbound argument alias. */
    public static final String ARG_ALIAS_TFIRMAR_SOLICITUDNOVEDADTFIRMARPTTEXTO = "pt_Texto";

    public static final String FILTER_NAME_FSOLICITUDNOVEDADNUMFECHAS = "F_SolicitudNovedad_NumFechas";
    public static final String VAR_NAME_FSOLICITUDNOVEDADNUMFECHAS_VFNUMRADICADO = "vfNumRadicado";
    public static final String VAR_NAME_FSOLICITUDNOVEDADNUMFECHAS_VFDESDE = "vfDesde";
    public static final String VAR_NAME_FSOLICITUDNOVEDADNUMFECHAS_VFHASTA = "vfHasta";
    public static final String FILTER_NAME_FSOLICITUDNOVEDADNUMFECHESTA = "F_SolicitudNovedad_NumFechEsta";
    public static final String VAR_NAME_FSOLICITUDNOVEDADNUMFECHESTA_VFNUMRADICADO = "vfNumRadicado";
    public static final String VAR_NAME_FSOLICITUDNOVEDADNUMFECHESTA_VFDESDE = "vfDesde";
    public static final String VAR_NAME_FSOLICITUDNOVEDADNUMFECHESTA_VFHASTA = "vfHasta";
    public static final String VAR_NAME_FSOLICITUDNOVEDADNUMFECHESTA_VFESTADO = "vfEstado";
    public static final String VAR_NAME_FSOLICITUDNOVEDADNUMFECHESTA_VFTIPONOVEDAD = "vfTipoNovedad";
    public static final String VAR_NAME_FSOLICITUDNOVEDADNUMFECHESTA_VFESTADODOC = "vfEstadoDoc";
    public static final String FILTER_NAME_IFILTROPORNUMRADICADO = "iFiltroPorNumRadicado";
    public static final String VAR_NAME_IFILTROPORNUMRADICADO_VFNUMRADICADO = "vfNumRadicado";
    public static final String FILTER_NAME_FSOLICITUDNOVEDADESTATUAFIL1 = "F_SolicitudNovedadEstatu_Afil1";
    public static final String VAR_NAME_FSOLICITUDNOVEDADESTATUAFIL1_VFNUMRADICADO = "vfNumRadicado";
    public static final String VAR_NAME_FSOLICITUDNOVEDADESTATUAFIL1_VFDESDE = "vfDesde";
    public static final String VAR_NAME_FSOLICITUDNOVEDADESTATUAFIL1_VFHASTA = "vfHasta";
    public static final String VAR_NAME_FSOLICITUDNOVEDADESTATUAFIL1_VFESTADO = "vfEstado";
    public static final String VAR_NAME_FSOLICITUDNOVEDADESTATUAFIL1_VFTIPONOVEDAD = "vfTipoNovedad";
    public static final String VAR_NAME_FSOLICITUDNOVEDADESTATUAFIL1_VFESTADODOC = "vfEstadoDoc";
    public static final String FILTER_NAME_FSOLICITUDNOVEDADESTATUAFIL2 = "F_SolicitudNovedadEstatu_Afil2";
    public static final String VAR_NAME_FSOLICITUDNOVEDADESTATUAFIL2_VFNUMRADICADO = "vfNumRadicado";
    public static final String VAR_NAME_FSOLICITUDNOVEDADESTATUAFIL2_VFDESDE = "vfDesde";
    public static final String VAR_NAME_FSOLICITUDNOVEDADESTATUAFIL2_VFHASTA = "vfHasta";
    public static final String VAR_NAME_FSOLICITUDNOVEDADESTATUAFIL2_VFESTADO = "vfEstado";
    public static final String VAR_NAME_FSOLICITUDNOVEDADESTATUAFIL2_VFTIPONOVEDAD = "vfTipoNovedad";
    public static final String FILTER_NAME_FSOLICITUDNOVEDADESTATUAFIL3 = "F_SolicitudNovedadEstatu_Afil3";
    public static final String VAR_NAME_FSOLICITUDNOVEDADESTATUAFIL3_VFNUMRADICADO = "vfNumRadicado";
    public static final String VAR_NAME_FSOLICITUDNOVEDADESTATUAFIL3_VFDESDE = "vfDesde";
    public static final String VAR_NAME_FSOLICITUDNOVEDADESTATUAFIL3_VFHASTA = "vfHasta";
    public static final String VAR_NAME_FSOLICITUDNOVEDADESTATUAFIL3_VFESTADO = "vfEstado";
    public static final String VAR_NAME_FSOLICITUDNOVEDADESTATUAFIL3_VFTIPONOVEDAD = "vfTipoNovedad";
    public static final String FILTER_NAME_IFSOLNOVVALIDADORUSUARIOS = "iF_SolNovValidadorUsuarios";
    public static final String VAR_NAME_IFSOLNOVVALIDADORUSUARIOS_VFNUMCONTRATO = "vfNumContrato";
    public static final String VAR_NAME_IFSOLNOVVALIDADORUSUARIOS_VFPLAN = "vfPlan";
    public static final String VAR_NAME_IFSOLNOVVALIDADORUSUARIOS_VFPRODUCTO = "vfProducto";
    public static final String VAR_NAME_IFSOLNOVVALIDADORUSUARIOS_VFTIPOIDENT = "vfTipoIdent";
    public static final String VAR_NAME_IFSOLNOVVALIDADORUSUARIOS_VFNUMIDENT = "vfNumIdent";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADNUMRADICADO.toUpperCase(), Constants.Type.AUTONUMERIC.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADFECHACREACION.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADFECHAVIGENCIA.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADNUMCONTRATO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADEXCEPCION.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADFECHAINIEXCEPCION.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADFECHAFINEXCEPCION.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADCTRCODIGOTARIFA.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADCTRDESCTARIFA.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADCTRCODIGOCONVENIO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADCTRDESCCONVENIO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADCTRESCOLECTIVO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADCTRTAGCAUSAEXCLUSION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADCONTRANUMIDEN.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADCONTRAPRIMERNOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADCONTRASEGUNDONOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADCONTRAPRIMERAPELLIDO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADCONTRASEGUNDOAPELLIDO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADCONTRARAZONSOCIAL.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADFECHAULTIMODOC.toUpperCase(), Constants.Type.DATETIME.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADOBSERVACIONS.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADESTADO.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADESTADODOCUMENTACION.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADCOMPLETADA.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADFECHACOMPLETADA.toUpperCase(), Constants.Type.DATETIME.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADCTRACTIVO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADCTRTIPOCONTRATO.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADSCNUMMESES.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADCONTRANUEVARAZONSOCIAL.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADCONTRATIPOPERSONA.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADCTRFINICIOCONTRATO.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADDRVEXIGECONTRATOACTIVO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADDRVEXIGEFAMILIAACTIVA.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADCONTRADRVNOMBRECOMPLETO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADDRVTARIFA.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADDRVCONVENIO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADCONTRADRVIDENTIFICACION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADDRVGRUPOASOCIADO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADDRVPERIODICIDAD.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADDRVPERMITEADDFAM.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADDRVPERMITEDELFAM.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADDRVEXIGEDOCSOLICITUD.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADDRVEXIGEDOCPERSONA.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADDRVREPORTCOLOSCURO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADDRVREPORTCOLCLARO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADDRVREPORTLOGO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADDRVNUEVAPERIODICIDAD.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADPRIORIDAD.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADFECHATERMINADA.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADFECHAFUG.toUpperCase(), Constants.Type.DATETIME.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADFECHAFA.toUpperCase(), Constants.Type.DATETIME.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADSEMAFOROGRABASE.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADDRVSEMAFOROGRABASE.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADDRVNUMRADICADOSTR.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADDRVVALIDARPS1.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SOLICITUDNOVEDADDRVVALIDARPS2.toUpperCase(), Constants.Type.BOOL.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADID.toUpperCase(), SOLICITUDNOVEDADID_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADNUMRADICADO.toUpperCase(), SOLICITUDNOVEDADNUMRADICADO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADFECHACREACION.toUpperCase(), SOLICITUDNOVEDADFECHACREACION_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADFECHAVIGENCIA.toUpperCase(), SOLICITUDNOVEDADFECHAVIGENCIA_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADNUMCONTRATO.toUpperCase(), SOLICITUDNOVEDADNUMCONTRATO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADEXCEPCION.toUpperCase(), SOLICITUDNOVEDADEXCEPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADFECHAINIEXCEPCION.toUpperCase(), SOLICITUDNOVEDADFECHAINIEXCEPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADFECHAFINEXCEPCION.toUpperCase(), SOLICITUDNOVEDADFECHAFINEXCEPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADCTRCODIGOTARIFA.toUpperCase(), SOLICITUDNOVEDADCTRCODIGOTARIFA_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADCTRDESCTARIFA.toUpperCase(), SOLICITUDNOVEDADCTRDESCTARIFA_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADCTRCODIGOCONVENIO.toUpperCase(), SOLICITUDNOVEDADCTRCODIGOCONVENIO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADCTRDESCCONVENIO.toUpperCase(), SOLICITUDNOVEDADCTRDESCCONVENIO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADCTRESCOLECTIVO.toUpperCase(), SOLICITUDNOVEDADCTRESCOLECTIVO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADCTRTAGCAUSAEXCLUSION.toUpperCase(), SOLICITUDNOVEDADCTRTAGCAUSAEXCLUSION_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADCONTRANUMIDEN.toUpperCase(), SOLICITUDNOVEDADCONTRANUMIDEN_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADCONTRAPRIMERNOMBRE.toUpperCase(), SOLICITUDNOVEDADCONTRAPRIMERNOMBRE_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADCONTRASEGUNDONOMBRE.toUpperCase(), SOLICITUDNOVEDADCONTRASEGUNDONOMBRE_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADCONTRAPRIMERAPELLIDO.toUpperCase(), SOLICITUDNOVEDADCONTRAPRIMERAPELLIDO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADCONTRASEGUNDOAPELLIDO.toUpperCase(), SOLICITUDNOVEDADCONTRASEGUNDOAPELLIDO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADCONTRARAZONSOCIAL.toUpperCase(), SOLICITUDNOVEDADCONTRARAZONSOCIAL_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADFECHAULTIMODOC.toUpperCase(), SOLICITUDNOVEDADFECHAULTIMODOC_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADOBSERVACIONS.toUpperCase(), SOLICITUDNOVEDADOBSERVACIONS_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADESTADO.toUpperCase(), SOLICITUDNOVEDADESTADO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADESTADODOCUMENTACION.toUpperCase(), SOLICITUDNOVEDADESTADODOCUMENTACION_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADCOMPLETADA.toUpperCase(), SOLICITUDNOVEDADCOMPLETADA_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADFECHACOMPLETADA.toUpperCase(), SOLICITUDNOVEDADFECHACOMPLETADA_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADCTRACTIVO.toUpperCase(), SOLICITUDNOVEDADCTRACTIVO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADCTRTIPOCONTRATO.toUpperCase(), SOLICITUDNOVEDADCTRTIPOCONTRATO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADSCNUMMESES.toUpperCase(), SOLICITUDNOVEDADSCNUMMESES_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADCONTRANUEVARAZONSOCIAL.toUpperCase(), SOLICITUDNOVEDADCONTRANUEVARAZONSOCIAL_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADCONTRATIPOPERSONA.toUpperCase(), SOLICITUDNOVEDADCONTRATIPOPERSONA_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADCTRFINICIOCONTRATO.toUpperCase(), SOLICITUDNOVEDADCTRFINICIOCONTRATO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADDRVEXIGECONTRATOACTIVO.toUpperCase(), SOLICITUDNOVEDADDRVEXIGECONTRATOACTIVO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADDRVEXIGEFAMILIAACTIVA.toUpperCase(), SOLICITUDNOVEDADDRVEXIGEFAMILIAACTIVA_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADCONTRADRVNOMBRECOMPLETO.toUpperCase(), SOLICITUDNOVEDADCONTRADRVNOMBRECOMPLETO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADDRVTARIFA.toUpperCase(), SOLICITUDNOVEDADDRVTARIFA_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADDRVCONVENIO.toUpperCase(), SOLICITUDNOVEDADDRVCONVENIO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADCONTRADRVIDENTIFICACION.toUpperCase(), SOLICITUDNOVEDADCONTRADRVIDENTIFICACION_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADDRVGRUPOASOCIADO.toUpperCase(), SOLICITUDNOVEDADDRVGRUPOASOCIADO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADDRVPERIODICIDAD.toUpperCase(), SOLICITUDNOVEDADDRVPERIODICIDAD_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADDRVPERMITEADDFAM.toUpperCase(), SOLICITUDNOVEDADDRVPERMITEADDFAM_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADDRVPERMITEDELFAM.toUpperCase(), SOLICITUDNOVEDADDRVPERMITEDELFAM_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADDRVEXIGEDOCSOLICITUD.toUpperCase(), SOLICITUDNOVEDADDRVEXIGEDOCSOLICITUD_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADDRVEXIGEDOCPERSONA.toUpperCase(), SOLICITUDNOVEDADDRVEXIGEDOCPERSONA_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADDRVREPORTCOLOSCURO.toUpperCase(), SOLICITUDNOVEDADDRVREPORTCOLOSCURO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADDRVREPORTCOLCLARO.toUpperCase(), SOLICITUDNOVEDADDRVREPORTCOLCLARO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADDRVREPORTLOGO.toUpperCase(), SOLICITUDNOVEDADDRVREPORTLOGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADDRVNUEVAPERIODICIDAD.toUpperCase(), SOLICITUDNOVEDADDRVNUEVAPERIODICIDAD_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADPRIORIDAD.toUpperCase(), SOLICITUDNOVEDADPRIORIDAD_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADFECHATERMINADA.toUpperCase(), SOLICITUDNOVEDADFECHATERMINADA_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADFECHAFUG.toUpperCase(), SOLICITUDNOVEDADFECHAFUG_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADFECHAFA.toUpperCase(), SOLICITUDNOVEDADFECHAFA_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADSEMAFOROGRABASE.toUpperCase(), SOLICITUDNOVEDADSEMAFOROGRABASE_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADDRVSEMAFOROGRABASE.toUpperCase(), SOLICITUDNOVEDADDRVSEMAFOROGRABASE_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADDRVNUMRADICADOSTR.toUpperCase(), SOLICITUDNOVEDADDRVNUMRADICADOSTR_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADDRVVALIDARPS1.toUpperCase(), SOLICITUDNOVEDADDRVVALIDARPS1_AGENTS);
    	attributeAgents.put(ATTR_NAME_SOLICITUDNOVEDADDRVVALIDARPS2.toUpperCase(), SOLICITUDNOVEDADDRVVALIDARPS2_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_PLANT.toUpperCase(), PLANT_AGENTS);
        roleAgents.put(ROLE_NAME_NOVEDAD.toUpperCase(), NOVEDAD_AGENTS);
        roleAgents.put(ROLE_NAME_CAUSAL.toUpperCase(), CAUSAL_AGENTS);
        roleAgents.put(ROLE_NAME_PROTECCIONDATOS.toUpperCase(), PROTECCIONDATOS_AGENTS);
        roleAgents.put(ROLE_NAME_TIPOIDENTCONTRATANTE.toUpperCase(), TIPOIDENTCONTRATANTE_AGENTS);
        roleAgents.put(ROLE_NAME_ESTADOCONTRATO.toUpperCase(), ESTADOCONTRATO_AGENTS);
        roleAgents.put(ROLE_NAME_GRUPOASOCIADO.toUpperCase(), GRUPOASOCIADO_AGENTS);
        roleAgents.put(ROLE_NAME_PERIODICIDAD.toUpperCase(), PERIODICIDAD_AGENTS);
        roleAgents.put(ROLE_NAME_AGENTE.toUpperCase(), AGENTE_AGENTS);
        roleAgents.put(ROLE_NAME_PERIODICIDADNUEVA.toUpperCase(), PERIODICIDADNUEVA_AGENTS);
        roleAgents.put(ROLE_NAME_MOTIVOEXCEPCION.toUpperCase(), MOTIVOEXCEPCION_AGENTS);
        roleAgents.put(ROLE_NAME_USRAFILIACION.toUpperCase(), USRAFILIACION_AGENTS);
        roleAgents.put(ROLE_NAME_FIRMA.toUpperCase(), FIRMA_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'SolicitudNovedad', it returns the identification keys
     * - If className is a facet of the inheritance net of 'SolicitudNovedad', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_SOLICITUDNOVEDADID);
        }
        // Facet 'SolicitudNovedad' (This facet)
        if (SolicitudNovedadConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_SOLICITUDNOVEDADID);
        }
        return returnList;
    }
}
