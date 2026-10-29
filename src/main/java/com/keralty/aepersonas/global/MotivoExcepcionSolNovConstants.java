package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>MotivoExcepcionSolNov</code> model class.
 */
public final class MotivoExcepcionSolNovConstants {

    private MotivoExcepcionSolNovConstants() {

    }

    // Class
    /** <code>MotivoExcepcionSolNov</code> class id. */
    public static final String CLASS_ID = "Clas_1583336390656979_Alias";
    /** <code>MotivoExcepcionSolNov</code> class name. */
    public static final String CLASS_NAME = "MotivoExcepcionSolNov";
    /** <code>MotivoExcepcionSolNov</code> class alias. */
    public static final String CLASS_ALIAS = "Motivo Excepción";
    /** <code>MotivoExcepcionSolNov</code> class table name. */
    public static final String TBL_NAME = "MotivoExcepcionSolNov";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "motivoExcepcionSolNovId,motivoExcepcionSolNovDescripcion";

    public static final String DSDSMOTIVOEXCEPCIONSOLNOV = "DS_MotivoExcepcionSolNov";
    public static final String DSICMOTIVOEXCEPCIONSOLNOV = "IC_MotivoExcepcionSolNov";
    

    // Attribute (motivoExcepcionSolNovId)
    /** <code>motivoExcepcionSolNovId</code> attribute id. */
    public static final String ATTR_ID_MOTIVOEXCEPCIONSOLNOVID = "Clas_1583336390656979Atr_1_Alias";
    /** <code>motivoExcepcionSolNovId</code> attribute name. */
    public static final String ATTR_NAME_MOTIVOEXCEPCIONSOLNOVID = "motivoExcepcionSolNovId";
    /** <code>motivoExcepcionSolNovId</code> attribute alias. */
    public static final String ATTR_ALIAS_MOTIVOEXCEPCIONSOLNOVID = "Id";

