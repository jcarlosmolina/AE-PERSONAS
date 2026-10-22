package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>ParamConfig</code> model class.
 */
public final class ParamConfigConstants {

    private ParamConfigConstants() {

    }

    // Class
    /** <code>ParamConfig</code> class id. */
    public static final String CLASS_ID = "Clas_1431630118912680_Alias";
    /** <code>ParamConfig</code> class name. */
    public static final String CLASS_NAME = "ParamConfig";
    /** <code>ParamConfig</code> class alias. */
    public static final String CLASS_ALIAS = "Parámetro Conf.";
    /** <code>ParamConfig</code> class table name. */
    public static final String TBL_NAME = "ParamConfig";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "paramConfigCodigo,paramConfigDescripcion,paramConfigValor,paramConfigEsNumerico";

    public static final String DSICPARAMCONFIG = "IC_ParamConfig";
    public static final String DSDSPARAMCONFIGPIU = "DS_ParamConfig_PIU";
    public static final String DSDSPARAMCONFIGIIUMAESTRO = "DS_ParamConfig_IIUMaestro";
    

    // Attribute (paramConfigCodigo)
    /** <code>paramConfigCodigo</code> attribute id. */
    public static final String ATTR_ID_PARAMCONFIGCODIGO = "Clas_1431630118912680Atr_1_Alias";
    /** <code>paramConfigCodigo</code> attribute name. */
    public static final String ATTR_NAME_PARAMCONFIGCODIGO = "paramConfigCodigo";
    /** <code>paramConfigCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_PARAMCONFIGCODIGO = "Código";

    /** <code>paramConfigCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_PARAMCONFIGCODIGO = "";
    /** Agents allowed to view the attribute paramConfigCodigo **/
    public static final String PARAMCONFIGCODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (paramConfigDescripcion)
    /** <code>paramConfigDescripcion</code> attribute id. */
    public static final String ATTR_ID_PARAMCONFIGDESCRIPCION = "Clas_1431630118912680Atr_2_Alias";
    /** <code>paramConfigDescripcion</code> attribute name. */
    public static final String ATTR_NAME_PARAMCONFIGDESCRIPCION = "paramConfigDescripcion";
    /** <code>paramConfigDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_PARAMCONFIGDESCRIPCION = "Descripción";

    /** <code>paramConfigDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_PARAMCONFIGDESCRIPCION = "";
    /** Agents allowed to view the attribute paramConfigDescripcion **/
    public static final String PARAMCONFIGDESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Gestor,MesaDeApoyo";
    // Attribute (paramConfigValor)
    /** <code>paramConfigValor</code> attribute id. */
    public static final String ATTR_ID_PARAMCONFIGVALOR = "Clas_1431630118912680Atr_3_Alias";
    /** <code>paramConfigValor</code> attribute name. */
    public static final String ATTR_NAME_PARAMCONFIGVALOR = "paramConfigValor";
    /** <code>paramConfigValor</code> attribute alias. */
    public static final String ATTR_ALIAS_PARAMCONFIGVALOR = "Valor";

    /** <code>paramConfigValor</code> attribute facet sequence. */
    public static final String PATH_FACETS_PARAMCONFIGVALOR = "";
    /** Agents allowed to view the attribute paramConfigValor **/
    public static final String PARAMCONFIGVALOR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Gestor,MesaDeApoyo";
    // Attribute (paramConfigEsNumerico)
    /** <code>paramConfigEsNumerico</code> attribute id. */
    public static final String ATTR_ID_PARAMCONFIGESNUMERICO = "Clas_1431630118912680Atr_4_Alias";
    /** <code>paramConfigEsNumerico</code> attribute name. */
    public static final String ATTR_NAME_PARAMCONFIGESNUMERICO = "paramConfigEsNumerico";
    /** <code>paramConfigEsNumerico</code> attribute alias. */
    public static final String ATTR_ALIAS_PARAMCONFIGESNUMERICO = "Es numérico";

