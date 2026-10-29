package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>GrupoAsociado</code> model class.
 */
public final class GrupoAsociadoConstants {

    private GrupoAsociadoConstants() {

    }

    // Class
    /** <code>GrupoAsociado</code> class id. */
    public static final String CLASS_ID = "Clas_1431875354624341_Alias";
    /** <code>GrupoAsociado</code> class name. */
    public static final String CLASS_NAME = "GrupoAsociado";
    /** <code>GrupoAsociado</code> class alias. */
    public static final String CLASS_ALIAS = "Grupo Asociado";
    /** <code>GrupoAsociado</code> class table name. */
    public static final String TBL_NAME = "GrupoAsociado";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "grupoAsociadoCodigo,productosProducto,planesPlan,grupoAsociadoCodigoLegal,grupoAsociadoCodTarifaCORE,grupoAsociadoDescripcion,grupoAsociadoFIniVigencia,grupoAsociadoFFinVigencia,grupoAsociadoEstado,grupoAsociadoDisminucionCarencia";

    public static final String DSICGRUPOASOCIADO = "IC_GrupoAsociado";
    public static final String DSDSGRUPOASOCIADOPIU = "DS_GrupoAsociado_PIU";
    public static final String DSDSGRUPOASOCIADOPIUBUSQUEDA = "DS_GrupoAsociado_PIUBusqueda";
    

    // Attribute (grupoAsociadoCodigo)
    /** <code>grupoAsociadoCodigo</code> attribute id. */
    public static final String ATTR_ID_GRUPOASOCIADOCODIGO = "Clas_1431875354624341Atr_8_Alias";
    /** <code>grupoAsociadoCodigo</code> attribute name. */
    public static final String ATTR_NAME_GRUPOASOCIADOCODIGO = "grupoAsociadoCodigo";
    /** <code>grupoAsociadoCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_GRUPOASOCIADOCODIGO = "Código";

    /** <code>grupoAsociadoCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_GRUPOASOCIADOCODIGO = "";
    /** Agents allowed to view the attribute grupoAsociadoCodigo **/
    public static final String GRUPOASOCIADOCODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (grupoAsociadoCodigoLegal)
    /** <code>grupoAsociadoCodigoLegal</code> attribute id. */
    public static final String ATTR_ID_GRUPOASOCIADOCODIGOLEGAL = "Clas_1431875354624341Atr_1_Alias";
    /** <code>grupoAsociadoCodigoLegal</code> attribute name. */
    public static final String ATTR_NAME_GRUPOASOCIADOCODIGOLEGAL = "grupoAsociadoCodigoLegal";
    /** <code>grupoAsociadoCodigoLegal</code> attribute alias. */
    public static final String ATTR_ALIAS_GRUPOASOCIADOCODIGOLEGAL = "Código legal";

    /** <code>grupoAsociadoCodigoLegal</code> attribute facet sequence. */
    public static final String PATH_FACETS_GRUPOASOCIADOCODIGOLEGAL = "";
    /** Agents allowed to view the attribute grupoAsociadoCodigoLegal **/
    public static final String GRUPOASOCIADOCODIGOLEGAL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (grupoAsociadoCodTarifaCORE)
    /** <code>grupoAsociadoCodTarifaCORE</code> attribute id. */
    public static final String ATTR_ID_GRUPOASOCIADOCODTARIFACORE = "Clas_1431875354624341Atr_7_Alias";
    /** <code>grupoAsociadoCodTarifaCORE</code> attribute name. */
    public static final String ATTR_NAME_GRUPOASOCIADOCODTARIFACORE = "grupoAsociadoCodTarifaCORE";
    /** <code>grupoAsociadoCodTarifaCORE</code> attribute alias. */
    public static final String ATTR_ALIAS_GRUPOASOCIADOCODTARIFACORE = "Cod. Tarifa CORE";

    /** <code>grupoAsociadoCodTarifaCORE</code> attribute facet sequence. */
    public static final String PATH_FACETS_GRUPOASOCIADOCODTARIFACORE = "";
    /** Agents allowed to view the attribute grupoAsociadoCodTarifaCORE **/
    public static final String GRUPOASOCIADOCODTARIFACORE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (grupoAsociadoDescripcion)
    /** <code>grupoAsociadoDescripcion</code> attribute id. */
    public static final String ATTR_ID_GRUPOASOCIADODESCRIPCION = "Clas_1431875354624341Atr_2_Alias";
    /** <code>grupoAsociadoDescripcion</code> attribute name. */
    public static final String ATTR_NAME_GRUPOASOCIADODESCRIPCION = "grupoAsociadoDescripcion";
    /** <code>grupoAsociadoDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_GRUPOASOCIADODESCRIPCION = "Descripción";

    /** <code>grupoAsociadoDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_GRUPOASOCIADODESCRIPCION = "";
    /** Agents allowed to view the attribute grupoAsociadoDescripcion **/
    public static final String GRUPOASOCIADODESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (grupoAsociadoFIniVigencia)
    /** <code>grupoAsociadoFIniVigencia</code> attribute id. */
    public static final String ATTR_ID_GRUPOASOCIADOFINIVIGENCIA = "Clas_1431875354624341Atr_3_Alias";
    /** <code>grupoAsociadoFIniVigencia</code> attribute name. */
    public static final String ATTR_NAME_GRUPOASOCIADOFINIVIGENCIA = "grupoAsociadoFIniVigencia";
    /** <code>grupoAsociadoFIniVigencia</code> attribute alias. */
    public static final String ATTR_ALIAS_GRUPOASOCIADOFINIVIGENCIA = "F. Inicio Vigencia";

    /** <code>grupoAsociadoFIniVigencia</code> attribute facet sequence. */
    public static final String PATH_FACETS_GRUPOASOCIADOFINIVIGENCIA = "";
    /** Agents allowed to view the attribute grupoAsociadoFIniVigencia **/
    public static final String GRUPOASOCIADOFINIVIGENCIA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (grupoAsociadoFFinVigencia)
    /** <code>grupoAsociadoFFinVigencia</code> attribute id. */
    public static final String ATTR_ID_GRUPOASOCIADOFFINVIGENCIA = "Clas_1431875354624341Atr_4_Alias";
    /** <code>grupoAsociadoFFinVigencia</code> attribute name. */
    public static final String ATTR_NAME_GRUPOASOCIADOFFINVIGENCIA = "grupoAsociadoFFinVigencia";
    /** <code>grupoAsociadoFFinVigencia</code> attribute alias. */
    public static final String ATTR_ALIAS_GRUPOASOCIADOFFINVIGENCIA = "F. Fin Vigencia";

