package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>UsuarioNovedad</code> model class.
 */
public final class UsuarioNovedadConstants {

    private UsuarioNovedadConstants() {

    }

    // Class
    /** <code>UsuarioNovedad</code> class id. */
    public static final String CLASS_ID = "Clas_1581442138112529_Alias";
    /** <code>UsuarioNovedad</code> class name. */
    public static final String CLASS_NAME = "UsuarioNovedad";
    /** <code>UsuarioNovedad</code> class alias. */
    public static final String CLASS_ALIAS = "Usuario";
    /** <code>UsuarioNovedad</code> class table name. */
    public static final String TBL_NAME = "UsuarioNovedad";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "usuarioNovedadidUsuarioNovedad,familiaNovedadidFamiliaNovedad,tipoIdentificacionCodigo,parentescoParentescoCodigo,estadoBeneficiarioEstadoBeneficiarioCodigo,parentescoParentescoNuevoCodigo,tipoIdentificacionTipoIdentificacionCDCodigo,usuarioNovedadNumIdentificacion,usuarioNovedadPrimerNombre,usuarioNovedadSegundoNombre,usuarioNovedadPrimerApellido,usuarioNovedadSegundoApellido,usuarioNovedadMotivoEstado,usuarioNovedadFechaIniVigencia,usuarioNovedadFechaAntiguedad,usuarioNovedadNumUsuario,usuarioNovedadGenero,usuarioNovedadFechaNacimiento,usuarioNovedadSUNumMeses,usuarioNovedadNumIdentificacionCD,usuarioNovedadExcluido,usuarioNovedadContratacionRO,usuarioNovedadProrrogaSuspension,usuarioNovedadActivacionSuspension";

    public static final String DSICUSUARIONOVEDAD = "IC_UsuarioNovedad";
    public static final String DSDSUSUNOVTIPOTITULAR = "DS_UsuNov_TipoTitular";
    public static final String DSDSUSUNOVTIPOUSUARIO = "DS_UsuNov_TipoUsuario";
    public static final String DSDSUSUARIONOVEDADNULL = "DS_UsuarioNovedad_Null";
    

