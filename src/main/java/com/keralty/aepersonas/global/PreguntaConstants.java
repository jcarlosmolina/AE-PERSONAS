package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>Pregunta</code> model class.
 */
public final class PreguntaConstants {

    private PreguntaConstants() {

    }

    // Class
    /** <code>Pregunta</code> class id. */
    public static final String CLASS_ID = "Clas_1431633788928040_Alias";
    /** <code>Pregunta</code> class name. */
    public static final String CLASS_NAME = "Pregunta";
    /** <code>Pregunta</code> class alias. */
    public static final String CLASS_ALIAS = "Pregunta";
    /** <code>Pregunta</code> class table name. */
    public static final String TBL_NAME = "Pregunta";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "preguntaNumero,seccionIdentificador,preguntaNumOrden,preguntaDescripcion,preguntaValorSNObliga,preguntaObsOblig,preguntaEsNumero,preguntaValorMax,preguntaValorMin,preguntaSoloHombres,preguntaSoloMujeres,preguntaRespMultiple,preguntaSeEnviaAlCORE,preguntaCondicionEdad,preguntaCondicionEdadAnyos";

    public static final String DSDSPREGUNTAIIU = "DS_Pregunta_IIU";
    

    // Attribute (preguntaNumero)
    /** <code>preguntaNumero</code> attribute id. */
    public static final String ATTR_ID_PREGUNTANUMERO = "Clas_1431633788928040Atr_1_Alias";
    /** <code>preguntaNumero</code> attribute name. */
    public static final String ATTR_NAME_PREGUNTANUMERO = "preguntaNumero";
    /** <code>preguntaNumero</code> attribute alias. */
    public static final String ATTR_ALIAS_PREGUNTANUMERO = "Número";

    /** <code>preguntaNumero</code> attribute facet sequence. */
    public static final String PATH_FACETS_PREGUNTANUMERO = "";
    /** Agents allowed to view the attribute preguntaNumero **/
    public static final String PREGUNTANUMERO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (preguntaNumOrden)
    /** <code>preguntaNumOrden</code> attribute id. */
    public static final String ATTR_ID_PREGUNTANUMORDEN = "Clas_1431633788928040Atr_2_Alias";
    /** <code>preguntaNumOrden</code> attribute name. */
    public static final String ATTR_NAME_PREGUNTANUMORDEN = "preguntaNumOrden";
    /** <code>preguntaNumOrden</code> attribute alias. */
    public static final String ATTR_ALIAS_PREGUNTANUMORDEN = "Nº orden";

    /** <code>preguntaNumOrden</code> attribute facet sequence. */
    public static final String PATH_FACETS_PREGUNTANUMORDEN = "";
    /** Agents allowed to view the attribute preguntaNumOrden **/
    public static final String PREGUNTANUMORDEN_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (preguntaDescripcion)
    /** <code>preguntaDescripcion</code> attribute id. */
    public static final String ATTR_ID_PREGUNTADESCRIPCION = "Clas_1431633788928040Atr_3_Alias";
    /** <code>preguntaDescripcion</code> attribute name. */
    public static final String ATTR_NAME_PREGUNTADESCRIPCION = "preguntaDescripcion";
    /** <code>preguntaDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_PREGUNTADESCRIPCION = "Descripción";

    /** <code>preguntaDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_PREGUNTADESCRIPCION = "";
    /** Agents allowed to view the attribute preguntaDescripcion **/
    public static final String PREGUNTADESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (preguntaValorSNObliga)
    /** <code>preguntaValorSNObliga</code> attribute id. */
    public static final String ATTR_ID_PREGUNTAVALORSNOBLIGA = "Clas_1431633788928040Atr_4_Alias";
    /** <code>preguntaValorSNObliga</code> attribute name. */
    public static final String ATTR_NAME_PREGUNTAVALORSNOBLIGA = "preguntaValorSNObliga";
    /** <code>preguntaValorSNObliga</code> attribute alias. */
    public static final String ATTR_ALIAS_PREGUNTAVALORSNOBLIGA = "Si/No Obligatorio";

    /** <code>preguntaValorSNObliga</code> attribute facet sequence. */
    public static final String PATH_FACETS_PREGUNTAVALORSNOBLIGA = "";
    /** Agents allowed to view the attribute preguntaValorSNObliga **/
    public static final String PREGUNTAVALORSNOBLIGA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (preguntaObsOblig)
    /** <code>preguntaObsOblig</code> attribute id. */
    public static final String ATTR_ID_PREGUNTAOBSOBLIG = "Clas_1431633788928040Atr_5_Alias";
    /** <code>preguntaObsOblig</code> attribute name. */
    public static final String ATTR_NAME_PREGUNTAOBSOBLIG = "preguntaObsOblig";
    /** <code>preguntaObsOblig</code> attribute alias. */
    public static final String ATTR_ALIAS_PREGUNTAOBSOBLIG = "Obs. Obligatoria";

    /** <code>preguntaObsOblig</code> attribute facet sequence. */
    public static final String PATH_FACETS_PREGUNTAOBSOBLIG = "";
    /** Agents allowed to view the attribute preguntaObsOblig **/
    public static final String PREGUNTAOBSOBLIG_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (preguntaEsNumero)
    /** <code>preguntaEsNumero</code> attribute id. */
    public static final String ATTR_ID_PREGUNTAESNUMERO = "Clas_1431633788928040Atr_6_Alias";
    /** <code>preguntaEsNumero</code> attribute name. */
    public static final String ATTR_NAME_PREGUNTAESNUMERO = "preguntaEsNumero";
    /** <code>preguntaEsNumero</code> attribute alias. */
    public static final String ATTR_ALIAS_PREGUNTAESNUMERO = "Es número";

    /** <code>preguntaEsNumero</code> attribute facet sequence. */
    public static final String PATH_FACETS_PREGUNTAESNUMERO = "";
    /** Agents allowed to view the attribute preguntaEsNumero **/
    public static final String PREGUNTAESNUMERO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (preguntaValorMax)
    /** <code>preguntaValorMax</code> attribute id. */
    public static final String ATTR_ID_PREGUNTAVALORMAX = "Clas_1431633788928040Atr_7_Alias";
    /** <code>preguntaValorMax</code> attribute name. */
    public static final String ATTR_NAME_PREGUNTAVALORMAX = "preguntaValorMax";
    /** <code>preguntaValorMax</code> attribute alias. */
    public static final String ATTR_ALIAS_PREGUNTAVALORMAX = "Valor máximo";

    /** <code>preguntaValorMax</code> attribute facet sequence. */
    public static final String PATH_FACETS_PREGUNTAVALORMAX = "";
    /** Agents allowed to view the attribute preguntaValorMax **/
    public static final String PREGUNTAVALORMAX_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (preguntaValorMin)
    /** <code>preguntaValorMin</code> attribute id. */
    public static final String ATTR_ID_PREGUNTAVALORMIN = "Clas_1431633788928040Atr_8_Alias";
    /** <code>preguntaValorMin</code> attribute name. */
    public static final String ATTR_NAME_PREGUNTAVALORMIN = "preguntaValorMin";
    /** <code>preguntaValorMin</code> attribute alias. */
    public static final String ATTR_ALIAS_PREGUNTAVALORMIN = "Valor mínimo";

    /** <code>preguntaValorMin</code> attribute facet sequence. */
    public static final String PATH_FACETS_PREGUNTAVALORMIN = "";
    /** Agents allowed to view the attribute preguntaValorMin **/
    public static final String PREGUNTAVALORMIN_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (preguntaSoloHombres)
    /** <code>preguntaSoloHombres</code> attribute id. */
    public static final String ATTR_ID_PREGUNTASOLOHOMBRES = "Clas_1431633788928040Atr_9_Alias";
    /** <code>preguntaSoloHombres</code> attribute name. */
    public static final String ATTR_NAME_PREGUNTASOLOHOMBRES = "preguntaSoloHombres";
    /** <code>preguntaSoloHombres</code> attribute alias. */
    public static final String ATTR_ALIAS_PREGUNTASOLOHOMBRES = "Solo hombres";

    /** <code>preguntaSoloHombres</code> attribute facet sequence. */
    public static final String PATH_FACETS_PREGUNTASOLOHOMBRES = "";
    /** Agents allowed to view the attribute preguntaSoloHombres **/
    public static final String PREGUNTASOLOHOMBRES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (preguntaSoloMujeres)
    /** <code>preguntaSoloMujeres</code> attribute id. */
    public static final String ATTR_ID_PREGUNTASOLOMUJERES = "Clas_1431633788928040Atr_10_Alias";
    /** <code>preguntaSoloMujeres</code> attribute name. */
    public static final String ATTR_NAME_PREGUNTASOLOMUJERES = "preguntaSoloMujeres";
    /** <code>preguntaSoloMujeres</code> attribute alias. */
    public static final String ATTR_ALIAS_PREGUNTASOLOMUJERES = "Solo mujeres";

