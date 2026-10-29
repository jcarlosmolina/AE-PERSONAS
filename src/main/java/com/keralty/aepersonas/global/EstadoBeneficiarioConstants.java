package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>EstadoBeneficiario</code> model class.
 */
public final class EstadoBeneficiarioConstants {

    private EstadoBeneficiarioConstants() {

    }

    // Class
    /** <code>EstadoBeneficiario</code> class id. */
    public static final String CLASS_ID = "Clas_1431710597120636_Alias";
    /** <code>EstadoBeneficiario</code> class name. */
    public static final String CLASS_NAME = "EstadoBeneficiario";
    /** <code>EstadoBeneficiario</code> class alias. */
    public static final String CLASS_ALIAS = "Estado beneficiario CORE";
    /** <code>EstadoBeneficiario</code> class table name. */
    public static final String TBL_NAME = "EstadoBeneficiario";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "estadoBeneficiarioCodigo,estadoBeneficiarioDescripcion,estadoBeneficiarioEsActivo,estadoBeneficiarioConfirmado,estadoBeneficiarioEsError";

    public static final String DSICESTADOBENEFICIARIO = "IC_EstadoBeneficiario";
    

    // Attribute (estadoBeneficiarioCodigo)
    /** <code>estadoBeneficiarioCodigo</code> attribute id. */
    public static final String ATTR_ID_ESTADOBENEFICIARIOCODIGO = "Clas_1431710597120636Atr_1_Alias";
    /** <code>estadoBeneficiarioCodigo</code> attribute name. */
    public static final String ATTR_NAME_ESTADOBENEFICIARIOCODIGO = "estadoBeneficiarioCodigo";
    /** <code>estadoBeneficiarioCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_ESTADOBENEFICIARIOCODIGO = "Código";

    /** <code>estadoBeneficiarioCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_ESTADOBENEFICIARIOCODIGO = "";
    /** Agents allowed to view the attribute estadoBeneficiarioCodigo **/
    public static final String ESTADOBENEFICIARIOCODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (estadoBeneficiarioDescripcion)
    /** <code>estadoBeneficiarioDescripcion</code> attribute id. */
    public static final String ATTR_ID_ESTADOBENEFICIARIODESCRIPCION = "Clas_1431710597120636Atr_2_Alias";
    /** <code>estadoBeneficiarioDescripcion</code> attribute name. */
    public static final String ATTR_NAME_ESTADOBENEFICIARIODESCRIPCION = "estadoBeneficiarioDescripcion";
    /** <code>estadoBeneficiarioDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_ESTADOBENEFICIARIODESCRIPCION = "Descripción";

    /** <code>estadoBeneficiarioDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_ESTADOBENEFICIARIODESCRIPCION = "";
    /** Agents allowed to view the attribute estadoBeneficiarioDescripcion **/
    public static final String ESTADOBENEFICIARIODESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (estadoBeneficiarioEsActivo)
    /** <code>estadoBeneficiarioEsActivo</code> attribute id. */
    public static final String ATTR_ID_ESTADOBENEFICIARIOESACTIVO = "Clas_1431710597120636Atr_3_Alias";
    /** <code>estadoBeneficiarioEsActivo</code> attribute name. */
    public static final String ATTR_NAME_ESTADOBENEFICIARIOESACTIVO = "estadoBeneficiarioEsActivo";
    /** <code>estadoBeneficiarioEsActivo</code> attribute alias. */
    public static final String ATTR_ALIAS_ESTADOBENEFICIARIOESACTIVO = "Es activo";

    /** <code>estadoBeneficiarioEsActivo</code> attribute facet sequence. */
    public static final String PATH_FACETS_ESTADOBENEFICIARIOESACTIVO = "";
    /** Agents allowed to view the attribute estadoBeneficiarioEsActivo **/
    public static final String ESTADOBENEFICIARIOESACTIVO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (estadoBeneficiarioConfirmado)
    /** <code>estadoBeneficiarioConfirmado</code> attribute id. */
    public static final String ATTR_ID_ESTADOBENEFICIARIOCONFIRMADO = "Clas_1431710597120636Atr_4_Alias";
    /** <code>estadoBeneficiarioConfirmado</code> attribute name. */
    public static final String ATTR_NAME_ESTADOBENEFICIARIOCONFIRMADO = "estadoBeneficiarioConfirmado";
    /** <code>estadoBeneficiarioConfirmado</code> attribute alias. */
    public static final String ATTR_ALIAS_ESTADOBENEFICIARIOCONFIRMADO = "Confirmado";

