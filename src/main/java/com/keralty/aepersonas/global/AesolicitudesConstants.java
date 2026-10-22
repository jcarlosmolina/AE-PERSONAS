package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>Aesolicitudes</code> model class.
 */
public final class AesolicitudesConstants {

    private AesolicitudesConstants() {

    }

    // Class
    /** <code>Aesolicitudes</code> class id. */
    public static final String CLASS_ID = "Clas_1431956094976663_Alias";
    /** <code>Aesolicitudes</code> class name. */
    public static final String CLASS_NAME = "Aesolicitudes";
    /** <code>Aesolicitudes</code> class alias. */
    public static final String CLASS_ALIAS = "Solicitud";
    /** <code>Ae_solicitudes</code> class table name. */
    public static final String TBL_NAME = "Ae_solicitudes";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "aesolicitudesidsolicitud,productosProducto,planesPlan,estadoContratoCodigo,aesolicitudesNumerosolicitud,aesolicitudesSwestado,aesolicitudesFechaasignacion,aesolicitudesCdmotanu,aesolicitudesCdmotdev,aesolicitudesFesolici,aesolicitudesLogin,aesolicitudesObservacion,aesolicitudesTiposolicitud";

    public static final String DSDSAESOLICITUDES = "DS_Ae_solicitudes";
    

    // Attribute (aesolicitudesidsolicitud)
    /** <code>aesolicitudesidsolicitud</code> attribute id. */
    public static final String ATTR_ID_AESOLICITUDESIDSOLICITUD = "Clas_1431956094976663Atr_1_Alias";
    /** <code>aesolicitudesidsolicitud</code> attribute name. */
    public static final String ATTR_NAME_AESOLICITUDESIDSOLICITUD = "aesolicitudesidsolicitud";
    /** <code>aesolicitudesidsolicitud</code> attribute alias. */
    public static final String ATTR_ALIAS_AESOLICITUDESIDSOLICITUD = "id_AE_SOLICITUDES";

    /** <code>aesolicitudesidsolicitud</code> attribute facet sequence. */
    public static final String PATH_FACETS_AESOLICITUDESIDSOLICITUD = "";
    /** Agents allowed to view the attribute aesolicitudesidsolicitud **/
    public static final String AESOLICITUDESIDSOLICITUD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (aesolicitudesNumerosolicitud)
    /** <code>aesolicitudesNumerosolicitud</code> attribute id. */
    public static final String ATTR_ID_AESOLICITUDESNUMEROSOLICITUD = "Clas_1431956094976663Atr_2_Alias";
    /** <code>aesolicitudesNumerosolicitud</code> attribute name. */
    public static final String ATTR_NAME_AESOLICITUDESNUMEROSOLICITUD = "aesolicitudesNumerosolicitud";
    /** <code>aesolicitudesNumerosolicitud</code> attribute alias. */
    public static final String ATTR_ALIAS_AESOLICITUDESNUMEROSOLICITUD = "Nº Solicitud";

    /** <code>aesolicitudesNumerosolicitud</code> attribute facet sequence. */
    public static final String PATH_FACETS_AESOLICITUDESNUMEROSOLICITUD = "";
    /** Agents allowed to view the attribute aesolicitudesNumerosolicitud **/
    public static final String AESOLICITUDESNUMEROSOLICITUD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (aesolicitudesSwestado)
    /** <code>aesolicitudesSwestado</code> attribute id. */
    public static final String ATTR_ID_AESOLICITUDESSWESTADO = "Clas_1431956094976663Atr_3_Alias";
    /** <code>aesolicitudesSwestado</code> attribute name. */
    public static final String ATTR_NAME_AESOLICITUDESSWESTADO = "aesolicitudesSwestado";
    /** <code>aesolicitudesSwestado</code> attribute alias. */
    public static final String ATTR_ALIAS_AESOLICITUDESSWESTADO = "Habilitada";

    /** <code>aesolicitudesSwestado</code> attribute facet sequence. */
    public static final String PATH_FACETS_AESOLICITUDESSWESTADO = "";
    /** Agents allowed to view the attribute aesolicitudesSwestado **/
    public static final String AESOLICITUDESSWESTADO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (aesolicitudesFechaasignacion)
    /** <code>aesolicitudesFechaasignacion</code> attribute id. */
    public static final String ATTR_ID_AESOLICITUDESFECHAASIGNACION = "Clas_1431956094976663Atr_4_Alias";
    /** <code>aesolicitudesFechaasignacion</code> attribute name. */
    public static final String ATTR_NAME_AESOLICITUDESFECHAASIGNACION = "aesolicitudesFechaasignacion";
    /** <code>aesolicitudesFechaasignacion</code> attribute alias. */
    public static final String ATTR_ALIAS_AESOLICITUDESFECHAASIGNACION = "Fecha asignación";

    /** <code>aesolicitudesFechaasignacion</code> attribute facet sequence. */
    public static final String PATH_FACETS_AESOLICITUDESFECHAASIGNACION = "";
    /** Agents allowed to view the attribute aesolicitudesFechaasignacion **/
    public static final String AESOLICITUDESFECHAASIGNACION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (aesolicitudesCdmotanu)
    /** <code>aesolicitudesCdmotanu</code> attribute id. */
    public static final String ATTR_ID_AESOLICITUDESCDMOTANU = "Clas_1431956094976663Atr_5_Alias";
    /** <code>aesolicitudesCdmotanu</code> attribute name. */
    public static final String ATTR_NAME_AESOLICITUDESCDMOTANU = "aesolicitudesCdmotanu";
    /** <code>aesolicitudesCdmotanu</code> attribute alias. */
    public static final String ATTR_ALIAS_AESOLICITUDESCDMOTANU = "Desc. anulación";

    /** <code>aesolicitudesCdmotanu</code> attribute facet sequence. */
    public static final String PATH_FACETS_AESOLICITUDESCDMOTANU = "";
    /** Agents allowed to view the attribute aesolicitudesCdmotanu **/
    public static final String AESOLICITUDESCDMOTANU_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (aesolicitudesCdmotdev)
    /** <code>aesolicitudesCdmotdev</code> attribute id. */
    public static final String ATTR_ID_AESOLICITUDESCDMOTDEV = "Clas_1431956094976663Atr_6_Alias";
    /** <code>aesolicitudesCdmotdev</code> attribute name. */
    public static final String ATTR_NAME_AESOLICITUDESCDMOTDEV = "aesolicitudesCdmotdev";
    /** <code>aesolicitudesCdmotdev</code> attribute alias. */
    public static final String ATTR_ALIAS_AESOLICITUDESCDMOTDEV = "Desc. devolución";

    /** <code>aesolicitudesCdmotdev</code> attribute facet sequence. */
    public static final String PATH_FACETS_AESOLICITUDESCDMOTDEV = "";
    /** Agents allowed to view the attribute aesolicitudesCdmotdev **/
    public static final String AESOLICITUDESCDMOTDEV_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (aesolicitudesFesolici)
    /** <code>aesolicitudesFesolici</code> attribute id. */
    public static final String ATTR_ID_AESOLICITUDESFESOLICI = "Clas_1431956094976663Atr_7_Alias";
    /** <code>aesolicitudesFesolici</code> attribute name. */
    public static final String ATTR_NAME_AESOLICITUDESFESOLICI = "aesolicitudesFesolici";
    /** <code>aesolicitudesFesolici</code> attribute alias. */
    public static final String ATTR_ALIAS_AESOLICITUDESFESOLICI = "Fecha elaboración";

