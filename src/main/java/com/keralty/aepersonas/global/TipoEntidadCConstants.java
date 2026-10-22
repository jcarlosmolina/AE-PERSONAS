package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>TipoEntidadC</code> model class.
 */
public final class TipoEntidadCConstants {

    private TipoEntidadCConstants() {

    }

    // Class
    /** <code>TipoEntidadC</code> class id. */
    public static final String CLASS_ID = "Clas_1431947444224551_Alias";
    /** <code>TipoEntidadC</code> class name. */
    public static final String CLASS_NAME = "TipoEntidadC";
    /** <code>TipoEntidadC</code> class alias. */
    public static final String CLASS_ALIAS = "Tipo entidad";
    /** <code>TipoEntidadC</code> class table name. */
    public static final String TBL_NAME = "TipoEntidadC";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "tipoEntidadCCodigo,tipoEntidadCDescripcion";

    public static final String DSICTIPOENTIDAD = "IC_TipoEntidad";
    

    // Attribute (tipoEntidadCCodigo)
    /** <code>tipoEntidadCCodigo</code> attribute id. */
    public static final String ATTR_ID_TIPOENTIDADCCODIGO = "Clas_1431947444224551Atr_3_Alias";
    /** <code>tipoEntidadCCodigo</code> attribute name. */
    public static final String ATTR_NAME_TIPOENTIDADCCODIGO = "tipoEntidadCCodigo";
    /** <code>tipoEntidadCCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_TIPOENTIDADCCODIGO = "Código";

    /** <code>tipoEntidadCCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_TIPOENTIDADCCODIGO = "";
    /** Agents allowed to view the attribute tipoEntidadCCodigo **/
    public static final String TIPOENTIDADCCODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (tipoEntidadCDescripcion)
    /** <code>tipoEntidadCDescripcion</code> attribute id. */
    public static final String ATTR_ID_TIPOENTIDADCDESCRIPCION = "Clas_1431947444224551Atr_4_Alias";
    /** <code>tipoEntidadCDescripcion</code> attribute name. */
    public static final String ATTR_NAME_TIPOENTIDADCDESCRIPCION = "tipoEntidadCDescripcion";
    /** <code>tipoEntidadCDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_TIPOENTIDADCDESCRIPCION = "Descripción";

    /** <code>tipoEntidadCDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_TIPOENTIDADCDESCRIPCION = "";
    /** Agents allowed to view the attribute tipoEntidadCDescripcion **/
    public static final String TIPOENTIDADCDESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_TIPOENTIDADCCODIGO = "Codigo";    
    /** <code>tipoEntidadCCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_TIPOENTIDADCCODIGO = "tipoEntidadCCodigo";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_TIPOENTIDADCDESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_TIPOENTIDADCDESCRIPCIONLENGTH = 150;
    /** <code>tipoEntidadCDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_TIPOENTIDADCDESCRIPCION = "tipoEntidadCDescripcion";


    // Compound role (PersonasC)
    /** <code>PersonasC</code> role id. */
    public static final String ROLE_ID_PERSONASC = "Agr_1437649993728315_Alias";
    /** <code>PersonasC</code> role name. */
    public static final String ROLE_NAME_PERSONASC = "personasC";
    /** <code>TipoEntidadC</code> role alias. */
    public static final String ROLE_ALIAS_PERSONASC = "Personas";


