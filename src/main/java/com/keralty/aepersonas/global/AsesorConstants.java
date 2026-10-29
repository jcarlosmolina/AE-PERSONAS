package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>Asesor</code> model class.
 */
public final class AsesorConstants {

    private AsesorConstants() {

    }

    // Class
    /** <code>Asesor</code> class id. */
    public static final String CLASS_ID = "Clas_1431886233600794_Alias";
    /** <code>Asesor</code> class name. */
    public static final String CLASS_NAME = "Asesor";
    /** <code>Asesor</code> class alias. */
    public static final String CLASS_ALIAS = "Asesor";
    /** <code>Asesor</code> class table name. */
    public static final String TBL_NAME = "Asesor";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "funcionarioId,tipoIdentificacionCodigo,passWord,asesorModDBasicosPersona,asesormodificaDirector,asesoresDirector,asesorNumIdentificacion,asesorEsIntegral,asesorVerDBasicosPersona,asesorVerDocIdentificacionPersona,asesorVerContratoNovedad,asesorCanalComercial,asesorCargo,asesorEstado,asesorAccesoValidadorUsuarios";

    public static final String DSICASESOR = "IC_Asesor";
    public static final String DSDSASESORPIU = "DS_Asesor_PIU";
    public static final String DSDSASESORIIU = "DS_Asesor_IIU";
    public static final String DSDSASESORPIUMAESTROPRODUCTOS = "DS_AsesorPIUMaestroProductos";
    public static final String DSDSASESORNULL = "DS_Asesor_Null";
    public static final String DSDSASESORMDIRECTORES = "DS_Asesor_M_Directores";
    public static final String DSDSDIRECTORESOBS = "DS_Directores_Obs";
    
    // Facet (Funcionario)
    /** <code>Funcionario</code> facet sequence. */
    public static final String CLASS_FACETS_FUNCIONARIO = FuncionarioConstants.CLASS_NAME;
	
    public static final String CLASS_FACET_GETTER_FUNCIONARIO = Constants.PARENT_PREFIX + FuncionarioConstants.CLASS_NAME;
    // Facet (Admin)
    /** <code>Admin</code> facet sequence. */
    public static final String CLASS_FACETS_ADMIN = FuncionarioConstants.CLASS_NAME + "." + AdminConstants.CLASS_NAME;
	
    public static final String CLASS_FACET_GETTER_ADMIN = CLASS_FACET_GETTER_FUNCIONARIO + "." + FuncionarioConstants.CLASS_FACET_GETTER_ADMIN;
    // Facet (SuperAdmin)
    /** <code>SuperAdmin</code> facet sequence. */
    public static final String CLASS_FACETS_SUPERADMIN = FuncionarioConstants.CLASS_NAME + "." + SuperAdminConstants.CLASS_NAME;
	
    public static final String CLASS_FACET_GETTER_SUPERADMIN = CLASS_FACET_GETTER_FUNCIONARIO + "." + FuncionarioConstants.CLASS_FACET_GETTER_SUPERADMIN;
    // Facet (AreaMedica)
    /** <code>AreaMedica</code> facet sequence. */
    public static final String CLASS_FACETS_AREAMEDICA = FuncionarioConstants.CLASS_NAME + "." + AreaMedicaConstants.CLASS_NAME;
	
    public static final String CLASS_FACET_GETTER_AREAMEDICA = CLASS_FACET_GETTER_FUNCIONARIO + "." + FuncionarioConstants.CLASS_FACET_GETTER_AREAMEDICA;
    // Facet (Afiliaciones)
    /** <code>Afiliaciones</code> facet sequence. */
    public static final String CLASS_FACETS_AFILIACIONES = FuncionarioConstants.CLASS_NAME + "." + AfiliacionesConstants.CLASS_NAME;
	
    public static final String CLASS_FACET_GETTER_AFILIACIONES = CLASS_FACET_GETTER_FUNCIONARIO + "." + FuncionarioConstants.CLASS_FACET_GETTER_AFILIACIONES;
    // Facet (RespRegional)
    /** <code>RespRegional</code> facet sequence. */
    public static final String CLASS_FACETS_RESPREGIONAL = FuncionarioConstants.CLASS_NAME + "." + RespRegionalConstants.CLASS_NAME;
	
    public static final String CLASS_FACET_GETTER_RESPREGIONAL = CLASS_FACET_GETTER_FUNCIONARIO + "." + FuncionarioConstants.CLASS_FACET_GETTER_RESPREGIONAL;
    // Facet (Gestor)
    /** <code>Gestor</code> facet sequence. */
    public static final String CLASS_FACETS_GESTOR = FuncionarioConstants.CLASS_NAME + "." + GestorConstants.CLASS_NAME;
	
    public static final String CLASS_FACET_GETTER_GESTOR = CLASS_FACET_GETTER_FUNCIONARIO + "." + FuncionarioConstants.CLASS_FACET_GETTER_GESTOR;
    // Facet (MesaDeApoyo)
    /** <code>MesaDeApoyo</code> facet sequence. */
    public static final String CLASS_FACETS_MESADEAPOYO = FuncionarioConstants.CLASS_NAME + "." + MesaDeApoyoConstants.CLASS_NAME;
	
    public static final String CLASS_FACET_GETTER_MESADEAPOYO = CLASS_FACET_GETTER_FUNCIONARIO + "." + FuncionarioConstants.CLASS_FACET_GETTER_MESADEAPOYO;