    /** <code>aesolicitudesFesolici</code> attribute facet sequence. */
    public static final String PATH_FACETS_AESOLICITUDESFESOLICI = "";
    /** Agents allowed to view the attribute aesolicitudesFesolici **/
    public static final String AESOLICITUDESFESOLICI_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (aesolicitudesLogin)
    /** <code>aesolicitudesLogin</code> attribute id. */
    public static final String ATTR_ID_AESOLICITUDESLOGIN = "Clas_1431956094976663Atr_8_Alias";
    /** <code>aesolicitudesLogin</code> attribute name. */
    public static final String ATTR_NAME_AESOLICITUDESLOGIN = "aesolicitudesLogin";
    /** <code>aesolicitudesLogin</code> attribute alias. */
    public static final String ATTR_ALIAS_AESOLICITUDESLOGIN = "Usuario";

    /** <code>aesolicitudesLogin</code> attribute facet sequence. */
    public static final String PATH_FACETS_AESOLICITUDESLOGIN = "";
    /** Agents allowed to view the attribute aesolicitudesLogin **/
    public static final String AESOLICITUDESLOGIN_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (aesolicitudesObservacion)
    /** <code>aesolicitudesObservacion</code> attribute id. */
    public static final String ATTR_ID_AESOLICITUDESOBSERVACION = "Clas_1431956094976663Atr_9_Alias";
    /** <code>aesolicitudesObservacion</code> attribute name. */
    public static final String ATTR_NAME_AESOLICITUDESOBSERVACION = "aesolicitudesObservacion";
    /** <code>aesolicitudesObservacion</code> attribute alias. */
    public static final String ATTR_ALIAS_AESOLICITUDESOBSERVACION = "Observaciones";

    /** <code>aesolicitudesObservacion</code> attribute facet sequence. */
    public static final String PATH_FACETS_AESOLICITUDESOBSERVACION = "";
    /** Agents allowed to view the attribute aesolicitudesObservacion **/
    public static final String AESOLICITUDESOBSERVACION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (aesolicitudesTiposolicitud)
    /** <code>aesolicitudesTiposolicitud</code> attribute id. */
    public static final String ATTR_ID_AESOLICITUDESTIPOSOLICITUD = "Clas_1431956094976663Atr_10_Alias";
    /** <code>aesolicitudesTiposolicitud</code> attribute name. */
    public static final String ATTR_NAME_AESOLICITUDESTIPOSOLICITUD = "aesolicitudesTiposolicitud";
    /** <code>aesolicitudesTiposolicitud</code> attribute alias. */
    public static final String ATTR_ALIAS_AESOLICITUDESTIPOSOLICITUD = "Tipo solicitud";

    /** <code>aesolicitudesTiposolicitud</code> attribute facet sequence. */
    public static final String PATH_FACETS_AESOLICITUDESTIPOSOLICITUD = "";
    /** Agents allowed to view the attribute aesolicitudesTiposolicitud **/
    public static final String AESOLICITUDESTIPOSOLICITUD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (id_solicitud)
    /** <code>id_solicitud</code> field name. */
    public static final String FLD_AESOLICITUDESIDSOLICITUD = "id_solicitud";    
    /** <code>aesolicitudesidsolicitud</code> attribute field name. */
    public static final String ATTR_FIELD_AESOLICITUDESIDSOLICITUD = "aesolicitudesidsolicitud";
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
    public static final String FLD_ESTADOCONTRATOCODIGO = "Codigo";    
    /** <code>ESTADO_SOLICITUD.estadoContratoCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_ESTADO_SOLICITUD_ESTADOCONTRATOCODIGO = "estadoContratoCodigo";
    // Field (Numero_solicitud)
    /** <code>Numero_solicitud</code> field name. */
    public static final String FLD_AESOLICITUDESNUMEROSOLICITUD = "Numero_solicitud";    
    /** <code>Numero_solicitud</code> field length. */
    public static final int FLD_AESOLICITUDESNUMEROSOLICITUDLENGTH = 50;
    /** <code>aesolicitudesNumerosolicitud</code> attribute field name. */
    public static final String ATTR_FIELD_AESOLICITUDESNUMEROSOLICITUD = "aesolicitudesNumerosolicitud";
    // Field (Sw_estado)
    /** <code>Sw_estado</code> field name. */
    public static final String FLD_AESOLICITUDESSWESTADO = "Sw_estado";    
    /** <code>Sw_estado</code> field length. */
    public static final int FLD_AESOLICITUDESSWESTADOLENGTH = 2;
    /** <code>aesolicitudesSwestado</code> attribute field name. */
    public static final String ATTR_FIELD_AESOLICITUDESSWESTADO = "aesolicitudesSwestado";
    // Field (Fecha_asignacion)
    /** <code>Fecha_asignacion</code> field name. */
    public static final String FLD_AESOLICITUDESFECHAASIGNACION = "Fecha_asignacion";    
    /** <code>aesolicitudesFechaasignacion</code> attribute field name. */
    public static final String ATTR_FIELD_AESOLICITUDESFECHAASIGNACION = "aesolicitudesFechaasignacion";
    // Field (Cdmotanu)
    /** <code>Cdmotanu</code> field name. */
    public static final String FLD_AESOLICITUDESCDMOTANU = "Cdmotanu";    
    /** <code>Cdmotanu</code> field length. */
    public static final int FLD_AESOLICITUDESCDMOTANULENGTH = 250;
    /** <code>aesolicitudesCdmotanu</code> attribute field name. */
    public static final String ATTR_FIELD_AESOLICITUDESCDMOTANU = "aesolicitudesCdmotanu";
    // Field (Cdmotdev)
    /** <code>Cdmotdev</code> field name. */
    public static final String FLD_AESOLICITUDESCDMOTDEV = "Cdmotdev";    
    /** <code>Cdmotdev</code> field length. */
    public static final int FLD_AESOLICITUDESCDMOTDEVLENGTH = 250;
    /** <code>aesolicitudesCdmotdev</code> attribute field name. */
    public static final String ATTR_FIELD_AESOLICITUDESCDMOTDEV = "aesolicitudesCdmotdev";
    // Field (Fesolici)
    /** <code>Fesolici</code> field name. */
    public static final String FLD_AESOLICITUDESFESOLICI = "Fesolici";    
    /** <code>aesolicitudesFesolici</code> attribute field name. */
    public static final String ATTR_FIELD_AESOLICITUDESFESOLICI = "aesolicitudesFesolici";
    // Field (Login)
    /** <code>Login</code> field name. */
    public static final String FLD_AESOLICITUDESLOGIN = "Login";    
    /** <code>Login</code> field length. */
    public static final int FLD_AESOLICITUDESLOGINLENGTH = 50;
    /** <code>aesolicitudesLogin</code> attribute field name. */
    public static final String ATTR_FIELD_AESOLICITUDESLOGIN = "aesolicitudesLogin";
    // Field (Observacion)
    /** <code>Observacion</code> field name. */
    public static final String FLD_AESOLICITUDESOBSERVACION = "Observacion";    
    /** <code>Observacion</code> field length. */
    public static final int FLD_AESOLICITUDESOBSERVACIONLENGTH = 500;
    /** <code>aesolicitudesObservacion</code> attribute field name. */
    public static final String ATTR_FIELD_AESOLICITUDESOBSERVACION = "aesolicitudesObservacion";
    // Field (Tipo_solicitud)
    /** <code>Tipo_solicitud</code> field name. */
    public static final String FLD_AESOLICITUDESTIPOSOLICITUD = "Tipo_solicitud";    
    /** <code>Tipo_solicitud</code> field length. */
    public static final int FLD_AESOLICITUDESTIPOSOLICITUDLENGTH = 1;
    /** <code>aesolicitudesTiposolicitud</code> attribute field name. */
    public static final String ATTR_FIELD_AESOLICITUDESTIPOSOLICITUD = "aesolicitudesTiposolicitud";

    // Component role (ProductoT)
    /** <code>ProductoT</code> role id. */
    public static final String ROLE_ID_PRODUCTOT = "Agr_1431956226048423_Alias";
    /** <code>ProductoT</code> role name. */
    public static final String ROLE_NAME_PRODUCTOT = "productoT";
    /** <code>ProductoT</code> role alias. */
    public static final String ROLE_ALIAS_PRODUCTOT = "ProductoT";

