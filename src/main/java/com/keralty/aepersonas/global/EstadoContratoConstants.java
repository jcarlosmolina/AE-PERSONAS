package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>EstadoContrato</code> model class.
 */
public final class EstadoContratoConstants {

    private EstadoContratoConstants() {

    }

    // Class
    /** <code>EstadoContrato</code> class id. */
    public static final String CLASS_ID = "Clas_1431709286400354_Alias";
    /** <code>EstadoContrato</code> class name. */
    public static final String CLASS_NAME = "EstadoContrato";
    /** <code>EstadoContrato</code> class alias. */
    public static final String CLASS_ALIAS = "Estado contrato";
    /** <code>EstadoContrato</code> class table name. */
    public static final String TBL_NAME = "EstadoContrato";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "estadoContratoCodigo,estadoContratoDescripcion";

    public static final String DSICESTADOCONTRATO = "IC_EstadoContrato";
    

    // Attribute (estadoContratoCodigo)
    /** <code>estadoContratoCodigo</code> attribute id. */
    public static final String ATTR_ID_ESTADOCONTRATOCODIGO = "Clas_1431709286400354Atr_1_Alias";
    /** <code>estadoContratoCodigo</code> attribute name. */
    public static final String ATTR_NAME_ESTADOCONTRATOCODIGO = "estadoContratoCodigo";
    /** <code>estadoContratoCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_ESTADOCONTRATOCODIGO = "Código";

    /** <code>estadoContratoCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_ESTADOCONTRATOCODIGO = "";
    /** Agents allowed to view the attribute estadoContratoCodigo **/
    public static final String ESTADOCONTRATOCODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (estadoContratoDescripcion)
    /** <code>estadoContratoDescripcion</code> attribute id. */
    public static final String ATTR_ID_ESTADOCONTRATODESCRIPCION = "Clas_1431709286400354Atr_2_Alias";
    /** <code>estadoContratoDescripcion</code> attribute name. */
    public static final String ATTR_NAME_ESTADOCONTRATODESCRIPCION = "estadoContratoDescripcion";
    /** <code>estadoContratoDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_ESTADOCONTRATODESCRIPCION = "Descripción";

    /** <code>estadoContratoDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_ESTADOCONTRATODESCRIPCION = "";
    /** Agents allowed to view the attribute estadoContratoDescripcion **/
    public static final String ESTADOCONTRATODESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_ESTADOCONTRATOCODIGO = "Codigo";    
    /** <code>estadoContratoCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_ESTADOCONTRATOCODIGO = "estadoContratoCodigo";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_ESTADOCONTRATODESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_ESTADOCONTRATODESCRIPCIONLENGTH = 100;
    /** <code>estadoContratoDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_ESTADOCONTRATODESCRIPCION = "estadoContratoDescripcion";


    // Compound role (AESOLICITUDES)
    /** <code>AESOLICITUDES</code> role id. */
    public static final String ROLE_ID_AESOLICITUDES = "Agr_1431956357120359_Alias";
    /** <code>AESOLICITUDES</code> role name. */
    public static final String ROLE_NAME_AESOLICITUDES = "aESOLICITUDES";
    /** <code>ESTADOSOLICITUD</code> role alias. */
    public static final String ROLE_ALIAS_AESOLICITUDES = "Solicitudes";


    /** <code>AESOLICITUDES</code> inverse role name. */
    public static final String ROLE_INVNAME_AESOLICITUDES = AesolicitudesConstants.ROLE_NAME_ESTADOSOLICITUD;
    /** <code>AESOLICITUDES</code> role facet sequence. */
    public static final String PATH_FACETS_AESOLICITUDES = "";
    /** <code>AESOLICITUDES</code> role target class. */
    public static final String ROLE_TARGET_AESOLICITUDES = AesolicitudesConstants.CLASS_NAME;
    /** Agents allowed to navigate through AESOLICITUDES **/
    public static final String AESOLICITUDES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (ContratosC)
    /** <code>ContratosC</code> role id. */
    public static final String ROLE_ID_CONTRATOSC = "Agr_1473094877184507_Alias";
    /** <code>ContratosC</code> role name. */
    public static final String ROLE_NAME_CONTRATOSC = "contratosC";
    /** <code>EstadoContratoC</code> role alias. */
    public static final String ROLE_ALIAS_CONTRATOSC = "Contratos";


