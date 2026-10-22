package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>EstadoPersona</code> model class.
 */
public final class EstadoPersonaConstants {

    private EstadoPersonaConstants() {

    }

    // Class
    /** <code>EstadoPersona</code> class id. */
    public static final String CLASS_ID = "Clas_1431941021696517_Alias";
    /** <code>EstadoPersona</code> class name. */
    public static final String CLASS_NAME = "EstadoPersona";
    /** <code>EstadoPersona</code> class alias. */
    public static final String CLASS_ALIAS = "Estado persona";
    /** <code>EstadoPersona</code> class table name. */
    public static final String TBL_NAME = "EstadoPersona";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "estadoPersonaCodigo,estadoPersonaDescripcion,estadoPersonaUnBeneficiarioDistino,estadoPersonaProhibidoBeneficiarios,estadoPersonaProhibidoContratante,estadoPersonaProhibidoTitular";

    public static final String DSICESTADOPERSONA = "IC_EstadoPersona";
    

    // Attribute (estadoPersonaCodigo)
    /** <code>estadoPersonaCodigo</code> attribute id. */
    public static final String ATTR_ID_ESTADOPERSONACODIGO = "Clas_1431941021696517Atr_1_Alias";
    /** <code>estadoPersonaCodigo</code> attribute name. */
    public static final String ATTR_NAME_ESTADOPERSONACODIGO = "estadoPersonaCodigo";
    /** <code>estadoPersonaCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_ESTADOPERSONACODIGO = "Código";

    /** <code>estadoPersonaCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_ESTADOPERSONACODIGO = "";
    /** Agents allowed to view the attribute estadoPersonaCodigo **/
    public static final String ESTADOPERSONACODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (estadoPersonaDescripcion)
    /** <code>estadoPersonaDescripcion</code> attribute id. */
    public static final String ATTR_ID_ESTADOPERSONADESCRIPCION = "Clas_1431941021696517Atr_2_Alias";
    /** <code>estadoPersonaDescripcion</code> attribute name. */
    public static final String ATTR_NAME_ESTADOPERSONADESCRIPCION = "estadoPersonaDescripcion";
    /** <code>estadoPersonaDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_ESTADOPERSONADESCRIPCION = "Descripción";

    /** <code>estadoPersonaDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_ESTADOPERSONADESCRIPCION = "";
    /** Agents allowed to view the attribute estadoPersonaDescripcion **/
    public static final String ESTADOPERSONADESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (estadoPersonaUnBeneficiarioDistino)
    /** <code>estadoPersonaUnBeneficiarioDistino</code> attribute id. */
    public static final String ATTR_ID_ESTADOPERSONAUNBENEFICIARIODISTINO = "Clas_1431941021696517Atr_3_Alias";
    /** <code>estadoPersonaUnBeneficiarioDistino</code> attribute name. */
    public static final String ATTR_NAME_ESTADOPERSONAUNBENEFICIARIODISTINO = "estadoPersonaUnBeneficiarioDistino";
    /** <code>estadoPersonaUnBeneficiarioDistino</code> attribute alias. */
    public static final String ATTR_ALIAS_ESTADOPERSONAUNBENEFICIARIODISTINO = "Un beneficiario distinto";

    /** <code>estadoPersonaUnBeneficiarioDistino</code> attribute facet sequence. */
    public static final String PATH_FACETS_ESTADOPERSONAUNBENEFICIARIODISTINO = "";
    /** Agents allowed to view the attribute estadoPersonaUnBeneficiarioDistino **/
    public static final String ESTADOPERSONAUNBENEFICIARIODISTINO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (estadoPersonaProhibidoBeneficiarios)
    /** <code>estadoPersonaProhibidoBeneficiarios</code> attribute id. */
    public static final String ATTR_ID_ESTADOPERSONAPROHIBIDOBENEFICIARIOS = "Clas_1431941021696517Atr_4_Alias";
    /** <code>estadoPersonaProhibidoBeneficiarios</code> attribute name. */
    public static final String ATTR_NAME_ESTADOPERSONAPROHIBIDOBENEFICIARIOS = "estadoPersonaProhibidoBeneficiarios";
    /** <code>estadoPersonaProhibidoBeneficiarios</code> attribute alias. */
    public static final String ATTR_ALIAS_ESTADOPERSONAPROHIBIDOBENEFICIARIOS = "Prohibido beneficiarios";

