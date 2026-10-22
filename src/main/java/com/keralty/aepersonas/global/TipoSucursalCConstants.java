package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>TipoSucursalC</code> model class.
 */
public final class TipoSucursalCConstants {

    private TipoSucursalCConstants() {

    }

    // Class
    /** <code>TipoSucursalC</code> class id. */
    public static final String CLASS_ID = "Clas_1437649993728293_Alias";
    /** <code>TipoSucursalC</code> class name. */
    public static final String CLASS_NAME = "TipoSucursalC";
    /** <code>TipoSucursalC</code> class alias. */
    public static final String CLASS_ALIAS = "Tipo Sucursal";
    /** <code>TipoSucursalC</code> class table name. */
    public static final String TBL_NAME = "TipoSucursalC";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "tipoSucursalCCodigo,tipoSucursalCDescripcion";

    

    // Attribute (tipoSucursalCCodigo)
    /** <code>tipoSucursalCCodigo</code> attribute id. */
    public static final String ATTR_ID_TIPOSUCURSALCCODIGO = "Clas_1437649993728293Atr_1_Alias";
    /** <code>tipoSucursalCCodigo</code> attribute name. */
    public static final String ATTR_NAME_TIPOSUCURSALCCODIGO = "tipoSucursalCCodigo";
    /** <code>tipoSucursalCCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_TIPOSUCURSALCCODIGO = "Código";

    /** <code>tipoSucursalCCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_TIPOSUCURSALCCODIGO = "";
    /** Agents allowed to view the attribute tipoSucursalCCodigo **/
    public static final String TIPOSUCURSALCCODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (tipoSucursalCDescripcion)
    /** <code>tipoSucursalCDescripcion</code> attribute id. */
    public static final String ATTR_ID_TIPOSUCURSALCDESCRIPCION = "Clas_1437649993728293Atr_2_Alias";
    /** <code>tipoSucursalCDescripcion</code> attribute name. */
    public static final String ATTR_NAME_TIPOSUCURSALCDESCRIPCION = "tipoSucursalCDescripcion";
    /** <code>tipoSucursalCDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_TIPOSUCURSALCDESCRIPCION = "Descripción";

    /** <code>tipoSucursalCDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_TIPOSUCURSALCDESCRIPCION = "";
    /** Agents allowed to view the attribute tipoSucursalCDescripcion **/
    public static final String TIPOSUCURSALCDESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_TIPOSUCURSALCCODIGO = "Codigo";    
    /** <code>tipoSucursalCCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_TIPOSUCURSALCCODIGO = "tipoSucursalCCodigo";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_TIPOSUCURSALCDESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_TIPOSUCURSALCDESCRIPCIONLENGTH = 150;
    /** <code>tipoSucursalCDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_TIPOSUCURSALCDESCRIPCION = "tipoSucursalCDescripcion";


    // Compound role (DirSucursalesC)
    /** <code>DirSucursalesC</code> role id. */
    public static final String ROLE_ID_DIRSUCURSALESC = "Agr_1437649993728086_Alias";
    /** <code>DirSucursalesC</code> role name. */
    public static final String ROLE_NAME_DIRSUCURSALESC = "dirSucursalesC";
    /** <code>TiposSucursalC</code> role alias. */
    public static final String ROLE_ALIAS_DIRSUCURSALESC = "DirSucursalesC";


