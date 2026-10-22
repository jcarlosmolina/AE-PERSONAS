package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>ProteccionDatos</code> model class.
 */
public final class ProteccionDatosConstants {

    private ProteccionDatosConstants() {

    }

    // Class
    /** <code>ProteccionDatos</code> class id. */
    public static final String CLASS_ID = "Clas_1432207097856829_Alias";
    /** <code>ProteccionDatos</code> class name. */
    public static final String CLASS_NAME = "ProteccionDatos";
    /** <code>ProteccionDatos</code> class alias. */
    public static final String CLASS_ALIAS = "Protección de datos";
    /** <code>ProteccionDatos</code> class table name. */
    public static final String TBL_NAME = "ProteccionDatos";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "proteccionDatosIdentificador,productosProducto,aesolicitudesidsolicitud,proteccionDatosRol,proteccionDatosSaludSMS,proteccionDatosSaludEmail,proteccionDatosSaludCorreo,proteccionDatosPublicidadSMS,proteccionDatosPublicidadEmail,proteccionDatosPublicidadCorreo,proteccionDatosInfoTerceros";

    public static final String DSDSPROTECCIONDATOSNULL = "DS_ProteccionDatos_Null";
    

    // Attribute (proteccionDatosIdentificador)
    /** <code>proteccionDatosIdentificador</code> attribute id. */
    public static final String ATTR_ID_PROTECCIONDATOSIDENTIFICADOR = "Clas_1432207097856829Atr_10_Alias";
    /** <code>proteccionDatosIdentificador</code> attribute name. */
    public static final String ATTR_NAME_PROTECCIONDATOSIDENTIFICADOR = "proteccionDatosIdentificador";
    /** <code>proteccionDatosIdentificador</code> attribute alias. */
    public static final String ATTR_ALIAS_PROTECCIONDATOSIDENTIFICADOR = "Identificador";

    /** <code>proteccionDatosIdentificador</code> attribute facet sequence. */
    public static final String PATH_FACETS_PROTECCIONDATOSIDENTIFICADOR = "";
    /** Agents allowed to view the attribute proteccionDatosIdentificador **/
    public static final String PROTECCIONDATOSIDENTIFICADOR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (proteccionDatosRol)
    /** <code>proteccionDatosRol</code> attribute id. */
    public static final String ATTR_ID_PROTECCIONDATOSROL = "Clas_1432207097856829Atr_2_Alias";
    /** <code>proteccionDatosRol</code> attribute name. */
    public static final String ATTR_NAME_PROTECCIONDATOSROL = "proteccionDatosRol";
    /** <code>proteccionDatosRol</code> attribute alias. */
    public static final String ATTR_ALIAS_PROTECCIONDATOSROL = "Rol";

    /** <code>proteccionDatosRol</code> attribute facet sequence. */
    public static final String PATH_FACETS_PROTECCIONDATOSROL = "";
    /** Agents allowed to view the attribute proteccionDatosRol **/
    public static final String PROTECCIONDATOSROL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (proteccionDatosSaludSMS)
    /** <code>proteccionDatosSaludSMS</code> attribute id. */
    public static final String ATTR_ID_PROTECCIONDATOSSALUDSMS = "Clas_1432207097856829Atr_3_Alias";
    /** <code>proteccionDatosSaludSMS</code> attribute name. */
    public static final String ATTR_NAME_PROTECCIONDATOSSALUDSMS = "proteccionDatosSaludSMS";
    /** <code>proteccionDatosSaludSMS</code> attribute alias. */
    public static final String ATTR_ALIAS_PROTECCIONDATOSSALUDSMS = "Info. Salud SMS";

    /** <code>proteccionDatosSaludSMS</code> attribute facet sequence. */
    public static final String PATH_FACETS_PROTECCIONDATOSSALUDSMS = "";
    /** Agents allowed to view the attribute proteccionDatosSaludSMS **/
    public static final String PROTECCIONDATOSSALUDSMS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (proteccionDatosSaludEmail)
    /** <code>proteccionDatosSaludEmail</code> attribute id. */
    public static final String ATTR_ID_PROTECCIONDATOSSALUDEMAIL = "Clas_1432207097856829Atr_4_Alias";
    /** <code>proteccionDatosSaludEmail</code> attribute name. */
    public static final String ATTR_NAME_PROTECCIONDATOSSALUDEMAIL = "proteccionDatosSaludEmail";
    /** <code>proteccionDatosSaludEmail</code> attribute alias. */
    public static final String ATTR_ALIAS_PROTECCIONDATOSSALUDEMAIL = "Info. Salud Email";

    /** <code>proteccionDatosSaludEmail</code> attribute facet sequence. */
    public static final String PATH_FACETS_PROTECCIONDATOSSALUDEMAIL = "";
    /** Agents allowed to view the attribute proteccionDatosSaludEmail **/
    public static final String PROTECCIONDATOSSALUDEMAIL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (proteccionDatosSaludCorreo)
    /** <code>proteccionDatosSaludCorreo</code> attribute id. */
    public static final String ATTR_ID_PROTECCIONDATOSSALUDCORREO = "Clas_1432207097856829Atr_5_Alias";
    /** <code>proteccionDatosSaludCorreo</code> attribute name. */
    public static final String ATTR_NAME_PROTECCIONDATOSSALUDCORREO = "proteccionDatosSaludCorreo";
    /** <code>proteccionDatosSaludCorreo</code> attribute alias. */
    public static final String ATTR_ALIAS_PROTECCIONDATOSSALUDCORREO = "Info. Salud Correo";

    /** <code>proteccionDatosSaludCorreo</code> attribute facet sequence. */
    public static final String PATH_FACETS_PROTECCIONDATOSSALUDCORREO = "";
    /** Agents allowed to view the attribute proteccionDatosSaludCorreo **/
    public static final String PROTECCIONDATOSSALUDCORREO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (proteccionDatosPublicidadSMS)
    /** <code>proteccionDatosPublicidadSMS</code> attribute id. */
    public static final String ATTR_ID_PROTECCIONDATOSPUBLICIDADSMS = "Clas_1432207097856829Atr_6_Alias";
    /** <code>proteccionDatosPublicidadSMS</code> attribute name. */
    public static final String ATTR_NAME_PROTECCIONDATOSPUBLICIDADSMS = "proteccionDatosPublicidadSMS";
    /** <code>proteccionDatosPublicidadSMS</code> attribute alias. */
    public static final String ATTR_ALIAS_PROTECCIONDATOSPUBLICIDADSMS = "Info. Publicidad SMS";

