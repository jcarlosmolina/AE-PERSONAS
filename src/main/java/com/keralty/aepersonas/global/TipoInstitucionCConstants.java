package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>TipoInstitucionC</code> model class.
 */
public final class TipoInstitucionCConstants {

    private TipoInstitucionCConstants() {

    }

    // Class
    /** <code>TipoInstitucionC</code> class id. */
    public static final String CLASS_ID = "Clas_1431947444224120_Alias";
    /** <code>TipoInstitucionC</code> class name. */
    public static final String CLASS_NAME = "TipoInstitucionC";
    /** <code>TipoInstitucionC</code> class alias. */
    public static final String CLASS_ALIAS = "Tipo institución";
    /** <code>TipoInstitucionC</code> class table name. */
    public static final String TBL_NAME = "TipoInstitucionC";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "tipoInstitucionCCodigo,tipoInstitucionCNombre";

    public static final String DSICTIPOINSTITUCION = "IC_TipoInstitucion";
    

    // Attribute (tipoInstitucionCCodigo)
    /** <code>tipoInstitucionCCodigo</code> attribute id. */
    public static final String ATTR_ID_TIPOINSTITUCIONCCODIGO = "Clas_1431947444224120Atr_3_Alias";
    /** <code>tipoInstitucionCCodigo</code> attribute name. */
    public static final String ATTR_NAME_TIPOINSTITUCIONCCODIGO = "tipoInstitucionCCodigo";
    /** <code>tipoInstitucionCCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_TIPOINSTITUCIONCCODIGO = "Código";

    /** <code>tipoInstitucionCCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_TIPOINSTITUCIONCCODIGO = "";
    /** Agents allowed to view the attribute tipoInstitucionCCodigo **/
    public static final String TIPOINSTITUCIONCCODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (tipoInstitucionCNombre)
    /** <code>tipoInstitucionCNombre</code> attribute id. */
    public static final String ATTR_ID_TIPOINSTITUCIONCNOMBRE = "Clas_1431947444224120Atr_4_Alias";
    /** <code>tipoInstitucionCNombre</code> attribute name. */
    public static final String ATTR_NAME_TIPOINSTITUCIONCNOMBRE = "tipoInstitucionCNombre";
    /** <code>tipoInstitucionCNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_TIPOINSTITUCIONCNOMBRE = "Nombre";

    /** <code>tipoInstitucionCNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_TIPOINSTITUCIONCNOMBRE = "";
    /** Agents allowed to view the attribute tipoInstitucionCNombre **/
    public static final String TIPOINSTITUCIONCNOMBRE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_TIPOINSTITUCIONCCODIGO = "Codigo";    
    /** <code>tipoInstitucionCCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_TIPOINSTITUCIONCCODIGO = "tipoInstitucionCCodigo";
    // Field (Nombre)
    /** <code>Nombre</code> field name. */
    public static final String FLD_TIPOINSTITUCIONCNOMBRE = "Nombre";    
    /** <code>Nombre</code> field length. */
    public static final int FLD_TIPOINSTITUCIONCNOMBRELENGTH = 150;
    /** <code>tipoInstitucionCNombre</code> attribute field name. */
    public static final String ATTR_FIELD_TIPOINSTITUCIONCNOMBRE = "tipoInstitucionCNombre";


    // Compound role (PersonasC)
    /** <code>PersonasC</code> role id. */
    public static final String ROLE_ID_PERSONASC = "Agr_1437649993728231_Alias";
    /** <code>PersonasC</code> role name. */
    public static final String ROLE_NAME_PERSONASC = "personasC";
    /** <code>TipoInstitucionC</code> role alias. */
    public static final String ROLE_ALIAS_PERSONASC = "Personas";


