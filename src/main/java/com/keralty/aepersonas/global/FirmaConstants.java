package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>Firma</code> model class.
 */
public final class FirmaConstants {

    private FirmaConstants() {

    }

    // Class
    /** <code>Firma</code> class id. */
    public static final String CLASS_ID = "Clas_1432994709504560_Alias";
    /** <code>Firma</code> class name. */
    public static final String CLASS_NAME = "Firma";
    /** <code>Firma</code> class alias. */
    public static final String CLASS_ALIAS = "Firma";
    /** <code>Firma</code> class table name. */
    public static final String TBL_NAME = "Firma";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "firmaIdentificador,aesolicitudesidsolicitud,aesolicitudesSolicitudSegundaidsolicitud,funcionarioId,aesolicitudesSolicitudContratanteidsolici,firmaLatitud,firmaLongitud";

    public static final String DSDSFIRMAPIURESPONSABLE = "DS_FirmaPIUResponsable";
    public static final String DSDSFIRMANULL = "DS_Firma_Null";
    

    // Attribute (firmaIdentificador)
    /** <code>firmaIdentificador</code> attribute id. */
    public static final String ATTR_ID_FIRMAIDENTIFICADOR = "Clas_1432994709504560Atr_1_Alias";
    /** <code>firmaIdentificador</code> attribute name. */
    public static final String ATTR_NAME_FIRMAIDENTIFICADOR = "firmaIdentificador";
    /** <code>firmaIdentificador</code> attribute alias. */
    public static final String ATTR_ALIAS_FIRMAIDENTIFICADOR = "Identificador";

    /** <code>firmaIdentificador</code> attribute facet sequence. */
    public static final String PATH_FACETS_FIRMAIDENTIFICADOR = "";
    /** Agents allowed to view the attribute firmaIdentificador **/
    public static final String FIRMAIDENTIFICADOR_AGENTS = "Admin,SuperAdmin,RespRegional,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (firmaImagenFirma)
    /** <code>firmaImagenFirma</code> attribute id. */
    public static final String ATTR_ID_FIRMAIMAGENFIRMA = "Clas_1432994709504560Atr_2_Alias";
    /** <code>firmaImagenFirma</code> attribute name. */
    public static final String ATTR_NAME_FIRMAIMAGENFIRMA = "firmaImagenFirma";
    /** <code>firmaImagenFirma</code> attribute alias. */
    public static final String ATTR_ALIAS_FIRMAIMAGENFIRMA = "Firma";

    /** <code>firmaImagenFirma</code> attribute facet sequence. */
    public static final String PATH_FACETS_FIRMAIMAGENFIRMA = "";
    /** Agents allowed to view the attribute firmaImagenFirma **/
    public static final String FIRMAIMAGENFIRMA_AGENTS = "Admin,SuperAdmin,RespRegional,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (firmaLatitud)
    /** <code>firmaLatitud</code> attribute id. */
    public static final String ATTR_ID_FIRMALATITUD = "Clas_1432994709504560Atr_3_Alias";
    /** <code>firmaLatitud</code> attribute name. */
    public static final String ATTR_NAME_FIRMALATITUD = "firmaLatitud";
    /** <code>firmaLatitud</code> attribute alias. */
    public static final String ATTR_ALIAS_FIRMALATITUD = "Latitud";

    /** <code>firmaLatitud</code> attribute facet sequence. */
    public static final String PATH_FACETS_FIRMALATITUD = "";
    /** Agents allowed to view the attribute firmaLatitud **/
    public static final String FIRMALATITUD_AGENTS = "Admin,SuperAdmin,RespRegional,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (firmaLongitud)
    /** <code>firmaLongitud</code> attribute id. */
    public static final String ATTR_ID_FIRMALONGITUD = "Clas_1432994709504560Atr_4_Alias";
    /** <code>firmaLongitud</code> attribute name. */
    public static final String ATTR_NAME_FIRMALONGITUD = "firmaLongitud";
    /** <code>firmaLongitud</code> attribute alias. */
    public static final String ATTR_ALIAS_FIRMALONGITUD = "Longitud";

    /** <code>firmaLongitud</code> attribute facet sequence. */
    public static final String PATH_FACETS_FIRMALONGITUD = "";
    /** Agents allowed to view the attribute firmaLongitud **/
    public static final String FIRMALONGITUD_AGENTS = "Admin,SuperAdmin,RespRegional,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Identificador)
    /** <code>Identificador</code> field name. */
    public static final String FLD_FIRMAIDENTIFICADOR = "Identificador";    
    /** <code>firmaIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_FIRMAIDENTIFICADOR = "firmaIdentificador";
    // Field (id_solicitud)
    /** <code>id_solicitud</code> field name. */
    public static final String FLD_AESOLICITUDESIDSOLICITUD = "id_solicitud";    
    /** <code>Solicitud.Ae_solicitudes.aesolicitudesidsolicitud</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUD_AE_SOLICITUDES_AESOLICITUDESIDSOLICITUD = "aesolicitudesidsolicitud";
    // Field (SolicitudSegunda_id_solicitud)
    /** <code>SolicitudSegunda_id_solicitud</code> field name. */
    public static final String FLD_AESOLICITUDESSOLICITUDSEGUNDAIDSOLICITUD = "SolicitudSegunda_id_solicitud";    
    /** <code>SolicitudSegunda.Ae_solicitudes.aesolicitudesidsolicitud</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDSEGUNDA_AE_SOLICITUDES_AESOLICITUDESIDSOLICITUD = "aesolicitudesSolicitudSegundaidsolicitud";
    // Field (Id)
    /** <code>Id</code> field name. */
    public static final String FLD_FUNCIONARIOID = "Id";    
    /** <code>RespRegional.funcionarioId</code> attribute field name. */
    public static final String ATTR_FIELD_RESPREGIONAL_FUNCIONARIOID = "funcionarioId";
    // Field (SolicitudContratante_id_solici)
    /** <code>SolicitudContratante_id_solici</code> field name. */
    public static final String FLD_AESOLICITUDESSOLICITUDCONTRATANTEIDSOLICI = "SolicitudContratante_id_solici";    
    /** <code>SolicitudContratante.Ae_solicitudes.aesolicitudesidsolicitud</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUDCONTRATANTE_AE_SOLICITUDES_AESOLICITUDESIDSOLICITUD = "aesolicitudesSolicitudContratanteidsolici";
    // Field (ImagenFirma)
    /** <code>ImagenFirma</code> field name. */
    public static final String FLD_FIRMAIMAGENFIRMA = "ImagenFirma";    
    /** <code>firmaImagenFirma</code> attribute field name. */
    public static final String ATTR_FIELD_FIRMAIMAGENFIRMA = "firmaImagenFirma";
    // Field (Latitud)
    /** <code>Latitud</code> field name. */
    public static final String FLD_FIRMALATITUD = "Latitud";    
    /** <code>Latitud</code> field length. */
    public static final int FLD_FIRMALATITUDLENGTH = 25;
    /** <code>firmaLatitud</code> attribute field name. */
    public static final String ATTR_FIELD_FIRMALATITUD = "firmaLatitud";
    // Field (Longitud)
    /** <code>Longitud</code> field name. */
    public static final String FLD_FIRMALONGITUD = "Longitud";    
    /** <code>Longitud</code> field length. */
    public static final int FLD_FIRMALONGITUDLENGTH = 25;
    /** <code>firmaLongitud</code> attribute field name. */
    public static final String ATTR_FIELD_FIRMALONGITUD = "firmaLongitud";

