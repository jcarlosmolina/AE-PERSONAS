package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>DocumentoG</code> model class.
 */
public final class DocumentoGConstants {

    private DocumentoGConstants() {

    }

    // Class
    /** <code>DocumentoG</code> class id. */
    public static final String CLASS_ID = "Clas_1434446200832109_Alias";
    /** <code>DocumentoG</code> class name. */
    public static final String CLASS_NAME = "DocumentoG";
    /** <code>DocumentoG</code> class alias. */
    public static final String CLASS_ALIAS = "Documento gestor";
    /** <code>DocumentoG</code> class table name. */
    public static final String TBL_NAME = "DocumentoG";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "documentoGIdentificador,aesolicitudesidsolicitud,personaPersonaIdentificador,documentoGDescripcion,documentoGTipo,documentoGEstado,documentoGFechaSubida,documentoGPathCompleto,documentoGExtension,documentoGNumDescargas,documentoGEmailEnvioDevuelto,documentoGIdDocEnGestor,documentoGNombre,documentoGUsuarioCreador";

    public static final String DSDSDOCUMENTOGPIU = "DS_DocumentoG_PIU";
    public static final String DSDSDOCUMENTOGIIU = "DS_DocumentoG_IIU";
    

    // Attribute (documentoGIdentificador)
    /** <code>documentoGIdentificador</code> attribute id. */
    public static final String ATTR_ID_DOCUMENTOGIDENTIFICADOR = "Clas_1434446200832109Atr_1_Alias";
    /** <code>documentoGIdentificador</code> attribute name. */
    public static final String ATTR_NAME_DOCUMENTOGIDENTIFICADOR = "documentoGIdentificador";
    /** <code>documentoGIdentificador</code> attribute alias. */
    public static final String ATTR_ALIAS_DOCUMENTOGIDENTIFICADOR = "Identificador";

    /** <code>documentoGIdentificador</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOCUMENTOGIDENTIFICADOR = "";
    /** Agents allowed to view the attribute documentoGIdentificador **/
    public static final String DOCUMENTOGIDENTIFICADOR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (documentoGDescripcion)
    /** <code>documentoGDescripcion</code> attribute id. */
    public static final String ATTR_ID_DOCUMENTOGDESCRIPCION = "Clas_1434446200832109Atr_2_Alias";
    /** <code>documentoGDescripcion</code> attribute name. */
    public static final String ATTR_NAME_DOCUMENTOGDESCRIPCION = "documentoGDescripcion";
    /** <code>documentoGDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_DOCUMENTOGDESCRIPCION = "Descripción";

    /** <code>documentoGDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOCUMENTOGDESCRIPCION = "";
    /** Agents allowed to view the attribute documentoGDescripcion **/
    public static final String DOCUMENTOGDESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (documentoGTipo)
    /** <code>documentoGTipo</code> attribute id. */
    public static final String ATTR_ID_DOCUMENTOGTIPO = "Clas_1434446200832109Atr_3_Alias";
    /** <code>documentoGTipo</code> attribute name. */
    public static final String ATTR_NAME_DOCUMENTOGTIPO = "documentoGTipo";
    /** <code>documentoGTipo</code> attribute alias. */
    public static final String ATTR_ALIAS_DOCUMENTOGTIPO = "Tipo";

    /** <code>documentoGTipo</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOCUMENTOGTIPO = "";
    /** Agents allowed to view the attribute documentoGTipo **/
    public static final String DOCUMENTOGTIPO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (documentoGEstado)
    /** <code>documentoGEstado</code> attribute id. */
    public static final String ATTR_ID_DOCUMENTOGESTADO = "Clas_1434446200832109Atr_4_Alias";
    /** <code>documentoGEstado</code> attribute name. */
    public static final String ATTR_NAME_DOCUMENTOGESTADO = "documentoGEstado";
    /** <code>documentoGEstado</code> attribute alias. */
    public static final String ATTR_ALIAS_DOCUMENTOGESTADO = "Estado";

    /** <code>documentoGEstado</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOCUMENTOGESTADO = "";
    /** Agents allowed to view the attribute documentoGEstado **/
    public static final String DOCUMENTOGESTADO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (documentoGFechaSubida)
    /** <code>documentoGFechaSubida</code> attribute id. */
    public static final String ATTR_ID_DOCUMENTOGFECHASUBIDA = "Clas_1434446200832109Atr_5_Alias";
    /** <code>documentoGFechaSubida</code> attribute name. */
    public static final String ATTR_NAME_DOCUMENTOGFECHASUBIDA = "documentoGFechaSubida";
    /** <code>documentoGFechaSubida</code> attribute alias. */
    public static final String ATTR_ALIAS_DOCUMENTOGFECHASUBIDA = "Fecha subida gestor";

    /** <code>documentoGFechaSubida</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOCUMENTOGFECHASUBIDA = "";
    /** Agents allowed to view the attribute documentoGFechaSubida **/
    public static final String DOCUMENTOGFECHASUBIDA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (documentoGPathCompleto)
    /** <code>documentoGPathCompleto</code> attribute id. */
    public static final String ATTR_ID_DOCUMENTOGPATHCOMPLETO = "Clas_1434446200832109Atr_6_Alias";
    /** <code>documentoGPathCompleto</code> attribute name. */
    public static final String ATTR_NAME_DOCUMENTOGPATHCOMPLETO = "documentoGPathCompleto";
    /** <code>documentoGPathCompleto</code> attribute alias. */
    public static final String ATTR_ALIAS_DOCUMENTOGPATHCOMPLETO = "Path Completo";

    /** <code>documentoGPathCompleto</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOCUMENTOGPATHCOMPLETO = "";
    /** Agents allowed to view the attribute documentoGPathCompleto **/
    public static final String DOCUMENTOGPATHCOMPLETO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (documentoGExtension)
    /** <code>documentoGExtension</code> attribute id. */
    public static final String ATTR_ID_DOCUMENTOGEXTENSION = "Clas_1434446200832109Atr_7_Alias";
    /** <code>documentoGExtension</code> attribute name. */
    public static final String ATTR_NAME_DOCUMENTOGEXTENSION = "documentoGExtension";
    /** <code>documentoGExtension</code> attribute alias. */
    public static final String ATTR_ALIAS_DOCUMENTOGEXTENSION = "Extensión";

    /** <code>documentoGExtension</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOCUMENTOGEXTENSION = "";
    /** Agents allowed to view the attribute documentoGExtension **/
    public static final String DOCUMENTOGEXTENSION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (documentoGNumDescargas)
    /** <code>documentoGNumDescargas</code> attribute id. */
    public static final String ATTR_ID_DOCUMENTOGNUMDESCARGAS = "Clas_1434446200832109Atr_8_Alias";
    /** <code>documentoGNumDescargas</code> attribute name. */
    public static final String ATTR_NAME_DOCUMENTOGNUMDESCARGAS = "documentoGNumDescargas";
    /** <code>documentoGNumDescargas</code> attribute alias. */
    public static final String ATTR_ALIAS_DOCUMENTOGNUMDESCARGAS = "Nº Descargas";

    /** <code>documentoGNumDescargas</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOCUMENTOGNUMDESCARGAS = "";
    /** Agents allowed to view the attribute documentoGNumDescargas **/
    public static final String DOCUMENTOGNUMDESCARGAS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (documentoGEmailEnvioDevuelto)
    /** <code>documentoGEmailEnvioDevuelto</code> attribute id. */
    public static final String ATTR_ID_DOCUMENTOGEMAILENVIODEVUELTO = "Clas_1434446200832109Atr_10_Alias";
    /** <code>documentoGEmailEnvioDevuelto</code> attribute name. */
    public static final String ATTR_NAME_DOCUMENTOGEMAILENVIODEVUELTO = "documentoGEmailEnvioDevuelto";
    /** <code>documentoGEmailEnvioDevuelto</code> attribute alias. */
    public static final String ATTR_ALIAS_DOCUMENTOGEMAILENVIODEVUELTO = "Envío email devuelto";

    /** <code>documentoGEmailEnvioDevuelto</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOCUMENTOGEMAILENVIODEVUELTO = "";
    /** Agents allowed to view the attribute documentoGEmailEnvioDevuelto **/
    public static final String DOCUMENTOGEMAILENVIODEVUELTO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (documentoGResultadoSubida)
    /** <code>documentoGResultadoSubida</code> attribute id. */
    public static final String ATTR_ID_DOCUMENTOGRESULTADOSUBIDA = "Clas_1434446200832109Atr_11_Alias";
    /** <code>documentoGResultadoSubida</code> attribute name. */
    public static final String ATTR_NAME_DOCUMENTOGRESULTADOSUBIDA = "documentoGResultadoSubida";
    /** <code>documentoGResultadoSubida</code> attribute alias. */
    public static final String ATTR_ALIAS_DOCUMENTOGRESULTADOSUBIDA = "Resultado";

    /** <code>documentoGResultadoSubida</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOCUMENTOGRESULTADOSUBIDA = "";
    /** Agents allowed to view the attribute documentoGResultadoSubida **/
    public static final String DOCUMENTOGRESULTADOSUBIDA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (documentoGIdDocEnGestor)
    /** <code>documentoGIdDocEnGestor</code> attribute id. */
    public static final String ATTR_ID_DOCUMENTOGIDDOCENGESTOR = "Clas_1434446200832109Atr_12_Alias";
    /** <code>documentoGIdDocEnGestor</code> attribute name. */
    public static final String ATTR_NAME_DOCUMENTOGIDDOCENGESTOR = "documentoGIdDocEnGestor";
    /** <code>documentoGIdDocEnGestor</code> attribute alias. */
    public static final String ATTR_ALIAS_DOCUMENTOGIDDOCENGESTOR = "Id. En Gestor";

