package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>PriorizacionSolicitudes</code> model class.
 */
public final class PriorizacionSolicitudesConstants {

    private PriorizacionSolicitudesConstants() {

    }

    // Class
    /** <code>PriorizacionSolicitudes</code> class id. */
    public static final String CLASS_ID = "Clas_1586846892032587_Alias";
    /** <code>PriorizacionSolicitudes</code> class name. */
    public static final String CLASS_NAME = "PriorizacionSolicitudes";
    /** <code>PriorizacionSolicitudes</code> class alias. */
    public static final String CLASS_ALIAS = "Priorización Solicitudes";
    /** <code>PriorizacionSolicitudes</code> class table name. */
    public static final String TBL_NAME = "PriorizacionSolicitudes";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "priorizacionSolicitudesEstadoSolicitud,priorizacionSolicitudesEstadoDoc,priorizacionSolicitudesPrioridad";

    public static final String DSDSPRIORIZACIONSOLICITUDES = "DS_PriorizacionSolicitudes";
    

    // Attribute (priorizacionSolicitudesEstadoSolicitud)
    /** <code>priorizacionSolicitudesEstadoSolicitud</code> attribute id. */
    public static final String ATTR_ID_PRIORIZACIONSOLICITUDESESTADOSOLICITUD = "Clas_1586846892032587Atr_2_Alias";
    /** <code>priorizacionSolicitudesEstadoSolicitud</code> attribute name. */
    public static final String ATTR_NAME_PRIORIZACIONSOLICITUDESESTADOSOLICITUD = "priorizacionSolicitudesEstadoSolicitud";
    /** <code>priorizacionSolicitudesEstadoSolicitud</code> attribute alias. */
    public static final String ATTR_ALIAS_PRIORIZACIONSOLICITUDESESTADOSOLICITUD = "Estado Solicitud";

    /** <code>priorizacionSolicitudesEstadoSolicitud</code> attribute facet sequence. */
    public static final String PATH_FACETS_PRIORIZACIONSOLICITUDESESTADOSOLICITUD = "";
    /** Agents allowed to view the attribute priorizacionSolicitudesEstadoSolicitud **/
    public static final String PRIORIZACIONSOLICITUDESESTADOSOLICITUD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,UsuarioSistemaExterno";
    // Attribute (priorizacionSolicitudesEstadoDoc)
    /** <code>priorizacionSolicitudesEstadoDoc</code> attribute id. */
    public static final String ATTR_ID_PRIORIZACIONSOLICITUDESESTADODOC = "Clas_1586846892032587Atr_3_Alias";
    /** <code>priorizacionSolicitudesEstadoDoc</code> attribute name. */
    public static final String ATTR_NAME_PRIORIZACIONSOLICITUDESESTADODOC = "priorizacionSolicitudesEstadoDoc";
    /** <code>priorizacionSolicitudesEstadoDoc</code> attribute alias. */
    public static final String ATTR_ALIAS_PRIORIZACIONSOLICITUDESESTADODOC = "Estado Documentación";

    /** <code>priorizacionSolicitudesEstadoDoc</code> attribute facet sequence. */
    public static final String PATH_FACETS_PRIORIZACIONSOLICITUDESESTADODOC = "";
    /** Agents allowed to view the attribute priorizacionSolicitudesEstadoDoc **/
    public static final String PRIORIZACIONSOLICITUDESESTADODOC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,UsuarioSistemaExterno";
    // Attribute (priorizacionSolicitudesPrioridad)
    /** <code>priorizacionSolicitudesPrioridad</code> attribute id. */
    public static final String ATTR_ID_PRIORIZACIONSOLICITUDESPRIORIDAD = "Clas_1586846892032587Atr_4_Alias";
    /** <code>priorizacionSolicitudesPrioridad</code> attribute name. */
    public static final String ATTR_NAME_PRIORIZACIONSOLICITUDESPRIORIDAD = "priorizacionSolicitudesPrioridad";
    /** <code>priorizacionSolicitudesPrioridad</code> attribute alias. */
    public static final String ATTR_ALIAS_PRIORIZACIONSOLICITUDESPRIORIDAD = "Prioridad";