    // Component role (Solicitud)
    /** <code>Solicitud</code> role id. */
    public static final String ROLE_ID_SOLICITUD = "Agr_1432994709504853_Alias";
    /** <code>Solicitud</code> role name. */
    public static final String ROLE_NAME_SOLICITUD = "solicitud";
    /** <code>Solicitud</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUD = "Solicitud";

    /** <code>Solicitud</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUD = SolicitudConstants.ROLE_NAME_FIRMA;
    /** <code>Solicitud</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUD = "";
    /** <code>Solicitud</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUD = SolicitudConstants.CLASS_NAME;

    /** Agents allowed to navigate through Solicitud **/
    public static final String SOLICITUD_AGENTS = "Admin,SuperAdmin,RespRegional,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (SolicitudSegunda)
    /** <code>SolicitudSegunda</code> role id. */
    public static final String ROLE_ID_SOLICITUDSEGUNDA = "Agr_1434052591616188_Alias";
    /** <code>SolicitudSegunda</code> role name. */
    public static final String ROLE_NAME_SOLICITUDSEGUNDA = "solicitudSegunda";
    /** <code>SolicitudSegunda</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUDSEGUNDA = "Solicitud";

    /** <code>SolicitudSegunda</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUDSEGUNDA = SolicitudConstants.ROLE_NAME_SEGUNDAFIRMA;
    /** <code>SolicitudSegunda</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUDSEGUNDA = "";
    /** <code>SolicitudSegunda</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUDSEGUNDA = SolicitudConstants.CLASS_NAME;

    /** Agents allowed to navigate through SolicitudSegunda **/
    public static final String SOLICITUDSEGUNDA_AGENTS = "Admin,SuperAdmin,RespRegional,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (RespRegional)
    /** <code>RespRegional</code> role id. */
    public static final String ROLE_ID_RESPREGIONAL = "Agr_1434550009856531_Alias";
    /** <code>RespRegional</code> role name. */
    public static final String ROLE_NAME_RESPREGIONAL = "respRegional";
    /** <code>RespRegional</code> role alias. */
    public static final String ROLE_ALIAS_RESPREGIONAL = "Responsable regional";

    /** <code>RespRegional</code> inverse role name. */
    public static final String ROLE_INVNAME_RESPREGIONAL = RespRegionalConstants.ROLE_NAME_FIRMA;
    /** <code>RespRegional</code> role facet sequence. */
    public static final String PATH_FACETS_RESPREGIONAL = "";
    /** <code>RespRegional</code> role target class. */
    public static final String ROLE_TARGET_RESPREGIONAL = RespRegionalConstants.CLASS_NAME;

    /** Agents allowed to navigate through RespRegional **/
    public static final String RESPREGIONAL_AGENTS = "Admin,SuperAdmin,RespRegional,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (SolicitudContratante)
    /** <code>SolicitudContratante</code> role id. */
    public static final String ROLE_ID_SOLICITUDCONTRATANTE = "Agr_1547201806336247_Alias";
    /** <code>SolicitudContratante</code> role name. */
    public static final String ROLE_NAME_SOLICITUDCONTRATANTE = "solicitudContratante";
    /** <code>SolicitudContratante</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUDCONTRATANTE = "Solicitud Contratante";

    /** <code>SolicitudContratante</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUDCONTRATANTE = SolicitudConstants.ROLE_NAME_FIRMACONTRATANTEINCL;
    /** <code>SolicitudContratante</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUDCONTRATANTE = "";
    /** <code>SolicitudContratante</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUDCONTRATANTE = SolicitudConstants.CLASS_NAME;

    /** Agents allowed to navigate through SolicitudContratante **/
    public static final String SOLICITUDCONTRATANTE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Compound role (SolicitudNovedad)
    /** <code>SolicitudNovedad</code> role id. */
    public static final String ROLE_ID_SOLICITUDNOVEDAD = "Agr_1594054934528630_Alias";
    /** <code>SolicitudNovedad</code> role name. */
    public static final String ROLE_NAME_SOLICITUDNOVEDAD = "solicitudNovedad";
    /** <code>Firma</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUDNOVEDAD = "SolicitudNovedad";


    /** <code>SolicitudNovedad</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUDNOVEDAD = SolicitudNovedadConstants.ROLE_NAME_FIRMA;
    /** <code>SolicitudNovedad</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUDNOVEDAD = "";
    /** <code>SolicitudNovedad</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUDNOVEDAD = SolicitudNovedadConstants.CLASS_NAME;
    /** Agents allowed to navigate through SolicitudNovedad **/
    public static final String SOLICITUDNOVEDAD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (FamiliaNovedad)
    /** <code>FamiliaNovedad</code> role id. */
    public static final String ROLE_ID_FAMILIANOVEDAD = "Agr_1582129348608905_Alias";
    /** <code>FamiliaNovedad</code> role name. */
    public static final String ROLE_NAME_FAMILIANOVEDAD = "familiaNovedad";
    /** <code>Firma</code> role alias. */
    public static final String ROLE_ALIAS_FAMILIANOVEDAD = "Familia Novedad";


