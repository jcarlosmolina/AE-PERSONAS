package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>MotDevAreaMedica</code> model class.
 */
public final class MotDevAreaMedicaConstants {

    private MotDevAreaMedicaConstants() {

    }

    // Class
    /** <code>MotDevAreaMedica</code> class id. */
    public static final String CLASS_ID = "Clas_1497629065216447_Alias";
    /** <code>MotDevAreaMedica</code> class name. */
    public static final String CLASS_NAME = "MotDevAreaMedica";
    /** <code>MotDevAreaMedica</code> class alias. */
    public static final String CLASS_ALIAS = "Motivo devolución";
    /** <code>MotDevAreaMedica</code> class table name. */
    public static final String TBL_NAME = "MotDevAreaMedica";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "motDevAreaMedicaId,motDevAreaMedicaDescripcion";

    public static final String DSDSMOTDEVAREAMEDICA = "DS_MotDevAreaMedica";
    public static final String DSICMOTDEVAREAMEDICA = "IC_MotDevAreaMedica";
    

    // Attribute (motDevAreaMedicaId)
    /** <code>motDevAreaMedicaId</code> attribute id. */
    public static final String ATTR_ID_MOTDEVAREAMEDICAID = "Clas_1497629065216447Atr_1_Alias";
    /** <code>motDevAreaMedicaId</code> attribute name. */
    public static final String ATTR_NAME_MOTDEVAREAMEDICAID = "motDevAreaMedicaId";
    /** <code>motDevAreaMedicaId</code> attribute alias. */
    public static final String ATTR_ALIAS_MOTDEVAREAMEDICAID = "Id";

    /** <code>motDevAreaMedicaId</code> attribute facet sequence. */
    public static final String PATH_FACETS_MOTDEVAREAMEDICAID = "";
    /** Agents allowed to view the attribute motDevAreaMedicaId **/
    public static final String MOTDEVAREAMEDICAID_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (motDevAreaMedicaDescripcion)
    /** <code>motDevAreaMedicaDescripcion</code> attribute id. */
    public static final String ATTR_ID_MOTDEVAREAMEDICADESCRIPCION = "Clas_1497629065216447Atr_2_Alias";
    /** <code>motDevAreaMedicaDescripcion</code> attribute name. */
    public static final String ATTR_NAME_MOTDEVAREAMEDICADESCRIPCION = "motDevAreaMedicaDescripcion";
    /** <code>motDevAreaMedicaDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_MOTDEVAREAMEDICADESCRIPCION = "Descripción";

    /** <code>motDevAreaMedicaDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_MOTDEVAREAMEDICADESCRIPCION = "";
    /** Agents allowed to view the attribute motDevAreaMedicaDescripcion **/
    public static final String MOTDEVAREAMEDICADESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Id)
    /** <code>Id</code> field name. */
    public static final String FLD_MOTDEVAREAMEDICAID = "Id";    
    /** <code>motDevAreaMedicaId</code> attribute field name. */
    public static final String ATTR_FIELD_MOTDEVAREAMEDICAID = "motDevAreaMedicaId";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_MOTDEVAREAMEDICADESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_MOTDEVAREAMEDICADESCRIPCIONLENGTH = 50;
    /** <code>motDevAreaMedicaDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_MOTDEVAREAMEDICADESCRIPCION = "motDevAreaMedicaDescripcion";



    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1497629065216447Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>motDevAreaMedicacrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_MOTDEVAREAMEDICACREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>motDevAreaMedicacrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_MOTDEVAREAMEDICACREARPATRDESCRIPCION = "Clas_1497629065216447Ser_1Arg_2_Alias";
    /** <code>motDevAreaMedicacrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_MOTDEVAREAMEDICACREARPATRDESCRIPCION = "Descripción";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1497629065216447Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>motDevAreaMedicaeliminarpthisMotDevAreaMedica</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_MOTDEVAREAMEDICAELIMINARPTHISMOTDEVAREAMEDICA = "p_thisMotDevAreaMedica";
    /** <code>motDevAreaMedicaeliminarpthisMotDevAreaMedica</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_MOTDEVAREAMEDICAELIMINARPTHISMOTDEVAREAMEDICA = "Clas_1497629065216447Ser_2Arg_1_Alias";
    /** <code>motDevAreaMedicaeliminarpthisMotDevAreaMedica</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_MOTDEVAREAMEDICAELIMINARPTHISMOTDEVAREAMEDICA = "Motivo devolución";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1497629065216447Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>motDevAreaMedicamodificarpthisMotDevAreaMedica</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_MOTDEVAREAMEDICAMODIFICARPTHISMOTDEVAREAMEDICA = "p_thisMotDevAreaMedica";
    /** <code>motDevAreaMedicamodificarpthisMotDevAreaMedica</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_MOTDEVAREAMEDICAMODIFICARPTHISMOTDEVAREAMEDICA = "Clas_1497629065216447Ser_3Arg_1_Alias";
    /** <code>motDevAreaMedicamodificarpthisMotDevAreaMedica</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_MOTDEVAREAMEDICAMODIFICARPTHISMOTDEVAREAMEDICA = "Motivo devolución";
    /** <code>motDevAreaMedicamodificarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_MOTDEVAREAMEDICAMODIFICARPDESCRIPCION = "p_Descripcion";
    /** <code>motDevAreaMedicamodificarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_MOTDEVAREAMEDICAMODIFICARPDESCRIPCION = "Clas_1497629065216447Ser_3Arg_2_Alias";
    /** <code>motDevAreaMedicamodificarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_MOTDEVAREAMEDICAMODIFICARPDESCRIPCION = "Descripción";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_MOTDEVAREAMEDICADESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_MOTDEVAREAMEDICAID.toUpperCase(), MOTDEVAREAMEDICAID_AGENTS);
    	attributeAgents.put(ATTR_NAME_MOTDEVAREAMEDICADESCRIPCION.toUpperCase(), MOTDEVAREAMEDICADESCRIPCION_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'MotDevAreaMedica', it returns the identification keys
     * - If className is a facet of the inheritance net of 'MotDevAreaMedica', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_MOTDEVAREAMEDICAID);
        }
        // Facet 'MotDevAreaMedica' (This facet)
        if (MotDevAreaMedicaConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_MOTDEVAREAMEDICAID);
        }
        return returnList;
    }
}