    /** <code>motivoExcepcionSolNovId</code> attribute facet sequence. */
    public static final String PATH_FACETS_MOTIVOEXCEPCIONSOLNOVID = "";
    /** Agents allowed to view the attribute motivoExcepcionSolNovId **/
    public static final String MOTIVOEXCEPCIONSOLNOVID_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (motivoExcepcionSolNovDescripcion)
    /** <code>motivoExcepcionSolNovDescripcion</code> attribute id. */
    public static final String ATTR_ID_MOTIVOEXCEPCIONSOLNOVDESCRIPCION = "Clas_1583336390656979Atr_2_Alias";
    /** <code>motivoExcepcionSolNovDescripcion</code> attribute name. */
    public static final String ATTR_NAME_MOTIVOEXCEPCIONSOLNOVDESCRIPCION = "motivoExcepcionSolNovDescripcion";
    /** <code>motivoExcepcionSolNovDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_MOTIVOEXCEPCIONSOLNOVDESCRIPCION = "Descripción";

    /** <code>motivoExcepcionSolNovDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_MOTIVOEXCEPCIONSOLNOVDESCRIPCION = "";
    /** Agents allowed to view the attribute motivoExcepcionSolNovDescripcion **/
    public static final String MOTIVOEXCEPCIONSOLNOVDESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Id)
    /** <code>Id</code> field name. */
    public static final String FLD_MOTIVOEXCEPCIONSOLNOVID = "Id";    
    /** <code>motivoExcepcionSolNovId</code> attribute field name. */
    public static final String ATTR_FIELD_MOTIVOEXCEPCIONSOLNOVID = "motivoExcepcionSolNovId";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_MOTIVOEXCEPCIONSOLNOVDESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_MOTIVOEXCEPCIONSOLNOVDESCRIPCIONLENGTH = 150;
    /** <code>motivoExcepcionSolNovDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_MOTIVOEXCEPCIONSOLNOVDESCRIPCION = "motivoExcepcionSolNovDescripcion";


    // Compound role (Solicitudes)
    /** <code>Solicitudes</code> role id. */
    public static final String ROLE_ID_SOLICITUDES = "Agr_1583337046016101_Alias";
    /** <code>Solicitudes</code> role name. */
    public static final String ROLE_NAME_SOLICITUDES = "solicitudes";
    /** <code>MotivoExcepcion</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUDES = "Solicitudes";


    /** <code>Solicitudes</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUDES = SolicitudNovedadConstants.ROLE_NAME_MOTIVOEXCEPCION;
    /** <code>Solicitudes</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUDES = "";
    /** <code>Solicitudes</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUDES = SolicitudNovedadConstants.CLASS_NAME;
    /** Agents allowed to navigate through Solicitudes **/
    public static final String SOLICITUDES_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1583336390656979Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>motivoExcepcionSolNovcrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_MOTIVOEXCEPCIONSOLNOVCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>motivoExcepcionSolNovcrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_MOTIVOEXCEPCIONSOLNOVCREARPATRDESCRIPCION = "Clas_1583336390656979Ser_1Arg_2_Alias";
    /** <code>motivoExcepcionSolNovcrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_MOTIVOEXCEPCIONSOLNOVCREARPATRDESCRIPCION = "Descripción";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1583336390656979Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>motivoExcepcionSolNoveliminarpthisMotivoExcepcionSolNov</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_MOTIVOEXCEPCIONSOLNOVELIMINARPTHISMOTIVOEXCEPCIONSOLNOV = "p_thisMotivoExcepcionSolNov";
    /** <code>motivoExcepcionSolNoveliminarpthisMotivoExcepcionSolNov</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_MOTIVOEXCEPCIONSOLNOVELIMINARPTHISMOTIVOEXCEPCIONSOLNOV = "Clas_1583336390656979Ser_2Arg_1_Alias";
    /** <code>motivoExcepcionSolNoveliminarpthisMotivoExcepcionSolNov</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_MOTIVOEXCEPCIONSOLNOVELIMINARPTHISMOTIVOEXCEPCIONSOLNOV = "Motivo Excepción";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1583336390656979Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>motivoExcepcionSolNovmodificarpthisMotivoExcepcionSolNov</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_MOTIVOEXCEPCIONSOLNOVMODIFICARPTHISMOTIVOEXCEPCIONSOLNOV = "p_thisMotivoExcepcionSolNov";
    /** <code>motivoExcepcionSolNovmodificarpthisMotivoExcepcionSolNov</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_MOTIVOEXCEPCIONSOLNOVMODIFICARPTHISMOTIVOEXCEPCIONSOLNOV = "Clas_1583336390656979Ser_3Arg_1_Alias";
    /** <code>motivoExcepcionSolNovmodificarpthisMotivoExcepcionSolNov</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_MOTIVOEXCEPCIONSOLNOVMODIFICARPTHISMOTIVOEXCEPCIONSOLNOV = "Motivo Excepción";
    /** <code>motivoExcepcionSolNovmodificarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_MOTIVOEXCEPCIONSOLNOVMODIFICARPDESCRIPCION = "p_Descripcion";
    /** <code>motivoExcepcionSolNovmodificarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_MOTIVOEXCEPCIONSOLNOVMODIFICARPDESCRIPCION = "Clas_1583336390656979Ser_3Arg_2_Alias";
    /** <code>motivoExcepcionSolNovmodificarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_MOTIVOEXCEPCIONSOLNOVMODIFICARPDESCRIPCION = "Descripción";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_MOTIVOEXCEPCIONSOLNOVDESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_MOTIVOEXCEPCIONSOLNOVID.toUpperCase(), MOTIVOEXCEPCIONSOLNOVID_AGENTS);
    	attributeAgents.put(ATTR_NAME_MOTIVOEXCEPCIONSOLNOVDESCRIPCION.toUpperCase(), MOTIVOEXCEPCIONSOLNOVDESCRIPCION_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'MotivoExcepcionSolNov', it returns the identification keys
     * - If className is a facet of the inheritance net of 'MotivoExcepcionSolNov', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_MOTIVOEXCEPCIONSOLNOVID);
        }
        // Facet 'MotivoExcepcionSolNov' (This facet)
        if (MotivoExcepcionSolNovConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_MOTIVOEXCEPCIONSOLNOVID);
        }
        return returnList;
    }
}
