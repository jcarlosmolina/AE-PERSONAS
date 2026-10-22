package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>LogPriorizacionSol</code> model class.
 */
public final class LogPriorizacionSolConstants {

    private LogPriorizacionSolConstants() {

    }

    // Class
    /** <code>LogPriorizacionSol</code> class id. */
    public static final String CLASS_ID = "Clas_1586847547392173_Alias";
    /** <code>LogPriorizacionSol</code> class name. */
    public static final String CLASS_NAME = "LogPriorizacionSol";
    /** <code>LogPriorizacionSol</code> class alias. */
    public static final String CLASS_ALIAS = "Histórico Priorización Solicitudes";
    /** <code>LogPriorizacionSol</code> class table name. */
    public static final String TBL_NAME = "LogPriorizacionSol";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "logPriorizacionSolId,priorizacionSolicitudesPriSolicitudEstadoSolicitud,priorizacionSolicitudesPriSolicitudEstadoDoc,logPriorizacionSolFecha,logPriorizacionSolLoginFuncionario,logPriorizacionSolEstadoSolicitud,logPriorizacionSolEstadoDoc,logPriorizacionSolPrioridad";

    public static final String DSDSLOGPRIORIZACIONSOL = "DS_LogPriorizacionSol";
    

    // Attribute (logPriorizacionSolId)
    /** <code>logPriorizacionSolId</code> attribute id. */
    public static final String ATTR_ID_LOGPRIORIZACIONSOLID = "Clas_1586847547392173Atr_1_Alias";
    /** <code>logPriorizacionSolId</code> attribute name. */
    public static final String ATTR_NAME_LOGPRIORIZACIONSOLID = "logPriorizacionSolId";
    /** <code>logPriorizacionSolId</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGPRIORIZACIONSOLID = "Id.";

    /** <code>logPriorizacionSolId</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGPRIORIZACIONSOLID = "";
    /** Agents allowed to view the attribute logPriorizacionSolId **/
    public static final String LOGPRIORIZACIONSOLID_AGENTS = "Admin,SuperAdmin";
    // Attribute (logPriorizacionSolFecha)
    /** <code>logPriorizacionSolFecha</code> attribute id. */
    public static final String ATTR_ID_LOGPRIORIZACIONSOLFECHA = "Clas_1586847547392173Atr_5_Alias";
    /** <code>logPriorizacionSolFecha</code> attribute name. */
    public static final String ATTR_NAME_LOGPRIORIZACIONSOLFECHA = "logPriorizacionSolFecha";
    /** <code>logPriorizacionSolFecha</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGPRIORIZACIONSOLFECHA = "Fecha";

    /** <code>logPriorizacionSolFecha</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGPRIORIZACIONSOLFECHA = "";
    /** Agents allowed to view the attribute logPriorizacionSolFecha **/
    public static final String LOGPRIORIZACIONSOLFECHA_AGENTS = "Admin,SuperAdmin";
    // Attribute (logPriorizacionSolLoginFuncionario)
    /** <code>logPriorizacionSolLoginFuncionario</code> attribute id. */
    public static final String ATTR_ID_LOGPRIORIZACIONSOLLOGINFUNCIONARIO = "Clas_1586847547392173Atr_6_Alias";
    /** <code>logPriorizacionSolLoginFuncionario</code> attribute name. */
    public static final String ATTR_NAME_LOGPRIORIZACIONSOLLOGINFUNCIONARIO = "logPriorizacionSolLoginFuncionario";
    /** <code>logPriorizacionSolLoginFuncionario</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGPRIORIZACIONSOLLOGINFUNCIONARIO = "Login";

    /** <code>logPriorizacionSolLoginFuncionario</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGPRIORIZACIONSOLLOGINFUNCIONARIO = "";
    /** Agents allowed to view the attribute logPriorizacionSolLoginFuncionario **/
    public static final String LOGPRIORIZACIONSOLLOGINFUNCIONARIO_AGENTS = "Admin,SuperAdmin";
    // Attribute (logPriorizacionSolEstadoSolicitud)
    /** <code>logPriorizacionSolEstadoSolicitud</code> attribute id. */
    public static final String ATTR_ID_LOGPRIORIZACIONSOLESTADOSOLICITUD = "Clas_1586847547392173Atr_2_Alias";
    /** <code>logPriorizacionSolEstadoSolicitud</code> attribute name. */
    public static final String ATTR_NAME_LOGPRIORIZACIONSOLESTADOSOLICITUD = "logPriorizacionSolEstadoSolicitud";
    /** <code>logPriorizacionSolEstadoSolicitud</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGPRIORIZACIONSOLESTADOSOLICITUD = "Estado Solicitud";

    /** <code>logPriorizacionSolEstadoSolicitud</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGPRIORIZACIONSOLESTADOSOLICITUD = "";
    /** Agents allowed to view the attribute logPriorizacionSolEstadoSolicitud **/
    public static final String LOGPRIORIZACIONSOLESTADOSOLICITUD_AGENTS = "Admin,SuperAdmin";
    // Attribute (logPriorizacionSolEstadoDoc)
    /** <code>logPriorizacionSolEstadoDoc</code> attribute id. */
    public static final String ATTR_ID_LOGPRIORIZACIONSOLESTADODOC = "Clas_1586847547392173Atr_3_Alias";
    /** <code>logPriorizacionSolEstadoDoc</code> attribute name. */
    public static final String ATTR_NAME_LOGPRIORIZACIONSOLESTADODOC = "logPriorizacionSolEstadoDoc";
    /** <code>logPriorizacionSolEstadoDoc</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGPRIORIZACIONSOLESTADODOC = "Estado Documentación";

    /** <code>logPriorizacionSolEstadoDoc</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGPRIORIZACIONSOLESTADODOC = "";
    /** Agents allowed to view the attribute logPriorizacionSolEstadoDoc **/
    public static final String LOGPRIORIZACIONSOLESTADODOC_AGENTS = "Admin,SuperAdmin";
    // Attribute (logPriorizacionSolPrioridad)
    /** <code>logPriorizacionSolPrioridad</code> attribute id. */
    public static final String ATTR_ID_LOGPRIORIZACIONSOLPRIORIDAD = "Clas_1586847547392173Atr_4_Alias";
    /** <code>logPriorizacionSolPrioridad</code> attribute name. */
    public static final String ATTR_NAME_LOGPRIORIZACIONSOLPRIORIDAD = "logPriorizacionSolPrioridad";
    /** <code>logPriorizacionSolPrioridad</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGPRIORIZACIONSOLPRIORIDAD = "Prioridad";

    /** <code>logPriorizacionSolPrioridad</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGPRIORIZACIONSOLPRIORIDAD = "";
    /** Agents allowed to view the attribute logPriorizacionSolPrioridad **/
    public static final String LOGPRIORIZACIONSOLPRIORIDAD_AGENTS = "Admin,SuperAdmin";


