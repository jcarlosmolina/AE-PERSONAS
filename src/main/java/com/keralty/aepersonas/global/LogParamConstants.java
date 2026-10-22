package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>LogParam</code> model class.
 */
public final class LogParamConstants {

    private LogParamConstants() {

    }

    // Class
    /** <code>LogParam</code> class id. */
    public static final String CLASS_ID = "Clas_1431631298560437_Alias";
    /** <code>LogParam</code> class name. */
    public static final String CLASS_NAME = "LogParam";
    /** <code>LogParam</code> class alias. */
    public static final String CLASS_ALIAS = "Log Parámetros Conf.";
    /** <code>LogParam</code> class table name. */
    public static final String TBL_NAME = "LogParam";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "logParamCodigo,paramConfigParamConfigCodigo,logParamFecha,logParamUsuario,logParamNombreUsuario,logParamValorAnterior,logParamNuevoValor";

    public static final String DSDSLOGPARAMPIU = "DS_LogParam_PIU";
    

    // Attribute (logParamCodigo)
    /** <code>logParamCodigo</code> attribute id. */
    public static final String ATTR_ID_LOGPARAMCODIGO = "Clas_1431631298560437Atr_1_Alias";
    /** <code>logParamCodigo</code> attribute name. */
    public static final String ATTR_NAME_LOGPARAMCODIGO = "logParamCodigo";
    /** <code>logParamCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGPARAMCODIGO = "Código";

    /** <code>logParamCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGPARAMCODIGO = "";
    /** Agents allowed to view the attribute logParamCodigo **/
    public static final String LOGPARAMCODIGO_AGENTS = "Admin,SuperAdmin";
    // Attribute (logParamFecha)
    /** <code>logParamFecha</code> attribute id. */
    public static final String ATTR_ID_LOGPARAMFECHA = "Clas_1431631298560437Atr_2_Alias";
    /** <code>logParamFecha</code> attribute name. */
    public static final String ATTR_NAME_LOGPARAMFECHA = "logParamFecha";
    /** <code>logParamFecha</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGPARAMFECHA = "Fecha";

    /** <code>logParamFecha</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGPARAMFECHA = "";
    /** Agents allowed to view the attribute logParamFecha **/
    public static final String LOGPARAMFECHA_AGENTS = "Admin,SuperAdmin";
    // Attribute (logParamUsuario)
    /** <code>logParamUsuario</code> attribute id. */
    public static final String ATTR_ID_LOGPARAMUSUARIO = "Clas_1431631298560437Atr_3_Alias";
    /** <code>logParamUsuario</code> attribute name. */
    public static final String ATTR_NAME_LOGPARAMUSUARIO = "logParamUsuario";
    /** <code>logParamUsuario</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGPARAMUSUARIO = "Usuario";

    /** <code>logParamUsuario</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGPARAMUSUARIO = "";
    /** Agents allowed to view the attribute logParamUsuario **/
    public static final String LOGPARAMUSUARIO_AGENTS = "Admin,SuperAdmin";
    // Attribute (logParamNombreUsuario)
    /** <code>logParamNombreUsuario</code> attribute id. */
    public static final String ATTR_ID_LOGPARAMNOMBREUSUARIO = "Clas_1431631298560437Atr_6_Alias";
    /** <code>logParamNombreUsuario</code> attribute name. */
    public static final String ATTR_NAME_LOGPARAMNOMBREUSUARIO = "logParamNombreUsuario";
    /** <code>logParamNombreUsuario</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGPARAMNOMBREUSUARIO = "Nombre usuario";

    /** <code>logParamNombreUsuario</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGPARAMNOMBREUSUARIO = "";
    /** Agents allowed to view the attribute logParamNombreUsuario **/
    public static final String LOGPARAMNOMBREUSUARIO_AGENTS = "Admin,SuperAdmin";
    // Attribute (logParamValorAnterior)
    /** <code>logParamValorAnterior</code> attribute id. */
    public static final String ATTR_ID_LOGPARAMVALORANTERIOR = "Clas_1431631298560437Atr_4_Alias";
    /** <code>logParamValorAnterior</code> attribute name. */
    public static final String ATTR_NAME_LOGPARAMVALORANTERIOR = "logParamValorAnterior";
    /** <code>logParamValorAnterior</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGPARAMVALORANTERIOR = "Valor anterior";

    /** <code>logParamValorAnterior</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGPARAMVALORANTERIOR = "";
    /** Agents allowed to view the attribute logParamValorAnterior **/
    public static final String LOGPARAMVALORANTERIOR_AGENTS = "Admin,SuperAdmin";
    // Attribute (logParamNuevoValor)
    /** <code>logParamNuevoValor</code> attribute id. */
    public static final String ATTR_ID_LOGPARAMNUEVOVALOR = "Clas_1431631298560437Atr_5_Alias";
    /** <code>logParamNuevoValor</code> attribute name. */
    public static final String ATTR_NAME_LOGPARAMNUEVOVALOR = "logParamNuevoValor";
    /** <code>logParamNuevoValor</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGPARAMNUEVOVALOR = "Nuevo valor";

    /** <code>logParamNuevoValor</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGPARAMNUEVOVALOR = "";
    /** Agents allowed to view the attribute logParamNuevoValor **/
    public static final String LOGPARAMNUEVOVALOR_AGENTS = "Admin,SuperAdmin";


    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_LOGPARAMCODIGO = "Codigo";    
    /** <code>logParamCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_LOGPARAMCODIGO = "logParamCodigo";
    // Field (ParamConfig_Codigo)
    /** <code>ParamConfig_Codigo</code> field name. */
    public static final String FLD_PARAMCONFIGPARAMCONFIGCODIGO = "ParamConfig_Codigo";    
    /** <code>ParamConfig_Codigo</code> field length. */
    public static final int FLD_PARAMCONFIGPARAMCONFIGCODIGOLENGTH = 50;
    /** <code>ParamConfig.paramConfigCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_PARAMCONFIG_PARAMCONFIGCODIGO = "paramConfigParamConfigCodigo";
    // Field (Fecha)
    /** <code>Fecha</code> field name. */
    public static final String FLD_LOGPARAMFECHA = "Fecha";    
    /** <code>logParamFecha</code> attribute field name. */
    public static final String ATTR_FIELD_LOGPARAMFECHA = "logParamFecha";
    // Field (Usuario)
    /** <code>Usuario</code> field name. */
    public static final String FLD_LOGPARAMUSUARIO = "Usuario";    
    /** <code>Usuario</code> field length. */
    public static final int FLD_LOGPARAMUSUARIOLENGTH = 50;
    /** <code>logParamUsuario</code> attribute field name. */
    public static final String ATTR_FIELD_LOGPARAMUSUARIO = "logParamUsuario";
    // Field (NombreUsuario)
    /** <code>NombreUsuario</code> field name. */
    public static final String FLD_LOGPARAMNOMBREUSUARIO = "NombreUsuario";    
    /** <code>NombreUsuario</code> field length. */
    public static final int FLD_LOGPARAMNOMBREUSUARIOLENGTH = 255;
    /** <code>logParamNombreUsuario</code> attribute field name. */
    public static final String ATTR_FIELD_LOGPARAMNOMBREUSUARIO = "logParamNombreUsuario";
    // Field (ValorAnterior)
    /** <code>ValorAnterior</code> field name. */
    public static final String FLD_LOGPARAMVALORANTERIOR = "ValorAnterior";    
    /** <code>ValorAnterior</code> field length. */
    public static final int FLD_LOGPARAMVALORANTERIORLENGTH = 999;
    /** <code>logParamValorAnterior</code> attribute field name. */
    public static final String ATTR_FIELD_LOGPARAMVALORANTERIOR = "logParamValorAnterior";
    // Field (NuevoValor)
    /** <code>NuevoValor</code> field name. */
    public static final String FLD_LOGPARAMNUEVOVALOR = "NuevoValor";    
    /** <code>NuevoValor</code> field length. */
    public static final int FLD_LOGPARAMNUEVOVALORLENGTH = 999;
    /** <code>logParamNuevoValor</code> attribute field name. */
    public static final String ATTR_FIELD_LOGPARAMNUEVOVALOR = "logParamNuevoValor";

