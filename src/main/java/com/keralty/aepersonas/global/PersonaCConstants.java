package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>PersonaC</code> model class.
 */
public final class PersonaCConstants {

    private PersonaCConstants() {

    }

    // Class
    /** <code>PersonaC</code> class id. */
    public static final String CLASS_ID = "Clas_1432201068544519_Alias";
    /** <code>PersonaC</code> class name. */
    public static final String CLASS_NAME = "PersonaC";
    /** <code>PersonaC</code> class alias. */
    public static final String CLASS_ALIAS = "Persona";
    /** <code>PersonaC</code> class table name. */
    public static final String TBL_NAME = "PersonaC";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "personaCID,tipoInstitucionCTipoInstitucionCCodigo,tipoEntidadCTipoEntidadCCodigo,estadoCivilEstadoCivilCCodigo,estadoPersonaEstadoPersonaCCodigo,tipoIdentificacionTipoIdentificacionCCodigo,municipioMunicipioCNacCodigo,departamentoDepartamentoCNacCodigo,contratoCContratosCID,contratoCFamiliasCID,familiaCFamiliasCID1,contratoCBeneficiariosCID,beneficiarioCBeneficiariosCID1,personaCCodigo,personaCNumIdentificacion,personaCMail,personaCPrimerNombre,personaCSegundoNombre,personaCPrimerApellido,personaCSegundoApellido,personaCFechaNacimiento,personaCGenero,personaCIndicadorExtranjero,personaCRazonSocial,personaCTieneEPSSanitas,personaCRechazadoAfiliacion,personaCNombreCompleto,personaCUltimaActualizacion";

    

