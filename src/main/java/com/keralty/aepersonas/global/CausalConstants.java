package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>Causal</code> model class.
 */
public final class CausalConstants {

    private CausalConstants() {

    }

    // Class
    /** <code>Causal</code> class id. */
    public static final String CLASS_ID = "Clas_1581414219776993_Alias";
    /** <code>Causal</code> class name. */
    public static final String CLASS_NAME = "Causal";
    /** <code>Causal</code> class alias. */
    public static final String CLASS_ALIAS = "Causal";
    /** <code>Causal</code> class table name. */
    public static final String TBL_NAME = "Causal";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "causalidCausal,novedadidNovedad,causalAliasCausal,causalNombre,causalDescripcion,causalCodigoLegal,causalReqDocPersona,causalReqDocSolicitud";

    public static final String DSDSCAUSAL = "DS_Causal";
    public static final String DSICCAUSAL = "IC_Causal";
    public static final String DSDSCAUSALNULL = "DS_Causal_Null";
    

    // Attribute (causalidCausal)
    /** <code>causalidCausal</code> attribute id. */
    public static final String ATTR_ID_CAUSALIDCAUSAL = "Clas_1581414219776993Atr_1_Alias";
    /** <code>causalidCausal</code> attribute name. */
    public static final String ATTR_NAME_CAUSALIDCAUSAL = "causalidCausal";
    /** <code>causalidCausal</code> attribute alias. */
    public static final String ATTR_ALIAS_CAUSALIDCAUSAL = "Id.";

    /** <code>causalidCausal</code> attribute facet sequence. */
    public static final String PATH_FACETS_CAUSALIDCAUSAL = "";
    /** Agents allowed to view the attribute causalidCausal **/
    public static final String CAUSALIDCAUSAL_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (causalAliasCausal)
    /** <code>causalAliasCausal</code> attribute id. */
    public static final String ATTR_ID_CAUSALALIASCAUSAL = "Clas_1581414219776993Atr_2_Alias";
    /** <code>causalAliasCausal</code> attribute name. */
    public static final String ATTR_NAME_CAUSALALIASCAUSAL = "causalAliasCausal";
    /** <code>causalAliasCausal</code> attribute alias. */
    public static final String ATTR_ALIAS_CAUSALALIASCAUSAL = "Alias";

    /** <code>causalAliasCausal</code> attribute facet sequence. */
    public static final String PATH_FACETS_CAUSALALIASCAUSAL = "";
    /** Agents allowed to view the attribute causalAliasCausal **/
    public static final String CAUSALALIASCAUSAL_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (causalNombre)
    /** <code>causalNombre</code> attribute id. */
    public static final String ATTR_ID_CAUSALNOMBRE = "Clas_1581414219776993Atr_3_Alias";
    /** <code>causalNombre</code> attribute name. */
    public static final String ATTR_NAME_CAUSALNOMBRE = "causalNombre";
    /** <code>causalNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_CAUSALNOMBRE = "Nombre";

    /** <code>causalNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_CAUSALNOMBRE = "";
    /** Agents allowed to view the attribute causalNombre **/
    public static final String CAUSALNOMBRE_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (causalDescripcion)
    /** <code>causalDescripcion</code> attribute id. */
    public static final String ATTR_ID_CAUSALDESCRIPCION = "Clas_1581414219776993Atr_4_Alias";
    /** <code>causalDescripcion</code> attribute name. */
    public static final String ATTR_NAME_CAUSALDESCRIPCION = "causalDescripcion";
    /** <code>causalDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_CAUSALDESCRIPCION = "Descripción";

    /** <code>causalDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_CAUSALDESCRIPCION = "";
    /** Agents allowed to view the attribute causalDescripcion **/
    public static final String CAUSALDESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (causalCodigoLegal)
    /** <code>causalCodigoLegal</code> attribute id. */
    public static final String ATTR_ID_CAUSALCODIGOLEGAL = "Clas_1581414219776993Atr_5_Alias";
    /** <code>causalCodigoLegal</code> attribute name. */
    public static final String ATTR_NAME_CAUSALCODIGOLEGAL = "causalCodigoLegal";
    /** <code>causalCodigoLegal</code> attribute alias. */
    public static final String ATTR_ALIAS_CAUSALCODIGOLEGAL = "Código Legal";

