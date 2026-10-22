package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>Novedad</code> model class.
 */
public final class NovedadConstants {

    private NovedadConstants() {

    }

    // Class
    /** <code>Novedad</code> class id. */
    public static final String CLASS_ID = "Clas_1581412253696713_Alias";
    /** <code>Novedad</code> class name. */
    public static final String CLASS_NAME = "Novedad";
    /** <code>Novedad</code> class alias. */
    public static final String CLASS_ALIAS = "Novedad";
    /** <code>Novedad</code> class table name. */
    public static final String TBL_NAME = "Novedad";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "novedadidNovedad,tipoNovedadTipo,novedadAliasNovedad,novedadNombre,novedadDescripcion,novedadCodigoLegal,novedadReqDocPersona,novedadReqDocSolicitud,novedadVariasFamilias,novedadMinValorMeses,novedadMaxValorMeses";

    public static final String DSICNOVEDAD = "IC_Novedad";
    public static final String DSDSNOVEDAD = "DS_Novedad";
    public static final String DSDSNOVEDADDMDDOMINIO = "DS_Novedad_D_MD_Dominio";
    public static final String DSDSNOVEDADNULL = "DS_Novedad_Null";
    

    // Attribute (novedadidNovedad)
    /** <code>novedadidNovedad</code> attribute id. */
    public static final String ATTR_ID_NOVEDADIDNOVEDAD = "Clas_1581412253696713Atr_1_Alias";
    /** <code>novedadidNovedad</code> attribute name. */
    public static final String ATTR_NAME_NOVEDADIDNOVEDAD = "novedadidNovedad";
    /** <code>novedadidNovedad</code> attribute alias. */
    public static final String ATTR_ALIAS_NOVEDADIDNOVEDAD = "id_Novedad";

    /** <code>novedadidNovedad</code> attribute facet sequence. */
    public static final String PATH_FACETS_NOVEDADIDNOVEDAD = "";
    /** Agents allowed to view the attribute novedadidNovedad **/
    public static final String NOVEDADIDNOVEDAD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (novedadAliasNovedad)
    /** <code>novedadAliasNovedad</code> attribute id. */
    public static final String ATTR_ID_NOVEDADALIASNOVEDAD = "Clas_1581412253696713Atr_2_Alias";
    /** <code>novedadAliasNovedad</code> attribute name. */
    public static final String ATTR_NAME_NOVEDADALIASNOVEDAD = "novedadAliasNovedad";
    /** <code>novedadAliasNovedad</code> attribute alias. */
    public static final String ATTR_ALIAS_NOVEDADALIASNOVEDAD = "Alias";

    /** <code>novedadAliasNovedad</code> attribute facet sequence. */
    public static final String PATH_FACETS_NOVEDADALIASNOVEDAD = "";
    /** Agents allowed to view the attribute novedadAliasNovedad **/
    public static final String NOVEDADALIASNOVEDAD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (novedadNombre)
    /** <code>novedadNombre</code> attribute id. */
    public static final String ATTR_ID_NOVEDADNOMBRE = "Clas_1581412253696713Atr_3_Alias";
    /** <code>novedadNombre</code> attribute name. */
    public static final String ATTR_NAME_NOVEDADNOMBRE = "novedadNombre";
    /** <code>novedadNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_NOVEDADNOMBRE = "Nombre";

    /** <code>novedadNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_NOVEDADNOMBRE = "";
    /** Agents allowed to view the attribute novedadNombre **/
    public static final String NOVEDADNOMBRE_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (novedadDescripcion)
    /** <code>novedadDescripcion</code> attribute id. */
    public static final String ATTR_ID_NOVEDADDESCRIPCION = "Clas_1581412253696713Atr_4_Alias";
    /** <code>novedadDescripcion</code> attribute name. */
    public static final String ATTR_NAME_NOVEDADDESCRIPCION = "novedadDescripcion";
    /** <code>novedadDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_NOVEDADDESCRIPCION = "Descripción";

    /** <code>novedadDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_NOVEDADDESCRIPCION = "";
    /** Agents allowed to view the attribute novedadDescripcion **/
    public static final String NOVEDADDESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (novedadCodigoLegal)
    /** <code>novedadCodigoLegal</code> attribute id. */
    public static final String ATTR_ID_NOVEDADCODIGOLEGAL = "Clas_1581412253696713Atr_5_Alias";
    /** <code>novedadCodigoLegal</code> attribute name. */
    public static final String ATTR_NAME_NOVEDADCODIGOLEGAL = "novedadCodigoLegal";
    /** <code>novedadCodigoLegal</code> attribute alias. */
    public static final String ATTR_ALIAS_NOVEDADCODIGOLEGAL = "Código Legal";

    /** <code>novedadCodigoLegal</code> attribute facet sequence. */
    public static final String PATH_FACETS_NOVEDADCODIGOLEGAL = "";
    /** Agents allowed to view the attribute novedadCodigoLegal **/
    public static final String NOVEDADCODIGOLEGAL_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (novedadReqDocPersona)
    /** <code>novedadReqDocPersona</code> attribute id. */
    public static final String ATTR_ID_NOVEDADREQDOCPERSONA = "Clas_1581412253696713Atr_6_Alias";
    /** <code>novedadReqDocPersona</code> attribute name. */
    public static final String ATTR_NAME_NOVEDADREQDOCPERSONA = "novedadReqDocPersona";
    /** <code>novedadReqDocPersona</code> attribute alias. */
    public static final String ATTR_ALIAS_NOVEDADREQDOCPERSONA = "Requiere doc. persona";

    /** <code>novedadReqDocPersona</code> attribute facet sequence. */
    public static final String PATH_FACETS_NOVEDADREQDOCPERSONA = "";
    /** Agents allowed to view the attribute novedadReqDocPersona **/
    public static final String NOVEDADREQDOCPERSONA_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (novedadReqDocSolicitud)
    /** <code>novedadReqDocSolicitud</code> attribute id. */
    public static final String ATTR_ID_NOVEDADREQDOCSOLICITUD = "Clas_1581412253696713Atr_7_Alias";
    /** <code>novedadReqDocSolicitud</code> attribute name. */
    public static final String ATTR_NAME_NOVEDADREQDOCSOLICITUD = "novedadReqDocSolicitud";
    /** <code>novedadReqDocSolicitud</code> attribute alias. */
    public static final String ATTR_ALIAS_NOVEDADREQDOCSOLICITUD = "Requiere doc. solicitud";

