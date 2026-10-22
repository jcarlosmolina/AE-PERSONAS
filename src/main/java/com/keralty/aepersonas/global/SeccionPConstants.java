package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>SeccionP</code> model class.
 */
public final class SeccionPConstants {

    private SeccionPConstants() {

    }

    // Class
    /** <code>SeccionP</code> class id. */
    public static final String CLASS_ID = "Clas_1432647368704823_Alias";
    /** <code>SeccionP</code> class name. */
    public static final String CLASS_NAME = "SeccionP";
    /** <code>SeccionP</code> class alias. */
    public static final String CLASS_ALIAS = "Sección";
    /** <code>SeccionP</code> class table name. */
    public static final String TBL_NAME = "SeccionP";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "seccionPIdentificador,cuestionarioPNumero,seccionPNombre,seccionPNumOrden";

    public static final String DSDSSECCIONPNULL = "DS_SeccionP_Null";
    

    // Attribute (seccionPIdentificador)
    /** <code>seccionPIdentificador</code> attribute id. */
    public static final String ATTR_ID_SECCIONPIDENTIFICADOR = "Clas_1432647368704823Atr_1_Alias";
    /** <code>seccionPIdentificador</code> attribute name. */
    public static final String ATTR_NAME_SECCIONPIDENTIFICADOR = "seccionPIdentificador";
    /** <code>seccionPIdentificador</code> attribute alias. */
    public static final String ATTR_ALIAS_SECCIONPIDENTIFICADOR = "Identificador";

    /** <code>seccionPIdentificador</code> attribute facet sequence. */
    public static final String PATH_FACETS_SECCIONPIDENTIFICADOR = "";
    /** Agents allowed to view the attribute seccionPIdentificador **/
    public static final String SECCIONPIDENTIFICADOR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (seccionPNombre)
    /** <code>seccionPNombre</code> attribute id. */
    public static final String ATTR_ID_SECCIONPNOMBRE = "Clas_1432647368704823Atr_2_Alias";
    /** <code>seccionPNombre</code> attribute name. */
    public static final String ATTR_NAME_SECCIONPNOMBRE = "seccionPNombre";
    /** <code>seccionPNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_SECCIONPNOMBRE = "Nombre";

    /** <code>seccionPNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_SECCIONPNOMBRE = "";
    /** Agents allowed to view the attribute seccionPNombre **/
    public static final String SECCIONPNOMBRE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (seccionPNumOrden)
    /** <code>seccionPNumOrden</code> attribute id. */
    public static final String ATTR_ID_SECCIONPNUMORDEN = "Clas_1432647368704823Atr_3_Alias";
    /** <code>seccionPNumOrden</code> attribute name. */
    public static final String ATTR_NAME_SECCIONPNUMORDEN = "seccionPNumOrden";
    /** <code>seccionPNumOrden</code> attribute alias. */
    public static final String ATTR_ALIAS_SECCIONPNUMORDEN = "Nº Orden";

    /** <code>seccionPNumOrden</code> attribute facet sequence. */
    public static final String PATH_FACETS_SECCIONPNUMORDEN = "";
    /** Agents allowed to view the attribute seccionPNumOrden **/
    public static final String SECCIONPNUMORDEN_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (seccionPdrvUsuarioF)
    /** <code>seccionPdrvUsuarioF</code> attribute id. */
    public static final String ATTR_ID_SECCIONPDRVUSUARIOF = "Clas_1432647368704823Atr_4_Alias";
    /** <code>seccionPdrvUsuarioF</code> attribute name. */
    public static final String ATTR_NAME_SECCIONPDRVUSUARIOF = "seccionPdrvUsuarioF";
    /** <code>seccionPdrvUsuarioF</code> attribute alias. */
    public static final String ATTR_ALIAS_SECCIONPDRVUSUARIOF = "Usuario mujer";

    /** <code>seccionPdrvUsuarioF</code> attribute facet sequence. */
    public static final String PATH_FACETS_SECCIONPDRVUSUARIOF = "";
    /** Agents allowed to view the attribute seccionPdrvUsuarioF **/
    public static final String SECCIONPDRVUSUARIOF_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (seccionPdrvUsuarioM)
    /** <code>seccionPdrvUsuarioM</code> attribute id. */
    public static final String ATTR_ID_SECCIONPDRVUSUARIOM = "Clas_1432647368704823Atr_5_Alias";
    /** <code>seccionPdrvUsuarioM</code> attribute name. */
    public static final String ATTR_NAME_SECCIONPDRVUSUARIOM = "seccionPdrvUsuarioM";
    /** <code>seccionPdrvUsuarioM</code> attribute alias. */
    public static final String ATTR_ALIAS_SECCIONPDRVUSUARIOM = "Usuario hombre";

