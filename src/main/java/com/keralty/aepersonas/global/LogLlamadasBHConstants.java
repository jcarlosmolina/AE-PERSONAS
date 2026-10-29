package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>LogLlamadasBH</code> model class.
 */
public final class LogLlamadasBHConstants {

    private LogLlamadasBHConstants() {

    }

    // Class
    /** <code>LogLlamadasBH</code> class id. */
    public static final String CLASS_ID = "Clas_1641826746368463_Alias";
    /** <code>LogLlamadasBH</code> class name. */
    public static final String CLASS_NAME = "LogLlamadasBH";
    /** <code>LogLlamadasBH</code> class alias. */
    public static final String CLASS_ALIAS = "Llamada a BH";
    /** <code>LogLlamadasBH</code> class table name. */
    public static final String TBL_NAME = "LogLlamadasBH";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "logLlamadasBHID,logLlamadasBHTipoServicio,logLlamadasBHSolicitud,logLlamadasBHServicio,logLlamadasBHCapacidad,logLlamadasBHFechaHora,logLlamadasBHTiempoEjecucion,logLlamadasBHUsuario";

    public static final String DSDSLOGLLAMADASBH = "DS_LogLlamadasBH";
    public static final String DSDSLOGLLAMADASBHIIU = "DS_LogLlamadasBH_IIU";
    

