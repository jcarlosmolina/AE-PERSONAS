package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>Tarifa</code> model class.
 */
public final class TarifaConstants {

    private TarifaConstants() {

    }

    // Class
    /** <code>Tarifa</code> class id. */
    public static final String CLASS_ID = "Clas_1431714529280565_Alias";
    /** <code>Tarifa</code> class name. */
    public static final String CLASS_NAME = "Tarifa";
    /** <code>Tarifa</code> class alias. */
    public static final String CLASS_ALIAS = "Tarifa";
    /** <code>Tarifa</code> class table name. */
    public static final String TBL_NAME = "Tarifa";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "tarifaId,productosProducto,planesPlan,tarifaCodigo,tarifaTipoContrato";

    public static final String DSICTARIFA = "IC_Tarifa";
    public static final String DSDSTARIFAS = "DS_Tarifas";
    

    // Attribute (tarifaId)
    /** <code>tarifaId</code> attribute id. */
    public static final String ATTR_ID_TARIFAID = "Clas_1431714529280565Atr_7_Alias";
    /** <code>tarifaId</code> attribute name. */
    public static final String ATTR_NAME_TARIFAID = "tarifaId";
    /** <code>tarifaId</code> attribute alias. */
    public static final String ATTR_ALIAS_TARIFAID = "Id.";

    /** <code>tarifaId</code> attribute facet sequence. */
    public static final String PATH_FACETS_TARIFAID = "";
    /** Agents allowed to view the attribute tarifaId **/
    public static final String TARIFAID_AGENTS = "Admin,SuperAdmin,RespRegional,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (tarifaCodigo)
    /** <code>tarifaCodigo</code> attribute id. */
    public static final String ATTR_ID_TARIFACODIGO = "Clas_1431714529280565Atr_1_Alias";
    /** <code>tarifaCodigo</code> attribute name. */
    public static final String ATTR_NAME_TARIFACODIGO = "tarifaCodigo";
    /** <code>tarifaCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_TARIFACODIGO = "Código";

    /** <code>tarifaCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_TARIFACODIGO = "";
    /** Agents allowed to view the attribute tarifaCodigo **/
    public static final String TARIFACODIGO_AGENTS = "Admin,SuperAdmin,RespRegional,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (tarifaTipoContrato)
    /** <code>tarifaTipoContrato</code> attribute id. */
    public static final String ATTR_ID_TARIFATIPOCONTRATO = "Clas_1431714529280565Atr_2_Alias";
    /** <code>tarifaTipoContrato</code> attribute name. */
    public static final String ATTR_NAME_TARIFATIPOCONTRATO = "tarifaTipoContrato";
    /** <code>tarifaTipoContrato</code> attribute alias. */
    public static final String ATTR_ALIAS_TARIFATIPOCONTRATO = "Tipo contrato";

    /** <code>tarifaTipoContrato</code> attribute facet sequence. */
    public static final String PATH_FACETS_TARIFATIPOCONTRATO = "";
    /** Agents allowed to view the attribute tarifaTipoContrato **/
    public static final String TARIFATIPOCONTRATO_AGENTS = "Admin,SuperAdmin,RespRegional,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Id)
    /** <code>Id</code> field name. */
    public static final String FLD_TARIFAID = "Id";    
    /** <code>tarifaId</code> attribute field name. */
    public static final String ATTR_FIELD_TARIFAID = "tarifaId";
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
    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_TARIFACODIGO = "Codigo";    
    /** <code>Codigo</code> field length. */
    public static final int FLD_TARIFACODIGOLENGTH = 12;
    /** <code>tarifaCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_TARIFACODIGO = "tarifaCodigo";
    // Field (TipoContrato)
    /** <code>TipoContrato</code> field name. */
    public static final String FLD_TARIFATIPOCONTRATO = "TipoContrato";    
    /** <code>tarifaTipoContrato</code> attribute field name. */
    public static final String ATTR_FIELD_TARIFATIPOCONTRATO = "tarifaTipoContrato";

    // Component role (ProductoT)
    /** <code>ProductoT</code> role id. */
    public static final String ROLE_ID_PRODUCTOT = "Agr_1431715053568944_Alias";
    /** <code>ProductoT</code> role name. */
    public static final String ROLE_NAME_PRODUCTOT = "productoT";
    /** <code>ProductoT</code> role alias. */
    public static final String ROLE_ALIAS_PRODUCTOT = "ProductoT";

