package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>Periodicidad</code> model class.
 */
public final class PeriodicidadConstants {

    private PeriodicidadConstants() {

    }

    // Class
    /** <code>Periodicidad</code> class id. */
    public static final String CLASS_ID = "Clas_1431699849216490_Alias";
    /** <code>Periodicidad</code> class name. */
    public static final String CLASS_NAME = "Periodicidad";
    /** <code>Periodicidad</code> class alias. */
    public static final String CLASS_ALIAS = "Periodicidad";
    /** <code>Periodicidad</code> class table name. */
    public static final String TBL_NAME = "Periodicidad";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "periodicidadCodigo,periodicidadDescripcion,periodicidadEsMensual";

    public static final String DSICPERIODICIDAD = "IC_Periodicidad";
    

    // Attribute (periodicidadCodigo)
    /** <code>periodicidadCodigo</code> attribute id. */
    public static final String ATTR_ID_PERIODICIDADCODIGO = "Clas_1431699849216490Atr_1_Alias";
    /** <code>periodicidadCodigo</code> attribute name. */
    public static final String ATTR_NAME_PERIODICIDADCODIGO = "periodicidadCodigo";
    /** <code>periodicidadCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_PERIODICIDADCODIGO = "Código";

    /** <code>periodicidadCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERIODICIDADCODIGO = "";
    /** Agents allowed to view the attribute periodicidadCodigo **/
    public static final String PERIODICIDADCODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (periodicidadDescripcion)
    /** <code>periodicidadDescripcion</code> attribute id. */
    public static final String ATTR_ID_PERIODICIDADDESCRIPCION = "Clas_1431699849216490Atr_2_Alias";
    /** <code>periodicidadDescripcion</code> attribute name. */
    public static final String ATTR_NAME_PERIODICIDADDESCRIPCION = "periodicidadDescripcion";
    /** <code>periodicidadDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_PERIODICIDADDESCRIPCION = "Descripción";

    /** <code>periodicidadDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERIODICIDADDESCRIPCION = "";
    /** Agents allowed to view the attribute periodicidadDescripcion **/
    public static final String PERIODICIDADDESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (periodicidadEsMensual)
    /** <code>periodicidadEsMensual</code> attribute id. */
    public static final String ATTR_ID_PERIODICIDADESMENSUAL = "Clas_1431699849216490Atr_3_Alias";
    /** <code>periodicidadEsMensual</code> attribute name. */
    public static final String ATTR_NAME_PERIODICIDADESMENSUAL = "periodicidadEsMensual";
    /** <code>periodicidadEsMensual</code> attribute alias. */
    public static final String ATTR_ALIAS_PERIODICIDADESMENSUAL = "Es mensual";

    /** <code>periodicidadEsMensual</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERIODICIDADESMENSUAL = "";
    /** Agents allowed to view the attribute periodicidadEsMensual **/
    public static final String PERIODICIDADESMENSUAL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (periodicidaddrvNumPagos)
    /** <code>periodicidaddrvNumPagos</code> attribute id. */
    public static final String ATTR_ID_PERIODICIDADDRVNUMPAGOS = "Clas_1431699849216490Atr_4_Alias";
    /** <code>periodicidaddrvNumPagos</code> attribute name. */
    public static final String ATTR_NAME_PERIODICIDADDRVNUMPAGOS = "periodicidaddrvNumPagos";
    /** <code>periodicidaddrvNumPagos</code> attribute alias. */
    public static final String ATTR_ALIAS_PERIODICIDADDRVNUMPAGOS = "No. Pagos al año";

    /** <code>periodicidaddrvNumPagos</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERIODICIDADDRVNUMPAGOS = "";
    /** Agents allowed to view the attribute periodicidaddrvNumPagos **/
    public static final String PERIODICIDADDRVNUMPAGOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_PERIODICIDADCODIGO = "Codigo";    
    /** <code>periodicidadCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_PERIODICIDADCODIGO = "periodicidadCodigo";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_PERIODICIDADDESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_PERIODICIDADDESCRIPCIONLENGTH = 150;
    /** <code>periodicidadDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_PERIODICIDADDESCRIPCION = "periodicidadDescripcion";
    // Field (EsMensual)
    /** <code>EsMensual</code> field name. */
    public static final String FLD_PERIODICIDADESMENSUAL = "EsMensual";    
    /** <code>periodicidadEsMensual</code> attribute field name. */
    public static final String ATTR_FIELD_PERIODICIDADESMENSUAL = "periodicidadEsMensual";


    // Compound role (Dominios)
    /** <code>Dominios</code> role id. */
    public static final String ROLE_ID_DOMINIOS = "Agr_1431701815296927_Alias";
    /** <code>Dominios</code> role name. */
    public static final String ROLE_NAME_DOMINIOS = "dominios";
    /** <code>Periodicidades</code> role alias. */
    public static final String ROLE_ALIAS_DOMINIOS = "Dominios";


