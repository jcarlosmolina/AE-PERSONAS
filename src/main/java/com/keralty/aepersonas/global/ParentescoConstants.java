package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>Parentesco</code> model class.
 */
public final class ParentescoConstants {

    private ParentescoConstants() {

    }

    // Class
    /** <code>Parentesco</code> class id. */
    public static final String CLASS_ID = "Clas_1431698145280871_Alias";
    /** <code>Parentesco</code> class name. */
    public static final String CLASS_NAME = "Parentesco";
    /** <code>Parentesco</code> class alias. */
    public static final String CLASS_ALIAS = "Parentesco";
    /** <code>Parentesco</code> class table name. */
    public static final String TBL_NAME = "Parentesco";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "parentescoCodigo,parentescoDescripcion,parentescoEsTitular,parentescoEsConyuge,parentescoEsPadre,parentescoEsHijo,parentescoNombreCorto";

    public static final String DSICPARENTESCO = "IC_Parentesco";
    

    // Attribute (parentescoCodigo)
    /** <code>parentescoCodigo</code> attribute id. */
    public static final String ATTR_ID_PARENTESCOCODIGO = "Clas_1431698145280871Atr_1_Alias";
    /** <code>parentescoCodigo</code> attribute name. */
    public static final String ATTR_NAME_PARENTESCOCODIGO = "parentescoCodigo";
    /** <code>parentescoCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_PARENTESCOCODIGO = "Código";

    /** <code>parentescoCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_PARENTESCOCODIGO = "";
    /** Agents allowed to view the attribute parentescoCodigo **/
    public static final String PARENTESCOCODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (parentescoDescripcion)
    /** <code>parentescoDescripcion</code> attribute id. */
    public static final String ATTR_ID_PARENTESCODESCRIPCION = "Clas_1431698145280871Atr_2_Alias";
    /** <code>parentescoDescripcion</code> attribute name. */
    public static final String ATTR_NAME_PARENTESCODESCRIPCION = "parentescoDescripcion";
    /** <code>parentescoDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_PARENTESCODESCRIPCION = "Descripción";

    /** <code>parentescoDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_PARENTESCODESCRIPCION = "";
    /** Agents allowed to view the attribute parentescoDescripcion **/
    public static final String PARENTESCODESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (parentescoEsTitular)
    /** <code>parentescoEsTitular</code> attribute id. */
    public static final String ATTR_ID_PARENTESCOESTITULAR = "Clas_1431698145280871Atr_3_Alias";
    /** <code>parentescoEsTitular</code> attribute name. */
    public static final String ATTR_NAME_PARENTESCOESTITULAR = "parentescoEsTitular";
    /** <code>parentescoEsTitular</code> attribute alias. */
    public static final String ATTR_ALIAS_PARENTESCOESTITULAR = "Es titular";

    /** <code>parentescoEsTitular</code> attribute facet sequence. */
    public static final String PATH_FACETS_PARENTESCOESTITULAR = "";
    /** Agents allowed to view the attribute parentescoEsTitular **/
    public static final String PARENTESCOESTITULAR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (parentescoEsConyuge)
    /** <code>parentescoEsConyuge</code> attribute id. */
    public static final String ATTR_ID_PARENTESCOESCONYUGE = "Clas_1431698145280871Atr_4_Alias";
    /** <code>parentescoEsConyuge</code> attribute name. */
    public static final String ATTR_NAME_PARENTESCOESCONYUGE = "parentescoEsConyuge";
    /** <code>parentescoEsConyuge</code> attribute alias. */
    public static final String ATTR_ALIAS_PARENTESCOESCONYUGE = "Es cónyuge";

    /** <code>parentescoEsConyuge</code> attribute facet sequence. */
    public static final String PATH_FACETS_PARENTESCOESCONYUGE = "";
    /** Agents allowed to view the attribute parentescoEsConyuge **/
    public static final String PARENTESCOESCONYUGE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (parentescoEsPadre)
    /** <code>parentescoEsPadre</code> attribute id. */
    public static final String ATTR_ID_PARENTESCOESPADRE = "Clas_1431698145280871Atr_5_Alias";
    /** <code>parentescoEsPadre</code> attribute name. */
    public static final String ATTR_NAME_PARENTESCOESPADRE = "parentescoEsPadre";
    /** <code>parentescoEsPadre</code> attribute alias. */
    public static final String ATTR_ALIAS_PARENTESCOESPADRE = "Es padre/madre";

    /** <code>parentescoEsPadre</code> attribute facet sequence. */
    public static final String PATH_FACETS_PARENTESCOESPADRE = "";
    /** Agents allowed to view the attribute parentescoEsPadre **/
    public static final String PARENTESCOESPADRE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (parentescoEsHijo)
    /** <code>parentescoEsHijo</code> attribute id. */
    public static final String ATTR_ID_PARENTESCOESHIJO = "Clas_1431698145280871Atr_6_Alias";
    /** <code>parentescoEsHijo</code> attribute name. */
    public static final String ATTR_NAME_PARENTESCOESHIJO = "parentescoEsHijo";
    /** <code>parentescoEsHijo</code> attribute alias. */
    public static final String ATTR_ALIAS_PARENTESCOESHIJO = "Es hijo";

