package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>LogFuncionario</code> model class.
 */
public final class LogFuncionarioConstants {

    private LogFuncionarioConstants() {

    }

    // Class
    /** <code>LogFuncionario</code> class id. */
    public static final String CLASS_ID = "Clas_1586853183488419_Alias";
    /** <code>LogFuncionario</code> class name. */
    public static final String CLASS_NAME = "LogFuncionario";
    /** <code>LogFuncionario</code> class alias. */
    public static final String CLASS_ALIAS = "Histórico Funcionario";
    /** <code>LogFuncionario</code> class table name. */
    public static final String TBL_NAME = "LogFuncionario";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "logFuncionarioId,funcionarioFuncionarioId,logFuncionarioFecha,logFuncionarioLoginFuncionario,logFuncionarioDisponible";

    public static final String DSDSLOGFUNCIONARIO = "DS_LogFuncionario";
    

    // Attribute (logFuncionarioId)
    /** <code>logFuncionarioId</code> attribute id. */
    public static final String ATTR_ID_LOGFUNCIONARIOID = "Clas_1586853183488419Atr_1_Alias";
    /** <code>logFuncionarioId</code> attribute name. */
    public static final String ATTR_NAME_LOGFUNCIONARIOID = "logFuncionarioId";
    /** <code>logFuncionarioId</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGFUNCIONARIOID = "Id.";

    /** <code>logFuncionarioId</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGFUNCIONARIOID = "";
    /** Agents allowed to view the attribute logFuncionarioId **/
    public static final String LOGFUNCIONARIOID_AGENTS = "Admin,SuperAdmin";
    // Attribute (logFuncionarioFecha)
    /** <code>logFuncionarioFecha</code> attribute id. */
    public static final String ATTR_ID_LOGFUNCIONARIOFECHA = "Clas_1586853183488419Atr_2_Alias";
    /** <code>logFuncionarioFecha</code> attribute name. */
    public static final String ATTR_NAME_LOGFUNCIONARIOFECHA = "logFuncionarioFecha";
    /** <code>logFuncionarioFecha</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGFUNCIONARIOFECHA = "Fecha";

    /** <code>logFuncionarioFecha</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGFUNCIONARIOFECHA = "";
    /** Agents allowed to view the attribute logFuncionarioFecha **/
    public static final String LOGFUNCIONARIOFECHA_AGENTS = "Admin,SuperAdmin";
    // Attribute (logFuncionarioLoginFuncionario)
    /** <code>logFuncionarioLoginFuncionario</code> attribute id. */
    public static final String ATTR_ID_LOGFUNCIONARIOLOGINFUNCIONARIO = "Clas_1586853183488419Atr_3_Alias";
    /** <code>logFuncionarioLoginFuncionario</code> attribute name. */
    public static final String ATTR_NAME_LOGFUNCIONARIOLOGINFUNCIONARIO = "logFuncionarioLoginFuncionario";
    /** <code>logFuncionarioLoginFuncionario</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGFUNCIONARIOLOGINFUNCIONARIO = "Login";

    /** <code>logFuncionarioLoginFuncionario</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGFUNCIONARIOLOGINFUNCIONARIO = "";
    /** Agents allowed to view the attribute logFuncionarioLoginFuncionario **/
    public static final String LOGFUNCIONARIOLOGINFUNCIONARIO_AGENTS = "Admin,SuperAdmin";
    // Attribute (logFuncionarioDisponible)
    /** <code>logFuncionarioDisponible</code> attribute id. */
    public static final String ATTR_ID_LOGFUNCIONARIODISPONIBLE = "Clas_1586853183488419Atr_4_Alias";
    /** <code>logFuncionarioDisponible</code> attribute name. */
    public static final String ATTR_NAME_LOGFUNCIONARIODISPONIBLE = "logFuncionarioDisponible";
    /** <code>logFuncionarioDisponible</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGFUNCIONARIODISPONIBLE = "Disponible";

    /** <code>logFuncionarioDisponible</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGFUNCIONARIODISPONIBLE = "";
    /** Agents allowed to view the attribute logFuncionarioDisponible **/
    public static final String LOGFUNCIONARIODISPONIBLE_AGENTS = "Admin,SuperAdmin";


