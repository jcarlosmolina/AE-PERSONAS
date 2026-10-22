package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>Valor</code> model class.
 */
public final class ValorConstants {

    private ValorConstants() {

    }

    // Class
    /** <code>Valor</code> class id. */
    public static final String CLASS_ID = "Clas_1431634313216388_Alias";
    /** <code>Valor</code> class name. */
    public static final String CLASS_NAME = "Valor";
    /** <code>Valor</code> class alias. */
    public static final String CLASS_ALIAS = "Valor";
    /** <code>Valor</code> class table name. */
    public static final String TBL_NAME = "Valor";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "valorIdentificador,valorValorPosible";

    public static final String DSICVALOR = "IC_Valor";
    

    // Attribute (valorIdentificador)
    /** <code>valorIdentificador</code> attribute id. */
    public static final String ATTR_ID_VALORIDENTIFICADOR = "Clas_1431634313216388Atr_1_Alias";
    /** <code>valorIdentificador</code> attribute name. */
    public static final String ATTR_NAME_VALORIDENTIFICADOR = "valorIdentificador";
    /** <code>valorIdentificador</code> attribute alias. */
    public static final String ATTR_ALIAS_VALORIDENTIFICADOR = "Identificador";

    /** <code>valorIdentificador</code> attribute facet sequence. */
    public static final String PATH_FACETS_VALORIDENTIFICADOR = "";
    /** Agents allowed to view the attribute valorIdentificador **/
    public static final String VALORIDENTIFICADOR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (valorValorPosible)
    /** <code>valorValorPosible</code> attribute id. */
    public static final String ATTR_ID_VALORVALORPOSIBLE = "Clas_1431634313216388Atr_2_Alias";
    /** <code>valorValorPosible</code> attribute name. */
    public static final String ATTR_NAME_VALORVALORPOSIBLE = "valorValorPosible";
    /** <code>valorValorPosible</code> attribute alias. */
    public static final String ATTR_ALIAS_VALORVALORPOSIBLE = "Valor";

    /** <code>valorValorPosible</code> attribute facet sequence. */
    public static final String PATH_FACETS_VALORVALORPOSIBLE = "";
    /** Agents allowed to view the attribute valorValorPosible **/
    public static final String VALORVALORPOSIBLE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Gestor,MesaDeApoyo";


    // Field (Identificador)
    /** <code>Identificador</code> field name. */
    public static final String FLD_VALORIDENTIFICADOR = "Identificador";    
    /** <code>valorIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_VALORIDENTIFICADOR = "valorIdentificador";
    // Field (ValorPosible)
    /** <code>ValorPosible</code> field name. */
    public static final String FLD_VALORVALORPOSIBLE = "ValorPosible";    
    /** <code>ValorPosible</code> field length. */
    public static final int FLD_VALORVALORPOSIBLELENGTH = 150;
    /** <code>valorValorPosible</code> attribute field name. */
    public static final String ATTR_FIELD_VALORVALORPOSIBLE = "valorValorPosible";

    // Component role (Preguntas)
    /** <code>Preguntas</code> role id. */
    public static final String ROLE_ID_PREGUNTAS = "Agr_1431634313216461_Alias";
    /** <code>Preguntas</code> role name. */
    public static final String ROLE_NAME_PREGUNTAS = "preguntas";
    /** <code>Preguntas</code> role alias. */
    public static final String ROLE_ALIAS_PREGUNTAS = "Preguntas";

    /** <code>Preguntas</code> inverse role name. */
    public static final String ROLE_INVNAME_PREGUNTAS = PreguntaConstants.ROLE_NAME_VALORES;
    /** <code>Preguntas</code> role facet sequence. */
    public static final String PATH_FACETS_PREGUNTAS = "";
    /** <code>Preguntas</code> role target class. */
    public static final String ROLE_TARGET_PREGUNTAS = PreguntaConstants.CLASS_NAME;

