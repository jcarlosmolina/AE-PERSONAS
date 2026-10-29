package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>Direccion</code> model class.
 */
public final class DireccionConstants {

    private DireccionConstants() {

    }

    // Class
    /** <code>Direccion</code> class id. */
    public static final String CLASS_ID = "Clas_1432205131776562_Alias";
    /** <code>Direccion</code> class name. */
    public static final String CLASS_NAME = "Direccion";
    /** <code>Direccion</code> class alias. */
    public static final String CLASS_ALIAS = "Dirección";
    /** <code>Direccion</code> class table name. */
    public static final String TBL_NAME = "Direccion";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "direccionIdentificador,personaPersonaIdentificador,tipoDireccionTipoDireccionCodigo,municipioMunicipioCodigo,departamentoDepartamentoCodigo,paisPaisCodigo,aesolicitudesidsolicitud,aesolicitudesTitularidsolicitud,direccionCodigo,direccionDireccionCompleta,direccionRural";

    public static final String DSICDIRECCION = "IC_Direccion";
    public static final String DSDSDIRECCIONNULL = "DS_Direccion_Null";
    

    // Attribute (direccionIdentificador)
    /** <code>direccionIdentificador</code> attribute id. */
    public static final String ATTR_ID_DIRECCIONIDENTIFICADOR = "Clas_1432205131776562Atr_5_Alias";
    /** <code>direccionIdentificador</code> attribute name. */
    public static final String ATTR_NAME_DIRECCIONIDENTIFICADOR = "direccionIdentificador";
    /** <code>direccionIdentificador</code> attribute alias. */
    public static final String ATTR_ALIAS_DIRECCIONIDENTIFICADOR = "Identificador";

    /** <code>direccionIdentificador</code> attribute facet sequence. */
    public static final String PATH_FACETS_DIRECCIONIDENTIFICADOR = "";
    /** Agents allowed to view the attribute direccionIdentificador **/
    public static final String DIRECCIONIDENTIFICADOR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (direccionCodigo)
    /** <code>direccionCodigo</code> attribute id. */
    public static final String ATTR_ID_DIRECCIONCODIGO = "Clas_1432205131776562Atr_1_Alias";
    /** <code>direccionCodigo</code> attribute name. */
    public static final String ATTR_NAME_DIRECCIONCODIGO = "direccionCodigo";
    /** <code>direccionCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_DIRECCIONCODIGO = "Código";

    /** <code>direccionCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_DIRECCIONCODIGO = "";
    /** Agents allowed to view the attribute direccionCodigo **/
    public static final String DIRECCIONCODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (direccionDireccionCompleta)
    /** <code>direccionDireccionCompleta</code> attribute id. */
    public static final String ATTR_ID_DIRECCIONDIRECCIONCOMPLETA = "Clas_1432205131776562Atr_2_Alias";
    /** <code>direccionDireccionCompleta</code> attribute name. */
    public static final String ATTR_NAME_DIRECCIONDIRECCIONCOMPLETA = "direccionDireccionCompleta";
    /** <code>direccionDireccionCompleta</code> attribute alias. */
    public static final String ATTR_ALIAS_DIRECCIONDIRECCIONCOMPLETA = "Dirección completa";

    /** <code>direccionDireccionCompleta</code> attribute facet sequence. */
    public static final String PATH_FACETS_DIRECCIONDIRECCIONCOMPLETA = "";
    /** Agents allowed to view the attribute direccionDireccionCompleta **/
    public static final String DIRECCIONDIRECCIONCOMPLETA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (direccionRural)
    /** <code>direccionRural</code> attribute id. */
    public static final String ATTR_ID_DIRECCIONRURAL = "Clas_1432205131776562Atr_4_Alias";
    /** <code>direccionRural</code> attribute name. */
    public static final String ATTR_NAME_DIRECCIONRURAL = "direccionRural";
    /** <code>direccionRural</code> attribute alias. */
    public static final String ATTR_ALIAS_DIRECCIONRURAL = "Rural";

