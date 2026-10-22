package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>GrupoAsignacion</code> model class.
 */
public final class GrupoAsignacionConstants {

    private GrupoAsignacionConstants() {

    }

    // Class
    /** <code>GrupoAsignacion</code> class id. */
    public static final String CLASS_ID = "Clas_1586850168832947_Alias";
    /** <code>GrupoAsignacion</code> class name. */
    public static final String CLASS_NAME = "GrupoAsignacion";
    /** <code>GrupoAsignacion</code> class alias. */
    public static final String CLASS_ALIAS = "Grupo de Asignación";
    /** <code>GrupoAsignacion</code> class table name. */
    public static final String TBL_NAME = "GrupoAsignacion";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "grupoAsignacionId,grupoAsignacionTipo,grupoAsignacionNombre,grupoAsignacionDescripcion";

    public static final String DSDSGRUPOASIGNACION = "DS_GrupoAsignacion";
    public static final String DSICGRUPOASIGNACION = "IC_GrupoAsignacion";
    

    // Attribute (grupoAsignacionId)
    /** <code>grupoAsignacionId</code> attribute id. */
    public static final String ATTR_ID_GRUPOASIGNACIONID = "Clas_1586850168832947Atr_1_Alias";
    /** <code>grupoAsignacionId</code> attribute name. */
    public static final String ATTR_NAME_GRUPOASIGNACIONID = "grupoAsignacionId";
    /** <code>grupoAsignacionId</code> attribute alias. */
    public static final String ATTR_ALIAS_GRUPOASIGNACIONID = "Id.";

    /** <code>grupoAsignacionId</code> attribute facet sequence. */
    public static final String PATH_FACETS_GRUPOASIGNACIONID = "";
    /** Agents allowed to view the attribute grupoAsignacionId **/
    public static final String GRUPOASIGNACIONID_AGENTS = "Admin,SuperAdmin,Asesor,Gestor";
    // Attribute (grupoAsignacionTipo)
    /** <code>grupoAsignacionTipo</code> attribute id. */
    public static final String ATTR_ID_GRUPOASIGNACIONTIPO = "Clas_1586850168832947Atr_2_Alias";
    /** <code>grupoAsignacionTipo</code> attribute name. */
    public static final String ATTR_NAME_GRUPOASIGNACIONTIPO = "grupoAsignacionTipo";
    /** <code>grupoAsignacionTipo</code> attribute alias. */
    public static final String ATTR_ALIAS_GRUPOASIGNACIONTIPO = "Tipo";

    /** <code>grupoAsignacionTipo</code> attribute facet sequence. */
    public static final String PATH_FACETS_GRUPOASIGNACIONTIPO = "";
    /** Agents allowed to view the attribute grupoAsignacionTipo **/
    public static final String GRUPOASIGNACIONTIPO_AGENTS = "Admin,SuperAdmin,Asesor,Gestor";
    // Attribute (grupoAsignacionNombre)
    /** <code>grupoAsignacionNombre</code> attribute id. */
    public static final String ATTR_ID_GRUPOASIGNACIONNOMBRE = "Clas_1586850168832947Atr_3_Alias";
    /** <code>grupoAsignacionNombre</code> attribute name. */
    public static final String ATTR_NAME_GRUPOASIGNACIONNOMBRE = "grupoAsignacionNombre";
    /** <code>grupoAsignacionNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_GRUPOASIGNACIONNOMBRE = "Nombre";

    /** <code>grupoAsignacionNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_GRUPOASIGNACIONNOMBRE = "";
    /** Agents allowed to view the attribute grupoAsignacionNombre **/
    public static final String GRUPOASIGNACIONNOMBRE_AGENTS = "Admin,SuperAdmin,Asesor,Gestor";
    // Attribute (grupoAsignacionDescripcion)
    /** <code>grupoAsignacionDescripcion</code> attribute id. */
    public static final String ATTR_ID_GRUPOASIGNACIONDESCRIPCION = "Clas_1586850168832947Atr_4_Alias";
    /** <code>grupoAsignacionDescripcion</code> attribute name. */
    public static final String ATTR_NAME_GRUPOASIGNACIONDESCRIPCION = "grupoAsignacionDescripcion";
    /** <code>grupoAsignacionDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_GRUPOASIGNACIONDESCRIPCION = "Descripción";

    /** <code>grupoAsignacionDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_GRUPOASIGNACIONDESCRIPCION = "";
    /** Agents allowed to view the attribute grupoAsignacionDescripcion **/
    public static final String GRUPOASIGNACIONDESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,Gestor";


    // Field (Id)
    /** <code>Id</code> field name. */
    public static final String FLD_GRUPOASIGNACIONID = "Id";    
    /** <code>grupoAsignacionId</code> attribute field name. */
    public static final String ATTR_FIELD_GRUPOASIGNACIONID = "grupoAsignacionId";
    // Field (Tipo)
    /** <code>Tipo</code> field name. */
    public static final String FLD_GRUPOASIGNACIONTIPO = "Tipo";    
    /** <code>grupoAsignacionTipo</code> attribute field name. */
    public static final String ATTR_FIELD_GRUPOASIGNACIONTIPO = "grupoAsignacionTipo";
    // Field (Nombre)
    /** <code>Nombre</code> field name. */
    public static final String FLD_GRUPOASIGNACIONNOMBRE = "Nombre";    
    /** <code>Nombre</code> field length. */
    public static final int FLD_GRUPOASIGNACIONNOMBRELENGTH = 50;
    /** <code>grupoAsignacionNombre</code> attribute field name. */
    public static final String ATTR_FIELD_GRUPOASIGNACIONNOMBRE = "grupoAsignacionNombre";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_GRUPOASIGNACIONDESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_GRUPOASIGNACIONDESCRIPCIONLENGTH = 150;
    /** <code>grupoAsignacionDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_GRUPOASIGNACIONDESCRIPCION = "grupoAsignacionDescripcion";

    // Component role (Funcionario)
    /** <code>Funcionario</code> role id. */
    public static final String ROLE_ID_FUNCIONARIO = "Agr_1586850430976556_Alias";
    /** <code>Funcionario</code> role name. */
    public static final String ROLE_NAME_FUNCIONARIO = "funcionario";
    /** <code>Funcionario</code> role alias. */
    public static final String ROLE_ALIAS_FUNCIONARIO = "Funcionario";

