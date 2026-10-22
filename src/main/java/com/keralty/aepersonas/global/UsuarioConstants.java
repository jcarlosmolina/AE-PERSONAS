package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>Usuario</code> model class.
 */
public final class UsuarioConstants {

    private UsuarioConstants() {

    }

    // Class
    /** <code>Usuario</code> class id. */
    public static final String CLASS_ID = "Clas_1432633737216826_Alias";
    /** <code>Usuario</code> class name. */
    public static final String CLASS_NAME = "Usuario";
    /** <code>Usuario</code> class alias. */
    public static final String CLASS_ALIAS = "Usuario";
    /** <code>Usuario</code> class table name. */
    public static final String TBL_NAME = "Usuario";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "aesolicitudesidsolicitud,usuarioIdentificador,personaUsuarioPersonaIdentificador,epsCodigo,parentescoParentescoCodigo,companyiaCompanyiaCodigo,tipoIdentificacionTipoIdentificacionCodigo,estadoBeneficiarioEstadoBeneficiarioCodigo,usuarioBebeGestante,usuarioNumUsuario,usuarioNumIdentificacion,usuarioCodigoTipoUsuario,usuarioPrimerNombre,usuarioSegundoNombre,usuarioPrimerApellido,usuarioSegundoApellido,usuarioattrUsuarioDiligenciados,usuariocodigoBancoRep,usuarioUsuarioReplicado,usuarioFechaAntiguedadBeneficiario,usuarioRequierExamenMedico,usuarioEstadoMedico,usuarioValorCuotaInscripcion,usuarioTienePreexistencias,usuarioFechaInicioVigencia,usuarioFechaFinVigencia,usuariotieneDocIdentificacion,usuariotieneDocsSolicitud,usuarioPolizaInternacional,usuarioIMC";

    public static final String DSICUSUARIO = "IC_Usuario";
    public static final String DSDSUSUARIOPIUUSUARIOSCONT = "DS_UsuarioPIUUsuariosCont";
    public static final String DSDSUSUARIOPIUDESTATUSSOL = "DS_UsuarioPIUDeStatusSol";
    public static final String DSDSUSUARIOPOLIZAINTER = "DS_UsuarioPolizaInter";
    public static final String DSDSUSUARIONULL = "DS_Usuario_NUll";
    

