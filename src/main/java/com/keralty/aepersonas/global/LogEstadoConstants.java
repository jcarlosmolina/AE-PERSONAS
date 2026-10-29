package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>LogEstado</code> model class.
 */
public final class LogEstadoConstants {

    private LogEstadoConstants() {

    }

    // Class
    /** <code>LogEstado</code> class id. */
    public static final String CLASS_ID = "Clas_1497625133056309_Alias";
    /** <code>LogEstado</code> class name. */
    public static final String CLASS_NAME = "LogEstado";
    /** <code>LogEstado</code> class alias. */
    public static final String CLASS_ALIAS = "Historico Estados";
    /** <code>LogEstado</code> class table name. */
    public static final String TBL_NAME = "LogEstado";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "logEstadoId,aesolicitudesidsolicitud,logEstadoFecha,logEstadoLoginFuncionario,logEstadoObservacion,logEstadoMotDevolucion,logEstadoEstado,logEstadoEstadoDoc";

    public static final String DSDSLOGESTADO = "DS_LogEstado";
    

    // Attribute (logEstadoId)
    /** <code>logEstadoId</code> attribute id. */
    public static final String ATTR_ID_LOGESTADOID = "Clas_1497625133056309Atr_1_Alias";
    /** <code>logEstadoId</code> attribute name. */
    public static final String ATTR_NAME_LOGESTADOID = "logEstadoId";
    /** <code>logEstadoId</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGESTADOID = "Id.";

    /** <code>logEstadoId</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGESTADOID = "";
    /** Agents allowed to view the attribute logEstadoId **/
    public static final String LOGESTADOID_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (logEstadoFecha)
    /** <code>logEstadoFecha</code> attribute id. */
    public static final String ATTR_ID_LOGESTADOFECHA = "Clas_1497625133056309Atr_3_Alias";
    /** <code>logEstadoFecha</code> attribute name. */
    public static final String ATTR_NAME_LOGESTADOFECHA = "logEstadoFecha";
    /** <code>logEstadoFecha</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGESTADOFECHA = "Fecha";

    /** <code>logEstadoFecha</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGESTADOFECHA = "";
    /** Agents allowed to view the attribute logEstadoFecha **/
    public static final String LOGESTADOFECHA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (logEstadoLoginFuncionario)
    /** <code>logEstadoLoginFuncionario</code> attribute id. */
    public static final String ATTR_ID_LOGESTADOLOGINFUNCIONARIO = "Clas_1497625133056309Atr_2_Alias";
    /** <code>logEstadoLoginFuncionario</code> attribute name. */
    public static final String ATTR_NAME_LOGESTADOLOGINFUNCIONARIO = "logEstadoLoginFuncionario";
    /** <code>logEstadoLoginFuncionario</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGESTADOLOGINFUNCIONARIO = "Funcionario";

    /** <code>logEstadoLoginFuncionario</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGESTADOLOGINFUNCIONARIO = "";
    /** Agents allowed to view the attribute logEstadoLoginFuncionario **/
    public static final String LOGESTADOLOGINFUNCIONARIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (logEstadoObservacion)
    /** <code>logEstadoObservacion</code> attribute id. */
    public static final String ATTR_ID_LOGESTADOOBSERVACION = "Clas_1497625133056309Atr_4_Alias";
    /** <code>logEstadoObservacion</code> attribute name. */
    public static final String ATTR_NAME_LOGESTADOOBSERVACION = "logEstadoObservacion";
    /** <code>logEstadoObservacion</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGESTADOOBSERVACION = "Observaciones";

    /** <code>logEstadoObservacion</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGESTADOOBSERVACION = "";
    /** Agents allowed to view the attribute logEstadoObservacion **/
    public static final String LOGESTADOOBSERVACION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (logEstadoMotDevolucion)
    /** <code>logEstadoMotDevolucion</code> attribute id. */
    public static final String ATTR_ID_LOGESTADOMOTDEVOLUCION = "Clas_1497625133056309Atr_5_Alias";
    /** <code>logEstadoMotDevolucion</code> attribute name. */
    public static final String ATTR_NAME_LOGESTADOMOTDEVOLUCION = "logEstadoMotDevolucion";
    /** <code>logEstadoMotDevolucion</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGESTADOMOTDEVOLUCION = "Motivo devolución";

    /** <code>logEstadoMotDevolucion</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGESTADOMOTDEVOLUCION = "";
    /** Agents allowed to view the attribute logEstadoMotDevolucion **/
    public static final String LOGESTADOMOTDEVOLUCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (logEstadoEstado)
    /** <code>logEstadoEstado</code> attribute id. */
    public static final String ATTR_ID_LOGESTADOESTADO = "Clas_1497625133056309Atr_6_Alias";
    /** <code>logEstadoEstado</code> attribute name. */
    public static final String ATTR_NAME_LOGESTADOESTADO = "logEstadoEstado";
    /** <code>logEstadoEstado</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGESTADOESTADO = "Estado";

    /** <code>logEstadoEstado</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGESTADOESTADO = "";
    /** Agents allowed to view the attribute logEstadoEstado **/
    public static final String LOGESTADOESTADO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (logEstadoEstadoDoc)
    /** <code>logEstadoEstadoDoc</code> attribute id. */
    public static final String ATTR_ID_LOGESTADOESTADODOC = "Clas_1497625133056309Atr_7_Alias";
    /** <code>logEstadoEstadoDoc</code> attribute name. */
    public static final String ATTR_NAME_LOGESTADOESTADODOC = "logEstadoEstadoDoc";
    /** <code>logEstadoEstadoDoc</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGESTADOESTADODOC = "Estado Documentación";

    /** <code>logEstadoEstadoDoc</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGESTADOESTADODOC = "";
    /** Agents allowed to view the attribute logEstadoEstadoDoc **/
    public static final String LOGESTADOESTADODOC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Id)
    /** <code>Id</code> field name. */
    public static final String FLD_LOGESTADOID = "Id";    
    /** <code>logEstadoId</code> attribute field name. */
    public static final String ATTR_FIELD_LOGESTADOID = "logEstadoId";
    // Field (id_solicitud)
    /** <code>id_solicitud</code> field name. */
    public static final String FLD_AESOLICITUDESIDSOLICITUD = "id_solicitud";    
    /** <code>Solicitud.Ae_solicitudes.aesolicitudesidsolicitud</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUD_AE_SOLICITUDES_AESOLICITUDESIDSOLICITUD = "aesolicitudesidsolicitud";
    // Field (Fecha)
    /** <code>Fecha</code> field name. */
    public static final String FLD_LOGESTADOFECHA = "Fecha";    
    /** <code>logEstadoFecha</code> attribute field name. */
    public static final String ATTR_FIELD_LOGESTADOFECHA = "logEstadoFecha";
    // Field (LoginFuncionario)
    /** <code>LoginFuncionario</code> field name. */
    public static final String FLD_LOGESTADOLOGINFUNCIONARIO = "LoginFuncionario";    
    /** <code>LoginFuncionario</code> field length. */
    public static final int FLD_LOGESTADOLOGINFUNCIONARIOLENGTH = 50;
    /** <code>logEstadoLoginFuncionario</code> attribute field name. */
    public static final String ATTR_FIELD_LOGESTADOLOGINFUNCIONARIO = "logEstadoLoginFuncionario";
    // Field (Observacion)
    /** <code>Observacion</code> field name. */
    public static final String FLD_LOGESTADOOBSERVACION = "Observacion";    
    /** <code>Observacion</code> field length. */
    public static final int FLD_LOGESTADOOBSERVACIONLENGTH = 255;
    /** <code>logEstadoObservacion</code> attribute field name. */
    public static final String ATTR_FIELD_LOGESTADOOBSERVACION = "logEstadoObservacion";
    // Field (MotDevolucion)
    /** <code>MotDevolucion</code> field name. */
    public static final String FLD_LOGESTADOMOTDEVOLUCION = "MotDevolucion";    
    /** <code>MotDevolucion</code> field length. */
    public static final int FLD_LOGESTADOMOTDEVOLUCIONLENGTH = 50;
    /** <code>logEstadoMotDevolucion</code> attribute field name. */
    public static final String ATTR_FIELD_LOGESTADOMOTDEVOLUCION = "logEstadoMotDevolucion";
    // Field (Estado)
    /** <code>Estado</code> field name. */
    public static final String FLD_LOGESTADOESTADO = "Estado";    
    /** <code>logEstadoEstado</code> attribute field name. */
    public static final String ATTR_FIELD_LOGESTADOESTADO = "logEstadoEstado";
    // Field (EstadoDoc)
    /** <code>EstadoDoc</code> field name. */
    public static final String FLD_LOGESTADOESTADODOC = "EstadoDoc";    
    /** <code>logEstadoEstadoDoc</code> attribute field name. */
    public static final String ATTR_FIELD_LOGESTADOESTADODOC = "logEstadoEstadoDoc";

    // Component role (Solicitud)
    /** <code>Solicitud</code> role id. */
    public static final String ROLE_ID_SOLICITUD = "Agr_1497625264128168_Alias";
    /** <code>Solicitud</code> role name. */
    public static final String ROLE_NAME_SOLICITUD = "solicitud";
    /** <code>Solicitud</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUD = "Solicitud";

    /** <code>Solicitud</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUD = SolicitudConstants.ROLE_NAME_LOGESTADO;
    /** <code>Solicitud</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUD = "";
    /** <code>Solicitud</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUD = SolicitudConstants.CLASS_NAME;

    /** Agents allowed to navigate through Solicitud **/
    public static final String SOLICITUD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1497625133056309Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>logEstadocrearpagrSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGESTADOCREARPAGRSOLICITUD = "p_agrSolicitud";
    /** <code>logEstadocrearpagrSolicitud</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGESTADOCREARPAGRSOLICITUD = "Clas_1497625133056309Ser_1Arg_13_Alias";
    /** <code>logEstadocrearpagrSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGESTADOCREARPAGRSOLICITUD = "Solicitud";
    /** <code>logEstadocrearpatrLoginFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGESTADOCREARPATRLOGINFUNCIONARIO = "p_atrLoginFuncionario";
    /** <code>logEstadocrearpatrLoginFuncionario</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGESTADOCREARPATRLOGINFUNCIONARIO = "Clas_1497625133056309Ser_1Arg_3_Alias";
    /** <code>logEstadocrearpatrLoginFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGESTADOCREARPATRLOGINFUNCIONARIO = "Funcionario";
    /** <code>logEstadocrearpatrObservacion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGESTADOCREARPATROBSERVACION = "p_atrObservacion";
    /** <code>logEstadocrearpatrObservacion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGESTADOCREARPATROBSERVACION = "Clas_1497625133056309Ser_1Arg_4_Alias";
    /** <code>logEstadocrearpatrObservacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGESTADOCREARPATROBSERVACION = "Observaciones";
    /** <code>logEstadocrearpatrMotDevolucion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGESTADOCREARPATRMOTDEVOLUCION = "p_atrMotDevolucion";
    /** <code>logEstadocrearpatrMotDevolucion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGESTADOCREARPATRMOTDEVOLUCION = "Clas_1497625133056309Ser_1Arg_6_Alias";
    /** <code>logEstadocrearpatrMotDevolucion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGESTADOCREARPATRMOTDEVOLUCION = "Motivo devolución";
    /** <code>logEstadocrearpatrEstado</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGESTADOCREARPATRESTADO = "p_atrEstado";
    /** <code>logEstadocrearpatrEstado</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGESTADOCREARPATRESTADO = "Clas_1497625133056309Ser_1Arg_7_Alias";
    /** <code>logEstadocrearpatrEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGESTADOCREARPATRESTADO = "Estado";
    /** <code>logEstadocrearpatrEstadoDoc</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGESTADOCREARPATRESTADODOC = "p_atrEstadoDoc";
    /** <code>logEstadocrearpatrEstadoDoc</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGESTADOCREARPATRESTADODOC = "Clas_1497625133056309Ser_1Arg_14_Alias";
    /** <code>logEstadocrearpatrEstadoDoc</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGESTADOCREARPATRESTADODOC = "Estado Documentación";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1497625133056309Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>logEstadoeliminarpthisLogEstado</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_LOGESTADOELIMINARPTHISLOGESTADO = "p_thisLogEstado";
    /** <code>logEstadoeliminarpthisLogEstado</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_LOGESTADOELIMINARPTHISLOGESTADO = "Clas_1497625133056309Ser_2Arg_1_Alias";
    /** <code>logEstadoeliminarpthisLogEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_LOGESTADOELIMINARPTHISLOGESTADO = "Historico Estados";
    // Service (TCREAR)
    /** <code>TCREAR</code> service id. */
    public static final String SERV_ID_TCREAR = "Clas_1497625133056309Ser_4_Alias";
    /** <code>TCREAR</code> service name. */
    public static final String SERV_NAME_TCREAR = "TCREAR";
    /** <code>TCREAR</code> service alias. */
    public static final String SERV_ALIAS_TCREAR = "TCREAR";
    /** Agents allowed to execute the service TCREAR **/
    public static final String TCREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>logEstadoTCREARptpagrSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_LOGESTADOTCREARPTPAGRSOLICITUD = "pt_p_agrSolicitud";
    /** <code>logEstadoTCREARptpagrSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_LOGESTADOTCREARPTPAGRSOLICITUD = "Clas_1497625133056309Ser_4Arg_3_Alias";
    /** <code>logEstadoTCREARptpagrSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_LOGESTADOTCREARPTPAGRSOLICITUD = "Solicitud";
    /** <code>logEstadoTCREARptpatrObservacion</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_LOGESTADOTCREARPTPATROBSERVACION = "pt_p_atrObservacion";
    /** <code>logEstadoTCREARptpatrObservacion</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_LOGESTADOTCREARPTPATROBSERVACION = "Clas_1497625133056309Ser_4Arg_5_Alias";
    /** <code>logEstadoTCREARptpatrObservacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_LOGESTADOTCREARPTPATROBSERVACION = "Observaciones";
    /** <code>logEstadoTCREARptpatrMotDevolucion</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_LOGESTADOTCREARPTPATRMOTDEVOLUCION = "pt_p_atrMotDevolucion";
    /** <code>logEstadoTCREARptpatrMotDevolucion</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_LOGESTADOTCREARPTPATRMOTDEVOLUCION = "Clas_1497625133056309Ser_4Arg_6_Alias";
    /** <code>logEstadoTCREARptpatrMotDevolucion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_LOGESTADOTCREARPTPATRMOTDEVOLUCION = "Motivo devolución";
    /** <code>logEstadoTCREARptpatrEstado</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_LOGESTADOTCREARPTPATRESTADO = "pt_p_atrEstado";
    /** <code>logEstadoTCREARptpatrEstado</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_LOGESTADOTCREARPTPATRESTADO = "Clas_1497625133056309Ser_4Arg_7_Alias";
    /** <code>logEstadoTCREARptpatrEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_LOGESTADOTCREARPTPATRESTADO = "Estado";
    /** <code>logEstadoTCREARptpatrEstadoDoc</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_LOGESTADOTCREARPTPATRESTADODOC = "pt_p_atrEstadoDoc";
    /** <code>logEstadoTCREARptpatrEstadoDoc</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_LOGESTADOTCREARPTPATRESTADODOC = "Clas_1497625133056309Ser_4Arg_8_Alias";
    /** <code>logEstadoTCREARptpatrEstadoDoc</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_LOGESTADOTCREARPTPATRESTADODOC = "Estado Documentación";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_LOGESTADOFECHA.toUpperCase(), Constants.Type.DATETIME.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGESTADOLOGINFUNCIONARIO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGESTADOOBSERVACION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGESTADOMOTDEVOLUCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGESTADOESTADO.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGESTADOESTADODOC.toUpperCase(), Constants.Type.NAT.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_LOGESTADOID.toUpperCase(), LOGESTADOID_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGESTADOFECHA.toUpperCase(), LOGESTADOFECHA_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGESTADOLOGINFUNCIONARIO.toUpperCase(), LOGESTADOLOGINFUNCIONARIO_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGESTADOOBSERVACION.toUpperCase(), LOGESTADOOBSERVACION_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGESTADOMOTDEVOLUCION.toUpperCase(), LOGESTADOMOTDEVOLUCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGESTADOESTADO.toUpperCase(), LOGESTADOESTADO_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGESTADOESTADODOC.toUpperCase(), LOGESTADOESTADODOC_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_SOLICITUD.toUpperCase(), SOLICITUD_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'LogEstado', it returns the identification keys
     * - If className is a facet of the inheritance net of 'LogEstado', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_LOGESTADOID);
        }
        // Facet 'LogEstado' (This facet)
        if (LogEstadoConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_LOGESTADOID);
        }
        return returnList;
    }
}