    /** <code>ProductoT</code> inverse role name. */
    public static final String ROLE_INVNAME_PRODUCTOT = ProductosConstants.ROLE_NAME_AESOLICITUDES;
    /** <code>ProductoT</code> role facet sequence. */
    public static final String PATH_FACETS_PRODUCTOT = "";
    /** <code>ProductoT</code> role target class. */
    public static final String ROLE_TARGET_PRODUCTOT = ProductosConstants.CLASS_NAME;

    /** Agents allowed to navigate through ProductoT **/
    public static final String PRODUCTOT_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (PlanT)
    /** <code>PlanT</code> role id. */
    public static final String ROLE_ID_PLANT = "Agr_1431956226048544_Alias";
    /** <code>PlanT</code> role name. */
    public static final String ROLE_NAME_PLANT = "planT";
    /** <code>PlanT</code> role alias. */
    public static final String ROLE_ALIAS_PLANT = "PlanT";

    /** <code>PlanT</code> inverse role name. */
    public static final String ROLE_INVNAME_PLANT = PlanesConstants.ROLE_NAME_AESOLICITUDES;
    /** <code>PlanT</code> role facet sequence. */
    public static final String PATH_FACETS_PLANT = "";
    /** <code>PlanT</code> role target class. */
    public static final String ROLE_TARGET_PLANT = PlanesConstants.CLASS_NAME;

    /** Agents allowed to navigate through PlanT **/
    public static final String PLANT_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (ESTADOSOLICITUD)
    /** <code>ESTADOSOLICITUD</code> role id. */
    public static final String ROLE_ID_ESTADOSOLICITUD = "Agr_1431956357120359_Alias";
    /** <code>ESTADOSOLICITUD</code> role name. */
    public static final String ROLE_NAME_ESTADOSOLICITUD = "eSTADOSOLICITUD";
    /** <code>ESTADOSOLICITUD</code> role alias. */
    public static final String ROLE_ALIAS_ESTADOSOLICITUD = "Estado";

    /** <code>ESTADOSOLICITUD</code> inverse role name. */
    public static final String ROLE_INVNAME_ESTADOSOLICITUD = EstadoContratoConstants.ROLE_NAME_AESOLICITUDES;
    /** <code>ESTADOSOLICITUD</code> role facet sequence. */
    public static final String PATH_FACETS_ESTADOSOLICITUD = "";
    /** <code>ESTADOSOLICITUD</code> role target class. */
    public static final String ROLE_TARGET_ESTADOSOLICITUD = EstadoContratoConstants.CLASS_NAME;

