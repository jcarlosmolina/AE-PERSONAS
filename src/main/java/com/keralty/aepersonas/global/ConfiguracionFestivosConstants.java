package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>ConfiguracionFestivos</code> model class.
 */
public final class ConfiguracionFestivosConstants {

    private ConfiguracionFestivosConstants() {

    }

    // Class
    /** <code>ConfiguracionFestivos</code> class id. */
    public static final String CLASS_ID = "Clas_1586872451072264_Alias";
    /** <code>ConfiguracionFestivos</code> class name. */
    public static final String CLASS_NAME = "ConfiguracionFestivos";
    /** <code>ConfiguracionFestivos</code> class alias. */
    public static final String CLASS_ALIAS = "Configuración Festivos";
    /** <code>ConfiguracionFestivos</code> class table name. */
    public static final String TBL_NAME = "ConfiguracionFestivos";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "configuracionFestivosId,configuracionFestivosDiaFestivo";

    

    // Attribute (configuracionFestivosId)
    /** <code>configuracionFestivosId</code> attribute id. */
    public static final String ATTR_ID_CONFIGURACIONFESTIVOSID = "Clas_1586872451072264Atr_1_Alias";
    /** <code>configuracionFestivosId</code> attribute name. */
    public static final String ATTR_NAME_CONFIGURACIONFESTIVOSID = "configuracionFestivosId";
    /** <code>configuracionFestivosId</code> attribute alias. */
    public static final String ATTR_ALIAS_CONFIGURACIONFESTIVOSID = "Id.";

    /** <code>configuracionFestivosId</code> attribute facet sequence. */
    public static final String PATH_FACETS_CONFIGURACIONFESTIVOSID = "";
    /** Agents allowed to view the attribute configuracionFestivosId **/
    public static final String CONFIGURACIONFESTIVOSID_AGENTS = "SuperAdmin,Gestor";
    // Attribute (configuracionFestivosDiaFestivo)
    /** <code>configuracionFestivosDiaFestivo</code> attribute id. */
    public static final String ATTR_ID_CONFIGURACIONFESTIVOSDIAFESTIVO = "Clas_1586872451072264Atr_2_Alias";
    /** <code>configuracionFestivosDiaFestivo</code> attribute name. */
    public static final String ATTR_NAME_CONFIGURACIONFESTIVOSDIAFESTIVO = "configuracionFestivosDiaFestivo";
    /** <code>configuracionFestivosDiaFestivo</code> attribute alias. */
    public static final String ATTR_ALIAS_CONFIGURACIONFESTIVOSDIAFESTIVO = "Día festivo";

    /** <code>configuracionFestivosDiaFestivo</code> attribute facet sequence. */
    public static final String PATH_FACETS_CONFIGURACIONFESTIVOSDIAFESTIVO = "";
    /** Agents allowed to view the attribute configuracionFestivosDiaFestivo **/
    public static final String CONFIGURACIONFESTIVOSDIAFESTIVO_AGENTS = "SuperAdmin,Gestor";


    // Field (Id)
    /** <code>Id</code> field name. */
    public static final String FLD_CONFIGURACIONFESTIVOSID = "Id";    
    /** <code>configuracionFestivosId</code> attribute field name. */
    public static final String ATTR_FIELD_CONFIGURACIONFESTIVOSID = "configuracionFestivosId";
    // Field (DiaFestivo)
    /** <code>DiaFestivo</code> field name. */
    public static final String FLD_CONFIGURACIONFESTIVOSDIAFESTIVO = "DiaFestivo";    
    /** <code>configuracionFestivosDiaFestivo</code> attribute field name. */
    public static final String ATTR_FIELD_CONFIGURACIONFESTIVOSDIAFESTIVO = "configuracionFestivosDiaFestivo";



    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1586872451072264Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>configuracionFestivoscrearpatrDiaFestivo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_CONFIGURACIONFESTIVOSCREARPATRDIAFESTIVO = "p_atrDiaFestivo";
    /** <code>configuracionFestivoscrearpatrDiaFestivo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_CONFIGURACIONFESTIVOSCREARPATRDIAFESTIVO = "Clas_1586872451072264Ser_1Arg_2_Alias";
    /** <code>configuracionFestivoscrearpatrDiaFestivo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_CONFIGURACIONFESTIVOSCREARPATRDIAFESTIVO = "Día festivo";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1586872451072264Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>configuracionFestivoseliminarpthisConfiguracionFestivos</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_CONFIGURACIONFESTIVOSELIMINARPTHISCONFIGURACIONFESTIVOS = "p_thisConfiguracionFestivos";
    /** <code>configuracionFestivoseliminarpthisConfiguracionFestivos</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_CONFIGURACIONFESTIVOSELIMINARPTHISCONFIGURACIONFESTIVOS = "Clas_1586872451072264Ser_2Arg_1_Alias";
    /** <code>configuracionFestivoseliminarpthisConfiguracionFestivos</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_CONFIGURACIONFESTIVOSELIMINARPTHISCONFIGURACIONFESTIVOS = "Configuración Festivos";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_CONFIGURACIONFESTIVOSDIAFESTIVO.toUpperCase(), Constants.Type.DATE.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_CONFIGURACIONFESTIVOSID.toUpperCase(), CONFIGURACIONFESTIVOSID_AGENTS);
    	attributeAgents.put(ATTR_NAME_CONFIGURACIONFESTIVOSDIAFESTIVO.toUpperCase(), CONFIGURACIONFESTIVOSDIAFESTIVO_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'ConfiguracionFestivos', it returns the identification keys
     * - If className is a facet of the inheritance net of 'ConfiguracionFestivos', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_CONFIGURACIONFESTIVOSID);
        }
        // Facet 'ConfiguracionFestivos' (This facet)
        if (ConfiguracionFestivosConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_CONFIGURACIONFESTIVOSID);
        }
        return returnList;
    }
}
