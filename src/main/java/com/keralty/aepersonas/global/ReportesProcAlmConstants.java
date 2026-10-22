package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>ReportesProcAlm</code> model class.
 */
public final class ReportesProcAlmConstants {

    private ReportesProcAlmConstants() {

    }

    // Class
    /** <code>ReportesProcAlm</code> class id. */
    public static final String CLASS_ID = "Clas_1547029184512775_Alias";
    /** <code>ReportesProcAlm</code> class name. */
    public static final String CLASS_NAME = "ReportesProcAlm";
    /** <code>ReportesProcAlm</code> class alias. */
    public static final String CLASS_ALIAS = "Info Reporte";
    /** <code>ReportesProcAlm</code> class table name. */
    public static final String TBL_NAME = "ReportesProcAlm";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "reportesProcAlmidReporte,reportesProcAlmDescripcion,reportesProcAlmNombreProc,reportesProcAlmNombreFichero";

    public static final String DSICREPORTESPROCALM = "IC_ReportesProcAlm";
    public static final String DSDSREPORTESPROCALM = "DS_ReportesProcAlm";
    public static final String DSDSMMD = "DS_M_MD";
    

    // Attribute (reportesProcAlmidReporte)
    /** <code>reportesProcAlmidReporte</code> attribute id. */
    public static final String ATTR_ID_REPORTESPROCALMIDREPORTE = "Clas_1547029184512775Atr_1_Alias";
    /** <code>reportesProcAlmidReporte</code> attribute name. */
    public static final String ATTR_NAME_REPORTESPROCALMIDREPORTE = "reportesProcAlmidReporte";
    /** <code>reportesProcAlmidReporte</code> attribute alias. */
    public static final String ATTR_ALIAS_REPORTESPROCALMIDREPORTE = "Id.";

    /** <code>reportesProcAlmidReporte</code> attribute facet sequence. */
    public static final String PATH_FACETS_REPORTESPROCALMIDREPORTE = "";
    /** Agents allowed to view the attribute reportesProcAlmidReporte **/
    public static final String REPORTESPROCALMIDREPORTE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (reportesProcAlmDescripcion)
    /** <code>reportesProcAlmDescripcion</code> attribute id. */
    public static final String ATTR_ID_REPORTESPROCALMDESCRIPCION = "Clas_1547029184512775Atr_2_Alias";
    /** <code>reportesProcAlmDescripcion</code> attribute name. */
    public static final String ATTR_NAME_REPORTESPROCALMDESCRIPCION = "reportesProcAlmDescripcion";
    /** <code>reportesProcAlmDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_REPORTESPROCALMDESCRIPCION = "Descripción";

    /** <code>reportesProcAlmDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_REPORTESPROCALMDESCRIPCION = "";
    /** Agents allowed to view the attribute reportesProcAlmDescripcion **/
    public static final String REPORTESPROCALMDESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (reportesProcAlmNombreProc)
    /** <code>reportesProcAlmNombreProc</code> attribute id. */
    public static final String ATTR_ID_REPORTESPROCALMNOMBREPROC = "Clas_1547029184512775Atr_3_Alias";
    /** <code>reportesProcAlmNombreProc</code> attribute name. */
    public static final String ATTR_NAME_REPORTESPROCALMNOMBREPROC = "reportesProcAlmNombreProc";
    /** <code>reportesProcAlmNombreProc</code> attribute alias. */
    public static final String ATTR_ALIAS_REPORTESPROCALMNOMBREPROC = "Nombre procedimiento";

    /** <code>reportesProcAlmNombreProc</code> attribute facet sequence. */
    public static final String PATH_FACETS_REPORTESPROCALMNOMBREPROC = "";
    /** Agents allowed to view the attribute reportesProcAlmNombreProc **/
    public static final String REPORTESPROCALMNOMBREPROC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (reportesProcAlmNombreFichero)
    /** <code>reportesProcAlmNombreFichero</code> attribute id. */
    public static final String ATTR_ID_REPORTESPROCALMNOMBREFICHERO = "Clas_1547029184512775Atr_4_Alias";
    /** <code>reportesProcAlmNombreFichero</code> attribute name. */
    public static final String ATTR_NAME_REPORTESPROCALMNOMBREFICHERO = "reportesProcAlmNombreFichero";
    /** <code>reportesProcAlmNombreFichero</code> attribute alias. */
    public static final String ATTR_ALIAS_REPORTESPROCALMNOMBREFICHERO = "Nombre fichero";