    /** <code>ProductoT</code> inverse role name. */
    public static final String ROLE_INVNAME_PRODUCTOT = ProductosConstants.ROLE_NAME_TARIFAS;
    /** <code>ProductoT</code> role facet sequence. */
    public static final String PATH_FACETS_PRODUCTOT = "";
    /** <code>ProductoT</code> role target class. */
    public static final String ROLE_TARGET_PRODUCTOT = ProductosConstants.CLASS_NAME;

    /** Agents allowed to navigate through ProductoT **/
    public static final String PRODUCTOT_AGENTS = "Admin,SuperAdmin,RespRegional,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (PlanT)
    /** <code>PlanT</code> role id. */
    public static final String ROLE_ID_PLANT = "Agr_1431715053568180_Alias";
    /** <code>PlanT</code> role name. */
    public static final String ROLE_NAME_PLANT = "planT";
    /** <code>PlanT</code> role alias. */
    public static final String ROLE_ALIAS_PLANT = "PlanT";

    /** <code>PlanT</code> inverse role name. */
    public static final String ROLE_INVNAME_PLANT = PlanesConstants.ROLE_NAME_TARIFAS;
    /** <code>PlanT</code> role facet sequence. */
    public static final String PATH_FACETS_PLANT = "";
    /** <code>PlanT</code> role target class. */
    public static final String ROLE_TARGET_PLANT = PlanesConstants.CLASS_NAME;

    /** Agents allowed to navigate through PlanT **/
    public static final String PLANT_AGENTS = "Admin,SuperAdmin,RespRegional,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Compound role (ContratosC)
    /** <code>ContratosC</code> role id. */
    public static final String ROLE_ID_CONTRATOSC = "Agr_1473096450048968_Alias";
    /** <code>ContratosC</code> role name. */
    public static final String ROLE_NAME_CONTRATOSC = "contratosC";
    /** <code>TarifaC</code> role alias. */
    public static final String ROLE_ALIAS_CONTRATOSC = "Contratos";


    /** <code>ContratosC</code> inverse role name. */
    public static final String ROLE_INVNAME_CONTRATOSC = ContratoCConstants.ROLE_NAME_TARIFAC;
    /** <code>ContratosC</code> role facet sequence. */
    public static final String PATH_FACETS_CONTRATOSC = "";
    /** <code>ContratosC</code> role target class. */
    public static final String ROLE_TARGET_CONTRATOSC = ContratoCConstants.CLASS_NAME;
    /** Agents allowed to navigate through ContratosC **/
    public static final String CONTRATOSC_AGENTS = "Admin,SuperAdmin,RespRegional,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (DetallesTarifa)
    /** <code>DetallesTarifa</code> role id. */
    public static final String ROLE_ID_DETALLESTARIFA = "Agr_1445860474880701_Alias";
    /** <code>DetallesTarifa</code> role name. */
    public static final String ROLE_NAME_DETALLESTARIFA = "detallesTarifa";
    /** <code>Tarifa</code> role alias. */
    public static final String ROLE_ALIAS_DETALLESTARIFA = "DetallesTarifa";


    /** <code>DetallesTarifa</code> inverse role name. */
    public static final String ROLE_INVNAME_DETALLESTARIFA = DetalleTarifaConstants.ROLE_NAME_TARIFA;
    /** <code>DetallesTarifa</code> role facet sequence. */
    public static final String PATH_FACETS_DETALLESTARIFA = "";
    /** <code>DetallesTarifa</code> role target class. */
    public static final String ROLE_TARGET_DETALLESTARIFA = DetalleTarifaConstants.CLASS_NAME;
    /** Agents allowed to navigate through DetallesTarifa **/
    public static final String DETALLESTARIFA_AGENTS = "Admin,SuperAdmin,RespRegional,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (InstitucionMatNeo)
    /** <code>InstitucionMatNeo</code> role id. */
    public static final String ROLE_ID_INSTITUCIONMATNEO = "Agr_1463993761792960_Alias";
    /** <code>InstitucionMatNeo</code> role name. */
    public static final String ROLE_NAME_INSTITUCIONMATNEO = "institucionMatNeo";
    /** <code>Tarifa</code> role alias. */
    public static final String ROLE_ALIAS_INSTITUCIONMATNEO = "Instituciones";