    /** <code>preguntaSoloMujeres</code> attribute facet sequence. */
    public static final String PATH_FACETS_PREGUNTASOLOMUJERES = "";
    /** Agents allowed to view the attribute preguntaSoloMujeres **/
    public static final String PREGUNTASOLOMUJERES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (preguntaRespMultiple)
    /** <code>preguntaRespMultiple</code> attribute id. */
    public static final String ATTR_ID_PREGUNTARESPMULTIPLE = "Clas_1431633788928040Atr_12_Alias";
    /** <code>preguntaRespMultiple</code> attribute name. */
    public static final String ATTR_NAME_PREGUNTARESPMULTIPLE = "preguntaRespMultiple";
    /** <code>preguntaRespMultiple</code> attribute alias. */
    public static final String ATTR_ALIAS_PREGUNTARESPMULTIPLE = "Resp. múltiple";

    /** <code>preguntaRespMultiple</code> attribute facet sequence. */
    public static final String PATH_FACETS_PREGUNTARESPMULTIPLE = "";
    /** Agents allowed to view the attribute preguntaRespMultiple **/
    public static final String PREGUNTARESPMULTIPLE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (preguntadrvValoresPosibles)
    /** <code>preguntadrvValoresPosibles</code> attribute id. */
    public static final String ATTR_ID_PREGUNTADRVVALORESPOSIBLES = "Clas_1431633788928040Atr_13_Alias";
    /** <code>preguntadrvValoresPosibles</code> attribute name. */
    public static final String ATTR_NAME_PREGUNTADRVVALORESPOSIBLES = "preguntadrvValoresPosibles";
    /** <code>preguntadrvValoresPosibles</code> attribute alias. */
    public static final String ATTR_ALIAS_PREGUNTADRVVALORESPOSIBLES = "Valores posibles";

    /** <code>preguntadrvValoresPosibles</code> attribute facet sequence. */
    public static final String PATH_FACETS_PREGUNTADRVVALORESPOSIBLES = "";
    /** Agents allowed to view the attribute preguntadrvValoresPosibles **/
    public static final String PREGUNTADRVVALORESPOSIBLES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (preguntaSeEnviaAlCORE)
    /** <code>preguntaSeEnviaAlCORE</code> attribute id. */
    public static final String ATTR_ID_PREGUNTASEENVIAALCORE = "Clas_1431633788928040Atr_14_Alias";
    /** <code>preguntaSeEnviaAlCORE</code> attribute name. */
    public static final String ATTR_NAME_PREGUNTASEENVIAALCORE = "preguntaSeEnviaAlCORE";
    /** <code>preguntaSeEnviaAlCORE</code> attribute alias. */
    public static final String ATTR_ALIAS_PREGUNTASEENVIAALCORE = "Se envía al CORE";

    /** <code>preguntaSeEnviaAlCORE</code> attribute facet sequence. */
    public static final String PATH_FACETS_PREGUNTASEENVIAALCORE = "";
    /** Agents allowed to view the attribute preguntaSeEnviaAlCORE **/
    public static final String PREGUNTASEENVIAALCORE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (preguntaCondicionEdad)
    /** <code>preguntaCondicionEdad</code> attribute id. */
    public static final String ATTR_ID_PREGUNTACONDICIONEDAD = "Clas_1431633788928040Atr_15_Alias";
    /** <code>preguntaCondicionEdad</code> attribute name. */
    public static final String ATTR_NAME_PREGUNTACONDICIONEDAD = "preguntaCondicionEdad";
    /** <code>preguntaCondicionEdad</code> attribute alias. */
    public static final String ATTR_ALIAS_PREGUNTACONDICIONEDAD = "Condicionada por edad";

    /** <code>preguntaCondicionEdad</code> attribute facet sequence. */
    public static final String PATH_FACETS_PREGUNTACONDICIONEDAD = "";
    /** Agents allowed to view the attribute preguntaCondicionEdad **/
    public static final String PREGUNTACONDICIONEDAD_AGENTS = "Admin,SuperAdmin,Gestor,MesaDeApoyo";
    // Attribute (preguntaCondicionEdadAnyos)
    /** <code>preguntaCondicionEdadAnyos</code> attribute id. */
    public static final String ATTR_ID_PREGUNTACONDICIONEDADANYOS = "Clas_1431633788928040Atr_16_Alias";
    /** <code>preguntaCondicionEdadAnyos</code> attribute name. */
    public static final String ATTR_NAME_PREGUNTACONDICIONEDADANYOS = "preguntaCondicionEdadAnyos";
    /** <code>preguntaCondicionEdadAnyos</code> attribute alias. */
    public static final String ATTR_ALIAS_PREGUNTACONDICIONEDADANYOS = "Condicionada por edad";

    /** <code>preguntaCondicionEdadAnyos</code> attribute facet sequence. */
    public static final String PATH_FACETS_PREGUNTACONDICIONEDADANYOS = "";
    /** Agents allowed to view the attribute preguntaCondicionEdadAnyos **/
    public static final String PREGUNTACONDICIONEDADANYOS_AGENTS = "Admin,SuperAdmin,Gestor,MesaDeApoyo";


    // Field (Numero)
    /** <code>Numero</code> field name. */
    public static final String FLD_PREGUNTANUMERO = "Numero";    
    /** <code>preguntaNumero</code> attribute field name. */
    public static final String ATTR_FIELD_PREGUNTANUMERO = "preguntaNumero";
    // Field (Identificador)
    /** <code>Identificador</code> field name. */
    public static final String FLD_SECCIONIDENTIFICADOR = "Identificador";    
    /** <code>Seccion.seccionIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_SECCION_SECCIONIDENTIFICADOR = "seccionIdentificador";
    // Field (NumOrden)
    /** <code>NumOrden</code> field name. */
    public static final String FLD_PREGUNTANUMORDEN = "NumOrden";    
    /** <code>preguntaNumOrden</code> attribute field name. */
    public static final String ATTR_FIELD_PREGUNTANUMORDEN = "preguntaNumOrden";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_PREGUNTADESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_PREGUNTADESCRIPCIONLENGTH = 255;
    /** <code>preguntaDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_PREGUNTADESCRIPCION = "preguntaDescripcion";
    // Field (ValorSNObliga)
    /** <code>ValorSNObliga</code> field name. */
    public static final String FLD_PREGUNTAVALORSNOBLIGA = "ValorSNObliga";    
    /** <code>preguntaValorSNObliga</code> attribute field name. */
    public static final String ATTR_FIELD_PREGUNTAVALORSNOBLIGA = "preguntaValorSNObliga";
    // Field (ObsOblig)
    /** <code>ObsOblig</code> field name. */
    public static final String FLD_PREGUNTAOBSOBLIG = "ObsOblig";    
    /** <code>preguntaObsOblig</code> attribute field name. */
    public static final String ATTR_FIELD_PREGUNTAOBSOBLIG = "preguntaObsOblig";
    // Field (EsNumero)
    /** <code>EsNumero</code> field name. */
    public static final String FLD_PREGUNTAESNUMERO = "EsNumero";    
    /** <code>preguntaEsNumero</code> attribute field name. */
    public static final String ATTR_FIELD_PREGUNTAESNUMERO = "preguntaEsNumero";
    // Field (ValorMax)
    /** <code>ValorMax</code> field name. */
    public static final String FLD_PREGUNTAVALORMAX = "ValorMax";    
    /** <code>preguntaValorMax</code> attribute field name. */
    public static final String ATTR_FIELD_PREGUNTAVALORMAX = "preguntaValorMax";
    // Field (ValorMin)
    /** <code>ValorMin</code> field name. */
    public static final String FLD_PREGUNTAVALORMIN = "ValorMin";    
    /** <code>preguntaValorMin</code> attribute field name. */
    public static final String ATTR_FIELD_PREGUNTAVALORMIN = "preguntaValorMin";
    // Field (SoloHombres)
    /** <code>SoloHombres</code> field name. */
    public static final String FLD_PREGUNTASOLOHOMBRES = "SoloHombres";    
    /** <code>preguntaSoloHombres</code> attribute field name. */
    public static final String ATTR_FIELD_PREGUNTASOLOHOMBRES = "preguntaSoloHombres";
    // Field (SoloMujeres)
    /** <code>SoloMujeres</code> field name. */
    public static final String FLD_PREGUNTASOLOMUJERES = "SoloMujeres";    
    /** <code>preguntaSoloMujeres</code> attribute field name. */
    public static final String ATTR_FIELD_PREGUNTASOLOMUJERES = "preguntaSoloMujeres";
    // Field (RespMultiple)
    /** <code>RespMultiple</code> field name. */
    public static final String FLD_PREGUNTARESPMULTIPLE = "RespMultiple";    
    /** <code>preguntaRespMultiple</code> attribute field name. */
    public static final String ATTR_FIELD_PREGUNTARESPMULTIPLE = "preguntaRespMultiple";
    // Field (SeEnviaAlCORE)
    /** <code>SeEnviaAlCORE</code> field name. */
    public static final String FLD_PREGUNTASEENVIAALCORE = "SeEnviaAlCORE";    
    /** <code>preguntaSeEnviaAlCORE</code> attribute field name. */
    public static final String ATTR_FIELD_PREGUNTASEENVIAALCORE = "preguntaSeEnviaAlCORE";
    // Field (CondicionEdad)
    /** <code>CondicionEdad</code> field name. */
    public static final String FLD_PREGUNTACONDICIONEDAD = "CondicionEdad";    
    /** <code>preguntaCondicionEdad</code> attribute field name. */
    public static final String ATTR_FIELD_PREGUNTACONDICIONEDAD = "preguntaCondicionEdad";
    // Field (CondicionEdadAnyos)
    /** <code>CondicionEdadAnyos</code> field name. */
    public static final String FLD_PREGUNTACONDICIONEDADANYOS = "CondicionEdadAnyos";    
    /** <code>preguntaCondicionEdadAnyos</code> attribute field name. */
    public static final String ATTR_FIELD_PREGUNTACONDICIONEDADANYOS = "preguntaCondicionEdadAnyos";

