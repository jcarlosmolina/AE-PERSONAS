package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>LogLlamadasAE</code> model class.
 */
public final class LogLlamadasAEConstants {

    private LogLlamadasAEConstants() {

    }

    // Class
    /** <code>LogLlamadasAE</code> class id. */
    public static final String CLASS_ID = "Clas_1641826746368185_Alias";
    /** <code>LogLlamadasAE</code> class name. */
    public static final String CLASS_NAME = "LogLlamadasAE";
    /** <code>LogLlamadasAE</code> class alias. */
    public static final String CLASS_ALIAS = "Llamada a BH";
    /** <code>LogLlamadasAE</code> class table name. */
    public static final String TBL_NAME = "LogLlamadasAE";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "logLlamadasAEID,logLlamadasAETipoServicio,logLlamadasAESolicitud,logLlamadasAEServicio,logLlamadasAECapacidad,logLlamadasAEFechaHora,logLlamadasAETiempoEjecucion";

    public static final String DSDSLOGLLAMADASAE = "DS_LogLlamadasAE";
    public static final String DSDSLOGLLAMADASAEIIU = "DS_LogLlamadasAE_IIU";
    

    // Attribute (logLlamadasAEID)
    /** <code>logLlamadasAEID</code> attribute id. */
    public static final String ATTR_ID_LOGLLAMADASAEID = "Clas_1641826746368185Atr_1_Alias";
    /** <code>logLlamadasAEID</code> attribute name. */
    public static final String ATTR_NAME_LOGLLAMADASAEID = "logLlamadasAEID";
    /** <code>logLlamadasAEID</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGLLAMADASAEID = "Id.";

    /** <code>logLlamadasAEID</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGLLAMADASAEID = "";
    /** Agents allowed to view the attribute logLlamadasAEID **/
    public static final String LOGLLAMADASAEID_AGENTS = "Admin,SuperAdmin";
    // Attribute (logLlamadasAETipoServicio)
    /** <code>logLlamadasAETipoServicio</code> attribute id. */
    public static final String ATTR_ID_LOGLLAMADASAETIPOSERVICIO = "Clas_1641826746368185Atr_2_Alias";
    /** <code>logLlamadasAETipoServicio</code> attribute name. */
    public static final String ATTR_NAME_LOGLLAMADASAETIPOSERVICIO = "logLlamadasAETipoServicio";
    /** <code>logLlamadasAETipoServicio</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGLLAMADASAETIPOSERVICIO = "Tipo Servicio";

    /** <code>logLlamadasAETipoServicio</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGLLAMADASAETIPOSERVICIO = "";
    /** Agents allowed to view the attribute logLlamadasAETipoServicio **/
    public static final String LOGLLAMADASAETIPOSERVICIO_AGENTS = "Admin,SuperAdmin";
    // Attribute (logLlamadasAESolicitud)
    /** <code>logLlamadasAESolicitud</code> attribute id. */
    public static final String ATTR_ID_LOGLLAMADASAESOLICITUD = "Clas_1641826746368185Atr_3_Alias";
    /** <code>logLlamadasAESolicitud</code> attribute name. */
    public static final String ATTR_NAME_LOGLLAMADASAESOLICITUD = "logLlamadasAESolicitud";
    /** <code>logLlamadasAESolicitud</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGLLAMADASAESOLICITUD = "No. Radicación";

    /** <code>logLlamadasAESolicitud</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGLLAMADASAESOLICITUD = "";
    /** Agents allowed to view the attribute logLlamadasAESolicitud **/
    public static final String LOGLLAMADASAESOLICITUD_AGENTS = "Admin,SuperAdmin";
    // Attribute (logLlamadasAEServicio)
    /** <code>logLlamadasAEServicio</code> attribute id. */
    public static final String ATTR_ID_LOGLLAMADASAESERVICIO = "Clas_1641826746368185Atr_4_Alias";
    /** <code>logLlamadasAEServicio</code> attribute name. */
    public static final String ATTR_NAME_LOGLLAMADASAESERVICIO = "logLlamadasAEServicio";
    /** <code>logLlamadasAEServicio</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGLLAMADASAESERVICIO = "Servicio";

    /** <code>logLlamadasAEServicio</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGLLAMADASAESERVICIO = "";
    /** Agents allowed to view the attribute logLlamadasAEServicio **/
    public static final String LOGLLAMADASAESERVICIO_AGENTS = "Admin,SuperAdmin";
    // Attribute (logLlamadasAECapacidad)
    /** <code>logLlamadasAECapacidad</code> attribute id. */
    public static final String ATTR_ID_LOGLLAMADASAECAPACIDAD = "Clas_1641826746368185Atr_5_Alias";
    /** <code>logLlamadasAECapacidad</code> attribute name. */
    public static final String ATTR_NAME_LOGLLAMADASAECAPACIDAD = "logLlamadasAECapacidad";
    /** <code>logLlamadasAECapacidad</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGLLAMADASAECAPACIDAD = "Capacidad";

    /** <code>logLlamadasAECapacidad</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGLLAMADASAECAPACIDAD = "";
    /** Agents allowed to view the attribute logLlamadasAECapacidad **/
    public static final String LOGLLAMADASAECAPACIDAD_AGENTS = "Admin,SuperAdmin";
    // Attribute (logLlamadasAEFechaHora)
    /** <code>logLlamadasAEFechaHora</code> attribute id. */
    public static final String ATTR_ID_LOGLLAMADASAEFECHAHORA = "Clas_1641826746368185Atr_6_Alias";
    /** <code>logLlamadasAEFechaHora</code> attribute name. */
    public static final String ATTR_NAME_LOGLLAMADASAEFECHAHORA = "logLlamadasAEFechaHora";
    /** <code>logLlamadasAEFechaHora</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGLLAMADASAEFECHAHORA = "Fecha";

    /** <code>logLlamadasAEFechaHora</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGLLAMADASAEFECHAHORA = "";
    /** Agents allowed to view the attribute logLlamadasAEFechaHora **/
    public static final String LOGLLAMADASAEFECHAHORA_AGENTS = "Admin,SuperAdmin";
    // Attribute (logLlamadasAETextoError)
    /** <code>logLlamadasAETextoError</code> attribute id. */
    public static final String ATTR_ID_LOGLLAMADASAETEXTOERROR = "Clas_1641826746368185Atr_7_Alias";
    /** <code>logLlamadasAETextoError</code> attribute name. */
    public static final String ATTR_NAME_LOGLLAMADASAETEXTOERROR = "logLlamadasAETextoError";
    /** <code>logLlamadasAETextoError</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGLLAMADASAETEXTOERROR = "Texto Error";

    /** <code>logLlamadasAETextoError</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGLLAMADASAETEXTOERROR = "";
    /** Agents allowed to view the attribute logLlamadasAETextoError **/
    public static final String LOGLLAMADASAETEXTOERROR_AGENTS = "Admin,SuperAdmin";
    // Attribute (logLlamadasAETiempoEjecucion)
    /** <code>logLlamadasAETiempoEjecucion</code> attribute id. */
    public static final String ATTR_ID_LOGLLAMADASAETIEMPOEJECUCION = "Clas_1641826746368185Atr_8_Alias";
    /** <code>logLlamadasAETiempoEjecucion</code> attribute name. */
    public static final String ATTR_NAME_LOGLLAMADASAETIEMPOEJECUCION = "logLlamadasAETiempoEjecucion";
    /** <code>logLlamadasAETiempoEjecucion</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGLLAMADASAETIEMPOEJECUCION = "Tiempo Ejecución";

    /** <code>logLlamadasAETiempoEjecucion</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGLLAMADASAETIEMPOEJECUCION = "";
    /** Agents allowed to view the attribute logLlamadasAETiempoEjecucion **/
    public static final String LOGLLAMADASAETIEMPOEJECUCION_AGENTS = "Admin,SuperAdmin";
    // Attribute (logLlamadasAEDatosRecibidos)
    /** <code>logLlamadasAEDatosRecibidos</code> attribute id. */
    public static final String ATTR_ID_LOGLLAMADASAEDATOSRECIBIDOS = "Clas_1641826746368185Atr_9_Alias";
    /** <code>logLlamadasAEDatosRecibidos</code> attribute name. */
    public static final String ATTR_NAME_LOGLLAMADASAEDATOSRECIBIDOS = "logLlamadasAEDatosRecibidos";
    /** <code>logLlamadasAEDatosRecibidos</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGLLAMADASAEDATOSRECIBIDOS = "Petición";

    /** <code>logLlamadasAEDatosRecibidos</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGLLAMADASAEDATOSRECIBIDOS = "";
    /** Agents allowed to view the attribute logLlamadasAEDatosRecibidos **/
    public static final String LOGLLAMADASAEDATOSRECIBIDOS_AGENTS = "Admin,SuperAdmin";
    // Attribute (logLlamadasAEDatosEnviados)
    /** <code>logLlamadasAEDatosEnviados</code> attribute id. */
    public static final String ATTR_ID_LOGLLAMADASAEDATOSENVIADOS = "Clas_1641826746368185Atr_10_Alias";
    /** <code>logLlamadasAEDatosEnviados</code> attribute name. */
    public static final String ATTR_NAME_LOGLLAMADASAEDATOSENVIADOS = "logLlamadasAEDatosEnviados";
    /** <code>logLlamadasAEDatosEnviados</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGLLAMADASAEDATOSENVIADOS = "Respuesta";

    /** <code>logLlamadasAEDatosEnviados</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGLLAMADASAEDATOSENVIADOS = "";
    /** Agents allowed to view the attribute logLlamadasAEDatosEnviados **/
    public static final String LOGLLAMADASAEDATOSENVIADOS_AGENTS = "Admin,SuperAdmin";