    /** <code>novedadReqDocSolicitud</code> attribute facet sequence. */
    public static final String PATH_FACETS_NOVEDADREQDOCSOLICITUD = "";
    /** Agents allowed to view the attribute novedadReqDocSolicitud **/
    public static final String NOVEDADREQDOCSOLICITUD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (novedadVariasFamilias)
    /** <code>novedadVariasFamilias</code> attribute id. */
    public static final String ATTR_ID_NOVEDADVARIASFAMILIAS = "Clas_1581412253696713Atr_8_Alias";
    /** <code>novedadVariasFamilias</code> attribute name. */
    public static final String ATTR_NAME_NOVEDADVARIASFAMILIAS = "novedadVariasFamilias";
    /** <code>novedadVariasFamilias</code> attribute alias. */
    public static final String ATTR_ALIAS_NOVEDADVARIASFAMILIAS = "Varias familias";

    /** <code>novedadVariasFamilias</code> attribute facet sequence. */
    public static final String PATH_FACETS_NOVEDADVARIASFAMILIAS = "";
    /** Agents allowed to view the attribute novedadVariasFamilias **/
    public static final String NOVEDADVARIASFAMILIAS_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (novedaddrvTieneCausales)
    /** <code>novedaddrvTieneCausales</code> attribute id. */
    public static final String ATTR_ID_NOVEDADDRVTIENECAUSALES = "Clas_1581412253696713Atr_10_Alias";
    /** <code>novedaddrvTieneCausales</code> attribute name. */
    public static final String ATTR_NAME_NOVEDADDRVTIENECAUSALES = "novedaddrvTieneCausales";
    /** <code>novedaddrvTieneCausales</code> attribute alias. */
    public static final String ATTR_ALIAS_NOVEDADDRVTIENECAUSALES = "Tiene Causales";

    /** <code>novedaddrvTieneCausales</code> attribute facet sequence. */
    public static final String PATH_FACETS_NOVEDADDRVTIENECAUSALES = "";
    /** Agents allowed to view the attribute novedaddrvTieneCausales **/
    public static final String NOVEDADDRVTIENECAUSALES_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (novedaddrvTieneCausasExcepcion)
    /** <code>novedaddrvTieneCausasExcepcion</code> attribute id. */
    public static final String ATTR_ID_NOVEDADDRVTIENECAUSASEXCEPCION = "Clas_1581412253696713Atr_11_Alias";
    /** <code>novedaddrvTieneCausasExcepcion</code> attribute name. */
    public static final String ATTR_NAME_NOVEDADDRVTIENECAUSASEXCEPCION = "novedaddrvTieneCausasExcepcion";
    /** <code>novedaddrvTieneCausasExcepcion</code> attribute alias. */
    public static final String ATTR_ALIAS_NOVEDADDRVTIENECAUSASEXCEPCION = "Tiene Causas Excepción";

    /** <code>novedaddrvTieneCausasExcepcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_NOVEDADDRVTIENECAUSASEXCEPCION = "";
    /** Agents allowed to view the attribute novedaddrvTieneCausasExcepcion **/
    public static final String NOVEDADDRVTIENECAUSASEXCEPCION_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (novedadMinValorMeses)
    /** <code>novedadMinValorMeses</code> attribute id. */
    public static final String ATTR_ID_NOVEDADMINVALORMESES = "Clas_1581412253696713Atr_12_Alias";
    /** <code>novedadMinValorMeses</code> attribute name. */
    public static final String ATTR_NAME_NOVEDADMINVALORMESES = "novedadMinValorMeses";
    /** <code>novedadMinValorMeses</code> attribute alias. */
    public static final String ATTR_ALIAS_NOVEDADMINVALORMESES = "Valor mínimo meses";

    /** <code>novedadMinValorMeses</code> attribute facet sequence. */
    public static final String PATH_FACETS_NOVEDADMINVALORMESES = "";
    /** Agents allowed to view the attribute novedadMinValorMeses **/
    public static final String NOVEDADMINVALORMESES_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (novedadMaxValorMeses)
    /** <code>novedadMaxValorMeses</code> attribute id. */
    public static final String ATTR_ID_NOVEDADMAXVALORMESES = "Clas_1581412253696713Atr_13_Alias";
    /** <code>novedadMaxValorMeses</code> attribute name. */
    public static final String ATTR_NAME_NOVEDADMAXVALORMESES = "novedadMaxValorMeses";
    /** <code>novedadMaxValorMeses</code> attribute alias. */
    public static final String ATTR_ALIAS_NOVEDADMAXVALORMESES = "Valor máximo meses";

    /** <code>novedadMaxValorMeses</code> attribute facet sequence. */
    public static final String PATH_FACETS_NOVEDADMAXVALORMESES = "";
    /** Agents allowed to view the attribute novedadMaxValorMeses **/
    public static final String NOVEDADMAXVALORMESES_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (novedadDrvTextoMostrar)
    /** <code>novedadDrvTextoMostrar</code> attribute id. */
    public static final String ATTR_ID_NOVEDADDRVTEXTOMOSTRAR = "Clas_1581412253696713Atr_14_Alias";
    /** <code>novedadDrvTextoMostrar</code> attribute name. */
    public static final String ATTR_NAME_NOVEDADDRVTEXTOMOSTRAR = "novedadDrvTextoMostrar";
    /** <code>novedadDrvTextoMostrar</code> attribute alias. */
    public static final String ATTR_ALIAS_NOVEDADDRVTEXTOMOSTRAR = "Descripción";