    /** <code>PersonasC</code> inverse role name. */
    public static final String ROLE_INVNAME_PERSONASC = PersonaCConstants.ROLE_NAME_TIPOENTIDADC;
    /** <code>PersonasC</code> role facet sequence. */
    public static final String PATH_FACETS_PERSONASC = "";
    /** <code>PersonasC</code> role target class. */
    public static final String ROLE_TARGET_PERSONASC = PersonaCConstants.CLASS_NAME;
    /** Agents allowed to navigate through PersonasC **/
    public static final String PERSONASC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431947444224551Ser_6_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear tipo de entidad";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>tipoEntidadCcrearpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TIPOENTIDADCCREARPATRCODIGO = "p_atrCodigo";
    /** <code>tipoEntidadCcrearpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TIPOENTIDADCCREARPATRCODIGO = "Clas_1431947444224551Ser_6Arg_1_Alias";
    /** <code>tipoEntidadCcrearpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TIPOENTIDADCCREARPATRCODIGO = "Código";
    /** <code>tipoEntidadCcrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TIPOENTIDADCCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>tipoEntidadCcrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TIPOENTIDADCCREARPATRDESCRIPCION = "Clas_1431947444224551Ser_6Arg_2_Alias";
    /** <code>tipoEntidadCcrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TIPOENTIDADCCREARPATRDESCRIPCION = "Descripción";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431947444224551Ser_7_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar tipo de entidad";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Preconditions
    /** <code>eliminar</code> precondition 0 id. */
    public static final String PRE_ID_ELIMINAR_0 = "Clas_1431947444224551Pre_1_MsgError";
    // Inbound arguments
    /** <code>tipoEntidadCeliminarpthisTipoEntidad</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_TIPOENTIDADCELIMINARPTHISTIPOENTIDAD = "p_thisTipoEntidad";
    /** <code>tipoEntidadCeliminarpthisTipoEntidad</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_TIPOENTIDADCELIMINARPTHISTIPOENTIDAD = "Clas_1431947444224551Ser_7Arg_1_Alias";
    /** <code>tipoEntidadCeliminarpthisTipoEntidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_TIPOENTIDADCELIMINARPTHISTIPOENTIDAD = "Tipo entidad";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1431947444224551Ser_8_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar tipo entidad";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>tipoEntidadCmodificarpthisTipoEntidadC</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TIPOENTIDADCMODIFICARPTHISTIPOENTIDADC = "p_thisTipoEntidadC";
    /** <code>tipoEntidadCmodificarpthisTipoEntidadC</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TIPOENTIDADCMODIFICARPTHISTIPOENTIDADC = "Clas_1431947444224551Ser_8Arg_1_Alias";
    /** <code>tipoEntidadCmodificarpthisTipoEntidadC</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TIPOENTIDADCMODIFICARPTHISTIPOENTIDADC = "Tipo entidad";
    /** <code>tipoEntidadCmodificarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TIPOENTIDADCMODIFICARPDESCRIPCION = "p_Descripcion";
    /** <code>tipoEntidadCmodificarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TIPOENTIDADCMODIFICARPDESCRIPCION = "Clas_1431947444224551Ser_8Arg_2_Alias";
    /** <code>tipoEntidadCmodificarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TIPOENTIDADCMODIFICARPDESCRIPCION = "Descripción";
    // Service (InsTipoEntidadCPersonaC)
    /** <code>InsTipoEntidadCPersonaC</code> service id. */
    public static final String SERV_ID_INSTIPOENTIDADCPERSONAC = "Clas_1431947444224551Ser_9_Alias";
    /** <code>InsTipoEntidadCPersonaC</code> service name. */
    public static final String SERV_NAME_INSTIPOENTIDADCPERSONAC = "InsTipoEntidadCPersonaC";
    /** <code>InsTipoEntidadCPersonaC</code> service alias. */
    public static final String SERV_ALIAS_INSTIPOENTIDADCPERSONAC = "InsTipoEntidadCPersonaC";
    /** Agents allowed to execute the service InsTipoEntidadCPersonaC **/
    public static final String INSTIPOENTIDADCPERSONAC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>tipoEntidadCInsTipoEntidadCPersonaCpthisTipoEntidadC</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPOENTIDADCPERSONAC_TIPOENTIDADCINSTIPOENTIDADCPERSONACPTHISTIPOENTIDADC = "p_thisTipoEntidadC";
    /** <code>tipoEntidadCInsTipoEntidadCPersonaCpthisTipoEntidadC</code> inbound argument id. */
    public static final String ARG_ID_INSTIPOENTIDADCPERSONAC_TIPOENTIDADCINSTIPOENTIDADCPERSONACPTHISTIPOENTIDADC = "Clas_1431947444224551Ser_9Arg_1_Alias";
    /** <code>tipoEntidadCInsTipoEntidadCPersonaCpthisTipoEntidadC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPOENTIDADCPERSONAC_TIPOENTIDADCINSTIPOENTIDADCPERSONACPTHISTIPOENTIDADC = "Tipo entidad";
    /** <code>tipoEntidadCInsTipoEntidadCPersonaCpevcPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPOENTIDADCPERSONAC_TIPOENTIDADCINSTIPOENTIDADCPERSONACPEVCPERSONAC = "p_evcPersonaC";
    /** <code>tipoEntidadCInsTipoEntidadCPersonaCpevcPersonaC</code> inbound argument id. */
    public static final String ARG_ID_INSTIPOENTIDADCPERSONAC_TIPOENTIDADCINSTIPOENTIDADCPERSONACPEVCPERSONAC = "Clas_1431947444224551Ser_9Arg_2_Alias";
    /** <code>tipoEntidadCInsTipoEntidadCPersonaCpevcPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPOENTIDADCPERSONAC_TIPOENTIDADCINSTIPOENTIDADCPERSONACPEVCPERSONAC = "Personas";
    // Service (DelTipoEntidadCPersonaC)
    /** <code>DelTipoEntidadCPersonaC</code> service id. */
    public static final String SERV_ID_DELTIPOENTIDADCPERSONAC = "Clas_1431947444224551Ser_10_Alias";
    /** <code>DelTipoEntidadCPersonaC</code> service name. */
    public static final String SERV_NAME_DELTIPOENTIDADCPERSONAC = "DelTipoEntidadCPersonaC";
    /** <code>DelTipoEntidadCPersonaC</code> service alias. */
    public static final String SERV_ALIAS_DELTIPOENTIDADCPERSONAC = "DelTipoEntidadCPersonaC";
    /** Agents allowed to execute the service DelTipoEntidadCPersonaC **/
    public static final String DELTIPOENTIDADCPERSONAC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>tipoEntidadCDelTipoEntidadCPersonaCpthisTipoEntidadC</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPOENTIDADCPERSONAC_TIPOENTIDADCDELTIPOENTIDADCPERSONACPTHISTIPOENTIDADC = "p_thisTipoEntidadC";
    /** <code>tipoEntidadCDelTipoEntidadCPersonaCpthisTipoEntidadC</code> inbound argument id. */
    public static final String ARG_ID_DELTIPOENTIDADCPERSONAC_TIPOENTIDADCDELTIPOENTIDADCPERSONACPTHISTIPOENTIDADC = "Clas_1431947444224551Ser_10Arg_1_Alias";
    /** <code>tipoEntidadCDelTipoEntidadCPersonaCpthisTipoEntidadC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPOENTIDADCPERSONAC_TIPOENTIDADCDELTIPOENTIDADCPERSONACPTHISTIPOENTIDADC = "Tipo entidad";
    /** <code>tipoEntidadCDelTipoEntidadCPersonaCpevcPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPOENTIDADCPERSONAC_TIPOENTIDADCDELTIPOENTIDADCPERSONACPEVCPERSONAC = "p_evcPersonaC";
    /** <code>tipoEntidadCDelTipoEntidadCPersonaCpevcPersonaC</code> inbound argument id. */
    public static final String ARG_ID_DELTIPOENTIDADCPERSONAC_TIPOENTIDADCDELTIPOENTIDADCPERSONACPEVCPERSONAC = "Clas_1431947444224551Ser_10Arg_2_Alias";
    /** <code>tipoEntidadCDelTipoEntidadCPersonaCpevcPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPOENTIDADCPERSONAC_TIPOENTIDADCDELTIPOENTIDADCPERSONACPEVCPERSONAC = "Personas";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_TIPOENTIDADCDESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_TIPOENTIDADCCODIGO.toUpperCase(), TIPOENTIDADCCODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_TIPOENTIDADCDESCRIPCION.toUpperCase(), TIPOENTIDADCDESCRIPCION_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'TipoEntidadC', it returns the identification keys
     * - If className is a facet of the inheritance net of 'TipoEntidadC', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_TIPOENTIDADCCODIGO);
        }
        // Facet 'TipoEntidadC' (This facet)
        if (TipoEntidadCConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_TIPOENTIDADCCODIGO);
        }
        return returnList;
    }
}