    /** <code>parentescoEsHijo</code> attribute facet sequence. */
    public static final String PATH_FACETS_PARENTESCOESHIJO = "";
    /** Agents allowed to view the attribute parentescoEsHijo **/
    public static final String PARENTESCOESHIJO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (parentescoNombreCorto)
    /** <code>parentescoNombreCorto</code> attribute id. */
    public static final String ATTR_ID_PARENTESCONOMBRECORTO = "Clas_1431698145280871Atr_7_Alias";
    /** <code>parentescoNombreCorto</code> attribute name. */
    public static final String ATTR_NAME_PARENTESCONOMBRECORTO = "parentescoNombreCorto";
    /** <code>parentescoNombreCorto</code> attribute alias. */
    public static final String ATTR_ALIAS_PARENTESCONOMBRECORTO = "Nombre corto";

    /** <code>parentescoNombreCorto</code> attribute facet sequence. */
    public static final String PATH_FACETS_PARENTESCONOMBRECORTO = "";
    /** Agents allowed to view the attribute parentescoNombreCorto **/
    public static final String PARENTESCONOMBRECORTO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_PARENTESCOCODIGO = "Codigo";    
    /** <code>parentescoCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_PARENTESCOCODIGO = "parentescoCodigo";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_PARENTESCODESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_PARENTESCODESCRIPCIONLENGTH = 100;
    /** <code>parentescoDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_PARENTESCODESCRIPCION = "parentescoDescripcion";
    // Field (EsTitular)
    /** <code>EsTitular</code> field name. */
    public static final String FLD_PARENTESCOESTITULAR = "EsTitular";    
    /** <code>parentescoEsTitular</code> attribute field name. */
    public static final String ATTR_FIELD_PARENTESCOESTITULAR = "parentescoEsTitular";
    // Field (EsConyuge)
    /** <code>EsConyuge</code> field name. */
    public static final String FLD_PARENTESCOESCONYUGE = "EsConyuge";    
    /** <code>parentescoEsConyuge</code> attribute field name. */
    public static final String ATTR_FIELD_PARENTESCOESCONYUGE = "parentescoEsConyuge";
    // Field (EsPadre)
    /** <code>EsPadre</code> field name. */
    public static final String FLD_PARENTESCOESPADRE = "EsPadre";    
    /** <code>parentescoEsPadre</code> attribute field name. */
    public static final String ATTR_FIELD_PARENTESCOESPADRE = "parentescoEsPadre";
    // Field (EsHijo)
    /** <code>EsHijo</code> field name. */
    public static final String FLD_PARENTESCOESHIJO = "EsHijo";    
    /** <code>parentescoEsHijo</code> attribute field name. */
    public static final String ATTR_FIELD_PARENTESCOESHIJO = "parentescoEsHijo";
    // Field (NombreCorto)
    /** <code>NombreCorto</code> field name. */
    public static final String FLD_PARENTESCONOMBRECORTO = "NombreCorto";    
    /** <code>NombreCorto</code> field length. */
    public static final int FLD_PARENTESCONOMBRECORTOLENGTH = 10;
    /** <code>parentescoNombreCorto</code> attribute field name. */
    public static final String ATTR_FIELD_PARENTESCONOMBRECORTO = "parentescoNombreCorto";


    // Compound role (AtributosUsuario)
    /** <code>AtributosUsuario</code> role id. */
    public static final String ROLE_ID_ATRIBUTOSUSUARIO = "Agr_1432634130432359_Alias";
    /** <code>AtributosUsuario</code> role name. */
    public static final String ROLE_NAME_ATRIBUTOSUSUARIO = "atributosUsuario";
    /** <code>Parentesco</code> role alias. */
    public static final String ROLE_ALIAS_ATRIBUTOSUSUARIO = "Atributos usuario";


    /** <code>AtributosUsuario</code> inverse role name. */
    public static final String ROLE_INVNAME_ATRIBUTOSUSUARIO = UsuarioConstants.ROLE_NAME_PARENTESCO;
    /** <code>AtributosUsuario</code> role facet sequence. */
    public static final String PATH_FACETS_ATRIBUTOSUSUARIO = "";
    /** <code>AtributosUsuario</code> role target class. */
    public static final String ROLE_TARGET_ATRIBUTOSUSUARIO = UsuarioConstants.CLASS_NAME;
    /** Agents allowed to navigate through AtributosUsuario **/
    public static final String ATRIBUTOSUSUARIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (BeneficiariosC)
    /** <code>BeneficiariosC</code> role id. */
    public static final String ROLE_ID_BENEFICIARIOSC = "Agr_1473095008256356_Alias";
    /** <code>BeneficiariosC</code> role name. */
    public static final String ROLE_NAME_BENEFICIARIOSC = "beneficiariosC";
    /** <code>ParentescoC</code> role alias. */
    public static final String ROLE_ALIAS_BENEFICIARIOSC = "Beneficiarios";


    /** <code>BeneficiariosC</code> inverse role name. */
    public static final String ROLE_INVNAME_BENEFICIARIOSC = BeneficiarioCConstants.ROLE_NAME_PARENTESCOC;
    /** <code>BeneficiariosC</code> role facet sequence. */
    public static final String PATH_FACETS_BENEFICIARIOSC = "";
    /** <code>BeneficiariosC</code> role target class. */
    public static final String ROLE_TARGET_BENEFICIARIOSC = BeneficiarioCConstants.CLASS_NAME;
    /** Agents allowed to navigate through BeneficiariosC **/
    public static final String BENEFICIARIOSC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (UsuariosReg)
    /** <code>UsuariosReg</code> role id. */
    public static final String ROLE_ID_USUARIOSREG = "Agr_1434655129600852_Alias";
    /** <code>UsuariosReg</code> role name. */
    public static final String ROLE_NAME_USUARIOSREG = "usuariosReg";
    /** <code>Parentesco</code> role alias. */
    public static final String ROLE_ALIAS_USUARIOSREG = "Usuarios registrados";


