package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>Funcionario</code> model class.
 */
public final class FuncionarioConstants {

    private FuncionarioConstants() {

    }

    // Class
    /** <code>Funcionario</code> class id. */
    public static final String CLASS_ID = "Clas_1431626842112800_Alias";
    /** <code>Funcionario</code> class name. */
    public static final String CLASS_NAME = "Funcionario";
    /** <code>Funcionario</code> class alias. */
    public static final String CLASS_ALIAS = "Usuario";
    /** <code>Funcionario</code> class table name. */
    public static final String TBL_NAME = "Funcionario";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "funcionarioId,rolIdentificador,sucursalCodigo,passWord,funcionarioManual,funcionarioUsuario,funcionarioPrimerNombre,funcionarioSegundoNombre,funcionarioPrimerApellido,funcionarioSegundoApellido,funcionarioUsuarioLDAP,funcionarioEmail,funcionarioCodJefe,funcionarioDisponible,funcionarioNumSolNoTerminadas,funcionarioIdSesion";

    public static final String DSICAGENTE = "IC_Agente";
    public static final String DSDSAGENTEPIU = "DS_Agente_PIU";
    public static final String DSDSFUNCIONARIODREPORTES = "DS_Funcionario_D_Reportes";
    public static final String DSDSFUNCIONARIODGRUPO = "DS_Funcionario_D_Grupo";
    public static final String DSICUSUARIOLDAP = "IC_UsuarioLDAP";
    
    // Facet (Admin)
    /** <code>Admin</code> facet sequence. */
    public static final String CLASS_FACETS_ADMIN = AdminConstants.CLASS_NAME;
	
    public static final String CLASS_FACET_GETTER_ADMIN = Constants.CHILD_PREFIX + AdminConstants.CLASS_NAME;
    // Facet (SuperAdmin)
    /** <code>SuperAdmin</code> facet sequence. */
    public static final String CLASS_FACETS_SUPERADMIN = SuperAdminConstants.CLASS_NAME;
	
    public static final String CLASS_FACET_GETTER_SUPERADMIN = Constants.CHILD_PREFIX + SuperAdminConstants.CLASS_NAME;
    // Facet (Asesor)
    /** <code>Asesor</code> facet sequence. */
    public static final String CLASS_FACETS_ASESOR = AsesorConstants.CLASS_NAME;
	
    public static final String CLASS_FACET_GETTER_ASESOR = Constants.CHILD_PREFIX + AsesorConstants.CLASS_NAME;
    // Facet (AreaMedica)
    /** <code>AreaMedica</code> facet sequence. */
    public static final String CLASS_FACETS_AREAMEDICA = AreaMedicaConstants.CLASS_NAME;
	
    public static final String CLASS_FACET_GETTER_AREAMEDICA = Constants.CHILD_PREFIX + AreaMedicaConstants.CLASS_NAME;
    // Facet (Afiliaciones)
    /** <code>Afiliaciones</code> facet sequence. */
    public static final String CLASS_FACETS_AFILIACIONES = AfiliacionesConstants.CLASS_NAME;
	
    public static final String CLASS_FACET_GETTER_AFILIACIONES = Constants.CHILD_PREFIX + AfiliacionesConstants.CLASS_NAME;
    // Facet (RespRegional)
    /** <code>RespRegional</code> facet sequence. */
    public static final String CLASS_FACETS_RESPREGIONAL = RespRegionalConstants.CLASS_NAME;
	
    public static final String CLASS_FACET_GETTER_RESPREGIONAL = Constants.CHILD_PREFIX + RespRegionalConstants.CLASS_NAME;
    // Facet (Gestor)
    /** <code>Gestor</code> facet sequence. */
    public static final String CLASS_FACETS_GESTOR = GestorConstants.CLASS_NAME;
	
    public static final String CLASS_FACET_GETTER_GESTOR = Constants.CHILD_PREFIX + GestorConstants.CLASS_NAME;
    // Facet (MesaDeApoyo)
    /** <code>MesaDeApoyo</code> facet sequence. */
    public static final String CLASS_FACETS_MESADEAPOYO = MesaDeApoyoConstants.CLASS_NAME;
	
    public static final String CLASS_FACET_GETTER_MESADEAPOYO = Constants.CHILD_PREFIX + MesaDeApoyoConstants.CLASS_NAME;

    // Attribute (funcionarioId)
    /** <code>funcionarioId</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIOID = "Clas_1431626842112800Atr_10_Alias";
    /** <code>funcionarioId</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIOID = "funcionarioId";
    /** <code>funcionarioId</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIOID = "Id";

    /** <code>funcionarioId</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIOID = "";
    /** Agents allowed to view the attribute funcionarioId **/
    public static final String FUNCIONARIOID_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (funcionarioManual)
    /** <code>funcionarioManual</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIOMANUAL = "Clas_1431626842112800Atr_11_Alias";
    /** <code>funcionarioManual</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIOMANUAL = "funcionarioManual";
    /** <code>funcionarioManual</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIOMANUAL = "Manual";

    /** <code>funcionarioManual</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIOMANUAL = "";
    /** Agents allowed to view the attribute funcionarioManual **/
    public static final String FUNCIONARIOMANUAL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (funcionarioUsuario)
    /** <code>funcionarioUsuario</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIOUSUARIO = "Clas_1431626842112800Atr_1_Alias";
    /** <code>funcionarioUsuario</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIOUSUARIO = "funcionarioUsuario";
    /** <code>funcionarioUsuario</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIOUSUARIO = "Usuario";

    /** <code>funcionarioUsuario</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIOUSUARIO = "";
    /** Agents allowed to view the attribute funcionarioUsuario **/
    public static final String FUNCIONARIOUSUARIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (funcionarioPrimerNombre)
    /** <code>funcionarioPrimerNombre</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIOPRIMERNOMBRE = "Clas_1431626842112800Atr_2_Alias";
    /** <code>funcionarioPrimerNombre</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIOPRIMERNOMBRE = "funcionarioPrimerNombre";
    /** <code>funcionarioPrimerNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIOPRIMERNOMBRE = "Primer nombre";

    /** <code>funcionarioPrimerNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIOPRIMERNOMBRE = "";
    /** Agents allowed to view the attribute funcionarioPrimerNombre **/
    public static final String FUNCIONARIOPRIMERNOMBRE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (funcionarioSegundoNombre)
    /** <code>funcionarioSegundoNombre</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIOSEGUNDONOMBRE = "Clas_1431626842112800Atr_3_Alias";
    /** <code>funcionarioSegundoNombre</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIOSEGUNDONOMBRE = "funcionarioSegundoNombre";
    /** <code>funcionarioSegundoNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIOSEGUNDONOMBRE = "Segundo nombre";

    /** <code>funcionarioSegundoNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIOSEGUNDONOMBRE = "";
    /** Agents allowed to view the attribute funcionarioSegundoNombre **/
    public static final String FUNCIONARIOSEGUNDONOMBRE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (funcionarioPrimerApellido)
    /** <code>funcionarioPrimerApellido</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIOPRIMERAPELLIDO = "Clas_1431626842112800Atr_4_Alias";
    /** <code>funcionarioPrimerApellido</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIOPRIMERAPELLIDO = "funcionarioPrimerApellido";
    /** <code>funcionarioPrimerApellido</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIOPRIMERAPELLIDO = "Primer apellido";

    /** <code>funcionarioPrimerApellido</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIOPRIMERAPELLIDO = "";
    /** Agents allowed to view the attribute funcionarioPrimerApellido **/
    public static final String FUNCIONARIOPRIMERAPELLIDO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (funcionarioSegundoApellido)
    /** <code>funcionarioSegundoApellido</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIOSEGUNDOAPELLIDO = "Clas_1431626842112800Atr_5_Alias";
    /** <code>funcionarioSegundoApellido</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIOSEGUNDOAPELLIDO = "funcionarioSegundoApellido";
    /** <code>funcionarioSegundoApellido</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIOSEGUNDOAPELLIDO = "Segundo apellido";

    /** <code>funcionarioSegundoApellido</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIOSEGUNDOAPELLIDO = "";
    /** Agents allowed to view the attribute funcionarioSegundoApellido **/
    public static final String FUNCIONARIOSEGUNDOAPELLIDO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (funcionariodrvNombreCompleto)
    /** <code>funcionariodrvNombreCompleto</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIODRVNOMBRECOMPLETO = "Clas_1431626842112800Atr_6_Alias";
    /** <code>funcionariodrvNombreCompleto</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIODRVNOMBRECOMPLETO = "funcionariodrvNombreCompleto";
    /** <code>funcionariodrvNombreCompleto</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIODRVNOMBRECOMPLETO = "Nombre completo";

    /** <code>funcionariodrvNombreCompleto</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIODRVNOMBRECOMPLETO = "";
    /** Agents allowed to view the attribute funcionariodrvNombreCompleto **/
    public static final String FUNCIONARIODRVNOMBRECOMPLETO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (funcionarioUsuarioLDAP)
    /** <code>funcionarioUsuarioLDAP</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIOUSUARIOLDAP = "Clas_1431626842112800Atr_7_Alias";
    /** <code>funcionarioUsuarioLDAP</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIOUSUARIOLDAP = "funcionarioUsuarioLDAP";
    /** <code>funcionarioUsuarioLDAP</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIOUSUARIOLDAP = "Usuario LDAP";

    /** <code>funcionarioUsuarioLDAP</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIOUSUARIOLDAP = "";
    /** Agents allowed to view the attribute funcionarioUsuarioLDAP **/
    public static final String FUNCIONARIOUSUARIOLDAP_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (funcionarioEmail)
    /** <code>funcionarioEmail</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIOEMAIL = "Clas_1431626842112800Atr_8_Alias";
    /** <code>funcionarioEmail</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIOEMAIL = "funcionarioEmail";
    /** <code>funcionarioEmail</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIOEMAIL = "Email";

    /** <code>funcionarioEmail</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIOEMAIL = "";
    /** Agents allowed to view the attribute funcionarioEmail **/
    public static final String FUNCIONARIOEMAIL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (funcionarioCodJefe)
    /** <code>funcionarioCodJefe</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIOCODJEFE = "Clas_1431626842112800Atr_9_Alias";
    /** <code>funcionarioCodJefe</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIOCODJEFE = "funcionarioCodJefe";
    /** <code>funcionarioCodJefe</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIOCODJEFE = "CodJefe";

    /** <code>funcionarioCodJefe</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIOCODJEFE = "";
    /** Agents allowed to view the attribute funcionarioCodJefe **/
    public static final String FUNCIONARIOCODJEFE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (funcionariodrvNomJefe)
    /** <code>funcionariodrvNomJefe</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIODRVNOMJEFE = "Clas_1431626842112800Atr_12_Alias";
    /** <code>funcionariodrvNomJefe</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIODRVNOMJEFE = "funcionariodrvNomJefe";
    /** <code>funcionariodrvNomJefe</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIODRVNOMJEFE = "Nombre Jefe";

    /** <code>funcionariodrvNomJefe</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIODRVNOMJEFE = "";
    /** Agents allowed to view the attribute funcionariodrvNomJefe **/
    public static final String FUNCIONARIODRVNOMJEFE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (funcionariodrvNomAgencia)
    /** <code>funcionariodrvNomAgencia</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIODRVNOMAGENCIA = "Clas_1431626842112800Atr_13_Alias";
    /** <code>funcionariodrvNomAgencia</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIODRVNOMAGENCIA = "funcionariodrvNomAgencia";
    /** <code>funcionariodrvNomAgencia</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIODRVNOMAGENCIA = "Agencia";

    /** <code>funcionariodrvNomAgencia</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIODRVNOMAGENCIA = "";
    /** Agents allowed to view the attribute funcionariodrvNomAgencia **/
    public static final String FUNCIONARIODRVNOMAGENCIA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones";
    // Attribute (funcionarioDisponible)
    /** <code>funcionarioDisponible</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIODISPONIBLE = "Clas_1431626842112800Atr_14_Alias";
    /** <code>funcionarioDisponible</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIODISPONIBLE = "funcionarioDisponible";
    /** <code>funcionarioDisponible</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIODISPONIBLE = "Disponible";

    /** <code>funcionarioDisponible</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIODISPONIBLE = "";
    /** Agents allowed to view the attribute funcionarioDisponible **/
    public static final String FUNCIONARIODISPONIBLE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones";
    // Attribute (funcionarioNumSolNoTerminadas)
    /** <code>funcionarioNumSolNoTerminadas</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIONUMSOLNOTERMINADAS = "Clas_1431626842112800Atr_15_Alias";
    /** <code>funcionarioNumSolNoTerminadas</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIONUMSOLNOTERMINADAS = "funcionarioNumSolNoTerminadas";
    /** <code>funcionarioNumSolNoTerminadas</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIONUMSOLNOTERMINADAS = "No. Solicitudes no terminadas";

    /** <code>funcionarioNumSolNoTerminadas</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIONUMSOLNOTERMINADAS = "";
    /** Agents allowed to view the attribute funcionarioNumSolNoTerminadas **/
    public static final String FUNCIONARIONUMSOLNOTERMINADAS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones";
    // Attribute (funcionariodrvEsAsesorIntegral)
    /** <code>funcionariodrvEsAsesorIntegral</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIODRVESASESORINTEGRAL = "Clas_1431626842112800Atr_16_Alias";
    /** <code>funcionariodrvEsAsesorIntegral</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIODRVESASESORINTEGRAL = "funcionariodrvEsAsesorIntegral";
    /** <code>funcionariodrvEsAsesorIntegral</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIODRVESASESORINTEGRAL = "Es Asesor Integral";

    /** <code>funcionariodrvEsAsesorIntegral</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIODRVESASESORINTEGRAL = "";
    /** Agents allowed to view the attribute funcionariodrvEsAsesorIntegral **/
    public static final String FUNCIONARIODRVESASESORINTEGRAL_AGENTS = "Admin,SuperAdmin,Asesor";
    // Attribute (funcionariodrvEsAfiliacion)
    /** <code>funcionariodrvEsAfiliacion</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIODRVESAFILIACION = "Clas_1431626842112800Atr_17_Alias";
    /** <code>funcionariodrvEsAfiliacion</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIODRVESAFILIACION = "funcionariodrvEsAfiliacion";
    /** <code>funcionariodrvEsAfiliacion</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIODRVESAFILIACION = "Es Afiliacion";

    /** <code>funcionariodrvEsAfiliacion</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIODRVESAFILIACION = "";
    /** Agents allowed to view the attribute funcionariodrvEsAfiliacion **/
    public static final String FUNCIONARIODRVESAFILIACION_AGENTS = "SuperAdmin,Asesor";
    // Attribute (funcionarioIdSesion)
    /** <code>funcionarioIdSesion</code> attribute id. */
    public static final String ATTR_ID_FUNCIONARIOIDSESION = "Clas_1431626842112800Atr_18_Alias";
    /** <code>funcionarioIdSesion</code> attribute name. */
    public static final String ATTR_NAME_FUNCIONARIOIDSESION = "funcionarioIdSesion";
    /** <code>funcionarioIdSesion</code> attribute alias. */
    public static final String ATTR_ALIAS_FUNCIONARIOIDSESION = "Id. Sesion";