    /** <code>grupoAsociadoFFinVigencia</code> attribute facet sequence. */
    public static final String PATH_FACETS_GRUPOASOCIADOFFINVIGENCIA = "";
    /** Agents allowed to view the attribute grupoAsociadoFFinVigencia **/
    public static final String GRUPOASOCIADOFFINVIGENCIA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (grupoAsociadoEstado)
    /** <code>grupoAsociadoEstado</code> attribute id. */
    public static final String ATTR_ID_GRUPOASOCIADOESTADO = "Clas_1431875354624341Atr_5_Alias";
    /** <code>grupoAsociadoEstado</code> attribute name. */
    public static final String ATTR_NAME_GRUPOASOCIADOESTADO = "grupoAsociadoEstado";
    /** <code>grupoAsociadoEstado</code> attribute alias. */
    public static final String ATTR_ALIAS_GRUPOASOCIADOESTADO = "Estado";

    /** <code>grupoAsociadoEstado</code> attribute facet sequence. */
    public static final String PATH_FACETS_GRUPOASOCIADOESTADO = "";
    /** Agents allowed to view the attribute grupoAsociadoEstado **/
    public static final String GRUPOASOCIADOESTADO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (grupoAsociadoDisminucionCarencia)
    /** <code>grupoAsociadoDisminucionCarencia</code> attribute id. */
    public static final String ATTR_ID_GRUPOASOCIADODISMINUCIONCARENCIA = "Clas_1431875354624341Atr_6_Alias";
    /** <code>grupoAsociadoDisminucionCarencia</code> attribute name. */
    public static final String ATTR_NAME_GRUPOASOCIADODISMINUCIONCARENCIA = "grupoAsociadoDisminucionCarencia";
    /** <code>grupoAsociadoDisminucionCarencia</code> attribute alias. */
    public static final String ATTR_ALIAS_GRUPOASOCIADODISMINUCIONCARENCIA = "Disminución carencia";

    /** <code>grupoAsociadoDisminucionCarencia</code> attribute facet sequence. */
    public static final String PATH_FACETS_GRUPOASOCIADODISMINUCIONCARENCIA = "";
    /** Agents allowed to view the attribute grupoAsociadoDisminucionCarencia **/
    public static final String GRUPOASOCIADODISMINUCIONCARENCIA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_GRUPOASOCIADOCODIGO = "Codigo";    
    /** <code>grupoAsociadoCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_GRUPOASOCIADOCODIGO = "grupoAsociadoCodigo";
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
    // Field (CodigoLegal)
    /** <code>CodigoLegal</code> field name. */
    public static final String FLD_GRUPOASOCIADOCODIGOLEGAL = "CodigoLegal";    
    /** <code>CodigoLegal</code> field length. */
    public static final int FLD_GRUPOASOCIADOCODIGOLEGALLENGTH = 50;
    /** <code>grupoAsociadoCodigoLegal</code> attribute field name. */
    public static final String ATTR_FIELD_GRUPOASOCIADOCODIGOLEGAL = "grupoAsociadoCodigoLegal";
    // Field (CodTarifaCORE)
    /** <code>CodTarifaCORE</code> field name. */
    public static final String FLD_GRUPOASOCIADOCODTARIFACORE = "CodTarifaCORE";    
    /** <code>CodTarifaCORE</code> field length. */
    public static final int FLD_GRUPOASOCIADOCODTARIFACORELENGTH = 50;
    /** <code>grupoAsociadoCodTarifaCORE</code> attribute field name. */
    public static final String ATTR_FIELD_GRUPOASOCIADOCODTARIFACORE = "grupoAsociadoCodTarifaCORE";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_GRUPOASOCIADODESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_GRUPOASOCIADODESCRIPCIONLENGTH = 150;
    /** <code>grupoAsociadoDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_GRUPOASOCIADODESCRIPCION = "grupoAsociadoDescripcion";
    // Field (FIniVigencia)
    /** <code>FIniVigencia</code> field name. */
    public static final String FLD_GRUPOASOCIADOFINIVIGENCIA = "FIniVigencia";    
    /** <code>grupoAsociadoFIniVigencia</code> attribute field name. */
    public static final String ATTR_FIELD_GRUPOASOCIADOFINIVIGENCIA = "grupoAsociadoFIniVigencia";
    // Field (FFinVigencia)
    /** <code>FFinVigencia</code> field name. */
    public static final String FLD_GRUPOASOCIADOFFINVIGENCIA = "FFinVigencia";    
    /** <code>grupoAsociadoFFinVigencia</code> attribute field name. */
    public static final String ATTR_FIELD_GRUPOASOCIADOFFINVIGENCIA = "grupoAsociadoFFinVigencia";
    // Field (Estado)
    /** <code>Estado</code> field name. */
    public static final String FLD_GRUPOASOCIADOESTADO = "Estado";    
    /** <code>grupoAsociadoEstado</code> attribute field name. */
    public static final String ATTR_FIELD_GRUPOASOCIADOESTADO = "grupoAsociadoEstado";
    // Field (DisminucionCarencia)
    /** <code>DisminucionCarencia</code> field name. */
    public static final String FLD_GRUPOASOCIADODISMINUCIONCARENCIA = "DisminucionCarencia";    
    /** <code>grupoAsociadoDisminucionCarencia</code> attribute field name. */
    public static final String ATTR_FIELD_GRUPOASOCIADODISMINUCIONCARENCIA = "grupoAsociadoDisminucionCarencia";

    // Component role (ProductoT)
    /** <code>ProductoT</code> role id. */
    public static final String ROLE_ID_PRODUCTOT = "Agr_1431875354624678_Alias";
    /** <code>ProductoT</code> role name. */
    public static final String ROLE_NAME_PRODUCTOT = "productoT";
    /** <code>ProductoT</code> role alias. */
    public static final String ROLE_ALIAS_PRODUCTOT = "Producto";

    /** <code>ProductoT</code> inverse role name. */
    public static final String ROLE_INVNAME_PRODUCTOT = ProductosConstants.ROLE_NAME_GRUPOSASOCIADOS;
    /** <code>ProductoT</code> role facet sequence. */
    public static final String PATH_FACETS_PRODUCTOT = "";
    /** <code>ProductoT</code> role target class. */
    public static final String ROLE_TARGET_PRODUCTOT = ProductosConstants.CLASS_NAME;

    /** Agents allowed to navigate through ProductoT **/
    public static final String PRODUCTOT_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (PlanT)
    /** <code>PlanT</code> role id. */
    public static final String ROLE_ID_PLANT = "Agr_1431875354624351_Alias";
    /** <code>PlanT</code> role name. */
    public static final String ROLE_NAME_PLANT = "planT";
    /** <code>PlanT</code> role alias. */
    public static final String ROLE_ALIAS_PLANT = "Plan";

