package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>RespRegional</code> model class.
 */
public final class RespRegionalConstants {

    private RespRegionalConstants() {

    }

    // Class
    /** <code>RespRegional</code> class id. */
    public static final String CLASS_ID = "Clas_1431871684608346_Alias";
    /** <code>RespRegional</code> class name. */
    public static final String CLASS_NAME = "RespRegional";
    /** <code>RespRegional</code> class alias. */
    public static final String CLASS_ALIAS = "Responsable regional";
    /** <code>RespRegional</code> class table name. */
    public static final String TBL_NAME = "RespRegional";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "funcionarioId,regionalCodigo,passWord";

    public static final String DSICRESPREGIONAL = "IC_RespRegional";
    public static final String DSDSRESPREGIONALPIU = "DS_RespRegional_PIU";
    public static final String DSICRESPREGIONALNOMAPE = "IC_RespRegionalNomApe";
    public static final String DSDSRESPREGIONALFIRMA = "DS_RespRegional_Firma";
    
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
    // Facet (Asesor)
    /** <code>Asesor</code> facet sequence. */
    public static final String CLASS_FACETS_ASESOR = FuncionarioConstants.CLASS_NAME + "." + AsesorConstants.CLASS_NAME;
	
    public static final String CLASS_FACET_GETTER_ASESOR = CLASS_FACET_GETTER_FUNCIONARIO + "." + FuncionarioConstants.CLASS_FACET_GETTER_ASESOR;
    // Facet (AreaMedica)
    /** <code>AreaMedica</code> facet sequence. */
    public static final String CLASS_FACETS_AREAMEDICA = FuncionarioConstants.CLASS_NAME + "." + AreaMedicaConstants.CLASS_NAME;
	
    public static final String CLASS_FACET_GETTER_AREAMEDICA = CLASS_FACET_GETTER_FUNCIONARIO + "." + FuncionarioConstants.CLASS_FACET_GETTER_AREAMEDICA;
    // Facet (Afiliaciones)
    /** <code>Afiliaciones</code> facet sequence. */
    public static final String CLASS_FACETS_AFILIACIONES = FuncionarioConstants.CLASS_NAME + "." + AfiliacionesConstants.CLASS_NAME;
	
    public static final String CLASS_FACET_GETTER_AFILIACIONES = CLASS_FACET_GETTER_FUNCIONARIO + "." + FuncionarioConstants.CLASS_FACET_GETTER_AFILIACIONES;
    // Facet (Gestor)
    /** <code>Gestor</code> facet sequence. */
    public static final String CLASS_FACETS_GESTOR = FuncionarioConstants.CLASS_NAME + "." + GestorConstants.CLASS_NAME;
	
    public static final String CLASS_FACET_GETTER_GESTOR = CLASS_FACET_GETTER_FUNCIONARIO + "." + FuncionarioConstants.CLASS_FACET_GETTER_GESTOR;
    // Facet (MesaDeApoyo)
    /** <code>MesaDeApoyo</code> facet sequence. */
    public static final String CLASS_FACETS_MESADEAPOYO = FuncionarioConstants.CLASS_NAME + "." + MesaDeApoyoConstants.CLASS_NAME;
	