    /** <code>InstitucionMatNeo</code> inverse role name. */
    public static final String ROLE_INVNAME_INSTITUCIONMATNEO = InstitucionMatNeoConstants.ROLE_NAME_TARIFA;
    /** <code>InstitucionMatNeo</code> role facet sequence. */
    public static final String PATH_FACETS_INSTITUCIONMATNEO = "";
    /** <code>InstitucionMatNeo</code> role target class. */
    public static final String ROLE_TARGET_INSTITUCIONMATNEO = InstitucionMatNeoConstants.CLASS_NAME;
    /** Agents allowed to navigate through InstitucionMatNeo **/
    public static final String INSTITUCIONMATNEO_AGENTS = "Admin,SuperAdmin,RespRegional,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431714529280565Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear tarifa";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>crear</code> precondition 0 id. */
    public static final String PRE_ID_CREAR_0 = "Clas_1431714529280565Pre_4_MsgError";
    // Inbound arguments
    /** <code>tarifacrearpagrPlanT</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TARIFACREARPAGRPLANT = "p_agrPlanT";
    /** <code>tarifacrearpagrPlanT</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TARIFACREARPAGRPLANT = "Clas_1431714529280565Ser_1Arg_12_Alias";
    /** <code>tarifacrearpagrPlanT</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TARIFACREARPAGRPLANT = "PlanT";
    /** <code>tarifacrearpagrProductoT</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TARIFACREARPAGRPRODUCTOT = "p_agrProductoT";
    /** <code>tarifacrearpagrProductoT</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TARIFACREARPAGRPRODUCTOT = "Clas_1431714529280565Ser_1Arg_13_Alias";
    /** <code>tarifacrearpagrProductoT</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TARIFACREARPAGRPRODUCTOT = "ProductoT";
    /** <code>tarifacrearpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TARIFACREARPATRCODIGO = "p_atrCodigo";
    /** <code>tarifacrearpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TARIFACREARPATRCODIGO = "Clas_1431714529280565Ser_1Arg_1_Alias";
    /** <code>tarifacrearpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TARIFACREARPATRCODIGO = "Código";
    /** <code>tarifacrearpatrTipoContrato</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TARIFACREARPATRTIPOCONTRATO = "p_atrTipoContrato";
    /** <code>tarifacrearpatrTipoContrato</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TARIFACREARPATRTIPOCONTRATO = "Clas_1431714529280565Ser_1Arg_2_Alias";
    /** <code>tarifacrearpatrTipoContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TARIFACREARPATRTIPOCONTRATO = "Tipo contrato";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431714529280565Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar tarifa";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>eliminar</code> precondition 0 id. */
    public static final String PRE_ID_ELIMINAR_0 = "Clas_1431714529280565Pre_2_MsgError";
    // Inbound arguments
    /** <code>tarifaeliminarpthisTarifa</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_TARIFAELIMINARPTHISTARIFA = "p_thisTarifa";
    /** <code>tarifaeliminarpthisTarifa</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_TARIFAELIMINARPTHISTARIFA = "Clas_1431714529280565Ser_2Arg_1_Alias";
    /** <code>tarifaeliminarpthisTarifa</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_TARIFAELIMINARPTHISTARIFA = "Tarifa";
    // Service (sincronizar)
    /** <code>sincronizar</code> service id. */
    public static final String SERV_ID_SINCRONIZAR = "Clas_1431714529280565Ser_4_Alias";
    /** <code>sincronizar</code> service name. */
    public static final String SERV_NAME_SINCRONIZAR = "sincronizar";
    /** <code>sincronizar</code> service alias. */
    public static final String SERV_ALIAS_SINCRONIZAR = "sincronizar";
    /** Agents allowed to execute the service sincronizar **/
    public static final String SINCRONIZAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>tarifasincronizarpthisTarifa</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_TARIFASINCRONIZARPTHISTARIFA = "p_thisTarifa";
    /** <code>tarifasincronizarpthisTarifa</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_TARIFASINCRONIZARPTHISTARIFA = "Clas_1431714529280565Ser_4Arg_1_Alias";
    /** <code>tarifasincronizarpthisTarifa</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_TARIFASINCRONIZARPTHISTARIFA = "Tarifa";
    /** <code>tarifasincronizarpTipoContrato</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_TARIFASINCRONIZARPTIPOCONTRATO = "p_TipoContrato";
    /** <code>tarifasincronizarpTipoContrato</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_TARIFASINCRONIZARPTIPOCONTRATO = "Clas_1431714529280565Ser_4Arg_2_Alias";
    /** <code>tarifasincronizarpTipoContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_TARIFASINCRONIZARPTIPOCONTRATO = "Tipo contrato";
    // Service (CambPlanTarifa)
    /** <code>CambPlanTarifa</code> service id. */
    public static final String SERV_ID_CAMBPLANTARIFA = "Clas_1431714529280565Ser_5_Alias";
    /** <code>CambPlanTarifa</code> service name. */
    public static final String SERV_NAME_CAMBPLANTARIFA = "CambPlanTarifa";
    /** <code>CambPlanTarifa</code> service alias. */
    public static final String SERV_ALIAS_CAMBPLANTARIFA = "CambPlanTarifa";
    /** Agents allowed to execute the service CambPlanTarifa **/
    public static final String CAMBPLANTARIFA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>tarifaCambPlanTarifapthisTarifa</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPLANTARIFA_TARIFACAMBPLANTARIFAPTHISTARIFA = "p_thisTarifa";
    /** <code>tarifaCambPlanTarifapthisTarifa</code> inbound argument id. */
    public static final String ARG_ID_CAMBPLANTARIFA_TARIFACAMBPLANTARIFAPTHISTARIFA = "Clas_1431714529280565Ser_5Arg_1_Alias";
    /** <code>tarifaCambPlanTarifapthisTarifa</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPLANTARIFA_TARIFACAMBPLANTARIFAPTHISTARIFA = "Tarifas";
    /** <code>tarifaCambPlanTarifapevcPlanes</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPLANTARIFA_TARIFACAMBPLANTARIFAPEVCPLANES = "p_evcPlanes";
    /** <code>tarifaCambPlanTarifapevcPlanes</code> inbound argument id. */
    public static final String ARG_ID_CAMBPLANTARIFA_TARIFACAMBPLANTARIFAPEVCPLANES = "Clas_1431714529280565Ser_5Arg_2_Alias";
    /** <code>tarifaCambPlanTarifapevcPlanes</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPLANTARIFA_TARIFACAMBPLANTARIFAPEVCPLANES = "PlanT";
    // Service (CambProductoTarifa)
    /** <code>CambProductoTarifa</code> service id. */
    public static final String SERV_ID_CAMBPRODUCTOTARIFA = "Clas_1431714529280565Ser_6_Alias";
    /** <code>CambProductoTarifa</code> service name. */
    public static final String SERV_NAME_CAMBPRODUCTOTARIFA = "CambProductoTarifa";
    /** <code>CambProductoTarifa</code> service alias. */
    public static final String SERV_ALIAS_CAMBPRODUCTOTARIFA = "CambProductoTarifa";
    /** Agents allowed to execute the service CambProductoTarifa **/
    public static final String CAMBPRODUCTOTARIFA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>tarifaCambProductoTarifapthisTarifa</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPRODUCTOTARIFA_TARIFACAMBPRODUCTOTARIFAPTHISTARIFA = "p_thisTarifa";
    /** <code>tarifaCambProductoTarifapthisTarifa</code> inbound argument id. */
    public static final String ARG_ID_CAMBPRODUCTOTARIFA_TARIFACAMBPRODUCTOTARIFAPTHISTARIFA = "Clas_1431714529280565Ser_6Arg_1_Alias";
    /** <code>tarifaCambProductoTarifapthisTarifa</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPRODUCTOTARIFA_TARIFACAMBPRODUCTOTARIFAPTHISTARIFA = "Tarifas";
    /** <code>tarifaCambProductoTarifapevcProductos</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPRODUCTOTARIFA_TARIFACAMBPRODUCTOTARIFAPEVCPRODUCTOS = "p_evcProductos";
    /** <code>tarifaCambProductoTarifapevcProductos</code> inbound argument id. */
    public static final String ARG_ID_CAMBPRODUCTOTARIFA_TARIFACAMBPRODUCTOTARIFAPEVCPRODUCTOS = "Clas_1431714529280565Ser_6Arg_2_Alias";
    /** <code>tarifaCambProductoTarifapevcProductos</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPRODUCTOTARIFA_TARIFACAMBPRODUCTOTARIFAPEVCPRODUCTOS = "ProductoT";
    // Service (CambiarTarifa)
    /** <code>CambiarTarifa</code> service id. */
    public static final String SERV_ID_CAMBIARTARIFA = "Clas_1431714529280565Ser_14_Alias";
    /** <code>CambiarTarifa</code> service name. */
    public static final String SERV_NAME_CAMBIARTARIFA = "CambiarTarifa";
    /** <code>CambiarTarifa</code> service alias. */
    public static final String SERV_ALIAS_CAMBIARTARIFA = "CambiarTarifa";
    /** Agents allowed to execute the service CambiarTarifa **/
    public static final String CAMBIARTARIFA_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>tarifaCambiarTarifapthisTarifa</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARTARIFA_TARIFACAMBIARTARIFAPTHISTARIFA = "p_thisTarifa";
    /** <code>tarifaCambiarTarifapthisTarifa</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARTARIFA_TARIFACAMBIARTARIFAPTHISTARIFA = "Clas_1431714529280565Ser_14Arg_1_Alias";
    /** <code>tarifaCambiarTarifapthisTarifa</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARTARIFA_TARIFACAMBIARTARIFAPTHISTARIFA = "Tarifa";
    /** <code>tarifaCambiarTarifapevcInstitucionMatNeo</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARTARIFA_TARIFACAMBIARTARIFAPEVCINSTITUCIONMATNEO = "p_evcInstitucionMatNeo";
    /** <code>tarifaCambiarTarifapevcInstitucionMatNeo</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARTARIFA_TARIFACAMBIARTARIFAPEVCINSTITUCIONMATNEO = "Clas_1431714529280565Ser_14Arg_2_Alias";
    /** <code>tarifaCambiarTarifapevcInstitucionMatNeo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARTARIFA_TARIFACAMBIARTARIFAPEVCINSTITUCIONMATNEO = "Instituciones";
    // Service (TSINCRONIZAR)
    /** <code>TSINCRONIZAR</code> service id. */
    public static final String SERV_ID_TSINCRONIZAR = "Clas_1431714529280565Ser_7_Alias";
    /** <code>TSINCRONIZAR</code> service name. */
    public static final String SERV_NAME_TSINCRONIZAR = "TSINCRONIZAR";
    /** <code>TSINCRONIZAR</code> service alias. */
    public static final String SERV_ALIAS_TSINCRONIZAR = "TSINCRONIZAR";
    /** Agents allowed to execute the service TSINCRONIZAR **/
    public static final String TSINCRONIZAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>tarifaTSINCRONIZARpthisTarifa</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_TARIFATSINCRONIZARPTHISTARIFA = "p_thisTarifa";
    /** <code>tarifaTSINCRONIZARpthisTarifa</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_TARIFATSINCRONIZARPTHISTARIFA = "Clas_1431714529280565Ser_7Arg_1_Alias";
    /** <code>tarifaTSINCRONIZARpthisTarifa</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_TARIFATSINCRONIZARPTHISTARIFA = "Tarifa";
    /** <code>tarifaTSINCRONIZARptpTipoContrato</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_TARIFATSINCRONIZARPTPTIPOCONTRATO = "pt_p_TipoContrato";
    /** <code>tarifaTSINCRONIZARptpTipoContrato</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_TARIFATSINCRONIZARPTPTIPOCONTRATO = "Clas_1431714529280565Ser_7Arg_2_Alias";
    /** <code>tarifaTSINCRONIZARptpTipoContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_TARIFATSINCRONIZARPTPTIPOCONTRATO = "Tipo contrato";
    /** <code>tarifaTSINCRONIZARptpevcPlan</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_TARIFATSINCRONIZARPTPEVCPLAN = "pt_p_evcPlan";
    /** <code>tarifaTSINCRONIZARptpevcPlan</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_TARIFATSINCRONIZARPTPEVCPLAN = "Clas_1431714529280565Ser_7Arg_6_Alias";
    /** <code>tarifaTSINCRONIZARptpevcPlan</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_TARIFATSINCRONIZARPTPEVCPLAN = "Plan";
    /** <code>tarifaTSINCRONIZARptpevcProducto</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_TARIFATSINCRONIZARPTPEVCPRODUCTO = "pt_p_evcProducto";
    /** <code>tarifaTSINCRONIZARptpevcProducto</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_TARIFATSINCRONIZARPTPEVCPRODUCTO = "Clas_1431714529280565Ser_7Arg_7_Alias";
    /** <code>tarifaTSINCRONIZARptpevcProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_TARIFATSINCRONIZARPTPEVCPRODUCTO = "Producto";
    // Service (TCREAR)
    /** <code>TCREAR</code> service id. */
    public static final String SERV_ID_TCREAR = "Clas_1431714529280565Ser_11_Alias";
    /** <code>TCREAR</code> service name. */
    public static final String SERV_NAME_TCREAR = "TCREAR";
    /** <code>TCREAR</code> service alias. */
    public static final String SERV_ALIAS_TCREAR = "Crear Tarifa";
    /** Agents allowed to execute the service TCREAR **/
    public static final String TCREAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>tarifaTCREARpProducto</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_TARIFATCREARPPRODUCTO = "pProducto";
    /** <code>tarifaTCREARpProducto</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_TARIFATCREARPPRODUCTO = "Clas_1431714529280565Ser_11Arg_5_Alias";
    /** <code>tarifaTCREARpProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_TARIFATCREARPPRODUCTO = "Producto";
    /** <code>tarifaTCREARpPlan</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_TARIFATCREARPPLAN = "pPlan";
    /** <code>tarifaTCREARpPlan</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_TARIFATCREARPPLAN = "Clas_1431714529280565Ser_11Arg_6_Alias";
    /** <code>tarifaTCREARpPlan</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_TARIFATCREARPPLAN = "Plan";
    /** <code>tarifaTCREARpTipoContrato</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_TARIFATCREARPTIPOCONTRATO = "pTipoContrato";
    /** <code>tarifaTCREARpTipoContrato</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_TARIFATCREARPTIPOCONTRATO = "Clas_1431714529280565Ser_11Arg_7_Alias";
    /** <code>tarifaTCREARpTipoContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_TARIFATCREARPTIPOCONTRATO = "Tipo Contrato";
    /** <code>tarifaTCREARpCodigo</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_TARIFATCREARPCODIGO = "pCodigo";
    /** <code>tarifaTCREARpCodigo</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_TARIFATCREARPCODIGO = "Clas_1431714529280565Ser_11Arg_8_Alias";
    /** <code>tarifaTCREARpCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_TARIFATCREARPCODIGO = "Código";
    // Service (TELIMINAR)
    /** <code>TELIMINAR</code> service id. */
    public static final String SERV_ID_TELIMINAR = "Clas_1431714529280565Ser_13_Alias";
    /** <code>TELIMINAR</code> service name. */
    public static final String SERV_NAME_TELIMINAR = "TELIMINAR";
    /** <code>TELIMINAR</code> service alias. */
    public static final String SERV_ALIAS_TELIMINAR = "Eliminar Tarifa";
    /** Agents allowed to execute the service TELIMINAR **/
    public static final String TELIMINAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>tarifaTELIMINARpthisTarifa</code> inbound argument name. */
    public static final String ARG_NAME_TELIMINAR_TARIFATELIMINARPTHISTARIFA = "p_thisTarifa";
    /** <code>tarifaTELIMINARpthisTarifa</code> inbound argument id. */
    public static final String ARG_ID_TELIMINAR_TARIFATELIMINARPTHISTARIFA = "Clas_1431714529280565Ser_13Arg_1_Alias";
    /** <code>tarifaTELIMINARpthisTarifa</code> inbound argument alias. */
    public static final String ARG_ALIAS_TELIMINAR_TARIFATELIMINARPTHISTARIFA = "Tarifa";