    // Field (Id)
    /** <code>Id</code> field name. */
    public static final String FLD_LOGPRIORIZACIONSOLID = "Id";    
    /** <code>logPriorizacionSolId</code> attribute field name. */
    public static final String ATTR_FIELD_LOGPRIORIZACIONSOLID = "logPriorizacionSolId";
    // Field (PriSolicitud_EstadoSolicitud)
    /** <code>PriSolicitud_EstadoSolicitud</code> field name. */
    public static final String FLD_PRIORIZACIONSOLICITUDESPRISOLICITUDESTADOSOLICITUD = "PriSolicitud_EstadoSolicitud";    
    /** <code>PriSolicitud.priorizacionSolicitudesEstadoSolicitud</code> attribute field name. */
    public static final String ATTR_FIELD_PRISOLICITUD_PRIORIZACIONSOLICITUDESESTADOSOLICITUD = "priorizacionSolicitudesPriSolicitudEstadoSolicitud";
    // Field (PriSolicitud_EstadoDoc)
    /** <code>PriSolicitud_EstadoDoc</code> field name. */
    public static final String FLD_PRIORIZACIONSOLICITUDESPRISOLICITUDESTADODOC = "PriSolicitud_EstadoDoc";    
    /** <code>PriSolicitud.priorizacionSolicitudesEstadoDoc</code> attribute field name. */
    public static final String ATTR_FIELD_PRISOLICITUD_PRIORIZACIONSOLICITUDESESTADODOC = "priorizacionSolicitudesPriSolicitudEstadoDoc";
    // Field (Fecha)
    /** <code>Fecha</code> field name. */
    public static final String FLD_LOGPRIORIZACIONSOLFECHA = "Fecha";    
    /** <code>logPriorizacionSolFecha</code> attribute field name. */
    public static final String ATTR_FIELD_LOGPRIORIZACIONSOLFECHA = "logPriorizacionSolFecha";
    // Field (LoginFuncionario)
    /** <code>LoginFuncionario</code> field name. */
    public static final String FLD_LOGPRIORIZACIONSOLLOGINFUNCIONARIO = "LoginFuncionario";    
    /** <code>LoginFuncionario</code> field length. */
    public static final int FLD_LOGPRIORIZACIONSOLLOGINFUNCIONARIOLENGTH = 50;
    /** <code>logPriorizacionSolLoginFuncionario</code> attribute field name. */
    public static final String ATTR_FIELD_LOGPRIORIZACIONSOLLOGINFUNCIONARIO = "logPriorizacionSolLoginFuncionario";
    // Field (EstadoSolicitud)
    /** <code>EstadoSolicitud</code> field name. */
    public static final String FLD_LOGPRIORIZACIONSOLESTADOSOLICITUD = "EstadoSolicitud";    
    /** <code>logPriorizacionSolEstadoSolicitud</code> attribute field name. */
    public static final String ATTR_FIELD_LOGPRIORIZACIONSOLESTADOSOLICITUD = "logPriorizacionSolEstadoSolicitud";
    // Field (EstadoDoc)
    /** <code>EstadoDoc</code> field name. */
    public static final String FLD_LOGPRIORIZACIONSOLESTADODOC = "EstadoDoc";    
    /** <code>logPriorizacionSolEstadoDoc</code> attribute field name. */
    public static final String ATTR_FIELD_LOGPRIORIZACIONSOLESTADODOC = "logPriorizacionSolEstadoDoc";
    // Field (Prioridad)
    /** <code>Prioridad</code> field name. */
    public static final String FLD_LOGPRIORIZACIONSOLPRIORIDAD = "Prioridad";    
    /** <code>logPriorizacionSolPrioridad</code> attribute field name. */
    public static final String ATTR_FIELD_LOGPRIORIZACIONSOLPRIORIDAD = "logPriorizacionSolPrioridad";

