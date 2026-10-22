package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>TipoIVA</code> model class.
 */
public final class TipoIVAConstants {

    private TipoIVAConstants() {

    }

    // Class
    /** <code>TipoIVA</code> class id. */
    public static final String CLASS_ID = "Clas_1431882432512691_Alias";
    /** <code>TipoIVA</code> class name. */
    public static final String CLASS_NAME = "TipoIVA";
    /** <code>TipoIVA</code> class alias. */
    public static final String CLASS_ALIAS = "Tipo I.V.A";
    /** <code>TipoIVA</code> class table name. */
    public static final String TBL_NAME = "TipoIVA";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "tipoIVACodigo,productosProducto,planesPlan,tipoIVADescripcion,tipoIVAPorcentaje,tipoIVAFechaInicio,tipoIVAFechaFin";

    public static final String DSICTIPOIVA = "IC_TipoIVA";
    public static final String DSDSTIPOIVAPIU = "DS_TipoIVA_PIU";
    

    // Attribute (tipoIVACodigo)
    /** <code>tipoIVACodigo</code> attribute id. */
    public static final String ATTR_ID_TIPOIVACODIGO = "Clas_1431882432512691Atr_1_Alias";
    /** <code>tipoIVACodigo</code> attribute name. */
    public static final String ATTR_NAME_TIPOIVACODIGO = "tipoIVACodigo";
    /** <code>tipoIVACodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_TIPOIVACODIGO = "Código";

    /** <code>tipoIVACodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_TIPOIVACODIGO = "";
    /** Agents allowed to view the attribute tipoIVACodigo **/
    public static final String TIPOIVACODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (tipoIVADescripcion)
    /** <code>tipoIVADescripcion</code> attribute id. */
    public static final String ATTR_ID_TIPOIVADESCRIPCION = "Clas_1431882432512691Atr_2_Alias";
    /** <code>tipoIVADescripcion</code> attribute name. */
    public static final String ATTR_NAME_TIPOIVADESCRIPCION = "tipoIVADescripcion";
    /** <code>tipoIVADescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_TIPOIVADESCRIPCION = "Descripción";

    /** <code>tipoIVADescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_TIPOIVADESCRIPCION = "";
    /** Agents allowed to view the attribute tipoIVADescripcion **/
    public static final String TIPOIVADESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (tipoIVAPorcentaje)
    /** <code>tipoIVAPorcentaje</code> attribute id. */
    public static final String ATTR_ID_TIPOIVAPORCENTAJE = "Clas_1431882432512691Atr_4_Alias";
    /** <code>tipoIVAPorcentaje</code> attribute name. */
    public static final String ATTR_NAME_TIPOIVAPORCENTAJE = "tipoIVAPorcentaje";
    /** <code>tipoIVAPorcentaje</code> attribute alias. */
    public static final String ATTR_ALIAS_TIPOIVAPORCENTAJE = "Porcentaje";

    /** <code>tipoIVAPorcentaje</code> attribute facet sequence. */
    public static final String PATH_FACETS_TIPOIVAPORCENTAJE = "";
    /** Agents allowed to view the attribute tipoIVAPorcentaje **/
    public static final String TIPOIVAPORCENTAJE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (tipoIVAFechaInicio)
    /** <code>tipoIVAFechaInicio</code> attribute id. */
    public static final String ATTR_ID_TIPOIVAFECHAINICIO = "Clas_1431882432512691Atr_5_Alias";
    /** <code>tipoIVAFechaInicio</code> attribute name. */
    public static final String ATTR_NAME_TIPOIVAFECHAINICIO = "tipoIVAFechaInicio";
    /** <code>tipoIVAFechaInicio</code> attribute alias. */
    public static final String ATTR_ALIAS_TIPOIVAFECHAINICIO = "Fecha Inicio";

    /** <code>tipoIVAFechaInicio</code> attribute facet sequence. */
    public static final String PATH_FACETS_TIPOIVAFECHAINICIO = "";
    /** Agents allowed to view the attribute tipoIVAFechaInicio **/
    public static final String TIPOIVAFECHAINICIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (tipoIVAFechaFin)
    /** <code>tipoIVAFechaFin</code> attribute id. */
    public static final String ATTR_ID_TIPOIVAFECHAFIN = "Clas_1431882432512691Atr_6_Alias";
    /** <code>tipoIVAFechaFin</code> attribute name. */
    public static final String ATTR_NAME_TIPOIVAFECHAFIN = "tipoIVAFechaFin";
    /** <code>tipoIVAFechaFin</code> attribute alias. */
    public static final String ATTR_ALIAS_TIPOIVAFECHAFIN = "Fecha Fin";