    /** <code>estadoBeneficiarioConfirmado</code> attribute facet sequence. */
    public static final String PATH_FACETS_ESTADOBENEFICIARIOCONFIRMADO = "";
    /** Agents allowed to view the attribute estadoBeneficiarioConfirmado **/
    public static final String ESTADOBENEFICIARIOCONFIRMADO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (estadoBeneficiarioEsError)
    /** <code>estadoBeneficiarioEsError</code> attribute id. */
    public static final String ATTR_ID_ESTADOBENEFICIARIOESERROR = "Clas_1431710597120636Atr_5_Alias";
    /** <code>estadoBeneficiarioEsError</code> attribute name. */
    public static final String ATTR_NAME_ESTADOBENEFICIARIOESERROR = "estadoBeneficiarioEsError";
    /** <code>estadoBeneficiarioEsError</code> attribute alias. */
    public static final String ATTR_ALIAS_ESTADOBENEFICIARIOESERROR = "Es error";

    /** <code>estadoBeneficiarioEsError</code> attribute facet sequence. */
    public static final String PATH_FACETS_ESTADOBENEFICIARIOESERROR = "";
    /** Agents allowed to view the attribute estadoBeneficiarioEsError **/
    public static final String ESTADOBENEFICIARIOESERROR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_ESTADOBENEFICIARIOCODIGO = "Codigo";    
    /** <code>estadoBeneficiarioCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_ESTADOBENEFICIARIOCODIGO = "estadoBeneficiarioCodigo";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_ESTADOBENEFICIARIODESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_ESTADOBENEFICIARIODESCRIPCIONLENGTH = 150;
    /** <code>estadoBeneficiarioDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_ESTADOBENEFICIARIODESCRIPCION = "estadoBeneficiarioDescripcion";
    // Field (EsActivo)
    /** <code>EsActivo</code> field name. */
    public static final String FLD_ESTADOBENEFICIARIOESACTIVO = "EsActivo";    
    /** <code>estadoBeneficiarioEsActivo</code> attribute field name. */
    public static final String ATTR_FIELD_ESTADOBENEFICIARIOESACTIVO = "estadoBeneficiarioEsActivo";
    // Field (Confirmado)
    /** <code>Confirmado</code> field name. */
    public static final String FLD_ESTADOBENEFICIARIOCONFIRMADO = "Confirmado";    
    /** <code>estadoBeneficiarioConfirmado</code> attribute field name. */
    public static final String ATTR_FIELD_ESTADOBENEFICIARIOCONFIRMADO = "estadoBeneficiarioConfirmado";
    // Field (EsError)
    /** <code>EsError</code> field name. */
    public static final String FLD_ESTADOBENEFICIARIOESERROR = "EsError";    
    /** <code>estadoBeneficiarioEsError</code> attribute field name. */
    public static final String ATTR_FIELD_ESTADOBENEFICIARIOESERROR = "estadoBeneficiarioEsError";


    // Compound role (EstadoBeneficiarioAE)
    /** <code>EstadoBeneficiarioAE</code> role id. */
    public static final String ROLE_ID_ESTADOBENEFICIARIOAE = "Agr_1431711383552248_Alias";
    /** <code>EstadoBeneficiarioAE</code> role name. */
    public static final String ROLE_NAME_ESTADOBENEFICIARIOAE = "estadoBeneficiarioAE";
    /** <code>EstadoBeneficiarioCORE</code> role alias. */
    public static final String ROLE_ALIAS_ESTADOBENEFICIARIOAE = "Estado beneficiario AE";


    /** <code>EstadoBeneficiarioAE</code> inverse role name. */
    public static final String ROLE_INVNAME_ESTADOBENEFICIARIOAE = EstadoBeneficiarioAEConstants.ROLE_NAME_ESTADOBENEFICIARIOCORE;
    /** <code>EstadoBeneficiarioAE</code> role facet sequence. */
    public static final String PATH_FACETS_ESTADOBENEFICIARIOAE = "";
    /** <code>EstadoBeneficiarioAE</code> role target class. */
    public static final String ROLE_TARGET_ESTADOBENEFICIARIOAE = EstadoBeneficiarioAEConstants.CLASS_NAME;
    /** Agents allowed to navigate through EstadoBeneficiarioAE **/
    public static final String ESTADOBENEFICIARIOAE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (UsuarioS)
    /** <code>UsuarioS</code> role id. */
    public static final String ROLE_ID_USUARIOS = "Agr_1434045120512001_Alias";
    /** <code>UsuarioS</code> role name. */
    public static final String ROLE_NAME_USUARIOS = "usuarioS";
    /** <code>EstadoBeneficiario</code> role alias. */
    public static final String ROLE_ALIAS_USUARIOS = "UsuarioS";