    public static final String CLASS_FACET_GETTER_MESADEAPOYO = CLASS_FACET_GETTER_FUNCIONARIO + "." + FuncionarioConstants.CLASS_FACET_GETTER_MESADEAPOYO;

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
    // Attribute (asesorModDBasicosPersona)
    /** <code>asesorModDBasicosPersona</code> attribute id. */
    public static final String ATTR_ID_ASESORMODDBASICOSPERSONA = AsesorConstants.ATTR_ID_ASESORMODDBASICOSPERSONA;
    /** <code>asesorModDBasicosPersona</code> attribute name. */
    public static final String ATTR_NAME_ASESORMODDBASICOSPERSONA = AsesorConstants.ATTR_NAME_ASESORMODDBASICOSPERSONA;
    /** <code>asesorModDBasicosPersona</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORMODDBASICOSPERSONA = AsesorConstants.ATTR_ALIAS_ASESORMODDBASICOSPERSONA;

    /** <code>asesorModDBasicosPersona</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORMODDBASICOSPERSONA = FuncionarioConstants.CLASS_NAME + "." + AsesorConstants.CLASS_NAME;
    // Attribute (asesormodificaDirector)
    /** <code>asesormodificaDirector</code> attribute id. */
    public static final String ATTR_ID_ASESORMODIFICADIRECTOR = AsesorConstants.ATTR_ID_ASESORMODIFICADIRECTOR;
    /** <code>asesormodificaDirector</code> attribute name. */
    public static final String ATTR_NAME_ASESORMODIFICADIRECTOR = AsesorConstants.ATTR_NAME_ASESORMODIFICADIRECTOR;
    /** <code>asesormodificaDirector</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORMODIFICADIRECTOR = AsesorConstants.ATTR_ALIAS_ASESORMODIFICADIRECTOR;

    /** <code>asesormodificaDirector</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORMODIFICADIRECTOR = FuncionarioConstants.CLASS_NAME + "." + AsesorConstants.CLASS_NAME;
    // Attribute (asesoresDirector)
    /** <code>asesoresDirector</code> attribute id. */
    public static final String ATTR_ID_ASESORESDIRECTOR = AsesorConstants.ATTR_ID_ASESORESDIRECTOR;
    /** <code>asesoresDirector</code> attribute name. */
    public static final String ATTR_NAME_ASESORESDIRECTOR = AsesorConstants.ATTR_NAME_ASESORESDIRECTOR;
    /** <code>asesoresDirector</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORESDIRECTOR = AsesorConstants.ATTR_ALIAS_ASESORESDIRECTOR;

    /** <code>asesoresDirector</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORESDIRECTOR = FuncionarioConstants.CLASS_NAME + "." + AsesorConstants.CLASS_NAME;
    // Attribute (asesorNumIdentificacion)
    /** <code>asesorNumIdentificacion</code> attribute id. */
    public static final String ATTR_ID_ASESORNUMIDENTIFICACION = AsesorConstants.ATTR_ID_ASESORNUMIDENTIFICACION;
    /** <code>asesorNumIdentificacion</code> attribute name. */
    public static final String ATTR_NAME_ASESORNUMIDENTIFICACION = AsesorConstants.ATTR_NAME_ASESORNUMIDENTIFICACION;
    /** <code>asesorNumIdentificacion</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORNUMIDENTIFICACION = AsesorConstants.ATTR_ALIAS_ASESORNUMIDENTIFICACION;

    /** <code>asesorNumIdentificacion</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORNUMIDENTIFICACION = FuncionarioConstants.CLASS_NAME + "." + AsesorConstants.CLASS_NAME;
    // Attribute (asesorEsIntegral)
    /** <code>asesorEsIntegral</code> attribute id. */
    public static final String ATTR_ID_ASESORESINTEGRAL = AsesorConstants.ATTR_ID_ASESORESINTEGRAL;
    /** <code>asesorEsIntegral</code> attribute name. */
    public static final String ATTR_NAME_ASESORESINTEGRAL = AsesorConstants.ATTR_NAME_ASESORESINTEGRAL;
    /** <code>asesorEsIntegral</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORESINTEGRAL = AsesorConstants.ATTR_ALIAS_ASESORESINTEGRAL;

    /** <code>asesorEsIntegral</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORESINTEGRAL = FuncionarioConstants.CLASS_NAME + "." + AsesorConstants.CLASS_NAME;
    // Attribute (asesorVerDBasicosPersona)
    /** <code>asesorVerDBasicosPersona</code> attribute id. */
    public static final String ATTR_ID_ASESORVERDBASICOSPERSONA = AsesorConstants.ATTR_ID_ASESORVERDBASICOSPERSONA;
    /** <code>asesorVerDBasicosPersona</code> attribute name. */
    public static final String ATTR_NAME_ASESORVERDBASICOSPERSONA = AsesorConstants.ATTR_NAME_ASESORVERDBASICOSPERSONA;
    /** <code>asesorVerDBasicosPersona</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORVERDBASICOSPERSONA = AsesorConstants.ATTR_ALIAS_ASESORVERDBASICOSPERSONA;

    /** <code>asesorVerDBasicosPersona</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORVERDBASICOSPERSONA = FuncionarioConstants.CLASS_NAME + "." + AsesorConstants.CLASS_NAME;
    // Attribute (asesorVerDocIdentificacionPersona)
    /** <code>asesorVerDocIdentificacionPersona</code> attribute id. */
    public static final String ATTR_ID_ASESORVERDOCIDENTIFICACIONPERSONA = AsesorConstants.ATTR_ID_ASESORVERDOCIDENTIFICACIONPERSONA;
    /** <code>asesorVerDocIdentificacionPersona</code> attribute name. */
    public static final String ATTR_NAME_ASESORVERDOCIDENTIFICACIONPERSONA = AsesorConstants.ATTR_NAME_ASESORVERDOCIDENTIFICACIONPERSONA;
    /** <code>asesorVerDocIdentificacionPersona</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORVERDOCIDENTIFICACIONPERSONA = AsesorConstants.ATTR_ALIAS_ASESORVERDOCIDENTIFICACIONPERSONA;

    /** <code>asesorVerDocIdentificacionPersona</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORVERDOCIDENTIFICACIONPERSONA = FuncionarioConstants.CLASS_NAME + "." + AsesorConstants.CLASS_NAME;
    // Attribute (asesorVerContratoNovedad)
    /** <code>asesorVerContratoNovedad</code> attribute id. */
    public static final String ATTR_ID_ASESORVERCONTRATONOVEDAD = AsesorConstants.ATTR_ID_ASESORVERCONTRATONOVEDAD;
    /** <code>asesorVerContratoNovedad</code> attribute name. */
    public static final String ATTR_NAME_ASESORVERCONTRATONOVEDAD = AsesorConstants.ATTR_NAME_ASESORVERCONTRATONOVEDAD;
    /** <code>asesorVerContratoNovedad</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORVERCONTRATONOVEDAD = AsesorConstants.ATTR_ALIAS_ASESORVERCONTRATONOVEDAD;

    /** <code>asesorVerContratoNovedad</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORVERCONTRATONOVEDAD = FuncionarioConstants.CLASS_NAME + "." + AsesorConstants.CLASS_NAME;
    // Attribute (asesorCanalComercial)
    /** <code>asesorCanalComercial</code> attribute id. */
    public static final String ATTR_ID_ASESORCANALCOMERCIAL = AsesorConstants.ATTR_ID_ASESORCANALCOMERCIAL;
    /** <code>asesorCanalComercial</code> attribute name. */
    public static final String ATTR_NAME_ASESORCANALCOMERCIAL = AsesorConstants.ATTR_NAME_ASESORCANALCOMERCIAL;
    /** <code>asesorCanalComercial</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORCANALCOMERCIAL = AsesorConstants.ATTR_ALIAS_ASESORCANALCOMERCIAL;

    /** <code>asesorCanalComercial</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORCANALCOMERCIAL = FuncionarioConstants.CLASS_NAME + "." + AsesorConstants.CLASS_NAME;
    // Attribute (asesorCargo)
    /** <code>asesorCargo</code> attribute id. */
    public static final String ATTR_ID_ASESORCARGO = AsesorConstants.ATTR_ID_ASESORCARGO;
    /** <code>asesorCargo</code> attribute name. */
    public static final String ATTR_NAME_ASESORCARGO = AsesorConstants.ATTR_NAME_ASESORCARGO;
    /** <code>asesorCargo</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORCARGO = AsesorConstants.ATTR_ALIAS_ASESORCARGO;

    /** <code>asesorCargo</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORCARGO = FuncionarioConstants.CLASS_NAME + "." + AsesorConstants.CLASS_NAME;
    // Attribute (asesorEstado)
    /** <code>asesorEstado</code> attribute id. */
    public static final String ATTR_ID_ASESORESTADO = AsesorConstants.ATTR_ID_ASESORESTADO;
    /** <code>asesorEstado</code> attribute name. */
    public static final String ATTR_NAME_ASESORESTADO = AsesorConstants.ATTR_NAME_ASESORESTADO;
    /** <code>asesorEstado</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORESTADO = AsesorConstants.ATTR_ALIAS_ASESORESTADO;

    /** <code>asesorEstado</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORESTADO = FuncionarioConstants.CLASS_NAME + "." + AsesorConstants.CLASS_NAME;
    // Attribute (asesorAccesoValidadorUsuarios)
    /** <code>asesorAccesoValidadorUsuarios</code> attribute id. */
    public static final String ATTR_ID_ASESORACCESOVALIDADORUSUARIOS = AsesorConstants.ATTR_ID_ASESORACCESOVALIDADORUSUARIOS;
    /** <code>asesorAccesoValidadorUsuarios</code> attribute name. */
    public static final String ATTR_NAME_ASESORACCESOVALIDADORUSUARIOS = AsesorConstants.ATTR_NAME_ASESORACCESOVALIDADORUSUARIOS;
    /** <code>asesorAccesoValidadorUsuarios</code> attribute alias. */
    public static final String ATTR_ALIAS_ASESORACCESOVALIDADORUSUARIOS = AsesorConstants.ATTR_ALIAS_ASESORACCESOVALIDADORUSUARIOS;

