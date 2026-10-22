package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>AgentexProducto</code> model class.
 */
public final class AgentexProductoConstants {

    private AgentexProductoConstants() {

    }

    // Class
    /** <code>AgentexProducto</code> class id. */
    public static final String CLASS_ID = "Clas_1460560723968553_Alias";
    /** <code>AgentexProducto</code> class name. */
    public static final String CLASS_NAME = "AgentexProducto";
    /** <code>AgentexProducto</code> class alias. */
    public static final String CLASS_ALIAS = "Agente x Producto";
    /** <code>AgentexProducto</code> class table name. */
    public static final String TBL_NAME = "AgentexProducto";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "funcionarioAsesorId,agentexProductoId,productosProducto,agentexProductoCodigo,agentexProductoFechaInicio,agentexProductoFechaFin,agentexProductoTodosDominios";

    public static final String DSICAGENTEXPRODUCTO = "IC_AgentexProducto";
    public static final String DSDSAGENTEXPRODUCTOPIU = "DS_AgentexProductoPIU";
    

    // Attribute (agentexProductoId)
    /** <code>agentexProductoId</code> attribute id. */
    public static final String ATTR_ID_AGENTEXPRODUCTOID = "Clas_1460560723968553Atr_7_Alias";
    /** <code>agentexProductoId</code> attribute name. */
    public static final String ATTR_NAME_AGENTEXPRODUCTOID = "agentexProductoId";
    /** <code>agentexProductoId</code> attribute alias. */
    public static final String ATTR_ALIAS_AGENTEXPRODUCTOID = "Id.";

    /** <code>agentexProductoId</code> attribute facet sequence. */
    public static final String PATH_FACETS_AGENTEXPRODUCTOID = "";
    /** Agents allowed to view the attribute agentexProductoId **/
    public static final String AGENTEXPRODUCTOID_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones";
    // Attribute (agentexProductoCodigo)
    /** <code>agentexProductoCodigo</code> attribute id. */
    public static final String ATTR_ID_AGENTEXPRODUCTOCODIGO = "Clas_1460560723968553Atr_1_Alias";
    /** <code>agentexProductoCodigo</code> attribute name. */
    public static final String ATTR_NAME_AGENTEXPRODUCTOCODIGO = "agentexProductoCodigo";
    /** <code>agentexProductoCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_AGENTEXPRODUCTOCODIGO = "Código";

    /** <code>agentexProductoCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_AGENTEXPRODUCTOCODIGO = "";
    /** Agents allowed to view the attribute agentexProductoCodigo **/
    public static final String AGENTEXPRODUCTOCODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones";
    // Attribute (agentexProductoFechaInicio)
    /** <code>agentexProductoFechaInicio</code> attribute id. */
    public static final String ATTR_ID_AGENTEXPRODUCTOFECHAINICIO = "Clas_1460560723968553Atr_4_Alias";
    /** <code>agentexProductoFechaInicio</code> attribute name. */
    public static final String ATTR_NAME_AGENTEXPRODUCTOFECHAINICIO = "agentexProductoFechaInicio";
    /** <code>agentexProductoFechaInicio</code> attribute alias. */
    public static final String ATTR_ALIAS_AGENTEXPRODUCTOFECHAINICIO = "Fecha Inicio";

    /** <code>agentexProductoFechaInicio</code> attribute facet sequence. */
    public static final String PATH_FACETS_AGENTEXPRODUCTOFECHAINICIO = "";
    /** Agents allowed to view the attribute agentexProductoFechaInicio **/
    public static final String AGENTEXPRODUCTOFECHAINICIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones";
    // Attribute (agentexProductoFechaFin)
    /** <code>agentexProductoFechaFin</code> attribute id. */
    public static final String ATTR_ID_AGENTEXPRODUCTOFECHAFIN = "Clas_1460560723968553Atr_5_Alias";
    /** <code>agentexProductoFechaFin</code> attribute name. */
    public static final String ATTR_NAME_AGENTEXPRODUCTOFECHAFIN = "agentexProductoFechaFin";
    /** <code>agentexProductoFechaFin</code> attribute alias. */
    public static final String ATTR_ALIAS_AGENTEXPRODUCTOFECHAFIN = "Fecha Fin";

    /** <code>agentexProductoFechaFin</code> attribute facet sequence. */
    public static final String PATH_FACETS_AGENTEXPRODUCTOFECHAFIN = "";
    /** Agents allowed to view the attribute agentexProductoFechaFin **/
    public static final String AGENTEXPRODUCTOFECHAFIN_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones";
    // Attribute (agentexProductodrvVigente)
    /** <code>agentexProductodrvVigente</code> attribute id. */
    public static final String ATTR_ID_AGENTEXPRODUCTODRVVIGENTE = "Clas_1460560723968553Atr_6_Alias";
    /** <code>agentexProductodrvVigente</code> attribute name. */
    public static final String ATTR_NAME_AGENTEXPRODUCTODRVVIGENTE = "agentexProductodrvVigente";
    /** <code>agentexProductodrvVigente</code> attribute alias. */
    public static final String ATTR_ALIAS_AGENTEXPRODUCTODRVVIGENTE = "Vigente";