    /** <code>UsuarioS</code> inverse role name. */
    public static final String ROLE_INVNAME_USUARIOS = UsuarioConstants.ROLE_NAME_ESTADOBENEFICIARIO;
    /** <code>UsuarioS</code> role facet sequence. */
    public static final String PATH_FACETS_USUARIOS = "";
    /** <code>UsuarioS</code> role target class. */
    public static final String ROLE_TARGET_USUARIOS = UsuarioConstants.CLASS_NAME;
    /** Agents allowed to navigate through UsuarioS **/
    public static final String USUARIOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (BeneficiariosC)
    /** <code>BeneficiariosC</code> role id. */
    public static final String ROLE_ID_BENEFICIARIOSC = "Agr_1473095139328540_Alias";
    /** <code>BeneficiariosC</code> role name. */
    public static final String ROLE_NAME_BENEFICIARIOSC = "beneficiariosC";
    /** <code>EstadoBeneficiarioC</code> role alias. */
    public static final String ROLE_ALIAS_BENEFICIARIOSC = "Beneficiarios";


    /** <code>BeneficiariosC</code> inverse role name. */
    public static final String ROLE_INVNAME_BENEFICIARIOSC = BeneficiarioCConstants.ROLE_NAME_ESTADOBENEFICIARIOC;
    /** <code>BeneficiariosC</code> role facet sequence. */
    public static final String PATH_FACETS_BENEFICIARIOSC = "";
    /** <code>BeneficiariosC</code> role target class. */
    public static final String ROLE_TARGET_BENEFICIARIOSC = BeneficiarioCConstants.CLASS_NAME;
    /** Agents allowed to navigate through BeneficiariosC **/
    public static final String BENEFICIARIOSC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (UsuariosReg)
    /** <code>UsuariosReg</code> role id. */
    public static final String ROLE_ID_USUARIOSREG = "Agr_1433943015424284_Alias";
    /** <code>UsuariosReg</code> role name. */
    public static final String ROLE_NAME_USUARIOSREG = "usuariosReg";
    /** <code>EstadoBeneficiario</code> role alias. */
    public static final String ROLE_ALIAS_USUARIOSREG = "Usuarios registrados";


    /** <code>UsuariosReg</code> inverse role name. */
    public static final String ROLE_INVNAME_USUARIOSREG = UsuarioRegConstants.ROLE_NAME_ESTADOBENEFICIARIO;
    /** <code>UsuariosReg</code> role facet sequence. */
    public static final String PATH_FACETS_USUARIOSREG = "";
    /** <code>UsuariosReg</code> role target class. */
    public static final String ROLE_TARGET_USUARIOSREG = UsuarioRegConstants.CLASS_NAME;
    /** Agents allowed to navigate through UsuariosReg **/
    public static final String USUARIOSREG_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (UsuariosNovedad)
    /** <code>UsuariosNovedad</code> role id. */
    public static final String ROLE_ID_USUARIOSNOVEDAD = "Agr_1581701005312659_Alias";
    /** <code>UsuariosNovedad</code> role name. */
    public static final String ROLE_NAME_USUARIOSNOVEDAD = "usuariosNovedad";
    /** <code>EstadoBeneficiario</code> role alias. */
    public static final String ROLE_ALIAS_USUARIOSNOVEDAD = "UsuariosNovedad";