    /** Agents allowed to navigate through ESTADOSOLICITUD **/
    public static final String ESTADOSOLICITUD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Compound role (Solicitud)
    /** <code>Solicitud</code> role id. */
    public static final String ROLE_ID_SOLICITUD = "Agr_1431957143552663_Alias";
    /** <code>Solicitud</code> role name. */
    public static final String ROLE_NAME_SOLICITUD = "solicitud";
    /** <code>Aesolicitudes</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUD = "Solicitud";


    /** <code>Solicitud</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUD = SolicitudConstants.ROLE_NAME_AESOLICITUDES;
    /** <code>Solicitud</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUD = "";
    /** <code>Solicitud</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUD = SolicitudConstants.CLASS_NAME;
    /** Agents allowed to navigate through Solicitud **/
    public static final String SOLICITUD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431956094976663Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>aesolicitudescrearpagrESTADOSOLICITUD</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_AESOLICITUDESCREARPAGRESTADOSOLICITUD = "p_agrESTADO_SOLICITUD";
    /** <code>aesolicitudescrearpagrESTADOSOLICITUD</code> inbound argument id. */
    public static final String ARG_ID_CREAR_AESOLICITUDESCREARPAGRESTADOSOLICITUD = "Clas_1431956094976663Ser_1Arg_4_Alias";
    /** <code>aesolicitudescrearpagrESTADOSOLICITUD</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_AESOLICITUDESCREARPAGRESTADOSOLICITUD = "Estado";
    /** <code>aesolicitudescrearpagrProductoT</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_AESOLICITUDESCREARPAGRPRODUCTOT = "p_agrProductoT";
    /** <code>aesolicitudescrearpagrProductoT</code> inbound argument id. */
    public static final String ARG_ID_CREAR_AESOLICITUDESCREARPAGRPRODUCTOT = "Clas_1431956094976663Ser_1Arg_15_Alias";
    /** <code>aesolicitudescrearpagrProductoT</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_AESOLICITUDESCREARPAGRPRODUCTOT = "ProductoT";
    /** <code>aesolicitudescrearpagrPlanT</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_AESOLICITUDESCREARPAGRPLANT = "p_agrPlanT";
    /** <code>aesolicitudescrearpagrPlanT</code> inbound argument id. */
    public static final String ARG_ID_CREAR_AESOLICITUDESCREARPAGRPLANT = "Clas_1431956094976663Ser_1Arg_16_Alias";
    /** <code>aesolicitudescrearpagrPlanT</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_AESOLICITUDESCREARPAGRPLANT = "PlanT";
    /** <code>aesolicitudescrearpatrLogin</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_AESOLICITUDESCREARPATRLOGIN = "p_atrLogin";
    /** <code>aesolicitudescrearpatrLogin</code> inbound argument id. */
    public static final String ARG_ID_CREAR_AESOLICITUDESCREARPATRLOGIN = "Clas_1431956094976663Ser_1Arg_6_Alias";
    /** <code>aesolicitudescrearpatrLogin</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_AESOLICITUDESCREARPATRLOGIN = "Usuario";
    /** <code>aesolicitudescrearpatrTiposolicitud</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_AESOLICITUDESCREARPATRTIPOSOLICITUD = "p_atrTipo_solicitud";
    /** <code>aesolicitudescrearpatrTiposolicitud</code> inbound argument id. */
    public static final String ARG_ID_CREAR_AESOLICITUDESCREARPATRTIPOSOLICITUD = "Clas_1431956094976663Ser_1Arg_7_Alias";
    /** <code>aesolicitudescrearpatrTiposolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_AESOLICITUDESCREARPATRTIPOSOLICITUD = "Tipo solicitud";
    /** <code>aesolicitudescrearpatrNumerosolicitud</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_AESOLICITUDESCREARPATRNUMEROSOLICITUD = "p_atrNumero_solicitud";
    /** <code>aesolicitudescrearpatrNumerosolicitud</code> inbound argument id. */
    public static final String ARG_ID_CREAR_AESOLICITUDESCREARPATRNUMEROSOLICITUD = "Clas_1431956094976663Ser_1Arg_18_Alias";
    /** <code>aesolicitudescrearpatrNumerosolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_AESOLICITUDESCREARPATRNUMEROSOLICITUD = "Nº Solicitud";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431956094976663Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>aesolicitudeseliminarpthisAESOLICITUDES</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_AESOLICITUDESELIMINARPTHISAESOLICITUDES = "p_thisAE_SOLICITUDES";
    /** <code>aesolicitudeseliminarpthisAESOLICITUDES</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_AESOLICITUDESELIMINARPTHISAESOLICITUDES = "Clas_1431956094976663Ser_2Arg_1_Alias";
    /** <code>aesolicitudeseliminarpthisAESOLICITUDES</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_AESOLICITUDESELIMINARPTHISAESOLICITUDES = "Solicitud";
    // Service (InsESTADOSOLICITUD)
    /** <code>InsESTADOSOLICITUD</code> service id. */
    public static final String SERV_ID_INSESTADOSOLICITUD = "Clas_1431956094976663Ser_4_Alias";
    /** <code>InsESTADOSOLICITUD</code> service name. */
    public static final String SERV_NAME_INSESTADOSOLICITUD = "InsESTADOSOLICITUD";
    /** <code>InsESTADOSOLICITUD</code> service alias. */
    public static final String SERV_ALIAS_INSESTADOSOLICITUD = "InsESTADO_SOLICITUD";
    /** Agents allowed to execute the service InsESTADOSOLICITUD **/
    public static final String INSESTADOSOLICITUD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>aesolicitudesInsESTADOSOLICITUDpthisAESOLICITUDES</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOSOLICITUD_AESOLICITUDESINSESTADOSOLICITUDPTHISAESOLICITUDES = "p_thisAE_SOLICITUDES";
    /** <code>aesolicitudesInsESTADOSOLICITUDpthisAESOLICITUDES</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOSOLICITUD_AESOLICITUDESINSESTADOSOLICITUDPTHISAESOLICITUDES = "Clas_1431956094976663Ser_4Arg_1_Alias";
    /** <code>aesolicitudesInsESTADOSOLICITUDpthisAESOLICITUDES</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOSOLICITUD_AESOLICITUDESINSESTADOSOLICITUDPTHISAESOLICITUDES = "Solicitudes";
    /** <code>aesolicitudesInsESTADOSOLICITUDpevcEstadoContrato</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOSOLICITUD_AESOLICITUDESINSESTADOSOLICITUDPEVCESTADOCONTRATO = "p_evcEstadoContrato";
    /** <code>aesolicitudesInsESTADOSOLICITUDpevcEstadoContrato</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOSOLICITUD_AESOLICITUDESINSESTADOSOLICITUDPEVCESTADOCONTRATO = "Clas_1431956094976663Ser_4Arg_2_Alias";
    /** <code>aesolicitudesInsESTADOSOLICITUDpevcEstadoContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOSOLICITUD_AESOLICITUDESINSESTADOSOLICITUDPEVCESTADOCONTRATO = "Estado";
    // Service (DelESTADOSOLICITUD)
    /** <code>DelESTADOSOLICITUD</code> service id. */
    public static final String SERV_ID_DELESTADOSOLICITUD = "Clas_1431956094976663Ser_5_Alias";
    /** <code>DelESTADOSOLICITUD</code> service name. */
    public static final String SERV_NAME_DELESTADOSOLICITUD = "DelESTADOSOLICITUD";
    /** <code>DelESTADOSOLICITUD</code> service alias. */
    public static final String SERV_ALIAS_DELESTADOSOLICITUD = "DelESTADO_SOLICITUD";
    /** Agents allowed to execute the service DelESTADOSOLICITUD **/
    public static final String DELESTADOSOLICITUD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>aesolicitudesDelESTADOSOLICITUDpthisAESOLICITUDES</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOSOLICITUD_AESOLICITUDESDELESTADOSOLICITUDPTHISAESOLICITUDES = "p_thisAE_SOLICITUDES";
    /** <code>aesolicitudesDelESTADOSOLICITUDpthisAESOLICITUDES</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOSOLICITUD_AESOLICITUDESDELESTADOSOLICITUDPTHISAESOLICITUDES = "Clas_1431956094976663Ser_5Arg_1_Alias";
    /** <code>aesolicitudesDelESTADOSOLICITUDpthisAESOLICITUDES</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOSOLICITUD_AESOLICITUDESDELESTADOSOLICITUDPTHISAESOLICITUDES = "Solicitudes";
    /** <code>aesolicitudesDelESTADOSOLICITUDpevcEstadoContrato</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOSOLICITUD_AESOLICITUDESDELESTADOSOLICITUDPEVCESTADOCONTRATO = "p_evcEstadoContrato";
    /** <code>aesolicitudesDelESTADOSOLICITUDpevcEstadoContrato</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOSOLICITUD_AESOLICITUDESDELESTADOSOLICITUDPEVCESTADOCONTRATO = "Clas_1431956094976663Ser_5Arg_2_Alias";
    /** <code>aesolicitudesDelESTADOSOLICITUDpevcEstadoContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOSOLICITUD_AESOLICITUDESDELESTADOSOLICITUDPEVCESTADOCONTRATO = "Estado";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1431956094976663Ser_7_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>aesolicitudesmodificarpthisAESOLICITUDES</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_AESOLICITUDESMODIFICARPTHISAESOLICITUDES = "p_thisAE_SOLICITUDES";
    /** <code>aesolicitudesmodificarpthisAESOLICITUDES</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_AESOLICITUDESMODIFICARPTHISAESOLICITUDES = "Clas_1431956094976663Ser_7Arg_1_Alias";
    /** <code>aesolicitudesmodificarpthisAESOLICITUDES</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_AESOLICITUDESMODIFICARPTHISAESOLICITUDES = "Solicitud";
    /** <code>aesolicitudesmodificarpNUMEROSOLICITUD</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_AESOLICITUDESMODIFICARPNUMEROSOLICITUD = "p_NUMERO_SOLICITUD";
    /** <code>aesolicitudesmodificarpNUMEROSOLICITUD</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_AESOLICITUDESMODIFICARPNUMEROSOLICITUD = "Clas_1431956094976663Ser_7Arg_2_Alias";
    /** <code>aesolicitudesmodificarpNUMEROSOLICITUD</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_AESOLICITUDESMODIFICARPNUMEROSOLICITUD = "Nº Solicitud";
    /** <code>aesolicitudesmodificarpSWESTADO</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_AESOLICITUDESMODIFICARPSWESTADO = "p_SW_ESTADO";
    /** <code>aesolicitudesmodificarpSWESTADO</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_AESOLICITUDESMODIFICARPSWESTADO = "Clas_1431956094976663Ser_7Arg_3_Alias";
    /** <code>aesolicitudesmodificarpSWESTADO</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_AESOLICITUDESMODIFICARPSWESTADO = "Habilitada";
    /** <code>aesolicitudesmodificarpFECHAESTADO</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_AESOLICITUDESMODIFICARPFECHAESTADO = "p_FECHA_ESTADO";
    /** <code>aesolicitudesmodificarpFECHAESTADO</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_AESOLICITUDESMODIFICARPFECHAESTADO = "Clas_1431956094976663Ser_7Arg_4_Alias";
    /** <code>aesolicitudesmodificarpFECHAESTADO</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_AESOLICITUDESMODIFICARPFECHAESTADO = "Fecha estado";
    /** <code>aesolicitudesmodificarpCDMOTANU</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_AESOLICITUDESMODIFICARPCDMOTANU = "p_CDMOTANU";
    /** <code>aesolicitudesmodificarpCDMOTANU</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_AESOLICITUDESMODIFICARPCDMOTANU = "Clas_1431956094976663Ser_7Arg_5_Alias";
    /** <code>aesolicitudesmodificarpCDMOTANU</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_AESOLICITUDESMODIFICARPCDMOTANU = "Desc. anulación";
    /** <code>aesolicitudesmodificarpCDMOTDEV</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_AESOLICITUDESMODIFICARPCDMOTDEV = "p_CDMOTDEV";
    /** <code>aesolicitudesmodificarpCDMOTDEV</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_AESOLICITUDESMODIFICARPCDMOTDEV = "Clas_1431956094976663Ser_7Arg_6_Alias";
    /** <code>aesolicitudesmodificarpCDMOTDEV</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_AESOLICITUDESMODIFICARPCDMOTDEV = "Desc. devolución";
    /** <code>aesolicitudesmodificarpFESOLICI</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_AESOLICITUDESMODIFICARPFESOLICI = "p_FESOLICI";
    /** <code>aesolicitudesmodificarpFESOLICI</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_AESOLICITUDESMODIFICARPFESOLICI = "Clas_1431956094976663Ser_7Arg_7_Alias";
    /** <code>aesolicitudesmodificarpFESOLICI</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_AESOLICITUDESMODIFICARPFESOLICI = "Fecha elaboración";
    /** <code>aesolicitudesmodificarpLOGIN</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_AESOLICITUDESMODIFICARPLOGIN = "p_LOGIN";
    /** <code>aesolicitudesmodificarpLOGIN</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_AESOLICITUDESMODIFICARPLOGIN = "Clas_1431956094976663Ser_7Arg_8_Alias";
    /** <code>aesolicitudesmodificarpLOGIN</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_AESOLICITUDESMODIFICARPLOGIN = "Usuario";
    /** <code>aesolicitudesmodificarpOBSERVACION</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_AESOLICITUDESMODIFICARPOBSERVACION = "p_OBSERVACION";
    /** <code>aesolicitudesmodificarpOBSERVACION</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_AESOLICITUDESMODIFICARPOBSERVACION = "Clas_1431956094976663Ser_7Arg_9_Alias";
    /** <code>aesolicitudesmodificarpOBSERVACION</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_AESOLICITUDESMODIFICARPOBSERVACION = "Observaciones";
    /** <code>aesolicitudesmodificarpTIPOSOLICITUD</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_AESOLICITUDESMODIFICARPTIPOSOLICITUD = "p_TIPO_SOLICITUD";
    /** <code>aesolicitudesmodificarpTIPOSOLICITUD</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_AESOLICITUDESMODIFICARPTIPOSOLICITUD = "Clas_1431956094976663Ser_7Arg_10_Alias";
    /** <code>aesolicitudesmodificarpTIPOSOLICITUD</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_AESOLICITUDESMODIFICARPTIPOSOLICITUD = "Tipo solicitud";
    // Service (modificarNumSolicitud)
    /** <code>modificarNumSolicitud</code> service id. */
    public static final String SERV_ID_MODIFICARNUMSOLICITUD = "Clas_1431956094976663Ser_8_Alias";
    /** <code>modificarNumSolicitud</code> service name. */
    public static final String SERV_NAME_MODIFICARNUMSOLICITUD = "modificarNumSolicitud";
    /** <code>modificarNumSolicitud</code> service alias. */
    public static final String SERV_ALIAS_MODIFICARNUMSOLICITUD = "modificarNumSolicitud";
    /** Agents allowed to execute the service modificarNumSolicitud **/
    public static final String MODIFICARNUMSOLICITUD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>aesolicitudesmodificarNumSolicitudpthisAESOLICITUDES</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARNUMSOLICITUD_AESOLICITUDESMODIFICARNUMSOLICITUDPTHISAESOLICITUDES = "p_thisAE_SOLICITUDES";
    /** <code>aesolicitudesmodificarNumSolicitudpthisAESOLICITUDES</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARNUMSOLICITUD_AESOLICITUDESMODIFICARNUMSOLICITUDPTHISAESOLICITUDES = "Clas_1431956094976663Ser_8Arg_1_Alias";
    /** <code>aesolicitudesmodificarNumSolicitudpthisAESOLICITUDES</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARNUMSOLICITUD_AESOLICITUDESMODIFICARNUMSOLICITUDPTHISAESOLICITUDES = "Solicitud";
    /** <code>aesolicitudesmodificarNumSolicitudpNUMEROSOLICITUD</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARNUMSOLICITUD_AESOLICITUDESMODIFICARNUMSOLICITUDPNUMEROSOLICITUD = "p_NUMERO_SOLICITUD";
    /** <code>aesolicitudesmodificarNumSolicitudpNUMEROSOLICITUD</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARNUMSOLICITUD_AESOLICITUDESMODIFICARNUMSOLICITUDPNUMEROSOLICITUD = "Clas_1431956094976663Ser_8Arg_2_Alias";
    /** <code>aesolicitudesmodificarNumSolicitudpNUMEROSOLICITUD</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARNUMSOLICITUD_AESOLICITUDESMODIFICARNUMSOLICITUDPNUMEROSOLICITUD = "Nº Solicitud";
    // Service (cambiarEstado)
    /** <code>cambiarEstado</code> service id. */
    public static final String SERV_ID_CAMBIARESTADO = "Clas_1431956094976663Ser_14_Alias";
    /** <code>cambiarEstado</code> service name. */
    public static final String SERV_NAME_CAMBIARESTADO = "cambiarEstado";
    /** <code>cambiarEstado</code> service alias. */
    public static final String SERV_ALIAS_CAMBIARESTADO = "cambiarEstado";
    /** Agents allowed to execute the service cambiarEstado **/
    public static final String CAMBIARESTADO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>aesolicitudescambiarEstadopthisAESOLICITUDES</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARESTADO_AESOLICITUDESCAMBIARESTADOPTHISAESOLICITUDES = "p_thisAE_SOLICITUDES";
    /** <code>aesolicitudescambiarEstadopthisAESOLICITUDES</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARESTADO_AESOLICITUDESCAMBIARESTADOPTHISAESOLICITUDES = "Clas_1431956094976663Ser_14Arg_1_Alias";
    /** <code>aesolicitudescambiarEstadopthisAESOLICITUDES</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARESTADO_AESOLICITUDESCAMBIARESTADOPTHISAESOLICITUDES = "Solicitud";
    /** <code>aesolicitudescambiarEstadopSWESTADO</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARESTADO_AESOLICITUDESCAMBIARESTADOPSWESTADO = "p_SW_ESTADO";
    /** <code>aesolicitudescambiarEstadopSWESTADO</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARESTADO_AESOLICITUDESCAMBIARESTADOPSWESTADO = "Clas_1431956094976663Ser_14Arg_2_Alias";
    /** <code>aesolicitudescambiarEstadopSWESTADO</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARESTADO_AESOLICITUDESCAMBIARESTADOPSWESTADO = "Habilitada";
    // Service (modificarFechaElab)
    /** <code>modificarFechaElab</code> service id. */
    public static final String SERV_ID_MODIFICARFECHAELAB = "Clas_1431956094976663Ser_15_Alias";
    /** <code>modificarFechaElab</code> service name. */
    public static final String SERV_NAME_MODIFICARFECHAELAB = "modificarFechaElab";
    /** <code>modificarFechaElab</code> service alias. */
    public static final String SERV_ALIAS_MODIFICARFECHAELAB = "modificarFechaElab";
    /** Agents allowed to execute the service modificarFechaElab **/
    public static final String MODIFICARFECHAELAB_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    // Inbound arguments
    /** <code>aesolicitudesmodificarFechaElabpthisAESOLICITUDES</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARFECHAELAB_AESOLICITUDESMODIFICARFECHAELABPTHISAESOLICITUDES = "p_thisAE_SOLICITUDES";
    /** <code>aesolicitudesmodificarFechaElabpthisAESOLICITUDES</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARFECHAELAB_AESOLICITUDESMODIFICARFECHAELABPTHISAESOLICITUDES = "Clas_1431956094976663Ser_15Arg_1_Alias";
    /** <code>aesolicitudesmodificarFechaElabpthisAESOLICITUDES</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARFECHAELAB_AESOLICITUDESMODIFICARFECHAELABPTHISAESOLICITUDES = "Solicitud";
    /** <code>aesolicitudesmodificarFechaElabpeFecha</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARFECHAELAB_AESOLICITUDESMODIFICARFECHAELABPEFECHA = "peFecha";
    /** <code>aesolicitudesmodificarFechaElabpeFecha</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARFECHAELAB_AESOLICITUDESMODIFICARFECHAELABPEFECHA = "Clas_1431956094976663Ser_15Arg_2_Alias";
    /** <code>aesolicitudesmodificarFechaElabpeFecha</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARFECHAELAB_AESOLICITUDESMODIFICARFECHAELABPEFECHA = "Fecha elaboración";
    // Service (TNUEVAAFILIACION)
    /** <code>TNUEVAAFILIACION</code> service id. */
    public static final String SERV_ID_TNUEVAAFILIACION = "Clas_1431956094976663Ser_9_Alias";
    /** <code>TNUEVAAFILIACION</code> service name. */
    public static final String SERV_NAME_TNUEVAAFILIACION = "TNUEVAAFILIACION";
    /** <code>TNUEVAAFILIACION</code> service alias. */
    public static final String SERV_ALIAS_TNUEVAAFILIACION = "Nueva afiliación";
    /** Agents allowed to execute the service TNUEVAAFILIACION **/
    public static final String TNUEVAAFILIACION_SRVAGENTS = "Admin,SuperAdmin,Asesor";
    // Preconditions
    /** <code>TNUEVAAFILIACION</code> precondition 0 id. */
    public static final String PRE_ID_TNUEVAAFILIACION_0 = "Clas_1431956094976663Pre_29_MsgError";
    // Inbound arguments
    /** <code>aesolicitudesTNUEVAAFILIACIONptpagrProducto</code> inbound argument name. */
    public static final String ARG_NAME_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTPAGRPRODUCTO = "pt_p_agrProducto";
    /** <code>aesolicitudesTNUEVAAFILIACIONptpagrProducto</code> inbound argument id. */
    public static final String ARG_ID_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTPAGRPRODUCTO = "Clas_1431956094976663Ser_9Arg_3_Alias";
    /** <code>aesolicitudesTNUEVAAFILIACIONptpagrProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTPAGRPRODUCTO = "Producto";
    /** <code>aesolicitudesTNUEVAAFILIACIONptpagrPlan</code> inbound argument name. */
    public static final String ARG_NAME_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTPAGRPLAN = "pt_p_agrPlan";
    /** <code>aesolicitudesTNUEVAAFILIACIONptpagrPlan</code> inbound argument id. */
    public static final String ARG_ID_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTPAGRPLAN = "Clas_1431956094976663Ser_9Arg_4_Alias";
    /** <code>aesolicitudesTNUEVAAFILIACIONptpagrPlan</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTPAGRPLAN = "Plan";
    /** <code>aesolicitudesTNUEVAAFILIACIONptProteccionDatos</code> inbound argument name. */
    public static final String ARG_NAME_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTPROTECCIONDATOS = "pt_ProteccionDatos";
    /** <code>aesolicitudesTNUEVAAFILIACIONptProteccionDatos</code> inbound argument id. */
    public static final String ARG_ID_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTPROTECCIONDATOS = "Clas_1431956094976663Ser_9Arg_36_Alias";
    /** <code>aesolicitudesTNUEVAAFILIACIONptProteccionDatos</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTPROTECCIONDATOS = "Protección Datos";
    /** <code>aesolicitudesTNUEVAAFILIACIONptpagrGrupoAsociado</code> inbound argument name. */
    public static final String ARG_NAME_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTPAGRGRUPOASOCIADO = "pt_p_agrGrupoAsociado";
    /** <code>aesolicitudesTNUEVAAFILIACIONptpagrGrupoAsociado</code> inbound argument id. */
    public static final String ARG_ID_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTPAGRGRUPOASOCIADO = "Clas_1431956094976663Ser_9Arg_104_Alias";
    /** <code>aesolicitudesTNUEVAAFILIACIONptpagrGrupoAsociado</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTPAGRGRUPOASOCIADO = "Grupo asociado";
    /** <code>aesolicitudesTNUEVAAFILIACIONptpatrFInicioContrato</code> inbound argument name. */
    public static final String ARG_NAME_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTPATRFINICIOCONTRATO = "pt_p_atrFInicioContrato";
    /** <code>aesolicitudesTNUEVAAFILIACIONptpatrFInicioContrato</code> inbound argument id. */
    public static final String ARG_ID_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTPATRFINICIOCONTRATO = "Clas_1431956094976663Ser_9Arg_105_Alias";
    /** <code>aesolicitudesTNUEVAAFILIACIONptpatrFInicioContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTPATRFINICIOCONTRATO = "Fecha inicio contratación";
    /** <code>aesolicitudesTNUEVAAFILIACIONptpatrEsTraslado</code> inbound argument name. */
    public static final String ARG_NAME_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTPATRESTRASLADO = "pt_p_atrEsTraslado";
    /** <code>aesolicitudesTNUEVAAFILIACIONptpatrEsTraslado</code> inbound argument id. */
    public static final String ARG_ID_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTPATRESTRASLADO = "Clas_1431956094976663Ser_9Arg_106_Alias";
    /** <code>aesolicitudesTNUEVAAFILIACIONptpatrEsTraslado</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTPATRESTRASLADO = "Es traslado";
    /** <code>aesolicitudesTNUEVAAFILIACIONpDirector</code> inbound argument name. */
    public static final String ARG_NAME_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPDIRECTOR = "pDirector";
    /** <code>aesolicitudesTNUEVAAFILIACIONpDirector</code> inbound argument id. */
    public static final String ARG_ID_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPDIRECTOR = "Clas_1431956094976663Ser_9Arg_2675_Alias";
    /** <code>aesolicitudesTNUEVAAFILIACIONpDirector</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPDIRECTOR = "Director";
    /** <code>aesolicitudesTNUEVAAFILIACIONptProrrateo</code> inbound argument name. */
    public static final String ARG_NAME_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTPRORRATEO = "ptProrrateo";
    /** <code>aesolicitudesTNUEVAAFILIACIONptProrrateo</code> inbound argument id. */
    public static final String ARG_ID_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTPRORRATEO = "Clas_1431956094976663Ser_9Arg_4431_Alias";
    /** <code>aesolicitudesTNUEVAAFILIACIONptProrrateo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTPRORRATEO = "Porcentaje de prorrateo";
    /** <code>aesolicitudesTNUEVAAFILIACIONptTipoFactura</code> inbound argument name. */
    public static final String ARG_NAME_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTTIPOFACTURA = "ptTipoFactura";
    /** <code>aesolicitudesTNUEVAAFILIACIONptTipoFactura</code> inbound argument id. */
    public static final String ARG_ID_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTTIPOFACTURA = "Clas_1431956094976663Ser_9Arg_4476_Alias";
    /** <code>aesolicitudesTNUEVAAFILIACIONptTipoFactura</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTTIPOFACTURA = "Tipo Factura";
    /** <code>aesolicitudesTNUEVAAFILIACIONptMarcaCarnet</code> inbound argument name. */
    public static final String ARG_NAME_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTMARCACARNET = "ptMarcaCarnet";
    /** <code>aesolicitudesTNUEVAAFILIACIONptMarcaCarnet</code> inbound argument id. */
    public static final String ARG_ID_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTMARCACARNET = "Clas_1431956094976663Ser_9Arg_6678_Alias";
    /** <code>aesolicitudesTNUEVAAFILIACIONptMarcaCarnet</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTMARCACARNET = "Envío carnet físico";
    /** <code>aesolicitudesTNUEVAAFILIACIONptAvisoMarcaCarnet</code> inbound argument name. */
    public static final String ARG_NAME_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTAVISOMARCACARNET = "ptAvisoMarcaCarnet";
    /** <code>aesolicitudesTNUEVAAFILIACIONptAvisoMarcaCarnet</code> inbound argument id. */
    public static final String ARG_ID_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTAVISOMARCACARNET = "Clas_1431956094976663Ser_9Arg_6681_Alias";
    /** <code>aesolicitudesTNUEVAAFILIACIONptAvisoMarcaCarnet</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTAVISOMARCACARNET = "ptAvisoMarcaCarnet";
    /** <code>aesolicitudesTNUEVAAFILIACIONptSoloDiaUno</code> inbound argument name. */
    public static final String ARG_NAME_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTSOLODIAUNO = "ptSoloDiaUno";
    /** <code>aesolicitudesTNUEVAAFILIACIONptSoloDiaUno</code> inbound argument id. */
    public static final String ARG_ID_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTSOLODIAUNO = "Clas_1431956094976663Ser_9Arg_6793_Alias";
    /** <code>aesolicitudesTNUEVAAFILIACIONptSoloDiaUno</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTSOLODIAUNO = "ptSoloDiaUno";
    // Outbound arguments
    /** <code>aesolicitudesTNUEVAAFILIACIONptpsSolicitud</code> outbound argument name. */
    public static final String ARG_NAME_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTPSSOLICITUD = "aesolicitudesTNUEVAAFILIACIONptpsSolicitud";
    /** <code>aesolicitudesTNUEVAAFILIACIONptpsSolicitud</code> outbound argument id. */
    public static final String ARG_ID_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTPSSOLICITUD = "Clas_1431956094976663Ser_9Arg_107_Alias";
    /** <code>aesolicitudesTNUEVAAFILIACIONptpsSolicitud</code> outbound argument alias. */
    public static final String ARG_ALIAS_TNUEVAAFILIACION_AESOLICITUDESTNUEVAAFILIACIONPTPSSOLICITUD = "Solicitud";
    // Service (TCREARFISICA)
    /** <code>TCREARFISICA</code> service id. */
    public static final String SERV_ID_TCREARFISICA = "Clas_1431956094976663Ser_11_Alias";
    /** <code>TCREARFISICA</code> service name. */
    public static final String SERV_NAME_TCREARFISICA = "TCREARFISICA";
    /** <code>TCREARFISICA</code> service alias. */
    public static final String SERV_ALIAS_TCREARFISICA = "Crear solicitud física";
    /** Agents allowed to execute the service TCREARFISICA **/
    public static final String TCREARFISICA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>aesolicitudesTCREARFISICAptpagrProducto</code> inbound argument name. */
    public static final String ARG_NAME_TCREARFISICA_AESOLICITUDESTCREARFISICAPTPAGRPRODUCTO = "pt_p_agrProducto";
    /** <code>aesolicitudesTCREARFISICAptpagrProducto</code> inbound argument id. */
    public static final String ARG_ID_TCREARFISICA_AESOLICITUDESTCREARFISICAPTPAGRPRODUCTO = "Clas_1431956094976663Ser_11Arg_3_Alias";
    /** <code>aesolicitudesTCREARFISICAptpagrProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARFISICA_AESOLICITUDESTCREARFISICAPTPAGRPRODUCTO = "Producto";
    /** <code>aesolicitudesTCREARFISICAptpatrLOGIN</code> inbound argument name. */
    public static final String ARG_NAME_TCREARFISICA_AESOLICITUDESTCREARFISICAPTPATRLOGIN = "pt_p_atrLOGIN";
    /** <code>aesolicitudesTCREARFISICAptpatrLOGIN</code> inbound argument id. */
    public static final String ARG_ID_TCREARFISICA_AESOLICITUDESTCREARFISICAPTPATRLOGIN = "Clas_1431956094976663Ser_11Arg_7_Alias";
    /** <code>aesolicitudesTCREARFISICAptpatrLOGIN</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARFISICA_AESOLICITUDESTCREARFISICAPTPATRLOGIN = "Usuario";
    /** <code>aesolicitudesTCREARFISICAptpNUMEROSOLICITUD</code> inbound argument name. */
    public static final String ARG_NAME_TCREARFISICA_AESOLICITUDESTCREARFISICAPTPNUMEROSOLICITUD = "pt_p_NUMERO_SOLICITUD";
    /** <code>aesolicitudesTCREARFISICAptpNUMEROSOLICITUD</code> inbound argument id. */
    public static final String ARG_ID_TCREARFISICA_AESOLICITUDESTCREARFISICAPTPNUMEROSOLICITUD = "Clas_1431956094976663Ser_11Arg_11_Alias";
    /** <code>aesolicitudesTCREARFISICAptpNUMEROSOLICITUD</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARFISICA_AESOLICITUDESTCREARFISICAPTPNUMEROSOLICITUD = "Nº Solicitud";
    /** <code>aesolicitudesTCREARFISICAptpSWESTADO</code> inbound argument name. */
    public static final String ARG_NAME_TCREARFISICA_AESOLICITUDESTCREARFISICAPTPSWESTADO = "pt_p_SW_ESTADO";
    /** <code>aesolicitudesTCREARFISICAptpSWESTADO</code> inbound argument id. */
    public static final String ARG_ID_TCREARFISICA_AESOLICITUDESTCREARFISICAPTPSWESTADO = "Clas_1431956094976663Ser_11Arg_12_Alias";
    /** <code>aesolicitudesTCREARFISICAptpSWESTADO</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARFISICA_AESOLICITUDESTCREARFISICAPTPSWESTADO = "Habilitada";
    /** <code>aesolicitudesTCREARFISICAptpFECHAESTADO</code> inbound argument name. */
    public static final String ARG_NAME_TCREARFISICA_AESOLICITUDESTCREARFISICAPTPFECHAESTADO = "pt_p_FECHA_ESTADO";
    /** <code>aesolicitudesTCREARFISICAptpFECHAESTADO</code> inbound argument id. */
    public static final String ARG_ID_TCREARFISICA_AESOLICITUDESTCREARFISICAPTPFECHAESTADO = "Clas_1431956094976663Ser_11Arg_13_Alias";
    /** <code>aesolicitudesTCREARFISICAptpFECHAESTADO</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARFISICA_AESOLICITUDESTCREARFISICAPTPFECHAESTADO = "Fecha estado";
    // Service (TINCLUSIONSC)
    /** <code>TINCLUSIONSC</code> service id. */
    public static final String SERV_ID_TINCLUSIONSC = "Clas_1431956094976663Ser_13_Alias";
    /** <code>TINCLUSIONSC</code> service name. */
    public static final String SERV_NAME_TINCLUSIONSC = "TINCLUSIONSC";
    /** <code>TINCLUSIONSC</code> service alias. */
    public static final String SERV_ALIAS_TINCLUSIONSC = "Inclusión";
    /** Agents allowed to execute the service TINCLUSIONSC **/
    public static final String TINCLUSIONSC_SRVAGENTS = "Admin,SuperAdmin,Asesor";
    // Preconditions
    /** <code>TINCLUSIONSC</code> precondition 0 id. */
    public static final String PRE_ID_TINCLUSIONSC_0 = "Clas_1431956094976663Pre_30_MsgError";
    // Inbound arguments
    /** <code>aesolicitudesTINCLUSIONSCptpagrProducto</code> inbound argument name. */
    public static final String ARG_NAME_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTPAGRPRODUCTO = "pt_p_agrProducto";
    /** <code>aesolicitudesTINCLUSIONSCptpagrProducto</code> inbound argument id. */
    public static final String ARG_ID_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTPAGRPRODUCTO = "Clas_1431956094976663Ser_13Arg_2_Alias";
    /** <code>aesolicitudesTINCLUSIONSCptpagrProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTPAGRPRODUCTO = "Producto";
    /** <code>aesolicitudesTINCLUSIONSCptpagrPlan</code> inbound argument name. */
    public static final String ARG_NAME_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTPAGRPLAN = "pt_p_agrPlan";
    /** <code>aesolicitudesTINCLUSIONSCptpagrPlan</code> inbound argument id. */
    public static final String ARG_ID_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTPAGRPLAN = "Clas_1431956094976663Ser_13Arg_3_Alias";
    /** <code>aesolicitudesTINCLUSIONSCptpagrPlan</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTPAGRPLAN = "Plan";
    /** <code>aesolicitudesTINCLUSIONSCptProteccionDatos</code> inbound argument name. */
    public static final String ARG_NAME_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTPROTECCIONDATOS = "pt_ProteccionDatos";
    /** <code>aesolicitudesTINCLUSIONSCptProteccionDatos</code> inbound argument id. */
    public static final String ARG_ID_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTPROTECCIONDATOS = "Clas_1431956094976663Ser_13Arg_4_Alias";
    /** <code>aesolicitudesTINCLUSIONSCptProteccionDatos</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTPROTECCIONDATOS = "Protección Datos";
    /** <code>aesolicitudesTINCLUSIONSCptpatrFInicioContrato</code> inbound argument name. */
    public static final String ARG_NAME_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTPATRFINICIOCONTRATO = "pt_p_atrFInicioContrato";
    /** <code>aesolicitudesTINCLUSIONSCptpatrFInicioContrato</code> inbound argument id. */
    public static final String ARG_ID_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTPATRFINICIOCONTRATO = "Clas_1431956094976663Ser_13Arg_5_Alias";
    /** <code>aesolicitudesTINCLUSIONSCptpatrFInicioContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTPATRFINICIOCONTRATO = "Fecha inicio contratación";
    /** <code>aesolicitudesTINCLUSIONSCptpatrNumContratoInclusion</code> inbound argument name. */
    public static final String ARG_NAME_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTPATRNUMCONTRATOINCLUSION = "pt_p_atrNumContratoInclusion";
    /** <code>aesolicitudesTINCLUSIONSCptpatrNumContratoInclusion</code> inbound argument id. */
    public static final String ARG_ID_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTPATRNUMCONTRATOINCLUSION = "Clas_1431956094976663Ser_13Arg_6_Alias";
    /** <code>aesolicitudesTINCLUSIONSCptpatrNumContratoInclusion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTPATRNUMCONTRATOINCLUSION = "Nº Contrato Inclusión";
    /** <code>aesolicitudesTINCLUSIONSCptpatrNumFamilia</code> inbound argument name. */
    public static final String ARG_NAME_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTPATRNUMFAMILIA = "pt_p_atrNumFamilia";
    /** <code>aesolicitudesTINCLUSIONSCptpatrNumFamilia</code> inbound argument id. */
    public static final String ARG_ID_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTPATRNUMFAMILIA = "Clas_1431956094976663Ser_13Arg_7_Alias";
    /** <code>aesolicitudesTINCLUSIONSCptpatrNumFamilia</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTPATRNUMFAMILIA = "Nº Familia";
    /** <code>aesolicitudesTINCLUSIONSCpDirector</code> inbound argument name. */
    public static final String ARG_NAME_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPDIRECTOR = "pDirector";
    /** <code>aesolicitudesTINCLUSIONSCpDirector</code> inbound argument id. */
    public static final String ARG_ID_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPDIRECTOR = "Clas_1431956094976663Ser_13Arg_8_Alias";
    /** <code>aesolicitudesTINCLUSIONSCpDirector</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPDIRECTOR = "Director";
    /** <code>aesolicitudesTINCLUSIONSCptMarcaCarnet</code> inbound argument name. */
    public static final String ARG_NAME_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTMARCACARNET = "ptMarcaCarnet";
    /** <code>aesolicitudesTINCLUSIONSCptMarcaCarnet</code> inbound argument id. */
    public static final String ARG_ID_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTMARCACARNET = "Clas_1431956094976663Ser_13Arg_3941_Alias";
    /** <code>aesolicitudesTINCLUSIONSCptMarcaCarnet</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTMARCACARNET = "Envío carnet físico";
    /** <code>aesolicitudesTINCLUSIONSCptAvisoMarcaCarnet</code> inbound argument name. */
    public static final String ARG_NAME_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTAVISOMARCACARNET = "ptAvisoMarcaCarnet";
    /** <code>aesolicitudesTINCLUSIONSCptAvisoMarcaCarnet</code> inbound argument id. */
    public static final String ARG_ID_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTAVISOMARCACARNET = "Clas_1431956094976663Ser_13Arg_3943_Alias";
    /** <code>aesolicitudesTINCLUSIONSCptAvisoMarcaCarnet</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTAVISOMARCACARNET = "ptAvisoMarcaCarnet";
    /** <code>aesolicitudesTINCLUSIONSCptSoloDiaUno</code> inbound argument name. */
    public static final String ARG_NAME_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTSOLODIAUNO = "ptSoloDiaUno";
    /** <code>aesolicitudesTINCLUSIONSCptSoloDiaUno</code> inbound argument id. */
    public static final String ARG_ID_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTSOLODIAUNO = "Clas_1431956094976663Ser_13Arg_4055_Alias";
    /** <code>aesolicitudesTINCLUSIONSCptSoloDiaUno</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTSOLODIAUNO = "ptSoloDiaUno";
    // Outbound arguments
    /** <code>aesolicitudesTINCLUSIONSCptpsSolicitud</code> outbound argument name. */
    public static final String ARG_NAME_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTPSSOLICITUD = "aesolicitudesTINCLUSIONSCptpsSolicitud";
    /** <code>aesolicitudesTINCLUSIONSCptpsSolicitud</code> outbound argument id. */
    public static final String ARG_ID_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTPSSOLICITUD = "Clas_1431956094976663Ser_13Arg_9_Alias";
    /** <code>aesolicitudesTINCLUSIONSCptpsSolicitud</code> outbound argument alias. */
    public static final String ARG_ALIAS_TINCLUSIONSC_AESOLICITUDESTINCLUSIONSCPTPSSOLICITUD = "Solicitud";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_AESOLICITUDESNUMEROSOLICITUD.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_AESOLICITUDESSWESTADO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_AESOLICITUDESFECHAASIGNACION.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_AESOLICITUDESCDMOTANU.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_AESOLICITUDESCDMOTDEV.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_AESOLICITUDESFESOLICI.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_AESOLICITUDESLOGIN.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_AESOLICITUDESOBSERVACION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_AESOLICITUDESTIPOSOLICITUD.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_AESOLICITUDESIDSOLICITUD.toUpperCase(), AESOLICITUDESIDSOLICITUD_AGENTS);
    	attributeAgents.put(ATTR_NAME_AESOLICITUDESNUMEROSOLICITUD.toUpperCase(), AESOLICITUDESNUMEROSOLICITUD_AGENTS);
    	attributeAgents.put(ATTR_NAME_AESOLICITUDESSWESTADO.toUpperCase(), AESOLICITUDESSWESTADO_AGENTS);
    	attributeAgents.put(ATTR_NAME_AESOLICITUDESFECHAASIGNACION.toUpperCase(), AESOLICITUDESFECHAASIGNACION_AGENTS);
    	attributeAgents.put(ATTR_NAME_AESOLICITUDESCDMOTANU.toUpperCase(), AESOLICITUDESCDMOTANU_AGENTS);
    	attributeAgents.put(ATTR_NAME_AESOLICITUDESCDMOTDEV.toUpperCase(), AESOLICITUDESCDMOTDEV_AGENTS);
    	attributeAgents.put(ATTR_NAME_AESOLICITUDESFESOLICI.toUpperCase(), AESOLICITUDESFESOLICI_AGENTS);
    	attributeAgents.put(ATTR_NAME_AESOLICITUDESLOGIN.toUpperCase(), AESOLICITUDESLOGIN_AGENTS);
    	attributeAgents.put(ATTR_NAME_AESOLICITUDESOBSERVACION.toUpperCase(), AESOLICITUDESOBSERVACION_AGENTS);
    	attributeAgents.put(ATTR_NAME_AESOLICITUDESTIPOSOLICITUD.toUpperCase(), AESOLICITUDESTIPOSOLICITUD_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_SOLICITUD.toUpperCase(), SOLICITUD_AGENTS);
        roleAgents.put(ROLE_NAME_PRODUCTOT.toUpperCase(), PRODUCTOT_AGENTS);
        roleAgents.put(ROLE_NAME_PLANT.toUpperCase(), PLANT_AGENTS);
        roleAgents.put(ROLE_NAME_ESTADOSOLICITUD.toUpperCase(), ESTADOSOLICITUD_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'Aesolicitudes', it returns the identification keys
     * - If className is a facet of the inheritance net of 'Aesolicitudes', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_AESOLICITUDESIDSOLICITUD);
        }
        // Facet 'Aesolicitudes' (This facet)
        if (AesolicitudesConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_AESOLICITUDESIDSOLICITUD);
        }
        return returnList;
    }
}