    // Field (ID)
    /** <code>ID</code> field name. */
    public static final String FLD_LOGLLAMADASAEID = "ID";    
    /** <code>logLlamadasAEID</code> attribute field name. */
    public static final String ATTR_FIELD_LOGLLAMADASAEID = "logLlamadasAEID";
    // Field (TipoServicio)
    /** <code>TipoServicio</code> field name. */
    public static final String FLD_LOGLLAMADASAETIPOSERVICIO = "TipoServicio";    
    /** <code>TipoServicio</code> field length. */
    public static final int FLD_LOGLLAMADASAETIPOSERVICIOLENGTH = 20;
    /** <code>logLlamadasAETipoServicio</code> attribute field name. */
    public static final String ATTR_FIELD_LOGLLAMADASAETIPOSERVICIO = "logLlamadasAETipoServicio";
    // Field (Solicitud)
    /** <code>Solicitud</code> field name. */
    public static final String FLD_LOGLLAMADASAESOLICITUD = "Solicitud";    
    /** <code>Solicitud</code> field length. */
    public static final int FLD_LOGLLAMADASAESOLICITUDLENGTH = 50;
    /** <code>logLlamadasAESolicitud</code> attribute field name. */
    public static final String ATTR_FIELD_LOGLLAMADASAESOLICITUD = "logLlamadasAESolicitud";
    // Field (Servicio)
    /** <code>Servicio</code> field name. */
    public static final String FLD_LOGLLAMADASAESERVICIO = "Servicio";    
    /** <code>Servicio</code> field length. */
    public static final int FLD_LOGLLAMADASAESERVICIOLENGTH = 100;
    /** <code>logLlamadasAEServicio</code> attribute field name. */
    public static final String ATTR_FIELD_LOGLLAMADASAESERVICIO = "logLlamadasAEServicio";
    // Field (Capacidad)
    /** <code>Capacidad</code> field name. */
    public static final String FLD_LOGLLAMADASAECAPACIDAD = "Capacidad";    
    /** <code>Capacidad</code> field length. */
    public static final int FLD_LOGLLAMADASAECAPACIDADLENGTH = 100;
    /** <code>logLlamadasAECapacidad</code> attribute field name. */
    public static final String ATTR_FIELD_LOGLLAMADASAECAPACIDAD = "logLlamadasAECapacidad";
    // Field (FechaHora)
    /** <code>FechaHora</code> field name. */
    public static final String FLD_LOGLLAMADASAEFECHAHORA = "FechaHora";    
    /** <code>logLlamadasAEFechaHora</code> attribute field name. */
    public static final String ATTR_FIELD_LOGLLAMADASAEFECHAHORA = "logLlamadasAEFechaHora";
    // Field (TextoError)
    /** <code>TextoError</code> field name. */
    public static final String FLD_LOGLLAMADASAETEXTOERROR = "TextoError";    
    /** <code>logLlamadasAETextoError</code> attribute field name. */
    public static final String ATTR_FIELD_LOGLLAMADASAETEXTOERROR = "logLlamadasAETextoError";
    // Field (TiempoEjecucion)
    /** <code>TiempoEjecucion</code> field name. */
    public static final String FLD_LOGLLAMADASAETIEMPOEJECUCION = "TiempoEjecucion";    
    /** <code>logLlamadasAETiempoEjecucion</code> attribute field name. */
    public static final String ATTR_FIELD_LOGLLAMADASAETIEMPOEJECUCION = "logLlamadasAETiempoEjecucion";
    // Field (DatosRecibidos)
    /** <code>DatosRecibidos</code> field name. */
    public static final String FLD_LOGLLAMADASAEDATOSRECIBIDOS = "DatosRecibidos";    
    /** <code>logLlamadasAEDatosRecibidos</code> attribute field name. */
    public static final String ATTR_FIELD_LOGLLAMADASAEDATOSRECIBIDOS = "logLlamadasAEDatosRecibidos";
    // Field (DatosEnviados)
    /** <code>DatosEnviados</code> field name. */
    public static final String FLD_LOGLLAMADASAEDATOSENVIADOS = "DatosEnviados";    
    /** <code>logLlamadasAEDatosEnviados</code> attribute field name. */
    public static final String ATTR_FIELD_LOGLLAMADASAEDATOSENVIADOS = "logLlamadasAEDatosEnviados";



