package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>ParentescoDom</code> model class.
 */
public final class ParentescoDomConstants {

    private ParentescoDomConstants() {

    }

    // Class
    /** <code>ParentescoDom</code> class id. */
    public static final String CLASS_ID = "Clas_1434710704128231_Alias";
    /** <code>ParentescoDom</code> class name. */
    public static final String CLASS_NAME = "ParentescoDom";
    /** <code>ParentescoDom</code> class alias. */
    public static final String CLASS_ALIAS = "Parentesco dominio";
    /** <code>ParentescoDom</code> class table name. */
    public static final String TBL_NAME = "ParentescoDom";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "dominioNumero,parentescoDomIdentificador,parentescoCodigo,parentescoDomEdadMinimaA,parentescoDomEdadMaximaA,parentescoDomEdadMinimaD,parentescoDomEdadMaximaP";

    public static final String DSDSPARENTESCODOMPIU = "DS_ParentescoDom_PIU";
    

    // Attribute (parentescoDomIdentificador)
    /** <code>parentescoDomIdentificador</code> attribute id. */
    public static final String ATTR_ID_PARENTESCODOMIDENTIFICADOR = "Clas_1434710704128231Atr_1_Alias";
    /** <code>parentescoDomIdentificador</code> attribute name. */
    public static final String ATTR_NAME_PARENTESCODOMIDENTIFICADOR = "parentescoDomIdentificador";
    /** <code>parentescoDomIdentificador</code> attribute alias. */
    public static final String ATTR_ALIAS_PARENTESCODOMIDENTIFICADOR = "Identificador";

    /** <code>parentescoDomIdentificador</code> attribute facet sequence. */
    public static final String PATH_FACETS_PARENTESCODOMIDENTIFICADOR = "";
    /** Agents allowed to view the attribute parentescoDomIdentificador **/
    public static final String PARENTESCODOMIDENTIFICADOR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (parentescoDomEdadMinimaA)
    /** <code>parentescoDomEdadMinimaA</code> attribute id. */
    public static final String ATTR_ID_PARENTESCODOMEDADMINIMAA = "Clas_1434710704128231Atr_2_Alias";
    /** <code>parentescoDomEdadMinimaA</code> attribute name. */
    public static final String ATTR_NAME_PARENTESCODOMEDADMINIMAA = "parentescoDomEdadMinimaA";
    /** <code>parentescoDomEdadMinimaA</code> attribute alias. */
    public static final String ATTR_ALIAS_PARENTESCODOMEDADMINIMAA = "Edad mínima (años)";

    /** <code>parentescoDomEdadMinimaA</code> attribute facet sequence. */
    public static final String PATH_FACETS_PARENTESCODOMEDADMINIMAA = "";
    /** Agents allowed to view the attribute parentescoDomEdadMinimaA **/
    public static final String PARENTESCODOMEDADMINIMAA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (parentescoDomEdadMaximaA)
    /** <code>parentescoDomEdadMaximaA</code> attribute id. */
    public static final String ATTR_ID_PARENTESCODOMEDADMAXIMAA = "Clas_1434710704128231Atr_3_Alias";
    /** <code>parentescoDomEdadMaximaA</code> attribute name. */
    public static final String ATTR_NAME_PARENTESCODOMEDADMAXIMAA = "parentescoDomEdadMaximaA";
    /** <code>parentescoDomEdadMaximaA</code> attribute alias. */
    public static final String ATTR_ALIAS_PARENTESCODOMEDADMAXIMAA = "Edad máxima (años)";

    /** <code>parentescoDomEdadMaximaA</code> attribute facet sequence. */
    public static final String PATH_FACETS_PARENTESCODOMEDADMAXIMAA = "";
    /** Agents allowed to view the attribute parentescoDomEdadMaximaA **/
    public static final String PARENTESCODOMEDADMAXIMAA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (parentescoDomEdadMinimaD)
    /** <code>parentescoDomEdadMinimaD</code> attribute id. */
    public static final String ATTR_ID_PARENTESCODOMEDADMINIMAD = "Clas_1434710704128231Atr_4_Alias";
    /** <code>parentescoDomEdadMinimaD</code> attribute name. */
    public static final String ATTR_NAME_PARENTESCODOMEDADMINIMAD = "parentescoDomEdadMinimaD";
    /** <code>parentescoDomEdadMinimaD</code> attribute alias. */
    public static final String ATTR_ALIAS_PARENTESCODOMEDADMINIMAD = "Edad mínima (días)";

