package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>EstadoCivil</code> model class.
 */
public final class EstadoCivilConstants {

    private EstadoCivilConstants() {

    }

    // Class
    /** <code>EstadoCivil</code> class id. */
    public static final String CLASS_ID = "Clas_1431880990720963_Alias";
    /** <code>EstadoCivil</code> class name. */
    public static final String CLASS_NAME = "EstadoCivil";
    /** <code>EstadoCivil</code> class alias. */
    public static final String CLASS_ALIAS = "Estado civil";
    /** <code>EstadoCivil</code> class table name. */
    public static final String TBL_NAME = "EstadoCivil";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "estadoCivilCodigo,estadoCivilDescripcion,estadoCivilNombreCorto";

    public static final String DSICESTADOCIVIL = "IC_EstadoCivil";
    

    // Attribute (estadoCivilCodigo)
    /** <code>estadoCivilCodigo</code> attribute id. */
    public static final String ATTR_ID_ESTADOCIVILCODIGO = "Clas_1431880990720963Atr_1_Alias";
    /** <code>estadoCivilCodigo</code> attribute name. */
    public static final String ATTR_NAME_ESTADOCIVILCODIGO = "estadoCivilCodigo";
    /** <code>estadoCivilCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_ESTADOCIVILCODIGO = "Código";

    /** <code>estadoCivilCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_ESTADOCIVILCODIGO = "";
    /** Agents allowed to view the attribute estadoCivilCodigo **/
    public static final String ESTADOCIVILCODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (estadoCivilDescripcion)
    /** <code>estadoCivilDescripcion</code> attribute id. */
    public static final String ATTR_ID_ESTADOCIVILDESCRIPCION = "Clas_1431880990720963Atr_2_Alias";
    /** <code>estadoCivilDescripcion</code> attribute name. */
    public static final String ATTR_NAME_ESTADOCIVILDESCRIPCION = "estadoCivilDescripcion";
    /** <code>estadoCivilDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_ESTADOCIVILDESCRIPCION = "Descripción";

    /** <code>estadoCivilDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_ESTADOCIVILDESCRIPCION = "";
    /** Agents allowed to view the attribute estadoCivilDescripcion **/
    public static final String ESTADOCIVILDESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (estadoCivilNombreCorto)
    /** <code>estadoCivilNombreCorto</code> attribute id. */
    public static final String ATTR_ID_ESTADOCIVILNOMBRECORTO = "Clas_1431880990720963Atr_3_Alias";
    /** <code>estadoCivilNombreCorto</code> attribute name. */
    public static final String ATTR_NAME_ESTADOCIVILNOMBRECORTO = "estadoCivilNombreCorto";
    /** <code>estadoCivilNombreCorto</code> attribute alias. */
    public static final String ATTR_ALIAS_ESTADOCIVILNOMBRECORTO = "Nombre corto";

    /** <code>estadoCivilNombreCorto</code> attribute facet sequence. */
    public static final String PATH_FACETS_ESTADOCIVILNOMBRECORTO = "";
    /** Agents allowed to view the attribute estadoCivilNombreCorto **/
    public static final String ESTADOCIVILNOMBRECORTO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_ESTADOCIVILCODIGO = "Codigo";    
    /** <code>estadoCivilCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_ESTADOCIVILCODIGO = "estadoCivilCodigo";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_ESTADOCIVILDESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_ESTADOCIVILDESCRIPCIONLENGTH = 100;
    /** <code>estadoCivilDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_ESTADOCIVILDESCRIPCION = "estadoCivilDescripcion";
    // Field (NombreCorto)
    /** <code>NombreCorto</code> field name. */
    public static final String FLD_ESTADOCIVILNOMBRECORTO = "NombreCorto";    
    /** <code>NombreCorto</code> field length. */
    public static final int FLD_ESTADOCIVILNOMBRECORTOLENGTH = 50;
    /** <code>estadoCivilNombreCorto</code> attribute field name. */
    public static final String ATTR_FIELD_ESTADOCIVILNOMBRECORTO = "estadoCivilNombreCorto";


    // Compound role (Personas)
    /** <code>Personas</code> role id. */
    public static final String ROLE_ID_PERSONAS = "Agr_1432214568960421_Alias";
    /** <code>Personas</code> role name. */
    public static final String ROLE_NAME_PERSONAS = "personas";
    /** <code>EstadoCivil</code> role alias. */
    public static final String ROLE_ALIAS_PERSONAS = "Personas";