    /** <code>estadoPersonaProhibidoBeneficiarios</code> attribute facet sequence. */
    public static final String PATH_FACETS_ESTADOPERSONAPROHIBIDOBENEFICIARIOS = "";
    /** Agents allowed to view the attribute estadoPersonaProhibidoBeneficiarios **/
    public static final String ESTADOPERSONAPROHIBIDOBENEFICIARIOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (estadoPersonaProhibidoContratante)
    /** <code>estadoPersonaProhibidoContratante</code> attribute id. */
    public static final String ATTR_ID_ESTADOPERSONAPROHIBIDOCONTRATANTE = "Clas_1431941021696517Atr_6_Alias";
    /** <code>estadoPersonaProhibidoContratante</code> attribute name. */
    public static final String ATTR_NAME_ESTADOPERSONAPROHIBIDOCONTRATANTE = "estadoPersonaProhibidoContratante";
    /** <code>estadoPersonaProhibidoContratante</code> attribute alias. */
    public static final String ATTR_ALIAS_ESTADOPERSONAPROHIBIDOCONTRATANTE = "Prohibido contratante";

    /** <code>estadoPersonaProhibidoContratante</code> attribute facet sequence. */
    public static final String PATH_FACETS_ESTADOPERSONAPROHIBIDOCONTRATANTE = "";
    /** Agents allowed to view the attribute estadoPersonaProhibidoContratante **/
    public static final String ESTADOPERSONAPROHIBIDOCONTRATANTE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (estadoPersonaProhibidoTitular)
    /** <code>estadoPersonaProhibidoTitular</code> attribute id. */
    public static final String ATTR_ID_ESTADOPERSONAPROHIBIDOTITULAR = "Clas_1431941021696517Atr_7_Alias";
    /** <code>estadoPersonaProhibidoTitular</code> attribute name. */
    public static final String ATTR_NAME_ESTADOPERSONAPROHIBIDOTITULAR = "estadoPersonaProhibidoTitular";
    /** <code>estadoPersonaProhibidoTitular</code> attribute alias. */
    public static final String ATTR_ALIAS_ESTADOPERSONAPROHIBIDOTITULAR = "Prohibido titular";

    /** <code>estadoPersonaProhibidoTitular</code> attribute facet sequence. */
    public static final String PATH_FACETS_ESTADOPERSONAPROHIBIDOTITULAR = "";
    /** Agents allowed to view the attribute estadoPersonaProhibidoTitular **/
    public static final String ESTADOPERSONAPROHIBIDOTITULAR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_ESTADOPERSONACODIGO = "Codigo";    
    /** <code>estadoPersonaCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_ESTADOPERSONACODIGO = "estadoPersonaCodigo";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_ESTADOPERSONADESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_ESTADOPERSONADESCRIPCIONLENGTH = 150;
    /** <code>estadoPersonaDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_ESTADOPERSONADESCRIPCION = "estadoPersonaDescripcion";
    // Field (UnBeneficiarioDistino)
    /** <code>UnBeneficiarioDistino</code> field name. */
    public static final String FLD_ESTADOPERSONAUNBENEFICIARIODISTINO = "UnBeneficiarioDistino";    
    /** <code>estadoPersonaUnBeneficiarioDistino</code> attribute field name. */
    public static final String ATTR_FIELD_ESTADOPERSONAUNBENEFICIARIODISTINO = "estadoPersonaUnBeneficiarioDistino";
    // Field (ProhibidoBeneficiarios)
    /** <code>ProhibidoBeneficiarios</code> field name. */
    public static final String FLD_ESTADOPERSONAPROHIBIDOBENEFICIARIOS = "ProhibidoBeneficiarios";    
    /** <code>estadoPersonaProhibidoBeneficiarios</code> attribute field name. */
    public static final String ATTR_FIELD_ESTADOPERSONAPROHIBIDOBENEFICIARIOS = "estadoPersonaProhibidoBeneficiarios";
    // Field (ProhibidoContratante)
    /** <code>ProhibidoContratante</code> field name. */
    public static final String FLD_ESTADOPERSONAPROHIBIDOCONTRATANTE = "ProhibidoContratante";    
    /** <code>estadoPersonaProhibidoContratante</code> attribute field name. */
    public static final String ATTR_FIELD_ESTADOPERSONAPROHIBIDOCONTRATANTE = "estadoPersonaProhibidoContratante";
    // Field (ProhibidoTitular)
    /** <code>ProhibidoTitular</code> field name. */
    public static final String FLD_ESTADOPERSONAPROHIBIDOTITULAR = "ProhibidoTitular";    
    /** <code>estadoPersonaProhibidoTitular</code> attribute field name. */
    public static final String ATTR_FIELD_ESTADOPERSONAPROHIBIDOTITULAR = "estadoPersonaProhibidoTitular";