    /** Agents allowed to navigate through Preguntas **/
    public static final String PREGUNTAS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Gestor,MesaDeApoyo";


    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431634313216388Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear valor posible de respuesta";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>valorcrearpatrValorPosible</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_VALORCREARPATRVALORPOSIBLE = "p_atrValorPosible";
    /** <code>valorcrearpatrValorPosible</code> inbound argument id. */
    public static final String ARG_ID_CREAR_VALORCREARPATRVALORPOSIBLE = "Clas_1431634313216388Ser_1Arg_2_Alias";
    /** <code>valorcrearpatrValorPosible</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_VALORCREARPATRVALORPOSIBLE = "Valor";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431634313216388Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar valor posible de respuesta";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>eliminar</code> precondition 0 id. */
    public static final String PRE_ID_ELIMINAR_0 = "Clas_1431634313216388Pre_1_MsgError";
    // Inbound arguments
    /** <code>valoreliminarpthisValor</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_VALORELIMINARPTHISVALOR = "p_thisValor";
    /** <code>valoreliminarpthisValor</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_VALORELIMINARPTHISVALOR = "Clas_1431634313216388Ser_2Arg_1_Alias";
    /** <code>valoreliminarpthisValor</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_VALORELIMINARPTHISVALOR = "Valor";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1431634313216388Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar valor posible de respuesta";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>valormodificarpthisValor</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_VALORMODIFICARPTHISVALOR = "p_thisValor";
    /** <code>valormodificarpthisValor</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_VALORMODIFICARPTHISVALOR = "Clas_1431634313216388Ser_3Arg_1_Alias";
    /** <code>valormodificarpthisValor</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_VALORMODIFICARPTHISVALOR = "Valor";
    /** <code>valormodificarpValorPosible</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_VALORMODIFICARPVALORPOSIBLE = "p_ValorPosible";
    /** <code>valormodificarpValorPosible</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_VALORMODIFICARPVALORPOSIBLE = "Clas_1431634313216388Ser_3Arg_2_Alias";
    /** <code>valormodificarpValorPosible</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_VALORMODIFICARPVALORPOSIBLE = "Valor";
    // Service (InsValorPregunta)
    /** <code>InsValorPregunta</code> service id. */
    public static final String SERV_ID_INSVALORPREGUNTA = "Clas_1431634313216388Ser_4_Alias";
    /** <code>InsValorPregunta</code> service name. */
    public static final String SERV_NAME_INSVALORPREGUNTA = "InsValorPregunta";
    /** <code>InsValorPregunta</code> service alias. */
    public static final String SERV_ALIAS_INSVALORPREGUNTA = "Indicar que es valor válido para una pregunta";
    /** Agents allowed to execute the service InsValorPregunta **/
    public static final String INSVALORPREGUNTA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>valorInsValorPreguntapthisValor</code> inbound argument name. */
    public static final String ARG_NAME_INSVALORPREGUNTA_VALORINSVALORPREGUNTAPTHISVALOR = "p_thisValor";
    /** <code>valorInsValorPreguntapthisValor</code> inbound argument id. */
    public static final String ARG_ID_INSVALORPREGUNTA_VALORINSVALORPREGUNTAPTHISVALOR = "Clas_1431634313216388Ser_4Arg_1_Alias";
    /** <code>valorInsValorPreguntapthisValor</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSVALORPREGUNTA_VALORINSVALORPREGUNTAPTHISVALOR = "Valor";
    /** <code>valorInsValorPreguntapevcPregunta</code> inbound argument name. */
    public static final String ARG_NAME_INSVALORPREGUNTA_VALORINSVALORPREGUNTAPEVCPREGUNTA = "p_evcPregunta";
    /** <code>valorInsValorPreguntapevcPregunta</code> inbound argument id. */
    public static final String ARG_ID_INSVALORPREGUNTA_VALORINSVALORPREGUNTAPEVCPREGUNTA = "Clas_1431634313216388Ser_4Arg_2_Alias";
    /** <code>valorInsValorPreguntapevcPregunta</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSVALORPREGUNTA_VALORINSVALORPREGUNTAPEVCPREGUNTA = "Pregunta";
    // Service (DelValorPregunta)
    /** <code>DelValorPregunta</code> service id. */
    public static final String SERV_ID_DELVALORPREGUNTA = "Clas_1431634313216388Ser_5_Alias";
    /** <code>DelValorPregunta</code> service name. */
    public static final String SERV_NAME_DELVALORPREGUNTA = "DelValorPregunta";
    /** <code>DelValorPregunta</code> service alias. */
    public static final String SERV_ALIAS_DELVALORPREGUNTA = "Indicar que no es valor válido para pregunta";
    /** Agents allowed to execute the service DelValorPregunta **/
    public static final String DELVALORPREGUNTA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>valorDelValorPreguntapthisValor</code> inbound argument name. */
    public static final String ARG_NAME_DELVALORPREGUNTA_VALORDELVALORPREGUNTAPTHISVALOR = "p_thisValor";
    /** <code>valorDelValorPreguntapthisValor</code> inbound argument id. */
    public static final String ARG_ID_DELVALORPREGUNTA_VALORDELVALORPREGUNTAPTHISVALOR = "Clas_1431634313216388Ser_5Arg_1_Alias";
    /** <code>valorDelValorPreguntapthisValor</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELVALORPREGUNTA_VALORDELVALORPREGUNTAPTHISVALOR = "Valor";
    /** <code>valorDelValorPreguntapevcPregunta</code> inbound argument name. */
    public static final String ARG_NAME_DELVALORPREGUNTA_VALORDELVALORPREGUNTAPEVCPREGUNTA = "p_evcPregunta";
    /** <code>valorDelValorPreguntapevcPregunta</code> inbound argument id. */
    public static final String ARG_ID_DELVALORPREGUNTA_VALORDELVALORPREGUNTAPEVCPREGUNTA = "Clas_1431634313216388Ser_5Arg_2_Alias";
    /** <code>valorDelValorPreguntapevcPregunta</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELVALORPREGUNTA_VALORDELVALORPREGUNTAPEVCPREGUNTA = "Pregunta";

    public static final String FILTER_NAME_IFVALORESPREGUNTA = "iF_ValoresPregunta";
    public static final String VAR_NAME_IFVALORESPREGUNTA_VOPREGUNTA = "vo_Pregunta";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_VALORVALORPOSIBLE.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_VALORIDENTIFICADOR.toUpperCase(), VALORIDENTIFICADOR_AGENTS);
    	attributeAgents.put(ATTR_NAME_VALORVALORPOSIBLE.toUpperCase(), VALORVALORPOSIBLE_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'Valor', it returns the identification keys
     * - If className is a facet of the inheritance net of 'Valor', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_VALORIDENTIFICADOR);
        }
        // Facet 'Valor' (This facet)
        if (ValorConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_VALORIDENTIFICADOR);
        }
        return returnList;
    }
}