    /** <code>paramConfigEsNumerico</code> attribute facet sequence. */
    public static final String PATH_FACETS_PARAMCONFIGESNUMERICO = "";
    /** Agents allowed to view the attribute paramConfigEsNumerico **/
    public static final String PARAMCONFIGESNUMERICO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Gestor,MesaDeApoyo";


    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_PARAMCONFIGCODIGO = "Codigo";    
    /** <code>Codigo</code> field length. */
    public static final int FLD_PARAMCONFIGCODIGOLENGTH = 50;
    /** <code>paramConfigCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_PARAMCONFIGCODIGO = "paramConfigCodigo";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_PARAMCONFIGDESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_PARAMCONFIGDESCRIPCIONLENGTH = 255;
    /** <code>paramConfigDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_PARAMCONFIGDESCRIPCION = "paramConfigDescripcion";
    // Field (Valor)
    /** <code>Valor</code> field name. */
    public static final String FLD_PARAMCONFIGVALOR = "Valor";    
    /** <code>Valor</code> field length. */
    public static final int FLD_PARAMCONFIGVALORLENGTH = 999;
    /** <code>paramConfigValor</code> attribute field name. */
    public static final String ATTR_FIELD_PARAMCONFIGVALOR = "paramConfigValor";
    // Field (EsNumerico)
    /** <code>EsNumerico</code> field name. */
    public static final String FLD_PARAMCONFIGESNUMERICO = "EsNumerico";    
    /** <code>paramConfigEsNumerico</code> attribute field name. */
    public static final String ATTR_FIELD_PARAMCONFIGESNUMERICO = "paramConfigEsNumerico";


    // Compound role (Logs)
    /** <code>Logs</code> role id. */
    public static final String ROLE_ID_LOGS = "Agr_1431631298560990_Alias";
    /** <code>Logs</code> role name. */
    public static final String ROLE_NAME_LOGS = "logs";
    /** <code>ParamConfig</code> role alias. */
    public static final String ROLE_ALIAS_LOGS = "Logs";


