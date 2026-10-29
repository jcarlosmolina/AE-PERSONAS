package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>TextoAviso</code> model class.
 */
public final class TextoAvisoConstants {

    private TextoAvisoConstants() {

    }

    // Class
    /** <code>TextoAviso</code> class id. */
    public static final String CLASS_ID = "Clas_1737625305088101_Alias";
    /** <code>TextoAviso</code> class name. */
    public static final String CLASS_NAME = "TextoAviso";
    /** <code>TextoAviso</code> class alias. */
    public static final String CLASS_ALIAS = "Texto Aviso";
    /** <code>TextoAviso</code> class table name. */
    public static final String TBL_NAME = "TextoAviso";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "textoAvisoIdentificador,textoAvisoDescripcion";

    public static final String DSDSTEXTOAVISO = "DS_TextoAviso";
    public static final String DSICTEXTOAVISO = "IC_TextoAviso";
    

    // Attribute (textoAvisoIdentificador)
    /** <code>textoAvisoIdentificador</code> attribute id. */
    public static final String ATTR_ID_TEXTOAVISOIDENTIFICADOR = "Clas_1737625305088101Atr_1_Alias";
    /** <code>textoAvisoIdentificador</code> attribute name. */
    public static final String ATTR_NAME_TEXTOAVISOIDENTIFICADOR = "textoAvisoIdentificador";
    /** <code>textoAvisoIdentificador</code> attribute alias. */
    public static final String ATTR_ALIAS_TEXTOAVISOIDENTIFICADOR = "Identificador";

    /** <code>textoAvisoIdentificador</code> attribute facet sequence. */
    public static final String PATH_FACETS_TEXTOAVISOIDENTIFICADOR = "";
    /** Agents allowed to view the attribute textoAvisoIdentificador **/
    public static final String TEXTOAVISOIDENTIFICADOR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (textoAvisoDescripcion)
    /** <code>textoAvisoDescripcion</code> attribute id. */
    public static final String ATTR_ID_TEXTOAVISODESCRIPCION = "Clas_1737625305088101Atr_2_Alias";
    /** <code>textoAvisoDescripcion</code> attribute name. */
    public static final String ATTR_NAME_TEXTOAVISODESCRIPCION = "textoAvisoDescripcion";
    /** <code>textoAvisoDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_TEXTOAVISODESCRIPCION = "Descripción";

    /** <code>textoAvisoDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_TEXTOAVISODESCRIPCION = "";
    /** Agents allowed to view the attribute textoAvisoDescripcion **/
    public static final String TEXTOAVISODESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (textoAvisoValor)
    /** <code>textoAvisoValor</code> attribute id. */
    public static final String ATTR_ID_TEXTOAVISOVALOR = "Clas_1737625305088101Atr_3_Alias";
    /** <code>textoAvisoValor</code> attribute name. */
    public static final String ATTR_NAME_TEXTOAVISOVALOR = "textoAvisoValor";
    /** <code>textoAvisoValor</code> attribute alias. */
    public static final String ATTR_ALIAS_TEXTOAVISOVALOR = "Valor";

    /** <code>textoAvisoValor</code> attribute facet sequence. */
    public static final String PATH_FACETS_TEXTOAVISOVALOR = "";
    /** Agents allowed to view the attribute textoAvisoValor **/
    public static final String TEXTOAVISOVALOR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";


