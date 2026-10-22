package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>ConfiguracionANS</code> model class.
 */
public final class ConfiguracionANSConstants {

    private ConfiguracionANSConstants() {

    }

    // Class
    /** <code>ConfiguracionANS</code> class id. */
    public static final String CLASS_ID = "Clas_1586859868160432_Alias";
    /** <code>ConfiguracionANS</code> class name. */
    public static final String CLASS_NAME = "ConfiguracionANS";
    /** <code>ConfiguracionANS</code> class alias. */
    public static final String CLASS_ALIAS = "Acuerdo nivel de servicio";
    /** <code>ConfiguracionANS</code> class table name. */
    public static final String TBL_NAME = "ConfiguracionANS";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "configuracionANSId,dominioNumero,novedadidNovedad,causalidCausal,configuracionANSTramite,configuracionANSANSAfiliaciones,configuracionANSANSAreaMedica,configuracionANSHabilLunes,configuracionANSHabilMartes,configuracionANSHabilMiercoles,configuracionANSHabilJueves,configuracionANSHabilViernes,configuracionANSHabilSabado,configuracionANSHabilDomingo";

    public static final String DSDSCONFIGURACIONANS = "DS_ConfiguracionANS";
    public static final String DSDSCONFIGURACIONANSDETALLE = "DS_ConfiguracionANS_Detalle";
    

    // Attribute (configuracionANSId)
    /** <code>configuracionANSId</code> attribute id. */
    public static final String ATTR_ID_CONFIGURACIONANSID = "Clas_1586859868160432Atr_1_Alias";
    /** <code>configuracionANSId</code> attribute name. */
    public static final String ATTR_NAME_CONFIGURACIONANSID = "configuracionANSId";
    /** <code>configuracionANSId</code> attribute alias. */
    public static final String ATTR_ALIAS_CONFIGURACIONANSID = "Id.";

    /** <code>configuracionANSId</code> attribute facet sequence. */
    public static final String PATH_FACETS_CONFIGURACIONANSID = "";
    /** Agents allowed to view the attribute configuracionANSId **/
    public static final String CONFIGURACIONANSID_AGENTS = "Admin,SuperAdmin,Gestor";
    // Attribute (configuracionANSTramite)
    /** <code>configuracionANSTramite</code> attribute id. */
    public static final String ATTR_ID_CONFIGURACIONANSTRAMITE = "Clas_1586859868160432Atr_2_Alias";
    /** <code>configuracionANSTramite</code> attribute name. */
    public static final String ATTR_NAME_CONFIGURACIONANSTRAMITE = "configuracionANSTramite";
    /** <code>configuracionANSTramite</code> attribute alias. */
    public static final String ATTR_ALIAS_CONFIGURACIONANSTRAMITE = "Trámite";

    /** <code>configuracionANSTramite</code> attribute facet sequence. */
    public static final String PATH_FACETS_CONFIGURACIONANSTRAMITE = "";
    /** Agents allowed to view the attribute configuracionANSTramite **/
    public static final String CONFIGURACIONANSTRAMITE_AGENTS = "Admin,SuperAdmin,Gestor";
    // Attribute (configuracionANSANSAfiliaciones)
    /** <code>configuracionANSANSAfiliaciones</code> attribute id. */
    public static final String ATTR_ID_CONFIGURACIONANSANSAFILIACIONES = "Clas_1586859868160432Atr_4_Alias";
    /** <code>configuracionANSANSAfiliaciones</code> attribute name. */
    public static final String ATTR_NAME_CONFIGURACIONANSANSAFILIACIONES = "configuracionANSANSAfiliaciones";
    /** <code>configuracionANSANSAfiliaciones</code> attribute alias. */
    public static final String ATTR_ALIAS_CONFIGURACIONANSANSAFILIACIONES = "ANS Afiliaciones";

    /** <code>configuracionANSANSAfiliaciones</code> attribute facet sequence. */
    public static final String PATH_FACETS_CONFIGURACIONANSANSAFILIACIONES = "";
    /** Agents allowed to view the attribute configuracionANSANSAfiliaciones **/
    public static final String CONFIGURACIONANSANSAFILIACIONES_AGENTS = "Admin,SuperAdmin,Gestor";
    // Attribute (configuracionANSANSAreaMedica)
    /** <code>configuracionANSANSAreaMedica</code> attribute id. */
    public static final String ATTR_ID_CONFIGURACIONANSANSAREAMEDICA = "Clas_1586859868160432Atr_3_Alias";
    /** <code>configuracionANSANSAreaMedica</code> attribute name. */
    public static final String ATTR_NAME_CONFIGURACIONANSANSAREAMEDICA = "configuracionANSANSAreaMedica";
    /** <code>configuracionANSANSAreaMedica</code> attribute alias. */
    public static final String ATTR_ALIAS_CONFIGURACIONANSANSAREAMEDICA = "ANS Área Médica";

    /** <code>configuracionANSANSAreaMedica</code> attribute facet sequence. */
    public static final String PATH_FACETS_CONFIGURACIONANSANSAREAMEDICA = "";
    /** Agents allowed to view the attribute configuracionANSANSAreaMedica **/
    public static final String CONFIGURACIONANSANSAREAMEDICA_AGENTS = "Admin,SuperAdmin,Gestor";
    // Attribute (configuracionANSHabilLunes)
    /** <code>configuracionANSHabilLunes</code> attribute id. */
    public static final String ATTR_ID_CONFIGURACIONANSHABILLUNES = "Clas_1586859868160432Atr_5_Alias";
    /** <code>configuracionANSHabilLunes</code> attribute name. */
    public static final String ATTR_NAME_CONFIGURACIONANSHABILLUNES = "configuracionANSHabilLunes";
    /** <code>configuracionANSHabilLunes</code> attribute alias. */
    public static final String ATTR_ALIAS_CONFIGURACIONANSHABILLUNES = "Lunes";

    /** <code>configuracionANSHabilLunes</code> attribute facet sequence. */
    public static final String PATH_FACETS_CONFIGURACIONANSHABILLUNES = "";
    /** Agents allowed to view the attribute configuracionANSHabilLunes **/
    public static final String CONFIGURACIONANSHABILLUNES_AGENTS = "Admin,SuperAdmin,Gestor";
    // Attribute (configuracionANSHabilMartes)
    /** <code>configuracionANSHabilMartes</code> attribute id. */
    public static final String ATTR_ID_CONFIGURACIONANSHABILMARTES = "Clas_1586859868160432Atr_6_Alias";
    /** <code>configuracionANSHabilMartes</code> attribute name. */
    public static final String ATTR_NAME_CONFIGURACIONANSHABILMARTES = "configuracionANSHabilMartes";
    /** <code>configuracionANSHabilMartes</code> attribute alias. */
    public static final String ATTR_ALIAS_CONFIGURACIONANSHABILMARTES = "Martes";

