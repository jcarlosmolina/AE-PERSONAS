package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>PregCuesMedC</code> model class.
 */
public final class PregCuesMedCConstants {

    private PregCuesMedCConstants() {

    }

    // Class
    /** <code>PregCuesMedC</code> class id. */
    public static final String CLASS_ID = "Clas_1433022889984318_Alias";
    /** <code>PregCuesMedC</code> class name. */
    public static final String CLASS_NAME = "PregCuesMedC";
    /** <code>PregCuesMedC</code> class alias. */
    public static final String CLASS_ALIAS = "Preg. Cuestionario Médico";
    /** <code>PregCuesMedC</code> class table name. */
    public static final String TBL_NAME = "PregCuesMedC";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "personaCID,pregCuesMedCCodPregunta,pregCuesMedCRptaPregunta,pregCuesMedCObservacions";

    

    // Attribute (pregCuesMedCCodPregunta)
    /** <code>pregCuesMedCCodPregunta</code> attribute id. */
    public static final String ATTR_ID_PREGCUESMEDCCODPREGUNTA = "Clas_1433022889984318Atr_4_Alias";
    /** <code>pregCuesMedCCodPregunta</code> attribute name. */
    public static final String ATTR_NAME_PREGCUESMEDCCODPREGUNTA = "pregCuesMedCCodPregunta";
    /** <code>pregCuesMedCCodPregunta</code> attribute alias. */
    public static final String ATTR_ALIAS_PREGCUESMEDCCODPREGUNTA = "Código";

    /** <code>pregCuesMedCCodPregunta</code> attribute facet sequence. */
    public static final String PATH_FACETS_PREGCUESMEDCCODPREGUNTA = "";
    /** Agents allowed to view the attribute pregCuesMedCCodPregunta **/
    public static final String PREGCUESMEDCCODPREGUNTA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (pregCuesMedCRptaPregunta)
    /** <code>pregCuesMedCRptaPregunta</code> attribute id. */
    public static final String ATTR_ID_PREGCUESMEDCRPTAPREGUNTA = "Clas_1433022889984318Atr_5_Alias";
    /** <code>pregCuesMedCRptaPregunta</code> attribute name. */
    public static final String ATTR_NAME_PREGCUESMEDCRPTAPREGUNTA = "pregCuesMedCRptaPregunta";
    /** <code>pregCuesMedCRptaPregunta</code> attribute alias. */
    public static final String ATTR_ALIAS_PREGCUESMEDCRPTAPREGUNTA = "Respuesta";

    /** <code>pregCuesMedCRptaPregunta</code> attribute facet sequence. */
    public static final String PATH_FACETS_PREGCUESMEDCRPTAPREGUNTA = "";
    /** Agents allowed to view the attribute pregCuesMedCRptaPregunta **/
    public static final String PREGCUESMEDCRPTAPREGUNTA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (pregCuesMedCObservacions)
    /** <code>pregCuesMedCObservacions</code> attribute id. */
    public static final String ATTR_ID_PREGCUESMEDCOBSERVACIONS = "Clas_1433022889984318Atr_6_Alias";
    /** <code>pregCuesMedCObservacions</code> attribute name. */
    public static final String ATTR_NAME_PREGCUESMEDCOBSERVACIONS = "pregCuesMedCObservacions";
    /** <code>pregCuesMedCObservacions</code> attribute alias. */
    public static final String ATTR_ALIAS_PREGCUESMEDCOBSERVACIONS = "Observaciones";

    /** <code>pregCuesMedCObservacions</code> attribute facet sequence. */
    public static final String PATH_FACETS_PREGCUESMEDCOBSERVACIONS = "";
    /** Agents allowed to view the attribute pregCuesMedCObservacions **/
    public static final String PREGCUESMEDCOBSERVACIONS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Attribute (PersonaC.personaCID)
    /** <code>PersonaC.personaCID</code> identification attribute name. */
    public static final String ATTR_NAME_PERSONAC_PERSONACID = "personaC.personaCID";

    // Field (ID)
    /** <code>ID</code> field name. */
    public static final String FLD_PERSONACID = "ID";    
    /** <code>PersonaC.personaCID</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONAC_PERSONACID = "personaCID";
    // Field (CodPregunta)
    /** <code>CodPregunta</code> field name. */
    public static final String FLD_PREGCUESMEDCCODPREGUNTA = "CodPregunta";    
    /** <code>pregCuesMedCCodPregunta</code> attribute field name. */
    public static final String ATTR_FIELD_PREGCUESMEDCCODPREGUNTA = "pregCuesMedCCodPregunta";
    // Field (RptaPregunta)
    /** <code>RptaPregunta</code> field name. */
    public static final String FLD_PREGCUESMEDCRPTAPREGUNTA = "RptaPregunta";    
    /** <code>pregCuesMedCRptaPregunta</code> attribute field name. */
    public static final String ATTR_FIELD_PREGCUESMEDCRPTAPREGUNTA = "pregCuesMedCRptaPregunta";
    // Field (Observacions)
    /** <code>Observacions</code> field name. */
    public static final String FLD_PREGCUESMEDCOBSERVACIONS = "Observacions";    
    /** <code>Observacions</code> field length. */
    public static final int FLD_PREGCUESMEDCOBSERVACIONSLENGTH = 999;
    /** <code>pregCuesMedCObservacions</code> attribute field name. */
    public static final String ATTR_FIELD_PREGCUESMEDCOBSERVACIONS = "pregCuesMedCObservacions";

