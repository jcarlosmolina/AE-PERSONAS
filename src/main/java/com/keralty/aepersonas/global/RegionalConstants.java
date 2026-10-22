package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>Regional</code> model class.
 */
public final class RegionalConstants {

    private RegionalConstants() {

    }

    // Class
    /** <code>Regional</code> class id. */
    public static final String CLASS_ID = "Clas_1431872733184951_Alias";
    /** <code>Regional</code> class name. */
    public static final String CLASS_NAME = "Regional";
    /** <code>Regional</code> class alias. */
    public static final String CLASS_ALIAS = "Regional";
    /** <code>Regional</code> class table name. */
    public static final String TBL_NAME = "Regional";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "regionalCodigo,regionalDescripcion";

    public static final String DSICREGIONAL = "IC_Regional";
    

    // Attribute (regionalCodigo)
    /** <code>regionalCodigo</code> attribute id. */
    public static final String ATTR_ID_REGIONALCODIGO = "Clas_1431872733184951Atr_1_Alias";
    /** <code>regionalCodigo</code> attribute name. */
    public static final String ATTR_NAME_REGIONALCODIGO = "regionalCodigo";
    /** <code>regionalCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_REGIONALCODIGO = "Código";

    /** <code>regionalCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_REGIONALCODIGO = "";
    /** Agents allowed to view the attribute regionalCodigo **/
    public static final String REGIONALCODIGO_AGENTS = "Admin,SuperAdmin,RespRegional,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (regionalDescripcion)
    /** <code>regionalDescripcion</code> attribute id. */
    public static final String ATTR_ID_REGIONALDESCRIPCION = "Clas_1431872733184951Atr_2_Alias";
    /** <code>regionalDescripcion</code> attribute name. */
    public static final String ATTR_NAME_REGIONALDESCRIPCION = "regionalDescripcion";
    /** <code>regionalDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_REGIONALDESCRIPCION = "Descripción";

    /** <code>regionalDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_REGIONALDESCRIPCION = "";
    /** Agents allowed to view the attribute regionalDescripcion **/
    public static final String REGIONALDESCRIPCION_AGENTS = "Admin,SuperAdmin,RespRegional,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_REGIONALCODIGO = "Codigo";    
    /** <code>regionalCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_REGIONALCODIGO = "regionalCodigo";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_REGIONALDESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_REGIONALDESCRIPCIONLENGTH = 150;
    /** <code>regionalDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_REGIONALDESCRIPCION = "regionalDescripcion";


    // Compound role (RespRegional)
    /** <code>RespRegional</code> role id. */
    public static final String ROLE_ID_RESPREGIONAL = "Agr_1431873126400136_Alias";
    /** <code>RespRegional</code> role name. */
    public static final String ROLE_NAME_RESPREGIONAL = "respRegional";
    /** <code>Regional</code> role alias. */
    public static final String ROLE_ALIAS_RESPREGIONAL = "Responsable";


    /** <code>RespRegional</code> inverse role name. */
    public static final String ROLE_INVNAME_RESPREGIONAL = RespRegionalConstants.ROLE_NAME_REGIONAL;
    /** <code>RespRegional</code> role facet sequence. */
    public static final String PATH_FACETS_RESPREGIONAL = "";
    /** <code>RespRegional</code> role target class. */
    public static final String ROLE_TARGET_RESPREGIONAL = RespRegionalConstants.CLASS_NAME;
    /** Agents allowed to navigate through RespRegional **/
    public static final String RESPREGIONAL_AGENTS = "Admin,SuperAdmin,RespRegional,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (Sucursales)
    /** <code>Sucursales</code> role id. */
    public static final String ROLE_ID_SUCURSALES = "Agr_1431874174976463_Alias";
    /** <code>Sucursales</code> role name. */
    public static final String ROLE_NAME_SUCURSALES = "sucursales";
    /** <code>Regional</code> role alias. */
    public static final String ROLE_ALIAS_SUCURSALES = "Sucursales";