    /** <code>asesorAccesoValidadorUsuarios</code> attribute facet sequence. */
    public static final String PATH_FACETS_ASESORACCESOVALIDADORUSUARIOS = FuncionarioConstants.CLASS_NAME + "." + AsesorConstants.CLASS_NAME;


    // Field (Id)
    /** <code>Id</code> field name. */
    public static final String FLD_FUNCIONARIOID = "Id";    
    /** <code>funcionarioId</code> attribute field name. */
    public static final String ATTR_FIELD_FUNCIONARIOID = "funcionarioId";
    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_REGIONALCODIGO = "Codigo";    
    /** <code>Regional.regionalCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_REGIONAL_REGIONALCODIGO = "regionalCodigo";
    // Field (PassWord)
    /** <code>PassWord</code> field name. */
    public static final String FLD_P4SSW0RD = "PassWord";

    // Component role (Regional)
    /** <code>Regional</code> role id. */
    public static final String ROLE_ID_REGIONAL = "Agr_1431873126400136_Alias";
    /** <code>Regional</code> role name. */
    public static final String ROLE_NAME_REGIONAL = "regional";
    /** <code>Regional</code> role alias. */
    public static final String ROLE_ALIAS_REGIONAL = "Regional";

    /** <code>Regional</code> inverse role name. */
    public static final String ROLE_INVNAME_REGIONAL = RegionalConstants.ROLE_NAME_RESPREGIONAL;
    /** <code>Regional</code> role facet sequence. */
    public static final String PATH_FACETS_REGIONAL = "";
    /** <code>Regional</code> role target class. */
    public static final String ROLE_TARGET_REGIONAL = RegionalConstants.CLASS_NAME;