    /** <code>UsuariosReg</code> inverse role name. */
    public static final String ROLE_INVNAME_USUARIOSREG = UsuarioRegConstants.ROLE_NAME_PARENTESCO;
    /** <code>UsuariosReg</code> role facet sequence. */
    public static final String PATH_FACETS_USUARIOSREG = "";
    /** <code>UsuariosReg</code> role target class. */
    public static final String ROLE_TARGET_USUARIOSREG = UsuarioRegConstants.CLASS_NAME;
    /** Agents allowed to navigate through UsuariosReg **/
    public static final String USUARIOSREG_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (ParentescosDom)
    /** <code>ParentescosDom</code> role id. */
    public static final String ROLE_ID_PARENTESCOSDOM = "Agr_1434710704128877_Alias";
    /** <code>ParentescosDom</code> role name. */
    public static final String ROLE_NAME_PARENTESCOSDOM = "parentescosDom";
    /** <code>Parentesco</code> role alias. */
    public static final String ROLE_ALIAS_PARENTESCOSDOM = "Parentescos dominio";


    /** <code>ParentescosDom</code> inverse role name. */
    public static final String ROLE_INVNAME_PARENTESCOSDOM = ParentescoDomConstants.ROLE_NAME_PARENTESCO;
    /** <code>ParentescosDom</code> role facet sequence. */
    public static final String PATH_FACETS_PARENTESCOSDOM = "";
    /** <code>ParentescosDom</code> role target class. */
    public static final String ROLE_TARGET_PARENTESCOSDOM = ParentescoDomConstants.CLASS_NAME;
    /** Agents allowed to navigate through ParentescosDom **/
    public static final String PARENTESCOSDOM_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (UsuariosNovedad)
    /** <code>UsuariosNovedad</code> role id. */
    public static final String ROLE_ID_USUARIOSNOVEDAD = "Agr_1581509509120422_Alias";
    /** <code>UsuariosNovedad</code> role name. */
    public static final String ROLE_NAME_USUARIOSNOVEDAD = "usuariosNovedad";
    /** <code>Parentesco</code> role alias. */
    public static final String ROLE_ALIAS_USUARIOSNOVEDAD = "UsuariosNovedad";


    /** <code>UsuariosNovedad</code> inverse role name. */
    public static final String ROLE_INVNAME_USUARIOSNOVEDAD = UsuarioNovedadConstants.ROLE_NAME_PARENTESCO;
    /** <code>UsuariosNovedad</code> role facet sequence. */
    public static final String PATH_FACETS_USUARIOSNOVEDAD = "";
    /** <code>UsuariosNovedad</code> role target class. */
    public static final String ROLE_TARGET_USUARIOSNOVEDAD = UsuarioNovedadConstants.CLASS_NAME;
    /** Agents allowed to navigate through UsuariosNovedad **/
    public static final String USUARIOSNOVEDAD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (UsuarioNovedad)
    /** <code>UsuarioNovedad</code> role id. */
    public static final String ROLE_ID_USUARIONOVEDAD = "Agr_1582116765696503_Alias";
    /** <code>UsuarioNovedad</code> role name. */
    public static final String ROLE_NAME_USUARIONOVEDAD = "usuarioNovedad";
    /** <code>ParentescoNuevo</code> role alias. */
    public static final String ROLE_ALIAS_USUARIONOVEDAD = "Usuario";