    /** <code>novedadDrvTextoMostrar</code> attribute facet sequence. */
    public static final String PATH_FACETS_NOVEDADDRVTEXTOMOSTRAR = "";
    /** Agents allowed to view the attribute novedadDrvTextoMostrar **/
    public static final String NOVEDADDRVTEXTOMOSTRAR_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (id_Novedad)
    /** <code>id_Novedad</code> field name. */
    public static final String FLD_NOVEDADIDNOVEDAD = "id_Novedad";    
    /** <code>novedadidNovedad</code> attribute field name. */
    public static final String ATTR_FIELD_NOVEDADIDNOVEDAD = "novedadidNovedad";
    // Field (Tipo)
    /** <code>Tipo</code> field name. */
    public static final String FLD_TIPONOVEDADTIPO = "Tipo";    
    /** <code>TipoNovedad.tipoNovedadTipo</code> attribute field name. */
    public static final String ATTR_FIELD_TIPONOVEDAD_TIPONOVEDADTIPO = "tipoNovedadTipo";
    // Field (AliasNovedad)
    /** <code>AliasNovedad</code> field name. */
    public static final String FLD_NOVEDADALIASNOVEDAD = "AliasNovedad";    
    /** <code>AliasNovedad</code> field length. */
    public static final int FLD_NOVEDADALIASNOVEDADLENGTH = 2;
    /** <code>novedadAliasNovedad</code> attribute field name. */
    public static final String ATTR_FIELD_NOVEDADALIASNOVEDAD = "novedadAliasNovedad";
    // Field (Nombre)
    /** <code>Nombre</code> field name. */
    public static final String FLD_NOVEDADNOMBRE = "Nombre";    
    /** <code>Nombre</code> field length. */
    public static final int FLD_NOVEDADNOMBRELENGTH = 50;
    /** <code>novedadNombre</code> attribute field name. */
    public static final String ATTR_FIELD_NOVEDADNOMBRE = "novedadNombre";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_NOVEDADDESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_NOVEDADDESCRIPCIONLENGTH = 200;
    /** <code>novedadDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_NOVEDADDESCRIPCION = "novedadDescripcion";
    // Field (CodigoLegal)
    /** <code>CodigoLegal</code> field name. */
    public static final String FLD_NOVEDADCODIGOLEGAL = "CodigoLegal";    
    /** <code>CodigoLegal</code> field length. */
    public static final int FLD_NOVEDADCODIGOLEGALLENGTH = 5;
    /** <code>novedadCodigoLegal</code> attribute field name. */
    public static final String ATTR_FIELD_NOVEDADCODIGOLEGAL = "novedadCodigoLegal";
    // Field (ReqDocPersona)
    /** <code>ReqDocPersona</code> field name. */
    public static final String FLD_NOVEDADREQDOCPERSONA = "ReqDocPersona";    
    /** <code>novedadReqDocPersona</code> attribute field name. */
    public static final String ATTR_FIELD_NOVEDADREQDOCPERSONA = "novedadReqDocPersona";
    // Field (ReqDocSolicitud)
    /** <code>ReqDocSolicitud</code> field name. */
    public static final String FLD_NOVEDADREQDOCSOLICITUD = "ReqDocSolicitud";    
    /** <code>novedadReqDocSolicitud</code> attribute field name. */
    public static final String ATTR_FIELD_NOVEDADREQDOCSOLICITUD = "novedadReqDocSolicitud";
    // Field (VariasFamilias)
    /** <code>VariasFamilias</code> field name. */
    public static final String FLD_NOVEDADVARIASFAMILIAS = "VariasFamilias";    
    /** <code>novedadVariasFamilias</code> attribute field name. */
    public static final String ATTR_FIELD_NOVEDADVARIASFAMILIAS = "novedadVariasFamilias";
    // Field (MinValorMeses)
    /** <code>MinValorMeses</code> field name. */
    public static final String FLD_NOVEDADMINVALORMESES = "MinValorMeses";    
    /** <code>novedadMinValorMeses</code> attribute field name. */
    public static final String ATTR_FIELD_NOVEDADMINVALORMESES = "novedadMinValorMeses";
    // Field (MaxValorMeses)
    /** <code>MaxValorMeses</code> field name. */
    public static final String FLD_NOVEDADMAXVALORMESES = "MaxValorMeses";    
    /** <code>novedadMaxValorMeses</code> attribute field name. */
    public static final String ATTR_FIELD_NOVEDADMAXVALORMESES = "novedadMaxValorMeses";

    // Component role (TipoNovedad)
    /** <code>TipoNovedad</code> role id. */
    public static final String ROLE_ID_TIPONOVEDAD = "Agr_1581412253696882_Alias";
    /** <code>TipoNovedad</code> role name. */
    public static final String ROLE_NAME_TIPONOVEDAD = "tipoNovedad";
    /** <code>TipoNovedad</code> role alias. */
    public static final String ROLE_ALIAS_TIPONOVEDAD = "Tipo";

    /** <code>TipoNovedad</code> inverse role name. */
    public static final String ROLE_INVNAME_TIPONOVEDAD = TipoNovedadConstants.ROLE_NAME_NOVEDADES;
    /** <code>TipoNovedad</code> role facet sequence. */
    public static final String PATH_FACETS_TIPONOVEDAD = "";
    /** <code>TipoNovedad</code> role target class. */
    public static final String ROLE_TARGET_TIPONOVEDAD = TipoNovedadConstants.CLASS_NAME;

    /** Agents allowed to navigate through TipoNovedad **/
    public static final String TIPONOVEDAD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";

    // Compound role (Dominios)
    /** <code>Dominios</code> role id. */
    public static final String ROLE_ID_DOMINIOS = "Agr_1581421690880763_Alias";
    /** <code>Dominios</code> role name. */
    public static final String ROLE_NAME_DOMINIOS = "dominios";
    /** <code>Novedades</code> role alias. */
    public static final String ROLE_ALIAS_DOMINIOS = "Dominios";