    /** <code>priorizacionSolicitudesPrioridad</code> attribute facet sequence. */
    public static final String PATH_FACETS_PRIORIZACIONSOLICITUDESPRIORIDAD = "";
    /** Agents allowed to view the attribute priorizacionSolicitudesPrioridad **/
    public static final String PRIORIZACIONSOLICITUDESPRIORIDAD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,UsuarioSistemaExterno";


    // Field (EstadoSolicitud)
    /** <code>EstadoSolicitud</code> field name. */
    public static final String FLD_PRIORIZACIONSOLICITUDESESTADOSOLICITUD = "EstadoSolicitud";    
    /** <code>priorizacionSolicitudesEstadoSolicitud</code> attribute field name. */
    public static final String ATTR_FIELD_PRIORIZACIONSOLICITUDESESTADOSOLICITUD = "priorizacionSolicitudesEstadoSolicitud";
    // Field (EstadoDoc)
    /** <code>EstadoDoc</code> field name. */
    public static final String FLD_PRIORIZACIONSOLICITUDESESTADODOC = "EstadoDoc";    
    /** <code>priorizacionSolicitudesEstadoDoc</code> attribute field name. */
    public static final String ATTR_FIELD_PRIORIZACIONSOLICITUDESESTADODOC = "priorizacionSolicitudesEstadoDoc";
    // Field (Prioridad)
    /** <code>Prioridad</code> field name. */
    public static final String FLD_PRIORIZACIONSOLICITUDESPRIORIDAD = "Prioridad";    
    /** <code>priorizacionSolicitudesPrioridad</code> attribute field name. */
    public static final String ATTR_FIELD_PRIORIZACIONSOLICITUDESPRIORIDAD = "priorizacionSolicitudesPrioridad";


    // Compound role (LogPriorizacionSol)
    /** <code>LogPriorizacionSol</code> role id. */
    public static final String ROLE_ID_LOGPRIORIZACIONSOL = "Agr_1586847940608995_Alias";
    /** <code>LogPriorizacionSol</code> role name. */
    public static final String ROLE_NAME_LOGPRIORIZACIONSOL = "logPriorizacionSol";
    /** <code>PriSolicitud</code> role alias. */
    public static final String ROLE_ALIAS_LOGPRIORIZACIONSOL = "LogPriorizacionSol";