    // Service (createinstance)
    /** <code>createinstance</code> service id. */
    public static final String SERV_ID_CREATEINSTANCE = "Clas_1641826746368185Ser_1_Alias";
    /** <code>createinstance</code> service name. */
    public static final String SERV_NAME_CREATEINSTANCE = "createinstance";
    /** <code>createinstance</code> service alias. */
    public static final String SERV_ALIAS_CREATEINSTANCE = "Crear";
    /** Agents allowed to execute the service createinstance **/
    public static final String CREATEINSTANCE_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,UsuarioSistemaExterno";
    // Inbound arguments
    /** <code>logLlamadasAEcreateinstancepatrFechaHora</code> inbound argument name. */
    public static final String ARG_NAME_CREATEINSTANCE_LOGLLAMADASAECREATEINSTANCEPATRFECHAHORA = "p_atrFechaHora";
    /** <code>logLlamadasAEcreateinstancepatrFechaHora</code> inbound argument id. */
    public static final String ARG_ID_CREATEINSTANCE_LOGLLAMADASAECREATEINSTANCEPATRFECHAHORA = "Clas_1641826746368185Ser_1Arg_1_Alias";
    /** <code>logLlamadasAEcreateinstancepatrFechaHora</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREATEINSTANCE_LOGLLAMADASAECREATEINSTANCEPATRFECHAHORA = "Fecha";
    /** <code>logLlamadasAEcreateinstancepatrCapacidad</code> inbound argument name. */
    public static final String ARG_NAME_CREATEINSTANCE_LOGLLAMADASAECREATEINSTANCEPATRCAPACIDAD = "p_atrCapacidad";
    /** <code>logLlamadasAEcreateinstancepatrCapacidad</code> inbound argument id. */
    public static final String ARG_ID_CREATEINSTANCE_LOGLLAMADASAECREATEINSTANCEPATRCAPACIDAD = "Clas_1641826746368185Ser_1Arg_2_Alias";
    /** <code>logLlamadasAEcreateinstancepatrCapacidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREATEINSTANCE_LOGLLAMADASAECREATEINSTANCEPATRCAPACIDAD = "Capacidad";
    /** <code>logLlamadasAEcreateinstancepatrServicio</code> inbound argument name. */
    public static final String ARG_NAME_CREATEINSTANCE_LOGLLAMADASAECREATEINSTANCEPATRSERVICIO = "p_atrServicio";
    /** <code>logLlamadasAEcreateinstancepatrServicio</code> inbound argument id. */
    public static final String ARG_ID_CREATEINSTANCE_LOGLLAMADASAECREATEINSTANCEPATRSERVICIO = "Clas_1641826746368185Ser_1Arg_3_Alias";
    /** <code>logLlamadasAEcreateinstancepatrServicio</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREATEINSTANCE_LOGLLAMADASAECREATEINSTANCEPATRSERVICIO = "Servicio";
    /** <code>logLlamadasAEcreateinstancepatrSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_CREATEINSTANCE_LOGLLAMADASAECREATEINSTANCEPATRSOLICITUD = "p_atrSolicitud";
    /** <code>logLlamadasAEcreateinstancepatrSolicitud</code> inbound argument id. */
    public static final String ARG_ID_CREATEINSTANCE_LOGLLAMADASAECREATEINSTANCEPATRSOLICITUD = "Clas_1641826746368185Ser_1Arg_4_Alias";
    /** <code>logLlamadasAEcreateinstancepatrSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREATEINSTANCE_LOGLLAMADASAECREATEINSTANCEPATRSOLICITUD = "No. Radicación";
    /** <code>logLlamadasAEcreateinstancepatrDatosRecibidos</code> inbound argument name. */
    public static final String ARG_NAME_CREATEINSTANCE_LOGLLAMADASAECREATEINSTANCEPATRDATOSRECIBIDOS = "p_atrDatosRecibidos";
    /** <code>logLlamadasAEcreateinstancepatrDatosRecibidos</code> inbound argument id. */
    public static final String ARG_ID_CREATEINSTANCE_LOGLLAMADASAECREATEINSTANCEPATRDATOSRECIBIDOS = "Clas_1641826746368185Ser_1Arg_5_Alias";
    /** <code>logLlamadasAEcreateinstancepatrDatosRecibidos</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREATEINSTANCE_LOGLLAMADASAECREATEINSTANCEPATRDATOSRECIBIDOS = "Petición";
    /** <code>logLlamadasAEcreateinstancepatrDatosEnviados</code> inbound argument name. */
    public static final String ARG_NAME_CREATEINSTANCE_LOGLLAMADASAECREATEINSTANCEPATRDATOSENVIADOS = "p_atrDatosEnviados";
    /** <code>logLlamadasAEcreateinstancepatrDatosEnviados</code> inbound argument id. */
    public static final String ARG_ID_CREATEINSTANCE_LOGLLAMADASAECREATEINSTANCEPATRDATOSENVIADOS = "Clas_1641826746368185Ser_1Arg_6_Alias";
    /** <code>logLlamadasAEcreateinstancepatrDatosEnviados</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREATEINSTANCE_LOGLLAMADASAECREATEINSTANCEPATRDATOSENVIADOS = "Respuesta";
    /** <code>logLlamadasAEcreateinstancepatrTipoServicio</code> inbound argument name. */
    public static final String ARG_NAME_CREATEINSTANCE_LOGLLAMADASAECREATEINSTANCEPATRTIPOSERVICIO = "p_atrTipoServicio";
    /** <code>logLlamadasAEcreateinstancepatrTipoServicio</code> inbound argument id. */
    public static final String ARG_ID_CREATEINSTANCE_LOGLLAMADASAECREATEINSTANCEPATRTIPOSERVICIO = "Clas_1641826746368185Ser_1Arg_7_Alias";
    /** <code>logLlamadasAEcreateinstancepatrTipoServicio</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREATEINSTANCE_LOGLLAMADASAECREATEINSTANCEPATRTIPOSERVICIO = "Tipo Servicio";
    /** <code>logLlamadasAEcreateinstancepatrTiempoEjecucion</code> inbound argument name. */
    public static final String ARG_NAME_CREATEINSTANCE_LOGLLAMADASAECREATEINSTANCEPATRTIEMPOEJECUCION = "p_atrTiempoEjecucion";
    /** <code>logLlamadasAEcreateinstancepatrTiempoEjecucion</code> inbound argument id. */
    public static final String ARG_ID_CREATEINSTANCE_LOGLLAMADASAECREATEINSTANCEPATRTIEMPOEJECUCION = "Clas_1641826746368185Ser_1Arg_8_Alias";
    /** <code>logLlamadasAEcreateinstancepatrTiempoEjecucion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREATEINSTANCE_LOGLLAMADASAECREATEINSTANCEPATRTIEMPOEJECUCION = "Tiempo Ejecución";
    /** <code>logLlamadasAEcreateinstancepatrTextoError</code> inbound argument name. */
    public static final String ARG_NAME_CREATEINSTANCE_LOGLLAMADASAECREATEINSTANCEPATRTEXTOERROR = "p_atrTextoError";
    /** <code>logLlamadasAEcreateinstancepatrTextoError</code> inbound argument id. */
    public static final String ARG_ID_CREATEINSTANCE_LOGLLAMADASAECREATEINSTANCEPATRTEXTOERROR = "Clas_1641826746368185Ser_1Arg_9_Alias";
    /** <code>logLlamadasAEcreateinstancepatrTextoError</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREATEINSTANCE_LOGLLAMADASAECREATEINSTANCEPATRTEXTOERROR = "Texto Error";
    // Service (deleteinstance)
    /** <code>deleteinstance</code> service id. */
    public static final String SERV_ID_DELETEINSTANCE = "Clas_1641826746368185Ser_2_Alias";
    /** <code>deleteinstance</code> service name. */
    public static final String SERV_NAME_DELETEINSTANCE = "deleteinstance";
    /** <code>deleteinstance</code> service alias. */
    public static final String SERV_ALIAS_DELETEINSTANCE = "Borrar";
    /** Agents allowed to execute the service deleteinstance **/
    public static final String DELETEINSTANCE_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>logLlamadasAEdeleteinstancepthisLogLlamadasAE</code> inbound argument name. */
    public static final String ARG_NAME_DELETEINSTANCE_LOGLLAMADASAEDELETEINSTANCEPTHISLOGLLAMADASAE = "p_thisLogLlamadasAE";
    /** <code>logLlamadasAEdeleteinstancepthisLogLlamadasAE</code> inbound argument id. */
    public static final String ARG_ID_DELETEINSTANCE_LOGLLAMADASAEDELETEINSTANCEPTHISLOGLLAMADASAE = "Clas_1641826746368185Ser_2Arg_1_Alias";
    /** <code>logLlamadasAEdeleteinstancepthisLogLlamadasAE</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELETEINSTANCE_LOGLLAMADASAEDELETEINSTANCEPTHISLOGLLAMADASAE = "Llamada a BH";

    public static final String FILTER_NAME_FLOGLLAMADASAE = "F_LogLlamadasAE";
    public static final String VAR_NAME_FLOGLLAMADASAE_VFTIPOSERVICIO = "vfTipoServicio";
    public static final String VAR_NAME_FLOGLLAMADASAE_VFSERVICIO = "vfServicio";
    public static final String VAR_NAME_FLOGLLAMADASAE_VFCAPA = "vfCapa";
    public static final String VAR_NAME_FLOGLLAMADASAE_VFDESDE = "vfDesde";
    public static final String VAR_NAME_FLOGLLAMADASAE_VFHASTA = "vfHasta";
    public static final String VAR_NAME_FLOGLLAMADASAE_VFNUMSOLICITUD = "vfNumSolicitud";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_LOGLLAMADASAETIPOSERVICIO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGLLAMADASAESOLICITUD.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGLLAMADASAESERVICIO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGLLAMADASAECAPACIDAD.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGLLAMADASAEFECHAHORA.toUpperCase(), Constants.Type.DATETIME.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGLLAMADASAETEXTOERROR.toUpperCase(), Constants.Type.TEXT.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGLLAMADASAETIEMPOEJECUCION.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGLLAMADASAEDATOSRECIBIDOS.toUpperCase(), Constants.Type.TEXT.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGLLAMADASAEDATOSENVIADOS.toUpperCase(), Constants.Type.TEXT.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_LOGLLAMADASAEID.toUpperCase(), LOGLLAMADASAEID_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGLLAMADASAETIPOSERVICIO.toUpperCase(), LOGLLAMADASAETIPOSERVICIO_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGLLAMADASAESOLICITUD.toUpperCase(), LOGLLAMADASAESOLICITUD_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGLLAMADASAESERVICIO.toUpperCase(), LOGLLAMADASAESERVICIO_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGLLAMADASAECAPACIDAD.toUpperCase(), LOGLLAMADASAECAPACIDAD_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGLLAMADASAEFECHAHORA.toUpperCase(), LOGLLAMADASAEFECHAHORA_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGLLAMADASAETEXTOERROR.toUpperCase(), LOGLLAMADASAETEXTOERROR_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGLLAMADASAETIEMPOEJECUCION.toUpperCase(), LOGLLAMADASAETIEMPOEJECUCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGLLAMADASAEDATOSRECIBIDOS.toUpperCase(), LOGLLAMADASAEDATOSRECIBIDOS_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGLLAMADASAEDATOSENVIADOS.toUpperCase(), LOGLLAMADASAEDATOSENVIADOS_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'LogLlamadasAE', it returns the identification keys
     * - If className is a facet of the inheritance net of 'LogLlamadasAE', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_LOGLLAMADASAEID);
        }
        // Facet 'LogLlamadasAE' (This facet)
        if (LogLlamadasAEConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_LOGLLAMADASAEID);
        }
        return returnList;
    }
}
