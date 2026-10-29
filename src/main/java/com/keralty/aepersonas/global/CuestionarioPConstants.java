package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>CuestionarioP</code> model class.
 */
public final class CuestionarioPConstants {

    private CuestionarioPConstants() {

    }

    // Class
    /** <code>CuestionarioP</code> class id. */
    public static final String CLASS_ID = "Clas_1432647237632788_Alias";
    /** <code>CuestionarioP</code> class name. */
    public static final String CLASS_NAME = "CuestionarioP";
    /** <code>CuestionarioP</code> class alias. */
    public static final String CLASS_ALIAS = "Cuestionario";
    /** <code>CuestionarioP</code> class table name. */
    public static final String TBL_NAME = "CuestionarioP";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "cuestionarioPNumero,aesolicitudesidsolicitud,usuarioIdentificador,cuestionarioPNombre,cuestionarioPYaDiligenciado";

    public static final String DSDSCUESTIONARIOPIIU = "DS_CuestionarioP_IIU";
    public static final String DSDSCUESTIONARIOPNULL = "DS_CuestionarioP_Null";
    

    // Attribute (cuestionarioPNumero)
    /** <code>cuestionarioPNumero</code> attribute id. */
    public static final String ATTR_ID_CUESTIONARIOPNUMERO = "Clas_1432647237632788Atr_1_Alias";
    /** <code>cuestionarioPNumero</code> attribute name. */
    public static final String ATTR_NAME_CUESTIONARIOPNUMERO = "cuestionarioPNumero";
    /** <code>cuestionarioPNumero</code> attribute alias. */
    public static final String ATTR_ALIAS_CUESTIONARIOPNUMERO = "Número";

    /** <code>cuestionarioPNumero</code> attribute facet sequence. */
    public static final String PATH_FACETS_CUESTIONARIOPNUMERO = "";
    /** Agents allowed to view the attribute cuestionarioPNumero **/
    public static final String CUESTIONARIOPNUMERO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (cuestionarioPNombre)
    /** <code>cuestionarioPNombre</code> attribute id. */
    public static final String ATTR_ID_CUESTIONARIOPNOMBRE = "Clas_1432647237632788Atr_2_Alias";
    /** <code>cuestionarioPNombre</code> attribute name. */
    public static final String ATTR_NAME_CUESTIONARIOPNOMBRE = "cuestionarioPNombre";
    /** <code>cuestionarioPNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_CUESTIONARIOPNOMBRE = "Nombre";

    /** <code>cuestionarioPNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_CUESTIONARIOPNOMBRE = "";
    /** Agents allowed to view the attribute cuestionarioPNombre **/
    public static final String CUESTIONARIOPNOMBRE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (cuestionarioPYaDiligenciado)
    /** <code>cuestionarioPYaDiligenciado</code> attribute id. */
    public static final String ATTR_ID_CUESTIONARIOPYADILIGENCIADO = "Clas_1432647237632788Atr_3_Alias";
    /** <code>cuestionarioPYaDiligenciado</code> attribute name. */
    public static final String ATTR_NAME_CUESTIONARIOPYADILIGENCIADO = "cuestionarioPYaDiligenciado";
    /** <code>cuestionarioPYaDiligenciado</code> attribute alias. */
    public static final String ATTR_ALIAS_CUESTIONARIOPYADILIGENCIADO = "Ya diligenciado";