    /** <code>Logs</code> inverse role name. */
    public static final String ROLE_INVNAME_LOGS = LogParamConstants.ROLE_NAME_PARAMCONFIG;
    /** <code>Logs</code> role facet sequence. */
    public static final String PATH_FACETS_LOGS = "";
    /** <code>Logs</code> role target class. */
    public static final String ROLE_TARGET_LOGS = LogParamConstants.CLASS_NAME;
    /** Agents allowed to navigate through Logs **/
    public static final String LOGS_AGENTS = "Admin,SuperAdmin,Asesor,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431630118912680Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>paramConfigcrearpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PARAMCONFIGCREARPATRCODIGO = "p_atrCodigo";
    /** <code>paramConfigcrearpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PARAMCONFIGCREARPATRCODIGO = "Clas_1431630118912680Ser_1Arg_1_Alias";
    /** <code>paramConfigcrearpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PARAMCONFIGCREARPATRCODIGO = "Código";
    /** <code>paramConfigcrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PARAMCONFIGCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>paramConfigcrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PARAMCONFIGCREARPATRDESCRIPCION = "Clas_1431630118912680Ser_1Arg_2_Alias";
    /** <code>paramConfigcrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PARAMCONFIGCREARPATRDESCRIPCION = "Descripción";
    /** <code>paramConfigcrearpatrValor</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PARAMCONFIGCREARPATRVALOR = "p_atrValor";
    /** <code>paramConfigcrearpatrValor</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PARAMCONFIGCREARPATRVALOR = "Clas_1431630118912680Ser_1Arg_3_Alias";
    /** <code>paramConfigcrearpatrValor</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PARAMCONFIGCREARPATRVALOR = "Valor";
    /** <code>paramConfigcrearpatrEsNumerico</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PARAMCONFIGCREARPATRESNUMERICO = "p_atrEsNumerico";
    /** <code>paramConfigcrearpatrEsNumerico</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PARAMCONFIGCREARPATRESNUMERICO = "Clas_1431630118912680Ser_1Arg_4_Alias";
    /** <code>paramConfigcrearpatrEsNumerico</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PARAMCONFIGCREARPATRESNUMERICO = "Es numérico";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431630118912680Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>paramConfigeliminarpthisParamConfig</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_PARAMCONFIGELIMINARPTHISPARAMCONFIG = "p_thisParamConfig";
    /** <code>paramConfigeliminarpthisParamConfig</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_PARAMCONFIGELIMINARPTHISPARAMCONFIG = "Clas_1431630118912680Ser_2Arg_1_Alias";
    /** <code>paramConfigeliminarpthisParamConfig</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_PARAMCONFIGELIMINARPTHISPARAMCONFIG = "Parámetro Conf.";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1431630118912680Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>paramConfigmodificarpthisParamConfig</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PARAMCONFIGMODIFICARPTHISPARAMCONFIG = "p_thisParamConfig";
    /** <code>paramConfigmodificarpthisParamConfig</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PARAMCONFIGMODIFICARPTHISPARAMCONFIG = "Clas_1431630118912680Ser_3Arg_1_Alias";
    /** <code>paramConfigmodificarpthisParamConfig</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PARAMCONFIGMODIFICARPTHISPARAMCONFIG = "Parámetro Conf.";
    /** <code>paramConfigmodificarpValor</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PARAMCONFIGMODIFICARPVALOR = "p_Valor";
    /** <code>paramConfigmodificarpValor</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PARAMCONFIGMODIFICARPVALOR = "Clas_1431630118912680Ser_3Arg_2_Alias";
    /** <code>paramConfigmodificarpValor</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PARAMCONFIGMODIFICARPVALOR = "Valor";
    // Service (TMODIFICAR)
    /** <code>TMODIFICAR</code> service id. */
    public static final String SERV_ID_TMODIFICAR = "Clas_1431630118912680Ser_4_Alias";
    /** <code>TMODIFICAR</code> service name. */
    public static final String SERV_NAME_TMODIFICAR = "TMODIFICAR";
    /** <code>TMODIFICAR</code> service alias. */
    public static final String SERV_ALIAS_TMODIFICAR = "Modificar parámetro de configuración";
    /** Agents allowed to execute the service TMODIFICAR **/
    public static final String TMODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>TMODIFICAR</code> precondition 0 id. */
    public static final String PRE_ID_TMODIFICAR_0 = "Clas_1431630118912680Pre_1_MsgError";
    /** <code>TMODIFICAR</code> precondition 1 id. */
    public static final String PRE_ID_TMODIFICAR_1 = "Clas_1431630118912680Pre_2_MsgError";
    // Inbound arguments
    /** <code>paramConfigTMODIFICARpthisParamConfig</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_PARAMCONFIGTMODIFICARPTHISPARAMCONFIG = "p_thisParamConfig";
    /** <code>paramConfigTMODIFICARpthisParamConfig</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_PARAMCONFIGTMODIFICARPTHISPARAMCONFIG = "Clas_1431630118912680Ser_4Arg_1_Alias";
    /** <code>paramConfigTMODIFICARpthisParamConfig</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_PARAMCONFIGTMODIFICARPTHISPARAMCONFIG = "Parámetro Conf.";
    /** <code>paramConfigTMODIFICARptpValor</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_PARAMCONFIGTMODIFICARPTPVALOR = "pt_p_Valor";
    /** <code>paramConfigTMODIFICARptpValor</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_PARAMCONFIGTMODIFICARPTPVALOR = "Clas_1431630118912680Ser_4Arg_2_Alias";
    /** <code>paramConfigTMODIFICARptpValor</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_PARAMCONFIGTMODIFICARPTPVALOR = "Valor";

    public static final String FILTER_NAME_IFPARAMCONFIGPPORCODIGO = "iF_ParamConfigpPorCodigo";
    public static final String VAR_NAME_IFPARAMCONFIGPPORCODIGO_VCODIGO = "v_Codigo";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_PARAMCONFIGDESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PARAMCONFIGVALOR.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PARAMCONFIGESNUMERICO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_PARAMCONFIGCODIGO.toUpperCase(), PARAMCONFIGCODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PARAMCONFIGDESCRIPCION.toUpperCase(), PARAMCONFIGDESCRIPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_PARAMCONFIGVALOR.toUpperCase(), PARAMCONFIGVALOR_AGENTS);
    	attributeAgents.put(ATTR_NAME_PARAMCONFIGESNUMERICO.toUpperCase(), PARAMCONFIGESNUMERICO_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'ParamConfig', it returns the identification keys
     * - If className is a facet of the inheritance net of 'ParamConfig', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_PARAMCONFIGCODIGO);
        }
        // Facet 'ParamConfig' (This facet)
        if (ParamConfigConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_PARAMCONFIGCODIGO);
        }
        return returnList;
    }
}
