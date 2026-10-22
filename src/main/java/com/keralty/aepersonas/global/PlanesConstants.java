package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>Planes</code> model class.
 */
public final class PlanesConstants {

    private PlanesConstants() {

    }

    // Class
    /** <code>Planes</code> class id. */
    public static final String CLASS_ID = "Clas_1431695392768502_Alias";
    /** <code>Planes</code> class name. */
    public static final String CLASS_NAME = "Planes";
    /** <code>Planes</code> class alias. */
    public static final String CLASS_ALIAS = "Plan";
    /** <code>Planes</code> class table name. */
    public static final String TBL_NAME = "Planes";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "planesPlan,productosProducto,planesNombre,planesEsBancoRep,planesCodigoLegal,planesAceptaPreexistencias,planesEsVoluntario,planesInicioContDiaUno";

    public static final String DSICPLAN = "IC_Plan";
    public static final String DSDSPLANPIU = "DS_Plan_PIU";
    public static final String DSDSPLANESDAFILIACION = "DS_PlanesDAfiliacion";
    

    // Attribute (planesPlan)
    /** <code>planesPlan</code> attribute id. */
    public static final String ATTR_ID_PLANESPLAN = "Clas_1431695392768502Atr_1_Alias";
    /** <code>planesPlan</code> attribute name. */
    public static final String ATTR_NAME_PLANESPLAN = "planesPlan";
    /** <code>planesPlan</code> attribute alias. */
    public static final String ATTR_ALIAS_PLANESPLAN = "Plan";

    /** <code>planesPlan</code> attribute facet sequence. */
    public static final String PATH_FACETS_PLANESPLAN = "";
    /** Agents allowed to view the attribute planesPlan **/
    public static final String PLANESPLAN_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,UsuarioSistemaExterno";
    // Attribute (planesNombre)
    /** <code>planesNombre</code> attribute id. */
    public static final String ATTR_ID_PLANESNOMBRE = "Clas_1431695392768502Atr_2_Alias";
    /** <code>planesNombre</code> attribute name. */
    public static final String ATTR_NAME_PLANESNOMBRE = "planesNombre";
    /** <code>planesNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_PLANESNOMBRE = "Nombre";

    /** <code>planesNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_PLANESNOMBRE = "";
    /** Agents allowed to view the attribute planesNombre **/
    public static final String PLANESNOMBRE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (planesEsBancoRep)
    /** <code>planesEsBancoRep</code> attribute id. */
    public static final String ATTR_ID_PLANESESBANCOREP = "Clas_1431695392768502Atr_3_Alias";
    /** <code>planesEsBancoRep</code> attribute name. */
    public static final String ATTR_NAME_PLANESESBANCOREP = "planesEsBancoRep";
    /** <code>planesEsBancoRep</code> attribute alias. */
    public static final String ATTR_ALIAS_PLANESESBANCOREP = "Es banco república";

    /** <code>planesEsBancoRep</code> attribute facet sequence. */
    public static final String PATH_FACETS_PLANESESBANCOREP = "";
    /** Agents allowed to view the attribute planesEsBancoRep **/
    public static final String PLANESESBANCOREP_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (planesCodigoLegal)
    /** <code>planesCodigoLegal</code> attribute id. */
    public static final String ATTR_ID_PLANESCODIGOLEGAL = "Clas_1431695392768502Atr_4_Alias";
    /** <code>planesCodigoLegal</code> attribute name. */
    public static final String ATTR_NAME_PLANESCODIGOLEGAL = "planesCodigoLegal";
    /** <code>planesCodigoLegal</code> attribute alias. */
    public static final String ATTR_ALIAS_PLANESCODIGOLEGAL = "Código Legal";

    /** <code>planesCodigoLegal</code> attribute facet sequence. */
    public static final String PATH_FACETS_PLANESCODIGOLEGAL = "";
    /** Agents allowed to view the attribute planesCodigoLegal **/
    public static final String PLANESCODIGOLEGAL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (planesAceptaPreexistencias)
    /** <code>planesAceptaPreexistencias</code> attribute id. */
    public static final String ATTR_ID_PLANESACEPTAPREEXISTENCIAS = "Clas_1431695392768502Atr_5_Alias";
    /** <code>planesAceptaPreexistencias</code> attribute name. */
    public static final String ATTR_NAME_PLANESACEPTAPREEXISTENCIAS = "planesAceptaPreexistencias";
    /** <code>planesAceptaPreexistencias</code> attribute alias. */
    public static final String ATTR_ALIAS_PLANESACEPTAPREEXISTENCIAS = "Acepta preexistencias";

    /** <code>planesAceptaPreexistencias</code> attribute facet sequence. */
    public static final String PATH_FACETS_PLANESACEPTAPREEXISTENCIAS = "";
    /** Agents allowed to view the attribute planesAceptaPreexistencias **/
    public static final String PLANESACEPTAPREEXISTENCIAS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (planesEsVoluntario)
    /** <code>planesEsVoluntario</code> attribute id. */
    public static final String ATTR_ID_PLANESESVOLUNTARIO = "Clas_1431695392768502Atr_6_Alias";
    /** <code>planesEsVoluntario</code> attribute name. */
    public static final String ATTR_NAME_PLANESESVOLUNTARIO = "planesEsVoluntario";
    /** <code>planesEsVoluntario</code> attribute alias. */
    public static final String ATTR_ALIAS_PLANESESVOLUNTARIO = "Es Voluntario";