    // Attribute (asesorModDBasicosPersona)
    /** <code>asesorModDBasicosPersona</code> attribute id. */
    public static final String ATTR_ID_ASESORMODDBASICOSPERSONA = "Clas_1431886233600794Atr_9_Alias";
    /** <code>asesorModDBasicosPersona</code> attribute name. */
    public static final String ATTR_NAME_ASESORMODDBASICOSPERSONA = "asesorModDBasicosPersona";
    /** <code>asesorModDBasicosPersona</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORMODDBASICOSPERSONA = "Puede modificar persona";

    /** <code>asesorModDBasicosPersona</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORMODDBASICOSPERSONA = "";
    /** Agents allowed to view the attribute asesorModDBasicosPersona **/
    public static final String ASESORMODDBASICOSPERSONA_AGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Attribute (asesormodificaDirector)
    /** <code>asesormodificaDirector</code> attribute id. */
    public static final String ATTR_ID_ASESORMODIFICADIRECTOR = "Clas_1431886233600794Atr_10_Alias";
    /** <code>asesormodificaDirector</code> attribute name. */
    public static final String ATTR_NAME_ASESORMODIFICADIRECTOR = "asesormodificaDirector";
    /** <code>asesormodificaDirector</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORMODIFICADIRECTOR = "Modifica director?";

    /** <code>asesormodificaDirector</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORMODIFICADIRECTOR = "";
    /** Agents allowed to view the attribute asesormodificaDirector **/
    public static final String ASESORMODIFICADIRECTOR_AGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Attribute (asesoresDirector)
    /** <code>asesoresDirector</code> attribute id. */
    public static final String ATTR_ID_ASESORESDIRECTOR = "Clas_1431886233600794Atr_11_Alias";
    /** <code>asesoresDirector</code> attribute name. */
    public static final String ATTR_NAME_ASESORESDIRECTOR = "asesoresDirector";
    /** <code>asesoresDirector</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORESDIRECTOR = "Es director?";

    /** <code>asesoresDirector</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORESDIRECTOR = "";
    /** Agents allowed to view the attribute asesoresDirector **/
    public static final String ASESORESDIRECTOR_AGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Attribute (asesorNumIdentificacion)
    /** <code>asesorNumIdentificacion</code> attribute id. */
    public static final String ATTR_ID_ASESORNUMIDENTIFICACION = "Clas_1431886233600794Atr_12_Alias";
    /** <code>asesorNumIdentificacion</code> attribute name. */
    public static final String ATTR_NAME_ASESORNUMIDENTIFICACION = "asesorNumIdentificacion";
    /** <code>asesorNumIdentificacion</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORNUMIDENTIFICACION = "Nº Identificación";

    /** <code>asesorNumIdentificacion</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORNUMIDENTIFICACION = "";
    /** Agents allowed to view the attribute asesorNumIdentificacion **/
    public static final String ASESORNUMIDENTIFICACION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (asesorEsIntegral)
    /** <code>asesorEsIntegral</code> attribute id. */
    public static final String ATTR_ID_ASESORESINTEGRAL = "Clas_1431886233600794Atr_13_Alias";
    /** <code>asesorEsIntegral</code> attribute name. */
    public static final String ATTR_NAME_ASESORESINTEGRAL = "asesorEsIntegral";
    /** <code>asesorEsIntegral</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORESINTEGRAL = "Asesor Integral";

    /** <code>asesorEsIntegral</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORESINTEGRAL = "";
    /** Agents allowed to view the attribute asesorEsIntegral **/
    public static final String ASESORESINTEGRAL_AGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Attribute (asesorVerDBasicosPersona)
    /** <code>asesorVerDBasicosPersona</code> attribute id. */
    public static final String ATTR_ID_ASESORVERDBASICOSPERSONA = "Clas_1431886233600794Atr_14_Alias";
    /** <code>asesorVerDBasicosPersona</code> attribute name. */
    public static final String ATTR_NAME_ASESORVERDBASICOSPERSONA = "asesorVerDBasicosPersona";
    /** <code>asesorVerDBasicosPersona</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORVERDBASICOSPERSONA = "Ver datos básicos de usuarios";

    /** <code>asesorVerDBasicosPersona</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORVERDBASICOSPERSONA = "";
    /** Agents allowed to view the attribute asesorVerDBasicosPersona **/
    public static final String ASESORVERDBASICOSPERSONA_AGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Attribute (asesorVerDocIdentificacionPersona)
    /** <code>asesorVerDocIdentificacionPersona</code> attribute id. */
    public static final String ATTR_ID_ASESORVERDOCIDENTIFICACIONPERSONA = "Clas_1431886233600794Atr_15_Alias";
    /** <code>asesorVerDocIdentificacionPersona</code> attribute name. */
    public static final String ATTR_NAME_ASESORVERDOCIDENTIFICACIONPERSONA = "asesorVerDocIdentificacionPersona";
    /** <code>asesorVerDocIdentificacionPersona</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORVERDOCIDENTIFICACIONPERSONA = "Ver documentos persona";

    /** <code>asesorVerDocIdentificacionPersona</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORVERDOCIDENTIFICACIONPERSONA = "";
    /** Agents allowed to view the attribute asesorVerDocIdentificacionPersona **/
    public static final String ASESORVERDOCIDENTIFICACIONPERSONA_AGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Attribute (asesorVerContratoNovedad)
    /** <code>asesorVerContratoNovedad</code> attribute id. */
    public static final String ATTR_ID_ASESORVERCONTRATONOVEDAD = "Clas_1431886233600794Atr_16_Alias";
    /** <code>asesorVerContratoNovedad</code> attribute name. */
    public static final String ATTR_NAME_ASESORVERCONTRATONOVEDAD = "asesorVerContratoNovedad";
    /** <code>asesorVerContratoNovedad</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORVERCONTRATONOVEDAD = "Ver contrato en Novedades";

    /** <code>asesorVerContratoNovedad</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORVERCONTRATONOVEDAD = "";
    /** Agents allowed to view the attribute asesorVerContratoNovedad **/
    public static final String ASESORVERCONTRATONOVEDAD_AGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Attribute (asesorCanalComercial)
    /** <code>asesorCanalComercial</code> attribute id. */
    public static final String ATTR_ID_ASESORCANALCOMERCIAL = "Clas_1431886233600794Atr_17_Alias";
    /** <code>asesorCanalComercial</code> attribute name. */
    public static final String ATTR_NAME_ASESORCANALCOMERCIAL = "asesorCanalComercial";
    /** <code>asesorCanalComercial</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORCANALCOMERCIAL = "Canal Comercial";

    /** <code>asesorCanalComercial</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORCANALCOMERCIAL = "";
    /** Agents allowed to view the attribute asesorCanalComercial **/
    public static final String ASESORCANALCOMERCIAL_AGENTS = "Admin,SuperAdmin";
    // Attribute (asesorCargo)
    /** <code>asesorCargo</code> attribute id. */
    public static final String ATTR_ID_ASESORCARGO = "Clas_1431886233600794Atr_18_Alias";
    /** <code>asesorCargo</code> attribute name. */
    public static final String ATTR_NAME_ASESORCARGO = "asesorCargo";
    /** <code>asesorCargo</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORCARGO = "Tipo Agente";

    /** <code>asesorCargo</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORCARGO = "";
    /** Agents allowed to view the attribute asesorCargo **/
    public static final String ASESORCARGO_AGENTS = "Admin,SuperAdmin";
    // Attribute (asesorEstado)
    /** <code>asesorEstado</code> attribute id. */
    public static final String ATTR_ID_ASESORESTADO = "Clas_1431886233600794Atr_19_Alias";
    /** <code>asesorEstado</code> attribute name. */
    public static final String ATTR_NAME_ASESORESTADO = "asesorEstado";
    /** <code>asesorEstado</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORESTADO = "Estado";

    /** <code>asesorEstado</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORESTADO = "";
    /** Agents allowed to view the attribute asesorEstado **/
    public static final String ASESORESTADO_AGENTS = "Admin,SuperAdmin";
    // Attribute (asesorAccesoValidadorUsuarios)
    /** <code>asesorAccesoValidadorUsuarios</code> attribute id. */
    public static final String ATTR_ID_ASESORACCESOVALIDADORUSUARIOS = "Clas_1431886233600794Atr_20_Alias";
    /** <code>asesorAccesoValidadorUsuarios</code> attribute name. */
    public static final String ATTR_NAME_ASESORACCESOVALIDADORUSUARIOS = "asesorAccesoValidadorUsuarios";
    /** <code>asesorAccesoValidadorUsuarios</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORACCESOVALIDADORUSUARIOS = "Acceso validador usuarios";

    /** <code>asesorAccesoValidadorUsuarios</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORACCESOVALIDADORUSUARIOS = "";
    /** Agents allowed to view the attribute asesorAccesoValidadorUsuarios **/
    public static final String ASESORACCESOVALIDADORUSUARIOS_AGENTS = "Admin,SuperAdmin,Asesor";
    // Attribute (funcionarioId)
    /** <code>funcionarioId</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIOID = FuncionarioConstants.ATTR_ID_FUNCIONARIOID;
    /** <code>funcionarioId</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIOID = FuncionarioConstants.ATTR_NAME_FUNCIONARIOID;
    /** <code>funcionarioId</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIOID = FuncionarioConstants.ATTR_ALIAS_FUNCIONARIOID;

    /** <code>funcionarioId</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIOID = FuncionarioConstants.CLASS_NAME;
    // Attribute (funcionarioManual)
    /** <code>funcionarioManual</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIOMANUAL = FuncionarioConstants.ATTR_ID_FUNCIONARIOMANUAL;
    /** <code>funcionarioManual</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIOMANUAL = FuncionarioConstants.ATTR_NAME_FUNCIONARIOMANUAL;
    /** <code>funcionarioManual</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIOMANUAL = FuncionarioConstants.ATTR_ALIAS_FUNCIONARIOMANUAL;

    /** <code>funcionarioManual</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIOMANUAL = FuncionarioConstants.CLASS_NAME;
    // Attribute (funcionarioUsuario)
    /** <code>funcionarioUsuario</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIOUSUARIO = FuncionarioConstants.ATTR_ID_FUNCIONARIOUSUARIO;
    /** <code>funcionarioUsuario</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIOUSUARIO = FuncionarioConstants.ATTR_NAME_FUNCIONARIOUSUARIO;
    /** <code>funcionarioUsuario</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIOUSUARIO = FuncionarioConstants.ATTR_ALIAS_FUNCIONARIOUSUARIO;

    /** <code>funcionarioUsuario</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIOUSUARIO = FuncionarioConstants.CLASS_NAME;
    // Attribute (funcionarioPrimerNombre)
    /** <code>funcionarioPrimerNombre</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIOPRIMERNOMBRE = FuncionarioConstants.ATTR_ID_FUNCIONARIOPRIMERNOMBRE;
    /** <code>funcionarioPrimerNombre</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIOPRIMERNOMBRE = FuncionarioConstants.ATTR_NAME_FUNCIONARIOPRIMERNOMBRE;
    /** <code>funcionarioPrimerNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIOPRIMERNOMBRE = FuncionarioConstants.ATTR_ALIAS_FUNCIONARIOPRIMERNOMBRE;

    /** <code>funcionarioPrimerNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIOPRIMERNOMBRE = FuncionarioConstants.CLASS_NAME;
    // Attribute (funcionarioSegundoNombre)
    /** <code>funcionarioSegundoNombre</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIOSEGUNDONOMBRE = FuncionarioConstants.ATTR_ID_FUNCIONARIOSEGUNDONOMBRE;
    /** <code>funcionarioSegundoNombre</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIOSEGUNDONOMBRE = FuncionarioConstants.ATTR_NAME_FUNCIONARIOSEGUNDONOMBRE;
    /** <code>funcionarioSegundoNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIOSEGUNDONOMBRE = FuncionarioConstants.ATTR_ALIAS_FUNCIONARIOSEGUNDONOMBRE;

    /** <code>funcionarioSegundoNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIOSEGUNDONOMBRE = FuncionarioConstants.CLASS_NAME;
    // Attribute (funcionarioPrimerApellido)
    /** <code>funcionarioPrimerApellido</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIOPRIMERAPELLIDO = FuncionarioConstants.ATTR_ID_FUNCIONARIOPRIMERAPELLIDO;
    /** <code>funcionarioPrimerApellido</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIOPRIMERAPELLIDO = FuncionarioConstants.ATTR_NAME_FUNCIONARIOPRIMERAPELLIDO;
    /** <code>funcionarioPrimerApellido</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIOPRIMERAPELLIDO = FuncionarioConstants.ATTR_ALIAS_FUNCIONARIOPRIMERAPELLIDO;

    /** <code>funcionarioPrimerApellido</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIOPRIMERAPELLIDO = FuncionarioConstants.CLASS_NAME;
    // Attribute (funcionarioSegundoApellido)
    /** <code>funcionarioSegundoApellido</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIOSEGUNDOAPELLIDO = FuncionarioConstants.ATTR_ID_FUNCIONARIOSEGUNDOAPELLIDO;
    /** <code>funcionarioSegundoApellido</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIOSEGUNDOAPELLIDO = FuncionarioConstants.ATTR_NAME_FUNCIONARIOSEGUNDOAPELLIDO;
    /** <code>funcionarioSegundoApellido</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIOSEGUNDOAPELLIDO = FuncionarioConstants.ATTR_ALIAS_FUNCIONARIOSEGUNDOAPELLIDO;

    /** <code>funcionarioSegundoApellido</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIOSEGUNDOAPELLIDO = FuncionarioConstants.CLASS_NAME;
    // Attribute (funcionariodrvNombreCompleto)
    /** <code>funcionariodrvNombreCompleto</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIODRVNOMBRECOMPLETO = FuncionarioConstants.ATTR_ID_FUNCIONARIODRVNOMBRECOMPLETO;
    /** <code>funcionariodrvNombreCompleto</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIODRVNOMBRECOMPLETO = FuncionarioConstants.ATTR_NAME_FUNCIONARIODRVNOMBRECOMPLETO;
    /** <code>funcionariodrvNombreCompleto</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIODRVNOMBRECOMPLETO = FuncionarioConstants.ATTR_ALIAS_FUNCIONARIODRVNOMBRECOMPLETO;

    /** <code>funcionariodrvNombreCompleto</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIODRVNOMBRECOMPLETO = FuncionarioConstants.CLASS_NAME;
    // Attribute (funcionarioUsuarioLDAP)
    /** <code>funcionarioUsuarioLDAP</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIOUSUARIOLDAP = FuncionarioConstants.ATTR_ID_FUNCIONARIOUSUARIOLDAP;
    /** <code>funcionarioUsuarioLDAP</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIOUSUARIOLDAP = FuncionarioConstants.ATTR_NAME_FUNCIONARIOUSUARIOLDAP;
    /** <code>funcionarioUsuarioLDAP</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIOUSUARIOLDAP = FuncionarioConstants.ATTR_ALIAS_FUNCIONARIOUSUARIOLDAP;

    /** <code>funcionarioUsuarioLDAP</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIOUSUARIOLDAP = FuncionarioConstants.CLASS_NAME;
    // Attribute (funcionarioEmail)
    /** <code>funcionarioEmail</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIOEMAIL = FuncionarioConstants.ATTR_ID_FUNCIONARIOEMAIL;
    /** <code>funcionarioEmail</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIOEMAIL = FuncionarioConstants.ATTR_NAME_FUNCIONARIOEMAIL;
    /** <code>funcionarioEmail</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIOEMAIL = FuncionarioConstants.ATTR_ALIAS_FUNCIONARIOEMAIL;

    /** <code>funcionarioEmail</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIOEMAIL = FuncionarioConstants.CLASS_NAME;
    // Attribute (funcionarioCodJefe)
    /** <code>funcionarioCodJefe</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIOCODJEFE = FuncionarioConstants.ATTR_ID_FUNCIONARIOCODJEFE;
    /** <code>funcionarioCodJefe</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIOCODJEFE = FuncionarioConstants.ATTR_NAME_FUNCIONARIOCODJEFE;
    /** <code>funcionarioCodJefe</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIOCODJEFE = FuncionarioConstants.ATTR_ALIAS_FUNCIONARIOCODJEFE;

    /** <code>funcionarioCodJefe</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIOCODJEFE = FuncionarioConstants.CLASS_NAME;
    // Attribute (funcionariodrvNomJefe)
    /** <code>funcionariodrvNomJefe</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIODRVNOMJEFE = FuncionarioConstants.ATTR_ID_FUNCIONARIODRVNOMJEFE;
    /** <code>funcionariodrvNomJefe</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIODRVNOMJEFE = FuncionarioConstants.ATTR_NAME_FUNCIONARIODRVNOMJEFE;
    /** <code>funcionariodrvNomJefe</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIODRVNOMJEFE = FuncionarioConstants.ATTR_ALIAS_FUNCIONARIODRVNOMJEFE;

    /** <code>funcionariodrvNomJefe</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIODRVNOMJEFE = FuncionarioConstants.CLASS_NAME;
    // Attribute (funcionariodrvNomAgencia)
    /** <code>funcionariodrvNomAgencia</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIODRVNOMAGENCIA = FuncionarioConstants.ATTR_ID_FUNCIONARIODRVNOMAGENCIA;
    /** <code>funcionariodrvNomAgencia</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIODRVNOMAGENCIA = FuncionarioConstants.ATTR_NAME_FUNCIONARIODRVNOMAGENCIA;
    /** <code>funcionariodrvNomAgencia</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIODRVNOMAGENCIA = FuncionarioConstants.ATTR_ALIAS_FUNCIONARIODRVNOMAGENCIA;

    /** <code>funcionariodrvNomAgencia</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIODRVNOMAGENCIA = FuncionarioConstants.CLASS_NAME;
    // Attribute (funcionarioDisponible)
    /** <code>funcionarioDisponible</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIODISPONIBLE = FuncionarioConstants.ATTR_ID_FUNCIONARIODISPONIBLE;
    /** <code>funcionarioDisponible</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIODISPONIBLE = FuncionarioConstants.ATTR_NAME_FUNCIONARIODISPONIBLE;
    /** <code>funcionarioDisponible</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIODISPONIBLE = FuncionarioConstants.ATTR_ALIAS_FUNCIONARIODISPONIBLE;

    /** <code>funcionarioDisponible</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIODISPONIBLE = FuncionarioConstants.CLASS_NAME;
    // Attribute (funcionarioNumSolNoTerminadas)
    /** <code>funcionarioNumSolNoTerminadas</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIONUMSOLNOTERMINADAS = FuncionarioConstants.ATTR_ID_FUNCIONARIONUMSOLNOTERMINADAS;
    /** <code>funcionarioNumSolNoTerminadas</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIONUMSOLNOTERMINADAS = FuncionarioConstants.ATTR_NAME_FUNCIONARIONUMSOLNOTERMINADAS;
    /** <code>funcionarioNumSolNoTerminadas</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIONUMSOLNOTERMINADAS = FuncionarioConstants.ATTR_ALIAS_FUNCIONARIONUMSOLNOTERMINADAS;

    /** <code>funcionarioNumSolNoTerminadas</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIONUMSOLNOTERMINADAS = FuncionarioConstants.CLASS_NAME;
    // Attribute (funcionariodrvEsAsesorIntegral)
    /** <code>funcionariodrvEsAsesorIntegral</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIODRVESASESORINTEGRAL = FuncionarioConstants.ATTR_ID_FUNCIONARIODRVESASESORINTEGRAL;
    /** <code>funcionariodrvEsAsesorIntegral</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIODRVESASESORINTEGRAL = FuncionarioConstants.ATTR_NAME_FUNCIONARIODRVESASESORINTEGRAL;
    /** <code>funcionariodrvEsAsesorIntegral</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIODRVESASESORINTEGRAL = FuncionarioConstants.ATTR_ALIAS_FUNCIONARIODRVESASESORINTEGRAL;

    /** <code>funcionariodrvEsAsesorIntegral</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIODRVESASESORINTEGRAL = FuncionarioConstants.CLASS_NAME;
    // Attribute (funcionariodrvEsAfiliacion)
    /** <code>funcionariodrvEsAfiliacion</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIODRVESAFILIACION = FuncionarioConstants.ATTR_ID_FUNCIONARIODRVESAFILIACION;
    /** <code>funcionariodrvEsAfiliacion</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIODRVESAFILIACION = FuncionarioConstants.ATTR_NAME_FUNCIONARIODRVESAFILIACION;
    /** <code>funcionariodrvEsAfiliacion</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIODRVESAFILIACION = FuncionarioConstants.ATTR_ALIAS_FUNCIONARIODRVESAFILIACION;

    /** <code>funcionariodrvEsAfiliacion</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIODRVESAFILIACION = FuncionarioConstants.CLASS_NAME;
    // Attribute (funcionarioIdSesion)
    /** <code>funcionarioIdSesion</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIOIDSESION = FuncionarioConstants.ATTR_ID_FUNCIONARIOIDSESION;
    /** <code>funcionarioIdSesion</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIOIDSESION = FuncionarioConstants.ATTR_NAME_FUNCIONARIOIDSESION;
    /** <code>funcionarioIdSesion</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIOIDSESION = FuncionarioConstants.ATTR_ALIAS_FUNCIONARIOIDSESION;

    /** <code>funcionarioIdSesion</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIOIDSESION = FuncionarioConstants.CLASS_NAME;


    // Field (Id)
    /** <code>Id</code> field name. */
    public static final String FLD_FUNCIONARIOID = "Id";    
    /** <code>funcionarioId</code> attribute field name. */
    public static final String ATTR_FIELD_FUNCIONARIOID = "funcionarioId";
    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_TIPOIDENTIFICACIONCODIGO = "Codigo";    
    /** <code>TipoIdentificacion.tipoIdentificacionCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_TIPOIDENTIFICACION_TIPOIDENTIFICACIONCODIGO = "tipoIdentificacionCodigo";
    // Field (PassWord)
    /** <code>PassWord</code> field name. */
    public static final String FLD_P4SSW0RD = "PassWord";
    // Field (ModDBasicosPersona)
    /** <code>ModDBasicosPersona</code> field name. */
    public static final String FLD_ASESORMODDBASICOSPERSONA = "ModDBasicosPersona";    
    /** <code>asesorModDBasicosPersona</code> attribute field name. */
    public static final String ATTR_FIELD_ASESORMODDBASICOSPERSONA = "asesorModDBasicosPersona";
    // Field (modificaDirector)
    /** <code>modificaDirector</code> field name. */
    public static final String FLD_ASESORMODIFICADIRECTOR = "modificaDirector";    
    /** <code>asesormodificaDirector</code> attribute field name. */
    public static final String ATTR_FIELD_ASESORMODIFICADIRECTOR = "asesormodificaDirector";
    // Field (esDirector)
    /** <code>esDirector</code> field name. */
    public static final String FLD_ASESORESDIRECTOR = "esDirector";    
    /** <code>asesoresDirector</code> attribute field name. */
    public static final String ATTR_FIELD_ASESORESDIRECTOR = "asesoresDirector";
    // Field (NumIdentificacion)
    /** <code>NumIdentificacion</code> field name. */
    public static final String FLD_ASESORNUMIDENTIFICACION = "NumIdentificacion";    
    /** <code>NumIdentificacion</code> field length. */
    public static final int FLD_ASESORNUMIDENTIFICACIONLENGTH = 60;
    /** <code>asesorNumIdentificacion</code> attribute field name. */
    public static final String ATTR_FIELD_ASESORNUMIDENTIFICACION = "asesorNumIdentificacion";
    // Field (EsIntegral)
    /** <code>EsIntegral</code> field name. */
    public static final String FLD_ASESORESINTEGRAL = "EsIntegral";    
    /** <code>asesorEsIntegral</code> attribute field name. */
    public static final String ATTR_FIELD_ASESORESINTEGRAL = "asesorEsIntegral";
    // Field (VerDBasicosPersona)
    /** <code>VerDBasicosPersona</code> field name. */
    public static final String FLD_ASESORVERDBASICOSPERSONA = "VerDBasicosPersona";    
    /** <code>asesorVerDBasicosPersona</code> attribute field name. */
    public static final String ATTR_FIELD_ASESORVERDBASICOSPERSONA = "asesorVerDBasicosPersona";
    // Field (VerDocIdentificacionPersona)
    /** <code>VerDocIdentificacionPersona</code> field name. */
    public static final String FLD_ASESORVERDOCIDENTIFICACIONPERSONA = "VerDocIdentificacionPersona";    
    /** <code>asesorVerDocIdentificacionPersona</code> attribute field name. */
    public static final String ATTR_FIELD_ASESORVERDOCIDENTIFICACIONPERSONA = "asesorVerDocIdentificacionPersona";
    // Field (VerContratoNovedad)
    /** <code>VerContratoNovedad</code> field name. */
    public static final String FLD_ASESORVERCONTRATONOVEDAD = "VerContratoNovedad";    
    /** <code>asesorVerContratoNovedad</code> attribute field name. */
    public static final String ATTR_FIELD_ASESORVERCONTRATONOVEDAD = "asesorVerContratoNovedad";
    // Field (CanalComercial)
    /** <code>CanalComercial</code> field name. */
    public static final String FLD_ASESORCANALCOMERCIAL = "CanalComercial";    
    /** <code>CanalComercial</code> field length. */
    public static final int FLD_ASESORCANALCOMERCIALLENGTH = 50;
    /** <code>asesorCanalComercial</code> attribute field name. */
    public static final String ATTR_FIELD_ASESORCANALCOMERCIAL = "asesorCanalComercial";
    // Field (Cargo)
    /** <code>Cargo</code> field name. */
    public static final String FLD_ASESORCARGO = "Cargo";    
    /** <code>Cargo</code> field length. */
    public static final int FLD_ASESORCARGOLENGTH = 50;
    /** <code>asesorCargo</code> attribute field name. */
    public static final String ATTR_FIELD_ASESORCARGO = "asesorCargo";
    // Field (Estado)
    /** <code>Estado</code> field name. */
    public static final String FLD_ASESORESTADO = "Estado";    
    /** <code>Estado</code> field length. */
    public static final int FLD_ASESORESTADOLENGTH = 50;
    /** <code>asesorEstado</code> attribute field name. */
    public static final String ATTR_FIELD_ASESORESTADO = "asesorEstado";
    // Field (AccesoValidadorUsuarios)
    /** <code>AccesoValidadorUsuarios</code> field name. */
    public static final String FLD_ASESORACCESOVALIDADORUSUARIOS = "AccesoValidadorUsuarios";    
    /** <code>asesorAccesoValidadorUsuarios</code> attribute field name. */
    public static final String ATTR_FIELD_ASESORACCESOVALIDADORUSUARIOS = "asesorAccesoValidadorUsuarios";