    // Attribute (logLlamadasBHID)
    /** <code>logLlamadasBHID</code> attribute id. */
    public static final String ATTR_ID_LOGLLAMADASBHID = "Clas_1641826746368463Atr_1_Alias";
    /** <code>logLlamadasBHID</code> attribute name. */
    public static final String ATTR_NAME_LOGLLAMADASBHID = "logLlamadasBHID";
    /** <code>logLlamadasBHID</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGLLAMADASBHID = "Id.";

    /** <code>logLlamadasBHID</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGLLAMADASBHID = "";
    /** Agents allowed to view the attribute logLlamadasBHID **/
    public static final String LOGLLAMADASBHID_AGENTS = "Admin,SuperAdmin";
    // Attribute (logLlamadasBHTipoServicio)
    /** <code>logLlamadasBHTipoServicio</code> attribute id. */
    public static final String ATTR_ID_LOGLLAMADASBHTIPOSERVICIO = "Clas_1641826746368463Atr_2_Alias";
    /** <code>logLlamadasBHTipoServicio</code> attribute name. */
    public static final String ATTR_NAME_LOGLLAMADASBHTIPOSERVICIO = "logLlamadasBHTipoServicio";
    /** <code>logLlamadasBHTipoServicio</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGLLAMADASBHTIPOSERVICIO = "Tipo Servicio";

    /** <code>logLlamadasBHTipoServicio</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGLLAMADASBHTIPOSERVICIO = "";
    /** Agents allowed to view the attribute logLlamadasBHTipoServicio **/
    public static final String LOGLLAMADASBHTIPOSERVICIO_AGENTS = "Admin,SuperAdmin";
    // Attribute (logLlamadasBHSolicitud)
    /** <code>logLlamadasBHSolicitud</code> attribute id. */
    public static final String ATTR_ID_LOGLLAMADASBHSOLICITUD = "Clas_1641826746368463Atr_3_Alias";
    /** <code>logLlamadasBHSolicitud</code> attribute name. */
    public static final String ATTR_NAME_LOGLLAMADASBHSOLICITUD = "logLlamadasBHSolicitud";
    /** <code>logLlamadasBHSolicitud</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGLLAMADASBHSOLICITUD = "No. Radicación";

    /** <code>logLlamadasBHSolicitud</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGLLAMADASBHSOLICITUD = "";
    /** Agents allowed to view the attribute logLlamadasBHSolicitud **/
    public static final String LOGLLAMADASBHSOLICITUD_AGENTS = "Admin,SuperAdmin";
    // Attribute (logLlamadasBHServicio)
    /** <code>logLlamadasBHServicio</code> attribute id. */
    public static final String ATTR_ID_LOGLLAMADASBHSERVICIO = "Clas_1641826746368463Atr_4_Alias";
    /** <code>logLlamadasBHServicio</code> attribute name. */
    public static final String ATTR_NAME_LOGLLAMADASBHSERVICIO = "logLlamadasBHServicio";
    /** <code>logLlamadasBHServicio</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGLLAMADASBHSERVICIO = "Servicio";

    /** <code>logLlamadasBHServicio</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGLLAMADASBHSERVICIO = "";
    /** Agents allowed to view the attribute logLlamadasBHServicio **/
    public static final String LOGLLAMADASBHSERVICIO_AGENTS = "Admin,SuperAdmin";
    // Attribute (logLlamadasBHCapacidad)
    /** <code>logLlamadasBHCapacidad</code> attribute id. */
    public static final String ATTR_ID_LOGLLAMADASBHCAPACIDAD = "Clas_1641826746368463Atr_5_Alias";
    /** <code>logLlamadasBHCapacidad</code> attribute name. */
    public static final String ATTR_NAME_LOGLLAMADASBHCAPACIDAD = "logLlamadasBHCapacidad";
    /** <code>logLlamadasBHCapacidad</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGLLAMADASBHCAPACIDAD = "Capacidad";

    /** <code>logLlamadasBHCapacidad</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGLLAMADASBHCAPACIDAD = "";
    /** Agents allowed to view the attribute logLlamadasBHCapacidad **/
    public static final String LOGLLAMADASBHCAPACIDAD_AGENTS = "Admin,SuperAdmin";
    // Attribute (logLlamadasBHFechaHora)
    /** <code>logLlamadasBHFechaHora</code> attribute id. */
    public static final String ATTR_ID_LOGLLAMADASBHFECHAHORA = "Clas_1641826746368463Atr_6_Alias";
    /** <code>logLlamadasBHFechaHora</code> attribute name. */
    public static final String ATTR_NAME_LOGLLAMADASBHFECHAHORA = "logLlamadasBHFechaHora";
    /** <code>logLlamadasBHFechaHora</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGLLAMADASBHFECHAHORA = "Fecha";

    /** <code>logLlamadasBHFechaHora</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGLLAMADASBHFECHAHORA = "";
    /** Agents allowed to view the attribute logLlamadasBHFechaHora **/
    public static final String LOGLLAMADASBHFECHAHORA_AGENTS = "Admin,SuperAdmin";
    // Attribute (logLlamadasBHTextoError)
    /** <code>logLlamadasBHTextoError</code> attribute id. */
    public static final String ATTR_ID_LOGLLAMADASBHTEXTOERROR = "Clas_1641826746368463Atr_7_Alias";
    /** <code>logLlamadasBHTextoError</code> attribute name. */
    public static final String ATTR_NAME_LOGLLAMADASBHTEXTOERROR = "logLlamadasBHTextoError";
    /** <code>logLlamadasBHTextoError</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGLLAMADASBHTEXTOERROR = "Texto Error";

    /** <code>logLlamadasBHTextoError</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGLLAMADASBHTEXTOERROR = "";
    /** Agents allowed to view the attribute logLlamadasBHTextoError **/
    public static final String LOGLLAMADASBHTEXTOERROR_AGENTS = "Admin,SuperAdmin";
    // Attribute (logLlamadasBHTiempoEjecucion)
    /** <code>logLlamadasBHTiempoEjecucion</code> attribute id. */
    public static final String ATTR_ID_LOGLLAMADASBHTIEMPOEJECUCION = "Clas_1641826746368463Atr_8_Alias";
    /** <code>logLlamadasBHTiempoEjecucion</code> attribute name. */
    public static final String ATTR_NAME_LOGLLAMADASBHTIEMPOEJECUCION = "logLlamadasBHTiempoEjecucion";
    /** <code>logLlamadasBHTiempoEjecucion</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGLLAMADASBHTIEMPOEJECUCION = "Tiempo Ejecución";

    /** <code>logLlamadasBHTiempoEjecucion</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGLLAMADASBHTIEMPOEJECUCION = "";
    /** Agents allowed to view the attribute logLlamadasBHTiempoEjecucion **/
    public static final String LOGLLAMADASBHTIEMPOEJECUCION_AGENTS = "Admin,SuperAdmin";
    // Attribute (logLlamadasBHPeticion)
    /** <code>logLlamadasBHPeticion</code> attribute id. */
    public static final String ATTR_ID_LOGLLAMADASBHPETICION = "Clas_1641826746368463Atr_9_Alias";
    /** <code>logLlamadasBHPeticion</code> attribute name. */
    public static final String ATTR_NAME_LOGLLAMADASBHPETICION = "logLlamadasBHPeticion";
    /** <code>logLlamadasBHPeticion</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGLLAMADASBHPETICION = "Petición";

    /** <code>logLlamadasBHPeticion</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGLLAMADASBHPETICION = "";
    /** Agents allowed to view the attribute logLlamadasBHPeticion **/
    public static final String LOGLLAMADASBHPETICION_AGENTS = "Admin,SuperAdmin";
    // Attribute (logLlamadasBHRespuesta)
    /** <code>logLlamadasBHRespuesta</code> attribute id. */
    public static final String ATTR_ID_LOGLLAMADASBHRESPUESTA = "Clas_1641826746368463Atr_10_Alias";
    /** <code>logLlamadasBHRespuesta</code> attribute name. */
    public static final String ATTR_NAME_LOGLLAMADASBHRESPUESTA = "logLlamadasBHRespuesta";
    /** <code>logLlamadasBHRespuesta</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGLLAMADASBHRESPUESTA = "Respuesta";

    /** <code>logLlamadasBHRespuesta</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGLLAMADASBHRESPUESTA = "";
    /** Agents allowed to view the attribute logLlamadasBHRespuesta **/
    public static final String LOGLLAMADASBHRESPUESTA_AGENTS = "Admin,SuperAdmin";
    // Attribute (logLlamadasBHUsuario)
    /** <code>logLlamadasBHUsuario</code> attribute id. */
    public static final String ATTR_ID_LOGLLAMADASBHUSUARIO = "Clas_1641826746368463Atr_11_Alias";
    /** <code>logLlamadasBHUsuario</code> attribute name. */
    public static final String ATTR_NAME_LOGLLAMADASBHUSUARIO = "logLlamadasBHUsuario";
    /** <code>logLlamadasBHUsuario</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGLLAMADASBHUSUARIO = "Usuario";

    /** <code>logLlamadasBHUsuario</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGLLAMADASBHUSUARIO = "";
    /** Agents allowed to view the attribute logLlamadasBHUsuario **/
    public static final String LOGLLAMADASBHUSUARIO_AGENTS = "Admin,SuperAdmin";