    /** <code>direccionRural</code> attribute facet sequence. */
    public static final String PATH_FACETS_DIRECCIONRURAL = "";
    /** Agents allowed to view the attribute direccionRural **/
    public static final String DIRECCIONRURAL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Identificador)
    /** <code>Identificador</code> field name. */
    public static final String FLD_DIRECCIONIDENTIFICADOR = "Identificador";    
    /** <code>direccionIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_DIRECCIONIDENTIFICADOR = "direccionIdentificador";
    // Field (Persona_Identificador)
    /** <code>Persona_Identificador</code> field name. */
    public static final String FLD_PERSONAPERSONAIDENTIFICADOR = "Persona_Identificador";    
    /** <code>Persona.personaIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONA_PERSONAIDENTIFICADOR = "personaPersonaIdentificador";
    // Field (TipoDireccion_Codigo)
    /** <code>TipoDireccion_Codigo</code> field name. */
    public static final String FLD_TIPODIRECCIONTIPODIRECCIONCODIGO = "TipoDireccion_Codigo";    
    /** <code>TipoDireccion.tipoDireccionCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_TIPODIRECCION_TIPODIRECCIONCODIGO = "tipoDireccionTipoDireccionCodigo";
    // Field (Municipio_Codigo)
    /** <code>Municipio_Codigo</code> field name. */
    public static final String FLD_MUNICIPIOMUNICIPIOCODIGO = "Municipio_Codigo";    
    /** <code>Municipio.municipioCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_MUNICIPIO_MUNICIPIOCODIGO = "municipioMunicipioCodigo";
    // Field (Departamento_Codigo)
    /** <code>Departamento_Codigo</code> field name. */
    public static final String FLD_DEPARTAMENTODEPARTAMENTOCODIGO = "Departamento_Codigo";    
    /** <code>Departamento.departamentoCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_DEPARTAMENTO_DEPARTAMENTOCODIGO = "departamentoDepartamentoCodigo";
    // Field (Pais_Codigo)
    /** <code>Pais_Codigo</code> field name. */
    public static final String FLD_PAISPAISCODIGO = "Pais_Codigo";    
    /** <code>Pais_Codigo</code> field length. */
    public static final int FLD_PAISPAISCODIGOLENGTH = 10;
    /** <code>Pais.paisCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_PAIS_PAISCODIGO = "paisPaisCodigo";
    // Field (id_solicitud)
    /** <code>id_solicitud</code> field name. */
    public static final String FLD_AESOLICITUDESIDSOLICITUD = "id_solicitud";    
    /** <code>Contrato.Ae_solicitudes.aesolicitudesidsolicitud</code> attribute field name. */
    public static final String ATTR_FIELD_CONTRATO_AE_SOLICITUDES_AESOLICITUDESIDSOLICITUD = "aesolicitudesidsolicitud";
    // Field (Titular_id_solicitud)
    /** <code>Titular_id_solicitud</code> field name. */
    public static final String FLD_AESOLICITUDESTITULARIDSOLICITUD = "Titular_id_solicitud";    
    /** <code>Titular.Solicitud.Ae_solicitudes.aesolicitudesidsolicitud</code> attribute field name. */
    public static final String ATTR_FIELD_TITULAR_SOLICITUD_AE_SOLICITUDES_AESOLICITUDESIDSOLICITUD = "aesolicitudesTitularidsolicitud";
    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_DIRECCIONCODIGO = "Codigo";    
    /** <code>direccionCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_DIRECCIONCODIGO = "direccionCodigo";
    // Field (DireccionCompleta)
    /** <code>DireccionCompleta</code> field name. */
    public static final String FLD_DIRECCIONDIRECCIONCOMPLETA = "DireccionCompleta";    
    /** <code>DireccionCompleta</code> field length. */
    public static final int FLD_DIRECCIONDIRECCIONCOMPLETALENGTH = 250;
    /** <code>direccionDireccionCompleta</code> attribute field name. */
    public static final String ATTR_FIELD_DIRECCIONDIRECCIONCOMPLETA = "direccionDireccionCompleta";
    // Field (Rural)
    /** <code>Rural</code> field name. */
    public static final String FLD_DIRECCIONRURAL = "Rural";    
    /** <code>direccionRural</code> attribute field name. */
    public static final String ATTR_FIELD_DIRECCIONRURAL = "direccionRural";

    // Component role (Persona)
    /** <code>Persona</code> role id. */
    public static final String ROLE_ID_PERSONA = "Agr_1432205131776715_Alias";
    /** <code>Persona</code> role name. */
    public static final String ROLE_NAME_PERSONA = "persona";
    /** <code>Persona</code> role alias. */
    public static final String ROLE_ALIAS_PERSONA = "Persona";

    /** <code>Persona</code> inverse role name. */
    public static final String ROLE_INVNAME_PERSONA = PersonaConstants.ROLE_NAME_DIRECCIONES;
    /** <code>Persona</code> role facet sequence. */
    public static final String PATH_FACETS_PERSONA = "";
    /** <code>Persona</code> role target class. */
    public static final String ROLE_TARGET_PERSONA = PersonaConstants.CLASS_NAME;

    /** Agents allowed to navigate through Persona **/
    public static final String PERSONA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (TipoDireccion)
    /** <code>TipoDireccion</code> role id. */
    public static final String ROLE_ID_TIPODIRECCION = "Agr_1432205131776694_Alias";
    /** <code>TipoDireccion</code> role name. */
    public static final String ROLE_NAME_TIPODIRECCION = "tipoDireccion";
    /** <code>TipoDireccion</code> role alias. */
    public static final String ROLE_ALIAS_TIPODIRECCION = "Tipo dirección";

    /** <code>TipoDireccion</code> inverse role name. */
    public static final String ROLE_INVNAME_TIPODIRECCION = TipoDireccionConstants.ROLE_NAME_DIRECCIONES;
    /** <code>TipoDireccion</code> role facet sequence. */
    public static final String PATH_FACETS_TIPODIRECCION = "";
    /** <code>TipoDireccion</code> role target class. */
    public static final String ROLE_TARGET_TIPODIRECCION = TipoDireccionConstants.CLASS_NAME;

    /** Agents allowed to navigate through TipoDireccion **/
    public static final String TIPODIRECCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Municipio)
    /** <code>Municipio</code> role id. */
    public static final String ROLE_ID_MUNICIPIO = "Agr_1432206180352927_Alias";
    /** <code>Municipio</code> role name. */
    public static final String ROLE_NAME_MUNICIPIO = "municipio";
    /** <code>Municipio</code> role alias. */
    public static final String ROLE_ALIAS_MUNICIPIO = "Municipio";

    /** <code>Municipio</code> inverse role name. */
    public static final String ROLE_INVNAME_MUNICIPIO = MunicipioConstants.ROLE_NAME_DIRECCIONES;
    /** <code>Municipio</code> role facet sequence. */
    public static final String PATH_FACETS_MUNICIPIO = "";
    /** <code>Municipio</code> role target class. */
    public static final String ROLE_TARGET_MUNICIPIO = MunicipioConstants.CLASS_NAME;

    /** Agents allowed to navigate through Municipio **/
    public static final String MUNICIPIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Departamento)
    /** <code>Departamento</code> role id. */
    public static final String ROLE_ID_DEPARTAMENTO = "Agr_1432206180352739_Alias";
    /** <code>Departamento</code> role name. */
    public static final String ROLE_NAME_DEPARTAMENTO = "departamento";
    /** <code>Departamento</code> role alias. */
    public static final String ROLE_ALIAS_DEPARTAMENTO = "Departamento";

    /** <code>Departamento</code> inverse role name. */
    public static final String ROLE_INVNAME_DEPARTAMENTO = DepartamentoConstants.ROLE_NAME_DIRECCIONES;
    /** <code>Departamento</code> role facet sequence. */
    public static final String PATH_FACETS_DEPARTAMENTO = "";
    /** <code>Departamento</code> role target class. */
    public static final String ROLE_TARGET_DEPARTAMENTO = DepartamentoConstants.CLASS_NAME;

    /** Agents allowed to navigate through Departamento **/
    public static final String DEPARTAMENTO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Pais)
    /** <code>Pais</code> role id. */
    public static final String ROLE_ID_PAIS = "Agr_1432206835712707_Alias";
    /** <code>Pais</code> role name. */
    public static final String ROLE_NAME_PAIS = "pais";
    /** <code>Pais</code> role alias. */
    public static final String ROLE_ALIAS_PAIS = "País";

    /** <code>Pais</code> inverse role name. */
    public static final String ROLE_INVNAME_PAIS = PaisConstants.ROLE_NAME_DIRECCIONES;
    /** <code>Pais</code> role facet sequence. */
    public static final String PATH_FACETS_PAIS = "";
    /** <code>Pais</code> role target class. */
    public static final String ROLE_TARGET_PAIS = PaisConstants.CLASS_NAME;

    /** Agents allowed to navigate through Pais **/
    public static final String PAIS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Contrato)
    /** <code>Contrato</code> role id. */
    public static final String ROLE_ID_CONTRATO = "Agr_1432653660160268_Alias";
    /** <code>Contrato</code> role name. */
    public static final String ROLE_NAME_CONTRATO = "contrato";
    /** <code>Contrato</code> role alias. */
    public static final String ROLE_ALIAS_CONTRATO = "Contrato";

    /** <code>Contrato</code> inverse role name. */
    public static final String ROLE_INVNAME_CONTRATO = SolicitudConstants.ROLE_NAME_DIRECCION;
    /** <code>Contrato</code> role facet sequence. */
    public static final String PATH_FACETS_CONTRATO = "";
    /** <code>Contrato</code> role target class. */
    public static final String ROLE_TARGET_CONTRATO = SolicitudConstants.CLASS_NAME;

    /** Agents allowed to navigate through Contrato **/
    public static final String CONTRATO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Titular)
    /** <code>Titular</code> role id. */
    public static final String ROLE_ID_TITULAR = "Agr_1433954811904471_Alias";
    /** <code>Titular</code> role name. */
    public static final String ROLE_NAME_TITULAR = "titular";
    /** <code>Titular</code> role alias. */
    public static final String ROLE_ALIAS_TITULAR = "Titular familia";

    /** <code>Titular</code> inverse role name. */
    public static final String ROLE_INVNAME_TITULAR = TitularConstants.ROLE_NAME_DIRECCION;
    /** <code>Titular</code> role facet sequence. */
    public static final String PATH_FACETS_TITULAR = "";
    /** <code>Titular</code> role target class. */
    public static final String ROLE_TARGET_TITULAR = TitularConstants.CLASS_NAME;

    /** Agents allowed to navigate through Titular **/
    public static final String TITULAR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1432205131776562Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccioncrearpagrPersona</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DIRECCIONCREARPAGRPERSONA = "p_agrPersona";
    /** <code>direccioncrearpagrPersona</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DIRECCIONCREARPAGRPERSONA = "Clas_1432205131776562Ser_1Arg_20_Alias";
    /** <code>direccioncrearpagrPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DIRECCIONCREARPAGRPERSONA = "Persona";
    /** <code>direccioncrearpagrContrato</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DIRECCIONCREARPAGRCONTRATO = "p_agrContrato";
    /** <code>direccioncrearpagrContrato</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DIRECCIONCREARPAGRCONTRATO = "Clas_1432205131776562Ser_1Arg_21_Alias";
    /** <code>direccioncrearpagrContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DIRECCIONCREARPAGRCONTRATO = "Contrato";
    /** <code>direccioncrearpagrTitular</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DIRECCIONCREARPAGRTITULAR = "p_agrTitular";
    /** <code>direccioncrearpagrTitular</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DIRECCIONCREARPAGRTITULAR = "Clas_1432205131776562Ser_1Arg_26_Alias";
    /** <code>direccioncrearpagrTitular</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DIRECCIONCREARPAGRTITULAR = "Titular familia";
    /** <code>direccioncrearpagrTipoDireccion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DIRECCIONCREARPAGRTIPODIRECCION = "p_agrTipoDireccion";
    /** <code>direccioncrearpagrTipoDireccion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DIRECCIONCREARPAGRTIPODIRECCION = "Clas_1432205131776562Ser_1Arg_30_Alias";
    /** <code>direccioncrearpagrTipoDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DIRECCIONCREARPAGRTIPODIRECCION = "Tipo dirección";
    /** <code>direccioncrearpagrPais</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DIRECCIONCREARPAGRPAIS = "p_agrPais";
    /** <code>direccioncrearpagrPais</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DIRECCIONCREARPAGRPAIS = "Clas_1432205131776562Ser_1Arg_40_Alias";
    /** <code>direccioncrearpagrPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DIRECCIONCREARPAGRPAIS = "País";
    /** <code>direccioncrearpagrMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DIRECCIONCREARPAGRMUNICIPIO = "p_agrMunicipio";
    /** <code>direccioncrearpagrMunicipio</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DIRECCIONCREARPAGRMUNICIPIO = "Clas_1432205131776562Ser_1Arg_42_Alias";
    /** <code>direccioncrearpagrMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DIRECCIONCREARPAGRMUNICIPIO = "Municipio";
    /** <code>direccioncrearpagrDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DIRECCIONCREARPAGRDEPARTAMENTO = "p_agrDepartamento";
    /** <code>direccioncrearpagrDepartamento</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DIRECCIONCREARPAGRDEPARTAMENTO = "Clas_1432205131776562Ser_1Arg_44_Alias";
    /** <code>direccioncrearpagrDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DIRECCIONCREARPAGRDEPARTAMENTO = "Departamento";
    /** <code>direccioncrearpatrDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DIRECCIONCREARPATRDIRECCIONCOMPLETA = "p_atrDireccionCompleta";
    /** <code>direccioncrearpatrDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DIRECCIONCREARPATRDIRECCIONCOMPLETA = "Clas_1432205131776562Ser_1Arg_4_Alias";
    /** <code>direccioncrearpatrDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DIRECCIONCREARPATRDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>direccioncrearpatrRural</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DIRECCIONCREARPATRRURAL = "p_atrRural";
    /** <code>direccioncrearpatrRural</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DIRECCIONCREARPATRRURAL = "Clas_1432205131776562Ser_1Arg_16_Alias";
    /** <code>direccioncrearpatrRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DIRECCIONCREARPATRRURAL = "Rural";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1432205131776562Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccioneliminarpthisDireccion</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_DIRECCIONELIMINARPTHISDIRECCION = "p_thisDireccion";
    /** <code>direccioneliminarpthisDireccion</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_DIRECCIONELIMINARPTHISDIRECCION = "Clas_1432205131776562Ser_2Arg_1_Alias";
    /** <code>direccioneliminarpthisDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_DIRECCIONELIMINARPTHISDIRECCION = "Dirección";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1432205131776562Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccionmodificarpthisDireccion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_DIRECCIONMODIFICARPTHISDIRECCION = "p_thisDireccion";
    /** <code>direccionmodificarpthisDireccion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_DIRECCIONMODIFICARPTHISDIRECCION = "Clas_1432205131776562Ser_3Arg_1_Alias";
    /** <code>direccionmodificarpthisDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_DIRECCIONMODIFICARPTHISDIRECCION = "Dirección";
    /** <code>direccionmodificarpDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_DIRECCIONMODIFICARPDIRECCIONCOMPLETA = "p_DireccionCompleta";
    /** <code>direccionmodificarpDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_DIRECCIONMODIFICARPDIRECCIONCOMPLETA = "Clas_1432205131776562Ser_3Arg_2_Alias";
    /** <code>direccionmodificarpDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_DIRECCIONMODIFICARPDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>direccionmodificarpRural</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_DIRECCIONMODIFICARPRURAL = "p_Rural";
    /** <code>direccionmodificarpRural</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_DIRECCIONMODIFICARPRURAL = "Clas_1432205131776562Ser_3Arg_4_Alias";
    /** <code>direccionmodificarpRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_DIRECCIONMODIFICARPRURAL = "Rural";
    // Service (InsTipoDireccion)
    /** <code>InsTipoDireccion</code> service id. */
    public static final String SERV_ID_INSTIPODIRECCION = "Clas_1432205131776562Ser_4_Alias";
    /** <code>InsTipoDireccion</code> service name. */
    public static final String SERV_NAME_INSTIPODIRECCION = "InsTipoDireccion";
    /** <code>InsTipoDireccion</code> service alias. */
    public static final String SERV_ALIAS_INSTIPODIRECCION = "InsTipoDireccion";
    /** Agents allowed to execute the service InsTipoDireccion **/
    public static final String INSTIPODIRECCION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccionInsTipoDireccionpthisDireccion</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPODIRECCION_DIRECCIONINSTIPODIRECCIONPTHISDIRECCION = "p_thisDireccion";
    /** <code>direccionInsTipoDireccionpthisDireccion</code> inbound argument id. */
    public static final String ARG_ID_INSTIPODIRECCION_DIRECCIONINSTIPODIRECCIONPTHISDIRECCION = "Clas_1432205131776562Ser_4Arg_1_Alias";
    /** <code>direccionInsTipoDireccionpthisDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPODIRECCION_DIRECCIONINSTIPODIRECCIONPTHISDIRECCION = "Direcciones";
    /** <code>direccionInsTipoDireccionpevcTipoDireccion</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPODIRECCION_DIRECCIONINSTIPODIRECCIONPEVCTIPODIRECCION = "p_evcTipoDireccion";
    /** <code>direccionInsTipoDireccionpevcTipoDireccion</code> inbound argument id. */
    public static final String ARG_ID_INSTIPODIRECCION_DIRECCIONINSTIPODIRECCIONPEVCTIPODIRECCION = "Clas_1432205131776562Ser_4Arg_2_Alias";
    /** <code>direccionInsTipoDireccionpevcTipoDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPODIRECCION_DIRECCIONINSTIPODIRECCIONPEVCTIPODIRECCION = "Tipo dirección";
    // Service (DelTipoDireccion)
    /** <code>DelTipoDireccion</code> service id. */
    public static final String SERV_ID_DELTIPODIRECCION = "Clas_1432205131776562Ser_5_Alias";
    /** <code>DelTipoDireccion</code> service name. */
    public static final String SERV_NAME_DELTIPODIRECCION = "DelTipoDireccion";
    /** <code>DelTipoDireccion</code> service alias. */
    public static final String SERV_ALIAS_DELTIPODIRECCION = "DelTipoDireccion";
    /** Agents allowed to execute the service DelTipoDireccion **/
    public static final String DELTIPODIRECCION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccionDelTipoDireccionpthisDireccion</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPODIRECCION_DIRECCIONDELTIPODIRECCIONPTHISDIRECCION = "p_thisDireccion";
    /** <code>direccionDelTipoDireccionpthisDireccion</code> inbound argument id. */
    public static final String ARG_ID_DELTIPODIRECCION_DIRECCIONDELTIPODIRECCIONPTHISDIRECCION = "Clas_1432205131776562Ser_5Arg_1_Alias";
    /** <code>direccionDelTipoDireccionpthisDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPODIRECCION_DIRECCIONDELTIPODIRECCIONPTHISDIRECCION = "Direcciones";
    /** <code>direccionDelTipoDireccionpevcTipoDireccion</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPODIRECCION_DIRECCIONDELTIPODIRECCIONPEVCTIPODIRECCION = "p_evcTipoDireccion";
    /** <code>direccionDelTipoDireccionpevcTipoDireccion</code> inbound argument id. */
    public static final String ARG_ID_DELTIPODIRECCION_DIRECCIONDELTIPODIRECCIONPEVCTIPODIRECCION = "Clas_1432205131776562Ser_5Arg_2_Alias";
    /** <code>direccionDelTipoDireccionpevcTipoDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPODIRECCION_DIRECCIONDELTIPODIRECCIONPEVCTIPODIRECCION = "Tipo dirección";
    // Service (InsMunicipioDireccion)
    /** <code>InsMunicipioDireccion</code> service id. */
    public static final String SERV_ID_INSMUNICIPIODIRECCION = "Clas_1432205131776562Ser_6_Alias";
    /** <code>InsMunicipioDireccion</code> service name. */
    public static final String SERV_NAME_INSMUNICIPIODIRECCION = "InsMunicipioDireccion";
    /** <code>InsMunicipioDireccion</code> service alias. */
    public static final String SERV_ALIAS_INSMUNICIPIODIRECCION = "InsMunicipioDireccion";
    /** Agents allowed to execute the service InsMunicipioDireccion **/
    public static final String INSMUNICIPIODIRECCION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccionInsMunicipioDireccionpthisDireccion</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIODIRECCION_DIRECCIONINSMUNICIPIODIRECCIONPTHISDIRECCION = "p_thisDireccion";
    /** <code>direccionInsMunicipioDireccionpthisDireccion</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIODIRECCION_DIRECCIONINSMUNICIPIODIRECCIONPTHISDIRECCION = "Clas_1432205131776562Ser_6Arg_1_Alias";
    /** <code>direccionInsMunicipioDireccionpthisDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIODIRECCION_DIRECCIONINSMUNICIPIODIRECCIONPTHISDIRECCION = "Direcciones";
    /** <code>direccionInsMunicipioDireccionpevcMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIODIRECCION_DIRECCIONINSMUNICIPIODIRECCIONPEVCMUNICIPIO = "p_evcMunicipio";
    /** <code>direccionInsMunicipioDireccionpevcMunicipio</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIODIRECCION_DIRECCIONINSMUNICIPIODIRECCIONPEVCMUNICIPIO = "Clas_1432205131776562Ser_6Arg_2_Alias";
    /** <code>direccionInsMunicipioDireccionpevcMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIODIRECCION_DIRECCIONINSMUNICIPIODIRECCIONPEVCMUNICIPIO = "Municipio";
    // Service (DelMunicipioDireccion)
    /** <code>DelMunicipioDireccion</code> service id. */
    public static final String SERV_ID_DELMUNICIPIODIRECCION = "Clas_1432205131776562Ser_7_Alias";
    /** <code>DelMunicipioDireccion</code> service name. */
    public static final String SERV_NAME_DELMUNICIPIODIRECCION = "DelMunicipioDireccion";
    /** <code>DelMunicipioDireccion</code> service alias. */
    public static final String SERV_ALIAS_DELMUNICIPIODIRECCION = "DelMunicipioDireccion";
    /** Agents allowed to execute the service DelMunicipioDireccion **/
    public static final String DELMUNICIPIODIRECCION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccionDelMunicipioDireccionpthisDireccion</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIODIRECCION_DIRECCIONDELMUNICIPIODIRECCIONPTHISDIRECCION = "p_thisDireccion";
    /** <code>direccionDelMunicipioDireccionpthisDireccion</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIODIRECCION_DIRECCIONDELMUNICIPIODIRECCIONPTHISDIRECCION = "Clas_1432205131776562Ser_7Arg_1_Alias";
    /** <code>direccionDelMunicipioDireccionpthisDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIODIRECCION_DIRECCIONDELMUNICIPIODIRECCIONPTHISDIRECCION = "Direcciones";
    /** <code>direccionDelMunicipioDireccionpevcMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIODIRECCION_DIRECCIONDELMUNICIPIODIRECCIONPEVCMUNICIPIO = "p_evcMunicipio";
    /** <code>direccionDelMunicipioDireccionpevcMunicipio</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIODIRECCION_DIRECCIONDELMUNICIPIODIRECCIONPEVCMUNICIPIO = "Clas_1432205131776562Ser_7Arg_2_Alias";
    /** <code>direccionDelMunicipioDireccionpevcMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIODIRECCION_DIRECCIONDELMUNICIPIODIRECCIONPEVCMUNICIPIO = "Municipio";
    // Service (InsDepartamentoDireccion)
    /** <code>InsDepartamentoDireccion</code> service id. */
    public static final String SERV_ID_INSDEPARTAMENTODIRECCION = "Clas_1432205131776562Ser_8_Alias";
    /** <code>InsDepartamentoDireccion</code> service name. */
    public static final String SERV_NAME_INSDEPARTAMENTODIRECCION = "InsDepartamentoDireccion";
    /** <code>InsDepartamentoDireccion</code> service alias. */
    public static final String SERV_ALIAS_INSDEPARTAMENTODIRECCION = "InsDepartamentoDireccion";
    /** Agents allowed to execute the service InsDepartamentoDireccion **/
    public static final String INSDEPARTAMENTODIRECCION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccionInsDepartamentoDireccionpthisDireccion</code> inbound argument name. */
    public static final String ARG_NAME_INSDEPARTAMENTODIRECCION_DIRECCIONINSDEPARTAMENTODIRECCIONPTHISDIRECCION = "p_thisDireccion";
    /** <code>direccionInsDepartamentoDireccionpthisDireccion</code> inbound argument id. */
    public static final String ARG_ID_INSDEPARTAMENTODIRECCION_DIRECCIONINSDEPARTAMENTODIRECCIONPTHISDIRECCION = "Clas_1432205131776562Ser_8Arg_1_Alias";
    /** <code>direccionInsDepartamentoDireccionpthisDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDEPARTAMENTODIRECCION_DIRECCIONINSDEPARTAMENTODIRECCIONPTHISDIRECCION = "Direcciones";
    /** <code>direccionInsDepartamentoDireccionpevcDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_INSDEPARTAMENTODIRECCION_DIRECCIONINSDEPARTAMENTODIRECCIONPEVCDEPARTAMENTO = "p_evcDepartamento";
    /** <code>direccionInsDepartamentoDireccionpevcDepartamento</code> inbound argument id. */
    public static final String ARG_ID_INSDEPARTAMENTODIRECCION_DIRECCIONINSDEPARTAMENTODIRECCIONPEVCDEPARTAMENTO = "Clas_1432205131776562Ser_8Arg_2_Alias";
    /** <code>direccionInsDepartamentoDireccionpevcDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDEPARTAMENTODIRECCION_DIRECCIONINSDEPARTAMENTODIRECCIONPEVCDEPARTAMENTO = "Departamento";
    // Service (DelDepartamentoDireccion)
    /** <code>DelDepartamentoDireccion</code> service id. */
    public static final String SERV_ID_DELDEPARTAMENTODIRECCION = "Clas_1432205131776562Ser_9_Alias";
    /** <code>DelDepartamentoDireccion</code> service name. */
    public static final String SERV_NAME_DELDEPARTAMENTODIRECCION = "DelDepartamentoDireccion";
    /** <code>DelDepartamentoDireccion</code> service alias. */
    public static final String SERV_ALIAS_DELDEPARTAMENTODIRECCION = "DelDepartamentoDireccion";
    /** Agents allowed to execute the service DelDepartamentoDireccion **/
    public static final String DELDEPARTAMENTODIRECCION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccionDelDepartamentoDireccionpthisDireccion</code> inbound argument name. */
    public static final String ARG_NAME_DELDEPARTAMENTODIRECCION_DIRECCIONDELDEPARTAMENTODIRECCIONPTHISDIRECCION = "p_thisDireccion";
    /** <code>direccionDelDepartamentoDireccionpthisDireccion</code> inbound argument id. */
    public static final String ARG_ID_DELDEPARTAMENTODIRECCION_DIRECCIONDELDEPARTAMENTODIRECCIONPTHISDIRECCION = "Clas_1432205131776562Ser_9Arg_1_Alias";
    /** <code>direccionDelDepartamentoDireccionpthisDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDEPARTAMENTODIRECCION_DIRECCIONDELDEPARTAMENTODIRECCIONPTHISDIRECCION = "Direcciones";
    /** <code>direccionDelDepartamentoDireccionpevcDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_DELDEPARTAMENTODIRECCION_DIRECCIONDELDEPARTAMENTODIRECCIONPEVCDEPARTAMENTO = "p_evcDepartamento";
    /** <code>direccionDelDepartamentoDireccionpevcDepartamento</code> inbound argument id. */
    public static final String ARG_ID_DELDEPARTAMENTODIRECCION_DIRECCIONDELDEPARTAMENTODIRECCIONPEVCDEPARTAMENTO = "Clas_1432205131776562Ser_9Arg_2_Alias";
    /** <code>direccionDelDepartamentoDireccionpevcDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDEPARTAMENTODIRECCION_DIRECCIONDELDEPARTAMENTODIRECCIONPEVCDEPARTAMENTO = "Departamento";
    // Service (InsPaisDireccion)
    /** <code>InsPaisDireccion</code> service id. */
    public static final String SERV_ID_INSPAISDIRECCION = "Clas_1432205131776562Ser_10_Alias";
    /** <code>InsPaisDireccion</code> service name. */
    public static final String SERV_NAME_INSPAISDIRECCION = "InsPaisDireccion";
    /** <code>InsPaisDireccion</code> service alias. */
    public static final String SERV_ALIAS_INSPAISDIRECCION = "InsPaisDireccion";
    /** Agents allowed to execute the service InsPaisDireccion **/
    public static final String INSPAISDIRECCION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccionInsPaisDireccionpthisDireccion</code> inbound argument name. */
    public static final String ARG_NAME_INSPAISDIRECCION_DIRECCIONINSPAISDIRECCIONPTHISDIRECCION = "p_thisDireccion";
    /** <code>direccionInsPaisDireccionpthisDireccion</code> inbound argument id. */
    public static final String ARG_ID_INSPAISDIRECCION_DIRECCIONINSPAISDIRECCIONPTHISDIRECCION = "Clas_1432205131776562Ser_10Arg_1_Alias";
    /** <code>direccionInsPaisDireccionpthisDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPAISDIRECCION_DIRECCIONINSPAISDIRECCIONPTHISDIRECCION = "Direcciones";
    /** <code>direccionInsPaisDireccionpevcPais</code> inbound argument name. */
    public static final String ARG_NAME_INSPAISDIRECCION_DIRECCIONINSPAISDIRECCIONPEVCPAIS = "p_evcPais";
    /** <code>direccionInsPaisDireccionpevcPais</code> inbound argument id. */
    public static final String ARG_ID_INSPAISDIRECCION_DIRECCIONINSPAISDIRECCIONPEVCPAIS = "Clas_1432205131776562Ser_10Arg_2_Alias";
    /** <code>direccionInsPaisDireccionpevcPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPAISDIRECCION_DIRECCIONINSPAISDIRECCIONPEVCPAIS = "País";
    // Service (DelPaisDireccion)
    /** <code>DelPaisDireccion</code> service id. */
    public static final String SERV_ID_DELPAISDIRECCION = "Clas_1432205131776562Ser_11_Alias";
    /** <code>DelPaisDireccion</code> service name. */
    public static final String SERV_NAME_DELPAISDIRECCION = "DelPaisDireccion";
    /** <code>DelPaisDireccion</code> service alias. */
    public static final String SERV_ALIAS_DELPAISDIRECCION = "DelPaisDireccion";
    /** Agents allowed to execute the service DelPaisDireccion **/
    public static final String DELPAISDIRECCION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccionDelPaisDireccionpthisDireccion</code> inbound argument name. */
    public static final String ARG_NAME_DELPAISDIRECCION_DIRECCIONDELPAISDIRECCIONPTHISDIRECCION = "p_thisDireccion";
    /** <code>direccionDelPaisDireccionpthisDireccion</code> inbound argument id. */
    public static final String ARG_ID_DELPAISDIRECCION_DIRECCIONDELPAISDIRECCIONPTHISDIRECCION = "Clas_1432205131776562Ser_11Arg_1_Alias";
    /** <code>direccionDelPaisDireccionpthisDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPAISDIRECCION_DIRECCIONDELPAISDIRECCIONPTHISDIRECCION = "Direcciones";
    /** <code>direccionDelPaisDireccionpevcPais</code> inbound argument name. */
    public static final String ARG_NAME_DELPAISDIRECCION_DIRECCIONDELPAISDIRECCIONPEVCPAIS = "p_evcPais";
    /** <code>direccionDelPaisDireccionpevcPais</code> inbound argument id. */
    public static final String ARG_ID_DELPAISDIRECCION_DIRECCIONDELPAISDIRECCIONPEVCPAIS = "Clas_1432205131776562Ser_11Arg_2_Alias";
    /** <code>direccionDelPaisDireccionpevcPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPAISDIRECCION_DIRECCIONDELPAISDIRECCIONPEVCPAIS = "País";
    // Service (registrarCodigo)
    /** <code>registrarCodigo</code> service id. */
    public static final String SERV_ID_REGISTRARCODIGO = "Clas_1432205131776562Ser_12_Alias";
    /** <code>registrarCodigo</code> service name. */
    public static final String SERV_NAME_REGISTRARCODIGO = "registrarCodigo";
    /** <code>registrarCodigo</code> service alias. */
    public static final String SERV_ALIAS_REGISTRARCODIGO = "registrarCodigo";
    /** Agents allowed to execute the service registrarCodigo **/
    public static final String REGISTRARCODIGO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccionregistrarCodigopthisDireccion</code> inbound argument name. */
    public static final String ARG_NAME_REGISTRARCODIGO_DIRECCIONREGISTRARCODIGOPTHISDIRECCION = "p_thisDireccion";
    /** <code>direccionregistrarCodigopthisDireccion</code> inbound argument id. */
    public static final String ARG_ID_REGISTRARCODIGO_DIRECCIONREGISTRARCODIGOPTHISDIRECCION = "Clas_1432205131776562Ser_12Arg_1_Alias";
    /** <code>direccionregistrarCodigopthisDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_REGISTRARCODIGO_DIRECCIONREGISTRARCODIGOPTHISDIRECCION = "Dirección";
    /** <code>direccionregistrarCodigopCodigo</code> inbound argument name. */
    public static final String ARG_NAME_REGISTRARCODIGO_DIRECCIONREGISTRARCODIGOPCODIGO = "p_Codigo";
    /** <code>direccionregistrarCodigopCodigo</code> inbound argument id. */
    public static final String ARG_ID_REGISTRARCODIGO_DIRECCIONREGISTRARCODIGOPCODIGO = "Clas_1432205131776562Ser_12Arg_2_Alias";
    /** <code>direccionregistrarCodigopCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_REGISTRARCODIGO_DIRECCIONREGISTRARCODIGOPCODIGO = "Código";
    // Service (InsDirTitular)
    /** <code>InsDirTitular</code> service id. */
    public static final String SERV_ID_INSDIRTITULAR = "Clas_1432205131776562Ser_15_Alias";
    /** <code>InsDirTitular</code> service name. */
    public static final String SERV_NAME_INSDIRTITULAR = "InsDirTitular";
    /** <code>InsDirTitular</code> service alias. */
    public static final String SERV_ALIAS_INSDIRTITULAR = "InsDirTitular";
    /** Agents allowed to execute the service InsDirTitular **/
    public static final String INSDIRTITULAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccionInsDirTitularpthisDireccion</code> inbound argument name. */
    public static final String ARG_NAME_INSDIRTITULAR_DIRECCIONINSDIRTITULARPTHISDIRECCION = "p_thisDireccion";
    /** <code>direccionInsDirTitularpthisDireccion</code> inbound argument id. */
    public static final String ARG_ID_INSDIRTITULAR_DIRECCIONINSDIRTITULARPTHISDIRECCION = "Clas_1432205131776562Ser_15Arg_1_Alias";
    /** <code>direccionInsDirTitularpthisDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDIRTITULAR_DIRECCIONINSDIRTITULARPTHISDIRECCION = "Dirección";
    /** <code>direccionInsDirTitularpevcTitular</code> inbound argument name. */
    public static final String ARG_NAME_INSDIRTITULAR_DIRECCIONINSDIRTITULARPEVCTITULAR = "p_evcTitular";
    /** <code>direccionInsDirTitularpevcTitular</code> inbound argument id. */
    public static final String ARG_ID_INSDIRTITULAR_DIRECCIONINSDIRTITULARPEVCTITULAR = "Clas_1432205131776562Ser_15Arg_2_Alias";
    /** <code>direccionInsDirTitularpevcTitular</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDIRTITULAR_DIRECCIONINSDIRTITULARPEVCTITULAR = "Titular familia";
    // Service (DelDirTitular)
    /** <code>DelDirTitular</code> service id. */
    public static final String SERV_ID_DELDIRTITULAR = "Clas_1432205131776562Ser_16_Alias";
    /** <code>DelDirTitular</code> service name. */
    public static final String SERV_NAME_DELDIRTITULAR = "DelDirTitular";
    /** <code>DelDirTitular</code> service alias. */
    public static final String SERV_ALIAS_DELDIRTITULAR = "DelDirTitular";
    /** Agents allowed to execute the service DelDirTitular **/
    public static final String DELDIRTITULAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccionDelDirTitularpthisDireccion</code> inbound argument name. */
    public static final String ARG_NAME_DELDIRTITULAR_DIRECCIONDELDIRTITULARPTHISDIRECCION = "p_thisDireccion";
    /** <code>direccionDelDirTitularpthisDireccion</code> inbound argument id. */
    public static final String ARG_ID_DELDIRTITULAR_DIRECCIONDELDIRTITULARPTHISDIRECCION = "Clas_1432205131776562Ser_16Arg_1_Alias";
    /** <code>direccionDelDirTitularpthisDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDIRTITULAR_DIRECCIONDELDIRTITULARPTHISDIRECCION = "Dirección";
    /** <code>direccionDelDirTitularpevcTitular</code> inbound argument name. */
    public static final String ARG_NAME_DELDIRTITULAR_DIRECCIONDELDIRTITULARPEVCTITULAR = "p_evcTitular";
    /** <code>direccionDelDirTitularpevcTitular</code> inbound argument id. */
    public static final String ARG_ID_DELDIRTITULAR_DIRECCIONDELDIRTITULARPEVCTITULAR = "Clas_1432205131776562Ser_16Arg_2_Alias";
    /** <code>direccionDelDirTitularpevcTitular</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDIRTITULAR_DIRECCIONDELDIRTITULARPEVCTITULAR = "Titular familia";
    // Service (TMODIFICAR)
    /** <code>TMODIFICAR</code> service id. */
    public static final String SERV_ID_TMODIFICAR = "Clas_1432205131776562Ser_14_Alias";
    /** <code>TMODIFICAR</code> service name. */
    public static final String SERV_NAME_TMODIFICAR = "TMODIFICAR";
    /** <code>TMODIFICAR</code> service alias. */
    public static final String SERV_ALIAS_TMODIFICAR = "Modificar dirección";
    /** Agents allowed to execute the service TMODIFICAR **/
    public static final String TMODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccionTMODIFICARpthisDireccion</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DIRECCIONTMODIFICARPTHISDIRECCION = "p_thisDireccion";
    /** <code>direccionTMODIFICARpthisDireccion</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DIRECCIONTMODIFICARPTHISDIRECCION = "Clas_1432205131776562Ser_14Arg_1_Alias";
    /** <code>direccionTMODIFICARpthisDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DIRECCIONTMODIFICARPTHISDIRECCION = "Dirección";
    /** <code>direccionTMODIFICARptpDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DIRECCIONTMODIFICARPTPDIRECCIONCOMPLETA = "pt_p_DireccionCompleta";
    /** <code>direccionTMODIFICARptpDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DIRECCIONTMODIFICARPTPDIRECCIONCOMPLETA = "Clas_1432205131776562Ser_14Arg_2_Alias";
    /** <code>direccionTMODIFICARptpDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DIRECCIONTMODIFICARPTPDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>direccionTMODIFICARptpRural</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DIRECCIONTMODIFICARPTPRURAL = "pt_p_Rural";
    /** <code>direccionTMODIFICARptpRural</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DIRECCIONTMODIFICARPTPRURAL = "Clas_1432205131776562Ser_14Arg_4_Alias";
    /** <code>direccionTMODIFICARptpRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DIRECCIONTMODIFICARPTPRURAL = "Rural";
    /** <code>direccionTMODIFICARptpevcDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DIRECCIONTMODIFICARPTPEVCDEPARTAMENTO = "pt_p_evcDepartamento";
    /** <code>direccionTMODIFICARptpevcDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DIRECCIONTMODIFICARPTPEVCDEPARTAMENTO = "Clas_1432205131776562Ser_14Arg_6_Alias";
    /** <code>direccionTMODIFICARptpevcDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DIRECCIONTMODIFICARPTPEVCDEPARTAMENTO = "Departamento";
    /** <code>direccionTMODIFICARptpevcMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DIRECCIONTMODIFICARPTPEVCMUNICIPIO = "pt_p_evcMunicipio";
    /** <code>direccionTMODIFICARptpevcMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DIRECCIONTMODIFICARPTPEVCMUNICIPIO = "Clas_1432205131776562Ser_14Arg_7_Alias";
    /** <code>direccionTMODIFICARptpevcMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DIRECCIONTMODIFICARPTPEVCMUNICIPIO = "Municipio";
    /** <code>direccionTMODIFICARptpevcPais</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DIRECCIONTMODIFICARPTPEVCPAIS = "pt_p_evcPais";
    /** <code>direccionTMODIFICARptpevcPais</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DIRECCIONTMODIFICARPTPEVCPAIS = "Clas_1432205131776562Ser_14Arg_8_Alias";
    /** <code>direccionTMODIFICARptpevcPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DIRECCIONTMODIFICARPTPEVCPAIS = "País";
    /** <code>direccionTMODIFICARptpevcTipoDireccion</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DIRECCIONTMODIFICARPTPEVCTIPODIRECCION = "pt_p_evcTipoDireccion";
    /** <code>direccionTMODIFICARptpevcTipoDireccion</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DIRECCIONTMODIFICARPTPEVCTIPODIRECCION = "Clas_1432205131776562Ser_14Arg_9_Alias";
    /** <code>direccionTMODIFICARptpevcTipoDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DIRECCIONTMODIFICARPTPEVCTIPODIRECCION = "Tipo dirección";
    // Service (TCREAR)
    /** <code>TCREAR</code> service id. */
    public static final String SERV_ID_TCREAR = "Clas_1432205131776562Ser_17_Alias";
    /** <code>TCREAR</code> service name. */
    public static final String SERV_NAME_TCREAR = "TCREAR";
    /** <code>TCREAR</code> service alias. */
    public static final String SERV_ALIAS_TCREAR = "TCREAR";
    /** Agents allowed to execute the service TCREAR **/
    public static final String TCREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccionTCREARptpagrPersona</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_DIRECCIONTCREARPTPAGRPERSONA = "pt_p_agrPersona";
    /** <code>direccionTCREARptpagrPersona</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_DIRECCIONTCREARPTPAGRPERSONA = "Clas_1432205131776562Ser_17Arg_3_Alias";
    /** <code>direccionTCREARptpagrPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_DIRECCIONTCREARPTPAGRPERSONA = "Persona";
    /** <code>direccionTCREARptpagrContrato</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_DIRECCIONTCREARPTPAGRCONTRATO = "pt_p_agrContrato";
    /** <code>direccionTCREARptpagrContrato</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_DIRECCIONTCREARPTPAGRCONTRATO = "Clas_1432205131776562Ser_17Arg_4_Alias";
    /** <code>direccionTCREARptpagrContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_DIRECCIONTCREARPTPAGRCONTRATO = "Contrato";
    /** <code>direccionTCREARptpagrTitular</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_DIRECCIONTCREARPTPAGRTITULAR = "pt_p_agrTitular";
    /** <code>direccionTCREARptpagrTitular</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_DIRECCIONTCREARPTPAGRTITULAR = "Clas_1432205131776562Ser_17Arg_5_Alias";
    /** <code>direccionTCREARptpagrTitular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_DIRECCIONTCREARPTPAGRTITULAR = "Titular familia";
    /** <code>direccionTCREARptpagrTipoDireccion</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_DIRECCIONTCREARPTPAGRTIPODIRECCION = "pt_p_agrTipoDireccion";
    /** <code>direccionTCREARptpagrTipoDireccion</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_DIRECCIONTCREARPTPAGRTIPODIRECCION = "Clas_1432205131776562Ser_17Arg_6_Alias";
    /** <code>direccionTCREARptpagrTipoDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_DIRECCIONTCREARPTPAGRTIPODIRECCION = "Tipo dirección";
    /** <code>direccionTCREARptpagrMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_DIRECCIONTCREARPTPAGRMUNICIPIO = "pt_p_agrMunicipio";
    /** <code>direccionTCREARptpagrMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_DIRECCIONTCREARPTPAGRMUNICIPIO = "Clas_1432205131776562Ser_17Arg_7_Alias";
    /** <code>direccionTCREARptpagrMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_DIRECCIONTCREARPTPAGRMUNICIPIO = "Municipio";
    /** <code>direccionTCREARptpagrDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_DIRECCIONTCREARPTPAGRDEPARTAMENTO = "pt_p_agrDepartamento";
    /** <code>direccionTCREARptpagrDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_DIRECCIONTCREARPTPAGRDEPARTAMENTO = "Clas_1432205131776562Ser_17Arg_8_Alias";
    /** <code>direccionTCREARptpagrDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_DIRECCIONTCREARPTPAGRDEPARTAMENTO = "Departamento";
    /** <code>direccionTCREARptpagrPais</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_DIRECCIONTCREARPTPAGRPAIS = "pt_p_agrPais";
    /** <code>direccionTCREARptpagrPais</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_DIRECCIONTCREARPTPAGRPAIS = "Clas_1432205131776562Ser_17Arg_9_Alias";
    /** <code>direccionTCREARptpagrPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_DIRECCIONTCREARPTPAGRPAIS = "País";
    /** <code>direccionTCREARptpatrDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_DIRECCIONTCREARPTPATRDIRECCIONCOMPLETA = "pt_p_atrDireccionCompleta";
    /** <code>direccionTCREARptpatrDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_DIRECCIONTCREARPTPATRDIRECCIONCOMPLETA = "Clas_1432205131776562Ser_17Arg_10_Alias";
    /** <code>direccionTCREARptpatrDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_DIRECCIONTCREARPTPATRDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>direccionTCREARptpatrRural</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_DIRECCIONTCREARPTPATRRURAL = "pt_p_atrRural";
    /** <code>direccionTCREARptpatrRural</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_DIRECCIONTCREARPTPATRRURAL = "Clas_1432205131776562Ser_17Arg_11_Alias";
    /** <code>direccionTCREARptpatrRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_DIRECCIONTCREARPTPATRRURAL = "Rural";

    public static final String FILTER_NAME_FDIRECCIONPORPERSONAYTIPO = "F_DireccionPorPErsonaYTipo";
    public static final String VAR_NAME_FDIRECCIONPORPERSONAYTIPO_VFPER = "vfPer";
    public static final String VAR_NAME_FDIRECCIONPORPERSONAYTIPO_VFTIPO = "vfTipo";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_DIRECCIONCODIGO.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_DIRECCIONDIRECCIONCOMPLETA.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_DIRECCIONRURAL.toUpperCase(), Constants.Type.BOOL.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_DIRECCIONIDENTIFICADOR.toUpperCase(), DIRECCIONIDENTIFICADOR_AGENTS);
    	attributeAgents.put(ATTR_NAME_DIRECCIONCODIGO.toUpperCase(), DIRECCIONCODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_DIRECCIONDIRECCIONCOMPLETA.toUpperCase(), DIRECCIONDIRECCIONCOMPLETA_AGENTS);
    	attributeAgents.put(ATTR_NAME_DIRECCIONRURAL.toUpperCase(), DIRECCIONRURAL_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_PERSONA.toUpperCase(), PERSONA_AGENTS);
        roleAgents.put(ROLE_NAME_TIPODIRECCION.toUpperCase(), TIPODIRECCION_AGENTS);
        roleAgents.put(ROLE_NAME_MUNICIPIO.toUpperCase(), MUNICIPIO_AGENTS);
        roleAgents.put(ROLE_NAME_DEPARTAMENTO.toUpperCase(), DEPARTAMENTO_AGENTS);
        roleAgents.put(ROLE_NAME_PAIS.toUpperCase(), PAIS_AGENTS);
        roleAgents.put(ROLE_NAME_CONTRATO.toUpperCase(), CONTRATO_AGENTS);
        roleAgents.put(ROLE_NAME_TITULAR.toUpperCase(), TITULAR_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'Direccion', it returns the identification keys
     * - If className is a facet of the inheritance net of 'Direccion', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_DIRECCIONIDENTIFICADOR);
        }
        // Facet 'Direccion' (This facet)
        if (DireccionConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_DIRECCIONIDENTIFICADOR);
        }
        return returnList;
    }
}