    /** <code>proteccionDatosPublicidadSMS</code> attribute facet sequence. */
    public static final String PATH_FACETS_PROTECCIONDATOSPUBLICIDADSMS = "";
    /** Agents allowed to view the attribute proteccionDatosPublicidadSMS **/
    public static final String PROTECCIONDATOSPUBLICIDADSMS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (proteccionDatosPublicidadEmail)
    /** <code>proteccionDatosPublicidadEmail</code> attribute id. */
    public static final String ATTR_ID_PROTECCIONDATOSPUBLICIDADEMAIL = "Clas_1432207097856829Atr_7_Alias";
    /** <code>proteccionDatosPublicidadEmail</code> attribute name. */
    public static final String ATTR_NAME_PROTECCIONDATOSPUBLICIDADEMAIL = "proteccionDatosPublicidadEmail";
    /** <code>proteccionDatosPublicidadEmail</code> attribute alias. */
    public static final String ATTR_ALIAS_PROTECCIONDATOSPUBLICIDADEMAIL = "Info. Publicidad Email";

    /** <code>proteccionDatosPublicidadEmail</code> attribute facet sequence. */
    public static final String PATH_FACETS_PROTECCIONDATOSPUBLICIDADEMAIL = "";
    /** Agents allowed to view the attribute proteccionDatosPublicidadEmail **/
    public static final String PROTECCIONDATOSPUBLICIDADEMAIL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (proteccionDatosPublicidadCorreo)
    /** <code>proteccionDatosPublicidadCorreo</code> attribute id. */
    public static final String ATTR_ID_PROTECCIONDATOSPUBLICIDADCORREO = "Clas_1432207097856829Atr_8_Alias";
    /** <code>proteccionDatosPublicidadCorreo</code> attribute name. */
    public static final String ATTR_NAME_PROTECCIONDATOSPUBLICIDADCORREO = "proteccionDatosPublicidadCorreo";
    /** <code>proteccionDatosPublicidadCorreo</code> attribute alias. */
    public static final String ATTR_ALIAS_PROTECCIONDATOSPUBLICIDADCORREO = "Info. Publicidad Correo";

    /** <code>proteccionDatosPublicidadCorreo</code> attribute facet sequence. */
    public static final String PATH_FACETS_PROTECCIONDATOSPUBLICIDADCORREO = "";
    /** Agents allowed to view the attribute proteccionDatosPublicidadCorreo **/
    public static final String PROTECCIONDATOSPUBLICIDADCORREO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (proteccionDatosInfoTerceros)
    /** <code>proteccionDatosInfoTerceros</code> attribute id. */
    public static final String ATTR_ID_PROTECCIONDATOSINFOTERCEROS = "Clas_1432207097856829Atr_9_Alias";
    /** <code>proteccionDatosInfoTerceros</code> attribute name. */
    public static final String ATTR_NAME_PROTECCIONDATOSINFOTERCEROS = "proteccionDatosInfoTerceros";
    /** <code>proteccionDatosInfoTerceros</code> attribute alias. */
    public static final String ATTR_ALIAS_PROTECCIONDATOSINFOTERCEROS = "Info. Terceros";