    // Field (ID)
    /** <code>ID</code> field name. */
    public static final String FLD_LOGLLAMADASBHID = "ID";    
    /** <code>logLlamadasBHID</code> attribute field name. */
    public static final String ATTR_FIELD_LOGLLAMADASBHID = "logLlamadasBHID";
    // Field (TipoServicio)
    /** <code>TipoServicio</code> field name. */
    public static final String FLD_LOGLLAMADASBHTIPOSERVICIO = "TipoServicio";    
    /** <code>TipoServicio</code> field length. */
    public static final int FLD_LOGLLAMADASBHTIPOSERVICIOLENGTH = 20;
    /** <code>logLlamadasBHTipoServicio</code> attribute field name. */
    public static final String ATTR_FIELD_LOGLLAMADASBHTIPOSERVICIO = "logLlamadasBHTipoServicio";
    // Field (Solicitud)
    /** <code>Solicitud</code> field name. */
    public static final String FLD_LOGLLAMADASBHSOLICITUD = "Solicitud";    
    /** <code>Solicitud</code> field length. */
    public static final int FLD_LOGLLAMADASBHSOLICITUDLENGTH = 50;
    /** <code>logLlamadasBHSolicitud</code> attribute field name. */
    public static final String ATTR_FIELD_LOGLLAMADASBHSOLICITUD = "logLlamadasBHSolicitud";
    // Field (Servicio)
    /** <code>Servicio</code> field name. */
    public static final String FLD_LOGLLAMADASBHSERVICIO = "Servicio";    
    /** <code>Servicio</code> field length. */
    public static final int FLD_LOGLLAMADASBHSERVICIOLENGTH = 100;
    /** <code>logLlamadasBHServicio</code> attribute field name. */
    public static final String ATTR_FIELD_LOGLLAMADASBHSERVICIO = "logLlamadasBHServicio";
    // Field (Capacidad)
    /** <code>Capacidad</code> field name. */
    public static final String FLD_LOGLLAMADASBHCAPACIDAD = "Capacidad";    
    /** <code>Capacidad</code> field length. */
    public static final int FLD_LOGLLAMADASBHCAPACIDADLENGTH = 100;
    /** <code>logLlamadasBHCapacidad</code> attribute field name. */
    public static final String ATTR_FIELD_LOGLLAMADASBHCAPACIDAD = "logLlamadasBHCapacidad";
    // Field (FechaHora)
    /** <code>FechaHora</code> field name. */
    public static final String FLD_LOGLLAMADASBHFECHAHORA = "FechaHora";    
    /** <code>logLlamadasBHFechaHora</code> attribute field name. */
    public static final String ATTR_FIELD_LOGLLAMADASBHFECHAHORA = "logLlamadasBHFechaHora";
    // Field (TextoError)
    /** <code>TextoError</code> field name. */
    public static final String FLD_LOGLLAMADASBHTEXTOERROR = "TextoError";    
    /** <code>logLlamadasBHTextoError</code> attribute field name. */
    public static final String ATTR_FIELD_LOGLLAMADASBHTEXTOERROR = "logLlamadasBHTextoError";
    // Field (TiempoEjecucion)
    /** <code>TiempoEjecucion</code> field name. */
    public static final String FLD_LOGLLAMADASBHTIEMPOEJECUCION = "TiempoEjecucion";    
    /** <code>logLlamadasBHTiempoEjecucion</code> attribute field name. */
    public static final String ATTR_FIELD_LOGLLAMADASBHTIEMPOEJECUCION = "logLlamadasBHTiempoEjecucion";
    // Field (Peticion)
    /** <code>Peticion</code> field name. */
    public static final String FLD_LOGLLAMADASBHPETICION = "Peticion";    
    /** <code>logLlamadasBHPeticion</code> attribute field name. */
    public static final String ATTR_FIELD_LOGLLAMADASBHPETICION = "logLlamadasBHPeticion";
    // Field (Respuesta)
    /** <code>Respuesta</code> field name. */
    public static final String FLD_LOGLLAMADASBHRESPUESTA = "Respuesta";    
    /** <code>logLlamadasBHRespuesta</code> attribute field name. */
    public static final String ATTR_FIELD_LOGLLAMADASBHRESPUESTA = "logLlamadasBHRespuesta";
    // Field (Usuario)
    /** <code>Usuario</code> field name. */
    public static final String FLD_LOGLLAMADASBHUSUARIO = "Usuario";    
    /** <code>Usuario</code> field length. */
    public static final int FLD_LOGLLAMADASBHUSUARIOLENGTH = 50;
    /** <code>logLlamadasBHUsuario</code> attribute field name. */
    public static final String ATTR_FIELD_LOGLLAMADASBHUSUARIO = "logLlamadasBHUsuario";