    /** <code>FamiliaNovedad</code> inverse role name. */
    public static final String ROLE_INVNAME_FAMILIANOVEDAD = FamiliaNovedadConstants.ROLE_NAME_FIRMA;
    /** <code>FamiliaNovedad</code> role facet sequence. */
    public static final String PATH_FACETS_FAMILIANOVEDAD = "";
    /** <code>FamiliaNovedad</code> role target class. */
    public static final String ROLE_TARGET_FAMILIANOVEDAD = FamiliaNovedadConstants.CLASS_NAME;
    /** Agents allowed to navigate through FamiliaNovedad **/
    public static final String FAMILIANOVEDAD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (NovedadesCT)
    /** <code>NovedadesCT</code> role id. */
    public static final String ROLE_ID_NOVEDADESCT = "Agr_1582184398848069_Alias";
    /** <code>NovedadesCT</code> role name. */
    public static final String ROLE_NAME_NOVEDADESCT = "novedadesCT";
    /** <code>Firma</code> role alias. */
    public static final String ROLE_ALIAS_NOVEDADESCT = "Novedades CT";


    /** <code>NovedadesCT</code> inverse role name. */
    public static final String ROLE_INVNAME_NOVEDADESCT = NovedadCTConstants.ROLE_NAME_FIRMA;
    /** <code>NovedadesCT</code> role facet sequence. */
    public static final String PATH_FACETS_NOVEDADESCT = "";
    /** <code>NovedadesCT</code> role target class. */
    public static final String ROLE_TARGET_NOVEDADESCT = NovedadCTConstants.CLASS_NAME;
    /** Agents allowed to navigate through NovedadesCT **/
    public static final String NOVEDADESCT_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1432994709504560Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>firmacrearpagrSolicitudSegunda</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FIRMACREARPAGRSOLICITUDSEGUNDA = "p_agrSolicitudSegunda";
    /** <code>firmacrearpagrSolicitudSegunda</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FIRMACREARPAGRSOLICITUDSEGUNDA = "Clas_1432994709504560Ser_1Arg_6_Alias";
    /** <code>firmacrearpagrSolicitudSegunda</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FIRMACREARPAGRSOLICITUDSEGUNDA = "Solicitud";
    /** <code>firmacrearpagrRespRegional</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FIRMACREARPAGRRESPREGIONAL = "p_agrRespRegional";
    /** <code>firmacrearpagrRespRegional</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FIRMACREARPAGRRESPREGIONAL = "Clas_1432994709504560Ser_1Arg_7_Alias";
    /** <code>firmacrearpagrRespRegional</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FIRMACREARPAGRRESPREGIONAL = "Responsable regional";
    /** <code>firmacrearpagrSolicitudContratante</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FIRMACREARPAGRSOLICITUDCONTRATANTE = "p_agrSolicitudContratante";
    /** <code>firmacrearpagrSolicitudContratante</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FIRMACREARPAGRSOLICITUDCONTRATANTE = "Clas_1432994709504560Ser_1Arg_12_Alias";
    /** <code>firmacrearpagrSolicitudContratante</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FIRMACREARPAGRSOLICITUDCONTRATANTE = "Solicitud Contratante";
    /** <code>firmacrearpagrFamiliaNovedad</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FIRMACREARPAGRFAMILIANOVEDAD = "p_agrFamiliaNovedad";
    /** <code>firmacrearpagrFamiliaNovedad</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FIRMACREARPAGRFAMILIANOVEDAD = "Clas_1432994709504560Ser_1Arg_13_Alias";
    /** <code>firmacrearpagrFamiliaNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FIRMACREARPAGRFAMILIANOVEDAD = "Familia Novedad";
    /** <code>firmacrearpagrNovedadesCT</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FIRMACREARPAGRNOVEDADESCT = "p_agrNovedadesCT";
    /** <code>firmacrearpagrNovedadesCT</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FIRMACREARPAGRNOVEDADESCT = "Clas_1432994709504560Ser_1Arg_14_Alias";
    /** <code>firmacrearpagrNovedadesCT</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FIRMACREARPAGRNOVEDADESCT = "Novedades CT";
    /** <code>firmacrearpagrSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FIRMACREARPAGRSOLICITUD = "p_agrSolicitud";
    /** <code>firmacrearpagrSolicitud</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FIRMACREARPAGRSOLICITUD = "Clas_1432994709504560Ser_1Arg_17_Alias";
    /** <code>firmacrearpagrSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FIRMACREARPAGRSOLICITUD = "Solicitud";
    /** <code>firmacrearpagrSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FIRMACREARPAGRSOLICITUDNOVEDAD = "p_agrSolicitudNovedad";
    /** <code>firmacrearpagrSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FIRMACREARPAGRSOLICITUDNOVEDAD = "Clas_1432994709504560Ser_1Arg_18_Alias";
    /** <code>firmacrearpagrSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FIRMACREARPAGRSOLICITUDNOVEDAD = "SolicitudNovedad";
    /** <code>firmacrearpatrImagenFirma</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FIRMACREARPATRIMAGENFIRMA = "p_atrImagenFirma";
    /** <code>firmacrearpatrImagenFirma</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FIRMACREARPATRIMAGENFIRMA = "Clas_1432994709504560Ser_1Arg_3_Alias";
    /** <code>firmacrearpatrImagenFirma</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FIRMACREARPATRIMAGENFIRMA = "Firma";
    /** <code>firmacrearpatrLatitud</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FIRMACREARPATRLATITUD = "p_atrLatitud";
    /** <code>firmacrearpatrLatitud</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FIRMACREARPATRLATITUD = "Clas_1432994709504560Ser_1Arg_4_Alias";
    /** <code>firmacrearpatrLatitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FIRMACREARPATRLATITUD = "Latitud";
    /** <code>firmacrearpatrLongitud</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FIRMACREARPATRLONGITUD = "p_atrLongitud";
    /** <code>firmacrearpatrLongitud</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FIRMACREARPATRLONGITUD = "Clas_1432994709504560Ser_1Arg_5_Alias";
    /** <code>firmacrearpatrLongitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FIRMACREARPATRLONGITUD = "Longitud";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1432994709504560Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "¿Está seguro de que desea eliminar la firma del responsable de regional?";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>eliminar</code> precondition 0 id. */
    public static final String PRE_ID_ELIMINAR_0 = "Clas_1432994709504560Pre_1_MsgError";
    // Inbound arguments
    /** <code>firmaeliminarpthisFirma</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_FIRMAELIMINARPTHISFIRMA = "p_thisFirma";
    /** <code>firmaeliminarpthisFirma</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_FIRMAELIMINARPTHISFIRMA = "Clas_1432994709504560Ser_2Arg_1_Alias";
    /** <code>firmaeliminarpthisFirma</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_FIRMAELIMINARPTHISFIRMA = "Firma";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1432994709504560Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar firma";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>firmamodificarpthisFirma</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_FIRMAMODIFICARPTHISFIRMA = "p_thisFirma";
    /** <code>firmamodificarpthisFirma</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_FIRMAMODIFICARPTHISFIRMA = "Clas_1432994709504560Ser_3Arg_1_Alias";
    /** <code>firmamodificarpthisFirma</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_FIRMAMODIFICARPTHISFIRMA = "Firma";
    /** <code>firmamodificarpImagenFirma</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_FIRMAMODIFICARPIMAGENFIRMA = "p_ImagenFirma";
    /** <code>firmamodificarpImagenFirma</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_FIRMAMODIFICARPIMAGENFIRMA = "Clas_1432994709504560Ser_3Arg_2_Alias";
    /** <code>firmamodificarpImagenFirma</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_FIRMAMODIFICARPIMAGENFIRMA = "Firma";
    /** <code>firmamodificarpLatitud</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_FIRMAMODIFICARPLATITUD = "p_Latitud";
    /** <code>firmamodificarpLatitud</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_FIRMAMODIFICARPLATITUD = "Clas_1432994709504560Ser_3Arg_3_Alias";
    /** <code>firmamodificarpLatitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_FIRMAMODIFICARPLATITUD = "Latitud";
    /** <code>firmamodificarpLongitud</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_FIRMAMODIFICARPLONGITUD = "p_Longitud";
    /** <code>firmamodificarpLongitud</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_FIRMAMODIFICARPLONGITUD = "Clas_1432994709504560Ser_3Arg_4_Alias";
    /** <code>firmamodificarpLongitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_FIRMAMODIFICARPLONGITUD = "Longitud";
    // Service (InsFirmaTitularFamiliaNovedad)
    /** <code>InsFirmaTitularFamiliaNovedad</code> service id. */
    public static final String SERV_ID_INSFIRMATITULARFAMILIANOVEDAD = "Clas_1432994709504560Ser_4_Alias";
    /** <code>InsFirmaTitularFamiliaNovedad</code> service name. */
    public static final String SERV_NAME_INSFIRMATITULARFAMILIANOVEDAD = "InsFirmaTitularFamiliaNovedad";
    /** <code>InsFirmaTitularFamiliaNovedad</code> service alias. */
    public static final String SERV_ALIAS_INSFIRMATITULARFAMILIANOVEDAD = "InsFirmaTitularFamiliaNovedad";
    /** Agents allowed to execute the service InsFirmaTitularFamiliaNovedad **/
    public static final String INSFIRMATITULARFAMILIANOVEDAD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>firmaInsFirmaTitularFamiliaNovedadpthisFirma</code> inbound argument name. */
    public static final String ARG_NAME_INSFIRMATITULARFAMILIANOVEDAD_FIRMAINSFIRMATITULARFAMILIANOVEDADPTHISFIRMA = "p_thisFirma";
    /** <code>firmaInsFirmaTitularFamiliaNovedadpthisFirma</code> inbound argument id. */
    public static final String ARG_ID_INSFIRMATITULARFAMILIANOVEDAD_FIRMAINSFIRMATITULARFAMILIANOVEDADPTHISFIRMA = "Clas_1432994709504560Ser_4Arg_1_Alias";
    /** <code>firmaInsFirmaTitularFamiliaNovedadpthisFirma</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSFIRMATITULARFAMILIANOVEDAD_FIRMAINSFIRMATITULARFAMILIANOVEDADPTHISFIRMA = "Firma";
    /** <code>firmaInsFirmaTitularFamiliaNovedadpevcFamiliaNovedad</code> inbound argument name. */
    public static final String ARG_NAME_INSFIRMATITULARFAMILIANOVEDAD_FIRMAINSFIRMATITULARFAMILIANOVEDADPEVCFAMILIANOVEDAD = "p_evcFamiliaNovedad";
    /** <code>firmaInsFirmaTitularFamiliaNovedadpevcFamiliaNovedad</code> inbound argument id. */
    public static final String ARG_ID_INSFIRMATITULARFAMILIANOVEDAD_FIRMAINSFIRMATITULARFAMILIANOVEDADPEVCFAMILIANOVEDAD = "Clas_1432994709504560Ser_4Arg_2_Alias";
    /** <code>firmaInsFirmaTitularFamiliaNovedadpevcFamiliaNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSFIRMATITULARFAMILIANOVEDAD_FIRMAINSFIRMATITULARFAMILIANOVEDADPEVCFAMILIANOVEDAD = "Familia Novedad";
    // Service (DelFirmaTitulaFamiliaNovedad)
    /** <code>DelFirmaTitulaFamiliaNovedad</code> service id. */
    public static final String SERV_ID_DELFIRMATITULAFAMILIANOVEDAD = "Clas_1432994709504560Ser_5_Alias";
    /** <code>DelFirmaTitulaFamiliaNovedad</code> service name. */
    public static final String SERV_NAME_DELFIRMATITULAFAMILIANOVEDAD = "DelFirmaTitulaFamiliaNovedad";
    /** <code>DelFirmaTitulaFamiliaNovedad</code> service alias. */
    public static final String SERV_ALIAS_DELFIRMATITULAFAMILIANOVEDAD = "DelFirmaTitulaFamiliaNovedad";
    /** Agents allowed to execute the service DelFirmaTitulaFamiliaNovedad **/
    public static final String DELFIRMATITULAFAMILIANOVEDAD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>firmaDelFirmaTitulaFamiliaNovedadpthisFirma</code> inbound argument name. */
    public static final String ARG_NAME_DELFIRMATITULAFAMILIANOVEDAD_FIRMADELFIRMATITULAFAMILIANOVEDADPTHISFIRMA = "p_thisFirma";
    /** <code>firmaDelFirmaTitulaFamiliaNovedadpthisFirma</code> inbound argument id. */
    public static final String ARG_ID_DELFIRMATITULAFAMILIANOVEDAD_FIRMADELFIRMATITULAFAMILIANOVEDADPTHISFIRMA = "Clas_1432994709504560Ser_5Arg_1_Alias";
    /** <code>firmaDelFirmaTitulaFamiliaNovedadpthisFirma</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELFIRMATITULAFAMILIANOVEDAD_FIRMADELFIRMATITULAFAMILIANOVEDADPTHISFIRMA = "Firma";
    /** <code>firmaDelFirmaTitulaFamiliaNovedadpevcFamiliaNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DELFIRMATITULAFAMILIANOVEDAD_FIRMADELFIRMATITULAFAMILIANOVEDADPEVCFAMILIANOVEDAD = "p_evcFamiliaNovedad";
    /** <code>firmaDelFirmaTitulaFamiliaNovedadpevcFamiliaNovedad</code> inbound argument id. */
    public static final String ARG_ID_DELFIRMATITULAFAMILIANOVEDAD_FIRMADELFIRMATITULAFAMILIANOVEDADPEVCFAMILIANOVEDAD = "Clas_1432994709504560Ser_5Arg_2_Alias";
    /** <code>firmaDelFirmaTitulaFamiliaNovedadpevcFamiliaNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELFIRMATITULAFAMILIANOVEDAD_FIRMADELFIRMATITULAFAMILIANOVEDADPEVCFAMILIANOVEDAD = "Familia Novedad";
    // Service (InsFirmaNovedadCT)
    /** <code>InsFirmaNovedadCT</code> service id. */
    public static final String SERV_ID_INSFIRMANOVEDADCT = "Clas_1432994709504560Ser_6_Alias";
    /** <code>InsFirmaNovedadCT</code> service name. */
    public static final String SERV_NAME_INSFIRMANOVEDADCT = "InsFirmaNovedadCT";
    /** <code>InsFirmaNovedadCT</code> service alias. */
    public static final String SERV_ALIAS_INSFIRMANOVEDADCT = "InsFirmaNovedadCT";
    /** Agents allowed to execute the service InsFirmaNovedadCT **/
    public static final String INSFIRMANOVEDADCT_SRVAGENTS = "";
    // Inbound arguments
    /** <code>firmaInsFirmaNovedadCTpthisFirma</code> inbound argument name. */
    public static final String ARG_NAME_INSFIRMANOVEDADCT_FIRMAINSFIRMANOVEDADCTPTHISFIRMA = "p_thisFirma";
    /** <code>firmaInsFirmaNovedadCTpthisFirma</code> inbound argument id. */
    public static final String ARG_ID_INSFIRMANOVEDADCT_FIRMAINSFIRMANOVEDADCTPTHISFIRMA = "Clas_1432994709504560Ser_6Arg_1_Alias";
    /** <code>firmaInsFirmaNovedadCTpthisFirma</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSFIRMANOVEDADCT_FIRMAINSFIRMANOVEDADCTPTHISFIRMA = "Firma";
    /** <code>firmaInsFirmaNovedadCTpevcNovedadCT</code> inbound argument name. */
    public static final String ARG_NAME_INSFIRMANOVEDADCT_FIRMAINSFIRMANOVEDADCTPEVCNOVEDADCT = "p_evcNovedadCT";
    /** <code>firmaInsFirmaNovedadCTpevcNovedadCT</code> inbound argument id. */
    public static final String ARG_ID_INSFIRMANOVEDADCT_FIRMAINSFIRMANOVEDADCTPEVCNOVEDADCT = "Clas_1432994709504560Ser_6Arg_2_Alias";
    /** <code>firmaInsFirmaNovedadCTpevcNovedadCT</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSFIRMANOVEDADCT_FIRMAINSFIRMANOVEDADCTPEVCNOVEDADCT = "Novedades CT";
    // Service (DelFirmaNovedadCT)
    /** <code>DelFirmaNovedadCT</code> service id. */
    public static final String SERV_ID_DELFIRMANOVEDADCT = "Clas_1432994709504560Ser_7_Alias";
    /** <code>DelFirmaNovedadCT</code> service name. */
    public static final String SERV_NAME_DELFIRMANOVEDADCT = "DelFirmaNovedadCT";
    /** <code>DelFirmaNovedadCT</code> service alias. */
    public static final String SERV_ALIAS_DELFIRMANOVEDADCT = "DelFirmaNovedadCT";
    /** Agents allowed to execute the service DelFirmaNovedadCT **/
    public static final String DELFIRMANOVEDADCT_SRVAGENTS = "";
    // Inbound arguments
    /** <code>firmaDelFirmaNovedadCTpthisFirma</code> inbound argument name. */
    public static final String ARG_NAME_DELFIRMANOVEDADCT_FIRMADELFIRMANOVEDADCTPTHISFIRMA = "p_thisFirma";
    /** <code>firmaDelFirmaNovedadCTpthisFirma</code> inbound argument id. */
    public static final String ARG_ID_DELFIRMANOVEDADCT_FIRMADELFIRMANOVEDADCTPTHISFIRMA = "Clas_1432994709504560Ser_7Arg_1_Alias";
    /** <code>firmaDelFirmaNovedadCTpthisFirma</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELFIRMANOVEDADCT_FIRMADELFIRMANOVEDADCTPTHISFIRMA = "Firma";
    /** <code>firmaDelFirmaNovedadCTpevcNovedadCT</code> inbound argument name. */
    public static final String ARG_NAME_DELFIRMANOVEDADCT_FIRMADELFIRMANOVEDADCTPEVCNOVEDADCT = "p_evcNovedadCT";
    /** <code>firmaDelFirmaNovedadCTpevcNovedadCT</code> inbound argument id. */
    public static final String ARG_ID_DELFIRMANOVEDADCT_FIRMADELFIRMANOVEDADCTPEVCNOVEDADCT = "Clas_1432994709504560Ser_7Arg_2_Alias";
    /** <code>firmaDelFirmaNovedadCTpevcNovedadCT</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELFIRMANOVEDADCT_FIRMADELFIRMANOVEDADCTPEVCNOVEDADCT = "Novedades CT";
    // Service (eliminarInterno)
    /** <code>eliminarInterno</code> service id. */
    public static final String SERV_ID_ELIMINARINTERNO = "Clas_1432994709504560Ser_8_Alias";
    /** <code>eliminarInterno</code> service name. */
    public static final String SERV_NAME_ELIMINARINTERNO = "eliminarInterno";
    /** <code>eliminarInterno</code> service alias. */
    public static final String SERV_ALIAS_ELIMINARINTERNO = "eliminarInterno";
    /** Agents allowed to execute the service eliminarInterno **/
    public static final String ELIMINARINTERNO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>firmaeliminarInternopthisFirma</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINARINTERNO_FIRMAELIMINARINTERNOPTHISFIRMA = "p_thisFirma";
    /** <code>firmaeliminarInternopthisFirma</code> inbound argument id. */
    public static final String ARG_ID_ELIMINARINTERNO_FIRMAELIMINARINTERNOPTHISFIRMA = "Clas_1432994709504560Ser_8Arg_1_Alias";
    /** <code>firmaeliminarInternopthisFirma</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINARINTERNO_FIRMAELIMINARINTERNOPTHISFIRMA = "Firma";
    // Service (InsFirmaSolNov)
    /** <code>InsFirmaSolNov</code> service id. */
    public static final String SERV_ID_INSFIRMASOLNOV = "Clas_1432994709504560Ser_9_Alias";
    /** <code>InsFirmaSolNov</code> service name. */
    public static final String SERV_NAME_INSFIRMASOLNOV = "InsFirmaSolNov";
    /** <code>InsFirmaSolNov</code> service alias. */
    public static final String SERV_ALIAS_INSFIRMASOLNOV = "InsFirmaSolNov";
    /** Agents allowed to execute the service InsFirmaSolNov **/
    public static final String INSFIRMASOLNOV_SRVAGENTS = "";
    // Inbound arguments
    /** <code>firmaInsFirmaSolNovpthisFirma</code> inbound argument name. */
    public static final String ARG_NAME_INSFIRMASOLNOV_FIRMAINSFIRMASOLNOVPTHISFIRMA = "p_thisFirma";
    /** <code>firmaInsFirmaSolNovpthisFirma</code> inbound argument id. */
    public static final String ARG_ID_INSFIRMASOLNOV_FIRMAINSFIRMASOLNOVPTHISFIRMA = "Clas_1432994709504560Ser_9Arg_1_Alias";
    /** <code>firmaInsFirmaSolNovpthisFirma</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSFIRMASOLNOV_FIRMAINSFIRMASOLNOVPTHISFIRMA = "Firma";
    /** <code>firmaInsFirmaSolNovpevcSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_INSFIRMASOLNOV_FIRMAINSFIRMASOLNOVPEVCSOLICITUDNOVEDAD = "p_evcSolicitudNovedad";
    /** <code>firmaInsFirmaSolNovpevcSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_INSFIRMASOLNOV_FIRMAINSFIRMASOLNOVPEVCSOLICITUDNOVEDAD = "Clas_1432994709504560Ser_9Arg_2_Alias";
    /** <code>firmaInsFirmaSolNovpevcSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSFIRMASOLNOV_FIRMAINSFIRMASOLNOVPEVCSOLICITUDNOVEDAD = "SolicitudNovedad";
    // Service (DelFirmaSolNov)
    /** <code>DelFirmaSolNov</code> service id. */
    public static final String SERV_ID_DELFIRMASOLNOV = "Clas_1432994709504560Ser_10_Alias";
    /** <code>DelFirmaSolNov</code> service name. */
    public static final String SERV_NAME_DELFIRMASOLNOV = "DelFirmaSolNov";
    /** <code>DelFirmaSolNov</code> service alias. */
    public static final String SERV_ALIAS_DELFIRMASOLNOV = "DelFirmaSolNov";
    /** Agents allowed to execute the service DelFirmaSolNov **/
    public static final String DELFIRMASOLNOV_SRVAGENTS = "";
    // Inbound arguments
    /** <code>firmaDelFirmaSolNovpthisFirma</code> inbound argument name. */
    public static final String ARG_NAME_DELFIRMASOLNOV_FIRMADELFIRMASOLNOVPTHISFIRMA = "p_thisFirma";
    /** <code>firmaDelFirmaSolNovpthisFirma</code> inbound argument id. */
    public static final String ARG_ID_DELFIRMASOLNOV_FIRMADELFIRMASOLNOVPTHISFIRMA = "Clas_1432994709504560Ser_10Arg_1_Alias";
    /** <code>firmaDelFirmaSolNovpthisFirma</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELFIRMASOLNOV_FIRMADELFIRMASOLNOVPTHISFIRMA = "Firma";
    /** <code>firmaDelFirmaSolNovpevcSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DELFIRMASOLNOV_FIRMADELFIRMASOLNOVPEVCSOLICITUDNOVEDAD = "p_evcSolicitudNovedad";
    /** <code>firmaDelFirmaSolNovpevcSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_DELFIRMASOLNOV_FIRMADELFIRMASOLNOVPEVCSOLICITUDNOVEDAD = "Clas_1432994709504560Ser_10Arg_2_Alias";
    /** <code>firmaDelFirmaSolNovpevcSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELFIRMASOLNOV_FIRMADELFIRMASOLNOVPEVCSOLICITUDNOVEDAD = "SolicitudNovedad";
    // Service (TCREARSOLNOV)
    /** <code>TCREARSOLNOV</code> service id. */
    public static final String SERV_ID_TCREARSOLNOV = "Clas_1432994709504560Ser_12_Alias";
    /** <code>TCREARSOLNOV</code> service name. */
    public static final String SERV_NAME_TCREARSOLNOV = "TCREARSOLNOV";
    /** <code>TCREARSOLNOV</code> service alias. */
    public static final String SERV_ALIAS_TCREARSOLNOV = "TCREARSOLNOV";
    /** Agents allowed to execute the service TCREARSOLNOV **/
    public static final String TCREARSOLNOV_SRVAGENTS = "";
    // Inbound arguments
    /** <code>firmaTCREARSOLNOVptpagrSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TCREARSOLNOV_FIRMATCREARSOLNOVPTPAGRSOLICITUDNOVEDAD = "pt_p_agrSolicitudNovedad";
    /** <code>firmaTCREARSOLNOVptpagrSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_TCREARSOLNOV_FIRMATCREARSOLNOVPTPAGRSOLICITUDNOVEDAD = "Clas_1432994709504560Ser_12Arg_9_Alias";
    /** <code>firmaTCREARSOLNOVptpagrSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARSOLNOV_FIRMATCREARSOLNOVPTPAGRSOLICITUDNOVEDAD = "SolicitudNovedad";
    /** <code>firmaTCREARSOLNOVptpatrImagenFirma</code> inbound argument name. */
    public static final String ARG_NAME_TCREARSOLNOV_FIRMATCREARSOLNOVPTPATRIMAGENFIRMA = "pt_p_atrImagenFirma";
    /** <code>firmaTCREARSOLNOVptpatrImagenFirma</code> inbound argument id. */
    public static final String ARG_ID_TCREARSOLNOV_FIRMATCREARSOLNOVPTPATRIMAGENFIRMA = "Clas_1432994709504560Ser_12Arg_10_Alias";
    /** <code>firmaTCREARSOLNOVptpatrImagenFirma</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARSOLNOV_FIRMATCREARSOLNOVPTPATRIMAGENFIRMA = "Firma";
    /** <code>firmaTCREARSOLNOVptpatrLatitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREARSOLNOV_FIRMATCREARSOLNOVPTPATRLATITUD = "pt_p_atrLatitud";
    /** <code>firmaTCREARSOLNOVptpatrLatitud</code> inbound argument id. */
    public static final String ARG_ID_TCREARSOLNOV_FIRMATCREARSOLNOVPTPATRLATITUD = "Clas_1432994709504560Ser_12Arg_11_Alias";
    /** <code>firmaTCREARSOLNOVptpatrLatitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARSOLNOV_FIRMATCREARSOLNOVPTPATRLATITUD = "Latitud";
    /** <code>firmaTCREARSOLNOVptpatrLongitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREARSOLNOV_FIRMATCREARSOLNOVPTPATRLONGITUD = "pt_p_atrLongitud";
    /** <code>firmaTCREARSOLNOVptpatrLongitud</code> inbound argument id. */
    public static final String ARG_ID_TCREARSOLNOV_FIRMATCREARSOLNOVPTPATRLONGITUD = "Clas_1432994709504560Ser_12Arg_12_Alias";
    /** <code>firmaTCREARSOLNOVptpatrLongitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARSOLNOV_FIRMATCREARSOLNOVPTPATRLONGITUD = "Longitud";
    // Service (TCREARTITFAMNOV)
    /** <code>TCREARTITFAMNOV</code> service id. */
    public static final String SERV_ID_TCREARTITFAMNOV = "Clas_1432994709504560Ser_13_Alias";
    /** <code>TCREARTITFAMNOV</code> service name. */
    public static final String SERV_NAME_TCREARTITFAMNOV = "TCREARTITFAMNOV";
    /** <code>TCREARTITFAMNOV</code> service alias. */
    public static final String SERV_ALIAS_TCREARTITFAMNOV = "TCREARTITFAMNOV";
    /** Agents allowed to execute the service TCREARTITFAMNOV **/
    public static final String TCREARTITFAMNOV_SRVAGENTS = "";
    // Inbound arguments
    /** <code>firmaTCREARTITFAMNOVptpatrImagenFirma</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITFAMNOV_FIRMATCREARTITFAMNOVPTPATRIMAGENFIRMA = "pt_p_atrImagenFirma";
    /** <code>firmaTCREARTITFAMNOVptpatrImagenFirma</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITFAMNOV_FIRMATCREARTITFAMNOVPTPATRIMAGENFIRMA = "Clas_1432994709504560Ser_13Arg_3_Alias";
    /** <code>firmaTCREARTITFAMNOVptpatrImagenFirma</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITFAMNOV_FIRMATCREARTITFAMNOVPTPATRIMAGENFIRMA = "Firma";
    /** <code>firmaTCREARTITFAMNOVptpatrLatitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITFAMNOV_FIRMATCREARTITFAMNOVPTPATRLATITUD = "pt_p_atrLatitud";
    /** <code>firmaTCREARTITFAMNOVptpatrLatitud</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITFAMNOV_FIRMATCREARTITFAMNOVPTPATRLATITUD = "Clas_1432994709504560Ser_13Arg_4_Alias";
    /** <code>firmaTCREARTITFAMNOVptpatrLatitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITFAMNOV_FIRMATCREARTITFAMNOVPTPATRLATITUD = "Latitud";
    /** <code>firmaTCREARTITFAMNOVptpatrLongitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITFAMNOV_FIRMATCREARTITFAMNOVPTPATRLONGITUD = "pt_p_atrLongitud";
    /** <code>firmaTCREARTITFAMNOVptpatrLongitud</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITFAMNOV_FIRMATCREARTITFAMNOVPTPATRLONGITUD = "Clas_1432994709504560Ser_13Arg_5_Alias";
    /** <code>firmaTCREARTITFAMNOVptpatrLongitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITFAMNOV_FIRMATCREARTITFAMNOVPTPATRLONGITUD = "Longitud";
    /** <code>firmaTCREARTITFAMNOVptFamiliaNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITFAMNOV_FIRMATCREARTITFAMNOVPTFAMILIANOVEDAD = "ptFamiliaNovedad";
    /** <code>firmaTCREARTITFAMNOVptFamiliaNovedad</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITFAMNOV_FIRMATCREARTITFAMNOVPTFAMILIANOVEDAD = "Clas_1432994709504560Ser_13Arg_6_Alias";
    /** <code>firmaTCREARTITFAMNOVptFamiliaNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITFAMNOV_FIRMATCREARTITFAMNOVPTFAMILIANOVEDAD = "Familia";
    // Service (TCREARNOVEDADCT)
    /** <code>TCREARNOVEDADCT</code> service id. */
    public static final String SERV_ID_TCREARNOVEDADCT = "Clas_1432994709504560Ser_14_Alias";
    /** <code>TCREARNOVEDADCT</code> service name. */
    public static final String SERV_NAME_TCREARNOVEDADCT = "TCREARNOVEDADCT";
    /** <code>TCREARNOVEDADCT</code> service alias. */
    public static final String SERV_ALIAS_TCREARNOVEDADCT = "TCREARNOVEDADCT";
    /** Agents allowed to execute the service TCREARNOVEDADCT **/
    public static final String TCREARNOVEDADCT_SRVAGENTS = "";
    // Inbound arguments
    /** <code>firmaTCREARNOVEDADCTptpatrImagenFirma</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNOVEDADCT_FIRMATCREARNOVEDADCTPTPATRIMAGENFIRMA = "pt_p_atrImagenFirma";
    /** <code>firmaTCREARNOVEDADCTptpatrImagenFirma</code> inbound argument id. */
    public static final String ARG_ID_TCREARNOVEDADCT_FIRMATCREARNOVEDADCTPTPATRIMAGENFIRMA = "Clas_1432994709504560Ser_14Arg_2_Alias";
    /** <code>firmaTCREARNOVEDADCTptpatrImagenFirma</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNOVEDADCT_FIRMATCREARNOVEDADCTPTPATRIMAGENFIRMA = "Firma";
    /** <code>firmaTCREARNOVEDADCTptpatrLatitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNOVEDADCT_FIRMATCREARNOVEDADCTPTPATRLATITUD = "pt_p_atrLatitud";
    /** <code>firmaTCREARNOVEDADCTptpatrLatitud</code> inbound argument id. */
    public static final String ARG_ID_TCREARNOVEDADCT_FIRMATCREARNOVEDADCTPTPATRLATITUD = "Clas_1432994709504560Ser_14Arg_3_Alias";
    /** <code>firmaTCREARNOVEDADCTptpatrLatitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNOVEDADCT_FIRMATCREARNOVEDADCTPTPATRLATITUD = "Latitud";
    /** <code>firmaTCREARNOVEDADCTptpatrLongitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNOVEDADCT_FIRMATCREARNOVEDADCTPTPATRLONGITUD = "pt_p_atrLongitud";
    /** <code>firmaTCREARNOVEDADCTptpatrLongitud</code> inbound argument id. */
    public static final String ARG_ID_TCREARNOVEDADCT_FIRMATCREARNOVEDADCTPTPATRLONGITUD = "Clas_1432994709504560Ser_14Arg_4_Alias";
    /** <code>firmaTCREARNOVEDADCTptpatrLongitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNOVEDADCT_FIRMATCREARNOVEDADCTPTPATRLONGITUD = "Longitud";
    /** <code>firmaTCREARNOVEDADCTptNovedadCT</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNOVEDADCT_FIRMATCREARNOVEDADCTPTNOVEDADCT = "ptNovedadCT";
    /** <code>firmaTCREARNOVEDADCTptNovedadCT</code> inbound argument id. */
    public static final String ARG_ID_TCREARNOVEDADCT_FIRMATCREARNOVEDADCTPTNOVEDADCT = "Clas_1432994709504560Ser_14Arg_6_Alias";
    /** <code>firmaTCREARNOVEDADCTptNovedadCT</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNOVEDADCT_FIRMATCREARNOVEDADCTPTNOVEDADCT = "Familia";

    public static final String FILTER_NAME_FFIRMASRESPONSABLES = "F_FirmasResponsables";
    public static final String VAR_NAME_FFIRMASRESPONSABLES_VUSUARIO = "v_Usuario";
    public static final String VAR_NAME_FFIRMASRESPONSABLES_VNOMBRE = "v_Nombre";
    public static final String VAR_NAME_FFIRMASRESPONSABLES_VOREGIONAL = "vo_Regional";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_FIRMAIMAGENFIRMA.toUpperCase(), Constants.Type.BLOB.getTypeName());
        attributeTypes.put(ATTR_NAME_FIRMALATITUD.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_FIRMALONGITUD.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_FIRMAIDENTIFICADOR.toUpperCase(), FIRMAIDENTIFICADOR_AGENTS);
    	attributeAgents.put(ATTR_NAME_FIRMAIMAGENFIRMA.toUpperCase(), FIRMAIMAGENFIRMA_AGENTS);
    	attributeAgents.put(ATTR_NAME_FIRMALATITUD.toUpperCase(), FIRMALATITUD_AGENTS);
    	attributeAgents.put(ATTR_NAME_FIRMALONGITUD.toUpperCase(), FIRMALONGITUD_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_SOLICITUDNOVEDAD.toUpperCase(), SOLICITUDNOVEDAD_AGENTS);
        roleAgents.put(ROLE_NAME_FAMILIANOVEDAD.toUpperCase(), FAMILIANOVEDAD_AGENTS);
        roleAgents.put(ROLE_NAME_NOVEDADESCT.toUpperCase(), NOVEDADESCT_AGENTS);
        roleAgents.put(ROLE_NAME_SOLICITUD.toUpperCase(), SOLICITUD_AGENTS);
        roleAgents.put(ROLE_NAME_SOLICITUDSEGUNDA.toUpperCase(), SOLICITUDSEGUNDA_AGENTS);
        roleAgents.put(ROLE_NAME_RESPREGIONAL.toUpperCase(), RESPREGIONAL_AGENTS);
        roleAgents.put(ROLE_NAME_SOLICITUDCONTRATANTE.toUpperCase(), SOLICITUDCONTRATANTE_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'Firma', it returns the identification keys
     * - If className is a facet of the inheritance net of 'Firma', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_FIRMAIDENTIFICADOR);
        }
        // Facet 'Firma' (This facet)
        if (FirmaConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_FIRMAIDENTIFICADOR);
        }
        return returnList;
    }
}