    /** <code>documentoGIdDocEnGestor</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOCUMENTOGIDDOCENGESTOR = "";
    /** Agents allowed to view the attribute documentoGIdDocEnGestor **/
    public static final String DOCUMENTOGIDDOCENGESTOR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (documentoGNombre)
    /** <code>documentoGNombre</code> attribute id. */
    public static final String ATTR_ID_DOCUMENTOGNOMBRE = "Clas_1434446200832109Atr_13_Alias";
    /** <code>documentoGNombre</code> attribute name. */
    public static final String ATTR_NAME_DOCUMENTOGNOMBRE = "documentoGNombre";
    /** <code>documentoGNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_DOCUMENTOGNOMBRE = "Archivo adjunto";

    /** <code>documentoGNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOCUMENTOGNOMBRE = "";
    /** Agents allowed to view the attribute documentoGNombre **/
    public static final String DOCUMENTOGNOMBRE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (documentoGDrvNumContrato)
    /** <code>documentoGDrvNumContrato</code> attribute id. */
    public static final String ATTR_ID_DOCUMENTOGDRVNUMCONTRATO = "Clas_1434446200832109Atr_14_Alias";
    /** <code>documentoGDrvNumContrato</code> attribute name. */
    public static final String ATTR_NAME_DOCUMENTOGDRVNUMCONTRATO = "documentoGDrvNumContrato";
    /** <code>documentoGDrvNumContrato</code> attribute alias. */
    public static final String ATTR_ALIAS_DOCUMENTOGDRVNUMCONTRATO = "Nº Contrato";

    /** <code>documentoGDrvNumContrato</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOCUMENTOGDRVNUMCONTRATO = "";
    /** Agents allowed to view the attribute documentoGDrvNumContrato **/
    public static final String DOCUMENTOGDRVNUMCONTRATO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (documentoGUsuarioCreador)
    /** <code>documentoGUsuarioCreador</code> attribute id. */
    public static final String ATTR_ID_DOCUMENTOGUSUARIOCREADOR = "Clas_1434446200832109Atr_15_Alias";
    /** <code>documentoGUsuarioCreador</code> attribute name. */
    public static final String ATTR_NAME_DOCUMENTOGUSUARIOCREADOR = "documentoGUsuarioCreador";
    /** <code>documentoGUsuarioCreador</code> attribute alias. */
    public static final String ATTR_ALIAS_DOCUMENTOGUSUARIOCREADOR = "Usuario";

