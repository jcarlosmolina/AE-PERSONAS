package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>LogEstadoSN</code> model class.
 */
public final class LogEstadoSNConstants {

    private LogEstadoSNConstants() {

    }

    // Class
    /** <code>LogEstadoSN</code> class id. */
    public static final String CLASS_ID = "Clas_1583331278848231_Alias";
    /** <code>LogEstadoSN</code> class name. */
    public static final String CLASS_NAME = "LogEstadoSN";
    /** <code>LogEstadoSN</code> class alias. */
    public static final String CLASS_ALIAS = "Log Estado";
    /** <code>LogEstadoSN</code> class table name. */
    public static final String TBL_NAME = "LogEstadoSN";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "logEstadoSNId,solicitudNovedadSolicitudNovedadId,logEstadoSNFecha,logEstadoSNLoginFuncionario,logEstadoSNEstado,logEstadoSNEstadoDoc";

    public static final String DSDSLOGESTADOSNPIU = "DS_LogEstadoSN_PIU";
    

    // Attribute (logEstadoSNId)
    /** <code>logEstadoSNId</code> attribute id. */
    public static final String ATTR_ID_LOGESTADOSNID = "Clas_1583331278848231Atr_1_Alias";
    /** <code>logEstadoSNId</code> attribute name. */
    public static final String ATTR_NAME_LOGESTADOSNID = "logEstadoSNId";
    /** <code>logEstadoSNId</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGESTADOSNID = "Id.";

    /** <code>logEstadoSNId</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGESTADOSNID = "";
    /** Agents allowed to view the attribute logEstadoSNId **/
    public static final String LOGESTADOSNID_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (logEstadoSNFecha)
    /** <code>logEstadoSNFecha</code> attribute id. */
    public static final String ATTR_ID_LOGESTADOSNFECHA = "Clas_1583331278848231Atr_2_Alias";
    /** <code>logEstadoSNFecha</code> attribute name. */
    public static final String ATTR_NAME_LOGESTADOSNFECHA = "logEstadoSNFecha";
    /** <code>logEstadoSNFecha</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGESTADOSNFECHA = "Fecha";

    /** <code>logEstadoSNFecha</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGESTADOSNFECHA = "";
    /** Agents allowed to view the attribute logEstadoSNFecha **/
    public static final String LOGESTADOSNFECHA_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (logEstadoSNLoginFuncionario)
    /** <code>logEstadoSNLoginFuncionario</code> attribute id. */
    public static final String ATTR_ID_LOGESTADOSNLOGINFUNCIONARIO = "Clas_1583331278848231Atr_3_Alias";
    /** <code>logEstadoSNLoginFuncionario</code> attribute name. */
    public static final String ATTR_NAME_LOGESTADOSNLOGINFUNCIONARIO = "logEstadoSNLoginFuncionario";
    /** <code>logEstadoSNLoginFuncionario</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGESTADOSNLOGINFUNCIONARIO = "Funcionario";

    /** <code>logEstadoSNLoginFuncionario</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGESTADOSNLOGINFUNCIONARIO = "";
    /** Agents allowed to view the attribute logEstadoSNLoginFuncionario **/
    public static final String LOGESTADOSNLOGINFUNCIONARIO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (logEstadoSNEstado)
    /** <code>logEstadoSNEstado</code> attribute id. */
    public static final String ATTR_ID_LOGESTADOSNESTADO = "Clas_1583331278848231Atr_4_Alias";
    /** <code>logEstadoSNEstado</code> attribute name. */
    public static final String ATTR_NAME_LOGESTADOSNESTADO = "logEstadoSNEstado";
    /** <code>logEstadoSNEstado</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGESTADOSNESTADO = "Estado";

    /** <code>logEstadoSNEstado</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGESTADOSNESTADO = "";
    /** Agents allowed to view the attribute logEstadoSNEstado **/
    public static final String LOGESTADOSNESTADO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (logEstadoSNEstadoDoc)
    /** <code>logEstadoSNEstadoDoc</code> attribute id. */
    public static final String ATTR_ID_LOGESTADOSNESTADODOC = "Clas_1583331278848231Atr_5_Alias";
    /** <code>logEstadoSNEstadoDoc</code> attribute name. */
    public static final String ATTR_NAME_LOGESTADOSNESTADODOC = "logEstadoSNEstadoDoc";
    /** <code>logEstadoSNEstadoDoc</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGESTADOSNESTADODOC = "Estado Documentación";

    /** <code>logEstadoSNEstadoDoc</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGESTADOSNESTADODOC = "";
    /** Agents allowed to view the attribute logEstadoSNEstadoDoc **/
    public static final String LOGESTADOSNESTADODOC_AGENTS = "Admin,SuperAdmin,Asesor,Gestor,MesaDeApoyo";