    /** <code>funcionarioIdSesion</code> attribute facet sequence. */
    public static final String PATH_FACETS_FUNCIONARIOIDSESION = "";
    /** Agents allowed to view the attribute funcionarioIdSesion **/
    public static final String FUNCIONARIOIDSESION_AGENTS = "";
    // Attribute (asesorModDBasicosPersona)
    /** <code>asesorModDBasicosPersona</code> attribute id. */
    public static final String ATTR_ID_ASESORMODDBASICOSPERSONA = AsesorConstants.ATTR_ID_ASESORMODDBASICOSPERSONA;
    /** <code>asesorModDBasicosPersona</code> attribute name. */
    public static final String ATTR_NAME_ASESORMODDBASICOSPERSONA = AsesorConstants.ATTR_NAME_ASESORMODDBASICOSPERSONA;
    /** <code>asesorModDBasicosPersona</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORMODDBASICOSPERSONA = AsesorConstants.ATTR_ALIAS_ASESORMODDBASICOSPERSONA;

    /** <code>asesorModDBasicosPersona</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORMODDBASICOSPERSONA = AsesorConstants.CLASS_NAME;
    // Attribute (asesormodificaDirector)
    /** <code>asesormodificaDirector</code> attribute id. */
    public static final String ATTR_ID_ASESORMODIFICADIRECTOR = AsesorConstants.ATTR_ID_ASESORMODIFICADIRECTOR;
    /** <code>asesormodificaDirector</code> attribute name. */
    public static final String ATTR_NAME_ASESORMODIFICADIRECTOR = AsesorConstants.ATTR_NAME_ASESORMODIFICADIRECTOR;
    /** <code>asesormodificaDirector</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORMODIFICADIRECTOR = AsesorConstants.ATTR_ALIAS_ASESORMODIFICADIRECTOR;

    /** <code>asesormodificaDirector</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORMODIFICADIRECTOR = AsesorConstants.CLASS_NAME;
    // Attribute (asesoresDirector)
    /** <code>asesoresDirector</code> attribute id. */
    public static final String ATTR_ID_ASESORESDIRECTOR = AsesorConstants.ATTR_ID_ASESORESDIRECTOR;
    /** <code>asesoresDirector</code> attribute name. */
    public static final String ATTR_NAME_ASESORESDIRECTOR = AsesorConstants.ATTR_NAME_ASESORESDIRECTOR;
    /** <code>asesoresDirector</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORESDIRECTOR = AsesorConstants.ATTR_ALIAS_ASESORESDIRECTOR;

    /** <code>asesoresDirector</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORESDIRECTOR = AsesorConstants.CLASS_NAME;
    // Attribute (asesorNumIdentificacion)
    /** <code>asesorNumIdentificacion</code> attribute id. */
    public static final String ATTR_ID_ASESORNUMIDENTIFICACION = AsesorConstants.ATTR_ID_ASESORNUMIDENTIFICACION;
    /** <code>asesorNumIdentificacion</code> attribute name. */
    public static final String ATTR_NAME_ASESORNUMIDENTIFICACION = AsesorConstants.ATTR_NAME_ASESORNUMIDENTIFICACION;
    /** <code>asesorNumIdentificacion</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORNUMIDENTIFICACION = AsesorConstants.ATTR_ALIAS_ASESORNUMIDENTIFICACION;

    /** <code>asesorNumIdentificacion</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORNUMIDENTIFICACION = AsesorConstants.CLASS_NAME;
    // Attribute (asesorEsIntegral)
    /** <code>asesorEsIntegral</code> attribute id. */
    public static final String ATTR_ID_ASESORESINTEGRAL = AsesorConstants.ATTR_ID_ASESORESINTEGRAL;
    /** <code>asesorEsIntegral</code> attribute name. */
    public static final String ATTR_NAME_ASESORESINTEGRAL = AsesorConstants.ATTR_NAME_ASESORESINTEGRAL;
    /** <code>asesorEsIntegral</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORESINTEGRAL = AsesorConstants.ATTR_ALIAS_ASESORESINTEGRAL;

    /** <code>asesorEsIntegral</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORESINTEGRAL = AsesorConstants.CLASS_NAME;
    // Attribute (asesorVerDBasicosPersona)
    /** <code>asesorVerDBasicosPersona</code> attribute id. */
    public static final String ATTR_ID_ASESORVERDBASICOSPERSONA = AsesorConstants.ATTR_ID_ASESORVERDBASICOSPERSONA;
    /** <code>asesorVerDBasicosPersona</code> attribute name. */
    public static final String ATTR_NAME_ASESORVERDBASICOSPERSONA = AsesorConstants.ATTR_NAME_ASESORVERDBASICOSPERSONA;
    /** <code>asesorVerDBasicosPersona</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORVERDBASICOSPERSONA = AsesorConstants.ATTR_ALIAS_ASESORVERDBASICOSPERSONA;

    /** <code>asesorVerDBasicosPersona</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORVERDBASICOSPERSONA = AsesorConstants.CLASS_NAME;
    // Attribute (asesorVerDocIdentificacionPersona)
    /** <code>asesorVerDocIdentificacionPersona</code> attribute id. */
    public static final String ATTR_ID_ASESORVERDOCIDENTIFICACIONPERSONA = AsesorConstants.ATTR_ID_ASESORVERDOCIDENTIFICACIONPERSONA;
    /** <code>asesorVerDocIdentificacionPersona</code> attribute name. */
    public static final String ATTR_NAME_ASESORVERDOCIDENTIFICACIONPERSONA = AsesorConstants.ATTR_NAME_ASESORVERDOCIDENTIFICACIONPERSONA;
    /** <code>asesorVerDocIdentificacionPersona</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORVERDOCIDENTIFICACIONPERSONA = AsesorConstants.ATTR_ALIAS_ASESORVERDOCIDENTIFICACIONPERSONA;

    /** <code>asesorVerDocIdentificacionPersona</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORVERDOCIDENTIFICACIONPERSONA = AsesorConstants.CLASS_NAME;
    // Attribute (asesorVerContratoNovedad)
    /** <code>asesorVerContratoNovedad</code> attribute id. */
    public static final String ATTR_ID_ASESORVERCONTRATONOVEDAD = AsesorConstants.ATTR_ID_ASESORVERCONTRATONOVEDAD;
    /** <code>asesorVerContratoNovedad</code> attribute name. */
    public static final String ATTR_NAME_ASESORVERCONTRATONOVEDAD = AsesorConstants.ATTR_NAME_ASESORVERCONTRATONOVEDAD;
    /** <code>asesorVerContratoNovedad</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORVERCONTRATONOVEDAD = AsesorConstants.ATTR_ALIAS_ASESORVERCONTRATONOVEDAD;

    /** <code>asesorVerContratoNovedad</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORVERCONTRATONOVEDAD = AsesorConstants.CLASS_NAME;
    // Attribute (asesorCanalComercial)
    /** <code>asesorCanalComercial</code> attribute id. */
    public static final String ATTR_ID_ASESORCANALCOMERCIAL = AsesorConstants.ATTR_ID_ASESORCANALCOMERCIAL;
    /** <code>asesorCanalComercial</code> attribute name. */
    public static final String ATTR_NAME_ASESORCANALCOMERCIAL = AsesorConstants.ATTR_NAME_ASESORCANALCOMERCIAL;
    /** <code>asesorCanalComercial</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORCANALCOMERCIAL = AsesorConstants.ATTR_ALIAS_ASESORCANALCOMERCIAL;

    /** <code>asesorCanalComercial</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORCANALCOMERCIAL = AsesorConstants.CLASS_NAME;
    // Attribute (asesorCargo)
    /** <code>asesorCargo</code> attribute id. */
    public static final String ATTR_ID_ASESORCARGO = AsesorConstants.ATTR_ID_ASESORCARGO;
    /** <code>asesorCargo</code> attribute name. */
    public static final String ATTR_NAME_ASESORCARGO = AsesorConstants.ATTR_NAME_ASESORCARGO;
    /** <code>asesorCargo</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORCARGO = AsesorConstants.ATTR_ALIAS_ASESORCARGO;

    /** <code>asesorCargo</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORCARGO = AsesorConstants.CLASS_NAME;
    // Attribute (asesorEstado)
    /** <code>asesorEstado</code> attribute id. */
    public static final String ATTR_ID_ASESORESTADO = AsesorConstants.ATTR_ID_ASESORESTADO;
    /** <code>asesorEstado</code> attribute name. */
    public static final String ATTR_NAME_ASESORESTADO = AsesorConstants.ATTR_NAME_ASESORESTADO;
    /** <code>asesorEstado</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORESTADO = AsesorConstants.ATTR_ALIAS_ASESORESTADO;

    /** <code>asesorEstado</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORESTADO = AsesorConstants.CLASS_NAME;
    // Attribute (asesorAccesoValidadorUsuarios)
    /** <code>asesorAccesoValidadorUsuarios</code> attribute id. */
    public static final String ATTR_ID_ASESORACCESOVALIDADORUSUARIOS = AsesorConstants.ATTR_ID_ASESORACCESOVALIDADORUSUARIOS;
    /** <code>asesorAccesoValidadorUsuarios</code> attribute name. */
    public static final String ATTR_NAME_ASESORACCESOVALIDADORUSUARIOS = AsesorConstants.ATTR_NAME_ASESORACCESOVALIDADORUSUARIOS;
    /** <code>asesorAccesoValidadorUsuarios</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORACCESOVALIDADORUSUARIOS = AsesorConstants.ATTR_ALIAS_ASESORACCESOVALIDADORUSUARIOS;

    /** <code>asesorAccesoValidadorUsuarios</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORACCESOVALIDADORUSUARIOS = AsesorConstants.CLASS_NAME;


    // Field (Id)
    /** <code>Id</code> field name. */
    public static final String FLD_FUNCIONARIOID = "Id";    
    /** <code>funcionarioId</code> attribute field name. */
    public static final String ATTR_FIELD_FUNCIONARIOID = "funcionarioId";
    // Field (Identificador)
    /** <code>Identificador</code> field name. */
    public static final String FLD_ROLIDENTIFICADOR = "Identificador";    
    /** <code>Rol.rolIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_ROL_ROLIDENTIFICADOR = "rolIdentificador";
    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_SUCURSALCODIGO = "Codigo";    
    /** <code>Sucursal.sucursalCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_SUCURSAL_SUCURSALCODIGO = "sucursalCodigo";
    // Field (PassWord)
    /** <code>PassWord</code> field name. */
    public static final String FLD_P4SSW0RD = "PassWord";
    // Field (Manual)
    /** <code>Manual</code> field name. */
    public static final String FLD_FUNCIONARIOMANUAL = "Manual";    
    /** <code>funcionarioManual</code> attribute field name. */
    public static final String ATTR_FIELD_FUNCIONARIOMANUAL = "funcionarioManual";
    // Field (Usuario)
    /** <code>Usuario</code> field name. */
    public static final String FLD_FUNCIONARIOUSUARIO = "Usuario";    
    /** <code>Usuario</code> field length. */
    public static final int FLD_FUNCIONARIOUSUARIOLENGTH = 50;
    /** <code>funcionarioUsuario</code> attribute field name. */
    public static final String ATTR_FIELD_FUNCIONARIOUSUARIO = "funcionarioUsuario";
    // Field (PrimerNombre)
    /** <code>PrimerNombre</code> field name. */
    public static final String FLD_FUNCIONARIOPRIMERNOMBRE = "PrimerNombre";    
    /** <code>PrimerNombre</code> field length. */
    public static final int FLD_FUNCIONARIOPRIMERNOMBRELENGTH = 50;
    /** <code>funcionarioPrimerNombre</code> attribute field name. */
    public static final String ATTR_FIELD_FUNCIONARIOPRIMERNOMBRE = "funcionarioPrimerNombre";
    // Field (SegundoNombre)
    /** <code>SegundoNombre</code> field name. */
    public static final String FLD_FUNCIONARIOSEGUNDONOMBRE = "SegundoNombre";    
    /** <code>SegundoNombre</code> field length. */
    public static final int FLD_FUNCIONARIOSEGUNDONOMBRELENGTH = 50;
    /** <code>funcionarioSegundoNombre</code> attribute field name. */
    public static final String ATTR_FIELD_FUNCIONARIOSEGUNDONOMBRE = "funcionarioSegundoNombre";
    // Field (PrimerApellido)
    /** <code>PrimerApellido</code> field name. */
    public static final String FLD_FUNCIONARIOPRIMERAPELLIDO = "PrimerApellido";    
    /** <code>PrimerApellido</code> field length. */
    public static final int FLD_FUNCIONARIOPRIMERAPELLIDOLENGTH = 50;
    /** <code>funcionarioPrimerApellido</code> attribute field name. */
    public static final String ATTR_FIELD_FUNCIONARIOPRIMERAPELLIDO = "funcionarioPrimerApellido";
    // Field (SegundoApellido)
    /** <code>SegundoApellido</code> field name. */
    public static final String FLD_FUNCIONARIOSEGUNDOAPELLIDO = "SegundoApellido";    
    /** <code>SegundoApellido</code> field length. */
    public static final int FLD_FUNCIONARIOSEGUNDOAPELLIDOLENGTH = 50;
    /** <code>funcionarioSegundoApellido</code> attribute field name. */
    public static final String ATTR_FIELD_FUNCIONARIOSEGUNDOAPELLIDO = "funcionarioSegundoApellido";
    // Field (UsuarioLDAP)
    /** <code>UsuarioLDAP</code> field name. */
    public static final String FLD_FUNCIONARIOUSUARIOLDAP = "UsuarioLDAP";    
    /** <code>UsuarioLDAP</code> field length. */
    public static final int FLD_FUNCIONARIOUSUARIOLDAPLENGTH = 50;
    /** <code>funcionarioUsuarioLDAP</code> attribute field name. */
    public static final String ATTR_FIELD_FUNCIONARIOUSUARIOLDAP = "funcionarioUsuarioLDAP";
    // Field (Email)
    /** <code>Email</code> field name. */
    public static final String FLD_FUNCIONARIOEMAIL = "Email";    
    /** <code>Email</code> field length. */
    public static final int FLD_FUNCIONARIOEMAILLENGTH = 100;
    /** <code>funcionarioEmail</code> attribute field name. */
    public static final String ATTR_FIELD_FUNCIONARIOEMAIL = "funcionarioEmail";
    // Field (CodJefe)
    /** <code>CodJefe</code> field name. */
    public static final String FLD_FUNCIONARIOCODJEFE = "CodJefe";    
    /** <code>CodJefe</code> field length. */
    public static final int FLD_FUNCIONARIOCODJEFELENGTH = 50;
    /** <code>funcionarioCodJefe</code> attribute field name. */
    public static final String ATTR_FIELD_FUNCIONARIOCODJEFE = "funcionarioCodJefe";
    // Field (Disponible)
    /** <code>Disponible</code> field name. */
    public static final String FLD_FUNCIONARIODISPONIBLE = "Disponible";    
    /** <code>funcionarioDisponible</code> attribute field name. */
    public static final String ATTR_FIELD_FUNCIONARIODISPONIBLE = "funcionarioDisponible";
    // Field (NumSolNoTerminadas)
    /** <code>NumSolNoTerminadas</code> field name. */
    public static final String FLD_FUNCIONARIONUMSOLNOTERMINADAS = "NumSolNoTerminadas";    
    /** <code>funcionarioNumSolNoTerminadas</code> attribute field name. */
    public static final String ATTR_FIELD_FUNCIONARIONUMSOLNOTERMINADAS = "funcionarioNumSolNoTerminadas";
    // Field (IdSesion)
    /** <code>IdSesion</code> field name. */
    public static final String FLD_FUNCIONARIOIDSESION = "IdSesion";    
    /** <code>IdSesion</code> field length. */
    public static final int FLD_FUNCIONARIOIDSESIONLENGTH = 50;
    /** <code>funcionarioIdSesion</code> attribute field name. */
    public static final String ATTR_FIELD_FUNCIONARIOIDSESION = "funcionarioIdSesion";

    // Component role (Rol)
    /** <code>Rol</code> role id. */
    public static final String ROLE_ID_ROL = "Agr_1431700897792546_Alias";
    /** <code>Rol</code> role name. */
    public static final String ROLE_NAME_ROL = "rol";
    /** <code>Rol</code> role alias. */
    public static final String ROLE_ALIAS_ROL = "Rol";

    /** <code>Rol</code> inverse role name. */
    public static final String ROLE_INVNAME_ROL = RolConstants.ROLE_NAME_AGENTES;
    /** <code>Rol</code> role facet sequence. */
    public static final String PATH_FACETS_ROL = "";
    /** <code>Rol</code> role target class. */
    public static final String ROLE_TARGET_ROL = RolConstants.CLASS_NAME;

    /** Agents allowed to navigate through Rol **/
    public static final String ROL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones";
    // Component role (Sucursal)
    /** <code>Sucursal</code> role id. */
    public static final String ROLE_ID_SUCURSAL = "Agr_1433432883200373_Alias";
    /** <code>Sucursal</code> role name. */
    public static final String ROLE_NAME_SUCURSAL = "sucursal";
    /** <code>Sucursal</code> role alias. */
    public static final String ROLE_ALIAS_SUCURSAL = "Sucursal";

    /** <code>Sucursal</code> inverse role name. */
    public static final String ROLE_INVNAME_SUCURSAL = SucursalConstants.ROLE_NAME_AGENTES;
    /** <code>Sucursal</code> role facet sequence. */
    public static final String PATH_FACETS_SUCURSAL = "";
    /** <code>Sucursal</code> role target class. */
    public static final String ROLE_TARGET_SUCURSAL = SucursalConstants.CLASS_NAME;

    /** Agents allowed to navigate through Sucursal **/
    public static final String SUCURSAL_AGENTS = "Admin,SuperAdmin,RespRegional,Asesor,AreaMedica,Afiliaciones";
    // Component role (TipoIdentificacion)
    /** <code>TipoIdentificacion</code> role id. */
    public static final String ROLE_ID_TIPOIDENTIFICACION = AsesorConstants.ROLE_ID_TIPOIDENTIFICACION;
    /** <code>TipoIdentificacion</code> role name. */
    public static final String ROLE_NAME_TIPOIDENTIFICACION = AsesorConstants.ROLE_NAME_TIPOIDENTIFICACION;
    /** <code>TipoIdentificacion</code> role alias. */
    public static final String ROLE_ALIAS_TIPOIDENTIFICACION = AsesorConstants.ROLE_ALIAS_TIPOIDENTIFICACION;

    /** <code>TipoIdentificacion</code> inverse role name. */
    public static final String ROLE_INVNAME_TIPOIDENTIFICACION = TipoIdentificacionConstants.ROLE_NAME_ASESORES;
    /** <code>TipoIdentificacion</code> role facet sequence. */
    public static final String PATH_FACETS_TIPOIDENTIFICACION = AsesorConstants.CLASS_NAME;
    /** <code>TipoIdentificacion</code> role target class. */
    public static final String ROLE_TARGET_TIPOIDENTIFICACION = TipoIdentificacionConstants.CLASS_NAME;

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
    public static final String PATH_FACETS_PLANES = AfiliacionesConstants.CLASS_NAME;
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
    public static final String PATH_FACETS_REGIONAL = RespRegionalConstants.CLASS_NAME;
    /** <code>Regional</code> role target class. */
    public static final String ROLE_TARGET_REGIONAL = RegionalConstants.CLASS_NAME;


    // Compound role (Solicitudes)
    /** <code>Solicitudes</code> role id. */
    public static final String ROLE_ID_SOLICITUDES = "Agr_1432638455808747_Alias";
    /** <code>Solicitudes</code> role name. */
    public static final String ROLE_NAME_SOLICITUDES = "solicitudes";
    /** <code>Agente</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUDES = "Solicitudes";


    /** <code>Solicitudes</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUDES = SolicitudConstants.ROLE_NAME_AGENTE;
    /** <code>Solicitudes</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUDES = "";
    /** <code>Solicitudes</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUDES = SolicitudConstants.CLASS_NAME;
    /** Agents allowed to navigate through Solicitudes **/
    public static final String SOLICITUDES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones";
    // Compound role (SolicitudesAfiliacion)
    /** <code>SolicitudesAfiliacion</code> role id. */
    public static final String ROLE_ID_SOLICITUDESAFILIACION = "Agr_1586857246720601_Alias";
    /** <code>SolicitudesAfiliacion</code> role name. */
    public static final String ROLE_NAME_SOLICITUDESAFILIACION = "solicitudesAfiliacion";
    /** <code>UsrAfiliacion</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUDESAFILIACION = "Solicitudes Afiliación";


    /** <code>SolicitudesAfiliacion</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUDESAFILIACION = SolicitudConstants.ROLE_NAME_USRAFILIACION;
    /** <code>SolicitudesAfiliacion</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUDESAFILIACION = "";
    /** <code>SolicitudesAfiliacion</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUDESAFILIACION = SolicitudConstants.CLASS_NAME;
    /** Agents allowed to navigate through SolicitudesAfiliacion **/
    public static final String SOLICITUDESAFILIACION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones";
    // Compound role (ObsEstado)
    /** <code>ObsEstado</code> role id. */
    public static final String ROLE_ID_OBSESTADO = "Agr_1434447118336092_Alias";
    /** <code>ObsEstado</code> role name. */
    public static final String ROLE_NAME_OBSESTADO = "obsEstado";
    /** <code>Agente</code> role alias. */
    public static final String ROLE_ALIAS_OBSESTADO = "Observaciones";


    /** <code>ObsEstado</code> inverse role name. */
    public static final String ROLE_INVNAME_OBSESTADO = ObsEstadoConstants.ROLE_NAME_AGENTE;
    /** <code>ObsEstado</code> role facet sequence. */
    public static final String PATH_FACETS_OBSESTADO = "";
    /** <code>ObsEstado</code> role target class. */
    public static final String ROLE_TARGET_OBSESTADO = ObsEstadoConstants.CLASS_NAME;
    /** Agents allowed to navigate through ObsEstado **/
    public static final String OBSESTADO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones";
    // Compound role (Reportes)
    /** <code>Reportes</code> role id. */
    public static final String ROLE_ID_REPORTES = "Agr_1580740640768218_Alias";
    /** <code>Reportes</code> role name. */
    public static final String ROLE_NAME_REPORTES = "reportes";
    /** <code>Funcionarios</code> role alias. */
    public static final String ROLE_ALIAS_REPORTES = "Reportes";


    /** <code>Reportes</code> inverse role name. */
    public static final String ROLE_INVNAME_REPORTES = ReportesProcAlmConstants.ROLE_NAME_FUNCIONARIOS;
    /** <code>Reportes</code> role facet sequence. */
    public static final String PATH_FACETS_REPORTES = "";
    /** <code>Reportes</code> role target class. */
    public static final String ROLE_TARGET_REPORTES = ReportesProcAlmConstants.CLASS_NAME;
    /** Agents allowed to navigate through Reportes **/
    public static final String REPORTES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones";
    // Compound role (SolicitudesNovedad)
    /** <code>SolicitudesNovedad</code> role id. */
    public static final String ROLE_ID_SOLICITUDESNOVEDAD = "Agr_1583235989504901_Alias";
    /** <code>SolicitudesNovedad</code> role name. */
    public static final String ROLE_NAME_SOLICITUDESNOVEDAD = "solicitudesNovedad";
    /** <code>Agente</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUDESNOVEDAD = "SolicitudesNovedad";


    /** <code>SolicitudesNovedad</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUDESNOVEDAD = SolicitudNovedadConstants.ROLE_NAME_AGENTE;
    /** <code>SolicitudesNovedad</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUDESNOVEDAD = "";
    /** <code>SolicitudesNovedad</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUDESNOVEDAD = SolicitudNovedadConstants.CLASS_NAME;
    /** Agents allowed to navigate through SolicitudesNovedad **/
    public static final String SOLICITUDESNOVEDAD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones";
    // Compound role (SolNovAifliaciones)
    /** <code>SolNovAifliaciones</code> role id. */
    public static final String ROLE_ID_SOLNOVAIFLIACIONES = "Agr_1586855411712406_Alias";
    /** <code>SolNovAifliaciones</code> role name. */
    public static final String ROLE_NAME_SOLNOVAIFLIACIONES = "solNovAifliaciones";
    /** <code>UsrAfiliacion</code> role alias. */
    public static final String ROLE_ALIAS_SOLNOVAIFLIACIONES = "Sol. Nov. Afiliaciones";


    /** <code>SolNovAifliaciones</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLNOVAIFLIACIONES = SolicitudNovedadConstants.ROLE_NAME_USRAFILIACION;
    /** <code>SolNovAifliaciones</code> role facet sequence. */
    public static final String PATH_FACETS_SOLNOVAIFLIACIONES = "";
    /** <code>SolNovAifliaciones</code> role target class. */
    public static final String ROLE_TARGET_SOLNOVAIFLIACIONES = SolicitudNovedadConstants.CLASS_NAME;
    /** Agents allowed to navigate through SolNovAifliaciones **/
    public static final String SOLNOVAIFLIACIONES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones";
    // Compound role (GrupoAsignacion)
    /** <code>GrupoAsignacion</code> role id. */
    public static final String ROLE_ID_GRUPOASIGNACION = "Agr_1586850430976556_Alias";
    /** <code>GrupoAsignacion</code> role name. */
    public static final String ROLE_NAME_GRUPOASIGNACION = "grupoAsignacion";
    /** <code>Funcionario</code> role alias. */
    public static final String ROLE_ALIAS_GRUPOASIGNACION = "GrupoAsignacion";


    /** <code>GrupoAsignacion</code> inverse role name. */
    public static final String ROLE_INVNAME_GRUPOASIGNACION = GrupoAsignacionConstants.ROLE_NAME_FUNCIONARIO;
    /** <code>GrupoAsignacion</code> role facet sequence. */
    public static final String PATH_FACETS_GRUPOASIGNACION = "";
    /** <code>GrupoAsignacion</code> role target class. */
    public static final String ROLE_TARGET_GRUPOASIGNACION = GrupoAsignacionConstants.CLASS_NAME;
    /** Agents allowed to navigate through GrupoAsignacion **/
    public static final String GRUPOASIGNACION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones";
    // Compound role (LogFuncionario)
    /** <code>LogFuncionario</code> role id. */
    public static final String ROLE_ID_LOGFUNCIONARIO = "Agr_1586853183488610_Alias";
    /** <code>LogFuncionario</code> role name. */
    public static final String ROLE_NAME_LOGFUNCIONARIO = "logFuncionario";
    /** <code>Funcionario</code> role alias. */
    public static final String ROLE_ALIAS_LOGFUNCIONARIO = "Histórico";