    /** <code>Dominios</code> inverse role name. */
    public static final String ROLE_INVNAME_DOMINIOS = DominioConstants.ROLE_NAME_PERIODICIDADES;
    /** <code>Dominios</code> role facet sequence. */
    public static final String PATH_FACETS_DOMINIOS = "";
    /** <code>Dominios</code> role target class. */
    public static final String ROLE_TARGET_DOMINIOS = DominioConstants.CLASS_NAME;
    /** Agents allowed to navigate through Dominios **/
    public static final String DOMINIOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (Solicitudes)
    /** <code>Solicitudes</code> role id. */
    public static final String ROLE_ID_SOLICITUDES = "Agr_1432812257280358_Alias";
    /** <code>Solicitudes</code> role name. */
    public static final String ROLE_NAME_SOLICITUDES = "solicitudes";
    /** <code>Periodicidad</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUDES = "Solicitudes";


    /** <code>Solicitudes</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUDES = SolicitudConstants.ROLE_NAME_PERIODICIDAD;
    /** <code>Solicitudes</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUDES = "";
    /** <code>Solicitudes</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUDES = SolicitudConstants.CLASS_NAME;
    /** Agents allowed to navigate through Solicitudes **/
    public static final String SOLICITUDES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (AnexosMat)
    /** <code>AnexosMat</code> role id. */
    public static final String ROLE_ID_ANEXOSMAT = "Agr_1432916066304192_Alias";
    /** <code>AnexosMat</code> role name. */
    public static final String ROLE_NAME_ANEXOSMAT = "anexosMat";
    /** <code>Periodicidad</code> role alias. */
    public static final String ROLE_ALIAS_ANEXOSMAT = "Anexos maternidad";


    /** <code>AnexosMat</code> inverse role name. */
    public static final String ROLE_INVNAME_ANEXOSMAT = AnexoMatConstants.ROLE_NAME_PERIODICIDAD;
    /** <code>AnexosMat</code> role facet sequence. */
    public static final String PATH_FACETS_ANEXOSMAT = "";
    /** <code>AnexosMat</code> role target class. */
    public static final String ROLE_TARGET_ANEXOSMAT = AnexoMatConstants.CLASS_NAME;
    /** Agents allowed to navigate through AnexosMat **/
    public static final String ANEXOSMAT_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (AnexosNeo)
    /** <code>AnexosNeo</code> role id. */
    public static final String ROLE_ID_ANEXOSNEO = "Agr_1432920391680657_Alias";
    /** <code>AnexosNeo</code> role name. */
    public static final String ROLE_NAME_ANEXOSNEO = "anexosNeo";
    /** <code>Periodicidad</code> role alias. */
    public static final String ROLE_ALIAS_ANEXOSNEO = "Anexos neonatales";


    /** <code>AnexosNeo</code> inverse role name. */
    public static final String ROLE_INVNAME_ANEXOSNEO = AnexoNeoConstants.ROLE_NAME_PERIODICIDAD;
    /** <code>AnexosNeo</code> role facet sequence. */
    public static final String PATH_FACETS_ANEXOSNEO = "";
    /** <code>AnexosNeo</code> role target class. */
    public static final String ROLE_TARGET_ANEXOSNEO = AnexoNeoConstants.CLASS_NAME;
    /** Agents allowed to navigate through AnexosNeo **/
    public static final String ANEXOSNEO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (ContratosC)
    /** <code>ContratosC</code> role id. */
    public static final String ROLE_ID_CONTRATOSC = "Agr_1473094352896369_Alias";
    /** <code>ContratosC</code> role name. */
    public static final String ROLE_NAME_CONTRATOSC = "contratosC";
    /** <code>PeriodicidadC</code> role alias. */
    public static final String ROLE_ALIAS_CONTRATOSC = "Contratos";


    /** <code>ContratosC</code> inverse role name. */
    public static final String ROLE_INVNAME_CONTRATOSC = ContratoCConstants.ROLE_NAME_PERIODICIDADC;
    /** <code>ContratosC</code> role facet sequence. */
    public static final String PATH_FACETS_CONTRATOSC = "";
    /** <code>ContratosC</code> role target class. */
    public static final String ROLE_TARGET_CONTRATOSC = ContratoCConstants.CLASS_NAME;
    /** Agents allowed to navigate through ContratosC **/
    public static final String CONTRATOSC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (AnexosC)
    /** <code>AnexosC</code> role id. */
    public static final String ROLE_ID_ANEXOSC = "Agr_1473094352896081_Alias";
    /** <code>AnexosC</code> role name. */
    public static final String ROLE_NAME_ANEXOSC = "anexosC";
    /** <code>PeriodicidadC</code> role alias. */
    public static final String ROLE_ALIAS_ANEXOSC = "Anexos";