    // Service (createinstance)
    /** <code>createinstance</code> service id. */
    public static final String SERV_ID_CREATEINSTANCE = "Clas_1641826746368463Ser_1_Alias";
    /** <code>createinstance</code> service name. */
    public static final String SERV_NAME_CREATEINSTANCE = "createinstance";
    /** <code>createinstance</code> service alias. */
    public static final String SERV_ALIAS_CREATEINSTANCE = "Crear";
    /** Agents allowed to execute the service createinstance **/
    public static final String CREATEINSTANCE_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,UsuarioSistemaExterno";
    // Inbound arguments
    /** <code>logLlamadasBHcreateinstancepatrFechaHora</code> inbound argument name. */
    public static final String ARG_NAME_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRFECHAHORA = "p_atrFechaHora";
    /** <code>logLlamadasBHcreateinstancepatrFechaHora</code> inbound argument id. */
    public static final String ARG_ID_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRFECHAHORA = "Clas_1641826746368463Ser_1Arg_1_Alias";
    /** <code>logLlamadasBHcreateinstancepatrFechaHora</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRFECHAHORA = "Fecha";
    /** <code>logLlamadasBHcreateinstancepatrUsuario</code> inbound argument name. */
    public static final String ARG_NAME_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRUSUARIO = "p_atrUsuario";
    /** <code>logLlamadasBHcreateinstancepatrUsuario</code> inbound argument id. */
    public static final String ARG_ID_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRUSUARIO = "Clas_1641826746368463Ser_1Arg_2_Alias";
    /** <code>logLlamadasBHcreateinstancepatrUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRUSUARIO = "Usuario";
    /** <code>logLlamadasBHcreateinstancepatrCapacidad</code> inbound argument name. */
    public static final String ARG_NAME_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRCAPACIDAD = "p_atrCapacidad";
    /** <code>logLlamadasBHcreateinstancepatrCapacidad</code> inbound argument id. */
    public static final String ARG_ID_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRCAPACIDAD = "Clas_1641826746368463Ser_1Arg_3_Alias";
    /** <code>logLlamadasBHcreateinstancepatrCapacidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRCAPACIDAD = "Capacidad";
    /** <code>logLlamadasBHcreateinstancepatrServicio</code> inbound argument name. */
    public static final String ARG_NAME_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRSERVICIO = "p_atrServicio";
    /** <code>logLlamadasBHcreateinstancepatrServicio</code> inbound argument id. */
    public static final String ARG_ID_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRSERVICIO = "Clas_1641826746368463Ser_1Arg_4_Alias";
    /** <code>logLlamadasBHcreateinstancepatrServicio</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRSERVICIO = "Servicio";
    /** <code>logLlamadasBHcreateinstancepatrSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRSOLICITUD = "p_atrSolicitud";
    /** <code>logLlamadasBHcreateinstancepatrSolicitud</code> inbound argument id. */
    public static final String ARG_ID_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRSOLICITUD = "Clas_1641826746368463Ser_1Arg_5_Alias";
    /** <code>logLlamadasBHcreateinstancepatrSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRSOLICITUD = "No. Radicación";
    /** <code>logLlamadasBHcreateinstancepatrPeticion</code> inbound argument name. */
    public static final String ARG_NAME_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRPETICION = "p_atrPeticion";
    /** <code>logLlamadasBHcreateinstancepatrPeticion</code> inbound argument id. */
    public static final String ARG_ID_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRPETICION = "Clas_1641826746368463Ser_1Arg_6_Alias";
    /** <code>logLlamadasBHcreateinstancepatrPeticion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRPETICION = "Petición";
    /** <code>logLlamadasBHcreateinstancepatrRespuesta</code> inbound argument name. */
    public static final String ARG_NAME_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRRESPUESTA = "p_atrRespuesta";
    /** <code>logLlamadasBHcreateinstancepatrRespuesta</code> inbound argument id. */
    public static final String ARG_ID_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRRESPUESTA = "Clas_1641826746368463Ser_1Arg_7_Alias";
    /** <code>logLlamadasBHcreateinstancepatrRespuesta</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRRESPUESTA = "Respuesta";
    /** <code>logLlamadasBHcreateinstancepatrTipoServicio</code> inbound argument name. */
    public static final String ARG_NAME_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRTIPOSERVICIO = "p_atrTipoServicio";
    /** <code>logLlamadasBHcreateinstancepatrTipoServicio</code> inbound argument id. */
    public static final String ARG_ID_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRTIPOSERVICIO = "Clas_1641826746368463Ser_1Arg_8_Alias";
    /** <code>logLlamadasBHcreateinstancepatrTipoServicio</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRTIPOSERVICIO = "Tipo Servicio";
    /** <code>logLlamadasBHcreateinstancepatrTiempoEjecucion</code> inbound argument name. */
    public static final String ARG_NAME_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRTIEMPOEJECUCION = "p_atrTiempoEjecucion";
    /** <code>logLlamadasBHcreateinstancepatrTiempoEjecucion</code> inbound argument id. */
    public static final String ARG_ID_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRTIEMPOEJECUCION = "Clas_1641826746368463Ser_1Arg_9_Alias";
    /** <code>logLlamadasBHcreateinstancepatrTiempoEjecucion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRTIEMPOEJECUCION = "Tiempo Ejecución";
    /** <code>logLlamadasBHcreateinstancepatrTextoError</code> inbound argument name. */
    public static final String ARG_NAME_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRTEXTOERROR = "p_atrTextoError";
    /** <code>logLlamadasBHcreateinstancepatrTextoError</code> inbound argument id. */
    public static final String ARG_ID_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRTEXTOERROR = "Clas_1641826746368463Ser_1Arg_10_Alias";
    /** <code>logLlamadasBHcreateinstancepatrTextoError</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREATEINSTANCE_LOGLLAMADASBHCREATEINSTANCEPATRTEXTOERROR = "Texto Error";
    // Service (deleteinstance)
    /** <code>deleteinstance</code> service id. */
    public static final String SERV_ID_DELETEINSTANCE = "Clas_1641826746368463Ser_2_Alias";
    /** <code>deleteinstance</code> service name. */
    public static final String SERV_NAME_DELETEINSTANCE = "deleteinstance";
    /** <code>deleteinstance</code> service alias. */
    public static final String SERV_ALIAS_DELETEINSTANCE = "Borrar";
    /** Agents allowed to execute the service deleteinstance **/
    public static final String DELETEINSTANCE_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>logLlamadasBHdeleteinstancepthisLogLlamadasBH</code> inbound argument name. */
    public static final String ARG_NAME_DELETEINSTANCE_LOGLLAMADASBHDELETEINSTANCEPTHISLOGLLAMADASBH = "p_thisLogLlamadasBH";
    /** <code>logLlamadasBHdeleteinstancepthisLogLlamadasBH</code> inbound argument id. */
    public static final String ARG_ID_DELETEINSTANCE_LOGLLAMADASBHDELETEINSTANCEPTHISLOGLLAMADASBH = "Clas_1641826746368463Ser_2Arg_1_Alias";
    /** <code>logLlamadasBHdeleteinstancepthisLogLlamadasBH</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELETEINSTANCE_LOGLLAMADASBHDELETEINSTANCEPTHISLOGLLAMADASBH = "Llamada a BH";

    public static final String FILTER_NAME_FLOGLLAMADASBH = "F_LogLlamadasBH";
    public static final String VAR_NAME_FLOGLLAMADASBH_VFTIPOSERVICIO = "vfTipoServicio";
    public static final String VAR_NAME_FLOGLLAMADASBH_VFSERVICIO = "vfServicio";
    public static final String VAR_NAME_FLOGLLAMADASBH_VFCAPA = "vfCapa";
    public static final String VAR_NAME_FLOGLLAMADASBH_VFDESDE = "vfDesde";
    public static final String VAR_NAME_FLOGLLAMADASBH_VFHASTA = "vfHasta";
    public static final String VAR_NAME_FLOGLLAMADASBH_VFNUMSOLICITUD = "vfNumSolicitud";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_LOGLLAMADASBHTIPOSERVICIO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGLLAMADASBHSOLICITUD.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGLLAMADASBHSERVICIO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGLLAMADASBHCAPACIDAD.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGLLAMADASBHFECHAHORA.toUpperCase(), Constants.Type.DATETIME.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGLLAMADASBHTEXTOERROR.toUpperCase(), Constants.Type.TEXT.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGLLAMADASBHTIEMPOEJECUCION.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGLLAMADASBHPETICION.toUpperCase(), Constants.Type.TEXT.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGLLAMADASBHRESPUESTA.toUpperCase(), Constants.Type.TEXT.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGLLAMADASBHUSUARIO.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_LOGLLAMADASBHID.toUpperCase(), LOGLLAMADASBHID_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGLLAMADASBHTIPOSERVICIO.toUpperCase(), LOGLLAMADASBHTIPOSERVICIO_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGLLAMADASBHSOLICITUD.toUpperCase(), LOGLLAMADASBHSOLICITUD_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGLLAMADASBHSERVICIO.toUpperCase(), LOGLLAMADASBHSERVICIO_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGLLAMADASBHCAPACIDAD.toUpperCase(), LOGLLAMADASBHCAPACIDAD_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGLLAMADASBHFECHAHORA.toUpperCase(), LOGLLAMADASBHFECHAHORA_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGLLAMADASBHTEXTOERROR.toUpperCase(), LOGLLAMADASBHTEXTOERROR_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGLLAMADASBHTIEMPOEJECUCION.toUpperCase(), LOGLLAMADASBHTIEMPOEJECUCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGLLAMADASBHPETICION.toUpperCase(), LOGLLAMADASBHPETICION_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGLLAMADASBHRESPUESTA.toUpperCase(), LOGLLAMADASBHRESPUESTA_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGLLAMADASBHUSUARIO.toUpperCase(), LOGLLAMADASBHUSUARIO_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'LogLlamadasBH', it returns the identification keys
     * - If className is a facet of the inheritance net of 'LogLlamadasBH', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_LOGLLAMADASBHID);
        }
        // Facet 'LogLlamadasBH' (This facet)
        if (LogLlamadasBHConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_LOGLLAMADASBHID);
        }
        return returnList;
    }
}