    /** <code>LogFuncionario</code> inverse role name. */
    public static final String ROLE_INVNAME_LOGFUNCIONARIO = LogFuncionarioConstants.ROLE_NAME_FUNCIONARIO;
    /** <code>LogFuncionario</code> role facet sequence. */
    public static final String PATH_FACETS_LOGFUNCIONARIO = "";
    /** <code>LogFuncionario</code> role target class. */
    public static final String ROLE_TARGET_LOGFUNCIONARIO = LogFuncionarioConstants.CLASS_NAME;
    /** Agents allowed to navigate through LogFuncionario **/
    public static final String LOGFUNCIONARIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones";
    // Compound role (ContratosC)
    /** <code>ContratosC</code> role id. */
    public static final String ROLE_ID_CONTRATOSC = AsesorConstants.ROLE_ID_CONTRATOSC;
    /** <code>ContratosC</code> role name. */
    public static final String ROLE_NAME_CONTRATOSC = AsesorConstants.ROLE_NAME_CONTRATOSC;
    /** <code>AsesorC</code> role alias. */
    public static final String ROLE_ALIAS_CONTRATOSC = AsesorConstants.ROLE_ALIAS_CONTRATOSC;


    /** <code>ContratosC</code> inverse role name. */
    public static final String ROLE_INVNAME_CONTRATOSC = ContratoCConstants.ROLE_NAME_ASESORC;
    /** <code>ContratosC</code> role facet sequence. */
    public static final String PATH_FACETS_CONTRATOSC = AsesorConstants.CLASS_NAME;
    /** <code>ContratosC</code> role target class. */
    public static final String ROLE_TARGET_CONTRATOSC = ContratoCConstants.CLASS_NAME;
    // Compound role (AgentexProducto)
    /** <code>AgentexProducto</code> role id. */
    public static final String ROLE_ID_AGENTEXPRODUCTO = AsesorConstants.ROLE_ID_AGENTEXPRODUCTO;
    /** <code>AgentexProducto</code> role name. */
    public static final String ROLE_NAME_AGENTEXPRODUCTO = AsesorConstants.ROLE_NAME_AGENTEXPRODUCTO;
    /** <code>Asesor</code> role alias. */
    public static final String ROLE_ALIAS_AGENTEXPRODUCTO = AsesorConstants.ROLE_ALIAS_AGENTEXPRODUCTO;


    /** <code>AgentexProducto</code> inverse role name. */
    public static final String ROLE_INVNAME_AGENTEXPRODUCTO = AgentexProductoConstants.ROLE_NAME_ASESOR;
    /** <code>AgentexProducto</code> role facet sequence. */
    public static final String PATH_FACETS_AGENTEXPRODUCTO = AsesorConstants.CLASS_NAME;
    /** <code>AgentexProducto</code> role target class. */
    public static final String ROLE_TARGET_AGENTEXPRODUCTO = AgentexProductoConstants.CLASS_NAME;
    // Compound role (LogInformacionAsesor)
    /** <code>LogInformacionAsesor</code> role id. */
    public static final String ROLE_ID_LOGINFORMACIONASESOR = AsesorConstants.ROLE_ID_LOGINFORMACIONASESOR;
    /** <code>LogInformacionAsesor</code> role name. */
    public static final String ROLE_NAME_LOGINFORMACIONASESOR = AsesorConstants.ROLE_NAME_LOGINFORMACIONASESOR;
    /** <code>Asesor</code> role alias. */
    public static final String ROLE_ALIAS_LOGINFORMACIONASESOR = AsesorConstants.ROLE_ALIAS_LOGINFORMACIONASESOR;


    /** <code>LogInformacionAsesor</code> inverse role name. */
    public static final String ROLE_INVNAME_LOGINFORMACIONASESOR = LogInformacionAsesorConstants.ROLE_NAME_ASESOR;
    /** <code>LogInformacionAsesor</code> role facet sequence. */
    public static final String PATH_FACETS_LOGINFORMACIONASESOR = AsesorConstants.CLASS_NAME;
    /** <code>LogInformacionAsesor</code> role target class. */
    public static final String ROLE_TARGET_LOGINFORMACIONASESOR = LogInformacionAsesorConstants.CLASS_NAME;
    // Compound role (LogHistoricoPlanes)
    /** <code>LogHistoricoPlanes</code> role id. */
    public static final String ROLE_ID_LOGHISTORICOPLANES = AsesorConstants.ROLE_ID_LOGHISTORICOPLANES;
    /** <code>LogHistoricoPlanes</code> role name. */
    public static final String ROLE_NAME_LOGHISTORICOPLANES = AsesorConstants.ROLE_NAME_LOGHISTORICOPLANES;
    /** <code>Asesor</code> role alias. */
    public static final String ROLE_ALIAS_LOGHISTORICOPLANES = AsesorConstants.ROLE_ALIAS_LOGHISTORICOPLANES;