    /** <code>causalCodigoLegal</code> attribute facet sequence. */
    public static final String PATH_FACETS_CAUSALCODIGOLEGAL = "";
    /** Agents allowed to view the attribute causalCodigoLegal **/
    public static final String CAUSALCODIGOLEGAL_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (causalReqDocPersona)
    /** <code>causalReqDocPersona</code> attribute id. */
    public static final String ATTR_ID_CAUSALREQDOCPERSONA = "Clas_1581414219776993Atr_6_Alias";
    /** <code>causalReqDocPersona</code> attribute name. */
    public static final String ATTR_NAME_CAUSALREQDOCPERSONA = "causalReqDocPersona";
    /** <code>causalReqDocPersona</code> attribute alias. */
    public static final String ATTR_ALIAS_CAUSALREQDOCPERSONA = "Requiere doc. persona";

    /** <code>causalReqDocPersona</code> attribute facet sequence. */
    public static final String PATH_FACETS_CAUSALREQDOCPERSONA = "";
    /** Agents allowed to view the attribute causalReqDocPersona **/
    public static final String CAUSALREQDOCPERSONA_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (causalReqDocSolicitud)
    /** <code>causalReqDocSolicitud</code> attribute id. */
    public static final String ATTR_ID_CAUSALREQDOCSOLICITUD = "Clas_1581414219776993Atr_7_Alias";
    /** <code>causalReqDocSolicitud</code> attribute name. */
    public static final String ATTR_NAME_CAUSALREQDOCSOLICITUD = "causalReqDocSolicitud";
    /** <code>causalReqDocSolicitud</code> attribute alias. */
    public static final String ATTR_ALIAS_CAUSALREQDOCSOLICITUD = "Requiere doc. solicitud";

    /** <code>causalReqDocSolicitud</code> attribute facet sequence. */
    public static final String PATH_FACETS_CAUSALREQDOCSOLICITUD = "";
    /** Agents allowed to view the attribute causalReqDocSolicitud **/
    public static final String CAUSALREQDOCSOLICITUD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (causalDrvTextoMostrar)
    /** <code>causalDrvTextoMostrar</code> attribute id. */
    public static final String ATTR_ID_CAUSALDRVTEXTOMOSTRAR = "Clas_1581414219776993Atr_8_Alias";
    /** <code>causalDrvTextoMostrar</code> attribute name. */
    public static final String ATTR_NAME_CAUSALDRVTEXTOMOSTRAR = "causalDrvTextoMostrar";
    /** <code>causalDrvTextoMostrar</code> attribute alias. */
    public static final String ATTR_ALIAS_CAUSALDRVTEXTOMOSTRAR = "Descripción";