    /** <code>agentexProductodrvVigente</code> attribute facet sequence. */
    public static final String PATH_FACETS_AGENTEXPRODUCTODRVVIGENTE = "";
    /** Agents allowed to view the attribute agentexProductodrvVigente **/
    public static final String AGENTEXPRODUCTODRVVIGENTE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones";
    // Attribute (agentexProductoTodosDominios)
    /** <code>agentexProductoTodosDominios</code> attribute id. */
    public static final String ATTR_ID_AGENTEXPRODUCTOTODOSDOMINIOS = "Clas_1460560723968553Atr_8_Alias";
    /** <code>agentexProductoTodosDominios</code> attribute name. */
    public static final String ATTR_NAME_AGENTEXPRODUCTOTODOSDOMINIOS = "agentexProductoTodosDominios";
    /** <code>agentexProductoTodosDominios</code> attribute alias. */
    public static final String ATTR_ALIAS_AGENTEXPRODUCTOTODOSDOMINIOS = "Todos Dominios";

    /** <code>agentexProductoTodosDominios</code> attribute facet sequence. */
    public static final String PATH_FACETS_AGENTEXPRODUCTOTODOSDOMINIOS = "";
    /** Agents allowed to view the attribute agentexProductoTodosDominios **/
    public static final String AGENTEXPRODUCTOTODOSDOMINIOS_AGENTS = "Admin,SuperAdmin,Asesor";

    // Attribute (Asesor.funcionarioId)
    /** <code>Asesor.funcionarioId</code> identification attribute name. */
    public static final String ATTR_NAME_ASESOR_FUNCIONARIOID = "asesor.funcionarioId";

    // Field (Asesor_Id)
    /** <code>Asesor_Id</code> field name. */
    public static final String FLD_FUNCIONARIOASESORID = "Asesor_Id";    
    /** <code>Asesor.funcionarioId</code> attribute field name. */
    public static final String ATTR_FIELD_ASESOR_FUNCIONARIOID = "funcionarioAsesorId";
    // Field (Id)
    /** <code>Id</code> field name. */
    public static final String FLD_AGENTEXPRODUCTOID = "Id";    
    /** <code>agentexProductoId</code> attribute field name. */
    public static final String ATTR_FIELD_AGENTEXPRODUCTOID = "agentexProductoId";
    // Field (Producto)
    /** <code>Producto</code> field name. */
    public static final String FLD_PRODUCTOSPRODUCTO = "Producto";    
    /** <code>ProductoT.productosProducto</code> attribute field name. */
    public static final String ATTR_FIELD_PRODUCTOT_PRODUCTOSPRODUCTO = "productosProducto";
    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_AGENTEXPRODUCTOCODIGO = "Codigo";    
    /** <code>agentexProductoCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_AGENTEXPRODUCTOCODIGO = "agentexProductoCodigo";
    // Field (FechaInicio)
    /** <code>FechaInicio</code> field name. */
    public static final String FLD_AGENTEXPRODUCTOFECHAINICIO = "FechaInicio";    
    /** <code>agentexProductoFechaInicio</code> attribute field name. */
    public static final String ATTR_FIELD_AGENTEXPRODUCTOFECHAINICIO = "agentexProductoFechaInicio";
    // Field (FechaFin)
    /** <code>FechaFin</code> field name. */
    public static final String FLD_AGENTEXPRODUCTOFECHAFIN = "FechaFin";    
    /** <code>agentexProductoFechaFin</code> attribute field name. */
    public static final String ATTR_FIELD_AGENTEXPRODUCTOFECHAFIN = "agentexProductoFechaFin";
    // Field (TodosDominios)
    /** <code>TodosDominios</code> field name. */
    public static final String FLD_AGENTEXPRODUCTOTODOSDOMINIOS = "TodosDominios";    
    /** <code>agentexProductoTodosDominios</code> attribute field name. */
    public static final String ATTR_FIELD_AGENTEXPRODUCTOTODOSDOMINIOS = "agentexProductoTodosDominios";

    // Component role (ProductoT)
    /** <code>ProductoT</code> role id. */
    public static final String ROLE_ID_PRODUCTOT = "Agr_1460561248256568_Alias";
    /** <code>ProductoT</code> role name. */
    public static final String ROLE_NAME_PRODUCTOT = "productoT";
    /** <code>ProductoT</code> role alias. */
    public static final String ROLE_ALIAS_PRODUCTOT = "ProductoT";

    /** <code>ProductoT</code> inverse role name. */
    public static final String ROLE_INVNAME_PRODUCTOT = ProductosConstants.ROLE_NAME_AGENTEXPRODUCTO;
    /** <code>ProductoT</code> role facet sequence. */
    public static final String PATH_FACETS_PRODUCTOT = "";
    /** <code>ProductoT</code> role target class. */
    public static final String ROLE_TARGET_PRODUCTOT = ProductosConstants.CLASS_NAME;

    /** Agents allowed to navigate through ProductoT **/
    public static final String PRODUCTOT_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones";
    // Component role (Asesor)
    /** <code>Asesor</code> role id. */
    public static final String ROLE_ID_ASESOR = "Agr_1460561248256880_Alias";
    /** <code>Asesor</code> role name. */
    public static final String ROLE_NAME_ASESOR = "asesor";
    /** <code>Asesor</code> role alias. */
    public static final String ROLE_ALIAS_ASESOR = "Asesor";

    /** <code>Asesor</code> inverse role name. */
    public static final String ROLE_INVNAME_ASESOR = AsesorConstants.ROLE_NAME_AGENTEXPRODUCTO;
    /** <code>Asesor</code> role facet sequence. */
    public static final String PATH_FACETS_ASESOR = "";
    /** <code>Asesor</code> role target class. */
    public static final String ROLE_TARGET_ASESOR = AsesorConstants.CLASS_NAME;

