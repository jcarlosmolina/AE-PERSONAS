package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>LogUsrSolNov</code> model class.
 */
public final class LogUsrSolNovConstants {

    private LogUsrSolNovConstants() {

    }

    // Class
    /** <code>LogUsrSolNov</code> class id. */
    public static final String CLASS_ID = "Clas_1586856198144763_Alias";
    /** <code>LogUsrSolNov</code> class name. */
    public static final String CLASS_NAME = "LogUsrSolNov";
    /** <code>LogUsrSolNov</code> class alias. */
    public static final String CLASS_ALIAS = "Histórico Usuarios Solicitud Novedad";
    /** <code>LogUsrSolNov</code> class table name. */
    public static final String TBL_NAME = "LogUsrSolNov";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "logUsrSolNovId,solicitudNovedadSolicitudNovedadId,logUsrSolNovFecha,logUsrSolNovLoginFuncionario,logUsrSolNovUsuario";

    public static final String DSDSLOGUSRSOLNOV = "DS_LogUsrSolNov";
    

    // Attribute (logUsrSolNovId)
    /** <code>logUsrSolNovId</code> attribute id. */
    public static final String ATTR_ID_LOGUSRSOLNOVID = "Clas_1586856198144763Atr_1_Alias";
    /** <code>logUsrSolNovId</code> attribute name. */
    public static final String ATTR_NAME_LOGUSRSOLNOVID = "logUsrSolNovId";
    /** <code>logUsrSolNovId</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGUSRSOLNOVID = "Id.";

    /** <code>logUsrSolNovId</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGUSRSOLNOVID = "";
    /** Agents allowed to view the attribute logUsrSolNovId **/
    public static final String LOGUSRSOLNOVID_AGENTS = "Admin,SuperAdmin,MesaDeApoyo";
    // Attribute (logUsrSolNovFecha)
    /** <code>logUsrSolNovFecha</code> attribute id. */
    public static final String ATTR_ID_LOGUSRSOLNOVFECHA = "Clas_1586856198144763Atr_2_Alias";
    /** <code>logUsrSolNovFecha</code> attribute name. */
    public static final String ATTR_NAME_LOGUSRSOLNOVFECHA = "logUsrSolNovFecha";
    /** <code>logUsrSolNovFecha</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGUSRSOLNOVFECHA = "Fecha";

    /** <code>logUsrSolNovFecha</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGUSRSOLNOVFECHA = "";
    /** Agents allowed to view the attribute logUsrSolNovFecha **/
    public static final String LOGUSRSOLNOVFECHA_AGENTS = "Admin,SuperAdmin,MesaDeApoyo";
    // Attribute (logUsrSolNovLoginFuncionario)
    /** <code>logUsrSolNovLoginFuncionario</code> attribute id. */
    public static final String ATTR_ID_LOGUSRSOLNOVLOGINFUNCIONARIO = "Clas_1586856198144763Atr_3_Alias";
    /** <code>logUsrSolNovLoginFuncionario</code> attribute name. */
    public static final String ATTR_NAME_LOGUSRSOLNOVLOGINFUNCIONARIO = "logUsrSolNovLoginFuncionario";
    /** <code>logUsrSolNovLoginFuncionario</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGUSRSOLNOVLOGINFUNCIONARIO = "Login";

    /** <code>logUsrSolNovLoginFuncionario</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGUSRSOLNOVLOGINFUNCIONARIO = "";
    /** Agents allowed to view the attribute logUsrSolNovLoginFuncionario **/
    public static final String LOGUSRSOLNOVLOGINFUNCIONARIO_AGENTS = "Admin,SuperAdmin,MesaDeApoyo";
    // Attribute (logUsrSolNovUsuario)
    /** <code>logUsrSolNovUsuario</code> attribute id. */
    public static final String ATTR_ID_LOGUSRSOLNOVUSUARIO = "Clas_1586856198144763Atr_5_Alias";
    /** <code>logUsrSolNovUsuario</code> attribute name. */
    public static final String ATTR_NAME_LOGUSRSOLNOVUSUARIO = "logUsrSolNovUsuario";
    /** <code>logUsrSolNovUsuario</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGUSRSOLNOVUSUARIO = "Usuario";

    /** <code>logUsrSolNovUsuario</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGUSRSOLNOVUSUARIO = "";
    /** Agents allowed to view the attribute logUsrSolNovUsuario **/
    public static final String LOGUSRSOLNOVUSUARIO_AGENTS = "Admin,SuperAdmin,MesaDeApoyo";


