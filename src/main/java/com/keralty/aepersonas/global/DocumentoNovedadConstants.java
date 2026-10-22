package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>DocumentoNovedad</code> model class.
 */
public final class DocumentoNovedadConstants {

    private DocumentoNovedadConstants() {

    }

    // Class
    /** <code>DocumentoNovedad</code> class id. */
    public static final String CLASS_ID = "Clas_1582535933952300_Alias";
    /** <code>DocumentoNovedad</code> class name. */
    public static final String CLASS_NAME = "DocumentoNovedad";
    /** <code>DocumentoNovedad</code> class alias. */
    public static final String CLASS_ALIAS = "Documento";
    /** <code>DocumentoNovedad</code> class table name. */
    public static final String TBL_NAME = "DocumentoNovedad";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "documentoNovedadIdDocumento,solicitudNovedadId,usuarioNovedadidUsuarioNovedad,documentoNovedadTipo,documentoNovedadFechaSubida,documentoNovedadDescripcion,documentoNovedadEstado,documentoNovedadPathCompleto,documentoNovedadExtension,documentoNovedadIdDocEnGestor,documentoNovedadNombre,documentoNovedadUsuarioCreador";

    public static final String DSDSDOCUMENTONOVEDAD = "DS_DocumentoNovedad";
    public static final String DSICDOCUMENTONOVEDAD = "IC_DocumentoNovedad";
    public static final String DSDSDOCUMENTONOVEDADNULL = "DS_DocumentoNovedad_Null";
    

    // Attribute (documentoNovedadIdDocumento)
    /** <code>documentoNovedadIdDocumento</code> attribute id. */
    public static final String ATTR_ID_DOCUMENTONOVEDADIDDOCUMENTO = "Clas_1582535933952300Atr_1_Alias";
    /** <code>documentoNovedadIdDocumento</code> attribute name. */
    public static final String ATTR_NAME_DOCUMENTONOVEDADIDDOCUMENTO = "documentoNovedadIdDocumento";
    /** <code>documentoNovedadIdDocumento</code> attribute alias. */
    public static final String ATTR_ALIAS_DOCUMENTONOVEDADIDDOCUMENTO = "Identificador";

    /** <code>documentoNovedadIdDocumento</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOCUMENTONOVEDADIDDOCUMENTO = "";
    /** Agents allowed to view the attribute documentoNovedadIdDocumento **/
    public static final String DOCUMENTONOVEDADIDDOCUMENTO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (documentoNovedadTipo)
    /** <code>documentoNovedadTipo</code> attribute id. */
    public static final String ATTR_ID_DOCUMENTONOVEDADTIPO = "Clas_1582535933952300Atr_3_Alias";
    /** <code>documentoNovedadTipo</code> attribute name. */
    public static final String ATTR_NAME_DOCUMENTONOVEDADTIPO = "documentoNovedadTipo";
    /** <code>documentoNovedadTipo</code> attribute alias. */
    public static final String ATTR_ALIAS_DOCUMENTONOVEDADTIPO = "Tipo";

    /** <code>documentoNovedadTipo</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOCUMENTONOVEDADTIPO = "";
    /** Agents allowed to view the attribute documentoNovedadTipo **/
    public static final String DOCUMENTONOVEDADTIPO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (documentoNovedadFechaSubida)
    /** <code>documentoNovedadFechaSubida</code> attribute id. */
    public static final String ATTR_ID_DOCUMENTONOVEDADFECHASUBIDA = "Clas_1582535933952300Atr_5_Alias";
    /** <code>documentoNovedadFechaSubida</code> attribute name. */
    public static final String ATTR_NAME_DOCUMENTONOVEDADFECHASUBIDA = "documentoNovedadFechaSubida";
    /** <code>documentoNovedadFechaSubida</code> attribute alias. */
    public static final String ATTR_ALIAS_DOCUMENTONOVEDADFECHASUBIDA = "Fecha subida gestor";

    /** <code>documentoNovedadFechaSubida</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOCUMENTONOVEDADFECHASUBIDA = "";
    /** Agents allowed to view the attribute documentoNovedadFechaSubida **/
    public static final String DOCUMENTONOVEDADFECHASUBIDA_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (documentoNovedadDescripcion)
    /** <code>documentoNovedadDescripcion</code> attribute id. */
    public static final String ATTR_ID_DOCUMENTONOVEDADDESCRIPCION = "Clas_1582535933952300Atr_2_Alias";
    /** <code>documentoNovedadDescripcion</code> attribute name. */
    public static final String ATTR_NAME_DOCUMENTONOVEDADDESCRIPCION = "documentoNovedadDescripcion";
    /** <code>documentoNovedadDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_DOCUMENTONOVEDADDESCRIPCION = "Descripción";

    /** <code>documentoNovedadDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOCUMENTONOVEDADDESCRIPCION = "";
    /** Agents allowed to view the attribute documentoNovedadDescripcion **/
    public static final String DOCUMENTONOVEDADDESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (documentoNovedadEstado)
    /** <code>documentoNovedadEstado</code> attribute id. */
    public static final String ATTR_ID_DOCUMENTONOVEDADESTADO = "Clas_1582535933952300Atr_4_Alias";
    /** <code>documentoNovedadEstado</code> attribute name. */
    public static final String ATTR_NAME_DOCUMENTONOVEDADESTADO = "documentoNovedadEstado";
    /** <code>documentoNovedadEstado</code> attribute alias. */
    public static final String ATTR_ALIAS_DOCUMENTONOVEDADESTADO = "Estado";

    /** <code>documentoNovedadEstado</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOCUMENTONOVEDADESTADO = "";
    /** Agents allowed to view the attribute documentoNovedadEstado **/
    public static final String DOCUMENTONOVEDADESTADO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (documentoNovedadPathCompleto)
    /** <code>documentoNovedadPathCompleto</code> attribute id. */
    public static final String ATTR_ID_DOCUMENTONOVEDADPATHCOMPLETO = "Clas_1582535933952300Atr_6_Alias";
    /** <code>documentoNovedadPathCompleto</code> attribute name. */
    public static final String ATTR_NAME_DOCUMENTONOVEDADPATHCOMPLETO = "documentoNovedadPathCompleto";
    /** <code>documentoNovedadPathCompleto</code> attribute alias. */
    public static final String ATTR_ALIAS_DOCUMENTONOVEDADPATHCOMPLETO = "Path Completo";

    /** <code>documentoNovedadPathCompleto</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOCUMENTONOVEDADPATHCOMPLETO = "";
    /** Agents allowed to view the attribute documentoNovedadPathCompleto **/
    public static final String DOCUMENTONOVEDADPATHCOMPLETO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (documentoNovedadExtension)
    /** <code>documentoNovedadExtension</code> attribute id. */
    public static final String ATTR_ID_DOCUMENTONOVEDADEXTENSION = "Clas_1582535933952300Atr_7_Alias";
    /** <code>documentoNovedadExtension</code> attribute name. */
    public static final String ATTR_NAME_DOCUMENTONOVEDADEXTENSION = "documentoNovedadExtension";
    /** <code>documentoNovedadExtension</code> attribute alias. */
    public static final String ATTR_ALIAS_DOCUMENTONOVEDADEXTENSION = "Extensión";

    /** <code>documentoNovedadExtension</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOCUMENTONOVEDADEXTENSION = "";
    /** Agents allowed to view the attribute documentoNovedadExtension **/
    public static final String DOCUMENTONOVEDADEXTENSION_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (documentoNovedadResultadoSubida)
    /** <code>documentoNovedadResultadoSubida</code> attribute id. */
    public static final String ATTR_ID_DOCUMENTONOVEDADRESULTADOSUBIDA = "Clas_1582535933952300Atr_8_Alias";
    /** <code>documentoNovedadResultadoSubida</code> attribute name. */
    public static final String ATTR_NAME_DOCUMENTONOVEDADRESULTADOSUBIDA = "documentoNovedadResultadoSubida";
    /** <code>documentoNovedadResultadoSubida</code> attribute alias. */
    public static final String ATTR_ALIAS_DOCUMENTONOVEDADRESULTADOSUBIDA = "Resultado";