    // Component role (PriSolicitud)
    /** <code>PriSolicitud</code> role id. */
    public static final String ROLE_ID_PRISOLICITUD = "Agr_1586847940608995_Alias";
    /** <code>PriSolicitud</code> role name. */
    public static final String ROLE_NAME_PRISOLICITUD = "priSolicitud";
    /** <code>PriSolicitud</code> role alias. */
    public static final String ROLE_ALIAS_PRISOLICITUD = "PriSolicitud";

    /** <code>PriSolicitud</code> inverse role name. */
    public static final String ROLE_INVNAME_PRISOLICITUD = PriorizacionSolicitudesConstants.ROLE_NAME_LOGPRIORIZACIONSOL;
    /** <code>PriSolicitud</code> role facet sequence. */
    public static final String PATH_FACETS_PRISOLICITUD = "";
    /** <code>PriSolicitud</code> role target class. */
    public static final String ROLE_TARGET_PRISOLICITUD = PriorizacionSolicitudesConstants.CLASS_NAME;

    /** Agents allowed to navigate through PriSolicitud **/
    public static final String PRISOLICITUD_AGENTS = "Admin,SuperAdmin";


    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1586847547392173Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>logPriorizacionSolcrearpagrPriSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGPRIORIZACIONSOLCREARPAGRPRISOLICITUD = "p_agrPriSolicitud";
    /** <code>logPriorizacionSolcrearpagrPriSolicitud</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGPRIORIZACIONSOLCREARPAGRPRISOLICITUD = "Clas_1586847547392173Ser_1Arg_2_Alias";
    /** <code>logPriorizacionSolcrearpagrPriSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGPRIORIZACIONSOLCREARPAGRPRISOLICITUD = "PriSolicitud";
    /** <code>logPriorizacionSolcrearpatrEstadoSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGPRIORIZACIONSOLCREARPATRESTADOSOLICITUD = "p_atrEstadoSolicitud";
    /** <code>logPriorizacionSolcrearpatrEstadoSolicitud</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGPRIORIZACIONSOLCREARPATRESTADOSOLICITUD = "Clas_1586847547392173Ser_1Arg_3_Alias";
    /** <code>logPriorizacionSolcrearpatrEstadoSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGPRIORIZACIONSOLCREARPATRESTADOSOLICITUD = "Estado Solicitud";
    /** <code>logPriorizacionSolcrearpatrEstadoDoc</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGPRIORIZACIONSOLCREARPATRESTADODOC = "p_atrEstadoDoc";
    /** <code>logPriorizacionSolcrearpatrEstadoDoc</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGPRIORIZACIONSOLCREARPATRESTADODOC = "Clas_1586847547392173Ser_1Arg_4_Alias";
    /** <code>logPriorizacionSolcrearpatrEstadoDoc</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGPRIORIZACIONSOLCREARPATRESTADODOC = "Estado Documentación";
    /** <code>logPriorizacionSolcrearpatrPrioridad</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGPRIORIZACIONSOLCREARPATRPRIORIDAD = "p_atrPrioridad";
    /** <code>logPriorizacionSolcrearpatrPrioridad</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGPRIORIZACIONSOLCREARPATRPRIORIDAD = "Clas_1586847547392173Ser_1Arg_5_Alias";
    /** <code>logPriorizacionSolcrearpatrPrioridad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGPRIORIZACIONSOLCREARPATRPRIORIDAD = "Prioridad";
    /** <code>logPriorizacionSolcrearpatrLoginFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGPRIORIZACIONSOLCREARPATRLOGINFUNCIONARIO = "p_atrLoginFuncionario";
    /** <code>logPriorizacionSolcrearpatrLoginFuncionario</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGPRIORIZACIONSOLCREARPATRLOGINFUNCIONARIO = "Clas_1586847547392173Ser_1Arg_6_Alias";
    /** <code>logPriorizacionSolcrearpatrLoginFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGPRIORIZACIONSOLCREARPATRLOGINFUNCIONARIO = "Login";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1586847547392173Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>logPriorizacionSoleliminarpthisLogPriorizacionSol</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_LOGPRIORIZACIONSOLELIMINARPTHISLOGPRIORIZACIONSOL = "p_thisLogPriorizacionSol";
    /** <code>logPriorizacionSoleliminarpthisLogPriorizacionSol</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_LOGPRIORIZACIONSOLELIMINARPTHISLOGPRIORIZACIONSOL = "Clas_1586847547392173Ser_2Arg_1_Alias";
    /** <code>logPriorizacionSoleliminarpthisLogPriorizacionSol</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_LOGPRIORIZACIONSOLELIMINARPTHISLOGPRIORIZACIONSOL = "Histórico Priorización Solicitudes";
    // Service (InsPriorizacionSolicitudes)
    /** <code>InsPriorizacionSolicitudes</code> service id. */
    public static final String SERV_ID_INSPRIORIZACIONSOLICITUDES = "Clas_1586847547392173Ser_4_Alias";
    /** <code>InsPriorizacionSolicitudes</code> service name. */
    public static final String SERV_NAME_INSPRIORIZACIONSOLICITUDES = "InsPriorizacionSolicitudes";
    /** <code>InsPriorizacionSolicitudes</code> service alias. */
    public static final String SERV_ALIAS_INSPRIORIZACIONSOLICITUDES = "InsPriorizacionSolicitudes";
    /** Agents allowed to execute the service InsPriorizacionSolicitudes **/
    public static final String INSPRIORIZACIONSOLICITUDES_SRVAGENTS = "";
    // Inbound arguments
    /** <code>logPriorizacionSolInsPriorizacionSolicitudespthisLogPriorizacionSol</code> inbound argument name. */
    public static final String ARG_NAME_INSPRIORIZACIONSOLICITUDES_LOGPRIORIZACIONSOLINSPRIORIZACIONSOLICITUDESPTHISLOGPRIORIZACIONSOL = "p_thisLogPriorizacionSol";
    /** <code>logPriorizacionSolInsPriorizacionSolicitudespthisLogPriorizacionSol</code> inbound argument id. */
    public static final String ARG_ID_INSPRIORIZACIONSOLICITUDES_LOGPRIORIZACIONSOLINSPRIORIZACIONSOLICITUDESPTHISLOGPRIORIZACIONSOL = "Clas_1586847547392173Ser_4Arg_1_Alias";
    /** <code>logPriorizacionSolInsPriorizacionSolicitudespthisLogPriorizacionSol</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPRIORIZACIONSOLICITUDES_LOGPRIORIZACIONSOLINSPRIORIZACIONSOLICITUDESPTHISLOGPRIORIZACIONSOL = "LogPriorizacionSol";
    /** <code>logPriorizacionSolInsPriorizacionSolicitudespevcPriorizacionSolicitudes</code> inbound argument name. */
    public static final String ARG_NAME_INSPRIORIZACIONSOLICITUDES_LOGPRIORIZACIONSOLINSPRIORIZACIONSOLICITUDESPEVCPRIORIZACIONSOLICITUDES = "p_evcPriorizacionSolicitudes";
    /** <code>logPriorizacionSolInsPriorizacionSolicitudespevcPriorizacionSolicitudes</code> inbound argument id. */
    public static final String ARG_ID_INSPRIORIZACIONSOLICITUDES_LOGPRIORIZACIONSOLINSPRIORIZACIONSOLICITUDESPEVCPRIORIZACIONSOLICITUDES = "Clas_1586847547392173Ser_4Arg_2_Alias";
    /** <code>logPriorizacionSolInsPriorizacionSolicitudespevcPriorizacionSolicitudes</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPRIORIZACIONSOLICITUDES_LOGPRIORIZACIONSOLINSPRIORIZACIONSOLICITUDESPEVCPRIORIZACIONSOLICITUDES = "PriSolicitud";
    // Service (DelPriorizacionSolicitudes)
    /** <code>DelPriorizacionSolicitudes</code> service id. */
    public static final String SERV_ID_DELPRIORIZACIONSOLICITUDES = "Clas_1586847547392173Ser_5_Alias";
    /** <code>DelPriorizacionSolicitudes</code> service name. */
    public static final String SERV_NAME_DELPRIORIZACIONSOLICITUDES = "DelPriorizacionSolicitudes";
    /** <code>DelPriorizacionSolicitudes</code> service alias. */
    public static final String SERV_ALIAS_DELPRIORIZACIONSOLICITUDES = "DelPriorizacionSolicitudes";
    /** Agents allowed to execute the service DelPriorizacionSolicitudes **/
    public static final String DELPRIORIZACIONSOLICITUDES_SRVAGENTS = "";
    // Inbound arguments
    /** <code>logPriorizacionSolDelPriorizacionSolicitudespthisLogPriorizacionSol</code> inbound argument name. */
    public static final String ARG_NAME_DELPRIORIZACIONSOLICITUDES_LOGPRIORIZACIONSOLDELPRIORIZACIONSOLICITUDESPTHISLOGPRIORIZACIONSOL = "p_thisLogPriorizacionSol";
    /** <code>logPriorizacionSolDelPriorizacionSolicitudespthisLogPriorizacionSol</code> inbound argument id. */
    public static final String ARG_ID_DELPRIORIZACIONSOLICITUDES_LOGPRIORIZACIONSOLDELPRIORIZACIONSOLICITUDESPTHISLOGPRIORIZACIONSOL = "Clas_1586847547392173Ser_5Arg_1_Alias";
    /** <code>logPriorizacionSolDelPriorizacionSolicitudespthisLogPriorizacionSol</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPRIORIZACIONSOLICITUDES_LOGPRIORIZACIONSOLDELPRIORIZACIONSOLICITUDESPTHISLOGPRIORIZACIONSOL = "LogPriorizacionSol";
    /** <code>logPriorizacionSolDelPriorizacionSolicitudespevcPriorizacionSolicitudes</code> inbound argument name. */
    public static final String ARG_NAME_DELPRIORIZACIONSOLICITUDES_LOGPRIORIZACIONSOLDELPRIORIZACIONSOLICITUDESPEVCPRIORIZACIONSOLICITUDES = "p_evcPriorizacionSolicitudes";
    /** <code>logPriorizacionSolDelPriorizacionSolicitudespevcPriorizacionSolicitudes</code> inbound argument id. */
    public static final String ARG_ID_DELPRIORIZACIONSOLICITUDES_LOGPRIORIZACIONSOLDELPRIORIZACIONSOLICITUDESPEVCPRIORIZACIONSOLICITUDES = "Clas_1586847547392173Ser_5Arg_2_Alias";
    /** <code>logPriorizacionSolDelPriorizacionSolicitudespevcPriorizacionSolicitudes</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPRIORIZACIONSOLICITUDES_LOGPRIORIZACIONSOLDELPRIORIZACIONSOLICITUDESPEVCPRIORIZACIONSOLICITUDES = "PriSolicitud";
    // Service (TCREAR)
    /** <code>TCREAR</code> service id. */
    public static final String SERV_ID_TCREAR = "Clas_1586847547392173Ser_6_Alias";
    /** <code>TCREAR</code> service name. */
    public static final String SERV_NAME_TCREAR = "TCREAR";
    /** <code>TCREAR</code> service alias. */
    public static final String SERV_ALIAS_TCREAR = "TCREAR";
    /** Agents allowed to execute the service TCREAR **/
    public static final String TCREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>logPriorizacionSolTCREARptpagrPriorizacionSolicitude</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_LOGPRIORIZACIONSOLTCREARPTPAGRPRIORIZACIONSOLICITUDE = "pt_p_agrPriorizacionSolicitude";
    /** <code>logPriorizacionSolTCREARptpagrPriorizacionSolicitude</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_LOGPRIORIZACIONSOLTCREARPTPAGRPRIORIZACIONSOLICITUDE = "Clas_1586847547392173Ser_6Arg_3_Alias";
    /** <code>logPriorizacionSolTCREARptpagrPriorizacionSolicitude</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_LOGPRIORIZACIONSOLTCREARPTPAGRPRIORIZACIONSOLICITUDE = "PriorizacionSolicitudes";
    /** <code>logPriorizacionSolTCREARptpatrEstadoSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_LOGPRIORIZACIONSOLTCREARPTPATRESTADOSOLICITUD = "pt_p_atrEstadoSolicitud";
    /** <code>logPriorizacionSolTCREARptpatrEstadoSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_LOGPRIORIZACIONSOLTCREARPTPATRESTADOSOLICITUD = "Clas_1586847547392173Ser_6Arg_4_Alias";
    /** <code>logPriorizacionSolTCREARptpatrEstadoSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_LOGPRIORIZACIONSOLTCREARPTPATRESTADOSOLICITUD = "Estado Solicitud";
    /** <code>logPriorizacionSolTCREARptpatrEstadoDoc</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_LOGPRIORIZACIONSOLTCREARPTPATRESTADODOC = "pt_p_atrEstadoDoc";
    /** <code>logPriorizacionSolTCREARptpatrEstadoDoc</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_LOGPRIORIZACIONSOLTCREARPTPATRESTADODOC = "Clas_1586847547392173Ser_6Arg_5_Alias";
    /** <code>logPriorizacionSolTCREARptpatrEstadoDoc</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_LOGPRIORIZACIONSOLTCREARPTPATRESTADODOC = "Estado Documentación";
    /** <code>logPriorizacionSolTCREARptpatrPrioridad</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_LOGPRIORIZACIONSOLTCREARPTPATRPRIORIDAD = "pt_p_atrPrioridad";
    /** <code>logPriorizacionSolTCREARptpatrPrioridad</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_LOGPRIORIZACIONSOLTCREARPTPATRPRIORIDAD = "Clas_1586847547392173Ser_6Arg_6_Alias";
    /** <code>logPriorizacionSolTCREARptpatrPrioridad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_LOGPRIORIZACIONSOLTCREARPTPATRPRIORIDAD = "Prioridad";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_LOGPRIORIZACIONSOLFECHA.toUpperCase(), Constants.Type.DATETIME.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGPRIORIZACIONSOLLOGINFUNCIONARIO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGPRIORIZACIONSOLESTADOSOLICITUD.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGPRIORIZACIONSOLESTADODOC.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGPRIORIZACIONSOLPRIORIDAD.toUpperCase(), Constants.Type.NAT.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_LOGPRIORIZACIONSOLID.toUpperCase(), LOGPRIORIZACIONSOLID_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGPRIORIZACIONSOLFECHA.toUpperCase(), LOGPRIORIZACIONSOLFECHA_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGPRIORIZACIONSOLLOGINFUNCIONARIO.toUpperCase(), LOGPRIORIZACIONSOLLOGINFUNCIONARIO_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGPRIORIZACIONSOLESTADOSOLICITUD.toUpperCase(), LOGPRIORIZACIONSOLESTADOSOLICITUD_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGPRIORIZACIONSOLESTADODOC.toUpperCase(), LOGPRIORIZACIONSOLESTADODOC_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGPRIORIZACIONSOLPRIORIDAD.toUpperCase(), LOGPRIORIZACIONSOLPRIORIDAD_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_PRISOLICITUD.toUpperCase(), PRISOLICITUD_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'LogPriorizacionSol', it returns the identification keys
     * - If className is a facet of the inheritance net of 'LogPriorizacionSol', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_LOGPRIORIZACIONSOLID);
        }
        // Facet 'LogPriorizacionSol' (This facet)
        if (LogPriorizacionSolConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_LOGPRIORIZACIONSOLID);
        }
        return returnList;
    }
}
