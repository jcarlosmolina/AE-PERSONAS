package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>AnexoNeo</code> model class.
 */
public final class AnexoNeoConstants {

    private AnexoNeoConstants() {

    }

    // Class
    /** <code>AnexoNeo</code> class id. */
    public static final String CLASS_ID = "Clas_1432919998464445_Alias";
    /** <code>AnexoNeo</code> class name. */
    public static final String CLASS_NAME = "AnexoNeo";
    /** <code>AnexoNeo</code> class alias. */
    public static final String CLASS_ALIAS = "Anexo neonatal";
    /** <code>AnexoNeo</code> class table name. */
    public static final String TBL_NAME = "AnexoNeo";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "anexoNeoIdentificador,aesolicitudesidsolicitud,usuarioUsuarioIdentificador,periodicidadCodigo,institucionMatNeoInstitucionNeonatalCodigo,anexoNeoFechaUltRegla,anexoNeoNumHijos,anexoNeoNumCuotas";

    public static final String DSDSANEXONEONULL = "DS_AnexoNeo_Null";
    

    // Attribute (anexoNeoIdentificador)
    /** <code>anexoNeoIdentificador</code> attribute id. */
    public static final String ATTR_ID_ANEXONEOIDENTIFICADOR = "Clas_1432919998464445Atr_1_Alias";
    /** <code>anexoNeoIdentificador</code> attribute name. */
    public static final String ATTR_NAME_ANEXONEOIDENTIFICADOR = "anexoNeoIdentificador";
    /** <code>anexoNeoIdentificador</code> attribute alias. */
    public static final String ATTR_ALIAS_ANEXONEOIDENTIFICADOR = "Identificador";

    /** <code>anexoNeoIdentificador</code> attribute facet sequence. */
    public static final String PATH_FACETS_ANEXONEOIDENTIFICADOR = "";
    /** Agents allowed to view the attribute anexoNeoIdentificador **/
    public static final String ANEXONEOIDENTIFICADOR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (anexoNeoFechaUltRegla)
    /** <code>anexoNeoFechaUltRegla</code> attribute id. */
    public static final String ATTR_ID_ANEXONEOFECHAULTREGLA = "Clas_1432919998464445Atr_4_Alias";
    /** <code>anexoNeoFechaUltRegla</code> attribute name. */
    public static final String ATTR_NAME_ANEXONEOFECHAULTREGLA = "anexoNeoFechaUltRegla";
    /** <code>anexoNeoFechaUltRegla</code> attribute alias. */
    public static final String ATTR_ALIAS_ANEXONEOFECHAULTREGLA = "Fecha última regla";

    /** <code>anexoNeoFechaUltRegla</code> attribute facet sequence. */
    public static final String PATH_FACETS_ANEXONEOFECHAULTREGLA = "";
    /** Agents allowed to view the attribute anexoNeoFechaUltRegla **/
    public static final String ANEXONEOFECHAULTREGLA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (anexoNeoNumHijos)
    /** <code>anexoNeoNumHijos</code> attribute id. */
    public static final String ATTR_ID_ANEXONEONUMHIJOS = "Clas_1432919998464445Atr_5_Alias";
    /** <code>anexoNeoNumHijos</code> attribute name. */
    public static final String ATTR_NAME_ANEXONEONUMHIJOS = "anexoNeoNumHijos";
    /** <code>anexoNeoNumHijos</code> attribute alias. */
    public static final String ATTR_ALIAS_ANEXONEONUMHIJOS = "Nº hijos";

    /** <code>anexoNeoNumHijos</code> attribute facet sequence. */
    public static final String PATH_FACETS_ANEXONEONUMHIJOS = "";
    /** Agents allowed to view the attribute anexoNeoNumHijos **/
    public static final String ANEXONEONUMHIJOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (anexoNeoNumCuotas)
    /** <code>anexoNeoNumCuotas</code> attribute id. */
    public static final String ATTR_ID_ANEXONEONUMCUOTAS = "Clas_1432919998464445Atr_6_Alias";
    /** <code>anexoNeoNumCuotas</code> attribute name. */
    public static final String ATTR_NAME_ANEXONEONUMCUOTAS = "anexoNeoNumCuotas";
    /** <code>anexoNeoNumCuotas</code> attribute alias. */
    public static final String ATTR_ALIAS_ANEXONEONUMCUOTAS = "Nº cuotas";