    // Field (Id)
    /** <code>Id</code> field name. */
    public static final String FLD_LOGESTADOSNID = "Id";    
    /** <code>logEstadoSNId</code> attribute field name. */
    public static final String ATTR_FIELD_LOGESTADOSNID = "logEstadoSNId";
    // Field (SolicitudNovedad_Id)
    /** <code>SolicitudNovedad_Id</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADSOLICITUDNOVEDADID = "SolicitudNovedad_Id";    
    /** <code>SolicitudNovedad.solicitudNovedadId</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDAD_SOLICITUDNOVEDADID = "solicitudNovedadSolicitudNovedadId";
    // Field (Fecha)
    /** <code>Fecha</code> field name. */
    public static final String FLD_LOGESTADOSNFECHA = "Fecha";    
    /** <code>logEstadoSNFecha</code> attribute field name. */
    public static final String ATTR_FIELD_LOGESTADOSNFECHA = "logEstadoSNFecha";
    // Field (LoginFuncionario)
    /** <code>LoginFuncionario</code> field name. */
    public static final String FLD_LOGESTADOSNLOGINFUNCIONARIO = "LoginFuncionario";    
    /** <code>LoginFuncionario</code> field length. */
    public static final int FLD_LOGESTADOSNLOGINFUNCIONARIOLENGTH = 50;
    /** <code>logEstadoSNLoginFuncionario</code> attribute field name. */
    public static final String ATTR_FIELD_LOGESTADOSNLOGINFUNCIONARIO = "logEstadoSNLoginFuncionario";
    // Field (Estado)
    /** <code>Estado</code> field name. */
    public static final String FLD_LOGESTADOSNESTADO = "Estado";    
    /** <code>logEstadoSNEstado</code> attribute field name. */
    public static final String ATTR_FIELD_LOGESTADOSNESTADO = "logEstadoSNEstado";
    // Field (EstadoDoc)
    /** <code>EstadoDoc</code> field name. */
    public static final String FLD_LOGESTADOSNESTADODOC = "EstadoDoc";    
    /** <code>logEstadoSNEstadoDoc</code> attribute field name. */
    public static final String ATTR_FIELD_LOGESTADOSNESTADODOC = "logEstadoSNEstadoDoc";