    /** <code>configuracionANSHabilMartes</code> attribute facet sequence. */
    public static final String PATH_FACETS_CONFIGURACIONANSHABILMARTES = "";
    /** Agents allowed to view the attribute configuracionANSHabilMartes **/
    public static final String CONFIGURACIONANSHABILMARTES_AGENTS = "Admin,SuperAdmin,Gestor";
    // Attribute (configuracionANSHabilMiercoles)
    /** <code>configuracionANSHabilMiercoles</code> attribute id. */
    public static final String ATTR_ID_CONFIGURACIONANSHABILMIERCOLES = "Clas_1586859868160432Atr_7_Alias";
    /** <code>configuracionANSHabilMiercoles</code> attribute name. */
    public static final String ATTR_NAME_CONFIGURACIONANSHABILMIERCOLES = "configuracionANSHabilMiercoles";
    /** <code>configuracionANSHabilMiercoles</code> attribute alias. */
    public static final String ATTR_ALIAS_CONFIGURACIONANSHABILMIERCOLES = "Miércoles";

    /** <code>configuracionANSHabilMiercoles</code> attribute facet sequence. */
    public static final String PATH_FACETS_CONFIGURACIONANSHABILMIERCOLES = "";
    /** Agents allowed to view the attribute configuracionANSHabilMiercoles **/
    public static final String CONFIGURACIONANSHABILMIERCOLES_AGENTS = "Admin,SuperAdmin,Gestor";
    // Attribute (configuracionANSHabilJueves)
    /** <code>configuracionANSHabilJueves</code> attribute id. */
    public static final String ATTR_ID_CONFIGURACIONANSHABILJUEVES = "Clas_1586859868160432Atr_8_Alias";
    /** <code>configuracionANSHabilJueves</code> attribute name. */
    public static final String ATTR_NAME_CONFIGURACIONANSHABILJUEVES = "configuracionANSHabilJueves";
    /** <code>configuracionANSHabilJueves</code> attribute alias. */
    public static final String ATTR_ALIAS_CONFIGURACIONANSHABILJUEVES = "Jueves";

    /** <code>configuracionANSHabilJueves</code> attribute facet sequence. */
    public static final String PATH_FACETS_CONFIGURACIONANSHABILJUEVES = "";
    /** Agents allowed to view the attribute configuracionANSHabilJueves **/
    public static final String CONFIGURACIONANSHABILJUEVES_AGENTS = "Admin,SuperAdmin,Gestor";
    // Attribute (configuracionANSHabilViernes)
    /** <code>configuracionANSHabilViernes</code> attribute id. */
    public static final String ATTR_ID_CONFIGURACIONANSHABILVIERNES = "Clas_1586859868160432Atr_9_Alias";
    /** <code>configuracionANSHabilViernes</code> attribute name. */
    public static final String ATTR_NAME_CONFIGURACIONANSHABILVIERNES = "configuracionANSHabilViernes";
    /** <code>configuracionANSHabilViernes</code> attribute alias. */
    public static final String ATTR_ALIAS_CONFIGURACIONANSHABILVIERNES = "Viernes";

    /** <code>configuracionANSHabilViernes</code> attribute facet sequence. */
    public static final String PATH_FACETS_CONFIGURACIONANSHABILVIERNES = "";
    /** Agents allowed to view the attribute configuracionANSHabilViernes **/
    public static final String CONFIGURACIONANSHABILVIERNES_AGENTS = "Admin,SuperAdmin,Gestor";
    // Attribute (configuracionANSHabilSabado)
    /** <code>configuracionANSHabilSabado</code> attribute id. */
    public static final String ATTR_ID_CONFIGURACIONANSHABILSABADO = "Clas_1586859868160432Atr_10_Alias";
    /** <code>configuracionANSHabilSabado</code> attribute name. */
    public static final String ATTR_NAME_CONFIGURACIONANSHABILSABADO = "configuracionANSHabilSabado";
    /** <code>configuracionANSHabilSabado</code> attribute alias. */
    public static final String ATTR_ALIAS_CONFIGURACIONANSHABILSABADO = "Sábado";

    /** <code>configuracionANSHabilSabado</code> attribute facet sequence. */
    public static final String PATH_FACETS_CONFIGURACIONANSHABILSABADO = "";
    /** Agents allowed to view the attribute configuracionANSHabilSabado **/
    public static final String CONFIGURACIONANSHABILSABADO_AGENTS = "Admin,SuperAdmin,Gestor";
    // Attribute (configuracionANSHabilDomingo)
    /** <code>configuracionANSHabilDomingo</code> attribute id. */
    public static final String ATTR_ID_CONFIGURACIONANSHABILDOMINGO = "Clas_1586859868160432Atr_11_Alias";
    /** <code>configuracionANSHabilDomingo</code> attribute name. */
    public static final String ATTR_NAME_CONFIGURACIONANSHABILDOMINGO = "configuracionANSHabilDomingo";
    /** <code>configuracionANSHabilDomingo</code> attribute alias. */
    public static final String ATTR_ALIAS_CONFIGURACIONANSHABILDOMINGO = "Domingo";

    /** <code>configuracionANSHabilDomingo</code> attribute facet sequence. */
    public static final String PATH_FACETS_CONFIGURACIONANSHABILDOMINGO = "";
    /** Agents allowed to view the attribute configuracionANSHabilDomingo **/
    public static final String CONFIGURACIONANSHABILDOMINGO_AGENTS = "Admin,SuperAdmin,Gestor";
    // Attribute (configuracionANSdrvTieneCausal)
    /** <code>configuracionANSdrvTieneCausal</code> attribute id. */
    public static final String ATTR_ID_CONFIGURACIONANSDRVTIENECAUSAL = "Clas_1586859868160432Atr_12_Alias";
    /** <code>configuracionANSdrvTieneCausal</code> attribute name. */
    public static final String ATTR_NAME_CONFIGURACIONANSDRVTIENECAUSAL = "configuracionANSdrvTieneCausal";
    /** <code>configuracionANSdrvTieneCausal</code> attribute alias. */
    public static final String ATTR_ALIAS_CONFIGURACIONANSDRVTIENECAUSAL = "Tiene Causal";

    /** <code>configuracionANSdrvTieneCausal</code> attribute facet sequence. */
    public static final String PATH_FACETS_CONFIGURACIONANSDRVTIENECAUSAL = "";
    /** Agents allowed to view the attribute configuracionANSdrvTieneCausal **/
    public static final String CONFIGURACIONANSDRVTIENECAUSAL_AGENTS = "Admin,SuperAdmin,Gestor";