    /** <code>causalDrvTextoMostrar</code> attribute facet sequence. */
    public static final String PATH_FACETS_CAUSALDRVTEXTOMOSTRAR = "";
    /** Agents allowed to view the attribute causalDrvTextoMostrar **/
    public static final String CAUSALDRVTEXTOMOSTRAR_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (id_Causal)
    /** <code>id_Causal</code> field name. */
    public static final String FLD_CAUSALIDCAUSAL = "id_Causal";    
    /** <code>causalidCausal</code> attribute field name. */
    public static final String ATTR_FIELD_CAUSALIDCAUSAL = "causalidCausal";
    // Field (id_Novedad)
    /** <code>id_Novedad</code> field name. */
    public static final String FLD_NOVEDADIDNOVEDAD = "id_Novedad";    
    /** <code>Novedad.novedadidNovedad</code> attribute field name. */
    public static final String ATTR_FIELD_NOVEDAD_NOVEDADIDNOVEDAD = "novedadidNovedad";
    // Field (AliasCausal)
    /** <code>AliasCausal</code> field name. */
    public static final String FLD_CAUSALALIASCAUSAL = "AliasCausal";    
    /** <code>AliasCausal</code> field length. */
    public static final int FLD_CAUSALALIASCAUSALLENGTH = 50;
    /** <code>causalAliasCausal</code> attribute field name. */
    public static final String ATTR_FIELD_CAUSALALIASCAUSAL = "causalAliasCausal";
    // Field (Nombre)
    /** <code>Nombre</code> field name. */
    public static final String FLD_CAUSALNOMBRE = "Nombre";    
    /** <code>Nombre</code> field length. */
    public static final int FLD_CAUSALNOMBRELENGTH = 50;
    /** <code>causalNombre</code> attribute field name. */
    public static final String ATTR_FIELD_CAUSALNOMBRE = "causalNombre";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_CAUSALDESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_CAUSALDESCRIPCIONLENGTH = 200;
    /** <code>causalDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_CAUSALDESCRIPCION = "causalDescripcion";
    // Field (CodigoLegal)
    /** <code>CodigoLegal</code> field name. */
    public static final String FLD_CAUSALCODIGOLEGAL = "CodigoLegal";    
    /** <code>CodigoLegal</code> field length. */
    public static final int FLD_CAUSALCODIGOLEGALLENGTH = 5;
    /** <code>causalCodigoLegal</code> attribute field name. */
    public static final String ATTR_FIELD_CAUSALCODIGOLEGAL = "causalCodigoLegal";
    // Field (ReqDocPersona)
    /** <code>ReqDocPersona</code> field name. */
    public static final String FLD_CAUSALREQDOCPERSONA = "ReqDocPersona";    
    /** <code>causalReqDocPersona</code> attribute field name. */
    public static final String ATTR_FIELD_CAUSALREQDOCPERSONA = "causalReqDocPersona";
    // Field (ReqDocSolicitud)
    /** <code>ReqDocSolicitud</code> field name. */
    public static final String FLD_CAUSALREQDOCSOLICITUD = "ReqDocSolicitud";    
    /** <code>causalReqDocSolicitud</code> attribute field name. */
    public static final String ATTR_FIELD_CAUSALREQDOCSOLICITUD = "causalReqDocSolicitud";

    // Component role (Novedad)
    /** <code>Novedad</code> role id. */
    public static final String ROLE_ID_NOVEDAD = "Agr_1581414219776461_Alias";
    /** <code>Novedad</code> role name. */
    public static final String ROLE_NAME_NOVEDAD = "novedad";
    /** <code>Novedad</code> role alias. */
    public static final String ROLE_ALIAS_NOVEDAD = "Novedad";

    /** <code>Novedad</code> inverse role name. */
    public static final String ROLE_INVNAME_NOVEDAD = NovedadConstants.ROLE_NAME_CAUSALES;
    /** <code>Novedad</code> role facet sequence. */
    public static final String PATH_FACETS_NOVEDAD = "";
    /** <code>Novedad</code> role target class. */
    public static final String ROLE_TARGET_NOVEDAD = NovedadConstants.CLASS_NAME;

    /** Agents allowed to navigate through Novedad **/
    public static final String NOVEDAD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";