    /** <code>PlanT</code> inverse role name. */
    public static final String ROLE_INVNAME_PLANT = PlanesConstants.ROLE_NAME_GRUPOSASOCIADOS;
    /** <code>PlanT</code> role facet sequence. */
    public static final String PATH_FACETS_PLANT = "";
    /** <code>PlanT</code> role target class. */
    public static final String ROLE_TARGET_PLANT = PlanesConstants.CLASS_NAME;

    /** Agents allowed to navigate through PlanT **/
    public static final String PLANT_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Compound role (Solicitudes)
    /** <code>Solicitudes</code> role id. */
    public static final String ROLE_ID_SOLICITUDES = "Agr_1432638324736934_Alias";
    /** <code>Solicitudes</code> role name. */
    public static final String ROLE_NAME_SOLICITUDES = "solicitudes";
    /** <code>GrupoAsociado</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUDES = "Solicitudes";


    /** <code>Solicitudes</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUDES = SolicitudConstants.ROLE_NAME_GRUPOASOCIADO;
    /** <code>Solicitudes</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUDES = "";
    /** <code>Solicitudes</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUDES = SolicitudConstants.CLASS_NAME;
    /** Agents allowed to navigate through Solicitudes **/
    public static final String SOLICITUDES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (ContratosC)
    /** <code>ContratosC</code> role id. */
    public static final String ROLE_ID_CONTRATOSC = "Agr_1473096581120829_Alias";
    /** <code>ContratosC</code> role name. */
    public static final String ROLE_NAME_CONTRATOSC = "contratosC";
    /** <code>GrupoAsociadoC</code> role alias. */
    public static final String ROLE_ALIAS_CONTRATOSC = "Contratos";