    /** <code>Funcionario</code> inverse role name. */
    public static final String ROLE_INVNAME_FUNCIONARIO = FuncionarioConstants.ROLE_NAME_GRUPOASIGNACION;
    /** <code>Funcionario</code> role facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIO = "";
    /** <code>Funcionario</code> role target class. */
    public static final String ROLE_TARGET_FUNCIONARIO = FuncionarioConstants.CLASS_NAME;

    /** Agents allowed to navigate through Funcionario **/
    public static final String FUNCIONARIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor";

    // Compound role (DominioAsesores)
    /** <code>DominioAsesores</code> role id. */
    public static final String ROLE_ID_DOMINIOASESORES = "Agr_1586850955264639_Alias";
    /** <code>DominioAsesores</code> role name. */
    public static final String ROLE_NAME_DOMINIOASESORES = "dominioAsesores";
    /** <code>GrupoAsesores</code> role alias. */
    public static final String ROLE_ALIAS_DOMINIOASESORES = "Dominio Asesores";


    /** <code>DominioAsesores</code> inverse role name. */
    public static final String ROLE_INVNAME_DOMINIOASESORES = DominioConstants.ROLE_NAME_GRUPOASESORES;
    /** <code>DominioAsesores</code> role facet sequence. */
    public static final String PATH_FACETS_DOMINIOASESORES = "";
    /** <code>DominioAsesores</code> role target class. */
    public static final String ROLE_TARGET_DOMINIOASESORES = DominioConstants.CLASS_NAME;
    /** Agents allowed to navigate through DominioAsesores **/
    public static final String DOMINIOASESORES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor";
    // Compound role (DominioAreaMedica)
    /** <code>DominioAreaMedica</code> role id. */
    public static final String ROLE_ID_DOMINIOAREAMEDICA = "Agr_1586851086336262_Alias";
    /** <code>DominioAreaMedica</code> role name. */
    public static final String ROLE_NAME_DOMINIOAREAMEDICA = "dominioAreaMedica";
    /** <code>GrupoAreaMedica</code> role alias. */
    public static final String ROLE_ALIAS_DOMINIOAREAMEDICA = "Dominios Area Medica";


    /** <code>DominioAreaMedica</code> inverse role name. */
    public static final String ROLE_INVNAME_DOMINIOAREAMEDICA = DominioConstants.ROLE_NAME_GRUPOAREAMEDICA;
    /** <code>DominioAreaMedica</code> role facet sequence. */
    public static final String PATH_FACETS_DOMINIOAREAMEDICA = "";
    /** <code>DominioAreaMedica</code> role target class. */
    public static final String ROLE_TARGET_DOMINIOAREAMEDICA = DominioConstants.CLASS_NAME;
    /** Agents allowed to navigate through DominioAreaMedica **/
    public static final String DOMINIOAREAMEDICA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor";
    // Compound role (LogGrupoAsignacion)
    /** <code>LogGrupoAsignacion</code> role id. */
    public static final String ROLE_ID_LOGGRUPOASIGNACION = "Agr_1586850430976636_Alias";
    /** <code>LogGrupoAsignacion</code> role name. */
    public static final String ROLE_NAME_LOGGRUPOASIGNACION = "logGrupoAsignacion";
    /** <code>GrupoAsignacion</code> role alias. */
    public static final String ROLE_ALIAS_LOGGRUPOASIGNACION = "Histórico";


    /** <code>LogGrupoAsignacion</code> inverse role name. */
    public static final String ROLE_INVNAME_LOGGRUPOASIGNACION = LogGrupoAsignacionConstants.ROLE_NAME_GRUPOASIGNACION;
    /** <code>LogGrupoAsignacion</code> role facet sequence. */
    public static final String PATH_FACETS_LOGGRUPOASIGNACION = "";
    /** <code>LogGrupoAsignacion</code> role target class. */
    public static final String ROLE_TARGET_LOGGRUPOASIGNACION = LogGrupoAsignacionConstants.CLASS_NAME;
    /** Agents allowed to navigate through LogGrupoAsignacion **/
    public static final String LOGGRUPOASIGNACION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor";
    // Compound role (DominioCausalUsuario)
    /** <code>DominioCausalUsuario</code> role id. */
    public static final String ROLE_ID_DOMINIOCAUSALUSUARIO = "Agr_1586852134912600_Alias";
    /** <code>DominioCausalUsuario</code> role name. */
    public static final String ROLE_NAME_DOMINIOCAUSALUSUARIO = "dominioCausalUsuario";
    /** <code>GrupoUsuarios</code> role alias. */
    public static final String ROLE_ALIAS_DOMINIOCAUSALUSUARIO = "DominioCausalUsuario";