    /** Agents allowed to navigate through Regional **/
    public static final String REGIONAL_AGENTS = "Admin,SuperAdmin,RespRegional,Asesor,AreaMedica,Gestor,MesaDeApoyo";
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
    public static final String PATH_FACETS_TIPOIDENTIFICACION = FuncionarioConstants.CLASS_NAME + "." + AsesorConstants.CLASS_NAME;
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
    public static final String PATH_FACETS_PLANES = FuncionarioConstants.CLASS_NAME + "." + AfiliacionesConstants.CLASS_NAME;
    /** <code>Planes</code> role target class. */
    public static final String ROLE_TARGET_PLANES = PlanesConstants.CLASS_NAME;


    // Compound role (Firma)
    /** <code>Firma</code> role id. */
    public static final String ROLE_ID_FIRMA = "Agr_1434550009856531_Alias";
    /** <code>Firma</code> role name. */
    public static final String ROLE_NAME_FIRMA = "firma";
    /** <code>RespRegional</code> role alias. */
    public static final String ROLE_ALIAS_FIRMA = "Firma";


    /** <code>Firma</code> inverse role name. */
    public static final String ROLE_INVNAME_FIRMA = FirmaConstants.ROLE_NAME_RESPREGIONAL;
    /** <code>Firma</code> role facet sequence. */
    public static final String PATH_FACETS_FIRMA = "";
    /** <code>Firma</code> role target class. */
    public static final String ROLE_TARGET_FIRMA = FirmaConstants.CLASS_NAME;
    /** Agents allowed to navigate through Firma **/
    public static final String FIRMA_AGENTS = "Admin,SuperAdmin,RespRegional,Asesor,AreaMedica,Gestor,MesaDeApoyo";
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
    public static final String PATH_FACETS_CONTRATOSC = FuncionarioConstants.CLASS_NAME + "." + AsesorConstants.CLASS_NAME;
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
    public static final String PATH_FACETS_AGENTEXPRODUCTO = FuncionarioConstants.CLASS_NAME + "." + AsesorConstants.CLASS_NAME;
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
    public static final String PATH_FACETS_LOGINFORMACIONASESOR = FuncionarioConstants.CLASS_NAME + "." + AsesorConstants.CLASS_NAME;
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
    public static final String PATH_FACETS_LOGHISTORICOPLANES = FuncionarioConstants.CLASS_NAME + "." + AsesorConstants.CLASS_NAME;
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
    public static final String PATH_FACETS_SOLICITUDESARME = FuncionarioConstants.CLASS_NAME + "." + AreaMedicaConstants.CLASS_NAME;
    /** <code>SolicitudesArMe</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUDESARME = SolicitudConstants.CLASS_NAME;

    // Service (InsRegionalResponsable)
    /** <code>InsRegionalResponsable</code> service id. */
    public static final String SERV_ID_INSREGIONALRESPONSABLE = "Clas_1431871684608346Ser_6_Alias";
    /** <code>InsRegionalResponsable</code> service name. */
    public static final String SERV_NAME_INSREGIONALRESPONSABLE = "InsRegionalResponsable";
    /** <code>InsRegionalResponsable</code> service alias. */
    public static final String SERV_ALIAS_INSREGIONALRESPONSABLE = "InsRegionalResponsable";
    /** Agents allowed to execute the service InsRegionalResponsable **/
    public static final String INSREGIONALRESPONSABLE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>respRegionalInsRegionalResponsablepthisRespRegional</code> inbound argument name. */
    public static final String ARG_NAME_INSREGIONALRESPONSABLE_RESPREGIONALINSREGIONALRESPONSABLEPTHISRESPREGIONAL = "p_thisRespRegional";
    /** <code>respRegionalInsRegionalResponsablepthisRespRegional</code> inbound argument id. */
    public static final String ARG_ID_INSREGIONALRESPONSABLE_RESPREGIONALINSREGIONALRESPONSABLEPTHISRESPREGIONAL = "Clas_1431871684608346Ser_6Arg_1_Alias";
    /** <code>respRegionalInsRegionalResponsablepthisRespRegional</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSREGIONALRESPONSABLE_RESPREGIONALINSREGIONALRESPONSABLEPTHISRESPREGIONAL = "Responsable";
    /** <code>respRegionalInsRegionalResponsablepevcRegional</code> inbound argument name. */
    public static final String ARG_NAME_INSREGIONALRESPONSABLE_RESPREGIONALINSREGIONALRESPONSABLEPEVCREGIONAL = "p_evcRegional";
    /** <code>respRegionalInsRegionalResponsablepevcRegional</code> inbound argument id. */
    public static final String ARG_ID_INSREGIONALRESPONSABLE_RESPREGIONALINSREGIONALRESPONSABLEPEVCREGIONAL = "Clas_1431871684608346Ser_6Arg_2_Alias";
    /** <code>respRegionalInsRegionalResponsablepevcRegional</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSREGIONALRESPONSABLE_RESPREGIONALINSREGIONALRESPONSABLEPEVCREGIONAL = "Regional";
    // Service (DelRegionalResponsable)
    /** <code>DelRegionalResponsable</code> service id. */
    public static final String SERV_ID_DELREGIONALRESPONSABLE = "Clas_1431871684608346Ser_9_Alias";
    /** <code>DelRegionalResponsable</code> service name. */
    public static final String SERV_NAME_DELREGIONALRESPONSABLE = "DelRegionalResponsable";
    /** <code>DelRegionalResponsable</code> service alias. */
    public static final String SERV_ALIAS_DELREGIONALRESPONSABLE = "DelRegionalResponsable";
    /** Agents allowed to execute the service DelRegionalResponsable **/
    public static final String DELREGIONALRESPONSABLE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>respRegionalDelRegionalResponsablepthisRespRegional</code> inbound argument name. */
    public static final String ARG_NAME_DELREGIONALRESPONSABLE_RESPREGIONALDELREGIONALRESPONSABLEPTHISRESPREGIONAL = "p_thisRespRegional";
    /** <code>respRegionalDelRegionalResponsablepthisRespRegional</code> inbound argument id. */
    public static final String ARG_ID_DELREGIONALRESPONSABLE_RESPREGIONALDELREGIONALRESPONSABLEPTHISRESPREGIONAL = "Clas_1431871684608346Ser_9Arg_1_Alias";
    /** <code>respRegionalDelRegionalResponsablepthisRespRegional</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELREGIONALRESPONSABLE_RESPREGIONALDELREGIONALRESPONSABLEPTHISRESPREGIONAL = "Responsable";
    /** <code>respRegionalDelRegionalResponsablepevcRegional</code> inbound argument name. */
    public static final String ARG_NAME_DELREGIONALRESPONSABLE_RESPREGIONALDELREGIONALRESPONSABLEPEVCREGIONAL = "p_evcRegional";
    /** <code>respRegionalDelRegionalResponsablepevcRegional</code> inbound argument id. */
    public static final String ARG_ID_DELREGIONALRESPONSABLE_RESPREGIONALDELREGIONALRESPONSABLEPEVCREGIONAL = "Clas_1431871684608346Ser_9Arg_2_Alias";
    /** <code>respRegionalDelRegionalResponsablepevcRegional</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELREGIONALRESPONSABLE_RESPREGIONALDELREGIONALRESPONSABLEPEVCREGIONAL = "Regional";
    // Service (TMODIFICAR)
    /** <code>TMODIFICAR</code> service id. */
    public static final String SERV_ID_TMODIFICAR = "Clas_1431871684608346Ser_7_Alias";
    /** <code>TMODIFICAR</code> service name. */
    public static final String SERV_NAME_TMODIFICAR = "TMODIFICAR";
    /** <code>TMODIFICAR</code> service alias. */
    public static final String SERV_ALIAS_TMODIFICAR = "Modificar responsable de regional";
    /** Agents allowed to execute the service TMODIFICAR **/
    public static final String TMODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>respRegionalTMODIFICARpthisRespRegional</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_RESPREGIONALTMODIFICARPTHISRESPREGIONAL = "p_thisRespRegional";
    /** <code>respRegionalTMODIFICARpthisRespRegional</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_RESPREGIONALTMODIFICARPTHISRESPREGIONAL = "Clas_1431871684608346Ser_7Arg_1_Alias";
    /** <code>respRegionalTMODIFICARpthisRespRegional</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_RESPREGIONALTMODIFICARPTHISRESPREGIONAL = "Responsable regional";
    /** <code>respRegionalTMODIFICARptpUsuarioLDAP</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_RESPREGIONALTMODIFICARPTPUSUARIOLDAP = "pt_p_UsuarioLDAP";
    /** <code>respRegionalTMODIFICARptpUsuarioLDAP</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_RESPREGIONALTMODIFICARPTPUSUARIOLDAP = "Clas_1431871684608346Ser_7Arg_2_Alias";
    /** <code>respRegionalTMODIFICARptpUsuarioLDAP</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_RESPREGIONALTMODIFICARPTPUSUARIOLDAP = "Usuario LDAP";
    /** <code>respRegionalTMODIFICARptpPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_RESPREGIONALTMODIFICARPTPPRIMERNOMBRE = "pt_p_PrimerNombre";
    /** <code>respRegionalTMODIFICARptpPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_RESPREGIONALTMODIFICARPTPPRIMERNOMBRE = "Clas_1431871684608346Ser_7Arg_3_Alias";
    /** <code>respRegionalTMODIFICARptpPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_RESPREGIONALTMODIFICARPTPPRIMERNOMBRE = "Primer nombre";
    /** <code>respRegionalTMODIFICARptpSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_RESPREGIONALTMODIFICARPTPSEGUNDONOMBRE = "pt_p_SegundoNombre";
    /** <code>respRegionalTMODIFICARptpSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_RESPREGIONALTMODIFICARPTPSEGUNDONOMBRE = "Clas_1431871684608346Ser_7Arg_4_Alias";
    /** <code>respRegionalTMODIFICARptpSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_RESPREGIONALTMODIFICARPTPSEGUNDONOMBRE = "Segundo nombre";
    /** <code>respRegionalTMODIFICARptpPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_RESPREGIONALTMODIFICARPTPPRIMERAPELLIDO = "pt_p_PrimerApellido";
    /** <code>respRegionalTMODIFICARptpPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_RESPREGIONALTMODIFICARPTPPRIMERAPELLIDO = "Clas_1431871684608346Ser_7Arg_5_Alias";
    /** <code>respRegionalTMODIFICARptpPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_RESPREGIONALTMODIFICARPTPPRIMERAPELLIDO = "Primer apellido";
    /** <code>respRegionalTMODIFICARptpSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_RESPREGIONALTMODIFICARPTPSEGUNDOAPELLIDO = "pt_p_SegundoApellido";
    /** <code>respRegionalTMODIFICARptpSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_RESPREGIONALTMODIFICARPTPSEGUNDOAPELLIDO = "Clas_1431871684608346Ser_7Arg_6_Alias";
    /** <code>respRegionalTMODIFICARptpSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_RESPREGIONALTMODIFICARPTPSEGUNDOAPELLIDO = "Segundo apellido";
    /** <code>respRegionalTMODIFICARptpEmail</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_RESPREGIONALTMODIFICARPTPEMAIL = "pt_p_Email";
    /** <code>respRegionalTMODIFICARptpEmail</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_RESPREGIONALTMODIFICARPTPEMAIL = "Clas_1431871684608346Ser_7Arg_7_Alias";
    /** <code>respRegionalTMODIFICARptpEmail</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_RESPREGIONALTMODIFICARPTPEMAIL = "Email";
    /** <code>respRegionalTMODIFICARptpevcRegional</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_RESPREGIONALTMODIFICARPTPEVCREGIONAL = "pt_p_evcRegional";
    /** <code>respRegionalTMODIFICARptpevcRegional</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_RESPREGIONALTMODIFICARPTPEVCREGIONAL = "Clas_1431871684608346Ser_7Arg_9_Alias";
    /** <code>respRegionalTMODIFICARptpevcRegional</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_RESPREGIONALTMODIFICARPTPEVCREGIONAL = "Regional";
    // Service (TCREAROMODFIRMA)
    /** <code>TCREAROMODFIRMA</code> service id. */
    public static final String SERV_ID_TCREAROMODFIRMA = "Clas_1431871684608346Ser_8_Alias";
    /** <code>TCREAROMODFIRMA</code> service name. */
    public static final String SERV_NAME_TCREAROMODFIRMA = "TCREAROMODFIRMA";
    /** <code>TCREAROMODFIRMA</code> service alias. */
    public static final String SERV_ALIAS_TCREAROMODFIRMA = "Crear o modificar firma";
    /** Agents allowed to execute the service TCREAROMODFIRMA **/
    public static final String TCREAROMODFIRMA_SRVAGENTS = "SuperAdmin,RespRegional";
    // Inbound arguments
    /** <code>respRegionalTCREAROMODFIRMApthisRespRegional</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODFIRMA_RESPREGIONALTCREAROMODFIRMAPTHISRESPREGIONAL = "p_thisRespRegional";
    /** <code>respRegionalTCREAROMODFIRMApthisRespRegional</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODFIRMA_RESPREGIONALTCREAROMODFIRMAPTHISRESPREGIONAL = "Clas_1431871684608346Ser_8Arg_1_Alias";
    /** <code>respRegionalTCREAROMODFIRMApthisRespRegional</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODFIRMA_RESPREGIONALTCREAROMODFIRMAPTHISRESPREGIONAL = "Responsable regional";
    /** <code>respRegionalTCREAROMODFIRMAptpatrImagenFirma</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODFIRMA_RESPREGIONALTCREAROMODFIRMAPTPATRIMAGENFIRMA = "pt_p_atrImagenFirma";
    /** <code>respRegionalTCREAROMODFIRMAptpatrImagenFirma</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODFIRMA_RESPREGIONALTCREAROMODFIRMAPTPATRIMAGENFIRMA = "Clas_1431871684608346Ser_8Arg_5_Alias";
    /** <code>respRegionalTCREAROMODFIRMAptpatrImagenFirma</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODFIRMA_RESPREGIONALTCREAROMODFIRMAPTPATRIMAGENFIRMA = "Firma";
    /** <code>respRegionalTCREAROMODFIRMAptpatrLatitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODFIRMA_RESPREGIONALTCREAROMODFIRMAPTPATRLATITUD = "pt_p_atrLatitud";
    /** <code>respRegionalTCREAROMODFIRMAptpatrLatitud</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODFIRMA_RESPREGIONALTCREAROMODFIRMAPTPATRLATITUD = "Clas_1431871684608346Ser_8Arg_6_Alias";
    /** <code>respRegionalTCREAROMODFIRMAptpatrLatitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODFIRMA_RESPREGIONALTCREAROMODFIRMAPTPATRLATITUD = "Latitud";
    /** <code>respRegionalTCREAROMODFIRMAptpatrLongitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROMODFIRMA_RESPREGIONALTCREAROMODFIRMAPTPATRLONGITUD = "pt_p_atrLongitud";
    /** <code>respRegionalTCREAROMODFIRMAptpatrLongitud</code> inbound argument id. */
    public static final String ARG_ID_TCREAROMODFIRMA_RESPREGIONALTCREAROMODFIRMAPTPATRLONGITUD = "Clas_1431871684608346Ser_8Arg_7_Alias";
    /** <code>respRegionalTCREAROMODFIRMAptpatrLongitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROMODFIRMA_RESPREGIONALTCREAROMODFIRMAPTPATRLONGITUD = "Longitud";
    // Service (changePassword)
    /** <code>changePassword</code> service id. */
    public static final String SERV_ID_CHANGEP4SSW0RD = "Clas_1431871684608346Ser_4B_Alias";
    /** <code>changePassword</code> service name. */
    public static final String SERV_NAME_CHANGEP4SSW0RD = "changePassword";
    /** <code>changePassword</code> service alias. */
    public static final String SERV_ALIAS_CHANGEP4SSW0RD = "Change Password";
    /** Agents allowed to execute the service changePassword **/
    public static final String CHANGEP4SSW0RD_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    // Inbound arguments
    /** <code>respRegionalchangePasswordpthisAdmin</code> inbound argument name. */
    public static final String ARG_NAME_CHANGEP4SSW0RD_RESPREGIONALCHANGEP4SSW0RDPTHISADMIN = "p_thisAdmin";
    /** <code>respRegionalchangePasswordpthisAdmin</code> inbound argument id. */
    public static final String ARG_ID_CHANGEP4SSW0RD_RESPREGIONALCHANGEP4SSW0RDPTHISADMIN = "Clas_1431626842112800Ser_4Arg_1B_Alias";
    /** <code>respRegionalchangePasswordpthisAdmin</code> inbound argument alias. */
    public static final String ARG_ALIAS_CHANGEP4SSW0RD_RESPREGIONALCHANGEP4SSW0RDPTHISADMIN = "Usuario";
    /** <code>respRegionalchangePasswordpOldPassword</code> inbound argument name. */
    public static final String ARG_NAME_CHANGEP4SSW0RD_RESPREGIONALCHANGEP4SSW0RDPOLDP4SSW0RD = "p_OldPassword";
    /** <code>respRegionalchangePasswordpOldPassword</code> inbound argument id. */
    public static final String ARG_ID_CHANGEP4SSW0RD_RESPREGIONALCHANGEP4SSW0RDPOLDP4SSW0RD = "Clas_1431626842112800Ser_4Arg_2B_Alias";
    /** <code>respRegionalchangePasswordpOldPassword</code> inbound argument alias. */
    public static final String ARG_ALIAS_CHANGEP4SSW0RD_RESPREGIONALCHANGEP4SSW0RDPOLDP4SSW0RD = "Old password";
    /** <code>respRegionalchangePasswordpNewPassword</code> inbound argument name. */
    public static final String ARG_NAME_CHANGEP4SSW0RD_RESPREGIONALCHANGEP4SSW0RDPNEWP4SSW0RD = "p_NewPassword";
    /** <code>respRegionalchangePasswordpNewPassword</code> inbound argument id. */
    public static final String ARG_ID_CHANGEP4SSW0RD_RESPREGIONALCHANGEP4SSW0RDPNEWP4SSW0RD = "Clas_1431626842112800Ser_4Arg_2B_Alias";
    /** <code>respRegionalchangePasswordpNewPassword</code> inbound argument alias. */
    public static final String ARG_ALIAS_CHANGEP4SSW0RD_RESPREGIONALCHANGEP4SSW0RDPNEWP4SSW0RD = "Nueva contraseña";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
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
        attributeTypes.putAll(FuncionarioConstants.ATTRIBUTE_TYPES);
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
        attributeAgents.putAll(FuncionarioConstants.ATTRIBUTE_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_FIRMA.toUpperCase(), FIRMA_AGENTS);
        roleAgents.put(ROLE_NAME_REGIONAL.toUpperCase(), REGIONAL_AGENTS);
        roleAgents.put(FuncionarioConstants.ROLE_NAME_ROL.toUpperCase(), FuncionarioConstants.ROL_AGENTS);
        roleAgents.put(FuncionarioConstants.ROLE_NAME_SUCURSAL.toUpperCase(), FuncionarioConstants.SUCURSAL_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'RespRegional', it returns the identification keys
     * - If className is a facet of the inheritance net of 'RespRegional', it returns the foreign keys to the table of the facet className
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
        // Facet 'Gestor'
        if (GestorConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_FUNCIONARIOID);
        }
        // Facet 'MesaDeApoyo'
        if (MesaDeApoyoConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_FUNCIONARIOID);
        }
        // Facet 'RespRegional' (This facet)
        if (RespRegionalConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_FUNCIONARIOID);
        }
        return returnList;
    }
}