    /** <code>cuestionarioPYaDiligenciado</code> attribute facet sequence. */
    public static final String PATH_FACETS_CUESTIONARIOPYADILIGENCIADO = "";
    /** Agents allowed to view the attribute cuestionarioPYaDiligenciado **/
    public static final String CUESTIONARIOPYADILIGENCIADO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Numero)
    /** <code>Numero</code> field name. */
    public static final String FLD_CUESTIONARIOPNUMERO = "Numero";    
    /** <code>cuestionarioPNumero</code> attribute field name. */
    public static final String ATTR_FIELD_CUESTIONARIOPNUMERO = "cuestionarioPNumero";
    // Field (id_solicitud)
    /** <code>id_solicitud</code> field name. */
    public static final String FLD_AESOLICITUDESIDSOLICITUD = "id_solicitud";    
    /** <code>Usuario.Solicitud.Ae_solicitudes.aesolicitudesidsolicitud</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIO_SOLICITUD_AE_SOLICITUDES_AESOLICITUDESIDSOLICITUD = "aesolicitudesidsolicitud";
    // Field (Identificador)
    /** <code>Identificador</code> field name. */
    public static final String FLD_USUARIOIDENTIFICADOR = "Identificador";    
    /** <code>Usuario.usuarioIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIO_USUARIOIDENTIFICADOR = "usuarioIdentificador";
    // Field (Nombre)
    /** <code>Nombre</code> field name. */
    public static final String FLD_CUESTIONARIOPNOMBRE = "Nombre";    
    /** <code>Nombre</code> field length. */
    public static final int FLD_CUESTIONARIOPNOMBRELENGTH = 100;
    /** <code>cuestionarioPNombre</code> attribute field name. */
    public static final String ATTR_FIELD_CUESTIONARIOPNOMBRE = "cuestionarioPNombre";
    // Field (YaDiligenciado)
    /** <code>YaDiligenciado</code> field name. */
    public static final String FLD_CUESTIONARIOPYADILIGENCIADO = "YaDiligenciado";    
    /** <code>cuestionarioPYaDiligenciado</code> attribute field name. */
    public static final String ATTR_FIELD_CUESTIONARIOPYADILIGENCIADO = "cuestionarioPYaDiligenciado";

    // Component role (Usuario)
    /** <code>Usuario</code> role id. */
    public static final String ROLE_ID_USUARIO = "Agr_1432912003072997_Alias";
    /** <code>Usuario</code> role name. */
    public static final String ROLE_NAME_USUARIO = "usuario";
    /** <code>Usuario</code> role alias. */
    public static final String ROLE_ALIAS_USUARIO = "Usuario";

    /** <code>Usuario</code> inverse role name. */
    public static final String ROLE_INVNAME_USUARIO = UsuarioConstants.ROLE_NAME_CUESTIONARIOP;
    /** <code>Usuario</code> role facet sequence. */
    public static final String PATH_FACETS_USUARIO = "";
    /** <code>Usuario</code> role target class. */
    public static final String ROLE_TARGET_USUARIO = UsuarioConstants.CLASS_NAME;

    /** Agents allowed to navigate through Usuario **/
    public static final String USUARIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Compound role (Secciones)
    /** <code>Secciones</code> role id. */
    public static final String ROLE_ID_SECCIONES = "Agr_1432647499776095_Alias";
    /** <code>Secciones</code> role name. */
    public static final String ROLE_NAME_SECCIONES = "secciones";
    /** <code>Cuestionario</code> role alias. */
    public static final String ROLE_ALIAS_SECCIONES = "Secciones";


    /** <code>Secciones</code> inverse role name. */
    public static final String ROLE_INVNAME_SECCIONES = SeccionPConstants.ROLE_NAME_CUESTIONARIO;
    /** <code>Secciones</code> role facet sequence. */
    public static final String PATH_FACETS_SECCIONES = "";
    /** <code>Secciones</code> role target class. */
    public static final String ROLE_TARGET_SECCIONES = SeccionPConstants.CLASS_NAME;
    /** Agents allowed to navigate through Secciones **/
    public static final String SECCIONES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1432647237632788Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>cuestionarioPcrearpagrUsuario</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_CUESTIONARIOPCREARPAGRUSUARIO = "p_agrUsuario";
    /** <code>cuestionarioPcrearpagrUsuario</code> inbound argument id. */
    public static final String ARG_ID_CREAR_CUESTIONARIOPCREARPAGRUSUARIO = "Clas_1432647237632788Ser_1Arg_5_Alias";
    /** <code>cuestionarioPcrearpagrUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_CUESTIONARIOPCREARPAGRUSUARIO = "Usuario";
    /** <code>cuestionarioPcrearpatrNombre</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_CUESTIONARIOPCREARPATRNOMBRE = "p_atrNombre";
    /** <code>cuestionarioPcrearpatrNombre</code> inbound argument id. */
    public static final String ARG_ID_CREAR_CUESTIONARIOPCREARPATRNOMBRE = "Clas_1432647237632788Ser_1Arg_2_Alias";
    /** <code>cuestionarioPcrearpatrNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_CUESTIONARIOPCREARPATRNOMBRE = "Nombre";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1432647237632788Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>cuestionarioPeliminarpthisCuestionarioP</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_CUESTIONARIOPELIMINARPTHISCUESTIONARIOP = "p_thisCuestionarioP";
    /** <code>cuestionarioPeliminarpthisCuestionarioP</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_CUESTIONARIOPELIMINARPTHISCUESTIONARIOP = "Clas_1432647237632788Ser_2Arg_1_Alias";
    /** <code>cuestionarioPeliminarpthisCuestionarioP</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_CUESTIONARIOPELIMINARPTHISCUESTIONARIOP = "Cuestionario";
    // Service (cerrar)
    /** <code>cerrar</code> service id. */
    public static final String SERV_ID_CERRAR = "Clas_1432647237632788Ser_5_Alias";
    /** <code>cerrar</code> service name. */
    public static final String SERV_NAME_CERRAR = "cerrar";
    /** <code>cerrar</code> service alias. */
    public static final String SERV_ALIAS_CERRAR = "cerrar";
    /** Agents allowed to execute the service cerrar **/
    public static final String CERRAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>cuestionarioPcerrarpthisCuestionarioP</code> inbound argument name. */
    public static final String ARG_NAME_CERRAR_CUESTIONARIOPCERRARPTHISCUESTIONARIOP = "p_thisCuestionarioP";
    /** <code>cuestionarioPcerrarpthisCuestionarioP</code> inbound argument id. */
    public static final String ARG_ID_CERRAR_CUESTIONARIOPCERRARPTHISCUESTIONARIOP = "Clas_1432647237632788Ser_5Arg_1_Alias";
    /** <code>cuestionarioPcerrarpthisCuestionarioP</code> inbound argument alias. */
    public static final String ARG_ALIAS_CERRAR_CUESTIONARIOPCERRARPTHISCUESTIONARIOP = "Cuestionario";
    // Service (TCREARYSECCIONES)
    /** <code>TCREARYSECCIONES</code> service id. */
    public static final String SERV_ID_TCREARYSECCIONES = "Clas_1432647237632788Ser_4_Alias";
    /** <code>TCREARYSECCIONES</code> service name. */
    public static final String SERV_NAME_TCREARYSECCIONES = "TCREARYSECCIONES";
    /** <code>TCREARYSECCIONES</code> service alias. */
    public static final String SERV_ALIAS_TCREARYSECCIONES = "TCREARYSECCIONES";
    /** Agents allowed to execute the service TCREARYSECCIONES **/
    public static final String TCREARYSECCIONES_SRVAGENTS = "";
    // Inbound arguments
    /** <code>cuestionarioPTCREARYSECCIONESptUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TCREARYSECCIONES_CUESTIONARIOPTCREARYSECCIONESPTUSUARIO = "pt_Usuario";
    /** <code>cuestionarioPTCREARYSECCIONESptUsuario</code> inbound argument id. */
    public static final String ARG_ID_TCREARYSECCIONES_CUESTIONARIOPTCREARYSECCIONESPTUSUARIO = "Clas_1432647237632788Ser_4Arg_2_Alias";
    /** <code>cuestionarioPTCREARYSECCIONESptUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARYSECCIONES_CUESTIONARIOPTCREARYSECCIONESPTUSUARIO = "Usuario";
    /** <code>cuestionarioPTCREARYSECCIONESptCuestionario</code> inbound argument name. */
    public static final String ARG_NAME_TCREARYSECCIONES_CUESTIONARIOPTCREARYSECCIONESPTCUESTIONARIO = "pt_Cuestionario";
    /** <code>cuestionarioPTCREARYSECCIONESptCuestionario</code> inbound argument id. */
    public static final String ARG_ID_TCREARYSECCIONES_CUESTIONARIOPTCREARYSECCIONESPTCUESTIONARIO = "Clas_1432647237632788Ser_4Arg_3_Alias";
    /** <code>cuestionarioPTCREARYSECCIONESptCuestionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARYSECCIONES_CUESTIONARIOPTCREARYSECCIONESPTCUESTIONARIO = "Cuestionario";
    // Service (TELIMINAR)
    /** <code>TELIMINAR</code> service id. */
    public static final String SERV_ID_TELIMINAR = "Clas_1432647237632788Ser_6_Alias";
    /** <code>TELIMINAR</code> service name. */
    public static final String SERV_NAME_TELIMINAR = "TELIMINAR";
    /** <code>TELIMINAR</code> service alias. */
    public static final String SERV_ALIAS_TELIMINAR = "Eliminar cuestionario médico";
    /** Agents allowed to execute the service TELIMINAR **/
    public static final String TELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>cuestionarioPTELIMINARpthisCuestionarioP</code> inbound argument name. */
    public static final String ARG_NAME_TELIMINAR_CUESTIONARIOPTELIMINARPTHISCUESTIONARIOP = "p_thisCuestionarioP";
    /** <code>cuestionarioPTELIMINARpthisCuestionarioP</code> inbound argument id. */
    public static final String ARG_ID_TELIMINAR_CUESTIONARIOPTELIMINARPTHISCUESTIONARIOP = "Clas_1432647237632788Ser_6Arg_1_Alias";
    /** <code>cuestionarioPTELIMINARpthisCuestionarioP</code> inbound argument alias. */
    public static final String ARG_ALIAS_TELIMINAR_CUESTIONARIOPTELIMINARPTHISCUESTIONARIOP = "Cuestionario";
    // Service (TCERRAR)
    /** <code>TCERRAR</code> service id. */
    public static final String SERV_ID_TCERRAR = "Clas_1432647237632788Ser_7_Alias";
    /** <code>TCERRAR</code> service name. */
    public static final String SERV_NAME_TCERRAR = "TCERRAR";
    /** <code>TCERRAR</code> service alias. */
    public static final String SERV_ALIAS_TCERRAR = "Marcar como completado";
    /** Agents allowed to execute the service TCERRAR **/
    public static final String TCERRAR_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Inbound arguments
    /** <code>cuestionarioPTCERRARpthisCuestionarioP</code> inbound argument name. */
    public static final String ARG_NAME_TCERRAR_CUESTIONARIOPTCERRARPTHISCUESTIONARIOP = "p_thisCuestionarioP";
    /** <code>cuestionarioPTCERRARpthisCuestionarioP</code> inbound argument id. */
    public static final String ARG_ID_TCERRAR_CUESTIONARIOPTCERRARPTHISCUESTIONARIOP = "Clas_1432647237632788Ser_7Arg_1_Alias";
    /** <code>cuestionarioPTCERRARpthisCuestionarioP</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCERRAR_CUESTIONARIOPTCERRARPTHISCUESTIONARIOP = "Cuestionario";
    // Service (TMARCARDATOSPREGUNTACORE)
    /** <code>TMARCARDATOSPREGUNTACORE</code> service id. */
    public static final String SERV_ID_TMARCARDATOSPREGUNTACORE = "Clas_1432647237632788Ser_8_Alias";
    /** <code>TMARCARDATOSPREGUNTACORE</code> service name. */
    public static final String SERV_NAME_TMARCARDATOSPREGUNTACORE = "TMARCARDATOSPREGUNTACORE";
    /** <code>TMARCARDATOSPREGUNTACORE</code> service alias. */
    public static final String SERV_ALIAS_TMARCARDATOSPREGUNTACORE = "TMARCARDATOSPREGUNTACORE";
    /** Agents allowed to execute the service TMARCARDATOSPREGUNTACORE **/
    public static final String TMARCARDATOSPREGUNTACORE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>cuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioP</code> inbound argument name. */
    public static final String ARG_NAME_TMARCARDATOSPREGUNTACORE_CUESTIONARIOPTMARCARDATOSPREGUNTACOREPTHISCUESTIONARIOP = "p_thisCuestionarioP";
    /** <code>cuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioP</code> inbound argument id. */
    public static final String ARG_ID_TMARCARDATOSPREGUNTACORE_CUESTIONARIOPTMARCARDATOSPREGUNTACOREPTHISCUESTIONARIOP = "Clas_1432647237632788Ser_8Arg_1_Alias";
    /** <code>cuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioP</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMARCARDATOSPREGUNTACORE_CUESTIONARIOPTMARCARDATOSPREGUNTACOREPTHISCUESTIONARIOP = "Cuestionario";
    /** <code>cuestionarioPTMARCARDATOSPREGUNTACOREptpRespuestaSiNo</code> inbound argument name. */
    public static final String ARG_NAME_TMARCARDATOSPREGUNTACORE_CUESTIONARIOPTMARCARDATOSPREGUNTACOREPTPRESPUESTASINO = "pt_p_RespuestaSiNo";
    /** <code>cuestionarioPTMARCARDATOSPREGUNTACOREptpRespuestaSiNo</code> inbound argument id. */
    public static final String ARG_ID_TMARCARDATOSPREGUNTACORE_CUESTIONARIOPTMARCARDATOSPREGUNTACOREPTPRESPUESTASINO = "Clas_1432647237632788Ser_8Arg_2_Alias";
    /** <code>cuestionarioPTMARCARDATOSPREGUNTACOREptpRespuestaSiNo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMARCARDATOSPREGUNTACORE_CUESTIONARIOPTMARCARDATOSPREGUNTACOREPTPRESPUESTASINO = "Respuesta Si/No";
    /** <code>cuestionarioPTMARCARDATOSPREGUNTACOREptpRespuestaObs</code> inbound argument name. */
    public static final String ARG_NAME_TMARCARDATOSPREGUNTACORE_CUESTIONARIOPTMARCARDATOSPREGUNTACOREPTPRESPUESTAOBS = "pt_p_RespuestaObs";
    /** <code>cuestionarioPTMARCARDATOSPREGUNTACOREptpRespuestaObs</code> inbound argument id. */
    public static final String ARG_ID_TMARCARDATOSPREGUNTACORE_CUESTIONARIOPTMARCARDATOSPREGUNTACOREPTPRESPUESTAOBS = "Clas_1432647237632788Ser_8Arg_3_Alias";
    /** <code>cuestionarioPTMARCARDATOSPREGUNTACOREptpRespuestaObs</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMARCARDATOSPREGUNTACORE_CUESTIONARIOPTMARCARDATOSPREGUNTACOREPTPRESPUESTAOBS = "Observaciones";
    /** <code>cuestionarioPTMARCARDATOSPREGUNTACOREptNumPregunta</code> inbound argument name. */
    public static final String ARG_NAME_TMARCARDATOSPREGUNTACORE_CUESTIONARIOPTMARCARDATOSPREGUNTACOREPTNUMPREGUNTA = "ptNumPregunta";
    /** <code>cuestionarioPTMARCARDATOSPREGUNTACOREptNumPregunta</code> inbound argument id. */
    public static final String ARG_ID_TMARCARDATOSPREGUNTACORE_CUESTIONARIOPTMARCARDATOSPREGUNTACOREPTNUMPREGUNTA = "Clas_1432647237632788Ser_8Arg_4_Alias";
    /** <code>cuestionarioPTMARCARDATOSPREGUNTACOREptNumPregunta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMARCARDATOSPREGUNTACORE_CUESTIONARIOPTMARCARDATOSPREGUNTACOREPTNUMPREGUNTA = "ptNumPregunta";
    // Service (TCAMBIARPREGUNTA108)
    /** <code>TCAMBIARPREGUNTA108</code> service id. */
    public static final String SERV_ID_TCAMBIARPREGUNTA108 = "Clas_1432647237632788Ser_9_Alias";
    /** <code>TCAMBIARPREGUNTA108</code> service name. */
    public static final String SERV_NAME_TCAMBIARPREGUNTA108 = "TCAMBIARPREGUNTA108";
    /** <code>TCAMBIARPREGUNTA108</code> service alias. */
    public static final String SERV_ALIAS_TCAMBIARPREGUNTA108 = "TCAMBIARPREGUNTA108";
    /** Agents allowed to execute the service TCAMBIARPREGUNTA108 **/
    public static final String TCAMBIARPREGUNTA108_SRVAGENTS = "";
    // Inbound arguments
    /** <code>cuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioP</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARPREGUNTA108_CUESTIONARIOPTCAMBIARPREGUNTA108PTHISCUESTIONARIOP = "p_thisCuestionarioP";
    /** <code>cuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioP</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARPREGUNTA108_CUESTIONARIOPTCAMBIARPREGUNTA108PTHISCUESTIONARIOP = "Clas_1432647237632788Ser_9Arg_1_Alias";
    /** <code>cuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioP</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARPREGUNTA108_CUESTIONARIOPTCAMBIARPREGUNTA108PTHISCUESTIONARIOP = "Cuestionario";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_CUESTIONARIOPNOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_CUESTIONARIOPYADILIGENCIADO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_CUESTIONARIOPNUMERO.toUpperCase(), CUESTIONARIOPNUMERO_AGENTS);
    	attributeAgents.put(ATTR_NAME_CUESTIONARIOPNOMBRE.toUpperCase(), CUESTIONARIOPNOMBRE_AGENTS);
    	attributeAgents.put(ATTR_NAME_CUESTIONARIOPYADILIGENCIADO.toUpperCase(), CUESTIONARIOPYADILIGENCIADO_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_USUARIO.toUpperCase(), USUARIO_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'CuestionarioP', it returns the identification keys
     * - If className is a facet of the inheritance net of 'CuestionarioP', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_CUESTIONARIOPNUMERO);
        }
        // Facet 'CuestionarioP' (This facet)
        if (CuestionarioPConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_CUESTIONARIOPNUMERO);
        }
        return returnList;
    }
}
