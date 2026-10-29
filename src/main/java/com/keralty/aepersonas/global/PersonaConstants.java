package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>Persona</code> model class.
 */
public final class PersonaConstants {

    private PersonaConstants() {

    }

    // Class
    /** <code>Persona</code> class id. */
    public static final String CLASS_ID = "Clas_1431886233600805_Alias";
    /** <code>Persona</code> class name. */
    public static final String CLASS_NAME = "Persona";
    /** <code>Persona</code> class alias. */
    public static final String CLASS_ALIAS = "Persona";
    /** <code>Persona</code> class table name. */
    public static final String TBL_NAME = "Persona";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "personaIdentificador,tipoIdentificacionTipoIdentificacionCodigo,departamentoDepartamentoNacimientoCodigo,municipioMunicipioNacimientoCodigo,estadoCivilEstadoCivilCodigo,estadoPersonaEstadoPersonaCodigo,personaCodigo,personaNumIdentificacion,personaTipoPersona,personaPrimerNombre,personaSegundoNombre,personaPrimerApellido,personaSegundoApellido,personaRazonSocial,personaFechaNacimiento,personaGenero,personaIndicadorExtranjero,personaTelefonoFijo,personaTelefonoCelular,personaCorreoElectronico,personaTieneEPSSanitas,personaRechazadoAfiliacion,personaDatosBasicosMod";

    public static final String DSICPERSONA = "IC_Persona";
    public static final String DSDSPERSONAPIU = "DS_Persona_PIU";
    public static final String DSIC2PERSONA = "IC2_Persona";
    public static final String DSICPERSONANOMBRESAPELLIDOS = "IC_PersonaNombresApellidos";
    