    /** <code>tipoIVAFechaFin</code> attribute facet sequence. */
    public static final String PATH_FACETS_TIPOIVAFECHAFIN = "";
    /** Agents allowed to view the attribute tipoIVAFechaFin **/
    public static final String TIPOIVAFECHAFIN_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_TIPOIVACODIGO = "Codigo";    
    /** <code>tipoIVACodigo</code> attribute field name. */
    public static final String ATTR_FIELD_TIPOIVACODIGO = "tipoIVACodigo";
    // Field (Producto)
    /** <code>Producto</code> field name. */
    public static final String FLD_PRODUCTOSPRODUCTO = "Producto";    
    /** <code>ProductoT.productosProducto</code> attribute field name. */
    public static final String ATTR_FIELD_PRODUCTOT_PRODUCTOSPRODUCTO = "productosProducto";
    // Field (Plan)
    /** <code>Plan</code> field name. */
    public static final String FLD_PLANESPLAN = "Plan";    
    /** <code>PlanT.planesPlan</code> attribute field name. */
    public static final String ATTR_FIELD_PLANT_PLANESPLAN = "planesPlan";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_TIPOIVADESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_TIPOIVADESCRIPCIONLENGTH = 150;
    /** <code>tipoIVADescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_TIPOIVADESCRIPCION = "tipoIVADescripcion";
    // Field (Porcentaje)
    /** <code>Porcentaje</code> field name. */
    public static final String FLD_TIPOIVAPORCENTAJE = "Porcentaje";    
    /** <code>tipoIVAPorcentaje</code> attribute field name. */
    public static final String ATTR_FIELD_TIPOIVAPORCENTAJE = "tipoIVAPorcentaje";
    // Field (FechaInicio)
    /** <code>FechaInicio</code> field name. */
    public static final String FLD_TIPOIVAFECHAINICIO = "FechaInicio";    
    /** <code>tipoIVAFechaInicio</code> attribute field name. */
    public static final String ATTR_FIELD_TIPOIVAFECHAINICIO = "tipoIVAFechaInicio";
    // Field (FechaFin)
    /** <code>FechaFin</code> field name. */
    public static final String FLD_TIPOIVAFECHAFIN = "FechaFin";    
    /** <code>tipoIVAFechaFin</code> attribute field name. */
    public static final String ATTR_FIELD_TIPOIVAFECHAFIN = "tipoIVAFechaFin";

    // Component role (ProductoT)
    /** <code>ProductoT</code> role id. */
    public static final String ROLE_ID_PRODUCTOT = "Agr_1431882432512973_Alias";
    /** <code>ProductoT</code> role name. */
    public static final String ROLE_NAME_PRODUCTOT = "productoT";
    /** <code>ProductoT</code> role alias. */
    public static final String ROLE_ALIAS_PRODUCTOT = "ProductoT";

    /** <code>ProductoT</code> inverse role name. */
    public static final String ROLE_INVNAME_PRODUCTOT = ProductosConstants.ROLE_NAME_TIPOSIVA;
    /** <code>ProductoT</code> role facet sequence. */
    public static final String PATH_FACETS_PRODUCTOT = "";
    /** <code>ProductoT</code> role target class. */
    public static final String ROLE_TARGET_PRODUCTOT = ProductosConstants.CLASS_NAME;

    /** Agents allowed to navigate through ProductoT **/
    public static final String PRODUCTOT_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (PlanT)
    /** <code>PlanT</code> role id. */
    public static final String ROLE_ID_PLANT = "Agr_1431882563584809_Alias";
    /** <code>PlanT</code> role name. */
    public static final String ROLE_NAME_PLANT = "planT";
    /** <code>PlanT</code> role alias. */
    public static final String ROLE_ALIAS_PLANT = "PlanT";

    /** <code>PlanT</code> inverse role name. */
    public static final String ROLE_INVNAME_PLANT = PlanesConstants.ROLE_NAME_TIPOSIVA;
    /** <code>PlanT</code> role facet sequence. */
    public static final String PATH_FACETS_PLANT = "";
    /** <code>PlanT</code> role target class. */
    public static final String ROLE_TARGET_PLANT = PlanesConstants.CLASS_NAME;