    /** <code>parentescoDomEdadMinimaD</code> attribute facet sequence. */
    public static final String PATH_FACETS_PARENTESCODOMEDADMINIMAD = "";
    /** Agents allowed to view the attribute parentescoDomEdadMinimaD **/
    public static final String PARENTESCODOMEDADMINIMAD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (parentescoDomEdadMaximaP)
    /** <code>parentescoDomEdadMaximaP</code> attribute id. */
    public static final String ATTR_ID_PARENTESCODOMEDADMAXIMAP = "Clas_1434710704128231Atr_6_Alias";
    /** <code>parentescoDomEdadMaximaP</code> attribute name. */
    public static final String ATTR_NAME_PARENTESCODOMEDADMAXIMAP = "parentescoDomEdadMaximaP";
    /** <code>parentescoDomEdadMaximaP</code> attribute alias. */
    public static final String ATTR_ALIAS_PARENTESCODOMEDADMAXIMAP = "Edad máxima (permanencia)";

    /** <code>parentescoDomEdadMaximaP</code> attribute facet sequence. */
    public static final String PATH_FACETS_PARENTESCODOMEDADMAXIMAP = "";
    /** Agents allowed to view the attribute parentescoDomEdadMaximaP **/
    public static final String PARENTESCODOMEDADMAXIMAP_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Attribute (Dominio.dominioNumero)
    /** <code>Dominio.dominioNumero</code> identification attribute name. */
    public static final String ATTR_NAME_DOMINIO_DOMINIONUMERO = "dominio.dominioNumero";

    // Field (Numero)
    /** <code>Numero</code> field name. */
    public static final String FLD_DOMINIONUMERO = "Numero";    
    /** <code>Dominio.dominioNumero</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIO_DOMINIONUMERO = "dominioNumero";
    // Field (Identificador)
    /** <code>Identificador</code> field name. */
    public static final String FLD_PARENTESCODOMIDENTIFICADOR = "Identificador";    
    /** <code>parentescoDomIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_PARENTESCODOMIDENTIFICADOR = "parentescoDomIdentificador";
    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_PARENTESCOCODIGO = "Codigo";    
    /** <code>Parentesco.parentescoCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_PARENTESCO_PARENTESCOCODIGO = "parentescoCodigo";
    // Field (EdadMinimaA)
    /** <code>EdadMinimaA</code> field name. */
    public static final String FLD_PARENTESCODOMEDADMINIMAA = "EdadMinimaA";    
    /** <code>parentescoDomEdadMinimaA</code> attribute field name. */
    public static final String ATTR_FIELD_PARENTESCODOMEDADMINIMAA = "parentescoDomEdadMinimaA";
    // Field (EdadMaximaA)
    /** <code>EdadMaximaA</code> field name. */
    public static final String FLD_PARENTESCODOMEDADMAXIMAA = "EdadMaximaA";    
    /** <code>parentescoDomEdadMaximaA</code> attribute field name. */
    public static final String ATTR_FIELD_PARENTESCODOMEDADMAXIMAA = "parentescoDomEdadMaximaA";
    // Field (EdadMinimaD)
    /** <code>EdadMinimaD</code> field name. */
    public static final String FLD_PARENTESCODOMEDADMINIMAD = "EdadMinimaD";    
    /** <code>parentescoDomEdadMinimaD</code> attribute field name. */
    public static final String ATTR_FIELD_PARENTESCODOMEDADMINIMAD = "parentescoDomEdadMinimaD";
    // Field (EdadMaximaP)
    /** <code>EdadMaximaP</code> field name. */
    public static final String FLD_PARENTESCODOMEDADMAXIMAP = "EdadMaximaP";    
    /** <code>parentescoDomEdadMaximaP</code> attribute field name. */
    public static final String ATTR_FIELD_PARENTESCODOMEDADMAXIMAP = "parentescoDomEdadMaximaP";

    // Component role (Dominio)
    /** <code>Dominio</code> role id. */
    public static final String ROLE_ID_DOMINIO = "Agr_1434710704128193_Alias";
    /** <code>Dominio</code> role name. */
    public static final String ROLE_NAME_DOMINIO = "dominio";
    /** <code>Dominio</code> role alias. */
    public static final String ROLE_ALIAS_DOMINIO = "Dominio";

    /** <code>Dominio</code> inverse role name. */
    public static final String ROLE_INVNAME_DOMINIO = DominioConstants.ROLE_NAME_PARENTESCOSDOM;
    /** <code>Dominio</code> role facet sequence. */
    public static final String PATH_FACETS_DOMINIO = "";
    /** <code>Dominio</code> role target class. */
    public static final String ROLE_TARGET_DOMINIO = DominioConstants.CLASS_NAME;