    /** <code>documentoNovedadResultadoSubida</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOCUMENTONOVEDADRESULTADOSUBIDA = "";
    /** Agents allowed to view the attribute documentoNovedadResultadoSubida **/
    public static final String DOCUMENTONOVEDADRESULTADOSUBIDA_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (documentoNovedadIdDocEnGestor)
    /** <code>documentoNovedadIdDocEnGestor</code> attribute id. */
    public static final String ATTR_ID_DOCUMENTONOVEDADIDDOCENGESTOR = "Clas_1582535933952300Atr_9_Alias";
    /** <code>documentoNovedadIdDocEnGestor</code> attribute name. */
    public static final String ATTR_NAME_DOCUMENTONOVEDADIDDOCENGESTOR = "documentoNovedadIdDocEnGestor";
    /** <code>documentoNovedadIdDocEnGestor</code> attribute alias. */
    public static final String ATTR_ALIAS_DOCUMENTONOVEDADIDDOCENGESTOR = "Id. En Gestor";

    /** <code>documentoNovedadIdDocEnGestor</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOCUMENTONOVEDADIDDOCENGESTOR = "";
    /** Agents allowed to view the attribute documentoNovedadIdDocEnGestor **/
    public static final String DOCUMENTONOVEDADIDDOCENGESTOR_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (documentoNovedadNombre)
    /** <code>documentoNovedadNombre</code> attribute id. */
    public static final String ATTR_ID_DOCUMENTONOVEDADNOMBRE = "Clas_1582535933952300Atr_10_Alias";
    /** <code>documentoNovedadNombre</code> attribute name. */
    public static final String ATTR_NAME_DOCUMENTONOVEDADNOMBRE = "documentoNovedadNombre";
    /** <code>documentoNovedadNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_DOCUMENTONOVEDADNOMBRE = "Archivo adjunto";

    /** <code>documentoNovedadNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOCUMENTONOVEDADNOMBRE = "";
    /** Agents allowed to view the attribute documentoNovedadNombre **/
    public static final String DOCUMENTONOVEDADNOMBRE_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (documentoNovedadUsuarioCreador)
    /** <code>documentoNovedadUsuarioCreador</code> attribute id. */
    public static final String ATTR_ID_DOCUMENTONOVEDADUSUARIOCREADOR = "Clas_1582535933952300Atr_12_Alias";
    /** <code>documentoNovedadUsuarioCreador</code> attribute name. */
    public static final String ATTR_NAME_DOCUMENTONOVEDADUSUARIOCREADOR = "documentoNovedadUsuarioCreador";
    /** <code>documentoNovedadUsuarioCreador</code> attribute alias. */
    public static final String ATTR_ALIAS_DOCUMENTONOVEDADUSUARIOCREADOR = "Usuario";

    /** <code>documentoNovedadUsuarioCreador</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOCUMENTONOVEDADUSUARIOCREADOR = "";
    /** Agents allowed to view the attribute documentoNovedadUsuarioCreador **/
    public static final String DOCUMENTONOVEDADUSUARIOCREADOR_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (IdDocumento)
    /** <code>IdDocumento</code> field name. */
    public static final String FLD_DOCUMENTONOVEDADIDDOCUMENTO = "IdDocumento";    
    /** <code>documentoNovedadIdDocumento</code> attribute field name. */
    public static final String ATTR_FIELD_DOCUMENTONOVEDADIDDOCUMENTO = "documentoNovedadIdDocumento";
    // Field (Id)
    /** <code>Id</code> field name. */
    public static final String FLD_SOLICITUDNOVEDADID = "Id";    
    /** <code>Solicitud.solicitudNovedadId</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUD_SOLICITUDNOVEDADID = "solicitudNovedadId";
    // Field (id_UsuarioNovedad)
    /** <code>id_UsuarioNovedad</code> field name. */
    public static final String FLD_USUARIONOVEDADIDUSUARIONOVEDAD = "id_UsuarioNovedad";    
    /** <code>Usuario.usuarioNovedadidUsuarioNovedad</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIO_USUARIONOVEDADIDUSUARIONOVEDAD = "usuarioNovedadidUsuarioNovedad";
    // Field (Tipo)
    /** <code>Tipo</code> field name. */
    public static final String FLD_DOCUMENTONOVEDADTIPO = "Tipo";    
    /** <code>documentoNovedadTipo</code> attribute field name. */
    public static final String ATTR_FIELD_DOCUMENTONOVEDADTIPO = "documentoNovedadTipo";
    // Field (FechaSubida)
    /** <code>FechaSubida</code> field name. */
    public static final String FLD_DOCUMENTONOVEDADFECHASUBIDA = "FechaSubida";    
    /** <code>documentoNovedadFechaSubida</code> attribute field name. */
    public static final String ATTR_FIELD_DOCUMENTONOVEDADFECHASUBIDA = "documentoNovedadFechaSubida";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_DOCUMENTONOVEDADDESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_DOCUMENTONOVEDADDESCRIPCIONLENGTH = 150;
    /** <code>documentoNovedadDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_DOCUMENTONOVEDADDESCRIPCION = "documentoNovedadDescripcion";
    // Field (Estado)
    /** <code>Estado</code> field name. */
    public static final String FLD_DOCUMENTONOVEDADESTADO = "Estado";    
    /** <code>documentoNovedadEstado</code> attribute field name. */
    public static final String ATTR_FIELD_DOCUMENTONOVEDADESTADO = "documentoNovedadEstado";
    // Field (PathCompleto)
    /** <code>PathCompleto</code> field name. */
    public static final String FLD_DOCUMENTONOVEDADPATHCOMPLETO = "PathCompleto";    
    /** <code>PathCompleto</code> field length. */
    public static final int FLD_DOCUMENTONOVEDADPATHCOMPLETOLENGTH = 255;
    /** <code>documentoNovedadPathCompleto</code> attribute field name. */
    public static final String ATTR_FIELD_DOCUMENTONOVEDADPATHCOMPLETO = "documentoNovedadPathCompleto";
    // Field (Extension)
    /** <code>Extension</code> field name. */
    public static final String FLD_DOCUMENTONOVEDADEXTENSION = "Extension";    
    /** <code>Extension</code> field length. */
    public static final int FLD_DOCUMENTONOVEDADEXTENSIONLENGTH = 15;
    /** <code>documentoNovedadExtension</code> attribute field name. */
    public static final String ATTR_FIELD_DOCUMENTONOVEDADEXTENSION = "documentoNovedadExtension";
    // Field (ResultadoSubida)
    /** <code>ResultadoSubida</code> field name. */
    public static final String FLD_DOCUMENTONOVEDADRESULTADOSUBIDA = "ResultadoSubida";    
    /** <code>documentoNovedadResultadoSubida</code> attribute field name. */
    public static final String ATTR_FIELD_DOCUMENTONOVEDADRESULTADOSUBIDA = "documentoNovedadResultadoSubida";
    // Field (IdDocEnGestor)
    /** <code>IdDocEnGestor</code> field name. */
    public static final String FLD_DOCUMENTONOVEDADIDDOCENGESTOR = "IdDocEnGestor";    
    /** <code>IdDocEnGestor</code> field length. */
    public static final int FLD_DOCUMENTONOVEDADIDDOCENGESTORLENGTH = 255;
    /** <code>documentoNovedadIdDocEnGestor</code> attribute field name. */
    public static final String ATTR_FIELD_DOCUMENTONOVEDADIDDOCENGESTOR = "documentoNovedadIdDocEnGestor";
    // Field (Nombre)
    /** <code>Nombre</code> field name. */
    public static final String FLD_DOCUMENTONOVEDADNOMBRE = "Nombre";    
    /** <code>Nombre</code> field length. */
    public static final int FLD_DOCUMENTONOVEDADNOMBRELENGTH = 255;
    /** <code>documentoNovedadNombre</code> attribute field name. */
    public static final String ATTR_FIELD_DOCUMENTONOVEDADNOMBRE = "documentoNovedadNombre";
    // Field (UsuarioCreador)
    /** <code>UsuarioCreador</code> field name. */
    public static final String FLD_DOCUMENTONOVEDADUSUARIOCREADOR = "UsuarioCreador";    
    /** <code>UsuarioCreador</code> field length. */
    public static final int FLD_DOCUMENTONOVEDADUSUARIOCREADORLENGTH = 50;
    /** <code>documentoNovedadUsuarioCreador</code> attribute field name. */
    public static final String ATTR_FIELD_DOCUMENTONOVEDADUSUARIOCREADOR = "documentoNovedadUsuarioCreador";

