package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>UsuarioReg</code> model class.
 */
public final class UsuarioRegConstants {

    private UsuarioRegConstants() {

    }

    // Class
    /** <code>UsuarioReg</code> class id. */
    public static final String CLASS_ID = "Clas_1433848250368895_Alias";
    /** <code>UsuarioReg</code> class name. */
    public static final String CLASS_NAME = "UsuarioReg";
    /** <code>UsuarioReg</code> class alias. */
    public static final String CLASS_ALIAS = "Usuario";
    /** <code>UsuarioReg</code> class table name. */
    public static final String TBL_NAME = "UsuarioReg";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "aesolicitudesidsolicitud,usuarioRegIdentificador,estadoBeneficiarioCodigo,parentescoParentescoCodigo,usuarioRegTipoIdentificacion,usuarioRegNumIdentificacion,usuarioRegTipoYNumDoc,usuarioRegPrimerNombre,usuarioRegSegundoNombre,usuarioRegPrimerApellido,usuarioRegSegundoApellido,usuarioRegNumUsuario,usuarioRegFechaInicioVigencia,usuarioRegFechaFinVigencia,usuarioRegGenero,usuarioRegFechaNacimiento";

    public static final String DSDSUSUARIOREGPIU = "DS_UsuarioReg_PIU";
    