    /** <code>LogHistoricoPlanes</code> inverse role name. */
    public static final String ROLE_INVNAME_LOGHISTORICOPLANES = LogHistoricoPlanesConstants.ROLE_NAME_ASESOR;
    /** <code>LogHistoricoPlanes</code> role facet sequence. */
    public static final String PATH_FACETS_LOGHISTORICOPLANES = AsesorConstants.CLASS_NAME;
    /** <code>LogHistoricoPlanes</code> role target class. */
    public static final String ROLE_TARGET_LOGHISTORICOPLANES = LogHistoricoPlanesConstants.CLASS_NAME;
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
    public static final String PATH_FACETS_SOLICITUDESARME = AreaMedicaConstants.CLASS_NAME;
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
    public static final String PATH_FACETS_FIRMA = RespRegionalConstants.CLASS_NAME;
    /** <code>Firma</code> role target class. */
    public static final String ROLE_TARGET_FIRMA = FirmaConstants.CLASS_NAME;

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431626842112800Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionariocrearpagrRol</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FUNCIONARIOCREARPAGRROL = "p_agrRol";
    /** <code>funcionariocrearpagrRol</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FUNCIONARIOCREARPAGRROL = "Clas_1431626842112800Ser_1Arg_8_Alias";
    /** <code>funcionariocrearpagrRol</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FUNCIONARIOCREARPAGRROL = "Rol";
    /** <code>funcionariocrearpagrSucursal</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FUNCIONARIOCREARPAGRSUCURSAL = "p_agrSucursal";
    /** <code>funcionariocrearpagrSucursal</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FUNCIONARIOCREARPAGRSUCURSAL = "Clas_1431626842112800Ser_1Arg_12_Alias";
    /** <code>funcionariocrearpagrSucursal</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FUNCIONARIOCREARPAGRSUCURSAL = "Sucursal";
    /** <code>funcionariocrearpatrUsuario</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FUNCIONARIOCREARPATRUSUARIO = "p_atrUsuario";
    /** <code>funcionariocrearpatrUsuario</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FUNCIONARIOCREARPATRUSUARIO = "Clas_1431626842112800Ser_1Arg_1_Alias";
    /** <code>funcionariocrearpatrUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FUNCIONARIOCREARPATRUSUARIO = "Usuario";
    /** <code>funcionariocrearpatrPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FUNCIONARIOCREARPATRPRIMERNOMBRE = "p_atrPrimerNombre";
    /** <code>funcionariocrearpatrPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FUNCIONARIOCREARPATRPRIMERNOMBRE = "Clas_1431626842112800Ser_1Arg_2_Alias";
    /** <code>funcionariocrearpatrPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FUNCIONARIOCREARPATRPRIMERNOMBRE = "Primer nombre";
    /** <code>funcionariocrearpatrSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FUNCIONARIOCREARPATRSEGUNDONOMBRE = "p_atrSegundoNombre";
    /** <code>funcionariocrearpatrSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FUNCIONARIOCREARPATRSEGUNDONOMBRE = "Clas_1431626842112800Ser_1Arg_3_Alias";
    /** <code>funcionariocrearpatrSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FUNCIONARIOCREARPATRSEGUNDONOMBRE = "Segundo nombre";
    /** <code>funcionariocrearpatrPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FUNCIONARIOCREARPATRPRIMERAPELLIDO = "p_atrPrimerApellido";
    /** <code>funcionariocrearpatrPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FUNCIONARIOCREARPATRPRIMERAPELLIDO = "Clas_1431626842112800Ser_1Arg_4_Alias";
    /** <code>funcionariocrearpatrPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FUNCIONARIOCREARPATRPRIMERAPELLIDO = "Primer apellido";
    /** <code>funcionariocrearpatrSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FUNCIONARIOCREARPATRSEGUNDOAPELLIDO = "p_atrSegundoApellido";
    /** <code>funcionariocrearpatrSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FUNCIONARIOCREARPATRSEGUNDOAPELLIDO = "Clas_1431626842112800Ser_1Arg_5_Alias";
    /** <code>funcionariocrearpatrSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FUNCIONARIOCREARPATRSEGUNDOAPELLIDO = "Segundo apellido";
    /** <code>funcionariocrearpatrUsuarioLDAP</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FUNCIONARIOCREARPATRUSUARIOLDAP = "p_atrUsuarioLDAP";
    /** <code>funcionariocrearpatrUsuarioLDAP</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FUNCIONARIOCREARPATRUSUARIOLDAP = "Clas_1431626842112800Ser_1Arg_10_Alias";
    /** <code>funcionariocrearpatrUsuarioLDAP</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FUNCIONARIOCREARPATRUSUARIOLDAP = "Usuario LDAP";
    /** <code>funcionariocrearpatrEmail</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FUNCIONARIOCREARPATREMAIL = "p_atrEmail";
    /** <code>funcionariocrearpatrEmail</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FUNCIONARIOCREARPATREMAIL = "Clas_1431626842112800Ser_1Arg_11_Alias";
    /** <code>funcionariocrearpatrEmail</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FUNCIONARIOCREARPATREMAIL = "Email";
    /** <code>funcionariocrearpatrManual</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FUNCIONARIOCREARPATRMANUAL = "p_atrManual";
    /** <code>funcionariocrearpatrManual</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FUNCIONARIOCREARPATRMANUAL = "Clas_1431626842112800Ser_1Arg_13_Alias";
    /** <code>funcionariocrearpatrManual</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FUNCIONARIOCREARPATRMANUAL = "Manual";
    /** <code>funcionariocrearppassword</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FUNCIONARIOCREARPP4SSW0RD = "p_password";
    /** <code>funcionariocrearppassword</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FUNCIONARIOCREARPP4SSW0RD = "Clas_1431626842112800Ser_1Arg_6_Alias";
    /** <code>funcionariocrearppassword</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FUNCIONARIOCREARPP4SSW0RD = "Contraseña";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431626842112800Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionarioeliminarpthisAdmin</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_FUNCIONARIOELIMINARPTHISADMIN = "p_thisAdmin";
    /** <code>funcionarioeliminarpthisAdmin</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_FUNCIONARIOELIMINARPTHISADMIN = "Clas_1431626842112800Ser_2Arg_1_Alias";
    /** <code>funcionarioeliminarpthisAdmin</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_FUNCIONARIOELIMINARPTHISADMIN = "Usuario";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1431626842112800Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionariomodificarpthisAdmin</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_FUNCIONARIOMODIFICARPTHISADMIN = "p_thisAdmin";
    /** <code>funcionariomodificarpthisAdmin</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_FUNCIONARIOMODIFICARPTHISADMIN = "Clas_1431626842112800Ser_3Arg_1_Alias";
    /** <code>funcionariomodificarpthisAdmin</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_FUNCIONARIOMODIFICARPTHISADMIN = "Usuario";
    /** <code>funcionariomodificarpPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_FUNCIONARIOMODIFICARPPRIMERNOMBRE = "p_PrimerNombre";
    /** <code>funcionariomodificarpPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_FUNCIONARIOMODIFICARPPRIMERNOMBRE = "Clas_1431626842112800Ser_3Arg_2_Alias";
    /** <code>funcionariomodificarpPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_FUNCIONARIOMODIFICARPPRIMERNOMBRE = "Primer nombre";
    /** <code>funcionariomodificarpSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_FUNCIONARIOMODIFICARPSEGUNDONOMBRE = "p_SegundoNombre";
    /** <code>funcionariomodificarpSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_FUNCIONARIOMODIFICARPSEGUNDONOMBRE = "Clas_1431626842112800Ser_3Arg_3_Alias";
    /** <code>funcionariomodificarpSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_FUNCIONARIOMODIFICARPSEGUNDONOMBRE = "Segundo nombre";
    /** <code>funcionariomodificarpPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_FUNCIONARIOMODIFICARPPRIMERAPELLIDO = "p_PrimerApellido";
    /** <code>funcionariomodificarpPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_FUNCIONARIOMODIFICARPPRIMERAPELLIDO = "Clas_1431626842112800Ser_3Arg_4_Alias";
    /** <code>funcionariomodificarpPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_FUNCIONARIOMODIFICARPPRIMERAPELLIDO = "Primer apellido";
    /** <code>funcionariomodificarpSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_FUNCIONARIOMODIFICARPSEGUNDOAPELLIDO = "p_SegundoApellido";
    /** <code>funcionariomodificarpSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_FUNCIONARIOMODIFICARPSEGUNDOAPELLIDO = "Clas_1431626842112800Ser_3Arg_5_Alias";
    /** <code>funcionariomodificarpSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_FUNCIONARIOMODIFICARPSEGUNDOAPELLIDO = "Segundo apellido";
    /** <code>funcionariomodificarpUsuarioLDAP</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_FUNCIONARIOMODIFICARPUSUARIOLDAP = "p_UsuarioLDAP";
    /** <code>funcionariomodificarpUsuarioLDAP</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_FUNCIONARIOMODIFICARPUSUARIOLDAP = "Clas_1431626842112800Ser_3Arg_6_Alias";
    /** <code>funcionariomodificarpUsuarioLDAP</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_FUNCIONARIOMODIFICARPUSUARIOLDAP = "Usuario LDAP";
    /** <code>funcionariomodificarpEmail</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_FUNCIONARIOMODIFICARPEMAIL = "p_Email";
    /** <code>funcionariomodificarpEmail</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_FUNCIONARIOMODIFICARPEMAIL = "Clas_1431626842112800Ser_3Arg_7_Alias";
    /** <code>funcionariomodificarpEmail</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_FUNCIONARIOMODIFICARPEMAIL = "Email";
    // Service (setPassword)
    /** <code>setPassword</code> service id. */
    public static final String SERV_ID_SETP4SSW0RD = "Clas_1431626842112800Ser_4_Alias";
    /** <code>setPassword</code> service name. */
    public static final String SERV_NAME_SETP4SSW0RD = "setPassword";
    /** <code>setPassword</code> service alias. */
    public static final String SERV_ALIAS_SETP4SSW0RD = "Establecer contraseña";
    /** Agents allowed to execute the service setPassword **/
    public static final String SETP4SSW0RD_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>funcionariosetPasswordpthisAdmin</code> inbound argument name. */
    public static final String ARG_NAME_SETP4SSW0RD_FUNCIONARIOSETP4SSW0RDPTHISADMIN = "p_thisAdmin";
    /** <code>funcionariosetPasswordpthisAdmin</code> inbound argument id. */
    public static final String ARG_ID_SETP4SSW0RD_FUNCIONARIOSETP4SSW0RDPTHISADMIN = "Clas_1431626842112800Ser_4Arg_1_Alias";
    /** <code>funcionariosetPasswordpthisAdmin</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETP4SSW0RD_FUNCIONARIOSETP4SSW0RDPTHISADMIN = "Usuario";
    /** <code>funcionariosetPasswordpNewPassword</code> inbound argument name. */
    public static final String ARG_NAME_SETP4SSW0RD_FUNCIONARIOSETP4SSW0RDPNEWP4SSW0RD = "p_NewPassword";
    /** <code>funcionariosetPasswordpNewPassword</code> inbound argument id. */
    public static final String ARG_ID_SETP4SSW0RD_FUNCIONARIOSETP4SSW0RDPNEWP4SSW0RD = "Clas_1431626842112800Ser_4Arg_2_Alias";
    /** <code>funcionariosetPasswordpNewPassword</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETP4SSW0RD_FUNCIONARIOSETP4SSW0RDPNEWP4SSW0RD = "Nueva contraseña";
    // Service (hacerAdmin)
    /** <code>hacerAdmin</code> service id. */
    public static final String SERV_ID_HACERADMIN = "Clas_1431626842112800Ser_5_Alias";
    /** <code>hacerAdmin</code> service name. */
    public static final String SERV_NAME_HACERADMIN = "hacerAdmin";
    /** <code>hacerAdmin</code> service alias. */
    public static final String SERV_ALIAS_HACERADMIN = "hacerAdmin";
    /** Agents allowed to execute the service hacerAdmin **/
    public static final String HACERADMIN_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionariohacerAdminpthisAgente</code> inbound argument name. */
    public static final String ARG_NAME_HACERADMIN_FUNCIONARIOHACERADMINPTHISAGENTE = "p_thisAgente";
    /** <code>funcionariohacerAdminpthisAgente</code> inbound argument id. */
    public static final String ARG_ID_HACERADMIN_FUNCIONARIOHACERADMINPTHISAGENTE = "Clas_1431626842112800Ser_5Arg_1_Alias";
    /** <code>funcionariohacerAdminpthisAgente</code> inbound argument alias. */
    public static final String ARG_ALIAS_HACERADMIN_FUNCIONARIOHACERADMINPTHISAGENTE = "Usuario";
    // Service (hacerSuperAdmin)
    /** <code>hacerSuperAdmin</code> service id. */
    public static final String SERV_ID_HACERSUPERADMIN = "Clas_1431626842112800Ser_6_Alias";
    /** <code>hacerSuperAdmin</code> service name. */
    public static final String SERV_NAME_HACERSUPERADMIN = "hacerSuperAdmin";
    /** <code>hacerSuperAdmin</code> service alias. */
    public static final String SERV_ALIAS_HACERSUPERADMIN = "hacerSuperAdmin";
    /** Agents allowed to execute the service hacerSuperAdmin **/
    public static final String HACERSUPERADMIN_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionariohacerSuperAdminpthisAgente</code> inbound argument name. */
    public static final String ARG_NAME_HACERSUPERADMIN_FUNCIONARIOHACERSUPERADMINPTHISAGENTE = "p_thisAgente";
    /** <code>funcionariohacerSuperAdminpthisAgente</code> inbound argument id. */
    public static final String ARG_ID_HACERSUPERADMIN_FUNCIONARIOHACERSUPERADMINPTHISAGENTE = "Clas_1431626842112800Ser_6Arg_1_Alias";
    /** <code>funcionariohacerSuperAdminpthisAgente</code> inbound argument alias. */
    public static final String ARG_ALIAS_HACERSUPERADMIN_FUNCIONARIOHACERSUPERADMINPTHISAGENTE = "Usuario";
    // Service (hacerAsesor)
    /** <code>hacerAsesor</code> service id. */
    public static final String SERV_ID_HACERASESOR = "Clas_1431626842112800Ser_10_Alias";
    /** <code>hacerAsesor</code> service name. */
    public static final String SERV_NAME_HACERASESOR = "hacerAsesor";
    /** <code>hacerAsesor</code> service alias. */
    public static final String SERV_ALIAS_HACERASESOR = "hacerAsesor";
    /** Agents allowed to execute the service hacerAsesor **/
    public static final String HACERASESOR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionariohacerAsesorpthisAgente</code> inbound argument name. */
    public static final String ARG_NAME_HACERASESOR_FUNCIONARIOHACERASESORPTHISAGENTE = "p_thisAgente";
    /** <code>funcionariohacerAsesorpthisAgente</code> inbound argument id. */
    public static final String ARG_ID_HACERASESOR_FUNCIONARIOHACERASESORPTHISAGENTE = "Clas_1431626842112800Ser_10Arg_1_Alias";
    /** <code>funcionariohacerAsesorpthisAgente</code> inbound argument alias. */
    public static final String ARG_ALIAS_HACERASESOR_FUNCIONARIOHACERASESORPTHISAGENTE = "Usuario";
    /** <code>funcionariohacerAsesorpagrTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_HACERASESOR_FUNCIONARIOHACERASESORPAGRTIPOIDENTIFICACION = "p_agrTipoIdentificacion";
    /** <code>funcionariohacerAsesorpagrTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_HACERASESOR_FUNCIONARIOHACERASESORPAGRTIPOIDENTIFICACION = "Clas_1431626842112800Ser_10Arg_16_Alias";
    /** <code>funcionariohacerAsesorpagrTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_HACERASESOR_FUNCIONARIOHACERASESORPAGRTIPOIDENTIFICACION = "Tipo Identificación";
    /** <code>funcionariohacerAsesorpatrmodificaDirector</code> inbound argument name. */
    public static final String ARG_NAME_HACERASESOR_FUNCIONARIOHACERASESORPATRMODIFICADIRECTOR = "p_atrmodificaDirector";
    /** <code>funcionariohacerAsesorpatrmodificaDirector</code> inbound argument id. */
    public static final String ARG_ID_HACERASESOR_FUNCIONARIOHACERASESORPATRMODIFICADIRECTOR = "Clas_1431626842112800Ser_10Arg_8_Alias";
    /** <code>funcionariohacerAsesorpatrmodificaDirector</code> inbound argument alias. */
    public static final String ARG_ALIAS_HACERASESOR_FUNCIONARIOHACERASESORPATRMODIFICADIRECTOR = "p_atrmodificaDirector";
    /** <code>funcionariohacerAsesorpatresDirector</code> inbound argument name. */
    public static final String ARG_NAME_HACERASESOR_FUNCIONARIOHACERASESORPATRESDIRECTOR = "p_atresDirector";
    /** <code>funcionariohacerAsesorpatresDirector</code> inbound argument id. */
    public static final String ARG_ID_HACERASESOR_FUNCIONARIOHACERASESORPATRESDIRECTOR = "Clas_1431626842112800Ser_10Arg_9_Alias";
    /** <code>funcionariohacerAsesorpatresDirector</code> inbound argument alias. */
    public static final String ARG_ALIAS_HACERASESOR_FUNCIONARIOHACERASESORPATRESDIRECTOR = "p_atresDirector";
    /** <code>funcionariohacerAsesorpatrNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_HACERASESOR_FUNCIONARIOHACERASESORPATRNUMIDENTIFICACION = "p_atrNumIdentificacion";
    /** <code>funcionariohacerAsesorpatrNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_HACERASESOR_FUNCIONARIOHACERASESORPATRNUMIDENTIFICACION = "Clas_1431626842112800Ser_10Arg_10_Alias";
    /** <code>funcionariohacerAsesorpatrNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_HACERASESOR_FUNCIONARIOHACERASESORPATRNUMIDENTIFICACION = "p_atrNumIdentificacion";
    /** <code>funcionariohacerAsesorpatrModDBasicosPersona</code> inbound argument name. */
    public static final String ARG_NAME_HACERASESOR_FUNCIONARIOHACERASESORPATRMODDBASICOSPERSONA = "p_atrModDBasicosPersona";
    /** <code>funcionariohacerAsesorpatrModDBasicosPersona</code> inbound argument id. */
    public static final String ARG_ID_HACERASESOR_FUNCIONARIOHACERASESORPATRMODDBASICOSPERSONA = "Clas_1431626842112800Ser_10Arg_15_Alias";
    /** <code>funcionariohacerAsesorpatrModDBasicosPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_HACERASESOR_FUNCIONARIOHACERASESORPATRMODDBASICOSPERSONA = "p_atrModDBasicosPersona";
    /** <code>funcionariohacerAsesorpatrEsIntegral</code> inbound argument name. */
    public static final String ARG_NAME_HACERASESOR_FUNCIONARIOHACERASESORPATRESINTEGRAL = "p_atrEsIntegral";
    /** <code>funcionariohacerAsesorpatrEsIntegral</code> inbound argument id. */
    public static final String ARG_ID_HACERASESOR_FUNCIONARIOHACERASESORPATRESINTEGRAL = "Clas_1431626842112800Ser_10Arg_17_Alias";
    /** <code>funcionariohacerAsesorpatrEsIntegral</code> inbound argument alias. */
    public static final String ARG_ALIAS_HACERASESOR_FUNCIONARIOHACERASESORPATRESINTEGRAL = "p_atrEsIntegral";
    /** <code>funcionariohacerAsesorpatrVerDBasicosPersona</code> inbound argument name. */
    public static final String ARG_NAME_HACERASESOR_FUNCIONARIOHACERASESORPATRVERDBASICOSPERSONA = "p_atrVerDBasicosPersona";
    /** <code>funcionariohacerAsesorpatrVerDBasicosPersona</code> inbound argument id. */
    public static final String ARG_ID_HACERASESOR_FUNCIONARIOHACERASESORPATRVERDBASICOSPERSONA = "Clas_1431626842112800Ser_10Arg_18_Alias";
    /** <code>funcionariohacerAsesorpatrVerDBasicosPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_HACERASESOR_FUNCIONARIOHACERASESORPATRVERDBASICOSPERSONA = "p_atrVerDBasicosPersona";
    /** <code>funcionariohacerAsesorpatrVerDocIdentificacionPerso</code> inbound argument name. */
    public static final String ARG_NAME_HACERASESOR_FUNCIONARIOHACERASESORPATRVERDOCIDENTIFICACIONPERSO = "p_atrVerDocIdentificacionPerso";
    /** <code>funcionariohacerAsesorpatrVerDocIdentificacionPerso</code> inbound argument id. */
    public static final String ARG_ID_HACERASESOR_FUNCIONARIOHACERASESORPATRVERDOCIDENTIFICACIONPERSO = "Clas_1431626842112800Ser_10Arg_19_Alias";
    /** <code>funcionariohacerAsesorpatrVerDocIdentificacionPerso</code> inbound argument alias. */
    public static final String ARG_ALIAS_HACERASESOR_FUNCIONARIOHACERASESORPATRVERDOCIDENTIFICACIONPERSO = "p_atrVerDocIdentificacionPerso";
    /** <code>funcionariohacerAsesorpatrVerContratoNovedad</code> inbound argument name. */
    public static final String ARG_NAME_HACERASESOR_FUNCIONARIOHACERASESORPATRVERCONTRATONOVEDAD = "p_atrVerContratoNovedad";
    /** <code>funcionariohacerAsesorpatrVerContratoNovedad</code> inbound argument id. */
    public static final String ARG_ID_HACERASESOR_FUNCIONARIOHACERASESORPATRVERCONTRATONOVEDAD = "Clas_1431626842112800Ser_10Arg_20_Alias";
    /** <code>funcionariohacerAsesorpatrVerContratoNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_HACERASESOR_FUNCIONARIOHACERASESORPATRVERCONTRATONOVEDAD = "p_atrVerContratoNovedad";
    /** <code>funcionariohacerAsesorpatrCanalComercial</code> inbound argument name. */
    public static final String ARG_NAME_HACERASESOR_FUNCIONARIOHACERASESORPATRCANALCOMERCIAL = "p_atrCanalComercial";
    /** <code>funcionariohacerAsesorpatrCanalComercial</code> inbound argument id. */
    public static final String ARG_ID_HACERASESOR_FUNCIONARIOHACERASESORPATRCANALCOMERCIAL = "Clas_1431626842112800Ser_10Arg_21_Alias";
    /** <code>funcionariohacerAsesorpatrCanalComercial</code> inbound argument alias. */
    public static final String ARG_ALIAS_HACERASESOR_FUNCIONARIOHACERASESORPATRCANALCOMERCIAL = "p_atrCanalComercial";
    /** <code>funcionariohacerAsesorpatrCargo</code> inbound argument name. */
    public static final String ARG_NAME_HACERASESOR_FUNCIONARIOHACERASESORPATRCARGO = "p_atrCargo";
    /** <code>funcionariohacerAsesorpatrCargo</code> inbound argument id. */
    public static final String ARG_ID_HACERASESOR_FUNCIONARIOHACERASESORPATRCARGO = "Clas_1431626842112800Ser_10Arg_22_Alias";
    /** <code>funcionariohacerAsesorpatrCargo</code> inbound argument alias. */
    public static final String ARG_ALIAS_HACERASESOR_FUNCIONARIOHACERASESORPATRCARGO = "p_atrCargo";
    /** <code>funcionariohacerAsesorpatrEstado</code> inbound argument name. */
    public static final String ARG_NAME_HACERASESOR_FUNCIONARIOHACERASESORPATRESTADO = "p_atrEstado";
    /** <code>funcionariohacerAsesorpatrEstado</code> inbound argument id. */
    public static final String ARG_ID_HACERASESOR_FUNCIONARIOHACERASESORPATRESTADO = "Clas_1431626842112800Ser_10Arg_23_Alias";
    /** <code>funcionariohacerAsesorpatrEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_HACERASESOR_FUNCIONARIOHACERASESORPATRESTADO = "p_atrEstado";
    /** <code>funcionariohacerAsesorpatrAccesoValidadorUsuarios</code> inbound argument name. */
    public static final String ARG_NAME_HACERASESOR_FUNCIONARIOHACERASESORPATRACCESOVALIDADORUSUARIOS = "p_atrAccesoValidadorUsuarios";
    /** <code>funcionariohacerAsesorpatrAccesoValidadorUsuarios</code> inbound argument id. */
    public static final String ARG_ID_HACERASESOR_FUNCIONARIOHACERASESORPATRACCESOVALIDADORUSUARIOS = "Clas_1431626842112800Ser_10Arg_24_Alias";
    /** <code>funcionariohacerAsesorpatrAccesoValidadorUsuarios</code> inbound argument alias. */
    public static final String ARG_ALIAS_HACERASESOR_FUNCIONARIOHACERASESORPATRACCESOVALIDADORUSUARIOS = "p_atrAccesoValidadorUsuarios";
    /** <code>funcionariohacerAsesorpCodJefe</code> inbound argument name. */
    public static final String ARG_NAME_HACERASESOR_FUNCIONARIOHACERASESORPCODJEFE = "p_CodJefe";
    /** <code>funcionariohacerAsesorpCodJefe</code> inbound argument id. */
    public static final String ARG_ID_HACERASESOR_FUNCIONARIOHACERASESORPCODJEFE = "Clas_1431626842112800Ser_10Arg_12_Alias";
    /** <code>funcionariohacerAsesorpCodJefe</code> inbound argument alias. */
    public static final String ARG_ALIAS_HACERASESOR_FUNCIONARIOHACERASESORPCODJEFE = "Cod. Jefe";
    // Service (sincronizarAsesor)
    /** <code>sincronizarAsesor</code> service id. */
    public static final String SERV_ID_SINCRONIZARASESOR = "Clas_1431626842112800Ser_12_Alias";
    /** <code>sincronizarAsesor</code> service name. */
    public static final String SERV_NAME_SINCRONIZARASESOR = "sincronizarAsesor";
    /** <code>sincronizarAsesor</code> service alias. */
    public static final String SERV_ALIAS_SINCRONIZARASESOR = "sincronizarAsesor";
    /** Agents allowed to execute the service sincronizarAsesor **/
    public static final String SINCRONIZARASESOR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionariosincronizarAsesorpthisAgente</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZARASESOR_FUNCIONARIOSINCRONIZARASESORPTHISAGENTE = "p_thisAgente";
    /** <code>funcionariosincronizarAsesorpthisAgente</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZARASESOR_FUNCIONARIOSINCRONIZARASESORPTHISAGENTE = "Clas_1431626842112800Ser_12Arg_1_Alias";
    /** <code>funcionariosincronizarAsesorpthisAgente</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZARASESOR_FUNCIONARIOSINCRONIZARASESORPTHISAGENTE = "Usuario";
    /** <code>funcionariosincronizarAsesorpPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZARASESOR_FUNCIONARIOSINCRONIZARASESORPPRIMERNOMBRE = "p_PrimerNombre";
    /** <code>funcionariosincronizarAsesorpPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZARASESOR_FUNCIONARIOSINCRONIZARASESORPPRIMERNOMBRE = "Clas_1431626842112800Ser_12Arg_2_Alias";
    /** <code>funcionariosincronizarAsesorpPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZARASESOR_FUNCIONARIOSINCRONIZARASESORPPRIMERNOMBRE = "Primer nombre";
    /** <code>funcionariosincronizarAsesorpSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZARASESOR_FUNCIONARIOSINCRONIZARASESORPSEGUNDONOMBRE = "p_SegundoNombre";
    /** <code>funcionariosincronizarAsesorpSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZARASESOR_FUNCIONARIOSINCRONIZARASESORPSEGUNDONOMBRE = "Clas_1431626842112800Ser_12Arg_3_Alias";
    /** <code>funcionariosincronizarAsesorpSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZARASESOR_FUNCIONARIOSINCRONIZARASESORPSEGUNDONOMBRE = "Segundo nombre";
    /** <code>funcionariosincronizarAsesorpPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZARASESOR_FUNCIONARIOSINCRONIZARASESORPPRIMERAPELLIDO = "p_PrimerApellido";
    /** <code>funcionariosincronizarAsesorpPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZARASESOR_FUNCIONARIOSINCRONIZARASESORPPRIMERAPELLIDO = "Clas_1431626842112800Ser_12Arg_4_Alias";
    /** <code>funcionariosincronizarAsesorpPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZARASESOR_FUNCIONARIOSINCRONIZARASESORPPRIMERAPELLIDO = "Primer apellido";
    /** <code>funcionariosincronizarAsesorpSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZARASESOR_FUNCIONARIOSINCRONIZARASESORPSEGUNDOAPELLIDO = "p_SegundoApellido";
    /** <code>funcionariosincronizarAsesorpSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZARASESOR_FUNCIONARIOSINCRONIZARASESORPSEGUNDOAPELLIDO = "Clas_1431626842112800Ser_12Arg_5_Alias";
    /** <code>funcionariosincronizarAsesorpSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZARASESOR_FUNCIONARIOSINCRONIZARASESORPSEGUNDOAPELLIDO = "Segundo apellido";
    // Service (hacerRespRegional)
    /** <code>hacerRespRegional</code> service id. */
    public static final String SERV_ID_HACERRESPREGIONAL = "Clas_1431626842112800Ser_17_Alias";
    /** <code>hacerRespRegional</code> service name. */
    public static final String SERV_NAME_HACERRESPREGIONAL = "hacerRespRegional";
    /** <code>hacerRespRegional</code> service alias. */
    public static final String SERV_ALIAS_HACERRESPREGIONAL = "hacerRespRegional";
    /** Agents allowed to execute the service hacerRespRegional **/
    public static final String HACERRESPREGIONAL_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionariohacerRespRegionalpthisAgente</code> inbound argument name. */
    public static final String ARG_NAME_HACERRESPREGIONAL_FUNCIONARIOHACERRESPREGIONALPTHISAGENTE = "p_thisAgente";
    /** <code>funcionariohacerRespRegionalpthisAgente</code> inbound argument id. */
    public static final String ARG_ID_HACERRESPREGIONAL_FUNCIONARIOHACERRESPREGIONALPTHISAGENTE = "Clas_1431626842112800Ser_17Arg_1_Alias";
    /** <code>funcionariohacerRespRegionalpthisAgente</code> inbound argument alias. */
    public static final String ARG_ALIAS_HACERRESPREGIONAL_FUNCIONARIOHACERRESPREGIONALPTHISAGENTE = "Usuario";
    /** <code>funcionariohacerRespRegionalpagrRegional</code> inbound argument name. */
    public static final String ARG_NAME_HACERRESPREGIONAL_FUNCIONARIOHACERRESPREGIONALPAGRREGIONAL = "p_agrRegional";
    /** <code>funcionariohacerRespRegionalpagrRegional</code> inbound argument id. */
    public static final String ARG_ID_HACERRESPREGIONAL_FUNCIONARIOHACERRESPREGIONALPAGRREGIONAL = "Clas_1431626842112800Ser_17Arg_5_Alias";
    /** <code>funcionariohacerRespRegionalpagrRegional</code> inbound argument alias. */
    public static final String ARG_ALIAS_HACERRESPREGIONAL_FUNCIONARIOHACERRESPREGIONALPAGRREGIONAL = "Regional";
    // Service (hacerAreaMedica)
    /** <code>hacerAreaMedica</code> service id. */
    public static final String SERV_ID_HACERAREAMEDICA = "Clas_1431626842112800Ser_18_Alias";
    /** <code>hacerAreaMedica</code> service name. */
    public static final String SERV_NAME_HACERAREAMEDICA = "hacerAreaMedica";
    /** <code>hacerAreaMedica</code> service alias. */
    public static final String SERV_ALIAS_HACERAREAMEDICA = "hacerAreaMedica";
    /** Agents allowed to execute the service hacerAreaMedica **/
    public static final String HACERAREAMEDICA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionariohacerAreaMedicapthisAgente</code> inbound argument name. */
    public static final String ARG_NAME_HACERAREAMEDICA_FUNCIONARIOHACERAREAMEDICAPTHISAGENTE = "p_thisAgente";
    /** <code>funcionariohacerAreaMedicapthisAgente</code> inbound argument id. */
    public static final String ARG_ID_HACERAREAMEDICA_FUNCIONARIOHACERAREAMEDICAPTHISAGENTE = "Clas_1431626842112800Ser_18Arg_1_Alias";
    /** <code>funcionariohacerAreaMedicapthisAgente</code> inbound argument alias. */
    public static final String ARG_ALIAS_HACERAREAMEDICA_FUNCIONARIOHACERAREAMEDICAPTHISAGENTE = "Usuario";
    // Service (hacerAfiliaciones)
    /** <code>hacerAfiliaciones</code> service id. */
    public static final String SERV_ID_HACERAFILIACIONES = "Clas_1431626842112800Ser_19_Alias";
    /** <code>hacerAfiliaciones</code> service name. */
    public static final String SERV_NAME_HACERAFILIACIONES = "hacerAfiliaciones";
    /** <code>hacerAfiliaciones</code> service alias. */
    public static final String SERV_ALIAS_HACERAFILIACIONES = "hacerAfiliaciones";
    /** Agents allowed to execute the service hacerAfiliaciones **/
    public static final String HACERAFILIACIONES_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionariohacerAfiliacionespthisAgente</code> inbound argument name. */
    public static final String ARG_NAME_HACERAFILIACIONES_FUNCIONARIOHACERAFILIACIONESPTHISAGENTE = "p_thisAgente";
    /** <code>funcionariohacerAfiliacionespthisAgente</code> inbound argument id. */
    public static final String ARG_ID_HACERAFILIACIONES_FUNCIONARIOHACERAFILIACIONESPTHISAGENTE = "Clas_1431626842112800Ser_19Arg_1_Alias";
    /** <code>funcionariohacerAfiliacionespthisAgente</code> inbound argument alias. */
    public static final String ARG_ALIAS_HACERAFILIACIONES_FUNCIONARIOHACERAFILIACIONESPTHISAGENTE = "Usuario";
    // Service (CambSucursalAgente)
    /** <code>CambSucursalAgente</code> service id. */
    public static final String SERV_ID_CAMBSUCURSALAGENTE = "Clas_1431626842112800Ser_14_Alias";
    /** <code>CambSucursalAgente</code> service name. */
    public static final String SERV_NAME_CAMBSUCURSALAGENTE = "CambSucursalAgente";
    /** <code>CambSucursalAgente</code> service alias. */
    public static final String SERV_ALIAS_CAMBSUCURSALAGENTE = "CambSucursalAgente";
    /** Agents allowed to execute the service CambSucursalAgente **/
    public static final String CAMBSUCURSALAGENTE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionarioCambSucursalAgentepthisAgente</code> inbound argument name. */
    public static final String ARG_NAME_CAMBSUCURSALAGENTE_FUNCIONARIOCAMBSUCURSALAGENTEPTHISAGENTE = "p_thisAgente";
    /** <code>funcionarioCambSucursalAgentepthisAgente</code> inbound argument id. */
    public static final String ARG_ID_CAMBSUCURSALAGENTE_FUNCIONARIOCAMBSUCURSALAGENTEPTHISAGENTE = "Clas_1431626842112800Ser_14Arg_1_Alias";
    /** <code>funcionarioCambSucursalAgentepthisAgente</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBSUCURSALAGENTE_FUNCIONARIOCAMBSUCURSALAGENTEPTHISAGENTE = "Agentes";
    /** <code>funcionarioCambSucursalAgentepevcSucursal</code> inbound argument name. */
    public static final String ARG_NAME_CAMBSUCURSALAGENTE_FUNCIONARIOCAMBSUCURSALAGENTEPEVCSUCURSAL = "p_evcSucursal";
    /** <code>funcionarioCambSucursalAgentepevcSucursal</code> inbound argument id. */
    public static final String ARG_ID_CAMBSUCURSALAGENTE_FUNCIONARIOCAMBSUCURSALAGENTEPEVCSUCURSAL = "Clas_1431626842112800Ser_14Arg_2_Alias";
    /** <code>funcionarioCambSucursalAgentepevcSucursal</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBSUCURSALAGENTE_FUNCIONARIOCAMBSUCURSALAGENTEPEVCSUCURSAL = "Sucursal";
    // Service (deshacerAdmin)
    /** <code>deshacerAdmin</code> service id. */
    public static final String SERV_ID_DESHACERADMIN = "Clas_1431626842112800Ser_20_Alias";
    /** <code>deshacerAdmin</code> service name. */
    public static final String SERV_NAME_DESHACERADMIN = "deshacerAdmin";
    /** <code>deshacerAdmin</code> service alias. */
    public static final String SERV_ALIAS_DESHACERADMIN = "deshacerAdmin";
    /** Agents allowed to execute the service deshacerAdmin **/
    public static final String DESHACERADMIN_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionariodeshacerAdminpthisAgente</code> inbound argument name. */
    public static final String ARG_NAME_DESHACERADMIN_FUNCIONARIODESHACERADMINPTHISAGENTE = "p_thisAgente";
    /** <code>funcionariodeshacerAdminpthisAgente</code> inbound argument id. */
    public static final String ARG_ID_DESHACERADMIN_FUNCIONARIODESHACERADMINPTHISAGENTE = "Clas_1431626842112800Ser_20Arg_1_Alias";
    /** <code>funcionariodeshacerAdminpthisAgente</code> inbound argument alias. */
    public static final String ARG_ALIAS_DESHACERADMIN_FUNCIONARIODESHACERADMINPTHISAGENTE = "Usuario";
    // Service (deshacerSuperAdmin)
    /** <code>deshacerSuperAdmin</code> service id. */
    public static final String SERV_ID_DESHACERSUPERADMIN = "Clas_1431626842112800Ser_21_Alias";
    /** <code>deshacerSuperAdmin</code> service name. */
    public static final String SERV_NAME_DESHACERSUPERADMIN = "deshacerSuperAdmin";
    /** <code>deshacerSuperAdmin</code> service alias. */
    public static final String SERV_ALIAS_DESHACERSUPERADMIN = "deshacerSuperAdmin";
    /** Agents allowed to execute the service deshacerSuperAdmin **/
    public static final String DESHACERSUPERADMIN_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionariodeshacerSuperAdminpthisAgente</code> inbound argument name. */
    public static final String ARG_NAME_DESHACERSUPERADMIN_FUNCIONARIODESHACERSUPERADMINPTHISAGENTE = "p_thisAgente";
    /** <code>funcionariodeshacerSuperAdminpthisAgente</code> inbound argument id. */
    public static final String ARG_ID_DESHACERSUPERADMIN_FUNCIONARIODESHACERSUPERADMINPTHISAGENTE = "Clas_1431626842112800Ser_21Arg_1_Alias";
    /** <code>funcionariodeshacerSuperAdminpthisAgente</code> inbound argument alias. */
    public static final String ARG_ALIAS_DESHACERSUPERADMIN_FUNCIONARIODESHACERSUPERADMINPTHISAGENTE = "Usuario";
    // Service (deshacerAsesor)
    /** <code>deshacerAsesor</code> service id. */
    public static final String SERV_ID_DESHACERASESOR = "Clas_1431626842112800Ser_22_Alias";
    /** <code>deshacerAsesor</code> service name. */
    public static final String SERV_NAME_DESHACERASESOR = "deshacerAsesor";
    /** <code>deshacerAsesor</code> service alias. */
    public static final String SERV_ALIAS_DESHACERASESOR = "deshacerAsesor";
    /** Agents allowed to execute the service deshacerAsesor **/
    public static final String DESHACERASESOR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionariodeshacerAsesorpthisAgente</code> inbound argument name. */
    public static final String ARG_NAME_DESHACERASESOR_FUNCIONARIODESHACERASESORPTHISAGENTE = "p_thisAgente";
    /** <code>funcionariodeshacerAsesorpthisAgente</code> inbound argument id. */
    public static final String ARG_ID_DESHACERASESOR_FUNCIONARIODESHACERASESORPTHISAGENTE = "Clas_1431626842112800Ser_22Arg_1_Alias";
    /** <code>funcionariodeshacerAsesorpthisAgente</code> inbound argument alias. */
    public static final String ARG_ALIAS_DESHACERASESOR_FUNCIONARIODESHACERASESORPTHISAGENTE = "Usuario";
    // Service (deshacerRespRegional)
    /** <code>deshacerRespRegional</code> service id. */
    public static final String SERV_ID_DESHACERRESPREGIONAL = "Clas_1431626842112800Ser_24_Alias";
    /** <code>deshacerRespRegional</code> service name. */
    public static final String SERV_NAME_DESHACERRESPREGIONAL = "deshacerRespRegional";
    /** <code>deshacerRespRegional</code> service alias. */
    public static final String SERV_ALIAS_DESHACERRESPREGIONAL = "deshacerRespRegional";
    /** Agents allowed to execute the service deshacerRespRegional **/
    public static final String DESHACERRESPREGIONAL_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionariodeshacerRespRegionalpthisAgente</code> inbound argument name. */
    public static final String ARG_NAME_DESHACERRESPREGIONAL_FUNCIONARIODESHACERRESPREGIONALPTHISAGENTE = "p_thisAgente";
    /** <code>funcionariodeshacerRespRegionalpthisAgente</code> inbound argument id. */
    public static final String ARG_ID_DESHACERRESPREGIONAL_FUNCIONARIODESHACERRESPREGIONALPTHISAGENTE = "Clas_1431626842112800Ser_24Arg_1_Alias";
    /** <code>funcionariodeshacerRespRegionalpthisAgente</code> inbound argument alias. */
    public static final String ARG_ALIAS_DESHACERRESPREGIONAL_FUNCIONARIODESHACERRESPREGIONALPTHISAGENTE = "Usuario";
    // Service (deshacerAreaMedica)
    /** <code>deshacerAreaMedica</code> service id. */
    public static final String SERV_ID_DESHACERAREAMEDICA = "Clas_1431626842112800Ser_25_Alias";
    /** <code>deshacerAreaMedica</code> service name. */
    public static final String SERV_NAME_DESHACERAREAMEDICA = "deshacerAreaMedica";
    /** <code>deshacerAreaMedica</code> service alias. */
    public static final String SERV_ALIAS_DESHACERAREAMEDICA = "deshacerAreaMedica";
    /** Agents allowed to execute the service deshacerAreaMedica **/
    public static final String DESHACERAREAMEDICA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionariodeshacerAreaMedicapthisAgente</code> inbound argument name. */
    public static final String ARG_NAME_DESHACERAREAMEDICA_FUNCIONARIODESHACERAREAMEDICAPTHISAGENTE = "p_thisAgente";
    /** <code>funcionariodeshacerAreaMedicapthisAgente</code> inbound argument id. */
    public static final String ARG_ID_DESHACERAREAMEDICA_FUNCIONARIODESHACERAREAMEDICAPTHISAGENTE = "Clas_1431626842112800Ser_25Arg_1_Alias";
    /** <code>funcionariodeshacerAreaMedicapthisAgente</code> inbound argument alias. */
    public static final String ARG_ALIAS_DESHACERAREAMEDICA_FUNCIONARIODESHACERAREAMEDICAPTHISAGENTE = "Usuario";
    // Service (deshacerAfiliaciones)
    /** <code>deshacerAfiliaciones</code> service id. */
    public static final String SERV_ID_DESHACERAFILIACIONES = "Clas_1431626842112800Ser_26_Alias";
    /** <code>deshacerAfiliaciones</code> service name. */
    public static final String SERV_NAME_DESHACERAFILIACIONES = "deshacerAfiliaciones";
    /** <code>deshacerAfiliaciones</code> service alias. */
    public static final String SERV_ALIAS_DESHACERAFILIACIONES = "deshacerAfiliaciones";
    /** Agents allowed to execute the service deshacerAfiliaciones **/
    public static final String DESHACERAFILIACIONES_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionariodeshacerAfiliacionespthisAgente</code> inbound argument name. */
    public static final String ARG_NAME_DESHACERAFILIACIONES_FUNCIONARIODESHACERAFILIACIONESPTHISAGENTE = "p_thisAgente";
    /** <code>funcionariodeshacerAfiliacionespthisAgente</code> inbound argument id. */
    public static final String ARG_ID_DESHACERAFILIACIONES_FUNCIONARIODESHACERAFILIACIONESPTHISAGENTE = "Clas_1431626842112800Ser_26Arg_1_Alias";
    /** <code>funcionariodeshacerAfiliacionespthisAgente</code> inbound argument alias. */
    public static final String ARG_ALIAS_DESHACERAFILIACIONES_FUNCIONARIODESHACERAFILIACIONESPTHISAGENTE = "Usuario";
    // Service (CambRolAgente)
    /** <code>CambRolAgente</code> service id. */
    public static final String SERV_ID_CAMBROLAGENTE = "Clas_1431626842112800Ser_30_Alias";
    /** <code>CambRolAgente</code> service name. */
    public static final String SERV_NAME_CAMBROLAGENTE = "CambRolAgente";
    /** <code>CambRolAgente</code> service alias. */
    public static final String SERV_ALIAS_CAMBROLAGENTE = "CambRolAgente";
    /** Agents allowed to execute the service CambRolAgente **/
    public static final String CAMBROLAGENTE_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>funcionarioCambRolAgentepthisAgente</code> inbound argument name. */
    public static final String ARG_NAME_CAMBROLAGENTE_FUNCIONARIOCAMBROLAGENTEPTHISAGENTE = "p_thisAgente";
    /** <code>funcionarioCambRolAgentepthisAgente</code> inbound argument id. */
    public static final String ARG_ID_CAMBROLAGENTE_FUNCIONARIOCAMBROLAGENTEPTHISAGENTE = "Clas_1431626842112800Ser_30Arg_1_Alias";
    /** <code>funcionarioCambRolAgentepthisAgente</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBROLAGENTE_FUNCIONARIOCAMBROLAGENTEPTHISAGENTE = "Agentes";
    /** <code>funcionarioCambRolAgentepevcRol</code> inbound argument name. */
    public static final String ARG_NAME_CAMBROLAGENTE_FUNCIONARIOCAMBROLAGENTEPEVCROL = "p_evcRol";
    /** <code>funcionarioCambRolAgentepevcRol</code> inbound argument id. */
    public static final String ARG_ID_CAMBROLAGENTE_FUNCIONARIOCAMBROLAGENTEPEVCROL = "Clas_1431626842112800Ser_30Arg_2_Alias";
    /** <code>funcionarioCambRolAgentepevcRol</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBROLAGENTE_FUNCIONARIOCAMBROLAGENTEPEVCROL = "Rol";
    // Service (modAsesorAgencia)
    /** <code>modAsesorAgencia</code> service id. */
    public static final String SERV_ID_MODASESORAGENCIA = "Clas_1431626842112800Ser_35_Alias";
    /** <code>modAsesorAgencia</code> service name. */
    public static final String SERV_NAME_MODASESORAGENCIA = "modAsesorAgencia";
    /** <code>modAsesorAgencia</code> service alias. */
    public static final String SERV_ALIAS_MODASESORAGENCIA = "modAsesorAgencia";
    /** Agents allowed to execute the service modAsesorAgencia **/
    public static final String MODASESORAGENCIA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionariomodAsesorAgenciapthisFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_MODASESORAGENCIA_FUNCIONARIOMODASESORAGENCIAPTHISFUNCIONARIO = "p_thisFuncionario";
    /** <code>funcionariomodAsesorAgenciapthisFuncionario</code> inbound argument id. */
    public static final String ARG_ID_MODASESORAGENCIA_FUNCIONARIOMODASESORAGENCIAPTHISFUNCIONARIO = "Clas_1431626842112800Ser_35Arg_1_Alias";
    /** <code>funcionariomodAsesorAgenciapthisFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODASESORAGENCIA_FUNCIONARIOMODASESORAGENCIAPTHISFUNCIONARIO = "Usuario";
    /** <code>funcionariomodAsesorAgenciapeNumUsuario</code> inbound argument name. */
    public static final String ARG_NAME_MODASESORAGENCIA_FUNCIONARIOMODASESORAGENCIAPENUMUSUARIO = "peNumUsuario";
    /** <code>funcionariomodAsesorAgenciapeNumUsuario</code> inbound argument id. */
    public static final String ARG_ID_MODASESORAGENCIA_FUNCIONARIOMODASESORAGENCIAPENUMUSUARIO = "Clas_1431626842112800Ser_35Arg_2_Alias";
    /** <code>funcionariomodAsesorAgenciapeNumUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODASESORAGENCIA_FUNCIONARIOMODASESORAGENCIAPENUMUSUARIO = "Usuario";
    /** <code>funcionariomodAsesorAgenciapeCodJefe</code> inbound argument name. */
    public static final String ARG_NAME_MODASESORAGENCIA_FUNCIONARIOMODASESORAGENCIAPECODJEFE = "peCodJefe";
    /** <code>funcionariomodAsesorAgenciapeCodJefe</code> inbound argument id. */
    public static final String ARG_ID_MODASESORAGENCIA_FUNCIONARIOMODASESORAGENCIAPECODJEFE = "Clas_1431626842112800Ser_35Arg_3_Alias";
    /** <code>funcionariomodAsesorAgenciapeCodJefe</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODASESORAGENCIA_FUNCIONARIOMODASESORAGENCIAPECODJEFE = "Cod. Jefe";
    // Service (InsReporteFuncionario)
    /** <code>InsReporteFuncionario</code> service id. */
    public static final String SERV_ID_INSREPORTEFUNCIONARIO = "Clas_1431626842112800Ser_36_Alias";
    /** <code>InsReporteFuncionario</code> service name. */
    public static final String SERV_NAME_INSREPORTEFUNCIONARIO = "InsReporteFuncionario";
    /** <code>InsReporteFuncionario</code> service alias. */
    public static final String SERV_ALIAS_INSREPORTEFUNCIONARIO = "Asignar usuario";
    /** Agents allowed to execute the service InsReporteFuncionario **/
    public static final String INSREPORTEFUNCIONARIO_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>funcionarioInsReporteFuncionariopthisFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_INSREPORTEFUNCIONARIO_FUNCIONARIOINSREPORTEFUNCIONARIOPTHISFUNCIONARIO = "p_thisFuncionario";
    /** <code>funcionarioInsReporteFuncionariopthisFuncionario</code> inbound argument id. */
    public static final String ARG_ID_INSREPORTEFUNCIONARIO_FUNCIONARIOINSREPORTEFUNCIONARIOPTHISFUNCIONARIO = "Clas_1431626842112800Ser_36Arg_1_Alias";
    /** <code>funcionarioInsReporteFuncionariopthisFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSREPORTEFUNCIONARIO_FUNCIONARIOINSREPORTEFUNCIONARIOPTHISFUNCIONARIO = "Funcionario";
    /** <code>funcionarioInsReporteFuncionariopevcReportesProcAlm</code> inbound argument name. */
    public static final String ARG_NAME_INSREPORTEFUNCIONARIO_FUNCIONARIOINSREPORTEFUNCIONARIOPEVCREPORTESPROCALM = "p_evcReportesProcAlm";
    /** <code>funcionarioInsReporteFuncionariopevcReportesProcAlm</code> inbound argument id. */
    public static final String ARG_ID_INSREPORTEFUNCIONARIO_FUNCIONARIOINSREPORTEFUNCIONARIOPEVCREPORTESPROCALM = "Clas_1431626842112800Ser_36Arg_2_Alias";
    /** <code>funcionarioInsReporteFuncionariopevcReportesProcAlm</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSREPORTEFUNCIONARIO_FUNCIONARIOINSREPORTEFUNCIONARIOPEVCREPORTESPROCALM = "Reportes";
    // Service (DelReporteFuncionario)
    /** <code>DelReporteFuncionario</code> service id. */
    public static final String SERV_ID_DELREPORTEFUNCIONARIO = "Clas_1431626842112800Ser_37_Alias";
    /** <code>DelReporteFuncionario</code> service name. */
    public static final String SERV_NAME_DELREPORTEFUNCIONARIO = "DelReporteFuncionario";
    /** <code>DelReporteFuncionario</code> service alias. */
    public static final String SERV_ALIAS_DELREPORTEFUNCIONARIO = "Quitar usuario";
    /** Agents allowed to execute the service DelReporteFuncionario **/
    public static final String DELREPORTEFUNCIONARIO_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>funcionarioDelReporteFuncionariopthisFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_DELREPORTEFUNCIONARIO_FUNCIONARIODELREPORTEFUNCIONARIOPTHISFUNCIONARIO = "p_thisFuncionario";
    /** <code>funcionarioDelReporteFuncionariopthisFuncionario</code> inbound argument id. */
    public static final String ARG_ID_DELREPORTEFUNCIONARIO_FUNCIONARIODELREPORTEFUNCIONARIOPTHISFUNCIONARIO = "Clas_1431626842112800Ser_37Arg_1_Alias";
    /** <code>funcionarioDelReporteFuncionariopthisFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELREPORTEFUNCIONARIO_FUNCIONARIODELREPORTEFUNCIONARIOPTHISFUNCIONARIO = "Funcionarios";
    /** <code>funcionarioDelReporteFuncionariopevcReportesProcAlm</code> inbound argument name. */
    public static final String ARG_NAME_DELREPORTEFUNCIONARIO_FUNCIONARIODELREPORTEFUNCIONARIOPEVCREPORTESPROCALM = "p_evcReportesProcAlm";
    /** <code>funcionarioDelReporteFuncionariopevcReportesProcAlm</code> inbound argument id. */
    public static final String ARG_ID_DELREPORTEFUNCIONARIO_FUNCIONARIODELREPORTEFUNCIONARIOPEVCREPORTESPROCALM = "Clas_1431626842112800Ser_37Arg_2_Alias";
    /** <code>funcionarioDelReporteFuncionariopevcReportesProcAlm</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELREPORTEFUNCIONARIO_FUNCIONARIODELREPORTEFUNCIONARIOPEVCREPORTESPROCALM = "Reportes";
    // Service (AddFuncionarioGrupo)
    /** <code>AddFuncionarioGrupo</code> service id. */
    public static final String SERV_ID_ADDFUNCIONARIOGRUPO = "Clas_1431626842112800Ser_38_Alias";
    /** <code>AddFuncionarioGrupo</code> service name. */
    public static final String SERV_NAME_ADDFUNCIONARIOGRUPO = "AddFuncionarioGrupo";
    /** <code>AddFuncionarioGrupo</code> service alias. */
    public static final String SERV_ALIAS_ADDFUNCIONARIOGRUPO = "AddFuncionarioGrupo";
    /** Agents allowed to execute the service AddFuncionarioGrupo **/
    public static final String ADDFUNCIONARIOGRUPO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionarioAddFuncionarioGrupopthisFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_ADDFUNCIONARIOGRUPO_FUNCIONARIOADDFUNCIONARIOGRUPOPTHISFUNCIONARIO = "p_thisFuncionario";
    /** <code>funcionarioAddFuncionarioGrupopthisFuncionario</code> inbound argument id. */
    public static final String ARG_ID_ADDFUNCIONARIOGRUPO_FUNCIONARIOADDFUNCIONARIOGRUPOPTHISFUNCIONARIO = "Clas_1431626842112800Ser_38Arg_1_Alias";
    /** <code>funcionarioAddFuncionarioGrupopthisFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_ADDFUNCIONARIOGRUPO_FUNCIONARIOADDFUNCIONARIOGRUPOPTHISFUNCIONARIO = "Funcionario";
    /** <code>funcionarioAddFuncionarioGrupopevcGrupoAsignacion</code> inbound argument name. */
    public static final String ARG_NAME_ADDFUNCIONARIOGRUPO_FUNCIONARIOADDFUNCIONARIOGRUPOPEVCGRUPOASIGNACION = "p_evcGrupoAsignacion";
    /** <code>funcionarioAddFuncionarioGrupopevcGrupoAsignacion</code> inbound argument id. */
    public static final String ARG_ID_ADDFUNCIONARIOGRUPO_FUNCIONARIOADDFUNCIONARIOGRUPOPEVCGRUPOASIGNACION = "Clas_1431626842112800Ser_38Arg_2_Alias";
    /** <code>funcionarioAddFuncionarioGrupopevcGrupoAsignacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_ADDFUNCIONARIOGRUPO_FUNCIONARIOADDFUNCIONARIOGRUPOPEVCGRUPOASIGNACION = "GrupoAsignacion";
    // Service (DelFuncionarioGrupo)
    /** <code>DelFuncionarioGrupo</code> service id. */
    public static final String SERV_ID_DELFUNCIONARIOGRUPO = "Clas_1431626842112800Ser_39_Alias";
    /** <code>DelFuncionarioGrupo</code> service name. */
    public static final String SERV_NAME_DELFUNCIONARIOGRUPO = "DelFuncionarioGrupo";
    /** <code>DelFuncionarioGrupo</code> service alias. */
    public static final String SERV_ALIAS_DELFUNCIONARIOGRUPO = "DelFuncionarioGrupo";
    /** Agents allowed to execute the service DelFuncionarioGrupo **/
    public static final String DELFUNCIONARIOGRUPO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionarioDelFuncionarioGrupopthisFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_DELFUNCIONARIOGRUPO_FUNCIONARIODELFUNCIONARIOGRUPOPTHISFUNCIONARIO = "p_thisFuncionario";
    /** <code>funcionarioDelFuncionarioGrupopthisFuncionario</code> inbound argument id. */
    public static final String ARG_ID_DELFUNCIONARIOGRUPO_FUNCIONARIODELFUNCIONARIOGRUPOPTHISFUNCIONARIO = "Clas_1431626842112800Ser_39Arg_1_Alias";
    /** <code>funcionarioDelFuncionarioGrupopthisFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELFUNCIONARIOGRUPO_FUNCIONARIODELFUNCIONARIOGRUPOPTHISFUNCIONARIO = "Funcionario";
    /** <code>funcionarioDelFuncionarioGrupopevcGrupoAsignacion</code> inbound argument name. */
    public static final String ARG_NAME_DELFUNCIONARIOGRUPO_FUNCIONARIODELFUNCIONARIOGRUPOPEVCGRUPOASIGNACION = "p_evcGrupoAsignacion";
    /** <code>funcionarioDelFuncionarioGrupopevcGrupoAsignacion</code> inbound argument id. */
    public static final String ARG_ID_DELFUNCIONARIOGRUPO_FUNCIONARIODELFUNCIONARIOGRUPOPEVCGRUPOASIGNACION = "Clas_1431626842112800Ser_39Arg_2_Alias";
    /** <code>funcionarioDelFuncionarioGrupopevcGrupoAsignacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELFUNCIONARIOGRUPO_FUNCIONARIODELFUNCIONARIOGRUPOPEVCGRUPOASIGNACION = "GrupoAsignacion";
    // Service (InsSolNovUsrAfiliacion)
    /** <code>InsSolNovUsrAfiliacion</code> service id. */
    public static final String SERV_ID_INSSOLNOVUSRAFILIACION = "Clas_1431626842112800Ser_40_Alias";
    /** <code>InsSolNovUsrAfiliacion</code> service name. */
    public static final String SERV_NAME_INSSOLNOVUSRAFILIACION = "InsSolNovUsrAfiliacion";
    /** <code>InsSolNovUsrAfiliacion</code> service alias. */
    public static final String SERV_ALIAS_INSSOLNOVUSRAFILIACION = "InsSolNovUsrAfiliacion";
    /** Agents allowed to execute the service InsSolNovUsrAfiliacion **/
    public static final String INSSOLNOVUSRAFILIACION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionarioInsSolNovUsrAfiliacionpthisFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_INSSOLNOVUSRAFILIACION_FUNCIONARIOINSSOLNOVUSRAFILIACIONPTHISFUNCIONARIO = "p_thisFuncionario";
    /** <code>funcionarioInsSolNovUsrAfiliacionpthisFuncionario</code> inbound argument id. */
    public static final String ARG_ID_INSSOLNOVUSRAFILIACION_FUNCIONARIOINSSOLNOVUSRAFILIACIONPTHISFUNCIONARIO = "Clas_1431626842112800Ser_40Arg_1_Alias";
    /** <code>funcionarioInsSolNovUsrAfiliacionpthisFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSSOLNOVUSRAFILIACION_FUNCIONARIOINSSOLNOVUSRAFILIACIONPTHISFUNCIONARIO = "Afiliación";
    /** <code>funcionarioInsSolNovUsrAfiliacionpevcSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_INSSOLNOVUSRAFILIACION_FUNCIONARIOINSSOLNOVUSRAFILIACIONPEVCSOLICITUDNOVEDAD = "p_evcSolicitudNovedad";
    /** <code>funcionarioInsSolNovUsrAfiliacionpevcSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_INSSOLNOVUSRAFILIACION_FUNCIONARIOINSSOLNOVUSRAFILIACIONPEVCSOLICITUDNOVEDAD = "Clas_1431626842112800Ser_40Arg_2_Alias";
    /** <code>funcionarioInsSolNovUsrAfiliacionpevcSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSSOLNOVUSRAFILIACION_FUNCIONARIOINSSOLNOVUSRAFILIACIONPEVCSOLICITUDNOVEDAD = "Sol. Nov. Afiliaciones";
    // Service (DelSolNovUsrAfiliacion)
    /** <code>DelSolNovUsrAfiliacion</code> service id. */
    public static final String SERV_ID_DELSOLNOVUSRAFILIACION = "Clas_1431626842112800Ser_41_Alias";
    /** <code>DelSolNovUsrAfiliacion</code> service name. */
    public static final String SERV_NAME_DELSOLNOVUSRAFILIACION = "DelSolNovUsrAfiliacion";
    /** <code>DelSolNovUsrAfiliacion</code> service alias. */
    public static final String SERV_ALIAS_DELSOLNOVUSRAFILIACION = "DelSolNovUsrAfiliacion";
    /** Agents allowed to execute the service DelSolNovUsrAfiliacion **/
    public static final String DELSOLNOVUSRAFILIACION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionarioDelSolNovUsrAfiliacionpthisFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_DELSOLNOVUSRAFILIACION_FUNCIONARIODELSOLNOVUSRAFILIACIONPTHISFUNCIONARIO = "p_thisFuncionario";
    /** <code>funcionarioDelSolNovUsrAfiliacionpthisFuncionario</code> inbound argument id. */
    public static final String ARG_ID_DELSOLNOVUSRAFILIACION_FUNCIONARIODELSOLNOVUSRAFILIACIONPTHISFUNCIONARIO = "Clas_1431626842112800Ser_41Arg_1_Alias";
    /** <code>funcionarioDelSolNovUsrAfiliacionpthisFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELSOLNOVUSRAFILIACION_FUNCIONARIODELSOLNOVUSRAFILIACIONPTHISFUNCIONARIO = "Afiliación";
    /** <code>funcionarioDelSolNovUsrAfiliacionpevcSolicitudNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DELSOLNOVUSRAFILIACION_FUNCIONARIODELSOLNOVUSRAFILIACIONPEVCSOLICITUDNOVEDAD = "p_evcSolicitudNovedad";
    /** <code>funcionarioDelSolNovUsrAfiliacionpevcSolicitudNovedad</code> inbound argument id. */
    public static final String ARG_ID_DELSOLNOVUSRAFILIACION_FUNCIONARIODELSOLNOVUSRAFILIACIONPEVCSOLICITUDNOVEDAD = "Clas_1431626842112800Ser_41Arg_2_Alias";
    /** <code>funcionarioDelSolNovUsrAfiliacionpevcSolicitudNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELSOLNOVUSRAFILIACION_FUNCIONARIODELSOLNOVUSRAFILIACIONPEVCSOLICITUDNOVEDAD = "Sol. Nov. Afiliaciones";
    // Service (InsUsrAfiliacion)
    /** <code>InsUsrAfiliacion</code> service id. */
    public static final String SERV_ID_INSUSRAFILIACION = "Clas_1431626842112800Ser_48_Alias";
    /** <code>InsUsrAfiliacion</code> service name. */
    public static final String SERV_NAME_INSUSRAFILIACION = "InsUsrAfiliacion";
    /** <code>InsUsrAfiliacion</code> service alias. */
    public static final String SERV_ALIAS_INSUSRAFILIACION = "InsUsrAfiliacion";
    /** Agents allowed to execute the service InsUsrAfiliacion **/
    public static final String INSUSRAFILIACION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionarioInsUsrAfiliacionpthisFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_INSUSRAFILIACION_FUNCIONARIOINSUSRAFILIACIONPTHISFUNCIONARIO = "p_thisFuncionario";
    /** <code>funcionarioInsUsrAfiliacionpthisFuncionario</code> inbound argument id. */
    public static final String ARG_ID_INSUSRAFILIACION_FUNCIONARIOINSUSRAFILIACIONPTHISFUNCIONARIO = "Clas_1431626842112800Ser_48Arg_1_Alias";
    /** <code>funcionarioInsUsrAfiliacionpthisFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSUSRAFILIACION_FUNCIONARIOINSUSRAFILIACIONPTHISFUNCIONARIO = "Usr. Afiliación";
    /** <code>funcionarioInsUsrAfiliacionpevcSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_INSUSRAFILIACION_FUNCIONARIOINSUSRAFILIACIONPEVCSOLICITUD = "p_evcSolicitud";
    /** <code>funcionarioInsUsrAfiliacionpevcSolicitud</code> inbound argument id. */
    public static final String ARG_ID_INSUSRAFILIACION_FUNCIONARIOINSUSRAFILIACIONPEVCSOLICITUD = "Clas_1431626842112800Ser_48Arg_2_Alias";
    /** <code>funcionarioInsUsrAfiliacionpevcSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSUSRAFILIACION_FUNCIONARIOINSUSRAFILIACIONPEVCSOLICITUD = "Solicitudes Afiliación";
    // Service (DelUsrAfiliacion)
    /** <code>DelUsrAfiliacion</code> service id. */
    public static final String SERV_ID_DELUSRAFILIACION = "Clas_1431626842112800Ser_49_Alias";
    /** <code>DelUsrAfiliacion</code> service name. */
    public static final String SERV_NAME_DELUSRAFILIACION = "DelUsrAfiliacion";
    /** <code>DelUsrAfiliacion</code> service alias. */
    public static final String SERV_ALIAS_DELUSRAFILIACION = "DelUsrAfiliacion";
    /** Agents allowed to execute the service DelUsrAfiliacion **/
    public static final String DELUSRAFILIACION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionarioDelUsrAfiliacionpthisFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_DELUSRAFILIACION_FUNCIONARIODELUSRAFILIACIONPTHISFUNCIONARIO = "p_thisFuncionario";
    /** <code>funcionarioDelUsrAfiliacionpthisFuncionario</code> inbound argument id. */
    public static final String ARG_ID_DELUSRAFILIACION_FUNCIONARIODELUSRAFILIACIONPTHISFUNCIONARIO = "Clas_1431626842112800Ser_49Arg_1_Alias";
    /** <code>funcionarioDelUsrAfiliacionpthisFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELUSRAFILIACION_FUNCIONARIODELUSRAFILIACIONPTHISFUNCIONARIO = "Usr. Afiliación";
    /** <code>funcionarioDelUsrAfiliacionpevcSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_DELUSRAFILIACION_FUNCIONARIODELUSRAFILIACIONPEVCSOLICITUD = "p_evcSolicitud";
    /** <code>funcionarioDelUsrAfiliacionpevcSolicitud</code> inbound argument id. */
    public static final String ARG_ID_DELUSRAFILIACION_FUNCIONARIODELUSRAFILIACIONPEVCSOLICITUD = "Clas_1431626842112800Ser_49Arg_2_Alias";
    /** <code>funcionarioDelUsrAfiliacionpevcSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELUSRAFILIACION_FUNCIONARIODELUSRAFILIACIONPEVCSOLICITUD = "Solicitudes Afiliación";
    // Service (cambiarDisponible)
    /** <code>cambiarDisponible</code> service id. */
    public static final String SERV_ID_CAMBIARDISPONIBLE = "Clas_1431626842112800Ser_50_Alias";
    /** <code>cambiarDisponible</code> service name. */
    public static final String SERV_NAME_CAMBIARDISPONIBLE = "cambiarDisponible";
    /** <code>cambiarDisponible</code> service alias. */
    public static final String SERV_ALIAS_CAMBIARDISPONIBLE = "Marcar disponibilidad";
    /** Agents allowed to execute the service cambiarDisponible **/
    public static final String CAMBIARDISPONIBLE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionariocambiarDisponiblepthisFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARDISPONIBLE_FUNCIONARIOCAMBIARDISPONIBLEPTHISFUNCIONARIO = "p_thisFuncionario";
    /** <code>funcionariocambiarDisponiblepthisFuncionario</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARDISPONIBLE_FUNCIONARIOCAMBIARDISPONIBLEPTHISFUNCIONARIO = "Clas_1431626842112800Ser_50Arg_1_Alias";
    /** <code>funcionariocambiarDisponiblepthisFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARDISPONIBLE_FUNCIONARIOCAMBIARDISPONIBLEPTHISFUNCIONARIO = "Usuario";
    /** <code>funcionariocambiarDisponiblepeDisponible</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARDISPONIBLE_FUNCIONARIOCAMBIARDISPONIBLEPEDISPONIBLE = "peDisponible";
    /** <code>funcionariocambiarDisponiblepeDisponible</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARDISPONIBLE_FUNCIONARIOCAMBIARDISPONIBLEPEDISPONIBLE = "Clas_1431626842112800Ser_50Arg_2_Alias";
    /** <code>funcionariocambiarDisponiblepeDisponible</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARDISPONIBLE_FUNCIONARIOCAMBIARDISPONIBLEPEDISPONIBLE = "Disponible";
    // Service (solicitudAsignada)
    /** <code>solicitudAsignada</code> service id. */
    public static final String SERV_ID_SOLICITUDASIGNADA = "Clas_1431626842112800Ser_52_Alias";
    /** <code>solicitudAsignada</code> service name. */
    public static final String SERV_NAME_SOLICITUDASIGNADA = "solicitudAsignada";
    /** <code>solicitudAsignada</code> service alias. */
    public static final String SERV_ALIAS_SOLICITUDASIGNADA = "solicitudAsignada";
    /** Agents allowed to execute the service solicitudAsignada **/
    public static final String SOLICITUDASIGNADA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionariosolicitudAsignadapthisFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_SOLICITUDASIGNADA_FUNCIONARIOSOLICITUDASIGNADAPTHISFUNCIONARIO = "p_thisFuncionario";
    /** <code>funcionariosolicitudAsignadapthisFuncionario</code> inbound argument id. */
    public static final String ARG_ID_SOLICITUDASIGNADA_FUNCIONARIOSOLICITUDASIGNADAPTHISFUNCIONARIO = "Clas_1431626842112800Ser_52Arg_1_Alias";
    /** <code>funcionariosolicitudAsignadapthisFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_SOLICITUDASIGNADA_FUNCIONARIOSOLICITUDASIGNADAPTHISFUNCIONARIO = "Usuario";
    // Service (solicitudTerminada)
    /** <code>solicitudTerminada</code> service id. */
    public static final String SERV_ID_SOLICITUDTERMINADA = "Clas_1431626842112800Ser_53_Alias";
    /** <code>solicitudTerminada</code> service name. */
    public static final String SERV_NAME_SOLICITUDTERMINADA = "solicitudTerminada";
    /** <code>solicitudTerminada</code> service alias. */
    public static final String SERV_ALIAS_SOLICITUDTERMINADA = "solicitudTerminada";
    /** Agents allowed to execute the service solicitudTerminada **/
    public static final String SOLICITUDTERMINADA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionariosolicitudTerminadapthisFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_SOLICITUDTERMINADA_FUNCIONARIOSOLICITUDTERMINADAPTHISFUNCIONARIO = "p_thisFuncionario";
    /** <code>funcionariosolicitudTerminadapthisFuncionario</code> inbound argument id. */
    public static final String ARG_ID_SOLICITUDTERMINADA_FUNCIONARIOSOLICITUDTERMINADAPTHISFUNCIONARIO = "Clas_1431626842112800Ser_53Arg_1_Alias";
    /** <code>funcionariosolicitudTerminadapthisFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_SOLICITUDTERMINADA_FUNCIONARIOSOLICITUDTERMINADAPTHISFUNCIONARIO = "Usuario";
    // Service (hacerGestor)
    /** <code>hacerGestor</code> service id. */
    public static final String SERV_ID_HACERGESTOR = "Clas_1431626842112800Ser_54_Alias";
    /** <code>hacerGestor</code> service name. */
    public static final String SERV_NAME_HACERGESTOR = "hacerGestor";
    /** <code>hacerGestor</code> service alias. */
    public static final String SERV_ALIAS_HACERGESTOR = "hacerGestor";
    /** Agents allowed to execute the service hacerGestor **/
    public static final String HACERGESTOR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionariohacerGestorpthisFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_HACERGESTOR_FUNCIONARIOHACERGESTORPTHISFUNCIONARIO = "p_thisFuncionario";
    /** <code>funcionariohacerGestorpthisFuncionario</code> inbound argument id. */
    public static final String ARG_ID_HACERGESTOR_FUNCIONARIOHACERGESTORPTHISFUNCIONARIO = "Clas_1431626842112800Ser_54Arg_1_Alias";
    /** <code>funcionariohacerGestorpthisFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_HACERGESTOR_FUNCIONARIOHACERGESTORPTHISFUNCIONARIO = "Usuario";
    // Service (deshacerGestor)
    /** <code>deshacerGestor</code> service id. */
    public static final String SERV_ID_DESHACERGESTOR = "Clas_1431626842112800Ser_55_Alias";
    /** <code>deshacerGestor</code> service name. */
    public static final String SERV_NAME_DESHACERGESTOR = "deshacerGestor";
    /** <code>deshacerGestor</code> service alias. */
    public static final String SERV_ALIAS_DESHACERGESTOR = "deshacerGestor";
    /** Agents allowed to execute the service deshacerGestor **/
    public static final String DESHACERGESTOR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionariodeshacerGestorpthisFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_DESHACERGESTOR_FUNCIONARIODESHACERGESTORPTHISFUNCIONARIO = "p_thisFuncionario";
    /** <code>funcionariodeshacerGestorpthisFuncionario</code> inbound argument id. */
    public static final String ARG_ID_DESHACERGESTOR_FUNCIONARIODESHACERGESTORPTHISFUNCIONARIO = "Clas_1431626842112800Ser_55Arg_1_Alias";
    /** <code>funcionariodeshacerGestorpthisFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_DESHACERGESTOR_FUNCIONARIODESHACERGESTORPTHISFUNCIONARIO = "Usuario";
    // Service (hacerMesaApoyo)
    /** <code>hacerMesaApoyo</code> service id. */
    public static final String SERV_ID_HACERMESAAPOYO = "Clas_1431626842112800Ser_56_Alias";
    /** <code>hacerMesaApoyo</code> service name. */
    public static final String SERV_NAME_HACERMESAAPOYO = "hacerMesaApoyo";
    /** <code>hacerMesaApoyo</code> service alias. */
    public static final String SERV_ALIAS_HACERMESAAPOYO = "hacerMesaApoyo";
    /** Agents allowed to execute the service hacerMesaApoyo **/
    public static final String HACERMESAAPOYO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionariohacerMesaApoyopthisFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_HACERMESAAPOYO_FUNCIONARIOHACERMESAAPOYOPTHISFUNCIONARIO = "p_thisFuncionario";
    /** <code>funcionariohacerMesaApoyopthisFuncionario</code> inbound argument id. */
    public static final String ARG_ID_HACERMESAAPOYO_FUNCIONARIOHACERMESAAPOYOPTHISFUNCIONARIO = "Clas_1431626842112800Ser_56Arg_1_Alias";
    /** <code>funcionariohacerMesaApoyopthisFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_HACERMESAAPOYO_FUNCIONARIOHACERMESAAPOYOPTHISFUNCIONARIO = "Usuario";
    // Service (deshacerMesaApoyo)
    /** <code>deshacerMesaApoyo</code> service id. */
    public static final String SERV_ID_DESHACERMESAAPOYO = "Clas_1431626842112800Ser_57_Alias";
    /** <code>deshacerMesaApoyo</code> service name. */
    public static final String SERV_NAME_DESHACERMESAAPOYO = "deshacerMesaApoyo";
    /** <code>deshacerMesaApoyo</code> service alias. */
    public static final String SERV_ALIAS_DESHACERMESAAPOYO = "deshacerMesaApoyo";
    /** Agents allowed to execute the service deshacerMesaApoyo **/
    public static final String DESHACERMESAAPOYO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionariodeshacerMesaApoyopthisFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_DESHACERMESAAPOYO_FUNCIONARIODESHACERMESAAPOYOPTHISFUNCIONARIO = "p_thisFuncionario";
    /** <code>funcionariodeshacerMesaApoyopthisFuncionario</code> inbound argument id. */
    public static final String ARG_ID_DESHACERMESAAPOYO_FUNCIONARIODESHACERMESAAPOYOPTHISFUNCIONARIO = "Clas_1431626842112800Ser_57Arg_1_Alias";
    /** <code>funcionariodeshacerMesaApoyopthisFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_DESHACERMESAAPOYO_FUNCIONARIODESHACERMESAAPOYOPTHISFUNCIONARIO = "Usuario";
    // Service (setIdSesion)
    /** <code>setIdSesion</code> service id. */
    public static final String SERV_ID_SETIDSESION = "Clas_1431626842112800Ser_61_Alias";
    /** <code>setIdSesion</code> service name. */
    public static final String SERV_NAME_SETIDSESION = "setIdSesion";
    /** <code>setIdSesion</code> service alias. */
    public static final String SERV_ALIAS_SETIDSESION = "setIdSesion";
    /** Agents allowed to execute the service setIdSesion **/
    public static final String SETIDSESION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionariosetIdSesionpthisFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_SETIDSESION_FUNCIONARIOSETIDSESIONPTHISFUNCIONARIO = "p_thisFuncionario";
    /** <code>funcionariosetIdSesionpthisFuncionario</code> inbound argument id. */
    public static final String ARG_ID_SETIDSESION_FUNCIONARIOSETIDSESIONPTHISFUNCIONARIO = "Clas_1431626842112800Ser_61Arg_1_Alias";
    /** <code>funcionariosetIdSesionpthisFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETIDSESION_FUNCIONARIOSETIDSESIONPTHISFUNCIONARIO = "Usuario";
    // Service (TCREAR)
    /** <code>TCREAR</code> service id. */
    public static final String SERV_ID_TCREAR = "Clas_1431626842112800Ser_9_Alias";
    /** <code>TCREAR</code> service name. */
    public static final String SERV_NAME_TCREAR = "TCREAR";
    /** <code>TCREAR</code> service alias. */
    public static final String SERV_ALIAS_TCREAR = "Crear usuario";
    /** Agents allowed to execute the service TCREAR **/
    public static final String TCREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionarioTCREARptpagrRol</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_FUNCIONARIOTCREARPTPAGRROL = "pt_p_agrRol";
    /** <code>funcionarioTCREARptpagrRol</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_FUNCIONARIOTCREARPTPAGRROL = "Clas_1431626842112800Ser_9Arg_4_Alias";
    /** <code>funcionarioTCREARptpagrRol</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_FUNCIONARIOTCREARPTPAGRROL = "Rol";
    /** <code>funcionarioTCREARptpatrUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_FUNCIONARIOTCREARPTPATRUSUARIO = "pt_p_atrUsuario";
    /** <code>funcionarioTCREARptpatrUsuario</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_FUNCIONARIOTCREARPTPATRUSUARIO = "Clas_1431626842112800Ser_9Arg_5_Alias";
    /** <code>funcionarioTCREARptpatrUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_FUNCIONARIOTCREARPTPATRUSUARIO = "Usuario";
    /** <code>funcionarioTCREARptpatrPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_FUNCIONARIOTCREARPTPATRPRIMERNOMBRE = "pt_p_atrPrimerNombre";
    /** <code>funcionarioTCREARptpatrPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_FUNCIONARIOTCREARPTPATRPRIMERNOMBRE = "Clas_1431626842112800Ser_9Arg_6_Alias";
    /** <code>funcionarioTCREARptpatrPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_FUNCIONARIOTCREARPTPATRPRIMERNOMBRE = "Primer nombre";
    /** <code>funcionarioTCREARptpatrSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_FUNCIONARIOTCREARPTPATRSEGUNDONOMBRE = "pt_p_atrSegundoNombre";
    /** <code>funcionarioTCREARptpatrSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_FUNCIONARIOTCREARPTPATRSEGUNDONOMBRE = "Clas_1431626842112800Ser_9Arg_7_Alias";
    /** <code>funcionarioTCREARptpatrSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_FUNCIONARIOTCREARPTPATRSEGUNDONOMBRE = "Segundo nombre";
    /** <code>funcionarioTCREARptpatrPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_FUNCIONARIOTCREARPTPATRPRIMERAPELLIDO = "pt_p_atrPrimerApellido";
    /** <code>funcionarioTCREARptpatrPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_FUNCIONARIOTCREARPTPATRPRIMERAPELLIDO = "Clas_1431626842112800Ser_9Arg_8_Alias";
    /** <code>funcionarioTCREARptpatrPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_FUNCIONARIOTCREARPTPATRPRIMERAPELLIDO = "Primer apellido";
    /** <code>funcionarioTCREARptpatrSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_FUNCIONARIOTCREARPTPATRSEGUNDOAPELLIDO = "pt_p_atrSegundoApellido";
    /** <code>funcionarioTCREARptpatrSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_FUNCIONARIOTCREARPTPATRSEGUNDOAPELLIDO = "Clas_1431626842112800Ser_9Arg_9_Alias";
    /** <code>funcionarioTCREARptpatrSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_FUNCIONARIOTCREARPTPATRSEGUNDOAPELLIDO = "Segundo apellido";
    /** <code>funcionarioTCREARptppassword</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_FUNCIONARIOTCREARPTPP4SSW0RD = "pt_p_password";
    /** <code>funcionarioTCREARptppassword</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_FUNCIONARIOTCREARPTPP4SSW0RD = "Clas_1431626842112800Ser_9Arg_10_Alias";
    /** <code>funcionarioTCREARptppassword</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_FUNCIONARIOTCREARPTPP4SSW0RD = "Contraseña";
    /** <code>funcionarioTCREARptpagrSucursal</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_FUNCIONARIOTCREARPTPAGRSUCURSAL = "pt_p_agrSucursal";
    /** <code>funcionarioTCREARptpagrSucursal</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_FUNCIONARIOTCREARPTPAGRSUCURSAL = "Clas_1431626842112800Ser_9Arg_1919_Alias";
    /** <code>funcionarioTCREARptpagrSucursal</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_FUNCIONARIOTCREARPTPAGRSUCURSAL = "Sucursal";
    /** <code>funcionarioTCREARptpatrUsuarioLDAP</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_FUNCIONARIOTCREARPTPATRUSUARIOLDAP = "pt_p_atrUsuarioLDAP";
    /** <code>funcionarioTCREARptpatrUsuarioLDAP</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_FUNCIONARIOTCREARPTPATRUSUARIOLDAP = "Clas_1431626842112800Ser_9Arg_2492_Alias";
    /** <code>funcionarioTCREARptpatrUsuarioLDAP</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_FUNCIONARIOTCREARPTPATRUSUARIOLDAP = "Usuario LDAP";
    /** <code>funcionarioTCREARptpatrEmail</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_FUNCIONARIOTCREARPTPATREMAIL = "pt_p_atrEmail";
    /** <code>funcionarioTCREARptpatrEmail</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_FUNCIONARIOTCREARPTPATREMAIL = "Clas_1431626842112800Ser_9Arg_2493_Alias";
    /** <code>funcionarioTCREARptpatrEmail</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_FUNCIONARIOTCREARPTPATREMAIL = "Email";
    /** <code>funcionarioTCREARptpagrRegional</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_FUNCIONARIOTCREARPTPAGRREGIONAL = "pt_p_agrRegional";
    /** <code>funcionarioTCREARptpagrRegional</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_FUNCIONARIOTCREARPTPAGRREGIONAL = "Clas_1431626842112800Ser_9Arg_2496_Alias";
    /** <code>funcionarioTCREARptpagrRegional</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_FUNCIONARIOTCREARPTPAGRREGIONAL = "Regional";
    // Service (TMODIFICARYROL)
    /** <code>TMODIFICARYROL</code> service id. */
    public static final String SERV_ID_TMODIFICARYROL = "Clas_1431626842112800Ser_29_Alias";
    /** <code>TMODIFICARYROL</code> service name. */
    public static final String SERV_NAME_TMODIFICARYROL = "TMODIFICARYROL";
    /** <code>TMODIFICARYROL</code> service alias. */
    public static final String SERV_ALIAS_TMODIFICARYROL = "Modificar ";
    /** Agents allowed to execute the service TMODIFICARYROL **/
    public static final String TMODIFICARYROL_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionarioTMODIFICARYROLpthisAgente</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARYROL_FUNCIONARIOTMODIFICARYROLPTHISAGENTE = "p_thisAgente";
    /** <code>funcionarioTMODIFICARYROLpthisAgente</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARYROL_FUNCIONARIOTMODIFICARYROLPTHISAGENTE = "Clas_1431626842112800Ser_29Arg_1_Alias";
    /** <code>funcionarioTMODIFICARYROLpthisAgente</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARYROL_FUNCIONARIOTMODIFICARYROLPTHISAGENTE = "Usuario";
    /** <code>funcionarioTMODIFICARYROLptpPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARYROL_FUNCIONARIOTMODIFICARYROLPTPPRIMERNOMBRE = "pt_p_PrimerNombre";
    /** <code>funcionarioTMODIFICARYROLptpPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARYROL_FUNCIONARIOTMODIFICARYROLPTPPRIMERNOMBRE = "Clas_1431626842112800Ser_29Arg_2_Alias";
    /** <code>funcionarioTMODIFICARYROLptpPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARYROL_FUNCIONARIOTMODIFICARYROLPTPPRIMERNOMBRE = "Primer nombre";
    /** <code>funcionarioTMODIFICARYROLptpSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARYROL_FUNCIONARIOTMODIFICARYROLPTPSEGUNDONOMBRE = "pt_p_SegundoNombre";
    /** <code>funcionarioTMODIFICARYROLptpSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARYROL_FUNCIONARIOTMODIFICARYROLPTPSEGUNDONOMBRE = "Clas_1431626842112800Ser_29Arg_3_Alias";
    /** <code>funcionarioTMODIFICARYROLptpSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARYROL_FUNCIONARIOTMODIFICARYROLPTPSEGUNDONOMBRE = "Segundo nombre";
    /** <code>funcionarioTMODIFICARYROLptpPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARYROL_FUNCIONARIOTMODIFICARYROLPTPPRIMERAPELLIDO = "pt_p_PrimerApellido";
    /** <code>funcionarioTMODIFICARYROLptpPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARYROL_FUNCIONARIOTMODIFICARYROLPTPPRIMERAPELLIDO = "Clas_1431626842112800Ser_29Arg_4_Alias";
    /** <code>funcionarioTMODIFICARYROLptpPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARYROL_FUNCIONARIOTMODIFICARYROLPTPPRIMERAPELLIDO = "Primer apellido";
    /** <code>funcionarioTMODIFICARYROLptpSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARYROL_FUNCIONARIOTMODIFICARYROLPTPSEGUNDOAPELLIDO = "pt_p_SegundoApellido";
    /** <code>funcionarioTMODIFICARYROLptpSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARYROL_FUNCIONARIOTMODIFICARYROLPTPSEGUNDOAPELLIDO = "Clas_1431626842112800Ser_29Arg_5_Alias";
    /** <code>funcionarioTMODIFICARYROLptpSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARYROL_FUNCIONARIOTMODIFICARYROLPTPSEGUNDOAPELLIDO = "Segundo apellido";
    /** <code>funcionarioTMODIFICARYROLptNuevoRol</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARYROL_FUNCIONARIOTMODIFICARYROLPTNUEVOROL = "pt_NuevoRol";
    /** <code>funcionarioTMODIFICARYROLptNuevoRol</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARYROL_FUNCIONARIOTMODIFICARYROLPTNUEVOROL = "Clas_1431626842112800Ser_29Arg_6_Alias";
    /** <code>funcionarioTMODIFICARYROLptNuevoRol</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARYROL_FUNCIONARIOTMODIFICARYROLPTNUEVOROL = "Rol";
    /** <code>funcionarioTMODIFICARYROLptpatrUsuarioLDAP</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARYROL_FUNCIONARIOTMODIFICARYROLPTPATRUSUARIOLDAP = "pt_p_atrUsuarioLDAP";
    /** <code>funcionarioTMODIFICARYROLptpatrUsuarioLDAP</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARYROL_FUNCIONARIOTMODIFICARYROLPTPATRUSUARIOLDAP = "Clas_1431626842112800Ser_29Arg_8_Alias";
    /** <code>funcionarioTMODIFICARYROLptpatrUsuarioLDAP</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARYROL_FUNCIONARIOTMODIFICARYROLPTPATRUSUARIOLDAP = "Usuario LDAP";
    /** <code>funcionarioTMODIFICARYROLptpatrEmail</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARYROL_FUNCIONARIOTMODIFICARYROLPTPATREMAIL = "pt_p_atrEmail";
    /** <code>funcionarioTMODIFICARYROLptpatrEmail</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARYROL_FUNCIONARIOTMODIFICARYROLPTPATREMAIL = "Clas_1431626842112800Ser_29Arg_9_Alias";
    /** <code>funcionarioTMODIFICARYROLptpatrEmail</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARYROL_FUNCIONARIOTMODIFICARYROLPTPATREMAIL = "Email";
    /** <code>funcionarioTMODIFICARYROLptpagrRegional</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARYROL_FUNCIONARIOTMODIFICARYROLPTPAGRREGIONAL = "pt_p_agrRegional";
    /** <code>funcionarioTMODIFICARYROLptpagrRegional</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARYROL_FUNCIONARIOTMODIFICARYROLPTPAGRREGIONAL = "Clas_1431626842112800Ser_29Arg_10_Alias";
    /** <code>funcionarioTMODIFICARYROLptpagrRegional</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARYROL_FUNCIONARIOTMODIFICARYROLPTPAGRREGIONAL = "Regional";
    // Service (TCREARASESOR)
    /** <code>TCREARASESOR</code> service id. */
    public static final String SERV_ID_TCREARASESOR = "Clas_1431626842112800Ser_31_Alias";
    /** <code>TCREARASESOR</code> service name. */
    public static final String SERV_NAME_TCREARASESOR = "TCREARASESOR";
    /** <code>TCREARASESOR</code> service alias. */
    public static final String SERV_ALIAS_TCREARASESOR = "Crear Asesor";
    /** Agents allowed to execute the service TCREARASESOR **/
    public static final String TCREARASESOR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionarioTCREARASESORptpagrSucursal</code> inbound argument name. */
    public static final String ARG_NAME_TCREARASESOR_FUNCIONARIOTCREARASESORPTPAGRSUCURSAL = "pt_p_agrSucursal";
    /** <code>funcionarioTCREARASESORptpagrSucursal</code> inbound argument id. */
    public static final String ARG_ID_TCREARASESOR_FUNCIONARIOTCREARASESORPTPAGRSUCURSAL = "Clas_1431626842112800Ser_31Arg_4_Alias";
    /** <code>funcionarioTCREARASESORptpagrSucursal</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARASESOR_FUNCIONARIOTCREARASESORPTPAGRSUCURSAL = "Sucursal";
    /** <code>funcionarioTCREARASESORptpatrUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TCREARASESOR_FUNCIONARIOTCREARASESORPTPATRUSUARIO = "pt_p_atrUsuario";
    /** <code>funcionarioTCREARASESORptpatrUsuario</code> inbound argument id. */
    public static final String ARG_ID_TCREARASESOR_FUNCIONARIOTCREARASESORPTPATRUSUARIO = "Clas_1431626842112800Ser_31Arg_5_Alias";
    /** <code>funcionarioTCREARASESORptpatrUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARASESOR_FUNCIONARIOTCREARASESORPTPATRUSUARIO = "Usuario";
    /** <code>funcionarioTCREARASESORptpatrPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TCREARASESOR_FUNCIONARIOTCREARASESORPTPATRPRIMERNOMBRE = "pt_p_atrPrimerNombre";
    /** <code>funcionarioTCREARASESORptpatrPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TCREARASESOR_FUNCIONARIOTCREARASESORPTPATRPRIMERNOMBRE = "Clas_1431626842112800Ser_31Arg_6_Alias";
    /** <code>funcionarioTCREARASESORptpatrPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARASESOR_FUNCIONARIOTCREARASESORPTPATRPRIMERNOMBRE = "Primer nombre";
    /** <code>funcionarioTCREARASESORptpatrSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TCREARASESOR_FUNCIONARIOTCREARASESORPTPATRSEGUNDONOMBRE = "pt_p_atrSegundoNombre";
    /** <code>funcionarioTCREARASESORptpatrSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TCREARASESOR_FUNCIONARIOTCREARASESORPTPATRSEGUNDONOMBRE = "Clas_1431626842112800Ser_31Arg_7_Alias";
    /** <code>funcionarioTCREARASESORptpatrSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARASESOR_FUNCIONARIOTCREARASESORPTPATRSEGUNDONOMBRE = "Segundo nombre";
    /** <code>funcionarioTCREARASESORptpatrPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TCREARASESOR_FUNCIONARIOTCREARASESORPTPATRPRIMERAPELLIDO = "pt_p_atrPrimerApellido";
    /** <code>funcionarioTCREARASESORptpatrPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TCREARASESOR_FUNCIONARIOTCREARASESORPTPATRPRIMERAPELLIDO = "Clas_1431626842112800Ser_31Arg_8_Alias";
    /** <code>funcionarioTCREARASESORptpatrPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARASESOR_FUNCIONARIOTCREARASESORPTPATRPRIMERAPELLIDO = "Primer apellido";
    /** <code>funcionarioTCREARASESORptpatrSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TCREARASESOR_FUNCIONARIOTCREARASESORPTPATRSEGUNDOAPELLIDO = "pt_p_atrSegundoApellido";
    /** <code>funcionarioTCREARASESORptpatrSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TCREARASESOR_FUNCIONARIOTCREARASESORPTPATRSEGUNDOAPELLIDO = "Clas_1431626842112800Ser_31Arg_9_Alias";
    /** <code>funcionarioTCREARASESORptpatrSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARASESOR_FUNCIONARIOTCREARASESORPTPATRSEGUNDOAPELLIDO = "Segundo apellido";
    /** <code>funcionarioTCREARASESORptpatrEmail</code> inbound argument name. */
    public static final String ARG_NAME_TCREARASESOR_FUNCIONARIOTCREARASESORPTPATREMAIL = "pt_p_atrEmail";
    /** <code>funcionarioTCREARASESORptpatrEmail</code> inbound argument id. */
    public static final String ARG_ID_TCREARASESOR_FUNCIONARIOTCREARASESORPTPATREMAIL = "Clas_1431626842112800Ser_31Arg_11_Alias";
    /** <code>funcionarioTCREARASESORptpatrEmail</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARASESOR_FUNCIONARIOTCREARASESORPTPATREMAIL = "Email";
    /** <code>funcionarioTCREARASESORptpagrTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARASESOR_FUNCIONARIOTCREARASESORPTPAGRTIPOIDENTIFICACION = "pt_p_agrTipoIdentificacion";
    /** <code>funcionarioTCREARASESORptpagrTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TCREARASESOR_FUNCIONARIOTCREARASESORPTPAGRTIPOIDENTIFICACION = "Clas_1431626842112800Ser_31Arg_15_Alias";
    /** <code>funcionarioTCREARASESORptpagrTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARASESOR_FUNCIONARIOTCREARASESORPTPAGRTIPOIDENTIFICACION = "Tipo Identificación";
    /** <code>funcionarioTCREARASESORptpatrNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARASESOR_FUNCIONARIOTCREARASESORPTPATRNUMIDENTIFICACION = "pt_p_atrNumIdentificacion";
    /** <code>funcionarioTCREARASESORptpatrNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TCREARASESOR_FUNCIONARIOTCREARASESORPTPATRNUMIDENTIFICACION = "Clas_1431626842112800Ser_31Arg_18_Alias";
    /** <code>funcionarioTCREARASESORptpatrNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARASESOR_FUNCIONARIOTCREARASESORPTPATRNUMIDENTIFICACION = "Nº Identificación";
    /** <code>funcionarioTCREARASESORptpCodJefe</code> inbound argument name. */
    public static final String ARG_NAME_TCREARASESOR_FUNCIONARIOTCREARASESORPTPCODJEFE = "pt_p_CodJefe";
    /** <code>funcionarioTCREARASESORptpCodJefe</code> inbound argument id. */
    public static final String ARG_ID_TCREARASESOR_FUNCIONARIOTCREARASESORPTPCODJEFE = "Clas_1431626842112800Ser_31Arg_19_Alias";
    /** <code>funcionarioTCREARASESORptpCodJefe</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARASESOR_FUNCIONARIOTCREARASESORPTPCODJEFE = "Cod. Jefe";
    /** <code>funcionarioTCREARASESORptCanal</code> inbound argument name. */
    public static final String ARG_NAME_TCREARASESOR_FUNCIONARIOTCREARASESORPTCANAL = "ptCanal";
    /** <code>funcionarioTCREARASESORptCanal</code> inbound argument id. */
    public static final String ARG_ID_TCREARASESOR_FUNCIONARIOTCREARASESORPTCANAL = "Clas_1431626842112800Ser_31Arg_3580_Alias";
    /** <code>funcionarioTCREARASESORptCanal</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARASESOR_FUNCIONARIOTCREARASESORPTCANAL = "ptCanal";
    /** <code>funcionarioTCREARASESORptCargo</code> inbound argument name. */
    public static final String ARG_NAME_TCREARASESOR_FUNCIONARIOTCREARASESORPTCARGO = "ptCargo";
    /** <code>funcionarioTCREARASESORptCargo</code> inbound argument id. */
    public static final String ARG_ID_TCREARASESOR_FUNCIONARIOTCREARASESORPTCARGO = "Clas_1431626842112800Ser_31Arg_3581_Alias";
    /** <code>funcionarioTCREARASESORptCargo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARASESOR_FUNCIONARIOTCREARASESORPTCARGO = "ptCargo";
    /** <code>funcionarioTCREARASESORptEstado</code> inbound argument name. */
    public static final String ARG_NAME_TCREARASESOR_FUNCIONARIOTCREARASESORPTESTADO = "ptEstado";
    /** <code>funcionarioTCREARASESORptEstado</code> inbound argument id. */
    public static final String ARG_ID_TCREARASESOR_FUNCIONARIOTCREARASESORPTESTADO = "Clas_1431626842112800Ser_31Arg_3582_Alias";
    /** <code>funcionarioTCREARASESORptEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARASESOR_FUNCIONARIOTCREARASESORPTESTADO = "ptEstado";
    // Service (TNEWASESORMANUAL)
    /** <code>TNEWASESORMANUAL</code> service id. */
    public static final String SERV_ID_TNEWASESORMANUAL = "Clas_1431626842112800Ser_33_Alias";
    /** <code>TNEWASESORMANUAL</code> service name. */
    public static final String SERV_NAME_TNEWASESORMANUAL = "TNEWASESORMANUAL";
    /** <code>TNEWASESORMANUAL</code> service alias. */
    public static final String SERV_ALIAS_TNEWASESORMANUAL = "Nuevo asesor de agencia";
    /** Agents allowed to execute the service TNEWASESORMANUAL **/
    public static final String TNEWASESORMANUAL_SRVAGENTS = "";
    // Inbound arguments
    /** <code>funcionarioTNEWASESORMANUALptpagrSucursal</code> inbound argument name. */
    public static final String ARG_NAME_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPAGRSUCURSAL = "pt_p_agrSucursal";
    /** <code>funcionarioTNEWASESORMANUALptpagrSucursal</code> inbound argument id. */
    public static final String ARG_ID_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPAGRSUCURSAL = "Clas_1431626842112800Ser_33Arg_4_Alias";
    /** <code>funcionarioTNEWASESORMANUALptpagrSucursal</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPAGRSUCURSAL = "Sucursal";
    /** <code>funcionarioTNEWASESORMANUALptpatrUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRUSUARIO = "pt_p_atrUsuario";
    /** <code>funcionarioTNEWASESORMANUALptpatrUsuario</code> inbound argument id. */
    public static final String ARG_ID_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRUSUARIO = "Clas_1431626842112800Ser_33Arg_5_Alias";
    /** <code>funcionarioTNEWASESORMANUALptpatrUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRUSUARIO = "Usuario";
    /** <code>funcionarioTNEWASESORMANUALptpatrPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRPRIMERNOMBRE = "pt_p_atrPrimerNombre";
    /** <code>funcionarioTNEWASESORMANUALptpatrPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRPRIMERNOMBRE = "Clas_1431626842112800Ser_33Arg_6_Alias";
    /** <code>funcionarioTNEWASESORMANUALptpatrPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRPRIMERNOMBRE = "Primer nombre";
    /** <code>funcionarioTNEWASESORMANUALptpatrSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRSEGUNDONOMBRE = "pt_p_atrSegundoNombre";
    /** <code>funcionarioTNEWASESORMANUALptpatrSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRSEGUNDONOMBRE = "Clas_1431626842112800Ser_33Arg_7_Alias";
    /** <code>funcionarioTNEWASESORMANUALptpatrSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRSEGUNDONOMBRE = "Segundo nombre";
    /** <code>funcionarioTNEWASESORMANUALptpatrPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRPRIMERAPELLIDO = "pt_p_atrPrimerApellido";
    /** <code>funcionarioTNEWASESORMANUALptpatrPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRPRIMERAPELLIDO = "Clas_1431626842112800Ser_33Arg_8_Alias";
    /** <code>funcionarioTNEWASESORMANUALptpatrPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRPRIMERAPELLIDO = "Primer apellido";
    /** <code>funcionarioTNEWASESORMANUALptpatrSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRSEGUNDOAPELLIDO = "pt_p_atrSegundoApellido";
    /** <code>funcionarioTNEWASESORMANUALptpatrSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRSEGUNDOAPELLIDO = "Clas_1431626842112800Ser_33Arg_9_Alias";
    /** <code>funcionarioTNEWASESORMANUALptpatrSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRSEGUNDOAPELLIDO = "Segundo apellido";
    /** <code>funcionarioTNEWASESORMANUALptpatrUsuarioLDAP</code> inbound argument name. */
    public static final String ARG_NAME_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRUSUARIOLDAP = "pt_p_atrUsuarioLDAP";
    /** <code>funcionarioTNEWASESORMANUALptpatrUsuarioLDAP</code> inbound argument id. */
    public static final String ARG_ID_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRUSUARIOLDAP = "Clas_1431626842112800Ser_33Arg_10_Alias";
    /** <code>funcionarioTNEWASESORMANUALptpatrUsuarioLDAP</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRUSUARIOLDAP = "Usuario LDAP";
    /** <code>funcionarioTNEWASESORMANUALptpatrEmail</code> inbound argument name. */
    public static final String ARG_NAME_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATREMAIL = "pt_p_atrEmail";
    /** <code>funcionarioTNEWASESORMANUALptpatrEmail</code> inbound argument id. */
    public static final String ARG_ID_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATREMAIL = "Clas_1431626842112800Ser_33Arg_11_Alias";
    /** <code>funcionarioTNEWASESORMANUALptpatrEmail</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATREMAIL = "Email";
    /** <code>funcionarioTNEWASESORMANUALptpagrTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPAGRTIPOIDENTIFICACION = "pt_p_agrTipoIdentificacion";
    /** <code>funcionarioTNEWASESORMANUALptpagrTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPAGRTIPOIDENTIFICACION = "Clas_1431626842112800Ser_33Arg_16_Alias";
    /** <code>funcionarioTNEWASESORMANUALptpagrTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPAGRTIPOIDENTIFICACION = "Tipo Identificación";
    /** <code>funcionarioTNEWASESORMANUALptpatrmodificaDirector</code> inbound argument name. */
    public static final String ARG_NAME_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRMODIFICADIRECTOR = "pt_p_atrmodificaDirector";
    /** <code>funcionarioTNEWASESORMANUALptpatrmodificaDirector</code> inbound argument id. */
    public static final String ARG_ID_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRMODIFICADIRECTOR = "Clas_1431626842112800Ser_33Arg_17_Alias";
    /** <code>funcionarioTNEWASESORMANUALptpatrmodificaDirector</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRMODIFICADIRECTOR = "pt_p_atrmodificaDirector";
    /** <code>funcionarioTNEWASESORMANUALptpatresDirector</code> inbound argument name. */
    public static final String ARG_NAME_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRESDIRECTOR = "pt_p_atresDirector";
    /** <code>funcionarioTNEWASESORMANUALptpatresDirector</code> inbound argument id. */
    public static final String ARG_ID_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRESDIRECTOR = "Clas_1431626842112800Ser_33Arg_18_Alias";
    /** <code>funcionarioTNEWASESORMANUALptpatresDirector</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRESDIRECTOR = "pt_p_atresDirector";
    /** <code>funcionarioTNEWASESORMANUALptpatrNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRNUMIDENTIFICACION = "pt_p_atrNumIdentificacion";
    /** <code>funcionarioTNEWASESORMANUALptpatrNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRNUMIDENTIFICACION = "Clas_1431626842112800Ser_33Arg_19_Alias";
    /** <code>funcionarioTNEWASESORMANUALptpatrNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRNUMIDENTIFICACION = "pt_p_atrNumIdentificacion";
    /** <code>funcionarioTNEWASESORMANUALptpCodJefe</code> inbound argument name. */
    public static final String ARG_NAME_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPCODJEFE = "pt_p_CodJefe";
    /** <code>funcionarioTNEWASESORMANUALptpCodJefe</code> inbound argument id. */
    public static final String ARG_ID_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPCODJEFE = "Clas_1431626842112800Ser_33Arg_20_Alias";
    /** <code>funcionarioTNEWASESORMANUALptpCodJefe</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPCODJEFE = "Cod. Jefe";
    /** <code>funcionarioTNEWASESORMANUALptpatrModDBasicosPersona</code> inbound argument name. */
    public static final String ARG_NAME_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRMODDBASICOSPERSONA = "pt_p_atrModDBasicosPersona";
    /** <code>funcionarioTNEWASESORMANUALptpatrModDBasicosPersona</code> inbound argument id. */
    public static final String ARG_ID_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRMODDBASICOSPERSONA = "Clas_1431626842112800Ser_33Arg_64_Alias";
    /** <code>funcionarioTNEWASESORMANUALptpatrModDBasicosPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALPTPATRMODDBASICOSPERSONA = "pt_p_atrModDBasicosPersona";
    // Outbound arguments
    /** <code>funcionarioTNEWASESORMANUALoaFuncionario</code> outbound argument name. */
    public static final String ARG_NAME_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALOAFUNCIONARIO = "funcionarioTNEWASESORMANUALoaFuncionario";
    /** <code>funcionarioTNEWASESORMANUALoaFuncionario</code> outbound argument id. */
    public static final String ARG_ID_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALOAFUNCIONARIO = "Clas_1431626842112800Ser_33Arg_88_Alias";
    /** <code>funcionarioTNEWASESORMANUALoaFuncionario</code> outbound argument alias. */
    public static final String ARG_ALIAS_TNEWASESORMANUAL_FUNCIONARIOTNEWASESORMANUALOAFUNCIONARIO = "Usuario";
    // Service (TCAMBIARDISPONIBLE)
    /** <code>TCAMBIARDISPONIBLE</code> service id. */
    public static final String SERV_ID_TCAMBIARDISPONIBLE = "Clas_1431626842112800Ser_51_Alias";
    /** <code>TCAMBIARDISPONIBLE</code> service name. */
    public static final String SERV_NAME_TCAMBIARDISPONIBLE = "TCAMBIARDISPONIBLE";
    /** <code>TCAMBIARDISPONIBLE</code> service alias. */
    public static final String SERV_ALIAS_TCAMBIARDISPONIBLE = "Marcar disponibilidad";
    /** Agents allowed to execute the service TCAMBIARDISPONIBLE **/
    public static final String TCAMBIARDISPONIBLE_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>funcionarioTCAMBIARDISPONIBLEpthisFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARDISPONIBLE_FUNCIONARIOTCAMBIARDISPONIBLEPTHISFUNCIONARIO = "p_thisFuncionario";
    /** <code>funcionarioTCAMBIARDISPONIBLEpthisFuncionario</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARDISPONIBLE_FUNCIONARIOTCAMBIARDISPONIBLEPTHISFUNCIONARIO = "Clas_1431626842112800Ser_51Arg_1_Alias";
    /** <code>funcionarioTCAMBIARDISPONIBLEpthisFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARDISPONIBLE_FUNCIONARIOTCAMBIARDISPONIBLEPTHISFUNCIONARIO = "Usuario";
    /** <code>funcionarioTCAMBIARDISPONIBLEptpeDisponible</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARDISPONIBLE_FUNCIONARIOTCAMBIARDISPONIBLEPTPEDISPONIBLE = "pt_peDisponible";
    /** <code>funcionarioTCAMBIARDISPONIBLEptpeDisponible</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARDISPONIBLE_FUNCIONARIOTCAMBIARDISPONIBLEPTPEDISPONIBLE = "Clas_1431626842112800Ser_51Arg_2_Alias";
    /** <code>funcionarioTCAMBIARDISPONIBLEptpeDisponible</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARDISPONIBLE_FUNCIONARIOTCAMBIARDISPONIBLEPTPEDISPONIBLE = "Disponible";
    // Service (TBORRAR)
    /** <code>TBORRAR</code> service id. */
    public static final String SERV_ID_TBORRAR = "Clas_1431626842112800Ser_60_Alias";
    /** <code>TBORRAR</code> service name. */
    public static final String SERV_NAME_TBORRAR = "TBORRAR";
    /** <code>TBORRAR</code> service alias. */
    public static final String SERV_ALIAS_TBORRAR = "Eliminar";
    /** Agents allowed to execute the service TBORRAR **/
    public static final String TBORRAR_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>TBORRAR</code> precondition 0 id. */
    public static final String PRE_ID_TBORRAR_0 = "Clas_1431626842112800Pre_9_MsgError";
    // Inbound arguments
    /** <code>funcionarioTBORRARpthisFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_TBORRAR_FUNCIONARIOTBORRARPTHISFUNCIONARIO = "p_thisFuncionario";
    /** <code>funcionarioTBORRARpthisFuncionario</code> inbound argument id. */
    public static final String ARG_ID_TBORRAR_FUNCIONARIOTBORRARPTHISFUNCIONARIO = "Clas_1431626842112800Ser_60Arg_1_Alias";
    /** <code>funcionarioTBORRARpthisFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TBORRAR_FUNCIONARIOTBORRARPTHISFUNCIONARIO = "Usuario";
    // Service (changePassword)
    /** <code>changePassword</code> service id. */
    public static final String SERV_ID_CHANGEP4SSW0RD = "Clas_1431626842112800Ser_4B_Alias";
    /** <code>changePassword</code> service name. */
    public static final String SERV_NAME_CHANGEP4SSW0RD = "changePassword";
    /** <code>changePassword</code> service alias. */
    public static final String SERV_ALIAS_CHANGEP4SSW0RD = "Change Password";
    /** Agents allowed to execute the service changePassword **/
    public static final String CHANGEP4SSW0RD_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    // Inbound arguments
    /** <code>funcionariochangePasswordpthisAdmin</code> inbound argument name. */
    public static final String ARG_NAME_CHANGEP4SSW0RD_FUNCIONARIOCHANGEP4SSW0RDPTHISADMIN = "p_thisAdmin";
    /** <code>funcionariochangePasswordpthisAdmin</code> inbound argument id. */
    public static final String ARG_ID_CHANGEP4SSW0RD_FUNCIONARIOCHANGEP4SSW0RDPTHISADMIN = "Clas_1431626842112800Ser_4Arg_1B_Alias";
    /** <code>funcionariochangePasswordpthisAdmin</code> inbound argument alias. */
    public static final String ARG_ALIAS_CHANGEP4SSW0RD_FUNCIONARIOCHANGEP4SSW0RDPTHISADMIN = "Usuario";
    /** <code>funcionariochangePasswordpOldPassword</code> inbound argument name. */
    public static final String ARG_NAME_CHANGEP4SSW0RD_FUNCIONARIOCHANGEP4SSW0RDPOLDP4SSW0RD = "p_OldPassword";
    /** <code>funcionariochangePasswordpOldPassword</code> inbound argument id. */
    public static final String ARG_ID_CHANGEP4SSW0RD_FUNCIONARIOCHANGEP4SSW0RDPOLDP4SSW0RD = "Clas_1431626842112800Ser_4Arg_2B_Alias";
    /** <code>funcionariochangePasswordpOldPassword</code> inbound argument alias. */
    public static final String ARG_ALIAS_CHANGEP4SSW0RD_FUNCIONARIOCHANGEP4SSW0RDPOLDP4SSW0RD = "Old password";
    /** <code>funcionariochangePasswordpNewPassword</code> inbound argument name. */
    public static final String ARG_NAME_CHANGEP4SSW0RD_FUNCIONARIOCHANGEP4SSW0RDPNEWP4SSW0RD = "p_NewPassword";
    /** <code>funcionariochangePasswordpNewPassword</code> inbound argument id. */
    public static final String ARG_ID_CHANGEP4SSW0RD_FUNCIONARIOCHANGEP4SSW0RDPNEWP4SSW0RD = "Clas_1431626842112800Ser_4Arg_2B_Alias";
    /** <code>funcionariochangePasswordpNewPassword</code> inbound argument alias. */
    public static final String ARG_ALIAS_CHANGEP4SSW0RD_FUNCIONARIOCHANGEP4SSW0RDPNEWP4SSW0RD = "Nueva contraseña";