    // Component role (Solicitud)
    /** <code>Solicitud</code> role id. */
    public static final String ROLE_ID_SOLICITUD = "Agr_1583333376000677_Alias";
    /** <code>Solicitud</code> role name. */
    public static final String ROLE_NAME_SOLICITUD = "solicitud";
    /** <code>Solicitud</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUD = "Solicitud";

    /** <code>Solicitud</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUD = SolicitudNovedadConstants.ROLE_NAME_DOCUMENTOS;
    /** <code>Solicitud</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUD = "";
    /** <code>Solicitud</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUD = SolicitudNovedadConstants.CLASS_NAME;

    /** Agents allowed to navigate through Solicitud **/
    public static final String SOLICITUD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Usuario)
    /** <code>Usuario</code> role id. */
    public static final String ROLE_ID_USUARIO = "Agr_1583333376000747_Alias";
    /** <code>Usuario</code> role name. */
    public static final String ROLE_NAME_USUARIO = "usuario";
    /** <code>Usuario</code> role alias. */
    public static final String ROLE_ALIAS_USUARIO = "Usuario";

    /** <code>Usuario</code> inverse role name. */
    public static final String ROLE_INVNAME_USUARIO = UsuarioNovedadConstants.ROLE_NAME_DOCUMENTOS;
    /** <code>Usuario</code> role facet sequence. */
    public static final String PATH_FACETS_USUARIO = "";
    /** <code>Usuario</code> role target class. */
    public static final String ROLE_TARGET_USUARIO = UsuarioNovedadConstants.CLASS_NAME;

    /** Agents allowed to navigate through Usuario **/
    public static final String USUARIO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";

    // Compound role (LogEstadoDocNov)
    /** <code>LogEstadoDocNov</code> role id. */
    public static final String ROLE_ID_LOGESTADODOCNOV = "Agr_1594054803456266_Alias";
    /** <code>LogEstadoDocNov</code> role name. */
    public static final String ROLE_NAME_LOGESTADODOCNOV = "logEstadoDocNov";
    /** <code>DocumentoNovedad</code> role alias. */
    public static final String ROLE_ALIAS_LOGESTADODOCNOV = "LogEstadoDocNov";


    /** <code>LogEstadoDocNov</code> inverse role name. */
    public static final String ROLE_INVNAME_LOGESTADODOCNOV = LogEstadoDocNovConstants.ROLE_NAME_DOCUMENTONOVEDAD;
    /** <code>LogEstadoDocNov</code> role facet sequence. */
    public static final String PATH_FACETS_LOGESTADODOCNOV = "";
    /** <code>LogEstadoDocNov</code> role target class. */
    public static final String ROLE_TARGET_LOGESTADODOCNOV = LogEstadoDocNovConstants.CLASS_NAME;
    /** Agents allowed to navigate through LogEstadoDocNov **/
    public static final String LOGESTADODOCNOV_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1582535933952300Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>documentoNovedadcrearpagrSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOCUMENTONOVEDADCREARPAGRSOLICITUD = "p_agrSolicitud";
    /** <code>documentoNovedadcrearpagrSolicitud</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOCUMENTONOVEDADCREARPAGRSOLICITUD = "Clas_1582535933952300Ser_1Arg_9_Alias";
    /** <code>documentoNovedadcrearpagrSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOCUMENTONOVEDADCREARPAGRSOLICITUD = "Solicitud";
    /** <code>documentoNovedadcrearpagrUsuario</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOCUMENTONOVEDADCREARPAGRUSUARIO = "p_agrUsuario";
    /** <code>documentoNovedadcrearpagrUsuario</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOCUMENTONOVEDADCREARPAGRUSUARIO = "Clas_1582535933952300Ser_1Arg_10_Alias";
    /** <code>documentoNovedadcrearpagrUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOCUMENTONOVEDADCREARPAGRUSUARIO = "Usuario";
    /** <code>documentoNovedadcrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOCUMENTONOVEDADCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>documentoNovedadcrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOCUMENTONOVEDADCREARPATRDESCRIPCION = "Clas_1582535933952300Ser_1Arg_2_Alias";
    /** <code>documentoNovedadcrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOCUMENTONOVEDADCREARPATRDESCRIPCION = "Descripción";
    /** <code>documentoNovedadcrearpatrEstado</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOCUMENTONOVEDADCREARPATRESTADO = "p_atrEstado";
    /** <code>documentoNovedadcrearpatrEstado</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOCUMENTONOVEDADCREARPATRESTADO = "Clas_1582535933952300Ser_1Arg_3_Alias";
    /** <code>documentoNovedadcrearpatrEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOCUMENTONOVEDADCREARPATRESTADO = "Estado";
    /** <code>documentoNovedadcrearpatrIdDocEnGestor</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOCUMENTONOVEDADCREARPATRIDDOCENGESTOR = "p_atrIdDocEnGestor";
    /** <code>documentoNovedadcrearpatrIdDocEnGestor</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOCUMENTONOVEDADCREARPATRIDDOCENGESTOR = "Clas_1582535933952300Ser_1Arg_5_Alias";
    /** <code>documentoNovedadcrearpatrIdDocEnGestor</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOCUMENTONOVEDADCREARPATRIDDOCENGESTOR = "Id. En Gestor";
    /** <code>documentoNovedadcrearpatrTipo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOCUMENTONOVEDADCREARPATRTIPO = "p_atrTipo";
    /** <code>documentoNovedadcrearpatrTipo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOCUMENTONOVEDADCREARPATRTIPO = "Clas_1582535933952300Ser_1Arg_11_Alias";
    /** <code>documentoNovedadcrearpatrTipo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOCUMENTONOVEDADCREARPATRTIPO = "Tipo";
    /** <code>documentoNovedadcrearpatrNombre</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOCUMENTONOVEDADCREARPATRNOMBRE = "p_atrNombre";
    /** <code>documentoNovedadcrearpatrNombre</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOCUMENTONOVEDADCREARPATRNOMBRE = "Clas_1582535933952300Ser_1Arg_12_Alias";
    /** <code>documentoNovedadcrearpatrNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOCUMENTONOVEDADCREARPATRNOMBRE = "Archivo adjunto";
    /** <code>documentoNovedadcrearpatrExtension</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOCUMENTONOVEDADCREARPATREXTENSION = "p_atrExtension";
    /** <code>documentoNovedadcrearpatrExtension</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOCUMENTONOVEDADCREARPATREXTENSION = "Clas_1582535933952300Ser_1Arg_13_Alias";
    /** <code>documentoNovedadcrearpatrExtension</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOCUMENTONOVEDADCREARPATREXTENSION = "Extensión";
    /** <code>documentoNovedadcrearpatrUsuarioCreador</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOCUMENTONOVEDADCREARPATRUSUARIOCREADOR = "p_atrUsuarioCreador";
    /** <code>documentoNovedadcrearpatrUsuarioCreador</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOCUMENTONOVEDADCREARPATRUSUARIOCREADOR = "Clas_1582535933952300Ser_1Arg_14_Alias";
    /** <code>documentoNovedadcrearpatrUsuarioCreador</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOCUMENTONOVEDADCREARPATRUSUARIOCREADOR = "Usuario";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1582535933952300Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>documentoNovedadeliminarpthisDocumentoNovedad</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_DOCUMENTONOVEDADELIMINARPTHISDOCUMENTONOVEDAD = "p_thisDocumentoNovedad";
    /** <code>documentoNovedadeliminarpthisDocumentoNovedad</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_DOCUMENTONOVEDADELIMINARPTHISDOCUMENTONOVEDAD = "Clas_1582535933952300Ser_2Arg_1_Alias";
    /** <code>documentoNovedadeliminarpthisDocumentoNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_DOCUMENTONOVEDADELIMINARPTHISDOCUMENTONOVEDAD = "Documento";
    // Service (cambiarFechaSubida)
    /** <code>cambiarFechaSubida</code> service id. */
    public static final String SERV_ID_CAMBIARFECHASUBIDA = "Clas_1582535933952300Ser_3_Alias";
    /** <code>cambiarFechaSubida</code> service name. */
    public static final String SERV_NAME_CAMBIARFECHASUBIDA = "cambiarFechaSubida";
    /** <code>cambiarFechaSubida</code> service alias. */
    public static final String SERV_ALIAS_CAMBIARFECHASUBIDA = "Modificar";
    /** Agents allowed to execute the service cambiarFechaSubida **/
    public static final String CAMBIARFECHASUBIDA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>documentoNovedadcambiarFechaSubidapthisDocumentoNovedad</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARFECHASUBIDA_DOCUMENTONOVEDADCAMBIARFECHASUBIDAPTHISDOCUMENTONOVEDAD = "p_thisDocumentoNovedad";
    /** <code>documentoNovedadcambiarFechaSubidapthisDocumentoNovedad</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARFECHASUBIDA_DOCUMENTONOVEDADCAMBIARFECHASUBIDAPTHISDOCUMENTONOVEDAD = "Clas_1582535933952300Ser_3Arg_1_Alias";
    /** <code>documentoNovedadcambiarFechaSubidapthisDocumentoNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARFECHASUBIDA_DOCUMENTONOVEDADCAMBIARFECHASUBIDAPTHISDOCUMENTONOVEDAD = "Documento";
    /** <code>documentoNovedadcambiarFechaSubidapFechaSubida</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARFECHASUBIDA_DOCUMENTONOVEDADCAMBIARFECHASUBIDAPFECHASUBIDA = "p_FechaSubida";
    /** <code>documentoNovedadcambiarFechaSubidapFechaSubida</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARFECHASUBIDA_DOCUMENTONOVEDADCAMBIARFECHASUBIDAPFECHASUBIDA = "Clas_1582535933952300Ser_3Arg_4_Alias";
    /** <code>documentoNovedadcambiarFechaSubidapFechaSubida</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARFECHASUBIDA_DOCUMENTONOVEDADCAMBIARFECHASUBIDAPFECHASUBIDA = "Fecha subida gestor";
    // Service (cambiarEstado)
    /** <code>cambiarEstado</code> service id. */
    public static final String SERV_ID_CAMBIARESTADO = "Clas_1582535933952300Ser_12_Alias";
    /** <code>cambiarEstado</code> service name. */
    public static final String SERV_NAME_CAMBIARESTADO = "cambiarEstado";
    /** <code>cambiarEstado</code> service alias. */
    public static final String SERV_ALIAS_CAMBIARESTADO = "cambiarEstado";
    /** Agents allowed to execute the service cambiarEstado **/
    public static final String CAMBIARESTADO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>documentoNovedadcambiarEstadopthisDocumentoNovedad</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARESTADO_DOCUMENTONOVEDADCAMBIARESTADOPTHISDOCUMENTONOVEDAD = "p_thisDocumentoNovedad";
    /** <code>documentoNovedadcambiarEstadopthisDocumentoNovedad</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARESTADO_DOCUMENTONOVEDADCAMBIARESTADOPTHISDOCUMENTONOVEDAD = "Clas_1582535933952300Ser_12Arg_1_Alias";
    /** <code>documentoNovedadcambiarEstadopthisDocumentoNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARESTADO_DOCUMENTONOVEDADCAMBIARESTADOPTHISDOCUMENTONOVEDAD = "Documento";
    /** <code>documentoNovedadcambiarEstadopeEstado</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARESTADO_DOCUMENTONOVEDADCAMBIARESTADOPEESTADO = "peEstado";
    /** <code>documentoNovedadcambiarEstadopeEstado</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARESTADO_DOCUMENTONOVEDADCAMBIARESTADOPEESTADO = "Clas_1582535933952300Ser_12Arg_2_Alias";
    /** <code>documentoNovedadcambiarEstadopeEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARESTADO_DOCUMENTONOVEDADCAMBIARESTADOPEESTADO = "Estado";
    // Service (dummyEnviarEmail)
    /** <code>dummyEnviarEmail</code> service id. */
    public static final String SERV_ID_DUMMYENVIAREMAIL = "Clas_1582535933952300Ser_17_Alias";
    /** <code>dummyEnviarEmail</code> service name. */
    public static final String SERV_NAME_DUMMYENVIAREMAIL = "dummyEnviarEmail";
    /** <code>dummyEnviarEmail</code> service alias. */
    public static final String SERV_ALIAS_DUMMYENVIAREMAIL = "dummy_EnviarEmail";
    /** Agents allowed to execute the service dummyEnviarEmail **/
    public static final String DUMMYENVIAREMAIL_SRVAGENTS = "";
    // Preconditions
    /** <code>dummyEnviarEmail</code> precondition 0 id. */
    public static final String PRE_ID_DUMMYENVIAREMAIL_0 = "Clas_1582535933952300Pre_1_MsgError";
    // Inbound arguments
    /** <code>documentoNovedaddummyEnviarEmailpthisDocumentoNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DUMMYENVIAREMAIL_DOCUMENTONOVEDADDUMMYENVIAREMAILPTHISDOCUMENTONOVEDAD = "p_thisDocumentoNovedad";
    /** <code>documentoNovedaddummyEnviarEmailpthisDocumentoNovedad</code> inbound argument id. */
    public static final String ARG_ID_DUMMYENVIAREMAIL_DOCUMENTONOVEDADDUMMYENVIAREMAILPTHISDOCUMENTONOVEDAD = "Clas_1582535933952300Ser_17Arg_1_Alias";
    /** <code>documentoNovedaddummyEnviarEmailpthisDocumentoNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DUMMYENVIAREMAIL_DOCUMENTONOVEDADDUMMYENVIAREMAILPTHISDOCUMENTONOVEDAD = "Documento";
    /** <code>documentoNovedaddummyEnviarEmailpTo</code> inbound argument name. */
    public static final String ARG_NAME_DUMMYENVIAREMAIL_DOCUMENTONOVEDADDUMMYENVIAREMAILPTO = "pTo";
    /** <code>documentoNovedaddummyEnviarEmailpTo</code> inbound argument id. */
    public static final String ARG_ID_DUMMYENVIAREMAIL_DOCUMENTONOVEDADDUMMYENVIAREMAILPTO = "Clas_1582535933952300Ser_17Arg_2_Alias";
    /** <code>documentoNovedaddummyEnviarEmailpTo</code> inbound argument alias. */
    public static final String ARG_ALIAS_DUMMYENVIAREMAIL_DOCUMENTONOVEDADDUMMYENVIAREMAILPTO = "pTo";
    /** <code>documentoNovedaddummyEnviarEmailpAsunto</code> inbound argument name. */
    public static final String ARG_NAME_DUMMYENVIAREMAIL_DOCUMENTONOVEDADDUMMYENVIAREMAILPASUNTO = "pAsunto";
    /** <code>documentoNovedaddummyEnviarEmailpAsunto</code> inbound argument id. */
    public static final String ARG_ID_DUMMYENVIAREMAIL_DOCUMENTONOVEDADDUMMYENVIAREMAILPASUNTO = "Clas_1582535933952300Ser_17Arg_3_Alias";
    /** <code>documentoNovedaddummyEnviarEmailpAsunto</code> inbound argument alias. */
    public static final String ARG_ALIAS_DUMMYENVIAREMAIL_DOCUMENTONOVEDADDUMMYENVIAREMAILPASUNTO = "pAsunto";
    /** <code>documentoNovedaddummyEnviarEmailpBoby</code> inbound argument name. */
    public static final String ARG_NAME_DUMMYENVIAREMAIL_DOCUMENTONOVEDADDUMMYENVIAREMAILPBOBY = "pBoby";
    /** <code>documentoNovedaddummyEnviarEmailpBoby</code> inbound argument id. */
    public static final String ARG_ID_DUMMYENVIAREMAIL_DOCUMENTONOVEDADDUMMYENVIAREMAILPBOBY = "Clas_1582535933952300Ser_17Arg_4_Alias";
    /** <code>documentoNovedaddummyEnviarEmailpBoby</code> inbound argument alias. */
    public static final String ARG_ALIAS_DUMMYENVIAREMAIL_DOCUMENTONOVEDADDUMMYENVIAREMAILPBOBY = "pBoby";
    // Service (subirDocumentoGestorATO)
    /** <code>subirDocumentoGestorATO</code> service id. */
    public static final String SERV_ID_SUBIRDOCUMENTOGESTORATO = "Clas_1582535933952300Ser_20_Alias";
    /** <code>subirDocumentoGestorATO</code> service name. */
    public static final String SERV_NAME_SUBIRDOCUMENTOGESTORATO = "subirDocumentoGestorATO";
    /** <code>subirDocumentoGestorATO</code> service alias. */
    public static final String SERV_ALIAS_SUBIRDOCUMENTOGESTORATO = "subirDocumentoGestorATO";
    /** Agents allowed to execute the service subirDocumentoGestorATO **/
    public static final String SUBIRDOCUMENTOGESTORATO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>documentoNovedadsubirDocumentoGestorATOpthisDocumentoNovedad</code> inbound argument name. */
    public static final String ARG_NAME_SUBIRDOCUMENTOGESTORATO_DOCUMENTONOVEDADSUBIRDOCUMENTOGESTORATOPTHISDOCUMENTONOVEDAD = "p_thisDocumentoNovedad";
    /** <code>documentoNovedadsubirDocumentoGestorATOpthisDocumentoNovedad</code> inbound argument id. */
    public static final String ARG_ID_SUBIRDOCUMENTOGESTORATO_DOCUMENTONOVEDADSUBIRDOCUMENTOGESTORATOPTHISDOCUMENTONOVEDAD = "Clas_1582535933952300Ser_20Arg_1_Alias";
    /** <code>documentoNovedadsubirDocumentoGestorATOpthisDocumentoNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_SUBIRDOCUMENTOGESTORATO_DOCUMENTONOVEDADSUBIRDOCUMENTOGESTORATOPTHISDOCUMENTONOVEDAD = "Documento";
    /** <code>documentoNovedadsubirDocumentoGestorATOpeIdDocGestor</code> inbound argument name. */
    public static final String ARG_NAME_SUBIRDOCUMENTOGESTORATO_DOCUMENTONOVEDADSUBIRDOCUMENTOGESTORATOPEIDDOCGESTOR = "peIdDocGestor";
    /** <code>documentoNovedadsubirDocumentoGestorATOpeIdDocGestor</code> inbound argument id. */
    public static final String ARG_ID_SUBIRDOCUMENTOGESTORATO_DOCUMENTONOVEDADSUBIRDOCUMENTOGESTORATOPEIDDOCGESTOR = "Clas_1582535933952300Ser_20Arg_2_Alias";
    /** <code>documentoNovedadsubirDocumentoGestorATOpeIdDocGestor</code> inbound argument alias. */
    public static final String ARG_ALIAS_SUBIRDOCUMENTOGESTORATO_DOCUMENTONOVEDADSUBIRDOCUMENTOGESTORATOPEIDDOCGESTOR = "Id. En Gestor";
    /** <code>documentoNovedadsubirDocumentoGestorATOptNombre</code> inbound argument name. */
    public static final String ARG_NAME_SUBIRDOCUMENTOGESTORATO_DOCUMENTONOVEDADSUBIRDOCUMENTOGESTORATOPTNOMBRE = "ptNombre";
    /** <code>documentoNovedadsubirDocumentoGestorATOptNombre</code> inbound argument id. */
    public static final String ARG_ID_SUBIRDOCUMENTOGESTORATO_DOCUMENTONOVEDADSUBIRDOCUMENTOGESTORATOPTNOMBRE = "Clas_1582535933952300Ser_20Arg_3_Alias";
    /** <code>documentoNovedadsubirDocumentoGestorATOptNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_SUBIRDOCUMENTOGESTORATO_DOCUMENTONOVEDADSUBIRDOCUMENTOGESTORATOPTNOMBRE = "Archivo adjunto";
    // Service (descargarDocumentoATO)
    /** <code>descargarDocumentoATO</code> service id. */
    public static final String SERV_ID_DESCARGARDOCUMENTOATO = "Clas_1582535933952300Ser_21_Alias";
    /** <code>descargarDocumentoATO</code> service name. */
    public static final String SERV_NAME_DESCARGARDOCUMENTOATO = "descargarDocumentoATO";
    /** <code>descargarDocumentoATO</code> service alias. */
    public static final String SERV_ALIAS_DESCARGARDOCUMENTOATO = "Previsualizar";
    /** Agents allowed to execute the service descargarDocumentoATO **/
    public static final String DESCARGARDOCUMENTOATO_SRVAGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Preconditions
    /** <code>descargarDocumentoATO</code> precondition 0 id. */
    public static final String PRE_ID_DESCARGARDOCUMENTOATO_0 = "Clas_1582535933952300Pre_3_MsgError";
    // Inbound arguments
    /** <code>documentoNovedaddescargarDocumentoATOpthisDocumentoNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DESCARGARDOCUMENTOATO_DOCUMENTONOVEDADDESCARGARDOCUMENTOATOPTHISDOCUMENTONOVEDAD = "p_thisDocumentoNovedad";
    /** <code>documentoNovedaddescargarDocumentoATOpthisDocumentoNovedad</code> inbound argument id. */
    public static final String ARG_ID_DESCARGARDOCUMENTOATO_DOCUMENTONOVEDADDESCARGARDOCUMENTOATOPTHISDOCUMENTONOVEDAD = "Clas_1582535933952300Ser_21Arg_1_Alias";
    /** <code>documentoNovedaddescargarDocumentoATOpthisDocumentoNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DESCARGARDOCUMENTOATO_DOCUMENTONOVEDADDESCARGARDOCUMENTOATOPTHISDOCUMENTONOVEDAD = "Documento";
    // Outbound arguments
    /** <code>documentoNovedaddescargarDocumentoATOoaUrlDescarga</code> outbound argument name. */
    public static final String ARG_NAME_DESCARGARDOCUMENTOATO_DOCUMENTONOVEDADDESCARGARDOCUMENTOATOOAURLDESCARGA = "documentoNovedaddescargarDocumentoATOoaUrlDescarga";
    /** <code>documentoNovedaddescargarDocumentoATOoaUrlDescarga</code> outbound argument id. */
    public static final String ARG_ID_DESCARGARDOCUMENTOATO_DOCUMENTONOVEDADDESCARGARDOCUMENTOATOOAURLDESCARGA = "Clas_1582535933952300Ser_21Arg_2_Alias";
    /** <code>documentoNovedaddescargarDocumentoATOoaUrlDescarga</code> outbound argument alias. */
    public static final String ARG_ALIAS_DESCARGARDOCUMENTOATO_DOCUMENTONOVEDADDESCARGARDOCUMENTOATOOAURLDESCARGA = "oaUrlDescarga";
    /** <code>documentoNovedaddescargarDocumentoATOoaToken</code> outbound argument name. */
    public static final String ARG_NAME_DESCARGARDOCUMENTOATO_DOCUMENTONOVEDADDESCARGARDOCUMENTOATOOATOKEN = "documentoNovedaddescargarDocumentoATOoaToken";
    /** <code>documentoNovedaddescargarDocumentoATOoaToken</code> outbound argument id. */
    public static final String ARG_ID_DESCARGARDOCUMENTOATO_DOCUMENTONOVEDADDESCARGARDOCUMENTOATOOATOKEN = "Clas_1582535933952300Ser_21Arg_3_Alias";
    /** <code>documentoNovedaddescargarDocumentoATOoaToken</code> outbound argument alias. */
    public static final String ARG_ALIAS_DESCARGARDOCUMENTOATO_DOCUMENTONOVEDADDESCARGARDOCUMENTOATOOATOKEN = "oaToken";
    /** <code>documentoNovedaddescargarDocumentoATOoaNumSolicitud</code> outbound argument name. */
    public static final String ARG_NAME_DESCARGARDOCUMENTOATO_DOCUMENTONOVEDADDESCARGARDOCUMENTOATOOANUMSOLICITUD = "documentoNovedaddescargarDocumentoATOoaNumSolicitud";
    /** <code>documentoNovedaddescargarDocumentoATOoaNumSolicitud</code> outbound argument id. */
    public static final String ARG_ID_DESCARGARDOCUMENTOATO_DOCUMENTONOVEDADDESCARGARDOCUMENTOATOOANUMSOLICITUD = "Clas_1582535933952300Ser_21Arg_4_Alias";
    /** <code>documentoNovedaddescargarDocumentoATOoaNumSolicitud</code> outbound argument alias. */
    public static final String ARG_ALIAS_DESCARGARDOCUMENTOATO_DOCUMENTONOVEDADDESCARGARDOCUMENTOATOOANUMSOLICITUD = "oaNumSolicitud";
    // Service (TDELETE)
    /** <code>TDELETE</code> service id. */
    public static final String SERV_ID_TDELETE = "Clas_1582535933952300Ser_9_Alias";
    /** <code>TDELETE</code> service name. */
    public static final String SERV_NAME_TDELETE = "TDELETE";
    /** <code>TDELETE</code> service alias. */
    public static final String SERV_ALIAS_TDELETE = "TDELETE";
    /** Agents allowed to execute the service TDELETE **/
    public static final String TDELETE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>documentoNovedadTDELETEpthisDocumentoNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TDELETE_DOCUMENTONOVEDADTDELETEPTHISDOCUMENTONOVEDAD = "p_thisDocumentoNovedad";
    /** <code>documentoNovedadTDELETEpthisDocumentoNovedad</code> inbound argument id. */
    public static final String ARG_ID_TDELETE_DOCUMENTONOVEDADTDELETEPTHISDOCUMENTONOVEDAD = "Clas_1582535933952300Ser_9Arg_1_Alias";
    /** <code>documentoNovedadTDELETEpthisDocumentoNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TDELETE_DOCUMENTONOVEDADTDELETEPTHISDOCUMENTONOVEDAD = "Documento";
    // Service (TAPROBAR)
    /** <code>TAPROBAR</code> service id. */
    public static final String SERV_ID_TAPROBAR = "Clas_1582535933952300Ser_10_Alias";
    /** <code>TAPROBAR</code> service name. */
    public static final String SERV_NAME_TAPROBAR = "TAPROBAR";
    /** <code>TAPROBAR</code> service alias. */
    public static final String SERV_ALIAS_TAPROBAR = "Aprobar";
    /** Agents allowed to execute the service TAPROBAR **/
    public static final String TAPROBAR_SRVAGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,MesaDeApoyo";
    // Inbound arguments
    /** <code>documentoNovedadTAPROBARpthisDocumentoNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TAPROBAR_DOCUMENTONOVEDADTAPROBARPTHISDOCUMENTONOVEDAD = "p_thisDocumentoNovedad";
    /** <code>documentoNovedadTAPROBARpthisDocumentoNovedad</code> inbound argument id. */
    public static final String ARG_ID_TAPROBAR_DOCUMENTONOVEDADTAPROBARPTHISDOCUMENTONOVEDAD = "Clas_1582535933952300Ser_10Arg_1_Alias";
    /** <code>documentoNovedadTAPROBARpthisDocumentoNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TAPROBAR_DOCUMENTONOVEDADTAPROBARPTHISDOCUMENTONOVEDAD = "Documento";
    /** <code>documentoNovedadTAPROBARptpatrObservacions</code> inbound argument name. */
    public static final String ARG_NAME_TAPROBAR_DOCUMENTONOVEDADTAPROBARPTPATROBSERVACIONS = "pt_p_atrObservacions";
    /** <code>documentoNovedadTAPROBARptpatrObservacions</code> inbound argument id. */
    public static final String ARG_ID_TAPROBAR_DOCUMENTONOVEDADTAPROBARPTPATROBSERVACIONS = "Clas_1582535933952300Ser_10Arg_2_Alias";
    /** <code>documentoNovedadTAPROBARptpatrObservacions</code> inbound argument alias. */
    public static final String ARG_ALIAS_TAPROBAR_DOCUMENTONOVEDADTAPROBARPTPATROBSERVACIONS = "Observaciones";
    // Service (TDEVOLVER)
    /** <code>TDEVOLVER</code> service id. */
    public static final String SERV_ID_TDEVOLVER = "Clas_1582535933952300Ser_11_Alias";
    /** <code>TDEVOLVER</code> service name. */
    public static final String SERV_NAME_TDEVOLVER = "TDEVOLVER";
    /** <code>TDEVOLVER</code> service alias. */
    public static final String SERV_ALIAS_TDEVOLVER = "Devolver";
    /** Agents allowed to execute the service TDEVOLVER **/
    public static final String TDEVOLVER_SRVAGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,MesaDeApoyo";
    // Inbound arguments
    /** <code>documentoNovedadTDEVOLVERpthisDocumentoNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TDEVOLVER_DOCUMENTONOVEDADTDEVOLVERPTHISDOCUMENTONOVEDAD = "p_thisDocumentoNovedad";
    /** <code>documentoNovedadTDEVOLVERpthisDocumentoNovedad</code> inbound argument id. */
    public static final String ARG_ID_TDEVOLVER_DOCUMENTONOVEDADTDEVOLVERPTHISDOCUMENTONOVEDAD = "Clas_1582535933952300Ser_11Arg_1_Alias";
    /** <code>documentoNovedadTDEVOLVERpthisDocumentoNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TDEVOLVER_DOCUMENTONOVEDADTDEVOLVERPTHISDOCUMENTONOVEDAD = "Documento";
    /** <code>documentoNovedadTDEVOLVERptpatrObservacions</code> inbound argument name. */
    public static final String ARG_NAME_TDEVOLVER_DOCUMENTONOVEDADTDEVOLVERPTPATROBSERVACIONS = "pt_p_atrObservacions";
    /** <code>documentoNovedadTDEVOLVERptpatrObservacions</code> inbound argument id. */
    public static final String ARG_ID_TDEVOLVER_DOCUMENTONOVEDADTDEVOLVERPTPATROBSERVACIONS = "Clas_1582535933952300Ser_11Arg_2_Alias";
    /** <code>documentoNovedadTDEVOLVERptpatrObservacions</code> inbound argument alias. */
    public static final String ARG_ALIAS_TDEVOLVER_DOCUMENTONOVEDADTDEVOLVERPTPATROBSERVACIONS = "Observaciones";
    // Service (TCREARDOCIDDESDECORE)
    /** <code>TCREARDOCIDDESDECORE</code> service id. */
    public static final String SERV_ID_TCREARDOCIDDESDECORE = "Clas_1582535933952300Ser_18_Alias";
    /** <code>TCREARDOCIDDESDECORE</code> service name. */
    public static final String SERV_NAME_TCREARDOCIDDESDECORE = "TCREARDOCIDDESDECORE";
    /** <code>TCREARDOCIDDESDECORE</code> service alias. */
    public static final String SERV_ALIAS_TCREARDOCIDDESDECORE = "Crear documento";
    /** Agents allowed to execute the service TCREARDOCIDDESDECORE **/
    public static final String TCREARDOCIDDESDECORE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>documentoNovedadTCREARDOCIDDESDECOREptpatrIdDocEnGestor</code> inbound argument name. */
    public static final String ARG_NAME_TCREARDOCIDDESDECORE_DOCUMENTONOVEDADTCREARDOCIDDESDECOREPTPATRIDDOCENGESTOR = "pt_p_atrIdDocEnGestor";
    /** <code>documentoNovedadTCREARDOCIDDESDECOREptpatrIdDocEnGestor</code> inbound argument id. */
    public static final String ARG_ID_TCREARDOCIDDESDECORE_DOCUMENTONOVEDADTCREARDOCIDDESDECOREPTPATRIDDOCENGESTOR = "Clas_1582535933952300Ser_18Arg_8_Alias";
    /** <code>documentoNovedadTCREARDOCIDDESDECOREptpatrIdDocEnGestor</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARDOCIDDESDECORE_DOCUMENTONOVEDADTCREARDOCIDDESDECOREPTPATRIDDOCENGESTOR = "Id. En Gestor";
    /** <code>documentoNovedadTCREARDOCIDDESDECOREptpNombre</code> inbound argument name. */
    public static final String ARG_NAME_TCREARDOCIDDESDECORE_DOCUMENTONOVEDADTCREARDOCIDDESDECOREPTPNOMBRE = "pt_p_Nombre";
    /** <code>documentoNovedadTCREARDOCIDDESDECOREptpNombre</code> inbound argument id. */
    public static final String ARG_ID_TCREARDOCIDDESDECORE_DOCUMENTONOVEDADTCREARDOCIDDESDECOREPTPNOMBRE = "Clas_1582535933952300Ser_18Arg_9_Alias";
    /** <code>documentoNovedadTCREARDOCIDDESDECOREptpNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARDOCIDDESDECORE_DOCUMENTONOVEDADTCREARDOCIDDESDECOREPTPNOMBRE = "Nombre";
    /** <code>documentoNovedadTCREARDOCIDDESDECOREptpExtension</code> inbound argument name. */
    public static final String ARG_NAME_TCREARDOCIDDESDECORE_DOCUMENTONOVEDADTCREARDOCIDDESDECOREPTPEXTENSION = "pt_p_Extension";
    /** <code>documentoNovedadTCREARDOCIDDESDECOREptpExtension</code> inbound argument id. */
    public static final String ARG_ID_TCREARDOCIDDESDECORE_DOCUMENTONOVEDADTCREARDOCIDDESDECOREPTPEXTENSION = "Clas_1582535933952300Ser_18Arg_10_Alias";
    /** <code>documentoNovedadTCREARDOCIDDESDECOREptpExtension</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARDOCIDDESDECORE_DOCUMENTONOVEDADTCREARDOCIDDESDECOREPTPEXTENSION = "Extensión";
    /** <code>documentoNovedadTCREARDOCIDDESDECOREptSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREARDOCIDDESDECORE_DOCUMENTONOVEDADTCREARDOCIDDESDECOREPTSOLICITUD = "ptSolicitud";
    /** <code>documentoNovedadTCREARDOCIDDESDECOREptSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCREARDOCIDDESDECORE_DOCUMENTONOVEDADTCREARDOCIDDESDECOREPTSOLICITUD = "Clas_1582535933952300Ser_18Arg_14_Alias";
    /** <code>documentoNovedadTCREARDOCIDDESDECOREptSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARDOCIDDESDECORE_DOCUMENTONOVEDADTCREARDOCIDDESDECOREPTSOLICITUD = "Solicitud";
    // Service (TCAMBIARESTADO)
    /** <code>TCAMBIARESTADO</code> service id. */
    public static final String SERV_ID_TCAMBIARESTADO = "Clas_1582535933952300Ser_19_Alias";
    /** <code>TCAMBIARESTADO</code> service name. */
    public static final String SERV_NAME_TCAMBIARESTADO = "TCAMBIARESTADO";
    /** <code>TCAMBIARESTADO</code> service alias. */
    public static final String SERV_ALIAS_TCAMBIARESTADO = "TCAMBIARESTADO";
    /** Agents allowed to execute the service TCAMBIARESTADO **/
    public static final String TCAMBIARESTADO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>documentoNovedadTCAMBIARESTADOpthisDocumentoNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARESTADO_DOCUMENTONOVEDADTCAMBIARESTADOPTHISDOCUMENTONOVEDAD = "p_thisDocumentoNovedad";
    /** <code>documentoNovedadTCAMBIARESTADOpthisDocumentoNovedad</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARESTADO_DOCUMENTONOVEDADTCAMBIARESTADOPTHISDOCUMENTONOVEDAD = "Clas_1582535933952300Ser_19Arg_1_Alias";
    /** <code>documentoNovedadTCAMBIARESTADOpthisDocumentoNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARESTADO_DOCUMENTONOVEDADTCAMBIARESTADOPTHISDOCUMENTONOVEDAD = "Documento";
    /** <code>documentoNovedadTCAMBIARESTADOptpatrObservacions</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARESTADO_DOCUMENTONOVEDADTCAMBIARESTADOPTPATROBSERVACIONS = "pt_p_atrObservacions";
    /** <code>documentoNovedadTCAMBIARESTADOptpatrObservacions</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARESTADO_DOCUMENTONOVEDADTCAMBIARESTADOPTPATROBSERVACIONS = "Clas_1582535933952300Ser_19Arg_2_Alias";
    /** <code>documentoNovedadTCAMBIARESTADOptpatrObservacions</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARESTADO_DOCUMENTONOVEDADTCAMBIARESTADOPTPATROBSERVACIONS = "Observaciones";
    /** <code>documentoNovedadTCAMBIARESTADOptNuevoEstado</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARESTADO_DOCUMENTONOVEDADTCAMBIARESTADOPTNUEVOESTADO = "ptNuevoEstado";
    /** <code>documentoNovedadTCAMBIARESTADOptNuevoEstado</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARESTADO_DOCUMENTONOVEDADTCAMBIARESTADOPTNUEVOESTADO = "Clas_1582535933952300Ser_19Arg_3_Alias";
    /** <code>documentoNovedadTCAMBIARESTADOptNuevoEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARESTADO_DOCUMENTONOVEDADTCAMBIARESTADOPTNUEVOESTADO = "ptNuevoEstado";
    /** <code>documentoNovedadTCAMBIARESTADOptAjustarEstadoSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARESTADO_DOCUMENTONOVEDADTCAMBIARESTADOPTAJUSTARESTADOSOLICITUD = "ptAjustarEstadoSolicitud";
    /** <code>documentoNovedadTCAMBIARESTADOptAjustarEstadoSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARESTADO_DOCUMENTONOVEDADTCAMBIARESTADOPTAJUSTARESTADOSOLICITUD = "Clas_1582535933952300Ser_19Arg_4_Alias";
    /** <code>documentoNovedadTCAMBIARESTADOptAjustarEstadoSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARESTADO_DOCUMENTONOVEDADTCAMBIARESTADOPTAJUSTARESTADOSOLICITUD = "ptAjustarEstadoSolicitud";
    // Service (TCREARATO)
    /** <code>TCREARATO</code> service id. */
    public static final String SERV_ID_TCREARATO = "Clas_1582535933952300Ser_23_Alias";
    /** <code>TCREARATO</code> service name. */
    public static final String SERV_NAME_TCREARATO = "TCREARATO";
    /** <code>TCREARATO</code> service alias. */
    public static final String SERV_ALIAS_TCREARATO = "Subir documento";
    /** Agents allowed to execute the service TCREARATO **/
    public static final String TCREARATO_SRVAGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Inbound arguments
    /** <code>documentoNovedadTCREARATOptpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARATO_DOCUMENTONOVEDADTCREARATOPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    /** <code>documentoNovedadTCREARATOptpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_TCREARATO_DOCUMENTONOVEDADTCREARATOPTPATRDESCRIPCION = "Clas_1582535933952300Ser_23Arg_2_Alias";
    /** <code>documentoNovedadTCREARATOptpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARATO_DOCUMENTONOVEDADTCREARATOPTPATRDESCRIPCION = "Descripción";
    /** <code>documentoNovedadTCREARATOptpatrTipo</code> inbound argument name. */
    public static final String ARG_NAME_TCREARATO_DOCUMENTONOVEDADTCREARATOPTPATRTIPO = "pt_p_atrTipo";
    /** <code>documentoNovedadTCREARATOptpatrTipo</code> inbound argument id. */
    public static final String ARG_ID_TCREARATO_DOCUMENTONOVEDADTCREARATOPTPATRTIPO = "Clas_1582535933952300Ser_23Arg_3_Alias";
    /** <code>documentoNovedadTCREARATOptpatrTipo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARATO_DOCUMENTONOVEDADTCREARATOPTPATRTIPO = "Tipo";
    /** <code>documentoNovedadTCREARATOptpExtension</code> inbound argument name. */
    public static final String ARG_NAME_TCREARATO_DOCUMENTONOVEDADTCREARATOPTPEXTENSION = "pt_p_Extension";
    /** <code>documentoNovedadTCREARATOptpExtension</code> inbound argument id. */
    public static final String ARG_ID_TCREARATO_DOCUMENTONOVEDADTCREARATOPTPEXTENSION = "Clas_1582535933952300Ser_23Arg_5_Alias";
    /** <code>documentoNovedadTCREARATOptpExtension</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARATO_DOCUMENTONOVEDADTCREARATOPTPEXTENSION = "Extensión";
    /** <code>documentoNovedadTCREARATOptUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TCREARATO_DOCUMENTONOVEDADTCREARATOPTUSUARIO = "ptUsuario";
    /** <code>documentoNovedadTCREARATOptUsuario</code> inbound argument id. */
    public static final String ARG_ID_TCREARATO_DOCUMENTONOVEDADTCREARATOPTUSUARIO = "Clas_1582535933952300Ser_23Arg_6_Alias";
    /** <code>documentoNovedadTCREARATOptUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARATO_DOCUMENTONOVEDADTCREARATOPTUSUARIO = "Usuario";
    /** <code>documentoNovedadTCREARATOptSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREARATO_DOCUMENTONOVEDADTCREARATOPTSOLICITUD = "ptSolicitud";
    /** <code>documentoNovedadTCREARATOptSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCREARATO_DOCUMENTONOVEDADTCREARATOPTSOLICITUD = "Clas_1582535933952300Ser_23Arg_7_Alias";
    /** <code>documentoNovedadTCREARATOptSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARATO_DOCUMENTONOVEDADTCREARATOPTSOLICITUD = "Solicitud";
    /** <code>documentoNovedadTCREARATOptIdDocGestor</code> inbound argument name. */
    public static final String ARG_NAME_TCREARATO_DOCUMENTONOVEDADTCREARATOPTIDDOCGESTOR = "ptIdDocGestor";
    /** <code>documentoNovedadTCREARATOptIdDocGestor</code> inbound argument id. */
    public static final String ARG_ID_TCREARATO_DOCUMENTONOVEDADTCREARATOPTIDDOCGESTOR = "Clas_1582535933952300Ser_23Arg_9_Alias";
    /** <code>documentoNovedadTCREARATOptIdDocGestor</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARATO_DOCUMENTONOVEDADTCREARATOPTIDDOCGESTOR = "ptIdDocGestor";
    /** <code>documentoNovedadTCREARATOptNombre</code> inbound argument name. */
    public static final String ARG_NAME_TCREARATO_DOCUMENTONOVEDADTCREARATOPTNOMBRE = "ptNombre";
    /** <code>documentoNovedadTCREARATOptNombre</code> inbound argument id. */
    public static final String ARG_ID_TCREARATO_DOCUMENTONOVEDADTCREARATOPTNOMBRE = "Clas_1582535933952300Ser_23Arg_10_Alias";
    /** <code>documentoNovedadTCREARATOptNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARATO_DOCUMENTONOVEDADTCREARATOPTNOMBRE = "ptNombre";
    /** <code>documentoNovedadTCREARATOpfFichero</code> inbound argument name. */
    public static final String ARG_NAME_TCREARATO_DOCUMENTONOVEDADTCREARATOPFFICHERO = "pfFichero";
    /** <code>documentoNovedadTCREARATOpfFichero</code> inbound argument id. */
    public static final String ARG_ID_TCREARATO_DOCUMENTONOVEDADTCREARATOPFFICHERO = "Clas_1582535933952300Ser_23Arg_116_Alias";
    /** <code>documentoNovedadTCREARATOpfFichero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARATO_DOCUMENTONOVEDADTCREARATOPFFICHERO = "Fichero";
    /** <code>documentoNovedadTCREARATOptNumSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREARATO_DOCUMENTONOVEDADTCREARATOPTNUMSOLICITUD = "ptNumSolicitud";
    /** <code>documentoNovedadTCREARATOptNumSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCREARATO_DOCUMENTONOVEDADTCREARATOPTNUMSOLICITUD = "Clas_1582535933952300Ser_23Arg_117_Alias";
    /** <code>documentoNovedadTCREARATOptNumSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARATO_DOCUMENTONOVEDADTCREARATOPTNUMSOLICITUD = "Num Radicado";
    /** <code>documentoNovedadTCREARATOptNumIdentUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TCREARATO_DOCUMENTONOVEDADTCREARATOPTNUMIDENTUSUARIO = "ptNumIdentUsuario";
    /** <code>documentoNovedadTCREARATOptNumIdentUsuario</code> inbound argument id. */
    public static final String ARG_ID_TCREARATO_DOCUMENTONOVEDADTCREARATOPTNUMIDENTUSUARIO = "Clas_1582535933952300Ser_23Arg_119_Alias";
    /** <code>documentoNovedadTCREARATOptNumIdentUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARATO_DOCUMENTONOVEDADTCREARATOPTNUMIDENTUSUARIO = "Num. Identificación";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_DOCUMENTONOVEDADTIPO.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_DOCUMENTONOVEDADFECHASUBIDA.toUpperCase(), Constants.Type.DATETIME.getTypeName());
        attributeTypes.put(ATTR_NAME_DOCUMENTONOVEDADDESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_DOCUMENTONOVEDADESTADO.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_DOCUMENTONOVEDADPATHCOMPLETO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_DOCUMENTONOVEDADEXTENSION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_DOCUMENTONOVEDADRESULTADOSUBIDA.toUpperCase(), Constants.Type.TEXT.getTypeName());
        attributeTypes.put(ATTR_NAME_DOCUMENTONOVEDADIDDOCENGESTOR.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_DOCUMENTONOVEDADNOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_DOCUMENTONOVEDADUSUARIOCREADOR.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_DOCUMENTONOVEDADIDDOCUMENTO.toUpperCase(), DOCUMENTONOVEDADIDDOCUMENTO_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOCUMENTONOVEDADTIPO.toUpperCase(), DOCUMENTONOVEDADTIPO_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOCUMENTONOVEDADFECHASUBIDA.toUpperCase(), DOCUMENTONOVEDADFECHASUBIDA_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOCUMENTONOVEDADDESCRIPCION.toUpperCase(), DOCUMENTONOVEDADDESCRIPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOCUMENTONOVEDADESTADO.toUpperCase(), DOCUMENTONOVEDADESTADO_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOCUMENTONOVEDADPATHCOMPLETO.toUpperCase(), DOCUMENTONOVEDADPATHCOMPLETO_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOCUMENTONOVEDADEXTENSION.toUpperCase(), DOCUMENTONOVEDADEXTENSION_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOCUMENTONOVEDADRESULTADOSUBIDA.toUpperCase(), DOCUMENTONOVEDADRESULTADOSUBIDA_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOCUMENTONOVEDADIDDOCENGESTOR.toUpperCase(), DOCUMENTONOVEDADIDDOCENGESTOR_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOCUMENTONOVEDADNOMBRE.toUpperCase(), DOCUMENTONOVEDADNOMBRE_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOCUMENTONOVEDADUSUARIOCREADOR.toUpperCase(), DOCUMENTONOVEDADUSUARIOCREADOR_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_SOLICITUD.toUpperCase(), SOLICITUD_AGENTS);
        roleAgents.put(ROLE_NAME_USUARIO.toUpperCase(), USUARIO_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'DocumentoNovedad', it returns the identification keys
     * - If className is a facet of the inheritance net of 'DocumentoNovedad', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_DOCUMENTONOVEDADIDDOCUMENTO);
        }
        // Facet 'DocumentoNovedad' (This facet)
        if (DocumentoNovedadConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_DOCUMENTONOVEDADIDDOCUMENTO);
        }
        return returnList;
    }
}