    // Field (Identificador)
    /** <code>Identificador</code> field name. */
    public static final String FLD_TEXTOAVISOIDENTIFICADOR = "Identificador";    
    /** <code>Identificador</code> field length. */
    public static final int FLD_TEXTOAVISOIDENTIFICADORLENGTH = 20;
    /** <code>textoAvisoIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_TEXTOAVISOIDENTIFICADOR = "textoAvisoIdentificador";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_TEXTOAVISODESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_TEXTOAVISODESCRIPCIONLENGTH = 255;
    /** <code>textoAvisoDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_TEXTOAVISODESCRIPCION = "textoAvisoDescripcion";
    // Field (Valor)
    /** <code>Valor</code> field name. */
    public static final String FLD_TEXTOAVISOVALOR = "Valor";    
    /** <code>textoAvisoValor</code> attribute field name. */
    public static final String ATTR_FIELD_TEXTOAVISOVALOR = "textoAvisoValor";



    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1737625305088101Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>textoAvisocrearpatrIdentificador</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TEXTOAVISOCREARPATRIDENTIFICADOR = "p_atrIdentificador";
    /** <code>textoAvisocrearpatrIdentificador</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TEXTOAVISOCREARPATRIDENTIFICADOR = "Clas_1737625305088101Ser_1Arg_2_Alias";
    /** <code>textoAvisocrearpatrIdentificador</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TEXTOAVISOCREARPATRIDENTIFICADOR = "Identificador";
    /** <code>textoAvisocrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TEXTOAVISOCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>textoAvisocrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TEXTOAVISOCREARPATRDESCRIPCION = "Clas_1737625305088101Ser_1Arg_3_Alias";
    /** <code>textoAvisocrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TEXTOAVISOCREARPATRDESCRIPCION = "Descripción";
    /** <code>textoAvisocrearpatrValor</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TEXTOAVISOCREARPATRVALOR = "p_atrValor";
    /** <code>textoAvisocrearpatrValor</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TEXTOAVISOCREARPATRVALOR = "Clas_1737625305088101Ser_1Arg_4_Alias";
    /** <code>textoAvisocrearpatrValor</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TEXTOAVISOCREARPATRVALOR = "Valor";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1737625305088101Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>textoAvisoeliminarpthisTextoAviso</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_TEXTOAVISOELIMINARPTHISTEXTOAVISO = "p_thisTextoAviso";
    /** <code>textoAvisoeliminarpthisTextoAviso</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_TEXTOAVISOELIMINARPTHISTEXTOAVISO = "Clas_1737625305088101Ser_2Arg_1_Alias";
    /** <code>textoAvisoeliminarpthisTextoAviso</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_TEXTOAVISOELIMINARPTHISTEXTOAVISO = "Texto Aviso";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1737625305088101Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>textoAvisomodificarpthisTextoAviso</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TEXTOAVISOMODIFICARPTHISTEXTOAVISO = "p_thisTextoAviso";
    /** <code>textoAvisomodificarpthisTextoAviso</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TEXTOAVISOMODIFICARPTHISTEXTOAVISO = "Clas_1737625305088101Ser_3Arg_1_Alias";
    /** <code>textoAvisomodificarpthisTextoAviso</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TEXTOAVISOMODIFICARPTHISTEXTOAVISO = "Texto Aviso";
    /** <code>textoAvisomodificarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TEXTOAVISOMODIFICARPDESCRIPCION = "p_Descripcion";
    /** <code>textoAvisomodificarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TEXTOAVISOMODIFICARPDESCRIPCION = "Clas_1737625305088101Ser_3Arg_2_Alias";
    /** <code>textoAvisomodificarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TEXTOAVISOMODIFICARPDESCRIPCION = "Descripción";
    /** <code>textoAvisomodificarpValor</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TEXTOAVISOMODIFICARPVALOR = "p_Valor";
    /** <code>textoAvisomodificarpValor</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TEXTOAVISOMODIFICARPVALOR = "Clas_1737625305088101Ser_3Arg_3_Alias";
    /** <code>textoAvisomodificarpValor</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TEXTOAVISOMODIFICARPVALOR = "Valor";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_TEXTOAVISODESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_TEXTOAVISOVALOR.toUpperCase(), Constants.Type.TEXT.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_TEXTOAVISOIDENTIFICADOR.toUpperCase(), TEXTOAVISOIDENTIFICADOR_AGENTS);
    	attributeAgents.put(ATTR_NAME_TEXTOAVISODESCRIPCION.toUpperCase(), TEXTOAVISODESCRIPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_TEXTOAVISOVALOR.toUpperCase(), TEXTOAVISOVALOR_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'TextoAviso', it returns the identification keys
     * - If className is a facet of the inheritance net of 'TextoAviso', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_TEXTOAVISOIDENTIFICADOR);
        }
        // Facet 'TextoAviso' (This facet)
        if (TextoAvisoConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_TEXTOAVISOIDENTIFICADOR);
        }
        return returnList;
    }
}
