package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>AnexoMat</code> model class.
 */
public final class AnexoMatConstants {

    private AnexoMatConstants() {

    }

    // Class
    /** <code>AnexoMat</code> class id. */
    public static final String CLASS_ID = "Clas_1432915542016062_Alias";
    /** <code>AnexoMat</code> class name. */
    public static final String CLASS_NAME = "AnexoMat";
    /** <code>AnexoMat</code> class alias. */
    public static final String CLASS_ALIAS = "Anexo maternidad";
    /** <code>AnexoMat</code> class table name. */
    public static final String TBL_NAME = "AnexoMat";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "anexoMatIdentificador,aesolicitudesidsolicitud,usuarioUsuarioIdentificador,periodicidadCodigo,institucionMatNeoInstitucionMaternalCodigo,anexoMatFechaUltRegla,anexoMatNumCuotas";

    

    // Attribute (anexoMatIdentificador)
    /** <code>anexoMatIdentificador</code> attribute id. */
    public static final String ATTR_ID_ANEXOMATIDENTIFICADOR = "Clas_1432915542016062Atr_1_Alias";
    /** <code>anexoMatIdentificador</code> attribute name. */
    public static final String ATTR_NAME_ANEXOMATIDENTIFICADOR = "anexoMatIdentificador";
    /** <code>anexoMatIdentificador</code> attribute alias. */
    public static final String ATTR_ALIAS_ANEXOMATIDENTIFICADOR = "Identificador";

    /** <code>anexoMatIdentificador</code> attribute facet sequence. */
    public static final String PATH_FACETS_ANEXOMATIDENTIFICADOR = "";
    /** Agents allowed to view the attribute anexoMatIdentificador **/
    public static final String ANEXOMATIDENTIFICADOR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (anexoMatFechaUltRegla)
    /** <code>anexoMatFechaUltRegla</code> attribute id. */
    public static final String ATTR_ID_ANEXOMATFECHAULTREGLA = "Clas_1432915542016062Atr_4_Alias";
    /** <code>anexoMatFechaUltRegla</code> attribute name. */
    public static final String ATTR_NAME_ANEXOMATFECHAULTREGLA = "anexoMatFechaUltRegla";
    /** <code>anexoMatFechaUltRegla</code> attribute alias. */
    public static final String ATTR_ALIAS_ANEXOMATFECHAULTREGLA = "Fecha última regla";

    /** <code>anexoMatFechaUltRegla</code> attribute facet sequence. */
    public static final String PATH_FACETS_ANEXOMATFECHAULTREGLA = "";
    /** Agents allowed to view the attribute anexoMatFechaUltRegla **/
    public static final String ANEXOMATFECHAULTREGLA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (anexoMatNumCuotas)
    /** <code>anexoMatNumCuotas</code> attribute id. */
    public static final String ATTR_ID_ANEXOMATNUMCUOTAS = "Clas_1432915542016062Atr_5_Alias";
    /** <code>anexoMatNumCuotas</code> attribute name. */
    public static final String ATTR_NAME_ANEXOMATNUMCUOTAS = "anexoMatNumCuotas";
    /** <code>anexoMatNumCuotas</code> attribute alias. */
    public static final String ATTR_ALIAS_ANEXOMATNUMCUOTAS = "Nº cuotas";

    /** <code>anexoMatNumCuotas</code> attribute facet sequence. */
    public static final String PATH_FACETS_ANEXOMATNUMCUOTAS = "";
    /** Agents allowed to view the attribute anexoMatNumCuotas **/
    public static final String ANEXOMATNUMCUOTAS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (anexoMatdrvValor)
    /** <code>anexoMatdrvValor</code> attribute id. */
    public static final String ATTR_ID_ANEXOMATDRVVALOR = "Clas_1432915542016062Atr_6_Alias";
    /** <code>anexoMatdrvValor</code> attribute name. */
    public static final String ATTR_NAME_ANEXOMATDRVVALOR = "anexoMatdrvValor";
    /** <code>anexoMatdrvValor</code> attribute alias. */
    public static final String ATTR_ALIAS_ANEXOMATDRVVALOR = "Valor";