    // Field (Id)
    /** <code>Id</code> field name. */
    public static final String FLD_CONFIGURACIONANSID = "Id";    
    /** <code>configuracionANSId</code> attribute field name. */
    public static final String ATTR_FIELD_CONFIGURACIONANSID = "configuracionANSId";
    // Field (Numero)
    /** <code>Numero</code> field name. */
    public static final String FLD_DOMINIONUMERO = "Numero";    
    /** <code>Dominio.dominioNumero</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIO_DOMINIONUMERO = "dominioNumero";
    // Field (id_Novedad)
    /** <code>id_Novedad</code> field name. */
    public static final String FLD_NOVEDADIDNOVEDAD = "id_Novedad";    
    /** <code>Novedad.novedadidNovedad</code> attribute field name. */
    public static final String ATTR_FIELD_NOVEDAD_NOVEDADIDNOVEDAD = "novedadidNovedad";
    // Field (id_Causal)
    /** <code>id_Causal</code> field name. */
    public static final String FLD_CAUSALIDCAUSAL = "id_Causal";    
    /** <code>Causal.causalidCausal</code> attribute field name. */
    public static final String ATTR_FIELD_CAUSAL_CAUSALIDCAUSAL = "causalidCausal";
    // Field (Tramite)
    /** <code>Tramite</code> field name. */
    public static final String FLD_CONFIGURACIONANSTRAMITE = "Tramite";    
    /** <code>configuracionANSTramite</code> attribute field name. */
    public static final String ATTR_FIELD_CONFIGURACIONANSTRAMITE = "configuracionANSTramite";
    // Field (ANSAfiliaciones)
    /** <code>ANSAfiliaciones</code> field name. */
    public static final String FLD_CONFIGURACIONANSANSAFILIACIONES = "ANSAfiliaciones";    
    /** <code>configuracionANSANSAfiliaciones</code> attribute field name. */
    public static final String ATTR_FIELD_CONFIGURACIONANSANSAFILIACIONES = "configuracionANSANSAfiliaciones";
    // Field (ANSAreaMedica)
    /** <code>ANSAreaMedica</code> field name. */
    public static final String FLD_CONFIGURACIONANSANSAREAMEDICA = "ANSAreaMedica";    
    /** <code>configuracionANSANSAreaMedica</code> attribute field name. */
    public static final String ATTR_FIELD_CONFIGURACIONANSANSAREAMEDICA = "configuracionANSANSAreaMedica";
    // Field (HabilLunes)
    /** <code>HabilLunes</code> field name. */
    public static final String FLD_CONFIGURACIONANSHABILLUNES = "HabilLunes";    
    /** <code>configuracionANSHabilLunes</code> attribute field name. */
    public static final String ATTR_FIELD_CONFIGURACIONANSHABILLUNES = "configuracionANSHabilLunes";
    // Field (HabilMartes)
    /** <code>HabilMartes</code> field name. */
    public static final String FLD_CONFIGURACIONANSHABILMARTES = "HabilMartes";    
    /** <code>configuracionANSHabilMartes</code> attribute field name. */
    public static final String ATTR_FIELD_CONFIGURACIONANSHABILMARTES = "configuracionANSHabilMartes";
    // Field (HabilMiercoles)
    /** <code>HabilMiercoles</code> field name. */
    public static final String FLD_CONFIGURACIONANSHABILMIERCOLES = "HabilMiercoles";    
    /** <code>configuracionANSHabilMiercoles</code> attribute field name. */
    public static final String ATTR_FIELD_CONFIGURACIONANSHABILMIERCOLES = "configuracionANSHabilMiercoles";
    // Field (HabilJueves)
    /** <code>HabilJueves</code> field name. */
    public static final String FLD_CONFIGURACIONANSHABILJUEVES = "HabilJueves";    
    /** <code>configuracionANSHabilJueves</code> attribute field name. */
    public static final String ATTR_FIELD_CONFIGURACIONANSHABILJUEVES = "configuracionANSHabilJueves";
    // Field (HabilViernes)
    /** <code>HabilViernes</code> field name. */
    public static final String FLD_CONFIGURACIONANSHABILVIERNES = "HabilViernes";    
    /** <code>configuracionANSHabilViernes</code> attribute field name. */
    public static final String ATTR_FIELD_CONFIGURACIONANSHABILVIERNES = "configuracionANSHabilViernes";
    // Field (HabilSabado)
    /** <code>HabilSabado</code> field name. */
    public static final String FLD_CONFIGURACIONANSHABILSABADO = "HabilSabado";    
    /** <code>configuracionANSHabilSabado</code> attribute field name. */
    public static final String ATTR_FIELD_CONFIGURACIONANSHABILSABADO = "configuracionANSHabilSabado";
    // Field (HabilDomingo)
    /** <code>HabilDomingo</code> field name. */
    public static final String FLD_CONFIGURACIONANSHABILDOMINGO = "HabilDomingo";    
    /** <code>configuracionANSHabilDomingo</code> attribute field name. */
    public static final String ATTR_FIELD_CONFIGURACIONANSHABILDOMINGO = "configuracionANSHabilDomingo";

    // Component role (Dominio)
    /** <code>Dominio</code> role id. */
    public static final String ROLE_ID_DOMINIO = "Agr_1586860261376987_Alias";
    /** <code>Dominio</code> role name. */
    public static final String ROLE_NAME_DOMINIO = "dominio";
    /** <code>Dominio</code> role alias. */
    public static final String ROLE_ALIAS_DOMINIO = "Dominio";

    /** <code>Dominio</code> inverse role name. */
    public static final String ROLE_INVNAME_DOMINIO = DominioConstants.ROLE_NAME_CONFIGURACIONESANS;
    /** <code>Dominio</code> role facet sequence. */
    public static final String PATH_FACETS_DOMINIO = "";
    /** <code>Dominio</code> role target class. */
    public static final String ROLE_TARGET_DOMINIO = DominioConstants.CLASS_NAME;

    /** Agents allowed to navigate through Dominio **/
    public static final String DOMINIO_AGENTS = "Admin,SuperAdmin,Gestor";
    // Component role (Novedad)
    /** <code>Novedad</code> role id. */
    public static final String ROLE_ID_NOVEDAD = "Agr_1586860261376351_Alias";
    /** <code>Novedad</code> role name. */
    public static final String ROLE_NAME_NOVEDAD = "novedad";
    /** <code>Novedad</code> role alias. */
    public static final String ROLE_ALIAS_NOVEDAD = "Novedad";

    /** <code>Novedad</code> inverse role name. */
    public static final String ROLE_INVNAME_NOVEDAD = NovedadConstants.ROLE_NAME_CONFIGURACIONESANS;
    /** <code>Novedad</code> role facet sequence. */
    public static final String PATH_FACETS_NOVEDAD = "";
    /** <code>Novedad</code> role target class. */
    public static final String ROLE_TARGET_NOVEDAD = NovedadConstants.CLASS_NAME;