    // Component role (ParamConfig)
    /** <code>ParamConfig</code> role id. */
    public static final String ROLE_ID_PARAMCONFIG = "Agr_1431631298560990_Alias";
    /** <code>ParamConfig</code> role name. */
    public static final String ROLE_NAME_PARAMCONFIG = "paramConfig";
    /** <code>ParamConfig</code> role alias. */
    public static final String ROLE_ALIAS_PARAMCONFIG = "Parámetro Conf.";

    /** <code>ParamConfig</code> inverse role name. */
    public static final String ROLE_INVNAME_PARAMCONFIG = ParamConfigConstants.ROLE_NAME_LOGS;
    /** <code>ParamConfig</code> role facet sequence. */
    public static final String PATH_FACETS_PARAMCONFIG = "";
    /** <code>ParamConfig</code> role target class. */
    public static final String ROLE_TARGET_PARAMCONFIG = ParamConfigConstants.CLASS_NAME;

    /** Agents allowed to navigate through ParamConfig **/
    public static final String PARAMCONFIG_AGENTS = "Admin,SuperAdmin";


    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431631298560437Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>logParamcrearpagrParamConfig</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGPARAMCREARPAGRPARAMCONFIG = "p_agrParamConfig";
    /** <code>logParamcrearpagrParamConfig</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGPARAMCREARPAGRPARAMCONFIG = "Clas_1431631298560437Ser_1Arg_2_Alias";
    /** <code>logParamcrearpagrParamConfig</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGPARAMCREARPAGRPARAMCONFIG = "Parámetro Conf.";
    /** <code>logParamcrearpatrFecha</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGPARAMCREARPATRFECHA = "p_atrFecha";
    /** <code>logParamcrearpatrFecha</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGPARAMCREARPATRFECHA = "Clas_1431631298560437Ser_1Arg_3_Alias";
    /** <code>logParamcrearpatrFecha</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGPARAMCREARPATRFECHA = "Fecha";
    /** <code>logParamcrearpatrUsuario</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGPARAMCREARPATRUSUARIO = "p_atrUsuario";
    /** <code>logParamcrearpatrUsuario</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGPARAMCREARPATRUSUARIO = "Clas_1431631298560437Ser_1Arg_4_Alias";
    /** <code>logParamcrearpatrUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGPARAMCREARPATRUSUARIO = "Usuario";
    /** <code>logParamcrearpatrValorAnterior</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGPARAMCREARPATRVALORANTERIOR = "p_atrValorAnterior";
    /** <code>logParamcrearpatrValorAnterior</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGPARAMCREARPATRVALORANTERIOR = "Clas_1431631298560437Ser_1Arg_5_Alias";
    /** <code>logParamcrearpatrValorAnterior</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGPARAMCREARPATRVALORANTERIOR = "Valor anterior";
    /** <code>logParamcrearpatrNuevoValor</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGPARAMCREARPATRNUEVOVALOR = "p_atrNuevoValor";
    /** <code>logParamcrearpatrNuevoValor</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGPARAMCREARPATRNUEVOVALOR = "Clas_1431631298560437Ser_1Arg_6_Alias";
    /** <code>logParamcrearpatrNuevoValor</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGPARAMCREARPATRNUEVOVALOR = "Nuevo valor";
    /** <code>logParamcrearpatrNombreUsuario</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGPARAMCREARPATRNOMBREUSUARIO = "p_atrNombreUsuario";
    /** <code>logParamcrearpatrNombreUsuario</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGPARAMCREARPATRNOMBREUSUARIO = "Clas_1431631298560437Ser_1Arg_7_Alias";
    /** <code>logParamcrearpatrNombreUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGPARAMCREARPATRNOMBREUSUARIO = "Nombre usuario";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431631298560437Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>logParameliminarpthisLogParam</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_LOGPARAMELIMINARPTHISLOGPARAM = "p_thisLogParam";
    /** <code>logParameliminarpthisLogParam</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_LOGPARAMELIMINARPTHISLOGPARAM = "Clas_1431631298560437Ser_2Arg_1_Alias";
    /** <code>logParameliminarpthisLogParam</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_LOGPARAMELIMINARPTHISLOGPARAM = "Log Parámetros Conf.";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_LOGPARAMFECHA.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGPARAMUSUARIO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGPARAMNOMBREUSUARIO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGPARAMVALORANTERIOR.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGPARAMNUEVOVALOR.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_LOGPARAMCODIGO.toUpperCase(), LOGPARAMCODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGPARAMFECHA.toUpperCase(), LOGPARAMFECHA_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGPARAMUSUARIO.toUpperCase(), LOGPARAMUSUARIO_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGPARAMNOMBREUSUARIO.toUpperCase(), LOGPARAMNOMBREUSUARIO_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGPARAMVALORANTERIOR.toUpperCase(), LOGPARAMVALORANTERIOR_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGPARAMNUEVOVALOR.toUpperCase(), LOGPARAMNUEVOVALOR_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_PARAMCONFIG.toUpperCase(), PARAMCONFIG_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'LogParam', it returns the identification keys
     * - If className is a facet of the inheritance net of 'LogParam', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_LOGPARAMCODIGO);
        }
        // Facet 'LogParam' (This facet)
        if (LogParamConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_LOGPARAMCODIGO);
        }
        return returnList;
    }
}