    /** <code>PersonasC</code> inverse role name. */
    public static final String ROLE_INVNAME_PERSONASC = PersonaCConstants.ROLE_NAME_TIPOINSTITUCIONC;
    /** <code>PersonasC</code> role facet sequence. */
    public static final String PATH_FACETS_PERSONASC = "";
    /** <code>PersonasC</code> role target class. */
    public static final String ROLE_TARGET_PERSONASC = PersonaCConstants.CLASS_NAME;
    /** Agents allowed to navigate through PersonasC **/
    public static final String PERSONASC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431947444224120Ser_6_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear tipo de institución";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>tipoInstitucionCcrearpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TIPOINSTITUCIONCCREARPATRCODIGO = "p_atrCodigo";
    /** <code>tipoInstitucionCcrearpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TIPOINSTITUCIONCCREARPATRCODIGO = "Clas_1431947444224120Ser_6Arg_1_Alias";
    /** <code>tipoInstitucionCcrearpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TIPOINSTITUCIONCCREARPATRCODIGO = "Código";
    /** <code>tipoInstitucionCcrearpatrNombre</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TIPOINSTITUCIONCCREARPATRNOMBRE = "p_atrNombre";
    /** <code>tipoInstitucionCcrearpatrNombre</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TIPOINSTITUCIONCCREARPATRNOMBRE = "Clas_1431947444224120Ser_6Arg_2_Alias";
    /** <code>tipoInstitucionCcrearpatrNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TIPOINSTITUCIONCCREARPATRNOMBRE = "Nombre";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431947444224120Ser_7_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar tipo de institución";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Preconditions
    /** <code>eliminar</code> precondition 0 id. */
    public static final String PRE_ID_ELIMINAR_0 = "Clas_1431947444224120Pre_1_MsgError";
    // Inbound arguments
    /** <code>tipoInstitucionCeliminarpthisTipoInstitucion</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_TIPOINSTITUCIONCELIMINARPTHISTIPOINSTITUCION = "p_thisTipoInstitucion";
    /** <code>tipoInstitucionCeliminarpthisTipoInstitucion</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_TIPOINSTITUCIONCELIMINARPTHISTIPOINSTITUCION = "Clas_1431947444224120Ser_7Arg_1_Alias";
    /** <code>tipoInstitucionCeliminarpthisTipoInstitucion</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_TIPOINSTITUCIONCELIMINARPTHISTIPOINSTITUCION = "Tipo institución";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1431947444224120Ser_8_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar tipo institución";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>tipoInstitucionCmodificarpthisTipoInstitucionC</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TIPOINSTITUCIONCMODIFICARPTHISTIPOINSTITUCIONC = "p_thisTipoInstitucionC";
    /** <code>tipoInstitucionCmodificarpthisTipoInstitucionC</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TIPOINSTITUCIONCMODIFICARPTHISTIPOINSTITUCIONC = "Clas_1431947444224120Ser_8Arg_1_Alias";
    /** <code>tipoInstitucionCmodificarpthisTipoInstitucionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TIPOINSTITUCIONCMODIFICARPTHISTIPOINSTITUCIONC = "Tipo institución";
    /** <code>tipoInstitucionCmodificarpNombre</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TIPOINSTITUCIONCMODIFICARPNOMBRE = "p_Nombre";
    /** <code>tipoInstitucionCmodificarpNombre</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TIPOINSTITUCIONCMODIFICARPNOMBRE = "Clas_1431947444224120Ser_8Arg_2_Alias";
    /** <code>tipoInstitucionCmodificarpNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TIPOINSTITUCIONCMODIFICARPNOMBRE = "Nombre";
    // Service (InsTipoInstitucionCPersonaC)
    /** <code>InsTipoInstitucionCPersonaC</code> service id. */
    public static final String SERV_ID_INSTIPOINSTITUCIONCPERSONAC = "Clas_1431947444224120Ser_9_Alias";
    /** <code>InsTipoInstitucionCPersonaC</code> service name. */
    public static final String SERV_NAME_INSTIPOINSTITUCIONCPERSONAC = "InsTipoInstitucionCPersonaC";
    /** <code>InsTipoInstitucionCPersonaC</code> service alias. */
    public static final String SERV_ALIAS_INSTIPOINSTITUCIONCPERSONAC = "InsTipoInstitucionCPersonaC";
    /** Agents allowed to execute the service InsTipoInstitucionCPersonaC **/
    public static final String INSTIPOINSTITUCIONCPERSONAC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>tipoInstitucionCInsTipoInstitucionCPersonaCpthisTipoInstitucionC</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPOINSTITUCIONCPERSONAC_TIPOINSTITUCIONCINSTIPOINSTITUCIONCPERSONACPTHISTIPOINSTITUCIONC = "p_thisTipoInstitucionC";
    /** <code>tipoInstitucionCInsTipoInstitucionCPersonaCpthisTipoInstitucionC</code> inbound argument id. */
    public static final String ARG_ID_INSTIPOINSTITUCIONCPERSONAC_TIPOINSTITUCIONCINSTIPOINSTITUCIONCPERSONACPTHISTIPOINSTITUCIONC = "Clas_1431947444224120Ser_9Arg_1_Alias";
    /** <code>tipoInstitucionCInsTipoInstitucionCPersonaCpthisTipoInstitucionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPOINSTITUCIONCPERSONAC_TIPOINSTITUCIONCINSTIPOINSTITUCIONCPERSONACPTHISTIPOINSTITUCIONC = "Tipo institución";
    /** <code>tipoInstitucionCInsTipoInstitucionCPersonaCpevcPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPOINSTITUCIONCPERSONAC_TIPOINSTITUCIONCINSTIPOINSTITUCIONCPERSONACPEVCPERSONAC = "p_evcPersonaC";
    /** <code>tipoInstitucionCInsTipoInstitucionCPersonaCpevcPersonaC</code> inbound argument id. */
    public static final String ARG_ID_INSTIPOINSTITUCIONCPERSONAC_TIPOINSTITUCIONCINSTIPOINSTITUCIONCPERSONACPEVCPERSONAC = "Clas_1431947444224120Ser_9Arg_2_Alias";
    /** <code>tipoInstitucionCInsTipoInstitucionCPersonaCpevcPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPOINSTITUCIONCPERSONAC_TIPOINSTITUCIONCINSTIPOINSTITUCIONCPERSONACPEVCPERSONAC = "Personas";
    // Service (DelTipoInstitucionCPersonaC)
    /** <code>DelTipoInstitucionCPersonaC</code> service id. */
    public static final String SERV_ID_DELTIPOINSTITUCIONCPERSONAC = "Clas_1431947444224120Ser_10_Alias";
    /** <code>DelTipoInstitucionCPersonaC</code> service name. */
    public static final String SERV_NAME_DELTIPOINSTITUCIONCPERSONAC = "DelTipoInstitucionCPersonaC";
    /** <code>DelTipoInstitucionCPersonaC</code> service alias. */
    public static final String SERV_ALIAS_DELTIPOINSTITUCIONCPERSONAC = "DelTipoInstitucionCPersonaC";
    /** Agents allowed to execute the service DelTipoInstitucionCPersonaC **/
    public static final String DELTIPOINSTITUCIONCPERSONAC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>tipoInstitucionCDelTipoInstitucionCPersonaCpthisTipoInstitucionC</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPOINSTITUCIONCPERSONAC_TIPOINSTITUCIONCDELTIPOINSTITUCIONCPERSONACPTHISTIPOINSTITUCIONC = "p_thisTipoInstitucionC";
    /** <code>tipoInstitucionCDelTipoInstitucionCPersonaCpthisTipoInstitucionC</code> inbound argument id. */
    public static final String ARG_ID_DELTIPOINSTITUCIONCPERSONAC_TIPOINSTITUCIONCDELTIPOINSTITUCIONCPERSONACPTHISTIPOINSTITUCIONC = "Clas_1431947444224120Ser_10Arg_1_Alias";
    /** <code>tipoInstitucionCDelTipoInstitucionCPersonaCpthisTipoInstitucionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPOINSTITUCIONCPERSONAC_TIPOINSTITUCIONCDELTIPOINSTITUCIONCPERSONACPTHISTIPOINSTITUCIONC = "Tipo institución";
    /** <code>tipoInstitucionCDelTipoInstitucionCPersonaCpevcPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPOINSTITUCIONCPERSONAC_TIPOINSTITUCIONCDELTIPOINSTITUCIONCPERSONACPEVCPERSONAC = "p_evcPersonaC";
    /** <code>tipoInstitucionCDelTipoInstitucionCPersonaCpevcPersonaC</code> inbound argument id. */
    public static final String ARG_ID_DELTIPOINSTITUCIONCPERSONAC_TIPOINSTITUCIONCDELTIPOINSTITUCIONCPERSONACPEVCPERSONAC = "Clas_1431947444224120Ser_10Arg_2_Alias";
    /** <code>tipoInstitucionCDelTipoInstitucionCPersonaCpevcPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPOINSTITUCIONCPERSONAC_TIPOINSTITUCIONCDELTIPOINSTITUCIONCPERSONACPEVCPERSONAC = "Personas";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_TIPOINSTITUCIONCNOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_TIPOINSTITUCIONCCODIGO.toUpperCase(), TIPOINSTITUCIONCCODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_TIPOINSTITUCIONCNOMBRE.toUpperCase(), TIPOINSTITUCIONCNOMBRE_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'TipoInstitucionC', it returns the identification keys
     * - If className is a facet of the inheritance net of 'TipoInstitucionC', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_TIPOINSTITUCIONCCODIGO);
        }
        // Facet 'TipoInstitucionC' (This facet)
        if (TipoInstitucionCConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_TIPOINSTITUCIONCCODIGO);
        }
        return returnList;
    }
}