    /** <code>Personas</code> inverse role name. */
    public static final String ROLE_INVNAME_PERSONAS = PersonaConstants.ROLE_NAME_ESTADOCIVIL;
    /** <code>Personas</code> role facet sequence. */
    public static final String PATH_FACETS_PERSONAS = "";
    /** <code>Personas</code> role target class. */
    public static final String ROLE_TARGET_PERSONAS = PersonaConstants.CLASS_NAME;
    /** Agents allowed to navigate through Personas **/
    public static final String PERSONAS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (PersonasC)
    /** <code>PersonasC</code> role id. */
    public static final String ROLE_ID_PERSONASC = "Agr_1473094483968286_Alias";
    /** <code>PersonasC</code> role name. */
    public static final String ROLE_NAME_PERSONASC = "personasC";
    /** <code>EstadoCivilC</code> role alias. */
    public static final String ROLE_ALIAS_PERSONASC = "Personas";


    /** <code>PersonasC</code> inverse role name. */
    public static final String ROLE_INVNAME_PERSONASC = PersonaCConstants.ROLE_NAME_ESTADOCIVILC;
    /** <code>PersonasC</code> role facet sequence. */
    public static final String PATH_FACETS_PERSONASC = "";
    /** <code>PersonasC</code> role target class. */
    public static final String ROLE_TARGET_PERSONASC = PersonaCConstants.CLASS_NAME;
    /** Agents allowed to navigate through PersonasC **/
    public static final String PERSONASC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431880990720963Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear estado civil";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>estadoCivilcrearpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ESTADOCIVILCREARPATRCODIGO = "p_atrCodigo";
    /** <code>estadoCivilcrearpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ESTADOCIVILCREARPATRCODIGO = "Clas_1431880990720963Ser_1Arg_1_Alias";
    /** <code>estadoCivilcrearpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ESTADOCIVILCREARPATRCODIGO = "Código";
    /** <code>estadoCivilcrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ESTADOCIVILCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>estadoCivilcrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ESTADOCIVILCREARPATRDESCRIPCION = "Clas_1431880990720963Ser_1Arg_2_Alias";
    /** <code>estadoCivilcrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ESTADOCIVILCREARPATRDESCRIPCION = "Descripción";
    /** <code>estadoCivilcrearpatrNombreCorto</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ESTADOCIVILCREARPATRNOMBRECORTO = "p_atrNombreCorto";
    /** <code>estadoCivilcrearpatrNombreCorto</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ESTADOCIVILCREARPATRNOMBRECORTO = "Clas_1431880990720963Ser_1Arg_3_Alias";
    /** <code>estadoCivilcrearpatrNombreCorto</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ESTADOCIVILCREARPATRNOMBRECORTO = "Nombre corto";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431880990720963Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar estado civil";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>estadoCivileliminarpthisEstadoCivil</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_ESTADOCIVILELIMINARPTHISESTADOCIVIL = "p_thisEstadoCivil";
    /** <code>estadoCivileliminarpthisEstadoCivil</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_ESTADOCIVILELIMINARPTHISESTADOCIVIL = "Clas_1431880990720963Ser_2Arg_1_Alias";
    /** <code>estadoCivileliminarpthisEstadoCivil</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_ESTADOCIVILELIMINARPTHISESTADOCIVIL = "Estado civil";
    // Service (sincronizar)
    /** <code>sincronizar</code> service id. */
    public static final String SERV_ID_SINCRONIZAR = "Clas_1431880990720963Ser_3_Alias";
    /** <code>sincronizar</code> service name. */
    public static final String SERV_NAME_SINCRONIZAR = "sincronizar";
    /** <code>sincronizar</code> service alias. */
    public static final String SERV_ALIAS_SINCRONIZAR = "sincronizar";
    /** Agents allowed to execute the service sincronizar **/
    public static final String SINCRONIZAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>estadoCivilsincronizarpthisEstadoCivil</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_ESTADOCIVILSINCRONIZARPTHISESTADOCIVIL = "p_thisEstadoCivil";
    /** <code>estadoCivilsincronizarpthisEstadoCivil</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_ESTADOCIVILSINCRONIZARPTHISESTADOCIVIL = "Clas_1431880990720963Ser_3Arg_1_Alias";
    /** <code>estadoCivilsincronizarpthisEstadoCivil</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_ESTADOCIVILSINCRONIZARPTHISESTADOCIVIL = "Estado civil";
    /** <code>estadoCivilsincronizarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_ESTADOCIVILSINCRONIZARPDESCRIPCION = "p_Descripcion";
    /** <code>estadoCivilsincronizarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_ESTADOCIVILSINCRONIZARPDESCRIPCION = "Clas_1431880990720963Ser_3Arg_2_Alias";
    /** <code>estadoCivilsincronizarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_ESTADOCIVILSINCRONIZARPDESCRIPCION = "Descripción";
    /** <code>estadoCivilsincronizarpNombreCorto</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_ESTADOCIVILSINCRONIZARPNOMBRECORTO = "p_NombreCorto";
    /** <code>estadoCivilsincronizarpNombreCorto</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_ESTADOCIVILSINCRONIZARPNOMBRECORTO = "Clas_1431880990720963Ser_3Arg_3_Alias";
    /** <code>estadoCivilsincronizarpNombreCorto</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_ESTADOCIVILSINCRONIZARPNOMBRECORTO = "Nombre corto";
    // Service (InsEstadoCivilPersona)
    /** <code>InsEstadoCivilPersona</code> service id. */
    public static final String SERV_ID_INSESTADOCIVILPERSONA = "Clas_1431880990720963Ser_4_Alias";
    /** <code>InsEstadoCivilPersona</code> service name. */
    public static final String SERV_NAME_INSESTADOCIVILPERSONA = "InsEstadoCivilPersona";
    /** <code>InsEstadoCivilPersona</code> service alias. */
    public static final String SERV_ALIAS_INSESTADOCIVILPERSONA = "InsEstadoCivilPersona";
    /** Agents allowed to execute the service InsEstadoCivilPersona **/
    public static final String INSESTADOCIVILPERSONA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>estadoCivilInsEstadoCivilPersonapthisEstadoCivil</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOCIVILPERSONA_ESTADOCIVILINSESTADOCIVILPERSONAPTHISESTADOCIVIL = "p_thisEstadoCivil";
    /** <code>estadoCivilInsEstadoCivilPersonapthisEstadoCivil</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOCIVILPERSONA_ESTADOCIVILINSESTADOCIVILPERSONAPTHISESTADOCIVIL = "Clas_1431880990720963Ser_4Arg_1_Alias";
    /** <code>estadoCivilInsEstadoCivilPersonapthisEstadoCivil</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOCIVILPERSONA_ESTADOCIVILINSESTADOCIVILPERSONAPTHISESTADOCIVIL = "Estado civil";
    /** <code>estadoCivilInsEstadoCivilPersonapevcPersona</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOCIVILPERSONA_ESTADOCIVILINSESTADOCIVILPERSONAPEVCPERSONA = "p_evcPersona";
    /** <code>estadoCivilInsEstadoCivilPersonapevcPersona</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOCIVILPERSONA_ESTADOCIVILINSESTADOCIVILPERSONAPEVCPERSONA = "Clas_1431880990720963Ser_4Arg_2_Alias";
    /** <code>estadoCivilInsEstadoCivilPersonapevcPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOCIVILPERSONA_ESTADOCIVILINSESTADOCIVILPERSONAPEVCPERSONA = "Personas";
    // Service (DelEstadoCivilPersona)
    /** <code>DelEstadoCivilPersona</code> service id. */
    public static final String SERV_ID_DELESTADOCIVILPERSONA = "Clas_1431880990720963Ser_5_Alias";
    /** <code>DelEstadoCivilPersona</code> service name. */
    public static final String SERV_NAME_DELESTADOCIVILPERSONA = "DelEstadoCivilPersona";
    /** <code>DelEstadoCivilPersona</code> service alias. */
    public static final String SERV_ALIAS_DELESTADOCIVILPERSONA = "DelEstadoCivilPersona";
    /** Agents allowed to execute the service DelEstadoCivilPersona **/
    public static final String DELESTADOCIVILPERSONA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>estadoCivilDelEstadoCivilPersonapthisEstadoCivil</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOCIVILPERSONA_ESTADOCIVILDELESTADOCIVILPERSONAPTHISESTADOCIVIL = "p_thisEstadoCivil";
    /** <code>estadoCivilDelEstadoCivilPersonapthisEstadoCivil</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOCIVILPERSONA_ESTADOCIVILDELESTADOCIVILPERSONAPTHISESTADOCIVIL = "Clas_1431880990720963Ser_5Arg_1_Alias";
    /** <code>estadoCivilDelEstadoCivilPersonapthisEstadoCivil</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOCIVILPERSONA_ESTADOCIVILDELESTADOCIVILPERSONAPTHISESTADOCIVIL = "Estado civil";
    /** <code>estadoCivilDelEstadoCivilPersonapevcPersona</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOCIVILPERSONA_ESTADOCIVILDELESTADOCIVILPERSONAPEVCPERSONA = "p_evcPersona";
    /** <code>estadoCivilDelEstadoCivilPersonapevcPersona</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOCIVILPERSONA_ESTADOCIVILDELESTADOCIVILPERSONAPEVCPERSONA = "Clas_1431880990720963Ser_5Arg_2_Alias";
    /** <code>estadoCivilDelEstadoCivilPersonapevcPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOCIVILPERSONA_ESTADOCIVILDELESTADOCIVILPERSONAPEVCPERSONA = "Personas";
    // Service (InsEstadoCivilC)
    /** <code>InsEstadoCivilC</code> service id. */
    public static final String SERV_ID_INSESTADOCIVILC = "Clas_1431880990720963Ser_6_Alias";
    /** <code>InsEstadoCivilC</code> service name. */
    public static final String SERV_NAME_INSESTADOCIVILC = "InsEstadoCivilC";
    /** <code>InsEstadoCivilC</code> service alias. */
    public static final String SERV_ALIAS_INSESTADOCIVILC = "InsEstadoCivilC";
    /** Agents allowed to execute the service InsEstadoCivilC **/
    public static final String INSESTADOCIVILC_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>estadoCivilInsEstadoCivilCpthisEstadoCivil</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOCIVILC_ESTADOCIVILINSESTADOCIVILCPTHISESTADOCIVIL = "p_thisEstadoCivil";
    /** <code>estadoCivilInsEstadoCivilCpthisEstadoCivil</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOCIVILC_ESTADOCIVILINSESTADOCIVILCPTHISESTADOCIVIL = "Clas_1431880990720963Ser_6Arg_1_Alias";
    /** <code>estadoCivilInsEstadoCivilCpthisEstadoCivil</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOCIVILC_ESTADOCIVILINSESTADOCIVILCPTHISESTADOCIVIL = "Estado civil";
    /** <code>estadoCivilInsEstadoCivilCpevcPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOCIVILC_ESTADOCIVILINSESTADOCIVILCPEVCPERSONAC = "p_evcPersonaC";
    /** <code>estadoCivilInsEstadoCivilCpevcPersonaC</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOCIVILC_ESTADOCIVILINSESTADOCIVILCPEVCPERSONAC = "Clas_1431880990720963Ser_6Arg_2_Alias";
    /** <code>estadoCivilInsEstadoCivilCpevcPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOCIVILC_ESTADOCIVILINSESTADOCIVILCPEVCPERSONAC = "Personas";
    // Service (DelEstadoCivilC)
    /** <code>DelEstadoCivilC</code> service id. */
    public static final String SERV_ID_DELESTADOCIVILC = "Clas_1431880990720963Ser_7_Alias";
    /** <code>DelEstadoCivilC</code> service name. */
    public static final String SERV_NAME_DELESTADOCIVILC = "DelEstadoCivilC";
    /** <code>DelEstadoCivilC</code> service alias. */
    public static final String SERV_ALIAS_DELESTADOCIVILC = "DelEstadoCivilC";
    /** Agents allowed to execute the service DelEstadoCivilC **/
    public static final String DELESTADOCIVILC_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>estadoCivilDelEstadoCivilCpthisEstadoCivil</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOCIVILC_ESTADOCIVILDELESTADOCIVILCPTHISESTADOCIVIL = "p_thisEstadoCivil";
    /** <code>estadoCivilDelEstadoCivilCpthisEstadoCivil</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOCIVILC_ESTADOCIVILDELESTADOCIVILCPTHISESTADOCIVIL = "Clas_1431880990720963Ser_7Arg_1_Alias";
    /** <code>estadoCivilDelEstadoCivilCpthisEstadoCivil</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOCIVILC_ESTADOCIVILDELESTADOCIVILCPTHISESTADOCIVIL = "Estado civil";
    /** <code>estadoCivilDelEstadoCivilCpevcPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOCIVILC_ESTADOCIVILDELESTADOCIVILCPEVCPERSONAC = "p_evcPersonaC";
    /** <code>estadoCivilDelEstadoCivilCpevcPersonaC</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOCIVILC_ESTADOCIVILDELESTADOCIVILCPEVCPERSONAC = "Clas_1431880990720963Ser_7Arg_2_Alias";
    /** <code>estadoCivilDelEstadoCivilCpevcPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOCIVILC_ESTADOCIVILDELESTADOCIVILCPEVCPERSONAC = "Personas";

    public static final String FILTER_NAME_IFESTADOCIVILCODIGO = "iF_EstadoCivilCodigo";
    public static final String VAR_NAME_IFESTADOCIVILCODIGO_VCODIGO = "v_Codigo";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_ESTADOCIVILDESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_ESTADOCIVILNOMBRECORTO.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_ESTADOCIVILCODIGO.toUpperCase(), ESTADOCIVILCODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_ESTADOCIVILDESCRIPCION.toUpperCase(), ESTADOCIVILDESCRIPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_ESTADOCIVILNOMBRECORTO.toUpperCase(), ESTADOCIVILNOMBRECORTO_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'EstadoCivil', it returns the identification keys
     * - If className is a facet of the inheritance net of 'EstadoCivil', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_ESTADOCIVILCODIGO);
        }
        // Facet 'EstadoCivil' (This facet)
        if (EstadoCivilConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_ESTADOCIVILCODIGO);
        }
        return returnList;
    }
}