    // Compound role (Personas)
    /** <code>Personas</code> role id. */
    public static final String ROLE_ID_PERSONAS = "Agr_1432223481856902_Alias";
    /** <code>Personas</code> role name. */
    public static final String ROLE_NAME_PERSONAS = "personas";
    /** <code>EstadoPersona</code> role alias. */
    public static final String ROLE_ALIAS_PERSONAS = "Personas";


    /** <code>Personas</code> inverse role name. */
    public static final String ROLE_INVNAME_PERSONAS = PersonaConstants.ROLE_NAME_ESTADOPERSONA;
    /** <code>Personas</code> role facet sequence. */
    public static final String PATH_FACETS_PERSONAS = "";
    /** <code>Personas</code> role target class. */
    public static final String ROLE_TARGET_PERSONAS = PersonaConstants.CLASS_NAME;
    /** Agents allowed to navigate through Personas **/
    public static final String PERSONAS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (PersonasC)
    /** <code>PersonasC</code> role id. */
    public static final String ROLE_ID_PERSONASC = "Agr_1473094746112648_Alias";
    /** <code>PersonasC</code> role name. */
    public static final String ROLE_NAME_PERSONASC = "personasC";
    /** <code>EstadoPersonaC</code> role alias. */
    public static final String ROLE_ALIAS_PERSONASC = "Personas";