    /** <code>Dominios</code> inverse role name. */
    public static final String ROLE_INVNAME_DOMINIOS = DominioConstants.ROLE_NAME_NOVEDADES;
    /** <code>Dominios</code> role facet sequence. */
    public static final String PATH_FACETS_DOMINIOS = "";
    /** <code>Dominios</code> role target class. */
    public static final String ROLE_TARGET_DOMINIOS = DominioConstants.CLASS_NAME;
    /** Agents allowed to navigate through Dominios **/
    public static final String DOMINIOS_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (Causales)
    /** <code>Causales</code> role id. */
    public static final String ROLE_ID_CAUSALES = "Agr_1581414219776461_Alias";
    /** <code>Causales</code> role name. */
    public static final String ROLE_NAME_CAUSALES = "causales";
    /** <code>Novedad</code> role alias. */
    public static final String ROLE_ALIAS_CAUSALES = "Causales";


    /** <code>Causales</code> inverse role name. */
    public static final String ROLE_INVNAME_CAUSALES = CausalConstants.ROLE_NAME_NOVEDAD;
    /** <code>Causales</code> role facet sequence. */
    public static final String PATH_FACETS_CAUSALES = "";
    /** <code>Causales</code> role target class. */
    public static final String ROLE_TARGET_CAUSALES = CausalConstants.CLASS_NAME;
    /** Agents allowed to navigate through Causales **/
    public static final String CAUSALES_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (Solicitudes)
    /** <code>Solicitudes</code> role id. */
    public static final String ROLE_ID_SOLICITUDES = "Agr_1581421953024331_Alias";
    /** <code>Solicitudes</code> role name. */
    public static final String ROLE_NAME_SOLICITUDES = "solicitudes";
    /** <code>Novedad</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUDES = "Solicitudes";


    /** <code>Solicitudes</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUDES = SolicitudNovedadConstants.ROLE_NAME_NOVEDAD;
    /** <code>Solicitudes</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUDES = "";
    /** <code>Solicitudes</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUDES = SolicitudNovedadConstants.CLASS_NAME;
    /** Agents allowed to navigate through Solicitudes **/
    public static final String SOLICITUDES_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (CausasExclusion)
    /** <code>CausasExclusion</code> role id. */
    public static final String ROLE_ID_CAUSASEXCLUSION = "Agr_1581522485248155_Alias";
    /** <code>CausasExclusion</code> role name. */
    public static final String ROLE_NAME_CAUSASEXCLUSION = "causasExclusion";
    /** <code>Novedad</code> role alias. */
    public static final String ROLE_ALIAS_CAUSASEXCLUSION = "Causas de Exclusión";


    /** <code>CausasExclusion</code> inverse role name. */
    public static final String ROLE_INVNAME_CAUSASEXCLUSION = CausaExclusionConstants.ROLE_NAME_NOVEDAD;
    /** <code>CausasExclusion</code> role facet sequence. */
    public static final String PATH_FACETS_CAUSASEXCLUSION = "";
    /** <code>CausasExclusion</code> role target class. */
    public static final String ROLE_TARGET_CAUSASEXCLUSION = CausaExclusionConstants.CLASS_NAME;
    /** Agents allowed to navigate through CausasExclusion **/
    public static final String CAUSASEXCLUSION_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (ConfiguracionesANS)
    /** <code>ConfiguracionesANS</code> role id. */
    public static final String ROLE_ID_CONFIGURACIONESANS = "Agr_1586860261376351_Alias";
    /** <code>ConfiguracionesANS</code> role name. */
    public static final String ROLE_NAME_CONFIGURACIONESANS = "configuracionesANS";
    /** <code>Novedad</code> role alias. */
    public static final String ROLE_ALIAS_CONFIGURACIONESANS = "Configuraciones ANS";