    // Field (Id)
    /** <code>Id</code> field name. */
    public static final String FLD_LOGUSRSOLNOVID = "Id";    
    /** <code>logUsrSolNovId</code> attribute field name. */
    public static final String ATTR_FIELD_LOGUSRSOLNOVID = "logUsrSolNovId";
    // Field (SolicitudNovedad_Id)
    /** <code>SolicitudNovedad_Id</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADSOLICITUDNOVEDADID = "SolicitudNovedad_Id";    
    /** <code>SolicitudNovedad.solicitudNovedadId</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDNOVEDAD_SOLICITUDNOVEDADID = "solicitudNovedadSolicitudNovedadId";
    // Field (Fecha)
    /** <code>Fecha</code> field name. */
    public static final String FLD_LOGUSRSOLNOVFECHA = "Fecha";    
    /** <code>logUsrSolNovFecha</code> attribute field name. */
    public static final String ATTR_FIELD_LOGUSRSOLNOVFECHA = "logUsrSolNovFecha";
    // Field (LoginFuncionario)
    /** <code>LoginFuncionario</code> field name. */
    public static final String FLD_LOGUSRSOLNOVLOGINFUNCIONARIO = "LoginFuncionario";    
    /** <code>LoginFuncionario</code> field length. */
    public static final int FLD_LOGUSRSOLNOVLOGINFUNCIONARIOLENGTH = 50;
    /** <code>logUsrSolNovLoginFuncionario</code> attribute field name. */
    public static final String ATTR_FIELD_LOGUSRSOLNOVLOGINFUNCIONARIO = "logUsrSolNovLoginFuncionario";
    // Field (Usuario)
    /** <code>Usuario</code> field name. */
    public static final String FLD_LOGUSRSOLNOVUSUARIO = "Usuario";    
    /** <code>Usuario</code> field length. */
    public static final int FLD_LOGUSRSOLNOVUSUARIOLENGTH = 50;
    /** <code>logUsrSolNovUsuario</code> attribute field name. */
    public static final String ATTR_FIELD_LOGUSRSOLNOVUSUARIO = "logUsrSolNovUsuario";