    public static final String FILTER_NAME_IFILTERFUNCIONARIOPORNUMUSU = "iFilterFuncionarioPorNumUsu";
    public static final String VAR_NAME_IFILTERFUNCIONARIOPORNUMUSU_VFNUMUSU = "vfNumUsu";
    public static final String FILTER_NAME_IFILTERPORUSUARIOLDAP = "iFilterPorUsuarioLDAP";
    public static final String VAR_NAME_IFILTERPORUSUARIOLDAP_VFUSULDAP = "vfUsuLDAP";
    public static final String FILTER_NAME_FFUNCIONARIOPORNOMBRE = "F_Funcionario_PorNombre";
    public static final String VAR_NAME_FFUNCIONARIOPORNOMBRE_VFPRINOM = "vfPriNom";
    public static final String VAR_NAME_FFUNCIONARIOPORNOMBRE_VFSEGNOM = "vfSegNom";
    public static final String VAR_NAME_FFUNCIONARIOPORNOMBRE_VFPRIAPE = "vfPriApe";
    public static final String VAR_NAME_FFUNCIONARIOPORNOMBRE_VFSEGAPE = "vfSegApe";
    public static final String FILTER_NAME_FFUNCIONARIOPORNOMBRENOASESO = "F_Funcionario_PorNombreNoAseso";
    public static final String VAR_NAME_FFUNCIONARIOPORNOMBRENOASESO_VFPRINOM = "vfPriNom";
    public static final String VAR_NAME_FFUNCIONARIOPORNOMBRENOASESO_VFSEGNOM = "vfSegNom";
    public static final String VAR_NAME_FFUNCIONARIOPORNOMBRENOASESO_VFPRIAPE = "vfPriApe";
    public static final String VAR_NAME_FFUNCIONARIOPORNOMBRENOASESO_VFSEGAPE = "vfSegApe";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_FUNCIONARIOMANUAL.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_FUNCIONARIOUSUARIO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_FUNCIONARIOPRIMERNOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_FUNCIONARIOSEGUNDONOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_FUNCIONARIOPRIMERAPELLIDO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_FUNCIONARIOSEGUNDOAPELLIDO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_FUNCIONARIODRVNOMBRECOMPLETO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_FUNCIONARIOUSUARIOLDAP.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_FUNCIONARIOEMAIL.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_FUNCIONARIOCODJEFE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_FUNCIONARIODRVNOMJEFE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_FUNCIONARIODRVNOMAGENCIA.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_FUNCIONARIODISPONIBLE.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_FUNCIONARIONUMSOLNOTERMINADAS.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_FUNCIONARIODRVESASESORINTEGRAL.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_FUNCIONARIODRVESAFILIACION.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_FUNCIONARIOIDSESION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(AsesorConstants.ATTR_NAME_ASESORMODDBASICOSPERSONA.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(AsesorConstants.ATTR_NAME_ASESORMODIFICADIRECTOR.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(AsesorConstants.ATTR_NAME_ASESORESDIRECTOR.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(AsesorConstants.ATTR_NAME_ASESORNUMIDENTIFICACION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(AsesorConstants.ATTR_NAME_ASESORESINTEGRAL.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(AsesorConstants.ATTR_NAME_ASESORVERDBASICOSPERSONA.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(AsesorConstants.ATTR_NAME_ASESORVERDOCIDENTIFICACIONPERSONA.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(AsesorConstants.ATTR_NAME_ASESORVERCONTRATONOVEDAD.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(AsesorConstants.ATTR_NAME_ASESORCANALCOMERCIAL.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(AsesorConstants.ATTR_NAME_ASESORCARGO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(AsesorConstants.ATTR_NAME_ASESORESTADO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(AsesorConstants.ATTR_NAME_ASESORACCESOVALIDADORUSUARIOS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_FUNCIONARIOID.toUpperCase(), FUNCIONARIOID_AGENTS);
    	attributeAgents.put(ATTR_NAME_FUNCIONARIOMANUAL.toUpperCase(), FUNCIONARIOMANUAL_AGENTS);
    	attributeAgents.put(ATTR_NAME_FUNCIONARIOUSUARIO.toUpperCase(), FUNCIONARIOUSUARIO_AGENTS);
    	attributeAgents.put(ATTR_NAME_FUNCIONARIOPRIMERNOMBRE.toUpperCase(), FUNCIONARIOPRIMERNOMBRE_AGENTS);
    	attributeAgents.put(ATTR_NAME_FUNCIONARIOSEGUNDONOMBRE.toUpperCase(), FUNCIONARIOSEGUNDONOMBRE_AGENTS);
    	attributeAgents.put(ATTR_NAME_FUNCIONARIOPRIMERAPELLIDO.toUpperCase(), FUNCIONARIOPRIMERAPELLIDO_AGENTS);
    	attributeAgents.put(ATTR_NAME_FUNCIONARIOSEGUNDOAPELLIDO.toUpperCase(), FUNCIONARIOSEGUNDOAPELLIDO_AGENTS);
    	attributeAgents.put(ATTR_NAME_FUNCIONARIODRVNOMBRECOMPLETO.toUpperCase(), FUNCIONARIODRVNOMBRECOMPLETO_AGENTS);
    	attributeAgents.put(ATTR_NAME_FUNCIONARIOUSUARIOLDAP.toUpperCase(), FUNCIONARIOUSUARIOLDAP_AGENTS);
    	attributeAgents.put(ATTR_NAME_FUNCIONARIOEMAIL.toUpperCase(), FUNCIONARIOEMAIL_AGENTS);
    	attributeAgents.put(ATTR_NAME_FUNCIONARIOCODJEFE.toUpperCase(), FUNCIONARIOCODJEFE_AGENTS);
    	attributeAgents.put(ATTR_NAME_FUNCIONARIODRVNOMJEFE.toUpperCase(), FUNCIONARIODRVNOMJEFE_AGENTS);
    	attributeAgents.put(ATTR_NAME_FUNCIONARIODRVNOMAGENCIA.toUpperCase(), FUNCIONARIODRVNOMAGENCIA_AGENTS);
    	attributeAgents.put(ATTR_NAME_FUNCIONARIODISPONIBLE.toUpperCase(), FUNCIONARIODISPONIBLE_AGENTS);
    	attributeAgents.put(ATTR_NAME_FUNCIONARIONUMSOLNOTERMINADAS.toUpperCase(), FUNCIONARIONUMSOLNOTERMINADAS_AGENTS);
    	attributeAgents.put(ATTR_NAME_FUNCIONARIODRVESASESORINTEGRAL.toUpperCase(), FUNCIONARIODRVESASESORINTEGRAL_AGENTS);
    	attributeAgents.put(ATTR_NAME_FUNCIONARIODRVESAFILIACION.toUpperCase(), FUNCIONARIODRVESAFILIACION_AGENTS);
    	attributeAgents.put(ATTR_NAME_FUNCIONARIOIDSESION.toUpperCase(), FUNCIONARIOIDSESION_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_ROL.toUpperCase(), ROL_AGENTS);
        roleAgents.put(ROLE_NAME_SUCURSAL.toUpperCase(), SUCURSAL_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'Funcionario', it returns the identification keys
     * - If className is a facet of the inheritance net of 'Funcionario', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
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
        // Facet 'Asesor'
        if (AsesorConstants.CLASS_NAME.equalsIgnoreCase(className)) {
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
        // Facet 'Funcionario' (This facet)
        if (FuncionarioConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_FUNCIONARIOID);
        }
        return returnList;
    }
}
