package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>Prorrateo</code> model class.
 */
public final class ProrrateoConstants {

    private ProrrateoConstants() {

    }

    // Class
    /** <code>Prorrateo</code> class id. */
    public static final String CLASS_ID = "Clas_1547053432832527_Alias";
    /** <code>Prorrateo</code> class name. */
    public static final String CLASS_NAME = "Prorrateo";
    /** <code>Prorrateo</code> class alias. */
    public static final String CLASS_ALIAS = "Prorrateo";
    /** <code>Prorrateo</code> class table name. */
    public static final String TBL_NAME = "Prorrateo";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "dominioNumero,prorrateoidProrrateo,prorrateoDia,prorrateoPorcentaje";

    public static final String DSICPRORRATEO = "IC_Prorrateo";
    public static final String DSDSPRORRATEO = "DS_Prorrateo";
    

    // Attribute (prorrateoidProrrateo)
    /** <code>prorrateoidProrrateo</code> attribute id. */
    public static final String ATTR_ID_PRORRATEOIDPRORRATEO = "Clas_1547053432832527Atr_1_Alias";
    /** <code>prorrateoidProrrateo</code> attribute name. */
    public static final String ATTR_NAME_PRORRATEOIDPRORRATEO = "prorrateoidProrrateo";
    /** <code>prorrateoidProrrateo</code> attribute alias. */
    public static final String ATTR_ALIAS_PRORRATEOIDPRORRATEO = "id_Prorrateo";

    /** <code>prorrateoidProrrateo</code> attribute facet sequence. */
    public static final String PATH_FACETS_PRORRATEOIDPRORRATEO = "";
    /** Agents allowed to view the attribute prorrateoidProrrateo **/
    public static final String PRORRATEOIDPRORRATEO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (prorrateoDia)
    /** <code>prorrateoDia</code> attribute id. */
    public static final String ATTR_ID_PRORRATEODIA = "Clas_1547053432832527Atr_2_Alias";
    /** <code>prorrateoDia</code> attribute name. */
    public static final String ATTR_NAME_PRORRATEODIA = "prorrateoDia";
    /** <code>prorrateoDia</code> attribute alias. */
    public static final String ATTR_ALIAS_PRORRATEODIA = "Día del mes";

    /** <code>prorrateoDia</code> attribute facet sequence. */
    public static final String PATH_FACETS_PRORRATEODIA = "";
    /** Agents allowed to view the attribute prorrateoDia **/
    public static final String PRORRATEODIA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (prorrateoPorcentaje)
    /** <code>prorrateoPorcentaje</code> attribute id. */
    public static final String ATTR_ID_PRORRATEOPORCENTAJE = "Clas_1547053432832527Atr_3_Alias";
    /** <code>prorrateoPorcentaje</code> attribute name. */
    public static final String ATTR_NAME_PRORRATEOPORCENTAJE = "prorrateoPorcentaje";
    /** <code>prorrateoPorcentaje</code> attribute alias. */
    public static final String ATTR_ALIAS_PRORRATEOPORCENTAJE = "Porcentaje";

    /** <code>prorrateoPorcentaje</code> attribute facet sequence. */
    public static final String PATH_FACETS_PRORRATEOPORCENTAJE = "";
    /** Agents allowed to view the attribute prorrateoPorcentaje **/
    public static final String PRORRATEOPORCENTAJE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Attribute (Dominio.dominioNumero)
    /** <code>Dominio.dominioNumero</code> identification attribute name. */
    public static final String ATTR_NAME_DOMINIO_DOMINIONUMERO = "dominio.dominioNumero";

    // Field (Numero)
    /** <code>Numero</code> field name. */
    public static final String FLD_DOMINIONUMERO = "Numero";    
    /** <code>Dominio.dominioNumero</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIO_DOMINIONUMERO = "dominioNumero";
    // Field (id_Prorrateo)
    /** <code>id_Prorrateo</code> field name. */
    public static final String FLD_PRORRATEOIDPRORRATEO = "id_Prorrateo";    
    /** <code>prorrateoidProrrateo</code> attribute field name. */
    public static final String ATTR_FIELD_PRORRATEOIDPRORRATEO = "prorrateoidProrrateo";
    // Field (Dia)
    /** <code>Dia</code> field name. */
    public static final String FLD_PRORRATEODIA = "Dia";    
    /** <code>prorrateoDia</code> attribute field name. */
    public static final String ATTR_FIELD_PRORRATEODIA = "prorrateoDia";
    // Field (Porcentaje)
    /** <code>Porcentaje</code> field name. */
    public static final String FLD_PRORRATEOPORCENTAJE = "Porcentaje";    
    /** <code>prorrateoPorcentaje</code> attribute field name. */
    public static final String ATTR_FIELD_PRORRATEOPORCENTAJE = "prorrateoPorcentaje";

    // Component role (Dominio)
    /** <code>Dominio</code> role id. */
    public static final String ROLE_ID_DOMINIO = "Agr_1547053432832997_Alias";
    /** <code>Dominio</code> role name. */
    public static final String ROLE_NAME_DOMINIO = "dominio";
    /** <code>Dominio</code> role alias. */
    public static final String ROLE_ALIAS_DOMINIO = "Dominio";