    /** <code>ConfiguracionesANS</code> inverse role name. */
    public static final String ROLE_INVNAME_CONFIGURACIONESANS = ConfiguracionANSConstants.ROLE_NAME_NOVEDAD;
    /** <code>ConfiguracionesANS</code> role facet sequence. */
    public static final String PATH_FACETS_CONFIGURACIONESANS = "";
    /** <code>ConfiguracionesANS</code> role target class. */
    public static final String ROLE_TARGET_CONFIGURACIONESANS = ConfiguracionANSConstants.CLASS_NAME;
    /** Agents allowed to navigate through ConfiguracionesANS **/
    public static final String CONFIGURACIONESANS_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1581412253696713Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Preconditions
    /** <code>crear</code> precondition 0 id. */
    public static final String PRE_ID_CREAR_0 = "Clas_1581412253696713Pre_1_MsgError";
    // Inbound arguments
    /** <code>novedadcrearpagrTipoNovedad</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_NOVEDADCREARPAGRTIPONOVEDAD = "p_agrTipoNovedad";
    /** <code>novedadcrearpagrTipoNovedad</code> inbound argument id. */
    public static final String ARG_ID_CREAR_NOVEDADCREARPAGRTIPONOVEDAD = "Clas_1581412253696713Ser_1Arg_2_Alias";
    /** <code>novedadcrearpagrTipoNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_NOVEDADCREARPAGRTIPONOVEDAD = "Tipo";
    /** <code>novedadcrearpatrAliasNovedad</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_NOVEDADCREARPATRALIASNOVEDAD = "p_atrAliasNovedad";
    /** <code>novedadcrearpatrAliasNovedad</code> inbound argument id. */
    public static final String ARG_ID_CREAR_NOVEDADCREARPATRALIASNOVEDAD = "Clas_1581412253696713Ser_1Arg_3_Alias";
    /** <code>novedadcrearpatrAliasNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_NOVEDADCREARPATRALIASNOVEDAD = "Alias";
    /** <code>novedadcrearpatrNombre</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_NOVEDADCREARPATRNOMBRE = "p_atrNombre";
    /** <code>novedadcrearpatrNombre</code> inbound argument id. */
    public static final String ARG_ID_CREAR_NOVEDADCREARPATRNOMBRE = "Clas_1581412253696713Ser_1Arg_4_Alias";
    /** <code>novedadcrearpatrNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_NOVEDADCREARPATRNOMBRE = "Nombre";
    /** <code>novedadcrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_NOVEDADCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>novedadcrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_NOVEDADCREARPATRDESCRIPCION = "Clas_1581412253696713Ser_1Arg_5_Alias";
    /** <code>novedadcrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_NOVEDADCREARPATRDESCRIPCION = "Descripción";
    /** <code>novedadcrearpatrCodigoLegal</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_NOVEDADCREARPATRCODIGOLEGAL = "p_atrCodigoLegal";
    /** <code>novedadcrearpatrCodigoLegal</code> inbound argument id. */
    public static final String ARG_ID_CREAR_NOVEDADCREARPATRCODIGOLEGAL = "Clas_1581412253696713Ser_1Arg_6_Alias";
    /** <code>novedadcrearpatrCodigoLegal</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_NOVEDADCREARPATRCODIGOLEGAL = "Código Legal";
    /** <code>novedadcrearpatrReqDocPersona</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_NOVEDADCREARPATRREQDOCPERSONA = "p_atrReqDocPersona";
    /** <code>novedadcrearpatrReqDocPersona</code> inbound argument id. */
    public static final String ARG_ID_CREAR_NOVEDADCREARPATRREQDOCPERSONA = "Clas_1581412253696713Ser_1Arg_7_Alias";
    /** <code>novedadcrearpatrReqDocPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_NOVEDADCREARPATRREQDOCPERSONA = "Requiere doc. persona";
    /** <code>novedadcrearpatrReqDocSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_NOVEDADCREARPATRREQDOCSOLICITUD = "p_atrReqDocSolicitud";
    /** <code>novedadcrearpatrReqDocSolicitud</code> inbound argument id. */
    public static final String ARG_ID_CREAR_NOVEDADCREARPATRREQDOCSOLICITUD = "Clas_1581412253696713Ser_1Arg_8_Alias";
    /** <code>novedadcrearpatrReqDocSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_NOVEDADCREARPATRREQDOCSOLICITUD = "Requiere doc. solicitud";
    /** <code>novedadcrearpatrVariasFamilias</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_NOVEDADCREARPATRVARIASFAMILIAS = "p_atrVariasFamilias";
    /** <code>novedadcrearpatrVariasFamilias</code> inbound argument id. */
    public static final String ARG_ID_CREAR_NOVEDADCREARPATRVARIASFAMILIAS = "Clas_1581412253696713Ser_1Arg_9_Alias";
    /** <code>novedadcrearpatrVariasFamilias</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_NOVEDADCREARPATRVARIASFAMILIAS = "Varias familias";
    /** <code>novedadcrearpatrMinValorMeses</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_NOVEDADCREARPATRMINVALORMESES = "p_atrMinValorMeses";
    /** <code>novedadcrearpatrMinValorMeses</code> inbound argument id. */
    public static final String ARG_ID_CREAR_NOVEDADCREARPATRMINVALORMESES = "Clas_1581412253696713Ser_1Arg_11_Alias";
    /** <code>novedadcrearpatrMinValorMeses</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_NOVEDADCREARPATRMINVALORMESES = "Valor mínimo meses";
    /** <code>novedadcrearpatrMaxValorMeses</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_NOVEDADCREARPATRMAXVALORMESES = "p_atrMaxValorMeses";
    /** <code>novedadcrearpatrMaxValorMeses</code> inbound argument id. */
    public static final String ARG_ID_CREAR_NOVEDADCREARPATRMAXVALORMESES = "Clas_1581412253696713Ser_1Arg_12_Alias";
    /** <code>novedadcrearpatrMaxValorMeses</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_NOVEDADCREARPATRMAXVALORMESES = "Valor máximo meses";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1581412253696713Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>novedadeliminarpthisNovedad</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_NOVEDADELIMINARPTHISNOVEDAD = "p_thisNovedad";
    /** <code>novedadeliminarpthisNovedad</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_NOVEDADELIMINARPTHISNOVEDAD = "Clas_1581412253696713Ser_2Arg_1_Alias";
    /** <code>novedadeliminarpthisNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_NOVEDADELIMINARPTHISNOVEDAD = "Novedad";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1581412253696713Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin,Asesor";
    // Preconditions
    /** <code>modificar</code> precondition 0 id. */
    public static final String PRE_ID_MODIFICAR_0 = "Clas_1581412253696713Pre_2_MsgError";
    /** <code>modificar</code> precondition 1 id. */
    public static final String PRE_ID_MODIFICAR_1 = "Clas_1581412253696713Pre_7_MsgError";
    /** <code>modificar</code> precondition 2 id. */
    public static final String PRE_ID_MODIFICAR_2 = "Clas_1581412253696713Pre_8_MsgError";
    // Inbound arguments
    /** <code>novedadmodificarpthisNovedad</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_NOVEDADMODIFICARPTHISNOVEDAD = "p_thisNovedad";
    /** <code>novedadmodificarpthisNovedad</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_NOVEDADMODIFICARPTHISNOVEDAD = "Clas_1581412253696713Ser_3Arg_1_Alias";
    /** <code>novedadmodificarpthisNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_NOVEDADMODIFICARPTHISNOVEDAD = "Novedad";
    /** <code>novedadmodificarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_NOVEDADMODIFICARPDESCRIPCION = "p_Descripcion";
    /** <code>novedadmodificarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_NOVEDADMODIFICARPDESCRIPCION = "Clas_1581412253696713Ser_3Arg_3_Alias";
    /** <code>novedadmodificarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_NOVEDADMODIFICARPDESCRIPCION = "Descripción";
    /** <code>novedadmodificarpCodigoLegal</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_NOVEDADMODIFICARPCODIGOLEGAL = "p_CodigoLegal";
    /** <code>novedadmodificarpCodigoLegal</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_NOVEDADMODIFICARPCODIGOLEGAL = "Clas_1581412253696713Ser_3Arg_4_Alias";
    /** <code>novedadmodificarpCodigoLegal</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_NOVEDADMODIFICARPCODIGOLEGAL = "Código Legal";
    /** <code>novedadmodificarpReqDocPersona</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_NOVEDADMODIFICARPREQDOCPERSONA = "p_ReqDocPersona";
    /** <code>novedadmodificarpReqDocPersona</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_NOVEDADMODIFICARPREQDOCPERSONA = "Clas_1581412253696713Ser_3Arg_5_Alias";
    /** <code>novedadmodificarpReqDocPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_NOVEDADMODIFICARPREQDOCPERSONA = "Requiere doc. persona";
    /** <code>novedadmodificarpReqDocSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_NOVEDADMODIFICARPREQDOCSOLICITUD = "p_ReqDocSolicitud";
    /** <code>novedadmodificarpReqDocSolicitud</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_NOVEDADMODIFICARPREQDOCSOLICITUD = "Clas_1581412253696713Ser_3Arg_6_Alias";
    /** <code>novedadmodificarpReqDocSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_NOVEDADMODIFICARPREQDOCSOLICITUD = "Requiere doc. solicitud";
    /** <code>novedadmodificarpVariasFamilias</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_NOVEDADMODIFICARPVARIASFAMILIAS = "p_VariasFamilias";
    /** <code>novedadmodificarpVariasFamilias</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_NOVEDADMODIFICARPVARIASFAMILIAS = "Clas_1581412253696713Ser_3Arg_7_Alias";
    /** <code>novedadmodificarpVariasFamilias</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_NOVEDADMODIFICARPVARIASFAMILIAS = "Varias familias";
    /** <code>novedadmodificarpNombre</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_NOVEDADMODIFICARPNOMBRE = "p_Nombre";
    /** <code>novedadmodificarpNombre</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_NOVEDADMODIFICARPNOMBRE = "Clas_1581412253696713Ser_3Arg_8_Alias";
    /** <code>novedadmodificarpNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_NOVEDADMODIFICARPNOMBRE = "Nombre";
    /** <code>novedadmodificarpMinValorMeses</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_NOVEDADMODIFICARPMINVALORMESES = "p_MinValorMeses";
    /** <code>novedadmodificarpMinValorMeses</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_NOVEDADMODIFICARPMINVALORMESES = "Clas_1581412253696713Ser_3Arg_9_Alias";
    /** <code>novedadmodificarpMinValorMeses</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_NOVEDADMODIFICARPMINVALORMESES = "Valor mínimo meses";
    /** <code>novedadmodificarpMaxValorMeses</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_NOVEDADMODIFICARPMAXVALORMESES = "p_MaxValorMeses";
    /** <code>novedadmodificarpMaxValorMeses</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_NOVEDADMODIFICARPMAXVALORMESES = "Clas_1581412253696713Ser_3Arg_10_Alias";
    /** <code>novedadmodificarpMaxValorMeses</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_NOVEDADMODIFICARPMAXVALORMESES = "Valor máximo meses";
    // Service (InsNovedad)
    /** <code>InsNovedad</code> service id. */
    public static final String SERV_ID_INSNOVEDAD = "Clas_1581412253696713Ser_5_Alias";
    /** <code>InsNovedad</code> service name. */
    public static final String SERV_NAME_INSNOVEDAD = "InsNovedad";
    /** <code>InsNovedad</code> service alias. */
    public static final String SERV_ALIAS_INSNOVEDAD = "InsNovedad";
    /** Agents allowed to execute the service InsNovedad **/
    public static final String INSNOVEDAD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>novedadInsNovedadpthisNovedad</code> inbound argument name. */
    public static final String ARG_NAME_INSNOVEDAD_NOVEDADINSNOVEDADPTHISNOVEDAD = "p_thisNovedad";
    /** <code>novedadInsNovedadpthisNovedad</code> inbound argument id. */
    public static final String ARG_ID_INSNOVEDAD_NOVEDADINSNOVEDADPTHISNOVEDAD = "Clas_1581412253696713Ser_5Arg_1_Alias";
    /** <code>novedadInsNovedadpthisNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSNOVEDAD_NOVEDADINSNOVEDADPTHISNOVEDAD = "Novedades";
    /** <code>novedadInsNovedadpevcDominio</code> inbound argument name. */
    public static final String ARG_NAME_INSNOVEDAD_NOVEDADINSNOVEDADPEVCDOMINIO = "p_evcDominio";
    /** <code>novedadInsNovedadpevcDominio</code> inbound argument id. */
    public static final String ARG_ID_INSNOVEDAD_NOVEDADINSNOVEDADPEVCDOMINIO = "Clas_1581412253696713Ser_5Arg_2_Alias";
    /** <code>novedadInsNovedadpevcDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSNOVEDAD_NOVEDADINSNOVEDADPEVCDOMINIO = "Dominios";
    // Service (DelNovedad)
    /** <code>DelNovedad</code> service id. */
    public static final String SERV_ID_DELNOVEDAD = "Clas_1581412253696713Ser_6_Alias";
    /** <code>DelNovedad</code> service name. */
    public static final String SERV_NAME_DELNOVEDAD = "DelNovedad";
    /** <code>DelNovedad</code> service alias. */
    public static final String SERV_ALIAS_DELNOVEDAD = "Quitar Novedad";
    /** Agents allowed to execute the service DelNovedad **/
    public static final String DELNOVEDAD_SRVAGENTS = "Admin,SuperAdmin,Asesor";
    // Inbound arguments
    /** <code>novedadDelNovedadpthisNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DELNOVEDAD_NOVEDADDELNOVEDADPTHISNOVEDAD = "p_thisNovedad";
    /** <code>novedadDelNovedadpthisNovedad</code> inbound argument id. */
    public static final String ARG_ID_DELNOVEDAD_NOVEDADDELNOVEDADPTHISNOVEDAD = "Clas_1581412253696713Ser_6Arg_1_Alias";
    /** <code>novedadDelNovedadpthisNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELNOVEDAD_NOVEDADDELNOVEDADPTHISNOVEDAD = "Novedad";
    /** <code>novedadDelNovedadpevcDominio</code> inbound argument name. */
    public static final String ARG_NAME_DELNOVEDAD_NOVEDADDELNOVEDADPEVCDOMINIO = "p_evcDominio";
    /** <code>novedadDelNovedadpevcDominio</code> inbound argument id. */
    public static final String ARG_ID_DELNOVEDAD_NOVEDADDELNOVEDADPEVCDOMINIO = "Clas_1581412253696713Ser_6Arg_2_Alias";
    /** <code>novedadDelNovedadpevcDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELNOVEDAD_NOVEDADDELNOVEDADPEVCDOMINIO = "Dominio";
    // Service (TELIMINAR)
    /** <code>TELIMINAR</code> service id. */
    public static final String SERV_ID_TELIMINAR = "Clas_1581412253696713Ser_4_Alias";
    /** <code>TELIMINAR</code> service name. */
    public static final String SERV_NAME_TELIMINAR = "TELIMINAR";
    /** <code>TELIMINAR</code> service alias. */
    public static final String SERV_ALIAS_TELIMINAR = "Eliminar";
    /** Agents allowed to execute the service TELIMINAR **/
    public static final String TELIMINAR_SRVAGENTS = "Admin,SuperAdmin,Asesor";
    // Inbound arguments
    /** <code>novedadTELIMINARpthisNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TELIMINAR_NOVEDADTELIMINARPTHISNOVEDAD = "p_thisNovedad";
    /** <code>novedadTELIMINARpthisNovedad</code> inbound argument id. */
    public static final String ARG_ID_TELIMINAR_NOVEDADTELIMINARPTHISNOVEDAD = "Clas_1581412253696713Ser_4Arg_1_Alias";
    /** <code>novedadTELIMINARpthisNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TELIMINAR_NOVEDADTELIMINARPTHISNOVEDAD = "Novedad";
    // Service (TCREAR)
    /** <code>TCREAR</code> service id. */
    public static final String SERV_ID_TCREAR = "Clas_1581412253696713Ser_7_Alias";
    /** <code>TCREAR</code> service name. */
    public static final String SERV_NAME_TCREAR = "TCREAR";
    /** <code>TCREAR</code> service alias. */
    public static final String SERV_ALIAS_TCREAR = "Crear";
    /** Agents allowed to execute the service TCREAR **/
    public static final String TCREAR_SRVAGENTS = "Admin,SuperAdmin,Asesor";
    // Preconditions
    /** <code>TCREAR</code> precondition 0 id. */
    public static final String PRE_ID_TCREAR_0 = "Clas_1581412253696713Pre_3_MsgError";
    /** <code>TCREAR</code> precondition 1 id. */
    public static final String PRE_ID_TCREAR_1 = "Clas_1581412253696713Pre_4_MsgError";
    /** <code>TCREAR</code> precondition 2 id. */
    public static final String PRE_ID_TCREAR_2 = "Clas_1581412253696713Pre_5_MsgError";
    /** <code>TCREAR</code> precondition 3 id. */
    public static final String PRE_ID_TCREAR_3 = "Clas_1581412253696713Pre_6_MsgError";
    // Inbound arguments
    /** <code>novedadTCREARptpagrTipoNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_NOVEDADTCREARPTPAGRTIPONOVEDAD = "pt_p_agrTipoNovedad";
    /** <code>novedadTCREARptpagrTipoNovedad</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_NOVEDADTCREARPTPAGRTIPONOVEDAD = "Clas_1581412253696713Ser_7Arg_3_Alias";
    /** <code>novedadTCREARptpagrTipoNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_NOVEDADTCREARPTPAGRTIPONOVEDAD = "Tipo";
    /** <code>novedadTCREARptpatrNombre</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_NOVEDADTCREARPTPATRNOMBRE = "pt_p_atrNombre";
    /** <code>novedadTCREARptpatrNombre</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_NOVEDADTCREARPTPATRNOMBRE = "Clas_1581412253696713Ser_7Arg_5_Alias";
    /** <code>novedadTCREARptpatrNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_NOVEDADTCREARPTPATRNOMBRE = "Nombre";
    /** <code>novedadTCREARptpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_NOVEDADTCREARPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    /** <code>novedadTCREARptpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_NOVEDADTCREARPTPATRDESCRIPCION = "Clas_1581412253696713Ser_7Arg_6_Alias";
    /** <code>novedadTCREARptpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_NOVEDADTCREARPTPATRDESCRIPCION = "Descripción";
    /** <code>novedadTCREARptpatrCodigoLegal</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_NOVEDADTCREARPTPATRCODIGOLEGAL = "pt_p_atrCodigoLegal";
    /** <code>novedadTCREARptpatrCodigoLegal</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_NOVEDADTCREARPTPATRCODIGOLEGAL = "Clas_1581412253696713Ser_7Arg_7_Alias";
    /** <code>novedadTCREARptpatrCodigoLegal</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_NOVEDADTCREARPTPATRCODIGOLEGAL = "Código Legal";
    /** <code>novedadTCREARptpatrReqDocPersona</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_NOVEDADTCREARPTPATRREQDOCPERSONA = "pt_p_atrReqDocPersona";
    /** <code>novedadTCREARptpatrReqDocPersona</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_NOVEDADTCREARPTPATRREQDOCPERSONA = "Clas_1581412253696713Ser_7Arg_8_Alias";
    /** <code>novedadTCREARptpatrReqDocPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_NOVEDADTCREARPTPATRREQDOCPERSONA = "Requiere doc. persona";
    /** <code>novedadTCREARptpatrReqDocSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_NOVEDADTCREARPTPATRREQDOCSOLICITUD = "pt_p_atrReqDocSolicitud";
    /** <code>novedadTCREARptpatrReqDocSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_NOVEDADTCREARPTPATRREQDOCSOLICITUD = "Clas_1581412253696713Ser_7Arg_9_Alias";
    /** <code>novedadTCREARptpatrReqDocSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_NOVEDADTCREARPTPATRREQDOCSOLICITUD = "Requiere doc. solicitud";
    /** <code>novedadTCREARptpatrVariasFamilias</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_NOVEDADTCREARPTPATRVARIASFAMILIAS = "pt_p_atrVariasFamilias";
    /** <code>novedadTCREARptpatrVariasFamilias</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_NOVEDADTCREARPTPATRVARIASFAMILIAS = "Clas_1581412253696713Ser_7Arg_10_Alias";
    /** <code>novedadTCREARptpatrVariasFamilias</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_NOVEDADTCREARPTPATRVARIASFAMILIAS = "Varias familias";
    /** <code>novedadTCREARptAliasParaContrato</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_NOVEDADTCREARPTALIASPARACONTRATO = "ptAliasParaContrato";
    /** <code>novedadTCREARptAliasParaContrato</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_NOVEDADTCREARPTALIASPARACONTRATO = "Clas_1581412253696713Ser_7Arg_11_Alias";
    /** <code>novedadTCREARptAliasParaContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_NOVEDADTCREARPTALIASPARACONTRATO = "Alias";
    /** <code>novedadTCREARptAliasParaTitular</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_NOVEDADTCREARPTALIASPARATITULAR = "ptAliasParaTitular";
    /** <code>novedadTCREARptAliasParaTitular</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_NOVEDADTCREARPTALIASPARATITULAR = "Clas_1581412253696713Ser_7Arg_14_Alias";
    /** <code>novedadTCREARptAliasParaTitular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_NOVEDADTCREARPTALIASPARATITULAR = "Alias";
    /** <code>novedadTCREARptAliasParaUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_NOVEDADTCREARPTALIASPARAUSUARIO = "ptAliasParaUsuario";
    /** <code>novedadTCREARptAliasParaUsuario</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_NOVEDADTCREARPTALIASPARAUSUARIO = "Clas_1581412253696713Ser_7Arg_15_Alias";
    /** <code>novedadTCREARptAliasParaUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_NOVEDADTCREARPTALIASPARAUSUARIO = "Alias";
    /** <code>novedadTCREARptpatrMinValorMeses</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_NOVEDADTCREARPTPATRMINVALORMESES = "pt_p_atrMinValorMeses";
    /** <code>novedadTCREARptpatrMinValorMeses</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_NOVEDADTCREARPTPATRMINVALORMESES = "Clas_1581412253696713Ser_7Arg_111_Alias";
    /** <code>novedadTCREARptpatrMinValorMeses</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_NOVEDADTCREARPTPATRMINVALORMESES = "Valor mínimo meses";
    /** <code>novedadTCREARptpatrMaxValorMeses</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_NOVEDADTCREARPTPATRMAXVALORMESES = "pt_p_atrMaxValorMeses";
    /** <code>novedadTCREARptpatrMaxValorMeses</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_NOVEDADTCREARPTPATRMAXVALORMESES = "Clas_1581412253696713Ser_7Arg_112_Alias";
    /** <code>novedadTCREARptpatrMaxValorMeses</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_NOVEDADTCREARPTPATRMAXVALORMESES = "Valor máximo meses";
    /** <code>novedadTCREARptAlias</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_NOVEDADTCREARPTALIAS = "ptAlias";
    /** <code>novedadTCREARptAlias</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_NOVEDADTCREARPTALIAS = "Clas_1581412253696713Ser_7Arg_735_Alias";
    /** <code>novedadTCREARptAlias</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_NOVEDADTCREARPTALIAS = "Valor del Alias";

    public static final String FILTER_NAME_FNOVEDAD = "F_Novedad";
    public static final String VAR_NAME_FNOVEDAD_VFTIPO = "vfTipo";
    public static final String VAR_NAME_FNOVEDAD_VFNOMBRE = "vfNombre";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_NOVEDADALIASNOVEDAD.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_NOVEDADNOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_NOVEDADDESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_NOVEDADCODIGOLEGAL.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_NOVEDADREQDOCPERSONA.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_NOVEDADREQDOCSOLICITUD.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_NOVEDADVARIASFAMILIAS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_NOVEDADDRVTIENECAUSALES.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_NOVEDADDRVTIENECAUSASEXCEPCION.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_NOVEDADMINVALORMESES.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_NOVEDADMAXVALORMESES.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_NOVEDADDRVTEXTOMOSTRAR.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_NOVEDADIDNOVEDAD.toUpperCase(), NOVEDADIDNOVEDAD_AGENTS);
    	attributeAgents.put(ATTR_NAME_NOVEDADALIASNOVEDAD.toUpperCase(), NOVEDADALIASNOVEDAD_AGENTS);
    	attributeAgents.put(ATTR_NAME_NOVEDADNOMBRE.toUpperCase(), NOVEDADNOMBRE_AGENTS);
    	attributeAgents.put(ATTR_NAME_NOVEDADDESCRIPCION.toUpperCase(), NOVEDADDESCRIPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_NOVEDADCODIGOLEGAL.toUpperCase(), NOVEDADCODIGOLEGAL_AGENTS);
    	attributeAgents.put(ATTR_NAME_NOVEDADREQDOCPERSONA.toUpperCase(), NOVEDADREQDOCPERSONA_AGENTS);
    	attributeAgents.put(ATTR_NAME_NOVEDADREQDOCSOLICITUD.toUpperCase(), NOVEDADREQDOCSOLICITUD_AGENTS);
    	attributeAgents.put(ATTR_NAME_NOVEDADVARIASFAMILIAS.toUpperCase(), NOVEDADVARIASFAMILIAS_AGENTS);
    	attributeAgents.put(ATTR_NAME_NOVEDADDRVTIENECAUSALES.toUpperCase(), NOVEDADDRVTIENECAUSALES_AGENTS);
    	attributeAgents.put(ATTR_NAME_NOVEDADDRVTIENECAUSASEXCEPCION.toUpperCase(), NOVEDADDRVTIENECAUSASEXCEPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_NOVEDADMINVALORMESES.toUpperCase(), NOVEDADMINVALORMESES_AGENTS);
    	attributeAgents.put(ATTR_NAME_NOVEDADMAXVALORMESES.toUpperCase(), NOVEDADMAXVALORMESES_AGENTS);
    	attributeAgents.put(ATTR_NAME_NOVEDADDRVTEXTOMOSTRAR.toUpperCase(), NOVEDADDRVTEXTOMOSTRAR_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_TIPONOVEDAD.toUpperCase(), TIPONOVEDAD_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'Novedad', it returns the identification keys
     * - If className is a facet of the inheritance net of 'Novedad', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_NOVEDADIDNOVEDAD);
        }
        // Facet 'Novedad' (This facet)
        if (NovedadConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_NOVEDADIDNOVEDAD);
        }
        return returnList;
    }
}