    // Attribute (personaCID)
    /** <code>personaCID</code> attribute id. */
    public static final String ATTR_ID_PERSONACID = "Clas_1432201068544519Atr_76_Alias";
    /** <code>personaCID</code> attribute name. */
    public static final String ATTR_NAME_PERSONACID = "personaCID";
    /** <code>personaCID</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONACID = "ID interno";

    /** <code>personaCID</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONACID = "";
    /** Agents allowed to view the attribute personaCID **/
    public static final String PERSONACID_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaCCodigo)
    /** <code>personaCCodigo</code> attribute id. */
    public static final String ATTR_ID_PERSONACCODIGO = "Clas_1432201068544519Atr_35_Alias";
    /** <code>personaCCodigo</code> attribute name. */
    public static final String ATTR_NAME_PERSONACCODIGO = "personaCCodigo";
    /** <code>personaCCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONACCODIGO = "Código";

    /** <code>personaCCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONACCODIGO = "";
    /** Agents allowed to view the attribute personaCCodigo **/
    public static final String PERSONACCODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaCNumIdentificacion)
    /** <code>personaCNumIdentificacion</code> attribute id. */
    public static final String ATTR_ID_PERSONACNUMIDENTIFICACION = "Clas_1432201068544519Atr_36_Alias";
    /** <code>personaCNumIdentificacion</code> attribute name. */
    public static final String ATTR_NAME_PERSONACNUMIDENTIFICACION = "personaCNumIdentificacion";
    /** <code>personaCNumIdentificacion</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONACNUMIDENTIFICACION = "Nº Identificación";

    /** <code>personaCNumIdentificacion</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONACNUMIDENTIFICACION = "";
    /** Agents allowed to view the attribute personaCNumIdentificacion **/
    public static final String PERSONACNUMIDENTIFICACION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaCMail)
    /** <code>personaCMail</code> attribute id. */
    public static final String ATTR_ID_PERSONACMAIL = "Clas_1432201068544519Atr_39_Alias";
    /** <code>personaCMail</code> attribute name. */
    public static final String ATTR_NAME_PERSONACMAIL = "personaCMail";
    /** <code>personaCMail</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONACMAIL = "Email";

    /** <code>personaCMail</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONACMAIL = "";
    /** Agents allowed to view the attribute personaCMail **/
    public static final String PERSONACMAIL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaCPrimerNombre)
    /** <code>personaCPrimerNombre</code> attribute id. */
    public static final String ATTR_ID_PERSONACPRIMERNOMBRE = "Clas_1432201068544519Atr_40_Alias";
    /** <code>personaCPrimerNombre</code> attribute name. */
    public static final String ATTR_NAME_PERSONACPRIMERNOMBRE = "personaCPrimerNombre";
    /** <code>personaCPrimerNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONACPRIMERNOMBRE = "Primer nombre";

    /** <code>personaCPrimerNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONACPRIMERNOMBRE = "";
    /** Agents allowed to view the attribute personaCPrimerNombre **/
    public static final String PERSONACPRIMERNOMBRE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaCSegundoNombre)
    /** <code>personaCSegundoNombre</code> attribute id. */
    public static final String ATTR_ID_PERSONACSEGUNDONOMBRE = "Clas_1432201068544519Atr_41_Alias";
    /** <code>personaCSegundoNombre</code> attribute name. */
    public static final String ATTR_NAME_PERSONACSEGUNDONOMBRE = "personaCSegundoNombre";
    /** <code>personaCSegundoNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONACSEGUNDONOMBRE = "Segundo Nombre";

    /** <code>personaCSegundoNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONACSEGUNDONOMBRE = "";
    /** Agents allowed to view the attribute personaCSegundoNombre **/
    public static final String PERSONACSEGUNDONOMBRE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaCPrimerApellido)
    /** <code>personaCPrimerApellido</code> attribute id. */
    public static final String ATTR_ID_PERSONACPRIMERAPELLIDO = "Clas_1432201068544519Atr_42_Alias";
    /** <code>personaCPrimerApellido</code> attribute name. */
    public static final String ATTR_NAME_PERSONACPRIMERAPELLIDO = "personaCPrimerApellido";
    /** <code>personaCPrimerApellido</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONACPRIMERAPELLIDO = "Primer apellido";

    /** <code>personaCPrimerApellido</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONACPRIMERAPELLIDO = "";
    /** Agents allowed to view the attribute personaCPrimerApellido **/
    public static final String PERSONACPRIMERAPELLIDO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaCSegundoApellido)
    /** <code>personaCSegundoApellido</code> attribute id. */
    public static final String ATTR_ID_PERSONACSEGUNDOAPELLIDO = "Clas_1432201068544519Atr_43_Alias";
    /** <code>personaCSegundoApellido</code> attribute name. */
    public static final String ATTR_NAME_PERSONACSEGUNDOAPELLIDO = "personaCSegundoApellido";
    /** <code>personaCSegundoApellido</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONACSEGUNDOAPELLIDO = "Segundo apellido";

    /** <code>personaCSegundoApellido</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONACSEGUNDOAPELLIDO = "";
    /** Agents allowed to view the attribute personaCSegundoApellido **/
    public static final String PERSONACSEGUNDOAPELLIDO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaCFechaNacimiento)
    /** <code>personaCFechaNacimiento</code> attribute id. */
    public static final String ATTR_ID_PERSONACFECHANACIMIENTO = "Clas_1432201068544519Atr_44_Alias";
    /** <code>personaCFechaNacimiento</code> attribute name. */
    public static final String ATTR_NAME_PERSONACFECHANACIMIENTO = "personaCFechaNacimiento";
    /** <code>personaCFechaNacimiento</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONACFECHANACIMIENTO = "Fecha nacimiento";

    /** <code>personaCFechaNacimiento</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONACFECHANACIMIENTO = "";
    /** Agents allowed to view the attribute personaCFechaNacimiento **/
    public static final String PERSONACFECHANACIMIENTO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaCGenero)
    /** <code>personaCGenero</code> attribute id. */
    public static final String ATTR_ID_PERSONACGENERO = "Clas_1432201068544519Atr_45_Alias";
    /** <code>personaCGenero</code> attribute name. */
    public static final String ATTR_NAME_PERSONACGENERO = "personaCGenero";
    /** <code>personaCGenero</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONACGENERO = "Género";

    /** <code>personaCGenero</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONACGENERO = "";
    /** Agents allowed to view the attribute personaCGenero **/
    public static final String PERSONACGENERO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaCIndicadorExtranjero)
    /** <code>personaCIndicadorExtranjero</code> attribute id. */
    public static final String ATTR_ID_PERSONACINDICADOREXTRANJERO = "Clas_1432201068544519Atr_48_Alias";
    /** <code>personaCIndicadorExtranjero</code> attribute name. */
    public static final String ATTR_NAME_PERSONACINDICADOREXTRANJERO = "personaCIndicadorExtranjero";
    /** <code>personaCIndicadorExtranjero</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONACINDICADOREXTRANJERO = "Indicador extranjero";

    /** <code>personaCIndicadorExtranjero</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONACINDICADOREXTRANJERO = "";
    /** Agents allowed to view the attribute personaCIndicadorExtranjero **/
    public static final String PERSONACINDICADOREXTRANJERO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaCRazonSocial)
    /** <code>personaCRazonSocial</code> attribute id. */
    public static final String ATTR_ID_PERSONACRAZONSOCIAL = "Clas_1432201068544519Atr_51_Alias";
    /** <code>personaCRazonSocial</code> attribute name. */
    public static final String ATTR_NAME_PERSONACRAZONSOCIAL = "personaCRazonSocial";
    /** <code>personaCRazonSocial</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONACRAZONSOCIAL = "Razón Social";

    /** <code>personaCRazonSocial</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONACRAZONSOCIAL = "";
    /** Agents allowed to view the attribute personaCRazonSocial **/
    public static final String PERSONACRAZONSOCIAL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaCdrvTipoPersona)
    /** <code>personaCdrvTipoPersona</code> attribute id. */
    public static final String ATTR_ID_PERSONACDRVTIPOPERSONA = "Clas_1432201068544519Atr_55_Alias";
    /** <code>personaCdrvTipoPersona</code> attribute name. */
    public static final String ATTR_NAME_PERSONACDRVTIPOPERSONA = "personaCdrvTipoPersona";
    /** <code>personaCdrvTipoPersona</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONACDRVTIPOPERSONA = "Tipo persona";

    /** <code>personaCdrvTipoPersona</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONACDRVTIPOPERSONA = "";
    /** Agents allowed to view the attribute personaCdrvTipoPersona **/
    public static final String PERSONACDRVTIPOPERSONA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaCTieneEPSSanitas)
    /** <code>personaCTieneEPSSanitas</code> attribute id. */
    public static final String ATTR_ID_PERSONACTIENEEPSSANITAS = "Clas_1432201068544519Atr_57_Alias";
    /** <code>personaCTieneEPSSanitas</code> attribute name. */
    public static final String ATTR_NAME_PERSONACTIENEEPSSANITAS = "personaCTieneEPSSanitas";
    /** <code>personaCTieneEPSSanitas</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONACTIENEEPSSANITAS = "Tiene EPS Sanitas";

    /** <code>personaCTieneEPSSanitas</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONACTIENEEPSSANITAS = "";
    /** Agents allowed to view the attribute personaCTieneEPSSanitas **/
    public static final String PERSONACTIENEEPSSANITAS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaCRechazadoAfiliacion)
    /** <code>personaCRechazadoAfiliacion</code> attribute id. */
    public static final String ATTR_ID_PERSONACRECHAZADOAFILIACION = "Clas_1432201068544519Atr_58_Alias";
    /** <code>personaCRechazadoAfiliacion</code> attribute name. */
    public static final String ATTR_NAME_PERSONACRECHAZADOAFILIACION = "personaCRechazadoAfiliacion";
    /** <code>personaCRechazadoAfiliacion</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONACRECHAZADOAFILIACION = "Rechazado afiliación";

    /** <code>personaCRechazadoAfiliacion</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONACRECHAZADOAFILIACION = "";
    /** Agents allowed to view the attribute personaCRechazadoAfiliacion **/
    public static final String PERSONACRECHAZADOAFILIACION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaCdrvRechazada)
    /** <code>personaCdrvRechazada</code> attribute id. */
    public static final String ATTR_ID_PERSONACDRVRECHAZADA = "Clas_1432201068544519Atr_59_Alias";
    /** <code>personaCdrvRechazada</code> attribute name. */
    public static final String ATTR_NAME_PERSONACDRVRECHAZADA = "personaCdrvRechazada";
    /** <code>personaCdrvRechazada</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONACDRVRECHAZADA = "Rechazada";

    /** <code>personaCdrvRechazada</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONACDRVRECHAZADA = "";
    /** Agents allowed to view the attribute personaCdrvRechazada **/
    public static final String PERSONACDRVRECHAZADA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaCNombreCompleto)
    /** <code>personaCNombreCompleto</code> attribute id. */
    public static final String ATTR_ID_PERSONACNOMBRECOMPLETO = "Clas_1432201068544519Atr_64_Alias";
    /** <code>personaCNombreCompleto</code> attribute name. */
    public static final String ATTR_NAME_PERSONACNOMBRECOMPLETO = "personaCNombreCompleto";
    /** <code>personaCNombreCompleto</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONACNOMBRECOMPLETO = "Nombre Completo";

    /** <code>personaCNombreCompleto</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONACNOMBRECOMPLETO = "";
    /** Agents allowed to view the attribute personaCNombreCompleto **/
    public static final String PERSONACNOMBRECOMPLETO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaCUltimaActualizacion)
    /** <code>personaCUltimaActualizacion</code> attribute id. */
    public static final String ATTR_ID_PERSONACULTIMAACTUALIZACION = "Clas_1432201068544519Atr_69_Alias";
    /** <code>personaCUltimaActualizacion</code> attribute name. */
    public static final String ATTR_NAME_PERSONACULTIMAACTUALIZACION = "personaCUltimaActualizacion";
    /** <code>personaCUltimaActualizacion</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONACULTIMAACTUALIZACION = "Ultima Actualización";

    /** <code>personaCUltimaActualizacion</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONACULTIMAACTUALIZACION = "";
    /** Agents allowed to view the attribute personaCUltimaActualizacion **/
    public static final String PERSONACULTIMAACTUALIZACION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaCdrvNombreCompleto)
    /** <code>personaCdrvNombreCompleto</code> attribute id. */
    public static final String ATTR_ID_PERSONACDRVNOMBRECOMPLETO = "Clas_1432201068544519Atr_70_Alias";
    /** <code>personaCdrvNombreCompleto</code> attribute name. */
    public static final String ATTR_NAME_PERSONACDRVNOMBRECOMPLETO = "personaCdrvNombreCompleto";
    /** <code>personaCdrvNombreCompleto</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONACDRVNOMBRECOMPLETO = "Nombre completo";

    /** <code>personaCdrvNombreCompleto</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONACDRVNOMBRECOMPLETO = "";
    /** Agents allowed to view the attribute personaCdrvNombreCompleto **/
    public static final String PERSONACDRVNOMBRECOMPLETO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaCdrvDirCorrespondencia)
    /** <code>personaCdrvDirCorrespondencia</code> attribute id. */
    public static final String ATTR_ID_PERSONACDRVDIRCORRESPONDENCIA = "Clas_1432201068544519Atr_71_Alias";
    /** <code>personaCdrvDirCorrespondencia</code> attribute name. */
    public static final String ATTR_NAME_PERSONACDRVDIRCORRESPONDENCIA = "personaCdrvDirCorrespondencia";
    /** <code>personaCdrvDirCorrespondencia</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONACDRVDIRCORRESPONDENCIA = "Dirección correspondencia";

    /** <code>personaCdrvDirCorrespondencia</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONACDRVDIRCORRESPONDENCIA = "";
    /** Agents allowed to view the attribute personaCdrvDirCorrespondencia **/
    public static final String PERSONACDRVDIRCORRESPONDENCIA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaCdrvCiudadCorrespondencia)
    /** <code>personaCdrvCiudadCorrespondencia</code> attribute id. */
    public static final String ATTR_ID_PERSONACDRVCIUDADCORRESPONDENCIA = "Clas_1432201068544519Atr_72_Alias";
    /** <code>personaCdrvCiudadCorrespondencia</code> attribute name. */
    public static final String ATTR_NAME_PERSONACDRVCIUDADCORRESPONDENCIA = "personaCdrvCiudadCorrespondencia";
    /** <code>personaCdrvCiudadCorrespondencia</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONACDRVCIUDADCORRESPONDENCIA = "Ciudad correspondencia";

    /** <code>personaCdrvCiudadCorrespondencia</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONACDRVCIUDADCORRESPONDENCIA = "";
    /** Agents allowed to view the attribute personaCdrvCiudadCorrespondencia **/
    public static final String PERSONACDRVCIUDADCORRESPONDENCIA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaCdrvTipoNumDoc)
    /** <code>personaCdrvTipoNumDoc</code> attribute id. */
    public static final String ATTR_ID_PERSONACDRVTIPONUMDOC = "Clas_1432201068544519Atr_73_Alias";
    /** <code>personaCdrvTipoNumDoc</code> attribute name. */
    public static final String ATTR_NAME_PERSONACDRVTIPONUMDOC = "personaCdrvTipoNumDoc";
    /** <code>personaCdrvTipoNumDoc</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONACDRVTIPONUMDOC = "Identificación";

    /** <code>personaCdrvTipoNumDoc</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONACDRVTIPONUMDOC = "";
    /** Agents allowed to view the attribute personaCdrvTipoNumDoc **/
    public static final String PERSONACDRVTIPONUMDOC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaCdrvEdad)
    /** <code>personaCdrvEdad</code> attribute id. */
    public static final String ATTR_ID_PERSONACDRVEDAD = "Clas_1432201068544519Atr_74_Alias";
    /** <code>personaCdrvEdad</code> attribute name. */
    public static final String ATTR_NAME_PERSONACDRVEDAD = "personaCdrvEdad";
    /** <code>personaCdrvEdad</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONACDRVEDAD = "Edad";

    /** <code>personaCdrvEdad</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONACDRVEDAD = "";
    /** Agents allowed to view the attribute personaCdrvEdad **/
    public static final String PERSONACDRVEDAD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaCdrvObsContrato)
    /** <code>personaCdrvObsContrato</code> attribute id. */
    public static final String ATTR_ID_PERSONACDRVOBSCONTRATO = "Clas_1432201068544519Atr_75_Alias";
    /** <code>personaCdrvObsContrato</code> attribute name. */
    public static final String ATTR_NAME_PERSONACDRVOBSCONTRATO = "personaCdrvObsContrato";
    /** <code>personaCdrvObsContrato</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONACDRVOBSCONTRATO = "Observaciones ";

    /** <code>personaCdrvObsContrato</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONACDRVOBSCONTRATO = "";
    /** Agents allowed to view the attribute personaCdrvObsContrato **/
    public static final String PERSONACDRVOBSCONTRATO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (personaCdrvIMC)
    /** <code>personaCdrvIMC</code> attribute id. */
    public static final String ATTR_ID_PERSONACDRVIMC = "Clas_1432201068544519Atr_77_Alias";
    /** <code>personaCdrvIMC</code> attribute name. */
    public static final String ATTR_NAME_PERSONACDRVIMC = "personaCdrvIMC";
    /** <code>personaCdrvIMC</code> attribute alias. */
    public static final String ATTR_ALIAS_PERSONACDRVIMC = "IMC";

    /** <code>personaCdrvIMC</code> attribute facet sequence. */
    public static final String PATH_FACETS_PERSONACDRVIMC = "";
    /** Agents allowed to view the attribute personaCdrvIMC **/
    public static final String PERSONACDRVIMC_AGENTS = "Admin,SuperAdmin,Asesor,Gestor,MesaDeApoyo";


    // Field (ID)
    /** <code>ID</code> field name. */
    public static final String FLD_PERSONACID = "ID";    
    /** <code>personaCID</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONACID = "personaCID";
    // Field (TipoInstitucionC_Codigo)
    /** <code>TipoInstitucionC_Codigo</code> field name. */
    public static final String FLD_TIPOINSTITUCIONCTIPOINSTITUCIONCCODIGO = "TipoInstitucionC_Codigo";    
    /** <code>TipoInstitucionC.tipoInstitucionCCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_TIPOINSTITUCIONC_TIPOINSTITUCIONCCODIGO = "tipoInstitucionCTipoInstitucionCCodigo";
    // Field (TipoEntidadC_Codigo)
    /** <code>TipoEntidadC_Codigo</code> field name. */
    public static final String FLD_TIPOENTIDADCTIPOENTIDADCCODIGO = "TipoEntidadC_Codigo";    
    /** <code>TipoEntidadC.tipoEntidadCCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_TIPOENTIDADC_TIPOENTIDADCCODIGO = "tipoEntidadCTipoEntidadCCodigo";
    // Field (EstadoCivilC_Codigo)
    /** <code>EstadoCivilC_Codigo</code> field name. */
    public static final String FLD_ESTADOCIVILESTADOCIVILCCODIGO = "EstadoCivilC_Codigo";    
    /** <code>EstadoCivilC.estadoCivilCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_ESTADOCIVILC_ESTADOCIVILCODIGO = "estadoCivilEstadoCivilCCodigo";
    // Field (EstadoPersonaC_Codigo)
    /** <code>EstadoPersonaC_Codigo</code> field name. */
    public static final String FLD_ESTADOPERSONAESTADOPERSONACCODIGO = "EstadoPersonaC_Codigo";    
    /** <code>EstadoPersonaC.estadoPersonaCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_ESTADOPERSONAC_ESTADOPERSONACODIGO = "estadoPersonaEstadoPersonaCCodigo";
    // Field (TipoIdentificacionC_Codigo)
    /** <code>TipoIdentificacionC_Codigo</code> field name. */
    public static final String FLD_TIPOIDENTIFICACIONTIPOIDENTIFICACIONCCODIGO = "TipoIdentificacionC_Codigo";    
    /** <code>TipoIdentificacionC.tipoIdentificacionCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_TIPOIDENTIFICACIONC_TIPOIDENTIFICACIONCODIGO = "tipoIdentificacionTipoIdentificacionCCodigo";
    // Field (MunicipioCNac_Codigo)
    /** <code>MunicipioCNac_Codigo</code> field name. */
    public static final String FLD_MUNICIPIOMUNICIPIOCNACCODIGO = "MunicipioCNac_Codigo";    
    /** <code>MunicipioCNac.municipioCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_MUNICIPIOCNAC_MUNICIPIOCODIGO = "municipioMunicipioCNacCodigo";
    // Field (DepartamentoCNac_Codigo)
    /** <code>DepartamentoCNac_Codigo</code> field name. */
    public static final String FLD_DEPARTAMENTODEPARTAMENTOCNACCODIGO = "DepartamentoCNac_Codigo";    
    /** <code>DepartamentoCNac.departamentoCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_DEPARTAMENTOCNAC_DEPARTAMENTOCODIGO = "departamentoDepartamentoCNacCodigo";
    // Field (ContratosC_ID)
    /** <code>ContratosC_ID</code> field name. */
    public static final String FLD_CONTRATOCCONTRATOSCID = "ContratosC_ID";    
    /** <code>ContratosC.contratoCID</code> attribute field name. */
    public static final String ATTR_FIELD_CONTRATOSC_CONTRATOCID = "contratoCContratosCID";
    // Field (FamiliasC_ID)
    /** <code>FamiliasC_ID</code> field name. */
    public static final String FLD_CONTRATOCFAMILIASCID = "FamiliasC_ID";    
    /** <code>FamiliasC.ContratoC.contratoCID</code> attribute field name. */
    public static final String ATTR_FIELD_FAMILIASC_CONTRATOC_CONTRATOCID = "contratoCFamiliasCID";
    // Field (FamiliasC_ID_1)
    /** <code>FamiliasC_ID_1</code> field name. */
    public static final String FLD_FAMILIACFAMILIASCID1 = "FamiliasC_ID_1";    
    /** <code>FamiliasC.familiaCID</code> attribute field name. */
    public static final String ATTR_FIELD_FAMILIASC_FAMILIACID = "familiaCFamiliasCID1";
    // Field (BeneficiariosC_ID)
    /** <code>BeneficiariosC_ID</code> field name. */
    public static final String FLD_CONTRATOCBENEFICIARIOSCID = "BeneficiariosC_ID";    
    /** <code>BeneficiariosC.ContratoC.contratoCID</code> attribute field name. */
    public static final String ATTR_FIELD_BENEFICIARIOSC_CONTRATOC_CONTRATOCID = "contratoCBeneficiariosCID";
    // Field (BeneficiariosC_ID_1)
    /** <code>BeneficiariosC_ID_1</code> field name. */
    public static final String FLD_BENEFICIARIOCBENEFICIARIOSCID1 = "BeneficiariosC_ID_1";    
    /** <code>BeneficiariosC.beneficiarioCID</code> attribute field name. */
    public static final String ATTR_FIELD_BENEFICIARIOSC_BENEFICIARIOCID = "beneficiarioCBeneficiariosCID1";
    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_PERSONACCODIGO = "Codigo";    
    /** <code>personaCCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONACCODIGO = "personaCCodigo";
    // Field (NumIdentificacion)
    /** <code>NumIdentificacion</code> field name. */
    public static final String FLD_PERSONACNUMIDENTIFICACION = "NumIdentificacion";    
    /** <code>NumIdentificacion</code> field length. */
    public static final int FLD_PERSONACNUMIDENTIFICACIONLENGTH = 60;
    /** <code>personaCNumIdentificacion</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONACNUMIDENTIFICACION = "personaCNumIdentificacion";
    // Field (Mail)
    /** <code>Mail</code> field name. */
    public static final String FLD_PERSONACMAIL = "Mail";    
    /** <code>Mail</code> field length. */
    public static final int FLD_PERSONACMAILLENGTH = 100;
    /** <code>personaCMail</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONACMAIL = "personaCMail";
    // Field (PrimerNombre)
    /** <code>PrimerNombre</code> field name. */
    public static final String FLD_PERSONACPRIMERNOMBRE = "PrimerNombre";    
    /** <code>PrimerNombre</code> field length. */
    public static final int FLD_PERSONACPRIMERNOMBRELENGTH = 50;
    /** <code>personaCPrimerNombre</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONACPRIMERNOMBRE = "personaCPrimerNombre";
    // Field (SegundoNombre)
    /** <code>SegundoNombre</code> field name. */
    public static final String FLD_PERSONACSEGUNDONOMBRE = "SegundoNombre";    
    /** <code>SegundoNombre</code> field length. */
    public static final int FLD_PERSONACSEGUNDONOMBRELENGTH = 50;
    /** <code>personaCSegundoNombre</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONACSEGUNDONOMBRE = "personaCSegundoNombre";
    // Field (PrimerApellido)
    /** <code>PrimerApellido</code> field name. */
    public static final String FLD_PERSONACPRIMERAPELLIDO = "PrimerApellido";    
    /** <code>PrimerApellido</code> field length. */
    public static final int FLD_PERSONACPRIMERAPELLIDOLENGTH = 50;
    /** <code>personaCPrimerApellido</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONACPRIMERAPELLIDO = "personaCPrimerApellido";
    // Field (SegundoApellido)
    /** <code>SegundoApellido</code> field name. */
    public static final String FLD_PERSONACSEGUNDOAPELLIDO = "SegundoApellido";    
    /** <code>SegundoApellido</code> field length. */
    public static final int FLD_PERSONACSEGUNDOAPELLIDOLENGTH = 50;
    /** <code>personaCSegundoApellido</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONACSEGUNDOAPELLIDO = "personaCSegundoApellido";
    // Field (FechaNacimiento)
    /** <code>FechaNacimiento</code> field name. */
    public static final String FLD_PERSONACFECHANACIMIENTO = "FechaNacimiento";    
    /** <code>personaCFechaNacimiento</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONACFECHANACIMIENTO = "personaCFechaNacimiento";
    // Field (Genero)
    /** <code>Genero</code> field name. */
    public static final String FLD_PERSONACGENERO = "Genero";    
    /** <code>Genero</code> field length. */
    public static final int FLD_PERSONACGENEROLENGTH = 1;
    /** <code>personaCGenero</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONACGENERO = "personaCGenero";
    // Field (IndicadorExtranjero)
    /** <code>IndicadorExtranjero</code> field name. */
    public static final String FLD_PERSONACINDICADOREXTRANJERO = "IndicadorExtranjero";    
    /** <code>personaCIndicadorExtranjero</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONACINDICADOREXTRANJERO = "personaCIndicadorExtranjero";
    // Field (RazonSocial)
    /** <code>RazonSocial</code> field name. */
    public static final String FLD_PERSONACRAZONSOCIAL = "RazonSocial";    
    /** <code>RazonSocial</code> field length. */
    public static final int FLD_PERSONACRAZONSOCIALLENGTH = 254;
    /** <code>personaCRazonSocial</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONACRAZONSOCIAL = "personaCRazonSocial";
    // Field (TieneEPSSanitas)
    /** <code>TieneEPSSanitas</code> field name. */
    public static final String FLD_PERSONACTIENEEPSSANITAS = "TieneEPSSanitas";    
    /** <code>personaCTieneEPSSanitas</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONACTIENEEPSSANITAS = "personaCTieneEPSSanitas";
    // Field (RechazadoAfiliacion)
    /** <code>RechazadoAfiliacion</code> field name. */
    public static final String FLD_PERSONACRECHAZADOAFILIACION = "RechazadoAfiliacion";    
    /** <code>RechazadoAfiliacion</code> field length. */
    public static final int FLD_PERSONACRECHAZADOAFILIACIONLENGTH = 50;
    /** <code>personaCRechazadoAfiliacion</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONACRECHAZADOAFILIACION = "personaCRechazadoAfiliacion";
    // Field (NombreCompleto)
    /** <code>NombreCompleto</code> field name. */
    public static final String FLD_PERSONACNOMBRECOMPLETO = "NombreCompleto";    
    /** <code>NombreCompleto</code> field length. */
    public static final int FLD_PERSONACNOMBRECOMPLETOLENGTH = 100;
    /** <code>personaCNombreCompleto</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONACNOMBRECOMPLETO = "personaCNombreCompleto";
    // Field (UltimaActualizacion)
    /** <code>UltimaActualizacion</code> field name. */
    public static final String FLD_PERSONACULTIMAACTUALIZACION = "UltimaActualizacion";    
    /** <code>personaCUltimaActualizacion</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONACULTIMAACTUALIZACION = "personaCUltimaActualizacion";

    // Component role (TipoInstitucionC)
    /** <code>TipoInstitucionC</code> role id. */
    public static final String ROLE_ID_TIPOINSTITUCIONC = "Agr_1437649993728231_Alias";
    /** <code>TipoInstitucionC</code> role name. */
    public static final String ROLE_NAME_TIPOINSTITUCIONC = "tipoInstitucionC";
    /** <code>TipoInstitucionC</code> role alias. */
    public static final String ROLE_ALIAS_TIPOINSTITUCIONC = "Tipo institución";

    /** <code>TipoInstitucionC</code> inverse role name. */
    public static final String ROLE_INVNAME_TIPOINSTITUCIONC = TipoInstitucionCConstants.ROLE_NAME_PERSONASC;
    /** <code>TipoInstitucionC</code> role facet sequence. */
    public static final String PATH_FACETS_TIPOINSTITUCIONC = "";
    /** <code>TipoInstitucionC</code> role target class. */
    public static final String ROLE_TARGET_TIPOINSTITUCIONC = TipoInstitucionCConstants.CLASS_NAME;

    /** Agents allowed to navigate through TipoInstitucionC **/
    public static final String TIPOINSTITUCIONC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (TipoEntidadC)
    /** <code>TipoEntidadC</code> role id. */
    public static final String ROLE_ID_TIPOENTIDADC = "Agr_1437649993728315_Alias";
    /** <code>TipoEntidadC</code> role name. */
    public static final String ROLE_NAME_TIPOENTIDADC = "tipoEntidadC";
    /** <code>TipoEntidadC</code> role alias. */
    public static final String ROLE_ALIAS_TIPOENTIDADC = "Tipo entidad";

    /** <code>TipoEntidadC</code> inverse role name. */
    public static final String ROLE_INVNAME_TIPOENTIDADC = TipoEntidadCConstants.ROLE_NAME_PERSONASC;
    /** <code>TipoEntidadC</code> role facet sequence. */
    public static final String PATH_FACETS_TIPOENTIDADC = "";
    /** <code>TipoEntidadC</code> role target class. */
    public static final String ROLE_TARGET_TIPOENTIDADC = TipoEntidadCConstants.CLASS_NAME;

    /** Agents allowed to navigate through TipoEntidadC **/
    public static final String TIPOENTIDADC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (EstadoCivilC)
    /** <code>EstadoCivilC</code> role id. */
    public static final String ROLE_ID_ESTADOCIVILC = "Agr_1473094483968286_Alias";
    /** <code>EstadoCivilC</code> role name. */
    public static final String ROLE_NAME_ESTADOCIVILC = "estadoCivilC";
    /** <code>EstadoCivilC</code> role alias. */
    public static final String ROLE_ALIAS_ESTADOCIVILC = "Estado civil";

    /** <code>EstadoCivilC</code> inverse role name. */
    public static final String ROLE_INVNAME_ESTADOCIVILC = EstadoCivilConstants.ROLE_NAME_PERSONASC;
    /** <code>EstadoCivilC</code> role facet sequence. */
    public static final String PATH_FACETS_ESTADOCIVILC = "";
    /** <code>EstadoCivilC</code> role target class. */
    public static final String ROLE_TARGET_ESTADOCIVILC = EstadoCivilConstants.CLASS_NAME;

    /** Agents allowed to navigate through EstadoCivilC **/
    public static final String ESTADOCIVILC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (EstadoPersonaC)
    /** <code>EstadoPersonaC</code> role id. */
    public static final String ROLE_ID_ESTADOPERSONAC = "Agr_1473094746112648_Alias";
    /** <code>EstadoPersonaC</code> role name. */
    public static final String ROLE_NAME_ESTADOPERSONAC = "estadoPersonaC";
    /** <code>EstadoPersonaC</code> role alias. */
    public static final String ROLE_ALIAS_ESTADOPERSONAC = "Estado";

    /** <code>EstadoPersonaC</code> inverse role name. */
    public static final String ROLE_INVNAME_ESTADOPERSONAC = EstadoPersonaConstants.ROLE_NAME_PERSONASC;
    /** <code>EstadoPersonaC</code> role facet sequence. */
    public static final String PATH_FACETS_ESTADOPERSONAC = "";
    /** <code>EstadoPersonaC</code> role target class. */
    public static final String ROLE_TARGET_ESTADOPERSONAC = EstadoPersonaConstants.CLASS_NAME;

    /** Agents allowed to navigate through EstadoPersonaC **/
    public static final String ESTADOPERSONAC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (TipoIdentificacionC)
    /** <code>TipoIdentificacionC</code> role id. */
    public static final String ROLE_ID_TIPOIDENTIFICACIONC = "Agr_1473350598656950_Alias";
    /** <code>TipoIdentificacionC</code> role name. */
    public static final String ROLE_NAME_TIPOIDENTIFICACIONC = "tipoIdentificacionC";
    /** <code>TipoIdentificacionC</code> role alias. */
    public static final String ROLE_ALIAS_TIPOIDENTIFICACIONC = "Tipo identificación";

    /** <code>TipoIdentificacionC</code> inverse role name. */
    public static final String ROLE_INVNAME_TIPOIDENTIFICACIONC = TipoIdentificacionConstants.ROLE_NAME_PERSONASC;
    /** <code>TipoIdentificacionC</code> role facet sequence. */
    public static final String PATH_FACETS_TIPOIDENTIFICACIONC = "";
    /** <code>TipoIdentificacionC</code> role target class. */
    public static final String ROLE_TARGET_TIPOIDENTIFICACIONC = TipoIdentificacionConstants.CLASS_NAME;

    /** Agents allowed to navigate through TipoIdentificacionC **/
    public static final String TIPOIDENTIFICACIONC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (MunicipioCNac)
    /** <code>MunicipioCNac</code> role id. */
    public static final String ROLE_ID_MUNICIPIOCNAC = "Agr_1473350598656411_Alias";
    /** <code>MunicipioCNac</code> role name. */
    public static final String ROLE_NAME_MUNICIPIOCNAC = "municipioCNac";
    /** <code>MunicipioCNac</code> role alias. */
    public static final String ROLE_ALIAS_MUNICIPIOCNAC = "Municipio";

    /** <code>MunicipioCNac</code> inverse role name. */
    public static final String ROLE_INVNAME_MUNICIPIOCNAC = MunicipioConstants.ROLE_NAME_PERSONASC;
    /** <code>MunicipioCNac</code> role facet sequence. */
    public static final String PATH_FACETS_MUNICIPIOCNAC = "";
    /** <code>MunicipioCNac</code> role target class. */
    public static final String ROLE_TARGET_MUNICIPIOCNAC = MunicipioConstants.CLASS_NAME;

    /** Agents allowed to navigate through MunicipioCNac **/
    public static final String MUNICIPIOCNAC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (DepartamentoCNac)
    /** <code>DepartamentoCNac</code> role id. */
    public static final String ROLE_ID_DEPARTAMENTOCNAC = "Agr_1473350729728127_Alias";
    /** <code>DepartamentoCNac</code> role name. */
    public static final String ROLE_NAME_DEPARTAMENTOCNAC = "departamentoCNac";
    /** <code>DepartamentoCNac</code> role alias. */
    public static final String ROLE_ALIAS_DEPARTAMENTOCNAC = "Departamento nacimiento";

    /** <code>DepartamentoCNac</code> inverse role name. */
    public static final String ROLE_INVNAME_DEPARTAMENTOCNAC = DepartamentoConstants.ROLE_NAME_PERSONASC;
    /** <code>DepartamentoCNac</code> role facet sequence. */
    public static final String PATH_FACETS_DEPARTAMENTOCNAC = "";
    /** <code>DepartamentoCNac</code> role target class. */
    public static final String ROLE_TARGET_DEPARTAMENTOCNAC = DepartamentoConstants.CLASS_NAME;

    /** Agents allowed to navigate through DepartamentoCNac **/
    public static final String DEPARTAMENTOCNAC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (ContratosC)
    /** <code>ContratosC</code> role id. */
    public static final String ROLE_ID_CONTRATOSC = "Agr_1437649993728843_Alias";
    /** <code>ContratosC</code> role name. */
    public static final String ROLE_NAME_CONTRATOSC = "contratosC";
    /** <code>ContratosC</code> role alias. */
    public static final String ROLE_ALIAS_CONTRATOSC = "Contratos";

    /** <code>ContratosC</code> inverse role name. */
    public static final String ROLE_INVNAME_CONTRATOSC = ContratoCConstants.ROLE_NAME_PERSONACCONTRATANTE;
    /** <code>ContratosC</code> role facet sequence. */
    public static final String PATH_FACETS_CONTRATOSC = "";
    /** <code>ContratosC</code> role target class. */
    public static final String ROLE_TARGET_CONTRATOSC = ContratoCConstants.CLASS_NAME;

    /** Agents allowed to navigate through ContratosC **/
    public static final String CONTRATOSC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (FamiliasC)
    /** <code>FamiliasC</code> role id. */
    public static final String ROLE_ID_FAMILIASC = "Agr_1437649993728411_Alias";
    /** <code>FamiliasC</code> role name. */
    public static final String ROLE_NAME_FAMILIASC = "familiasC";
    /** <code>FamiliasC</code> role alias. */
    public static final String ROLE_ALIAS_FAMILIASC = "Familias";

    /** <code>FamiliasC</code> inverse role name. */
    public static final String ROLE_INVNAME_FAMILIASC = FamiliaCConstants.ROLE_NAME_PERSONACTITULAR;
    /** <code>FamiliasC</code> role facet sequence. */
    public static final String PATH_FACETS_FAMILIASC = "";
    /** <code>FamiliasC</code> role target class. */
    public static final String ROLE_TARGET_FAMILIASC = FamiliaCConstants.CLASS_NAME;

    /** Agents allowed to navigate through FamiliasC **/
    public static final String FAMILIASC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (BeneficiariosC)
    /** <code>BeneficiariosC</code> role id. */
    public static final String ROLE_ID_BENEFICIARIOSC = "Agr_1437649993728151_Alias";
    /** <code>BeneficiariosC</code> role name. */
    public static final String ROLE_NAME_BENEFICIARIOSC = "beneficiariosC";
    /** <code>BeneficiariosC</code> role alias. */
    public static final String ROLE_ALIAS_BENEFICIARIOSC = "Beneficiarios";

    /** <code>BeneficiariosC</code> inverse role name. */
    public static final String ROLE_INVNAME_BENEFICIARIOSC = BeneficiarioCConstants.ROLE_NAME_PERSONAC;
    /** <code>BeneficiariosC</code> role facet sequence. */
    public static final String PATH_FACETS_BENEFICIARIOSC = "";
    /** <code>BeneficiariosC</code> role target class. */
    public static final String ROLE_TARGET_BENEFICIARIOSC = BeneficiarioCConstants.CLASS_NAME;

    /** Agents allowed to navigate through BeneficiariosC **/
    public static final String BENEFICIARIOSC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Compound role (DireccionesC)
    /** <code>DireccionesC</code> role id. */
    public static final String ROLE_ID_DIRECCIONESC = "Agr_1437649993728848_Alias";
    /** <code>DireccionesC</code> role name. */
    public static final String ROLE_NAME_DIRECCIONESC = "direccionesC";
    /** <code>PersonaC</code> role alias. */
    public static final String ROLE_ALIAS_DIRECCIONESC = "Direcciones";


    /** <code>DireccionesC</code> inverse role name. */
    public static final String ROLE_INVNAME_DIRECCIONESC = DireccionCConstants.ROLE_NAME_PERSONAC;
    /** <code>DireccionesC</code> role facet sequence. */
    public static final String PATH_FACETS_DIRECCIONESC = "";
    /** <code>DireccionesC</code> role target class. */
    public static final String ROLE_TARGET_DIRECCIONESC = DireccionCConstants.CLASS_NAME;
    /** Agents allowed to navigate through DireccionesC **/
    public static final String DIRECCIONESC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (ProteccionesDatosC)
    /** <code>ProteccionesDatosC</code> role id. */
    public static final String ROLE_ID_PROTECCIONESDATOSC = "Agr_1437649993728045_Alias";
    /** <code>ProteccionesDatosC</code> role name. */
    public static final String ROLE_NAME_PROTECCIONESDATOSC = "proteccionesDatosC";
    /** <code>PersonaC</code> role alias. */
    public static final String ROLE_ALIAS_PROTECCIONESDATOSC = "Protecciones datos";


    /** <code>ProteccionesDatosC</code> inverse role name. */
    public static final String ROLE_INVNAME_PROTECCIONESDATOSC = ProteccionDatosCConstants.ROLE_NAME_PERSONAC;
    /** <code>ProteccionesDatosC</code> role facet sequence. */
    public static final String PATH_FACETS_PROTECCIONESDATOSC = "";
    /** <code>ProteccionesDatosC</code> role target class. */
    public static final String ROLE_TARGET_PROTECCIONESDATOSC = ProteccionDatosCConstants.CLASS_NAME;
    /** Agents allowed to navigate through ProteccionesDatosC **/
    public static final String PROTECCIONESDATOSC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (PregsCuesMedC)
    /** <code>PregsCuesMedC</code> role id. */
    public static final String ROLE_ID_PREGSCUESMEDC = "Agr_1437649993728172_Alias";
    /** <code>PregsCuesMedC</code> role name. */
    public static final String ROLE_NAME_PREGSCUESMEDC = "pregsCuesMedC";
    /** <code>PersonaC</code> role alias. */
    public static final String ROLE_ALIAS_PREGSCUESMEDC = "Preguntas Cuestionario";


    /** <code>PregsCuesMedC</code> inverse role name. */
    public static final String ROLE_INVNAME_PREGSCUESMEDC = PregCuesMedCConstants.ROLE_NAME_PERSONAC;
    /** <code>PregsCuesMedC</code> role facet sequence. */
    public static final String PATH_FACETS_PREGSCUESMEDC = "";
    /** <code>PregsCuesMedC</code> role target class. */
    public static final String ROLE_TARGET_PREGSCUESMEDC = PregCuesMedCConstants.CLASS_NAME;
    /** Agents allowed to navigate through PregsCuesMedC **/
    public static final String PREGSCUESMEDC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (DirSucursalesC)
    /** <code>DirSucursalesC</code> role id. */
    public static final String ROLE_ID_DIRSUCURSALESC = "Agr_1437649993728215_Alias";
    /** <code>DirSucursalesC</code> role name. */
    public static final String ROLE_NAME_DIRSUCURSALESC = "dirSucursalesC";
    /** <code>PersonaC</code> role alias. */
    public static final String ROLE_ALIAS_DIRSUCURSALESC = "Sucursales";


    /** <code>DirSucursalesC</code> inverse role name. */
    public static final String ROLE_INVNAME_DIRSUCURSALESC = DirSucursalCConstants.ROLE_NAME_PERSONAC;
    /** <code>DirSucursalesC</code> role facet sequence. */
    public static final String PATH_FACETS_DIRSUCURSALESC = "";
    /** <code>DirSucursalesC</code> role target class. */
    public static final String ROLE_TARGET_DIRSUCURSALESC = DirSucursalCConstants.CLASS_NAME;
    /** Agents allowed to navigate through DirSucursalesC **/
    public static final String DIRSUCURSALESC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (PreexistenciasC)
    /** <code>PreexistenciasC</code> role id. */
    public static final String ROLE_ID_PREEXISTENCIASC = "Agr_1437649993728175_Alias";
    /** <code>PreexistenciasC</code> role name. */
    public static final String ROLE_NAME_PREEXISTENCIASC = "preexistenciasC";
    /** <code>PersonaC</code> role alias. */
    public static final String ROLE_ALIAS_PREEXISTENCIASC = "PreexistenciasC";


    /** <code>PreexistenciasC</code> inverse role name. */
    public static final String ROLE_INVNAME_PREEXISTENCIASC = PreexistenciaCConstants.ROLE_NAME_PERSONAC;
    /** <code>PreexistenciasC</code> role facet sequence. */
    public static final String PATH_FACETS_PREEXISTENCIASC = "";
    /** <code>PreexistenciasC</code> role target class. */
    public static final String ROLE_TARGET_PREEXISTENCIASC = PreexistenciaCConstants.CLASS_NAME;
    /** Agents allowed to navigate through PreexistenciasC **/
    public static final String PREEXISTENCIASC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (MarcasMedicasC)
    /** <code>MarcasMedicasC</code> role id. */
    public static final String ROLE_ID_MARCASMEDICASC = "Agr_1437649993728178_Alias";
    /** <code>MarcasMedicasC</code> role name. */
    public static final String ROLE_NAME_MARCASMEDICASC = "marcasMedicasC";
    /** <code>PersonaC</code> role alias. */
    public static final String ROLE_ALIAS_MARCASMEDICASC = "MarcasMedicasC";


    /** <code>MarcasMedicasC</code> inverse role name. */
    public static final String ROLE_INVNAME_MARCASMEDICASC = MarcaMedicaCConstants.ROLE_NAME_PERSONAC;
    /** <code>MarcasMedicasC</code> role facet sequence. */
    public static final String PATH_FACETS_MARCASMEDICASC = "";
    /** <code>MarcasMedicasC</code> role target class. */
    public static final String ROLE_TARGET_MARCASMEDICASC = MarcaMedicaCConstants.CLASS_NAME;
    /** Agents allowed to navigate through MarcasMedicasC **/
    public static final String MARCASMEDICASC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1432201068544519Ser_26_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCcrearpagrTipoInstitucionC</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACCREARPAGRTIPOINSTITUCIONC = "p_agrTipoInstitucionC";
    /** <code>personaCcrearpagrTipoInstitucionC</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACCREARPAGRTIPOINSTITUCIONC = "Clas_1432201068544519Ser_26Arg_5_Alias";
    /** <code>personaCcrearpagrTipoInstitucionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACCREARPAGRTIPOINSTITUCIONC = "Tipo institución";
    /** <code>personaCcrearpagrTipoEntidadC</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACCREARPAGRTIPOENTIDADC = "p_agrTipoEntidadC";
    /** <code>personaCcrearpagrTipoEntidadC</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACCREARPAGRTIPOENTIDADC = "Clas_1432201068544519Ser_26Arg_6_Alias";
    /** <code>personaCcrearpagrTipoEntidadC</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACCREARPAGRTIPOENTIDADC = "Tipo entidad";
    /** <code>personaCcrearpagrEstadoCivilC</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACCREARPAGRESTADOCIVILC = "p_agrEstadoCivilC";
    /** <code>personaCcrearpagrEstadoCivilC</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACCREARPAGRESTADOCIVILC = "Clas_1432201068544519Ser_26Arg_41_Alias";
    /** <code>personaCcrearpagrEstadoCivilC</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACCREARPAGRESTADOCIVILC = "Estado civil";
    /** <code>personaCcrearpagrEstadoPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACCREARPAGRESTADOPERSONAC = "p_agrEstadoPersonaC";
    /** <code>personaCcrearpagrEstadoPersonaC</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACCREARPAGRESTADOPERSONAC = "Clas_1432201068544519Ser_26Arg_42_Alias";
    /** <code>personaCcrearpagrEstadoPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACCREARPAGRESTADOPERSONAC = "Estado";
    /** <code>personaCcrearpagrTipoIdentificacionC</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACCREARPAGRTIPOIDENTIFICACIONC = "p_agrTipoIdentificacionC";
    /** <code>personaCcrearpagrTipoIdentificacionC</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACCREARPAGRTIPOIDENTIFICACIONC = "Clas_1432201068544519Ser_26Arg_43_Alias";
    /** <code>personaCcrearpagrTipoIdentificacionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACCREARPAGRTIPOIDENTIFICACIONC = "Tipo identificación";
    /** <code>personaCcrearpagrMunicipioCNac</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACCREARPAGRMUNICIPIOCNAC = "p_agrMunicipioCNac";
    /** <code>personaCcrearpagrMunicipioCNac</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACCREARPAGRMUNICIPIOCNAC = "Clas_1432201068544519Ser_26Arg_44_Alias";
    /** <code>personaCcrearpagrMunicipioCNac</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACCREARPAGRMUNICIPIOCNAC = "Municipio";
    /** <code>personaCcrearpagrDepartamentoCNac</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACCREARPAGRDEPARTAMENTOCNAC = "p_agrDepartamentoCNac";
    /** <code>personaCcrearpagrDepartamentoCNac</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACCREARPAGRDEPARTAMENTOCNAC = "Clas_1432201068544519Ser_26Arg_45_Alias";
    /** <code>personaCcrearpagrDepartamentoCNac</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACCREARPAGRDEPARTAMENTOCNAC = "Departamento nacimiento";
    /** <code>personaCcrearpagrContratosC</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACCREARPAGRCONTRATOSC = "p_agrContratosC";
    /** <code>personaCcrearpagrContratosC</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACCREARPAGRCONTRATOSC = "Clas_1432201068544519Ser_26Arg_46_Alias";
    /** <code>personaCcrearpagrContratosC</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACCREARPAGRCONTRATOSC = "Contratos";
    /** <code>personaCcrearpagrFamiliasC</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACCREARPAGRFAMILIASC = "p_agrFamiliasC";
    /** <code>personaCcrearpagrFamiliasC</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACCREARPAGRFAMILIASC = "Clas_1432201068544519Ser_26Arg_47_Alias";
    /** <code>personaCcrearpagrFamiliasC</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACCREARPAGRFAMILIASC = "Familias";
    /** <code>personaCcrearpagrBeneficiariosC</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACCREARPAGRBENEFICIARIOSC = "p_agrBeneficiariosC";
    /** <code>personaCcrearpagrBeneficiariosC</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACCREARPAGRBENEFICIARIOSC = "Clas_1432201068544519Ser_26Arg_48_Alias";
    /** <code>personaCcrearpagrBeneficiariosC</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACCREARPAGRBENEFICIARIOSC = "Beneficiarios";
    /** <code>personaCcrearpatrNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACCREARPATRNUMIDENTIFICACION = "p_atrNumIdentificacion";
    /** <code>personaCcrearpatrNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACCREARPATRNUMIDENTIFICACION = "Clas_1432201068544519Ser_26Arg_8_Alias";
    /** <code>personaCcrearpatrNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACCREARPATRNUMIDENTIFICACION = "Nº Identificación";
    /** <code>personaCcrearpatrMail</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACCREARPATRMAIL = "p_atrMail";
    /** <code>personaCcrearpatrMail</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACCREARPATRMAIL = "Clas_1432201068544519Ser_26Arg_11_Alias";
    /** <code>personaCcrearpatrMail</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACCREARPATRMAIL = "Email";
    /** <code>personaCcrearpatrPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACCREARPATRPRIMERNOMBRE = "p_atrPrimerNombre";
    /** <code>personaCcrearpatrPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACCREARPATRPRIMERNOMBRE = "Clas_1432201068544519Ser_26Arg_12_Alias";
    /** <code>personaCcrearpatrPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACCREARPATRPRIMERNOMBRE = "Primer nombre";
    /** <code>personaCcrearpatrSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACCREARPATRSEGUNDONOMBRE = "p_atrSegundoNombre";
    /** <code>personaCcrearpatrSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACCREARPATRSEGUNDONOMBRE = "Clas_1432201068544519Ser_26Arg_13_Alias";
    /** <code>personaCcrearpatrSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACCREARPATRSEGUNDONOMBRE = "Segundo Nombre";
    /** <code>personaCcrearpatrPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACCREARPATRPRIMERAPELLIDO = "p_atrPrimerApellido";
    /** <code>personaCcrearpatrPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACCREARPATRPRIMERAPELLIDO = "Clas_1432201068544519Ser_26Arg_14_Alias";
    /** <code>personaCcrearpatrPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACCREARPATRPRIMERAPELLIDO = "Primer apellido";
    /** <code>personaCcrearpatrSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACCREARPATRSEGUNDOAPELLIDO = "p_atrSegundoApellido";
    /** <code>personaCcrearpatrSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACCREARPATRSEGUNDOAPELLIDO = "Clas_1432201068544519Ser_26Arg_15_Alias";
    /** <code>personaCcrearpatrSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACCREARPATRSEGUNDOAPELLIDO = "Segundo apellido";
    /** <code>personaCcrearpatrFechaNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACCREARPATRFECHANACIMIENTO = "p_atrFechaNacimiento";
    /** <code>personaCcrearpatrFechaNacimiento</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACCREARPATRFECHANACIMIENTO = "Clas_1432201068544519Ser_26Arg_16_Alias";
    /** <code>personaCcrearpatrFechaNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACCREARPATRFECHANACIMIENTO = "Fecha nacimiento";
    /** <code>personaCcrearpatrGenero</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACCREARPATRGENERO = "p_atrGenero";
    /** <code>personaCcrearpatrGenero</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACCREARPATRGENERO = "Clas_1432201068544519Ser_26Arg_17_Alias";
    /** <code>personaCcrearpatrGenero</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACCREARPATRGENERO = "Género";
    /** <code>personaCcrearpatrIndicadorExtranjero</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACCREARPATRINDICADOREXTRANJERO = "p_atrIndicadorExtranjero";
    /** <code>personaCcrearpatrIndicadorExtranjero</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACCREARPATRINDICADOREXTRANJERO = "Clas_1432201068544519Ser_26Arg_20_Alias";
    /** <code>personaCcrearpatrIndicadorExtranjero</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACCREARPATRINDICADOREXTRANJERO = "Indicador extranjero";
    /** <code>personaCcrearpatrRazonSocial</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACCREARPATRRAZONSOCIAL = "p_atrRazonSocial";
    /** <code>personaCcrearpatrRazonSocial</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACCREARPATRRAZONSOCIAL = "Clas_1432201068544519Ser_26Arg_23_Alias";
    /** <code>personaCcrearpatrRazonSocial</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACCREARPATRRAZONSOCIAL = "Razón Social";
    /** <code>personaCcrearpatrTieneEPSSanitas</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACCREARPATRTIENEEPSSANITAS = "p_atrTieneEPSSanitas";
    /** <code>personaCcrearpatrTieneEPSSanitas</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACCREARPATRTIENEEPSSANITAS = "Clas_1432201068544519Ser_26Arg_28_Alias";
    /** <code>personaCcrearpatrTieneEPSSanitas</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACCREARPATRTIENEEPSSANITAS = "Tiene EPS Sanitas";
    /** <code>personaCcrearpatrRechazadoAfiliacion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACCREARPATRRECHAZADOAFILIACION = "p_atrRechazadoAfiliacion";
    /** <code>personaCcrearpatrRechazadoAfiliacion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACCREARPATRRECHAZADOAFILIACION = "Clas_1432201068544519Ser_26Arg_29_Alias";
    /** <code>personaCcrearpatrRechazadoAfiliacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACCREARPATRRECHAZADOAFILIACION = "Rechazado afiliación";
    /** <code>personaCcrearpatrNombreCompleto</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACCREARPATRNOMBRECOMPLETO = "p_atrNombreCompleto";
    /** <code>personaCcrearpatrNombreCompleto</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACCREARPATRNOMBRECOMPLETO = "Clas_1432201068544519Ser_26Arg_34_Alias";
    /** <code>personaCcrearpatrNombreCompleto</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACCREARPATRNOMBRECOMPLETO = "Nombre Completo";
    /** <code>personaCcrearpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACCREARPATRCODIGO = "p_atrCodigo";
    /** <code>personaCcrearpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACCREARPATRCODIGO = "Clas_1432201068544519Ser_26Arg_39_Alias";
    /** <code>personaCcrearpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACCREARPATRCODIGO = "Código";
    /** <code>personaCcrearpatrUltimaActualizacion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PERSONACCREARPATRULTIMAACTUALIZACION = "p_atrUltimaActualizacion";
    /** <code>personaCcrearpatrUltimaActualizacion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PERSONACCREARPATRULTIMAACTUALIZACION = "Clas_1432201068544519Ser_26Arg_40_Alias";
    /** <code>personaCcrearpatrUltimaActualizacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PERSONACCREARPATRULTIMAACTUALIZACION = "Ultima Actualización";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1432201068544519Ser_27_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCeliminarpthisPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_PERSONACELIMINARPTHISPERSONAC = "p_thisPersonaC";
    /** <code>personaCeliminarpthisPersonaC</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_PERSONACELIMINARPTHISPERSONAC = "Clas_1432201068544519Ser_27Arg_1_Alias";
    /** <code>personaCeliminarpthisPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_PERSONACELIMINARPTHISPERSONAC = "Persona";
    // Service (InsTipoInstitucionCPersonaC)
    /** <code>InsTipoInstitucionCPersonaC</code> service id. */
    public static final String SERV_ID_INSTIPOINSTITUCIONCPERSONAC = "Clas_1432201068544519Ser_35_Alias";
    /** <code>InsTipoInstitucionCPersonaC</code> service name. */
    public static final String SERV_NAME_INSTIPOINSTITUCIONCPERSONAC = "InsTipoInstitucionCPersonaC";
    /** <code>InsTipoInstitucionCPersonaC</code> service alias. */
    public static final String SERV_ALIAS_INSTIPOINSTITUCIONCPERSONAC = "InsTipoInstitucionCPersonaC";
    /** Agents allowed to execute the service InsTipoInstitucionCPersonaC **/
    public static final String INSTIPOINSTITUCIONCPERSONAC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCInsTipoInstitucionCPersonaCpthisPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPOINSTITUCIONCPERSONAC_PERSONACINSTIPOINSTITUCIONCPERSONACPTHISPERSONAC = "p_thisPersonaC";
    /** <code>personaCInsTipoInstitucionCPersonaCpthisPersonaC</code> inbound argument id. */
    public static final String ARG_ID_INSTIPOINSTITUCIONCPERSONAC_PERSONACINSTIPOINSTITUCIONCPERSONACPTHISPERSONAC = "Clas_1432201068544519Ser_35Arg_1_Alias";
    /** <code>personaCInsTipoInstitucionCPersonaCpthisPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPOINSTITUCIONCPERSONAC_PERSONACINSTIPOINSTITUCIONCPERSONACPTHISPERSONAC = "Personas";
    /** <code>personaCInsTipoInstitucionCPersonaCpevcTipoInstitucionC</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPOINSTITUCIONCPERSONAC_PERSONACINSTIPOINSTITUCIONCPERSONACPEVCTIPOINSTITUCIONC = "p_evcTipoInstitucionC";
    /** <code>personaCInsTipoInstitucionCPersonaCpevcTipoInstitucionC</code> inbound argument id. */
    public static final String ARG_ID_INSTIPOINSTITUCIONCPERSONAC_PERSONACINSTIPOINSTITUCIONCPERSONACPEVCTIPOINSTITUCIONC = "Clas_1432201068544519Ser_35Arg_2_Alias";
    /** <code>personaCInsTipoInstitucionCPersonaCpevcTipoInstitucionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPOINSTITUCIONCPERSONAC_PERSONACINSTIPOINSTITUCIONCPERSONACPEVCTIPOINSTITUCIONC = "Tipo institución";
    // Service (DelTipoInstitucionCPersonaC)
    /** <code>DelTipoInstitucionCPersonaC</code> service id. */
    public static final String SERV_ID_DELTIPOINSTITUCIONCPERSONAC = "Clas_1432201068544519Ser_36_Alias";
    /** <code>DelTipoInstitucionCPersonaC</code> service name. */
    public static final String SERV_NAME_DELTIPOINSTITUCIONCPERSONAC = "DelTipoInstitucionCPersonaC";
    /** <code>DelTipoInstitucionCPersonaC</code> service alias. */
    public static final String SERV_ALIAS_DELTIPOINSTITUCIONCPERSONAC = "DelTipoInstitucionCPersonaC";
    /** Agents allowed to execute the service DelTipoInstitucionCPersonaC **/
    public static final String DELTIPOINSTITUCIONCPERSONAC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCDelTipoInstitucionCPersonaCpthisPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPOINSTITUCIONCPERSONAC_PERSONACDELTIPOINSTITUCIONCPERSONACPTHISPERSONAC = "p_thisPersonaC";
    /** <code>personaCDelTipoInstitucionCPersonaCpthisPersonaC</code> inbound argument id. */
    public static final String ARG_ID_DELTIPOINSTITUCIONCPERSONAC_PERSONACDELTIPOINSTITUCIONCPERSONACPTHISPERSONAC = "Clas_1432201068544519Ser_36Arg_1_Alias";
    /** <code>personaCDelTipoInstitucionCPersonaCpthisPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPOINSTITUCIONCPERSONAC_PERSONACDELTIPOINSTITUCIONCPERSONACPTHISPERSONAC = "Personas";
    /** <code>personaCDelTipoInstitucionCPersonaCpevcTipoInstitucionC</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPOINSTITUCIONCPERSONAC_PERSONACDELTIPOINSTITUCIONCPERSONACPEVCTIPOINSTITUCIONC = "p_evcTipoInstitucionC";
    /** <code>personaCDelTipoInstitucionCPersonaCpevcTipoInstitucionC</code> inbound argument id. */
    public static final String ARG_ID_DELTIPOINSTITUCIONCPERSONAC_PERSONACDELTIPOINSTITUCIONCPERSONACPEVCTIPOINSTITUCIONC = "Clas_1432201068544519Ser_36Arg_2_Alias";
    /** <code>personaCDelTipoInstitucionCPersonaCpevcTipoInstitucionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPOINSTITUCIONCPERSONAC_PERSONACDELTIPOINSTITUCIONCPERSONACPEVCTIPOINSTITUCIONC = "Tipo institución";
    // Service (InsTipoEntidadCPersonaC)
    /** <code>InsTipoEntidadCPersonaC</code> service id. */
    public static final String SERV_ID_INSTIPOENTIDADCPERSONAC = "Clas_1432201068544519Ser_37_Alias";
    /** <code>InsTipoEntidadCPersonaC</code> service name. */
    public static final String SERV_NAME_INSTIPOENTIDADCPERSONAC = "InsTipoEntidadCPersonaC";
    /** <code>InsTipoEntidadCPersonaC</code> service alias. */
    public static final String SERV_ALIAS_INSTIPOENTIDADCPERSONAC = "InsTipoEntidadCPersonaC";
    /** Agents allowed to execute the service InsTipoEntidadCPersonaC **/
    public static final String INSTIPOENTIDADCPERSONAC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCInsTipoEntidadCPersonaCpthisPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPOENTIDADCPERSONAC_PERSONACINSTIPOENTIDADCPERSONACPTHISPERSONAC = "p_thisPersonaC";
    /** <code>personaCInsTipoEntidadCPersonaCpthisPersonaC</code> inbound argument id. */
    public static final String ARG_ID_INSTIPOENTIDADCPERSONAC_PERSONACINSTIPOENTIDADCPERSONACPTHISPERSONAC = "Clas_1432201068544519Ser_37Arg_1_Alias";
    /** <code>personaCInsTipoEntidadCPersonaCpthisPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPOENTIDADCPERSONAC_PERSONACINSTIPOENTIDADCPERSONACPTHISPERSONAC = "Personas";
    /** <code>personaCInsTipoEntidadCPersonaCpevcTipoEntidadC</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPOENTIDADCPERSONAC_PERSONACINSTIPOENTIDADCPERSONACPEVCTIPOENTIDADC = "p_evcTipoEntidadC";
    /** <code>personaCInsTipoEntidadCPersonaCpevcTipoEntidadC</code> inbound argument id. */
    public static final String ARG_ID_INSTIPOENTIDADCPERSONAC_PERSONACINSTIPOENTIDADCPERSONACPEVCTIPOENTIDADC = "Clas_1432201068544519Ser_37Arg_2_Alias";
    /** <code>personaCInsTipoEntidadCPersonaCpevcTipoEntidadC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPOENTIDADCPERSONAC_PERSONACINSTIPOENTIDADCPERSONACPEVCTIPOENTIDADC = "Tipo entidad";
    // Service (DelTipoEntidadCPersonaC)
    /** <code>DelTipoEntidadCPersonaC</code> service id. */
    public static final String SERV_ID_DELTIPOENTIDADCPERSONAC = "Clas_1432201068544519Ser_38_Alias";
    /** <code>DelTipoEntidadCPersonaC</code> service name. */
    public static final String SERV_NAME_DELTIPOENTIDADCPERSONAC = "DelTipoEntidadCPersonaC";
    /** <code>DelTipoEntidadCPersonaC</code> service alias. */
    public static final String SERV_ALIAS_DELTIPOENTIDADCPERSONAC = "DelTipoEntidadCPersonaC";
    /** Agents allowed to execute the service DelTipoEntidadCPersonaC **/
    public static final String DELTIPOENTIDADCPERSONAC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCDelTipoEntidadCPersonaCpthisPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPOENTIDADCPERSONAC_PERSONACDELTIPOENTIDADCPERSONACPTHISPERSONAC = "p_thisPersonaC";
    /** <code>personaCDelTipoEntidadCPersonaCpthisPersonaC</code> inbound argument id. */
    public static final String ARG_ID_DELTIPOENTIDADCPERSONAC_PERSONACDELTIPOENTIDADCPERSONACPTHISPERSONAC = "Clas_1432201068544519Ser_38Arg_1_Alias";
    /** <code>personaCDelTipoEntidadCPersonaCpthisPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPOENTIDADCPERSONAC_PERSONACDELTIPOENTIDADCPERSONACPTHISPERSONAC = "Personas";
    /** <code>personaCDelTipoEntidadCPersonaCpevcTipoEntidadC</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPOENTIDADCPERSONAC_PERSONACDELTIPOENTIDADCPERSONACPEVCTIPOENTIDADC = "p_evcTipoEntidadC";
    /** <code>personaCDelTipoEntidadCPersonaCpevcTipoEntidadC</code> inbound argument id. */
    public static final String ARG_ID_DELTIPOENTIDADCPERSONAC_PERSONACDELTIPOENTIDADCPERSONACPEVCTIPOENTIDADC = "Clas_1432201068544519Ser_38Arg_2_Alias";
    /** <code>personaCDelTipoEntidadCPersonaCpevcTipoEntidadC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPOENTIDADCPERSONAC_PERSONACDELTIPOENTIDADCPERSONACPEVCTIPOENTIDADC = "Tipo entidad";
    // Service (InsPersonaCTitular)
    /** <code>InsPersonaCTitular</code> service id. */
    public static final String SERV_ID_INSPERSONACTITULAR = "Clas_1432201068544519Ser_42_Alias";
    /** <code>InsPersonaCTitular</code> service name. */
    public static final String SERV_NAME_INSPERSONACTITULAR = "InsPersonaCTitular";
    /** <code>InsPersonaCTitular</code> service alias. */
    public static final String SERV_ALIAS_INSPERSONACTITULAR = "InsPersonaCTitular";
    /** Agents allowed to execute the service InsPersonaCTitular **/
    public static final String INSPERSONACTITULAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCInsPersonaCTitularpthisPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_INSPERSONACTITULAR_PERSONACINSPERSONACTITULARPTHISPERSONAC = "p_thisPersonaC";
    /** <code>personaCInsPersonaCTitularpthisPersonaC</code> inbound argument id. */
    public static final String ARG_ID_INSPERSONACTITULAR_PERSONACINSPERSONACTITULARPTHISPERSONAC = "Clas_1432201068544519Ser_42Arg_1_Alias";
    /** <code>personaCInsPersonaCTitularpthisPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPERSONACTITULAR_PERSONACINSPERSONACTITULARPTHISPERSONAC = "Titular";
    /** <code>personaCInsPersonaCTitularpevcFamiliaC</code> inbound argument name. */
    public static final String ARG_NAME_INSPERSONACTITULAR_PERSONACINSPERSONACTITULARPEVCFAMILIAC = "p_evcFamiliaC";
    /** <code>personaCInsPersonaCTitularpevcFamiliaC</code> inbound argument id. */
    public static final String ARG_ID_INSPERSONACTITULAR_PERSONACINSPERSONACTITULARPEVCFAMILIAC = "Clas_1432201068544519Ser_42Arg_2_Alias";
    /** <code>personaCInsPersonaCTitularpevcFamiliaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPERSONACTITULAR_PERSONACINSPERSONACTITULARPEVCFAMILIAC = "Familias";
    // Service (actualizarCodigo)
    /** <code>actualizarCodigo</code> service id. */
    public static final String SERV_ID_ACTUALIZARCODIGO = "Clas_1432201068544519Ser_52_Alias";
    /** <code>actualizarCodigo</code> service name. */
    public static final String SERV_NAME_ACTUALIZARCODIGO = "actualizarCodigo";
    /** <code>actualizarCodigo</code> service alias. */
    public static final String SERV_ALIAS_ACTUALIZARCODIGO = "Actualizar el código tras crearla en el CORE desde AE";
    /** Agents allowed to execute the service actualizarCodigo **/
    public static final String ACTUALIZARCODIGO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCactualizarCodigopthisPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_ACTUALIZARCODIGO_PERSONACACTUALIZARCODIGOPTHISPERSONAC = "p_thisPersonaC";
    /** <code>personaCactualizarCodigopthisPersonaC</code> inbound argument id. */
    public static final String ARG_ID_ACTUALIZARCODIGO_PERSONACACTUALIZARCODIGOPTHISPERSONAC = "Clas_1432201068544519Ser_52Arg_1_Alias";
    /** <code>personaCactualizarCodigopthisPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_ACTUALIZARCODIGO_PERSONACACTUALIZARCODIGOPTHISPERSONAC = "Persona";
    /** <code>personaCactualizarCodigopCodigo</code> inbound argument name. */
    public static final String ARG_NAME_ACTUALIZARCODIGO_PERSONACACTUALIZARCODIGOPCODIGO = "p_Codigo";
    /** <code>personaCactualizarCodigopCodigo</code> inbound argument id. */
    public static final String ARG_ID_ACTUALIZARCODIGO_PERSONACACTUALIZARCODIGOPCODIGO = "Clas_1432201068544519Ser_52Arg_2_Alias";
    /** <code>personaCactualizarCodigopCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_ACTUALIZARCODIGO_PERSONACACTUALIZARCODIGOPCODIGO = "Código";
    // Service (InsPersonaCContratante)
    /** <code>InsPersonaCContratante</code> service id. */
    public static final String SERV_ID_INSPERSONACCONTRATANTE = "Clas_1432201068544519Ser_53_Alias";
    /** <code>InsPersonaCContratante</code> service name. */
    public static final String SERV_NAME_INSPERSONACCONTRATANTE = "InsPersonaCContratante";
    /** <code>InsPersonaCContratante</code> service alias. */
    public static final String SERV_ALIAS_INSPERSONACCONTRATANTE = "InsPersonaCContratante";
    /** Agents allowed to execute the service InsPersonaCContratante **/
    public static final String INSPERSONACCONTRATANTE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCInsPersonaCContratantepthisPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_INSPERSONACCONTRATANTE_PERSONACINSPERSONACCONTRATANTEPTHISPERSONAC = "p_thisPersonaC";
    /** <code>personaCInsPersonaCContratantepthisPersonaC</code> inbound argument id. */
    public static final String ARG_ID_INSPERSONACCONTRATANTE_PERSONACINSPERSONACCONTRATANTEPTHISPERSONAC = "Clas_1432201068544519Ser_53Arg_1_Alias";
    /** <code>personaCInsPersonaCContratantepthisPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPERSONACCONTRATANTE_PERSONACINSPERSONACCONTRATANTEPTHISPERSONAC = "Contratante";
    /** <code>personaCInsPersonaCContratantepevcContratoC</code> inbound argument name. */
    public static final String ARG_NAME_INSPERSONACCONTRATANTE_PERSONACINSPERSONACCONTRATANTEPEVCCONTRATOC = "p_evcContratoC";
    /** <code>personaCInsPersonaCContratantepevcContratoC</code> inbound argument id. */
    public static final String ARG_ID_INSPERSONACCONTRATANTE_PERSONACINSPERSONACCONTRATANTEPEVCCONTRATOC = "Clas_1432201068544519Ser_53Arg_2_Alias";
    /** <code>personaCInsPersonaCContratantepevcContratoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPERSONACCONTRATANTE_PERSONACINSPERSONACCONTRATANTEPEVCCONTRATOC = "Contratos";
    // Service (DelPersonaCContratante)
    /** <code>DelPersonaCContratante</code> service id. */
    public static final String SERV_ID_DELPERSONACCONTRATANTE = "Clas_1432201068544519Ser_54_Alias";
    /** <code>DelPersonaCContratante</code> service name. */
    public static final String SERV_NAME_DELPERSONACCONTRATANTE = "DelPersonaCContratante";
    /** <code>DelPersonaCContratante</code> service alias. */
    public static final String SERV_ALIAS_DELPERSONACCONTRATANTE = "DelPersonaCContratante";
    /** Agents allowed to execute the service DelPersonaCContratante **/
    public static final String DELPERSONACCONTRATANTE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCDelPersonaCContratantepthisPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_DELPERSONACCONTRATANTE_PERSONACDELPERSONACCONTRATANTEPTHISPERSONAC = "p_thisPersonaC";
    /** <code>personaCDelPersonaCContratantepthisPersonaC</code> inbound argument id. */
    public static final String ARG_ID_DELPERSONACCONTRATANTE_PERSONACDELPERSONACCONTRATANTEPTHISPERSONAC = "Clas_1432201068544519Ser_54Arg_1_Alias";
    /** <code>personaCDelPersonaCContratantepthisPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPERSONACCONTRATANTE_PERSONACDELPERSONACCONTRATANTEPTHISPERSONAC = "Contratante";
    /** <code>personaCDelPersonaCContratantepevcContratoC</code> inbound argument name. */
    public static final String ARG_NAME_DELPERSONACCONTRATANTE_PERSONACDELPERSONACCONTRATANTEPEVCCONTRATOC = "p_evcContratoC";
    /** <code>personaCDelPersonaCContratantepevcContratoC</code> inbound argument id. */
    public static final String ARG_ID_DELPERSONACCONTRATANTE_PERSONACDELPERSONACCONTRATANTEPEVCCONTRATOC = "Clas_1432201068544519Ser_54Arg_2_Alias";
    /** <code>personaCDelPersonaCContratantepevcContratoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPERSONACCONTRATANTE_PERSONACDELPERSONACCONTRATANTEPEVCCONTRATOC = "Contratos";
    // Service (DelPersonaCTitular)
    /** <code>DelPersonaCTitular</code> service id. */
    public static final String SERV_ID_DELPERSONACTITULAR = "Clas_1432201068544519Ser_55_Alias";
    /** <code>DelPersonaCTitular</code> service name. */
    public static final String SERV_NAME_DELPERSONACTITULAR = "DelPersonaCTitular";
    /** <code>DelPersonaCTitular</code> service alias. */
    public static final String SERV_ALIAS_DELPERSONACTITULAR = "DelPersonaCTitular";
    /** Agents allowed to execute the service DelPersonaCTitular **/
    public static final String DELPERSONACTITULAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCDelPersonaCTitularpthisPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_DELPERSONACTITULAR_PERSONACDELPERSONACTITULARPTHISPERSONAC = "p_thisPersonaC";
    /** <code>personaCDelPersonaCTitularpthisPersonaC</code> inbound argument id. */
    public static final String ARG_ID_DELPERSONACTITULAR_PERSONACDELPERSONACTITULARPTHISPERSONAC = "Clas_1432201068544519Ser_55Arg_1_Alias";
    /** <code>personaCDelPersonaCTitularpthisPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPERSONACTITULAR_PERSONACDELPERSONACTITULARPTHISPERSONAC = "Titular";
    /** <code>personaCDelPersonaCTitularpevcFamiliaC</code> inbound argument name. */
    public static final String ARG_NAME_DELPERSONACTITULAR_PERSONACDELPERSONACTITULARPEVCFAMILIAC = "p_evcFamiliaC";
    /** <code>personaCDelPersonaCTitularpevcFamiliaC</code> inbound argument id. */
    public static final String ARG_ID_DELPERSONACTITULAR_PERSONACDELPERSONACTITULARPEVCFAMILIAC = "Clas_1432201068544519Ser_55Arg_2_Alias";
    /** <code>personaCDelPersonaCTitularpevcFamiliaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPERSONACTITULAR_PERSONACDELPERSONACTITULARPEVCFAMILIAC = "Familias";
    // Service (InsEstadoCivilC)
    /** <code>InsEstadoCivilC</code> service id. */
    public static final String SERV_ID_INSESTADOCIVILC = "Clas_1432201068544519Ser_56_Alias";
    /** <code>InsEstadoCivilC</code> service name. */
    public static final String SERV_NAME_INSESTADOCIVILC = "InsEstadoCivilC";
    /** <code>InsEstadoCivilC</code> service alias. */
    public static final String SERV_ALIAS_INSESTADOCIVILC = "InsEstadoCivilC";
    /** Agents allowed to execute the service InsEstadoCivilC **/
    public static final String INSESTADOCIVILC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCInsEstadoCivilCpthisPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOCIVILC_PERSONACINSESTADOCIVILCPTHISPERSONAC = "p_thisPersonaC";
    /** <code>personaCInsEstadoCivilCpthisPersonaC</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOCIVILC_PERSONACINSESTADOCIVILCPTHISPERSONAC = "Clas_1432201068544519Ser_56Arg_1_Alias";
    /** <code>personaCInsEstadoCivilCpthisPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOCIVILC_PERSONACINSESTADOCIVILCPTHISPERSONAC = "Personas";
    /** <code>personaCInsEstadoCivilCpevcEstadoCivil</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOCIVILC_PERSONACINSESTADOCIVILCPEVCESTADOCIVIL = "p_evcEstadoCivil";
    /** <code>personaCInsEstadoCivilCpevcEstadoCivil</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOCIVILC_PERSONACINSESTADOCIVILCPEVCESTADOCIVIL = "Clas_1432201068544519Ser_56Arg_2_Alias";
    /** <code>personaCInsEstadoCivilCpevcEstadoCivil</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOCIVILC_PERSONACINSESTADOCIVILCPEVCESTADOCIVIL = "Estado civil";
    // Service (DelEstadoCivilC)
    /** <code>DelEstadoCivilC</code> service id. */
    public static final String SERV_ID_DELESTADOCIVILC = "Clas_1432201068544519Ser_57_Alias";
    /** <code>DelEstadoCivilC</code> service name. */
    public static final String SERV_NAME_DELESTADOCIVILC = "DelEstadoCivilC";
    /** <code>DelEstadoCivilC</code> service alias. */
    public static final String SERV_ALIAS_DELESTADOCIVILC = "DelEstadoCivilC";
    /** Agents allowed to execute the service DelEstadoCivilC **/
    public static final String DELESTADOCIVILC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCDelEstadoCivilCpthisPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOCIVILC_PERSONACDELESTADOCIVILCPTHISPERSONAC = "p_thisPersonaC";
    /** <code>personaCDelEstadoCivilCpthisPersonaC</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOCIVILC_PERSONACDELESTADOCIVILCPTHISPERSONAC = "Clas_1432201068544519Ser_57Arg_1_Alias";
    /** <code>personaCDelEstadoCivilCpthisPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOCIVILC_PERSONACDELESTADOCIVILCPTHISPERSONAC = "Personas";
    /** <code>personaCDelEstadoCivilCpevcEstadoCivil</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOCIVILC_PERSONACDELESTADOCIVILCPEVCESTADOCIVIL = "p_evcEstadoCivil";
    /** <code>personaCDelEstadoCivilCpevcEstadoCivil</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOCIVILC_PERSONACDELESTADOCIVILCPEVCESTADOCIVIL = "Clas_1432201068544519Ser_57Arg_2_Alias";
    /** <code>personaCDelEstadoCivilCpevcEstadoCivil</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOCIVILC_PERSONACDELESTADOCIVILCPEVCESTADOCIVIL = "Estado civil";
    // Service (InsEstadoPersonaC)
    /** <code>InsEstadoPersonaC</code> service id. */
    public static final String SERV_ID_INSESTADOPERSONAC = "Clas_1432201068544519Ser_58_Alias";
    /** <code>InsEstadoPersonaC</code> service name. */
    public static final String SERV_NAME_INSESTADOPERSONAC = "InsEstadoPersonaC";
    /** <code>InsEstadoPersonaC</code> service alias. */
    public static final String SERV_ALIAS_INSESTADOPERSONAC = "InsEstadoPersonaC";
    /** Agents allowed to execute the service InsEstadoPersonaC **/
    public static final String INSESTADOPERSONAC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCInsEstadoPersonaCpthisPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOPERSONAC_PERSONACINSESTADOPERSONACPTHISPERSONAC = "p_thisPersonaC";
    /** <code>personaCInsEstadoPersonaCpthisPersonaC</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOPERSONAC_PERSONACINSESTADOPERSONACPTHISPERSONAC = "Clas_1432201068544519Ser_58Arg_1_Alias";
    /** <code>personaCInsEstadoPersonaCpthisPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOPERSONAC_PERSONACINSESTADOPERSONACPTHISPERSONAC = "Personas";
    /** <code>personaCInsEstadoPersonaCpevcEstadoPersona</code> inbound argument name. */
    public static final String ARG_NAME_INSESTADOPERSONAC_PERSONACINSESTADOPERSONACPEVCESTADOPERSONA = "p_evcEstadoPersona";
    /** <code>personaCInsEstadoPersonaCpevcEstadoPersona</code> inbound argument id. */
    public static final String ARG_ID_INSESTADOPERSONAC_PERSONACINSESTADOPERSONACPEVCESTADOPERSONA = "Clas_1432201068544519Ser_58Arg_2_Alias";
    /** <code>personaCInsEstadoPersonaCpevcEstadoPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSESTADOPERSONAC_PERSONACINSESTADOPERSONACPEVCESTADOPERSONA = "Estado";
    // Service (DelEstadoPersonaC)
    /** <code>DelEstadoPersonaC</code> service id. */
    public static final String SERV_ID_DELESTADOPERSONAC = "Clas_1432201068544519Ser_59_Alias";
    /** <code>DelEstadoPersonaC</code> service name. */
    public static final String SERV_NAME_DELESTADOPERSONAC = "DelEstadoPersonaC";
    /** <code>DelEstadoPersonaC</code> service alias. */
    public static final String SERV_ALIAS_DELESTADOPERSONAC = "DelEstadoPersonaC";
    /** Agents allowed to execute the service DelEstadoPersonaC **/
    public static final String DELESTADOPERSONAC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCDelEstadoPersonaCpthisPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOPERSONAC_PERSONACDELESTADOPERSONACPTHISPERSONAC = "p_thisPersonaC";
    /** <code>personaCDelEstadoPersonaCpthisPersonaC</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOPERSONAC_PERSONACDELESTADOPERSONACPTHISPERSONAC = "Clas_1432201068544519Ser_59Arg_1_Alias";
    /** <code>personaCDelEstadoPersonaCpthisPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOPERSONAC_PERSONACDELESTADOPERSONACPTHISPERSONAC = "Personas";
    /** <code>personaCDelEstadoPersonaCpevcEstadoPersona</code> inbound argument name. */
    public static final String ARG_NAME_DELESTADOPERSONAC_PERSONACDELESTADOPERSONACPEVCESTADOPERSONA = "p_evcEstadoPersona";
    /** <code>personaCDelEstadoPersonaCpevcEstadoPersona</code> inbound argument id. */
    public static final String ARG_ID_DELESTADOPERSONAC_PERSONACDELESTADOPERSONACPEVCESTADOPERSONA = "Clas_1432201068544519Ser_59Arg_2_Alias";
    /** <code>personaCDelEstadoPersonaCpevcEstadoPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELESTADOPERSONAC_PERSONACDELESTADOPERSONACPEVCESTADOPERSONA = "Estado";
    // Service (CambTipoIdentificacionC)
    /** <code>CambTipoIdentificacionC</code> service id. */
    public static final String SERV_ID_CAMBTIPOIDENTIFICACIONC = "Clas_1432201068544519Ser_60_Alias";
    /** <code>CambTipoIdentificacionC</code> service name. */
    public static final String SERV_NAME_CAMBTIPOIDENTIFICACIONC = "CambTipoIdentificacionC";
    /** <code>CambTipoIdentificacionC</code> service alias. */
    public static final String SERV_ALIAS_CAMBTIPOIDENTIFICACIONC = "CambTipoIdentificacionC";
    /** Agents allowed to execute the service CambTipoIdentificacionC **/
    public static final String CAMBTIPOIDENTIFICACIONC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCCambTipoIdentificacionCpthisPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_CAMBTIPOIDENTIFICACIONC_PERSONACCAMBTIPOIDENTIFICACIONCPTHISPERSONAC = "p_thisPersonaC";
    /** <code>personaCCambTipoIdentificacionCpthisPersonaC</code> inbound argument id. */
    public static final String ARG_ID_CAMBTIPOIDENTIFICACIONC_PERSONACCAMBTIPOIDENTIFICACIONCPTHISPERSONAC = "Clas_1432201068544519Ser_60Arg_1_Alias";
    /** <code>personaCCambTipoIdentificacionCpthisPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBTIPOIDENTIFICACIONC_PERSONACCAMBTIPOIDENTIFICACIONCPTHISPERSONAC = "Personas";
    /** <code>personaCCambTipoIdentificacionCpevcTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_CAMBTIPOIDENTIFICACIONC_PERSONACCAMBTIPOIDENTIFICACIONCPEVCTIPOIDENTIFICACION = "p_evcTipoIdentificacion";
    /** <code>personaCCambTipoIdentificacionCpevcTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_CAMBTIPOIDENTIFICACIONC_PERSONACCAMBTIPOIDENTIFICACIONCPEVCTIPOIDENTIFICACION = "Clas_1432201068544519Ser_60Arg_2_Alias";
    /** <code>personaCCambTipoIdentificacionCpevcTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBTIPOIDENTIFICACIONC_PERSONACCAMBTIPOIDENTIFICACIONCPEVCTIPOIDENTIFICACION = "Tipo identificación";
    // Service (InsMunicipioCNac)
    /** <code>InsMunicipioCNac</code> service id. */
    public static final String SERV_ID_INSMUNICIPIOCNAC = "Clas_1432201068544519Ser_61_Alias";
    /** <code>InsMunicipioCNac</code> service name. */
    public static final String SERV_NAME_INSMUNICIPIOCNAC = "InsMunicipioCNac";
    /** <code>InsMunicipioCNac</code> service alias. */
    public static final String SERV_ALIAS_INSMUNICIPIOCNAC = "InsMunicipioCNac";
    /** Agents allowed to execute the service InsMunicipioCNac **/
    public static final String INSMUNICIPIOCNAC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCInsMunicipioCNacpthisPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIOCNAC_PERSONACINSMUNICIPIOCNACPTHISPERSONAC = "p_thisPersonaC";
    /** <code>personaCInsMunicipioCNacpthisPersonaC</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIOCNAC_PERSONACINSMUNICIPIOCNACPTHISPERSONAC = "Clas_1432201068544519Ser_61Arg_1_Alias";
    /** <code>personaCInsMunicipioCNacpthisPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIOCNAC_PERSONACINSMUNICIPIOCNACPTHISPERSONAC = "Personas";
    /** <code>personaCInsMunicipioCNacpevcMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIOCNAC_PERSONACINSMUNICIPIOCNACPEVCMUNICIPIO = "p_evcMunicipio";
    /** <code>personaCInsMunicipioCNacpevcMunicipio</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIOCNAC_PERSONACINSMUNICIPIOCNACPEVCMUNICIPIO = "Clas_1432201068544519Ser_61Arg_2_Alias";
    /** <code>personaCInsMunicipioCNacpevcMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIOCNAC_PERSONACINSMUNICIPIOCNACPEVCMUNICIPIO = "Municipio";
    // Service (DelMunicipioCNac)
    /** <code>DelMunicipioCNac</code> service id. */
    public static final String SERV_ID_DELMUNICIPIOCNAC = "Clas_1432201068544519Ser_62_Alias";
    /** <code>DelMunicipioCNac</code> service name. */
    public static final String SERV_NAME_DELMUNICIPIOCNAC = "DelMunicipioCNac";
    /** <code>DelMunicipioCNac</code> service alias. */
    public static final String SERV_ALIAS_DELMUNICIPIOCNAC = "DelMunicipioCNac";
    /** Agents allowed to execute the service DelMunicipioCNac **/
    public static final String DELMUNICIPIOCNAC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCDelMunicipioCNacpthisPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIOCNAC_PERSONACDELMUNICIPIOCNACPTHISPERSONAC = "p_thisPersonaC";
    /** <code>personaCDelMunicipioCNacpthisPersonaC</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIOCNAC_PERSONACDELMUNICIPIOCNACPTHISPERSONAC = "Clas_1432201068544519Ser_62Arg_1_Alias";
    /** <code>personaCDelMunicipioCNacpthisPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIOCNAC_PERSONACDELMUNICIPIOCNACPTHISPERSONAC = "Personas";
    /** <code>personaCDelMunicipioCNacpevcMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIOCNAC_PERSONACDELMUNICIPIOCNACPEVCMUNICIPIO = "p_evcMunicipio";
    /** <code>personaCDelMunicipioCNacpevcMunicipio</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIOCNAC_PERSONACDELMUNICIPIOCNACPEVCMUNICIPIO = "Clas_1432201068544519Ser_62Arg_2_Alias";
    /** <code>personaCDelMunicipioCNacpevcMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIOCNAC_PERSONACDELMUNICIPIOCNACPEVCMUNICIPIO = "Municipio";
    // Service (InsDepartamentoCNac)
    /** <code>InsDepartamentoCNac</code> service id. */
    public static final String SERV_ID_INSDEPARTAMENTOCNAC = "Clas_1432201068544519Ser_63_Alias";
    /** <code>InsDepartamentoCNac</code> service name. */
    public static final String SERV_NAME_INSDEPARTAMENTOCNAC = "InsDepartamentoCNac";
    /** <code>InsDepartamentoCNac</code> service alias. */
    public static final String SERV_ALIAS_INSDEPARTAMENTOCNAC = "InsDepartamentoCNac";
    /** Agents allowed to execute the service InsDepartamentoCNac **/
    public static final String INSDEPARTAMENTOCNAC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCInsDepartamentoCNacpthisPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_INSDEPARTAMENTOCNAC_PERSONACINSDEPARTAMENTOCNACPTHISPERSONAC = "p_thisPersonaC";
    /** <code>personaCInsDepartamentoCNacpthisPersonaC</code> inbound argument id. */
    public static final String ARG_ID_INSDEPARTAMENTOCNAC_PERSONACINSDEPARTAMENTOCNACPTHISPERSONAC = "Clas_1432201068544519Ser_63Arg_1_Alias";
    /** <code>personaCInsDepartamentoCNacpthisPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDEPARTAMENTOCNAC_PERSONACINSDEPARTAMENTOCNACPTHISPERSONAC = "Personas";
    /** <code>personaCInsDepartamentoCNacpevcDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_INSDEPARTAMENTOCNAC_PERSONACINSDEPARTAMENTOCNACPEVCDEPARTAMENTO = "p_evcDepartamento";
    /** <code>personaCInsDepartamentoCNacpevcDepartamento</code> inbound argument id. */
    public static final String ARG_ID_INSDEPARTAMENTOCNAC_PERSONACINSDEPARTAMENTOCNACPEVCDEPARTAMENTO = "Clas_1432201068544519Ser_63Arg_2_Alias";
    /** <code>personaCInsDepartamentoCNacpevcDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDEPARTAMENTOCNAC_PERSONACINSDEPARTAMENTOCNACPEVCDEPARTAMENTO = "Departamento nacimiento";
    // Service (DelDepartamentoCNac)
    /** <code>DelDepartamentoCNac</code> service id. */
    public static final String SERV_ID_DELDEPARTAMENTOCNAC = "Clas_1432201068544519Ser_64_Alias";
    /** <code>DelDepartamentoCNac</code> service name. */
    public static final String SERV_NAME_DELDEPARTAMENTOCNAC = "DelDepartamentoCNac";
    /** <code>DelDepartamentoCNac</code> service alias. */
    public static final String SERV_ALIAS_DELDEPARTAMENTOCNAC = "DelDepartamentoCNac";
    /** Agents allowed to execute the service DelDepartamentoCNac **/
    public static final String DELDEPARTAMENTOCNAC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCDelDepartamentoCNacpthisPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_DELDEPARTAMENTOCNAC_PERSONACDELDEPARTAMENTOCNACPTHISPERSONAC = "p_thisPersonaC";
    /** <code>personaCDelDepartamentoCNacpthisPersonaC</code> inbound argument id. */
    public static final String ARG_ID_DELDEPARTAMENTOCNAC_PERSONACDELDEPARTAMENTOCNACPTHISPERSONAC = "Clas_1432201068544519Ser_64Arg_1_Alias";
    /** <code>personaCDelDepartamentoCNacpthisPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDEPARTAMENTOCNAC_PERSONACDELDEPARTAMENTOCNACPTHISPERSONAC = "Personas";
    /** <code>personaCDelDepartamentoCNacpevcDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_DELDEPARTAMENTOCNAC_PERSONACDELDEPARTAMENTOCNACPEVCDEPARTAMENTO = "p_evcDepartamento";
    /** <code>personaCDelDepartamentoCNacpevcDepartamento</code> inbound argument id. */
    public static final String ARG_ID_DELDEPARTAMENTOCNAC_PERSONACDELDEPARTAMENTOCNACPEVCDEPARTAMENTO = "Clas_1432201068544519Ser_64Arg_2_Alias";
    /** <code>personaCDelDepartamentoCNacpevcDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDEPARTAMENTOCNAC_PERSONACDELDEPARTAMENTOCNACPEVCDEPARTAMENTO = "Departamento nacimiento";
    // Service (InsBeneficiariosC)
    /** <code>InsBeneficiariosC</code> service id. */
    public static final String SERV_ID_INSBENEFICIARIOSC = "Clas_1432201068544519Ser_68_Alias";
    /** <code>InsBeneficiariosC</code> service name. */
    public static final String SERV_NAME_INSBENEFICIARIOSC = "InsBeneficiariosC";
    /** <code>InsBeneficiariosC</code> service alias. */
    public static final String SERV_ALIAS_INSBENEFICIARIOSC = "InsBeneficiariosC";
    /** Agents allowed to execute the service InsBeneficiariosC **/
    public static final String INSBENEFICIARIOSC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCInsBeneficiariosCpthisPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_INSBENEFICIARIOSC_PERSONACINSBENEFICIARIOSCPTHISPERSONAC = "p_thisPersonaC";
    /** <code>personaCInsBeneficiariosCpthisPersonaC</code> inbound argument id. */
    public static final String ARG_ID_INSBENEFICIARIOSC_PERSONACINSBENEFICIARIOSCPTHISPERSONAC = "Clas_1432201068544519Ser_68Arg_1_Alias";
    /** <code>personaCInsBeneficiariosCpthisPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSBENEFICIARIOSC_PERSONACINSBENEFICIARIOSCPTHISPERSONAC = "Persona";
    /** <code>personaCInsBeneficiariosCpevcBeneficiarioC</code> inbound argument name. */
    public static final String ARG_NAME_INSBENEFICIARIOSC_PERSONACINSBENEFICIARIOSCPEVCBENEFICIARIOC = "p_evcBeneficiarioC";
    /** <code>personaCInsBeneficiariosCpevcBeneficiarioC</code> inbound argument id. */
    public static final String ARG_ID_INSBENEFICIARIOSC_PERSONACINSBENEFICIARIOSCPEVCBENEFICIARIOC = "Clas_1432201068544519Ser_68Arg_2_Alias";
    /** <code>personaCInsBeneficiariosCpevcBeneficiarioC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSBENEFICIARIOSC_PERSONACINSBENEFICIARIOSCPEVCBENEFICIARIOC = "Beneficiarios";
    // Service (DelBeneficiariosC)
    /** <code>DelBeneficiariosC</code> service id. */
    public static final String SERV_ID_DELBENEFICIARIOSC = "Clas_1432201068544519Ser_69_Alias";
    /** <code>DelBeneficiariosC</code> service name. */
    public static final String SERV_NAME_DELBENEFICIARIOSC = "DelBeneficiariosC";
    /** <code>DelBeneficiariosC</code> service alias. */
    public static final String SERV_ALIAS_DELBENEFICIARIOSC = "DelBeneficiariosC";
    /** Agents allowed to execute the service DelBeneficiariosC **/
    public static final String DELBENEFICIARIOSC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCDelBeneficiariosCpthisPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_DELBENEFICIARIOSC_PERSONACDELBENEFICIARIOSCPTHISPERSONAC = "p_thisPersonaC";
    /** <code>personaCDelBeneficiariosCpthisPersonaC</code> inbound argument id. */
    public static final String ARG_ID_DELBENEFICIARIOSC_PERSONACDELBENEFICIARIOSCPTHISPERSONAC = "Clas_1432201068544519Ser_69Arg_1_Alias";
    /** <code>personaCDelBeneficiariosCpthisPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELBENEFICIARIOSC_PERSONACDELBENEFICIARIOSCPTHISPERSONAC = "Persona";
    /** <code>personaCDelBeneficiariosCpevcBeneficiarioC</code> inbound argument name. */
    public static final String ARG_NAME_DELBENEFICIARIOSC_PERSONACDELBENEFICIARIOSCPEVCBENEFICIARIOC = "p_evcBeneficiarioC";
    /** <code>personaCDelBeneficiariosCpevcBeneficiarioC</code> inbound argument id. */
    public static final String ARG_ID_DELBENEFICIARIOSC_PERSONACDELBENEFICIARIOSCPEVCBENEFICIARIOC = "Clas_1432201068544519Ser_69Arg_2_Alias";
    /** <code>personaCDelBeneficiariosCpevcBeneficiarioC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELBENEFICIARIOSC_PERSONACDELBENEFICIARIOSCPEVCBENEFICIARIOC = "Beneficiarios";
    // Service (evalPostNotificar)
    /** <code>evalPostNotificar</code> service id. */
    public static final String SERV_ID_EVALPOSTNOTIFICAR = "Clas_1432201068544519Ser_73_Alias";
    /** <code>evalPostNotificar</code> service name. */
    public static final String SERV_NAME_EVALPOSTNOTIFICAR = "evalPostNotificar";
    /** <code>evalPostNotificar</code> service alias. */
    public static final String SERV_ALIAS_EVALPOSTNOTIFICAR = "evalPostNotificar";
    /** Agents allowed to execute the service evalPostNotificar **/
    public static final String EVALPOSTNOTIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCevalPostNotificarpthisPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_EVALPOSTNOTIFICAR_PERSONACEVALPOSTNOTIFICARPTHISPERSONAC = "p_thisPersonaC";
    /** <code>personaCevalPostNotificarpthisPersonaC</code> inbound argument id. */
    public static final String ARG_ID_EVALPOSTNOTIFICAR_PERSONACEVALPOSTNOTIFICARPTHISPERSONAC = "Clas_1432201068544519Ser_73Arg_1_Alias";
    /** <code>personaCevalPostNotificarpthisPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_EVALPOSTNOTIFICAR_PERSONACEVALPOSTNOTIFICARPTHISPERSONAC = "Persona";
    /** <code>personaCevalPostNotificarpeNombreCompleto</code> inbound argument name. */
    public static final String ARG_NAME_EVALPOSTNOTIFICAR_PERSONACEVALPOSTNOTIFICARPENOMBRECOMPLETO = "peNombreCompleto";
    /** <code>personaCevalPostNotificarpeNombreCompleto</code> inbound argument id. */
    public static final String ARG_ID_EVALPOSTNOTIFICAR_PERSONACEVALPOSTNOTIFICARPENOMBRECOMPLETO = "Clas_1432201068544519Ser_73Arg_2_Alias";
    /** <code>personaCevalPostNotificarpeNombreCompleto</code> inbound argument alias. */
    public static final String ARG_ALIAS_EVALPOSTNOTIFICAR_PERSONACEVALPOSTNOTIFICARPENOMBRECOMPLETO = "Nombre Completo";
    /** <code>personaCevalPostNotificarpeNumIdent</code> inbound argument name. */
    public static final String ARG_NAME_EVALPOSTNOTIFICAR_PERSONACEVALPOSTNOTIFICARPENUMIDENT = "peNumIdent";
    /** <code>personaCevalPostNotificarpeNumIdent</code> inbound argument id. */
    public static final String ARG_ID_EVALPOSTNOTIFICAR_PERSONACEVALPOSTNOTIFICARPENUMIDENT = "Clas_1432201068544519Ser_73Arg_3_Alias";
    /** <code>personaCevalPostNotificarpeNumIdent</code> inbound argument alias. */
    public static final String ARG_ALIAS_EVALPOSTNOTIFICAR_PERSONACEVALPOSTNOTIFICARPENUMIDENT = "Nº Identificación";
    // Service (TCREAROCUESDEAE)
    /** <code>TCREAROCUESDEAE</code> service id. */
    public static final String SERV_ID_TCREAROCUESDEAE = "Clas_1432201068544519Ser_45_Alias";
    /** <code>TCREAROCUESDEAE</code> service name. */
    public static final String SERV_NAME_TCREAROCUESDEAE = "TCREAROCUESDEAE";
    /** <code>TCREAROCUESDEAE</code> service alias. */
    public static final String SERV_ALIAS_TCREAROCUESDEAE = "Crear cuestionario de AE";
    /** Agents allowed to execute the service TCREAROCUESDEAE **/
    public static final String TCREAROCUESDEAE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCTCREAROCUESDEAEpthisPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROCUESDEAE_PERSONACTCREAROCUESDEAEPTHISPERSONAC = "p_thisPersonaC";
    /** <code>personaCTCREAROCUESDEAEpthisPersonaC</code> inbound argument id. */
    public static final String ARG_ID_TCREAROCUESDEAE_PERSONACTCREAROCUESDEAEPTHISPERSONAC = "Clas_1432201068544519Ser_45Arg_1_Alias";
    /** <code>personaCTCREAROCUESDEAEpthisPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROCUESDEAE_PERSONACTCREAROCUESDEAEPTHISPERSONAC = "Persona";
    /** <code>personaCTCREAROCUESDEAEpCuestionarioP</code> inbound argument name. */
    public static final String ARG_NAME_TCREAROCUESDEAE_PERSONACTCREAROCUESDEAEPCUESTIONARIOP = "p_CuestionarioP";
    /** <code>personaCTCREAROCUESDEAEpCuestionarioP</code> inbound argument id. */
    public static final String ARG_ID_TCREAROCUESDEAE_PERSONACTCREAROCUESDEAEPCUESTIONARIOP = "Clas_1432201068544519Ser_45Arg_2_Alias";
    /** <code>personaCTCREAROCUESDEAEpCuestionarioP</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAROCUESDEAE_PERSONACTCREAROCUESDEAEPCUESTIONARIOP = "Cuestionario persona";
    // Service (TELIMINAR)
    /** <code>TELIMINAR</code> service id. */
    public static final String SERV_ID_TELIMINAR = "Clas_1432201068544519Ser_49_Alias";
    /** <code>TELIMINAR</code> service name. */
    public static final String SERV_NAME_TELIMINAR = "TELIMINAR";
    /** <code>TELIMINAR</code> service alias. */
    public static final String SERV_ALIAS_TELIMINAR = "Eliminar persona";
    /** Agents allowed to execute the service TELIMINAR **/
    public static final String TELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCTELIMINARpthisPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_TELIMINAR_PERSONACTELIMINARPTHISPERSONAC = "p_thisPersonaC";
    /** <code>personaCTELIMINARpthisPersonaC</code> inbound argument id. */
    public static final String ARG_ID_TELIMINAR_PERSONACTELIMINARPTHISPERSONAC = "Clas_1432201068544519Ser_49Arg_1_Alias";
    /** <code>personaCTELIMINARpthisPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TELIMINAR_PERSONACTELIMINARPTHISPERSONAC = "Persona";
    // Service (TNEWCONTRADESDEAE)
    /** <code>TNEWCONTRADESDEAE</code> service id. */
    public static final String SERV_ID_TNEWCONTRADESDEAE = "Clas_1432201068544519Ser_66_Alias";
    /** <code>TNEWCONTRADESDEAE</code> service name. */
    public static final String SERV_NAME_TNEWCONTRADESDEAE = "TNEWCONTRADESDEAE";
    /** <code>TNEWCONTRADESDEAE</code> service alias. */
    public static final String SERV_ALIAS_TNEWCONTRADESDEAE = "TNEWCONTRADESDEAE";
    /** Agents allowed to execute the service TNEWCONTRADESDEAE **/
    public static final String TNEWCONTRADESDEAE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCTNEWCONTRADESDEAEptSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TNEWCONTRADESDEAE_PERSONACTNEWCONTRADESDEAEPTSOLICITUD = "ptSolicitud";
    /** <code>personaCTNEWCONTRADESDEAEptSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TNEWCONTRADESDEAE_PERSONACTNEWCONTRADESDEAEPTSOLICITUD = "Clas_1432201068544519Ser_66Arg_2_Alias";
    /** <code>personaCTNEWCONTRADESDEAEptSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWCONTRADESDEAE_PERSONACTNEWCONTRADESDEAEPTSOLICITUD = "Solicitud";
    /** <code>personaCTNEWCONTRADESDEAEptContrato</code> inbound argument name. */
    public static final String ARG_NAME_TNEWCONTRADESDEAE_PERSONACTNEWCONTRADESDEAEPTCONTRATO = "ptContrato";
    /** <code>personaCTNEWCONTRADESDEAEptContrato</code> inbound argument id. */
    public static final String ARG_ID_TNEWCONTRADESDEAE_PERSONACTNEWCONTRADESDEAEPTCONTRATO = "Clas_1432201068544519Ser_66Arg_4_Alias";
    /** <code>personaCTNEWCONTRADESDEAEptContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWCONTRADESDEAE_PERSONACTNEWCONTRADESDEAEPTCONTRATO = "Contrato";
    // Service (TNEWTITULARDESDEAE)
    /** <code>TNEWTITULARDESDEAE</code> service id. */
    public static final String SERV_ID_TNEWTITULARDESDEAE = "Clas_1432201068544519Ser_67_Alias";
    /** <code>TNEWTITULARDESDEAE</code> service name. */
    public static final String SERV_NAME_TNEWTITULARDESDEAE = "TNEWTITULARDESDEAE";
    /** <code>TNEWTITULARDESDEAE</code> service alias. */
    public static final String SERV_ALIAS_TNEWTITULARDESDEAE = "TNEWTITULARDESDEAE";
    /** Agents allowed to execute the service TNEWTITULARDESDEAE **/
    public static final String TNEWTITULARDESDEAE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCTNEWTITULARDESDEAEptSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TNEWTITULARDESDEAE_PERSONACTNEWTITULARDESDEAEPTSOLICITUD = "ptSolicitud";
    /** <code>personaCTNEWTITULARDESDEAEptSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TNEWTITULARDESDEAE_PERSONACTNEWTITULARDESDEAEPTSOLICITUD = "Clas_1432201068544519Ser_67Arg_2_Alias";
    /** <code>personaCTNEWTITULARDESDEAEptSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWTITULARDESDEAE_PERSONACTNEWTITULARDESDEAEPTSOLICITUD = "Solicitud";
    /** <code>personaCTNEWTITULARDESDEAEptFamiliaC</code> inbound argument name. */
    public static final String ARG_NAME_TNEWTITULARDESDEAE_PERSONACTNEWTITULARDESDEAEPTFAMILIAC = "ptFamiliaC";
    /** <code>personaCTNEWTITULARDESDEAEptFamiliaC</code> inbound argument id. */
    public static final String ARG_ID_TNEWTITULARDESDEAE_PERSONACTNEWTITULARDESDEAEPTFAMILIAC = "Clas_1432201068544519Ser_67Arg_4_Alias";
    /** <code>personaCTNEWTITULARDESDEAEptFamiliaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWTITULARDESDEAE_PERSONACTNEWTITULARDESDEAEPTFAMILIAC = "Familia";
    // Service (TNEWBENEFDESDEAE)
    /** <code>TNEWBENEFDESDEAE</code> service id. */
    public static final String SERV_ID_TNEWBENEFDESDEAE = "Clas_1432201068544519Ser_70_Alias";
    /** <code>TNEWBENEFDESDEAE</code> service name. */
    public static final String SERV_NAME_TNEWBENEFDESDEAE = "TNEWBENEFDESDEAE";
    /** <code>TNEWBENEFDESDEAE</code> service alias. */
    public static final String SERV_ALIAS_TNEWBENEFDESDEAE = "TNEWBENEFDESDEAE";
    /** Agents allowed to execute the service TNEWBENEFDESDEAE **/
    public static final String TNEWBENEFDESDEAE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCTNEWBENEFDESDEAEptBeneficiario</code> inbound argument name. */
    public static final String ARG_NAME_TNEWBENEFDESDEAE_PERSONACTNEWBENEFDESDEAEPTBENEFICIARIO = "ptBeneficiario";
    /** <code>personaCTNEWBENEFDESDEAEptBeneficiario</code> inbound argument id. */
    public static final String ARG_ID_TNEWBENEFDESDEAE_PERSONACTNEWBENEFDESDEAEPTBENEFICIARIO = "Clas_1432201068544519Ser_70Arg_2_Alias";
    /** <code>personaCTNEWBENEFDESDEAEptBeneficiario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWBENEFDESDEAE_PERSONACTNEWBENEFDESDEAEPTBENEFICIARIO = "Beneficiario";
    /** <code>personaCTNEWBENEFDESDEAEptUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TNEWBENEFDESDEAE_PERSONACTNEWBENEFDESDEAEPTUSUARIO = "ptUsuario";
    /** <code>personaCTNEWBENEFDESDEAEptUsuario</code> inbound argument id. */
    public static final String ARG_ID_TNEWBENEFDESDEAE_PERSONACTNEWBENEFDESDEAEPTUSUARIO = "Clas_1432201068544519Ser_70Arg_5_Alias";
    /** <code>personaCTNEWBENEFDESDEAEptUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWBENEFDESDEAE_PERSONACTNEWBENEFDESDEAEPTUSUARIO = "Usuario";
    // Service (TNEW)
    /** <code>TNEW</code> service id. */
    public static final String SERV_ID_TNEW = "Clas_1432201068544519Ser_71_Alias";
    /** <code>TNEW</code> service name. */
    public static final String SERV_NAME_TNEW = "TNEW";
    /** <code>TNEW</code> service alias. */
    public static final String SERV_ALIAS_TNEW = "TNEW";
    /** Agents allowed to execute the service TNEW **/
    public static final String TNEW_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCTNEWptpagrTipoInstitucionC</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_PERSONACTNEWPTPAGRTIPOINSTITUCIONC = "pt_p_agrTipoInstitucionC";
    /** <code>personaCTNEWptpagrTipoInstitucionC</code> inbound argument id. */
    public static final String ARG_ID_TNEW_PERSONACTNEWPTPAGRTIPOINSTITUCIONC = "Clas_1432201068544519Ser_71Arg_4_Alias";
    /** <code>personaCTNEWptpagrTipoInstitucionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_PERSONACTNEWPTPAGRTIPOINSTITUCIONC = "Tipo institución";
    /** <code>personaCTNEWptpagrTipoEntidadC</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_PERSONACTNEWPTPAGRTIPOENTIDADC = "pt_p_agrTipoEntidadC";
    /** <code>personaCTNEWptpagrTipoEntidadC</code> inbound argument id. */
    public static final String ARG_ID_TNEW_PERSONACTNEWPTPAGRTIPOENTIDADC = "Clas_1432201068544519Ser_71Arg_5_Alias";
    /** <code>personaCTNEWptpagrTipoEntidadC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_PERSONACTNEWPTPAGRTIPOENTIDADC = "Tipo entidad";
    /** <code>personaCTNEWptpagrEstadoCivilC</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_PERSONACTNEWPTPAGRESTADOCIVILC = "pt_p_agrEstadoCivilC";
    /** <code>personaCTNEWptpagrEstadoCivilC</code> inbound argument id. */
    public static final String ARG_ID_TNEW_PERSONACTNEWPTPAGRESTADOCIVILC = "Clas_1432201068544519Ser_71Arg_6_Alias";
    /** <code>personaCTNEWptpagrEstadoCivilC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_PERSONACTNEWPTPAGRESTADOCIVILC = "Estado civil";
    /** <code>personaCTNEWptpagrEstadoPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_PERSONACTNEWPTPAGRESTADOPERSONAC = "pt_p_agrEstadoPersonaC";
    /** <code>personaCTNEWptpagrEstadoPersonaC</code> inbound argument id. */
    public static final String ARG_ID_TNEW_PERSONACTNEWPTPAGRESTADOPERSONAC = "Clas_1432201068544519Ser_71Arg_7_Alias";
    /** <code>personaCTNEWptpagrEstadoPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_PERSONACTNEWPTPAGRESTADOPERSONAC = "Estado";
    /** <code>personaCTNEWptpagrTipoIdentificacionC</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_PERSONACTNEWPTPAGRTIPOIDENTIFICACIONC = "pt_p_agrTipoIdentificacionC";
    /** <code>personaCTNEWptpagrTipoIdentificacionC</code> inbound argument id. */
    public static final String ARG_ID_TNEW_PERSONACTNEWPTPAGRTIPOIDENTIFICACIONC = "Clas_1432201068544519Ser_71Arg_8_Alias";
    /** <code>personaCTNEWptpagrTipoIdentificacionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_PERSONACTNEWPTPAGRTIPOIDENTIFICACIONC = "Tipo identificación";
    /** <code>personaCTNEWptpagrMunicipioCNac</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_PERSONACTNEWPTPAGRMUNICIPIOCNAC = "pt_p_agrMunicipioCNac";
    /** <code>personaCTNEWptpagrMunicipioCNac</code> inbound argument id. */
    public static final String ARG_ID_TNEW_PERSONACTNEWPTPAGRMUNICIPIOCNAC = "Clas_1432201068544519Ser_71Arg_9_Alias";
    /** <code>personaCTNEWptpagrMunicipioCNac</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_PERSONACTNEWPTPAGRMUNICIPIOCNAC = "Municipio";
    /** <code>personaCTNEWptpagrDepartamentoCNac</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_PERSONACTNEWPTPAGRDEPARTAMENTOCNAC = "pt_p_agrDepartamentoCNac";
    /** <code>personaCTNEWptpagrDepartamentoCNac</code> inbound argument id. */
    public static final String ARG_ID_TNEW_PERSONACTNEWPTPAGRDEPARTAMENTOCNAC = "Clas_1432201068544519Ser_71Arg_10_Alias";
    /** <code>personaCTNEWptpagrDepartamentoCNac</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_PERSONACTNEWPTPAGRDEPARTAMENTOCNAC = "Departamento nacimiento";
    /** <code>personaCTNEWptpagrContratosC</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_PERSONACTNEWPTPAGRCONTRATOSC = "pt_p_agrContratosC";
    /** <code>personaCTNEWptpagrContratosC</code> inbound argument id. */
    public static final String ARG_ID_TNEW_PERSONACTNEWPTPAGRCONTRATOSC = "Clas_1432201068544519Ser_71Arg_11_Alias";
    /** <code>personaCTNEWptpagrContratosC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_PERSONACTNEWPTPAGRCONTRATOSC = "Contratos";
    /** <code>personaCTNEWptpagrFamiliasC</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_PERSONACTNEWPTPAGRFAMILIASC = "pt_p_agrFamiliasC";
    /** <code>personaCTNEWptpagrFamiliasC</code> inbound argument id. */
    public static final String ARG_ID_TNEW_PERSONACTNEWPTPAGRFAMILIASC = "Clas_1432201068544519Ser_71Arg_12_Alias";
    /** <code>personaCTNEWptpagrFamiliasC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_PERSONACTNEWPTPAGRFAMILIASC = "Familias";
    /** <code>personaCTNEWptpagrBeneficiariosC</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_PERSONACTNEWPTPAGRBENEFICIARIOSC = "pt_p_agrBeneficiariosC";
    /** <code>personaCTNEWptpagrBeneficiariosC</code> inbound argument id. */
    public static final String ARG_ID_TNEW_PERSONACTNEWPTPAGRBENEFICIARIOSC = "Clas_1432201068544519Ser_71Arg_13_Alias";
    /** <code>personaCTNEWptpagrBeneficiariosC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_PERSONACTNEWPTPAGRBENEFICIARIOSC = "Beneficiarios";
    /** <code>personaCTNEWptpatrNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_PERSONACTNEWPTPATRNUMIDENTIFICACION = "pt_p_atrNumIdentificacion";
    /** <code>personaCTNEWptpatrNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TNEW_PERSONACTNEWPTPATRNUMIDENTIFICACION = "Clas_1432201068544519Ser_71Arg_14_Alias";
    /** <code>personaCTNEWptpatrNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_PERSONACTNEWPTPATRNUMIDENTIFICACION = "Nº Identificación";
    /** <code>personaCTNEWptpatrMail</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_PERSONACTNEWPTPATRMAIL = "pt_p_atrMail";
    /** <code>personaCTNEWptpatrMail</code> inbound argument id. */
    public static final String ARG_ID_TNEW_PERSONACTNEWPTPATRMAIL = "Clas_1432201068544519Ser_71Arg_15_Alias";
    /** <code>personaCTNEWptpatrMail</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_PERSONACTNEWPTPATRMAIL = "Email";
    /** <code>personaCTNEWptpatrPrimerNombre</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_PERSONACTNEWPTPATRPRIMERNOMBRE = "pt_p_atrPrimerNombre";
    /** <code>personaCTNEWptpatrPrimerNombre</code> inbound argument id. */
    public static final String ARG_ID_TNEW_PERSONACTNEWPTPATRPRIMERNOMBRE = "Clas_1432201068544519Ser_71Arg_16_Alias";
    /** <code>personaCTNEWptpatrPrimerNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_PERSONACTNEWPTPATRPRIMERNOMBRE = "Primer nombre";
    /** <code>personaCTNEWptpatrSegundoNombre</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_PERSONACTNEWPTPATRSEGUNDONOMBRE = "pt_p_atrSegundoNombre";
    /** <code>personaCTNEWptpatrSegundoNombre</code> inbound argument id. */
    public static final String ARG_ID_TNEW_PERSONACTNEWPTPATRSEGUNDONOMBRE = "Clas_1432201068544519Ser_71Arg_17_Alias";
    /** <code>personaCTNEWptpatrSegundoNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_PERSONACTNEWPTPATRSEGUNDONOMBRE = "Segundo Nombre";
    /** <code>personaCTNEWptpatrPrimerApellido</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_PERSONACTNEWPTPATRPRIMERAPELLIDO = "pt_p_atrPrimerApellido";
    /** <code>personaCTNEWptpatrPrimerApellido</code> inbound argument id. */
    public static final String ARG_ID_TNEW_PERSONACTNEWPTPATRPRIMERAPELLIDO = "Clas_1432201068544519Ser_71Arg_18_Alias";
    /** <code>personaCTNEWptpatrPrimerApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_PERSONACTNEWPTPATRPRIMERAPELLIDO = "Primer apellido";
    /** <code>personaCTNEWptpatrSegundoApellido</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_PERSONACTNEWPTPATRSEGUNDOAPELLIDO = "pt_p_atrSegundoApellido";
    /** <code>personaCTNEWptpatrSegundoApellido</code> inbound argument id. */
    public static final String ARG_ID_TNEW_PERSONACTNEWPTPATRSEGUNDOAPELLIDO = "Clas_1432201068544519Ser_71Arg_19_Alias";
    /** <code>personaCTNEWptpatrSegundoApellido</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_PERSONACTNEWPTPATRSEGUNDOAPELLIDO = "Segundo apellido";
    /** <code>personaCTNEWptpatrFechaNacimiento</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_PERSONACTNEWPTPATRFECHANACIMIENTO = "pt_p_atrFechaNacimiento";
    /** <code>personaCTNEWptpatrFechaNacimiento</code> inbound argument id. */
    public static final String ARG_ID_TNEW_PERSONACTNEWPTPATRFECHANACIMIENTO = "Clas_1432201068544519Ser_71Arg_20_Alias";
    /** <code>personaCTNEWptpatrFechaNacimiento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_PERSONACTNEWPTPATRFECHANACIMIENTO = "Fecha nacimiento";
    /** <code>personaCTNEWptpatrGenero</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_PERSONACTNEWPTPATRGENERO = "pt_p_atrGenero";
    /** <code>personaCTNEWptpatrGenero</code> inbound argument id. */
    public static final String ARG_ID_TNEW_PERSONACTNEWPTPATRGENERO = "Clas_1432201068544519Ser_71Arg_21_Alias";
    /** <code>personaCTNEWptpatrGenero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_PERSONACTNEWPTPATRGENERO = "Género";
    /** <code>personaCTNEWptpatrIndicadorExtranjero</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_PERSONACTNEWPTPATRINDICADOREXTRANJERO = "pt_p_atrIndicadorExtranjero";
    /** <code>personaCTNEWptpatrIndicadorExtranjero</code> inbound argument id. */
    public static final String ARG_ID_TNEW_PERSONACTNEWPTPATRINDICADOREXTRANJERO = "Clas_1432201068544519Ser_71Arg_22_Alias";
    /** <code>personaCTNEWptpatrIndicadorExtranjero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_PERSONACTNEWPTPATRINDICADOREXTRANJERO = "Indicador extranjero";
    /** <code>personaCTNEWptpatrRazonSocial</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_PERSONACTNEWPTPATRRAZONSOCIAL = "pt_p_atrRazonSocial";
    /** <code>personaCTNEWptpatrRazonSocial</code> inbound argument id. */
    public static final String ARG_ID_TNEW_PERSONACTNEWPTPATRRAZONSOCIAL = "Clas_1432201068544519Ser_71Arg_23_Alias";
    /** <code>personaCTNEWptpatrRazonSocial</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_PERSONACTNEWPTPATRRAZONSOCIAL = "Razón Social";
    /** <code>personaCTNEWptpatrTieneEPSSanitas</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_PERSONACTNEWPTPATRTIENEEPSSANITAS = "pt_p_atrTieneEPSSanitas";
    /** <code>personaCTNEWptpatrTieneEPSSanitas</code> inbound argument id. */
    public static final String ARG_ID_TNEW_PERSONACTNEWPTPATRTIENEEPSSANITAS = "Clas_1432201068544519Ser_71Arg_24_Alias";
    /** <code>personaCTNEWptpatrTieneEPSSanitas</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_PERSONACTNEWPTPATRTIENEEPSSANITAS = "Tiene EPS Sanitas";
    /** <code>personaCTNEWptpatrRechazadoAfiliacion</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_PERSONACTNEWPTPATRRECHAZADOAFILIACION = "pt_p_atrRechazadoAfiliacion";
    /** <code>personaCTNEWptpatrRechazadoAfiliacion</code> inbound argument id. */
    public static final String ARG_ID_TNEW_PERSONACTNEWPTPATRRECHAZADOAFILIACION = "Clas_1432201068544519Ser_71Arg_25_Alias";
    /** <code>personaCTNEWptpatrRechazadoAfiliacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_PERSONACTNEWPTPATRRECHAZADOAFILIACION = "Rechazado afiliación";
    /** <code>personaCTNEWptpatrNombreCompleto</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_PERSONACTNEWPTPATRNOMBRECOMPLETO = "pt_p_atrNombreCompleto";
    /** <code>personaCTNEWptpatrNombreCompleto</code> inbound argument id. */
    public static final String ARG_ID_TNEW_PERSONACTNEWPTPATRNOMBRECOMPLETO = "Clas_1432201068544519Ser_71Arg_26_Alias";
    /** <code>personaCTNEWptpatrNombreCompleto</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_PERSONACTNEWPTPATRNOMBRECOMPLETO = "Nombre Completo";
    /** <code>personaCTNEWptpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_PERSONACTNEWPTPATRCODIGO = "pt_p_atrCodigo";
    /** <code>personaCTNEWptpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_TNEW_PERSONACTNEWPTPATRCODIGO = "Clas_1432201068544519Ser_71Arg_27_Alias";
    /** <code>personaCTNEWptpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_PERSONACTNEWPTPATRCODIGO = "Código";
    // Service (TMODIFICAR)
    /** <code>TMODIFICAR</code> service id. */
    public static final String SERV_ID_TMODIFICAR = "Clas_1432201068544519Ser_72_Alias";
    /** <code>TMODIFICAR</code> service name. */
    public static final String SERV_NAME_TMODIFICAR = "TMODIFICAR";
    /** <code>TMODIFICAR</code> service alias. */
    public static final String SERV_ALIAS_TMODIFICAR = "TMODIFICAR";
    /** Agents allowed to execute the service TMODIFICAR **/
    public static final String TMODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCTMODIFICARpthisPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_PERSONACTMODIFICARPTHISPERSONAC = "p_thisPersonaC";
    /** <code>personaCTMODIFICARpthisPersonaC</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_PERSONACTMODIFICARPTHISPERSONAC = "Clas_1432201068544519Ser_72Arg_1_Alias";
    /** <code>personaCTMODIFICARpthisPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_PERSONACTMODIFICARPTHISPERSONAC = "Persona";
    /** <code>personaCTMODIFICARptpeNombreCompleto</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_PERSONACTMODIFICARPTPENOMBRECOMPLETO = "pt_peNombreCompleto";
    /** <code>personaCTMODIFICARptpeNombreCompleto</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_PERSONACTMODIFICARPTPENOMBRECOMPLETO = "Clas_1432201068544519Ser_72Arg_2_Alias";
    /** <code>personaCTMODIFICARptpeNombreCompleto</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_PERSONACTMODIFICARPTPENOMBRECOMPLETO = "Nombre Completo";
    /** <code>personaCTMODIFICARptpeNumIdent</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_PERSONACTMODIFICARPTPENUMIDENT = "pt_peNumIdent";
    /** <code>personaCTMODIFICARptpeNumIdent</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_PERSONACTMODIFICARPTPENUMIDENT = "Clas_1432201068544519Ser_72Arg_3_Alias";
    /** <code>personaCTMODIFICARptpeNumIdent</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_PERSONACTMODIFICARPTPENUMIDENT = "Nº Identificación";
    /** <code>personaCTMODIFICARptpevcTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_PERSONACTMODIFICARPTPEVCTIPOIDENTIFICACION = "pt_p_evcTipoIdentificacion";
    /** <code>personaCTMODIFICARptpevcTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_PERSONACTMODIFICARPTPEVCTIPOIDENTIFICACION = "Clas_1432201068544519Ser_72Arg_4_Alias";
    /** <code>personaCTMODIFICARptpevcTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_PERSONACTMODIFICARPTPEVCTIPOIDENTIFICACION = "Tipo identificación";
    // Service (TCOPIARPREEXDEUSU)
    /** <code>TCOPIARPREEXDEUSU</code> service id. */
    public static final String SERV_ID_TCOPIARPREEXDEUSU = "Clas_1432201068544519Ser_74_Alias";
    /** <code>TCOPIARPREEXDEUSU</code> service name. */
    public static final String SERV_NAME_TCOPIARPREEXDEUSU = "TCOPIARPREEXDEUSU";
    /** <code>TCOPIARPREEXDEUSU</code> service alias. */
    public static final String SERV_ALIAS_TCOPIARPREEXDEUSU = "TCOPIARPREEXDEUSU";
    /** Agents allowed to execute the service TCOPIARPREEXDEUSU **/
    public static final String TCOPIARPREEXDEUSU_SRVAGENTS = "";
    // Inbound arguments
    /** <code>personaCTCOPIARPREEXDEUSUpthisPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_TCOPIARPREEXDEUSU_PERSONACTCOPIARPREEXDEUSUPTHISPERSONAC = "p_thisPersonaC";
    /** <code>personaCTCOPIARPREEXDEUSUpthisPersonaC</code> inbound argument id. */
    public static final String ARG_ID_TCOPIARPREEXDEUSU_PERSONACTCOPIARPREEXDEUSUPTHISPERSONAC = "Clas_1432201068544519Ser_74Arg_1_Alias";
    /** <code>personaCTCOPIARPREEXDEUSUpthisPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCOPIARPREEXDEUSU_PERSONACTCOPIARPREEXDEUSUPTHISPERSONAC = "Persona";
    /** <code>personaCTCOPIARPREEXDEUSUpUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TCOPIARPREEXDEUSU_PERSONACTCOPIARPREEXDEUSUPUSUARIO = "p_Usuario";
    /** <code>personaCTCOPIARPREEXDEUSUpUsuario</code> inbound argument id. */
    public static final String ARG_ID_TCOPIARPREEXDEUSU_PERSONACTCOPIARPREEXDEUSUPUSUARIO = "Clas_1432201068544519Ser_74Arg_2_Alias";
    /** <code>personaCTCOPIARPREEXDEUSUpUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCOPIARPREEXDEUSU_PERSONACTCOPIARPREEXDEUSUPUSUARIO = "Usuario";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_PERSONACCODIGO.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONACNUMIDENTIFICACION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONACMAIL.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONACPRIMERNOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONACSEGUNDONOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONACPRIMERAPELLIDO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONACSEGUNDOAPELLIDO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONACFECHANACIMIENTO.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONACGENERO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONACINDICADOREXTRANJERO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONACRAZONSOCIAL.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONACDRVTIPOPERSONA.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONACTIENEEPSSANITAS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONACRECHAZADOAFILIACION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONACDRVRECHAZADA.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONACNOMBRECOMPLETO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONACULTIMAACTUALIZACION.toUpperCase(), Constants.Type.DATETIME.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONACDRVNOMBRECOMPLETO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONACDRVDIRCORRESPONDENCIA.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONACDRVCIUDADCORRESPONDENCIA.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONACDRVTIPONUMDOC.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONACDRVEDAD.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONACDRVOBSCONTRATO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PERSONACDRVIMC.toUpperCase(), Constants.Type.REAL.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_PERSONACID.toUpperCase(), PERSONACID_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONACCODIGO.toUpperCase(), PERSONACCODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONACNUMIDENTIFICACION.toUpperCase(), PERSONACNUMIDENTIFICACION_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONACMAIL.toUpperCase(), PERSONACMAIL_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONACPRIMERNOMBRE.toUpperCase(), PERSONACPRIMERNOMBRE_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONACSEGUNDONOMBRE.toUpperCase(), PERSONACSEGUNDONOMBRE_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONACPRIMERAPELLIDO.toUpperCase(), PERSONACPRIMERAPELLIDO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONACSEGUNDOAPELLIDO.toUpperCase(), PERSONACSEGUNDOAPELLIDO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONACFECHANACIMIENTO.toUpperCase(), PERSONACFECHANACIMIENTO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONACGENERO.toUpperCase(), PERSONACGENERO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONACINDICADOREXTRANJERO.toUpperCase(), PERSONACINDICADOREXTRANJERO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONACRAZONSOCIAL.toUpperCase(), PERSONACRAZONSOCIAL_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONACDRVTIPOPERSONA.toUpperCase(), PERSONACDRVTIPOPERSONA_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONACTIENEEPSSANITAS.toUpperCase(), PERSONACTIENEEPSSANITAS_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONACRECHAZADOAFILIACION.toUpperCase(), PERSONACRECHAZADOAFILIACION_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONACDRVRECHAZADA.toUpperCase(), PERSONACDRVRECHAZADA_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONACNOMBRECOMPLETO.toUpperCase(), PERSONACNOMBRECOMPLETO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONACULTIMAACTUALIZACION.toUpperCase(), PERSONACULTIMAACTUALIZACION_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONACDRVNOMBRECOMPLETO.toUpperCase(), PERSONACDRVNOMBRECOMPLETO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONACDRVDIRCORRESPONDENCIA.toUpperCase(), PERSONACDRVDIRCORRESPONDENCIA_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONACDRVCIUDADCORRESPONDENCIA.toUpperCase(), PERSONACDRVCIUDADCORRESPONDENCIA_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONACDRVTIPONUMDOC.toUpperCase(), PERSONACDRVTIPONUMDOC_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONACDRVEDAD.toUpperCase(), PERSONACDRVEDAD_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONACDRVOBSCONTRATO.toUpperCase(), PERSONACDRVOBSCONTRATO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PERSONACDRVIMC.toUpperCase(), PERSONACDRVIMC_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_TIPOINSTITUCIONC.toUpperCase(), TIPOINSTITUCIONC_AGENTS);
        roleAgents.put(ROLE_NAME_TIPOENTIDADC.toUpperCase(), TIPOENTIDADC_AGENTS);
        roleAgents.put(ROLE_NAME_ESTADOCIVILC.toUpperCase(), ESTADOCIVILC_AGENTS);
        roleAgents.put(ROLE_NAME_ESTADOPERSONAC.toUpperCase(), ESTADOPERSONAC_AGENTS);
        roleAgents.put(ROLE_NAME_TIPOIDENTIFICACIONC.toUpperCase(), TIPOIDENTIFICACIONC_AGENTS);
        roleAgents.put(ROLE_NAME_MUNICIPIOCNAC.toUpperCase(), MUNICIPIOCNAC_AGENTS);
        roleAgents.put(ROLE_NAME_DEPARTAMENTOCNAC.toUpperCase(), DEPARTAMENTOCNAC_AGENTS);
        roleAgents.put(ROLE_NAME_CONTRATOSC.toUpperCase(), CONTRATOSC_AGENTS);
        roleAgents.put(ROLE_NAME_FAMILIASC.toUpperCase(), FAMILIASC_AGENTS);
        roleAgents.put(ROLE_NAME_BENEFICIARIOSC.toUpperCase(), BENEFICIARIOSC_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'PersonaC', it returns the identification keys
     * - If className is a facet of the inheritance net of 'PersonaC', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_PERSONACID);
        }
        // Facet 'PersonaC' (This facet)
        if (PersonaCConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_PERSONACID);
        }
        return returnList;
    }
}