    /** Agents allowed to navigate through PlanT **/
    public static final String PLANT_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431882432512691Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear tipo de I.V.A";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "SuperAdmin";
    // Preconditions
    /** <code>crear</code> precondition 0 id. */
    public static final String PRE_ID_CREAR_0 = "Clas_1431882432512691Pre_5_MsgError";
    /** <code>crear</code> precondition 1 id. */
    public static final String PRE_ID_CREAR_1 = "Clas_1431882432512691Pre_1_MsgError";
    /** <code>crear</code> precondition 2 id. */
    public static final String PRE_ID_CREAR_2 = "Clas_1431882432512691Pre_2_MsgError";
    // Inbound arguments
    /** <code>tipoIVAcrearpagrProductoT</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TIPOIVACREARPAGRPRODUCTOT = "p_agrProductoT";
    /** <code>tipoIVAcrearpagrProductoT</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TIPOIVACREARPAGRPRODUCTOT = "Clas_1431882432512691Ser_1Arg_14_Alias";
    /** <code>tipoIVAcrearpagrProductoT</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TIPOIVACREARPAGRPRODUCTOT = "Producto";
    /** <code>tipoIVAcrearpagrPlanT</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TIPOIVACREARPAGRPLANT = "p_agrPlanT";
    /** <code>tipoIVAcrearpagrPlanT</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TIPOIVACREARPAGRPLANT = "Clas_1431882432512691Ser_1Arg_15_Alias";
    /** <code>tipoIVAcrearpagrPlanT</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TIPOIVACREARPAGRPLANT = "Plan";
    /** <code>tipoIVAcrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TIPOIVACREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>tipoIVAcrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TIPOIVACREARPATRDESCRIPCION = "Clas_1431882432512691Ser_1Arg_2_Alias";
    /** <code>tipoIVAcrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TIPOIVACREARPATRDESCRIPCION = "Descripción";
    /** <code>tipoIVAcrearpatrPorcentaje</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TIPOIVACREARPATRPORCENTAJE = "p_atrPorcentaje";
    /** <code>tipoIVAcrearpatrPorcentaje</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TIPOIVACREARPATRPORCENTAJE = "Clas_1431882432512691Ser_1Arg_4_Alias";
    /** <code>tipoIVAcrearpatrPorcentaje</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TIPOIVACREARPATRPORCENTAJE = "Porcentaje";
    /** <code>tipoIVAcrearpatrFechaInicio</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TIPOIVACREARPATRFECHAINICIO = "p_atrFechaInicio";
    /** <code>tipoIVAcrearpatrFechaInicio</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TIPOIVACREARPATRFECHAINICIO = "Clas_1431882432512691Ser_1Arg_7_Alias";
    /** <code>tipoIVAcrearpatrFechaInicio</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TIPOIVACREARPATRFECHAINICIO = "Fecha Inicio";
    /** <code>tipoIVAcrearpatrFechaFin</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TIPOIVACREARPATRFECHAFIN = "p_atrFechaFin";
    /** <code>tipoIVAcrearpatrFechaFin</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TIPOIVACREARPATRFECHAFIN = "Clas_1431882432512691Ser_1Arg_8_Alias";
    /** <code>tipoIVAcrearpatrFechaFin</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TIPOIVACREARPATRFECHAFIN = "Fecha Fin";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431882432512691Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar tipo de I.V.A";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>tipoIVAeliminarpthisTipoIVA</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_TIPOIVAELIMINARPTHISTIPOIVA = "p_thisTipoIVA";
    /** <code>tipoIVAeliminarpthisTipoIVA</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_TIPOIVAELIMINARPTHISTIPOIVA = "Clas_1431882432512691Ser_2Arg_1_Alias";
    /** <code>tipoIVAeliminarpthisTipoIVA</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_TIPOIVAELIMINARPTHISTIPOIVA = "Tipo I.V.A";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1431882432512691Ser_7_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>modificar</code> precondition 0 id. */
    public static final String PRE_ID_MODIFICAR_0 = "Clas_1431882432512691Pre_6_MsgError";
    /** <code>modificar</code> precondition 1 id. */
    public static final String PRE_ID_MODIFICAR_1 = "Clas_1431882432512691Pre_3_MsgError";
    /** <code>modificar</code> precondition 2 id. */
    public static final String PRE_ID_MODIFICAR_2 = "Clas_1431882432512691Pre_4_MsgError";
    // Inbound arguments
    /** <code>tipoIVAmodificarpthisTipoIVA</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TIPOIVAMODIFICARPTHISTIPOIVA = "p_thisTipoIVA";
    /** <code>tipoIVAmodificarpthisTipoIVA</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TIPOIVAMODIFICARPTHISTIPOIVA = "Clas_1431882432512691Ser_7Arg_1_Alias";
    /** <code>tipoIVAmodificarpthisTipoIVA</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TIPOIVAMODIFICARPTHISTIPOIVA = "Tipo I.V.A";
    /** <code>tipoIVAmodificarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TIPOIVAMODIFICARPDESCRIPCION = "p_Descripcion";
    /** <code>tipoIVAmodificarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TIPOIVAMODIFICARPDESCRIPCION = "Clas_1431882432512691Ser_7Arg_2_Alias";
    /** <code>tipoIVAmodificarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TIPOIVAMODIFICARPDESCRIPCION = "Descripción";
    /** <code>tipoIVAmodificarpPorcentaje</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TIPOIVAMODIFICARPPORCENTAJE = "p_Porcentaje";
    /** <code>tipoIVAmodificarpPorcentaje</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TIPOIVAMODIFICARPPORCENTAJE = "Clas_1431882432512691Ser_7Arg_3_Alias";
    /** <code>tipoIVAmodificarpPorcentaje</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TIPOIVAMODIFICARPPORCENTAJE = "Porcentaje";
    /** <code>tipoIVAmodificarpFechaInicio</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TIPOIVAMODIFICARPFECHAINICIO = "p_FechaInicio";
    /** <code>tipoIVAmodificarpFechaInicio</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TIPOIVAMODIFICARPFECHAINICIO = "Clas_1431882432512691Ser_7Arg_4_Alias";
    /** <code>tipoIVAmodificarpFechaInicio</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TIPOIVAMODIFICARPFECHAINICIO = "Fecha Inicio";
    /** <code>tipoIVAmodificarpFechaFin</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TIPOIVAMODIFICARPFECHAFIN = "p_FechaFin";
    /** <code>tipoIVAmodificarpFechaFin</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TIPOIVAMODIFICARPFECHAFIN = "Clas_1431882432512691Ser_7Arg_5_Alias";
    /** <code>tipoIVAmodificarpFechaFin</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TIPOIVAMODIFICARPFECHAFIN = "Fecha Fin";

    public static final String FILTER_NAME_FTIPOIVAVARIOS = "F_TipoIVAVarios";
    public static final String VAR_NAME_FTIPOIVAVARIOS_VOPRODUCTO = "vo_Producto";
    public static final String VAR_NAME_FTIPOIVAVARIOS_VOPLAN = "vo_Plan";
    public static final String VAR_NAME_FTIPOIVAVARIOS_VDESDE = "v_Desde";
    public static final String VAR_NAME_FTIPOIVAVARIOS_VHASTA = "v_Hasta";
    public static final String FILTER_NAME_IFTIPOIVAPRODPLANANYO = "iF_TipoIVAProdPlanAnyo";
    public static final String VAR_NAME_IFTIPOIVAPRODPLANANYO_VOPRODUCTO = "vo_Producto";
    public static final String VAR_NAME_IFTIPOIVAPRODPLANANYO_VOPLAN = "vo_Plan";
    public static final String VAR_NAME_IFTIPOIVAPRODPLANANYO_VANYO = "v_Anyo";
    public static final String VAR_NAME_IFTIPOIVAPRODPLANANYO_VFECHA = "v_Fecha";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_TIPOIVADESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_TIPOIVAPORCENTAJE.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_TIPOIVAFECHAINICIO.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_TIPOIVAFECHAFIN.toUpperCase(), Constants.Type.DATE.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_TIPOIVACODIGO.toUpperCase(), TIPOIVACODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_TIPOIVADESCRIPCION.toUpperCase(), TIPOIVADESCRIPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_TIPOIVAPORCENTAJE.toUpperCase(), TIPOIVAPORCENTAJE_AGENTS);
    	attributeAgents.put(ATTR_NAME_TIPOIVAFECHAINICIO.toUpperCase(), TIPOIVAFECHAINICIO_AGENTS);
    	attributeAgents.put(ATTR_NAME_TIPOIVAFECHAFIN.toUpperCase(), TIPOIVAFECHAFIN_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_PRODUCTOT.toUpperCase(), PRODUCTOT_AGENTS);
        roleAgents.put(ROLE_NAME_PLANT.toUpperCase(), PLANT_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'TipoIVA', it returns the identification keys
     * - If className is a facet of the inheritance net of 'TipoIVA', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_TIPOIVACODIGO);
        }
        // Facet 'TipoIVA' (This facet)
        if (TipoIVAConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_TIPOIVACODIGO);
        }
        return returnList;
    }
}