    // Attribute (usuarioIdentificador)
    /** <code>usuarioIdentificador</code> attribute id. */
    public static final String ATTR_ID_USUARIOIDENTIFICADOR = "Clas_1432633737216826Atr_1_Alias";
    /** <code>usuarioIdentificador</code> attribute name. */
    public static final String ATTR_NAME_USUARIOIDENTIFICADOR = "usuarioIdentificador";
    /** <code>usuarioIdentificador</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOIDENTIFICADOR = "Identificador";

    /** <code>usuarioIdentificador</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOIDENTIFICADOR = "";
    /** Agents allowed to view the attribute usuarioIdentificador **/
    public static final String USUARIOIDENTIFICADOR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (usuarioBebeGestante)
    /** <code>usuarioBebeGestante</code> attribute id. */
    public static final String ATTR_ID_USUARIOBEBEGESTANTE = "Clas_1432633737216826Atr_2_Alias";
    /** <code>usuarioBebeGestante</code> attribute name. */
    public static final String ATTR_NAME_USUARIOBEBEGESTANTE = "usuarioBebeGestante";
    /** <code>usuarioBebeGestante</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOBEBEGESTANTE = "Bebé gestante";

    /** <code>usuarioBebeGestante</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOBEBEGESTANTE = "";
    /** Agents allowed to view the attribute usuarioBebeGestante **/
    public static final String USUARIOBEBEGESTANTE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNumUsuario)
    /** <code>usuarioNumUsuario</code> attribute id. */
    public static final String ATTR_ID_USUARIONUMUSUARIO = "Clas_1432633737216826Atr_3_Alias";
    /** <code>usuarioNumUsuario</code> attribute name. */
    public static final String ATTR_NAME_USUARIONUMUSUARIO = "usuarioNumUsuario";
    /** <code>usuarioNumUsuario</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONUMUSUARIO = "Nº usuario";

    /** <code>usuarioNumUsuario</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONUMUSUARIO = "";
    /** Agents allowed to view the attribute usuarioNumUsuario **/
    public static final String USUARIONUMUSUARIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNumIdentificacion)
    /** <code>usuarioNumIdentificacion</code> attribute id. */
    public static final String ATTR_ID_USUARIONUMIDENTIFICACION = "Clas_1432633737216826Atr_4_Alias";
    /** <code>usuarioNumIdentificacion</code> attribute name. */
    public static final String ATTR_NAME_USUARIONUMIDENTIFICACION = "usuarioNumIdentificacion";
    /** <code>usuarioNumIdentificacion</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONUMIDENTIFICACION = "Nº Identificación";

    /** <code>usuarioNumIdentificacion</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONUMIDENTIFICACION = "";
    /** Agents allowed to view the attribute usuarioNumIdentificacion **/
    public static final String USUARIONUMIDENTIFICACION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioCodigoTipoUsuario)
    /** <code>usuarioCodigoTipoUsuario</code> attribute id. */
    public static final String ATTR_ID_USUARIOCODIGOTIPOUSUARIO = "Clas_1432633737216826Atr_5_Alias";
    /** <code>usuarioCodigoTipoUsuario</code> attribute name. */
    public static final String ATTR_NAME_USUARIOCODIGOTIPOUSUARIO = "usuarioCodigoTipoUsuario";
    /** <code>usuarioCodigoTipoUsuario</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOCODIGOTIPOUSUARIO = "Tipo usuario";

    /** <code>usuarioCodigoTipoUsuario</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOCODIGOTIPOUSUARIO = "";
    /** Agents allowed to view the attribute usuarioCodigoTipoUsuario **/
    public static final String USUARIOCODIGOTIPOUSUARIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioPrimerNombre)
    /** <code>usuarioPrimerNombre</code> attribute id. */
    public static final String ATTR_ID_USUARIOPRIMERNOMBRE = "Clas_1432633737216826Atr_6_Alias";
    /** <code>usuarioPrimerNombre</code> attribute name. */
    public static final String ATTR_NAME_USUARIOPRIMERNOMBRE = "usuarioPrimerNombre";
    /** <code>usuarioPrimerNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOPRIMERNOMBRE = "Primer nombre";

    /** <code>usuarioPrimerNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOPRIMERNOMBRE = "";
    /** Agents allowed to view the attribute usuarioPrimerNombre **/
    public static final String USUARIOPRIMERNOMBRE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioSegundoNombre)
    /** <code>usuarioSegundoNombre</code> attribute id. */
    public static final String ATTR_ID_USUARIOSEGUNDONOMBRE = "Clas_1432633737216826Atr_7_Alias";
    /** <code>usuarioSegundoNombre</code> attribute name. */
    public static final String ATTR_NAME_USUARIOSEGUNDONOMBRE = "usuarioSegundoNombre";
    /** <code>usuarioSegundoNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOSEGUNDONOMBRE = "Segundo nombre";

    /** <code>usuarioSegundoNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOSEGUNDONOMBRE = "";
    /** Agents allowed to view the attribute usuarioSegundoNombre **/
    public static final String USUARIOSEGUNDONOMBRE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioPrimerApellido)
    /** <code>usuarioPrimerApellido</code> attribute id. */
    public static final String ATTR_ID_USUARIOPRIMERAPELLIDO = "Clas_1432633737216826Atr_8_Alias";
    /** <code>usuarioPrimerApellido</code> attribute name. */
    public static final String ATTR_NAME_USUARIOPRIMERAPELLIDO = "usuarioPrimerApellido";
    /** <code>usuarioPrimerApellido</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOPRIMERAPELLIDO = "Primer Apellido";

    /** <code>usuarioPrimerApellido</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOPRIMERAPELLIDO = "";
    /** Agents allowed to view the attribute usuarioPrimerApellido **/
    public static final String USUARIOPRIMERAPELLIDO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioSegundoApellido)
    /** <code>usuarioSegundoApellido</code> attribute id. */
    public static final String ATTR_ID_USUARIOSEGUNDOAPELLIDO = "Clas_1432633737216826Atr_9_Alias";
    /** <code>usuarioSegundoApellido</code> attribute name. */
    public static final String ATTR_NAME_USUARIOSEGUNDOAPELLIDO = "usuarioSegundoApellido";
    /** <code>usuarioSegundoApellido</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOSEGUNDOAPELLIDO = "Segundo Apellido";

    /** <code>usuarioSegundoApellido</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOSEGUNDOAPELLIDO = "";
    /** Agents allowed to view the attribute usuarioSegundoApellido **/
    public static final String USUARIOSEGUNDOAPELLIDO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuariodrvIdentificacion)
    /** <code>usuariodrvIdentificacion</code> attribute id. */
    public static final String ATTR_ID_USUARIODRVIDENTIFICACION = "Clas_1432633737216826Atr_10_Alias";
    /** <code>usuariodrvIdentificacion</code> attribute name. */
    public static final String ATTR_NAME_USUARIODRVIDENTIFICACION = "usuariodrvIdentificacion";
    /** <code>usuariodrvIdentificacion</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIODRVIDENTIFICACION = "Tipo y Nº Doc";

    /** <code>usuariodrvIdentificacion</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIODRVIDENTIFICACION = "";
    /** Agents allowed to view the attribute usuariodrvIdentificacion **/
    public static final String USUARIODRVIDENTIFICACION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuariodrvEsElTitular)
    /** <code>usuariodrvEsElTitular</code> attribute id. */
    public static final String ATTR_ID_USUARIODRVESELTITULAR = "Clas_1432633737216826Atr_11_Alias";
    /** <code>usuariodrvEsElTitular</code> attribute name. */
    public static final String ATTR_NAME_USUARIODRVESELTITULAR = "usuariodrvEsElTitular";
    /** <code>usuariodrvEsElTitular</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIODRVESELTITULAR = "Es el titular";

    /** <code>usuariodrvEsElTitular</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIODRVESELTITULAR = "";
    /** Agents allowed to view the attribute usuariodrvEsElTitular **/
    public static final String USUARIODRVESELTITULAR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuariodrvAccesoCuesMed)
    /** <code>usuariodrvAccesoCuesMed</code> attribute id. */
    public static final String ATTR_ID_USUARIODRVACCESOCUESMED = "Clas_1432633737216826Atr_12_Alias";
    /** <code>usuariodrvAccesoCuesMed</code> attribute name. */
    public static final String ATTR_NAME_USUARIODRVACCESOCUESMED = "usuariodrvAccesoCuesMed";
    /** <code>usuariodrvAccesoCuesMed</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIODRVACCESOCUESMED = "Acceso cues. médico";

    /** <code>usuariodrvAccesoCuesMed</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIODRVACCESOCUESMED = "";
    /** Agents allowed to view the attribute usuariodrvAccesoCuesMed **/
    public static final String USUARIODRVACCESOCUESMED_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuariodrvAceptaAnexoMat)
    /** <code>usuariodrvAceptaAnexoMat</code> attribute id. */
    public static final String ATTR_ID_USUARIODRVACEPTAANEXOMAT = "Clas_1432633737216826Atr_13_Alias";
    /** <code>usuariodrvAceptaAnexoMat</code> attribute name. */
    public static final String ATTR_NAME_USUARIODRVACEPTAANEXOMAT = "usuariodrvAceptaAnexoMat";
    /** <code>usuariodrvAceptaAnexoMat</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIODRVACEPTAANEXOMAT = "Acepta anexo maternidad";

    /** <code>usuariodrvAceptaAnexoMat</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIODRVACEPTAANEXOMAT = "";
    /** Agents allowed to view the attribute usuariodrvAceptaAnexoMat **/
    public static final String USUARIODRVACEPTAANEXOMAT_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuariodrvAceptaAnexoNeo)
    /** <code>usuariodrvAceptaAnexoNeo</code> attribute id. */
    public static final String ATTR_ID_USUARIODRVACEPTAANEXONEO = "Clas_1432633737216826Atr_14_Alias";
    /** <code>usuariodrvAceptaAnexoNeo</code> attribute name. */
    public static final String ATTR_NAME_USUARIODRVACEPTAANEXONEO = "usuariodrvAceptaAnexoNeo";
    /** <code>usuariodrvAceptaAnexoNeo</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIODRVACEPTAANEXONEO = "Acepta anexo neonatal";

    /** <code>usuariodrvAceptaAnexoNeo</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIODRVACEPTAANEXONEO = "";
    /** Agents allowed to view the attribute usuariodrvAceptaAnexoNeo **/
    public static final String USUARIODRVACEPTAANEXONEO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuariodrvTieneAnexoMat)
    /** <code>usuariodrvTieneAnexoMat</code> attribute id. */
    public static final String ATTR_ID_USUARIODRVTIENEANEXOMAT = "Clas_1432633737216826Atr_15_Alias";
    /** <code>usuariodrvTieneAnexoMat</code> attribute name. */
    public static final String ATTR_NAME_USUARIODRVTIENEANEXOMAT = "usuariodrvTieneAnexoMat";
    /** <code>usuariodrvTieneAnexoMat</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIODRVTIENEANEXOMAT = "Tiene anexo maternidad";

    /** <code>usuariodrvTieneAnexoMat</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIODRVTIENEANEXOMAT = "";
    /** Agents allowed to view the attribute usuariodrvTieneAnexoMat **/
    public static final String USUARIODRVTIENEANEXOMAT_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioattrUsuarioDiligenciados)
    /** <code>usuarioattrUsuarioDiligenciados</code> attribute id. */
    public static final String ATTR_ID_USUARIOATTRUSUARIODILIGENCIADOS = "Clas_1432633737216826Atr_16_Alias";
    /** <code>usuarioattrUsuarioDiligenciados</code> attribute name. */
    public static final String ATTR_NAME_USUARIOATTRUSUARIODILIGENCIADOS = "usuarioattrUsuarioDiligenciados";
    /** <code>usuarioattrUsuarioDiligenciados</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOATTRUSUARIODILIGENCIADOS = "Atributos usuario OK";

    /** <code>usuarioattrUsuarioDiligenciados</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOATTRUSUARIODILIGENCIADOS = "";
    /** Agents allowed to view the attribute usuarioattrUsuarioDiligenciados **/
    public static final String USUARIOATTRUSUARIODILIGENCIADOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuariodrvEdadParaCuotaIns)
    /** <code>usuariodrvEdadParaCuotaIns</code> attribute id. */
    public static final String ATTR_ID_USUARIODRVEDADPARACUOTAINS = "Clas_1432633737216826Atr_17_Alias";
    /** <code>usuariodrvEdadParaCuotaIns</code> attribute name. */
    public static final String ATTR_NAME_USUARIODRVEDADPARACUOTAINS = "usuariodrvEdadParaCuotaIns";
    /** <code>usuariodrvEdadParaCuotaIns</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIODRVEDADPARACUOTAINS = "Edad para cuota inscripción";

    /** <code>usuariodrvEdadParaCuotaIns</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIODRVEDADPARACUOTAINS = "";
    /** Agents allowed to view the attribute usuariodrvEdadParaCuotaIns **/
    public static final String USUARIODRVEDADPARACUOTAINS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuariodrvValorCuotaInscrip)
    /** <code>usuariodrvValorCuotaInscrip</code> attribute id. */
    public static final String ATTR_ID_USUARIODRVVALORCUOTAINSCRIP = "Clas_1432633737216826Atr_18_Alias";
    /** <code>usuariodrvValorCuotaInscrip</code> attribute name. */
    public static final String ATTR_NAME_USUARIODRVVALORCUOTAINSCRIP = "usuariodrvValorCuotaInscrip";
    /** <code>usuariodrvValorCuotaInscrip</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIODRVVALORCUOTAINSCRIP = "Valor Cuota Inscripción";

    /** <code>usuariodrvValorCuotaInscrip</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIODRVVALORCUOTAINSCRIP = "";
    /** Agents allowed to view the attribute usuariodrvValorCuotaInscrip **/
    public static final String USUARIODRVVALORCUOTAINSCRIP_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuariodrvCuesMedOK)
    /** <code>usuariodrvCuesMedOK</code> attribute id. */
    public static final String ATTR_ID_USUARIODRVCUESMEDOK = "Clas_1432633737216826Atr_19_Alias";
    /** <code>usuariodrvCuesMedOK</code> attribute name. */
    public static final String ATTR_NAME_USUARIODRVCUESMEDOK = "usuariodrvCuesMedOK";
    /** <code>usuariodrvCuesMedOK</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIODRVCUESMEDOK = "Cuestionario OK";

    /** <code>usuariodrvCuesMedOK</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIODRVCUESMEDOK = "";
    /** Agents allowed to view the attribute usuariodrvCuesMedOK **/
    public static final String USUARIODRVCUESMEDOK_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuariocodigoBancoRep)
    /** <code>usuariocodigoBancoRep</code> attribute id. */
    public static final String ATTR_ID_USUARIOCODIGOBANCOREP = "Clas_1432633737216826Atr_20_Alias";
    /** <code>usuariocodigoBancoRep</code> attribute name. */
    public static final String ATTR_NAME_USUARIOCODIGOBANCOREP = "usuariocodigoBancoRep";
    /** <code>usuariocodigoBancoRep</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOCODIGOBANCOREP = "Cod. Banco República";

    /** <code>usuariocodigoBancoRep</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOCODIGOBANCOREP = "";
    /** Agents allowed to view the attribute usuariocodigoBancoRep **/
    public static final String USUARIOCODIGOBANCOREP_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioUsuarioReplicado)
    /** <code>usuarioUsuarioReplicado</code> attribute id. */
    public static final String ATTR_ID_USUARIOUSUARIOREPLICADO = "Clas_1432633737216826Atr_21_Alias";
    /** <code>usuarioUsuarioReplicado</code> attribute name. */
    public static final String ATTR_NAME_USUARIOUSUARIOREPLICADO = "usuarioUsuarioReplicado";
    /** <code>usuarioUsuarioReplicado</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOUSUARIOREPLICADO = "Usuario replicado";

    /** <code>usuarioUsuarioReplicado</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOUSUARIOREPLICADO = "";
    /** Agents allowed to view the attribute usuarioUsuarioReplicado **/
    public static final String USUARIOUSUARIOREPLICADO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioFechaAntiguedadBeneficiario)
    /** <code>usuarioFechaAntiguedadBeneficiario</code> attribute id. */
    public static final String ATTR_ID_USUARIOFECHAANTIGUEDADBENEFICIARIO = "Clas_1432633737216826Atr_24_Alias";
    /** <code>usuarioFechaAntiguedadBeneficiario</code> attribute name. */
    public static final String ATTR_NAME_USUARIOFECHAANTIGUEDADBENEFICIARIO = "usuarioFechaAntiguedadBeneficiario";
    /** <code>usuarioFechaAntiguedadBeneficiario</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOFECHAANTIGUEDADBENEFICIARIO = "Fecha antigüedad";

    /** <code>usuarioFechaAntiguedadBeneficiario</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOFECHAANTIGUEDADBENEFICIARIO = "";
    /** Agents allowed to view the attribute usuarioFechaAntiguedadBeneficiario **/
    public static final String USUARIOFECHAANTIGUEDADBENEFICIARIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioRequierExamenMedico)
    /** <code>usuarioRequierExamenMedico</code> attribute id. */
    public static final String ATTR_ID_USUARIOREQUIEREXAMENMEDICO = "Clas_1432633737216826Atr_26_Alias";
    /** <code>usuarioRequierExamenMedico</code> attribute name. */
    public static final String ATTR_NAME_USUARIOREQUIEREXAMENMEDICO = "usuarioRequierExamenMedico";
    /** <code>usuarioRequierExamenMedico</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOREQUIEREXAMENMEDICO = "Requiere examen médico";

    /** <code>usuarioRequierExamenMedico</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOREQUIEREXAMENMEDICO = "";
    /** Agents allowed to view the attribute usuarioRequierExamenMedico **/
    public static final String USUARIOREQUIEREXAMENMEDICO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioEstadoMedico)
    /** <code>usuarioEstadoMedico</code> attribute id. */
    public static final String ATTR_ID_USUARIOESTADOMEDICO = "Clas_1432633737216826Atr_27_Alias";
    /** <code>usuarioEstadoMedico</code> attribute name. */
    public static final String ATTR_NAME_USUARIOESTADOMEDICO = "usuarioEstadoMedico";
    /** <code>usuarioEstadoMedico</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOESTADOMEDICO = "Estado médico";

    /** <code>usuarioEstadoMedico</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOESTADOMEDICO = "";
    /** Agents allowed to view the attribute usuarioEstadoMedico **/
    public static final String USUARIOESTADOMEDICO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioValorCuotaInscripcion)
    /** <code>usuarioValorCuotaInscripcion</code> attribute id. */
    public static final String ATTR_ID_USUARIOVALORCUOTAINSCRIPCION = "Clas_1432633737216826Atr_28_Alias";
    /** <code>usuarioValorCuotaInscripcion</code> attribute name. */
    public static final String ATTR_NAME_USUARIOVALORCUOTAINSCRIPCION = "usuarioValorCuotaInscripcion";
    /** <code>usuarioValorCuotaInscripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOVALORCUOTAINSCRIPCION = "Valor cuota inscripción";

    /** <code>usuarioValorCuotaInscripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOVALORCUOTAINSCRIPCION = "";
    /** Agents allowed to view the attribute usuarioValorCuotaInscripcion **/
    public static final String USUARIOVALORCUOTAINSCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioTienePreexistencias)
    /** <code>usuarioTienePreexistencias</code> attribute id. */
    public static final String ATTR_ID_USUARIOTIENEPREEXISTENCIAS = "Clas_1432633737216826Atr_29_Alias";
    /** <code>usuarioTienePreexistencias</code> attribute name. */
    public static final String ATTR_NAME_USUARIOTIENEPREEXISTENCIAS = "usuarioTienePreexistencias";
    /** <code>usuarioTienePreexistencias</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOTIENEPREEXISTENCIAS = "Tiene preexistencias";

    /** <code>usuarioTienePreexistencias</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOTIENEPREEXISTENCIAS = "";
    /** Agents allowed to view the attribute usuarioTienePreexistencias **/
    public static final String USUARIOTIENEPREEXISTENCIAS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuariodrvNombreCompleto)
    /** <code>usuariodrvNombreCompleto</code> attribute id. */
    public static final String ATTR_ID_USUARIODRVNOMBRECOMPLETO = "Clas_1432633737216826Atr_30_Alias";
    /** <code>usuariodrvNombreCompleto</code> attribute name. */
    public static final String ATTR_NAME_USUARIODRVNOMBRECOMPLETO = "usuariodrvNombreCompleto";
    /** <code>usuariodrvNombreCompleto</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIODRVNOMBRECOMPLETO = "Usuario";

    /** <code>usuariodrvNombreCompleto</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIODRVNOMBRECOMPLETO = "";
    /** Agents allowed to view the attribute usuariodrvNombreCompleto **/
    public static final String USUARIODRVNOMBRECOMPLETO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioFechaInicioVigencia)
    /** <code>usuarioFechaInicioVigencia</code> attribute id. */
    public static final String ATTR_ID_USUARIOFECHAINICIOVIGENCIA = "Clas_1432633737216826Atr_31_Alias";
    /** <code>usuarioFechaInicioVigencia</code> attribute name. */
    public static final String ATTR_NAME_USUARIOFECHAINICIOVIGENCIA = "usuarioFechaInicioVigencia";
    /** <code>usuarioFechaInicioVigencia</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOFECHAINICIOVIGENCIA = "Fecha inicio vigencia";

    /** <code>usuarioFechaInicioVigencia</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOFECHAINICIOVIGENCIA = "";
    /** Agents allowed to view the attribute usuarioFechaInicioVigencia **/
    public static final String USUARIOFECHAINICIOVIGENCIA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioFechaFinVigencia)
    /** <code>usuarioFechaFinVigencia</code> attribute id. */
    public static final String ATTR_ID_USUARIOFECHAFINVIGENCIA = "Clas_1432633737216826Atr_32_Alias";
    /** <code>usuarioFechaFinVigencia</code> attribute name. */
    public static final String ATTR_NAME_USUARIOFECHAFINVIGENCIA = "usuarioFechaFinVigencia";
    /** <code>usuarioFechaFinVigencia</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOFECHAFINVIGENCIA = "Fecha fin vigencia";

    /** <code>usuarioFechaFinVigencia</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOFECHAFINVIGENCIA = "";
    /** Agents allowed to view the attribute usuarioFechaFinVigencia **/
    public static final String USUARIOFECHAFINVIGENCIA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuariodrvConfirmado)
    /** <code>usuariodrvConfirmado</code> attribute id. */
    public static final String ATTR_ID_USUARIODRVCONFIRMADO = "Clas_1432633737216826Atr_33_Alias";
    /** <code>usuariodrvConfirmado</code> attribute name. */
    public static final String ATTR_NAME_USUARIODRVCONFIRMADO = "usuariodrvConfirmado";
    /** <code>usuariodrvConfirmado</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIODRVCONFIRMADO = "Confirmado";

    /** <code>usuariodrvConfirmado</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIODRVCONFIRMADO = "";
    /** Agents allowed to view the attribute usuariodrvConfirmado **/
    public static final String USUARIODRVCONFIRMADO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuariodrvTiempoEmbarazo)
    /** <code>usuariodrvTiempoEmbarazo</code> attribute id. */
    public static final String ATTR_ID_USUARIODRVTIEMPOEMBARAZO = "Clas_1432633737216826Atr_34_Alias";
    /** <code>usuariodrvTiempoEmbarazo</code> attribute name. */
    public static final String ATTR_NAME_USUARIODRVTIEMPOEMBARAZO = "usuariodrvTiempoEmbarazo";
    /** <code>usuariodrvTiempoEmbarazo</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIODRVTIEMPOEMBARAZO = "Tmp. Embarazo (sem)";

    /** <code>usuariodrvTiempoEmbarazo</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIODRVTIEMPOEMBARAZO = "";
    /** Agents allowed to view the attribute usuariodrvTiempoEmbarazo **/
    public static final String USUARIODRVTIEMPOEMBARAZO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuariodrvEstaActivo)
    /** <code>usuariodrvEstaActivo</code> attribute id. */
    public static final String ATTR_ID_USUARIODRVESTAACTIVO = "Clas_1432633737216826Atr_35_Alias";
    /** <code>usuariodrvEstaActivo</code> attribute name. */
    public static final String ATTR_NAME_USUARIODRVESTAACTIVO = "usuariodrvEstaActivo";
    /** <code>usuariodrvEstaActivo</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIODRVESTAACTIVO = "Esta activo";

    /** <code>usuariodrvEstaActivo</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIODRVESTAACTIVO = "";
    /** Agents allowed to view the attribute usuariodrvEstaActivo **/
    public static final String USUARIODRVESTAACTIVO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuariodrvEdad)
    /** <code>usuariodrvEdad</code> attribute id. */
    public static final String ATTR_ID_USUARIODRVEDAD = "Clas_1432633737216826Atr_36_Alias";
    /** <code>usuariodrvEdad</code> attribute name. */
    public static final String ATTR_NAME_USUARIODRVEDAD = "usuariodrvEdad";
    /** <code>usuariodrvEdad</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIODRVEDAD = "Edad";

    /** <code>usuariodrvEdad</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIODRVEDAD = "";
    /** Agents allowed to view the attribute usuariodrvEdad **/
    public static final String USUARIODRVEDAD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuariodrvEdadMaxIngreso)
    /** <code>usuariodrvEdadMaxIngreso</code> attribute id. */
    public static final String ATTR_ID_USUARIODRVEDADMAXINGRESO = "Clas_1432633737216826Atr_37_Alias";
    /** <code>usuariodrvEdadMaxIngreso</code> attribute name. */
    public static final String ATTR_NAME_USUARIODRVEDADMAXINGRESO = "usuariodrvEdadMaxIngreso";
    /** <code>usuariodrvEdadMaxIngreso</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIODRVEDADMAXINGRESO = "Edad máxima de ingreso";

    /** <code>usuariodrvEdadMaxIngreso</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIODRVEDADMAXINGRESO = "";
    /** Agents allowed to view the attribute usuariodrvEdadMaxIngreso **/
    public static final String USUARIODRVEDADMAXINGRESO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuariodrvEdadMaxPerm)
    /** <code>usuariodrvEdadMaxPerm</code> attribute id. */
    public static final String ATTR_ID_USUARIODRVEDADMAXPERM = "Clas_1432633737216826Atr_38_Alias";
    /** <code>usuariodrvEdadMaxPerm</code> attribute name. */
    public static final String ATTR_NAME_USUARIODRVEDADMAXPERM = "usuariodrvEdadMaxPerm";
    /** <code>usuariodrvEdadMaxPerm</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIODRVEDADMAXPERM = "Edad máxima permanencia";

    /** <code>usuariodrvEdadMaxPerm</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIODRVEDADMAXPERM = "";
    /** Agents allowed to view the attribute usuariodrvEdadMaxPerm **/
    public static final String USUARIODRVEDADMAXPERM_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuariodrvTotalAnexos)
    /** <code>usuariodrvTotalAnexos</code> attribute id. */
    public static final String ATTR_ID_USUARIODRVTOTALANEXOS = "Clas_1432633737216826Atr_39_Alias";
    /** <code>usuariodrvTotalAnexos</code> attribute name. */
    public static final String ATTR_NAME_USUARIODRVTOTALANEXOS = "usuariodrvTotalAnexos";
    /** <code>usuariodrvTotalAnexos</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIODRVTOTALANEXOS = "Total anexos";

    /** <code>usuariodrvTotalAnexos</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIODRVTOTALANEXOS = "";
    /** Agents allowed to view the attribute usuariodrvTotalAnexos **/
    public static final String USUARIODRVTOTALANEXOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuariodrvTieneEPSSanitas)
    /** <code>usuariodrvTieneEPSSanitas</code> attribute id. */
    public static final String ATTR_ID_USUARIODRVTIENEEPSSANITAS = "Clas_1432633737216826Atr_40_Alias";
    /** <code>usuariodrvTieneEPSSanitas</code> attribute name. */
    public static final String ATTR_NAME_USUARIODRVTIENEEPSSANITAS = "usuariodrvTieneEPSSanitas";
    /** <code>usuariodrvTieneEPSSanitas</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIODRVTIENEEPSSANITAS = "Tiene EPS Sanitas?";

    /** <code>usuariodrvTieneEPSSanitas</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIODRVTIENEEPSSANITAS = "";
    /** Agents allowed to view the attribute usuariodrvTieneEPSSanitas **/
    public static final String USUARIODRVTIENEEPSSANITAS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuariodrvTieneDocumentos)
    /** <code>usuariodrvTieneDocumentos</code> attribute id. */
    public static final String ATTR_ID_USUARIODRVTIENEDOCUMENTOS = "Clas_1432633737216826Atr_41_Alias";
    /** <code>usuariodrvTieneDocumentos</code> attribute name. */
    public static final String ATTR_NAME_USUARIODRVTIENEDOCUMENTOS = "usuariodrvTieneDocumentos";
    /** <code>usuariodrvTieneDocumentos</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIODRVTIENEDOCUMENTOS = "Tiene todos los documentos?";

    /** <code>usuariodrvTieneDocumentos</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIODRVTIENEDOCUMENTOS = "";
    /** Agents allowed to view the attribute usuariodrvTieneDocumentos **/
    public static final String USUARIODRVTIENEDOCUMENTOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuariotieneDocIdentificacion)
    /** <code>usuariotieneDocIdentificacion</code> attribute id. */
    public static final String ATTR_ID_USUARIOTIENEDOCIDENTIFICACION = "Clas_1432633737216826Atr_42_Alias";
    /** <code>usuariotieneDocIdentificacion</code> attribute name. */
    public static final String ATTR_NAME_USUARIOTIENEDOCIDENTIFICACION = "usuariotieneDocIdentificacion";
    /** <code>usuariotieneDocIdentificacion</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOTIENEDOCIDENTIFICACION = "Tiene Doc. Identificación";

    /** <code>usuariotieneDocIdentificacion</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOTIENEDOCIDENTIFICACION = "";
    /** Agents allowed to view the attribute usuariotieneDocIdentificacion **/
    public static final String USUARIOTIENEDOCIDENTIFICACION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuariotieneDocsSolicitud)
    /** <code>usuariotieneDocsSolicitud</code> attribute id. */
    public static final String ATTR_ID_USUARIOTIENEDOCSSOLICITUD = "Clas_1432633737216826Atr_43_Alias";
    /** <code>usuariotieneDocsSolicitud</code> attribute name. */
    public static final String ATTR_NAME_USUARIOTIENEDOCSSOLICITUD = "usuariotieneDocsSolicitud";
    /** <code>usuariotieneDocsSolicitud</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOTIENEDOCSSOLICITUD = "Tiene Docs. Solicitud";

    /** <code>usuariotieneDocsSolicitud</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOTIENEDOCSSOLICITUD = "";
    /** Agents allowed to view the attribute usuariotieneDocsSolicitud **/
    public static final String USUARIOTIENEDOCSSOLICITUD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuariodrvTieneParentesco)
    /** <code>usuariodrvTieneParentesco</code> attribute id. */
    public static final String ATTR_ID_USUARIODRVTIENEPARENTESCO = "Clas_1432633737216826Atr_44_Alias";
    /** <code>usuariodrvTieneParentesco</code> attribute name. */
    public static final String ATTR_NAME_USUARIODRVTIENEPARENTESCO = "usuariodrvTieneParentesco";
    /** <code>usuariodrvTieneParentesco</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIODRVTIENEPARENTESCO = "Tiene parentesco?";

    /** <code>usuariodrvTieneParentesco</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIODRVTIENEPARENTESCO = "";
    /** Agents allowed to view the attribute usuariodrvTieneParentesco **/
    public static final String USUARIODRVTIENEPARENTESCO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuariodrvPuedeSerTitular)
    /** <code>usuariodrvPuedeSerTitular</code> attribute id. */
    public static final String ATTR_ID_USUARIODRVPUEDESERTITULAR = "Clas_1432633737216826Atr_46_Alias";
    /** <code>usuariodrvPuedeSerTitular</code> attribute name. */
    public static final String ATTR_NAME_USUARIODRVPUEDESERTITULAR = "usuariodrvPuedeSerTitular";
    /** <code>usuariodrvPuedeSerTitular</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIODRVPUEDESERTITULAR = "Puede ser titulas";

    /** <code>usuariodrvPuedeSerTitular</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIODRVPUEDESERTITULAR = "";
    /** Agents allowed to view the attribute usuariodrvPuedeSerTitular **/
    public static final String USUARIODRVPUEDESERTITULAR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuariodrvTieneCuesMed)
    /** <code>usuariodrvTieneCuesMed</code> attribute id. */
    public static final String ATTR_ID_USUARIODRVTIENECUESMED = "Clas_1432633737216826Atr_47_Alias";
    /** <code>usuariodrvTieneCuesMed</code> attribute name. */
    public static final String ATTR_NAME_USUARIODRVTIENECUESMED = "usuariodrvTieneCuesMed";
    /** <code>usuariodrvTieneCuesMed</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIODRVTIENECUESMED = "Tiene cuestionario médico";

    /** <code>usuariodrvTieneCuesMed</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIODRVTIENECUESMED = "";
    /** Agents allowed to view the attribute usuariodrvTieneCuesMed **/
    public static final String USUARIODRVTIENECUESMED_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuariodrvImpTarifaPlanVol)
    /** <code>usuariodrvImpTarifaPlanVol</code> attribute id. */
    public static final String ATTR_ID_USUARIODRVIMPTARIFAPLANVOL = "Clas_1432633737216826Atr_48_Alias";
    /** <code>usuariodrvImpTarifaPlanVol</code> attribute name. */
    public static final String ATTR_NAME_USUARIODRVIMPTARIFAPLANVOL = "usuariodrvImpTarifaPlanVol";
    /** <code>usuariodrvImpTarifaPlanVol</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIODRVIMPTARIFAPLANVOL = "Importe tarifa";

    /** <code>usuariodrvImpTarifaPlanVol</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIODRVIMPTARIFAPLANVOL = "";
    /** Agents allowed to view the attribute usuariodrvImpTarifaPlanVol **/
    public static final String USUARIODRVIMPTARIFAPLANVOL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioPolizaInternacional)
    /** <code>usuarioPolizaInternacional</code> attribute id. */
    public static final String ATTR_ID_USUARIOPOLIZAINTERNACIONAL = "Clas_1432633737216826Atr_49_Alias";
    /** <code>usuarioPolizaInternacional</code> attribute name. */
    public static final String ATTR_NAME_USUARIOPOLIZAINTERNACIONAL = "usuarioPolizaInternacional";
    /** <code>usuarioPolizaInternacional</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOPOLIZAINTERNACIONAL = "Respaldo global";

    /** <code>usuarioPolizaInternacional</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOPOLIZAINTERNACIONAL = "";
    /** Agents allowed to view the attribute usuarioPolizaInternacional **/
    public static final String USUARIOPOLIZAINTERNACIONAL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuariodrvDirResValidoEPS)
    /** <code>usuariodrvDirResValidoEPS</code> attribute id. */
    public static final String ATTR_ID_USUARIODRVDIRRESVALIDOEPS = "Clas_1432633737216826Atr_50_Alias";
    /** <code>usuariodrvDirResValidoEPS</code> attribute name. */
    public static final String ATTR_NAME_USUARIODRVDIRRESVALIDOEPS = "usuariodrvDirResValidoEPS";
    /** <code>usuariodrvDirResValidoEPS</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIODRVDIRRESVALIDOEPS = "drvDirResValidoEPS";

    /** <code>usuariodrvDirResValidoEPS</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIODRVDIRRESVALIDOEPS = "";
    /** Agents allowed to view the attribute usuariodrvDirResValidoEPS **/
    public static final String USUARIODRVDIRRESVALIDOEPS_AGENTS = "Admin,SuperAdmin,Gestor,MesaDeApoyo";
    // Attribute (usuarioIMC)
    /** <code>usuarioIMC</code> attribute id. */
    public static final String ATTR_ID_USUARIOIMC = "Clas_1432633737216826Atr_51_Alias";
    /** <code>usuarioIMC</code> attribute name. */
    public static final String ATTR_NAME_USUARIOIMC = "usuarioIMC";
    /** <code>usuarioIMC</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOIMC = "IMC";

    /** <code>usuarioIMC</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOIMC = "";
    /** Agents allowed to view the attribute usuarioIMC **/
    public static final String USUARIOIMC_AGENTS = "Admin,SuperAdmin,Gestor,MesaDeApoyo";

    // Attribute (Solicitud.Ae_solicitudes.aesolicitudesidsolicitud)
    /** <code>Solicitud.Ae_solicitudes.aesolicitudesidsolicitud</code> identification attribute name. */
    public static final String ATTR_NAME_SOLICITUD_AE_SOLICITUDES_AESOLICITUDESIDSOLICITUD = "solicitud.aesolicitudes.aesolicitudesidsolicitud";

    // Field (id_solicitud)
    /** <code>id_solicitud</code> field name. */
    public static final String FLD_AESOLICITUDESIDSOLICITUD = "id_solicitud";    
    /** <code>Solicitud.Ae_solicitudes.aesolicitudesidsolicitud</code> attribute field name. */
    public static final String ATTR_FIELD_SOLICITUD_AE_SOLICITUDES_AESOLICITUDESIDSOLICITUD = "aesolicitudesidsolicitud";
    // Field (Identificador)
    /** <code>Identificador</code> field name. */
    public static final String FLD_USUARIOIDENTIFICADOR = "Identificador";    
    /** <code>usuarioIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOIDENTIFICADOR = "usuarioIdentificador";
    // Field (UsuarioPersona_Identificador)
    /** <code>UsuarioPersona_Identificador</code> field name. */
    public static final String FLD_PERSONAUSUARIOPERSONAIDENTIFICADOR = "UsuarioPersona_Identificador";    
    /** <code>UsuarioPersona.personaIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOPERSONA_PERSONAIDENTIFICADOR = "personaUsuarioPersonaIdentificador";
    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_EPSCODIGO = "Codigo";    
    /** <code>Eps.epsCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_EPS_EPSCODIGO = "epsCodigo";
    // Field (Parentesco_Codigo)
    /** <code>Parentesco_Codigo</code> field name. */
    public static final String FLD_PARENTESCOPARENTESCOCODIGO = "Parentesco_Codigo";    
    /** <code>Parentesco.parentescoCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_PARENTESCO_PARENTESCOCODIGO = "parentescoParentescoCodigo";
    // Field (Companyia_Codigo)
    /** <code>Companyia_Codigo</code> field name. */
    public static final String FLD_COMPANYIACOMPANYIACODIGO = "Companyia_Codigo";    
    /** <code>Companyia.companyiaCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_COMPANYIA_COMPANYIACODIGO = "companyiaCompanyiaCodigo";
    // Field (TipoIdentificacion_Codigo)
    /** <code>TipoIdentificacion_Codigo</code> field name. */
    public static final String FLD_TIPOIDENTIFICACIONTIPOIDENTIFICACIONCODIGO = "TipoIdentificacion_Codigo";    
    /** <code>TipoIdentificacion.tipoIdentificacionCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_TIPOIDENTIFICACION_TIPOIDENTIFICACIONCODIGO = "tipoIdentificacionTipoIdentificacionCodigo";
    // Field (EstadoBeneficiario_Codigo)
    /** <code>EstadoBeneficiario_Codigo</code> field name. */
    public static final String FLD_ESTADOBENEFICIARIOESTADOBENEFICIARIOCODIGO = "EstadoBeneficiario_Codigo";    
    /** <code>EstadoBeneficiario.estadoBeneficiarioCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_ESTADOBENEFICIARIO_ESTADOBENEFICIARIOCODIGO = "estadoBeneficiarioEstadoBeneficiarioCodigo";
    // Field (BebeGestante)
    /** <code>BebeGestante</code> field name. */
    public static final String FLD_USUARIOBEBEGESTANTE = "BebeGestante";    
    /** <code>usuarioBebeGestante</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOBEBEGESTANTE = "usuarioBebeGestante";
    // Field (NumUsuario)
    /** <code>NumUsuario</code> field name. */
    public static final String FLD_USUARIONUMUSUARIO = "NumUsuario";    
    /** <code>usuarioNumUsuario</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIONUMUSUARIO = "usuarioNumUsuario";
    // Field (NumIdentificacion)
    /** <code>NumIdentificacion</code> field name. */
    public static final String FLD_USUARIONUMIDENTIFICACION = "NumIdentificacion";    
    /** <code>NumIdentificacion</code> field length. */
    public static final int FLD_USUARIONUMIDENTIFICACIONLENGTH = 60;
    /** <code>usuarioNumIdentificacion</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIONUMIDENTIFICACION = "usuarioNumIdentificacion";
    // Field (CodigoTipoUsuario)
    /** <code>CodigoTipoUsuario</code> field name. */
    public static final String FLD_USUARIOCODIGOTIPOUSUARIO = "CodigoTipoUsuario";    
    /** <code>usuarioCodigoTipoUsuario</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOCODIGOTIPOUSUARIO = "usuarioCodigoTipoUsuario";
    // Field (PrimerNombre)
    /** <code>PrimerNombre</code> field name. */
    public static final String FLD_USUARIOPRIMERNOMBRE = "PrimerNombre";    
    /** <code>PrimerNombre</code> field length. */
    public static final int FLD_USUARIOPRIMERNOMBRELENGTH = 50;
    /** <code>usuarioPrimerNombre</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOPRIMERNOMBRE = "usuarioPrimerNombre";
    // Field (SegundoNombre)
    /** <code>SegundoNombre</code> field name. */
    public static final String FLD_USUARIOSEGUNDONOMBRE = "SegundoNombre";    
    /** <code>SegundoNombre</code> field length. */
    public static final int FLD_USUARIOSEGUNDONOMBRELENGTH = 50;
    /** <code>usuarioSegundoNombre</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOSEGUNDONOMBRE = "usuarioSegundoNombre";
    // Field (PrimerApellido)
    /** <code>PrimerApellido</code> field name. */
    public static final String FLD_USUARIOPRIMERAPELLIDO = "PrimerApellido";    
    /** <code>PrimerApellido</code> field length. */
    public static final int FLD_USUARIOPRIMERAPELLIDOLENGTH = 50;
    /** <code>usuarioPrimerApellido</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOPRIMERAPELLIDO = "usuarioPrimerApellido";
    // Field (SegundoApellido)
    /** <code>SegundoApellido</code> field name. */
    public static final String FLD_USUARIOSEGUNDOAPELLIDO = "SegundoApellido";    
    /** <code>SegundoApellido</code> field length. */
    public static final int FLD_USUARIOSEGUNDOAPELLIDOLENGTH = 50;
    /** <code>usuarioSegundoApellido</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOSEGUNDOAPELLIDO = "usuarioSegundoApellido";
    // Field (attrUsuarioDiligenciados)
    /** <code>attrUsuarioDiligenciados</code> field name. */
    public static final String FLD_USUARIOATTRUSUARIODILIGENCIADOS = "attrUsuarioDiligenciados";    
    /** <code>usuarioattrUsuarioDiligenciados</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOATTRUSUARIODILIGENCIADOS = "usuarioattrUsuarioDiligenciados";
    // Field (codigoBancoRep)
    /** <code>codigoBancoRep</code> field name. */
    public static final String FLD_USUARIOCODIGOBANCOREP = "codigoBancoRep";    
    /** <code>codigoBancoRep</code> field length. */
    public static final int FLD_USUARIOCODIGOBANCOREPLENGTH = 30;
    /** <code>usuariocodigoBancoRep</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOCODIGOBANCOREP = "usuariocodigoBancoRep";
    // Field (UsuarioReplicado)
    /** <code>UsuarioReplicado</code> field name. */
    public static final String FLD_USUARIOUSUARIOREPLICADO = "UsuarioReplicado";    
    /** <code>usuarioUsuarioReplicado</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOUSUARIOREPLICADO = "usuarioUsuarioReplicado";
    // Field (FechaAntiguedadBeneficiario)
    /** <code>FechaAntiguedadBeneficiario</code> field name. */
    public static final String FLD_USUARIOFECHAANTIGUEDADBENEFICIARIO = "FechaAntiguedadBeneficiario";    
    /** <code>usuarioFechaAntiguedadBeneficiario</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOFECHAANTIGUEDADBENEFICIARIO = "usuarioFechaAntiguedadBeneficiario";
    // Field (RequierExamenMedico)
    /** <code>RequierExamenMedico</code> field name. */
    public static final String FLD_USUARIOREQUIEREXAMENMEDICO = "RequierExamenMedico";    
    /** <code>usuarioRequierExamenMedico</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOREQUIEREXAMENMEDICO = "usuarioRequierExamenMedico";
    // Field (EstadoMedico)
    /** <code>EstadoMedico</code> field name. */
    public static final String FLD_USUARIOESTADOMEDICO = "EstadoMedico";    
    /** <code>usuarioEstadoMedico</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOESTADOMEDICO = "usuarioEstadoMedico";
    // Field (ValorCuotaInscripcion)
    /** <code>ValorCuotaInscripcion</code> field name. */
    public static final String FLD_USUARIOVALORCUOTAINSCRIPCION = "ValorCuotaInscripcion";    
    /** <code>usuarioValorCuotaInscripcion</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOVALORCUOTAINSCRIPCION = "usuarioValorCuotaInscripcion";
    // Field (TienePreexistencias)
    /** <code>TienePreexistencias</code> field name. */
    public static final String FLD_USUARIOTIENEPREEXISTENCIAS = "TienePreexistencias";    
    /** <code>usuarioTienePreexistencias</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOTIENEPREEXISTENCIAS = "usuarioTienePreexistencias";
    // Field (FechaInicioVigencia)
    /** <code>FechaInicioVigencia</code> field name. */
    public static final String FLD_USUARIOFECHAINICIOVIGENCIA = "FechaInicioVigencia";    
    /** <code>usuarioFechaInicioVigencia</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOFECHAINICIOVIGENCIA = "usuarioFechaInicioVigencia";
    // Field (FechaFinVigencia)
    /** <code>FechaFinVigencia</code> field name. */
    public static final String FLD_USUARIOFECHAFINVIGENCIA = "FechaFinVigencia";    
    /** <code>usuarioFechaFinVigencia</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOFECHAFINVIGENCIA = "usuarioFechaFinVigencia";
    // Field (tieneDocIdentificacion)
    /** <code>tieneDocIdentificacion</code> field name. */
    public static final String FLD_USUARIOTIENEDOCIDENTIFICACION = "tieneDocIdentificacion";    
    /** <code>usuariotieneDocIdentificacion</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOTIENEDOCIDENTIFICACION = "usuariotieneDocIdentificacion";
    // Field (tieneDocsSolicitud)
    /** <code>tieneDocsSolicitud</code> field name. */
    public static final String FLD_USUARIOTIENEDOCSSOLICITUD = "tieneDocsSolicitud";    
    /** <code>usuariotieneDocsSolicitud</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOTIENEDOCSSOLICITUD = "usuariotieneDocsSolicitud";
    // Field (PolizaInternacional)
    /** <code>PolizaInternacional</code> field name. */
    public static final String FLD_USUARIOPOLIZAINTERNACIONAL = "PolizaInternacional";    
    /** <code>usuarioPolizaInternacional</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOPOLIZAINTERNACIONAL = "usuarioPolizaInternacional";
    // Field (IMC)
    /** <code>IMC</code> field name. */
    public static final String FLD_USUARIOIMC = "IMC";    
    /** <code>usuarioIMC</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOIMC = "usuarioIMC";

    // Component role (Solicitud)
    /** <code>Solicitud</code> role id. */
    public static final String ROLE_ID_SOLICITUD = "Agr_1432633868288544_Alias";
    /** <code>Solicitud</code> role name. */
    public static final String ROLE_NAME_SOLICITUD = "solicitud";
    /** <code>Solicitud</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUD = "Solicitud";

    /** <code>Solicitud</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUD = SolicitudConstants.ROLE_NAME_USUARIOS;
    /** <code>Solicitud</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUD = "";
    /** <code>Solicitud</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUD = SolicitudConstants.CLASS_NAME;

    /** Agents allowed to navigate through Solicitud **/
    public static final String SOLICITUD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (UsuarioPersona)
    /** <code>UsuarioPersona</code> role id. */
    public static final String ROLE_ID_USUARIOPERSONA = "Agr_1432633868288463_Alias";
    /** <code>UsuarioPersona</code> role name. */
    public static final String ROLE_NAME_USUARIOPERSONA = "usuarioPersona";
    /** <code>UsuarioPersona</code> role alias. */
    public static final String ROLE_ALIAS_USUARIOPERSONA = "Persona";

    /** <code>UsuarioPersona</code> inverse role name. */
    public static final String ROLE_INVNAME_USUARIOPERSONA = PersonaConstants.ROLE_NAME_USUARIOS;
    /** <code>UsuarioPersona</code> role facet sequence. */
    public static final String PATH_FACETS_USUARIOPERSONA = "";
    /** <code>UsuarioPersona</code> role target class. */
    public static final String ROLE_TARGET_USUARIOPERSONA = PersonaConstants.CLASS_NAME;

    /** Agents allowed to navigate through UsuarioPersona **/
    public static final String USUARIOPERSONA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Eps)
    /** <code>Eps</code> role id. */
    public static final String ROLE_ID_EPS = "Agr_1432634130432846_Alias";
    /** <code>Eps</code> role name. */
    public static final String ROLE_NAME_EPS = "eps";
    /** <code>Eps</code> role alias. */
    public static final String ROLE_ALIAS_EPS = "Eps";

    /** <code>Eps</code> inverse role name. */
    public static final String ROLE_INVNAME_EPS = EpsConstants.ROLE_NAME_ATRIBUTOSUSUARIO;
    /** <code>Eps</code> role facet sequence. */
    public static final String PATH_FACETS_EPS = "";
    /** <code>Eps</code> role target class. */
    public static final String ROLE_TARGET_EPS = EpsConstants.CLASS_NAME;

    /** Agents allowed to navigate through Eps **/
    public static final String EPS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Parentesco)
    /** <code>Parentesco</code> role id. */
    public static final String ROLE_ID_PARENTESCO = "Agr_1432634130432359_Alias";
    /** <code>Parentesco</code> role name. */
    public static final String ROLE_NAME_PARENTESCO = "parentesco";
    /** <code>Parentesco</code> role alias. */
    public static final String ROLE_ALIAS_PARENTESCO = "Parentesco";

    /** <code>Parentesco</code> inverse role name. */
    public static final String ROLE_INVNAME_PARENTESCO = ParentescoConstants.ROLE_NAME_ATRIBUTOSUSUARIO;
    /** <code>Parentesco</code> role facet sequence. */
    public static final String PATH_FACETS_PARENTESCO = "";
    /** <code>Parentesco</code> role target class. */
    public static final String ROLE_TARGET_PARENTESCO = ParentescoConstants.CLASS_NAME;

    /** Agents allowed to navigate through Parentesco **/
    public static final String PARENTESCO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Companyia)
    /** <code>Companyia</code> role id. */
    public static final String ROLE_ID_COMPANYIA = "Agr_1432634261504830_Alias";
    /** <code>Companyia</code> role name. */
    public static final String ROLE_NAME_COMPANYIA = "companyia";
    /** <code>Companyia</code> role alias. */
    public static final String ROLE_ALIAS_COMPANYIA = "Compañía anterior";

    /** <code>Companyia</code> inverse role name. */
    public static final String ROLE_INVNAME_COMPANYIA = CompanyiaConstants.ROLE_NAME_ATRIBUTOSUSUARIO;
    /** <code>Companyia</code> role facet sequence. */
    public static final String PATH_FACETS_COMPANYIA = "";
    /** <code>Companyia</code> role target class. */
    public static final String ROLE_TARGET_COMPANYIA = CompanyiaConstants.CLASS_NAME;

    /** Agents allowed to navigate through Companyia **/
    public static final String COMPANYIA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (TipoIdentificacion)
    /** <code>TipoIdentificacion</code> role id. */
    public static final String ROLE_ID_TIPOIDENTIFICACION = "Agr_1432831918080510_Alias";
    /** <code>TipoIdentificacion</code> role name. */
    public static final String ROLE_NAME_TIPOIDENTIFICACION = "tipoIdentificacion";
    /** <code>TipoIdentificacion</code> role alias. */
    public static final String ROLE_ALIAS_TIPOIDENTIFICACION = "Tipo Identificación";

    /** <code>TipoIdentificacion</code> inverse role name. */
    public static final String ROLE_INVNAME_TIPOIDENTIFICACION = TipoIdentificacionConstants.ROLE_NAME_USUARIOS;
    /** <code>TipoIdentificacion</code> role facet sequence. */
    public static final String PATH_FACETS_TIPOIDENTIFICACION = "";
    /** <code>TipoIdentificacion</code> role target class. */
    public static final String ROLE_TARGET_TIPOIDENTIFICACION = TipoIdentificacionConstants.CLASS_NAME;

    /** Agents allowed to navigate through TipoIdentificacion **/
    public static final String TIPOIDENTIFICACION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (EstadoBeneficiario)
    /** <code>EstadoBeneficiario</code> role id. */
    public static final String ROLE_ID_ESTADOBENEFICIARIO = "Agr_1434045120512001_Alias";
    /** <code>EstadoBeneficiario</code> role name. */
    public static final String ROLE_NAME_ESTADOBENEFICIARIO = "estadoBeneficiario";
    /** <code>EstadoBeneficiario</code> role alias. */
    public static final String ROLE_ALIAS_ESTADOBENEFICIARIO = "Estado beneficiario CORE";

    /** <code>EstadoBeneficiario</code> inverse role name. */
    public static final String ROLE_INVNAME_ESTADOBENEFICIARIO = EstadoBeneficiarioConstants.ROLE_NAME_USUARIOS;
    /** <code>EstadoBeneficiario</code> role facet sequence. */
    public static final String PATH_FACETS_ESTADOBENEFICIARIO = "";
    /** <code>EstadoBeneficiario</code> role target class. */
    public static final String ROLE_TARGET_ESTADOBENEFICIARIO = EstadoBeneficiarioConstants.CLASS_NAME;

    /** Agents allowed to navigate through EstadoBeneficiario **/
    public static final String ESTADOBENEFICIARIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Compound role (CuestionarioP)
    /** <code>CuestionarioP</code> role id. */
    public static final String ROLE_ID_CUESTIONARIOP = "Agr_1432912003072997_Alias";
    /** <code>CuestionarioP</code> role name. */
    public static final String ROLE_NAME_CUESTIONARIOP = "cuestionarioP";
    /** <code>Usuario</code> role alias. */
    public static final String ROLE_ALIAS_CUESTIONARIOP = "Cuestionario médico";


    /** <code>CuestionarioP</code> inverse role name. */
    public static final String ROLE_INVNAME_CUESTIONARIOP = CuestionarioPConstants.ROLE_NAME_USUARIO;
    /** <code>CuestionarioP</code> role facet sequence. */
    public static final String PATH_FACETS_CUESTIONARIOP = "";
    /** <code>CuestionarioP</code> role target class. */
    public static final String ROLE_TARGET_CUESTIONARIOP = CuestionarioPConstants.CLASS_NAME;
    /** Agents allowed to navigate through CuestionarioP **/
    public static final String CUESTIONARIOP_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (AnexoMat)
    /** <code>AnexoMat</code> role id. */
    public static final String ROLE_ID_ANEXOMAT = "Agr_1432916066304871_Alias";
    /** <code>AnexoMat</code> role name. */
    public static final String ROLE_NAME_ANEXOMAT = "anexoMat";
    /** <code>Usuario</code> role alias. */
    public static final String ROLE_ALIAS_ANEXOMAT = "Anexo maternal";


    /** <code>AnexoMat</code> inverse role name. */
    public static final String ROLE_INVNAME_ANEXOMAT = AnexoMatConstants.ROLE_NAME_USUARIO;
    /** <code>AnexoMat</code> role facet sequence. */
    public static final String PATH_FACETS_ANEXOMAT = "";
    /** <code>AnexoMat</code> role target class. */
    public static final String ROLE_TARGET_ANEXOMAT = AnexoMatConstants.CLASS_NAME;
    /** Agents allowed to navigate through AnexoMat **/
    public static final String ANEXOMAT_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (AnexoNeo)
    /** <code>AnexoNeo</code> role id. */
    public static final String ROLE_ID_ANEXONEO = "Agr_1432920260608007_Alias";
    /** <code>AnexoNeo</code> role name. */
    public static final String ROLE_NAME_ANEXONEO = "anexoNeo";
    /** <code>Usuario</code> role alias. */
    public static final String ROLE_ALIAS_ANEXONEO = "Anexo neonatal";


    /** <code>AnexoNeo</code> inverse role name. */
    public static final String ROLE_INVNAME_ANEXONEO = AnexoNeoConstants.ROLE_NAME_USUARIO;
    /** <code>AnexoNeo</code> role facet sequence. */
    public static final String PATH_FACETS_ANEXONEO = "";
    /** <code>AnexoNeo</code> role target class. */
    public static final String ROLE_TARGET_ANEXONEO = AnexoNeoConstants.CLASS_NAME;
    /** Agents allowed to navigate through AnexoNeo **/
    public static final String ANEXONEO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (Preexistencias)
    /** <code>Preexistencias</code> role id. */
    public static final String ROLE_ID_PREEXISTENCIAS = "Agr_1434050494464014_Alias";
    /** <code>Preexistencias</code> role name. */
    public static final String ROLE_NAME_PREEXISTENCIAS = "preexistencias";
    /** <code>Usuario</code> role alias. */
    public static final String ROLE_ALIAS_PREEXISTENCIAS = "Preexistencias";


    /** <code>Preexistencias</code> inverse role name. */
    public static final String ROLE_INVNAME_PREEXISTENCIAS = PreexistenciaConstants.ROLE_NAME_USUARIO;
    /** <code>Preexistencias</code> role facet sequence. */
    public static final String PATH_FACETS_PREEXISTENCIAS = "";
    /** <code>Preexistencias</code> role target class. */
    public static final String ROLE_TARGET_PREEXISTENCIAS = PreexistenciaConstants.CLASS_NAME;
    /** Agents allowed to navigate through Preexistencias **/
    public static final String PREEXISTENCIAS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1432633737216826Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuariocrearpagrUsuarioPersona</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOCREARPAGRUSUARIOPERSONA = "p_agrUsuarioPersona";
    /** <code>usuariocrearpagrUsuarioPersona</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOCREARPAGRUSUARIOPERSONA = "Clas_1432633737216826Ser_1Arg_3_Alias";
    /** <code>usuariocrearpagrUsuarioPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOCREARPAGRUSUARIOPERSONA = "Persona";
    /** <code>usuariocrearpagrEps</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOCREARPAGREPS = "p_agrEps";
    /** <code>usuariocrearpagrEps</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOCREARPAGREPS = "Clas_1432633737216826Ser_1Arg_25_Alias";
    /** <code>usuariocrearpagrEps</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOCREARPAGREPS = "Eps";
    /** <code>usuariocrearpagrCompanyia</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOCREARPAGRCOMPANYIA = "p_agrCompanyia";
    /** <code>usuariocrearpagrCompanyia</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOCREARPAGRCOMPANYIA = "Clas_1432633737216826Ser_1Arg_26_Alias";
    /** <code>usuariocrearpagrCompanyia</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOCREARPAGRCOMPANYIA = "Compañía anterior";
    /** <code>usuariocrearpagrParentesco</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOCREARPAGRPARENTESCO = "p_agrParentesco";
    /** <code>usuariocrearpagrParentesco</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOCREARPAGRPARENTESCO = "Clas_1432633737216826Ser_1Arg_27_Alias";
    /** <code>usuariocrearpagrParentesco</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOCREARPAGRPARENTESCO = "Parentesco";
    /** <code>usuariocrearpagrEstadoBeneficiario</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOCREARPAGRESTADOBENEFICIARIO = "p_agrEstadoBeneficiario";
    /** <code>usuariocrearpagrEstadoBeneficiario</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOCREARPAGRESTADOBENEFICIARIO = "Clas_1432633737216826Ser_1Arg_28_Alias";
    /** <code>usuariocrearpagrEstadoBeneficiario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOCREARPAGRESTADOBENEFICIARIO = "Estado beneficiario CORE";
    /** <code>usuariocrearpagrTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOCREARPAGRTIPOIDENTIFICACION = "p_agrTipoIdentificacion";
    /** <code>usuariocrearpagrTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOCREARPAGRTIPOIDENTIFICACION = "Clas_1432633737216826Ser_1Arg_35_Alias";
    /** <code>usuariocrearpagrTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOCREARPAGRTIPOIDENTIFICACION = "Tipo Identificación";
    /** <code>usuariocrearpagrSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOCREARPAGRSOLICITUD = "p_agrSolicitud";
    /** <code>usuariocrearpagrSolicitud</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOCREARPAGRSOLICITUD = "Clas_1432633737216826Ser_1Arg_38_Alias";
    /** <code>usuariocrearpagrSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOCREARPAGRSOLICITUD = "Solicitud";
    /** <code>usuariocrearpatrBebeGestante</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOCREARPATRBEBEGESTANTE = "p_atrBebeGestante";
    /** <code>usuariocrearpatrBebeGestante</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOCREARPATRBEBEGESTANTE = "Clas_1432633737216826Ser_1Arg_7_Alias";
    /** <code>usuariocrearpatrBebeGestante</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOCREARPATRBEBEGESTANTE = "Bebé gestante";
    /** <code>usuariocrearpatrNumUsuario</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOCREARPATRNUMUSUARIO = "p_atrNumUsuario";
    /** <code>usuariocrearpatrNumUsuario</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOCREARPATRNUMUSUARIO = "Clas_1432633737216826Ser_1Arg_14_Alias";
    /** <code>usuariocrearpatrNumUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOCREARPATRNUMUSUARIO = "Nº usuario";
    /** <code>usuariocrearpatrNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOCREARPATRNUMIDENTIFICACION = "p_atrNumIdentificacion";
    /** <code>usuariocrearpatrNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOCREARPATRNUMIDENTIFICACION = "Clas_1432633737216826Ser_1Arg_15_Alias";
    /** <code>usuariocrearpatrNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOCREARPATRNUMIDENTIFICACION = "Nº Identificación";
    /** <code>usuariocrearpatrCodigoTipoUsuario</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOCREARPATRCODIGOTIPOUSUARIO = "p_atrCodigoTipoUsuario";
    /** <code>usuariocrearpatrCodigoTipoUsuario</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOCREARPATRCODIGOTIPOUSUARIO = "Clas_1432633737216826Ser_1Arg_16_Alias";
    /** <code>usuariocrearpatrCodigoTipoUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOCREARPATRCODIGOTIPOUSUARIO = "Tipo usuario";
    /** <code>usuariocrearpatrPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOCREARPATRPRIMERNOMBRE = "p_atrPrimerNombre";
    /** <code>usuariocrearpatrPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOCREARPATRPRIMERNOMBRE = "Clas_1432633737216826Ser_1Arg_17_Alias";
    /** <code>usuariocrearpatrPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOCREARPATRPRIMERNOMBRE = "Primer nombre";
    /** <code>usuariocrearpatrSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOCREARPATRSEGUNDONOMBRE = "p_atrSegundoNombre";
    /** <code>usuariocrearpatrSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOCREARPATRSEGUNDONOMBRE = "Clas_1432633737216826Ser_1Arg_18_Alias";
    /** <code>usuariocrearpatrSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOCREARPATRSEGUNDONOMBRE = "Segundo nombre";
    /** <code>usuariocrearpatrPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOCREARPATRPRIMERAPELLIDO = "p_atrPrimerApellido";
    /** <code>usuariocrearpatrPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOCREARPATRPRIMERAPELLIDO = "Clas_1432633737216826Ser_1Arg_19_Alias";
    /** <code>usuariocrearpatrPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOCREARPATRPRIMERAPELLIDO = "Primer Apellido";
    /** <code>usuariocrearpatrSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOCREARPATRSEGUNDOAPELLIDO = "p_atrSegundoApellido";
    /** <code>usuariocrearpatrSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOCREARPATRSEGUNDOAPELLIDO = "Clas_1432633737216826Ser_1Arg_20_Alias";
    /** <code>usuariocrearpatrSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOCREARPATRSEGUNDOAPELLIDO = "Segundo Apellido";
    /** <code>usuariocrearpatrcodigoBancoRep</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOCREARPATRCODIGOBANCOREP = "p_atrcodigoBancoRep";
    /** <code>usuariocrearpatrcodigoBancoRep</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOCREARPATRCODIGOBANCOREP = "Clas_1432633737216826Ser_1Arg_21_Alias";
    /** <code>usuariocrearpatrcodigoBancoRep</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOCREARPATRCODIGOBANCOREP = "Cod. Banco República";
    /** <code>usuariocrearpatrUsuarioReplicado</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOCREARPATRUSUARIOREPLICADO = "p_atrUsuarioReplicado";
    /** <code>usuariocrearpatrUsuarioReplicado</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOCREARPATRUSUARIOREPLICADO = "Clas_1432633737216826Ser_1Arg_22_Alias";
    /** <code>usuariocrearpatrUsuarioReplicado</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOCREARPATRUSUARIOREPLICADO = "Usuario replicado";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1432633737216826Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioeliminarpthisAttrUsuario</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_USUARIOELIMINARPTHISATTRUSUARIO = "p_thisAttrUsuario";
    /** <code>usuarioeliminarpthisAttrUsuario</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_USUARIOELIMINARPTHISATTRUSUARIO = "Clas_1432633737216826Ser_2Arg_1_Alias";
    /** <code>usuarioeliminarpthisAttrUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_USUARIOELIMINARPTHISATTRUSUARIO = "Usuario";
    // Service (modificarAttr)
    /** <code>modificarAttr</code> service id. */
    public static final String SERV_ID_MODIFICARATTR = "Clas_1432633737216826Ser_3_Alias";
    /** <code>modificarAttr</code> service name. */
    public static final String SERV_NAME_MODIFICARATTR = "modificarAttr";
    /** <code>modificarAttr</code> service alias. */
    public static final String SERV_ALIAS_MODIFICARATTR = "Modificar";
    /** Agents allowed to execute the service modificarAttr **/
    public static final String MODIFICARATTR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuariomodificarAttrpthisAttrUsuario</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARATTR_USUARIOMODIFICARATTRPTHISATTRUSUARIO = "p_thisAttrUsuario";
    /** <code>usuariomodificarAttrpthisAttrUsuario</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARATTR_USUARIOMODIFICARATTRPTHISATTRUSUARIO = "Clas_1432633737216826Ser_3Arg_1_Alias";
    /** <code>usuariomodificarAttrpthisAttrUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARATTR_USUARIOMODIFICARATTRPTHISATTRUSUARIO = "Usuario";
    /** <code>usuariomodificarAttrpBebeGestante</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARATTR_USUARIOMODIFICARATTRPBEBEGESTANTE = "p_BebeGestante";
    /** <code>usuariomodificarAttrpBebeGestante</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARATTR_USUARIOMODIFICARATTRPBEBEGESTANTE = "Clas_1432633737216826Ser_3Arg_2_Alias";
    /** <code>usuariomodificarAttrpBebeGestante</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARATTR_USUARIOMODIFICARATTRPBEBEGESTANTE = "Bebé gestante";
    /** <code>usuariomodificarAttrpcodigoBancoRep</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARATTR_USUARIOMODIFICARATTRPCODIGOBANCOREP = "p_codigoBancoRep";
    /** <code>usuariomodificarAttrpcodigoBancoRep</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARATTR_USUARIOMODIFICARATTRPCODIGOBANCOREP = "Clas_1432633737216826Ser_3Arg_3_Alias";
    /** <code>usuariomodificarAttrpcodigoBancoRep</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARATTR_USUARIOMODIFICARATTRPCODIGOBANCOREP = "Cod. Banco República";
    /** <code>usuariomodificarAttrpFechaAntiguedad</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARATTR_USUARIOMODIFICARATTRPFECHAANTIGUEDAD = "p_FechaAntiguedad";
    /** <code>usuariomodificarAttrpFechaAntiguedad</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARATTR_USUARIOMODIFICARATTRPFECHAANTIGUEDAD = "Clas_1432633737216826Ser_3Arg_4_Alias";
    /** <code>usuariomodificarAttrpFechaAntiguedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARATTR_USUARIOMODIFICARATTRPFECHAANTIGUEDAD = "Fecha antigüedad beneficiario";
    /** <code>usuariomodificarAttrpePolizaInternacional</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARATTR_USUARIOMODIFICARATTRPEPOLIZAINTERNACIONAL = "pePolizaInternacional";
    /** <code>usuariomodificarAttrpePolizaInternacional</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARATTR_USUARIOMODIFICARATTRPEPOLIZAINTERNACIONAL = "Clas_1432633737216826Ser_3Arg_5_Alias";
    /** <code>usuariomodificarAttrpePolizaInternacional</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARATTR_USUARIOMODIFICARATTRPEPOLIZAINTERNACIONAL = "Respaldo global";
    // Service (InsEPSUsuario)
    /** <code>InsEPSUsuario</code> service id. */
    public static final String SERV_ID_INSEPSUSUARIO = "Clas_1432633737216826Ser_4_Alias";
    /** <code>InsEPSUsuario</code> service name. */
    public static final String SERV_NAME_INSEPSUSUARIO = "InsEPSUsuario";
    /** <code>InsEPSUsuario</code> service alias. */
    public static final String SERV_ALIAS_INSEPSUSUARIO = "InsEPSUsuario";
    /** Agents allowed to execute the service InsEPSUsuario **/
    public static final String INSEPSUSUARIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioInsEPSUsuariopthisAttrUsuario</code> inbound argument name. */
    public static final String ARG_NAME_INSEPSUSUARIO_USUARIOINSEPSUSUARIOPTHISATTRUSUARIO = "p_thisAttrUsuario";
    /** <code>usuarioInsEPSUsuariopthisAttrUsuario</code> inbound argument id. */
    public static final String ARG_ID_INSEPSUSUARIO_USUARIOINSEPSUSUARIOPTHISATTRUSUARIO = "Clas_1432633737216826Ser_4Arg_1_Alias";
    /** <code>usuarioInsEPSUsuariopthisAttrUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSEPSUSUARIO_USUARIOINSEPSUSUARIOPTHISATTRUSUARIO = "Atributos usuario";
    /** <code>usuarioInsEPSUsuariopevcEps</code> inbound argument name. */
    public static final String ARG_NAME_INSEPSUSUARIO_USUARIOINSEPSUSUARIOPEVCEPS = "p_evcEps";
    /** <code>usuarioInsEPSUsuariopevcEps</code> inbound argument id. */
    public static final String ARG_ID_INSEPSUSUARIO_USUARIOINSEPSUSUARIOPEVCEPS = "Clas_1432633737216826Ser_4Arg_2_Alias";
    /** <code>usuarioInsEPSUsuariopevcEps</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSEPSUSUARIO_USUARIOINSEPSUSUARIOPEVCEPS = "Eps";
    // Service (InsParentescoUsuario)
    /** <code>InsParentescoUsuario</code> service id. */
    public static final String SERV_ID_INSPARENTESCOUSUARIO = "Clas_1432633737216826Ser_6_Alias";
    /** <code>InsParentescoUsuario</code> service name. */
    public static final String SERV_NAME_INSPARENTESCOUSUARIO = "InsParentescoUsuario";
    /** <code>InsParentescoUsuario</code> service alias. */
    public static final String SERV_ALIAS_INSPARENTESCOUSUARIO = "InsParentescoUsuario";
    /** Agents allowed to execute the service InsParentescoUsuario **/
    public static final String INSPARENTESCOUSUARIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioInsParentescoUsuariopthisAttrUsuario</code> inbound argument name. */
    public static final String ARG_NAME_INSPARENTESCOUSUARIO_USUARIOINSPARENTESCOUSUARIOPTHISATTRUSUARIO = "p_thisAttrUsuario";
    /** <code>usuarioInsParentescoUsuariopthisAttrUsuario</code> inbound argument id. */
    public static final String ARG_ID_INSPARENTESCOUSUARIO_USUARIOINSPARENTESCOUSUARIOPTHISATTRUSUARIO = "Clas_1432633737216826Ser_6Arg_1_Alias";
    /** <code>usuarioInsParentescoUsuariopthisAttrUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPARENTESCOUSUARIO_USUARIOINSPARENTESCOUSUARIOPTHISATTRUSUARIO = "Atributos usuario";
    /** <code>usuarioInsParentescoUsuariopevcParentesco</code> inbound argument name. */
    public static final String ARG_NAME_INSPARENTESCOUSUARIO_USUARIOINSPARENTESCOUSUARIOPEVCPARENTESCO = "p_evcParentesco";
    /** <code>usuarioInsParentescoUsuariopevcParentesco</code> inbound argument id. */
    public static final String ARG_ID_INSPARENTESCOUSUARIO_USUARIOINSPARENTESCOUSUARIOPEVCPARENTESCO = "Clas_1432633737216826Ser_6Arg_2_Alias";
    /** <code>usuarioInsParentescoUsuariopevcParentesco</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPARENTESCOUSUARIO_USUARIOINSPARENTESCOUSUARIOPEVCPARENTESCO = "Parentesco";
    // Service (InsCompanyiaUsuario)
    /** <code>InsCompanyiaUsuario</code> service id. */
    public static final String SERV_ID_INSCOMPANYIAUSUARIO = "Clas_1432633737216826Ser_7_Alias";
    /** <code>InsCompanyiaUsuario</code> service name. */
    public static final String SERV_NAME_INSCOMPANYIAUSUARIO = "InsCompanyiaUsuario";
    /** <code>InsCompanyiaUsuario</code> service alias. */
    public static final String SERV_ALIAS_INSCOMPANYIAUSUARIO = "InsCompanyiaUsuario";
    /** Agents allowed to execute the service InsCompanyiaUsuario **/
    public static final String INSCOMPANYIAUSUARIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioInsCompanyiaUsuariopthisAttrUsuario</code> inbound argument name. */
    public static final String ARG_NAME_INSCOMPANYIAUSUARIO_USUARIOINSCOMPANYIAUSUARIOPTHISATTRUSUARIO = "p_thisAttrUsuario";
    /** <code>usuarioInsCompanyiaUsuariopthisAttrUsuario</code> inbound argument id. */
    public static final String ARG_ID_INSCOMPANYIAUSUARIO_USUARIOINSCOMPANYIAUSUARIOPTHISATTRUSUARIO = "Clas_1432633737216826Ser_7Arg_1_Alias";
    /** <code>usuarioInsCompanyiaUsuariopthisAttrUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSCOMPANYIAUSUARIO_USUARIOINSCOMPANYIAUSUARIOPTHISATTRUSUARIO = "Atributos usuario";
    /** <code>usuarioInsCompanyiaUsuariopevcCompanyia</code> inbound argument name. */
    public static final String ARG_NAME_INSCOMPANYIAUSUARIO_USUARIOINSCOMPANYIAUSUARIOPEVCCOMPANYIA = "p_evcCompanyia";
    /** <code>usuarioInsCompanyiaUsuariopevcCompanyia</code> inbound argument id. */
    public static final String ARG_ID_INSCOMPANYIAUSUARIO_USUARIOINSCOMPANYIAUSUARIOPEVCCOMPANYIA = "Clas_1432633737216826Ser_7Arg_2_Alias";
    /** <code>usuarioInsCompanyiaUsuariopevcCompanyia</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSCOMPANYIAUSUARIO_USUARIOINSCOMPANYIAUSUARIOPEVCCOMPANYIA = "Compañía anterior";
    // Service (DelCompanyiaUsuario)
    /** <code>DelCompanyiaUsuario</code> service id. */
    public static final String SERV_ID_DELCOMPANYIAUSUARIO = "Clas_1432633737216826Ser_8_Alias";
    /** <code>DelCompanyiaUsuario</code> service name. */
    public static final String SERV_NAME_DELCOMPANYIAUSUARIO = "DelCompanyiaUsuario";
    /** <code>DelCompanyiaUsuario</code> service alias. */
    public static final String SERV_ALIAS_DELCOMPANYIAUSUARIO = "DelCompanyiaUsuario";
    /** Agents allowed to execute the service DelCompanyiaUsuario **/
    public static final String DELCOMPANYIAUSUARIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioDelCompanyiaUsuariopthisAttrUsuario</code> inbound argument name. */
    public static final String ARG_NAME_DELCOMPANYIAUSUARIO_USUARIODELCOMPANYIAUSUARIOPTHISATTRUSUARIO = "p_thisAttrUsuario";
    /** <code>usuarioDelCompanyiaUsuariopthisAttrUsuario</code> inbound argument id. */
    public static final String ARG_ID_DELCOMPANYIAUSUARIO_USUARIODELCOMPANYIAUSUARIOPTHISATTRUSUARIO = "Clas_1432633737216826Ser_8Arg_1_Alias";
    /** <code>usuarioDelCompanyiaUsuariopthisAttrUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELCOMPANYIAUSUARIO_USUARIODELCOMPANYIAUSUARIOPTHISATTRUSUARIO = "Atributos usuario";
    /** <code>usuarioDelCompanyiaUsuariopevcCompanyia</code> inbound argument name. */
    public static final String ARG_NAME_DELCOMPANYIAUSUARIO_USUARIODELCOMPANYIAUSUARIOPEVCCOMPANYIA = "p_evcCompanyia";
    /** <code>usuarioDelCompanyiaUsuariopevcCompanyia</code> inbound argument id. */
    public static final String ARG_ID_DELCOMPANYIAUSUARIO_USUARIODELCOMPANYIAUSUARIOPEVCCOMPANYIA = "Clas_1432633737216826Ser_8Arg_2_Alias";
    /** <code>usuarioDelCompanyiaUsuariopevcCompanyia</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELCOMPANYIAUSUARIO_USUARIODELCOMPANYIAUSUARIOPEVCCOMPANYIA = "Compañía anterior";
    // Service (DelParentescorUsuario)
    /** <code>DelParentescorUsuario</code> service id. */
    public static final String SERV_ID_DELPARENTESCORUSUARIO = "Clas_1432633737216826Ser_9_Alias";
    /** <code>DelParentescorUsuario</code> service name. */
    public static final String SERV_NAME_DELPARENTESCORUSUARIO = "DelParentescorUsuario";
    /** <code>DelParentescorUsuario</code> service alias. */
    public static final String SERV_ALIAS_DELPARENTESCORUSUARIO = "DelParentescorUsuario";
    /** Agents allowed to execute the service DelParentescorUsuario **/
    public static final String DELPARENTESCORUSUARIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioDelParentescorUsuariopthisAttrUsuario</code> inbound argument name. */
    public static final String ARG_NAME_DELPARENTESCORUSUARIO_USUARIODELPARENTESCORUSUARIOPTHISATTRUSUARIO = "p_thisAttrUsuario";
    /** <code>usuarioDelParentescorUsuariopthisAttrUsuario</code> inbound argument id. */
    public static final String ARG_ID_DELPARENTESCORUSUARIO_USUARIODELPARENTESCORUSUARIOPTHISATTRUSUARIO = "Clas_1432633737216826Ser_9Arg_1_Alias";
    /** <code>usuarioDelParentescorUsuariopthisAttrUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPARENTESCORUSUARIO_USUARIODELPARENTESCORUSUARIOPTHISATTRUSUARIO = "Atributos usuario";
    /** <code>usuarioDelParentescorUsuariopevcParentesco</code> inbound argument name. */
    public static final String ARG_NAME_DELPARENTESCORUSUARIO_USUARIODELPARENTESCORUSUARIOPEVCPARENTESCO = "p_evcParentesco";
    /** <code>usuarioDelParentescorUsuariopevcParentesco</code> inbound argument id. */
    public static final String ARG_ID_DELPARENTESCORUSUARIO_USUARIODELPARENTESCORUSUARIOPEVCPARENTESCO = "Clas_1432633737216826Ser_9Arg_2_Alias";
    /** <code>usuarioDelParentescorUsuariopevcParentesco</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPARENTESCORUSUARIO_USUARIODELPARENTESCORUSUARIOPEVCPARENTESCO = "Parentesco";
    // Service (DelEPSUsuario)
    /** <code>DelEPSUsuario</code> service id. */
    public static final String SERV_ID_DELEPSUSUARIO = "Clas_1432633737216826Ser_10_Alias";
    /** <code>DelEPSUsuario</code> service name. */
    public static final String SERV_NAME_DELEPSUSUARIO = "DelEPSUsuario";
    /** <code>DelEPSUsuario</code> service alias. */
    public static final String SERV_ALIAS_DELEPSUSUARIO = "DelEPSUsuario";
    /** Agents allowed to execute the service DelEPSUsuario **/
    public static final String DELEPSUSUARIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioDelEPSUsuariopthisAttrUsuario</code> inbound argument name. */
    public static final String ARG_NAME_DELEPSUSUARIO_USUARIODELEPSUSUARIOPTHISATTRUSUARIO = "p_thisAttrUsuario";
    /** <code>usuarioDelEPSUsuariopthisAttrUsuario</code> inbound argument id. */
    public static final String ARG_ID_DELEPSUSUARIO_USUARIODELEPSUSUARIOPTHISATTRUSUARIO = "Clas_1432633737216826Ser_10Arg_1_Alias";
    /** <code>usuarioDelEPSUsuariopthisAttrUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELEPSUSUARIO_USUARIODELEPSUSUARIOPTHISATTRUSUARIO = "Atributos usuario";
    /** <code>usuarioDelEPSUsuariopevcEps</code> inbound argument name. */
    public static final String ARG_NAME_DELEPSUSUARIO_USUARIODELEPSUSUARIOPEVCEPS = "p_evcEps";
    /** <code>usuarioDelEPSUsuariopevcEps</code> inbound argument id. */
    public static final String ARG_ID_DELEPSUSUARIO_USUARIODELEPSUSUARIOPEVCEPS = "Clas_1432633737216826Ser_10Arg_2_Alias";
    /** <code>usuarioDelEPSUsuariopevcEps</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELEPSUSUARIO_USUARIODELEPSUSUARIOPEVCEPS = "Eps";
    // Service (CambTipoIdUsuario)
    /** <code>CambTipoIdUsuario</code> service id. */
    public static final String SERV_ID_CAMBTIPOIDUSUARIO = "Clas_1432633737216826Ser_13_Alias";
    /** <code>CambTipoIdUsuario</code> service name. */
    public static final String SERV_NAME_CAMBTIPOIDUSUARIO = "CambTipoIdUsuario";
    /** <code>CambTipoIdUsuario</code> service alias. */
    public static final String SERV_ALIAS_CAMBTIPOIDUSUARIO = "CambTipoIdUsuario";
    /** Agents allowed to execute the service CambTipoIdUsuario **/
    public static final String CAMBTIPOIDUSUARIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioCambTipoIdUsuariopthisUsuario</code> inbound argument name. */
    public static final String ARG_NAME_CAMBTIPOIDUSUARIO_USUARIOCAMBTIPOIDUSUARIOPTHISUSUARIO = "p_thisUsuario";
    /** <code>usuarioCambTipoIdUsuariopthisUsuario</code> inbound argument id. */
    public static final String ARG_ID_CAMBTIPOIDUSUARIO_USUARIOCAMBTIPOIDUSUARIOPTHISUSUARIO = "Clas_1432633737216826Ser_13Arg_1_Alias";
    /** <code>usuarioCambTipoIdUsuariopthisUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBTIPOIDUSUARIO_USUARIOCAMBTIPOIDUSUARIOPTHISUSUARIO = "UsuarioS";
    /** <code>usuarioCambTipoIdUsuariopevcTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_CAMBTIPOIDUSUARIO_USUARIOCAMBTIPOIDUSUARIOPEVCTIPOIDENTIFICACION = "p_evcTipoIdentificacion";
    /** <code>usuarioCambTipoIdUsuariopevcTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_CAMBTIPOIDUSUARIO_USUARIOCAMBTIPOIDUSUARIOPEVCTIPOIDENTIFICACION = "Clas_1432633737216826Ser_13Arg_2_Alias";
    /** <code>usuarioCambTipoIdUsuariopevcTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBTIPOIDUSUARIO_USUARIOCAMBTIPOIDUSUARIOPEVCTIPOIDENTIFICACION = "Tipo Identificación";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1432633737216826Ser_15_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuariomodificarpthisUsuario</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_USUARIOMODIFICARPTHISUSUARIO = "p_thisUsuario";
    /** <code>usuariomodificarpthisUsuario</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_USUARIOMODIFICARPTHISUSUARIO = "Clas_1432633737216826Ser_15Arg_1_Alias";
    /** <code>usuariomodificarpthisUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_USUARIOMODIFICARPTHISUSUARIO = "Usuario";
    /** <code>usuariomodificarpCodigo</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_USUARIOMODIFICARPCODIGO = "p_Codigo";
    /** <code>usuariomodificarpCodigo</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_USUARIOMODIFICARPCODIGO = "Clas_1432633737216826Ser_15Arg_2_Alias";
    /** <code>usuariomodificarpCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_USUARIOMODIFICARPCODIGO = "Código";
    /** <code>usuariomodificarpNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_USUARIOMODIFICARPNUMIDENTIFICACION = "p_NumIdentificacion";
    /** <code>usuariomodificarpNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_USUARIOMODIFICARPNUMIDENTIFICACION = "Clas_1432633737216826Ser_15Arg_3_Alias";
    /** <code>usuariomodificarpNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_USUARIOMODIFICARPNUMIDENTIFICACION = "Nº Identificación";
    /** <code>usuariomodificarpPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_USUARIOMODIFICARPPRIMERNOMBRE = "p_PrimerNombre";
    /** <code>usuariomodificarpPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_USUARIOMODIFICARPPRIMERNOMBRE = "Clas_1432633737216826Ser_15Arg_4_Alias";
    /** <code>usuariomodificarpPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_USUARIOMODIFICARPPRIMERNOMBRE = "Primer nombre";
    /** <code>usuariomodificarpSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_USUARIOMODIFICARPSEGUNDONOMBRE = "p_SegundoNombre";
    /** <code>usuariomodificarpSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_USUARIOMODIFICARPSEGUNDONOMBRE = "Clas_1432633737216826Ser_15Arg_5_Alias";
    /** <code>usuariomodificarpSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_USUARIOMODIFICARPSEGUNDONOMBRE = "Segundo nombre";
    /** <code>usuariomodificarpPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_USUARIOMODIFICARPPRIMERAPELLIDO = "p_PrimerApellido";
    /** <code>usuariomodificarpPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_USUARIOMODIFICARPPRIMERAPELLIDO = "Clas_1432633737216826Ser_15Arg_6_Alias";
    /** <code>usuariomodificarpPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_USUARIOMODIFICARPPRIMERAPELLIDO = "Primer Apellido";
    /** <code>usuariomodificarpSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_USUARIOMODIFICARPSEGUNDOAPELLIDO = "p_SegundoApellido";
    /** <code>usuariomodificarpSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_USUARIOMODIFICARPSEGUNDOAPELLIDO = "Clas_1432633737216826Ser_15Arg_7_Alias";
    /** <code>usuariomodificarpSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_USUARIOMODIFICARPSEGUNDOAPELLIDO = "Segundo Apellido";
    // Service (modificarTipoUsuario)
    /** <code>modificarTipoUsuario</code> service id. */
    public static final String SERV_ID_MODIFICARTIPOUSUARIO = "Clas_1432633737216826Ser_19_Alias";
    /** <code>modificarTipoUsuario</code> service name. */
    public static final String SERV_NAME_MODIFICARTIPOUSUARIO = "modificarTipoUsuario";
    /** <code>modificarTipoUsuario</code> service alias. */
    public static final String SERV_ALIAS_MODIFICARTIPOUSUARIO = "modificarTipoUsuario";
    /** Agents allowed to execute the service modificarTipoUsuario **/
    public static final String MODIFICARTIPOUSUARIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuariomodificarTipoUsuariopthisUsuario</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARTIPOUSUARIO_USUARIOMODIFICARTIPOUSUARIOPTHISUSUARIO = "p_thisUsuario";
    /** <code>usuariomodificarTipoUsuariopthisUsuario</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARTIPOUSUARIO_USUARIOMODIFICARTIPOUSUARIOPTHISUSUARIO = "Clas_1432633737216826Ser_19Arg_1_Alias";
    /** <code>usuariomodificarTipoUsuariopthisUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARTIPOUSUARIO_USUARIOMODIFICARTIPOUSUARIOPTHISUSUARIO = "Usuario";
    /** <code>usuariomodificarTipoUsuariopTipoUsuario</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARTIPOUSUARIO_USUARIOMODIFICARTIPOUSUARIOPTIPOUSUARIO = "p_TipoUsuario";
    /** <code>usuariomodificarTipoUsuariopTipoUsuario</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARTIPOUSUARIO_USUARIOMODIFICARTIPOUSUARIOPTIPOUSUARIO = "Clas_1432633737216826Ser_19Arg_2_Alias";
    /** <code>usuariomodificarTipoUsuariopTipoUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARTIPOUSUARIO_USUARIOMODIFICARTIPOUSUARIOPTIPOUSUARIO = "Tipo usuario";
    // Service (marcarAttrDiligenciados)
    /** <code>marcarAttrDiligenciados</code> service id. */
    public static final String SERV_ID_MARCARATTRDILIGENCIADOS = "Clas_1432633737216826Ser_23_Alias";
    /** <code>marcarAttrDiligenciados</code> service name. */
    public static final String SERV_NAME_MARCARATTRDILIGENCIADOS = "marcarAttrDiligenciados";
    /** <code>marcarAttrDiligenciados</code> service alias. */
    public static final String SERV_ALIAS_MARCARATTRDILIGENCIADOS = "marcarAttrDiligenciados";
    /** Agents allowed to execute the service marcarAttrDiligenciados **/
    public static final String MARCARATTRDILIGENCIADOS_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuariomarcarAttrDiligenciadospthisUsuario</code> inbound argument name. */
    public static final String ARG_NAME_MARCARATTRDILIGENCIADOS_USUARIOMARCARATTRDILIGENCIADOSPTHISUSUARIO = "p_thisUsuario";
    /** <code>usuariomarcarAttrDiligenciadospthisUsuario</code> inbound argument id. */
    public static final String ARG_ID_MARCARATTRDILIGENCIADOS_USUARIOMARCARATTRDILIGENCIADOSPTHISUSUARIO = "Clas_1432633737216826Ser_23Arg_1_Alias";
    /** <code>usuariomarcarAttrDiligenciadospthisUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_MARCARATTRDILIGENCIADOS_USUARIOMARCARATTRDILIGENCIADOSPTHISUSUARIO = "Usuario";
    // Service (showCuesMedico)
    /** <code>showCuesMedico</code> service id. */
    public static final String SERV_ID_SHOWCUESMEDICO = "Clas_1432633737216826Ser_21_Alias";
    /** <code>showCuesMedico</code> service name. */
    public static final String SERV_NAME_SHOWCUESMEDICO = "showCuesMedico";
    /** <code>showCuesMedico</code> service alias. */
    public static final String SERV_ALIAS_SHOWCUESMEDICO = "Cuestionario médico";
    /** Agents allowed to execute the service showCuesMedico **/
    public static final String SHOWCUESMEDICO_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,MesaDeApoyo";
    // Preconditions
    /** <code>showCuesMedico</code> precondition 0 id. */
    public static final String PRE_ID_SHOWCUESMEDICO_0 = "Clas_1432633737216826Pre_7_MsgError";
    // Inbound arguments
    /** <code>usuarioshowCuesMedicopthisUsuario</code> inbound argument name. */
    public static final String ARG_NAME_SHOWCUESMEDICO_USUARIOSHOWCUESMEDICOPTHISUSUARIO = "p_thisUsuario";
    /** <code>usuarioshowCuesMedicopthisUsuario</code> inbound argument id. */
    public static final String ARG_ID_SHOWCUESMEDICO_USUARIOSHOWCUESMEDICOPTHISUSUARIO = "Clas_1432633737216826Ser_21Arg_1_Alias";
    /** <code>usuarioshowCuesMedicopthisUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_SHOWCUESMEDICO_USUARIOSHOWCUESMEDICOPTHISUSUARIO = "Usuario";
    // Outbound arguments
    /** <code>usuarioshowCuesMedicopsCuesMedico</code> outbound argument name. */
    public static final String ARG_NAME_SHOWCUESMEDICO_USUARIOSHOWCUESMEDICOPSCUESMEDICO = "usuarioshowCuesMedicopsCuesMedico";
    /** <code>usuarioshowCuesMedicopsCuesMedico</code> outbound argument id. */
    public static final String ARG_ID_SHOWCUESMEDICO_USUARIOSHOWCUESMEDICOPSCUESMEDICO = "Clas_1432633737216826Ser_21Arg_2_Alias";
    /** <code>usuarioshowCuesMedicopsCuesMedico</code> outbound argument alias. */
    public static final String ARG_ALIAS_SHOWCUESMEDICO_USUARIOSHOWCUESMEDICOPSCUESMEDICO = "Cuestionario médico";
    // Service (InsEstadoBeneficiarioCORE)
    /** <code>InsEstadoBeneficiarioCORE</code> service id. */
    public static final String SERV_ID_INSESTADOBENEFICIARIOCORE = "Clas_1432633737216826Ser_24_Alias";
    /** <code>InsEstadoBeneficiarioCORE</code> service name. */
    public static final String SERV_NAME_INSESTADOBENEFICIARIOCORE = "InsEstadoBeneficiarioCORE";
    /** <code>InsEstadoBeneficiarioCORE</code> service alias. */
    public static final String SERV_ALIAS_INSESTADOBENEFICIARIOCORE = "InsEstadoBeneficiarioCORE";
    /** Agents allowed to execute the service InsEstadoBeneficiarioCORE **/
    public static final String INSESTADOBENEFICIARIOCORE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioInsEstadoBeneficiarioCOREpthisUsuario</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOBENEFICIARIOCORE_USUARIOINSESTADOBENEFICIARIOCOREPTHISUSUARIO = "p_thisUsuario";
    /** <code>usuarioInsEstadoBeneficiarioCOREpthisUsuario</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOBENEFICIARIOCORE_USUARIOINSESTADOBENEFICIARIOCOREPTHISUSUARIO = "Clas_1432633737216826Ser_24Arg_1_Alias";
    /** <code>usuarioInsEstadoBeneficiarioCOREpthisUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOBENEFICIARIOCORE_USUARIOINSESTADOBENEFICIARIOCOREPTHISUSUARIO = "UsuarioS";
    /** <code>usuarioInsEstadoBeneficiarioCOREpevcEstadoBeneficiario</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOBENEFICIARIOCORE_USUARIOINSESTADOBENEFICIARIOCOREPEVCESTADOBENEFICIARIO = "p_evcEstadoBeneficiario";
    /** <code>usuarioInsEstadoBeneficiarioCOREpevcEstadoBeneficiario</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOBENEFICIARIOCORE_USUARIOINSESTADOBENEFICIARIOCOREPEVCESTADOBENEFICIARIO = "Clas_1432633737216826Ser_24Arg_2_Alias";
    /** <code>usuarioInsEstadoBeneficiarioCOREpevcEstadoBeneficiario</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOBENEFICIARIOCORE_USUARIOINSESTADOBENEFICIARIOCOREPEVCESTADOBENEFICIARIO = "Estado beneficiario CORE";
    // Service (DelEstadoBeneficiarioCORE)
    /** <code>DelEstadoBeneficiarioCORE</code> service id. */
    public static final String SERV_ID_DELESTADOBENEFICIARIOCORE = "Clas_1432633737216826Ser_25_Alias";
    /** <code>DelEstadoBeneficiarioCORE</code> service name. */
    public static final String SERV_NAME_DELESTADOBENEFICIARIOCORE = "DelEstadoBeneficiarioCORE";
    /** <code>DelEstadoBeneficiarioCORE</code> service alias. */
    public static final String SERV_ALIAS_DELESTADOBENEFICIARIOCORE = "DelEstadoBeneficiarioCORE";
    /** Agents allowed to execute the service DelEstadoBeneficiarioCORE **/
    public static final String DELESTADOBENEFICIARIOCORE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioDelEstadoBeneficiarioCOREpthisUsuario</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOBENEFICIARIOCORE_USUARIODELESTADOBENEFICIARIOCOREPTHISUSUARIO = "p_thisUsuario";
    /** <code>usuarioDelEstadoBeneficiarioCOREpthisUsuario</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOBENEFICIARIOCORE_USUARIODELESTADOBENEFICIARIOCOREPTHISUSUARIO = "Clas_1432633737216826Ser_25Arg_1_Alias";
    /** <code>usuarioDelEstadoBeneficiarioCOREpthisUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOBENEFICIARIOCORE_USUARIODELESTADOBENEFICIARIOCOREPTHISUSUARIO = "UsuarioS";
    /** <code>usuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiario</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOBENEFICIARIOCORE_USUARIODELESTADOBENEFICIARIOCOREPEVCESTADOBENEFICIARIO = "p_evcEstadoBeneficiario";
    /** <code>usuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiario</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOBENEFICIARIOCORE_USUARIODELESTADOBENEFICIARIOCOREPEVCESTADOBENEFICIARIO = "Clas_1432633737216826Ser_25Arg_2_Alias";
    /** <code>usuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiario</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOBENEFICIARIOCORE_USUARIODELESTADOBENEFICIARIOCOREPEVCESTADOBENEFICIARIO = "Estado beneficiario CORE";
    // Service (registrarDatosCORE)
    /** <code>registrarDatosCORE</code> service id. */
    public static final String SERV_ID_REGISTRARDATOSCORE = "Clas_1432633737216826Ser_26_Alias";
    /** <code>registrarDatosCORE</code> service name. */
    public static final String SERV_NAME_REGISTRARDATOSCORE = "registrarDatosCORE";
    /** <code>registrarDatosCORE</code> service alias. */
    public static final String SERV_ALIAS_REGISTRARDATOSCORE = "registrarDatosCORE";
    /** Agents allowed to execute the service registrarDatosCORE **/
    public static final String REGISTRARDATOSCORE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioregistrarDatosCOREpthisUsuario</code> inbound argument name. */
    public static final String ARG_NAME_REGISTRARDATOSCORE_USUARIOREGISTRARDATOSCOREPTHISUSUARIO = "p_thisUsuario";
    /** <code>usuarioregistrarDatosCOREpthisUsuario</code> inbound argument id. */
    public static final String ARG_ID_REGISTRARDATOSCORE_USUARIOREGISTRARDATOSCOREPTHISUSUARIO = "Clas_1432633737216826Ser_26Arg_1_Alias";
    /** <code>usuarioregistrarDatosCOREpthisUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_REGISTRARDATOSCORE_USUARIOREGISTRARDATOSCOREPTHISUSUARIO = "Usuario";
    /** <code>usuarioregistrarDatosCOREpNumUsuario</code> inbound argument name. */
    public static final String ARG_NAME_REGISTRARDATOSCORE_USUARIOREGISTRARDATOSCOREPNUMUSUARIO = "p_NumUsuario";
    /** <code>usuarioregistrarDatosCOREpNumUsuario</code> inbound argument id. */
    public static final String ARG_ID_REGISTRARDATOSCORE_USUARIOREGISTRARDATOSCOREPNUMUSUARIO = "Clas_1432633737216826Ser_26Arg_15_Alias";
    /** <code>usuarioregistrarDatosCOREpNumUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_REGISTRARDATOSCORE_USUARIOREGISTRARDATOSCOREPNUMUSUARIO = "Nº Usuario";
    /** <code>usuarioregistrarDatosCOREpRequierExamenMedico</code> inbound argument name. */
    public static final String ARG_NAME_REGISTRARDATOSCORE_USUARIOREGISTRARDATOSCOREPREQUIEREXAMENMEDICO = "p_RequierExamenMedico";
    /** <code>usuarioregistrarDatosCOREpRequierExamenMedico</code> inbound argument id. */
    public static final String ARG_ID_REGISTRARDATOSCORE_USUARIOREGISTRARDATOSCOREPREQUIEREXAMENMEDICO = "Clas_1432633737216826Ser_26Arg_16_Alias";
    /** <code>usuarioregistrarDatosCOREpRequierExamenMedico</code> inbound argument alias. */
    public static final String ARG_ALIAS_REGISTRARDATOSCORE_USUARIOREGISTRARDATOSCOREPREQUIEREXAMENMEDICO = "Requiere examen médico";
    /** <code>usuarioregistrarDatosCOREpEstadoMedico</code> inbound argument name. */
    public static final String ARG_NAME_REGISTRARDATOSCORE_USUARIOREGISTRARDATOSCOREPESTADOMEDICO = "p_EstadoMedico";
    /** <code>usuarioregistrarDatosCOREpEstadoMedico</code> inbound argument id. */
    public static final String ARG_ID_REGISTRARDATOSCORE_USUARIOREGISTRARDATOSCOREPESTADOMEDICO = "Clas_1432633737216826Ser_26Arg_17_Alias";
    /** <code>usuarioregistrarDatosCOREpEstadoMedico</code> inbound argument alias. */
    public static final String ARG_ALIAS_REGISTRARDATOSCORE_USUARIOREGISTRARDATOSCOREPESTADOMEDICO = "Estado médico";
    /** <code>usuarioregistrarDatosCOREpValorCuotaInscripcion</code> inbound argument name. */
    public static final String ARG_NAME_REGISTRARDATOSCORE_USUARIOREGISTRARDATOSCOREPVALORCUOTAINSCRIPCION = "p_ValorCuotaInscripcion";
    /** <code>usuarioregistrarDatosCOREpValorCuotaInscripcion</code> inbound argument id. */
    public static final String ARG_ID_REGISTRARDATOSCORE_USUARIOREGISTRARDATOSCOREPVALORCUOTAINSCRIPCION = "Clas_1432633737216826Ser_26Arg_18_Alias";
    /** <code>usuarioregistrarDatosCOREpValorCuotaInscripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_REGISTRARDATOSCORE_USUARIOREGISTRARDATOSCOREPVALORCUOTAINSCRIPCION = "Valor cuota inscripción";
    /** <code>usuarioregistrarDatosCOREpTienePreexistencias</code> inbound argument name. */
    public static final String ARG_NAME_REGISTRARDATOSCORE_USUARIOREGISTRARDATOSCOREPTIENEPREEXISTENCIAS = "p_TienePreexistencias";
    /** <code>usuarioregistrarDatosCOREpTienePreexistencias</code> inbound argument id. */
    public static final String ARG_ID_REGISTRARDATOSCORE_USUARIOREGISTRARDATOSCOREPTIENEPREEXISTENCIAS = "Clas_1432633737216826Ser_26Arg_19_Alias";
    /** <code>usuarioregistrarDatosCOREpTienePreexistencias</code> inbound argument alias. */
    public static final String ARG_ALIAS_REGISTRARDATOSCORE_USUARIOREGISTRARDATOSCOREPTIENEPREEXISTENCIAS = "Tiene preexistencias";
    /** <code>usuarioregistrarDatosCOREpFechaInicionVigencia</code> inbound argument name. */
    public static final String ARG_NAME_REGISTRARDATOSCORE_USUARIOREGISTRARDATOSCOREPFECHAINICIONVIGENCIA = "p_FechaInicionVigencia";
    /** <code>usuarioregistrarDatosCOREpFechaInicionVigencia</code> inbound argument id. */
    public static final String ARG_ID_REGISTRARDATOSCORE_USUARIOREGISTRARDATOSCOREPFECHAINICIONVIGENCIA = "Clas_1432633737216826Ser_26Arg_20_Alias";
    /** <code>usuarioregistrarDatosCOREpFechaInicionVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_REGISTRARDATOSCORE_USUARIOREGISTRARDATOSCOREPFECHAINICIONVIGENCIA = "Fecha inicio vigencia";
    /** <code>usuarioregistrarDatosCOREpFechaFinVigencia</code> inbound argument name. */
    public static final String ARG_NAME_REGISTRARDATOSCORE_USUARIOREGISTRARDATOSCOREPFECHAFINVIGENCIA = "p_FechaFinVigencia";
    /** <code>usuarioregistrarDatosCOREpFechaFinVigencia</code> inbound argument id. */
    public static final String ARG_ID_REGISTRARDATOSCORE_USUARIOREGISTRARDATOSCOREPFECHAFINVIGENCIA = "Clas_1432633737216826Ser_26Arg_21_Alias";
    /** <code>usuarioregistrarDatosCOREpFechaFinVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_REGISTRARDATOSCORE_USUARIOREGISTRARDATOSCOREPFECHAFINVIGENCIA = "Fecha fin vigencia";
    // Service (setTieneDocIdentificacion)
    /** <code>setTieneDocIdentificacion</code> service id. */
    public static final String SERV_ID_SETTIENEDOCIDENTIFICACION = "Clas_1432633737216826Ser_29_Alias";
    /** <code>setTieneDocIdentificacion</code> service name. */
    public static final String SERV_NAME_SETTIENEDOCIDENTIFICACION = "setTieneDocIdentificacion";
    /** <code>setTieneDocIdentificacion</code> service alias. */
    public static final String SERV_ALIAS_SETTIENEDOCIDENTIFICACION = "setTieneDocIdentificacion";
    /** Agents allowed to execute the service setTieneDocIdentificacion **/
    public static final String SETTIENEDOCIDENTIFICACION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuariosetTieneDocIdentificacionpthisUsuario</code> inbound argument name. */
    public static final String ARG_NAME_SETTIENEDOCIDENTIFICACION_USUARIOSETTIENEDOCIDENTIFICACIONPTHISUSUARIO = "p_thisUsuario";
    /** <code>usuariosetTieneDocIdentificacionpthisUsuario</code> inbound argument id. */
    public static final String ARG_ID_SETTIENEDOCIDENTIFICACION_USUARIOSETTIENEDOCIDENTIFICACIONPTHISUSUARIO = "Clas_1432633737216826Ser_29Arg_1_Alias";
    /** <code>usuariosetTieneDocIdentificacionpthisUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETTIENEDOCIDENTIFICACION_USUARIOSETTIENEDOCIDENTIFICACIONPTHISUSUARIO = "Usuario";
    // Service (setTieneDocsSolicitud)
    /** <code>setTieneDocsSolicitud</code> service id. */
    public static final String SERV_ID_SETTIENEDOCSSOLICITUD = "Clas_1432633737216826Ser_30_Alias";
    /** <code>setTieneDocsSolicitud</code> service name. */
    public static final String SERV_NAME_SETTIENEDOCSSOLICITUD = "setTieneDocsSolicitud";
    /** <code>setTieneDocsSolicitud</code> service alias. */
    public static final String SERV_ALIAS_SETTIENEDOCSSOLICITUD = "setTieneDocsSolicitud";
    /** Agents allowed to execute the service setTieneDocsSolicitud **/
    public static final String SETTIENEDOCSSOLICITUD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuariosetTieneDocsSolicitudpthisUsuario</code> inbound argument name. */
    public static final String ARG_NAME_SETTIENEDOCSSOLICITUD_USUARIOSETTIENEDOCSSOLICITUDPTHISUSUARIO = "p_thisUsuario";
    /** <code>usuariosetTieneDocsSolicitudpthisUsuario</code> inbound argument id. */
    public static final String ARG_ID_SETTIENEDOCSSOLICITUD_USUARIOSETTIENEDOCSSOLICITUDPTHISUSUARIO = "Clas_1432633737216826Ser_30Arg_1_Alias";
    /** <code>usuariosetTieneDocsSolicitudpthisUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETTIENEDOCSSOLICITUD_USUARIOSETTIENEDOCSSOLICITUDPTHISUSUARIO = "Usuario";
    // Service (calcularIMC)
    /** <code>calcularIMC</code> service id. */
    public static final String SERV_ID_CALCULARIMC = "Clas_1432633737216826Ser_37_Alias";
    /** <code>calcularIMC</code> service name. */
    public static final String SERV_NAME_CALCULARIMC = "calcularIMC";
    /** <code>calcularIMC</code> service alias. */
    public static final String SERV_ALIAS_CALCULARIMC = "calcularIMC";
    /** Agents allowed to execute the service calcularIMC **/
    public static final String CALCULARIMC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuariocalcularIMCpthisUsuario</code> inbound argument name. */
    public static final String ARG_NAME_CALCULARIMC_USUARIOCALCULARIMCPTHISUSUARIO = "p_thisUsuario";
    /** <code>usuariocalcularIMCpthisUsuario</code> inbound argument id. */
    public static final String ARG_ID_CALCULARIMC_USUARIOCALCULARIMCPTHISUSUARIO = "Clas_1432633737216826Ser_37Arg_1_Alias";
    /** <code>usuariocalcularIMCpthisUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CALCULARIMC_USUARIOCALCULARIMCPTHISUSUARIO = "Usuario";
    // Service (TCREAR)
    /** <code>TCREAR</code> service id. */
    public static final String SERV_ID_TCREAR = "Clas_1432633737216826Ser_11_Alias";
    /** <code>TCREAR</code> service name. */
    public static final String SERV_NAME_TCREAR = "TCREAR";
    /** <code>TCREAR</code> service alias. */
    public static final String SERV_ALIAS_TCREAR = "TCREAR";
    /** Agents allowed to execute the service TCREAR **/
    public static final String TCREAR_SRVAGENTS = "";
    // Preconditions
    /** <code>TCREAR</code> precondition 0 id. */
    public static final String PRE_ID_TCREAR_0 = "Clas_1432633737216826Pre_4_MsgError";
    /** <code>TCREAR</code> precondition 1 id. */
    public static final String PRE_ID_TCREAR_1 = "Clas_1432633737216826Pre_25_MsgError";
    // Inbound arguments
    /** <code>usuarioTCREARptpagrSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_USUARIOTCREARPTPAGRSOLICITUD = "pt_p_agrSolicitud";
    /** <code>usuarioTCREARptpagrSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_USUARIOTCREARPTPAGRSOLICITUD = "Clas_1432633737216826Ser_11Arg_3_Alias";
    /** <code>usuarioTCREARptpagrSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_USUARIOTCREARPTPAGRSOLICITUD = "Solicitud";
    /** <code>usuarioTCREARptpagrUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_USUARIOTCREARPTPAGRUSUARIO = "pt_p_agrUsuario";
    /** <code>usuarioTCREARptpagrUsuario</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_USUARIOTCREARPTPAGRUSUARIO = "Clas_1432633737216826Ser_11Arg_4_Alias";
    /** <code>usuarioTCREARptpagrUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_USUARIOTCREARPTPAGRUSUARIO = "Usuario";
    /** <code>usuarioTCREARptpagrParentesco</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_USUARIOTCREARPTPAGRPARENTESCO = "pt_p_agrParentesco";
    /** <code>usuarioTCREARptpagrParentesco</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_USUARIOTCREARPTPAGRPARENTESCO = "Clas_1432633737216826Ser_11Arg_346_Alias";
    /** <code>usuarioTCREARptpagrParentesco</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_USUARIOTCREARPTPAGRPARENTESCO = "Parentesco";
    /** <code>usuarioTCREARptpatrCodigoTipoUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_USUARIOTCREARPTPATRCODIGOTIPOUSUARIO = "pt_p_atrCodigoTipoUsuario";
    /** <code>usuarioTCREARptpatrCodigoTipoUsuario</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_USUARIOTCREARPTPATRCODIGOTIPOUSUARIO = "Clas_1432633737216826Ser_11Arg_348_Alias";
    /** <code>usuarioTCREARptpatrCodigoTipoUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_USUARIOTCREARPTPATRCODIGOTIPOUSUARIO = "Tipo usuario";
    /** <code>usuarioTCREARptpatrBebeGestante</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_USUARIOTCREARPTPATRBEBEGESTANTE = "pt_p_atrBebeGestante";
    /** <code>usuarioTCREARptpatrBebeGestante</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_USUARIOTCREARPTPATRBEBEGESTANTE = "Clas_1432633737216826Ser_11Arg_350_Alias";
    /** <code>usuarioTCREARptpatrBebeGestante</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_USUARIOTCREARPTPATRBEBEGESTANTE = "Bebé gestante";
    /** <code>usuarioTCREARptpatrcodigoBancoRep</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_USUARIOTCREARPTPATRCODIGOBANCOREP = "pt_p_atrcodigoBancoRep";
    /** <code>usuarioTCREARptpatrcodigoBancoRep</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_USUARIOTCREARPTPATRCODIGOBANCOREP = "Clas_1432633737216826Ser_11Arg_1266_Alias";
    /** <code>usuarioTCREARptpatrcodigoBancoRep</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_USUARIOTCREARPTPATRCODIGOBANCOREP = "Cod. Banco República";
    /** <code>usuarioTCREARptpatrUsuarioReplicado</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_USUARIOTCREARPTPATRUSUARIOREPLICADO = "pt_p_atrUsuarioReplicado";
    /** <code>usuarioTCREARptpatrUsuarioReplicado</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_USUARIOTCREARPTPATRUSUARIOREPLICADO = "Clas_1432633737216826Ser_11Arg_1274_Alias";
    /** <code>usuarioTCREARptpatrUsuarioReplicado</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_USUARIOTCREARPTPATRUSUARIOREPLICADO = "Usuario replicado";
    // Service (TMODIFICAR)
    /** <code>TMODIFICAR</code> service id. */
    public static final String SERV_ID_TMODIFICAR = "Clas_1432633737216826Ser_16_Alias";
    /** <code>TMODIFICAR</code> service name. */
    public static final String SERV_NAME_TMODIFICAR = "TMODIFICAR";
    /** <code>TMODIFICAR</code> service alias. */
    public static final String SERV_ALIAS_TMODIFICAR = "TMODIFICAR";
    /** Agents allowed to execute the service TMODIFICAR **/
    public static final String TMODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioTMODIFICARpthisUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_USUARIOTMODIFICARPTHISUSUARIO = "p_thisUsuario";
    /** <code>usuarioTMODIFICARpthisUsuario</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_USUARIOTMODIFICARPTHISUSUARIO = "Clas_1432633737216826Ser_16Arg_1_Alias";
    /** <code>usuarioTMODIFICARpthisUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_USUARIOTMODIFICARPTHISUSUARIO = "Usuario";
    /** <code>usuarioTMODIFICARptpCodigo</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_USUARIOTMODIFICARPTPCODIGO = "pt_p_Codigo";
    /** <code>usuarioTMODIFICARptpCodigo</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_USUARIOTMODIFICARPTPCODIGO = "Clas_1432633737216826Ser_16Arg_2_Alias";
    /** <code>usuarioTMODIFICARptpCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_USUARIOTMODIFICARPTPCODIGO = "Código";
    /** <code>usuarioTMODIFICARptpNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_USUARIOTMODIFICARPTPNUMIDENTIFICACION = "pt_p_NumIdentificacion";
    /** <code>usuarioTMODIFICARptpNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_USUARIOTMODIFICARPTPNUMIDENTIFICACION = "Clas_1432633737216826Ser_16Arg_3_Alias";
    /** <code>usuarioTMODIFICARptpNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_USUARIOTMODIFICARPTPNUMIDENTIFICACION = "Nº Identificación";
    /** <code>usuarioTMODIFICARptpPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_USUARIOTMODIFICARPTPPRIMERNOMBRE = "pt_p_PrimerNombre";
    /** <code>usuarioTMODIFICARptpPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_USUARIOTMODIFICARPTPPRIMERNOMBRE = "Clas_1432633737216826Ser_16Arg_4_Alias";
    /** <code>usuarioTMODIFICARptpPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_USUARIOTMODIFICARPTPPRIMERNOMBRE = "Primer nombre";
    /** <code>usuarioTMODIFICARptpSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_USUARIOTMODIFICARPTPSEGUNDONOMBRE = "pt_p_SegundoNombre";
    /** <code>usuarioTMODIFICARptpSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_USUARIOTMODIFICARPTPSEGUNDONOMBRE = "Clas_1432633737216826Ser_16Arg_5_Alias";
    /** <code>usuarioTMODIFICARptpSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_USUARIOTMODIFICARPTPSEGUNDONOMBRE = "Segundo nombre";
    /** <code>usuarioTMODIFICARptpPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_USUARIOTMODIFICARPTPPRIMERAPELLIDO = "pt_p_PrimerApellido";
    /** <code>usuarioTMODIFICARptpPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_USUARIOTMODIFICARPTPPRIMERAPELLIDO = "Clas_1432633737216826Ser_16Arg_6_Alias";
    /** <code>usuarioTMODIFICARptpPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_USUARIOTMODIFICARPTPPRIMERAPELLIDO = "Primer Apellido";
    /** <code>usuarioTMODIFICARptpSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_USUARIOTMODIFICARPTPSEGUNDOAPELLIDO = "pt_p_SegundoApellido";
    /** <code>usuarioTMODIFICARptpSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_USUARIOTMODIFICARPTPSEGUNDOAPELLIDO = "Clas_1432633737216826Ser_16Arg_7_Alias";
    /** <code>usuarioTMODIFICARptpSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_USUARIOTMODIFICARPTPSEGUNDOAPELLIDO = "Segundo Apellido";
    /** <code>usuarioTMODIFICARptpevcTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_USUARIOTMODIFICARPTPEVCTIPOIDENTIFICACION = "pt_p_evcTipoIdentificacion";
    /** <code>usuarioTMODIFICARptpevcTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_USUARIOTMODIFICARPTPEVCTIPOIDENTIFICACION = "Clas_1432633737216826Ser_16Arg_8_Alias";
    /** <code>usuarioTMODIFICARptpevcTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_USUARIOTMODIFICARPTPEVCTIPOIDENTIFICACION = "Tipo Identificación";
    /** <code>usuarioTMODIFICARpEsElTitular</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_USUARIOTMODIFICARPESELTITULAR = "p_EsElTitular";
    /** <code>usuarioTMODIFICARpEsElTitular</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_USUARIOTMODIFICARPESELTITULAR = "Clas_1432633737216826Ser_16Arg_9_Alias";
    /** <code>usuarioTMODIFICARpEsElTitular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_USUARIOTMODIFICARPESELTITULAR = "Es el titular";
    // Service (TMODIFICARATTR)
    /** <code>TMODIFICARATTR</code> service id. */
    public static final String SERV_ID_TMODIFICARATTR = "Clas_1432633737216826Ser_12_Alias";
    /** <code>TMODIFICARATTR</code> service name. */
    public static final String SERV_NAME_TMODIFICARATTR = "TMODIFICARATTR";
    /** <code>TMODIFICARATTR</code> service alias. */
    public static final String SERV_ALIAS_TMODIFICARATTR = "Modificar atributos de usuario";
    /** Agents allowed to execute the service TMODIFICARATTR **/
    public static final String TMODIFICARATTR_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Preconditions
    /** <code>TMODIFICARATTR</code> precondition 0 id. */
    public static final String PRE_ID_TMODIFICARATTR_0 = "Clas_1432633737216826Pre_3_MsgError";
    /** <code>TMODIFICARATTR</code> precondition 1 id. */
    public static final String PRE_ID_TMODIFICARATTR_1 = "Clas_1432633737216826Pre_1_MsgError";
    /** <code>TMODIFICARATTR</code> precondition 2 id. */
    public static final String PRE_ID_TMODIFICARATTR_2 = "Clas_1432633737216826Pre_11_MsgError";
    /** <code>TMODIFICARATTR</code> precondition 3 id. */
    public static final String PRE_ID_TMODIFICARATTR_3 = "Clas_1432633737216826Pre_12_MsgError";
    /** <code>TMODIFICARATTR</code> precondition 4 id. */
    public static final String PRE_ID_TMODIFICARATTR_4 = "Clas_1432633737216826Pre_26_MsgError";
    // Inbound arguments
    /** <code>usuarioTMODIFICARATTRpthisAttrUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARATTR_USUARIOTMODIFICARATTRPTHISATTRUSUARIO = "p_thisAttrUsuario";
    /** <code>usuarioTMODIFICARATTRpthisAttrUsuario</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARATTR_USUARIOTMODIFICARATTRPTHISATTRUSUARIO = "Clas_1432633737216826Ser_12Arg_1_Alias";
    /** <code>usuarioTMODIFICARATTRpthisAttrUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARATTR_USUARIOTMODIFICARATTRPTHISATTRUSUARIO = "Usuario";
    /** <code>usuarioTMODIFICARATTRptpBebeGestante</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARATTR_USUARIOTMODIFICARATTRPTPBEBEGESTANTE = "pt_p_BebeGestante";
    /** <code>usuarioTMODIFICARATTRptpBebeGestante</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARATTR_USUARIOTMODIFICARATTRPTPBEBEGESTANTE = "Clas_1432633737216826Ser_12Arg_2_Alias";
    /** <code>usuarioTMODIFICARATTRptpBebeGestante</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARATTR_USUARIOTMODIFICARATTRPTPBEBEGESTANTE = "Bebé gestante";
    /** <code>usuarioTMODIFICARATTRptpevcCompanyia</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARATTR_USUARIOTMODIFICARATTRPTPEVCCOMPANYIA = "pt_p_evcCompanyia";
    /** <code>usuarioTMODIFICARATTRptpevcCompanyia</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARATTR_USUARIOTMODIFICARATTRPTPEVCCOMPANYIA = "Clas_1432633737216826Ser_12Arg_3_Alias";
    /** <code>usuarioTMODIFICARATTRptpevcCompanyia</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARATTR_USUARIOTMODIFICARATTRPTPEVCCOMPANYIA = "Compañía anterior";
    /** <code>usuarioTMODIFICARATTRptpevcEPS</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARATTR_USUARIOTMODIFICARATTRPTPEVCEPS = "pt_p_evcEPS";
    /** <code>usuarioTMODIFICARATTRptpevcEPS</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARATTR_USUARIOTMODIFICARATTRPTPEVCEPS = "Clas_1432633737216826Ser_12Arg_4_Alias";
    /** <code>usuarioTMODIFICARATTRptpevcEPS</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARATTR_USUARIOTMODIFICARATTRPTPEVCEPS = "EPS";
    /** <code>usuarioTMODIFICARATTRptpevcParentesco</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARATTR_USUARIOTMODIFICARATTRPTPEVCPARENTESCO = "pt_p_evcParentesco";
    /** <code>usuarioTMODIFICARATTRptpevcParentesco</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARATTR_USUARIOTMODIFICARATTRPTPEVCPARENTESCO = "Clas_1432633737216826Ser_12Arg_5_Alias";
    /** <code>usuarioTMODIFICARATTRptpevcParentesco</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARATTR_USUARIOTMODIFICARATTRPTPEVCPARENTESCO = "Parentesco";
    /** <code>usuarioTMODIFICARATTRptpcodigoBancoRep</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARATTR_USUARIOTMODIFICARATTRPTPCODIGOBANCOREP = "pt_p_codigoBancoRep";
    /** <code>usuarioTMODIFICARATTRptpcodigoBancoRep</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARATTR_USUARIOTMODIFICARATTRPTPCODIGOBANCOREP = "Clas_1432633737216826Ser_12Arg_6_Alias";
    /** <code>usuarioTMODIFICARATTRptpcodigoBancoRep</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARATTR_USUARIOTMODIFICARATTRPTPCODIGOBANCOREP = "Cod. Banco República";
    /** <code>usuarioTMODIFICARATTRptpFechaAntiguedad</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARATTR_USUARIOTMODIFICARATTRPTPFECHAANTIGUEDAD = "pt_p_FechaAntiguedad";
    /** <code>usuarioTMODIFICARATTRptpFechaAntiguedad</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARATTR_USUARIOTMODIFICARATTRPTPFECHAANTIGUEDAD = "Clas_1432633737216826Ser_12Arg_7_Alias";
    /** <code>usuarioTMODIFICARATTRptpFechaAntiguedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARATTR_USUARIOTMODIFICARATTRPTPFECHAANTIGUEDAD = "Fecha antigüedad beneficiario";
    /** <code>usuarioTMODIFICARATTRptpePolizaInternacional</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARATTR_USUARIOTMODIFICARATTRPTPEPOLIZAINTERNACIONAL = "pt_pePolizaInternacional";
    /** <code>usuarioTMODIFICARATTRptpePolizaInternacional</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARATTR_USUARIOTMODIFICARATTRPTPEPOLIZAINTERNACIONAL = "Clas_1432633737216826Ser_12Arg_8_Alias";
    /** <code>usuarioTMODIFICARATTRptpePolizaInternacional</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARATTR_USUARIOTMODIFICARATTRPTPEPOLIZAINTERNACIONAL = "Respaldo global";
    // Service (TMODUSUARIO)
    /** <code>TMODUSUARIO</code> service id. */
    public static final String SERV_ID_TMODUSUARIO = "Clas_1432633737216826Ser_14_Alias";
    /** <code>TMODUSUARIO</code> service name. */
    public static final String SERV_NAME_TMODUSUARIO = "TMODUSUARIO";
    /** <code>TMODUSUARIO</code> service alias. */
    public static final String SERV_ALIAS_TMODUSUARIO = "Modificar usuario";
    /** Agents allowed to execute the service TMODUSUARIO **/
    public static final String TMODUSUARIO_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Preconditions
    /** <code>TMODUSUARIO</code> precondition 0 id. */
    public static final String PRE_ID_TMODUSUARIO_0 = "Clas_1432633737216826Pre_22_MsgError";
    // Inbound arguments
    /** <code>usuarioTMODUSUARIOpthisUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTHISUSUARIO = "p_thisUsuario";
    /** <code>usuarioTMODUSUARIOpthisUsuario</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTHISUSUARIO = "Clas_1432633737216826Ser_14Arg_1_Alias";
    /** <code>usuarioTMODUSUARIOpthisUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTHISUSUARIO = "Usuario";
    /** <code>usuarioTMODUSUARIOptpPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTPPRIMERNOMBRE = "pt_p_PrimerNombre";
    /** <code>usuarioTMODUSUARIOptpPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPPRIMERNOMBRE = "Clas_1432633737216826Ser_14Arg_2_Alias";
    /** <code>usuarioTMODUSUARIOptpPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPPRIMERNOMBRE = "Primer nombre";
    /** <code>usuarioTMODUSUARIOptpSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTPSEGUNDONOMBRE = "pt_p_SegundoNombre";
    /** <code>usuarioTMODUSUARIOptpSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPSEGUNDONOMBRE = "Clas_1432633737216826Ser_14Arg_3_Alias";
    /** <code>usuarioTMODUSUARIOptpSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPSEGUNDONOMBRE = "Segundo nombre";
    /** <code>usuarioTMODUSUARIOptpPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTPPRIMERAPELLIDO = "pt_p_PrimerApellido";
    /** <code>usuarioTMODUSUARIOptpPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPPRIMERAPELLIDO = "Clas_1432633737216826Ser_14Arg_4_Alias";
    /** <code>usuarioTMODUSUARIOptpPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPPRIMERAPELLIDO = "Primer Apellido";
    /** <code>usuarioTMODUSUARIOptpSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTPSEGUNDOAPELLIDO = "pt_p_SegundoApellido";
    /** <code>usuarioTMODUSUARIOptpSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPSEGUNDOAPELLIDO = "Clas_1432633737216826Ser_14Arg_5_Alias";
    /** <code>usuarioTMODUSUARIOptpSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPSEGUNDOAPELLIDO = "Segundo Apellido";
    /** <code>usuarioTMODUSUARIOptpFechaNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTPFECHANACIMIENTO = "pt_p_FechaNacimiento";
    /** <code>usuarioTMODUSUARIOptpFechaNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPFECHANACIMIENTO = "Clas_1432633737216826Ser_14Arg_6_Alias";
    /** <code>usuarioTMODUSUARIOptpFechaNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPFECHANACIMIENTO = "Fecha nacimiento";
    /** <code>usuarioTMODUSUARIOptpGenero</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTPGENERO = "pt_p_Genero";
    /** <code>usuarioTMODUSUARIOptpGenero</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPGENERO = "Clas_1432633737216826Ser_14Arg_7_Alias";
    /** <code>usuarioTMODUSUARIOptpGenero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPGENERO = "Género";
    /** <code>usuarioTMODUSUARIOptpIndicadorExtranjero</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTPINDICADOREXTRANJERO = "pt_p_IndicadorExtranjero";
    /** <code>usuarioTMODUSUARIOptpIndicadorExtranjero</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPINDICADOREXTRANJERO = "Clas_1432633737216826Ser_14Arg_8_Alias";
    /** <code>usuarioTMODUSUARIOptpIndicadorExtranjero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPINDICADOREXTRANJERO = "Indicador extranjero";
    /** <code>usuarioTMODUSUARIOptpTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTPTELEFONOFIJO = "pt_p_TelefonoFijo";
    /** <code>usuarioTMODUSUARIOptpTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPTELEFONOFIJO = "Clas_1432633737216826Ser_14Arg_9_Alias";
    /** <code>usuarioTMODUSUARIOptpTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPTELEFONOFIJO = "Teléfono fijo";
    /** <code>usuarioTMODUSUARIOptpTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTPTELEFONOCELULAR = "pt_p_TelefonoCelular";
    /** <code>usuarioTMODUSUARIOptpTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPTELEFONOCELULAR = "Clas_1432633737216826Ser_14Arg_10_Alias";
    /** <code>usuarioTMODUSUARIOptpTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPTELEFONOCELULAR = "Teléfono celular";
    /** <code>usuarioTMODUSUARIOptpCorreoElectronico</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTPCORREOELECTRONICO = "pt_p_CorreoElectronico";
    /** <code>usuarioTMODUSUARIOptpCorreoElectronico</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPCORREOELECTRONICO = "Clas_1432633737216826Ser_14Arg_11_Alias";
    /** <code>usuarioTMODUSUARIOptpCorreoElectronico</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPCORREOELECTRONICO = "Correo electrónico";
    /** <code>usuarioTMODUSUARIOptpevcDepartamentoNac</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTPEVCDEPARTAMENTONAC = "pt_p_evcDepartamentoNac";
    /** <code>usuarioTMODUSUARIOptpevcDepartamentoNac</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPEVCDEPARTAMENTONAC = "Clas_1432633737216826Ser_14Arg_12_Alias";
    /** <code>usuarioTMODUSUARIOptpevcDepartamentoNac</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPEVCDEPARTAMENTONAC = "Departamento nacimiento";
    /** <code>usuarioTMODUSUARIOptpevcMunicipioNac</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTPEVCMUNICIPIONAC = "pt_p_evcMunicipioNac";
    /** <code>usuarioTMODUSUARIOptpevcMunicipioNac</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPEVCMUNICIPIONAC = "Clas_1432633737216826Ser_14Arg_13_Alias";
    /** <code>usuarioTMODUSUARIOptpevcMunicipioNac</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPEVCMUNICIPIONAC = "Municipio nacimiento";
    /** <code>usuarioTMODUSUARIOptpevcEstadoCivil</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTPEVCESTADOCIVIL = "pt_p_evcEstadoCivil";
    /** <code>usuarioTMODUSUARIOptpevcEstadoCivil</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPEVCESTADOCIVIL = "Clas_1432633737216826Ser_14Arg_14_Alias";
    /** <code>usuarioTMODUSUARIOptpevcEstadoCivil</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPEVCESTADOCIVIL = "Estado civil";
    /** <code>usuarioTMODUSUARIOptpDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTPDIRECCIONCOMPLETA = "pt_p_DireccionCompleta";
    /** <code>usuarioTMODUSUARIOptpDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPDIRECCIONCOMPLETA = "Clas_1432633737216826Ser_14Arg_15_Alias";
    /** <code>usuarioTMODUSUARIOptpDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>usuarioTMODUSUARIOptpRural</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTPRURAL = "pt_p_Rural";
    /** <code>usuarioTMODUSUARIOptpRural</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPRURAL = "Clas_1432633737216826Ser_14Arg_16_Alias";
    /** <code>usuarioTMODUSUARIOptpRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPRURAL = "Rural";
    /** <code>usuarioTMODUSUARIOptpevcDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTPEVCDEPARTAMENTO = "pt_p_evcDepartamento";
    /** <code>usuarioTMODUSUARIOptpevcDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPEVCDEPARTAMENTO = "Clas_1432633737216826Ser_14Arg_18_Alias";
    /** <code>usuarioTMODUSUARIOptpevcDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPEVCDEPARTAMENTO = "Departamento";
    /** <code>usuarioTMODUSUARIOptpevcMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTPEVCMUNICIPIO = "pt_p_evcMunicipio";
    /** <code>usuarioTMODUSUARIOptpevcMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPEVCMUNICIPIO = "Clas_1432633737216826Ser_14Arg_19_Alias";
    /** <code>usuarioTMODUSUARIOptpevcMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPEVCMUNICIPIO = "Municipio";
    /** <code>usuarioTMODUSUARIOptDireccion</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTDIRECCION = "pt_Direccion";
    /** <code>usuarioTMODUSUARIOptDireccion</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTDIRECCION = "Clas_1432633737216826Ser_14Arg_20_Alias";
    /** <code>usuarioTMODUSUARIOptDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTDIRECCION = "Direcciones titular";
    /** <code>usuarioTMODUSUARIOptReplicarDireccion</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTREPLICARDIRECCION = "pt_ReplicarDireccion";
    /** <code>usuarioTMODUSUARIOptReplicarDireccion</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTREPLICARDIRECCION = "Clas_1432633737216826Ser_14Arg_22_Alias";
    /** <code>usuarioTMODUSUARIOptReplicarDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTREPLICARDIRECCION = "Replicar dirección titular";
    /** <code>usuarioTMODUSUARIOptpNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTPNUMIDENTIFICACION = "pt_p_NumIdentificacion";
    /** <code>usuarioTMODUSUARIOptpNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPNUMIDENTIFICACION = "Clas_1432633737216826Ser_14Arg_23_Alias";
    /** <code>usuarioTMODUSUARIOptpNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPNUMIDENTIFICACION = "Nº Identificación";
    /** <code>usuarioTMODUSUARIOptpevcTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTPEVCTIPOIDENTIFICACION = "pt_p_evcTipoIdentificacion";
    /** <code>usuarioTMODUSUARIOptpevcTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPEVCTIPOIDENTIFICACION = "Clas_1432633737216826Ser_14Arg_24_Alias";
    /** <code>usuarioTMODUSUARIOptpevcTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPEVCTIPOIDENTIFICACION = "Tipo Doc.";
    /** <code>usuarioTMODUSUARIOptpagrPais</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTPAGRPAIS = "pt_p_agrPais";
    /** <code>usuarioTMODUSUARIOptpagrPais</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPAGRPAIS = "Clas_1432633737216826Ser_14Arg_25_Alias";
    /** <code>usuarioTMODUSUARIOptpagrPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPAGRPAIS = "País";
    /** <code>usuarioTMODUSUARIOptDireccionUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_USUARIOTMODUSUARIOPTDIRECCIONUSUARIO = "pt_DireccionUsuario";
    /** <code>usuarioTMODUSUARIOptDireccionUsuario</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTDIRECCIONUSUARIO = "Clas_1432633737216826Ser_14Arg_26_Alias";
    /** <code>usuarioTMODUSUARIOptDireccionUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTDIRECCIONUSUARIO = "Direcciones";
    // Service (TELIMINAR)
    /** <code>TELIMINAR</code> service id. */
    public static final String SERV_ID_TELIMINAR = "Clas_1432633737216826Ser_17_Alias";
    /** <code>TELIMINAR</code> service name. */
    public static final String SERV_NAME_TELIMINAR = "TELIMINAR";
    /** <code>TELIMINAR</code> service alias. */
    public static final String SERV_ALIAS_TELIMINAR = "¿Está seguro de que desea eliminar al usuario?";
    /** Agents allowed to execute the service TELIMINAR **/
    public static final String TELIMINAR_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Inbound arguments
    /** <code>usuarioTELIMINARpthisUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TELIMINAR_USUARIOTELIMINARPTHISUSUARIO = "p_thisUsuario";
    /** <code>usuarioTELIMINARpthisUsuario</code> inbound argument id. */
    public static final String ARG_ID_TELIMINAR_USUARIOTELIMINARPTHISUSUARIO = "Clas_1432633737216826Ser_17Arg_1_Alias";
    /** <code>usuarioTELIMINARpthisUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TELIMINAR_USUARIOTELIMINARPTHISUSUARIO = "Usuario";
    // Service (TCREARCUESMEDICO)
    /** <code>TCREARCUESMEDICO</code> service id. */
    public static final String SERV_ID_TCREARCUESMEDICO = "Clas_1432633737216826Ser_18_Alias";
    /** <code>TCREARCUESMEDICO</code> service name. */
    public static final String SERV_NAME_TCREARCUESMEDICO = "TCREARCUESMEDICO";
    /** <code>TCREARCUESMEDICO</code> service alias. */
    public static final String SERV_ALIAS_TCREARCUESMEDICO = "Crear cuestionario médico";
    /** Agents allowed to execute the service TCREARCUESMEDICO **/
    public static final String TCREARCUESMEDICO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioTCREARCUESMEDICOpthisUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCUESMEDICO_USUARIOTCREARCUESMEDICOPTHISUSUARIO = "p_thisUsuario";
    /** <code>usuarioTCREARCUESMEDICOpthisUsuario</code> inbound argument id. */
    public static final String ARG_ID_TCREARCUESMEDICO_USUARIOTCREARCUESMEDICOPTHISUSUARIO = "Clas_1432633737216826Ser_18Arg_1_Alias";
    /** <code>usuarioTCREARCUESMEDICOpthisUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCUESMEDICO_USUARIOTCREARCUESMEDICOPTHISUSUARIO = "Usuario";
    // Service (TCREAROMODANEXOMAT)
    /** <code>TCREAROMODANEXOMAT</code> service id. */
    public static final String SERV_ID_TCREAROMODANEXOMAT = "Clas_1432633737216826Ser_20_Alias";
    /** <code>TCREAROMODANEXOMAT</code> service name. */
    public static final String SERV_NAME_TCREAROMODANEXOMAT = "TCREAROMODANEXOMAT";
    /** <code>TCREAROMODANEXOMAT</code> service alias. */
    public static final String SERV_ALIAS_TCREAROMODANEXOMAT = "Anexo de maternidad";
    /** Agents allowed to execute the service TCREAROMODANEXOMAT **/
    public static final String TCREAROMODANEXOMAT_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Preconditions
    /** <code>TCREAROMODANEXOMAT</code> precondition 0 id. */
    public static final String PRE_ID_TCREAROMODANEXOMAT_0 = "Clas_1432633737216826Pre_5_MsgError";
    /** <code>TCREAROMODANEXOMAT</code> precondition 1 id. */
    public static final String PRE_ID_TCREAROMODANEXOMAT_1 = "Clas_1432633737216826Pre_6_MsgError";
    /** <code>TCREAROMODANEXOMAT</code> precondition 2 id. */
    public static final String PRE_ID_TCREAROMODANEXOMAT_2 = "Clas_1432633737216826Pre_14_MsgError";
    // Inbound arguments
    /** <code>usuarioTCREAROMODANEXOMATpthisUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODANEXOMAT_USUARIOTCREAROMODANEXOMATPTHISUSUARIO = "p_thisUsuario";
    /** <code>usuarioTCREAROMODANEXOMATpthisUsuario</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODANEXOMAT_USUARIOTCREAROMODANEXOMATPTHISUSUARIO = "Clas_1432633737216826Ser_20Arg_1_Alias";
    /** <code>usuarioTCREAROMODANEXOMATpthisUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODANEXOMAT_USUARIOTCREAROMODANEXOMATPTHISUSUARIO = "Usuario";
    /** <code>usuarioTCREAROMODANEXOMATptpatrFechaUltRegla</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODANEXOMAT_USUARIOTCREAROMODANEXOMATPTPATRFECHAULTREGLA = "pt_p_atrFechaUltRegla";
    /** <code>usuarioTCREAROMODANEXOMATptpatrFechaUltRegla</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODANEXOMAT_USUARIOTCREAROMODANEXOMATPTPATRFECHAULTREGLA = "Clas_1432633737216826Ser_20Arg_8_Alias";
    /** <code>usuarioTCREAROMODANEXOMATptpatrFechaUltRegla</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODANEXOMAT_USUARIOTCREAROMODANEXOMATPTPATRFECHAULTREGLA = "Fecha última regla";
    /** <code>usuarioTCREAROMODANEXOMATptpatrNumCuotas</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODANEXOMAT_USUARIOTCREAROMODANEXOMATPTPATRNUMCUOTAS = "pt_p_atrNumCuotas";
    /** <code>usuarioTCREAROMODANEXOMATptpatrNumCuotas</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODANEXOMAT_USUARIOTCREAROMODANEXOMATPTPATRNUMCUOTAS = "Clas_1432633737216826Ser_20Arg_9_Alias";
    /** <code>usuarioTCREAROMODANEXOMATptpatrNumCuotas</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODANEXOMAT_USUARIOTCREAROMODANEXOMATPTPATRNUMCUOTAS = "Nº cuotas";
    /** <code>usuarioTCREAROMODANEXOMATptInstitucionMat</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODANEXOMAT_USUARIOTCREAROMODANEXOMATPTINSTITUCIONMAT = "pt_InstitucionMat";
    /** <code>usuarioTCREAROMODANEXOMATptInstitucionMat</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODANEXOMAT_USUARIOTCREAROMODANEXOMATPTINSTITUCIONMAT = "Clas_1432633737216826Ser_20Arg_10_Alias";
    /** <code>usuarioTCREAROMODANEXOMATptInstitucionMat</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODANEXOMAT_USUARIOTCREAROMODANEXOMATPTINSTITUCIONMAT = "Institución";
    // Service (TCREAROMODANEXONEO)
    /** <code>TCREAROMODANEXONEO</code> service id. */
    public static final String SERV_ID_TCREAROMODANEXONEO = "Clas_1432633737216826Ser_22_Alias";
    /** <code>TCREAROMODANEXONEO</code> service name. */
    public static final String SERV_NAME_TCREAROMODANEXONEO = "TCREAROMODANEXONEO";
    /** <code>TCREAROMODANEXONEO</code> service alias. */
    public static final String SERV_ALIAS_TCREAROMODANEXONEO = "Anexo neonatal";
    /** Agents allowed to execute the service TCREAROMODANEXONEO **/
    public static final String TCREAROMODANEXONEO_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Preconditions
    /** <code>TCREAROMODANEXONEO</code> precondition 0 id. */
    public static final String PRE_ID_TCREAROMODANEXONEO_0 = "Clas_1432633737216826Pre_8_MsgError";
    /** <code>TCREAROMODANEXONEO</code> precondition 1 id. */
    public static final String PRE_ID_TCREAROMODANEXONEO_1 = "Clas_1432633737216826Pre_9_MsgError";
    /** <code>TCREAROMODANEXONEO</code> precondition 2 id. */
    public static final String PRE_ID_TCREAROMODANEXONEO_2 = "Clas_1432633737216826Pre_10_MsgError";
    /** <code>TCREAROMODANEXONEO</code> precondition 3 id. */
    public static final String PRE_ID_TCREAROMODANEXONEO_3 = "Clas_1432633737216826Pre_15_MsgError";
    // Inbound arguments
    /** <code>usuarioTCREAROMODANEXONEOpthisUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODANEXONEO_USUARIOTCREAROMODANEXONEOPTHISUSUARIO = "p_thisUsuario";
    /** <code>usuarioTCREAROMODANEXONEOpthisUsuario</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODANEXONEO_USUARIOTCREAROMODANEXONEOPTHISUSUARIO = "Clas_1432633737216826Ser_22Arg_1_Alias";
    /** <code>usuarioTCREAROMODANEXONEOpthisUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODANEXONEO_USUARIOTCREAROMODANEXONEOPTHISUSUARIO = "Usuario";
    /** <code>usuarioTCREAROMODANEXONEOptpatrFechaUltRegla</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODANEXONEO_USUARIOTCREAROMODANEXONEOPTPATRFECHAULTREGLA = "pt_p_atrFechaUltRegla";
    /** <code>usuarioTCREAROMODANEXONEOptpatrFechaUltRegla</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODANEXONEO_USUARIOTCREAROMODANEXONEOPTPATRFECHAULTREGLA = "Clas_1432633737216826Ser_22Arg_8_Alias";
    /** <code>usuarioTCREAROMODANEXONEOptpatrFechaUltRegla</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODANEXONEO_USUARIOTCREAROMODANEXONEOPTPATRFECHAULTREGLA = "Fecha última regla";
    /** <code>usuarioTCREAROMODANEXONEOptpatrNumHijos</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODANEXONEO_USUARIOTCREAROMODANEXONEOPTPATRNUMHIJOS = "pt_p_atrNumHijos";
    /** <code>usuarioTCREAROMODANEXONEOptpatrNumHijos</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODANEXONEO_USUARIOTCREAROMODANEXONEOPTPATRNUMHIJOS = "Clas_1432633737216826Ser_22Arg_9_Alias";
    /** <code>usuarioTCREAROMODANEXONEOptpatrNumHijos</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODANEXONEO_USUARIOTCREAROMODANEXONEOPTPATRNUMHIJOS = "Nº hijos";
    /** <code>usuarioTCREAROMODANEXONEOptpatrNumCuotas</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODANEXONEO_USUARIOTCREAROMODANEXONEOPTPATRNUMCUOTAS = "pt_p_atrNumCuotas";
    /** <code>usuarioTCREAROMODANEXONEOptpatrNumCuotas</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODANEXONEO_USUARIOTCREAROMODANEXONEOPTPATRNUMCUOTAS = "Clas_1432633737216826Ser_22Arg_10_Alias";
    /** <code>usuarioTCREAROMODANEXONEOptpatrNumCuotas</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODANEXONEO_USUARIOTCREAROMODANEXONEOPTPATRNUMCUOTAS = "Nº cuotas";
    /** <code>usuarioTCREAROMODANEXONEOptInstitucionNeo</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODANEXONEO_USUARIOTCREAROMODANEXONEOPTINSTITUCIONNEO = "pt_InstitucionNeo";
    /** <code>usuarioTCREAROMODANEXONEOptInstitucionNeo</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODANEXONEO_USUARIOTCREAROMODANEXONEOPTINSTITUCIONNEO = "Clas_1432633737216826Ser_22Arg_11_Alias";
    /** <code>usuarioTCREAROMODANEXONEOptInstitucionNeo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODANEXONEO_USUARIOTCREAROMODANEXONEOPTINSTITUCIONNEO = "Institución";
    // Service (TREGISTRARDATOSCORE)
    /** <code>TREGISTRARDATOSCORE</code> service id. */
    public static final String SERV_ID_TREGISTRARDATOSCORE = "Clas_1432633737216826Ser_27_Alias";
    /** <code>TREGISTRARDATOSCORE</code> service name. */
    public static final String SERV_NAME_TREGISTRARDATOSCORE = "TREGISTRARDATOSCORE";
    /** <code>TREGISTRARDATOSCORE</code> service alias. */
    public static final String SERV_ALIAS_TREGISTRARDATOSCORE = "TREGISTRARDATOSCORE";
    /** Agents allowed to execute the service TREGISTRARDATOSCORE **/
    public static final String TREGISTRARDATOSCORE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioTREGISTRARDATOSCOREpthisUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTHISUSUARIO = "p_thisUsuario";
    /** <code>usuarioTREGISTRARDATOSCOREpthisUsuario</code> inbound argument id. */
    public static final String ARG_ID_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTHISUSUARIO = "Clas_1432633737216826Ser_27Arg_1_Alias";
    /** <code>usuarioTREGISTRARDATOSCOREpthisUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTHISUSUARIO = "Usuario";
    /** <code>usuarioTREGISTRARDATOSCOREptpFechaAntiguedadBeneficiar</code> inbound argument name. */
    public static final String ARG_NAME_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTPFECHAANTIGUEDADBENEFICIAR = "pt_p_FechaAntiguedadBeneficiar";
    /** <code>usuarioTREGISTRARDATOSCOREptpFechaAntiguedadBeneficiar</code> inbound argument id. */
    public static final String ARG_ID_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTPFECHAANTIGUEDADBENEFICIAR = "Clas_1432633737216826Ser_27Arg_2_Alias";
    /** <code>usuarioTREGISTRARDATOSCOREptpFechaAntiguedadBeneficiar</code> inbound argument alias. */
    public static final String ARG_ALIAS_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTPFECHAANTIGUEDADBENEFICIAR = "Fecha antigüedad";
    /** <code>usuarioTREGISTRARDATOSCOREptpNumUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTPNUMUSUARIO = "pt_p_NumUsuario";
    /** <code>usuarioTREGISTRARDATOSCOREptpNumUsuario</code> inbound argument id. */
    public static final String ARG_ID_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTPNUMUSUARIO = "Clas_1432633737216826Ser_27Arg_3_Alias";
    /** <code>usuarioTREGISTRARDATOSCOREptpNumUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTPNUMUSUARIO = "Nº Usuario";
    /** <code>usuarioTREGISTRARDATOSCOREptpRequierExamenMedico</code> inbound argument name. */
    public static final String ARG_NAME_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTPREQUIEREXAMENMEDICO = "pt_p_RequierExamenMedico";
    /** <code>usuarioTREGISTRARDATOSCOREptpRequierExamenMedico</code> inbound argument id. */
    public static final String ARG_ID_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTPREQUIEREXAMENMEDICO = "Clas_1432633737216826Ser_27Arg_4_Alias";
    /** <code>usuarioTREGISTRARDATOSCOREptpRequierExamenMedico</code> inbound argument alias. */
    public static final String ARG_ALIAS_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTPREQUIEREXAMENMEDICO = "Requiere examen médico";
    /** <code>usuarioTREGISTRARDATOSCOREptpEstadoMedico</code> inbound argument name. */
    public static final String ARG_NAME_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTPESTADOMEDICO = "pt_p_EstadoMedico";
    /** <code>usuarioTREGISTRARDATOSCOREptpEstadoMedico</code> inbound argument id. */
    public static final String ARG_ID_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTPESTADOMEDICO = "Clas_1432633737216826Ser_27Arg_5_Alias";
    /** <code>usuarioTREGISTRARDATOSCOREptpEstadoMedico</code> inbound argument alias. */
    public static final String ARG_ALIAS_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTPESTADOMEDICO = "Estado médico";
    /** <code>usuarioTREGISTRARDATOSCOREptpValorCuotaInscripcion</code> inbound argument name. */
    public static final String ARG_NAME_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTPVALORCUOTAINSCRIPCION = "pt_p_ValorCuotaInscripcion";
    /** <code>usuarioTREGISTRARDATOSCOREptpValorCuotaInscripcion</code> inbound argument id. */
    public static final String ARG_ID_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTPVALORCUOTAINSCRIPCION = "Clas_1432633737216826Ser_27Arg_6_Alias";
    /** <code>usuarioTREGISTRARDATOSCOREptpValorCuotaInscripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTPVALORCUOTAINSCRIPCION = "Valor cuota inscripción";
    /** <code>usuarioTREGISTRARDATOSCOREptpTienePreexistencias</code> inbound argument name. */
    public static final String ARG_NAME_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTPTIENEPREEXISTENCIAS = "pt_p_TienePreexistencias";
    /** <code>usuarioTREGISTRARDATOSCOREptpTienePreexistencias</code> inbound argument id. */
    public static final String ARG_ID_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTPTIENEPREEXISTENCIAS = "Clas_1432633737216826Ser_27Arg_7_Alias";
    /** <code>usuarioTREGISTRARDATOSCOREptpTienePreexistencias</code> inbound argument alias. */
    public static final String ARG_ALIAS_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTPTIENEPREEXISTENCIAS = "Tiene preexistencias";
    /** <code>usuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiario</code> inbound argument name. */
    public static final String ARG_NAME_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTPEVCESTADOBENEFICIARIO = "pt_p_evcEstadoBeneficiario";
    /** <code>usuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiario</code> inbound argument id. */
    public static final String ARG_ID_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTPEVCESTADOBENEFICIARIO = "Clas_1432633737216826Ser_27Arg_8_Alias";
    /** <code>usuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTPEVCESTADOBENEFICIARIO = "Estado beneficiario CORE";
    /** <code>usuarioTREGISTRARDATOSCOREptpFechaInicionVigencia</code> inbound argument name. */
    public static final String ARG_NAME_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTPFECHAINICIONVIGENCIA = "pt_p_FechaInicionVigencia";
    /** <code>usuarioTREGISTRARDATOSCOREptpFechaInicionVigencia</code> inbound argument id. */
    public static final String ARG_ID_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTPFECHAINICIONVIGENCIA = "Clas_1432633737216826Ser_27Arg_9_Alias";
    /** <code>usuarioTREGISTRARDATOSCOREptpFechaInicionVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTPFECHAINICIONVIGENCIA = "Fecha inicio vigencia";
    /** <code>usuarioTREGISTRARDATOSCOREptpFechaFinVigencia</code> inbound argument name. */
    public static final String ARG_NAME_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTPFECHAFINVIGENCIA = "pt_p_FechaFinVigencia";
    /** <code>usuarioTREGISTRARDATOSCOREptpFechaFinVigencia</code> inbound argument id. */
    public static final String ARG_ID_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTPFECHAFINVIGENCIA = "Clas_1432633737216826Ser_27Arg_10_Alias";
    /** <code>usuarioTREGISTRARDATOSCOREptpFechaFinVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTPFECHAFINVIGENCIA = "Fecha fin vigencia";
    // Service (TACTDESDECORE)
    /** <code>TACTDESDECORE</code> service id. */
    public static final String SERV_ID_TACTDESDECORE = "Clas_1432633737216826Ser_28_Alias";
    /** <code>TACTDESDECORE</code> service name. */
    public static final String SERV_NAME_TACTDESDECORE = "TACTDESDECORE";
    /** <code>TACTDESDECORE</code> service alias. */
    public static final String SERV_ALIAS_TACTDESDECORE = "TACTDESDECORE";
    /** Agents allowed to execute the service TACTDESDECORE **/
    public static final String TACTDESDECORE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioTACTDESDECOREpthisUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TACTDESDECORE_USUARIOTACTDESDECOREPTHISUSUARIO = "p_thisUsuario";
    /** <code>usuarioTACTDESDECOREpthisUsuario</code> inbound argument id. */
    public static final String ARG_ID_TACTDESDECORE_USUARIOTACTDESDECOREPTHISUSUARIO = "Clas_1432633737216826Ser_28Arg_1_Alias";
    /** <code>usuarioTACTDESDECOREpthisUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TACTDESDECORE_USUARIOTACTDESDECOREPTHISUSUARIO = "Usuario";
    /** <code>usuarioTACTDESDECOREpBeneficiarioC</code> inbound argument name. */
    public static final String ARG_NAME_TACTDESDECORE_USUARIOTACTDESDECOREPBENEFICIARIOC = "p_BeneficiarioC";
    /** <code>usuarioTACTDESDECOREpBeneficiarioC</code> inbound argument id. */
    public static final String ARG_ID_TACTDESDECORE_USUARIOTACTDESDECOREPBENEFICIARIOC = "Clas_1432633737216826Ser_28Arg_3_Alias";
    /** <code>usuarioTACTDESDECOREpBeneficiarioC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TACTDESDECORE_USUARIOTACTDESDECOREPBENEFICIARIOC = "Beneficiario CORE";
    // Service (TNOTIFICARDOCUMENTO)
    /** <code>TNOTIFICARDOCUMENTO</code> service id. */
    public static final String SERV_ID_TNOTIFICARDOCUMENTO = "Clas_1432633737216826Ser_31_Alias";
    /** <code>TNOTIFICARDOCUMENTO</code> service name. */
    public static final String SERV_NAME_TNOTIFICARDOCUMENTO = "TNOTIFICARDOCUMENTO";
    /** <code>TNOTIFICARDOCUMENTO</code> service alias. */
    public static final String SERV_ALIAS_TNOTIFICARDOCUMENTO = "TNOTIFICARDOCUMENTO";
    /** Agents allowed to execute the service TNOTIFICARDOCUMENTO **/
    public static final String TNOTIFICARDOCUMENTO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioTNOTIFICARDOCUMENTOpthisUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TNOTIFICARDOCUMENTO_USUARIOTNOTIFICARDOCUMENTOPTHISUSUARIO = "p_thisUsuario";
    /** <code>usuarioTNOTIFICARDOCUMENTOpthisUsuario</code> inbound argument id. */
    public static final String ARG_ID_TNOTIFICARDOCUMENTO_USUARIOTNOTIFICARDOCUMENTOPTHISUSUARIO = "Clas_1432633737216826Ser_31Arg_1_Alias";
    /** <code>usuarioTNOTIFICARDOCUMENTOpthisUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNOTIFICARDOCUMENTO_USUARIOTNOTIFICARDOCUMENTOPTHISUSUARIO = "Usuario";
    /** <code>usuarioTNOTIFICARDOCUMENTOpTipoDocumento</code> inbound argument name. */
    public static final String ARG_NAME_TNOTIFICARDOCUMENTO_USUARIOTNOTIFICARDOCUMENTOPTIPODOCUMENTO = "pTipoDocumento";
    /** <code>usuarioTNOTIFICARDOCUMENTOpTipoDocumento</code> inbound argument id. */
    public static final String ARG_ID_TNOTIFICARDOCUMENTO_USUARIOTNOTIFICARDOCUMENTOPTIPODOCUMENTO = "Clas_1432633737216826Ser_31Arg_2_Alias";
    /** <code>usuarioTNOTIFICARDOCUMENTOpTipoDocumento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNOTIFICARDOCUMENTO_USUARIOTNOTIFICARDOCUMENTOPTIPODOCUMENTO = "TipoDocumento";
    // Service (TELIMINARSINPREC)
    /** <code>TELIMINARSINPREC</code> service id. */
    public static final String SERV_ID_TELIMINARSINPREC = "Clas_1432633737216826Ser_32_Alias";
    /** <code>TELIMINARSINPREC</code> service name. */
    public static final String SERV_NAME_TELIMINARSINPREC = "TELIMINARSINPREC";
    /** <code>TELIMINARSINPREC</code> service alias. */
    public static final String SERV_ALIAS_TELIMINARSINPREC = "TELIMINARSINPREC";
    /** Agents allowed to execute the service TELIMINARSINPREC **/
    public static final String TELIMINARSINPREC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioTELIMINARSINPRECpthisUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TELIMINARSINPREC_USUARIOTELIMINARSINPRECPTHISUSUARIO = "p_thisUsuario";
    /** <code>usuarioTELIMINARSINPRECpthisUsuario</code> inbound argument id. */
    public static final String ARG_ID_TELIMINARSINPREC_USUARIOTELIMINARSINPRECPTHISUSUARIO = "Clas_1432633737216826Ser_32Arg_1_Alias";
    /** <code>usuarioTELIMINARSINPRECpthisUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TELIMINARSINPREC_USUARIOTELIMINARSINPRECPTHISUSUARIO = "Usuario";
    // Service (TRECREARCUESMEDICO)
    /** <code>TRECREARCUESMEDICO</code> service id. */
    public static final String SERV_ID_TRECREARCUESMEDICO = "Clas_1432633737216826Ser_33_Alias";
    /** <code>TRECREARCUESMEDICO</code> service name. */
    public static final String SERV_NAME_TRECREARCUESMEDICO = "TRECREARCUESMEDICO";
    /** <code>TRECREARCUESMEDICO</code> service alias. */
    public static final String SERV_ALIAS_TRECREARCUESMEDICO = "TRECREARCUESMEDICO";
    /** Agents allowed to execute the service TRECREARCUESMEDICO **/
    public static final String TRECREARCUESMEDICO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioTRECREARCUESMEDICOpthisUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TRECREARCUESMEDICO_USUARIOTRECREARCUESMEDICOPTHISUSUARIO = "p_thisUsuario";
    /** <code>usuarioTRECREARCUESMEDICOpthisUsuario</code> inbound argument id. */
    public static final String ARG_ID_TRECREARCUESMEDICO_USUARIOTRECREARCUESMEDICOPTHISUSUARIO = "Clas_1432633737216826Ser_33Arg_1_Alias";
    /** <code>usuarioTRECREARCUESMEDICOpthisUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TRECREARCUESMEDICO_USUARIOTRECREARCUESMEDICOPTHISUSUARIO = "Usuario";
    // Service (TCARGARPREEXIST)
    /** <code>TCARGARPREEXIST</code> service id. */
    public static final String SERV_ID_TCARGARPREEXIST = "Clas_1432633737216826Ser_34_Alias";
    /** <code>TCARGARPREEXIST</code> service name. */
    public static final String SERV_NAME_TCARGARPREEXIST = "TCARGARPREEXIST";
    /** <code>TCARGARPREEXIST</code> service alias. */
    public static final String SERV_ALIAS_TCARGARPREEXIST = "TCARGARPREEXIST";
    /** Agents allowed to execute the service TCARGARPREEXIST **/
    public static final String TCARGARPREEXIST_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioTCARGARPREEXISTpthisUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TCARGARPREEXIST_USUARIOTCARGARPREEXISTPTHISUSUARIO = "p_thisUsuario";
    /** <code>usuarioTCARGARPREEXISTpthisUsuario</code> inbound argument id. */
    public static final String ARG_ID_TCARGARPREEXIST_USUARIOTCARGARPREEXISTPTHISUSUARIO = "Clas_1432633737216826Ser_34Arg_1_Alias";
    /** <code>usuarioTCARGARPREEXISTpthisUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCARGARPREEXIST_USUARIOTCARGARPREEXISTPTHISUSUARIO = "Usuario";
    // Service (TADDPREEXIST)
    /** <code>TADDPREEXIST</code> service id. */
    public static final String SERV_ID_TADDPREEXIST = "Clas_1432633737216826Ser_35_Alias";
    /** <code>TADDPREEXIST</code> service name. */
    public static final String SERV_NAME_TADDPREEXIST = "TADDPREEXIST";
    /** <code>TADDPREEXIST</code> service alias. */
    public static final String SERV_ALIAS_TADDPREEXIST = "TADDPREEXIST";
    /** Agents allowed to execute the service TADDPREEXIST **/
    public static final String TADDPREEXIST_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioTADDPREEXISTpthisUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TADDPREEXIST_USUARIOTADDPREEXISTPTHISUSUARIO = "p_thisUsuario";
    /** <code>usuarioTADDPREEXISTpthisUsuario</code> inbound argument id. */
    public static final String ARG_ID_TADDPREEXIST_USUARIOTADDPREEXISTPTHISUSUARIO = "Clas_1432633737216826Ser_35Arg_1_Alias";
    /** <code>usuarioTADDPREEXISTpthisUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDPREEXIST_USUARIOTADDPREEXISTPTHISUSUARIO = "Usuario";
    /** <code>usuarioTADDPREEXISTptpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_TADDPREEXIST_USUARIOTADDPREEXISTPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    /** <code>usuarioTADDPREEXISTptpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_TADDPREEXIST_USUARIOTADDPREEXISTPTPATRDESCRIPCION = "Clas_1432633737216826Ser_35Arg_3_Alias";
    /** <code>usuarioTADDPREEXISTptpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDPREEXIST_USUARIOTADDPREEXISTPTPATRDESCRIPCION = "Descripción";
    /** <code>usuarioTADDPREEXISTptpatrFecInicio</code> inbound argument name. */
    public static final String ARG_NAME_TADDPREEXIST_USUARIOTADDPREEXISTPTPATRFECINICIO = "pt_p_atrFecInicio";
    /** <code>usuarioTADDPREEXISTptpatrFecInicio</code> inbound argument id. */
    public static final String ARG_ID_TADDPREEXIST_USUARIOTADDPREEXISTPTPATRFECINICIO = "Clas_1432633737216826Ser_35Arg_4_Alias";
    /** <code>usuarioTADDPREEXISTptpatrFecInicio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDPREEXIST_USUARIOTADDPREEXISTPTPATRFECINICIO = "Fecha Inicio";
    /** <code>usuarioTADDPREEXISTptpatrFecFin</code> inbound argument name. */
    public static final String ARG_NAME_TADDPREEXIST_USUARIOTADDPREEXISTPTPATRFECFIN = "pt_p_atrFecFin";
    /** <code>usuarioTADDPREEXISTptpatrFecFin</code> inbound argument id. */
    public static final String ARG_ID_TADDPREEXIST_USUARIOTADDPREEXISTPTPATRFECFIN = "Clas_1432633737216826Ser_35Arg_5_Alias";
    /** <code>usuarioTADDPREEXISTptpatrFecFin</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDPREEXIST_USUARIOTADDPREEXISTPTPATRFECFIN = "Fecha fin";
    /** <code>usuarioTADDPREEXISTptpatrObservacion</code> inbound argument name. */
    public static final String ARG_NAME_TADDPREEXIST_USUARIOTADDPREEXISTPTPATROBSERVACION = "pt_p_atrObservacion";
    /** <code>usuarioTADDPREEXISTptpatrObservacion</code> inbound argument id. */
    public static final String ARG_ID_TADDPREEXIST_USUARIOTADDPREEXISTPTPATROBSERVACION = "Clas_1432633737216826Ser_35Arg_7_Alias";
    /** <code>usuarioTADDPREEXISTptpatrObservacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDPREEXIST_USUARIOTADDPREEXISTPTPATROBSERVACION = "Observación";
    // Service (TCREARCUESMEDICOAUX)
    /** <code>TCREARCUESMEDICOAUX</code> service id. */
    public static final String SERV_ID_TCREARCUESMEDICOAUX = "Clas_1432633737216826Ser_36_Alias";
    /** <code>TCREARCUESMEDICOAUX</code> service name. */
    public static final String SERV_NAME_TCREARCUESMEDICOAUX = "TCREARCUESMEDICOAUX";
    /** <code>TCREARCUESMEDICOAUX</code> service alias. */
    public static final String SERV_ALIAS_TCREARCUESMEDICOAUX = "Crear cuestionario médico";
    /** Agents allowed to execute the service TCREARCUESMEDICOAUX **/
    public static final String TCREARCUESMEDICOAUX_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioTCREARCUESMEDICOAUXpthisUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCUESMEDICOAUX_USUARIOTCREARCUESMEDICOAUXPTHISUSUARIO = "p_thisUsuario";
    /** <code>usuarioTCREARCUESMEDICOAUXpthisUsuario</code> inbound argument id. */
    public static final String ARG_ID_TCREARCUESMEDICOAUX_USUARIOTCREARCUESMEDICOAUXPTHISUSUARIO = "Clas_1432633737216826Ser_36Arg_1_Alias";
    /** <code>usuarioTCREARCUESMEDICOAUXpthisUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCUESMEDICOAUX_USUARIOTCREARCUESMEDICOAUXPTHISUSUARIO = "Usuario";
    /** <code>usuarioTCREARCUESMEDICOAUXptFechafinVigenciaUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCUESMEDICOAUX_USUARIOTCREARCUESMEDICOAUXPTFECHAFINVIGENCIAUSUARIO = "ptFechafinVigenciaUsuario";
    /** <code>usuarioTCREARCUESMEDICOAUXptFechafinVigenciaUsuario</code> inbound argument id. */
    public static final String ARG_ID_TCREARCUESMEDICOAUX_USUARIOTCREARCUESMEDICOAUXPTFECHAFINVIGENCIAUSUARIO = "Clas_1432633737216826Ser_36Arg_2_Alias";
    /** <code>usuarioTCREARCUESMEDICOAUXptFechafinVigenciaUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCUESMEDICOAUX_USUARIOTCREARCUESMEDICOAUXPTFECHAFINVIGENCIAUSUARIO = "ptFechafinVigenciaUsuario";

    public static final String FILTER_NAME_IFUSUARIOSINCUESMED = "iF_UsuarioSinCuesMed";
    public static final String VAR_NAME_IFUSUARIOSINCUESMED_VOSOLICITUD = "vo_Solicitud";
    public static final String FILTER_NAME_FUSUARIOSPOLIZAINTER = "F_UsuariosPolizaInter";
    public static final String VAR_NAME_FUSUARIOSPOLIZAINTER_VFDESDE = "vfDesde";
    public static final String VAR_NAME_FUSUARIOSPOLIZAINTER_VFHASTA = "vfHasta";
    public static final String VAR_NAME_FUSUARIOSPOLIZAINTER_VFTIPODOC = "vfTipoDoc";
    public static final String VAR_NAME_FUSUARIOSPOLIZAINTER_VFNUMIDENT = "vfNumIdent";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_USUARIOBEBEGESTANTE.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONUMUSUARIO.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONUMIDENTIFICACION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOCODIGOTIPOUSUARIO.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOPRIMERNOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOSEGUNDONOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOPRIMERAPELLIDO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOSEGUNDOAPELLIDO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIODRVIDENTIFICACION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIODRVESELTITULAR.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIODRVACCESOCUESMED.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIODRVACEPTAANEXOMAT.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIODRVACEPTAANEXONEO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIODRVTIENEANEXOMAT.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOATTRUSUARIODILIGENCIADOS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIODRVEDADPARACUOTAINS.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIODRVVALORCUOTAINSCRIP.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIODRVCUESMEDOK.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOCODIGOBANCOREP.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOUSUARIOREPLICADO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOFECHAANTIGUEDADBENEFICIARIO.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOREQUIEREXAMENMEDICO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOESTADOMEDICO.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOVALORCUOTAINSCRIPCION.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOTIENEPREEXISTENCIAS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIODRVNOMBRECOMPLETO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOFECHAINICIOVIGENCIA.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOFECHAFINVIGENCIA.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIODRVCONFIRMADO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIODRVTIEMPOEMBARAZO.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIODRVESTAACTIVO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIODRVEDAD.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIODRVEDADMAXINGRESO.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIODRVEDADMAXPERM.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIODRVTOTALANEXOS.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIODRVTIENEEPSSANITAS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIODRVTIENEDOCUMENTOS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOTIENEDOCIDENTIFICACION.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOTIENEDOCSSOLICITUD.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIODRVTIENEPARENTESCO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIODRVPUEDESERTITULAR.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIODRVTIENECUESMED.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIODRVIMPTARIFAPLANVOL.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOPOLIZAINTERNACIONAL.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIODRVDIRRESVALIDOEPS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOIMC.toUpperCase(), Constants.Type.REAL.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_USUARIOIDENTIFICADOR.toUpperCase(), USUARIOIDENTIFICADOR_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOBEBEGESTANTE.toUpperCase(), USUARIOBEBEGESTANTE_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONUMUSUARIO.toUpperCase(), USUARIONUMUSUARIO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONUMIDENTIFICACION.toUpperCase(), USUARIONUMIDENTIFICACION_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOCODIGOTIPOUSUARIO.toUpperCase(), USUARIOCODIGOTIPOUSUARIO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOPRIMERNOMBRE.toUpperCase(), USUARIOPRIMERNOMBRE_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOSEGUNDONOMBRE.toUpperCase(), USUARIOSEGUNDONOMBRE_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOPRIMERAPELLIDO.toUpperCase(), USUARIOPRIMERAPELLIDO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOSEGUNDOAPELLIDO.toUpperCase(), USUARIOSEGUNDOAPELLIDO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIODRVIDENTIFICACION.toUpperCase(), USUARIODRVIDENTIFICACION_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIODRVESELTITULAR.toUpperCase(), USUARIODRVESELTITULAR_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIODRVACCESOCUESMED.toUpperCase(), USUARIODRVACCESOCUESMED_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIODRVACEPTAANEXOMAT.toUpperCase(), USUARIODRVACEPTAANEXOMAT_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIODRVACEPTAANEXONEO.toUpperCase(), USUARIODRVACEPTAANEXONEO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIODRVTIENEANEXOMAT.toUpperCase(), USUARIODRVTIENEANEXOMAT_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOATTRUSUARIODILIGENCIADOS.toUpperCase(), USUARIOATTRUSUARIODILIGENCIADOS_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIODRVEDADPARACUOTAINS.toUpperCase(), USUARIODRVEDADPARACUOTAINS_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIODRVVALORCUOTAINSCRIP.toUpperCase(), USUARIODRVVALORCUOTAINSCRIP_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIODRVCUESMEDOK.toUpperCase(), USUARIODRVCUESMEDOK_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOCODIGOBANCOREP.toUpperCase(), USUARIOCODIGOBANCOREP_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOUSUARIOREPLICADO.toUpperCase(), USUARIOUSUARIOREPLICADO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOFECHAANTIGUEDADBENEFICIARIO.toUpperCase(), USUARIOFECHAANTIGUEDADBENEFICIARIO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOREQUIEREXAMENMEDICO.toUpperCase(), USUARIOREQUIEREXAMENMEDICO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOESTADOMEDICO.toUpperCase(), USUARIOESTADOMEDICO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOVALORCUOTAINSCRIPCION.toUpperCase(), USUARIOVALORCUOTAINSCRIPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOTIENEPREEXISTENCIAS.toUpperCase(), USUARIOTIENEPREEXISTENCIAS_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIODRVNOMBRECOMPLETO.toUpperCase(), USUARIODRVNOMBRECOMPLETO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOFECHAINICIOVIGENCIA.toUpperCase(), USUARIOFECHAINICIOVIGENCIA_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOFECHAFINVIGENCIA.toUpperCase(), USUARIOFECHAFINVIGENCIA_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIODRVCONFIRMADO.toUpperCase(), USUARIODRVCONFIRMADO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIODRVTIEMPOEMBARAZO.toUpperCase(), USUARIODRVTIEMPOEMBARAZO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIODRVESTAACTIVO.toUpperCase(), USUARIODRVESTAACTIVO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIODRVEDAD.toUpperCase(), USUARIODRVEDAD_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIODRVEDADMAXINGRESO.toUpperCase(), USUARIODRVEDADMAXINGRESO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIODRVEDADMAXPERM.toUpperCase(), USUARIODRVEDADMAXPERM_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIODRVTOTALANEXOS.toUpperCase(), USUARIODRVTOTALANEXOS_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIODRVTIENEEPSSANITAS.toUpperCase(), USUARIODRVTIENEEPSSANITAS_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIODRVTIENEDOCUMENTOS.toUpperCase(), USUARIODRVTIENEDOCUMENTOS_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOTIENEDOCIDENTIFICACION.toUpperCase(), USUARIOTIENEDOCIDENTIFICACION_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOTIENEDOCSSOLICITUD.toUpperCase(), USUARIOTIENEDOCSSOLICITUD_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIODRVTIENEPARENTESCO.toUpperCase(), USUARIODRVTIENEPARENTESCO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIODRVPUEDESERTITULAR.toUpperCase(), USUARIODRVPUEDESERTITULAR_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIODRVTIENECUESMED.toUpperCase(), USUARIODRVTIENECUESMED_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIODRVIMPTARIFAPLANVOL.toUpperCase(), USUARIODRVIMPTARIFAPLANVOL_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOPOLIZAINTERNACIONAL.toUpperCase(), USUARIOPOLIZAINTERNACIONAL_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIODRVDIRRESVALIDOEPS.toUpperCase(), USUARIODRVDIRRESVALIDOEPS_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOIMC.toUpperCase(), USUARIOIMC_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_CUESTIONARIOP.toUpperCase(), CUESTIONARIOP_AGENTS);
        roleAgents.put(ROLE_NAME_ANEXOMAT.toUpperCase(), ANEXOMAT_AGENTS);
        roleAgents.put(ROLE_NAME_ANEXONEO.toUpperCase(), ANEXONEO_AGENTS);
        roleAgents.put(ROLE_NAME_SOLICITUD.toUpperCase(), SOLICITUD_AGENTS);
        roleAgents.put(ROLE_NAME_USUARIOPERSONA.toUpperCase(), USUARIOPERSONA_AGENTS);
        roleAgents.put(ROLE_NAME_EPS.toUpperCase(), EPS_AGENTS);
        roleAgents.put(ROLE_NAME_PARENTESCO.toUpperCase(), PARENTESCO_AGENTS);
        roleAgents.put(ROLE_NAME_COMPANYIA.toUpperCase(), COMPANYIA_AGENTS);
        roleAgents.put(ROLE_NAME_TIPOIDENTIFICACION.toUpperCase(), TIPOIDENTIFICACION_AGENTS);
        roleAgents.put(ROLE_NAME_ESTADOBENEFICIARIO.toUpperCase(), ESTADOBENEFICIARIO_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'Usuario', it returns the identification keys
     * - If className is a facet of the inheritance net of 'Usuario', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_FIELD_AESOLICITUDESIDSOLICITUD);
            returnList.add(ATTR_FIELD_USUARIOIDENTIFICADOR);
        }
        // Facet 'Usuario' (This facet)
        if (UsuarioConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_FIELD_AESOLICITUDESIDSOLICITUD);
            returnList.add(ATTR_FIELD_USUARIOIDENTIFICADOR);
        }
        return returnList;
    }
}