    // Compound role (Solicitudes)
    /** <code>Solicitudes</code> role id. */
    public static final String ROLE_ID_SOLICITUDES = "Agr_1581422084096230_Alias";
    /** <code>Solicitudes</code> role name. */
    public static final String ROLE_NAME_SOLICITUDES = "solicitudes";
    /** <code>Causal</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUDES = "Solicitudes";


    /** <code>Solicitudes</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUDES = SolicitudNovedadConstants.ROLE_NAME_CAUSAL;
    /** <code>Solicitudes</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUDES = "";
    /** <code>Solicitudes</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUDES = SolicitudNovedadConstants.CLASS_NAME;
    /** Agents allowed to navigate through Solicitudes **/
    public static final String SOLICITUDES_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (GrupoAsignacionNovedad)
    /** <code>GrupoAsignacionNovedad</code> role id. */
    public static final String ROLE_ID_GRUPOASIGNACIONNOVEDAD = "Agr_1586852134912336_Alias";
    /** <code>GrupoAsignacionNovedad</code> role name. */
    public static final String ROLE_NAME_GRUPOASIGNACIONNOVEDAD = "grupoAsignacionNovedad";
    /** <code>Causal</code> role alias. */
    public static final String ROLE_ALIAS_GRUPOASIGNACIONNOVEDAD = "Grupos Asignacion Novedad";


    /** <code>GrupoAsignacionNovedad</code> inverse role name. */
    public static final String ROLE_INVNAME_GRUPOASIGNACIONNOVEDAD = GrupoAsignacionNovedadConstants.ROLE_NAME_CAUSAL;
    /** <code>GrupoAsignacionNovedad</code> role facet sequence. */
    public static final String PATH_FACETS_GRUPOASIGNACIONNOVEDAD = "";
    /** <code>GrupoAsignacionNovedad</code> role target class. */
    public static final String ROLE_TARGET_GRUPOASIGNACIONNOVEDAD = GrupoAsignacionNovedadConstants.CLASS_NAME;
    /** Agents allowed to navigate through GrupoAsignacionNovedad **/
    public static final String GRUPOASIGNACIONNOVEDAD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (ConfiguracionesANS)
    /** <code>ConfiguracionesANS</code> role id. */
    public static final String ROLE_ID_CONFIGURACIONESANS = "Agr_1586860392448383_Alias";
    /** <code>ConfiguracionesANS</code> role name. */
    public static final String ROLE_NAME_CONFIGURACIONESANS = "configuracionesANS";
    /** <code>Causal</code> role alias. */
    public static final String ROLE_ALIAS_CONFIGURACIONESANS = "Configuraciones ANS";