    // Component role (Seccion)
    /** <code>Seccion</code> role id. */
    public static final String ROLE_ID_SECCION = "Agr_1431634182144405_Alias";
    /** <code>Seccion</code> role name. */
    public static final String ROLE_NAME_SECCION = "seccion";
    /** <code>Seccion</code> role alias. */
    public static final String ROLE_ALIAS_SECCION = "Sección";

    /** <code>Seccion</code> inverse role name. */
    public static final String ROLE_INVNAME_SECCION = SeccionConstants.ROLE_NAME_PREGUNTAS;
    /** <code>Seccion</code> role facet sequence. */
    public static final String PATH_FACETS_SECCION = "";
    /** <code>Seccion</code> role target class. */
    public static final String ROLE_TARGET_SECCION = SeccionConstants.CLASS_NAME;

    /** Agents allowed to navigate through Seccion **/
    public static final String SECCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Compound role (Valores)
    /** <code>Valores</code> role id. */
    public static final String ROLE_ID_VALORES = "Agr_1431634313216461_Alias";
    /** <code>Valores</code> role name. */
    public static final String ROLE_NAME_VALORES = "valores";
    /** <code>Preguntas</code> role alias. */
    public static final String ROLE_ALIAS_VALORES = "Valores";


    /** <code>Valores</code> inverse role name. */
    public static final String ROLE_INVNAME_VALORES = ValorConstants.ROLE_NAME_PREGUNTAS;
    /** <code>Valores</code> role facet sequence. */
    public static final String PATH_FACETS_VALORES = "";
    /** <code>Valores</code> role target class. */
    public static final String ROLE_TARGET_VALORES = ValorConstants.CLASS_NAME;
    /** Agents allowed to navigate through Valores **/
    public static final String VALORES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (PreguntasPersona)
    /** <code>PreguntasPersona</code> role id. */
    public static final String ROLE_ID_PREGUNTASPERSONA = "Agr_1432647761920034_Alias";
    /** <code>PreguntasPersona</code> role name. */
    public static final String ROLE_NAME_PREGUNTASPERSONA = "preguntasPersona";
    /** <code>Pregunta</code> role alias. */
    public static final String ROLE_ALIAS_PREGUNTASPERSONA = "Preguntas persona";