    /** <code>PersonasC</code> inverse role name. */
    public static final String ROLE_INVNAME_PERSONASC = PersonaCConstants.ROLE_NAME_ESTADOPERSONAC;
    /** <code>PersonasC</code> role facet sequence. */
    public static final String PATH_FACETS_PERSONASC = "";
    /** <code>PersonasC</code> role target class. */
    public static final String ROLE_TARGET_PERSONASC = PersonaCConstants.CLASS_NAME;
    /** Agents allowed to navigate through PersonasC **/
    public static final String PERSONASC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431941021696517Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear estado persona";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>estadoPersonacrearpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ESTADOPERSONACREARPATRCODIGO = "p_atrCodigo";
    /** <code>estadoPersonacrearpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ESTADOPERSONACREARPATRCODIGO = "Clas_1431941021696517Ser_1Arg_1_Alias";
    /** <code>estadoPersonacrearpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ESTADOPERSONACREARPATRCODIGO = "Código";
    /** <code>estadoPersonacrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ESTADOPERSONACREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>estadoPersonacrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ESTADOPERSONACREARPATRDESCRIPCION = "Clas_1431941021696517Ser_1Arg_2_Alias";
    /** <code>estadoPersonacrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ESTADOPERSONACREARPATRDESCRIPCION = "Descripción";
    /** <code>estadoPersonacrearpatrUnBeneficiarioDistino</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ESTADOPERSONACREARPATRUNBENEFICIARIODISTINO = "p_atrUnBeneficiarioDistino";
    /** <code>estadoPersonacrearpatrUnBeneficiarioDistino</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ESTADOPERSONACREARPATRUNBENEFICIARIODISTINO = "Clas_1431941021696517Ser_1Arg_3_Alias";
    /** <code>estadoPersonacrearpatrUnBeneficiarioDistino</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ESTADOPERSONACREARPATRUNBENEFICIARIODISTINO = "Un beneficiario distinto";
    /** <code>estadoPersonacrearpatrProhibidoBeneficiarios</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ESTADOPERSONACREARPATRPROHIBIDOBENEFICIARIOS = "p_atrProhibidoBeneficiarios";
    /** <code>estadoPersonacrearpatrProhibidoBeneficiarios</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ESTADOPERSONACREARPATRPROHIBIDOBENEFICIARIOS = "Clas_1431941021696517Ser_1Arg_4_Alias";
    /** <code>estadoPersonacrearpatrProhibidoBeneficiarios</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ESTADOPERSONACREARPATRPROHIBIDOBENEFICIARIOS = "Prohibido beneficiarios";
    /** <code>estadoPersonacrearpatrProhibidoContratante</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ESTADOPERSONACREARPATRPROHIBIDOCONTRATANTE = "p_atrProhibidoContratante";
    /** <code>estadoPersonacrearpatrProhibidoContratante</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ESTADOPERSONACREARPATRPROHIBIDOCONTRATANTE = "Clas_1431941021696517Ser_1Arg_6_Alias";
    /** <code>estadoPersonacrearpatrProhibidoContratante</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ESTADOPERSONACREARPATRPROHIBIDOCONTRATANTE = "Prohibido contratante";
    /** <code>estadoPersonacrearpatrProhibidoTitular</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ESTADOPERSONACREARPATRPROHIBIDOTITULAR = "p_atrProhibidoTitular";
    /** <code>estadoPersonacrearpatrProhibidoTitular</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ESTADOPERSONACREARPATRPROHIBIDOTITULAR = "Clas_1431941021696517Ser_1Arg_7_Alias";
    /** <code>estadoPersonacrearpatrProhibidoTitular</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ESTADOPERSONACREARPATRPROHIBIDOTITULAR = "Prohibido titular";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431941021696517Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar estado persona";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>estadoPersonaeliminarpthisEstadoPersona</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_ESTADOPERSONAELIMINARPTHISESTADOPERSONA = "p_thisEstadoPersona";
    /** <code>estadoPersonaeliminarpthisEstadoPersona</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_ESTADOPERSONAELIMINARPTHISESTADOPERSONA = "Clas_1431941021696517Ser_2Arg_1_Alias";
    /** <code>estadoPersonaeliminarpthisEstadoPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_ESTADOPERSONAELIMINARPTHISESTADOPERSONA = "Estado persona";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1431941021696517Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar estado persona";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>estadoPersonamodificarpthisEstadoPersona</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_ESTADOPERSONAMODIFICARPTHISESTADOPERSONA = "p_thisEstadoPersona";
    /** <code>estadoPersonamodificarpthisEstadoPersona</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_ESTADOPERSONAMODIFICARPTHISESTADOPERSONA = "Clas_1431941021696517Ser_3Arg_1_Alias";
    /** <code>estadoPersonamodificarpthisEstadoPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_ESTADOPERSONAMODIFICARPTHISESTADOPERSONA = "Estado persona";
    /** <code>estadoPersonamodificarpUnBeneficiarioDistino</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_ESTADOPERSONAMODIFICARPUNBENEFICIARIODISTINO = "p_UnBeneficiarioDistino";
    /** <code>estadoPersonamodificarpUnBeneficiarioDistino</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_ESTADOPERSONAMODIFICARPUNBENEFICIARIODISTINO = "Clas_1431941021696517Ser_3Arg_2_Alias";
    /** <code>estadoPersonamodificarpUnBeneficiarioDistino</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_ESTADOPERSONAMODIFICARPUNBENEFICIARIODISTINO = "Un beneficiario distinto";
    /** <code>estadoPersonamodificarpProhibidoBeneficiarios</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_ESTADOPERSONAMODIFICARPPROHIBIDOBENEFICIARIOS = "p_ProhibidoBeneficiarios";
    /** <code>estadoPersonamodificarpProhibidoBeneficiarios</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_ESTADOPERSONAMODIFICARPPROHIBIDOBENEFICIARIOS = "Clas_1431941021696517Ser_3Arg_3_Alias";
    /** <code>estadoPersonamodificarpProhibidoBeneficiarios</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_ESTADOPERSONAMODIFICARPPROHIBIDOBENEFICIARIOS = "Prohibido beneficiarios";
    /** <code>estadoPersonamodificarpProhibidoContratante</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_ESTADOPERSONAMODIFICARPPROHIBIDOCONTRATANTE = "p_ProhibidoContratante";
    /** <code>estadoPersonamodificarpProhibidoContratante</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_ESTADOPERSONAMODIFICARPPROHIBIDOCONTRATANTE = "Clas_1431941021696517Ser_3Arg_5_Alias";
    /** <code>estadoPersonamodificarpProhibidoContratante</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_ESTADOPERSONAMODIFICARPPROHIBIDOCONTRATANTE = "Prohibido contratante";
    /** <code>estadoPersonamodificarpProhibidoTitular</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_ESTADOPERSONAMODIFICARPPROHIBIDOTITULAR = "p_ProhibidoTitular";
    /** <code>estadoPersonamodificarpProhibidoTitular</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_ESTADOPERSONAMODIFICARPPROHIBIDOTITULAR = "Clas_1431941021696517Ser_3Arg_6_Alias";
    /** <code>estadoPersonamodificarpProhibidoTitular</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_ESTADOPERSONAMODIFICARPPROHIBIDOTITULAR = "Prohibido titular";
    // Service (sincronizar)
    /** <code>sincronizar</code> service id. */
    public static final String SERV_ID_SINCRONIZAR = "Clas_1431941021696517Ser_4_Alias";
    /** <code>sincronizar</code> service name. */
    public static final String SERV_NAME_SINCRONIZAR = "sincronizar";
    /** <code>sincronizar</code> service alias. */
    public static final String SERV_ALIAS_SINCRONIZAR = "sincronizar";
    /** Agents allowed to execute the service sincronizar **/
    public static final String SINCRONIZAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>estadoPersonasincronizarpthisEstadoPersona</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_ESTADOPERSONASINCRONIZARPTHISESTADOPERSONA = "p_thisEstadoPersona";
    /** <code>estadoPersonasincronizarpthisEstadoPersona</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_ESTADOPERSONASINCRONIZARPTHISESTADOPERSONA = "Clas_1431941021696517Ser_4Arg_1_Alias";
    /** <code>estadoPersonasincronizarpthisEstadoPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_ESTADOPERSONASINCRONIZARPTHISESTADOPERSONA = "Estado persona";
    /** <code>estadoPersonasincronizarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_ESTADOPERSONASINCRONIZARPDESCRIPCION = "p_Descripcion";
    /** <code>estadoPersonasincronizarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_ESTADOPERSONASINCRONIZARPDESCRIPCION = "Clas_1431941021696517Ser_4Arg_2_Alias";
    /** <code>estadoPersonasincronizarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_ESTADOPERSONASINCRONIZARPDESCRIPCION = "Descripción";
    // Service (InsEstadoPersona)
    /** <code>InsEstadoPersona</code> service id. */
    public static final String SERV_ID_INSESTADOPERSONA = "Clas_1431941021696517Ser_5_Alias";
    /** <code>InsEstadoPersona</code> service name. */
    public static final String SERV_NAME_INSESTADOPERSONA = "InsEstadoPersona";
    /** <code>InsEstadoPersona</code> service alias. */
    public static final String SERV_ALIAS_INSESTADOPERSONA = "InsEstadoPersona";
    /** Agents allowed to execute the service InsEstadoPersona **/
    public static final String INSESTADOPERSONA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>estadoPersonaInsEstadoPersonapthisEstadoPersona</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOPERSONA_ESTADOPERSONAINSESTADOPERSONAPTHISESTADOPERSONA = "p_thisEstadoPersona";
    /** <code>estadoPersonaInsEstadoPersonapthisEstadoPersona</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOPERSONA_ESTADOPERSONAINSESTADOPERSONAPTHISESTADOPERSONA = "Clas_1431941021696517Ser_5Arg_1_Alias";
    /** <code>estadoPersonaInsEstadoPersonapthisEstadoPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOPERSONA_ESTADOPERSONAINSESTADOPERSONAPTHISESTADOPERSONA = "Estado persona";
    /** <code>estadoPersonaInsEstadoPersonapevcPersona</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOPERSONA_ESTADOPERSONAINSESTADOPERSONAPEVCPERSONA = "p_evcPersona";
    /** <code>estadoPersonaInsEstadoPersonapevcPersona</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOPERSONA_ESTADOPERSONAINSESTADOPERSONAPEVCPERSONA = "Clas_1431941021696517Ser_5Arg_2_Alias";
    /** <code>estadoPersonaInsEstadoPersonapevcPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOPERSONA_ESTADOPERSONAINSESTADOPERSONAPEVCPERSONA = "Personas";
    // Service (DelEstadoPersona)
    /** <code>DelEstadoPersona</code> service id. */
    public static final String SERV_ID_DELESTADOPERSONA = "Clas_1431941021696517Ser_6_Alias";
    /** <code>DelEstadoPersona</code> service name. */
    public static final String SERV_NAME_DELESTADOPERSONA = "DelEstadoPersona";
    /** <code>DelEstadoPersona</code> service alias. */
    public static final String SERV_ALIAS_DELESTADOPERSONA = "DelEstadoPersona";
    /** Agents allowed to execute the service DelEstadoPersona **/
    public static final String DELESTADOPERSONA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>estadoPersonaDelEstadoPersonapthisEstadoPersona</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOPERSONA_ESTADOPERSONADELESTADOPERSONAPTHISESTADOPERSONA = "p_thisEstadoPersona";
    /** <code>estadoPersonaDelEstadoPersonapthisEstadoPersona</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOPERSONA_ESTADOPERSONADELESTADOPERSONAPTHISESTADOPERSONA = "Clas_1431941021696517Ser_6Arg_1_Alias";
    /** <code>estadoPersonaDelEstadoPersonapthisEstadoPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOPERSONA_ESTADOPERSONADELESTADOPERSONAPTHISESTADOPERSONA = "Estado persona";
    /** <code>estadoPersonaDelEstadoPersonapevcPersona</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOPERSONA_ESTADOPERSONADELESTADOPERSONAPEVCPERSONA = "p_evcPersona";
    /** <code>estadoPersonaDelEstadoPersonapevcPersona</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOPERSONA_ESTADOPERSONADELESTADOPERSONAPEVCPERSONA = "Clas_1431941021696517Ser_6Arg_2_Alias";
    /** <code>estadoPersonaDelEstadoPersonapevcPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOPERSONA_ESTADOPERSONADELESTADOPERSONAPEVCPERSONA = "Personas";
    // Service (InsEstadoPersonaC)
    /** <code>InsEstadoPersonaC</code> service id. */
    public static final String SERV_ID_INSESTADOPERSONAC = "Clas_1431941021696517Ser_7_Alias";
    /** <code>InsEstadoPersonaC</code> service name. */
    public static final String SERV_NAME_INSESTADOPERSONAC = "InsEstadoPersonaC";
    /** <code>InsEstadoPersonaC</code> service alias. */
    public static final String SERV_ALIAS_INSESTADOPERSONAC = "InsEstadoPersonaC";
    /** Agents allowed to execute the service InsEstadoPersonaC **/
    public static final String INSESTADOPERSONAC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>estadoPersonaInsEstadoPersonaCpthisEstadoPersona</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOPERSONAC_ESTADOPERSONAINSESTADOPERSONACPTHISESTADOPERSONA = "p_thisEstadoPersona";
    /** <code>estadoPersonaInsEstadoPersonaCpthisEstadoPersona</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOPERSONAC_ESTADOPERSONAINSESTADOPERSONACPTHISESTADOPERSONA = "Clas_1431941021696517Ser_7Arg_1_Alias";
    /** <code>estadoPersonaInsEstadoPersonaCpthisEstadoPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOPERSONAC_ESTADOPERSONAINSESTADOPERSONACPTHISESTADOPERSONA = "Estado";
    /** <code>estadoPersonaInsEstadoPersonaCpevcPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOPERSONAC_ESTADOPERSONAINSESTADOPERSONACPEVCPERSONAC = "p_evcPersonaC";
    /** <code>estadoPersonaInsEstadoPersonaCpevcPersonaC</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOPERSONAC_ESTADOPERSONAINSESTADOPERSONACPEVCPERSONAC = "Clas_1431941021696517Ser_7Arg_2_Alias";
    /** <code>estadoPersonaInsEstadoPersonaCpevcPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOPERSONAC_ESTADOPERSONAINSESTADOPERSONACPEVCPERSONAC = "Personas";
    // Service (DelEstadoPersonaC)
    /** <code>DelEstadoPersonaC</code> service id. */
    public static final String SERV_ID_DELESTADOPERSONAC = "Clas_1431941021696517Ser_8_Alias";
    /** <code>DelEstadoPersonaC</code> service name. */
    public static final String SERV_NAME_DELESTADOPERSONAC = "DelEstadoPersonaC";
    /** <code>DelEstadoPersonaC</code> service alias. */
    public static final String SERV_ALIAS_DELESTADOPERSONAC = "DelEstadoPersonaC";
    /** Agents allowed to execute the service DelEstadoPersonaC **/
    public static final String DELESTADOPERSONAC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>estadoPersonaDelEstadoPersonaCpthisEstadoPersona</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOPERSONAC_ESTADOPERSONADELESTADOPERSONACPTHISESTADOPERSONA = "p_thisEstadoPersona";
    /** <code>estadoPersonaDelEstadoPersonaCpthisEstadoPersona</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOPERSONAC_ESTADOPERSONADELESTADOPERSONACPTHISESTADOPERSONA = "Clas_1431941021696517Ser_8Arg_1_Alias";
    /** <code>estadoPersonaDelEstadoPersonaCpthisEstadoPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOPERSONAC_ESTADOPERSONADELESTADOPERSONACPTHISESTADOPERSONA = "Estado";
    /** <code>estadoPersonaDelEstadoPersonaCpevcPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOPERSONAC_ESTADOPERSONADELESTADOPERSONACPEVCPERSONAC = "p_evcPersonaC";
    /** <code>estadoPersonaDelEstadoPersonaCpevcPersonaC</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOPERSONAC_ESTADOPERSONADELESTADOPERSONACPEVCPERSONAC = "Clas_1431941021696517Ser_8Arg_2_Alias";
    /** <code>estadoPersonaDelEstadoPersonaCpevcPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOPERSONAC_ESTADOPERSONADELESTADOPERSONACPEVCPERSONAC = "Personas";

    public static final String FILTER_NAME_IFESTADOPERSONACODIGO = "iF_EstadoPersonaCodigo";
    public static final String VAR_NAME_IFESTADOPERSONACODIGO_VCODIGO = "v_Codigo";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_ESTADOPERSONADESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_ESTADOPERSONAUNBENEFICIARIODISTINO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_ESTADOPERSONAPROHIBIDOBENEFICIARIOS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_ESTADOPERSONAPROHIBIDOCONTRATANTE.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_ESTADOPERSONAPROHIBIDOTITULAR.toUpperCase(), Constants.Type.BOOL.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_ESTADOPERSONACODIGO.toUpperCase(), ESTADOPERSONACODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_ESTADOPERSONADESCRIPCION.toUpperCase(), ESTADOPERSONADESCRIPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_ESTADOPERSONAUNBENEFICIARIODISTINO.toUpperCase(), ESTADOPERSONAUNBENEFICIARIODISTINO_AGENTS);
    	attributeAgents.put(ATTR_NAME_ESTADOPERSONAPROHIBIDOBENEFICIARIOS.toUpperCase(), ESTADOPERSONAPROHIBIDOBENEFICIARIOS_AGENTS);
    	attributeAgents.put(ATTR_NAME_ESTADOPERSONAPROHIBIDOCONTRATANTE.toUpperCase(), ESTADOPERSONAPROHIBIDOCONTRATANTE_AGENTS);
    	attributeAgents.put(ATTR_NAME_ESTADOPERSONAPROHIBIDOTITULAR.toUpperCase(), ESTADOPERSONAPROHIBIDOTITULAR_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'EstadoPersona', it returns the identification keys
     * - If className is a facet of the inheritance net of 'EstadoPersona', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_ESTADOPERSONACODIGO);
        }
        // Facet 'EstadoPersona' (This facet)
        if (EstadoPersonaConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_ESTADOPERSONACODIGO);
        }
        return returnList;
    }
}