    /** <code>ConfiguracionesANS</code> inverse role name. */
    public static final String ROLE_INVNAME_CONFIGURACIONESANS = ConfiguracionANSConstants.ROLE_NAME_CAUSAL;
    /** <code>ConfiguracionesANS</code> role facet sequence. */
    public static final String PATH_FACETS_CONFIGURACIONESANS = "";
    /** <code>ConfiguracionesANS</code> role target class. */
    public static final String ROLE_TARGET_CONFIGURACIONESANS = ConfiguracionANSConstants.CLASS_NAME;
    /** Agents allowed to navigate through ConfiguracionesANS **/
    public static final String CONFIGURACIONESANS_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1581414219776993Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>causalcrearpagrNovedad</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_CAUSALCREARPAGRNOVEDAD = "p_agrNovedad";
    /** <code>causalcrearpagrNovedad</code> inbound argument id. */
    public static final String ARG_ID_CREAR_CAUSALCREARPAGRNOVEDAD = "Clas_1581414219776993Ser_1Arg_9_Alias";
    /** <code>causalcrearpagrNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_CAUSALCREARPAGRNOVEDAD = "Novedad";
    /** <code>causalcrearpatrAliasCausal</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_CAUSALCREARPATRALIASCAUSAL = "p_atrAliasCausal";
    /** <code>causalcrearpatrAliasCausal</code> inbound argument id. */
    public static final String ARG_ID_CREAR_CAUSALCREARPATRALIASCAUSAL = "Clas_1581414219776993Ser_1Arg_3_Alias";
    /** <code>causalcrearpatrAliasCausal</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_CAUSALCREARPATRALIASCAUSAL = "Alias";
    /** <code>causalcrearpatrNombre</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_CAUSALCREARPATRNOMBRE = "p_atrNombre";
    /** <code>causalcrearpatrNombre</code> inbound argument id. */
    public static final String ARG_ID_CREAR_CAUSALCREARPATRNOMBRE = "Clas_1581414219776993Ser_1Arg_4_Alias";
    /** <code>causalcrearpatrNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_CAUSALCREARPATRNOMBRE = "Nombre";
    /** <code>causalcrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_CAUSALCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>causalcrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_CAUSALCREARPATRDESCRIPCION = "Clas_1581414219776993Ser_1Arg_5_Alias";
    /** <code>causalcrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_CAUSALCREARPATRDESCRIPCION = "Descripción";
    /** <code>causalcrearpatrCodigoLegal</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_CAUSALCREARPATRCODIGOLEGAL = "p_atrCodigoLegal";
    /** <code>causalcrearpatrCodigoLegal</code> inbound argument id. */
    public static final String ARG_ID_CREAR_CAUSALCREARPATRCODIGOLEGAL = "Clas_1581414219776993Ser_1Arg_6_Alias";
    /** <code>causalcrearpatrCodigoLegal</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_CAUSALCREARPATRCODIGOLEGAL = "Código Legal";
    /** <code>causalcrearpatrReqDocPersona</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_CAUSALCREARPATRREQDOCPERSONA = "p_atrReqDocPersona";
    /** <code>causalcrearpatrReqDocPersona</code> inbound argument id. */
    public static final String ARG_ID_CREAR_CAUSALCREARPATRREQDOCPERSONA = "Clas_1581414219776993Ser_1Arg_7_Alias";
    /** <code>causalcrearpatrReqDocPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_CAUSALCREARPATRREQDOCPERSONA = "Requiere doc. persona";
    /** <code>causalcrearpatrReqDocSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_CAUSALCREARPATRREQDOCSOLICITUD = "p_atrReqDocSolicitud";
    /** <code>causalcrearpatrReqDocSolicitud</code> inbound argument id. */
    public static final String ARG_ID_CREAR_CAUSALCREARPATRREQDOCSOLICITUD = "Clas_1581414219776993Ser_1Arg_8_Alias";
    /** <code>causalcrearpatrReqDocSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_CAUSALCREARPATRREQDOCSOLICITUD = "Requiere doc. solicitud";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1581414219776993Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>causaleliminarpthisCausal</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_CAUSALELIMINARPTHISCAUSAL = "p_thisCausal";
    /** <code>causaleliminarpthisCausal</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_CAUSALELIMINARPTHISCAUSAL = "Clas_1581414219776993Ser_2Arg_1_Alias";
    /** <code>causaleliminarpthisCausal</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_CAUSALELIMINARPTHISCAUSAL = "Causal";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1581414219776993Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>causalmodificarpthisCausal</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_CAUSALMODIFICARPTHISCAUSAL = "p_thisCausal";
    /** <code>causalmodificarpthisCausal</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_CAUSALMODIFICARPTHISCAUSAL = "Clas_1581414219776993Ser_3Arg_1_Alias";
    /** <code>causalmodificarpthisCausal</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_CAUSALMODIFICARPTHISCAUSAL = "Causal";
    /** <code>causalmodificarpAliasCausal</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_CAUSALMODIFICARPALIASCAUSAL = "p_AliasCausal";
    /** <code>causalmodificarpAliasCausal</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_CAUSALMODIFICARPALIASCAUSAL = "Clas_1581414219776993Ser_3Arg_2_Alias";
    /** <code>causalmodificarpAliasCausal</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_CAUSALMODIFICARPALIASCAUSAL = "Alias";
    /** <code>causalmodificarpNombre</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_CAUSALMODIFICARPNOMBRE = "p_Nombre";
    /** <code>causalmodificarpNombre</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_CAUSALMODIFICARPNOMBRE = "Clas_1581414219776993Ser_3Arg_3_Alias";
    /** <code>causalmodificarpNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_CAUSALMODIFICARPNOMBRE = "Nombre";
    /** <code>causalmodificarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_CAUSALMODIFICARPDESCRIPCION = "p_Descripcion";
    /** <code>causalmodificarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_CAUSALMODIFICARPDESCRIPCION = "Clas_1581414219776993Ser_3Arg_4_Alias";
    /** <code>causalmodificarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_CAUSALMODIFICARPDESCRIPCION = "Descripción";
    /** <code>causalmodificarpCodigoLegal</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_CAUSALMODIFICARPCODIGOLEGAL = "p_CodigoLegal";
    /** <code>causalmodificarpCodigoLegal</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_CAUSALMODIFICARPCODIGOLEGAL = "Clas_1581414219776993Ser_3Arg_5_Alias";
    /** <code>causalmodificarpCodigoLegal</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_CAUSALMODIFICARPCODIGOLEGAL = "Código Legal";
    /** <code>causalmodificarpReqDocPersona</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_CAUSALMODIFICARPREQDOCPERSONA = "p_ReqDocPersona";
    /** <code>causalmodificarpReqDocPersona</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_CAUSALMODIFICARPREQDOCPERSONA = "Clas_1581414219776993Ser_3Arg_6_Alias";
    /** <code>causalmodificarpReqDocPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_CAUSALMODIFICARPREQDOCPERSONA = "ReqDocPersona";
    /** <code>causalmodificarpReqDocSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_CAUSALMODIFICARPREQDOCSOLICITUD = "p_ReqDocSolicitud";
    /** <code>causalmodificarpReqDocSolicitud</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_CAUSALMODIFICARPREQDOCSOLICITUD = "Clas_1581414219776993Ser_3Arg_7_Alias";
    /** <code>causalmodificarpReqDocSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_CAUSALMODIFICARPREQDOCSOLICITUD = "Requiere doc. solicitud";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_CAUSALALIASCAUSAL.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_CAUSALNOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_CAUSALDESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_CAUSALCODIGOLEGAL.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_CAUSALREQDOCPERSONA.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_CAUSALREQDOCSOLICITUD.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_CAUSALDRVTEXTOMOSTRAR.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_CAUSALIDCAUSAL.toUpperCase(), CAUSALIDCAUSAL_AGENTS);
    	attributeAgents.put(ATTR_NAME_CAUSALALIASCAUSAL.toUpperCase(), CAUSALALIASCAUSAL_AGENTS);
    	attributeAgents.put(ATTR_NAME_CAUSALNOMBRE.toUpperCase(), CAUSALNOMBRE_AGENTS);
    	attributeAgents.put(ATTR_NAME_CAUSALDESCRIPCION.toUpperCase(), CAUSALDESCRIPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_CAUSALCODIGOLEGAL.toUpperCase(), CAUSALCODIGOLEGAL_AGENTS);
    	attributeAgents.put(ATTR_NAME_CAUSALREQDOCPERSONA.toUpperCase(), CAUSALREQDOCPERSONA_AGENTS);
    	attributeAgents.put(ATTR_NAME_CAUSALREQDOCSOLICITUD.toUpperCase(), CAUSALREQDOCSOLICITUD_AGENTS);
    	attributeAgents.put(ATTR_NAME_CAUSALDRVTEXTOMOSTRAR.toUpperCase(), CAUSALDRVTEXTOMOSTRAR_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_NOVEDAD.toUpperCase(), NOVEDAD_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'Causal', it returns the identification keys
     * - If className is a facet of the inheritance net of 'Causal', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_CAUSALIDCAUSAL);
        }
        // Facet 'Causal' (This facet)
        if (CausalConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_CAUSALIDCAUSAL);
        }
        return returnList;
    }
}