    /** <code>documentoGUsuarioCreador</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOCUMENTOGUSUARIOCREADOR = "";
    /** Agents allowed to view the attribute documentoGUsuarioCreador **/
    public static final String DOCUMENTOGUSUARIOCREADOR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Identificador)
    /** <code>Identificador</code> field name. */
    public static final String FLD_DOCUMENTOGIDENTIFICADOR = "Identificador";    
    /** <code>documentoGIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_DOCUMENTOGIDENTIFICADOR = "documentoGIdentificador";
    // Field (id_solicitud)
    /** <code>id_solicitud</code> field name. */
    public static final String FLD_AESOLICITUDESIDSOLICITUD = "id_solicitud";    
    /** <code>Solicitud.Ae_solicitudes.aesolicitudesidsolicitud</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUD_AE_SOLICITUDES_AESOLICITUDESIDSOLICITUD = "aesolicitudesidsolicitud";
    // Field (Persona_Identificador)
    /** <code>Persona_Identificador</code> field name. */
    public static final String FLD_PERSONAPERSONAIDENTIFICADOR = "Persona_Identificador";    
    /** <code>Persona.personaIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONA_PERSONAIDENTIFICADOR = "personaPersonaIdentificador";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_DOCUMENTOGDESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_DOCUMENTOGDESCRIPCIONLENGTH = 150;
    /** <code>documentoGDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_DOCUMENTOGDESCRIPCION = "documentoGDescripcion";
    // Field (Tipo)
    /** <code>Tipo</code> field name. */
    public static final String FLD_DOCUMENTOGTIPO = "Tipo";    
    /** <code>documentoGTipo</code> attribute field name. */
    public static final String ATTR_FIELD_DOCUMENTOGTIPO = "documentoGTipo";
    // Field (Estado)
    /** <code>Estado</code> field name. */
    public static final String FLD_DOCUMENTOGESTADO = "Estado";    
    /** <code>documentoGEstado</code> attribute field name. */
    public static final String ATTR_FIELD_DOCUMENTOGESTADO = "documentoGEstado";
    // Field (FechaSubida)
    /** <code>FechaSubida</code> field name. */
    public static final String FLD_DOCUMENTOGFECHASUBIDA = "FechaSubida";    
    /** <code>documentoGFechaSubida</code> attribute field name. */
    public static final String ATTR_FIELD_DOCUMENTOGFECHASUBIDA = "documentoGFechaSubida";
    // Field (PathCompleto)
    /** <code>PathCompleto</code> field name. */
    public static final String FLD_DOCUMENTOGPATHCOMPLETO = "PathCompleto";    
    /** <code>PathCompleto</code> field length. */
    public static final int FLD_DOCUMENTOGPATHCOMPLETOLENGTH = 255;
    /** <code>documentoGPathCompleto</code> attribute field name. */
    public static final String ATTR_FIELD_DOCUMENTOGPATHCOMPLETO = "documentoGPathCompleto";
    // Field (Extension)
    /** <code>Extension</code> field name. */
    public static final String FLD_DOCUMENTOGEXTENSION = "Extension";    
    /** <code>Extension</code> field length. */
    public static final int FLD_DOCUMENTOGEXTENSIONLENGTH = 15;
    /** <code>documentoGExtension</code> attribute field name. */
    public static final String ATTR_FIELD_DOCUMENTOGEXTENSION = "documentoGExtension";
    // Field (NumDescargas)
    /** <code>NumDescargas</code> field name. */
    public static final String FLD_DOCUMENTOGNUMDESCARGAS = "NumDescargas";    
    /** <code>documentoGNumDescargas</code> attribute field name. */
    public static final String ATTR_FIELD_DOCUMENTOGNUMDESCARGAS = "documentoGNumDescargas";
    // Field (EmailEnvioDevuelto)
    /** <code>EmailEnvioDevuelto</code> field name. */
    public static final String FLD_DOCUMENTOGEMAILENVIODEVUELTO = "EmailEnvioDevuelto";    
    /** <code>EmailEnvioDevuelto</code> field length. */
    public static final int FLD_DOCUMENTOGEMAILENVIODEVUELTOLENGTH = 255;
    /** <code>documentoGEmailEnvioDevuelto</code> attribute field name. */
    public static final String ATTR_FIELD_DOCUMENTOGEMAILENVIODEVUELTO = "documentoGEmailEnvioDevuelto";
    // Field (ResultadoSubida)
    /** <code>ResultadoSubida</code> field name. */
    public static final String FLD_DOCUMENTOGRESULTADOSUBIDA = "ResultadoSubida";    
    /** <code>documentoGResultadoSubida</code> attribute field name. */
    public static final String ATTR_FIELD_DOCUMENTOGRESULTADOSUBIDA = "documentoGResultadoSubida";
    // Field (IdDocEnGestor)
    /** <code>IdDocEnGestor</code> field name. */
    public static final String FLD_DOCUMENTOGIDDOCENGESTOR = "IdDocEnGestor";    
    /** <code>IdDocEnGestor</code> field length. */
    public static final int FLD_DOCUMENTOGIDDOCENGESTORLENGTH = 255;
    /** <code>documentoGIdDocEnGestor</code> attribute field name. */
    public static final String ATTR_FIELD_DOCUMENTOGIDDOCENGESTOR = "documentoGIdDocEnGestor";
    // Field (Nombre)
    /** <code>Nombre</code> field name. */
    public static final String FLD_DOCUMENTOGNOMBRE = "Nombre";    
    /** <code>Nombre</code> field length. */
    public static final int FLD_DOCUMENTOGNOMBRELENGTH = 255;
    /** <code>documentoGNombre</code> attribute field name. */
    public static final String ATTR_FIELD_DOCUMENTOGNOMBRE = "documentoGNombre";
    // Field (UsuarioCreador)
    /** <code>UsuarioCreador</code> field name. */
    public static final String FLD_DOCUMENTOGUSUARIOCREADOR = "UsuarioCreador";    
    /** <code>UsuarioCreador</code> field length. */
    public static final int FLD_DOCUMENTOGUSUARIOCREADORLENGTH = 50;
    /** <code>documentoGUsuarioCreador</code> attribute field name. */
    public static final String ATTR_FIELD_DOCUMENTOGUSUARIOCREADOR = "documentoGUsuarioCreador";

    // Component role (Solicitud)
    /** <code>Solicitud</code> role id. */
    public static final String ROLE_ID_SOLICITUD = "Agr_1434446200832964_Alias";
    /** <code>Solicitud</code> role name. */
    public static final String ROLE_NAME_SOLICITUD = "solicitud";
    /** <code>Solicitud</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUD = "Solicitud";

    /** <code>Solicitud</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUD = SolicitudConstants.ROLE_NAME_DOCUMENTOSGESTOR;
    /** <code>Solicitud</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUD = "";
    /** <code>Solicitud</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUD = SolicitudConstants.CLASS_NAME;

    /** Agents allowed to navigate through Solicitud **/
    public static final String SOLICITUD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Persona)
    /** <code>Persona</code> role id. */
    public static final String ROLE_ID_PERSONA = "Agr_1434447904768518_Alias";
    /** <code>Persona</code> role name. */
    public static final String ROLE_NAME_PERSONA = "persona";
    /** <code>Persona</code> role alias. */
    public static final String ROLE_ALIAS_PERSONA = "Persona";

    /** <code>Persona</code> inverse role name. */
    public static final String ROLE_INVNAME_PERSONA = PersonaConstants.ROLE_NAME_DOCUMENTOSG;
    /** <code>Persona</code> role facet sequence. */
    public static final String PATH_FACETS_PERSONA = "";
    /** <code>Persona</code> role target class. */
    public static final String ROLE_TARGET_PERSONA = PersonaConstants.CLASS_NAME;

    /** Agents allowed to navigate through Persona **/
    public static final String PERSONA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Compound role (ObsEstado)
    /** <code>ObsEstado</code> role id. */
    public static final String ROLE_ID_OBSESTADO = "Agr_1434446856192431_Alias";
    /** <code>ObsEstado</code> role name. */
    public static final String ROLE_NAME_OBSESTADO = "obsEstado";
    /** <code>DocumentoG</code> role alias. */
    public static final String ROLE_ALIAS_OBSESTADO = "Observaciones";


    /** <code>ObsEstado</code> inverse role name. */
    public static final String ROLE_INVNAME_OBSESTADO = ObsEstadoConstants.ROLE_NAME_DOCUMENTOG;
    /** <code>ObsEstado</code> role facet sequence. */
    public static final String PATH_FACETS_OBSESTADO = "";
    /** <code>ObsEstado</code> role target class. */
    public static final String ROLE_TARGET_OBSESTADO = ObsEstadoConstants.CLASS_NAME;
    /** Agents allowed to navigate through ObsEstado **/
    public static final String OBSESTADO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1434446200832109Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>documentoGcrearpagrPersona</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOCUMENTOGCREARPAGRPERSONA = "p_agrPersona";
    /** <code>documentoGcrearpagrPersona</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOCUMENTOGCREARPAGRPERSONA = "Clas_1434446200832109Ser_1Arg_9_Alias";
    /** <code>documentoGcrearpagrPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOCUMENTOGCREARPAGRPERSONA = "Persona";
    /** <code>documentoGcrearpagrSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOCUMENTOGCREARPAGRSOLICITUD = "p_agrSolicitud";
    /** <code>documentoGcrearpagrSolicitud</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOCUMENTOGCREARPAGRSOLICITUD = "Clas_1434446200832109Ser_1Arg_18_Alias";
    /** <code>documentoGcrearpagrSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOCUMENTOGCREARPAGRSOLICITUD = "Solicitud";
    /** <code>documentoGcrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOCUMENTOGCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>documentoGcrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOCUMENTOGCREARPATRDESCRIPCION = "Clas_1434446200832109Ser_1Arg_3_Alias";
    /** <code>documentoGcrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOCUMENTOGCREARPATRDESCRIPCION = "Descripción";
    /** <code>documentoGcrearpatrTipo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOCUMENTOGCREARPATRTIPO = "p_atrTipo";
    /** <code>documentoGcrearpatrTipo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOCUMENTOGCREARPATRTIPO = "Clas_1434446200832109Ser_1Arg_4_Alias";
    /** <code>documentoGcrearpatrTipo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOCUMENTOGCREARPATRTIPO = "Tipo";
    /** <code>documentoGcrearpatrEstado</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOCUMENTOGCREARPATRESTADO = "p_atrEstado";
    /** <code>documentoGcrearpatrEstado</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOCUMENTOGCREARPATRESTADO = "Clas_1434446200832109Ser_1Arg_5_Alias";
    /** <code>documentoGcrearpatrEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOCUMENTOGCREARPATRESTADO = "Estado";
    /** <code>documentoGcrearpatrFechaSubida</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOCUMENTOGCREARPATRFECHASUBIDA = "p_atrFechaSubida";
    /** <code>documentoGcrearpatrFechaSubida</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOCUMENTOGCREARPATRFECHASUBIDA = "Clas_1434446200832109Ser_1Arg_6_Alias";
    /** <code>documentoGcrearpatrFechaSubida</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOCUMENTOGCREARPATRFECHASUBIDA = "Fecha subida gestor";
    /** <code>documentoGcrearpatrIdDocEnGestor</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOCUMENTOGCREARPATRIDDOCENGESTOR = "p_atrIdDocEnGestor";
    /** <code>documentoGcrearpatrIdDocEnGestor</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOCUMENTOGCREARPATRIDDOCENGESTOR = "Clas_1434446200832109Ser_1Arg_11_Alias";
    /** <code>documentoGcrearpatrIdDocEnGestor</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOCUMENTOGCREARPATRIDDOCENGESTOR = "Id. En Gestor";
    /** <code>documentoGcrearpatrUsuarioCreador</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOCUMENTOGCREARPATRUSUARIOCREADOR = "p_atrUsuarioCreador";
    /** <code>documentoGcrearpatrUsuarioCreador</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOCUMENTOGCREARPATRUSUARIOCREADOR = "Clas_1434446200832109Ser_1Arg_19_Alias";
    /** <code>documentoGcrearpatrUsuarioCreador</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOCUMENTOGCREARPATRUSUARIOCREADOR = "Usuario";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1434446200832109Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>documentoGeliminarpthisDocumentoG</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_DOCUMENTOGELIMINARPTHISDOCUMENTOG = "p_thisDocumentoG";
    /** <code>documentoGeliminarpthisDocumentoG</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_DOCUMENTOGELIMINARPTHISDOCUMENTOG = "Clas_1434446200832109Ser_2Arg_1_Alias";
    /** <code>documentoGeliminarpthisDocumentoG</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_DOCUMENTOGELIMINARPTHISDOCUMENTOG = "Documento gestor";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1434446200832109Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar documento";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>documentoGmodificarpthisDocumentoG</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_DOCUMENTOGMODIFICARPTHISDOCUMENTOG = "p_thisDocumentoG";
    /** <code>documentoGmodificarpthisDocumentoG</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_DOCUMENTOGMODIFICARPTHISDOCUMENTOG = "Clas_1434446200832109Ser_3Arg_1_Alias";
    /** <code>documentoGmodificarpthisDocumentoG</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_DOCUMENTOGMODIFICARPTHISDOCUMENTOG = "Documento gestor";
    /** <code>documentoGmodificarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_DOCUMENTOGMODIFICARPDESCRIPCION = "p_Descripcion";
    /** <code>documentoGmodificarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_DOCUMENTOGMODIFICARPDESCRIPCION = "Clas_1434446200832109Ser_3Arg_2_Alias";
    /** <code>documentoGmodificarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_DOCUMENTOGMODIFICARPDESCRIPCION = "Descripción";
    /** <code>documentoGmodificarpTipo</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_DOCUMENTOGMODIFICARPTIPO = "p_Tipo";
    /** <code>documentoGmodificarpTipo</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_DOCUMENTOGMODIFICARPTIPO = "Clas_1434446200832109Ser_3Arg_3_Alias";
    /** <code>documentoGmodificarpTipo</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_DOCUMENTOGMODIFICARPTIPO = "Tipo";
    /** <code>documentoGmodificarpEstado</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_DOCUMENTOGMODIFICARPESTADO = "p_Estado";
    /** <code>documentoGmodificarpEstado</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_DOCUMENTOGMODIFICARPESTADO = "Clas_1434446200832109Ser_3Arg_6_Alias";
    /** <code>documentoGmodificarpEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_DOCUMENTOGMODIFICARPESTADO = "Estado";
    /** <code>documentoGmodificarpFechaSubida</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_DOCUMENTOGMODIFICARPFECHASUBIDA = "p_FechaSubida";
    /** <code>documentoGmodificarpFechaSubida</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_DOCUMENTOGMODIFICARPFECHASUBIDA = "Clas_1434446200832109Ser_3Arg_7_Alias";
    /** <code>documentoGmodificarpFechaSubida</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_DOCUMENTOGMODIFICARPFECHASUBIDA = "Fecha subida gestor";
    // Service (aprobar)
    /** <code>aprobar</code> service id. */
    public static final String SERV_ID_APROBAR = "Clas_1434446200832109Ser_8_Alias";
    /** <code>aprobar</code> service name. */
    public static final String SERV_NAME_APROBAR = "aprobar";
    /** <code>aprobar</code> service alias. */
    public static final String SERV_ALIAS_APROBAR = "Aprobar documento";
    /** Agents allowed to execute the service aprobar **/
    public static final String APROBAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>documentoGaprobarpthisDocumentoG</code> inbound argument name. */
    public static final String ARG_NAME_APROBAR_DOCUMENTOGAPROBARPTHISDOCUMENTOG = "p_thisDocumentoG";
    /** <code>documentoGaprobarpthisDocumentoG</code> inbound argument id. */
    public static final String ARG_ID_APROBAR_DOCUMENTOGAPROBARPTHISDOCUMENTOG = "Clas_1434446200832109Ser_8Arg_1_Alias";
    /** <code>documentoGaprobarpthisDocumentoG</code> inbound argument alias. */
    public static final String ARG_ALIAS_APROBAR_DOCUMENTOGAPROBARPTHISDOCUMENTOG = "Documento gestor";
    // Service (devolver)
    /** <code>devolver</code> service id. */
    public static final String SERV_ID_DEVOLVER = "Clas_1434446200832109Ser_9_Alias";
    /** <code>devolver</code> service name. */
    public static final String SERV_NAME_DEVOLVER = "devolver";
    /** <code>devolver</code> service alias. */
    public static final String SERV_ALIAS_DEVOLVER = "Devolver documento";
    /** Agents allowed to execute the service devolver **/
    public static final String DEVOLVER_SRVAGENTS = "";
    // Inbound arguments
    /** <code>documentoGdevolverpthisDocumentoG</code> inbound argument name. */
    public static final String ARG_NAME_DEVOLVER_DOCUMENTOGDEVOLVERPTHISDOCUMENTOG = "p_thisDocumentoG";
    /** <code>documentoGdevolverpthisDocumentoG</code> inbound argument id. */
    public static final String ARG_ID_DEVOLVER_DOCUMENTOGDEVOLVERPTHISDOCUMENTOG = "Clas_1434446200832109Ser_9Arg_1_Alias";
    /** <code>documentoGdevolverpthisDocumentoG</code> inbound argument alias. */
    public static final String ARG_ALIAS_DEVOLVER_DOCUMENTOGDEVOLVERPTHISDOCUMENTOG = "Documento gestor";
    // Service (enviarEmailDocDevuelto)
    /** <code>enviarEmailDocDevuelto</code> service id. */
    public static final String SERV_ID_ENVIAREMAILDOCDEVUELTO = "Clas_1434446200832109Ser_13_Alias";
    /** <code>enviarEmailDocDevuelto</code> service name. */
    public static final String SERV_NAME_ENVIAREMAILDOCDEVUELTO = "enviarEmailDocDevuelto";
    /** <code>enviarEmailDocDevuelto</code> service alias. */
    public static final String SERV_ALIAS_ENVIAREMAILDOCDEVUELTO = "enviarEmailDocDevuelto";
    /** Agents allowed to execute the service enviarEmailDocDevuelto **/
    public static final String ENVIAREMAILDOCDEVUELTO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>documentoGenviarEmailDocDevueltopthisDocumentoG</code> inbound argument name. */
    public static final String ARG_NAME_ENVIAREMAILDOCDEVUELTO_DOCUMENTOGENVIAREMAILDOCDEVUELTOPTHISDOCUMENTOG = "p_thisDocumentoG";
    /** <code>documentoGenviarEmailDocDevueltopthisDocumentoG</code> inbound argument id. */
    public static final String ARG_ID_ENVIAREMAILDOCDEVUELTO_DOCUMENTOGENVIAREMAILDOCDEVUELTOPTHISDOCUMENTOG = "Clas_1434446200832109Ser_13Arg_1_Alias";
    /** <code>documentoGenviarEmailDocDevueltopthisDocumentoG</code> inbound argument alias. */
    public static final String ARG_ALIAS_ENVIAREMAILDOCDEVUELTO_DOCUMENTOGENVIAREMAILDOCDEVUELTOPTHISDOCUMENTOG = "Documento gestor";
    /** <code>documentoGenviarEmailDocDevueltoptpatrObservacions</code> inbound argument name. */
    public static final String ARG_NAME_ENVIAREMAILDOCDEVUELTO_DOCUMENTOGENVIAREMAILDOCDEVUELTOPTPATROBSERVACIONS = "pt_p_atrObservacions";
    /** <code>documentoGenviarEmailDocDevueltoptpatrObservacions</code> inbound argument id. */
    public static final String ARG_ID_ENVIAREMAILDOCDEVUELTO_DOCUMENTOGENVIAREMAILDOCDEVUELTOPTPATROBSERVACIONS = "Clas_1434446200832109Ser_13Arg_2_Alias";
    /** <code>documentoGenviarEmailDocDevueltoptpatrObservacions</code> inbound argument alias. */
    public static final String ARG_ALIAS_ENVIAREMAILDOCDEVUELTO_DOCUMENTOGENVIAREMAILDOCDEVUELTOPTPATROBSERVACIONS = "Observaciones";
    /** <code>documentoGenviarEmailDocDevueltopePlantilla</code> inbound argument name. */
    public static final String ARG_NAME_ENVIAREMAILDOCDEVUELTO_DOCUMENTOGENVIAREMAILDOCDEVUELTOPEPLANTILLA = "pePlantilla";
    /** <code>documentoGenviarEmailDocDevueltopePlantilla</code> inbound argument id. */
    public static final String ARG_ID_ENVIAREMAILDOCDEVUELTO_DOCUMENTOGENVIAREMAILDOCDEVUELTOPEPLANTILLA = "Clas_1434446200832109Ser_13Arg_3_Alias";
    /** <code>documentoGenviarEmailDocDevueltopePlantilla</code> inbound argument alias. */
    public static final String ARG_ALIAS_ENVIAREMAILDOCDEVUELTO_DOCUMENTOGENVIAREMAILDOCDEVUELTOPEPLANTILLA = "Plantilla email";
    // Service (ponerNombreDocumento)
    /** <code>ponerNombreDocumento</code> service id. */
    public static final String SERV_ID_PONERNOMBREDOCUMENTO = "Clas_1434446200832109Ser_17_Alias";
    /** <code>ponerNombreDocumento</code> service name. */
    public static final String SERV_NAME_PONERNOMBREDOCUMENTO = "ponerNombreDocumento";
    /** <code>ponerNombreDocumento</code> service alias. */
    public static final String SERV_ALIAS_PONERNOMBREDOCUMENTO = "ponerNombreDocumento";
    /** Agents allowed to execute the service ponerNombreDocumento **/
    public static final String PONERNOMBREDOCUMENTO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>documentoGponerNombreDocumentopthisDocumentoG</code> inbound argument name. */
    public static final String ARG_NAME_PONERNOMBREDOCUMENTO_DOCUMENTOGPONERNOMBREDOCUMENTOPTHISDOCUMENTOG = "p_thisDocumentoG";
    /** <code>documentoGponerNombreDocumentopthisDocumentoG</code> inbound argument id. */
    public static final String ARG_ID_PONERNOMBREDOCUMENTO_DOCUMENTOGPONERNOMBREDOCUMENTOPTHISDOCUMENTOG = "Clas_1434446200832109Ser_17Arg_1_Alias";
    /** <code>documentoGponerNombreDocumentopthisDocumentoG</code> inbound argument alias. */
    public static final String ARG_ALIAS_PONERNOMBREDOCUMENTO_DOCUMENTOGPONERNOMBREDOCUMENTOPTHISDOCUMENTOG = "Documento gestor";
    /** <code>documentoGponerNombreDocumentopNombre</code> inbound argument name. */
    public static final String ARG_NAME_PONERNOMBREDOCUMENTO_DOCUMENTOGPONERNOMBREDOCUMENTOPNOMBRE = "p_Nombre";
    /** <code>documentoGponerNombreDocumentopNombre</code> inbound argument id. */
    public static final String ARG_ID_PONERNOMBREDOCUMENTO_DOCUMENTOGPONERNOMBREDOCUMENTOPNOMBRE = "Clas_1434446200832109Ser_17Arg_2_Alias";
    /** <code>documentoGponerNombreDocumentopNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_PONERNOMBREDOCUMENTO_DOCUMENTOGPONERNOMBREDOCUMENTOPNOMBRE = "Nombre";
    /** <code>documentoGponerNombreDocumentopExtension</code> inbound argument name. */
    public static final String ARG_NAME_PONERNOMBREDOCUMENTO_DOCUMENTOGPONERNOMBREDOCUMENTOPEXTENSION = "p_Extension";
    /** <code>documentoGponerNombreDocumentopExtension</code> inbound argument id. */
    public static final String ARG_ID_PONERNOMBREDOCUMENTO_DOCUMENTOGPONERNOMBREDOCUMENTOPEXTENSION = "Clas_1434446200832109Ser_17Arg_3_Alias";
    /** <code>documentoGponerNombreDocumentopExtension</code> inbound argument alias. */
    public static final String ARG_ALIAS_PONERNOMBREDOCUMENTO_DOCUMENTOGPONERNOMBREDOCUMENTOPEXTENSION = "Extensión";
    // Service (verDetalles)
    /** <code>verDetalles</code> service id. */
    public static final String SERV_ID_VERDETALLES = "Clas_1434446200832109Ser_19_Alias";
    /** <code>verDetalles</code> service name. */
    public static final String SERV_NAME_VERDETALLES = "verDetalles";
    /** <code>verDetalles</code> service alias. */
    public static final String SERV_ALIAS_VERDETALLES = "verDetalles";
    /** Agents allowed to execute the service verDetalles **/
    public static final String VERDETALLES_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    // Inbound arguments
    /** <code>documentoGverDetallespthisDocumentoG</code> inbound argument name. */
    public static final String ARG_NAME_VERDETALLES_DOCUMENTOGVERDETALLESPTHISDOCUMENTOG = "p_thisDocumentoG";
    /** <code>documentoGverDetallespthisDocumentoG</code> inbound argument id. */
    public static final String ARG_ID_VERDETALLES_DOCUMENTOGVERDETALLESPTHISDOCUMENTOG = "Clas_1434446200832109Ser_19Arg_1_Alias";
    /** <code>documentoGverDetallespthisDocumentoG</code> inbound argument alias. */
    public static final String ARG_ALIAS_VERDETALLES_DOCUMENTOGVERDETALLESPTHISDOCUMENTOG = "Documento gestor";
    // Service (sustituir)
    /** <code>sustituir</code> service id. */
    public static final String SERV_ID_SUSTITUIR = "Clas_1434446200832109Ser_23_Alias";
    /** <code>sustituir</code> service name. */
    public static final String SERV_NAME_SUSTITUIR = "sustituir";
    /** <code>sustituir</code> service alias. */
    public static final String SERV_ALIAS_SUSTITUIR = "sustituir";
    /** Agents allowed to execute the service sustituir **/
    public static final String SUSTITUIR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>documentoGsustituirpthisDocumentoG</code> inbound argument name. */
    public static final String ARG_NAME_SUSTITUIR_DOCUMENTOGSUSTITUIRPTHISDOCUMENTOG = "p_thisDocumentoG";
    /** <code>documentoGsustituirpthisDocumentoG</code> inbound argument id. */
    public static final String ARG_ID_SUSTITUIR_DOCUMENTOGSUSTITUIRPTHISDOCUMENTOG = "Clas_1434446200832109Ser_23Arg_1_Alias";
    /** <code>documentoGsustituirpthisDocumentoG</code> inbound argument alias. */
    public static final String ARG_ALIAS_SUSTITUIR_DOCUMENTOGSUSTITUIRPTHISDOCUMENTOG = "Documento gestor";
    // Service (setFechaSubida)
    /** <code>setFechaSubida</code> service id. */
    public static final String SERV_ID_SETFECHASUBIDA = "Clas_1434446200832109Ser_24_Alias";
    /** <code>setFechaSubida</code> service name. */
    public static final String SERV_NAME_SETFECHASUBIDA = "setFechaSubida";
    /** <code>setFechaSubida</code> service alias. */
    public static final String SERV_ALIAS_SETFECHASUBIDA = "setFechaSubida";
    /** Agents allowed to execute the service setFechaSubida **/
    public static final String SETFECHASUBIDA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>documentoGsetFechaSubidapthisDocumentoG</code> inbound argument name. */
    public static final String ARG_NAME_SETFECHASUBIDA_DOCUMENTOGSETFECHASUBIDAPTHISDOCUMENTOG = "p_thisDocumentoG";
    /** <code>documentoGsetFechaSubidapthisDocumentoG</code> inbound argument id. */
    public static final String ARG_ID_SETFECHASUBIDA_DOCUMENTOGSETFECHASUBIDAPTHISDOCUMENTOG = "Clas_1434446200832109Ser_24Arg_1_Alias";
    /** <code>documentoGsetFechaSubidapthisDocumentoG</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETFECHASUBIDA_DOCUMENTOGSETFECHASUBIDAPTHISDOCUMENTOG = "Documento gestor";
    /** <code>documentoGsetFechaSubidapeFechaHora</code> inbound argument name. */
    public static final String ARG_NAME_SETFECHASUBIDA_DOCUMENTOGSETFECHASUBIDAPEFECHAHORA = "peFechaHora";
    /** <code>documentoGsetFechaSubidapeFechaHora</code> inbound argument id. */
    public static final String ARG_ID_SETFECHASUBIDA_DOCUMENTOGSETFECHASUBIDAPEFECHAHORA = "Clas_1434446200832109Ser_24Arg_2_Alias";
    /** <code>documentoGsetFechaSubidapeFechaHora</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETFECHASUBIDA_DOCUMENTOGSETFECHASUBIDAPEFECHAHORA = "Fecha subida gestor";
    // Service (previsualizarATO)
    /** <code>previsualizarATO</code> service id. */
    public static final String SERV_ID_PREVISUALIZARATO = "Clas_1434446200832109Ser_25_Alias";
    /** <code>previsualizarATO</code> service name. */
    public static final String SERV_NAME_PREVISUALIZARATO = "previsualizarATO";
    /** <code>previsualizarATO</code> service alias. */
    public static final String SERV_ALIAS_PREVISUALIZARATO = "Previsualizar";
    /** Agents allowed to execute the service previsualizarATO **/
    public static final String PREVISUALIZARATO_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Preconditions
    /** <code>previsualizarATO</code> precondition 0 id. */
    public static final String PRE_ID_PREVISUALIZARATO_0 = "Clas_1434446200832109Pre_14_MsgError";
    /** <code>previsualizarATO</code> precondition 1 id. */
    public static final String PRE_ID_PREVISUALIZARATO_1 = "Clas_1434446200832109Pre_15_MsgError";
    // Inbound arguments
    /** <code>documentoGprevisualizarATOpthisDocumentoG</code> inbound argument name. */
    public static final String ARG_NAME_PREVISUALIZARATO_DOCUMENTOGPREVISUALIZARATOPTHISDOCUMENTOG = "p_thisDocumentoG";
    /** <code>documentoGprevisualizarATOpthisDocumentoG</code> inbound argument id. */
    public static final String ARG_ID_PREVISUALIZARATO_DOCUMENTOGPREVISUALIZARATOPTHISDOCUMENTOG = "Clas_1434446200832109Ser_25Arg_1_Alias";
    /** <code>documentoGprevisualizarATOpthisDocumentoG</code> inbound argument alias. */
    public static final String ARG_ALIAS_PREVISUALIZARATO_DOCUMENTOGPREVISUALIZARATOPTHISDOCUMENTOG = "Documento gestor";
    // Outbound arguments
    /** <code>documentoGprevisualizarATOoaToken</code> outbound argument name. */
    public static final String ARG_NAME_PREVISUALIZARATO_DOCUMENTOGPREVISUALIZARATOOATOKEN = "documentoGprevisualizarATOoaToken";
    /** <code>documentoGprevisualizarATOoaToken</code> outbound argument id. */
    public static final String ARG_ID_PREVISUALIZARATO_DOCUMENTOGPREVISUALIZARATOOATOKEN = "Clas_1434446200832109Ser_25Arg_2_Alias";
    /** <code>documentoGprevisualizarATOoaToken</code> outbound argument alias. */
    public static final String ARG_ALIAS_PREVISUALIZARATO_DOCUMENTOGPREVISUALIZARATOOATOKEN = "oaToken";
    /** <code>documentoGprevisualizarATOoaURLDescarga</code> outbound argument name. */
    public static final String ARG_NAME_PREVISUALIZARATO_DOCUMENTOGPREVISUALIZARATOOAURLDESCARGA = "documentoGprevisualizarATOoaURLDescarga";
    /** <code>documentoGprevisualizarATOoaURLDescarga</code> outbound argument id. */
    public static final String ARG_ID_PREVISUALIZARATO_DOCUMENTOGPREVISUALIZARATOOAURLDESCARGA = "Clas_1434446200832109Ser_25Arg_3_Alias";
    /** <code>documentoGprevisualizarATOoaURLDescarga</code> outbound argument alias. */
    public static final String ARG_ALIAS_PREVISUALIZARATO_DOCUMENTOGPREVISUALIZARATOOAURLDESCARGA = "oaURLDescarga";
    /** <code>documentoGprevisualizarATOoaNumSolicitud</code> outbound argument name. */
    public static final String ARG_NAME_PREVISUALIZARATO_DOCUMENTOGPREVISUALIZARATOOANUMSOLICITUD = "documentoGprevisualizarATOoaNumSolicitud";
    /** <code>documentoGprevisualizarATOoaNumSolicitud</code> outbound argument id. */
    public static final String ARG_ID_PREVISUALIZARATO_DOCUMENTOGPREVISUALIZARATOOANUMSOLICITUD = "Clas_1434446200832109Ser_25Arg_4_Alias";
    /** <code>documentoGprevisualizarATOoaNumSolicitud</code> outbound argument alias. */
    public static final String ARG_ALIAS_PREVISUALIZARATO_DOCUMENTOGPREVISUALIZARATOOANUMSOLICITUD = "oaNumSolicitud";
    // Service (subirDocumentoGestorATO)
    /** <code>subirDocumentoGestorATO</code> service id. */
    public static final String SERV_ID_SUBIRDOCUMENTOGESTORATO = "Clas_1434446200832109Ser_26_Alias";
    /** <code>subirDocumentoGestorATO</code> service name. */
    public static final String SERV_NAME_SUBIRDOCUMENTOGESTORATO = "subirDocumentoGestorATO";
    /** <code>subirDocumentoGestorATO</code> service alias. */
    public static final String SERV_ALIAS_SUBIRDOCUMENTOGESTORATO = "subirDocumentoGestorATO";
    /** Agents allowed to execute the service subirDocumentoGestorATO **/
    public static final String SUBIRDOCUMENTOGESTORATO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>documentoGsubirDocumentoGestorATOpthisDocumentoG</code> inbound argument name. */
    public static final String ARG_NAME_SUBIRDOCUMENTOGESTORATO_DOCUMENTOGSUBIRDOCUMENTOGESTORATOPTHISDOCUMENTOG = "p_thisDocumentoG";
    /** <code>documentoGsubirDocumentoGestorATOpthisDocumentoG</code> inbound argument id. */
    public static final String ARG_ID_SUBIRDOCUMENTOGESTORATO_DOCUMENTOGSUBIRDOCUMENTOGESTORATOPTHISDOCUMENTOG = "Clas_1434446200832109Ser_26Arg_1_Alias";
    /** <code>documentoGsubirDocumentoGestorATOpthisDocumentoG</code> inbound argument alias. */
    public static final String ARG_ALIAS_SUBIRDOCUMENTOGESTORATO_DOCUMENTOGSUBIRDOCUMENTOGESTORATOPTHISDOCUMENTOG = "Documento gestor";
    /** <code>documentoGsubirDocumentoGestorATOpExtension</code> inbound argument name. */
    public static final String ARG_NAME_SUBIRDOCUMENTOGESTORATO_DOCUMENTOGSUBIRDOCUMENTOGESTORATOPEXTENSION = "p_Extension";
    /** <code>documentoGsubirDocumentoGestorATOpExtension</code> inbound argument id. */
    public static final String ARG_ID_SUBIRDOCUMENTOGESTORATO_DOCUMENTOGSUBIRDOCUMENTOGESTORATOPEXTENSION = "Clas_1434446200832109Ser_26Arg_2_Alias";
    /** <code>documentoGsubirDocumentoGestorATOpExtension</code> inbound argument alias. */
    public static final String ARG_ALIAS_SUBIRDOCUMENTOGESTORATO_DOCUMENTOGSUBIRDOCUMENTOGESTORATOPEXTENSION = "Extensión";
    /** <code>documentoGsubirDocumentoGestorATOpIdDocGestor</code> inbound argument name. */
    public static final String ARG_NAME_SUBIRDOCUMENTOGESTORATO_DOCUMENTOGSUBIRDOCUMENTOGESTORATOPIDDOCGESTOR = "pIdDocGestor";
    /** <code>documentoGsubirDocumentoGestorATOpIdDocGestor</code> inbound argument id. */
    public static final String ARG_ID_SUBIRDOCUMENTOGESTORATO_DOCUMENTOGSUBIRDOCUMENTOGESTORATOPIDDOCGESTOR = "Clas_1434446200832109Ser_26Arg_3_Alias";
    /** <code>documentoGsubirDocumentoGestorATOpIdDocGestor</code> inbound argument alias. */
    public static final String ARG_ALIAS_SUBIRDOCUMENTOGESTORATO_DOCUMENTOGSUBIRDOCUMENTOGESTORATOPIDDOCGESTOR = "Id. En Gestor";
    /** <code>documentoGsubirDocumentoGestorATOpNombre</code> inbound argument name. */
    public static final String ARG_NAME_SUBIRDOCUMENTOGESTORATO_DOCUMENTOGSUBIRDOCUMENTOGESTORATOPNOMBRE = "pNombre";
    /** <code>documentoGsubirDocumentoGestorATOpNombre</code> inbound argument id. */
    public static final String ARG_ID_SUBIRDOCUMENTOGESTORATO_DOCUMENTOGSUBIRDOCUMENTOGESTORATOPNOMBRE = "Clas_1434446200832109Ser_26Arg_4_Alias";
    /** <code>documentoGsubirDocumentoGestorATOpNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_SUBIRDOCUMENTOGESTORATO_DOCUMENTOGSUBIRDOCUMENTOGESTORATOPNOMBRE = "Archivo adjunto";
    // Service (TAPROBAR)
    /** <code>TAPROBAR</code> service id. */
    public static final String SERV_ID_TAPROBAR = "Clas_1434446200832109Ser_11_Alias";
    /** <code>TAPROBAR</code> service name. */
    public static final String SERV_NAME_TAPROBAR = "TAPROBAR";
    /** <code>TAPROBAR</code> service alias. */
    public static final String SERV_ALIAS_TAPROBAR = "Aprobar documento";
    /** Agents allowed to execute the service TAPROBAR **/
    public static final String TAPROBAR_SRVAGENTS = "SuperAdmin,AreaMedica,Afiliaciones,MesaDeApoyo";
    // Preconditions
    /** <code>TAPROBAR</code> precondition 0 id. */
    public static final String PRE_ID_TAPROBAR_0 = "Clas_1434446200832109Pre_3_MsgError";
    /** <code>TAPROBAR</code> precondition 1 id. */
    public static final String PRE_ID_TAPROBAR_1 = "Clas_1434446200832109Pre_10_MsgError";
    // Inbound arguments
    /** <code>documentoGTAPROBARpthisDocumentoG</code> inbound argument name. */
    public static final String ARG_NAME_TAPROBAR_DOCUMENTOGTAPROBARPTHISDOCUMENTOG = "p_thisDocumentoG";
    /** <code>documentoGTAPROBARpthisDocumentoG</code> inbound argument id. */
    public static final String ARG_ID_TAPROBAR_DOCUMENTOGTAPROBARPTHISDOCUMENTOG = "Clas_1434446200832109Ser_11Arg_1_Alias";
    /** <code>documentoGTAPROBARpthisDocumentoG</code> inbound argument alias. */
    public static final String ARG_ALIAS_TAPROBAR_DOCUMENTOGTAPROBARPTHISDOCUMENTOG = "Documento gestor";
    /** <code>documentoGTAPROBARptpatrObservacions</code> inbound argument name. */
    public static final String ARG_NAME_TAPROBAR_DOCUMENTOGTAPROBARPTPATROBSERVACIONS = "pt_p_atrObservacions";
    /** <code>documentoGTAPROBARptpatrObservacions</code> inbound argument id. */
    public static final String ARG_ID_TAPROBAR_DOCUMENTOGTAPROBARPTPATROBSERVACIONS = "Clas_1434446200832109Ser_11Arg_4_Alias";
    /** <code>documentoGTAPROBARptpatrObservacions</code> inbound argument alias. */
    public static final String ARG_ALIAS_TAPROBAR_DOCUMENTOGTAPROBARPTPATROBSERVACIONS = "Observaciones";
    // Service (TDEVOLVER)
    /** <code>TDEVOLVER</code> service id. */
    public static final String SERV_ID_TDEVOLVER = "Clas_1434446200832109Ser_12_Alias";
    /** <code>TDEVOLVER</code> service name. */
    public static final String SERV_NAME_TDEVOLVER = "TDEVOLVER";
    /** <code>TDEVOLVER</code> service alias. */
    public static final String SERV_ALIAS_TDEVOLVER = "Devolver documento";
    /** Agents allowed to execute the service TDEVOLVER **/
    public static final String TDEVOLVER_SRVAGENTS = "SuperAdmin,AreaMedica,Afiliaciones,MesaDeApoyo";
    // Preconditions
    /** <code>TDEVOLVER</code> precondition 0 id. */
    public static final String PRE_ID_TDEVOLVER_0 = "Clas_1434446200832109Pre_4_MsgError";
    /** <code>TDEVOLVER</code> precondition 1 id. */
    public static final String PRE_ID_TDEVOLVER_1 = "Clas_1434446200832109Pre_5_MsgError";
    /** <code>TDEVOLVER</code> precondition 2 id. */
    public static final String PRE_ID_TDEVOLVER_2 = "Clas_1434446200832109Pre_11_MsgError";
    // Inbound arguments
    /** <code>documentoGTDEVOLVERpthisDocumentoG</code> inbound argument name. */
    public static final String ARG_NAME_TDEVOLVER_DOCUMENTOGTDEVOLVERPTHISDOCUMENTOG = "p_thisDocumentoG";
    /** <code>documentoGTDEVOLVERpthisDocumentoG</code> inbound argument id. */
    public static final String ARG_ID_TDEVOLVER_DOCUMENTOGTDEVOLVERPTHISDOCUMENTOG = "Clas_1434446200832109Ser_12Arg_1_Alias";
    /** <code>documentoGTDEVOLVERpthisDocumentoG</code> inbound argument alias. */
    public static final String ARG_ALIAS_TDEVOLVER_DOCUMENTOGTDEVOLVERPTHISDOCUMENTOG = "Documento gestor";
    /** <code>documentoGTDEVOLVERptpatrObservacions</code> inbound argument name. */
    public static final String ARG_NAME_TDEVOLVER_DOCUMENTOGTDEVOLVERPTPATROBSERVACIONS = "pt_p_atrObservacions";
    /** <code>documentoGTDEVOLVERptpatrObservacions</code> inbound argument id. */
    public static final String ARG_ID_TDEVOLVER_DOCUMENTOGTDEVOLVERPTPATROBSERVACIONS = "Clas_1434446200832109Ser_12Arg_4_Alias";
    /** <code>documentoGTDEVOLVERptpatrObservacions</code> inbound argument alias. */
    public static final String ARG_ALIAS_TDEVOLVER_DOCUMENTOGTDEVOLVERPTPATROBSERVACIONS = "Observaciones";
    // Outbound arguments
    /** <code>documentoGTDEVOLVERoaPlantilla</code> outbound argument name. */
    public static final String ARG_NAME_TDEVOLVER_DOCUMENTOGTDEVOLVEROAPLANTILLA = "documentoGTDEVOLVERoaPlantilla";
    /** <code>documentoGTDEVOLVERoaPlantilla</code> outbound argument id. */
    public static final String ARG_ID_TDEVOLVER_DOCUMENTOGTDEVOLVEROAPLANTILLA = "Clas_1434446200832109Ser_12Arg_7_Alias";
    /** <code>documentoGTDEVOLVERoaPlantilla</code> outbound argument alias. */
    public static final String ARG_ALIAS_TDEVOLVER_DOCUMENTOGTDEVOLVEROAPLANTILLA = "Plantilla email";
    // Service (TCREAR)
    /** <code>TCREAR</code> service id. */
    public static final String SERV_ID_TCREAR = "Clas_1434446200832109Ser_18_Alias";
    /** <code>TCREAR</code> service name. */
    public static final String SERV_NAME_TCREAR = "TCREAR";
    /** <code>TCREAR</code> service alias. */
    public static final String SERV_ALIAS_TCREAR = "Crear documento";
    /** Agents allowed to execute the service TCREAR **/
    public static final String TCREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>documentoGTCREARptpagrSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_DOCUMENTOGTCREARPTPAGRSOLICITUD = "pt_p_agrSolicitud";
    /** <code>documentoGTCREARptpagrSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_DOCUMENTOGTCREARPTPAGRSOLICITUD = "Clas_1434446200832109Ser_18Arg_3_Alias";
    /** <code>documentoGTCREARptpagrSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_DOCUMENTOGTCREARPTPAGRSOLICITUD = "Solicitud";
    /** <code>documentoGTCREARptpagrPersona</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_DOCUMENTOGTCREARPTPAGRPERSONA = "pt_p_agrPersona";
    /** <code>documentoGTCREARptpagrPersona</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_DOCUMENTOGTCREARPTPAGRPERSONA = "Clas_1434446200832109Ser_18Arg_4_Alias";
    /** <code>documentoGTCREARptpagrPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_DOCUMENTOGTCREARPTPAGRPERSONA = "Persona";
    /** <code>documentoGTCREARptpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_DOCUMENTOGTCREARPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    /** <code>documentoGTCREARptpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_DOCUMENTOGTCREARPTPATRDESCRIPCION = "Clas_1434446200832109Ser_18Arg_5_Alias";
    /** <code>documentoGTCREARptpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_DOCUMENTOGTCREARPTPATRDESCRIPCION = "Descripción";
    /** <code>documentoGTCREARptpatrTipo</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_DOCUMENTOGTCREARPTPATRTIPO = "pt_p_atrTipo";
    /** <code>documentoGTCREARptpatrTipo</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_DOCUMENTOGTCREARPTPATRTIPO = "Clas_1434446200832109Ser_18Arg_6_Alias";
    /** <code>documentoGTCREARptpatrTipo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_DOCUMENTOGTCREARPTPATRTIPO = "Tipo";
    /** <code>documentoGTCREARptpatrEstado</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_DOCUMENTOGTCREARPTPATRESTADO = "pt_p_atrEstado";
    /** <code>documentoGTCREARptpatrEstado</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_DOCUMENTOGTCREARPTPATRESTADO = "Clas_1434446200832109Ser_18Arg_7_Alias";
    /** <code>documentoGTCREARptpatrEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_DOCUMENTOGTCREARPTPATRESTADO = "Estado";
    /** <code>documentoGTCREARptpatrFechaSubida</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_DOCUMENTOGTCREARPTPATRFECHASUBIDA = "pt_p_atrFechaSubida";
    /** <code>documentoGTCREARptpatrFechaSubida</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_DOCUMENTOGTCREARPTPATRFECHASUBIDA = "Clas_1434446200832109Ser_18Arg_8_Alias";
    /** <code>documentoGTCREARptpatrFechaSubida</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_DOCUMENTOGTCREARPTPATRFECHASUBIDA = "Fecha subida gestor";
    /** <code>documentoGTCREARptpatrIdDocEnGestor</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_DOCUMENTOGTCREARPTPATRIDDOCENGESTOR = "pt_p_atrIdDocEnGestor";
    /** <code>documentoGTCREARptpatrIdDocEnGestor</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_DOCUMENTOGTCREARPTPATRIDDOCENGESTOR = "Clas_1434446200832109Ser_18Arg_9_Alias";
    /** <code>documentoGTCREARptpatrIdDocEnGestor</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_DOCUMENTOGTCREARPTPATRIDDOCENGESTOR = "Id. En Gestor";
    /** <code>documentoGTCREARptpNombre</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_DOCUMENTOGTCREARPTPNOMBRE = "pt_p_Nombre";
    /** <code>documentoGTCREARptpNombre</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_DOCUMENTOGTCREARPTPNOMBRE = "Clas_1434446200832109Ser_18Arg_11_Alias";
    /** <code>documentoGTCREARptpNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_DOCUMENTOGTCREARPTPNOMBRE = "Nombre";
    /** <code>documentoGTCREARptpExtension</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_DOCUMENTOGTCREARPTPEXTENSION = "pt_p_Extension";
    /** <code>documentoGTCREARptpExtension</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_DOCUMENTOGTCREARPTPEXTENSION = "Clas_1434446200832109Ser_18Arg_16_Alias";
    /** <code>documentoGTCREARptpExtension</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_DOCUMENTOGTCREARPTPEXTENSION = "Extensión";
    // Service (TELIMINAR)
    /** <code>TELIMINAR</code> service id. */
    public static final String SERV_ID_TELIMINAR = "Clas_1434446200832109Ser_20_Alias";
    /** <code>TELIMINAR</code> service name. */
    public static final String SERV_NAME_TELIMINAR = "TELIMINAR";
    /** <code>TELIMINAR</code> service alias. */
    public static final String SERV_ALIAS_TELIMINAR = "TELIMINAR";
    /** Agents allowed to execute the service TELIMINAR **/
    public static final String TELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>documentoGTELIMINARpthisDocumentoG</code> inbound argument name. */
    public static final String ARG_NAME_TELIMINAR_DOCUMENTOGTELIMINARPTHISDOCUMENTOG = "p_thisDocumentoG";
    /** <code>documentoGTELIMINARpthisDocumentoG</code> inbound argument id. */
    public static final String ARG_ID_TELIMINAR_DOCUMENTOGTELIMINARPTHISDOCUMENTOG = "Clas_1434446200832109Ser_20Arg_1_Alias";
    /** <code>documentoGTELIMINARpthisDocumentoG</code> inbound argument alias. */
    public static final String ARG_ALIAS_TELIMINAR_DOCUMENTOGTELIMINARPTHISDOCUMENTOG = "Documento gestor";
    // Service (TNEWATO)
    /** <code>TNEWATO</code> service id. */
    public static final String SERV_ID_TNEWATO = "Clas_1434446200832109Ser_27_Alias";
    /** <code>TNEWATO</code> service name. */
    public static final String SERV_NAME_TNEWATO = "TNEWATO";
    /** <code>TNEWATO</code> service alias. */
    public static final String SERV_ALIAS_TNEWATO = "TNEWATO";
    /** Agents allowed to execute the service TNEWATO **/
    public static final String TNEWATO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>documentoGTNEWATOptpagrPersona</code> inbound argument name. */
    public static final String ARG_NAME_TNEWATO_DOCUMENTOGTNEWATOPTPAGRPERSONA = "pt_p_agrPersona";
    /** <code>documentoGTNEWATOptpagrPersona</code> inbound argument id. */
    public static final String ARG_ID_TNEWATO_DOCUMENTOGTNEWATOPTPAGRPERSONA = "Clas_1434446200832109Ser_27Arg_2_Alias";
    /** <code>documentoGTNEWATOptpagrPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWATO_DOCUMENTOGTNEWATOPTPAGRPERSONA = "Persona";
    /** <code>documentoGTNEWATOptpagrSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TNEWATO_DOCUMENTOGTNEWATOPTPAGRSOLICITUD = "pt_p_agrSolicitud";
    /** <code>documentoGTNEWATOptpagrSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TNEWATO_DOCUMENTOGTNEWATOPTPAGRSOLICITUD = "Clas_1434446200832109Ser_27Arg_3_Alias";
    /** <code>documentoGTNEWATOptpagrSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWATO_DOCUMENTOGTNEWATOPTPAGRSOLICITUD = "Solicitud";
    /** <code>documentoGTNEWATOptpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_TNEWATO_DOCUMENTOGTNEWATOPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    /** <code>documentoGTNEWATOptpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_TNEWATO_DOCUMENTOGTNEWATOPTPATRDESCRIPCION = "Clas_1434446200832109Ser_27Arg_4_Alias";
    /** <code>documentoGTNEWATOptpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWATO_DOCUMENTOGTNEWATOPTPATRDESCRIPCION = "Descripción";
    /** <code>documentoGTNEWATOptpatrTipo</code> inbound argument name. */
    public static final String ARG_NAME_TNEWATO_DOCUMENTOGTNEWATOPTPATRTIPO = "pt_p_atrTipo";
    /** <code>documentoGTNEWATOptpatrTipo</code> inbound argument id. */
    public static final String ARG_ID_TNEWATO_DOCUMENTOGTNEWATOPTPATRTIPO = "Clas_1434446200832109Ser_27Arg_5_Alias";
    /** <code>documentoGTNEWATOptpatrTipo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWATO_DOCUMENTOGTNEWATOPTPATRTIPO = "Tipo";
    /** <code>documentoGTNEWATOptpatrEstado</code> inbound argument name. */
    public static final String ARG_NAME_TNEWATO_DOCUMENTOGTNEWATOPTPATRESTADO = "pt_p_atrEstado";
    /** <code>documentoGTNEWATOptpatrEstado</code> inbound argument id. */
    public static final String ARG_ID_TNEWATO_DOCUMENTOGTNEWATOPTPATRESTADO = "Clas_1434446200832109Ser_27Arg_6_Alias";
    /** <code>documentoGTNEWATOptpatrEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWATO_DOCUMENTOGTNEWATOPTPATRESTADO = "Estado";
    /** <code>documentoGTNEWATOptpExtension</code> inbound argument name. */
    public static final String ARG_NAME_TNEWATO_DOCUMENTOGTNEWATOPTPEXTENSION = "pt_p_Extension";
    /** <code>documentoGTNEWATOptpExtension</code> inbound argument id. */
    public static final String ARG_ID_TNEWATO_DOCUMENTOGTNEWATOPTPEXTENSION = "Clas_1434446200832109Ser_27Arg_10_Alias";
    /** <code>documentoGTNEWATOptpExtension</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWATO_DOCUMENTOGTNEWATOPTPEXTENSION = "pt_p_Extension";
    /** <code>documentoGTNEWATOpIdDocGestor</code> inbound argument name. */
    public static final String ARG_NAME_TNEWATO_DOCUMENTOGTNEWATOPIDDOCGESTOR = "pIdDocGestor";
    /** <code>documentoGTNEWATOpIdDocGestor</code> inbound argument id. */
    public static final String ARG_ID_TNEWATO_DOCUMENTOGTNEWATOPIDDOCGESTOR = "Clas_1434446200832109Ser_27Arg_11_Alias";
    /** <code>documentoGTNEWATOpIdDocGestor</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWATO_DOCUMENTOGTNEWATOPIDDOCGESTOR = "pIdDocGestor";
    /** <code>documentoGTNEWATOptNombre</code> inbound argument name. */
    public static final String ARG_NAME_TNEWATO_DOCUMENTOGTNEWATOPTNOMBRE = "ptNombre";
    /** <code>documentoGTNEWATOptNombre</code> inbound argument id. */
    public static final String ARG_ID_TNEWATO_DOCUMENTOGTNEWATOPTNOMBRE = "Clas_1434446200832109Ser_27Arg_22_Alias";
    /** <code>documentoGTNEWATOptNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWATO_DOCUMENTOGTNEWATOPTNOMBRE = "ptNombre";
    // Service (TMODIFICARATO)
    /** <code>TMODIFICARATO</code> service id. */
    public static final String SERV_ID_TMODIFICARATO = "Clas_1434446200832109Ser_28_Alias";
    /** <code>TMODIFICARATO</code> service name. */
    public static final String SERV_NAME_TMODIFICARATO = "TMODIFICARATO";
    /** <code>TMODIFICARATO</code> service alias. */
    public static final String SERV_ALIAS_TMODIFICARATO = "TMODIFICARATO";
    /** Agents allowed to execute the service TMODIFICARATO **/
    public static final String TMODIFICARATO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>documentoGTMODIFICARATOpthisDocumentoG</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARATO_DOCUMENTOGTMODIFICARATOPTHISDOCUMENTOG = "p_thisDocumentoG";
    /** <code>documentoGTMODIFICARATOpthisDocumentoG</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARATO_DOCUMENTOGTMODIFICARATOPTHISDOCUMENTOG = "Clas_1434446200832109Ser_28Arg_1_Alias";
    /** <code>documentoGTMODIFICARATOpthisDocumentoG</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARATO_DOCUMENTOGTMODIFICARATOPTHISDOCUMENTOG = "Documento gestor";
    /** <code>documentoGTMODIFICARATOptpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARATO_DOCUMENTOGTMODIFICARATOPTPDESCRIPCION = "pt_p_Descripcion";
    /** <code>documentoGTMODIFICARATOptpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARATO_DOCUMENTOGTMODIFICARATOPTPDESCRIPCION = "Clas_1434446200832109Ser_28Arg_2_Alias";
    /** <code>documentoGTMODIFICARATOptpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARATO_DOCUMENTOGTMODIFICARATOPTPDESCRIPCION = "Descripción";
    /** <code>documentoGTMODIFICARATOptpTipo</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARATO_DOCUMENTOGTMODIFICARATOPTPTIPO = "pt_p_Tipo";
    /** <code>documentoGTMODIFICARATOptpTipo</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARATO_DOCUMENTOGTMODIFICARATOPTPTIPO = "Clas_1434446200832109Ser_28Arg_3_Alias";
    /** <code>documentoGTMODIFICARATOptpTipo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARATO_DOCUMENTOGTMODIFICARATOPTPTIPO = "Tipo";
    /** <code>documentoGTMODIFICARATOptpEstado</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARATO_DOCUMENTOGTMODIFICARATOPTPESTADO = "pt_p_Estado";
    /** <code>documentoGTMODIFICARATOptpEstado</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARATO_DOCUMENTOGTMODIFICARATOPTPESTADO = "Clas_1434446200832109Ser_28Arg_4_Alias";
    /** <code>documentoGTMODIFICARATOptpEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARATO_DOCUMENTOGTMODIFICARATOPTPESTADO = "Estado";
    /** <code>documentoGTMODIFICARATOptpFechaSubida</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARATO_DOCUMENTOGTMODIFICARATOPTPFECHASUBIDA = "pt_p_FechaSubida";
    /** <code>documentoGTMODIFICARATOptpFechaSubida</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARATO_DOCUMENTOGTMODIFICARATOPTPFECHASUBIDA = "Clas_1434446200832109Ser_28Arg_5_Alias";
    /** <code>documentoGTMODIFICARATOptpFechaSubida</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARATO_DOCUMENTOGTMODIFICARATOPTPFECHASUBIDA = "Fecha subida gestor";
    /** <code>documentoGTMODIFICARATOptIdDocGestor</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARATO_DOCUMENTOGTMODIFICARATOPTIDDOCGESTOR = "ptIdDocGestor";
    /** <code>documentoGTMODIFICARATOptIdDocGestor</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARATO_DOCUMENTOGTMODIFICARATOPTIDDOCGESTOR = "Clas_1434446200832109Ser_28Arg_7_Alias";
    /** <code>documentoGTMODIFICARATOptIdDocGestor</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARATO_DOCUMENTOGTMODIFICARATOPTIDDOCGESTOR = "ptIdDocGestor";
    /** <code>documentoGTMODIFICARATOptpExtension</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARATO_DOCUMENTOGTMODIFICARATOPTPEXTENSION = "pt_p_Extension";
    /** <code>documentoGTMODIFICARATOptpExtension</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARATO_DOCUMENTOGTMODIFICARATOPTPEXTENSION = "Clas_1434446200832109Ser_28Arg_8_Alias";
    /** <code>documentoGTMODIFICARATOptpExtension</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARATO_DOCUMENTOGTMODIFICARATOPTPEXTENSION = "pt_p_Extension";
    /** <code>documentoGTMODIFICARATOptNombre</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARATO_DOCUMENTOGTMODIFICARATOPTNOMBRE = "ptNombre";
    /** <code>documentoGTMODIFICARATOptNombre</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARATO_DOCUMENTOGTMODIFICARATOPTNOMBRE = "Clas_1434446200832109Ser_28Arg_9_Alias";
    /** <code>documentoGTMODIFICARATOptNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARATO_DOCUMENTOGTMODIFICARATOPTNOMBRE = "ptNombre";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_DOCUMENTOGDESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_DOCUMENTOGTIPO.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_DOCUMENTOGESTADO.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_DOCUMENTOGFECHASUBIDA.toUpperCase(), Constants.Type.DATETIME.getTypeName());
        attributeTypes.put(ATTR_NAME_DOCUMENTOGPATHCOMPLETO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_DOCUMENTOGEXTENSION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_DOCUMENTOGNUMDESCARGAS.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_DOCUMENTOGEMAILENVIODEVUELTO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_DOCUMENTOGRESULTADOSUBIDA.toUpperCase(), Constants.Type.TEXT.getTypeName());
        attributeTypes.put(ATTR_NAME_DOCUMENTOGIDDOCENGESTOR.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_DOCUMENTOGNOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_DOCUMENTOGDRVNUMCONTRATO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_DOCUMENTOGUSUARIOCREADOR.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_DOCUMENTOGIDENTIFICADOR.toUpperCase(), DOCUMENTOGIDENTIFICADOR_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOCUMENTOGDESCRIPCION.toUpperCase(), DOCUMENTOGDESCRIPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOCUMENTOGTIPO.toUpperCase(), DOCUMENTOGTIPO_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOCUMENTOGESTADO.toUpperCase(), DOCUMENTOGESTADO_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOCUMENTOGFECHASUBIDA.toUpperCase(), DOCUMENTOGFECHASUBIDA_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOCUMENTOGPATHCOMPLETO.toUpperCase(), DOCUMENTOGPATHCOMPLETO_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOCUMENTOGEXTENSION.toUpperCase(), DOCUMENTOGEXTENSION_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOCUMENTOGNUMDESCARGAS.toUpperCase(), DOCUMENTOGNUMDESCARGAS_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOCUMENTOGEMAILENVIODEVUELTO.toUpperCase(), DOCUMENTOGEMAILENVIODEVUELTO_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOCUMENTOGRESULTADOSUBIDA.toUpperCase(), DOCUMENTOGRESULTADOSUBIDA_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOCUMENTOGIDDOCENGESTOR.toUpperCase(), DOCUMENTOGIDDOCENGESTOR_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOCUMENTOGNOMBRE.toUpperCase(), DOCUMENTOGNOMBRE_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOCUMENTOGDRVNUMCONTRATO.toUpperCase(), DOCUMENTOGDRVNUMCONTRATO_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOCUMENTOGUSUARIOCREADOR.toUpperCase(), DOCUMENTOGUSUARIOCREADOR_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_SOLICITUD.toUpperCase(), SOLICITUD_AGENTS);
        roleAgents.put(ROLE_NAME_PERSONA.toUpperCase(), PERSONA_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'DocumentoG', it returns the identification keys
     * - If className is a facet of the inheritance net of 'DocumentoG', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_DOCUMENTOGIDENTIFICADOR);
        }
        // Facet 'DocumentoG' (This facet)
        if (DocumentoGConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_DOCUMENTOGIDENTIFICADOR);
        }
        return returnList;
    }
}