    /** <code>anexoMatdrvValor</code> attribute facet sequence. */
    public static final String PATH_FACETS_ANEXOMATDRVVALOR = "";
    /** Agents allowed to view the attribute anexoMatdrvValor **/
    public static final String ANEXOMATDRVVALOR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Identificador)
    /** <code>Identificador</code> field name. */
    public static final String FLD_ANEXOMATIDENTIFICADOR = "Identificador";    
    /** <code>anexoMatIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_ANEXOMATIDENTIFICADOR = "anexoMatIdentificador";
    // Field (id_solicitud)
    /** <code>id_solicitud</code> field name. */
    public static final String FLD_AESOLICITUDESIDSOLICITUD = "id_solicitud";    
    /** <code>Usuario.Solicitud.Ae_solicitudes.aesolicitudesidsolicitud</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIO_SOLICITUD_AE_SOLICITUDES_AESOLICITUDESIDSOLICITUD = "aesolicitudesidsolicitud";
    // Field (Usuario_Identificador)
    /** <code>Usuario_Identificador</code> field name. */
    public static final String FLD_USUARIOUSUARIOIDENTIFICADOR = "Usuario_Identificador";    
    /** <code>Usuario.usuarioIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIO_USUARIOIDENTIFICADOR = "usuarioUsuarioIdentificador";
    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_PERIODICIDADCODIGO = "Codigo";    
    /** <code>Periodicidad.periodicidadCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_PERIODICIDAD_PERIODICIDADCODIGO = "periodicidadCodigo";
    // Field (InstitucionMaternal_Codigo)
    /** <code>InstitucionMaternal_Codigo</code> field name. */
    public static final String FLD_INSTITUCIONMATNEOINSTITUCIONMATERNALCODIGO = "InstitucionMaternal_Codigo";    
    /** <code>InstitucionMaternal_Codigo</code> field length. */
    public static final int FLD_INSTITUCIONMATNEOINSTITUCIONMATERNALCODIGOLENGTH = 20;
    /** <code>InstitucionMaternal.institucionMatNeoCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_INSTITUCIONMATERNAL_INSTITUCIONMATNEOCODIGO = "institucionMatNeoInstitucionMaternalCodigo";
    // Field (FechaUltRegla)
    /** <code>FechaUltRegla</code> field name. */
    public static final String FLD_ANEXOMATFECHAULTREGLA = "FechaUltRegla";    
    /** <code>anexoMatFechaUltRegla</code> attribute field name. */
    public static final String ATTR_FIELD_ANEXOMATFECHAULTREGLA = "anexoMatFechaUltRegla";
    // Field (NumCuotas)
    /** <code>NumCuotas</code> field name. */
    public static final String FLD_ANEXOMATNUMCUOTAS = "NumCuotas";    
    /** <code>anexoMatNumCuotas</code> attribute field name. */
    public static final String ATTR_FIELD_ANEXOMATNUMCUOTAS = "anexoMatNumCuotas";

    // Component role (Usuario)
    /** <code>Usuario</code> role id. */
    public static final String ROLE_ID_USUARIO = "Agr_1432916066304871_Alias";
    /** <code>Usuario</code> role name. */
    public static final String ROLE_NAME_USUARIO = "usuario";
    /** <code>Usuario</code> role alias. */
    public static final String ROLE_ALIAS_USUARIO = "Usuario";

    /** <code>Usuario</code> inverse role name. */
    public static final String ROLE_INVNAME_USUARIO = UsuarioConstants.ROLE_NAME_ANEXOMAT;
    /** <code>Usuario</code> role facet sequence. */
    public static final String PATH_FACETS_USUARIO = "";
    /** <code>Usuario</code> role target class. */
    public static final String ROLE_TARGET_USUARIO = UsuarioConstants.CLASS_NAME;

    /** Agents allowed to navigate through Usuario **/
    public static final String USUARIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Periodicidad)
    /** <code>Periodicidad</code> role id. */
    public static final String ROLE_ID_PERIODICIDAD = "Agr_1432916066304192_Alias";
    /** <code>Periodicidad</code> role name. */
    public static final String ROLE_NAME_PERIODICIDAD = "periodicidad";
    /** <code>Periodicidad</code> role alias. */
    public static final String ROLE_ALIAS_PERIODICIDAD = "Periodicidad";

    /** <code>Periodicidad</code> inverse role name. */
    public static final String ROLE_INVNAME_PERIODICIDAD = PeriodicidadConstants.ROLE_NAME_ANEXOSMAT;
    /** <code>Periodicidad</code> role facet sequence. */
    public static final String PATH_FACETS_PERIODICIDAD = "";
    /** <code>Periodicidad</code> role target class. */
    public static final String ROLE_TARGET_PERIODICIDAD = PeriodicidadConstants.CLASS_NAME;

    /** Agents allowed to navigate through Periodicidad **/
    public static final String PERIODICIDAD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (InstitucionMaternal)
    /** <code>InstitucionMaternal</code> role id. */
    public static final String ROLE_ID_INSTITUCIONMATERNAL = "Agr_1463993499648784_Alias";
    /** <code>InstitucionMaternal</code> role name. */
    public static final String ROLE_NAME_INSTITUCIONMATERNAL = "institucionMaternal";
    /** <code>InstitucionMaternal</code> role alias. */
    public static final String ROLE_ALIAS_INSTITUCIONMATERNAL = "Institución";

    /** <code>InstitucionMaternal</code> inverse role name. */
    public static final String ROLE_INVNAME_INSTITUCIONMATERNAL = InstitucionMatNeoConstants.ROLE_NAME_ANEXOMAT;
    /** <code>InstitucionMaternal</code> role facet sequence. */
    public static final String PATH_FACETS_INSTITUCIONMATERNAL = "";
    /** <code>InstitucionMaternal</code> role target class. */
    public static final String ROLE_TARGET_INSTITUCIONMATERNAL = InstitucionMatNeoConstants.CLASS_NAME;

    /** Agents allowed to navigate through InstitucionMaternal **/
    public static final String INSTITUCIONMATERNAL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1432915542016062Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Preconditions
    /** <code>crear</code> precondition 0 id. */
    public static final String PRE_ID_CREAR_0 = "Clas_1432915542016062Pre_1_MsgError";
    /** <code>crear</code> precondition 1 id. */
    public static final String PRE_ID_CREAR_1 = "Clas_1432915542016062Pre_5_MsgError";
    /** <code>crear</code> precondition 2 id. */
    public static final String PRE_ID_CREAR_2 = "Clas_1432915542016062Pre_6_MsgError";
    // Inbound arguments
    /** <code>anexoMatcrearpagrUsuario</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ANEXOMATCREARPAGRUSUARIO = "p_agrUsuario";
    /** <code>anexoMatcrearpagrUsuario</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ANEXOMATCREARPAGRUSUARIO = "Clas_1432915542016062Ser_1Arg_10_Alias";
    /** <code>anexoMatcrearpagrUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ANEXOMATCREARPAGRUSUARIO = "Usuario";
    /** <code>anexoMatcrearpagrInstitucionMaternal</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ANEXOMATCREARPAGRINSTITUCIONMATERNAL = "p_agrInstitucionMaternal";
    /** <code>anexoMatcrearpagrInstitucionMaternal</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ANEXOMATCREARPAGRINSTITUCIONMATERNAL = "Clas_1432915542016062Ser_1Arg_11_Alias";
    /** <code>anexoMatcrearpagrInstitucionMaternal</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ANEXOMATCREARPAGRINSTITUCIONMATERNAL = "Institución";
    /** <code>anexoMatcrearpagrPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ANEXOMATCREARPAGRPERIODICIDAD = "p_agrPeriodicidad";
    /** <code>anexoMatcrearpagrPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ANEXOMATCREARPAGRPERIODICIDAD = "Clas_1432915542016062Ser_1Arg_13_Alias";
    /** <code>anexoMatcrearpagrPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ANEXOMATCREARPAGRPERIODICIDAD = "Periodicidad";
    /** <code>anexoMatcrearpatrFechaUltRegla</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ANEXOMATCREARPATRFECHAULTREGLA = "p_atrFechaUltRegla";
    /** <code>anexoMatcrearpatrFechaUltRegla</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ANEXOMATCREARPATRFECHAULTREGLA = "Clas_1432915542016062Ser_1Arg_4_Alias";
    /** <code>anexoMatcrearpatrFechaUltRegla</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ANEXOMATCREARPATRFECHAULTREGLA = "Fecha última regla";
    /** <code>anexoMatcrearpatrNumCuotas</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ANEXOMATCREARPATRNUMCUOTAS = "p_atrNumCuotas";
    /** <code>anexoMatcrearpatrNumCuotas</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ANEXOMATCREARPATRNUMCUOTAS = "Clas_1432915542016062Ser_1Arg_5_Alias";
    /** <code>anexoMatcrearpatrNumCuotas</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ANEXOMATCREARPATRNUMCUOTAS = "Nº cuotas";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1432915542016062Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>anexoMateliminarpthisAnexoMat</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_ANEXOMATELIMINARPTHISANEXOMAT = "p_thisAnexoMat";
    /** <code>anexoMateliminarpthisAnexoMat</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_ANEXOMATELIMINARPTHISANEXOMAT = "Clas_1432915542016062Ser_2Arg_1_Alias";
    /** <code>anexoMateliminarpthisAnexoMat</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_ANEXOMATELIMINARPTHISANEXOMAT = "Anexo maternidad";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1432915542016062Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>anexoMatmodificarpthisAnexoMat</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_ANEXOMATMODIFICARPTHISANEXOMAT = "p_thisAnexoMat";
    /** <code>anexoMatmodificarpthisAnexoMat</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_ANEXOMATMODIFICARPTHISANEXOMAT = "Clas_1432915542016062Ser_3Arg_1_Alias";
    /** <code>anexoMatmodificarpthisAnexoMat</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_ANEXOMATMODIFICARPTHISANEXOMAT = "Anexo maternidad";
    /** <code>anexoMatmodificarpFechaUltRegla</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_ANEXOMATMODIFICARPFECHAULTREGLA = "p_FechaUltRegla";
    /** <code>anexoMatmodificarpFechaUltRegla</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_ANEXOMATMODIFICARPFECHAULTREGLA = "Clas_1432915542016062Ser_3Arg_4_Alias";
    /** <code>anexoMatmodificarpFechaUltRegla</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_ANEXOMATMODIFICARPFECHAULTREGLA = "Fecha última regla";
    /** <code>anexoMatmodificarpNumCuotas</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_ANEXOMATMODIFICARPNUMCUOTAS = "p_NumCuotas";
    /** <code>anexoMatmodificarpNumCuotas</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_ANEXOMATMODIFICARPNUMCUOTAS = "Clas_1432915542016062Ser_3Arg_5_Alias";
    /** <code>anexoMatmodificarpNumCuotas</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_ANEXOMATMODIFICARPNUMCUOTAS = "Nº cuotas";
    // Service (CambPeriodicidadAnexoMat)
    /** <code>CambPeriodicidadAnexoMat</code> service id. */
    public static final String SERV_ID_CAMBPERIODICIDADANEXOMAT = "Clas_1432915542016062Ser_5_Alias";
    /** <code>CambPeriodicidadAnexoMat</code> service name. */
    public static final String SERV_NAME_CAMBPERIODICIDADANEXOMAT = "CambPeriodicidadAnexoMat";
    /** <code>CambPeriodicidadAnexoMat</code> service alias. */
    public static final String SERV_ALIAS_CAMBPERIODICIDADANEXOMAT = "CambPeriodicidadAnexoMat";
    /** Agents allowed to execute the service CambPeriodicidadAnexoMat **/
    public static final String CAMBPERIODICIDADANEXOMAT_SRVAGENTS = "";
    // Inbound arguments
    /** <code>anexoMatCambPeriodicidadAnexoMatpthisAnexoMat</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPERIODICIDADANEXOMAT_ANEXOMATCAMBPERIODICIDADANEXOMATPTHISANEXOMAT = "p_thisAnexoMat";
    /** <code>anexoMatCambPeriodicidadAnexoMatpthisAnexoMat</code> inbound argument id. */
    public static final String ARG_ID_CAMBPERIODICIDADANEXOMAT_ANEXOMATCAMBPERIODICIDADANEXOMATPTHISANEXOMAT = "Clas_1432915542016062Ser_5Arg_1_Alias";
    /** <code>anexoMatCambPeriodicidadAnexoMatpthisAnexoMat</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPERIODICIDADANEXOMAT_ANEXOMATCAMBPERIODICIDADANEXOMATPTHISANEXOMAT = "Anexos maternidad";
    /** <code>anexoMatCambPeriodicidadAnexoMatpevcPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPERIODICIDADANEXOMAT_ANEXOMATCAMBPERIODICIDADANEXOMATPEVCPERIODICIDAD = "p_evcPeriodicidad";
    /** <code>anexoMatCambPeriodicidadAnexoMatpevcPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_CAMBPERIODICIDADANEXOMAT_ANEXOMATCAMBPERIODICIDADANEXOMATPEVCPERIODICIDAD = "Clas_1432915542016062Ser_5Arg_2_Alias";
    /** <code>anexoMatCambPeriodicidadAnexoMatpevcPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPERIODICIDADANEXOMAT_ANEXOMATCAMBPERIODICIDADANEXOMATPEVCPERIODICIDAD = "Periodicidad";
    // Service (CambiarInsInstitucionMaternal)
    /** <code>CambiarInsInstitucionMaternal</code> service id. */
    public static final String SERV_ID_CAMBIARINSINSTITUCIONMATERNAL = "Clas_1432915542016062Ser_8_Alias";
    /** <code>CambiarInsInstitucionMaternal</code> service name. */
    public static final String SERV_NAME_CAMBIARINSINSTITUCIONMATERNAL = "CambiarInsInstitucionMaternal";
    /** <code>CambiarInsInstitucionMaternal</code> service alias. */
    public static final String SERV_ALIAS_CAMBIARINSINSTITUCIONMATERNAL = "CambiarInsInstitucionMaternal";
    /** Agents allowed to execute the service CambiarInsInstitucionMaternal **/
    public static final String CAMBIARINSINSTITUCIONMATERNAL_SRVAGENTS = "";
    // Inbound arguments
    /** <code>anexoMatCambiarInsInstitucionMaternalpthisAnexoMat</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARINSINSTITUCIONMATERNAL_ANEXOMATCAMBIARINSINSTITUCIONMATERNALPTHISANEXOMAT = "p_thisAnexoMat";
    /** <code>anexoMatCambiarInsInstitucionMaternalpthisAnexoMat</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARINSINSTITUCIONMATERNAL_ANEXOMATCAMBIARINSINSTITUCIONMATERNALPTHISANEXOMAT = "Clas_1432915542016062Ser_8Arg_1_Alias";
    /** <code>anexoMatCambiarInsInstitucionMaternalpthisAnexoMat</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARINSINSTITUCIONMATERNAL_ANEXOMATCAMBIARINSINSTITUCIONMATERNALPTHISANEXOMAT = "Anexos";
    /** <code>anexoMatCambiarInsInstitucionMaternalpevcInstitucionMatNeo</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARINSINSTITUCIONMATERNAL_ANEXOMATCAMBIARINSINSTITUCIONMATERNALPEVCINSTITUCIONMATNEO = "p_evcInstitucionMatNeo";
    /** <code>anexoMatCambiarInsInstitucionMaternalpevcInstitucionMatNeo</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARINSINSTITUCIONMATERNAL_ANEXOMATCAMBIARINSINSTITUCIONMATERNALPEVCINSTITUCIONMATNEO = "Clas_1432915542016062Ser_8Arg_2_Alias";
    /** <code>anexoMatCambiarInsInstitucionMaternalpevcInstitucionMatNeo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARINSINSTITUCIONMATERNAL_ANEXOMATCAMBIARINSINSTITUCIONMATERNALPEVCINSTITUCIONMATNEO = "Institución";
    // Service (TMODIFICAR)
    /** <code>TMODIFICAR</code> service id. */
    public static final String SERV_ID_TMODIFICAR = "Clas_1432915542016062Ser_7_Alias";
    /** <code>TMODIFICAR</code> service name. */
    public static final String SERV_NAME_TMODIFICAR = "TMODIFICAR";
    /** <code>TMODIFICAR</code> service alias. */
    public static final String SERV_ALIAS_TMODIFICAR = "Modificar anexo de maternidad";
    /** Agents allowed to execute the service TMODIFICAR **/
    public static final String TMODIFICAR_SRVAGENTS = "";
    // Preconditions
    /** <code>TMODIFICAR</code> precondition 0 id. */
    public static final String PRE_ID_TMODIFICAR_0 = "Clas_1432915542016062Pre_2_MsgError";
    /** <code>TMODIFICAR</code> precondition 1 id. */
    public static final String PRE_ID_TMODIFICAR_1 = "Clas_1432915542016062Pre_3_MsgError";
    /** <code>TMODIFICAR</code> precondition 2 id. */
    public static final String PRE_ID_TMODIFICAR_2 = "Clas_1432915542016062Pre_4_MsgError";
    // Inbound arguments
    /** <code>anexoMatTMODIFICARpthisAnexoMat</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_ANEXOMATTMODIFICARPTHISANEXOMAT = "p_thisAnexoMat";
    /** <code>anexoMatTMODIFICARpthisAnexoMat</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_ANEXOMATTMODIFICARPTHISANEXOMAT = "Clas_1432915542016062Ser_7Arg_1_Alias";
    /** <code>anexoMatTMODIFICARpthisAnexoMat</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_ANEXOMATTMODIFICARPTHISANEXOMAT = "Anexo maternidad";
    /** <code>anexoMatTMODIFICARptpFechaUltRegla</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_ANEXOMATTMODIFICARPTPFECHAULTREGLA = "pt_p_FechaUltRegla";
    /** <code>anexoMatTMODIFICARptpFechaUltRegla</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_ANEXOMATTMODIFICARPTPFECHAULTREGLA = "Clas_1432915542016062Ser_7Arg_4_Alias";
    /** <code>anexoMatTMODIFICARptpFechaUltRegla</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_ANEXOMATTMODIFICARPTPFECHAULTREGLA = "Fecha última regla";
    /** <code>anexoMatTMODIFICARptpNumCuotas</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_ANEXOMATTMODIFICARPTPNUMCUOTAS = "pt_p_NumCuotas";
    /** <code>anexoMatTMODIFICARptpNumCuotas</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_ANEXOMATTMODIFICARPTPNUMCUOTAS = "Clas_1432915542016062Ser_7Arg_5_Alias";
    /** <code>anexoMatTMODIFICARptpNumCuotas</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_ANEXOMATTMODIFICARPTPNUMCUOTAS = "Nº cuotas";
    /** <code>anexoMatTMODIFICARptInstitucionMat</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_ANEXOMATTMODIFICARPTINSTITUCIONMAT = "pt_InstitucionMat";
    /** <code>anexoMatTMODIFICARptInstitucionMat</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_ANEXOMATTMODIFICARPTINSTITUCIONMAT = "Clas_1432915542016062Ser_7Arg_9_Alias";
    /** <code>anexoMatTMODIFICARptInstitucionMat</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_ANEXOMATTMODIFICARPTINSTITUCIONMAT = "Institución";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_ANEXOMATFECHAULTREGLA.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_ANEXOMATNUMCUOTAS.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_ANEXOMATDRVVALOR.toUpperCase(), Constants.Type.REAL.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_ANEXOMATIDENTIFICADOR.toUpperCase(), ANEXOMATIDENTIFICADOR_AGENTS);
    	attributeAgents.put(ATTR_NAME_ANEXOMATFECHAULTREGLA.toUpperCase(), ANEXOMATFECHAULTREGLA_AGENTS);
    	attributeAgents.put(ATTR_NAME_ANEXOMATNUMCUOTAS.toUpperCase(), ANEXOMATNUMCUOTAS_AGENTS);
    	attributeAgents.put(ATTR_NAME_ANEXOMATDRVVALOR.toUpperCase(), ANEXOMATDRVVALOR_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_USUARIO.toUpperCase(), USUARIO_AGENTS);
        roleAgents.put(ROLE_NAME_PERIODICIDAD.toUpperCase(), PERIODICIDAD_AGENTS);
        roleAgents.put(ROLE_NAME_INSTITUCIONMATERNAL.toUpperCase(), INSTITUCIONMATERNAL_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'AnexoMat', it returns the identification keys
     * - If className is a facet of the inheritance net of 'AnexoMat', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_ANEXOMATIDENTIFICADOR);
        }
        // Facet 'AnexoMat' (This facet)
        if (AnexoMatConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_ANEXOMATIDENTIFICADOR);
        }
        return returnList;
    }
}