    public static final String FILTER_NAME_FTARIFAVARIOS = "F_TarifaVarios";
    public static final String VAR_NAME_FTARIFAVARIOS_VOPRODUCTO = "vo_Producto";
    public static final String VAR_NAME_FTARIFAVARIOS_VOPLAN = "vo_Plan";
    public static final String FILTER_NAME_IFTARIFAEXTRAECODIGO = "iF_TarifaExtraeCodigo";
    public static final String VAR_NAME_IFTARIFAEXTRAECODIGO_VOPRODUCTO = "vo_Producto";
    public static final String VAR_NAME_IFTARIFAEXTRAECODIGO_VOPLAN = "vo_Plan";
    public static final String VAR_NAME_IFTARIFAEXTRAECODIGO_VTIPOCONTRATO = "v_TipoContrato";
    public static final String VAR_NAME_IFTARIFAEXTRAECODIGO_VFANYO = "vfAnyo";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_TARIFACODIGO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_TARIFATIPOCONTRATO.toUpperCase(), Constants.Type.NAT.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_TARIFAID.toUpperCase(), TARIFAID_AGENTS);
    	attributeAgents.put(ATTR_NAME_TARIFACODIGO.toUpperCase(), TARIFACODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_TARIFATIPOCONTRATO.toUpperCase(), TARIFATIPOCONTRATO_AGENTS);
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
     * - If className is 'Tarifa', it returns the identification keys
     * - If className is a facet of the inheritance net of 'Tarifa', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_TARIFAID);
        }
        // Facet 'Tarifa' (This facet)
        if (TarifaConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_TARIFAID);
        }
        return returnList;
    }
}