    /** <code>Dominio</code> inverse role name. */
    public static final String ROLE_INVNAME_DOMINIO = DominioConstants.ROLE_NAME_PRORRATEOS;
    /** <code>Dominio</code> role facet sequence. */
    public static final String PATH_FACETS_DOMINIO = "";
    /** <code>Dominio</code> role target class. */
    public static final String ROLE_TARGET_DOMINIO = DominioConstants.CLASS_NAME;

    /** Agents allowed to navigate through Dominio **/
    public static final String DOMINIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1547053432832527Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>crear</code> precondition 0 id. */
    public static final String PRE_ID_CREAR_0 = "Clas_1547053432832527Pre_1_MsgError";
    /** <code>crear</code> precondition 1 id. */
    public static final String PRE_ID_CREAR_1 = "Clas_1547053432832527Pre_2_MsgError";
    // Inbound arguments
    /** <code>prorrateocrearpagrDominio</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PRORRATEOCREARPAGRDOMINIO = "p_agrDominio";
    /** <code>prorrateocrearpagrDominio</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PRORRATEOCREARPAGRDOMINIO = "Clas_1547053432832527Ser_1Arg_10_Alias";
    /** <code>prorrateocrearpagrDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PRORRATEOCREARPAGRDOMINIO = "Dominio";
    /** <code>prorrateocrearpatrDia</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PRORRATEOCREARPATRDIA = "p_atrDia";
    /** <code>prorrateocrearpatrDia</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PRORRATEOCREARPATRDIA = "Clas_1547053432832527Ser_1Arg_3_Alias";
    /** <code>prorrateocrearpatrDia</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PRORRATEOCREARPATRDIA = "Día del mes";
    /** <code>prorrateocrearpatrPorcentaje</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PRORRATEOCREARPATRPORCENTAJE = "p_atrPorcentaje";
    /** <code>prorrateocrearpatrPorcentaje</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PRORRATEOCREARPATRPORCENTAJE = "Clas_1547053432832527Ser_1Arg_4_Alias";
    /** <code>prorrateocrearpatrPorcentaje</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PRORRATEOCREARPATRPORCENTAJE = "Porcentaje";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1547053432832527Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>prorrateoeliminarpthisProrrateo</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_PRORRATEOELIMINARPTHISPRORRATEO = "p_thisProrrateo";
    /** <code>prorrateoeliminarpthisProrrateo</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_PRORRATEOELIMINARPTHISPRORRATEO = "Clas_1547053432832527Ser_2Arg_1_Alias";
    /** <code>prorrateoeliminarpthisProrrateo</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_PRORRATEOELIMINARPTHISPRORRATEO = "Prorrateo";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1547053432832527Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>modificar</code> precondition 0 id. */
    public static final String PRE_ID_MODIFICAR_0 = "Clas_1547053432832527Pre_4_MsgError";
    /** <code>modificar</code> precondition 1 id. */
    public static final String PRE_ID_MODIFICAR_1 = "Clas_1547053432832527Pre_3_MsgError";
    // Inbound arguments
    /** <code>prorrateomodificarpthisProrrateo</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PRORRATEOMODIFICARPTHISPRORRATEO = "p_thisProrrateo";
    /** <code>prorrateomodificarpthisProrrateo</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PRORRATEOMODIFICARPTHISPRORRATEO = "Clas_1547053432832527Ser_3Arg_1_Alias";
    /** <code>prorrateomodificarpthisProrrateo</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PRORRATEOMODIFICARPTHISPRORRATEO = "Prorrateo";
    /** <code>prorrateomodificarpDia</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PRORRATEOMODIFICARPDIA = "p_Dia";
    /** <code>prorrateomodificarpDia</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PRORRATEOMODIFICARPDIA = "Clas_1547053432832527Ser_3Arg_2_Alias";
    /** <code>prorrateomodificarpDia</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PRORRATEOMODIFICARPDIA = "Día del mes";
    /** <code>prorrateomodificarpPorcentaje</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PRORRATEOMODIFICARPPORCENTAJE = "p_Porcentaje";
    /** <code>prorrateomodificarpPorcentaje</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PRORRATEOMODIFICARPPORCENTAJE = "Clas_1547053432832527Ser_3Arg_3_Alias";
    /** <code>prorrateomodificarpPorcentaje</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PRORRATEOMODIFICARPPORCENTAJE = "Porcentaje";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_PRORRATEODIA.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_PRORRATEOPORCENTAJE.toUpperCase(), Constants.Type.REAL.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_PRORRATEOIDPRORRATEO.toUpperCase(), PRORRATEOIDPRORRATEO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PRORRATEODIA.toUpperCase(), PRORRATEODIA_AGENTS);
    	attributeAgents.put(ATTR_NAME_PRORRATEOPORCENTAJE.toUpperCase(), PRORRATEOPORCENTAJE_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_DOMINIO.toUpperCase(), DOMINIO_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'Prorrateo', it returns the identification keys
     * - If className is a facet of the inheritance net of 'Prorrateo', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ROLE_NAME_DOMINIO + "." + DominioConstants.ATTR_FIELD_DOMINIONUMERO);
            returnList.add(ATTR_FIELD_PRORRATEOIDPRORRATEO);
        }
        // Facet 'Prorrateo' (This facet)
        if (ProrrateoConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ROLE_NAME_DOMINIO + "." + DominioConstants.ATTR_FIELD_DOMINIONUMERO);
            returnList.add(ATTR_FIELD_PRORRATEOIDPRORRATEO);
        }
        return returnList;
    }
}