    /** <code>PreguntasPersona</code> inverse role name. */
    public static final String ROLE_INVNAME_PREGUNTASPERSONA = PreguntaPConstants.ROLE_NAME_PREGUNTA;
    /** <code>PreguntasPersona</code> role facet sequence. */
    public static final String PATH_FACETS_PREGUNTASPERSONA = "";
    /** <code>PreguntasPersona</code> role target class. */
    public static final String ROLE_TARGET_PREGUNTASPERSONA = PreguntaPConstants.CLASS_NAME;
    /** Agents allowed to navigate through PreguntasPersona **/
    public static final String PREGUNTASPERSONA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431633788928040Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>preguntacrearpagrSeccion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PREGUNTACREARPAGRSECCION = "p_agrSeccion";
    /** <code>preguntacrearpagrSeccion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PREGUNTACREARPAGRSECCION = "Clas_1431633788928040Ser_1Arg_13_Alias";
    /** <code>preguntacrearpagrSeccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PREGUNTACREARPAGRSECCION = "Sección";
    /** <code>preguntacrearpatrNumero</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PREGUNTACREARPATRNUMERO = "p_atrNumero";
    /** <code>preguntacrearpatrNumero</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PREGUNTACREARPATRNUMERO = "Clas_1431633788928040Ser_1Arg_1_Alias";
    /** <code>preguntacrearpatrNumero</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PREGUNTACREARPATRNUMERO = "Número";
    /** <code>preguntacrearpatrNumOrden</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PREGUNTACREARPATRNUMORDEN = "p_atrNumOrden";
    /** <code>preguntacrearpatrNumOrden</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PREGUNTACREARPATRNUMORDEN = "Clas_1431633788928040Ser_1Arg_2_Alias";
    /** <code>preguntacrearpatrNumOrden</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PREGUNTACREARPATRNUMORDEN = "Nº orden";
    /** <code>preguntacrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PREGUNTACREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>preguntacrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PREGUNTACREARPATRDESCRIPCION = "Clas_1431633788928040Ser_1Arg_3_Alias";
    /** <code>preguntacrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PREGUNTACREARPATRDESCRIPCION = "Descripción";
    /** <code>preguntacrearpatrValorSNObliga</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PREGUNTACREARPATRVALORSNOBLIGA = "p_atrValorSNObliga";
    /** <code>preguntacrearpatrValorSNObliga</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PREGUNTACREARPATRVALORSNOBLIGA = "Clas_1431633788928040Ser_1Arg_4_Alias";
    /** <code>preguntacrearpatrValorSNObliga</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PREGUNTACREARPATRVALORSNOBLIGA = "Si/No Obligatorio";
    /** <code>preguntacrearpatrObsOblig</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PREGUNTACREARPATROBSOBLIG = "p_atrObsOblig";
    /** <code>preguntacrearpatrObsOblig</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PREGUNTACREARPATROBSOBLIG = "Clas_1431633788928040Ser_1Arg_5_Alias";
    /** <code>preguntacrearpatrObsOblig</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PREGUNTACREARPATROBSOBLIG = "Obs. Obligatoria";
    /** <code>preguntacrearpatrEsNumero</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PREGUNTACREARPATRESNUMERO = "p_atrEsNumero";
    /** <code>preguntacrearpatrEsNumero</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PREGUNTACREARPATRESNUMERO = "Clas_1431633788928040Ser_1Arg_6_Alias";
    /** <code>preguntacrearpatrEsNumero</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PREGUNTACREARPATRESNUMERO = "Es número";
    /** <code>preguntacrearpatrValorMax</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PREGUNTACREARPATRVALORMAX = "p_atrValorMax";
    /** <code>preguntacrearpatrValorMax</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PREGUNTACREARPATRVALORMAX = "Clas_1431633788928040Ser_1Arg_7_Alias";
    /** <code>preguntacrearpatrValorMax</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PREGUNTACREARPATRVALORMAX = "Valor máximo";
    /** <code>preguntacrearpatrValorMin</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PREGUNTACREARPATRVALORMIN = "p_atrValorMin";
    /** <code>preguntacrearpatrValorMin</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PREGUNTACREARPATRVALORMIN = "Clas_1431633788928040Ser_1Arg_8_Alias";
    /** <code>preguntacrearpatrValorMin</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PREGUNTACREARPATRVALORMIN = "Valor mínimo";
    /** <code>preguntacrearpatrSoloHombres</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PREGUNTACREARPATRSOLOHOMBRES = "p_atrSoloHombres";
    /** <code>preguntacrearpatrSoloHombres</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PREGUNTACREARPATRSOLOHOMBRES = "Clas_1431633788928040Ser_1Arg_9_Alias";
    /** <code>preguntacrearpatrSoloHombres</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PREGUNTACREARPATRSOLOHOMBRES = "Solo hombres";
    /** <code>preguntacrearpatrSoloMujeres</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PREGUNTACREARPATRSOLOMUJERES = "p_atrSoloMujeres";
    /** <code>preguntacrearpatrSoloMujeres</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PREGUNTACREARPATRSOLOMUJERES = "Clas_1431633788928040Ser_1Arg_10_Alias";
    /** <code>preguntacrearpatrSoloMujeres</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PREGUNTACREARPATRSOLOMUJERES = "Solo mujeres";
    /** <code>preguntacrearpatrRespMultiple</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PREGUNTACREARPATRRESPMULTIPLE = "p_atrRespMultiple";
    /** <code>preguntacrearpatrRespMultiple</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PREGUNTACREARPATRRESPMULTIPLE = "Clas_1431633788928040Ser_1Arg_12_Alias";
    /** <code>preguntacrearpatrRespMultiple</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PREGUNTACREARPATRRESPMULTIPLE = "Resp. múltiple";
    /** <code>preguntacrearpatrSeEnviaAlCORE</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PREGUNTACREARPATRSEENVIAALCORE = "p_atrSeEnviaAlCORE";
    /** <code>preguntacrearpatrSeEnviaAlCORE</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PREGUNTACREARPATRSEENVIAALCORE = "Clas_1431633788928040Ser_1Arg_14_Alias";
    /** <code>preguntacrearpatrSeEnviaAlCORE</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PREGUNTACREARPATRSEENVIAALCORE = "Se envía al CORE";
    /** <code>preguntacrearpatrCondicionEdad</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PREGUNTACREARPATRCONDICIONEDAD = "p_atrCondicionEdad";
    /** <code>preguntacrearpatrCondicionEdad</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PREGUNTACREARPATRCONDICIONEDAD = "Clas_1431633788928040Ser_1Arg_15_Alias";
    /** <code>preguntacrearpatrCondicionEdad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PREGUNTACREARPATRCONDICIONEDAD = "Condicionada por edad";
    /** <code>preguntacrearpatrCondicionEdadAnyos</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PREGUNTACREARPATRCONDICIONEDADANYOS = "p_atrCondicionEdadAnyos";
    /** <code>preguntacrearpatrCondicionEdadAnyos</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PREGUNTACREARPATRCONDICIONEDADANYOS = "Clas_1431633788928040Ser_1Arg_16_Alias";
    /** <code>preguntacrearpatrCondicionEdadAnyos</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PREGUNTACREARPATRCONDICIONEDADANYOS = "Condicionada por edad";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431633788928040Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>preguntaeliminarpthisPregunta</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_PREGUNTAELIMINARPTHISPREGUNTA = "p_thisPregunta";
    /** <code>preguntaeliminarpthisPregunta</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_PREGUNTAELIMINARPTHISPREGUNTA = "Clas_1431633788928040Ser_2Arg_1_Alias";
    /** <code>preguntaeliminarpthisPregunta</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_PREGUNTAELIMINARPTHISPREGUNTA = "Pregunta";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1431633788928040Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>preguntamodificarpthisPregunta</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PREGUNTAMODIFICARPTHISPREGUNTA = "p_thisPregunta";
    /** <code>preguntamodificarpthisPregunta</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PREGUNTAMODIFICARPTHISPREGUNTA = "Clas_1431633788928040Ser_3Arg_1_Alias";
    /** <code>preguntamodificarpthisPregunta</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PREGUNTAMODIFICARPTHISPREGUNTA = "Pregunta";
    /** <code>preguntamodificarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PREGUNTAMODIFICARPDESCRIPCION = "p_Descripcion";
    /** <code>preguntamodificarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PREGUNTAMODIFICARPDESCRIPCION = "Clas_1431633788928040Ser_3Arg_3_Alias";
    /** <code>preguntamodificarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PREGUNTAMODIFICARPDESCRIPCION = "Descripción";
    /** <code>preguntamodificarpValorSNObliga</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PREGUNTAMODIFICARPVALORSNOBLIGA = "p_ValorSNObliga";
    /** <code>preguntamodificarpValorSNObliga</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PREGUNTAMODIFICARPVALORSNOBLIGA = "Clas_1431633788928040Ser_3Arg_4_Alias";
    /** <code>preguntamodificarpValorSNObliga</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PREGUNTAMODIFICARPVALORSNOBLIGA = "Si/No Obligatorio";
    /** <code>preguntamodificarpObsOblig</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PREGUNTAMODIFICARPOBSOBLIG = "p_ObsOblig";
    /** <code>preguntamodificarpObsOblig</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PREGUNTAMODIFICARPOBSOBLIG = "Clas_1431633788928040Ser_3Arg_5_Alias";
    /** <code>preguntamodificarpObsOblig</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PREGUNTAMODIFICARPOBSOBLIG = "Obs. Obligatoria";
    /** <code>preguntamodificarpEsNumero</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PREGUNTAMODIFICARPESNUMERO = "p_EsNumero";
    /** <code>preguntamodificarpEsNumero</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PREGUNTAMODIFICARPESNUMERO = "Clas_1431633788928040Ser_3Arg_6_Alias";
    /** <code>preguntamodificarpEsNumero</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PREGUNTAMODIFICARPESNUMERO = "Es número";
    /** <code>preguntamodificarpValorMax</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PREGUNTAMODIFICARPVALORMAX = "p_ValorMax";
    /** <code>preguntamodificarpValorMax</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PREGUNTAMODIFICARPVALORMAX = "Clas_1431633788928040Ser_3Arg_7_Alias";
    /** <code>preguntamodificarpValorMax</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PREGUNTAMODIFICARPVALORMAX = "Valor máximo";
    /** <code>preguntamodificarpValorMin</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PREGUNTAMODIFICARPVALORMIN = "p_ValorMin";
    /** <code>preguntamodificarpValorMin</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PREGUNTAMODIFICARPVALORMIN = "Clas_1431633788928040Ser_3Arg_8_Alias";
    /** <code>preguntamodificarpValorMin</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PREGUNTAMODIFICARPVALORMIN = "Valor mínimo";
    /** <code>preguntamodificarpSoloHombres</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PREGUNTAMODIFICARPSOLOHOMBRES = "p_SoloHombres";
    /** <code>preguntamodificarpSoloHombres</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PREGUNTAMODIFICARPSOLOHOMBRES = "Clas_1431633788928040Ser_3Arg_9_Alias";
    /** <code>preguntamodificarpSoloHombres</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PREGUNTAMODIFICARPSOLOHOMBRES = "Solo hombres";
    /** <code>preguntamodificarpSoloMujeres</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PREGUNTAMODIFICARPSOLOMUJERES = "p_SoloMujeres";
    /** <code>preguntamodificarpSoloMujeres</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PREGUNTAMODIFICARPSOLOMUJERES = "Clas_1431633788928040Ser_3Arg_10_Alias";
    /** <code>preguntamodificarpSoloMujeres</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PREGUNTAMODIFICARPSOLOMUJERES = "Solo mujeres";
    /** <code>preguntamodificarpRespMultiple</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PREGUNTAMODIFICARPRESPMULTIPLE = "p_RespMultiple";
    /** <code>preguntamodificarpRespMultiple</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PREGUNTAMODIFICARPRESPMULTIPLE = "Clas_1431633788928040Ser_3Arg_12_Alias";
    /** <code>preguntamodificarpRespMultiple</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PREGUNTAMODIFICARPRESPMULTIPLE = "Resp. múltiple";
    /** <code>preguntamodificarpSeEnviaAlCORE</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PREGUNTAMODIFICARPSEENVIAALCORE = "p_SeEnviaAlCORE";
    /** <code>preguntamodificarpSeEnviaAlCORE</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PREGUNTAMODIFICARPSEENVIAALCORE = "Clas_1431633788928040Ser_3Arg_13_Alias";
    /** <code>preguntamodificarpSeEnviaAlCORE</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PREGUNTAMODIFICARPSEENVIAALCORE = "Se envía al CORE";
    /** <code>preguntamodificarpCondicionEdad</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PREGUNTAMODIFICARPCONDICIONEDAD = "p_CondicionEdad";
    /** <code>preguntamodificarpCondicionEdad</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PREGUNTAMODIFICARPCONDICIONEDAD = "Clas_1431633788928040Ser_3Arg_14_Alias";
    /** <code>preguntamodificarpCondicionEdad</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PREGUNTAMODIFICARPCONDICIONEDAD = "Condicionada por edad";
    /** <code>preguntamodificarpCondicionEdadAnyos</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PREGUNTAMODIFICARPCONDICIONEDADANYOS = "p_CondicionEdadAnyos";
    /** <code>preguntamodificarpCondicionEdadAnyos</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PREGUNTAMODIFICARPCONDICIONEDADANYOS = "Clas_1431633788928040Ser_3Arg_15_Alias";
    /** <code>preguntamodificarpCondicionEdadAnyos</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PREGUNTAMODIFICARPCONDICIONEDADANYOS = "Condicionada por edad";
    // Service (cambiarOrden)
    /** <code>cambiarOrden</code> service id. */
    public static final String SERV_ID_CAMBIARORDEN = "Clas_1431633788928040Ser_6_Alias";
    /** <code>cambiarOrden</code> service name. */
    public static final String SERV_NAME_CAMBIARORDEN = "cambiarOrden";
    /** <code>cambiarOrden</code> service alias. */
    public static final String SERV_ALIAS_CAMBIARORDEN = "cambiarOrden";
    /** Agents allowed to execute the service cambiarOrden **/
    public static final String CAMBIARORDEN_SRVAGENTS = "";
    // Inbound arguments
    /** <code>preguntacambiarOrdenpthisPregunta</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARORDEN_PREGUNTACAMBIARORDENPTHISPREGUNTA = "p_thisPregunta";
    /** <code>preguntacambiarOrdenpthisPregunta</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARORDEN_PREGUNTACAMBIARORDENPTHISPREGUNTA = "Clas_1431633788928040Ser_6Arg_1_Alias";
    /** <code>preguntacambiarOrdenpthisPregunta</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARORDEN_PREGUNTACAMBIARORDENPTHISPREGUNTA = "Pregunta";
    /** <code>preguntacambiarOrdenpNuevoOrden</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARORDEN_PREGUNTACAMBIARORDENPNUEVOORDEN = "p_NuevoOrden";
    /** <code>preguntacambiarOrdenpNuevoOrden</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARORDEN_PREGUNTACAMBIARORDENPNUEVOORDEN = "Clas_1431633788928040Ser_6Arg_2_Alias";
    /** <code>preguntacambiarOrdenpNuevoOrden</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARORDEN_PREGUNTACAMBIARORDENPNUEVOORDEN = "Nuevo orden";
    // Service (InsValorPregunta)
    /** <code>InsValorPregunta</code> service id. */
    public static final String SERV_ID_INSVALORPREGUNTA = "Clas_1431633788928040Ser_4_Alias";
    /** <code>InsValorPregunta</code> service name. */
    public static final String SERV_NAME_INSVALORPREGUNTA = "InsValorPregunta";
    /** <code>InsValorPregunta</code> service alias. */
    public static final String SERV_ALIAS_INSVALORPREGUNTA = "Añadir posible valor";
    /** Agents allowed to execute the service InsValorPregunta **/
    public static final String INSVALORPREGUNTA_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>preguntaInsValorPreguntapthisPregunta</code> inbound argument name. */
    public static final String ARG_NAME_INSVALORPREGUNTA_PREGUNTAINSVALORPREGUNTAPTHISPREGUNTA = "p_thisPregunta";
    /** <code>preguntaInsValorPreguntapthisPregunta</code> inbound argument id. */
    public static final String ARG_ID_INSVALORPREGUNTA_PREGUNTAINSVALORPREGUNTAPTHISPREGUNTA = "Clas_1431633788928040Ser_4Arg_1_Alias";
    /** <code>preguntaInsValorPreguntapthisPregunta</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSVALORPREGUNTA_PREGUNTAINSVALORPREGUNTAPTHISPREGUNTA = "Pregunta";
    /** <code>preguntaInsValorPreguntapevcValor</code> inbound argument name. */
    public static final String ARG_NAME_INSVALORPREGUNTA_PREGUNTAINSVALORPREGUNTAPEVCVALOR = "p_evcValor";
    /** <code>preguntaInsValorPreguntapevcValor</code> inbound argument id. */
    public static final String ARG_ID_INSVALORPREGUNTA_PREGUNTAINSVALORPREGUNTAPEVCVALOR = "Clas_1431633788928040Ser_4Arg_2_Alias";
    /** <code>preguntaInsValorPreguntapevcValor</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSVALORPREGUNTA_PREGUNTAINSVALORPREGUNTAPEVCVALOR = "Valor/es";
    // Service (DelValorPregunta)
    /** <code>DelValorPregunta</code> service id. */
    public static final String SERV_ID_DELVALORPREGUNTA = "Clas_1431633788928040Ser_5_Alias";
    /** <code>DelValorPregunta</code> service name. */
    public static final String SERV_NAME_DELVALORPREGUNTA = "DelValorPregunta";
    /** <code>DelValorPregunta</code> service alias. */
    public static final String SERV_ALIAS_DELVALORPREGUNTA = "Quitar posible valor";
    /** Agents allowed to execute the service DelValorPregunta **/
    public static final String DELVALORPREGUNTA_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>preguntaDelValorPreguntapthisPregunta</code> inbound argument name. */
    public static final String ARG_NAME_DELVALORPREGUNTA_PREGUNTADELVALORPREGUNTAPTHISPREGUNTA = "p_thisPregunta";
    /** <code>preguntaDelValorPreguntapthisPregunta</code> inbound argument id. */
    public static final String ARG_ID_DELVALORPREGUNTA_PREGUNTADELVALORPREGUNTAPTHISPREGUNTA = "Clas_1431633788928040Ser_5Arg_1_Alias";
    /** <code>preguntaDelValorPreguntapthisPregunta</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELVALORPREGUNTA_PREGUNTADELVALORPREGUNTAPTHISPREGUNTA = "Pregunta";
    /** <code>preguntaDelValorPreguntapevcValor</code> inbound argument name. */
    public static final String ARG_NAME_DELVALORPREGUNTA_PREGUNTADELVALORPREGUNTAPEVCVALOR = "p_evcValor";
    /** <code>preguntaDelValorPreguntapevcValor</code> inbound argument id. */
    public static final String ARG_ID_DELVALORPREGUNTA_PREGUNTADELVALORPREGUNTAPEVCVALOR = "Clas_1431633788928040Ser_5Arg_2_Alias";
    /** <code>preguntaDelValorPreguntapevcValor</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELVALORPREGUNTA_PREGUNTADELVALORPREGUNTAPEVCVALOR = "Valor";
    // Service (CambSeccionPregunta)
    /** <code>CambSeccionPregunta</code> service id. */
    public static final String SERV_ID_CAMBSECCIONPREGUNTA = "Clas_1431633788928040Ser_10_Alias";
    /** <code>CambSeccionPregunta</code> service name. */
    public static final String SERV_NAME_CAMBSECCIONPREGUNTA = "CambSeccionPregunta";
    /** <code>CambSeccionPregunta</code> service alias. */
    public static final String SERV_ALIAS_CAMBSECCIONPREGUNTA = "CambSeccionPregunta";
    /** Agents allowed to execute the service CambSeccionPregunta **/
    public static final String CAMBSECCIONPREGUNTA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>preguntaCambSeccionPreguntapthisPregunta</code> inbound argument name. */
    public static final String ARG_NAME_CAMBSECCIONPREGUNTA_PREGUNTACAMBSECCIONPREGUNTAPTHISPREGUNTA = "p_thisPregunta";
    /** <code>preguntaCambSeccionPreguntapthisPregunta</code> inbound argument id. */
    public static final String ARG_ID_CAMBSECCIONPREGUNTA_PREGUNTACAMBSECCIONPREGUNTAPTHISPREGUNTA = "Clas_1431633788928040Ser_10Arg_1_Alias";
    /** <code>preguntaCambSeccionPreguntapthisPregunta</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBSECCIONPREGUNTA_PREGUNTACAMBSECCIONPREGUNTAPTHISPREGUNTA = "Preguntas";
    /** <code>preguntaCambSeccionPreguntapevcSeccion</code> inbound argument name. */
    public static final String ARG_NAME_CAMBSECCIONPREGUNTA_PREGUNTACAMBSECCIONPREGUNTAPEVCSECCION = "p_evcSeccion";
    /** <code>preguntaCambSeccionPreguntapevcSeccion</code> inbound argument id. */
    public static final String ARG_ID_CAMBSECCIONPREGUNTA_PREGUNTACAMBSECCIONPREGUNTAPEVCSECCION = "Clas_1431633788928040Ser_10Arg_2_Alias";
    /** <code>preguntaCambSeccionPreguntapevcSeccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBSECCIONPREGUNTA_PREGUNTACAMBSECCIONPREGUNTAPEVCSECCION = "Sección";
    // Service (InsPreguntaAPersona)
    /** <code>InsPreguntaAPersona</code> service id. */
    public static final String SERV_ID_INSPREGUNTAAPERSONA = "Clas_1431633788928040Ser_11_Alias";
    /** <code>InsPreguntaAPersona</code> service name. */
    public static final String SERV_NAME_INSPREGUNTAAPERSONA = "InsPreguntaAPersona";
    /** <code>InsPreguntaAPersona</code> service alias. */
    public static final String SERV_ALIAS_INSPREGUNTAAPERSONA = "InsPreguntaAPersona";
    /** Agents allowed to execute the service InsPreguntaAPersona **/
    public static final String INSPREGUNTAAPERSONA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>preguntaInsPreguntaAPersonapthisPregunta</code> inbound argument name. */
    public static final String ARG_NAME_INSPREGUNTAAPERSONA_PREGUNTAINSPREGUNTAAPERSONAPTHISPREGUNTA = "p_thisPregunta";
    /** <code>preguntaInsPreguntaAPersonapthisPregunta</code> inbound argument id. */
    public static final String ARG_ID_INSPREGUNTAAPERSONA_PREGUNTAINSPREGUNTAAPERSONAPTHISPREGUNTA = "Clas_1431633788928040Ser_11Arg_1_Alias";
    /** <code>preguntaInsPreguntaAPersonapthisPregunta</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPREGUNTAAPERSONA_PREGUNTAINSPREGUNTAAPERSONAPTHISPREGUNTA = "Pregunta";
    /** <code>preguntaInsPreguntaAPersonapevcPreguntaP</code> inbound argument name. */
    public static final String ARG_NAME_INSPREGUNTAAPERSONA_PREGUNTAINSPREGUNTAAPERSONAPEVCPREGUNTAP = "p_evcPreguntaP";
    /** <code>preguntaInsPreguntaAPersonapevcPreguntaP</code> inbound argument id. */
    public static final String ARG_ID_INSPREGUNTAAPERSONA_PREGUNTAINSPREGUNTAAPERSONAPEVCPREGUNTAP = "Clas_1431633788928040Ser_11Arg_2_Alias";
    /** <code>preguntaInsPreguntaAPersonapevcPreguntaP</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPREGUNTAAPERSONA_PREGUNTAINSPREGUNTAAPERSONAPEVCPREGUNTAP = "Preguntas persona";
    // Service (DelPreguntaDePersona)
    /** <code>DelPreguntaDePersona</code> service id. */
    public static final String SERV_ID_DELPREGUNTADEPERSONA = "Clas_1431633788928040Ser_12_Alias";
    /** <code>DelPreguntaDePersona</code> service name. */
    public static final String SERV_NAME_DELPREGUNTADEPERSONA = "DelPreguntaDePersona";
    /** <code>DelPreguntaDePersona</code> service alias. */
    public static final String SERV_ALIAS_DELPREGUNTADEPERSONA = "DelPreguntaDePersona";
    /** Agents allowed to execute the service DelPreguntaDePersona **/
    public static final String DELPREGUNTADEPERSONA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>preguntaDelPreguntaDePersonapthisPregunta</code> inbound argument name. */
    public static final String ARG_NAME_DELPREGUNTADEPERSONA_PREGUNTADELPREGUNTADEPERSONAPTHISPREGUNTA = "p_thisPregunta";
    /** <code>preguntaDelPreguntaDePersonapthisPregunta</code> inbound argument id. */
    public static final String ARG_ID_DELPREGUNTADEPERSONA_PREGUNTADELPREGUNTADEPERSONAPTHISPREGUNTA = "Clas_1431633788928040Ser_12Arg_1_Alias";
    /** <code>preguntaDelPreguntaDePersonapthisPregunta</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPREGUNTADEPERSONA_PREGUNTADELPREGUNTADEPERSONAPTHISPREGUNTA = "Pregunta";
    /** <code>preguntaDelPreguntaDePersonapevcPreguntaP</code> inbound argument name. */
    public static final String ARG_NAME_DELPREGUNTADEPERSONA_PREGUNTADELPREGUNTADEPERSONAPEVCPREGUNTAP = "p_evcPreguntaP";
    /** <code>preguntaDelPreguntaDePersonapevcPreguntaP</code> inbound argument id. */
    public static final String ARG_ID_DELPREGUNTADEPERSONA_PREGUNTADELPREGUNTADEPERSONAPEVCPREGUNTAP = "Clas_1431633788928040Ser_12Arg_2_Alias";
    /** <code>preguntaDelPreguntaDePersonapevcPreguntaP</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPREGUNTADEPERSONA_PREGUNTADELPREGUNTADEPERSONAPEVCPREGUNTAP = "Preguntas persona";
    // Service (TCREAR)
    /** <code>TCREAR</code> service id. */
    public static final String SERV_ID_TCREAR = "Clas_1431633788928040Ser_7_Alias";
    /** <code>TCREAR</code> service name. */
    public static final String SERV_NAME_TCREAR = "TCREAR";
    /** <code>TCREAR</code> service alias. */
    public static final String SERV_ALIAS_TCREAR = "Crear pregunta";
    /** Agents allowed to execute the service TCREAR **/
    public static final String TCREAR_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>TCREAR</code> precondition 0 id. */
    public static final String PRE_ID_TCREAR_0 = "Clas_1431633788928040Pre_1_MsgError";
    /** <code>TCREAR</code> precondition 1 id. */
    public static final String PRE_ID_TCREAR_1 = "Clas_1431633788928040Pre_3_MsgError";
    /** <code>TCREAR</code> precondition 2 id. */
    public static final String PRE_ID_TCREAR_2 = "Clas_1431633788928040Pre_4_MsgError";
    // Inbound arguments
    /** <code>preguntaTCREARptpagrSeccion</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_PREGUNTATCREARPTPAGRSECCION = "pt_p_agrSeccion";
    /** <code>preguntaTCREARptpagrSeccion</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_PREGUNTATCREARPTPAGRSECCION = "Clas_1431633788928040Ser_7Arg_3_Alias";
    /** <code>preguntaTCREARptpagrSeccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_PREGUNTATCREARPTPAGRSECCION = "Sección";
    /** <code>preguntaTCREARptpatrNumero</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_PREGUNTATCREARPTPATRNUMERO = "pt_p_atrNumero";
    /** <code>preguntaTCREARptpatrNumero</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_PREGUNTATCREARPTPATRNUMERO = "Clas_1431633788928040Ser_7Arg_4_Alias";
    /** <code>preguntaTCREARptpatrNumero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_PREGUNTATCREARPTPATRNUMERO = "Número";
    /** <code>preguntaTCREARptpatrNumOrden</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_PREGUNTATCREARPTPATRNUMORDEN = "pt_p_atrNumOrden";
    /** <code>preguntaTCREARptpatrNumOrden</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_PREGUNTATCREARPTPATRNUMORDEN = "Clas_1431633788928040Ser_7Arg_5_Alias";
    /** <code>preguntaTCREARptpatrNumOrden</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_PREGUNTATCREARPTPATRNUMORDEN = "Nº orden";
    /** <code>preguntaTCREARptpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_PREGUNTATCREARPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    /** <code>preguntaTCREARptpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_PREGUNTATCREARPTPATRDESCRIPCION = "Clas_1431633788928040Ser_7Arg_6_Alias";
    /** <code>preguntaTCREARptpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_PREGUNTATCREARPTPATRDESCRIPCION = "Descripción";
    /** <code>preguntaTCREARptpatrValorSNObliga</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_PREGUNTATCREARPTPATRVALORSNOBLIGA = "pt_p_atrValorSNObliga";
    /** <code>preguntaTCREARptpatrValorSNObliga</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_PREGUNTATCREARPTPATRVALORSNOBLIGA = "Clas_1431633788928040Ser_7Arg_7_Alias";
    /** <code>preguntaTCREARptpatrValorSNObliga</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_PREGUNTATCREARPTPATRVALORSNOBLIGA = "Si/No Obligatorio";
    /** <code>preguntaTCREARptpatrObsOblig</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_PREGUNTATCREARPTPATROBSOBLIG = "pt_p_atrObsOblig";
    /** <code>preguntaTCREARptpatrObsOblig</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_PREGUNTATCREARPTPATROBSOBLIG = "Clas_1431633788928040Ser_7Arg_8_Alias";
    /** <code>preguntaTCREARptpatrObsOblig</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_PREGUNTATCREARPTPATROBSOBLIG = "Obs. Obligatoria";
    /** <code>preguntaTCREARptpatrEsNumero</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_PREGUNTATCREARPTPATRESNUMERO = "pt_p_atrEsNumero";
    /** <code>preguntaTCREARptpatrEsNumero</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_PREGUNTATCREARPTPATRESNUMERO = "Clas_1431633788928040Ser_7Arg_9_Alias";
    /** <code>preguntaTCREARptpatrEsNumero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_PREGUNTATCREARPTPATRESNUMERO = "Es número";
    /** <code>preguntaTCREARptpatrValorMax</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_PREGUNTATCREARPTPATRVALORMAX = "pt_p_atrValorMax";
    /** <code>preguntaTCREARptpatrValorMax</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_PREGUNTATCREARPTPATRVALORMAX = "Clas_1431633788928040Ser_7Arg_10_Alias";
    /** <code>preguntaTCREARptpatrValorMax</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_PREGUNTATCREARPTPATRVALORMAX = "Valor máximo";
    /** <code>preguntaTCREARptpatrValorMin</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_PREGUNTATCREARPTPATRVALORMIN = "pt_p_atrValorMin";
    /** <code>preguntaTCREARptpatrValorMin</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_PREGUNTATCREARPTPATRVALORMIN = "Clas_1431633788928040Ser_7Arg_11_Alias";
    /** <code>preguntaTCREARptpatrValorMin</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_PREGUNTATCREARPTPATRVALORMIN = "Valor mínimo";
    /** <code>preguntaTCREARptpatrSoloHombres</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_PREGUNTATCREARPTPATRSOLOHOMBRES = "pt_p_atrSoloHombres";
    /** <code>preguntaTCREARptpatrSoloHombres</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_PREGUNTATCREARPTPATRSOLOHOMBRES = "Clas_1431633788928040Ser_7Arg_12_Alias";
    /** <code>preguntaTCREARptpatrSoloHombres</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_PREGUNTATCREARPTPATRSOLOHOMBRES = "Solo hombres";
    /** <code>preguntaTCREARptpatrSoloMujeres</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_PREGUNTATCREARPTPATRSOLOMUJERES = "pt_p_atrSoloMujeres";
    /** <code>preguntaTCREARptpatrSoloMujeres</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_PREGUNTATCREARPTPATRSOLOMUJERES = "Clas_1431633788928040Ser_7Arg_13_Alias";
    /** <code>preguntaTCREARptpatrSoloMujeres</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_PREGUNTATCREARPTPATRSOLOMUJERES = "Solo mujeres";
    /** <code>preguntaTCREARptpatrRespMultiple</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_PREGUNTATCREARPTPATRRESPMULTIPLE = "pt_p_atrRespMultiple";
    /** <code>preguntaTCREARptpatrRespMultiple</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_PREGUNTATCREARPTPATRRESPMULTIPLE = "Clas_1431633788928040Ser_7Arg_15_Alias";
    /** <code>preguntaTCREARptpatrRespMultiple</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_PREGUNTATCREARPTPATRRESPMULTIPLE = "Resp. múltiple";
    /** <code>preguntaTCREARptpatrSeEnviaAlCORE</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_PREGUNTATCREARPTPATRSEENVIAALCORE = "pt_p_atrSeEnviaAlCORE";
    /** <code>preguntaTCREARptpatrSeEnviaAlCORE</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_PREGUNTATCREARPTPATRSEENVIAALCORE = "Clas_1431633788928040Ser_7Arg_1878_Alias";
    /** <code>preguntaTCREARptpatrSeEnviaAlCORE</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_PREGUNTATCREARPTPATRSEENVIAALCORE = "Se envía al CORE";
    /** <code>preguntaTCREARptpatrCondicionEdad</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_PREGUNTATCREARPTPATRCONDICIONEDAD = "pt_p_atrCondicionEdad";
    /** <code>preguntaTCREARptpatrCondicionEdad</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_PREGUNTATCREARPTPATRCONDICIONEDAD = "Clas_1431633788928040Ser_7Arg_5454_Alias";
    /** <code>preguntaTCREARptpatrCondicionEdad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_PREGUNTATCREARPTPATRCONDICIONEDAD = "Condicionada por edad";
    /** <code>preguntaTCREARptpatrCondicionEdadAnyos</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_PREGUNTATCREARPTPATRCONDICIONEDADANYOS = "pt_p_atrCondicionEdadAnyos";
    /** <code>preguntaTCREARptpatrCondicionEdadAnyos</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_PREGUNTATCREARPTPATRCONDICIONEDADANYOS = "Clas_1431633788928040Ser_7Arg_5455_Alias";
    /** <code>preguntaTCREARptpatrCondicionEdadAnyos</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_PREGUNTATCREARPTPATRCONDICIONEDADANYOS = "Condicionada por edad";
    // Service (TMODIFICAR)
    /** <code>TMODIFICAR</code> service id. */
    public static final String SERV_ID_TMODIFICAR = "Clas_1431633788928040Ser_8_Alias";
    /** <code>TMODIFICAR</code> service name. */
    public static final String SERV_NAME_TMODIFICAR = "TMODIFICAR";
    /** <code>TMODIFICAR</code> service alias. */
    public static final String SERV_ALIAS_TMODIFICAR = "Modificar pregunta";
    /** Agents allowed to execute the service TMODIFICAR **/
    public static final String TMODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>TMODIFICAR</code> precondition 0 id. */
    public static final String PRE_ID_TMODIFICAR_0 = "Clas_1431633788928040Pre_2_MsgError";
    /** <code>TMODIFICAR</code> precondition 1 id. */
    public static final String PRE_ID_TMODIFICAR_1 = "Clas_1431633788928040Pre_5_MsgError";
    // Inbound arguments
    /** <code>preguntaTMODIFICARpthisPregunta</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_PREGUNTATMODIFICARPTHISPREGUNTA = "p_thisPregunta";
    /** <code>preguntaTMODIFICARpthisPregunta</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_PREGUNTATMODIFICARPTHISPREGUNTA = "Clas_1431633788928040Ser_8Arg_1_Alias";
    /** <code>preguntaTMODIFICARpthisPregunta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_PREGUNTATMODIFICARPTHISPREGUNTA = "Pregunta";
    /** <code>preguntaTMODIFICARptpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_PREGUNTATMODIFICARPTPDESCRIPCION = "pt_p_Descripcion";
    /** <code>preguntaTMODIFICARptpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_PREGUNTATMODIFICARPTPDESCRIPCION = "Clas_1431633788928040Ser_8Arg_2_Alias";
    /** <code>preguntaTMODIFICARptpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_PREGUNTATMODIFICARPTPDESCRIPCION = "Descripción";
    /** <code>preguntaTMODIFICARptpValorSNObliga</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_PREGUNTATMODIFICARPTPVALORSNOBLIGA = "pt_p_ValorSNObliga";
    /** <code>preguntaTMODIFICARptpValorSNObliga</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_PREGUNTATMODIFICARPTPVALORSNOBLIGA = "Clas_1431633788928040Ser_8Arg_3_Alias";
    /** <code>preguntaTMODIFICARptpValorSNObliga</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_PREGUNTATMODIFICARPTPVALORSNOBLIGA = "Si/No Obligatorio";
    /** <code>preguntaTMODIFICARptpObsOblig</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_PREGUNTATMODIFICARPTPOBSOBLIG = "pt_p_ObsOblig";
    /** <code>preguntaTMODIFICARptpObsOblig</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_PREGUNTATMODIFICARPTPOBSOBLIG = "Clas_1431633788928040Ser_8Arg_4_Alias";
    /** <code>preguntaTMODIFICARptpObsOblig</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_PREGUNTATMODIFICARPTPOBSOBLIG = "Obs. Obligatoria";
    /** <code>preguntaTMODIFICARptpEsNumero</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_PREGUNTATMODIFICARPTPESNUMERO = "pt_p_EsNumero";
    /** <code>preguntaTMODIFICARptpEsNumero</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_PREGUNTATMODIFICARPTPESNUMERO = "Clas_1431633788928040Ser_8Arg_5_Alias";
    /** <code>preguntaTMODIFICARptpEsNumero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_PREGUNTATMODIFICARPTPESNUMERO = "Es número";
    /** <code>preguntaTMODIFICARptpValorMax</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_PREGUNTATMODIFICARPTPVALORMAX = "pt_p_ValorMax";
    /** <code>preguntaTMODIFICARptpValorMax</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_PREGUNTATMODIFICARPTPVALORMAX = "Clas_1431633788928040Ser_8Arg_6_Alias";
    /** <code>preguntaTMODIFICARptpValorMax</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_PREGUNTATMODIFICARPTPVALORMAX = "Valor máximo";
    /** <code>preguntaTMODIFICARptpValorMin</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_PREGUNTATMODIFICARPTPVALORMIN = "pt_p_ValorMin";
    /** <code>preguntaTMODIFICARptpValorMin</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_PREGUNTATMODIFICARPTPVALORMIN = "Clas_1431633788928040Ser_8Arg_7_Alias";
    /** <code>preguntaTMODIFICARptpValorMin</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_PREGUNTATMODIFICARPTPVALORMIN = "Valor mínimo";
    /** <code>preguntaTMODIFICARptpSoloHombres</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_PREGUNTATMODIFICARPTPSOLOHOMBRES = "pt_p_SoloHombres";
    /** <code>preguntaTMODIFICARptpSoloHombres</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_PREGUNTATMODIFICARPTPSOLOHOMBRES = "Clas_1431633788928040Ser_8Arg_8_Alias";
    /** <code>preguntaTMODIFICARptpSoloHombres</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_PREGUNTATMODIFICARPTPSOLOHOMBRES = "Solo hombres";
    /** <code>preguntaTMODIFICARptpSoloMujeres</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_PREGUNTATMODIFICARPTPSOLOMUJERES = "pt_p_SoloMujeres";
    /** <code>preguntaTMODIFICARptpSoloMujeres</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_PREGUNTATMODIFICARPTPSOLOMUJERES = "Clas_1431633788928040Ser_8Arg_9_Alias";
    /** <code>preguntaTMODIFICARptpSoloMujeres</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_PREGUNTATMODIFICARPTPSOLOMUJERES = "Solo mujeres";
    /** <code>preguntaTMODIFICARptpRespMultiple</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_PREGUNTATMODIFICARPTPRESPMULTIPLE = "pt_p_RespMultiple";
    /** <code>preguntaTMODIFICARptpRespMultiple</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_PREGUNTATMODIFICARPTPRESPMULTIPLE = "Clas_1431633788928040Ser_8Arg_11_Alias";
    /** <code>preguntaTMODIFICARptpRespMultiple</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_PREGUNTATMODIFICARPTPRESPMULTIPLE = "Resp. múltiple";
    /** <code>preguntaTMODIFICARptpNuevoOrden</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_PREGUNTATMODIFICARPTPNUEVOORDEN = "pt_p_NuevoOrden";
    /** <code>preguntaTMODIFICARptpNuevoOrden</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_PREGUNTATMODIFICARPTPNUEVOORDEN = "Clas_1431633788928040Ser_8Arg_12_Alias";
    /** <code>preguntaTMODIFICARptpNuevoOrden</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_PREGUNTATMODIFICARPTPNUEVOORDEN = "Nuevo orden";
    /** <code>preguntaTMODIFICARptpevcSeccion</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_PREGUNTATMODIFICARPTPEVCSECCION = "pt_p_evcSeccion";
    /** <code>preguntaTMODIFICARptpevcSeccion</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_PREGUNTATMODIFICARPTPEVCSECCION = "Clas_1431633788928040Ser_8Arg_13_Alias";
    /** <code>preguntaTMODIFICARptpevcSeccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_PREGUNTATMODIFICARPTPEVCSECCION = "Sección";
    /** <code>preguntaTMODIFICARptpSeEnviaAlCORE</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_PREGUNTATMODIFICARPTPSEENVIAALCORE = "pt_p_SeEnviaAlCORE";
    /** <code>preguntaTMODIFICARptpSeEnviaAlCORE</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_PREGUNTATMODIFICARPTPSEENVIAALCORE = "Clas_1431633788928040Ser_8Arg_15_Alias";
    /** <code>preguntaTMODIFICARptpSeEnviaAlCORE</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_PREGUNTATMODIFICARPTPSEENVIAALCORE = "Se envía al CORE";
    /** <code>preguntaTMODIFICARptpCondicionEdad</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_PREGUNTATMODIFICARPTPCONDICIONEDAD = "pt_p_CondicionEdad";
    /** <code>preguntaTMODIFICARptpCondicionEdad</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_PREGUNTATMODIFICARPTPCONDICIONEDAD = "Clas_1431633788928040Ser_8Arg_16_Alias";
    /** <code>preguntaTMODIFICARptpCondicionEdad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_PREGUNTATMODIFICARPTPCONDICIONEDAD = "Condicionada por edad";
    /** <code>preguntaTMODIFICARptpCondicionEdadAnyos</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_PREGUNTATMODIFICARPTPCONDICIONEDADANYOS = "pt_p_CondicionEdadAnyos";
    /** <code>preguntaTMODIFICARptpCondicionEdadAnyos</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_PREGUNTATMODIFICARPTPCONDICIONEDADANYOS = "Clas_1431633788928040Ser_8Arg_17_Alias";
    /** <code>preguntaTMODIFICARptpCondicionEdadAnyos</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_PREGUNTATMODIFICARPTPCONDICIONEDADANYOS = "Condicionada por edad";
    // Service (TELIMINAR)
    /** <code>TELIMINAR</code> service id. */
    public static final String SERV_ID_TELIMINAR = "Clas_1431633788928040Ser_9_Alias";
    /** <code>TELIMINAR</code> service name. */
    public static final String SERV_NAME_TELIMINAR = "TELIMINAR";
    /** <code>TELIMINAR</code> service alias. */
    public static final String SERV_ALIAS_TELIMINAR = "Eliminar pregunta";
    /** Agents allowed to execute the service TELIMINAR **/
    public static final String TELIMINAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>preguntaTELIMINARpthisPregunta</code> inbound argument name. */
    public static final String ARG_NAME_TELIMINAR_PREGUNTATELIMINARPTHISPREGUNTA = "p_thisPregunta";
    /** <code>preguntaTELIMINARpthisPregunta</code> inbound argument id. */
    public static final String ARG_ID_TELIMINAR_PREGUNTATELIMINARPTHISPREGUNTA = "Clas_1431633788928040Ser_9Arg_1_Alias";
    /** <code>preguntaTELIMINARpthisPregunta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TELIMINAR_PREGUNTATELIMINARPTHISPREGUNTA = "Pregunta";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_PREGUNTANUMORDEN.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_PREGUNTADESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PREGUNTAVALORSNOBLIGA.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PREGUNTAOBSOBLIG.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PREGUNTAESNUMERO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PREGUNTAVALORMAX.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_PREGUNTAVALORMIN.toUpperCase(), Constants.Type.REAL.getTypeName());
        attributeTypes.put(ATTR_NAME_PREGUNTASOLOHOMBRES.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PREGUNTASOLOMUJERES.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PREGUNTARESPMULTIPLE.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PREGUNTADRVVALORESPOSIBLES.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PREGUNTASEENVIAALCORE.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PREGUNTACONDICIONEDAD.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_PREGUNTACONDICIONEDADANYOS.toUpperCase(), Constants.Type.NAT.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_PREGUNTANUMERO.toUpperCase(), PREGUNTANUMERO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PREGUNTANUMORDEN.toUpperCase(), PREGUNTANUMORDEN_AGENTS);
    	attributeAgents.put(ATTR_NAME_PREGUNTADESCRIPCION.toUpperCase(), PREGUNTADESCRIPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_PREGUNTAVALORSNOBLIGA.toUpperCase(), PREGUNTAVALORSNOBLIGA_AGENTS);
    	attributeAgents.put(ATTR_NAME_PREGUNTAOBSOBLIG.toUpperCase(), PREGUNTAOBSOBLIG_AGENTS);
    	attributeAgents.put(ATTR_NAME_PREGUNTAESNUMERO.toUpperCase(), PREGUNTAESNUMERO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PREGUNTAVALORMAX.toUpperCase(), PREGUNTAVALORMAX_AGENTS);
    	attributeAgents.put(ATTR_NAME_PREGUNTAVALORMIN.toUpperCase(), PREGUNTAVALORMIN_AGENTS);
    	attributeAgents.put(ATTR_NAME_PREGUNTASOLOHOMBRES.toUpperCase(), PREGUNTASOLOHOMBRES_AGENTS);
    	attributeAgents.put(ATTR_NAME_PREGUNTASOLOMUJERES.toUpperCase(), PREGUNTASOLOMUJERES_AGENTS);
    	attributeAgents.put(ATTR_NAME_PREGUNTARESPMULTIPLE.toUpperCase(), PREGUNTARESPMULTIPLE_AGENTS);
    	attributeAgents.put(ATTR_NAME_PREGUNTADRVVALORESPOSIBLES.toUpperCase(), PREGUNTADRVVALORESPOSIBLES_AGENTS);
    	attributeAgents.put(ATTR_NAME_PREGUNTASEENVIAALCORE.toUpperCase(), PREGUNTASEENVIAALCORE_AGENTS);
    	attributeAgents.put(ATTR_NAME_PREGUNTACONDICIONEDAD.toUpperCase(), PREGUNTACONDICIONEDAD_AGENTS);
    	attributeAgents.put(ATTR_NAME_PREGUNTACONDICIONEDADANYOS.toUpperCase(), PREGUNTACONDICIONEDADANYOS_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_SECCION.toUpperCase(), SECCION_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'Pregunta', it returns the identification keys
     * - If className is a facet of the inheritance net of 'Pregunta', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_PREGUNTANUMERO);
        }
        // Facet 'Pregunta' (This facet)
        if (PreguntaConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_PREGUNTANUMERO);
        }
        return returnList;
    }
}