    // Field (Id)
    /** <code>Id</code> field name. */
    public static final String FLD_LOGFUNCIONARIOID = "Id";    
    /** <code>logFuncionarioId</code> attribute field name. */
    public static final String ATTR_FIELD_LOGFUNCIONARIOID = "logFuncionarioId";
    // Field (Funcionario_Id)
    /** <code>Funcionario_Id</code> field name. */
    public static final String FLD_FUNCIONARIOFUNCIONARIOID = "Funcionario_Id";    
    /** <code>Funcionario.funcionarioId</code> attribute field name. */
    public static final String ATTR_FIELD_FUNCIONARIO_FUNCIONARIOID = "funcionarioFuncionarioId";
    // Field (Fecha)
    /** <code>Fecha</code> field name. */
    public static final String FLD_LOGFUNCIONARIOFECHA = "Fecha";    
    /** <code>logFuncionarioFecha</code> attribute field name. */
    public static final String ATTR_FIELD_LOGFUNCIONARIOFECHA = "logFuncionarioFecha";
    // Field (LoginFuncionario)
    /** <code>LoginFuncionario</code> field name. */
    public static final String FLD_LOGFUNCIONARIOLOGINFUNCIONARIO = "LoginFuncionario";    
    /** <code>LoginFuncionario</code> field length. */
    public static final int FLD_LOGFUNCIONARIOLOGINFUNCIONARIOLENGTH = 50;
    /** <code>logFuncionarioLoginFuncionario</code> attribute field name. */
    public static final String ATTR_FIELD_LOGFUNCIONARIOLOGINFUNCIONARIO = "logFuncionarioLoginFuncionario";
    // Field (Disponible)
    /** <code>Disponible</code> field name. */
    public static final String FLD_LOGFUNCIONARIODISPONIBLE = "Disponible";    
    /** <code>logFuncionarioDisponible</code> attribute field name. */
    public static final String ATTR_FIELD_LOGFUNCIONARIODISPONIBLE = "logFuncionarioDisponible";

    // Component role (Funcionario)
    /** <code>Funcionario</code> role id. */
    public static final String ROLE_ID_FUNCIONARIO = "Agr_1586853183488610_Alias";
    /** <code>Funcionario</code> role name. */
    public static final String ROLE_NAME_FUNCIONARIO = "funcionario";
    /** <code>Funcionario</code> role alias. */
    public static final String ROLE_ALIAS_FUNCIONARIO = "Funcionario";

    /** <code>Funcionario</code> inverse role name. */
    public static final String ROLE_INVNAME_FUNCIONARIO = FuncionarioConstants.ROLE_NAME_LOGFUNCIONARIO;
    /** <code>Funcionario</code> role facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIO = "";
    /** <code>Funcionario</code> role target class. */
    public static final String ROLE_TARGET_FUNCIONARIO = FuncionarioConstants.CLASS_NAME;