    /** <code>DirSucursalesC</code> inverse role name. */
    public static final String ROLE_INVNAME_DIRSUCURSALESC = DirSucursalCConstants.ROLE_NAME_TIPOSSUCURSALC;
    /** <code>DirSucursalesC</code> role facet sequence. */
    public static final String PATH_FACETS_DIRSUCURSALESC = "";
    /** <code>DirSucursalesC</code> role target class. */
    public static final String ROLE_TARGET_DIRSUCURSALESC = DirSucursalCConstants.CLASS_NAME;
    /** Agents allowed to navigate through DirSucursalesC **/
    public static final String DIRSUCURSALESC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1437649993728293Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear tipo de sucursal";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "Admin,SuperAdmin,Asesor";
    // Inbound arguments
    /** <code>tipoSucursalCcrearpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TIPOSUCURSALCCREARPATRCODIGO = "p_atrCodigo";
    /** <code>tipoSucursalCcrearpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TIPOSUCURSALCCREARPATRCODIGO = "Clas_1437649993728293Ser_1Arg_1_Alias";
    /** <code>tipoSucursalCcrearpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TIPOSUCURSALCCREARPATRCODIGO = "Código";
    /** <code>tipoSucursalCcrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TIPOSUCURSALCCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>tipoSucursalCcrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TIPOSUCURSALCCREARPATRDESCRIPCION = "Clas_1437649993728293Ser_1Arg_2_Alias";
    /** <code>tipoSucursalCcrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TIPOSUCURSALCCREARPATRDESCRIPCION = "Descripción";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1437649993728293Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar tipo de sucursal";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "Admin,SuperAdmin,Asesor";
    // Preconditions
    /** <code>eliminar</code> precondition 0 id. */
    public static final String PRE_ID_ELIMINAR_0 = "Clas_1437649993728293Pre_1_MsgError";
    // Inbound arguments
    /** <code>tipoSucursalCeliminarpthisTipoSucursalC</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_TIPOSUCURSALCELIMINARPTHISTIPOSUCURSALC = "p_thisTipoSucursalC";
    /** <code>tipoSucursalCeliminarpthisTipoSucursalC</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_TIPOSUCURSALCELIMINARPTHISTIPOSUCURSALC = "Clas_1437649993728293Ser_2Arg_1_Alias";
    /** <code>tipoSucursalCeliminarpthisTipoSucursalC</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_TIPOSUCURSALCELIMINARPTHISTIPOSUCURSALC = "Tipo Sucursal";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1437649993728293Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin,Asesor";
    // Inbound arguments
    /** <code>tipoSucursalCmodificarpthisTipoSucursalC</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TIPOSUCURSALCMODIFICARPTHISTIPOSUCURSALC = "p_thisTipoSucursalC";
    /** <code>tipoSucursalCmodificarpthisTipoSucursalC</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TIPOSUCURSALCMODIFICARPTHISTIPOSUCURSALC = "Clas_1437649993728293Ser_3Arg_1_Alias";
    /** <code>tipoSucursalCmodificarpthisTipoSucursalC</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TIPOSUCURSALCMODIFICARPTHISTIPOSUCURSALC = "Tipo Sucursal";
    /** <code>tipoSucursalCmodificarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TIPOSUCURSALCMODIFICARPDESCRIPCION = "p_Descripcion";
    /** <code>tipoSucursalCmodificarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TIPOSUCURSALCMODIFICARPDESCRIPCION = "Clas_1437649993728293Ser_3Arg_2_Alias";
    /** <code>tipoSucursalCmodificarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TIPOSUCURSALCMODIFICARPDESCRIPCION = "Descripción";
    // Service (InsTiposSucursalC)
    /** <code>InsTiposSucursalC</code> service id. */
    public static final String SERV_ID_INSTIPOSSUCURSALC = "Clas_1437649993728293Ser_4_Alias";
    /** <code>InsTiposSucursalC</code> service name. */
    public static final String SERV_NAME_INSTIPOSSUCURSALC = "InsTiposSucursalC";
    /** <code>InsTiposSucursalC</code> service alias. */
    public static final String SERV_ALIAS_INSTIPOSSUCURSALC = "InsTiposSucursalC";
    /** Agents allowed to execute the service InsTiposSucursalC **/
    public static final String INSTIPOSSUCURSALC_SRVAGENTS = "Admin,SuperAdmin,Asesor";
    // Inbound arguments
    /** <code>tipoSucursalCInsTiposSucursalCpthisTipoSucursalC</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPOSSUCURSALC_TIPOSUCURSALCINSTIPOSSUCURSALCPTHISTIPOSUCURSALC = "p_thisTipoSucursalC";
    /** <code>tipoSucursalCInsTiposSucursalCpthisTipoSucursalC</code> inbound argument id. */
    public static final String ARG_ID_INSTIPOSSUCURSALC_TIPOSUCURSALCINSTIPOSSUCURSALCPTHISTIPOSUCURSALC = "Clas_1437649993728293Ser_4Arg_1_Alias";
    /** <code>tipoSucursalCInsTiposSucursalCpthisTipoSucursalC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPOSSUCURSALC_TIPOSUCURSALCINSTIPOSSUCURSALCPTHISTIPOSUCURSALC = "TiposSucursalC";
    /** <code>tipoSucursalCInsTiposSucursalCpevcDirSucursalC</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPOSSUCURSALC_TIPOSUCURSALCINSTIPOSSUCURSALCPEVCDIRSUCURSALC = "p_evcDirSucursalC";
    /** <code>tipoSucursalCInsTiposSucursalCpevcDirSucursalC</code> inbound argument id. */
    public static final String ARG_ID_INSTIPOSSUCURSALC_TIPOSUCURSALCINSTIPOSSUCURSALCPEVCDIRSUCURSALC = "Clas_1437649993728293Ser_4Arg_2_Alias";
    /** <code>tipoSucursalCInsTiposSucursalCpevcDirSucursalC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPOSSUCURSALC_TIPOSUCURSALCINSTIPOSSUCURSALCPEVCDIRSUCURSALC = "DirSucursalesC";
    // Service (DelTiposSucursalC)
    /** <code>DelTiposSucursalC</code> service id. */
    public static final String SERV_ID_DELTIPOSSUCURSALC = "Clas_1437649993728293Ser_5_Alias";
    /** <code>DelTiposSucursalC</code> service name. */
    public static final String SERV_NAME_DELTIPOSSUCURSALC = "DelTiposSucursalC";
    /** <code>DelTiposSucursalC</code> service alias. */
    public static final String SERV_ALIAS_DELTIPOSSUCURSALC = "DelTiposSucursalC";
    /** Agents allowed to execute the service DelTiposSucursalC **/
    public static final String DELTIPOSSUCURSALC_SRVAGENTS = "Admin,SuperAdmin,Asesor";
    // Inbound arguments
    /** <code>tipoSucursalCDelTiposSucursalCpthisTipoSucursalC</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPOSSUCURSALC_TIPOSUCURSALCDELTIPOSSUCURSALCPTHISTIPOSUCURSALC = "p_thisTipoSucursalC";
    /** <code>tipoSucursalCDelTiposSucursalCpthisTipoSucursalC</code> inbound argument id. */
    public static final String ARG_ID_DELTIPOSSUCURSALC_TIPOSUCURSALCDELTIPOSSUCURSALCPTHISTIPOSUCURSALC = "Clas_1437649993728293Ser_5Arg_1_Alias";
    /** <code>tipoSucursalCDelTiposSucursalCpthisTipoSucursalC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPOSSUCURSALC_TIPOSUCURSALCDELTIPOSSUCURSALCPTHISTIPOSUCURSALC = "TiposSucursalC";
    /** <code>tipoSucursalCDelTiposSucursalCpevcDirSucursalC</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPOSSUCURSALC_TIPOSUCURSALCDELTIPOSSUCURSALCPEVCDIRSUCURSALC = "p_evcDirSucursalC";
    /** <code>tipoSucursalCDelTiposSucursalCpevcDirSucursalC</code> inbound argument id. */
    public static final String ARG_ID_DELTIPOSSUCURSALC_TIPOSUCURSALCDELTIPOSSUCURSALCPEVCDIRSUCURSALC = "Clas_1437649993728293Ser_5Arg_2_Alias";
    /** <code>tipoSucursalCDelTiposSucursalCpevcDirSucursalC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPOSSUCURSALC_TIPOSUCURSALCDELTIPOSSUCURSALCPEVCDIRSUCURSALC = "DirSucursalesC";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_TIPOSUCURSALCDESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_TIPOSUCURSALCCODIGO.toUpperCase(), TIPOSUCURSALCCODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_TIPOSUCURSALCDESCRIPCION.toUpperCase(), TIPOSUCURSALCDESCRIPCION_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'TipoSucursalC', it returns the identification keys
     * - If className is a facet of the inheritance net of 'TipoSucursalC', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_TIPOSUCURSALCCODIGO);
        }
        // Facet 'TipoSucursalC' (This facet)
        if (TipoSucursalCConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_TIPOSUCURSALCCODIGO);
        }
        return returnList;
    }
}