    /** <code>planesEsVoluntario</code> attribute facet sequence. */
    public static final String PATH_FACETS_PLANESESVOLUNTARIO = "";
    /** Agents allowed to view the attribute planesEsVoluntario **/
    public static final String PLANESESVOLUNTARIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (planesInicioContDiaUno)
    /** <code>planesInicioContDiaUno</code> attribute id. */
    public static final String ATTR_ID_PLANESINICIOCONTDIAUNO = "Clas_1431695392768502Atr_7_Alias";
    /** <code>planesInicioContDiaUno</code> attribute name. */
    public static final String ATTR_NAME_PLANESINICIOCONTDIAUNO = "planesInicioContDiaUno";
    /** <code>planesInicioContDiaUno</code> attribute alias. */
    public static final String ATTR_ALIAS_PLANESINICIOCONTDIAUNO = "Inicio de contratación día uno";

    /** <code>planesInicioContDiaUno</code> attribute facet sequence. */
    public static final String PATH_FACETS_PLANESINICIOCONTDIAUNO = "";
    /** Agents allowed to view the attribute planesInicioContDiaUno **/
    public static final String PLANESINICIOCONTDIAUNO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Plan)
    /** <code>Plan</code> field name. */
    public static final String FLD_PLANESPLAN = "Plan";    
    /** <code>planesPlan</code> attribute field name. */
    public static final String ATTR_FIELD_PLANESPLAN = "planesPlan";
    // Field (Producto)
    /** <code>Producto</code> field name. */
    public static final String FLD_PRODUCTOSPRODUCTO = "Producto";    
    /** <code>ProductoT.productosProducto</code> attribute field name. */
    public static final String ATTR_FIELD_PRODUCTOT_PRODUCTOSPRODUCTO = "productosProducto";
    // Field (Nombre)
    /** <code>Nombre</code> field name. */
    public static final String FLD_PLANESNOMBRE = "Nombre";    
    /** <code>Nombre</code> field length. */
    public static final int FLD_PLANESNOMBRELENGTH = 150;
    /** <code>planesNombre</code> attribute field name. */
    public static final String ATTR_FIELD_PLANESNOMBRE = "planesNombre";
    // Field (EsBancoRep)
    /** <code>EsBancoRep</code> field name. */
    public static final String FLD_PLANESESBANCOREP = "EsBancoRep";    
    /** <code>planesEsBancoRep</code> attribute field name. */
    public static final String ATTR_FIELD_PLANESESBANCOREP = "planesEsBancoRep";
    // Field (CodigoLegal)
    /** <code>CodigoLegal</code> field name. */
    public static final String FLD_PLANESCODIGOLEGAL = "CodigoLegal";    
    /** <code>CodigoLegal</code> field length. */
    public static final int FLD_PLANESCODIGOLEGALLENGTH = 10;
    /** <code>planesCodigoLegal</code> attribute field name. */
    public static final String ATTR_FIELD_PLANESCODIGOLEGAL = "planesCodigoLegal";
    // Field (AceptaPreexistencias)
    /** <code>AceptaPreexistencias</code> field name. */
    public static final String FLD_PLANESACEPTAPREEXISTENCIAS = "AceptaPreexistencias";    
    /** <code>planesAceptaPreexistencias</code> attribute field name. */
    public static final String ATTR_FIELD_PLANESACEPTAPREEXISTENCIAS = "planesAceptaPreexistencias";
    // Field (EsVoluntario)
    /** <code>EsVoluntario</code> field name. */
    public static final String FLD_PLANESESVOLUNTARIO = "EsVoluntario";    
    /** <code>planesEsVoluntario</code> attribute field name. */
    public static final String ATTR_FIELD_PLANESESVOLUNTARIO = "planesEsVoluntario";
    // Field (InicioContDiaUno)
    /** <code>InicioContDiaUno</code> field name. */
    public static final String FLD_PLANESINICIOCONTDIAUNO = "InicioContDiaUno";    
    /** <code>planesInicioContDiaUno</code> attribute field name. */
    public static final String ATTR_FIELD_PLANESINICIOCONTDIAUNO = "planesInicioContDiaUno";

    // Component role (ProductoT)
    /** <code>ProductoT</code> role id. */
    public static final String ROLE_ID_PRODUCTOT = "Agr_1431696441344041_Alias";
    /** <code>ProductoT</code> role name. */
    public static final String ROLE_NAME_PRODUCTOT = "productoT";
    /** <code>ProductoT</code> role alias. */
    public static final String ROLE_ALIAS_PRODUCTOT = "ProductoT";

    /** <code>ProductoT</code> inverse role name. */
    public static final String ROLE_INVNAME_PRODUCTOT = ProductosConstants.ROLE_NAME_PLANES;
    /** <code>ProductoT</code> role facet sequence. */
    public static final String PATH_FACETS_PRODUCTOT = "";
    /** <code>ProductoT</code> role target class. */
    public static final String ROLE_TARGET_PRODUCTOT = ProductosConstants.CLASS_NAME;

    /** Agents allowed to navigate through ProductoT **/
    public static final String PRODUCTOT_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Compound role (Dominios)
    /** <code>Dominios</code> role id. */
    public static final String ROLE_ID_DOMINIOS = "Agr_1431701422080325_Alias";
    /** <code>Dominios</code> role name. */
    public static final String ROLE_NAME_DOMINIOS = "dominios";
    /** <code>PlanT</code> role alias. */
    public static final String ROLE_ALIAS_DOMINIOS = "Dominios";


    /** <code>Dominios</code> inverse role name. */
    public static final String ROLE_INVNAME_DOMINIOS = DominioConstants.ROLE_NAME_PLANT;
    /** <code>Dominios</code> role facet sequence. */
    public static final String PATH_FACETS_DOMINIOS = "";
    /** <code>Dominios</code> role target class. */
    public static final String ROLE_TARGET_DOMINIOS = DominioConstants.CLASS_NAME;
    /** Agents allowed to navigate through Dominios **/
    public static final String DOMINIOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (Tarifas)
    /** <code>Tarifas</code> role id. */
    public static final String ROLE_ID_TARIFAS = "Agr_1431715053568180_Alias";
    /** <code>Tarifas</code> role name. */
    public static final String ROLE_NAME_TARIFAS = "tarifas";
    /** <code>PlanT</code> role alias. */
    public static final String ROLE_ALIAS_TARIFAS = "Tarifas";


    /** <code>Tarifas</code> inverse role name. */
    public static final String ROLE_INVNAME_TARIFAS = TarifaConstants.ROLE_NAME_PLANT;
    /** <code>Tarifas</code> role facet sequence. */
    public static final String PATH_FACETS_TARIFAS = "";
    /** <code>Tarifas</code> role target class. */
    public static final String ROLE_TARGET_TARIFAS = TarifaConstants.CLASS_NAME;
    /** Agents allowed to navigate through Tarifas **/
    public static final String TARIFAS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (GruposAsociados)
    /** <code>GruposAsociados</code> role id. */
    public static final String ROLE_ID_GRUPOSASOCIADOS = "Agr_1431875354624351_Alias";
    /** <code>GruposAsociados</code> role name. */
    public static final String ROLE_NAME_GRUPOSASOCIADOS = "gruposAsociados";
    /** <code>PlanT</code> role alias. */
    public static final String ROLE_ALIAS_GRUPOSASOCIADOS = "Grupos asociados";


    /** <code>GruposAsociados</code> inverse role name. */
    public static final String ROLE_INVNAME_GRUPOSASOCIADOS = GrupoAsociadoConstants.ROLE_NAME_PLANT;
    /** <code>GruposAsociados</code> role facet sequence. */
    public static final String PATH_FACETS_GRUPOSASOCIADOS = "";
    /** <code>GruposAsociados</code> role target class. */
    public static final String ROLE_TARGET_GRUPOSASOCIADOS = GrupoAsociadoConstants.CLASS_NAME;
    /** Agents allowed to navigate through GruposAsociados **/
    public static final String GRUPOSASOCIADOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (TiposIVA)
    /** <code>TiposIVA</code> role id. */
    public static final String ROLE_ID_TIPOSIVA = "Agr_1431882563584809_Alias";
    /** <code>TiposIVA</code> role name. */
    public static final String ROLE_NAME_TIPOSIVA = "tiposIVA";
    /** <code>PlanT</code> role alias. */
    public static final String ROLE_ALIAS_TIPOSIVA = "Tipos I.V.A";


    /** <code>TiposIVA</code> inverse role name. */
    public static final String ROLE_INVNAME_TIPOSIVA = TipoIVAConstants.ROLE_NAME_PLANT;
    /** <code>TiposIVA</code> role facet sequence. */
    public static final String PATH_FACETS_TIPOSIVA = "";
    /** <code>TiposIVA</code> role target class. */
    public static final String ROLE_TARGET_TIPOSIVA = TipoIVAConstants.CLASS_NAME;
    /** Agents allowed to navigate through TiposIVA **/
    public static final String TIPOSIVA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (AESOLICITUDES)
    /** <code>AESOLICITUDES</code> role id. */
    public static final String ROLE_ID_AESOLICITUDES = "Agr_1431956226048544_Alias";
    /** <code>AESOLICITUDES</code> role name. */
    public static final String ROLE_NAME_AESOLICITUDES = "aESOLICITUDES";
    /** <code>PlanT</code> role alias. */
    public static final String ROLE_ALIAS_AESOLICITUDES = "Solicidudes";


    /** <code>AESOLICITUDES</code> inverse role name. */
    public static final String ROLE_INVNAME_AESOLICITUDES = AesolicitudesConstants.ROLE_NAME_PLANT;
    /** <code>AESOLICITUDES</code> role facet sequence. */
    public static final String PATH_FACETS_AESOLICITUDES = "";
    /** <code>AESOLICITUDES</code> role target class. */
    public static final String ROLE_TARGET_AESOLICITUDES = AesolicitudesConstants.CLASS_NAME;
    /** Agents allowed to navigate through AESOLICITUDES **/
    public static final String AESOLICITUDES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (ContratosC)
    /** <code>ContratosC</code> role id. */
    public static final String ROLE_ID_CONTRATOSC = "Agr_1473095401472816_Alias";
    /** <code>ContratosC</code> role name. */
    public static final String ROLE_NAME_CONTRATOSC = "contratosC";
    /** <code>PlanC</code> role alias. */
    public static final String ROLE_ALIAS_CONTRATOSC = "Contratos";


    /** <code>ContratosC</code> inverse role name. */
    public static final String ROLE_INVNAME_CONTRATOSC = ContratoCConstants.ROLE_NAME_PLANC;
    /** <code>ContratosC</code> role facet sequence. */
    public static final String PATH_FACETS_CONTRATOSC = "";
    /** <code>ContratosC</code> role target class. */
    public static final String ROLE_TARGET_CONTRATOSC = ContratoCConstants.CLASS_NAME;
    /** Agents allowed to navigate through ContratosC **/
    public static final String CONTRATOSC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (Afiliaciones)
    /** <code>Afiliaciones</code> role id. */
    public static final String ROLE_ID_AFILIACIONES = "Agr_1537781137408464_Alias";
    /** <code>Afiliaciones</code> role name. */
    public static final String ROLE_NAME_AFILIACIONES = "afiliaciones";
    /** <code>Planes</code> role alias. */
    public static final String ROLE_ALIAS_AFILIACIONES = "Afiliaciones";


    /** <code>Afiliaciones</code> inverse role name. */
    public static final String ROLE_INVNAME_AFILIACIONES = AfiliacionesConstants.ROLE_NAME_PLANES;
    /** <code>Afiliaciones</code> role facet sequence. */
    public static final String PATH_FACETS_AFILIACIONES = "";
    /** <code>Afiliaciones</code> role target class. */
    public static final String ROLE_TARGET_AFILIACIONES = AfiliacionesConstants.CLASS_NAME;
    /** Agents allowed to navigate through Afiliaciones **/
    public static final String AFILIACIONES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (SolicitudesNovedad)
    /** <code>SolicitudesNovedad</code> role id. */
    public static final String ROLE_ID_SOLICITUDESNOVEDAD = "Agr_1581421953024930_Alias";
    /** <code>SolicitudesNovedad</code> role name. */
    public static final String ROLE_NAME_SOLICITUDESNOVEDAD = "solicitudesNovedad";
    /** <code>PlanT</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUDESNOVEDAD = "Solicitudes de Novedad";


    /** <code>SolicitudesNovedad</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUDESNOVEDAD = SolicitudNovedadConstants.ROLE_NAME_PLANT;
    /** <code>SolicitudesNovedad</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUDESNOVEDAD = "";
    /** <code>SolicitudesNovedad</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUDESNOVEDAD = SolicitudNovedadConstants.CLASS_NAME;
    /** Agents allowed to navigate through SolicitudesNovedad **/
    public static final String SOLICITUDESNOVEDAD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431695392768502Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear plan";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>planescrearpagrProductoT</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PLANESCREARPAGRPRODUCTOT = "p_agrProductoT";
    /** <code>planescrearpagrProductoT</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PLANESCREARPAGRPRODUCTOT = "Clas_1431695392768502Ser_1Arg_7_Alias";
    /** <code>planescrearpagrProductoT</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PLANESCREARPAGRPRODUCTOT = "ProductoT";
    /** <code>planescrearpatrPlan</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PLANESCREARPATRPLAN = "p_atrPlan";
    /** <code>planescrearpatrPlan</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PLANESCREARPATRPLAN = "Clas_1431695392768502Ser_1Arg_1_Alias";
    /** <code>planescrearpatrPlan</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PLANESCREARPATRPLAN = "Plan";
    /** <code>planescrearpatrNombre</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PLANESCREARPATRNOMBRE = "p_atrNombre";
    /** <code>planescrearpatrNombre</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PLANESCREARPATRNOMBRE = "Clas_1431695392768502Ser_1Arg_2_Alias";
    /** <code>planescrearpatrNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PLANESCREARPATRNOMBRE = "Nombre";
    /** <code>planescrearpatrEsBancoRep</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PLANESCREARPATRESBANCOREP = "p_atrEsBancoRep";
    /** <code>planescrearpatrEsBancoRep</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PLANESCREARPATRESBANCOREP = "Clas_1431695392768502Ser_1Arg_3_Alias";
    /** <code>planescrearpatrEsBancoRep</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PLANESCREARPATRESBANCOREP = "Es banco república";
    /** <code>planescrearpatrCodigoLegal</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PLANESCREARPATRCODIGOLEGAL = "p_atrCodigoLegal";
    /** <code>planescrearpatrCodigoLegal</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PLANESCREARPATRCODIGOLEGAL = "Clas_1431695392768502Ser_1Arg_5_Alias";
    /** <code>planescrearpatrCodigoLegal</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PLANESCREARPATRCODIGOLEGAL = "Código Legal";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431695392768502Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar plan";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Preconditions
    /** <code>eliminar</code> precondition 0 id. */
    public static final String PRE_ID_ELIMINAR_0 = "Clas_1431695392768502Pre_1_MsgError";
    /** <code>eliminar</code> precondition 1 id. */
    public static final String PRE_ID_ELIMINAR_1 = "Clas_1431695392768502Pre_2_MsgError";
    /** <code>eliminar</code> precondition 2 id. */
    public static final String PRE_ID_ELIMINAR_2 = "Clas_1431695392768502Pre_3_MsgError";
    /** <code>eliminar</code> precondition 3 id. */
    public static final String PRE_ID_ELIMINAR_3 = "Clas_1431695392768502Pre_4_MsgError";
    // Inbound arguments
    /** <code>planeseliminarpthisPlan</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_PLANESELIMINARPTHISPLAN = "p_thisPlan";
    /** <code>planeseliminarpthisPlan</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_PLANESELIMINARPTHISPLAN = "Clas_1431695392768502Ser_2Arg_1_Alias";
    /** <code>planeseliminarpthisPlan</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_PLANESELIMINARPTHISPLAN = "Plan";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1431695392768502Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar plan";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>planesmodificarpthisPlan</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PLANESMODIFICARPTHISPLAN = "p_thisPlan";
    /** <code>planesmodificarpthisPlan</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PLANESMODIFICARPTHISPLAN = "Clas_1431695392768502Ser_3Arg_1_Alias";
    /** <code>planesmodificarpthisPlan</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PLANESMODIFICARPTHISPLAN = "Plan";
    /** <code>planesmodificarpEsBancoRep</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PLANESMODIFICARPESBANCOREP = "p_EsBancoRep";
    /** <code>planesmodificarpEsBancoRep</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PLANESMODIFICARPESBANCOREP = "Clas_1431695392768502Ser_3Arg_2_Alias";
    /** <code>planesmodificarpEsBancoRep</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PLANESMODIFICARPESBANCOREP = "Es banco república";
    /** <code>planesmodificarpAceptaPreexistencias</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PLANESMODIFICARPACEPTAPREEXISTENCIAS = "p_AceptaPreexistencias";
    /** <code>planesmodificarpAceptaPreexistencias</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PLANESMODIFICARPACEPTAPREEXISTENCIAS = "Clas_1431695392768502Ser_3Arg_3_Alias";
    /** <code>planesmodificarpAceptaPreexistencias</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PLANESMODIFICARPACEPTAPREEXISTENCIAS = "Acepta preexistencias";
    /** <code>planesmodificarpEsVoluntario</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PLANESMODIFICARPESVOLUNTARIO = "p_EsVoluntario";
    /** <code>planesmodificarpEsVoluntario</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PLANESMODIFICARPESVOLUNTARIO = "Clas_1431695392768502Ser_3Arg_4_Alias";
    /** <code>planesmodificarpEsVoluntario</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PLANESMODIFICARPESVOLUNTARIO = "Es Voluntario";
    /** <code>planesmodificarpInicioContDiaUno</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PLANESMODIFICARPINICIOCONTDIAUNO = "p_InicioContDiaUno";
    /** <code>planesmodificarpInicioContDiaUno</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PLANESMODIFICARPINICIOCONTDIAUNO = "Clas_1431695392768502Ser_3Arg_5_Alias";
    /** <code>planesmodificarpInicioContDiaUno</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PLANESMODIFICARPINICIOCONTDIAUNO = "Inicio de contratación día uno";
    // Service (sincronizar)
    /** <code>sincronizar</code> service id. */
    public static final String SERV_ID_SINCRONIZAR = "Clas_1431695392768502Ser_4_Alias";
    /** <code>sincronizar</code> service name. */
    public static final String SERV_NAME_SINCRONIZAR = "sincronizar";
    /** <code>sincronizar</code> service alias. */
    public static final String SERV_ALIAS_SINCRONIZAR = "sincronizar";
    /** Agents allowed to execute the service sincronizar **/
    public static final String SINCRONIZAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>planessincronizarpthisPlan</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_PLANESSINCRONIZARPTHISPLAN = "p_thisPlan";
    /** <code>planessincronizarpthisPlan</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_PLANESSINCRONIZARPTHISPLAN = "Clas_1431695392768502Ser_4Arg_1_Alias";
    /** <code>planessincronizarpthisPlan</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_PLANESSINCRONIZARPTHISPLAN = "Plan";
    /** <code>planessincronizarpNombre</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_PLANESSINCRONIZARPNOMBRE = "p_Nombre";
    /** <code>planessincronizarpNombre</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_PLANESSINCRONIZARPNOMBRE = "Clas_1431695392768502Ser_4Arg_2_Alias";
    /** <code>planessincronizarpNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_PLANESSINCRONIZARPNOMBRE = "Nombre";
    /** <code>planessincronizarpCodigoLegal</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_PLANESSINCRONIZARPCODIGOLEGAL = "p_CodigoLegal";
    /** <code>planessincronizarpCodigoLegal</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_PLANESSINCRONIZARPCODIGOLEGAL = "Clas_1431695392768502Ser_4Arg_4_Alias";
    /** <code>planessincronizarpCodigoLegal</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_PLANESSINCRONIZARPCODIGOLEGAL = "Código Legal";
    // Service (CambPlanDeProducto)
    /** <code>CambPlanDeProducto</code> service id. */
    public static final String SERV_ID_CAMBPLANDEPRODUCTO = "Clas_1431695392768502Ser_6_Alias";
    /** <code>CambPlanDeProducto</code> service name. */
    public static final String SERV_NAME_CAMBPLANDEPRODUCTO = "CambPlanDeProducto";
    /** <code>CambPlanDeProducto</code> service alias. */
    public static final String SERV_ALIAS_CAMBPLANDEPRODUCTO = "CambPlanDeProducto";
    /** Agents allowed to execute the service CambPlanDeProducto **/
    public static final String CAMBPLANDEPRODUCTO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>planesCambPlanDeProductopthisPlan</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPLANDEPRODUCTO_PLANESCAMBPLANDEPRODUCTOPTHISPLAN = "p_thisPlan";
    /** <code>planesCambPlanDeProductopthisPlan</code> inbound argument id. */
    public static final String ARG_ID_CAMBPLANDEPRODUCTO_PLANESCAMBPLANDEPRODUCTOPTHISPLAN = "Clas_1431695392768502Ser_6Arg_1_Alias";
    /** <code>planesCambPlanDeProductopthisPlan</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPLANDEPRODUCTO_PLANESCAMBPLANDEPRODUCTOPTHISPLAN = "Planes";
    /** <code>planesCambPlanDeProductopevcProductos</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPLANDEPRODUCTO_PLANESCAMBPLANDEPRODUCTOPEVCPRODUCTOS = "p_evcProductos";
    /** <code>planesCambPlanDeProductopevcProductos</code> inbound argument id. */
    public static final String ARG_ID_CAMBPLANDEPRODUCTO_PLANESCAMBPLANDEPRODUCTOPEVCPRODUCTOS = "Clas_1431695392768502Ser_6Arg_2_Alias";
    /** <code>planesCambPlanDeProductopevcProductos</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPLANDEPRODUCTO_PLANESCAMBPLANDEPRODUCTOPEVCPRODUCTOS = "ProductoT";
    // Service (CambPlanTarifa)
    /** <code>CambPlanTarifa</code> service id. */
    public static final String SERV_ID_CAMBPLANTARIFA = "Clas_1431695392768502Ser_7_Alias";
    /** <code>CambPlanTarifa</code> service name. */
    public static final String SERV_NAME_CAMBPLANTARIFA = "CambPlanTarifa";
    /** <code>CambPlanTarifa</code> service alias. */
    public static final String SERV_ALIAS_CAMBPLANTARIFA = "CambPlanTarifa";
    /** Agents allowed to execute the service CambPlanTarifa **/
    public static final String CAMBPLANTARIFA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>planesCambPlanTarifapthisPlan</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPLANTARIFA_PLANESCAMBPLANTARIFAPTHISPLAN = "p_thisPlan";
    /** <code>planesCambPlanTarifapthisPlan</code> inbound argument id. */
    public static final String ARG_ID_CAMBPLANTARIFA_PLANESCAMBPLANTARIFAPTHISPLAN = "Clas_1431695392768502Ser_7Arg_1_Alias";
    /** <code>planesCambPlanTarifapthisPlan</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPLANTARIFA_PLANESCAMBPLANTARIFAPTHISPLAN = "PlanT";
    /** <code>planesCambPlanTarifapevcTarifa</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPLANTARIFA_PLANESCAMBPLANTARIFAPEVCTARIFA = "p_evcTarifa";
    /** <code>planesCambPlanTarifapevcTarifa</code> inbound argument id. */
    public static final String ARG_ID_CAMBPLANTARIFA_PLANESCAMBPLANTARIFAPEVCTARIFA = "Clas_1431695392768502Ser_7Arg_2_Alias";
    /** <code>planesCambPlanTarifapevcTarifa</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPLANTARIFA_PLANESCAMBPLANTARIFAPEVCTARIFA = "Tarifas";
    // Service (CambPlanGrupoAsociado)
    /** <code>CambPlanGrupoAsociado</code> service id. */
    public static final String SERV_ID_CAMBPLANGRUPOASOCIADO = "Clas_1431695392768502Ser_8_Alias";
    /** <code>CambPlanGrupoAsociado</code> service name. */
    public static final String SERV_NAME_CAMBPLANGRUPOASOCIADO = "CambPlanGrupoAsociado";
    /** <code>CambPlanGrupoAsociado</code> service alias. */
    public static final String SERV_ALIAS_CAMBPLANGRUPOASOCIADO = "CambPlanGrupoAsociado";
    /** Agents allowed to execute the service CambPlanGrupoAsociado **/
    public static final String CAMBPLANGRUPOASOCIADO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>planesCambPlanGrupoAsociadopthisPlan</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPLANGRUPOASOCIADO_PLANESCAMBPLANGRUPOASOCIADOPTHISPLAN = "p_thisPlan";
    /** <code>planesCambPlanGrupoAsociadopthisPlan</code> inbound argument id. */
    public static final String ARG_ID_CAMBPLANGRUPOASOCIADO_PLANESCAMBPLANGRUPOASOCIADOPTHISPLAN = "Clas_1431695392768502Ser_8Arg_1_Alias";
    /** <code>planesCambPlanGrupoAsociadopthisPlan</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPLANGRUPOASOCIADO_PLANESCAMBPLANGRUPOASOCIADOPTHISPLAN = "Plan";
    /** <code>planesCambPlanGrupoAsociadopevcGrupoAsociado</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPLANGRUPOASOCIADO_PLANESCAMBPLANGRUPOASOCIADOPEVCGRUPOASOCIADO = "p_evcGrupoAsociado";
    /** <code>planesCambPlanGrupoAsociadopevcGrupoAsociado</code> inbound argument id. */
    public static final String ARG_ID_CAMBPLANGRUPOASOCIADO_PLANESCAMBPLANGRUPOASOCIADOPEVCGRUPOASOCIADO = "Clas_1431695392768502Ser_8Arg_2_Alias";
    /** <code>planesCambPlanGrupoAsociadopevcGrupoAsociado</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPLANGRUPOASOCIADO_PLANESCAMBPLANGRUPOASOCIADOPEVCGRUPOASOCIADO = "Grupos asociados";
    // Service (chgPlanC)
    /** <code>chgPlanC</code> service id. */
    public static final String SERV_ID_CHGPLANC = "Clas_1431695392768502Ser_10_Alias";
    /** <code>chgPlanC</code> service name. */
    public static final String SERV_NAME_CHGPLANC = "chgPlanC";
    /** <code>chgPlanC</code> service alias. */
    public static final String SERV_ALIAS_CHGPLANC = "chgPlanC";
    /** Agents allowed to execute the service chgPlanC **/
    public static final String CHGPLANC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>planeschgPlanCpthisPlanes</code> inbound argument name. */
    public static final String ARG_NAME_CHGPLANC_PLANESCHGPLANCPTHISPLANES = "p_thisPlanes";
    /** <code>planeschgPlanCpthisPlanes</code> inbound argument id. */
    public static final String ARG_ID_CHGPLANC_PLANESCHGPLANCPTHISPLANES = "Clas_1431695392768502Ser_10Arg_1_Alias";
    /** <code>planeschgPlanCpthisPlanes</code> inbound argument alias. */
    public static final String ARG_ALIAS_CHGPLANC_PLANESCHGPLANCPTHISPLANES = "Plan";
    /** <code>planeschgPlanCpevcContratoC</code> inbound argument name. */
    public static final String ARG_NAME_CHGPLANC_PLANESCHGPLANCPEVCCONTRATOC = "p_evcContratoC";
    /** <code>planeschgPlanCpevcContratoC</code> inbound argument id. */
    public static final String ARG_ID_CHGPLANC_PLANESCHGPLANCPEVCCONTRATOC = "Clas_1431695392768502Ser_10Arg_2_Alias";
    /** <code>planeschgPlanCpevcContratoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_CHGPLANC_PLANESCHGPLANCPEVCCONTRATOC = "Contratos";
    // Service (InsPlan)
    /** <code>InsPlan</code> service id. */
    public static final String SERV_ID_INSPLAN = "Clas_1431695392768502Ser_11_Alias";
    /** <code>InsPlan</code> service name. */
    public static final String SERV_NAME_INSPLAN = "InsPlan";
    /** <code>InsPlan</code> service alias. */
    public static final String SERV_ALIAS_INSPLAN = "InsPlan";
    /** Agents allowed to execute the service InsPlan **/
    public static final String INSPLAN_SRVAGENTS = "";
    // Inbound arguments
    /** <code>planesInsPlanpthisPlanes</code> inbound argument name. */
    public static final String ARG_NAME_INSPLAN_PLANESINSPLANPTHISPLANES = "p_thisPlanes";
    /** <code>planesInsPlanpthisPlanes</code> inbound argument id. */
    public static final String ARG_ID_INSPLAN_PLANESINSPLANPTHISPLANES = "Clas_1431695392768502Ser_11Arg_1_Alias";
    /** <code>planesInsPlanpthisPlanes</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPLAN_PLANESINSPLANPTHISPLANES = "Planes";
    /** <code>planesInsPlanpevcAfiliaciones</code> inbound argument name. */
    public static final String ARG_NAME_INSPLAN_PLANESINSPLANPEVCAFILIACIONES = "p_evcAfiliaciones";
    /** <code>planesInsPlanpevcAfiliaciones</code> inbound argument id. */
    public static final String ARG_ID_INSPLAN_PLANESINSPLANPEVCAFILIACIONES = "Clas_1431695392768502Ser_11Arg_2_Alias";
    /** <code>planesInsPlanpevcAfiliaciones</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPLAN_PLANESINSPLANPEVCAFILIACIONES = "Afiliaciones";
    // Service (DelPlan)
    /** <code>DelPlan</code> service id. */
    public static final String SERV_ID_DELPLAN = "Clas_1431695392768502Ser_12_Alias";
    /** <code>DelPlan</code> service name. */
    public static final String SERV_NAME_DELPLAN = "DelPlan";
    /** <code>DelPlan</code> service alias. */
    public static final String SERV_ALIAS_DELPLAN = "Desasociar";
    /** Agents allowed to execute the service DelPlan **/
    public static final String DELPLAN_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>planesDelPlanpthisPlanes</code> inbound argument name. */
    public static final String ARG_NAME_DELPLAN_PLANESDELPLANPTHISPLANES = "p_thisPlanes";
    /** <code>planesDelPlanpthisPlanes</code> inbound argument id. */
    public static final String ARG_ID_DELPLAN_PLANESDELPLANPTHISPLANES = "Clas_1431695392768502Ser_12Arg_1_Alias";
    /** <code>planesDelPlanpthisPlanes</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPLAN_PLANESDELPLANPTHISPLANES = "Planes";
    /** <code>planesDelPlanpevcAfiliaciones</code> inbound argument name. */
    public static final String ARG_NAME_DELPLAN_PLANESDELPLANPEVCAFILIACIONES = "p_evcAfiliaciones";
    /** <code>planesDelPlanpevcAfiliaciones</code> inbound argument id. */
    public static final String ARG_ID_DELPLAN_PLANESDELPLANPEVCAFILIACIONES = "Clas_1431695392768502Ser_12Arg_2_Alias";
    /** <code>planesDelPlanpevcAfiliaciones</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPLAN_PLANESDELPLANPEVCAFILIACIONES = "Afiliaciones";
    // Service (TSINCRONIZAR)
    /** <code>TSINCRONIZAR</code> service id. */
    public static final String SERV_ID_TSINCRONIZAR = "Clas_1431695392768502Ser_5_Alias";
    /** <code>TSINCRONIZAR</code> service name. */
    public static final String SERV_NAME_TSINCRONIZAR = "TSINCRONIZAR";
    /** <code>TSINCRONIZAR</code> service alias. */
    public static final String SERV_ALIAS_TSINCRONIZAR = "TSINCRONIZAR";
    /** Agents allowed to execute the service TSINCRONIZAR **/
    public static final String TSINCRONIZAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>planesTSINCRONIZARpthisPlan</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_PLANESTSINCRONIZARPTHISPLAN = "p_thisPlan";
    /** <code>planesTSINCRONIZARpthisPlan</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_PLANESTSINCRONIZARPTHISPLAN = "Clas_1431695392768502Ser_5Arg_1_Alias";
    /** <code>planesTSINCRONIZARpthisPlan</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_PLANESTSINCRONIZARPTHISPLAN = "Plan";
    /** <code>planesTSINCRONIZARptpNombre</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_PLANESTSINCRONIZARPTPNOMBRE = "pt_p_Nombre";
    /** <code>planesTSINCRONIZARptpNombre</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_PLANESTSINCRONIZARPTPNOMBRE = "Clas_1431695392768502Ser_5Arg_2_Alias";
    /** <code>planesTSINCRONIZARptpNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_PLANESTSINCRONIZARPTPNOMBRE = "Nombre";
    /** <code>planesTSINCRONIZARptpevcProducto</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_PLANESTSINCRONIZARPTPEVCPRODUCTO = "pt_p_evcProducto";
    /** <code>planesTSINCRONIZARptpevcProducto</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_PLANESTSINCRONIZARPTPEVCPRODUCTO = "Clas_1431695392768502Ser_5Arg_3_Alias";
    /** <code>planesTSINCRONIZARptpevcProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_PLANESTSINCRONIZARPTPEVCPRODUCTO = "Producto";
    /** <code>planesTSINCRONIZARpCodigoLegal</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_PLANESTSINCRONIZARPCODIGOLEGAL = "p_CodigoLegal";
    /** <code>planesTSINCRONIZARpCodigoLegal</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_PLANESTSINCRONIZARPCODIGOLEGAL = "Clas_1431695392768502Ser_5Arg_4_Alias";
    /** <code>planesTSINCRONIZARpCodigoLegal</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_PLANESTSINCRONIZARPCODIGOLEGAL = "Código Legal";

    public static final String FILTER_NAME_FPLANVARIOS = "F_PlanVarios";
    public static final String VAR_NAME_FPLANVARIOS_VOPRODUCTO = "vo_Producto";
    public static final String VAR_NAME_FPLANVARIOS_VNOMBRE = "v_Nombre";
    public static final String VAR_NAME_FPLANVARIOS_VESBANCOREP = "v_EsBancoRep";
    public static final String VAR_NAME_FPLANVARIOS_VESVOLUNTARIO = "vEsVoluntario";
    public static final String FILTER_NAME_IFPLANCODIGO = "iF_PlanCodigo";
    public static final String VAR_NAME_IFPLANCODIGO_VCODIGO = "v_Codigo";
    public static final String FILTER_NAME_FPLANESPORCODLEGAL = "F_PlanesPorCodLegal";
    public static final String VAR_NAME_FPLANESPORCODLEGAL_VFCODIGOLEGAL = "vfCodigoLegal";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_PLANESNOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PLANESESBANCOREP.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PLANESCODIGOLEGAL.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PLANESACEPTAPREEXISTENCIAS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PLANESESVOLUNTARIO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PLANESINICIOCONTDIAUNO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_PLANESPLAN.toUpperCase(), PLANESPLAN_AGENTS);
    	attributeAgents.put(ATTR_NAME_PLANESNOMBRE.toUpperCase(), PLANESNOMBRE_AGENTS);
    	attributeAgents.put(ATTR_NAME_PLANESESBANCOREP.toUpperCase(), PLANESESBANCOREP_AGENTS);
    	attributeAgents.put(ATTR_NAME_PLANESCODIGOLEGAL.toUpperCase(), PLANESCODIGOLEGAL_AGENTS);
    	attributeAgents.put(ATTR_NAME_PLANESACEPTAPREEXISTENCIAS.toUpperCase(), PLANESACEPTAPREEXISTENCIAS_AGENTS);
    	attributeAgents.put(ATTR_NAME_PLANESESVOLUNTARIO.toUpperCase(), PLANESESVOLUNTARIO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PLANESINICIOCONTDIAUNO.toUpperCase(), PLANESINICIOCONTDIAUNO_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_PRODUCTOT.toUpperCase(), PRODUCTOT_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'Planes', it returns the identification keys
     * - If className is a facet of the inheritance net of 'Planes', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_PLANESPLAN);
        }
        // Facet 'Planes' (This facet)
        if (PlanesConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_PLANESPLAN);
        }
        return returnList;
    }
}