    /** <code>reportesProcAlmNombreFichero</code> attribute facet sequence. */
    public static final String PATH_FACETS_REPORTESPROCALMNOMBREFICHERO = "";
    /** Agents allowed to view the attribute reportesProcAlmNombreFichero **/
    public static final String REPORTESPROCALMNOMBREFICHERO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";


    // Field (id_Reporte)
    /** <code>id_Reporte</code> field name. */
    public static final String FLD_REPORTESPROCALMIDREPORTE = "id_Reporte";    
    /** <code>reportesProcAlmidReporte</code> attribute field name. */
    public static final String ATTR_FIELD_REPORTESPROCALMIDREPORTE = "reportesProcAlmidReporte";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_REPORTESPROCALMDESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_REPORTESPROCALMDESCRIPCIONLENGTH = 50;
    /** <code>reportesProcAlmDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_REPORTESPROCALMDESCRIPCION = "reportesProcAlmDescripcion";
    // Field (NombreProc)
    /** <code>NombreProc</code> field name. */
    public static final String FLD_REPORTESPROCALMNOMBREPROC = "NombreProc";    
    /** <code>NombreProc</code> field length. */
    public static final int FLD_REPORTESPROCALMNOMBREPROCLENGTH = 200;
    /** <code>reportesProcAlmNombreProc</code> attribute field name. */
    public static final String ATTR_FIELD_REPORTESPROCALMNOMBREPROC = "reportesProcAlmNombreProc";
    // Field (NombreFichero)
    /** <code>NombreFichero</code> field name. */
    public static final String FLD_REPORTESPROCALMNOMBREFICHERO = "NombreFichero";    
    /** <code>NombreFichero</code> field length. */
    public static final int FLD_REPORTESPROCALMNOMBREFICHEROLENGTH = 200;
    /** <code>reportesProcAlmNombreFichero</code> attribute field name. */
    public static final String ATTR_FIELD_REPORTESPROCALMNOMBREFICHERO = "reportesProcAlmNombreFichero";

    // Component role (Funcionarios)
    /** <code>Funcionarios</code> role id. */
    public static final String ROLE_ID_FUNCIONARIOS = "Agr_1580740640768218_Alias";
    /** <code>Funcionarios</code> role name. */
    public static final String ROLE_NAME_FUNCIONARIOS = "funcionarios";
    /** <code>Funcionarios</code> role alias. */
    public static final String ROLE_ALIAS_FUNCIONARIOS = "Funcionarios";

    /** <code>Funcionarios</code> inverse role name. */
    public static final String ROLE_INVNAME_FUNCIONARIOS = FuncionarioConstants.ROLE_NAME_REPORTES;
    /** <code>Funcionarios</code> role facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIOS = "";
    /** <code>Funcionarios</code> role target class. */
    public static final String ROLE_TARGET_FUNCIONARIOS = FuncionarioConstants.CLASS_NAME;

    /** Agents allowed to navigate through Funcionarios **/
    public static final String FUNCIONARIOS_AGENTS = "Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";

    // Compound role (Parametros)
    /** <code>Parametros</code> role id. */
    public static final String ROLE_ID_PARAMETROS = "Agr_1580739854336068_Alias";
    /** <code>Parametros</code> role name. */
    public static final String ROLE_NAME_PARAMETROS = "parametros";
    /** <code>Reporte</code> role alias. */
    public static final String ROLE_ALIAS_PARAMETROS = "Parámetros";