    /** <code>AnexosC</code> inverse role name. */
    public static final String ROLE_INVNAME_ANEXOSC = AnexoCConstants.ROLE_NAME_PERIODICIDADC;
    /** <code>AnexosC</code> role facet sequence. */
    public static final String PATH_FACETS_ANEXOSC = "";
    /** <code>AnexosC</code> role target class. */
    public static final String ROLE_TARGET_ANEXOSC = AnexoCConstants.CLASS_NAME;
    /** Agents allowed to navigate through AnexosC **/
    public static final String ANEXOSC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (SolicitudesNovedad)
    /** <code>SolicitudesNovedad</code> role id. */
    public static final String ROLE_ID_SOLICITUDESNOVEDAD = "Agr_1581507280896906_Alias";
    /** <code>SolicitudesNovedad</code> role name. */
    public static final String ROLE_NAME_SOLICITUDESNOVEDAD = "solicitudesNovedad";
    /** <code>Periodicidad</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUDESNOVEDAD = "SolicitudesNovedad";


    /** <code>SolicitudesNovedad</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUDESNOVEDAD = SolicitudNovedadConstants.ROLE_NAME_PERIODICIDAD;
    /** <code>SolicitudesNovedad</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUDESNOVEDAD = "";
    /** <code>SolicitudesNovedad</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUDESNOVEDAD = SolicitudNovedadConstants.CLASS_NAME;
    /** Agents allowed to navigate through SolicitudesNovedad **/
    public static final String SOLICITUDESNOVEDAD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (SolicitudesNovedadNueva)
    /** <code>SolicitudesNovedadNueva</code> role id. */
    public static final String ROLE_ID_SOLICITUDESNOVEDADNUEVA = "Agr_1583317254144094_Alias";
    /** <code>SolicitudesNovedadNueva</code> role name. */
    public static final String ROLE_NAME_SOLICITUDESNOVEDADNUEVA = "solicitudesNovedadNueva";
    /** <code>PeriodicidadNueva</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUDESNOVEDADNUEVA = "SolicitudesNovedadNueva";


    /** <code>SolicitudesNovedadNueva</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUDESNOVEDADNUEVA = SolicitudNovedadConstants.ROLE_NAME_PERIODICIDADNUEVA;
    /** <code>SolicitudesNovedadNueva</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUDESNOVEDADNUEVA = "";
    /** <code>SolicitudesNovedadNueva</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUDESNOVEDADNUEVA = SolicitudNovedadConstants.CLASS_NAME;
    /** Agents allowed to navigate through SolicitudesNovedadNueva **/
    public static final String SOLICITUDESNOVEDADNUEVA_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431699849216490Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear periodicidad";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>periodicidadcrearpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERIODICIDADCREARPATRCODIGO = "p_atrCodigo";
    /** <code>periodicidadcrearpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERIODICIDADCREARPATRCODIGO = "Clas_1431699849216490Ser_1Arg_1_Alias";
    /** <code>periodicidadcrearpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERIODICIDADCREARPATRCODIGO = "Código";
    /** <code>periodicidadcrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERIODICIDADCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>periodicidadcrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERIODICIDADCREARPATRDESCRIPCION = "Clas_1431699849216490Ser_1Arg_2_Alias";
    /** <code>periodicidadcrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERIODICIDADCREARPATRDESCRIPCION = "Descripción";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431699849216490Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar periodicidad";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Preconditions
    /** <code>eliminar</code> precondition 0 id. */
    public static final String PRE_ID_ELIMINAR_0 = "Clas_1431699849216490Pre_1_MsgError";
    // Inbound arguments
    /** <code>periodicidadeliminarpthisPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_PERIODICIDADELIMINARPTHISPERIODICIDAD = "p_thisPeriodicidad";
    /** <code>periodicidadeliminarpthisPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_PERIODICIDADELIMINARPTHISPERIODICIDAD = "Clas_1431699849216490Ser_2Arg_1_Alias";
    /** <code>periodicidadeliminarpthisPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_PERIODICIDADELIMINARPTHISPERIODICIDAD = "Periodicidad";
    // Service (sincronizar)
    /** <code>sincronizar</code> service id. */
    public static final String SERV_ID_SINCRONIZAR = "Clas_1431699849216490Ser_3_Alias";
    /** <code>sincronizar</code> service name. */
    public static final String SERV_NAME_SINCRONIZAR = "sincronizar";
    /** <code>sincronizar</code> service alias. */
    public static final String SERV_ALIAS_SINCRONIZAR = "sincronizar";
    /** Agents allowed to execute the service sincronizar **/
    public static final String SINCRONIZAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>periodicidadsincronizarpthisPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_PERIODICIDADSINCRONIZARPTHISPERIODICIDAD = "p_thisPeriodicidad";
    /** <code>periodicidadsincronizarpthisPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_PERIODICIDADSINCRONIZARPTHISPERIODICIDAD = "Clas_1431699849216490Ser_3Arg_1_Alias";
    /** <code>periodicidadsincronizarpthisPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_PERIODICIDADSINCRONIZARPTHISPERIODICIDAD = "Periodicidad";
    /** <code>periodicidadsincronizarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_PERIODICIDADSINCRONIZARPDESCRIPCION = "p_Descripcion";
    /** <code>periodicidadsincronizarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_PERIODICIDADSINCRONIZARPDESCRIPCION = "Clas_1431699849216490Ser_3Arg_2_Alias";
    /** <code>periodicidadsincronizarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_PERIODICIDADSINCRONIZARPDESCRIPCION = "Descripción";
    // Service (InsPeriodicidadDominio)
    /** <code>InsPeriodicidadDominio</code> service id. */
    public static final String SERV_ID_INSPERIODICIDADDOMINIO = "Clas_1431699849216490Ser_4_Alias";
    /** <code>InsPeriodicidadDominio</code> service name. */
    public static final String SERV_NAME_INSPERIODICIDADDOMINIO = "InsPeriodicidadDominio";
    /** <code>InsPeriodicidadDominio</code> service alias. */
    public static final String SERV_ALIAS_INSPERIODICIDADDOMINIO = "InsPeriodicidadDominio";
    /** Agents allowed to execute the service InsPeriodicidadDominio **/
    public static final String INSPERIODICIDADDOMINIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>periodicidadInsPeriodicidadDominiopthisPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_INSPERIODICIDADDOMINIO_PERIODICIDADINSPERIODICIDADDOMINIOPTHISPERIODICIDAD = "p_thisPeriodicidad";
    /** <code>periodicidadInsPeriodicidadDominiopthisPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_INSPERIODICIDADDOMINIO_PERIODICIDADINSPERIODICIDADDOMINIOPTHISPERIODICIDAD = "Clas_1431699849216490Ser_4Arg_1_Alias";
    /** <code>periodicidadInsPeriodicidadDominiopthisPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPERIODICIDADDOMINIO_PERIODICIDADINSPERIODICIDADDOMINIOPTHISPERIODICIDAD = "Periodicidades";
    /** <code>periodicidadInsPeriodicidadDominiopevcDominio</code> inbound argument name. */
    public static final String ARG_NAME_INSPERIODICIDADDOMINIO_PERIODICIDADINSPERIODICIDADDOMINIOPEVCDOMINIO = "p_evcDominio";
    /** <code>periodicidadInsPeriodicidadDominiopevcDominio</code> inbound argument id. */
    public static final String ARG_ID_INSPERIODICIDADDOMINIO_PERIODICIDADINSPERIODICIDADDOMINIOPEVCDOMINIO = "Clas_1431699849216490Ser_4Arg_2_Alias";
    /** <code>periodicidadInsPeriodicidadDominiopevcDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPERIODICIDADDOMINIO_PERIODICIDADINSPERIODICIDADDOMINIOPEVCDOMINIO = "Dominios";
    // Service (DelPeriodicidadDominio)
    /** <code>DelPeriodicidadDominio</code> service id. */
    public static final String SERV_ID_DELPERIODICIDADDOMINIO = "Clas_1431699849216490Ser_5_Alias";
    /** <code>DelPeriodicidadDominio</code> service name. */
    public static final String SERV_NAME_DELPERIODICIDADDOMINIO = "DelPeriodicidadDominio";
    /** <code>DelPeriodicidadDominio</code> service alias. */
    public static final String SERV_ALIAS_DELPERIODICIDADDOMINIO = "DelPeriodicidadDominio";
    /** Agents allowed to execute the service DelPeriodicidadDominio **/
    public static final String DELPERIODICIDADDOMINIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>periodicidadDelPeriodicidadDominiopthisPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_DELPERIODICIDADDOMINIO_PERIODICIDADDELPERIODICIDADDOMINIOPTHISPERIODICIDAD = "p_thisPeriodicidad";
    /** <code>periodicidadDelPeriodicidadDominiopthisPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_DELPERIODICIDADDOMINIO_PERIODICIDADDELPERIODICIDADDOMINIOPTHISPERIODICIDAD = "Clas_1431699849216490Ser_5Arg_1_Alias";
    /** <code>periodicidadDelPeriodicidadDominiopthisPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPERIODICIDADDOMINIO_PERIODICIDADDELPERIODICIDADDOMINIOPTHISPERIODICIDAD = "Periodicidades";
    /** <code>periodicidadDelPeriodicidadDominiopevcDominio</code> inbound argument name. */
    public static final String ARG_NAME_DELPERIODICIDADDOMINIO_PERIODICIDADDELPERIODICIDADDOMINIOPEVCDOMINIO = "p_evcDominio";
    /** <code>periodicidadDelPeriodicidadDominiopevcDominio</code> inbound argument id. */
    public static final String ARG_ID_DELPERIODICIDADDOMINIO_PERIODICIDADDELPERIODICIDADDOMINIOPEVCDOMINIO = "Clas_1431699849216490Ser_5Arg_2_Alias";
    /** <code>periodicidadDelPeriodicidadDominiopevcDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPERIODICIDADDOMINIO_PERIODICIDADDELPERIODICIDADDOMINIOPEVCDOMINIO = "Dominios";
    // Service (InsPeriodicidadSolicitud)
    /** <code>InsPeriodicidadSolicitud</code> service id. */
    public static final String SERV_ID_INSPERIODICIDADSOLICITUD = "Clas_1431699849216490Ser_6_Alias";
    /** <code>InsPeriodicidadSolicitud</code> service name. */
    public static final String SERV_NAME_INSPERIODICIDADSOLICITUD = "InsPeriodicidadSolicitud";
    /** <code>InsPeriodicidadSolicitud</code> service alias. */
    public static final String SERV_ALIAS_INSPERIODICIDADSOLICITUD = "InsPeriodicidadSolicitud";
    /** Agents allowed to execute the service InsPeriodicidadSolicitud **/
    public static final String INSPERIODICIDADSOLICITUD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>periodicidadInsPeriodicidadSolicitudpthisPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_INSPERIODICIDADSOLICITUD_PERIODICIDADINSPERIODICIDADSOLICITUDPTHISPERIODICIDAD = "p_thisPeriodicidad";
    /** <code>periodicidadInsPeriodicidadSolicitudpthisPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_INSPERIODICIDADSOLICITUD_PERIODICIDADINSPERIODICIDADSOLICITUDPTHISPERIODICIDAD = "Clas_1431699849216490Ser_6Arg_1_Alias";
    /** <code>periodicidadInsPeriodicidadSolicitudpthisPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPERIODICIDADSOLICITUD_PERIODICIDADINSPERIODICIDADSOLICITUDPTHISPERIODICIDAD = "Periodicidad pago";
    /** <code>periodicidadInsPeriodicidadSolicitudpevcSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_INSPERIODICIDADSOLICITUD_PERIODICIDADINSPERIODICIDADSOLICITUDPEVCSOLICITUD = "p_evcSolicitud";
    /** <code>periodicidadInsPeriodicidadSolicitudpevcSolicitud</code> inbound argument id. */
    public static final String ARG_ID_INSPERIODICIDADSOLICITUD_PERIODICIDADINSPERIODICIDADSOLICITUDPEVCSOLICITUD = "Clas_1431699849216490Ser_6Arg_2_Alias";
    /** <code>periodicidadInsPeriodicidadSolicitudpevcSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPERIODICIDADSOLICITUD_PERIODICIDADINSPERIODICIDADSOLICITUDPEVCSOLICITUD = "Solicitudes";
    // Service (DelPeriodicidadSolicitud)
    /** <code>DelPeriodicidadSolicitud</code> service id. */
    public static final String SERV_ID_DELPERIODICIDADSOLICITUD = "Clas_1431699849216490Ser_7_Alias";
    /** <code>DelPeriodicidadSolicitud</code> service name. */
    public static final String SERV_NAME_DELPERIODICIDADSOLICITUD = "DelPeriodicidadSolicitud";
    /** <code>DelPeriodicidadSolicitud</code> service alias. */
    public static final String SERV_ALIAS_DELPERIODICIDADSOLICITUD = "DelPeriodicidadSolicitud";
    /** Agents allowed to execute the service DelPeriodicidadSolicitud **/
    public static final String DELPERIODICIDADSOLICITUD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>periodicidadDelPeriodicidadSolicitudpthisPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_DELPERIODICIDADSOLICITUD_PERIODICIDADDELPERIODICIDADSOLICITUDPTHISPERIODICIDAD = "p_thisPeriodicidad";
    /** <code>periodicidadDelPeriodicidadSolicitudpthisPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_DELPERIODICIDADSOLICITUD_PERIODICIDADDELPERIODICIDADSOLICITUDPTHISPERIODICIDAD = "Clas_1431699849216490Ser_7Arg_1_Alias";
    /** <code>periodicidadDelPeriodicidadSolicitudpthisPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPERIODICIDADSOLICITUD_PERIODICIDADDELPERIODICIDADSOLICITUDPTHISPERIODICIDAD = "Periodicidad pago";
    /** <code>periodicidadDelPeriodicidadSolicitudpevcSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_DELPERIODICIDADSOLICITUD_PERIODICIDADDELPERIODICIDADSOLICITUDPEVCSOLICITUD = "p_evcSolicitud";
    /** <code>periodicidadDelPeriodicidadSolicitudpevcSolicitud</code> inbound argument id. */
    public static final String ARG_ID_DELPERIODICIDADSOLICITUD_PERIODICIDADDELPERIODICIDADSOLICITUDPEVCSOLICITUD = "Clas_1431699849216490Ser_7Arg_2_Alias";
    /** <code>periodicidadDelPeriodicidadSolicitudpevcSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPERIODICIDADSOLICITUD_PERIODICIDADDELPERIODICIDADSOLICITUDPEVCSOLICITUD = "Solicitudes";
    // Service (CambPeriodicidadAnexoMat)
    /** <code>CambPeriodicidadAnexoMat</code> service id. */
    public static final String SERV_ID_CAMBPERIODICIDADANEXOMAT = "Clas_1431699849216490Ser_8_Alias";
    /** <code>CambPeriodicidadAnexoMat</code> service name. */
    public static final String SERV_NAME_CAMBPERIODICIDADANEXOMAT = "CambPeriodicidadAnexoMat";
    /** <code>CambPeriodicidadAnexoMat</code> service alias. */
    public static final String SERV_ALIAS_CAMBPERIODICIDADANEXOMAT = "CambPeriodicidadAnexoMat";
    /** Agents allowed to execute the service CambPeriodicidadAnexoMat **/
    public static final String CAMBPERIODICIDADANEXOMAT_SRVAGENTS = "";
    // Inbound arguments
    /** <code>periodicidadCambPeriodicidadAnexoMatpthisPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPERIODICIDADANEXOMAT_PERIODICIDADCAMBPERIODICIDADANEXOMATPTHISPERIODICIDAD = "p_thisPeriodicidad";
    /** <code>periodicidadCambPeriodicidadAnexoMatpthisPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_CAMBPERIODICIDADANEXOMAT_PERIODICIDADCAMBPERIODICIDADANEXOMATPTHISPERIODICIDAD = "Clas_1431699849216490Ser_8Arg_1_Alias";
    /** <code>periodicidadCambPeriodicidadAnexoMatpthisPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPERIODICIDADANEXOMAT_PERIODICIDADCAMBPERIODICIDADANEXOMATPTHISPERIODICIDAD = "Periodicidad";
    /** <code>periodicidadCambPeriodicidadAnexoMatpevcAnexoMat</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPERIODICIDADANEXOMAT_PERIODICIDADCAMBPERIODICIDADANEXOMATPEVCANEXOMAT = "p_evcAnexoMat";
    /** <code>periodicidadCambPeriodicidadAnexoMatpevcAnexoMat</code> inbound argument id. */
    public static final String ARG_ID_CAMBPERIODICIDADANEXOMAT_PERIODICIDADCAMBPERIODICIDADANEXOMATPEVCANEXOMAT = "Clas_1431699849216490Ser_8Arg_2_Alias";
    /** <code>periodicidadCambPeriodicidadAnexoMatpevcAnexoMat</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPERIODICIDADANEXOMAT_PERIODICIDADCAMBPERIODICIDADANEXOMATPEVCANEXOMAT = "Anexos maternidad";
    // Service (CambPeriodicidadAnexoNeo)
    /** <code>CambPeriodicidadAnexoNeo</code> service id. */
    public static final String SERV_ID_CAMBPERIODICIDADANEXONEO = "Clas_1431699849216490Ser_9_Alias";
    /** <code>CambPeriodicidadAnexoNeo</code> service name. */
    public static final String SERV_NAME_CAMBPERIODICIDADANEXONEO = "CambPeriodicidadAnexoNeo";
    /** <code>CambPeriodicidadAnexoNeo</code> service alias. */
    public static final String SERV_ALIAS_CAMBPERIODICIDADANEXONEO = "CambPeriodicidadAnexoNeo";
    /** Agents allowed to execute the service CambPeriodicidadAnexoNeo **/
    public static final String CAMBPERIODICIDADANEXONEO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>periodicidadCambPeriodicidadAnexoNeopthisPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPERIODICIDADANEXONEO_PERIODICIDADCAMBPERIODICIDADANEXONEOPTHISPERIODICIDAD = "p_thisPeriodicidad";
    /** <code>periodicidadCambPeriodicidadAnexoNeopthisPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_CAMBPERIODICIDADANEXONEO_PERIODICIDADCAMBPERIODICIDADANEXONEOPTHISPERIODICIDAD = "Clas_1431699849216490Ser_9Arg_1_Alias";
    /** <code>periodicidadCambPeriodicidadAnexoNeopthisPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPERIODICIDADANEXONEO_PERIODICIDADCAMBPERIODICIDADANEXONEOPTHISPERIODICIDAD = "Periodicidad";
    /** <code>periodicidadCambPeriodicidadAnexoNeopevcAnexoNeo</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPERIODICIDADANEXONEO_PERIODICIDADCAMBPERIODICIDADANEXONEOPEVCANEXONEO = "p_evcAnexoNeo";
    /** <code>periodicidadCambPeriodicidadAnexoNeopevcAnexoNeo</code> inbound argument id. */
    public static final String ARG_ID_CAMBPERIODICIDADANEXONEO_PERIODICIDADCAMBPERIODICIDADANEXONEOPEVCANEXONEO = "Clas_1431699849216490Ser_9Arg_2_Alias";
    /** <code>periodicidadCambPeriodicidadAnexoNeopevcAnexoNeo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPERIODICIDADANEXONEO_PERIODICIDADCAMBPERIODICIDADANEXONEOPEVCANEXONEO = "Anexos neonatales";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1431699849216490Ser_10_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar periodicidad";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>periodicidadmodificarpthisPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PERIODICIDADMODIFICARPTHISPERIODICIDAD = "p_thisPeriodicidad";
    /** <code>periodicidadmodificarpthisPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PERIODICIDADMODIFICARPTHISPERIODICIDAD = "Clas_1431699849216490Ser_10Arg_1_Alias";
    /** <code>periodicidadmodificarpthisPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PERIODICIDADMODIFICARPTHISPERIODICIDAD = "Periodicidad";
    /** <code>periodicidadmodificarpEsMensual</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PERIODICIDADMODIFICARPESMENSUAL = "p_EsMensual";
    /** <code>periodicidadmodificarpEsMensual</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PERIODICIDADMODIFICARPESMENSUAL = "Clas_1431699849216490Ser_10Arg_2_Alias";
    /** <code>periodicidadmodificarpEsMensual</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PERIODICIDADMODIFICARPESMENSUAL = "Es mensual";
    // Service (InsPeriodicidad)
    /** <code>InsPeriodicidad</code> service id. */
    public static final String SERV_ID_INSPERIODICIDAD = "Clas_1431699849216490Ser_11_Alias";
    /** <code>InsPeriodicidad</code> service name. */
    public static final String SERV_NAME_INSPERIODICIDAD = "InsPeriodicidad";
    /** <code>InsPeriodicidad</code> service alias. */
    public static final String SERV_ALIAS_INSPERIODICIDAD = "InsPeriodicidad";
    /** Agents allowed to execute the service InsPeriodicidad **/
    public static final String INSPERIODICIDAD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>periodicidadInsPeriodicidadpthisPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_INSPERIODICIDAD_PERIODICIDADINSPERIODICIDADPTHISPERIODICIDAD = "p_thisPeriodicidad";
    /** <code>periodicidadInsPeriodicidadpthisPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_INSPERIODICIDAD_PERIODICIDADINSPERIODICIDADPTHISPERIODICIDAD = "Clas_1431699849216490Ser_11Arg_1_Alias";
    /** <code>periodicidadInsPeriodicidadpthisPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPERIODICIDAD_PERIODICIDADINSPERIODICIDADPTHISPERIODICIDAD = "Periodicidad";
    /** <code>periodicidadInsPeriodicidadpevcContratoC</code> inbound argument name. */
    public static final String ARG_NAME_INSPERIODICIDAD_PERIODICIDADINSPERIODICIDADPEVCCONTRATOC = "p_evcContratoC";
    /** <code>periodicidadInsPeriodicidadpevcContratoC</code> inbound argument id. */
    public static final String ARG_ID_INSPERIODICIDAD_PERIODICIDADINSPERIODICIDADPEVCCONTRATOC = "Clas_1431699849216490Ser_11Arg_2_Alias";
    /** <code>periodicidadInsPeriodicidadpevcContratoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPERIODICIDAD_PERIODICIDADINSPERIODICIDADPEVCCONTRATOC = "Contratos";
    // Service (DelPeriodicidad)
    /** <code>DelPeriodicidad</code> service id. */
    public static final String SERV_ID_DELPERIODICIDAD = "Clas_1431699849216490Ser_12_Alias";
    /** <code>DelPeriodicidad</code> service name. */
    public static final String SERV_NAME_DELPERIODICIDAD = "DelPeriodicidad";
    /** <code>DelPeriodicidad</code> service alias. */
    public static final String SERV_ALIAS_DELPERIODICIDAD = "DelPeriodicidad";
    /** Agents allowed to execute the service DelPeriodicidad **/
    public static final String DELPERIODICIDAD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>periodicidadDelPeriodicidadpthisPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_DELPERIODICIDAD_PERIODICIDADDELPERIODICIDADPTHISPERIODICIDAD = "p_thisPeriodicidad";
    /** <code>periodicidadDelPeriodicidadpthisPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_DELPERIODICIDAD_PERIODICIDADDELPERIODICIDADPTHISPERIODICIDAD = "Clas_1431699849216490Ser_12Arg_1_Alias";
    /** <code>periodicidadDelPeriodicidadpthisPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPERIODICIDAD_PERIODICIDADDELPERIODICIDADPTHISPERIODICIDAD = "Periodicidad";
    /** <code>periodicidadDelPeriodicidadpevcContratoC</code> inbound argument name. */
    public static final String ARG_NAME_DELPERIODICIDAD_PERIODICIDADDELPERIODICIDADPEVCCONTRATOC = "p_evcContratoC";
    /** <code>periodicidadDelPeriodicidadpevcContratoC</code> inbound argument id. */
    public static final String ARG_ID_DELPERIODICIDAD_PERIODICIDADDELPERIODICIDADPEVCCONTRATOC = "Clas_1431699849216490Ser_12Arg_2_Alias";
    /** <code>periodicidadDelPeriodicidadpevcContratoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPERIODICIDAD_PERIODICIDADDELPERIODICIDADPEVCCONTRATOC = "Contratos";
    // Service (InsPeriodicidadNueva)
    /** <code>InsPeriodicidadNueva</code> service id. */
    public static final String SERV_ID_INSPERIODICIDADNUEVA = "Clas_1431699849216490Ser_15_Alias";
    /** <code>InsPeriodicidadNueva</code> service name. */
    public static final String SERV_NAME_INSPERIODICIDADNUEVA = "InsPeriodicidadNueva";
    /** <code>InsPeriodicidadNueva</code> service alias. */
    public static final String SERV_ALIAS_INSPERIODICIDADNUEVA = "InsPeriodicidadNueva";
    /** Agents allowed to execute the service InsPeriodicidadNueva **/
    public static final String INSPERIODICIDADNUEVA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>periodicidadInsPeriodicidadNuevapthisPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_INSPERIODICIDADNUEVA_PERIODICIDADINSPERIODICIDADNUEVAPTHISPERIODICIDAD = "p_thisPeriodicidad";
    /** <code>periodicidadInsPeriodicidadNuevapthisPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_INSPERIODICIDADNUEVA_PERIODICIDADINSPERIODICIDADNUEVAPTHISPERIODICIDAD = "Clas_1431699849216490Ser_15Arg_1_Alias";
    /** <code>periodicidadInsPeriodicidadNuevapthisPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPERIODICIDADNUEVA_PERIODICIDADINSPERIODICIDADNUEVAPTHISPERIODICIDAD = "Nueva Periodicidad";
    /** <code>periodicidadInsPeriodicidadNuevapevcSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_INSPERIODICIDADNUEVA_PERIODICIDADINSPERIODICIDADNUEVAPEVCSOLICITUDNOVEDAD = "p_evcSolicitudNovedad";
    /** <code>periodicidadInsPeriodicidadNuevapevcSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_INSPERIODICIDADNUEVA_PERIODICIDADINSPERIODICIDADNUEVAPEVCSOLICITUDNOVEDAD = "Clas_1431699849216490Ser_15Arg_2_Alias";
    /** <code>periodicidadInsPeriodicidadNuevapevcSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPERIODICIDADNUEVA_PERIODICIDADINSPERIODICIDADNUEVAPEVCSOLICITUDNOVEDAD = "SolicitudesNovedadNueva";
    // Service (DelPeriodicidadNueva)
    /** <code>DelPeriodicidadNueva</code> service id. */
    public static final String SERV_ID_DELPERIODICIDADNUEVA = "Clas_1431699849216490Ser_16_Alias";
    /** <code>DelPeriodicidadNueva</code> service name. */
    public static final String SERV_NAME_DELPERIODICIDADNUEVA = "DelPeriodicidadNueva";
    /** <code>DelPeriodicidadNueva</code> service alias. */
    public static final String SERV_ALIAS_DELPERIODICIDADNUEVA = "DelPeriodicidadNueva";
    /** Agents allowed to execute the service DelPeriodicidadNueva **/
    public static final String DELPERIODICIDADNUEVA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>periodicidadDelPeriodicidadNuevapthisPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_DELPERIODICIDADNUEVA_PERIODICIDADDELPERIODICIDADNUEVAPTHISPERIODICIDAD = "p_thisPeriodicidad";
    /** <code>periodicidadDelPeriodicidadNuevapthisPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_DELPERIODICIDADNUEVA_PERIODICIDADDELPERIODICIDADNUEVAPTHISPERIODICIDAD = "Clas_1431699849216490Ser_16Arg_1_Alias";
    /** <code>periodicidadDelPeriodicidadNuevapthisPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPERIODICIDADNUEVA_PERIODICIDADDELPERIODICIDADNUEVAPTHISPERIODICIDAD = "Nueva Periodicidad";
    /** <code>periodicidadDelPeriodicidadNuevapevcSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DELPERIODICIDADNUEVA_PERIODICIDADDELPERIODICIDADNUEVAPEVCSOLICITUDNOVEDAD = "p_evcSolicitudNovedad";
    /** <code>periodicidadDelPeriodicidadNuevapevcSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_DELPERIODICIDADNUEVA_PERIODICIDADDELPERIODICIDADNUEVAPEVCSOLICITUDNOVEDAD = "Clas_1431699849216490Ser_16Arg_2_Alias";
    /** <code>periodicidadDelPeriodicidadNuevapevcSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPERIODICIDADNUEVA_PERIODICIDADDELPERIODICIDADNUEVAPEVCSOLICITUDNOVEDAD = "SolicitudesNovedadNueva";
    // Service (InsPeriodicidadSolNov)
    /** <code>InsPeriodicidadSolNov</code> service id. */
    public static final String SERV_ID_INSPERIODICIDADSOLNOV = "Clas_1431699849216490Ser_17_Alias";
    /** <code>InsPeriodicidadSolNov</code> service name. */
    public static final String SERV_NAME_INSPERIODICIDADSOLNOV = "InsPeriodicidadSolNov";
    /** <code>InsPeriodicidadSolNov</code> service alias. */
    public static final String SERV_ALIAS_INSPERIODICIDADSOLNOV = "InsPeriodicidadSolNov";
    /** Agents allowed to execute the service InsPeriodicidadSolNov **/
    public static final String INSPERIODICIDADSOLNOV_SRVAGENTS = "";
    // Inbound arguments
    /** <code>periodicidadInsPeriodicidadSolNovpthisPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_INSPERIODICIDADSOLNOV_PERIODICIDADINSPERIODICIDADSOLNOVPTHISPERIODICIDAD = "p_thisPeriodicidad";
    /** <code>periodicidadInsPeriodicidadSolNovpthisPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_INSPERIODICIDADSOLNOV_PERIODICIDADINSPERIODICIDADSOLNOVPTHISPERIODICIDAD = "Clas_1431699849216490Ser_17Arg_1_Alias";
    /** <code>periodicidadInsPeriodicidadSolNovpthisPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPERIODICIDADSOLNOV_PERIODICIDADINSPERIODICIDADSOLNOVPTHISPERIODICIDAD = "Periodicidad";
    /** <code>periodicidadInsPeriodicidadSolNovpevcSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_INSPERIODICIDADSOLNOV_PERIODICIDADINSPERIODICIDADSOLNOVPEVCSOLICITUDNOVEDAD = "p_evcSolicitudNovedad";
    /** <code>periodicidadInsPeriodicidadSolNovpevcSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_INSPERIODICIDADSOLNOV_PERIODICIDADINSPERIODICIDADSOLNOVPEVCSOLICITUDNOVEDAD = "Clas_1431699849216490Ser_17Arg_2_Alias";
    /** <code>periodicidadInsPeriodicidadSolNovpevcSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPERIODICIDADSOLNOV_PERIODICIDADINSPERIODICIDADSOLNOVPEVCSOLICITUDNOVEDAD = "SolicitudesNovedad";
    // Service (DelPeriodicidadSolNov)
    /** <code>DelPeriodicidadSolNov</code> service id. */
    public static final String SERV_ID_DELPERIODICIDADSOLNOV = "Clas_1431699849216490Ser_18_Alias";
    /** <code>DelPeriodicidadSolNov</code> service name. */
    public static final String SERV_NAME_DELPERIODICIDADSOLNOV = "DelPeriodicidadSolNov";
    /** <code>DelPeriodicidadSolNov</code> service alias. */
    public static final String SERV_ALIAS_DELPERIODICIDADSOLNOV = "DelPeriodicidadSolNov";
    /** Agents allowed to execute the service DelPeriodicidadSolNov **/
    public static final String DELPERIODICIDADSOLNOV_SRVAGENTS = "";
    // Inbound arguments
    /** <code>periodicidadDelPeriodicidadSolNovpthisPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_DELPERIODICIDADSOLNOV_PERIODICIDADDELPERIODICIDADSOLNOVPTHISPERIODICIDAD = "p_thisPeriodicidad";
    /** <code>periodicidadDelPeriodicidadSolNovpthisPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_DELPERIODICIDADSOLNOV_PERIODICIDADDELPERIODICIDADSOLNOVPTHISPERIODICIDAD = "Clas_1431699849216490Ser_18Arg_1_Alias";
    /** <code>periodicidadDelPeriodicidadSolNovpthisPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPERIODICIDADSOLNOV_PERIODICIDADDELPERIODICIDADSOLNOVPTHISPERIODICIDAD = "Periodicidad";
    /** <code>periodicidadDelPeriodicidadSolNovpevcSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DELPERIODICIDADSOLNOV_PERIODICIDADDELPERIODICIDADSOLNOVPEVCSOLICITUDNOVEDAD = "p_evcSolicitudNovedad";
    /** <code>periodicidadDelPeriodicidadSolNovpevcSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_DELPERIODICIDADSOLNOV_PERIODICIDADDELPERIODICIDADSOLNOVPEVCSOLICITUDNOVEDAD = "Clas_1431699849216490Ser_18Arg_2_Alias";
    /** <code>periodicidadDelPeriodicidadSolNovpevcSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPERIODICIDADSOLNOV_PERIODICIDADDELPERIODICIDADSOLNOVPEVCSOLICITUDNOVEDAD = "SolicitudesNovedad";

    public static final String FILTER_NAME_IFPERIODICIDADMENSUAL = "iF_PeriodicidadMensual";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_PERIODICIDADDESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERIODICIDADESMENSUAL.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PERIODICIDADDRVNUMPAGOS.toUpperCase(), Constants.Type.NAT.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_PERIODICIDADCODIGO.toUpperCase(), PERIODICIDADCODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERIODICIDADDESCRIPCION.toUpperCase(), PERIODICIDADDESCRIPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERIODICIDADESMENSUAL.toUpperCase(), PERIODICIDADESMENSUAL_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERIODICIDADDRVNUMPAGOS.toUpperCase(), PERIODICIDADDRVNUMPAGOS_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'Periodicidad', it returns the identification keys
     * - If className is a facet of the inheritance net of 'Periodicidad', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_PERIODICIDADCODIGO);
        }
        // Facet 'Periodicidad' (This facet)
        if (PeriodicidadConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_PERIODICIDADCODIGO);
        }
        return returnList;
    }
}