    // Attribute (usuarioNovedadidUsuarioNovedad)
    /** <code>usuarioNovedadidUsuarioNovedad</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADIDUSUARIONOVEDAD = "Clas_1581442138112529Atr_1_Alias";
    /** <code>usuarioNovedadidUsuarioNovedad</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADIDUSUARIONOVEDAD = "usuarioNovedadidUsuarioNovedad";
    /** <code>usuarioNovedadidUsuarioNovedad</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADIDUSUARIONOVEDAD = "Id.";

    /** <code>usuarioNovedadidUsuarioNovedad</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADIDUSUARIONOVEDAD = "";
    /** Agents allowed to view the attribute usuarioNovedadidUsuarioNovedad **/
    public static final String USUARIONOVEDADIDUSUARIONOVEDAD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedadNumIdentificacion)
    /** <code>usuarioNovedadNumIdentificacion</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADNUMIDENTIFICACION = "Clas_1581442138112529Atr_3_Alias";
    /** <code>usuarioNovedadNumIdentificacion</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADNUMIDENTIFICACION = "usuarioNovedadNumIdentificacion";
    /** <code>usuarioNovedadNumIdentificacion</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADNUMIDENTIFICACION = "Nº Identificación";

    /** <code>usuarioNovedadNumIdentificacion</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADNUMIDENTIFICACION = "";
    /** Agents allowed to view the attribute usuarioNovedadNumIdentificacion **/
    public static final String USUARIONOVEDADNUMIDENTIFICACION_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedadPrimerNombre)
    /** <code>usuarioNovedadPrimerNombre</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADPRIMERNOMBRE = "Clas_1581442138112529Atr_4_Alias";
    /** <code>usuarioNovedadPrimerNombre</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADPRIMERNOMBRE = "usuarioNovedadPrimerNombre";
    /** <code>usuarioNovedadPrimerNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADPRIMERNOMBRE = "Primer Nombre";

    /** <code>usuarioNovedadPrimerNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADPRIMERNOMBRE = "";
    /** Agents allowed to view the attribute usuarioNovedadPrimerNombre **/
    public static final String USUARIONOVEDADPRIMERNOMBRE_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedadSegundoNombre)
    /** <code>usuarioNovedadSegundoNombre</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADSEGUNDONOMBRE = "Clas_1581442138112529Atr_10_Alias";
    /** <code>usuarioNovedadSegundoNombre</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADSEGUNDONOMBRE = "usuarioNovedadSegundoNombre";
    /** <code>usuarioNovedadSegundoNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADSEGUNDONOMBRE = "Segundo Nombre";

    /** <code>usuarioNovedadSegundoNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADSEGUNDONOMBRE = "";
    /** Agents allowed to view the attribute usuarioNovedadSegundoNombre **/
    public static final String USUARIONOVEDADSEGUNDONOMBRE_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedadPrimerApellido)
    /** <code>usuarioNovedadPrimerApellido</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADPRIMERAPELLIDO = "Clas_1581442138112529Atr_11_Alias";
    /** <code>usuarioNovedadPrimerApellido</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADPRIMERAPELLIDO = "usuarioNovedadPrimerApellido";
    /** <code>usuarioNovedadPrimerApellido</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADPRIMERAPELLIDO = "Primer Apellido";

    /** <code>usuarioNovedadPrimerApellido</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADPRIMERAPELLIDO = "";
    /** Agents allowed to view the attribute usuarioNovedadPrimerApellido **/
    public static final String USUARIONOVEDADPRIMERAPELLIDO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedadSegundoApellido)
    /** <code>usuarioNovedadSegundoApellido</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADSEGUNDOAPELLIDO = "Clas_1581442138112529Atr_12_Alias";
    /** <code>usuarioNovedadSegundoApellido</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADSEGUNDOAPELLIDO = "usuarioNovedadSegundoApellido";
    /** <code>usuarioNovedadSegundoApellido</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADSEGUNDOAPELLIDO = "Segundo Apellido";

    /** <code>usuarioNovedadSegundoApellido</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADSEGUNDOAPELLIDO = "";
    /** Agents allowed to view the attribute usuarioNovedadSegundoApellido **/
    public static final String USUARIONOVEDADSEGUNDOAPELLIDO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedadMotivoEstado)
    /** <code>usuarioNovedadMotivoEstado</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADMOTIVOESTADO = "Clas_1581442138112529Atr_6_Alias";
    /** <code>usuarioNovedadMotivoEstado</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADMOTIVOESTADO = "usuarioNovedadMotivoEstado";
    /** <code>usuarioNovedadMotivoEstado</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADMOTIVOESTADO = "Motivo";

    /** <code>usuarioNovedadMotivoEstado</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADMOTIVOESTADO = "";
    /** Agents allowed to view the attribute usuarioNovedadMotivoEstado **/
    public static final String USUARIONOVEDADMOTIVOESTADO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedadFechaIniVigencia)
    /** <code>usuarioNovedadFechaIniVigencia</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADFECHAINIVIGENCIA = "Clas_1581442138112529Atr_8_Alias";
    /** <code>usuarioNovedadFechaIniVigencia</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADFECHAINIVIGENCIA = "usuarioNovedadFechaIniVigencia";
    /** <code>usuarioNovedadFechaIniVigencia</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADFECHAINIVIGENCIA = "Fecha inicio vigencia";

    /** <code>usuarioNovedadFechaIniVigencia</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADFECHAINIVIGENCIA = "";
    /** Agents allowed to view the attribute usuarioNovedadFechaIniVigencia **/
    public static final String USUARIONOVEDADFECHAINIVIGENCIA_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedadFechaAntiguedad)
    /** <code>usuarioNovedadFechaAntiguedad</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADFECHAANTIGUEDAD = "Clas_1581442138112529Atr_9_Alias";
    /** <code>usuarioNovedadFechaAntiguedad</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADFECHAANTIGUEDAD = "usuarioNovedadFechaAntiguedad";
    /** <code>usuarioNovedadFechaAntiguedad</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADFECHAANTIGUEDAD = "Fecha antiguedad";

    /** <code>usuarioNovedadFechaAntiguedad</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADFECHAANTIGUEDAD = "";
    /** Agents allowed to view the attribute usuarioNovedadFechaAntiguedad **/
    public static final String USUARIONOVEDADFECHAANTIGUEDAD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedadNumUsuario)
    /** <code>usuarioNovedadNumUsuario</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADNUMUSUARIO = "Clas_1581442138112529Atr_14_Alias";
    /** <code>usuarioNovedadNumUsuario</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADNUMUSUARIO = "usuarioNovedadNumUsuario";
    /** <code>usuarioNovedadNumUsuario</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADNUMUSUARIO = "Nº Usuario";

    /** <code>usuarioNovedadNumUsuario</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADNUMUSUARIO = "";
    /** Agents allowed to view the attribute usuarioNovedadNumUsuario **/
    public static final String USUARIONOVEDADNUMUSUARIO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedadGenero)
    /** <code>usuarioNovedadGenero</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADGENERO = "Clas_1581442138112529Atr_27_Alias";
    /** <code>usuarioNovedadGenero</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADGENERO = "usuarioNovedadGenero";
    /** <code>usuarioNovedadGenero</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADGENERO = "Género";

    /** <code>usuarioNovedadGenero</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADGENERO = "";
    /** Agents allowed to view the attribute usuarioNovedadGenero **/
    public static final String USUARIONOVEDADGENERO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedadFechaNacimiento)
    /** <code>usuarioNovedadFechaNacimiento</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADFECHANACIMIENTO = "Clas_1581442138112529Atr_24_Alias";
    /** <code>usuarioNovedadFechaNacimiento</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADFECHANACIMIENTO = "usuarioNovedadFechaNacimiento";
    /** <code>usuarioNovedadFechaNacimiento</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADFECHANACIMIENTO = "Fecha Nacimiento";

    /** <code>usuarioNovedadFechaNacimiento</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADFECHANACIMIENTO = "";
    /** Agents allowed to view the attribute usuarioNovedadFechaNacimiento **/
    public static final String USUARIONOVEDADFECHANACIMIENTO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedadSUNumMeses)
    /** <code>usuarioNovedadSUNumMeses</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADSUNUMMESES = "Clas_1581442138112529Atr_17_Alias";
    /** <code>usuarioNovedadSUNumMeses</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADSUNUMMESES = "usuarioNovedadSUNumMeses";
    /** <code>usuarioNovedadSUNumMeses</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADSUNUMMESES = "Nº Meses";

    /** <code>usuarioNovedadSUNumMeses</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADSUNUMMESES = "";
    /** Agents allowed to view the attribute usuarioNovedadSUNumMeses **/
    public static final String USUARIONOVEDADSUNUMMESES_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedadNumIdentificacionCD)
    /** <code>usuarioNovedadNumIdentificacionCD</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADNUMIDENTIFICACIONCD = "Clas_1581442138112529Atr_19_Alias";
    /** <code>usuarioNovedadNumIdentificacionCD</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADNUMIDENTIFICACIONCD = "usuarioNovedadNumIdentificacionCD";
    /** <code>usuarioNovedadNumIdentificacionCD</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADNUMIDENTIFICACIONCD = "Nº Identificación Nuevo";

    /** <code>usuarioNovedadNumIdentificacionCD</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADNUMIDENTIFICACIONCD = "";
    /** Agents allowed to view the attribute usuarioNovedadNumIdentificacionCD **/
    public static final String USUARIONOVEDADNUMIDENTIFICACIONCD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedaddrvEstaActivo)
    /** <code>usuarioNovedaddrvEstaActivo</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADDRVESTAACTIVO = "Clas_1581442138112529Atr_20_Alias";
    /** <code>usuarioNovedaddrvEstaActivo</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADDRVESTAACTIVO = "usuarioNovedaddrvEstaActivo";
    /** <code>usuarioNovedaddrvEstaActivo</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADDRVESTAACTIVO = "Está activo";

    /** <code>usuarioNovedaddrvEstaActivo</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADDRVESTAACTIVO = "";
    /** Agents allowed to view the attribute usuarioNovedaddrvEstaActivo **/
    public static final String USUARIONOVEDADDRVESTAACTIVO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedaddrvParentescoOK)
    /** <code>usuarioNovedaddrvParentescoOK</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADDRVPARENTESCOOK = "Clas_1581442138112529Atr_21_Alias";
    /** <code>usuarioNovedaddrvParentescoOK</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADDRVPARENTESCOOK = "usuarioNovedaddrvParentescoOK";
    /** <code>usuarioNovedaddrvParentescoOK</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADDRVPARENTESCOOK = "Válido";

    /** <code>usuarioNovedaddrvParentescoOK</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADDRVPARENTESCOOK = "";
    /** Agents allowed to view the attribute usuarioNovedaddrvParentescoOK **/
    public static final String USUARIONOVEDADDRVPARENTESCOOK_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedaddrvEsTitular)
    /** <code>usuarioNovedaddrvEsTitular</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADDRVESTITULAR = "Clas_1581442138112529Atr_22_Alias";
    /** <code>usuarioNovedaddrvEsTitular</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADDRVESTITULAR = "usuarioNovedaddrvEsTitular";
    /** <code>usuarioNovedaddrvEsTitular</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADDRVESTITULAR = "Es Titular";

    /** <code>usuarioNovedaddrvEsTitular</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADDRVESTITULAR = "";
    /** Agents allowed to view the attribute usuarioNovedaddrvEsTitular **/
    public static final String USUARIONOVEDADDRVESTITULAR_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedaddrvEsPadre)
    /** <code>usuarioNovedaddrvEsPadre</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADDRVESPADRE = "Clas_1581442138112529Atr_23_Alias";
    /** <code>usuarioNovedaddrvEsPadre</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADDRVESPADRE = "usuarioNovedaddrvEsPadre";
    /** <code>usuarioNovedaddrvEsPadre</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADDRVESPADRE = "Es Padre";

    /** <code>usuarioNovedaddrvEsPadre</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADDRVESPADRE = "";
    /** Agents allowed to view the attribute usuarioNovedaddrvEsPadre **/
    public static final String USUARIONOVEDADDRVESPADRE_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedaddrvEdad)
    /** <code>usuarioNovedaddrvEdad</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADDRVEDAD = "Clas_1581442138112529Atr_25_Alias";
    /** <code>usuarioNovedaddrvEdad</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADDRVEDAD = "usuarioNovedaddrvEdad";
    /** <code>usuarioNovedaddrvEdad</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADDRVEDAD = "Edad";

    /** <code>usuarioNovedaddrvEdad</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADDRVEDAD = "";
    /** Agents allowed to view the attribute usuarioNovedaddrvEdad **/
    public static final String USUARIONOVEDADDRVEDAD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedaddrvEsHijo)
    /** <code>usuarioNovedaddrvEsHijo</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADDRVESHIJO = "Clas_1581442138112529Atr_26_Alias";
    /** <code>usuarioNovedaddrvEsHijo</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADDRVESHIJO = "usuarioNovedaddrvEsHijo";
    /** <code>usuarioNovedaddrvEsHijo</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADDRVESHIJO = "Es Hijo";

    /** <code>usuarioNovedaddrvEsHijo</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADDRVESHIJO = "";
    /** Agents allowed to view the attribute usuarioNovedaddrvEsHijo **/
    public static final String USUARIONOVEDADDRVESHIJO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedaddrvEsConyuge)
    /** <code>usuarioNovedaddrvEsConyuge</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADDRVESCONYUGE = "Clas_1581442138112529Atr_28_Alias";
    /** <code>usuarioNovedaddrvEsConyuge</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADDRVESCONYUGE = "usuarioNovedaddrvEsConyuge";
    /** <code>usuarioNovedaddrvEsConyuge</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADDRVESCONYUGE = "Es Conyuge";

    /** <code>usuarioNovedaddrvEsConyuge</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADDRVESCONYUGE = "";
    /** Agents allowed to view the attribute usuarioNovedaddrvEsConyuge **/
    public static final String USUARIONOVEDADDRVESCONYUGE_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedaddrvEsElTitular)
    /** <code>usuarioNovedaddrvEsElTitular</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADDRVESELTITULAR = "Clas_1581442138112529Atr_15_Alias";
    /** <code>usuarioNovedaddrvEsElTitular</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADDRVESELTITULAR = "usuarioNovedaddrvEsElTitular";
    /** <code>usuarioNovedaddrvEsElTitular</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADDRVESELTITULAR = "Es el titular";

    /** <code>usuarioNovedaddrvEsElTitular</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADDRVESELTITULAR = "";
    /** Agents allowed to view the attribute usuarioNovedaddrvEsElTitular **/
    public static final String USUARIONOVEDADDRVESELTITULAR_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedaddrvPuedeSerTitular)
    /** <code>usuarioNovedaddrvPuedeSerTitular</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADDRVPUEDESERTITULAR = "Clas_1581442138112529Atr_16_Alias";
    /** <code>usuarioNovedaddrvPuedeSerTitular</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADDRVPUEDESERTITULAR = "usuarioNovedaddrvPuedeSerTitular";
    /** <code>usuarioNovedaddrvPuedeSerTitular</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADDRVPUEDESERTITULAR = "Puede ser titular";

    /** <code>usuarioNovedaddrvPuedeSerTitular</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADDRVPUEDESERTITULAR = "";
    /** Agents allowed to view the attribute usuarioNovedaddrvPuedeSerTitular **/
    public static final String USUARIONOVEDADDRVPUEDESERTITULAR_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedaddrvEstaSuspendido)
    /** <code>usuarioNovedaddrvEstaSuspendido</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADDRVESTASUSPENDIDO = "Clas_1581442138112529Atr_18_Alias";
    /** <code>usuarioNovedaddrvEstaSuspendido</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADDRVESTASUSPENDIDO = "usuarioNovedaddrvEstaSuspendido";
    /** <code>usuarioNovedaddrvEstaSuspendido</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADDRVESTASUSPENDIDO = "Usuario Suspendido";

    /** <code>usuarioNovedaddrvEstaSuspendido</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADDRVESTASUSPENDIDO = "";
    /** Agents allowed to view the attribute usuarioNovedaddrvEstaSuspendido **/
    public static final String USUARIONOVEDADDRVESTASUSPENDIDO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedadExcluido)
    /** <code>usuarioNovedadExcluido</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADEXCLUIDO = "Clas_1581442138112529Atr_31_Alias";
    /** <code>usuarioNovedadExcluido</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADEXCLUIDO = "usuarioNovedadExcluido";
    /** <code>usuarioNovedadExcluido</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADEXCLUIDO = "Excluido";

    /** <code>usuarioNovedadExcluido</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADEXCLUIDO = "";
    /** Agents allowed to view the attribute usuarioNovedadExcluido **/
    public static final String USUARIONOVEDADEXCLUIDO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedadContratacionRO)
    /** <code>usuarioNovedadContratacionRO</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADCONTRATACIONRO = "Clas_1581442138112529Atr_32_Alias";
    /** <code>usuarioNovedadContratacionRO</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADCONTRATACIONRO = "usuarioNovedadContratacionRO";
    /** <code>usuarioNovedadContratacionRO</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADCONTRATACIONRO = "Contratación rehabilitación oral";

    /** <code>usuarioNovedadContratacionRO</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADCONTRATACIONRO = "";
    /** Agents allowed to view the attribute usuarioNovedadContratacionRO **/
    public static final String USUARIONOVEDADCONTRATACIONRO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedadProrrogaSuspension)
    /** <code>usuarioNovedadProrrogaSuspension</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADPRORROGASUSPENSION = "Clas_1581442138112529Atr_33_Alias";
    /** <code>usuarioNovedadProrrogaSuspension</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADPRORROGASUSPENSION = "usuarioNovedadProrrogaSuspension";
    /** <code>usuarioNovedadProrrogaSuspension</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADPRORROGASUSPENSION = "Prorroga Suspension";

    /** <code>usuarioNovedadProrrogaSuspension</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADPRORROGASUSPENSION = "";
    /** Agents allowed to view the attribute usuarioNovedadProrrogaSuspension **/
    public static final String USUARIONOVEDADPRORROGASUSPENSION_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedadActivacionSuspension)
    /** <code>usuarioNovedadActivacionSuspension</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADACTIVACIONSUSPENSION = "Clas_1581442138112529Atr_34_Alias";
    /** <code>usuarioNovedadActivacionSuspension</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADACTIVACIONSUSPENSION = "usuarioNovedadActivacionSuspension";
    /** <code>usuarioNovedadActivacionSuspension</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADACTIVACIONSUSPENSION = "Activación Suspension";

    /** <code>usuarioNovedadActivacionSuspension</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADACTIVACIONSUSPENSION = "";
    /** Agents allowed to view the attribute usuarioNovedadActivacionSuspension **/
    public static final String USUARIONOVEDADACTIVACIONSUSPENSION_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedadDrvNombreCompleto)
    /** <code>usuarioNovedadDrvNombreCompleto</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADDRVNOMBRECOMPLETO = "Clas_1581442138112529Atr_35_Alias";
    /** <code>usuarioNovedadDrvNombreCompleto</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADDRVNOMBRECOMPLETO = "usuarioNovedadDrvNombreCompleto";
    /** <code>usuarioNovedadDrvNombreCompleto</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADDRVNOMBRECOMPLETO = "Nombre Completo";

    /** <code>usuarioNovedadDrvNombreCompleto</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADDRVNOMBRECOMPLETO = "";
    /** Agents allowed to view the attribute usuarioNovedadDrvNombreCompleto **/
    public static final String USUARIONOVEDADDRVNOMBRECOMPLETO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedadDrvIdentificacion)
    /** <code>usuarioNovedadDrvIdentificacion</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADDRVIDENTIFICACION = "Clas_1581442138112529Atr_36_Alias";
    /** <code>usuarioNovedadDrvIdentificacion</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADDRVIDENTIFICACION = "usuarioNovedadDrvIdentificacion";
    /** <code>usuarioNovedadDrvIdentificacion</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADDRVIDENTIFICACION = "Identificación";

    /** <code>usuarioNovedadDrvIdentificacion</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADDRVIDENTIFICACION = "";
    /** Agents allowed to view the attribute usuarioNovedadDrvIdentificacion **/
    public static final String USUARIONOVEDADDRVIDENTIFICACION_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedadDrvAplicaNovedad)
    /** <code>usuarioNovedadDrvAplicaNovedad</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADDRVAPLICANOVEDAD = "Clas_1581442138112529Atr_38_Alias";
    /** <code>usuarioNovedadDrvAplicaNovedad</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADDRVAPLICANOVEDAD = "usuarioNovedadDrvAplicaNovedad";
    /** <code>usuarioNovedadDrvAplicaNovedad</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADDRVAPLICANOVEDAD = "Aplica la novedad";

    /** <code>usuarioNovedadDrvAplicaNovedad</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADDRVAPLICANOVEDAD = "";
    /** Agents allowed to view the attribute usuarioNovedadDrvAplicaNovedad **/
    public static final String USUARIONOVEDADDRVAPLICANOVEDAD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioNovedadDrvNuevaIdentificacion)
    /** <code>usuarioNovedadDrvNuevaIdentificacion</code> attribute id. */
    public static final String ATTR_ID_USUARIONOVEDADDRVNUEVAIDENTIFICACION = "Clas_1581442138112529Atr_39_Alias";
    /** <code>usuarioNovedadDrvNuevaIdentificacion</code> attribute name. */
    public static final String ATTR_NAME_USUARIONOVEDADDRVNUEVAIDENTIFICACION = "usuarioNovedadDrvNuevaIdentificacion";
    /** <code>usuarioNovedadDrvNuevaIdentificacion</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIONOVEDADDRVNUEVAIDENTIFICACION = "Nueva Identificación";

    /** <code>usuarioNovedadDrvNuevaIdentificacion</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIONOVEDADDRVNUEVAIDENTIFICACION = "";
    /** Agents allowed to view the attribute usuarioNovedadDrvNuevaIdentificacion **/
    public static final String USUARIONOVEDADDRVNUEVAIDENTIFICACION_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (id_UsuarioNovedad)
    /** <code>id_UsuarioNovedad</code> field name. */
    public static final String FLD_USUARIONOVEDADIDUSUARIONOVEDAD = "id_UsuarioNovedad";    
    /** <code>usuarioNovedadidUsuarioNovedad</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIONOVEDADIDUSUARIONOVEDAD = "usuarioNovedadidUsuarioNovedad";
    // Field (id_FamiliaNovedad)
    /** <code>id_FamiliaNovedad</code> field name. */
    public static final String FLD_FAMILIANOVEDADIDFAMILIANOVEDAD = "id_FamiliaNovedad";    
    /** <code>FamiliaNovedad.familiaNovedadidFamiliaNovedad</code> attribute field name. */
    public static final String ATTR_FIELD_FAMILIANOVEDAD_FAMILIANOVEDADIDFAMILIANOVEDAD = "familiaNovedadidFamiliaNovedad";
    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_TIPOIDENTIFICACIONCODIGO = "Codigo";    
    /** <code>TipoIdentificacion.tipoIdentificacionCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_TIPOIDENTIFICACION_TIPOIDENTIFICACIONCODIGO = "tipoIdentificacionCodigo";
    // Field (Parentesco_Codigo)
    /** <code>Parentesco_Codigo</code> field name. */
    public static final String FLD_PARENTESCOPARENTESCOCODIGO = "Parentesco_Codigo";    
    /** <code>Parentesco.parentescoCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_PARENTESCO_PARENTESCOCODIGO = "parentescoParentescoCodigo";
    // Field (EstadoBeneficiario_Codigo)
    /** <code>EstadoBeneficiario_Codigo</code> field name. */
    public static final String FLD_ESTADOBENEFICIARIOESTADOBENEFICIARIOCODIGO = "EstadoBeneficiario_Codigo";    
    /** <code>EstadoBeneficiario.estadoBeneficiarioCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_ESTADOBENEFICIARIO_ESTADOBENEFICIARIOCODIGO = "estadoBeneficiarioEstadoBeneficiarioCodigo";
    // Field (ParentescoNuevo_Codigo)
    /** <code>ParentescoNuevo_Codigo</code> field name. */
    public static final String FLD_PARENTESCOPARENTESCONUEVOCODIGO = "ParentescoNuevo_Codigo";    
    /** <code>ParentescoNuevo.parentescoCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_PARENTESCONUEVO_PARENTESCOCODIGO = "parentescoParentescoNuevoCodigo";
    // Field (TipoIdentificacionCD_Codigo)
    /** <code>TipoIdentificacionCD_Codigo</code> field name. */
    public static final String FLD_TIPOIDENTIFICACIONTIPOIDENTIFICACIONCDCODIGO = "TipoIdentificacionCD_Codigo";    
    /** <code>TipoIdentificacionCD.tipoIdentificacionCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_TIPOIDENTIFICACIONCD_TIPOIDENTIFICACIONCODIGO = "tipoIdentificacionTipoIdentificacionCDCodigo";
    // Field (NumIdentificacion)
    /** <code>NumIdentificacion</code> field name. */
    public static final String FLD_USUARIONOVEDADNUMIDENTIFICACION = "NumIdentificacion";    
    /** <code>NumIdentificacion</code> field length. */
    public static final int FLD_USUARIONOVEDADNUMIDENTIFICACIONLENGTH = 60;
    /** <code>usuarioNovedadNumIdentificacion</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIONOVEDADNUMIDENTIFICACION = "usuarioNovedadNumIdentificacion";
    // Field (PrimerNombre)
    /** <code>PrimerNombre</code> field name. */
    public static final String FLD_USUARIONOVEDADPRIMERNOMBRE = "PrimerNombre";    
    /** <code>PrimerNombre</code> field length. */
    public static final int FLD_USUARIONOVEDADPRIMERNOMBRELENGTH = 50;
    /** <code>usuarioNovedadPrimerNombre</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIONOVEDADPRIMERNOMBRE = "usuarioNovedadPrimerNombre";
    // Field (SegundoNombre)
    /** <code>SegundoNombre</code> field name. */
    public static final String FLD_USUARIONOVEDADSEGUNDONOMBRE = "SegundoNombre";    
    /** <code>SegundoNombre</code> field length. */
    public static final int FLD_USUARIONOVEDADSEGUNDONOMBRELENGTH = 50;
    /** <code>usuarioNovedadSegundoNombre</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIONOVEDADSEGUNDONOMBRE = "usuarioNovedadSegundoNombre";
    // Field (PrimerApellido)
    /** <code>PrimerApellido</code> field name. */
    public static final String FLD_USUARIONOVEDADPRIMERAPELLIDO = "PrimerApellido";    
    /** <code>PrimerApellido</code> field length. */
    public static final int FLD_USUARIONOVEDADPRIMERAPELLIDOLENGTH = 50;
    /** <code>usuarioNovedadPrimerApellido</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIONOVEDADPRIMERAPELLIDO = "usuarioNovedadPrimerApellido";
    // Field (SegundoApellido)
    /** <code>SegundoApellido</code> field name. */
    public static final String FLD_USUARIONOVEDADSEGUNDOAPELLIDO = "SegundoApellido";    
    /** <code>SegundoApellido</code> field length. */
    public static final int FLD_USUARIONOVEDADSEGUNDOAPELLIDOLENGTH = 50;
    /** <code>usuarioNovedadSegundoApellido</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIONOVEDADSEGUNDOAPELLIDO = "usuarioNovedadSegundoApellido";
    // Field (MotivoEstado)
    /** <code>MotivoEstado</code> field name. */
    public static final String FLD_USUARIONOVEDADMOTIVOESTADO = "MotivoEstado";    
    /** <code>MotivoEstado</code> field length. */
    public static final int FLD_USUARIONOVEDADMOTIVOESTADOLENGTH = 200;
    /** <code>usuarioNovedadMotivoEstado</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIONOVEDADMOTIVOESTADO = "usuarioNovedadMotivoEstado";
    // Field (FechaIniVigencia)
    /** <code>FechaIniVigencia</code> field name. */
    public static final String FLD_USUARIONOVEDADFECHAINIVIGENCIA = "FechaIniVigencia";    
    /** <code>usuarioNovedadFechaIniVigencia</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIONOVEDADFECHAINIVIGENCIA = "usuarioNovedadFechaIniVigencia";
    // Field (FechaAntiguedad)
    /** <code>FechaAntiguedad</code> field name. */
    public static final String FLD_USUARIONOVEDADFECHAANTIGUEDAD = "FechaAntiguedad";    
    /** <code>usuarioNovedadFechaAntiguedad</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIONOVEDADFECHAANTIGUEDAD = "usuarioNovedadFechaAntiguedad";
    // Field (NumUsuario)
    /** <code>NumUsuario</code> field name. */
    public static final String FLD_USUARIONOVEDADNUMUSUARIO = "NumUsuario";    
    /** <code>usuarioNovedadNumUsuario</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIONOVEDADNUMUSUARIO = "usuarioNovedadNumUsuario";
    // Field (Genero)
    /** <code>Genero</code> field name. */
    public static final String FLD_USUARIONOVEDADGENERO = "Genero";    
    /** <code>Genero</code> field length. */
    public static final int FLD_USUARIONOVEDADGENEROLENGTH = 1;
    /** <code>usuarioNovedadGenero</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIONOVEDADGENERO = "usuarioNovedadGenero";
    // Field (FechaNacimiento)
    /** <code>FechaNacimiento</code> field name. */
    public static final String FLD_USUARIONOVEDADFECHANACIMIENTO = "FechaNacimiento";    
    /** <code>usuarioNovedadFechaNacimiento</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIONOVEDADFECHANACIMIENTO = "usuarioNovedadFechaNacimiento";
    // Field (SUNumMeses)
    /** <code>SUNumMeses</code> field name. */
    public static final String FLD_USUARIONOVEDADSUNUMMESES = "SUNumMeses";    
    /** <code>usuarioNovedadSUNumMeses</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIONOVEDADSUNUMMESES = "usuarioNovedadSUNumMeses";
    // Field (NumIdentificacionCD)
    /** <code>NumIdentificacionCD</code> field name. */
    public static final String FLD_USUARIONOVEDADNUMIDENTIFICACIONCD = "NumIdentificacionCD";    
    /** <code>NumIdentificacionCD</code> field length. */
    public static final int FLD_USUARIONOVEDADNUMIDENTIFICACIONCDLENGTH = 60;
    /** <code>usuarioNovedadNumIdentificacionCD</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIONOVEDADNUMIDENTIFICACIONCD = "usuarioNovedadNumIdentificacionCD";
    // Field (Excluido)
    /** <code>Excluido</code> field name. */
    public static final String FLD_USUARIONOVEDADEXCLUIDO = "Excluido";    
    /** <code>usuarioNovedadExcluido</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIONOVEDADEXCLUIDO = "usuarioNovedadExcluido";
    // Field (ContratacionRO)
    /** <code>ContratacionRO</code> field name. */
    public static final String FLD_USUARIONOVEDADCONTRATACIONRO = "ContratacionRO";    
    /** <code>usuarioNovedadContratacionRO</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIONOVEDADCONTRATACIONRO = "usuarioNovedadContratacionRO";
    // Field (ProrrogaSuspension)
    /** <code>ProrrogaSuspension</code> field name. */
    public static final String FLD_USUARIONOVEDADPRORROGASUSPENSION = "ProrrogaSuspension";    
    /** <code>usuarioNovedadProrrogaSuspension</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIONOVEDADPRORROGASUSPENSION = "usuarioNovedadProrrogaSuspension";
    // Field (ActivacionSuspension)
    /** <code>ActivacionSuspension</code> field name. */
    public static final String FLD_USUARIONOVEDADACTIVACIONSUSPENSION = "ActivacionSuspension";    
    /** <code>usuarioNovedadActivacionSuspension</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIONOVEDADACTIVACIONSUSPENSION = "usuarioNovedadActivacionSuspension";

    // Component role (FamiliaNovedad)
    /** <code>FamiliaNovedad</code> role id. */
    public static final String ROLE_ID_FAMILIANOVEDAD = "Agr_1581442138112725_Alias";
    /** <code>FamiliaNovedad</code> role name. */
    public static final String ROLE_NAME_FAMILIANOVEDAD = "familiaNovedad";
    /** <code>FamiliaNovedad</code> role alias. */
    public static final String ROLE_ALIAS_FAMILIANOVEDAD = "FamiliaNovedad";

    /** <code>FamiliaNovedad</code> inverse role name. */
    public static final String ROLE_INVNAME_FAMILIANOVEDAD = FamiliaNovedadConstants.ROLE_NAME_USUARIONOVEDAD;
    /** <code>FamiliaNovedad</code> role facet sequence. */
    public static final String PATH_FACETS_FAMILIANOVEDAD = "";
    /** <code>FamiliaNovedad</code> role target class. */
    public static final String ROLE_TARGET_FAMILIANOVEDAD = FamiliaNovedadConstants.CLASS_NAME;

    /** Agents allowed to navigate through FamiliaNovedad **/
    public static final String FAMILIANOVEDAD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (TipoIdentificacion)
    /** <code>TipoIdentificacion</code> role id. */
    public static final String ROLE_ID_TIPOIDENTIFICACION = "Agr_1581507543040373_Alias";
    /** <code>TipoIdentificacion</code> role name. */
    public static final String ROLE_NAME_TIPOIDENTIFICACION = "tipoIdentificacion";
    /** <code>TipoIdentificacion</code> role alias. */
    public static final String ROLE_ALIAS_TIPOIDENTIFICACION = "Tipo Identificacion";

    /** <code>TipoIdentificacion</code> inverse role name. */
    public static final String ROLE_INVNAME_TIPOIDENTIFICACION = TipoIdentificacionConstants.ROLE_NAME_USUARIOSNOVEDAD;
    /** <code>TipoIdentificacion</code> role facet sequence. */
    public static final String PATH_FACETS_TIPOIDENTIFICACION = "";
    /** <code>TipoIdentificacion</code> role target class. */
    public static final String ROLE_TARGET_TIPOIDENTIFICACION = TipoIdentificacionConstants.CLASS_NAME;

    /** Agents allowed to navigate through TipoIdentificacion **/
    public static final String TIPOIDENTIFICACION_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Parentesco)
    /** <code>Parentesco</code> role id. */
    public static final String ROLE_ID_PARENTESCO = "Agr_1581509509120422_Alias";
    /** <code>Parentesco</code> role name. */
    public static final String ROLE_NAME_PARENTESCO = "parentesco";
    /** <code>Parentesco</code> role alias. */
    public static final String ROLE_ALIAS_PARENTESCO = "Parentesco";

    /** <code>Parentesco</code> inverse role name. */
    public static final String ROLE_INVNAME_PARENTESCO = ParentescoConstants.ROLE_NAME_USUARIOSNOVEDAD;
    /** <code>Parentesco</code> role facet sequence. */
    public static final String PATH_FACETS_PARENTESCO = "";
    /** <code>Parentesco</code> role target class. */
    public static final String ROLE_TARGET_PARENTESCO = ParentescoConstants.CLASS_NAME;

    /** Agents allowed to navigate through Parentesco **/
    public static final String PARENTESCO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (EstadoBeneficiario)
    /** <code>EstadoBeneficiario</code> role id. */
    public static final String ROLE_ID_ESTADOBENEFICIARIO = "Agr_1581701005312659_Alias";
    /** <code>EstadoBeneficiario</code> role name. */
    public static final String ROLE_NAME_ESTADOBENEFICIARIO = "estadoBeneficiario";
    /** <code>EstadoBeneficiario</code> role alias. */
    public static final String ROLE_ALIAS_ESTADOBENEFICIARIO = "EstadoBeneficiario";

    /** <code>EstadoBeneficiario</code> inverse role name. */
    public static final String ROLE_INVNAME_ESTADOBENEFICIARIO = EstadoBeneficiarioConstants.ROLE_NAME_USUARIOSNOVEDAD;
    /** <code>EstadoBeneficiario</code> role facet sequence. */
    public static final String PATH_FACETS_ESTADOBENEFICIARIO = "";
    /** <code>EstadoBeneficiario</code> role target class. */
    public static final String ROLE_TARGET_ESTADOBENEFICIARIO = EstadoBeneficiarioConstants.CLASS_NAME;

    /** Agents allowed to navigate through EstadoBeneficiario **/
    public static final String ESTADOBENEFICIARIO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (ParentescoNuevo)
    /** <code>ParentescoNuevo</code> role id. */
    public static final String ROLE_ID_PARENTESCONUEVO = "Agr_1582116765696503_Alias";
    /** <code>ParentescoNuevo</code> role name. */
    public static final String ROLE_NAME_PARENTESCONUEVO = "parentescoNuevo";
    /** <code>ParentescoNuevo</code> role alias. */
    public static final String ROLE_ALIAS_PARENTESCONUEVO = "Parentesco nuevo";

    /** <code>ParentescoNuevo</code> inverse role name. */
    public static final String ROLE_INVNAME_PARENTESCONUEVO = ParentescoConstants.ROLE_NAME_USUARIONOVEDAD;
    /** <code>ParentescoNuevo</code> role facet sequence. */
    public static final String PATH_FACETS_PARENTESCONUEVO = "";
    /** <code>ParentescoNuevo</code> role target class. */
    public static final String ROLE_TARGET_PARENTESCONUEVO = ParentescoConstants.CLASS_NAME;

    /** Agents allowed to navigate through ParentescoNuevo **/
    public static final String PARENTESCONUEVO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (TipoIdentificacionCD)
    /** <code>TipoIdentificacionCD</code> role id. */
    public static final String ROLE_ID_TIPOIDENTIFICACIONCD = "Agr_1582126727168905_Alias";
    /** <code>TipoIdentificacionCD</code> role name. */
    public static final String ROLE_NAME_TIPOIDENTIFICACIONCD = "tipoIdentificacionCD";
    /** <code>TipoIdentificacionCD</code> role alias. */
    public static final String ROLE_ALIAS_TIPOIDENTIFICACIONCD = "Tipo Id. Nuevo";

    /** <code>TipoIdentificacionCD</code> inverse role name. */
    public static final String ROLE_INVNAME_TIPOIDENTIFICACIONCD = TipoIdentificacionConstants.ROLE_NAME_USUARIONOVEDAD;
    /** <code>TipoIdentificacionCD</code> role facet sequence. */
    public static final String PATH_FACETS_TIPOIDENTIFICACIONCD = "";
    /** <code>TipoIdentificacionCD</code> role target class. */
    public static final String ROLE_TARGET_TIPOIDENTIFICACIONCD = TipoIdentificacionConstants.CLASS_NAME;

    /** Agents allowed to navigate through TipoIdentificacionCD **/
    public static final String TIPOIDENTIFICACIONCD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";

    // Compound role (Documentos)
    /** <code>Documentos</code> role id. */
    public static final String ROLE_ID_DOCUMENTOS = "Agr_1583333376000747_Alias";
    /** <code>Documentos</code> role name. */
    public static final String ROLE_NAME_DOCUMENTOS = "documentos";
    /** <code>Usuario</code> role alias. */
    public static final String ROLE_ALIAS_DOCUMENTOS = "Documentos";


    /** <code>Documentos</code> inverse role name. */
    public static final String ROLE_INVNAME_DOCUMENTOS = DocumentoNovedadConstants.ROLE_NAME_USUARIO;
    /** <code>Documentos</code> role facet sequence. */
    public static final String PATH_FACETS_DOCUMENTOS = "";
    /** <code>Documentos</code> role target class. */
    public static final String ROLE_TARGET_DOCUMENTOS = DocumentoNovedadConstants.CLASS_NAME;
    /** Agents allowed to navigate through Documentos **/
    public static final String DOCUMENTOS_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1581442138112529Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioNovedadcrearpagrFamiliaNovedad</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIONOVEDADCREARPAGRFAMILIANOVEDAD = "p_agrFamiliaNovedad";
    /** <code>usuarioNovedadcrearpagrFamiliaNovedad</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIONOVEDADCREARPAGRFAMILIANOVEDAD = "Clas_1581442138112529Ser_1Arg_11_Alias";
    /** <code>usuarioNovedadcrearpagrFamiliaNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIONOVEDADCREARPAGRFAMILIANOVEDAD = "FamiliaNovedad";
    /** <code>usuarioNovedadcrearpagrTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIONOVEDADCREARPAGRTIPOIDENTIFICACION = "p_agrTipoIdentificacion";
    /** <code>usuarioNovedadcrearpagrTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIONOVEDADCREARPAGRTIPOIDENTIFICACION = "Clas_1581442138112529Ser_1Arg_12_Alias";
    /** <code>usuarioNovedadcrearpagrTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIONOVEDADCREARPAGRTIPOIDENTIFICACION = "Tipo Identificacion";
    /** <code>usuarioNovedadcrearpagrParentesco</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIONOVEDADCREARPAGRPARENTESCO = "p_agrParentesco";
    /** <code>usuarioNovedadcrearpagrParentesco</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIONOVEDADCREARPAGRPARENTESCO = "Clas_1581442138112529Ser_1Arg_14_Alias";
    /** <code>usuarioNovedadcrearpagrParentesco</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIONOVEDADCREARPAGRPARENTESCO = "Parentesco";
    /** <code>usuarioNovedadcrearpagrEstadoBeneficiario</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIONOVEDADCREARPAGRESTADOBENEFICIARIO = "p_agrEstadoBeneficiario";
    /** <code>usuarioNovedadcrearpagrEstadoBeneficiario</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIONOVEDADCREARPAGRESTADOBENEFICIARIO = "Clas_1581442138112529Ser_1Arg_20_Alias";
    /** <code>usuarioNovedadcrearpagrEstadoBeneficiario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIONOVEDADCREARPAGRESTADOBENEFICIARIO = "EstadoBeneficiario";
    /** <code>usuarioNovedadcrearpagrParentescoNuevo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIONOVEDADCREARPAGRPARENTESCONUEVO = "p_agrParentescoNuevo";
    /** <code>usuarioNovedadcrearpagrParentescoNuevo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIONOVEDADCREARPAGRPARENTESCONUEVO = "Clas_1581442138112529Ser_1Arg_21_Alias";
    /** <code>usuarioNovedadcrearpagrParentescoNuevo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIONOVEDADCREARPAGRPARENTESCONUEVO = "Parentesco nuevo";
    /** <code>usuarioNovedadcrearpagrTipoIdentificacionCD</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIONOVEDADCREARPAGRTIPOIDENTIFICACIONCD = "p_agrTipoIdentificacionCD";
    /** <code>usuarioNovedadcrearpagrTipoIdentificacionCD</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIONOVEDADCREARPAGRTIPOIDENTIFICACIONCD = "Clas_1581442138112529Ser_1Arg_22_Alias";
    /** <code>usuarioNovedadcrearpagrTipoIdentificacionCD</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIONOVEDADCREARPAGRTIPOIDENTIFICACIONCD = "Tipo Id. Nuevo";
    /** <code>usuarioNovedadcrearpatrNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIONOVEDADCREARPATRNUMIDENTIFICACION = "p_atrNumIdentificacion";
    /** <code>usuarioNovedadcrearpatrNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIONOVEDADCREARPATRNUMIDENTIFICACION = "Clas_1581442138112529Ser_1Arg_4_Alias";
    /** <code>usuarioNovedadcrearpatrNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIONOVEDADCREARPATRNUMIDENTIFICACION = "Nº Identificación";
    /** <code>usuarioNovedadcrearpatrPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIONOVEDADCREARPATRPRIMERNOMBRE = "p_atrPrimerNombre";
    /** <code>usuarioNovedadcrearpatrPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIONOVEDADCREARPATRPRIMERNOMBRE = "Clas_1581442138112529Ser_1Arg_5_Alias";
    /** <code>usuarioNovedadcrearpatrPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIONOVEDADCREARPATRPRIMERNOMBRE = "Primer Nombre";
    /** <code>usuarioNovedadcrearpatrMotivoEstado</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIONOVEDADCREARPATRMOTIVOESTADO = "p_atrMotivoEstado";
    /** <code>usuarioNovedadcrearpatrMotivoEstado</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIONOVEDADCREARPATRMOTIVOESTADO = "Clas_1581442138112529Ser_1Arg_7_Alias";
    /** <code>usuarioNovedadcrearpatrMotivoEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIONOVEDADCREARPATRMOTIVOESTADO = "Motivo";
    /** <code>usuarioNovedadcrearpatrFechaIniVigencia</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIONOVEDADCREARPATRFECHAINIVIGENCIA = "p_atrFechaIniVigencia";
    /** <code>usuarioNovedadcrearpatrFechaIniVigencia</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIONOVEDADCREARPATRFECHAINIVIGENCIA = "Clas_1581442138112529Ser_1Arg_9_Alias";
    /** <code>usuarioNovedadcrearpatrFechaIniVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIONOVEDADCREARPATRFECHAINIVIGENCIA = "Fecha inicio vigencia";
    /** <code>usuarioNovedadcrearpatrFechaAntiguedad</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIONOVEDADCREARPATRFECHAANTIGUEDAD = "p_atrFechaAntiguedad";
    /** <code>usuarioNovedadcrearpatrFechaAntiguedad</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIONOVEDADCREARPATRFECHAANTIGUEDAD = "Clas_1581442138112529Ser_1Arg_10_Alias";
    /** <code>usuarioNovedadcrearpatrFechaAntiguedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIONOVEDADCREARPATRFECHAANTIGUEDAD = "Fecha antiguedad";
    /** <code>usuarioNovedadcrearpatrSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIONOVEDADCREARPATRSEGUNDONOMBRE = "p_atrSegundoNombre";
    /** <code>usuarioNovedadcrearpatrSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIONOVEDADCREARPATRSEGUNDONOMBRE = "Clas_1581442138112529Ser_1Arg_15_Alias";
    /** <code>usuarioNovedadcrearpatrSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIONOVEDADCREARPATRSEGUNDONOMBRE = "Segundo Nombre";
    /** <code>usuarioNovedadcrearpatrPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIONOVEDADCREARPATRPRIMERAPELLIDO = "p_atrPrimerApellido";
    /** <code>usuarioNovedadcrearpatrPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIONOVEDADCREARPATRPRIMERAPELLIDO = "Clas_1581442138112529Ser_1Arg_16_Alias";
    /** <code>usuarioNovedadcrearpatrPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIONOVEDADCREARPATRPRIMERAPELLIDO = "Primer Apellido";
    /** <code>usuarioNovedadcrearpatrSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIONOVEDADCREARPATRSEGUNDOAPELLIDO = "p_atrSegundoApellido";
    /** <code>usuarioNovedadcrearpatrSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIONOVEDADCREARPATRSEGUNDOAPELLIDO = "Clas_1581442138112529Ser_1Arg_17_Alias";
    /** <code>usuarioNovedadcrearpatrSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIONOVEDADCREARPATRSEGUNDOAPELLIDO = "Segundo Apellido";
    /** <code>usuarioNovedadcrearpatrNumUsuario</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIONOVEDADCREARPATRNUMUSUARIO = "p_atrNumUsuario";
    /** <code>usuarioNovedadcrearpatrNumUsuario</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIONOVEDADCREARPATRNUMUSUARIO = "Clas_1581442138112529Ser_1Arg_19_Alias";
    /** <code>usuarioNovedadcrearpatrNumUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIONOVEDADCREARPATRNUMUSUARIO = "Nº Usuario";
    /** <code>usuarioNovedadcrearpatrFechaNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIONOVEDADCREARPATRFECHANACIMIENTO = "p_atrFechaNacimiento";
    /** <code>usuarioNovedadcrearpatrFechaNacimiento</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIONOVEDADCREARPATRFECHANACIMIENTO = "Clas_1581442138112529Ser_1Arg_23_Alias";
    /** <code>usuarioNovedadcrearpatrFechaNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIONOVEDADCREARPATRFECHANACIMIENTO = "Fecha Nacimiento";
    /** <code>usuarioNovedadcrearpatrGenero</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIONOVEDADCREARPATRGENERO = "p_atrGenero";
    /** <code>usuarioNovedadcrearpatrGenero</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIONOVEDADCREARPATRGENERO = "Clas_1581442138112529Ser_1Arg_24_Alias";
    /** <code>usuarioNovedadcrearpatrGenero</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIONOVEDADCREARPATRGENERO = "Género";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1581442138112529Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioNovedadeliminarpthisUsuarioNovedad</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_USUARIONOVEDADELIMINARPTHISUSUARIONOVEDAD = "p_thisUsuarioNovedad";
    /** <code>usuarioNovedadeliminarpthisUsuarioNovedad</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_USUARIONOVEDADELIMINARPTHISUSUARIONOVEDAD = "Clas_1581442138112529Ser_2Arg_1_Alias";
    /** <code>usuarioNovedadeliminarpthisUsuarioNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_USUARIONOVEDADELIMINARPTHISUSUARIONOVEDAD = "Usuario";
    // Service (InsTipoIdentUsuNovedad)
    /** <code>InsTipoIdentUsuNovedad</code> service id. */
    public static final String SERV_ID_INSTIPOIDENTUSUNOVEDAD = "Clas_1581442138112529Ser_4_Alias";
    /** <code>InsTipoIdentUsuNovedad</code> service name. */
    public static final String SERV_NAME_INSTIPOIDENTUSUNOVEDAD = "InsTipoIdentUsuNovedad";
    /** <code>InsTipoIdentUsuNovedad</code> service alias. */
    public static final String SERV_ALIAS_INSTIPOIDENTUSUNOVEDAD = "InsTipoIdentUsuNovedad";
    /** Agents allowed to execute the service InsTipoIdentUsuNovedad **/
    public static final String INSTIPOIDENTUSUNOVEDAD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioNovedadInsTipoIdentUsuNovedadpthisUsuarioNovedad</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPOIDENTUSUNOVEDAD_USUARIONOVEDADINSTIPOIDENTUSUNOVEDADPTHISUSUARIONOVEDAD = "p_thisUsuarioNovedad";
    /** <code>usuarioNovedadInsTipoIdentUsuNovedadpthisUsuarioNovedad</code> inbound argument id. */
    public static final String ARG_ID_INSTIPOIDENTUSUNOVEDAD_USUARIONOVEDADINSTIPOIDENTUSUNOVEDADPTHISUSUARIONOVEDAD = "Clas_1581442138112529Ser_4Arg_1_Alias";
    /** <code>usuarioNovedadInsTipoIdentUsuNovedadpthisUsuarioNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPOIDENTUSUNOVEDAD_USUARIONOVEDADINSTIPOIDENTUSUNOVEDADPTHISUSUARIONOVEDAD = "UsuariosNovedad";
    /** <code>usuarioNovedadInsTipoIdentUsuNovedadpevcTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPOIDENTUSUNOVEDAD_USUARIONOVEDADINSTIPOIDENTUSUNOVEDADPEVCTIPOIDENTIFICACION = "p_evcTipoIdentificacion";
    /** <code>usuarioNovedadInsTipoIdentUsuNovedadpevcTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_INSTIPOIDENTUSUNOVEDAD_USUARIONOVEDADINSTIPOIDENTUSUNOVEDADPEVCTIPOIDENTIFICACION = "Clas_1581442138112529Ser_4Arg_2_Alias";
    /** <code>usuarioNovedadInsTipoIdentUsuNovedadpevcTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPOIDENTUSUNOVEDAD_USUARIONOVEDADINSTIPOIDENTUSUNOVEDADPEVCTIPOIDENTIFICACION = "Tipo Identificacion";
    // Service (DelTipoIdentUsuNovedad)
    /** <code>DelTipoIdentUsuNovedad</code> service id. */
    public static final String SERV_ID_DELTIPOIDENTUSUNOVEDAD = "Clas_1581442138112529Ser_5_Alias";
    /** <code>DelTipoIdentUsuNovedad</code> service name. */
    public static final String SERV_NAME_DELTIPOIDENTUSUNOVEDAD = "DelTipoIdentUsuNovedad";
    /** <code>DelTipoIdentUsuNovedad</code> service alias. */
    public static final String SERV_ALIAS_DELTIPOIDENTUSUNOVEDAD = "DelTipoIdentUsuNovedad";
    /** Agents allowed to execute the service DelTipoIdentUsuNovedad **/
    public static final String DELTIPOIDENTUSUNOVEDAD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioNovedadDelTipoIdentUsuNovedadpthisUsuarioNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPOIDENTUSUNOVEDAD_USUARIONOVEDADDELTIPOIDENTUSUNOVEDADPTHISUSUARIONOVEDAD = "p_thisUsuarioNovedad";
    /** <code>usuarioNovedadDelTipoIdentUsuNovedadpthisUsuarioNovedad</code> inbound argument id. */
    public static final String ARG_ID_DELTIPOIDENTUSUNOVEDAD_USUARIONOVEDADDELTIPOIDENTUSUNOVEDADPTHISUSUARIONOVEDAD = "Clas_1581442138112529Ser_5Arg_1_Alias";
    /** <code>usuarioNovedadDelTipoIdentUsuNovedadpthisUsuarioNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPOIDENTUSUNOVEDAD_USUARIONOVEDADDELTIPOIDENTUSUNOVEDADPTHISUSUARIONOVEDAD = "UsuariosNovedad";
    /** <code>usuarioNovedadDelTipoIdentUsuNovedadpevcTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPOIDENTUSUNOVEDAD_USUARIONOVEDADDELTIPOIDENTUSUNOVEDADPEVCTIPOIDENTIFICACION = "p_evcTipoIdentificacion";
    /** <code>usuarioNovedadDelTipoIdentUsuNovedadpevcTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_DELTIPOIDENTUSUNOVEDAD_USUARIONOVEDADDELTIPOIDENTUSUNOVEDADPEVCTIPOIDENTIFICACION = "Clas_1581442138112529Ser_5Arg_2_Alias";
    /** <code>usuarioNovedadDelTipoIdentUsuNovedadpevcTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPOIDENTUSUNOVEDAD_USUARIONOVEDADDELTIPOIDENTUSUNOVEDADPEVCTIPOIDENTIFICACION = "Tipo Identificacion";
    // Service (InsParentescoUsuNovedad)
    /** <code>InsParentescoUsuNovedad</code> service id. */
    public static final String SERV_ID_INSPARENTESCOUSUNOVEDAD = "Clas_1581442138112529Ser_8_Alias";
    /** <code>InsParentescoUsuNovedad</code> service name. */
    public static final String SERV_NAME_INSPARENTESCOUSUNOVEDAD = "InsParentescoUsuNovedad";
    /** <code>InsParentescoUsuNovedad</code> service alias. */
    public static final String SERV_ALIAS_INSPARENTESCOUSUNOVEDAD = "InsParentescoUsuNovedad";
    /** Agents allowed to execute the service InsParentescoUsuNovedad **/
    public static final String INSPARENTESCOUSUNOVEDAD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioNovedadInsParentescoUsuNovedadpthisUsuarioNovedad</code> inbound argument name. */
    public static final String ARG_NAME_INSPARENTESCOUSUNOVEDAD_USUARIONOVEDADINSPARENTESCOUSUNOVEDADPTHISUSUARIONOVEDAD = "p_thisUsuarioNovedad";
    /** <code>usuarioNovedadInsParentescoUsuNovedadpthisUsuarioNovedad</code> inbound argument id. */
    public static final String ARG_ID_INSPARENTESCOUSUNOVEDAD_USUARIONOVEDADINSPARENTESCOUSUNOVEDADPTHISUSUARIONOVEDAD = "Clas_1581442138112529Ser_8Arg_1_Alias";
    /** <code>usuarioNovedadInsParentescoUsuNovedadpthisUsuarioNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPARENTESCOUSUNOVEDAD_USUARIONOVEDADINSPARENTESCOUSUNOVEDADPTHISUSUARIONOVEDAD = "UsuariosNovedad";
    /** <code>usuarioNovedadInsParentescoUsuNovedadpevcParentesco</code> inbound argument name. */
    public static final String ARG_NAME_INSPARENTESCOUSUNOVEDAD_USUARIONOVEDADINSPARENTESCOUSUNOVEDADPEVCPARENTESCO = "p_evcParentesco";
    /** <code>usuarioNovedadInsParentescoUsuNovedadpevcParentesco</code> inbound argument id. */
    public static final String ARG_ID_INSPARENTESCOUSUNOVEDAD_USUARIONOVEDADINSPARENTESCOUSUNOVEDADPEVCPARENTESCO = "Clas_1581442138112529Ser_8Arg_2_Alias";
    /** <code>usuarioNovedadInsParentescoUsuNovedadpevcParentesco</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPARENTESCOUSUNOVEDAD_USUARIONOVEDADINSPARENTESCOUSUNOVEDADPEVCPARENTESCO = "Parentesco";
    // Service (DelParentescoUsuNovedad)
    /** <code>DelParentescoUsuNovedad</code> service id. */
    public static final String SERV_ID_DELPARENTESCOUSUNOVEDAD = "Clas_1581442138112529Ser_9_Alias";
    /** <code>DelParentescoUsuNovedad</code> service name. */
    public static final String SERV_NAME_DELPARENTESCOUSUNOVEDAD = "DelParentescoUsuNovedad";
    /** <code>DelParentescoUsuNovedad</code> service alias. */
    public static final String SERV_ALIAS_DELPARENTESCOUSUNOVEDAD = "DelParentescoUsuNovedad";
    /** Agents allowed to execute the service DelParentescoUsuNovedad **/
    public static final String DELPARENTESCOUSUNOVEDAD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioNovedadDelParentescoUsuNovedadpthisUsuarioNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DELPARENTESCOUSUNOVEDAD_USUARIONOVEDADDELPARENTESCOUSUNOVEDADPTHISUSUARIONOVEDAD = "p_thisUsuarioNovedad";
    /** <code>usuarioNovedadDelParentescoUsuNovedadpthisUsuarioNovedad</code> inbound argument id. */
    public static final String ARG_ID_DELPARENTESCOUSUNOVEDAD_USUARIONOVEDADDELPARENTESCOUSUNOVEDADPTHISUSUARIONOVEDAD = "Clas_1581442138112529Ser_9Arg_1_Alias";
    /** <code>usuarioNovedadDelParentescoUsuNovedadpthisUsuarioNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPARENTESCOUSUNOVEDAD_USUARIONOVEDADDELPARENTESCOUSUNOVEDADPTHISUSUARIONOVEDAD = "UsuariosNovedad";
    /** <code>usuarioNovedadDelParentescoUsuNovedadpevcParentesco</code> inbound argument name. */
    public static final String ARG_NAME_DELPARENTESCOUSUNOVEDAD_USUARIONOVEDADDELPARENTESCOUSUNOVEDADPEVCPARENTESCO = "p_evcParentesco";
    /** <code>usuarioNovedadDelParentescoUsuNovedadpevcParentesco</code> inbound argument id. */
    public static final String ARG_ID_DELPARENTESCOUSUNOVEDAD_USUARIONOVEDADDELPARENTESCOUSUNOVEDADPEVCPARENTESCO = "Clas_1581442138112529Ser_9Arg_2_Alias";
    /** <code>usuarioNovedadDelParentescoUsuNovedadpevcParentesco</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPARENTESCOUSUNOVEDAD_USUARIONOVEDADDELPARENTESCOUSUNOVEDADPEVCPARENTESCO = "Parentesco";
    // Service (InsEstadoBeneficiario)
    /** <code>InsEstadoBeneficiario</code> service id. */
    public static final String SERV_ID_INSESTADOBENEFICIARIO = "Clas_1581442138112529Ser_11_Alias";
    /** <code>InsEstadoBeneficiario</code> service name. */
    public static final String SERV_NAME_INSESTADOBENEFICIARIO = "InsEstadoBeneficiario";
    /** <code>InsEstadoBeneficiario</code> service alias. */
    public static final String SERV_ALIAS_INSESTADOBENEFICIARIO = "InsEstadoBeneficiario";
    /** Agents allowed to execute the service InsEstadoBeneficiario **/
    public static final String INSESTADOBENEFICIARIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioNovedadInsEstadoBeneficiariopthisUsuarioNovedad</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOBENEFICIARIO_USUARIONOVEDADINSESTADOBENEFICIARIOPTHISUSUARIONOVEDAD = "p_thisUsuarioNovedad";
    /** <code>usuarioNovedadInsEstadoBeneficiariopthisUsuarioNovedad</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOBENEFICIARIO_USUARIONOVEDADINSESTADOBENEFICIARIOPTHISUSUARIONOVEDAD = "Clas_1581442138112529Ser_11Arg_1_Alias";
    /** <code>usuarioNovedadInsEstadoBeneficiariopthisUsuarioNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOBENEFICIARIO_USUARIONOVEDADINSESTADOBENEFICIARIOPTHISUSUARIONOVEDAD = "UsuariosNovedad";
    /** <code>usuarioNovedadInsEstadoBeneficiariopevcEstadoBeneficiario</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOBENEFICIARIO_USUARIONOVEDADINSESTADOBENEFICIARIOPEVCESTADOBENEFICIARIO = "p_evcEstadoBeneficiario";
    /** <code>usuarioNovedadInsEstadoBeneficiariopevcEstadoBeneficiario</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOBENEFICIARIO_USUARIONOVEDADINSESTADOBENEFICIARIOPEVCESTADOBENEFICIARIO = "Clas_1581442138112529Ser_11Arg_2_Alias";
    /** <code>usuarioNovedadInsEstadoBeneficiariopevcEstadoBeneficiario</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOBENEFICIARIO_USUARIONOVEDADINSESTADOBENEFICIARIOPEVCESTADOBENEFICIARIO = "EstadoBeneficiario";
    // Service (DelEstadoBeneficiario)
    /** <code>DelEstadoBeneficiario</code> service id. */
    public static final String SERV_ID_DELESTADOBENEFICIARIO = "Clas_1581442138112529Ser_12_Alias";
    /** <code>DelEstadoBeneficiario</code> service name. */
    public static final String SERV_NAME_DELESTADOBENEFICIARIO = "DelEstadoBeneficiario";
    /** <code>DelEstadoBeneficiario</code> service alias. */
    public static final String SERV_ALIAS_DELESTADOBENEFICIARIO = "DelEstadoBeneficiario";
    /** Agents allowed to execute the service DelEstadoBeneficiario **/
    public static final String DELESTADOBENEFICIARIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioNovedadDelEstadoBeneficiariopthisUsuarioNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOBENEFICIARIO_USUARIONOVEDADDELESTADOBENEFICIARIOPTHISUSUARIONOVEDAD = "p_thisUsuarioNovedad";
    /** <code>usuarioNovedadDelEstadoBeneficiariopthisUsuarioNovedad</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOBENEFICIARIO_USUARIONOVEDADDELESTADOBENEFICIARIOPTHISUSUARIONOVEDAD = "Clas_1581442138112529Ser_12Arg_1_Alias";
    /** <code>usuarioNovedadDelEstadoBeneficiariopthisUsuarioNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOBENEFICIARIO_USUARIONOVEDADDELESTADOBENEFICIARIOPTHISUSUARIONOVEDAD = "UsuariosNovedad";
    /** <code>usuarioNovedadDelEstadoBeneficiariopevcEstadoBeneficiario</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOBENEFICIARIO_USUARIONOVEDADDELESTADOBENEFICIARIOPEVCESTADOBENEFICIARIO = "p_evcEstadoBeneficiario";
    /** <code>usuarioNovedadDelEstadoBeneficiariopevcEstadoBeneficiario</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOBENEFICIARIO_USUARIONOVEDADDELESTADOBENEFICIARIOPEVCESTADOBENEFICIARIO = "Clas_1581442138112529Ser_12Arg_2_Alias";
    /** <code>usuarioNovedadDelEstadoBeneficiariopevcEstadoBeneficiario</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOBENEFICIARIO_USUARIONOVEDADDELESTADOBENEFICIARIOPEVCESTADOBENEFICIARIO = "EstadoBeneficiario";
    // Service (InsParentescoNuevoUsuNovedad)
    /** <code>InsParentescoNuevoUsuNovedad</code> service id. */
    public static final String SERV_ID_INSPARENTESCONUEVOUSUNOVEDAD = "Clas_1581442138112529Ser_13_Alias";
    /** <code>InsParentescoNuevoUsuNovedad</code> service name. */
    public static final String SERV_NAME_INSPARENTESCONUEVOUSUNOVEDAD = "InsParentescoNuevoUsuNovedad";
    /** <code>InsParentescoNuevoUsuNovedad</code> service alias. */
    public static final String SERV_ALIAS_INSPARENTESCONUEVOUSUNOVEDAD = "InsParentescoNuevoUsuNovedad";
    /** Agents allowed to execute the service InsParentescoNuevoUsuNovedad **/
    public static final String INSPARENTESCONUEVOUSUNOVEDAD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioNovedadInsParentescoNuevoUsuNovedadpthisUsuarioNovedad</code> inbound argument name. */
    public static final String ARG_NAME_INSPARENTESCONUEVOUSUNOVEDAD_USUARIONOVEDADINSPARENTESCONUEVOUSUNOVEDADPTHISUSUARIONOVEDAD = "p_thisUsuarioNovedad";
    /** <code>usuarioNovedadInsParentescoNuevoUsuNovedadpthisUsuarioNovedad</code> inbound argument id. */
    public static final String ARG_ID_INSPARENTESCONUEVOUSUNOVEDAD_USUARIONOVEDADINSPARENTESCONUEVOUSUNOVEDADPTHISUSUARIONOVEDAD = "Clas_1581442138112529Ser_13Arg_1_Alias";
    /** <code>usuarioNovedadInsParentescoNuevoUsuNovedadpthisUsuarioNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPARENTESCONUEVOUSUNOVEDAD_USUARIONOVEDADINSPARENTESCONUEVOUSUNOVEDADPTHISUSUARIONOVEDAD = "Usuario";
    /** <code>usuarioNovedadInsParentescoNuevoUsuNovedadpevcParentesco</code> inbound argument name. */
    public static final String ARG_NAME_INSPARENTESCONUEVOUSUNOVEDAD_USUARIONOVEDADINSPARENTESCONUEVOUSUNOVEDADPEVCPARENTESCO = "p_evcParentesco";
    /** <code>usuarioNovedadInsParentescoNuevoUsuNovedadpevcParentesco</code> inbound argument id. */
    public static final String ARG_ID_INSPARENTESCONUEVOUSUNOVEDAD_USUARIONOVEDADINSPARENTESCONUEVOUSUNOVEDADPEVCPARENTESCO = "Clas_1581442138112529Ser_13Arg_2_Alias";
    /** <code>usuarioNovedadInsParentescoNuevoUsuNovedadpevcParentesco</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPARENTESCONUEVOUSUNOVEDAD_USUARIONOVEDADINSPARENTESCONUEVOUSUNOVEDADPEVCPARENTESCO = "Parentesco nuevo";
    // Service (DelParentescoNuevoUsuNovedad)
    /** <code>DelParentescoNuevoUsuNovedad</code> service id. */
    public static final String SERV_ID_DELPARENTESCONUEVOUSUNOVEDAD = "Clas_1581442138112529Ser_14_Alias";
    /** <code>DelParentescoNuevoUsuNovedad</code> service name. */
    public static final String SERV_NAME_DELPARENTESCONUEVOUSUNOVEDAD = "DelParentescoNuevoUsuNovedad";
    /** <code>DelParentescoNuevoUsuNovedad</code> service alias. */
    public static final String SERV_ALIAS_DELPARENTESCONUEVOUSUNOVEDAD = "DelParentescoNuevoUsuNovedad";
    /** Agents allowed to execute the service DelParentescoNuevoUsuNovedad **/
    public static final String DELPARENTESCONUEVOUSUNOVEDAD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioNovedadDelParentescoNuevoUsuNovedadpthisUsuarioNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DELPARENTESCONUEVOUSUNOVEDAD_USUARIONOVEDADDELPARENTESCONUEVOUSUNOVEDADPTHISUSUARIONOVEDAD = "p_thisUsuarioNovedad";
    /** <code>usuarioNovedadDelParentescoNuevoUsuNovedadpthisUsuarioNovedad</code> inbound argument id. */
    public static final String ARG_ID_DELPARENTESCONUEVOUSUNOVEDAD_USUARIONOVEDADDELPARENTESCONUEVOUSUNOVEDADPTHISUSUARIONOVEDAD = "Clas_1581442138112529Ser_14Arg_1_Alias";
    /** <code>usuarioNovedadDelParentescoNuevoUsuNovedadpthisUsuarioNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPARENTESCONUEVOUSUNOVEDAD_USUARIONOVEDADDELPARENTESCONUEVOUSUNOVEDADPTHISUSUARIONOVEDAD = "Usuario";
    /** <code>usuarioNovedadDelParentescoNuevoUsuNovedadpevcParentesco</code> inbound argument name. */
    public static final String ARG_NAME_DELPARENTESCONUEVOUSUNOVEDAD_USUARIONOVEDADDELPARENTESCONUEVOUSUNOVEDADPEVCPARENTESCO = "p_evcParentesco";
    /** <code>usuarioNovedadDelParentescoNuevoUsuNovedadpevcParentesco</code> inbound argument id. */
    public static final String ARG_ID_DELPARENTESCONUEVOUSUNOVEDAD_USUARIONOVEDADDELPARENTESCONUEVOUSUNOVEDADPEVCPARENTESCO = "Clas_1581442138112529Ser_14Arg_2_Alias";
    /** <code>usuarioNovedadDelParentescoNuevoUsuNovedadpevcParentesco</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPARENTESCONUEVOUSUNOVEDAD_USUARIONOVEDADDELPARENTESCONUEVOUSUNOVEDADPEVCPARENTESCO = "Parentesco nuevo";
    // Service (modificarSUNumMeses)
    /** <code>modificarSUNumMeses</code> service id. */
    public static final String SERV_ID_MODIFICARSUNUMMESES = "Clas_1581442138112529Ser_16_Alias";
    /** <code>modificarSUNumMeses</code> service name. */
    public static final String SERV_NAME_MODIFICARSUNUMMESES = "modificarSUNumMeses";
    /** <code>modificarSUNumMeses</code> service alias. */
    public static final String SERV_ALIAS_MODIFICARSUNUMMESES = "Suspender Usuario";
    /** Agents allowed to execute the service modificarSUNumMeses **/
    public static final String MODIFICARSUNUMMESES_SRVAGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,MesaDeApoyo";
    // Preconditions
    /** <code>modificarSUNumMeses</code> precondition 0 id. */
    public static final String PRE_ID_MODIFICARSUNUMMESES_0 = "Clas_1581442138112529Pre_18_MsgError";
    /** <code>modificarSUNumMeses</code> precondition 1 id. */
    public static final String PRE_ID_MODIFICARSUNUMMESES_1 = "Clas_1581442138112529Pre_19_MsgError";
    /** <code>modificarSUNumMeses</code> precondition 2 id. */
    public static final String PRE_ID_MODIFICARSUNUMMESES_2 = "Clas_1581442138112529Pre_17_MsgError";
    // Inbound arguments
    /** <code>usuarioNovedadmodificarSUNumMesespthisUsuarioNovedad</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARSUNUMMESES_USUARIONOVEDADMODIFICARSUNUMMESESPTHISUSUARIONOVEDAD = "p_thisUsuarioNovedad";
    /** <code>usuarioNovedadmodificarSUNumMesespthisUsuarioNovedad</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARSUNUMMESES_USUARIONOVEDADMODIFICARSUNUMMESESPTHISUSUARIONOVEDAD = "Clas_1581442138112529Ser_16Arg_1_Alias";
    /** <code>usuarioNovedadmodificarSUNumMesespthisUsuarioNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARSUNUMMESES_USUARIONOVEDADMODIFICARSUNUMMESESPTHISUSUARIONOVEDAD = "Usuario";
    /** <code>usuarioNovedadmodificarSUNumMesespSUNumMeses</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARSUNUMMESES_USUARIONOVEDADMODIFICARSUNUMMESESPSUNUMMESES = "p_SUNumMeses";
    /** <code>usuarioNovedadmodificarSUNumMesespSUNumMeses</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARSUNUMMESES_USUARIONOVEDADMODIFICARSUNUMMESESPSUNUMMESES = "Clas_1581442138112529Ser_16Arg_2_Alias";
    /** <code>usuarioNovedadmodificarSUNumMesespSUNumMeses</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARSUNUMMESES_USUARIONOVEDADMODIFICARSUNUMMESESPSUNUMMESES = "Nº Meses";
    // Service (InsTipoIdCDUsuNovedad)
    /** <code>InsTipoIdCDUsuNovedad</code> service id. */
    public static final String SERV_ID_INSTIPOIDCDUSUNOVEDAD = "Clas_1581442138112529Ser_17_Alias";
    /** <code>InsTipoIdCDUsuNovedad</code> service name. */
    public static final String SERV_NAME_INSTIPOIDCDUSUNOVEDAD = "InsTipoIdCDUsuNovedad";
    /** <code>InsTipoIdCDUsuNovedad</code> service alias. */
    public static final String SERV_ALIAS_INSTIPOIDCDUSUNOVEDAD = "InsTipoIdCDUsuNovedad";
    /** Agents allowed to execute the service InsTipoIdCDUsuNovedad **/
    public static final String INSTIPOIDCDUSUNOVEDAD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioNovedadInsTipoIdCDUsuNovedadpthisUsuarioNovedad</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPOIDCDUSUNOVEDAD_USUARIONOVEDADINSTIPOIDCDUSUNOVEDADPTHISUSUARIONOVEDAD = "p_thisUsuarioNovedad";
    /** <code>usuarioNovedadInsTipoIdCDUsuNovedadpthisUsuarioNovedad</code> inbound argument id. */
    public static final String ARG_ID_INSTIPOIDCDUSUNOVEDAD_USUARIONOVEDADINSTIPOIDCDUSUNOVEDADPTHISUSUARIONOVEDAD = "Clas_1581442138112529Ser_17Arg_1_Alias";
    /** <code>usuarioNovedadInsTipoIdCDUsuNovedadpthisUsuarioNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPOIDCDUSUNOVEDAD_USUARIONOVEDADINSTIPOIDCDUSUNOVEDADPTHISUSUARIONOVEDAD = "Usuario";
    /** <code>usuarioNovedadInsTipoIdCDUsuNovedadpevcTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPOIDCDUSUNOVEDAD_USUARIONOVEDADINSTIPOIDCDUSUNOVEDADPEVCTIPOIDENTIFICACION = "p_evcTipoIdentificacion";
    /** <code>usuarioNovedadInsTipoIdCDUsuNovedadpevcTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_INSTIPOIDCDUSUNOVEDAD_USUARIONOVEDADINSTIPOIDCDUSUNOVEDADPEVCTIPOIDENTIFICACION = "Clas_1581442138112529Ser_17Arg_2_Alias";
    /** <code>usuarioNovedadInsTipoIdCDUsuNovedadpevcTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPOIDCDUSUNOVEDAD_USUARIONOVEDADINSTIPOIDCDUSUNOVEDADPEVCTIPOIDENTIFICACION = "Tipo Id. Nuevo";
    // Service (DelTipoIdCDUsuNovedad)
    /** <code>DelTipoIdCDUsuNovedad</code> service id. */
    public static final String SERV_ID_DELTIPOIDCDUSUNOVEDAD = "Clas_1581442138112529Ser_18_Alias";
    /** <code>DelTipoIdCDUsuNovedad</code> service name. */
    public static final String SERV_NAME_DELTIPOIDCDUSUNOVEDAD = "DelTipoIdCDUsuNovedad";
    /** <code>DelTipoIdCDUsuNovedad</code> service alias. */
    public static final String SERV_ALIAS_DELTIPOIDCDUSUNOVEDAD = "DelTipoIdCDUsuNovedad";
    /** Agents allowed to execute the service DelTipoIdCDUsuNovedad **/
    public static final String DELTIPOIDCDUSUNOVEDAD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioNovedadDelTipoIdCDUsuNovedadpthisUsuarioNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPOIDCDUSUNOVEDAD_USUARIONOVEDADDELTIPOIDCDUSUNOVEDADPTHISUSUARIONOVEDAD = "p_thisUsuarioNovedad";
    /** <code>usuarioNovedadDelTipoIdCDUsuNovedadpthisUsuarioNovedad</code> inbound argument id. */
    public static final String ARG_ID_DELTIPOIDCDUSUNOVEDAD_USUARIONOVEDADDELTIPOIDCDUSUNOVEDADPTHISUSUARIONOVEDAD = "Clas_1581442138112529Ser_18Arg_1_Alias";
    /** <code>usuarioNovedadDelTipoIdCDUsuNovedadpthisUsuarioNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPOIDCDUSUNOVEDAD_USUARIONOVEDADDELTIPOIDCDUSUNOVEDADPTHISUSUARIONOVEDAD = "Usuario";
    /** <code>usuarioNovedadDelTipoIdCDUsuNovedadpevcTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPOIDCDUSUNOVEDAD_USUARIONOVEDADDELTIPOIDCDUSUNOVEDADPEVCTIPOIDENTIFICACION = "p_evcTipoIdentificacion";
    /** <code>usuarioNovedadDelTipoIdCDUsuNovedadpevcTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_DELTIPOIDCDUSUNOVEDAD_USUARIONOVEDADDELTIPOIDCDUSUNOVEDADPEVCTIPOIDENTIFICACION = "Clas_1581442138112529Ser_18Arg_2_Alias";
    /** <code>usuarioNovedadDelTipoIdCDUsuNovedadpevcTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPOIDCDUSUNOVEDAD_USUARIONOVEDADDELTIPOIDCDUSUNOVEDADPEVCTIPOIDENTIFICACION = "Tipo Id. Nuevo";
    // Service (modificarNumIdentificacion)
    /** <code>modificarNumIdentificacion</code> service id. */
    public static final String SERV_ID_MODIFICARNUMIDENTIFICACION = "Clas_1581442138112529Ser_19_Alias";
    /** <code>modificarNumIdentificacion</code> service name. */
    public static final String SERV_NAME_MODIFICARNUMIDENTIFICACION = "modificarNumIdentificacion";
    /** <code>modificarNumIdentificacion</code> service alias. */
    public static final String SERV_ALIAS_MODIFICARNUMIDENTIFICACION = "modificarNumIdentificacion";
    /** Agents allowed to execute the service modificarNumIdentificacion **/
    public static final String MODIFICARNUMIDENTIFICACION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioNovedadmodificarNumIdentificacionpthisUsuarioNovedad</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARNUMIDENTIFICACION_USUARIONOVEDADMODIFICARNUMIDENTIFICACIONPTHISUSUARIONOVEDAD = "p_thisUsuarioNovedad";
    /** <code>usuarioNovedadmodificarNumIdentificacionpthisUsuarioNovedad</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARNUMIDENTIFICACION_USUARIONOVEDADMODIFICARNUMIDENTIFICACIONPTHISUSUARIONOVEDAD = "Clas_1581442138112529Ser_19Arg_1_Alias";
    /** <code>usuarioNovedadmodificarNumIdentificacionpthisUsuarioNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARNUMIDENTIFICACION_USUARIONOVEDADMODIFICARNUMIDENTIFICACIONPTHISUSUARIONOVEDAD = "Usuario";
    /** <code>usuarioNovedadmodificarNumIdentificacionpNumIdentificacionCD</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARNUMIDENTIFICACION_USUARIONOVEDADMODIFICARNUMIDENTIFICACIONPNUMIDENTIFICACIONCD = "p_NumIdentificacionCD";
    /** <code>usuarioNovedadmodificarNumIdentificacionpNumIdentificacionCD</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARNUMIDENTIFICACION_USUARIONOVEDADMODIFICARNUMIDENTIFICACIONPNUMIDENTIFICACIONCD = "Clas_1581442138112529Ser_19Arg_2_Alias";
    /** <code>usuarioNovedadmodificarNumIdentificacionpNumIdentificacionCD</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARNUMIDENTIFICACION_USUARIONOVEDADMODIFICARNUMIDENTIFICACIONPNUMIDENTIFICACIONCD = "Nº Identificación Nuevo";
    // Service (cambiarExcluido)
    /** <code>cambiarExcluido</code> service id. */
    public static final String SERV_ID_CAMBIAREXCLUIDO = "Clas_1581442138112529Ser_21_Alias";
    /** <code>cambiarExcluido</code> service name. */
    public static final String SERV_NAME_CAMBIAREXCLUIDO = "cambiarExcluido";
    /** <code>cambiarExcluido</code> service alias. */
    public static final String SERV_ALIAS_CAMBIAREXCLUIDO = "Cambiar Excluido";
    /** Agents allowed to execute the service cambiarExcluido **/
    public static final String CAMBIAREXCLUIDO_SRVAGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,MesaDeApoyo";
    // Preconditions
    /** <code>cambiarExcluido</code> precondition 0 id. */
    public static final String PRE_ID_CAMBIAREXCLUIDO_0 = "Clas_1581442138112529Pre_1_MsgError";
    /** <code>cambiarExcluido</code> precondition 1 id. */
    public static final String PRE_ID_CAMBIAREXCLUIDO_1 = "Clas_1581442138112529Pre_2_MsgError";
    /** <code>cambiarExcluido</code> precondition 2 id. */
    public static final String PRE_ID_CAMBIAREXCLUIDO_2 = "Clas_1581442138112529Pre_23_MsgError";
    // Inbound arguments
    /** <code>usuarioNovedadcambiarExcluidopthisUsuarioNovedad</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIAREXCLUIDO_USUARIONOVEDADCAMBIAREXCLUIDOPTHISUSUARIONOVEDAD = "p_thisUsuarioNovedad";
    /** <code>usuarioNovedadcambiarExcluidopthisUsuarioNovedad</code> inbound argument id. */
    public static final String ARG_ID_CAMBIAREXCLUIDO_USUARIONOVEDADCAMBIAREXCLUIDOPTHISUSUARIONOVEDAD = "Clas_1581442138112529Ser_21Arg_1_Alias";
    /** <code>usuarioNovedadcambiarExcluidopthisUsuarioNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIAREXCLUIDO_USUARIONOVEDADCAMBIAREXCLUIDOPTHISUSUARIONOVEDAD = "Usuario";
    /** <code>usuarioNovedadcambiarExcluidoprExcluido</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIAREXCLUIDO_USUARIONOVEDADCAMBIAREXCLUIDOPREXCLUIDO = "prExcluido";
    /** <code>usuarioNovedadcambiarExcluidoprExcluido</code> inbound argument id. */
    public static final String ARG_ID_CAMBIAREXCLUIDO_USUARIONOVEDADCAMBIAREXCLUIDOPREXCLUIDO = "Clas_1581442138112529Ser_21Arg_2_Alias";
    /** <code>usuarioNovedadcambiarExcluidoprExcluido</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIAREXCLUIDO_USUARIONOVEDADCAMBIAREXCLUIDOPREXCLUIDO = "Excluido";
    // Service (cambiarRO)
    /** <code>cambiarRO</code> service id. */
    public static final String SERV_ID_CAMBIARRO = "Clas_1581442138112529Ser_22_Alias";
    /** <code>cambiarRO</code> service name. */
    public static final String SERV_NAME_CAMBIARRO = "cambiarRO";
    /** <code>cambiarRO</code> service alias. */
    public static final String SERV_ALIAS_CAMBIARRO = "Contratación rehabilitación oral";
    /** Agents allowed to execute the service cambiarRO **/
    public static final String CAMBIARRO_SRVAGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,MesaDeApoyo";
    // Preconditions
    /** <code>cambiarRO</code> precondition 0 id. */
    public static final String PRE_ID_CAMBIARRO_0 = "Clas_1581442138112529Pre_3_MsgError";
    /** <code>cambiarRO</code> precondition 1 id. */
    public static final String PRE_ID_CAMBIARRO_1 = "Clas_1581442138112529Pre_22_MsgError";
    // Inbound arguments
    /** <code>usuarioNovedadcambiarROpthisUsuarioNovedad</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARRO_USUARIONOVEDADCAMBIARROPTHISUSUARIONOVEDAD = "p_thisUsuarioNovedad";
    /** <code>usuarioNovedadcambiarROpthisUsuarioNovedad</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARRO_USUARIONOVEDADCAMBIARROPTHISUSUARIONOVEDAD = "Clas_1581442138112529Ser_22Arg_1_Alias";
    /** <code>usuarioNovedadcambiarROpthisUsuarioNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARRO_USUARIONOVEDADCAMBIARROPTHISUSUARIONOVEDAD = "Usuario";
    /** <code>usuarioNovedadcambiarROprContratar</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARRO_USUARIONOVEDADCAMBIARROPRCONTRATAR = "prContratar";
    /** <code>usuarioNovedadcambiarROprContratar</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARRO_USUARIONOVEDADCAMBIARROPRCONTRATAR = "Clas_1581442138112529Ser_22Arg_2_Alias";
    /** <code>usuarioNovedadcambiarROprContratar</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARRO_USUARIONOVEDADCAMBIARROPRCONTRATAR = "Contratar";
    // Service (cambiarPS)
    /** <code>cambiarPS</code> service id. */
    public static final String SERV_ID_CAMBIARPS = "Clas_1581442138112529Ser_23_Alias";
    /** <code>cambiarPS</code> service name. */
    public static final String SERV_NAME_CAMBIARPS = "cambiarPS";
    /** <code>cambiarPS</code> service alias. */
    public static final String SERV_ALIAS_CAMBIARPS = "Prorrogar Suspensión";
    /** Agents allowed to execute the service cambiarPS **/
    public static final String CAMBIARPS_SRVAGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,MesaDeApoyo";
    // Preconditions
    /** <code>cambiarPS</code> precondition 0 id. */
    public static final String PRE_ID_CAMBIARPS_0 = "Clas_1581442138112529Pre_6_MsgError";
    /** <code>cambiarPS</code> precondition 1 id. */
    public static final String PRE_ID_CAMBIARPS_1 = "Clas_1581442138112529Pre_21_MsgError";
    // Inbound arguments
    /** <code>usuarioNovedadcambiarPSpthisUsuarioNovedad</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARPS_USUARIONOVEDADCAMBIARPSPTHISUSUARIONOVEDAD = "p_thisUsuarioNovedad";
    /** <code>usuarioNovedadcambiarPSpthisUsuarioNovedad</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARPS_USUARIONOVEDADCAMBIARPSPTHISUSUARIONOVEDAD = "Clas_1581442138112529Ser_23Arg_1_Alias";
    /** <code>usuarioNovedadcambiarPSpthisUsuarioNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARPS_USUARIONOVEDADCAMBIARPSPTHISUSUARIONOVEDAD = "Usuario";
    /** <code>usuarioNovedadcambiarPSpProrroga</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARPS_USUARIONOVEDADCAMBIARPSPPRORROGA = "pProrroga";
    /** <code>usuarioNovedadcambiarPSpProrroga</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARPS_USUARIONOVEDADCAMBIARPSPPRORROGA = "Clas_1581442138112529Ser_23Arg_2_Alias";
    /** <code>usuarioNovedadcambiarPSpProrroga</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARPS_USUARIONOVEDADCAMBIARPSPPRORROGA = "Prorroga Suspensión";
    // Service (cambiarAS)
    /** <code>cambiarAS</code> service id. */
    public static final String SERV_ID_CAMBIARAS = "Clas_1581442138112529Ser_24_Alias";
    /** <code>cambiarAS</code> service name. */
    public static final String SERV_NAME_CAMBIARAS = "cambiarAS";
    /** <code>cambiarAS</code> service alias. */
    public static final String SERV_ALIAS_CAMBIARAS = "Activar Suspensión";
    /** Agents allowed to execute the service cambiarAS **/
    public static final String CAMBIARAS_SRVAGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,MesaDeApoyo";
    // Preconditions
    /** <code>cambiarAS</code> precondition 0 id. */
    public static final String PRE_ID_CAMBIARAS_0 = "Clas_1581442138112529Pre_7_MsgError";
    /** <code>cambiarAS</code> precondition 1 id. */
    public static final String PRE_ID_CAMBIARAS_1 = "Clas_1581442138112529Pre_20_MsgError";
    // Inbound arguments
    /** <code>usuarioNovedadcambiarASpthisUsuarioNovedad</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARAS_USUARIONOVEDADCAMBIARASPTHISUSUARIONOVEDAD = "p_thisUsuarioNovedad";
    /** <code>usuarioNovedadcambiarASpthisUsuarioNovedad</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARAS_USUARIONOVEDADCAMBIARASPTHISUSUARIONOVEDAD = "Clas_1581442138112529Ser_24Arg_1_Alias";
    /** <code>usuarioNovedadcambiarASpthisUsuarioNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARAS_USUARIONOVEDADCAMBIARASPTHISUSUARIONOVEDAD = "Usuario";
    /** <code>usuarioNovedadcambiarASpActivacion</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARAS_USUARIONOVEDADCAMBIARASPACTIVACION = "pActivacion";
    /** <code>usuarioNovedadcambiarASpActivacion</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARAS_USUARIONOVEDADCAMBIARASPACTIVACION = "Clas_1581442138112529Ser_24Arg_2_Alias";
    /** <code>usuarioNovedadcambiarASpActivacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARAS_USUARIONOVEDADCAMBIARASPACTIVACION = "Activación suspensión";
    // Service (validarCP)
    /** <code>validarCP</code> service id. */
    public static final String SERV_ID_VALIDARCP = "Clas_1581442138112529Ser_25_Alias";
    /** <code>validarCP</code> service name. */
    public static final String SERV_NAME_VALIDARCP = "validarCP";
    /** <code>validarCP</code> service alias. */
    public static final String SERV_ALIAS_VALIDARCP = "validarCP";
    /** Agents allowed to execute the service validarCP **/
    public static final String VALIDARCP_SRVAGENTS = "";
    // Preconditions
    /** <code>validarCP</code> precondition 0 id. */
    public static final String PRE_ID_VALIDARCP_0 = "Clas_1581442138112529Pre_8_MsgError";
    /** <code>validarCP</code> precondition 1 id. */
    public static final String PRE_ID_VALIDARCP_1 = "Clas_1581442138112529Pre_9_MsgError";
    /** <code>validarCP</code> precondition 2 id. */
    public static final String PRE_ID_VALIDARCP_2 = "Clas_1581442138112529Pre_10_MsgError";
    /** <code>validarCP</code> precondition 3 id. */
    public static final String PRE_ID_VALIDARCP_3 = "Clas_1581442138112529Pre_11_MsgError";
    // Inbound arguments
    /** <code>usuarioNovedadvalidarCPpthisUsuarioNovedad</code> inbound argument name. */
    public static final String ARG_NAME_VALIDARCP_USUARIONOVEDADVALIDARCPPTHISUSUARIONOVEDAD = "p_thisUsuarioNovedad";
    /** <code>usuarioNovedadvalidarCPpthisUsuarioNovedad</code> inbound argument id. */
    public static final String ARG_ID_VALIDARCP_USUARIONOVEDADVALIDARCPPTHISUSUARIONOVEDAD = "Clas_1581442138112529Ser_25Arg_1_Alias";
    /** <code>usuarioNovedadvalidarCPpthisUsuarioNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_VALIDARCP_USUARIONOVEDADVALIDARCPPTHISUSUARIONOVEDAD = "Usuario";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1581442138112529Ser_29_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioNovedadmodificarpthisUsuarioNovedad</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_USUARIONOVEDADMODIFICARPTHISUSUARIONOVEDAD = "p_thisUsuarioNovedad";
    /** <code>usuarioNovedadmodificarpthisUsuarioNovedad</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_USUARIONOVEDADMODIFICARPTHISUSUARIONOVEDAD = "Clas_1581442138112529Ser_29Arg_1_Alias";
    /** <code>usuarioNovedadmodificarpthisUsuarioNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_USUARIONOVEDADMODIFICARPTHISUSUARIONOVEDAD = "Usuario";
    /** <code>usuarioNovedadmodificarpNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_USUARIONOVEDADMODIFICARPNUMIDENTIFICACION = "p_NumIdentificacion";
    /** <code>usuarioNovedadmodificarpNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_USUARIONOVEDADMODIFICARPNUMIDENTIFICACION = "Clas_1581442138112529Ser_29Arg_2_Alias";
    /** <code>usuarioNovedadmodificarpNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_USUARIONOVEDADMODIFICARPNUMIDENTIFICACION = "Nº Identificación";
    /** <code>usuarioNovedadmodificarpPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_USUARIONOVEDADMODIFICARPPRIMERNOMBRE = "p_PrimerNombre";
    /** <code>usuarioNovedadmodificarpPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_USUARIONOVEDADMODIFICARPPRIMERNOMBRE = "Clas_1581442138112529Ser_29Arg_3_Alias";
    /** <code>usuarioNovedadmodificarpPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_USUARIONOVEDADMODIFICARPPRIMERNOMBRE = "Primer Nombre";
    /** <code>usuarioNovedadmodificarpSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_USUARIONOVEDADMODIFICARPSEGUNDONOMBRE = "p_SegundoNombre";
    /** <code>usuarioNovedadmodificarpSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_USUARIONOVEDADMODIFICARPSEGUNDONOMBRE = "Clas_1581442138112529Ser_29Arg_4_Alias";
    /** <code>usuarioNovedadmodificarpSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_USUARIONOVEDADMODIFICARPSEGUNDONOMBRE = "Segundo Nombre";
    /** <code>usuarioNovedadmodificarpPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_USUARIONOVEDADMODIFICARPPRIMERAPELLIDO = "p_PrimerApellido";
    /** <code>usuarioNovedadmodificarpPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_USUARIONOVEDADMODIFICARPPRIMERAPELLIDO = "Clas_1581442138112529Ser_29Arg_5_Alias";
    /** <code>usuarioNovedadmodificarpPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_USUARIONOVEDADMODIFICARPPRIMERAPELLIDO = "Primer Apellido";
    /** <code>usuarioNovedadmodificarpSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_USUARIONOVEDADMODIFICARPSEGUNDOAPELLIDO = "p_SegundoApellido";
    /** <code>usuarioNovedadmodificarpSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_USUARIONOVEDADMODIFICARPSEGUNDOAPELLIDO = "Clas_1581442138112529Ser_29Arg_6_Alias";
    /** <code>usuarioNovedadmodificarpSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_USUARIONOVEDADMODIFICARPSEGUNDOAPELLIDO = "Segundo Apellido";
    /** <code>usuarioNovedadmodificarpGenero</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_USUARIONOVEDADMODIFICARPGENERO = "p_Genero";
    /** <code>usuarioNovedadmodificarpGenero</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_USUARIONOVEDADMODIFICARPGENERO = "Clas_1581442138112529Ser_29Arg_7_Alias";
    /** <code>usuarioNovedadmodificarpGenero</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_USUARIONOVEDADMODIFICARPGENERO = "Género";
    /** <code>usuarioNovedadmodificarpFechaNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_USUARIONOVEDADMODIFICARPFECHANACIMIENTO = "p_FechaNacimiento";
    /** <code>usuarioNovedadmodificarpFechaNacimiento</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_USUARIONOVEDADMODIFICARPFECHANACIMIENTO = "Clas_1581442138112529Ser_29Arg_8_Alias";
    /** <code>usuarioNovedadmodificarpFechaNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_USUARIONOVEDADMODIFICARPFECHANACIMIENTO = "Fecha Nacimiento";
    // Service (TCREARDESDECORE)
    /** <code>TCREARDESDECORE</code> service id. */
    public static final String SERV_ID_TCREARDESDECORE = "Clas_1581442138112529Ser_10_Alias";
    /** <code>TCREARDESDECORE</code> service name. */
    public static final String SERV_NAME_TCREARDESDECORE = "TCREARDESDECORE";
    /** <code>TCREARDESDECORE</code> service alias. */
    public static final String SERV_ALIAS_TCREARDESDECORE = "TCREARDESDECORE";
    /** Agents allowed to execute the service TCREARDESDECORE **/
    public static final String TCREARDESDECORE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioNovedadTCREARDESDECOREptpagrFamiliaNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPAGRFAMILIANOVEDAD = "pt_p_agrFamiliaNovedad";
    /** <code>usuarioNovedadTCREARDESDECOREptpagrFamiliaNovedad</code> inbound argument id. */
    public static final String ARG_ID_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPAGRFAMILIANOVEDAD = "Clas_1581442138112529Ser_10Arg_3_Alias";
    /** <code>usuarioNovedadTCREARDESDECOREptpagrFamiliaNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPAGRFAMILIANOVEDAD = "FamiliaNovedad";
    /** <code>usuarioNovedadTCREARDESDECOREptpagrTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPAGRTIPOIDENTIFICACION = "pt_p_agrTipoIdentificacion";
    /** <code>usuarioNovedadTCREARDESDECOREptpagrTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPAGRTIPOIDENTIFICACION = "Clas_1581442138112529Ser_10Arg_4_Alias";
    /** <code>usuarioNovedadTCREARDESDECOREptpagrTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPAGRTIPOIDENTIFICACION = "Tipo Identificacion";
    /** <code>usuarioNovedadTCREARDESDECOREptpagrParentesco</code> inbound argument name. */
    public static final String ARG_NAME_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPAGRPARENTESCO = "pt_p_agrParentesco";
    /** <code>usuarioNovedadTCREARDESDECOREptpagrParentesco</code> inbound argument id. */
    public static final String ARG_ID_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPAGRPARENTESCO = "Clas_1581442138112529Ser_10Arg_6_Alias";
    /** <code>usuarioNovedadTCREARDESDECOREptpagrParentesco</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPAGRPARENTESCO = "Parentesco";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRNUMIDENTIFICACION = "pt_p_atrNumIdentificacion";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRNUMIDENTIFICACION = "Clas_1581442138112529Ser_10Arg_7_Alias";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRNUMIDENTIFICACION = "Nº Identificación";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRPRIMERNOMBRE = "pt_p_atrPrimerNombre";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRPRIMERNOMBRE = "Clas_1581442138112529Ser_10Arg_8_Alias";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRPRIMERNOMBRE = "Primer Nombre";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrMotivoEstado</code> inbound argument name. */
    public static final String ARG_NAME_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRMOTIVOESTADO = "pt_p_atrMotivoEstado";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrMotivoEstado</code> inbound argument id. */
    public static final String ARG_ID_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRMOTIVOESTADO = "Clas_1581442138112529Ser_10Arg_9_Alias";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrMotivoEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRMOTIVOESTADO = "Motivo";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrFechaIniVigencia</code> inbound argument name. */
    public static final String ARG_NAME_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRFECHAINIVIGENCIA = "pt_p_atrFechaIniVigencia";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrFechaIniVigencia</code> inbound argument id. */
    public static final String ARG_ID_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRFECHAINIVIGENCIA = "Clas_1581442138112529Ser_10Arg_10_Alias";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrFechaIniVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRFECHAINIVIGENCIA = "Fecha inicio vigencia";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrFechaAntiguedad</code> inbound argument name. */
    public static final String ARG_NAME_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRFECHAANTIGUEDAD = "pt_p_atrFechaAntiguedad";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrFechaAntiguedad</code> inbound argument id. */
    public static final String ARG_ID_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRFECHAANTIGUEDAD = "Clas_1581442138112529Ser_10Arg_11_Alias";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrFechaAntiguedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRFECHAANTIGUEDAD = "Fecha antiguedad";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRSEGUNDONOMBRE = "pt_p_atrSegundoNombre";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRSEGUNDONOMBRE = "Clas_1581442138112529Ser_10Arg_12_Alias";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRSEGUNDONOMBRE = "Segundo Nombre";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRPRIMERAPELLIDO = "pt_p_atrPrimerApellido";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRPRIMERAPELLIDO = "Clas_1581442138112529Ser_10Arg_13_Alias";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRPRIMERAPELLIDO = "Primer Apellido";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRSEGUNDOAPELLIDO = "pt_p_atrSegundoApellido";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRSEGUNDOAPELLIDO = "Clas_1581442138112529Ser_10Arg_14_Alias";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRSEGUNDOAPELLIDO = "Segundo Apellido";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrNumUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRNUMUSUARIO = "pt_p_atrNumUsuario";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrNumUsuario</code> inbound argument id. */
    public static final String ARG_ID_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRNUMUSUARIO = "Clas_1581442138112529Ser_10Arg_66_Alias";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrNumUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRNUMUSUARIO = "Nº Usuario";
    /** <code>usuarioNovedadTCREARDESDECOREptpagrEstadoBeneficiario</code> inbound argument name. */
    public static final String ARG_NAME_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPAGRESTADOBENEFICIARIO = "pt_p_agrEstadoBeneficiario";
    /** <code>usuarioNovedadTCREARDESDECOREptpagrEstadoBeneficiario</code> inbound argument id. */
    public static final String ARG_ID_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPAGRESTADOBENEFICIARIO = "Clas_1581442138112529Ser_10Arg_112_Alias";
    /** <code>usuarioNovedadTCREARDESDECOREptpagrEstadoBeneficiario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPAGRESTADOBENEFICIARIO = "EstadoBeneficiario";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrFechaNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRFECHANACIMIENTO = "pt_p_atrFechaNacimiento";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrFechaNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRFECHANACIMIENTO = "Clas_1581442138112529Ser_10Arg_285_Alias";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrFechaNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRFECHANACIMIENTO = "Fecha Nacimiento";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrGenero</code> inbound argument name. */
    public static final String ARG_NAME_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRGENERO = "pt_p_atrGenero";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrGenero</code> inbound argument id. */
    public static final String ARG_ID_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRGENERO = "Clas_1581442138112529Ser_10Arg_292_Alias";
    /** <code>usuarioNovedadTCREARDESDECOREptpatrGenero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARDESDECORE_USUARIONOVEDADTCREARDESDECOREPTPATRGENERO = "Género";
    // Service (TDELETE)
    /** <code>TDELETE</code> service id. */
    public static final String SERV_ID_TDELETE = "Clas_1581442138112529Ser_26_Alias";
    /** <code>TDELETE</code> service name. */
    public static final String SERV_NAME_TDELETE = "TDELETE";
    /** <code>TDELETE</code> service alias. */
    public static final String SERV_ALIAS_TDELETE = "Quitar Usuario";
    /** Agents allowed to execute the service TDELETE **/
    public static final String TDELETE_SRVAGENTS = "SuperAdmin,Asesor";
    // Inbound arguments
    /** <code>usuarioNovedadTDELETEpthisUsuarioNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TDELETE_USUARIONOVEDADTDELETEPTHISUSUARIONOVEDAD = "p_thisUsuarioNovedad";
    /** <code>usuarioNovedadTDELETEpthisUsuarioNovedad</code> inbound argument id. */
    public static final String ARG_ID_TDELETE_USUARIONOVEDADTDELETEPTHISUSUARIONOVEDAD = "Clas_1581442138112529Ser_26Arg_1_Alias";
    /** <code>usuarioNovedadTDELETEpthisUsuarioNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TDELETE_USUARIONOVEDADTDELETEPTHISUSUARIONOVEDAD = "Usuario";
    // Service (TCAMBIARPARENTESCO)
    /** <code>TCAMBIARPARENTESCO</code> service id. */
    public static final String SERV_ID_TCAMBIARPARENTESCO = "Clas_1581442138112529Ser_27_Alias";
    /** <code>TCAMBIARPARENTESCO</code> service name. */
    public static final String SERV_NAME_TCAMBIARPARENTESCO = "TCAMBIARPARENTESCO";
    /** <code>TCAMBIARPARENTESCO</code> service alias. */
    public static final String SERV_ALIAS_TCAMBIARPARENTESCO = "Cambiar Parentesco";
    /** Agents allowed to execute the service TCAMBIARPARENTESCO **/
    public static final String TCAMBIARPARENTESCO_SRVAGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,MesaDeApoyo";
    // Preconditions
    /** <code>TCAMBIARPARENTESCO</code> precondition 0 id. */
    public static final String PRE_ID_TCAMBIARPARENTESCO_0 = "Clas_1581442138112529Pre_13_MsgError";
    // Inbound arguments
    /** <code>usuarioNovedadTCAMBIARPARENTESCOpthisUsuarioNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARPARENTESCO_USUARIONOVEDADTCAMBIARPARENTESCOPTHISUSUARIONOVEDAD = "p_thisUsuarioNovedad";
    /** <code>usuarioNovedadTCAMBIARPARENTESCOpthisUsuarioNovedad</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARPARENTESCO_USUARIONOVEDADTCAMBIARPARENTESCOPTHISUSUARIONOVEDAD = "Clas_1581442138112529Ser_27Arg_1_Alias";
    /** <code>usuarioNovedadTCAMBIARPARENTESCOpthisUsuarioNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARPARENTESCO_USUARIONOVEDADTCAMBIARPARENTESCOPTHISUSUARIONOVEDAD = "Usuario";
    /** <code>usuarioNovedadTCAMBIARPARENTESCOptpevcParentesco</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARPARENTESCO_USUARIONOVEDADTCAMBIARPARENTESCOPTPEVCPARENTESCO = "pt_p_evcParentesco";
    /** <code>usuarioNovedadTCAMBIARPARENTESCOptpevcParentesco</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARPARENTESCO_USUARIONOVEDADTCAMBIARPARENTESCOPTPEVCPARENTESCO = "Clas_1581442138112529Ser_27Arg_2_Alias";
    /** <code>usuarioNovedadTCAMBIARPARENTESCOptpevcParentesco</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARPARENTESCO_USUARIONOVEDADTCAMBIARPARENTESCOPTPEVCPARENTESCO = "ParentescoNuevo";
    // Service (TCAMBIARTIPOIDENT)
    /** <code>TCAMBIARTIPOIDENT</code> service id. */
    public static final String SERV_ID_TCAMBIARTIPOIDENT = "Clas_1581442138112529Ser_28_Alias";
    /** <code>TCAMBIARTIPOIDENT</code> service name. */
    public static final String SERV_NAME_TCAMBIARTIPOIDENT = "TCAMBIARTIPOIDENT";
    /** <code>TCAMBIARTIPOIDENT</code> service alias. */
    public static final String SERV_ALIAS_TCAMBIARTIPOIDENT = "Cambiar Identificación";
    /** Agents allowed to execute the service TCAMBIARTIPOIDENT **/
    public static final String TCAMBIARTIPOIDENT_SRVAGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,MesaDeApoyo";
    // Preconditions
    /** <code>TCAMBIARTIPOIDENT</code> precondition 0 id. */
    public static final String PRE_ID_TCAMBIARTIPOIDENT_0 = "Clas_1581442138112529Pre_15_MsgError";
    /** <code>TCAMBIARTIPOIDENT</code> precondition 1 id. */
    public static final String PRE_ID_TCAMBIARTIPOIDENT_1 = "Clas_1581442138112529Pre_16_MsgError";
    // Inbound arguments
    /** <code>usuarioNovedadTCAMBIARTIPOIDENTpthisUsuarioNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARTIPOIDENT_USUARIONOVEDADTCAMBIARTIPOIDENTPTHISUSUARIONOVEDAD = "p_thisUsuarioNovedad";
    /** <code>usuarioNovedadTCAMBIARTIPOIDENTpthisUsuarioNovedad</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARTIPOIDENT_USUARIONOVEDADTCAMBIARTIPOIDENTPTHISUSUARIONOVEDAD = "Clas_1581442138112529Ser_28Arg_1_Alias";
    /** <code>usuarioNovedadTCAMBIARTIPOIDENTpthisUsuarioNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARTIPOIDENT_USUARIONOVEDADTCAMBIARTIPOIDENTPTHISUSUARIONOVEDAD = "Usuario";
    /** <code>usuarioNovedadTCAMBIARTIPOIDENTptpevcTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARTIPOIDENT_USUARIONOVEDADTCAMBIARTIPOIDENTPTPEVCTIPOIDENTIFICACION = "pt_p_evcTipoIdentificacion";
    /** <code>usuarioNovedadTCAMBIARTIPOIDENTptpevcTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARTIPOIDENT_USUARIONOVEDADTCAMBIARTIPOIDENTPTPEVCTIPOIDENTIFICACION = "Clas_1581442138112529Ser_28Arg_4_Alias";
    /** <code>usuarioNovedadTCAMBIARTIPOIDENTptpevcTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARTIPOIDENT_USUARIONOVEDADTCAMBIARTIPOIDENTPTPEVCTIPOIDENTIFICACION = "Tipo Id. Nuevo";
    /** <code>usuarioNovedadTCAMBIARTIPOIDENTptpNumIdentificacionCD</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARTIPOIDENT_USUARIONOVEDADTCAMBIARTIPOIDENTPTPNUMIDENTIFICACIONCD = "pt_p_NumIdentificacionCD";
    /** <code>usuarioNovedadTCAMBIARTIPOIDENTptpNumIdentificacionCD</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARTIPOIDENT_USUARIONOVEDADTCAMBIARTIPOIDENTPTPNUMIDENTIFICACIONCD = "Clas_1581442138112529Ser_28Arg_5_Alias";
    /** <code>usuarioNovedadTCAMBIARTIPOIDENTptpNumIdentificacionCD</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARTIPOIDENT_USUARIONOVEDADTCAMBIARTIPOIDENTPTPNUMIDENTIFICACIONCD = "Nº Identificación Nuevo";
    // Service (TCREARMANUAL)
    /** <code>TCREARMANUAL</code> service id. */
    public static final String SERV_ID_TCREARMANUAL = "Clas_1581442138112529Ser_30_Alias";
    /** <code>TCREARMANUAL</code> service name. */
    public static final String SERV_NAME_TCREARMANUAL = "TCREARMANUAL";
    /** <code>TCREARMANUAL</code> service alias. */
    public static final String SERV_ALIAS_TCREARMANUAL = "Añadir usuario";
    /** Agents allowed to execute the service TCREARMANUAL **/
    public static final String TCREARMANUAL_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioNovedadTCREARMANUALptpagrFamiliaNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPAGRFAMILIANOVEDAD = "pt_p_agrFamiliaNovedad";
    /** <code>usuarioNovedadTCREARMANUALptpagrFamiliaNovedad</code> inbound argument id. */
    public static final String ARG_ID_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPAGRFAMILIANOVEDAD = "Clas_1581442138112529Ser_30Arg_3_Alias";
    /** <code>usuarioNovedadTCREARMANUALptpagrFamiliaNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPAGRFAMILIANOVEDAD = "FamiliaNovedad";
    /** <code>usuarioNovedadTCREARMANUALptpagrTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPAGRTIPOIDENTIFICACION = "pt_p_agrTipoIdentificacion";
    /** <code>usuarioNovedadTCREARMANUALptpagrTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPAGRTIPOIDENTIFICACION = "Clas_1581442138112529Ser_30Arg_4_Alias";
    /** <code>usuarioNovedadTCREARMANUALptpagrTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPAGRTIPOIDENTIFICACION = "Tipo Identificacion";
    /** <code>usuarioNovedadTCREARMANUALptpagrParentesco</code> inbound argument name. */
    public static final String ARG_NAME_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPAGRPARENTESCO = "pt_p_agrParentesco";
    /** <code>usuarioNovedadTCREARMANUALptpagrParentesco</code> inbound argument id. */
    public static final String ARG_ID_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPAGRPARENTESCO = "Clas_1581442138112529Ser_30Arg_5_Alias";
    /** <code>usuarioNovedadTCREARMANUALptpagrParentesco</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPAGRPARENTESCO = "Parentesco";
    /** <code>usuarioNovedadTCREARMANUALptpatrNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPATRNUMIDENTIFICACION = "pt_p_atrNumIdentificacion";
    /** <code>usuarioNovedadTCREARMANUALptpatrNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPATRNUMIDENTIFICACION = "Clas_1581442138112529Ser_30Arg_9_Alias";
    /** <code>usuarioNovedadTCREARMANUALptpatrNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPATRNUMIDENTIFICACION = "Nº Identificación";
    /** <code>usuarioNovedadTCREARMANUALptpatrPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPATRPRIMERNOMBRE = "pt_p_atrPrimerNombre";
    /** <code>usuarioNovedadTCREARMANUALptpatrPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPATRPRIMERNOMBRE = "Clas_1581442138112529Ser_30Arg_10_Alias";
    /** <code>usuarioNovedadTCREARMANUALptpatrPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPATRPRIMERNOMBRE = "Primer Nombre";
    /** <code>usuarioNovedadTCREARMANUALptpatrSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPATRSEGUNDONOMBRE = "pt_p_atrSegundoNombre";
    /** <code>usuarioNovedadTCREARMANUALptpatrSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPATRSEGUNDONOMBRE = "Clas_1581442138112529Ser_30Arg_14_Alias";
    /** <code>usuarioNovedadTCREARMANUALptpatrSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPATRSEGUNDONOMBRE = "Segundo Nombre";
    /** <code>usuarioNovedadTCREARMANUALptpatrPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPATRPRIMERAPELLIDO = "pt_p_atrPrimerApellido";
    /** <code>usuarioNovedadTCREARMANUALptpatrPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPATRPRIMERAPELLIDO = "Clas_1581442138112529Ser_30Arg_15_Alias";
    /** <code>usuarioNovedadTCREARMANUALptpatrPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPATRPRIMERAPELLIDO = "Primer Apellido";
    /** <code>usuarioNovedadTCREARMANUALptpatrSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPATRSEGUNDOAPELLIDO = "pt_p_atrSegundoApellido";
    /** <code>usuarioNovedadTCREARMANUALptpatrSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPATRSEGUNDOAPELLIDO = "Clas_1581442138112529Ser_30Arg_16_Alias";
    /** <code>usuarioNovedadTCREARMANUALptpatrSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPATRSEGUNDOAPELLIDO = "Segundo Apellido";
    /** <code>usuarioNovedadTCREARMANUALptpatrFechaNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPATRFECHANACIMIENTO = "pt_p_atrFechaNacimiento";
    /** <code>usuarioNovedadTCREARMANUALptpatrFechaNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPATRFECHANACIMIENTO = "Clas_1581442138112529Ser_30Arg_18_Alias";
    /** <code>usuarioNovedadTCREARMANUALptpatrFechaNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPATRFECHANACIMIENTO = "Fecha Nacimiento";
    /** <code>usuarioNovedadTCREARMANUALptpatrGenero</code> inbound argument name. */
    public static final String ARG_NAME_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPATRGENERO = "pt_p_atrGenero";
    /** <code>usuarioNovedadTCREARMANUALptpatrGenero</code> inbound argument id. */
    public static final String ARG_ID_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPATRGENERO = "Clas_1581442138112529Ser_30Arg_19_Alias";
    /** <code>usuarioNovedadTCREARMANUALptpatrGenero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARMANUAL_USUARIONOVEDADTCREARMANUALPTPATRGENERO = "Género";
    // Service (TMODIFICARMANUAL)
    /** <code>TMODIFICARMANUAL</code> service id. */
    public static final String SERV_ID_TMODIFICARMANUAL = "Clas_1581442138112529Ser_31_Alias";
    /** <code>TMODIFICARMANUAL</code> service name. */
    public static final String SERV_NAME_TMODIFICARMANUAL = "TMODIFICARMANUAL";
    /** <code>TMODIFICARMANUAL</code> service alias. */
    public static final String SERV_ALIAS_TMODIFICARMANUAL = "Modificar";
    /** Agents allowed to execute the service TMODIFICARMANUAL **/
    public static final String TMODIFICARMANUAL_SRVAGENTS = "SuperAdmin,Asesor";
    // Inbound arguments
    /** <code>usuarioNovedadTMODIFICARMANUALpthisUsuarioNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTHISUSUARIONOVEDAD = "p_thisUsuarioNovedad";
    /** <code>usuarioNovedadTMODIFICARMANUALpthisUsuarioNovedad</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTHISUSUARIONOVEDAD = "Clas_1581442138112529Ser_31Arg_2_Alias";
    /** <code>usuarioNovedadTMODIFICARMANUALpthisUsuarioNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTHISUSUARIONOVEDAD = "Usuario";
    /** <code>usuarioNovedadTMODIFICARMANUALptpNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTPNUMIDENTIFICACION = "pt_p_NumIdentificacion";
    /** <code>usuarioNovedadTMODIFICARMANUALptpNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTPNUMIDENTIFICACION = "Clas_1581442138112529Ser_31Arg_3_Alias";
    /** <code>usuarioNovedadTMODIFICARMANUALptpNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTPNUMIDENTIFICACION = "Nº Identificación";
    /** <code>usuarioNovedadTMODIFICARMANUALptpPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTPPRIMERNOMBRE = "pt_p_PrimerNombre";
    /** <code>usuarioNovedadTMODIFICARMANUALptpPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTPPRIMERNOMBRE = "Clas_1581442138112529Ser_31Arg_4_Alias";
    /** <code>usuarioNovedadTMODIFICARMANUALptpPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTPPRIMERNOMBRE = "Primer Nombre";
    /** <code>usuarioNovedadTMODIFICARMANUALptpSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTPSEGUNDONOMBRE = "pt_p_SegundoNombre";
    /** <code>usuarioNovedadTMODIFICARMANUALptpSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTPSEGUNDONOMBRE = "Clas_1581442138112529Ser_31Arg_5_Alias";
    /** <code>usuarioNovedadTMODIFICARMANUALptpSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTPSEGUNDONOMBRE = "Segundo Nombre";
    /** <code>usuarioNovedadTMODIFICARMANUALptpPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTPPRIMERAPELLIDO = "pt_p_PrimerApellido";
    /** <code>usuarioNovedadTMODIFICARMANUALptpPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTPPRIMERAPELLIDO = "Clas_1581442138112529Ser_31Arg_6_Alias";
    /** <code>usuarioNovedadTMODIFICARMANUALptpPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTPPRIMERAPELLIDO = "Primer Apellido";
    /** <code>usuarioNovedadTMODIFICARMANUALptpSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTPSEGUNDOAPELLIDO = "pt_p_SegundoApellido";
    /** <code>usuarioNovedadTMODIFICARMANUALptpSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTPSEGUNDOAPELLIDO = "Clas_1581442138112529Ser_31Arg_7_Alias";
    /** <code>usuarioNovedadTMODIFICARMANUALptpSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTPSEGUNDOAPELLIDO = "Segundo Apellido";
    /** <code>usuarioNovedadTMODIFICARMANUALptpGenero</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTPGENERO = "pt_p_Genero";
    /** <code>usuarioNovedadTMODIFICARMANUALptpGenero</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTPGENERO = "Clas_1581442138112529Ser_31Arg_8_Alias";
    /** <code>usuarioNovedadTMODIFICARMANUALptpGenero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTPGENERO = "Género";
    /** <code>usuarioNovedadTMODIFICARMANUALptpFechaNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTPFECHANACIMIENTO = "pt_p_FechaNacimiento";
    /** <code>usuarioNovedadTMODIFICARMANUALptpFechaNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTPFECHANACIMIENTO = "Clas_1581442138112529Ser_31Arg_9_Alias";
    /** <code>usuarioNovedadTMODIFICARMANUALptpFechaNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTPFECHANACIMIENTO = "Fecha Nacimiento";
    /** <code>usuarioNovedadTMODIFICARMANUALptTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTTIPOIDENTIFICACION = "ptTipoIdentificacion";
    /** <code>usuarioNovedadTMODIFICARMANUALptTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTTIPOIDENTIFICACION = "Clas_1581442138112529Ser_31Arg_10_Alias";
    /** <code>usuarioNovedadTMODIFICARMANUALptTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTTIPOIDENTIFICACION = "Tipo identificación";
    /** <code>usuarioNovedadTMODIFICARMANUALptParentesco</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTPARENTESCO = "ptParentesco";
    /** <code>usuarioNovedadTMODIFICARMANUALptParentesco</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTPARENTESCO = "Clas_1581442138112529Ser_31Arg_11_Alias";
    /** <code>usuarioNovedadTMODIFICARMANUALptParentesco</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICARMANUAL_USUARIONOVEDADTMODIFICARMANUALPTPARENTESCO = "Parentesco";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADNUMIDENTIFICACION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADPRIMERNOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADSEGUNDONOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADPRIMERAPELLIDO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADSEGUNDOAPELLIDO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADMOTIVOESTADO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADFECHAINIVIGENCIA.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADFECHAANTIGUEDAD.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADNUMUSUARIO.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADGENERO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADFECHANACIMIENTO.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADSUNUMMESES.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADNUMIDENTIFICACIONCD.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADDRVESTAACTIVO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADDRVPARENTESCOOK.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADDRVESTITULAR.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADDRVESPADRE.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADDRVEDAD.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADDRVESHIJO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADDRVESCONYUGE.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADDRVESELTITULAR.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADDRVPUEDESERTITULAR.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADDRVESTASUSPENDIDO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADEXCLUIDO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADCONTRATACIONRO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADPRORROGASUSPENSION.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADACTIVACIONSUSPENSION.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADDRVNOMBRECOMPLETO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADDRVIDENTIFICACION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADDRVAPLICANOVEDAD.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIONOVEDADDRVNUEVAIDENTIFICACION.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADIDUSUARIONOVEDAD.toUpperCase(), USUARIONOVEDADIDUSUARIONOVEDAD_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADNUMIDENTIFICACION.toUpperCase(), USUARIONOVEDADNUMIDENTIFICACION_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADPRIMERNOMBRE.toUpperCase(), USUARIONOVEDADPRIMERNOMBRE_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADSEGUNDONOMBRE.toUpperCase(), USUARIONOVEDADSEGUNDONOMBRE_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADPRIMERAPELLIDO.toUpperCase(), USUARIONOVEDADPRIMERAPELLIDO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADSEGUNDOAPELLIDO.toUpperCase(), USUARIONOVEDADSEGUNDOAPELLIDO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADMOTIVOESTADO.toUpperCase(), USUARIONOVEDADMOTIVOESTADO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADFECHAINIVIGENCIA.toUpperCase(), USUARIONOVEDADFECHAINIVIGENCIA_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADFECHAANTIGUEDAD.toUpperCase(), USUARIONOVEDADFECHAANTIGUEDAD_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADNUMUSUARIO.toUpperCase(), USUARIONOVEDADNUMUSUARIO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADGENERO.toUpperCase(), USUARIONOVEDADGENERO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADFECHANACIMIENTO.toUpperCase(), USUARIONOVEDADFECHANACIMIENTO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADSUNUMMESES.toUpperCase(), USUARIONOVEDADSUNUMMESES_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADNUMIDENTIFICACIONCD.toUpperCase(), USUARIONOVEDADNUMIDENTIFICACIONCD_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADDRVESTAACTIVO.toUpperCase(), USUARIONOVEDADDRVESTAACTIVO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADDRVPARENTESCOOK.toUpperCase(), USUARIONOVEDADDRVPARENTESCOOK_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADDRVESTITULAR.toUpperCase(), USUARIONOVEDADDRVESTITULAR_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADDRVESPADRE.toUpperCase(), USUARIONOVEDADDRVESPADRE_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADDRVEDAD.toUpperCase(), USUARIONOVEDADDRVEDAD_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADDRVESHIJO.toUpperCase(), USUARIONOVEDADDRVESHIJO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADDRVESCONYUGE.toUpperCase(), USUARIONOVEDADDRVESCONYUGE_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADDRVESELTITULAR.toUpperCase(), USUARIONOVEDADDRVESELTITULAR_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADDRVPUEDESERTITULAR.toUpperCase(), USUARIONOVEDADDRVPUEDESERTITULAR_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADDRVESTASUSPENDIDO.toUpperCase(), USUARIONOVEDADDRVESTASUSPENDIDO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADEXCLUIDO.toUpperCase(), USUARIONOVEDADEXCLUIDO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADCONTRATACIONRO.toUpperCase(), USUARIONOVEDADCONTRATACIONRO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADPRORROGASUSPENSION.toUpperCase(), USUARIONOVEDADPRORROGASUSPENSION_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADACTIVACIONSUSPENSION.toUpperCase(), USUARIONOVEDADACTIVACIONSUSPENSION_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADDRVNOMBRECOMPLETO.toUpperCase(), USUARIONOVEDADDRVNOMBRECOMPLETO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADDRVIDENTIFICACION.toUpperCase(), USUARIONOVEDADDRVIDENTIFICACION_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADDRVAPLICANOVEDAD.toUpperCase(), USUARIONOVEDADDRVAPLICANOVEDAD_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIONOVEDADDRVNUEVAIDENTIFICACION.toUpperCase(), USUARIONOVEDADDRVNUEVAIDENTIFICACION_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_FAMILIANOVEDAD.toUpperCase(), FAMILIANOVEDAD_AGENTS);
        roleAgents.put(ROLE_NAME_TIPOIDENTIFICACION.toUpperCase(), TIPOIDENTIFICACION_AGENTS);
        roleAgents.put(ROLE_NAME_PARENTESCO.toUpperCase(), PARENTESCO_AGENTS);
        roleAgents.put(ROLE_NAME_ESTADOBENEFICIARIO.toUpperCase(), ESTADOBENEFICIARIO_AGENTS);
        roleAgents.put(ROLE_NAME_PARENTESCONUEVO.toUpperCase(), PARENTESCONUEVO_AGENTS);
        roleAgents.put(ROLE_NAME_TIPOIDENTIFICACIONCD.toUpperCase(), TIPOIDENTIFICACIONCD_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'UsuarioNovedad', it returns the identification keys
     * - If className is a facet of the inheritance net of 'UsuarioNovedad', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_USUARIONOVEDADIDUSUARIONOVEDAD);
        }
        // Facet 'UsuarioNovedad' (This facet)
        if (UsuarioNovedadConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_USUARIONOVEDADIDUSUARIONOVEDAD);
        }
        return returnList;
    }
}