    // Attribute (usuarioRegIdentificador)
    /** <code>usuarioRegIdentificador</code> attribute id. */
    public static final String ATTR_ID_USUARIOREGIDENTIFICADOR = "Clas_1433848250368895Atr_1_Alias";
    /** <code>usuarioRegIdentificador</code> attribute name. */
    public static final String ATTR_NAME_USUARIOREGIDENTIFICADOR = "usuarioRegIdentificador";
    /** <code>usuarioRegIdentificador</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOREGIDENTIFICADOR = "Identificador";

    /** <code>usuarioRegIdentificador</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOREGIDENTIFICADOR = "";
    /** Agents allowed to view the attribute usuarioRegIdentificador **/
    public static final String USUARIOREGIDENTIFICADOR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioRegTipoIdentificacion)
    /** <code>usuarioRegTipoIdentificacion</code> attribute id. */
    public static final String ATTR_ID_USUARIOREGTIPOIDENTIFICACION = "Clas_1433848250368895Atr_2_Alias";
    /** <code>usuarioRegTipoIdentificacion</code> attribute name. */
    public static final String ATTR_NAME_USUARIOREGTIPOIDENTIFICACION = "usuarioRegTipoIdentificacion";
    /** <code>usuarioRegTipoIdentificacion</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOREGTIPOIDENTIFICACION = "Tipo identificación";

    /** <code>usuarioRegTipoIdentificacion</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOREGTIPOIDENTIFICACION = "";
    /** Agents allowed to view the attribute usuarioRegTipoIdentificacion **/
    public static final String USUARIOREGTIPOIDENTIFICACION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioRegNumIdentificacion)
    /** <code>usuarioRegNumIdentificacion</code> attribute id. */
    public static final String ATTR_ID_USUARIOREGNUMIDENTIFICACION = "Clas_1433848250368895Atr_3_Alias";
    /** <code>usuarioRegNumIdentificacion</code> attribute name. */
    public static final String ATTR_NAME_USUARIOREGNUMIDENTIFICACION = "usuarioRegNumIdentificacion";
    /** <code>usuarioRegNumIdentificacion</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOREGNUMIDENTIFICACION = "Nº Identificación";

    /** <code>usuarioRegNumIdentificacion</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOREGNUMIDENTIFICACION = "";
    /** Agents allowed to view the attribute usuarioRegNumIdentificacion **/
    public static final String USUARIOREGNUMIDENTIFICACION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioRegTipoYNumDoc)
    /** <code>usuarioRegTipoYNumDoc</code> attribute id. */
    public static final String ATTR_ID_USUARIOREGTIPOYNUMDOC = "Clas_1433848250368895Atr_4_Alias";
    /** <code>usuarioRegTipoYNumDoc</code> attribute name. */
    public static final String ATTR_NAME_USUARIOREGTIPOYNUMDOC = "usuarioRegTipoYNumDoc";
    /** <code>usuarioRegTipoYNumDoc</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOREGTIPOYNUMDOC = "Tipo y Nº Doc";

    /** <code>usuarioRegTipoYNumDoc</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOREGTIPOYNUMDOC = "";
    /** Agents allowed to view the attribute usuarioRegTipoYNumDoc **/
    public static final String USUARIOREGTIPOYNUMDOC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioRegPrimerNombre)
    /** <code>usuarioRegPrimerNombre</code> attribute id. */
    public static final String ATTR_ID_USUARIOREGPRIMERNOMBRE = "Clas_1433848250368895Atr_5_Alias";
    /** <code>usuarioRegPrimerNombre</code> attribute name. */
    public static final String ATTR_NAME_USUARIOREGPRIMERNOMBRE = "usuarioRegPrimerNombre";
    /** <code>usuarioRegPrimerNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOREGPRIMERNOMBRE = "Primer nombre";

    /** <code>usuarioRegPrimerNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOREGPRIMERNOMBRE = "";
    /** Agents allowed to view the attribute usuarioRegPrimerNombre **/
    public static final String USUARIOREGPRIMERNOMBRE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioRegSegundoNombre)
    /** <code>usuarioRegSegundoNombre</code> attribute id. */
    public static final String ATTR_ID_USUARIOREGSEGUNDONOMBRE = "Clas_1433848250368895Atr_6_Alias";
    /** <code>usuarioRegSegundoNombre</code> attribute name. */
    public static final String ATTR_NAME_USUARIOREGSEGUNDONOMBRE = "usuarioRegSegundoNombre";
    /** <code>usuarioRegSegundoNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOREGSEGUNDONOMBRE = "Segundo nombre";

    /** <code>usuarioRegSegundoNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOREGSEGUNDONOMBRE = "";
    /** Agents allowed to view the attribute usuarioRegSegundoNombre **/
    public static final String USUARIOREGSEGUNDONOMBRE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioRegPrimerApellido)
    /** <code>usuarioRegPrimerApellido</code> attribute id. */
    public static final String ATTR_ID_USUARIOREGPRIMERAPELLIDO = "Clas_1433848250368895Atr_7_Alias";
    /** <code>usuarioRegPrimerApellido</code> attribute name. */
    public static final String ATTR_NAME_USUARIOREGPRIMERAPELLIDO = "usuarioRegPrimerApellido";
    /** <code>usuarioRegPrimerApellido</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOREGPRIMERAPELLIDO = "Primer apellido";

    /** <code>usuarioRegPrimerApellido</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOREGPRIMERAPELLIDO = "";
    /** Agents allowed to view the attribute usuarioRegPrimerApellido **/
    public static final String USUARIOREGPRIMERAPELLIDO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioRegSegundoApellido)
    /** <code>usuarioRegSegundoApellido</code> attribute id. */
    public static final String ATTR_ID_USUARIOREGSEGUNDOAPELLIDO = "Clas_1433848250368895Atr_8_Alias";
    /** <code>usuarioRegSegundoApellido</code> attribute name. */
    public static final String ATTR_NAME_USUARIOREGSEGUNDOAPELLIDO = "usuarioRegSegundoApellido";
    /** <code>usuarioRegSegundoApellido</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOREGSEGUNDOAPELLIDO = "Segundo apellido";

    /** <code>usuarioRegSegundoApellido</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOREGSEGUNDOAPELLIDO = "";
    /** Agents allowed to view the attribute usuarioRegSegundoApellido **/
    public static final String USUARIOREGSEGUNDOAPELLIDO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioRegNumUsuario)
    /** <code>usuarioRegNumUsuario</code> attribute id. */
    public static final String ATTR_ID_USUARIOREGNUMUSUARIO = "Clas_1433848250368895Atr_11_Alias";
    /** <code>usuarioRegNumUsuario</code> attribute name. */
    public static final String ATTR_NAME_USUARIOREGNUMUSUARIO = "usuarioRegNumUsuario";
    /** <code>usuarioRegNumUsuario</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOREGNUMUSUARIO = "Nº";

    /** <code>usuarioRegNumUsuario</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOREGNUMUSUARIO = "";
    /** Agents allowed to view the attribute usuarioRegNumUsuario **/
    public static final String USUARIOREGNUMUSUARIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioRegFechaInicioVigencia)
    /** <code>usuarioRegFechaInicioVigencia</code> attribute id. */
    public static final String ATTR_ID_USUARIOREGFECHAINICIOVIGENCIA = "Clas_1433848250368895Atr_12_Alias";
    /** <code>usuarioRegFechaInicioVigencia</code> attribute name. */
    public static final String ATTR_NAME_USUARIOREGFECHAINICIOVIGENCIA = "usuarioRegFechaInicioVigencia";
    /** <code>usuarioRegFechaInicioVigencia</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOREGFECHAINICIOVIGENCIA = "Fecha inicio vigencia";

    /** <code>usuarioRegFechaInicioVigencia</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOREGFECHAINICIOVIGENCIA = "";
    /** Agents allowed to view the attribute usuarioRegFechaInicioVigencia **/
    public static final String USUARIOREGFECHAINICIOVIGENCIA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioRegFechaFinVigencia)
    /** <code>usuarioRegFechaFinVigencia</code> attribute id. */
    public static final String ATTR_ID_USUARIOREGFECHAFINVIGENCIA = "Clas_1433848250368895Atr_13_Alias";
    /** <code>usuarioRegFechaFinVigencia</code> attribute name. */
    public static final String ATTR_NAME_USUARIOREGFECHAFINVIGENCIA = "usuarioRegFechaFinVigencia";
    /** <code>usuarioRegFechaFinVigencia</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOREGFECHAFINVIGENCIA = "Fecha fin vigencia";

    /** <code>usuarioRegFechaFinVigencia</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOREGFECHAFINVIGENCIA = "";
    /** Agents allowed to view the attribute usuarioRegFechaFinVigencia **/
    public static final String USUARIOREGFECHAFINVIGENCIA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioRegGenero)
    /** <code>usuarioRegGenero</code> attribute id. */
    public static final String ATTR_ID_USUARIOREGGENERO = "Clas_1433848250368895Atr_14_Alias";
    /** <code>usuarioRegGenero</code> attribute name. */
    public static final String ATTR_NAME_USUARIOREGGENERO = "usuarioRegGenero";
    /** <code>usuarioRegGenero</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOREGGENERO = "Género";

    /** <code>usuarioRegGenero</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOREGGENERO = "";
    /** Agents allowed to view the attribute usuarioRegGenero **/
    public static final String USUARIOREGGENERO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioRegFechaNacimiento)
    /** <code>usuarioRegFechaNacimiento</code> attribute id. */
    public static final String ATTR_ID_USUARIOREGFECHANACIMIENTO = "Clas_1433848250368895Atr_15_Alias";
    /** <code>usuarioRegFechaNacimiento</code> attribute name. */
    public static final String ATTR_NAME_USUARIOREGFECHANACIMIENTO = "usuarioRegFechaNacimiento";
    /** <code>usuarioRegFechaNacimiento</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOREGFECHANACIMIENTO = "Fecha nacimiento";

    /** <code>usuarioRegFechaNacimiento</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOREGFECHANACIMIENTO = "";
    /** Agents allowed to view the attribute usuarioRegFechaNacimiento **/
    public static final String USUARIOREGFECHANACIMIENTO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (usuarioRegdrvEdad)
    /** <code>usuarioRegdrvEdad</code> attribute id. */
    public static final String ATTR_ID_USUARIOREGDRVEDAD = "Clas_1433848250368895Atr_16_Alias";
    /** <code>usuarioRegdrvEdad</code> attribute name. */
    public static final String ATTR_NAME_USUARIOREGDRVEDAD = "usuarioRegdrvEdad";
    /** <code>usuarioRegdrvEdad</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOREGDRVEDAD = "Edad";

    /** <code>usuarioRegdrvEdad</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOREGDRVEDAD = "";
    /** Agents allowed to view the attribute usuarioRegdrvEdad **/
    public static final String USUARIOREGDRVEDAD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

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
    public static final String FLD_USUARIOREGIDENTIFICADOR = "Identificador";    
    /** <code>usuarioRegIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOREGIDENTIFICADOR = "usuarioRegIdentificador";
    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_ESTADOBENEFICIARIOCODIGO = "Codigo";    
    /** <code>EstadoBeneficiario.estadoBeneficiarioCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_ESTADOBENEFICIARIO_ESTADOBENEFICIARIOCODIGO = "estadoBeneficiarioCodigo";
    // Field (Parentesco_Codigo)
    /** <code>Parentesco_Codigo</code> field name. */
    public static final String FLD_PARENTESCOPARENTESCOCODIGO = "Parentesco_Codigo";    
    /** <code>Parentesco.parentescoCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_PARENTESCO_PARENTESCOCODIGO = "parentescoParentescoCodigo";
    // Field (TipoIdentificacion)
    /** <code>TipoIdentificacion</code> field name. */
    public static final String FLD_USUARIOREGTIPOIDENTIFICACION = "TipoIdentificacion";    
    /** <code>TipoIdentificacion</code> field length. */
    public static final int FLD_USUARIOREGTIPOIDENTIFICACIONLENGTH = 20;
    /** <code>usuarioRegTipoIdentificacion</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOREGTIPOIDENTIFICACION = "usuarioRegTipoIdentificacion";
    // Field (NumIdentificacion)
    /** <code>NumIdentificacion</code> field name. */
    public static final String FLD_USUARIOREGNUMIDENTIFICACION = "NumIdentificacion";    
    /** <code>NumIdentificacion</code> field length. */
    public static final int FLD_USUARIOREGNUMIDENTIFICACIONLENGTH = 60;
    /** <code>usuarioRegNumIdentificacion</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOREGNUMIDENTIFICACION = "usuarioRegNumIdentificacion";
    // Field (TipoYNumDoc)
    /** <code>TipoYNumDoc</code> field name. */
    public static final String FLD_USUARIOREGTIPOYNUMDOC = "TipoYNumDoc";    
    /** <code>TipoYNumDoc</code> field length. */
    public static final int FLD_USUARIOREGTIPOYNUMDOCLENGTH = 80;
    /** <code>usuarioRegTipoYNumDoc</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOREGTIPOYNUMDOC = "usuarioRegTipoYNumDoc";
    // Field (PrimerNombre)
    /** <code>PrimerNombre</code> field name. */
    public static final String FLD_USUARIOREGPRIMERNOMBRE = "PrimerNombre";    
    /** <code>PrimerNombre</code> field length. */
    public static final int FLD_USUARIOREGPRIMERNOMBRELENGTH = 50;
    /** <code>usuarioRegPrimerNombre</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOREGPRIMERNOMBRE = "usuarioRegPrimerNombre";
    // Field (SegundoNombre)
    /** <code>SegundoNombre</code> field name. */
    public static final String FLD_USUARIOREGSEGUNDONOMBRE = "SegundoNombre";    
    /** <code>SegundoNombre</code> field length. */
    public static final int FLD_USUARIOREGSEGUNDONOMBRELENGTH = 50;
    /** <code>usuarioRegSegundoNombre</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOREGSEGUNDONOMBRE = "usuarioRegSegundoNombre";
    // Field (PrimerApellido)
    /** <code>PrimerApellido</code> field name. */
    public static final String FLD_USUARIOREGPRIMERAPELLIDO = "PrimerApellido";    
    /** <code>PrimerApellido</code> field length. */
    public static final int FLD_USUARIOREGPRIMERAPELLIDOLENGTH = 50;
    /** <code>usuarioRegPrimerApellido</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOREGPRIMERAPELLIDO = "usuarioRegPrimerApellido";
    // Field (SegundoApellido)
    /** <code>SegundoApellido</code> field name. */
    public static final String FLD_USUARIOREGSEGUNDOAPELLIDO = "SegundoApellido";    
    /** <code>SegundoApellido</code> field length. */
    public static final int FLD_USUARIOREGSEGUNDOAPELLIDOLENGTH = 50;
    /** <code>usuarioRegSegundoApellido</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOREGSEGUNDOAPELLIDO = "usuarioRegSegundoApellido";
    // Field (NumUsuario)
    /** <code>NumUsuario</code> field name. */
    public static final String FLD_USUARIOREGNUMUSUARIO = "NumUsuario";    
    /** <code>usuarioRegNumUsuario</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOREGNUMUSUARIO = "usuarioRegNumUsuario";
    // Field (FechaInicioVigencia)
    /** <code>FechaInicioVigencia</code> field name. */
    public static final String FLD_USUARIOREGFECHAINICIOVIGENCIA = "FechaInicioVigencia";    
    /** <code>usuarioRegFechaInicioVigencia</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOREGFECHAINICIOVIGENCIA = "usuarioRegFechaInicioVigencia";
    // Field (FechaFinVigencia)
    /** <code>FechaFinVigencia</code> field name. */
    public static final String FLD_USUARIOREGFECHAFINVIGENCIA = "FechaFinVigencia";    
    /** <code>usuarioRegFechaFinVigencia</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOREGFECHAFINVIGENCIA = "usuarioRegFechaFinVigencia";
    // Field (Genero)
    /** <code>Genero</code> field name. */
    public static final String FLD_USUARIOREGGENERO = "Genero";    
    /** <code>Genero</code> field length. */
    public static final int FLD_USUARIOREGGENEROLENGTH = 1;
    /** <code>usuarioRegGenero</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOREGGENERO = "usuarioRegGenero";
    // Field (FechaNacimiento)
    /** <code>FechaNacimiento</code> field name. */
    public static final String FLD_USUARIOREGFECHANACIMIENTO = "FechaNacimiento";    
    /** <code>usuarioRegFechaNacimiento</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOREGFECHANACIMIENTO = "usuarioRegFechaNacimiento";

    // Component role (Solicitud)
    /** <code>Solicitud</code> role id. */
    public static final String ROLE_ID_SOLICITUD = "Agr_1433848250368960_Alias";
    /** <code>Solicitud</code> role name. */
    public static final String ROLE_NAME_SOLICITUD = "solicitud";
    /** <code>Solicitud</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUD = "Solicitud";

    /** <code>Solicitud</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUD = SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS;
    /** <code>Solicitud</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUD = "";
    /** <code>Solicitud</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUD = SolicitudConstants.CLASS_NAME;

    /** Agents allowed to navigate through Solicitud **/
    public static final String SOLICITUD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (EstadoBeneficiario)
    /** <code>EstadoBeneficiario</code> role id. */
    public static final String ROLE_ID_ESTADOBENEFICIARIO = "Agr_1433943015424284_Alias";
    /** <code>EstadoBeneficiario</code> role name. */
    public static final String ROLE_NAME_ESTADOBENEFICIARIO = "estadoBeneficiario";
    /** <code>EstadoBeneficiario</code> role alias. */
    public static final String ROLE_ALIAS_ESTADOBENEFICIARIO = "Estado beneficiario";

    /** <code>EstadoBeneficiario</code> inverse role name. */
    public static final String ROLE_INVNAME_ESTADOBENEFICIARIO = EstadoBeneficiarioConstants.ROLE_NAME_USUARIOSREG;
    /** <code>EstadoBeneficiario</code> role facet sequence. */
    public static final String PATH_FACETS_ESTADOBENEFICIARIO = "";
    /** <code>EstadoBeneficiario</code> role target class. */
    public static final String ROLE_TARGET_ESTADOBENEFICIARIO = EstadoBeneficiarioConstants.CLASS_NAME;

    /** Agents allowed to navigate through EstadoBeneficiario **/
    public static final String ESTADOBENEFICIARIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Parentesco)
    /** <code>Parentesco</code> role id. */
    public static final String ROLE_ID_PARENTESCO = "Agr_1434655129600852_Alias";
    /** <code>Parentesco</code> role name. */
    public static final String ROLE_NAME_PARENTESCO = "parentesco";
    /** <code>Parentesco</code> role alias. */
    public static final String ROLE_ALIAS_PARENTESCO = "Parentesco";

    /** <code>Parentesco</code> inverse role name. */
    public static final String ROLE_INVNAME_PARENTESCO = ParentescoConstants.ROLE_NAME_USUARIOSREG;
    /** <code>Parentesco</code> role facet sequence. */
    public static final String PATH_FACETS_PARENTESCO = "";
    /** <code>Parentesco</code> role target class. */
    public static final String ROLE_TARGET_PARENTESCO = ParentescoConstants.CLASS_NAME;

    /** Agents allowed to navigate through Parentesco **/
    public static final String PARENTESCO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1433848250368895Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioRegcrearpagrParentesco</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOREGCREARPAGRPARENTESCO = "p_agrParentesco";
    /** <code>usuarioRegcrearpagrParentesco</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOREGCREARPAGRPARENTESCO = "Clas_1433848250368895Ser_1Arg_17_Alias";
    /** <code>usuarioRegcrearpagrParentesco</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOREGCREARPAGRPARENTESCO = "Parentesco";
    /** <code>usuarioRegcrearpagrEstadoBeneficiario</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOREGCREARPAGRESTADOBENEFICIARIO = "p_agrEstadoBeneficiario";
    /** <code>usuarioRegcrearpagrEstadoBeneficiario</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOREGCREARPAGRESTADOBENEFICIARIO = "Clas_1433848250368895Ser_1Arg_18_Alias";
    /** <code>usuarioRegcrearpagrEstadoBeneficiario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOREGCREARPAGRESTADOBENEFICIARIO = "Estado beneficiario";
    /** <code>usuarioRegcrearpagrSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOREGCREARPAGRSOLICITUD = "p_agrSolicitud";
    /** <code>usuarioRegcrearpagrSolicitud</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOREGCREARPAGRSOLICITUD = "Clas_1433848250368895Ser_1Arg_26_Alias";
    /** <code>usuarioRegcrearpagrSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOREGCREARPAGRSOLICITUD = "Solicitud";
    /** <code>usuarioRegcrearpatrTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOREGCREARPATRTIPOIDENTIFICACION = "p_atrTipoIdentificacion";
    /** <code>usuarioRegcrearpatrTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOREGCREARPATRTIPOIDENTIFICACION = "Clas_1433848250368895Ser_1Arg_3_Alias";
    /** <code>usuarioRegcrearpatrTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOREGCREARPATRTIPOIDENTIFICACION = "Tipo identificación";
    /** <code>usuarioRegcrearpatrNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOREGCREARPATRNUMIDENTIFICACION = "p_atrNumIdentificacion";
    /** <code>usuarioRegcrearpatrNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOREGCREARPATRNUMIDENTIFICACION = "Clas_1433848250368895Ser_1Arg_4_Alias";
    /** <code>usuarioRegcrearpatrNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOREGCREARPATRNUMIDENTIFICACION = "Nº Identificación";
    /** <code>usuarioRegcrearpatrPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOREGCREARPATRPRIMERNOMBRE = "p_atrPrimerNombre";
    /** <code>usuarioRegcrearpatrPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOREGCREARPATRPRIMERNOMBRE = "Clas_1433848250368895Ser_1Arg_5_Alias";
    /** <code>usuarioRegcrearpatrPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOREGCREARPATRPRIMERNOMBRE = "Primer nombre";
    /** <code>usuarioRegcrearpatrSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOREGCREARPATRSEGUNDONOMBRE = "p_atrSegundoNombre";
    /** <code>usuarioRegcrearpatrSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOREGCREARPATRSEGUNDONOMBRE = "Clas_1433848250368895Ser_1Arg_6_Alias";
    /** <code>usuarioRegcrearpatrSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOREGCREARPATRSEGUNDONOMBRE = "Segundo nombre";
    /** <code>usuarioRegcrearpatrPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOREGCREARPATRPRIMERAPELLIDO = "p_atrPrimerApellido";
    /** <code>usuarioRegcrearpatrPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOREGCREARPATRPRIMERAPELLIDO = "Clas_1433848250368895Ser_1Arg_7_Alias";
    /** <code>usuarioRegcrearpatrPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOREGCREARPATRPRIMERAPELLIDO = "Primer apellido";
    /** <code>usuarioRegcrearpatrSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOREGCREARPATRSEGUNDOAPELLIDO = "p_atrSegundoApellido";
    /** <code>usuarioRegcrearpatrSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOREGCREARPATRSEGUNDOAPELLIDO = "Clas_1433848250368895Ser_1Arg_8_Alias";
    /** <code>usuarioRegcrearpatrSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOREGCREARPATRSEGUNDOAPELLIDO = "Segundo apellido";
    /** <code>usuarioRegcrearpatrNumUsuario</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOREGCREARPATRNUMUSUARIO = "p_atrNumUsuario";
    /** <code>usuarioRegcrearpatrNumUsuario</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOREGCREARPATRNUMUSUARIO = "Clas_1433848250368895Ser_1Arg_12_Alias";
    /** <code>usuarioRegcrearpatrNumUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOREGCREARPATRNUMUSUARIO = "Nº";
    /** <code>usuarioRegcrearpatrFechaInicioVigencia</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOREGCREARPATRFECHAINICIOVIGENCIA = "p_atrFechaInicioVigencia";
    /** <code>usuarioRegcrearpatrFechaInicioVigencia</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOREGCREARPATRFECHAINICIOVIGENCIA = "Clas_1433848250368895Ser_1Arg_14_Alias";
    /** <code>usuarioRegcrearpatrFechaInicioVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOREGCREARPATRFECHAINICIOVIGENCIA = "Fecha inicio vigencia";
    /** <code>usuarioRegcrearpatrFechaFinVigencia</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOREGCREARPATRFECHAFINVIGENCIA = "p_atrFechaFinVigencia";
    /** <code>usuarioRegcrearpatrFechaFinVigencia</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOREGCREARPATRFECHAFINVIGENCIA = "Clas_1433848250368895Ser_1Arg_15_Alias";
    /** <code>usuarioRegcrearpatrFechaFinVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOREGCREARPATRFECHAFINVIGENCIA = "Fecha fin vigencia";
    /** <code>usuarioRegcrearpatrGenero</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOREGCREARPATRGENERO = "p_atrGenero";
    /** <code>usuarioRegcrearpatrGenero</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOREGCREARPATRGENERO = "Clas_1433848250368895Ser_1Arg_16_Alias";
    /** <code>usuarioRegcrearpatrGenero</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOREGCREARPATRGENERO = "Género";
    /** <code>usuarioRegcrearpatrFechaNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOREGCREARPATRFECHANACIMIENTO = "p_atrFechaNacimiento";
    /** <code>usuarioRegcrearpatrFechaNacimiento</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOREGCREARPATRFECHANACIMIENTO = "Clas_1433848250368895Ser_1Arg_19_Alias";
    /** <code>usuarioRegcrearpatrFechaNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOREGCREARPATRFECHANACIMIENTO = "Fecha nacimiento";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1433848250368895Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioRegeliminarpthisUsuarioReg</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_USUARIOREGELIMINARPTHISUSUARIOREG = "p_thisUsuarioReg";
    /** <code>usuarioRegeliminarpthisUsuarioReg</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_USUARIOREGELIMINARPTHISUSUARIOREG = "Clas_1433848250368895Ser_2Arg_1_Alias";
    /** <code>usuarioRegeliminarpthisUsuarioReg</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_USUARIOREGELIMINARPTHISUSUARIOREG = "Usuario";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1433848250368895Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioRegmodificarpthisUsuarioReg</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_USUARIOREGMODIFICARPTHISUSUARIOREG = "p_thisUsuarioReg";
    /** <code>usuarioRegmodificarpthisUsuarioReg</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_USUARIOREGMODIFICARPTHISUSUARIOREG = "Clas_1433848250368895Ser_3Arg_1_Alias";
    /** <code>usuarioRegmodificarpthisUsuarioReg</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_USUARIOREGMODIFICARPTHISUSUARIOREG = "Usuario";
    /** <code>usuarioRegmodificarpTipoYNumDoc</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_USUARIOREGMODIFICARPTIPOYNUMDOC = "p_TipoYNumDoc";
    /** <code>usuarioRegmodificarpTipoYNumDoc</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_USUARIOREGMODIFICARPTIPOYNUMDOC = "Clas_1433848250368895Ser_3Arg_2_Alias";
    /** <code>usuarioRegmodificarpTipoYNumDoc</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_USUARIOREGMODIFICARPTIPOYNUMDOC = "Tipo y Nº Doc";
    // Service (TCREAR)
    /** <code>TCREAR</code> service id. */
    public static final String SERV_ID_TCREAR = "Clas_1433848250368895Ser_4_Alias";
    /** <code>TCREAR</code> service name. */
    public static final String SERV_NAME_TCREAR = "TCREAR";
    /** <code>TCREAR</code> service alias. */
    public static final String SERV_ALIAS_TCREAR = "Crear";
    /** Agents allowed to execute the service TCREAR **/
    public static final String TCREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>usuarioRegTCREARptpagrSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_USUARIOREGTCREARPTPAGRSOLICITUD = "pt_p_agrSolicitud";
    /** <code>usuarioRegTCREARptpagrSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_USUARIOREGTCREARPTPAGRSOLICITUD = "Clas_1433848250368895Ser_4Arg_3_Alias";
    /** <code>usuarioRegTCREARptpagrSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_USUARIOREGTCREARPTPAGRSOLICITUD = "Solicitud";
    /** <code>usuarioRegTCREARptpagrEstadoBeneficiario</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_USUARIOREGTCREARPTPAGRESTADOBENEFICIARIO = "pt_p_agrEstadoBeneficiario";
    /** <code>usuarioRegTCREARptpagrEstadoBeneficiario</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_USUARIOREGTCREARPTPAGRESTADOBENEFICIARIO = "Clas_1433848250368895Ser_4Arg_4_Alias";
    /** <code>usuarioRegTCREARptpagrEstadoBeneficiario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_USUARIOREGTCREARPTPAGRESTADOBENEFICIARIO = "Estado beneficiario";
    /** <code>usuarioRegTCREARptpatrTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_USUARIOREGTCREARPTPATRTIPOIDENTIFICACION = "pt_p_atrTipoIdentificacion";
    /** <code>usuarioRegTCREARptpatrTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_USUARIOREGTCREARPTPATRTIPOIDENTIFICACION = "Clas_1433848250368895Ser_4Arg_5_Alias";
    /** <code>usuarioRegTCREARptpatrTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_USUARIOREGTCREARPTPATRTIPOIDENTIFICACION = "Tipo identificación";
    /** <code>usuarioRegTCREARptpatrNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_USUARIOREGTCREARPTPATRNUMIDENTIFICACION = "pt_p_atrNumIdentificacion";
    /** <code>usuarioRegTCREARptpatrNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_USUARIOREGTCREARPTPATRNUMIDENTIFICACION = "Clas_1433848250368895Ser_4Arg_6_Alias";
    /** <code>usuarioRegTCREARptpatrNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_USUARIOREGTCREARPTPATRNUMIDENTIFICACION = "Nº Identificación";
    /** <code>usuarioRegTCREARptpatrPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_USUARIOREGTCREARPTPATRPRIMERNOMBRE = "pt_p_atrPrimerNombre";
    /** <code>usuarioRegTCREARptpatrPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_USUARIOREGTCREARPTPATRPRIMERNOMBRE = "Clas_1433848250368895Ser_4Arg_7_Alias";
    /** <code>usuarioRegTCREARptpatrPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_USUARIOREGTCREARPTPATRPRIMERNOMBRE = "Primer nombre";
    /** <code>usuarioRegTCREARptpatrSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_USUARIOREGTCREARPTPATRSEGUNDONOMBRE = "pt_p_atrSegundoNombre";
    /** <code>usuarioRegTCREARptpatrSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_USUARIOREGTCREARPTPATRSEGUNDONOMBRE = "Clas_1433848250368895Ser_4Arg_8_Alias";
    /** <code>usuarioRegTCREARptpatrSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_USUARIOREGTCREARPTPATRSEGUNDONOMBRE = "Segundo nombre";
    /** <code>usuarioRegTCREARptpatrPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_USUARIOREGTCREARPTPATRPRIMERAPELLIDO = "pt_p_atrPrimerApellido";
    /** <code>usuarioRegTCREARptpatrPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_USUARIOREGTCREARPTPATRPRIMERAPELLIDO = "Clas_1433848250368895Ser_4Arg_9_Alias";
    /** <code>usuarioRegTCREARptpatrPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_USUARIOREGTCREARPTPATRPRIMERAPELLIDO = "Primer apellido";
    /** <code>usuarioRegTCREARptpatrSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_USUARIOREGTCREARPTPATRSEGUNDOAPELLIDO = "pt_p_atrSegundoApellido";
    /** <code>usuarioRegTCREARptpatrSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_USUARIOREGTCREARPTPATRSEGUNDOAPELLIDO = "Clas_1433848250368895Ser_4Arg_10_Alias";
    /** <code>usuarioRegTCREARptpatrSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_USUARIOREGTCREARPTPATRSEGUNDOAPELLIDO = "Segundo apellido";
    /** <code>usuarioRegTCREARptpatrNumUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_USUARIOREGTCREARPTPATRNUMUSUARIO = "pt_p_atrNumUsuario";
    /** <code>usuarioRegTCREARptpatrNumUsuario</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_USUARIOREGTCREARPTPATRNUMUSUARIO = "Clas_1433848250368895Ser_4Arg_132_Alias";
    /** <code>usuarioRegTCREARptpatrNumUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_USUARIOREGTCREARPTPATRNUMUSUARIO = "Nº";
    /** <code>usuarioRegTCREARptpagrParentesco</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_USUARIOREGTCREARPTPAGRPARENTESCO = "pt_p_agrParentesco";
    /** <code>usuarioRegTCREARptpagrParentesco</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_USUARIOREGTCREARPTPAGRPARENTESCO = "Clas_1433848250368895Ser_4Arg_466_Alias";
    /** <code>usuarioRegTCREARptpagrParentesco</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_USUARIOREGTCREARPTPAGRPARENTESCO = "Parentesco";
    /** <code>usuarioRegTCREARptpatrFechaInicioVigencia</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_USUARIOREGTCREARPTPATRFECHAINICIOVIGENCIA = "pt_p_atrFechaInicioVigencia";
    /** <code>usuarioRegTCREARptpatrFechaInicioVigencia</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_USUARIOREGTCREARPTPATRFECHAINICIOVIGENCIA = "Clas_1433848250368895Ser_4Arg_481_Alias";
    /** <code>usuarioRegTCREARptpatrFechaInicioVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_USUARIOREGTCREARPTPATRFECHAINICIOVIGENCIA = "Fecha inicio vigencia";
    /** <code>usuarioRegTCREARptpatrFechaFinVigencia</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_USUARIOREGTCREARPTPATRFECHAFINVIGENCIA = "pt_p_atrFechaFinVigencia";
    /** <code>usuarioRegTCREARptpatrFechaFinVigencia</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_USUARIOREGTCREARPTPATRFECHAFINVIGENCIA = "Clas_1433848250368895Ser_4Arg_482_Alias";
    /** <code>usuarioRegTCREARptpatrFechaFinVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_USUARIOREGTCREARPTPATRFECHAFINVIGENCIA = "Fecha fin vigencia";
    /** <code>usuarioRegTCREARptpatrGenero</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_USUARIOREGTCREARPTPATRGENERO = "pt_p_atrGenero";
    /** <code>usuarioRegTCREARptpatrGenero</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_USUARIOREGTCREARPTPATRGENERO = "Clas_1433848250368895Ser_4Arg_763_Alias";
    /** <code>usuarioRegTCREARptpatrGenero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_USUARIOREGTCREARPTPATRGENERO = "Género";
    /** <code>usuarioRegTCREARptpatrFechaNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_USUARIOREGTCREARPTPATRFECHANACIMIENTO = "pt_p_atrFechaNacimiento";
    /** <code>usuarioRegTCREARptpatrFechaNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_USUARIOREGTCREARPTPATRFECHANACIMIENTO = "Clas_1433848250368895Ser_4Arg_2741_Alias";
    /** <code>usuarioRegTCREARptpatrFechaNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_USUARIOREGTCREARPTPATRFECHANACIMIENTO = "Fecha nacimiento";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_USUARIOREGTIPOIDENTIFICACION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOREGNUMIDENTIFICACION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOREGTIPOYNUMDOC.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOREGPRIMERNOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOREGSEGUNDONOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOREGPRIMERAPELLIDO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOREGSEGUNDOAPELLIDO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOREGNUMUSUARIO.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOREGFECHAINICIOVIGENCIA.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOREGFECHAFINVIGENCIA.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOREGGENERO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOREGFECHANACIMIENTO.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_USUARIOREGDRVEDAD.toUpperCase(), Constants.Type.INT.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_USUARIOREGIDENTIFICADOR.toUpperCase(), USUARIOREGIDENTIFICADOR_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOREGTIPOIDENTIFICACION.toUpperCase(), USUARIOREGTIPOIDENTIFICACION_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOREGNUMIDENTIFICACION.toUpperCase(), USUARIOREGNUMIDENTIFICACION_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOREGTIPOYNUMDOC.toUpperCase(), USUARIOREGTIPOYNUMDOC_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOREGPRIMERNOMBRE.toUpperCase(), USUARIOREGPRIMERNOMBRE_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOREGSEGUNDONOMBRE.toUpperCase(), USUARIOREGSEGUNDONOMBRE_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOREGPRIMERAPELLIDO.toUpperCase(), USUARIOREGPRIMERAPELLIDO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOREGSEGUNDOAPELLIDO.toUpperCase(), USUARIOREGSEGUNDOAPELLIDO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOREGNUMUSUARIO.toUpperCase(), USUARIOREGNUMUSUARIO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOREGFECHAINICIOVIGENCIA.toUpperCase(), USUARIOREGFECHAINICIOVIGENCIA_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOREGFECHAFINVIGENCIA.toUpperCase(), USUARIOREGFECHAFINVIGENCIA_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOREGGENERO.toUpperCase(), USUARIOREGGENERO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOREGFECHANACIMIENTO.toUpperCase(), USUARIOREGFECHANACIMIENTO_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOREGDRVEDAD.toUpperCase(), USUARIOREGDRVEDAD_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_SOLICITUD.toUpperCase(), SOLICITUD_AGENTS);
        roleAgents.put(ROLE_NAME_ESTADOBENEFICIARIO.toUpperCase(), ESTADOBENEFICIARIO_AGENTS);
        roleAgents.put(ROLE_NAME_PARENTESCO.toUpperCase(), PARENTESCO_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'UsuarioReg', it returns the identification keys
     * - If className is a facet of the inheritance net of 'UsuarioReg', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_FIELD_AESOLICITUDESIDSOLICITUD);
            returnList.add(ATTR_FIELD_USUARIOREGIDENTIFICADOR);
        }
        // Facet 'UsuarioReg' (This facet)
        if (UsuarioRegConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ROLE_NAME_SOLICITUD + "." + SolicitudConstants.ROLE_NAME_AESOLICITUDES + "." + AesolicitudesConstants.ATTR_FIELD_AESOLICITUDESIDSOLICITUD);
            returnList.add(ATTR_FIELD_USUARIOREGIDENTIFICADOR);
        }
        return returnList;
    }
}