    /** <code>anexoNeoNumCuotas</code> attribute facet sequence. */
    public static final String PATH_FACETS_ANEXONEONUMCUOTAS = "";
    /** Agents allowed to view the attribute anexoNeoNumCuotas **/
    public static final String ANEXONEONUMCUOTAS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (anexoNeodrvValor)
    /** <code>anexoNeodrvValor</code> attribute id. */
    public static final String ATTR_ID_ANEXONEODRVVALOR = "Clas_1432919998464445Atr_7_Alias";
    /** <code>anexoNeodrvValor</code> attribute name. */
    public static final String ATTR_NAME_ANEXONEODRVVALOR = "anexoNeodrvValor";
    /** <code>anexoNeodrvValor</code> attribute alias. */
    public static final String ATTR_ALIAS_ANEXONEODRVVALOR = "Valor";

    /** <code>anexoNeodrvValor</code> attribute facet sequence. */
    public static final String PATH_FACETS_ANEXONEODRVVALOR = "";
    /** Agents allowed to view the attribute anexoNeodrvValor **/
    public static final String ANEXONEODRVVALOR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Identificador)
    /** <code>Identificador</code> field name. */
    public static final String FLD_ANEXONEOIDENTIFICADOR = "Identificador";    
    /** <code>anexoNeoIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_ANEXONEOIDENTIFICADOR = "anexoNeoIdentificador";
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
    // Field (InstitucionNeonatal_Codigo)
    /** <code>InstitucionNeonatal_Codigo</code> field name. */
    public static final String FLD_INSTITUCIONMATNEOINSTITUCIONNEONATALCODIGO = "InstitucionNeonatal_Codigo";    
    /** <code>InstitucionNeonatal_Codigo</code> field length. */
    public static final int FLD_INSTITUCIONMATNEOINSTITUCIONNEONATALCODIGOLENGTH = 20;
    /** <code>InstitucionNeonatal.institucionMatNeoCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_INSTITUCIONNEONATAL_INSTITUCIONMATNEOCODIGO = "institucionMatNeoInstitucionNeonatalCodigo";
    // Field (FechaUltRegla)
    /** <code>FechaUltRegla</code> field name. */
    public static final String FLD_ANEXONEOFECHAULTREGLA = "FechaUltRegla";    
    /** <code>anexoNeoFechaUltRegla</code> attribute field name. */
    public static final String ATTR_FIELD_ANEXONEOFECHAULTREGLA = "anexoNeoFechaUltRegla";
    // Field (NumHijos)
    /** <code>NumHijos</code> field name. */
    public static final String FLD_ANEXONEONUMHIJOS = "NumHijos";    
    /** <code>anexoNeoNumHijos</code> attribute field name. */
    public static final String ATTR_FIELD_ANEXONEONUMHIJOS = "anexoNeoNumHijos";
    // Field (NumCuotas)
    /** <code>NumCuotas</code> field name. */
    public static final String FLD_ANEXONEONUMCUOTAS = "NumCuotas";    
    /** <code>anexoNeoNumCuotas</code> attribute field name. */
    public static final String ATTR_FIELD_ANEXONEONUMCUOTAS = "anexoNeoNumCuotas";

    // Component role (Usuario)
    /** <code>Usuario</code> role id. */
    public static final String ROLE_ID_USUARIO = "Agr_1432920260608007_Alias";
    /** <code>Usuario</code> role name. */
    public static final String ROLE_NAME_USUARIO = "usuario";
    /** <code>Usuario</code> role alias. */
    public static final String ROLE_ALIAS_USUARIO = "Usuario";

    /** <code>Usuario</code> inverse role name. */
    public static final String ROLE_INVNAME_USUARIO = UsuarioConstants.ROLE_NAME_ANEXONEO;
    /** <code>Usuario</code> role facet sequence. */
    public static final String PATH_FACETS_USUARIO = "";
    /** <code>Usuario</code> role target class. */
    public static final String ROLE_TARGET_USUARIO = UsuarioConstants.CLASS_NAME;

    /** Agents allowed to navigate through Usuario **/
    public static final String USUARIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Periodicidad)
    /** <code>Periodicidad</code> role id. */
    public static final String ROLE_ID_PERIODICIDAD = "Agr_1432920391680657_Alias";
    /** <code>Periodicidad</code> role name. */
    public static final String ROLE_NAME_PERIODICIDAD = "periodicidad";
    /** <code>Periodicidad</code> role alias. */
    public static final String ROLE_ALIAS_PERIODICIDAD = "Periodicidad";

    /** <code>Periodicidad</code> inverse role name. */
    public static final String ROLE_INVNAME_PERIODICIDAD = PeriodicidadConstants.ROLE_NAME_ANEXOSNEO;
    /** <code>Periodicidad</code> role facet sequence. */
    public static final String PATH_FACETS_PERIODICIDAD = "";
    /** <code>Periodicidad</code> role target class. */
    public static final String ROLE_TARGET_PERIODICIDAD = PeriodicidadConstants.CLASS_NAME;

    /** Agents allowed to navigate through Periodicidad **/
    public static final String PERIODICIDAD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (InstitucionNeonatal)
    /** <code>InstitucionNeonatal</code> role id. */
    public static final String ROLE_ID_INSTITUCIONNEONATAL = "Agr_1463993630720047_Alias";
    /** <code>InstitucionNeonatal</code> role name. */
    public static final String ROLE_NAME_INSTITUCIONNEONATAL = "institucionNeonatal";
    /** <code>InstitucionNeonatal</code> role alias. */
    public static final String ROLE_ALIAS_INSTITUCIONNEONATAL = "Institución";

    /** <code>InstitucionNeonatal</code> inverse role name. */
    public static final String ROLE_INVNAME_INSTITUCIONNEONATAL = InstitucionMatNeoConstants.ROLE_NAME_ANEXONEO;
    /** <code>InstitucionNeonatal</code> role facet sequence. */
    public static final String PATH_FACETS_INSTITUCIONNEONATAL = "";
    /** <code>InstitucionNeonatal</code> role target class. */
    public static final String ROLE_TARGET_INSTITUCIONNEONATAL = InstitucionMatNeoConstants.CLASS_NAME;

    /** Agents allowed to navigate through InstitucionNeonatal **/
    public static final String INSTITUCIONNEONATAL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1432919998464445Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Preconditions
    /** <code>crear</code> precondition 0 id. */
    public static final String PRE_ID_CREAR_0 = "Clas_1432919998464445Pre_1_MsgError";
    // Inbound arguments
    /** <code>anexoNeocrearpagrUsuario</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ANEXONEOCREARPAGRUSUARIO = "p_agrUsuario";
    /** <code>anexoNeocrearpagrUsuario</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ANEXONEOCREARPAGRUSUARIO = "Clas_1432919998464445Ser_1Arg_11_Alias";
    /** <code>anexoNeocrearpagrUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ANEXONEOCREARPAGRUSUARIO = "Usuario";
    /** <code>anexoNeocrearpagrInstitucionNeonatal</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ANEXONEOCREARPAGRINSTITUCIONNEONATAL = "p_agrInstitucionNeonatal";
    /** <code>anexoNeocrearpagrInstitucionNeonatal</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ANEXONEOCREARPAGRINSTITUCIONNEONATAL = "Clas_1432919998464445Ser_1Arg_12_Alias";
    /** <code>anexoNeocrearpagrInstitucionNeonatal</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ANEXONEOCREARPAGRINSTITUCIONNEONATAL = "Institución";
    /** <code>anexoNeocrearpagrPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ANEXONEOCREARPAGRPERIODICIDAD = "p_agrPeriodicidad";
    /** <code>anexoNeocrearpagrPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ANEXONEOCREARPAGRPERIODICIDAD = "Clas_1432919998464445Ser_1Arg_14_Alias";
    /** <code>anexoNeocrearpagrPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ANEXONEOCREARPAGRPERIODICIDAD = "Periodicidad";
    /** <code>anexoNeocrearpatrFechaUltRegla</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ANEXONEOCREARPATRFECHAULTREGLA = "p_atrFechaUltRegla";
    /** <code>anexoNeocrearpatrFechaUltRegla</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ANEXONEOCREARPATRFECHAULTREGLA = "Clas_1432919998464445Ser_1Arg_4_Alias";
    /** <code>anexoNeocrearpatrFechaUltRegla</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ANEXONEOCREARPATRFECHAULTREGLA = "Fecha última regla";
    /** <code>anexoNeocrearpatrNumHijos</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ANEXONEOCREARPATRNUMHIJOS = "p_atrNumHijos";
    /** <code>anexoNeocrearpatrNumHijos</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ANEXONEOCREARPATRNUMHIJOS = "Clas_1432919998464445Ser_1Arg_5_Alias";
    /** <code>anexoNeocrearpatrNumHijos</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ANEXONEOCREARPATRNUMHIJOS = "Nº hijos";
    /** <code>anexoNeocrearpatrNumCuotas</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ANEXONEOCREARPATRNUMCUOTAS = "p_atrNumCuotas";
    /** <code>anexoNeocrearpatrNumCuotas</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ANEXONEOCREARPATRNUMCUOTAS = "Clas_1432919998464445Ser_1Arg_6_Alias";
    /** <code>anexoNeocrearpatrNumCuotas</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ANEXONEOCREARPATRNUMCUOTAS = "Nº cuotas";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1432919998464445Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>anexoNeoeliminarpthisAnexoNeo</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_ANEXONEOELIMINARPTHISANEXONEO = "p_thisAnexoNeo";
    /** <code>anexoNeoeliminarpthisAnexoNeo</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_ANEXONEOELIMINARPTHISANEXONEO = "Clas_1432919998464445Ser_2Arg_1_Alias";
    /** <code>anexoNeoeliminarpthisAnexoNeo</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_ANEXONEOELIMINARPTHISANEXONEO = "Anexo neonatal";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1432919998464445Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>anexoNeomodificarpthisAnexoNeo</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_ANEXONEOMODIFICARPTHISANEXONEO = "p_thisAnexoNeo";
    /** <code>anexoNeomodificarpthisAnexoNeo</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_ANEXONEOMODIFICARPTHISANEXONEO = "Clas_1432919998464445Ser_3Arg_1_Alias";
    /** <code>anexoNeomodificarpthisAnexoNeo</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_ANEXONEOMODIFICARPTHISANEXONEO = "Anexo neonatal";
    /** <code>anexoNeomodificarpFechaUltRegla</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_ANEXONEOMODIFICARPFECHAULTREGLA = "p_FechaUltRegla";
    /** <code>anexoNeomodificarpFechaUltRegla</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_ANEXONEOMODIFICARPFECHAULTREGLA = "Clas_1432919998464445Ser_3Arg_4_Alias";
    /** <code>anexoNeomodificarpFechaUltRegla</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_ANEXONEOMODIFICARPFECHAULTREGLA = "Fecha última regla";
    /** <code>anexoNeomodificarpNumHijos</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_ANEXONEOMODIFICARPNUMHIJOS = "p_NumHijos";
    /** <code>anexoNeomodificarpNumHijos</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_ANEXONEOMODIFICARPNUMHIJOS = "Clas_1432919998464445Ser_3Arg_5_Alias";
    /** <code>anexoNeomodificarpNumHijos</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_ANEXONEOMODIFICARPNUMHIJOS = "Nº hijos";
    /** <code>anexoNeomodificarpNumCuotas</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_ANEXONEOMODIFICARPNUMCUOTAS = "p_NumCuotas";
    /** <code>anexoNeomodificarpNumCuotas</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_ANEXONEOMODIFICARPNUMCUOTAS = "Clas_1432919998464445Ser_3Arg_6_Alias";
    /** <code>anexoNeomodificarpNumCuotas</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_ANEXONEOMODIFICARPNUMCUOTAS = "Nº cuotas";
    // Service (CambPeriodicidadAnexoNeo)
    /** <code>CambPeriodicidadAnexoNeo</code> service id. */
    public static final String SERV_ID_CAMBPERIODICIDADANEXONEO = "Clas_1432919998464445Ser_4_Alias";
    /** <code>CambPeriodicidadAnexoNeo</code> service name. */
    public static final String SERV_NAME_CAMBPERIODICIDADANEXONEO = "CambPeriodicidadAnexoNeo";
    /** <code>CambPeriodicidadAnexoNeo</code> service alias. */
    public static final String SERV_ALIAS_CAMBPERIODICIDADANEXONEO = "CambPeriodicidadAnexoNeo";
    /** Agents allowed to execute the service CambPeriodicidadAnexoNeo **/
    public static final String CAMBPERIODICIDADANEXONEO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>anexoNeoCambPeriodicidadAnexoNeopthisAnexoNeo</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPERIODICIDADANEXONEO_ANEXONEOCAMBPERIODICIDADANEXONEOPTHISANEXONEO = "p_thisAnexoNeo";
    /** <code>anexoNeoCambPeriodicidadAnexoNeopthisAnexoNeo</code> inbound argument id. */
    public static final String ARG_ID_CAMBPERIODICIDADANEXONEO_ANEXONEOCAMBPERIODICIDADANEXONEOPTHISANEXONEO = "Clas_1432919998464445Ser_4Arg_1_Alias";
    /** <code>anexoNeoCambPeriodicidadAnexoNeopthisAnexoNeo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPERIODICIDADANEXONEO_ANEXONEOCAMBPERIODICIDADANEXONEOPTHISANEXONEO = "Anexos neonatales";
    /** <code>anexoNeoCambPeriodicidadAnexoNeopevcPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPERIODICIDADANEXONEO_ANEXONEOCAMBPERIODICIDADANEXONEOPEVCPERIODICIDAD = "p_evcPeriodicidad";
    /** <code>anexoNeoCambPeriodicidadAnexoNeopevcPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_CAMBPERIODICIDADANEXONEO_ANEXONEOCAMBPERIODICIDADANEXONEOPEVCPERIODICIDAD = "Clas_1432919998464445Ser_4Arg_2_Alias";
    /** <code>anexoNeoCambPeriodicidadAnexoNeopevcPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPERIODICIDADANEXONEO_ANEXONEOCAMBPERIODICIDADANEXONEOPEVCPERIODICIDAD = "Periodicidad";
    // Service (CambiarInsInstitucionNeonatal)
    /** <code>CambiarInsInstitucionNeonatal</code> service id. */
    public static final String SERV_ID_CAMBIARINSINSTITUCIONNEONATAL = "Clas_1432919998464445Ser_8_Alias";
    /** <code>CambiarInsInstitucionNeonatal</code> service name. */
    public static final String SERV_NAME_CAMBIARINSINSTITUCIONNEONATAL = "CambiarInsInstitucionNeonatal";
    /** <code>CambiarInsInstitucionNeonatal</code> service alias. */
    public static final String SERV_ALIAS_CAMBIARINSINSTITUCIONNEONATAL = "CambiarInsInstitucionNeonatal";
    /** Agents allowed to execute the service CambiarInsInstitucionNeonatal **/
    public static final String CAMBIARINSINSTITUCIONNEONATAL_SRVAGENTS = "";
    // Inbound arguments
    /** <code>anexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeo</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARINSINSTITUCIONNEONATAL_ANEXONEOCAMBIARINSINSTITUCIONNEONATALPTHISANEXONEO = "p_thisAnexoNeo";
    /** <code>anexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeo</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARINSINSTITUCIONNEONATAL_ANEXONEOCAMBIARINSINSTITUCIONNEONATALPTHISANEXONEO = "Clas_1432919998464445Ser_8Arg_1_Alias";
    /** <code>anexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARINSINSTITUCIONNEONATAL_ANEXONEOCAMBIARINSINSTITUCIONNEONATALPTHISANEXONEO = "Anexos";
    /** <code>anexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeo</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARINSINSTITUCIONNEONATAL_ANEXONEOCAMBIARINSINSTITUCIONNEONATALPEVCINSTITUCIONMATNEO = "p_evcInstitucionMatNeo";
    /** <code>anexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeo</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARINSINSTITUCIONNEONATAL_ANEXONEOCAMBIARINSINSTITUCIONNEONATALPEVCINSTITUCIONMATNEO = "Clas_1432919998464445Ser_8Arg_2_Alias";
    /** <code>anexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARINSINSTITUCIONNEONATAL_ANEXONEOCAMBIARINSINSTITUCIONNEONATALPEVCINSTITUCIONMATNEO = "Institución";
    // Service (TMODIFICAR)
    /** <code>TMODIFICAR</code> service id. */
    public static final String SERV_ID_TMODIFICAR = "Clas_1432919998464445Ser_7_Alias";
    /** <code>TMODIFICAR</code> service name. */
    public static final String SERV_NAME_TMODIFICAR = "TMODIFICAR";
    /** <code>TMODIFICAR</code> service alias. */
    public static final String SERV_ALIAS_TMODIFICAR = "Modificar anexo neonatal";
    /** Agents allowed to execute the service TMODIFICAR **/
    public static final String TMODIFICAR_SRVAGENTS = "";
    // Preconditions
    /** <code>TMODIFICAR</code> precondition 0 id. */
    public static final String PRE_ID_TMODIFICAR_0 = "Clas_1432919998464445Pre_2_MsgError";
    // Inbound arguments
    /** <code>anexoNeoTMODIFICARpthisAnexoNeo</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_ANEXONEOTMODIFICARPTHISANEXONEO = "p_thisAnexoNeo";
    /** <code>anexoNeoTMODIFICARpthisAnexoNeo</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_ANEXONEOTMODIFICARPTHISANEXONEO = "Clas_1432919998464445Ser_7Arg_1_Alias";
    /** <code>anexoNeoTMODIFICARpthisAnexoNeo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_ANEXONEOTMODIFICARPTHISANEXONEO = "Anexo neonatal";
    /** <code>anexoNeoTMODIFICARptpFechaUltRegla</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_ANEXONEOTMODIFICARPTPFECHAULTREGLA = "pt_p_FechaUltRegla";
    /** <code>anexoNeoTMODIFICARptpFechaUltRegla</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_ANEXONEOTMODIFICARPTPFECHAULTREGLA = "Clas_1432919998464445Ser_7Arg_4_Alias";
    /** <code>anexoNeoTMODIFICARptpFechaUltRegla</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_ANEXONEOTMODIFICARPTPFECHAULTREGLA = "Fecha última regla";
    /** <code>anexoNeoTMODIFICARptpNumHijos</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_ANEXONEOTMODIFICARPTPNUMHIJOS = "pt_p_NumHijos";
    /** <code>anexoNeoTMODIFICARptpNumHijos</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_ANEXONEOTMODIFICARPTPNUMHIJOS = "Clas_1432919998464445Ser_7Arg_5_Alias";
    /** <code>anexoNeoTMODIFICARptpNumHijos</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_ANEXONEOTMODIFICARPTPNUMHIJOS = "Nº hijos";
    /** <code>anexoNeoTMODIFICARptpNumCuotas</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_ANEXONEOTMODIFICARPTPNUMCUOTAS = "pt_p_NumCuotas";
    /** <code>anexoNeoTMODIFICARptpNumCuotas</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_ANEXONEOTMODIFICARPTPNUMCUOTAS = "Clas_1432919998464445Ser_7Arg_6_Alias";
    /** <code>anexoNeoTMODIFICARptpNumCuotas</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_ANEXONEOTMODIFICARPTPNUMCUOTAS = "Nº cuotas";
    /** <code>anexoNeoTMODIFICARptInstitucionNeo</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_ANEXONEOTMODIFICARPTINSTITUCIONNEO = "pt_InstitucionNeo";
    /** <code>anexoNeoTMODIFICARptInstitucionNeo</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_ANEXONEOTMODIFICARPTINSTITUCIONNEO = "Clas_1432919998464445Ser_7Arg_10_Alias";
    /** <code>anexoNeoTMODIFICARptInstitucionNeo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_ANEXONEOTMODIFICARPTINSTITUCIONNEO = "Institución";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_ANEXONEOFECHAULTREGLA.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_ANEXONEONUMHIJOS.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_ANEXONEONUMCUOTAS.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_ANEXONEODRVVALOR.toUpperCase(), Constants.Type.REAL.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_ANEXONEOIDENTIFICADOR.toUpperCase(), ANEXONEOIDENTIFICADOR_AGENTS);
    	attributeAgents.put(ATTR_NAME_ANEXONEOFECHAULTREGLA.toUpperCase(), ANEXONEOFECHAULTREGLA_AGENTS);
    	attributeAgents.put(ATTR_NAME_ANEXONEONUMHIJOS.toUpperCase(), ANEXONEONUMHIJOS_AGENTS);
    	attributeAgents.put(ATTR_NAME_ANEXONEONUMCUOTAS.toUpperCase(), ANEXONEONUMCUOTAS_AGENTS);
    	attributeAgents.put(ATTR_NAME_ANEXONEODRVVALOR.toUpperCase(), ANEXONEODRVVALOR_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_USUARIO.toUpperCase(), USUARIO_AGENTS);
        roleAgents.put(ROLE_NAME_PERIODICIDAD.toUpperCase(), PERIODICIDAD_AGENTS);
        roleAgents.put(ROLE_NAME_INSTITUCIONNEONATAL.toUpperCase(), INSTITUCIONNEONATAL_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'AnexoNeo', it returns the identification keys
     * - If className is a facet of the inheritance net of 'AnexoNeo', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_ANEXONEOIDENTIFICADOR);
        }
        // Facet 'AnexoNeo' (This facet)
        if (AnexoNeoConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_ANEXONEOIDENTIFICADOR);
        }
        return returnList;
    }
}