    /** Agents allowed to navigate through Funcionario **/
    public static final String FUNCIONARIO_AGENTS = "Admin,SuperAdmin";


    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1586853183488419Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>logFuncionariocrearpagrFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGFUNCIONARIOCREARPAGRFUNCIONARIO = "p_agrFuncionario";
    /** <code>logFuncionariocrearpagrFuncionario</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGFUNCIONARIOCREARPAGRFUNCIONARIO = "Clas_1586853183488419Ser_1Arg_9_Alias";
    /** <code>logFuncionariocrearpagrFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGFUNCIONARIOCREARPAGRFUNCIONARIO = "Funcionario";
    /** <code>logFuncionariocrearpatrLoginFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGFUNCIONARIOCREARPATRLOGINFUNCIONARIO = "p_atrLoginFuncionario";
    /** <code>logFuncionariocrearpatrLoginFuncionario</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGFUNCIONARIOCREARPATRLOGINFUNCIONARIO = "Clas_1586853183488419Ser_1Arg_3_Alias";
    /** <code>logFuncionariocrearpatrLoginFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGFUNCIONARIOCREARPATRLOGINFUNCIONARIO = "Login";
    /** <code>logFuncionariocrearpatrDisponible</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGFUNCIONARIOCREARPATRDISPONIBLE = "p_atrDisponible";
    /** <code>logFuncionariocrearpatrDisponible</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGFUNCIONARIOCREARPATRDISPONIBLE = "Clas_1586853183488419Ser_1Arg_4_Alias";
    /** <code>logFuncionariocrearpatrDisponible</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGFUNCIONARIOCREARPATRDISPONIBLE = "Disponible";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1586853183488419Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>logFuncionarioeliminarpthisLogFuncoinario</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_LOGFUNCIONARIOELIMINARPTHISLOGFUNCOINARIO = "p_thisLogFuncoinario";
    /** <code>logFuncionarioeliminarpthisLogFuncoinario</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_LOGFUNCIONARIOELIMINARPTHISLOGFUNCOINARIO = "Clas_1586853183488419Ser_2Arg_1_Alias";
    /** <code>logFuncionarioeliminarpthisLogFuncoinario</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_LOGFUNCIONARIOELIMINARPTHISLOGFUNCOINARIO = "Histórico Funcionario";
    // Service (TCREAR)
    /** <code>TCREAR</code> service id. */
    public static final String SERV_ID_TCREAR = "Clas_1586853183488419Ser_4_Alias";
    /** <code>TCREAR</code> service name. */
    public static final String SERV_NAME_TCREAR = "TCREAR";
    /** <code>TCREAR</code> service alias. */
    public static final String SERV_ALIAS_TCREAR = "TCREAR";
    /** Agents allowed to execute the service TCREAR **/
    public static final String TCREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>logFuncionarioTCREARptpagrFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_LOGFUNCIONARIOTCREARPTPAGRFUNCIONARIO = "pt_p_agrFuncionario";
    /** <code>logFuncionarioTCREARptpagrFuncionario</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_LOGFUNCIONARIOTCREARPTPAGRFUNCIONARIO = "Clas_1586853183488419Ser_4Arg_3_Alias";
    /** <code>logFuncionarioTCREARptpagrFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_LOGFUNCIONARIOTCREARPTPAGRFUNCIONARIO = "Funcionario";
    /** <code>logFuncionarioTCREARptpatrDisponible</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_LOGFUNCIONARIOTCREARPTPATRDISPONIBLE = "pt_p_atrDisponible";
    /** <code>logFuncionarioTCREARptpatrDisponible</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_LOGFUNCIONARIOTCREARPTPATRDISPONIBLE = "Clas_1586853183488419Ser_4Arg_5_Alias";
    /** <code>logFuncionarioTCREARptpatrDisponible</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_LOGFUNCIONARIOTCREARPTPATRDISPONIBLE = "Disponible";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_LOGFUNCIONARIOFECHA.toUpperCase(), Constants.Type.DATETIME.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGFUNCIONARIOLOGINFUNCIONARIO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGFUNCIONARIODISPONIBLE.toUpperCase(), Constants.Type.BOOL.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_LOGFUNCIONARIOID.toUpperCase(), LOGFUNCIONARIOID_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGFUNCIONARIOFECHA.toUpperCase(), LOGFUNCIONARIOFECHA_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGFUNCIONARIOLOGINFUNCIONARIO.toUpperCase(), LOGFUNCIONARIOLOGINFUNCIONARIO_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGFUNCIONARIODISPONIBLE.toUpperCase(), LOGFUNCIONARIODISPONIBLE_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_FUNCIONARIO.toUpperCase(), FUNCIONARIO_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'LogFuncionario', it returns the identification keys
     * - If className is a facet of the inheritance net of 'LogFuncionario', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_LOGFUNCIONARIOID);
        }
        // Facet 'LogFuncionario' (This facet)
        if (LogFuncionarioConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_LOGFUNCIONARIOID);
        }
        return returnList;
    }
}