    // Component role (TipoIdentificacion)
    /** <code>TipoIdentificacion</code> role id. */
    public static final String ROLE_ID_TIPOIDENTIFICACION = "Agr_1460562034688032_Alias";
    /** <code>TipoIdentificacion</code> role name. */
    public static final String ROLE_NAME_TIPOIDENTIFICACION = "tipoIdentificacion";
    /** <code>TipoIdentificacion</code> role alias. */
    public static final String ROLE_ALIAS_TIPOIDENTIFICACION = "Tipo Identificación";

    /** <code>TipoIdentificacion</code> inverse role name. */
    public static final String ROLE_INVNAME_TIPOIDENTIFICACION = TipoIdentificacionConstants.ROLE_NAME_ASESORES;
    /** <code>TipoIdentificacion</code> role facet sequence. */
    public static final String PATH_FACETS_TIPOIDENTIFICACION = "";
    /** <code>TipoIdentificacion</code> role target class. */
    public static final String ROLE_TARGET_TIPOIDENTIFICACION = TipoIdentificacionConstants.CLASS_NAME;

    /** Agents allowed to navigate through TipoIdentificacion **/
    public static final String TIPOIDENTIFICACION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Rol)
    /** <code>Rol</code> role id. */
    public static final String ROLE_ID_ROL = FuncionarioConstants.ROLE_ID_ROL;
    /** <code>Rol</code> role name. */
    public static final String ROLE_NAME_ROL = FuncionarioConstants.ROLE_NAME_ROL;
    /** <code>Rol</code> role alias. */
    public static final String ROLE_ALIAS_ROL = FuncionarioConstants.ROLE_ALIAS_ROL;

    /** <code>Rol</code> inverse role name. */
    public static final String ROLE_INVNAME_ROL = RolConstants.ROLE_NAME_AGENTES;
    /** <code>Rol</code> role facet sequence. */
    public static final String PATH_FACETS_ROL = FuncionarioConstants.CLASS_NAME;
    /** <code>Rol</code> role target class. */
    public static final String ROLE_TARGET_ROL = RolConstants.CLASS_NAME;

    // Component role (Sucursal)
    /** <code>Sucursal</code> role id. */
    public static final String ROLE_ID_SUCURSAL = FuncionarioConstants.ROLE_ID_SUCURSAL;
    /** <code>Sucursal</code> role name. */
    public static final String ROLE_NAME_SUCURSAL = FuncionarioConstants.ROLE_NAME_SUCURSAL;
    /** <code>Sucursal</code> role alias. */
    public static final String ROLE_ALIAS_SUCURSAL = FuncionarioConstants.ROLE_ALIAS_SUCURSAL;

    /** <code>Sucursal</code> inverse role name. */
    public static final String ROLE_INVNAME_SUCURSAL = SucursalConstants.ROLE_NAME_AGENTES;
    /** <code>Sucursal</code> role facet sequence. */
    public static final String PATH_FACETS_SUCURSAL = FuncionarioConstants.CLASS_NAME;
    /** <code>Sucursal</code> role target class. */
    public static final String ROLE_TARGET_SUCURSAL = SucursalConstants.CLASS_NAME;

    // Component role (Planes)
    /** <code>Planes</code> role id. */
    public static final String ROLE_ID_PLANES = AfiliacionesConstants.ROLE_ID_PLANES;
    /** <code>Planes</code> role name. */
    public static final String ROLE_NAME_PLANES = AfiliacionesConstants.ROLE_NAME_PLANES;
    /** <code>Planes</code> role alias. */
    public static final String ROLE_ALIAS_PLANES = AfiliacionesConstants.ROLE_ALIAS_PLANES;

    /** <code>Planes</code> inverse role name. */
    public static final String ROLE_INVNAME_PLANES = PlanesConstants.ROLE_NAME_AFILIACIONES;
    /** <code>Planes</code> role facet sequence. */
    public static final String PATH_FACETS_PLANES = FuncionarioConstants.CLASS_NAME + "." + AfiliacionesConstants.CLASS_NAME;
    /** <code>Planes</code> role target class. */
    public static final String ROLE_TARGET_PLANES = PlanesConstants.CLASS_NAME;

    // Component role (Regional)
    /** <code>Regional</code> role id. */
    public static final String ROLE_ID_REGIONAL = RespRegionalConstants.ROLE_ID_REGIONAL;
    /** <code>Regional</code> role name. */
    public static final String ROLE_NAME_REGIONAL = RespRegionalConstants.ROLE_NAME_REGIONAL;
    /** <code>Regional</code> role alias. */
    public static final String ROLE_ALIAS_REGIONAL = RespRegionalConstants.ROLE_ALIAS_REGIONAL;

    /** <code>Regional</code> inverse role name. */
    public static final String ROLE_INVNAME_REGIONAL = RegionalConstants.ROLE_NAME_RESPREGIONAL;
    /** <code>Regional</code> role facet sequence. */
    public static final String PATH_FACETS_REGIONAL = FuncionarioConstants.CLASS_NAME + "." + RespRegionalConstants.CLASS_NAME;
    /** <code>Regional</code> role target class. */
    public static final String ROLE_TARGET_REGIONAL = RegionalConstants.CLASS_NAME;


    // Compound role (ContratosC)
    /** <code>ContratosC</code> role id. */
    public static final String ROLE_ID_CONTRATOSC = "Agr_1473350467584464_Alias";
    /** <code>ContratosC</code> role name. */
    public static final String ROLE_NAME_CONTRATOSC = "contratosC";
    /** <code>AsesorC</code> role alias. */
    public static final String ROLE_ALIAS_CONTRATOSC = "Contratos";


    /** <code>ContratosC</code> inverse role name. */
    public static final String ROLE_INVNAME_CONTRATOSC = ContratoCConstants.ROLE_NAME_ASESORC;
    /** <code>ContratosC</code> role facet sequence. */
    public static final String PATH_FACETS_CONTRATOSC = "";
    /** <code>ContratosC</code> role target class. */
    public static final String ROLE_TARGET_CONTRATOSC = ContratoCConstants.CLASS_NAME;
    /** Agents allowed to navigate through ContratosC **/
    public static final String CONTRATOSC_AGENTS = "Admin,SuperAdmin,Asesor,Gestor,MesaDeApoyo";
    // Compound role (AgentexProducto)
    /** <code>AgentexProducto</code> role id. */
    public static final String ROLE_ID_AGENTEXPRODUCTO = "Agr_1460561248256880_Alias";
    /** <code>AgentexProducto</code> role name. */
    public static final String ROLE_NAME_AGENTEXPRODUCTO = "agentexProducto";
    /** <code>Asesor</code> role alias. */
    public static final String ROLE_ALIAS_AGENTEXPRODUCTO = "Productos";


    /** <code>AgentexProducto</code> inverse role name. */
    public static final String ROLE_INVNAME_AGENTEXPRODUCTO = AgentexProductoConstants.ROLE_NAME_ASESOR;
    /** <code>AgentexProducto</code> role facet sequence. */
    public static final String PATH_FACETS_AGENTEXPRODUCTO = "";
    /** <code>AgentexProducto</code> role target class. */
    public static final String ROLE_TARGET_AGENTEXPRODUCTO = AgentexProductoConstants.CLASS_NAME;
    /** Agents allowed to navigate through AgentexProducto **/
    public static final String AGENTEXPRODUCTO_AGENTS = "Admin,SuperAdmin,Asesor,Gestor,MesaDeApoyo";
    // Compound role (LogInformacionAsesor)
    /** <code>LogInformacionAsesor</code> role id. */
    public static final String ROLE_ID_LOGINFORMACIONASESOR = "Agr_1623836459008285_Alias";
    /** <code>LogInformacionAsesor</code> role name. */
    public static final String ROLE_NAME_LOGINFORMACIONASESOR = "logInformacionAsesor";
    /** <code>Asesor</code> role alias. */
    public static final String ROLE_ALIAS_LOGINFORMACIONASESOR = "Histórico Información";


    /** <code>LogInformacionAsesor</code> inverse role name. */
    public static final String ROLE_INVNAME_LOGINFORMACIONASESOR = LogInformacionAsesorConstants.ROLE_NAME_ASESOR;
    /** <code>LogInformacionAsesor</code> role facet sequence. */
    public static final String PATH_FACETS_LOGINFORMACIONASESOR = "";
    /** <code>LogInformacionAsesor</code> role target class. */
    public static final String ROLE_TARGET_LOGINFORMACIONASESOR = LogInformacionAsesorConstants.CLASS_NAME;
    /** Agents allowed to navigate through LogInformacionAsesor **/
    public static final String LOGINFORMACIONASESOR_AGENTS = "Admin,SuperAdmin,Gestor,MesaDeApoyo";
    // Compound role (LogHistoricoPlanes)
    /** <code>LogHistoricoPlanes</code> role id. */
    public static final String ROLE_ID_LOGHISTORICOPLANES = "Agr_1624004886528268_Alias";
    /** <code>LogHistoricoPlanes</code> role name. */
    public static final String ROLE_NAME_LOGHISTORICOPLANES = "logHistoricoPlanes";
    /** <code>Asesor</code> role alias. */
    public static final String ROLE_ALIAS_LOGHISTORICOPLANES = "Histórico Planes";


    /** <code>LogHistoricoPlanes</code> inverse role name. */
    public static final String ROLE_INVNAME_LOGHISTORICOPLANES = LogHistoricoPlanesConstants.ROLE_NAME_ASESOR;
    /** <code>LogHistoricoPlanes</code> role facet sequence. */
    public static final String PATH_FACETS_LOGHISTORICOPLANES = "";
    /** <code>LogHistoricoPlanes</code> role target class. */
    public static final String ROLE_TARGET_LOGHISTORICOPLANES = LogHistoricoPlanesConstants.CLASS_NAME;
    /** Agents allowed to navigate through LogHistoricoPlanes **/
    public static final String LOGHISTORICOPLANES_AGENTS = "Admin,SuperAdmin,Gestor,MesaDeApoyo";
    // Compound role (Solicitudes)
    /** <code>Solicitudes</code> role id. */
    public static final String ROLE_ID_SOLICITUDES = FuncionarioConstants.ROLE_ID_SOLICITUDES;
    /** <code>Solicitudes</code> role name. */
    public static final String ROLE_NAME_SOLICITUDES = FuncionarioConstants.ROLE_NAME_SOLICITUDES;
    /** <code>Agente</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUDES = FuncionarioConstants.ROLE_ALIAS_SOLICITUDES;


    /** <code>Solicitudes</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUDES = SolicitudConstants.ROLE_NAME_AGENTE;
    /** <code>Solicitudes</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUDES = FuncionarioConstants.CLASS_NAME;
    /** <code>Solicitudes</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUDES = SolicitudConstants.CLASS_NAME;
    // Compound role (SolicitudesAfiliacion)
    /** <code>SolicitudesAfiliacion</code> role id. */
    public static final String ROLE_ID_SOLICITUDESAFILIACION = FuncionarioConstants.ROLE_ID_SOLICITUDESAFILIACION;
    /** <code>SolicitudesAfiliacion</code> role name. */
    public static final String ROLE_NAME_SOLICITUDESAFILIACION = FuncionarioConstants.ROLE_NAME_SOLICITUDESAFILIACION;
    /** <code>UsrAfiliacion</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUDESAFILIACION = FuncionarioConstants.ROLE_ALIAS_SOLICITUDESAFILIACION;


    /** <code>SolicitudesAfiliacion</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUDESAFILIACION = SolicitudConstants.ROLE_NAME_USRAFILIACION;
    /** <code>SolicitudesAfiliacion</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUDESAFILIACION = FuncionarioConstants.CLASS_NAME;
    /** <code>SolicitudesAfiliacion</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUDESAFILIACION = SolicitudConstants.CLASS_NAME;
    // Compound role (ObsEstado)
    /** <code>ObsEstado</code> role id. */
    public static final String ROLE_ID_OBSESTADO = FuncionarioConstants.ROLE_ID_OBSESTADO;
    /** <code>ObsEstado</code> role name. */
    public static final String ROLE_NAME_OBSESTADO = FuncionarioConstants.ROLE_NAME_OBSESTADO;
    /** <code>Agente</code> role alias. */
    public static final String ROLE_ALIAS_OBSESTADO = FuncionarioConstants.ROLE_ALIAS_OBSESTADO;


    /** <code>ObsEstado</code> inverse role name. */
    public static final String ROLE_INVNAME_OBSESTADO = ObsEstadoConstants.ROLE_NAME_AGENTE;
    /** <code>ObsEstado</code> role facet sequence. */
    public static final String PATH_FACETS_OBSESTADO = FuncionarioConstants.CLASS_NAME;
    /** <code>ObsEstado</code> role target class. */
    public static final String ROLE_TARGET_OBSESTADO = ObsEstadoConstants.CLASS_NAME;
    // Compound role (Reportes)
    /** <code>Reportes</code> role id. */
    public static final String ROLE_ID_REPORTES = FuncionarioConstants.ROLE_ID_REPORTES;
    /** <code>Reportes</code> role name. */
    public static final String ROLE_NAME_REPORTES = FuncionarioConstants.ROLE_NAME_REPORTES;
    /** <code>Funcionarios</code> role alias. */
    public static final String ROLE_ALIAS_REPORTES = FuncionarioConstants.ROLE_ALIAS_REPORTES;


    /** <code>Reportes</code> inverse role name. */
    public static final String ROLE_INVNAME_REPORTES = ReportesProcAlmConstants.ROLE_NAME_FUNCIONARIOS;
    /** <code>Reportes</code> role facet sequence. */
    public static final String PATH_FACETS_REPORTES = FuncionarioConstants.CLASS_NAME;
    /** <code>Reportes</code> role target class. */
    public static final String ROLE_TARGET_REPORTES = ReportesProcAlmConstants.CLASS_NAME;
    // Compound role (SolicitudesNovedad)
    /** <code>SolicitudesNovedad</code> role id. */
    public static final String ROLE_ID_SOLICITUDESNOVEDAD = FuncionarioConstants.ROLE_ID_SOLICITUDESNOVEDAD;
    /** <code>SolicitudesNovedad</code> role name. */
    public static final String ROLE_NAME_SOLICITUDESNOVEDAD = FuncionarioConstants.ROLE_NAME_SOLICITUDESNOVEDAD;
    /** <code>Agente</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUDESNOVEDAD = FuncionarioConstants.ROLE_ALIAS_SOLICITUDESNOVEDAD;


    /** <code>SolicitudesNovedad</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUDESNOVEDAD = SolicitudNovedadConstants.ROLE_NAME_AGENTE;
    /** <code>SolicitudesNovedad</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUDESNOVEDAD = FuncionarioConstants.CLASS_NAME;
    /** <code>SolicitudesNovedad</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUDESNOVEDAD = SolicitudNovedadConstants.CLASS_NAME;
    // Compound role (SolNovAifliaciones)
    /** <code>SolNovAifliaciones</code> role id. */
    public static final String ROLE_ID_SOLNOVAIFLIACIONES = FuncionarioConstants.ROLE_ID_SOLNOVAIFLIACIONES;
    /** <code>SolNovAifliaciones</code> role name. */
    public static final String ROLE_NAME_SOLNOVAIFLIACIONES = FuncionarioConstants.ROLE_NAME_SOLNOVAIFLIACIONES;
    /** <code>UsrAfiliacion</code> role alias. */
    public static final String ROLE_ALIAS_SOLNOVAIFLIACIONES = FuncionarioConstants.ROLE_ALIAS_SOLNOVAIFLIACIONES;


    /** <code>SolNovAifliaciones</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLNOVAIFLIACIONES = SolicitudNovedadConstants.ROLE_NAME_USRAFILIACION;
    /** <code>SolNovAifliaciones</code> role facet sequence. */
    public static final String PATH_FACETS_SOLNOVAIFLIACIONES = FuncionarioConstants.CLASS_NAME;
    /** <code>SolNovAifliaciones</code> role target class. */
    public static final String ROLE_TARGET_SOLNOVAIFLIACIONES = SolicitudNovedadConstants.CLASS_NAME;
    // Compound role (GrupoAsignacion)
    /** <code>GrupoAsignacion</code> role id. */
    public static final String ROLE_ID_GRUPOASIGNACION = FuncionarioConstants.ROLE_ID_GRUPOASIGNACION;
    /** <code>GrupoAsignacion</code> role name. */
    public static final String ROLE_NAME_GRUPOASIGNACION = FuncionarioConstants.ROLE_NAME_GRUPOASIGNACION;
    /** <code>Funcionario</code> role alias. */
    public static final String ROLE_ALIAS_GRUPOASIGNACION = FuncionarioConstants.ROLE_ALIAS_GRUPOASIGNACION;


    /** <code>GrupoAsignacion</code> inverse role name. */
    public static final String ROLE_INVNAME_GRUPOASIGNACION = GrupoAsignacionConstants.ROLE_NAME_FUNCIONARIO;
    /** <code>GrupoAsignacion</code> role facet sequence. */
    public static final String PATH_FACETS_GRUPOASIGNACION = FuncionarioConstants.CLASS_NAME;
    /** <code>GrupoAsignacion</code> role target class. */
    public static final String ROLE_TARGET_GRUPOASIGNACION = GrupoAsignacionConstants.CLASS_NAME;
    // Compound role (LogFuncionario)
    /** <code>LogFuncionario</code> role id. */
    public static final String ROLE_ID_LOGFUNCIONARIO = FuncionarioConstants.ROLE_ID_LOGFUNCIONARIO;
    /** <code>LogFuncionario</code> role name. */
    public static final String ROLE_NAME_LOGFUNCIONARIO = FuncionarioConstants.ROLE_NAME_LOGFUNCIONARIO;
    /** <code>Funcionario</code> role alias. */
    public static final String ROLE_ALIAS_LOGFUNCIONARIO = FuncionarioConstants.ROLE_ALIAS_LOGFUNCIONARIO;


    /** <code>LogFuncionario</code> inverse role name. */
    public static final String ROLE_INVNAME_LOGFUNCIONARIO = LogFuncionarioConstants.ROLE_NAME_FUNCIONARIO;
    /** <code>LogFuncionario</code> role facet sequence. */
    public static final String PATH_FACETS_LOGFUNCIONARIO = FuncionarioConstants.CLASS_NAME;
    /** <code>LogFuncionario</code> role target class. */
    public static final String ROLE_TARGET_LOGFUNCIONARIO = LogFuncionarioConstants.CLASS_NAME;
    // Compound role (SolicitudesArMe)
    /** <code>SolicitudesArMe</code> role id. */
    public static final String ROLE_ID_SOLICITUDESARME = AreaMedicaConstants.ROLE_ID_SOLICITUDESARME;
    /** <code>SolicitudesArMe</code> role name. */
    public static final String ROLE_NAME_SOLICITUDESARME = AreaMedicaConstants.ROLE_NAME_SOLICITUDESARME;
    /** <code>UsrAreaMedica</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUDESARME = AreaMedicaConstants.ROLE_ALIAS_SOLICITUDESARME;


    /** <code>SolicitudesArMe</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUDESARME = SolicitudConstants.ROLE_NAME_USRAREAMEDICA;
    /** <code>SolicitudesArMe</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUDESARME = FuncionarioConstants.CLASS_NAME + "." + AreaMedicaConstants.CLASS_NAME;
    /** <code>SolicitudesArMe</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUDESARME = SolicitudConstants.CLASS_NAME;
    // Compound role (Firma)
    /** <code>Firma</code> role id. */
    public static final String ROLE_ID_FIRMA = RespRegionalConstants.ROLE_ID_FIRMA;
    /** <code>Firma</code> role name. */
    public static final String ROLE_NAME_FIRMA = RespRegionalConstants.ROLE_NAME_FIRMA;
    /** <code>RespRegional</code> role alias. */
    public static final String ROLE_ALIAS_FIRMA = RespRegionalConstants.ROLE_ALIAS_FIRMA;


    /** <code>Firma</code> inverse role name. */
    public static final String ROLE_INVNAME_FIRMA = FirmaConstants.ROLE_NAME_RESPREGIONAL;
    /** <code>Firma</code> role facet sequence. */
    public static final String PATH_FACETS_FIRMA = FuncionarioConstants.CLASS_NAME + "." + RespRegionalConstants.CLASS_NAME;
    /** <code>Firma</code> role target class. */
    public static final String ROLE_TARGET_FIRMA = FirmaConstants.CLASS_NAME;

    // Service (sincronizar)
    /** <code>sincronizar</code> service id. */
    public static final String SERV_ID_SINCRONIZAR = "Clas_1431886233600794Ser_3_Alias";
    /** <code>sincronizar</code> service name. */
    public static final String SERV_NAME_SINCRONIZAR = "sincronizar";
    /** <code>sincronizar</code> service alias. */
    public static final String SERV_ALIAS_SINCRONIZAR = "sincronizar";
    /** Agents allowed to execute the service sincronizar **/
    public static final String SINCRONIZAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>asesorsincronizarpthisAsesor</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_ASESORSINCRONIZARPTHISASESOR = "p_thisAsesor";
    /** <code>asesorsincronizarpthisAsesor</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_ASESORSINCRONIZARPTHISASESOR = "Clas_1431886233600794Ser_3Arg_1_Alias";
    /** <code>asesorsincronizarpthisAsesor</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_ASESORSINCRONIZARPTHISASESOR = "Asesor";
    /** <code>asesorsincronizarpCodDirector</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_ASESORSINCRONIZARPCODDIRECTOR = "pCodDirector";
    /** <code>asesorsincronizarpCodDirector</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_ASESORSINCRONIZARPCODDIRECTOR = "Clas_1431886233600794Ser_3Arg_10_Alias";
    /** <code>asesorsincronizarpCodDirector</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_ASESORSINCRONIZARPCODDIRECTOR = "Código director";
    /** <code>asesorsincronizarpNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_ASESORSINCRONIZARPNUMIDENTIFICACION = "pNumIdentificacion";
    /** <code>asesorsincronizarpNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_ASESORSINCRONIZARPNUMIDENTIFICACION = "Clas_1431886233600794Ser_3Arg_11_Alias";
    /** <code>asesorsincronizarpNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_ASESORSINCRONIZARPNUMIDENTIFICACION = "Nº Identificación";
    /** <code>asesorsincronizarpCanal</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_ASESORSINCRONIZARPCANAL = "pCanal";
    /** <code>asesorsincronizarpCanal</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_ASESORSINCRONIZARPCANAL = "Clas_1431886233600794Ser_3Arg_12_Alias";
    /** <code>asesorsincronizarpCanal</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_ASESORSINCRONIZARPCANAL = "Canal Comercial";
    /** <code>asesorsincronizarpCargo</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_ASESORSINCRONIZARPCARGO = "pCargo";
    /** <code>asesorsincronizarpCargo</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_ASESORSINCRONIZARPCARGO = "Clas_1431886233600794Ser_3Arg_13_Alias";
    /** <code>asesorsincronizarpCargo</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_ASESORSINCRONIZARPCARGO = "Tipo Agente";
    /** <code>asesorsincronizarpEstado</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_ASESORSINCRONIZARPESTADO = "pEstado";
    /** <code>asesorsincronizarpEstado</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_ASESORSINCRONIZARPESTADO = "Clas_1431886233600794Ser_3Arg_14_Alias";
    /** <code>asesorsincronizarpEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_ASESORSINCRONIZARPESTADO = "Estado";
    // Service (modificarAsesor)
    /** <code>modificarAsesor</code> service id. */
    public static final String SERV_ID_MODIFICARASESOR = "Clas_1431886233600794Ser_9_Alias";
    /** <code>modificarAsesor</code> service name. */
    public static final String SERV_NAME_MODIFICARASESOR = "modificarAsesor";
    /** <code>modificarAsesor</code> service alias. */
    public static final String SERV_ALIAS_MODIFICARASESOR = "Modificar asesor";
    /** Agents allowed to execute the service modificarAsesor **/
    public static final String MODIFICARASESOR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>asesormodificarAsesorpthisAsesor</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARASESOR_ASESORMODIFICARASESORPTHISASESOR = "p_thisAsesor";
    /** <code>asesormodificarAsesorpthisAsesor</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARASESOR_ASESORMODIFICARASESORPTHISASESOR = "Clas_1431886233600794Ser_9Arg_1_Alias";
    /** <code>asesormodificarAsesorpthisAsesor</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARASESOR_ASESORMODIFICARASESORPTHISASESOR = "Asesor";
    /** <code>asesormodificarAsesorpModDBasicosPersona</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARASESOR_ASESORMODIFICARASESORPMODDBASICOSPERSONA = "p_ModDBasicosPersona";
    /** <code>asesormodificarAsesorpModDBasicosPersona</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARASESOR_ASESORMODIFICARASESORPMODDBASICOSPERSONA = "Clas_1431886233600794Ser_9Arg_4_Alias";
    /** <code>asesormodificarAsesorpModDBasicosPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARASESOR_ASESORMODIFICARASESORPMODDBASICOSPERSONA = "Puede modificar persona";
    /** <code>asesormodificarAsesorpModificaDirector</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARASESOR_ASESORMODIFICARASESORPMODIFICADIRECTOR = "pModificaDirector";
    /** <code>asesormodificarAsesorpModificaDirector</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARASESOR_ASESORMODIFICARASESORPMODIFICADIRECTOR = "Clas_1431886233600794Ser_9Arg_5_Alias";
    /** <code>asesormodificarAsesorpModificaDirector</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARASESOR_ASESORMODIFICARASESORPMODIFICADIRECTOR = "Modifica director?";
    /** <code>asesormodificarAsesorptUsuarioLDAP</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARASESOR_ASESORMODIFICARASESORPTUSUARIOLDAP = "ptUsuarioLDAP";
    /** <code>asesormodificarAsesorptUsuarioLDAP</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARASESOR_ASESORMODIFICARASESORPTUSUARIOLDAP = "Clas_1431886233600794Ser_9Arg_8_Alias";
    /** <code>asesormodificarAsesorptUsuarioLDAP</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARASESOR_ASESORMODIFICARASESORPTUSUARIOLDAP = "Usuario LDAP";
    /** <code>asesormodificarAsesorptEmail</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARASESOR_ASESORMODIFICARASESORPTEMAIL = "ptEmail";
    /** <code>asesormodificarAsesorptEmail</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARASESOR_ASESORMODIFICARASESORPTEMAIL = "Clas_1431886233600794Ser_9Arg_9_Alias";
    /** <code>asesormodificarAsesorptEmail</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARASESOR_ASESORMODIFICARASESORPTEMAIL = "Email";
    /** <code>asesormodificarAsesorptNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARASESOR_ASESORMODIFICARASESORPTNUMIDENTIFICACION = "ptNumIdentificacion";
    /** <code>asesormodificarAsesorptNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARASESOR_ASESORMODIFICARASESORPTNUMIDENTIFICACION = "Clas_1431886233600794Ser_9Arg_10_Alias";
    /** <code>asesormodificarAsesorptNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARASESOR_ASESORMODIFICARASESORPTNUMIDENTIFICACION = "Nº Identificación";
    /** <code>asesormodificarAsesorpeIntegral</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARASESOR_ASESORMODIFICARASESORPEINTEGRAL = "peIntegral";
    /** <code>asesormodificarAsesorpeIntegral</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARASESOR_ASESORMODIFICARASESORPEINTEGRAL = "Clas_1431886233600794Ser_9Arg_11_Alias";
    /** <code>asesormodificarAsesorpeIntegral</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARASESOR_ASESORMODIFICARASESORPEINTEGRAL = "Asesor Integral";
    /** <code>asesormodificarAsesorpeValidadorUsuarios</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARASESOR_ASESORMODIFICARASESORPEVALIDADORUSUARIOS = "peValidadorUsuarios";
    /** <code>asesormodificarAsesorpeValidadorUsuarios</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARASESOR_ASESORMODIFICARASESORPEVALIDADORUSUARIOS = "Clas_1431886233600794Ser_9Arg_15_Alias";
    /** <code>asesormodificarAsesorpeValidadorUsuarios</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARASESOR_ASESORMODIFICARASESORPEVALIDADORUSUARIOS = "Acceso validador usuarios";
    // Service (InsTipoIdentificacionAsesor)
    /** <code>InsTipoIdentificacionAsesor</code> service id. */
    public static final String SERV_ID_INSTIPOIDENTIFICACIONASESOR = "Clas_1431886233600794Ser_15_Alias";
    /** <code>InsTipoIdentificacionAsesor</code> service name. */
    public static final String SERV_NAME_INSTIPOIDENTIFICACIONASESOR = "InsTipoIdentificacionAsesor";
    /** <code>InsTipoIdentificacionAsesor</code> service alias. */
    public static final String SERV_ALIAS_INSTIPOIDENTIFICACIONASESOR = "InsTipoIdentificacionAsesor";
    /** Agents allowed to execute the service InsTipoIdentificacionAsesor **/
    public static final String INSTIPOIDENTIFICACIONASESOR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>asesorInsTipoIdentificacionAsesorpthisAsesor</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPOIDENTIFICACIONASESOR_ASESORINSTIPOIDENTIFICACIONASESORPTHISASESOR = "p_thisAsesor";
    /** <code>asesorInsTipoIdentificacionAsesorpthisAsesor</code> inbound argument id. */
    public static final String ARG_ID_INSTIPOIDENTIFICACIONASESOR_ASESORINSTIPOIDENTIFICACIONASESORPTHISASESOR = "Clas_1431886233600794Ser_15Arg_1_Alias";
    /** <code>asesorInsTipoIdentificacionAsesorpthisAsesor</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPOIDENTIFICACIONASESOR_ASESORINSTIPOIDENTIFICACIONASESORPTHISASESOR = "Asesores";
    /** <code>asesorInsTipoIdentificacionAsesorpevcTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPOIDENTIFICACIONASESOR_ASESORINSTIPOIDENTIFICACIONASESORPEVCTIPOIDENTIFICACION = "p_evcTipoIdentificacion";
    /** <code>asesorInsTipoIdentificacionAsesorpevcTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_INSTIPOIDENTIFICACIONASESOR_ASESORINSTIPOIDENTIFICACIONASESORPEVCTIPOIDENTIFICACION = "Clas_1431886233600794Ser_15Arg_2_Alias";
    /** <code>asesorInsTipoIdentificacionAsesorpevcTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPOIDENTIFICACIONASESOR_ASESORINSTIPOIDENTIFICACIONASESORPEVCTIPOIDENTIFICACION = "Tipo Identificación";
    // Service (DelTipoIdentificacionAsesor)
    /** <code>DelTipoIdentificacionAsesor</code> service id. */
    public static final String SERV_ID_DELTIPOIDENTIFICACIONASESOR = "Clas_1431886233600794Ser_16_Alias";
    /** <code>DelTipoIdentificacionAsesor</code> service name. */
    public static final String SERV_NAME_DELTIPOIDENTIFICACIONASESOR = "DelTipoIdentificacionAsesor";
    /** <code>DelTipoIdentificacionAsesor</code> service alias. */
    public static final String SERV_ALIAS_DELTIPOIDENTIFICACIONASESOR = "DelTipoIdentificacionAsesor";
    /** Agents allowed to execute the service DelTipoIdentificacionAsesor **/
    public static final String DELTIPOIDENTIFICACIONASESOR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>asesorDelTipoIdentificacionAsesorpthisAsesor</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPOIDENTIFICACIONASESOR_ASESORDELTIPOIDENTIFICACIONASESORPTHISASESOR = "p_thisAsesor";
    /** <code>asesorDelTipoIdentificacionAsesorpthisAsesor</code> inbound argument id. */
    public static final String ARG_ID_DELTIPOIDENTIFICACIONASESOR_ASESORDELTIPOIDENTIFICACIONASESORPTHISASESOR = "Clas_1431886233600794Ser_16Arg_1_Alias";
    /** <code>asesorDelTipoIdentificacionAsesorpthisAsesor</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPOIDENTIFICACIONASESOR_ASESORDELTIPOIDENTIFICACIONASESORPTHISASESOR = "Asesores";
    /** <code>asesorDelTipoIdentificacionAsesorpevcTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPOIDENTIFICACIONASESOR_ASESORDELTIPOIDENTIFICACIONASESORPEVCTIPOIDENTIFICACION = "p_evcTipoIdentificacion";
    /** <code>asesorDelTipoIdentificacionAsesorpevcTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_DELTIPOIDENTIFICACIONASESOR_ASESORDELTIPOIDENTIFICACIONASESORPEVCTIPOIDENTIFICACION = "Clas_1431886233600794Ser_16Arg_2_Alias";
    /** <code>asesorDelTipoIdentificacionAsesorpevcTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPOIDENTIFICACIONASESOR_ASESORDELTIPOIDENTIFICACIONASESORPEVCTIPOIDENTIFICACION = "Tipo Identificación";
    // Service (marcarEsDirector)
    /** <code>marcarEsDirector</code> service id. */
    public static final String SERV_ID_MARCARESDIRECTOR = "Clas_1431886233600794Ser_19_Alias";
    /** <code>marcarEsDirector</code> service name. */
    public static final String SERV_NAME_MARCARESDIRECTOR = "marcarEsDirector";
    /** <code>marcarEsDirector</code> service alias. */
    public static final String SERV_ALIAS_MARCARESDIRECTOR = "marcarEsDirector";
    /** Agents allowed to execute the service marcarEsDirector **/
    public static final String MARCARESDIRECTOR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>asesormarcarEsDirectorpthisAsesor</code> inbound argument name. */
    public static final String ARG_NAME_MARCARESDIRECTOR_ASESORMARCARESDIRECTORPTHISASESOR = "p_thisAsesor";
    /** <code>asesormarcarEsDirectorpthisAsesor</code> inbound argument id. */
    public static final String ARG_ID_MARCARESDIRECTOR_ASESORMARCARESDIRECTORPTHISASESOR = "Clas_1431886233600794Ser_19Arg_1_Alias";
    /** <code>asesormarcarEsDirectorpthisAsesor</code> inbound argument alias. */
    public static final String ARG_ALIAS_MARCARESDIRECTOR_ASESORMARCARESDIRECTORPTHISASESOR = "Asesor";
    /** <code>asesormarcarEsDirectorpEsDirector</code> inbound argument name. */
    public static final String ARG_NAME_MARCARESDIRECTOR_ASESORMARCARESDIRECTORPESDIRECTOR = "p_EsDirector";
    /** <code>asesormarcarEsDirectorpEsDirector</code> inbound argument id. */
    public static final String ARG_ID_MARCARESDIRECTOR_ASESORMARCARESDIRECTORPESDIRECTOR = "Clas_1431886233600794Ser_19Arg_2_Alias";
    /** <code>asesormarcarEsDirectorpEsDirector</code> inbound argument alias. */
    public static final String ARG_ALIAS_MARCARESDIRECTOR_ASESORMARCARESDIRECTORPESDIRECTOR = "Es director?";
    // Service (InsAsesorC)
    /** <code>InsAsesorC</code> service id. */
    public static final String SERV_ID_INSASESORC = "Clas_1431886233600794Ser_20_Alias";
    /** <code>InsAsesorC</code> service name. */
    public static final String SERV_NAME_INSASESORC = "InsAsesorC";
    /** <code>InsAsesorC</code> service alias. */
    public static final String SERV_ALIAS_INSASESORC = "InsAsesorC";
    /** Agents allowed to execute the service InsAsesorC **/
    public static final String INSASESORC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>asesorInsAsesorCpthisAsesor</code> inbound argument name. */
    public static final String ARG_NAME_INSASESORC_ASESORINSASESORCPTHISASESOR = "p_thisAsesor";
    /** <code>asesorInsAsesorCpthisAsesor</code> inbound argument id. */
    public static final String ARG_ID_INSASESORC_ASESORINSASESORCPTHISASESOR = "Clas_1431886233600794Ser_20Arg_1_Alias";
    /** <code>asesorInsAsesorCpthisAsesor</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSASESORC_ASESORINSASESORCPTHISASESOR = "Asesor";
    /** <code>asesorInsAsesorCpevcContratoC</code> inbound argument name. */
    public static final String ARG_NAME_INSASESORC_ASESORINSASESORCPEVCCONTRATOC = "p_evcContratoC";
    /** <code>asesorInsAsesorCpevcContratoC</code> inbound argument id. */
    public static final String ARG_ID_INSASESORC_ASESORINSASESORCPEVCCONTRATOC = "Clas_1431886233600794Ser_20Arg_2_Alias";
    /** <code>asesorInsAsesorCpevcContratoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSASESORC_ASESORINSASESORCPEVCCONTRATOC = "Contratos";
    // Service (DelAsesorC)
    /** <code>DelAsesorC</code> service id. */
    public static final String SERV_ID_DELASESORC = "Clas_1431886233600794Ser_21_Alias";
    /** <code>DelAsesorC</code> service name. */
    public static final String SERV_NAME_DELASESORC = "DelAsesorC";
    /** <code>DelAsesorC</code> service alias. */
    public static final String SERV_ALIAS_DELASESORC = "DelAsesorC";
    /** Agents allowed to execute the service DelAsesorC **/
    public static final String DELASESORC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>asesorDelAsesorCpthisAsesor</code> inbound argument name. */
    public static final String ARG_NAME_DELASESORC_ASESORDELASESORCPTHISASESOR = "p_thisAsesor";
    /** <code>asesorDelAsesorCpthisAsesor</code> inbound argument id. */
    public static final String ARG_ID_DELASESORC_ASESORDELASESORCPTHISASESOR = "Clas_1431886233600794Ser_21Arg_1_Alias";
    /** <code>asesorDelAsesorCpthisAsesor</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELASESORC_ASESORDELASESORCPTHISASESOR = "Asesor";
    /** <code>asesorDelAsesorCpevcContratoC</code> inbound argument name. */
    public static final String ARG_NAME_DELASESORC_ASESORDELASESORCPEVCCONTRATOC = "p_evcContratoC";
    /** <code>asesorDelAsesorCpevcContratoC</code> inbound argument id. */
    public static final String ARG_ID_DELASESORC_ASESORDELASESORCPEVCCONTRATOC = "Clas_1431886233600794Ser_21Arg_2_Alias";
    /** <code>asesorDelAsesorCpevcContratoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELASESORC_ASESORDELASESORCPEVCCONTRATOC = "Contratos";
    // Service (modVisibilidad)
    /** <code>modVisibilidad</code> service id. */
    public static final String SERV_ID_MODVISIBILIDAD = "Clas_1431886233600794Ser_24_Alias";
    /** <code>modVisibilidad</code> service name. */
    public static final String SERV_NAME_MODVISIBILIDAD = "modVisibilidad";
    /** <code>modVisibilidad</code> service alias. */
    public static final String SERV_ALIAS_MODVISIBILIDAD = "modVisibilidad";
    /** Agents allowed to execute the service modVisibilidad **/
    public static final String MODVISIBILIDAD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>asesormodVisibilidadpthisAsesor</code> inbound argument name. */
    public static final String ARG_NAME_MODVISIBILIDAD_ASESORMODVISIBILIDADPTHISASESOR = "p_thisAsesor";
    /** <code>asesormodVisibilidadpthisAsesor</code> inbound argument id. */
    public static final String ARG_ID_MODVISIBILIDAD_ASESORMODVISIBILIDADPTHISASESOR = "Clas_1431886233600794Ser_24Arg_1_Alias";
    /** <code>asesormodVisibilidadpthisAsesor</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODVISIBILIDAD_ASESORMODVISIBILIDADPTHISASESOR = "Asesor";
    /** <code>asesormodVisibilidadpVerDatosPersona</code> inbound argument name. */
    public static final String ARG_NAME_MODVISIBILIDAD_ASESORMODVISIBILIDADPVERDATOSPERSONA = "pVerDatosPersona";
    /** <code>asesormodVisibilidadpVerDatosPersona</code> inbound argument id. */
    public static final String ARG_ID_MODVISIBILIDAD_ASESORMODVISIBILIDADPVERDATOSPERSONA = "Clas_1431886233600794Ser_24Arg_2_Alias";
    /** <code>asesormodVisibilidadpVerDatosPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODVISIBILIDAD_ASESORMODVISIBILIDADPVERDATOSPERSONA = "Ver datos básicos de usuarios";
    /** <code>asesormodVisibilidadpVerDocsPersona</code> inbound argument name. */
    public static final String ARG_NAME_MODVISIBILIDAD_ASESORMODVISIBILIDADPVERDOCSPERSONA = "pVerDocsPersona";
    /** <code>asesormodVisibilidadpVerDocsPersona</code> inbound argument id. */
    public static final String ARG_ID_MODVISIBILIDAD_ASESORMODVISIBILIDADPVERDOCSPERSONA = "Clas_1431886233600794Ser_24Arg_3_Alias";
    /** <code>asesormodVisibilidadpVerDocsPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODVISIBILIDAD_ASESORMODVISIBILIDADPVERDOCSPERSONA = "Ver documentos persona";
    /** <code>asesormodVisibilidadpVerContratoNovedad</code> inbound argument name. */
    public static final String ARG_NAME_MODVISIBILIDAD_ASESORMODVISIBILIDADPVERCONTRATONOVEDAD = "pVerContratoNovedad";
    /** <code>asesormodVisibilidadpVerContratoNovedad</code> inbound argument id. */
    public static final String ARG_ID_MODVISIBILIDAD_ASESORMODVISIBILIDADPVERCONTRATONOVEDAD = "Clas_1431886233600794Ser_24Arg_4_Alias";
    /** <code>asesormodVisibilidadpVerContratoNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODVISIBILIDAD_ASESORMODVISIBILIDADPVERCONTRATONOVEDAD = "Ver contrato en Novedades";
    // Service (TSINCRONIZAR)
    /** <code>TSINCRONIZAR</code> service id. */
    public static final String SERV_ID_TSINCRONIZAR = "Clas_1431886233600794Ser_7_Alias";
    /** <code>TSINCRONIZAR</code> service name. */
    public static final String SERV_NAME_TSINCRONIZAR = "TSINCRONIZAR";
    /** <code>TSINCRONIZAR</code> service alias. */
    public static final String SERV_ALIAS_TSINCRONIZAR = "TSINCRONIZAR";
    /** Agents allowed to execute the service TSINCRONIZAR **/
    public static final String TSINCRONIZAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>asesorTSINCRONIZARpthisAsesor</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_ASESORTSINCRONIZARPTHISASESOR = "p_thisAsesor";
    /** <code>asesorTSINCRONIZARpthisAsesor</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_ASESORTSINCRONIZARPTHISASESOR = "Clas_1431886233600794Ser_7Arg_1_Alias";
    /** <code>asesorTSINCRONIZARpthisAsesor</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_ASESORTSINCRONIZARPTHISASESOR = "Asesor";
    /** <code>asesorTSINCRONIZARptpPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_ASESORTSINCRONIZARPTPPRIMERNOMBRE = "pt_p_PrimerNombre";
    /** <code>asesorTSINCRONIZARptpPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_ASESORTSINCRONIZARPTPPRIMERNOMBRE = "Clas_1431886233600794Ser_7Arg_3_Alias";
    /** <code>asesorTSINCRONIZARptpPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_ASESORTSINCRONIZARPTPPRIMERNOMBRE = "Primer nombre";
    /** <code>asesorTSINCRONIZARptpSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_ASESORTSINCRONIZARPTPSEGUNDONOMBRE = "pt_p_SegundoNombre";
    /** <code>asesorTSINCRONIZARptpSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_ASESORTSINCRONIZARPTPSEGUNDONOMBRE = "Clas_1431886233600794Ser_7Arg_4_Alias";
    /** <code>asesorTSINCRONIZARptpSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_ASESORTSINCRONIZARPTPSEGUNDONOMBRE = "Segundo nombre";
    /** <code>asesorTSINCRONIZARptpPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_ASESORTSINCRONIZARPTPPRIMERAPELLIDO = "pt_p_PrimerApellido";
    /** <code>asesorTSINCRONIZARptpPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_ASESORTSINCRONIZARPTPPRIMERAPELLIDO = "Clas_1431886233600794Ser_7Arg_5_Alias";
    /** <code>asesorTSINCRONIZARptpPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_ASESORTSINCRONIZARPTPPRIMERAPELLIDO = "Primer apellido";
    /** <code>asesorTSINCRONIZARptpSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_ASESORTSINCRONIZARPTPSEGUNDOAPELLIDO = "pt_p_SegundoApellido";
    /** <code>asesorTSINCRONIZARptpSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_ASESORTSINCRONIZARPTPSEGUNDOAPELLIDO = "Clas_1431886233600794Ser_7Arg_6_Alias";
    /** <code>asesorTSINCRONIZARptpSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_ASESORTSINCRONIZARPTPSEGUNDOAPELLIDO = "Segundo apellido";
    /** <code>asesorTSINCRONIZARptpevcSucursal</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_ASESORTSINCRONIZARPTPEVCSUCURSAL = "pt_p_evcSucursal";
    /** <code>asesorTSINCRONIZARptpevcSucursal</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_ASESORTSINCRONIZARPTPEVCSUCURSAL = "Clas_1431886233600794Ser_7Arg_8_Alias";
    /** <code>asesorTSINCRONIZARptpevcSucursal</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_ASESORTSINCRONIZARPTPEVCSUCURSAL = "Sucursal";
    /** <code>asesorTSINCRONIZARpCodDirector</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_ASESORTSINCRONIZARPCODDIRECTOR = "pCodDirector";
    /** <code>asesorTSINCRONIZARpCodDirector</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_ASESORTSINCRONIZARPCODDIRECTOR = "Clas_1431886233600794Ser_7Arg_11_Alias";
    /** <code>asesorTSINCRONIZARpCodDirector</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_ASESORTSINCRONIZARPCODDIRECTOR = "Código director";
    /** <code>asesorTSINCRONIZARpNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_ASESORTSINCRONIZARPNUMIDENTIFICACION = "pNumIdentificacion";
    /** <code>asesorTSINCRONIZARpNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_ASESORTSINCRONIZARPNUMIDENTIFICACION = "Clas_1431886233600794Ser_7Arg_12_Alias";
    /** <code>asesorTSINCRONIZARpNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_ASESORTSINCRONIZARPNUMIDENTIFICACION = "Nº Identificación";
    /** <code>asesorTSINCRONIZARpTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_ASESORTSINCRONIZARPTIPOIDENTIFICACION = "pTipoIdentificacion";
    /** <code>asesorTSINCRONIZARpTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_ASESORTSINCRONIZARPTIPOIDENTIFICACION = "Clas_1431886233600794Ser_7Arg_13_Alias";
    /** <code>asesorTSINCRONIZARpTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_ASESORTSINCRONIZARPTIPOIDENTIFICACION = "Tipo Identificación";
    /** <code>asesorTSINCRONIZARptpCanal</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_ASESORTSINCRONIZARPTPCANAL = "pt_pCanal";
    /** <code>asesorTSINCRONIZARptpCanal</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_ASESORTSINCRONIZARPTPCANAL = "Clas_1431886233600794Ser_7Arg_16_Alias";
    /** <code>asesorTSINCRONIZARptpCanal</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_ASESORTSINCRONIZARPTPCANAL = "Canal Comercial";
    /** <code>asesorTSINCRONIZARptpCargo</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_ASESORTSINCRONIZARPTPCARGO = "pt_pCargo";
    /** <code>asesorTSINCRONIZARptpCargo</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_ASESORTSINCRONIZARPTPCARGO = "Clas_1431886233600794Ser_7Arg_17_Alias";
    /** <code>asesorTSINCRONIZARptpCargo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_ASESORTSINCRONIZARPTPCARGO = "Cargo";
    /** <code>asesorTSINCRONIZARptpEstado</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_ASESORTSINCRONIZARPTPESTADO = "pt_pEstado";
    /** <code>asesorTSINCRONIZARptpEstado</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_ASESORTSINCRONIZARPTPESTADO = "Clas_1431886233600794Ser_7Arg_18_Alias";
    /** <code>asesorTSINCRONIZARptpEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_ASESORTSINCRONIZARPTPESTADO = "Estado";
    // Service (TMODIFICARASESOR)
    /** <code>TMODIFICARASESOR</code> service id. */
    public static final String SERV_ID_TMODIFICARASESOR = "Clas_1431886233600794Ser_13_Alias";
    /** <code>TMODIFICARASESOR</code> service name. */
    public static final String SERV_NAME_TMODIFICARASESOR = "TMODIFICARASESOR";
    /** <code>TMODIFICARASESOR</code> service alias. */
    public static final String SERV_ALIAS_TMODIFICARASESOR = "Modificar asesor";
    /** Agents allowed to execute the service TMODIFICARASESOR **/
    public static final String TMODIFICARASESOR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>asesorTMODIFICARASESORpthisAsesor</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARASESOR_ASESORTMODIFICARASESORPTHISASESOR = "p_thisAsesor";
    /** <code>asesorTMODIFICARASESORpthisAsesor</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARASESOR_ASESORTMODIFICARASESORPTHISASESOR = "Clas_1431886233600794Ser_13Arg_1_Alias";
    /** <code>asesorTMODIFICARASESORpthisAsesor</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARASESOR_ASESORTMODIFICARASESORPTHISASESOR = "Asesor";
    /** <code>asesorTMODIFICARASESORptpModDBasicosPersona</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARASESOR_ASESORTMODIFICARASESORPTPMODDBASICOSPERSONA = "pt_p_ModDBasicosPersona";
    /** <code>asesorTMODIFICARASESORptpModDBasicosPersona</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARASESOR_ASESORTMODIFICARASESORPTPMODDBASICOSPERSONA = "Clas_1431886233600794Ser_13Arg_2_Alias";
    /** <code>asesorTMODIFICARASESORptpModDBasicosPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARASESOR_ASESORTMODIFICARASESORPTPMODDBASICOSPERSONA = "Puede modificar persona";
    /** <code>asesorTMODIFICARASESORpModificaDirector</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARASESOR_ASESORTMODIFICARASESORPMODIFICADIRECTOR = "pModificaDirector";
    /** <code>asesorTMODIFICARASESORpModificaDirector</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARASESOR_ASESORTMODIFICARASESORPMODIFICADIRECTOR = "Clas_1431886233600794Ser_13Arg_4_Alias";
    /** <code>asesorTMODIFICARASESORpModificaDirector</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARASESOR_ASESORTMODIFICARASESORPMODIFICADIRECTOR = "Modifica director?";
    /** <code>asesorTMODIFICARASESORptUsuarioLDAP</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARASESOR_ASESORTMODIFICARASESORPTUSUARIOLDAP = "ptUsuarioLDAP";
    /** <code>asesorTMODIFICARASESORptUsuarioLDAP</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARASESOR_ASESORTMODIFICARASESORPTUSUARIOLDAP = "Clas_1431886233600794Ser_13Arg_8_Alias";
    /** <code>asesorTMODIFICARASESORptUsuarioLDAP</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARASESOR_ASESORTMODIFICARASESORPTUSUARIOLDAP = "Usuario LDAP";
    /** <code>asesorTMODIFICARASESORptEmail</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARASESOR_ASESORTMODIFICARASESORPTEMAIL = "ptEmail";
    /** <code>asesorTMODIFICARASESORptEmail</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARASESOR_ASESORTMODIFICARASESORPTEMAIL = "Clas_1431886233600794Ser_13Arg_9_Alias";
    /** <code>asesorTMODIFICARASESORptEmail</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARASESOR_ASESORTMODIFICARASESORPTEMAIL = "Email";
    /** <code>asesorTMODIFICARASESORpeIntegral</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARASESOR_ASESORTMODIFICARASESORPEINTEGRAL = "peIntegral";
    /** <code>asesorTMODIFICARASESORpeIntegral</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARASESOR_ASESORTMODIFICARASESORPEINTEGRAL = "Clas_1431886233600794Ser_13Arg_10_Alias";
    /** <code>asesorTMODIFICARASESORpeIntegral</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARASESOR_ASESORTMODIFICARASESORPEINTEGRAL = "Asesor Integral";
    /** <code>asesorTMODIFICARASESORptpVerDBasicosPersona</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARASESOR_ASESORTMODIFICARASESORPTPVERDBASICOSPERSONA = "pt_pVerDBasicosPersona";
    /** <code>asesorTMODIFICARASESORptpVerDBasicosPersona</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARASESOR_ASESORTMODIFICARASESORPTPVERDBASICOSPERSONA = "Clas_1431886233600794Ser_13Arg_16_Alias";
    /** <code>asesorTMODIFICARASESORptpVerDBasicosPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARASESOR_ASESORTMODIFICARASESORPTPVERDBASICOSPERSONA = "Ver datos básicos de usuarios";
    /** <code>asesorTMODIFICARASESORptpVerDocsPersona</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARASESOR_ASESORTMODIFICARASESORPTPVERDOCSPERSONA = "pt_pVerDocsPersona";
    /** <code>asesorTMODIFICARASESORptpVerDocsPersona</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARASESOR_ASESORTMODIFICARASESORPTPVERDOCSPERSONA = "Clas_1431886233600794Ser_13Arg_17_Alias";
    /** <code>asesorTMODIFICARASESORptpVerDocsPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARASESOR_ASESORTMODIFICARASESORPTPVERDOCSPERSONA = "Ver documentos persona";
    /** <code>asesorTMODIFICARASESORptpVerContratoNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARASESOR_ASESORTMODIFICARASESORPTPVERCONTRATONOVEDAD = "pt_pVerContratoNovedad";
    /** <code>asesorTMODIFICARASESORptpVerContratoNovedad</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARASESOR_ASESORTMODIFICARASESORPTPVERCONTRATONOVEDAD = "Clas_1431886233600794Ser_13Arg_18_Alias";
    /** <code>asesorTMODIFICARASESORptpVerContratoNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARASESOR_ASESORTMODIFICARASESORPTPVERCONTRATONOVEDAD = "Ver contrato en Novedades";
    // Service (TPOSPROCESOSINC)
    /** <code>TPOSPROCESOSINC</code> service id. */
    public static final String SERV_ID_TPOSPROCESOSINC = "Clas_1431886233600794Ser_18_Alias";
    /** <code>TPOSPROCESOSINC</code> service name. */
    public static final String SERV_NAME_TPOSPROCESOSINC = "TPOSPROCESOSINC";
    /** <code>TPOSPROCESOSINC</code> service alias. */
    public static final String SERV_ALIAS_TPOSPROCESOSINC = "Posproceso tras sincronización";
    /** Agents allowed to execute the service TPOSPROCESOSINC **/
    public static final String TPOSPROCESOSINC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>asesorTPOSPROCESOSINCpthisAsesor</code> inbound argument name. */
    public static final String ARG_NAME_TPOSPROCESOSINC_ASESORTPOSPROCESOSINCPTHISASESOR = "p_thisAsesor";
    /** <code>asesorTPOSPROCESOSINCpthisAsesor</code> inbound argument id. */
    public static final String ARG_ID_TPOSPROCESOSINC_ASESORTPOSPROCESOSINCPTHISASESOR = "Clas_1431886233600794Ser_18Arg_1_Alias";
    /** <code>asesorTPOSPROCESOSINCpthisAsesor</code> inbound argument alias. */
    public static final String ARG_ALIAS_TPOSPROCESOSINC_ASESORTPOSPROCESOSINCPTHISASESOR = "Asesor";
    /** <code>asesorTPOSPROCESOSINCpEsDirector</code> inbound argument name. */
    public static final String ARG_NAME_TPOSPROCESOSINC_ASESORTPOSPROCESOSINCPESDIRECTOR = "p_EsDirector";
    /** <code>asesorTPOSPROCESOSINCpEsDirector</code> inbound argument id. */
    public static final String ARG_ID_TPOSPROCESOSINC_ASESORTPOSPROCESOSINCPESDIRECTOR = "Clas_1431886233600794Ser_18Arg_3_Alias";
    /** <code>asesorTPOSPROCESOSINCpEsDirector</code> inbound argument alias. */
    public static final String ARG_ALIAS_TPOSPROCESOSINC_ASESORTPOSPROCESOSINCPESDIRECTOR = "Es director?";
    // Service (TMODIFICARASESORAGENCIA)
    /** <code>TMODIFICARASESORAGENCIA</code> service id. */
    public static final String SERV_ID_TMODIFICARASESORAGENCIA = "Clas_1431886233600794Ser_22_Alias";
    /** <code>TMODIFICARASESORAGENCIA</code> service name. */
    public static final String SERV_NAME_TMODIFICARASESORAGENCIA = "TMODIFICARASESORAGENCIA";
    /** <code>TMODIFICARASESORAGENCIA</code> service alias. */
    public static final String SERV_ALIAS_TMODIFICARASESORAGENCIA = "Modificar asesor";
    /** Agents allowed to execute the service TMODIFICARASESORAGENCIA **/
    public static final String TMODIFICARASESORAGENCIA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>asesorTMODIFICARASESORAGENCIApthisAsesor</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTHISASESOR = "p_thisAsesor";
    /** <code>asesorTMODIFICARASESORAGENCIApthisAsesor</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTHISASESOR = "Clas_1431886233600794Ser_22Arg_1_Alias";
    /** <code>asesorTMODIFICARASESORAGENCIApthisAsesor</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTHISASESOR = "Asesor";
    /** <code>asesorTMODIFICARASESORAGENCIAptpModDBasicosPersona</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPMODDBASICOSPERSONA = "pt_p_ModDBasicosPersona";
    /** <code>asesorTMODIFICARASESORAGENCIAptpModDBasicosPersona</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPMODDBASICOSPERSONA = "Clas_1431886233600794Ser_22Arg_2_Alias";
    /** <code>asesorTMODIFICARASESORAGENCIAptpModDBasicosPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPMODDBASICOSPERSONA = "Puede modificar persona";
    /** <code>asesorTMODIFICARASESORAGENCIApModificaDirector</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPMODIFICADIRECTOR = "pModificaDirector";
    /** <code>asesorTMODIFICARASESORAGENCIApModificaDirector</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPMODIFICADIRECTOR = "Clas_1431886233600794Ser_22Arg_3_Alias";
    /** <code>asesorTMODIFICARASESORAGENCIApModificaDirector</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPMODIFICADIRECTOR = "Modifica director?";
    /** <code>asesorTMODIFICARASESORAGENCIAptUsuarioLDAP</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTUSUARIOLDAP = "ptUsuarioLDAP";
    /** <code>asesorTMODIFICARASESORAGENCIAptUsuarioLDAP</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTUSUARIOLDAP = "Clas_1431886233600794Ser_22Arg_4_Alias";
    /** <code>asesorTMODIFICARASESORAGENCIAptUsuarioLDAP</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTUSUARIOLDAP = "Usuario LDAP";
    /** <code>asesorTMODIFICARASESORAGENCIAptEmail</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTEMAIL = "ptEmail";
    /** <code>asesorTMODIFICARASESORAGENCIAptEmail</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTEMAIL = "Clas_1431886233600794Ser_22Arg_5_Alias";
    /** <code>asesorTMODIFICARASESORAGENCIAptEmail</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTEMAIL = "Email";
    /** <code>asesorTMODIFICARASESORAGENCIAptpPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPPRIMERNOMBRE = "pt_p_PrimerNombre";
    /** <code>asesorTMODIFICARASESORAGENCIAptpPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPPRIMERNOMBRE = "Clas_1431886233600794Ser_22Arg_6_Alias";
    /** <code>asesorTMODIFICARASESORAGENCIAptpPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPPRIMERNOMBRE = "Primer nombre";
    /** <code>asesorTMODIFICARASESORAGENCIAptpSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPSEGUNDONOMBRE = "pt_p_SegundoNombre";
    /** <code>asesorTMODIFICARASESORAGENCIAptpSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPSEGUNDONOMBRE = "Clas_1431886233600794Ser_22Arg_7_Alias";
    /** <code>asesorTMODIFICARASESORAGENCIAptpSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPSEGUNDONOMBRE = "Segundo nombre";
    /** <code>asesorTMODIFICARASESORAGENCIAptpPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPPRIMERAPELLIDO = "pt_p_PrimerApellido";
    /** <code>asesorTMODIFICARASESORAGENCIAptpPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPPRIMERAPELLIDO = "Clas_1431886233600794Ser_22Arg_8_Alias";
    /** <code>asesorTMODIFICARASESORAGENCIAptpPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPPRIMERAPELLIDO = "Primer apellido";
    /** <code>asesorTMODIFICARASESORAGENCIAptpSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPSEGUNDOAPELLIDO = "pt_p_SegundoApellido";
    /** <code>asesorTMODIFICARASESORAGENCIAptpSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPSEGUNDOAPELLIDO = "Clas_1431886233600794Ser_22Arg_9_Alias";
    /** <code>asesorTMODIFICARASESORAGENCIAptpSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPSEGUNDOAPELLIDO = "Segundo apellido";
    /** <code>asesorTMODIFICARASESORAGENCIAptpeNumUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPENUMUSUARIO = "pt_peNumUsuario";
    /** <code>asesorTMODIFICARASESORAGENCIAptpeNumUsuario</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPENUMUSUARIO = "Clas_1431886233600794Ser_22Arg_12_Alias";
    /** <code>asesorTMODIFICARASESORAGENCIAptpeNumUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPENUMUSUARIO = "Usuario";
    /** <code>asesorTMODIFICARASESORAGENCIAptpEsDirector</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPESDIRECTOR = "pt_p_EsDirector";
    /** <code>asesorTMODIFICARASESORAGENCIAptpEsDirector</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPESDIRECTOR = "Clas_1431886233600794Ser_22Arg_13_Alias";
    /** <code>asesorTMODIFICARASESORAGENCIAptpEsDirector</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPESDIRECTOR = "Es director?";
    /** <code>asesorTMODIFICARASESORAGENCIAptpeCodJefe</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPECODJEFE = "pt_peCodJefe";
    /** <code>asesorTMODIFICARASESORAGENCIAptpeCodJefe</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPECODJEFE = "Clas_1431886233600794Ser_22Arg_14_Alias";
    /** <code>asesorTMODIFICARASESORAGENCIAptpeCodJefe</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPECODJEFE = "Cod. Jefe";
    /** <code>asesorTMODIFICARASESORAGENCIAptSucursal</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTSUCURSAL = "ptSucursal";
    /** <code>asesorTMODIFICARASESORAGENCIAptSucursal</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTSUCURSAL = "Clas_1431886233600794Ser_22Arg_15_Alias";
    /** <code>asesorTMODIFICARASESORAGENCIAptSucursal</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTSUCURSAL = "Sucursal";
    /** <code>asesorTMODIFICARASESORAGENCIAptTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTTIPOIDENTIFICACION = "ptTipoIdentificacion";
    /** <code>asesorTMODIFICARASESORAGENCIAptTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTTIPOIDENTIFICACION = "Clas_1431886233600794Ser_22Arg_16_Alias";
    /** <code>asesorTMODIFICARASESORAGENCIAptTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTTIPOIDENTIFICACION = "Tipo Identificación";
    /** <code>asesorTMODIFICARASESORAGENCIAptNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTNUMIDENTIFICACION = "ptNumIdentificacion";
    /** <code>asesorTMODIFICARASESORAGENCIAptNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTNUMIDENTIFICACION = "Clas_1431886233600794Ser_22Arg_17_Alias";
    /** <code>asesorTMODIFICARASESORAGENCIAptNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTNUMIDENTIFICACION = "Nº Identificación";
    /** <code>asesorTMODIFICARASESORAGENCIAptpVerDBasicosPersona</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPVERDBASICOSPERSONA = "pt_pVerDBasicosPersona";
    /** <code>asesorTMODIFICARASESORAGENCIAptpVerDBasicosPersona</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPVERDBASICOSPERSONA = "Clas_1431886233600794Ser_22Arg_18_Alias";
    /** <code>asesorTMODIFICARASESORAGENCIAptpVerDBasicosPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPVERDBASICOSPERSONA = "Ver datos básicos de usuarios";
    /** <code>asesorTMODIFICARASESORAGENCIAptpVerDocsPersona</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPVERDOCSPERSONA = "pt_pVerDocsPersona";
    /** <code>asesorTMODIFICARASESORAGENCIAptpVerDocsPersona</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPVERDOCSPERSONA = "Clas_1431886233600794Ser_22Arg_19_Alias";
    /** <code>asesorTMODIFICARASESORAGENCIAptpVerDocsPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPVERDOCSPERSONA = "Ver documentos persona";
    /** <code>asesorTMODIFICARASESORAGENCIAptpVerContratoNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPVERCONTRATONOVEDAD = "pt_pVerContratoNovedad";
    /** <code>asesorTMODIFICARASESORAGENCIAptpVerContratoNovedad</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPVERCONTRATONOVEDAD = "Clas_1431886233600794Ser_22Arg_20_Alias";
    /** <code>asesorTMODIFICARASESORAGENCIAptpVerContratoNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARASESORAGENCIA_ASESORTMODIFICARASESORAGENCIAPTPVERCONTRATONOVEDAD = "Ver contrato en Novedades";
    // Service (TDELETE)
    /** <code>TDELETE</code> service id. */
    public static final String SERV_ID_TDELETE = "Clas_1431886233600794Ser_23_Alias";
    /** <code>TDELETE</code> service name. */
    public static final String SERV_NAME_TDELETE = "TDELETE";
    /** <code>TDELETE</code> service alias. */
    public static final String SERV_ALIAS_TDELETE = "Eliminar";
    /** Agents allowed to execute the service TDELETE **/
    public static final String TDELETE_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>TDELETE</code> precondition 0 id. */
    public static final String PRE_ID_TDELETE_0 = "Clas_1431886233600794Pre_1_MsgError";
    /** <code>TDELETE</code> precondition 1 id. */
    public static final String PRE_ID_TDELETE_1 = "Clas_1431886233600794Pre_2_MsgError";
    // Inbound arguments
    /** <code>asesorTDELETEpthisAsesor</code> inbound argument name. */
    public static final String ARG_NAME_TDELETE_ASESORTDELETEPTHISASESOR = "p_thisAsesor";
    /** <code>asesorTDELETEpthisAsesor</code> inbound argument id. */
    public static final String ARG_ID_TDELETE_ASESORTDELETEPTHISASESOR = "Clas_1431886233600794Ser_23Arg_1_Alias";
    /** <code>asesorTDELETEpthisAsesor</code> inbound argument alias. */
    public static final String ARG_ALIAS_TDELETE_ASESORTDELETEPTHISASESOR = "Asesor";
    // Service (TMODVISIBILIDAD)
    /** <code>TMODVISIBILIDAD</code> service id. */
    public static final String SERV_ID_TMODVISIBILIDAD = "Clas_1431886233600794Ser_26_Alias";
    /** <code>TMODVISIBILIDAD</code> service name. */
    public static final String SERV_NAME_TMODVISIBILIDAD = "TMODVISIBILIDAD";
    /** <code>TMODVISIBILIDAD</code> service alias. */
    public static final String SERV_ALIAS_TMODVISIBILIDAD = "TMODVISIBILIDAD";
    /** Agents allowed to execute the service TMODVISIBILIDAD **/
    public static final String TMODVISIBILIDAD_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>asesorTMODVISIBILIDADpthisAsesor</code> inbound argument name. */
    public static final String ARG_NAME_TMODVISIBILIDAD_ASESORTMODVISIBILIDADPTHISASESOR = "p_thisAsesor";
    /** <code>asesorTMODVISIBILIDADpthisAsesor</code> inbound argument id. */
    public static final String ARG_ID_TMODVISIBILIDAD_ASESORTMODVISIBILIDADPTHISASESOR = "Clas_1431886233600794Ser_26Arg_2_Alias";
    /** <code>asesorTMODVISIBILIDADpthisAsesor</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODVISIBILIDAD_ASESORTMODVISIBILIDADPTHISASESOR = "Asesor";
    /** <code>asesorTMODVISIBILIDADptpVerDatosPersona</code> inbound argument name. */
    public static final String ARG_NAME_TMODVISIBILIDAD_ASESORTMODVISIBILIDADPTPVERDATOSPERSONA = "pt_pVerDatosPersona";
    /** <code>asesorTMODVISIBILIDADptpVerDatosPersona</code> inbound argument id. */
    public static final String ARG_ID_TMODVISIBILIDAD_ASESORTMODVISIBILIDADPTPVERDATOSPERSONA = "Clas_1431886233600794Ser_26Arg_3_Alias";
    /** <code>asesorTMODVISIBILIDADptpVerDatosPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODVISIBILIDAD_ASESORTMODVISIBILIDADPTPVERDATOSPERSONA = "Ver datos básicos de usuarios";
    /** <code>asesorTMODVISIBILIDADptpVerDocsPersona</code> inbound argument name. */
    public static final String ARG_NAME_TMODVISIBILIDAD_ASESORTMODVISIBILIDADPTPVERDOCSPERSONA = "pt_pVerDocsPersona";
    /** <code>asesorTMODVISIBILIDADptpVerDocsPersona</code> inbound argument id. */
    public static final String ARG_ID_TMODVISIBILIDAD_ASESORTMODVISIBILIDADPTPVERDOCSPERSONA = "Clas_1431886233600794Ser_26Arg_4_Alias";
    /** <code>asesorTMODVISIBILIDADptpVerDocsPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODVISIBILIDAD_ASESORTMODVISIBILIDADPTPVERDOCSPERSONA = "Ver documentos persona";
    /** <code>asesorTMODVISIBILIDADptpVerContratoNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TMODVISIBILIDAD_ASESORTMODVISIBILIDADPTPVERCONTRATONOVEDAD = "pt_pVerContratoNovedad";
    /** <code>asesorTMODVISIBILIDADptpVerContratoNovedad</code> inbound argument id. */
    public static final String ARG_ID_TMODVISIBILIDAD_ASESORTMODVISIBILIDADPTPVERCONTRATONOVEDAD = "Clas_1431886233600794Ser_26Arg_5_Alias";
    /** <code>asesorTMODVISIBILIDADptpVerContratoNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODVISIBILIDAD_ASESORTMODVISIBILIDADPTPVERCONTRATONOVEDAD = "Ver contrato en Novedades";
    // Service (TCARGARDOMINIOPLAN)
    /** <code>TCARGARDOMINIOPLAN</code> service id. */
    public static final String SERV_ID_TCARGARDOMINIOPLAN = "Clas_1431886233600794Ser_27_Alias";
    /** <code>TCARGARDOMINIOPLAN</code> service name. */
    public static final String SERV_NAME_TCARGARDOMINIOPLAN = "TCARGARDOMINIOPLAN";
    /** <code>TCARGARDOMINIOPLAN</code> service alias. */
    public static final String SERV_ALIAS_TCARGARDOMINIOPLAN = "TCARGARDOMINIOPLAN";
    /** Agents allowed to execute the service TCARGARDOMINIOPLAN **/
    public static final String TCARGARDOMINIOPLAN_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>asesorTCARGARDOMINIOPLANpthisAsesor</code> inbound argument name. */
    public static final String ARG_NAME_TCARGARDOMINIOPLAN_ASESORTCARGARDOMINIOPLANPTHISASESOR = "p_thisAsesor";
    /** <code>asesorTCARGARDOMINIOPLANpthisAsesor</code> inbound argument id. */
    public static final String ARG_ID_TCARGARDOMINIOPLAN_ASESORTCARGARDOMINIOPLANPTHISASESOR = "Clas_1431886233600794Ser_27Arg_1_Alias";
    /** <code>asesorTCARGARDOMINIOPLANpthisAsesor</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCARGARDOMINIOPLAN_ASESORTCARGARDOMINIOPLANPTHISASESOR = "Asesor";
    /** <code>asesorTCARGARDOMINIOPLANptCodLegalProducto</code> inbound argument name. */
    public static final String ARG_NAME_TCARGARDOMINIOPLAN_ASESORTCARGARDOMINIOPLANPTCODLEGALPRODUCTO = "ptCodLegalProducto";
    /** <code>asesorTCARGARDOMINIOPLANptCodLegalProducto</code> inbound argument id. */
    public static final String ARG_ID_TCARGARDOMINIOPLAN_ASESORTCARGARDOMINIOPLANPTCODLEGALPRODUCTO = "Clas_1431886233600794Ser_27Arg_3_Alias";
    /** <code>asesorTCARGARDOMINIOPLANptCodLegalProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCARGARDOMINIOPLAN_ASESORTCARGARDOMINIOPLANPTCODLEGALPRODUCTO = "ptCodLegalProducto";
    /** <code>asesorTCARGARDOMINIOPLANptCodLegalPlan</code> inbound argument name. */
    public static final String ARG_NAME_TCARGARDOMINIOPLAN_ASESORTCARGARDOMINIOPLANPTCODLEGALPLAN = "ptCodLegalPlan";
    /** <code>asesorTCARGARDOMINIOPLANptCodLegalPlan</code> inbound argument id. */
    public static final String ARG_ID_TCARGARDOMINIOPLAN_ASESORTCARGARDOMINIOPLANPTCODLEGALPLAN = "Clas_1431886233600794Ser_27Arg_4_Alias";
    /** <code>asesorTCARGARDOMINIOPLANptCodLegalPlan</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCARGARDOMINIOPLAN_ASESORTCARGARDOMINIOPLANPTCODLEGALPLAN = "ptCodLegalPlan";
    /** <code>asesorTCARGARDOMINIOPLANptAccion</code> inbound argument name. */
    public static final String ARG_NAME_TCARGARDOMINIOPLAN_ASESORTCARGARDOMINIOPLANPTACCION = "ptAccion";
    /** <code>asesorTCARGARDOMINIOPLANptAccion</code> inbound argument id. */
    public static final String ARG_ID_TCARGARDOMINIOPLAN_ASESORTCARGARDOMINIOPLANPTACCION = "Clas_1431886233600794Ser_27Arg_5_Alias";
    /** <code>asesorTCARGARDOMINIOPLANptAccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCARGARDOMINIOPLAN_ASESORTCARGARDOMINIOPLANPTACCION = "ptAccion";
    // Service (TLOGCAMBIOS)
    /** <code>TLOGCAMBIOS</code> service id. */
    public static final String SERV_ID_TLOGCAMBIOS = "Clas_1431886233600794Ser_28_Alias";
    /** <code>TLOGCAMBIOS</code> service name. */
    public static final String SERV_NAME_TLOGCAMBIOS = "TLOGCAMBIOS";
    /** <code>TLOGCAMBIOS</code> service alias. */
    public static final String SERV_ALIAS_TLOGCAMBIOS = "TLOGCAMBIOS";
    /** Agents allowed to execute the service TLOGCAMBIOS **/
    public static final String TLOGCAMBIOS_SRVAGENTS = "";
    // Inbound arguments
    /** <code>asesorTLOGCAMBIOSpthisAsesor</code> inbound argument name. */
    public static final String ARG_NAME_TLOGCAMBIOS_ASESORTLOGCAMBIOSPTHISASESOR = "p_thisAsesor";
    /** <code>asesorTLOGCAMBIOSpthisAsesor</code> inbound argument id. */
    public static final String ARG_ID_TLOGCAMBIOS_ASESORTLOGCAMBIOSPTHISASESOR = "Clas_1431886233600794Ser_28Arg_1_Alias";
    /** <code>asesorTLOGCAMBIOSpthisAsesor</code> inbound argument alias. */
    public static final String ARG_ALIAS_TLOGCAMBIOS_ASESORTLOGCAMBIOSPTHISASESOR = "Asesor";
    /** <code>asesorTLOGCAMBIOSptpVerDatosPersona</code> inbound argument name. */
    public static final String ARG_NAME_TLOGCAMBIOS_ASESORTLOGCAMBIOSPTPVERDATOSPERSONA = "pt_pVerDatosPersona";
    /** <code>asesorTLOGCAMBIOSptpVerDatosPersona</code> inbound argument id. */
    public static final String ARG_ID_TLOGCAMBIOS_ASESORTLOGCAMBIOSPTPVERDATOSPERSONA = "Clas_1431886233600794Ser_28Arg_2_Alias";
    /** <code>asesorTLOGCAMBIOSptpVerDatosPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TLOGCAMBIOS_ASESORTLOGCAMBIOSPTPVERDATOSPERSONA = "Ver datos básicos de usuarios";
    /** <code>asesorTLOGCAMBIOSptpVerDocsPersona</code> inbound argument name. */
    public static final String ARG_NAME_TLOGCAMBIOS_ASESORTLOGCAMBIOSPTPVERDOCSPERSONA = "pt_pVerDocsPersona";
    /** <code>asesorTLOGCAMBIOSptpVerDocsPersona</code> inbound argument id. */
    public static final String ARG_ID_TLOGCAMBIOS_ASESORTLOGCAMBIOSPTPVERDOCSPERSONA = "Clas_1431886233600794Ser_28Arg_3_Alias";
    /** <code>asesorTLOGCAMBIOSptpVerDocsPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TLOGCAMBIOS_ASESORTLOGCAMBIOSPTPVERDOCSPERSONA = "Ver documentos persona";
    /** <code>asesorTLOGCAMBIOSptpVerContratoNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TLOGCAMBIOS_ASESORTLOGCAMBIOSPTPVERCONTRATONOVEDAD = "pt_pVerContratoNovedad";
    /** <code>asesorTLOGCAMBIOSptpVerContratoNovedad</code> inbound argument id. */
    public static final String ARG_ID_TLOGCAMBIOS_ASESORTLOGCAMBIOSPTPVERCONTRATONOVEDAD = "Clas_1431886233600794Ser_28Arg_4_Alias";
    /** <code>asesorTLOGCAMBIOSptpVerContratoNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TLOGCAMBIOS_ASESORTLOGCAMBIOSPTPVERCONTRATONOVEDAD = "Ver contrato en Novedades";
    /** <code>asesorTLOGCAMBIOSptAccesoValidador</code> inbound argument name. */
    public static final String ARG_NAME_TLOGCAMBIOS_ASESORTLOGCAMBIOSPTACCESOVALIDADOR = "ptAccesoValidador";
    /** <code>asesorTLOGCAMBIOSptAccesoValidador</code> inbound argument id. */
    public static final String ARG_ID_TLOGCAMBIOS_ASESORTLOGCAMBIOSPTACCESOVALIDADOR = "Clas_1431886233600794Ser_28Arg_5_Alias";
    /** <code>asesorTLOGCAMBIOSptAccesoValidador</code> inbound argument alias. */
    public static final String ARG_ALIAS_TLOGCAMBIOS_ASESORTLOGCAMBIOSPTACCESOVALIDADOR = "Ver contrato en Novedades";
    // Service (changePassword)
    /** <code>changePassword</code> service id. */
    public static final String SERV_ID_CHANGEP4SSW0RD = "Clas_1431886233600794Ser_4B_Alias";
    /** <code>changePassword</code> service name. */
    public static final String SERV_NAME_CHANGEP4SSW0RD = "changePassword";
    /** <code>changePassword</code> service alias. */
    public static final String SERV_ALIAS_CHANGEP4SSW0RD = "Change Password";
    /** Agents allowed to execute the service changePassword **/
    public static final String CHANGEP4SSW0RD_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    // Inbound arguments
    /** <code>asesorchangePasswordpthisAdmin</code> inbound argument name. */
    public static final String ARG_NAME_CHANGEP4SSW0RD_ASESORCHANGEP4SSW0RDPTHISADMIN = "p_thisAdmin";
    /** <code>asesorchangePasswordpthisAdmin</code> inbound argument id. */
    public static final String ARG_ID_CHANGEP4SSW0RD_ASESORCHANGEP4SSW0RDPTHISADMIN = "Clas_1431626842112800Ser_4Arg_1B_Alias";
    /** <code>asesorchangePasswordpthisAdmin</code> inbound argument alias. */
    public static final String ARG_ALIAS_CHANGEP4SSW0RD_ASESORCHANGEP4SSW0RDPTHISADMIN = "Usuario";
    /** <code>asesorchangePasswordpOldPassword</code> inbound argument name. */
    public static final String ARG_NAME_CHANGEP4SSW0RD_ASESORCHANGEP4SSW0RDPOLDP4SSW0RD = "p_OldPassword";
    /** <code>asesorchangePasswordpOldPassword</code> inbound argument id. */
    public static final String ARG_ID_CHANGEP4SSW0RD_ASESORCHANGEP4SSW0RDPOLDP4SSW0RD = "Clas_1431626842112800Ser_4Arg_2B_Alias";
    /** <code>asesorchangePasswordpOldPassword</code> inbound argument alias. */
    public static final String ARG_ALIAS_CHANGEP4SSW0RD_ASESORCHANGEP4SSW0RDPOLDP4SSW0RD = "Old password";
    /** <code>asesorchangePasswordpNewPassword</code> inbound argument name. */
    public static final String ARG_NAME_CHANGEP4SSW0RD_ASESORCHANGEP4SSW0RDPNEWP4SSW0RD = "p_NewPassword";
    /** <code>asesorchangePasswordpNewPassword</code> inbound argument id. */
    public static final String ARG_ID_CHANGEP4SSW0RD_ASESORCHANGEP4SSW0RDPNEWP4SSW0RD = "Clas_1431626842112800Ser_4Arg_2B_Alias";
    /** <code>asesorchangePasswordpNewPassword</code> inbound argument alias. */
    public static final String ARG_ALIAS_CHANGEP4SSW0RD_ASESORCHANGEP4SSW0RDPNEWP4SSW0RD = "Nueva contraseña";

    public static final String FILTER_NAME_FASESORES = "F_Asesores";
    public static final String VAR_NAME_FASESORES_VUSUARIO = "vUsuario";
    public static final String VAR_NAME_FASESORES_VPRIMERNOMBRE = "vPrimerNombre";
    public static final String VAR_NAME_FASESORES_VSEGUNDONOMBRE = "vSegundoNombre";
    public static final String VAR_NAME_FASESORES_VPRIMERAPELLIDO = "vPrimerApellido";
    public static final String VAR_NAME_FASESORES_VSEGUNDOAPELLIDO = "vSegundoApellido";
    public static final String FILTER_NAME_FDIRECTORES = "F_Directores";
    public static final String VAR_NAME_FDIRECTORES_VUSUARIO = "vUsuario";
    public static final String VAR_NAME_FDIRECTORES_VPRIMERNOMBRE = "vPrimerNombre";
    public static final String VAR_NAME_FDIRECTORES_VSEGUNDONOMBRE = "vSegundoNombre";
    public static final String VAR_NAME_FDIRECTORES_VPRIMERAPELLIDO = "vPrimerApellido";
    public static final String VAR_NAME_FDIRECTORES_VSEGUNDOAPELLIDO = "vSegundoApellido";
    public static final String FILTER_NAME_FASESORESAGENCIA = "F_AsesoresAgencia";
    public static final String VAR_NAME_FASESORESAGENCIA_VUSUARIO = "vUsuario";
    public static final String VAR_NAME_FASESORESAGENCIA_VPRIMERNOMBRE = "vPrimerNombre";
    public static final String VAR_NAME_FASESORESAGENCIA_VSEGUNDONOMBRE = "vSegundoNombre";
    public static final String VAR_NAME_FASESORESAGENCIA_VPRIMERAPELLIDO = "vPrimerApellido";
    public static final String VAR_NAME_FASESORESAGENCIA_VSEGUNDOAPELLIDO = "vSegundoApellido";
    public static final String FILTER_NAME_IFASESORPORUSUARIONOMANUAL = "iF_Asesor_PorUsuarioNoManual";
    public static final String VAR_NAME_IFASESORPORUSUARIONOMANUAL_VFUSUARIO = "vfUsuario";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_ASESORMODDBASICOSPERSONA.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_ASESORMODIFICADIRECTOR.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_ASESORESDIRECTOR.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_ASESORNUMIDENTIFICACION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_ASESORESINTEGRAL.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_ASESORVERDBASICOSPERSONA.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_ASESORVERDOCIDENTIFICACIONPERSONA.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_ASESORVERCONTRATONOVEDAD.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_ASESORCANALCOMERCIAL.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_ASESORCARGO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_ASESORESTADO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_ASESORACCESOVALIDADORUSUARIOS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.putAll(FuncionarioConstants.ATTRIBUTE_TYPES);
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
        attributeAgents.putAll(FuncionarioConstants.ATTRIBUTE_AGENTS);
    	attributeAgents.put(ATTR_NAME_ASESORMODDBASICOSPERSONA.toUpperCase(), ASESORMODDBASICOSPERSONA_AGENTS);
    	attributeAgents.put(ATTR_NAME_ASESORMODIFICADIRECTOR.toUpperCase(), ASESORMODIFICADIRECTOR_AGENTS);
    	attributeAgents.put(ATTR_NAME_ASESORESDIRECTOR.toUpperCase(), ASESORESDIRECTOR_AGENTS);
    	attributeAgents.put(ATTR_NAME_ASESORNUMIDENTIFICACION.toUpperCase(), ASESORNUMIDENTIFICACION_AGENTS);
    	attributeAgents.put(ATTR_NAME_ASESORESINTEGRAL.toUpperCase(), ASESORESINTEGRAL_AGENTS);
    	attributeAgents.put(ATTR_NAME_ASESORVERDBASICOSPERSONA.toUpperCase(), ASESORVERDBASICOSPERSONA_AGENTS);
    	attributeAgents.put(ATTR_NAME_ASESORVERDOCIDENTIFICACIONPERSONA.toUpperCase(), ASESORVERDOCIDENTIFICACIONPERSONA_AGENTS);
    	attributeAgents.put(ATTR_NAME_ASESORVERCONTRATONOVEDAD.toUpperCase(), ASESORVERCONTRATONOVEDAD_AGENTS);
    	attributeAgents.put(ATTR_NAME_ASESORCANALCOMERCIAL.toUpperCase(), ASESORCANALCOMERCIAL_AGENTS);
    	attributeAgents.put(ATTR_NAME_ASESORCARGO.toUpperCase(), ASESORCARGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_ASESORESTADO.toUpperCase(), ASESORESTADO_AGENTS);
    	attributeAgents.put(ATTR_NAME_ASESORACCESOVALIDADORUSUARIOS.toUpperCase(), ASESORACCESOVALIDADORUSUARIOS_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_TIPOIDENTIFICACION.toUpperCase(), TIPOIDENTIFICACION_AGENTS);
        roleAgents.put(FuncionarioConstants.ROLE_NAME_ROL.toUpperCase(), FuncionarioConstants.ROL_AGENTS);
        roleAgents.put(FuncionarioConstants.ROLE_NAME_SUCURSAL.toUpperCase(), FuncionarioConstants.SUCURSAL_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'Asesor', it returns the identification keys
     * - If className is a facet of the inheritance net of 'Asesor', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_FUNCIONARIOID);
        }
        // Facet 'Funcionario'
        if (FuncionarioConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_FUNCIONARIOID);
        }
        // Facet 'Admin'
        if (AdminConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_FUNCIONARIOID);
        }
        // Facet 'SuperAdmin'
        if (SuperAdminConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_FUNCIONARIOID);
        }
        // Facet 'AreaMedica'
        if (AreaMedicaConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_FUNCIONARIOID);
        }
        // Facet 'Afiliaciones'
        if (AfiliacionesConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_FUNCIONARIOID);
        }
        // Facet 'RespRegional'
        if (RespRegionalConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_FUNCIONARIOID);
        }
        // Facet 'Gestor'
        if (GestorConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_FUNCIONARIOID);
        }
        // Facet 'MesaDeApoyo'
        if (MesaDeApoyoConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_FUNCIONARIOID);
        }
        // Facet 'Asesor' (This facet)
        if (AsesorConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_FUNCIONARIOID);
        }
        return returnList;
    }
}