    /** <code>Parametros</code> inverse role name. */
    public static final String ROLE_INVNAME_PARAMETROS = ParamReporteConstants.ROLE_NAME_REPORTE;
    /** <code>Parametros</code> role facet sequence. */
    public static final String PATH_FACETS_PARAMETROS = "";
    /** <code>Parametros</code> role target class. */
    public static final String ROLE_TARGET_PARAMETROS = ParamReporteConstants.CLASS_NAME;
    /** Agents allowed to navigate through Parametros **/
    public static final String PARAMETROS_AGENTS = "Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1547029184512775Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>reportesProcAlmcrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_REPORTESPROCALMCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>reportesProcAlmcrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_REPORTESPROCALMCREARPATRDESCRIPCION = "Clas_1547029184512775Ser_1Arg_2_Alias";
    /** <code>reportesProcAlmcrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_REPORTESPROCALMCREARPATRDESCRIPCION = "Descripción";
    /** <code>reportesProcAlmcrearpatrNombreProc</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_REPORTESPROCALMCREARPATRNOMBREPROC = "p_atrNombreProc";
    /** <code>reportesProcAlmcrearpatrNombreProc</code> inbound argument id. */
    public static final String ARG_ID_CREAR_REPORTESPROCALMCREARPATRNOMBREPROC = "Clas_1547029184512775Ser_1Arg_3_Alias";
    /** <code>reportesProcAlmcrearpatrNombreProc</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_REPORTESPROCALMCREARPATRNOMBREPROC = "Nombre procedimiento";
    /** <code>reportesProcAlmcrearpatrNombreFichero</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_REPORTESPROCALMCREARPATRNOMBREFICHERO = "p_atrNombreFichero";
    /** <code>reportesProcAlmcrearpatrNombreFichero</code> inbound argument id. */
    public static final String ARG_ID_CREAR_REPORTESPROCALMCREARPATRNOMBREFICHERO = "Clas_1547029184512775Ser_1Arg_4_Alias";
    /** <code>reportesProcAlmcrearpatrNombreFichero</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_REPORTESPROCALMCREARPATRNOMBREFICHERO = "Nombre fichero";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1547029184512775Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>reportesProcAlmeliminarpthisReportesProcAlm</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_REPORTESPROCALMELIMINARPTHISREPORTESPROCALM = "p_thisReportesProcAlm";
    /** <code>reportesProcAlmeliminarpthisReportesProcAlm</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_REPORTESPROCALMELIMINARPTHISREPORTESPROCALM = "Clas_1547029184512775Ser_2Arg_1_Alias";
    /** <code>reportesProcAlmeliminarpthisReportesProcAlm</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_REPORTESPROCALMELIMINARPTHISREPORTESPROCALM = "Info Reporte";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1547029184512775Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>reportesProcAlmmodificarpthisReportesProcAlm</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_REPORTESPROCALMMODIFICARPTHISREPORTESPROCALM = "p_thisReportesProcAlm";
    /** <code>reportesProcAlmmodificarpthisReportesProcAlm</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_REPORTESPROCALMMODIFICARPTHISREPORTESPROCALM = "Clas_1547029184512775Ser_3Arg_1_Alias";
    /** <code>reportesProcAlmmodificarpthisReportesProcAlm</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_REPORTESPROCALMMODIFICARPTHISREPORTESPROCALM = "Info Reporte";
    /** <code>reportesProcAlmmodificarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_REPORTESPROCALMMODIFICARPDESCRIPCION = "p_Descripcion";
    /** <code>reportesProcAlmmodificarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_REPORTESPROCALMMODIFICARPDESCRIPCION = "Clas_1547029184512775Ser_3Arg_2_Alias";
    /** <code>reportesProcAlmmodificarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_REPORTESPROCALMMODIFICARPDESCRIPCION = "Descripción";
    /** <code>reportesProcAlmmodificarpNombreProc</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_REPORTESPROCALMMODIFICARPNOMBREPROC = "p_NombreProc";
    /** <code>reportesProcAlmmodificarpNombreProc</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_REPORTESPROCALMMODIFICARPNOMBREPROC = "Clas_1547029184512775Ser_3Arg_3_Alias";
    /** <code>reportesProcAlmmodificarpNombreProc</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_REPORTESPROCALMMODIFICARPNOMBREPROC = "Nombre procedimiento";
    /** <code>reportesProcAlmmodificarpNombreFichero</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_REPORTESPROCALMMODIFICARPNOMBREFICHERO = "p_NombreFichero";
    /** <code>reportesProcAlmmodificarpNombreFichero</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_REPORTESPROCALMMODIFICARPNOMBREFICHERO = "Clas_1547029184512775Ser_3Arg_4_Alias";
    /** <code>reportesProcAlmmodificarpNombreFichero</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_REPORTESPROCALMMODIFICARPNOMBREFICHERO = "Nombre fichero";
    // Service (evGenerar)
    /** <code>evGenerar</code> service id. */
    public static final String SERV_ID_EVGENERAR = "Clas_1547029184512775Ser_4_Alias";
    /** <code>evGenerar</code> service name. */
    public static final String SERV_NAME_EVGENERAR = "evGenerar";
    /** <code>evGenerar</code> service alias. */
    public static final String SERV_ALIAS_EVGENERAR = "Generar";
    /** Agents allowed to execute the service evGenerar **/
    public static final String EVGENERAR_SRVAGENTS = "";
    // Preconditions
    /** <code>evGenerar</code> precondition 0 id. */
    public static final String PRE_ID_EVGENERAR_0 = "Clas_1547029184512775Pre_3_MsgError";
    // Inbound arguments
    /** <code>reportesProcAlmevGenerarpthisReportesProcAlm</code> inbound argument name. */
    public static final String ARG_NAME_EVGENERAR_REPORTESPROCALMEVGENERARPTHISREPORTESPROCALM = "p_thisReportesProcAlm";
    /** <code>reportesProcAlmevGenerarpthisReportesProcAlm</code> inbound argument id. */
    public static final String ARG_ID_EVGENERAR_REPORTESPROCALMEVGENERARPTHISREPORTESPROCALM = "Clas_1547029184512775Ser_4Arg_1_Alias";
    /** <code>reportesProcAlmevGenerarpthisReportesProcAlm</code> inbound argument alias. */
    public static final String ARG_ALIAS_EVGENERAR_REPORTESPROCALMEVGENERARPTHISREPORTESPROCALM = "Info Reporte";
    /** <code>reportesProcAlmevGenerarpValorArgumentos</code> inbound argument name. */
    public static final String ARG_NAME_EVGENERAR_REPORTESPROCALMEVGENERARPVALORARGUMENTOS = "pValorArgumentos";
    /** <code>reportesProcAlmevGenerarpValorArgumentos</code> inbound argument id. */
    public static final String ARG_ID_EVGENERAR_REPORTESPROCALMEVGENERARPVALORARGUMENTOS = "Clas_1547029184512775Ser_4Arg_6_Alias";
    /** <code>reportesProcAlmevGenerarpValorArgumentos</code> inbound argument alias. */
    public static final String ARG_ALIAS_EVGENERAR_REPORTESPROCALMEVGENERARPVALORARGUMENTOS = "Valor argumentos";
    // Outbound arguments
    /** <code>reportesProcAlmevGeneraroaFichero</code> outbound argument name. */
    public static final String ARG_NAME_EVGENERAR_REPORTESPROCALMEVGENERAROAFICHERO = "reportesProcAlmevGeneraroaFichero";
    /** <code>reportesProcAlmevGeneraroaFichero</code> outbound argument id. */
    public static final String ARG_ID_EVGENERAR_REPORTESPROCALMEVGENERAROAFICHERO = "Clas_1547029184512775Ser_4Arg_2_Alias";
    /** <code>reportesProcAlmevGeneraroaFichero</code> outbound argument alias. */
    public static final String ARG_ALIAS_EVGENERAR_REPORTESPROCALMEVGENERAROAFICHERO = "Fichero";
    /** <code>reportesProcAlmevGeneraroaNombreFichero</code> outbound argument name. */
    public static final String ARG_NAME_EVGENERAR_REPORTESPROCALMEVGENERAROANOMBREFICHERO = "reportesProcAlmevGeneraroaNombreFichero";
    /** <code>reportesProcAlmevGeneraroaNombreFichero</code> outbound argument id. */
    public static final String ARG_ID_EVGENERAR_REPORTESPROCALMEVGENERAROANOMBREFICHERO = "Clas_1547029184512775Ser_4Arg_3_Alias";
    /** <code>reportesProcAlmevGeneraroaNombreFichero</code> outbound argument alias. */
    public static final String ARG_ALIAS_EVGENERAR_REPORTESPROCALMEVGENERAROANOMBREFICHERO = "Reporte";
    // Service (InsReporteFuncionario)
    /** <code>InsReporteFuncionario</code> service id. */
    public static final String SERV_ID_INSREPORTEFUNCIONARIO = "Clas_1547029184512775Ser_5_Alias";
    /** <code>InsReporteFuncionario</code> service name. */
    public static final String SERV_NAME_INSREPORTEFUNCIONARIO = "InsReporteFuncionario";
    /** <code>InsReporteFuncionario</code> service alias. */
    public static final String SERV_ALIAS_INSREPORTEFUNCIONARIO = "Asignar usuario";
    /** Agents allowed to execute the service InsReporteFuncionario **/
    public static final String INSREPORTEFUNCIONARIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>reportesProcAlmInsReporteFuncionariopthisReportesProcAlm</code> inbound argument name. */
    public static final String ARG_NAME_INSREPORTEFUNCIONARIO_REPORTESPROCALMINSREPORTEFUNCIONARIOPTHISREPORTESPROCALM = "p_thisReportesProcAlm";
    /** <code>reportesProcAlmInsReporteFuncionariopthisReportesProcAlm</code> inbound argument id. */
    public static final String ARG_ID_INSREPORTEFUNCIONARIO_REPORTESPROCALMINSREPORTEFUNCIONARIOPTHISREPORTESPROCALM = "Clas_1547029184512775Ser_5Arg_1_Alias";
    /** <code>reportesProcAlmInsReporteFuncionariopthisReportesProcAlm</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSREPORTEFUNCIONARIO_REPORTESPROCALMINSREPORTEFUNCIONARIOPTHISREPORTESPROCALM = "Reportes";
    /** <code>reportesProcAlmInsReporteFuncionariopevcFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_INSREPORTEFUNCIONARIO_REPORTESPROCALMINSREPORTEFUNCIONARIOPEVCFUNCIONARIO = "p_evcFuncionario";
    /** <code>reportesProcAlmInsReporteFuncionariopevcFuncionario</code> inbound argument id. */
    public static final String ARG_ID_INSREPORTEFUNCIONARIO_REPORTESPROCALMINSREPORTEFUNCIONARIOPEVCFUNCIONARIO = "Clas_1547029184512775Ser_5Arg_2_Alias";
    /** <code>reportesProcAlmInsReporteFuncionariopevcFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSREPORTEFUNCIONARIO_REPORTESPROCALMINSREPORTEFUNCIONARIOPEVCFUNCIONARIO = "Funcionarios";
    // Service (DelReporteFuncionario)
    /** <code>DelReporteFuncionario</code> service id. */
    public static final String SERV_ID_DELREPORTEFUNCIONARIO = "Clas_1547029184512775Ser_6_Alias";
    /** <code>DelReporteFuncionario</code> service name. */
    public static final String SERV_NAME_DELREPORTEFUNCIONARIO = "DelReporteFuncionario";
    /** <code>DelReporteFuncionario</code> service alias. */
    public static final String SERV_ALIAS_DELREPORTEFUNCIONARIO = "Quitar usuario";
    /** Agents allowed to execute the service DelReporteFuncionario **/
    public static final String DELREPORTEFUNCIONARIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>reportesProcAlmDelReporteFuncionariopthisReportesProcAlm</code> inbound argument name. */
    public static final String ARG_NAME_DELREPORTEFUNCIONARIO_REPORTESPROCALMDELREPORTEFUNCIONARIOPTHISREPORTESPROCALM = "p_thisReportesProcAlm";
    /** <code>reportesProcAlmDelReporteFuncionariopthisReportesProcAlm</code> inbound argument id. */
    public static final String ARG_ID_DELREPORTEFUNCIONARIO_REPORTESPROCALMDELREPORTEFUNCIONARIOPTHISREPORTESPROCALM = "Clas_1547029184512775Ser_6Arg_1_Alias";
    /** <code>reportesProcAlmDelReporteFuncionariopthisReportesProcAlm</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELREPORTEFUNCIONARIO_REPORTESPROCALMDELREPORTEFUNCIONARIOPTHISREPORTESPROCALM = "Reportes";
    /** <code>reportesProcAlmDelReporteFuncionariopevcFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_DELREPORTEFUNCIONARIO_REPORTESPROCALMDELREPORTEFUNCIONARIOPEVCFUNCIONARIO = "p_evcFuncionario";
    /** <code>reportesProcAlmDelReporteFuncionariopevcFuncionario</code> inbound argument id. */
    public static final String ARG_ID_DELREPORTEFUNCIONARIO_REPORTESPROCALMDELREPORTEFUNCIONARIOPEVCFUNCIONARIO = "Clas_1547029184512775Ser_6Arg_2_Alias";
    /** <code>reportesProcAlmDelReporteFuncionariopevcFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELREPORTEFUNCIONARIO_REPORTESPROCALMDELREPORTEFUNCIONARIOPEVCFUNCIONARIO = "Funcionarios";
    // Service (TCAMBIARORDENPARAMS)
    /** <code>TCAMBIARORDENPARAMS</code> service id. */
    public static final String SERV_ID_TCAMBIARORDENPARAMS = "Clas_1547029184512775Ser_7_Alias";
    /** <code>TCAMBIARORDENPARAMS</code> service name. */
    public static final String SERV_NAME_TCAMBIARORDENPARAMS = "TCAMBIARORDENPARAMS";
    /** <code>TCAMBIARORDENPARAMS</code> service alias. */
    public static final String SERV_ALIAS_TCAMBIARORDENPARAMS = "TSUBIRPARAM";
    /** Agents allowed to execute the service TCAMBIARORDENPARAMS **/
    public static final String TCAMBIARORDENPARAMS_SRVAGENTS = "";
    // Inbound arguments
    /** <code>reportesProcAlmTCAMBIARORDENPARAMSpthisReportesProcAlm</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARORDENPARAMS_REPORTESPROCALMTCAMBIARORDENPARAMSPTHISREPORTESPROCALM = "p_thisReportesProcAlm";
    /** <code>reportesProcAlmTCAMBIARORDENPARAMSpthisReportesProcAlm</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARORDENPARAMS_REPORTESPROCALMTCAMBIARORDENPARAMSPTHISREPORTESPROCALM = "Clas_1547029184512775Ser_7Arg_1_Alias";
    /** <code>reportesProcAlmTCAMBIARORDENPARAMSpthisReportesProcAlm</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARORDENPARAMS_REPORTESPROCALMTCAMBIARORDENPARAMSPTHISREPORTESPROCALM = "Info Reporte";
    /** <code>reportesProcAlmTCAMBIARORDENPARAMSptOrdenActual</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARORDENPARAMS_REPORTESPROCALMTCAMBIARORDENPARAMSPTORDENACTUAL = "ptOrdenActual";
    /** <code>reportesProcAlmTCAMBIARORDENPARAMSptOrdenActual</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARORDENPARAMS_REPORTESPROCALMTCAMBIARORDENPARAMSPTORDENACTUAL = "Clas_1547029184512775Ser_7Arg_2_Alias";
    /** <code>reportesProcAlmTCAMBIARORDENPARAMSptOrdenActual</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARORDENPARAMS_REPORTESPROCALMTCAMBIARORDENPARAMSPTORDENACTUAL = "ptOrdenActual";
    /** <code>reportesProcAlmTCAMBIARORDENPARAMSptNuevoOrden</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARORDENPARAMS_REPORTESPROCALMTCAMBIARORDENPARAMSPTNUEVOORDEN = "ptNuevoOrden";
    /** <code>reportesProcAlmTCAMBIARORDENPARAMSptNuevoOrden</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARORDENPARAMS_REPORTESPROCALMTCAMBIARORDENPARAMSPTNUEVOORDEN = "Clas_1547029184512775Ser_7Arg_3_Alias";
    /** <code>reportesProcAlmTCAMBIARORDENPARAMSptNuevoOrden</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARORDENPARAMS_REPORTESPROCALMTCAMBIARORDENPARAMSPTNUEVOORDEN = "ptNuevoOrden";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_REPORTESPROCALMDESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_REPORTESPROCALMNOMBREPROC.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_REPORTESPROCALMNOMBREFICHERO.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_REPORTESPROCALMIDREPORTE.toUpperCase(), REPORTESPROCALMIDREPORTE_AGENTS);
    	attributeAgents.put(ATTR_NAME_REPORTESPROCALMDESCRIPCION.toUpperCase(), REPORTESPROCALMDESCRIPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_REPORTESPROCALMNOMBREPROC.toUpperCase(), REPORTESPROCALMNOMBREPROC_AGENTS);
    	attributeAgents.put(ATTR_NAME_REPORTESPROCALMNOMBREFICHERO.toUpperCase(), REPORTESPROCALMNOMBREFICHERO_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'ReportesProcAlm', it returns the identification keys
     * - If className is a facet of the inheritance net of 'ReportesProcAlm', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_REPORTESPROCALMIDREPORTE);
        }
        // Facet 'ReportesProcAlm' (This facet)
        if (ReportesProcAlmConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_REPORTESPROCALMIDREPORTE);
        }
        return returnList;
    }
}
