package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>ContSinDocSol</code> model class.
 */
public final class ContSinDocSolConstants {

    private ContSinDocSolConstants() {

    }

    // Class
    /** <code>ContSinDocSol</code> class id. */
    public static final String CLASS_ID = "Clas_1517844955136648_Alias";
    /** <code>ContSinDocSol</code> class name. */
    public static final String CLASS_NAME = "ContSinDocSol";
    /** <code>ContSinDocSol</code> class alias. */
    public static final String CLASS_ALIAS = "Contratos exentos doc. Solicitud";
    /** <code>ContSinDocSol</code> class table name. */
    public static final String TBL_NAME = "ContSinDocSol";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "contSinDocSolidContSinDocSol,contSinDocSolNumContrato";

    public static final String DSDSCONTSINDOCSOL = "DS_ContSinDocSol";
    

    // Attribute (contSinDocSolidContSinDocSol)
    /** <code>contSinDocSolidContSinDocSol</code> attribute id. */
    public static final String ATTR_ID_CONTSINDOCSOLIDCONTSINDOCSOL = "Clas_1517844955136648Atr_1_Alias";
    /** <code>contSinDocSolidContSinDocSol</code> attribute name. */
    public static final String ATTR_NAME_CONTSINDOCSOLIDCONTSINDOCSOL = "contSinDocSolidContSinDocSol";
    /** <code>contSinDocSolidContSinDocSol</code> attribute alias. */
    public static final String ATTR_ALIAS_CONTSINDOCSOLIDCONTSINDOCSOL = "Id.";

    /** <code>contSinDocSolidContSinDocSol</code> attribute facet sequence. */
    public static final String PATH_FACETS_CONTSINDOCSOLIDCONTSINDOCSOL = "";
    /** Agents allowed to view the attribute contSinDocSolidContSinDocSol **/
    public static final String CONTSINDOCSOLIDCONTSINDOCSOL_AGENTS = "Admin,SuperAdmin,Asesor,Gestor,MesaDeApoyo";
    // Attribute (contSinDocSolNumContrato)
    /** <code>contSinDocSolNumContrato</code> attribute id. */
    public static final String ATTR_ID_CONTSINDOCSOLNUMCONTRATO = "Clas_1517844955136648Atr_2_Alias";
    /** <code>contSinDocSolNumContrato</code> attribute name. */
    public static final String ATTR_NAME_CONTSINDOCSOLNUMCONTRATO = "contSinDocSolNumContrato";
    /** <code>contSinDocSolNumContrato</code> attribute alias. */
    public static final String ATTR_ALIAS_CONTSINDOCSOLNUMCONTRATO = "Nº Contrato";

    /** <code>contSinDocSolNumContrato</code> attribute facet sequence. */
    public static final String PATH_FACETS_CONTSINDOCSOLNUMCONTRATO = "";
    /** Agents allowed to view the attribute contSinDocSolNumContrato **/
    public static final String CONTSINDOCSOLNUMCONTRATO_AGENTS = "Admin,SuperAdmin,Asesor,Gestor,MesaDeApoyo";


    // Field (id_ContSinDocSol)
    /** <code>id_ContSinDocSol</code> field name. */
    public static final String FLD_CONTSINDOCSOLIDCONTSINDOCSOL = "id_ContSinDocSol";    
    /** <code>contSinDocSolidContSinDocSol</code> attribute field name. */
    public static final String ATTR_FIELD_CONTSINDOCSOLIDCONTSINDOCSOL = "contSinDocSolidContSinDocSol";
    // Field (NumContrato)
    /** <code>NumContrato</code> field name. */
    public static final String FLD_CONTSINDOCSOLNUMCONTRATO = "NumContrato";    
    /** <code>NumContrato</code> field length. */
    public static final int FLD_CONTSINDOCSOLNUMCONTRATOLENGTH = 50;
    /** <code>contSinDocSolNumContrato</code> attribute field name. */
    public static final String ATTR_FIELD_CONTSINDOCSOLNUMCONTRATO = "contSinDocSolNumContrato";



    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1517844955136648Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>contSinDocSolcrearpatrNumContrato</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_CONTSINDOCSOLCREARPATRNUMCONTRATO = "p_atrNumContrato";
    /** <code>contSinDocSolcrearpatrNumContrato</code> inbound argument id. */
    public static final String ARG_ID_CREAR_CONTSINDOCSOLCREARPATRNUMCONTRATO = "Clas_1517844955136648Ser_1Arg_2_Alias";
    /** <code>contSinDocSolcrearpatrNumContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_CONTSINDOCSOLCREARPATRNUMCONTRATO = "Nº Contrato";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1517844955136648Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>contSinDocSoleliminarpthisContSinDocSol</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_CONTSINDOCSOLELIMINARPTHISCONTSINDOCSOL = "p_thisContSinDocSol";
    /** <code>contSinDocSoleliminarpthisContSinDocSol</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_CONTSINDOCSOLELIMINARPTHISCONTSINDOCSOL = "Clas_1517844955136648Ser_2Arg_1_Alias";
    /** <code>contSinDocSoleliminarpthisContSinDocSol</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_CONTSINDOCSOLELIMINARPTHISCONTSINDOCSOL = "Contratos exentos doc. Solicitud";

    public static final String FILTER_NAME_FCONTSINDOCSOLNUMCONTRATO = "F_ContSinDocSolNumContrato";
    public static final String VAR_NAME_FCONTSINDOCSOLNUMCONTRATO_VFNUMCONT = "vfNumCont";
    public static final String FILTER_NAME_FIPORNUMCONT = "F_iPorNumCont";
    public static final String VAR_NAME_FIPORNUMCONT_VFNUMCONT = "vfNumCont";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_CONTSINDOCSOLNUMCONTRATO.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_CONTSINDOCSOLIDCONTSINDOCSOL.toUpperCase(), CONTSINDOCSOLIDCONTSINDOCSOL_AGENTS);
    	attributeAgents.put(ATTR_NAME_CONTSINDOCSOLNUMCONTRATO.toUpperCase(), CONTSINDOCSOLNUMCONTRATO_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'ContSinDocSol', it returns the identification keys
     * - If className is a facet of the inheritance net of 'ContSinDocSol', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_CONTSINDOCSOLIDCONTSINDOCSOL);
        }
        // Facet 'ContSinDocSol' (This facet)
        if (ContSinDocSolConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_CONTSINDOCSOLIDCONTSINDOCSOL);
        }
        return returnList;
    }
}