    /** <code>Sucursales</code> inverse role name. */
    public static final String ROLE_INVNAME_SUCURSALES = SucursalConstants.ROLE_NAME_REGIONAL;
    /** <code>Sucursales</code> role facet sequence. */
    public static final String PATH_FACETS_SUCURSALES = "";
    /** <code>Sucursales</code> role target class. */
    public static final String ROLE_TARGET_SUCURSALES = SucursalConstants.CLASS_NAME;
    /** Agents allowed to navigate through Sucursales **/
    public static final String SUCURSALES_AGENTS = "Admin,SuperAdmin,RespRegional,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (DirSucursalC)
    /** <code>DirSucursalC</code> role id. */
    public static final String ROLE_ID_DIRSUCURSALC = "Agr_1473351516160746_Alias";
    /** <code>DirSucursalC</code> role name. */
    public static final String ROLE_NAME_DIRSUCURSALC = "dirSucursalC";
    /** <code>RegionalC</code> role alias. */
    public static final String ROLE_ALIAS_DIRSUCURSALC = "DirSucursalC";


    /** <code>DirSucursalC</code> inverse role name. */
    public static final String ROLE_INVNAME_DIRSUCURSALC = DirSucursalCConstants.ROLE_NAME_REGIONALC;
    /** <code>DirSucursalC</code> role facet sequence. */
    public static final String PATH_FACETS_DIRSUCURSALC = "";
    /** <code>DirSucursalC</code> role target class. */
    public static final String ROLE_TARGET_DIRSUCURSALC = DirSucursalCConstants.CLASS_NAME;
    /** Agents allowed to navigate through DirSucursalC **/
    public static final String DIRSUCURSALC_AGENTS = "Admin,SuperAdmin,RespRegional,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431872733184951Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear regional";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>regionalcrearpagrRespRegional</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_REGIONALCREARPAGRRESPREGIONAL = "p_agrRespRegional";
    /** <code>regionalcrearpagrRespRegional</code> inbound argument id. */
    public static final String ARG_ID_CREAR_REGIONALCREARPAGRRESPREGIONAL = "Clas_1431872733184951Ser_1Arg_3_Alias";
    /** <code>regionalcrearpagrRespRegional</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_REGIONALCREARPAGRRESPREGIONAL = "Responsable";
    /** <code>regionalcrearpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_REGIONALCREARPATRCODIGO = "p_atrCodigo";
    /** <code>regionalcrearpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_REGIONALCREARPATRCODIGO = "Clas_1431872733184951Ser_1Arg_1_Alias";
    /** <code>regionalcrearpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_REGIONALCREARPATRCODIGO = "Código";
    /** <code>regionalcrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_REGIONALCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>regionalcrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_REGIONALCREARPATRDESCRIPCION = "Clas_1431872733184951Ser_1Arg_2_Alias";
    /** <code>regionalcrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_REGIONALCREARPATRDESCRIPCION = "Descripción";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431872733184951Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar regional";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Preconditions
    /** <code>eliminar</code> precondition 0 id. */
    public static final String PRE_ID_ELIMINAR_0 = "Clas_1431872733184951Pre_1_MsgError";
    /** <code>eliminar</code> precondition 1 id. */
    public static final String PRE_ID_ELIMINAR_1 = "Clas_1431872733184951Pre_2_MsgError";
    // Inbound arguments
    /** <code>regionaleliminarpthisRegional</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_REGIONALELIMINARPTHISREGIONAL = "p_thisRegional";
    /** <code>regionaleliminarpthisRegional</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_REGIONALELIMINARPTHISREGIONAL = "Clas_1431872733184951Ser_2Arg_1_Alias";
    /** <code>regionaleliminarpthisRegional</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_REGIONALELIMINARPTHISREGIONAL = "Regional";
    // Service (sincronizar)
    /** <code>sincronizar</code> service id. */
    public static final String SERV_ID_SINCRONIZAR = "Clas_1431872733184951Ser_4_Alias";
    /** <code>sincronizar</code> service name. */
    public static final String SERV_NAME_SINCRONIZAR = "sincronizar";
    /** <code>sincronizar</code> service alias. */
    public static final String SERV_ALIAS_SINCRONIZAR = "sincronizar";
    /** Agents allowed to execute the service sincronizar **/
    public static final String SINCRONIZAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>regionalsincronizarpthisRegional</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_REGIONALSINCRONIZARPTHISREGIONAL = "p_thisRegional";
    /** <code>regionalsincronizarpthisRegional</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_REGIONALSINCRONIZARPTHISREGIONAL = "Clas_1431872733184951Ser_4Arg_1_Alias";
    /** <code>regionalsincronizarpthisRegional</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_REGIONALSINCRONIZARPTHISREGIONAL = "Regional";
    /** <code>regionalsincronizarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_REGIONALSINCRONIZARPDESCRIPCION = "p_Descripcion";
    /** <code>regionalsincronizarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_REGIONALSINCRONIZARPDESCRIPCION = "Clas_1431872733184951Ser_4Arg_2_Alias";
    /** <code>regionalsincronizarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_REGIONALSINCRONIZARPDESCRIPCION = "Descripción";
    // Service (InsRegionalResponsable)
    /** <code>InsRegionalResponsable</code> service id. */
    public static final String SERV_ID_INSREGIONALRESPONSABLE = "Clas_1431872733184951Ser_5_Alias";
    /** <code>InsRegionalResponsable</code> service name. */
    public static final String SERV_NAME_INSREGIONALRESPONSABLE = "InsRegionalResponsable";
    /** <code>InsRegionalResponsable</code> service alias. */
    public static final String SERV_ALIAS_INSREGIONALRESPONSABLE = "InsRegionalResponsable";
    /** Agents allowed to execute the service InsRegionalResponsable **/
    public static final String INSREGIONALRESPONSABLE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>regionalInsRegionalResponsablepthisRegional</code> inbound argument name. */
    public static final String ARG_NAME_INSREGIONALRESPONSABLE_REGIONALINSREGIONALRESPONSABLEPTHISREGIONAL = "p_thisRegional";
    /** <code>regionalInsRegionalResponsablepthisRegional</code> inbound argument id. */
    public static final String ARG_ID_INSREGIONALRESPONSABLE_REGIONALINSREGIONALRESPONSABLEPTHISREGIONAL = "Clas_1431872733184951Ser_5Arg_1_Alias";
    /** <code>regionalInsRegionalResponsablepthisRegional</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSREGIONALRESPONSABLE_REGIONALINSREGIONALRESPONSABLEPTHISREGIONAL = "Regional";
    /** <code>regionalInsRegionalResponsablepevcRespRegional</code> inbound argument name. */
    public static final String ARG_NAME_INSREGIONALRESPONSABLE_REGIONALINSREGIONALRESPONSABLEPEVCRESPREGIONAL = "p_evcRespRegional";
    /** <code>regionalInsRegionalResponsablepevcRespRegional</code> inbound argument id. */
    public static final String ARG_ID_INSREGIONALRESPONSABLE_REGIONALINSREGIONALRESPONSABLEPEVCRESPREGIONAL = "Clas_1431872733184951Ser_5Arg_2_Alias";
    /** <code>regionalInsRegionalResponsablepevcRespRegional</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSREGIONALRESPONSABLE_REGIONALINSREGIONALRESPONSABLEPEVCRESPREGIONAL = "Responsable";
    // Service (CambRegionalSucursal)
    /** <code>CambRegionalSucursal</code> service id. */
    public static final String SERV_ID_CAMBREGIONALSUCURSAL = "Clas_1431872733184951Ser_6_Alias";
    /** <code>CambRegionalSucursal</code> service name. */
    public static final String SERV_NAME_CAMBREGIONALSUCURSAL = "CambRegionalSucursal";
    /** <code>CambRegionalSucursal</code> service alias. */
    public static final String SERV_ALIAS_CAMBREGIONALSUCURSAL = "CambRegionalSucursal";
    /** Agents allowed to execute the service CambRegionalSucursal **/
    public static final String CAMBREGIONALSUCURSAL_SRVAGENTS = "";
    // Inbound arguments
    /** <code>regionalCambRegionalSucursalpthisRegional</code> inbound argument name. */
    public static final String ARG_NAME_CAMBREGIONALSUCURSAL_REGIONALCAMBREGIONALSUCURSALPTHISREGIONAL = "p_thisRegional";
    /** <code>regionalCambRegionalSucursalpthisRegional</code> inbound argument id. */
    public static final String ARG_ID_CAMBREGIONALSUCURSAL_REGIONALCAMBREGIONALSUCURSALPTHISREGIONAL = "Clas_1431872733184951Ser_6Arg_1_Alias";
    /** <code>regionalCambRegionalSucursalpthisRegional</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBREGIONALSUCURSAL_REGIONALCAMBREGIONALSUCURSALPTHISREGIONAL = "Regional";
    /** <code>regionalCambRegionalSucursalpevcSucursal</code> inbound argument name. */
    public static final String ARG_NAME_CAMBREGIONALSUCURSAL_REGIONALCAMBREGIONALSUCURSALPEVCSUCURSAL = "p_evcSucursal";
    /** <code>regionalCambRegionalSucursalpevcSucursal</code> inbound argument id. */
    public static final String ARG_ID_CAMBREGIONALSUCURSAL_REGIONALCAMBREGIONALSUCURSALPEVCSUCURSAL = "Clas_1431872733184951Ser_6Arg_2_Alias";
    /** <code>regionalCambRegionalSucursalpevcSucursal</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBREGIONALSUCURSAL_REGIONALCAMBREGIONALSUCURSALPEVCSUCURSAL = "Sucursales";
    // Service (DelRegionalResponsable)
    /** <code>DelRegionalResponsable</code> service id. */
    public static final String SERV_ID_DELREGIONALRESPONSABLE = "Clas_1431872733184951Ser_7_Alias";
    /** <code>DelRegionalResponsable</code> service name. */
    public static final String SERV_NAME_DELREGIONALRESPONSABLE = "DelRegionalResponsable";
    /** <code>DelRegionalResponsable</code> service alias. */
    public static final String SERV_ALIAS_DELREGIONALRESPONSABLE = "DelRegionalResponsable";
    /** Agents allowed to execute the service DelRegionalResponsable **/
    public static final String DELREGIONALRESPONSABLE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>regionalDelRegionalResponsablepthisRegional</code> inbound argument name. */
    public static final String ARG_NAME_DELREGIONALRESPONSABLE_REGIONALDELREGIONALRESPONSABLEPTHISREGIONAL = "p_thisRegional";
    /** <code>regionalDelRegionalResponsablepthisRegional</code> inbound argument id. */
    public static final String ARG_ID_DELREGIONALRESPONSABLE_REGIONALDELREGIONALRESPONSABLEPTHISREGIONAL = "Clas_1431872733184951Ser_7Arg_1_Alias";
    /** <code>regionalDelRegionalResponsablepthisRegional</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELREGIONALRESPONSABLE_REGIONALDELREGIONALRESPONSABLEPTHISREGIONAL = "Regional";
    /** <code>regionalDelRegionalResponsablepevcRespRegional</code> inbound argument name. */
    public static final String ARG_NAME_DELREGIONALRESPONSABLE_REGIONALDELREGIONALRESPONSABLEPEVCRESPREGIONAL = "p_evcRespRegional";
    /** <code>regionalDelRegionalResponsablepevcRespRegional</code> inbound argument id. */
    public static final String ARG_ID_DELREGIONALRESPONSABLE_REGIONALDELREGIONALRESPONSABLEPEVCRESPREGIONAL = "Clas_1431872733184951Ser_7Arg_2_Alias";
    /** <code>regionalDelRegionalResponsablepevcRespRegional</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELREGIONALRESPONSABLE_REGIONALDELREGIONALRESPONSABLEPEVCRESPREGIONAL = "Responsable";
    // Service (InsRegionalDirSucursal)
    /** <code>InsRegionalDirSucursal</code> service id. */
    public static final String SERV_ID_INSREGIONALDIRSUCURSAL = "Clas_1431872733184951Ser_8_Alias";
    /** <code>InsRegionalDirSucursal</code> service name. */
    public static final String SERV_NAME_INSREGIONALDIRSUCURSAL = "InsRegionalDirSucursal";
    /** <code>InsRegionalDirSucursal</code> service alias. */
    public static final String SERV_ALIAS_INSREGIONALDIRSUCURSAL = "InsRegionalDirSucursal";
    /** Agents allowed to execute the service InsRegionalDirSucursal **/
    public static final String INSREGIONALDIRSUCURSAL_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>regionalInsRegionalDirSucursalpthisRegional</code> inbound argument name. */
    public static final String ARG_NAME_INSREGIONALDIRSUCURSAL_REGIONALINSREGIONALDIRSUCURSALPTHISREGIONAL = "p_thisRegional";
    /** <code>regionalInsRegionalDirSucursalpthisRegional</code> inbound argument id. */
    public static final String ARG_ID_INSREGIONALDIRSUCURSAL_REGIONALINSREGIONALDIRSUCURSALPTHISREGIONAL = "Clas_1431872733184951Ser_8Arg_1_Alias";
    /** <code>regionalInsRegionalDirSucursalpthisRegional</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSREGIONALDIRSUCURSAL_REGIONALINSREGIONALDIRSUCURSALPTHISREGIONAL = "RegionalC";
    /** <code>regionalInsRegionalDirSucursalpevcDirSucursalC</code> inbound argument name. */
    public static final String ARG_NAME_INSREGIONALDIRSUCURSAL_REGIONALINSREGIONALDIRSUCURSALPEVCDIRSUCURSALC = "p_evcDirSucursalC";
    /** <code>regionalInsRegionalDirSucursalpevcDirSucursalC</code> inbound argument id. */
    public static final String ARG_ID_INSREGIONALDIRSUCURSAL_REGIONALINSREGIONALDIRSUCURSALPEVCDIRSUCURSALC = "Clas_1431872733184951Ser_8Arg_2_Alias";
    /** <code>regionalInsRegionalDirSucursalpevcDirSucursalC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSREGIONALDIRSUCURSAL_REGIONALINSREGIONALDIRSUCURSALPEVCDIRSUCURSALC = "DirSucursalC";
    // Service (DelRegionalDirSucursal)
    /** <code>DelRegionalDirSucursal</code> service id. */
    public static final String SERV_ID_DELREGIONALDIRSUCURSAL = "Clas_1431872733184951Ser_9_Alias";
    /** <code>DelRegionalDirSucursal</code> service name. */
    public static final String SERV_NAME_DELREGIONALDIRSUCURSAL = "DelRegionalDirSucursal";
    /** <code>DelRegionalDirSucursal</code> service alias. */
    public static final String SERV_ALIAS_DELREGIONALDIRSUCURSAL = "DelRegionalDirSucursal";
    /** Agents allowed to execute the service DelRegionalDirSucursal **/
    public static final String DELREGIONALDIRSUCURSAL_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>regionalDelRegionalDirSucursalpthisRegional</code> inbound argument name. */
    public static final String ARG_NAME_DELREGIONALDIRSUCURSAL_REGIONALDELREGIONALDIRSUCURSALPTHISREGIONAL = "p_thisRegional";
    /** <code>regionalDelRegionalDirSucursalpthisRegional</code> inbound argument id. */
    public static final String ARG_ID_DELREGIONALDIRSUCURSAL_REGIONALDELREGIONALDIRSUCURSALPTHISREGIONAL = "Clas_1431872733184951Ser_9Arg_1_Alias";
    /** <code>regionalDelRegionalDirSucursalpthisRegional</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELREGIONALDIRSUCURSAL_REGIONALDELREGIONALDIRSUCURSALPTHISREGIONAL = "RegionalC";
    /** <code>regionalDelRegionalDirSucursalpevcDirSucursalC</code> inbound argument name. */
    public static final String ARG_NAME_DELREGIONALDIRSUCURSAL_REGIONALDELREGIONALDIRSUCURSALPEVCDIRSUCURSALC = "p_evcDirSucursalC";
    /** <code>regionalDelRegionalDirSucursalpevcDirSucursalC</code> inbound argument id. */
    public static final String ARG_ID_DELREGIONALDIRSUCURSAL_REGIONALDELREGIONALDIRSUCURSALPEVCDIRSUCURSALC = "Clas_1431872733184951Ser_9Arg_2_Alias";
    /** <code>regionalDelRegionalDirSucursalpevcDirSucursalC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELREGIONALDIRSUCURSAL_REGIONALDELREGIONALDIRSUCURSALPEVCDIRSUCURSALC = "DirSucursalC";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_REGIONALDESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_REGIONALCODIGO.toUpperCase(), REGIONALCODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_REGIONALDESCRIPCION.toUpperCase(), REGIONALDESCRIPCION_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_RESPREGIONAL.toUpperCase(), RESPREGIONAL_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'Regional', it returns the identification keys
     * - If className is a facet of the inheritance net of 'Regional', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_REGIONALCODIGO);
        }
        // Facet 'Regional' (This facet)
        if (RegionalConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_REGIONALCODIGO);
        }
        return returnList;
    }
}
