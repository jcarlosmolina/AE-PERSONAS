package com.keralty.aepersonas.global;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.utils.Agent;

/**
 * Class with the constants relative to the project.
 */
public final class Constants {

    public static final String REGEXP_DOT_SEPARATOR = "\\.";
    public static final String ROLENAMEPREFIX = "ROLE_NAME_";
    public static final String ATTRNAMEPREFIX = "ATTR_NAME_";
    public static final String ATTRFIELDPREFIX = "ATTR_FIELD_";
    public static final String PARENT_PREFIX = "parent";
    public static final String CHILD_PREFIX = "child";
    
    /** Name of the persistence unit **/
    public static final String PERSISTENCEUNITNAME = "AePersonas";

    /** Default block size. */
    public static final int DEFAULT_BLOCKSIZE = 40;
    /** Max block size */
    public static final int MAX_BLOCKSIZE = 500;
    /** Default password length. */
    public static final int PASSWORDLENGTH = 8;
    // Intermediate relation (TM_ValorPregunta)
    /** <code>TM_ValorPregunta</code> intermediate relation table name. */
    public static final String TBL_NAME_VALORPREGUNTA = "TM_ValorPregunta";
    public static final String ROLE_TABLE_PREGUNTA_VALORES = TBL_NAME_VALORPREGUNTA;
    public static final String ROLE_TABLE_VALOR_PREGUNTAS = TBL_NAME_VALORPREGUNTA;
    /** <code>valorIdentificador</code> field name. */
    public static final String FLD_TMVALORPREGUNTA_VALORIDENTIFICADOR = "Identificador";
    /** <code>preguntaNumero</code> field name. */
    public static final String FLD_TMVALORPREGUNTA_PREGUNTANUMERO = "Numero";
    // Intermediate relation (TM_DominioPeriodicidad)
    /** <code>TM_DominioPeriodicidad</code> intermediate relation table name. */
    public static final String TBL_NAME_DOMINIOPERIODICIDAD = "TM_DominioPeriodicidad";
    public static final String ROLE_TABLE_PERIODICIDAD_DOMINIOS = TBL_NAME_DOMINIOPERIODICIDAD;
    public static final String ROLE_TABLE_DOMINIO_PERIODICIDADES = TBL_NAME_DOMINIOPERIODICIDAD;
    /** <code>dominioNumero</code> field name. */
    public static final String FLD_TMDOMINIOPERIODICIDAD_DOMINIONUMERO = "Numero";
    /** <code>periodicidadCodigo</code> field name. */
    public static final String FLD_TMDOMINIOPERIODICIDAD_PERIODICIDADCODIGO = "Codigo";
    // Intermediate relation (TM_DominioRol)
    /** <code>TM_DominioRol</code> intermediate relation table name. */
    public static final String TBL_NAME_DOMINIOROL = "TM_DominioRol";
    public static final String ROLE_TABLE_ROL_DOMINIOS = TBL_NAME_DOMINIOROL;
    public static final String ROLE_TABLE_DOMINIO_ROLES = TBL_NAME_DOMINIOROL;
    /** <code>dominioNumero</code> field name. */
    public static final String FLD_TMDOMINIOROL_DOMINIONUMERO = "Numero";
    /** <code>rolIdentificador</code> field name. */
    public static final String FLD_TMDOMINIOROL_ROLIDENTIFICADOR = "Identificador";
    // Intermediate relation (TM_DominioFormaPago)
    /** <code>TM_DominioFormaPago</code> intermediate relation table name. */
    public static final String TBL_NAME_DOMINIOFORMAPAGO = "TM_DominioFormaPago";
    public static final String ROLE_TABLE_FORMAPAGO_DOMINIOS = TBL_NAME_DOMINIOFORMAPAGO;
    public static final String ROLE_TABLE_DOMINIO_FORMASPAGO = TBL_NAME_DOMINIOFORMAPAGO;
    /** <code>dominioNumero</code> field name. */
    public static final String FLD_TMDOMINIOFORMAPAGO_DOMINIONUMERO = "Numero";
    /** <code>formaPagoCodigo</code> field name. */
    public static final String FLD_TMDOMINIOFORMAPAGO_FORMAPAGOCODIGO = "Codigo";
    // Intermediate relation (TM_DominiosPlantillas)
    /** <code>TM_DominiosPlantillas</code> intermediate relation table name. */
    public static final String TBL_NAME_DOMINIOSPLANTILLAS = "TM_DominiosPlantillas";
    public static final String ROLE_TABLE_PLANTILLAEMAIL_DOMINIOS = TBL_NAME_DOMINIOSPLANTILLAS;
    public static final String ROLE_TABLE_DOMINIO_PLANTILLAS = TBL_NAME_DOMINIOSPLANTILLAS;
    /** <code>dominioNumero</code> field name. */
    public static final String FLD_TMDOMINIOSPLANTILLAS_DOMINIONUMERO = "Numero";
    /** <code>plantillaEmailIdPlantilla</code> field name. */
    public static final String FLD_TMDOMINIOSPLANTILLAS_PLANTILLAEMAILIDPLANTILLA = "IdPlantilla";
    // Intermediate relation (TM_DominioNovedad)
    /** <code>TM_DominioNovedad</code> intermediate relation table name. */
    public static final String TBL_NAME_DOMINIONOVEDAD = "TM_DominioNovedad";
    public static final String ROLE_TABLE_NOVEDAD_DOMINIOS = TBL_NAME_DOMINIONOVEDAD;
    public static final String ROLE_TABLE_DOMINIO_NOVEDADES = TBL_NAME_DOMINIONOVEDAD;
    /** <code>dominioNumero</code> field name. */
    public static final String FLD_TMDOMINIONOVEDAD_DOMINIONUMERO = "Numero";
    /** <code>novedadidNovedad</code> field name. */
    public static final String FLD_TMDOMINIONOVEDAD_NOVEDADIDNOVEDAD = "id_Novedad";
    // Intermediate relation (TM_IncompatibilidadesDominio)
    /** <code>TM_IncompatibilidadesDominio</code> intermediate relation table name. */
    public static final String TBL_NAME_INCOMPATIBILIDADESDOMINIO = "TM_IncompatibilidadesDominio";
    public static final String ROLE_TABLE_DOMINIO_DOMINIOSCONINCOMPATIBILIDAD = TBL_NAME_INCOMPATIBILIDADESDOMINIO;
    public static final String ROLE_TABLE_DOMINIO_DOMINIOSINCOMPATIBLES = TBL_NAME_INCOMPATIBILIDADESDOMINIO;
    /** <code>dominioNumero</code> field name. */
    public static final String FLD_TMINCOMPATIBILIDADESDOMINIO_DOMINIONUMERO = "Numero";
    /** <code>dominioDominiosIncompatiblesNumero</code> field name. */
    public static final String FLD_TMINCOMPATIBILIDADESDOMINIO_DOMINIODOMINIOSINCOMPATIBLESNUMERO = "DominiosIncompatibles_Numero";
    // Intermediate relation (TM_DirSucursalCTipoSucursalC)
    /** <code>TM_DirSucursalCTipoSucursalC</code> intermediate relation table name. */
    public static final String TBL_NAME_DIRSUCURSALCTIPOSUCURSALC = "TM_DirSucursalCTipoSucursalC";
    public static final String ROLE_TABLE_TIPOSUCURSALC_DIRSUCURSALESC = TBL_NAME_DIRSUCURSALCTIPOSUCURSALC;
    public static final String ROLE_TABLE_DIRSUCURSALC_TIPOSSUCURSALC = TBL_NAME_DIRSUCURSALCTIPOSUCURSALC;
    /** <code>dirSucursalCCodigo</code> field name. */
    public static final String FLD_TMDIRSUCURSALCTIPOSUCURSALC_DIRSUCURSALCCODIGO = "Codigo";
    /** <code>tipoSucursalCTiposSucursalCCodigo</code> field name. */
    public static final String FLD_TMDIRSUCURSALCTIPOSUCURSALC_TIPOSUCURSALCTIPOSSUCURSALCCODIGO = "TiposSucursalC_Codigo";
    // Intermediate relation (TM_AfiliacionesPlanes)
    /** <code>TM_AfiliacionesPlanes</code> intermediate relation table name. */
    public static final String TBL_NAME_AFILIACIONESPLANES = "TM_AfiliacionesPlanes";
    public static final String ROLE_TABLE_PLANES_AFILIACIONES = TBL_NAME_AFILIACIONESPLANES;
    public static final String ROLE_TABLE_AFILIACIONES_PLANES = TBL_NAME_AFILIACIONESPLANES;
    /** <code>funcionarioId</code> field name. */
    public static final String FLD_TMAFILIACIONESPLANES_FUNCIONARIOID = "Id";
    /** <code>planesPlan</code> field name. */
    public static final String FLD_TMAFILIACIONESPLANES_PLANESPLAN = "Plan";
    // Intermediate relation (TM_AgentexProductoDominio)
    /** <code>TM_AgentexProductoDominio</code> intermediate relation table name. */
    public static final String TBL_NAME_AGENTEXPRODUCTODOMINIO = "TM_AgentexProductoDominio";
    public static final String ROLE_TABLE_DOMINIO_AGENTEXPRODUCTO = TBL_NAME_AGENTEXPRODUCTODOMINIO;
    public static final String ROLE_TABLE_AGENTEXPRODUCTO_DOMINIOS = TBL_NAME_AGENTEXPRODUCTODOMINIO;
    /** <code>funcionarioId</code> field name. */
    public static final String FLD_TMAGENTEXPRODUCTODOMINIO_FUNCIONARIOID = "Id";
    /** <code>agentexProductoAgentexProductoId</code> field name. */
    public static final String FLD_TMAGENTEXPRODUCTODOMINIO_AGENTEXPRODUCTOAGENTEXPRODUCTOID = "AgentexProducto_Id";
    /** <code>dominioNumero</code> field name. */
    public static final String FLD_TMAGENTEXPRODUCTODOMINIO_DOMINIONUMERO = "Numero";
    // Intermediate relation (TM_ReportesProcAlmFuncionario)
    /** <code>TM_ReportesProcAlmFuncionario</code> intermediate relation table name. */
    public static final String TBL_NAME_REPORTESPROCALMFUNCIONARIO = "TM_ReportesProcAlmFuncionario";
    public static final String ROLE_TABLE_FUNCIONARIO_REPORTES = TBL_NAME_REPORTESPROCALMFUNCIONARIO;
    public static final String ROLE_TABLE_REPORTESPROCALM_FUNCIONARIOS = TBL_NAME_REPORTESPROCALMFUNCIONARIO;
    /** <code>reportesProcAlmidReporte</code> field name. */
    public static final String FLD_TMREPORTESPROCALMFUNCIONARIO_REPORTESPROCALMIDREPORTE = "id_Reporte";
    /** <code>funcionarioId</code> field name. */
    public static final String FLD_TMREPORTESPROCALMFUNCIONARIO_FUNCIONARIOID = "Id";
    // Intermediate relation (TM_GrupoAsignacionFuncionario)
    /** <code>TM_GrupoAsignacionFuncionario</code> intermediate relation table name. */
    public static final String TBL_NAME_GRUPOASIGNACIONFUNCIONARIO = "TM_GrupoAsignacionFuncionario";
    public static final String ROLE_TABLE_FUNCIONARIO_GRUPOASIGNACION = TBL_NAME_GRUPOASIGNACIONFUNCIONARIO;
    public static final String ROLE_TABLE_GRUPOASIGNACION_FUNCIONARIO = TBL_NAME_GRUPOASIGNACIONFUNCIONARIO;
    /** <code>grupoAsignacionId</code> field name. */
    public static final String FLD_TMGRUPOASIGNACIONFUNCIONARIO_GRUPOASIGNACIONID = "Id";
    /** <code>funcionarioFuncionarioId</code> field name. */
    public static final String FLD_TMGRUPOASIGNACIONFUNCIONARIO_FUNCIONARIOFUNCIONARIOID = "Funcionario_Id";


    public enum ModelClasses {
        GLOBAL, USR_FUNCTIONS, FUNCIONARIO, ADMIN, SUPERADMIN, ASESOR, AREAMEDICA, AFILIACIONES, RESPREGIONAL, GESTOR, MESADEAPOYO, PARAMCONFIG, LOGPARAM, FRECUENCIAACT, CUESTIONARIOMED, SECCION, PREGUNTA, VALOR, PRODUCTOS, PLANES, PARENTESCO, PERIODICIDAD, ROL, DOMINIO, PLANTILLAEMAIL, ESTADOCONTRATO, ESTADOBENEFICIARIO, ESTADOBENEFICIARIOAE, TARIFA, REGIONAL, SUCURSAL, GRUPOASOCIADO, ESTADOCIVIL, DEPARTAMENTO, TIPOIVA, PERSONA, COMPANYIA, MUNICIPIO, TIPODIRECCION, ESTADOPERSONA, FORMAPAGO, TIPOIDENTIFICACION, EPS, ENTIDADFINANCIERAC, TIPOENTIDADC, TIPOINSTITUCIONC, AESOLICITUDES, SOLICITUD, PERSONAC, DIRECCIONC, TELEFONOC, PROTECCIONDATOSC, DIRECCION, PAIS, PROTECCIONDATOS, USUARIO, CUESTIONARIOP, SECCIONP, PREGUNTAP, CONTRATANTE, ANEXOMAT, ANEXONEO, FIRMA, CONTRATOC, OBSERVACIONESC, BENEFICIARIOC, ANEXOC, PREGCUESMEDC, DIRSUCURSALC, FAMILIAC, USUARIOREG, TITULAR, PREEXISTENCIAC, PREEXISTENCIA, DOCUMENTOG, OBSESTADO, ERRORWS, PARENTESCODOM, MARCAMEDICAC, TIPOSUCURSALC, CONCEPTOC, DETALLETARIFA, AGENTEXPRODUCTO, INSTITUCIONMATNEO, LOGESTADO, MOTDEVAREAMEDICA, CONTSINDOCSOL, LOGCONTSINDOCSOL, LOGASIGNACIONES, REPORTESPROCALM, PRORRATEO, TIPOFACTURA, PARAMREPORTE, TIPONOVEDAD, NOVEDAD, CAUSAL, SOLICITUDNOVEDAD, FAMILIANOVEDAD, USUARIONOVEDAD, CAUSAEXCLUSION, NOVEDADCT, DOCUMENTONOVEDAD, NOVEDADMD, LOGESTADOSN, MOTIVOEXCEPCIONSOLNOV, PRIORIZACIONSOLICITUDES, LOGPRIORIZACIONSOL, GRUPOASIGNACION, LOGGRUPOASIGNACION, LOGGRUPOSUSUARIOS, GRUPOASIGNACIONNOVEDAD, LOGFUNCIONARIO, LOGUSRSOLNOV, CONTRATOCOMBO, LOGCONTRATOCOMBO, CONFIGURACIONANS, LOGCONFIGURACIONANS, CONFIGURACIONFESTIVOS, LOGESTADODOCNOV, PLANTILLAREPORTE, REPORTESDOMINIO, LOGINFORMACIONASESOR, LOGHISTORICOPLANES, LOGLLAMADASAE, LOGLLAMADASBH, FECHAINIEPS, LOGINCOMPATIBILIDADES, LOGDATOSDOMINIO, CONTRATOSEXENTOSFINGRESO, LOGCONTRATOSEXENTOSFINGRESO, TEXTOAVISO, USUARIOSISTEMAEXTERNO;
    }

    /** <code>Funcionario</code> Model class name. */
    public static final String FUNCIONARIO = "Funcionario";
    /** <code>Admin</code> Model class name. */
    public static final String ADMIN = "Admin";
    /** <code>SuperAdmin</code> Model class name. */
    public static final String SUPERADMIN = "SuperAdmin";
    /** <code>Asesor</code> Model class name. */
    public static final String ASESOR = "Asesor";
    /** <code>AreaMedica</code> Model class name. */
    public static final String AREAMEDICA = "AreaMedica";
    /** <code>Afiliaciones</code> Model class name. */
    public static final String AFILIACIONES = "Afiliaciones";
    /** <code>RespRegional</code> Model class name. */
    public static final String RESPREGIONAL = "RespRegional";
    /** <code>Gestor</code> Model class name. */
    public static final String GESTOR = "Gestor";
    /** <code>MesaDeApoyo</code> Model class name. */
    public static final String MESADEAPOYO = "MesaDeApoyo";
    /** <code>ParamConfig</code> Model class name. */
    public static final String PARAMCONFIG = "ParamConfig";
    /** <code>LogParam</code> Model class name. */
    public static final String LOGPARAM = "LogParam";
    /** <code>FrecuenciaAct</code> Model class name. */
    public static final String FRECUENCIAACT = "FrecuenciaAct";
    /** <code>CuestionarioMed</code> Model class name. */
    public static final String CUESTIONARIOMED = "CuestionarioMed";
    /** <code>Seccion</code> Model class name. */
    public static final String SECCION = "Seccion";
    /** <code>Pregunta</code> Model class name. */
    public static final String PREGUNTA = "Pregunta";
    /** <code>Valor</code> Model class name. */
    public static final String VALOR = "Valor";
    /** <code>Productos</code> Model class name. */
    public static final String PRODUCTOS = "Productos";
    /** <code>Planes</code> Model class name. */
    public static final String PLANES = "Planes";
    /** <code>Parentesco</code> Model class name. */
    public static final String PARENTESCO = "Parentesco";
    /** <code>Periodicidad</code> Model class name. */
    public static final String PERIODICIDAD = "Periodicidad";
    /** <code>Rol</code> Model class name. */
    public static final String ROL = "Rol";
    /** <code>Dominio</code> Model class name. */
    public static final String DOMINIO = "Dominio";
    /** <code>PlantillaEmail</code> Model class name. */
    public static final String PLANTILLAEMAIL = "PlantillaEmail";
    /** <code>EstadoContrato</code> Model class name. */
    public static final String ESTADOCONTRATO = "EstadoContrato";
    /** <code>EstadoBeneficiario</code> Model class name. */
    public static final String ESTADOBENEFICIARIO = "EstadoBeneficiario";
    /** <code>EstadoBeneficiarioAE</code> Model class name. */
    public static final String ESTADOBENEFICIARIOAE = "EstadoBeneficiarioAE";
    /** <code>Tarifa</code> Model class name. */
    public static final String TARIFA = "Tarifa";
    /** <code>Regional</code> Model class name. */
    public static final String REGIONAL = "Regional";
    /** <code>Sucursal</code> Model class name. */
    public static final String SUCURSAL = "Sucursal";
    /** <code>GrupoAsociado</code> Model class name. */
    public static final String GRUPOASOCIADO = "GrupoAsociado";
    /** <code>EstadoCivil</code> Model class name. */
    public static final String ESTADOCIVIL = "EstadoCivil";
    /** <code>Departamento</code> Model class name. */
    public static final String DEPARTAMENTO = "Departamento";
    /** <code>TipoIVA</code> Model class name. */
    public static final String TIPOIVA = "TipoIVA";
    /** <code>Persona</code> Model class name. */
    public static final String PERSONA = "Persona";
    /** <code>Companyia</code> Model class name. */
    public static final String COMPANYIA = "Companyia";
    /** <code>Municipio</code> Model class name. */
    public static final String MUNICIPIO = "Municipio";
    /** <code>TipoDireccion</code> Model class name. */
    public static final String TIPODIRECCION = "TipoDireccion";
    /** <code>EstadoPersona</code> Model class name. */
    public static final String ESTADOPERSONA = "EstadoPersona";
    /** <code>FormaPago</code> Model class name. */
    public static final String FORMAPAGO = "FormaPago";
    /** <code>TipoIdentificacion</code> Model class name. */
    public static final String TIPOIDENTIFICACION = "TipoIdentificacion";
    /** <code>Eps</code> Model class name. */
    public static final String EPS = "Eps";
    /** <code>EntidadFinancieraC</code> Model class name. */
    public static final String ENTIDADFINANCIERAC = "EntidadFinancieraC";
    /** <code>TipoEntidadC</code> Model class name. */
    public static final String TIPOENTIDADC = "TipoEntidadC";
    /** <code>TipoInstitucionC</code> Model class name. */
    public static final String TIPOINSTITUCIONC = "TipoInstitucionC";
    /** <code>Aesolicitudes</code> Model class name. */
    public static final String AESOLICITUDES = "Aesolicitudes";
    /** <code>Solicitud</code> Model class name. */
    public static final String SOLICITUD = "Solicitud";
    /** <code>PersonaC</code> Model class name. */
    public static final String PERSONAC = "PersonaC";
    /** <code>DireccionC</code> Model class name. */
    public static final String DIRECCIONC = "DireccionC";
    /** <code>TelefonoC</code> Model class name. */
    public static final String TELEFONOC = "TelefonoC";
    /** <code>ProteccionDatosC</code> Model class name. */
    public static final String PROTECCIONDATOSC = "ProteccionDatosC";
    /** <code>Direccion</code> Model class name. */
    public static final String DIRECCION = "Direccion";
    /** <code>Pais</code> Model class name. */
    public static final String PAIS = "Pais";
    /** <code>ProteccionDatos</code> Model class name. */
    public static final String PROTECCIONDATOS = "ProteccionDatos";
    /** <code>Usuario</code> Model class name. */
    public static final String USUARIO = "Usuario";
    /** <code>CuestionarioP</code> Model class name. */
    public static final String CUESTIONARIOP = "CuestionarioP";
    /** <code>SeccionP</code> Model class name. */
    public static final String SECCIONP = "SeccionP";
    /** <code>PreguntaP</code> Model class name. */
    public static final String PREGUNTAP = "PreguntaP";
    /** <code>Contratante</code> Model class name. */
    public static final String CONTRATANTE = "Contratante";
    /** <code>AnexoMat</code> Model class name. */
    public static final String ANEXOMAT = "AnexoMat";
    /** <code>AnexoNeo</code> Model class name. */
    public static final String ANEXONEO = "AnexoNeo";
    /** <code>Firma</code> Model class name. */
    public static final String FIRMA = "Firma";
    /** <code>ContratoC</code> Model class name. */
    public static final String CONTRATOC = "ContratoC";
    /** <code>ObservacionesC</code> Model class name. */
    public static final String OBSERVACIONESC = "ObservacionesC";
    /** <code>BeneficiarioC</code> Model class name. */
    public static final String BENEFICIARIOC = "BeneficiarioC";
    /** <code>AnexoC</code> Model class name. */
    public static final String ANEXOC = "AnexoC";
    /** <code>PregCuesMedC</code> Model class name. */
    public static final String PREGCUESMEDC = "PregCuesMedC";
    /** <code>DirSucursalC</code> Model class name. */
    public static final String DIRSUCURSALC = "DirSucursalC";
    /** <code>FamiliaC</code> Model class name. */
    public static final String FAMILIAC = "FamiliaC";
    /** <code>UsuarioReg</code> Model class name. */
    public static final String USUARIOREG = "UsuarioReg";
    /** <code>Titular</code> Model class name. */
    public static final String TITULAR = "Titular";
    /** <code>PreexistenciaC</code> Model class name. */
    public static final String PREEXISTENCIAC = "PreexistenciaC";
    /** <code>Preexistencia</code> Model class name. */
    public static final String PREEXISTENCIA = "Preexistencia";
    /** <code>DocumentoG</code> Model class name. */
    public static final String DOCUMENTOG = "DocumentoG";
    /** <code>ObsEstado</code> Model class name. */
    public static final String OBSESTADO = "ObsEstado";
    /** <code>ErrorWS</code> Model class name. */
    public static final String ERRORWS = "ErrorWS";
    /** <code>ParentescoDom</code> Model class name. */
    public static final String PARENTESCODOM = "ParentescoDom";
    /** <code>MarcaMedicaC</code> Model class name. */
    public static final String MARCAMEDICAC = "MarcaMedicaC";
    /** <code>TipoSucursalC</code> Model class name. */
    public static final String TIPOSUCURSALC = "TipoSucursalC";
    /** <code>ConceptoC</code> Model class name. */
    public static final String CONCEPTOC = "ConceptoC";
    /** <code>DetalleTarifa</code> Model class name. */
    public static final String DETALLETARIFA = "DetalleTarifa";
    /** <code>AgentexProducto</code> Model class name. */
    public static final String AGENTEXPRODUCTO = "AgentexProducto";
    /** <code>InstitucionMatNeo</code> Model class name. */
    public static final String INSTITUCIONMATNEO = "InstitucionMatNeo";
    /** <code>LogEstado</code> Model class name. */
    public static final String LOGESTADO = "LogEstado";
    /** <code>MotDevAreaMedica</code> Model class name. */
    public static final String MOTDEVAREAMEDICA = "MotDevAreaMedica";
    /** <code>ContSinDocSol</code> Model class name. */
    public static final String CONTSINDOCSOL = "ContSinDocSol";
    /** <code>LogContSinDocSol</code> Model class name. */
    public static final String LOGCONTSINDOCSOL = "LogContSinDocSol";
    /** <code>LogAsignaciones</code> Model class name. */
    public static final String LOGASIGNACIONES = "LogAsignaciones";
    /** <code>ReportesProcAlm</code> Model class name. */
    public static final String REPORTESPROCALM = "ReportesProcAlm";
    /** <code>Prorrateo</code> Model class name. */
    public static final String PRORRATEO = "Prorrateo";
    /** <code>TipoFactura</code> Model class name. */
    public static final String TIPOFACTURA = "TipoFactura";
    /** <code>ParamReporte</code> Model class name. */
    public static final String PARAMREPORTE = "ParamReporte";
    /** <code>TipoNovedad</code> Model class name. */
    public static final String TIPONOVEDAD = "TipoNovedad";
    /** <code>Novedad</code> Model class name. */
    public static final String NOVEDAD = "Novedad";
    /** <code>Causal</code> Model class name. */
    public static final String CAUSAL = "Causal";
    /** <code>SolicitudNovedad</code> Model class name. */
    public static final String SOLICITUDNOVEDAD = "SolicitudNovedad";
    /** <code>FamiliaNovedad</code> Model class name. */
    public static final String FAMILIANOVEDAD = "FamiliaNovedad";
    /** <code>UsuarioNovedad</code> Model class name. */
    public static final String USUARIONOVEDAD = "UsuarioNovedad";
    /** <code>CausaExclusion</code> Model class name. */
    public static final String CAUSAEXCLUSION = "CausaExclusion";
    /** <code>NovedadCT</code> Model class name. */
    public static final String NOVEDADCT = "NovedadCT";
    /** <code>DocumentoNovedad</code> Model class name. */
    public static final String DOCUMENTONOVEDAD = "DocumentoNovedad";
    /** <code>NovedadMD</code> Model class name. */
    public static final String NOVEDADMD = "NovedadMD";
    /** <code>LogEstadoSN</code> Model class name. */
    public static final String LOGESTADOSN = "LogEstadoSN";
    /** <code>MotivoExcepcionSolNov</code> Model class name. */
    public static final String MOTIVOEXCEPCIONSOLNOV = "MotivoExcepcionSolNov";
    /** <code>PriorizacionSolicitudes</code> Model class name. */
    public static final String PRIORIZACIONSOLICITUDES = "PriorizacionSolicitudes";
    /** <code>LogPriorizacionSol</code> Model class name. */
    public static final String LOGPRIORIZACIONSOL = "LogPriorizacionSol";
    /** <code>GrupoAsignacion</code> Model class name. */
    public static final String GRUPOASIGNACION = "GrupoAsignacion";
    /** <code>LogGrupoAsignacion</code> Model class name. */
    public static final String LOGGRUPOASIGNACION = "LogGrupoAsignacion";
    /** <code>LogGruposUsuarios</code> Model class name. */
    public static final String LOGGRUPOSUSUARIOS = "LogGruposUsuarios";
    /** <code>GrupoAsignacionNovedad</code> Model class name. */
    public static final String GRUPOASIGNACIONNOVEDAD = "GrupoAsignacionNovedad";
    /** <code>LogFuncionario</code> Model class name. */
    public static final String LOGFUNCIONARIO = "LogFuncionario";
    /** <code>LogUsrSolNov</code> Model class name. */
    public static final String LOGUSRSOLNOV = "LogUsrSolNov";
    /** <code>ContratoCombo</code> Model class name. */
    public static final String CONTRATOCOMBO = "ContratoCombo";
    /** <code>LogContratoCombo</code> Model class name. */
    public static final String LOGCONTRATOCOMBO = "LogContratoCombo";
    /** <code>ConfiguracionANS</code> Model class name. */
    public static final String CONFIGURACIONANS = "ConfiguracionANS";
    /** <code>LogConfiguracionANS</code> Model class name. */
    public static final String LOGCONFIGURACIONANS = "LogConfiguracionANS";
    /** <code>ConfiguracionFestivos</code> Model class name. */
    public static final String CONFIGURACIONFESTIVOS = "ConfiguracionFestivos";
    /** <code>LogEstadoDocNov</code> Model class name. */
    public static final String LOGESTADODOCNOV = "LogEstadoDocNov";
    /** <code>PlantillaReporte</code> Model class name. */
    public static final String PLANTILLAREPORTE = "PlantillaReporte";
    /** <code>ReportesDominio</code> Model class name. */
    public static final String REPORTESDOMINIO = "ReportesDominio";
    /** <code>LogInformacionAsesor</code> Model class name. */
    public static final String LOGINFORMACIONASESOR = "LogInformacionAsesor";
    /** <code>LogHistoricoPlanes</code> Model class name. */
    public static final String LOGHISTORICOPLANES = "LogHistoricoPlanes";
    /** <code>LogLlamadasAE</code> Model class name. */
    public static final String LOGLLAMADASAE = "LogLlamadasAE";
    /** <code>LogLlamadasBH</code> Model class name. */
    public static final String LOGLLAMADASBH = "LogLlamadasBH";
    /** <code>FechaIniEPS</code> Model class name. */
    public static final String FECHAINIEPS = "FechaIniEPS";
    /** <code>LogIncompatibilidades</code> Model class name. */
    public static final String LOGINCOMPATIBILIDADES = "LogIncompatibilidades";
    /** <code>LogDatosDominio</code> Model class name. */
    public static final String LOGDATOSDOMINIO = "LogDatosDominio";
    /** <code>ContratosExentosFIngreso</code> Model class name. */
    public static final String CONTRATOSEXENTOSFINGRESO = "ContratosExentosFIngreso";
    /** <code>LogContratosExentosFIngreso</code> Model class name. */
    public static final String LOGCONTRATOSEXENTOSFINGRESO = "LogContratosExentosFIngreso";
    /** <code>TextoAviso</code> Model class name. */
    public static final String TEXTOAVISO = "TextoAviso";
    /** <code>UsuarioSistemaExterno</code> Model class name. */
    public static final String USUARIOSISTEMAEXTERNO = "UsuarioSistemaExterno";

    public enum Type {
        AUTONUMERIC, BLOB, BOOL, DATE, DATETIME, INT, NAT, REAL, STRING, TEXT, TIME, OID, FUNCIONARIO, ADMIN, SUPERADMIN, ASESOR, AREAMEDICA, AFILIACIONES, RESPREGIONAL, GESTOR, MESADEAPOYO, PARAMCONFIG, LOGPARAM, FRECUENCIAACT, CUESTIONARIOMED, SECCION, PREGUNTA, VALOR, PRODUCTOS, PLANES, PARENTESCO, PERIODICIDAD, ROL, DOMINIO, PLANTILLAEMAIL, ESTADOCONTRATO, ESTADOBENEFICIARIO, ESTADOBENEFICIARIOAE, TARIFA, REGIONAL, SUCURSAL, GRUPOASOCIADO, ESTADOCIVIL, DEPARTAMENTO, TIPOIVA, PERSONA, COMPANYIA, MUNICIPIO, TIPODIRECCION, ESTADOPERSONA, FORMAPAGO, TIPOIDENTIFICACION, EPS, ENTIDADFINANCIERAC, TIPOENTIDADC, TIPOINSTITUCIONC, AESOLICITUDES, SOLICITUD, PERSONAC, DIRECCIONC, TELEFONOC, PROTECCIONDATOSC, DIRECCION, PAIS, PROTECCIONDATOS, USUARIO, CUESTIONARIOP, SECCIONP, PREGUNTAP, CONTRATANTE, ANEXOMAT, ANEXONEO, FIRMA, CONTRATOC, OBSERVACIONESC, BENEFICIARIOC, ANEXOC, PREGCUESMEDC, DIRSUCURSALC, FAMILIAC, USUARIOREG, TITULAR, PREEXISTENCIAC, PREEXISTENCIA, DOCUMENTOG, OBSESTADO, ERRORWS, PARENTESCODOM, MARCAMEDICAC, TIPOSUCURSALC, CONCEPTOC, DETALLETARIFA, AGENTEXPRODUCTO, INSTITUCIONMATNEO, LOGESTADO, MOTDEVAREAMEDICA, CONTSINDOCSOL, LOGCONTSINDOCSOL, LOGASIGNACIONES, REPORTESPROCALM, PRORRATEO, TIPOFACTURA, PARAMREPORTE, TIPONOVEDAD, NOVEDAD, CAUSAL, SOLICITUDNOVEDAD, FAMILIANOVEDAD, USUARIONOVEDAD, CAUSAEXCLUSION, NOVEDADCT, DOCUMENTONOVEDAD, NOVEDADMD, LOGESTADOSN, MOTIVOEXCEPCIONSOLNOV, PRIORIZACIONSOLICITUDES, LOGPRIORIZACIONSOL, GRUPOASIGNACION, LOGGRUPOASIGNACION, LOGGRUPOSUSUARIOS, GRUPOASIGNACIONNOVEDAD, LOGFUNCIONARIO, LOGUSRSOLNOV, CONTRATOCOMBO, LOGCONTRATOCOMBO, CONFIGURACIONANS, LOGCONFIGURACIONANS, CONFIGURACIONFESTIVOS, LOGESTADODOCNOV, PLANTILLAREPORTE, REPORTESDOMINIO, LOGINFORMACIONASESOR, LOGHISTORICOPLANES, LOGLLAMADASAE, LOGLLAMADASBH, FECHAINIEPS, LOGINCOMPATIBILIDADES, LOGDATOSDOMINIO, CONTRATOSEXENTOSFINGRESO, LOGCONTRATOSEXENTOSFINGRESO, TEXTOAVISO, USUARIOSISTEMAEXTERNO;

        private static final int BASIC_TYPE = 10;

        /**
         * Method that indicates if is a basic type.
         * 
         * @return true if it is a basic type
         */
        public boolean isBasicType() {
            return ordinal() <= BASIC_TYPE;
        }

        /**
         * Method that indicates if is a class type.
         * 
         * @return true if it is a class type
         */
        public boolean isClassType() {
            return ordinal() > BASIC_TYPE;
        }

        /**
         * Method that indicates the name of the type.
         * 
         * @return the name of the type
         */
        public String getTypeName() {
            String returnValue = "";
            switch (this) {
            case AUTONUMERIC:
                returnValue = "Autonumeric";
                break;
            case BLOB:
                returnValue = "Blob";
                break;
            case BOOL:
                returnValue = "Bool";
                break;
            case DATE:
                returnValue = "Date";
                break;
            case DATETIME:
                returnValue = "DateTime";
                break;
            case INT:
                returnValue = "Int";
                break;
            case NAT:
                returnValue = "Nat";
                break;
            case REAL:
                returnValue = "Real";
                break;
            case STRING:
                returnValue = "String";
                break;
            case TEXT:
                returnValue = "Text";
                break;
            case TIME:
                returnValue = "Time";
                break;
            default:
                returnValue = this.name();
            }
            return returnValue;
        }

        /**
         * Method that indicates the name of the entity class.
         * 
         * @return the name of the entity class
         */
        public String getEntityClassName() {
            String returnValue = "";
            switch (this) {
            case FUNCIONARIO:
                returnValue = "com.keralty.aepersonas.persistence.Funcionario";
                break;
            case ADMIN:
                returnValue = "com.keralty.aepersonas.persistence.Admin";
                break;
            case SUPERADMIN:
                returnValue = "com.keralty.aepersonas.persistence.SuperAdmin";
                break;
            case ASESOR:
                returnValue = "com.keralty.aepersonas.persistence.Asesor";
                break;
            case AREAMEDICA:
                returnValue = "com.keralty.aepersonas.persistence.AreaMedica";
                break;
            case AFILIACIONES:
                returnValue = "com.keralty.aepersonas.persistence.Afiliaciones";
                break;
            case RESPREGIONAL:
                returnValue = "com.keralty.aepersonas.persistence.RespRegional";
                break;
            case GESTOR:
                returnValue = "com.keralty.aepersonas.persistence.Gestor";
                break;
            case MESADEAPOYO:
                returnValue = "com.keralty.aepersonas.persistence.MesaDeApoyo";
                break;
            case PARAMCONFIG:
                returnValue = "com.keralty.aepersonas.persistence.ParamConfig";
                break;
            case LOGPARAM:
                returnValue = "com.keralty.aepersonas.persistence.LogParam";
                break;
            case FRECUENCIAACT:
                returnValue = "com.keralty.aepersonas.persistence.FrecuenciaAct";
                break;
            case CUESTIONARIOMED:
                returnValue = "com.keralty.aepersonas.persistence.CuestionarioMed";
                break;
            case SECCION:
                returnValue = "com.keralty.aepersonas.persistence.Seccion";
                break;
            case PREGUNTA:
                returnValue = "com.keralty.aepersonas.persistence.Pregunta";
                break;
            case VALOR:
                returnValue = "com.keralty.aepersonas.persistence.Valor";
                break;
            case PRODUCTOS:
                returnValue = "com.keralty.aepersonas.persistence.Productos";
                break;
            case PLANES:
                returnValue = "com.keralty.aepersonas.persistence.Planes";
                break;
            case PARENTESCO:
                returnValue = "com.keralty.aepersonas.persistence.Parentesco";
                break;
            case PERIODICIDAD:
                returnValue = "com.keralty.aepersonas.persistence.Periodicidad";
                break;
            case ROL:
                returnValue = "com.keralty.aepersonas.persistence.Rol";
                break;
            case DOMINIO:
                returnValue = "com.keralty.aepersonas.persistence.Dominio";
                break;
            case PLANTILLAEMAIL:
                returnValue = "com.keralty.aepersonas.persistence.PlantillaEmail";
                break;
            case ESTADOCONTRATO:
                returnValue = "com.keralty.aepersonas.persistence.EstadoContrato";
                break;
            case ESTADOBENEFICIARIO:
                returnValue = "com.keralty.aepersonas.persistence.EstadoBeneficiario";
                break;
            case ESTADOBENEFICIARIOAE:
                returnValue = "com.keralty.aepersonas.persistence.EstadoBeneficiarioAE";
                break;
            case TARIFA:
                returnValue = "com.keralty.aepersonas.persistence.Tarifa";
                break;
            case REGIONAL:
                returnValue = "com.keralty.aepersonas.persistence.Regional";
                break;
            case SUCURSAL:
                returnValue = "com.keralty.aepersonas.persistence.Sucursal";
                break;
            case GRUPOASOCIADO:
                returnValue = "com.keralty.aepersonas.persistence.GrupoAsociado";
                break;
            case ESTADOCIVIL:
                returnValue = "com.keralty.aepersonas.persistence.EstadoCivil";
                break;
            case DEPARTAMENTO:
                returnValue = "com.keralty.aepersonas.persistence.Departamento";
                break;
            case TIPOIVA:
                returnValue = "com.keralty.aepersonas.persistence.TipoIVA";
                break;
            case PERSONA:
                returnValue = "com.keralty.aepersonas.persistence.Persona";
                break;
            case COMPANYIA:
                returnValue = "com.keralty.aepersonas.persistence.Companyia";
                break;
            case MUNICIPIO:
                returnValue = "com.keralty.aepersonas.persistence.Municipio";
                break;
            case TIPODIRECCION:
                returnValue = "com.keralty.aepersonas.persistence.TipoDireccion";
                break;
            case ESTADOPERSONA:
                returnValue = "com.keralty.aepersonas.persistence.EstadoPersona";
                break;
            case FORMAPAGO:
                returnValue = "com.keralty.aepersonas.persistence.FormaPago";
                break;
            case TIPOIDENTIFICACION:
                returnValue = "com.keralty.aepersonas.persistence.TipoIdentificacion";
                break;
            case EPS:
                returnValue = "com.keralty.aepersonas.persistence.Eps";
                break;
            case ENTIDADFINANCIERAC:
                returnValue = "com.keralty.aepersonas.persistence.EntidadFinancieraC";
                break;
            case TIPOENTIDADC:
                returnValue = "com.keralty.aepersonas.persistence.TipoEntidadC";
                break;
            case TIPOINSTITUCIONC:
                returnValue = "com.keralty.aepersonas.persistence.TipoInstitucionC";
                break;
            case AESOLICITUDES:
                returnValue = "com.keralty.aepersonas.persistence.Aesolicitudes";
                break;
            case SOLICITUD:
                returnValue = "com.keralty.aepersonas.persistence.Solicitud";
                break;
            case PERSONAC:
                returnValue = "com.keralty.aepersonas.persistence.PersonaC";
                break;
            case DIRECCIONC:
                returnValue = "com.keralty.aepersonas.persistence.DireccionC";
                break;
            case TELEFONOC:
                returnValue = "com.keralty.aepersonas.persistence.TelefonoC";
                break;
            case PROTECCIONDATOSC:
                returnValue = "com.keralty.aepersonas.persistence.ProteccionDatosC";
                break;
            case DIRECCION:
                returnValue = "com.keralty.aepersonas.persistence.Direccion";
                break;
            case PAIS:
                returnValue = "com.keralty.aepersonas.persistence.Pais";
                break;
            case PROTECCIONDATOS:
                returnValue = "com.keralty.aepersonas.persistence.ProteccionDatos";
                break;
            case USUARIO:
                returnValue = "com.keralty.aepersonas.persistence.Usuario";
                break;
            case CUESTIONARIOP:
                returnValue = "com.keralty.aepersonas.persistence.CuestionarioP";
                break;
            case SECCIONP:
                returnValue = "com.keralty.aepersonas.persistence.SeccionP";
                break;
            case PREGUNTAP:
                returnValue = "com.keralty.aepersonas.persistence.PreguntaP";
                break;
            case CONTRATANTE:
                returnValue = "com.keralty.aepersonas.persistence.Contratante";
                break;
            case ANEXOMAT:
                returnValue = "com.keralty.aepersonas.persistence.AnexoMat";
                break;
            case ANEXONEO:
                returnValue = "com.keralty.aepersonas.persistence.AnexoNeo";
                break;
            case FIRMA:
                returnValue = "com.keralty.aepersonas.persistence.Firma";
                break;
            case CONTRATOC:
                returnValue = "com.keralty.aepersonas.persistence.ContratoC";
                break;
            case OBSERVACIONESC:
                returnValue = "com.keralty.aepersonas.persistence.ObservacionesC";
                break;
            case BENEFICIARIOC:
                returnValue = "com.keralty.aepersonas.persistence.BeneficiarioC";
                break;
            case ANEXOC:
                returnValue = "com.keralty.aepersonas.persistence.AnexoC";
                break;
            case PREGCUESMEDC:
                returnValue = "com.keralty.aepersonas.persistence.PregCuesMedC";
                break;
            case DIRSUCURSALC:
                returnValue = "com.keralty.aepersonas.persistence.DirSucursalC";
                break;
            case FAMILIAC:
                returnValue = "com.keralty.aepersonas.persistence.FamiliaC";
                break;
            case USUARIOREG:
                returnValue = "com.keralty.aepersonas.persistence.UsuarioReg";
                break;
            case TITULAR:
                returnValue = "com.keralty.aepersonas.persistence.Titular";
                break;
            case PREEXISTENCIAC:
                returnValue = "com.keralty.aepersonas.persistence.PreexistenciaC";
                break;
            case PREEXISTENCIA:
                returnValue = "com.keralty.aepersonas.persistence.Preexistencia";
                break;
            case DOCUMENTOG:
                returnValue = "com.keralty.aepersonas.persistence.DocumentoG";
                break;
            case OBSESTADO:
                returnValue = "com.keralty.aepersonas.persistence.ObsEstado";
                break;
            case ERRORWS:
                returnValue = "com.keralty.aepersonas.persistence.ErrorWS";
                break;
            case PARENTESCODOM:
                returnValue = "com.keralty.aepersonas.persistence.ParentescoDom";
                break;
            case MARCAMEDICAC:
                returnValue = "com.keralty.aepersonas.persistence.MarcaMedicaC";
                break;
            case TIPOSUCURSALC:
                returnValue = "com.keralty.aepersonas.persistence.TipoSucursalC";
                break;
            case CONCEPTOC:
                returnValue = "com.keralty.aepersonas.persistence.ConceptoC";
                break;
            case DETALLETARIFA:
                returnValue = "com.keralty.aepersonas.persistence.DetalleTarifa";
                break;
            case AGENTEXPRODUCTO:
                returnValue = "com.keralty.aepersonas.persistence.AgentexProducto";
                break;
            case INSTITUCIONMATNEO:
                returnValue = "com.keralty.aepersonas.persistence.InstitucionMatNeo";
                break;
            case LOGESTADO:
                returnValue = "com.keralty.aepersonas.persistence.LogEstado";
                break;
            case MOTDEVAREAMEDICA:
                returnValue = "com.keralty.aepersonas.persistence.MotDevAreaMedica";
                break;
            case CONTSINDOCSOL:
                returnValue = "com.keralty.aepersonas.persistence.ContSinDocSol";
                break;
            case LOGCONTSINDOCSOL:
                returnValue = "com.keralty.aepersonas.persistence.LogContSinDocSol";
                break;
            case LOGASIGNACIONES:
                returnValue = "com.keralty.aepersonas.persistence.LogAsignaciones";
                break;
            case REPORTESPROCALM:
                returnValue = "com.keralty.aepersonas.persistence.ReportesProcAlm";
                break;
            case PRORRATEO:
                returnValue = "com.keralty.aepersonas.persistence.Prorrateo";
                break;
            case TIPOFACTURA:
                returnValue = "com.keralty.aepersonas.persistence.TipoFactura";
                break;
            case PARAMREPORTE:
                returnValue = "com.keralty.aepersonas.persistence.ParamReporte";
                break;
            case TIPONOVEDAD:
                returnValue = "com.keralty.aepersonas.persistence.TipoNovedad";
                break;
            case NOVEDAD:
                returnValue = "com.keralty.aepersonas.persistence.Novedad";
                break;
            case CAUSAL:
                returnValue = "com.keralty.aepersonas.persistence.Causal";
                break;
            case SOLICITUDNOVEDAD:
                returnValue = "com.keralty.aepersonas.persistence.SolicitudNovedad";
                break;
            case FAMILIANOVEDAD:
                returnValue = "com.keralty.aepersonas.persistence.FamiliaNovedad";
                break;
            case USUARIONOVEDAD:
                returnValue = "com.keralty.aepersonas.persistence.UsuarioNovedad";
                break;
            case CAUSAEXCLUSION:
                returnValue = "com.keralty.aepersonas.persistence.CausaExclusion";
                break;
            case NOVEDADCT:
                returnValue = "com.keralty.aepersonas.persistence.NovedadCT";
                break;
            case DOCUMENTONOVEDAD:
                returnValue = "com.keralty.aepersonas.persistence.DocumentoNovedad";
                break;
            case NOVEDADMD:
                returnValue = "com.keralty.aepersonas.persistence.NovedadMD";
                break;
            case LOGESTADOSN:
                returnValue = "com.keralty.aepersonas.persistence.LogEstadoSN";
                break;
            case MOTIVOEXCEPCIONSOLNOV:
                returnValue = "com.keralty.aepersonas.persistence.MotivoExcepcionSolNov";
                break;
            case PRIORIZACIONSOLICITUDES:
                returnValue = "com.keralty.aepersonas.persistence.PriorizacionSolicitudes";
                break;
            case LOGPRIORIZACIONSOL:
                returnValue = "com.keralty.aepersonas.persistence.LogPriorizacionSol";
                break;
            case GRUPOASIGNACION:
                returnValue = "com.keralty.aepersonas.persistence.GrupoAsignacion";
                break;
            case LOGGRUPOASIGNACION:
                returnValue = "com.keralty.aepersonas.persistence.LogGrupoAsignacion";
                break;
            case LOGGRUPOSUSUARIOS:
                returnValue = "com.keralty.aepersonas.persistence.LogGruposUsuarios";
                break;
            case GRUPOASIGNACIONNOVEDAD:
                returnValue = "com.keralty.aepersonas.persistence.GrupoAsignacionNovedad";
                break;
            case LOGFUNCIONARIO:
                returnValue = "com.keralty.aepersonas.persistence.LogFuncionario";
                break;
            case LOGUSRSOLNOV:
                returnValue = "com.keralty.aepersonas.persistence.LogUsrSolNov";
                break;
            case CONTRATOCOMBO:
                returnValue = "com.keralty.aepersonas.persistence.ContratoCombo";
                break;
            case LOGCONTRATOCOMBO:
                returnValue = "com.keralty.aepersonas.persistence.LogContratoCombo";
                break;
            case CONFIGURACIONANS:
                returnValue = "com.keralty.aepersonas.persistence.ConfiguracionANS";
                break;
            case LOGCONFIGURACIONANS:
                returnValue = "com.keralty.aepersonas.persistence.LogConfiguracionANS";
                break;
            case CONFIGURACIONFESTIVOS:
                returnValue = "com.keralty.aepersonas.persistence.ConfiguracionFestivos";
                break;
            case LOGESTADODOCNOV:
                returnValue = "com.keralty.aepersonas.persistence.LogEstadoDocNov";
                break;
            case PLANTILLAREPORTE:
                returnValue = "com.keralty.aepersonas.persistence.PlantillaReporte";
                break;
            case REPORTESDOMINIO:
                returnValue = "com.keralty.aepersonas.persistence.ReportesDominio";
                break;
            case LOGINFORMACIONASESOR:
                returnValue = "com.keralty.aepersonas.persistence.LogInformacionAsesor";
                break;
            case LOGHISTORICOPLANES:
                returnValue = "com.keralty.aepersonas.persistence.LogHistoricoPlanes";
                break;
            case LOGLLAMADASAE:
                returnValue = "com.keralty.aepersonas.persistence.LogLlamadasAE";
                break;
            case LOGLLAMADASBH:
                returnValue = "com.keralty.aepersonas.persistence.LogLlamadasBH";
                break;
            case FECHAINIEPS:
                returnValue = "com.keralty.aepersonas.persistence.FechaIniEPS";
                break;
            case LOGINCOMPATIBILIDADES:
                returnValue = "com.keralty.aepersonas.persistence.LogIncompatibilidades";
                break;
            case LOGDATOSDOMINIO:
                returnValue = "com.keralty.aepersonas.persistence.LogDatosDominio";
                break;
            case CONTRATOSEXENTOSFINGRESO:
                returnValue = "com.keralty.aepersonas.persistence.ContratosExentosFIngreso";
                break;
            case LOGCONTRATOSEXENTOSFINGRESO:
                returnValue = "com.keralty.aepersonas.persistence.LogContratosExentosFIngreso";
                break;
            case TEXTOAVISO:
                returnValue = "com.keralty.aepersonas.persistence.TextoAviso";
                break;
            case USUARIOSISTEMAEXTERNO:
                returnValue = "com.keralty.aepersonas.persistence.UsuarioSistemaExterno";
                break;
            default:
                returnValue = null;
            }
            return returnValue;
        }
    }

    public static final String LEFTJOIN = "Left Join";
    public static final String INNERJOIN = "Inner Join";

    /** Normal Filter */
    public static final Integer NORMAL_FILTER = 0;
    /** Navigational Filter in a Service argument */
    public static final Integer NAVFILTER_LOCAL_SERVICE = 1;
    /** Navigational Filter in a Service argument */
    public static final Integer NAVFILTER_GLOBAL_SERVICE = 2;
    /** Navigational Filter in a Navigation */
    public static final Integer NAVFILTER_NAVIG = 3;
    /** Navigational Filter in a Variable Navigational Filter */
    public static final Integer NAVFILTER_VARIABLE = 4;
    /** By supplementary information */
    public static final Integer SUP_INFO = 5;

    public static final String SELECTEDOBJECT = "SelectedObject";
    
    public static final String FILTER_BY_RELATED = "_Related";
    public static final String FILTER_BY_RELATED_FVAR_PATH = "relatedInstancePath";
    public static final String FILTER_BY_RELATED_FVAR_OID = "relatedInstanceOid";
    public static final String FILTER_BY_OID = "_OID";
    public static final String FILTER_BY_OID_FVAR_OID = "oid";
    
    /** Filter fum an lmd names */
    public static final String FILTER_FUM_NAME = "FUM";
    public static final String FILTER_LMD_NAME = "LMD";

    /** Filters variables initial and final dates */
    public static final String FILTER_VARIABLE_FDESDE = "FDesde";
    public static final String FILTER_VARIABLE_FHASTA = "FHasta";

    public static final String FILTER_VARIABLE_INITDATE = "InitDate";
    public static final String FILTER_VARIABLE_FINALDATE = "FinalDate";

    /** Default values for date, time and datetime */
    public static final String DATE_DEFAULTVALUE = "1970-01-01";
    public static final String TIME_DEFAULTVALUE = "00:00:00";
    public static final String DATETIME_DEFAULTVALUE = "1970-01-01 00:00:00";
    public static final String DATE_MAXVALUE = "3000-01-01";
    public static final String TIME_MAXVALUE = "23:59:59";
    public static final String DATETIME_MAXVALUE = "3000-01-01 00:00:00";
    
    public static final String AGENTKEYWORD = "AGENT";

    public static final String AGENT_FUNCIONARIO = "AGENT_Funcionario";

    public static final String AGENT_ADMIN = "AGENT_Admin";

    public static final String AGENT_SUPERADMIN = "AGENT_SuperAdmin";

    public static final String AGENT_ASESOR = "AGENT_Asesor";

    public static final String AGENT_AREAMEDICA = "AGENT_AreaMedica";

    public static final String AGENT_AFILIACIONES = "AGENT_Afiliaciones";

    public static final String AGENT_RESPREGIONAL = "AGENT_RespRegional";

    public static final String AGENT_GESTOR = "AGENT_Gestor";

    public static final String AGENT_MESADEAPOYO = "AGENT_MesaDeApoyo";

    public static final String AGENT_USUARIOSISTEMAEXTERNO = "AGENT_UsuarioSistemaExterno";

    // Service (TGSINC1PRODUCTO)
    /** <code>TGSINC1PRODUCTO</code> service id. */
    public static final String G_SERV_ID_TGSINC1PRODUCTO = "IGl_1431688314880455_Alias";
    /** <code>TGSINC1PRODUCTO</code> service name. */
    public static final String G_SERV_NAME_TGSINC1PRODUCTO = "TGSINC1PRODUCTO";
    /** Agents allowed to execute the service TGSINC1PRODUCTO **/
    public static final String GS_TGSINC1PRODUCTO_SRVAGENTS = "";
    /** <code>pt_p_atrNumero</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1PRODUCTO_TGSINC1PRODUCTOPTPATRNUMERO = "pt_p_atrNumero";
    public static final String GS_ARG_ID_TGSINC1PRODUCTO_TGSINC1PRODUCTOPTPATRNUMERO = "IGl_1431688314880455Arg_5_Alias";
    /** <code>pt_p_atrDescripcion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1PRODUCTO_TGSINC1PRODUCTOPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    public static final String GS_ARG_ID_TGSINC1PRODUCTO_TGSINC1PRODUCTOPTPATRDESCRIPCION = "IGl_1431688314880455Arg_6_Alias";
    /** <code>pt_p_atrCodigoLegal</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1PRODUCTO_TGSINC1PRODUCTOPTPATRCODIGOLEGAL = "pt_p_atrCodigoLegal";
    public static final String GS_ARG_ID_TGSINC1PRODUCTO_TGSINC1PRODUCTOPTPATRCODIGOLEGAL = "IGl_1431688314880455Arg_7_Alias";

    // Service (TGSINCPRODUCTOS)
    /** <code>TGSINCPRODUCTOS</code> service id. */
    public static final String G_SERV_ID_TGSINCPRODUCTOS = "IGl_1431689232384061_Alias";
    /** <code>TGSINCPRODUCTOS</code> service name. */
    public static final String G_SERV_NAME_TGSINCPRODUCTOS = "TGSINCPRODUCTOS";
    /** Agents allowed to execute the service TGSINCPRODUCTOS **/
    public static final String GS_TGSINCPRODUCTOS_SRVAGENTS = "Admin,SuperAdmin";

    // Service (TGSINC1PLAN)
    /** <code>TGSINC1PLAN</code> service id. */
    public static final String G_SERV_ID_TGSINC1PLAN = "IGl_1431696703488591_Alias";
    /** <code>TGSINC1PLAN</code> service name. */
    public static final String G_SERV_NAME_TGSINC1PLAN = "TGSINC1PLAN";
    /** Agents allowed to execute the service TGSINC1PLAN **/
    public static final String GS_TGSINC1PLAN_SRVAGENTS = "";
    /** <code>pt_p_atrNumero</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1PLAN_TGSINC1PLANPTPATRNUMERO = "pt_p_atrNumero";
    public static final String GS_ARG_ID_TGSINC1PLAN_TGSINC1PLANPTPATRNUMERO = "IGl_1431696703488591Arg_10_Alias";
    /** <code>pt_p_atrCodigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1PLAN_TGSINC1PLANPTPATRCODIGO = "pt_p_atrCodigo";
    public static final String GS_ARG_ID_TGSINC1PLAN_TGSINC1PLANPTPATRCODIGO = "IGl_1431696703488591Arg_11_Alias";
    /** <code>pt_p_atrNombre</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1PLAN_TGSINC1PLANPTPATRNOMBRE = "pt_p_atrNombre";
    public static final String GS_ARG_ID_TGSINC1PLAN_TGSINC1PLANPTPATRNOMBRE = "IGl_1431696703488591Arg_12_Alias";
    /** <code>pt_p_atrCodigoLegal</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1PLAN_TGSINC1PLANPTPATRCODIGOLEGAL = "pt_p_atrCodigoLegal";
    public static final String GS_ARG_ID_TGSINC1PLAN_TGSINC1PLANPTPATRCODIGOLEGAL = "IGl_1431696703488591Arg_13_Alias";

    // Service (TGSINC1PLANAUX)
    /** <code>TGSINC1PLANAUX</code> service id. */
    public static final String G_SERV_ID_TGSINC1PLANAUX = "IGl_1431697358848380_Alias";
    /** <code>TGSINC1PLANAUX</code> service name. */
    public static final String G_SERV_NAME_TGSINC1PLANAUX = "TGSINC1PLANAUX";
    /** Agents allowed to execute the service TGSINC1PLANAUX **/
    public static final String GS_TGSINC1PLANAUX_SRVAGENTS = "";
    /** <code>pt_p_agrProducto</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1PLANAUX_TGSINC1PLANAUXPTPAGRPRODUCTO = "pt_p_agrProducto";
    public static final String GS_ARG_ID_TGSINC1PLANAUX_TGSINC1PLANAUXPTPAGRPRODUCTO = "IGl_1431697358848380Arg_5_Alias";
    /** <code>pt_p_atrCodigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1PLANAUX_TGSINC1PLANAUXPTPATRCODIGO = "pt_p_atrCodigo";
    public static final String GS_ARG_ID_TGSINC1PLANAUX_TGSINC1PLANAUXPTPATRCODIGO = "IGl_1431697358848380Arg_6_Alias";
    /** <code>pt_p_atrNombre</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1PLANAUX_TGSINC1PLANAUXPTPATRNOMBRE = "pt_p_atrNombre";
    public static final String GS_ARG_ID_TGSINC1PLANAUX_TGSINC1PLANAUXPTPATRNOMBRE = "IGl_1431697358848380Arg_7_Alias";
    /** <code>pt_p_atrCodigoLegal</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1PLANAUX_TGSINC1PLANAUXPTPATRCODIGOLEGAL = "pt_p_atrCodigoLegal";
    public static final String GS_ARG_ID_TGSINC1PLANAUX_TGSINC1PLANAUXPTPATRCODIGOLEGAL = "IGl_1431697358848380Arg_8_Alias";

    // Service (TGSINCPLANES)
    /** <code>TGSINCPLANES</code> service id. */
    public static final String G_SERV_ID_TGSINCPLANES = "IGl_1431697489920972_Alias";
    /** <code>TGSINCPLANES</code> service name. */
    public static final String G_SERV_NAME_TGSINCPLANES = "TGSINCPLANES";
    /** Agents allowed to execute the service TGSINCPLANES **/
    public static final String GS_TGSINCPLANES_SRVAGENTS = "Admin,SuperAdmin";

    // Service (TGSINC1PARENTESCO)
    /** <code>TGSINC1PARENTESCO</code> service id. */
    public static final String G_SERV_ID_TGSINC1PARENTESCO = "IGl_1431698407424039_Alias";
    /** <code>TGSINC1PARENTESCO</code> service name. */
    public static final String G_SERV_NAME_TGSINC1PARENTESCO = "TGSINC1PARENTESCO";
    /** Agents allowed to execute the service TGSINC1PARENTESCO **/
    public static final String GS_TGSINC1PARENTESCO_SRVAGENTS = "";
    /** <code>pt_p_atrCodigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1PARENTESCO_TGSINC1PARENTESCOPTPATRCODIGO = "pt_p_atrCodigo";
    public static final String GS_ARG_ID_TGSINC1PARENTESCO_TGSINC1PARENTESCOPTPATRCODIGO = "IGl_1431698407424039Arg_7_Alias";
    /** <code>pt_p_atrDescripcion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1PARENTESCO_TGSINC1PARENTESCOPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    public static final String GS_ARG_ID_TGSINC1PARENTESCO_TGSINC1PARENTESCOPTPATRDESCRIPCION = "IGl_1431698407424039Arg_8_Alias";
    /** <code>pt_p_atrNombreCorto</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1PARENTESCO_TGSINC1PARENTESCOPTPATRNOMBRECORTO = "pt_p_atrNombreCorto";
    public static final String GS_ARG_ID_TGSINC1PARENTESCO_TGSINC1PARENTESCOPTPATRNOMBRECORTO = "IGl_1431698407424039Arg_9_Alias";

    // Service (TGSINCPARENTESCOS)
    /** <code>TGSINCPARENTESCOS</code> service id. */
    public static final String G_SERV_ID_TGSINCPARENTESCOS = "IGl_1431698538496232_Alias";
    /** <code>TGSINCPARENTESCOS</code> service name. */
    public static final String G_SERV_NAME_TGSINCPARENTESCOS = "TGSINCPARENTESCOS";
    /** Agents allowed to execute the service TGSINCPARENTESCOS **/
    public static final String GS_TGSINCPARENTESCOS_SRVAGENTS = "Admin,SuperAdmin";

    // Service (TGSINC1PERIODICIDAD)
    /** <code>TGSINC1PERIODICIDAD</code> service id. */
    public static final String G_SERV_ID_TGSINC1PERIODICIDAD = "IGl_1431700111360999_Alias";
    /** <code>TGSINC1PERIODICIDAD</code> service name. */
    public static final String G_SERV_NAME_TGSINC1PERIODICIDAD = "TGSINC1PERIODICIDAD";
    /** Agents allowed to execute the service TGSINC1PERIODICIDAD **/
    public static final String GS_TGSINC1PERIODICIDAD_SRVAGENTS = "";
    /** <code>pt_p_atrCodigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1PERIODICIDAD_TGSINC1PERIODICIDADPTPATRCODIGO = "pt_p_atrCodigo";
    public static final String GS_ARG_ID_TGSINC1PERIODICIDAD_TGSINC1PERIODICIDADPTPATRCODIGO = "IGl_1431700111360999Arg_3_Alias";
    /** <code>pt_p_atrDescripcion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1PERIODICIDAD_TGSINC1PERIODICIDADPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    public static final String GS_ARG_ID_TGSINC1PERIODICIDAD_TGSINC1PERIODICIDADPTPATRDESCRIPCION = "IGl_1431700111360999Arg_4_Alias";

    // Service (TGSINCPERIODICIDADES)
    /** <code>TGSINCPERIODICIDADES</code> service id. */
    public static final String G_SERV_ID_TGSINCPERIODICIDADES = "IGl_1431700242432628_Alias";
    /** <code>TGSINCPERIODICIDADES</code> service name. */
    public static final String G_SERV_NAME_TGSINCPERIODICIDADES = "TGSINCPERIODICIDADES";
    /** Agents allowed to execute the service TGSINCPERIODICIDADES **/
    public static final String GS_TGSINCPERIODICIDADES_SRVAGENTS = "Admin,SuperAdmin";

    // Service (TGSINC1ESTADOCONTRATO)
    /** <code>TGSINC1ESTADOCONTRATO</code> service id. */
    public static final String G_SERV_ID_TGSINC1ESTADOCONTRATO = "IGl_1431709548544644_Alias";
    /** <code>TGSINC1ESTADOCONTRATO</code> service name. */
    public static final String G_SERV_NAME_TGSINC1ESTADOCONTRATO = "TGSINC1ESTADOCONTRATO";
    /** Agents allowed to execute the service TGSINC1ESTADOCONTRATO **/
    public static final String GS_TGSINC1ESTADOCONTRATO_SRVAGENTS = "";
    /** <code>pt_p_atrCodigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ESTADOCONTRATO_TGSINC1ESTADOCONTRATOPTPATRCODIGO = "pt_p_atrCodigo";
    public static final String GS_ARG_ID_TGSINC1ESTADOCONTRATO_TGSINC1ESTADOCONTRATOPTPATRCODIGO = "IGl_1431709548544644Arg_3_Alias";
    /** <code>pt_p_atrDescripcion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ESTADOCONTRATO_TGSINC1ESTADOCONTRATOPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    public static final String GS_ARG_ID_TGSINC1ESTADOCONTRATO_TGSINC1ESTADOCONTRATOPTPATRDESCRIPCION = "IGl_1431709548544644Arg_4_Alias";

    // Service (TGSINCESTADOSCONTRATO)
    /** <code>TGSINCESTADOSCONTRATO</code> service id. */
    public static final String G_SERV_ID_TGSINCESTADOSCONTRATO = "IGl_1431709679616367_Alias";
    /** <code>TGSINCESTADOSCONTRATO</code> service name. */
    public static final String G_SERV_NAME_TGSINCESTADOSCONTRATO = "TGSINCESTADOSCONTRATO";
    /** Agents allowed to execute the service TGSINCESTADOSCONTRATO **/
    public static final String GS_TGSINCESTADOSCONTRATO_SRVAGENTS = "Admin,SuperAdmin";

    // Service (TGSINC1ESTADOBENEFICIARIO)
    /** <code>TGSINC1ESTADOBENEFICIARIO</code> service id. */
    public static final String G_SERV_ID_TGSINC1ESTADOBENEFICIARIO = "IGl_1431710859264140_Alias";
    /** <code>TGSINC1ESTADOBENEFICIARIO</code> service name. */
    public static final String G_SERV_NAME_TGSINC1ESTADOBENEFICIARIO = "TGSINC1ESTADOBENEFICIARIO";
    /** Agents allowed to execute the service TGSINC1ESTADOBENEFICIARIO **/
    public static final String GS_TGSINC1ESTADOBENEFICIARIO_SRVAGENTS = "";
    /** <code>pt_p_atrCodigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ESTADOBENEFICIARIO_TGSINC1ESTADOBENEFICIARIOPTPATRCODIGO = "pt_p_atrCodigo";
    public static final String GS_ARG_ID_TGSINC1ESTADOBENEFICIARIO_TGSINC1ESTADOBENEFICIARIOPTPATRCODIGO = "IGl_1431710859264140Arg_3_Alias";
    /** <code>pt_p_atrDescripcion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ESTADOBENEFICIARIO_TGSINC1ESTADOBENEFICIARIOPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    public static final String GS_ARG_ID_TGSINC1ESTADOBENEFICIARIO_TGSINC1ESTADOBENEFICIARIOPTPATRDESCRIPCION = "IGl_1431710859264140Arg_4_Alias";

    // Service (TGSINCESTADOSBENEFICIARIO)
    /** <code>TGSINCESTADOSBENEFICIARIO</code> service id. */
    public static final String G_SERV_ID_TGSINCESTADOSBENEFICIARIO = "IGl_1431710990336966_Alias";
    /** <code>TGSINCESTADOSBENEFICIARIO</code> service name. */
    public static final String G_SERV_NAME_TGSINCESTADOSBENEFICIARIO = "TGSINCESTADOSBENEFICIARIO";
    /** Agents allowed to execute the service TGSINCESTADOSBENEFICIARIO **/
    public static final String GS_TGSINCESTADOSBENEFICIARIO_SRVAGENTS = "Admin,SuperAdmin";

    // Service (TGSINC1REGIONAL)
    /** <code>TGSINC1REGIONAL</code> service id. */
    public static final String G_SERV_ID_TGSINC1REGIONAL = "IGl_1431872864256052_Alias";
    /** <code>TGSINC1REGIONAL</code> service name. */
    public static final String G_SERV_NAME_TGSINC1REGIONAL = "TGSINC1REGIONAL";
    /** Agents allowed to execute the service TGSINC1REGIONAL **/
    public static final String GS_TGSINC1REGIONAL_SRVAGENTS = "";
    /** <code>pt_p_atrCodigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1REGIONAL_TGSINC1REGIONALPTPATRCODIGO = "pt_p_atrCodigo";
    public static final String GS_ARG_ID_TGSINC1REGIONAL_TGSINC1REGIONALPTPATRCODIGO = "IGl_1431872864256052Arg_3_Alias";
    /** <code>pt_p_atrDescripcion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1REGIONAL_TGSINC1REGIONALPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    public static final String GS_ARG_ID_TGSINC1REGIONAL_TGSINC1REGIONALPTPATRDESCRIPCION = "IGl_1431872864256052Arg_4_Alias";

    // Service (TGSINCREGIONALES)
    /** <code>TGSINCREGIONALES</code> service id. */
    public static final String G_SERV_ID_TGSINCREGIONALES = "IGl_1431872995328708_Alias";
    /** <code>TGSINCREGIONALES</code> service name. */
    public static final String G_SERV_NAME_TGSINCREGIONALES = "TGSINCREGIONALES";
    /** Agents allowed to execute the service TGSINCREGIONALES **/
    public static final String GS_TGSINCREGIONALES_SRVAGENTS = "Admin,SuperAdmin";

    // Service (TGSINC1SUCURSAL)
    /** <code>TGSINC1SUCURSAL</code> service id. */
    public static final String G_SERV_ID_TGSINC1SUCURSAL = "IGl_1431874437120739_Alias";
    /** <code>TGSINC1SUCURSAL</code> service name. */
    public static final String G_SERV_NAME_TGSINC1SUCURSAL = "TGSINC1SUCURSAL";
    /** Agents allowed to execute the service TGSINC1SUCURSAL **/
    public static final String GS_TGSINC1SUCURSAL_SRVAGENTS = "";
    /** <code>pt_p_atrCodigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1SUCURSAL_TGSINC1SUCURSALPTPATRCODIGO = "pt_p_atrCodigo";
    public static final String GS_ARG_ID_TGSINC1SUCURSAL_TGSINC1SUCURSALPTPATRCODIGO = "IGl_1431874437120739Arg_6_Alias";
    /** <code>pt_p_atrDescripcion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1SUCURSAL_TGSINC1SUCURSALPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    public static final String GS_ARG_ID_TGSINC1SUCURSAL_TGSINC1SUCURSALPTPATRDESCRIPCION = "IGl_1431874437120739Arg_7_Alias";
    /** <code>pt_p_atrCodigoSucursal</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1SUCURSAL_TGSINC1SUCURSALPTPATRCODIGOSUCURSAL = "pt_p_atrCodigoSucursal";
    public static final String GS_ARG_ID_TGSINC1SUCURSAL_TGSINC1SUCURSALPTPATRCODIGOSUCURSAL = "IGl_1431874437120739Arg_8_Alias";

    // Service (TGSINC1SUCURSALAUX)
    /** <code>TGSINC1SUCURSALAUX</code> service id. */
    public static final String G_SERV_ID_TGSINC1SUCURSALAUX = "IGl_1431874568192540_Alias";
    /** <code>TGSINC1SUCURSALAUX</code> service name. */
    public static final String G_SERV_NAME_TGSINC1SUCURSALAUX = "TGSINC1SUCURSALAUX";
    /** Agents allowed to execute the service TGSINC1SUCURSALAUX **/
    public static final String GS_TGSINC1SUCURSALAUX_SRVAGENTS = "";
    /** <code>pt_p_agrRegional</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1SUCURSALAUX_TGSINC1SUCURSALAUXPTPAGRREGIONAL = "pt_p_agrRegional";
    public static final String GS_ARG_ID_TGSINC1SUCURSALAUX_TGSINC1SUCURSALAUXPTPAGRREGIONAL = "IGl_1431874568192540Arg_4_Alias";
    /** <code>pt_p_atrCodigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1SUCURSALAUX_TGSINC1SUCURSALAUXPTPATRCODIGO = "pt_p_atrCodigo";
    public static final String GS_ARG_ID_TGSINC1SUCURSALAUX_TGSINC1SUCURSALAUXPTPATRCODIGO = "IGl_1431874568192540Arg_5_Alias";
    /** <code>pt_p_atrDescripcion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1SUCURSALAUX_TGSINC1SUCURSALAUXPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    public static final String GS_ARG_ID_TGSINC1SUCURSALAUX_TGSINC1SUCURSALAUXPTPATRDESCRIPCION = "IGl_1431874568192540Arg_6_Alias";

    // Service (OGSINCSUCURSALES)
    /** <code>OGSINCSUCURSALES</code> service id. */
    public static final String G_SERV_ID_OGSINCSUCURSALES = "IGl_1431874830336565_Alias";
    /** <code>OGSINCSUCURSALES</code> service name. */
    public static final String G_SERV_NAME_OGSINCSUCURSALES = "OGSINCSUCURSALES";
    /** Agents allowed to execute the service OGSINCSUCURSALES **/
    public static final String GS_OGSINCSUCURSALES_SRVAGENTS = "Admin,SuperAdmin";

    // Service (TGSINC1GRUPOASOCAUX2)
    /** <code>TGSINC1GRUPOASOCAUX2</code> service id. */
    public static final String G_SERV_ID_TGSINC1GRUPOASOCAUX2 = "IGl_1431876534272198_Alias";
    /** <code>TGSINC1GRUPOASOCAUX2</code> service name. */
    public static final String G_SERV_NAME_TGSINC1GRUPOASOCAUX2 = "TGSINC1GRUPOASOCAUX2";
    /** Agents allowed to execute the service TGSINC1GRUPOASOCAUX2 **/
    public static final String GS_TGSINC1GRUPOASOCAUX2_SRVAGENTS = "";
    /** <code>pt_p_agrProducto</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1GRUPOASOCAUX2_TGSINC1GRUPOASOCAUX2PTPAGRPRODUCTO = "pt_p_agrProducto";
    public static final String GS_ARG_ID_TGSINC1GRUPOASOCAUX2_TGSINC1GRUPOASOCAUX2PTPAGRPRODUCTO = "IGl_1431876534272198Arg_9_Alias";
    /** <code>pt_p_agrPlan</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1GRUPOASOCAUX2_TGSINC1GRUPOASOCAUX2PTPAGRPLAN = "pt_p_agrPlan";
    public static final String GS_ARG_ID_TGSINC1GRUPOASOCAUX2_TGSINC1GRUPOASOCAUX2PTPAGRPLAN = "IGl_1431876534272198Arg_10_Alias";
    /** <code>pt_p_atrCodigoLegal</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1GRUPOASOCAUX2_TGSINC1GRUPOASOCAUX2PTPATRCODIGOLEGAL = "pt_p_atrCodigoLegal";
    public static final String GS_ARG_ID_TGSINC1GRUPOASOCAUX2_TGSINC1GRUPOASOCAUX2PTPATRCODIGOLEGAL = "IGl_1431876534272198Arg_12_Alias";
    /** <code>pt_p_atrDescripcion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1GRUPOASOCAUX2_TGSINC1GRUPOASOCAUX2PTPATRDESCRIPCION = "pt_p_atrDescripcion";
    public static final String GS_ARG_ID_TGSINC1GRUPOASOCAUX2_TGSINC1GRUPOASOCAUX2PTPATRDESCRIPCION = "IGl_1431876534272198Arg_13_Alias";
    /** <code>pt_p_atrFIniVigencia</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1GRUPOASOCAUX2_TGSINC1GRUPOASOCAUX2PTPATRFINIVIGENCIA = "pt_p_atrFIniVigencia";
    public static final String GS_ARG_ID_TGSINC1GRUPOASOCAUX2_TGSINC1GRUPOASOCAUX2PTPATRFINIVIGENCIA = "IGl_1431876534272198Arg_14_Alias";
    /** <code>pt_p_atrFFinVigencia</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1GRUPOASOCAUX2_TGSINC1GRUPOASOCAUX2PTPATRFFINVIGENCIA = "pt_p_atrFFinVigencia";
    public static final String GS_ARG_ID_TGSINC1GRUPOASOCAUX2_TGSINC1GRUPOASOCAUX2PTPATRFFINVIGENCIA = "IGl_1431876534272198Arg_15_Alias";
    /** <code>pt_p_atrEstado</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1GRUPOASOCAUX2_TGSINC1GRUPOASOCAUX2PTPATRESTADO = "pt_p_atrEstado";
    public static final String GS_ARG_ID_TGSINC1GRUPOASOCAUX2_TGSINC1GRUPOASOCAUX2PTPATRESTADO = "IGl_1431876534272198Arg_16_Alias";
    /** <code>pt_CodTarifaCORE</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1GRUPOASOCAUX2_TGSINC1GRUPOASOCAUX2PTCODTARIFACORE = "pt_CodTarifaCORE";
    public static final String GS_ARG_ID_TGSINC1GRUPOASOCAUX2_TGSINC1GRUPOASOCAUX2PTCODTARIFACORE = "IGl_1431876534272198Arg_17_Alias";
    /** <code>pt_p_atrCodigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1GRUPOASOCAUX2_TGSINC1GRUPOASOCAUX2PTPATRCODIGO = "pt_p_atrCodigo";
    public static final String GS_ARG_ID_TGSINC1GRUPOASOCAUX2_TGSINC1GRUPOASOCAUX2PTPATRCODIGO = "IGl_1431876534272198Arg_18_Alias";

    // Service (TGSINC1GRUPOASOCAUX)
    /** <code>TGSINC1GRUPOASOCAUX</code> service id. */
    public static final String G_SERV_ID_TGSINC1GRUPOASOCAUX = "IGl_1431877058560088_Alias";
    /** <code>TGSINC1GRUPOASOCAUX</code> service name. */
    public static final String G_SERV_NAME_TGSINC1GRUPOASOCAUX = "TGSINC1GRUPOASOCAUX";
    /** Agents allowed to execute the service TGSINC1GRUPOASOCAUX **/
    public static final String GS_TGSINC1GRUPOASOCAUX_SRVAGENTS = "";
    /** <code>pt_p_agrProducto</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1GRUPOASOCAUX_TGSINC1GRUPOASOCAUXPTPAGRPRODUCTO = "pt_p_agrProducto";
    public static final String GS_ARG_ID_TGSINC1GRUPOASOCAUX_TGSINC1GRUPOASOCAUXPTPAGRPRODUCTO = "IGl_1431877058560088Arg_12_Alias";
    /** <code>pt_p_atrCodigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1GRUPOASOCAUX_TGSINC1GRUPOASOCAUXPTPATRCODIGO = "pt_p_atrCodigo";
    public static final String GS_ARG_ID_TGSINC1GRUPOASOCAUX_TGSINC1GRUPOASOCAUXPTPATRCODIGO = "IGl_1431877058560088Arg_13_Alias";
    /** <code>pt_p_atrCodigoLegal</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1GRUPOASOCAUX_TGSINC1GRUPOASOCAUXPTPATRCODIGOLEGAL = "pt_p_atrCodigoLegal";
    public static final String GS_ARG_ID_TGSINC1GRUPOASOCAUX_TGSINC1GRUPOASOCAUXPTPATRCODIGOLEGAL = "IGl_1431877058560088Arg_14_Alias";
    /** <code>pt_p_atrDescripcion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1GRUPOASOCAUX_TGSINC1GRUPOASOCAUXPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    public static final String GS_ARG_ID_TGSINC1GRUPOASOCAUX_TGSINC1GRUPOASOCAUXPTPATRDESCRIPCION = "IGl_1431877058560088Arg_15_Alias";
    /** <code>pt_p_atrFIniVigencia</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1GRUPOASOCAUX_TGSINC1GRUPOASOCAUXPTPATRFINIVIGENCIA = "pt_p_atrFIniVigencia";
    public static final String GS_ARG_ID_TGSINC1GRUPOASOCAUX_TGSINC1GRUPOASOCAUXPTPATRFINIVIGENCIA = "IGl_1431877058560088Arg_16_Alias";
    /** <code>pt_p_atrFFinVigencia</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1GRUPOASOCAUX_TGSINC1GRUPOASOCAUXPTPATRFFINVIGENCIA = "pt_p_atrFFinVigencia";
    public static final String GS_ARG_ID_TGSINC1GRUPOASOCAUX_TGSINC1GRUPOASOCAUXPTPATRFFINVIGENCIA = "IGl_1431877058560088Arg_17_Alias";
    /** <code>pt_p_atrEstado</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1GRUPOASOCAUX_TGSINC1GRUPOASOCAUXPTPATRESTADO = "pt_p_atrEstado";
    public static final String GS_ARG_ID_TGSINC1GRUPOASOCAUX_TGSINC1GRUPOASOCAUXPTPATRESTADO = "IGl_1431877058560088Arg_18_Alias";
    /** <code>pt_CodTarifaCORE</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1GRUPOASOCAUX_TGSINC1GRUPOASOCAUXPTCODTARIFACORE = "pt_CodTarifaCORE";
    public static final String GS_ARG_ID_TGSINC1GRUPOASOCAUX_TGSINC1GRUPOASOCAUXPTCODTARIFACORE = "IGl_1431877058560088Arg_19_Alias";
    /** <code>pt_p_atrCodigoGA</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1GRUPOASOCAUX_TGSINC1GRUPOASOCAUXPTPATRCODIGOGA = "pt_p_atrCodigoGA";
    public static final String GS_ARG_ID_TGSINC1GRUPOASOCAUX_TGSINC1GRUPOASOCAUXPTPATRCODIGOGA = "IGl_1431877058560088Arg_20_Alias";

    // Service (TGSINC1GRUPOASOC)
    /** <code>TGSINC1GRUPOASOC</code> service id. */
    public static final String G_SERV_ID_TGSINC1GRUPOASOC = "IGl_1431877189632585_Alias";
    /** <code>TGSINC1GRUPOASOC</code> service name. */
    public static final String G_SERV_NAME_TGSINC1GRUPOASOC = "TGSINC1GRUPOASOC";
    /** Agents allowed to execute the service TGSINC1GRUPOASOC **/
    public static final String GS_TGSINC1GRUPOASOC_SRVAGENTS = "SuperAdmin";
    /** <code>pt_p_atrNumero</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1GRUPOASOC_TGSINC1GRUPOASOCPTPATRNUMERO = "pt_p_atrNumero";
    public static final String GS_ARG_ID_TGSINC1GRUPOASOC_TGSINC1GRUPOASOCPTPATRNUMERO = "IGl_1431877189632585Arg_13_Alias";
    /** <code>pt_p_atrCodigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1GRUPOASOC_TGSINC1GRUPOASOCPTPATRCODIGO = "pt_p_atrCodigo";
    public static final String GS_ARG_ID_TGSINC1GRUPOASOC_TGSINC1GRUPOASOCPTPATRCODIGO = "IGl_1431877189632585Arg_14_Alias";
    /** <code>pt_p_atrCodigoLegal</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1GRUPOASOC_TGSINC1GRUPOASOCPTPATRCODIGOLEGAL = "pt_p_atrCodigoLegal";
    public static final String GS_ARG_ID_TGSINC1GRUPOASOC_TGSINC1GRUPOASOCPTPATRCODIGOLEGAL = "IGl_1431877189632585Arg_15_Alias";
    /** <code>pt_p_atrDescripcion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1GRUPOASOC_TGSINC1GRUPOASOCPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    public static final String GS_ARG_ID_TGSINC1GRUPOASOC_TGSINC1GRUPOASOCPTPATRDESCRIPCION = "IGl_1431877189632585Arg_16_Alias";
    /** <code>pt_p_atrFIniVigencia</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1GRUPOASOC_TGSINC1GRUPOASOCPTPATRFINIVIGENCIA = "pt_p_atrFIniVigencia";
    public static final String GS_ARG_ID_TGSINC1GRUPOASOC_TGSINC1GRUPOASOCPTPATRFINIVIGENCIA = "IGl_1431877189632585Arg_17_Alias";
    /** <code>pt_p_atrFFinVigencia</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1GRUPOASOC_TGSINC1GRUPOASOCPTPATRFFINVIGENCIA = "pt_p_atrFFinVigencia";
    public static final String GS_ARG_ID_TGSINC1GRUPOASOC_TGSINC1GRUPOASOCPTPATRFFINVIGENCIA = "IGl_1431877189632585Arg_18_Alias";
    /** <code>pt_p_atrEstado</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1GRUPOASOC_TGSINC1GRUPOASOCPTPATRESTADO = "pt_p_atrEstado";
    public static final String GS_ARG_ID_TGSINC1GRUPOASOC_TGSINC1GRUPOASOCPTPATRESTADO = "IGl_1431877189632585Arg_19_Alias";
    /** <code>pt_CodTarifaCORE</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1GRUPOASOC_TGSINC1GRUPOASOCPTCODTARIFACORE = "pt_CodTarifaCORE";
    public static final String GS_ARG_ID_TGSINC1GRUPOASOC_TGSINC1GRUPOASOCPTCODTARIFACORE = "IGl_1431877189632585Arg_20_Alias";
    /** <code>pt_p_atrCodigoGA</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1GRUPOASOC_TGSINC1GRUPOASOCPTPATRCODIGOGA = "pt_p_atrCodigoGA";
    public static final String GS_ARG_ID_TGSINC1GRUPOASOC_TGSINC1GRUPOASOCPTPATRCODIGOGA = "IGl_1431877189632585Arg_21_Alias";

    // Service (OGSINCGRUPOSASOCIADOS)
    /** <code>OGSINCGRUPOSASOCIADOS</code> service id. */
    public static final String G_SERV_ID_OGSINCGRUPOSASOCIADOS = "IGl_1431877320704354_Alias";
    /** <code>OGSINCGRUPOSASOCIADOS</code> service name. */
    public static final String G_SERV_NAME_OGSINCGRUPOSASOCIADOS = "OGSINCGRUPOSASOCIADOS";
    /** Agents allowed to execute the service OGSINCGRUPOSASOCIADOS **/
    public static final String GS_OGSINCGRUPOSASOCIADOS_SRVAGENTS = "Admin,SuperAdmin";

    // Service (TGSINC1ESTADOCIVIL)
    /** <code>TGSINC1ESTADOCIVIL</code> service id. */
    public static final String G_SERV_ID_TGSINC1ESTADOCIVIL = "IGl_1431881121792256_Alias";
    /** <code>TGSINC1ESTADOCIVIL</code> service name. */
    public static final String G_SERV_NAME_TGSINC1ESTADOCIVIL = "TGSINC1ESTADOCIVIL";
    /** Agents allowed to execute the service TGSINC1ESTADOCIVIL **/
    public static final String GS_TGSINC1ESTADOCIVIL_SRVAGENTS = "";
    /** <code>pt_p_atrCodigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ESTADOCIVIL_TGSINC1ESTADOCIVILPTPATRCODIGO = "pt_p_atrCodigo";
    public static final String GS_ARG_ID_TGSINC1ESTADOCIVIL_TGSINC1ESTADOCIVILPTPATRCODIGO = "IGl_1431881121792256Arg_4_Alias";
    /** <code>pt_p_atrDescripcion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ESTADOCIVIL_TGSINC1ESTADOCIVILPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    public static final String GS_ARG_ID_TGSINC1ESTADOCIVIL_TGSINC1ESTADOCIVILPTPATRDESCRIPCION = "IGl_1431881121792256Arg_5_Alias";
    /** <code>pt_p_atrNombreCorto</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ESTADOCIVIL_TGSINC1ESTADOCIVILPTPATRNOMBRECORTO = "pt_p_atrNombreCorto";
    public static final String GS_ARG_ID_TGSINC1ESTADOCIVIL_TGSINC1ESTADOCIVILPTPATRNOMBRECORTO = "IGl_1431881121792256Arg_6_Alias";

    // Service (TGSINCESTADOSCIVILES)
    /** <code>TGSINCESTADOSCIVILES</code> service id. */
    public static final String G_SERV_ID_TGSINCESTADOSCIVILES = "IGl_1431881252864956_Alias";
    /** <code>TGSINCESTADOSCIVILES</code> service name. */
    public static final String G_SERV_NAME_TGSINCESTADOSCIVILES = "TGSINCESTADOSCIVILES";
    /** Agents allowed to execute the service TGSINCESTADOSCIVILES **/
    public static final String GS_TGSINCESTADOSCIVILES_SRVAGENTS = "Admin,SuperAdmin";

    // Service (TGSINC1DEPARTAMENTO)
    /** <code>TGSINC1DEPARTAMENTO</code> service id. */
    public static final String G_SERV_ID_TGSINC1DEPARTAMENTO = "IGl_1431882170368240_Alias";
    /** <code>TGSINC1DEPARTAMENTO</code> service name. */
    public static final String G_SERV_NAME_TGSINC1DEPARTAMENTO = "TGSINC1DEPARTAMENTO";
    /** Agents allowed to execute the service TGSINC1DEPARTAMENTO **/
    public static final String GS_TGSINC1DEPARTAMENTO_SRVAGENTS = "";
    /** <code>pt_p_atrCodigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1DEPARTAMENTO_TGSINC1DEPARTAMENTOPTPATRCODIGO = "pt_p_atrCodigo";
    public static final String GS_ARG_ID_TGSINC1DEPARTAMENTO_TGSINC1DEPARTAMENTOPTPATRCODIGO = "IGl_1431882170368240Arg_3_Alias";
    /** <code>pt_p_atrDescripcion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1DEPARTAMENTO_TGSINC1DEPARTAMENTOPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    public static final String GS_ARG_ID_TGSINC1DEPARTAMENTO_TGSINC1DEPARTAMENTOPTPATRDESCRIPCION = "IGl_1431882170368240Arg_4_Alias";
    /** <code>pt_p_atrCodigoLegal</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1DEPARTAMENTO_TGSINC1DEPARTAMENTOPTPATRCODIGOLEGAL = "pt_p_atrCodigoLegal";
    public static final String GS_ARG_ID_TGSINC1DEPARTAMENTO_TGSINC1DEPARTAMENTOPTPATRCODIGOLEGAL = "IGl_1431882170368240Arg_5_Alias";

    // Service (TGSINCDEPARTAMENTOS)
    /** <code>TGSINCDEPARTAMENTOS</code> service id. */
    public static final String G_SERV_ID_TGSINCDEPARTAMENTOS = "IGl_1431882301440372_Alias";
    /** <code>TGSINCDEPARTAMENTOS</code> service name. */
    public static final String G_SERV_NAME_TGSINCDEPARTAMENTOS = "TGSINCDEPARTAMENTOS";
    /** Agents allowed to execute the service TGSINCDEPARTAMENTOS **/
    public static final String GS_TGSINCDEPARTAMENTOS_SRVAGENTS = "Admin,SuperAdmin";

    // Service (TGSINC1ASESOR)
    /** <code>TGSINC1ASESOR</code> service id. */
    public static final String G_SERV_ID_TGSINC1ASESOR = "IGl_1431887282176770_Alias";
    /** <code>TGSINC1ASESOR</code> service name. */
    public static final String G_SERV_NAME_TGSINC1ASESOR = "TGSINC1ASESOR";
    /** Agents allowed to execute the service TGSINC1ASESOR **/
    public static final String GS_TGSINC1ASESOR_SRVAGENTS = "Admin,SuperAdmin";
    /** <code>pt_p_atrUsuario</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ASESOR_TGSINC1ASESORPTPATRUSUARIO = "pt_p_atrUsuario";
    public static final String GS_ARG_ID_TGSINC1ASESOR_TGSINC1ASESORPTPATRUSUARIO = "IGl_1431887282176770Arg_12_Alias";
    /** <code>pt_p_atrPrimerNombre</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ASESOR_TGSINC1ASESORPTPATRPRIMERNOMBRE = "pt_p_atrPrimerNombre";
    public static final String GS_ARG_ID_TGSINC1ASESOR_TGSINC1ASESORPTPATRPRIMERNOMBRE = "IGl_1431887282176770Arg_14_Alias";
    /** <code>pt_p_atrSegundoNombre</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ASESOR_TGSINC1ASESORPTPATRSEGUNDONOMBRE = "pt_p_atrSegundoNombre";
    public static final String GS_ARG_ID_TGSINC1ASESOR_TGSINC1ASESORPTPATRSEGUNDONOMBRE = "IGl_1431887282176770Arg_15_Alias";
    /** <code>pt_p_atrPrimerApellido</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ASESOR_TGSINC1ASESORPTPATRPRIMERAPELLIDO = "pt_p_atrPrimerApellido";
    public static final String GS_ARG_ID_TGSINC1ASESOR_TGSINC1ASESORPTPATRPRIMERAPELLIDO = "IGl_1431887282176770Arg_16_Alias";
    /** <code>pt_p_atrSegundoApellido</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ASESOR_TGSINC1ASESORPTPATRSEGUNDOAPELLIDO = "pt_p_atrSegundoApellido";
    public static final String GS_ARG_ID_TGSINC1ASESOR_TGSINC1ASESORPTPATRSEGUNDOAPELLIDO = "IGl_1431887282176770Arg_17_Alias";
    /** <code>pt_p_atrEmail</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ASESOR_TGSINC1ASESORPTPATREMAIL = "pt_p_atrEmail";
    public static final String GS_ARG_ID_TGSINC1ASESOR_TGSINC1ASESORPTPATREMAIL = "IGl_1431887282176770Arg_18_Alias";
    /** <code>pt_p_atrCodigoSucursal</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ASESOR_TGSINC1ASESORPTPATRCODIGOSUCURSAL = "pt_p_atrCodigoSucursal";
    public static final String GS_ARG_ID_TGSINC1ASESOR_TGSINC1ASESORPTPATRCODIGOSUCURSAL = "IGl_1431887282176770Arg_19_Alias";
    /** <code>pCodDirector</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ASESOR_TGSINC1ASESORPCODDIRECTOR = "pCodDirector";
    public static final String GS_ARG_ID_TGSINC1ASESOR_TGSINC1ASESORPCODDIRECTOR = "IGl_1431887282176770Arg_22_Alias";
    /** <code>pTipoIdentificacion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ASESOR_TGSINC1ASESORPTIPOIDENTIFICACION = "pTipoIdentificacion";
    public static final String GS_ARG_ID_TGSINC1ASESOR_TGSINC1ASESORPTIPOIDENTIFICACION = "IGl_1431887282176770Arg_23_Alias";
    /** <code>pNumIdentificacion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ASESOR_TGSINC1ASESORPNUMIDENTIFICACION = "pNumIdentificacion";
    public static final String GS_ARG_ID_TGSINC1ASESOR_TGSINC1ASESORPNUMIDENTIFICACION = "IGl_1431887282176770Arg_24_Alias";
    /** <code>pt_pCanal</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ASESOR_TGSINC1ASESORPTPCANAL = "pt_pCanal";
    public static final String GS_ARG_ID_TGSINC1ASESOR_TGSINC1ASESORPTPCANAL = "IGl_1431887282176770Arg_37_Alias";
    /** <code>pt_pCargo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ASESOR_TGSINC1ASESORPTPCARGO = "pt_pCargo";
    public static final String GS_ARG_ID_TGSINC1ASESOR_TGSINC1ASESORPTPCARGO = "IGl_1431887282176770Arg_38_Alias";
    /** <code>pt_pEstado</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ASESOR_TGSINC1ASESORPTPESTADO = "pt_pEstado";
    public static final String GS_ARG_ID_TGSINC1ASESOR_TGSINC1ASESORPTPESTADO = "IGl_1431887282176770Arg_39_Alias";

    // Service (TGSINC1ASESORAUX)
    /** <code>TGSINC1ASESORAUX</code> service id. */
    public static final String G_SERV_ID_TGSINC1ASESORAUX = "IGl_1431887806464492_Alias";
    /** <code>TGSINC1ASESORAUX</code> service name. */
    public static final String G_SERV_NAME_TGSINC1ASESORAUX = "TGSINC1ASESORAUX";
    /** Agents allowed to execute the service TGSINC1ASESORAUX **/
    public static final String GS_TGSINC1ASESORAUX_SRVAGENTS = "";
    /** <code>pt_p_agrSucursal</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ASESORAUX_TGSINC1ASESORAUXPTPAGRSUCURSAL = "pt_p_agrSucursal";
    public static final String GS_ARG_ID_TGSINC1ASESORAUX_TGSINC1ASESORAUXPTPAGRSUCURSAL = "IGl_1431887806464492Arg_10_Alias";
    /** <code>pt_p_atrUsuario</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ASESORAUX_TGSINC1ASESORAUXPTPATRUSUARIO = "pt_p_atrUsuario";
    public static final String GS_ARG_ID_TGSINC1ASESORAUX_TGSINC1ASESORAUXPTPATRUSUARIO = "IGl_1431887806464492Arg_11_Alias";
    /** <code>pt_p_atrPrimerNombre</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ASESORAUX_TGSINC1ASESORAUXPTPATRPRIMERNOMBRE = "pt_p_atrPrimerNombre";
    public static final String GS_ARG_ID_TGSINC1ASESORAUX_TGSINC1ASESORAUXPTPATRPRIMERNOMBRE = "IGl_1431887806464492Arg_13_Alias";
    /** <code>pt_p_atrSegundoNombre</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ASESORAUX_TGSINC1ASESORAUXPTPATRSEGUNDONOMBRE = "pt_p_atrSegundoNombre";
    public static final String GS_ARG_ID_TGSINC1ASESORAUX_TGSINC1ASESORAUXPTPATRSEGUNDONOMBRE = "IGl_1431887806464492Arg_14_Alias";
    /** <code>pt_p_atrPrimerApellido</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ASESORAUX_TGSINC1ASESORAUXPTPATRPRIMERAPELLIDO = "pt_p_atrPrimerApellido";
    public static final String GS_ARG_ID_TGSINC1ASESORAUX_TGSINC1ASESORAUXPTPATRPRIMERAPELLIDO = "IGl_1431887806464492Arg_15_Alias";
    /** <code>pt_p_atrSegundoApellido</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ASESORAUX_TGSINC1ASESORAUXPTPATRSEGUNDOAPELLIDO = "pt_p_atrSegundoApellido";
    public static final String GS_ARG_ID_TGSINC1ASESORAUX_TGSINC1ASESORAUXPTPATRSEGUNDOAPELLIDO = "IGl_1431887806464492Arg_16_Alias";
    /** <code>pt_p_atrEmail</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ASESORAUX_TGSINC1ASESORAUXPTPATREMAIL = "pt_p_atrEmail";
    public static final String GS_ARG_ID_TGSINC1ASESORAUX_TGSINC1ASESORAUXPTPATREMAIL = "IGl_1431887806464492Arg_17_Alias";
    /** <code>pCodDirector</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ASESORAUX_TGSINC1ASESORAUXPCODDIRECTOR = "pCodDirector";
    public static final String GS_ARG_ID_TGSINC1ASESORAUX_TGSINC1ASESORAUXPCODDIRECTOR = "IGl_1431887806464492Arg_20_Alias";
    /** <code>p_TipoIdentificacion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ASESORAUX_TGSINC1ASESORAUXPTIPOIDENTIFICACION = "p_TipoIdentificacion";
    public static final String GS_ARG_ID_TGSINC1ASESORAUX_TGSINC1ASESORAUXPTIPOIDENTIFICACION = "IGl_1431887806464492Arg_21_Alias";
    /** <code>p_NumIdentificacion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ASESORAUX_TGSINC1ASESORAUXPNUMIDENTIFICACION = "p_NumIdentificacion";
    public static final String GS_ARG_ID_TGSINC1ASESORAUX_TGSINC1ASESORAUXPNUMIDENTIFICACION = "IGl_1431887806464492Arg_22_Alias";
    /** <code>pt_pCanal</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ASESORAUX_TGSINC1ASESORAUXPTPCANAL = "pt_pCanal";
    public static final String GS_ARG_ID_TGSINC1ASESORAUX_TGSINC1ASESORAUXPTPCANAL = "IGl_1431887806464492Arg_32_Alias";
    /** <code>pt_pCargo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ASESORAUX_TGSINC1ASESORAUXPTPCARGO = "pt_pCargo";
    public static final String GS_ARG_ID_TGSINC1ASESORAUX_TGSINC1ASESORAUXPTPCARGO = "IGl_1431887806464492Arg_33_Alias";
    /** <code>pt_pEstado</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ASESORAUX_TGSINC1ASESORAUXPTPESTADO = "pt_pEstado";
    public static final String GS_ARG_ID_TGSINC1ASESORAUX_TGSINC1ASESORAUXPTPESTADO = "IGl_1431887806464492Arg_34_Alias";

    // Service (OGSINCASESORES)
    /** <code>OGSINCASESORES</code> service id. */
    public static final String G_SERV_ID_OGSINCASESORES = "IGl_1431888199680855_Alias";
    /** <code>OGSINCASESORES</code> service name. */
    public static final String G_SERV_NAME_OGSINCASESORES = "OGSINCASESORES";
    /** Agents allowed to execute the service OGSINCASESORES **/
    public static final String GS_OGSINCASESORES_SRVAGENTS = "Admin,SuperAdmin,UsuarioSistemaExterno";
    /** <code>oaMensaje</code> outbound argument id. */
    public static final String GS_ARG_ID_OGSINCASESORES_OGSINCASESORESOAMENSAJE = "IGl_1431888199680855Arg_1_Alias";

    // Service (TGSINC1COMPANIA)
    /** <code>TGSINC1COMPANIA</code> service id. */
    public static final String G_SERV_ID_TGSINC1COMPANIA = "IGl_1431889641472752_Alias";
    /** <code>TGSINC1COMPANIA</code> service name. */
    public static final String G_SERV_NAME_TGSINC1COMPANIA = "TGSINC1COMPANIA";
    /** Agents allowed to execute the service TGSINC1COMPANIA **/
    public static final String GS_TGSINC1COMPANIA_SRVAGENTS = "";
    /** <code>pt_p_atrCodigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1COMPANIA_TGSINC1COMPANIAPTPATRCODIGO = "pt_p_atrCodigo";
    public static final String GS_ARG_ID_TGSINC1COMPANIA_TGSINC1COMPANIAPTPATRCODIGO = "IGl_1431889641472752Arg_4_Alias";
    /** <code>pt_p_atrNombre</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1COMPANIA_TGSINC1COMPANIAPTPATRNOMBRE = "pt_p_atrNombre";
    public static final String GS_ARG_ID_TGSINC1COMPANIA_TGSINC1COMPANIAPTPATRNOMBRE = "IGl_1431889641472752Arg_5_Alias";

    // Service (OGSINCOMPANIAS)
    /** <code>OGSINCOMPANIAS</code> service id. */
    public static final String G_SERV_ID_OGSINCOMPANIAS = "IGl_1431889772544083_Alias";
    /** <code>OGSINCOMPANIAS</code> service name. */
    public static final String G_SERV_NAME_OGSINCOMPANIAS = "OGSINCOMPANIAS";
    /** Agents allowed to execute the service OGSINCOMPANIAS **/
    public static final String GS_OGSINCOMPANIAS_SRVAGENTS = "Admin,SuperAdmin";

    // Service (TGSINC1MUNICIPIO)
    /** <code>TGSINC1MUNICIPIO</code> service id. */
    public static final String G_SERV_ID_TGSINC1MUNICIPIO = "IGl_1431891083264396_Alias";
    /** <code>TGSINC1MUNICIPIO</code> service name. */
    public static final String G_SERV_NAME_TGSINC1MUNICIPIO = "TGSINC1MUNICIPIO";
    /** Agents allowed to execute the service TGSINC1MUNICIPIO **/
    public static final String GS_TGSINC1MUNICIPIO_SRVAGENTS = "SuperAdmin";
    /** <code>pt_p_atrCodigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1MUNICIPIO_TGSINC1MUNICIPIOPTPATRCODIGO = "pt_p_atrCodigo";
    public static final String GS_ARG_ID_TGSINC1MUNICIPIO_TGSINC1MUNICIPIOPTPATRCODIGO = "IGl_1431891083264396Arg_6_Alias";
    /** <code>pt_p_atrDescripcion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1MUNICIPIO_TGSINC1MUNICIPIOPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    public static final String GS_ARG_ID_TGSINC1MUNICIPIO_TGSINC1MUNICIPIOPTPATRDESCRIPCION = "IGl_1431891083264396Arg_7_Alias";
    /** <code>pt_p_atrCodigoLegal</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1MUNICIPIO_TGSINC1MUNICIPIOPTPATRCODIGOLEGAL = "pt_p_atrCodigoLegal";
    public static final String GS_ARG_ID_TGSINC1MUNICIPIO_TGSINC1MUNICIPIOPTPATRCODIGOLEGAL = "IGl_1431891083264396Arg_8_Alias";
    /** <code>pt_p_atrEsValidoEPS</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1MUNICIPIO_TGSINC1MUNICIPIOPTPATRESVALIDOEPS = "pt_p_atrEsValidoEPS";
    public static final String GS_ARG_ID_TGSINC1MUNICIPIO_TGSINC1MUNICIPIOPTPATRESVALIDOEPS = "IGl_1431891083264396Arg_9_Alias";

    // Service (OGSINCMUNICIPIOS)
    /** <code>OGSINCMUNICIPIOS</code> service id. */
    public static final String G_SERV_ID_OGSINCMUNICIPIOS = "IGl_1431891214336411_Alias";
    /** <code>OGSINCMUNICIPIOS</code> service name. */
    public static final String G_SERV_NAME_OGSINCMUNICIPIOS = "OGSINCMUNICIPIOS";
    /** Agents allowed to execute the service OGSINCMUNICIPIOS **/
    public static final String GS_OGSINCMUNICIPIOS_SRVAGENTS = "Admin,SuperAdmin";

    // Service (TGSINC1TIPODIRECCION)
    /** <code>TGSINC1TIPODIRECCION</code> service id. */
    public static final String G_SERV_ID_TGSINC1TIPODIRECCION = "IGl_1431940759552388_Alias";
    /** <code>TGSINC1TIPODIRECCION</code> service name. */
    public static final String G_SERV_NAME_TGSINC1TIPODIRECCION = "TGSINC1TIPODIRECCION";
    /** Agents allowed to execute the service TGSINC1TIPODIRECCION **/
    public static final String GS_TGSINC1TIPODIRECCION_SRVAGENTS = "";
    /** <code>pt_p_atrCodigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1TIPODIRECCION_TGSINC1TIPODIRECCIONPTPATRCODIGO = "pt_p_atrCodigo";
    public static final String GS_ARG_ID_TGSINC1TIPODIRECCION_TGSINC1TIPODIRECCIONPTPATRCODIGO = "IGl_1431940759552388Arg_4_Alias";
    /** <code>pt_p_atrDescripcion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1TIPODIRECCION_TGSINC1TIPODIRECCIONPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    public static final String GS_ARG_ID_TGSINC1TIPODIRECCION_TGSINC1TIPODIRECCIONPTPATRDESCRIPCION = "IGl_1431940759552388Arg_5_Alias";

    // Service (TGSINCTIPOSDIRECCION)
    /** <code>TGSINCTIPOSDIRECCION</code> service id. */
    public static final String G_SERV_ID_TGSINCTIPOSDIRECCION = "IGl_1431940759552592_Alias";
    /** <code>TGSINCTIPOSDIRECCION</code> service name. */
    public static final String G_SERV_NAME_TGSINCTIPOSDIRECCION = "TGSINCTIPOSDIRECCION";
    /** Agents allowed to execute the service TGSINCTIPOSDIRECCION **/
    public static final String GS_TGSINCTIPOSDIRECCION_SRVAGENTS = "Admin,SuperAdmin";

    // Service (TGSINC1ESTADOPERSONA)
    /** <code>TGSINC1ESTADOPERSONA</code> service id. */
    public static final String G_SERV_ID_TGSINC1ESTADOPERSONA = "IGl_1431941283840542_Alias";
    /** <code>TGSINC1ESTADOPERSONA</code> service name. */
    public static final String G_SERV_NAME_TGSINC1ESTADOPERSONA = "TGSINC1ESTADOPERSONA";
    /** Agents allowed to execute the service TGSINC1ESTADOPERSONA **/
    public static final String GS_TGSINC1ESTADOPERSONA_SRVAGENTS = "";
    /** <code>pt_p_atrCodigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ESTADOPERSONA_TGSINC1ESTADOPERSONAPTPATRCODIGO = "pt_p_atrCodigo";
    public static final String GS_ARG_ID_TGSINC1ESTADOPERSONA_TGSINC1ESTADOPERSONAPTPATRCODIGO = "IGl_1431941283840542Arg_5_Alias";
    /** <code>pt_p_atrDescripcion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ESTADOPERSONA_TGSINC1ESTADOPERSONAPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    public static final String GS_ARG_ID_TGSINC1ESTADOPERSONA_TGSINC1ESTADOPERSONAPTPATRDESCRIPCION = "IGl_1431941283840542Arg_6_Alias";

    // Service (TGSINCESTADOSPERSONA)
    /** <code>TGSINCESTADOSPERSONA</code> service id. */
    public static final String G_SERV_ID_TGSINCESTADOSPERSONA = "IGl_1431941414912113_Alias";
    /** <code>TGSINCESTADOSPERSONA</code> service name. */
    public static final String G_SERV_NAME_TGSINCESTADOSPERSONA = "TGSINCESTADOSPERSONA";
    /** Agents allowed to execute the service TGSINCESTADOSPERSONA **/
    public static final String GS_TGSINCESTADOSPERSONA_SRVAGENTS = "Admin,SuperAdmin";

    // Service (TGSINC1FORMAPAGO)
    /** <code>TGSINC1FORMAPAGO</code> service id. */
    public static final String G_SERV_ID_TGSINC1FORMAPAGO = "IGl_1431941939200686_Alias";
    /** <code>TGSINC1FORMAPAGO</code> service name. */
    public static final String G_SERV_NAME_TGSINC1FORMAPAGO = "TGSINC1FORMAPAGO";
    /** Agents allowed to execute the service TGSINC1FORMAPAGO **/
    public static final String GS_TGSINC1FORMAPAGO_SRVAGENTS = "";
    /** <code>pt_p_atrCodigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1FORMAPAGO_TGSINC1FORMAPAGOPTPATRCODIGO = "pt_p_atrCodigo";
    public static final String GS_ARG_ID_TGSINC1FORMAPAGO_TGSINC1FORMAPAGOPTPATRCODIGO = "IGl_1431941939200686Arg_5_Alias";
    /** <code>pt_p_atrDescripcion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1FORMAPAGO_TGSINC1FORMAPAGOPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    public static final String GS_ARG_ID_TGSINC1FORMAPAGO_TGSINC1FORMAPAGOPTPATRDESCRIPCION = "IGl_1431941939200686Arg_6_Alias";

    // Service (TGSINCFORMASPAGO)
    /** <code>TGSINCFORMASPAGO</code> service id. */
    public static final String G_SERV_ID_TGSINCFORMASPAGO = "IGl_1431942070272211_Alias";
    /** <code>TGSINCFORMASPAGO</code> service name. */
    public static final String G_SERV_NAME_TGSINCFORMASPAGO = "TGSINCFORMASPAGO";
    /** Agents allowed to execute the service TGSINCFORMASPAGO **/
    public static final String GS_TGSINCFORMASPAGO_SRVAGENTS = "Admin,SuperAdmin";

    // Service (TGSINC1TIPOIDENTIFICACION)
    /** <code>TGSINC1TIPOIDENTIFICACION</code> service id. */
    public static final String G_SERV_ID_TGSINC1TIPOIDENTIFICACION = "IGl_1431942594560520_Alias";
    /** <code>TGSINC1TIPOIDENTIFICACION</code> service name. */
    public static final String G_SERV_NAME_TGSINC1TIPOIDENTIFICACION = "TGSINC1TIPOIDENTIFICACION";
    /** Agents allowed to execute the service TGSINC1TIPOIDENTIFICACION **/
    public static final String GS_TGSINC1TIPOIDENTIFICACION_SRVAGENTS = "";
    /** <code>pt_p_atrCodigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1TIPOIDENTIFICACION_TGSINC1TIPOIDENTIFICACIONPTPATRCODIGO = "pt_p_atrCodigo";
    public static final String GS_ARG_ID_TGSINC1TIPOIDENTIFICACION_TGSINC1TIPOIDENTIFICACIONPTPATRCODIGO = "IGl_1431942594560520Arg_9_Alias";
    /** <code>pt_p_atrDescripcion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1TIPOIDENTIFICACION_TGSINC1TIPOIDENTIFICACIONPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    public static final String GS_ARG_ID_TGSINC1TIPOIDENTIFICACION_TGSINC1TIPOIDENTIFICACIONPTPATRDESCRIPCION = "IGl_1431942594560520Arg_10_Alias";
    /** <code>pt_p_atrNombreCorto</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1TIPOIDENTIFICACION_TGSINC1TIPOIDENTIFICACIONPTPATRNOMBRECORTO = "pt_p_atrNombreCorto";
    public static final String GS_ARG_ID_TGSINC1TIPOIDENTIFICACION_TGSINC1TIPOIDENTIFICACIONPTPATRNOMBRECORTO = "IGl_1431942594560520Arg_11_Alias";

    // Service (TGSINCTIPOSIDENTIFICACION)
    /** <code>TGSINCTIPOSIDENTIFICACION</code> service id. */
    public static final String G_SERV_ID_TGSINCTIPOSIDENTIFICACION = "IGl_1431942725632508_Alias";
    /** <code>TGSINCTIPOSIDENTIFICACION</code> service name. */
    public static final String G_SERV_NAME_TGSINCTIPOSIDENTIFICACION = "TGSINCTIPOSIDENTIFICACION";
    /** Agents allowed to execute the service TGSINCTIPOSIDENTIFICACION **/
    public static final String GS_TGSINCTIPOSIDENTIFICACION_SRVAGENTS = "Admin,SuperAdmin";

    // Service (TGSINC1EPS)
    /** <code>TGSINC1EPS</code> service id. */
    public static final String G_SERV_ID_TGSINC1EPS = "IGl_1431943118848812_Alias";
    /** <code>TGSINC1EPS</code> service name. */
    public static final String G_SERV_NAME_TGSINC1EPS = "TGSINC1EPS";
    /** Agents allowed to execute the service TGSINC1EPS **/
    public static final String GS_TGSINC1EPS_SRVAGENTS = "";
    /** <code>pt_p_atrCodigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1EPS_TGSINC1EPSPTPATRCODIGO = "pt_p_atrCodigo";
    public static final String GS_ARG_ID_TGSINC1EPS_TGSINC1EPSPTPATRCODIGO = "IGl_1431943118848812Arg_4_Alias";
    /** <code>pt_p_atrDescripcion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1EPS_TGSINC1EPSPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    public static final String GS_ARG_ID_TGSINC1EPS_TGSINC1EPSPTPATRDESCRIPCION = "IGl_1431943118848812Arg_5_Alias";

    // Service (OGSINCEPSS)
    /** <code>OGSINCEPSS</code> service id. */
    public static final String G_SERV_ID_OGSINCEPSS = "IGl_1431943249920923_Alias";
    /** <code>OGSINCEPSS</code> service name. */
    public static final String G_SERV_NAME_OGSINCEPSS = "OGSINCEPSS";
    /** Agents allowed to execute the service OGSINCEPSS **/
    public static final String GS_OGSINCEPSS_SRVAGENTS = "Admin,SuperAdmin";

    // Service (TGSINC1PAIS)
    /** <code>TGSINC1PAIS</code> service id. */
    public static final String G_SERV_ID_TGSINC1PAIS = "IGl_1433001263104317_Alias";
    /** <code>TGSINC1PAIS</code> service name. */
    public static final String G_SERV_NAME_TGSINC1PAIS = "TGSINC1PAIS";
    /** Agents allowed to execute the service TGSINC1PAIS **/
    public static final String GS_TGSINC1PAIS_SRVAGENTS = "";
    /** <code>pt_p_atrCodigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1PAIS_TGSINC1PAISPTPATRCODIGO = "pt_p_atrCodigo";
    public static final String GS_ARG_ID_TGSINC1PAIS_TGSINC1PAISPTPATRCODIGO = "IGl_1433001263104317Arg_3_Alias";
    /** <code>pt_p_atrDescripcion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1PAIS_TGSINC1PAISPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    public static final String GS_ARG_ID_TGSINC1PAIS_TGSINC1PAISPTPATRDESCRIPCION = "IGl_1433001263104317Arg_4_Alias";

    // Service (TGSINCPAISES)
    /** <code>TGSINCPAISES</code> service id. */
    public static final String G_SERV_ID_TGSINCPAISES = "IGl_1433001394176267_Alias";
    /** <code>TGSINCPAISES</code> service name. */
    public static final String G_SERV_NAME_TGSINCPAISES = "TGSINCPAISES";
    /** Agents allowed to execute the service TGSINCPAISES **/
    public static final String GS_TGSINCPAISES_SRVAGENTS = "Admin,SuperAdmin";

    // Service (TGSELECCONTRATOASOC)
    /** <code>TGSELECCONTRATOASOC</code> service id. */
    public static final String G_SERV_ID_TGSELECCONTRATOASOC = "IGl_1433189875712803_Alias";
    /** <code>TGSELECCONTRATOASOC</code> service name. */
    public static final String G_SERV_NAME_TGSELECCONTRATOASOC = "TGSELECCONTRATOASOC";
    /** Agents allowed to execute the service TGSELECCONTRATOASOC **/
    public static final String GS_TGSELECCONTRATOASOC_SRVAGENTS = "Admin,SuperAdmin,Asesor";
    /** <code>p_Solicitud</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSELECCONTRATOASOC_TGSELECCONTRATOASOCPSOLICITUD = "p_Solicitud";
    public static final String GS_ARG_ID_TGSELECCONTRATOASOC_TGSELECCONTRATOASOCPSOLICITUD = "IGl_1433189875712803Arg_1_Alias";
    /** <code>ptNumContrato</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSELECCONTRATOASOC_TGSELECCONTRATOASOCPTNUMCONTRATO = "ptNumContrato";
    public static final String GS_ARG_ID_TGSELECCONTRATOASOC_TGSELECCONTRATOASOCPTNUMCONTRATO = "IGl_1433189875712803Arg_4_Alias";
    /** <code>ptCodLegalProducto</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSELECCONTRATOASOC_TGSELECCONTRATOASOCPTCODLEGALPRODUCTO = "ptCodLegalProducto";
    public static final String GS_ARG_ID_TGSELECCONTRATOASOC_TGSELECCONTRATOASOCPTCODLEGALPRODUCTO = "IGl_1433189875712803Arg_5_Alias";
    /** <code>ptCodLegalPlan</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSELECCONTRATOASOC_TGSELECCONTRATOASOCPTCODLEGALPLAN = "ptCodLegalPlan";
    public static final String GS_ARG_ID_TGSELECCONTRATOASOC_TGSELECCONTRATOASOCPTCODLEGALPLAN = "IGl_1433189875712803Arg_6_Alias";
    /** <code>ptNumFamilia</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSELECCONTRATOASOC_TGSELECCONTRATOASOCPTNUMFAMILIA = "ptNumFamilia";
    public static final String GS_ARG_ID_TGSELECCONTRATOASOC_TGSELECCONTRATOASOCPTNUMFAMILIA = "IGl_1433189875712803Arg_7_Alias";
    /** <code>TGSELECCONTRATOASOC</code> precondition 0 id. */
    public static final String GS_PRE_ID_TGSELECCONTRATOASOC_0 = "IGl_1433189875712803Pre_1_Alias";

    // Service (TGSELECCONTRATOASOCTIT)
    /** <code>TGSELECCONTRATOASOCTIT</code> service id. */
    public static final String G_SERV_ID_TGSELECCONTRATOASOCTIT = "IGl_1433934757888116_Alias";
    /** <code>TGSELECCONTRATOASOCTIT</code> service name. */
    public static final String G_SERV_NAME_TGSELECCONTRATOASOCTIT = "TGSELECCONTRATOASOCTIT";
    /** Agents allowed to execute the service TGSELECCONTRATOASOCTIT **/
    public static final String GS_TGSELECCONTRATOASOCTIT_SRVAGENTS = "Admin,SuperAdmin,Asesor";
    /** <code>pt_p_Solicitud</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSELECCONTRATOASOCTIT_TGSELECCONTRATOASOCTITPTPSOLICITUD = "pt_p_Solicitud";
    public static final String GS_ARG_ID_TGSELECCONTRATOASOCTIT_TGSELECCONTRATOASOCTITPTPSOLICITUD = "IGl_1433934757888116Arg_1_Alias";
    /** <code>ptNumContrato</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSELECCONTRATOASOCTIT_TGSELECCONTRATOASOCTITPTNUMCONTRATO = "ptNumContrato";
    public static final String GS_ARG_ID_TGSELECCONTRATOASOCTIT_TGSELECCONTRATOASOCTITPTNUMCONTRATO = "IGl_1433934757888116Arg_4_Alias";
    /** <code>ptCodLegalProducto</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSELECCONTRATOASOCTIT_TGSELECCONTRATOASOCTITPTCODLEGALPRODUCTO = "ptCodLegalProducto";
    public static final String GS_ARG_ID_TGSELECCONTRATOASOCTIT_TGSELECCONTRATOASOCTITPTCODLEGALPRODUCTO = "IGl_1433934757888116Arg_5_Alias";
    /** <code>ptCodLegalPlan</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSELECCONTRATOASOCTIT_TGSELECCONTRATOASOCTITPTCODLEGALPLAN = "ptCodLegalPlan";
    public static final String GS_ARG_ID_TGSELECCONTRATOASOCTIT_TGSELECCONTRATOASOCTITPTCODLEGALPLAN = "IGl_1433934757888116Arg_6_Alias";
    /** <code>ptNumFamilia</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSELECCONTRATOASOCTIT_TGSELECCONTRATOASOCTITPTNUMFAMILIA = "ptNumFamilia";
    public static final String GS_ARG_ID_TGSELECCONTRATOASOCTIT_TGSELECCONTRATOASOCTITPTNUMFAMILIA = "IGl_1433934757888116Arg_7_Alias";
    /** <code>TGSELECCONTRATOASOCTIT</code> precondition 0 id. */
    public static final String GS_PRE_ID_TGSELECCONTRATOASOCTIT_0 = "IGl_1433934757888116Pre_1_Alias";

    // Service (TGUPDATEUSUARIOSDECORE)
    /** <code>TGUPDATEUSUARIOSDECORE</code> service id. */
    public static final String G_SERV_ID_TGUPDATEUSUARIOSDECORE = "IGl_1434048921600417_Alias";
    /** <code>TGUPDATEUSUARIOSDECORE</code> service name. */
    public static final String G_SERV_NAME_TGUPDATEUSUARIOSDECORE = "TGUPDATEUSUARIOSDECORE";
    /** Agents allowed to execute the service TGUPDATEUSUARIOSDECORE **/
    public static final String GS_TGUPDATEUSUARIOSDECORE_SRVAGENTS = "";
    /** <code>p_Usuario</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGUPDATEUSUARIOSDECORE_TGUPDATEUSUARIOSDECOREPUSUARIO = "p_Usuario";
    public static final String GS_ARG_ID_TGUPDATEUSUARIOSDECORE_TGUPDATEUSUARIOSDECOREPUSUARIO = "IGl_1434048921600417Arg_1_Alias";
    /** <code>p_ContratoC</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGUPDATEUSUARIOSDECORE_TGUPDATEUSUARIOSDECOREPCONTRATOC = "p_ContratoC";
    public static final String GS_ARG_ID_TGUPDATEUSUARIOSDECORE_TGUPDATEUSUARIOSDECOREPCONTRATOC = "IGl_1434048921600417Arg_2_Alias";

    // Service (TGUPDATEPREEXISTENCIAS)
    /** <code>TGUPDATEPREEXISTENCIAS</code> service id. */
    public static final String G_SERV_ID_TGUPDATEPREEXISTENCIAS = "IGl_1434051018752823_Alias";
    /** <code>TGUPDATEPREEXISTENCIAS</code> service name. */
    public static final String G_SERV_NAME_TGUPDATEPREEXISTENCIAS = "TGUPDATEPREEXISTENCIAS";
    /** Agents allowed to execute the service TGUPDATEPREEXISTENCIAS **/
    public static final String GS_TGUPDATEPREEXISTENCIAS_SRVAGENTS = "";
    /** <code>p_Usuario</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGUPDATEPREEXISTENCIAS_TGUPDATEPREEXISTENCIASPUSUARIO = "p_Usuario";
    public static final String GS_ARG_ID_TGUPDATEPREEXISTENCIAS_TGUPDATEPREEXISTENCIASPUSUARIO = "IGl_1434051018752823Arg_1_Alias";
    /** <code>p_BeneficiarioC</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGUPDATEPREEXISTENCIAS_TGUPDATEPREEXISTENCIASPBENEFICIARIOC = "p_BeneficiarioC";
    public static final String GS_ARG_ID_TGUPDATEPREEXISTENCIAS_TGUPDATEPREEXISTENCIASPBENEFICIARIOC = "IGl_1434051018752823Arg_2_Alias";

    // Service (OGSOLICITUDFISICALEER)
    /** <code>OGSOLICITUDFISICALEER</code> service id. */
    public static final String G_SERV_ID_OGSOLICITUDFISICALEER = "IGl_1436519235584156_Alias";
    /** <code>OGSOLICITUDFISICALEER</code> service name. */
    public static final String G_SERV_NAME_OGSOLICITUDFISICALEER = "OGSOLICITUDFISICALEER";
    /** Agents allowed to execute the service OGSOLICITUDFISICALEER **/
    public static final String GS_OGSOLICITUDFISICALEER_SRVAGENTS = "Admin,SuperAdmin";
    /** <code>p_Archivo</code> inbound argument id. */
    public static final String GS_ARG_NAME_OGSOLICITUDFISICALEER_OGSOLICITUDFISICALEERPARCHIVO = "p_Archivo";
    public static final String GS_ARG_ID_OGSOLICITUDFISICALEER_OGSOLICITUDFISICALEERPARCHIVO = "IGl_1436519235584156Arg_1_Alias";
    /** <code>ps_ArchivoResultado</code> outbound argument id. */
    public static final String GS_ARG_ID_OGSOLICITUDFISICALEER_OGSOLICITUDFISICALEERPSARCHIVORESULTADO = "IGl_1436519235584156Arg_2_Alias";
    /** <code>ps_NombreArchivoResultado</code> outbound argument id. */
    public static final String GS_ARG_ID_OGSOLICITUDFISICALEER_OGSOLICITUDFISICALEERPSNOMBREARCHIVORESULTADO = "IGl_1436519235584156Arg_3_Alias";
    /** <code>ps_Resultado</code> outbound argument id. */
    public static final String GS_ARG_ID_OGSOLICITUDFISICALEER_OGSOLICITUDFISICALEERPSRESULTADO = "IGl_1436519235584156Arg_4_Alias";

    // Service (TGSOLICITUDFISICACARGAR)
    /** <code>TGSOLICITUDFISICACARGAR</code> service id. */
    public static final String G_SERV_ID_TGSOLICITUDFISICACARGAR = "IGl_1436519497728128_Alias";
    /** <code>TGSOLICITUDFISICACARGAR</code> service name. */
    public static final String G_SERV_NAME_TGSOLICITUDFISICACARGAR = "TGSOLICITUDFISICACARGAR";
    /** Agents allowed to execute the service TGSOLICITUDFISICACARGAR **/
    public static final String GS_TGSOLICITUDFISICACARGAR_SRVAGENTS = "Admin,SuperAdmin";
    /** <code>p_CLProducto</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSOLICITUDFISICACARGAR_TGSOLICITUDFISICACARGARPCLPRODUCTO = "p_CLProducto";
    public static final String GS_ARG_ID_TGSOLICITUDFISICACARGAR_TGSOLICITUDFISICACARGARPCLPRODUCTO = "IGl_1436519497728128Arg_1_Alias";
    /** <code>pt_p_atrLOGIN</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSOLICITUDFISICACARGAR_TGSOLICITUDFISICACARGARPTPATRLOGIN = "pt_p_atrLOGIN";
    public static final String GS_ARG_ID_TGSOLICITUDFISICACARGAR_TGSOLICITUDFISICACARGARPTPATRLOGIN = "IGl_1436519497728128Arg_7_Alias";
    /** <code>pt_p_NUMERO_SOLICITUD</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSOLICITUDFISICACARGAR_TGSOLICITUDFISICACARGARPTPNUMEROSOLICITUD = "pt_p_NUMERO_SOLICITUD";
    public static final String GS_ARG_ID_TGSOLICITUDFISICACARGAR_TGSOLICITUDFISICACARGARPTPNUMEROSOLICITUD = "IGl_1436519497728128Arg_8_Alias";
    /** <code>pt_p_SW_ESTADO</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSOLICITUDFISICACARGAR_TGSOLICITUDFISICACARGARPTPSWESTADO = "pt_p_SW_ESTADO";
    public static final String GS_ARG_ID_TGSOLICITUDFISICACARGAR_TGSOLICITUDFISICACARGARPTPSWESTADO = "IGl_1436519497728128Arg_9_Alias";
    /** <code>pt_p_FECHA_ESTADO</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSOLICITUDFISICACARGAR_TGSOLICITUDFISICACARGARPTPFECHAESTADO = "pt_p_FECHA_ESTADO";
    public static final String GS_ARG_ID_TGSOLICITUDFISICACARGAR_TGSOLICITUDFISICACARGARPTPFECHAESTADO = "IGl_1436519497728128Arg_10_Alias";

    // Service (TGENFILELEGALIZACOM)
    /** <code>TGENFILELEGALIZACOM</code> service id. */
    public static final String G_SERV_ID_TGENFILELEGALIZACOM = "IGl_1436549251072158_Alias";
    /** <code>TGENFILELEGALIZACOM</code> service name. */
    public static final String G_SERV_NAME_TGENFILELEGALIZACOM = "TGENFILELEGALIZACOM";
    /** Agents allowed to execute the service TGENFILELEGALIZACOM **/
    public static final String GS_TGENFILELEGALIZACOM_SRVAGENTS = "Admin,SuperAdmin,Afiliaciones";
    /** <code>p_FInicio</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGENFILELEGALIZACOM_TGENFILELEGALIZACOMPFINICIO = "p_FInicio";
    public static final String GS_ARG_ID_TGENFILELEGALIZACOM_TGENFILELEGALIZACOMPFINICIO = "IGl_1436549251072158Arg_1_Alias";
    /** <code>p_FFin</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGENFILELEGALIZACOM_TGENFILELEGALIZACOMPFFIN = "p_FFin";
    public static final String GS_ARG_ID_TGENFILELEGALIZACOM_TGENFILELEGALIZACOMPFFIN = "IGl_1436549251072158Arg_2_Alias";
    /** <code>ps_ArchivoResultado</code> outbound argument id. */
    public static final String GS_ARG_ID_TGENFILELEGALIZACOM_TGENFILELEGALIZACOMPSARCHIVORESULTADO = "IGl_1436549251072158Arg_3_Alias";
    /** <code>ps_NombreArchivoResultado</code> outbound argument id. */
    public static final String GS_ARG_ID_TGENFILELEGALIZACOM_TGENFILELEGALIZACOMPSNOMBREARCHIVORESULTADO = "IGl_1436549251072158Arg_4_Alias";
    /** <code>ps_Resultado</code> outbound argument id. */
    public static final String GS_ARG_ID_TGENFILELEGALIZACOM_TGENFILELEGALIZACOMPSRESULTADO = "IGl_1436549251072158Arg_5_Alias";

    // Service (TMARCARGENERADAENCOR)
    /** <code>TMARCARGENERADAENCOR</code> service id. */
    public static final String G_SERV_ID_TMARCARGENERADAENCOR = "IGl_1437660872704199_Alias";
    /** <code>TMARCARGENERADAENCOR</code> service name. */
    public static final String G_SERV_NAME_TMARCARGENERADAENCOR = "TMARCARGENERADAENCOR";
    /** Agents allowed to execute the service TMARCARGENERADAENCOR **/
    public static final String GS_TMARCARGENERADAENCOR_SRVAGENTS = "Admin,SuperAdmin,Asesor";
    /** <code>pt_p_SolicitudAE</code> inbound argument id. */
    public static final String GS_ARG_NAME_TMARCARGENERADAENCOR_TMARCARGENERADAENCORPTPSOLICITUDAE = "pt_p_SolicitudAE";
    public static final String GS_ARG_ID_TMARCARGENERADAENCOR_TMARCARGENERADAENCORPTPSOLICITUDAE = "IGl_1437660872704199Arg_1_Alias";
    /** <code>pt_ps_NumContrato</code> inbound argument id. */
    public static final String GS_ARG_NAME_TMARCARGENERADAENCOR_TMARCARGENERADAENCORPTPSNUMCONTRATO = "pt_ps_NumContrato";
    public static final String GS_ARG_ID_TMARCARGENERADAENCOR_TMARCARGENERADAENCORPTPSNUMCONTRATO = "IGl_1437660872704199Arg_2_Alias";
    /** <code>pt_ps_ContratoC</code> inbound argument id. */
    public static final String GS_ARG_NAME_TMARCARGENERADAENCOR_TMARCARGENERADAENCORPTPSCONTRATOC = "pt_ps_ContratoC";
    public static final String GS_ARG_ID_TMARCARGENERADAENCOR_TMARCARGENERADAENCORPTPSCONTRATOC = "IGl_1437660872704199Arg_3_Alias";

    // Service (TGSINC1ENTIDADFIN)
    /** <code>TGSINC1ENTIDADFIN</code> service id. */
    public static final String G_SERV_ID_TGSINC1ENTIDADFIN = "IGl_1439799312384185_Alias";
    /** <code>TGSINC1ENTIDADFIN</code> service name. */
    public static final String G_SERV_NAME_TGSINC1ENTIDADFIN = "TGSINC1ENTIDADFIN";
    /** Agents allowed to execute the service TGSINC1ENTIDADFIN **/
    public static final String GS_TGSINC1ENTIDADFIN_SRVAGENTS = "";
    /** <code>pt_p_atrCodigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ENTIDADFIN_TGSINC1ENTIDADFINPTPATRCODIGO = "pt_p_atrCodigo";
    public static final String GS_ARG_ID_TGSINC1ENTIDADFIN_TGSINC1ENTIDADFINPTPATRCODIGO = "IGl_1439799312384185Arg_1_Alias";
    /** <code>pt_p_atrDescripcion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1ENTIDADFIN_TGSINC1ENTIDADFINPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    public static final String GS_ARG_ID_TGSINC1ENTIDADFIN_TGSINC1ENTIDADFINPTPATRDESCRIPCION = "IGl_1439799312384185Arg_2_Alias";

    // Service (TGSINC1TIPOENTIDAD)
    /** <code>TGSINC1TIPOENTIDAD</code> service id. */
    public static final String G_SERV_ID_TGSINC1TIPOENTIDAD = "IGl_1439799443456949_Alias";
    /** <code>TGSINC1TIPOENTIDAD</code> service name. */
    public static final String G_SERV_NAME_TGSINC1TIPOENTIDAD = "TGSINC1TIPOENTIDAD";
    /** Agents allowed to execute the service TGSINC1TIPOENTIDAD **/
    public static final String GS_TGSINC1TIPOENTIDAD_SRVAGENTS = "";
    /** <code>pt_p_atrCodigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1TIPOENTIDAD_TGSINC1TIPOENTIDADPTPATRCODIGO = "pt_p_atrCodigo";
    public static final String GS_ARG_ID_TGSINC1TIPOENTIDAD_TGSINC1TIPOENTIDADPTPATRCODIGO = "IGl_1439799443456949Arg_1_Alias";
    /** <code>pt_p_atrDescripcion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1TIPOENTIDAD_TGSINC1TIPOENTIDADPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    public static final String GS_ARG_ID_TGSINC1TIPOENTIDAD_TGSINC1TIPOENTIDADPTPATRDESCRIPCION = "IGl_1439799443456949Arg_2_Alias";

    // Service (TGSINC1TIPOINSTITUCION)
    /** <code>TGSINC1TIPOINSTITUCION</code> service id. */
    public static final String G_SERV_ID_TGSINC1TIPOINSTITUCION = "IGl_1439799443456401_Alias";
    /** <code>TGSINC1TIPOINSTITUCION</code> service name. */
    public static final String G_SERV_NAME_TGSINC1TIPOINSTITUCION = "TGSINC1TIPOINSTITUCION";
    /** Agents allowed to execute the service TGSINC1TIPOINSTITUCION **/
    public static final String GS_TGSINC1TIPOINSTITUCION_SRVAGENTS = "";
    /** <code>pt_p_atrCodigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1TIPOINSTITUCION_TGSINC1TIPOINSTITUCIONPTPATRCODIGO = "pt_p_atrCodigo";
    public static final String GS_ARG_ID_TGSINC1TIPOINSTITUCION_TGSINC1TIPOINSTITUCIONPTPATRCODIGO = "IGl_1439799443456401Arg_1_Alias";
    /** <code>pt_p_atrNombre</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1TIPOINSTITUCION_TGSINC1TIPOINSTITUCIONPTPATRNOMBRE = "pt_p_atrNombre";
    public static final String GS_ARG_ID_TGSINC1TIPOINSTITUCION_TGSINC1TIPOINSTITUCIONPTPATRNOMBRE = "IGl_1439799443456401Arg_2_Alias";

    // Service (TGSINC1TIPOSUCURSAL)
    /** <code>TGSINC1TIPOSUCURSAL</code> service id. */
    public static final String G_SERV_ID_TGSINC1TIPOSUCURSAL = "IGl_1439799574528878_Alias";
    /** <code>TGSINC1TIPOSUCURSAL</code> service name. */
    public static final String G_SERV_NAME_TGSINC1TIPOSUCURSAL = "TGSINC1TIPOSUCURSAL";
    /** Agents allowed to execute the service TGSINC1TIPOSUCURSAL **/
    public static final String GS_TGSINC1TIPOSUCURSAL_SRVAGENTS = "";
    /** <code>pt_p_atrCodigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1TIPOSUCURSAL_TGSINC1TIPOSUCURSALPTPATRCODIGO = "pt_p_atrCodigo";
    public static final String GS_ARG_ID_TGSINC1TIPOSUCURSAL_TGSINC1TIPOSUCURSALPTPATRCODIGO = "IGl_1439799574528878Arg_1_Alias";
    /** <code>pt_p_atrDescripcion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1TIPOSUCURSAL_TGSINC1TIPOSUCURSALPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    public static final String GS_ARG_ID_TGSINC1TIPOSUCURSAL_TGSINC1TIPOSUCURSALPTPATRDESCRIPCION = "IGl_1439799574528878Arg_2_Alias";

    // Service (TGSINCENTIDADESFIN)
    /** <code>TGSINCENTIDADESFIN</code> service id. */
    public static final String G_SERV_ID_TGSINCENTIDADESFIN = "IGl_1439799705600484_Alias";
    /** <code>TGSINCENTIDADESFIN</code> service name. */
    public static final String G_SERV_NAME_TGSINCENTIDADESFIN = "TGSINCENTIDADESFIN";
    /** Agents allowed to execute the service TGSINCENTIDADESFIN **/
    public static final String GS_TGSINCENTIDADESFIN_SRVAGENTS = "Admin,SuperAdmin";

    // Service (TGSINCTIPOSDEENTIDAD)
    /** <code>TGSINCTIPOSDEENTIDAD</code> service id. */
    public static final String G_SERV_ID_TGSINCTIPOSDEENTIDAD = "IGl_1439799967744820_Alias";
    /** <code>TGSINCTIPOSDEENTIDAD</code> service name. */
    public static final String G_SERV_NAME_TGSINCTIPOSDEENTIDAD = "TGSINCTIPOSDEENTIDAD";
    /** Agents allowed to execute the service TGSINCTIPOSDEENTIDAD **/
    public static final String GS_TGSINCTIPOSDEENTIDAD_SRVAGENTS = "Admin,SuperAdmin";

    // Service (TGSINCTIPOSINSTITUCION)
    /** <code>TGSINCTIPOSINSTITUCION</code> service id. */
    public static final String G_SERV_ID_TGSINCTIPOSINSTITUCION = "IGl_1439800098816306_Alias";
    /** <code>TGSINCTIPOSINSTITUCION</code> service name. */
    public static final String G_SERV_NAME_TGSINCTIPOSINSTITUCION = "TGSINCTIPOSINSTITUCION";
    /** Agents allowed to execute the service TGSINCTIPOSINSTITUCION **/
    public static final String GS_TGSINCTIPOSINSTITUCION_SRVAGENTS = "Admin,SuperAdmin";

    // Service (TGSINCTIPOSSUCURSAL)
    /** <code>TGSINCTIPOSSUCURSAL</code> service id. */
    public static final String G_SERV_ID_TGSINCTIPOSSUCURSAL = "IGl_1439800229888478_Alias";
    /** <code>TGSINCTIPOSSUCURSAL</code> service name. */
    public static final String G_SERV_NAME_TGSINCTIPOSSUCURSAL = "TGSINCTIPOSSUCURSAL";
    /** Agents allowed to execute the service TGSINCTIPOSSUCURSAL **/
    public static final String GS_TGSINCTIPOSSUCURSAL_SRVAGENTS = "Admin,SuperAdmin";

    // Service (TGVERIFICARUSUARIO)
    /** <code>TGVERIFICARUSUARIO</code> service id. */
    public static final String G_SERV_ID_TGVERIFICARUSUARIO = "IGl_1439802195968753_Alias";
    /** <code>TGVERIFICARUSUARIO</code> service name. */
    public static final String G_SERV_NAME_TGVERIFICARUSUARIO = "TGVERIFICARUSUARIO";
    /** Agents allowed to execute the service TGVERIFICARUSUARIO **/
    public static final String GS_TGVERIFICARUSUARIO_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    /** <code>pt_p_agrRol</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGVERIFICARUSUARIO_TGVERIFICARUSUARIOPTPAGRROL = "pt_p_agrRol";
    public static final String GS_ARG_ID_TGVERIFICARUSUARIO_TGVERIFICARUSUARIOPTPAGRROL = "IGl_1439802195968753Arg_1_Alias";
    /** <code>pt_p_atrUsuario</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGVERIFICARUSUARIO_TGVERIFICARUSUARIOPTPATRUSUARIO = "pt_p_atrUsuario";
    public static final String GS_ARG_ID_TGVERIFICARUSUARIO_TGVERIFICARUSUARIOPTPATRUSUARIO = "IGl_1439802195968753Arg_2_Alias";
    /** <code>pPrimerNombre</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGVERIFICARUSUARIO_TGVERIFICARUSUARIOPPRIMERNOMBRE = "pPrimerNombre";
    public static final String GS_ARG_ID_TGVERIFICARUSUARIO_TGVERIFICARUSUARIOPPRIMERNOMBRE = "IGl_1439802195968753Arg_13_Alias";
    /** <code>pSegundoNombre</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGVERIFICARUSUARIO_TGVERIFICARUSUARIOPSEGUNDONOMBRE = "pSegundoNombre";
    public static final String GS_ARG_ID_TGVERIFICARUSUARIO_TGVERIFICARUSUARIOPSEGUNDONOMBRE = "IGl_1439802195968753Arg_14_Alias";
    /** <code>pPrimerApellido</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGVERIFICARUSUARIO_TGVERIFICARUSUARIOPPRIMERAPELLIDO = "pPrimerApellido";
    public static final String GS_ARG_ID_TGVERIFICARUSUARIO_TGVERIFICARUSUARIOPPRIMERAPELLIDO = "IGl_1439802195968753Arg_15_Alias";
    /** <code>pSegundoApellido</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGVERIFICARUSUARIO_TGVERIFICARUSUARIOPSEGUNDOAPELLIDO = "pSegundoApellido";
    public static final String GS_ARG_ID_TGVERIFICARUSUARIO_TGVERIFICARUSUARIOPSEGUNDOAPELLIDO = "IGl_1439802195968753Arg_16_Alias";
    /** <code>pEmail</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGVERIFICARUSUARIO_TGVERIFICARUSUARIOPEMAIL = "pEmail";
    public static final String GS_ARG_ID_TGVERIFICARUSUARIO_TGVERIFICARUSUARIOPEMAIL = "IGl_1439802195968753Arg_17_Alias";

    // Service (TGCREARTARIFA)
    /** <code>TGCREARTARIFA</code> service id. */
    public static final String G_SERV_ID_TGCREARTARIFA = "IGl_1445874368512966_Alias";
    /** <code>TGCREARTARIFA</code> service name. */
    public static final String G_SERV_NAME_TGCREARTARIFA = "TGCREARTARIFA";
    /** Agents allowed to execute the service TGCREARTARIFA **/
    public static final String GS_TGCREARTARIFA_SRVAGENTS = "Admin,SuperAdmin";
    /** <code>pProducto</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGCREARTARIFA_TGCREARTARIFAPPRODUCTO = "pProducto";
    public static final String GS_ARG_ID_TGCREARTARIFA_TGCREARTARIFAPPRODUCTO = "IGl_1445874368512966Arg_1_Alias";
    /** <code>pPlan</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGCREARTARIFA_TGCREARTARIFAPPLAN = "pPlan";
    public static final String GS_ARG_ID_TGCREARTARIFA_TGCREARTARIFAPPLAN = "IGl_1445874368512966Arg_2_Alias";
    /** <code>pTipoContrato</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGCREARTARIFA_TGCREARTARIFAPTIPOCONTRATO = "pTipoContrato";
    public static final String GS_ARG_ID_TGCREARTARIFA_TGCREARTARIFAPTIPOCONTRATO = "IGl_1445874368512966Arg_3_Alias";
    /** <code>pCodigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGCREARTARIFA_TGCREARTARIFAPCODIGO = "pCodigo";
    public static final String GS_ARG_ID_TGCREARTARIFA_TGCREARTARIFAPCODIGO = "IGl_1445874368512966Arg_4_Alias";

    // Service (TGELIMINARTARIFA)
    /** <code>TGELIMINARTARIFA</code> service id. */
    public static final String G_SERV_ID_TGELIMINARTARIFA = "IGl_1445875023872887_Alias";
    /** <code>TGELIMINARTARIFA</code> service name. */
    public static final String G_SERV_NAME_TGELIMINARTARIFA = "TGELIMINARTARIFA";
    /** Agents allowed to execute the service TGELIMINARTARIFA **/
    public static final String GS_TGELIMINARTARIFA_SRVAGENTS = "Admin,SuperAdmin";
    /** <code>pTarifa</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGELIMINARTARIFA_TGELIMINARTARIFAPTARIFA = "pTarifa";
    public static final String GS_ARG_ID_TGELIMINARTARIFA_TGELIMINARTARIFAPTARIFA = "IGl_1445875023872887Arg_1_Alias";

    // Service (TGADDUSUARIODECONT)
    /** <code>TGADDUSUARIODECONT</code> service id. */
    public static final String G_SERV_ID_TGADDUSUARIODECONT = "IGl_1460124647424387_Alias";
    /** <code>TGADDUSUARIODECONT</code> service name. */
    public static final String G_SERV_NAME_TGADDUSUARIODECONT = "TGADDUSUARIODECONT";
    /** Agents allowed to execute the service TGADDUSUARIODECONT **/
    public static final String GS_TGADDUSUARIODECONT_SRVAGENTS = "";
    /** <code>pt_p_agrTipoIdentificacion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPAGRTIPOIDENTIFICACION = "pt_p_agrTipoIdentificacion";
    public static final String GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPAGRTIPOIDENTIFICACION = "IGl_1460124647424387Arg_1_Alias";
    /** <code>pt_p_agrDepartamentoNacimiento</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPAGRDEPARTAMENTONACIMIENTO = "pt_p_agrDepartamentoNacimiento";
    public static final String GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPAGRDEPARTAMENTONACIMIENTO = "IGl_1460124647424387Arg_2_Alias";
    /** <code>pt_p_agrMunicipioNacimiento</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPAGRMUNICIPIONACIMIENTO = "pt_p_agrMunicipioNacimiento";
    public static final String GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPAGRMUNICIPIONACIMIENTO = "IGl_1460124647424387Arg_3_Alias";
    /** <code>pt_p_agrEstadoCivil</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPAGRESTADOCIVIL = "pt_p_agrEstadoCivil";
    public static final String GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPAGRESTADOCIVIL = "IGl_1460124647424387Arg_4_Alias";
    /** <code>pt_p_atrNumIdentificacion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRNUMIDENTIFICACION = "pt_p_atrNumIdentificacion";
    public static final String GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRNUMIDENTIFICACION = "IGl_1460124647424387Arg_5_Alias";
    /** <code>pt_p_atrPrimerNombre</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRPRIMERNOMBRE = "pt_p_atrPrimerNombre";
    public static final String GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRPRIMERNOMBRE = "IGl_1460124647424387Arg_6_Alias";
    /** <code>pt_p_atrSegundoNombre</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRSEGUNDONOMBRE = "pt_p_atrSegundoNombre";
    public static final String GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRSEGUNDONOMBRE = "IGl_1460124647424387Arg_7_Alias";
    /** <code>pt_p_atrPrimerApellido</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRPRIMERAPELLIDO = "pt_p_atrPrimerApellido";
    public static final String GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRPRIMERAPELLIDO = "IGl_1460124647424387Arg_8_Alias";
    /** <code>pt_p_atrSegundoApellido</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRSEGUNDOAPELLIDO = "pt_p_atrSegundoApellido";
    public static final String GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRSEGUNDOAPELLIDO = "IGl_1460124647424387Arg_9_Alias";
    /** <code>pt_p_atrFechaNacimiento</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRFECHANACIMIENTO = "pt_p_atrFechaNacimiento";
    public static final String GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRFECHANACIMIENTO = "IGl_1460124647424387Arg_10_Alias";
    /** <code>pt_p_atrGenero</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRGENERO = "pt_p_atrGenero";
    public static final String GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRGENERO = "IGl_1460124647424387Arg_11_Alias";
    /** <code>pt_p_atrIndicadorExtranjero</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRINDICADOREXTRANJERO = "pt_p_atrIndicadorExtranjero";
    public static final String GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRINDICADOREXTRANJERO = "IGl_1460124647424387Arg_12_Alias";
    /** <code>pt_p_atrTelefonoFijo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRTELEFONOFIJO = "pt_p_atrTelefonoFijo";
    public static final String GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRTELEFONOFIJO = "IGl_1460124647424387Arg_13_Alias";
    /** <code>pt_p_atrTelefonoCelular</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRTELEFONOCELULAR = "pt_p_atrTelefonoCelular";
    public static final String GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRTELEFONOCELULAR = "IGl_1460124647424387Arg_14_Alias";
    /** <code>pt_p_atrCorreoElectronico</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRCORREOELECTRONICO = "pt_p_atrCorreoElectronico";
    public static final String GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRCORREOELECTRONICO = "IGl_1460124647424387Arg_15_Alias";
    /** <code>pt_p_agrDepartamento</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPAGRDEPARTAMENTO = "pt_p_agrDepartamento";
    public static final String GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPAGRDEPARTAMENTO = "IGl_1460124647424387Arg_16_Alias";
    /** <code>pt_p_agrMunicipio</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPAGRMUNICIPIO = "pt_p_agrMunicipio";
    public static final String GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPAGRMUNICIPIO = "IGl_1460124647424387Arg_17_Alias";
    /** <code>pt_p_atrDireccionCompleta</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRDIRECCIONCOMPLETA = "pt_p_atrDireccionCompleta";
    public static final String GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRDIRECCIONCOMPLETA = "IGl_1460124647424387Arg_18_Alias";
    /** <code>pt_p_atrRural</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRRURAL = "pt_p_atrRural";
    public static final String GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRRURAL = "IGl_1460124647424387Arg_19_Alias";
    /** <code>pt_p_Codigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPCODIGO = "pt_p_Codigo";
    public static final String GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPCODIGO = "IGl_1460124647424387Arg_20_Alias";
    /** <code>pt_p_TieneEPSSanitas</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPTIENEEPSSANITAS = "pt_p_TieneEPSSanitas";
    public static final String GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPTIENEEPSSANITAS = "IGl_1460124647424387Arg_21_Alias";
    /** <code>pt_p_RechazadoAfiliacion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPRECHAZADOAFILIACION = "pt_p_RechazadoAfiliacion";
    public static final String GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPRECHAZADOAFILIACION = "IGl_1460124647424387Arg_22_Alias";
    /** <code>pt_p_agrPais</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPAGRPAIS = "pt_p_agrPais";
    public static final String GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPAGRPAIS = "IGl_1460124647424387Arg_23_Alias";
    /** <code>pt_p_agrSolicitud</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPAGRSOLICITUD = "pt_p_agrSolicitud";
    public static final String GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPAGRSOLICITUD = "IGl_1460124647424387Arg_24_Alias";
    /** <code>pt_p_agrParentesco</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPAGRPARENTESCO = "pt_p_agrParentesco";
    public static final String GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPAGRPARENTESCO = "IGl_1460124647424387Arg_25_Alias";
    /** <code>pt_p_atrBebeGestante</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRBEBEGESTANTE = "pt_p_atrBebeGestante";
    public static final String GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRBEBEGESTANTE = "IGl_1460124647424387Arg_26_Alias";
    /** <code>pt_p_atrcodigoBancoRep</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRCODIGOBANCOREP = "pt_p_atrcodigoBancoRep";
    public static final String GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRCODIGOBANCOREP = "IGl_1460124647424387Arg_27_Alias";
    /** <code>pt_ptParaContratante</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPTPARACONTRATANTE = "pt_ptParaContratante";
    public static final String GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPTPARACONTRATANTE = "IGl_1460124647424387Arg_28_Alias";

    // Service (OGSINCAGENTESXPROD)
    /** <code>OGSINCAGENTESXPROD</code> service id. */
    public static final String G_SERV_ID_OGSINCAGENTESXPROD = "IGl_1460563476480126_Alias";
    /** <code>OGSINCAGENTESXPROD</code> service name. */
    public static final String G_SERV_NAME_OGSINCAGENTESXPROD = "OGSINCAGENTESXPROD";
    /** Agents allowed to execute the service OGSINCAGENTESXPROD **/
    public static final String GS_OGSINCAGENTESXPROD_SRVAGENTS = "Admin,SuperAdmin";

    // Service (TGSINC1AGENTEXPROD)
    /** <code>TGSINC1AGENTEXPROD</code> service id. */
    public static final String G_SERV_ID_TGSINC1AGENTEXPROD = "IGl_1460563607552988_Alias";
    /** <code>TGSINC1AGENTEXPROD</code> service name. */
    public static final String G_SERV_NAME_TGSINC1AGENTEXPROD = "TGSINC1AGENTEXPROD";
    /** Agents allowed to execute the service TGSINC1AGENTEXPROD **/
    public static final String GS_TGSINC1AGENTEXPROD_SRVAGENTS = "Admin,SuperAdmin";
    /** <code>pProducto</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1AGENTEXPROD_TGSINC1AGENTEXPRODPPRODUCTO = "pProducto";
    public static final String GS_ARG_ID_TGSINC1AGENTEXPROD_TGSINC1AGENTEXPRODPPRODUCTO = "IGl_1460563607552988Arg_1_Alias";
    /** <code>pt_p_atrFechaInicio</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1AGENTEXPROD_TGSINC1AGENTEXPRODPTPATRFECHAINICIO = "pt_p_atrFechaInicio";
    public static final String GS_ARG_ID_TGSINC1AGENTEXPROD_TGSINC1AGENTEXPRODPTPATRFECHAINICIO = "IGl_1460563607552988Arg_5_Alias";
    /** <code>pt_p_atrFechaFin</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1AGENTEXPROD_TGSINC1AGENTEXPRODPTPATRFECHAFIN = "pt_p_atrFechaFin";
    public static final String GS_ARG_ID_TGSINC1AGENTEXPROD_TGSINC1AGENTEXPRODPTPATRFECHAFIN = "IGl_1460563607552988Arg_6_Alias";
    /** <code>pt_p_Asesor</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1AGENTEXPROD_TGSINC1AGENTEXPRODPTPASESOR = "pt_p_Asesor";
    public static final String GS_ARG_ID_TGSINC1AGENTEXPROD_TGSINC1AGENTEXPRODPTPASESOR = "IGl_1460563607552988Arg_7_Alias";
    /** <code>pCodigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1AGENTEXPROD_TGSINC1AGENTEXPRODPCODIGO = "pCodigo";
    public static final String GS_ARG_ID_TGSINC1AGENTEXPROD_TGSINC1AGENTEXPRODPCODIGO = "IGl_1460563607552988Arg_8_Alias";

    // Service (TGSINC1AGENTEXPRODAUX)
    /** <code>TGSINC1AGENTEXPRODAUX</code> service id. */
    public static final String G_SERV_ID_TGSINC1AGENTEXPRODAUX = "IGl_1460563607552522_Alias";
    /** <code>TGSINC1AGENTEXPRODAUX</code> service name. */
    public static final String G_SERV_NAME_TGSINC1AGENTEXPRODAUX = "TGSINC1AGENTEXPRODAUX";
    /** Agents allowed to execute the service TGSINC1AGENTEXPRODAUX **/
    public static final String GS_TGSINC1AGENTEXPRODAUX_SRVAGENTS = "Admin,SuperAdmin";
    /** <code>pt_p_agrProducto</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1AGENTEXPRODAUX_TGSINC1AGENTEXPRODAUXPTPAGRPRODUCTO = "pt_p_agrProducto";
    public static final String GS_ARG_ID_TGSINC1AGENTEXPRODAUX_TGSINC1AGENTEXPRODAUXPTPAGRPRODUCTO = "IGl_1460563607552522Arg_1_Alias";
    /** <code>pt_p_agrAsesor</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1AGENTEXPRODAUX_TGSINC1AGENTEXPRODAUXPTPAGRASESOR = "pt_p_agrAsesor";
    public static final String GS_ARG_ID_TGSINC1AGENTEXPRODAUX_TGSINC1AGENTEXPRODAUXPTPAGRASESOR = "IGl_1460563607552522Arg_2_Alias";
    /** <code>pt_p_atrCodigo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1AGENTEXPRODAUX_TGSINC1AGENTEXPRODAUXPTPATRCODIGO = "pt_p_atrCodigo";
    public static final String GS_ARG_ID_TGSINC1AGENTEXPRODAUX_TGSINC1AGENTEXPRODAUXPTPATRCODIGO = "IGl_1460563607552522Arg_3_Alias";
    /** <code>pt_p_atrFechaInicio</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1AGENTEXPRODAUX_TGSINC1AGENTEXPRODAUXPTPATRFECHAINICIO = "pt_p_atrFechaInicio";
    public static final String GS_ARG_ID_TGSINC1AGENTEXPRODAUX_TGSINC1AGENTEXPRODAUXPTPATRFECHAINICIO = "IGl_1460563607552522Arg_4_Alias";
    /** <code>pt_p_atrFechaFin</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSINC1AGENTEXPRODAUX_TGSINC1AGENTEXPRODAUXPTPATRFECHAFIN = "pt_p_atrFechaFin";
    public static final String GS_ARG_ID_TGSINC1AGENTEXPRODAUX_TGSINC1AGENTEXPRODAUXPTPATRFECHAFIN = "IGl_1460563607552522Arg_5_Alias";

    // Service (OGENERARSOLICITUD2)
    /** <code>OGENERARSOLICITUD2</code> service id. */
    public static final String G_SERV_ID_OGENERARSOLICITUD2 = "IGl_1462185885696764_Alias";
    /** <code>OGENERARSOLICITUD2</code> service name. */
    public static final String G_SERV_NAME_OGENERARSOLICITUD2 = "OGENERARSOLICITUD2";
    /** Agents allowed to execute the service OGENERARSOLICITUD2 **/
    public static final String GS_OGENERARSOLICITUD2_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,MesaDeApoyo";
    /** <code>pt_p_SolicitudAE</code> inbound argument id. */
    public static final String GS_ARG_NAME_OGENERARSOLICITUD2_OGENERARSOLICITUD2PTPSOLICITUDAE = "pt_p_SolicitudAE";
    public static final String GS_ARG_ID_OGENERARSOLICITUD2_OGENERARSOLICITUD2PTPSOLICITUDAE = "IGl_1462185885696764Arg_1_Alias";
    /** <code>pt_ps_NumSolicitud</code> outbound argument id. */
    public static final String GS_ARG_ID_OGENERARSOLICITUD2_OGENERARSOLICITUD2PTPSNUMSOLICITUD = "IGl_1462185885696764Arg_2_Alias";
    /** <code>pt_ps_ErrorWS</code> outbound argument id. */
    public static final String GS_ARG_ID_OGENERARSOLICITUD2_OGENERARSOLICITUD2PTPSERRORWS = "IGl_1462185885696764Arg_8_Alias";
    /** <code>psError</code> outbound argument id. */
    public static final String GS_ARG_ID_OGENERARSOLICITUD2_OGENERARSOLICITUD2PSERROR = "IGl_1462185885696764Arg_11_Alias";
    /** <code>OGENERARSOLICITUD2</code> precondition 0 id. */
    public static final String GS_PRE_ID_OGENERARSOLICITUD2_0 = "IGl_1462185885696764Pre_14_Alias";
    /** <code>OGENERARSOLICITUD2</code> precondition 1 id. */
    public static final String GS_PRE_ID_OGENERARSOLICITUD2_1 = "IGl_1462185885696764Pre_15_Alias";
    /** <code>OGENERARSOLICITUD2</code> precondition 2 id. */
    public static final String GS_PRE_ID_OGENERARSOLICITUD2_2 = "IGl_1462185885696764Pre_12_Alias";
    /** <code>OGENERARSOLICITUD2</code> precondition 3 id. */
    public static final String GS_PRE_ID_OGENERARSOLICITUD2_3 = "IGl_1462185885696764Pre_13_Alias";
    /** <code>OGENERARSOLICITUD2</code> precondition 4 id. */
    public static final String GS_PRE_ID_OGENERARSOLICITUD2_4 = "IGl_1462185885696764Pre_16_Alias";

    // Service (TGCREARPERSONACORE)
    /** <code>TGCREARPERSONACORE</code> service id. */
    public static final String G_SERV_ID_TGCREARPERSONACORE = "IGl_1462195191808103_Alias";
    /** <code>TGCREARPERSONACORE</code> service name. */
    public static final String G_SERV_NAME_TGCREARPERSONACORE = "TGCREARPERSONACORE";
    /** Agents allowed to execute the service TGCREARPERSONACORE **/
    public static final String GS_TGCREARPERSONACORE_SRVAGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones";
    /** <code>ptPersona</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGCREARPERSONACORE_TGCREARPERSONACOREPTPERSONA = "ptPersona";
    public static final String GS_ARG_ID_TGCREARPERSONACORE_TGCREARPERSONACOREPTPERSONA = "IGl_1462195191808103Arg_1_Alias";
    /** <code>ptProtDatos</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGCREARPERSONACORE_TGCREARPERSONACOREPTPROTDATOS = "ptProtDatos";
    public static final String GS_ARG_ID_TGCREARPERSONACORE_TGCREARPERSONACOREPTPROTDATOS = "IGl_1462195191808103Arg_2_Alias";
    /** <code>psSalida</code> outbound argument id. */
    public static final String GS_ARG_ID_TGCREARPERSONACORE_TGCREARPERSONACOREPSSALIDA = "IGl_1462195191808103Arg_3_Alias";

    // Service (TGACTPERSONAENCORE)
    /** <code>TGACTPERSONAENCORE</code> service id. */
    public static final String G_SERV_ID_TGACTPERSONAENCORE = "IGl_1462202138624625_Alias";
    /** <code>TGACTPERSONAENCORE</code> service name. */
    public static final String G_SERV_NAME_TGACTPERSONAENCORE = "TGACTPERSONAENCORE";
    /** Agents allowed to execute the service TGACTPERSONAENCORE **/
    public static final String GS_TGACTPERSONAENCORE_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones";
    /** <code>ptPersona</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGACTPERSONAENCORE_TGACTPERSONAENCOREPTPERSONA = "ptPersona";
    public static final String GS_ARG_ID_TGACTPERSONAENCORE_TGACTPERSONAENCOREPTPERSONA = "IGl_1462202138624625Arg_1_Alias";
    /** <code>ptPrtoDatos</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGACTPERSONAENCORE_TGACTPERSONAENCOREPTPRTODATOS = "ptPrtoDatos";
    public static final String GS_ARG_ID_TGACTPERSONAENCORE_TGACTPERSONAENCOREPTPRTODATOS = "IGl_1462202138624625Arg_2_Alias";
    /** <code>ptSolicitud</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGACTPERSONAENCORE_TGACTPERSONAENCOREPTSOLICITUD = "ptSolicitud";
    public static final String GS_ARG_ID_TGACTPERSONAENCORE_TGACTPERSONAENCOREPTSOLICITUD = "IGl_1462202138624625Arg_4_Alias";
    /** <code>psSalida</code> outbound argument id. */
    public static final String GS_ARG_ID_TGACTPERSONAENCORE_TGACTPERSONAENCOREPSSALIDA = "IGl_1462202138624625Arg_3_Alias";

    // Service (TGPOSPROCESS1ASESOR)
    /** <code>TGPOSPROCESS1ASESOR</code> service id. */
    public static final String G_SERV_ID_TGPOSPROCESS1ASESOR = "IGl_1462443573248682_Alias";
    /** <code>TGPOSPROCESS1ASESOR</code> service name. */
    public static final String G_SERV_NAME_TGPOSPROCESS1ASESOR = "TGPOSPROCESS1ASESOR";
    /** Agents allowed to execute the service TGPOSPROCESS1ASESOR **/
    public static final String GS_TGPOSPROCESS1ASESOR_SRVAGENTS = "";
    /** <code>p_Usuario</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGPOSPROCESS1ASESOR_TGPOSPROCESS1ASESORPUSUARIO = "p_Usuario";
    public static final String GS_ARG_ID_TGPOSPROCESS1ASESOR_TGPOSPROCESS1ASESORPUSUARIO = "IGl_1462443573248682Arg_1_Alias";
    /** <code>p_EsDirector</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGPOSPROCESS1ASESOR_TGPOSPROCESS1ASESORPESDIRECTOR = "p_EsDirector";
    public static final String GS_ARG_ID_TGPOSPROCESS1ASESOR_TGPOSPROCESS1ASESORPESDIRECTOR = "IGl_1462443573248682Arg_2_Alias";
    /** <code>p_Rol</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGPOSPROCESS1ASESOR_TGPOSPROCESS1ASESORPROL = "p_Rol";
    public static final String GS_ARG_ID_TGPOSPROCESS1ASESOR_TGPOSPROCESS1ASESORPROL = "IGl_1462443573248682Arg_3_Alias";

    // Service (TGPOSPROCESARASESORES)
    /** <code>TGPOSPROCESARASESORES</code> service id. */
    public static final String G_SERV_ID_TGPOSPROCESARASESORES = "IGl_1462445670400401_Alias";
    /** <code>TGPOSPROCESARASESORES</code> service name. */
    public static final String G_SERV_NAME_TGPOSPROCESARASESORES = "TGPOSPROCESARASESORES";
    /** Agents allowed to execute the service TGPOSPROCESARASESORES **/
    public static final String GS_TGPOSPROCESARASESORES_SRVAGENTS = "Admin,SuperAdmin";

    // Service (TCREARAGENTE)
    /** <code>TCREARAGENTE</code> service id. */
    public static final String G_SERV_ID_TCREARAGENTE = "IGl_1462447112192088_Alias";
    /** <code>TCREARAGENTE</code> service name. */
    public static final String G_SERV_NAME_TCREARAGENTE = "TCREARAGENTE";
    /** Agents allowed to execute the service TCREARAGENTE **/
    public static final String GS_TCREARAGENTE_SRVAGENTS = "Admin,SuperAdmin";
    /** <code>pt_p_agrRol</code> inbound argument id. */
    public static final String GS_ARG_NAME_TCREARAGENTE_TCREARAGENTEPTPAGRROL = "pt_p_agrRol";
    public static final String GS_ARG_ID_TCREARAGENTE_TCREARAGENTEPTPAGRROL = "IGl_1462447112192088Arg_1_Alias";
    /** <code>pt_p_atrUsuario</code> inbound argument id. */
    public static final String GS_ARG_NAME_TCREARAGENTE_TCREARAGENTEPTPATRUSUARIO = "pt_p_atrUsuario";
    public static final String GS_ARG_ID_TCREARAGENTE_TCREARAGENTEPTPATRUSUARIO = "IGl_1462447112192088Arg_2_Alias";
    /** <code>pt_p_atrPrimerNombre</code> inbound argument id. */
    public static final String GS_ARG_NAME_TCREARAGENTE_TCREARAGENTEPTPATRPRIMERNOMBRE = "pt_p_atrPrimerNombre";
    public static final String GS_ARG_ID_TCREARAGENTE_TCREARAGENTEPTPATRPRIMERNOMBRE = "IGl_1462447112192088Arg_3_Alias";
    /** <code>pt_p_atrSegundoNombre</code> inbound argument id. */
    public static final String GS_ARG_NAME_TCREARAGENTE_TCREARAGENTEPTPATRSEGUNDONOMBRE = "pt_p_atrSegundoNombre";
    public static final String GS_ARG_ID_TCREARAGENTE_TCREARAGENTEPTPATRSEGUNDONOMBRE = "IGl_1462447112192088Arg_4_Alias";
    /** <code>pt_p_atrPrimerApellido</code> inbound argument id. */
    public static final String GS_ARG_NAME_TCREARAGENTE_TCREARAGENTEPTPATRPRIMERAPELLIDO = "pt_p_atrPrimerApellido";
    public static final String GS_ARG_ID_TCREARAGENTE_TCREARAGENTEPTPATRPRIMERAPELLIDO = "IGl_1462447112192088Arg_5_Alias";
    /** <code>pt_p_atrSegundoApellido</code> inbound argument id. */
    public static final String GS_ARG_NAME_TCREARAGENTE_TCREARAGENTEPTPATRSEGUNDOAPELLIDO = "pt_p_atrSegundoApellido";
    public static final String GS_ARG_ID_TCREARAGENTE_TCREARAGENTEPTPATRSEGUNDOAPELLIDO = "IGl_1462447112192088Arg_6_Alias";
    /** <code>pt_p_agrSucursal</code> inbound argument id. */
    public static final String GS_ARG_NAME_TCREARAGENTE_TCREARAGENTEPTPAGRSUCURSAL = "pt_p_agrSucursal";
    public static final String GS_ARG_ID_TCREARAGENTE_TCREARAGENTEPTPAGRSUCURSAL = "IGl_1462447112192088Arg_8_Alias";
    /** <code>pt_p_atrUsuarioLDAP</code> inbound argument id. */
    public static final String GS_ARG_NAME_TCREARAGENTE_TCREARAGENTEPTPATRUSUARIOLDAP = "pt_p_atrUsuarioLDAP";
    public static final String GS_ARG_ID_TCREARAGENTE_TCREARAGENTEPTPATRUSUARIOLDAP = "IGl_1462447112192088Arg_9_Alias";
    /** <code>pt_p_atrEmail</code> inbound argument id. */
    public static final String GS_ARG_NAME_TCREARAGENTE_TCREARAGENTEPTPATREMAIL = "pt_p_atrEmail";
    public static final String GS_ARG_ID_TCREARAGENTE_TCREARAGENTEPTPATREMAIL = "IGl_1462447112192088Arg_10_Alias";
    /** <code>pt_p_agrRegional</code> inbound argument id. */
    public static final String GS_ARG_NAME_TCREARAGENTE_TCREARAGENTEPTPAGRREGIONAL = "pt_p_agrRegional";
    public static final String GS_ARG_ID_TCREARAGENTE_TCREARAGENTEPTPAGRREGIONAL = "IGl_1462447112192088Arg_11_Alias";
    /** <code>TCREARAGENTE</code> precondition 0 id. */
    public static final String GS_PRE_ID_TCREARAGENTE_0 = "IGl_1462447112192088Pre_1_Alias";
    /** <code>TCREARAGENTE</code> precondition 1 id. */
    public static final String GS_PRE_ID_TCREARAGENTE_1 = "IGl_1462447112192088Pre_2_Alias";
    /** <code>TCREARAGENTE</code> precondition 2 id. */
    public static final String GS_PRE_ID_TCREARAGENTE_2 = "IGl_1462447112192088Pre_3_Alias";

    // Service (TMODIFICARAGENTE)
    /** <code>TMODIFICARAGENTE</code> service id. */
    public static final String G_SERV_ID_TMODIFICARAGENTE = "IGl_1462447243264368_Alias";
    /** <code>TMODIFICARAGENTE</code> service name. */
    public static final String G_SERV_NAME_TMODIFICARAGENTE = "TMODIFICARAGENTE";
    /** Agents allowed to execute the service TMODIFICARAGENTE **/
    public static final String GS_TMODIFICARAGENTE_SRVAGENTS = "Admin,SuperAdmin";
    /** <code>pt_p_thisAgente</code> inbound argument id. */
    public static final String GS_ARG_NAME_TMODIFICARAGENTE_TMODIFICARAGENTEPTPTHISAGENTE = "pt_p_thisAgente";
    public static final String GS_ARG_ID_TMODIFICARAGENTE_TMODIFICARAGENTEPTPTHISAGENTE = "IGl_1462447243264368Arg_1_Alias";
    /** <code>pt_p_PrimerNombre</code> inbound argument id. */
    public static final String GS_ARG_NAME_TMODIFICARAGENTE_TMODIFICARAGENTEPTPPRIMERNOMBRE = "pt_p_PrimerNombre";
    public static final String GS_ARG_ID_TMODIFICARAGENTE_TMODIFICARAGENTEPTPPRIMERNOMBRE = "IGl_1462447243264368Arg_2_Alias";
    /** <code>pt_p_SegundoNombre</code> inbound argument id. */
    public static final String GS_ARG_NAME_TMODIFICARAGENTE_TMODIFICARAGENTEPTPSEGUNDONOMBRE = "pt_p_SegundoNombre";
    public static final String GS_ARG_ID_TMODIFICARAGENTE_TMODIFICARAGENTEPTPSEGUNDONOMBRE = "IGl_1462447243264368Arg_3_Alias";
    /** <code>pt_p_PrimerApellido</code> inbound argument id. */
    public static final String GS_ARG_NAME_TMODIFICARAGENTE_TMODIFICARAGENTEPTPPRIMERAPELLIDO = "pt_p_PrimerApellido";
    public static final String GS_ARG_ID_TMODIFICARAGENTE_TMODIFICARAGENTEPTPPRIMERAPELLIDO = "IGl_1462447243264368Arg_4_Alias";
    /** <code>pt_p_SegundoApellido</code> inbound argument id. */
    public static final String GS_ARG_NAME_TMODIFICARAGENTE_TMODIFICARAGENTEPTPSEGUNDOAPELLIDO = "pt_p_SegundoApellido";
    public static final String GS_ARG_ID_TMODIFICARAGENTE_TMODIFICARAGENTEPTPSEGUNDOAPELLIDO = "IGl_1462447243264368Arg_5_Alias";
    /** <code>pt_NuevoRol</code> inbound argument id. */
    public static final String GS_ARG_NAME_TMODIFICARAGENTE_TMODIFICARAGENTEPTNUEVOROL = "pt_NuevoRol";
    public static final String GS_ARG_ID_TMODIFICARAGENTE_TMODIFICARAGENTEPTNUEVOROL = "IGl_1462447243264368Arg_6_Alias";
    /** <code>pt_p_atrUsuarioLDAP</code> inbound argument id. */
    public static final String GS_ARG_NAME_TMODIFICARAGENTE_TMODIFICARAGENTEPTPATRUSUARIOLDAP = "pt_p_atrUsuarioLDAP";
    public static final String GS_ARG_ID_TMODIFICARAGENTE_TMODIFICARAGENTEPTPATRUSUARIOLDAP = "IGl_1462447243264368Arg_7_Alias";
    /** <code>pt_p_atrEmail</code> inbound argument id. */
    public static final String GS_ARG_NAME_TMODIFICARAGENTE_TMODIFICARAGENTEPTPATREMAIL = "pt_p_atrEmail";
    public static final String GS_ARG_ID_TMODIFICARAGENTE_TMODIFICARAGENTEPTPATREMAIL = "IGl_1462447243264368Arg_8_Alias";
    /** <code>pt_p_agrRegional</code> inbound argument id. */
    public static final String GS_ARG_NAME_TMODIFICARAGENTE_TMODIFICARAGENTEPTPAGRREGIONAL = "pt_p_agrRegional";
    public static final String GS_ARG_ID_TMODIFICARAGENTE_TMODIFICARAGENTEPTPAGRREGIONAL = "IGl_1462447243264368Arg_9_Alias";
    /** <code>TMODIFICARAGENTE</code> precondition 0 id. */
    public static final String GS_PRE_ID_TMODIFICARAGENTE_0 = "IGl_1462447243264368Pre_1_Alias";
    /** <code>TMODIFICARAGENTE</code> precondition 1 id. */
    public static final String GS_PRE_ID_TMODIFICARAGENTE_1 = "IGl_1462447243264368Pre_2_Alias";
    /** <code>TMODIFICARAGENTE</code> precondition 2 id. */
    public static final String GS_PRE_ID_TMODIFICARAGENTE_2 = "IGl_1462447243264368Pre_3_Alias";

    // Service (TGCREARCONTRATOCORE)
    /** <code>TGCREARCONTRATOCORE</code> service id. */
    public static final String G_SERV_ID_TGCREARCONTRATOCORE = "IGl_1471434326016281_Alias";
    /** <code>TGCREARCONTRATOCORE</code> service name. */
    public static final String G_SERV_NAME_TGCREARCONTRATOCORE = "TGCREARCONTRATOCORE";
    /** Agents allowed to execute the service TGCREARCONTRATOCORE **/
    public static final String GS_TGCREARCONTRATOCORE_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones";
    /** <code>ptSolicitud</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGCREARCONTRATOCORE_TGCREARCONTRATOCOREPTSOLICITUD = "ptSolicitud";
    public static final String GS_ARG_ID_TGCREARCONTRATOCORE_TGCREARCONTRATOCOREPTSOLICITUD = "IGl_1471434326016281Arg_1_Alias";
    /** <code>psError</code> outbound argument id. */
    public static final String GS_ARG_ID_TGCREARCONTRATOCORE_TGCREARCONTRATOCOREPSERROR = "IGl_1471434326016281Arg_6_Alias";

    // Service (TGINCLUSIONCONTRATOCORE)
    /** <code>TGINCLUSIONCONTRATOCORE</code> service id. */
    public static final String G_SERV_ID_TGINCLUSIONCONTRATOCORE = "IGl_1471435112448913_Alias";
    /** <code>TGINCLUSIONCONTRATOCORE</code> service name. */
    public static final String G_SERV_NAME_TGINCLUSIONCONTRATOCORE = "TGINCLUSIONCONTRATOCORE";
    /** Agents allowed to execute the service TGINCLUSIONCONTRATOCORE **/
    public static final String GS_TGINCLUSIONCONTRATOCORE_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones";
    /** <code>ptSolicitud</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGINCLUSIONCONTRATOCORE_TGINCLUSIONCONTRATOCOREPTSOLICITUD = "ptSolicitud";
    public static final String GS_ARG_ID_TGINCLUSIONCONTRATOCORE_TGINCLUSIONCONTRATOCOREPTSOLICITUD = "IGl_1471435112448913Arg_1_Alias";
    /** <code>psError</code> outbound argument id. */
    public static final String GS_ARG_ID_TGINCLUSIONCONTRATOCORE_TGINCLUSIONCONTRATOCOREPSERROR = "IGl_1471435112448913Arg_5_Alias";

    // Service (TGNOTIFICARCREAR)
    /** <code>TGNOTIFICARCREAR</code> service id. */
    public static final String G_SERV_ID_TGNOTIFICARCREAR = "IGl_1473869250560546_Alias";
    /** <code>TGNOTIFICARCREAR</code> service name. */
    public static final String G_SERV_NAME_TGNOTIFICARCREAR = "TGNOTIFICARCREAR";
    /** Agents allowed to execute the service TGNOTIFICARCREAR **/
    public static final String GS_TGNOTIFICARCREAR_SRVAGENTS = "SuperAdmin,UsuarioSistemaExterno";
    /** <code>ptDatosContrato</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGNOTIFICARCREAR_TGNOTIFICARCREARPTDATOSCONTRATO = "ptDatosContrato";
    public static final String GS_ARG_ID_TGNOTIFICARCREAR_TGNOTIFICARCREARPTDATOSCONTRATO = "IGl_1473869250560546Arg_1_Alias";

    // Service (TGNOTIFICARINCLUSION)
    /** <code>TGNOTIFICARINCLUSION</code> service id. */
    public static final String G_SERV_ID_TGNOTIFICARINCLUSION = "IGl_1473869381632355_Alias";
    /** <code>TGNOTIFICARINCLUSION</code> service name. */
    public static final String G_SERV_NAME_TGNOTIFICARINCLUSION = "TGNOTIFICARINCLUSION";
    /** Agents allowed to execute the service TGNOTIFICARINCLUSION **/
    public static final String GS_TGNOTIFICARINCLUSION_SRVAGENTS = "SuperAdmin,UsuarioSistemaExterno";
    /** <code>ptDatosInclusion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGNOTIFICARINCLUSION_TGNOTIFICARINCLUSIONPTDATOSINCLUSION = "ptDatosInclusion";
    public static final String GS_ARG_ID_TGNOTIFICARINCLUSION_TGNOTIFICARINCLUSIONPTDATOSINCLUSION = "IGl_1473869381632355Arg_1_Alias";

    // Service (TGNOTIFICARANULAR)
    /** <code>TGNOTIFICARANULAR</code> service id. */
    public static final String G_SERV_ID_TGNOTIFICARANULAR = "IGl_1473964015616108_Alias";
    /** <code>TGNOTIFICARANULAR</code> service name. */
    public static final String G_SERV_NAME_TGNOTIFICARANULAR = "TGNOTIFICARANULAR";
    /** Agents allowed to execute the service TGNOTIFICARANULAR **/
    public static final String GS_TGNOTIFICARANULAR_SRVAGENTS = "SuperAdmin,UsuarioSistemaExterno";
    /** <code>ptDatoAnulacion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGNOTIFICARANULAR_TGNOTIFICARANULARPTDATOANULACION = "ptDatoAnulacion";
    public static final String GS_ARG_ID_TGNOTIFICARANULAR_TGNOTIFICARANULARPTDATOANULACION = "IGl_1473964015616108Arg_1_Alias";

    // Service (TGNEWASESORAGENCIA)
    /** <code>TGNEWASESORAGENCIA</code> service id. */
    public static final String G_SERV_ID_TGNEWASESORAGENCIA = "IGl_1475495198720658_Alias";
    /** <code>TGNEWASESORAGENCIA</code> service name. */
    public static final String G_SERV_NAME_TGNEWASESORAGENCIA = "TGNEWASESORAGENCIA";
    /** Agents allowed to execute the service TGNEWASESORAGENCIA **/
    public static final String GS_TGNEWASESORAGENCIA_SRVAGENTS = "Admin,SuperAdmin";
    /** <code>pt_p_agrSucursal</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGNEWASESORAGENCIA_TGNEWASESORAGENCIAPTPAGRSUCURSAL = "pt_p_agrSucursal";
    public static final String GS_ARG_ID_TGNEWASESORAGENCIA_TGNEWASESORAGENCIAPTPAGRSUCURSAL = "IGl_1475495198720658Arg_1_Alias";
    /** <code>pt_p_atrUsuario</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGNEWASESORAGENCIA_TGNEWASESORAGENCIAPTPATRUSUARIO = "pt_p_atrUsuario";
    public static final String GS_ARG_ID_TGNEWASESORAGENCIA_TGNEWASESORAGENCIAPTPATRUSUARIO = "IGl_1475495198720658Arg_2_Alias";
    /** <code>pt_p_atrPrimerNombre</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGNEWASESORAGENCIA_TGNEWASESORAGENCIAPTPATRPRIMERNOMBRE = "pt_p_atrPrimerNombre";
    public static final String GS_ARG_ID_TGNEWASESORAGENCIA_TGNEWASESORAGENCIAPTPATRPRIMERNOMBRE = "IGl_1475495198720658Arg_3_Alias";
    /** <code>pt_p_atrSegundoNombre</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGNEWASESORAGENCIA_TGNEWASESORAGENCIAPTPATRSEGUNDONOMBRE = "pt_p_atrSegundoNombre";
    public static final String GS_ARG_ID_TGNEWASESORAGENCIA_TGNEWASESORAGENCIAPTPATRSEGUNDONOMBRE = "IGl_1475495198720658Arg_4_Alias";
    /** <code>pt_p_atrPrimerApellido</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGNEWASESORAGENCIA_TGNEWASESORAGENCIAPTPATRPRIMERAPELLIDO = "pt_p_atrPrimerApellido";
    public static final String GS_ARG_ID_TGNEWASESORAGENCIA_TGNEWASESORAGENCIAPTPATRPRIMERAPELLIDO = "IGl_1475495198720658Arg_5_Alias";
    /** <code>pt_p_atrSegundoApellido</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGNEWASESORAGENCIA_TGNEWASESORAGENCIAPTPATRSEGUNDOAPELLIDO = "pt_p_atrSegundoApellido";
    public static final String GS_ARG_ID_TGNEWASESORAGENCIA_TGNEWASESORAGENCIAPTPATRSEGUNDOAPELLIDO = "IGl_1475495198720658Arg_6_Alias";
    /** <code>pt_p_atrUsuarioLDAP</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGNEWASESORAGENCIA_TGNEWASESORAGENCIAPTPATRUSUARIOLDAP = "pt_p_atrUsuarioLDAP";
    public static final String GS_ARG_ID_TGNEWASESORAGENCIA_TGNEWASESORAGENCIAPTPATRUSUARIOLDAP = "IGl_1475495198720658Arg_7_Alias";
    /** <code>pt_p_atrEmail</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGNEWASESORAGENCIA_TGNEWASESORAGENCIAPTPATREMAIL = "pt_p_atrEmail";
    public static final String GS_ARG_ID_TGNEWASESORAGENCIA_TGNEWASESORAGENCIAPTPATREMAIL = "IGl_1475495198720658Arg_8_Alias";
    /** <code>pt_p_agrTipoIdentificacion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGNEWASESORAGENCIA_TGNEWASESORAGENCIAPTPAGRTIPOIDENTIFICACION = "pt_p_agrTipoIdentificacion";
    public static final String GS_ARG_ID_TGNEWASESORAGENCIA_TGNEWASESORAGENCIAPTPAGRTIPOIDENTIFICACION = "IGl_1475495198720658Arg_9_Alias";
    /** <code>pt_p_atrmodificaDirector</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGNEWASESORAGENCIA_TGNEWASESORAGENCIAPTPATRMODIFICADIRECTOR = "pt_p_atrmodificaDirector";
    public static final String GS_ARG_ID_TGNEWASESORAGENCIA_TGNEWASESORAGENCIAPTPATRMODIFICADIRECTOR = "IGl_1475495198720658Arg_10_Alias";
    /** <code>pt_p_atrNumIdentificacion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGNEWASESORAGENCIA_TGNEWASESORAGENCIAPTPATRNUMIDENTIFICACION = "pt_p_atrNumIdentificacion";
    public static final String GS_ARG_ID_TGNEWASESORAGENCIA_TGNEWASESORAGENCIAPTPATRNUMIDENTIFICACION = "IGl_1475495198720658Arg_12_Alias";
    /** <code>pt_p_atrModDBasicosPersona</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGNEWASESORAGENCIA_TGNEWASESORAGENCIAPTPATRMODDBASICOSPERSONA = "pt_p_atrModDBasicosPersona";
    public static final String GS_ARG_ID_TGNEWASESORAGENCIA_TGNEWASESORAGENCIAPTPATRMODDBASICOSPERSONA = "IGl_1475495198720658Arg_14_Alias";
    /** <code>oaFuncionario</code> outbound argument id. */
    public static final String GS_ARG_ID_TGNEWASESORAGENCIA_TGNEWASESORAGENCIAOAFUNCIONARIO = "IGl_1475495198720658Arg_15_Alias";
    /** <code>TGNEWASESORAGENCIA</code> precondition 0 id. */
    public static final String GS_PRE_ID_TGNEWASESORAGENCIA_0 = "IGl_1475495198720658Pre_1_Alias";
    /** <code>TGNEWASESORAGENCIA</code> precondition 1 id. */
    public static final String GS_PRE_ID_TGNEWASESORAGENCIA_1 = "IGl_1475495198720658Pre_2_Alias";

    // Service (TGMODASESORAGENCIA)
    /** <code>TGMODASESORAGENCIA</code> service id. */
    public static final String G_SERV_ID_TGMODASESORAGENCIA = "IGl_1475495460864793_Alias";
    /** <code>TGMODASESORAGENCIA</code> service name. */
    public static final String G_SERV_NAME_TGMODASESORAGENCIA = "TGMODASESORAGENCIA";
    /** Agents allowed to execute the service TGMODASESORAGENCIA **/
    public static final String GS_TGMODASESORAGENCIA_SRVAGENTS = "Admin,SuperAdmin";
    /** <code>pt_p_thisAsesor</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPTHISASESOR = "pt_p_thisAsesor";
    public static final String GS_ARG_ID_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPTHISASESOR = "IGl_1475495460864793Arg_1_Alias";
    /** <code>pt_p_ModDBasicosPersona</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPMODDBASICOSPERSONA = "pt_p_ModDBasicosPersona";
    public static final String GS_ARG_ID_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPMODDBASICOSPERSONA = "IGl_1475495460864793Arg_2_Alias";
    /** <code>pt_pModificaDirector</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPMODIFICADIRECTOR = "pt_pModificaDirector";
    public static final String GS_ARG_ID_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPMODIFICADIRECTOR = "IGl_1475495460864793Arg_3_Alias";
    /** <code>pt_ptUsuarioLDAP</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPTUSUARIOLDAP = "pt_ptUsuarioLDAP";
    public static final String GS_ARG_ID_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPTUSUARIOLDAP = "IGl_1475495460864793Arg_4_Alias";
    /** <code>pt_ptEmail</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPTEMAIL = "pt_ptEmail";
    public static final String GS_ARG_ID_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPTEMAIL = "IGl_1475495460864793Arg_5_Alias";
    /** <code>pt_p_PrimerNombre</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPPRIMERNOMBRE = "pt_p_PrimerNombre";
    public static final String GS_ARG_ID_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPPRIMERNOMBRE = "IGl_1475495460864793Arg_6_Alias";
    /** <code>pt_p_SegundoNombre</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPSEGUNDONOMBRE = "pt_p_SegundoNombre";
    public static final String GS_ARG_ID_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPSEGUNDONOMBRE = "IGl_1475495460864793Arg_7_Alias";
    /** <code>pt_p_PrimerApellido</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPPRIMERAPELLIDO = "pt_p_PrimerApellido";
    public static final String GS_ARG_ID_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPPRIMERAPELLIDO = "IGl_1475495460864793Arg_8_Alias";
    /** <code>pt_p_SegundoApellido</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPSEGUNDOAPELLIDO = "pt_p_SegundoApellido";
    public static final String GS_ARG_ID_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPSEGUNDOAPELLIDO = "IGl_1475495460864793Arg_9_Alias";
    /** <code>pt_peNumUsuario</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPENUMUSUARIO = "pt_peNumUsuario";
    public static final String GS_ARG_ID_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPENUMUSUARIO = "IGl_1475495460864793Arg_10_Alias";
    /** <code>pt_ptSucursal</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPTSUCURSAL = "pt_ptSucursal";
    public static final String GS_ARG_ID_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPTSUCURSAL = "IGl_1475495460864793Arg_13_Alias";
    /** <code>pt_ptTipoIdentificacion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPTTIPOIDENTIFICACION = "pt_ptTipoIdentificacion";
    public static final String GS_ARG_ID_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPTTIPOIDENTIFICACION = "IGl_1475495460864793Arg_14_Alias";
    /** <code>pt_ptNumIdentificacion</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPTNUMIDENTIFICACION = "pt_ptNumIdentificacion";
    public static final String GS_ARG_ID_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPTNUMIDENTIFICACION = "IGl_1475495460864793Arg_15_Alias";
    /** <code>pt_pVerDBasicosPersona</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPVERDBASICOSPERSONA = "pt_pVerDBasicosPersona";
    public static final String GS_ARG_ID_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPVERDBASICOSPERSONA = "IGl_1475495460864793Arg_18_Alias";
    /** <code>pt_pVerDocsPersona</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPVERDOCSPERSONA = "pt_pVerDocsPersona";
    public static final String GS_ARG_ID_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPVERDOCSPERSONA = "IGl_1475495460864793Arg_19_Alias";
    /** <code>pt_pVerContratoNovedad</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPVERCONTRATONOVEDAD = "pt_pVerContratoNovedad";
    public static final String GS_ARG_ID_TGMODASESORAGENCIA_TGMODASESORAGENCIAPTPVERCONTRATONOVEDAD = "IGl_1475495460864793Arg_20_Alias";
    /** <code>TGMODASESORAGENCIA</code> precondition 0 id. */
    public static final String GS_PRE_ID_TGMODASESORAGENCIA_0 = "IGl_1475495460864793Pre_1_Alias";
    /** <code>TGMODASESORAGENCIA</code> precondition 1 id. */
    public static final String GS_PRE_ID_TGMODASESORAGENCIA_1 = "IGl_1475495460864793Pre_2_Alias";

    // Service (TGCREARACTPERSONACORE)
    /** <code>TGCREARACTPERSONACORE</code> service id. */
    public static final String G_SERV_ID_TGCREARACTPERSONACORE = "IGl_1495609901056477_Alias";
    /** <code>TGCREARACTPERSONACORE</code> service name. */
    public static final String G_SERV_NAME_TGCREARACTPERSONACORE = "TGCREARACTPERSONACORE";
    /** Agents allowed to execute the service TGCREARACTPERSONACORE **/
    public static final String GS_TGCREARACTPERSONACORE_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones";
    /** <code>ptSolicitud</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGCREARACTPERSONACORE_TGCREARACTPERSONACOREPTSOLICITUD = "ptSolicitud";
    public static final String GS_ARG_ID_TGCREARACTPERSONACORE_TGCREARACTPERSONACOREPTSOLICITUD = "IGl_1495609901056477Arg_1_Alias";
    /** <code>ptPersona</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGCREARACTPERSONACORE_TGCREARACTPERSONACOREPTPERSONA = "ptPersona";
    public static final String GS_ARG_ID_TGCREARACTPERSONACORE_TGCREARACTPERSONACOREPTPERSONA = "IGl_1495609901056477Arg_2_Alias";
    /** <code>psSalida</code> outbound argument id. */
    public static final String GS_ARG_ID_TGCREARACTPERSONACORE_TGCREARACTPERSONACOREPSSALIDA = "IGl_1495609901056477Arg_3_Alias";
    /** <code>psCodigoPersona</code> outbound argument id. */
    public static final String GS_ARG_ID_TGCREARACTPERSONACORE_TGCREARACTPERSONACOREPSCODIGOPERSONA = "IGl_1495609901056477Arg_4_Alias";

    // Service (tdelcontsindocsol)
    /** <code>tdelcontsindocsol</code> service id. */
    public static final String G_SERV_ID_TDELCONTSINDOCSOL = "IGl_1517847314432997_Alias";
    /** <code>tdelcontsindocsol</code> service name. */
    public static final String G_SERV_NAME_TDELCONTSINDOCSOL = "tdelcontsindocsol";
    /** Agents allowed to execute the service tdelcontsindocsol **/
    public static final String GS_TDELCONTSINDOCSOL_SRVAGENTS = "Admin,SuperAdmin";
    /** <code>pt_p_thisContSinDocSol</code> inbound argument id. */
    public static final String GS_ARG_NAME_TDELCONTSINDOCSOL_TDELCONTSINDOCSOLPTPTHISCONTSINDOCSOL = "pt_p_thisContSinDocSol";
    public static final String GS_ARG_ID_TDELCONTSINDOCSOL_TDELCONTSINDOCSOLPTPTHISCONTSINDOCSOL = "IGl_1517847314432997Arg_1_Alias";

    // Service (OGANULARSOL)
    /** <code>OGANULARSOL</code> service id. */
    public static final String G_SERV_ID_OGANULARSOL = "IGl_1537799356416380_Alias";
    /** <code>OGANULARSOL</code> service name. */
    public static final String G_SERV_NAME_OGANULARSOL = "OGANULARSOL";
    /** Agents allowed to execute the service OGANULARSOL **/
    public static final String GS_OGANULARSOL_SRVAGENTS = "SuperAdmin,UsuarioSistemaExterno";

    // Service (OGANULARSOLAUX)
    /** <code>OGANULARSOLAUX</code> service id. */
    public static final String G_SERV_ID_OGANULARSOLAUX = "IGl_1537802371072443_Alias";
    /** <code>OGANULARSOLAUX</code> service name. */
    public static final String G_SERV_NAME_OGANULARSOLAUX = "OGANULARSOLAUX";
    /** Agents allowed to execute the service OGANULARSOLAUX **/
    public static final String GS_OGANULARSOLAUX_SRVAGENTS = "SuperAdmin";
    /** <code>ptPlan</code> inbound argument id. */
    public static final String GS_ARG_NAME_OGANULARSOLAUX_OGANULARSOLAUXPTPLAN = "ptPlan";
    public static final String GS_ARG_ID_OGANULARSOLAUX_OGANULARSOLAUXPTPLAN = "IGl_1537802371072443Arg_1_Alias";
    /** <code>ptFechaCad</code> inbound argument id. */
    public static final String GS_ARG_NAME_OGANULARSOLAUX_OGANULARSOLAUXPTFECHACAD = "ptFechaCad";
    public static final String GS_ARG_ID_OGANULARSOLAUX_OGANULARSOLAUXPTFECHACAD = "IGl_1537802371072443Arg_2_Alias";

    // Service (TGACTTIPOFACTURA)
    /** <code>TGACTTIPOFACTURA</code> service id. */
    public static final String G_SERV_ID_TGACTTIPOFACTURA = "IGl_1547136925696950_Alias";
    /** <code>TGACTTIPOFACTURA</code> service name. */
    public static final String G_SERV_NAME_TGACTTIPOFACTURA = "TGACTTIPOFACTURA";
    /** Agents allowed to execute the service TGACTTIPOFACTURA **/
    public static final String GS_TGACTTIPOFACTURA_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    /** <code>ptSolicitud</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGACTTIPOFACTURA_TGACTTIPOFACTURAPTSOLICITUD = "ptSolicitud";
    public static final String GS_ARG_ID_TGACTTIPOFACTURA_TGACTTIPOFACTURAPTSOLICITUD = "IGl_1547136925696950Arg_1_Alias";

    // Service (OGSOLNOVSETTRAMITADO)
    /** <code>OGSOLNOVSETTRAMITADO</code> service id. */
    public static final String G_SERV_ID_OGSOLNOVSETTRAMITADO = "IGl_1584043524096102_Alias";
    /** <code>OGSOLNOVSETTRAMITADO</code> service name. */
    public static final String G_SERV_NAME_OGSOLNOVSETTRAMITADO = "OGSOLNOVSETTRAMITADO";
    /** Agents allowed to execute the service OGSOLNOVSETTRAMITADO **/
    public static final String GS_OGSOLNOVSETTRAMITADO_SRVAGENTS = "Admin,SuperAdmin";
    /** <code>ptFichero</code> inbound argument id. */
    public static final String GS_ARG_NAME_OGSOLNOVSETTRAMITADO_OGSOLNOVSETTRAMITADOPTFICHERO = "ptFichero";
    public static final String GS_ARG_ID_OGSOLNOVSETTRAMITADO_OGSOLNOVSETTRAMITADOPTFICHERO = "IGl_1584043524096102Arg_1_Alias";
    /** <code>oaNumProcesados</code> outbound argument id. */
    public static final String GS_ARG_ID_OGSOLNOVSETTRAMITADO_OGSOLNOVSETTRAMITADOOANUMPROCESADOS = "IGl_1584043524096102Arg_2_Alias";
    /** <code>oaNumErrores</code> outbound argument id. */
    public static final String GS_ARG_ID_OGSOLNOVSETTRAMITADO_OGSOLNOVSETTRAMITADOOANUMERRORES = "IGl_1584043524096102Arg_3_Alias";
    /** <code>oaErrores</code> outbound argument id. */
    public static final String GS_ARG_ID_OGSOLNOVSETTRAMITADO_OGSOLNOVSETTRAMITADOOAERRORES = "IGl_1584043524096102Arg_4_Alias";

    // Service (TGSOLNOVSETTRA)
    /** <code>TGSOLNOVSETTRA</code> service id. */
    public static final String G_SERV_ID_TGSOLNOVSETTRA = "IGl_1584439099392074_Alias";
    /** <code>TGSOLNOVSETTRA</code> service name. */
    public static final String G_SERV_NAME_TGSOLNOVSETTRA = "TGSOLNOVSETTRA";
    /** Agents allowed to execute the service TGSOLNOVSETTRA **/
    public static final String GS_TGSOLNOVSETTRA_SRVAGENTS = "Admin,SuperAdmin";
    /** <code>ptNumRadicado</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGSOLNOVSETTRA_TGSOLNOVSETTRAPTNUMRADICADO = "ptNumRadicado";
    public static final String GS_ARG_ID_TGSOLNOVSETTRA_TGSOLNOVSETTRAPTNUMRADICADO = "IGl_1584439099392074Arg_1_Alias";
    /** <code>pt_oaNumProcesados</code> outbound argument id. */
    public static final String GS_ARG_ID_TGSOLNOVSETTRA_TGSOLNOVSETTRAPTOANUMPROCESADOS = "IGl_1584439099392074Arg_3_Alias";
    /** <code>pt_oaNumErrores</code> outbound argument id. */
    public static final String GS_ARG_ID_TGSOLNOVSETTRA_TGSOLNOVSETTRAPTOANUMERRORES = "IGl_1584439099392074Arg_4_Alias";
    /** <code>pt_oaErrores</code> outbound argument id. */
    public static final String GS_ARG_ID_TGSOLNOVSETTRA_TGSOLNOVSETTRAPTOAERRORES = "IGl_1584439099392074Arg_5_Alias";

    // Service (TGCREARCOMBO)
    /** <code>TGCREARCOMBO</code> service id. */
    public static final String G_SERV_ID_TGCREARCOMBO = "IGl_1587633717248106_Alias";
    /** <code>TGCREARCOMBO</code> service name. */
    public static final String G_SERV_NAME_TGCREARCOMBO = "TGCREARCOMBO";
    /** Agents allowed to execute the service TGCREARCOMBO **/
    public static final String GS_TGCREARCOMBO_SRVAGENTS = "Admin,SuperAdmin";
    /** <code>pt_p_atrContratoIntegral</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGCREARCOMBO_TGCREARCOMBOPTPATRCONTRATOINTEGRAL = "pt_p_atrContratoIntegral";
    public static final String GS_ARG_ID_TGCREARCOMBO_TGCREARCOMBOPTPATRCONTRATOINTEGRAL = "IGl_1587633717248106Arg_1_Alias";
    /** <code>pt_p_atrContratoOdontologico</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGCREARCOMBO_TGCREARCOMBOPTPATRCONTRATOODONTOLOGICO = "pt_p_atrContratoOdontologico";
    public static final String GS_ARG_ID_TGCREARCOMBO_TGCREARCOMBOPTPATRCONTRATOODONTOLOGICO = "IGl_1587633717248106Arg_2_Alias";
    /** <code>TGCREARCOMBO</code> precondition 0 id. */
    public static final String GS_PRE_ID_TGCREARCOMBO_0 = "IGl_1587633717248106Pre_1_Alias";

    // Service (TGEDITARCOMBO)
    /** <code>TGEDITARCOMBO</code> service id. */
    public static final String G_SERV_ID_TGEDITARCOMBO = "IGl_1587633979392848_Alias";
    /** <code>TGEDITARCOMBO</code> service name. */
    public static final String G_SERV_NAME_TGEDITARCOMBO = "TGEDITARCOMBO";
    /** Agents allowed to execute the service TGEDITARCOMBO **/
    public static final String GS_TGEDITARCOMBO_SRVAGENTS = "Admin,SuperAdmin";
    /** <code>pt_p_thisContratoCombo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGEDITARCOMBO_TGEDITARCOMBOPTPTHISCONTRATOCOMBO = "pt_p_thisContratoCombo";
    public static final String GS_ARG_ID_TGEDITARCOMBO_TGEDITARCOMBOPTPTHISCONTRATOCOMBO = "IGl_1587633979392848Arg_1_Alias";
    /** <code>pt_p_ContratoIntegral</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGEDITARCOMBO_TGEDITARCOMBOPTPCONTRATOINTEGRAL = "pt_p_ContratoIntegral";
    public static final String GS_ARG_ID_TGEDITARCOMBO_TGEDITARCOMBOPTPCONTRATOINTEGRAL = "IGl_1587633979392848Arg_2_Alias";
    /** <code>pt_p_ContratoOdontologico</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGEDITARCOMBO_TGEDITARCOMBOPTPCONTRATOODONTOLOGICO = "pt_p_ContratoOdontologico";
    public static final String GS_ARG_ID_TGEDITARCOMBO_TGEDITARCOMBOPTPCONTRATOODONTOLOGICO = "IGl_1587633979392848Arg_3_Alias";
    /** <code>TGEDITARCOMBO</code> precondition 0 id. */
    public static final String GS_PRE_ID_TGEDITARCOMBO_0 = "IGl_1587633979392848Pre_1_Alias";

    // Service (TDELCOMBO)
    /** <code>TDELCOMBO</code> service id. */
    public static final String G_SERV_ID_TDELCOMBO = "IGl_1587634241536186_Alias";
    /** <code>TDELCOMBO</code> service name. */
    public static final String G_SERV_NAME_TDELCOMBO = "TDELCOMBO";
    /** Agents allowed to execute the service TDELCOMBO **/
    public static final String GS_TDELCOMBO_SRVAGENTS = "Admin,SuperAdmin";
    /** <code>pt_p_thisContratoCombo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TDELCOMBO_TDELCOMBOPTPTHISCONTRATOCOMBO = "pt_p_thisContratoCombo";
    public static final String GS_ARG_ID_TDELCOMBO_TDELCOMBOPTPTHISCONTRATOCOMBO = "IGl_1587634241536186Arg_1_Alias";

    // Service (OGASIGUSUARIOS)
    /** <code>OGASIGUSUARIOS</code> service id. */
    public static final String G_SERV_ID_OGASIGUSUARIOS = "IGl_1588762378240048_Alias";
    /** <code>OGASIGUSUARIOS</code> service name. */
    public static final String G_SERV_NAME_OGASIGUSUARIOS = "OGASIGUSUARIOS";
    /** Agents allowed to execute the service OGASIGUSUARIOS **/
    public static final String GS_OGASIGUSUARIOS_SRVAGENTS = "Admin,SuperAdmin";
    /** <code>ptFichero</code> inbound argument id. */
    public static final String GS_ARG_NAME_OGASIGUSUARIOS_OGASIGUSUARIOSPTFICHERO = "ptFichero";
    public static final String GS_ARG_ID_OGASIGUSUARIOS_OGASIGUSUARIOSPTFICHERO = "IGl_1588762378240048Arg_1_Alias";
    /** <code>oaProcesados</code> outbound argument id. */
    public static final String GS_ARG_ID_OGASIGUSUARIOS_OGASIGUSUARIOSOAPROCESADOS = "IGl_1588762378240048Arg_2_Alias";
    /** <code>oaErrores</code> outbound argument id. */
    public static final String GS_ARG_ID_OGASIGUSUARIOS_OGASIGUSUARIOSOAERRORES = "IGl_1588762378240048Arg_3_Alias";
    /** <code>oaTextoErrores</code> outbound argument id. */
    public static final String GS_ARG_ID_OGASIGUSUARIOS_OGASIGUSUARIOSOATEXTOERRORES = "IGl_1588762378240048Arg_4_Alias";

    // Service (REACTIVACIONCONTRATOS)
    /** <code>REACTIVACIONCONTRATOS</code> service id. */
    public static final String G_SERV_ID_REACTIVACIONCONTRATOS = "IGl_1594054803456798_Alias";
    /** <code>REACTIVACIONCONTRATOS</code> service name. */
    public static final String G_SERV_NAME_REACTIVACIONCONTRATOS = "REACTIVACIONCONTRATOS";
    /** Agents allowed to execute the service REACTIVACIONCONTRATOS **/
    public static final String GS_REACTIVACIONCONTRATOS_SRVAGENTS = "Admin,SuperAdmin,Asesor,Gestor";
    /** <code>ptCompanyia</code> inbound argument id. */
    public static final String GS_ARG_NAME_REACTIVACIONCONTRATOS_REACTIVACIONCONTRATOSPTCOMPANYIA = "ptCompanyia";
    public static final String GS_ARG_ID_REACTIVACIONCONTRATOS_REACTIVACIONCONTRATOSPTCOMPANYIA = "IGl_1594054803456798Arg_2_Alias";
    /** <code>ptPlan</code> inbound argument id. */
    public static final String GS_ARG_NAME_REACTIVACIONCONTRATOS_REACTIVACIONCONTRATOSPTPLAN = "ptPlan";
    public static final String GS_ARG_ID_REACTIVACIONCONTRATOS_REACTIVACIONCONTRATOSPTPLAN = "IGl_1594054803456798Arg_3_Alias";
    /** <code>ptContrato</code> inbound argument id. */
    public static final String GS_ARG_NAME_REACTIVACIONCONTRATOS_REACTIVACIONCONTRATOSPTCONTRATO = "ptContrato";
    public static final String GS_ARG_ID_REACTIVACIONCONTRATOS_REACTIVACIONCONTRATOSPTCONTRATO = "IGl_1594054803456798Arg_4_Alias";
    /** <code>ptTitular</code> inbound argument id. */
    public static final String GS_ARG_NAME_REACTIVACIONCONTRATOS_REACTIVACIONCONTRATOSPTTITULAR = "ptTitular";
    public static final String GS_ARG_ID_REACTIVACIONCONTRATOS_REACTIVACIONCONTRATOSPTTITULAR = "IGl_1594054803456798Arg_5_Alias";
    /** <code>ptValor</code> inbound argument id. */
    public static final String GS_ARG_NAME_REACTIVACIONCONTRATOS_REACTIVACIONCONTRATOSPTVALOR = "ptValor";
    public static final String GS_ARG_ID_REACTIVACIONCONTRATOS_REACTIVACIONCONTRATOSPTVALOR = "IGl_1594054803456798Arg_6_Alias";

    // Service (TGADDPLANTREP)
    /** <code>TGADDPLANTREP</code> service id. */
    public static final String G_SERV_ID_TGADDPLANTREP = "IGl_1623834492928280_Alias";
    /** <code>TGADDPLANTREP</code> service name. */
    public static final String G_SERV_NAME_TGADDPLANTREP = "TGADDPLANTREP";
    /** Agents allowed to execute the service TGADDPLANTREP **/
    public static final String GS_TGADDPLANTREP_SRVAGENTS = "Admin,SuperAdmin";
    /** <code>pt_p_atrTipo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDPLANTREP_TGADDPLANTREPPTPATRTIPO = "pt_p_atrTipo";
    public static final String GS_ARG_ID_TGADDPLANTREP_TGADDPLANTREPPTPATRTIPO = "IGl_1623834492928280Arg_1_Alias";
    /** <code>pt_p_atrTitulo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDPLANTREP_TGADDPLANTREPPTPATRTITULO = "pt_p_atrTitulo";
    public static final String GS_ARG_ID_TGADDPLANTREP_TGADDPLANTREPPTPATRTITULO = "IGl_1623834492928280Arg_2_Alias";
    /** <code>pt_p_atrFechaVigencia</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDPLANTREP_TGADDPLANTREPPTPATRFECHAVIGENCIA = "pt_p_atrFechaVigencia";
    public static final String GS_ARG_ID_TGADDPLANTREP_TGADDPLANTREPPTPATRFECHAVIGENCIA = "IGl_1623834492928280Arg_3_Alias";
    /** <code>pt_p_atrRutaArchivos</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDPLANTREP_TGADDPLANTREPPTPATRRUTAARCHIVOS = "pt_p_atrRutaArchivos";
    public static final String GS_ARG_ID_TGADDPLANTREP_TGADDPLANTREPPTPATRRUTAARCHIVOS = "IGl_1623834492928280Arg_4_Alias";
    /** <code>pt_p_atrNombreArchivoPDF</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGADDPLANTREP_TGADDPLANTREPPTPATRNOMBREARCHIVOPDF = "pt_p_atrNombreArchivoPDF";
    public static final String GS_ARG_ID_TGADDPLANTREP_TGADDPLANTREPPTPATRNOMBREARCHIVOPDF = "IGl_1623834492928280Arg_5_Alias";
    /** <code>TGADDPLANTREP</code> precondition 0 id. */
    public static final String GS_PRE_ID_TGADDPLANTREP_0 = "IGl_1623834492928280Pre_2_Alias";

    // Service (TGEDITPLANTREP)
    /** <code>TGEDITPLANTREP</code> service id. */
    public static final String G_SERV_ID_TGEDITPLANTREP = "IGl_1623834755072701_Alias";
    /** <code>TGEDITPLANTREP</code> service name. */
    public static final String G_SERV_NAME_TGEDITPLANTREP = "TGEDITPLANTREP";
    /** Agents allowed to execute the service TGEDITPLANTREP **/
    public static final String GS_TGEDITPLANTREP_SRVAGENTS = "Admin,SuperAdmin";
    /** <code>pt_p_thisPlantillaReporte</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGEDITPLANTREP_TGEDITPLANTREPPTPTHISPLANTILLAREPORTE = "pt_p_thisPlantillaReporte";
    public static final String GS_ARG_ID_TGEDITPLANTREP_TGEDITPLANTREPPTPTHISPLANTILLAREPORTE = "IGl_1623834755072701Arg_1_Alias";
    /** <code>pt_p_Titulo</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGEDITPLANTREP_TGEDITPLANTREPPTPTITULO = "pt_p_Titulo";
    public static final String GS_ARG_ID_TGEDITPLANTREP_TGEDITPLANTREPPTPTITULO = "IGl_1623834755072701Arg_2_Alias";
    /** <code>pt_p_FechaVigencia</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGEDITPLANTREP_TGEDITPLANTREPPTPFECHAVIGENCIA = "pt_p_FechaVigencia";
    public static final String GS_ARG_ID_TGEDITPLANTREP_TGEDITPLANTREPPTPFECHAVIGENCIA = "IGl_1623834755072701Arg_3_Alias";
    /** <code>pt_p_RutaArchivos</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGEDITPLANTREP_TGEDITPLANTREPPTPRUTAARCHIVOS = "pt_p_RutaArchivos";
    public static final String GS_ARG_ID_TGEDITPLANTREP_TGEDITPLANTREPPTPRUTAARCHIVOS = "IGl_1623834755072701Arg_4_Alias";
    /** <code>pt_p_NombreArchivoPDF</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGEDITPLANTREP_TGEDITPLANTREPPTPNOMBREARCHIVOPDF = "pt_p_NombreArchivoPDF";
    public static final String GS_ARG_ID_TGEDITPLANTREP_TGEDITPLANTREPPTPNOMBREARCHIVOPDF = "IGl_1623834755072701Arg_5_Alias";
    /** <code>TGEDITPLANTREP</code> precondition 0 id. */
    public static final String GS_PRE_ID_TGEDITPLANTREP_0 = "IGl_1623834755072701Pre_2_Alias";

    // Service (OGCARGAVISASESORES)
    /** <code>OGCARGAVISASESORES</code> service id. */
    public static final String G_SERV_ID_OGCARGAVISASESORES = "IGl_1623841832960263_Alias";
    /** <code>OGCARGAVISASESORES</code> service name. */
    public static final String G_SERV_NAME_OGCARGAVISASESORES = "OGCARGAVISASESORES";
    /** Agents allowed to execute the service OGCARGAVISASESORES **/
    public static final String GS_OGCARGAVISASESORES_SRVAGENTS = "Admin,SuperAdmin";
    /** <code>ptFichero</code> inbound argument id. */
    public static final String GS_ARG_NAME_OGCARGAVISASESORES_OGCARGAVISASESORESPTFICHERO = "ptFichero";
    public static final String GS_ARG_ID_OGCARGAVISASESORES_OGCARGAVISASESORESPTFICHERO = "IGl_1623841832960263Arg_1_Alias";
    /** <code>oaProcesados</code> outbound argument id. */
    public static final String GS_ARG_ID_OGCARGAVISASESORES_OGCARGAVISASESORESOAPROCESADOS = "IGl_1623841832960263Arg_2_Alias";
    /** <code>oaErrores</code> outbound argument id. */
    public static final String GS_ARG_ID_OGCARGAVISASESORES_OGCARGAVISASESORESOAERRORES = "IGl_1623841832960263Arg_3_Alias";
    /** <code>oaResultado</code> outbound argument id. */
    public static final String GS_ARG_ID_OGCARGAVISASESORES_OGCARGAVISASESORESOARESULTADO = "IGl_1623841832960263Arg_4_Alias";

    // Service (OGCARGAPLANASESOR)
    /** <code>OGCARGAPLANASESOR</code> service id. */
    public static final String G_SERV_ID_OGCARGAPLANASESOR = "IGl_1624010260480499_Alias";
    /** <code>OGCARGAPLANASESOR</code> service name. */
    public static final String G_SERV_NAME_OGCARGAPLANASESOR = "OGCARGAPLANASESOR";
    /** Agents allowed to execute the service OGCARGAPLANASESOR **/
    public static final String GS_OGCARGAPLANASESOR_SRVAGENTS = "Admin,SuperAdmin";
    /** <code>ptFichero</code> inbound argument id. */
    public static final String GS_ARG_NAME_OGCARGAPLANASESOR_OGCARGAPLANASESORPTFICHERO = "ptFichero";
    public static final String GS_ARG_ID_OGCARGAPLANASESOR_OGCARGAPLANASESORPTFICHERO = "IGl_1624010260480499Arg_1_Alias";
    /** <code>oaProcesados</code> outbound argument id. */
    public static final String GS_ARG_ID_OGCARGAPLANASESOR_OGCARGAPLANASESOROAPROCESADOS = "IGl_1624010260480499Arg_2_Alias";
    /** <code>oaErrores</code> outbound argument id. */
    public static final String GS_ARG_ID_OGCARGAPLANASESOR_OGCARGAPLANASESOROAERRORES = "IGl_1624010260480499Arg_3_Alias";
    /** <code>oaResultado</code> outbound argument id. */
    public static final String GS_ARG_ID_OGCARGAPLANASESOR_OGCARGAPLANASESOROARESULTADO = "IGl_1624010260480499Arg_4_Alias";

    // Service (TGCREARFINIEPS)
    /** <code>TGCREARFINIEPS</code> service id. */
    public static final String G_SERV_ID_TGCREARFINIEPS = "IGl_1655288233984471_Alias";
    /** <code>TGCREARFINIEPS</code> service name. */
    public static final String G_SERV_NAME_TGCREARFINIEPS = "TGCREARFINIEPS";
    /** Agents allowed to execute the service TGCREARFINIEPS **/
    public static final String GS_TGCREARFINIEPS_SRVAGENTS = "Admin,SuperAdmin";
    /** <code>pt_p_atrTramite</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGCREARFINIEPS_TGCREARFINIEPSPTPATRTRAMITE = "pt_p_atrTramite";
    public static final String GS_ARG_ID_TGCREARFINIEPS_TGCREARFINIEPSPTPATRTRAMITE = "IGl_1655288233984471Arg_1_Alias";
    /** <code>pt_p_atrTipoContrato</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGCREARFINIEPS_TGCREARFINIEPSPTPATRTIPOCONTRATO = "pt_p_atrTipoContrato";
    public static final String GS_ARG_ID_TGCREARFINIEPS_TGCREARFINIEPSPTPATRTIPOCONTRATO = "IGl_1655288233984471Arg_2_Alias";
    /** <code>pt_p_atrDesde</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGCREARFINIEPS_TGCREARFINIEPSPTPATRDESDE = "pt_p_atrDesde";
    public static final String GS_ARG_ID_TGCREARFINIEPS_TGCREARFINIEPSPTPATRDESDE = "IGl_1655288233984471Arg_3_Alias";
    /** <code>pt_p_atrHasta</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGCREARFINIEPS_TGCREARFINIEPSPTPATRHASTA = "pt_p_atrHasta";
    public static final String GS_ARG_ID_TGCREARFINIEPS_TGCREARFINIEPSPTPATRHASTA = "IGl_1655288233984471Arg_4_Alias";
    /** <code>pt_p_atrFechaInicioAplicar</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGCREARFINIEPS_TGCREARFINIEPSPTPATRFECHAINICIOAPLICAR = "pt_p_atrFechaInicioAplicar";
    public static final String GS_ARG_ID_TGCREARFINIEPS_TGCREARFINIEPSPTPATRFECHAINICIOAPLICAR = "IGl_1655288233984471Arg_5_Alias";
    /** <code>TGCREARFINIEPS</code> precondition 0 id. */
    public static final String GS_PRE_ID_TGCREARFINIEPS_0 = "IGl_1655288233984471Pre_1_Alias";
    /** <code>TGCREARFINIEPS</code> precondition 1 id. */
    public static final String GS_PRE_ID_TGCREARFINIEPS_1 = "IGl_1655288233984471Pre_2_Alias";
    /** <code>TGCREARFINIEPS</code> precondition 2 id. */
    public static final String GS_PRE_ID_TGCREARFINIEPS_2 = "IGl_1655288233984471Pre_3_Alias";
    /** <code>TGCREARFINIEPS</code> precondition 3 id. */
    public static final String GS_PRE_ID_TGCREARFINIEPS_3 = "IGl_1655288233984471Pre_4_Alias";

    // Service (TGMODFINIEPS)
    /** <code>TGMODFINIEPS</code> service id. */
    public static final String G_SERV_ID_TGMODFINIEPS = "IGl_1655288365056783_Alias";
    /** <code>TGMODFINIEPS</code> service name. */
    public static final String G_SERV_NAME_TGMODFINIEPS = "TGMODFINIEPS";
    /** Agents allowed to execute the service TGMODFINIEPS **/
    public static final String GS_TGMODFINIEPS_SRVAGENTS = "Admin,SuperAdmin";
    /** <code>pt_p_thisFechaIniEPS</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGMODFINIEPS_TGMODFINIEPSPTPTHISFECHAINIEPS = "pt_p_thisFechaIniEPS";
    public static final String GS_ARG_ID_TGMODFINIEPS_TGMODFINIEPSPTPTHISFECHAINIEPS = "IGl_1655288365056783Arg_1_Alias";
    /** <code>pt_p_Desde</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGMODFINIEPS_TGMODFINIEPSPTPDESDE = "pt_p_Desde";
    public static final String GS_ARG_ID_TGMODFINIEPS_TGMODFINIEPSPTPDESDE = "IGl_1655288365056783Arg_2_Alias";
    /** <code>pt_p_Hasta</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGMODFINIEPS_TGMODFINIEPSPTPHASTA = "pt_p_Hasta";
    public static final String GS_ARG_ID_TGMODFINIEPS_TGMODFINIEPSPTPHASTA = "IGl_1655288365056783Arg_3_Alias";
    /** <code>pt_p_FechaInicioAplicar</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGMODFINIEPS_TGMODFINIEPSPTPFECHAINICIOAPLICAR = "pt_p_FechaInicioAplicar";
    public static final String GS_ARG_ID_TGMODFINIEPS_TGMODFINIEPSPTPFECHAINICIOAPLICAR = "IGl_1655288365056783Arg_4_Alias";
    /** <code>ptTratime</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGMODFINIEPS_TGMODFINIEPSPTTRATIME = "ptTratime";
    public static final String GS_ARG_ID_TGMODFINIEPS_TGMODFINIEPSPTTRATIME = "IGl_1655288365056783Arg_5_Alias";
    /** <code>ptTipoContrato</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGMODFINIEPS_TGMODFINIEPSPTTIPOCONTRATO = "ptTipoContrato";
    public static final String GS_ARG_ID_TGMODFINIEPS_TGMODFINIEPSPTTIPOCONTRATO = "IGl_1655288365056783Arg_6_Alias";
    /** <code>TGMODFINIEPS</code> precondition 0 id. */
    public static final String GS_PRE_ID_TGMODFINIEPS_0 = "IGl_1655288365056783Pre_1_Alias";
    /** <code>TGMODFINIEPS</code> precondition 1 id. */
    public static final String GS_PRE_ID_TGMODFINIEPS_1 = "IGl_1655288365056783Pre_2_Alias";
    /** <code>TGMODFINIEPS</code> precondition 2 id. */
    public static final String GS_PRE_ID_TGMODFINIEPS_2 = "IGl_1655288365056783Pre_3_Alias";
    /** <code>TGMODFINIEPS</code> precondition 3 id. */
    public static final String GS_PRE_ID_TGMODFINIEPS_3 = "IGl_1655288365056783Pre_4_Alias";

    // Service (TGValidadorUsuarios)
    /** <code>TGValidadorUsuarios</code> service id. */
    public static final String G_SERV_ID_TGVALIDADORUSUARIOS = "IGl_1658391625728650_Alias";
    /** <code>TGValidadorUsuarios</code> service name. */
    public static final String G_SERV_NAME_TGVALIDADORUSUARIOS = "TGValidadorUsuarios";
    /** Agents allowed to execute the service TGValidadorUsuarios **/
    public static final String GS_TGVALIDADORUSUARIOS_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    /** <code>ptFechaInicio</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGVALIDADORUSUARIOS_TGVALIDADORUSUARIOSPTFECHAINICIO = "ptFechaInicio";
    public static final String GS_ARG_ID_TGVALIDADORUSUARIOS_TGVALIDADORUSUARIOSPTFECHAINICIO = "IGl_1658391625728650Arg_1_Alias";
    /** <code>ptTipoDoc</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGVALIDADORUSUARIOS_TGVALIDADORUSUARIOSPTTIPODOC = "ptTipoDoc";
    public static final String GS_ARG_ID_TGVALIDADORUSUARIOS_TGVALIDADORUSUARIOSPTTIPODOC = "IGl_1658391625728650Arg_2_Alias";
    /** <code>ptNumId</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGVALIDADORUSUARIOS_TGVALIDADORUSUARIOSPTNUMID = "ptNumId";
    public static final String GS_ARG_ID_TGVALIDADORUSUARIOS_TGVALIDADORUSUARIOSPTNUMID = "IGl_1658391625728650Arg_3_Alias";

    // Service (TGCREARCONTEXENTO)
    /** <code>TGCREARCONTEXENTO</code> service id. */
    public static final String G_SERV_ID_TGCREARCONTEXENTO = "IGl_1658397786112231_Alias";
    /** <code>TGCREARCONTEXENTO</code> service name. */
    public static final String G_SERV_NAME_TGCREARCONTEXENTO = "TGCREARCONTEXENTO";
    /** Agents allowed to execute the service TGCREARCONTEXENTO **/
    public static final String GS_TGCREARCONTEXENTO_SRVAGENTS = "Admin,SuperAdmin,MesaDeApoyo";
    /** <code>pt_p_atrNumContrato</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGCREARCONTEXENTO_TGCREARCONTEXENTOPTPATRNUMCONTRATO = "pt_p_atrNumContrato";
    public static final String GS_ARG_ID_TGCREARCONTEXENTO_TGCREARCONTEXENTOPTPATRNUMCONTRATO = "IGl_1658397786112231Arg_1_Alias";
    /** <code>TGCREARCONTEXENTO</code> precondition 0 id. */
    public static final String GS_PRE_ID_TGCREARCONTEXENTO_0 = "IGl_1658397786112231Pre_1_Alias";

    // Service (TGDELCONTRATOEXENTO)
    /** <code>TGDELCONTRATOEXENTO</code> service id. */
    public static final String G_SERV_ID_TGDELCONTRATOEXENTO = "IGl_1658398048256569_Alias";
    /** <code>TGDELCONTRATOEXENTO</code> service name. */
    public static final String G_SERV_NAME_TGDELCONTRATOEXENTO = "TGDELCONTRATOEXENTO";
    /** Agents allowed to execute the service TGDELCONTRATOEXENTO **/
    public static final String GS_TGDELCONTRATOEXENTO_SRVAGENTS = "Admin,SuperAdmin,MesaDeApoyo";
    /** <code>pt_p_thisContratosExentosFIngr</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGDELCONTRATOEXENTO_TGDELCONTRATOEXENTOPTPTHISCONTRATOSEXENTOSFINGR = "pt_p_thisContratosExentosFIngr";
    public static final String GS_ARG_ID_TGDELCONTRATOEXENTO_TGDELCONTRATOEXENTOPTPTHISCONTRATOSEXENTOSFINGR = "IGl_1658398048256569Arg_1_Alias";

    // Service (OGETREPORTSOL)
    /** <code>OGETREPORTSOL</code> service id. */
    public static final String G_SERV_ID_OGETREPORTSOL = "IGl_1729755611136894_Alias";
    /** <code>OGETREPORTSOL</code> service name. */
    public static final String G_SERV_NAME_OGETREPORTSOL = "OGETREPORTSOL";
    /** Agents allowed to execute the service OGETREPORTSOL **/
    public static final String GS_OGETREPORTSOL_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    /** <code>ptSolicitud</code> inbound argument id. */
    public static final String GS_ARG_NAME_OGETREPORTSOL_OGETREPORTSOLPTSOLICITUD = "ptSolicitud";
    public static final String GS_ARG_ID_OGETREPORTSOL_OGETREPORTSOLPTSOLICITUD = "IGl_1729755611136894Arg_1_Alias";
    /** <code>oaArchivo</code> outbound argument id. */
    public static final String GS_ARG_ID_OGETREPORTSOL_OGETREPORTSOLOAARCHIVO = "IGl_1729755611136894Arg_2_Alias";
    /** <code>oaNombreArchivo</code> outbound argument id. */
    public static final String GS_ARG_ID_OGETREPORTSOL_OGETREPORTSOLOANOMBREARCHIVO = "IGl_1729755611136894Arg_3_Alias";

    // Service (OGETREPORTSOLNOV)
    /** <code>OGETREPORTSOLNOV</code> service id. */
    public static final String G_SERV_ID_OGETREPORTSOLNOV = "IGl_1730127986688050_Alias";
    /** <code>OGETREPORTSOLNOV</code> service name. */
    public static final String G_SERV_NAME_OGETREPORTSOLNOV = "OGETREPORTSOLNOV";
    /** Agents allowed to execute the service OGETREPORTSOLNOV **/
    public static final String GS_OGETREPORTSOLNOV_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    /** <code>ptSolicitudNovedad</code> inbound argument id. */
    public static final String GS_ARG_NAME_OGETREPORTSOLNOV_OGETREPORTSOLNOVPTSOLICITUDNOVEDAD = "ptSolicitudNovedad";
    public static final String GS_ARG_ID_OGETREPORTSOLNOV_OGETREPORTSOLNOVPTSOLICITUDNOVEDAD = "IGl_1730127986688050Arg_1_Alias";
    /** <code>oaRuta</code> outbound argument id. */
    public static final String GS_ARG_ID_OGETREPORTSOLNOV_OGETREPORTSOLNOVOARUTA = "IGl_1730127986688050Arg_3_Alias";
    /** <code>oaNombreArchivo</code> outbound argument id. */
    public static final String GS_ARG_ID_OGETREPORTSOLNOV_OGETREPORTSOLNOVOANOMBREARCHIVO = "IGl_1730127986688050Arg_4_Alias";
    /** <code>oaArchivo</code> outbound argument id. */
    public static final String GS_ARG_ID_OGETREPORTSOLNOV_OGETREPORTSOLNOVOAARCHIVO = "IGl_1730127986688050Arg_5_Alias";

    // Service (TGENREPALM)
    /** <code>TGENREPALM</code> service id. */
    public static final String G_SERV_ID_TGENREPALM = "IGl_1730192080896609_Alias";
    /** <code>TGENREPALM</code> service name. */
    public static final String G_SERV_NAME_TGENREPALM = "TGENREPALM";
    /** Agents allowed to execute the service TGENREPALM **/
    public static final String GS_TGENREPALM_SRVAGENTS = "Admin,SuperAdmin,RespRegional,Asesor,Afiliaciones";
    /** <code>ptReportesProcAlm</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGENREPALM_TGENREPALMPTREPORTESPROCALM = "ptReportesProcAlm";
    public static final String GS_ARG_ID_TGENREPALM_TGENREPALMPTREPORTESPROCALM = "IGl_1730192080896609Arg_1_Alias";
    /** <code>ptValorArgumentos</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGENREPALM_TGENREPALMPTVALORARGUMENTOS = "ptValorArgumentos";
    public static final String GS_ARG_ID_TGENREPALM_TGENREPALMPTVALORARGUMENTOS = "IGl_1730192080896609Arg_2_Alias";
    /** <code>oaFichero</code> outbound argument id. */
    public static final String GS_ARG_ID_TGENREPALM_TGENREPALMOAFICHERO = "IGl_1730192080896609Arg_3_Alias";
    /** <code>oaNombreFichero</code> outbound argument id. */
    public static final String GS_ARG_ID_TGENREPALM_TGENREPALMOANOMBREFICHERO = "IGl_1730192080896609Arg_4_Alias";

    // Service (OGETREPORTE)
    /** <code>OGETREPORTE</code> service id. */
    public static final String G_SERV_ID_OGETREPORTE = "IGl_1730730786816402_Alias";
    /** <code>OGETREPORTE</code> service name. */
    public static final String G_SERV_NAME_OGETREPORTE = "OGETREPORTE";
    /** Agents allowed to execute the service OGETREPORTE **/
    public static final String GS_OGETREPORTE_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    /** <code>ptSolicitud</code> inbound argument id. */
    public static final String GS_ARG_NAME_OGETREPORTE_OGETREPORTEPTSOLICITUD = "ptSolicitud";
    public static final String GS_ARG_ID_OGETREPORTE_OGETREPORTEPTSOLICITUD = "IGl_1730730786816402Arg_1_Alias";
    /** <code>ptTipo</code> inbound argument id. */
    public static final String GS_ARG_NAME_OGETREPORTE_OGETREPORTEPTTIPO = "ptTipo";
    public static final String GS_ARG_ID_OGETREPORTE_OGETREPORTEPTTIPO = "IGl_1730730786816402Arg_5_Alias";
    /** <code>oaArchivo</code> outbound argument id. */
    public static final String GS_ARG_ID_OGETREPORTE_OGETREPORTEOAARCHIVO = "IGl_1730730786816402Arg_2_Alias";
    /** <code>oaPlantilla</code> outbound argument id. */
    public static final String GS_ARG_ID_OGETREPORTE_OGETREPORTEOAPLANTILLA = "IGl_1730730786816402Arg_6_Alias";
    /** <code>oaNombreArchivo</code> outbound argument id. */
    public static final String GS_ARG_ID_OGETREPORTE_OGETREPORTEOANOMBREARCHIVO = "IGl_1730730786816402Arg_7_Alias";

    // Service (TGRPTACTRNEW)
    /** <code>TGRPTACTRNEW</code> service id. */
    public static final String G_SERV_ID_TGRPTACTRNEW = "IGl_1738056269824016_Alias";
    /** <code>TGRPTACTRNEW</code> service name. */
    public static final String G_SERV_NAME_TGRPTACTRNEW = "TGRPTACTRNEW";
    /** Agents allowed to execute the service TGRPTACTRNEW **/
    public static final String GS_TGRPTACTRNEW_SRVAGENTS = "Admin,SuperAdmin,UsuarioSistemaExterno";
    /** <code>argumentos</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGRPTACTRNEW_TGRPTACTRNEWARGUMENTOS = "argumentos";
    public static final String GS_ARG_ID_TGRPTACTRNEW_TGRPTACTRNEWARGUMENTOS = "IGl_1738056269824016Arg_1_Alias";
    /** <code>respuesta</code> outbound argument id. */
    public static final String GS_ARG_ID_TGRPTACTRNEW_TGRPTACTRNEWRESPUESTA = "IGl_1738056269824016Arg_3_Alias";

    // Service (TGRPTACTRINC)
    /** <code>TGRPTACTRINC</code> service id. */
    public static final String G_SERV_ID_TGRPTACTRINC = "IGl_1738056663040028_Alias";
    /** <code>TGRPTACTRINC</code> service name. */
    public static final String G_SERV_NAME_TGRPTACTRINC = "TGRPTACTRINC";
    /** Agents allowed to execute the service TGRPTACTRINC **/
    public static final String GS_TGRPTACTRINC_SRVAGENTS = "Admin,SuperAdmin,UsuarioSistemaExterno";
    /** <code>argumentos</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGRPTACTRINC_TGRPTACTRINCARGUMENTOS = "argumentos";
    public static final String GS_ARG_ID_TGRPTACTRINC_TGRPTACTRINCARGUMENTOS = "IGl_1738056663040028Arg_1_Alias";
    /** <code>respuesta</code> outbound argument id. */
    public static final String GS_ARG_ID_TGRPTACTRINC_TGRPTACTRINCRESPUESTA = "IGl_1738056663040028Arg_3_Alias";

    // Service (OGSINCRONIZARPARAMETRICAS)
    /** <code>OGSINCRONIZARPARAMETRICAS</code> service id. */
    public static final String G_SERV_ID_OGSINCRONIZARPARAMETRICAS = "IGl_1765282152448646_Alias";
    /** <code>OGSINCRONIZARPARAMETRICAS</code> service name. */
    public static final String G_SERV_NAME_OGSINCRONIZARPARAMETRICAS = "OGSINCRONIZARPARAMETRICAS";
    /** Agents allowed to execute the service OGSINCRONIZARPARAMETRICAS **/
    public static final String GS_OGSINCRONIZARPARAMETRICAS_SRVAGENTS = "SuperAdmin,UsuarioSistemaExterno";

    // Service (TGFIJARDATOSSINC)
    /** <code>TGFIJARDATOSSINC</code> service id. */
    public static final String G_SERV_ID_TGFIJARDATOSSINC = "IGl_1765359747072492_Alias";
    /** <code>TGFIJARDATOSSINC</code> service name. */
    public static final String G_SERV_NAME_TGFIJARDATOSSINC = "TGFIJARDATOSSINC";
    /** Agents allowed to execute the service TGFIJARDATOSSINC **/
    public static final String GS_TGFIJARDATOSSINC_SRVAGENTS = "";
    /** <code>ptNumParametrica</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGFIJARDATOSSINC_TGFIJARDATOSSINCPTNUMPARAMETRICA = "ptNumParametrica";
    public static final String GS_ARG_ID_TGFIJARDATOSSINC_TGFIJARDATOSSINCPTNUMPARAMETRICA = "IGl_1765359747072492Arg_1_Alias";
    /** <code>ptResultado</code> inbound argument id. */
    public static final String GS_ARG_NAME_TGFIJARDATOSSINC_TGFIJARDATOSSINCPTRESULTADO = "ptResultado";
    public static final String GS_ARG_ID_TGFIJARDATOSSINC_TGFIJARDATOSSINCPTRESULTADO = "IGl_1765359747072492Arg_2_Alias";

    // User Function (fuformarListaValoresPregunta)
    /** <code>fuformarListaValoresPregunta</code> user function id. */
    public static final String UF_ID_FUFORMARLISTAVALORESPREGUNTA = "FGl_1431685169152483_Alias";
    /** <code>fuformarListaValoresPregunta</code> user function name. */
    public static final String UF_NAME_FUFORMARLISTAVALORESPREGUNTA = "fuformarListaValoresPregunta";
    /** <code>pfuPregunta</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUFORMARLISTAVALORESPREGUNTA_PFUPREGUNTA = "pfuPregunta";
    public static final String UF_ARG_ID_FUFORMARLISTAVALORESPREGUNTA_PFUPREGUNTA = "FGl_1431685169152483Arg_1_Alias";
    // User Function (fuconcatenarConNulos)
    /** <code>fuconcatenarConNulos</code> user function id. */
    public static final String UF_ID_FUCONCATENARCONNULOS = "FGl_1432117968896203_Alias";
    /** <code>fuconcatenarConNulos</code> user function name. */
    public static final String UF_NAME_FUCONCATENARCONNULOS = "fuconcatenarConNulos";
    /** <code>pfuPrefijo</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUCONCATENARCONNULOS_PFUPREFIJO = "pfuPrefijo";
    public static final String UF_ARG_ID_FUCONCATENARCONNULOS_PFUPREFIJO = "FGl_1432117968896203Arg_1_Alias";
    /** <code>pfuString</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUCONCATENARCONNULOS_PFUSTRING = "pfuString";
    public static final String UF_ARG_ID_FUCONCATENARCONNULOS_PFUSTRING = "FGl_1432117968896203Arg_2_Alias";
    // User Function (fugetTipoDirResidencial)
    /** <code>fugetTipoDirResidencial</code> user function id. */
    public static final String UF_ID_FUGETTIPODIRRESIDENCIAL = "FGl_1432215355392725_Alias";
    /** <code>fugetTipoDirResidencial</code> user function name. */
    public static final String UF_NAME_FUGETTIPODIRRESIDENCIAL = "fugetTipoDirResidencial";
    // User Function (fugetTipoDirCorrespondencia)
    /** <code>fugetTipoDirCorrespondencia</code> user function id. */
    public static final String UF_ID_FUGETTIPODIRCORRESPONDENCIA = "FGl_1432667684864966_Alias";
    /** <code>fugetTipoDirCorrespondencia</code> user function name. */
    public static final String UF_NAME_FUGETTIPODIRCORRESPONDENCIA = "fugetTipoDirCorrespondencia";
    // User Function (fuValidarEmail)
    /** <code>fuValidarEmail</code> user function id. */
    public static final String UF_ID_FUVALIDAREMAIL = "FGl_1432216797184075_Alias";
    /** <code>fuValidarEmail</code> user function name. */
    public static final String UF_NAME_FUVALIDAREMAIL = "fuValidarEmail";
    /** <code>pfuEmail</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUVALIDAREMAIL_PFUEMAIL = "pfuEmail";
    public static final String UF_ARG_ID_FUVALIDAREMAIL_PFUEMAIL = "FGl_1432216797184075Arg_1_Alias";
    // User Function (fuValidarNombre)
    /** <code>fuValidarNombre</code> user function id. */
    public static final String UF_ID_FUVALIDARNOMBRE = "FGl_1432217321472216_Alias";
    /** <code>fuValidarNombre</code> user function name. */
    public static final String UF_NAME_FUVALIDARNOMBRE = "fuValidarNombre";
    /** <code>pfuNombre</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUVALIDARNOMBRE_PFUNOMBRE = "pfuNombre";
    public static final String UF_ARG_ID_FUVALIDARNOMBRE_PFUNOMBRE = "FGl_1432217321472216Arg_1_Alias";
    // User Function (fuSoloNumeros)
    /** <code>fuSoloNumeros</code> user function id. */
    public static final String UF_ID_FUSOLONUMEROS = "FGl_1432219287552604_Alias";
    /** <code>fuSoloNumeros</code> user function name. */
    public static final String UF_NAME_FUSOLONUMEROS = "fuSoloNumeros";
    /** <code>pfuNumero</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUSOLONUMEROS_PFUNUMERO = "pfuNumero";
    public static final String UF_ARG_ID_FUSOLONUMEROS_PFUNUMERO = "FGl_1432219287552604Arg_1_Alias";
    // User Function (fuContieneCharEspecial)
    /** <code>fuContieneCharEspecial</code> user function id. */
    public static final String UF_ID_FUCONTIENECHARESPECIAL = "FGl_1432219680768213_Alias";
    /** <code>fuContieneCharEspecial</code> user function name. */
    public static final String UF_NAME_FUCONTIENECHARESPECIAL = "fuContieneCharEspecial";
    /** <code>pfustring</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUCONTIENECHARESPECIAL_PFUSTRING = "pfustring";
    public static final String UF_ARG_ID_FUCONTIENECHARESPECIAL_PFUSTRING = "FGl_1432219680768213Arg_1_Alias";
    // User Function (fugetTipoIdentificacion)
    /** <code>fugetTipoIdentificacion</code> user function id. */
    public static final String UF_ID_FUGETTIPOIDENTIFICACION = "FGl_1432221384704012_Alias";
    /** <code>fugetTipoIdentificacion</code> user function name. */
    public static final String UF_NAME_FUGETTIPOIDENTIFICACION = "fugetTipoIdentificacion";
    /** <code>pfuNombreCorto</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETTIPOIDENTIFICACION_PFUNOMBRECORTO = "pfuNombreCorto";
    public static final String UF_ARG_ID_FUGETTIPOIDENTIFICACION_PFUNOMBRECORTO = "FGl_1432221384704012Arg_1_Alias";
    // User Function (fugetEstadoCivil)
    /** <code>fugetEstadoCivil</code> user function id. */
    public static final String UF_ID_FUGETESTADOCIVIL = "FGl_1432222040064929_Alias";
    /** <code>fugetEstadoCivil</code> user function name. */
    public static final String UF_NAME_FUGETESTADOCIVIL = "fugetEstadoCivil";
    /** <code>pfuCodigo</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETESTADOCIVIL_PFUCODIGO = "pfuCodigo";
    public static final String UF_ARG_ID_FUGETESTADOCIVIL_PFUCODIGO = "FGl_1432222040064929Arg_1_Alias";
    // User Function (fugetEstadoPersona)
    /** <code>fugetEstadoPersona</code> user function id. */
    public static final String UF_ID_FUGETESTADOPERSONA = "FGl_1432222171136510_Alias";
    /** <code>fugetEstadoPersona</code> user function name. */
    public static final String UF_NAME_FUGETESTADOPERSONA = "fugetEstadoPersona";
    /** <code>pfuCodigo</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETESTADOPERSONA_PFUCODIGO = "pfuCodigo";
    public static final String UF_ARG_ID_FUGETESTADOPERSONA_PFUCODIGO = "FGl_1432222171136510Arg_1_Alias";
    // User Function (fugetPais)
    /** <code>fugetPais</code> user function id. */
    public static final String UF_ID_FUGETPAIS = "FGl_1432222171136948_Alias";
    /** <code>fugetPais</code> user function name. */
    public static final String UF_NAME_FUGETPAIS = "fugetPais";
    /** <code>pfuCodigo</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETPAIS_PFUCODIGO = "pfuCodigo";
    public static final String UF_ARG_ID_FUGETPAIS_PFUCODIGO = "FGl_1432222171136948Arg_1_Alias";
    // User Function (fuValidarTelefonoFijo)
    /** <code>fuValidarTelefonoFijo</code> user function id. */
    public static final String UF_ID_FUVALIDARTELEFONOFIJO = "FGl_1432230559744542_Alias";
    /** <code>fuValidarTelefonoFijo</code> user function name. */
    public static final String UF_NAME_FUVALIDARTELEFONOFIJO = "fuValidarTelefonoFijo";
    /** <code>pfuTelefonoFijo</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUVALIDARTELEFONOFIJO_PFUTELEFONOFIJO = "pfuTelefonoFijo";
    public static final String UF_ARG_ID_FUVALIDARTELEFONOFIJO_PFUTELEFONOFIJO = "FGl_1432230559744542Arg_1_Alias";
    // User Function (fuValidarTelefonoCelular)
    /** <code>fuValidarTelefonoCelular</code> user function id. */
    public static final String UF_ID_FUVALIDARTELEFONOCELULAR = "FGl_1432230559744200_Alias";
    /** <code>fuValidarTelefonoCelular</code> user function name. */
    public static final String UF_NAME_FUVALIDARTELEFONOCELULAR = "fuValidarTelefonoCelular";
    /** <code>pfuTelefonoCelular</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUVALIDARTELEFONOCELULAR_PFUTELEFONOCELULAR = "pfuTelefonoCelular";
    public static final String UF_ARG_ID_FUVALIDARTELEFONOCELULAR_PFUTELEFONOCELULAR = "FGl_1432230559744200Arg_1_Alias";
    // User Function (fuStrONull)
    /** <code>fuStrONull</code> user function id. */
    public static final String UF_ID_FUSTRONULL = "FGl_1432566235136818_Alias";
    /** <code>fuStrONull</code> user function name. */
    public static final String UF_NAME_FUSTRONULL = "fuStrONull";
    /** <code>pfuNumero</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUSTRONULL_PFUNUMERO = "pfuNumero";
    public static final String UF_ARG_ID_FUSTRONULL_PFUNUMERO = "FGl_1432566235136818Arg_1_Alias";
    // User Function (fugetEPSSanitas)
    /** <code>fugetEPSSanitas</code> user function id. */
    public static final String UF_ID_FUGETEPSSANITAS = "FGl_1432635310080673_Alias";
    /** <code>fugetEPSSanitas</code> user function name. */
    public static final String UF_NAME_FUGETEPSSANITAS = "fugetEPSSanitas";
    // User Function (fugetParentescoTitular)
    /** <code>fugetParentescoTitular</code> user function id. */
    public static final String UF_ID_FUGETPARENTESCOTITULAR = "FGl_1432635441152616_Alias";
    /** <code>fugetParentescoTitular</code> user function name. */
    public static final String UF_NAME_FUGETPARENTESCOTITULAR = "fugetParentescoTitular";
    // User Function (fugetCuestionarioMedico)
    /** <code>fugetCuestionarioMedico</code> user function id. */
    public static final String UF_ID_FUGETCUESTIONARIOMEDICO = "FGl_1432649465856855_Alias";
    /** <code>fugetCuestionarioMedico</code> user function name. */
    public static final String UF_NAME_FUGETCUESTIONARIOMEDICO = "fugetCuestionarioMedico";
    // User Function (fugetValorParametroConf)
    /** <code>fugetValorParametroConf</code> user function id. */
    public static final String UF_ID_FUGETVALORPARAMETROCONF = "FGl_1432652480512485_Alias";
    /** <code>fugetValorParametroConf</code> user function name. */
    public static final String UF_NAME_FUGETVALORPARAMETROCONF = "fugetValorParametroConf";
    /** <code>pfuCodigo</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETVALORPARAMETROCONF_PFUCODIGO = "pfuCodigo";
    public static final String UF_ARG_ID_FUGETVALORPARAMETROCONF_PFUCODIGO = "FGl_1432652480512485Arg_1_Alias";
    // User Function (fugetRol)
    /** <code>fugetRol</code> user function id. */
    public static final String UF_ID_FUGETROL = "FGl_1432668864512676_Alias";
    /** <code>fugetRol</code> user function name. */
    public static final String UF_NAME_FUGETROL = "fugetRol";
    /** <code>pfuNombre</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETROL_PFUNOMBRE = "pfuNombre";
    public static final String UF_ARG_ID_FUGETROL_PFUNOMBRE = "FGl_1432668864512676Arg_1_Alias";
    // User Function (fusubstringText)
    /** <code>fusubstringText</code> user function id. */
    public static final String UF_ID_FUSUBSTRINGTEXT = "FGl_1433018302464073_Alias";
    /** <code>fusubstringText</code> user function name. */
    public static final String UF_NAME_FUSUBSTRINGTEXT = "fusubstringText";
    /** <code>pfuText</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUSUBSTRINGTEXT_PFUTEXT = "pfuText";
    public static final String UF_ARG_ID_FUSUBSTRINGTEXT_PFUTEXT = "FGl_1433018302464073Arg_1_Alias";
    /** <code>pfuDesde</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUSUBSTRINGTEXT_PFUDESDE = "pfuDesde";
    public static final String UF_ARG_ID_FUSUBSTRINGTEXT_PFUDESDE = "FGl_1433018302464073Arg_3_Alias";
    /** <code>pfuHasta</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUSUBSTRINGTEXT_PFUHASTA = "pfuHasta";
    public static final String UF_ARG_ID_FUSUBSTRINGTEXT_PFUHASTA = "FGl_1433018302464073Arg_4_Alias";
    // User Function (fugetValorTarifaSegunEdad)
    /** <code>fugetValorTarifaSegunEdad</code> user function id. */
    public static final String UF_ID_FUGETVALORTARIFASEGUNEDAD = "FGl_1433264979968122_Alias";
    /** <code>fugetValorTarifaSegunEdad</code> user function name. */
    public static final String UF_NAME_FUGETVALORTARIFASEGUNEDAD = "fugetValorTarifaSegunEdad";
    /** <code>pfuProducto</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETVALORTARIFASEGUNEDAD_PFUPRODUCTO = "pfuProducto";
    public static final String UF_ARG_ID_FUGETVALORTARIFASEGUNEDAD_PFUPRODUCTO = "FGl_1433264979968122Arg_1_Alias";
    /** <code>pfuPlan</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETVALORTARIFASEGUNEDAD_PFUPLAN = "pfuPlan";
    public static final String UF_ARG_ID_FUGETVALORTARIFASEGUNEDAD_PFUPLAN = "FGl_1433264979968122Arg_2_Alias";
    /** <code>pfuEdad</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETVALORTARIFASEGUNEDAD_PFUEDAD = "pfuEdad";
    public static final String UF_ARG_ID_FUGETVALORTARIFASEGUNEDAD_PFUEDAD = "FGl_1433264979968122Arg_3_Alias";
    /** <code>pfuTipoContrato</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETVALORTARIFASEGUNEDAD_PFUTIPOCONTRATO = "pfuTipoContrato";
    public static final String UF_ARG_ID_FUGETVALORTARIFASEGUNEDAD_PFUTIPOCONTRATO = "FGl_1433264979968122Arg_4_Alias";
    /** <code>pfuVieneTraslado</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETVALORTARIFASEGUNEDAD_PFUVIENETRASLADO = "pfuVieneTraslado";
    public static final String UF_ARG_ID_FUGETVALORTARIFASEGUNEDAD_PFUVIENETRASLADO = "FGl_1433264979968122Arg_5_Alias";
    /** <code>pfuFechaContratacion</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETVALORTARIFASEGUNEDAD_PFUFECHACONTRATACION = "pfuFechaContratacion";
    public static final String UF_ARG_ID_FUGETVALORTARIFASEGUNEDAD_PFUFECHACONTRATACION = "FGl_1433264979968122Arg_6_Alias";
    // User Function (fugetGrupoAsoc)
    /** <code>fugetGrupoAsoc</code> user function id. */
    public static final String UF_ID_FUGETGRUPOASOC = "FGl_1433877348352155_Alias";
    /** <code>fugetGrupoAsoc</code> user function name. */
    public static final String UF_NAME_FUGETGRUPOASOC = "fugetGrupoAsoc";
    /** <code>pfuCodioLegal</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETGRUPOASOC_PFUCODIOLEGAL = "pfuCodioLegal";
    public static final String UF_ARG_ID_FUGETGRUPOASOC_PFUCODIOLEGAL = "FGl_1433877348352155Arg_1_Alias";
    // User Function (fugetEstadoBeneficiarioCORE)
    /** <code>fugetEstadoBeneficiarioCORE</code> user function id. */
    public static final String UF_ID_FUGETESTADOBENEFICIARIOCORE = "FGl_1433942884352448_Alias";
    /** <code>fugetEstadoBeneficiarioCORE</code> user function name. */
    public static final String UF_NAME_FUGETESTADOBENEFICIARIOCORE = "fugetEstadoBeneficiarioCORE";
    /** <code>pfuCodigo</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETESTADOBENEFICIARIOCORE_PFUCODIGO = "pfuCodigo";
    public static final String UF_ARG_ID_FUGETESTADOBENEFICIARIOCORE_PFUCODIGO = "FGl_1433942884352448Arg_1_Alias";
    // User Function (fuObtenerDocumento)
    /** <code>fuObtenerDocumento</code> user function id. */
    public static final String UF_ID_FUOBTENERDOCUMENTO = "FGl_1434447511552785_Alias";
    /** <code>fuObtenerDocumento</code> user function name. */
    public static final String UF_NAME_FUOBTENERDOCUMENTO = "fuObtenerDocumento";
    /** <code>pPathCompleto</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUOBTENERDOCUMENTO_PPATHCOMPLETO = "pPathCompleto";
    public static final String UF_ARG_ID_FUOBTENERDOCUMENTO_PPATHCOMPLETO = "FGl_1434447511552785Arg_1_Alias";
    // User Function (fugetPeriodicidadMensual)
    /** <code>fugetPeriodicidadMensual</code> user function id. */
    public static final String UF_ID_FUGETPERIODICIDADMENSUAL = "FGl_1435230535680639_Alias";
    /** <code>fugetPeriodicidadMensual</code> user function name. */
    public static final String UF_NAME_FUGETPERIODICIDADMENSUAL = "fugetPeriodicidadMensual";
    // User Function (fugetPlantillaEmail)
    /** <code>fugetPlantillaEmail</code> user function id. */
    public static final String UF_ID_FUGETPLANTILLAEMAIL = "FGl_1436291956736132_Alias";
    /** <code>fugetPlantillaEmail</code> user function name. */
    public static final String UF_NAME_FUGETPLANTILLAEMAIL = "fugetPlantillaEmail";
    /** <code>pfuCodigo</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETPLANTILLAEMAIL_PFUCODIGO = "pfuCodigo";
    public static final String UF_ARG_ID_FUGETPLANTILLAEMAIL_PFUCODIGO = "FGl_1436291956736132Arg_1_Alias";
    /** <code>pfSolicitud</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETPLANTILLAEMAIL_PFSOLICITUD = "pfSolicitud";
    public static final String UF_ARG_ID_FUGETPLANTILLAEMAIL_PFSOLICITUD = "FGl_1436291956736132Arg_2_Alias";
    // User Function (fuSustituirParamsEnURL)
    /** <code>fuSustituirParamsEnURL</code> user function id. */
    public static final String UF_ID_FUSUSTITUIRPARAMSENURL = "FGl_1436469297152771_Alias";
    /** <code>fuSustituirParamsEnURL</code> user function name. */
    public static final String UF_NAME_FUSUSTITUIRPARAMSENURL = "fuSustituirParamsEnURL";
    /** <code>pfuURL</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUSUSTITUIRPARAMSENURL_PFUURL = "pfuURL";
    public static final String UF_ARG_ID_FUSUSTITUIRPARAMSENURL_PFUURL = "FGl_1436469297152771Arg_1_Alias";
    /** <code>pfuSolicitud</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUSUSTITUIRPARAMSENURL_PFUSOLICITUD = "pfuSolicitud";
    public static final String UF_ARG_ID_FUSUSTITUIRPARAMSENURL_PFUSOLICITUD = "FGl_1436469297152771Arg_2_Alias";
    // User Function (fuEnviarEmail)
    /** <code>fuEnviarEmail</code> user function id. */
    public static final String UF_ID_FUENVIAREMAIL = "FGl_1436470083584835_Alias";
    /** <code>fuEnviarEmail</code> user function name. */
    public static final String UF_NAME_FUENVIAREMAIL = "fuEnviarEmail";
    /** <code>pfuAsunto</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUENVIAREMAIL_PFUASUNTO = "pfuAsunto";
    public static final String UF_ARG_ID_FUENVIAREMAIL_PFUASUNTO = "FGl_1436470083584835Arg_1_Alias";
    /** <code>pfuDestinatario</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUENVIAREMAIL_PFUDESTINATARIO = "pfuDestinatario";
    public static final String UF_ARG_ID_FUENVIAREMAIL_PFUDESTINATARIO = "FGl_1436470083584835Arg_2_Alias";
    /** <code>pfuEmailConfirmacion</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUENVIAREMAIL_PFUEMAILCONFIRMACION = "pfuEmailConfirmacion";
    public static final String UF_ARG_ID_FUENVIAREMAIL_PFUEMAILCONFIRMACION = "FGl_1436470083584835Arg_3_Alias";
    /** <code>pfuCuerpo</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUENVIAREMAIL_PFUCUERPO = "pfuCuerpo";
    public static final String UF_ARG_ID_FUENVIAREMAIL_PFUCUERPO = "FGl_1436470083584835Arg_4_Alias";
    /** <code>pfuNombreAdjunto</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUENVIAREMAIL_PFUNOMBREADJUNTO = "pfuNombreAdjunto";
    public static final String UF_ARG_ID_FUENVIAREMAIL_PFUNOMBREADJUNTO = "FGl_1436470083584835Arg_5_Alias";
    /** <code>pfuAdjunto</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUENVIAREMAIL_PFUADJUNTO = "pfuAdjunto";
    public static final String UF_ARG_ID_FUENVIAREMAIL_PFUADJUNTO = "FGl_1436470083584835Arg_6_Alias";
    /** <code>pfuNumSolicitud</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUENVIAREMAIL_PFUNUMSOLICITUD = "pfuNumSolicitud";
    public static final String UF_ARG_ID_FUENVIAREMAIL_PFUNUMSOLICITUD = "FGl_1436470083584835Arg_7_Alias";
    // User Function (fuAnadirTexto)
    /** <code>fuAnadirTexto</code> user function id. */
    public static final String UF_ID_FUANADIRTEXTO = "FGl_1436472049664273_Alias";
    /** <code>fuAnadirTexto</code> user function name. */
    public static final String UF_NAME_FUANADIRTEXTO = "fuAnadirTexto";
    /** <code>pfuTexto</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUANADIRTEXTO_PFUTEXTO = "pfuTexto";
    public static final String UF_ARG_ID_FUANADIRTEXTO_PFUTEXTO = "FGl_1436472049664273Arg_1_Alias";
    /** <code>pfuAnadir</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUANADIRTEXTO_PFUANADIR = "pfuAnadir";
    public static final String UF_ARG_ID_FUANADIRTEXTO_PFUANADIR = "FGl_1436472049664273Arg_2_Alias";
    // User Function (fugetEstadoContrato)
    /** <code>fugetEstadoContrato</code> user function id. */
    public static final String UF_ID_FUGETESTADOCONTRATO = "FGl_1436520939520301_Alias";
    /** <code>fugetEstadoContrato</code> user function name. */
    public static final String UF_NAME_FUGETESTADOCONTRATO = "fugetEstadoContrato";
    /** <code>pfuCodigo</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETESTADOCONTRATO_PFUCODIGO = "pfuCodigo";
    public static final String UF_ARG_ID_FUGETESTADOCONTRATO_PFUCODIGO = "FGl_1436520939520301Arg_1_Alias";
    // User Function (fugetDepartamentoCL)
    /** <code>fugetDepartamentoCL</code> user function id. */
    public static final String UF_ID_FUGETDEPARTAMENTOCL = "FGl_1437649993728064_Alias";
    /** <code>fugetDepartamentoCL</code> user function name. */
    public static final String UF_NAME_FUGETDEPARTAMENTOCL = "fugetDepartamentoCL";
    /** <code>pfuCodigoLegal</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETDEPARTAMENTOCL_PFUCODIGOLEGAL = "pfuCodigoLegal";
    public static final String UF_ARG_ID_FUGETDEPARTAMENTOCL_PFUCODIGOLEGAL = "FGl_1437649993728064Arg_1_Alias";
    // User Function (fugetSolicitudByNumero)
    /** <code>fugetSolicitudByNumero</code> user function id. */
    public static final String UF_ID_FUGETSOLICITUDBYNUMERO = "FGl_1437649993728658_Alias";
    /** <code>fugetSolicitudByNumero</code> user function name. */
    public static final String UF_NAME_FUGETSOLICITUDBYNUMERO = "fugetSolicitudByNumero";
    /** <code>pfuNumSolicitud</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETSOLICITUDBYNUMERO_PFUNUMSOLICITUD = "pfuNumSolicitud";
    public static final String UF_ARG_ID_FUGETSOLICITUDBYNUMERO_PFUNUMSOLICITUD = "FGl_1437649993728658Arg_1_Alias";
    // User Function (fugetAgente)
    /** <code>fugetAgente</code> user function id. */
    public static final String UF_ID_FUGETAGENTE = "FGl_1441359986688964_Alias";
    /** <code>fugetAgente</code> user function name. */
    public static final String UF_NAME_FUGETAGENTE = "fugetAgente";
    /** <code>pfuLogin</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETAGENTE_PFULOGIN = "pfuLogin";
    public static final String UF_ARG_ID_FUGETAGENTE_PFULOGIN = "FGl_1441359986688964Arg_1_Alias";
    // User Function (fuBuscarDocGestorNumId)
    /** <code>fuBuscarDocGestorNumId</code> user function id. */
    public static final String UF_ID_FUBUSCARDOCGESTORNUMID = "FGl_1442703212544075_Alias";
    /** <code>fuBuscarDocGestorNumId</code> user function name. */
    public static final String UF_NAME_FUBUSCARDOCGESTORNUMID = "fuBuscarDocGestorNumId";
    /** <code>pfuNumIdentificacion</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUBUSCARDOCGESTORNUMID_PFUNUMIDENTIFICACION = "pfuNumIdentificacion";
    public static final String UF_ARG_ID_FUBUSCARDOCGESTORNUMID_PFUNUMIDENTIFICACION = "FGl_1442703212544075Arg_1_Alias";
    /** <code>pfuNumSolicitud</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUBUSCARDOCGESTORNUMID_PFUNUMSOLICITUD = "pfuNumSolicitud";
    public static final String UF_ARG_ID_FUBUSCARDOCGESTORNUMID_PFUNUMSOLICITUD = "FGl_1442703212544075Arg_2_Alias";
    // User Function (fuBuscarDocGestorSolicitud)
    /** <code>fuBuscarDocGestorSolicitud</code> user function id. */
    public static final String UF_ID_FUBUSCARDOCGESTORSOLICITUD = "FGl_1442703212544535_Alias";
    /** <code>fuBuscarDocGestorSolicitud</code> user function name. */
    public static final String UF_NAME_FUBUSCARDOCGESTORSOLICITUD = "fuBuscarDocGestorSolicitud";
    /** <code>pfuNumSolicitud</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUBUSCARDOCGESTORSOLICITUD_PFUNUMSOLICITUD = "pfuNumSolicitud";
    public static final String UF_ARG_ID_FUBUSCARDOCGESTORSOLICITUD_PFUNUMSOLICITUD = "FGl_1442703212544535Arg_1_Alias";
    /** <code>pfuNumIdentidad</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUBUSCARDOCGESTORSOLICITUD_PFUNUMIDENTIDAD = "pfuNumIdentidad";
    public static final String UF_ARG_ID_FUBUSCARDOCGESTORSOLICITUD_PFUNUMIDENTIDAD = "FGl_1442703212544535Arg_2_Alias";
    // User Function (fuSoloLetras)
    /** <code>fuSoloLetras</code> user function id. */
    public static final String UF_ID_FUSOLOLETRAS = "FGl_1445333434368105_Alias";
    /** <code>fuSoloLetras</code> user function name. */
    public static final String UF_NAME_FUSOLOLETRAS = "fuSoloLetras";
    /** <code>pfuNumero</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUSOLOLETRAS_PFUNUMERO = "pfuNumero";
    public static final String UF_ARG_ID_FUSOLOLETRAS_PFUNUMERO = "FGl_1445333434368105Arg_1_Alias";
    // User Function (fuGetTextoProteccionDatos)
    /** <code>fuGetTextoProteccionDatos</code> user function id. */
    public static final String UF_ID_FUGETTEXTOPROTECCIONDATOS = "FGl_1447090454528301_Alias";
    /** <code>fuGetTextoProteccionDatos</code> user function name. */
    public static final String UF_NAME_FUGETTEXTOPROTECCIONDATOS = "fuGetTextoProteccionDatos";
    // User Function (fugetAsesor)
    /** <code>fugetAsesor</code> user function id. */
    public static final String UF_ID_FUGETASESOR = "FGl_1450349690880702_Alias";
    /** <code>fugetAsesor</code> user function name. */
    public static final String UF_NAME_FUGETASESOR = "fugetAsesor";
    /** <code>pfuUsuario</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETASESOR_PFUUSUARIO = "pfuUsuario";
    public static final String UF_ARG_ID_FUGETASESOR_PFUUSUARIO = "FGl_1450349690880702Arg_1_Alias";
    // User Function (fugetMunicipioCL)
    /** <code>fugetMunicipioCL</code> user function id. */
    public static final String UF_ID_FUGETMUNICIPIOCL = "FGl_1458304712704876_Alias";
    /** <code>fugetMunicipioCL</code> user function name. */
    public static final String UF_NAME_FUGETMUNICIPIOCL = "fugetMunicipioCL";
    /** <code>pfCodLegal</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETMUNICIPIOCL_PFCODLEGAL = "pfCodLegal";
    public static final String UF_ARG_ID_FUGETMUNICIPIOCL_PFCODLEGAL = "FGl_1458304712704876Arg_1_Alias";
    // User Function (fuGetDirResidenciaPersona)
    /** <code>fuGetDirResidenciaPersona</code> user function id. */
    public static final String UF_ID_FUGETDIRRESIDENCIAPERSONA = "FGl_1460475658240677_Alias";
    /** <code>fuGetDirResidenciaPersona</code> user function name. */
    public static final String UF_NAME_FUGETDIRRESIDENCIAPERSONA = "fuGetDirResidenciaPersona";
    /** <code>pfPersona</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETDIRRESIDENCIAPERSONA_PFPERSONA = "pfPersona";
    public static final String UF_ARG_ID_FUGETDIRRESIDENCIAPERSONA_PFPERSONA = "FGl_1460475658240677Arg_1_Alias";
    // User Function (fuGetTextoAvisoFirma)
    /** <code>fuGetTextoAvisoFirma</code> user function id. */
    public static final String UF_ID_FUGETTEXTOAVISOFIRMA = "FGl_1460476313600282_Alias";
    /** <code>fuGetTextoAvisoFirma</code> user function name. */
    public static final String UF_NAME_FUGETTEXTOAVISOFIRMA = "fuGetTextoAvisoFirma";
    /** <code>pfFirma</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETTEXTOAVISOFIRMA_PFFIRMA = "pfFirma";
    public static final String UF_ARG_ID_FUGETTEXTOAVISOFIRMA_PFFIRMA = "FGl_1460476313600282Arg_1_Alias";
    // User Function (fugetListaErrores)
    /** <code>fugetListaErrores</code> user function id. */
    public static final String UF_ID_FUGETLISTAERRORES = "FGl_1460622327808896_Alias";
    /** <code>fugetListaErrores</code> user function name. */
    public static final String UF_NAME_FUGETLISTAERRORES = "fugetListaErrores";
    /** <code>pfSolicitud</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETLISTAERRORES_PFSOLICITUD = "pfSolicitud";
    public static final String UF_ARG_ID_FUGETLISTAERRORES_PFSOLICITUD = "FGl_1460622327808896Arg_1_Alias";
    // User Function (fuGetCodTarifaProdPlanAnyo)
    /** <code>fuGetCodTarifaProdPlanAnyo</code> user function id. */
    public static final String UF_ID_FUGETCODTARIFAPRODPLANANYO = "FGl_1466418331648225_Alias";
    /** <code>fuGetCodTarifaProdPlanAnyo</code> user function name. */
    public static final String UF_NAME_FUGETCODTARIFAPRODPLANANYO = "fuGetCodTarifaProdPlanAnyo";
    /** <code>pfProducto</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETCODTARIFAPRODPLANANYO_PFPRODUCTO = "pfProducto";
    public static final String UF_ARG_ID_FUGETCODTARIFAPRODPLANANYO_PFPRODUCTO = "FGl_1466418331648225Arg_1_Alias";
    /** <code>pfPlan</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETCODTARIFAPRODPLANANYO_PFPLAN = "pfPlan";
    public static final String UF_ARG_ID_FUGETCODTARIFAPRODPLANANYO_PFPLAN = "FGl_1466418331648225Arg_2_Alias";
    /** <code>pfAnyo</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETCODTARIFAPRODPLANANYO_PFANYO = "pfAnyo";
    public static final String UF_ARG_ID_FUGETCODTARIFAPRODPLANANYO_PFANYO = "FGl_1466418331648225Arg_3_Alias";
    /** <code>pfTipoContrato</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETCODTARIFAPRODPLANANYO_PFTIPOCONTRATO = "pfTipoContrato";
    public static final String UF_ARG_ID_FUGETCODTARIFAPRODPLANANYO_PFTIPOCONTRATO = "FGl_1466418331648225Arg_4_Alias";
    // User Function (fugetProductoPorCL)
    /** <code>fugetProductoPorCL</code> user function id. */
    public static final String UF_ID_FUGETPRODUCTOPORCL = "FGl_1474558296064766_Alias";
    /** <code>fugetProductoPorCL</code> user function name. */
    public static final String UF_NAME_FUGETPRODUCTOPORCL = "fugetProductoPorCL";
    /** <code>pfCodLegalProd</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETPRODUCTOPORCL_PFCODLEGALPROD = "pfCodLegalProd";
    public static final String UF_ARG_ID_FUGETPRODUCTOPORCL_PFCODLEGALPROD = "FGl_1474558296064766Arg_1_Alias";
    // User Function (fugetPlanPorCL)
    /** <code>fugetPlanPorCL</code> user function id. */
    public static final String UF_ID_FUGETPLANPORCL = "FGl_1474558296064682_Alias";
    /** <code>fugetPlanPorCL</code> user function name. */
    public static final String UF_NAME_FUGETPLANPORCL = "fugetPlanPorCL";
    /** <code>pfCodLegalPlan</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETPLANPORCL_PFCODLEGALPLAN = "pfCodLegalPlan";
    public static final String UF_ARG_ID_FUGETPLANPORCL_PFCODLEGALPLAN = "FGl_1474558296064682Arg_1_Alias";
    // User Function (fugetFuncionarioPorLDAP)
    /** <code>fugetFuncionarioPorLDAP</code> user function id. */
    public static final String UF_ID_FUGETFUNCIONARIOPORLDAP = "FGl_1476177690624493_Alias";
    /** <code>fugetFuncionarioPorLDAP</code> user function name. */
    public static final String UF_NAME_FUGETFUNCIONARIOPORLDAP = "fugetFuncionarioPorLDAP";
    /** <code>pfUsuLDAP</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETFUNCIONARIOPORLDAP_PFUSULDAP = "pfUsuLDAP";
    public static final String UF_ARG_ID_FUGETFUNCIONARIOPORLDAP_PFUSULDAP = "FGl_1476177690624493Arg_1_Alias";
    // User Function (fuFormarTextoObservaciones)
    /** <code>fuFormarTextoObservaciones</code> user function id. */
    public static final String UF_ID_FUFORMARTEXTOOBSERVACIONES = "FGl_1476883120128428_Alias";
    /** <code>fuFormarTextoObservaciones</code> user function name. */
    public static final String UF_NAME_FUFORMARTEXTOOBSERVACIONES = "fuFormarTextoObservaciones";
    /** <code>pfSolicitud</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUFORMARTEXTOOBSERVACIONES_PFSOLICITUD = "pfSolicitud";
    public static final String UF_ARG_ID_FUFORMARTEXTOOBSERVACIONES_PFSOLICITUD = "FGl_1476883120128428Arg_1_Alias";
    // User Function (fuGetCodigoPersonaCORE)
    /** <code>fuGetCodigoPersonaCORE</code> user function id. */
    public static final String UF_ID_FUGETCODIGOPERSONACORE = "FGl_1495619731456178_Alias";
    /** <code>fuGetCodigoPersonaCORE</code> user function name. */
    public static final String UF_NAME_FUGETCODIGOPERSONACORE = "fuGetCodigoPersonaCORE";
    /** <code>tipoId</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETCODIGOPERSONACORE_TIPOID = "tipoId";
    public static final String UF_ARG_ID_FUGETCODIGOPERSONACORE_TIPOID = "FGl_1495619731456178Arg_1_Alias";
    /** <code>numId</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETCODIGOPERSONACORE_NUMID = "numId";
    public static final String UF_ARG_ID_FUGETCODIGOPERSONACORE_NUMID = "FGl_1495619731456178Arg_2_Alias";
    /** <code>numSolicitud</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETCODIGOPERSONACORE_NUMSOLICITUD = "numSolicitud";
    public static final String UF_ARG_ID_FUGETCODIGOPERSONACORE_NUMSOLICITUD = "FGl_1495619731456178Arg_3_Alias";
    // User Function (fuGetFechaFinVigenciaUsuario)
    /** <code>fuGetFechaFinVigenciaUsuario</code> user function id. */
    public static final String UF_ID_FUGETFECHAFINVIGENCIAUSUARIO = "FGl_1497883344896693_Alias";
    /** <code>fuGetFechaFinVigenciaUsuario</code> user function name. */
    public static final String UF_NAME_FUGETFECHAFINVIGENCIAUSUARIO = "fuGetFechaFinVigenciaUsuario";
    /** <code>pfTipoIdentificacion</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETFECHAFINVIGENCIAUSUARIO_PFTIPOIDENTIFICACION = "pfTipoIdentificacion";
    public static final String UF_ARG_ID_FUGETFECHAFINVIGENCIAUSUARIO_PFTIPOIDENTIFICACION = "FGl_1497883344896693Arg_1_Alias";
    /** <code>pfNumIdentificacion</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETFECHAFINVIGENCIAUSUARIO_PFNUMIDENTIFICACION = "pfNumIdentificacion";
    public static final String UF_ARG_ID_FUGETFECHAFINVIGENCIAUSUARIO_PFNUMIDENTIFICACION = "FGl_1497883344896693Arg_2_Alias";
    /** <code>pfNumSolicitud</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETFECHAFINVIGENCIAUSUARIO_PFNUMSOLICITUD = "pfNumSolicitud";
    public static final String UF_ARG_ID_FUGETFECHAFINVIGENCIAUSUARIO_PFNUMSOLICITUD = "FGl_1497883344896693Arg_3_Alias";
    // User Function (fuGetNombreAsesor)
    /** <code>fuGetNombreAsesor</code> user function id. */
    public static final String UF_ID_FUGETNOMBREASESOR = "FGl_1498056491008961_Alias";
    /** <code>fuGetNombreAsesor</code> user function name. */
    public static final String UF_NAME_FUGETNOMBREASESOR = "fuGetNombreAsesor";
    /** <code>pfUsuario</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETNOMBREASESOR_PFUSUARIO = "pfUsuario";
    public static final String UF_ARG_ID_FUGETNOMBREASESOR_PFUSUARIO = "FGl_1498056491008961Arg_2_Alias";
    // User Function (fuGetNombreFuncionario)
    /** <code>fuGetNombreFuncionario</code> user function id. */
    public static final String UF_ID_FUGETNOMBREFUNCIONARIO = "FGl_1502094163968531_Alias";
    /** <code>fuGetNombreFuncionario</code> user function name. */
    public static final String UF_NAME_FUGETNOMBREFUNCIONARIO = "fuGetNombreFuncionario";
    /** <code>pfUsuario</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETNOMBREFUNCIONARIO_PFUSUARIO = "pfUsuario";
    public static final String UF_ARG_ID_FUGETNOMBREFUNCIONARIO_PFUSUARIO = "FGl_1502094163968531Arg_1_Alias";
    // User Function (fuformarMsgErrorUsrSinDocs)
    /** <code>fuformarMsgErrorUsrSinDocs</code> user function id. */
    public static final String UF_ID_FUFORMARMSGERRORUSRSINDOCS = "FGl_1517844168704946_Alias";
    /** <code>fuformarMsgErrorUsrSinDocs</code> user function name. */
    public static final String UF_NAME_FUFORMARMSGERRORUSRSINDOCS = "fuformarMsgErrorUsrSinDocs";
    /** <code>pfSolicitud</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUFORMARMSGERRORUSRSINDOCS_PFSOLICITUD = "pfSolicitud";
    public static final String UF_ARG_ID_FUFORMARMSGERRORUSRSINDOCS_PFSOLICITUD = "FGl_1517844168704946Arg_1_Alias";
    // User Function (fuEnviarEmailDevDoc)
    /** <code>fuEnviarEmailDevDoc</code> user function id. */
    public static final String UF_ID_FUENVIAREMAILDEVDOC = "FGl_1518019936256440_Alias";
    /** <code>fuEnviarEmailDevDoc</code> user function name. */
    public static final String UF_NAME_FUENVIAREMAILDEVDOC = "fuEnviarEmailDevDoc";
    /** <code>pfAsunto</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUENVIAREMAILDEVDOC_PFASUNTO = "pfAsunto";
    public static final String UF_ARG_ID_FUENVIAREMAILDEVDOC_PFASUNTO = "FGl_1518019936256440Arg_1_Alias";
    /** <code>pfCuerpo</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUENVIAREMAILDEVDOC_PFCUERPO = "pfCuerpo";
    public static final String UF_ARG_ID_FUENVIAREMAILDEVDOC_PFCUERPO = "FGl_1518019936256440Arg_2_Alias";
    /** <code>pfDestinatario</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUENVIAREMAILDEVDOC_PFDESTINATARIO = "pfDestinatario";
    public static final String UF_ARG_ID_FUENVIAREMAILDEVDOC_PFDESTINATARIO = "FGl_1518019936256440Arg_3_Alias";
    /** <code>pfEmailConf</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUENVIAREMAILDEVDOC_PFEMAILCONF = "pfEmailConf";
    public static final String UF_ARG_ID_FUENVIAREMAILDEVDOC_PFEMAILCONF = "FGl_1518019936256440Arg_4_Alias";
    /** <code>ptObservaciones</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUENVIAREMAILDEVDOC_PTOBSERVACIONES = "ptObservaciones";
    public static final String UF_ARG_ID_FUENVIAREMAILDEVDOC_PTOBSERVACIONES = "FGl_1518019936256440Arg_5_Alias";
    /** <code>pfNumSolicitud</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUENVIAREMAILDEVDOC_PFNUMSOLICITUD = "pfNumSolicitud";
    public static final String UF_ARG_ID_FUENVIAREMAILDEVDOC_PFNUMSOLICITUD = "FGl_1518019936256440Arg_6_Alias";
    // User Function (fuContratoExentoDocSol)
    /** <code>fuContratoExentoDocSol</code> user function id. */
    public static final String UF_ID_FUCONTRATOEXENTODOCSOL = "FGl_1518446051328638_Alias";
    /** <code>fuContratoExentoDocSol</code> user function name. */
    public static final String UF_NAME_FUCONTRATOEXENTODOCSOL = "fuContratoExentoDocSol";
    /** <code>pfNumContrato</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUCONTRATOEXENTODOCSOL_PFNUMCONTRATO = "pfNumContrato";
    public static final String UF_ARG_ID_FUCONTRATOEXENTODOCSOL_PFNUMCONTRATO = "FGl_1518446051328638Arg_1_Alias";
    // User Function (fuEstadoSolicitud)
    /** <code>fuEstadoSolicitud</code> user function id. */
    public static final String UF_ID_FUESTADOSOLICITUD = "FGl_1537796472832335_Alias";
    /** <code>fuEstadoSolicitud</code> user function name. */
    public static final String UF_NAME_FUESTADOSOLICITUD = "fuEstadoSolicitud";
    /** <code>pfEstadoSol</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUESTADOSOLICITUD_PFESTADOSOL = "pfEstadoSol";
    public static final String UF_ARG_ID_FUESTADOSOLICITUD_PFESTADOSOL = "FGl_1537796472832335Arg_1_Alias";
    // User Function (fuGenerarReporteOracle)
    /** <code>fuGenerarReporteOracle</code> user function id. */
    public static final String UF_ID_FUGENERARREPORTEORACLE = "FGl_1547029446656273_Alias";
    /** <code>fuGenerarReporteOracle</code> user function name. */
    public static final String UF_NAME_FUGENERARREPORTEORACLE = "fuGenerarReporteOracle";
    /** <code>pfNombreReporte</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGENERARREPORTEORACLE_PFNOMBREREPORTE = "pfNombreReporte";
    public static final String UF_ARG_ID_FUGENERARREPORTEORACLE_PFNOMBREREPORTE = "FGl_1547029446656273Arg_1_Alias";
    /** <code>pfUsuario</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGENERARREPORTEORACLE_PFUSUARIO = "pfUsuario";
    public static final String UF_ARG_ID_FUGENERARREPORTEORACLE_PFUSUARIO = "FGl_1547029446656273Arg_5_Alias";
    /** <code>pfParametros</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGENERARREPORTEORACLE_PFPARAMETROS = "pfParametros";
    public static final String UF_ARG_ID_FUGENERARREPORTEORACLE_PFPARAMETROS = "FGl_1547029446656273Arg_4_Alias";
    // User Function (fuCalcularIMC)
    /** <code>fuCalcularIMC</code> user function id. */
    public static final String UF_ID_FUCALCULARIMC = "FGl_1547048845312646_Alias";
    /** <code>fuCalcularIMC</code> user function name. */
    public static final String UF_NAME_FUCALCULARIMC = "fuCalcularIMC";
    /** <code>pfPersonaC</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUCALCULARIMC_PFPERSONAC = "pfPersonaC";
    public static final String UF_ARG_ID_FUCALCULARIMC_PFPERSONAC = "FGl_1547048845312646Arg_1_Alias";
    // User Function (fuGetEstadoPersonaError)
    /** <code>fuGetEstadoPersonaError</code> user function id. */
    public static final String UF_ID_FUGETESTADOPERSONAERROR = "FGl_1558339256320830_Alias";
    /** <code>fuGetEstadoPersonaError</code> user function name. */
    public static final String UF_NAME_FUGETESTADOPERSONAERROR = "fuGetEstadoPersonaError";
    // User Function (fuCalcularIMCUsuario)
    /** <code>fuCalcularIMCUsuario</code> user function id. */
    public static final String UF_ID_FUCALCULARIMCUSUARIO = "FGl_1558339911680537_Alias";
    /** <code>fuCalcularIMCUsuario</code> user function name. */
    public static final String UF_NAME_FUCALCULARIMCUSUARIO = "fuCalcularIMCUsuario";
    /** <code>pfUsuario</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUCALCULARIMCUSUARIO_PFUSUARIO = "pfUsuario";
    public static final String UF_ARG_ID_FUCALCULARIMCUSUARIO_PFUSUARIO = "FGl_1558339911680537Arg_1_Alias";
    // User Function (fuEnviarSMS)
    /** <code>fuEnviarSMS</code> user function id. */
    public static final String UF_ID_FUENVIARSMS = "FGl_1559206559744647_Alias";
    /** <code>fuEnviarSMS</code> user function name. */
    public static final String UF_NAME_FUENVIARSMS = "fuEnviarSMS";
    /** <code>pfSolicitud</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUENVIARSMS_PFSOLICITUD = "pfSolicitud";
    public static final String UF_ARG_ID_FUENVIARSMS_PFSOLICITUD = "FGl_1559206559744647Arg_1_Alias";
    /** <code>pfNumCelulcar</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUENVIARSMS_PFNUMCELULCAR = "pfNumCelulcar";
    public static final String UF_ARG_ID_FUENVIARSMS_PFNUMCELULCAR = "FGl_1559206559744647Arg_2_Alias";
    /** <code>pfPlantilla</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUENVIARSMS_PFPLANTILLA = "pfPlantilla";
    public static final String UF_ARG_ID_FUENVIARSMS_PFPLANTILLA = "FGl_1559206559744647Arg_3_Alias";
    // User Function (fugetFuncionarioPorId)
    /** <code>fugetFuncionarioPorId</code> user function id. */
    public static final String UF_ID_FUGETFUNCIONARIOPORID = "FGl_1587626639360151_Alias";
    /** <code>fugetFuncionarioPorId</code> user function name. */
    public static final String UF_NAME_FUGETFUNCIONARIOPORID = "fugetFuncionarioPorId";
    /** <code>pfIdFuncionario</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETFUNCIONARIOPORID_PFIDFUNCIONARIO = "pfIdFuncionario";
    public static final String UF_ARG_ID_FUGETFUNCIONARIOPORID_PFIDFUNCIONARIO = "FGl_1587626639360151Arg_1_Alias";
    // User Function (fuCallSPgetusugrabador)
    /** <code>fuCallSPgetusugrabador</code> user function id. */
    public static final String UF_ID_FUCALLSPGETUSUGRABADOR = "FGl_1587626770432978_Alias";
    /** <code>fuCallSPgetusugrabador</code> user function name. */
    public static final String UF_NAME_FUCALLSPGETUSUGRABADOR = "fuCallSPgetusugrabador";
    /** <code>pfIdSolicitud</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUCALLSPGETUSUGRABADOR_PFIDSOLICITUD = "pfIdSolicitud";
    public static final String UF_ARG_ID_FUCALLSPGETUSUGRABADOR_PFIDSOLICITUD = "FGl_1587626770432978Arg_1_Alias";
    // User Function (fuCallSPgetusugrabadornov)
    /** <code>fuCallSPgetusugrabadornov</code> user function id. */
    public static final String UF_ID_FUCALLSPGETUSUGRABADORNOV = "FGl_1587626770432389_Alias";
    /** <code>fuCallSPgetusugrabadornov</code> user function name. */
    public static final String UF_NAME_FUCALLSPGETUSUGRABADORNOV = "fuCallSPgetusugrabadornov";
    /** <code>pfIdSolcitudNov</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUCALLSPGETUSUGRABADORNOV_PFIDSOLCITUDNOV = "pfIdSolcitudNov";
    public static final String UF_ARG_ID_FUCALLSPGETUSUGRABADORNOV_PFIDSOLCITUDNOV = "FGl_1587626770432389Arg_1_Alias";
    // User Function (fuCallSPgetusuareamed)
    /** <code>fuCallSPgetusuareamed</code> user function id. */
    public static final String UF_ID_FUCALLSPGETUSUAREAMED = "FGl_1587626901504237_Alias";
    /** <code>fuCallSPgetusuareamed</code> user function name. */
    public static final String UF_NAME_FUCALLSPGETUSUAREAMED = "fuCallSPgetusuareamed";
    /** <code>pfIdSolicitud</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUCALLSPGETUSUAREAMED_PFIDSOLICITUD = "pfIdSolicitud";
    public static final String UF_ARG_ID_FUCALLSPGETUSUAREAMED_PFIDSOLICITUD = "FGl_1587626901504237Arg_1_Alias";
    // User Function (fugetAreaMedicaPorId)
    /** <code>fugetAreaMedicaPorId</code> user function id. */
    public static final String UF_ID_FUGETAREAMEDICAPORID = "FGl_1587627425792710_Alias";
    /** <code>fugetAreaMedicaPorId</code> user function name. */
    public static final String UF_NAME_FUGETAREAMEDICAPORID = "fugetAreaMedicaPorId";
    /** <code>pfIdAreaMedica</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETAREAMEDICAPORID_PFIDAREAMEDICA = "pfIdAreaMedica";
    public static final String UF_ARG_ID_FUGETAREAMEDICAPORID_PFIDAREAMEDICA = "FGl_1587627425792710Arg_1_Alias";
    // User Function (fugetPrioridad)
    /** <code>fugetPrioridad</code> user function id. */
    public static final String UF_ID_FUGETPRIORIDAD = "FGl_1587634896896699_Alias";
    /** <code>fugetPrioridad</code> user function name. */
    public static final String UF_NAME_FUGETPRIORIDAD = "fugetPrioridad";
    /** <code>pfEstadoSol</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETPRIORIDAD_PFESTADOSOL = "pfEstadoSol";
    public static final String UF_ARG_ID_FUGETPRIORIDAD_PFESTADOSOL = "FGl_1587634896896699Arg_1_Alias";
    /** <code>pfEstadoDoc</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETPRIORIDAD_PFESTADODOC = "pfEstadoDoc";
    public static final String UF_ARG_ID_FUGETPRIORIDAD_PFESTADODOC = "FGl_1587634896896699Arg_2_Alias";
    // User Function (fuCallSPgetsemaforograbador)
    /** <code>fuCallSPgetsemaforograbador</code> user function id. */
    public static final String UF_ID_FUCALLSPGETSEMAFOROGRABADOR = "FGl_1587652198400516_Alias";
    /** <code>fuCallSPgetsemaforograbador</code> user function name. */
    public static final String UF_NAME_FUCALLSPGETSEMAFOROGRABADOR = "fuCallSPgetsemaforograbador";
    /** <code>pfIdSolicitud</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUCALLSPGETSEMAFOROGRABADOR_PFIDSOLICITUD = "pfIdSolicitud";
    public static final String UF_ARG_ID_FUCALLSPGETSEMAFOROGRABADOR_PFIDSOLICITUD = "FGl_1587652198400516Arg_1_Alias";
    // User Function (fuCallSPgetsemaforograbadornov)
    /** <code>fuCallSPgetsemaforograbadornov</code> user function id. */
    public static final String UF_ID_FUCALLSPGETSEMAFOROGRABADORNOV = "FGl_1587652198400186_Alias";
    /** <code>fuCallSPgetsemaforograbadornov</code> user function name. */
    public static final String UF_NAME_FUCALLSPGETSEMAFOROGRABADORNOV = "fuCallSPgetsemaforograbadornov";
    /** <code>pfIdSolcitudNov</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUCALLSPGETSEMAFOROGRABADORNOV_PFIDSOLCITUDNOV = "pfIdSolcitudNov";
    public static final String UF_ARG_ID_FUCALLSPGETSEMAFOROGRABADORNOV_PFIDSOLCITUDNOV = "FGl_1587652198400186Arg_1_Alias";
    // User Function (fuCallSPgetsemaforoareamed)
    /** <code>fuCallSPgetsemaforoareamed</code> user function id. */
    public static final String UF_ID_FUCALLSPGETSEMAFOROAREAMED = "FGl_1587652329472753_Alias";
    /** <code>fuCallSPgetsemaforoareamed</code> user function name. */
    public static final String UF_NAME_FUCALLSPGETSEMAFOROAREAMED = "fuCallSPgetsemaforoareamed";
    /** <code>pfIdSolicitud</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUCALLSPGETSEMAFOROAREAMED_PFIDSOLICITUD = "pfIdSolicitud";
    public static final String UF_ARG_ID_FUCALLSPGETSEMAFOROAREAMED_PFIDSOLICITUD = "FGl_1587652329472753Arg_1_Alias";
    // User Function (fugetSolicitudNovedadByNumRadicado)
    /** <code>fugetSolicitudNovedadByNumRadicado</code> user function id. */
    public static final String UF_ID_FUGETSOLICITUDNOVEDADBYNUMRADICADO = "FGl_1588941160448941_Alias";
    /** <code>fugetSolicitudNovedadByNumRadicado</code> user function name. */
    public static final String UF_NAME_FUGETSOLICITUDNOVEDADBYNUMRADICADO = "fugetSolicitudNovedadByNumRadicado";
    /** <code>pfNumRadicado</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETSOLICITUDNOVEDADBYNUMRADICADO_PFNUMRADICADO = "pfNumRadicado";
    public static final String UF_ARG_ID_FUGETSOLICITUDNOVEDADBYNUMRADICADO_PFNUMRADICADO = "FGl_1588941160448941Arg_1_Alias";
    // User Function (fuGetFechaDesdeVarFiltro)
    /** <code>fuGetFechaDesdeVarFiltro</code> user function id. */
    public static final String UF_ID_FUGETFECHADESDEVARFILTRO = "FGl_1637915033600285_Alias";
    /** <code>fuGetFechaDesdeVarFiltro</code> user function name. */
    public static final String UF_NAME_FUGETFECHADESDEVARFILTRO = "fuGetFechaDesdeVarFiltro";
    // User Function (fuCheckRegimenSubsidiado)
    /** <code>fuCheckRegimenSubsidiado</code> user function id. */
    public static final String UF_ID_FUCHECKREGIMENSUBSIDIADO = "FGl_1655285219328892_Alias";
    /** <code>fuCheckRegimenSubsidiado</code> user function name. */
    public static final String UF_NAME_FUCHECKREGIMENSUBSIDIADO = "fuCheckRegimenSubsidiado";
    /** <code>pfTipoId</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUCHECKREGIMENSUBSIDIADO_PFTIPOID = "pfTipoId";
    public static final String UF_ARG_ID_FUCHECKREGIMENSUBSIDIADO_PFTIPOID = "FGl_1655285219328892Arg_1_Alias";
    /** <code>pfNumId</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUCHECKREGIMENSUBSIDIADO_PFNUMID = "pfNumId";
    public static final String UF_ARG_ID_FUCHECKREGIMENSUBSIDIADO_PFNUMID = "FGl_1655285219328892Arg_2_Alias";
    /** <code>pfSolicitud</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUCHECKREGIMENSUBSIDIADO_PFSOLICITUD = "pfSolicitud";
    public static final String UF_ARG_ID_FUCHECKREGIMENSUBSIDIADO_PFSOLICITUD = "FGl_1655285219328892Arg_3_Alias";
    /** <code>pfEsVoluntario</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUCHECKREGIMENSUBSIDIADO_PFESVOLUNTARIO = "pfEsVoluntario";
    public static final String UF_ARG_ID_FUCHECKREGIMENSUBSIDIADO_PFESVOLUNTARIO = "FGl_1655285219328892Arg_5_Alias";
    // User Function (fuGetFInicioPlanVol)
    /** <code>fuGetFInicioPlanVol</code> user function id. */
    public static final String UF_ID_FUGETFINICIOPLANVOL = "FGl_1655287316480961_Alias";
    /** <code>fuGetFInicioPlanVol</code> user function name. */
    public static final String UF_NAME_FUGETFINICIOPLANVOL = "fuGetFInicioPlanVol";
    /** <code>pfTipoTramite</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETFINICIOPLANVOL_PFTIPOTRAMITE = "pfTipoTramite";
    public static final String UF_ARG_ID_FUGETFINICIOPLANVOL_PFTIPOTRAMITE = "FGl_1655287316480961Arg_1_Alias";
    /** <code>pfTipoContrato</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETFINICIOPLANVOL_PFTIPOCONTRATO = "pfTipoContrato";
    public static final String UF_ARG_ID_FUGETFINICIOPLANVOL_PFTIPOCONTRATO = "FGl_1655287316480961Arg_2_Alias";
    /** <code>pfFecha</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETFINICIOPLANVOL_PFFECHA = "pfFecha";
    public static final String UF_ARG_ID_FUGETFINICIOPLANVOL_PFFECHA = "FGl_1655287316480961Arg_3_Alias";
    // User Function (fuValidarDominioIncompatibles)
    /** <code>fuValidarDominioIncompatibles</code> user function id. */
    public static final String UF_ID_FUVALIDARDOMINIOINCOMPATIBLES = "FGl_1658390577152780_Alias";
    /** <code>fuValidarDominioIncompatibles</code> user function name. */
    public static final String UF_NAME_FUVALIDARDOMINIOINCOMPATIBLES = "fuValidarDominioIncompatibles";
    /** <code>pfTipoId</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUVALIDARDOMINIOINCOMPATIBLES_PFTIPOID = "pfTipoId";
    public static final String UF_ARG_ID_FUVALIDARDOMINIOINCOMPATIBLES_PFTIPOID = "FGl_1658390577152780Arg_1_Alias";
    /** <code>pfNumId</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUVALIDARDOMINIOINCOMPATIBLES_PFNUMID = "pfNumId";
    public static final String UF_ARG_ID_FUVALIDARDOMINIOINCOMPATIBLES_PFNUMID = "FGl_1658390577152780Arg_2_Alias";
    /** <code>pfFechaInicioVigencia</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUVALIDARDOMINIOINCOMPATIBLES_PFFECHAINICIOVIGENCIA = "pfFechaInicioVigencia";
    public static final String UF_ARG_ID_FUVALIDARDOMINIOINCOMPATIBLES_PFFECHAINICIOVIGENCIA = "FGl_1658390577152780Arg_3_Alias";
    /** <code>pfSolicitud</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUVALIDARDOMINIOINCOMPATIBLES_PFSOLICITUD = "pfSolicitud";
    public static final String UF_ARG_ID_FUVALIDARDOMINIOINCOMPATIBLES_PFSOLICITUD = "FGl_1658390577152780Arg_6_Alias";
    // User Function (fuExisteContratoExentoFIngreso)
    /** <code>fuExisteContratoExentoFIngreso</code> user function id. */
    public static final String UF_ID_FUEXISTECONTRATOEXENTOFINGRESO = "FGl_1658400669696593_Alias";
    /** <code>fuExisteContratoExentoFIngreso</code> user function name. */
    public static final String UF_NAME_FUEXISTECONTRATOEXENTOFINGRESO = "fuExisteContratoExentoFIngreso";
    /** <code>vfNumContrato</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUEXISTECONTRATOEXENTOFINGRESO_VFNUMCONTRATO = "vfNumContrato";
    public static final String UF_ARG_ID_FUEXISTECONTRATOEXENTOFINGRESO_VFNUMCONTRATO = "FGl_1658400669696593Arg_1_Alias";
    // User Function (fuGetFechaLimiteDescargaDoc)
    /** <code>fuGetFechaLimiteDescargaDoc</code> user function id. */
    public static final String UF_ID_FUGETFECHALIMITEDESCARGADOC = "FGl_1700559847424562_Alias";
    /** <code>fuGetFechaLimiteDescargaDoc</code> user function name. */
    public static final String UF_NAME_FUGETFECHALIMITEDESCARGADOC = "fuGetFechaLimiteDescargaDoc";
    // User Function (fuGetTkn)
    /** <code>fuGetTkn</code> user function id. */
    public static final String UF_ID_FUGETTKN = "FGl_1725446488064331_Alias";
    /** <code>fuGetTkn</code> user function name. */
    public static final String UF_NAME_FUGETTKN = "fuGetTkn";
    // User Function (fuGetReporteSolicitud)
    /** <code>fuGetReporteSolicitud</code> user function id. */
    public static final String UF_ID_FUGETREPORTESOLICITUD = "FGl_1729757315072769_Alias";
    /** <code>fuGetReporteSolicitud</code> user function name. */
    public static final String UF_NAME_FUGETREPORTESOLICITUD = "fuGetReporteSolicitud";
    /** <code>pfSolicitud</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETREPORTESOLICITUD_PFSOLICITUD = "pfSolicitud";
    public static final String UF_ARG_ID_FUGETREPORTESOLICITUD_PFSOLICITUD = "FGl_1729757315072769Arg_1_Alias";
    /** <code>pfRuta</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETREPORTESOLICITUD_PFRUTA = "pfRuta";
    public static final String UF_ARG_ID_FUGETREPORTESOLICITUD_PFRUTA = "FGl_1729757315072769Arg_2_Alias";
    // User Function (fugetEstadoBeneficiarioCOREPorNombre)
    /** <code>fugetEstadoBeneficiarioCOREPorNombre</code> user function id. */
    public static final String UF_ID_FUGETESTADOBENEFICIARIOCOREPORNOMBRE = "FGl_1731668344832232_Alias";
    /** <code>fugetEstadoBeneficiarioCOREPorNombre</code> user function name. */
    public static final String UF_NAME_FUGETESTADOBENEFICIARIOCOREPORNOMBRE = "fugetEstadoBeneficiarioCOREPorNombre";
    /** <code>pfNombre</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETESTADOBENEFICIARIOCOREPORNOMBRE_PFNOMBRE = "pfNombre";
    public static final String UF_ARG_ID_FUGETESTADOBENEFICIARIOCOREPORNOMBRE_PFNOMBRE = "FGl_1731668344832232Arg_1_Alias";
    // User Function (fugetEstadoContratoPorNombre)
    /** <code>fugetEstadoContratoPorNombre</code> user function id. */
    public static final String UF_ID_FUGETESTADOCONTRATOPORNOMBRE = "FGl_1731668344832213_Alias";
    /** <code>fugetEstadoContratoPorNombre</code> user function name. */
    public static final String UF_NAME_FUGETESTADOCONTRATOPORNOMBRE = "fugetEstadoContratoPorNombre";
    /** <code>pfNombre</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETESTADOCONTRATOPORNOMBRE_PFNOMBRE = "pfNombre";
    public static final String UF_ARG_ID_FUGETESTADOCONTRATOPORNOMBRE_PFNOMBRE = "FGl_1731668344832213Arg_1_Alias";
    // User Function (fuGetIdDocIdentidadEnGestor)
    /** <code>fuGetIdDocIdentidadEnGestor</code> user function id. */
    public static final String UF_ID_FUGETIDDOCIDENTIDADENGESTOR = "FGl_1762159755264074_Alias";
    /** <code>fuGetIdDocIdentidadEnGestor</code> user function name. */
    public static final String UF_NAME_FUGETIDDOCIDENTIDADENGESTOR = "fuGetIdDocIdentidadEnGestor";
    /** <code>pfNumIdentificacion</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETIDDOCIDENTIDADENGESTOR_PFNUMIDENTIFICACION = "pfNumIdentificacion";
    public static final String UF_ARG_ID_FUGETIDDOCIDENTIDADENGESTOR_PFNUMIDENTIFICACION = "FGl_1762159755264074Arg_1_Alias";
    /** <code>pfNumRadicado</code> inbound argument id. */
    public static final String UF_ARG_NAME_FUGETIDDOCIDENTIDADENGESTOR_PFNUMRADICADO = "pfNumRadicado";
    public static final String UF_ARG_ID_FUGETIDDOCIDENTIDADENGESTOR_PFNUMRADICADO = "FGl_1762159755264074Arg_2_Alias";
    // User Function (fuGetIURLDescargaATOMIC)
    /** <code>fuGetIURLDescargaATOMIC</code> user function id. */
    public static final String UF_ID_FUGETIURLDESCARGAATOMIC = "FGl_1768557510656443_Alias";
    /** <code>fuGetIURLDescargaATOMIC</code> user function name. */
    public static final String UF_NAME_FUGETIURLDESCARGAATOMIC = "fuGetIURLDescargaATOMIC";

    /**
     * This method looks for the sequence of facets from the received in the
     * argument to the owner of the attribute or role received in the other argument
     * 
     * @param departureClass the class of the inheritance net where the attribute or
     *                       role is defined
     * @param element        is the name of an attribute or role of the own
     *                       inheritance net
     * @return the sequence of facets obtained
     */
    public static List<String> getSequenceFacetsElement(String departureClass, String element) {

        String constantSearched = "PATH_FACETS_" + element.toUpperCase();
        List<String> result = new ArrayList<>();
        Class<?> constantClass;
        Field targetField = null;

        constantClass = getConstantClass(departureClass);

        boolean noSuchFieldError = false;
        if (constantClass != null) {
            try {
                targetField = constantClass.getField(constantSearched);
            } catch (NoSuchFieldException e1) {
                noSuchFieldError = true;
            }
        }

        if (!noSuchFieldError && targetField != null) {
            try {
                String targetFacets = (String) targetField.get(null);
                if (targetFacets.length() != 0) {
                    for (String facet : targetFacets.split(REGEXP_DOT_SEPARATOR)) {
                        result.add(facet.trim());
                    }
                }
            } catch (IllegalAccessException e) {
                logMessage(e.getMessage());
            }
        }

        return result;
    }

    /**
     * This method looks for the sequence of facets from the received in the
     * argument to the received in the other argument
     * 
     * @param departureClass the class of the inheritance net where it is looked for
     *                       the other facet
     * @param element        is the name of a facet of the own inheritance net
     * @return the sequence of facets obtained
     */
    public static List<String> getSequenceFacetsFacet(String departureClass, String element) {
        return getFacetsGetterSequence(departureClass, element);
    }

    /**
     * This method looks for the sequence of facets from the received in the
     * argument to the received in the other argument
     * 
     * @param departureClass the class of the inheritance net where it is looked for
     *                       the other facet
     * @param element        is the name of a facet of the own inheritance net
     * @return the sequence of facets obtained
     */
    public static List<String> getFacetsGetterSequence(String departureClass, String element) {

        String constantSearched = "CLASS_FACET_GETTER_" + element.toUpperCase();
        List<String> result = new ArrayList<>();
        Class<?> constantClass;
        Field targetField = null;

        constantClass = getConstantClass(departureClass);
        if (constantClass != null) {
            try {
                targetField = constantClass.getField(constantSearched);
            } catch (NoSuchFieldException e1) {
                logMessage(e1.getMessage());
            }
        }

        if (targetField != null) {
            try {
                String targetFacets = (String) targetField.get(null);
                if (targetFacets.length() != 0) {
                    for (String facet : targetFacets.split(REGEXP_DOT_SEPARATOR)) {
                        result.add(facet.trim());
                    }
                }
            } catch (IllegalAccessException e) {
                logMessage(e.getMessage());
            }
        }

        return result;
    }

    /**
     * This method looks for the owner facet of the attribute or role received in
     * the other argument
     * 
     * @param departureClass the class of the inheritance net where the attribute or
     *                       role is defined
     * @param element        is the name of an attribute or role of the own
     *                       inheritance net
     * @return the owner facet of the role or attribute
     */
    public static String getTargetFacetElement(String departureClass, String element) {
        List<String> sequenceFacets = getSequenceFacetsElement(departureClass, element);
        String returnValue = "";
        if (!sequenceFacets.isEmpty())
            returnValue = sequenceFacets.get(sequenceFacets.size() - 1);
        else
            returnValue = departureClass;
        return returnValue;
    }

    /**
     * This method looks for the owner facet of the attribute or role received in
     * the other argument
     * 
     * @param departureClass the class of the inheritance net where the attribute or
     *                       role is defined
     * @param element        is the name of an attribute or role of the own
     *                       inheritance net
     * @return the owner facet of the role or attribute
     */
    public static String getTargetFacetFacet(String departureClass, String element) {
        List<String> sequenceFacets = getSequenceFacetsFacet(departureClass, element);
        String returnValue = "";
        if (!sequenceFacets.isEmpty())
            returnValue = sequenceFacets.get(sequenceFacets.size() - 1);
        else
            returnValue = departureClass;
        return returnValue;
    }

    /**
     * This method looks for the name of the field in the database
     * 
     * @param nameClass     is the name of the class where the field is
     * @param attributeName is the name of the field
     * @return the right name of the field in the database
     * @throws SystemException
     */
    public static String nameField(String nameClass, String attributeName) {
        String fieldName;
        String localAttributeName = ATTRFIELDPREFIX + attributeName.toUpperCase();
        try {
            Class<?> constantClass = getConstantClass(nameClass);

            if (constantClass != null) {
                Field targetField = constantClass.getField(localAttributeName);
                fieldName = (String) targetField.get(null);
            } else {
                fieldName = attributeName;
            }

        } catch (NoSuchFieldException e) {
            fieldName = attributeName;
            logMessage(e.getMessage());
        } catch (IllegalAccessException e) {
            fieldName = attributeName;
            logMessage(e.getMessage());
        }

        return (fieldName.equalsIgnoreCase(FILTER_FUM_NAME) ? FILTER_LMD_NAME.toLowerCase() : fieldName);
    }

    /**
     * This method obtains the name of the table which represents the class
     * 
     * @param nameClass is the name of the class whose table it is looked for
     * @return the name of the table
     */
    public static String nameTable(String nameClass) {
        String tableName = "TBL_NAME";
        try {
            Class<?> constantClass = getConstantClass(nameClass);
            tableName = (constantClass != null ? (String) constantClass.getField(tableName).get(null) : "TBL_NAME");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            logMessage(e.getMessage());
        }
        return tableName;
    }

    /**
     * This method obtains the list of the OID Fields of the received class
     * 
     * @param className is the name of the class whose OID Fields are looked for
     * @return the list of OID Fields
     */
    public static List<String> getOIDFields(String className) {
        return getIdFields(className, getConstantClass(className));
    }

    @SuppressWarnings("unchecked")
    private static List<String> getIdFields(String className, Class<?> constantClass) {
        List<String> result = new ArrayList<>();
        try {
            Method getIdFieldsMethod = getIdFieldsMethod(constantClass);
            if (getIdFieldsMethod != null) {
                Object[] arguments = new Object[1];
                arguments[0] = className;
                result = (List<String>) getIdFieldsMethod.invoke(null, arguments);
            }
        } catch (Exception e) {
            logMessage(e.getMessage());
        }
        return result;
    }

    private static Method getIdFieldsMethod(Class<?> constantClass) throws NoSuchMethodException {
        return (constantClass != null ? constantClass.getMethod("getIdFields", String.class) : null);
    }

    /**
     * This method obtains the list of the Fields of the received class in a TM
     * table
     * 
     * @param className         is the name of the class whose OID Fields are looked
     *                          for
     * @param intermediateTable is the name of the intermediate table
     * @return the list of OID Fields
     * @throws SystemException
     */
    @SuppressWarnings("unchecked")
    public static List<String> getTMOIDFields(String className, String intermediateTable) throws SystemException {
        List<String> result = new ArrayList<>();
        Class<?> constantClass = getConstantClass(className);
        if (constantClass != null) {
            try {

                Method getTMIdFields;
                getTMIdFields = constantClass.getMethod("getTMIdFields", String.class);
                Object[] arguments = new Object[1];
                arguments[0] = intermediateTable;
                result = (List<String>) getTMIdFields.invoke(null, arguments);
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                logMessage(e.getMessage());
                throw new SystemException(e);
            }
        }
        return result;
    }

    /**
     * This method obtains the reached class through a role
     * 
     * @param nameClass is the name of the source class
     * @param roleName  is the name of the role
     * @return the reached class from nameClass with the role roleName
     */
    public static String roleTargetClass(String nameClass, String roleName) {
        String targetClassName = "";
        String attributeName = "ROLE_TARGET_" + roleName.toUpperCase();

        try {
            Class<?> constantClass = getConstantClass(nameClass);
            if (constantClass != null) {
                Field targetField = constantClass.getField(attributeName);
                targetClassName = (String) targetField.get(null);
            }
        } catch (NoSuchFieldException e) {
            logMessage(e.getMessage());
            targetClassName = "";
        } catch (IllegalAccessException e) {
            logMessage(e.getMessage());
        }

        return targetClassName;
    }

    /**
     * Gets the inverse role of a given role from a given class.
     * 
     * @param className the class owner of the roles.
     * @param roleName  the direct role .
     * @return the inverse role of roleName that arrives to className.
     * @throws SystemException
     */
    public static String getInverseSingleRole(String className, String roleName) throws SystemException {
        String result = "";
        try {
            Class<?> constantClass = getConstantClass(className);
            result = (constantClass != null
                    ? (String) constantClass.getField("ROLE_INVNAME_" + roleName.toUpperCase()).get(null)
                    : "");
        } catch (Exception e) {
            logMessage(e.getMessage());
            throw new SystemException(e);
        }

        return result;
    }

    /**
     * Returns the class reached via the role given. The role can be a single role
     * or a path with several roles.
     * 
     * @param className the departure class of the role.
     * @param rolesPath the roles path to process.
     * @return the final class reached after processing the role.
     */
    public static String pathTargetClass(String className, String rolesPath) {
        return pathTargetClass(className, rolesPath, false);
    }

    /**
     * Returns the class reached via the role given. The role can be a single role
     * or a path with several roles.
     * 
     * @param className       the departure class of the role.
     * @param rolesPath       the roles path to process.
     * @param ignoreFirstItem whether the first item in rolesPath has to be ignored
     *                        when processing the roles path.
     * @return the final class reached after processing the role.
     */
    public static String pathTargetClass(String className, String rolesPath, boolean ignoreFirstItem) {
        String result = "";
        try {
            if (rolesPath.length() == 0) {
                // If there is no roles path then the final class is the same as the departure
                // class.
                result = className;
            } else {
                // Split the role into every single role it may contain.
                String currentClass = className;
                // Iterate to process each one of the single roles.
                boolean isFirstItemProcessed = false;
                for (String role : rolesPath.split(REGEXP_DOT_SEPARATOR)) {
                    if (ignoreFirstItem && !isFirstItemProcessed) {
                        isFirstItemProcessed = true;
                        continue;
                    }
                    // Get the target class of this role and set it as the temporal reached class to
                    // continue the iteration from this class.
                    currentClass = roleTargetClass(currentClass, role);
                }
                // The final reached class is the one reached navigating the initial role.
                result = currentClass;
            }
        } catch (Exception e) {
            logMessage(e.getMessage());
        }
        return result;
    }

    /**
     * Gets the inverse role of a given role from a given class.
     * 
     * @param className the class owner of the roles.
     * @param roleName  the direct role .
     * @return the inverse role of roleName that arrives to className.
     * @throws SystemException
     */
    public static String getInverseRole(String className, String roleName) throws SystemException {
        String result;
        String newRoleName = roleName;
        try {
            if (roleName.isEmpty()) {
                // If there is no role then the is not inverse role.
                result = roleName;
            } else {
                // Split the role into every single role it may contain.
                StringBuilder inverseRole = new StringBuilder();
                String currentClass = className;

                // Iterate to process each one of the single roles.
                for (String role : newRoleName.split(REGEXP_DOT_SEPARATOR)) {
                    // Get the target class of this role and set it as the temporal reached class to
                    // continue the iteration from this class.
                    // create the inverse role.
                    if (inverseRole.toString().length() == 0) {
                        inverseRole.append(getInverseSingleRole(currentClass, role));
                    } else {
                        inverseRole.insert(0, ".");
                        inverseRole.insert(0, getInverseSingleRole(currentClass, role));
                    }
                    currentClass = roleTargetClass(currentClass, role);
                }
                // The final reached class is the one reached navigating the initial role.
                result = inverseRole.toString();

            }
        } catch (Exception e) {
            logMessage(e.getMessage());
            result = "";
        }

        return result;
    }

    /**
     * Gets table name of a many-to-many relationship for a given class and role
     * name
     * 
     * @param definitionClass
     * @param roleName
     * @return {@link String}
     * @throws SystemException
     */
    public static String getManyToManyTableName(String definitionClass, String roleName) {
        String result = "";
        try {
            result = (String) Constants.class
                    .getField("ROLE_TABLE_" + definitionClass.toUpperCase() + "_" + roleName.toUpperCase()).get(null);
        } catch (NoSuchFieldException e) {
            logMessage(e.getMessage());
            result = "";
        } catch (Exception e) {
            logMessage(e.getMessage());
        }
        return result;
    }

    /**
     * Checks visibility of an agent
     * 
     * @param agent
     * @param initialClass
     * @param path
     * @return {@link Boolean}
     * @throws SystemException
     */
    public static Boolean checkVisibility(Agent agent, String initialClass, String path) throws SystemException {
        Boolean returnValue = null;
        String remainingRolesPath = "";
        String role = path;
        int pointIndex = role.indexOf('.');

        if (pointIndex > 0) {
            role = path.substring(0, pointIndex);
            remainingRolesPath = path.substring(pointIndex + 1);
        }
        try {
            String roleOwner = Constants.getTargetFacetElement(initialClass, role);
            if (!roleOwner.equalsIgnoreCase(initialClass)) {
                returnValue = Constants.checkVisibility(agent, roleOwner, path);
            } else {
                String agents = getAgents(initialClass, role);
                for (String agentName : agents.split(",")) {
                    agentName = agentName.trim();
                    returnValue = checkVisibilityForAgentFacet(agent, agentName, initialClass, role,
                            remainingRolesPath);
                    if (returnValue != null)
                        break;
                }
            }
        } catch (SecurityException | IllegalArgumentException e) {
            logMessage(e.getMessage());
            throw new SystemException(e);
        }
        return returnValue;
    }

    private static String getAgents(String className, String roleName) throws SystemException {
        String agents = "";
        try {
            Class<?> roleOwner = getConstantClass(className);
            Field field = (roleOwner != null ? roleOwner.getField(roleName.toUpperCase() + "_AGENTS") : null);
            agents = (field != null ? (String) field.get(null) : "");
        } catch (Exception e) {
            logMessage(e.getMessage());
            throw new SystemException(e);
        }
        return agents;
    }

    private static Boolean checkVisibilityForAgentFacet(Agent agentClass, String agentFacet, String className,
            String role, String rolesPath) throws SystemException {
        Boolean returnValue = null;
        if (agentClass.isFacetActive(agentFacet)) {
            returnValue = (rolesPath.isEmpty()
                    || checkVisibility(agentClass, roleTargetClass(className, role), rolesPath));
        }
        return returnValue;
    }

    /**
     * Returns the constant class of a model class
     * 
     * @param className Name of class to search
     * @return Class object
     */
    public static Class<?> getConstantClass(String className) {
        Class<?> returnValue = null;
        if (className.equalsIgnoreCase(""))
            returnValue = Constants.class;
        if (className.equalsIgnoreCase("function"))
            returnValue = Constants.class;
        if (className.equalsIgnoreCase(FUNCIONARIO))
            returnValue = FuncionarioConstants.class;
        if (className.equalsIgnoreCase(ADMIN))
            returnValue = AdminConstants.class;
        if (className.equalsIgnoreCase(SUPERADMIN))
            returnValue = SuperAdminConstants.class;
        if (className.equalsIgnoreCase(ASESOR))
            returnValue = AsesorConstants.class;
        if (className.equalsIgnoreCase(AREAMEDICA))
            returnValue = AreaMedicaConstants.class;
        if (className.equalsIgnoreCase(AFILIACIONES))
            returnValue = AfiliacionesConstants.class;
        if (className.equalsIgnoreCase(RESPREGIONAL))
            returnValue = RespRegionalConstants.class;
        if (className.equalsIgnoreCase(GESTOR))
            returnValue = GestorConstants.class;
        if (className.equalsIgnoreCase(MESADEAPOYO))
            returnValue = MesaDeApoyoConstants.class;
        if (className.equalsIgnoreCase(PARAMCONFIG))
            returnValue = ParamConfigConstants.class;
        if (className.equalsIgnoreCase(LOGPARAM))
            returnValue = LogParamConstants.class;
        if (className.equalsIgnoreCase(FRECUENCIAACT))
            returnValue = FrecuenciaActConstants.class;
        if (className.equalsIgnoreCase(CUESTIONARIOMED))
            returnValue = CuestionarioMedConstants.class;
        if (className.equalsIgnoreCase(SECCION))
            returnValue = SeccionConstants.class;
        if (className.equalsIgnoreCase(PREGUNTA))
            returnValue = PreguntaConstants.class;
        if (className.equalsIgnoreCase(VALOR))
            returnValue = ValorConstants.class;
        if (className.equalsIgnoreCase(PRODUCTOS))
            returnValue = ProductosConstants.class;
        if (className.equalsIgnoreCase(PLANES))
            returnValue = PlanesConstants.class;
        if (className.equalsIgnoreCase(PARENTESCO))
            returnValue = ParentescoConstants.class;
        if (className.equalsIgnoreCase(PERIODICIDAD))
            returnValue = PeriodicidadConstants.class;
        if (className.equalsIgnoreCase(ROL))
            returnValue = RolConstants.class;
        if (className.equalsIgnoreCase(DOMINIO))
            returnValue = DominioConstants.class;
        if (className.equalsIgnoreCase(PLANTILLAEMAIL))
            returnValue = PlantillaEmailConstants.class;
        if (className.equalsIgnoreCase(ESTADOCONTRATO))
            returnValue = EstadoContratoConstants.class;
        if (className.equalsIgnoreCase(ESTADOBENEFICIARIO))
            returnValue = EstadoBeneficiarioConstants.class;
        if (className.equalsIgnoreCase(ESTADOBENEFICIARIOAE))
            returnValue = EstadoBeneficiarioAEConstants.class;
        if (className.equalsIgnoreCase(TARIFA))
            returnValue = TarifaConstants.class;
        if (className.equalsIgnoreCase(REGIONAL))
            returnValue = RegionalConstants.class;
        if (className.equalsIgnoreCase(SUCURSAL))
            returnValue = SucursalConstants.class;
        if (className.equalsIgnoreCase(GRUPOASOCIADO))
            returnValue = GrupoAsociadoConstants.class;
        if (className.equalsIgnoreCase(ESTADOCIVIL))
            returnValue = EstadoCivilConstants.class;
        if (className.equalsIgnoreCase(DEPARTAMENTO))
            returnValue = DepartamentoConstants.class;
        if (className.equalsIgnoreCase(TIPOIVA))
            returnValue = TipoIVAConstants.class;
        if (className.equalsIgnoreCase(PERSONA))
            returnValue = PersonaConstants.class;
        if (className.equalsIgnoreCase(COMPANYIA))
            returnValue = CompanyiaConstants.class;
        if (className.equalsIgnoreCase(MUNICIPIO))
            returnValue = MunicipioConstants.class;
        if (className.equalsIgnoreCase(TIPODIRECCION))
            returnValue = TipoDireccionConstants.class;
        if (className.equalsIgnoreCase(ESTADOPERSONA))
            returnValue = EstadoPersonaConstants.class;
        if (className.equalsIgnoreCase(FORMAPAGO))
            returnValue = FormaPagoConstants.class;
        if (className.equalsIgnoreCase(TIPOIDENTIFICACION))
            returnValue = TipoIdentificacionConstants.class;
        if (className.equalsIgnoreCase(EPS))
            returnValue = EpsConstants.class;
        if (className.equalsIgnoreCase(ENTIDADFINANCIERAC))
            returnValue = EntidadFinancieraCConstants.class;
        if (className.equalsIgnoreCase(TIPOENTIDADC))
            returnValue = TipoEntidadCConstants.class;
        if (className.equalsIgnoreCase(TIPOINSTITUCIONC))
            returnValue = TipoInstitucionCConstants.class;
        if (className.equalsIgnoreCase(AESOLICITUDES))
            returnValue = AesolicitudesConstants.class;
        if (className.equalsIgnoreCase(SOLICITUD))
            returnValue = SolicitudConstants.class;
        if (className.equalsIgnoreCase(PERSONAC))
            returnValue = PersonaCConstants.class;
        if (className.equalsIgnoreCase(DIRECCIONC))
            returnValue = DireccionCConstants.class;
        if (className.equalsIgnoreCase(TELEFONOC))
            returnValue = TelefonoCConstants.class;
        if (className.equalsIgnoreCase(PROTECCIONDATOSC))
            returnValue = ProteccionDatosCConstants.class;
        if (className.equalsIgnoreCase(DIRECCION))
            returnValue = DireccionConstants.class;
        if (className.equalsIgnoreCase(PAIS))
            returnValue = PaisConstants.class;
        if (className.equalsIgnoreCase(PROTECCIONDATOS))
            returnValue = ProteccionDatosConstants.class;
        if (className.equalsIgnoreCase(USUARIO))
            returnValue = UsuarioConstants.class;
        if (className.equalsIgnoreCase(CUESTIONARIOP))
            returnValue = CuestionarioPConstants.class;
        if (className.equalsIgnoreCase(SECCIONP))
            returnValue = SeccionPConstants.class;
        if (className.equalsIgnoreCase(PREGUNTAP))
            returnValue = PreguntaPConstants.class;
        if (className.equalsIgnoreCase(CONTRATANTE))
            returnValue = ContratanteConstants.class;
        if (className.equalsIgnoreCase(ANEXOMAT))
            returnValue = AnexoMatConstants.class;
        if (className.equalsIgnoreCase(ANEXONEO))
            returnValue = AnexoNeoConstants.class;
        if (className.equalsIgnoreCase(FIRMA))
            returnValue = FirmaConstants.class;
        if (className.equalsIgnoreCase(CONTRATOC))
            returnValue = ContratoCConstants.class;
        if (className.equalsIgnoreCase(OBSERVACIONESC))
            returnValue = ObservacionesCConstants.class;
        if (className.equalsIgnoreCase(BENEFICIARIOC))
            returnValue = BeneficiarioCConstants.class;
        if (className.equalsIgnoreCase(ANEXOC))
            returnValue = AnexoCConstants.class;
        if (className.equalsIgnoreCase(PREGCUESMEDC))
            returnValue = PregCuesMedCConstants.class;
        if (className.equalsIgnoreCase(DIRSUCURSALC))
            returnValue = DirSucursalCConstants.class;
        if (className.equalsIgnoreCase(FAMILIAC))
            returnValue = FamiliaCConstants.class;
        if (className.equalsIgnoreCase(USUARIOREG))
            returnValue = UsuarioRegConstants.class;
        if (className.equalsIgnoreCase(TITULAR))
            returnValue = TitularConstants.class;
        if (className.equalsIgnoreCase(PREEXISTENCIAC))
            returnValue = PreexistenciaCConstants.class;
        if (className.equalsIgnoreCase(PREEXISTENCIA))
            returnValue = PreexistenciaConstants.class;
        if (className.equalsIgnoreCase(DOCUMENTOG))
            returnValue = DocumentoGConstants.class;
        if (className.equalsIgnoreCase(OBSESTADO))
            returnValue = ObsEstadoConstants.class;
        if (className.equalsIgnoreCase(ERRORWS))
            returnValue = ErrorWSConstants.class;
        if (className.equalsIgnoreCase(PARENTESCODOM))
            returnValue = ParentescoDomConstants.class;
        if (className.equalsIgnoreCase(MARCAMEDICAC))
            returnValue = MarcaMedicaCConstants.class;
        if (className.equalsIgnoreCase(TIPOSUCURSALC))
            returnValue = TipoSucursalCConstants.class;
        if (className.equalsIgnoreCase(CONCEPTOC))
            returnValue = ConceptoCConstants.class;
        if (className.equalsIgnoreCase(DETALLETARIFA))
            returnValue = DetalleTarifaConstants.class;
        if (className.equalsIgnoreCase(AGENTEXPRODUCTO))
            returnValue = AgentexProductoConstants.class;
        if (className.equalsIgnoreCase(INSTITUCIONMATNEO))
            returnValue = InstitucionMatNeoConstants.class;
        if (className.equalsIgnoreCase(LOGESTADO))
            returnValue = LogEstadoConstants.class;
        if (className.equalsIgnoreCase(MOTDEVAREAMEDICA))
            returnValue = MotDevAreaMedicaConstants.class;
        if (className.equalsIgnoreCase(CONTSINDOCSOL))
            returnValue = ContSinDocSolConstants.class;
        if (className.equalsIgnoreCase(LOGCONTSINDOCSOL))
            returnValue = LogContSinDocSolConstants.class;
        if (className.equalsIgnoreCase(LOGASIGNACIONES))
            returnValue = LogAsignacionesConstants.class;
        if (className.equalsIgnoreCase(REPORTESPROCALM))
            returnValue = ReportesProcAlmConstants.class;
        if (className.equalsIgnoreCase(PRORRATEO))
            returnValue = ProrrateoConstants.class;
        if (className.equalsIgnoreCase(TIPOFACTURA))
            returnValue = TipoFacturaConstants.class;
        if (className.equalsIgnoreCase(PARAMREPORTE))
            returnValue = ParamReporteConstants.class;
        if (className.equalsIgnoreCase(TIPONOVEDAD))
            returnValue = TipoNovedadConstants.class;
        if (className.equalsIgnoreCase(NOVEDAD))
            returnValue = NovedadConstants.class;
        if (className.equalsIgnoreCase(CAUSAL))
            returnValue = CausalConstants.class;
        if (className.equalsIgnoreCase(SOLICITUDNOVEDAD))
            returnValue = SolicitudNovedadConstants.class;
        if (className.equalsIgnoreCase(FAMILIANOVEDAD))
            returnValue = FamiliaNovedadConstants.class;
        if (className.equalsIgnoreCase(USUARIONOVEDAD))
            returnValue = UsuarioNovedadConstants.class;
        if (className.equalsIgnoreCase(CAUSAEXCLUSION))
            returnValue = CausaExclusionConstants.class;
        if (className.equalsIgnoreCase(NOVEDADCT))
            returnValue = NovedadCTConstants.class;
        if (className.equalsIgnoreCase(DOCUMENTONOVEDAD))
            returnValue = DocumentoNovedadConstants.class;
        if (className.equalsIgnoreCase(NOVEDADMD))
            returnValue = NovedadMDConstants.class;
        if (className.equalsIgnoreCase(LOGESTADOSN))
            returnValue = LogEstadoSNConstants.class;
        if (className.equalsIgnoreCase(MOTIVOEXCEPCIONSOLNOV))
            returnValue = MotivoExcepcionSolNovConstants.class;
        if (className.equalsIgnoreCase(PRIORIZACIONSOLICITUDES))
            returnValue = PriorizacionSolicitudesConstants.class;
        if (className.equalsIgnoreCase(LOGPRIORIZACIONSOL))
            returnValue = LogPriorizacionSolConstants.class;
        if (className.equalsIgnoreCase(GRUPOASIGNACION))
            returnValue = GrupoAsignacionConstants.class;
        if (className.equalsIgnoreCase(LOGGRUPOASIGNACION))
            returnValue = LogGrupoAsignacionConstants.class;
        if (className.equalsIgnoreCase(LOGGRUPOSUSUARIOS))
            returnValue = LogGruposUsuariosConstants.class;
        if (className.equalsIgnoreCase(GRUPOASIGNACIONNOVEDAD))
            returnValue = GrupoAsignacionNovedadConstants.class;
        if (className.equalsIgnoreCase(LOGFUNCIONARIO))
            returnValue = LogFuncionarioConstants.class;
        if (className.equalsIgnoreCase(LOGUSRSOLNOV))
            returnValue = LogUsrSolNovConstants.class;
        if (className.equalsIgnoreCase(CONTRATOCOMBO))
            returnValue = ContratoComboConstants.class;
        if (className.equalsIgnoreCase(LOGCONTRATOCOMBO))
            returnValue = LogContratoComboConstants.class;
        if (className.equalsIgnoreCase(CONFIGURACIONANS))
            returnValue = ConfiguracionANSConstants.class;
        if (className.equalsIgnoreCase(LOGCONFIGURACIONANS))
            returnValue = LogConfiguracionANSConstants.class;
        if (className.equalsIgnoreCase(CONFIGURACIONFESTIVOS))
            returnValue = ConfiguracionFestivosConstants.class;
        if (className.equalsIgnoreCase(LOGESTADODOCNOV))
            returnValue = LogEstadoDocNovConstants.class;
        if (className.equalsIgnoreCase(PLANTILLAREPORTE))
            returnValue = PlantillaReporteConstants.class;
        if (className.equalsIgnoreCase(REPORTESDOMINIO))
            returnValue = ReportesDominioConstants.class;
        if (className.equalsIgnoreCase(LOGINFORMACIONASESOR))
            returnValue = LogInformacionAsesorConstants.class;
        if (className.equalsIgnoreCase(LOGHISTORICOPLANES))
            returnValue = LogHistoricoPlanesConstants.class;
        if (className.equalsIgnoreCase(LOGLLAMADASAE))
            returnValue = LogLlamadasAEConstants.class;
        if (className.equalsIgnoreCase(LOGLLAMADASBH))
            returnValue = LogLlamadasBHConstants.class;
        if (className.equalsIgnoreCase(FECHAINIEPS))
            returnValue = FechaIniEPSConstants.class;
        if (className.equalsIgnoreCase(LOGINCOMPATIBILIDADES))
            returnValue = LogIncompatibilidadesConstants.class;
        if (className.equalsIgnoreCase(LOGDATOSDOMINIO))
            returnValue = LogDatosDominioConstants.class;
        if (className.equalsIgnoreCase(CONTRATOSEXENTOSFINGRESO))
            returnValue = ContratosExentosFIngresoConstants.class;
        if (className.equalsIgnoreCase(LOGCONTRATOSEXENTOSFINGRESO))
            returnValue = LogContratosExentosFIngresoConstants.class;
        if (className.equalsIgnoreCase(TEXTOAVISO))
            returnValue = TextoAvisoConstants.class;
        if (className.equalsIgnoreCase(USUARIOSISTEMAEXTERNO))
            returnValue = UsuarioSistemaExternoConstants.class;
        return returnValue;
    }

    /**
     * Returns the name of a model class with the correct capitalization
     * 
     * @param className Name of class to search
     * @return Model class name
     */
    public static String getClassName(String className) {
        String returnValue = "";
        if (className.equalsIgnoreCase(""))
            returnValue = "";
        if (className.equalsIgnoreCase("FUNCTION"))
            returnValue = "Function";

        try {
            Class<?> constantClass = getConstantClass(className);

            if (constantClass != null) {
                Field targetField = constantClass.getField("CLASS_NAME");
                returnValue = (String) targetField.get(null);
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            logMessage(e.getMessage());
        }

        return returnValue;
    }

    /**
     * Returns the name of a model service with the correct capitalization
     * 
     * @param className   Name of class to search (empty string if it is a global
     *                    service)
     * @param serviceName Name of service to search
     * @return Model service name
     */
    public static String getServiceName(String className, String serviceName) {
        String returnValue = "";
        if (serviceName.length() == 0)
            returnValue = "";
        try {
            Class<?> constantClass = getConstantClass(className);

            if (constantClass != null) {
                Field targetField = null;
                if (className.length() == 0)
                    targetField = constantClass.getField("G_SERV_NAME_" + serviceName.toUpperCase());
                else if (className.equalsIgnoreCase("Function"))
                    targetField = constantClass.getField("UF_NAME_" + serviceName.toUpperCase());
                else
                    targetField = constantClass.getField("SERV_NAME_" + serviceName.toUpperCase());
                returnValue = (String) targetField.get(null);
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            logMessage(e.getMessage());
        }

        return returnValue;
    }

    /**
     * Returns the name of a model argument with the correct capitalization
     * 
     * @param className          Name of class to search (empty string if it is a
     *                           global service)
     * @param serviceName        Name of service to search
     * @param argumentName       Name of the argument to search
     * @param navFilterClassName Name of the class owning the navigational filter
     * @return Model argument name
     */
    public static String getArgumentName(String className, String serviceName, String argumentName, String navFilterClassName) {
        String returnValue = "";
        if (argumentName.length() == 0)
            returnValue = "";
        try {
            if (serviceName.length() == 0) {
                Class<?> filterNavClass = Class
                        .forName("com.keralty.aepersonas.query.impl.filter.navigational." + className
                                + navFilterClassName + "NavigationalFilter");
                serviceName = filterNavClass
                        .getAnnotation(com.keralty.aepersonas.metadata.NavFilterServiceName.class)
                        .name();
            }
            Class<?> constantClass = getConstantClass(className);

            if (constantClass != null) {
                Field targetField = constantClass
                        .getField("ARG_NAME_" + serviceName.toUpperCase() + "_" + argumentName.toUpperCase());
                returnValue = (String) targetField.get(null);
            }
        } catch (NoSuchFieldException e) {
            logMessage(e.getMessage());
            returnValue = argumentName;
        } catch (IllegalAccessException | ClassNotFoundException e) {
            logMessage(e.getMessage());
        }

        return returnValue;
    }

    /**
     * Returns the name of a model filter with the correct capitalization
     * 
     * @param className  Name of class to search
     * @param filterName Name of filter to search
     * @return Model filter name
     */
    public static String getFilterName(String className, String filterName) {
        String returnValue = "";
        if (className.length() == 0 || filterName.length() == 0)
            returnValue = "";
        if (filterName.equalsIgnoreCase("LMD") || filterName.equalsIgnoreCase("FUM"))
            returnValue = "LMD";
        try {
            Class<?> constantClass = getConstantClass(className);

            if (constantClass != null) {
                Field targetField = constantClass.getField("FILTER_NAME_" + filterName.toUpperCase());
                returnValue = (String) targetField.get(null);
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            logMessage(e.getMessage());
        }

        return returnValue;
    }

    /**
     * Returns the name of a model filter variable with the correct capitalization
     * 
     * @param className    Name of class to search
     * @param filterName   Name of filter to search
     * @param variableName Name of filter variable to search
     * @return Model filter variable name
     */
    public static String getVariableName(String className, String filterName, String variableName) {
        String returnValue = "";
        if (className.length() == 0 || filterName.length() == 0 || variableName.length() == 0)
            returnValue = "";
        if (filterName.equalsIgnoreCase("LMD") || filterName.equalsIgnoreCase("FUM"))
            returnValue = "LMD";
        try {
            Class<?> constantClass = getConstantClass(className);

            if (constantClass != null) {
                Field targetField = constantClass
                        .getField("VAR_NAME_" + filterName.toUpperCase() + "_" + variableName.toUpperCase());
                returnValue = (String) targetField.get(null);
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            logMessage(e.getMessage());
        }

        return returnValue;
    }

    /**
     * This method returns the corresponding java.sql.Type of a given type
     * 
     * @param paramType represents the OASIS Type
     * @return the equivalent java.sql Type to the OASIS type passed as parameter
     */
    public static int getSQLType(String paramType) {
        int returnValue = -1;
        if (paramType.equalsIgnoreCase("AUTONUMERIC"))
            returnValue = java.sql.Types.INTEGER;
        else if (paramType.equalsIgnoreCase("BOOL"))
            returnValue = java.sql.Types.BOOLEAN;
        else if (paramType.equalsIgnoreCase("BLOB"))
            returnValue = java.sql.Types.BLOB;
        else if (paramType.equalsIgnoreCase("DATE"))
            returnValue = java.sql.Types.DATE;
        else if (paramType.equalsIgnoreCase("DATETIME"))
            returnValue = java.sql.Types.TIMESTAMP;
        else if (paramType.equalsIgnoreCase("INT"))
            returnValue = java.sql.Types.INTEGER;
        else if (paramType.equalsIgnoreCase("NAT"))
            returnValue = java.sql.Types.INTEGER;
        else if (paramType.equalsIgnoreCase("REAL"))
            returnValue = java.sql.Types.REAL;
        else if (paramType.equalsIgnoreCase("STRING"))
            returnValue = java.sql.Types.VARCHAR;
        else if (paramType.equalsIgnoreCase("TEXT"))
            returnValue = java.sql.Types.CLOB;
        else if (paramType.equalsIgnoreCase("TIME"))
            returnValue = java.sql.Types.TIME;

        return returnValue;
    }

    /**
     * This method indicates if the received class is leged
     * 
     * @param className the name of the class to check for leged
     * @return true if the received class is leged
     */
    public static boolean isLeged(String className) {
        boolean returnValue = false;
        if ("NO_LEGACY_VIEWS".equals(className))
            returnValue = true;
        return returnValue;
    }

    /**
     * Method that returns the identification fields of a class in an intermediate
     * table.
     * 
     * @param tableName The name of the intermediateTable
     * @return Keys of the intermediate table refering to a class
     */
    public static List<String> getTMFields(String tableName) {
        List<String> fields = new ArrayList<>();
        // Intermediate relation (TM_ReportesProcAlmFuncionario)
        if (tableName.equalsIgnoreCase(Constants.TBL_NAME_REPORTESPROCALMFUNCIONARIO)) {
            fields.add(FLD_TMREPORTESPROCALMFUNCIONARIO_REPORTESPROCALMIDREPORTE);
            fields.add(FLD_TMREPORTESPROCALMFUNCIONARIO_FUNCIONARIOID);
        }
        // Intermediate relation (TM_GrupoAsignacionFuncionario)
        if (tableName.equalsIgnoreCase(Constants.TBL_NAME_GRUPOASIGNACIONFUNCIONARIO)) {
            fields.add(FLD_TMGRUPOASIGNACIONFUNCIONARIO_GRUPOASIGNACIONID);
            fields.add(FLD_TMGRUPOASIGNACIONFUNCIONARIO_FUNCIONARIOFUNCIONARIOID);
        }
        // Intermediate relation (TM_AfiliacionesPlanes)
        if (tableName.equalsIgnoreCase(Constants.TBL_NAME_AFILIACIONESPLANES)) {
            fields.add(FLD_TMAFILIACIONESPLANES_FUNCIONARIOID);
            fields.add(FLD_TMAFILIACIONESPLANES_PLANESPLAN);
        }
        // Intermediate relation (TM_ValorPregunta)
        if (tableName.equalsIgnoreCase(Constants.TBL_NAME_VALORPREGUNTA)) {
            fields.add(FLD_TMVALORPREGUNTA_VALORIDENTIFICADOR);
            fields.add(FLD_TMVALORPREGUNTA_PREGUNTANUMERO);
        }
        // Intermediate relation (TM_DominioPeriodicidad)
        if (tableName.equalsIgnoreCase(Constants.TBL_NAME_DOMINIOPERIODICIDAD)) {
            fields.add(FLD_TMDOMINIOPERIODICIDAD_DOMINIONUMERO);
            fields.add(FLD_TMDOMINIOPERIODICIDAD_PERIODICIDADCODIGO);
        }
        // Intermediate relation (TM_DominioRol)
        if (tableName.equalsIgnoreCase(Constants.TBL_NAME_DOMINIOROL)) {
            fields.add(FLD_TMDOMINIOROL_DOMINIONUMERO);
            fields.add(FLD_TMDOMINIOROL_ROLIDENTIFICADOR);
        }
        // Intermediate relation (TM_IncompatibilidadesDominio)
        if (tableName.equalsIgnoreCase(Constants.TBL_NAME_INCOMPATIBILIDADESDOMINIO)) {
            fields.add(FLD_TMINCOMPATIBILIDADESDOMINIO_DOMINIONUMERO);
            fields.add(FLD_TMINCOMPATIBILIDADESDOMINIO_DOMINIODOMINIOSINCOMPATIBLESNUMERO);
        }
        // Intermediate relation (TM_AgentexProductoDominio)
        if (tableName.equalsIgnoreCase(Constants.TBL_NAME_AGENTEXPRODUCTODOMINIO)) {
            fields.add(FLD_TMAGENTEXPRODUCTODOMINIO_FUNCIONARIOID);
            fields.add(FLD_TMAGENTEXPRODUCTODOMINIO_AGENTEXPRODUCTOAGENTEXPRODUCTOID);
            fields.add(FLD_TMAGENTEXPRODUCTODOMINIO_DOMINIONUMERO);
        }
        // Intermediate relation (TM_DominioFormaPago)
        if (tableName.equalsIgnoreCase(Constants.TBL_NAME_DOMINIOFORMAPAGO)) {
            fields.add(FLD_TMDOMINIOFORMAPAGO_DOMINIONUMERO);
            fields.add(FLD_TMDOMINIOFORMAPAGO_FORMAPAGOCODIGO);
        }
        // Intermediate relation (TM_DominiosPlantillas)
        if (tableName.equalsIgnoreCase(Constants.TBL_NAME_DOMINIOSPLANTILLAS)) {
            fields.add(FLD_TMDOMINIOSPLANTILLAS_DOMINIONUMERO);
            fields.add(FLD_TMDOMINIOSPLANTILLAS_PLANTILLAEMAILIDPLANTILLA);
        }
        // Intermediate relation (TM_DominioNovedad)
        if (tableName.equalsIgnoreCase(Constants.TBL_NAME_DOMINIONOVEDAD)) {
            fields.add(FLD_TMDOMINIONOVEDAD_DOMINIONUMERO);
            fields.add(FLD_TMDOMINIONOVEDAD_NOVEDADIDNOVEDAD);
        }
        // Intermediate relation (TM_DirSucursalCTipoSucursalC)
        if (tableName.equalsIgnoreCase(Constants.TBL_NAME_DIRSUCURSALCTIPOSUCURSALC)) {
            fields.add(FLD_TMDIRSUCURSALCTIPOSUCURSALC_DIRSUCURSALCCODIGO);
            fields.add(FLD_TMDIRSUCURSALCTIPOSUCURSALC_TIPOSUCURSALCTIPOSSUCURSALCCODIGO);
        }
        return fields;
    }

    /***
     * Returns the alias of a class
     * 
     * @param className Name of the class
     * @return Alias of the class
     */
    public static String getClassAlias(String className) {
        String classAlias;
        String classAliasConstant = "CLASS_ALIAS";
        Class<?> constantClass = getConstantClass(className);
        if (constantClass != null) {
            try {
                Field targetField = constantClass.getField(classAliasConstant);
                classAlias = (String) targetField.get(null);
            } catch (Exception e) {
                logMessage(Arrays.toString(e.getStackTrace()));
                classAlias = className;
            }

        } else {
            classAlias = className;
        }
        return classAlias;
    }

    /***
     * Returns the alias of a service
     * 
     * @param className   Name of the class owning the service
     * @param serviceName Name of the service
     * @return Alias of the service
     */
    public static String getServiceAlias(String className, String serviceName) {
        String serviceAlias = null;
        String serviceAliasConstant = "SERV_ALIAS_" + serviceName.toUpperCase();
        Class<?> constantClass = getConstantClass(className);
        if (constantClass != null) {
            try {
                Field targetField = constantClass.getField(serviceAliasConstant);
                serviceAlias = (String) targetField.get(null);
            } catch (Exception e) {
                logMessage(Arrays.toString(e.getStackTrace()));
                serviceAlias = serviceName;
            }
        }
        return (serviceAlias != null ? serviceAlias : serviceName);
    }

    /***
     * Returns the alias of an inbound argument
     * 
     * @param className    Name of the class owning the service
     * @param serviceName  Name of the service owning the argument
     * @param argumentName Name of the argument
     * @return Alias of the argument
     */
    public static String getInboundArgumentAlias(String className, String serviceName, String argumentName) {
        String argumentAlias;
        String argumentAliasConstant = "ARG_ALIAS_" + serviceName.toUpperCase() + "_" + argumentName.toUpperCase();
        Class<?> constantClass = getConstantClass(className);
        if (constantClass != null) {
            try {
                Field targetField = constantClass.getField(argumentAliasConstant);
                argumentAlias = (String) targetField.get(null);
            } catch (Exception e) {
                logMessage(Arrays.toString(e.getStackTrace()));
                argumentAlias = argumentName;
            }
        } else {
            argumentAlias = argumentName;
        }

        return argumentAlias;
    }

    /**
     * Method that normalizes a Display Set Item path.
     * 
     * @param startingClass Name of the class owning the displayset
     * @param path          Display Set Item path
     * @return normalized Display Set Item path
     */
    public static String normalizeDSItemPath(String startingClass, String path) {
        StringBuilder result = new StringBuilder();
        String[] pathItems = path.split(REGEXP_DOT_SEPARATOR);
        String lastItem = pathItems[pathItems.length - 1];
        String currentClass = startingClass;
        Class<?> constantClass;
        Field targetField = null;
        String separator = "";
        // Role names before attribute name
        for (int i = 0; i < pathItems.length - 1; i++) {
            String roleName = pathItems[i];
            String roleNameConstant = ROLENAMEPREFIX + roleName.toUpperCase();
            constantClass = getConstantClass(currentClass);
            try {
                targetField = (constantClass != null ? constantClass.getField(roleNameConstant) : null);
                String normalizedRoleName = (targetField != null ? (String) targetField.get(null) : roleName);
                result.append(separator);
                result.append(normalizedRoleName);
                separator = ".";
                currentClass = roleTargetClass(currentClass, normalizedRoleName);
            } catch (NoSuchFieldException | IllegalAccessException e) {
                logMessage(Arrays.toString(e.getStackTrace()));
            }
        }

        // Attribute name
        constantClass = getConstantClass(currentClass);
        String attributeNameConstant = ATTRNAMEPREFIX + lastItem.toUpperCase();
        try {
            targetField = (constantClass != null ? constantClass.getField(attributeNameConstant) : null);
            String normalizedAttributeName = (targetField != null ? (String) targetField.get(null) : lastItem);
            result.append(separator);
            result.append(normalizedAttributeName);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            logMessage(Arrays.toString(e.getStackTrace()));
        }

        return result.toString();
    }

    public static String normalizePath(String startingClass, String path, boolean ignoreFirstItem){

    	String[] pathItems = path.split(REGEXP_DOT_SEPARATOR);
    	String currentClass = startingClass;

        if (currentClass.isEmpty()) {
            ignoreFirstItem = true;
            currentClass = pathItems[0];
        }
    
        return processPathItems(currentClass, pathItems, ignoreFirstItem);

    }
    
    private static String processPathItems(String initialClass, String[] pathItems, boolean ignoreFirstItem) {
    	StringBuilder result = new StringBuilder();
    	String currentClass = initialClass;
        // Path items names
        int itemsCount = 0;
    	for(String roleName : pathItems) {
    		itemsCount++;
            if (ignoreFirstItem && itemsCount == 1){
                result.append(roleName);
            } else {
            	String roleNameConstant = ROLENAMEPREFIX + roleName.toUpperCase();
            	String attrNameConstant = ATTRNAMEPREFIX + roleName.toUpperCase();
                Field targetField = getField(getConstantClass(currentClass), roleNameConstant, attrNameConstant);
                if (targetField != null) {
                	String normalizedPathItemName = getNormalizedPathItemName(targetField);
                	currentClass = getReachedClass(currentClass, roleNameConstant, normalizedPathItemName);
                    result.append((result.length() > 0 ? "." : "") + normalizedPathItemName);
                }
            }
        }
    	return result.toString();
    }
        
    private static boolean isRole(Class<?> constantClass, String roleNameConstant) {
    	return getRoleField(constantClass, roleNameConstant) != null;
    }
    
    private static Field getField(Class<?> constantClass, String roleNameConstant, String attributeNameConstant) {
    	Field field = constantClass != null ? getRoleField(constantClass, roleNameConstant) : null;
    	if (field == null) field = getAttributeField(constantClass, attributeNameConstant);
    	return field;
    }
    
    private static Field getRoleField(Class<?> constantClass, String roleNameConstant) {
    	Field targetField;
        try {
            targetField = constantClass != null ? constantClass.getField(roleNameConstant) : null;
        } catch (NoSuchFieldException nsfe) {
            logMessage(Arrays.toString(nsfe.getStackTrace()));
            targetField = null;
        }
        return targetField;
    }
    
    private static Field getAttributeField(Class<?> constantClass, String attributeNameConstant) {
    	Field targetField;
        try {
            targetField = constantClass != null ? constantClass.getField(attributeNameConstant) : null;
        } catch (NoSuchFieldException nsfe) {
        	logMessage(Arrays.toString(nsfe.getStackTrace()));
            targetField = null;
        }
    	return targetField;
    }

    private static String getReachedClass(String currentClass, String roleNameConstant, String normalizedPathItemName) {
        return (isRole(getConstantClass(currentClass), roleNameConstant))
            ? roleTargetClass(currentClass, normalizedPathItemName)
            : currentClass;
    }
    
    private static String getNormalizedPathItemName(Field targetField) {
    	try {
    		return targetField != null ? (String)targetField.get(null) : null;
    	} catch (IllegalAccessException iae) {
        	logMessage(Arrays.toString(iae.getStackTrace()));
    		return "";
    	}
    }

    private static void logMessage(String message) {
        Logger logger = LoggerFactory.getLogger(Constants.class);
        logger.debug(message);
    }
}