    /** Agents allowed to navigate through Novedad **/
    public static final String NOVEDAD_AGENTS = "Admin,SuperAdmin,Gestor";
    // Component role (Causal)
    /** <code>Causal</code> role id. */
    public static final String ROLE_ID_CAUSAL = "Agr_1586860392448383_Alias";
    /** <code>Causal</code> role name. */
    public static final String ROLE_NAME_CAUSAL = "causal";
    /** <code>Causal</code> role alias. */
    public static final String ROLE_ALIAS_CAUSAL = "Causal";

    /** <code>Causal</code> inverse role name. */
    public static final String ROLE_INVNAME_CAUSAL = CausalConstants.ROLE_NAME_CONFIGURACIONESANS;
    /** <code>Causal</code> role facet sequence. */
    public static final String PATH_FACETS_CAUSAL = "";
    /** <code>Causal</code> role target class. */
    public static final String ROLE_TARGET_CAUSAL = CausalConstants.CLASS_NAME;

    /** Agents allowed to navigate through Causal **/
    public static final String CAUSAL_AGENTS = "Admin,SuperAdmin,Gestor";

    // Compound role (LogConfiguracionANS)
    /** <code>LogConfiguracionANS</code> role id. */
    public static final String ROLE_ID_LOGCONFIGURACIONANS = "Agr_1586860392448116_Alias";
    /** <code>LogConfiguracionANS</code> role name. */
    public static final String ROLE_NAME_LOGCONFIGURACIONANS = "logConfiguracionANS";
    /** <code>ConfiguracionANS</code> role alias. */
    public static final String ROLE_ALIAS_LOGCONFIGURACIONANS = "LogConfiguracionANS";