    /** Agents allowed to navigate through Asesor **/
    public static final String ASESOR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones";
    // Component role (Dominios)
    /** <code>Dominios</code> role id. */
    public static final String ROLE_ID_DOMINIOS = "Agr_1624004231168905_Alias";
    /** <code>Dominios</code> role name. */
    public static final String ROLE_NAME_DOMINIOS = "dominios";
    /** <code>Dominios</code> role alias. */
    public static final String ROLE_ALIAS_DOMINIOS = "Dominios";

    /** <code>Dominios</code> inverse role name. */
    public static final String ROLE_INVNAME_DOMINIOS = DominioConstants.ROLE_NAME_AGENTEXPRODUCTO;
    /** <code>Dominios</code> role facet sequence. */
    public static final String PATH_FACETS_DOMINIOS = "";
    /** <code>Dominios</code> role target class. */
    public static final String ROLE_TARGET_DOMINIOS = DominioConstants.CLASS_NAME;

    /** Agents allowed to navigate through Dominios **/
    public static final String DOMINIOS_AGENTS = "Admin,SuperAdmin,Asesor";


    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1460560723968553Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>agentexProductocrearpagrProductoT</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_AGENTEXPRODUCTOCREARPAGRPRODUCTOT = "p_agrProductoT";
    /** <code>agentexProductocrearpagrProductoT</code> inbound argument id. */
    public static final String ARG_ID_CREAR_AGENTEXPRODUCTOCREARPAGRPRODUCTOT = "Clas_1460560723968553Ser_1Arg_16_Alias";
    /** <code>agentexProductocrearpagrProductoT</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_AGENTEXPRODUCTOCREARPAGRPRODUCTOT = "Producto";
    /** <code>agentexProductocrearpagrAsesor</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_AGENTEXPRODUCTOCREARPAGRASESOR = "p_agrAsesor";
    /** <code>agentexProductocrearpagrAsesor</code> inbound argument id. */
    public static final String ARG_ID_CREAR_AGENTEXPRODUCTOCREARPAGRASESOR = "Clas_1460560723968553Ser_1Arg_17_Alias";
    /** <code>agentexProductocrearpagrAsesor</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_AGENTEXPRODUCTOCREARPAGRASESOR = "Asesor";
    /** <code>agentexProductocrearpatrFechaInicio</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_AGENTEXPRODUCTOCREARPATRFECHAINICIO = "p_atrFechaInicio";
    /** <code>agentexProductocrearpatrFechaInicio</code> inbound argument id. */
    public static final String ARG_ID_CREAR_AGENTEXPRODUCTOCREARPATRFECHAINICIO = "Clas_1460560723968553Ser_1Arg_4_Alias";
    /** <code>agentexProductocrearpatrFechaInicio</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_AGENTEXPRODUCTOCREARPATRFECHAINICIO = "Fecha Inicio";
    /** <code>agentexProductocrearpatrFechaFin</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_AGENTEXPRODUCTOCREARPATRFECHAFIN = "p_atrFechaFin";
    /** <code>agentexProductocrearpatrFechaFin</code> inbound argument id. */
    public static final String ARG_ID_CREAR_AGENTEXPRODUCTOCREARPATRFECHAFIN = "Clas_1460560723968553Ser_1Arg_5_Alias";
    /** <code>agentexProductocrearpatrFechaFin</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_AGENTEXPRODUCTOCREARPATRFECHAFIN = "Fecha Fin";
    /** <code>agentexProductocrearpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_AGENTEXPRODUCTOCREARPATRCODIGO = "p_atrCodigo";
    /** <code>agentexProductocrearpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_AGENTEXPRODUCTOCREARPATRCODIGO = "Clas_1460560723968553Ser_1Arg_18_Alias";
    /** <code>agentexProductocrearpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_AGENTEXPRODUCTOCREARPATRCODIGO = "Código";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1460560723968553Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>agentexProductoeliminarpthisAgentexProducto</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_AGENTEXPRODUCTOELIMINARPTHISAGENTEXPRODUCTO = "p_thisAgentexProducto";
    /** <code>agentexProductoeliminarpthisAgentexProducto</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_AGENTEXPRODUCTOELIMINARPTHISAGENTEXPRODUCTO = "Clas_1460560723968553Ser_2Arg_1_Alias";
    /** <code>agentexProductoeliminarpthisAgentexProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_AGENTEXPRODUCTOELIMINARPTHISAGENTEXPRODUCTO = "Agente x Producto";
    // Service (sincronizar)
    /** <code>sincronizar</code> service id. */
    public static final String SERV_ID_SINCRONIZAR = "Clas_1460560723968553Ser_3_Alias";
    /** <code>sincronizar</code> service name. */
    public static final String SERV_NAME_SINCRONIZAR = "sincronizar";
    /** <code>sincronizar</code> service alias. */
    public static final String SERV_ALIAS_SINCRONIZAR = "Modificar";
    /** Agents allowed to execute the service sincronizar **/
    public static final String SINCRONIZAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>agentexProductosincronizarpthisAgentexProducto</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_AGENTEXPRODUCTOSINCRONIZARPTHISAGENTEXPRODUCTO = "p_thisAgentexProducto";
    /** <code>agentexProductosincronizarpthisAgentexProducto</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_AGENTEXPRODUCTOSINCRONIZARPTHISAGENTEXPRODUCTO = "Clas_1460560723968553Ser_3Arg_1_Alias";
    /** <code>agentexProductosincronizarpthisAgentexProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_AGENTEXPRODUCTOSINCRONIZARPTHISAGENTEXPRODUCTO = "Agente x Producto";
    /** <code>agentexProductosincronizarpFechaInicio</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_AGENTEXPRODUCTOSINCRONIZARPFECHAINICIO = "p_FechaInicio";
    /** <code>agentexProductosincronizarpFechaInicio</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_AGENTEXPRODUCTOSINCRONIZARPFECHAINICIO = "Clas_1460560723968553Ser_3Arg_4_Alias";
    /** <code>agentexProductosincronizarpFechaInicio</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_AGENTEXPRODUCTOSINCRONIZARPFECHAINICIO = "Fecha Inicio";
    /** <code>agentexProductosincronizarpFechaFin</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_AGENTEXPRODUCTOSINCRONIZARPFECHAFIN = "p_FechaFin";
    /** <code>agentexProductosincronizarpFechaFin</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_AGENTEXPRODUCTOSINCRONIZARPFECHAFIN = "Clas_1460560723968553Ser_3Arg_5_Alias";
    /** <code>agentexProductosincronizarpFechaFin</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_AGENTEXPRODUCTOSINCRONIZARPFECHAFIN = "Fecha Fin";
    // Service (CambProductoDeAsesorxProducto)
    /** <code>CambProductoDeAsesorxProducto</code> service id. */
    public static final String SERV_ID_CAMBPRODUCTODEASESORXPRODUCTO = "Clas_1460560723968553Ser_5_Alias";
    /** <code>CambProductoDeAsesorxProducto</code> service name. */
    public static final String SERV_NAME_CAMBPRODUCTODEASESORXPRODUCTO = "CambProductoDeAsesorxProducto";
    /** <code>CambProductoDeAsesorxProducto</code> service alias. */
    public static final String SERV_ALIAS_CAMBPRODUCTODEASESORXPRODUCTO = "CambProductoDeAsesorxProducto";
    /** Agents allowed to execute the service CambProductoDeAsesorxProducto **/
    public static final String CAMBPRODUCTODEASESORXPRODUCTO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>agentexProductoCambProductoDeAsesorxProductopthisAgentexProducto</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPRODUCTODEASESORXPRODUCTO_AGENTEXPRODUCTOCAMBPRODUCTODEASESORXPRODUCTOPTHISAGENTEXPRODUCTO = "p_thisAgentexProducto";
    /** <code>agentexProductoCambProductoDeAsesorxProductopthisAgentexProducto</code> inbound argument id. */
    public static final String ARG_ID_CAMBPRODUCTODEASESORXPRODUCTO_AGENTEXPRODUCTOCAMBPRODUCTODEASESORXPRODUCTOPTHISAGENTEXPRODUCTO = "Clas_1460560723968553Ser_5Arg_1_Alias";
    /** <code>agentexProductoCambProductoDeAsesorxProductopthisAgentexProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPRODUCTODEASESORXPRODUCTO_AGENTEXPRODUCTOCAMBPRODUCTODEASESORXPRODUCTOPTHISAGENTEXPRODUCTO = "Asesores";
    /** <code>agentexProductoCambProductoDeAsesorxProductopevcProductos</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPRODUCTODEASESORXPRODUCTO_AGENTEXPRODUCTOCAMBPRODUCTODEASESORXPRODUCTOPEVCPRODUCTOS = "p_evcProductos";
    /** <code>agentexProductoCambProductoDeAsesorxProductopevcProductos</code> inbound argument id. */
    public static final String ARG_ID_CAMBPRODUCTODEASESORXPRODUCTO_AGENTEXPRODUCTOCAMBPRODUCTODEASESORXPRODUCTOPEVCPRODUCTOS = "Clas_1460560723968553Ser_5Arg_2_Alias";
    /** <code>agentexProductoCambProductoDeAsesorxProductopevcProductos</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPRODUCTODEASESORXPRODUCTO_AGENTEXPRODUCTOCAMBPRODUCTODEASESORXPRODUCTOPEVCPRODUCTOS = "ProductoT";
    // Service (InsDominio)
    /** <code>InsDominio</code> service id. */
    public static final String SERV_ID_INSDOMINIO = "Clas_1460560723968553Ser_9_Alias";
    /** <code>InsDominio</code> service name. */
    public static final String SERV_NAME_INSDOMINIO = "InsDominio";
    /** <code>InsDominio</code> service alias. */
    public static final String SERV_ALIAS_INSDOMINIO = "InsDominio";
    /** Agents allowed to execute the service InsDominio **/
    public static final String INSDOMINIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>agentexProductoInsDominiopthisAgentexProducto</code> inbound argument name. */
    public static final String ARG_NAME_INSDOMINIO_AGENTEXPRODUCTOINSDOMINIOPTHISAGENTEXPRODUCTO = "p_thisAgentexProducto";
    /** <code>agentexProductoInsDominiopthisAgentexProducto</code> inbound argument id. */
    public static final String ARG_ID_INSDOMINIO_AGENTEXPRODUCTOINSDOMINIOPTHISAGENTEXPRODUCTO = "Clas_1460560723968553Ser_9Arg_1_Alias";
    /** <code>agentexProductoInsDominiopthisAgentexProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDOMINIO_AGENTEXPRODUCTOINSDOMINIOPTHISAGENTEXPRODUCTO = "AgentexProducto";
    /** <code>agentexProductoInsDominiopevcDominio</code> inbound argument name. */
    public static final String ARG_NAME_INSDOMINIO_AGENTEXPRODUCTOINSDOMINIOPEVCDOMINIO = "p_evcDominio";
    /** <code>agentexProductoInsDominiopevcDominio</code> inbound argument id. */
    public static final String ARG_ID_INSDOMINIO_AGENTEXPRODUCTOINSDOMINIOPEVCDOMINIO = "Clas_1460560723968553Ser_9Arg_2_Alias";
    /** <code>agentexProductoInsDominiopevcDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDOMINIO_AGENTEXPRODUCTOINSDOMINIOPEVCDOMINIO = "Dominios";
    // Service (DelDominio)
    /** <code>DelDominio</code> service id. */
    public static final String SERV_ID_DELDOMINIO = "Clas_1460560723968553Ser_10_Alias";
    /** <code>DelDominio</code> service name. */
    public static final String SERV_NAME_DELDOMINIO = "DelDominio";
    /** <code>DelDominio</code> service alias. */
    public static final String SERV_ALIAS_DELDOMINIO = "DelDominio";
    /** Agents allowed to execute the service DelDominio **/
    public static final String DELDOMINIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>agentexProductoDelDominiopthisAgentexProducto</code> inbound argument name. */
    public static final String ARG_NAME_DELDOMINIO_AGENTEXPRODUCTODELDOMINIOPTHISAGENTEXPRODUCTO = "p_thisAgentexProducto";
    /** <code>agentexProductoDelDominiopthisAgentexProducto</code> inbound argument id. */
    public static final String ARG_ID_DELDOMINIO_AGENTEXPRODUCTODELDOMINIOPTHISAGENTEXPRODUCTO = "Clas_1460560723968553Ser_10Arg_1_Alias";
    /** <code>agentexProductoDelDominiopthisAgentexProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDOMINIO_AGENTEXPRODUCTODELDOMINIOPTHISAGENTEXPRODUCTO = "AgentexProducto";
    /** <code>agentexProductoDelDominiopevcDominio</code> inbound argument name. */
    public static final String ARG_NAME_DELDOMINIO_AGENTEXPRODUCTODELDOMINIOPEVCDOMINIO = "p_evcDominio";
    /** <code>agentexProductoDelDominiopevcDominio</code> inbound argument id. */
    public static final String ARG_ID_DELDOMINIO_AGENTEXPRODUCTODELDOMINIOPEVCDOMINIO = "Clas_1460560723968553Ser_10Arg_2_Alias";
    /** <code>agentexProductoDelDominiopevcDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDOMINIO_AGENTEXPRODUCTODELDOMINIOPEVCDOMINIO = "Dominios";
    // Service (setTodosDominios)
    /** <code>setTodosDominios</code> service id. */
    public static final String SERV_ID_SETTODOSDOMINIOS = "Clas_1460560723968553Ser_13_Alias";
    /** <code>setTodosDominios</code> service name. */
    public static final String SERV_NAME_SETTODOSDOMINIOS = "setTodosDominios";
    /** <code>setTodosDominios</code> service alias. */
    public static final String SERV_ALIAS_SETTODOSDOMINIOS = "setTodosDominios";
    /** Agents allowed to execute the service setTodosDominios **/
    public static final String SETTODOSDOMINIOS_SRVAGENTS = "";
    // Inbound arguments
    /** <code>agentexProductosetTodosDominiospthisAgentexProducto</code> inbound argument name. */
    public static final String ARG_NAME_SETTODOSDOMINIOS_AGENTEXPRODUCTOSETTODOSDOMINIOSPTHISAGENTEXPRODUCTO = "p_thisAgentexProducto";
    /** <code>agentexProductosetTodosDominiospthisAgentexProducto</code> inbound argument id. */
    public static final String ARG_ID_SETTODOSDOMINIOS_AGENTEXPRODUCTOSETTODOSDOMINIOSPTHISAGENTEXPRODUCTO = "Clas_1460560723968553Ser_13Arg_1_Alias";
    /** <code>agentexProductosetTodosDominiospthisAgentexProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETTODOSDOMINIOS_AGENTEXPRODUCTOSETTODOSDOMINIOSPTHISAGENTEXPRODUCTO = "Agente x Producto";
    /** <code>agentexProductosetTodosDominiosptTodos</code> inbound argument name. */
    public static final String ARG_NAME_SETTODOSDOMINIOS_AGENTEXPRODUCTOSETTODOSDOMINIOSPTTODOS = "ptTodos";
    /** <code>agentexProductosetTodosDominiosptTodos</code> inbound argument id. */
    public static final String ARG_ID_SETTODOSDOMINIOS_AGENTEXPRODUCTOSETTODOSDOMINIOSPTTODOS = "Clas_1460560723968553Ser_13Arg_2_Alias";
    /** <code>agentexProductosetTodosDominiosptTodos</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETTODOSDOMINIOS_AGENTEXPRODUCTOSETTODOSDOMINIOSPTTODOS = "Todos Dominios";
    // Service (TSINCRONIZAR)
    /** <code>TSINCRONIZAR</code> service id. */
    public static final String SERV_ID_TSINCRONIZAR = "Clas_1460560723968553Ser_6_Alias";
    /** <code>TSINCRONIZAR</code> service name. */
    public static final String SERV_NAME_TSINCRONIZAR = "TSINCRONIZAR";
    /** <code>TSINCRONIZAR</code> service alias. */
    public static final String SERV_ALIAS_TSINCRONIZAR = "Sincronizar";
    /** Agents allowed to execute the service TSINCRONIZAR **/
    public static final String TSINCRONIZAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>agentexProductoTSINCRONIZARpthisAgentexProducto</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_AGENTEXPRODUCTOTSINCRONIZARPTHISAGENTEXPRODUCTO = "p_thisAgentexProducto";
    /** <code>agentexProductoTSINCRONIZARpthisAgentexProducto</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_AGENTEXPRODUCTOTSINCRONIZARPTHISAGENTEXPRODUCTO = "Clas_1460560723968553Ser_6Arg_1_Alias";
    /** <code>agentexProductoTSINCRONIZARpthisAgentexProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_AGENTEXPRODUCTOTSINCRONIZARPTHISAGENTEXPRODUCTO = "Agente x Producto";
    /** <code>agentexProductoTSINCRONIZARptpFechaInicio</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_AGENTEXPRODUCTOTSINCRONIZARPTPFECHAINICIO = "pt_p_FechaInicio";
    /** <code>agentexProductoTSINCRONIZARptpFechaInicio</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_AGENTEXPRODUCTOTSINCRONIZARPTPFECHAINICIO = "Clas_1460560723968553Ser_6Arg_2_Alias";
    /** <code>agentexProductoTSINCRONIZARptpFechaInicio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_AGENTEXPRODUCTOTSINCRONIZARPTPFECHAINICIO = "Fecha Inicio";
    /** <code>agentexProductoTSINCRONIZARptpFechaFin</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_AGENTEXPRODUCTOTSINCRONIZARPTPFECHAFIN = "pt_p_FechaFin";
    /** <code>agentexProductoTSINCRONIZARptpFechaFin</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_AGENTEXPRODUCTOTSINCRONIZARPTPFECHAFIN = "Clas_1460560723968553Ser_6Arg_3_Alias";
    /** <code>agentexProductoTSINCRONIZARptpFechaFin</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_AGENTEXPRODUCTOTSINCRONIZARPTPFECHAFIN = "Fecha Fin";
    /** <code>agentexProductoTSINCRONIZARpProducto</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_AGENTEXPRODUCTOTSINCRONIZARPPRODUCTO = "p_Producto";
    /** <code>agentexProductoTSINCRONIZARpProducto</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_AGENTEXPRODUCTOTSINCRONIZARPPRODUCTO = "Clas_1460560723968553Ser_6Arg_4_Alias";
    /** <code>agentexProductoTSINCRONIZARpProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_AGENTEXPRODUCTOTSINCRONIZARPPRODUCTO = "Producto";
    // Service (TCREAR)
    /** <code>TCREAR</code> service id. */
    public static final String SERV_ID_TCREAR = "Clas_1460560723968553Ser_8_Alias";
    /** <code>TCREAR</code> service name. */
    public static final String SERV_NAME_TCREAR = "TCREAR";
    /** <code>TCREAR</code> service alias. */
    public static final String SERV_ALIAS_TCREAR = "Crear";
    /** Agents allowed to execute the service TCREAR **/
    public static final String TCREAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>agentexProductoTCREARptpagrProductoT</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_AGENTEXPRODUCTOTCREARPTPAGRPRODUCTOT = "pt_p_agrProductoT";
    /** <code>agentexProductoTCREARptpagrProductoT</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_AGENTEXPRODUCTOTCREARPTPAGRPRODUCTOT = "Clas_1460560723968553Ser_8Arg_3_Alias";
    /** <code>agentexProductoTCREARptpagrProductoT</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_AGENTEXPRODUCTOTCREARPTPAGRPRODUCTOT = "Producto";
    /** <code>agentexProductoTCREARptpagrAsesor</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_AGENTEXPRODUCTOTCREARPTPAGRASESOR = "pt_p_agrAsesor";
    /** <code>agentexProductoTCREARptpagrAsesor</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_AGENTEXPRODUCTOTCREARPTPAGRASESOR = "Clas_1460560723968553Ser_8Arg_4_Alias";
    /** <code>agentexProductoTCREARptpagrAsesor</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_AGENTEXPRODUCTOTCREARPTPAGRASESOR = "Asesor";
    /** <code>agentexProductoTCREARptpatrFechaInicio</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_AGENTEXPRODUCTOTCREARPTPATRFECHAINICIO = "pt_p_atrFechaInicio";
    /** <code>agentexProductoTCREARptpatrFechaInicio</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_AGENTEXPRODUCTOTCREARPTPATRFECHAINICIO = "Clas_1460560723968553Ser_8Arg_6_Alias";
    /** <code>agentexProductoTCREARptpatrFechaInicio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_AGENTEXPRODUCTOTCREARPTPATRFECHAINICIO = "Fecha Inicio";
    /** <code>agentexProductoTCREARptpatrFechaFin</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_AGENTEXPRODUCTOTCREARPTPATRFECHAFIN = "pt_p_atrFechaFin";
    /** <code>agentexProductoTCREARptpatrFechaFin</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_AGENTEXPRODUCTOTCREARPTPATRFECHAFIN = "Clas_1460560723968553Ser_8Arg_7_Alias";
    /** <code>agentexProductoTCREARptpatrFechaFin</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_AGENTEXPRODUCTOTCREARPTPATRFECHAFIN = "Fecha Fin";
    /** <code>agentexProductoTCREARptpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_AGENTEXPRODUCTOTCREARPTPATRCODIGO = "pt_p_atrCodigo";
    /** <code>agentexProductoTCREARptpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_AGENTEXPRODUCTOTCREARPTPATRCODIGO = "Clas_1460560723968553Ser_8Arg_360_Alias";
    /** <code>agentexProductoTCREARptpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_AGENTEXPRODUCTOTCREARPTPATRCODIGO = "Código";
    // Service (TADDDOMINIO)
    /** <code>TADDDOMINIO</code> service id. */
    public static final String SERV_ID_TADDDOMINIO = "Clas_1460560723968553Ser_11_Alias";
    /** <code>TADDDOMINIO</code> service name. */
    public static final String SERV_NAME_TADDDOMINIO = "TADDDOMINIO";
    /** <code>TADDDOMINIO</code> service alias. */
    public static final String SERV_ALIAS_TADDDOMINIO = "Añadir Dominio";
    /** Agents allowed to execute the service TADDDOMINIO **/
    public static final String TADDDOMINIO_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>TADDDOMINIO</code> precondition 0 id. */
    public static final String PRE_ID_TADDDOMINIO_0 = "Clas_1460560723968553Pre_1_MsgError";
    // Inbound arguments
    /** <code>agentexProductoTADDDOMINIOpthisAgentexProducto</code> inbound argument name. */
    public static final String ARG_NAME_TADDDOMINIO_AGENTEXPRODUCTOTADDDOMINIOPTHISAGENTEXPRODUCTO = "p_thisAgentexProducto";
    /** <code>agentexProductoTADDDOMINIOpthisAgentexProducto</code> inbound argument id. */
    public static final String ARG_ID_TADDDOMINIO_AGENTEXPRODUCTOTADDDOMINIOPTHISAGENTEXPRODUCTO = "Clas_1460560723968553Ser_11Arg_1_Alias";
    /** <code>agentexProductoTADDDOMINIOpthisAgentexProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDDOMINIO_AGENTEXPRODUCTOTADDDOMINIOPTHISAGENTEXPRODUCTO = "Agente x Producto";
    /** <code>agentexProductoTADDDOMINIOptpevcDominio</code> inbound argument name. */
    public static final String ARG_NAME_TADDDOMINIO_AGENTEXPRODUCTOTADDDOMINIOPTPEVCDOMINIO = "pt_p_evcDominio";
    /** <code>agentexProductoTADDDOMINIOptpevcDominio</code> inbound argument id. */
    public static final String ARG_ID_TADDDOMINIO_AGENTEXPRODUCTOTADDDOMINIOPTPEVCDOMINIO = "Clas_1460560723968553Ser_11Arg_2_Alias";
    /** <code>agentexProductoTADDDOMINIOptpevcDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDDOMINIO_AGENTEXPRODUCTOTADDDOMINIOPTPEVCDOMINIO = "Dominios";
    // Service (TDELDOMINIO)
    /** <code>TDELDOMINIO</code> service id. */
    public static final String SERV_ID_TDELDOMINIO = "Clas_1460560723968553Ser_12_Alias";
    /** <code>TDELDOMINIO</code> service name. */
    public static final String SERV_NAME_TDELDOMINIO = "TDELDOMINIO";
    /** <code>TDELDOMINIO</code> service alias. */
    public static final String SERV_ALIAS_TDELDOMINIO = "Quitar Dominio";
    /** Agents allowed to execute the service TDELDOMINIO **/
    public static final String TDELDOMINIO_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>agentexProductoTDELDOMINIOpthisAgentexProducto</code> inbound argument name. */
    public static final String ARG_NAME_TDELDOMINIO_AGENTEXPRODUCTOTDELDOMINIOPTHISAGENTEXPRODUCTO = "p_thisAgentexProducto";
    /** <code>agentexProductoTDELDOMINIOpthisAgentexProducto</code> inbound argument id. */
    public static final String ARG_ID_TDELDOMINIO_AGENTEXPRODUCTOTDELDOMINIOPTHISAGENTEXPRODUCTO = "Clas_1460560723968553Ser_12Arg_1_Alias";
    /** <code>agentexProductoTDELDOMINIOpthisAgentexProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_TDELDOMINIO_AGENTEXPRODUCTOTDELDOMINIOPTHISAGENTEXPRODUCTO = "Agente x Producto";
    /** <code>agentexProductoTDELDOMINIOptpevcDominio</code> inbound argument name. */
    public static final String ARG_NAME_TDELDOMINIO_AGENTEXPRODUCTOTDELDOMINIOPTPEVCDOMINIO = "pt_p_evcDominio";
    /** <code>agentexProductoTDELDOMINIOptpevcDominio</code> inbound argument id. */
    public static final String ARG_ID_TDELDOMINIO_AGENTEXPRODUCTOTDELDOMINIOPTPEVCDOMINIO = "Clas_1460560723968553Ser_12Arg_2_Alias";
    /** <code>agentexProductoTDELDOMINIOptpevcDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TDELDOMINIO_AGENTEXPRODUCTOTDELDOMINIOPTPEVCDOMINIO = "Dominios";
    // Service (TCARGARDOMINIOPLAN)
    /** <code>TCARGARDOMINIOPLAN</code> service id. */
    public static final String SERV_ID_TCARGARDOMINIOPLAN = "Clas_1460560723968553Ser_14_Alias";
    /** <code>TCARGARDOMINIOPLAN</code> service name. */
    public static final String SERV_NAME_TCARGARDOMINIOPLAN = "TCARGARDOMINIOPLAN";
    /** <code>TCARGARDOMINIOPLAN</code> service alias. */
    public static final String SERV_ALIAS_TCARGARDOMINIOPLAN = "TCARGARDOMINIOPLAN";
    /** Agents allowed to execute the service TCARGARDOMINIOPLAN **/
    public static final String TCARGARDOMINIOPLAN_SRVAGENTS = "";
    // Inbound arguments
    /** <code>agentexProductoTCARGARDOMINIOPLANpthisAgentexProducto</code> inbound argument name. */
    public static final String ARG_NAME_TCARGARDOMINIOPLAN_AGENTEXPRODUCTOTCARGARDOMINIOPLANPTHISAGENTEXPRODUCTO = "p_thisAgentexProducto";
    /** <code>agentexProductoTCARGARDOMINIOPLANpthisAgentexProducto</code> inbound argument id. */
    public static final String ARG_ID_TCARGARDOMINIOPLAN_AGENTEXPRODUCTOTCARGARDOMINIOPLANPTHISAGENTEXPRODUCTO = "Clas_1460560723968553Ser_14Arg_1_Alias";
    /** <code>agentexProductoTCARGARDOMINIOPLANpthisAgentexProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCARGARDOMINIOPLAN_AGENTEXPRODUCTOTCARGARDOMINIOPLANPTHISAGENTEXPRODUCTO = "Agente x Producto";
    /** <code>agentexProductoTCARGARDOMINIOPLANptCodLegalPlan</code> inbound argument name. */
    public static final String ARG_NAME_TCARGARDOMINIOPLAN_AGENTEXPRODUCTOTCARGARDOMINIOPLANPTCODLEGALPLAN = "ptCodLegalPlan";
    /** <code>agentexProductoTCARGARDOMINIOPLANptCodLegalPlan</code> inbound argument id. */
    public static final String ARG_ID_TCARGARDOMINIOPLAN_AGENTEXPRODUCTOTCARGARDOMINIOPLANPTCODLEGALPLAN = "Clas_1460560723968553Ser_14Arg_3_Alias";
    /** <code>agentexProductoTCARGARDOMINIOPLANptCodLegalPlan</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCARGARDOMINIOPLAN_AGENTEXPRODUCTOTCARGARDOMINIOPLANPTCODLEGALPLAN = "ptCodLegalPlan";
    /** <code>agentexProductoTCARGARDOMINIOPLANptAccion</code> inbound argument name. */
    public static final String ARG_NAME_TCARGARDOMINIOPLAN_AGENTEXPRODUCTOTCARGARDOMINIOPLANPTACCION = "ptAccion";
    /** <code>agentexProductoTCARGARDOMINIOPLANptAccion</code> inbound argument id. */
    public static final String ARG_ID_TCARGARDOMINIOPLAN_AGENTEXPRODUCTOTCARGARDOMINIOPLANPTACCION = "Clas_1460560723968553Ser_14Arg_4_Alias";
    /** <code>agentexProductoTCARGARDOMINIOPLANptAccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCARGARDOMINIOPLAN_AGENTEXPRODUCTOTCARGARDOMINIOPLANPTACCION = "ptAccion";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_AGENTEXPRODUCTOCODIGO.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_AGENTEXPRODUCTOFECHAINICIO.toUpperCase(), Constants.Type.DATETIME.getTypeName());
        attributeTypes.put(ATTR_NAME_AGENTEXPRODUCTOFECHAFIN.toUpperCase(), Constants.Type.DATETIME.getTypeName());
        attributeTypes.put(ATTR_NAME_AGENTEXPRODUCTODRVVIGENTE.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_AGENTEXPRODUCTOTODOSDOMINIOS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_AGENTEXPRODUCTOID.toUpperCase(), AGENTEXPRODUCTOID_AGENTS);
    	attributeAgents.put(ATTR_NAME_AGENTEXPRODUCTOCODIGO.toUpperCase(), AGENTEXPRODUCTOCODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_AGENTEXPRODUCTOFECHAINICIO.toUpperCase(), AGENTEXPRODUCTOFECHAINICIO_AGENTS);
    	attributeAgents.put(ATTR_NAME_AGENTEXPRODUCTOFECHAFIN.toUpperCase(), AGENTEXPRODUCTOFECHAFIN_AGENTS);
    	attributeAgents.put(ATTR_NAME_AGENTEXPRODUCTODRVVIGENTE.toUpperCase(), AGENTEXPRODUCTODRVVIGENTE_AGENTS);
    	attributeAgents.put(ATTR_NAME_AGENTEXPRODUCTOTODOSDOMINIOS.toUpperCase(), AGENTEXPRODUCTOTODOSDOMINIOS_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_PRODUCTOT.toUpperCase(), PRODUCTOT_AGENTS);
        roleAgents.put(ROLE_NAME_ASESOR.toUpperCase(), ASESOR_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'AgentexProducto', it returns the identification keys
     * - If className is a facet of the inheritance net of 'AgentexProducto', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ROLE_NAME_ASESOR + "." + AsesorConstants.ATTR_FIELD_FUNCIONARIOID);
            returnList.add(ATTR_FIELD_AGENTEXPRODUCTOID);
        }
        // Facet 'AgentexProducto' (This facet)
        if (AgentexProductoConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ROLE_NAME_ASESOR + "." + AsesorConstants.ATTR_FIELD_FUNCIONARIOID);
            returnList.add(ATTR_FIELD_AGENTEXPRODUCTOID);
        }
        return returnList;
    }
}