    // Component role (SolicitudNovedad)
    /** <code>SolicitudNovedad</code> role id. */
    public static final String ROLE_ID_SOLICITUDNOVEDAD = "Agr_1583331278848989_Alias";
    /** <code>SolicitudNovedad</code> role name. */
    public static final String ROLE_NAME_SOLICITUDNOVEDAD = "solicitudNovedad";
    /** <code>SolicitudNovedad</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUDNOVEDAD = "Solicitud";

    /** <code>SolicitudNovedad</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUDNOVEDAD = SolicitudNovedadConstants.ROLE_NAME_LOGESTADOS;
    /** <code>SolicitudNovedad</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDAD = "";
    /** <code>SolicitudNovedad</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUDNOVEDAD = SolicitudNovedadConstants.CLASS_NAME;

    /** Agents allowed to navigate through SolicitudNovedad **/
    public static final String SOLICITUDNOVEDAD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";


    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1583331278848231Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>logEstadoSNcrearpagrSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGESTADOSNCREARPAGRSOLICITUDNOVEDAD = "p_agrSolicitudNovedad";
    /** <code>logEstadoSNcrearpagrSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGESTADOSNCREARPAGRSOLICITUDNOVEDAD = "Clas_1583331278848231Ser_1Arg_8_Alias";
    /** <code>logEstadoSNcrearpagrSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGESTADOSNCREARPAGRSOLICITUDNOVEDAD = "Solicitud";
    /** <code>logEstadoSNcrearpatrLoginFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGESTADOSNCREARPATRLOGINFUNCIONARIO = "p_atrLoginFuncionario";
    /** <code>logEstadoSNcrearpatrLoginFuncionario</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGESTADOSNCREARPATRLOGINFUNCIONARIO = "Clas_1583331278848231Ser_1Arg_3_Alias";
    /** <code>logEstadoSNcrearpatrLoginFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGESTADOSNCREARPATRLOGINFUNCIONARIO = "Funcionario";
    /** <code>logEstadoSNcrearpatrEstado</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGESTADOSNCREARPATRESTADO = "p_atrEstado";
    /** <code>logEstadoSNcrearpatrEstado</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGESTADOSNCREARPATRESTADO = "Clas_1583331278848231Ser_1Arg_4_Alias";
    /** <code>logEstadoSNcrearpatrEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGESTADOSNCREARPATRESTADO = "Estado";
    /** <code>logEstadoSNcrearpatrEstadoDoc</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGESTADOSNCREARPATRESTADODOC = "p_atrEstadoDoc";
    /** <code>logEstadoSNcrearpatrEstadoDoc</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGESTADOSNCREARPATRESTADODOC = "Clas_1583331278848231Ser_1Arg_9_Alias";
    /** <code>logEstadoSNcrearpatrEstadoDoc</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGESTADOSNCREARPATRESTADODOC = "Estado Documentación";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1583331278848231Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>logEstadoSNeliminarpthisLogEstadoSN</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_LOGESTADOSNELIMINARPTHISLOGESTADOSN = "p_thisLogEstadoSN";
    /** <code>logEstadoSNeliminarpthisLogEstadoSN</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_LOGESTADOSNELIMINARPTHISLOGESTADOSN = "Clas_1583331278848231Ser_2Arg_1_Alias";
    /** <code>logEstadoSNeliminarpthisLogEstadoSN</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_LOGESTADOSNELIMINARPTHISLOGESTADOSN = "Log Estado";
    // Service (TCREAR)
    /** <code>TCREAR</code> service id. */
    public static final String SERV_ID_TCREAR = "Clas_1583331278848231Ser_4_Alias";
    /** <code>TCREAR</code> service name. */
    public static final String SERV_NAME_TCREAR = "TCREAR";
    /** <code>TCREAR</code> service alias. */
    public static final String SERV_ALIAS_TCREAR = "TCREAR";
    /** Agents allowed to execute the service TCREAR **/
    public static final String TCREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>logEstadoSNTCREARptpagrSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_LOGESTADOSNTCREARPTPAGRSOLICITUDNOVEDAD = "pt_p_agrSolicitudNovedad";
    /** <code>logEstadoSNTCREARptpagrSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_LOGESTADOSNTCREARPTPAGRSOLICITUDNOVEDAD = "Clas_1583331278848231Ser_4Arg_3_Alias";
    /** <code>logEstadoSNTCREARptpagrSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_LOGESTADOSNTCREARPTPAGRSOLICITUDNOVEDAD = "Solicitud";
    /** <code>logEstadoSNTCREARptpatrEstado</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_LOGESTADOSNTCREARPTPATRESTADO = "pt_p_atrEstado";
    /** <code>logEstadoSNTCREARptpatrEstado</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_LOGESTADOSNTCREARPTPATRESTADO = "Clas_1583331278848231Ser_4Arg_5_Alias";
    /** <code>logEstadoSNTCREARptpatrEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_LOGESTADOSNTCREARPTPATRESTADO = "Estado";
    /** <code>logEstadoSNTCREARptpatrEstadoDoc</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_LOGESTADOSNTCREARPTPATRESTADODOC = "pt_p_atrEstadoDoc";
    /** <code>logEstadoSNTCREARptpatrEstadoDoc</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_LOGESTADOSNTCREARPTPATRESTADODOC = "Clas_1583331278848231Ser_4Arg_6_Alias";
    /** <code>logEstadoSNTCREARptpatrEstadoDoc</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_LOGESTADOSNTCREARPTPATRESTADODOC = "Estado Documentación";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_LOGESTADOSNFECHA.toUpperCase(), Constants.Type.DATETIME.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGESTADOSNLOGINFUNCIONARIO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGESTADOSNESTADO.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGESTADOSNESTADODOC.toUpperCase(), Constants.Type.NAT.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_LOGESTADOSNID.toUpperCase(), LOGESTADOSNID_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGESTADOSNFECHA.toUpperCase(), LOGESTADOSNFECHA_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGESTADOSNLOGINFUNCIONARIO.toUpperCase(), LOGESTADOSNLOGINFUNCIONARIO_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGESTADOSNESTADO.toUpperCase(), LOGESTADOSNESTADO_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGESTADOSNESTADODOC.toUpperCase(), LOGESTADOSNESTADODOC_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_SOLICITUDNOVEDAD.toUpperCase(), SOLICITUDNOVEDAD_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'LogEstadoSN', it returns the identification keys
     * - If className is a facet of the inheritance net of 'LogEstadoSN', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_LOGESTADOSNID);
        }
        // Facet 'LogEstadoSN' (This facet)
        if (LogEstadoSNConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_LOGESTADOSNID);
        }
        return returnList;
    }
}