    /** <code>ContratosC</code> inverse role name. */
    public static final String ROLE_INVNAME_CONTRATOSC = ContratoCConstants.ROLE_NAME_ESTADOCONTRATOC;
    /** <code>ContratosC</code> role facet sequence. */
    public static final String PATH_FACETS_CONTRATOSC = "";
    /** <code>ContratosC</code> role target class. */
    public static final String ROLE_TARGET_CONTRATOSC = ContratoCConstants.CLASS_NAME;
    /** Agents allowed to navigate through ContratosC **/
    public static final String CONTRATOSC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (SolicitudesNovedad)
    /** <code>SolicitudesNovedad</code> role id. */
    public static final String ROLE_ID_SOLICITUDESNOVEDAD = "Agr_1581501382656340_Alias";
    /** <code>SolicitudesNovedad</code> role name. */
    public static final String ROLE_NAME_SOLICITUDESNOVEDAD = "solicitudesNovedad";
    /** <code>EstadoContrato</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUDESNOVEDAD = "SolicitudesNovedad";


    /** <code>SolicitudesNovedad</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUDESNOVEDAD = SolicitudNovedadConstants.ROLE_NAME_ESTADOCONTRATO;
    /** <code>SolicitudesNovedad</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUDESNOVEDAD = "";
    /** <code>SolicitudesNovedad</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUDESNOVEDAD = SolicitudNovedadConstants.CLASS_NAME;
    /** Agents allowed to navigate through SolicitudesNovedad **/
    public static final String SOLICITUDESNOVEDAD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431709286400354Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear estado contrato CORE";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>estadoContratocrearpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ESTADOCONTRATOCREARPATRCODIGO = "p_atrCodigo";
    /** <code>estadoContratocrearpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ESTADOCONTRATOCREARPATRCODIGO = "Clas_1431709286400354Ser_1Arg_1_Alias";
    /** <code>estadoContratocrearpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ESTADOCONTRATOCREARPATRCODIGO = "Código";
    /** <code>estadoContratocrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ESTADOCONTRATOCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>estadoContratocrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ESTADOCONTRATOCREARPATRDESCRIPCION = "Clas_1431709286400354Ser_1Arg_2_Alias";
    /** <code>estadoContratocrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ESTADOCONTRATOCREARPATRDESCRIPCION = "Descripción";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431709286400354Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar estado contrato CORE";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>estadoContratoeliminarpthisEstadoContrato</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_ESTADOCONTRATOELIMINARPTHISESTADOCONTRATO = "p_thisEstadoContrato";
    /** <code>estadoContratoeliminarpthisEstadoContrato</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_ESTADOCONTRATOELIMINARPTHISESTADOCONTRATO = "Clas_1431709286400354Ser_2Arg_1_Alias";
    /** <code>estadoContratoeliminarpthisEstadoContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_ESTADOCONTRATOELIMINARPTHISESTADOCONTRATO = "Estado contrato";
    // Service (sincronizar)
    /** <code>sincronizar</code> service id. */
    public static final String SERV_ID_SINCRONIZAR = "Clas_1431709286400354Ser_3_Alias";
    /** <code>sincronizar</code> service name. */
    public static final String SERV_NAME_SINCRONIZAR = "sincronizar";
    /** <code>sincronizar</code> service alias. */
    public static final String SERV_ALIAS_SINCRONIZAR = "sincronizar";
    /** Agents allowed to execute the service sincronizar **/
    public static final String SINCRONIZAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>estadoContratosincronizarpthisEstadoContrato</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_ESTADOCONTRATOSINCRONIZARPTHISESTADOCONTRATO = "p_thisEstadoContrato";
    /** <code>estadoContratosincronizarpthisEstadoContrato</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_ESTADOCONTRATOSINCRONIZARPTHISESTADOCONTRATO = "Clas_1431709286400354Ser_3Arg_1_Alias";
    /** <code>estadoContratosincronizarpthisEstadoContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_ESTADOCONTRATOSINCRONIZARPTHISESTADOCONTRATO = "Estado contrato";
    /** <code>estadoContratosincronizarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_ESTADOCONTRATOSINCRONIZARPDESCRIPCION = "p_Descripcion";
    /** <code>estadoContratosincronizarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_ESTADOCONTRATOSINCRONIZARPDESCRIPCION = "Clas_1431709286400354Ser_3Arg_2_Alias";
    /** <code>estadoContratosincronizarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_ESTADOCONTRATOSINCRONIZARPDESCRIPCION = "Descripción";
    // Service (InsESTADOSOLICITUD)
    /** <code>InsESTADOSOLICITUD</code> service id. */
    public static final String SERV_ID_INSESTADOSOLICITUD = "Clas_1431709286400354Ser_5_Alias";
    /** <code>InsESTADOSOLICITUD</code> service name. */
    public static final String SERV_NAME_INSESTADOSOLICITUD = "InsESTADOSOLICITUD";
    /** <code>InsESTADOSOLICITUD</code> service alias. */
    public static final String SERV_ALIAS_INSESTADOSOLICITUD = "InsESTADO_SOLICITUD";
    /** Agents allowed to execute the service InsESTADOSOLICITUD **/
    public static final String INSESTADOSOLICITUD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>estadoContratoInsESTADOSOLICITUDpthisEstadoContrato</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOSOLICITUD_ESTADOCONTRATOINSESTADOSOLICITUDPTHISESTADOCONTRATO = "p_thisEstadoContrato";
    /** <code>estadoContratoInsESTADOSOLICITUDpthisEstadoContrato</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOSOLICITUD_ESTADOCONTRATOINSESTADOSOLICITUDPTHISESTADOCONTRATO = "Clas_1431709286400354Ser_5Arg_1_Alias";
    /** <code>estadoContratoInsESTADOSOLICITUDpthisEstadoContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOSOLICITUD_ESTADOCONTRATOINSESTADOSOLICITUDPTHISESTADOCONTRATO = "Estado";
    /** <code>estadoContratoInsESTADOSOLICITUDpevcAesolicitudes</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOSOLICITUD_ESTADOCONTRATOINSESTADOSOLICITUDPEVCAESOLICITUDES = "p_evcAe_solicitudes";
    /** <code>estadoContratoInsESTADOSOLICITUDpevcAesolicitudes</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOSOLICITUD_ESTADOCONTRATOINSESTADOSOLICITUDPEVCAESOLICITUDES = "Clas_1431709286400354Ser_5Arg_2_Alias";
    /** <code>estadoContratoInsESTADOSOLICITUDpevcAesolicitudes</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOSOLICITUD_ESTADOCONTRATOINSESTADOSOLICITUDPEVCAESOLICITUDES = "Solicitudes";
    // Service (DelESTADOSOLICITUD)
    /** <code>DelESTADOSOLICITUD</code> service id. */
    public static final String SERV_ID_DELESTADOSOLICITUD = "Clas_1431709286400354Ser_6_Alias";
    /** <code>DelESTADOSOLICITUD</code> service name. */
    public static final String SERV_NAME_DELESTADOSOLICITUD = "DelESTADOSOLICITUD";
    /** <code>DelESTADOSOLICITUD</code> service alias. */
    public static final String SERV_ALIAS_DELESTADOSOLICITUD = "DelESTADO_SOLICITUD";
    /** Agents allowed to execute the service DelESTADOSOLICITUD **/
    public static final String DELESTADOSOLICITUD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>estadoContratoDelESTADOSOLICITUDpthisEstadoContrato</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOSOLICITUD_ESTADOCONTRATODELESTADOSOLICITUDPTHISESTADOCONTRATO = "p_thisEstadoContrato";
    /** <code>estadoContratoDelESTADOSOLICITUDpthisEstadoContrato</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOSOLICITUD_ESTADOCONTRATODELESTADOSOLICITUDPTHISESTADOCONTRATO = "Clas_1431709286400354Ser_6Arg_1_Alias";
    /** <code>estadoContratoDelESTADOSOLICITUDpthisEstadoContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOSOLICITUD_ESTADOCONTRATODELESTADOSOLICITUDPTHISESTADOCONTRATO = "Estado";
    /** <code>estadoContratoDelESTADOSOLICITUDpevcAesolicitudes</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOSOLICITUD_ESTADOCONTRATODELESTADOSOLICITUDPEVCAESOLICITUDES = "p_evcAe_solicitudes";
    /** <code>estadoContratoDelESTADOSOLICITUDpevcAesolicitudes</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOSOLICITUD_ESTADOCONTRATODELESTADOSOLICITUDPEVCAESOLICITUDES = "Clas_1431709286400354Ser_6Arg_2_Alias";
    /** <code>estadoContratoDelESTADOSOLICITUDpevcAesolicitudes</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOSOLICITUD_ESTADOCONTRATODELESTADOSOLICITUDPEVCAESOLICITUDES = "Solicitudes";
    // Service (InsEstadoContratoC)
    /** <code>InsEstadoContratoC</code> service id. */
    public static final String SERV_ID_INSESTADOCONTRATOC = "Clas_1431709286400354Ser_8_Alias";
    /** <code>InsEstadoContratoC</code> service name. */
    public static final String SERV_NAME_INSESTADOCONTRATOC = "InsEstadoContratoC";
    /** <code>InsEstadoContratoC</code> service alias. */
    public static final String SERV_ALIAS_INSESTADOCONTRATOC = "InsEstadoContratoC";
    /** Agents allowed to execute the service InsEstadoContratoC **/
    public static final String INSESTADOCONTRATOC_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>estadoContratoInsEstadoContratoCpthisEstadoContrato</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOCONTRATOC_ESTADOCONTRATOINSESTADOCONTRATOCPTHISESTADOCONTRATO = "p_thisEstadoContrato";
    /** <code>estadoContratoInsEstadoContratoCpthisEstadoContrato</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOCONTRATOC_ESTADOCONTRATOINSESTADOCONTRATOCPTHISESTADOCONTRATO = "Clas_1431709286400354Ser_8Arg_1_Alias";
    /** <code>estadoContratoInsEstadoContratoCpthisEstadoContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOCONTRATOC_ESTADOCONTRATOINSESTADOCONTRATOCPTHISESTADOCONTRATO = "Estado";
    /** <code>estadoContratoInsEstadoContratoCpevcContratoC</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOCONTRATOC_ESTADOCONTRATOINSESTADOCONTRATOCPEVCCONTRATOC = "p_evcContratoC";
    /** <code>estadoContratoInsEstadoContratoCpevcContratoC</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOCONTRATOC_ESTADOCONTRATOINSESTADOCONTRATOCPEVCCONTRATOC = "Clas_1431709286400354Ser_8Arg_2_Alias";
    /** <code>estadoContratoInsEstadoContratoCpevcContratoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOCONTRATOC_ESTADOCONTRATOINSESTADOCONTRATOCPEVCCONTRATOC = "Contratos";
    // Service (DelEstadoContratoC)
    /** <code>DelEstadoContratoC</code> service id. */
    public static final String SERV_ID_DELESTADOCONTRATOC = "Clas_1431709286400354Ser_9_Alias";
    /** <code>DelEstadoContratoC</code> service name. */
    public static final String SERV_NAME_DELESTADOCONTRATOC = "DelEstadoContratoC";
    /** <code>DelEstadoContratoC</code> service alias. */
    public static final String SERV_ALIAS_DELESTADOCONTRATOC = "DelEstadoContratoC";
    /** Agents allowed to execute the service DelEstadoContratoC **/
    public static final String DELESTADOCONTRATOC_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>estadoContratoDelEstadoContratoCpthisEstadoContrato</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOCONTRATOC_ESTADOCONTRATODELESTADOCONTRATOCPTHISESTADOCONTRATO = "p_thisEstadoContrato";
    /** <code>estadoContratoDelEstadoContratoCpthisEstadoContrato</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOCONTRATOC_ESTADOCONTRATODELESTADOCONTRATOCPTHISESTADOCONTRATO = "Clas_1431709286400354Ser_9Arg_1_Alias";
    /** <code>estadoContratoDelEstadoContratoCpthisEstadoContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOCONTRATOC_ESTADOCONTRATODELESTADOCONTRATOCPTHISESTADOCONTRATO = "Estado";
    /** <code>estadoContratoDelEstadoContratoCpevcContratoC</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOCONTRATOC_ESTADOCONTRATODELESTADOCONTRATOCPEVCCONTRATOC = "p_evcContratoC";
    /** <code>estadoContratoDelEstadoContratoCpevcContratoC</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOCONTRATOC_ESTADOCONTRATODELESTADOCONTRATOCPEVCCONTRATOC = "Clas_1431709286400354Ser_9Arg_2_Alias";
    /** <code>estadoContratoDelEstadoContratoCpevcContratoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOCONTRATOC_ESTADOCONTRATODELESTADOCONTRATOCPEVCCONTRATOC = "Contratos";
    // Service (InsEstadoContrato)
    /** <code>InsEstadoContrato</code> service id. */
    public static final String SERV_ID_INSESTADOCONTRATO = "Clas_1431709286400354Ser_10_Alias";
    /** <code>InsEstadoContrato</code> service name. */
    public static final String SERV_NAME_INSESTADOCONTRATO = "InsEstadoContrato";
    /** <code>InsEstadoContrato</code> service alias. */
    public static final String SERV_ALIAS_INSESTADOCONTRATO = "InsEstadoContrato";
    /** Agents allowed to execute the service InsEstadoContrato **/
    public static final String INSESTADOCONTRATO_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>estadoContratoInsEstadoContratopthisEstadoContrato</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOCONTRATO_ESTADOCONTRATOINSESTADOCONTRATOPTHISESTADOCONTRATO = "p_thisEstadoContrato";
    /** <code>estadoContratoInsEstadoContratopthisEstadoContrato</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOCONTRATO_ESTADOCONTRATOINSESTADOCONTRATOPTHISESTADOCONTRATO = "Clas_1431709286400354Ser_10Arg_1_Alias";
    /** <code>estadoContratoInsEstadoContratopthisEstadoContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOCONTRATO_ESTADOCONTRATOINSESTADOCONTRATOPTHISESTADOCONTRATO = "EstadoContrato";
    /** <code>estadoContratoInsEstadoContratopevcSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOCONTRATO_ESTADOCONTRATOINSESTADOCONTRATOPEVCSOLICITUDNOVEDAD = "p_evcSolicitudNovedad";
    /** <code>estadoContratoInsEstadoContratopevcSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOCONTRATO_ESTADOCONTRATOINSESTADOCONTRATOPEVCSOLICITUDNOVEDAD = "Clas_1431709286400354Ser_10Arg_2_Alias";
    /** <code>estadoContratoInsEstadoContratopevcSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOCONTRATO_ESTADOCONTRATOINSESTADOCONTRATOPEVCSOLICITUDNOVEDAD = "SolicitudesNovedad";
    // Service (DelEstadoContrato)
    /** <code>DelEstadoContrato</code> service id. */
    public static final String SERV_ID_DELESTADOCONTRATO = "Clas_1431709286400354Ser_11_Alias";
    /** <code>DelEstadoContrato</code> service name. */
    public static final String SERV_NAME_DELESTADOCONTRATO = "DelEstadoContrato";
    /** <code>DelEstadoContrato</code> service alias. */
    public static final String SERV_ALIAS_DELESTADOCONTRATO = "DelEstadoContrato";
    /** Agents allowed to execute the service DelEstadoContrato **/
    public static final String DELESTADOCONTRATO_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>estadoContratoDelEstadoContratopthisEstadoContrato</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOCONTRATO_ESTADOCONTRATODELESTADOCONTRATOPTHISESTADOCONTRATO = "p_thisEstadoContrato";
    /** <code>estadoContratoDelEstadoContratopthisEstadoContrato</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOCONTRATO_ESTADOCONTRATODELESTADOCONTRATOPTHISESTADOCONTRATO = "Clas_1431709286400354Ser_11Arg_1_Alias";
    /** <code>estadoContratoDelEstadoContratopthisEstadoContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOCONTRATO_ESTADOCONTRATODELESTADOCONTRATOPTHISESTADOCONTRATO = "EstadoContrato";
    /** <code>estadoContratoDelEstadoContratopevcSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOCONTRATO_ESTADOCONTRATODELESTADOCONTRATOPEVCSOLICITUDNOVEDAD = "p_evcSolicitudNovedad";
    /** <code>estadoContratoDelEstadoContratopevcSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOCONTRATO_ESTADOCONTRATODELESTADOCONTRATOPEVCSOLICITUDNOVEDAD = "Clas_1431709286400354Ser_11Arg_2_Alias";
    /** <code>estadoContratoDelEstadoContratopevcSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOCONTRATO_ESTADOCONTRATODELESTADOCONTRATOPEVCSOLICITUDNOVEDAD = "SolicitudesNovedad";

    public static final String FILTER_NAME_IFESTADOCONTRATOCONTRATO = "iF_EstadoContratoContrato";
    public static final String VAR_NAME_IFESTADOCONTRATOCONTRATO_VCODIGO = "v_Codigo";
    public static final String FILTER_NAME_IFESTADOCONTRATOCONTRATOPORNO = "iF_EstadoContratoContratoPorNo";
    public static final String VAR_NAME_IFESTADOCONTRATOCONTRATOPORNO_VNOMBRE = "vNombre";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_ESTADOCONTRATODESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_ESTADOCONTRATOCODIGO.toUpperCase(), ESTADOCONTRATOCODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_ESTADOCONTRATODESCRIPCION.toUpperCase(), ESTADOCONTRATODESCRIPCION_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'EstadoContrato', it returns the identification keys
     * - If className is a facet of the inheritance net of 'EstadoContrato', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_ESTADOCONTRATOCODIGO);
        }
        // Facet 'EstadoContrato' (This facet)
        if (EstadoContratoConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_ESTADOCONTRATOCODIGO);
        }
        return returnList;
    }
}
