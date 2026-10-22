package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>EntidadFinancieraC</code> model class.
 */
public final class EntidadFinancieraCConstants {

    private EntidadFinancieraCConstants() {

    }

    // Class
    /** <code>EntidadFinancieraC</code> class id. */
    public static final String CLASS_ID = "Clas_1431947444224046_Alias";
    /** <code>EntidadFinancieraC</code> class name. */
    public static final String CLASS_NAME = "EntidadFinancieraC";
    /** <code>EntidadFinancieraC</code> class alias. */
    public static final String CLASS_ALIAS = "Entidad financiera";
    /** <code>EntidadFinancieraC</code> class table name. */
    public static final String TBL_NAME = "EntidadFinancieraC";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "entidadFinancieraCCodigo,entidadFinancieraCDescripcion";

    

    // Attribute (entidadFinancieraCCodigo)
    /** <code>entidadFinancieraCCodigo</code> attribute id. */
    public static final String ATTR_ID_ENTIDADFINANCIERACCODIGO = "Clas_1431947444224046Atr_3_Alias";
    /** <code>entidadFinancieraCCodigo</code> attribute name. */
    public static final String ATTR_NAME_ENTIDADFINANCIERACCODIGO = "entidadFinancieraCCodigo";
    /** <code>entidadFinancieraCCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_ENTIDADFINANCIERACCODIGO = "Código";

    /** <code>entidadFinancieraCCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_ENTIDADFINANCIERACCODIGO = "";
    /** Agents allowed to view the attribute entidadFinancieraCCodigo **/
    public static final String ENTIDADFINANCIERACCODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (entidadFinancieraCDescripcion)
    /** <code>entidadFinancieraCDescripcion</code> attribute id. */
    public static final String ATTR_ID_ENTIDADFINANCIERACDESCRIPCION = "Clas_1431947444224046Atr_4_Alias";
    /** <code>entidadFinancieraCDescripcion</code> attribute name. */
    public static final String ATTR_NAME_ENTIDADFINANCIERACDESCRIPCION = "entidadFinancieraCDescripcion";
    /** <code>entidadFinancieraCDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_ENTIDADFINANCIERACDESCRIPCION = "Descripción";

    /** <code>entidadFinancieraCDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_ENTIDADFINANCIERACDESCRIPCION = "";
    /** Agents allowed to view the attribute entidadFinancieraCDescripcion **/
    public static final String ENTIDADFINANCIERACDESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_ENTIDADFINANCIERACCODIGO = "Codigo";    
    /** <code>entidadFinancieraCCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_ENTIDADFINANCIERACCODIGO = "entidadFinancieraCCodigo";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_ENTIDADFINANCIERACDESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_ENTIDADFINANCIERACDESCRIPCIONLENGTH = 150;
    /** <code>entidadFinancieraCDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_ENTIDADFINANCIERACDESCRIPCION = "entidadFinancieraCDescripcion";



    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431947444224046Ser_4_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear entidad financiera";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>entidadFinancieraCcrearpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ENTIDADFINANCIERACCREARPATRCODIGO = "p_atrCodigo";
    /** <code>entidadFinancieraCcrearpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ENTIDADFINANCIERACCREARPATRCODIGO = "Clas_1431947444224046Ser_4Arg_1_Alias";
    /** <code>entidadFinancieraCcrearpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ENTIDADFINANCIERACCREARPATRCODIGO = "Código";
    /** <code>entidadFinancieraCcrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ENTIDADFINANCIERACCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>entidadFinancieraCcrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ENTIDADFINANCIERACCREARPATRDESCRIPCION = "Clas_1431947444224046Ser_4Arg_2_Alias";
    /** <code>entidadFinancieraCcrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ENTIDADFINANCIERACCREARPATRDESCRIPCION = "Descripción";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431947444224046Ser_5_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar entidad financiera";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>entidadFinancieraCeliminarpthisEntidadFinanciera</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_ENTIDADFINANCIERACELIMINARPTHISENTIDADFINANCIERA = "p_thisEntidadFinanciera";
    /** <code>entidadFinancieraCeliminarpthisEntidadFinanciera</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_ENTIDADFINANCIERACELIMINARPTHISENTIDADFINANCIERA = "Clas_1431947444224046Ser_5Arg_1_Alias";
    /** <code>entidadFinancieraCeliminarpthisEntidadFinanciera</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_ENTIDADFINANCIERACELIMINARPTHISENTIDADFINANCIERA = "Entidad financiera";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1431947444224046Ser_6_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar entidad financiera";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>entidadFinancieraCmodificarpthisEntidadFinancieraC</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_ENTIDADFINANCIERACMODIFICARPTHISENTIDADFINANCIERAC = "p_thisEntidadFinancieraC";
    /** <code>entidadFinancieraCmodificarpthisEntidadFinancieraC</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_ENTIDADFINANCIERACMODIFICARPTHISENTIDADFINANCIERAC = "Clas_1431947444224046Ser_6Arg_1_Alias";
    /** <code>entidadFinancieraCmodificarpthisEntidadFinancieraC</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_ENTIDADFINANCIERACMODIFICARPTHISENTIDADFINANCIERAC = "Entidad financiera";
    /** <code>entidadFinancieraCmodificarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_ENTIDADFINANCIERACMODIFICARPDESCRIPCION = "p_Descripcion";
    /** <code>entidadFinancieraCmodificarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_ENTIDADFINANCIERACMODIFICARPDESCRIPCION = "Clas_1431947444224046Ser_6Arg_2_Alias";
    /** <code>entidadFinancieraCmodificarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_ENTIDADFINANCIERACMODIFICARPDESCRIPCION = "Descripción";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_ENTIDADFINANCIERACDESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_ENTIDADFINANCIERACCODIGO.toUpperCase(), ENTIDADFINANCIERACCODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_ENTIDADFINANCIERACDESCRIPCION.toUpperCase(), ENTIDADFINANCIERACDESCRIPCION_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'EntidadFinancieraC', it returns the identification keys
     * - If className is a facet of the inheritance net of 'EntidadFinancieraC', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_ENTIDADFINANCIERACCODIGO);
        }
        // Facet 'EntidadFinancieraC' (This facet)
        if (EntidadFinancieraCConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_ENTIDADFINANCIERACCODIGO);
        }
        return returnList;
    }
}