    /** <code>ContratosC</code> inverse role name. */
    public static final String ROLE_INVNAME_CONTRATOSC = ContratoCConstants.ROLE_NAME_GRUPOASOCIADOC;
    /** <code>ContratosC</code> role facet sequence. */
    public static final String PATH_FACETS_CONTRATOSC = "";
    /** <code>ContratosC</code> role target class. */
    public static final String ROLE_TARGET_CONTRATOSC = ContratoCConstants.CLASS_NAME;
    /** Agents allowed to navigate through ContratosC **/
    public static final String CONTRATOSC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (SolicitudesNovedad)
    /** <code>SolicitudesNovedad</code> role id. */
    public static final String ROLE_ID_SOLICITUDESNOVEDAD = "Agr_1581501513728324_Alias";
    /** <code>SolicitudesNovedad</code> role name. */
    public static final String ROLE_NAME_SOLICITUDESNOVEDAD = "solicitudesNovedad";
    /** <code>GrupoAsociado</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUDESNOVEDAD = "SolicitudesNovedad";


    /** <code>SolicitudesNovedad</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUDESNOVEDAD = SolicitudNovedadConstants.ROLE_NAME_GRUPOASOCIADO;
    /** <code>SolicitudesNovedad</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUDESNOVEDAD = "";
    /** <code>SolicitudesNovedad</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUDESNOVEDAD = SolicitudNovedadConstants.CLASS_NAME;
    /** Agents allowed to navigate through SolicitudesNovedad **/
    public static final String SOLICITUDESNOVEDAD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431875354624341Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear grupo asociado";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>grupoAsociadocrearpagrProductoT</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_GRUPOASOCIADOCREARPAGRPRODUCTOT = "p_agrProductoT";
    /** <code>grupoAsociadocrearpagrProductoT</code> inbound argument id. */
    public static final String ARG_ID_CREAR_GRUPOASOCIADOCREARPAGRPRODUCTOT = "Clas_1431875354624341Ser_1Arg_10_Alias";
    /** <code>grupoAsociadocrearpagrProductoT</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_GRUPOASOCIADOCREARPAGRPRODUCTOT = "Producto";
    /** <code>grupoAsociadocrearpagrPlanT</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_GRUPOASOCIADOCREARPAGRPLANT = "p_agrPlanT";
    /** <code>grupoAsociadocrearpagrPlanT</code> inbound argument id. */
    public static final String ARG_ID_CREAR_GRUPOASOCIADOCREARPAGRPLANT = "Clas_1431875354624341Ser_1Arg_11_Alias";
    /** <code>grupoAsociadocrearpagrPlanT</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_GRUPOASOCIADOCREARPAGRPLANT = "Plan";
    /** <code>grupoAsociadocrearpatrCodigoLegal</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_GRUPOASOCIADOCREARPATRCODIGOLEGAL = "p_atrCodigoLegal";
    /** <code>grupoAsociadocrearpatrCodigoLegal</code> inbound argument id. */
    public static final String ARG_ID_CREAR_GRUPOASOCIADOCREARPATRCODIGOLEGAL = "Clas_1431875354624341Ser_1Arg_1_Alias";
    /** <code>grupoAsociadocrearpatrCodigoLegal</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_GRUPOASOCIADOCREARPATRCODIGOLEGAL = "Código legal";
    /** <code>grupoAsociadocrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_GRUPOASOCIADOCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>grupoAsociadocrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_GRUPOASOCIADOCREARPATRDESCRIPCION = "Clas_1431875354624341Ser_1Arg_5_Alias";
    /** <code>grupoAsociadocrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_GRUPOASOCIADOCREARPATRDESCRIPCION = "Descripción";
    /** <code>grupoAsociadocrearpatrFIniVigencia</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_GRUPOASOCIADOCREARPATRFINIVIGENCIA = "p_atrFIniVigencia";
    /** <code>grupoAsociadocrearpatrFIniVigencia</code> inbound argument id. */
    public static final String ARG_ID_CREAR_GRUPOASOCIADOCREARPATRFINIVIGENCIA = "Clas_1431875354624341Ser_1Arg_6_Alias";
    /** <code>grupoAsociadocrearpatrFIniVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_GRUPOASOCIADOCREARPATRFINIVIGENCIA = "F. Inicio Vigencia";
    /** <code>grupoAsociadocrearpatrFFinVigencia</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_GRUPOASOCIADOCREARPATRFFINVIGENCIA = "p_atrFFinVigencia";
    /** <code>grupoAsociadocrearpatrFFinVigencia</code> inbound argument id. */
    public static final String ARG_ID_CREAR_GRUPOASOCIADOCREARPATRFFINVIGENCIA = "Clas_1431875354624341Ser_1Arg_7_Alias";
    /** <code>grupoAsociadocrearpatrFFinVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_GRUPOASOCIADOCREARPATRFFINVIGENCIA = "F. Fin Vigencia";
    /** <code>grupoAsociadocrearpatrEstado</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_GRUPOASOCIADOCREARPATRESTADO = "p_atrEstado";
    /** <code>grupoAsociadocrearpatrEstado</code> inbound argument id. */
    public static final String ARG_ID_CREAR_GRUPOASOCIADOCREARPATRESTADO = "Clas_1431875354624341Ser_1Arg_8_Alias";
    /** <code>grupoAsociadocrearpatrEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_GRUPOASOCIADOCREARPATRESTADO = "Estado";
    /** <code>grupoAsociadocrearpatrDisminucionCarencia</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_GRUPOASOCIADOCREARPATRDISMINUCIONCARENCIA = "p_atrDisminucionCarencia";
    /** <code>grupoAsociadocrearpatrDisminucionCarencia</code> inbound argument id. */
    public static final String ARG_ID_CREAR_GRUPOASOCIADOCREARPATRDISMINUCIONCARENCIA = "Clas_1431875354624341Ser_1Arg_9_Alias";
    /** <code>grupoAsociadocrearpatrDisminucionCarencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_GRUPOASOCIADOCREARPATRDISMINUCIONCARENCIA = "Disminución carencia";
    /** <code>grupoAsociadocrearpatrCodTarifaCORE</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_GRUPOASOCIADOCREARPATRCODTARIFACORE = "p_atrCodTarifaCORE";
    /** <code>grupoAsociadocrearpatrCodTarifaCORE</code> inbound argument id. */
    public static final String ARG_ID_CREAR_GRUPOASOCIADOCREARPATRCODTARIFACORE = "Clas_1431875354624341Ser_1Arg_12_Alias";
    /** <code>grupoAsociadocrearpatrCodTarifaCORE</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_GRUPOASOCIADOCREARPATRCODTARIFACORE = "Cod. Tarifa CORE";
    /** <code>grupoAsociadocrearpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_GRUPOASOCIADOCREARPATRCODIGO = "p_atrCodigo";
    /** <code>grupoAsociadocrearpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_GRUPOASOCIADOCREARPATRCODIGO = "Clas_1431875354624341Ser_1Arg_13_Alias";
    /** <code>grupoAsociadocrearpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_GRUPOASOCIADOCREARPATRCODIGO = "Código";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431875354624341Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar grupo asociado";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>grupoAsociadoeliminarpthisGrupoAsociado</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_GRUPOASOCIADOELIMINARPTHISGRUPOASOCIADO = "p_thisGrupoAsociado";
    /** <code>grupoAsociadoeliminarpthisGrupoAsociado</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_GRUPOASOCIADOELIMINARPTHISGRUPOASOCIADO = "Clas_1431875354624341Ser_2Arg_1_Alias";
    /** <code>grupoAsociadoeliminarpthisGrupoAsociado</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_GRUPOASOCIADOELIMINARPTHISGRUPOASOCIADO = "Grupo Asociado";
    // Service (sincronizar)
    /** <code>sincronizar</code> service id. */
    public static final String SERV_ID_SINCRONIZAR = "Clas_1431875354624341Ser_3_Alias";
    /** <code>sincronizar</code> service name. */
    public static final String SERV_NAME_SINCRONIZAR = "sincronizar";
    /** <code>sincronizar</code> service alias. */
    public static final String SERV_ALIAS_SINCRONIZAR = "sincronizar";
    /** Agents allowed to execute the service sincronizar **/
    public static final String SINCRONIZAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>grupoAsociadosincronizarpthisGrupoAsociado</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_GRUPOASOCIADOSINCRONIZARPTHISGRUPOASOCIADO = "p_thisGrupoAsociado";
    /** <code>grupoAsociadosincronizarpthisGrupoAsociado</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_GRUPOASOCIADOSINCRONIZARPTHISGRUPOASOCIADO = "Clas_1431875354624341Ser_3Arg_1_Alias";
    /** <code>grupoAsociadosincronizarpthisGrupoAsociado</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_GRUPOASOCIADOSINCRONIZARPTHISGRUPOASOCIADO = "Grupo Asociado";
    /** <code>grupoAsociadosincronizarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_GRUPOASOCIADOSINCRONIZARPDESCRIPCION = "p_Descripcion";
    /** <code>grupoAsociadosincronizarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_GRUPOASOCIADOSINCRONIZARPDESCRIPCION = "Clas_1431875354624341Ser_3Arg_2_Alias";
    /** <code>grupoAsociadosincronizarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_GRUPOASOCIADOSINCRONIZARPDESCRIPCION = "Descripción";
    /** <code>grupoAsociadosincronizarpFIniVigencia</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_GRUPOASOCIADOSINCRONIZARPFINIVIGENCIA = "p_FIniVigencia";
    /** <code>grupoAsociadosincronizarpFIniVigencia</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_GRUPOASOCIADOSINCRONIZARPFINIVIGENCIA = "Clas_1431875354624341Ser_3Arg_3_Alias";
    /** <code>grupoAsociadosincronizarpFIniVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_GRUPOASOCIADOSINCRONIZARPFINIVIGENCIA = "F. Inicio Vigencia";
    /** <code>grupoAsociadosincronizarpFFinVigencia</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_GRUPOASOCIADOSINCRONIZARPFFINVIGENCIA = "p_FFinVigencia";
    /** <code>grupoAsociadosincronizarpFFinVigencia</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_GRUPOASOCIADOSINCRONIZARPFFINVIGENCIA = "Clas_1431875354624341Ser_3Arg_4_Alias";
    /** <code>grupoAsociadosincronizarpFFinVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_GRUPOASOCIADOSINCRONIZARPFFINVIGENCIA = "F. Fin Vigencia";
    /** <code>grupoAsociadosincronizarpEstado</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_GRUPOASOCIADOSINCRONIZARPESTADO = "p_Estado";
    /** <code>grupoAsociadosincronizarpEstado</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_GRUPOASOCIADOSINCRONIZARPESTADO = "Clas_1431875354624341Ser_3Arg_5_Alias";
    /** <code>grupoAsociadosincronizarpEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_GRUPOASOCIADOSINCRONIZARPESTADO = "Estado";
    /** <code>grupoAsociadosincronizarpCodTarifaCORE</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_GRUPOASOCIADOSINCRONIZARPCODTARIFACORE = "p_CodTarifaCORE";
    /** <code>grupoAsociadosincronizarpCodTarifaCORE</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_GRUPOASOCIADOSINCRONIZARPCODTARIFACORE = "Clas_1431875354624341Ser_3Arg_6_Alias";
    /** <code>grupoAsociadosincronizarpCodTarifaCORE</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_GRUPOASOCIADOSINCRONIZARPCODTARIFACORE = "Cod. Tarifa CORE";
    /** <code>grupoAsociadosincronizarpCodigoLegal</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_GRUPOASOCIADOSINCRONIZARPCODIGOLEGAL = "p_CodigoLegal";
    /** <code>grupoAsociadosincronizarpCodigoLegal</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_GRUPOASOCIADOSINCRONIZARPCODIGOLEGAL = "Clas_1431875354624341Ser_3Arg_7_Alias";
    /** <code>grupoAsociadosincronizarpCodigoLegal</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_GRUPOASOCIADOSINCRONIZARPCODIGOLEGAL = "Código legal";
    // Service (CambPlanGrupoAsociado)
    /** <code>CambPlanGrupoAsociado</code> service id. */
    public static final String SERV_ID_CAMBPLANGRUPOASOCIADO = "Clas_1431875354624341Ser_5_Alias";
    /** <code>CambPlanGrupoAsociado</code> service name. */
    public static final String SERV_NAME_CAMBPLANGRUPOASOCIADO = "CambPlanGrupoAsociado";
    /** <code>CambPlanGrupoAsociado</code> service alias. */
    public static final String SERV_ALIAS_CAMBPLANGRUPOASOCIADO = "CambPlanGrupoAsociado";
    /** Agents allowed to execute the service CambPlanGrupoAsociado **/
    public static final String CAMBPLANGRUPOASOCIADO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>grupoAsociadoCambPlanGrupoAsociadopthisGrupoAsociado</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPLANGRUPOASOCIADO_GRUPOASOCIADOCAMBPLANGRUPOASOCIADOPTHISGRUPOASOCIADO = "p_thisGrupoAsociado";
    /** <code>grupoAsociadoCambPlanGrupoAsociadopthisGrupoAsociado</code> inbound argument id. */
    public static final String ARG_ID_CAMBPLANGRUPOASOCIADO_GRUPOASOCIADOCAMBPLANGRUPOASOCIADOPTHISGRUPOASOCIADO = "Clas_1431875354624341Ser_5Arg_1_Alias";
    /** <code>grupoAsociadoCambPlanGrupoAsociadopthisGrupoAsociado</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPLANGRUPOASOCIADO_GRUPOASOCIADOCAMBPLANGRUPOASOCIADOPTHISGRUPOASOCIADO = "Grupos asociados";
    /** <code>grupoAsociadoCambPlanGrupoAsociadopevcPlanes</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPLANGRUPOASOCIADO_GRUPOASOCIADOCAMBPLANGRUPOASOCIADOPEVCPLANES = "p_evcPlanes";
    /** <code>grupoAsociadoCambPlanGrupoAsociadopevcPlanes</code> inbound argument id. */
    public static final String ARG_ID_CAMBPLANGRUPOASOCIADO_GRUPOASOCIADOCAMBPLANGRUPOASOCIADOPEVCPLANES = "Clas_1431875354624341Ser_5Arg_2_Alias";
    /** <code>grupoAsociadoCambPlanGrupoAsociadopevcPlanes</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPLANGRUPOASOCIADO_GRUPOASOCIADOCAMBPLANGRUPOASOCIADOPEVCPLANES = "Plan";
    // Service (CambProductoGrupoAsociado)
    /** <code>CambProductoGrupoAsociado</code> service id. */
    public static final String SERV_ID_CAMBPRODUCTOGRUPOASOCIADO = "Clas_1431875354624341Ser_6_Alias";
    /** <code>CambProductoGrupoAsociado</code> service name. */
    public static final String SERV_NAME_CAMBPRODUCTOGRUPOASOCIADO = "CambProductoGrupoAsociado";
    /** <code>CambProductoGrupoAsociado</code> service alias. */
    public static final String SERV_ALIAS_CAMBPRODUCTOGRUPOASOCIADO = "CambProductoGrupoAsociado";
    /** Agents allowed to execute the service CambProductoGrupoAsociado **/
    public static final String CAMBPRODUCTOGRUPOASOCIADO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>grupoAsociadoCambProductoGrupoAsociadopthisGrupoAsociado</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPRODUCTOGRUPOASOCIADO_GRUPOASOCIADOCAMBPRODUCTOGRUPOASOCIADOPTHISGRUPOASOCIADO = "p_thisGrupoAsociado";
    /** <code>grupoAsociadoCambProductoGrupoAsociadopthisGrupoAsociado</code> inbound argument id. */
    public static final String ARG_ID_CAMBPRODUCTOGRUPOASOCIADO_GRUPOASOCIADOCAMBPRODUCTOGRUPOASOCIADOPTHISGRUPOASOCIADO = "Clas_1431875354624341Ser_6Arg_1_Alias";
    /** <code>grupoAsociadoCambProductoGrupoAsociadopthisGrupoAsociado</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPRODUCTOGRUPOASOCIADO_GRUPOASOCIADOCAMBPRODUCTOGRUPOASOCIADOPTHISGRUPOASOCIADO = "Grupos asociados";
    /** <code>grupoAsociadoCambProductoGrupoAsociadopevcProductos</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPRODUCTOGRUPOASOCIADO_GRUPOASOCIADOCAMBPRODUCTOGRUPOASOCIADOPEVCPRODUCTOS = "p_evcProductos";
    /** <code>grupoAsociadoCambProductoGrupoAsociadopevcProductos</code> inbound argument id. */
    public static final String ARG_ID_CAMBPRODUCTOGRUPOASOCIADO_GRUPOASOCIADOCAMBPRODUCTOGRUPOASOCIADOPEVCPRODUCTOS = "Clas_1431875354624341Ser_6Arg_2_Alias";
    /** <code>grupoAsociadoCambProductoGrupoAsociadopevcProductos</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPRODUCTOGRUPOASOCIADO_GRUPOASOCIADOCAMBPRODUCTOGRUPOASOCIADOPEVCPRODUCTOS = "Producto";
    // Service (InsGrupoAsociadoSolicitud)
    /** <code>InsGrupoAsociadoSolicitud</code> service id. */
    public static final String SERV_ID_INSGRUPOASOCIADOSOLICITUD = "Clas_1431875354624341Ser_8_Alias";
    /** <code>InsGrupoAsociadoSolicitud</code> service name. */
    public static final String SERV_NAME_INSGRUPOASOCIADOSOLICITUD = "InsGrupoAsociadoSolicitud";
    /** <code>InsGrupoAsociadoSolicitud</code> service alias. */
    public static final String SERV_ALIAS_INSGRUPOASOCIADOSOLICITUD = "InsGrupoAsociadoSolicitud";
    /** Agents allowed to execute the service InsGrupoAsociadoSolicitud **/
    public static final String INSGRUPOASOCIADOSOLICITUD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>grupoAsociadoInsGrupoAsociadoSolicitudpthisGrupoAsociado</code> inbound argument name. */
    public static final String ARG_NAME_INSGRUPOASOCIADOSOLICITUD_GRUPOASOCIADOINSGRUPOASOCIADOSOLICITUDPTHISGRUPOASOCIADO = "p_thisGrupoAsociado";
    /** <code>grupoAsociadoInsGrupoAsociadoSolicitudpthisGrupoAsociado</code> inbound argument id. */
    public static final String ARG_ID_INSGRUPOASOCIADOSOLICITUD_GRUPOASOCIADOINSGRUPOASOCIADOSOLICITUDPTHISGRUPOASOCIADO = "Clas_1431875354624341Ser_8Arg_1_Alias";
    /** <code>grupoAsociadoInsGrupoAsociadoSolicitudpthisGrupoAsociado</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSGRUPOASOCIADOSOLICITUD_GRUPOASOCIADOINSGRUPOASOCIADOSOLICITUDPTHISGRUPOASOCIADO = "Grupo asociado";
    /** <code>grupoAsociadoInsGrupoAsociadoSolicitudpevcSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_INSGRUPOASOCIADOSOLICITUD_GRUPOASOCIADOINSGRUPOASOCIADOSOLICITUDPEVCSOLICITUD = "p_evcSolicitud";
    /** <code>grupoAsociadoInsGrupoAsociadoSolicitudpevcSolicitud</code> inbound argument id. */
    public static final String ARG_ID_INSGRUPOASOCIADOSOLICITUD_GRUPOASOCIADOINSGRUPOASOCIADOSOLICITUDPEVCSOLICITUD = "Clas_1431875354624341Ser_8Arg_2_Alias";
    /** <code>grupoAsociadoInsGrupoAsociadoSolicitudpevcSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSGRUPOASOCIADOSOLICITUD_GRUPOASOCIADOINSGRUPOASOCIADOSOLICITUDPEVCSOLICITUD = "Solicitudes";
    // Service (DelGrupoAsociadoSolicitud)
    /** <code>DelGrupoAsociadoSolicitud</code> service id. */
    public static final String SERV_ID_DELGRUPOASOCIADOSOLICITUD = "Clas_1431875354624341Ser_9_Alias";
    /** <code>DelGrupoAsociadoSolicitud</code> service name. */
    public static final String SERV_NAME_DELGRUPOASOCIADOSOLICITUD = "DelGrupoAsociadoSolicitud";
    /** <code>DelGrupoAsociadoSolicitud</code> service alias. */
    public static final String SERV_ALIAS_DELGRUPOASOCIADOSOLICITUD = "DelGrupoAsociadoSolicitud";
    /** Agents allowed to execute the service DelGrupoAsociadoSolicitud **/
    public static final String DELGRUPOASOCIADOSOLICITUD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>grupoAsociadoDelGrupoAsociadoSolicitudpthisGrupoAsociado</code> inbound argument name. */
    public static final String ARG_NAME_DELGRUPOASOCIADOSOLICITUD_GRUPOASOCIADODELGRUPOASOCIADOSOLICITUDPTHISGRUPOASOCIADO = "p_thisGrupoAsociado";
    /** <code>grupoAsociadoDelGrupoAsociadoSolicitudpthisGrupoAsociado</code> inbound argument id. */
    public static final String ARG_ID_DELGRUPOASOCIADOSOLICITUD_GRUPOASOCIADODELGRUPOASOCIADOSOLICITUDPTHISGRUPOASOCIADO = "Clas_1431875354624341Ser_9Arg_1_Alias";
    /** <code>grupoAsociadoDelGrupoAsociadoSolicitudpthisGrupoAsociado</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELGRUPOASOCIADOSOLICITUD_GRUPOASOCIADODELGRUPOASOCIADOSOLICITUDPTHISGRUPOASOCIADO = "Grupo asociado";
    /** <code>grupoAsociadoDelGrupoAsociadoSolicitudpevcSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_DELGRUPOASOCIADOSOLICITUD_GRUPOASOCIADODELGRUPOASOCIADOSOLICITUDPEVCSOLICITUD = "p_evcSolicitud";
    /** <code>grupoAsociadoDelGrupoAsociadoSolicitudpevcSolicitud</code> inbound argument id. */
    public static final String ARG_ID_DELGRUPOASOCIADOSOLICITUD_GRUPOASOCIADODELGRUPOASOCIADOSOLICITUDPEVCSOLICITUD = "Clas_1431875354624341Ser_9Arg_2_Alias";
    /** <code>grupoAsociadoDelGrupoAsociadoSolicitudpevcSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELGRUPOASOCIADOSOLICITUD_GRUPOASOCIADODELGRUPOASOCIADOSOLICITUDPEVCSOLICITUD = "Solicitudes";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1431875354624341Ser_10_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar grupo asociado";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>grupoAsociadomodificarpthisGrupoAsociado</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_GRUPOASOCIADOMODIFICARPTHISGRUPOASOCIADO = "p_thisGrupoAsociado";
    /** <code>grupoAsociadomodificarpthisGrupoAsociado</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_GRUPOASOCIADOMODIFICARPTHISGRUPOASOCIADO = "Clas_1431875354624341Ser_10Arg_1_Alias";
    /** <code>grupoAsociadomodificarpthisGrupoAsociado</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_GRUPOASOCIADOMODIFICARPTHISGRUPOASOCIADO = "Grupo Asociado";
    /** <code>grupoAsociadomodificarpDisminucionCarencia</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_GRUPOASOCIADOMODIFICARPDISMINUCIONCARENCIA = "p_DisminucionCarencia";
    /** <code>grupoAsociadomodificarpDisminucionCarencia</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_GRUPOASOCIADOMODIFICARPDISMINUCIONCARENCIA = "Clas_1431875354624341Ser_10Arg_2_Alias";
    /** <code>grupoAsociadomodificarpDisminucionCarencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_GRUPOASOCIADOMODIFICARPDISMINUCIONCARENCIA = "Disminución carencia";
    // Service (InsGrupoAsociado)
    /** <code>InsGrupoAsociado</code> service id. */
    public static final String SERV_ID_INSGRUPOASOCIADO = "Clas_1431875354624341Ser_12_Alias";
    /** <code>InsGrupoAsociado</code> service name. */
    public static final String SERV_NAME_INSGRUPOASOCIADO = "InsGrupoAsociado";
    /** <code>InsGrupoAsociado</code> service alias. */
    public static final String SERV_ALIAS_INSGRUPOASOCIADO = "InsGrupoAsociado";
    /** Agents allowed to execute the service InsGrupoAsociado **/
    public static final String INSGRUPOASOCIADO_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>grupoAsociadoInsGrupoAsociadopthisGrupoAsociado</code> inbound argument name. */
    public static final String ARG_NAME_INSGRUPOASOCIADO_GRUPOASOCIADOINSGRUPOASOCIADOPTHISGRUPOASOCIADO = "p_thisGrupoAsociado";
    /** <code>grupoAsociadoInsGrupoAsociadopthisGrupoAsociado</code> inbound argument id. */
    public static final String ARG_ID_INSGRUPOASOCIADO_GRUPOASOCIADOINSGRUPOASOCIADOPTHISGRUPOASOCIADO = "Clas_1431875354624341Ser_12Arg_1_Alias";
    /** <code>grupoAsociadoInsGrupoAsociadopthisGrupoAsociado</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSGRUPOASOCIADO_GRUPOASOCIADOINSGRUPOASOCIADOPTHISGRUPOASOCIADO = "GrupoAsociado";
    /** <code>grupoAsociadoInsGrupoAsociadopevcSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_INSGRUPOASOCIADO_GRUPOASOCIADOINSGRUPOASOCIADOPEVCSOLICITUDNOVEDAD = "p_evcSolicitudNovedad";
    /** <code>grupoAsociadoInsGrupoAsociadopevcSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_INSGRUPOASOCIADO_GRUPOASOCIADOINSGRUPOASOCIADOPEVCSOLICITUDNOVEDAD = "Clas_1431875354624341Ser_12Arg_2_Alias";
    /** <code>grupoAsociadoInsGrupoAsociadopevcSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSGRUPOASOCIADO_GRUPOASOCIADOINSGRUPOASOCIADOPEVCSOLICITUDNOVEDAD = "SolicitudesNovedad";
    // Service (DelGrupoAsociado)
    /** <code>DelGrupoAsociado</code> service id. */
    public static final String SERV_ID_DELGRUPOASOCIADO = "Clas_1431875354624341Ser_13_Alias";
    /** <code>DelGrupoAsociado</code> service name. */
    public static final String SERV_NAME_DELGRUPOASOCIADO = "DelGrupoAsociado";
    /** <code>DelGrupoAsociado</code> service alias. */
    public static final String SERV_ALIAS_DELGRUPOASOCIADO = "DelGrupoAsociado";
    /** Agents allowed to execute the service DelGrupoAsociado **/
    public static final String DELGRUPOASOCIADO_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>grupoAsociadoDelGrupoAsociadopthisGrupoAsociado</code> inbound argument name. */
    public static final String ARG_NAME_DELGRUPOASOCIADO_GRUPOASOCIADODELGRUPOASOCIADOPTHISGRUPOASOCIADO = "p_thisGrupoAsociado";
    /** <code>grupoAsociadoDelGrupoAsociadopthisGrupoAsociado</code> inbound argument id. */
    public static final String ARG_ID_DELGRUPOASOCIADO_GRUPOASOCIADODELGRUPOASOCIADOPTHISGRUPOASOCIADO = "Clas_1431875354624341Ser_13Arg_1_Alias";
    /** <code>grupoAsociadoDelGrupoAsociadopthisGrupoAsociado</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELGRUPOASOCIADO_GRUPOASOCIADODELGRUPOASOCIADOPTHISGRUPOASOCIADO = "GrupoAsociado";
    /** <code>grupoAsociadoDelGrupoAsociadopevcSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DELGRUPOASOCIADO_GRUPOASOCIADODELGRUPOASOCIADOPEVCSOLICITUDNOVEDAD = "p_evcSolicitudNovedad";
    /** <code>grupoAsociadoDelGrupoAsociadopevcSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_DELGRUPOASOCIADO_GRUPOASOCIADODELGRUPOASOCIADOPEVCSOLICITUDNOVEDAD = "Clas_1431875354624341Ser_13Arg_2_Alias";
    /** <code>grupoAsociadoDelGrupoAsociadopevcSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELGRUPOASOCIADO_GRUPOASOCIADODELGRUPOASOCIADOPEVCSOLICITUDNOVEDAD = "SolicitudesNovedad";
    // Service (TSINCRONIZAR)
    /** <code>TSINCRONIZAR</code> service id. */
    public static final String SERV_ID_TSINCRONIZAR = "Clas_1431875354624341Ser_7_Alias";
    /** <code>TSINCRONIZAR</code> service name. */
    public static final String SERV_NAME_TSINCRONIZAR = "TSINCRONIZAR";
    /** <code>TSINCRONIZAR</code> service alias. */
    public static final String SERV_ALIAS_TSINCRONIZAR = "TSINCRONIZAR";
    /** Agents allowed to execute the service TSINCRONIZAR **/
    public static final String TSINCRONIZAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>grupoAsociadoTSINCRONIZARpthisGrupoAsociado</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_GRUPOASOCIADOTSINCRONIZARPTHISGRUPOASOCIADO = "p_thisGrupoAsociado";
    /** <code>grupoAsociadoTSINCRONIZARpthisGrupoAsociado</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_GRUPOASOCIADOTSINCRONIZARPTHISGRUPOASOCIADO = "Clas_1431875354624341Ser_7Arg_1_Alias";
    /** <code>grupoAsociadoTSINCRONIZARpthisGrupoAsociado</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_GRUPOASOCIADOTSINCRONIZARPTHISGRUPOASOCIADO = "Grupo Asociado";
    /** <code>grupoAsociadoTSINCRONIZARptpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_GRUPOASOCIADOTSINCRONIZARPTPDESCRIPCION = "pt_p_Descripcion";
    /** <code>grupoAsociadoTSINCRONIZARptpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_GRUPOASOCIADOTSINCRONIZARPTPDESCRIPCION = "Clas_1431875354624341Ser_7Arg_2_Alias";
    /** <code>grupoAsociadoTSINCRONIZARptpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_GRUPOASOCIADOTSINCRONIZARPTPDESCRIPCION = "Descripción";
    /** <code>grupoAsociadoTSINCRONIZARptpFIniVigencia</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_GRUPOASOCIADOTSINCRONIZARPTPFINIVIGENCIA = "pt_p_FIniVigencia";
    /** <code>grupoAsociadoTSINCRONIZARptpFIniVigencia</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_GRUPOASOCIADOTSINCRONIZARPTPFINIVIGENCIA = "Clas_1431875354624341Ser_7Arg_3_Alias";
    /** <code>grupoAsociadoTSINCRONIZARptpFIniVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_GRUPOASOCIADOTSINCRONIZARPTPFINIVIGENCIA = "F. Inicio Vigencia";
    /** <code>grupoAsociadoTSINCRONIZARptpFFinVigencia</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_GRUPOASOCIADOTSINCRONIZARPTPFFINVIGENCIA = "pt_p_FFinVigencia";
    /** <code>grupoAsociadoTSINCRONIZARptpFFinVigencia</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_GRUPOASOCIADOTSINCRONIZARPTPFFINVIGENCIA = "Clas_1431875354624341Ser_7Arg_4_Alias";
    /** <code>grupoAsociadoTSINCRONIZARptpFFinVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_GRUPOASOCIADOTSINCRONIZARPTPFFINVIGENCIA = "F. Fin Vigencia";
    /** <code>grupoAsociadoTSINCRONIZARptpEstado</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_GRUPOASOCIADOTSINCRONIZARPTPESTADO = "pt_p_Estado";
    /** <code>grupoAsociadoTSINCRONIZARptpEstado</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_GRUPOASOCIADOTSINCRONIZARPTPESTADO = "Clas_1431875354624341Ser_7Arg_5_Alias";
    /** <code>grupoAsociadoTSINCRONIZARptpEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_GRUPOASOCIADOTSINCRONIZARPTPESTADO = "Estado";
    /** <code>grupoAsociadoTSINCRONIZARptpevcPlan</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_GRUPOASOCIADOTSINCRONIZARPTPEVCPLAN = "pt_p_evcPlan";
    /** <code>grupoAsociadoTSINCRONIZARptpevcPlan</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_GRUPOASOCIADOTSINCRONIZARPTPEVCPLAN = "Clas_1431875354624341Ser_7Arg_6_Alias";
    /** <code>grupoAsociadoTSINCRONIZARptpevcPlan</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_GRUPOASOCIADOTSINCRONIZARPTPEVCPLAN = "Plan";
    /** <code>grupoAsociadoTSINCRONIZARptpevcProducto</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_GRUPOASOCIADOTSINCRONIZARPTPEVCPRODUCTO = "pt_p_evcProducto";
    /** <code>grupoAsociadoTSINCRONIZARptpevcProducto</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_GRUPOASOCIADOTSINCRONIZARPTPEVCPRODUCTO = "Clas_1431875354624341Ser_7Arg_7_Alias";
    /** <code>grupoAsociadoTSINCRONIZARptpevcProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_GRUPOASOCIADOTSINCRONIZARPTPEVCPRODUCTO = "Producto";
    /** <code>grupoAsociadoTSINCRONIZARptCodTarifaCORE</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_GRUPOASOCIADOTSINCRONIZARPTCODTARIFACORE = "pt_CodTarifaCORE";
    /** <code>grupoAsociadoTSINCRONIZARptCodTarifaCORE</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_GRUPOASOCIADOTSINCRONIZARPTCODTARIFACORE = "Clas_1431875354624341Ser_7Arg_9_Alias";
    /** <code>grupoAsociadoTSINCRONIZARptCodTarifaCORE</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_GRUPOASOCIADOTSINCRONIZARPTCODTARIFACORE = "pt_CodTarifaCORE";
    /** <code>grupoAsociadoTSINCRONIZARptpCodigoLegal</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_GRUPOASOCIADOTSINCRONIZARPTPCODIGOLEGAL = "pt_p_CodigoLegal";
    /** <code>grupoAsociadoTSINCRONIZARptpCodigoLegal</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_GRUPOASOCIADOTSINCRONIZARPTPCODIGOLEGAL = "Clas_1431875354624341Ser_7Arg_10_Alias";
    /** <code>grupoAsociadoTSINCRONIZARptpCodigoLegal</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_GRUPOASOCIADOTSINCRONIZARPTPCODIGOLEGAL = "Código legal";

    public static final String FILTER_NAME_FGRUPOASOCIADOVARIOS = "F_GrupoAsociadoVarios";
    public static final String VAR_NAME_FGRUPOASOCIADOVARIOS_VOPRODUCTO = "vo_Producto";
    public static final String VAR_NAME_FGRUPOASOCIADOVARIOS_VOPLAN = "vo_Plan";
    public static final String VAR_NAME_FGRUPOASOCIADOVARIOS_VFINI = "v_FIni";
    public static final String VAR_NAME_FGRUPOASOCIADOVARIOS_VFFIN = "v_FFin";
    public static final String FILTER_NAME_IFGRUPOASOCIADOCODIGOLEGAL = "iF_GrupoAsociadoCodigoLegal";
    public static final String VAR_NAME_IFGRUPOASOCIADOCODIGOLEGAL_VCODIGOLEGAL = "v_CodigoLegal";
    public static final String FILTER_NAME_FGRUPOASOCIADOBUSQUEDA = "F_GrupoAsociado_Busqueda";
    public static final String VAR_NAME_FGRUPOASOCIADOBUSQUEDA_VCODIGOLEGAL = "v_CodigoLegal";
    public static final String VAR_NAME_FGRUPOASOCIADOBUSQUEDA_VDESCRIPCION = "v_Descripcion";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_GRUPOASOCIADOCODIGOLEGAL.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_GRUPOASOCIADOCODTARIFACORE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_GRUPOASOCIADODESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_GRUPOASOCIADOFINIVIGENCIA.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_GRUPOASOCIADOFFINVIGENCIA.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_GRUPOASOCIADOESTADO.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_GRUPOASOCIADODISMINUCIONCARENCIA.toUpperCase(), Constants.Type.NAT.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_GRUPOASOCIADOCODIGO.toUpperCase(), GRUPOASOCIADOCODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_GRUPOASOCIADOCODIGOLEGAL.toUpperCase(), GRUPOASOCIADOCODIGOLEGAL_AGENTS);
    	attributeAgents.put(ATTR_NAME_GRUPOASOCIADOCODTARIFACORE.toUpperCase(), GRUPOASOCIADOCODTARIFACORE_AGENTS);
    	attributeAgents.put(ATTR_NAME_GRUPOASOCIADODESCRIPCION.toUpperCase(), GRUPOASOCIADODESCRIPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_GRUPOASOCIADOFINIVIGENCIA.toUpperCase(), GRUPOASOCIADOFINIVIGENCIA_AGENTS);
    	attributeAgents.put(ATTR_NAME_GRUPOASOCIADOFFINVIGENCIA.toUpperCase(), GRUPOASOCIADOFFINVIGENCIA_AGENTS);
    	attributeAgents.put(ATTR_NAME_GRUPOASOCIADOESTADO.toUpperCase(), GRUPOASOCIADOESTADO_AGENTS);
    	attributeAgents.put(ATTR_NAME_GRUPOASOCIADODISMINUCIONCARENCIA.toUpperCase(), GRUPOASOCIADODISMINUCIONCARENCIA_AGENTS);
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
     * - If className is 'GrupoAsociado', it returns the identification keys
     * - If className is a facet of the inheritance net of 'GrupoAsociado', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_GRUPOASOCIADOCODIGO);
        }
        // Facet 'GrupoAsociado' (This facet)
        if (GrupoAsociadoConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_GRUPOASOCIADOCODIGO);
        }
        return returnList;
    }
}