    /** <code>UsuarioNovedad</code> inverse role name. */
    public static final String ROLE_INVNAME_USUARIONOVEDAD = UsuarioNovedadConstants.ROLE_NAME_PARENTESCONUEVO;
    /** <code>UsuarioNovedad</code> role facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDAD = "";
    /** <code>UsuarioNovedad</code> role target class. */
    public static final String ROLE_TARGET_USUARIONOVEDAD = UsuarioNovedadConstants.CLASS_NAME;
    /** Agents allowed to navigate through UsuarioNovedad **/
    public static final String USUARIONOVEDAD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431698145280871Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear parentesco";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>parentescocrearpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PARENTESCOCREARPATRCODIGO = "p_atrCodigo";
    /** <code>parentescocrearpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PARENTESCOCREARPATRCODIGO = "Clas_1431698145280871Ser_1Arg_1_Alias";
    /** <code>parentescocrearpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PARENTESCOCREARPATRCODIGO = "Código";
    /** <code>parentescocrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PARENTESCOCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>parentescocrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PARENTESCOCREARPATRDESCRIPCION = "Clas_1431698145280871Ser_1Arg_2_Alias";
    /** <code>parentescocrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PARENTESCOCREARPATRDESCRIPCION = "Descripción";
    /** <code>parentescocrearpatrEsTitular</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PARENTESCOCREARPATRESTITULAR = "p_atrEsTitular";
    /** <code>parentescocrearpatrEsTitular</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PARENTESCOCREARPATRESTITULAR = "Clas_1431698145280871Ser_1Arg_3_Alias";
    /** <code>parentescocrearpatrEsTitular</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PARENTESCOCREARPATRESTITULAR = "Es titular";
    /** <code>parentescocrearpatrEsConyuge</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PARENTESCOCREARPATRESCONYUGE = "p_atrEsConyuge";
    /** <code>parentescocrearpatrEsConyuge</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PARENTESCOCREARPATRESCONYUGE = "Clas_1431698145280871Ser_1Arg_4_Alias";
    /** <code>parentescocrearpatrEsConyuge</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PARENTESCOCREARPATRESCONYUGE = "Es cónyuge";
    /** <code>parentescocrearpatrEsPadre</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PARENTESCOCREARPATRESPADRE = "p_atrEsPadre";
    /** <code>parentescocrearpatrEsPadre</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PARENTESCOCREARPATRESPADRE = "Clas_1431698145280871Ser_1Arg_5_Alias";
    /** <code>parentescocrearpatrEsPadre</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PARENTESCOCREARPATRESPADRE = "Es padre/madre";
    /** <code>parentescocrearpatrEsHijo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PARENTESCOCREARPATRESHIJO = "p_atrEsHijo";
    /** <code>parentescocrearpatrEsHijo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PARENTESCOCREARPATRESHIJO = "Clas_1431698145280871Ser_1Arg_6_Alias";
    /** <code>parentescocrearpatrEsHijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PARENTESCOCREARPATRESHIJO = "Es hijo";
    /** <code>parentescocrearpatrNombreCorto</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PARENTESCOCREARPATRNOMBRECORTO = "p_atrNombreCorto";
    /** <code>parentescocrearpatrNombreCorto</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PARENTESCOCREARPATRNOMBRECORTO = "Clas_1431698145280871Ser_1Arg_7_Alias";
    /** <code>parentescocrearpatrNombreCorto</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PARENTESCOCREARPATRNOMBRECORTO = "Nombre corto";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431698145280871Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar parentesco";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Preconditions
    /** <code>eliminar</code> precondition 0 id. */
    public static final String PRE_ID_ELIMINAR_0 = "Clas_1431698145280871Pre_1_MsgError";
    // Inbound arguments
    /** <code>parentescoeliminarpthisParentesco</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_PARENTESCOELIMINARPTHISPARENTESCO = "p_thisParentesco";
    /** <code>parentescoeliminarpthisParentesco</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_PARENTESCOELIMINARPTHISPARENTESCO = "Clas_1431698145280871Ser_2Arg_1_Alias";
    /** <code>parentescoeliminarpthisParentesco</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_PARENTESCOELIMINARPTHISPARENTESCO = "Parentesco";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1431698145280871Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar parentesco";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>parentescomodificarpthisParentesco</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PARENTESCOMODIFICARPTHISPARENTESCO = "p_thisParentesco";
    /** <code>parentescomodificarpthisParentesco</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PARENTESCOMODIFICARPTHISPARENTESCO = "Clas_1431698145280871Ser_3Arg_1_Alias";
    /** <code>parentescomodificarpthisParentesco</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PARENTESCOMODIFICARPTHISPARENTESCO = "Parentesco";
    /** <code>parentescomodificarpEsTitular</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PARENTESCOMODIFICARPESTITULAR = "p_EsTitular";
    /** <code>parentescomodificarpEsTitular</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PARENTESCOMODIFICARPESTITULAR = "Clas_1431698145280871Ser_3Arg_2_Alias";
    /** <code>parentescomodificarpEsTitular</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PARENTESCOMODIFICARPESTITULAR = "Es titular";
    /** <code>parentescomodificarpEsConyuge</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PARENTESCOMODIFICARPESCONYUGE = "p_EsConyuge";
    /** <code>parentescomodificarpEsConyuge</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PARENTESCOMODIFICARPESCONYUGE = "Clas_1431698145280871Ser_3Arg_3_Alias";
    /** <code>parentescomodificarpEsConyuge</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PARENTESCOMODIFICARPESCONYUGE = "Es cónyuge";
    /** <code>parentescomodificarpEsPadre</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PARENTESCOMODIFICARPESPADRE = "p_EsPadre";
    /** <code>parentescomodificarpEsPadre</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PARENTESCOMODIFICARPESPADRE = "Clas_1431698145280871Ser_3Arg_4_Alias";
    /** <code>parentescomodificarpEsPadre</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PARENTESCOMODIFICARPESPADRE = "Es padre/madre";
    /** <code>parentescomodificarpEsHijo</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PARENTESCOMODIFICARPESHIJO = "p_EsHijo";
    /** <code>parentescomodificarpEsHijo</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PARENTESCOMODIFICARPESHIJO = "Clas_1431698145280871Ser_3Arg_5_Alias";
    /** <code>parentescomodificarpEsHijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PARENTESCOMODIFICARPESHIJO = "Es hijo";
    // Service (sincronizar)
    /** <code>sincronizar</code> service id. */
    public static final String SERV_ID_SINCRONIZAR = "Clas_1431698145280871Ser_4_Alias";
    /** <code>sincronizar</code> service name. */
    public static final String SERV_NAME_SINCRONIZAR = "sincronizar";
    /** <code>sincronizar</code> service alias. */
    public static final String SERV_ALIAS_SINCRONIZAR = "sincronizar";
    /** Agents allowed to execute the service sincronizar **/
    public static final String SINCRONIZAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>parentescosincronizarpthisParentesco</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_PARENTESCOSINCRONIZARPTHISPARENTESCO = "p_thisParentesco";
    /** <code>parentescosincronizarpthisParentesco</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_PARENTESCOSINCRONIZARPTHISPARENTESCO = "Clas_1431698145280871Ser_4Arg_1_Alias";
    /** <code>parentescosincronizarpthisParentesco</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_PARENTESCOSINCRONIZARPTHISPARENTESCO = "Parentesco";
    /** <code>parentescosincronizarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_PARENTESCOSINCRONIZARPDESCRIPCION = "p_Descripcion";
    /** <code>parentescosincronizarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_PARENTESCOSINCRONIZARPDESCRIPCION = "Clas_1431698145280871Ser_4Arg_2_Alias";
    /** <code>parentescosincronizarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_PARENTESCOSINCRONIZARPDESCRIPCION = "Descripción";
    /** <code>parentescosincronizarpNombreCorto</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_PARENTESCOSINCRONIZARPNOMBRECORTO = "pNombreCorto";
    /** <code>parentescosincronizarpNombreCorto</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_PARENTESCOSINCRONIZARPNOMBRECORTO = "Clas_1431698145280871Ser_4Arg_7_Alias";
    /** <code>parentescosincronizarpNombreCorto</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_PARENTESCOSINCRONIZARPNOMBRECORTO = "Nombre corto";
    // Service (InsParentescoUsuario)
    /** <code>InsParentescoUsuario</code> service id. */
    public static final String SERV_ID_INSPARENTESCOUSUARIO = "Clas_1431698145280871Ser_7_Alias";
    /** <code>InsParentescoUsuario</code> service name. */
    public static final String SERV_NAME_INSPARENTESCOUSUARIO = "InsParentescoUsuario";
    /** <code>InsParentescoUsuario</code> service alias. */
    public static final String SERV_ALIAS_INSPARENTESCOUSUARIO = "InsParentescoUsuario";
    /** Agents allowed to execute the service InsParentescoUsuario **/
    public static final String INSPARENTESCOUSUARIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>parentescoInsParentescoUsuariopthisParentesco</code> inbound argument name. */
    public static final String ARG_NAME_INSPARENTESCOUSUARIO_PARENTESCOINSPARENTESCOUSUARIOPTHISPARENTESCO = "p_thisParentesco";
    /** <code>parentescoInsParentescoUsuariopthisParentesco</code> inbound argument id. */
    public static final String ARG_ID_INSPARENTESCOUSUARIO_PARENTESCOINSPARENTESCOUSUARIOPTHISPARENTESCO = "Clas_1431698145280871Ser_7Arg_1_Alias";
    /** <code>parentescoInsParentescoUsuariopthisParentesco</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPARENTESCOUSUARIO_PARENTESCOINSPARENTESCOUSUARIOPTHISPARENTESCO = "Parentesco";
    /** <code>parentescoInsParentescoUsuariopevcUsuario</code> inbound argument name. */
    public static final String ARG_NAME_INSPARENTESCOUSUARIO_PARENTESCOINSPARENTESCOUSUARIOPEVCUSUARIO = "p_evcUsuario";
    /** <code>parentescoInsParentescoUsuariopevcUsuario</code> inbound argument id. */
    public static final String ARG_ID_INSPARENTESCOUSUARIO_PARENTESCOINSPARENTESCOUSUARIOPEVCUSUARIO = "Clas_1431698145280871Ser_7Arg_2_Alias";
    /** <code>parentescoInsParentescoUsuariopevcUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPARENTESCOUSUARIO_PARENTESCOINSPARENTESCOUSUARIOPEVCUSUARIO = "Atributos usuario";
    // Service (DelParentescorUsuario)
    /** <code>DelParentescorUsuario</code> service id. */
    public static final String SERV_ID_DELPARENTESCORUSUARIO = "Clas_1431698145280871Ser_8_Alias";
    /** <code>DelParentescorUsuario</code> service name. */
    public static final String SERV_NAME_DELPARENTESCORUSUARIO = "DelParentescorUsuario";
    /** <code>DelParentescorUsuario</code> service alias. */
    public static final String SERV_ALIAS_DELPARENTESCORUSUARIO = "DelParentescorUsuario";
    /** Agents allowed to execute the service DelParentescorUsuario **/
    public static final String DELPARENTESCORUSUARIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>parentescoDelParentescorUsuariopthisParentesco</code> inbound argument name. */
    public static final String ARG_NAME_DELPARENTESCORUSUARIO_PARENTESCODELPARENTESCORUSUARIOPTHISPARENTESCO = "p_thisParentesco";
    /** <code>parentescoDelParentescorUsuariopthisParentesco</code> inbound argument id. */
    public static final String ARG_ID_DELPARENTESCORUSUARIO_PARENTESCODELPARENTESCORUSUARIOPTHISPARENTESCO = "Clas_1431698145280871Ser_8Arg_1_Alias";
    /** <code>parentescoDelParentescorUsuariopthisParentesco</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPARENTESCORUSUARIO_PARENTESCODELPARENTESCORUSUARIOPTHISPARENTESCO = "Parentesco";
    /** <code>parentescoDelParentescorUsuariopevcUsuario</code> inbound argument name. */
    public static final String ARG_NAME_DELPARENTESCORUSUARIO_PARENTESCODELPARENTESCORUSUARIOPEVCUSUARIO = "p_evcUsuario";
    /** <code>parentescoDelParentescorUsuariopevcUsuario</code> inbound argument id. */
    public static final String ARG_ID_DELPARENTESCORUSUARIO_PARENTESCODELPARENTESCORUSUARIOPEVCUSUARIO = "Clas_1431698145280871Ser_8Arg_2_Alias";
    /** <code>parentescoDelParentescorUsuariopevcUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPARENTESCORUSUARIO_PARENTESCODELPARENTESCORUSUARIOPEVCUSUARIO = "Atributos usuario";
    // Service (chgParentescoC)
    /** <code>chgParentescoC</code> service id. */
    public static final String SERV_ID_CHGPARENTESCOC = "Clas_1431698145280871Ser_9_Alias";
    /** <code>chgParentescoC</code> service name. */
    public static final String SERV_NAME_CHGPARENTESCOC = "chgParentescoC";
    /** <code>chgParentescoC</code> service alias. */
    public static final String SERV_ALIAS_CHGPARENTESCOC = "chgParentescoC";
    /** Agents allowed to execute the service chgParentescoC **/
    public static final String CHGPARENTESCOC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>parentescochgParentescoCpthisParentesco</code> inbound argument name. */
    public static final String ARG_NAME_CHGPARENTESCOC_PARENTESCOCHGPARENTESCOCPTHISPARENTESCO = "p_thisParentesco";
    /** <code>parentescochgParentescoCpthisParentesco</code> inbound argument id. */
    public static final String ARG_ID_CHGPARENTESCOC_PARENTESCOCHGPARENTESCOCPTHISPARENTESCO = "Clas_1431698145280871Ser_9Arg_1_Alias";
    /** <code>parentescochgParentescoCpthisParentesco</code> inbound argument alias. */
    public static final String ARG_ALIAS_CHGPARENTESCOC_PARENTESCOCHGPARENTESCOCPTHISPARENTESCO = "Parentesco";
    /** <code>parentescochgParentescoCpevcBeneficiarioC</code> inbound argument name. */
    public static final String ARG_NAME_CHGPARENTESCOC_PARENTESCOCHGPARENTESCOCPEVCBENEFICIARIOC = "p_evcBeneficiarioC";
    /** <code>parentescochgParentescoCpevcBeneficiarioC</code> inbound argument id. */
    public static final String ARG_ID_CHGPARENTESCOC_PARENTESCOCHGPARENTESCOCPEVCBENEFICIARIOC = "Clas_1431698145280871Ser_9Arg_2_Alias";
    /** <code>parentescochgParentescoCpevcBeneficiarioC</code> inbound argument alias. */
    public static final String ARG_ALIAS_CHGPARENTESCOC_PARENTESCOCHGPARENTESCOCPEVCBENEFICIARIOC = "Beneficiarios";
    // Service (InsParentescoUsuNovedad)
    /** <code>InsParentescoUsuNovedad</code> service id. */
    public static final String SERV_ID_INSPARENTESCOUSUNOVEDAD = "Clas_1431698145280871Ser_10_Alias";
    /** <code>InsParentescoUsuNovedad</code> service name. */
    public static final String SERV_NAME_INSPARENTESCOUSUNOVEDAD = "InsParentescoUsuNovedad";
    /** <code>InsParentescoUsuNovedad</code> service alias. */
    public static final String SERV_ALIAS_INSPARENTESCOUSUNOVEDAD = "InsParentescoUsuNovedad";
    /** Agents allowed to execute the service InsParentescoUsuNovedad **/
    public static final String INSPARENTESCOUSUNOVEDAD_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>parentescoInsParentescoUsuNovedadpthisParentesco</code> inbound argument name. */
    public static final String ARG_NAME_INSPARENTESCOUSUNOVEDAD_PARENTESCOINSPARENTESCOUSUNOVEDADPTHISPARENTESCO = "p_thisParentesco";
    /** <code>parentescoInsParentescoUsuNovedadpthisParentesco</code> inbound argument id. */
    public static final String ARG_ID_INSPARENTESCOUSUNOVEDAD_PARENTESCOINSPARENTESCOUSUNOVEDADPTHISPARENTESCO = "Clas_1431698145280871Ser_10Arg_1_Alias";
    /** <code>parentescoInsParentescoUsuNovedadpthisParentesco</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPARENTESCOUSUNOVEDAD_PARENTESCOINSPARENTESCOUSUNOVEDADPTHISPARENTESCO = "Parentesco";
    /** <code>parentescoInsParentescoUsuNovedadpevcUsuarioNovedad</code> inbound argument name. */
    public static final String ARG_NAME_INSPARENTESCOUSUNOVEDAD_PARENTESCOINSPARENTESCOUSUNOVEDADPEVCUSUARIONOVEDAD = "p_evcUsuarioNovedad";
    /** <code>parentescoInsParentescoUsuNovedadpevcUsuarioNovedad</code> inbound argument id. */
    public static final String ARG_ID_INSPARENTESCOUSUNOVEDAD_PARENTESCOINSPARENTESCOUSUNOVEDADPEVCUSUARIONOVEDAD = "Clas_1431698145280871Ser_10Arg_2_Alias";
    /** <code>parentescoInsParentescoUsuNovedadpevcUsuarioNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPARENTESCOUSUNOVEDAD_PARENTESCOINSPARENTESCOUSUNOVEDADPEVCUSUARIONOVEDAD = "UsuariosNovedad";
    // Service (DelParentescoUsuNovedad)
    /** <code>DelParentescoUsuNovedad</code> service id. */
    public static final String SERV_ID_DELPARENTESCOUSUNOVEDAD = "Clas_1431698145280871Ser_11_Alias";
    /** <code>DelParentescoUsuNovedad</code> service name. */
    public static final String SERV_NAME_DELPARENTESCOUSUNOVEDAD = "DelParentescoUsuNovedad";
    /** <code>DelParentescoUsuNovedad</code> service alias. */
    public static final String SERV_ALIAS_DELPARENTESCOUSUNOVEDAD = "DelParentescoUsuNovedad";
    /** Agents allowed to execute the service DelParentescoUsuNovedad **/
    public static final String DELPARENTESCOUSUNOVEDAD_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>parentescoDelParentescoUsuNovedadpthisParentesco</code> inbound argument name. */
    public static final String ARG_NAME_DELPARENTESCOUSUNOVEDAD_PARENTESCODELPARENTESCOUSUNOVEDADPTHISPARENTESCO = "p_thisParentesco";
    /** <code>parentescoDelParentescoUsuNovedadpthisParentesco</code> inbound argument id. */
    public static final String ARG_ID_DELPARENTESCOUSUNOVEDAD_PARENTESCODELPARENTESCOUSUNOVEDADPTHISPARENTESCO = "Clas_1431698145280871Ser_11Arg_1_Alias";
    /** <code>parentescoDelParentescoUsuNovedadpthisParentesco</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPARENTESCOUSUNOVEDAD_PARENTESCODELPARENTESCOUSUNOVEDADPTHISPARENTESCO = "Parentesco";
    /** <code>parentescoDelParentescoUsuNovedadpevcUsuarioNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DELPARENTESCOUSUNOVEDAD_PARENTESCODELPARENTESCOUSUNOVEDADPEVCUSUARIONOVEDAD = "p_evcUsuarioNovedad";
    /** <code>parentescoDelParentescoUsuNovedadpevcUsuarioNovedad</code> inbound argument id. */
    public static final String ARG_ID_DELPARENTESCOUSUNOVEDAD_PARENTESCODELPARENTESCOUSUNOVEDADPEVCUSUARIONOVEDAD = "Clas_1431698145280871Ser_11Arg_2_Alias";
    /** <code>parentescoDelParentescoUsuNovedadpevcUsuarioNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPARENTESCOUSUNOVEDAD_PARENTESCODELPARENTESCOUSUNOVEDADPEVCUSUARIONOVEDAD = "UsuariosNovedad";
    // Service (InsParentescoNuevoUsuNovedad)
    /** <code>InsParentescoNuevoUsuNovedad</code> service id. */
    public static final String SERV_ID_INSPARENTESCONUEVOUSUNOVEDAD = "Clas_1431698145280871Ser_12_Alias";
    /** <code>InsParentescoNuevoUsuNovedad</code> service name. */
    public static final String SERV_NAME_INSPARENTESCONUEVOUSUNOVEDAD = "InsParentescoNuevoUsuNovedad";
    /** <code>InsParentescoNuevoUsuNovedad</code> service alias. */
    public static final String SERV_ALIAS_INSPARENTESCONUEVOUSUNOVEDAD = "InsParentescoNuevoUsuNovedad";
    /** Agents allowed to execute the service InsParentescoNuevoUsuNovedad **/
    public static final String INSPARENTESCONUEVOUSUNOVEDAD_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>parentescoInsParentescoNuevoUsuNovedadpthisParentesco</code> inbound argument name. */
    public static final String ARG_NAME_INSPARENTESCONUEVOUSUNOVEDAD_PARENTESCOINSPARENTESCONUEVOUSUNOVEDADPTHISPARENTESCO = "p_thisParentesco";
    /** <code>parentescoInsParentescoNuevoUsuNovedadpthisParentesco</code> inbound argument id. */
    public static final String ARG_ID_INSPARENTESCONUEVOUSUNOVEDAD_PARENTESCOINSPARENTESCONUEVOUSUNOVEDADPTHISPARENTESCO = "Clas_1431698145280871Ser_12Arg_1_Alias";
    /** <code>parentescoInsParentescoNuevoUsuNovedadpthisParentesco</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPARENTESCONUEVOUSUNOVEDAD_PARENTESCOINSPARENTESCONUEVOUSUNOVEDADPTHISPARENTESCO = "Parentesco nuevo";
    /** <code>parentescoInsParentescoNuevoUsuNovedadpevcUsuarioNovedad</code> inbound argument name. */
    public static final String ARG_NAME_INSPARENTESCONUEVOUSUNOVEDAD_PARENTESCOINSPARENTESCONUEVOUSUNOVEDADPEVCUSUARIONOVEDAD = "p_evcUsuarioNovedad";
    /** <code>parentescoInsParentescoNuevoUsuNovedadpevcUsuarioNovedad</code> inbound argument id. */
    public static final String ARG_ID_INSPARENTESCONUEVOUSUNOVEDAD_PARENTESCOINSPARENTESCONUEVOUSUNOVEDADPEVCUSUARIONOVEDAD = "Clas_1431698145280871Ser_12Arg_2_Alias";
    /** <code>parentescoInsParentescoNuevoUsuNovedadpevcUsuarioNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPARENTESCONUEVOUSUNOVEDAD_PARENTESCOINSPARENTESCONUEVOUSUNOVEDADPEVCUSUARIONOVEDAD = "Usuario";
    // Service (DelParentescoNuevoUsuNovedad)
    /** <code>DelParentescoNuevoUsuNovedad</code> service id. */
    public static final String SERV_ID_DELPARENTESCONUEVOUSUNOVEDAD = "Clas_1431698145280871Ser_13_Alias";
    /** <code>DelParentescoNuevoUsuNovedad</code> service name. */
    public static final String SERV_NAME_DELPARENTESCONUEVOUSUNOVEDAD = "DelParentescoNuevoUsuNovedad";
    /** <code>DelParentescoNuevoUsuNovedad</code> service alias. */
    public static final String SERV_ALIAS_DELPARENTESCONUEVOUSUNOVEDAD = "DelParentescoNuevoUsuNovedad";
    /** Agents allowed to execute the service DelParentescoNuevoUsuNovedad **/
    public static final String DELPARENTESCONUEVOUSUNOVEDAD_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>parentescoDelParentescoNuevoUsuNovedadpthisParentesco</code> inbound argument name. */
    public static final String ARG_NAME_DELPARENTESCONUEVOUSUNOVEDAD_PARENTESCODELPARENTESCONUEVOUSUNOVEDADPTHISPARENTESCO = "p_thisParentesco";
    /** <code>parentescoDelParentescoNuevoUsuNovedadpthisParentesco</code> inbound argument id. */
    public static final String ARG_ID_DELPARENTESCONUEVOUSUNOVEDAD_PARENTESCODELPARENTESCONUEVOUSUNOVEDADPTHISPARENTESCO = "Clas_1431698145280871Ser_13Arg_1_Alias";
    /** <code>parentescoDelParentescoNuevoUsuNovedadpthisParentesco</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPARENTESCONUEVOUSUNOVEDAD_PARENTESCODELPARENTESCONUEVOUSUNOVEDADPTHISPARENTESCO = "Parentesco nuevo";
    /** <code>parentescoDelParentescoNuevoUsuNovedadpevcUsuarioNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DELPARENTESCONUEVOUSUNOVEDAD_PARENTESCODELPARENTESCONUEVOUSUNOVEDADPEVCUSUARIONOVEDAD = "p_evcUsuarioNovedad";
    /** <code>parentescoDelParentescoNuevoUsuNovedadpevcUsuarioNovedad</code> inbound argument id. */
    public static final String ARG_ID_DELPARENTESCONUEVOUSUNOVEDAD_PARENTESCODELPARENTESCONUEVOUSUNOVEDADPEVCUSUARIONOVEDAD = "Clas_1431698145280871Ser_13Arg_2_Alias";
    /** <code>parentescoDelParentescoNuevoUsuNovedadpevcUsuarioNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPARENTESCONUEVOUSUNOVEDAD_PARENTESCODELPARENTESCONUEVOUSUNOVEDADPEVCUSUARIONOVEDAD = "Usuario";

    public static final String FILTER_NAME_IFPARENTESCOTITULAR = "iF_ParentescoTitular";
    public static final String FILTER_NAME_IFPARENTESCOCONYUGE = "iF_ParentescoConyuge";
    public static final String FILTER_NAME_IFPARENTESCOCODIGO = "iF_ParentescoCodigo";
    public static final String VAR_NAME_IFPARENTESCOCODIGO_VCODIGO = "v_Codigo";
    public static final String FILTER_NAME_IFPARENTESCONOMBRECORTO = "iF_ParentescoNombreCorto";
    public static final String VAR_NAME_IFPARENTESCONOMBRECORTO_VNOMCORTO = "vNomCorto";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_PARENTESCODESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PARENTESCOESTITULAR.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PARENTESCOESCONYUGE.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PARENTESCOESPADRE.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PARENTESCOESHIJO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PARENTESCONOMBRECORTO.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_PARENTESCOCODIGO.toUpperCase(), PARENTESCOCODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PARENTESCODESCRIPCION.toUpperCase(), PARENTESCODESCRIPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_PARENTESCOESTITULAR.toUpperCase(), PARENTESCOESTITULAR_AGENTS);
    	attributeAgents.put(ATTR_NAME_PARENTESCOESCONYUGE.toUpperCase(), PARENTESCOESCONYUGE_AGENTS);
    	attributeAgents.put(ATTR_NAME_PARENTESCOESPADRE.toUpperCase(), PARENTESCOESPADRE_AGENTS);
    	attributeAgents.put(ATTR_NAME_PARENTESCOESHIJO.toUpperCase(), PARENTESCOESHIJO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PARENTESCONOMBRECORTO.toUpperCase(), PARENTESCONOMBRECORTO_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'Parentesco', it returns the identification keys
     * - If className is a facet of the inheritance net of 'Parentesco', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_PARENTESCOCODIGO);
        }
        // Facet 'Parentesco' (This facet)
        if (ParentescoConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_PARENTESCOCODIGO);
        }
        return returnList;
    }
}