    /** <code>proteccionDatosInfoTerceros</code> attribute facet sequence. */
    public static final String PATH_FACETS_PROTECCIONDATOSINFOTERCEROS = "";
    /** Agents allowed to view the attribute proteccionDatosInfoTerceros **/
    public static final String PROTECCIONDATOSINFOTERCEROS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Identificador)
    /** <code>Identificador</code> field name. */
    public static final String FLD_PROTECCIONDATOSIDENTIFICADOR = "Identificador";    
    /** <code>proteccionDatosIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_PROTECCIONDATOSIDENTIFICADOR = "proteccionDatosIdentificador";
    // Field (Producto)
    /** <code>Producto</code> field name. */
    public static final String FLD_PRODUCTOSPRODUCTO = "Producto";    
    /** <code>ProductoT.productosProducto</code> attribute field name. */
    public static final String ATTR_FIELD_PRODUCTOT_PRODUCTOSPRODUCTO = "productosProducto";
    // Field (id_solicitud)
    /** <code>id_solicitud</code> field name. */
    public static final String FLD_AESOLICITUDESIDSOLICITUD = "id_solicitud";    
    /** <code>Solicitud.Ae_solicitudes.aesolicitudesidsolicitud</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUD_AE_SOLICITUDES_AESOLICITUDESIDSOLICITUD = "aesolicitudesidsolicitud";
    // Field (Rol)
    /** <code>Rol</code> field name. */
    public static final String FLD_PROTECCIONDATOSROL = "Rol";    
    /** <code>Rol</code> field length. */
    public static final int FLD_PROTECCIONDATOSROLLENGTH = 2;
    /** <code>proteccionDatosRol</code> attribute field name. */
    public static final String ATTR_FIELD_PROTECCIONDATOSROL = "proteccionDatosRol";
    // Field (SaludSMS)
    /** <code>SaludSMS</code> field name. */
    public static final String FLD_PROTECCIONDATOSSALUDSMS = "SaludSMS";    
    /** <code>proteccionDatosSaludSMS</code> attribute field name. */
    public static final String ATTR_FIELD_PROTECCIONDATOSSALUDSMS = "proteccionDatosSaludSMS";
    // Field (SaludEmail)
    /** <code>SaludEmail</code> field name. */
    public static final String FLD_PROTECCIONDATOSSALUDEMAIL = "SaludEmail";    
    /** <code>proteccionDatosSaludEmail</code> attribute field name. */
    public static final String ATTR_FIELD_PROTECCIONDATOSSALUDEMAIL = "proteccionDatosSaludEmail";
    // Field (SaludCorreo)
    /** <code>SaludCorreo</code> field name. */
    public static final String FLD_PROTECCIONDATOSSALUDCORREO = "SaludCorreo";    
    /** <code>proteccionDatosSaludCorreo</code> attribute field name. */
    public static final String ATTR_FIELD_PROTECCIONDATOSSALUDCORREO = "proteccionDatosSaludCorreo";
    // Field (PublicidadSMS)
    /** <code>PublicidadSMS</code> field name. */
    public static final String FLD_PROTECCIONDATOSPUBLICIDADSMS = "PublicidadSMS";    
    /** <code>proteccionDatosPublicidadSMS</code> attribute field name. */
    public static final String ATTR_FIELD_PROTECCIONDATOSPUBLICIDADSMS = "proteccionDatosPublicidadSMS";
    // Field (PublicidadEmail)
    /** <code>PublicidadEmail</code> field name. */
    public static final String FLD_PROTECCIONDATOSPUBLICIDADEMAIL = "PublicidadEmail";    
    /** <code>proteccionDatosPublicidadEmail</code> attribute field name. */
    public static final String ATTR_FIELD_PROTECCIONDATOSPUBLICIDADEMAIL = "proteccionDatosPublicidadEmail";
    // Field (PublicidadCorreo)
    /** <code>PublicidadCorreo</code> field name. */
    public static final String FLD_PROTECCIONDATOSPUBLICIDADCORREO = "PublicidadCorreo";    
    /** <code>proteccionDatosPublicidadCorreo</code> attribute field name. */
    public static final String ATTR_FIELD_PROTECCIONDATOSPUBLICIDADCORREO = "proteccionDatosPublicidadCorreo";
    // Field (InfoTerceros)
    /** <code>InfoTerceros</code> field name. */
    public static final String FLD_PROTECCIONDATOSINFOTERCEROS = "InfoTerceros";    
    /** <code>proteccionDatosInfoTerceros</code> attribute field name. */
    public static final String ATTR_FIELD_PROTECCIONDATOSINFOTERCEROS = "proteccionDatosInfoTerceros";

    // Component role (ProductoT)
    /** <code>ProductoT</code> role id. */
    public static final String ROLE_ID_PRODUCTOT = "Agr_1432207228928500_Alias";
    /** <code>ProductoT</code> role name. */
    public static final String ROLE_NAME_PRODUCTOT = "productoT";
    /** <code>ProductoT</code> role alias. */
    public static final String ROLE_ALIAS_PRODUCTOT = "ProductoT";

    /** <code>ProductoT</code> inverse role name. */
    public static final String ROLE_INVNAME_PRODUCTOT = ProductosConstants.ROLE_NAME_PROTECCIONESDATOS;
    /** <code>ProductoT</code> role facet sequence. */
    public static final String PATH_FACETS_PRODUCTOT = "";
    /** <code>ProductoT</code> role target class. */
    public static final String ROLE_TARGET_PRODUCTOT = ProductosConstants.CLASS_NAME;

    /** Agents allowed to navigate through ProductoT **/
    public static final String PRODUCTOT_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Solicitud)
    /** <code>Solicitud</code> role id. */
    public static final String ROLE_ID_SOLICITUD = "Agr_1432228855808502_Alias";
    /** <code>Solicitud</code> role name. */
    public static final String ROLE_NAME_SOLICITUD = "solicitud";
    /** <code>Solicitud</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUD = "Solicitud";

    /** <code>Solicitud</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUD = SolicitudConstants.ROLE_NAME_PROTECCIONDATOS;
    /** <code>Solicitud</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUD = "";
    /** <code>Solicitud</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUD = SolicitudConstants.CLASS_NAME;

    /** Agents allowed to navigate through Solicitud **/
    public static final String SOLICITUD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Compound role (SolicitudNovedad)
    /** <code>SolicitudNovedad</code> role id. */
    public static final String ROLE_ID_SOLICITUDNOVEDAD = "Agr_1581443186688699_Alias";
    /** <code>SolicitudNovedad</code> role name. */
    public static final String ROLE_NAME_SOLICITUDNOVEDAD = "solicitudNovedad";
    /** <code>ProteccionDatos</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUDNOVEDAD = "SolicitudNovedad";


    /** <code>SolicitudNovedad</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUDNOVEDAD = SolicitudNovedadConstants.ROLE_NAME_PROTECCIONDATOS;
    /** <code>SolicitudNovedad</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDAD = "";
    /** <code>SolicitudNovedad</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUDNOVEDAD = SolicitudNovedadConstants.CLASS_NAME;
    /** Agents allowed to navigate through SolicitudNovedad **/
    public static final String SOLICITUDNOVEDAD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1432207097856829Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>proteccionDatoscrearpagrProductoT</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PROTECCIONDATOSCREARPAGRPRODUCTOT = "p_agrProductoT";
    /** <code>proteccionDatoscrearpagrProductoT</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PROTECCIONDATOSCREARPAGRPRODUCTOT = "Clas_1432207097856829Ser_1Arg_32_Alias";
    /** <code>proteccionDatoscrearpagrProductoT</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PROTECCIONDATOSCREARPAGRPRODUCTOT = "ProductoT";
    /** <code>proteccionDatoscrearpagrSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PROTECCIONDATOSCREARPAGRSOLICITUD = "p_agrSolicitud";
    /** <code>proteccionDatoscrearpagrSolicitud</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PROTECCIONDATOSCREARPAGRSOLICITUD = "Clas_1432207097856829Ser_1Arg_40_Alias";
    /** <code>proteccionDatoscrearpagrSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PROTECCIONDATOSCREARPAGRSOLICITUD = "Solicitud";
    /** <code>proteccionDatoscrearpatrRol</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PROTECCIONDATOSCREARPATRROL = "p_atrRol";
    /** <code>proteccionDatoscrearpatrRol</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PROTECCIONDATOSCREARPATRROL = "Clas_1432207097856829Ser_1Arg_4_Alias";
    /** <code>proteccionDatoscrearpatrRol</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PROTECCIONDATOSCREARPATRROL = "Rol";
    /** <code>proteccionDatoscrearpatrSaludSMS</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PROTECCIONDATOSCREARPATRSALUDSMS = "p_atrSaludSMS";
    /** <code>proteccionDatoscrearpatrSaludSMS</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PROTECCIONDATOSCREARPATRSALUDSMS = "Clas_1432207097856829Ser_1Arg_5_Alias";
    /** <code>proteccionDatoscrearpatrSaludSMS</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PROTECCIONDATOSCREARPATRSALUDSMS = "Info. Salud SMS";
    /** <code>proteccionDatoscrearpatrSaludEmail</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PROTECCIONDATOSCREARPATRSALUDEMAIL = "p_atrSaludEmail";
    /** <code>proteccionDatoscrearpatrSaludEmail</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PROTECCIONDATOSCREARPATRSALUDEMAIL = "Clas_1432207097856829Ser_1Arg_6_Alias";
    /** <code>proteccionDatoscrearpatrSaludEmail</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PROTECCIONDATOSCREARPATRSALUDEMAIL = "Info. Salud Email";
    /** <code>proteccionDatoscrearpatrSaludCorreo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PROTECCIONDATOSCREARPATRSALUDCORREO = "p_atrSaludCorreo";
    /** <code>proteccionDatoscrearpatrSaludCorreo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PROTECCIONDATOSCREARPATRSALUDCORREO = "Clas_1432207097856829Ser_1Arg_7_Alias";
    /** <code>proteccionDatoscrearpatrSaludCorreo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PROTECCIONDATOSCREARPATRSALUDCORREO = "Info. Salud Correo";
    /** <code>proteccionDatoscrearpatrPublicidadSMS</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PROTECCIONDATOSCREARPATRPUBLICIDADSMS = "p_atrPublicidadSMS";
    /** <code>proteccionDatoscrearpatrPublicidadSMS</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PROTECCIONDATOSCREARPATRPUBLICIDADSMS = "Clas_1432207097856829Ser_1Arg_8_Alias";
    /** <code>proteccionDatoscrearpatrPublicidadSMS</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PROTECCIONDATOSCREARPATRPUBLICIDADSMS = "Info. Publicidad SMS";
    /** <code>proteccionDatoscrearpatrPublicidadEmail</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PROTECCIONDATOSCREARPATRPUBLICIDADEMAIL = "p_atrPublicidadEmail";
    /** <code>proteccionDatoscrearpatrPublicidadEmail</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PROTECCIONDATOSCREARPATRPUBLICIDADEMAIL = "Clas_1432207097856829Ser_1Arg_9_Alias";
    /** <code>proteccionDatoscrearpatrPublicidadEmail</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PROTECCIONDATOSCREARPATRPUBLICIDADEMAIL = "Info. Publicidad Email";
    /** <code>proteccionDatoscrearpatrPublicidadCorreo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PROTECCIONDATOSCREARPATRPUBLICIDADCORREO = "p_atrPublicidadCorreo";
    /** <code>proteccionDatoscrearpatrPublicidadCorreo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PROTECCIONDATOSCREARPATRPUBLICIDADCORREO = "Clas_1432207097856829Ser_1Arg_10_Alias";
    /** <code>proteccionDatoscrearpatrPublicidadCorreo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PROTECCIONDATOSCREARPATRPUBLICIDADCORREO = "Info. Publicidad Correo";
    /** <code>proteccionDatoscrearpatrInfoTerceros</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PROTECCIONDATOSCREARPATRINFOTERCEROS = "p_atrInfoTerceros";
    /** <code>proteccionDatoscrearpatrInfoTerceros</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PROTECCIONDATOSCREARPATRINFOTERCEROS = "Clas_1432207097856829Ser_1Arg_11_Alias";
    /** <code>proteccionDatoscrearpatrInfoTerceros</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PROTECCIONDATOSCREARPATRINFOTERCEROS = "Info. Terceros";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1432207097856829Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>proteccionDatoseliminarpthisProteccionDatos</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_PROTECCIONDATOSELIMINARPTHISPROTECCIONDATOS = "p_thisProteccionDatos";
    /** <code>proteccionDatoseliminarpthisProteccionDatos</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_PROTECCIONDATOSELIMINARPTHISPROTECCIONDATOS = "Clas_1432207097856829Ser_2Arg_1_Alias";
    /** <code>proteccionDatoseliminarpthisProteccionDatos</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_PROTECCIONDATOSELIMINARPTHISPROTECCIONDATOS = "Protección de datos";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1432207097856829Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>proteccionDatosmodificarpthisProteccionDatos</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PROTECCIONDATOSMODIFICARPTHISPROTECCIONDATOS = "p_thisProteccionDatos";
    /** <code>proteccionDatosmodificarpthisProteccionDatos</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PROTECCIONDATOSMODIFICARPTHISPROTECCIONDATOS = "Clas_1432207097856829Ser_3Arg_1_Alias";
    /** <code>proteccionDatosmodificarpthisProteccionDatos</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PROTECCIONDATOSMODIFICARPTHISPROTECCIONDATOS = "Protección de datos";
    /** <code>proteccionDatosmodificarpRol</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PROTECCIONDATOSMODIFICARPROL = "p_Rol";
    /** <code>proteccionDatosmodificarpRol</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PROTECCIONDATOSMODIFICARPROL = "Clas_1432207097856829Ser_3Arg_2_Alias";
    /** <code>proteccionDatosmodificarpRol</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PROTECCIONDATOSMODIFICARPROL = "Rol";
    /** <code>proteccionDatosmodificarpSaludSMS</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PROTECCIONDATOSMODIFICARPSALUDSMS = "p_SaludSMS";
    /** <code>proteccionDatosmodificarpSaludSMS</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PROTECCIONDATOSMODIFICARPSALUDSMS = "Clas_1432207097856829Ser_3Arg_3_Alias";
    /** <code>proteccionDatosmodificarpSaludSMS</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PROTECCIONDATOSMODIFICARPSALUDSMS = "Info. Salud SMS";
    /** <code>proteccionDatosmodificarpSaludEmail</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PROTECCIONDATOSMODIFICARPSALUDEMAIL = "p_SaludEmail";
    /** <code>proteccionDatosmodificarpSaludEmail</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PROTECCIONDATOSMODIFICARPSALUDEMAIL = "Clas_1432207097856829Ser_3Arg_4_Alias";
    /** <code>proteccionDatosmodificarpSaludEmail</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PROTECCIONDATOSMODIFICARPSALUDEMAIL = "Info. Salud Email";
    /** <code>proteccionDatosmodificarpSaludCorreo</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PROTECCIONDATOSMODIFICARPSALUDCORREO = "p_SaludCorreo";
    /** <code>proteccionDatosmodificarpSaludCorreo</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PROTECCIONDATOSMODIFICARPSALUDCORREO = "Clas_1432207097856829Ser_3Arg_5_Alias";
    /** <code>proteccionDatosmodificarpSaludCorreo</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PROTECCIONDATOSMODIFICARPSALUDCORREO = "Info. Salud Correo";
    /** <code>proteccionDatosmodificarpPublicidadSMS</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PROTECCIONDATOSMODIFICARPPUBLICIDADSMS = "p_PublicidadSMS";
    /** <code>proteccionDatosmodificarpPublicidadSMS</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PROTECCIONDATOSMODIFICARPPUBLICIDADSMS = "Clas_1432207097856829Ser_3Arg_6_Alias";
    /** <code>proteccionDatosmodificarpPublicidadSMS</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PROTECCIONDATOSMODIFICARPPUBLICIDADSMS = "Info. Publicidad SMS";
    /** <code>proteccionDatosmodificarpPublicidadEmail</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PROTECCIONDATOSMODIFICARPPUBLICIDADEMAIL = "p_PublicidadEmail";
    /** <code>proteccionDatosmodificarpPublicidadEmail</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PROTECCIONDATOSMODIFICARPPUBLICIDADEMAIL = "Clas_1432207097856829Ser_3Arg_7_Alias";
    /** <code>proteccionDatosmodificarpPublicidadEmail</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PROTECCIONDATOSMODIFICARPPUBLICIDADEMAIL = "Info. Publicidad Email";
    /** <code>proteccionDatosmodificarpPublicidadCorreo</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PROTECCIONDATOSMODIFICARPPUBLICIDADCORREO = "p_PublicidadCorreo";
    /** <code>proteccionDatosmodificarpPublicidadCorreo</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PROTECCIONDATOSMODIFICARPPUBLICIDADCORREO = "Clas_1432207097856829Ser_3Arg_8_Alias";
    /** <code>proteccionDatosmodificarpPublicidadCorreo</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PROTECCIONDATOSMODIFICARPPUBLICIDADCORREO = "Info. Publicidad Correo";
    /** <code>proteccionDatosmodificarpInfoTerceros</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PROTECCIONDATOSMODIFICARPINFOTERCEROS = "p_InfoTerceros";
    /** <code>proteccionDatosmodificarpInfoTerceros</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PROTECCIONDATOSMODIFICARPINFOTERCEROS = "Clas_1432207097856829Ser_3Arg_9_Alias";
    /** <code>proteccionDatosmodificarpInfoTerceros</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PROTECCIONDATOSMODIFICARPINFOTERCEROS = "Info. Terceros";
    // Service (InsProductoProteccionDatos)
    /** <code>InsProductoProteccionDatos</code> service id. */
    public static final String SERV_ID_INSPRODUCTOPROTECCIONDATOS = "Clas_1432207097856829Ser_4_Alias";
    /** <code>InsProductoProteccionDatos</code> service name. */
    public static final String SERV_NAME_INSPRODUCTOPROTECCIONDATOS = "InsProductoProteccionDatos";
    /** <code>InsProductoProteccionDatos</code> service alias. */
    public static final String SERV_ALIAS_INSPRODUCTOPROTECCIONDATOS = "InsProductoProteccionDatos";
    /** Agents allowed to execute the service InsProductoProteccionDatos **/
    public static final String INSPRODUCTOPROTECCIONDATOS_SRVAGENTS = "";
    // Inbound arguments
    /** <code>proteccionDatosInsProductoProteccionDatospthisProteccionDatos</code> inbound argument name. */
    public static final String ARG_NAME_INSPRODUCTOPROTECCIONDATOS_PROTECCIONDATOSINSPRODUCTOPROTECCIONDATOSPTHISPROTECCIONDATOS = "p_thisProteccionDatos";
    /** <code>proteccionDatosInsProductoProteccionDatospthisProteccionDatos</code> inbound argument id. */
    public static final String ARG_ID_INSPRODUCTOPROTECCIONDATOS_PROTECCIONDATOSINSPRODUCTOPROTECCIONDATOSPTHISPROTECCIONDATOS = "Clas_1432207097856829Ser_4Arg_1_Alias";
    /** <code>proteccionDatosInsProductoProteccionDatospthisProteccionDatos</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPRODUCTOPROTECCIONDATOS_PROTECCIONDATOSINSPRODUCTOPROTECCIONDATOSPTHISPROTECCIONDATOS = "Protecciones Datos";
    /** <code>proteccionDatosInsProductoProteccionDatospevcProductos</code> inbound argument name. */
    public static final String ARG_NAME_INSPRODUCTOPROTECCIONDATOS_PROTECCIONDATOSINSPRODUCTOPROTECCIONDATOSPEVCPRODUCTOS = "p_evcProductos";
    /** <code>proteccionDatosInsProductoProteccionDatospevcProductos</code> inbound argument id. */
    public static final String ARG_ID_INSPRODUCTOPROTECCIONDATOS_PROTECCIONDATOSINSPRODUCTOPROTECCIONDATOSPEVCPRODUCTOS = "Clas_1432207097856829Ser_4Arg_2_Alias";
    /** <code>proteccionDatosInsProductoProteccionDatospevcProductos</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPRODUCTOPROTECCIONDATOS_PROTECCIONDATOSINSPRODUCTOPROTECCIONDATOSPEVCPRODUCTOS = "ProductoT";
    // Service (DelProductoProteccionDatos)
    /** <code>DelProductoProteccionDatos</code> service id. */
    public static final String SERV_ID_DELPRODUCTOPROTECCIONDATOS = "Clas_1432207097856829Ser_5_Alias";
    /** <code>DelProductoProteccionDatos</code> service name. */
    public static final String SERV_NAME_DELPRODUCTOPROTECCIONDATOS = "DelProductoProteccionDatos";
    /** <code>DelProductoProteccionDatos</code> service alias. */
    public static final String SERV_ALIAS_DELPRODUCTOPROTECCIONDATOS = "DelProductoProteccionDatos";
    /** Agents allowed to execute the service DelProductoProteccionDatos **/
    public static final String DELPRODUCTOPROTECCIONDATOS_SRVAGENTS = "";
    // Inbound arguments
    /** <code>proteccionDatosDelProductoProteccionDatospthisProteccionDatos</code> inbound argument name. */
    public static final String ARG_NAME_DELPRODUCTOPROTECCIONDATOS_PROTECCIONDATOSDELPRODUCTOPROTECCIONDATOSPTHISPROTECCIONDATOS = "p_thisProteccionDatos";
    /** <code>proteccionDatosDelProductoProteccionDatospthisProteccionDatos</code> inbound argument id. */
    public static final String ARG_ID_DELPRODUCTOPROTECCIONDATOS_PROTECCIONDATOSDELPRODUCTOPROTECCIONDATOSPTHISPROTECCIONDATOS = "Clas_1432207097856829Ser_5Arg_1_Alias";
    /** <code>proteccionDatosDelProductoProteccionDatospthisProteccionDatos</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPRODUCTOPROTECCIONDATOS_PROTECCIONDATOSDELPRODUCTOPROTECCIONDATOSPTHISPROTECCIONDATOS = "Protecciones Datos";
    /** <code>proteccionDatosDelProductoProteccionDatospevcProductos</code> inbound argument name. */
    public static final String ARG_NAME_DELPRODUCTOPROTECCIONDATOS_PROTECCIONDATOSDELPRODUCTOPROTECCIONDATOSPEVCPRODUCTOS = "p_evcProductos";
    /** <code>proteccionDatosDelProductoProteccionDatospevcProductos</code> inbound argument id. */
    public static final String ARG_ID_DELPRODUCTOPROTECCIONDATOS_PROTECCIONDATOSDELPRODUCTOPROTECCIONDATOSPEVCPRODUCTOS = "Clas_1432207097856829Ser_5Arg_2_Alias";
    /** <code>proteccionDatosDelProductoProteccionDatospevcProductos</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPRODUCTOPROTECCIONDATOS_PROTECCIONDATOSDELPRODUCTOPROTECCIONDATOSPEVCPRODUCTOS = "ProductoT";
    // Service (InsSolicitudProteccionDatos)
    /** <code>InsSolicitudProteccionDatos</code> service id. */
    public static final String SERV_ID_INSSOLICITUDPROTECCIONDATOS = "Clas_1432207097856829Ser_8_Alias";
    /** <code>InsSolicitudProteccionDatos</code> service name. */
    public static final String SERV_NAME_INSSOLICITUDPROTECCIONDATOS = "InsSolicitudProteccionDatos";
    /** <code>InsSolicitudProteccionDatos</code> service alias. */
    public static final String SERV_ALIAS_INSSOLICITUDPROTECCIONDATOS = "InsSolicitudProteccionDatos";
    /** Agents allowed to execute the service InsSolicitudProteccionDatos **/
    public static final String INSSOLICITUDPROTECCIONDATOS_SRVAGENTS = "";
    // Inbound arguments
    /** <code>proteccionDatosInsSolicitudProteccionDatospthisProteccionDatos</code> inbound argument name. */
    public static final String ARG_NAME_INSSOLICITUDPROTECCIONDATOS_PROTECCIONDATOSINSSOLICITUDPROTECCIONDATOSPTHISPROTECCIONDATOS = "p_thisProteccionDatos";
    /** <code>proteccionDatosInsSolicitudProteccionDatospthisProteccionDatos</code> inbound argument id. */
    public static final String ARG_ID_INSSOLICITUDPROTECCIONDATOS_PROTECCIONDATOSINSSOLICITUDPROTECCIONDATOSPTHISPROTECCIONDATOS = "Clas_1432207097856829Ser_8Arg_1_Alias";
    /** <code>proteccionDatosInsSolicitudProteccionDatospthisProteccionDatos</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSSOLICITUDPROTECCIONDATOS_PROTECCIONDATOSINSSOLICITUDPROTECCIONDATOSPTHISPROTECCIONDATOS = "Protección Datos";
    /** <code>proteccionDatosInsSolicitudProteccionDatospevcSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_INSSOLICITUDPROTECCIONDATOS_PROTECCIONDATOSINSSOLICITUDPROTECCIONDATOSPEVCSOLICITUD = "p_evcSolicitud";
    /** <code>proteccionDatosInsSolicitudProteccionDatospevcSolicitud</code> inbound argument id. */
    public static final String ARG_ID_INSSOLICITUDPROTECCIONDATOS_PROTECCIONDATOSINSSOLICITUDPROTECCIONDATOSPEVCSOLICITUD = "Clas_1432207097856829Ser_8Arg_2_Alias";
    /** <code>proteccionDatosInsSolicitudProteccionDatospevcSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSSOLICITUDPROTECCIONDATOS_PROTECCIONDATOSINSSOLICITUDPROTECCIONDATOSPEVCSOLICITUD = "Solicitud";
    // Service (DelSolicitudProteccionDatos)
    /** <code>DelSolicitudProteccionDatos</code> service id. */
    public static final String SERV_ID_DELSOLICITUDPROTECCIONDATOS = "Clas_1432207097856829Ser_9_Alias";
    /** <code>DelSolicitudProteccionDatos</code> service name. */
    public static final String SERV_NAME_DELSOLICITUDPROTECCIONDATOS = "DelSolicitudProteccionDatos";
    /** <code>DelSolicitudProteccionDatos</code> service alias. */
    public static final String SERV_ALIAS_DELSOLICITUDPROTECCIONDATOS = "DelSolicitudProteccionDatos";
    /** Agents allowed to execute the service DelSolicitudProteccionDatos **/
    public static final String DELSOLICITUDPROTECCIONDATOS_SRVAGENTS = "";
    // Inbound arguments
    /** <code>proteccionDatosDelSolicitudProteccionDatospthisProteccionDatos</code> inbound argument name. */
    public static final String ARG_NAME_DELSOLICITUDPROTECCIONDATOS_PROTECCIONDATOSDELSOLICITUDPROTECCIONDATOSPTHISPROTECCIONDATOS = "p_thisProteccionDatos";
    /** <code>proteccionDatosDelSolicitudProteccionDatospthisProteccionDatos</code> inbound argument id. */
    public static final String ARG_ID_DELSOLICITUDPROTECCIONDATOS_PROTECCIONDATOSDELSOLICITUDPROTECCIONDATOSPTHISPROTECCIONDATOS = "Clas_1432207097856829Ser_9Arg_1_Alias";
    /** <code>proteccionDatosDelSolicitudProteccionDatospthisProteccionDatos</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELSOLICITUDPROTECCIONDATOS_PROTECCIONDATOSDELSOLICITUDPROTECCIONDATOSPTHISPROTECCIONDATOS = "Protección Datos";
    /** <code>proteccionDatosDelSolicitudProteccionDatospevcSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_DELSOLICITUDPROTECCIONDATOS_PROTECCIONDATOSDELSOLICITUDPROTECCIONDATOSPEVCSOLICITUD = "p_evcSolicitud";
    /** <code>proteccionDatosDelSolicitudProteccionDatospevcSolicitud</code> inbound argument id. */
    public static final String ARG_ID_DELSOLICITUDPROTECCIONDATOS_PROTECCIONDATOSDELSOLICITUDPROTECCIONDATOSPEVCSOLICITUD = "Clas_1432207097856829Ser_9Arg_2_Alias";
    /** <code>proteccionDatosDelSolicitudProteccionDatospevcSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELSOLICITUDPROTECCIONDATOS_PROTECCIONDATOSDELSOLICITUDPROTECCIONDATOSPEVCSOLICITUD = "Solicitud";
    // Service (TCREARPROTECCIONDATOSNA)
    /** <code>TCREARPROTECCIONDATOSNA</code> service id. */
    public static final String SERV_ID_TCREARPROTECCIONDATOSNA = "Clas_1432207097856829Ser_11_Alias";
    /** <code>TCREARPROTECCIONDATOSNA</code> service name. */
    public static final String SERV_NAME_TCREARPROTECCIONDATOSNA = "TCREARPROTECCIONDATOSNA";
    /** <code>TCREARPROTECCIONDATOSNA</code> service alias. */
    public static final String SERV_ALIAS_TCREARPROTECCIONDATOSNA = "Autorización de Tratamiento de Datos Personales";
    /** Agents allowed to execute the service TCREARPROTECCIONDATOSNA **/
    public static final String TCREARPROTECCIONDATOSNA_SRVAGENTS = "Admin,SuperAdmin,Asesor";
    // Inbound arguments
    /** <code>proteccionDatosTCREARPROTECCIONDATOSNAptTexto</code> inbound argument name. */
    public static final String ARG_NAME_TCREARPROTECCIONDATOSNA_PROTECCIONDATOSTCREARPROTECCIONDATOSNAPTTEXTO = "ptTexto";
    /** <code>proteccionDatosTCREARPROTECCIONDATOSNAptTexto</code> inbound argument id. */
    public static final String ARG_ID_TCREARPROTECCIONDATOSNA_PROTECCIONDATOSTCREARPROTECCIONDATOSNAPTTEXTO = "Clas_1432207097856829Ser_11Arg_2164_Alias";
    /** <code>proteccionDatosTCREARPROTECCIONDATOSNAptTexto</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARPROTECCIONDATOSNA_PROTECCIONDATOSTCREARPROTECCIONDATOSNAPTTEXTO = "Texto";
    // Outbound arguments
    /** <code>proteccionDatosTCREARPROTECCIONDATOSNApsThisPD</code> outbound argument name. */
    public static final String ARG_NAME_TCREARPROTECCIONDATOSNA_PROTECCIONDATOSTCREARPROTECCIONDATOSNAPSTHISPD = "proteccionDatosTCREARPROTECCIONDATOSNApsThisPD";
    /** <code>proteccionDatosTCREARPROTECCIONDATOSNApsThisPD</code> outbound argument id. */
    public static final String ARG_ID_TCREARPROTECCIONDATOSNA_PROTECCIONDATOSTCREARPROTECCIONDATOSNAPSTHISPD = "Clas_1432207097856829Ser_11Arg_19_Alias";
    /** <code>proteccionDatosTCREARPROTECCIONDATOSNApsThisPD</code> outbound argument alias. */
    public static final String ARG_ALIAS_TCREARPROTECCIONDATOSNA_PROTECCIONDATOSTCREARPROTECCIONDATOSNAPSTHISPD = "This";
    // Service (TCREARPROTECCIONDATOSINC)
    /** <code>TCREARPROTECCIONDATOSINC</code> service id. */
    public static final String SERV_ID_TCREARPROTECCIONDATOSINC = "Clas_1432207097856829Ser_12_Alias";
    /** <code>TCREARPROTECCIONDATOSINC</code> service name. */
    public static final String SERV_NAME_TCREARPROTECCIONDATOSINC = "TCREARPROTECCIONDATOSINC";
    /** <code>TCREARPROTECCIONDATOSINC</code> service alias. */
    public static final String SERV_ALIAS_TCREARPROTECCIONDATOSINC = "Autorización de Tratamiento de Datos Personales";
    /** Agents allowed to execute the service TCREARPROTECCIONDATOSINC **/
    public static final String TCREARPROTECCIONDATOSINC_SRVAGENTS = "Admin,SuperAdmin,Asesor";
    // Inbound arguments
    /** <code>proteccionDatosTCREARPROTECCIONDATOSINCptTexto</code> inbound argument name. */
    public static final String ARG_NAME_TCREARPROTECCIONDATOSINC_PROTECCIONDATOSTCREARPROTECCIONDATOSINCPTTEXTO = "ptTexto";
    /** <code>proteccionDatosTCREARPROTECCIONDATOSINCptTexto</code> inbound argument id. */
    public static final String ARG_ID_TCREARPROTECCIONDATOSINC_PROTECCIONDATOSTCREARPROTECCIONDATOSINCPTTEXTO = "Clas_1432207097856829Ser_12Arg_1438_Alias";
    /** <code>proteccionDatosTCREARPROTECCIONDATOSINCptTexto</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARPROTECCIONDATOSINC_PROTECCIONDATOSTCREARPROTECCIONDATOSINCPTTEXTO = "Texto";
    // Outbound arguments
    /** <code>proteccionDatosTCREARPROTECCIONDATOSINCpsThisPD</code> outbound argument name. */
    public static final String ARG_NAME_TCREARPROTECCIONDATOSINC_PROTECCIONDATOSTCREARPROTECCIONDATOSINCPSTHISPD = "proteccionDatosTCREARPROTECCIONDATOSINCpsThisPD";
    /** <code>proteccionDatosTCREARPROTECCIONDATOSINCpsThisPD</code> outbound argument id. */
    public static final String ARG_ID_TCREARPROTECCIONDATOSINC_PROTECCIONDATOSTCREARPROTECCIONDATOSINCPSTHISPD = "Clas_1432207097856829Ser_12Arg_9_Alias";
    /** <code>proteccionDatosTCREARPROTECCIONDATOSINCpsThisPD</code> outbound argument alias. */
    public static final String ARG_ALIAS_TCREARPROTECCIONDATOSINC_PROTECCIONDATOSTCREARPROTECCIONDATOSINCPSTHISPD = "This";
    // Service (TCREARSOLNOVEDAD)
    /** <code>TCREARSOLNOVEDAD</code> service id. */
    public static final String SERV_ID_TCREARSOLNOVEDAD = "Clas_1432207097856829Ser_14_Alias";
    /** <code>TCREARSOLNOVEDAD</code> service name. */
    public static final String SERV_NAME_TCREARSOLNOVEDAD = "TCREARSOLNOVEDAD";
    /** <code>TCREARSOLNOVEDAD</code> service alias. */
    public static final String SERV_ALIAS_TCREARSOLNOVEDAD = "Nueva solicitud novedad";
    /** Agents allowed to execute the service TCREARSOLNOVEDAD **/
    public static final String TCREARSOLNOVEDAD_SRVAGENTS = "Admin,SuperAdmin,Asesor";
    // Inbound arguments
    /** <code>proteccionDatosTCREARSOLNOVEDADptTexto</code> inbound argument name. */
    public static final String ARG_NAME_TCREARSOLNOVEDAD_PROTECCIONDATOSTCREARSOLNOVEDADPTTEXTO = "ptTexto";
    /** <code>proteccionDatosTCREARSOLNOVEDADptTexto</code> inbound argument id. */
    public static final String ARG_ID_TCREARSOLNOVEDAD_PROTECCIONDATOSTCREARSOLNOVEDADPTTEXTO = "Clas_1432207097856829Ser_14Arg_2_Alias";
    /** <code>proteccionDatosTCREARSOLNOVEDADptTexto</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARSOLNOVEDAD_PROTECCIONDATOSTCREARSOLNOVEDADPTTEXTO = "Texto";
    // Outbound arguments
    /** <code>proteccionDatosTCREARSOLNOVEDADpsThisPD</code> outbound argument name. */
    public static final String ARG_NAME_TCREARSOLNOVEDAD_PROTECCIONDATOSTCREARSOLNOVEDADPSTHISPD = "proteccionDatosTCREARSOLNOVEDADpsThisPD";
    /** <code>proteccionDatosTCREARSOLNOVEDADpsThisPD</code> outbound argument id. */
    public static final String ARG_ID_TCREARSOLNOVEDAD_PROTECCIONDATOSTCREARSOLNOVEDADPSTHISPD = "Clas_1432207097856829Ser_14Arg_3_Alias";
    /** <code>proteccionDatosTCREARSOLNOVEDADpsThisPD</code> outbound argument alias. */
    public static final String ARG_ALIAS_TCREARSOLNOVEDAD_PROTECCIONDATOSTCREARSOLNOVEDADPSTHISPD = "This";
    // Service (TCREARSOLNOVEDADEXCEPCION)
    /** <code>TCREARSOLNOVEDADEXCEPCION</code> service id. */
    public static final String SERV_ID_TCREARSOLNOVEDADEXCEPCION = "Clas_1432207097856829Ser_15_Alias";
    /** <code>TCREARSOLNOVEDADEXCEPCION</code> service name. */
    public static final String SERV_NAME_TCREARSOLNOVEDADEXCEPCION = "TCREARSOLNOVEDADEXCEPCION";
    /** <code>TCREARSOLNOVEDADEXCEPCION</code> service alias. */
    public static final String SERV_ALIAS_TCREARSOLNOVEDADEXCEPCION = "Nueva solicitud novedad excepción";
    /** Agents allowed to execute the service TCREARSOLNOVEDADEXCEPCION **/
    public static final String TCREARSOLNOVEDADEXCEPCION_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>proteccionDatosTCREARSOLNOVEDADEXCEPCIONptTexto</code> inbound argument name. */
    public static final String ARG_NAME_TCREARSOLNOVEDADEXCEPCION_PROTECCIONDATOSTCREARSOLNOVEDADEXCEPCIONPTTEXTO = "ptTexto";
    /** <code>proteccionDatosTCREARSOLNOVEDADEXCEPCIONptTexto</code> inbound argument id. */
    public static final String ARG_ID_TCREARSOLNOVEDADEXCEPCION_PROTECCIONDATOSTCREARSOLNOVEDADEXCEPCIONPTTEXTO = "Clas_1432207097856829Ser_15Arg_2_Alias";
    /** <code>proteccionDatosTCREARSOLNOVEDADEXCEPCIONptTexto</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARSOLNOVEDADEXCEPCION_PROTECCIONDATOSTCREARSOLNOVEDADEXCEPCIONPTTEXTO = "Texto";
    // Outbound arguments
    /** <code>proteccionDatosTCREARSOLNOVEDADEXCEPCIONpsThisPD</code> outbound argument name. */
    public static final String ARG_NAME_TCREARSOLNOVEDADEXCEPCION_PROTECCIONDATOSTCREARSOLNOVEDADEXCEPCIONPSTHISPD = "proteccionDatosTCREARSOLNOVEDADEXCEPCIONpsThisPD";
    /** <code>proteccionDatosTCREARSOLNOVEDADEXCEPCIONpsThisPD</code> outbound argument id. */
    public static final String ARG_ID_TCREARSOLNOVEDADEXCEPCION_PROTECCIONDATOSTCREARSOLNOVEDADEXCEPCIONPSTHISPD = "Clas_1432207097856829Ser_15Arg_3_Alias";
    /** <code>proteccionDatosTCREARSOLNOVEDADEXCEPCIONpsThisPD</code> outbound argument alias. */
    public static final String ARG_ALIAS_TCREARSOLNOVEDADEXCEPCION_PROTECCIONDATOSTCREARSOLNOVEDADEXCEPCIONPSTHISPD = "This";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_PROTECCIONDATOSROL.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PROTECCIONDATOSSALUDSMS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PROTECCIONDATOSSALUDEMAIL.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PROTECCIONDATOSSALUDCORREO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PROTECCIONDATOSPUBLICIDADSMS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PROTECCIONDATOSPUBLICIDADEMAIL.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PROTECCIONDATOSPUBLICIDADCORREO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PROTECCIONDATOSINFOTERCEROS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_PROTECCIONDATOSIDENTIFICADOR.toUpperCase(), PROTECCIONDATOSIDENTIFICADOR_AGENTS);
    	attributeAgents.put(ATTR_NAME_PROTECCIONDATOSROL.toUpperCase(), PROTECCIONDATOSROL_AGENTS);
    	attributeAgents.put(ATTR_NAME_PROTECCIONDATOSSALUDSMS.toUpperCase(), PROTECCIONDATOSSALUDSMS_AGENTS);
    	attributeAgents.put(ATTR_NAME_PROTECCIONDATOSSALUDEMAIL.toUpperCase(), PROTECCIONDATOSSALUDEMAIL_AGENTS);
    	attributeAgents.put(ATTR_NAME_PROTECCIONDATOSSALUDCORREO.toUpperCase(), PROTECCIONDATOSSALUDCORREO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PROTECCIONDATOSPUBLICIDADSMS.toUpperCase(), PROTECCIONDATOSPUBLICIDADSMS_AGENTS);
    	attributeAgents.put(ATTR_NAME_PROTECCIONDATOSPUBLICIDADEMAIL.toUpperCase(), PROTECCIONDATOSPUBLICIDADEMAIL_AGENTS);
    	attributeAgents.put(ATTR_NAME_PROTECCIONDATOSPUBLICIDADCORREO.toUpperCase(), PROTECCIONDATOSPUBLICIDADCORREO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PROTECCIONDATOSINFOTERCEROS.toUpperCase(), PROTECCIONDATOSINFOTERCEROS_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_SOLICITUDNOVEDAD.toUpperCase(), SOLICITUDNOVEDAD_AGENTS);
        roleAgents.put(ROLE_NAME_PRODUCTOT.toUpperCase(), PRODUCTOT_AGENTS);
        roleAgents.put(ROLE_NAME_SOLICITUD.toUpperCase(), SOLICITUD_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'ProteccionDatos', it returns the identification keys
     * - If className is a facet of the inheritance net of 'ProteccionDatos', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_PROTECCIONDATOSIDENTIFICADOR);
        }
        // Facet 'ProteccionDatos' (This facet)
        if (ProteccionDatosConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_PROTECCIONDATOSIDENTIFICADOR);
        }
        return returnList;
    }
}