    /** <code>DominioCausalUsuario</code> inverse role name. */
    public static final String ROLE_INVNAME_DOMINIOCAUSALUSUARIO = GrupoAsignacionNovedadConstants.ROLE_NAME_GRUPOUSUARIOS;
    /** <code>DominioCausalUsuario</code> role facet sequence. */
    public static final String PATH_FACETS_DOMINIOCAUSALUSUARIO = "";
    /** <code>DominioCausalUsuario</code> role target class. */
    public static final String ROLE_TARGET_DOMINIOCAUSALUSUARIO = GrupoAsignacionNovedadConstants.CLASS_NAME;
    /** Agents allowed to navigate through DominioCausalUsuario **/
    public static final String DOMINIOCAUSALUSUARIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1586850168832947Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>grupoAsignacioncrearpatrTipo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_GRUPOASIGNACIONCREARPATRTIPO = "p_atrTipo";
    /** <code>grupoAsignacioncrearpatrTipo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_GRUPOASIGNACIONCREARPATRTIPO = "Clas_1586850168832947Ser_1Arg_2_Alias";
    /** <code>grupoAsignacioncrearpatrTipo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_GRUPOASIGNACIONCREARPATRTIPO = "Tipo";
    /** <code>grupoAsignacioncrearpatrNombre</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_GRUPOASIGNACIONCREARPATRNOMBRE = "p_atrNombre";
    /** <code>grupoAsignacioncrearpatrNombre</code> inbound argument id. */
    public static final String ARG_ID_CREAR_GRUPOASIGNACIONCREARPATRNOMBRE = "Clas_1586850168832947Ser_1Arg_3_Alias";
    /** <code>grupoAsignacioncrearpatrNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_GRUPOASIGNACIONCREARPATRNOMBRE = "Nombre";
    /** <code>grupoAsignacioncrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_GRUPOASIGNACIONCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>grupoAsignacioncrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_GRUPOASIGNACIONCREARPATRDESCRIPCION = "Clas_1586850168832947Ser_1Arg_4_Alias";
    /** <code>grupoAsignacioncrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_GRUPOASIGNACIONCREARPATRDESCRIPCION = "Descripción";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1586850168832947Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>grupoAsignacioneliminarpthisGrupoAsignacion</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_GRUPOASIGNACIONELIMINARPTHISGRUPOASIGNACION = "p_thisGrupoAsignacion";
    /** <code>grupoAsignacioneliminarpthisGrupoAsignacion</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_GRUPOASIGNACIONELIMINARPTHISGRUPOASIGNACION = "Clas_1586850168832947Ser_2Arg_1_Alias";
    /** <code>grupoAsignacioneliminarpthisGrupoAsignacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_GRUPOASIGNACIONELIMINARPTHISGRUPOASIGNACION = "Grupo de Asignación";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1586850168832947Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>grupoAsignacionmodificarpthisGrupoAsignacion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_GRUPOASIGNACIONMODIFICARPTHISGRUPOASIGNACION = "p_thisGrupoAsignacion";
    /** <code>grupoAsignacionmodificarpthisGrupoAsignacion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_GRUPOASIGNACIONMODIFICARPTHISGRUPOASIGNACION = "Clas_1586850168832947Ser_3Arg_1_Alias";
    /** <code>grupoAsignacionmodificarpthisGrupoAsignacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_GRUPOASIGNACIONMODIFICARPTHISGRUPOASIGNACION = "Grupo de Asignación";
    /** <code>grupoAsignacionmodificarpNombre</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_GRUPOASIGNACIONMODIFICARPNOMBRE = "p_Nombre";
    /** <code>grupoAsignacionmodificarpNombre</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_GRUPOASIGNACIONMODIFICARPNOMBRE = "Clas_1586850168832947Ser_3Arg_2_Alias";
    /** <code>grupoAsignacionmodificarpNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_GRUPOASIGNACIONMODIFICARPNOMBRE = "Nombre";
    /** <code>grupoAsignacionmodificarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_GRUPOASIGNACIONMODIFICARPDESCRIPCION = "p_Descripcion";
    /** <code>grupoAsignacionmodificarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_GRUPOASIGNACIONMODIFICARPDESCRIPCION = "Clas_1586850168832947Ser_3Arg_3_Alias";
    /** <code>grupoAsignacionmodificarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_GRUPOASIGNACIONMODIFICARPDESCRIPCION = "Descripción";
    // Service (AddFuncionarioGrupo)
    /** <code>AddFuncionarioGrupo</code> service id. */
    public static final String SERV_ID_ADDFUNCIONARIOGRUPO = "Clas_1586850168832947Ser_4_Alias";
    /** <code>AddFuncionarioGrupo</code> service name. */
    public static final String SERV_NAME_ADDFUNCIONARIOGRUPO = "AddFuncionarioGrupo";
    /** <code>AddFuncionarioGrupo</code> service alias. */
    public static final String SERV_ALIAS_ADDFUNCIONARIOGRUPO = "AddFuncionarioGrupo";
    /** Agents allowed to execute the service AddFuncionarioGrupo **/
    public static final String ADDFUNCIONARIOGRUPO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>grupoAsignacionAddFuncionarioGrupopthisGrupoAsignacion</code> inbound argument name. */
    public static final String ARG_NAME_ADDFUNCIONARIOGRUPO_GRUPOASIGNACIONADDFUNCIONARIOGRUPOPTHISGRUPOASIGNACION = "p_thisGrupoAsignacion";
    /** <code>grupoAsignacionAddFuncionarioGrupopthisGrupoAsignacion</code> inbound argument id. */
    public static final String ARG_ID_ADDFUNCIONARIOGRUPO_GRUPOASIGNACIONADDFUNCIONARIOGRUPOPTHISGRUPOASIGNACION = "Clas_1586850168832947Ser_4Arg_1_Alias";
    /** <code>grupoAsignacionAddFuncionarioGrupopthisGrupoAsignacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_ADDFUNCIONARIOGRUPO_GRUPOASIGNACIONADDFUNCIONARIOGRUPOPTHISGRUPOASIGNACION = "GrupoAsignacion";
    /** <code>grupoAsignacionAddFuncionarioGrupopevcFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_ADDFUNCIONARIOGRUPO_GRUPOASIGNACIONADDFUNCIONARIOGRUPOPEVCFUNCIONARIO = "p_evcFuncionario";
    /** <code>grupoAsignacionAddFuncionarioGrupopevcFuncionario</code> inbound argument id. */
    public static final String ARG_ID_ADDFUNCIONARIOGRUPO_GRUPOASIGNACIONADDFUNCIONARIOGRUPOPEVCFUNCIONARIO = "Clas_1586850168832947Ser_4Arg_2_Alias";
    /** <code>grupoAsignacionAddFuncionarioGrupopevcFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_ADDFUNCIONARIOGRUPO_GRUPOASIGNACIONADDFUNCIONARIOGRUPOPEVCFUNCIONARIO = "Funcionario";
    // Service (DelFuncionarioGrupo)
    /** <code>DelFuncionarioGrupo</code> service id. */
    public static final String SERV_ID_DELFUNCIONARIOGRUPO = "Clas_1586850168832947Ser_5_Alias";
    /** <code>DelFuncionarioGrupo</code> service name. */
    public static final String SERV_NAME_DELFUNCIONARIOGRUPO = "DelFuncionarioGrupo";
    /** <code>DelFuncionarioGrupo</code> service alias. */
    public static final String SERV_ALIAS_DELFUNCIONARIOGRUPO = "DelFuncionarioGrupo";
    /** Agents allowed to execute the service DelFuncionarioGrupo **/
    public static final String DELFUNCIONARIOGRUPO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>grupoAsignacionDelFuncionarioGrupopthisGrupoAsignacion</code> inbound argument name. */
    public static final String ARG_NAME_DELFUNCIONARIOGRUPO_GRUPOASIGNACIONDELFUNCIONARIOGRUPOPTHISGRUPOASIGNACION = "p_thisGrupoAsignacion";
    /** <code>grupoAsignacionDelFuncionarioGrupopthisGrupoAsignacion</code> inbound argument id. */
    public static final String ARG_ID_DELFUNCIONARIOGRUPO_GRUPOASIGNACIONDELFUNCIONARIOGRUPOPTHISGRUPOASIGNACION = "Clas_1586850168832947Ser_5Arg_1_Alias";
    /** <code>grupoAsignacionDelFuncionarioGrupopthisGrupoAsignacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELFUNCIONARIOGRUPO_GRUPOASIGNACIONDELFUNCIONARIOGRUPOPTHISGRUPOASIGNACION = "GrupoAsignacion";
    /** <code>grupoAsignacionDelFuncionarioGrupopevcFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_DELFUNCIONARIOGRUPO_GRUPOASIGNACIONDELFUNCIONARIOGRUPOPEVCFUNCIONARIO = "p_evcFuncionario";
    /** <code>grupoAsignacionDelFuncionarioGrupopevcFuncionario</code> inbound argument id. */
    public static final String ARG_ID_DELFUNCIONARIOGRUPO_GRUPOASIGNACIONDELFUNCIONARIOGRUPOPEVCFUNCIONARIO = "Clas_1586850168832947Ser_5Arg_2_Alias";
    /** <code>grupoAsignacionDelFuncionarioGrupopevcFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELFUNCIONARIOGRUPO_GRUPOASIGNACIONDELFUNCIONARIOGRUPOPEVCFUNCIONARIO = "Funcionario";
    // Service (InsGrupoAsesores)
    /** <code>InsGrupoAsesores</code> service id. */
    public static final String SERV_ID_INSGRUPOASESORES = "Clas_1586850168832947Ser_7_Alias";
    /** <code>InsGrupoAsesores</code> service name. */
    public static final String SERV_NAME_INSGRUPOASESORES = "InsGrupoAsesores";
    /** <code>InsGrupoAsesores</code> service alias. */
    public static final String SERV_ALIAS_INSGRUPOASESORES = "InsGrupoAsesores";
    /** Agents allowed to execute the service InsGrupoAsesores **/
    public static final String INSGRUPOASESORES_SRVAGENTS = "";
    // Inbound arguments
    /** <code>grupoAsignacionInsGrupoAsesorespthisGrupoAsignacion</code> inbound argument name. */
    public static final String ARG_NAME_INSGRUPOASESORES_GRUPOASIGNACIONINSGRUPOASESORESPTHISGRUPOASIGNACION = "p_thisGrupoAsignacion";
    /** <code>grupoAsignacionInsGrupoAsesorespthisGrupoAsignacion</code> inbound argument id. */
    public static final String ARG_ID_INSGRUPOASESORES_GRUPOASIGNACIONINSGRUPOASESORESPTHISGRUPOASIGNACION = "Clas_1586850168832947Ser_7Arg_1_Alias";
    /** <code>grupoAsignacionInsGrupoAsesorespthisGrupoAsignacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSGRUPOASESORES_GRUPOASIGNACIONINSGRUPOASESORESPTHISGRUPOASIGNACION = "Grupo Asesores";
    /** <code>grupoAsignacionInsGrupoAsesorespevcDominio</code> inbound argument name. */
    public static final String ARG_NAME_INSGRUPOASESORES_GRUPOASIGNACIONINSGRUPOASESORESPEVCDOMINIO = "p_evcDominio";
    /** <code>grupoAsignacionInsGrupoAsesorespevcDominio</code> inbound argument id. */
    public static final String ARG_ID_INSGRUPOASESORES_GRUPOASIGNACIONINSGRUPOASESORESPEVCDOMINIO = "Clas_1586850168832947Ser_7Arg_2_Alias";
    /** <code>grupoAsignacionInsGrupoAsesorespevcDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSGRUPOASESORES_GRUPOASIGNACIONINSGRUPOASESORESPEVCDOMINIO = "Dominio Asesores";
    // Service (DelGrupoAsesores)
    /** <code>DelGrupoAsesores</code> service id. */
    public static final String SERV_ID_DELGRUPOASESORES = "Clas_1586850168832947Ser_8_Alias";
    /** <code>DelGrupoAsesores</code> service name. */
    public static final String SERV_NAME_DELGRUPOASESORES = "DelGrupoAsesores";
    /** <code>DelGrupoAsesores</code> service alias. */
    public static final String SERV_ALIAS_DELGRUPOASESORES = "DelGrupoAsesores";
    /** Agents allowed to execute the service DelGrupoAsesores **/
    public static final String DELGRUPOASESORES_SRVAGENTS = "";
    // Inbound arguments
    /** <code>grupoAsignacionDelGrupoAsesorespthisGrupoAsignacion</code> inbound argument name. */
    public static final String ARG_NAME_DELGRUPOASESORES_GRUPOASIGNACIONDELGRUPOASESORESPTHISGRUPOASIGNACION = "p_thisGrupoAsignacion";
    /** <code>grupoAsignacionDelGrupoAsesorespthisGrupoAsignacion</code> inbound argument id. */
    public static final String ARG_ID_DELGRUPOASESORES_GRUPOASIGNACIONDELGRUPOASESORESPTHISGRUPOASIGNACION = "Clas_1586850168832947Ser_8Arg_1_Alias";
    /** <code>grupoAsignacionDelGrupoAsesorespthisGrupoAsignacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELGRUPOASESORES_GRUPOASIGNACIONDELGRUPOASESORESPTHISGRUPOASIGNACION = "Grupo Asesores";
    /** <code>grupoAsignacionDelGrupoAsesorespevcDominio</code> inbound argument name. */
    public static final String ARG_NAME_DELGRUPOASESORES_GRUPOASIGNACIONDELGRUPOASESORESPEVCDOMINIO = "p_evcDominio";
    /** <code>grupoAsignacionDelGrupoAsesorespevcDominio</code> inbound argument id. */
    public static final String ARG_ID_DELGRUPOASESORES_GRUPOASIGNACIONDELGRUPOASESORESPEVCDOMINIO = "Clas_1586850168832947Ser_8Arg_2_Alias";
    /** <code>grupoAsignacionDelGrupoAsesorespevcDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELGRUPOASESORES_GRUPOASIGNACIONDELGRUPOASESORESPEVCDOMINIO = "Dominio Asesores";
    // Service (InsGrupoAreaMedica)
    /** <code>InsGrupoAreaMedica</code> service id. */
    public static final String SERV_ID_INSGRUPOAREAMEDICA = "Clas_1586850168832947Ser_9_Alias";
    /** <code>InsGrupoAreaMedica</code> service name. */
    public static final String SERV_NAME_INSGRUPOAREAMEDICA = "InsGrupoAreaMedica";
    /** <code>InsGrupoAreaMedica</code> service alias. */
    public static final String SERV_ALIAS_INSGRUPOAREAMEDICA = "InsGrupoAreaMedica";
    /** Agents allowed to execute the service InsGrupoAreaMedica **/
    public static final String INSGRUPOAREAMEDICA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>grupoAsignacionInsGrupoAreaMedicapthisGrupoAsignacion</code> inbound argument name. */
    public static final String ARG_NAME_INSGRUPOAREAMEDICA_GRUPOASIGNACIONINSGRUPOAREAMEDICAPTHISGRUPOASIGNACION = "p_thisGrupoAsignacion";
    /** <code>grupoAsignacionInsGrupoAreaMedicapthisGrupoAsignacion</code> inbound argument id. */
    public static final String ARG_ID_INSGRUPOAREAMEDICA_GRUPOASIGNACIONINSGRUPOAREAMEDICAPTHISGRUPOASIGNACION = "Clas_1586850168832947Ser_9Arg_1_Alias";
    /** <code>grupoAsignacionInsGrupoAreaMedicapthisGrupoAsignacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSGRUPOAREAMEDICA_GRUPOASIGNACIONINSGRUPOAREAMEDICAPTHISGRUPOASIGNACION = "Grupo Área Médica";
    /** <code>grupoAsignacionInsGrupoAreaMedicapevcDominio</code> inbound argument name. */
    public static final String ARG_NAME_INSGRUPOAREAMEDICA_GRUPOASIGNACIONINSGRUPOAREAMEDICAPEVCDOMINIO = "p_evcDominio";
    /** <code>grupoAsignacionInsGrupoAreaMedicapevcDominio</code> inbound argument id. */
    public static final String ARG_ID_INSGRUPOAREAMEDICA_GRUPOASIGNACIONINSGRUPOAREAMEDICAPEVCDOMINIO = "Clas_1586850168832947Ser_9Arg_2_Alias";
    /** <code>grupoAsignacionInsGrupoAreaMedicapevcDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSGRUPOAREAMEDICA_GRUPOASIGNACIONINSGRUPOAREAMEDICAPEVCDOMINIO = "Dominios Area Medica";
    // Service (DelGrupoAreaMedica)
    /** <code>DelGrupoAreaMedica</code> service id. */
    public static final String SERV_ID_DELGRUPOAREAMEDICA = "Clas_1586850168832947Ser_10_Alias";
    /** <code>DelGrupoAreaMedica</code> service name. */
    public static final String SERV_NAME_DELGRUPOAREAMEDICA = "DelGrupoAreaMedica";
    /** <code>DelGrupoAreaMedica</code> service alias. */
    public static final String SERV_ALIAS_DELGRUPOAREAMEDICA = "DelGrupoAreaMedica";
    /** Agents allowed to execute the service DelGrupoAreaMedica **/
    public static final String DELGRUPOAREAMEDICA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>grupoAsignacionDelGrupoAreaMedicapthisGrupoAsignacion</code> inbound argument name. */
    public static final String ARG_NAME_DELGRUPOAREAMEDICA_GRUPOASIGNACIONDELGRUPOAREAMEDICAPTHISGRUPOASIGNACION = "p_thisGrupoAsignacion";
    /** <code>grupoAsignacionDelGrupoAreaMedicapthisGrupoAsignacion</code> inbound argument id. */
    public static final String ARG_ID_DELGRUPOAREAMEDICA_GRUPOASIGNACIONDELGRUPOAREAMEDICAPTHISGRUPOASIGNACION = "Clas_1586850168832947Ser_10Arg_1_Alias";
    /** <code>grupoAsignacionDelGrupoAreaMedicapthisGrupoAsignacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELGRUPOAREAMEDICA_GRUPOASIGNACIONDELGRUPOAREAMEDICAPTHISGRUPOASIGNACION = "Grupo Área Médica";
    /** <code>grupoAsignacionDelGrupoAreaMedicapevcDominio</code> inbound argument name. */
    public static final String ARG_NAME_DELGRUPOAREAMEDICA_GRUPOASIGNACIONDELGRUPOAREAMEDICAPEVCDOMINIO = "p_evcDominio";
    /** <code>grupoAsignacionDelGrupoAreaMedicapevcDominio</code> inbound argument id. */
    public static final String ARG_ID_DELGRUPOAREAMEDICA_GRUPOASIGNACIONDELGRUPOAREAMEDICAPEVCDOMINIO = "Clas_1586850168832947Ser_10Arg_2_Alias";
    /** <code>grupoAsignacionDelGrupoAreaMedicapevcDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELGRUPOAREAMEDICA_GRUPOASIGNACIONDELGRUPOAREAMEDICAPEVCDOMINIO = "Dominios Area Medica";
    // Service (InsGrupoUsuarios)
    /** <code>InsGrupoUsuarios</code> service id. */
    public static final String SERV_ID_INSGRUPOUSUARIOS = "Clas_1586850168832947Ser_11_Alias";
    /** <code>InsGrupoUsuarios</code> service name. */
    public static final String SERV_NAME_INSGRUPOUSUARIOS = "InsGrupoUsuarios";
    /** <code>InsGrupoUsuarios</code> service alias. */
    public static final String SERV_ALIAS_INSGRUPOUSUARIOS = "InsGrupoUsuarios";
    /** Agents allowed to execute the service InsGrupoUsuarios **/
    public static final String INSGRUPOUSUARIOS_SRVAGENTS = "";
    // Inbound arguments
    /** <code>grupoAsignacionInsGrupoUsuariospthisGrupoAsignacion</code> inbound argument name. */
    public static final String ARG_NAME_INSGRUPOUSUARIOS_GRUPOASIGNACIONINSGRUPOUSUARIOSPTHISGRUPOASIGNACION = "p_thisGrupoAsignacion";
    /** <code>grupoAsignacionInsGrupoUsuariospthisGrupoAsignacion</code> inbound argument id. */
    public static final String ARG_ID_INSGRUPOUSUARIOS_GRUPOASIGNACIONINSGRUPOUSUARIOSPTHISGRUPOASIGNACION = "Clas_1586850168832947Ser_11Arg_1_Alias";
    /** <code>grupoAsignacionInsGrupoUsuariospthisGrupoAsignacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSGRUPOUSUARIOS_GRUPOASIGNACIONINSGRUPOUSUARIOSPTHISGRUPOASIGNACION = "Grupo Usuarios";
    /** <code>grupoAsignacionInsGrupoUsuariospevcGrupoAsignacionNovedad</code> inbound argument name. */
    public static final String ARG_NAME_INSGRUPOUSUARIOS_GRUPOASIGNACIONINSGRUPOUSUARIOSPEVCGRUPOASIGNACIONNOVEDAD = "p_evcGrupoAsignacionNovedad";
    /** <code>grupoAsignacionInsGrupoUsuariospevcGrupoAsignacionNovedad</code> inbound argument id. */
    public static final String ARG_ID_INSGRUPOUSUARIOS_GRUPOASIGNACIONINSGRUPOUSUARIOSPEVCGRUPOASIGNACIONNOVEDAD = "Clas_1586850168832947Ser_11Arg_2_Alias";
    /** <code>grupoAsignacionInsGrupoUsuariospevcGrupoAsignacionNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSGRUPOUSUARIOS_GRUPOASIGNACIONINSGRUPOUSUARIOSPEVCGRUPOASIGNACIONNOVEDAD = "DominioCausalUsuario";
    // Service (DelGrupoUsuarios)
    /** <code>DelGrupoUsuarios</code> service id. */
    public static final String SERV_ID_DELGRUPOUSUARIOS = "Clas_1586850168832947Ser_12_Alias";
    /** <code>DelGrupoUsuarios</code> service name. */
    public static final String SERV_NAME_DELGRUPOUSUARIOS = "DelGrupoUsuarios";
    /** <code>DelGrupoUsuarios</code> service alias. */
    public static final String SERV_ALIAS_DELGRUPOUSUARIOS = "DelGrupoUsuarios";
    /** Agents allowed to execute the service DelGrupoUsuarios **/
    public static final String DELGRUPOUSUARIOS_SRVAGENTS = "";
    // Inbound arguments
    /** <code>grupoAsignacionDelGrupoUsuariospthisGrupoAsignacion</code> inbound argument name. */
    public static final String ARG_NAME_DELGRUPOUSUARIOS_GRUPOASIGNACIONDELGRUPOUSUARIOSPTHISGRUPOASIGNACION = "p_thisGrupoAsignacion";
    /** <code>grupoAsignacionDelGrupoUsuariospthisGrupoAsignacion</code> inbound argument id. */
    public static final String ARG_ID_DELGRUPOUSUARIOS_GRUPOASIGNACIONDELGRUPOUSUARIOSPTHISGRUPOASIGNACION = "Clas_1586850168832947Ser_12Arg_1_Alias";
    /** <code>grupoAsignacionDelGrupoUsuariospthisGrupoAsignacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELGRUPOUSUARIOS_GRUPOASIGNACIONDELGRUPOUSUARIOSPTHISGRUPOASIGNACION = "Grupo Usuarios";
    /** <code>grupoAsignacionDelGrupoUsuariospevcGrupoAsignacionNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DELGRUPOUSUARIOS_GRUPOASIGNACIONDELGRUPOUSUARIOSPEVCGRUPOASIGNACIONNOVEDAD = "p_evcGrupoAsignacionNovedad";
    /** <code>grupoAsignacionDelGrupoUsuariospevcGrupoAsignacionNovedad</code> inbound argument id. */
    public static final String ARG_ID_DELGRUPOUSUARIOS_GRUPOASIGNACIONDELGRUPOUSUARIOSPEVCGRUPOASIGNACIONNOVEDAD = "Clas_1586850168832947Ser_12Arg_2_Alias";
    /** <code>grupoAsignacionDelGrupoUsuariospevcGrupoAsignacionNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELGRUPOUSUARIOS_GRUPOASIGNACIONDELGRUPOUSUARIOSPEVCGRUPOASIGNACIONNOVEDAD = "DominioCausalUsuario";
    // Service (TELIMINAR)
    /** <code>TELIMINAR</code> service id. */
    public static final String SERV_ID_TELIMINAR = "Clas_1586850168832947Ser_6_Alias";
    /** <code>TELIMINAR</code> service name. */
    public static final String SERV_NAME_TELIMINAR = "TELIMINAR";
    /** <code>TELIMINAR</code> service alias. */
    public static final String SERV_ALIAS_TELIMINAR = "Eliminar";
    /** Agents allowed to execute the service TELIMINAR **/
    public static final String TELIMINAR_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>TELIMINAR</code> precondition 0 id. */
    public static final String PRE_ID_TELIMINAR_0 = "Clas_1586850168832947Pre_1_MsgError";
    // Inbound arguments
    /** <code>grupoAsignacionTELIMINARpthisGrupoAsignacion</code> inbound argument name. */
    public static final String ARG_NAME_TELIMINAR_GRUPOASIGNACIONTELIMINARPTHISGRUPOASIGNACION = "p_thisGrupoAsignacion";
    /** <code>grupoAsignacionTELIMINARpthisGrupoAsignacion</code> inbound argument id. */
    public static final String ARG_ID_TELIMINAR_GRUPOASIGNACIONTELIMINARPTHISGRUPOASIGNACION = "Clas_1586850168832947Ser_6Arg_1_Alias";
    /** <code>grupoAsignacionTELIMINARpthisGrupoAsignacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TELIMINAR_GRUPOASIGNACIONTELIMINARPTHISGRUPOASIGNACION = "Grupo de Asignación";
    // Service (TCREAR)
    /** <code>TCREAR</code> service id. */
    public static final String SERV_ID_TCREAR = "Clas_1586850168832947Ser_15_Alias";
    /** <code>TCREAR</code> service name. */
    public static final String SERV_NAME_TCREAR = "TCREAR";
    /** <code>TCREAR</code> service alias. */
    public static final String SERV_ALIAS_TCREAR = "Crear";
    /** Agents allowed to execute the service TCREAR **/
    public static final String TCREAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>grupoAsignacionTCREARptpatrTipo</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_GRUPOASIGNACIONTCREARPTPATRTIPO = "pt_p_atrTipo";
    /** <code>grupoAsignacionTCREARptpatrTipo</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_GRUPOASIGNACIONTCREARPTPATRTIPO = "Clas_1586850168832947Ser_15Arg_4_Alias";
    /** <code>grupoAsignacionTCREARptpatrTipo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_GRUPOASIGNACIONTCREARPTPATRTIPO = "Tipo";
    /** <code>grupoAsignacionTCREARptpatrNombre</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_GRUPOASIGNACIONTCREARPTPATRNOMBRE = "pt_p_atrNombre";
    /** <code>grupoAsignacionTCREARptpatrNombre</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_GRUPOASIGNACIONTCREARPTPATRNOMBRE = "Clas_1586850168832947Ser_15Arg_5_Alias";
    /** <code>grupoAsignacionTCREARptpatrNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_GRUPOASIGNACIONTCREARPTPATRNOMBRE = "Nombre";
    /** <code>grupoAsignacionTCREARptpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_GRUPOASIGNACIONTCREARPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    /** <code>grupoAsignacionTCREARptpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_GRUPOASIGNACIONTCREARPTPATRDESCRIPCION = "Clas_1586850168832947Ser_15Arg_6_Alias";
    /** <code>grupoAsignacionTCREARptpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_GRUPOASIGNACIONTCREARPTPATRDESCRIPCION = "Descripción";
    // Service (TMODIFICAR)
    /** <code>TMODIFICAR</code> service id. */
    public static final String SERV_ID_TMODIFICAR = "Clas_1586850168832947Ser_16_Alias";
    /** <code>TMODIFICAR</code> service name. */
    public static final String SERV_NAME_TMODIFICAR = "TMODIFICAR";
    /** <code>TMODIFICAR</code> service alias. */
    public static final String SERV_ALIAS_TMODIFICAR = "Modificar";
    /** Agents allowed to execute the service TMODIFICAR **/
    public static final String TMODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>grupoAsignacionTMODIFICARpthisGrupoAsignacion</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_GRUPOASIGNACIONTMODIFICARPTHISGRUPOASIGNACION = "p_thisGrupoAsignacion";
    /** <code>grupoAsignacionTMODIFICARpthisGrupoAsignacion</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_GRUPOASIGNACIONTMODIFICARPTHISGRUPOASIGNACION = "Clas_1586850168832947Ser_16Arg_1_Alias";
    /** <code>grupoAsignacionTMODIFICARpthisGrupoAsignacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_GRUPOASIGNACIONTMODIFICARPTHISGRUPOASIGNACION = "Grupo de Asignación";
    /** <code>grupoAsignacionTMODIFICARptpNombre</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_GRUPOASIGNACIONTMODIFICARPTPNOMBRE = "pt_p_Nombre";
    /** <code>grupoAsignacionTMODIFICARptpNombre</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_GRUPOASIGNACIONTMODIFICARPTPNOMBRE = "Clas_1586850168832947Ser_16Arg_2_Alias";
    /** <code>grupoAsignacionTMODIFICARptpNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_GRUPOASIGNACIONTMODIFICARPTPNOMBRE = "Nombre";
    /** <code>grupoAsignacionTMODIFICARptpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_GRUPOASIGNACIONTMODIFICARPTPDESCRIPCION = "pt_p_Descripcion";
    /** <code>grupoAsignacionTMODIFICARptpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_GRUPOASIGNACIONTMODIFICARPTPDESCRIPCION = "Clas_1586850168832947Ser_16Arg_3_Alias";
    /** <code>grupoAsignacionTMODIFICARptpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_GRUPOASIGNACIONTMODIFICARPTPDESCRIPCION = "Descripción";
    // Service (TADDUSUARIO)
    /** <code>TADDUSUARIO</code> service id. */
    public static final String SERV_ID_TADDUSUARIO = "Clas_1586850168832947Ser_17_Alias";
    /** <code>TADDUSUARIO</code> service name. */
    public static final String SERV_NAME_TADDUSUARIO = "TADDUSUARIO";
    /** <code>TADDUSUARIO</code> service alias. */
    public static final String SERV_ALIAS_TADDUSUARIO = "Agregar Usuario";
    /** Agents allowed to execute the service TADDUSUARIO **/
    public static final String TADDUSUARIO_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>TADDUSUARIO</code> precondition 0 id. */
    public static final String PRE_ID_TADDUSUARIO_0 = "Clas_1586850168832947Pre_2_MsgError";
    // Inbound arguments
    /** <code>grupoAsignacionTADDUSUARIOpthisGrupoAsignacion</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIO_GRUPOASIGNACIONTADDUSUARIOPTHISGRUPOASIGNACION = "p_thisGrupoAsignacion";
    /** <code>grupoAsignacionTADDUSUARIOpthisGrupoAsignacion</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIO_GRUPOASIGNACIONTADDUSUARIOPTHISGRUPOASIGNACION = "Clas_1586850168832947Ser_17Arg_1_Alias";
    /** <code>grupoAsignacionTADDUSUARIOpthisGrupoAsignacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIO_GRUPOASIGNACIONTADDUSUARIOPTHISGRUPOASIGNACION = "Grupo de Asignación";
    /** <code>grupoAsignacionTADDUSUARIOptFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIO_GRUPOASIGNACIONTADDUSUARIOPTFUNCIONARIO = "ptFuncionario";
    /** <code>grupoAsignacionTADDUSUARIOptFuncionario</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIO_GRUPOASIGNACIONTADDUSUARIOPTFUNCIONARIO = "Clas_1586850168832947Ser_17Arg_2_Alias";
    /** <code>grupoAsignacionTADDUSUARIOptFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIO_GRUPOASIGNACIONTADDUSUARIOPTFUNCIONARIO = "Asesor Integral / Afiliaciones";
    /** <code>grupoAsignacionTADDUSUARIOptAreaMedica</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIO_GRUPOASIGNACIONTADDUSUARIOPTAREAMEDICA = "ptAreaMedica";
    /** <code>grupoAsignacionTADDUSUARIOptAreaMedica</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIO_GRUPOASIGNACIONTADDUSUARIOPTAREAMEDICA = "Clas_1586850168832947Ser_17Arg_3_Alias";
    /** <code>grupoAsignacionTADDUSUARIOptAreaMedica</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIO_GRUPOASIGNACIONTADDUSUARIOPTAREAMEDICA = "Área Médica";
    // Service (TDELUSUARIO)
    /** <code>TDELUSUARIO</code> service id. */
    public static final String SERV_ID_TDELUSUARIO = "Clas_1586850168832947Ser_18_Alias";
    /** <code>TDELUSUARIO</code> service name. */
    public static final String SERV_NAME_TDELUSUARIO = "TDELUSUARIO";
    /** <code>TDELUSUARIO</code> service alias. */
    public static final String SERV_ALIAS_TDELUSUARIO = "Eliminar Usuario";
    /** Agents allowed to execute the service TDELUSUARIO **/
    public static final String TDELUSUARIO_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>grupoAsignacionTDELUSUARIOpthisGrupoAsignacion</code> inbound argument name. */
    public static final String ARG_NAME_TDELUSUARIO_GRUPOASIGNACIONTDELUSUARIOPTHISGRUPOASIGNACION = "p_thisGrupoAsignacion";
    /** <code>grupoAsignacionTDELUSUARIOpthisGrupoAsignacion</code> inbound argument id. */
    public static final String ARG_ID_TDELUSUARIO_GRUPOASIGNACIONTDELUSUARIOPTHISGRUPOASIGNACION = "Clas_1586850168832947Ser_18Arg_1_Alias";
    /** <code>grupoAsignacionTDELUSUARIOpthisGrupoAsignacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TDELUSUARIO_GRUPOASIGNACIONTDELUSUARIOPTHISGRUPOASIGNACION = "Grupo de Asignación";
    /** <code>grupoAsignacionTDELUSUARIOptFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_TDELUSUARIO_GRUPOASIGNACIONTDELUSUARIOPTFUNCIONARIO = "ptFuncionario";
    /** <code>grupoAsignacionTDELUSUARIOptFuncionario</code> inbound argument id. */
    public static final String ARG_ID_TDELUSUARIO_GRUPOASIGNACIONTDELUSUARIOPTFUNCIONARIO = "Clas_1586850168832947Ser_18Arg_2_Alias";
    /** <code>grupoAsignacionTDELUSUARIOptFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TDELUSUARIO_GRUPOASIGNACIONTDELUSUARIOPTFUNCIONARIO = "Usuario";

    public static final String FILTER_NAME_FGRUPOASIGNACIONPORTIPO = "F_GrupoAsignacionPorTipo";
    public static final String VAR_NAME_FGRUPOASIGNACIONPORTIPO_VFTIPO = "vfTipo";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_GRUPOASIGNACIONTIPO.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_GRUPOASIGNACIONNOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_GRUPOASIGNACIONDESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_GRUPOASIGNACIONID.toUpperCase(), GRUPOASIGNACIONID_AGENTS);
    	attributeAgents.put(ATTR_NAME_GRUPOASIGNACIONTIPO.toUpperCase(), GRUPOASIGNACIONTIPO_AGENTS);
    	attributeAgents.put(ATTR_NAME_GRUPOASIGNACIONNOMBRE.toUpperCase(), GRUPOASIGNACIONNOMBRE_AGENTS);
    	attributeAgents.put(ATTR_NAME_GRUPOASIGNACIONDESCRIPCION.toUpperCase(), GRUPOASIGNACIONDESCRIPCION_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'GrupoAsignacion', it returns the identification keys
     * - If className is a facet of the inheritance net of 'GrupoAsignacion', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_GRUPOASIGNACIONID);
        }
        // Facet 'GrupoAsignacion' (This facet)
        if (GrupoAsignacionConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_GRUPOASIGNACIONID);
        }
        return returnList;
    }
}