    /** <code>seccionPdrvUsuarioM</code> attribute facet sequence. */
    public static final String PATH_FACETS_SECCIONPDRVUSUARIOM = "";
    /** Agents allowed to view the attribute seccionPdrvUsuarioM **/
    public static final String SECCIONPDRVUSUARIOM_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (seccionPdrvUsuarioMas40)
    /** <code>seccionPdrvUsuarioMas40</code> attribute id. */
    public static final String ATTR_ID_SECCIONPDRVUSUARIOMAS40 = "Clas_1432647368704823Atr_6_Alias";
    /** <code>seccionPdrvUsuarioMas40</code> attribute name. */
    public static final String ATTR_NAME_SECCIONPDRVUSUARIOMAS40 = "seccionPdrvUsuarioMas40";
    /** <code>seccionPdrvUsuarioMas40</code> attribute alias. */
    public static final String ATTR_ALIAS_SECCIONPDRVUSUARIOMAS40 = "Usuario mayor 40";

    /** <code>seccionPdrvUsuarioMas40</code> attribute facet sequence. */
    public static final String PATH_FACETS_SECCIONPDRVUSUARIOMAS40 = "";
    /** Agents allowed to view the attribute seccionPdrvUsuarioMas40 **/
    public static final String SECCIONPDRVUSUARIOMAS40_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Identificador)
    /** <code>Identificador</code> field name. */
    public static final String FLD_SECCIONPIDENTIFICADOR = "Identificador";    
    /** <code>seccionPIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_SECCIONPIDENTIFICADOR = "seccionPIdentificador";
    // Field (Numero)
    /** <code>Numero</code> field name. */
    public static final String FLD_CUESTIONARIOPNUMERO = "Numero";    
    /** <code>Cuestionario.cuestionarioPNumero</code> attribute field name. */
    public static final String ATTR_FIELD_CUESTIONARIO_CUESTIONARIOPNUMERO = "cuestionarioPNumero";
    // Field (Nombre)
    /** <code>Nombre</code> field name. */
    public static final String FLD_SECCIONPNOMBRE = "Nombre";    
    /** <code>Nombre</code> field length. */
    public static final int FLD_SECCIONPNOMBRELENGTH = 150;
    /** <code>seccionPNombre</code> attribute field name. */
    public static final String ATTR_FIELD_SECCIONPNOMBRE = "seccionPNombre";
    // Field (NumOrden)
    /** <code>NumOrden</code> field name. */
    public static final String FLD_SECCIONPNUMORDEN = "NumOrden";    
    /** <code>seccionPNumOrden</code> attribute field name. */
    public static final String ATTR_FIELD_SECCIONPNUMORDEN = "seccionPNumOrden";

    // Component role (Cuestionario)
    /** <code>Cuestionario</code> role id. */
    public static final String ROLE_ID_CUESTIONARIO = "Agr_1432647499776095_Alias";
    /** <code>Cuestionario</code> role name. */
    public static final String ROLE_NAME_CUESTIONARIO = "cuestionario";
    /** <code>Cuestionario</code> role alias. */
    public static final String ROLE_ALIAS_CUESTIONARIO = "Cuestionario";

    /** <code>Cuestionario</code> inverse role name. */
    public static final String ROLE_INVNAME_CUESTIONARIO = CuestionarioPConstants.ROLE_NAME_SECCIONES;
    /** <code>Cuestionario</code> role facet sequence. */
    public static final String PATH_FACETS_CUESTIONARIO = "";
    /** <code>Cuestionario</code> role target class. */
    public static final String ROLE_TARGET_CUESTIONARIO = CuestionarioPConstants.CLASS_NAME;

    /** Agents allowed to navigate through Cuestionario **/
    public static final String CUESTIONARIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Compound role (Preguntas)
    /** <code>Preguntas</code> role id. */
    public static final String ROLE_ID_PREGUNTAS = "Agr_1432647499776123_Alias";
    /** <code>Preguntas</code> role name. */
    public static final String ROLE_NAME_PREGUNTAS = "preguntas";
    /** <code>Seccion</code> role alias. */
    public static final String ROLE_ALIAS_PREGUNTAS = "Preguntas";


    /** <code>Preguntas</code> inverse role name. */
    public static final String ROLE_INVNAME_PREGUNTAS = PreguntaPConstants.ROLE_NAME_SECCION;
    /** <code>Preguntas</code> role facet sequence. */
    public static final String PATH_FACETS_PREGUNTAS = "";
    /** <code>Preguntas</code> role target class. */
    public static final String ROLE_TARGET_PREGUNTAS = PreguntaPConstants.CLASS_NAME;
    /** Agents allowed to navigate through Preguntas **/
    public static final String PREGUNTAS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1432647368704823Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>seccionPcrearpagrCuestionario</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SECCIONPCREARPAGRCUESTIONARIO = "p_agrCuestionario";
    /** <code>seccionPcrearpagrCuestionario</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SECCIONPCREARPAGRCUESTIONARIO = "Clas_1432647368704823Ser_1Arg_4_Alias";
    /** <code>seccionPcrearpagrCuestionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SECCIONPCREARPAGRCUESTIONARIO = "Cuestionario";
    /** <code>seccionPcrearpatrNombre</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SECCIONPCREARPATRNOMBRE = "p_atrNombre";
    /** <code>seccionPcrearpatrNombre</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SECCIONPCREARPATRNOMBRE = "Clas_1432647368704823Ser_1Arg_2_Alias";
    /** <code>seccionPcrearpatrNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SECCIONPCREARPATRNOMBRE = "Nombre";
    /** <code>seccionPcrearpatrNumOrden</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SECCIONPCREARPATRNUMORDEN = "p_atrNumOrden";
    /** <code>seccionPcrearpatrNumOrden</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SECCIONPCREARPATRNUMORDEN = "Clas_1432647368704823Ser_1Arg_3_Alias";
    /** <code>seccionPcrearpatrNumOrden</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SECCIONPCREARPATRNUMORDEN = "Nº Orden";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1432647368704823Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>seccionPeliminarpthisSeccionP</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_SECCIONPELIMINARPTHISSECCIONP = "p_thisSeccionP";
    /** <code>seccionPeliminarpthisSeccionP</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_SECCIONPELIMINARPTHISSECCIONP = "Clas_1432647368704823Ser_2Arg_1_Alias";
    /** <code>seccionPeliminarpthisSeccionP</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_SECCIONPELIMINARPTHISSECCIONP = "Sección";
    // Service (TCREARYPREGUNTAS)
    /** <code>TCREARYPREGUNTAS</code> service id. */
    public static final String SERV_ID_TCREARYPREGUNTAS = "Clas_1432647368704823Ser_4_Alias";
    /** <code>TCREARYPREGUNTAS</code> service name. */
    public static final String SERV_NAME_TCREARYPREGUNTAS = "TCREARYPREGUNTAS";
    /** <code>TCREARYPREGUNTAS</code> service alias. */
    public static final String SERV_ALIAS_TCREARYPREGUNTAS = "TCREARYPREGUNTAS";
    /** Agents allowed to execute the service TCREARYPREGUNTAS **/
    public static final String TCREARYPREGUNTAS_SRVAGENTS = "";
    // Inbound arguments
    /** <code>seccionPTCREARYPREGUNTASptSeccion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARYPREGUNTAS_SECCIONPTCREARYPREGUNTASPTSECCION = "pt_Seccion";
    /** <code>seccionPTCREARYPREGUNTASptSeccion</code> inbound argument id. */
    public static final String ARG_ID_TCREARYPREGUNTAS_SECCIONPTCREARYPREGUNTASPTSECCION = "Clas_1432647368704823Ser_4Arg_2_Alias";
    /** <code>seccionPTCREARYPREGUNTASptSeccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARYPREGUNTAS_SECCIONPTCREARYPREGUNTASPTSECCION = "Sección";
    /** <code>seccionPTCREARYPREGUNTASptCuestionarioP</code> inbound argument name. */
    public static final String ARG_NAME_TCREARYPREGUNTAS_SECCIONPTCREARYPREGUNTASPTCUESTIONARIOP = "pt_CuestionarioP";
    /** <code>seccionPTCREARYPREGUNTASptCuestionarioP</code> inbound argument id. */
    public static final String ARG_ID_TCREARYPREGUNTAS_SECCIONPTCREARYPREGUNTASPTCUESTIONARIOP = "Clas_1432647368704823Ser_4Arg_4_Alias";
    /** <code>seccionPTCREARYPREGUNTASptCuestionarioP</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARYPREGUNTAS_SECCIONPTCREARYPREGUNTASPTCUESTIONARIOP = "Cuestionario";
    // Service (TELIMINAR)
    /** <code>TELIMINAR</code> service id. */
    public static final String SERV_ID_TELIMINAR = "Clas_1432647368704823Ser_5_Alias";
    /** <code>TELIMINAR</code> service name. */
    public static final String SERV_NAME_TELIMINAR = "TELIMINAR";
    /** <code>TELIMINAR</code> service alias. */
    public static final String SERV_ALIAS_TELIMINAR = "Eliminar sección";
    /** Agents allowed to execute the service TELIMINAR **/
    public static final String TELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>seccionPTELIMINARpthisSeccionP</code> inbound argument name. */
    public static final String ARG_NAME_TELIMINAR_SECCIONPTELIMINARPTHISSECCIONP = "p_thisSeccionP";
    /** <code>seccionPTELIMINARpthisSeccionP</code> inbound argument id. */
    public static final String ARG_ID_TELIMINAR_SECCIONPTELIMINARPTHISSECCIONP = "Clas_1432647368704823Ser_5Arg_1_Alias";
    /** <code>seccionPTELIMINARpthisSeccionP</code> inbound argument alias. */
    public static final String ARG_ALIAS_TELIMINAR_SECCIONPTELIMINARPTHISSECCIONP = "Sección";
    // Service (TCREARPREGUNTASITOCA)
    /** <code>TCREARPREGUNTASITOCA</code> service id. */
    public static final String SERV_ID_TCREARPREGUNTASITOCA = "Clas_1432647368704823Ser_6_Alias";
    /** <code>TCREARPREGUNTASITOCA</code> service name. */
    public static final String SERV_NAME_TCREARPREGUNTASITOCA = "TCREARPREGUNTASITOCA";
    /** <code>TCREARPREGUNTASITOCA</code> service alias. */
    public static final String SERV_ALIAS_TCREARPREGUNTASITOCA = "TCREARPREGUNTASITOCA";
    /** Agents allowed to execute the service TCREARPREGUNTASITOCA **/
    public static final String TCREARPREGUNTASITOCA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>seccionPTCREARPREGUNTASITOCApthisSeccionP</code> inbound argument name. */
    public static final String ARG_NAME_TCREARPREGUNTASITOCA_SECCIONPTCREARPREGUNTASITOCAPTHISSECCIONP = "p_thisSeccionP";
    /** <code>seccionPTCREARPREGUNTASITOCApthisSeccionP</code> inbound argument id. */
    public static final String ARG_ID_TCREARPREGUNTASITOCA_SECCIONPTCREARPREGUNTASITOCAPTHISSECCIONP = "Clas_1432647368704823Ser_6Arg_1_Alias";
    /** <code>seccionPTCREARPREGUNTASITOCApthisSeccionP</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARPREGUNTASITOCA_SECCIONPTCREARPREGUNTASITOCAPTHISSECCIONP = "Sección";
    /** <code>seccionPTCREARPREGUNTASITOCApPregunta</code> inbound argument name. */
    public static final String ARG_NAME_TCREARPREGUNTASITOCA_SECCIONPTCREARPREGUNTASITOCAPPREGUNTA = "p_Pregunta";
    /** <code>seccionPTCREARPREGUNTASITOCApPregunta</code> inbound argument id. */
    public static final String ARG_ID_TCREARPREGUNTASITOCA_SECCIONPTCREARPREGUNTASITOCAPPREGUNTA = "Clas_1432647368704823Ser_6Arg_2_Alias";
    /** <code>seccionPTCREARPREGUNTASITOCApPregunta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARPREGUNTASITOCA_SECCIONPTCREARPREGUNTASITOCAPPREGUNTA = "Pregunta";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_SECCIONPNOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SECCIONPNUMORDEN.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_SECCIONPDRVUSUARIOF.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SECCIONPDRVUSUARIOM.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_SECCIONPDRVUSUARIOMAS40.toUpperCase(), Constants.Type.BOOL.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_SECCIONPIDENTIFICADOR.toUpperCase(), SECCIONPIDENTIFICADOR_AGENTS);
    	attributeAgents.put(ATTR_NAME_SECCIONPNOMBRE.toUpperCase(), SECCIONPNOMBRE_AGENTS);
    	attributeAgents.put(ATTR_NAME_SECCIONPNUMORDEN.toUpperCase(), SECCIONPNUMORDEN_AGENTS);
    	attributeAgents.put(ATTR_NAME_SECCIONPDRVUSUARIOF.toUpperCase(), SECCIONPDRVUSUARIOF_AGENTS);
    	attributeAgents.put(ATTR_NAME_SECCIONPDRVUSUARIOM.toUpperCase(), SECCIONPDRVUSUARIOM_AGENTS);
    	attributeAgents.put(ATTR_NAME_SECCIONPDRVUSUARIOMAS40.toUpperCase(), SECCIONPDRVUSUARIOMAS40_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_CUESTIONARIO.toUpperCase(), CUESTIONARIO_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'SeccionP', it returns the identification keys
     * - If className is a facet of the inheritance net of 'SeccionP', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_SECCIONPIDENTIFICADOR);
        }
        // Facet 'SeccionP' (This facet)
        if (SeccionPConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_SECCIONPIDENTIFICADOR);
        }
        return returnList;
    }
}