    /** <code>UsuariosNovedad</code> inverse role name. */
    public static final String ROLE_INVNAME_USUARIOSNOVEDAD = UsuarioNovedadConstants.ROLE_NAME_ESTADOBENEFICIARIO;
    /** <code>UsuariosNovedad</code> role facet sequence. */
    public static final String PATH_FACETS_USUARIOSNOVEDAD = "";
    /** <code>UsuariosNovedad</code> role target class. */
    public static final String ROLE_TARGET_USUARIOSNOVEDAD = UsuarioNovedadConstants.CLASS_NAME;
    /** Agents allowed to navigate through UsuariosNovedad **/
    public static final String USUARIOSNOVEDAD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431710597120636Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear estado beneficiario";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>estadoBeneficiariocrearpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ESTADOBENEFICIARIOCREARPATRCODIGO = "p_atrCodigo";
    /** <code>estadoBeneficiariocrearpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ESTADOBENEFICIARIOCREARPATRCODIGO = "Clas_1431710597120636Ser_1Arg_1_Alias";
    /** <code>estadoBeneficiariocrearpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ESTADOBENEFICIARIOCREARPATRCODIGO = "Código";
    /** <code>estadoBeneficiariocrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ESTADOBENEFICIARIOCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>estadoBeneficiariocrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ESTADOBENEFICIARIOCREARPATRDESCRIPCION = "Clas_1431710597120636Ser_1Arg_2_Alias";
    /** <code>estadoBeneficiariocrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ESTADOBENEFICIARIOCREARPATRDESCRIPCION = "Descripción";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431710597120636Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar estado beneficiario";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Preconditions
    /** <code>eliminar</code> precondition 0 id. */
    public static final String PRE_ID_ELIMINAR_0 = "Clas_1431710597120636Pre_1_MsgError";
    // Inbound arguments
    /** <code>estadoBeneficiarioeliminarpthisEstadoBeneficiario</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_ESTADOBENEFICIARIOELIMINARPTHISESTADOBENEFICIARIO = "p_thisEstadoBeneficiario";
    /** <code>estadoBeneficiarioeliminarpthisEstadoBeneficiario</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_ESTADOBENEFICIARIOELIMINARPTHISESTADOBENEFICIARIO = "Clas_1431710597120636Ser_2Arg_1_Alias";
    /** <code>estadoBeneficiarioeliminarpthisEstadoBeneficiario</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_ESTADOBENEFICIARIOELIMINARPTHISESTADOBENEFICIARIO = "Estado beneficiario CORE";
    // Service (sincronizar)
    /** <code>sincronizar</code> service id. */
    public static final String SERV_ID_SINCRONIZAR = "Clas_1431710597120636Ser_3_Alias";
    /** <code>sincronizar</code> service name. */
    public static final String SERV_NAME_SINCRONIZAR = "sincronizar";
    /** <code>sincronizar</code> service alias. */
    public static final String SERV_ALIAS_SINCRONIZAR = "sincronizar";
    /** Agents allowed to execute the service sincronizar **/
    public static final String SINCRONIZAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>estadoBeneficiariosincronizarpthisEstadoBeneficiario</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_ESTADOBENEFICIARIOSINCRONIZARPTHISESTADOBENEFICIARIO = "p_thisEstadoBeneficiario";
    /** <code>estadoBeneficiariosincronizarpthisEstadoBeneficiario</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_ESTADOBENEFICIARIOSINCRONIZARPTHISESTADOBENEFICIARIO = "Clas_1431710597120636Ser_3Arg_1_Alias";
    /** <code>estadoBeneficiariosincronizarpthisEstadoBeneficiario</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_ESTADOBENEFICIARIOSINCRONIZARPTHISESTADOBENEFICIARIO = "Estado beneficiario CORE";
    /** <code>estadoBeneficiariosincronizarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_ESTADOBENEFICIARIOSINCRONIZARPDESCRIPCION = "p_Descripcion";
    /** <code>estadoBeneficiariosincronizarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_ESTADOBENEFICIARIOSINCRONIZARPDESCRIPCION = "Clas_1431710597120636Ser_3Arg_2_Alias";
    /** <code>estadoBeneficiariosincronizarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_ESTADOBENEFICIARIOSINCRONIZARPDESCRIPCION = "Descripción";
    // Service (CambEstadoBeneficiarioCORE)
    /** <code>CambEstadoBeneficiarioCORE</code> service id. */
    public static final String SERV_ID_CAMBESTADOBENEFICIARIOCORE = "Clas_1431710597120636Ser_4_Alias";
    /** <code>CambEstadoBeneficiarioCORE</code> service name. */
    public static final String SERV_NAME_CAMBESTADOBENEFICIARIOCORE = "CambEstadoBeneficiarioCORE";
    /** <code>CambEstadoBeneficiarioCORE</code> service alias. */
    public static final String SERV_ALIAS_CAMBESTADOBENEFICIARIOCORE = "CambEstadoBeneficiarioCORE";
    /** Agents allowed to execute the service CambEstadoBeneficiarioCORE **/
    public static final String CAMBESTADOBENEFICIARIOCORE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>estadoBeneficiarioCambEstadoBeneficiarioCOREpthisEstadoBeneficiario</code> inbound argument name. */
    public static final String ARG_NAME_CAMBESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIOCAMBESTADOBENEFICIARIOCOREPTHISESTADOBENEFICIARIO = "p_thisEstadoBeneficiario";
    /** <code>estadoBeneficiarioCambEstadoBeneficiarioCOREpthisEstadoBeneficiario</code> inbound argument id. */
    public static final String ARG_ID_CAMBESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIOCAMBESTADOBENEFICIARIOCOREPTHISESTADOBENEFICIARIO = "Clas_1431710597120636Ser_4Arg_1_Alias";
    /** <code>estadoBeneficiarioCambEstadoBeneficiarioCOREpthisEstadoBeneficiario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIOCAMBESTADOBENEFICIARIOCOREPTHISESTADOBENEFICIARIO = "Estado beneficiario CORE";
    /** <code>estadoBeneficiarioCambEstadoBeneficiarioCOREpevcEstadoBeneficiarioAE</code> inbound argument name. */
    public static final String ARG_NAME_CAMBESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIOCAMBESTADOBENEFICIARIOCOREPEVCESTADOBENEFICIARIOAE = "p_evcEstadoBeneficiarioAE";
    /** <code>estadoBeneficiarioCambEstadoBeneficiarioCOREpevcEstadoBeneficiarioAE</code> inbound argument id. */
    public static final String ARG_ID_CAMBESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIOCAMBESTADOBENEFICIARIOCOREPEVCESTADOBENEFICIARIOAE = "Clas_1431710597120636Ser_4Arg_2_Alias";
    /** <code>estadoBeneficiarioCambEstadoBeneficiarioCOREpevcEstadoBeneficiarioAE</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIOCAMBESTADOBENEFICIARIOCOREPEVCESTADOBENEFICIARIOAE = "Estado beneficiario AE";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1431710597120636Ser_5_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar estado beneficiario";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>estadoBeneficiariomodificarpthisEstadoBeneficiario</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_ESTADOBENEFICIARIOMODIFICARPTHISESTADOBENEFICIARIO = "p_thisEstadoBeneficiario";
    /** <code>estadoBeneficiariomodificarpthisEstadoBeneficiario</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_ESTADOBENEFICIARIOMODIFICARPTHISESTADOBENEFICIARIO = "Clas_1431710597120636Ser_5Arg_1_Alias";
    /** <code>estadoBeneficiariomodificarpthisEstadoBeneficiario</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_ESTADOBENEFICIARIOMODIFICARPTHISESTADOBENEFICIARIO = "Estado beneficiario CORE";
    /** <code>estadoBeneficiariomodificarpEsActivo</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_ESTADOBENEFICIARIOMODIFICARPESACTIVO = "p_EsActivo";
    /** <code>estadoBeneficiariomodificarpEsActivo</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_ESTADOBENEFICIARIOMODIFICARPESACTIVO = "Clas_1431710597120636Ser_5Arg_2_Alias";
    /** <code>estadoBeneficiariomodificarpEsActivo</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_ESTADOBENEFICIARIOMODIFICARPESACTIVO = "Es activo";
    /** <code>estadoBeneficiariomodificarpConfirmado</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_ESTADOBENEFICIARIOMODIFICARPCONFIRMADO = "p_Confirmado";
    /** <code>estadoBeneficiariomodificarpConfirmado</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_ESTADOBENEFICIARIOMODIFICARPCONFIRMADO = "Clas_1431710597120636Ser_5Arg_3_Alias";
    /** <code>estadoBeneficiariomodificarpConfirmado</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_ESTADOBENEFICIARIOMODIFICARPCONFIRMADO = "Confirmado";
    /** <code>estadoBeneficiariomodificarpEsError</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_ESTADOBENEFICIARIOMODIFICARPESERROR = "p_EsError";
    /** <code>estadoBeneficiariomodificarpEsError</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_ESTADOBENEFICIARIOMODIFICARPESERROR = "Clas_1431710597120636Ser_5Arg_4_Alias";
    /** <code>estadoBeneficiariomodificarpEsError</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_ESTADOBENEFICIARIOMODIFICARPESERROR = "Es error";
    // Service (InsEstadoBeneficiarioCORE)
    /** <code>InsEstadoBeneficiarioCORE</code> service id. */
    public static final String SERV_ID_INSESTADOBENEFICIARIOCORE = "Clas_1431710597120636Ser_6_Alias";
    /** <code>InsEstadoBeneficiarioCORE</code> service name. */
    public static final String SERV_NAME_INSESTADOBENEFICIARIOCORE = "InsEstadoBeneficiarioCORE";
    /** <code>InsEstadoBeneficiarioCORE</code> service alias. */
    public static final String SERV_ALIAS_INSESTADOBENEFICIARIOCORE = "InsEstadoBeneficiarioCORE";
    /** Agents allowed to execute the service InsEstadoBeneficiarioCORE **/
    public static final String INSESTADOBENEFICIARIOCORE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>estadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiario</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIOINSESTADOBENEFICIARIOCOREPTHISESTADOBENEFICIARIO = "p_thisEstadoBeneficiario";
    /** <code>estadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiario</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIOINSESTADOBENEFICIARIOCOREPTHISESTADOBENEFICIARIO = "Clas_1431710597120636Ser_6Arg_1_Alias";
    /** <code>estadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiario</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIOINSESTADOBENEFICIARIOCOREPTHISESTADOBENEFICIARIO = "Estado beneficiario CORE";
    /** <code>estadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuario</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIOINSESTADOBENEFICIARIOCOREPEVCUSUARIO = "p_evcUsuario";
    /** <code>estadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuario</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIOINSESTADOBENEFICIARIOCOREPEVCUSUARIO = "Clas_1431710597120636Ser_6Arg_2_Alias";
    /** <code>estadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIOINSESTADOBENEFICIARIOCOREPEVCUSUARIO = "UsuarioS";
    // Service (DelEstadoBeneficiarioCORE)
    /** <code>DelEstadoBeneficiarioCORE</code> service id. */
    public static final String SERV_ID_DELESTADOBENEFICIARIOCORE = "Clas_1431710597120636Ser_7_Alias";
    /** <code>DelEstadoBeneficiarioCORE</code> service name. */
    public static final String SERV_NAME_DELESTADOBENEFICIARIOCORE = "DelEstadoBeneficiarioCORE";
    /** <code>DelEstadoBeneficiarioCORE</code> service alias. */
    public static final String SERV_ALIAS_DELESTADOBENEFICIARIOCORE = "DelEstadoBeneficiarioCORE";
    /** Agents allowed to execute the service DelEstadoBeneficiarioCORE **/
    public static final String DELESTADOBENEFICIARIOCORE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>estadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiario</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIODELESTADOBENEFICIARIOCOREPTHISESTADOBENEFICIARIO = "p_thisEstadoBeneficiario";
    /** <code>estadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiario</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIODELESTADOBENEFICIARIOCOREPTHISESTADOBENEFICIARIO = "Clas_1431710597120636Ser_7Arg_1_Alias";
    /** <code>estadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiario</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIODELESTADOBENEFICIARIOCOREPTHISESTADOBENEFICIARIO = "Estado beneficiario CORE";
    /** <code>estadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuario</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIODELESTADOBENEFICIARIOCOREPEVCUSUARIO = "p_evcUsuario";
    /** <code>estadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuario</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIODELESTADOBENEFICIARIOCOREPEVCUSUARIO = "Clas_1431710597120636Ser_7Arg_2_Alias";
    /** <code>estadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIODELESTADOBENEFICIARIOCOREPEVCUSUARIO = "UsuarioS";
    // Service (InsEstadoBeneficiarioC)
    /** <code>InsEstadoBeneficiarioC</code> service id. */
    public static final String SERV_ID_INSESTADOBENEFICIARIOC = "Clas_1431710597120636Ser_8_Alias";
    /** <code>InsEstadoBeneficiarioC</code> service name. */
    public static final String SERV_NAME_INSESTADOBENEFICIARIOC = "InsEstadoBeneficiarioC";
    /** <code>InsEstadoBeneficiarioC</code> service alias. */
    public static final String SERV_ALIAS_INSESTADOBENEFICIARIOC = "InsEstadoBeneficiarioC";
    /** Agents allowed to execute the service InsEstadoBeneficiarioC **/
    public static final String INSESTADOBENEFICIARIOC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>estadoBeneficiarioInsEstadoBeneficiarioCpthisEstadoBeneficiario</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOBENEFICIARIOC_ESTADOBENEFICIARIOINSESTADOBENEFICIARIOCPTHISESTADOBENEFICIARIO = "p_thisEstadoBeneficiario";
    /** <code>estadoBeneficiarioInsEstadoBeneficiarioCpthisEstadoBeneficiario</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOBENEFICIARIOC_ESTADOBENEFICIARIOINSESTADOBENEFICIARIOCPTHISESTADOBENEFICIARIO = "Clas_1431710597120636Ser_8Arg_1_Alias";
    /** <code>estadoBeneficiarioInsEstadoBeneficiarioCpthisEstadoBeneficiario</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOBENEFICIARIOC_ESTADOBENEFICIARIOINSESTADOBENEFICIARIOCPTHISESTADOBENEFICIARIO = "Estado beneficiario";
    /** <code>estadoBeneficiarioInsEstadoBeneficiarioCpevcBeneficiarioC</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOBENEFICIARIOC_ESTADOBENEFICIARIOINSESTADOBENEFICIARIOCPEVCBENEFICIARIOC = "p_evcBeneficiarioC";
    /** <code>estadoBeneficiarioInsEstadoBeneficiarioCpevcBeneficiarioC</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOBENEFICIARIOC_ESTADOBENEFICIARIOINSESTADOBENEFICIARIOCPEVCBENEFICIARIOC = "Clas_1431710597120636Ser_8Arg_2_Alias";
    /** <code>estadoBeneficiarioInsEstadoBeneficiarioCpevcBeneficiarioC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOBENEFICIARIOC_ESTADOBENEFICIARIOINSESTADOBENEFICIARIOCPEVCBENEFICIARIOC = "Beneficiarios";
    // Service (DelEstadoBeneficiarioC)
    /** <code>DelEstadoBeneficiarioC</code> service id. */
    public static final String SERV_ID_DELESTADOBENEFICIARIOC = "Clas_1431710597120636Ser_9_Alias";
    /** <code>DelEstadoBeneficiarioC</code> service name. */
    public static final String SERV_NAME_DELESTADOBENEFICIARIOC = "DelEstadoBeneficiarioC";
    /** <code>DelEstadoBeneficiarioC</code> service alias. */
    public static final String SERV_ALIAS_DELESTADOBENEFICIARIOC = "DelEstadoBeneficiarioC";
    /** Agents allowed to execute the service DelEstadoBeneficiarioC **/
    public static final String DELESTADOBENEFICIARIOC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>estadoBeneficiarioDelEstadoBeneficiarioCpthisEstadoBeneficiario</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOBENEFICIARIOC_ESTADOBENEFICIARIODELESTADOBENEFICIARIOCPTHISESTADOBENEFICIARIO = "p_thisEstadoBeneficiario";
    /** <code>estadoBeneficiarioDelEstadoBeneficiarioCpthisEstadoBeneficiario</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOBENEFICIARIOC_ESTADOBENEFICIARIODELESTADOBENEFICIARIOCPTHISESTADOBENEFICIARIO = "Clas_1431710597120636Ser_9Arg_1_Alias";
    /** <code>estadoBeneficiarioDelEstadoBeneficiarioCpthisEstadoBeneficiario</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOBENEFICIARIOC_ESTADOBENEFICIARIODELESTADOBENEFICIARIOCPTHISESTADOBENEFICIARIO = "Estado beneficiario";
    /** <code>estadoBeneficiarioDelEstadoBeneficiarioCpevcBeneficiarioC</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOBENEFICIARIOC_ESTADOBENEFICIARIODELESTADOBENEFICIARIOCPEVCBENEFICIARIOC = "p_evcBeneficiarioC";
    /** <code>estadoBeneficiarioDelEstadoBeneficiarioCpevcBeneficiarioC</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOBENEFICIARIOC_ESTADOBENEFICIARIODELESTADOBENEFICIARIOCPEVCBENEFICIARIOC = "Clas_1431710597120636Ser_9Arg_2_Alias";
    /** <code>estadoBeneficiarioDelEstadoBeneficiarioCpevcBeneficiarioC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOBENEFICIARIOC_ESTADOBENEFICIARIODELESTADOBENEFICIARIOCPEVCBENEFICIARIOC = "Beneficiarios";
    // Service (InsEstadoBeneficiario)
    /** <code>InsEstadoBeneficiario</code> service id. */
    public static final String SERV_ID_INSESTADOBENEFICIARIO = "Clas_1431710597120636Ser_10_Alias";
    /** <code>InsEstadoBeneficiario</code> service name. */
    public static final String SERV_NAME_INSESTADOBENEFICIARIO = "InsEstadoBeneficiario";
    /** <code>InsEstadoBeneficiario</code> service alias. */
    public static final String SERV_ALIAS_INSESTADOBENEFICIARIO = "InsEstadoBeneficiario";
    /** Agents allowed to execute the service InsEstadoBeneficiario **/
    public static final String INSESTADOBENEFICIARIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>estadoBeneficiarioInsEstadoBeneficiariopthisEstadoBeneficiario</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOBENEFICIARIO_ESTADOBENEFICIARIOINSESTADOBENEFICIARIOPTHISESTADOBENEFICIARIO = "p_thisEstadoBeneficiario";
    /** <code>estadoBeneficiarioInsEstadoBeneficiariopthisEstadoBeneficiario</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOBENEFICIARIO_ESTADOBENEFICIARIOINSESTADOBENEFICIARIOPTHISESTADOBENEFICIARIO = "Clas_1431710597120636Ser_10Arg_1_Alias";
    /** <code>estadoBeneficiarioInsEstadoBeneficiariopthisEstadoBeneficiario</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOBENEFICIARIO_ESTADOBENEFICIARIOINSESTADOBENEFICIARIOPTHISESTADOBENEFICIARIO = "EstadoBeneficiario";
    /** <code>estadoBeneficiarioInsEstadoBeneficiariopevcUsuarioNovedad</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOBENEFICIARIO_ESTADOBENEFICIARIOINSESTADOBENEFICIARIOPEVCUSUARIONOVEDAD = "p_evcUsuarioNovedad";
    /** <code>estadoBeneficiarioInsEstadoBeneficiariopevcUsuarioNovedad</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOBENEFICIARIO_ESTADOBENEFICIARIOINSESTADOBENEFICIARIOPEVCUSUARIONOVEDAD = "Clas_1431710597120636Ser_10Arg_2_Alias";
    /** <code>estadoBeneficiarioInsEstadoBeneficiariopevcUsuarioNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOBENEFICIARIO_ESTADOBENEFICIARIOINSESTADOBENEFICIARIOPEVCUSUARIONOVEDAD = "UsuariosNovedad";
    // Service (DelEstadoBeneficiario)
    /** <code>DelEstadoBeneficiario</code> service id. */
    public static final String SERV_ID_DELESTADOBENEFICIARIO = "Clas_1431710597120636Ser_11_Alias";
    /** <code>DelEstadoBeneficiario</code> service name. */
    public static final String SERV_NAME_DELESTADOBENEFICIARIO = "DelEstadoBeneficiario";
    /** <code>DelEstadoBeneficiario</code> service alias. */
    public static final String SERV_ALIAS_DELESTADOBENEFICIARIO = "DelEstadoBeneficiario";
    /** Agents allowed to execute the service DelEstadoBeneficiario **/
    public static final String DELESTADOBENEFICIARIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>estadoBeneficiarioDelEstadoBeneficiariopthisEstadoBeneficiario</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOBENEFICIARIO_ESTADOBENEFICIARIODELESTADOBENEFICIARIOPTHISESTADOBENEFICIARIO = "p_thisEstadoBeneficiario";
    /** <code>estadoBeneficiarioDelEstadoBeneficiariopthisEstadoBeneficiario</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOBENEFICIARIO_ESTADOBENEFICIARIODELESTADOBENEFICIARIOPTHISESTADOBENEFICIARIO = "Clas_1431710597120636Ser_11Arg_1_Alias";
    /** <code>estadoBeneficiarioDelEstadoBeneficiariopthisEstadoBeneficiario</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOBENEFICIARIO_ESTADOBENEFICIARIODELESTADOBENEFICIARIOPTHISESTADOBENEFICIARIO = "EstadoBeneficiario";
    /** <code>estadoBeneficiarioDelEstadoBeneficiariopevcUsuarioNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOBENEFICIARIO_ESTADOBENEFICIARIODELESTADOBENEFICIARIOPEVCUSUARIONOVEDAD = "p_evcUsuarioNovedad";
    /** <code>estadoBeneficiarioDelEstadoBeneficiariopevcUsuarioNovedad</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOBENEFICIARIO_ESTADOBENEFICIARIODELESTADOBENEFICIARIOPEVCUSUARIONOVEDAD = "Clas_1431710597120636Ser_11Arg_2_Alias";
    /** <code>estadoBeneficiarioDelEstadoBeneficiariopevcUsuarioNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOBENEFICIARIO_ESTADOBENEFICIARIODELESTADOBENEFICIARIOPEVCUSUARIONOVEDAD = "UsuariosNovedad";

    public static final String FILTER_NAME_IFESTADOBENEFICIARIOCODIGO = "iF_EstadoBeneficiarioCodigo";
    public static final String VAR_NAME_IFESTADOBENEFICIARIOCODIGO_VCODIGO = "v_Codigo";
    public static final String FILTER_NAME_ICESTADOBENEFICIARIOPORNOMBRE = "IC_EstadoBeneficiarioPorNombre";
    public static final String VAR_NAME_ICESTADOBENEFICIARIOPORNOMBRE_VNOMBRE = "vNombre";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_ESTADOBENEFICIARIODESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_ESTADOBENEFICIARIOESACTIVO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_ESTADOBENEFICIARIOCONFIRMADO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_ESTADOBENEFICIARIOESERROR.toUpperCase(), Constants.Type.BOOL.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_ESTADOBENEFICIARIOCODIGO.toUpperCase(), ESTADOBENEFICIARIOCODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_ESTADOBENEFICIARIODESCRIPCION.toUpperCase(), ESTADOBENEFICIARIODESCRIPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_ESTADOBENEFICIARIOESACTIVO.toUpperCase(), ESTADOBENEFICIARIOESACTIVO_AGENTS);
    	attributeAgents.put(ATTR_NAME_ESTADOBENEFICIARIOCONFIRMADO.toUpperCase(), ESTADOBENEFICIARIOCONFIRMADO_AGENTS);
    	attributeAgents.put(ATTR_NAME_ESTADOBENEFICIARIOESERROR.toUpperCase(), ESTADOBENEFICIARIOESERROR_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'EstadoBeneficiario', it returns the identification keys
     * - If className is a facet of the inheritance net of 'EstadoBeneficiario', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_ESTADOBENEFICIARIOCODIGO);
        }
        // Facet 'EstadoBeneficiario' (This facet)
        if (EstadoBeneficiarioConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_ESTADOBENEFICIARIOCODIGO);
        }
        return returnList;
    }
}