    /** Agents allowed to navigate through Dominio **/
    public static final String DOMINIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Parentesco)
    /** <code>Parentesco</code> role id. */
    public static final String ROLE_ID_PARENTESCO = "Agr_1434710704128877_Alias";
    /** <code>Parentesco</code> role name. */
    public static final String ROLE_NAME_PARENTESCO = "parentesco";
    /** <code>Parentesco</code> role alias. */
    public static final String ROLE_ALIAS_PARENTESCO = "Parentesco";

    /** <code>Parentesco</code> inverse role name. */
    public static final String ROLE_INVNAME_PARENTESCO = ParentescoConstants.ROLE_NAME_PARENTESCOSDOM;
    /** <code>Parentesco</code> role facet sequence. */
    public static final String PATH_FACETS_PARENTESCO = "";
    /** <code>Parentesco</code> role target class. */
    public static final String ROLE_TARGET_PARENTESCO = ParentescoConstants.CLASS_NAME;

    /** Agents allowed to navigate through Parentesco **/
    public static final String PARENTESCO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1434710704128231Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear parentesco de dominio";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>crear</code> precondition 0 id. */
    public static final String PRE_ID_CREAR_0 = "Clas_1434710704128231Pre_1_MsgError";
    // Inbound arguments
    /** <code>parentescoDomcrearpagrParentesco</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PARENTESCODOMCREARPAGRPARENTESCO = "p_agrParentesco";
    /** <code>parentescoDomcrearpagrParentesco</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PARENTESCODOMCREARPAGRPARENTESCO = "Clas_1434710704128231Ser_1Arg_9_Alias";
    /** <code>parentescoDomcrearpagrParentesco</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PARENTESCODOMCREARPAGRPARENTESCO = "Parentesco";
    /** <code>parentescoDomcrearpagrDominio</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PARENTESCODOMCREARPAGRDOMINIO = "p_agrDominio";
    /** <code>parentescoDomcrearpagrDominio</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PARENTESCODOMCREARPAGRDOMINIO = "Clas_1434710704128231Ser_1Arg_16_Alias";
    /** <code>parentescoDomcrearpagrDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PARENTESCODOMCREARPAGRDOMINIO = "Dominio";
    /** <code>parentescoDomcrearpatrEdadMinimaA</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PARENTESCODOMCREARPATREDADMINIMAA = "p_atrEdadMinimaA";
    /** <code>parentescoDomcrearpatrEdadMinimaA</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PARENTESCODOMCREARPATREDADMINIMAA = "Clas_1434710704128231Ser_1Arg_4_Alias";
    /** <code>parentescoDomcrearpatrEdadMinimaA</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PARENTESCODOMCREARPATREDADMINIMAA = "Edad mínima (años)";
    /** <code>parentescoDomcrearpatrEdadMaximaA</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PARENTESCODOMCREARPATREDADMAXIMAA = "p_atrEdadMaximaA";
    /** <code>parentescoDomcrearpatrEdadMaximaA</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PARENTESCODOMCREARPATREDADMAXIMAA = "Clas_1434710704128231Ser_1Arg_5_Alias";
    /** <code>parentescoDomcrearpatrEdadMaximaA</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PARENTESCODOMCREARPATREDADMAXIMAA = "Edad máxima (años)";
    /** <code>parentescoDomcrearpatrEdadMinimaD</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PARENTESCODOMCREARPATREDADMINIMAD = "p_atrEdadMinimaD";
    /** <code>parentescoDomcrearpatrEdadMinimaD</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PARENTESCODOMCREARPATREDADMINIMAD = "Clas_1434710704128231Ser_1Arg_6_Alias";
    /** <code>parentescoDomcrearpatrEdadMinimaD</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PARENTESCODOMCREARPATREDADMINIMAD = "Edad mínima (días)";
    /** <code>parentescoDomcrearpatrEdadMaximaP</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PARENTESCODOMCREARPATREDADMAXIMAP = "p_atrEdadMaximaP";
    /** <code>parentescoDomcrearpatrEdadMaximaP</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PARENTESCODOMCREARPATREDADMAXIMAP = "Clas_1434710704128231Ser_1Arg_8_Alias";
    /** <code>parentescoDomcrearpatrEdadMaximaP</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PARENTESCODOMCREARPATREDADMAXIMAP = "Edad máxima (permanencia)";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1434710704128231Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar parentesco de dominio";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>parentescoDomeliminarpthisParentescoDom</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_PARENTESCODOMELIMINARPTHISPARENTESCODOM = "p_thisParentescoDom";
    /** <code>parentescoDomeliminarpthisParentescoDom</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_PARENTESCODOMELIMINARPTHISPARENTESCODOM = "Clas_1434710704128231Ser_2Arg_1_Alias";
    /** <code>parentescoDomeliminarpthisParentescoDom</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_PARENTESCODOMELIMINARPTHISPARENTESCODOM = "Parentesco dominio";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1434710704128231Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar parentesco de dominio";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>parentescoDommodificarpthisParentescoDom</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PARENTESCODOMMODIFICARPTHISPARENTESCODOM = "p_thisParentescoDom";
    /** <code>parentescoDommodificarpthisParentescoDom</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PARENTESCODOMMODIFICARPTHISPARENTESCODOM = "Clas_1434710704128231Ser_3Arg_1_Alias";
    /** <code>parentescoDommodificarpthisParentescoDom</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PARENTESCODOMMODIFICARPTHISPARENTESCODOM = "Parentesco dominio";
    /** <code>parentescoDommodificarpEdadMinimaA</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PARENTESCODOMMODIFICARPEDADMINIMAA = "p_EdadMinimaA";
    /** <code>parentescoDommodificarpEdadMinimaA</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PARENTESCODOMMODIFICARPEDADMINIMAA = "Clas_1434710704128231Ser_3Arg_2_Alias";
    /** <code>parentescoDommodificarpEdadMinimaA</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PARENTESCODOMMODIFICARPEDADMINIMAA = "Edad mínima (años)";
    /** <code>parentescoDommodificarpEdadMaximaA</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PARENTESCODOMMODIFICARPEDADMAXIMAA = "p_EdadMaximaA";
    /** <code>parentescoDommodificarpEdadMaximaA</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PARENTESCODOMMODIFICARPEDADMAXIMAA = "Clas_1434710704128231Ser_3Arg_3_Alias";
    /** <code>parentescoDommodificarpEdadMaximaA</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PARENTESCODOMMODIFICARPEDADMAXIMAA = "Edad máxima (años)";
    /** <code>parentescoDommodificarpEdadMinimaD</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PARENTESCODOMMODIFICARPEDADMINIMAD = "p_EdadMinimaD";
    /** <code>parentescoDommodificarpEdadMinimaD</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PARENTESCODOMMODIFICARPEDADMINIMAD = "Clas_1434710704128231Ser_3Arg_4_Alias";
    /** <code>parentescoDommodificarpEdadMinimaD</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PARENTESCODOMMODIFICARPEDADMINIMAD = "Edad mínima (días)";
    /** <code>parentescoDommodificarpEdadMaximaP</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PARENTESCODOMMODIFICARPEDADMAXIMAP = "p_EdadMaximaP";
    /** <code>parentescoDommodificarpEdadMaximaP</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PARENTESCODOMMODIFICARPEDADMAXIMAP = "Clas_1434710704128231Ser_3Arg_6_Alias";
    /** <code>parentescoDommodificarpEdadMaximaP</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PARENTESCODOMMODIFICARPEDADMAXIMAP = "Edad máxima (permanencia)";

    public static final String FILTER_NAME_IFPARENTESCODOM = "iF_ParentescoDom";
    public static final String VAR_NAME_IFPARENTESCODOM_VOPARENTESCO = "vo_Parentesco";
    public static final String VAR_NAME_IFPARENTESCODOM_VODOMINIO = "vo_Dominio";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_PARENTESCODOMEDADMINIMAA.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_PARENTESCODOMEDADMAXIMAA.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_PARENTESCODOMEDADMINIMAD.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_PARENTESCODOMEDADMAXIMAP.toUpperCase(), Constants.Type.INT.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_PARENTESCODOMIDENTIFICADOR.toUpperCase(), PARENTESCODOMIDENTIFICADOR_AGENTS);
    	attributeAgents.put(ATTR_NAME_PARENTESCODOMEDADMINIMAA.toUpperCase(), PARENTESCODOMEDADMINIMAA_AGENTS);
    	attributeAgents.put(ATTR_NAME_PARENTESCODOMEDADMAXIMAA.toUpperCase(), PARENTESCODOMEDADMAXIMAA_AGENTS);
    	attributeAgents.put(ATTR_NAME_PARENTESCODOMEDADMINIMAD.toUpperCase(), PARENTESCODOMEDADMINIMAD_AGENTS);
    	attributeAgents.put(ATTR_NAME_PARENTESCODOMEDADMAXIMAP.toUpperCase(), PARENTESCODOMEDADMAXIMAP_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_DOMINIO.toUpperCase(), DOMINIO_AGENTS);
        roleAgents.put(ROLE_NAME_PARENTESCO.toUpperCase(), PARENTESCO_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'ParentescoDom', it returns the identification keys
     * - If className is a facet of the inheritance net of 'ParentescoDom', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ROLE_NAME_DOMINIO + "." + DominioConstants.ATTR_FIELD_DOMINIONUMERO);
            returnList.add(ATTR_FIELD_PARENTESCODOMIDENTIFICADOR);
        }
        // Facet 'ParentescoDom' (This facet)
        if (ParentescoDomConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ROLE_NAME_DOMINIO + "." + DominioConstants.ATTR_FIELD_DOMINIONUMERO);
            returnList.add(ATTR_FIELD_PARENTESCODOMIDENTIFICADOR);
        }
        return returnList;
    }
}