    // Component role (SolicitudNovedad)
    /** <code>SolicitudNovedad</code> role id. */
    public static final String ROLE_ID_SOLICITUDNOVEDAD = "Agr_1586856329216478_Alias";
    /** <code>SolicitudNovedad</code> role name. */
    public static final String ROLE_NAME_SOLICITUDNOVEDAD = "solicitudNovedad";
    /** <code>SolicitudNovedad</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUDNOVEDAD = "SolicitudNovedad";

    /** <code>SolicitudNovedad</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUDNOVEDAD = SolicitudNovedadConstants.ROLE_NAME_LOGUSRSOLNOV;
    /** <code>SolicitudNovedad</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDAD = "";
    /** <code>SolicitudNovedad</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUDNOVEDAD = SolicitudNovedadConstants.CLASS_NAME;

    /** Agents allowed to navigate through SolicitudNovedad **/
    public static final String SOLICITUDNOVEDAD_AGENTS = "Admin,SuperAdmin,MesaDeApoyo";


    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1586856198144763Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>logUsrSolNovcrearpagrSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGUSRSOLNOVCREARPAGRSOLICITUDNOVEDAD = "p_agrSolicitudNovedad";
    /** <code>logUsrSolNovcrearpagrSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGUSRSOLNOVCREARPAGRSOLICITUDNOVEDAD = "Clas_1586856198144763Ser_1Arg_5_Alias";
    /** <code>logUsrSolNovcrearpagrSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGUSRSOLNOVCREARPAGRSOLICITUDNOVEDAD = "SolicitudNovedad";
    /** <code>logUsrSolNovcrearpatrLoginFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGUSRSOLNOVCREARPATRLOGINFUNCIONARIO = "p_atrLoginFuncionario";
    /** <code>logUsrSolNovcrearpatrLoginFuncionario</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGUSRSOLNOVCREARPATRLOGINFUNCIONARIO = "Clas_1586856198144763Ser_1Arg_2_Alias";
    /** <code>logUsrSolNovcrearpatrLoginFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGUSRSOLNOVCREARPATRLOGINFUNCIONARIO = "Login";
    /** <code>logUsrSolNovcrearpatrUsuario</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGUSRSOLNOVCREARPATRUSUARIO = "p_atrUsuario";
    /** <code>logUsrSolNovcrearpatrUsuario</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGUSRSOLNOVCREARPATRUSUARIO = "Clas_1586856198144763Ser_1Arg_4_Alias";
    /** <code>logUsrSolNovcrearpatrUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGUSRSOLNOVCREARPATRUSUARIO = "Usuario";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1586856198144763Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>logUsrSolNoveliminarpthisLogUsrSolNov</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_LOGUSRSOLNOVELIMINARPTHISLOGUSRSOLNOV = "p_thisLogUsrSolNov";
    /** <code>logUsrSolNoveliminarpthisLogUsrSolNov</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_LOGUSRSOLNOVELIMINARPTHISLOGUSRSOLNOV = "Clas_1586856198144763Ser_2Arg_1_Alias";
    /** <code>logUsrSolNoveliminarpthisLogUsrSolNov</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_LOGUSRSOLNOVELIMINARPTHISLOGUSRSOLNOV = "Histórico Usuarios Solicitud Novedad";
    // Service (TCREAR)
    /** <code>TCREAR</code> service id. */
    public static final String SERV_ID_TCREAR = "Clas_1586856198144763Ser_4_Alias";
    /** <code>TCREAR</code> service name. */
    public static final String SERV_NAME_TCREAR = "TCREAR";
    /** <code>TCREAR</code> service alias. */
    public static final String SERV_ALIAS_TCREAR = "TCREAR";
    /** Agents allowed to execute the service TCREAR **/
    public static final String TCREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>logUsrSolNovTCREARptpagrSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_LOGUSRSOLNOVTCREARPTPAGRSOLICITUDNOVEDAD = "pt_p_agrSolicitudNovedad";
    /** <code>logUsrSolNovTCREARptpagrSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_LOGUSRSOLNOVTCREARPTPAGRSOLICITUDNOVEDAD = "Clas_1586856198144763Ser_4Arg_3_Alias";
    /** <code>logUsrSolNovTCREARptpagrSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_LOGUSRSOLNOVTCREARPTPAGRSOLICITUDNOVEDAD = "SolicitudNovedad";
    /** <code>logUsrSolNovTCREARptpatrUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_LOGUSRSOLNOVTCREARPTPATRUSUARIO = "pt_p_atrUsuario";
    /** <code>logUsrSolNovTCREARptpatrUsuario</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_LOGUSRSOLNOVTCREARPTPATRUSUARIO = "Clas_1586856198144763Ser_4Arg_5_Alias";
    /** <code>logUsrSolNovTCREARptpatrUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_LOGUSRSOLNOVTCREARPTPATRUSUARIO = "Usuario";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_LOGUSRSOLNOVFECHA.toUpperCase(), Constants.Type.DATETIME.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGUSRSOLNOVLOGINFUNCIONARIO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGUSRSOLNOVUSUARIO.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_LOGUSRSOLNOVID.toUpperCase(), LOGUSRSOLNOVID_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGUSRSOLNOVFECHA.toUpperCase(), LOGUSRSOLNOVFECHA_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGUSRSOLNOVLOGINFUNCIONARIO.toUpperCase(), LOGUSRSOLNOVLOGINFUNCIONARIO_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGUSRSOLNOVUSUARIO.toUpperCase(), LOGUSRSOLNOVUSUARIO_AGENTS);
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
     * - If className is 'LogUsrSolNov', it returns the identification keys
     * - If className is a facet of the inheritance net of 'LogUsrSolNov', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_LOGUSRSOLNOVID);
        }
        // Facet 'LogUsrSolNov' (This facet)
        if (LogUsrSolNovConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_LOGUSRSOLNOVID);
        }
        return returnList;
    }
}