    /** <code>LogConfiguracionANS</code> inverse role name. */
    public static final String ROLE_INVNAME_LOGCONFIGURACIONANS = LogConfiguracionANSConstants.ROLE_NAME_CONFIGURACIONANS;
    /** <code>LogConfiguracionANS</code> role facet sequence. */
    public static final String PATH_FACETS_LOGCONFIGURACIONANS = "";
    /** <code>LogConfiguracionANS</code> role target class. */
    public static final String ROLE_TARGET_LOGCONFIGURACIONANS = LogConfiguracionANSConstants.CLASS_NAME;
    /** Agents allowed to navigate through LogConfiguracionANS **/
    public static final String LOGCONFIGURACIONANS_AGENTS = "Admin,SuperAdmin,Gestor";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1586859868160432Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>configuracionANScrearpagrNovedad</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_CONFIGURACIONANSCREARPAGRNOVEDAD = "p_agrNovedad";
    /** <code>configuracionANScrearpagrNovedad</code> inbound argument id. */
    public static final String ARG_ID_CREAR_CONFIGURACIONANSCREARPAGRNOVEDAD = "Clas_1586859868160432Ser_1Arg_13_Alias";
    /** <code>configuracionANScrearpagrNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_CONFIGURACIONANSCREARPAGRNOVEDAD = "Novedad";
    /** <code>configuracionANScrearpagrCausal</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_CONFIGURACIONANSCREARPAGRCAUSAL = "p_agrCausal";
    /** <code>configuracionANScrearpagrCausal</code> inbound argument id. */
    public static final String ARG_ID_CREAR_CONFIGURACIONANSCREARPAGRCAUSAL = "Clas_1586859868160432Ser_1Arg_14_Alias";
    /** <code>configuracionANScrearpagrCausal</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_CONFIGURACIONANSCREARPAGRCAUSAL = "Causal";
    /** <code>configuracionANScrearpagrDominio</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_CONFIGURACIONANSCREARPAGRDOMINIO = "p_agrDominio";
    /** <code>configuracionANScrearpagrDominio</code> inbound argument id. */
    public static final String ARG_ID_CREAR_CONFIGURACIONANSCREARPAGRDOMINIO = "Clas_1586859868160432Ser_1Arg_16_Alias";
    /** <code>configuracionANScrearpagrDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_CONFIGURACIONANSCREARPAGRDOMINIO = "Dominio";
    /** <code>configuracionANScrearpatrTramite</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_CONFIGURACIONANSCREARPATRTRAMITE = "p_atrTramite";
    /** <code>configuracionANScrearpatrTramite</code> inbound argument id. */
    public static final String ARG_ID_CREAR_CONFIGURACIONANSCREARPATRTRAMITE = "Clas_1586859868160432Ser_1Arg_2_Alias";
    /** <code>configuracionANScrearpatrTramite</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_CONFIGURACIONANSCREARPATRTRAMITE = "Trámite";
    /** <code>configuracionANScrearpatrANSAreaMedica</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_CONFIGURACIONANSCREARPATRANSAREAMEDICA = "p_atrANSAreaMedica";
    /** <code>configuracionANScrearpatrANSAreaMedica</code> inbound argument id. */
    public static final String ARG_ID_CREAR_CONFIGURACIONANSCREARPATRANSAREAMEDICA = "Clas_1586859868160432Ser_1Arg_3_Alias";
    /** <code>configuracionANScrearpatrANSAreaMedica</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_CONFIGURACIONANSCREARPATRANSAREAMEDICA = "ANS Área Médica";
    /** <code>configuracionANScrearpatrANSAfiliaciones</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_CONFIGURACIONANSCREARPATRANSAFILIACIONES = "p_atrANSAfiliaciones";
    /** <code>configuracionANScrearpatrANSAfiliaciones</code> inbound argument id. */
    public static final String ARG_ID_CREAR_CONFIGURACIONANSCREARPATRANSAFILIACIONES = "Clas_1586859868160432Ser_1Arg_4_Alias";
    /** <code>configuracionANScrearpatrANSAfiliaciones</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_CONFIGURACIONANSCREARPATRANSAFILIACIONES = "ANS Afiliaciones";
    /** <code>configuracionANScrearpatrHabilLunes</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_CONFIGURACIONANSCREARPATRHABILLUNES = "p_atrHabilLunes";
    /** <code>configuracionANScrearpatrHabilLunes</code> inbound argument id. */
    public static final String ARG_ID_CREAR_CONFIGURACIONANSCREARPATRHABILLUNES = "Clas_1586859868160432Ser_1Arg_5_Alias";
    /** <code>configuracionANScrearpatrHabilLunes</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_CONFIGURACIONANSCREARPATRHABILLUNES = "Lunes";
    /** <code>configuracionANScrearpatrHabilMartes</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_CONFIGURACIONANSCREARPATRHABILMARTES = "p_atrHabilMartes";
    /** <code>configuracionANScrearpatrHabilMartes</code> inbound argument id. */
    public static final String ARG_ID_CREAR_CONFIGURACIONANSCREARPATRHABILMARTES = "Clas_1586859868160432Ser_1Arg_6_Alias";
    /** <code>configuracionANScrearpatrHabilMartes</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_CONFIGURACIONANSCREARPATRHABILMARTES = "Martes";
    /** <code>configuracionANScrearpatrHabilMiercoles</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_CONFIGURACIONANSCREARPATRHABILMIERCOLES = "p_atrHabilMiercoles";
    /** <code>configuracionANScrearpatrHabilMiercoles</code> inbound argument id. */
    public static final String ARG_ID_CREAR_CONFIGURACIONANSCREARPATRHABILMIERCOLES = "Clas_1586859868160432Ser_1Arg_7_Alias";
    /** <code>configuracionANScrearpatrHabilMiercoles</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_CONFIGURACIONANSCREARPATRHABILMIERCOLES = "Miércoles";
    /** <code>configuracionANScrearpatrHabilJueves</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_CONFIGURACIONANSCREARPATRHABILJUEVES = "p_atrHabilJueves";
    /** <code>configuracionANScrearpatrHabilJueves</code> inbound argument id. */
    public static final String ARG_ID_CREAR_CONFIGURACIONANSCREARPATRHABILJUEVES = "Clas_1586859868160432Ser_1Arg_8_Alias";
    /** <code>configuracionANScrearpatrHabilJueves</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_CONFIGURACIONANSCREARPATRHABILJUEVES = "Jueves";
    /** <code>configuracionANScrearpatrHabilViernes</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_CONFIGURACIONANSCREARPATRHABILVIERNES = "p_atrHabilViernes";
    /** <code>configuracionANScrearpatrHabilViernes</code> inbound argument id. */
    public static final String ARG_ID_CREAR_CONFIGURACIONANSCREARPATRHABILVIERNES = "Clas_1586859868160432Ser_1Arg_9_Alias";
    /** <code>configuracionANScrearpatrHabilViernes</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_CONFIGURACIONANSCREARPATRHABILVIERNES = "Viernes";
    /** <code>configuracionANScrearpatrHabilSabado</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_CONFIGURACIONANSCREARPATRHABILSABADO = "p_atrHabilSabado";
    /** <code>configuracionANScrearpatrHabilSabado</code> inbound argument id. */
    public static final String ARG_ID_CREAR_CONFIGURACIONANSCREARPATRHABILSABADO = "Clas_1586859868160432Ser_1Arg_10_Alias";
    /** <code>configuracionANScrearpatrHabilSabado</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_CONFIGURACIONANSCREARPATRHABILSABADO = "Sábado";
    /** <code>configuracionANScrearpatrHabilDomingo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_CONFIGURACIONANSCREARPATRHABILDOMINGO = "p_atrHabilDomingo";
    /** <code>configuracionANScrearpatrHabilDomingo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_CONFIGURACIONANSCREARPATRHABILDOMINGO = "Clas_1586859868160432Ser_1Arg_11_Alias";
    /** <code>configuracionANScrearpatrHabilDomingo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_CONFIGURACIONANSCREARPATRHABILDOMINGO = "Domingo";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1586859868160432Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>configuracionANSeliminarpthisConfiguracionANS</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_CONFIGURACIONANSELIMINARPTHISCONFIGURACIONANS = "p_thisConfiguracionANS";
    /** <code>configuracionANSeliminarpthisConfiguracionANS</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_CONFIGURACIONANSELIMINARPTHISCONFIGURACIONANS = "Clas_1586859868160432Ser_2Arg_1_Alias";
    /** <code>configuracionANSeliminarpthisConfiguracionANS</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_CONFIGURACIONANSELIMINARPTHISCONFIGURACIONANS = "Acuerdo nivel de servicio";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1586859868160432Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>configuracionANSmodificarpthisConfiguracionANS</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_CONFIGURACIONANSMODIFICARPTHISCONFIGURACIONANS = "p_thisConfiguracionANS";
    /** <code>configuracionANSmodificarpthisConfiguracionANS</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_CONFIGURACIONANSMODIFICARPTHISCONFIGURACIONANS = "Clas_1586859868160432Ser_3Arg_1_Alias";
    /** <code>configuracionANSmodificarpthisConfiguracionANS</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_CONFIGURACIONANSMODIFICARPTHISCONFIGURACIONANS = "Acuerdo nivel de servicio";
    /** <code>configuracionANSmodificarpANSAreaMedica</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_CONFIGURACIONANSMODIFICARPANSAREAMEDICA = "p_ANSAreaMedica";
    /** <code>configuracionANSmodificarpANSAreaMedica</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_CONFIGURACIONANSMODIFICARPANSAREAMEDICA = "Clas_1586859868160432Ser_3Arg_3_Alias";
    /** <code>configuracionANSmodificarpANSAreaMedica</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_CONFIGURACIONANSMODIFICARPANSAREAMEDICA = "ANS Área Médica";
    /** <code>configuracionANSmodificarpHabilLunes</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_CONFIGURACIONANSMODIFICARPHABILLUNES = "p_HabilLunes";
    /** <code>configuracionANSmodificarpHabilLunes</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_CONFIGURACIONANSMODIFICARPHABILLUNES = "Clas_1586859868160432Ser_3Arg_4_Alias";
    /** <code>configuracionANSmodificarpHabilLunes</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_CONFIGURACIONANSMODIFICARPHABILLUNES = "Lunes";
    /** <code>configuracionANSmodificarpHabilMartes</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_CONFIGURACIONANSMODIFICARPHABILMARTES = "p_HabilMartes";
    /** <code>configuracionANSmodificarpHabilMartes</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_CONFIGURACIONANSMODIFICARPHABILMARTES = "Clas_1586859868160432Ser_3Arg_5_Alias";
    /** <code>configuracionANSmodificarpHabilMartes</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_CONFIGURACIONANSMODIFICARPHABILMARTES = "Martes";
    /** <code>configuracionANSmodificarpHabilMiercoles</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_CONFIGURACIONANSMODIFICARPHABILMIERCOLES = "p_HabilMiercoles";
    /** <code>configuracionANSmodificarpHabilMiercoles</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_CONFIGURACIONANSMODIFICARPHABILMIERCOLES = "Clas_1586859868160432Ser_3Arg_6_Alias";
    /** <code>configuracionANSmodificarpHabilMiercoles</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_CONFIGURACIONANSMODIFICARPHABILMIERCOLES = "Miércoles";
    /** <code>configuracionANSmodificarpHabilJueves</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_CONFIGURACIONANSMODIFICARPHABILJUEVES = "p_HabilJueves";
    /** <code>configuracionANSmodificarpHabilJueves</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_CONFIGURACIONANSMODIFICARPHABILJUEVES = "Clas_1586859868160432Ser_3Arg_7_Alias";
    /** <code>configuracionANSmodificarpHabilJueves</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_CONFIGURACIONANSMODIFICARPHABILJUEVES = "Jueves";
    /** <code>configuracionANSmodificarpHabilViernes</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_CONFIGURACIONANSMODIFICARPHABILVIERNES = "p_HabilViernes";
    /** <code>configuracionANSmodificarpHabilViernes</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_CONFIGURACIONANSMODIFICARPHABILVIERNES = "Clas_1586859868160432Ser_3Arg_8_Alias";
    /** <code>configuracionANSmodificarpHabilViernes</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_CONFIGURACIONANSMODIFICARPHABILVIERNES = "Viernes";
    /** <code>configuracionANSmodificarpHabilSabado</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_CONFIGURACIONANSMODIFICARPHABILSABADO = "p_HabilSabado";
    /** <code>configuracionANSmodificarpHabilSabado</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_CONFIGURACIONANSMODIFICARPHABILSABADO = "Clas_1586859868160432Ser_3Arg_9_Alias";
    /** <code>configuracionANSmodificarpHabilSabado</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_CONFIGURACIONANSMODIFICARPHABILSABADO = "Sábado";
    /** <code>configuracionANSmodificarpHabilDomingo</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_CONFIGURACIONANSMODIFICARPHABILDOMINGO = "p_HabilDomingo";
    /** <code>configuracionANSmodificarpHabilDomingo</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_CONFIGURACIONANSMODIFICARPHABILDOMINGO = "Clas_1586859868160432Ser_3Arg_10_Alias";
    /** <code>configuracionANSmodificarpHabilDomingo</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_CONFIGURACIONANSMODIFICARPHABILDOMINGO = "Domingo";
    /** <code>configuracionANSmodificarpANSAfiliaciones</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_CONFIGURACIONANSMODIFICARPANSAFILIACIONES = "p_ANSAfiliaciones";
    /** <code>configuracionANSmodificarpANSAfiliaciones</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_CONFIGURACIONANSMODIFICARPANSAFILIACIONES = "Clas_1586859868160432Ser_3Arg_11_Alias";
    /** <code>configuracionANSmodificarpANSAfiliaciones</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_CONFIGURACIONANSMODIFICARPANSAFILIACIONES = "ANS Afiliaciones";
    // Service (TCREAR)
    /** <code>TCREAR</code> service id. */
    public static final String SERV_ID_TCREAR = "Clas_1586859868160432Ser_10_Alias";
    /** <code>TCREAR</code> service name. */
    public static final String SERV_NAME_TCREAR = "TCREAR";
    /** <code>TCREAR</code> service alias. */
    public static final String SERV_ALIAS_TCREAR = "Crear";
    /** Agents allowed to execute the service TCREAR **/
    public static final String TCREAR_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>TCREAR</code> precondition 0 id. */
    public static final String PRE_ID_TCREAR_0 = "Clas_1586859868160432Pre_4_MsgError";
    /** <code>TCREAR</code> precondition 1 id. */
    public static final String PRE_ID_TCREAR_1 = "Clas_1586859868160432Pre_1_MsgError";
    /** <code>TCREAR</code> precondition 2 id. */
    public static final String PRE_ID_TCREAR_2 = "Clas_1586859868160432Pre_2_MsgError";
    /** <code>TCREAR</code> precondition 3 id. */
    public static final String PRE_ID_TCREAR_3 = "Clas_1586859868160432Pre_3_MsgError";
    // Inbound arguments
    /** <code>configuracionANSTCREARptpagrDominio</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_CONFIGURACIONANSTCREARPTPAGRDOMINIO = "pt_p_agrDominio";
    /** <code>configuracionANSTCREARptpagrDominio</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_CONFIGURACIONANSTCREARPTPAGRDOMINIO = "Clas_1586859868160432Ser_10Arg_18_Alias";
    /** <code>configuracionANSTCREARptpagrDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_CONFIGURACIONANSTCREARPTPAGRDOMINIO = "Dominio";
    /** <code>configuracionANSTCREARptpagrNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_CONFIGURACIONANSTCREARPTPAGRNOVEDAD = "pt_p_agrNovedad";
    /** <code>configuracionANSTCREARptpagrNovedad</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_CONFIGURACIONANSTCREARPTPAGRNOVEDAD = "Clas_1586859868160432Ser_10Arg_19_Alias";
    /** <code>configuracionANSTCREARptpagrNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_CONFIGURACIONANSTCREARPTPAGRNOVEDAD = "Novedad";
    /** <code>configuracionANSTCREARptpagrCausal</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_CONFIGURACIONANSTCREARPTPAGRCAUSAL = "pt_p_agrCausal";
    /** <code>configuracionANSTCREARptpagrCausal</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_CONFIGURACIONANSTCREARPTPAGRCAUSAL = "Clas_1586859868160432Ser_10Arg_20_Alias";
    /** <code>configuracionANSTCREARptpagrCausal</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_CONFIGURACIONANSTCREARPTPAGRCAUSAL = "Causal";
    /** <code>configuracionANSTCREARptpatrTramite</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_CONFIGURACIONANSTCREARPTPATRTRAMITE = "pt_p_atrTramite";
    /** <code>configuracionANSTCREARptpatrTramite</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_CONFIGURACIONANSTCREARPTPATRTRAMITE = "Clas_1586859868160432Ser_10Arg_21_Alias";
    /** <code>configuracionANSTCREARptpatrTramite</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_CONFIGURACIONANSTCREARPTPATRTRAMITE = "Trámite";
    /** <code>configuracionANSTCREARptpatrANSAreaMedica</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_CONFIGURACIONANSTCREARPTPATRANSAREAMEDICA = "pt_p_atrANSAreaMedica";
    /** <code>configuracionANSTCREARptpatrANSAreaMedica</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_CONFIGURACIONANSTCREARPTPATRANSAREAMEDICA = "Clas_1586859868160432Ser_10Arg_22_Alias";
    /** <code>configuracionANSTCREARptpatrANSAreaMedica</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_CONFIGURACIONANSTCREARPTPATRANSAREAMEDICA = "ANS Área Médica";
    /** <code>configuracionANSTCREARptpatrANSAfiliaciones</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_CONFIGURACIONANSTCREARPTPATRANSAFILIACIONES = "pt_p_atrANSAfiliaciones";
    /** <code>configuracionANSTCREARptpatrANSAfiliaciones</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_CONFIGURACIONANSTCREARPTPATRANSAFILIACIONES = "Clas_1586859868160432Ser_10Arg_23_Alias";
    /** <code>configuracionANSTCREARptpatrANSAfiliaciones</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_CONFIGURACIONANSTCREARPTPATRANSAFILIACIONES = "ANS Afiliaciones";
    /** <code>configuracionANSTCREARptpatrHabilLunes</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_CONFIGURACIONANSTCREARPTPATRHABILLUNES = "pt_p_atrHabilLunes";
    /** <code>configuracionANSTCREARptpatrHabilLunes</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_CONFIGURACIONANSTCREARPTPATRHABILLUNES = "Clas_1586859868160432Ser_10Arg_24_Alias";
    /** <code>configuracionANSTCREARptpatrHabilLunes</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_CONFIGURACIONANSTCREARPTPATRHABILLUNES = "Lunes";
    /** <code>configuracionANSTCREARptpatrHabilMartes</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_CONFIGURACIONANSTCREARPTPATRHABILMARTES = "pt_p_atrHabilMartes";
    /** <code>configuracionANSTCREARptpatrHabilMartes</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_CONFIGURACIONANSTCREARPTPATRHABILMARTES = "Clas_1586859868160432Ser_10Arg_25_Alias";
    /** <code>configuracionANSTCREARptpatrHabilMartes</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_CONFIGURACIONANSTCREARPTPATRHABILMARTES = "Martes";
    /** <code>configuracionANSTCREARptpatrHabilMiercoles</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_CONFIGURACIONANSTCREARPTPATRHABILMIERCOLES = "pt_p_atrHabilMiercoles";
    /** <code>configuracionANSTCREARptpatrHabilMiercoles</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_CONFIGURACIONANSTCREARPTPATRHABILMIERCOLES = "Clas_1586859868160432Ser_10Arg_26_Alias";
    /** <code>configuracionANSTCREARptpatrHabilMiercoles</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_CONFIGURACIONANSTCREARPTPATRHABILMIERCOLES = "Miércoles";
    /** <code>configuracionANSTCREARptpatrHabilJueves</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_CONFIGURACIONANSTCREARPTPATRHABILJUEVES = "pt_p_atrHabilJueves";
    /** <code>configuracionANSTCREARptpatrHabilJueves</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_CONFIGURACIONANSTCREARPTPATRHABILJUEVES = "Clas_1586859868160432Ser_10Arg_27_Alias";
    /** <code>configuracionANSTCREARptpatrHabilJueves</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_CONFIGURACIONANSTCREARPTPATRHABILJUEVES = "Jueves";
    /** <code>configuracionANSTCREARptpatrHabilViernes</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_CONFIGURACIONANSTCREARPTPATRHABILVIERNES = "pt_p_atrHabilViernes";
    /** <code>configuracionANSTCREARptpatrHabilViernes</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_CONFIGURACIONANSTCREARPTPATRHABILVIERNES = "Clas_1586859868160432Ser_10Arg_28_Alias";
    /** <code>configuracionANSTCREARptpatrHabilViernes</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_CONFIGURACIONANSTCREARPTPATRHABILVIERNES = "Viernes";
    /** <code>configuracionANSTCREARptpatrHabilSabado</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_CONFIGURACIONANSTCREARPTPATRHABILSABADO = "pt_p_atrHabilSabado";
    /** <code>configuracionANSTCREARptpatrHabilSabado</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_CONFIGURACIONANSTCREARPTPATRHABILSABADO = "Clas_1586859868160432Ser_10Arg_29_Alias";
    /** <code>configuracionANSTCREARptpatrHabilSabado</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_CONFIGURACIONANSTCREARPTPATRHABILSABADO = "Sábado";
    /** <code>configuracionANSTCREARptpatrHabilDomingo</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_CONFIGURACIONANSTCREARPTPATRHABILDOMINGO = "pt_p_atrHabilDomingo";
    /** <code>configuracionANSTCREARptpatrHabilDomingo</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_CONFIGURACIONANSTCREARPTPATRHABILDOMINGO = "Clas_1586859868160432Ser_10Arg_30_Alias";
    /** <code>configuracionANSTCREARptpatrHabilDomingo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_CONFIGURACIONANSTCREARPTPATRHABILDOMINGO = "Domingo";
    // Service (TMODIFICAR)
    /** <code>TMODIFICAR</code> service id. */
    public static final String SERV_ID_TMODIFICAR = "Clas_1586859868160432Ser_11_Alias";
    /** <code>TMODIFICAR</code> service name. */
    public static final String SERV_NAME_TMODIFICAR = "TMODIFICAR";
    /** <code>TMODIFICAR</code> service alias. */
    public static final String SERV_ALIAS_TMODIFICAR = "Modificar";
    /** Agents allowed to execute the service TMODIFICAR **/
    public static final String TMODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>configuracionANSTMODIFICARpthisConfiguracionANS</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTHISCONFIGURACIONANS = "p_thisConfiguracionANS";
    /** <code>configuracionANSTMODIFICARpthisConfiguracionANS</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTHISCONFIGURACIONANS = "Clas_1586859868160432Ser_11Arg_1_Alias";
    /** <code>configuracionANSTMODIFICARpthisConfiguracionANS</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTHISCONFIGURACIONANS = "Id";
    /** <code>configuracionANSTMODIFICARptpANSAreaMedica</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTPANSAREAMEDICA = "pt_p_ANSAreaMedica";
    /** <code>configuracionANSTMODIFICARptpANSAreaMedica</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTPANSAREAMEDICA = "Clas_1586859868160432Ser_11Arg_2_Alias";
    /** <code>configuracionANSTMODIFICARptpANSAreaMedica</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTPANSAREAMEDICA = "ANS Área Médica";
    /** <code>configuracionANSTMODIFICARptpHabilLunes</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTPHABILLUNES = "pt_p_HabilLunes";
    /** <code>configuracionANSTMODIFICARptpHabilLunes</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTPHABILLUNES = "Clas_1586859868160432Ser_11Arg_3_Alias";
    /** <code>configuracionANSTMODIFICARptpHabilLunes</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTPHABILLUNES = "Lunes";
    /** <code>configuracionANSTMODIFICARptpHabilMartes</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTPHABILMARTES = "pt_p_HabilMartes";
    /** <code>configuracionANSTMODIFICARptpHabilMartes</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTPHABILMARTES = "Clas_1586859868160432Ser_11Arg_4_Alias";
    /** <code>configuracionANSTMODIFICARptpHabilMartes</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTPHABILMARTES = "Martes";
    /** <code>configuracionANSTMODIFICARptpHabilMiercoles</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTPHABILMIERCOLES = "pt_p_HabilMiercoles";
    /** <code>configuracionANSTMODIFICARptpHabilMiercoles</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTPHABILMIERCOLES = "Clas_1586859868160432Ser_11Arg_5_Alias";
    /** <code>configuracionANSTMODIFICARptpHabilMiercoles</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTPHABILMIERCOLES = "Miércoles";
    /** <code>configuracionANSTMODIFICARptpHabilJueves</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTPHABILJUEVES = "pt_p_HabilJueves";
    /** <code>configuracionANSTMODIFICARptpHabilJueves</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTPHABILJUEVES = "Clas_1586859868160432Ser_11Arg_6_Alias";
    /** <code>configuracionANSTMODIFICARptpHabilJueves</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTPHABILJUEVES = "Jueves";
    /** <code>configuracionANSTMODIFICARptpHabilViernes</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTPHABILVIERNES = "pt_p_HabilViernes";
    /** <code>configuracionANSTMODIFICARptpHabilViernes</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTPHABILVIERNES = "Clas_1586859868160432Ser_11Arg_7_Alias";
    /** <code>configuracionANSTMODIFICARptpHabilViernes</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTPHABILVIERNES = "Viernes";
    /** <code>configuracionANSTMODIFICARptpHabilSabado</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTPHABILSABADO = "pt_p_HabilSabado";
    /** <code>configuracionANSTMODIFICARptpHabilSabado</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTPHABILSABADO = "Clas_1586859868160432Ser_11Arg_8_Alias";
    /** <code>configuracionANSTMODIFICARptpHabilSabado</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTPHABILSABADO = "Sábado";
    /** <code>configuracionANSTMODIFICARptpHabilDomingo</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTPHABILDOMINGO = "pt_p_HabilDomingo";
    /** <code>configuracionANSTMODIFICARptpHabilDomingo</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTPHABILDOMINGO = "Clas_1586859868160432Ser_11Arg_9_Alias";
    /** <code>configuracionANSTMODIFICARptpHabilDomingo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTPHABILDOMINGO = "Domingo";
    /** <code>configuracionANSTMODIFICARptpANSAfiliaciones</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTPANSAFILIACIONES = "pt_p_ANSAfiliaciones";
    /** <code>configuracionANSTMODIFICARptpANSAfiliaciones</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTPANSAFILIACIONES = "Clas_1586859868160432Ser_11Arg_10_Alias";
    /** <code>configuracionANSTMODIFICARptpANSAfiliaciones</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_CONFIGURACIONANSTMODIFICARPTPANSAFILIACIONES = "ANS Afiliaciones";
    // Service (TELIMINAR)
    /** <code>TELIMINAR</code> service id. */
    public static final String SERV_ID_TELIMINAR = "Clas_1586859868160432Ser_12_Alias";
    /** <code>TELIMINAR</code> service name. */
    public static final String SERV_NAME_TELIMINAR = "TELIMINAR";
    /** <code>TELIMINAR</code> service alias. */
    public static final String SERV_ALIAS_TELIMINAR = "Eliminar";
    /** Agents allowed to execute the service TELIMINAR **/
    public static final String TELIMINAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>configuracionANSTELIMINARpthisConfiguracionANS</code> inbound argument name. */
    public static final String ARG_NAME_TELIMINAR_CONFIGURACIONANSTELIMINARPTHISCONFIGURACIONANS = "p_thisConfiguracionANS";
    /** <code>configuracionANSTELIMINARpthisConfiguracionANS</code> inbound argument id. */
    public static final String ARG_ID_TELIMINAR_CONFIGURACIONANSTELIMINARPTHISCONFIGURACIONANS = "Clas_1586859868160432Ser_12Arg_1_Alias";
    /** <code>configuracionANSTELIMINARpthisConfiguracionANS</code> inbound argument alias. */
    public static final String ARG_ALIAS_TELIMINAR_CONFIGURACIONANSTELIMINARPTHISCONFIGURACIONANS = "Acuerdo nivel de servicio";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_CONFIGURACIONANSTRAMITE.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_CONFIGURACIONANSANSAFILIACIONES.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_CONFIGURACIONANSANSAREAMEDICA.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_CONFIGURACIONANSHABILLUNES.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_CONFIGURACIONANSHABILMARTES.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_CONFIGURACIONANSHABILMIERCOLES.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_CONFIGURACIONANSHABILJUEVES.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_CONFIGURACIONANSHABILVIERNES.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_CONFIGURACIONANSHABILSABADO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_CONFIGURACIONANSHABILDOMINGO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_CONFIGURACIONANSDRVTIENECAUSAL.toUpperCase(), Constants.Type.BOOL.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_CONFIGURACIONANSID.toUpperCase(), CONFIGURACIONANSID_AGENTS);
    	attributeAgents.put(ATTR_NAME_CONFIGURACIONANSTRAMITE.toUpperCase(), CONFIGURACIONANSTRAMITE_AGENTS);
    	attributeAgents.put(ATTR_NAME_CONFIGURACIONANSANSAFILIACIONES.toUpperCase(), CONFIGURACIONANSANSAFILIACIONES_AGENTS);
    	attributeAgents.put(ATTR_NAME_CONFIGURACIONANSANSAREAMEDICA.toUpperCase(), CONFIGURACIONANSANSAREAMEDICA_AGENTS);
    	attributeAgents.put(ATTR_NAME_CONFIGURACIONANSHABILLUNES.toUpperCase(), CONFIGURACIONANSHABILLUNES_AGENTS);
    	attributeAgents.put(ATTR_NAME_CONFIGURACIONANSHABILMARTES.toUpperCase(), CONFIGURACIONANSHABILMARTES_AGENTS);
    	attributeAgents.put(ATTR_NAME_CONFIGURACIONANSHABILMIERCOLES.toUpperCase(), CONFIGURACIONANSHABILMIERCOLES_AGENTS);
    	attributeAgents.put(ATTR_NAME_CONFIGURACIONANSHABILJUEVES.toUpperCase(), CONFIGURACIONANSHABILJUEVES_AGENTS);
    	attributeAgents.put(ATTR_NAME_CONFIGURACIONANSHABILVIERNES.toUpperCase(), CONFIGURACIONANSHABILVIERNES_AGENTS);
    	attributeAgents.put(ATTR_NAME_CONFIGURACIONANSHABILSABADO.toUpperCase(), CONFIGURACIONANSHABILSABADO_AGENTS);
    	attributeAgents.put(ATTR_NAME_CONFIGURACIONANSHABILDOMINGO.toUpperCase(), CONFIGURACIONANSHABILDOMINGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_CONFIGURACIONANSDRVTIENECAUSAL.toUpperCase(), CONFIGURACIONANSDRVTIENECAUSAL_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_DOMINIO.toUpperCase(), DOMINIO_AGENTS);
        roleAgents.put(ROLE_NAME_NOVEDAD.toUpperCase(), NOVEDAD_AGENTS);
        roleAgents.put(ROLE_NAME_CAUSAL.toUpperCase(), CAUSAL_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'ConfiguracionANS', it returns the identification keys
     * - If className is a facet of the inheritance net of 'ConfiguracionANS', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_CONFIGURACIONANSID);
        }
        // Facet 'ConfiguracionANS' (This facet)
        if (ConfiguracionANSConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_CONFIGURACIONANSID);
        }
        return returnList;
    }
}