    /** <code>LogPriorizacionSol</code> inverse role name. */
    public static final String ROLE_INVNAME_LOGPRIORIZACIONSOL = LogPriorizacionSolConstants.ROLE_NAME_PRISOLICITUD;
    /** <code>LogPriorizacionSol</code> role facet sequence. */
    public static final String PATH_FACETS_LOGPRIORIZACIONSOL = "";
    /** <code>LogPriorizacionSol</code> role target class. */
    public static final String ROLE_TARGET_LOGPRIORIZACIONSOL = LogPriorizacionSolConstants.CLASS_NAME;
    /** Agents allowed to navigate through LogPriorizacionSol **/
    public static final String LOGPRIORIZACIONSOL_AGENTS = "Admin,SuperAdmin,Gestor";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1586846892032587Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>priorizacionSolicitudescrearpatrEstadoSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PRIORIZACIONSOLICITUDESCREARPATRESTADOSOLICITUD = "p_atrEstadoSolicitud";
    /** <code>priorizacionSolicitudescrearpatrEstadoSolicitud</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PRIORIZACIONSOLICITUDESCREARPATRESTADOSOLICITUD = "Clas_1586846892032587Ser_1Arg_2_Alias";
    /** <code>priorizacionSolicitudescrearpatrEstadoSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PRIORIZACIONSOLICITUDESCREARPATRESTADOSOLICITUD = "Estado Solicitud";
    /** <code>priorizacionSolicitudescrearpatrEstadoDoc</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PRIORIZACIONSOLICITUDESCREARPATRESTADODOC = "p_atrEstadoDoc";
    /** <code>priorizacionSolicitudescrearpatrEstadoDoc</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PRIORIZACIONSOLICITUDESCREARPATRESTADODOC = "Clas_1586846892032587Ser_1Arg_3_Alias";
    /** <code>priorizacionSolicitudescrearpatrEstadoDoc</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PRIORIZACIONSOLICITUDESCREARPATRESTADODOC = "Estado Documentación";
    /** <code>priorizacionSolicitudescrearpatrPrioridad</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PRIORIZACIONSOLICITUDESCREARPATRPRIORIDAD = "p_atrPrioridad";
    /** <code>priorizacionSolicitudescrearpatrPrioridad</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PRIORIZACIONSOLICITUDESCREARPATRPRIORIDAD = "Clas_1586846892032587Ser_1Arg_4_Alias";
    /** <code>priorizacionSolicitudescrearpatrPrioridad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PRIORIZACIONSOLICITUDESCREARPATRPRIORIDAD = "Prioridad";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1586846892032587Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>priorizacionSolicitudeseliminarpthisPriorizacionSolicitudes</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_PRIORIZACIONSOLICITUDESELIMINARPTHISPRIORIZACIONSOLICITUDES = "p_thisPriorizacionSolicitudes";
    /** <code>priorizacionSolicitudeseliminarpthisPriorizacionSolicitudes</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_PRIORIZACIONSOLICITUDESELIMINARPTHISPRIORIZACIONSOLICITUDES = "Clas_1586846892032587Ser_2Arg_1_Alias";
    /** <code>priorizacionSolicitudeseliminarpthisPriorizacionSolicitudes</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_PRIORIZACIONSOLICITUDESELIMINARPTHISPRIORIZACIONSOLICITUDES = "Priorización Solicitudes";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1586846892032587Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>priorizacionSolicitudesmodificarpthisPriorizacionSolicitudes</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PRIORIZACIONSOLICITUDESMODIFICARPTHISPRIORIZACIONSOLICITUDES = "p_thisPriorizacionSolicitudes";
    /** <code>priorizacionSolicitudesmodificarpthisPriorizacionSolicitudes</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PRIORIZACIONSOLICITUDESMODIFICARPTHISPRIORIZACIONSOLICITUDES = "Clas_1586846892032587Ser_3Arg_1_Alias";
    /** <code>priorizacionSolicitudesmodificarpthisPriorizacionSolicitudes</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PRIORIZACIONSOLICITUDESMODIFICARPTHISPRIORIZACIONSOLICITUDES = "Priorización Solicitudes";
    /** <code>priorizacionSolicitudesmodificarpPrioridad</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PRIORIZACIONSOLICITUDESMODIFICARPPRIORIDAD = "p_Prioridad";
    /** <code>priorizacionSolicitudesmodificarpPrioridad</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PRIORIZACIONSOLICITUDESMODIFICARPPRIORIDAD = "Clas_1586846892032587Ser_3Arg_2_Alias";
    /** <code>priorizacionSolicitudesmodificarpPrioridad</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PRIORIZACIONSOLICITUDESMODIFICARPPRIORIDAD = "Prioridad";
    // Service (InsPriorizacionSolicitudes)
    /** <code>InsPriorizacionSolicitudes</code> service id. */
    public static final String SERV_ID_INSPRIORIZACIONSOLICITUDES = "Clas_1586846892032587Ser_4_Alias";
    /** <code>InsPriorizacionSolicitudes</code> service name. */
    public static final String SERV_NAME_INSPRIORIZACIONSOLICITUDES = "InsPriorizacionSolicitudes";
    /** <code>InsPriorizacionSolicitudes</code> service alias. */
    public static final String SERV_ALIAS_INSPRIORIZACIONSOLICITUDES = "InsPriorizacionSolicitudes";
    /** Agents allowed to execute the service InsPriorizacionSolicitudes **/
    public static final String INSPRIORIZACIONSOLICITUDES_SRVAGENTS = "";
    // Inbound arguments
    /** <code>priorizacionSolicitudesInsPriorizacionSolicitudespthisPriorizacionSolicitudes</code> inbound argument name. */
    public static final String ARG_NAME_INSPRIORIZACIONSOLICITUDES_PRIORIZACIONSOLICITUDESINSPRIORIZACIONSOLICITUDESPTHISPRIORIZACIONSOLICITUDES = "p_thisPriorizacionSolicitudes";
    /** <code>priorizacionSolicitudesInsPriorizacionSolicitudespthisPriorizacionSolicitudes</code> inbound argument id. */
    public static final String ARG_ID_INSPRIORIZACIONSOLICITUDES_PRIORIZACIONSOLICITUDESINSPRIORIZACIONSOLICITUDESPTHISPRIORIZACIONSOLICITUDES = "Clas_1586846892032587Ser_4Arg_1_Alias";
    /** <code>priorizacionSolicitudesInsPriorizacionSolicitudespthisPriorizacionSolicitudes</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPRIORIZACIONSOLICITUDES_PRIORIZACIONSOLICITUDESINSPRIORIZACIONSOLICITUDESPTHISPRIORIZACIONSOLICITUDES = "PriSolicitud";
    /** <code>priorizacionSolicitudesInsPriorizacionSolicitudespevcLogPriorizacionSol</code> inbound argument name. */
    public static final String ARG_NAME_INSPRIORIZACIONSOLICITUDES_PRIORIZACIONSOLICITUDESINSPRIORIZACIONSOLICITUDESPEVCLOGPRIORIZACIONSOL = "p_evcLogPriorizacionSol";
    /** <code>priorizacionSolicitudesInsPriorizacionSolicitudespevcLogPriorizacionSol</code> inbound argument id. */
    public static final String ARG_ID_INSPRIORIZACIONSOLICITUDES_PRIORIZACIONSOLICITUDESINSPRIORIZACIONSOLICITUDESPEVCLOGPRIORIZACIONSOL = "Clas_1586846892032587Ser_4Arg_2_Alias";
    /** <code>priorizacionSolicitudesInsPriorizacionSolicitudespevcLogPriorizacionSol</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPRIORIZACIONSOLICITUDES_PRIORIZACIONSOLICITUDESINSPRIORIZACIONSOLICITUDESPEVCLOGPRIORIZACIONSOL = "LogPriorizacionSol";
    // Service (DelPriorizacionSolicitudes)
    /** <code>DelPriorizacionSolicitudes</code> service id. */
    public static final String SERV_ID_DELPRIORIZACIONSOLICITUDES = "Clas_1586846892032587Ser_5_Alias";
    /** <code>DelPriorizacionSolicitudes</code> service name. */
    public static final String SERV_NAME_DELPRIORIZACIONSOLICITUDES = "DelPriorizacionSolicitudes";
    /** <code>DelPriorizacionSolicitudes</code> service alias. */
    public static final String SERV_ALIAS_DELPRIORIZACIONSOLICITUDES = "DelPriorizacionSolicitudes";
    /** Agents allowed to execute the service DelPriorizacionSolicitudes **/
    public static final String DELPRIORIZACIONSOLICITUDES_SRVAGENTS = "";
    // Inbound arguments
    /** <code>priorizacionSolicitudesDelPriorizacionSolicitudespthisPriorizacionSolicitudes</code> inbound argument name. */
    public static final String ARG_NAME_DELPRIORIZACIONSOLICITUDES_PRIORIZACIONSOLICITUDESDELPRIORIZACIONSOLICITUDESPTHISPRIORIZACIONSOLICITUDES = "p_thisPriorizacionSolicitudes";
    /** <code>priorizacionSolicitudesDelPriorizacionSolicitudespthisPriorizacionSolicitudes</code> inbound argument id. */
    public static final String ARG_ID_DELPRIORIZACIONSOLICITUDES_PRIORIZACIONSOLICITUDESDELPRIORIZACIONSOLICITUDESPTHISPRIORIZACIONSOLICITUDES = "Clas_1586846892032587Ser_5Arg_1_Alias";
    /** <code>priorizacionSolicitudesDelPriorizacionSolicitudespthisPriorizacionSolicitudes</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPRIORIZACIONSOLICITUDES_PRIORIZACIONSOLICITUDESDELPRIORIZACIONSOLICITUDESPTHISPRIORIZACIONSOLICITUDES = "PriSolicitud";
    /** <code>priorizacionSolicitudesDelPriorizacionSolicitudespevcLogPriorizacionSol</code> inbound argument name. */
    public static final String ARG_NAME_DELPRIORIZACIONSOLICITUDES_PRIORIZACIONSOLICITUDESDELPRIORIZACIONSOLICITUDESPEVCLOGPRIORIZACIONSOL = "p_evcLogPriorizacionSol";
    /** <code>priorizacionSolicitudesDelPriorizacionSolicitudespevcLogPriorizacionSol</code> inbound argument id. */
    public static final String ARG_ID_DELPRIORIZACIONSOLICITUDES_PRIORIZACIONSOLICITUDESDELPRIORIZACIONSOLICITUDESPEVCLOGPRIORIZACIONSOL = "Clas_1586846892032587Ser_5Arg_2_Alias";
    /** <code>priorizacionSolicitudesDelPriorizacionSolicitudespevcLogPriorizacionSol</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPRIORIZACIONSOLICITUDES_PRIORIZACIONSOLICITUDESDELPRIORIZACIONSOLICITUDESPEVCLOGPRIORIZACIONSOL = "LogPriorizacionSol";
    // Service (TCREAR)
    /** <code>TCREAR</code> service id. */
    public static final String SERV_ID_TCREAR = "Clas_1586846892032587Ser_6_Alias";
    /** <code>TCREAR</code> service name. */
    public static final String SERV_NAME_TCREAR = "TCREAR";
    /** <code>TCREAR</code> service alias. */
    public static final String SERV_ALIAS_TCREAR = "Crear";
    /** Agents allowed to execute the service TCREAR **/
    public static final String TCREAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>priorizacionSolicitudesTCREARptpatrEstadoSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_PRIORIZACIONSOLICITUDESTCREARPTPATRESTADOSOLICITUD = "pt_p_atrEstadoSolicitud";
    /** <code>priorizacionSolicitudesTCREARptpatrEstadoSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_PRIORIZACIONSOLICITUDESTCREARPTPATRESTADOSOLICITUD = "Clas_1586846892032587Ser_6Arg_5_Alias";
    /** <code>priorizacionSolicitudesTCREARptpatrEstadoSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_PRIORIZACIONSOLICITUDESTCREARPTPATRESTADOSOLICITUD = "Estado Solicitud";
    /** <code>priorizacionSolicitudesTCREARptpatrEstadoDoc</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_PRIORIZACIONSOLICITUDESTCREARPTPATRESTADODOC = "pt_p_atrEstadoDoc";
    /** <code>priorizacionSolicitudesTCREARptpatrEstadoDoc</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_PRIORIZACIONSOLICITUDESTCREARPTPATRESTADODOC = "Clas_1586846892032587Ser_6Arg_6_Alias";
    /** <code>priorizacionSolicitudesTCREARptpatrEstadoDoc</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_PRIORIZACIONSOLICITUDESTCREARPTPATRESTADODOC = "Estado Documentación";
    /** <code>priorizacionSolicitudesTCREARptpatrPrioridad</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_PRIORIZACIONSOLICITUDESTCREARPTPATRPRIORIDAD = "pt_p_atrPrioridad";
    /** <code>priorizacionSolicitudesTCREARptpatrPrioridad</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_PRIORIZACIONSOLICITUDESTCREARPTPATRPRIORIDAD = "Clas_1586846892032587Ser_6Arg_7_Alias";
    /** <code>priorizacionSolicitudesTCREARptpatrPrioridad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_PRIORIZACIONSOLICITUDESTCREARPTPATRPRIORIDAD = "Prioridad";
    // Service (TELIMINAR)
    /** <code>TELIMINAR</code> service id. */
    public static final String SERV_ID_TELIMINAR = "Clas_1586846892032587Ser_7_Alias";
    /** <code>TELIMINAR</code> service name. */
    public static final String SERV_NAME_TELIMINAR = "TELIMINAR";
    /** <code>TELIMINAR</code> service alias. */
    public static final String SERV_ALIAS_TELIMINAR = "Eliminar";
    /** Agents allowed to execute the service TELIMINAR **/
    public static final String TELIMINAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>priorizacionSolicitudesTELIMINARpthisPriorizacionSolicitudes</code> inbound argument name. */
    public static final String ARG_NAME_TELIMINAR_PRIORIZACIONSOLICITUDESTELIMINARPTHISPRIORIZACIONSOLICITUDES = "p_thisPriorizacionSolicitudes";
    /** <code>priorizacionSolicitudesTELIMINARpthisPriorizacionSolicitudes</code> inbound argument id. */
    public static final String ARG_ID_TELIMINAR_PRIORIZACIONSOLICITUDESTELIMINARPTHISPRIORIZACIONSOLICITUDES = "Clas_1586846892032587Ser_7Arg_1_Alias";
    /** <code>priorizacionSolicitudesTELIMINARpthisPriorizacionSolicitudes</code> inbound argument alias. */
    public static final String ARG_ALIAS_TELIMINAR_PRIORIZACIONSOLICITUDESTELIMINARPTHISPRIORIZACIONSOLICITUDES = "Priorización Solicitudes";
    /** <code>priorizacionSolicitudesTELIMINARptEstadoSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TELIMINAR_PRIORIZACIONSOLICITUDESTELIMINARPTESTADOSOLICITUD = "ptEstadoSolicitud";
    /** <code>priorizacionSolicitudesTELIMINARptEstadoSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TELIMINAR_PRIORIZACIONSOLICITUDESTELIMINARPTESTADOSOLICITUD = "Clas_1586846892032587Ser_7Arg_2_Alias";
    /** <code>priorizacionSolicitudesTELIMINARptEstadoSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TELIMINAR_PRIORIZACIONSOLICITUDESTELIMINARPTESTADOSOLICITUD = "Estado Solicitud";
    /** <code>priorizacionSolicitudesTELIMINARptEstadoDoc</code> inbound argument name. */
    public static final String ARG_NAME_TELIMINAR_PRIORIZACIONSOLICITUDESTELIMINARPTESTADODOC = "ptEstadoDoc";
    /** <code>priorizacionSolicitudesTELIMINARptEstadoDoc</code> inbound argument id. */
    public static final String ARG_ID_TELIMINAR_PRIORIZACIONSOLICITUDESTELIMINARPTESTADODOC = "Clas_1586846892032587Ser_7Arg_3_Alias";
    /** <code>priorizacionSolicitudesTELIMINARptEstadoDoc</code> inbound argument alias. */
    public static final String ARG_ALIAS_TELIMINAR_PRIORIZACIONSOLICITUDESTELIMINARPTESTADODOC = "Estado Documentación";
    // Service (TMODIFICAR)
    /** <code>TMODIFICAR</code> service id. */
    public static final String SERV_ID_TMODIFICAR = "Clas_1586846892032587Ser_8_Alias";
    /** <code>TMODIFICAR</code> service name. */
    public static final String SERV_NAME_TMODIFICAR = "TMODIFICAR";
    /** <code>TMODIFICAR</code> service alias. */
    public static final String SERV_ALIAS_TMODIFICAR = "Modificar";
    /** Agents allowed to execute the service TMODIFICAR **/
    public static final String TMODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>priorizacionSolicitudesTMODIFICARpthisPriorizacionSolicitudes</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_PRIORIZACIONSOLICITUDESTMODIFICARPTHISPRIORIZACIONSOLICITUDES = "p_thisPriorizacionSolicitudes";
    /** <code>priorizacionSolicitudesTMODIFICARpthisPriorizacionSolicitudes</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_PRIORIZACIONSOLICITUDESTMODIFICARPTHISPRIORIZACIONSOLICITUDES = "Clas_1586846892032587Ser_8Arg_1_Alias";
    /** <code>priorizacionSolicitudesTMODIFICARpthisPriorizacionSolicitudes</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_PRIORIZACIONSOLICITUDESTMODIFICARPTHISPRIORIZACIONSOLICITUDES = "Priorización Solicitudes";
    /** <code>priorizacionSolicitudesTMODIFICARptpPrioridad</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_PRIORIZACIONSOLICITUDESTMODIFICARPTPPRIORIDAD = "pt_p_Prioridad";
    /** <code>priorizacionSolicitudesTMODIFICARptpPrioridad</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_PRIORIZACIONSOLICITUDESTMODIFICARPTPPRIORIDAD = "Clas_1586846892032587Ser_8Arg_2_Alias";
    /** <code>priorizacionSolicitudesTMODIFICARptpPrioridad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_PRIORIZACIONSOLICITUDESTMODIFICARPTPPRIORIDAD = "Prioridad";
    /** <code>priorizacionSolicitudesTMODIFICARptEstadoSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_PRIORIZACIONSOLICITUDESTMODIFICARPTESTADOSOLICITUD = "ptEstadoSolicitud";
    /** <code>priorizacionSolicitudesTMODIFICARptEstadoSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_PRIORIZACIONSOLICITUDESTMODIFICARPTESTADOSOLICITUD = "Clas_1586846892032587Ser_8Arg_3_Alias";
    /** <code>priorizacionSolicitudesTMODIFICARptEstadoSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_PRIORIZACIONSOLICITUDESTMODIFICARPTESTADOSOLICITUD = "Estado Solicitud";
    /** <code>priorizacionSolicitudesTMODIFICARptEstadoDoc</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_PRIORIZACIONSOLICITUDESTMODIFICARPTESTADODOC = "ptEstadoDoc";
    /** <code>priorizacionSolicitudesTMODIFICARptEstadoDoc</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_PRIORIZACIONSOLICITUDESTMODIFICARPTESTADODOC = "Clas_1586846892032587Ser_8Arg_4_Alias";
    /** <code>priorizacionSolicitudesTMODIFICARptEstadoDoc</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_PRIORIZACIONSOLICITUDESTMODIFICARPTESTADODOC = "Estado Documentación";

    public static final String FILTER_NAME_FPRIORIZACIONSOLICITUDES = "F_PriorizacionSolicitudes";
    public static final String VAR_NAME_FPRIORIZACIONSOLICITUDES_VFESTADOSOL = "vfEstadoSol";
    public static final String VAR_NAME_FPRIORIZACIONSOLICITUDES_VFESTADODOC = "vfEstadoDoc";
    public static final String VAR_NAME_FPRIORIZACIONSOLICITUDES_VFPRIORDAD = "vfPriordad";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_PRIORIZACIONSOLICITUDESPRIORIDAD.toUpperCase(), Constants.Type.NAT.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_PRIORIZACIONSOLICITUDESESTADOSOLICITUD.toUpperCase(), PRIORIZACIONSOLICITUDESESTADOSOLICITUD_AGENTS);
    	attributeAgents.put(ATTR_NAME_PRIORIZACIONSOLICITUDESESTADODOC.toUpperCase(), PRIORIZACIONSOLICITUDESESTADODOC_AGENTS);
    	attributeAgents.put(ATTR_NAME_PRIORIZACIONSOLICITUDESPRIORIDAD.toUpperCase(), PRIORIZACIONSOLICITUDESPRIORIDAD_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'PriorizacionSolicitudes', it returns the identification keys
     * - If className is a facet of the inheritance net of 'PriorizacionSolicitudes', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_PRIORIZACIONSOLICITUDESESTADOSOLICITUD);
            returnList.add(ATTR_FIELD_PRIORIZACIONSOLICITUDESESTADODOC);
        }
        // Facet 'PriorizacionSolicitudes' (This facet)
        if (PriorizacionSolicitudesConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_PRIORIZACIONSOLICITUDESESTADOSOLICITUD);
            returnList.add(ATTR_FIELD_PRIORIZACIONSOLICITUDESESTADODOC);
        }
        return returnList;
    }
}