    // Attribute (personaIdentificador)
    /** <code>personaIdentificador</code> attribute id. */
    public static final String ATTR_ID_PERSONAIDENTIFICADOR = "Clas_1431886233600805Atr_19_Alias";
    /** <code>personaIdentificador</code> attribute name. */
    public static final String ATTR_NAME_PERSONAIDENTIFICADOR = "personaIdentificador";
    /** <code>personaIdentificador</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONAIDENTIFICADOR = "Identificador";

    /** <code>personaIdentificador</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONAIDENTIFICADOR = "";
    /** Agents allowed to view the attribute personaIdentificador **/
    public static final String PERSONAIDENTIFICADOR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaCodigo)
    /** <code>personaCodigo</code> attribute id. */
    public static final String ATTR_ID_PERSONACODIGO = "Clas_1431886233600805Atr_1_Alias";
    /** <code>personaCodigo</code> attribute name. */
    public static final String ATTR_NAME_PERSONACODIGO = "personaCodigo";
    /** <code>personaCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONACODIGO = "Código";

    /** <code>personaCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONACODIGO = "";
    /** Agents allowed to view the attribute personaCodigo **/
    public static final String PERSONACODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaNumIdentificacion)
    /** <code>personaNumIdentificacion</code> attribute id. */
    public static final String ATTR_ID_PERSONANUMIDENTIFICACION = "Clas_1431886233600805Atr_2_Alias";
    /** <code>personaNumIdentificacion</code> attribute name. */
    public static final String ATTR_NAME_PERSONANUMIDENTIFICACION = "personaNumIdentificacion";
    /** <code>personaNumIdentificacion</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONANUMIDENTIFICACION = "Nº Identificación";

    /** <code>personaNumIdentificacion</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONANUMIDENTIFICACION = "";
    /** Agents allowed to view the attribute personaNumIdentificacion **/
    public static final String PERSONANUMIDENTIFICACION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaTipoPersona)
    /** <code>personaTipoPersona</code> attribute id. */
    public static final String ATTR_ID_PERSONATIPOPERSONA = "Clas_1431886233600805Atr_3_Alias";
    /** <code>personaTipoPersona</code> attribute name. */
    public static final String ATTR_NAME_PERSONATIPOPERSONA = "personaTipoPersona";
    /** <code>personaTipoPersona</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONATIPOPERSONA = "Tipo persona";

    /** <code>personaTipoPersona</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONATIPOPERSONA = "";
    /** Agents allowed to view the attribute personaTipoPersona **/
    public static final String PERSONATIPOPERSONA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaPrimerNombre)
    /** <code>personaPrimerNombre</code> attribute id. */
    public static final String ATTR_ID_PERSONAPRIMERNOMBRE = "Clas_1431886233600805Atr_4_Alias";
    /** <code>personaPrimerNombre</code> attribute name. */
    public static final String ATTR_NAME_PERSONAPRIMERNOMBRE = "personaPrimerNombre";
    /** <code>personaPrimerNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONAPRIMERNOMBRE = "Primer nombre";

    /** <code>personaPrimerNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONAPRIMERNOMBRE = "";
    /** Agents allowed to view the attribute personaPrimerNombre **/
    public static final String PERSONAPRIMERNOMBRE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaSegundoNombre)
    /** <code>personaSegundoNombre</code> attribute id. */
    public static final String ATTR_ID_PERSONASEGUNDONOMBRE = "Clas_1431886233600805Atr_5_Alias";
    /** <code>personaSegundoNombre</code> attribute name. */
    public static final String ATTR_NAME_PERSONASEGUNDONOMBRE = "personaSegundoNombre";
    /** <code>personaSegundoNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONASEGUNDONOMBRE = "Segundo nombre";

    /** <code>personaSegundoNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONASEGUNDONOMBRE = "";
    /** Agents allowed to view the attribute personaSegundoNombre **/
    public static final String PERSONASEGUNDONOMBRE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaPrimerApellido)
    /** <code>personaPrimerApellido</code> attribute id. */
    public static final String ATTR_ID_PERSONAPRIMERAPELLIDO = "Clas_1431886233600805Atr_6_Alias";
    /** <code>personaPrimerApellido</code> attribute name. */
    public static final String ATTR_NAME_PERSONAPRIMERAPELLIDO = "personaPrimerApellido";
    /** <code>personaPrimerApellido</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONAPRIMERAPELLIDO = "Primer Apellido";

    /** <code>personaPrimerApellido</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONAPRIMERAPELLIDO = "";
    /** Agents allowed to view the attribute personaPrimerApellido **/
    public static final String PERSONAPRIMERAPELLIDO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaSegundoApellido)
    /** <code>personaSegundoApellido</code> attribute id. */
    public static final String ATTR_ID_PERSONASEGUNDOAPELLIDO = "Clas_1431886233600805Atr_7_Alias";
    /** <code>personaSegundoApellido</code> attribute name. */
    public static final String ATTR_NAME_PERSONASEGUNDOAPELLIDO = "personaSegundoApellido";
    /** <code>personaSegundoApellido</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONASEGUNDOAPELLIDO = "Segundo Apellido";

    /** <code>personaSegundoApellido</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONASEGUNDOAPELLIDO = "";
    /** Agents allowed to view the attribute personaSegundoApellido **/
    public static final String PERSONASEGUNDOAPELLIDO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaRazonSocial)
    /** <code>personaRazonSocial</code> attribute id. */
    public static final String ATTR_ID_PERSONARAZONSOCIAL = "Clas_1431886233600805Atr_8_Alias";
    /** <code>personaRazonSocial</code> attribute name. */
    public static final String ATTR_NAME_PERSONARAZONSOCIAL = "personaRazonSocial";
    /** <code>personaRazonSocial</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONARAZONSOCIAL = "Razón Social";

    /** <code>personaRazonSocial</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONARAZONSOCIAL = "";
    /** Agents allowed to view the attribute personaRazonSocial **/
    public static final String PERSONARAZONSOCIAL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personadrvNombreCompleto)
    /** <code>personadrvNombreCompleto</code> attribute id. */
    public static final String ATTR_ID_PERSONADRVNOMBRECOMPLETO = "Clas_1431886233600805Atr_9_Alias";
    /** <code>personadrvNombreCompleto</code> attribute name. */
    public static final String ATTR_NAME_PERSONADRVNOMBRECOMPLETO = "personadrvNombreCompleto";
    /** <code>personadrvNombreCompleto</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONADRVNOMBRECOMPLETO = "Nombre completo";

    /** <code>personadrvNombreCompleto</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONADRVNOMBRECOMPLETO = "";
    /** Agents allowed to view the attribute personadrvNombreCompleto **/
    public static final String PERSONADRVNOMBRECOMPLETO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaFechaNacimiento)
    /** <code>personaFechaNacimiento</code> attribute id. */
    public static final String ATTR_ID_PERSONAFECHANACIMIENTO = "Clas_1431886233600805Atr_10_Alias";
    /** <code>personaFechaNacimiento</code> attribute name. */
    public static final String ATTR_NAME_PERSONAFECHANACIMIENTO = "personaFechaNacimiento";
    /** <code>personaFechaNacimiento</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONAFECHANACIMIENTO = "Fecha nacimiento";

    /** <code>personaFechaNacimiento</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONAFECHANACIMIENTO = "";
    /** Agents allowed to view the attribute personaFechaNacimiento **/
    public static final String PERSONAFECHANACIMIENTO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaGenero)
    /** <code>personaGenero</code> attribute id. */
    public static final String ATTR_ID_PERSONAGENERO = "Clas_1431886233600805Atr_11_Alias";
    /** <code>personaGenero</code> attribute name. */
    public static final String ATTR_NAME_PERSONAGENERO = "personaGenero";
    /** <code>personaGenero</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONAGENERO = "Género";

    /** <code>personaGenero</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONAGENERO = "";
    /** Agents allowed to view the attribute personaGenero **/
    public static final String PERSONAGENERO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaIndicadorExtranjero)
    /** <code>personaIndicadorExtranjero</code> attribute id. */
    public static final String ATTR_ID_PERSONAINDICADOREXTRANJERO = "Clas_1431886233600805Atr_12_Alias";
    /** <code>personaIndicadorExtranjero</code> attribute name. */
    public static final String ATTR_NAME_PERSONAINDICADOREXTRANJERO = "personaIndicadorExtranjero";
    /** <code>personaIndicadorExtranjero</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONAINDICADOREXTRANJERO = "Indicador extranjero";

    /** <code>personaIndicadorExtranjero</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONAINDICADOREXTRANJERO = "";
    /** Agents allowed to view the attribute personaIndicadorExtranjero **/
    public static final String PERSONAINDICADOREXTRANJERO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaTelefonoFijo)
    /** <code>personaTelefonoFijo</code> attribute id. */
    public static final String ATTR_ID_PERSONATELEFONOFIJO = "Clas_1431886233600805Atr_13_Alias";
    /** <code>personaTelefonoFijo</code> attribute name. */
    public static final String ATTR_NAME_PERSONATELEFONOFIJO = "personaTelefonoFijo";
    /** <code>personaTelefonoFijo</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONATELEFONOFIJO = "Teléfono fijo";

    /** <code>personaTelefonoFijo</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONATELEFONOFIJO = "";
    /** Agents allowed to view the attribute personaTelefonoFijo **/
    public static final String PERSONATELEFONOFIJO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaTelefonoCelular)
    /** <code>personaTelefonoCelular</code> attribute id. */
    public static final String ATTR_ID_PERSONATELEFONOCELULAR = "Clas_1431886233600805Atr_14_Alias";
    /** <code>personaTelefonoCelular</code> attribute name. */
    public static final String ATTR_NAME_PERSONATELEFONOCELULAR = "personaTelefonoCelular";
    /** <code>personaTelefonoCelular</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONATELEFONOCELULAR = "Teléfono celular";

    /** <code>personaTelefonoCelular</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONATELEFONOCELULAR = "";
    /** Agents allowed to view the attribute personaTelefonoCelular **/
    public static final String PERSONATELEFONOCELULAR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaCorreoElectronico)
    /** <code>personaCorreoElectronico</code> attribute id. */
    public static final String ATTR_ID_PERSONACORREOELECTRONICO = "Clas_1431886233600805Atr_15_Alias";
    /** <code>personaCorreoElectronico</code> attribute name. */
    public static final String ATTR_NAME_PERSONACORREOELECTRONICO = "personaCorreoElectronico";
    /** <code>personaCorreoElectronico</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONACORREOELECTRONICO = "Correo electrónico";

    /** <code>personaCorreoElectronico</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONACORREOELECTRONICO = "";
    /** Agents allowed to view the attribute personaCorreoElectronico **/
    public static final String PERSONACORREOELECTRONICO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaTieneEPSSanitas)
    /** <code>personaTieneEPSSanitas</code> attribute id. */
    public static final String ATTR_ID_PERSONATIENEEPSSANITAS = "Clas_1431886233600805Atr_17_Alias";
    /** <code>personaTieneEPSSanitas</code> attribute name. */
    public static final String ATTR_NAME_PERSONATIENEEPSSANITAS = "personaTieneEPSSanitas";
    /** <code>personaTieneEPSSanitas</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONATIENEEPSSANITAS = "Tiene EPS Sanitas";

    /** <code>personaTieneEPSSanitas</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONATIENEEPSSANITAS = "";
    /** Agents allowed to view the attribute personaTieneEPSSanitas **/
    public static final String PERSONATIENEEPSSANITAS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaRechazadoAfiliacion)
    /** <code>personaRechazadoAfiliacion</code> attribute id. */
    public static final String ATTR_ID_PERSONARECHAZADOAFILIACION = "Clas_1431886233600805Atr_18_Alias";
    /** <code>personaRechazadoAfiliacion</code> attribute name. */
    public static final String ATTR_NAME_PERSONARECHAZADOAFILIACION = "personaRechazadoAfiliacion";
    /** <code>personaRechazadoAfiliacion</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONARECHAZADOAFILIACION = "Rechazado afiliación";

    /** <code>personaRechazadoAfiliacion</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONARECHAZADOAFILIACION = "";
    /** Agents allowed to view the attribute personaRechazadoAfiliacion **/
    public static final String PERSONARECHAZADOAFILIACION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaDatosBasicosMod)
    /** <code>personaDatosBasicosMod</code> attribute id. */
    public static final String ATTR_ID_PERSONADATOSBASICOSMOD = "Clas_1431886233600805Atr_20_Alias";
    /** <code>personaDatosBasicosMod</code> attribute name. */
    public static final String ATTR_NAME_PERSONADATOSBASICOSMOD = "personaDatosBasicosMod";
    /** <code>personaDatosBasicosMod</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONADATOSBASICOSMOD = "Datos básicos mod.";

    /** <code>personaDatosBasicosMod</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONADATOSBASICOSMOD = "";
    /** Agents allowed to view the attribute personaDatosBasicosMod **/
    public static final String PERSONADATOSBASICOSMOD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personadrvRechazada)
    /** <code>personadrvRechazada</code> attribute id. */
    public static final String ATTR_ID_PERSONADRVRECHAZADA = "Clas_1431886233600805Atr_21_Alias";
    /** <code>personadrvRechazada</code> attribute name. */
    public static final String ATTR_NAME_PERSONADRVRECHAZADA = "personadrvRechazada";
    /** <code>personadrvRechazada</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONADRVRECHAZADA = "Rechazada";

    /** <code>personadrvRechazada</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONADRVRECHAZADA = "";
    /** Agents allowed to view the attribute personadrvRechazada **/
    public static final String PERSONADRVRECHAZADA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personadrvTieneDirecciones)
    /** <code>personadrvTieneDirecciones</code> attribute id. */
    public static final String ATTR_ID_PERSONADRVTIENEDIRECCIONES = "Clas_1431886233600805Atr_22_Alias";
    /** <code>personadrvTieneDirecciones</code> attribute name. */
    public static final String ATTR_NAME_PERSONADRVTIENEDIRECCIONES = "personadrvTieneDirecciones";
    /** <code>personadrvTieneDirecciones</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONADRVTIENEDIRECCIONES = "Tiene direcciones";

    /** <code>personadrvTieneDirecciones</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONADRVTIENEDIRECCIONES = "";
    /** Agents allowed to view the attribute personadrvTieneDirecciones **/
    public static final String PERSONADRVTIENEDIRECCIONES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personadrvTipoNumDoc)
    /** <code>personadrvTipoNumDoc</code> attribute id. */
    public static final String ATTR_ID_PERSONADRVTIPONUMDOC = "Clas_1431886233600805Atr_23_Alias";
    /** <code>personadrvTipoNumDoc</code> attribute name. */
    public static final String ATTR_NAME_PERSONADRVTIPONUMDOC = "personadrvTipoNumDoc";
    /** <code>personadrvTipoNumDoc</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONADRVTIPONUMDOC = "Tipo y Nº Doc.";

    /** <code>personadrvTipoNumDoc</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONADRVTIPONUMDOC = "";
    /** Agents allowed to view the attribute personadrvTipoNumDoc **/
    public static final String PERSONADRVTIPONUMDOC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personadrvVieneDeCORE)
    /** <code>personadrvVieneDeCORE</code> attribute id. */
    public static final String ATTR_ID_PERSONADRVVIENEDECORE = "Clas_1431886233600805Atr_24_Alias";
    /** <code>personadrvVieneDeCORE</code> attribute name. */
    public static final String ATTR_NAME_PERSONADRVVIENEDECORE = "personadrvVieneDeCORE";
    /** <code>personadrvVieneDeCORE</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONADRVVIENEDECORE = "Viene de CORE";

    /** <code>personadrvVieneDeCORE</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONADRVVIENEDECORE = "";
    /** Agents allowed to view the attribute personadrvVieneDeCORE **/
    public static final String PERSONADRVVIENEDECORE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personadrvAddDocComoCont)
    /** <code>personadrvAddDocComoCont</code> attribute id. */
    public static final String ATTR_ID_PERSONADRVADDDOCCOMOCONT = "Clas_1431886233600805Atr_25_Alias";
    /** <code>personadrvAddDocComoCont</code> attribute name. */
    public static final String ATTR_NAME_PERSONADRVADDDOCCOMOCONT = "personadrvAddDocComoCont";
    /** <code>personadrvAddDocComoCont</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONADRVADDDOCCOMOCONT = "Añadir doc como contratante";

    /** <code>personadrvAddDocComoCont</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONADRVADDDOCCOMOCONT = "";
    /** Agents allowed to view the attribute personadrvAddDocComoCont **/
    public static final String PERSONADRVADDDOCCOMOCONT_AGENTS = "Admin,SuperAdmin,Asesor,Gestor,MesaDeApoyo";
    // Attribute (personadrvAddDocComoTitu)
    /** <code>personadrvAddDocComoTitu</code> attribute id. */
    public static final String ATTR_ID_PERSONADRVADDDOCCOMOTITU = "Clas_1431886233600805Atr_26_Alias";
    /** <code>personadrvAddDocComoTitu</code> attribute name. */
    public static final String ATTR_NAME_PERSONADRVADDDOCCOMOTITU = "personadrvAddDocComoTitu";
    /** <code>personadrvAddDocComoTitu</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONADRVADDDOCCOMOTITU = "Añadir doc como titular";

    /** <code>personadrvAddDocComoTitu</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONADRVADDDOCCOMOTITU = "";
    /** Agents allowed to view the attribute personadrvAddDocComoTitu **/
    public static final String PERSONADRVADDDOCCOMOTITU_AGENTS = "Admin,SuperAdmin,Asesor,Gestor,MesaDeApoyo";


    // Field (Identificador)
    /** <code>Identificador</code> field name. */
    public static final String FLD_PERSONAIDENTIFICADOR = "Identificador";    
    /** <code>personaIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONAIDENTIFICADOR = "personaIdentificador";
    // Field (TipoIdentificacion_Codigo)
    /** <code>TipoIdentificacion_Codigo</code> field name. */
    public static final String FLD_TIPOIDENTIFICACIONTIPOIDENTIFICACIONCODIGO = "TipoIdentificacion_Codigo";    
    /** <code>TipoIdentificacion.tipoIdentificacionCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_TIPOIDENTIFICACION_TIPOIDENTIFICACIONCODIGO = "tipoIdentificacionTipoIdentificacionCodigo";
    // Field (DepartamentoNacimiento_Codigo)
    /** <code>DepartamentoNacimiento_Codigo</code> field name. */
    public static final String FLD_DEPARTAMENTODEPARTAMENTONACIMIENTOCODIGO = "DepartamentoNacimiento_Codigo";    
    /** <code>DepartamentoNacimiento.departamentoCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_DEPARTAMENTONACIMIENTO_DEPARTAMENTOCODIGO = "departamentoDepartamentoNacimientoCodigo";
    // Field (MunicipioNacimiento_Codigo)
    /** <code>MunicipioNacimiento_Codigo</code> field name. */
    public static final String FLD_MUNICIPIOMUNICIPIONACIMIENTOCODIGO = "MunicipioNacimiento_Codigo";    
    /** <code>MunicipioNacimiento.municipioCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_MUNICIPIONACIMIENTO_MUNICIPIOCODIGO = "municipioMunicipioNacimientoCodigo";
    // Field (EstadoCivil_Codigo)
    /** <code>EstadoCivil_Codigo</code> field name. */
    public static final String FLD_ESTADOCIVILESTADOCIVILCODIGO = "EstadoCivil_Codigo";    
    /** <code>EstadoCivil.estadoCivilCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_ESTADOCIVIL_ESTADOCIVILCODIGO = "estadoCivilEstadoCivilCodigo";
    // Field (EstadoPersona_Codigo)
    /** <code>EstadoPersona_Codigo</code> field name. */
    public static final String FLD_ESTADOPERSONAESTADOPERSONACODIGO = "EstadoPersona_Codigo";    
    /** <code>EstadoPersona.estadoPersonaCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_ESTADOPERSONA_ESTADOPERSONACODIGO = "estadoPersonaEstadoPersonaCodigo";
    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_PERSONACODIGO = "Codigo";    
    /** <code>personaCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONACODIGO = "personaCodigo";
    // Field (NumIdentificacion)
    /** <code>NumIdentificacion</code> field name. */
    public static final String FLD_PERSONANUMIDENTIFICACION = "NumIdentificacion";    
    /** <code>NumIdentificacion</code> field length. */
    public static final int FLD_PERSONANUMIDENTIFICACIONLENGTH = 60;
    /** <code>personaNumIdentificacion</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONANUMIDENTIFICACION = "personaNumIdentificacion";
    // Field (TipoPersona)
    /** <code>TipoPersona</code> field name. */
    public static final String FLD_PERSONATIPOPERSONA = "TipoPersona";    
    /** <code>TipoPersona</code> field length. */
    public static final int FLD_PERSONATIPOPERSONALENGTH = 1;
    /** <code>personaTipoPersona</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONATIPOPERSONA = "personaTipoPersona";
    // Field (PrimerNombre)
    /** <code>PrimerNombre</code> field name. */
    public static final String FLD_PERSONAPRIMERNOMBRE = "PrimerNombre";    
    /** <code>PrimerNombre</code> field length. */
    public static final int FLD_PERSONAPRIMERNOMBRELENGTH = 50;
    /** <code>personaPrimerNombre</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONAPRIMERNOMBRE = "personaPrimerNombre";
    // Field (SegundoNombre)
    /** <code>SegundoNombre</code> field name. */
    public static final String FLD_PERSONASEGUNDONOMBRE = "SegundoNombre";    
    /** <code>SegundoNombre</code> field length. */
    public static final int FLD_PERSONASEGUNDONOMBRELENGTH = 50;
    /** <code>personaSegundoNombre</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONASEGUNDONOMBRE = "personaSegundoNombre";
    // Field (PrimerApellido)
    /** <code>PrimerApellido</code> field name. */
    public static final String FLD_PERSONAPRIMERAPELLIDO = "PrimerApellido";    
    /** <code>PrimerApellido</code> field length. */
    public static final int FLD_PERSONAPRIMERAPELLIDOLENGTH = 50;
    /** <code>personaPrimerApellido</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONAPRIMERAPELLIDO = "personaPrimerApellido";
    // Field (SegundoApellido)
    /** <code>SegundoApellido</code> field name. */
    public static final String FLD_PERSONASEGUNDOAPELLIDO = "SegundoApellido";    
    /** <code>SegundoApellido</code> field length. */
    public static final int FLD_PERSONASEGUNDOAPELLIDOLENGTH = 50;
    /** <code>personaSegundoApellido</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONASEGUNDOAPELLIDO = "personaSegundoApellido";
    // Field (RazonSocial)
    /** <code>RazonSocial</code> field name. */
    public static final String FLD_PERSONARAZONSOCIAL = "RazonSocial";    
    /** <code>RazonSocial</code> field length. */
    public static final int FLD_PERSONARAZONSOCIALLENGTH = 254;
    /** <code>personaRazonSocial</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONARAZONSOCIAL = "personaRazonSocial";
    // Field (FechaNacimiento)
    /** <code>FechaNacimiento</code> field name. */
    public static final String FLD_PERSONAFECHANACIMIENTO = "FechaNacimiento";    
    /** <code>personaFechaNacimiento</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONAFECHANACIMIENTO = "personaFechaNacimiento";
    // Field (Genero)
    /** <code>Genero</code> field name. */
    public static final String FLD_PERSONAGENERO = "Genero";    
    /** <code>Genero</code> field length. */
    public static final int FLD_PERSONAGENEROLENGTH = 1;
    /** <code>personaGenero</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONAGENERO = "personaGenero";
    // Field (IndicadorExtranjero)
    /** <code>IndicadorExtranjero</code> field name. */
    public static final String FLD_PERSONAINDICADOREXTRANJERO = "IndicadorExtranjero";    
    /** <code>personaIndicadorExtranjero</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONAINDICADOREXTRANJERO = "personaIndicadorExtranjero";
    // Field (TelefonoFijo)
    /** <code>TelefonoFijo</code> field name. */
    public static final String FLD_PERSONATELEFONOFIJO = "TelefonoFijo";    
    /** <code>TelefonoFijo</code> field length. */
    public static final int FLD_PERSONATELEFONOFIJOLENGTH = 15;
    /** <code>personaTelefonoFijo</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONATELEFONOFIJO = "personaTelefonoFijo";
    // Field (TelefonoCelular)
    /** <code>TelefonoCelular</code> field name. */
    public static final String FLD_PERSONATELEFONOCELULAR = "TelefonoCelular";    
    /** <code>TelefonoCelular</code> field length. */
    public static final int FLD_PERSONATELEFONOCELULARLENGTH = 15;
    /** <code>personaTelefonoCelular</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONATELEFONOCELULAR = "personaTelefonoCelular";
    // Field (CorreoElectronico)
    /** <code>CorreoElectronico</code> field name. */
    public static final String FLD_PERSONACORREOELECTRONICO = "CorreoElectronico";    
    /** <code>CorreoElectronico</code> field length. */
    public static final int FLD_PERSONACORREOELECTRONICOLENGTH = 100;
    /** <code>personaCorreoElectronico</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONACORREOELECTRONICO = "personaCorreoElectronico";
    // Field (TieneEPSSanitas)
    /** <code>TieneEPSSanitas</code> field name. */
    public static final String FLD_PERSONATIENEEPSSANITAS = "TieneEPSSanitas";    
    /** <code>personaTieneEPSSanitas</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONATIENEEPSSANITAS = "personaTieneEPSSanitas";
    // Field (RechazadoAfiliacion)
    /** <code>RechazadoAfiliacion</code> field name. */
    public static final String FLD_PERSONARECHAZADOAFILIACION = "RechazadoAfiliacion";    
    /** <code>RechazadoAfiliacion</code> field length. */
    public static final int FLD_PERSONARECHAZADOAFILIACIONLENGTH = 50;
    /** <code>personaRechazadoAfiliacion</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONARECHAZADOAFILIACION = "personaRechazadoAfiliacion";
    // Field (DatosBasicosMod)
    /** <code>DatosBasicosMod</code> field name. */
    public static final String FLD_PERSONADATOSBASICOSMOD = "DatosBasicosMod";    
    /** <code>personaDatosBasicosMod</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONADATOSBASICOSMOD = "personaDatosBasicosMod";

    // Component role (TipoIdentificacion)
    /** <code>TipoIdentificacion</code> role id. */
    public static final String ROLE_ID_TIPOIDENTIFICACION = "Agr_1431958192128215_Alias";
    /** <code>TipoIdentificacion</code> role name. */
    public static final String ROLE_NAME_TIPOIDENTIFICACION = "tipoIdentificacion";
    /** <code>TipoIdentificacion</code> role alias. */
    public static final String ROLE_ALIAS_TIPOIDENTIFICACION = "Tipo identificación";

    /** <code>TipoIdentificacion</code> inverse role name. */
    public static final String ROLE_INVNAME_TIPOIDENTIFICACION = TipoIdentificacionConstants.ROLE_NAME_PERSONAS;
    /** <code>TipoIdentificacion</code> role facet sequence. */
    public static final String PATH_FACETS_TIPOIDENTIFICACION = "";
    /** <code>TipoIdentificacion</code> role target class. */
    public static final String ROLE_TARGET_TIPOIDENTIFICACION = TipoIdentificacionConstants.CLASS_NAME;

    /** Agents allowed to navigate through TipoIdentificacion **/
    public static final String TIPOIDENTIFICACION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (DepartamentoNacimiento)
    /** <code>DepartamentoNacimiento</code> role id. */
    public static final String ROLE_ID_DEPARTAMENTONACIMIENTO = "Agr_1432214437888620_Alias";
    /** <code>DepartamentoNacimiento</code> role name. */
    public static final String ROLE_NAME_DEPARTAMENTONACIMIENTO = "departamentoNacimiento";
    /** <code>DepartamentoNacimiento</code> role alias. */
    public static final String ROLE_ALIAS_DEPARTAMENTONACIMIENTO = "Departamento nacimiento";

    /** <code>DepartamentoNacimiento</code> inverse role name. */
    public static final String ROLE_INVNAME_DEPARTAMENTONACIMIENTO = DepartamentoConstants.ROLE_NAME_PERSONAS;
    /** <code>DepartamentoNacimiento</code> role facet sequence. */
    public static final String PATH_FACETS_DEPARTAMENTONACIMIENTO = "";
    /** <code>DepartamentoNacimiento</code> role target class. */
    public static final String ROLE_TARGET_DEPARTAMENTONACIMIENTO = DepartamentoConstants.CLASS_NAME;

    /** Agents allowed to navigate through DepartamentoNacimiento **/
    public static final String DEPARTAMENTONACIMIENTO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (MunicipioNacimiento)
    /** <code>MunicipioNacimiento</code> role id. */
    public static final String ROLE_ID_MUNICIPIONACIMIENTO = "Agr_1432214568960361_Alias";
    /** <code>MunicipioNacimiento</code> role name. */
    public static final String ROLE_NAME_MUNICIPIONACIMIENTO = "municipioNacimiento";
    /** <code>MunicipioNacimiento</code> role alias. */
    public static final String ROLE_ALIAS_MUNICIPIONACIMIENTO = "Municipio nacimiento";

    /** <code>MunicipioNacimiento</code> inverse role name. */
    public static final String ROLE_INVNAME_MUNICIPIONACIMIENTO = MunicipioConstants.ROLE_NAME_PERSONAS;
    /** <code>MunicipioNacimiento</code> role facet sequence. */
    public static final String PATH_FACETS_MUNICIPIONACIMIENTO = "";
    /** <code>MunicipioNacimiento</code> role target class. */
    public static final String ROLE_TARGET_MUNICIPIONACIMIENTO = MunicipioConstants.CLASS_NAME;

    /** Agents allowed to navigate through MunicipioNacimiento **/
    public static final String MUNICIPIONACIMIENTO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (EstadoCivil)
    /** <code>EstadoCivil</code> role id. */
    public static final String ROLE_ID_ESTADOCIVIL = "Agr_1432214568960421_Alias";
    /** <code>EstadoCivil</code> role name. */
    public static final String ROLE_NAME_ESTADOCIVIL = "estadoCivil";
    /** <code>EstadoCivil</code> role alias. */
    public static final String ROLE_ALIAS_ESTADOCIVIL = "Estado civil";

    /** <code>EstadoCivil</code> inverse role name. */
    public static final String ROLE_INVNAME_ESTADOCIVIL = EstadoCivilConstants.ROLE_NAME_PERSONAS;
    /** <code>EstadoCivil</code> role facet sequence. */
    public static final String PATH_FACETS_ESTADOCIVIL = "";
    /** <code>EstadoCivil</code> role target class. */
    public static final String ROLE_TARGET_ESTADOCIVIL = EstadoCivilConstants.CLASS_NAME;

    /** Agents allowed to navigate through EstadoCivil **/
    public static final String ESTADOCIVIL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (EstadoPersona)
    /** <code>EstadoPersona</code> role id. */
    public static final String ROLE_ID_ESTADOPERSONA = "Agr_1432223481856902_Alias";
    /** <code>EstadoPersona</code> role name. */
    public static final String ROLE_NAME_ESTADOPERSONA = "estadoPersona";
    /** <code>EstadoPersona</code> role alias. */
    public static final String ROLE_ALIAS_ESTADOPERSONA = "Estado persona";

    /** <code>EstadoPersona</code> inverse role name. */
    public static final String ROLE_INVNAME_ESTADOPERSONA = EstadoPersonaConstants.ROLE_NAME_PERSONAS;
    /** <code>EstadoPersona</code> role facet sequence. */
    public static final String PATH_FACETS_ESTADOPERSONA = "";
    /** <code>EstadoPersona</code> role target class. */
    public static final String ROLE_TARGET_ESTADOPERSONA = EstadoPersonaConstants.CLASS_NAME;

    /** Agents allowed to navigate through EstadoPersona **/
    public static final String ESTADOPERSONA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Compound role (SolicitudesContratante)
    /** <code>SolicitudesContratante</code> role id. */
    public static final String ROLE_ID_SOLICITUDESCONTRATANTE = "Agr_1431959109632733_Alias";
    /** <code>SolicitudesContratante</code> role name. */
    public static final String ROLE_NAME_SOLICITUDESCONTRATANTE = "solicitudesContratante";
    /** <code>ContratantePersona</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUDESCONTRATANTE = "Solicitudes";


    /** <code>SolicitudesContratante</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUDESCONTRATANTE = SolicitudConstants.ROLE_NAME_CONTRATANTEPERSONA;
    /** <code>SolicitudesContratante</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUDESCONTRATANTE = "";
    /** <code>SolicitudesContratante</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUDESCONTRATANTE = SolicitudConstants.CLASS_NAME;
    /** Agents allowed to navigate through SolicitudesContratante **/
    public static final String SOLICITUDESCONTRATANTE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (SolicitudesTitular)
    /** <code>SolicitudesTitular</code> role id. */
    public static final String ROLE_ID_SOLICITUDESTITULAR = "Agr_1431965007872646_Alias";
    /** <code>SolicitudesTitular</code> role name. */
    public static final String ROLE_NAME_SOLICITUDESTITULAR = "solicitudesTitular";
    /** <code>TitularPersona</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUDESTITULAR = "Solicitudes";


    /** <code>SolicitudesTitular</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUDESTITULAR = SolicitudConstants.ROLE_NAME_TITULARPERSONA;
    /** <code>SolicitudesTitular</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUDESTITULAR = "";
    /** <code>SolicitudesTitular</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUDESTITULAR = SolicitudConstants.CLASS_NAME;
    /** Agents allowed to navigate through SolicitudesTitular **/
    public static final String SOLICITUDESTITULAR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (Direcciones)
    /** <code>Direcciones</code> role id. */
    public static final String ROLE_ID_DIRECCIONES = "Agr_1432205131776715_Alias";
    /** <code>Direcciones</code> role name. */
    public static final String ROLE_NAME_DIRECCIONES = "direcciones";
    /** <code>Persona</code> role alias. */
    public static final String ROLE_ALIAS_DIRECCIONES = "Direcciones";


    /** <code>Direcciones</code> inverse role name. */
    public static final String ROLE_INVNAME_DIRECCIONES = DireccionConstants.ROLE_NAME_PERSONA;
    /** <code>Direcciones</code> role facet sequence. */
    public static final String PATH_FACETS_DIRECCIONES = "";
    /** <code>Direcciones</code> role target class. */
    public static final String ROLE_TARGET_DIRECCIONES = DireccionConstants.CLASS_NAME;
    /** Agents allowed to navigate through Direcciones **/
    public static final String DIRECCIONES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (Usuarios)
    /** <code>Usuarios</code> role id. */
    public static final String ROLE_ID_USUARIOS = "Agr_1432633868288463_Alias";
    /** <code>Usuarios</code> role name. */
    public static final String ROLE_NAME_USUARIOS = "usuarios";
    /** <code>UsuarioPersona</code> role alias. */
    public static final String ROLE_ALIAS_USUARIOS = "Usuarios";


    /** <code>Usuarios</code> inverse role name. */
    public static final String ROLE_INVNAME_USUARIOS = UsuarioConstants.ROLE_NAME_USUARIOPERSONA;
    /** <code>Usuarios</code> role facet sequence. */
    public static final String PATH_FACETS_USUARIOS = "";
    /** <code>Usuarios</code> role target class. */
    public static final String ROLE_TARGET_USUARIOS = UsuarioConstants.CLASS_NAME;
    /** Agents allowed to navigate through Usuarios **/
    public static final String USUARIOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (DocumentosG)
    /** <code>DocumentosG</code> role id. */
    public static final String ROLE_ID_DOCUMENTOSG = "Agr_1434447904768518_Alias";
    /** <code>DocumentosG</code> role name. */
    public static final String ROLE_NAME_DOCUMENTOSG = "documentosG";
    /** <code>Persona</code> role alias. */
    public static final String ROLE_ALIAS_DOCUMENTOSG = "Documentos";


    /** <code>DocumentosG</code> inverse role name. */
    public static final String ROLE_INVNAME_DOCUMENTOSG = DocumentoGConstants.ROLE_NAME_PERSONA;
    /** <code>DocumentosG</code> role facet sequence. */
    public static final String PATH_FACETS_DOCUMENTOSG = "";
    /** <code>DocumentosG</code> role target class. */
    public static final String ROLE_TARGET_DOCUMENTOSG = DocumentoGConstants.CLASS_NAME;
    /** Agents allowed to navigate through DocumentosG **/
    public static final String DOCUMENTOSG_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431886233600805Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear persona";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personacrearpagrDepartamentoNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACREARPAGRDEPARTAMENTONACIMIENTO = "p_agrDepartamentoNacimiento";
    /** <code>personacrearpagrDepartamentoNacimiento</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACREARPAGRDEPARTAMENTONACIMIENTO = "Clas_1431886233600805Ser_1Arg_18_Alias";
    /** <code>personacrearpagrDepartamentoNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACREARPAGRDEPARTAMENTONACIMIENTO = "Departamento nacimiento";
    /** <code>personacrearpagrMunicipioNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACREARPAGRMUNICIPIONACIMIENTO = "p_agrMunicipioNacimiento";
    /** <code>personacrearpagrMunicipioNacimiento</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACREARPAGRMUNICIPIONACIMIENTO = "Clas_1431886233600805Ser_1Arg_19_Alias";
    /** <code>personacrearpagrMunicipioNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACREARPAGRMUNICIPIONACIMIENTO = "Municipio nacimiento";
    /** <code>personacrearpagrEstadoCivil</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACREARPAGRESTADOCIVIL = "p_agrEstadoCivil";
    /** <code>personacrearpagrEstadoCivil</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACREARPAGRESTADOCIVIL = "Clas_1431886233600805Ser_1Arg_22_Alias";
    /** <code>personacrearpagrEstadoCivil</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACREARPAGRESTADOCIVIL = "Estado civil";
    /** <code>personacrearpagrEstadoPersona</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACREARPAGRESTADOPERSONA = "p_agrEstadoPersona";
    /** <code>personacrearpagrEstadoPersona</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACREARPAGRESTADOPERSONA = "Clas_1431886233600805Ser_1Arg_23_Alias";
    /** <code>personacrearpagrEstadoPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACREARPAGRESTADOPERSONA = "Estado persona";
    /** <code>personacrearpagrTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACREARPAGRTIPOIDENTIFICACION = "p_agrTipoIdentificacion";
    /** <code>personacrearpagrTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACREARPAGRTIPOIDENTIFICACION = "Clas_1431886233600805Ser_1Arg_26_Alias";
    /** <code>personacrearpagrTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACREARPAGRTIPOIDENTIFICACION = "Tipo identificación";
    /** <code>personacrearpatrNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACREARPATRNUMIDENTIFICACION = "p_atrNumIdentificacion";
    /** <code>personacrearpatrNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACREARPATRNUMIDENTIFICACION = "Clas_1431886233600805Ser_1Arg_3_Alias";
    /** <code>personacrearpatrNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACREARPATRNUMIDENTIFICACION = "Nº Identificación";
    /** <code>personacrearpatrTipoPersona</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACREARPATRTIPOPERSONA = "p_atrTipoPersona";
    /** <code>personacrearpatrTipoPersona</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACREARPATRTIPOPERSONA = "Clas_1431886233600805Ser_1Arg_4_Alias";
    /** <code>personacrearpatrTipoPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACREARPATRTIPOPERSONA = "Tipo persona";
    /** <code>personacrearpatrPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACREARPATRPRIMERNOMBRE = "p_atrPrimerNombre";
    /** <code>personacrearpatrPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACREARPATRPRIMERNOMBRE = "Clas_1431886233600805Ser_1Arg_5_Alias";
    /** <code>personacrearpatrPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACREARPATRPRIMERNOMBRE = "Primer nombre";
    /** <code>personacrearpatrSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACREARPATRSEGUNDONOMBRE = "p_atrSegundoNombre";
    /** <code>personacrearpatrSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACREARPATRSEGUNDONOMBRE = "Clas_1431886233600805Ser_1Arg_6_Alias";
    /** <code>personacrearpatrSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACREARPATRSEGUNDONOMBRE = "Segundo nombre";
    /** <code>personacrearpatrPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACREARPATRPRIMERAPELLIDO = "p_atrPrimerApellido";
    /** <code>personacrearpatrPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACREARPATRPRIMERAPELLIDO = "Clas_1431886233600805Ser_1Arg_7_Alias";
    /** <code>personacrearpatrPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACREARPATRPRIMERAPELLIDO = "Primer Apellido";
    /** <code>personacrearpatrSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACREARPATRSEGUNDOAPELLIDO = "p_atrSegundoApellido";
    /** <code>personacrearpatrSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACREARPATRSEGUNDOAPELLIDO = "Clas_1431886233600805Ser_1Arg_8_Alias";
    /** <code>personacrearpatrSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACREARPATRSEGUNDOAPELLIDO = "Segundo Apellido";
    /** <code>personacrearpatrRazonSocial</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACREARPATRRAZONSOCIAL = "p_atrRazonSocial";
    /** <code>personacrearpatrRazonSocial</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACREARPATRRAZONSOCIAL = "Clas_1431886233600805Ser_1Arg_9_Alias";
    /** <code>personacrearpatrRazonSocial</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACREARPATRRAZONSOCIAL = "Razón Social";
    /** <code>personacrearpatrFechaNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACREARPATRFECHANACIMIENTO = "p_atrFechaNacimiento";
    /** <code>personacrearpatrFechaNacimiento</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACREARPATRFECHANACIMIENTO = "Clas_1431886233600805Ser_1Arg_10_Alias";
    /** <code>personacrearpatrFechaNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACREARPATRFECHANACIMIENTO = "Fecha nacimiento";
    /** <code>personacrearpatrGenero</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACREARPATRGENERO = "p_atrGenero";
    /** <code>personacrearpatrGenero</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACREARPATRGENERO = "Clas_1431886233600805Ser_1Arg_11_Alias";
    /** <code>personacrearpatrGenero</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACREARPATRGENERO = "Género";
    /** <code>personacrearpatrIndicadorExtranjero</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACREARPATRINDICADOREXTRANJERO = "p_atrIndicadorExtranjero";
    /** <code>personacrearpatrIndicadorExtranjero</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACREARPATRINDICADOREXTRANJERO = "Clas_1431886233600805Ser_1Arg_12_Alias";
    /** <code>personacrearpatrIndicadorExtranjero</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACREARPATRINDICADOREXTRANJERO = "Indicador extranjero";
    /** <code>personacrearpatrTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACREARPATRTELEFONOFIJO = "p_atrTelefonoFijo";
    /** <code>personacrearpatrTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACREARPATRTELEFONOFIJO = "Clas_1431886233600805Ser_1Arg_13_Alias";
    /** <code>personacrearpatrTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACREARPATRTELEFONOFIJO = "Teléfono fijo";
    /** <code>personacrearpatrTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACREARPATRTELEFONOCELULAR = "p_atrTelefonoCelular";
    /** <code>personacrearpatrTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACREARPATRTELEFONOCELULAR = "Clas_1431886233600805Ser_1Arg_14_Alias";
    /** <code>personacrearpatrTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACREARPATRTELEFONOCELULAR = "Teléfono celular";
    /** <code>personacrearpatrCorreoElectronico</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACREARPATRCORREOELECTRONICO = "p_atrCorreoElectronico";
    /** <code>personacrearpatrCorreoElectronico</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACREARPATRCORREOELECTRONICO = "Clas_1431886233600805Ser_1Arg_15_Alias";
    /** <code>personacrearpatrCorreoElectronico</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACREARPATRCORREOELECTRONICO = "Correo electrónico";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431886233600805Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar persona";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaeliminarpthisPersona</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_PERSONAELIMINARPTHISPERSONA = "p_thisPersona";
    /** <code>personaeliminarpthisPersona</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_PERSONAELIMINARPTHISPERSONA = "Clas_1431886233600805Ser_2Arg_1_Alias";
    /** <code>personaeliminarpthisPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_PERSONAELIMINARPTHISPERSONA = "Persona";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1431886233600805Ser_4_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar persona";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personamodificarpthisPersona</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PERSONAMODIFICARPTHISPERSONA = "p_thisPersona";
    /** <code>personamodificarpthisPersona</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PERSONAMODIFICARPTHISPERSONA = "Clas_1431886233600805Ser_4Arg_1_Alias";
    /** <code>personamodificarpthisPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PERSONAMODIFICARPTHISPERSONA = "Persona";
    /** <code>personamodificarpPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PERSONAMODIFICARPPRIMERNOMBRE = "p_PrimerNombre";
    /** <code>personamodificarpPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PERSONAMODIFICARPPRIMERNOMBRE = "Clas_1431886233600805Ser_4Arg_2_Alias";
    /** <code>personamodificarpPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PERSONAMODIFICARPPRIMERNOMBRE = "Primer nombre";
    /** <code>personamodificarpSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PERSONAMODIFICARPSEGUNDONOMBRE = "p_SegundoNombre";
    /** <code>personamodificarpSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PERSONAMODIFICARPSEGUNDONOMBRE = "Clas_1431886233600805Ser_4Arg_3_Alias";
    /** <code>personamodificarpSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PERSONAMODIFICARPSEGUNDONOMBRE = "Segundo nombre";
    /** <code>personamodificarpPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PERSONAMODIFICARPPRIMERAPELLIDO = "p_PrimerApellido";
    /** <code>personamodificarpPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PERSONAMODIFICARPPRIMERAPELLIDO = "Clas_1431886233600805Ser_4Arg_4_Alias";
    /** <code>personamodificarpPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PERSONAMODIFICARPPRIMERAPELLIDO = "Primer Apellido";
    /** <code>personamodificarpSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PERSONAMODIFICARPSEGUNDOAPELLIDO = "p_SegundoApellido";
    /** <code>personamodificarpSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PERSONAMODIFICARPSEGUNDOAPELLIDO = "Clas_1431886233600805Ser_4Arg_5_Alias";
    /** <code>personamodificarpSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PERSONAMODIFICARPSEGUNDOAPELLIDO = "Segundo Apellido";
    /** <code>personamodificarpRazonSocial</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PERSONAMODIFICARPRAZONSOCIAL = "p_RazonSocial";
    /** <code>personamodificarpRazonSocial</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PERSONAMODIFICARPRAZONSOCIAL = "Clas_1431886233600805Ser_4Arg_6_Alias";
    /** <code>personamodificarpRazonSocial</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PERSONAMODIFICARPRAZONSOCIAL = "Razón Social";
    /** <code>personamodificarpFechaNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PERSONAMODIFICARPFECHANACIMIENTO = "p_FechaNacimiento";
    /** <code>personamodificarpFechaNacimiento</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PERSONAMODIFICARPFECHANACIMIENTO = "Clas_1431886233600805Ser_4Arg_7_Alias";
    /** <code>personamodificarpFechaNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PERSONAMODIFICARPFECHANACIMIENTO = "Fecha nacimiento";
    /** <code>personamodificarpGenero</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PERSONAMODIFICARPGENERO = "p_Genero";
    /** <code>personamodificarpGenero</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PERSONAMODIFICARPGENERO = "Clas_1431886233600805Ser_4Arg_8_Alias";
    /** <code>personamodificarpGenero</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PERSONAMODIFICARPGENERO = "Género";
    /** <code>personamodificarpIndicadorExtranjero</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PERSONAMODIFICARPINDICADOREXTRANJERO = "p_IndicadorExtranjero";
    /** <code>personamodificarpIndicadorExtranjero</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PERSONAMODIFICARPINDICADOREXTRANJERO = "Clas_1431886233600805Ser_4Arg_9_Alias";
    /** <code>personamodificarpIndicadorExtranjero</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PERSONAMODIFICARPINDICADOREXTRANJERO = "Indicador extranjero";
    /** <code>personamodificarpTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PERSONAMODIFICARPTELEFONOFIJO = "p_TelefonoFijo";
    /** <code>personamodificarpTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PERSONAMODIFICARPTELEFONOFIJO = "Clas_1431886233600805Ser_4Arg_10_Alias";
    /** <code>personamodificarpTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PERSONAMODIFICARPTELEFONOFIJO = "Teléfono fijo";
    /** <code>personamodificarpTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PERSONAMODIFICARPTELEFONOCELULAR = "p_TelefonoCelular";
    /** <code>personamodificarpTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PERSONAMODIFICARPTELEFONOCELULAR = "Clas_1431886233600805Ser_4Arg_11_Alias";
    /** <code>personamodificarpTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PERSONAMODIFICARPTELEFONOCELULAR = "Teléfono celular";
    /** <code>personamodificarpCorreoElectronico</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PERSONAMODIFICARPCORREOELECTRONICO = "p_CorreoElectronico";
    /** <code>personamodificarpCorreoElectronico</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PERSONAMODIFICARPCORREOELECTRONICO = "Clas_1431886233600805Ser_4Arg_12_Alias";
    /** <code>personamodificarpCorreoElectronico</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PERSONAMODIFICARPCORREOELECTRONICO = "Correo electrónico";
    /** <code>personamodificarpTieneEPSSanitas</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PERSONAMODIFICARPTIENEEPSSANITAS = "p_TieneEPSSanitas";
    /** <code>personamodificarpTieneEPSSanitas</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PERSONAMODIFICARPTIENEEPSSANITAS = "Clas_1431886233600805Ser_4Arg_13_Alias";
    /** <code>personamodificarpTieneEPSSanitas</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PERSONAMODIFICARPTIENEEPSSANITAS = "Tiene EPS Sanitas";
    /** <code>personamodificarpRechazadoAfiliacion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PERSONAMODIFICARPRECHAZADOAFILIACION = "p_RechazadoAfiliacion";
    /** <code>personamodificarpRechazadoAfiliacion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PERSONAMODIFICARPRECHAZADOAFILIACION = "Clas_1431886233600805Ser_4Arg_14_Alias";
    /** <code>personamodificarpRechazadoAfiliacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PERSONAMODIFICARPRECHAZADOAFILIACION = "Rechazado afiliación";
    /** <code>personamodificarpNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PERSONAMODIFICARPNUMIDENTIFICACION = "p_NumIdentificacion";
    /** <code>personamodificarpNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PERSONAMODIFICARPNUMIDENTIFICACION = "Clas_1431886233600805Ser_4Arg_15_Alias";
    /** <code>personamodificarpNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PERSONAMODIFICARPNUMIDENTIFICACION = "Nº Identificación";
    // Service (InsContratanteSolicitud)
    /** <code>InsContratanteSolicitud</code> service id. */
    public static final String SERV_ID_INSCONTRATANTESOLICITUD = "Clas_1431886233600805Ser_5_Alias";
    /** <code>InsContratanteSolicitud</code> service name. */
    public static final String SERV_NAME_INSCONTRATANTESOLICITUD = "InsContratanteSolicitud";
    /** <code>InsContratanteSolicitud</code> service alias. */
    public static final String SERV_ALIAS_INSCONTRATANTESOLICITUD = "InsContratanteSolicitud";
    /** Agents allowed to execute the service InsContratanteSolicitud **/
    public static final String INSCONTRATANTESOLICITUD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaInsContratanteSolicitudpthisPersona</code> inbound argument name. */
    public static final String ARG_NAME_INSCONTRATANTESOLICITUD_PERSONAINSCONTRATANTESOLICITUDPTHISPERSONA = "p_thisPersona";
    /** <code>personaInsContratanteSolicitudpthisPersona</code> inbound argument id. */
    public static final String ARG_ID_INSCONTRATANTESOLICITUD_PERSONAINSCONTRATANTESOLICITUDPTHISPERSONA = "Clas_1431886233600805Ser_5Arg_1_Alias";
    /** <code>personaInsContratanteSolicitudpthisPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSCONTRATANTESOLICITUD_PERSONAINSCONTRATANTESOLICITUDPTHISPERSONA = "Contratante";
    /** <code>personaInsContratanteSolicitudpevcSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_INSCONTRATANTESOLICITUD_PERSONAINSCONTRATANTESOLICITUDPEVCSOLICITUD = "p_evcSolicitud";
    /** <code>personaInsContratanteSolicitudpevcSolicitud</code> inbound argument id. */
    public static final String ARG_ID_INSCONTRATANTESOLICITUD_PERSONAINSCONTRATANTESOLICITUDPEVCSOLICITUD = "Clas_1431886233600805Ser_5Arg_2_Alias";
    /** <code>personaInsContratanteSolicitudpevcSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSCONTRATANTESOLICITUD_PERSONAINSCONTRATANTESOLICITUDPEVCSOLICITUD = "Solicitudes";
    // Service (InsTitularSolicitud)
    /** <code>InsTitularSolicitud</code> service id. */
    public static final String SERV_ID_INSTITULARSOLICITUD = "Clas_1431886233600805Ser_6_Alias";
    /** <code>InsTitularSolicitud</code> service name. */
    public static final String SERV_NAME_INSTITULARSOLICITUD = "InsTitularSolicitud";
    /** <code>InsTitularSolicitud</code> service alias. */
    public static final String SERV_ALIAS_INSTITULARSOLICITUD = "InsTitularSolicitud";
    /** Agents allowed to execute the service InsTitularSolicitud **/
    public static final String INSTITULARSOLICITUD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaInsTitularSolicitudpthisPersona</code> inbound argument name. */
    public static final String ARG_NAME_INSTITULARSOLICITUD_PERSONAINSTITULARSOLICITUDPTHISPERSONA = "p_thisPersona";
    /** <code>personaInsTitularSolicitudpthisPersona</code> inbound argument id. */
    public static final String ARG_ID_INSTITULARSOLICITUD_PERSONAINSTITULARSOLICITUDPTHISPERSONA = "Clas_1431886233600805Ser_6Arg_1_Alias";
    /** <code>personaInsTitularSolicitudpthisPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTITULARSOLICITUD_PERSONAINSTITULARSOLICITUDPTHISPERSONA = "Titular";
    /** <code>personaInsTitularSolicitudpevcSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_INSTITULARSOLICITUD_PERSONAINSTITULARSOLICITUDPEVCSOLICITUD = "p_evcSolicitud";
    /** <code>personaInsTitularSolicitudpevcSolicitud</code> inbound argument id. */
    public static final String ARG_ID_INSTITULARSOLICITUD_PERSONAINSTITULARSOLICITUDPEVCSOLICITUD = "Clas_1431886233600805Ser_6Arg_2_Alias";
    /** <code>personaInsTitularSolicitudpevcSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTITULARSOLICITUD_PERSONAINSTITULARSOLICITUDPEVCSOLICITUD = "Solicitudes";
    // Service (InsDptoNacimientoPersona)
    /** <code>InsDptoNacimientoPersona</code> service id. */
    public static final String SERV_ID_INSDPTONACIMIENTOPERSONA = "Clas_1431886233600805Ser_12_Alias";
    /** <code>InsDptoNacimientoPersona</code> service name. */
    public static final String SERV_NAME_INSDPTONACIMIENTOPERSONA = "InsDptoNacimientoPersona";
    /** <code>InsDptoNacimientoPersona</code> service alias. */
    public static final String SERV_ALIAS_INSDPTONACIMIENTOPERSONA = "InsDptoNacimientoPersona";
    /** Agents allowed to execute the service InsDptoNacimientoPersona **/
    public static final String INSDPTONACIMIENTOPERSONA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaInsDptoNacimientoPersonapthisPersona</code> inbound argument name. */
    public static final String ARG_NAME_INSDPTONACIMIENTOPERSONA_PERSONAINSDPTONACIMIENTOPERSONAPTHISPERSONA = "p_thisPersona";
    /** <code>personaInsDptoNacimientoPersonapthisPersona</code> inbound argument id. */
    public static final String ARG_ID_INSDPTONACIMIENTOPERSONA_PERSONAINSDPTONACIMIENTOPERSONAPTHISPERSONA = "Clas_1431886233600805Ser_12Arg_1_Alias";
    /** <code>personaInsDptoNacimientoPersonapthisPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDPTONACIMIENTOPERSONA_PERSONAINSDPTONACIMIENTOPERSONAPTHISPERSONA = "Personas";
    /** <code>personaInsDptoNacimientoPersonapevcDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_INSDPTONACIMIENTOPERSONA_PERSONAINSDPTONACIMIENTOPERSONAPEVCDEPARTAMENTO = "p_evcDepartamento";
    /** <code>personaInsDptoNacimientoPersonapevcDepartamento</code> inbound argument id. */
    public static final String ARG_ID_INSDPTONACIMIENTOPERSONA_PERSONAINSDPTONACIMIENTOPERSONAPEVCDEPARTAMENTO = "Clas_1431886233600805Ser_12Arg_2_Alias";
    /** <code>personaInsDptoNacimientoPersonapevcDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDPTONACIMIENTOPERSONA_PERSONAINSDPTONACIMIENTOPERSONAPEVCDEPARTAMENTO = "Departamento nacimiento";
    // Service (DelDptoNacimientoPersona)
    /** <code>DelDptoNacimientoPersona</code> service id. */
    public static final String SERV_ID_DELDPTONACIMIENTOPERSONA = "Clas_1431886233600805Ser_13_Alias";
    /** <code>DelDptoNacimientoPersona</code> service name. */
    public static final String SERV_NAME_DELDPTONACIMIENTOPERSONA = "DelDptoNacimientoPersona";
    /** <code>DelDptoNacimientoPersona</code> service alias. */
    public static final String SERV_ALIAS_DELDPTONACIMIENTOPERSONA = "DelDptoNacimientoPersona";
    /** Agents allowed to execute the service DelDptoNacimientoPersona **/
    public static final String DELDPTONACIMIENTOPERSONA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaDelDptoNacimientoPersonapthisPersona</code> inbound argument name. */
    public static final String ARG_NAME_DELDPTONACIMIENTOPERSONA_PERSONADELDPTONACIMIENTOPERSONAPTHISPERSONA = "p_thisPersona";
    /** <code>personaDelDptoNacimientoPersonapthisPersona</code> inbound argument id. */
    public static final String ARG_ID_DELDPTONACIMIENTOPERSONA_PERSONADELDPTONACIMIENTOPERSONAPTHISPERSONA = "Clas_1431886233600805Ser_13Arg_1_Alias";
    /** <code>personaDelDptoNacimientoPersonapthisPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDPTONACIMIENTOPERSONA_PERSONADELDPTONACIMIENTOPERSONAPTHISPERSONA = "Personas";
    /** <code>personaDelDptoNacimientoPersonapevcDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_DELDPTONACIMIENTOPERSONA_PERSONADELDPTONACIMIENTOPERSONAPEVCDEPARTAMENTO = "p_evcDepartamento";
    /** <code>personaDelDptoNacimientoPersonapevcDepartamento</code> inbound argument id. */
    public static final String ARG_ID_DELDPTONACIMIENTOPERSONA_PERSONADELDPTONACIMIENTOPERSONAPEVCDEPARTAMENTO = "Clas_1431886233600805Ser_13Arg_2_Alias";
    /** <code>personaDelDptoNacimientoPersonapevcDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDPTONACIMIENTOPERSONA_PERSONADELDPTONACIMIENTOPERSONAPEVCDEPARTAMENTO = "Departamento nacimiento";
    // Service (InsMunicipioNacimientoPersona)
    /** <code>InsMunicipioNacimientoPersona</code> service id. */
    public static final String SERV_ID_INSMUNICIPIONACIMIENTOPERSONA = "Clas_1431886233600805Ser_14_Alias";
    /** <code>InsMunicipioNacimientoPersona</code> service name. */
    public static final String SERV_NAME_INSMUNICIPIONACIMIENTOPERSONA = "InsMunicipioNacimientoPersona";
    /** <code>InsMunicipioNacimientoPersona</code> service alias. */
    public static final String SERV_ALIAS_INSMUNICIPIONACIMIENTOPERSONA = "InsMunicipioNacimientoPersona";
    /** Agents allowed to execute the service InsMunicipioNacimientoPersona **/
    public static final String INSMUNICIPIONACIMIENTOPERSONA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaInsMunicipioNacimientoPersonapthisPersona</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIONACIMIENTOPERSONA_PERSONAINSMUNICIPIONACIMIENTOPERSONAPTHISPERSONA = "p_thisPersona";
    /** <code>personaInsMunicipioNacimientoPersonapthisPersona</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIONACIMIENTOPERSONA_PERSONAINSMUNICIPIONACIMIENTOPERSONAPTHISPERSONA = "Clas_1431886233600805Ser_14Arg_1_Alias";
    /** <code>personaInsMunicipioNacimientoPersonapthisPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIONACIMIENTOPERSONA_PERSONAINSMUNICIPIONACIMIENTOPERSONAPTHISPERSONA = "Personas";
    /** <code>personaInsMunicipioNacimientoPersonapevcMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIONACIMIENTOPERSONA_PERSONAINSMUNICIPIONACIMIENTOPERSONAPEVCMUNICIPIO = "p_evcMunicipio";
    /** <code>personaInsMunicipioNacimientoPersonapevcMunicipio</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIONACIMIENTOPERSONA_PERSONAINSMUNICIPIONACIMIENTOPERSONAPEVCMUNICIPIO = "Clas_1431886233600805Ser_14Arg_2_Alias";
    /** <code>personaInsMunicipioNacimientoPersonapevcMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIONACIMIENTOPERSONA_PERSONAINSMUNICIPIONACIMIENTOPERSONAPEVCMUNICIPIO = "Municipio nacimiento";
    // Service (DelMunicipioNacimientoPersona)
    /** <code>DelMunicipioNacimientoPersona</code> service id. */
    public static final String SERV_ID_DELMUNICIPIONACIMIENTOPERSONA = "Clas_1431886233600805Ser_15_Alias";
    /** <code>DelMunicipioNacimientoPersona</code> service name. */
    public static final String SERV_NAME_DELMUNICIPIONACIMIENTOPERSONA = "DelMunicipioNacimientoPersona";
    /** <code>DelMunicipioNacimientoPersona</code> service alias. */
    public static final String SERV_ALIAS_DELMUNICIPIONACIMIENTOPERSONA = "DelMunicipioNacimientoPersona";
    /** Agents allowed to execute the service DelMunicipioNacimientoPersona **/
    public static final String DELMUNICIPIONACIMIENTOPERSONA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaDelMunicipioNacimientoPersonapthisPersona</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIONACIMIENTOPERSONA_PERSONADELMUNICIPIONACIMIENTOPERSONAPTHISPERSONA = "p_thisPersona";
    /** <code>personaDelMunicipioNacimientoPersonapthisPersona</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIONACIMIENTOPERSONA_PERSONADELMUNICIPIONACIMIENTOPERSONAPTHISPERSONA = "Clas_1431886233600805Ser_15Arg_1_Alias";
    /** <code>personaDelMunicipioNacimientoPersonapthisPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIONACIMIENTOPERSONA_PERSONADELMUNICIPIONACIMIENTOPERSONAPTHISPERSONA = "Personas";
    /** <code>personaDelMunicipioNacimientoPersonapevcMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIONACIMIENTOPERSONA_PERSONADELMUNICIPIONACIMIENTOPERSONAPEVCMUNICIPIO = "p_evcMunicipio";
    /** <code>personaDelMunicipioNacimientoPersonapevcMunicipio</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIONACIMIENTOPERSONA_PERSONADELMUNICIPIONACIMIENTOPERSONAPEVCMUNICIPIO = "Clas_1431886233600805Ser_15Arg_2_Alias";
    /** <code>personaDelMunicipioNacimientoPersonapevcMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIONACIMIENTOPERSONA_PERSONADELMUNICIPIONACIMIENTOPERSONAPEVCMUNICIPIO = "Municipio nacimiento";
    // Service (InsEstadoCivilPersona)
    /** <code>InsEstadoCivilPersona</code> service id. */
    public static final String SERV_ID_INSESTADOCIVILPERSONA = "Clas_1431886233600805Ser_17_Alias";
    /** <code>InsEstadoCivilPersona</code> service name. */
    public static final String SERV_NAME_INSESTADOCIVILPERSONA = "InsEstadoCivilPersona";
    /** <code>InsEstadoCivilPersona</code> service alias. */
    public static final String SERV_ALIAS_INSESTADOCIVILPERSONA = "InsEstadoCivilPersona";
    /** Agents allowed to execute the service InsEstadoCivilPersona **/
    public static final String INSESTADOCIVILPERSONA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaInsEstadoCivilPersonapthisPersona</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOCIVILPERSONA_PERSONAINSESTADOCIVILPERSONAPTHISPERSONA = "p_thisPersona";
    /** <code>personaInsEstadoCivilPersonapthisPersona</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOCIVILPERSONA_PERSONAINSESTADOCIVILPERSONAPTHISPERSONA = "Clas_1431886233600805Ser_17Arg_1_Alias";
    /** <code>personaInsEstadoCivilPersonapthisPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOCIVILPERSONA_PERSONAINSESTADOCIVILPERSONAPTHISPERSONA = "Personas";
    /** <code>personaInsEstadoCivilPersonapevcEstadoCivil</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOCIVILPERSONA_PERSONAINSESTADOCIVILPERSONAPEVCESTADOCIVIL = "p_evcEstadoCivil";
    /** <code>personaInsEstadoCivilPersonapevcEstadoCivil</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOCIVILPERSONA_PERSONAINSESTADOCIVILPERSONAPEVCESTADOCIVIL = "Clas_1431886233600805Ser_17Arg_2_Alias";
    /** <code>personaInsEstadoCivilPersonapevcEstadoCivil</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOCIVILPERSONA_PERSONAINSESTADOCIVILPERSONAPEVCESTADOCIVIL = "Estado civil";
    // Service (DelEstadoCivilPersona)
    /** <code>DelEstadoCivilPersona</code> service id. */
    public static final String SERV_ID_DELESTADOCIVILPERSONA = "Clas_1431886233600805Ser_18_Alias";
    /** <code>DelEstadoCivilPersona</code> service name. */
    public static final String SERV_NAME_DELESTADOCIVILPERSONA = "DelEstadoCivilPersona";
    /** <code>DelEstadoCivilPersona</code> service alias. */
    public static final String SERV_ALIAS_DELESTADOCIVILPERSONA = "DelEstadoCivilPersona";
    /** Agents allowed to execute the service DelEstadoCivilPersona **/
    public static final String DELESTADOCIVILPERSONA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaDelEstadoCivilPersonapthisPersona</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOCIVILPERSONA_PERSONADELESTADOCIVILPERSONAPTHISPERSONA = "p_thisPersona";
    /** <code>personaDelEstadoCivilPersonapthisPersona</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOCIVILPERSONA_PERSONADELESTADOCIVILPERSONAPTHISPERSONA = "Clas_1431886233600805Ser_18Arg_1_Alias";
    /** <code>personaDelEstadoCivilPersonapthisPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOCIVILPERSONA_PERSONADELESTADOCIVILPERSONAPTHISPERSONA = "Personas";
    /** <code>personaDelEstadoCivilPersonapevcEstadoCivil</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOCIVILPERSONA_PERSONADELESTADOCIVILPERSONAPEVCESTADOCIVIL = "p_evcEstadoCivil";
    /** <code>personaDelEstadoCivilPersonapevcEstadoCivil</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOCIVILPERSONA_PERSONADELESTADOCIVILPERSONAPEVCESTADOCIVIL = "Clas_1431886233600805Ser_18Arg_2_Alias";
    /** <code>personaDelEstadoCivilPersonapevcEstadoCivil</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOCIVILPERSONA_PERSONADELESTADOCIVILPERSONAPEVCESTADOCIVIL = "Estado civil";
    // Service (registrarDatosCORE)
    /** <code>registrarDatosCORE</code> service id. */
    public static final String SERV_ID_REGISTRARDATOSCORE = "Clas_1431886233600805Ser_20_Alias";
    /** <code>registrarDatosCORE</code> service name. */
    public static final String SERV_NAME_REGISTRARDATOSCORE = "registrarDatosCORE";
    /** <code>registrarDatosCORE</code> service alias. */
    public static final String SERV_ALIAS_REGISTRARDATOSCORE = "registrarDatosCORE";
    /** Agents allowed to execute the service registrarDatosCORE **/
    public static final String REGISTRARDATOSCORE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaregistrarDatosCOREpthisPersona</code> inbound argument name. */
    public static final String ARG_NAME_REGISTRARDATOSCORE_PERSONAREGISTRARDATOSCOREPTHISPERSONA = "p_thisPersona";
    /** <code>personaregistrarDatosCOREpthisPersona</code> inbound argument id. */
    public static final String ARG_ID_REGISTRARDATOSCORE_PERSONAREGISTRARDATOSCOREPTHISPERSONA = "Clas_1431886233600805Ser_20Arg_1_Alias";
    /** <code>personaregistrarDatosCOREpthisPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_REGISTRARDATOSCORE_PERSONAREGISTRARDATOSCOREPTHISPERSONA = "Persona";
    /** <code>personaregistrarDatosCOREpCodigo</code> inbound argument name. */
    public static final String ARG_NAME_REGISTRARDATOSCORE_PERSONAREGISTRARDATOSCOREPCODIGO = "p_Codigo";
    /** <code>personaregistrarDatosCOREpCodigo</code> inbound argument id. */
    public static final String ARG_ID_REGISTRARDATOSCORE_PERSONAREGISTRARDATOSCOREPCODIGO = "Clas_1431886233600805Ser_20Arg_2_Alias";
    /** <code>personaregistrarDatosCOREpCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_REGISTRARDATOSCORE_PERSONAREGISTRARDATOSCOREPCODIGO = "Código";
    /** <code>personaregistrarDatosCOREpTieneEPSSanitas</code> inbound argument name. */
    public static final String ARG_NAME_REGISTRARDATOSCORE_PERSONAREGISTRARDATOSCOREPTIENEEPSSANITAS = "p_TieneEPSSanitas";
    /** <code>personaregistrarDatosCOREpTieneEPSSanitas</code> inbound argument id. */
    public static final String ARG_ID_REGISTRARDATOSCORE_PERSONAREGISTRARDATOSCOREPTIENEEPSSANITAS = "Clas_1431886233600805Ser_20Arg_3_Alias";
    /** <code>personaregistrarDatosCOREpTieneEPSSanitas</code> inbound argument alias. */
    public static final String ARG_ALIAS_REGISTRARDATOSCORE_PERSONAREGISTRARDATOSCOREPTIENEEPSSANITAS = "Tiene EPS Sanitas";
    /** <code>personaregistrarDatosCOREpRechazadoAfiliacion</code> inbound argument name. */
    public static final String ARG_NAME_REGISTRARDATOSCORE_PERSONAREGISTRARDATOSCOREPRECHAZADOAFILIACION = "p_RechazadoAfiliacion";
    /** <code>personaregistrarDatosCOREpRechazadoAfiliacion</code> inbound argument id. */
    public static final String ARG_ID_REGISTRARDATOSCORE_PERSONAREGISTRARDATOSCOREPRECHAZADOAFILIACION = "Clas_1431886233600805Ser_20Arg_4_Alias";
    /** <code>personaregistrarDatosCOREpRechazadoAfiliacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_REGISTRARDATOSCORE_PERSONAREGISTRARDATOSCOREPRECHAZADOAFILIACION = "Rechazado Afiliación";
    // Service (validarDatosRestrictiva)
    /** <code>validarDatosRestrictiva</code> service id. */
    public static final String SERV_ID_VALIDARDATOSRESTRICTIVA = "Clas_1431886233600805Ser_21_Alias";
    /** <code>validarDatosRestrictiva</code> service name. */
    public static final String SERV_NAME_VALIDARDATOSRESTRICTIVA = "validarDatosRestrictiva";
    /** <code>validarDatosRestrictiva</code> service alias. */
    public static final String SERV_ALIAS_VALIDARDATOSRESTRICTIVA = "validarDatosRestrictiva";
    /** Agents allowed to execute the service validarDatosRestrictiva **/
    public static final String VALIDARDATOSRESTRICTIVA_SRVAGENTS = "";
    // Preconditions
    /** <code>validarDatosRestrictiva</code> precondition 0 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVA_0 = "Clas_1431886233600805Pre_1_MsgError";
    /** <code>validarDatosRestrictiva</code> precondition 1 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVA_1 = "Clas_1431886233600805Pre_2_MsgError";
    /** <code>validarDatosRestrictiva</code> precondition 2 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVA_2 = "Clas_1431886233600805Pre_3_MsgError";
    /** <code>validarDatosRestrictiva</code> precondition 3 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVA_3 = "Clas_1431886233600805Pre_4_MsgError";
    /** <code>validarDatosRestrictiva</code> precondition 4 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVA_4 = "Clas_1431886233600805Pre_5_MsgError";
    /** <code>validarDatosRestrictiva</code> precondition 5 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVA_5 = "Clas_1431886233600805Pre_88_MsgError";
    /** <code>validarDatosRestrictiva</code> precondition 6 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVA_6 = "Clas_1431886233600805Pre_63_MsgError";
    /** <code>validarDatosRestrictiva</code> precondition 7 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVA_7 = "Clas_1431886233600805Pre_6_MsgError";
    /** <code>validarDatosRestrictiva</code> precondition 8 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVA_8 = "Clas_1431886233600805Pre_7_MsgError";
    /** <code>validarDatosRestrictiva</code> precondition 9 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVA_9 = "Clas_1431886233600805Pre_89_MsgError";
    /** <code>validarDatosRestrictiva</code> precondition 10 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVA_10 = "Clas_1431886233600805Pre_8_MsgError";
    /** <code>validarDatosRestrictiva</code> precondition 11 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVA_11 = "Clas_1431886233600805Pre_9_MsgError";
    /** <code>validarDatosRestrictiva</code> precondition 12 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVA_12 = "Clas_1431886233600805Pre_29_MsgError";
    /** <code>validarDatosRestrictiva</code> precondition 13 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVA_13 = "Clas_1431886233600805Pre_30_MsgError";
    // Inbound arguments
    /** <code>personavalidarDatosRestrictivapthisPersona</code> inbound argument name. */
    public static final String ARG_NAME_VALIDARDATOSRESTRICTIVA_PERSONAVALIDARDATOSRESTRICTIVAPTHISPERSONA = "p_thisPersona";
    /** <code>personavalidarDatosRestrictivapthisPersona</code> inbound argument id. */
    public static final String ARG_ID_VALIDARDATOSRESTRICTIVA_PERSONAVALIDARDATOSRESTRICTIVAPTHISPERSONA = "Clas_1431886233600805Ser_21Arg_1_Alias";
    /** <code>personavalidarDatosRestrictivapthisPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_VALIDARDATOSRESTRICTIVA_PERSONAVALIDARDATOSRESTRICTIVAPTHISPERSONA = "Persona";
    // Service (validarDatosRestrictivaTipoId)
    /** <code>validarDatosRestrictivaTipoId</code> service id. */
    public static final String SERV_ID_VALIDARDATOSRESTRICTIVATIPOID = "Clas_1431886233600805Ser_28_Alias";
    /** <code>validarDatosRestrictivaTipoId</code> service name. */
    public static final String SERV_NAME_VALIDARDATOSRESTRICTIVATIPOID = "validarDatosRestrictivaTipoId";
    /** <code>validarDatosRestrictivaTipoId</code> service alias. */
    public static final String SERV_ALIAS_VALIDARDATOSRESTRICTIVATIPOID = "validarDatosRestrictivaTipoId";
    /** Agents allowed to execute the service validarDatosRestrictivaTipoId **/
    public static final String VALIDARDATOSRESTRICTIVATIPOID_SRVAGENTS = "";
    // Preconditions
    /** <code>validarDatosRestrictivaTipoId</code> precondition 0 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVATIPOID_0 = "Clas_1431886233600805Pre_41_MsgError";
    /** <code>validarDatosRestrictivaTipoId</code> precondition 1 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVATIPOID_1 = "Clas_1431886233600805Pre_42_MsgError";
    /** <code>validarDatosRestrictivaTipoId</code> precondition 2 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVATIPOID_2 = "Clas_1431886233600805Pre_43_MsgError";
    /** <code>validarDatosRestrictivaTipoId</code> precondition 3 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVATIPOID_3 = "Clas_1431886233600805Pre_44_MsgError";
    /** <code>validarDatosRestrictivaTipoId</code> precondition 4 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVATIPOID_4 = "Clas_1431886233600805Pre_46_MsgError";
    /** <code>validarDatosRestrictivaTipoId</code> precondition 5 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVATIPOID_5 = "Clas_1431886233600805Pre_47_MsgError";
    /** <code>validarDatosRestrictivaTipoId</code> precondition 6 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVATIPOID_6 = "Clas_1431886233600805Pre_48_MsgError";
    /** <code>validarDatosRestrictivaTipoId</code> precondition 7 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVATIPOID_7 = "Clas_1431886233600805Pre_66_MsgError";
    /** <code>validarDatosRestrictivaTipoId</code> precondition 8 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVATIPOID_8 = "Clas_1431886233600805Pre_67_MsgError";
    /** <code>validarDatosRestrictivaTipoId</code> precondition 9 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVATIPOID_9 = "Clas_1431886233600805Pre_68_MsgError";
    /** <code>validarDatosRestrictivaTipoId</code> precondition 10 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVATIPOID_10 = "Clas_1431886233600805Pre_56_MsgError";
    /** <code>validarDatosRestrictivaTipoId</code> precondition 11 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVATIPOID_11 = "Clas_1431886233600805Pre_69_MsgError";
    /** <code>validarDatosRestrictivaTipoId</code> precondition 12 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVATIPOID_12 = "Clas_1431886233600805Pre_70_MsgError";
    /** <code>validarDatosRestrictivaTipoId</code> precondition 13 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVATIPOID_13 = "Clas_1431886233600805Pre_57_MsgError";
    /** <code>validarDatosRestrictivaTipoId</code> precondition 14 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVATIPOID_14 = "Clas_1431886233600805Pre_84_MsgError";
    /** <code>validarDatosRestrictivaTipoId</code> precondition 15 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVATIPOID_15 = "Clas_1431886233600805Pre_91_MsgError";
    /** <code>validarDatosRestrictivaTipoId</code> precondition 16 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVATIPOID_16 = "Clas_1431886233600805Pre_83_MsgError";
    /** <code>validarDatosRestrictivaTipoId</code> precondition 17 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVATIPOID_17 = "Clas_1431886233600805Pre_73_MsgError";
    /** <code>validarDatosRestrictivaTipoId</code> precondition 18 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVATIPOID_18 = "Clas_1431886233600805Pre_49_MsgError";
    /** <code>validarDatosRestrictivaTipoId</code> precondition 19 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVATIPOID_19 = "Clas_1431886233600805Pre_50_MsgError";
    /** <code>validarDatosRestrictivaTipoId</code> precondition 20 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVATIPOID_20 = "Clas_1431886233600805Pre_51_MsgError";
    /** <code>validarDatosRestrictivaTipoId</code> precondition 21 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVATIPOID_21 = "Clas_1431886233600805Pre_52_MsgError";
    /** <code>validarDatosRestrictivaTipoId</code> precondition 22 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVATIPOID_22 = "Clas_1431886233600805Pre_53_MsgError";
    /** <code>validarDatosRestrictivaTipoId</code> precondition 23 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVATIPOID_23 = "Clas_1431886233600805Pre_54_MsgError";
    /** <code>validarDatosRestrictivaTipoId</code> precondition 24 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVATIPOID_24 = "Clas_1431886233600805Pre_55_MsgError";
    /** <code>validarDatosRestrictivaTipoId</code> precondition 25 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVATIPOID_25 = "Clas_1431886233600805Pre_74_MsgError";
    /** <code>validarDatosRestrictivaTipoId</code> precondition 26 id. */
    public static final String PRE_ID_VALIDARDATOSRESTRICTIVATIPOID_26 = "Clas_1431886233600805Pre_75_MsgError";
    // Inbound arguments
    /** <code>personavalidarDatosRestrictivaTipoIdpthisPersona</code> inbound argument name. */
    public static final String ARG_NAME_VALIDARDATOSRESTRICTIVATIPOID_PERSONAVALIDARDATOSRESTRICTIVATIPOIDPTHISPERSONA = "p_thisPersona";
    /** <code>personavalidarDatosRestrictivaTipoIdpthisPersona</code> inbound argument id. */
    public static final String ARG_ID_VALIDARDATOSRESTRICTIVATIPOID_PERSONAVALIDARDATOSRESTRICTIVATIPOIDPTHISPERSONA = "Clas_1431886233600805Ser_28Arg_1_Alias";
    /** <code>personavalidarDatosRestrictivaTipoIdpthisPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_VALIDARDATOSRESTRICTIVATIPOID_PERSONAVALIDARDATOSRESTRICTIVATIPOIDPTHISPERSONA = "Persona";
    // Service (InsEstadoPersona)
    /** <code>InsEstadoPersona</code> service id. */
    public static final String SERV_ID_INSESTADOPERSONA = "Clas_1431886233600805Ser_24_Alias";
    /** <code>InsEstadoPersona</code> service name. */
    public static final String SERV_NAME_INSESTADOPERSONA = "InsEstadoPersona";
    /** <code>InsEstadoPersona</code> service alias. */
    public static final String SERV_ALIAS_INSESTADOPERSONA = "InsEstadoPersona";
    /** Agents allowed to execute the service InsEstadoPersona **/
    public static final String INSESTADOPERSONA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaInsEstadoPersonapthisPersona</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOPERSONA_PERSONAINSESTADOPERSONAPTHISPERSONA = "p_thisPersona";
    /** <code>personaInsEstadoPersonapthisPersona</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOPERSONA_PERSONAINSESTADOPERSONAPTHISPERSONA = "Clas_1431886233600805Ser_24Arg_1_Alias";
    /** <code>personaInsEstadoPersonapthisPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOPERSONA_PERSONAINSESTADOPERSONAPTHISPERSONA = "Personas";
    /** <code>personaInsEstadoPersonapevcEstadoPersona</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOPERSONA_PERSONAINSESTADOPERSONAPEVCESTADOPERSONA = "p_evcEstadoPersona";
    /** <code>personaInsEstadoPersonapevcEstadoPersona</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOPERSONA_PERSONAINSESTADOPERSONAPEVCESTADOPERSONA = "Clas_1431886233600805Ser_24Arg_2_Alias";
    /** <code>personaInsEstadoPersonapevcEstadoPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOPERSONA_PERSONAINSESTADOPERSONAPEVCESTADOPERSONA = "Estado persona";
    // Service (DelEstadoPersona)
    /** <code>DelEstadoPersona</code> service id. */
    public static final String SERV_ID_DELESTADOPERSONA = "Clas_1431886233600805Ser_25_Alias";
    /** <code>DelEstadoPersona</code> service name. */
    public static final String SERV_NAME_DELESTADOPERSONA = "DelEstadoPersona";
    /** <code>DelEstadoPersona</code> service alias. */
    public static final String SERV_ALIAS_DELESTADOPERSONA = "DelEstadoPersona";
    /** Agents allowed to execute the service DelEstadoPersona **/
    public static final String DELESTADOPERSONA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaDelEstadoPersonapthisPersona</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOPERSONA_PERSONADELESTADOPERSONAPTHISPERSONA = "p_thisPersona";
    /** <code>personaDelEstadoPersonapthisPersona</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOPERSONA_PERSONADELESTADOPERSONAPTHISPERSONA = "Clas_1431886233600805Ser_25Arg_1_Alias";
    /** <code>personaDelEstadoPersonapthisPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOPERSONA_PERSONADELESTADOPERSONAPTHISPERSONA = "Personas";
    /** <code>personaDelEstadoPersonapevcEstadoPersona</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOPERSONA_PERSONADELESTADOPERSONAPEVCESTADOPERSONA = "p_evcEstadoPersona";
    /** <code>personaDelEstadoPersonapevcEstadoPersona</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOPERSONA_PERSONADELESTADOPERSONAPEVCESTADOPERSONA = "Clas_1431886233600805Ser_25Arg_2_Alias";
    /** <code>personaDelEstadoPersonapevcEstadoPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOPERSONA_PERSONADELESTADOPERSONAPEVCESTADOPERSONA = "Estado persona";
    // Service (DelContratanteSolicitud)
    /** <code>DelContratanteSolicitud</code> service id. */
    public static final String SERV_ID_DELCONTRATANTESOLICITUD = "Clas_1431886233600805Ser_30_Alias";
    /** <code>DelContratanteSolicitud</code> service name. */
    public static final String SERV_NAME_DELCONTRATANTESOLICITUD = "DelContratanteSolicitud";
    /** <code>DelContratanteSolicitud</code> service alias. */
    public static final String SERV_ALIAS_DELCONTRATANTESOLICITUD = "DelContratanteSolicitud";
    /** Agents allowed to execute the service DelContratanteSolicitud **/
    public static final String DELCONTRATANTESOLICITUD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaDelContratanteSolicitudpthisPersona</code> inbound argument name. */
    public static final String ARG_NAME_DELCONTRATANTESOLICITUD_PERSONADELCONTRATANTESOLICITUDPTHISPERSONA = "p_thisPersona";
    /** <code>personaDelContratanteSolicitudpthisPersona</code> inbound argument id. */
    public static final String ARG_ID_DELCONTRATANTESOLICITUD_PERSONADELCONTRATANTESOLICITUDPTHISPERSONA = "Clas_1431886233600805Ser_30Arg_1_Alias";
    /** <code>personaDelContratanteSolicitudpthisPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELCONTRATANTESOLICITUD_PERSONADELCONTRATANTESOLICITUDPTHISPERSONA = "Contratante";
    /** <code>personaDelContratanteSolicitudpevcSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_DELCONTRATANTESOLICITUD_PERSONADELCONTRATANTESOLICITUDPEVCSOLICITUD = "p_evcSolicitud";
    /** <code>personaDelContratanteSolicitudpevcSolicitud</code> inbound argument id. */
    public static final String ARG_ID_DELCONTRATANTESOLICITUD_PERSONADELCONTRATANTESOLICITUDPEVCSOLICITUD = "Clas_1431886233600805Ser_30Arg_2_Alias";
    /** <code>personaDelContratanteSolicitudpevcSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELCONTRATANTESOLICITUD_PERSONADELCONTRATANTESOLICITUDPEVCSOLICITUD = "Solicitudes";
    // Service (DelTitularSolicitud)
    /** <code>DelTitularSolicitud</code> service id. */
    public static final String SERV_ID_DELTITULARSOLICITUD = "Clas_1431886233600805Ser_31_Alias";
    /** <code>DelTitularSolicitud</code> service name. */
    public static final String SERV_NAME_DELTITULARSOLICITUD = "DelTitularSolicitud";
    /** <code>DelTitularSolicitud</code> service alias. */
    public static final String SERV_ALIAS_DELTITULARSOLICITUD = "DelTitularSolicitud";
    /** Agents allowed to execute the service DelTitularSolicitud **/
    public static final String DELTITULARSOLICITUD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaDelTitularSolicitudpthisPersona</code> inbound argument name. */
    public static final String ARG_NAME_DELTITULARSOLICITUD_PERSONADELTITULARSOLICITUDPTHISPERSONA = "p_thisPersona";
    /** <code>personaDelTitularSolicitudpthisPersona</code> inbound argument id. */
    public static final String ARG_ID_DELTITULARSOLICITUD_PERSONADELTITULARSOLICITUDPTHISPERSONA = "Clas_1431886233600805Ser_31Arg_1_Alias";
    /** <code>personaDelTitularSolicitudpthisPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTITULARSOLICITUD_PERSONADELTITULARSOLICITUDPTHISPERSONA = "Titular";
    /** <code>personaDelTitularSolicitudpevcSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_DELTITULARSOLICITUD_PERSONADELTITULARSOLICITUDPEVCSOLICITUD = "p_evcSolicitud";
    /** <code>personaDelTitularSolicitudpevcSolicitud</code> inbound argument id. */
    public static final String ARG_ID_DELTITULARSOLICITUD_PERSONADELTITULARSOLICITUDPEVCSOLICITUD = "Clas_1431886233600805Ser_31Arg_2_Alias";
    /** <code>personaDelTitularSolicitudpevcSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTITULARSOLICITUD_PERSONADELTITULARSOLICITUDPEVCSOLICITUD = "Solicitudes";
    // Service (CambTipoIdentificacion)
    /** <code>CambTipoIdentificacion</code> service id. */
    public static final String SERV_ID_CAMBTIPOIDENTIFICACION = "Clas_1431886233600805Ser_37_Alias";
    /** <code>CambTipoIdentificacion</code> service name. */
    public static final String SERV_NAME_CAMBTIPOIDENTIFICACION = "CambTipoIdentificacion";
    /** <code>CambTipoIdentificacion</code> service alias. */
    public static final String SERV_ALIAS_CAMBTIPOIDENTIFICACION = "CambTipoIdentificacion";
    /** Agents allowed to execute the service CambTipoIdentificacion **/
    public static final String CAMBTIPOIDENTIFICACION_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Inbound arguments
    /** <code>personaCambTipoIdentificacionpthisPersona</code> inbound argument name. */
    public static final String ARG_NAME_CAMBTIPOIDENTIFICACION_PERSONACAMBTIPOIDENTIFICACIONPTHISPERSONA = "p_thisPersona";
    /** <code>personaCambTipoIdentificacionpthisPersona</code> inbound argument id. */
    public static final String ARG_ID_CAMBTIPOIDENTIFICACION_PERSONACAMBTIPOIDENTIFICACIONPTHISPERSONA = "Clas_1431886233600805Ser_37Arg_1_Alias";
    /** <code>personaCambTipoIdentificacionpthisPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBTIPOIDENTIFICACION_PERSONACAMBTIPOIDENTIFICACIONPTHISPERSONA = "Personas";
    /** <code>personaCambTipoIdentificacionpevcTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_CAMBTIPOIDENTIFICACION_PERSONACAMBTIPOIDENTIFICACIONPEVCTIPOIDENTIFICACION = "p_evcTipoIdentificacion";
    /** <code>personaCambTipoIdentificacionpevcTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_CAMBTIPOIDENTIFICACION_PERSONACAMBTIPOIDENTIFICACIONPEVCTIPOIDENTIFICACION = "Clas_1431886233600805Ser_37Arg_2_Alias";
    /** <code>personaCambTipoIdentificacionpevcTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBTIPOIDENTIFICACION_PERSONACAMBTIPOIDENTIFICACIONPEVCTIPOIDENTIFICACION = "Tipo identificación";
    // Service (marcarDatosBasicosMod)
    /** <code>marcarDatosBasicosMod</code> service id. */
    public static final String SERV_ID_MARCARDATOSBASICOSMOD = "Clas_1431886233600805Ser_38_Alias";
    /** <code>marcarDatosBasicosMod</code> service name. */
    public static final String SERV_NAME_MARCARDATOSBASICOSMOD = "marcarDatosBasicosMod";
    /** <code>marcarDatosBasicosMod</code> service alias. */
    public static final String SERV_ALIAS_MARCARDATOSBASICOSMOD = "marcarDatosBasicosMod";
    /** Agents allowed to execute the service marcarDatosBasicosMod **/
    public static final String MARCARDATOSBASICOSMOD_SRVAGENTS = "";
    // Preconditions
    /** <code>marcarDatosBasicosMod</code> precondition 0 id. */
    public static final String PRE_ID_MARCARDATOSBASICOSMOD_0 = "Clas_1431886233600805Pre_86_MsgError";
    // Inbound arguments
    /** <code>personamarcarDatosBasicosModpthisPersona</code> inbound argument name. */
    public static final String ARG_NAME_MARCARDATOSBASICOSMOD_PERSONAMARCARDATOSBASICOSMODPTHISPERSONA = "p_thisPersona";
    /** <code>personamarcarDatosBasicosModpthisPersona</code> inbound argument id. */
    public static final String ARG_ID_MARCARDATOSBASICOSMOD_PERSONAMARCARDATOSBASICOSMODPTHISPERSONA = "Clas_1431886233600805Ser_38Arg_1_Alias";
    /** <code>personamarcarDatosBasicosModpthisPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_MARCARDATOSBASICOSMOD_PERSONAMARCARDATOSBASICOSMODPTHISPERSONA = "Persona";
    /** <code>personamarcarDatosBasicosModpModificados</code> inbound argument name. */
    public static final String ARG_NAME_MARCARDATOSBASICOSMOD_PERSONAMARCARDATOSBASICOSMODPMODIFICADOS = "p_Modificados";
    /** <code>personamarcarDatosBasicosModpModificados</code> inbound argument id. */
    public static final String ARG_ID_MARCARDATOSBASICOSMOD_PERSONAMARCARDATOSBASICOSMODPMODIFICADOS = "Clas_1431886233600805Ser_38Arg_2_Alias";
    /** <code>personamarcarDatosBasicosModpModificados</code> inbound argument alias. */
    public static final String ARG_ALIAS_MARCARDATOSBASICOSMOD_PERSONAMARCARDATOSBASICOSMODPMODIFICADOS = "Modificados";
    // Service (indicarCodigoCORE)
    /** <code>indicarCodigoCORE</code> service id. */
    public static final String SERV_ID_INDICARCODIGOCORE = "Clas_1431886233600805Ser_49_Alias";
    /** <code>indicarCodigoCORE</code> service name. */
    public static final String SERV_NAME_INDICARCODIGOCORE = "indicarCodigoCORE";
    /** <code>indicarCodigoCORE</code> service alias. */
    public static final String SERV_ALIAS_INDICARCODIGOCORE = "indicarCodigoCORE";
    /** Agents allowed to execute the service indicarCodigoCORE **/
    public static final String INDICARCODIGOCORE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaindicarCodigoCOREpthisPersona</code> inbound argument name. */
    public static final String ARG_NAME_INDICARCODIGOCORE_PERSONAINDICARCODIGOCOREPTHISPERSONA = "p_thisPersona";
    /** <code>personaindicarCodigoCOREpthisPersona</code> inbound argument id. */
    public static final String ARG_ID_INDICARCODIGOCORE_PERSONAINDICARCODIGOCOREPTHISPERSONA = "Clas_1431886233600805Ser_49Arg_1_Alias";
    /** <code>personaindicarCodigoCOREpthisPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_INDICARCODIGOCORE_PERSONAINDICARCODIGOCOREPTHISPERSONA = "Persona";
    /** <code>personaindicarCodigoCOREpCodigo</code> inbound argument name. */
    public static final String ARG_NAME_INDICARCODIGOCORE_PERSONAINDICARCODIGOCOREPCODIGO = "p_Codigo";
    /** <code>personaindicarCodigoCOREpCodigo</code> inbound argument id. */
    public static final String ARG_ID_INDICARCODIGOCORE_PERSONAINDICARCODIGOCOREPCODIGO = "Clas_1431886233600805Ser_49Arg_2_Alias";
    /** <code>personaindicarCodigoCOREpCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_INDICARCODIGOCORE_PERSONAINDICARCODIGOCOREPCODIGO = "Código";
    // Service (dummyGetNumCodCORE)
    /** <code>dummyGetNumCodCORE</code> service id. */
    public static final String SERV_ID_DUMMYGETNUMCODCORE = "Clas_1431886233600805Ser_55_Alias";
    /** <code>dummyGetNumCodCORE</code> service name. */
    public static final String SERV_NAME_DUMMYGETNUMCODCORE = "dummyGetNumCodCORE";
    /** <code>dummyGetNumCodCORE</code> service alias. */
    public static final String SERV_ALIAS_DUMMYGETNUMCODCORE = "dummyGetNumCodCORE";
    /** Agents allowed to execute the service dummyGetNumCodCORE **/
    public static final String DUMMYGETNUMCODCORE_SRVAGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario";
    // Inbound arguments
    /** <code>personadummyGetNumCodCOREpthisPersona</code> inbound argument name. */
    public static final String ARG_NAME_DUMMYGETNUMCODCORE_PERSONADUMMYGETNUMCODCOREPTHISPERSONA = "p_thisPersona";
    /** <code>personadummyGetNumCodCOREpthisPersona</code> inbound argument id. */
    public static final String ARG_ID_DUMMYGETNUMCODCORE_PERSONADUMMYGETNUMCODCOREPTHISPERSONA = "Clas_1431886233600805Ser_55Arg_1_Alias";
    /** <code>personadummyGetNumCodCOREpthisPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_DUMMYGETNUMCODCORE_PERSONADUMMYGETNUMCODCOREPTHISPERSONA = "Persona";
    /** <code>personadummyGetNumCodCOREpSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_DUMMYGETNUMCODCORE_PERSONADUMMYGETNUMCODCOREPSOLICITUD = "p_Solicitud";
    /** <code>personadummyGetNumCodCOREpSolicitud</code> inbound argument id. */
    public static final String ARG_ID_DUMMYGETNUMCODCORE_PERSONADUMMYGETNUMCODCOREPSOLICITUD = "Clas_1431886233600805Ser_55Arg_3_Alias";
    /** <code>personadummyGetNumCodCOREpSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_DUMMYGETNUMCODCORE_PERSONADUMMYGETNUMCODCOREPSOLICITUD = "Solicitud";
    // Outbound arguments
    /** <code>personadummyGetNumCodCOREpsCodigo</code> outbound argument name. */
    public static final String ARG_NAME_DUMMYGETNUMCODCORE_PERSONADUMMYGETNUMCODCOREPSCODIGO = "personadummyGetNumCodCOREpsCodigo";
    /** <code>personadummyGetNumCodCOREpsCodigo</code> outbound argument id. */
    public static final String ARG_ID_DUMMYGETNUMCODCORE_PERSONADUMMYGETNUMCODCOREPSCODIGO = "Clas_1431886233600805Ser_55Arg_2_Alias";
    /** <code>personadummyGetNumCodCOREpsCodigo</code> outbound argument alias. */
    public static final String ARG_ALIAS_DUMMYGETNUMCODCORE_PERSONADUMMYGETNUMCODCOREPSCODIGO = "psCodigo";
    // Service (cambiarTelefonos)
    /** <code>cambiarTelefonos</code> service id. */
    public static final String SERV_ID_CAMBIARTELEFONOS = "Clas_1431886233600805Ser_57_Alias";
    /** <code>cambiarTelefonos</code> service name. */
    public static final String SERV_NAME_CAMBIARTELEFONOS = "cambiarTelefonos";
    /** <code>cambiarTelefonos</code> service alias. */
    public static final String SERV_ALIAS_CAMBIARTELEFONOS = "Modificar persona";
    /** Agents allowed to execute the service cambiarTelefonos **/
    public static final String CAMBIARTELEFONOS_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personacambiarTelefonospthisPersona</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARTELEFONOS_PERSONACAMBIARTELEFONOSPTHISPERSONA = "p_thisPersona";
    /** <code>personacambiarTelefonospthisPersona</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARTELEFONOS_PERSONACAMBIARTELEFONOSPTHISPERSONA = "Clas_1431886233600805Ser_57Arg_1_Alias";
    /** <code>personacambiarTelefonospthisPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARTELEFONOS_PERSONACAMBIARTELEFONOSPTHISPERSONA = "Persona";
    /** <code>personacambiarTelefonospTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARTELEFONOS_PERSONACAMBIARTELEFONOSPTELEFONOFIJO = "p_TelefonoFijo";
    /** <code>personacambiarTelefonospTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARTELEFONOS_PERSONACAMBIARTELEFONOSPTELEFONOFIJO = "Clas_1431886233600805Ser_57Arg_10_Alias";
    /** <code>personacambiarTelefonospTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARTELEFONOS_PERSONACAMBIARTELEFONOSPTELEFONOFIJO = "Teléfono fijo";
    /** <code>personacambiarTelefonospTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARTELEFONOS_PERSONACAMBIARTELEFONOSPTELEFONOCELULAR = "p_TelefonoCelular";
    /** <code>personacambiarTelefonospTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARTELEFONOS_PERSONACAMBIARTELEFONOSPTELEFONOCELULAR = "Clas_1431886233600805Ser_57Arg_11_Alias";
    /** <code>personacambiarTelefonospTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARTELEFONOS_PERSONACAMBIARTELEFONOSPTELEFONOCELULAR = "Teléfono celular";
    // Service (TCREARNATURAL)
    /** <code>TCREARNATURAL</code> service id. */
    public static final String SERV_ID_TCREARNATURAL = "Clas_1431886233600805Ser_16_Alias";
    /** <code>TCREARNATURAL</code> service name. */
    public static final String SERV_NAME_TCREARNATURAL = "TCREARNATURAL";
    /** <code>TCREARNATURAL</code> service alias. */
    public static final String SERV_ALIAS_TCREARNATURAL = "TCREARNATURAL";
    /** Agents allowed to execute the service TCREARNATURAL **/
    public static final String TCREARNATURAL_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaTCREARNATURALptpagrTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPTPAGRTIPOIDENTIFICACION = "pt_p_agrTipoIdentificacion";
    /** <code>personaTCREARNATURALptpagrTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPTPAGRTIPOIDENTIFICACION = "Clas_1431886233600805Ser_16Arg_3_Alias";
    /** <code>personaTCREARNATURALptpagrTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPTPAGRTIPOIDENTIFICACION = "Tipo identificación";
    /** <code>personaTCREARNATURALptpagrDepartamentoNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPTPAGRDEPARTAMENTONACIMIENTO = "pt_p_agrDepartamentoNacimiento";
    /** <code>personaTCREARNATURALptpagrDepartamentoNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPTPAGRDEPARTAMENTONACIMIENTO = "Clas_1431886233600805Ser_16Arg_5_Alias";
    /** <code>personaTCREARNATURALptpagrDepartamentoNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPTPAGRDEPARTAMENTONACIMIENTO = "Departamento nacimiento";
    /** <code>personaTCREARNATURALptpagrMunicipioNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPTPAGRMUNICIPIONACIMIENTO = "pt_p_agrMunicipioNacimiento";
    /** <code>personaTCREARNATURALptpagrMunicipioNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPTPAGRMUNICIPIONACIMIENTO = "Clas_1431886233600805Ser_16Arg_6_Alias";
    /** <code>personaTCREARNATURALptpagrMunicipioNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPTPAGRMUNICIPIONACIMIENTO = "Municipio nacimiento";
    /** <code>personaTCREARNATURALptpagrEstadoCivil</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPTPAGRESTADOCIVIL = "pt_p_agrEstadoCivil";
    /** <code>personaTCREARNATURALptpagrEstadoCivil</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPTPAGRESTADOCIVIL = "Clas_1431886233600805Ser_16Arg_7_Alias";
    /** <code>personaTCREARNATURALptpagrEstadoCivil</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPTPAGRESTADOCIVIL = "EstadoCivil";
    /** <code>personaTCREARNATURALptpatrNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPTPATRNUMIDENTIFICACION = "pt_p_atrNumIdentificacion";
    /** <code>personaTCREARNATURALptpatrNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPTPATRNUMIDENTIFICACION = "Clas_1431886233600805Ser_16Arg_8_Alias";
    /** <code>personaTCREARNATURALptpatrNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPTPATRNUMIDENTIFICACION = "Nº Identificación";
    /** <code>personaTCREARNATURALptpatrPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPTPATRPRIMERNOMBRE = "pt_p_atrPrimerNombre";
    /** <code>personaTCREARNATURALptpatrPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPTPATRPRIMERNOMBRE = "Clas_1431886233600805Ser_16Arg_10_Alias";
    /** <code>personaTCREARNATURALptpatrPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPTPATRPRIMERNOMBRE = "Primer nombre";
    /** <code>personaTCREARNATURALptpatrSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPTPATRSEGUNDONOMBRE = "pt_p_atrSegundoNombre";
    /** <code>personaTCREARNATURALptpatrSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPTPATRSEGUNDONOMBRE = "Clas_1431886233600805Ser_16Arg_11_Alias";
    /** <code>personaTCREARNATURALptpatrSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPTPATRSEGUNDONOMBRE = "Segundo nombre";
    /** <code>personaTCREARNATURALptpatrPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPTPATRPRIMERAPELLIDO = "pt_p_atrPrimerApellido";
    /** <code>personaTCREARNATURALptpatrPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPTPATRPRIMERAPELLIDO = "Clas_1431886233600805Ser_16Arg_12_Alias";
    /** <code>personaTCREARNATURALptpatrPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPTPATRPRIMERAPELLIDO = "Primer Apellido";
    /** <code>personaTCREARNATURALptpatrSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPTPATRSEGUNDOAPELLIDO = "pt_p_atrSegundoApellido";
    /** <code>personaTCREARNATURALptpatrSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPTPATRSEGUNDOAPELLIDO = "Clas_1431886233600805Ser_16Arg_13_Alias";
    /** <code>personaTCREARNATURALptpatrSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPTPATRSEGUNDOAPELLIDO = "Segundo Apellido";
    /** <code>personaTCREARNATURALptpatrFechaNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPTPATRFECHANACIMIENTO = "pt_p_atrFechaNacimiento";
    /** <code>personaTCREARNATURALptpatrFechaNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPTPATRFECHANACIMIENTO = "Clas_1431886233600805Ser_16Arg_15_Alias";
    /** <code>personaTCREARNATURALptpatrFechaNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPTPATRFECHANACIMIENTO = "Fecha nacimiento";
    /** <code>personaTCREARNATURALptpatrGenero</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPTPATRGENERO = "pt_p_atrGenero";
    /** <code>personaTCREARNATURALptpatrGenero</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPTPATRGENERO = "Clas_1431886233600805Ser_16Arg_16_Alias";
    /** <code>personaTCREARNATURALptpatrGenero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPTPATRGENERO = "Género";
    /** <code>personaTCREARNATURALptpatrIndicadorExtranjero</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPTPATRINDICADOREXTRANJERO = "pt_p_atrIndicadorExtranjero";
    /** <code>personaTCREARNATURALptpatrIndicadorExtranjero</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPTPATRINDICADOREXTRANJERO = "Clas_1431886233600805Ser_16Arg_17_Alias";
    /** <code>personaTCREARNATURALptpatrIndicadorExtranjero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPTPATRINDICADOREXTRANJERO = "Indicador extranjero";
    /** <code>personaTCREARNATURALptpatrTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPTPATRTELEFONOFIJO = "pt_p_atrTelefonoFijo";
    /** <code>personaTCREARNATURALptpatrTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPTPATRTELEFONOFIJO = "Clas_1431886233600805Ser_16Arg_18_Alias";
    /** <code>personaTCREARNATURALptpatrTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPTPATRTELEFONOFIJO = "Teléfono fijo";
    /** <code>personaTCREARNATURALptpatrTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPTPATRTELEFONOCELULAR = "pt_p_atrTelefonoCelular";
    /** <code>personaTCREARNATURALptpatrTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPTPATRTELEFONOCELULAR = "Clas_1431886233600805Ser_16Arg_19_Alias";
    /** <code>personaTCREARNATURALptpatrTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPTPATRTELEFONOCELULAR = "Teléfono celular";
    /** <code>personaTCREARNATURALptpatrCorreoElectronico</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPTPATRCORREOELECTRONICO = "pt_p_atrCorreoElectronico";
    /** <code>personaTCREARNATURALptpatrCorreoElectronico</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPTPATRCORREOELECTRONICO = "Clas_1431886233600805Ser_16Arg_20_Alias";
    /** <code>personaTCREARNATURALptpatrCorreoElectronico</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPTPATRCORREOELECTRONICO = "Correo electrónico";
    /** <code>personaTCREARNATURALptpagrPais</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPTPAGRPAIS = "pt_p_agrPais";
    /** <code>personaTCREARNATURALptpagrPais</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPTPAGRPAIS = "Clas_1431886233600805Ser_16Arg_29_Alias";
    /** <code>personaTCREARNATURALptpagrPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPTPAGRPAIS = "País";
    /** <code>personaTCREARNATURALptpagrDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPTPAGRDEPARTAMENTO = "pt_p_agrDepartamento";
    /** <code>personaTCREARNATURALptpagrDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPTPAGRDEPARTAMENTO = "Clas_1431886233600805Ser_16Arg_30_Alias";
    /** <code>personaTCREARNATURALptpagrDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPTPAGRDEPARTAMENTO = "Departamento";
    /** <code>personaTCREARNATURALptpagrMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPTPAGRMUNICIPIO = "pt_p_agrMunicipio";
    /** <code>personaTCREARNATURALptpagrMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPTPAGRMUNICIPIO = "Clas_1431886233600805Ser_16Arg_31_Alias";
    /** <code>personaTCREARNATURALptpagrMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPTPAGRMUNICIPIO = "Municipio";
    /** <code>personaTCREARNATURALptpatrDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPTPATRDIRECCIONCOMPLETA = "pt_p_atrDireccionCompleta";
    /** <code>personaTCREARNATURALptpatrDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPTPATRDIRECCIONCOMPLETA = "Clas_1431886233600805Ser_16Arg_34_Alias";
    /** <code>personaTCREARNATURALptpatrDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPTPATRDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>personaTCREARNATURALptpatrRural</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPTPATRRURAL = "pt_p_atrRural";
    /** <code>personaTCREARNATURALptpatrRural</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPTPATRRURAL = "Clas_1431886233600805Ser_16Arg_36_Alias";
    /** <code>personaTCREARNATURALptpatrRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPTPATRRURAL = "Rural";
    /** <code>personaTCREARNATURALptTipoDireccion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPTTIPODIRECCION = "pt_TipoDireccion";
    /** <code>personaTCREARNATURALptTipoDireccion</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPTTIPODIRECCION = "Clas_1431886233600805Ser_16Arg_121_Alias";
    /** <code>personaTCREARNATURALptTipoDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPTTIPODIRECCION = "Tipo dirección";
    /** <code>personaTCREARNATURALpCodigo</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPCODIGO = "p_Codigo";
    /** <code>personaTCREARNATURALpCodigo</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPCODIGO = "Clas_1431886233600805Ser_16Arg_2559_Alias";
    /** <code>personaTCREARNATURALpCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPCODIGO = "Código";
    /** <code>personaTCREARNATURALpDCDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPDCDIRECCIONCOMPLETA = "pDCDireccionCompleta";
    /** <code>personaTCREARNATURALpDCDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPDCDIRECCIONCOMPLETA = "Clas_1431886233600805Ser_16Arg_2731_Alias";
    /** <code>personaTCREARNATURALpDCDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPDCDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>personaTCREARNATURALpDCDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPDCDEPARTAMENTO = "pDCDepartamento";
    /** <code>personaTCREARNATURALpDCDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPDCDEPARTAMENTO = "Clas_1431886233600805Ser_16Arg_2732_Alias";
    /** <code>personaTCREARNATURALpDCDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPDCDEPARTAMENTO = "Departamento";
    /** <code>personaTCREARNATURALpDCMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPDCMUNICIPIO = "pDCMunicipio";
    /** <code>personaTCREARNATURALpDCMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPDCMUNICIPIO = "Clas_1431886233600805Ser_16Arg_2733_Alias";
    /** <code>personaTCREARNATURALpDCMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPDCMUNICIPIO = "Municipio";
    /** <code>personaTCREARNATURALpDCRural</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPDCRURAL = "pDCRural";
    /** <code>personaTCREARNATURALpDCRural</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPDCRURAL = "Clas_1431886233600805Ser_16Arg_2734_Alias";
    /** <code>personaTCREARNATURALpDCRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPDCRURAL = "Rural";
    /** <code>personaTCREARNATURALpDCTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPDCTELEFONOFIJO = "pDCTelefonoFijo";
    /** <code>personaTCREARNATURALpDCTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPDCTELEFONOFIJO = "Clas_1431886233600805Ser_16Arg_2736_Alias";
    /** <code>personaTCREARNATURALpDCTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPDCTELEFONOFIJO = "Teléfono fijo";
    /** <code>personaTCREARNATURALpDCTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPDCTELEFONOCELULAR = "pDCTelefonoCelular";
    /** <code>personaTCREARNATURALpDCTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPDCTELEFONOCELULAR = "Clas_1431886233600805Ser_16Arg_2737_Alias";
    /** <code>personaTCREARNATURALpDCTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPDCTELEFONOCELULAR = "Teléfono celular";
    /** <code>personaTCREARNATURALpDCTipoDireccion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPDCTIPODIRECCION = "pDCTipoDireccion";
    /** <code>personaTCREARNATURALpDCTipoDireccion</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPDCTIPODIRECCION = "Clas_1431886233600805Ser_16Arg_2738_Alias";
    /** <code>personaTCREARNATURALpDCTipoDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPDCTIPODIRECCION = "Tipo dirección";
    /** <code>personaTCREARNATURALpDCPais</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPDCPAIS = "pDCPais";
    /** <code>personaTCREARNATURALpDCPais</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPDCPAIS = "Clas_1431886233600805Ser_16Arg_2739_Alias";
    /** <code>personaTCREARNATURALpDCPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPDCPAIS = "País";
    /** <code>personaTCREARNATURALptValidarDatos</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPTVALIDARDATOS = "ptValidarDatos";
    /** <code>personaTCREARNATURALptValidarDatos</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPTVALIDARDATOS = "Clas_1431886233600805Ser_16Arg_3396_Alias";
    /** <code>personaTCREARNATURALptValidarDatos</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPTVALIDARDATOS = "ptValidarDatos";
    /** <code>personaTCREARNATURALptEstadoPersona</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPTESTADOPERSONA = "ptEstadoPersona";
    /** <code>personaTCREARNATURALptEstadoPersona</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPTESTADOPERSONA = "Clas_1431886233600805Ser_16Arg_3401_Alias";
    /** <code>personaTCREARNATURALptEstadoPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPTESTADOPERSONA = "Estado Persona";
    /** <code>personaTCREARNATURALptSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREARNATURAL_PERSONATCREARNATURALPTSOLICITUD = "ptSolicitud";
    /** <code>personaTCREARNATURALptSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPTSOLICITUD = "Clas_1431886233600805Ser_16Arg_7264_Alias";
    /** <code>personaTCREARNATURALptSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPTSOLICITUD = "Solicitud";
    // Service (TCREARJURIDICA)
    /** <code>TCREARJURIDICA</code> service id. */
    public static final String SERV_ID_TCREARJURIDICA = "Clas_1431886233600805Ser_39_Alias";
    /** <code>TCREARJURIDICA</code> service name. */
    public static final String SERV_NAME_TCREARJURIDICA = "TCREARJURIDICA";
    /** <code>TCREARJURIDICA</code> service alias. */
    public static final String SERV_ALIAS_TCREARJURIDICA = "TCREARJURIDICA";
    /** Agents allowed to execute the service TCREARJURIDICA **/
    public static final String TCREARJURIDICA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaTCREARJURIDICAptpagrTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARJURIDICA_PERSONATCREARJURIDICAPTPAGRTIPOIDENTIFICACION = "pt_p_agrTipoIdentificacion";
    /** <code>personaTCREARJURIDICAptpagrTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TCREARJURIDICA_PERSONATCREARJURIDICAPTPAGRTIPOIDENTIFICACION = "Clas_1431886233600805Ser_39Arg_3_Alias";
    /** <code>personaTCREARJURIDICAptpagrTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARJURIDICA_PERSONATCREARJURIDICAPTPAGRTIPOIDENTIFICACION = "Tipo identificación";
    /** <code>personaTCREARJURIDICAptpatrNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARJURIDICA_PERSONATCREARJURIDICAPTPATRNUMIDENTIFICACION = "pt_p_atrNumIdentificacion";
    /** <code>personaTCREARJURIDICAptpatrNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TCREARJURIDICA_PERSONATCREARJURIDICAPTPATRNUMIDENTIFICACION = "Clas_1431886233600805Ser_39Arg_9_Alias";
    /** <code>personaTCREARJURIDICAptpatrNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARJURIDICA_PERSONATCREARJURIDICAPTPATRNUMIDENTIFICACION = "Nº Identificación";
    /** <code>personaTCREARJURIDICAptpatrRazonSocial</code> inbound argument name. */
    public static final String ARG_NAME_TCREARJURIDICA_PERSONATCREARJURIDICAPTPATRRAZONSOCIAL = "pt_p_atrRazonSocial";
    /** <code>personaTCREARJURIDICAptpatrRazonSocial</code> inbound argument id. */
    public static final String ARG_ID_TCREARJURIDICA_PERSONATCREARJURIDICAPTPATRRAZONSOCIAL = "Clas_1431886233600805Ser_39Arg_15_Alias";
    /** <code>personaTCREARJURIDICAptpatrRazonSocial</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARJURIDICA_PERSONATCREARJURIDICAPTPATRRAZONSOCIAL = "Razón Social";
    /** <code>personaTCREARJURIDICAptpatrIndicadorExtranjero</code> inbound argument name. */
    public static final String ARG_NAME_TCREARJURIDICA_PERSONATCREARJURIDICAPTPATRINDICADOREXTRANJERO = "pt_p_atrIndicadorExtranjero";
    /** <code>personaTCREARJURIDICAptpatrIndicadorExtranjero</code> inbound argument id. */
    public static final String ARG_ID_TCREARJURIDICA_PERSONATCREARJURIDICAPTPATRINDICADOREXTRANJERO = "Clas_1431886233600805Ser_39Arg_18_Alias";
    /** <code>personaTCREARJURIDICAptpatrIndicadorExtranjero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARJURIDICA_PERSONATCREARJURIDICAPTPATRINDICADOREXTRANJERO = "Indicador extranjero";
    /** <code>personaTCREARJURIDICAptpatrTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TCREARJURIDICA_PERSONATCREARJURIDICAPTPATRTELEFONOFIJO = "pt_p_atrTelefonoFijo";
    /** <code>personaTCREARJURIDICAptpatrTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TCREARJURIDICA_PERSONATCREARJURIDICAPTPATRTELEFONOFIJO = "Clas_1431886233600805Ser_39Arg_19_Alias";
    /** <code>personaTCREARJURIDICAptpatrTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARJURIDICA_PERSONATCREARJURIDICAPTPATRTELEFONOFIJO = "Teléfono fijo";
    /** <code>personaTCREARJURIDICAptpatrTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TCREARJURIDICA_PERSONATCREARJURIDICAPTPATRTELEFONOCELULAR = "pt_p_atrTelefonoCelular";
    /** <code>personaTCREARJURIDICAptpatrTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TCREARJURIDICA_PERSONATCREARJURIDICAPTPATRTELEFONOCELULAR = "Clas_1431886233600805Ser_39Arg_20_Alias";
    /** <code>personaTCREARJURIDICAptpatrTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARJURIDICA_PERSONATCREARJURIDICAPTPATRTELEFONOCELULAR = "Teléfono celular";
    /** <code>personaTCREARJURIDICAptpatrCorreoElectronico</code> inbound argument name. */
    public static final String ARG_NAME_TCREARJURIDICA_PERSONATCREARJURIDICAPTPATRCORREOELECTRONICO = "pt_p_atrCorreoElectronico";
    /** <code>personaTCREARJURIDICAptpatrCorreoElectronico</code> inbound argument id. */
    public static final String ARG_ID_TCREARJURIDICA_PERSONATCREARJURIDICAPTPATRCORREOELECTRONICO = "Clas_1431886233600805Ser_39Arg_21_Alias";
    /** <code>personaTCREARJURIDICAptpatrCorreoElectronico</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARJURIDICA_PERSONATCREARJURIDICAPTPATRCORREOELECTRONICO = "Correo electrónico";
    /** <code>personaTCREARJURIDICAptpagrPais</code> inbound argument name. */
    public static final String ARG_NAME_TCREARJURIDICA_PERSONATCREARJURIDICAPTPAGRPAIS = "pt_p_agrPais";
    /** <code>personaTCREARJURIDICAptpagrPais</code> inbound argument id. */
    public static final String ARG_ID_TCREARJURIDICA_PERSONATCREARJURIDICAPTPAGRPAIS = "Clas_1431886233600805Ser_39Arg_25_Alias";
    /** <code>personaTCREARJURIDICAptpagrPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARJURIDICA_PERSONATCREARJURIDICAPTPAGRPAIS = "País";
    /** <code>personaTCREARJURIDICAptpagrDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TCREARJURIDICA_PERSONATCREARJURIDICAPTPAGRDEPARTAMENTO = "pt_p_agrDepartamento";
    /** <code>personaTCREARJURIDICAptpagrDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TCREARJURIDICA_PERSONATCREARJURIDICAPTPAGRDEPARTAMENTO = "Clas_1431886233600805Ser_39Arg_28_Alias";
    /** <code>personaTCREARJURIDICAptpagrDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARJURIDICA_PERSONATCREARJURIDICAPTPAGRDEPARTAMENTO = "Departamento";
    /** <code>personaTCREARJURIDICAptpagrMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TCREARJURIDICA_PERSONATCREARJURIDICAPTPAGRMUNICIPIO = "pt_p_agrMunicipio";
    /** <code>personaTCREARJURIDICAptpagrMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TCREARJURIDICA_PERSONATCREARJURIDICAPTPAGRMUNICIPIO = "Clas_1431886233600805Ser_39Arg_29_Alias";
    /** <code>personaTCREARJURIDICAptpagrMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARJURIDICA_PERSONATCREARJURIDICAPTPAGRMUNICIPIO = "Municipio";
    /** <code>personaTCREARJURIDICAptpatrDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TCREARJURIDICA_PERSONATCREARJURIDICAPTPATRDIRECCIONCOMPLETA = "pt_p_atrDireccionCompleta";
    /** <code>personaTCREARJURIDICAptpatrDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TCREARJURIDICA_PERSONATCREARJURIDICAPTPATRDIRECCIONCOMPLETA = "Clas_1431886233600805Ser_39Arg_30_Alias";
    /** <code>personaTCREARJURIDICAptpatrDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARJURIDICA_PERSONATCREARJURIDICAPTPATRDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>personaTCREARJURIDICAptpatrRural</code> inbound argument name. */
    public static final String ARG_NAME_TCREARJURIDICA_PERSONATCREARJURIDICAPTPATRRURAL = "pt_p_atrRural";
    /** <code>personaTCREARJURIDICAptpatrRural</code> inbound argument id. */
    public static final String ARG_ID_TCREARJURIDICA_PERSONATCREARJURIDICAPTPATRRURAL = "Clas_1431886233600805Ser_39Arg_31_Alias";
    /** <code>personaTCREARJURIDICAptpatrRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARJURIDICA_PERSONATCREARJURIDICAPTPATRRURAL = "Rural";
    // Service (TCREARCONTRATANTE)
    /** <code>TCREARCONTRATANTE</code> service id. */
    public static final String SERV_ID_TCREARCONTRATANTE = "Clas_1431886233600805Ser_26_Alias";
    /** <code>TCREARCONTRATANTE</code> service name. */
    public static final String SERV_NAME_TCREARCONTRATANTE = "TCREARCONTRATANTE";
    /** <code>TCREARCONTRATANTE</code> service alias. */
    public static final String SERV_ALIAS_TCREARCONTRATANTE = "Crear contratante";
    /** Agents allowed to execute the service TCREARCONTRATANTE **/
    public static final String TCREARCONTRATANTE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaTCREARCONTRATANTEptpagrTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPAGRTIPOIDENTIFICACION = "pt_p_agrTipoIdentificacion";
    /** <code>personaTCREARCONTRATANTEptpagrTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPAGRTIPOIDENTIFICACION = "Clas_1431886233600805Ser_26Arg_3_Alias";
    /** <code>personaTCREARCONTRATANTEptpagrTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPAGRTIPOIDENTIFICACION = "Tipo identificación";
    /** <code>personaTCREARCONTRATANTEptpagrDepartamentoNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPAGRDEPARTAMENTONACIMIENTO = "pt_p_agrDepartamentoNacimiento";
    /** <code>personaTCREARCONTRATANTEptpagrDepartamentoNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPAGRDEPARTAMENTONACIMIENTO = "Clas_1431886233600805Ser_26Arg_5_Alias";
    /** <code>personaTCREARCONTRATANTEptpagrDepartamentoNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPAGRDEPARTAMENTONACIMIENTO = "Departamento nacimiento";
    /** <code>personaTCREARCONTRATANTEptpagrMunicipioNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPAGRMUNICIPIONACIMIENTO = "pt_p_agrMunicipioNacimiento";
    /** <code>personaTCREARCONTRATANTEptpagrMunicipioNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPAGRMUNICIPIONACIMIENTO = "Clas_1431886233600805Ser_26Arg_6_Alias";
    /** <code>personaTCREARCONTRATANTEptpagrMunicipioNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPAGRMUNICIPIONACIMIENTO = "Municipio nacimiento";
    /** <code>personaTCREARCONTRATANTEptpagrEstadoCivil</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPAGRESTADOCIVIL = "pt_p_agrEstadoCivil";
    /** <code>personaTCREARCONTRATANTEptpagrEstadoCivil</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPAGRESTADOCIVIL = "Clas_1431886233600805Ser_26Arg_7_Alias";
    /** <code>personaTCREARCONTRATANTEptpagrEstadoCivil</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPAGRESTADOCIVIL = "EstadoCivil";
    /** <code>personaTCREARCONTRATANTEptpatrNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRNUMIDENTIFICACION = "pt_p_atrNumIdentificacion";
    /** <code>personaTCREARCONTRATANTEptpatrNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRNUMIDENTIFICACION = "Clas_1431886233600805Ser_26Arg_8_Alias";
    /** <code>personaTCREARCONTRATANTEptpatrNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRNUMIDENTIFICACION = "Nº Identificación";
    /** <code>personaTCREARCONTRATANTEptpatrPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRPRIMERNOMBRE = "pt_p_atrPrimerNombre";
    /** <code>personaTCREARCONTRATANTEptpatrPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRPRIMERNOMBRE = "Clas_1431886233600805Ser_26Arg_9_Alias";
    /** <code>personaTCREARCONTRATANTEptpatrPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRPRIMERNOMBRE = "Primer nombre";
    /** <code>personaTCREARCONTRATANTEptpatrSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRSEGUNDONOMBRE = "pt_p_atrSegundoNombre";
    /** <code>personaTCREARCONTRATANTEptpatrSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRSEGUNDONOMBRE = "Clas_1431886233600805Ser_26Arg_10_Alias";
    /** <code>personaTCREARCONTRATANTEptpatrSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRSEGUNDONOMBRE = "Segundo nombre";
    /** <code>personaTCREARCONTRATANTEptpatrPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRPRIMERAPELLIDO = "pt_p_atrPrimerApellido";
    /** <code>personaTCREARCONTRATANTEptpatrPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRPRIMERAPELLIDO = "Clas_1431886233600805Ser_26Arg_11_Alias";
    /** <code>personaTCREARCONTRATANTEptpatrPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRPRIMERAPELLIDO = "Primer Apellido";
    /** <code>personaTCREARCONTRATANTEptpatrSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRSEGUNDOAPELLIDO = "pt_p_atrSegundoApellido";
    /** <code>personaTCREARCONTRATANTEptpatrSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRSEGUNDOAPELLIDO = "Clas_1431886233600805Ser_26Arg_12_Alias";
    /** <code>personaTCREARCONTRATANTEptpatrSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRSEGUNDOAPELLIDO = "Segundo Apellido";
    /** <code>personaTCREARCONTRATANTEptpatrFechaNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRFECHANACIMIENTO = "pt_p_atrFechaNacimiento";
    /** <code>personaTCREARCONTRATANTEptpatrFechaNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRFECHANACIMIENTO = "Clas_1431886233600805Ser_26Arg_14_Alias";
    /** <code>personaTCREARCONTRATANTEptpatrFechaNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRFECHANACIMIENTO = "Fecha nacimiento";
    /** <code>personaTCREARCONTRATANTEptpatrGenero</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRGENERO = "pt_p_atrGenero";
    /** <code>personaTCREARCONTRATANTEptpatrGenero</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRGENERO = "Clas_1431886233600805Ser_26Arg_15_Alias";
    /** <code>personaTCREARCONTRATANTEptpatrGenero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRGENERO = "Género";
    /** <code>personaTCREARCONTRATANTEptpatrIndicadorExtranjero</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRINDICADOREXTRANJERO = "pt_p_atrIndicadorExtranjero";
    /** <code>personaTCREARCONTRATANTEptpatrIndicadorExtranjero</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRINDICADOREXTRANJERO = "Clas_1431886233600805Ser_26Arg_16_Alias";
    /** <code>personaTCREARCONTRATANTEptpatrIndicadorExtranjero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRINDICADOREXTRANJERO = "Indicador extranjero";
    /** <code>personaTCREARCONTRATANTEptpatrTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRTELEFONOFIJO = "pt_p_atrTelefonoFijo";
    /** <code>personaTCREARCONTRATANTEptpatrTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRTELEFONOFIJO = "Clas_1431886233600805Ser_26Arg_17_Alias";
    /** <code>personaTCREARCONTRATANTEptpatrTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRTELEFONOFIJO = "Teléfono fijo";
    /** <code>personaTCREARCONTRATANTEptpatrTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRTELEFONOCELULAR = "pt_p_atrTelefonoCelular";
    /** <code>personaTCREARCONTRATANTEptpatrTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRTELEFONOCELULAR = "Clas_1431886233600805Ser_26Arg_18_Alias";
    /** <code>personaTCREARCONTRATANTEptpatrTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRTELEFONOCELULAR = "Teléfono celular";
    /** <code>personaTCREARCONTRATANTEptpatrCorreoElectronico</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRCORREOELECTRONICO = "pt_p_atrCorreoElectronico";
    /** <code>personaTCREARCONTRATANTEptpatrCorreoElectronico</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRCORREOELECTRONICO = "Clas_1431886233600805Ser_26Arg_19_Alias";
    /** <code>personaTCREARCONTRATANTEptpatrCorreoElectronico</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRCORREOELECTRONICO = "Correo electrónico";
    /** <code>personaTCREARCONTRATANTEptpagrDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPAGRDEPARTAMENTO = "pt_p_agrDepartamento";
    /** <code>personaTCREARCONTRATANTEptpagrDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPAGRDEPARTAMENTO = "Clas_1431886233600805Ser_26Arg_21_Alias";
    /** <code>personaTCREARCONTRATANTEptpagrDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPAGRDEPARTAMENTO = "Departamento";
    /** <code>personaTCREARCONTRATANTEptpagrMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPAGRMUNICIPIO = "pt_p_agrMunicipio";
    /** <code>personaTCREARCONTRATANTEptpagrMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPAGRMUNICIPIO = "Clas_1431886233600805Ser_26Arg_22_Alias";
    /** <code>personaTCREARCONTRATANTEptpagrMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPAGRMUNICIPIO = "Municipio";
    /** <code>personaTCREARCONTRATANTEptpatrDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRDIRECCIONCOMPLETA = "pt_p_atrDireccionCompleta";
    /** <code>personaTCREARCONTRATANTEptpatrDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRDIRECCIONCOMPLETA = "Clas_1431886233600805Ser_26Arg_23_Alias";
    /** <code>personaTCREARCONTRATANTEptpatrDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>personaTCREARCONTRATANTEptpatrRural</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRRURAL = "pt_p_atrRural";
    /** <code>personaTCREARCONTRATANTEptpatrRural</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRRURAL = "Clas_1431886233600805Ser_26Arg_25_Alias";
    /** <code>personaTCREARCONTRATANTEptpatrRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRRURAL = "Rural";
    /** <code>personaTCREARCONTRATANTEptTipoDireccion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTTIPODIRECCION = "pt_TipoDireccion";
    /** <code>personaTCREARCONTRATANTEptTipoDireccion</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTTIPODIRECCION = "Clas_1431886233600805Ser_26Arg_41_Alias";
    /** <code>personaTCREARCONTRATANTEptTipoDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTTIPODIRECCION = "Tipo dirección";
    /** <code>personaTCREARCONTRATANTEptpatrRazonSocial</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRRAZONSOCIAL = "pt_p_atrRazonSocial";
    /** <code>personaTCREARCONTRATANTEptpatrRazonSocial</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRRAZONSOCIAL = "Clas_1431886233600805Ser_26Arg_1077_Alias";
    /** <code>personaTCREARCONTRATANTEptpatrRazonSocial</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRRAZONSOCIAL = "Razón Social";
    /** <code>personaTCREARCONTRATANTEptpagrPais</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPAGRPAIS = "pt_p_agrPais";
    /** <code>personaTCREARCONTRATANTEptpagrPais</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPAGRPAIS = "Clas_1431886233600805Ser_26Arg_1080_Alias";
    /** <code>personaTCREARCONTRATANTEptpagrPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPAGRPAIS = "País";
    /** <code>personaTCREARCONTRATANTEptpCodigo</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPCODIGO = "pt_p_Codigo";
    /** <code>personaTCREARCONTRATANTEptpCodigo</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPCODIGO = "Clas_1431886233600805Ser_26Arg_1083_Alias";
    /** <code>personaTCREARCONTRATANTEptpCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPCODIGO = "Código";
    /** <code>personaTCREARCONTRATANTEptpTieneEPSSanitas</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPTIENEEPSSANITAS = "pt_p_TieneEPSSanitas";
    /** <code>personaTCREARCONTRATANTEptpTieneEPSSanitas</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPTIENEEPSSANITAS = "Clas_1431886233600805Ser_26Arg_1084_Alias";
    /** <code>personaTCREARCONTRATANTEptpTieneEPSSanitas</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPTIENEEPSSANITAS = "Tiene EPS Sanitas";
    /** <code>personaTCREARCONTRATANTEptpRechazadoAfiliacion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPRECHAZADOAFILIACION = "pt_p_RechazadoAfiliacion";
    /** <code>personaTCREARCONTRATANTEptpRechazadoAfiliacion</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPRECHAZADOAFILIACION = "Clas_1431886233600805Ser_26Arg_1085_Alias";
    /** <code>personaTCREARCONTRATANTEptpRechazadoAfiliacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPRECHAZADOAFILIACION = "Rechazado Afiliación";
    /** <code>personaTCREARCONTRATANTEpDCDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPDCDIRECCIONCOMPLETA = "pDCDireccionCompleta";
    /** <code>personaTCREARCONTRATANTEpDCDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPDCDIRECCIONCOMPLETA = "Clas_1431886233600805Ser_26Arg_2660_Alias";
    /** <code>personaTCREARCONTRATANTEpDCDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPDCDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>personaTCREARCONTRATANTEpDCDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPDCDEPARTAMENTO = "pDCDepartamento";
    /** <code>personaTCREARCONTRATANTEpDCDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPDCDEPARTAMENTO = "Clas_1431886233600805Ser_26Arg_2661_Alias";
    /** <code>personaTCREARCONTRATANTEpDCDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPDCDEPARTAMENTO = "Departamento";
    /** <code>personaTCREARCONTRATANTEpDCMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPDCMUNICIPIO = "pDCMunicipio";
    /** <code>personaTCREARCONTRATANTEpDCMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPDCMUNICIPIO = "Clas_1431886233600805Ser_26Arg_2662_Alias";
    /** <code>personaTCREARCONTRATANTEpDCMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPDCMUNICIPIO = "Municipio";
    /** <code>personaTCREARCONTRATANTEpDCRural</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPDCRURAL = "pDCRural";
    /** <code>personaTCREARCONTRATANTEpDCRural</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPDCRURAL = "Clas_1431886233600805Ser_26Arg_2663_Alias";
    /** <code>personaTCREARCONTRATANTEpDCRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPDCRURAL = "Rural";
    /** <code>personaTCREARCONTRATANTEpDCTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPDCTELEFONOFIJO = "pDCTelefonoFijo";
    /** <code>personaTCREARCONTRATANTEpDCTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPDCTELEFONOFIJO = "Clas_1431886233600805Ser_26Arg_2664_Alias";
    /** <code>personaTCREARCONTRATANTEpDCTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPDCTELEFONOFIJO = "Teléfono fijo";
    /** <code>personaTCREARCONTRATANTEpDCTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPDCTELEFONOCELULAR = "pDCTelefonoCelular";
    /** <code>personaTCREARCONTRATANTEpDCTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPDCTELEFONOCELULAR = "Clas_1431886233600805Ser_26Arg_2665_Alias";
    /** <code>personaTCREARCONTRATANTEpDCTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPDCTELEFONOCELULAR = "Teléfono celular";
    /** <code>personaTCREARCONTRATANTEpDCTipoDireccion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPDCTIPODIRECCION = "pDCTipoDireccion";
    /** <code>personaTCREARCONTRATANTEpDCTipoDireccion</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPDCTIPODIRECCION = "Clas_1431886233600805Ser_26Arg_2666_Alias";
    /** <code>personaTCREARCONTRATANTEpDCTipoDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPDCTIPODIRECCION = "Tipo dirección";
    /** <code>personaTCREARCONTRATANTEpDCPais</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPDCPAIS = "pDCPais";
    /** <code>personaTCREARCONTRATANTEpDCPais</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPDCPAIS = "Clas_1431886233600805Ser_26Arg_2667_Alias";
    /** <code>personaTCREARCONTRATANTEpDCPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPDCPAIS = "País";
    /** <code>personaTCREARCONTRATANTEptEstadoPersona</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTESTADOPERSONA = "ptEstadoPersona";
    /** <code>personaTCREARCONTRATANTEptEstadoPersona</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTESTADOPERSONA = "Clas_1431886233600805Ser_26Arg_3328_Alias";
    /** <code>personaTCREARCONTRATANTEptEstadoPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTESTADOPERSONA = "Estado Persona";
    /** <code>personaTCREARCONTRATANTEptValidarDatos</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTVALIDARDATOS = "ptValidarDatos";
    /** <code>personaTCREARCONTRATANTEptValidarDatos</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTVALIDARDATOS = "Clas_1431886233600805Ser_26Arg_3414_Alias";
    /** <code>personaTCREARCONTRATANTEptValidarDatos</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTVALIDARDATOS = "ptValidarDatos";
    /** <code>personaTCREARCONTRATANTEptSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTSOLICITUD = "ptSolicitud";
    /** <code>personaTCREARCONTRATANTEptSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTSOLICITUD = "Clas_1431886233600805Ser_26Arg_7194_Alias";
    /** <code>personaTCREARCONTRATANTEptSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTSOLICITUD = "Solicitud";
    // Outbound arguments
    /** <code>personaTCREARCONTRATANTEpsPersona</code> outbound argument name. */
    public static final String ARG_NAME_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPSPERSONA = "personaTCREARCONTRATANTEpsPersona";
    /** <code>personaTCREARCONTRATANTEpsPersona</code> outbound argument id. */
    public static final String ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPSPERSONA = "Clas_1431886233600805Ser_26Arg_2897_Alias";
    /** <code>personaTCREARCONTRATANTEpsPersona</code> outbound argument alias. */
    public static final String ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPSPERSONA = "Persona";
    // Service (TMODCONTRATANTE)
    /** <code>TMODCONTRATANTE</code> service id. */
    public static final String SERV_ID_TMODCONTRATANTE = "Clas_1431886233600805Ser_27_Alias";
    /** <code>TMODCONTRATANTE</code> service name. */
    public static final String SERV_NAME_TMODCONTRATANTE = "TMODCONTRATANTE";
    /** <code>TMODCONTRATANTE</code> service alias. */
    public static final String SERV_ALIAS_TMODCONTRATANTE = "Modificar contratante";
    /** Agents allowed to execute the service TMODCONTRATANTE **/
    public static final String TMODCONTRATANTE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaTMODCONTRATANTEpthisPersona</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTHISPERSONA = "p_thisPersona";
    /** <code>personaTMODCONTRATANTEpthisPersona</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTHISPERSONA = "Clas_1431886233600805Ser_27Arg_3_Alias";
    /** <code>personaTMODCONTRATANTEpthisPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTHISPERSONA = "Contratante";
    /** <code>personaTMODCONTRATANTEptpPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPPRIMERNOMBRE = "pt_p_PrimerNombre";
    /** <code>personaTMODCONTRATANTEptpPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPPRIMERNOMBRE = "Clas_1431886233600805Ser_27Arg_6_Alias";
    /** <code>personaTMODCONTRATANTEptpPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPPRIMERNOMBRE = "Primer nombre";
    /** <code>personaTMODCONTRATANTEptpSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPSEGUNDONOMBRE = "pt_p_SegundoNombre";
    /** <code>personaTMODCONTRATANTEptpSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPSEGUNDONOMBRE = "Clas_1431886233600805Ser_27Arg_7_Alias";
    /** <code>personaTMODCONTRATANTEptpSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPSEGUNDONOMBRE = "Segundo nombre";
    /** <code>personaTMODCONTRATANTEptpPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPPRIMERAPELLIDO = "pt_p_PrimerApellido";
    /** <code>personaTMODCONTRATANTEptpPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPPRIMERAPELLIDO = "Clas_1431886233600805Ser_27Arg_8_Alias";
    /** <code>personaTMODCONTRATANTEptpPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPPRIMERAPELLIDO = "Primer Apellido";
    /** <code>personaTMODCONTRATANTEptpSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPSEGUNDOAPELLIDO = "pt_p_SegundoApellido";
    /** <code>personaTMODCONTRATANTEptpSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPSEGUNDOAPELLIDO = "Clas_1431886233600805Ser_27Arg_9_Alias";
    /** <code>personaTMODCONTRATANTEptpSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPSEGUNDOAPELLIDO = "Segundo Apellido";
    /** <code>personaTMODCONTRATANTEptpFechaNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPFECHANACIMIENTO = "pt_p_FechaNacimiento";
    /** <code>personaTMODCONTRATANTEptpFechaNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPFECHANACIMIENTO = "Clas_1431886233600805Ser_27Arg_11_Alias";
    /** <code>personaTMODCONTRATANTEptpFechaNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPFECHANACIMIENTO = "Fecha nacimiento";
    /** <code>personaTMODCONTRATANTEptpGenero</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPGENERO = "pt_p_Genero";
    /** <code>personaTMODCONTRATANTEptpGenero</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPGENERO = "Clas_1431886233600805Ser_27Arg_12_Alias";
    /** <code>personaTMODCONTRATANTEptpGenero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPGENERO = "Género";
    /** <code>personaTMODCONTRATANTEptpIndicadorExtranjero</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPINDICADOREXTRANJERO = "pt_p_IndicadorExtranjero";
    /** <code>personaTMODCONTRATANTEptpIndicadorExtranjero</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPINDICADOREXTRANJERO = "Clas_1431886233600805Ser_27Arg_13_Alias";
    /** <code>personaTMODCONTRATANTEptpIndicadorExtranjero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPINDICADOREXTRANJERO = "Indicador extranjero";
    /** <code>personaTMODCONTRATANTEptpTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPTELEFONOFIJO = "pt_p_TelefonoFijo";
    /** <code>personaTMODCONTRATANTEptpTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPTELEFONOFIJO = "Clas_1431886233600805Ser_27Arg_14_Alias";
    /** <code>personaTMODCONTRATANTEptpTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPTELEFONOFIJO = "Teléfono fijo";
    /** <code>personaTMODCONTRATANTEptpTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPTELEFONOCELULAR = "pt_p_TelefonoCelular";
    /** <code>personaTMODCONTRATANTEptpTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPTELEFONOCELULAR = "Clas_1431886233600805Ser_27Arg_15_Alias";
    /** <code>personaTMODCONTRATANTEptpTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPTELEFONOCELULAR = "Teléfono celular";
    /** <code>personaTMODCONTRATANTEptpCorreoElectronico</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPCORREOELECTRONICO = "pt_p_CorreoElectronico";
    /** <code>personaTMODCONTRATANTEptpCorreoElectronico</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPCORREOELECTRONICO = "Clas_1431886233600805Ser_27Arg_16_Alias";
    /** <code>personaTMODCONTRATANTEptpCorreoElectronico</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPCORREOELECTRONICO = "Correo electrónico";
    /** <code>personaTMODCONTRATANTEptpevcDepartamentoNac</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPEVCDEPARTAMENTONAC = "pt_p_evcDepartamentoNac";
    /** <code>personaTMODCONTRATANTEptpevcDepartamentoNac</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPEVCDEPARTAMENTONAC = "Clas_1431886233600805Ser_27Arg_19_Alias";
    /** <code>personaTMODCONTRATANTEptpevcDepartamentoNac</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPEVCDEPARTAMENTONAC = "Departamento nacimiento";
    /** <code>personaTMODCONTRATANTEptpevcMunicipioNac</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPEVCMUNICIPIONAC = "pt_p_evcMunicipioNac";
    /** <code>personaTMODCONTRATANTEptpevcMunicipioNac</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPEVCMUNICIPIONAC = "Clas_1431886233600805Ser_27Arg_20_Alias";
    /** <code>personaTMODCONTRATANTEptpevcMunicipioNac</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPEVCMUNICIPIONAC = "Municipio nacimiento";
    /** <code>personaTMODCONTRATANTEptpevcEstadoCivil</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPEVCESTADOCIVIL = "pt_p_evcEstadoCivil";
    /** <code>personaTMODCONTRATANTEptpevcEstadoCivil</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPEVCESTADOCIVIL = "Clas_1431886233600805Ser_27Arg_21_Alias";
    /** <code>personaTMODCONTRATANTEptpevcEstadoCivil</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPEVCESTADOCIVIL = "Estado civil";
    /** <code>personaTMODCONTRATANTEptpDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPDIRECCIONCOMPLETA = "pt_p_DireccionCompleta";
    /** <code>personaTMODCONTRATANTEptpDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPDIRECCIONCOMPLETA = "Clas_1431886233600805Ser_27Arg_22_Alias";
    /** <code>personaTMODCONTRATANTEptpDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>personaTMODCONTRATANTEptpRural</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPRURAL = "pt_p_Rural";
    /** <code>personaTMODCONTRATANTEptpRural</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPRURAL = "Clas_1431886233600805Ser_27Arg_24_Alias";
    /** <code>personaTMODCONTRATANTEptpRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPRURAL = "Rural";
    /** <code>personaTMODCONTRATANTEptpevcTipoDireccion</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPEVCTIPODIRECCION = "pt_p_evcTipoDireccion";
    /** <code>personaTMODCONTRATANTEptpevcTipoDireccion</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPEVCTIPODIRECCION = "Clas_1431886233600805Ser_27Arg_27_Alias";
    /** <code>personaTMODCONTRATANTEptpevcTipoDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPEVCTIPODIRECCION = "Tipo dirección";
    /** <code>personaTMODCONTRATANTEptpevcDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPEVCDEPARTAMENTO = "pt_p_evcDepartamento";
    /** <code>personaTMODCONTRATANTEptpevcDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPEVCDEPARTAMENTO = "Clas_1431886233600805Ser_27Arg_28_Alias";
    /** <code>personaTMODCONTRATANTEptpevcDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPEVCDEPARTAMENTO = "Departamento";
    /** <code>personaTMODCONTRATANTEptpevcMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPEVCMUNICIPIO = "pt_p_evcMunicipio";
    /** <code>personaTMODCONTRATANTEptpevcMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPEVCMUNICIPIO = "Clas_1431886233600805Ser_27Arg_29_Alias";
    /** <code>personaTMODCONTRATANTEptpevcMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPEVCMUNICIPIO = "Municipio";
    /** <code>personaTMODCONTRATANTEptpNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPNUMIDENTIFICACION = "pt_p_NumIdentificacion";
    /** <code>personaTMODCONTRATANTEptpNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPNUMIDENTIFICACION = "Clas_1431886233600805Ser_27Arg_32_Alias";
    /** <code>personaTMODCONTRATANTEptpNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPNUMIDENTIFICACION = "Nº Identificación";
    /** <code>personaTMODCONTRATANTEptpevcTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPEVCTIPOIDENTIFICACION = "pt_p_evcTipoIdentificacion";
    /** <code>personaTMODCONTRATANTEptpevcTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPEVCTIPOIDENTIFICACION = "Clas_1431886233600805Ser_27Arg_33_Alias";
    /** <code>personaTMODCONTRATANTEptpevcTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPEVCTIPOIDENTIFICACION = "Tipo identificación";
    /** <code>personaTMODCONTRATANTEpatrRazonSocial</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPATRRAZONSOCIAL = "p_atrRazonSocial";
    /** <code>personaTMODCONTRATANTEpatrRazonSocial</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPATRRAZONSOCIAL = "Clas_1431886233600805Ser_27Arg_35_Alias";
    /** <code>personaTMODCONTRATANTEpatrRazonSocial</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPATRRAZONSOCIAL = "Razón Social";
    /** <code>personaTMODCONTRATANTEpDCDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPDCDIRECCIONCOMPLETA = "pDCDireccionCompleta";
    /** <code>personaTMODCONTRATANTEpDCDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPDCDIRECCIONCOMPLETA = "Clas_1431886233600805Ser_27Arg_36_Alias";
    /** <code>personaTMODCONTRATANTEpDCDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPDCDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>personaTMODCONTRATANTEpDCDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPDCDEPARTAMENTO = "pDCDepartamento";
    /** <code>personaTMODCONTRATANTEpDCDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPDCDEPARTAMENTO = "Clas_1431886233600805Ser_27Arg_37_Alias";
    /** <code>personaTMODCONTRATANTEpDCDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPDCDEPARTAMENTO = "Departamento";
    /** <code>personaTMODCONTRATANTEpDCMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPDCMUNICIPIO = "pDCMunicipio";
    /** <code>personaTMODCONTRATANTEpDCMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPDCMUNICIPIO = "Clas_1431886233600805Ser_27Arg_38_Alias";
    /** <code>personaTMODCONTRATANTEpDCMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPDCMUNICIPIO = "Municipio";
    /** <code>personaTMODCONTRATANTEpDCRural</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPDCRURAL = "pDCRural";
    /** <code>personaTMODCONTRATANTEpDCRural</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPDCRURAL = "Clas_1431886233600805Ser_27Arg_39_Alias";
    /** <code>personaTMODCONTRATANTEpDCRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPDCRURAL = "Rural";
    /** <code>personaTMODCONTRATANTEpDCTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPDCTELEFONOFIJO = "pDCTelefonoFijo";
    /** <code>personaTMODCONTRATANTEpDCTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPDCTELEFONOFIJO = "Clas_1431886233600805Ser_27Arg_40_Alias";
    /** <code>personaTMODCONTRATANTEpDCTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPDCTELEFONOFIJO = "Teléfono fijo";
    /** <code>personaTMODCONTRATANTEpDCTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPDCTELEFONOCELULAR = "pDCTelefonoCelular";
    /** <code>personaTMODCONTRATANTEpDCTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPDCTELEFONOCELULAR = "Clas_1431886233600805Ser_27Arg_41_Alias";
    /** <code>personaTMODCONTRATANTEpDCTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPDCTELEFONOCELULAR = "Teléfono celular";
    /** <code>personaTMODCONTRATANTEpDCTipoDireccion</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPDCTIPODIRECCION = "pDCTipoDireccion";
    /** <code>personaTMODCONTRATANTEpDCTipoDireccion</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPDCTIPODIRECCION = "Clas_1431886233600805Ser_27Arg_42_Alias";
    /** <code>personaTMODCONTRATANTEpDCTipoDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPDCTIPODIRECCION = "Tipo dirección";
    /** <code>personaTMODCONTRATANTEptpCodigo</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPCODIGO = "pt_p_Codigo";
    /** <code>personaTMODCONTRATANTEptpCodigo</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPCODIGO = "Clas_1431886233600805Ser_27Arg_43_Alias";
    /** <code>personaTMODCONTRATANTEptpCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPCODIGO = "Código";
    /** <code>personaTMODCONTRATANTEptValidarDatos</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTVALIDARDATOS = "ptValidarDatos";
    /** <code>personaTMODCONTRATANTEptValidarDatos</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTVALIDARDATOS = "Clas_1431886233600805Ser_27Arg_44_Alias";
    /** <code>personaTMODCONTRATANTEptValidarDatos</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTVALIDARDATOS = "ptValidarDatos";
    /** <code>personaTMODCONTRATANTEptEstadoPersona</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTESTADOPERSONA = "ptEstadoPersona";
    /** <code>personaTMODCONTRATANTEptEstadoPersona</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTESTADOPERSONA = "Clas_1431886233600805Ser_27Arg_45_Alias";
    /** <code>personaTMODCONTRATANTEptEstadoPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTESTADOPERSONA = "Estado Persona";
    /** <code>personaTMODCONTRATANTEptpagrPais</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPAGRPAIS = "pt_p_agrPais";
    /** <code>personaTMODCONTRATANTEptpagrPais</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPAGRPAIS = "Clas_1431886233600805Ser_27Arg_46_Alias";
    /** <code>personaTMODCONTRATANTEptpagrPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPAGRPAIS = "País";
    /** <code>personaTMODCONTRATANTEptpRechazadoAfiliacion</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPRECHAZADOAFILIACION = "pt_p_RechazadoAfiliacion";
    /** <code>personaTMODCONTRATANTEptpRechazadoAfiliacion</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPRECHAZADOAFILIACION = "Clas_1431886233600805Ser_27Arg_47_Alias";
    /** <code>personaTMODCONTRATANTEptpRechazadoAfiliacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPRECHAZADOAFILIACION = "Rechazado Afiliación";
    /** <code>personaTMODCONTRATANTEptpTieneEPSSanitas</code> inbound argument name. */
    public static final String ARG_NAME_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPTIENEEPSSANITAS = "pt_p_TieneEPSSanitas";
    /** <code>personaTMODCONTRATANTEptpTieneEPSSanitas</code> inbound argument id. */
    public static final String ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPTIENEEPSSANITAS = "Clas_1431886233600805Ser_27Arg_48_Alias";
    /** <code>personaTMODCONTRATANTEptpTieneEPSSanitas</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPTIENEEPSSANITAS = "Tiene EPS Sanitas";
    // Service (TMODUSUARIO)
    /** <code>TMODUSUARIO</code> service id. */
    public static final String SERV_ID_TMODUSUARIO = "Clas_1431886233600805Ser_35_Alias";
    /** <code>TMODUSUARIO</code> service name. */
    public static final String SERV_NAME_TMODUSUARIO = "TMODUSUARIO";
    /** <code>TMODUSUARIO</code> service alias. */
    public static final String SERV_ALIAS_TMODUSUARIO = "Modificar usuario";
    /** Agents allowed to execute the service TMODUSUARIO **/
    public static final String TMODUSUARIO_SRVAGENTS = "";
    // Preconditions
    /** <code>TMODUSUARIO</code> precondition 0 id. */
    public static final String PRE_ID_TMODUSUARIO_0 = "Clas_1431886233600805Pre_60_MsgError";
    // Inbound arguments
    /** <code>personaTMODUSUARIOpthisPersona</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_PERSONATMODUSUARIOPTHISPERSONA = "p_thisPersona";
    /** <code>personaTMODUSUARIOpthisPersona</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_PERSONATMODUSUARIOPTHISPERSONA = "Clas_1431886233600805Ser_35Arg_1_Alias";
    /** <code>personaTMODUSUARIOpthisPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_PERSONATMODUSUARIOPTHISPERSONA = "Persona";
    /** <code>personaTMODUSUARIOptpPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_PERSONATMODUSUARIOPTPPRIMERNOMBRE = "pt_p_PrimerNombre";
    /** <code>personaTMODUSUARIOptpPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_PERSONATMODUSUARIOPTPPRIMERNOMBRE = "Clas_1431886233600805Ser_35Arg_2_Alias";
    /** <code>personaTMODUSUARIOptpPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_PERSONATMODUSUARIOPTPPRIMERNOMBRE = "Primer nombre";
    /** <code>personaTMODUSUARIOptpSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_PERSONATMODUSUARIOPTPSEGUNDONOMBRE = "pt_p_SegundoNombre";
    /** <code>personaTMODUSUARIOptpSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_PERSONATMODUSUARIOPTPSEGUNDONOMBRE = "Clas_1431886233600805Ser_35Arg_3_Alias";
    /** <code>personaTMODUSUARIOptpSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_PERSONATMODUSUARIOPTPSEGUNDONOMBRE = "Segundo nombre";
    /** <code>personaTMODUSUARIOptpPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_PERSONATMODUSUARIOPTPPRIMERAPELLIDO = "pt_p_PrimerApellido";
    /** <code>personaTMODUSUARIOptpPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_PERSONATMODUSUARIOPTPPRIMERAPELLIDO = "Clas_1431886233600805Ser_35Arg_4_Alias";
    /** <code>personaTMODUSUARIOptpPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_PERSONATMODUSUARIOPTPPRIMERAPELLIDO = "Primer Apellido";
    /** <code>personaTMODUSUARIOptpSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_PERSONATMODUSUARIOPTPSEGUNDOAPELLIDO = "pt_p_SegundoApellido";
    /** <code>personaTMODUSUARIOptpSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_PERSONATMODUSUARIOPTPSEGUNDOAPELLIDO = "Clas_1431886233600805Ser_35Arg_5_Alias";
    /** <code>personaTMODUSUARIOptpSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_PERSONATMODUSUARIOPTPSEGUNDOAPELLIDO = "Segundo Apellido";
    /** <code>personaTMODUSUARIOptpFechaNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_PERSONATMODUSUARIOPTPFECHANACIMIENTO = "pt_p_FechaNacimiento";
    /** <code>personaTMODUSUARIOptpFechaNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_PERSONATMODUSUARIOPTPFECHANACIMIENTO = "Clas_1431886233600805Ser_35Arg_6_Alias";
    /** <code>personaTMODUSUARIOptpFechaNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_PERSONATMODUSUARIOPTPFECHANACIMIENTO = "Fecha nacimiento";
    /** <code>personaTMODUSUARIOptpGenero</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_PERSONATMODUSUARIOPTPGENERO = "pt_p_Genero";
    /** <code>personaTMODUSUARIOptpGenero</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_PERSONATMODUSUARIOPTPGENERO = "Clas_1431886233600805Ser_35Arg_7_Alias";
    /** <code>personaTMODUSUARIOptpGenero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_PERSONATMODUSUARIOPTPGENERO = "Género";
    /** <code>personaTMODUSUARIOptpIndicadorExtranjero</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_PERSONATMODUSUARIOPTPINDICADOREXTRANJERO = "pt_p_IndicadorExtranjero";
    /** <code>personaTMODUSUARIOptpIndicadorExtranjero</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_PERSONATMODUSUARIOPTPINDICADOREXTRANJERO = "Clas_1431886233600805Ser_35Arg_8_Alias";
    /** <code>personaTMODUSUARIOptpIndicadorExtranjero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_PERSONATMODUSUARIOPTPINDICADOREXTRANJERO = "Indicador extranjero";
    /** <code>personaTMODUSUARIOptpTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_PERSONATMODUSUARIOPTPTELEFONOFIJO = "pt_p_TelefonoFijo";
    /** <code>personaTMODUSUARIOptpTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_PERSONATMODUSUARIOPTPTELEFONOFIJO = "Clas_1431886233600805Ser_35Arg_9_Alias";
    /** <code>personaTMODUSUARIOptpTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_PERSONATMODUSUARIOPTPTELEFONOFIJO = "Teléfono fijo";
    /** <code>personaTMODUSUARIOptpTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_PERSONATMODUSUARIOPTPTELEFONOCELULAR = "pt_p_TelefonoCelular";
    /** <code>personaTMODUSUARIOptpTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_PERSONATMODUSUARIOPTPTELEFONOCELULAR = "Clas_1431886233600805Ser_35Arg_10_Alias";
    /** <code>personaTMODUSUARIOptpTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_PERSONATMODUSUARIOPTPTELEFONOCELULAR = "Teléfono celular";
    /** <code>personaTMODUSUARIOptpCorreoElectronico</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_PERSONATMODUSUARIOPTPCORREOELECTRONICO = "pt_p_CorreoElectronico";
    /** <code>personaTMODUSUARIOptpCorreoElectronico</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_PERSONATMODUSUARIOPTPCORREOELECTRONICO = "Clas_1431886233600805Ser_35Arg_11_Alias";
    /** <code>personaTMODUSUARIOptpCorreoElectronico</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_PERSONATMODUSUARIOPTPCORREOELECTRONICO = "Correo electrónico";
    /** <code>personaTMODUSUARIOptpevcDepartamentoNac</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_PERSONATMODUSUARIOPTPEVCDEPARTAMENTONAC = "pt_p_evcDepartamentoNac";
    /** <code>personaTMODUSUARIOptpevcDepartamentoNac</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_PERSONATMODUSUARIOPTPEVCDEPARTAMENTONAC = "Clas_1431886233600805Ser_35Arg_12_Alias";
    /** <code>personaTMODUSUARIOptpevcDepartamentoNac</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_PERSONATMODUSUARIOPTPEVCDEPARTAMENTONAC = "Departamento nacimiento";
    /** <code>personaTMODUSUARIOptpevcMunicipioNac</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_PERSONATMODUSUARIOPTPEVCMUNICIPIONAC = "pt_p_evcMunicipioNac";
    /** <code>personaTMODUSUARIOptpevcMunicipioNac</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_PERSONATMODUSUARIOPTPEVCMUNICIPIONAC = "Clas_1431886233600805Ser_35Arg_13_Alias";
    /** <code>personaTMODUSUARIOptpevcMunicipioNac</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_PERSONATMODUSUARIOPTPEVCMUNICIPIONAC = "Municipio nacimiento";
    /** <code>personaTMODUSUARIOptpevcEstadoCivil</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_PERSONATMODUSUARIOPTPEVCESTADOCIVIL = "pt_p_evcEstadoCivil";
    /** <code>personaTMODUSUARIOptpevcEstadoCivil</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_PERSONATMODUSUARIOPTPEVCESTADOCIVIL = "Clas_1431886233600805Ser_35Arg_14_Alias";
    /** <code>personaTMODUSUARIOptpevcEstadoCivil</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_PERSONATMODUSUARIOPTPEVCESTADOCIVIL = "Estado civil";
    /** <code>personaTMODUSUARIOptpDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_PERSONATMODUSUARIOPTPDIRECCIONCOMPLETA = "pt_p_DireccionCompleta";
    /** <code>personaTMODUSUARIOptpDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_PERSONATMODUSUARIOPTPDIRECCIONCOMPLETA = "Clas_1431886233600805Ser_35Arg_15_Alias";
    /** <code>personaTMODUSUARIOptpDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_PERSONATMODUSUARIOPTPDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>personaTMODUSUARIOptpRural</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_PERSONATMODUSUARIOPTPRURAL = "pt_p_Rural";
    /** <code>personaTMODUSUARIOptpRural</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_PERSONATMODUSUARIOPTPRURAL = "Clas_1431886233600805Ser_35Arg_17_Alias";
    /** <code>personaTMODUSUARIOptpRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_PERSONATMODUSUARIOPTPRURAL = "Rural";
    /** <code>personaTMODUSUARIOptpevcTipoDireccion</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_PERSONATMODUSUARIOPTPEVCTIPODIRECCION = "pt_p_evcTipoDireccion";
    /** <code>personaTMODUSUARIOptpevcTipoDireccion</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_PERSONATMODUSUARIOPTPEVCTIPODIRECCION = "Clas_1431886233600805Ser_35Arg_19_Alias";
    /** <code>personaTMODUSUARIOptpevcTipoDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_PERSONATMODUSUARIOPTPEVCTIPODIRECCION = "Tipo dirección";
    /** <code>personaTMODUSUARIOptpevcDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_PERSONATMODUSUARIOPTPEVCDEPARTAMENTO = "pt_p_evcDepartamento";
    /** <code>personaTMODUSUARIOptpevcDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_PERSONATMODUSUARIOPTPEVCDEPARTAMENTO = "Clas_1431886233600805Ser_35Arg_20_Alias";
    /** <code>personaTMODUSUARIOptpevcDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_PERSONATMODUSUARIOPTPEVCDEPARTAMENTO = "Departamento";
    /** <code>personaTMODUSUARIOptpevcMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_PERSONATMODUSUARIOPTPEVCMUNICIPIO = "pt_p_evcMunicipio";
    /** <code>personaTMODUSUARIOptpevcMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_PERSONATMODUSUARIOPTPEVCMUNICIPIO = "Clas_1431886233600805Ser_35Arg_21_Alias";
    /** <code>personaTMODUSUARIOptpevcMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_PERSONATMODUSUARIOPTPEVCMUNICIPIO = "Municipio";
    /** <code>personaTMODUSUARIOptpNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_PERSONATMODUSUARIOPTPNUMIDENTIFICACION = "pt_p_NumIdentificacion";
    /** <code>personaTMODUSUARIOptpNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_PERSONATMODUSUARIOPTPNUMIDENTIFICACION = "Clas_1431886233600805Ser_35Arg_25_Alias";
    /** <code>personaTMODUSUARIOptpNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_PERSONATMODUSUARIOPTPNUMIDENTIFICACION = "Nº Identificación";
    /** <code>personaTMODUSUARIOptpevcTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_PERSONATMODUSUARIOPTPEVCTIPOIDENTIFICACION = "pt_p_evcTipoIdentificacion";
    /** <code>personaTMODUSUARIOptpevcTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_PERSONATMODUSUARIOPTPEVCTIPOIDENTIFICACION = "Clas_1431886233600805Ser_35Arg_26_Alias";
    /** <code>personaTMODUSUARIOptpevcTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_PERSONATMODUSUARIOPTPEVCTIPOIDENTIFICACION = "Tipo identificación";
    /** <code>personaTMODUSUARIOptpagrPais</code> inbound argument name. */
    public static final String ARG_NAME_TMODUSUARIO_PERSONATMODUSUARIOPTPAGRPAIS = "pt_p_agrPais";
    /** <code>personaTMODUSUARIOptpagrPais</code> inbound argument id. */
    public static final String ARG_ID_TMODUSUARIO_PERSONATMODUSUARIOPTPAGRPAIS = "Clas_1431886233600805Ser_35Arg_27_Alias";
    /** <code>personaTMODUSUARIOptpagrPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODUSUARIO_PERSONATMODUSUARIOPTPAGRPAIS = "País";
    // Service (TCREARUSUARIO)
    /** <code>TCREARUSUARIO</code> service id. */
    public static final String SERV_ID_TCREARUSUARIO = "Clas_1431886233600805Ser_29_Alias";
    /** <code>TCREARUSUARIO</code> service name. */
    public static final String SERV_NAME_TCREARUSUARIO = "TCREARUSUARIO";
    /** <code>TCREARUSUARIO</code> service alias. */
    public static final String SERV_ALIAS_TCREARUSUARIO = "Crear usuario";
    /** Agents allowed to execute the service TCREARUSUARIO **/
    public static final String TCREARUSUARIO_SRVAGENTS = "";
    // Preconditions
    /** <code>TCREARUSUARIO</code> precondition 0 id. */
    public static final String PRE_ID_TCREARUSUARIO_0 = "Clas_1431886233600805Pre_81_MsgError";
    /** <code>TCREARUSUARIO</code> precondition 1 id. */
    public static final String PRE_ID_TCREARUSUARIO_1 = "Clas_1431886233600805Pre_94_MsgError";
    // Inbound arguments
    /** <code>personaTCREARUSUARIOptpagrTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARUSUARIO_PERSONATCREARUSUARIOPTPAGRTIPOIDENTIFICACION = "pt_p_agrTipoIdentificacion";
    /** <code>personaTCREARUSUARIOptpagrTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTPAGRTIPOIDENTIFICACION = "Clas_1431886233600805Ser_29Arg_2_Alias";
    /** <code>personaTCREARUSUARIOptpagrTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTPAGRTIPOIDENTIFICACION = "Tipo identificación";
    /** <code>personaTCREARUSUARIOptpagrDepartamentoNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TCREARUSUARIO_PERSONATCREARUSUARIOPTPAGRDEPARTAMENTONACIMIENTO = "pt_p_agrDepartamentoNacimiento";
    /** <code>personaTCREARUSUARIOptpagrDepartamentoNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTPAGRDEPARTAMENTONACIMIENTO = "Clas_1431886233600805Ser_29Arg_3_Alias";
    /** <code>personaTCREARUSUARIOptpagrDepartamentoNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTPAGRDEPARTAMENTONACIMIENTO = "Departamento nacimiento";
    /** <code>personaTCREARUSUARIOptpagrMunicipioNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TCREARUSUARIO_PERSONATCREARUSUARIOPTPAGRMUNICIPIONACIMIENTO = "pt_p_agrMunicipioNacimiento";
    /** <code>personaTCREARUSUARIOptpagrMunicipioNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTPAGRMUNICIPIONACIMIENTO = "Clas_1431886233600805Ser_29Arg_4_Alias";
    /** <code>personaTCREARUSUARIOptpagrMunicipioNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTPAGRMUNICIPIONACIMIENTO = "Municipio nacimiento";
    /** <code>personaTCREARUSUARIOptpagrEstadoCivil</code> inbound argument name. */
    public static final String ARG_NAME_TCREARUSUARIO_PERSONATCREARUSUARIOPTPAGRESTADOCIVIL = "pt_p_agrEstadoCivil";
    /** <code>personaTCREARUSUARIOptpagrEstadoCivil</code> inbound argument id. */
    public static final String ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTPAGRESTADOCIVIL = "Clas_1431886233600805Ser_29Arg_5_Alias";
    /** <code>personaTCREARUSUARIOptpagrEstadoCivil</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTPAGRESTADOCIVIL = "EstadoCivil";
    /** <code>personaTCREARUSUARIOptpatrNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRNUMIDENTIFICACION = "pt_p_atrNumIdentificacion";
    /** <code>personaTCREARUSUARIOptpatrNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRNUMIDENTIFICACION = "Clas_1431886233600805Ser_29Arg_6_Alias";
    /** <code>personaTCREARUSUARIOptpatrNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRNUMIDENTIFICACION = "Nº Identificación";
    /** <code>personaTCREARUSUARIOptpatrPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRPRIMERNOMBRE = "pt_p_atrPrimerNombre";
    /** <code>personaTCREARUSUARIOptpatrPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRPRIMERNOMBRE = "Clas_1431886233600805Ser_29Arg_7_Alias";
    /** <code>personaTCREARUSUARIOptpatrPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRPRIMERNOMBRE = "Primer nombre";
    /** <code>personaTCREARUSUARIOptpatrSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRSEGUNDONOMBRE = "pt_p_atrSegundoNombre";
    /** <code>personaTCREARUSUARIOptpatrSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRSEGUNDONOMBRE = "Clas_1431886233600805Ser_29Arg_8_Alias";
    /** <code>personaTCREARUSUARIOptpatrSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRSEGUNDONOMBRE = "Segundo nombre";
    /** <code>personaTCREARUSUARIOptpatrPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRPRIMERAPELLIDO = "pt_p_atrPrimerApellido";
    /** <code>personaTCREARUSUARIOptpatrPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRPRIMERAPELLIDO = "Clas_1431886233600805Ser_29Arg_9_Alias";
    /** <code>personaTCREARUSUARIOptpatrPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRPRIMERAPELLIDO = "Primer Apellido";
    /** <code>personaTCREARUSUARIOptpatrSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRSEGUNDOAPELLIDO = "pt_p_atrSegundoApellido";
    /** <code>personaTCREARUSUARIOptpatrSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRSEGUNDOAPELLIDO = "Clas_1431886233600805Ser_29Arg_10_Alias";
    /** <code>personaTCREARUSUARIOptpatrSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRSEGUNDOAPELLIDO = "Segundo Apellido";
    /** <code>personaTCREARUSUARIOptpatrFechaNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRFECHANACIMIENTO = "pt_p_atrFechaNacimiento";
    /** <code>personaTCREARUSUARIOptpatrFechaNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRFECHANACIMIENTO = "Clas_1431886233600805Ser_29Arg_11_Alias";
    /** <code>personaTCREARUSUARIOptpatrFechaNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRFECHANACIMIENTO = "Fecha nacimiento";
    /** <code>personaTCREARUSUARIOptpatrGenero</code> inbound argument name. */
    public static final String ARG_NAME_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRGENERO = "pt_p_atrGenero";
    /** <code>personaTCREARUSUARIOptpatrGenero</code> inbound argument id. */
    public static final String ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRGENERO = "Clas_1431886233600805Ser_29Arg_12_Alias";
    /** <code>personaTCREARUSUARIOptpatrGenero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRGENERO = "Género";
    /** <code>personaTCREARUSUARIOptpatrIndicadorExtranjero</code> inbound argument name. */
    public static final String ARG_NAME_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRINDICADOREXTRANJERO = "pt_p_atrIndicadorExtranjero";
    /** <code>personaTCREARUSUARIOptpatrIndicadorExtranjero</code> inbound argument id. */
    public static final String ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRINDICADOREXTRANJERO = "Clas_1431886233600805Ser_29Arg_13_Alias";
    /** <code>personaTCREARUSUARIOptpatrIndicadorExtranjero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRINDICADOREXTRANJERO = "Indicador extranjero";
    /** <code>personaTCREARUSUARIOptpatrTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRTELEFONOFIJO = "pt_p_atrTelefonoFijo";
    /** <code>personaTCREARUSUARIOptpatrTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRTELEFONOFIJO = "Clas_1431886233600805Ser_29Arg_14_Alias";
    /** <code>personaTCREARUSUARIOptpatrTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRTELEFONOFIJO = "Teléfono fijo";
    /** <code>personaTCREARUSUARIOptpatrTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRTELEFONOCELULAR = "pt_p_atrTelefonoCelular";
    /** <code>personaTCREARUSUARIOptpatrTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRTELEFONOCELULAR = "Clas_1431886233600805Ser_29Arg_15_Alias";
    /** <code>personaTCREARUSUARIOptpatrTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRTELEFONOCELULAR = "Teléfono celular";
    /** <code>personaTCREARUSUARIOptpatrCorreoElectronico</code> inbound argument name. */
    public static final String ARG_NAME_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRCORREOELECTRONICO = "pt_p_atrCorreoElectronico";
    /** <code>personaTCREARUSUARIOptpatrCorreoElectronico</code> inbound argument id. */
    public static final String ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRCORREOELECTRONICO = "Clas_1431886233600805Ser_29Arg_16_Alias";
    /** <code>personaTCREARUSUARIOptpatrCorreoElectronico</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRCORREOELECTRONICO = "Correo electrónico";
    /** <code>personaTCREARUSUARIOptpagrDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TCREARUSUARIO_PERSONATCREARUSUARIOPTPAGRDEPARTAMENTO = "pt_p_agrDepartamento";
    /** <code>personaTCREARUSUARIOptpagrDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTPAGRDEPARTAMENTO = "Clas_1431886233600805Ser_29Arg_17_Alias";
    /** <code>personaTCREARUSUARIOptpagrDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTPAGRDEPARTAMENTO = "Departamento";
    /** <code>personaTCREARUSUARIOptpagrMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TCREARUSUARIO_PERSONATCREARUSUARIOPTPAGRMUNICIPIO = "pt_p_agrMunicipio";
    /** <code>personaTCREARUSUARIOptpagrMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTPAGRMUNICIPIO = "Clas_1431886233600805Ser_29Arg_18_Alias";
    /** <code>personaTCREARUSUARIOptpagrMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTPAGRMUNICIPIO = "Municipio";
    /** <code>personaTCREARUSUARIOptpatrDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRDIRECCIONCOMPLETA = "pt_p_atrDireccionCompleta";
    /** <code>personaTCREARUSUARIOptpatrDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRDIRECCIONCOMPLETA = "Clas_1431886233600805Ser_29Arg_19_Alias";
    /** <code>personaTCREARUSUARIOptpatrDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>personaTCREARUSUARIOptpatrRural</code> inbound argument name. */
    public static final String ARG_NAME_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRRURAL = "pt_p_atrRural";
    /** <code>personaTCREARUSUARIOptpatrRural</code> inbound argument id. */
    public static final String ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRRURAL = "Clas_1431886233600805Ser_29Arg_21_Alias";
    /** <code>personaTCREARUSUARIOptpatrRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRRURAL = "Rural";
    /** <code>personaTCREARUSUARIOptTipoDireccion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARUSUARIO_PERSONATCREARUSUARIOPTTIPODIRECCION = "pt_TipoDireccion";
    /** <code>personaTCREARUSUARIOptTipoDireccion</code> inbound argument id. */
    public static final String ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTTIPODIRECCION = "Clas_1431886233600805Ser_29Arg_24_Alias";
    /** <code>personaTCREARUSUARIOptTipoDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTTIPODIRECCION = "Tipo dirección";
    /** <code>personaTCREARUSUARIOptpCodigo</code> inbound argument name. */
    public static final String ARG_NAME_TCREARUSUARIO_PERSONATCREARUSUARIOPTPCODIGO = "pt_p_Codigo";
    /** <code>personaTCREARUSUARIOptpCodigo</code> inbound argument id. */
    public static final String ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTPCODIGO = "Clas_1431886233600805Ser_29Arg_1066_Alias";
    /** <code>personaTCREARUSUARIOptpCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTPCODIGO = "Código";
    /** <code>personaTCREARUSUARIOptpTieneEPSSanitas</code> inbound argument name. */
    public static final String ARG_NAME_TCREARUSUARIO_PERSONATCREARUSUARIOPTPTIENEEPSSANITAS = "pt_p_TieneEPSSanitas";
    /** <code>personaTCREARUSUARIOptpTieneEPSSanitas</code> inbound argument id. */
    public static final String ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTPTIENEEPSSANITAS = "Clas_1431886233600805Ser_29Arg_1067_Alias";
    /** <code>personaTCREARUSUARIOptpTieneEPSSanitas</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTPTIENEEPSSANITAS = "Tiene EPS Sanitas";
    /** <code>personaTCREARUSUARIOptpRechazadoAfiliacion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARUSUARIO_PERSONATCREARUSUARIOPTPRECHAZADOAFILIACION = "pt_p_RechazadoAfiliacion";
    /** <code>personaTCREARUSUARIOptpRechazadoAfiliacion</code> inbound argument id. */
    public static final String ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTPRECHAZADOAFILIACION = "Clas_1431886233600805Ser_29Arg_1068_Alias";
    /** <code>personaTCREARUSUARIOptpRechazadoAfiliacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTPRECHAZADOAFILIACION = "Rechazado Afiliación";
    /** <code>personaTCREARUSUARIOptpagrPais</code> inbound argument name. */
    public static final String ARG_NAME_TCREARUSUARIO_PERSONATCREARUSUARIOPTPAGRPAIS = "pt_p_agrPais";
    /** <code>personaTCREARUSUARIOptpagrPais</code> inbound argument id. */
    public static final String ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTPAGRPAIS = "Clas_1431886233600805Ser_29Arg_1070_Alias";
    /** <code>personaTCREARUSUARIOptpagrPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTPAGRPAIS = "País";
    /** <code>personaTCREARUSUARIOptCheckTipoRegimen</code> inbound argument name. */
    public static final String ARG_NAME_TCREARUSUARIO_PERSONATCREARUSUARIOPTCHECKTIPOREGIMEN = "ptCheckTipoRegimen";
    /** <code>personaTCREARUSUARIOptCheckTipoRegimen</code> inbound argument id. */
    public static final String ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTCHECKTIPOREGIMEN = "Clas_1431886233600805Ser_29Arg_2927_Alias";
    /** <code>personaTCREARUSUARIOptCheckTipoRegimen</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTCHECKTIPOREGIMEN = "ptCheckTipoRegimen";
    /** <code>personaTCREARUSUARIOptValidarDatos</code> inbound argument name. */
    public static final String ARG_NAME_TCREARUSUARIO_PERSONATCREARUSUARIOPTVALIDARDATOS = "ptValidarDatos";
    /** <code>personaTCREARUSUARIOptValidarDatos</code> inbound argument id. */
    public static final String ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTVALIDARDATOS = "Clas_1431886233600805Ser_29Arg_3250_Alias";
    /** <code>personaTCREARUSUARIOptValidarDatos</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTVALIDARDATOS = "ptValidarDatos";
    /** <code>personaTCREARUSUARIOptEstadoPersona</code> inbound argument name. */
    public static final String ARG_NAME_TCREARUSUARIO_PERSONATCREARUSUARIOPTESTADOPERSONA = "ptEstadoPersona";
    /** <code>personaTCREARUSUARIOptEstadoPersona</code> inbound argument id. */
    public static final String ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTESTADOPERSONA = "Clas_1431886233600805Ser_29Arg_3258_Alias";
    /** <code>personaTCREARUSUARIOptEstadoPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTESTADOPERSONA = "Estado Persona";
    /** <code>personaTCREARUSUARIOptSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREARUSUARIO_PERSONATCREARUSUARIOPTSOLICITUD = "ptSolicitud";
    /** <code>personaTCREARUSUARIOptSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTSOLICITUD = "Clas_1431886233600805Ser_29Arg_7122_Alias";
    /** <code>personaTCREARUSUARIOptSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTSOLICITUD = "Solicitud";
    // Service (TMODTITULAR)
    /** <code>TMODTITULAR</code> service id. */
    public static final String SERV_ID_TMODTITULAR = "Clas_1431886233600805Ser_44_Alias";
    /** <code>TMODTITULAR</code> service name. */
    public static final String SERV_NAME_TMODTITULAR = "TMODTITULAR";
    /** <code>TMODTITULAR</code> service alias. */
    public static final String SERV_ALIAS_TMODTITULAR = "Modificar titular";
    /** Agents allowed to execute the service TMODTITULAR **/
    public static final String TMODTITULAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaTMODTITULARpthisPersona</code> inbound argument name. */
    public static final String ARG_NAME_TMODTITULAR_PERSONATMODTITULARPTHISPERSONA = "p_thisPersona";
    /** <code>personaTMODTITULARpthisPersona</code> inbound argument id. */
    public static final String ARG_ID_TMODTITULAR_PERSONATMODTITULARPTHISPERSONA = "Clas_1431886233600805Ser_44Arg_1_Alias";
    /** <code>personaTMODTITULARpthisPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTHISPERSONA = "Persona";
    /** <code>personaTMODTITULARptpPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TMODTITULAR_PERSONATMODTITULARPTPPRIMERNOMBRE = "pt_p_PrimerNombre";
    /** <code>personaTMODTITULARptpPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TMODTITULAR_PERSONATMODTITULARPTPPRIMERNOMBRE = "Clas_1431886233600805Ser_44Arg_2_Alias";
    /** <code>personaTMODTITULARptpPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTPPRIMERNOMBRE = "Primer nombre";
    /** <code>personaTMODTITULARptpSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TMODTITULAR_PERSONATMODTITULARPTPSEGUNDONOMBRE = "pt_p_SegundoNombre";
    /** <code>personaTMODTITULARptpSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TMODTITULAR_PERSONATMODTITULARPTPSEGUNDONOMBRE = "Clas_1431886233600805Ser_44Arg_3_Alias";
    /** <code>personaTMODTITULARptpSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTPSEGUNDONOMBRE = "Segundo nombre";
    /** <code>personaTMODTITULARptpPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TMODTITULAR_PERSONATMODTITULARPTPPRIMERAPELLIDO = "pt_p_PrimerApellido";
    /** <code>personaTMODTITULARptpPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TMODTITULAR_PERSONATMODTITULARPTPPRIMERAPELLIDO = "Clas_1431886233600805Ser_44Arg_4_Alias";
    /** <code>personaTMODTITULARptpPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTPPRIMERAPELLIDO = "Primer Apellido";
    /** <code>personaTMODTITULARptpSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TMODTITULAR_PERSONATMODTITULARPTPSEGUNDOAPELLIDO = "pt_p_SegundoApellido";
    /** <code>personaTMODTITULARptpSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TMODTITULAR_PERSONATMODTITULARPTPSEGUNDOAPELLIDO = "Clas_1431886233600805Ser_44Arg_5_Alias";
    /** <code>personaTMODTITULARptpSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTPSEGUNDOAPELLIDO = "Segundo Apellido";
    /** <code>personaTMODTITULARptpFechaNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TMODTITULAR_PERSONATMODTITULARPTPFECHANACIMIENTO = "pt_p_FechaNacimiento";
    /** <code>personaTMODTITULARptpFechaNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TMODTITULAR_PERSONATMODTITULARPTPFECHANACIMIENTO = "Clas_1431886233600805Ser_44Arg_6_Alias";
    /** <code>personaTMODTITULARptpFechaNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTPFECHANACIMIENTO = "Fecha nacimiento";
    /** <code>personaTMODTITULARptpGenero</code> inbound argument name. */
    public static final String ARG_NAME_TMODTITULAR_PERSONATMODTITULARPTPGENERO = "pt_p_Genero";
    /** <code>personaTMODTITULARptpGenero</code> inbound argument id. */
    public static final String ARG_ID_TMODTITULAR_PERSONATMODTITULARPTPGENERO = "Clas_1431886233600805Ser_44Arg_7_Alias";
    /** <code>personaTMODTITULARptpGenero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTPGENERO = "Género";
    /** <code>personaTMODTITULARptpIndicadorExtranjero</code> inbound argument name. */
    public static final String ARG_NAME_TMODTITULAR_PERSONATMODTITULARPTPINDICADOREXTRANJERO = "pt_p_IndicadorExtranjero";
    /** <code>personaTMODTITULARptpIndicadorExtranjero</code> inbound argument id. */
    public static final String ARG_ID_TMODTITULAR_PERSONATMODTITULARPTPINDICADOREXTRANJERO = "Clas_1431886233600805Ser_44Arg_8_Alias";
    /** <code>personaTMODTITULARptpIndicadorExtranjero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTPINDICADOREXTRANJERO = "Indicador extranjero";
    /** <code>personaTMODTITULARptpTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TMODTITULAR_PERSONATMODTITULARPTPTELEFONOFIJO = "pt_p_TelefonoFijo";
    /** <code>personaTMODTITULARptpTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TMODTITULAR_PERSONATMODTITULARPTPTELEFONOFIJO = "Clas_1431886233600805Ser_44Arg_9_Alias";
    /** <code>personaTMODTITULARptpTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTPTELEFONOFIJO = "Teléfono fijo";
    /** <code>personaTMODTITULARptpTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TMODTITULAR_PERSONATMODTITULARPTPTELEFONOCELULAR = "pt_p_TelefonoCelular";
    /** <code>personaTMODTITULARptpTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TMODTITULAR_PERSONATMODTITULARPTPTELEFONOCELULAR = "Clas_1431886233600805Ser_44Arg_10_Alias";
    /** <code>personaTMODTITULARptpTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTPTELEFONOCELULAR = "Teléfono celular";
    /** <code>personaTMODTITULARptpCorreoElectronico</code> inbound argument name. */
    public static final String ARG_NAME_TMODTITULAR_PERSONATMODTITULARPTPCORREOELECTRONICO = "pt_p_CorreoElectronico";
    /** <code>personaTMODTITULARptpCorreoElectronico</code> inbound argument id. */
    public static final String ARG_ID_TMODTITULAR_PERSONATMODTITULARPTPCORREOELECTRONICO = "Clas_1431886233600805Ser_44Arg_11_Alias";
    /** <code>personaTMODTITULARptpCorreoElectronico</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTPCORREOELECTRONICO = "Correo electrónico";
    /** <code>personaTMODTITULARptpevcDepartamentoNac</code> inbound argument name. */
    public static final String ARG_NAME_TMODTITULAR_PERSONATMODTITULARPTPEVCDEPARTAMENTONAC = "pt_p_evcDepartamentoNac";
    /** <code>personaTMODTITULARptpevcDepartamentoNac</code> inbound argument id. */
    public static final String ARG_ID_TMODTITULAR_PERSONATMODTITULARPTPEVCDEPARTAMENTONAC = "Clas_1431886233600805Ser_44Arg_12_Alias";
    /** <code>personaTMODTITULARptpevcDepartamentoNac</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTPEVCDEPARTAMENTONAC = "Departamento nacimiento";
    /** <code>personaTMODTITULARptpevcMunicipioNac</code> inbound argument name. */
    public static final String ARG_NAME_TMODTITULAR_PERSONATMODTITULARPTPEVCMUNICIPIONAC = "pt_p_evcMunicipioNac";
    /** <code>personaTMODTITULARptpevcMunicipioNac</code> inbound argument id. */
    public static final String ARG_ID_TMODTITULAR_PERSONATMODTITULARPTPEVCMUNICIPIONAC = "Clas_1431886233600805Ser_44Arg_13_Alias";
    /** <code>personaTMODTITULARptpevcMunicipioNac</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTPEVCMUNICIPIONAC = "Municipio nacimiento";
    /** <code>personaTMODTITULARptpevcEstadoCivil</code> inbound argument name. */
    public static final String ARG_NAME_TMODTITULAR_PERSONATMODTITULARPTPEVCESTADOCIVIL = "pt_p_evcEstadoCivil";
    /** <code>personaTMODTITULARptpevcEstadoCivil</code> inbound argument id. */
    public static final String ARG_ID_TMODTITULAR_PERSONATMODTITULARPTPEVCESTADOCIVIL = "Clas_1431886233600805Ser_44Arg_14_Alias";
    /** <code>personaTMODTITULARptpevcEstadoCivil</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTPEVCESTADOCIVIL = "Estado civil";
    /** <code>personaTMODTITULARptpDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TMODTITULAR_PERSONATMODTITULARPTPDIRECCIONCOMPLETA = "pt_p_DireccionCompleta";
    /** <code>personaTMODTITULARptpDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TMODTITULAR_PERSONATMODTITULARPTPDIRECCIONCOMPLETA = "Clas_1431886233600805Ser_44Arg_15_Alias";
    /** <code>personaTMODTITULARptpDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTPDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>personaTMODTITULARptpRural</code> inbound argument name. */
    public static final String ARG_NAME_TMODTITULAR_PERSONATMODTITULARPTPRURAL = "pt_p_Rural";
    /** <code>personaTMODTITULARptpRural</code> inbound argument id. */
    public static final String ARG_ID_TMODTITULAR_PERSONATMODTITULARPTPRURAL = "Clas_1431886233600805Ser_44Arg_16_Alias";
    /** <code>personaTMODTITULARptpRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTPRURAL = "Rural";
    /** <code>personaTMODTITULARptpevcTipoDireccion</code> inbound argument name. */
    public static final String ARG_NAME_TMODTITULAR_PERSONATMODTITULARPTPEVCTIPODIRECCION = "pt_p_evcTipoDireccion";
    /** <code>personaTMODTITULARptpevcTipoDireccion</code> inbound argument id. */
    public static final String ARG_ID_TMODTITULAR_PERSONATMODTITULARPTPEVCTIPODIRECCION = "Clas_1431886233600805Ser_44Arg_17_Alias";
    /** <code>personaTMODTITULARptpevcTipoDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTPEVCTIPODIRECCION = "Tipo dirección";
    /** <code>personaTMODTITULARptpevcDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TMODTITULAR_PERSONATMODTITULARPTPEVCDEPARTAMENTO = "pt_p_evcDepartamento";
    /** <code>personaTMODTITULARptpevcDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TMODTITULAR_PERSONATMODTITULARPTPEVCDEPARTAMENTO = "Clas_1431886233600805Ser_44Arg_18_Alias";
    /** <code>personaTMODTITULARptpevcDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTPEVCDEPARTAMENTO = "Departamento";
    /** <code>personaTMODTITULARptpevcMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TMODTITULAR_PERSONATMODTITULARPTPEVCMUNICIPIO = "pt_p_evcMunicipio";
    /** <code>personaTMODTITULARptpevcMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TMODTITULAR_PERSONATMODTITULARPTPEVCMUNICIPIO = "Clas_1431886233600805Ser_44Arg_19_Alias";
    /** <code>personaTMODTITULARptpevcMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTPEVCMUNICIPIO = "Municipio";
    /** <code>personaTMODTITULARptpNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TMODTITULAR_PERSONATMODTITULARPTPNUMIDENTIFICACION = "pt_p_NumIdentificacion";
    /** <code>personaTMODTITULARptpNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TMODTITULAR_PERSONATMODTITULARPTPNUMIDENTIFICACION = "Clas_1431886233600805Ser_44Arg_20_Alias";
    /** <code>personaTMODTITULARptpNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTPNUMIDENTIFICACION = "Nº Identificación";
    /** <code>personaTMODTITULARptpevcTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TMODTITULAR_PERSONATMODTITULARPTPEVCTIPOIDENTIFICACION = "pt_p_evcTipoIdentificacion";
    /** <code>personaTMODTITULARptpevcTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TMODTITULAR_PERSONATMODTITULARPTPEVCTIPOIDENTIFICACION = "Clas_1431886233600805Ser_44Arg_21_Alias";
    /** <code>personaTMODTITULARptpevcTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTPEVCTIPOIDENTIFICACION = "Tipo identificación";
    /** <code>personaTMODTITULARptTitularRecuperadoIncl</code> inbound argument name. */
    public static final String ARG_NAME_TMODTITULAR_PERSONATMODTITULARPTTITULARRECUPERADOINCL = "ptTitularRecuperadoIncl";
    /** <code>personaTMODTITULARptTitularRecuperadoIncl</code> inbound argument id. */
    public static final String ARG_ID_TMODTITULAR_PERSONATMODTITULARPTTITULARRECUPERADOINCL = "Clas_1431886233600805Ser_44Arg_25_Alias";
    /** <code>personaTMODTITULARptTitularRecuperadoIncl</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTTITULARRECUPERADOINCL = "ptTitularRecuperadoIncl";
    /** <code>personaTMODTITULARptpCodigo</code> inbound argument name. */
    public static final String ARG_NAME_TMODTITULAR_PERSONATMODTITULARPTPCODIGO = "pt_p_Codigo";
    /** <code>personaTMODTITULARptpCodigo</code> inbound argument id. */
    public static final String ARG_ID_TMODTITULAR_PERSONATMODTITULARPTPCODIGO = "Clas_1431886233600805Ser_44Arg_26_Alias";
    /** <code>personaTMODTITULARptpCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTPCODIGO = "Código";
    /** <code>personaTMODTITULARptValidarDatos</code> inbound argument name. */
    public static final String ARG_NAME_TMODTITULAR_PERSONATMODTITULARPTVALIDARDATOS = "ptValidarDatos";
    /** <code>personaTMODTITULARptValidarDatos</code> inbound argument id. */
    public static final String ARG_ID_TMODTITULAR_PERSONATMODTITULARPTVALIDARDATOS = "Clas_1431886233600805Ser_44Arg_27_Alias";
    /** <code>personaTMODTITULARptValidarDatos</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTVALIDARDATOS = "ptValidarDatos";
    /** <code>personaTMODTITULARptRazonSocial</code> inbound argument name. */
    public static final String ARG_NAME_TMODTITULAR_PERSONATMODTITULARPTRAZONSOCIAL = "ptRazonSocial";
    /** <code>personaTMODTITULARptRazonSocial</code> inbound argument id. */
    public static final String ARG_ID_TMODTITULAR_PERSONATMODTITULARPTRAZONSOCIAL = "Clas_1431886233600805Ser_44Arg_28_Alias";
    /** <code>personaTMODTITULARptRazonSocial</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTRAZONSOCIAL = "Razón social";
    /** <code>personaTMODTITULARptEstadoPersona</code> inbound argument name. */
    public static final String ARG_NAME_TMODTITULAR_PERSONATMODTITULARPTESTADOPERSONA = "ptEstadoPersona";
    /** <code>personaTMODTITULARptEstadoPersona</code> inbound argument id. */
    public static final String ARG_ID_TMODTITULAR_PERSONATMODTITULARPTESTADOPERSONA = "Clas_1431886233600805Ser_44Arg_29_Alias";
    /** <code>personaTMODTITULARptEstadoPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTESTADOPERSONA = "Estado Persona";
    /** <code>personaTMODTITULARptpagrPais</code> inbound argument name. */
    public static final String ARG_NAME_TMODTITULAR_PERSONATMODTITULARPTPAGRPAIS = "pt_p_agrPais";
    /** <code>personaTMODTITULARptpagrPais</code> inbound argument id. */
    public static final String ARG_ID_TMODTITULAR_PERSONATMODTITULARPTPAGRPAIS = "Clas_1431886233600805Ser_44Arg_30_Alias";
    /** <code>personaTMODTITULARptpagrPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTPAGRPAIS = "País";
    /** <code>personaTMODTITULARptpTieneEPSSanitas</code> inbound argument name. */
    public static final String ARG_NAME_TMODTITULAR_PERSONATMODTITULARPTPTIENEEPSSANITAS = "pt_p_TieneEPSSanitas";
    /** <code>personaTMODTITULARptpTieneEPSSanitas</code> inbound argument id. */
    public static final String ARG_ID_TMODTITULAR_PERSONATMODTITULARPTPTIENEEPSSANITAS = "Clas_1431886233600805Ser_44Arg_31_Alias";
    /** <code>personaTMODTITULARptpTieneEPSSanitas</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTPTIENEEPSSANITAS = "Tiene EPS Sanitas";
    /** <code>personaTMODTITULARptpRechazadoAfiliacion</code> inbound argument name. */
    public static final String ARG_NAME_TMODTITULAR_PERSONATMODTITULARPTPRECHAZADOAFILIACION = "pt_p_RechazadoAfiliacion";
    /** <code>personaTMODTITULARptpRechazadoAfiliacion</code> inbound argument id. */
    public static final String ARG_ID_TMODTITULAR_PERSONATMODTITULARPTPRECHAZADOAFILIACION = "Clas_1431886233600805Ser_44Arg_32_Alias";
    /** <code>personaTMODTITULARptpRechazadoAfiliacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTPRECHAZADOAFILIACION = "Rechazado Afiliación";
    // Service (TCREARTITULAR)
    /** <code>TCREARTITULAR</code> service id. */
    public static final String SERV_ID_TCREARTITULAR = "Clas_1431886233600805Ser_45_Alias";
    /** <code>TCREARTITULAR</code> service name. */
    public static final String SERV_NAME_TCREARTITULAR = "TCREARTITULAR";
    /** <code>TCREARTITULAR</code> service alias. */
    public static final String SERV_ALIAS_TCREARTITULAR = "Crear titular";
    /** Agents allowed to execute the service TCREARTITULAR **/
    public static final String TCREARTITULAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaTCREARTITULARptpagrTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITULAR_PERSONATCREARTITULARPTPAGRTIPOIDENTIFICACION = "pt_p_agrTipoIdentificacion";
    /** <code>personaTCREARTITULARptpagrTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTPAGRTIPOIDENTIFICACION = "Clas_1431886233600805Ser_45Arg_2_Alias";
    /** <code>personaTCREARTITULARptpagrTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTPAGRTIPOIDENTIFICACION = "Tipo identificación";
    /** <code>personaTCREARTITULARptpagrDepartamentoNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITULAR_PERSONATCREARTITULARPTPAGRDEPARTAMENTONACIMIENTO = "pt_p_agrDepartamentoNacimiento";
    /** <code>personaTCREARTITULARptpagrDepartamentoNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTPAGRDEPARTAMENTONACIMIENTO = "Clas_1431886233600805Ser_45Arg_3_Alias";
    /** <code>personaTCREARTITULARptpagrDepartamentoNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTPAGRDEPARTAMENTONACIMIENTO = "Departamento nacimiento";
    /** <code>personaTCREARTITULARptpagrMunicipioNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITULAR_PERSONATCREARTITULARPTPAGRMUNICIPIONACIMIENTO = "pt_p_agrMunicipioNacimiento";
    /** <code>personaTCREARTITULARptpagrMunicipioNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTPAGRMUNICIPIONACIMIENTO = "Clas_1431886233600805Ser_45Arg_4_Alias";
    /** <code>personaTCREARTITULARptpagrMunicipioNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTPAGRMUNICIPIONACIMIENTO = "Municipio nacimiento";
    /** <code>personaTCREARTITULARptpagrEstadoCivil</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITULAR_PERSONATCREARTITULARPTPAGRESTADOCIVIL = "pt_p_agrEstadoCivil";
    /** <code>personaTCREARTITULARptpagrEstadoCivil</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTPAGRESTADOCIVIL = "Clas_1431886233600805Ser_45Arg_5_Alias";
    /** <code>personaTCREARTITULARptpagrEstadoCivil</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTPAGRESTADOCIVIL = "EstadoCivil";
    /** <code>personaTCREARTITULARptpatrNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITULAR_PERSONATCREARTITULARPTPATRNUMIDENTIFICACION = "pt_p_atrNumIdentificacion";
    /** <code>personaTCREARTITULARptpatrNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTPATRNUMIDENTIFICACION = "Clas_1431886233600805Ser_45Arg_6_Alias";
    /** <code>personaTCREARTITULARptpatrNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTPATRNUMIDENTIFICACION = "Nº Identificación";
    /** <code>personaTCREARTITULARptpatrPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITULAR_PERSONATCREARTITULARPTPATRPRIMERNOMBRE = "pt_p_atrPrimerNombre";
    /** <code>personaTCREARTITULARptpatrPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTPATRPRIMERNOMBRE = "Clas_1431886233600805Ser_45Arg_7_Alias";
    /** <code>personaTCREARTITULARptpatrPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTPATRPRIMERNOMBRE = "Primer nombre";
    /** <code>personaTCREARTITULARptpatrSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITULAR_PERSONATCREARTITULARPTPATRSEGUNDONOMBRE = "pt_p_atrSegundoNombre";
    /** <code>personaTCREARTITULARptpatrSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTPATRSEGUNDONOMBRE = "Clas_1431886233600805Ser_45Arg_8_Alias";
    /** <code>personaTCREARTITULARptpatrSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTPATRSEGUNDONOMBRE = "Segundo nombre";
    /** <code>personaTCREARTITULARptpatrPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITULAR_PERSONATCREARTITULARPTPATRPRIMERAPELLIDO = "pt_p_atrPrimerApellido";
    /** <code>personaTCREARTITULARptpatrPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTPATRPRIMERAPELLIDO = "Clas_1431886233600805Ser_45Arg_9_Alias";
    /** <code>personaTCREARTITULARptpatrPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTPATRPRIMERAPELLIDO = "Primer Apellido";
    /** <code>personaTCREARTITULARptpatrSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITULAR_PERSONATCREARTITULARPTPATRSEGUNDOAPELLIDO = "pt_p_atrSegundoApellido";
    /** <code>personaTCREARTITULARptpatrSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTPATRSEGUNDOAPELLIDO = "Clas_1431886233600805Ser_45Arg_10_Alias";
    /** <code>personaTCREARTITULARptpatrSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTPATRSEGUNDOAPELLIDO = "Segundo Apellido";
    /** <code>personaTCREARTITULARptpatrFechaNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITULAR_PERSONATCREARTITULARPTPATRFECHANACIMIENTO = "pt_p_atrFechaNacimiento";
    /** <code>personaTCREARTITULARptpatrFechaNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTPATRFECHANACIMIENTO = "Clas_1431886233600805Ser_45Arg_11_Alias";
    /** <code>personaTCREARTITULARptpatrFechaNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTPATRFECHANACIMIENTO = "Fecha nacimiento";
    /** <code>personaTCREARTITULARptpatrGenero</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITULAR_PERSONATCREARTITULARPTPATRGENERO = "pt_p_atrGenero";
    /** <code>personaTCREARTITULARptpatrGenero</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTPATRGENERO = "Clas_1431886233600805Ser_45Arg_12_Alias";
    /** <code>personaTCREARTITULARptpatrGenero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTPATRGENERO = "Género";
    /** <code>personaTCREARTITULARptpatrIndicadorExtranjero</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITULAR_PERSONATCREARTITULARPTPATRINDICADOREXTRANJERO = "pt_p_atrIndicadorExtranjero";
    /** <code>personaTCREARTITULARptpatrIndicadorExtranjero</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTPATRINDICADOREXTRANJERO = "Clas_1431886233600805Ser_45Arg_13_Alias";
    /** <code>personaTCREARTITULARptpatrIndicadorExtranjero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTPATRINDICADOREXTRANJERO = "Indicador extranjero";
    /** <code>personaTCREARTITULARptpatrTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITULAR_PERSONATCREARTITULARPTPATRTELEFONOFIJO = "pt_p_atrTelefonoFijo";
    /** <code>personaTCREARTITULARptpatrTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTPATRTELEFONOFIJO = "Clas_1431886233600805Ser_45Arg_14_Alias";
    /** <code>personaTCREARTITULARptpatrTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTPATRTELEFONOFIJO = "Teléfono fijo";
    /** <code>personaTCREARTITULARptpatrTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITULAR_PERSONATCREARTITULARPTPATRTELEFONOCELULAR = "pt_p_atrTelefonoCelular";
    /** <code>personaTCREARTITULARptpatrTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTPATRTELEFONOCELULAR = "Clas_1431886233600805Ser_45Arg_15_Alias";
    /** <code>personaTCREARTITULARptpatrTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTPATRTELEFONOCELULAR = "Teléfono celular";
    /** <code>personaTCREARTITULARptpatrCorreoElectronico</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITULAR_PERSONATCREARTITULARPTPATRCORREOELECTRONICO = "pt_p_atrCorreoElectronico";
    /** <code>personaTCREARTITULARptpatrCorreoElectronico</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTPATRCORREOELECTRONICO = "Clas_1431886233600805Ser_45Arg_16_Alias";
    /** <code>personaTCREARTITULARptpatrCorreoElectronico</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTPATRCORREOELECTRONICO = "Correo electrónico";
    /** <code>personaTCREARTITULARptpagrDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITULAR_PERSONATCREARTITULARPTPAGRDEPARTAMENTO = "pt_p_agrDepartamento";
    /** <code>personaTCREARTITULARptpagrDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTPAGRDEPARTAMENTO = "Clas_1431886233600805Ser_45Arg_17_Alias";
    /** <code>personaTCREARTITULARptpagrDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTPAGRDEPARTAMENTO = "Departamento";
    /** <code>personaTCREARTITULARptpagrMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITULAR_PERSONATCREARTITULARPTPAGRMUNICIPIO = "pt_p_agrMunicipio";
    /** <code>personaTCREARTITULARptpagrMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTPAGRMUNICIPIO = "Clas_1431886233600805Ser_45Arg_18_Alias";
    /** <code>personaTCREARTITULARptpagrMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTPAGRMUNICIPIO = "Municipio";
    /** <code>personaTCREARTITULARptpatrDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITULAR_PERSONATCREARTITULARPTPATRDIRECCIONCOMPLETA = "pt_p_atrDireccionCompleta";
    /** <code>personaTCREARTITULARptpatrDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTPATRDIRECCIONCOMPLETA = "Clas_1431886233600805Ser_45Arg_19_Alias";
    /** <code>personaTCREARTITULARptpatrDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTPATRDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>personaTCREARTITULARptpatrRural</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITULAR_PERSONATCREARTITULARPTPATRRURAL = "pt_p_atrRural";
    /** <code>personaTCREARTITULARptpatrRural</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTPATRRURAL = "Clas_1431886233600805Ser_45Arg_20_Alias";
    /** <code>personaTCREARTITULARptpatrRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTPATRRURAL = "Rural";
    /** <code>personaTCREARTITULARptTipoDireccion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITULAR_PERSONATCREARTITULARPTTIPODIRECCION = "pt_TipoDireccion";
    /** <code>personaTCREARTITULARptTipoDireccion</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTTIPODIRECCION = "Clas_1431886233600805Ser_45Arg_22_Alias";
    /** <code>personaTCREARTITULARptTipoDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTTIPODIRECCION = "Tipo dirección";
    /** <code>personaTCREARTITULARptpagrPais</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITULAR_PERSONATCREARTITULARPTPAGRPAIS = "pt_p_agrPais";
    /** <code>personaTCREARTITULARptpagrPais</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTPAGRPAIS = "Clas_1431886233600805Ser_45Arg_24_Alias";
    /** <code>personaTCREARTITULARptpagrPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTPAGRPAIS = "País";
    /** <code>personaTCREARTITULARptpCodigo</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITULAR_PERSONATCREARTITULARPTPCODIGO = "pt_p_Codigo";
    /** <code>personaTCREARTITULARptpCodigo</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTPCODIGO = "Clas_1431886233600805Ser_45Arg_25_Alias";
    /** <code>personaTCREARTITULARptpCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTPCODIGO = "Código";
    /** <code>personaTCREARTITULARptpTieneEPSSanitas</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITULAR_PERSONATCREARTITULARPTPTIENEEPSSANITAS = "pt_p_TieneEPSSanitas";
    /** <code>personaTCREARTITULARptpTieneEPSSanitas</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTPTIENEEPSSANITAS = "Clas_1431886233600805Ser_45Arg_26_Alias";
    /** <code>personaTCREARTITULARptpTieneEPSSanitas</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTPTIENEEPSSANITAS = "Tiene EPS Sanitas";
    /** <code>personaTCREARTITULARptpRechazadoAfiliacion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITULAR_PERSONATCREARTITULARPTPRECHAZADOAFILIACION = "pt_p_RechazadoAfiliacion";
    /** <code>personaTCREARTITULARptpRechazadoAfiliacion</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTPRECHAZADOAFILIACION = "Clas_1431886233600805Ser_45Arg_27_Alias";
    /** <code>personaTCREARTITULARptpRechazadoAfiliacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTPRECHAZADOAFILIACION = "Rechazado Afiliación";
    /** <code>personaTCREARTITULARptEstadoPersona</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITULAR_PERSONATCREARTITULARPTESTADOPERSONA = "ptEstadoPersona";
    /** <code>personaTCREARTITULARptEstadoPersona</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTESTADOPERSONA = "Clas_1431886233600805Ser_45Arg_2018_Alias";
    /** <code>personaTCREARTITULARptEstadoPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTESTADOPERSONA = "Estado Persona";
    /** <code>personaTCREARTITULARptValidarDatos</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITULAR_PERSONATCREARTITULARPTVALIDARDATOS = "ptValidarDatos";
    /** <code>personaTCREARTITULARptValidarDatos</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTVALIDARDATOS = "Clas_1431886233600805Ser_45Arg_2101_Alias";
    /** <code>personaTCREARTITULARptValidarDatos</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTVALIDARDATOS = "ptValidarDatos";
    /** <code>personaTCREARTITULARptpatrRazonSocial</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITULAR_PERSONATCREARTITULARPTPATRRAZONSOCIAL = "pt_p_atrRazonSocial";
    /** <code>personaTCREARTITULARptpatrRazonSocial</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTPATRRAZONSOCIAL = "Clas_1431886233600805Ser_45Arg_2744_Alias";
    /** <code>personaTCREARTITULARptpatrRazonSocial</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTPATRRAZONSOCIAL = "Razón social";
    /** <code>personaTCREARTITULARptSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREARTITULAR_PERSONATCREARTITULARPTSOLICITUD = "ptSolicitud";
    /** <code>personaTCREARTITULARptSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTSOLICITUD = "Clas_1431886233600805Ser_45Arg_5885_Alias";
    /** <code>personaTCREARTITULARptSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTSOLICITUD = "Solicitud";
    // Outbound arguments
    /** <code>personaTCREARTITULARpsPersona</code> outbound argument name. */
    public static final String ARG_NAME_TCREARTITULAR_PERSONATCREARTITULARPSPERSONA = "personaTCREARTITULARpsPersona";
    /** <code>personaTCREARTITULARpsPersona</code> outbound argument id. */
    public static final String ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPSPERSONA = "Clas_1431886233600805Ser_45Arg_1603_Alias";
    /** <code>personaTCREARTITULARpsPersona</code> outbound argument alias. */
    public static final String ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPSPERSONA = "Persona";
    // Service (TADDUSUARIOASOL)
    /** <code>TADDUSUARIOASOL</code> service id. */
    public static final String SERV_ID_TADDUSUARIOASOL = "Clas_1431886233600805Ser_51_Alias";
    /** <code>TADDUSUARIOASOL</code> service name. */
    public static final String SERV_NAME_TADDUSUARIOASOL = "TADDUSUARIOASOL";
    /** <code>TADDUSUARIOASOL</code> service alias. */
    public static final String SERV_ALIAS_TADDUSUARIOASOL = "Añadir usuario";
    /** Agents allowed to execute the service TADDUSUARIOASOL **/
    public static final String TADDUSUARIOASOL_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Preconditions
    /** <code>TADDUSUARIOASOL</code> precondition 0 id. */
    public static final String PRE_ID_TADDUSUARIOASOL_0 = "Clas_1431886233600805Pre_90_MsgError";
    /** <code>TADDUSUARIOASOL</code> precondition 1 id. */
    public static final String PRE_ID_TADDUSUARIOASOL_1 = "Clas_1431886233600805Pre_82_MsgError";
    /** <code>TADDUSUARIOASOL</code> precondition 2 id. */
    public static final String PRE_ID_TADDUSUARIOASOL_2 = "Clas_1431886233600805Pre_76_MsgError";
    /** <code>TADDUSUARIOASOL</code> precondition 3 id. */
    public static final String PRE_ID_TADDUSUARIOASOL_3 = "Clas_1431886233600805Pre_77_MsgError";
    /** <code>TADDUSUARIOASOL</code> precondition 4 id. */
    public static final String PRE_ID_TADDUSUARIOASOL_4 = "Clas_1431886233600805Pre_78_MsgError";
    /** <code>TADDUSUARIOASOL</code> precondition 5 id. */
    public static final String PRE_ID_TADDUSUARIOASOL_5 = "Clas_1431886233600805Pre_85_MsgError";
    /** <code>TADDUSUARIOASOL</code> precondition 6 id. */
    public static final String PRE_ID_TADDUSUARIOASOL_6 = "Clas_1431886233600805Pre_92_MsgError";
    /** <code>TADDUSUARIOASOL</code> precondition 7 id. */
    public static final String PRE_ID_TADDUSUARIOASOL_7 = "Clas_1431886233600805Pre_95_MsgError";
    // Inbound arguments
    /** <code>personaTADDUSUARIOASOLptpagrTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRTIPOIDENTIFICACION = "pt_p_agrTipoIdentificacion";
    /** <code>personaTADDUSUARIOASOLptpagrTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRTIPOIDENTIFICACION = "Clas_1431886233600805Ser_51Arg_2_Alias";
    /** <code>personaTADDUSUARIOASOLptpagrTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRTIPOIDENTIFICACION = "Tipo identificación";
    /** <code>personaTADDUSUARIOASOLptpagrDepartamentoNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRDEPARTAMENTONACIMIENTO = "pt_p_agrDepartamentoNacimiento";
    /** <code>personaTADDUSUARIOASOLptpagrDepartamentoNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRDEPARTAMENTONACIMIENTO = "Clas_1431886233600805Ser_51Arg_3_Alias";
    /** <code>personaTADDUSUARIOASOLptpagrDepartamentoNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRDEPARTAMENTONACIMIENTO = "Departamento nacimiento";
    /** <code>personaTADDUSUARIOASOLptpagrMunicipioNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRMUNICIPIONACIMIENTO = "pt_p_agrMunicipioNacimiento";
    /** <code>personaTADDUSUARIOASOLptpagrMunicipioNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRMUNICIPIONACIMIENTO = "Clas_1431886233600805Ser_51Arg_4_Alias";
    /** <code>personaTADDUSUARIOASOLptpagrMunicipioNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRMUNICIPIONACIMIENTO = "Municipio nacimiento";
    /** <code>personaTADDUSUARIOASOLptpagrEstadoCivil</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRESTADOCIVIL = "pt_p_agrEstadoCivil";
    /** <code>personaTADDUSUARIOASOLptpagrEstadoCivil</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRESTADOCIVIL = "Clas_1431886233600805Ser_51Arg_5_Alias";
    /** <code>personaTADDUSUARIOASOLptpagrEstadoCivil</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRESTADOCIVIL = "EstadoCivil";
    /** <code>personaTADDUSUARIOASOLptpatrNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRNUMIDENTIFICACION = "pt_p_atrNumIdentificacion";
    /** <code>personaTADDUSUARIOASOLptpatrNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRNUMIDENTIFICACION = "Clas_1431886233600805Ser_51Arg_6_Alias";
    /** <code>personaTADDUSUARIOASOLptpatrNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRNUMIDENTIFICACION = "Nº Identificación";
    /** <code>personaTADDUSUARIOASOLptpatrPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRPRIMERNOMBRE = "pt_p_atrPrimerNombre";
    /** <code>personaTADDUSUARIOASOLptpatrPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRPRIMERNOMBRE = "Clas_1431886233600805Ser_51Arg_7_Alias";
    /** <code>personaTADDUSUARIOASOLptpatrPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRPRIMERNOMBRE = "Primer nombre";
    /** <code>personaTADDUSUARIOASOLptpatrSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRSEGUNDONOMBRE = "pt_p_atrSegundoNombre";
    /** <code>personaTADDUSUARIOASOLptpatrSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRSEGUNDONOMBRE = "Clas_1431886233600805Ser_51Arg_8_Alias";
    /** <code>personaTADDUSUARIOASOLptpatrSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRSEGUNDONOMBRE = "Segundo nombre";
    /** <code>personaTADDUSUARIOASOLptpatrPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRPRIMERAPELLIDO = "pt_p_atrPrimerApellido";
    /** <code>personaTADDUSUARIOASOLptpatrPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRPRIMERAPELLIDO = "Clas_1431886233600805Ser_51Arg_9_Alias";
    /** <code>personaTADDUSUARIOASOLptpatrPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRPRIMERAPELLIDO = "Primer Apellido";
    /** <code>personaTADDUSUARIOASOLptpatrSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRSEGUNDOAPELLIDO = "pt_p_atrSegundoApellido";
    /** <code>personaTADDUSUARIOASOLptpatrSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRSEGUNDOAPELLIDO = "Clas_1431886233600805Ser_51Arg_10_Alias";
    /** <code>personaTADDUSUARIOASOLptpatrSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRSEGUNDOAPELLIDO = "Segundo Apellido";
    /** <code>personaTADDUSUARIOASOLptpatrFechaNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRFECHANACIMIENTO = "pt_p_atrFechaNacimiento";
    /** <code>personaTADDUSUARIOASOLptpatrFechaNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRFECHANACIMIENTO = "Clas_1431886233600805Ser_51Arg_11_Alias";
    /** <code>personaTADDUSUARIOASOLptpatrFechaNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRFECHANACIMIENTO = "Fecha nacimiento";
    /** <code>personaTADDUSUARIOASOLptpatrGenero</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRGENERO = "pt_p_atrGenero";
    /** <code>personaTADDUSUARIOASOLptpatrGenero</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRGENERO = "Clas_1431886233600805Ser_51Arg_12_Alias";
    /** <code>personaTADDUSUARIOASOLptpatrGenero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRGENERO = "Género";
    /** <code>personaTADDUSUARIOASOLptpatrIndicadorExtranjero</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRINDICADOREXTRANJERO = "pt_p_atrIndicadorExtranjero";
    /** <code>personaTADDUSUARIOASOLptpatrIndicadorExtranjero</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRINDICADOREXTRANJERO = "Clas_1431886233600805Ser_51Arg_13_Alias";
    /** <code>personaTADDUSUARIOASOLptpatrIndicadorExtranjero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRINDICADOREXTRANJERO = "Indicador extranjero";
    /** <code>personaTADDUSUARIOASOLptpatrTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRTELEFONOFIJO = "pt_p_atrTelefonoFijo";
    /** <code>personaTADDUSUARIOASOLptpatrTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRTELEFONOFIJO = "Clas_1431886233600805Ser_51Arg_14_Alias";
    /** <code>personaTADDUSUARIOASOLptpatrTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRTELEFONOFIJO = "Teléfono fijo";
    /** <code>personaTADDUSUARIOASOLptpatrTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRTELEFONOCELULAR = "pt_p_atrTelefonoCelular";
    /** <code>personaTADDUSUARIOASOLptpatrTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRTELEFONOCELULAR = "Clas_1431886233600805Ser_51Arg_15_Alias";
    /** <code>personaTADDUSUARIOASOLptpatrTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRTELEFONOCELULAR = "Teléfono celular";
    /** <code>personaTADDUSUARIOASOLptpatrCorreoElectronico</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRCORREOELECTRONICO = "pt_p_atrCorreoElectronico";
    /** <code>personaTADDUSUARIOASOLptpatrCorreoElectronico</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRCORREOELECTRONICO = "Clas_1431886233600805Ser_51Arg_16_Alias";
    /** <code>personaTADDUSUARIOASOLptpatrCorreoElectronico</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRCORREOELECTRONICO = "Correo electrónico";
    /** <code>personaTADDUSUARIOASOLptpagrDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRDEPARTAMENTO = "pt_p_agrDepartamento";
    /** <code>personaTADDUSUARIOASOLptpagrDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRDEPARTAMENTO = "Clas_1431886233600805Ser_51Arg_17_Alias";
    /** <code>personaTADDUSUARIOASOLptpagrDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRDEPARTAMENTO = "Departamento";
    /** <code>personaTADDUSUARIOASOLptpagrMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRMUNICIPIO = "pt_p_agrMunicipio";
    /** <code>personaTADDUSUARIOASOLptpagrMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRMUNICIPIO = "Clas_1431886233600805Ser_51Arg_18_Alias";
    /** <code>personaTADDUSUARIOASOLptpagrMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRMUNICIPIO = "Municipio";
    /** <code>personaTADDUSUARIOASOLptpatrDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRDIRECCIONCOMPLETA = "pt_p_atrDireccionCompleta";
    /** <code>personaTADDUSUARIOASOLptpatrDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRDIRECCIONCOMPLETA = "Clas_1431886233600805Ser_51Arg_19_Alias";
    /** <code>personaTADDUSUARIOASOLptpatrDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>personaTADDUSUARIOASOLptpatrRural</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRRURAL = "pt_p_atrRural";
    /** <code>personaTADDUSUARIOASOLptpatrRural</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRRURAL = "Clas_1431886233600805Ser_51Arg_20_Alias";
    /** <code>personaTADDUSUARIOASOLptpatrRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRRURAL = "Rural";
    /** <code>personaTADDUSUARIOASOLptpCodigo</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPCODIGO = "pt_p_Codigo";
    /** <code>personaTADDUSUARIOASOLptpCodigo</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPCODIGO = "Clas_1431886233600805Ser_51Arg_22_Alias";
    /** <code>personaTADDUSUARIOASOLptpCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPCODIGO = "Código";
    /** <code>personaTADDUSUARIOASOLptpTieneEPSSanitas</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPTIENEEPSSANITAS = "pt_p_TieneEPSSanitas";
    /** <code>personaTADDUSUARIOASOLptpTieneEPSSanitas</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPTIENEEPSSANITAS = "Clas_1431886233600805Ser_51Arg_23_Alias";
    /** <code>personaTADDUSUARIOASOLptpTieneEPSSanitas</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPTIENEEPSSANITAS = "Tiene EPS Sanitas";
    /** <code>personaTADDUSUARIOASOLptpRechazadoAfiliacion</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPRECHAZADOAFILIACION = "pt_p_RechazadoAfiliacion";
    /** <code>personaTADDUSUARIOASOLptpRechazadoAfiliacion</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPRECHAZADOAFILIACION = "Clas_1431886233600805Ser_51Arg_24_Alias";
    /** <code>personaTADDUSUARIOASOLptpRechazadoAfiliacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPRECHAZADOAFILIACION = "Rechazado Afiliación";
    /** <code>personaTADDUSUARIOASOLptpagrPais</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRPAIS = "pt_p_agrPais";
    /** <code>personaTADDUSUARIOASOLptpagrPais</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRPAIS = "Clas_1431886233600805Ser_51Arg_25_Alias";
    /** <code>personaTADDUSUARIOASOLptpagrPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRPAIS = "País";
    /** <code>personaTADDUSUARIOASOLptSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTSOLICITUD = "ptSolicitud";
    /** <code>personaTADDUSUARIOASOLptSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTSOLICITUD = "Clas_1431886233600805Ser_51Arg_26_Alias";
    /** <code>personaTADDUSUARIOASOLptSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTSOLICITUD = "Solicitud";
    /** <code>personaTADDUSUARIOASOLptDireccionesTitular</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTDIRECCIONESTITULAR = "ptDireccionesTitular";
    /** <code>personaTADDUSUARIOASOLptDireccionesTitular</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTDIRECCIONESTITULAR = "Clas_1431886233600805Ser_51Arg_30_Alias";
    /** <code>personaTADDUSUARIOASOLptDireccionesTitular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTDIRECCIONESTITULAR = "Direcciones titular";
    /** <code>personaTADDUSUARIOASOLptReplicarDireccion</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTREPLICARDIRECCION = "ptReplicarDireccion";
    /** <code>personaTADDUSUARIOASOLptReplicarDireccion</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTREPLICARDIRECCION = "Clas_1431886233600805Ser_51Arg_32_Alias";
    /** <code>personaTADDUSUARIOASOLptReplicarDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTREPLICARDIRECCION = "Replicar dirección";
    /** <code>personaTADDUSUARIOASOLptDireccionesXClass</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTDIRECCIONESXCLASS = "ptDireccionesXClass";
    /** <code>personaTADDUSUARIOASOLptDireccionesXClass</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTDIRECCIONESXCLASS = "Clas_1431886233600805Ser_51Arg_35_Alias";
    /** <code>personaTADDUSUARIOASOLptDireccionesXClass</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTDIRECCIONESXCLASS = "Direcciones";
    /** <code>personaTADDUSUARIOASOLptEstadoPersona</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTESTADOPERSONA = "ptEstadoPersona";
    /** <code>personaTADDUSUARIOASOLptEstadoPersona</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTESTADOPERSONA = "Clas_1431886233600805Ser_51Arg_413_Alias";
    /** <code>personaTADDUSUARIOASOLptEstadoPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTESTADOPERSONA = "Estado Persona";
    // Service (TADDUSUARIODECONTASOC)
    /** <code>TADDUSUARIODECONTASOC</code> service id. */
    public static final String SERV_ID_TADDUSUARIODECONTASOC = "Clas_1431886233600805Ser_52_Alias";
    /** <code>TADDUSUARIODECONTASOC</code> service name. */
    public static final String SERV_NAME_TADDUSUARIODECONTASOC = "TADDUSUARIODECONTASOC";
    /** <code>TADDUSUARIODECONTASOC</code> service alias. */
    public static final String SERV_ALIAS_TADDUSUARIODECONTASOC = "TADDUSUARIODECONTASOC";
    /** Agents allowed to execute the service TADDUSUARIODECONTASOC **/
    public static final String TADDUSUARIODECONTASOC_SRVAGENTS = "";
    // Preconditions
    /** <code>TADDUSUARIODECONTASOC</code> precondition 0 id. */
    public static final String PRE_ID_TADDUSUARIODECONTASOC_0 = "Clas_1431886233600805Pre_79_MsgError";
    /** <code>TADDUSUARIODECONTASOC</code> precondition 1 id. */
    public static final String PRE_ID_TADDUSUARIODECONTASOC_1 = "Clas_1431886233600805Pre_80_MsgError";
    // Inbound arguments
    /** <code>personaTADDUSUARIODECONTASOCptpagrTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRTIPOIDENTIFICACION = "pt_p_agrTipoIdentificacion";
    /** <code>personaTADDUSUARIODECONTASOCptpagrTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRTIPOIDENTIFICACION = "Clas_1431886233600805Ser_52Arg_3_Alias";
    /** <code>personaTADDUSUARIODECONTASOCptpagrTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRTIPOIDENTIFICACION = "Tipo identificación";
    /** <code>personaTADDUSUARIODECONTASOCptpagrDepartamentoNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRDEPARTAMENTONACIMIENTO = "pt_p_agrDepartamentoNacimiento";
    /** <code>personaTADDUSUARIODECONTASOCptpagrDepartamentoNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRDEPARTAMENTONACIMIENTO = "Clas_1431886233600805Ser_52Arg_4_Alias";
    /** <code>personaTADDUSUARIODECONTASOCptpagrDepartamentoNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRDEPARTAMENTONACIMIENTO = "Departamento nacimiento";
    /** <code>personaTADDUSUARIODECONTASOCptpagrMunicipioNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRMUNICIPIONACIMIENTO = "pt_p_agrMunicipioNacimiento";
    /** <code>personaTADDUSUARIODECONTASOCptpagrMunicipioNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRMUNICIPIONACIMIENTO = "Clas_1431886233600805Ser_52Arg_5_Alias";
    /** <code>personaTADDUSUARIODECONTASOCptpagrMunicipioNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRMUNICIPIONACIMIENTO = "Municipio nacimiento";
    /** <code>personaTADDUSUARIODECONTASOCptpagrEstadoCivil</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRESTADOCIVIL = "pt_p_agrEstadoCivil";
    /** <code>personaTADDUSUARIODECONTASOCptpagrEstadoCivil</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRESTADOCIVIL = "Clas_1431886233600805Ser_52Arg_6_Alias";
    /** <code>personaTADDUSUARIODECONTASOCptpagrEstadoCivil</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRESTADOCIVIL = "EstadoCivil";
    /** <code>personaTADDUSUARIODECONTASOCptpatrNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRNUMIDENTIFICACION = "pt_p_atrNumIdentificacion";
    /** <code>personaTADDUSUARIODECONTASOCptpatrNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRNUMIDENTIFICACION = "Clas_1431886233600805Ser_52Arg_7_Alias";
    /** <code>personaTADDUSUARIODECONTASOCptpatrNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRNUMIDENTIFICACION = "Nº Identificación";
    /** <code>personaTADDUSUARIODECONTASOCptpatrPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRPRIMERNOMBRE = "pt_p_atrPrimerNombre";
    /** <code>personaTADDUSUARIODECONTASOCptpatrPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRPRIMERNOMBRE = "Clas_1431886233600805Ser_52Arg_8_Alias";
    /** <code>personaTADDUSUARIODECONTASOCptpatrPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRPRIMERNOMBRE = "Primer nombre";
    /** <code>personaTADDUSUARIODECONTASOCptpatrSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRSEGUNDONOMBRE = "pt_p_atrSegundoNombre";
    /** <code>personaTADDUSUARIODECONTASOCptpatrSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRSEGUNDONOMBRE = "Clas_1431886233600805Ser_52Arg_9_Alias";
    /** <code>personaTADDUSUARIODECONTASOCptpatrSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRSEGUNDONOMBRE = "Segundo nombre";
    /** <code>personaTADDUSUARIODECONTASOCptpatrPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRPRIMERAPELLIDO = "pt_p_atrPrimerApellido";
    /** <code>personaTADDUSUARIODECONTASOCptpatrPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRPRIMERAPELLIDO = "Clas_1431886233600805Ser_52Arg_10_Alias";
    /** <code>personaTADDUSUARIODECONTASOCptpatrPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRPRIMERAPELLIDO = "Primer Apellido";
    /** <code>personaTADDUSUARIODECONTASOCptpatrSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRSEGUNDOAPELLIDO = "pt_p_atrSegundoApellido";
    /** <code>personaTADDUSUARIODECONTASOCptpatrSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRSEGUNDOAPELLIDO = "Clas_1431886233600805Ser_52Arg_11_Alias";
    /** <code>personaTADDUSUARIODECONTASOCptpatrSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRSEGUNDOAPELLIDO = "Segundo Apellido";
    /** <code>personaTADDUSUARIODECONTASOCptpatrFechaNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRFECHANACIMIENTO = "pt_p_atrFechaNacimiento";
    /** <code>personaTADDUSUARIODECONTASOCptpatrFechaNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRFECHANACIMIENTO = "Clas_1431886233600805Ser_52Arg_12_Alias";
    /** <code>personaTADDUSUARIODECONTASOCptpatrFechaNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRFECHANACIMIENTO = "Fecha nacimiento";
    /** <code>personaTADDUSUARIODECONTASOCptpatrGenero</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRGENERO = "pt_p_atrGenero";
    /** <code>personaTADDUSUARIODECONTASOCptpatrGenero</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRGENERO = "Clas_1431886233600805Ser_52Arg_13_Alias";
    /** <code>personaTADDUSUARIODECONTASOCptpatrGenero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRGENERO = "Género";
    /** <code>personaTADDUSUARIODECONTASOCptpatrIndicadorExtranjero</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRINDICADOREXTRANJERO = "pt_p_atrIndicadorExtranjero";
    /** <code>personaTADDUSUARIODECONTASOCptpatrIndicadorExtranjero</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRINDICADOREXTRANJERO = "Clas_1431886233600805Ser_52Arg_14_Alias";
    /** <code>personaTADDUSUARIODECONTASOCptpatrIndicadorExtranjero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRINDICADOREXTRANJERO = "Indicador extranjero";
    /** <code>personaTADDUSUARIODECONTASOCptpatrTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRTELEFONOFIJO = "pt_p_atrTelefonoFijo";
    /** <code>personaTADDUSUARIODECONTASOCptpatrTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRTELEFONOFIJO = "Clas_1431886233600805Ser_52Arg_15_Alias";
    /** <code>personaTADDUSUARIODECONTASOCptpatrTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRTELEFONOFIJO = "Teléfono fijo";
    /** <code>personaTADDUSUARIODECONTASOCptpatrTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRTELEFONOCELULAR = "pt_p_atrTelefonoCelular";
    /** <code>personaTADDUSUARIODECONTASOCptpatrTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRTELEFONOCELULAR = "Clas_1431886233600805Ser_52Arg_16_Alias";
    /** <code>personaTADDUSUARIODECONTASOCptpatrTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRTELEFONOCELULAR = "Teléfono celular";
    /** <code>personaTADDUSUARIODECONTASOCptpatrCorreoElectronico</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRCORREOELECTRONICO = "pt_p_atrCorreoElectronico";
    /** <code>personaTADDUSUARIODECONTASOCptpatrCorreoElectronico</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRCORREOELECTRONICO = "Clas_1431886233600805Ser_52Arg_17_Alias";
    /** <code>personaTADDUSUARIODECONTASOCptpatrCorreoElectronico</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRCORREOELECTRONICO = "Correo electrónico";
    /** <code>personaTADDUSUARIODECONTASOCptpagrDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRDEPARTAMENTO = "pt_p_agrDepartamento";
    /** <code>personaTADDUSUARIODECONTASOCptpagrDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRDEPARTAMENTO = "Clas_1431886233600805Ser_52Arg_18_Alias";
    /** <code>personaTADDUSUARIODECONTASOCptpagrDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRDEPARTAMENTO = "Departamento";
    /** <code>personaTADDUSUARIODECONTASOCptpagrMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRMUNICIPIO = "pt_p_agrMunicipio";
    /** <code>personaTADDUSUARIODECONTASOCptpagrMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRMUNICIPIO = "Clas_1431886233600805Ser_52Arg_19_Alias";
    /** <code>personaTADDUSUARIODECONTASOCptpagrMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRMUNICIPIO = "Municipio";
    /** <code>personaTADDUSUARIODECONTASOCptpatrDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRDIRECCIONCOMPLETA = "pt_p_atrDireccionCompleta";
    /** <code>personaTADDUSUARIODECONTASOCptpatrDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRDIRECCIONCOMPLETA = "Clas_1431886233600805Ser_52Arg_20_Alias";
    /** <code>personaTADDUSUARIODECONTASOCptpatrDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>personaTADDUSUARIODECONTASOCptpatrRural</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRRURAL = "pt_p_atrRural";
    /** <code>personaTADDUSUARIODECONTASOCptpatrRural</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRRURAL = "Clas_1431886233600805Ser_52Arg_21_Alias";
    /** <code>personaTADDUSUARIODECONTASOCptpatrRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRRURAL = "Rural";
    /** <code>personaTADDUSUARIODECONTASOCptpCodigo</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPCODIGO = "pt_p_Codigo";
    /** <code>personaTADDUSUARIODECONTASOCptpCodigo</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPCODIGO = "Clas_1431886233600805Ser_52Arg_23_Alias";
    /** <code>personaTADDUSUARIODECONTASOCptpCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPCODIGO = "Código";
    /** <code>personaTADDUSUARIODECONTASOCptpTieneEPSSanitas</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPTIENEEPSSANITAS = "pt_p_TieneEPSSanitas";
    /** <code>personaTADDUSUARIODECONTASOCptpTieneEPSSanitas</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPTIENEEPSSANITAS = "Clas_1431886233600805Ser_52Arg_24_Alias";
    /** <code>personaTADDUSUARIODECONTASOCptpTieneEPSSanitas</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPTIENEEPSSANITAS = "Tiene EPS Sanitas";
    /** <code>personaTADDUSUARIODECONTASOCptpRechazadoAfiliacion</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPRECHAZADOAFILIACION = "pt_p_RechazadoAfiliacion";
    /** <code>personaTADDUSUARIODECONTASOCptpRechazadoAfiliacion</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPRECHAZADOAFILIACION = "Clas_1431886233600805Ser_52Arg_25_Alias";
    /** <code>personaTADDUSUARIODECONTASOCptpRechazadoAfiliacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPRECHAZADOAFILIACION = "Rechazado Afiliación";
    /** <code>personaTADDUSUARIODECONTASOCptpagrPais</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRPAIS = "pt_p_agrPais";
    /** <code>personaTADDUSUARIODECONTASOCptpagrPais</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRPAIS = "Clas_1431886233600805Ser_52Arg_26_Alias";
    /** <code>personaTADDUSUARIODECONTASOCptpagrPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRPAIS = "País";
    /** <code>personaTADDUSUARIODECONTASOCptpagrSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRSOLICITUD = "pt_p_agrSolicitud";
    /** <code>personaTADDUSUARIODECONTASOCptpagrSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRSOLICITUD = "Clas_1431886233600805Ser_52Arg_28_Alias";
    /** <code>personaTADDUSUARIODECONTASOCptpagrSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRSOLICITUD = "Solicitud";
    /** <code>personaTADDUSUARIODECONTASOCptpagrParentesco</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRPARENTESCO = "pt_p_agrParentesco";
    /** <code>personaTADDUSUARIODECONTASOCptpagrParentesco</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRPARENTESCO = "Clas_1431886233600805Ser_52Arg_30_Alias";
    /** <code>personaTADDUSUARIODECONTASOCptpagrParentesco</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRPARENTESCO = "Parentesco";
    /** <code>personaTADDUSUARIODECONTASOCptpatrBebeGestante</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRBEBEGESTANTE = "pt_p_atrBebeGestante";
    /** <code>personaTADDUSUARIODECONTASOCptpatrBebeGestante</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRBEBEGESTANTE = "Clas_1431886233600805Ser_52Arg_32_Alias";
    /** <code>personaTADDUSUARIODECONTASOCptpatrBebeGestante</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRBEBEGESTANTE = "Bebé gestante";
    /** <code>personaTADDUSUARIODECONTASOCptpatrcodigoBancoRep</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRCODIGOBANCOREP = "pt_p_atrcodigoBancoRep";
    /** <code>personaTADDUSUARIODECONTASOCptpatrcodigoBancoRep</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRCODIGOBANCOREP = "Clas_1431886233600805Ser_52Arg_33_Alias";
    /** <code>personaTADDUSUARIODECONTASOCptpatrcodigoBancoRep</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRCODIGOBANCOREP = "Cod. Banco República";
    /** <code>personaTADDUSUARIODECONTASOCptParaContratante</code> inbound argument name. */
    public static final String ARG_NAME_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPARACONTRATANTE = "ptParaContratante";
    /** <code>personaTADDUSUARIODECONTASOCptParaContratante</code> inbound argument id. */
    public static final String ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPARACONTRATANTE = "Clas_1431886233600805Ser_52Arg_37_Alias";
    /** <code>personaTADDUSUARIODECONTASOCptParaContratante</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPARACONTRATANTE = "ptParaContratante";
    // Service (TELIMINAR)
    /** <code>TELIMINAR</code> service id. */
    public static final String SERV_ID_TELIMINAR = "Clas_1431886233600805Ser_53_Alias";
    /** <code>TELIMINAR</code> service name. */
    public static final String SERV_NAME_TELIMINAR = "TELIMINAR";
    /** <code>TELIMINAR</code> service alias. */
    public static final String SERV_ALIAS_TELIMINAR = "¿Está seguro de que desea eliminar al usuario?";
    /** Agents allowed to execute the service TELIMINAR **/
    public static final String TELIMINAR_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Preconditions
    /** <code>TELIMINAR</code> precondition 0 id. */
    public static final String PRE_ID_TELIMINAR_0 = "Clas_1431886233600805Pre_96_MsgError";
    // Inbound arguments
    /** <code>personaTELIMINARpthisPersona</code> inbound argument name. */
    public static final String ARG_NAME_TELIMINAR_PERSONATELIMINARPTHISPERSONA = "p_thisPersona";
    /** <code>personaTELIMINARpthisPersona</code> inbound argument id. */
    public static final String ARG_ID_TELIMINAR_PERSONATELIMINARPTHISPERSONA = "Clas_1431886233600805Ser_53Arg_1_Alias";
    /** <code>personaTELIMINARpthisPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TELIMINAR_PERSONATELIMINARPTHISPERSONA = "Persona";
    /** <code>personaTELIMINARptUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TELIMINAR_PERSONATELIMINARPTUSUARIO = "ptUsuario";
    /** <code>personaTELIMINARptUsuario</code> inbound argument id. */
    public static final String ARG_ID_TELIMINAR_PERSONATELIMINARPTUSUARIO = "Clas_1431886233600805Ser_53Arg_2_Alias";
    /** <code>personaTELIMINARptUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TELIMINAR_PERSONATELIMINARPTUSUARIO = "Usuario";
    // Service (TACTCODIGO)
    /** <code>TACTCODIGO</code> service id. */
    public static final String SERV_ID_TACTCODIGO = "Clas_1431886233600805Ser_54_Alias";
    /** <code>TACTCODIGO</code> service name. */
    public static final String SERV_NAME_TACTCODIGO = "TACTCODIGO";
    /** <code>TACTCODIGO</code> service alias. */
    public static final String SERV_ALIAS_TACTCODIGO = "TACTCODIGO";
    /** Agents allowed to execute the service TACTCODIGO **/
    public static final String TACTCODIGO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaTACTCODIGOpthisPersona</code> inbound argument name. */
    public static final String ARG_NAME_TACTCODIGO_PERSONATACTCODIGOPTHISPERSONA = "p_thisPersona";
    /** <code>personaTACTCODIGOpthisPersona</code> inbound argument id. */
    public static final String ARG_ID_TACTCODIGO_PERSONATACTCODIGOPTHISPERSONA = "Clas_1431886233600805Ser_54Arg_1_Alias";
    /** <code>personaTACTCODIGOpthisPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TACTCODIGO_PERSONATACTCODIGOPTHISPERSONA = "Persona";
    /** <code>personaTACTCODIGOptpCodigo</code> inbound argument name. */
    public static final String ARG_NAME_TACTCODIGO_PERSONATACTCODIGOPTPCODIGO = "pt_p_Codigo";
    /** <code>personaTACTCODIGOptpCodigo</code> inbound argument id. */
    public static final String ARG_ID_TACTCODIGO_PERSONATACTCODIGOPTPCODIGO = "Clas_1431886233600805Ser_54Arg_2_Alias";
    /** <code>personaTACTCODIGOptpCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TACTCODIGO_PERSONATACTCODIGOPTPCODIGO = "Código";
    // Service (TMODDIRECCIONES)
    /** <code>TMODDIRECCIONES</code> service id. */
    public static final String SERV_ID_TMODDIRECCIONES = "Clas_1431886233600805Ser_56_Alias";
    /** <code>TMODDIRECCIONES</code> service name. */
    public static final String SERV_NAME_TMODDIRECCIONES = "TMODDIRECCIONES";
    /** <code>TMODDIRECCIONES</code> service alias. */
    public static final String SERV_ALIAS_TMODDIRECCIONES = "Modificar direcciones";
    /** Agents allowed to execute the service TMODDIRECCIONES **/
    public static final String TMODDIRECCIONES_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaTMODDIRECCIONESpthisPersona</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRECCIONES_PERSONATMODDIRECCIONESPTHISPERSONA = "p_thisPersona";
    /** <code>personaTMODDIRECCIONESpthisPersona</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRECCIONES_PERSONATMODDIRECCIONESPTHISPERSONA = "Clas_1431886233600805Ser_56Arg_1_Alias";
    /** <code>personaTMODDIRECCIONESpthisPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRECCIONES_PERSONATMODDIRECCIONESPTHISPERSONA = "Persona";
    /** <code>personaTMODDIRECCIONESptpDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRECCIONES_PERSONATMODDIRECCIONESPTPDIRECCIONCOMPLETA = "pt_p_DireccionCompleta";
    /** <code>personaTMODDIRECCIONESptpDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRECCIONES_PERSONATMODDIRECCIONESPTPDIRECCIONCOMPLETA = "Clas_1431886233600805Ser_56Arg_15_Alias";
    /** <code>personaTMODDIRECCIONESptpDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRECCIONES_PERSONATMODDIRECCIONESPTPDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>personaTMODDIRECCIONESptpRural</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRECCIONES_PERSONATMODDIRECCIONESPTPRURAL = "pt_p_Rural";
    /** <code>personaTMODDIRECCIONESptpRural</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRECCIONES_PERSONATMODDIRECCIONESPTPRURAL = "Clas_1431886233600805Ser_56Arg_16_Alias";
    /** <code>personaTMODDIRECCIONESptpRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRECCIONES_PERSONATMODDIRECCIONESPTPRURAL = "Rural";
    /** <code>personaTMODDIRECCIONESptpevcDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRECCIONES_PERSONATMODDIRECCIONESPTPEVCDEPARTAMENTO = "pt_p_evcDepartamento";
    /** <code>personaTMODDIRECCIONESptpevcDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRECCIONES_PERSONATMODDIRECCIONESPTPEVCDEPARTAMENTO = "Clas_1431886233600805Ser_56Arg_18_Alias";
    /** <code>personaTMODDIRECCIONESptpevcDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRECCIONES_PERSONATMODDIRECCIONESPTPEVCDEPARTAMENTO = "Departamento";
    /** <code>personaTMODDIRECCIONESptpevcMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRECCIONES_PERSONATMODDIRECCIONESPTPEVCMUNICIPIO = "pt_p_evcMunicipio";
    /** <code>personaTMODDIRECCIONESptpevcMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRECCIONES_PERSONATMODDIRECCIONESPTPEVCMUNICIPIO = "Clas_1431886233600805Ser_56Arg_19_Alias";
    /** <code>personaTMODDIRECCIONESptpevcMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRECCIONES_PERSONATMODDIRECCIONESPTPEVCMUNICIPIO = "Municipio";
    /** <code>personaTMODDIRECCIONESpDCDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRECCIONES_PERSONATMODDIRECCIONESPDCDIRECCIONCOMPLETA = "pDCDireccionCompleta";
    /** <code>personaTMODDIRECCIONESpDCDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRECCIONES_PERSONATMODDIRECCIONESPDCDIRECCIONCOMPLETA = "Clas_1431886233600805Ser_56Arg_23_Alias";
    /** <code>personaTMODDIRECCIONESpDCDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRECCIONES_PERSONATMODDIRECCIONESPDCDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>personaTMODDIRECCIONESpDCDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRECCIONES_PERSONATMODDIRECCIONESPDCDEPARTAMENTO = "pDCDepartamento";
    /** <code>personaTMODDIRECCIONESpDCDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRECCIONES_PERSONATMODDIRECCIONESPDCDEPARTAMENTO = "Clas_1431886233600805Ser_56Arg_24_Alias";
    /** <code>personaTMODDIRECCIONESpDCDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRECCIONES_PERSONATMODDIRECCIONESPDCDEPARTAMENTO = "Departamento";
    /** <code>personaTMODDIRECCIONESpDCMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRECCIONES_PERSONATMODDIRECCIONESPDCMUNICIPIO = "pDCMunicipio";
    /** <code>personaTMODDIRECCIONESpDCMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRECCIONES_PERSONATMODDIRECCIONESPDCMUNICIPIO = "Clas_1431886233600805Ser_56Arg_25_Alias";
    /** <code>personaTMODDIRECCIONESpDCMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRECCIONES_PERSONATMODDIRECCIONESPDCMUNICIPIO = "Municipio";
    /** <code>personaTMODDIRECCIONESpDCRural</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRECCIONES_PERSONATMODDIRECCIONESPDCRURAL = "pDCRural";
    /** <code>personaTMODDIRECCIONESpDCRural</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRECCIONES_PERSONATMODDIRECCIONESPDCRURAL = "Clas_1431886233600805Ser_56Arg_26_Alias";
    /** <code>personaTMODDIRECCIONESpDCRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRECCIONES_PERSONATMODDIRECCIONESPDCRURAL = "Rural";
    /** <code>personaTMODDIRECCIONESptpagrPais</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRECCIONES_PERSONATMODDIRECCIONESPTPAGRPAIS = "pt_p_agrPais";
    /** <code>personaTMODDIRECCIONESptpagrPais</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRECCIONES_PERSONATMODDIRECCIONESPTPAGRPAIS = "Clas_1431886233600805Ser_56Arg_33_Alias";
    /** <code>personaTMODDIRECCIONESptpagrPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRECCIONES_PERSONATMODDIRECCIONESPTPAGRPAIS = "País";
    /** <code>personaTMODDIRECCIONESptpTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRECCIONES_PERSONATMODDIRECCIONESPTPTELEFONOFIJO = "pt_p_TelefonoFijo";
    /** <code>personaTMODDIRECCIONESptpTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRECCIONES_PERSONATMODDIRECCIONESPTPTELEFONOFIJO = "Clas_1431886233600805Ser_56Arg_36_Alias";
    /** <code>personaTMODDIRECCIONESptpTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRECCIONES_PERSONATMODDIRECCIONESPTPTELEFONOFIJO = "Teléfono fijo";
    /** <code>personaTMODDIRECCIONESptpTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TMODDIRECCIONES_PERSONATMODDIRECCIONESPTPTELEFONOCELULAR = "pt_p_TelefonoCelular";
    /** <code>personaTMODDIRECCIONESptpTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TMODDIRECCIONES_PERSONATMODDIRECCIONESPTPTELEFONOCELULAR = "Clas_1431886233600805Ser_56Arg_37_Alias";
    /** <code>personaTMODDIRECCIONESptpTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODDIRECCIONES_PERSONATMODDIRECCIONESPTPTELEFONOCELULAR = "Teléfono celular";
    // Service (TCREARDOCIDENTIFICACION)
    /** <code>TCREARDOCIDENTIFICACION</code> service id. */
    public static final String SERV_ID_TCREARDOCIDENTIFICACION = "Clas_1431886233600805Ser_58_Alias";
    /** <code>TCREARDOCIDENTIFICACION</code> service name. */
    public static final String SERV_NAME_TCREARDOCIDENTIFICACION = "TCREARDOCIDENTIFICACION";
    /** <code>TCREARDOCIDENTIFICACION</code> service alias. */
    public static final String SERV_ALIAS_TCREARDOCIDENTIFICACION = "TCREARDOCIDENTIFICACION";
    /** Agents allowed to execute the service TCREARDOCIDENTIFICACION **/
    public static final String TCREARDOCIDENTIFICACION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaTCREARDOCIDENTIFICACIONpthisPersona</code> inbound argument name. */
    public static final String ARG_NAME_TCREARDOCIDENTIFICACION_PERSONATCREARDOCIDENTIFICACIONPTHISPERSONA = "p_thisPersona";
    /** <code>personaTCREARDOCIDENTIFICACIONpthisPersona</code> inbound argument id. */
    public static final String ARG_ID_TCREARDOCIDENTIFICACION_PERSONATCREARDOCIDENTIFICACIONPTHISPERSONA = "Clas_1431886233600805Ser_58Arg_1_Alias";
    /** <code>personaTCREARDOCIDENTIFICACIONpthisPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARDOCIDENTIFICACION_PERSONATCREARDOCIDENTIFICACIONPTHISPERSONA = "Persona";
    /** <code>personaTCREARDOCIDENTIFICACIONptDatosDocumento</code> inbound argument name. */
    public static final String ARG_NAME_TCREARDOCIDENTIFICACION_PERSONATCREARDOCIDENTIFICACIONPTDATOSDOCUMENTO = "ptDatosDocumento";
    /** <code>personaTCREARDOCIDENTIFICACIONptDatosDocumento</code> inbound argument id. */
    public static final String ARG_ID_TCREARDOCIDENTIFICACION_PERSONATCREARDOCIDENTIFICACIONPTDATOSDOCUMENTO = "Clas_1431886233600805Ser_58Arg_2_Alias";
    /** <code>personaTCREARDOCIDENTIFICACIONptDatosDocumento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARDOCIDENTIFICACION_PERSONATCREARDOCIDENTIFICACIONPTDATOSDOCUMENTO = "ptDatosDocumento";
    /** <code>personaTCREARDOCIDENTIFICACIONptSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TCREARDOCIDENTIFICACION_PERSONATCREARDOCIDENTIFICACIONPTSOLICITUD = "ptSolicitud";
    /** <code>personaTCREARDOCIDENTIFICACIONptSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TCREARDOCIDENTIFICACION_PERSONATCREARDOCIDENTIFICACIONPTSOLICITUD = "Clas_1431886233600805Ser_58Arg_3_Alias";
    /** <code>personaTCREARDOCIDENTIFICACIONptSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARDOCIDENTIFICACION_PERSONATCREARDOCIDENTIFICACIONPTSOLICITUD = "Solicitud";

    public static final String FILTER_NAME_FPERSONAVARIOS = "F_PersonaVarios";
    public static final String VAR_NAME_FPERSONAVARIOS_VTIPOPERSONA = "v_TipoPersona";
    public static final String VAR_NAME_FPERSONAVARIOS_VOTIPOIDENTIFICACION = "vo_TipoIdentificacion";
    public static final String VAR_NAME_FPERSONAVARIOS_VRAZONSOCIAL = "v_RazonSocial";
    public static final String VAR_NAME_FPERSONAVARIOS_VPRIMERNOMBRE = "v_PrimerNombre";
    public static final String VAR_NAME_FPERSONAVARIOS_VPRIMERAPELLIDO = "v_PrimerApellido";
    public static final String VAR_NAME_FPERSONAVARIOS_VSEGUNDOAPELLIDO = "v_SegundoApellido";
    public static final String FILTER_NAME_FPERSONACONSULTARCORE = "F_PersonaConsultarCORE";
    public static final String VAR_NAME_FPERSONACONSULTARCORE_VOTIPOIDENTIFICACION = "vo_TipoIdentificacion";
    public static final String VAR_NAME_FPERSONACONSULTARCORE_VNUMIDENTIFICACION = "v_NumIdentificacion";
    public static final String VAR_NAME_FPERSONACONSULTARCORE_VPRIMERNOMORAZON = "v_PrimerNomORazon";
    public static final String VAR_NAME_FPERSONACONSULTARCORE_VSEGUNDONOMBRE = "v_SegundoNombre";
    public static final String VAR_NAME_FPERSONACONSULTARCORE_VPRIMERAPE = "v_PrimerApe";
    public static final String VAR_NAME_FPERSONACONSULTARCORE_VSEGUNDOAPE = "v_SegundoApe";
    public static final String VAR_NAME_FPERSONACONSULTARCORE_VFECHANACIMIENTO = "v_FechaNacimiento";
    public static final String FILTER_NAME_FPERSONACONSULTARCORENAT = "F_PersonaConsultarCORENat";
    public static final String VAR_NAME_FPERSONACONSULTARCORENAT_VOTIPOIDENTIFICACION = "vo_TipoIdentificacion";
    public static final String VAR_NAME_FPERSONACONSULTARCORENAT_VNUMIDENTIFICACION = "v_NumIdentificacion";
    public static final String VAR_NAME_FPERSONACONSULTARCORENAT_VPRIMERNOMBRE = "v_PrimerNombre";
    public static final String VAR_NAME_FPERSONACONSULTARCORENAT_VSEGUNDONOMBRE = "v_SegundoNombre";
    public static final String VAR_NAME_FPERSONACONSULTARCORENAT_VPRIMERAPE = "v_PrimerApe";
    public static final String VAR_NAME_FPERSONACONSULTARCORENAT_VSEGUNDOAPE = "v_SegundoApe";
    public static final String VAR_NAME_FPERSONACONSULTARCORENAT_VFECHANACIMIENTO = "v_FechaNacimiento";
    public static final String FILTER_NAME_IFPERSONACODIGOCORE = "iF_PersonaCodigoCORE";
    public static final String VAR_NAME_IFPERSONACODIGOCORE_VCODIGO = "v_Codigo";
    public static final String FILTER_NAME_IFPERSONAPORTIPOYNUMDOC = "iF_PersonaPorTipoYNumDoc";
    public static final String VAR_NAME_IFPERSONAPORTIPOYNUMDOC_VNOMCORTO = "v_NomCorto";
    public static final String VAR_NAME_IFPERSONAPORTIPOYNUMDOC_VNUMDOC = "v_NumDoc";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_PERSONACODIGO.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONANUMIDENTIFICACION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONATIPOPERSONA.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONAPRIMERNOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONASEGUNDONOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONAPRIMERAPELLIDO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONASEGUNDOAPELLIDO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONARAZONSOCIAL.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONADRVNOMBRECOMPLETO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONAFECHANACIMIENTO.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONAGENERO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONAINDICADOREXTRANJERO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONATELEFONOFIJO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONATELEFONOCELULAR.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONACORREOELECTRONICO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONATIENEEPSSANITAS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONARECHAZADOAFILIACION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONADATOSBASICOSMOD.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONADRVRECHAZADA.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONADRVTIENEDIRECCIONES.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONADRVTIPONUMDOC.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONADRVVIENEDECORE.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONADRVADDDOCCOMOCONT.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONADRVADDDOCCOMOTITU.toUpperCase(), Constants.Type.BOOL.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_PERSONAIDENTIFICADOR.toUpperCase(), PERSONAIDENTIFICADOR_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONACODIGO.toUpperCase(), PERSONACODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONANUMIDENTIFICACION.toUpperCase(), PERSONANUMIDENTIFICACION_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONATIPOPERSONA.toUpperCase(), PERSONATIPOPERSONA_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONAPRIMERNOMBRE.toUpperCase(), PERSONAPRIMERNOMBRE_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONASEGUNDONOMBRE.toUpperCase(), PERSONASEGUNDONOMBRE_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONAPRIMERAPELLIDO.toUpperCase(), PERSONAPRIMERAPELLIDO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONASEGUNDOAPELLIDO.toUpperCase(), PERSONASEGUNDOAPELLIDO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONARAZONSOCIAL.toUpperCase(), PERSONARAZONSOCIAL_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONADRVNOMBRECOMPLETO.toUpperCase(), PERSONADRVNOMBRECOMPLETO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONAFECHANACIMIENTO.toUpperCase(), PERSONAFECHANACIMIENTO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONAGENERO.toUpperCase(), PERSONAGENERO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONAINDICADOREXTRANJERO.toUpperCase(), PERSONAINDICADOREXTRANJERO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONATELEFONOFIJO.toUpperCase(), PERSONATELEFONOFIJO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONATELEFONOCELULAR.toUpperCase(), PERSONATELEFONOCELULAR_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONACORREOELECTRONICO.toUpperCase(), PERSONACORREOELECTRONICO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONATIENEEPSSANITAS.toUpperCase(), PERSONATIENEEPSSANITAS_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONARECHAZADOAFILIACION.toUpperCase(), PERSONARECHAZADOAFILIACION_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONADATOSBASICOSMOD.toUpperCase(), PERSONADATOSBASICOSMOD_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONADRVRECHAZADA.toUpperCase(), PERSONADRVRECHAZADA_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONADRVTIENEDIRECCIONES.toUpperCase(), PERSONADRVTIENEDIRECCIONES_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONADRVTIPONUMDOC.toUpperCase(), PERSONADRVTIPONUMDOC_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONADRVVIENEDECORE.toUpperCase(), PERSONADRVVIENEDECORE_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONADRVADDDOCCOMOCONT.toUpperCase(), PERSONADRVADDDOCCOMOCONT_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONADRVADDDOCCOMOTITU.toUpperCase(), PERSONADRVADDDOCCOMOTITU_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_USUARIOS.toUpperCase(), USUARIOS_AGENTS);
        roleAgents.put(ROLE_NAME_TIPOIDENTIFICACION.toUpperCase(), TIPOIDENTIFICACION_AGENTS);
        roleAgents.put(ROLE_NAME_DEPARTAMENTONACIMIENTO.toUpperCase(), DEPARTAMENTONACIMIENTO_AGENTS);
        roleAgents.put(ROLE_NAME_MUNICIPIONACIMIENTO.toUpperCase(), MUNICIPIONACIMIENTO_AGENTS);
        roleAgents.put(ROLE_NAME_ESTADOCIVIL.toUpperCase(), ESTADOCIVIL_AGENTS);
        roleAgents.put(ROLE_NAME_ESTADOPERSONA.toUpperCase(), ESTADOPERSONA_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'Persona', it returns the identification keys
     * - If className is a facet of the inheritance net of 'Persona', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_PERSONAIDENTIFICADOR);
        }
        // Facet 'Persona' (This facet)
        if (PersonaConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_PERSONAIDENTIFICADOR);
        }
        return returnList;
    }
}