    // Component role (PersonaC)
    /** <code>PersonaC</code> role id. */
    public static final String ROLE_ID_PERSONAC = "Agr_1437649993728172_Alias";
    /** <code>PersonaC</code> role name. */
    public static final String ROLE_NAME_PERSONAC = "personaC";
    /** <code>PersonaC</code> role alias. */
    public static final String ROLE_ALIAS_PERSONAC = "Persona";

    /** <code>PersonaC</code> inverse role name. */
    public static final String ROLE_INVNAME_PERSONAC = PersonaCConstants.ROLE_NAME_PREGSCUESMEDC;
    /** <code>PersonaC</code> role facet sequence. */
    public static final String PATH_FACETS_PERSONAC = "";
    /** <code>PersonaC</code> role target class. */
    public static final String ROLE_TARGET_PERSONAC = PersonaCConstants.CLASS_NAME;

    /** Agents allowed to navigate through PersonaC **/
    public static final String PERSONAC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1433022889984318Ser_4_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear pregunta";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>pregCuesMedCcrearpagrPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PREGCUESMEDCCREARPAGRPERSONAC = "p_agrPersonaC";
    /** <code>pregCuesMedCcrearpagrPersonaC</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PREGCUESMEDCCREARPAGRPERSONAC = "Clas_1433022889984318Ser_4Arg_9_Alias";
    /** <code>pregCuesMedCcrearpagrPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PREGCUESMEDCCREARPAGRPERSONAC = "Persona";
    /** <code>pregCuesMedCcrearpatrCodPregunta</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PREGCUESMEDCCREARPATRCODPREGUNTA = "p_atrCodPregunta";
    /** <code>pregCuesMedCcrearpatrCodPregunta</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PREGCUESMEDCCREARPATRCODPREGUNTA = "Clas_1433022889984318Ser_4Arg_2_Alias";
    /** <code>pregCuesMedCcrearpatrCodPregunta</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PREGCUESMEDCCREARPATRCODPREGUNTA = "Código";
    /** <code>pregCuesMedCcrearpatrRptaPregunta</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PREGCUESMEDCCREARPATRRPTAPREGUNTA = "p_atrRptaPregunta";
    /** <code>pregCuesMedCcrearpatrRptaPregunta</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PREGCUESMEDCCREARPATRRPTAPREGUNTA = "Clas_1433022889984318Ser_4Arg_3_Alias";
    /** <code>pregCuesMedCcrearpatrRptaPregunta</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PREGCUESMEDCCREARPATRRPTAPREGUNTA = "Respuesta";
    /** <code>pregCuesMedCcrearpatrObservacions</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PREGCUESMEDCCREARPATROBSERVACIONS = "p_atrObservacions";
    /** <code>pregCuesMedCcrearpatrObservacions</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PREGCUESMEDCCREARPATROBSERVACIONS = "Clas_1433022889984318Ser_4Arg_4_Alias";
    /** <code>pregCuesMedCcrearpatrObservacions</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PREGCUESMEDCCREARPATROBSERVACIONS = "Observaciones";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1433022889984318Ser_5_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar pregunta";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>pregCuesMedCeliminarpthisPregCuesMedC</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_PREGCUESMEDCELIMINARPTHISPREGCUESMEDC = "p_thisPregCuesMedC";
    /** <code>pregCuesMedCeliminarpthisPregCuesMedC</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_PREGCUESMEDCELIMINARPTHISPREGCUESMEDC = "Clas_1433022889984318Ser_5Arg_1_Alias";
    /** <code>pregCuesMedCeliminarpthisPregCuesMedC</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_PREGCUESMEDCELIMINARPTHISPREGCUESMEDC = "Preg. Cuestionario Médico";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1433022889984318Ser_6_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar pregunta";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>pregCuesMedCmodificarpthisPregCuesMedC</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PREGCUESMEDCMODIFICARPTHISPREGCUESMEDC = "p_thisPregCuesMedC";
    /** <code>pregCuesMedCmodificarpthisPregCuesMedC</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PREGCUESMEDCMODIFICARPTHISPREGCUESMEDC = "Clas_1433022889984318Ser_6Arg_1_Alias";
    /** <code>pregCuesMedCmodificarpthisPregCuesMedC</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PREGCUESMEDCMODIFICARPTHISPREGCUESMEDC = "Preg. Cuestionario Médico";
    /** <code>pregCuesMedCmodificarpRptaPregunta</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PREGCUESMEDCMODIFICARPRPTAPREGUNTA = "p_RptaPregunta";
    /** <code>pregCuesMedCmodificarpRptaPregunta</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PREGCUESMEDCMODIFICARPRPTAPREGUNTA = "Clas_1433022889984318Ser_6Arg_2_Alias";
    /** <code>pregCuesMedCmodificarpRptaPregunta</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PREGCUESMEDCMODIFICARPRPTAPREGUNTA = "Respuesta";
    /** <code>pregCuesMedCmodificarpObservacions</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PREGCUESMEDCMODIFICARPOBSERVACIONS = "p_Observacions";
    /** <code>pregCuesMedCmodificarpObservacions</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PREGCUESMEDCMODIFICARPOBSERVACIONS = "Clas_1433022889984318Ser_6Arg_3_Alias";
    /** <code>pregCuesMedCmodificarpObservacions</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PREGCUESMEDCMODIFICARPOBSERVACIONS = "Observaciones";
    // Service (TCREARFROMWS)
    /** <code>TCREARFROMWS</code> service id. */
    public static final String SERV_ID_TCREARFROMWS = "Clas_1433022889984318Ser_7_Alias";
    /** <code>TCREARFROMWS</code> service name. */
    public static final String SERV_NAME_TCREARFROMWS = "TCREARFROMWS";
    /** <code>TCREARFROMWS</code> service alias. */
    public static final String SERV_ALIAS_TCREARFROMWS = "TCREARFROMWS";
    /** Agents allowed to execute the service TCREARFROMWS **/
    public static final String TCREARFROMWS_SRVAGENTS = "";
    // Inbound arguments
    /** <code>pregCuesMedCTCREARFROMWSpPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_TCREARFROMWS_PREGCUESMEDCTCREARFROMWSPPERSONAC = "pPersonaC";
    /** <code>pregCuesMedCTCREARFROMWSpPersonaC</code> inbound argument id. */
    public static final String ARG_ID_TCREARFROMWS_PREGCUESMEDCTCREARFROMWSPPERSONAC = "Clas_1433022889984318Ser_7Arg_2_Alias";
    /** <code>pregCuesMedCTCREARFROMWSpPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARFROMWS_PREGCUESMEDCTCREARFROMWSPPERSONAC = "Persona";
    /** <code>pregCuesMedCTCREARFROMWSpPregCuesMedC</code> inbound argument name. */
    public static final String ARG_NAME_TCREARFROMWS_PREGCUESMEDCTCREARFROMWSPPREGCUESMEDC = "pPregCuesMedC";
    /** <code>pregCuesMedCTCREARFROMWSpPregCuesMedC</code> inbound argument id. */
    public static final String ARG_ID_TCREARFROMWS_PREGCUESMEDCTCREARFROMWSPPREGCUESMEDC = "Clas_1433022889984318Ser_7Arg_3_Alias";
    /** <code>pregCuesMedCTCREARFROMWSpPregCuesMedC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARFROMWS_PREGCUESMEDCTCREARFROMWSPPREGCUESMEDC = "Preg. Cuestionario Médico";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_PREGCUESMEDCRPTAPREGUNTA.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PREGCUESMEDCOBSERVACIONS.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_PREGCUESMEDCCODPREGUNTA.toUpperCase(), PREGCUESMEDCCODPREGUNTA_AGENTS);
    	attributeAgents.put(ATTR_NAME_PREGCUESMEDCRPTAPREGUNTA.toUpperCase(), PREGCUESMEDCRPTAPREGUNTA_AGENTS);
    	attributeAgents.put(ATTR_NAME_PREGCUESMEDCOBSERVACIONS.toUpperCase(), PREGCUESMEDCOBSERVACIONS_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_PERSONAC.toUpperCase(), PERSONAC_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'PregCuesMedC', it returns the identification keys
     * - If className is a facet of the inheritance net of 'PregCuesMedC', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ROLE_NAME_PERSONAC + "." + PersonaCConstants.ATTR_FIELD_PERSONACID);
            returnList.add(ATTR_FIELD_PREGCUESMEDCCODPREGUNTA);
        }
        // Facet 'PregCuesMedC' (This facet)
        if (PregCuesMedCConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ROLE_NAME_PERSONAC + "." + PersonaCConstants.ATTR_FIELD_PERSONACID);
            returnList.add(ATTR_FIELD_PREGCUESMEDCCODPREGUNTA);
        }
        return returnList;
    }
}
