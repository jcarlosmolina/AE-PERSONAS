package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>CuestionarioMed</code> model class.
 */
public final class CuestionarioMedConstants {

    private CuestionarioMedConstants() {

    }

    // Class
    /** <code>CuestionarioMed</code> class id. */
    public static final String CLASS_ID = "Clas_1431633526784077_Alias";
    /** <code>CuestionarioMed</code> class name. */
    public static final String CLASS_NAME = "CuestionarioMed";
    /** <code>CuestionarioMed</code> class alias. */
    public static final String CLASS_ALIAS = "Cuestionario médico";
    /** <code>CuestionarioMed</code> class table name. */
    public static final String TBL_NAME = "CuestionarioMed";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "cuestionarioMedNumero,cuestionarioMedNombre";

    public static final String DSICCUESTIONARIOMED = "IC_CuestionarioMed";
    public static final String DSDSCUESTIONARIOMEDPIU = "DS_CuestionarioMed_PIU";
    public static final String DSDSCUESTIONARIOMEDIIU = "DS_CuestionarioMed_IIU";
    

    // Attribute (cuestionarioMedNumero)
    /** <code>cuestionarioMedNumero</code> attribute id. */
    public static final String ATTR_ID_CUESTIONARIOMEDNUMERO = "Clas_1431633526784077Atr_1_Alias";
    /** <code>cuestionarioMedNumero</code> attribute name. */
    public static final String ATTR_NAME_CUESTIONARIOMEDNUMERO = "cuestionarioMedNumero";
    /** <code>cuestionarioMedNumero</code> attribute alias. */
    public static final String ATTR_ALIAS_CUESTIONARIOMEDNUMERO = "Número";

    /** <code>cuestionarioMedNumero</code> attribute facet sequence. */
    public static final String PATH_FACETS_CUESTIONARIOMEDNUMERO = "";
    /** Agents allowed to view the attribute cuestionarioMedNumero **/
    public static final String CUESTIONARIOMEDNUMERO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (cuestionarioMedNombre)
    /** <code>cuestionarioMedNombre</code> attribute id. */
    public static final String ATTR_ID_CUESTIONARIOMEDNOMBRE = "Clas_1431633526784077Atr_2_Alias";
    /** <code>cuestionarioMedNombre</code> attribute name. */
    public static final String ATTR_NAME_CUESTIONARIOMEDNOMBRE = "cuestionarioMedNombre";
    /** <code>cuestionarioMedNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_CUESTIONARIOMEDNOMBRE = "Nombre";

    /** <code>cuestionarioMedNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_CUESTIONARIOMEDNOMBRE = "";
    /** Agents allowed to view the attribute cuestionarioMedNombre **/
    public static final String CUESTIONARIOMEDNOMBRE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Gestor,MesaDeApoyo";


    // Field (Numero)
    /** <code>Numero</code> field name. */
    public static final String FLD_CUESTIONARIOMEDNUMERO = "Numero";    
    /** <code>cuestionarioMedNumero</code> attribute field name. */
    public static final String ATTR_FIELD_CUESTIONARIOMEDNUMERO = "cuestionarioMedNumero";
    // Field (Nombre)
    /** <code>Nombre</code> field name. */
    public static final String FLD_CUESTIONARIOMEDNOMBRE = "Nombre";    
    /** <code>Nombre</code> field length. */
    public static final int FLD_CUESTIONARIOMEDNOMBRELENGTH = 100;
    /** <code>cuestionarioMedNombre</code> attribute field name. */
    public static final String ATTR_FIELD_CUESTIONARIOMEDNOMBRE = "cuestionarioMedNombre";


    // Compound role (Secciones)
    /** <code>Secciones</code> role id. */
    public static final String ROLE_ID_SECCIONES = "Agr_1431633657856096_Alias";
    /** <code>Secciones</code> role name. */
    public static final String ROLE_NAME_SECCIONES = "secciones";
    /** <code>Cuestionario</code> role alias. */
    public static final String ROLE_ALIAS_SECCIONES = "Secciones";


    /** <code>Secciones</code> inverse role name. */
    public static final String ROLE_INVNAME_SECCIONES = SeccionConstants.ROLE_NAME_CUESTIONARIO;
    /** <code>Secciones</code> role facet sequence. */
    public static final String PATH_FACETS_SECCIONES = "";
    /** <code>Secciones</code> role target class. */
    public static final String ROLE_TARGET_SECCIONES = SeccionConstants.CLASS_NAME;
    /** Agents allowed to navigate through Secciones **/
    public static final String SECCIONES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431633526784077Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>cuestionarioMedcrearpatrNombre</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_CUESTIONARIOMEDCREARPATRNOMBRE = "p_atrNombre";
    /** <code>cuestionarioMedcrearpatrNombre</code> inbound argument id. */
    public static final String ARG_ID_CREAR_CUESTIONARIOMEDCREARPATRNOMBRE = "Clas_1431633526784077Ser_1Arg_2_Alias";
    /** <code>cuestionarioMedcrearpatrNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_CUESTIONARIOMEDCREARPATRNOMBRE = "Nombre";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431633526784077Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>cuestionarioMedeliminarpthisCuestionarioMed</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_CUESTIONARIOMEDELIMINARPTHISCUESTIONARIOMED = "p_thisCuestionarioMed";
    /** <code>cuestionarioMedeliminarpthisCuestionarioMed</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_CUESTIONARIOMEDELIMINARPTHISCUESTIONARIOMED = "Clas_1431633526784077Ser_2Arg_1_Alias";
    /** <code>cuestionarioMedeliminarpthisCuestionarioMed</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_CUESTIONARIOMEDELIMINARPTHISCUESTIONARIOMED = "Cuestionario médico";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_CUESTIONARIOMEDNOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_CUESTIONARIOMEDNUMERO.toUpperCase(), CUESTIONARIOMEDNUMERO_AGENTS);
    	attributeAgents.put(ATTR_NAME_CUESTIONARIOMEDNOMBRE.toUpperCase(), CUESTIONARIOMEDNOMBRE_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'CuestionarioMed', it returns the identification keys
     * - If className is a facet of the inheritance net of 'CuestionarioMed', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_CUESTIONARIOMEDNUMERO);
        }
        // Facet 'CuestionarioMed' (This facet)
        if (CuestionarioMedConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_CUESTIONARIOMEDNUMERO);
        }
        return returnList;
    }
}
