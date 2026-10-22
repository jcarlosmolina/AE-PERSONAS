package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>ErrorWS</code> model class.
 */
public final class ErrorWSConstants {

    private ErrorWSConstants() {

    }

    // Class
    /** <code>ErrorWS</code> class id. */
    public static final String CLASS_ID = "Clas_1434561806336515_Alias";
    /** <code>ErrorWS</code> class name. */
    public static final String CLASS_NAME = "ErrorWS";
    /** <code>ErrorWS</code> class alias. */
    public static final String CLASS_ALIAS = "Error";
    /** <code>ErrorWS</code> class table name. */
    public static final String TBL_NAME = "ErrorWS";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "errorWSIdentificador,aesolicitudesidsolicitud,errorWSDescripcion";

    public static final String DSDSERRORWSPIU = "DS_ErrorWS_PIU";
    

    // Attribute (errorWSIdentificador)
    /** <code>errorWSIdentificador</code> attribute id. */
    public static final String ATTR_ID_ERRORWSIDENTIFICADOR = "Clas_1434561806336515Atr_1_Alias";
    /** <code>errorWSIdentificador</code> attribute name. */
    public static final String ATTR_NAME_ERRORWSIDENTIFICADOR = "errorWSIdentificador";
    /** <code>errorWSIdentificador</code> attribute alias. */
    public static final String ATTR_ALIAS_ERRORWSIDENTIFICADOR = "Identificador";

    /** <code>errorWSIdentificador</code> attribute facet sequence. */
    public static final String PATH_FACETS_ERRORWSIDENTIFICADOR = "";
    /** Agents allowed to view the attribute errorWSIdentificador **/
    public static final String ERRORWSIDENTIFICADOR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (errorWSDescripcion)
    /** <code>errorWSDescripcion</code> attribute id. */
    public static final String ATTR_ID_ERRORWSDESCRIPCION = "Clas_1434561806336515Atr_2_Alias";
    /** <code>errorWSDescripcion</code> attribute name. */
    public static final String ATTR_NAME_ERRORWSDESCRIPCION = "errorWSDescripcion";
    /** <code>errorWSDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_ERRORWSDESCRIPCION = "Descripción";

    /** <code>errorWSDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_ERRORWSDESCRIPCION = "";
    /** Agents allowed to view the attribute errorWSDescripcion **/
    public static final String ERRORWSDESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Identificador)
    /** <code>Identificador</code> field name. */
    public static final String FLD_ERRORWSIDENTIFICADOR = "Identificador";    
    /** <code>errorWSIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_ERRORWSIDENTIFICADOR = "errorWSIdentificador";
    // Field (id_solicitud)
    /** <code>id_solicitud</code> field name. */
    public static final String FLD_AESOLICITUDESIDSOLICITUD = "id_solicitud";    
    /** <code>Solicitud.Ae_solicitudes.aesolicitudesidsolicitud</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUD_AE_SOLICITUDES_AESOLICITUDESIDSOLICITUD = "aesolicitudesidsolicitud";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_ERRORWSDESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_ERRORWSDESCRIPCIONLENGTH = 999;
    /** <code>errorWSDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_ERRORWSDESCRIPCION = "errorWSDescripcion";

    // Component role (Solicitud)
    /** <code>Solicitud</code> role id. */
    public static final String ROLE_ID_SOLICITUD = "Agr_1434561806336828_Alias";
    /** <code>Solicitud</code> role name. */
    public static final String ROLE_NAME_SOLICITUD = "solicitud";
    /** <code>Solicitud</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUD = "Solicitud";

    /** <code>Solicitud</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUD = SolicitudConstants.ROLE_NAME_ERRORESWS;
    /** <code>Solicitud</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUD = "";
    /** <code>Solicitud</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUD = SolicitudConstants.CLASS_NAME;

    /** Agents allowed to navigate through Solicitud **/
    public static final String SOLICITUD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1434561806336515Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    // Inbound arguments
    /** <code>errorWScrearpagrSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ERRORWSCREARPAGRSOLICITUD = "p_agrSolicitud";
    /** <code>errorWScrearpagrSolicitud</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ERRORWSCREARPAGRSOLICITUD = "Clas_1434561806336515Ser_1Arg_10_Alias";
    /** <code>errorWScrearpagrSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ERRORWSCREARPAGRSOLICITUD = "Solicitud";
    /** <code>errorWScrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ERRORWSCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>errorWScrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ERRORWSCREARPATRDESCRIPCION = "Clas_1434561806336515Ser_1Arg_3_Alias";
    /** <code>errorWScrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ERRORWSCREARPATRDESCRIPCION = "Descripción";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1434561806336515Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    // Inbound arguments
    /** <code>errorWSeliminarpthisErrorWS</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_ERRORWSELIMINARPTHISERRORWS = "p_thisErrorWS";
    /** <code>errorWSeliminarpthisErrorWS</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_ERRORWSELIMINARPTHISERRORWS = "Clas_1434561806336515Ser_2Arg_1_Alias";
    /** <code>errorWSeliminarpthisErrorWS</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_ERRORWSELIMINARPTHISERRORWS = "Error";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_ERRORWSDESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_ERRORWSIDENTIFICADOR.toUpperCase(), ERRORWSIDENTIFICADOR_AGENTS);
    	attributeAgents.put(ATTR_NAME_ERRORWSDESCRIPCION.toUpperCase(), ERRORWSDESCRIPCION_AGENTS);
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
     * - If className is 'ErrorWS', it returns the identification keys
     * - If className is a facet of the inheritance net of 'ErrorWS', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_ERRORWSIDENTIFICADOR);
        }
        // Facet 'ErrorWS' (This facet)
        if (ErrorWSConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_ERRORWSIDENTIFICADOR);
        }
        return returnList;
    }
}
